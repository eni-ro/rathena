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
-	script	�ʏ퐸�B#0	-1,{
    .@name$ = "[" + strnpcinfo(1) + "]";
	.@zeny_cost = 200000; // Zeny cost is 200,000 according to official script [Secret]
	disable_items;
	mes .@name$;
	mes "���B�������A�C�e����I�����ĉ������B";
	next;

	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;
	for(.@i = 1; .@i <= .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
	.@menu$ = .@menu$ + "�ڂ���������";
	.@choice = select(.@menu$);
	if (.@choice == .@indlen + 1) { // Refine info
		mes .@name$;
		mes "���B�ɂ͑S�Ẵ^�C�v�̃G���j�E���A�I���f�I�R�������悤�ł��܂��B","�܂��A���B�̔�p�Ƃ���20,000�[�j�[�����܂��B";
		next;
		mes .@name$;
		mes "+7�ȏ�Ŏg�p�ł�����ǌ^�Z�k�z�΂��g�p����ƁA���B�����s�����ꍇ�ɃA�C�e������������̂�h�����Ƃ��ł��܂��B";
		close;
	}

	.@part = .@indices[.@choice];

	if (!getequipisequiped(.@part)) {
		mes .@name$;
		mes "�����������Ă��Ȃ��悤�ł��ˁB";
		close;
	}
	.@equip_id = getequipid(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	while(1) {
		.@equip_refine = getequiprefinerycnt(.@part);
		mes .@name$;
		mes "���B1��ɂ�" + callfunc("F_InsertComma", .@zeny_cost) + "�[�j�[�K�v�ɂȂ�܂��B";
		mes "���B�Ɏg�p����z�΂�I�����ĉ������B";
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
				mes "���ǌ^�Z�k�z�΂�+7�ȏ�̃A�C�e���ł̂ݎg�p�\�ł��B";
				close;
			}
			.@hoihoi = 1;
			.@choose = .@material[2];
			break;
		case 4:
			mes .@name$;
			mes "�܂������p���������B";
			close;
		}
		if (!countitem(.@choose)) {
			mes .@name$;
			mes "�K�v��"+ getitemname(.@choose) +"���������Ă��Ȃ��悤�ł��ˁB";
			close;
		}
		if (Zeny < .@zeny_cost) {
			mes .@name$;
			mes "�[�j�[������܂���B";
			close;
		}
		if (.@equip_refine > 9) {
			mes .@name$;
			mes "�ʏ퐸�B��+10�܂ł����s���܂���B";
			close;
		}
		if (!getequipisenableref(.@part)) {
			mes .@name$;
			mes "���̃A�C�e���͐��B�s�ł��B";
			close;
		}
		if (getequippercentrefinery(.@part) < 100) {
			mes .@name$;
			mes "���B�͎��s����\��������܂��B";
			if (!.@hoihoi)
				mes "�A�C�e������������\��������܂�����ǁA���{���܂����H";
			else
				mes "���B�Ɏ��s�����ꍇ�A���B�l��������܂�����ǎ��{���܂����H";
			next;
			if (select("���B����","����ς��߂�") == 2) {
				mes .@name$;
				mes "�܂������p���������B";
				close;
			}
		}
		mes .@name$;
		mes "�ł͐��B���܂��B";
		next;
		delitem .@choose,1;
		Zeny -= .@zeny_cost;

		// anti-hack
		if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine))
			close;

		if (getequippercentrefinery(.@part, .@is_enriched) > rand(100)) {
			successrefitem .@part;
			mes .@name$;
			mes "�������܂����B";
			next;
		} else {
			if (.@hoihoi)
				downrefitem .@part;
			else
				failedrefitem .@part;
			mes .@name$;
			mes "���s���܂���";
            mes "_(:3�v��)_��邵��";
			close;
		}
	}
}

department,46,108,3	duplicate(�ʏ퐸�B#0)	�ʏ퐸�B#depa	4_M_SE_MOON
