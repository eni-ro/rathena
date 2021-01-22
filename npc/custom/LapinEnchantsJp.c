function	script	F_Lapine_Sin_Type1_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_MAXHPPERCENT,1,10,	//MaxHP����
		RDMOPT_VAR_MAXSPPERCENT,1,10,	//MaxSP����
		RDMOPT_VAR_ATTPOWER,1,50,	//Atk����
		RDMOPT_VAR_ATTMPOWER,1,50,	//Matk����
		RDMOPT_VAR_ITEMDEFPOWER,1,100,	//Def����
		RDMOPT_VAR_MDEFPOWER,1,10,	//Mdef����
		RDMOPT_ATTR_TOLERACE_FIRE,5,5,	//�Α����U���Ŏ󂯂�_���[�W����
		RDMOPT_ATTR_TOLERACE_WATER,5,5,	//�������U���Ŏ󂯂�_���[�W����
		RDMOPT_ATTR_TOLERACE_WIND,5,5,	//�������U���Ŏ󂯂�_���[�W����
		RDMOPT_ATTR_TOLERACE_GROUND,5,5;	//�n�����U���Ŏ󂯂�_���[�W����
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type2_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_HITSUCCESSVALUE,1,50,	//Hit����
		RDMOPT_VAR_AVOIDSUCCESSVALUE,1,50;	//Flee����
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type3_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_RACE_DAMAGE_NOTHING,10,20,	//�����U�����A���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_UNDEAD,10,20,	//�����U�����A�s���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_ANIMAL,10,20,	//�����U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_PLANT,10,20,	//�����U�����A�A���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_INSECT,10,20,	//�����U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_FISHS,10,20,	//�����U�����A���L�`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_DEVIL,10,20,	//�����U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_HUMAN,10,20,	//�����U�����A�l�Ԍ`�����X�^�[�ɗ^����_���[�W�����i�v���C���[�ɂ͔������Ȃ��j
		RDMOPT_RACE_DAMAGE_ANGEL,10,20,	//�����U�����A�V�g�`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_DAMAGE_DRAGON,10,20,	//�����U�����A���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_NOTHING,5,10,	//���@�U�����A���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_UNDEAD,5,10,	//���@�U�����A�s���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_ANIMAL,5,10,	//���@�U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_PLANT,5,10,	//���@�U�����A�A���`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_INSECT,5,10,	//���@�U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_FISHS,5,10,	//���@�U�����A���L�`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_DEVIL,5,10,	//���@�U�����A�����`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_HUMAN,5,10,	//���@�U�����A�l�Ԍ`�����X�^�[�ɗ^����_���[�W�����i�v���C���[�ɂ͔������Ȃ��j
		RDMOPT_RACE_MDAMAGE_ANGEL,5,10,	//���@�U�����A�V�g�`�����X�^�[�ɗ^����_���[�W����
		RDMOPT_RACE_MDAMAGE_DRAGON,5,10;	//���@�U�����A���`�����X�^�[�ɗ^����_���[�W����
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type4_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_VAR_PLUSASPDPERCENT,2,10,	//�U�����x����
		RDMOPT_HEAL_VALUE,10,50;	//�q�[���n�X�L���g�p���AHP�񕜗ʑ���
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type5_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_DEC_SPELL_CAST_TIME,5,20,	//�r�����Ԍ���
	RDMOPT_DEC_SPELL_DELAY_TIME,5,20;	//�X�L���f�B���C����
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}

function	script	F_Lapine_Sin_Type6_J	{
	setarray .@list1,RDMOPT_VAR_STRAMOUNT,1,20,	//Str����
		RDMOPT_VAR_AGIAMOUNT,1,20,	//Agi����
		RDMOPT_VAR_VITAMOUNT,1,20,	//Vit����
		RDMOPT_VAR_INTAMOUNT,1,20,	//Int����
		RDMOPT_VAR_DEXAMOUNT,1,20,	//Dex����
		RDMOPT_VAR_LUKAMOUNT,1,20;	//Luk����
	.@sel = rand( getarraysize(.@list1) / 3 )*3;
	set getarg(0), .@list1[.@sel];
	set getarg(1), rand( .@list1[ .@sel + 1 ], .@list1[ .@sel + 2] );

	setarray .@list2,RDMOPT_DAMAGE_SIZE_SMALL_TARGET,10,20,	//�����U�����A���^�����X�^�[�ɗ^����_���[�W����
		RDMOPT_DAMAGE_SIZE_MIDIUM_TARGET,10,20,	//�����U�����A���^�����X�^�[�ɗ^����_���[�W����
		RDMOPT_DAMAGE_SIZE_LARGE_TARGET,10,20,	//�����U�����A��^�����X�^�[�ɗ^����_���[�W����
		RDMOPT_MDAMAGE_SIZE_SMALL_TARGET,5,10,	//���@�U�����A���^�����X�^�[�ɗ^����_���[�W����
		RDMOPT_MDAMAGE_SIZE_MIDIUM_TARGET,5,10,	//���@�U�����A���^�����X�^�[�ɗ^����_���[�W����
		RDMOPT_MDAMAGE_SIZE_LARGE_TARGET,5,10;	//���@�U�����A��^�����X�^�[�ɗ^����_���[�W����
	.@sel = rand( getarraysize(.@list2) / 3 )*3;
	set getarg(2), .@list2[.@sel];
	set getarg(3), rand( .@list2[ .@sel + 1 ], .@list2[ .@sel + 2] );
	return;
}