//=========================================================================
// �����ꊇ�t�@���N�V����
//	callfunc "StewardMain","AgitCode",MasterRoomX,MasterRoomY;
//
// �� parse�I������
//	�����őS��close,end���Ă��邪�A�O�̂��ߌĂяo�����end������
//
// �� function
//	�u�K�[�f�B�A���ݒu�v�̏ꍇ�� function "GuardianCall"���A
//	�u�A�W�g���������v�̏ꍇ�� function "AgitGiveUp" ���Ăяo��(npc_gvg_monster.txt)
//
// �@�� NPC����strnpcinfo()�ANPC�̋���MAP����getmapxy() ���g���Ď��O�Ŏ擾
//-------------------------------------------------------------------------

function	script	StewardMain	{
	//���A����
	function StewardSpeech {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//.@map$�ȊO�̓_�~�[
		set .@gid,getcastledata(.@map$,1);
		if(.@gid <= 0) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "���͉^���ɓ������܂܁A";
			mes "���̎�l�ɂȂ����҂��Ă���܂��B";
			mes "�E�C������́A��x�������̉^����";
			mes "�������ɂȂ��Ă͂������ł��傤�B";
			close;
		}
		if(getcharid(0) != getguildmasterid(.@gid)) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "���Ȃ����������狺�����Ƃ��A";
			mes "���͎��̃}�X�^�[�ł���";
			mes "^ff0000" +getguildmaster(.@gid)+ "^000000�l�ɂ̂�";
			mes "���d������g�ł���B";
			mes "�K�[�f�B�A�������͂ǂ����I";
			mes "�������̖���Ȏғ���Ǖ����Ȃ����I";
			close;
		}
		mes "[����"+strnpcinfo(0)+"]";
		mes "���A��Ȃ����܂��A^ff0000" +strcharinfo(0)+ "^000000 �l�B";
		mes "���Ȃ�Ƃ��\���t�����������܂��B";
		next;
		return;
	}

	//�Ԃ̏�Ԃ�\��
	function StewardConf {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";
		mes "�Ԃ̏�Ԃ����񍐂��܂��B";
		mes " ";
		mes "^0000ff���݂̏��Ɣ��W�l��" +getcastledata(.@map$,2)+ " �ł��B";
		if(getcastledata(.@map$,4) != 0)
			mes "- 1���ȓ��� " +getcastledata(.@map$,4)+ "�̓��������܂����B";
		mes "���݂̖h��l��" +getcastledata(.@map$,3)+ " �ł��B^000000";
		if(getcastledata(.@map$,5) != 0)
			mes "^0000ff- 1���ȓ��� " +getcastledata(.@map$,5)+ "�̓��������܂����B^000000";
		mes " ";
		mes "�ȏ�ł��B";
		return;
	}

	//���Ɣ��W�ɓ���
	function StewardEco {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";
		mes "���Ɣ��W�l�����߂�΁A";
		mes "�M���h�Ő��Y����镨���i�̐���";
		mes "�����܂��̂ŁA��X�̂��߂�";
		mes "�����������̂���낵���ł��傤�B";
		next;
		mes "[����"+strnpcinfo(0)+"]";
		mes "�ʏ����Ɉ��̂ݓ����\�ł����A";
		mes "�ǉ����z�𕥂����Ƃɂ��";
		mes "2��ڂ̓������\�ƂȂ�܂��B";
		next;
		set .@count,getcastledata(.@map$,4);
		if(.@count == 2) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "^ff0000�������A�����͂��ł�2���";
			mes "�����������̂ŁA����ȏ�̓�����";
			mes "�ł��܂���B";
			mes "^000000�܂��܂��̂����W��";
			mes "���҂��Ă���܂��B";
			close;
		}
		set .@val,getcastledata(.@map$,2);
		if(.@val == 100) {	//������
			mes "[����"+strnpcinfo(0)+"]";
			mes "^ff0000���Ɣ��W�l��";
			mes "���ݍő�l�ƂȂ��Ă���܂��B";
			mes "���͓�������K�v������܂���B^000000";
		 	close;
		}
		set .@tmp,(.@val-.@count)/5;
		set .@price,5000*(1+(1+.@tmp)*.@tmp/2)*(1+3*.@count);
		switch(.@count) {
		case 0:
			mes "[����"+strnpcinfo(0)+"]";
			mes "���ݕK�v�ȓ�������";
			mes "^ff0000" +.@price+ "^000000 Zeny�ł��B";
			mes "�����v���܂����H";
			break;
		case 1:
			mes "[����"+strnpcinfo(0)+"]";
			mes "����1�񓊎��Ȃ����Ă܂����A";
			mes "�ǉ������Ȃ����܂����H";
			mes "���̏ꍇ�� ^ff0000" +.@price+ "^000000 Zeny��";
			mes "�K�v�ƂȂ�܂��B";
			break;
		}
		next;
		if(select("���Ɣ��W�ɓ�������","������")==2) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�������܂�܂����B";
			mes "�ł�K�v�͂������܂���B";
			mes "�܂����ł������������Ă��������B";
			close;
		}
		if(Zeny < .@price) {	//������
			mes "[����"+strnpcinfo(0)+"]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			close;
		}
		set Zeny,Zeny-.@price;
		setcastledata .@map$,4,.@count+1;
		mes "[����"+strnpcinfo(0)+"]";
		mes "�����ɓ����ł��܂����I";
		mes "���オ�܂��܂��y���݂ł��ˁB";
		mes "�������甭�W�l���オ��ł��傤�B";
		return;
	}

	//�Ԃ̖h�q�ɓ���
	function StewardDef {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";
		mes "�h�q�l�����߂�΁A";
		mes "�K�[�f�B�A���ƃG���y���E����";
		mes "�ϋv�x�����サ�܂��B";
		mes "��X�̐퓬�ɔ����A";
		mes "�������Ă����̂��������Ǝv���܂��B";
		next;
		mes "[����"+strnpcinfo(0)+"]";
		mes "�ʏ����Ɉ��̂ݓ����\�ł����A";
		mes "�ǉ����z�𕥂����Ƃɂ��";
		mes "2��ڂ̓������\�ƂȂ�܂��B";
		next;
		set .@count,getcastledata(.@map$,5);
		if(.@count == 2) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "^ff0000�������A�����͂��ł�2���";
			mes "�����������̂ŁA����ȏ�̓�����";
			mes "�ł��܂���B";
			mes "^000000�܂��܂��̂����W��";
			mes "���҂��Ă���܂��B";
			close;
		}
		set .@val,getcastledata(.@map$,3);
		if(.@val == 100) {	//������
			mes "[����"+strnpcinfo(0)+"]";
			mes "^ff0000�h�q�����l�͌���100%�ł��B";
			mes "���͓�������K�v������܂���B^000000";
			close;
		}
		set .@tmp,(.@val-.@count)/5;
		set .@price,10000*(1+(1+.@tmp)*.@tmp/2)*(1+3*.@count);
		switch(.@count) {
		case 0:
			mes "[����"+strnpcinfo(0)+"]";
			mes "���ݕK�v�ȓ�������";
			mes "^ff0000" +.@price+ "^000000 Zeny�ł��B";
			mes "�����v���܂����H";
			break;
		case 1:
			mes "[����"+strnpcinfo(0)+"]";
			mes "����1�񓊎��Ȃ����Ă܂����A";
			mes "�ǉ������Ȃ����܂����H";
			mes "���̏ꍇ�� ^ff0000" +.@price+ "^000000 Zeny��";
			mes "�K�v�ƂȂ�܂��B";
			break;
		}
		next;
		if(select("�h�q�ɓ�������","������")==2) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�������܂�܂����B";
			mes "�ł�K�v�͂������܂���B";
			mes "�܂����ł������������Ă��������B";
			close;
		}
		if(Zeny < .@price) {	//������
			mes "[����"+strnpcinfo(0)+"]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			close;
		}
		set Zeny,Zeny-.@price;
		setcastledata .@map$,5,.@count+1;
		mes "[����"+strnpcinfo(0)+"]";
		mes "�����ɓ����ł��܂����I";
		mes "���オ�܂��܂��y���݂ł��ˁB";
		mes "��������h�q�l���オ��ł��傤�B";
		return;
	}

	//�K�[�f�B�A���ݒu
	function StewardGuard {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";
		mes "�K�[�f�B�A����ݒu���܂����H";
		mes "�K�[�f�B�A���͎������̍Ԃ����";
		mes "���҂ƂȂ�܂��B";
		mes "�ݒu����K�[�f�B�A����";
		mes "�I�����Ă��������B";
		next;
		//���ۂ�Menu(B5�Q�l)
		//menu 	"�A�[�`���[�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_1,"�A�[�`���[�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_2,
		//	"�\���W���[�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_3,"�\���W���[�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_4,
		//	"�i�C�g�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_5,"�\���W���[�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_6,
		//	"�i�C�g�K�[�f�B�A�� - �ݒu�ł��܂�",L_MENU_7,"�}�X�^�[�K�[�f�B�A�� - �ݒu�ł��܂��� (31214 / 31214)",L_MENU_8;
		//
		//�ݒu�ł��邩�o���Ȃ����̕\���ƁA�����ꍇHP���\�������B
		//�܂��A�����ꍇ�ł��ݒu����\�ł���A���̏ꍇHP���񕜂����邱�Ƃ��o����B
		set .@ret,select("Gurdian 1","Gurdian 2","Gurdian 3","Gurdian 4","Gurdian 5","Gurdian 6","Gurdian 7","Gurdian 8")+9;
		if(getcastledata(.@map$,.@ret)) {
			mes "[����"+strnpcinfo(0)+"]";	//������
			mes "�}�X�^�[�I";
			mes "���ɃK�[�f�B�A�����ݒu����Ă��܂��B";
			mes " ";
			mes "�K�[�f�B�A���ݒu����������܂����B";
			close;
		}
		mes "[����"+strnpcinfo(0)+"]";
		mes "�I�������K�[�f�B�A����";
		mes "�{���ɐݒu���܂����H�ݒu�ɂ�";
		mes "^ff000010000^000000Zeny���K�v�ł��B";
		next;
		if(select("�ݒu����","��߂�")==2) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�������܂�܂����B";
			mes "�����ɗ]�T���ł������́A";
			mes "���Аݒu����邱�Ƃ�";
			mes "�����ߒv���܂��B";
			close;
		}
		if(getgdskilllv(getcharid(2),10002) == 0) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�}�X�^�[�c�K�[�f�B�A���ݒu��";
			mes "�K�v�Ȍ����m�����s�����Ă��܂��B";
			mes "�K�[�f�B�A���ݒu�Ɋւ���m����";
			mes "���邽�߂ɂ́A�M���h�X�L����";
			mes "^ff0000�K�[�f�B�A�����쌤��^000000��";
			mes "�K�����Ȃ���΂Ȃ�܂���B";
			close;
		}
		if(Zeny < 10000) {	//������
			mes "[����"+strnpcinfo(0)+"]";
			mes "�}�X�^�[�I";
			mes "�����ɕK�v�Ȃ���������܂���B";
			mes "�������������܂����B";
			close;
		}
		set Zeny,Zeny-10000;
		setcastledata .@map$,.@ret,1;
		callfunc "GuardianCall",getarg(0),.@ret,1;	//�K�[�f�B�A������(npc_gvg_monster.txt)
		return;
	}

	//�J�v���Ƃ̌_��E����
	function StewardKafra {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		if(getcastledata(.@map$,9)==0) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�J�v���{�ЂƂ̌_������āA";
			mes "�ԓ��ɃJ�v���E�����ق��܂����H";
			mes "�ٗp�ɂ�^ff000010000^000000Zeny���K�v�ł����c";
			next;
			if(select("�ق�","������")==2) {
				mes "[����"+strnpcinfo(0)+"]";
				mes "�������܂�܂����B";
				mes "�������A�M���h���̂��߂ɂ�";
				mes "���֐��̌����Y��Ă�";
				mes "�Ȃ�܂���B";
				close;
			}
			if(getgdskilllv(getcharid(2),10001) == 0) {
				mes "[����"+strnpcinfo(0)+"]";
				mes "�}�X�^�[�c�܂��J�v���{�ЂƂ�";
				mes "�_�񂪌��΂�Ă��܂���B";
				mes "�_���������Ȃ���΁A";
				mes "�J�v���E�����ق����Ƃ��ł��܂���B";
				next;
				mes "[����"+strnpcinfo(0)+"]";
				mes "�J�v���{�ЂƂ̌_������]�݂Ȃ�A";
				mes "�M���h�X�L����";
				mes " ^ff0000�J�v���_��^000000 �X�L����";
				mes "�K�����Ȃ���΂Ȃ�܂���B";
				close;
			}
			if(Zeny < 10000) {	//������
				mes "[����"+strnpcinfo(0)+"]";
				mes "�}�X�^�[�I����������܂����I";
				close;
			}
			set Zeny,Zeny-10000;
			enablenpc "AgitKafra_"+getarg(0);	//"AgitCode"���g���ČĂяo��NPC��������
			setcastledata .@map$,9,1;
			mes "[����"+strnpcinfo(0)+"]";
			mes "�J�v���Ƃ̌_�񂪊������܂���";
			next;
			cutin "kafra_01",2;
			mes "[�J�v���E��]";
			mes "���߂܂��āA";
			mes "�J�v���f�B�t�H���e�Ɛ\���܂��B";
			mes "�őP��s�����܂��̂ŋX�������˂������܂��I";
			next;
			cutin "kafra_01",255;
			mes "[����"+strnpcinfo(0)+"]";
			mes "�M���h�x�[�X�ŃJ�v���Ƃ̌_����ێ����邽�߂�";
			mes "����Zeny�𕥂�Ȃ���΂Ȃ�܂���B";
			mes "(������)";
		}
		else {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�J�v���E���Ƃ̌_���j�����܂����H";
			next;
			if(select("���ق���","�L�����Z��")==2) {
				mes "[����"+strnpcinfo(0)+"]";
				mes "�킩��܂����B";
				close;
			}
			cutin "kafra_01",2;
			mes "[�J�v���E��]";
			mes "���c�����Ԉ���Ă��܂������H";
			mes "���ꂩ��͋C�����܂�����c";
			mes "�����Ă͂��炦�܂��񂩁c";
			next;
			if(select("���ق���","�L�����Z��")==2) {
				mes "[�J�v���E��]";
				mes "���肪�Ƃ��������܂��B";
				mes "�S�͂�s�����Ď����ɂ��܂��I";
				close2;
				cutin "kafra_01",255;
				end;
			}
			mes "[�J�v���E��]";
			mes "�����A���قȂ����ł��ˁc";
			next;
			disablenpc "AgitKafra_"+getarg(0);
			setcastledata .@map$,9,0;
			cutin "kafra_01",255;
			mes "[����"+strnpcinfo(0)+"]";
			mes "�c";
			mes "�J�v���Ƃ̌_�񂪔j������܂����B";
		}
		return;
	}

	//�}�X�^�[�̕����ɓ���
	function StewardRoom {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";
		mes "�������̋M�d�Ȑ��Y�i�̐��X��";
		mes "�~�����Ă��镔����";
		mes "������̂ł��ˁH";
		mes "�����́A�}�X�^�[�ɂ̂�";
		mes "�����������ꂽ�����ł������܂��B";
		next;
		if(select("�}�X�^�[�̕����ɓ���","������")==1) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "����ł͂��ē��v���܂��B";
			mes "���ɂ��Ă��炵�Ă��������B";
			mes "�A���ė��鎞�͉B���X�C�b�`��";
			mes "���삷��΋A��܂��B";
			close2;
			warp .@map$,getarg(1),getarg(2);
			end;
		}
		mes "[����"+strnpcinfo(0)+"]";
		mes "���Y�i�͈���Ɉ�񐶎Y�\�ł����A";
		mes "������x�܂Œ��~�����Ƃ���ȏ�";
		mes "���Y����Ȃ��Ȃ�܂��B�ł�����A";
		mes "���B�̃M���h�̔��W�̂��߂ɂ�";
		mes "�K�x�Ɏ��o���Ȃ���΂Ȃ�܂���B";
		return;
	}

	//�A�W�g���������
	function StewardGiveup {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
		mes "[����"+strnpcinfo(0)+"]";	//�������H
		mes "�}�X�^�[�I";
		mes "�A�W�g����������ł����I�H";
		mes " ";
		mes "�ǂ����l�������Ă��������A�}�X�^�[�I";
		next;
		if(select("�A�W�g���������","�L�����Z��")==1) {
			mes "[����"+strnpcinfo(0)+"]";
			mes "�}�X�^�[�I";
			mes "�ǂ���������x�l�������Ă��������c";
			mes "�ǂ����A�A���肢!!!!!!!!";
			next;
			if(select("��߂�","�A�W�g���������")==2) {
				mes "[����"+strnpcinfo(0)+"]";
				mes "�}�X�^�[!!�c";
				mes "�c���c�c�₾�c�c���c�c";
				close2;
				announce "�� [" +getcastlename(.@map$)+ "]�� [" +getguildname(getcharid(2))+ "] �M���h���������܂����B",0x20;
				callfunc "AgitGiveUp",getarg(0);	//�A�W�g��������(npc_gvg_exe.txt)
				end;
			}
		}
		mes "[����"+strnpcinfo(0)+"]";
		mes "�C�G�b�T�[�I�}�X�^�[^^!";
		mes "�����A����ȏ�k�悵�Ă���������^^.";
		return;
	}

	//��������main
	StewardSpeech;
	switch (select("�Ԃ̏�Ԃ�\��","���Ɣ��W�ɓ���","�Ԃ̖h�q�ɓ���","�K�[�f�B�A���ݒu","�J�v���Ƃ̌_�� / ����","�}�X�^�[�̕����ɓ���","�A�W�g���������")) {
		case 1:
			StewardConf;
			close;
		case 2:
			StewardEco;
			close;
		case 3:
			StewardDef;
			close;
		case 4:
			StewardGuard getarg(0);
			close;
		case 5:
			StewardKafra getarg(0);
			close;
		case 6:
			StewardRoom 0,getarg(1),getarg(2);
			close;
		case 7:
			StewardGiveup getarg(0);
			close;
	}
	return;
}


//==========================================
// ���C�[�i
//------------------------------------------
aldeg_cas01,218,175,0	script	�A���v���h	55,{
	callfunc "StewardMain","L1",113,223;
	end;
}

aldeg_cas02,78,74,0		script	�`�F���`�F����	55,{
	callfunc "StewardMain","L2",134,225;
	end;
}

aldeg_cas03,110,118,0	script	�i�U�u	55,{
	callfunc "StewardMain","L3",219,268;
	end;
}

aldeg_cas04,67,116,0	script	�E�B���I�b�g	55,{
	callfunc "StewardMain","L4",79,14;
	end;
}

aldeg_cas05,51,179,0	script	�u�����w���Z��	55,{
	callfunc "StewardMain","L5",68,13;
	end;
}

//==========================================
// �u���g�j�A
//------------------------------------------
gefg_cas01,40,48,5		script	�O�i�t�`��	55,{
	callfunc "StewardMain","B1",151,109;
	end;
}

gefg_cas02,12,66,0		script	�G�X�}�[�N	55,{
	callfunc "StewardMain","B2",137,113;
	end;
}

gefg_cas03,106,23,3		script	�W����	55,{
	callfunc "StewardMain","B3",267,287;
	end;
}

gefg_cas04,73,46,3		script	�P���o�[��	55,{
	callfunc "StewardMain","B4",113,115;
	end;
}

gefg_cas05,70,52,3		script	�r�I��	55,{
	callfunc "StewardMain","B5",141,107;
	end;
}

//==========================================
// �`��������
//------------------------------------------
payg_cas01,120,58,4		script	�O���i���f�B�[	55,{
	callfunc "StewardMain","C1",287,5;
	end;
}

payg_cas02,22,260,7		script	�`�F���I�X	55,{
	callfunc "StewardMain","C2",141,141;
	end;
}

payg_cas03,50,261,3		script	�P���I	55,{
	callfunc "StewardMain","C3",155,165;
	end;
}

payg_cas04,38,284,3		script	�f�B�[�W�F�C	55,{
	callfunc "StewardMain","C4",143,45;
	end;
}

payg_cas05,277,249,3	script	�i�U�u	55,{
	callfunc "StewardMain","C5",153,129;
	end;
}

//==========================================
// ���@���L���[������
//------------------------------------------
prtg_cas01,112,181,0	script	�A�u���C	55,{
	callfunc "StewardMain","V1",7,205;
	end;
}

prtg_cas02,94,61,4		script	���G	55,{
	callfunc "StewardMain","V2",199,225;
	end;
}

prtg_cas03,51,100,4		script	�X�e�b�L	55,{
	callfunc "StewardMain","V3",185,129;
	end;
}

prtg_cas04,259,265,4	script	�o���h���b�h	55,{
	callfunc "StewardMain","V4",267,159;
	end;
}

prtg_cas05,36,37,4		script	���C�m	55,{
	callfunc "StewardMain","V5",273,175;
	end;
}