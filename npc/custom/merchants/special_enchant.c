-	script	SpecialEnchant#-1	72,{
	function GetEnchanteID;
	function GetNextEnchantRow;
	function GetRequiedRefineCnt;
	function IsNextTypeSelect;
	function GetNextRequiedItemID;
	function GetNextRequiedItemAmount;
	function GetSelectableItemID;
	function GetFailureRate;
	function GetFailureType;
	function TryEnchant;
	function SuccessEnchant;
	function SelectRandomID;
	function FailEnchant;
	
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	.@name$ = "[" + strnpcinfo(1) + "]";
	mes .@name$;
	mes "特別なアイテムに";
	mes "特別なエンチャントをしてあげよう。";
	mes "もちろんお代は頂くけどね。";
	next;
	
	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;

    setarray .@indices, EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
    .@indlen = getarraysize(.@indices)+1;
    .@menu$ = "";
	.@menu_len = 0;
	for(.@i = 0; .@i < .@indlen; .@i++){
		if( getequipisequiped(.@indices[.@i]) ){
			.@r = csvfind( .@file$, 0, sprintf("%d",getequipid(.@indices[.@i])));
			if( .@r >= 0 ){
				.@menu$ = .@menu$ + getequipname(.@indices[.@i]) + ":";
				.@menu_indices[.@menu_len] = .@indices[.@i];
				.@csv_row[.@menu_len] = .@r;
				.@menu_len++;
			}
		}
	}
	.@menu$ = .@menu$ + "やめる";
	if( .@menu_len == 0 ){
		mes .@name$;
		mes "対応している";
		mes "アイテムを装備していないようだ。";
		close;
	}
	.@sel = select(.@menu$)-1;
	if( .@sel == .@menu_len ){
		mes .@name$;
		mes "気が変わったらまた来るといい。";
		close;
	}
	.@part = .@menu_indices[.@sel];
	.@iid = getequipid(.@part);
	.@row = GetNextEnchantRow(.@file$,.@part);

	.@refine = getequiprefinerycnt(.@part);
	setarray .@tmp_card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	if( .@row < 0 ) {
		mes .@name$;
		mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]は";
		mes "これ以上エンチャントできないようだ。";
		close;
	}
	.@reqrefine = GetRequiedRefineCnt( .@file$, .@row );
	if( .@reqrefine > getequiprefinerycnt(.@part) ){
		mes .@name$;
		mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
		mes sprintf("に%d回目のエンチャントを行うには、+%d以上に精錬する必要がある。",.@row - .@csv_row[.@sel] + 1, .@reqrefine );
		close;
	}
	.@req_iid = GetNextRequiedItemID( .@file$, .@row );
	.@req_amount = GetNextRequiedItemAmount( .@file$, .@row );

	if( countitem(.@req_iid) < .@req_amount ){
		mes .@name$;
		mes "エンチャントを行うには";
		mes "[<ITEM>"+getitemname(.@req_iid)+"<INFO>"+.@req_iid+"</INFO></ITEM>]";
		mes sprintf("を%d個必要だ。",.@req_amount);
		close;
	}
	mes .@name$;
	mes "[<ITEM>"+getitemname(.@req_iid)+"<INFO>"+.@req_iid+"</INFO></ITEM>]";
	mes sprintf("を%d個消費して",.@req_amount);
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
	mes sprintf("に%d回目のエンチャントをしたいんだな。",.@row - .@csv_row[.@sel] + 1);
	next;

	if( GetFailureRate( .@file$, .@row ) > 0 ){
		mes .@name$;
		mes "この装備はエンチャントに失敗する可能性がある。";
		mes "エンチャントに失敗した場合";
		switch( GetFailureType( .@file$, .@row ) ){
			case 0:
				mes "装備はそのまま維持される。";
				break;
			case 1:
				mes "装備は消失してしまう。";
				break;
			case 2:
				mes "選択した箇所のエンチャントのみ消失する。";
				break;
			case 3:
				mes "全てのエンチャントが消失する。";
				break;
			default:
				errormes sprintf("エンチャント設定異常 : Main Failure Type,file = %s,row = %d", .@file$, .@row );
				close;
		}
		next;
	}
	if(select("エンチャントする","やめる") == 2) {
		mes .@name$;
		mes "気が変わったらまた来るといい。";
		close;
	}
	if( IsNextTypeSelect( .@file$, .@row ) ){
		mes .@name$;
		mes "希望するエンチャントはどれだ？";
		next;
		.@size = GetSelectableItemID( .@file$, .@row, .@eiid_arr[0] );
		.@menu$ = "";
		for( .@i = 0; .@i < .@size; .@i++ ){
			.@menu$ = .@menu$ + getitemname(.@eiid_arr[.@i]) + ":";
		}
		.@menu$ = .@menu$ + "やめる";
		.@esel = select( .@menu$ ) - 1;
		.@eiid = .@eiid_arr[.@esel];
		mes getitemname(.@eiid) + "だな";
		next;
	}
	else{
		.@eiid = -1;
	}
	mes .@name$;
	mes "来たれ、お金パワー！！！";
	next;
	
	// anti-hack
	if ( callfunc("F_IsEquipIDHack", .@part, .@iid)
	|| callfunc("F_IsEquipRefineHack", .@part, .@refine)
	|| callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3])
	|| ( countitem(.@req_iid) < .@req_amount )){
		mes "Anti-Hack!!!","ログに残しました";
		errormes "スペシャルエンチャントAnti-Hack:"+strcharinfo(0);
		close;
	}
	mes .@name$;
	switch( TryEnchant( .@file$, .@row, .@part, .@eiid )){
		case 0:
			specialeffect EF_LORD;
			mes "おめでとう。";
			mes "うまくエンチャントできたよ。";
			break;
		case 1:
			specialeffect EF_SUI_EXPLOSION;
			mes "すまない。";
			mes "お金パワーがたりなかったようだ。";
			break;
		default:
			errormes sprintf("エンチャント設定異常 : Main Failure TryEnchant,file = %s,row = %d", .@file$, .@row );
			break;
	}
	delitem .@req_iid,.@req_amount;
	close;
OnInit:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	/*
	//for debug
	setarray .@item_exist_check,29012,29248,4947,4950,29243,4815,4814,4869,4872,4944,4900,29372,
	29012,29248,4947,4950,29243,4815,4814,4869,4872,4944,4900,29372,
	29371;
	debugmes "Item exits check...";
	for( .@i = 0; .@i < getarraysize(.@item_exist_check); .@i++ ){
		if( getiteminfo(.@item_exist_check[.@i], 2 ) == -1 ){
			errormes sprintf("Items not exits : %d",.@item_exist_check[.@i] );
		}
	}
	*/
	end;
	
	// @brief	アイテムIDに対応したエンチャントIDを取得する
	function GetEnchanteID {
		//装備無しの場合は終了
		if( @equipid == 0 ){
			return -1;
		}
		set .@readrow,csvfind( .fname_itemid$[getarg(0)], 0, sprintf("%d",@equipid ));	//ItemIDで検索
		if( .@readrow < 0 ){
			return -1;
		}
		set .@tmpid,csvread( .fname_itemid$[getarg(0)], .@readrow, 1 );
		return	.@tmpid;
	}
	// @brief	次のエンチャント設定がある行を取得する
	function GetNextEnchantRow{
		.@file$ = getarg(0);
		.@part = getarg(1);
		.@iid = getequipid(.@part);
		.@row = csvfind( .@file$, 0, sprintf("%d", .@iid ));

		if(( .@iid == -1 ) || ( .@row == -1 )){
			return -1;
		}

		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		
		.@maxrow = csvgetrows( .@file$ );
		for( ; .@row < .@maxrow  && atoi( csvread( .@file$, .@row, 0 )) == .@iid ; .@row++ ){
			.@tmpslot = atoi( csvread( .@file$, .@row, 2 ));
			.@chkcardid = .@card[ .@tmpslot ];	//対象スロットのカードを取得

			if( !.@chkcardid ){
				return .@row;
			}

			.@maxcol = csvgetcols( .@file$, .@row );
			for( .@col = 8; .@col < .@maxcol; .@col = .@col+2 ){
				.@tmpid = atoi( csvread( .@file$, .@row, .@col ));
				if( .@tmpid <= 0 ){
					return .@row;
				}
				if( .@chkcardid == .@tmpid ){
					break;
				}
			}
		}
		return -1;
	}

	// @brief	エンチャントに必要なアイテムIDを取得
	function GetRequiedRefineCnt{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 1 ));
	}

	// @brief	次のエンチャント方式は選択式か判断する
	// return	1:選択式、0:それ以外
	function IsNextTypeSelect{
		.@row = getarg(1);
		.@tmptype = atoi(csvread( getarg(0), .@row, 3 ));
		if( .@tmptype == 0 ){
			return 1;
		}
		return 0;
	}

	// @brief	エンチャントに必要なアイテムIDを取得
	// return	必要なアイテムID
	function GetNextRequiedItemID{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 4 ));
	}

	// @brief	エンチャントに必要なアイテム個数を取得
	// return	必要なアイテム個数
	function GetNextRequiedItemAmount{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 5 ));
	}

	// @brief	選択式で選択可能なアイテムIDをユーザ変数@enchant_selectable_listに読みこむ
	// return	0:成功、-1:失敗
	function GetSelectableItemID{
		.@row = getarg(1);
		.@index = 0;
		for( .@col = 8; 1; .@col += 2 ){
			set .@tmpip,csvread( getarg(0), .@row, .@col );
			if( .@tmpip <= 0 ){
				break;
			}
			set getelementofarray(getarg(2),.@index),.@tmpip;
			.@index++;
		}
		return .@index;
	}

	// @brief	選択式で選択可能なアイテムIDをユーザ変数@enchant_selectable_listに読みこむ
	// return	0:成功、-1:失敗
	function GetFailureRate{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 6 ));
	}
	function GetFailureType{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 7 ));
	}

	// @brief	エンチャントを実施
	// return	0:成功、1:失敗、-1:異常終了
	function TryEnchant{
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@eiid = getarg(3,-1);
		.@failure_rate = atoi( csvread( .@file$, .@row, 6 ));

		if( rand(100) >= .@failure_rate ){
			if( SuccessEnchant( .@file$, .@row, .@part, .@eiid ) != 0 ){
				return -1;
			}
			return 0;
		}
		else{
			if( FailEnchant( .@file$, .@row, .@part ) ){
				return -1;
			}
			return 1;
		}
		return -1;
	}
	// @brief	エンチャント成功時の処理
	// return	0:正常終了、-1:異常終了
	function SuccessEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@eiid = getarg(3);
		.@slot = atoi( csvread( .@file$, .@row, 2 ));
		.@type = atoi( csvread( .@file$, .@row, 3 ));

		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}

		switch( .@type ){
			case 0:	//選択されたものをエンチャントする
				.@card[ .@slot ] = .@eiid;
				break;
			case 1:	//ランダムで選択する
				.@tmpid = SelectRandomID( .@file$, .@row );
				if( .@tmpid <= 0 ){
					errormes sprintf("エンチャント設定異常 : SuccessEnchant,file = %s,row = %d",.@file$,.@row);
					return -1;
				}
				.@card[ .@slot ] = .@tmpid;
				break;
			default:
				errormes sprintf("エンチャント設定異常 : SuccessEnchant,file = %s,row = %d",.@file$,.@row);
				return -1;
		}
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}

	// @brief	ランダム方式のエンチャントの抽選を行う
	// return	-1:エラー、それ以外:エンチャントするアイテムID
	function SelectRandomID {
		.@file$ = getarg(0);
		.@row = getarg(1);
		//各アイテムIDの成功割合の合計値を算出
		.@maxcol = csvgetcols( .@file$, .@row );
		.@sum = 0;
		for( .@col = 9; .@col < .@maxcol; .@col += 2 ){
			.@rate = atoi( csvread( .@file$, .@row, .@col ));
			if( .@rate > 0 ){
				.@sum += .@rate;
			}
		}
		.@rand_val = rand( .@sum );	//0-.@sum-1を生成
		
		//乱数に満たなかったところが当選
		.@sum = 0;
		for( .@col = 9; .@col < .@maxcol; .@col += 2 ){
			.@rate = atoi( csvread( .@file$, .@row, .@col ));
			if( .@rate > 0 ){
				.@sum += .@rate;
				if( .@rand_val < .@sum ){
					return atoi( csvread( .@file$, .@row, .@col - 1 ));
				}
			}
		}
		return -1;	//基本的にここには来ない
	}
	// @brief	エンチャント失敗時の処理
	// return	0:正常終了、-1:異常終了
	function FailEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@slot = atoi( csvread( .@file$, .@row, 2 ));
		.@type = atoi( csvread( .@file$, .@row, 7 ));
		
		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}
		switch( .@type ){
			case 0:	//何もしない
				return 0;
			case 1:	//装備を破壊
				delequip .@part;
				return 0;
			case 2:	//エンチャントを実施しようとしたスロットをクリア
				set .@refine,getequiprefinerycnt2( getarg(1) );
				setarray .@card[ .@slot ],0;
				break;
			case 3:	//エンチャントを実施しようとしたスロット及びそれ以降のスロットをクリア
				for( .@i = getitemslots( .@iid ); .@i < 4; .@i++ ){
					.@card[ .@i ] = 0;
				}
				break;
			default:
				errormes sprintf("エンチャント設定異常 : FailEnchant,file = %s,row = %d",.@file$,.@row);
				return -1;
		}
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}
}

ven_in01,23,112,5	duplicate(SpecialEnchant#-1)	上段SPエンチャ#0::sp_enc_head_top	4_M_CATMAN1
ven_in01,32,111,3	duplicate(SpecialEnchant#-1)	中段SPエンチャ#1::sp_enc_head_mid	4_M_CATMAN1
ven_in01,30,109,3	duplicate(SpecialEnchant#-1)	鎧SPエンチャ#3::sp_enc_armor	4_M_CATMAN1
ven_in01,32,107,3	duplicate(SpecialEnchant#-1)	盾SPエンチャ#5::sp_enc_shield	4_M_CATMAN1
ven_in01,21,106,5	duplicate(SpecialEnchant#-1)	肩SPエンチャ#4::sp_enc_garment	4_M_CATMAN1
ven_in01,30,105,3	duplicate(SpecialEnchant#-1)	靴SPエンチャ#6::sp_enc_shoes	4_M_CATMAN1
ven_in01,23,104,5	duplicate(SpecialEnchant#-1)	アクセSPエンチャ#8::sp_enc_acc	4_M_CATMAN1
