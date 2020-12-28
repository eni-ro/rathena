-	script	エンチャントNPC_A#-1	72,{
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	set @name$,	"[" + strnpcinfo(1) + "]";	//名前(NPC)

	function my_message {	//メッセージの管理
		switch (getarg(0)){
			case 1://初めに話したとき
				mes @name$;
				mes "エンチャントしたい物を選んでね。";
				mes "^3355FF個人タブや装備品は";
				mes "素材としてカウントしないから";
				mes "注意してね^000000";
				next;
				break;
			case 2://選択の後・作成名
				mes @name$;
				mes getarg(1) + "をエンチャントするには、^3355FF";
				break;
			case 3://選択の後・必要材料
				mes getarg(1) + " が " + getarg(2);
				break;
			case 4://選択の後・フッタ
				mes "^000000必要になります。";
				break;
			case 5://選択の後・フッタ
				mes "実行しますか？";
				next;
				break;
			case 6://終わり
				mes @name$;
				mes "ありがとうございました","またのご利用をお待ちしております。";
				break;
			case 97://エラー
				mes @name$;
				mes "DB設定エラーです。";
				mes "GMに報告して下さい。";
				break;
			case 98://エラー
				mes @name$;
				mes "エラーです。";
				mes "エンチャントを中止します。";
				break;
			case 99://キャンセル
				mes "またのご利用をお待ちしております。";
				break;
		}
		return;
	}

	my_message 1;

//選択
	//	.@level:	選択肢の深度
	//	.@line:		選択肢の数
	//	.@file$:	CSVファイルの場所
	//	.@row_num:	一時的なCSVファイルの行数
	//	.@row[.@level][.@line]:		CSVファイルの行数を格納
	//	.@type$[.@level][.@line]:	選択肢の内容を格納
	//	.@temp:	一時的に使用

	set .@level,1;
	set .@row_max,csvgetrows(.@file$);
	set .@row_num,1;
	while (1) {
		for( .@line=0; .@row_num < .@row_max; .@row_num++ ) {
			.@temp = csvread(.@file$, .@row_num, 0);

			if ( .@temp > .@level )
				continue;
			if ( .@temp < .@level )
				break;
			.@type$[.@line] = csvread(.@file$, .@row_num, 1);
			set .@row[.@line],.@row_num;
			.@line++;
		}

		.@menu_str$ = "";
		for( .@i = 0; .@i < .@line; .@i++ ){
			.@menu_str$ = .@menu_str$ + .@type$[.@i] + ":";
		}
		.@menu_str$ = .@menu_str$ + "やめる";

		set @menu,select(.@menu_str$) - 1;
		if (@menu == .@line)
			close;

		set .@row_num,.@row[@menu]+1;
		set .@name$,.@type$[@menu];
		set .@temp, csvread(.@file$, .@row_num, 0);

		if (.@temp <= .@level)
			break;

		//深度をあげる
		set .@level,.@level+1;
	}

//材料読み込み
	//	.@file$:	CSVファイルの場所
	//	.@line:		CSVの行数
	//	.@name$		アイテム名の格納
	//	.@name_id	アイテムIDの格納
	//	.@part		エンチャント箇所
	//	.@cols:		アイテムの種類カウント
	//	.@check_id[.@cols]:		必要アイテムID
	//	.@check_num[.@cols]:	必要アイテム個数

	set .@line,.@row[@menu];
	set .@name_id, csvread(.@file$, .@line, 2);
	set .@part, csvread(.@file$, .@line, 3);
	set .@cols,1;

	if( getiteminfo(.@name_id,0) == -1 ){
		my_message 97;
		close;
	}
	my_message 2,"[<ITEM>"+getitemname(.@name_id)+"<INFO>"+.@name_id+"</INFO></ITEM>]";
	while (1) {
		set .@check_id[.@cols], csvread(.@file$, .@line, (.@cols * 2 + 2));
		if (!.@check_id[.@cols]) 
			break;

		set .@check_num[.@cols], csvread(.@file$, .@line, (.@cols * 2 + 3));
		switch( .@check_id[.@cols] ){
			case -1:
				my_message 3,"ゼニー",.@check_num[.@cols] + "z";
				break;
			case -2:
				my_message 3,"キャッシュポイント",.@check_num[.@cols] + "ポイント";
				break;
			default:
				if( getiteminfo(.@check_id[.@cols],0) == -1 ){
					next;
					my_message 97;
					close;
				}
				my_message 3,"[<ITEM>"+getitemname(.@check_id[.@cols])+"<INFO>"+.@check_id[.@cols]+"</INFO></ITEM>]",.@check_num[.@cols] + "個";
				break;
		}

		set .@cols,.@cols + 1;
	}
	my_message 4;

//チェック・選択
	//	.@cols:		アイテムの種類カウント
	//	.@check_id[.@cols]:		必要アイテムID
	//	.@check_num[.@cols]:	必要アイテム個数
	//	.@temp:	一時的に使用
	set .@cols,1;
	while (1) {

		if (!.@check_id[.@cols])
			break;
		switch ( .@check_id[.@cols] ){
			case -1:
				set .@temp, (Zeny / .@check_num[.@cols] );
				break;
			case -2:
				set .@temp, (#CASHPOINTS / .@check_num[.@cols] );
				break;
			default:
				set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
				set .@temp,.@temp / .@check_num[.@cols];
				break;
		}

		if ( .@temp < 1 )
			close;

		set .@cols,.@cols + 1;
	}

	my_message 5;
	switch(select("エンチャントする","やめる")){
		case 1:
			set .@number,1;
			break;
		case 2:
			close;
	}
	.@equip_id = getequipid(.@part);
	.@refine = getequiprefinerycnt(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
	copyarray .@tmp_card[0], .@card[0], 4;
	for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
		.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
		.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
		.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
	}

    //識別番号がエンチャ箇所なのでエンチャ箇所を取得する
    if(!getequipisequiped(.@part)){
        mes @name$;
        mes "何も装備してなわね。";
        mes "装備してからまた来てね。";
        close;
    }
    
    //エンチャント数取得(4Slotから順に1Slotまでエンチャ可能)
    set .@target,-1;
    for(.@i = 3; .@i >= getiteminfo(.@equip_id,10); .@i-- ) {
        if(.@card[.@i] == 0){
            .@card[.@i] = .@name_id;
			.@target = .@i;
            break;
        }
    }
    if( .@target == -1 ){
        mes @name$;
        mes "もうこれ以上エンチャントは出来ないわね。";
		mes "中止しますね。";
        close;
    }

	set .@cols,1;
	set .@dammy,0;
	while (1) {
		if (!.@check_id[.@cols])
			break;
		switch ( .@check_id[.@cols] ){
			case -1:
				if(Zeny < .@check_num[.@cols])
					set .@dammy,1;
				break;
			case -2:
				if(#CASHPOINTS < .@check_num[.@cols])
					set .@dammy,1;
				break;
			default:
				set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
				if(.@temp < .@check_num[.@cols])
					set .@dammy,1;
				break;
		}
		set .@cols,.@cols + 1;
	}

	if(.@dammy){
		mes @name$;
		mes "アイテムがおかしいみたい";
		mes "もう一度初めからやってね";
		close;
	}
	
	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipRefineHack", .@part, .@refine) || callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3]))
		close;
	
    set .@cols,1;
    while (1) {
        if (!.@check_id[.@cols])
            break;
        switch( .@check_id[.@cols] ){
			case -1:
				Zeny -= .@check_num[.@cols];
				break;
			case -2:
				#CASHPOINTS -= .@check_num[.@cols];
				break;
			default:
				set .@type,getiteminfo(.@check_id[.@cols],2);
				if(.@type == IT_ARMOR || .@type == IT_WEAPON || .@type == IT_PETARMOR || .@type == IT_SHADOWGEAR){
		            for(set .@b,0;.@b < .@check_num[.@cols];set .@b,.@b + 1) {
		                //set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],1);
		                delitem .@check_id[.@cols],1;
		            }
	            } else {
	                //set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],.@check_num[.@cols]);
	                delitem .@check_id[.@cols],.@check_num[.@cols];
	            }
	         	break;
        }
        set .@cols,.@cols + 1;
    }

	delequip .@part;
	getitem3 .@equip_id,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

    misceffect 610,0;

	close;
OnInterIfInitOnce:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	end;
}

//================================================================================
//NPCネームの記述ルール
//"NPCネーム"#"ID"::"読み込みDBネーム"
//--------------------------------------------------------------------------------
ven_in01,116,96,5	duplicate(エンチャントNPC_A#-1)	シャドウエンチャ#0::slot_enchant1	496
