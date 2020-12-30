ven_in01,104,110,3	script	リベリオン隊員	4_F_REBELLION3 ,{    //4_F_REBELLION3
	mes "[リベリオン隊員]";
	mes "イルシオンエンチャントに必要な設計図を販売している。";
	mes "500ポイントで一つ売るけれどいるかい？";
	next;
	if( select("欲しい","要らない") == 2 ){
		mes "[リベリオン隊員]";
		mes "欲しくなったらまた来な。";
		close;
	}
	if( #CASHPOINTS < 500 ){
		mes "[リベリオン隊員]";
		mes "おいおい、対価が足りないぜ？";
		close;
	}
	setarray .@list[0],25670,25671,25678,25679,25684,25685,25686,25687,25688,25689,25690,25691,25692,25693,25694,25695,25696,25697,25698,25699,25700,25701,25702,25703,25704,6965,6966,6967,6968,6969,6970,6971,6972,6973,6974,6975,6976,6977,6978,6979,6980,6981,6982,6983,6984,6985,6986,25189,25190,25191,25192,25193,25194,25195,25196,25197,25198,25434,25435,25436,25437,25438,25439,25440,1000312,1000313,1000314,1000315,25663,25189,25190,25191,25192,25193,25194,25195,25196,25197,25198,25705;
	getitem .@list[rand(getarraysize(.@list))],1;
	#CASHPOINTS -= 500;
	mes "[リベリオン隊員]";
	mes "また欲しくなったら来な。";
	close;
}

ven_in01,108,110,4	script	RS26	4_SYS_MSG,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000インベントリの中身を減らして来て下さい^000000";
		close;
	}
	mes "[RS26]";
	mes "ヨウコソ" + strcharinfo(0) + ",";
	mes "イルシオンエンチャント　ヲ　シマスカ？";
	next;
    setarray .@indices, EQI_ARMOR, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
    setarray .@tbl_offset, 2, 5, 3, 4, 6, 7;
    .@indlen = getarraysize(.@tbl_offset);
    .@menu$ = "";
	for(.@i = 0; .@i < .@indlen; .@i++)
		.@menu$ = .@menu$ + (getequipisequiped(.@indices[.@i]) ? getequipname(.@indices[.@i]) : F_getpositionname(.@indices[.@i]) +"-[Not equipped]") +":";
    .@menu$ = .@menu$ + "詳しく教えて";

    .@sel = select(.@menu$)-1;
    if( .@sel == .@indlen ){
		mes "[RS26]";
		mes "MDデ　入手シタ　イルシオン装備　ニ　設計図ヲ　使用シテ　エンチャント　デキマス。";
		next;
		mes "[RS26]";
		mes "設計図ハ　リベリオン隊員　カラ　買ッテ　クダサイ。";
		next;
		mes "[RS26]";
		mes "ワタシ　エンチャント　ハ　失敗シマセンノデ。";
		close;
    }
    .@part = .@indices[.@sel];
    .@offset = .@tbl_offset[.@sel];

	// <item ID required>, <item enchant ID>, <max number of this enchant on armor>, <max number of this enchant on garment>, leg,shield,acc(L),acc(R),<enchant group>
	setarray .@list[0],
        25687,	29534,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-Atk) -> B-Atk
        25670,	29527,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-Def) -> B-Def
        25678,	29529,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-HPR) -> B-HPR
        25688,	29535,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-Matk) -> B-Matk
        25684,	29531,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-MaxHP) -> B-MaxHP
        25685,	29530,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-MaxSP) -> B-MaxSP
        25671,	29528,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-Mdef) -> B-Mdef
        25679,	29532,	3,	3,	3,	3,	3,	3,	0,	// 改造モジュール(B-SPR) -> B-SPR
        25696,	29543,	1,	0,	0,	0,	0,	0,	1,	// 改造モジュール(G-DrainHP) -> G-DrainHP
        25697,	29544,	1,	0,	0,	0,	0,	0,	1,	// 改造モジュール(G-DrainSP) -> G-DrainSP
        25698,	29545,	1,	0,	0,	0,	0,	0,	1,	// 改造モジュール(G-Life) -> G-Life
        25699,	29546,	1,	0,	0,	0,	0,	0,	1,	// 改造モジュール(G-Soul) -> G-Soul
        25695,	29542,	1,	1,	1,	0,	1,	1,	0,	// 改造モジュール(Q-Attribute) -> Q-Attribute
        25694,	29541,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-CastFixed) -> Q-CastFixed
        25691,	29538,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-CastStat) -> Q-CastStat
        25693,	29540,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-Delay) -> Q-Delay
        25692,	29539,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-Fatal) -> Q-Fatal
        25686,	29533,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-Heal) -> Q-Heal
        25663,	29511,	1,	1,	1,	0,	0,	0,	0,	// 改造モジュール(Q-Player) -> Q-Player
        25689,	29536,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-Shooter) -> Q-Shooter
        25690,	29537,	1,	1,	1,	1,	1,	1,	0,	// 改造モジュール(Q-Speed) -> Q-Speed
        25704,	29551,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-FatalFlash) -> X-FatalFlash
        25702,	29549,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-FiringShot) -> X-FiringShot
        25705,	29552,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-LuckyStrike) -> X-LuckyStrike
        25703,	29550,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-OverPower) -> X-OverPower
        25701,	29548,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-SpellBuster) -> X-SpellBuster
        25700,	29547,	0,	1,	0,	0,	0,	0,	2,	// 改造モジュール(X-UnlimitVital) -> X-UnlimitVital
        1000312,	310270,	0,	0,	0,	1,	0,	0,	6,	// 改造モジュール(T-PowerBoost) -> T-PowerBoost
        1000313,	310271,	0,	0,	0,	1,	0,	0,	6,	// 改造モジュール(T-MagicBoost) -> T-MagicBoost
        1000314,	310272,	0,	0,	0,	1,	0,	0,	6,	// 改造モジュール(T-Assault) -> T-Assault
        1000315,	310273,	0,	0,	0,	1,	0,	0,	6,	// 改造モジュール(T-Electricity) -> T-Electricity
        6986,	4991,	1,	1,	1,	0,	1,	1,	0,	// A-ASPDの設計図 -> A-ASPD
        6981,	4986,	3,	3,	3,	3,	1,	1,	0,	// A-Atkの設計図 -> A-Atk
        6980,	4985,	1,	1,	0,	0,	1,	1,	0,	// A-Avoidの設計図 -> A-Avoid
        6979,	4984,	3,	3,	3,	0,	1,	1,	0,	// A-Defの設計図 -> A-Def
        25191,	29168,	0,	0,	1,	1,	1,	1,	0,	// A-Fleeの設計図 -> A-Flee
        6985,	4990,	1,	0,	0,	0,	0,	0,	0,	// A-Frozenの設計図 -> A-Frozen
        25190,	29167,	0,	0,	1,	1,	1,	1,	0,	// A-Hitの設計図 -> A-Hit
        6978,	4983,	1,	0,	0,	0,	0,	0,	0,	// A-Intの設計図 -> A-Int
        6982,	4987,	3,	3,	3,	3,	1,	1,	0,	// A-Matkの設計図 -> A-Matk
        6983,	4988,	3,	3,	3,	3,	1,	1,	0,	// A-MaxHPの設計図 -> A-MaxHP
        6984,	4989,	3,	3,	3,	3,	1,	1,	0,	// A-MaxSPの設計図 -> A-MaxSP
        25192,	29169,	1,	1,	1,	0,	1,	1,	0,	// A-Mdefの設計図 -> A-Mdef
        6977,	4982,	1,	0,	0,	0,	0,	0,	0,	// A-Strの設計図 -> A-Str
        25189,	29166,	0,	0,	0,	0,	0,	0,	0,	// A-Toleranceの設計図 -> A-Tolerance
        6975,	4980,	3,	3,	3,	3,	1,	1,	0,	// C-HPRの設計図 -> C-HPR
        6973,	4978,	3,	3,	3,	3,	1,	1,	0,	// C-Lifeの設計図 -> C-Life
        6974,	4979,	3,	3,	3,	3,	1,	1,	0,	// C-Soulの設計図 -> C-Soul
        6976,	4981,	3,	3,	3,	3,	1,	1,	0,	// C-SPRの設計図 -> C-SPR
        6965,	4970,	1,	0,	0,	0,	0,	0,	3,	// E-Fireの設計図 -> E-Fire
        6967,	4972,	1,	0,	0,	0,	0,	0,	3,	// E-Groundの設計図 -> E-Ground
        6966,	4971,	1,	0,	0,	0,	0,	0,	3,	// E-Waterの設計図 -> E-Water
        6968,	4973,	1,	0,	0,	0,	0,	0,	3,	// E-Windの設計図 -> E-Wind
        6969,	4974,	0,	3,	0,	1,	1,	1,	0,	// R-Fireの設計図 -> R-Fire
        6971,	4976,	0,	3,	0,	1,	1,	1,	0,	// R-Groundの設計図 -> R-Ground
        6970,	4975,	0,	3,	0,	1,	1,	1,	0,	// R-Waterの設計図 -> R-Water
        6972,	4977,	0,	3,	0,	1,	1,	1,	0,	// R-Windの設計図 -> R-Wind
        25193,	29170,	0,	0,	1,	0,	0,	0,	4,	// S-Atkの設計図 -> S-Atk
        25195,	29172,	0,	0,	1,	0,	0,	0,	4,	// S-Avoidの設計図 -> S-Avoid
        25198,	29175,	0,	0,	1,	0,	0,	0,	4,	// S-Criの設計図 -> S-Cri
        25194,	29171,	0,	0,	1,	0,	0,	0,	4,	// S-Matkの設計図 -> S-Matk
        25196,	29173,	0,	0,	1,	0,	0,	0,	4,	// S-MaxHPの設計図 -> S-MaxHP
        25197,	29174,	0,	0,	1,	0,	0,	0,	4,	// S-Quickの設計図 -> S-Quick
        25440,	29444,	1,	1,	1,	1,	1,	1,	5,	// Z-CastFixedの設計図 -> Z-CastFixed
        25439,	29443,	0,	0,	1,	0,	1,	1,	5,	// Z-Clairvoyanceの設計図 -> Z-Clairvoyance
        25435,	29439,	1,	0,	0,	0,	0,	0,	5,	// Z-Immortalの設計図 -> Z-Immortal
        25436,	29440,	1,	1,	1,	1,	1,	1,	5,	// Z-Killgainの設計図 -> Z-Killgain
        25434,	29438,	1,	1,	1,	0,	0,	0,	5,	// Z-Knockbackの設計図 -> Z-Knockback
        25438,	29442,	1,	1,	1,	0,	1,	1,	5,	// Z-NoDispellの設計図 -> Z-NoDispell
        25437,	29441,	0,	0,	1,	0,	1,	1,	5;	// Z-Reincarnationの設計図 -> Z-Reincarnation
    
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
	mes "付与シタイ　エンチャント　ヲ　選択シテ　クダサイ";
	next;
	.@s = select("止める:" + .@menu$) - 2;
	if (.@s < 0) {
		mes "[RS26]";
		mes "バイバイ。";
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
		mes "バイバイ。";
		close;
	}
    .@max_num_enchant = .@list[.@s+.@offset];

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)) {
		mes "[RS26]";
		mes "警告！警告！！";
		mes "装備ヲ　ハズシタ　ワルイコ　ガ　イマス。";
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
			mes "指定シタ　エンチャント　ハ　既ニ付与サレテイル　エンチャント　ト　競合シマス。","無効ナ　組ミ合ワセ　デス。";
			close;
		}
	}
	if (.@slot_sum >= .@max_num_enchant) {
		mes "[RS26]";
		mes "コノ　エンチャント　ハ　最大" + .@max_num_enchant + "回マデデス。既ニ　上限ニ　到達シテイマス。";
		close;
	}
	if (.@card[1] != 0) {
		mes "[RS26]";
		mes "コレ以上　エンチャント　デキマセン。";
		close;
	}

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)) {
		mes "[RS26]";
		mes "警告！警告！！";
		mes "装備ヲ　ハズシタ　ワルイコ　ガ　イマス。";
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
		mes "エンチャント　ニ　対応シテイナイ　アイテム　デス。";
		close;
	}
	mes "[RS26]^0000ff";
	mes "選択シタノハ " + getequipname(.@part) + " + " + getitemname(.@item_req) + "デスネ,";
	mes "^000000------------------";
	mes "コノエンチャント　ハ　最大 ^0000ff" + .@max_num_enchant + " 回マデ　エンチャント　可能, ^000000デ, コレマデ ^0000ff" + .@slot_sum + " 回　エンチャント　シテイマス^000000, 実行シマスカ？";
	next;
	if (select( "止める", "実行する" ) == 1) {
		mes "[RS26]";
		mes "バイバイ~";
		close;
	}

	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipCardHack", .@part, .@card[0], .@card[1], .@card[2], .@card[3]) || callfunc("F_IsEquipRefineHack", .@part, .@equip_refine)){
		mes "[RS26]";
		mes "警告！警告！！";
		mes "装備ヲ　ハズシタ　ワルイコ　ガ　イマス。";
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
        mes "エラー";
		mes "コレ以上　エンチャント　デキマセン。";
		mes "GMニ　報告シテ　クダサイ。";
		close;
	}
	specialeffect2 EF_REPAIRWEAPON;
	mes "[RS26]";
	if (.@enchant_count < 5)
		mes "^990000" + .@enchant_count + " 回目^000000　ノ　エンチャント　ヲ　実行シマシタ。";
	else
		mes "For additional performance equipment^990000 ^000000 upgrade.";	// never displayed

	delitem .@item_req, 1;
	delequip .@part;
	getitem2 .@equip_id,1,1,.@equip_refine,0,.@card[0],.@card[1],.@card[2],.@card[3];
	close;
}
