//=========================================================================
// �M���h�t���b�O���ʃt�@���N�V����
//	callfunc "FlagSrc",AreaIndex,"MAP",X,Y;
//
// �� �����̏ڍ�
//	AreaIndex -> 0:���C�[�i�A1:���̑�
//-------------------------------------------------------------------------

function	script	FlagSrc	{
	set .@gid,getcastledata(getarg(1),1);
	if(.@gid > 0 && getcharid(2)==.@gid && getarg(2)) {	//���M���h��X���W�̒l�������true
		mes "[ �� ]";
		mes "�E�҂�c";
		mes "�N�̒n�ɋA�邩�H";
		next;
		if(select("�ԂɋA��","��߂�")==1) {
			//�I��҂����ɏ�傪�ύX���ꂽ�ꍇ���l�����čēx�`�F�b�N
			set .@gid,getcastledata(getarg(1),1);
			if(.@gid > 0 && getcharid(2)==.@gid && getarg(2)) {
				warp getarg(1),getarg(2),getarg(3);
				end;
			}
		}
		return;
	}
	mes "[ ���[���~�b�h�K�b�c������ ]";
	mes " ";
	mes "1.";
	switch(getarg(0)) {
	case 0:
		mes "������̓��[���~�b�h�K�b�c������";
		mes "�V���o���c�o���h���a���̋���ɂ��A";
		break;
	case 1:
		mes "������̓��[���~�b�h�K�b�c������";
		mes "�����";
		break;
	}
	if(.@gid <= 0) {
		mes "�������L�҂��Ȃ��A�W�g�ł��邱�Ƃ�";
		mes "���\����B";
		next;
		mes " ";
		mes "2.";
		mes "�����������Ă��鐦����";
		mes "�����ɏ����āA�G���y���E����";
		mes "�j�󂷂�E�҂ɂ͍�����";
		mes "�F�肷��A�W�g���L�������^�����";
	}
	else {
		mes "�M���h ^ff0000 " +getguildname(.@gid)+ " ^000000��";
		mes "���L�ł��邱�Ƃ�F�߂��Ă���B";
		next;
		mes " ";
		mes "2.";
		mes "^ff0000 " +getguildname(.@gid)+ " ^000000 �̃}�X�^�[��";
		mes "^ff0000 " +getguildmaster(.@gid)+ " ^000000�ł���B";
		mes "����Ɉًc�̂���҂́A�������";
		mes "�͂��Ȃ��Ė��_���������Ȃ����B";
	}
	return;
}


//-------------------------------------------
// �� Inter�T�[�o�ڑ�����OnAgitInit���A
//    ���ύX����OnFlagEmb_XY���Ăяo�����
//-------------------------------------------

//==========================================
// L1 : ���C�[�i
//------------------------------------------
-	script	GdFlag_L1	722,{
	callfunc "FlagSrc",0,"aldeg_cas01",0,0;
	close;
OnAgitInit:
OnFlagEmb_L1:
	if(strnpcinfo(0) != "GdFlag_L1")
		flagemblem getcastledata("aldeg_cas01",1);
	end;
}

alde_gld,257,153,7	script	�M���h�t���b�O#L1-00	722,{
	callfunc "FlagSrc",0,"aldeg_cas01",218,170;
	close;
OnAgitInit:
OnFlagEmb_L1:
	flagemblem getcastledata("aldeg_cas01",1);
	end;
}

alde_gld,61,87,6		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-01	722
alde_gld,61,79,6		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-02	722
alde_gld,45,87,8		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-03	722
alde_gld,51,87,8		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-04	722
//aldeg_cas01,30,248,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-05	722
//aldeg_cas01,30,246,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-06	722
//aldeg_cas01,37,248,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-07	722
//aldeg_cas01,37,246,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-08	722
//aldeg_cas01,95,80,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-09	722
//aldeg_cas01,95,59,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-10	722
//aldeg_cas01,62,75,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-11	722
//aldeg_cas01,70,75,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-12	722
//aldeg_cas01,74,75,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-13	722
//aldeg_cas01,62,64,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-14	722
//aldeg_cas01,66,64,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-15	722
//aldeg_cas01,70,64,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-16	722
//aldeg_cas01,74,64,2		duplicate(GdFlag_L1)	�M���h�t���b�O#L1-17	722
//aldeg_cas01,203,150,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-18	722
//aldeg_cas01,210,150,4	duplicate(GdFlag_L1)	�M���h�t���b�O#L1-19	722

//==========================================
// L2 : ���C�[�i
//------------------------------------------
-	script	GdFlag_L2	722,{
	callfunc "FlagSrc",0,"aldeg_cas02",0,0;
	close;
OnAgitInit:
OnFlagEmb_L2:
	if(strnpcinfo(0) != "GdFlag_L2")
		flagemblem getcastledata("aldeg_cas02",1);
	end;
}

alde_gld,257,166,5	script	�M���h�t���b�O#L2-00	722,{
	callfunc "FlagSrc",0,"aldeg_cas02",84,74;
	close;
OnAgitInit:
OnFlagEmb_L2:
	flagemblem getcastledata("aldeg_cas02",1);
	end;
}

//aldeg_cas02,82,71,2		duplicate(GdFlag_L2)	�M���h�t���b�O#L2-01	722
//aldeg_cas02,67,30,2		duplicate(GdFlag_L2)	�M���h�t���b�O#L2-02	722
//aldeg_cas02,183,140,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-03	722
//aldeg_cas02,212,152,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-04	722
//aldeg_cas02,108,39,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-05	722
//aldeg_cas02,57,213,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-06	722
//aldeg_cas02,91,181,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-07	722
//aldeg_cas02,103,53,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-08	722
//aldeg_cas02,73,53,2		duplicate(GdFlag_L2)	�M���h�t���b�O#L2-09	722
//aldeg_cas02,63,41,2		duplicate(GdFlag_L2)	�M���h�t���b�O#L2-10	722
//aldeg_cas02,229,6,2		duplicate(GdFlag_L2)	�M���h�t���b�O#L2-11	722
//aldeg_cas02,230,40,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-12	722
//aldeg_cas02,197,40,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-13	722
//aldeg_cas02,32,213,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-14	722
//aldeg_cas02,88,180,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-15	722
//aldeg_cas02,121,29,2	duplicate(GdFlag_L2)	�M���h�t���b�O#L2-16	722

//==========================================
// L3 : ���C�[�i
//------------------------------------------
-	script	GdFlag_L3	722,{
	callfunc "FlagSrc",0,"aldeg_cas03",0,0;
	close;
OnAgitInit:
OnFlagEmb_L3:
	if(strnpcinfo(0) != "GdFlag_L3")
		flagemblem getcastledata("aldeg_cas03",1);
	end;
}

alde_gld,262,153,7	script	�M���h�t���b�O#L3-00	722,{
	callfunc "FlagSrc",0,"aldeg_cas03",118,76;
	close;
OnAgitInit:
OnFlagEmb_L3:
	flagemblem getcastledata("aldeg_cas03",1);
	end;
}

//aldeg_cas03,176,175,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-01	722
//aldeg_cas03,85,103,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-02	722
//aldeg_cas03,77,115,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-03	722
//aldeg_cas03,77,215,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-04	722
//aldeg_cas03,112,107,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-05	722
//aldeg_cas03,112,117,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-06	722
//aldeg_cas03,69,71,2		duplicate(GdFlag_L3)	�M���h�t���b�O#L3-07	722
//aldeg_cas03,91,69,2		duplicate(GdFlag_L3)	�M���h�t���b�O#L3-08	722
//aldeg_cas03,108,60,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-09	722
//aldeg_cas03,121,73,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-10	722
//aldeg_cas03,121,73,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-11	722
//aldeg_cas03,75,102,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-12	722
//aldeg_cas03,199,169,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-13	722
//aldeg_cas03,181,179,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-14	722
//aldeg_cas03,192,44,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-15	722
//aldeg_cas03,88,108,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-16	722
//aldeg_cas03,208,145,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-17	722
//aldeg_cas03,207,75,2	duplicate(GdFlag_L3)	�M���h�t���b�O#L3-18	722
//aldeg_cas03,96,62,2		duplicate(GdFlag_L3)	�M���h�t���b�O#L3-19	722

//==========================================
// L4 : ���C�[�i
//------------------------------------------
-	script	GdFlag_L4	722,{
	callfunc "FlagSrc",0,"aldeg_cas04",0,0;
	close;
OnAgitInit:
OnFlagEmb_L4:
	if(strnpcinfo(0) != "GdFlag_L4")
		flagemblem getcastledata("aldeg_cas04",1);
	end;
}

alde_gld,262,166,5	script	�M���h�t���b�O#L4-00	722,{
	callfunc "FlagSrc",0,"aldeg_cas04",45,88;
	close;
OnAgitInit:
OnFlagEmb_L4:
	flagemblem getcastledata("aldeg_cas04",1);
	end;
}

//aldeg_cas04,167,61,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-01	722
//aldeg_cas04,164,90,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-02	722
//aldeg_cas04,143,209,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-03	722
//aldeg_cas04,129,193,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-04	722
//aldeg_cas04,112,206,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-05	722
//aldeg_cas04,113,212,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-06	722
//aldeg_cas04,77,117,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-07	722
//aldeg_cas04,186,42,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-08	722
//aldeg_cas04,30,69,2		duplicate(GdFlag_L4)	�M���h�t���b�O#L4-09	722
//aldeg_cas04,55,97,2		duplicate(GdFlag_L4)	�M���h�t���b�O#L4-10	722
//aldeg_cas04,45,98,2		duplicate(GdFlag_L4)	�M���h�t���b�O#L4-11	722
//aldeg_cas04,33,116,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-12	722
//aldeg_cas04,130,180,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-13	722
//aldeg_cas04,129,193,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-14	722
//aldeg_cas04,142,209,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-15	722
//aldeg_cas04,33,107,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-16	722
//aldeg_cas04,133,220,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-17	722
//aldeg_cas04,169,22,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-18	722
//aldeg_cas04,169,15,2	duplicate(GdFlag_L4)	�M���h�t���b�O#L4-19	722

//==========================================
// L5 : ���C�[�i
//------------------------------------------
-	script	GdFlag_L5	722,{
	callfunc "FlagSrc",0,"aldeg_cas05",0,0;
	close;
OnAgitInit:
OnFlagEmb_L5:
	if(strnpcinfo(0) != "GdFlag_L5")
		flagemblem getcastledata("aldeg_cas05",1);
	end;
}

alde_gld,267,153,7	script	�M���h�t���b�O#L5-00	722,{
	callfunc "FlagSrc",0,"aldeg_cas05",31,190;
	close;
OnAgitInit:
OnFlagEmb_L5:
	flagemblem getcastledata("aldeg_cas05",1);
	end;
}

//aldeg_cas05,170,85,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-01	722
//aldeg_cas05,142,212,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-02	722
//aldeg_cas05,149,196,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-03	722
//aldeg_cas05,41,180,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-04	722
//aldeg_cas05,38,201,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-05	722
//aldeg_cas05,65,182,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-06	722
//aldeg_cas05,65,205,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-07	722
//aldeg_cas05,10,218,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-08	722
//aldeg_cas05,164,201,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-09	722
//aldeg_cas05,216,96,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-10	722
//aldeg_cas05,217,80,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-11	722
//aldeg_cas05,14,117,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-12	722
//aldeg_cas05,10,225,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-13	722
//aldeg_cas05,187,59,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-14	722
//aldeg_cas05,154,51,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-15	722
//aldeg_cas05,22,211,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-16	722
//aldeg_cas05,150,202,2	duplicate(GdFlag_L5)	�M���h�t���b�O#L5-17	722

//==========================================
// B1 : �u���g�j�A
//------------------------------------------
-	script	GdFlag_B1	722,{
	callfunc "FlagSrc",1,"gefg_cas01",0,0;
	close;
OnAgit:
OnFlagEmb_B1:
	if(strnpcinfo(0) != "GdFlag_B1")
		flagemblem getcastledata("gefg_cas01",1);
	end;
}

gef_fild07,330,199,2	script	�M���h�t���b�O#B1-00	722,{
	callfunc "FlagSrc",1,"gefg_cas01",83,47;
	close;
OnAgitInit:
OnFlagEmb_B1:
	flagemblem getcastledata("gefg_cas01",1);
	end;
}

gef_fild13,148,51,5		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-01	722
gef_fild13,155,54,5		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-02	722
gef_fild13,212,79,6		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-03	722
gef_fild13,211,71,6		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-04	722
//gefg_cas01,28,157,4		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-05	722
//gefg_cas01,22,156,5		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-06	722
//gefg_cas01,68,185,3		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-07	722
//gefg_cas01,17,171,5		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-08	722
//gefg_cas01,59,16,4		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-09	722
//gefg_cas01,64,16,4		duplicate(GdFlag_B1)	�M���h�t���b�O#B1-10	722

//==========================================
// B2 : �u���g�j�A
//------------------------------------------
-	script	GdFlag_B2	722,{
	callfunc "FlagSrc",1,"gefg_cas02",0,0;
	close;
OnAgitInit:
OnFlagEmb_B2:
	if(strnpcinfo(0) != "GdFlag_B2")
		flagemblem getcastledata("gefg_cas02",1);
	end;
}

gef_fild07,330,204,2	script	�M���h�t���b�O#B2-00	722,{
	callfunc "FlagSrc",1,"gefg_cas02",23,66;
	close;
OnAgitInit:
OnFlagEmb_B2:
	flagemblem getcastledata("gefg_cas02",1);
	end;
}

gef_fild13,303,243,4	duplicate(GdFlag_B2)	�M���h�t���b�O#B2-01	722
gef_fild13,312,243,4	duplicate(GdFlag_B2)	�M���h�t���b�O#B2-02	722
gef_fild13,290,243,4	duplicate(GdFlag_B2)	�M���h�t���b�O#B2-03	722
gef_fild13,324,243,4	duplicate(GdFlag_B2)	�M���h�t���b�O#B2-04	722
//gefg_cas02,65,130,5		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-05	722
//gefg_cas02,30,123,5		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-06	722
//gefg_cas02,65,139,6		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-07	722
//gefg_cas02,37,177,6		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-08	722
//gefg_cas02,37,168,6		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-09	722
//gefg_cas02,68,47,2		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-10	722
//gefg_cas02,68,36,2		duplicate(GdFlag_B2)	�M���h�t���b�O#B2-11	722

//==========================================
// B3 : �u���g�j�A
//------------------------------------------
-	script	GdFlag_B3	722,{
	callfunc "FlagSrc",1,"gefg_cas03",0,0;
	close;
OnAgitInit:
OnFlagEmb_B3:
	if(strnpcinfo(0) != "GdFlag_B3")
		flagemblem getcastledata("gefg_cas03",1);
	end;
}

gef_fild07,330,176,2	script	�M���h�t���b�O#B3-00	722,{
	callfunc "FlagSrc",1,"gefg_cas03",116,89;
	close;
OnAgitInit:
OnFlagEmb_B3:
	flagemblem getcastledata("gefg_cas03",1);
	end;
}

gef_fild13,78,182,4		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-01	722
gef_fild13,87,182,4		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-02	722
gef_fild13,73,295,7		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-03	722
gef_fild13,113,274,7	duplicate(GdFlag_B3)	�M���h�t���b�O#B3-04	722
gef_fild13,144,235,6	duplicate(GdFlag_B3)	�M���h�t���b�O#B3-05	722
gef_fild13,144,244,4	duplicate(GdFlag_B3)	�M���h�t���b�O#B3-06	722
//gefg_cas03,122,220,6	duplicate(GdFlag_B3)	�M���h�t���b�O#B3-07	722
//gefg_cas03,122,229,6	duplicate(GdFlag_B3)	�M���h�t���b�O#B3-08	722
//gefg_cas03,91,257,7		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-09	722
//gefg_cas03,52,276,7		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-10	722
//gefg_cas03,56,164,4		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-11	722
//gefg_cas03,65,164,4		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-12	722
//gefg_cas03,37,214,1		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-13	722
//gefg_cas03,34,208,1		duplicate(GdFlag_B3)	�M���h�t���b�O#B3-14	722

//==========================================
// B4 : �u���g�j�A
//------------------------------------------
-	script	GdFlag_B4	722,{
	callfunc "FlagSrc",1,"gefg_cas04",0,0;
	close;
OnAgitInit:
OnFlagEmb_B4:
	if(strnpcinfo(0) != "GdFlag_B4")
		flagemblem getcastledata("gefg_cas04",1);
	end;
}

gef_fild07,330,171,2	script	�M���h�t���b�O#B4-00	722,{
	callfunc "FlagSrc",1,"gefg_cas04",59,70;
	close;
OnAgitInit:
OnFlagEmb_B4:
	flagemblem getcastledata("gefg_cas04",1);
	end;
}

gef_fild13,190,283,3	duplicate(GdFlag_B4)	�M���h�t���b�O#B4-01	722
gef_fild13,199,274,3	duplicate(GdFlag_B4)	�M���h�t���b�O#B4-02	722
//gefg_cas04,24,157,4		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-03	722
//gefg_cas04,35,158,4		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-04	722
//gefg_cas04,44,184,4		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-05	722
//gefg_cas04,51,184,4		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-06	722
//gefg_cas04,39,212,7		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-07	722
//gefg_cas04,29,212,1		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-08	722
//gefg_cas04,24,73,1		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-09	722
//gefg_cas04,35,73,4		duplicate(GdFlag_B4)	�M���h�t���b�O#B4-10	722

//==========================================
// B5 : �u���g�j�A
//------------------------------------------
-	script	GdFlag_B5	722,{
	callfunc "FlagSrc",1,"gefg_cas05",0,0;
	close;
OnAgitInit:
OnFlagEmb_B5:
	if(strnpcinfo(0) != "GdFlag_B5")
		flagemblem getcastledata("gefg_cas05",1);
	end;
}

gef_fild07,330,166,2	script	�M���h�t���b�O#B5-00	722,{
	callfunc "FlagSrc",1,"gefg_cas05",61,52;
	close;
OnAgitInit:
OnFlagEmb_B5:
	flagemblem getcastledata("gefg_cas05",1);
	end;
}

gef_fild13,302,87,7		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-01	722
gef_fild13,313,83,0		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-02	722
gef_fild13,252,51,2		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-03	722
gef_fild13,26,147,2		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-04	722
//gefg_cas05,77,185,7		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-05	722
//gefg_cas05,92,181,0		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-06	722
//gefg_cas05,83,158,1		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-07	722
//gefg_cas05,62,144,7		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-08	722
//gefg_cas05,62,66,4		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-09	722
//gefg_cas05,69,66,4		duplicate(GdFlag_B5)	�M���h�t���b�O#B5-10	722

//==========================================
// C1 : �`��������
//------------------------------------------
-	script	GdFlag_C1	722,{
	callfunc "FlagSrc",1,"payg_cas01",0,0;
	close;
OnAgitInit:
OnFlagEmb_C1:
	if(strnpcinfo(0) != "GdFlag_C1")
		flagemblem getcastledata("payg_cas01",1);
	end;
}

pay_gld,347,125,2	script	�M���h�t���b�O#C1-00	722,{
	callfunc "FlagSrc",1,"payg_cas01",212,108;
	close;
OnAgitInit:
OnFlagEmb_C1:
	flagemblem getcastledata("payg_cas01",1);
	end;
}

pay_gld,125,236,4		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-01	722
pay_gld,110,233,4		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-02	722
pay_gld,116,233,4		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-03	722
pay_gld,91,239,2		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-04	722
//payg_cas01,238,67,4		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-05	722
//payg_cas01,233,67,4		duplicate(GdFlag_C1)	�M���h�t���b�O#C1-06	722
//payg_cas01,221,123,4	duplicate(GdFlag_C1)	�M���h�t���b�O#C1-07	722
//payg_cas01,221,116,4	duplicate(GdFlag_C1)	�M���h�t���b�O#C1-08	722
//payg_cas01,206,108,4	duplicate(GdFlag_C1)	�M���h�t���b�O#C1-09	722
//payg_cas01,212,108,4	duplicate(GdFlag_C1)	�M���h�t���b�O#C1-10	722

//==========================================
// C2 : �`��������
//------------------------------------------
-	script	GdFlag_C2	722,{
	callfunc "FlagSrc",1,"payg_cas02",0,0;
	close;
OnAgitInit:
OnFlagEmb_C2:
	if(strnpcinfo(0) != "GdFlag_C2")
		flagemblem getcastledata("payg_cas02",1);
	end;
}

pay_gld,347,116,2	script	�M���h�t���b�O#C2-00	722,{
	callfunc "FlagSrc",1,"payg_cas02",22,275;
	close;
OnAgitInit:
OnFlagEmb_C2:
	flagemblem getcastledata("payg_cas02",1);
	end;
}

pay_gld,292,112,6		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-01	722
pay_gld,292,120,6		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-02	722
pay_gld,291,135,6		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-03	722
pay_gld,271,163,0		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-04	722
//payg_cas02,254,40,6		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-05	722
//payg_cas02,254,48,6		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-06	722
//payg_cas02,202,49,0		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-07	722
//payg_cas02,209,49,0		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-08	722
//payg_cas02,59,282,4		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-09	722
//payg_cas02,70,282,4		duplicate(GdFlag_C2)	�M���h�t���b�O#C2-10	722

//==========================================
// C3 : �`��������
//------------------------------------------
-	script	GdFlag_C3	722,{
	callfunc "FlagSrc",1,"payg_cas03",0,0;
	close;
OnAgitInit:
OnFlagEmb_C3:
	if(strnpcinfo(0) != "GdFlag_C3")
		flagemblem getcastledata("payg_cas03",1);
	end;
}

pay_gld,341,106,0	script	�M���h�t���b�O#C3-00	722,{
	callfunc "FlagSrc",1,"payg_cas03",9,263;
	close;
OnAgitInit:
OnFlagEmb_C3:
	flagemblem getcastledata("payg_cas03",1);
	end;
}

pay_gld,321,298,2		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-01	722
pay_gld,321,289,2		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-02	722
pay_gld,327,304,1		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-03	722
pay_gld,333,254,4		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-04	722
//payg_cas03,236,54,2		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-05	722
//payg_cas03,236,45,2		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-06	722
//payg_cas03,259,66,4		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-07	722
//payg_cas03,266,66,4		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-08	722
//payg_cas03,34,31,4		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-09	722
//payg_cas03,43,31,4		duplicate(GdFlag_C3)	�M���h�t���b�O#C3-10	722

//==========================================
// C4 : �`��������
//------------------------------------------
-	script	GdFlag_C4	722,{
	callfunc "FlagSrc",1,"payg_cas04",0,0;
	close;
OnAgitInit:
OnFlagEmb_C4:
	if(strnpcinfo(0) != "GdFlag_C4")
		flagemblem getcastledata("payg_cas04",1);
	end;
}

pay_gld,330,106,0	script	�M���h�t���b�O#C4-00	722,{
	callfunc "FlagSrc",1,"payg_cas04",40,235;
	close;
OnAgitInit:
OnFlagEmb_C4:
	flagemblem getcastledata("payg_cas04",1);
	end;
}

pay_gld,137,160,0		duplicate(GdFlag_C4)	�M���h�t���b�O#C4-01	722
pay_gld,143,160,0		duplicate(GdFlag_C4)	�M���h�t���b�O#C4-02	722
pay_gld,133,151,2		duplicate(GdFlag_C4)	�M���h�t���b�O#C4-03	722
pay_gld,153,166,1		duplicate(GdFlag_C4)	�M���h�t���b�O#C4-04	722
//payg_cas04,255,259,0	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-05	722
//payg_cas04,248,259,0	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-06	722
//payg_cas04,248,168,6	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-07	722
//payg_cas04,248,160,6	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-08	722
//payg_cas04,232,181,4	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-09	722
//payg_cas04,239,181,4	duplicate(GdFlag_C4)	�M���h�t���b�O#C4-10	722

//==========================================
// C5 : �`��������
//------------------------------------------
-	script	GdFlag_C5	722,{
	callfunc "FlagSrc",1,"payg_cas05",0,0;
	close;
OnAgitInit:
OnFlagEmb_C5:
	if(strnpcinfo(0) != "GdFlag_C5")
		flagemblem getcastledata("payg_cas05",1);
	end;
}

pay_gld,318,106,0	script	�M���h�t���b�O#C5-00	722,{
	callfunc "FlagSrc",1,"payg_cas05",276,227;
	close;
OnAgitInit:
OnFlagEmb_C5:
	flagemblem getcastledata("payg_cas05",1);
	end;
}

pay_gld,208,268,4		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-01	722
pay_gld,199,268,4		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-02	722
pay_gld,190,277,3		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-03	722
pay_gld,187,294,2		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-04	722
//payg_cas05,32,249,4		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-05	722
//payg_cas05,24,249,4		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-06	722
//payg_cas05,62,271,0		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-07	722
//payg_cas05,57,271,0		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-08	722
//payg_cas05,55,252,2		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-09	722
//payg_cas05,55,260,2		duplicate(GdFlag_C5)	�M���h�t���b�O#C5-10	722

//==========================================
// V1 : ���@���L���[������
//------------------------------------------
-	script	GdFlag_V1	722,{
	callfunc "FlagSrc",1,"prtg_cas01",0,0;
	close;
OnAgitInit:
OnFlagEmb_V1:
	if(strnpcinfo(0) != "GdFlag_V1")
		flagemblem getcastledata("prtg_cas01",1);
	end;
}

prt_gld,160,210,4	script	�M���h�t���b�O#V1-00	722,{
	callfunc "FlagSrc",1,"prtg_cas01",97,174;
	close;
OnAgitInit:
OnFlagEmb_V1:
	flagemblem getcastledata("prtg_cas01",1);
	end;
}

prt_gld,131,60,6		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-01	722
prt_gld,138,68,6		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-02	722
prt_gld,138,60,6		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-03	722
prt_gld,135,60,6		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-04	722
//prtg_cas01,58,56,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-05	722
//prtg_cas01,64,56,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-06	722
//prtg_cas01,76,32,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-07	722
//prtg_cas01,84,32,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-08	722
//prtg_cas01,94,39,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-09	722
//prtg_cas01,94,24,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-10	722
//prtg_cas01,73,14,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-11	722
//prtg_cas01,73,6,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-12	722
//prtg_cas01,55,46,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-13	722
//prtg_cas01,45,46,4		duplicate(GdFlag_V1)	�M���h�t���b�O#V1-14	722

//==========================================
// V2 : ���@���L���[������
//------------------------------------------
-	script	GdFlag_V2	722,{
	callfunc "FlagSrc",1,"prtg_cas02",0,0;
	close;
OnAgitInit:
OnFlagEmb_V2:
	if(strnpcinfo(0) != "GdFlag_V2")
		flagemblem getcastledata("prtg_cas02",1);
	end;
}

prt_gld,153,213,3	script	�M���h�t���b�O#V2-00	722,{
	callfunc "FlagSrc",1,"prtg_cas02",71,36;
	close;
OnAgitInit:
OnFlagEmb_V2:
	flagemblem getcastledata("prtg_cas02",1);
	end;
}

prt_gld,244,126,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-01	722
prt_gld,244,128,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-02	722
prt_gld,236,126,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-03	722
prt_gld,236,128,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-04	722
//prtg_cas02,40,227,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-05	722
//prtg_cas02,46,227,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-06	722
//prtg_cas02,11,219,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-07	722
//prtg_cas02,11,214,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-08	722
//prtg_cas02,20,219,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-09	722
//prtg_cas02,20,214,4		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-10	722
//prtg_cas02,79,227,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-11	722
//prtg_cas02,70,227,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-12	722
//prtg_cas02,38,189,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-13	722
//prtg_cas02,34,189,8		duplicate(GdFlag_V2)	�M���h�t���b�O#V2-14	722
//prtg_cas02,153,161,4	duplicate(GdFlag_V2)	�M���h�t���b�O#V2-15	722
//prtg_cas02,162,161,4	duplicate(GdFlag_V2)	�M���h�t���b�O#V2-16	722

//==========================================
// V3 : ���@���L���[������
//------------------------------------------
-	script	GdFlag_V3	722,{
	callfunc "FlagSrc",1,"prtg_cas03",0,0;
	close;
OnAgitInit:
OnFlagEmb_V3:
	if(strnpcinfo(0) != "GdFlag_V3")
		flagemblem getcastledata("prtg_cas03",1);
	end;
}

prt_gld,150,220,2	script	�M���h�t���b�O#V3-00	722,{
	callfunc "FlagSrc",1,"prtg_cas03",181,215;
	close;
OnAgitInit:
OnFlagEmb_V3:
	flagemblem getcastledata("prtg_cas03",1);
	end;
}

prt_gld,147,140,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-01	722
prt_gld,147,136,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-02	722
prt_gld,158,140,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-03	722
prt_gld,158,136,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-04	722
//prtg_cas03,168,28,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-05	722
//prtg_cas03,182,28,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-06	722
//prtg_cas03,43,50,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-07	722
//prtg_cas03,48,50,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-08	722
//prtg_cas03,43,58,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-09	722
//prtg_cas03,48,58,4		duplicate(GdFlag_V3)	�M���h�t���b�O#V3-10	722
//prtg_cas03,158,210,4	duplicate(GdFlag_V3)	�M���h�t���b�O#V3-11	722
//prtg_cas03,169,210,4	duplicate(GdFlag_V3)	�M���h�t���b�O#V3-12	722
//prtg_cas03,162,201,4	duplicate(GdFlag_V3)	�M���h�t���b�O#V3-13	722
//prtg_cas03,165,201,4	duplicate(GdFlag_V3)	�M���h�t���b�O#V3-14	722

//==========================================
// V4 : ���@���L���[������
//------------------------------------------
-	script	GdFlag_V4	722,{
	callfunc "FlagSrc",1,"prtg_cas04",0,0;
	close;
OnAgitInit:
OnFlagEmb_V4:
	if(strnpcinfo(0) != "GdFlag_V4")
		flagemblem getcastledata("prtg_cas04",1);
	end;
}

prt_gld,169,220,6	script	�M���h�t���b�O#V4-00	722,{
	callfunc "FlagSrc",1,"prtg_cas04",258,247;
	close;
OnAgitInit:
OnFlagEmb_V4:
	flagemblem getcastledata("prtg_cas04",1);
	end;
}

prt_gld,120,243,6		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-01	722
prt_gld,120,236,6		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-02	722
prt_gld,122,243,6		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-03	722
prt_gld,122,236,6		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-04	722
//prtg_cas04,82,29,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-05	722
//prtg_cas04,75,29,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-06	722
//prtg_cas04,75,27,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-07	722
//prtg_cas04,82,27,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-08	722
//prtg_cas04,59,29,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-09	722
//prtg_cas04,67,29,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-10	722
//prtg_cas04,258,25,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-11	722
//prtg_cas04,258,20,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-12	722
//prtg_cas04,263,20,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-13	722
//prtg_cas04,263,27,4		duplicate(GdFlag_V4)	�M���h�t���b�O#V4-14	722

//==========================================
// V5 : ���@���L���[������
//------------------------------------------
-	script	GdFlag_V5	722,{
	callfunc "FlagSrc",1,"prtg_cas05",0,0;
	close;
OnAgitInit:
OnFlagEmb_V5:
	if(strnpcinfo(0) != "GdFlag_V5")
		flagemblem getcastledata("prtg_cas05",1);
	end;
}

prt_gld,167,213,5	script	�M���h�t���b�O#V5-00	722,{
	callfunc "FlagSrc",1,"prtg_cas05",52,41;
	close;
OnAgitInit:
OnFlagEmb_V5:
	flagemblem getcastledata("prtg_cas05",1);
	end;
}

prt_gld,199,243,2		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-01	722
prt_gld,199,236,2		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-02	722
prt_gld,197,243,2		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-03	722
prt_gld,197,236,2		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-04	722
//prtg_cas05,19,247,4		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-05	722
//prtg_cas05,19,243,4		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-06	722
//prtg_cas05,26,247,4		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-07	722
//prtg_cas05,26,243,4		duplicate(GdFlag_V5)	�M���h�t���b�O#V5-08	722
//prtg_cas05,249,289,4	duplicate(GdFlag_V5)	�M���h�t���b�O#V5-09	722
//prtg_cas05,256,289,4	duplicate(GdFlag_V5)	�M���h�t���b�O#V5-10	722
//prtg_cas05,253,271,4	duplicate(GdFlag_V5)	�M���h�t���b�O#V5-11	722
//prtg_cas05,273,257,4	duplicate(GdFlag_V5)	�M���h�t���b�O#V5-12	722
