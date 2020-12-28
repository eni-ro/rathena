//===== rAthena Script =======================================
//= " + .@name$ + "
//===== Description: =========================================
//= [Official Conversion]
//= Shadow equipments refining NPC.
//===== Changelog: ===========================================
//= 1.0 First version [Aleos]
//= 1.1 Removed re-roll behavior and fetch materials from db
//=     [Secret]
//============================================================
-	script	通常精錬#0	-1,{
    .@name$ = "[" + strnpcinfo(1) + "]";
	.@zeny_cost = 200000; // Zeny cost is 200,000 according to official script [Secret]
	disable_items;
	mes .@name$;
	mes "精錬したいアイテムを選択して下さい。";
	next;

	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;
	for(.@i = 1; .@i <= .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
	.@menu$ = .@menu$ + "詳しく教えて";
	.@choice = select(.@menu$);
	if (.@choice == .@indlen + 1) { // Refine info
		mes .@name$;
		mes "精錬には全てのタイプのエルニウム、オリデオコンをしようできます。","また、精錬の費用として20,000ゼニー頂きます。";
		next;
		mes .@name$;
		mes "+7以上で使用できる改良型濃縮鉱石を使用すると、精錬が失敗した場合にアイテムが消失するのを防ぐことができます。";
		close;
	}

	.@part = .@indices[.@choice];

	if (!getequipisequiped(.@part)) {
		mes .@name$;
		mes "何も装備していないようですね。";
		close;
	}
	.@equip_id = getequipid(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	while(1) {
		.@equip_refine = getequiprefinerycnt(.@part);
		mes .@name$;
		mes "精錬1回につき" + callfunc("F_InsertComma", .@zeny_cost) + "ゼニー必要になります。";
		mes "精錬に使用する鉱石を選択して下さい。";
		next;

		.@material[0] = getequiprefinecost(.@part, REFINE_COST_NORMAL, REFINE_MATERIAL_ID);
		.@material[1] = getequiprefinecost(.@part, REFINE_COST_ENRICHED, REFINE_MATERIAL_ID);
		.@material[2] = getequiprefinecost(.@part, REFINE_COST_HD, REFINE_MATERIAL_ID);
		.@is_enriched = false;

		if (countitem(.@material[0]))
			.@mate$[0] = getitemname(.@material[0]);
		else
			.@mate$[0] = "^8C8C8C"+ getitemname(.@material[0]) +"^000000";
		if (countitem(.@material[1]))
			.@mate$[1] = getitemname(.@material[1]);
		else
			.@mate$[1] = "^8C8C8C"+ getitemname(.@material[1]) +"^000000";
		if (.@equip_refine > 6 && countitem(.@material[2]))
			.@mate$[2] = getitemname(.@material[2]);
		else
			.@mate$[2] = "^8C8C8C"+ getitemname(.@material[2]) +"^000000";

		switch( select( .@mate$[0], .@mate$[1], .@mate$[2], "Cancel" ) ) {
		case 1:// NORMAL
			.@choose = .@material[0];
			break;
		case 2:// ENRICHED
			.@is_enriched = true;
			.@choose = .@material[1];
			break;
		case 3:// HD
			if (.@equip_refine < 7) {
				mes .@name$;
				mes "改良型濃縮鉱石は+7以上のアイテムでのみ使用可能です。";
				close;
			}
			.@hoihoi = 1;
			.@choose = .@material[2];
			break;
		case 4:
			mes .@name$;
			mes "またご利用ください。";
			close;
		}
		if (!countitem(.@choose)) {
			mes .@name$;
			mes "必要な"+ getitemname(.@choose) +"を所持していないようですね。";
			close;
		}
		if (Zeny < .@zeny_cost) {
			mes .@name$;
			mes "ゼニーが足りません。";
			close;
		}
		if (.@equip_refine > 9) {
			mes .@name$;
			mes "通常精錬は+10までしか行えません。";
			close;
		}
		if (!getequipisenableref(.@part)) {
			mes .@name$;
			mes "このアイテムは精錬不可です。";
			close;
		}
		if (getequippercentrefinery(.@part) < 100) {
			mes .@name$;
			mes "精錬は失敗する可能性があります。";
			if (!.@hoihoi)
				mes "アイテムが消失する可能性がありますけれど、実施しますか？";
			else
				mes "精錬に失敗した場合、精錬値がさがりますけれど実施しますか？";
			next;
			if (select("精錬する","やっぱりやめる") == 2) {
				mes .@name$;
				mes "またご利用ください。";
				close;
			}
		}
		mes .@name$;
		mes "では精錬します。";
		next;
		delitem .@choose,1;
		Zeny -= .@zeny_cost;

		// anti-hack
		if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine))
			close;

		if (getequippercentrefinery(.@part, .@is_enriched) > rand(100)) {
			successrefitem .@part;
			mes .@name$;
			mes "成功しました。";
			next;
		} else {
			if (.@hoihoi)
				downrefitem .@part;
			else
				failedrefitem .@part;
			mes .@name$;
			mes "失敗しました";
            mes "_(:3」∠)_ゆるして";
			close;
		}
	}
}

department,46,108,3	duplicate(通常精錬#0)	通常精錬#depa	4_M_SE_MOON
