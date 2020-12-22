function	script	highkafra	{

	function Buff;		//�x��
	function Storage;	//�q��
	function SavePoint_K;	//�ʒu�Z�[�u
	function GuildStorage;	//�M���h�q��
	function Confirmation;	//�F�X�m�F�p
	function SoulLink;	//���̃N���X�Q��
	function GM_Menu;

	if(getgmlevel())
		set .@gm$,"GM���j���[";

	set @name$, "[�J�v���E��]";
	set @zeny,0;
	set @kind,0;

	mes @name$;
	mes "��������Ⴂ�܂�";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	if(CASHPOINTS)
		mes "ShopPoint�F"+callfunc ("Sistem_Digit",CASHPOINTS,0);
	next;
	switch(select("�x���T�[�r�X","�q�ɂ𗘗p����","�ʒu�Z�[�u�T�[�r�X","�M���h�q�ɂ𗘗p����","�I��",.@gm$)){
		case 1:
			Buff; break;
		case 2:
			Storage; break;
		case 3:
			SavePoint_K; break;
		case 4:
			GuildStorage; break;
		case 5:
		case 6:
			GM_Menu;
			break;
	}
	mes @name$;
	mes "��X�J�v���T�[�r�X�́A��芮����";
	mes "�T�[�r�X�ƊǗ��Ɩ���ڎw��";
	mes "���q�l�����S���Ă����p����������悤";
	mes "�����őP��s�����Ă��܂��B";
	mes "�J�v���T�[�r�X�������p��������";
	mes "���肪�Ƃ��������܂����B";
	close;

	function Buff {		//�x��
		mes @name$;
		mes "������͎x���T�[�r�X���s���Ă��܂��B";
		mes "����]�̎x�������I�т��������B";
		next;
		switch(select("�W���Z�b�g","�\�E�������N","�R�[�e�B���O","�����C��","���͂����ł�")) {
			case 1:	//�W���Z�b�g
				mes @name$;
				mes "���̃Z�b�g�ł͈ȉ��̎x���X�L�����s���܂��B";
				mes "^0000FF�u���b�V���O�A���x�����A";
				mes "�C���|�V�e�B�I�}�k�X�A�T�N�������g";
				mes "�L���G�G���C�\���A�}�O�j�t�B�J�[�g";
				mes "�����C�������łɁI^000000";
				mes "�����悭��肵�������ɃI�X�X���ł���";
				mes "������^FF000010���F1000 Zeny^000000�ɂȂ�܂���";
				mes "��낵���ł����H";
				next;
				if(select("�x�����Ă��炤","���͂����ł�")==2)
					return;

				set @kind,1;
				set @zeny,1000;
				Confirmation;

				sc_start SC_BLESSING,600000,10; //�u���b�V���O
				skilleffect "AL_BLESSING",0;
				sc_start SC_INCREASEAGI,600000,10; //���x����
				skilleffect "AL_INCAGI",0;
				sc_start SC_IMPOSITIO,600000,5; //�C���|�V�e�B�I�}�k�X
				skilleffect "PR_IMPOSITIO",0;
				sc_start SC_KYRIE,600000,10; //�L���G�G���C�\��
				skilleffect "PR_KYRIE",0;
				sc_start SC_MAGNIFICAT,600000,5; //�}�O�j�t�B�J�[�g
				skilleffect "PR_MAGNIFICAT",0;
				sc_start SC_SECRAMENT,180000,5; //�T�N�������g
				skilleffect "AB_SECRAMENT",0;
				skilleffect "CR_FULLPROTECTION",0;

				if(getrepairableitemcount()){	//�������j�����Ă���ꍇ�̏�������
					mes @name$;
					mes "���ꂠ��A�������j�����Ă��܂���";
					mes "���łɏC�����Ă����܂����H";
					next;
					if(select("�������C�����Ă��炤","���͑��v�ł�")==2)
						return;

					set @kind,4;
					set @zeny,5000*getrepairableitemcount();
					Confirmation;

					repairitem;
					skilleffect "BS_REPAIRWEAPON",0;
				}
				break;
			case 2:	//�\�E�������N
				mes @name$;
				mes "���Ȃ��̍��Ƀ\�E�������N��";
				mes "�������T�[�r�X�ł��ˁB";
				mes "�E�Ƃɍ���������c�l�������N���܂��B";
				mes "�����͂ǂ�ł�^FF000030���F5000 Zeny^000000";
				mes "�ɂȂ�܂����A��낵���ł����H";
				next;
				if(select("�����N���Ă��炤","���͂����ł�")==2)
					return;
				
				set @kind,2;
				set @zeny,5000;
				Confirmation;
				SoulLink;
				break;
			case 3:	//�R�[�e�B���O
				mes @name$;
				mes "�������ʂ̃R�[�e�B���O�ł��ˁB";
				mes "^0000FF�t���P�~�J���`���[�W^000000���s���܂��B";
				mes "�������Ȃ�����͂���Ō��܂��";
				mes "������^FF000010���F4000 Zeny^000000�ɂȂ�܂���";
				mes "��낵���ł����H";
				next;

				if(select("�R�[�e�B���O���Ă��炤","���͂����ł�")==2)
					return;
				set @kind,3;
				set @zeny,4000;
				Confirmation;

				sc_start SC_CP_WEAPON,600000,5; // �P�~�J���E�F�|���`���[�W
				sc_start SC_CP_SHIELD,600000,5; // �P�~�J���V�[���h�`���[�W
				sc_start SC_CP_ARMOR,600000,5; // �P�~�J���A�[�}�[�`���[�W
				sc_start SC_CP_HELM,600000,5; // �P�~�J���w�����`���[�W
				skilleffect "CR_FULLPROTECTION",0;
				break;


			case 4:	//�����C��
				mes @name$;
				mes "�C���������A�C�e���͂���܂����H";
				mes "�A�C�e���̏C���͎��ɂ��C������I";
				next;
				if(select("���͏C�����ė~�����A�C�e�����c�c","���͓��ɖ����ł�")==2)
					return;
				set @kind,4;
				set @zeny,5000*getrepairableitemcount();
				Confirmation;
				repairitem;
				skilleffect "BS_REPAIRWEAPON",0;
				break;
			default:
				break;
		}
		return;
	}


	function SavePoint_K {	//�ʒu�Z�[�u
		.@map$ = strcharinfo(3);
		.@charn$ = strcharinfo(0);
		if( getmapxy(.@map$,.@xpos,.@ypos) == -1 ){
			mes "�G���[�B";
			close;
		}
		savepoint .@map$,.@xpos,.@ypos;
		mes @name$;
		mes "�Z�[�u���܂����B";
		mes "������肨�߂������������B";
		close;
	}


	function Storage {	//�q��
		set @zeny,40;
		set @kind,0;
		Confirmation;
		openstorage;
		return;
	}

	function GuildStorage {	//�M���h�q��
		switch(guildopenstorage()){
			case GSTORAGE_OPEN:	//�q�ɃI�[�v��
				break;
			case GSTORAGE_STORAGE_ALREADY_OPEN:	//�M���h�q�Ɏg�p��
			case GSTORAGE_ALREADY_OPEN:
				mes @name$;
				mes "�M���h�����o�[���q�ɂ��g�p���ł��B";
				mes "���΂炭�҂��Ă��痘�p���Ă��������B";
				close;
			case GSTORAGE_NO_GUILD:	//�M���h������
				mes @name$;
				mes "�M���h�ɏ������ĂȂ�����";
				mes "���p���邱�Ƃ��ł��܂���B";
				close;
			case GSTORAGE_NO_STORAGE:
				mes @name$;
				mes "�M���h�q�ɋ@�\��";
				mes "�܂��J������Ă��܂���B";
				close;
			case GSTORAGE_NO_PERMISSION:
				mes @name$;
				mes "�M���h�q�ɂ�";
				mes "���p����������܂���B";
				close;
		}
		return;
	}
	function Confirmation {	//Zeny��X�L���̊m�F
		//����C�����̏����m�F
		if(@kind == 4 && !getrepairableitemcount()){
			mes @name$;
			mes "���ꂠ��c�c";
			mes "�C������K�v�̂�����̂Ȃ��";
			mes "��������Ă��܂����H";
			close;
		} else if(@kind ==4){
			mes @name$;
			mes "�M�����������Ă���A�C�e����";
			mes "�������Ă���A�C�e����";
			mes "�S����"+getrepairableitemcount()+ "�ɂȂ�܂�";
			next;
			mes @name$;
			mes "��C������̂� 5000 Zeny�ɂȂ�܂�";
			mes "�S�Ē�����" +@zeny+ "Zeny�ɂȂ�܂���";
			mes "�C���������܂����H";
			next;
			if(select("���肢���܂�","������")==2) {
				mes @name$;
				mes "�A�C�e�����������܂�";
				mes "�����Ēu�����Ȃ�āE�E�E";
				mes "�`���Ҏ��i�ł���H";
				close;
			}
		}

		if(Zeny < @zeny){	//Zeny�m�F
			mes @name$;
			mes "���q�l�A����������܂���B";
			mes "�����������m���߂��������B";
			mes "�����p�ɂ�^FF0000"+@zeny+"^000000Zeny�K�v�ł�";
			close;
		}

		if (((getskilllv(1) < 6) && (getskilllv(5018)<0))&& !@kind) {	//�X�L���m�F
			mes @name$;
			mes "�q�ɂ͊�{�X�L�����x��6";
			mes "�h������{�X�L�����x��1��";
			mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
			close;
		}

		if(@kind == 2){
			switch(Job){	//�K���X�����K�[�E�E�ҁE�e�T�E�O�̃����N�ΏۊO�̒e��
				case Job_Gunslinger:
				case Job_Ninja:
				case Job_Kagerou:
				case Job_Oboro:
					mes @name$;
					mes "����A���q�l�̐E�Ƃ�";
					mes "�����N�ł��Ȃ��悤�ł��B";
					mes "���̐E�Ƃ̎���";
					mes "�܂����炵�ĉ������B";
					close;
			}
		}
		set Zeny,Zeny-@zeny;
		return;
	}

	function SoulLink {	//���̃N���X�Q��
		set .@eac, eaclass();
		switch(.@eac & EAJ_UPPERMASK){
			case EAJ_KNIGHT:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_KNIGHT",0;
				set .@soul_name$,"�i�C�g�̍�";
				break;
			case EAJ_CRUSADER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_CRUSADER",0;
				set .@soul_name$,"�N���Z�C�_�[�̍�";
				break;
			case EAJ_WIZARD:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_WIZARD",0;
				set .@soul_name$,"�E�B�U�[�h�̍�";
				break;
			case EAJ_SAGE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SAGE",0;
				set .@soul_name$,"�Z�[�W�̍�";
				break;
			case EAJ_HUNTER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_HUNTER",0;
				set .@soul_name$,"�n���^�[�̍�";
				break;
			case EAJ_BARDDANCER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_BARDDANCER",0;
				set .@soul_name$,"�o�[�h�ƃ_���T�[�̍�";
				break;
			case EAJ_PRIEST:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_PRIEST",0;
				set .@soul_name$,"�v���[�X�g�̍�";
				break;
			case EAJ_MONK:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_MONK",0;
				set .@soul_name$,"�����N�̍�";
				break;
			case EAJ_BLACKSMITH:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_BLACKSMITH",0;
				set .@soul_name$,"�u���b�N�X�~�X�̍�";
				break;
			case EAJ_ALCHEMIST:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ALCHEMIST",0;
				set .@soul_name$,"�A���P�~�X�g�̍�";
				break;
			case EAJ_ASSASSIN:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ASSASIN",0;
				set .@soul_name$,"�A�T�V���̍�";
				break;
			case EAJ_ROGUE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ROGUE",0;
				set .@soul_name$,"���[�O�̍�";
				break;
			case EAJ_STARGLADIATOR:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_STAR",0;
				set .@soul_name$,"�����̍�";
				break;
			case EAJ_SOULLINKER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SOULLINKER",0;
				set .@soul_name$,"�\�E�������J�[�̍�";
				break;
			case EAJ_SUPERNOVICE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SUPERNOVICE",0;
				set .@soul_name$,"�X�[�p�[�m�[�r�X�̍�";
				break;
			default:
				if( .@eac & EAJL_UPPER ){
					sc_start SC_SPIRIT,1800000,5;
					skilleffect "SL_HIGH",0;
					set .@soul_name$,"�]���ꎟ�E�̍�";
					break;
				}
				mes "Error";
				close;
		}
		mes "������������������������������������";
		mes " ";
		mes "     �����N���܂����B";
		mes " ";
		mes "    �w ^4169E1"+ .@soul_name$ + "^000000 �x";
		mes " ";
		mes "������������������������������������";
		next;
		return;
	}

	function GM_Menu {	//GM���j���[
		if(!getgmlevel())
			return;

		mes @name$;
		mes "�@���������܂����H";
		next;
		switch(select("�]��","GM�R�}���h","IP����","��߂�")){
			case 1:
				break;
			case 2:
				callfunc "GmComand";
				close;
			case 3:
				callfunc "IP_Search";
				close;
			default:
				close;
		}
		
		switch(select("GM������","��߂�")){
			case 1:
				warp "vip",65,46;
				end;
			default:
				break;
		}
		return;
	}
}

/*================================================
	�ݒu��
--------------------------------------------------
cut-in�� / getarg(0)		ID�ԍ�
========			======
kafra_01 (�f�B�t�H���e�[)	117
kafra_02 (�|�j�[�e�[��)		116
kafra_03 (���������O)		115
kafra_04 (�I�����W�V���[�g)	114
kafra_05 (���K�l)		113
kafra_06 (�c�C���e�[��)		112
kafra_07 (�R���h)		721
kafra_08 (�V���[�g)		860
kafra_09 (�ԃ����O)		861
--------------------------------------------------
callfunc "highkafra","0"
--------------------------------------------------*/
venette,122,134,5	script	�J�v���E��::1	861,{
	callfunc "highkafra";
	end;
}
venette,88,136,4	script	�J�v���E��::�f�t�H���e�[	117,{
	callfunc "highkafra";
	end;
}
venette,162,136,4	script	�J�v���E��::�e�[�����O		116,{
	callfunc "highkafra";
	end;
}
vip,83,62,3	script	�J�v���E��::1	860,{
	callfunc "highkafra";
	end;
}
ven_in01,268,58,2	script	�J�v���E��::1	861,{
	callfunc "highkafra";
	end;
}
ven_in01,106,96,4	script	�J�v���E��::1	861,{
	callfunc "highkafra";
	end;
}
department,187,116,5	script	�J�v���E��::1	861,{
	callfunc "highkafra";
	end;
}
department,54,102,3	script	�J�v���E��::1	861,{
	callfunc "highkafra";
	end;
}
//=============================================================================
function	script	AutoBuff	{	//�����N���b�N�ŃI�[�g�o�t

	if(Zeny > 1000){
		sc_start SC_BLESSING,600000,10; //�u���b�V���O
		skilleffect "AL_BLESSING",0;
		sc_start SC_INCREASEAGI,600000,10; //���x����
		skilleffect "AL_INCAGI",0;
		sc_start SC_IMPOSITIO,600000,5; //�C���|�V�e�B�I�}�k�X
		skilleffect "PR_IMPOSITIO",0;
		sc_start SC_KYRIE,600000,10; //�L���G�G���C�\��
		skilleffect "PR_KYRIE",0;
		sc_start SC_MAGNIFICAT,600000,5; //�}�O�j�t�B�J�[�g
		skilleffect "PR_MAGNIFICAT",0;
		sc_start SC_SECRAMENT,180000,5; //�T�N�������g
		skilleffect "AB_SECRAMENT",0;
		sc_start SC_CP_WEAPON,600000,5; // �P�~�J���E�F�|���`���[�W
		sc_start SC_CP_SHIELD,600000,5; // �P�~�J���V�[���h�`���[�W
		sc_start SC_CP_ARMOR,600000,5; // �P�~�J���A�[�}�[�`���[�W
		sc_start SC_CP_HELM,600000,5; // �P�~�J���w�����`���[�W
		skilleffect "CR_FULLPROTECTION",0;
		percentheal 100,100;
		set Zeny,Zeny - 1000;
	}

	if(getrepairableitemcount()){
		set @zeny,5000*getrepairableitemcount();
		if(Zeny > @zeny){
			repairitem;
			skilleffect "BS_REPAIRWEAPON",0;
			set Zeny,Zeny - @zeny;
		}
	}
	end;	

}

venette,128,131,5	script	�x�l�b�g�̏j��	111,{
	callfunc "AutoBuff";
	end;
}
vip,72,51,3	script	�o�t	469 ,{
	callfunc "AutoBuff";
	end;
}