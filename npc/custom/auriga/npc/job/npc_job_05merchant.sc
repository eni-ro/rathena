//====================================================================
//Ragnarok Online Merchant jobchange script
//
//�@�� CHANGE_MC -> 0�`1
//====================================================================

//==========================================
// �����\������ѓ]�E
//------------------------------------------

alberta_in,53,43,6	script	���l�g����#MC	86,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Blacksmith || OLD_CLASS == Job_Alchemist)) {
		if(Job == Job_Novice) {
			mes "[�g�����}���X]";
			mes "�₠�A�����p�����H";
			mes "���͏��l����Ȃ��݂������ȁB";
			next;
			if(getskilllv(1) < 9) {
				mes "[�g�����}���X]";
				mes "�l�ɂ͓V�E������Ƃ͂���";
				mes "��{�I�Ȃ��Ƃ͋��ʂ��Ă���B";
				mes "�܂��́AJobLv��10�ɂ܂Ő��������A";
				mes "^0000FF�u��{�X�L���v�̃��x����9�@^000000��";
				mes "���Ă��痈�Ă���B";
				next;
				mes "[�g�����}���X]";
				mes "^0000FF�u��{�X�L���v^000000�̃��x����";
				mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "�グ�邱�Ƃ��ł���B";
				mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "^0000FF�u��{���v^000000�E�B���h�E����";
				mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邼�B";
				next;
				mes "[�g�����}���X]";
				mes "�X�L���̃��x�����グ��ɂ́A";
				mes "�X�L���|�C���g������U������A";
				mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ�B";
				mes "���ӂ���񂾂��B";
				next;
				mes "[�g�����}���X]";
				mes "���͂��ł��g���ɋ��邩��";
				mes "�������ł�����܂������B";
				close;
			}
			mes "[�g�����}���X]";
			mes "�������A�N�̓V�E�͏��l���B";
			mes "���ꂩ����撣���Ċ������Ă���I";
			next;
			nude;
			jobchange Job_Merchant,UPPER_HIGH;
			//setquest 51220;
			//setquest 51280;
			//setquest 51335;
			skill 153,1,0;
			skill 154,1,0;
			skill 155,1,0;
			mes "[�g�����}���X]";
			mes "�悵�A����ς肻�̊i�D���������ȁB";
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[�g�����}���X]";
		mes "�����`�ɂ��B";
		mes "�ɂ����Ăڂ������c�c";
		mes "�J�v���̂��˂����񂩂��";
		mes "�Ԏ����܂����Ȃ����c�c";
		close;
	}
	mes "[�g�����}���X]";
	mes "���ɉ����p�ł��H";
	next;
	switch (select("���l�ɂȂ肽����ł�","���l���ĉ��H","���l�]�E�����́H","���ł��Ȃ�")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[�g�����}���X]";
			mes "����H�@���������Ă�H";
			mes "�N�͂������l����Ȃ����A�܂������B";
			mes "�������ď΂����������́H";
			next;
			mes "[�g�����}���X]";
			mes "�܂��A�N�̂悤�Ȑl��";
			mes "���l�ɂȂ�����Ȃ�A";
			mes "�`���҃A�J�f�~�[��";
			mes "�s���Ă݂�Ƃ��������ˁB";
			next;
			mes "[�g�����}���X]";
			mes "���̌������o���";
			mes "�`���҃A�J�f�~�[�̃T�|�[�g��";
			mes "�s���Ă���l�����邩��A";
			mes "�����Ă��炤�Ƃ�����B";
			close;
		}
		if(Job != Job_Novice) {
			mes "[�g�����}���X]";
			mes "��珤�l�M���h�̐l�Ԃ́A";
			mes "�R�E�����݂����ȓz����Ԍ������B";
			mes "���͏������āA��̓G�b�`�ȕ��𒅂�";
			mes "����������ɒʂ��Ă邻�������z�B";
			mes "�����c�c���J���J�I";
			next;
			mes "[�g�����}���X]";
			mes "�܂��A�b�������Ȃ������ǁA";
			mes "���̐E�ƂɏA���Ă�N�݂����ȓz��";
			mes "���l�M���h�ɂ͗v��Ȃ��B";
		   	close;
		}
		break;
	case 2:
		mes "[�g�����}���X]";
		mes "���l�H�ȒP�Ɍ����ƁA���𔄂���";
		mes "�������҂��B���ꂪ���l���B";
		mes "�퓬�����ӂȂ킯�łȂ����A";
		mes "�債���U���E�񕜃X�L�����Ȃ��B";
		mes "�ł��A�����l�i�ŃA�C�e������ɓ���B";
		next;
		mes "[�g�����}���X]";
		mes "�u���}�[�i�C�g�v�Ƃ������ɂ̋Z��";
		mes "���邯�ǁA�܂��A����͕ʂƂ��āc�c";
		mes "�|�A��A���茕�ȊO�̕����";
		mes "��̎g���邵�c�c";
		mes "�ƁA�Ƃɂ����A���l�͂����҂���";
		mes "���߂̐E�Ƃ��B����ŏ[�����낤�H";
		close;
	case 3:
		mes "[�g�����}���X]";
		mes "���l�ɂȂ邽�߂ɂ�";
		mes "�������K�v�����A";
		mes "����Ȃɓ���b����Ȃ��B";
		mes "�܂��́AJobLv��10�ɂ܂Ő��������A";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "���Ă��痈�Ă���B";
		next;
		mes "[�g�����}���X]";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł���B";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邼�B";
		next;
		mes "[�g�����}���X]";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ�B";
		mes "���ӂ���񂾂��B";
		next;
		mes "[�g�����}���X]";
		mes "�����珤����̂̏��l�ł��A";
		mes "^0000FF�u��{�X�L���v�����x��9^000000 �ɒB����";
		mes "���Ȃ��Ƒʖڂ��B";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 4:
		mes "[�g�����}���X]";
		mes "�������`";
		mes "�܂��A�C���ς������";
		mes "�܂������ɗ���΂������B";
		close;
	}
	if(CHANGE_MC == 0) {
		mes "[�g�����}���X]";
		mes "���l�ɂȂ肽�����āH";
		mes "�Ӂc�c";
		next;
		mes "[�g�����}���X]";
		mes "�悵���ꂶ�Ⴑ�̐\������";
		mes "�T�C�����Ă���I";
		next;
		if(select("�\�����ɃT�C������","��߂�")==2) {
			mes "[�g�����}���X]";
			mes "�������`";
			mes "�܂��A�C���ς������";
			mes "�܂������ɗ���΂������B";
			close;
		}
		mes "[�g�����}���X]";
		mes "�\�����ɃT�C�������āc�c";
		mes "���������A�T�C����";
		mes "�Y��ɏ����Ă����B";
		mes "�����������܂�ɏ��k��";
		mes "���s���邱�Ƃ����Ă���񂾂���ȁB";
		next;
		mes "[�g�����}���X]";
		mes "�����ĂƁA���ꂩ��}�[�`�����g��";
		mes "�Ȃ邽�߂̏�����S�Ė������Ă��邩";
		mes "�m�F���邪�A���Ȃ����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�g�����}���X]";
			mes "�������`";
			mes "�܂��A�C���ς������";
			mes "�܂������ɗ���΂������B";
			close;
		}
		set CHANGE_MC,1;
		mes "[�g�����}���X]";
		mes "���ꂶ��A���������m�F���邺�B";
		next;
	}
	mes "[�g�����}���X]";
	mes "���O�́c�c";
	mes " "+ strcharinfo(0) +" ���ȁH";
	mes " "+ strcharinfo(0) +" ��";
	mes "�����͂��Ɓc�c";
	next;
	mes "[�g�����}���X]";
	mes "�c";
	next;
	mes "[�g�����}���X]";
	mes "�c�c";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[�g�����}���X]";
		mes "���������I���l�ɂȂ�񂾂�����A";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "�Ȃ��ĂȂ��ƁI";
		mes "�܂��́AJobLv��10�ɂ܂Ő��������A";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "���Ă��痈�Ă���B";
		next;
		mes "[�g�����}���X]";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł���B";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邼�B";
		next;
		mes "[�g�����}���X]";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ�B";
		mes "���ӂ���񂾂��B";
		next;
		mes "[�g�����}���X]";
		mes "��������҂��̏��l�ł��A";
		mes "�Œ���A��{���Ȃ��ĂȂ��ƂˁB";
		close2;
		cutin "start_020_jp.bmp",1;
		end;
	}
	mes "[�g�����}���X]";
	mes "^0000FF�u��{�X�L���v^000000�����Ȃ��݂������ȁB";
	mes "�悵�A���i���I";
	mes "�����Ƀ}�[�`�����g�ւ̎葱����";
	mes "�͂��߂邼�I";
	next;
	getitem 11040,1;
	nude;
	jobchange Job_Merchant;
	set CHANGE_MC,0;
	setquest 50465;
	mes "[�g�����}���X]";
	mes "���߂łƂ��I";
	mes "�g���ꓯ�A�N�����l�M���h�̈����";
	mes "�Ȃ�������S���炨�j������B";
	mes "���ꂩ����撣���Ċ������Ă���B";
	next;
	mes "[�g�����}���X]";
	mes "�S���E�ʉݗʂ�20���m�ۂƂ���";
	mes "���̑s��ȖڕW��B�����邽�߁A";
	mes "��M����N�̗͂��K�v�s�����I";
	mes "���������H�@���̌�������!?";
	mes "�܂��A���̂͘b�̂��Ƃ����B";
	mes "���_�I�ɂ͂������҂������Ęb�B";
	next;
	mes "[�g�����}���X]";
	mes "���ƁA���A�N�ɓn�����̂�";
	mes "���l�M���h�쐬��";
	mes "�}�[�`�����g�̏�����B";
	mes "���ɗ��͂�������";
	mes "��x�ǂ�ł����Ƃ���";
	close;
OnInit:
	waitingroom "�]�E",0;
	end;
}


//==========================================
// �ו��z�B�q��
//------------------------------------------

alberta_in,28,29,2	script	���l�g����	83,{
	mes "[�g�����P�C]";
	mes "�₠�[���̗p�H";
	next;
	switch (select("�]�E�����̂��Ƃł�","�A���o�C�g�̎��ł�","���ł�����܂���")) {
	case 1:
		if(Job == Job_Merchant) {
			mes "[�g�����P�C]";
			mes "���������Ă�H�N�͂������l���낤�H";
			close;
		}
		mes "[�g�����P�C]";
		mes "���́A�}�[�`�����g�ւ̓]�E������";
		mes "�P�p����Ă���񂾁B";
		mes "����āA�������󂯂ĂȂ��Ă�";
		mes "�}�[�`�����g�ւ̓]�E�͉\������";
		mes "������<�g�����}���X>�ɘb���Ă݂āB";
		close;
	case 2:
		mes "[�g�����P�C]";
		mes "�A���o�C�g�H�܂����������B";
		mes "����\�Z������Ȃ��񂾁B";
		mes "�܂������c�c";
		close;
	case 3:
		mes "[�g�����P�C]";
		mes "�H�@�c�c����A����H";
		mes "�����H";
		close;
	}
}


//==========================================
// �z�B
//------------------------------------------

prontera,248,42,0	script	�J�v���E��::MC_DeliverPro	116,{
	cutin "kafra_02",2;
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂��A�i���j�J�v���ł��B";
	mes "�����̂Ƃ��茕�m�M���h��";
	mes "��s�v�����e������";
	mes "�q���s�s�u�C�Y���[�h�v��";
	mes "�ړ]���܂����B";
	next;
	mes "[�J�v���E��]";
	mes "��X�i���j�J�v���ł�";
	mes "�����v�����e������C�Y���[�h�܂�";
	mes "���p�� 600 Zeny�ňړ��T�[�r�X��";
	mes "�s���Ă��܂��B";
	next;
	switch (select("���p����","�J�v���|�C���g�m�F","�I��")) {
		case 1:
			if(Zeny<600) {
				mes "[�J�v���E��]";
				mes "���q�l�A����������Ȃ��悤�ł����B";
				break;
			}
			set Zeny,Zeny-600;
			set KAFRA_PIT,KAFRA_PIT+60;
			warp "izlude",94,103;
			end;
		case 2:	//function������R�s�[
			mes "[�J�v���E��]";
			mes strcharinfo(0)+ "�l�̊l���|�C���g�́A";
			mes KAFRA_PIT+ "�_�ł��B";
			next;
			mes "[�J�v���E��]";
			mes "�J�v���|�C���g�͓��J�v���T�[�r�X��";
			mes "�{�Ђŏܕi�ƈ����������\�ł��B";
			mes "����Ƃ��J�v���T�[�r�X����낵��";
			mes "���肢�v���܂��B";
			break;
		case 3:
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂����B";
			break;
	}
	close2;
	cutin "kafra_02",255;
	end;
OnInit:
	//���ꂪ�ǂݍ��܂��Ƃ���npc_town_kafra.txt�̕��𖳌��ɂ���
	disablenpc "�J�v���E��#ProSword";
	end;
}

//==============================================================
geffen_in,155,122,4	script	�M���h�֌W��	47,{
	mes "[���@�M���h�֌W��]";
	mes "�ו����͂����Ȃ̂Ɂc�c";
	mes "�x���ȁc�c�ӂ�c�c";
	close;
}

//==============================================================
morocc_in,140,102,4	script	���K��	86,{
	mes "[��������̌��K��]";
	mes "�U�o�h���n���搶�̐��F�̘r�́A";
	mes "�~�b�h�K���h�嗤�̒N���^���ł��Ȃ��I";
	mes "�f���炵���r�̎�����ł���B";
	mes "�l�͂��̕��̒�q�ł��I";
	close;
}

//==============================================================
izlu2dun,106,58,4	script	�J�v���E��::MC_DeliverBya	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",0,0x1da,0,0,0,0,0,0,40,800;
	end;
OnInit:
	//���ꂪ�ǂݍ��܂��Ƃ���npc_town_kafra.txt�̕��𖳌��ɂ���
	disablenpc "�J�v���E��#Byalan";
	end;
}