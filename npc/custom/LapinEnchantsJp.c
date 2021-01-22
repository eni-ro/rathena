function	script	F_Lapine_Sin_Type1_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_MAXHPPERCENT,1,10,	//MaxHP増加
		RDMOPT_VAR_MAXSPPERCENT,1,10,	//MaxSP増加
		RDMOPT_VAR_ATTPOWER,1,50,	//Atk増加
		RDMOPT_VAR_ATTMPOWER,1,50,	//Matk増加
		RDMOPT_VAR_ITEMDEFPOWER,1,100,	//Def増加
		RDMOPT_VAR_MDEFPOWER,1,10,	//Mdef増加
		RDMOPT_ATTR_TOLERACE_FIRE,5,5,	//火属性攻撃で受けるダメージ減少
		RDMOPT_ATTR_TOLERACE_WATER,5,5,	//水属性攻撃で受けるダメージ減少
		RDMOPT_ATTR_TOLERACE_WIND,5,5,	//風属性攻撃で受けるダメージ減少
		RDMOPT_ATTR_TOLERACE_GROUND,5,5;	//地属性攻撃で受けるダメージ減少
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type2_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_HITSUCCESSVALUE,1,50,	//Hit増加
		RDMOPT_VAR_AVOIDSUCCESSVALUE,1,50;	//Flee増加
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type3_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_RACE_DAMAGE_NOTHING,10,20,	//物理攻撃時、無形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_UNDEAD,10,20,	//物理攻撃時、不死形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_ANIMAL,10,20,	//物理攻撃時、動物形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_PLANT,10,20,	//物理攻撃時、植物形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_INSECT,10,20,	//物理攻撃時、昆虫形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_FISHS,10,20,	//物理攻撃時、魚貝形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_DEVIL,10,20,	//物理攻撃時、悪魔形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_HUMAN,10,20,	//物理攻撃時、人間形モンスターに与えるダメージ増加（プレイヤーには発動しない）
		RDMOPT_RACE_DAMAGE_ANGEL,10,20,	//物理攻撃時、天使形モンスターに与えるダメージ増加
		RDMOPT_RACE_DAMAGE_DRAGON,10,20,	//物理攻撃時、竜形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_NOTHING,5,10,	//魔法攻撃時、無形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_UNDEAD,5,10,	//魔法攻撃時、不死形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_ANIMAL,5,10,	//魔法攻撃時、動物形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_PLANT,5,10,	//魔法攻撃時、植物形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_INSECT,5,10,	//魔法攻撃時、昆虫形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_FISHS,5,10,	//魔法攻撃時、魚貝形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_DEVIL,5,10,	//魔法攻撃時、悪魔形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_HUMAN,5,10,	//魔法攻撃時、人間形モンスターに与えるダメージ増加（プレイヤーには発動しない）
		RDMOPT_RACE_MDAMAGE_ANGEL,5,10,	//魔法攻撃時、天使形モンスターに与えるダメージ増加
		RDMOPT_RACE_MDAMAGE_DRAGON,5,10;	//魔法攻撃時、竜形モンスターに与えるダメージ増加
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type4_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_PLUSASPDPERCENT,2,10,	//攻撃速度増加
		RDMOPT_HEAL_VALUE,10,50;	//ヒール系スキル使用時、HP回復量増加
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type5_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_DEC_SPELL_CAST_TIME,5,20,	//詠唱時間減少
	RDMOPT_DEC_SPELL_DELAY_TIME,5,20;	//スキルディレイ減少
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type6_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str増加
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi増加
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit増加
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int増加
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex増加
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk増加
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_DAMAGE_SIZE_SMALL_TARGET,10,20,	//物理攻撃時、小型モンスターに与えるダメージ増加
		RDMOPT_DAMAGE_SIZE_MIDIUM_TARGET,10,20,	//物理攻撃時、中型モンスターに与えるダメージ増加
		RDMOPT_DAMAGE_SIZE_LARGE_TARGET,10,20,	//物理攻撃時、大型モンスターに与えるダメージ増加
		RDMOPT_MDAMAGE_SIZE_SMALL_TARGET,5,10,	//魔法攻撃時、小型モンスターに与えるダメージ増加
		RDMOPT_MDAMAGE_SIZE_MIDIUM_TARGET,5,10,	//魔法攻撃時、中型モンスターに与えるダメージ増加
		RDMOPT_MDAMAGE_SIZE_LARGE_TARGET,5,10;	//魔法攻撃時、大型モンスターに与えるダメージ増加
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}