/*============================================================
 3桁ごとに,を挟む桁計算及び2つの変数を結合数値を返す
理論上は2,000,000,000,000,000,000 まで扱える
上位変数が無い場合は0入力
set .@dammy$,callfunc ("Sistem_Digit",下位変数,上位変数);
------------------------------------------------------------*/
function	script	Sistem_Digit	{

	if(getarg(1))
		set .@for,3;
	else
		set .@for,2;

	for(set .@b, 1; .@b < .@for; set .@b, .@b + 1){

		set .@number,getarg(.@b - 1);
		set .@digit,0;
		set .@dammy,.@number;
		setarray .@digit_number[1],-1,-1,-1,-1,-1,-1,-1,-1,-1,-1;
		while(.@dammy != 0){	//桁数を計算
			set .@dammy,.@dammy / 10;
			set .@digit,.@digit + 1;
		}

		set .@num,1;
		for(set .@i, 1; .@i < .@digit; set .@i, .@i + 1){
			set .@num,.@num * 10;
		}

		set .@digit2,.@digit;
		for(set .@i, 0; .@i < .@digit; set .@i, .@i + 1){
			set .@dammy,0;
			while(1){
				if(.@number < .@num)
					break;
				set .@number,.@number - .@num;
				set .@dammy,.@dammy + 1;
			}
			set .@digit_number[.@digit2],.@dammy;
			set .@digit2,.@digit2 - 1;
			set .@num,.@num / 10;
		}

		set .@digit2,.@digit;
		set .@digit$[.@b],"";

		switch(.@digit % 3){
			case 0: set .@count,3; break;
			case 1: set .@count,1; break;
			case 2: set .@count,2; break;
		}

		for(set .@i, 0; .@i < .@digit; set .@i, .@i + 1){
			if(.@i && !.@count){
				set .@digit$[.@b],.@digit$[.@b]+",";
				set .@count,3;
			}

			set .@digit$[.@b],.@digit$[.@b] + .@digit_number[.@digit2 - .@i];
			set .@count,.@count - 1;
		}
	}

	if(getarg(1)){
		set .@number,getarg(0);
		set .@digit,0;
		while(.@number != 0){	//桁数を計算
			set .@number,.@number / 10;
			set .@digit,.@digit + 1;
		}

		switch(.@digit){
			case 0: set .@digit$[3],",000,000,000"; break;
			case 1:	set .@digit$[3],",000,000,00"; break;
			case 2:	set .@digit$[3],",000,000,0"; break;
			case 3:	set .@digit$[3],",000,000,"; break;
			case 4:	set .@digit$[3],",000,00"; break;
			case 5:	set .@digit$[3],",000,0"; break;
			case 6:	set .@digit$[3],",000,"; break;
			case 7:	set .@digit$[3],",00"; break;
			case 8:	set .@digit$[3],",0"; break;
			case 9:	set .@digit$[3],","; break;
		}
		set .@digit$,.@digit$[2]+.@digit$[3]+.@digit$[1];
	} else {
		set .@digit$,.@digit$[1];
	}

	return .@digit$;

}

/*============================================================
所持品ロード<インデックス>　<Ver,1.0>
set .@dammy,callfunc ("Load_inventorylist","確認アイテムID","確認数");
所持してなかったり個人タブ・装備品の場合は-1を返す
それ以外はインデックスを返す
**インデックスとは？所持品の配列位置の事
------------------------------------------------------------*/
function	script	Load_inventorylist	{

	set .@check_id,getarg(0);
	set .@check_count,getarg(1);
	set .@list_count,0;

	if(countitem(.@check_id) < .@check_count)	//簡易チェック、所持してなければ-1を返す
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;
	
	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "所持アイテム数が多すぎます";
		mes "所持品を減らしてから来てください";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//個人タブ・装備品から絶対数をマイナスする
		if(.@check_id == @inventorylist_id[.@i]){
			if(!@inventorylist_equip[.@i] && !@inventorylist_private[.@i])
				set .@list_count,.@list_count + @inventorylist_amount[.@i];
		}
	}

	if(.@list_count < .@check_count)	//再チェック
		return -1;

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//再検索をかけて、個人タブ・装備品以外のインデックスを返す
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_equip[.@i] || @inventorylist_private[.@i])
				continue;
			return @inventorylist_index[.@i];
		}
	}

	return -1;	//インデックスに引っかからなかった場合も-1を返す

}

/*============================================================
所持品ロード<所持数>　<Ver,1.0>
set .@dammy,callfunc ("Load_amount","確認アイテムID");
個人タブ・装備品以外のアイテムの個数を返す
------------------------------------------------------------*/
function	script	Load_amount	{

	set .@check_id,getarg(0);
	set .@list_count,0;
	set .@list_count,0;
	set .@dammy,0;

	if(!countitem(.@check_id))	//簡易チェック、所持してなければ-1を返す
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "所持アイテム数が多すぎます";
		mes "所持品を減らしてから来てください";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//個人タブ・装備品から絶対数をマイナスする
		if(.@check_id == @inventorylist_id[.@i]){
			if(!@inventorylist_equip[.@i] && !@inventorylist_private[.@i])
				set .@list_count,.@list_count + @inventorylist_amount[.@i];
		}
	}

	return .@list_count;

}

/*============================================================
所持品ロード<精錬値>　<Ver,1.0>
set .@dammy,callfunc ("Load_refinet","確認アイテムID","精錬値");
個人タブ・装備品以外のアイテムの指定精錬値以上のアイテムのインデックスを返す
------------------------------------------------------------*/
function	script	Load_refine	{

	set .@check_id,getarg(0);
	set .@check_refine,getarg(1);
	set .@list_count,countitem(.@check_id);

	if(!.@list_count)	//簡易チェック、所持してなければ-1を返す
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "所持アイテム数が多すぎます";
		mes "所持品を減らしてから来てください";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_equip[.@i] || @inventorylist_private[.@i])
				continue;
			if(.@check_refine > @inventorylist_refine[.@i])
				continue;

			return @inventorylist_index[.@i];
		}
	}

	return -1;	//インデックスに引っかからなかった場合も-1を返す

}
/*============================================================
所持品ロード<レンタル>　<Ver,1.0>
callfunc ("Load_Limit_Item","確認アイテムID");
アイテムに制限時間が設けられている場合はエラーとして閉じる
------------------------------------------------------------*/
function	script	Load_Limit_Item	{

	set .@check_id,getarg(0);
	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_limit,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "所持アイテム数が多すぎます";
		mes "所持品を減らしてから来てください";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_limit[.@i]){
				mes "エラー";
				mes "レンタルアイテムです";
				close;
			} else {
				return;
			}
		}
	}

	mes "エラー";
	mes "アイテム検索が正常に行えませんでした";
	mes "アイテムの所持数や種類を減らしてください";
	close;

}
