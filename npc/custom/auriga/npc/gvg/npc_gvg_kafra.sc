//=========================================================================
// �A�W�g�ꑮ�J�v���̃��j���[�t�@���N�V����
//	callfunc "GvKafraMenu";
//-------------------------------------------------------------------------

function	script	GvKafraMenu	{
	cutin "kafra_01",2;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//.@map$�ȊO�̓_�~�[
	set .@gid,getcastledata(.@map$,1);
	if(.@gid == 0 || getcharid(2) != .@gid) {
		mes "[�J�v���E��]";
		mes "���́A�M���h";
		mes "^ff0000" + getguildname(.@gid) + "^000000";
		mes "�̊F�l�ɂ������d������悤��";
		mes "�_�񂳂�Ă���܂��B";
		mes "���̃J�v���T�[�r�X��";
		mes "�����p���������܂��B";
		close2;
		cutin "kafra_01",255;
		end;
	}
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂�^ff0000" +getguildname(.@gid)+ "^000000�̊F����";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	next;
	return;
}


//-------------------------------------------
// �� �J�v���̃��C�������̏�����
//    npc_town_kafra.txt����function�Q��
//-------------------------------------------

//==========================================
// ���C�[�i
//------------------------------------------
-	script	AgitKafra_L0	-1,{
	callfunc "GvKafraMenu";
	set .@code,17;
	set .@price,200;
	callfunc "KafraMain",3,0x1ce,0,0,0,0,0,0,40,800,.@code,.@price;
	end;
}

aldeg_cas01,218,170,0	duplicate(AgitKafra_L0)	�J�v���E��::AgitKafra_L1	117
aldeg_cas02,84,74,0		duplicate(AgitKafra_L0)	�J�v���E��::AgitKafra_L2	117
aldeg_cas03,118,76,0	duplicate(AgitKafra_L0)	�J�v���E��::AgitKafra_L3	117
aldeg_cas04,45,88,0		duplicate(AgitKafra_L0)	�J�v���E��::AgitKafra_L4	117
aldeg_cas05,31,190,0	duplicate(AgitKafra_L0)	�J�v���E��::AgitKafra_L5	117

//==========================================
// �u���g�j�A
//------------------------------------------
-	script	AgitKafra_B0	-1,{
	callfunc "GvKafraMenu";
	set .@code,15;
	set .@price,200;
	callfunc "KafraMain",3,0x1ce,0,0,0,0,0,0,40,800,.@code,.@price;
	end;
}

gefg_cas01,83,47,3		duplicate(AgitKafra_B0)	�J�v���E��::AgitKafra_B1	117
gefg_cas02,23,66,3		duplicate(AgitKafra_B0)	�J�v���E��::AgitKafra_B2	117
gefg_cas03,116,89,5		duplicate(AgitKafra_B0)	�J�v���E��::AgitKafra_B3	117
gefg_cas04,59,70,3		duplicate(AgitKafra_B0)	�J�v���E��::AgitKafra_B4	117
gefg_cas05,61,52,5		duplicate(AgitKafra_B0)	�J�v���E��::AgitKafra_B5	117

//==========================================
// �`��������
//------------------------------------------
-	script	AgitKafra_C0	-1,{
	callfunc "GvKafraMenu";
	set .@code,16;
	set .@price,200;
	callfunc "KafraMain",3,0x1ce,0,0,0,0,0,0,40,800,.@code,.@price;
	end;
}

payg_cas01,128,58,3		duplicate(AgitKafra_C0)	�J�v���E��::AgitKafra_C1	117
payg_cas02,22,275,5		duplicate(AgitKafra_C0)	�J�v���E��::AgitKafra_C2	117
payg_cas03,9,263,5		duplicate(AgitKafra_C0)	�J�v���E��::AgitKafra_C3	117
payg_cas04,40,235,1		duplicate(AgitKafra_C0)	�J�v���E��::AgitKafra_C4	117
payg_cas05,276,227,1	duplicate(AgitKafra_C0)	�J�v���E��::AgitKafra_C5	117

//==========================================
// ���@���L���[������
//------------------------------------------
-	script	AgitKafra_V0	-1,{
	callfunc "GvKafraMenu";
	set .@code,14;
	set .@price,200;
	callfunc "KafraMain",3,0x1ce,0,0,0,0,0,0,40,800,.@code,.@price;
	end;
}

prtg_cas01,96,173,0		duplicate(AgitKafra_V0)	�J�v���E��::AgitKafra_V1	117
prtg_cas02,71,36,4		duplicate(AgitKafra_V0)	�J�v���E��::AgitKafra_V2	117
prtg_cas03,181,215,4	duplicate(AgitKafra_V0)	�J�v���E��::AgitKafra_V3	117
prtg_cas04,258,247,4	duplicate(AgitKafra_V0)	�J�v���E��::AgitKafra_V4	117
prtg_cas05,52,41,4		duplicate(AgitKafra_V0)	�J�v���E��::AgitKafra_V5	117