-	script	WhiteKnightEnchant#-1	72,{
	function GetNextEnchantRow;
	function GetSelectableItemID;
	function TryEnchant;
	function SuccessEnchant;
	
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	.@name$ = "[" + strnpcinfo(1) + "]";
	mes .@name$;
	mes "特別なアイテムに";
	mes "特別なエンチャントをしてあげよう。";
	mes "もちろんお代は頂くけどね。";
	next;

    setarray .@indices, EQI_HAND_R;
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
	setarray .@req_item,6607,250,6608,250;
	.@req_item_size = getarraysize(.@req_item);
	
	mes .@name$;
	mes "エンチャントを行うには";
	for( .@j = 0; .@j < .@req_item_size; .@j+= 2 ){
		mes sprintf("[<ITEM>%s<INFO>%d</INFO></ITEM>]を%d個",getitemname(.@req_item[.@j]),.@req_item[.@j],.@req_item[.@j+1]);
	}
	mes "必要だ。";
	next;

	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		if( countitem(.@req_item[.@i]) < .@req_item[.@i+1] ){
			mes .@name$;
			mes "材料が足りないようだ。";
			close;
		}
	}
	mes .@name$;
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
	mes sprintf("に%d回目のエンチャントをしたいんだな。",.@row - .@csv_row[.@sel] + 1);
	next;

	if(select("エンチャントする","やめる") == 2) {
		mes .@name$;
		mes "気が変わったらまた来るといい。";
		close;
	}
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
	mes .@name$;
	mes "来たれ、お金パワー！！！";
	next;
	
	// anti-hack
	if ( callfunc("F_IsEquipIDHack", .@part, .@iid)
	|| callfunc("F_IsEquipRefineHack", .@part, .@refine)
	|| callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3])
	|| ( countitem(.@req_iid) < .@req_amount )){
		mes "Anti-Hack!!!","ログに残しました";
		errormes "白き騎士団エンチャントAnti-Hack:"+strcharinfo(0);
		close;
	}
	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		if( countitem(.@req_item[.@i]) < .@req_item[.@i+1] ){
			mes "Anti-Hack!!!","ログに残しました";
			errormes "白き騎士団エンチャントAnti-Hack:"+strcharinfo(0);
			close;
		}
	}
	mes .@name$;
	switch( TryEnchant( .@file$, .@row, .@part, .@eiid )){
		case 0:
			specialeffect EF_LORD;
			mes "おめでとう。";
			mes "うまくエンチャントできたよ。";
			break;
		default:
			errormes sprintf("エンチャント設定異常 : Main Failure TryEnchant,file = %s,row = %d", .@file$, .@row );
			break;
	}
	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		delitem .@req_item[.@i],.@req_item[.@i+1];
	}
	close;
OnInit:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	end;
	
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
			.@tmpslot = atoi( csvread( .@file$, .@row, 1 ));
			.@chkcardid = .@card[ .@tmpslot ];	//対象スロットのカードを取得
			if( !.@chkcardid ){
				return .@row;
			}
		}
		return -1;
	}

	// @brief	選択式で選択可能なアイテムIDをユーザ変数に読みこむ
	// return	0:成功、-1:失敗
	function GetSelectableItemID{
		.@row = getarg(1);
		.@index = 0;
		for( .@col = 2; 1; .@col++ ){
			set .@tmpip,csvread( getarg(0), .@row, .@col );
			if( .@tmpip <= 0 ){
				break;
			}
			set getelementofarray(getarg(2),.@index),.@tmpip;
			.@index++;
		}
		return .@index;
	}

	// @brief	エンチャントを実施
	// return	0:成功、1:失敗、-1:異常終了
	function TryEnchant{
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@eiid = getarg(3,-1);

		if( SuccessEnchant( .@file$, .@row, .@part, .@eiid ) != 0 ){
			return -1;
		}
		return 0;
	}
	// @brief	エンチャント成功時の処理
	// return	0:正常終了、-1:異常終了
	function SuccessEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@eiid = getarg(3);
		.@slot = atoi( csvread( .@file$, .@row, 1 ));

		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}
		.@card[ .@slot ] = .@eiid;
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}
}

ven_in01,19,104,5	duplicate(WhiteKnightEnchant#-1)	白の騎士団エンチャ#0::enchant_white_knight	4_M_MERCAT1
