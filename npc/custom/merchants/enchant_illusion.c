ven_in01,104,110,3	script	���x���I������	4_F_REBELLION3 ,{    //4_F_REBELLION3
	mes "[���x���I������]";
	mes "�C���V�I���G���`�����g�ɕK�v�Ȑ݌v�}��̔����Ă���B";
	mes "500�|�C���g�ň���邯��ǂ��邩���H";
	next;
	if( select("�~����","�v��Ȃ�") == 2 ){
		mes "[���x���I������]";
		mes "�~�����Ȃ�����܂����ȁB";
		close;
	}
	if( #CASHPOINTS < 500 ){
		mes "[���x���I������]";
		mes "���������A�Ή�������Ȃ����H";
		close;
	}
	setarray .@list[0],25670,25671,25678,25679,25684,25685,25686,25687,25688,25689,25690,25691,25692,25693,25694,25695,25696,25697,25698,25699,25700,25701,25702,25703,25704,6965,6966,6967,6968,6969,6970,6971,6972,6973,6974,6975,6976,6977,6978,6979,6980,6981,6982,6983,6984,6985,6986,25189,25190,25191,25192,25193,25194,25195,25196,25197,25198,25434,25435,25436,25437,25438,25439,25440,1000312,1000313,1000314,1000315,25663,25189,25190,25191,25192,25193,25194,25195,25196,25197,25198,25705;
	getitem .@list[rand(getarraysize(.@list))],1;
	#CASHPOINTS -= 500;
	mes "[���x���I������]";
	mes "�܂��~�����Ȃ����痈�ȁB";
	close;
}

ven_in01,108,110,4	script	RS26	4_SYS_MSG,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000�C���x���g���̒��g�����炵�ė��ĉ�����^000000";
		close;
	}
	mes "[RS26]";
	mes "���E�R�\" + strcharinfo(0) + ",";
	mes "�C���V�I���G���`�����g�@���@�V�}�X�J�H";
	next;
    setarray .@indices, EQI_ARMOR, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
    setarray .@tbl_offset, 2, 5, 3, 4, 6, 7;
    .@indlen = getarraysize(.@tbl_offset);
    .@menu$ = "";
	for(.@i = 0; .@i < .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
    .@menu$ = .@menu$ + "�ڂ���������";

    .@sel = select(.@menu$)-1;
    if( .@sel == .@indlen ){
		mes "[RS26]";
		mes "MD�f�@����V�^�@�C���V�I�������@�j�@�݌v�}���@�g�p�V�e�@�G���`�����g�@�f�L�}�X�B";
		next;
		mes "[RS26]";
		mes "�݌v�}�n�@���x���I�������@�J���@���b�e�@�N�_�T�C�B";
		next;
		mes "[RS26]";
		mes "���^�V�@�G���`�����g�@�n�@���s�V�}�Z���m�f�B";
		close;
    }
    .@part = .@indices[.@sel];
    .@offset = .@tbl_offset[.@sel];

	// <item ID required>, <item enchant ID>, <max number of this enchant on armor>, <max number of this enchant on garment>, leg,shield,acc(L),acc(R),<enchant group>
	setarray .@list[0],
        25687,	29534,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-Atk) -> B-Atk
        25670,	29527,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-Def) -> B-Def
        25678,	29529,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-HPR) -> B-HPR
        25688,	29535,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-Matk) -> B-Matk
        25684,	29531,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-MaxHP) -> B-MaxHP
        25685,	29530,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-MaxSP) -> B-MaxSP
        25671,	29528,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-Mdef) -> B-Mdef
        25679,	29532,	3,	3,	3,	3,	3,	3,	0,	// �������W���[��(B-SPR) -> B-SPR
        25696,	29543,	1,	0,	0,	0,	0,	0,	1,	// �������W���[��(G-DrainHP) -> G-DrainHP
        25697,	29544,	1,	0,	0,	0,	0,	0,	1,	// �������W���[��(G-DrainSP) -> G-DrainSP
        25698,	29545,	1,	0,	0,	0,	0,	0,	1,	// �������W���[��(G-Life) -> G-Life
        25699,	29546,	1,	0,	0,	0,	0,	0,	1,	// �������W���[��(G-Soul) -> G-Soul
        25695,	29542,	1,	1,	1,	0,	1,	1,	0,	// �������W���[��(Q-Attribute) -> Q-Attribute
        25694,	29541,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-CastFixed) -> Q-CastFixed
        25691,	29538,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-CastStat) -> Q-CastStat
        25693,	29540,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-Delay) -> Q-Delay
        25692,	29539,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-Fatal) -> Q-Fatal
        25686,	29533,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-Heal) -> Q-Heal
        25663,	29511,	1,	1,	1,	0,	0,	0,	0,	// �������W���[��(Q-Player) -> Q-Player
        25689,	29536,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-Shooter) -> Q-Shooter
        25690,	29537,	1,	1,	1,	1,	1,	1,	0,	// �������W���[��(Q-Speed) -> Q-Speed
        25704,	29551,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-FatalFlash) -> X-FatalFlash
        25702,	29549,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-FiringShot) -> X-FiringShot
        25705,	29552,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-LuckyStrike) -> X-LuckyStrike
        25703,	29550,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-OverPower) -> X-OverPower
        25701,	29548,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-SpellBuster) -> X-SpellBuster
        25700,	29547,	0,	1,	0,	0,	0,	0,	2,	// �������W���[��(X-UnlimitVital) -> X-UnlimitVital
        1000312,	310270,	0,	0,	0,	1,	0,	0,	6,	// �������W���[��(T-PowerBoost) -> T-PowerBoost
        1000313,	310271,	0,	0,	0,	1,	0,	0,	6,	// �������W���[��(T-MagicBoost) -> T-MagicBoost
        1000314,	310272,	0,	0,	0,	1,	0,	0,	6,	// �������W���[��(T-Assault) -> T-Assault
        1000315,	310273,	0,	0,	0,	1,	0,	0,	6,	// �������W���[��(T-Electricity) -> T-Electricity
        6986,	4991,	1,	1,	1,	0,	1,	1,	0,	// A-ASPD�̐݌v�} -> A-ASPD
        6981,	4986,	3,	3,	3,	3,	1,	1,	0,	// A-Atk�̐݌v�} -> A-Atk
        6980,	4985,	1,	1,	0,	0,	1,	1,	0,	// A-Avoid�̐݌v�} -> A-Avoid
        6979,	4984,	3,	3,	3,	0,	1,	1,	0,	// A-Def�̐݌v�} -> A-Def
        25191,	29168,	0,	0,	1,	1,	1,	1,	0,	// A-Flee�̐݌v�} -> A-Flee
        6985,	4990,	1,	0,	0,	0,	0,	0,	0,	// A-Frozen�̐݌v�} -> A-Frozen
        25190,	29167,	0,	0,	1,	1,	1,	1,	0,	// A-Hit�̐݌v�} -> A-Hit
        6978,	4983,	1,	0,	0,	0,	0,	0,	0,	// A-Int�̐݌v�} -> A-Int
        6982,	4987,	3,	3,	3,	3,	1,	1,	0,	// A-Matk�̐݌v�} -> A-Matk
        6983,	4988,	3,	3,	3,	3,	1,	1,	0,	// A-MaxHP�̐݌v�} -> A-MaxHP
        6984,	4989,	3,	3,	3,	3,	1,	1,	0,	// A-MaxSP�̐݌v�} -> A-MaxSP
        25192,	29169,	1,	1,	1,	0,	1,	1,	0,	// A-Mdef�̐݌v�} -> A-Mdef
        6977,	4982,	1,	0,	0,	0,	0,	0,	0,	// A-Str�̐݌v�} -> A-Str
        25189,	29166,	0,	0,	0,	0,	0,	0,	0,	// A-Tolerance�̐݌v�} -> A-Tolerance
        6975,	4980,	3,	3,	3,	3,	1,	1,	0,	// C-HPR�̐݌v�} -> C-HPR
        6973,	4978,	3,	3,	3,	3,	1,	1,	0,	// C-Life�̐݌v�} -> C-Life
        6974,	4979,	3,	3,	3,	3,	1,	1,	0,	// C-Soul�̐݌v�} -> C-Soul
        6976,	4981,	3,	3,	3,	3,	1,	1,	0,	// C-SPR�̐݌v�} -> C-SPR
        6965,	4970,	1,	0,	0,	0,	0,	0,	3,	// E-Fire�̐݌v�} -> E-Fire
        6967,	4972,	1,	0,	0,	0,	0,	0,	3,	// E-Ground�̐݌v�} -> E-Ground
        6966,	4971,	1,	0,	0,	0,	0,	0,	3,	// E-Water�̐݌v�} -> E-Water
        6968,	4973,	1,	0,	0,	0,	0,	0,	3,	// E-Wind�̐݌v�} -> E-Wind
        6969,	4974,	0,	3,	0,	1,	1,	1,	0,	// R-Fire�̐݌v�} -> R-Fire
        6971,	4976,	0,	3,	0,	1,	1,	1,	0,	// R-Ground�̐݌v�} -> R-Ground
        6970,	4975,	0,	3,	0,	1,	1,	1,	0,	// R-Water�̐݌v�} -> R-Water
        6972,	4977,	0,	3,	0,	1,	1,	1,	0,	// R-Wind�̐݌v�} -> R-Wind
        25193,	29170,	0,	0,	1,	0,	0,	0,	4,	// S-Atk�̐݌v�} -> S-Atk
        25195,	29172,	0,	0,	1,	0,	0,	0,	4,	// S-Avoid�̐݌v�} -> S-Avoid
        25198,	29175,	0,	0,	1,	0,	0,	0,	4,	// S-Cri�̐݌v�} -> S-Cri
        25194,	29171,	0,	0,	1,	0,	0,	0,	4,	// S-Matk�̐݌v�} -> S-Matk
        25196,	29173,	0,	0,	1,	0,	0,	0,	4,	// S-MaxHP�̐݌v�} -> S-MaxHP
        25197,	29174,	0,	0,	1,	0,	0,	0,	4,	// S-Quick�̐݌v�} -> S-Quick
        25440,	29444,	1,	1,	1,	1,	1,	1,	5,	// Z-CastFixed�̐݌v�} -> Z-CastFixed
        25439,	29443,	0,	0,	1,	0,	1,	1,	5,	// Z-Clairvoyance�̐݌v�} -> Z-Clairvoyance
        25435,	29439,	1,	0,	0,	0,	0,	0,	5,	// Z-Immortal�̐݌v�} -> Z-Immortal
        25436,	29440,	1,	1,	1,	1,	1,	1,	5,	// Z-Killgain�̐݌v�} -> Z-Killgain
        25434,	29438,	1,	1,	1,	0,	0,	0,	5,	// Z-Knockback�̐݌v�} -> Z-Knockback
        25438,	29442,	1,	1,	1,	0,	1,	1,	5,	// Z-NoDispell�̐݌v�} -> Z-NoDispell
        25437,	29441,	0,	0,	1,	0,	1,	1,	5;	// Z-Reincarnation�̐݌v�} -> Z-Reincarnation
    
	.@size = getarraysize(.@list);

    .@menu_cnt = 0;
    .@menu$ = "";
	for ( .@i = 0; .@i < .@size; .@i += 9 ) {
        if( .@list[.@i+.@offset] > 0 ){
            if (countitem(.@list[.@i]) < 1)
                .@menu$ += sprintf( "^aaaaaa%s (Missing)^000000:", getitemname(.@list[.@i]) );
            else
                .@menu$ += sprintf( "%s:", getitemname(.@list[.@i]) );
            .@menu_offset[.@menu_cnt] = .@i;
            .@menu_cnt++;
        }
	}
	mes "[RS26]";
	mes "" + strcharinfo(0) + ",";
	mes "�t�^�V�^�C�@�G���`�����g�@���@�I���V�e�@�N�_�T�C";
	next;
	.@s = select("�~�߂�:" + .@menu$) - 2;
	if (.@s < 0) {
		mes "[RS26]";
		mes "�o�C�o�C�B";
		close;
	}
	.@s = .@menu_offset[.@s];
	.@item_req = .@list[.@s];
	.@item_enchant_id = .@list[.@s+1];
	.@item_enchant_ig = .@list[.@s+8];

	.@equip_id = getequipid(.@part);
	.@equip_refine = getequiprefinerycnt(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	if (countitem(.@item_req) < 1) {
		mes "[RS26]";
		mes "�o�C�o�C�B";
		close;
	}
    .@max_num_enchant = .@list[.@s+.@offset];

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)) {
		mes "[RS26]";
		mes "�x���I�x���I�I";
		mes "�������@�n�Y�V�^�@�����C�R�@�K�@�C�}�X�B";
		close;
	}

	if (.@card[0] > 0 && .@item_enchant_id == .@card[0]) { .@slot_sum++; }
	if (.@card[1] > 0 && .@item_enchant_id == .@card[1]) { .@slot_sum++; }
	if (.@card[2] > 0 && .@item_enchant_id == .@card[2]) { .@slot_sum++; }
	if (.@card[3] > 0 && .@item_enchant_id == .@card[3]) { .@slot_sum++; }

	if (.@item_enchant_ig > 0 ) {
		.@num_ig_enchanted = 0;
		for ( .@i = 0; .@i < .@size; .@i += 9 ) {
			if( .@item_enchant_ig == .@list[.@i+6] ){
				.@check_item_id = .@list[.@i+1];
				.@num_ig_enchanted = .@num_ig_enchanted + countinarray(.@card[0],.@check_item_id);
			}
		}
		if( .@num_ig_enchanted > 0){
			mes "[RS26]";
			mes "�w��V�^�@�G���`�����g�@�n�@���j�t�^�T���e�C���@�G���`�����g�@�g�@�����V�}�X�B","�����i�@�g�~�����Z�@�f�X�B";
			close;
		}
	}
	if (.@slot_sum >= .@max_num_enchant) {
		mes "[RS26]";
		mes "�R�m�@�G���`�����g�@�n�@�ő�" + .@max_num_enchant + "��}�f�f�X�B���j�@����j�@���B�V�e�C�}�X�B";
		close;
	}
	if (.@card[1] != 0) {
		mes "[RS26]";
		mes "�R���ȏ�@�G���`�����g�@�f�L�}�Z���B";
		close;
	}

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)) {
		mes "[RS26]";
		mes "�x���I�x���I�I";
		mes "�������@�n�Y�V�^�@�����C�R�@�K�@�C�}�X�B";
		close;
	}

	switch( .@equip_id ) {
	case 15376:
	case 15377:
	case 20933:
	case 20934:
	case 22196:
	case 22197:
	case 32207:
	case 32208:
	case 32209:
	case 32210:
    case 460004:
		break;
	default:
		mes "[RS26]";
		mes "�G���`�����g�@�j�@�Ή��V�e�C�i�C�@�A�C�e���@�f�X�B";
		close;
	}
	mes "[RS26]^0000ff";
	mes "�I���V�^�m�n " + getequipname(.@part) + " + " + getitemname(.@item_req) + "�f�X�l,";
	mes "^000000------------------";
	mes "�R�m�G���`�����g�@�n�@�ő� ^0000ff" + .@max_num_enchant + " ��}�f�@�G���`�����g�@�\, ^000000�f, �R���}�f ^0000ff" + .@slot_sum + " ��@�G���`�����g�@�V�e�C�}�X^000000, ���s�V�}�X�J�H";
	next;
	if (select( "�~�߂�", "���s����" ) == 1) {
		mes "[RS26]";
		mes "�o�C�o�C~";
		close;
	}

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)){
		mes "[RS26]";
		mes "�x���I�x���I�I";
		mes "�������@�n�Y�V�^�@�����C�R�@�K�@�C�}�X�B";
        close;
    }

	if (.@card[3] == 0) {
		.@enchant_count = 1;
		.@card[3] = .@item_enchant_id;
	}
	else if (.@card[2] == 0) {
		.@enchant_count = 2;
		.@card[2] = .@item_enchant_id;
	}
	else if (.@card[1] == 0) {
		.@enchant_count = 3;
		.@card[1] = .@item_enchant_id;
	}
	else {
		mes "[RS26]";
        mes "�G���[";
		mes "�R���ȏ�@�G���`�����g�@�f�L�}�Z���B";
		mes "GM�j�@�񍐃V�e�@�N�_�T�C�B";
		close;
	}
	specialeffect2 EF_REPAIRWEAPON;
	mes "[RS26]";
	if (.@enchant_count < 5)
		mes "^990000" + .@enchant_count + " ���^000000�@�m�@�G���`�����g�@���@���s�V�}�V�^�B";
	else
		mes "For additional performance equipment^990000 ^000000 upgrade.";	// never displayed

	delitem .@item_req, 1;
	delequip .@part;
	getitem2 .@equip_id,1,1,.@equip_refine,0,.@card[0],.@card[1],.@card[2],.@card[3];
	close;
}
