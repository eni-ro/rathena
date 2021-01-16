-	script	�I���W�i�����B#0	-1,{
    .@name$ = "[" + strnpcinfo(1) + "]";
	.@zeny_cost = 200000;
	disable_items;
	mes .@name$;
	mes "�T�����ɕςȂƂ��ɗ���������j���B";
	mes "�����̃n���^�[����͗����΂����ĂȂ����j���H";
	mes callfunc("F_InsertComma", .@zeny_cost)+"�[�j�[�Ɨ����΂������Ȃ����ɑ����𐸘B���Ă�����j���B";
	next;

	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L,EQI_SHADOW_ARMOR,EQI_SHADOW_SHIELD,EQI_SHADOW_SHOES,EQI_SHADOW_ACC_R,EQI_SHADOW_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;
	for(.@i = 1; .@i <= .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
	.@menu$ = .@menu$ + "�ڂ���������";
	.@choice = select(.@menu$);
	if (.@choice == .@indlen + 1) { // Refine info
		mes .@name$;
		mes "�����΂�������o���ė����̗͂𗘗p���Đ��B����j���B";
		mes "�����Ȍ��Ђ��Ǝ��s���邩������Ȃ�����ǁA���s���Ă������͌��̂܂܎c��j���B";
		mes "�傫�Ȃ��̂��Ɛ�ΐ�������j���B";
		close;
	}

	.@part = .@indices[.@choice];

	if (!getequipisequiped(.@part)) {
		mes .@name$;
		mes "�����������Ă��Ȃ��j���B";
		close;
	}
	.@equip_id = getequipid(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	while(1) {
		.@equip_refine = getequiprefinerycnt(.@part);
		mes .@name$;
		mes "���B1��ɂ�" + callfunc("F_InsertComma", .@zeny_cost) + "�[�j�[�K�v�j���B";
		mes "�ǂ̗����΂������j���H";
		mes "���Ȃ݂Ɍ��Ђ��Ɛ�������"+getequippercentrefinery(.@part, true)+"%���炢�j���B";
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
			mes "�����ł��a���Ƃ����˂΂����j���B";
			close;
		}
		if (!countitem(.@choose)) {
			mes .@name$;
			mes getitemname(.@choose) +"�������ĂȂ��Ƃ��R���j���B";
			close;
		}
		if (Zeny < .@zeny_cost) {
			mes .@name$;
			mes "�[�j�[������Ȃ��j���B";
			close;
		}
		if (.@equip_refine > 19) {
			mes .@name$;
			mes "�������E�܂Ő��B�ς݃j���B";
			close;
		}
		if (!getequipisenableref(.@part)) {
			mes .@name$;
			mes "���̃A�C�e���͂������ɐ��B�ł��Ȃ��j���B";
			close;
		}
		mes .@name$;
		mes "�����j���[�I";
		next;
		delitem .@choose,1;
		Zeny -= .@zeny_cost;

		// anti-hack
		if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine))
			close;

		if (.@is_enriched || getequippercentrefinery(.@part, true) > rand(100)) {
			successrefitem .@part;
			mes .@name$;
			mes "���܂��������j���B";
			next;
		} else {
			mes .@name$;
			mes "���߂������j���B";
			mes "�����ăj���B";
			specialeffect2 EF_REFINEFAIL;
			next;
		}
	}
}

department,50,102,3	duplicate(�I���W�i�����B#0)	�I�g���A�C���[#depa	4_DR_M_02
