-	script	オリジナル精錬#0	-1,{
    .@name$ = "[" + strnpcinfo(1) + "]";
	.@zeny_cost = 200000;
	disable_items;
	mes .@name$;
	mes "探検中に変なとこに来ちゃったニャ。";
	mes "そこのハンターさんは龍脈石もってないかニャ？";
	mes callfunc("F_InsertComma", .@zeny_cost)+"ゼニーと龍脈石をくれるなら代わりに装備を精錬してあげるニャ。";
	next;

	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L,EQI_SHADOW_ARMOR,EQI_SHADOW_SHIELD,EQI_SHADOW_SHOES,EQI_SHADOW_ACC_R,EQI_SHADOW_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;
	for(.@i = 1; .@i <= .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
	.@menu$ = .@menu$ + "詳しく教えて";
	.@choice = select(.@menu$);
	if (.@choice == .@indlen + 1) { // Refine info
		mes .@name$;
		mes "龍脈石から引き出して龍脈の力を利用して精錬するニャ。";
		mes "小さな欠片だと失敗するかもしれないけれど、失敗しても装備は元のまま残るニャ。";
		mes "大きなものだと絶対成功するニャ。";
		close;
	}

	.@part = .@indices[.@choice];

	if (!getequipisequiped(.@part)) {
		mes .@name$;
		mes "何も装備していないニャ。";
		close;
	}
	.@equip_id = getequipid(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	while(1) {
		.@equip_refine = getequiprefinerycnt(.@part);
		mes .@name$;
		mes "精錬1回につき" + callfunc("F_InsertComma", .@zeny_cost) + "ゼニー必要ニャ。";
		mes "どの龍脈石をくれるニャ？";
		mes "ちなみに欠片だと成功率は"+getequippercentrefinery(.@part, true)+"%ぐらいニャ。";
		next;
		if( .@equip_refine < 7 ){
			setarray .@material,2002000000,2002000001;
		}
		else if( .@equip_refine < 10 ){
			setarray .@material,2002000002,2002000003;
		}
		else{
			setarray .@material,2002000004,2002000005;
		}
		.@is_enriched = false;

		if (countitem(.@material[0]))
			.@mate$[0] = getitemname(.@material[0]);
		else
			.@mate$[0] = "^8C8C8C"+ getitemname(.@material[0]) +"^000000";
		if (countitem(.@material[1]))
			.@mate$[1] = getitemname(.@material[1]);
		else
			.@mate$[1] = "^8C8C8C"+ getitemname(.@material[1]) +"^000000";

		switch( select( .@mate$[0], .@mate$[1], "Cancel" ) ) {
		case 1:// NORMAL
			.@choose = .@material[0];
			break;
		case 2:// ENRICHED
			.@is_enriched = true;
			.@choose = .@material[1];
			break;
		case 3:
			mes .@name$;
			mes "ここでお預けとか死ねばいいニャ。";
			close;
		}
		if (!countitem(.@choose)) {
			mes .@name$;
			mes getitemname(.@choose) +"をもってないとか嘘つきニャ。";
			close;
		}
		if (Zeny < .@zeny_cost) {
			mes .@name$;
			mes "ゼニーが足りないニャ。";
			close;
		}
		if (.@equip_refine > 19) {
			mes .@name$;
			mes "もう限界まで精錬済みニャ。";
			close;
		}
		if (!getequipisenableref(.@part)) {
			mes .@name$;
			mes "このアイテムはさすがに精錬できないニャ。";
			close;
		}
		mes .@name$;
		mes "いくニャー！";
		next;
		delitem .@choose,1;
		Zeny -= .@zeny_cost;

		// anti-hack
		if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine))
			close;

		if (.@is_enriched || getequippercentrefinery(.@part, true) > rand(100)) {
			successrefitem .@part;
			mes .@name$;
			mes "うまくいったニャ。";
			next;
		} else {
			mes .@name$;
			mes "だめだったニャ。";
			mes "許してニャ。";
			specialeffect2 EF_REFINEFAIL;
			next;
		}
	}
}

department,50,102,3	duplicate(オリジナル精錬#0)	オトモアイルー#depa	4_DR_M_02
