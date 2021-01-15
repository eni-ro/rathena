//= Auriga Script ==============================================================
// Ragnarok Online Nydhogg's Nest Script	by refis
//- Registry -------------------------------------------------------------------
// NYD_2QUE -> 0�`2
//==============================================================================

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
nyd_dun02,100,201,3	script	���҂̖�	111,8,8,{
	switch(NYD_1QUE) {
	case 0:
		mes "�]���Ȃ��������낷�悤��";
		mes "�@���̒���������A";
		mes "�@����ɂ��̉��ɂ�";
		mes "�@��̒������������]";
		next;
		if(select("���ׂ�","���ɉ������Ȃ�") == 2) {
			mes "�]���Ȃ���";
			mes "�@���̏�𗧂��������]";
			close;
		}
		if(ASH_6QUE == 14 || ASH_6QUE == 15) {
			misceffect 152,"";
			pushpc 7,3;
			mes "�]���Ȃ�����ɋ߂Â���";
			mes "�@�����Ԃ���Ă��܂����B";
			mes "�@�ǂ����A��ɂ͐N���҂�����";
			mes "�@���炩��^FF0000��^000000��������Ă���悤���]";
			next;
			mes "�]���Ȃ��͂��̖�̌���������";
			mes "�@�z����������傫��^FF0000�閧^000000��";
			mes "�@�B����Ă���悤�Ɋ������]";
			next;
			mes "�]�~�b�h�K���h�A���R�̎i�ߊ���";
			mes "�@�񍐂���K�v�����邾�낤�]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i��x�A�~�b�h�K���h�A���R���Ԓn��";
			mes "�i�ߊ��A�W�t�ɕ񍐂��悤�j";
			set NYD_1QUE,1;
			delquest 70374;
			setquest 70850;
			close;
		} else {
			misceffect 152,"";
			pushpc 7,3;
			mes "�]���Ȃ�����ɋ߂Â���";
			mes "�@�����Ԃ���Ă��܂����B";
			mes "�@�ǂ����A��ɂ͐N���҂�����";
			mes "�@���炩��^FF0000��^000000��������Ă���悤���]";
			next;
			mes "�]���̖�̌��������ɂ�";
			mes "�@�z����������傫��^FF0000�閧^000000��";
			mes "�@�B����Ă���ɈႢ�Ȃ��B";
			mes "�@���Ȃ��̓~�b�h�K���h�A���R���Ԓn��";
			mes "�@��w���ɕ񍐂��悤�ƍl�����]";
			next;
			mes "�]�������A���Ȃ��͏�w����";
			mes "�@�܂��M���֌W���z���Ă��Ȃ��]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�~�b�h�K���h�A���R���Ԓn��";
			mes "�@^FF0000�i�ߊ�����̈˗���B������^000000�Ȃ�";
			mes "�@�M���֌W��z���Ă���";
			mes "�@�i�ߊ��ɕ񍐂��悤�j";
			close;
		}
	case 1:
		if(ASH_6QUE == 14 || ASH_6QUE == 15) {
			misceffect 152,"";
			pushpc 7,3;
			mes "�]���Ȃ�����ɋ߂Â���";
			mes "�@�����Ԃ���Ă��܂����B";
			mes "�@�ǂ����A��ɂ͐N���҂�����";
			mes "�@���炩��^FF0000��^000000��������Ă���悤���]";
			next;
			mes "�]���Ȃ��͂��̖�̌���������";
			mes "�@�z����������傫��^FF0000�閧^000000��";
			mes "�@�B����Ă���悤�Ɋ������]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i��x�A�~�b�h�K���h�A���R���Ԓn��";
			mes "�i�ߊ��A�W�t�ɕ񍐂��悤�j";
			set ASH_6QUE,15;
			close;
		} else {
			misceffect 152,"";
			pushpc 7,3;
			mes "�]���Ȃ�����ɋ߂Â���";
			mes "�@�����Ԃ���Ă��܂����B";
			mes "�@�ǂ����A��ɂ͐N���҂�����";
			mes "�@���炩��^FF0000��^000000��������Ă���悤���]";
			next;
			mes "�]���̖�̌��������ɂ�";
			mes "�@�z����������傫��^FF0000�閧^000000��";
			mes "�@�B����Ă���ɈႢ�Ȃ��B";
			mes "�@���Ȃ��̓~�b�h�K���h�A���R���Ԓn��";
			mes "�@��w���ɕ񍐂��悤�ƍl�����]";
			next;
			mes "�]�������A���Ȃ��͏�w����";
			mes "�@�܂��M���֌W���z���Ă��Ȃ��]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�~�b�h�K���h�A���R���Ԓn��";
			mes "�@^FF0000�i�ߊ�����̈˗���B������^000000�Ȃ�";
			mes "�@�M���֌W��z���Ă���";
			mes "�@�i�ߊ��ɕ񍐂��悤�j";
			close;
		}
	case 111:
	case 112:
		misceffect 174,"";
		mes "�]���ނ悤�ɂ��Ȃ���";
		mes "�@�����Ԃ��Ă����͂��Ȃ��Ȃ�A";
		mes "�@�g�����ĉ��₩�ȗ͂���������]";
		next;
		mes "�]��ɐG���ƁA";
		mes "�@�ǂ����炩�����������Ă���]";
		next;
		mes "[��]";
		mes "^FF0000�񑩂̌��t^000000���c�c";
		next;
		if(select("������������","��ł܂����܂�") == 2) {
			mes "[��]";
			mes "�c�c";
			close;
		}
		mes "[��]";
		mes "�񑩂̌��t�c�c";
		mes "���҂̎����c�c";
		mes "���݂��m�F�ł����B";
		next;
		mes "[���҂̖�]";
		mes "���͂��̎��҂̖��ʂ���";
		mes "���Ȃ��ɘb��������B";
		mes "���͎��҂̑厘�]";
		mes "�C�O�h���V�����A�h�B";
		next;
		mes "�]���₩�Ȍ��ɕ�܂ꂽ�悤�Ȋ��o��";
		mes "�@�S�̒��ɍL�����Ă����A";
		mes "�@���ɒ��ڐ����������Ă����]";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "���͂��̐��E���C�O�h���V����";
		mes "�͂���܂��Ă��鎞�B";
		mes "�䂦�Ɏ��҃j�[�Y�w�b�O��";
		mes "���̖�ɋ߂Â����Ƃ�]��ł��Ȃ��B";
		next;
		menu "��̒��ɓ��肽���̂ł���",-;
		mes "[�C�O�h���V�����A�h]";
		mes "����͓K��Ȃ����Ɓc�c";
		mes "���́c�c";
		mes "�c�c��������";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�c�����c";
		mes "�c���c�c";
		next;
		mes "�]�C�O�h���V�����A�h��";
		mes "�@�l�q�����������]";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�c�c";
		mes "�����A����������̂��c�c";
		next;
		menu "��!?",-;
		mes "[�C�O�h���V�����A�h]";
		mes "����Ɓc�c";
		mes "�O���Ɓc�c�b�����Ƃ��ł����c�c";
		next;
		menu "�ǂ������̂ł����H",-;
		mes "[�C�O�h���V�����A�h]";
		mes "�����Ɂc�c";
		mes "�j�[�Y�w�b�O�́c�c";
		mes "�����c�c���Ȃ��c�c";
		mes "�c���ꂽ�̂�";
		mes "�׈��ȗ��c�c�e�c�c";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�����c�c";
		mes "�c�c���̂�������āc�c";
		mes "�Ƃ���Ă���c�c";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�c�c";
		next;
		mes "�]�C�O�h���V�����A�h�̐���";
		mes "�@�������Ȃ��Ȃ����B";
		mes "�@���̖�̒���";
		mes "�@��ςȂ��Ƃ������Ă���炵���]";
		next;
		mes "�]���Ȃ��͉��Ƃ�����";
		mes "�@��̒��ɓ����i���Ȃ���";
		mes "�@�v�l�������A";
		mes "�@����ɔ�������悤��";
		mes "�@���̒��ɖ�ւ̓������";
		mes "�@�C���[�W���`����Ă����]";
		next;
		mes "�]���A�C�O�h���V�����A�h��";
		mes "�@^FF0000��M�������Ƃɂ����";
		mes "�@���̎��҂̖傪�J���o������^000000";
		mes "�@�ɂȂ����悤���B";
		mes "�@�����āA���̐�ɐi�ނɂ�";
		mes "�@^FF0000�p�[�e�B�[��g�ނ��Ƃ��K�v��^000000�]";
		next;
		mes "�]�p�[�e�B�[���[�_�[��";
		mes "�@���̍쐬�����A�쐬��A";
		mes "�@the Nest of Nidhog�ɓ��낤�]";
		misceffect 174,"";
		if(NYD_1QUE == 111) {
			set NYD_1QUE,200;
			setquest 70900;
			delquest 70893;
		} else if(NYD_1QUE == 112) {
			set NYD_1QUE,201;
			setquest 70900;
			delquest 70898;
		}
		close;
	case 121:
	case 122:
	case 131:
	case 132:
	case 200:
	case 201:
	case 202:
	case 203:
		if(checkquest2(3135)) {
			if(checkquest2(3135) & 0x2) {
				mes "[���҂̖�]";
				mes "�C�O�h���V���̗͂����肵���B";
				mes "�Ăт��̖��ʉ߂��������";
				mes "������x�b�������邪�����B";
				delquest 3135;
				close;
			}
			mes "[���҂̖�]";
			mes "�C�O�h���V���̗͂���܂�";
			mes "�s����ɂȂ��Ă���B";
			mes "�͂����肷��܂�";
			mes "���̖��ʂ����Ƃ��ł��Ȃ��B";
			next;
			mes "[���҂̖�]";
			mes "�O�񂱂̖��ʉ߂��Ă���";
			mes "^FF000072����^000000�قǌo�߂���΁A";
			mes "�͂����肵�A�Ăт��̖��";
			mes "�ʉ߂ł���悤�ɂȂ邾�낤�B";
			close;
		}
		else {
			if(getonlinepartymember() < 1) {
				mes "[���҂̖�]";
				mes "1�l�ȏ�̃p�[�e�B�[��g��ł���";
				mes "�Ď��s����B";
				close;
			}
			mes "�]��ɐG���ƁA";
			mes "�@�ǂ����炩�����������Ă���]";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				mes "[���҂̖�]";
				mes "���̖��ʉ߂��邱�Ƃ�";
				mes "�����ꂽ�ҒB�̑�\�҂�B";
				mes "�����ɓ��錮���쐬���A";
				mes "���̖���J�����邩�H";
				set .@str1$,"the Nest of Nidhog���̍쐬";
				set .@str2$,"the Nest of Nidhog�ɓ���";
			}
			else {
				mes "[���҂̖�]";
				mes "���҂̖��ʉ߂��邱�Ƃ�";
				mes "�����ꂽ�҂�B";
				mes "���̖��ʉ߂��邩�H";
				set .@str2$,"the Nest of Nidhog�ɓ���";
			}
		}
		next;
		switch(select(.@str1$,.@str2$,"�L�����Z��")) {
		case 1:
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[���҂̖�]";
				mes "���͑�\�ł͂Ȃ��Ȃ��Ă���B";
				mes "���̖��ʂ肽�����";
				mes "�Ăё�\�ƂȂ肱�̖�ɐG��邪�悢�B";
				close;
			}
			mdcreate "the Nest of Nidhog";
			mes "[���҂̖�]";
			mes "���p�[�e�B�[��";
			mes "^0000FF" +strcharinfo(1)+ "^000000";
			mes "���p�[�e�B�[���[�_�[";
			mes "^0000FF" +strcharinfo(0)+ "^000000";
			mes "^006400the Nest of Nidhog^000000�̌��̍쐬���s���B";
			next;
			mes "[���҂̖�]";
			mes "�쐬�ɐ��������ꍇ��";
			mes "�Ăі�ɐG��邪�悢�B";
			mes "^FF0000the Nest of Nidhog�ɓ���^000000";
			mes "����]�߂΂��̖�͊J�����B";
			close;
		case 2:
			switch(mdenter("the Nest of Nidhog")) {
			case 0:	// �G���[�Ȃ�
				announce "[" +strcharinfo(1)+ "] �p�[�e�B�[�� [" +strcharinfo(0)+ "] �� [the Nest of Nidhog] �ɓ��ꂵ�܂�",0x9,0x00FF99;
				set NYD_2QUE,0;
				setquest 3135;
				donpcevent getmdnpcname("NydControl")+ "::OnStart";
				close;
			case 1:	// �p�[�e�B�[������
				mes "[���҂̖�]";
				mes "���A���҂̖��ʂ邽�߂ɕK�v��";
				mes "�p�[�e�B�[����̂���Ă���B";
				mes "�Ď��s����B";
				close;
			case 2:	// �_���W�������쐬
				if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
					mes "[���҂̖�]";
					mes "the Nest of Nidhog �̌���";
					mes "���݂��Ȃ��B";
					mes "��\�ł���p�[�e�B�[���[�_�[��";
					mes "�����쐬���I����Ă��Ȃ����߁A";
					mes "����J�����邱�Ƃ͂ł��Ȃ��B";
					close;
				}
				else {
					mes "[���҂̖�]";
					mes "the Nest of Nidhog �̌���";
					mes "���݂��Ȃ��B";
					mes "���̑�\�ł���p�[�e�B�[���[�_�[��";
					mes "�����쐬���I����Ă��Ȃ����߁A";
					mes "����J�����邱�Ƃ͂ł��Ȃ��B";
					close;
				}
			default:	// ���̑��G���[
				mes "[���҂̖�]";
				mes "�s���ȃG���[�������B";
				close;
			}
		case 3:
			mes "�]���Ȃ��͗����������]";
			close;
		}
	}
	end;
OnTouch:
	if(!NYD_1QUE) {
		misceffect 174,"";
		misceffect 174;
		end;
	}
	end;
}

//============================================================
// �j�[�Y�w�b�O�̑�1F
//------------------------------------------------------------
1@nyd,0,0,0	script	NydControl	-1,{
OnStart:
	if(.active > 0)
		end;
	set .active,1;
	donpcevent getmdnpcname("nyd_call_mon_1")+ "::OnStart";
	donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
	hideonnpc getmdnpcname("nyd_to2f_warp");
	hideonnpc getmdnpcname("�C�O�h���V�����A�h#");
	end;
}
1@nyd,213,277,5	script	�C�O�h���V�����A�h	437,5,5,{
	switch(NYD_2QUE) {
	case 0:
		if(NYD_1QUE == 200 || NYD_1QUE == 201) {
			mes "�]���₩�Ȍ��ɕ�܂ꂽ�悤�Ȋ��o��";
			mes "�@�S�̒��ɍL�����Ă����A";
			mes "�@���ɒ��ڐ����������Ă����]";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���͎��҂Ɏd����";
			mes "�C�O�h���V�����A�h�c�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�����͊댯���c�c";
			mes "���������őS�Ă��I����Ă��܂��c�c";
			next;
			menu "���Ȃ��́H",-;
			mes "[�C�O�h���V�����A�h]";
			mes "���͎��҃j�[�Y�w�b�O��";
			mes "�厘�]�C�O�h���V�����A�h��";
			mes "�C���ꂽ�ҁc�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���͂��܂���̂������A";
			mes "��������������";
			mes "�Ƃ���Ă��鑶�݁c�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�������A���܂��B��";
			mes "���̃��g�D���w�C���ł��A";
			mes "�A�[���u�w�C���̎҂ł��Ȃ��̂��c�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "������^FF0000�j�[�Y�w�b�O�̉e^000000�̗͂�";
			mes "�����󂯂���";
			mes "���̐������������̂��ȁc�c";
			next;
			menu "�ǂ��������Ƃł����H",-;
			mes "[�C�O�h���V�����A�h]";
			mes "�j�[�Y�w�b�O�̉e��";
			mes "�����̖\�s���B�����߂�";
			mes "���t�B�l���̎��]�������ɗ��Ă�";
			mes "�������������������̂悤�Ɍ�����";
			mes "�􂢂��������̂��B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���������̎􂢂̌��ʂ�";
			mes "���t�B�l���̎��]�݂̂�";
			mes "�L���������悤���ȁB";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�������ɓz�����t�B�l���ȊO�A";
			mes "�܂����ِ��E�̎҂������ɗ��邱�Ƃ�";
			mes "�l���Ă��Ȃ������悤���B";
			next;
			menu "�j�[�Y�w�b�O�̉e�Ƃ́H",-;
			mes "[�C�O�h���V�����A�h]";
			mes "���҃j�[�Y�w�b�O��";
			mes "�׈��Ȉӎv�݂̂���������ҁB";
			mes "�S�Ă̐�����";
			mes "���ݍ������Ƃ��Ă���c�c";
			mes "^FF0000�{�̂̃j�[�Y�w�b�O��";
			mes "�ǂ����ɏ����Ă��܂���^000000�c�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "^FF0000�C�O�h���V�������サ�Ă��錴����";
			mes "�j�[�Y�w�b�O�̉e�Ȃ̂�^000000�B";
			mes "�C�O�h���V���̗͂��A������";
			mes "���ݍ���ł���̂��B";
			next;
			menu "�j�[�Y�w�b�O�̉e�������H",-;
			mes "[�C�O�h���V�����A�h]";
			mes "�������B";
			mes "���A���t�B�l���̓T�t�@����";
			mes "�C�O�h���V���̗͂���߂Ă����";
			mes "�푈���s���Ă��邪";
			mes "�T�t�@���������ł͂Ȃ��̂��B";
			next;
			menu "���������Ȃ��ƁI",-;
			mes "[�C�O�h���V�����A�h]";
			mes "����A�����x���c�c";
			mes "�푈���~�߂悤��";
			mes "�j�[�Y�w�b�O�̉e�̗͂�";
			mes "���܂�ɋ��傾�c�c";
			next;
			menu "�j�[�Y�w�b�O��|���܂�",-;
			mes "[�C�O�h���V�����A�h]";
			mes "���c�c�H";
			mes "�{�C���H";
			next;
			menu "�͂�",-;
			mes "[�C�O�h���V�����A�h]";
			mes "�ِ��E�̎҂�c�c";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�킩�����B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�ł͎��̗͂�";
			mes "���҂֖̊���J���悤�B";
			mes "���̐�Ƀj�[�Y�w�b�O�̑�������";
			mes "�j�[�Y�w�b�O�̉e������̂��B";
			set 'NYD_2QUE,1;
			donpcevent getmdnpcname("ins_nyd_1f_timer")+ "::OnStart";
			donpcevent getmdnpcname("nyd_call_mon_1")+ "::OnStart2";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�������֖���J���邱�Ƃ�";
			mes "�j�[�Y�w�b�O�̌�q����";
			mes "����Ă���͂����B";
			mes "��q����|���Ȃ��Ă�";
			mes "�֖��ʂ邱�Ƃ͂ł��Ȃ��B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���̗͂Ŋ֖���J����̂�";
			mes "30�������E���I";
			mes "���̊ԂɌ�q����|���Ă���!!";
			close;
		} else {
			mes "�]���₩�Ȍ��ɕ�܂ꂽ�悤�Ȋ��o��";
			mes "�@�S�̒��ɍL�����Ă����A";
			mes "�@���ɒ��ڐ����������Ă����]";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�܂����Ă��ꂽ�̂��ȁB";
			mes "����������B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�j�[�Y�w�b�O�̉e��";
			mes "�܂��͂�~���n�߂��̂��B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���̂�����";
			mes "�z�̗͂�}���Ȃ��Ă�";
			mes "��ςȂ��ƂɂȂ�B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�ł͎��̗͂�";
			mes "���҂֖̊���J���悤�B";
			mes "���̐�Ƀj�[�Y�w�b�O�̑�������";
			mes "�j�[�Y�w�b�O�̉e������̂��B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "�������֖���J���邱�Ƃ�";
			mes "�j�[�Y�w�b�O�̌�q����";
			mes "����Ă���͂����B";
			mes "��q����|���Ȃ��Ă�";
			mes "�֖��ʂ邱�Ƃ͂ł��Ȃ��B";
			next;
			mes "[�C�O�h���V�����A�h]";
			mes "���̗͂Ŋ֖���J����̂�";
			mes "30�������E���I";
			mes "���̊ԂɌ�q����|���Ă���!!";
			set 'NYD_2QUE,1;
			donpcevent getmdnpcname("ins_nyd_1f_timer")+ "::OnStart";
			donpcevent getmdnpcname("nyd_call_mon_1")+ "::OnStart2";
			close;
		}
	case 1:
		mes "[�C�O�h���V�����A�h]";
		mes "�j�[�Y�w�b�O�̉e������";
		mes "�j�[�Y�w�b�O�̑���";
		mes "��������k�ɂ���B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�j�[�Y�w�b�O�̌�q����S�ē|���΁A";
		mes "�֖傪�J����邾�낤�B";
		mes "12�̂̌�q����S�ē|���̂��I";
		close;
	case 2:
		mes "[�C�O�h���V�����A�h]";
		mes "���ɂł��邱�Ƃ͂����܂ł��c�c";
		mes "��������k�ɂ���֖傩��";
		mes "�j�[�Y�w�b�O�̑��ɍs���̂��B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "��Ɏ��̓j�[�Y�w�b�O�̑���";
		mes "�҂��Ă���I";
		hideonnpc;
		close;
	default:
		warp "mid_camp",100,100;
		end;
	}
}

1@nyd,1,1,0	script	nyd_call_mon_1	139,{
OnStart:
	set .@mdmap$,getmdmapname("1@nyd");
	set .@mdnpc$,getmdnpcname("nyd_call_mon_1");
	areamonster .@mdmap$,0,0,0,0,"�G���V�F���g�c���[",2019,20,.@mdnpc$+ "::OnKilled1";
	areamonster .@mdmap$,0,0,0,0,"�����R",2020,15,.@mdnpc$+ "::OnKilled2";
	areamonster .@mdmap$,0,0,0,0,"�t�B��",2021,15,.@mdnpc$+ "::OnKilled3";
	areamonster .@mdmap$,0,0,0,0,"�A�N�A�G�������^��",2016,15,.@mdnpc$+ "::OnKilled4";
	areamonster .@mdmap$,0,0,0,0,"�_�[�N�s���M�L����",2015,15,.@mdnpc$+ "::OnKilled5";
	end;
OnStart2:
	if(.flag) end;
	set .flag,1;
	set .@mdmap$,getmdmapname("1@nyd");
	set .@mdnpc$,getmdnpcname("nyd_call_mon_1");
	monster .@mdmap$,220,250,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,220,252,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,240,270,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,240,272,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,200,200,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,210,210,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,225,265,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,225,270,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,245,235,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,255,255,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,225,245,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,230,280,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	announce "�j�[�Y�w�b�O�̌�q�� : ���҂̐��������I �i���҂�r������I",0x9,0x00FF99;
	end;
OnKilled:
	set .mob,getmapmobs(getmdmapname("1@nyd"),getmdnpcname("nyd_call_mon_1")+ "::OnKilled");
	if(.mob <= 0) {
		announce "�j�[�Y�w�b�O�̌�q����S�ē|�����I",0x9,0x00FF99;
		hideoffnpc getmdnpcname("nyd_to2f_warp");
		set 'NYD_2QUE,2;
	} else
		announce "�c�� [" +.mob+ "]��",0x9,0x00FF99;
	end;
OnKilled1:
	areamonster getmdmapname("1@nyd"),0,0,0,0,"�G���V�F���g�c���[",2019,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled1";
	end;
OnKilled2:
	areamonster getmdmapname("1@nyd"),0,0,0,0,"�����R",2020,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled2";
	end;
OnKilled3:
	areamonster getmdmapname("1@nyd"),0,0,0,0,"�t�B��",2021,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled3";
	end;
OnKilled4:
	areamonster getmdmapname("1@nyd"),0,0,0,0,"�A�N�A�G�������^��",2016,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled4";
	end;
OnKilled5:
	areamonster getmdmapname("1@nyd"),0,0,0,0,"�_�[�N�s���M�L����",2015,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled5";
	end;
}

1@nyd,1,2,0	script	ins_nyd_1f_timer	139,{
OnStart:
	initnpctimer;
	end;
OnTimer900000:
	announce "�C�O�h���V�����A�h : ���Ԃ����܂�c���Ă��Ȃ��I�@�}���̂��I",0x9,0xFFFF00;
	end;
OnTimer1200000:
	announce "�C�O�h���V�����A�h : ���̗͂͂��������Ȃ��I�@�}���̂��I",0x9,0xFFFF00;
	end;
OnTimer1500000:
	announce "�C�O�h���V�����A�h : �������낻����E���c�c",0x9,0xFFFF00;
	end;
OnTimer1800000:
	announce "�C�O�h���V�����A�h : �ʖڂ��A�傪���Ă��܂����c�c ���s���c�c",0x9,0xFFFF00;
	end;
OnTimer1830000:
	announce "�C�O�h���V�����A�h : ���̍Ō�̗͂ł��Ȃ��B��E�o�����悤�c�c",0x9,0xFFFF00;
	end;
OnTimer1850000:
	killmonster getmdmapname("1@nyd"),getmdnpcname("nyd_call_mon_1")+ "::OnKilled";
	mapwarp getmdmapname("1@nyd"),"mid_camp",310,150;
	stopnpctimer;
	end;
}

1@nyd,195,320,0	warp	nyd_to2f_warp	5,5,2@nyd,200,10

//============================================================
// �j�[�Y�w�b�O�̑�2F
//------------------------------------------------------------
2@nyd,200,14,0	script	nyd_2f_enter	139,6,6,{
	donpcevent getmdnpcname("nyd_2f_enter_broad")+ "::OnStart";
	hideonnpc getmdnpcname("nyd_2f_enter");
	end;
}

2@nyd,1,1,0	script	nyd_2f_enter_broad	139,{
OnStart:
	initnpctimer;
	end;
OnTimer12000:
	announce "�j�[�Y�w�b�O�̉e : ����ʁc�c �S�R����ʁc�c �S�R�͂�����ʂ�!!",0x9,0xFFFF00;
	end;
OnTimer15000:
	announce "�j�[�Y�w�b�O�̉e : ���E���c�c �����ƃC�O�h���V���̐������K�v���c�c",0x9,0xFFFF00;
	end;
OnTimer18000:
	announce "�j�[�Y�w�b�O�̉e : �C�O�h���V���̐�����S�ċz���s�����c�c �����Ĕj�󂷂�c�c �S�Ă����c�c",0x9,0xFFFF00;
	stopnpctimer;
	end;
}

2@nyd,199,178,0	script	nyd_ddr_control	139,6,6,{
	misceffect 152,"";
	mes "�]�h��ȐF���̏�����";
	mes "�@���̕s���̗͂��̓���";
	mes "�@���ꍞ��ł���]";
	next;
	mes "�]���m�Ȃ�͂͂��Ȃ��̑̂�";
	mes "�@���̏ꏊ�֓]���������]";
	close2;
	warp getmdmapname("2@nyd"),199,255;
	end;
}

2@nyd,199,268,0	script	nyd_2f_boss_enter	139,8,8,{
	donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnStart2";
	hideonnpc getmdnpcname("nyd_2f_boss_enter");
	end;
}

2@nyd,2,2,0	script	nyd_boss_enter_call	139,{
OnStart:
	set .@mdmap$,getmdmapname("2@nyd");
	set .@mdnpc$,getmdnpcname("nyd_call_mon_1");
	areamonster .@mdmap$,20,12,380,172,"�����R",2020,20,.@mdnpc$+ "::OnKilled1";
	areamonster .@mdmap$,20,12,380,172,"�t�B��",2021,20,.@mdnpc$+ "::OnKilled2";
	areamonster .@mdmap$,20,12,380,172,"�_�[�N�V���h�E",2023,20,.@mdnpc$+ "::OnKilled3";
	areamonster .@mdmap$,20,12,380,172,"�_�[�N�s���M�L����",2015,20,.@mdnpc$+ "::OnKilled4";
	end;
OnStart2:
	monster getmdmapname("2@nyd"),199,327,"�j�[�Y�w�b�O�̉e",2022,1,getmdnpcname("nyd_boss_enter_call")+ "::OnKilled";
	announce "�j�[�Y�w�b�O�̉e : ���̐��E���̐�����S�Ĉ��ݍ��ނ���ɁA�M�l������ݍ���ł�����!!",0x9,0x00FF00;
	initnpctimer;
	end;
OnReset:
	initnpctimer;
	end;
OnTimer180000:
	setnpctimer 0;
	switch(rand(4)) {
	case 0:
		announce "�j�[�Y�w�b�O�̉e : ���̕������M�l�̑N���ł����ƐԂ����߂邪�����I",0x9,0xFFFF00;
		donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_red")+ "::OnStart";
		mapwarp getmdmapname("2@nyd"),getmdmapname("2@nyd"),115,278;
		end;
	case 1:
		announce "�j�[�Y�w�b�O�̉e : ���̐������̑O�œ����A�����ʂĂ邪�����I",0x9,0xFFFF00;
		donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_white")+ "::OnStart";
		mapwarp getmdmapname("2@nyd"),getmdmapname("2@nyd"),115,373;
		end;
	case 2:
		announce "�j�[�Y�w�b�O�̉e : ���̕����ŉ�ɗ������������������������邪�����I",0x9,0xFFFF00;
		donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnStart";
		mapwarp getmdmapname("2@nyd"),getmdmapname("2@nyd"),284,278;
		end;
	case 3:
		announce "�j�[�Y�w�b�O�̉e : ���̕����ŋ����ʂāA�i���ɖ��邪�����I",0x9,0xFFFF00;
		donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
		donpcevent getmdnpcname("nyd_crystal_green")+ "::OnStart";
		mapwarp getmdmapname("2@nyd"),getmdmapname("2@nyd"),284,374;
		end;
	}
	stopnpctimer;
	end;
OnKilled:
	announce "�j�[�Y�w�b�O�̉e : ���A�M�l�������c�c ���A���̂��A�͂��Ȃ��Ȃ��Ă����c�c",0x9,0x00FF99;
	donpcevent getmdnpcname("�C�O�h���V�����A�h#")+ "::OnStart";
	stopnpctimer;
	donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
	end;
OnKilled1:
	areamonster getmdmapname("2@nyd"),20,12,380,172,"�����R",2020,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled1";
	end;
OnKilled2:
	areamonster getmdmapname("2@nyd"),20,12,380,172,"�t�B��",2021,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled2";
	end;
OnKilled3:
	areamonster getmdmapname("2@nyd"),20,12,380,172,"�_�[�N�V���h�E",2023,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled3";
	end;
OnKilled4:
	areamonster getmdmapname("2@nyd"),20,12,380,172,"�_�[�N�s���M�L����",2015,1,getmdnpcname("nyd_call_mon_1")+ "::OnKilled4";
	end;
}

2@nyd,202,324,5	script	�C�O�h���V�����A�h#	437,{
	if(NYD_1QUE == 200 || NYD_1QUE == 201) {
		mes "[�C�O�h���V�����A�h]";
		mes "���肪�Ƃ��B";
		mes "���Ȃ��̓C�O�h���V�����A";
		mes "���␢�E���~�����̂��B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�׈��ȃj�[�Y�w�b�O�̉e��";
		mes "���Ȃ��Ȃ����B";
		mes "�c�c����͊��S�ȏ��łł͂Ȃ��A";
		mes "�͂������ꎞ�I��";
		mes "����ɂ��������ɂ����Ȃ��B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�����A�����ɋ���ȗ͂�����";
		mes "�j�[�Y�w�b�O�̉e�Ƃ�����";
		mes "�͂����߂��̂�";
		mes "�����̎��Ԃ�v����ł��낤�B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "����ɂ��Ă�";
		mes "���Ȃ��͂������͂������Ă���c�c";
		mes "���Ȃ��𐳎���";
		mes "^FF0000���]^000000�Ƃ��ĔF�߂悤�B";
		next;
		misceffect 152,"";
		mes "[�C�O�h���V�����A�h]";
		mes "����Ńj�[�Y�w�b�O�̑���";
		mes "���x�ł������悤�ɂȂ����B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�������A�C�O�h���V���̗͂�";
		mes "�s����ɂȂ��Ă��鍡�A";
		mes "�Ăѓ���ɂ�";
		mes "�����΂��莞�Ԃ��K�v�����ȁB";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�����Ă��Ȃ��ɂ��肢������B";
		mes "�e���͂����߂��O��";
		mes "�X�v�����f�B�b�h�ƃ}�k�N�̒���";
		mes "���̎��Ԃ�`���ė~�����̂��B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "���E���C�O�h���V���̐����";
		mes "�T�t�@���̂����ł͂Ȃ��B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "�Ɛl�͎��ҁA";
		mes "�j�[�Y�w�b�O�̉e�Ȃ̂��I";
		mes "��x��ɂȂ�O��";
		mes "�}���ł��̎������F�ɒm�点��̂��I";
		next;
		menu "�킩��܂���",-;
		mes "[�C�O�h���V�����A�h]";
		mes "����ł͎��̗͂ł��Ȃ���";
		mes "���̒n����o�����ł͂Ȃ����B";
		mes "�����͂������H";
		next;
		if(NYD_1QUE == 200) {
			mes "�]���Ȃ��̓��t�B�l����";
			mes "�@�������ł���B";
			mes "�@���t�B�l���̎i�ߊ�";
			mes "�@���r�I���f�B���ɕ񍐂��悤�]";
			set NYD_1QUE,202;
			setquest 70905;
			delquest 70900;
		}
		else if(NYD_1QUE == 201) {
			mes "�]���Ȃ��̓T�t�@���Ǝ������ł���B";
			mes "�@�T�t�@���̎񒷃G�g���ɕ񍐂��悤�]";
			set NYD_1QUE,203;
			setquest 70907;
			delquest 70900;
		}
	} else {
		mes "[�C�O�h���V�����A�h]";
		mes "���肪�Ƃ��B";
		mes "����ł��΂炭��";
		mes "�j�[�Y�w�b�O�̉e���͂��������낤�B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "����ɂ��Ă��������͂��c�c";
		mes "�j�[�Y�w�b�O�̉e��";
		mes "�������|���Ƃ́c�c";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "����������͓z���ꎞ�I��";
		mes "����ɂ��������ɉ߂��Ȃ��B";
		mes "�z�͗͂�~���Ăь���邾�낤�B";
		next;
		mes "[�C�O�h���V�����A�h]";
		mes "����ł͎��̗͂ł��Ȃ���";
		mes "���̒n����o�����ł͂Ȃ����B";
		mes "�����͂������H";
	}
	next;
	if(select("���������肢���܂�","�������Ԃ���������") == 2) {
		mes "[�C�O�h���V�����A�h]";
		mes "�ł͏������ł�����";
		mes "���ł��b�������Ă���B";
		close;
	}
	warp "nyd_dun02",97,196;
	end;
OnStart:
	hideoffnpc getmdnpcname("�C�O�h���V�����A�h#");
	announce "�C�O�h���V�����A�h : �悭�e��|���Ă��ꂽ�I �S���A�����̖��@�w�ɏW�܂�̂��B",0x9,0x00FF99;
	end;
}

2@nyd,115,278,0	script	nyd_crystal_red	139,5,5,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_red");
	donpcevent getmdnpcname("nyd_crystal_red1")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_red2")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_red3")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_red_c")+ "::OnStart";
	initnpctimer;
	end;
OnClose:
	donpcevent getmdnpcname("nyd_crystal_red1")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_red2")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_red3")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_red_c")+ "::OnClose";
	hideonnpc getmdnpcname("nyd_crystal_red");
	end;
OnTouch:
	percentheal -50,0;
	percentheal -30,0;
	sc_start SC_BLEED,60000,5;
	end;
OnTimer10000:
	hideonnpc getmdnpcname("nyd_crystal_red");
	stopnpctimer;
	end;
}

2@nyd,6,6,0	script	nyd_crystal_red_c	139,{
OnStart:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_red_c")+ "::OnKilled";
	set .@mdmap$,getmdmapname("2@nyd");
	set .@mdnpc$,getmdnpcname("nyd_crystal_red_c");
	monster .@mdmap$,120,285,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,119,286,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,120,270,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,119,269,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,118,270,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	end;
OnClose:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_red_c")+ "::OnKilled";
	end;
OnKilled:
	set .mob,getmapmobs(getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_red_c")+ "::OnKilled");
	if(.mob <= 0) {
		announce "�j�[�Y�w�b�O�̉e : �ق��A�Ȃ��Ȃ����ȁc�c �ł͍��x�͂��̉������肾���I",0x9,0x00FF00;
		donpcevent getmdnpcname("nyd_crystal_red")+ "::OnClose";
		donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnReset";
	}
	end;
}

2@nyd,130,298,0	script	nyd_crystal_red1	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_red1");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_red1");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,142,296,0	script	nyd_crystal_red2	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_red2");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_red2");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,145,283,0	script	nyd_crystal_red3	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_red3");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_red3");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,115,373,0	script	nyd_crystal_white	139,5,5,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_white");
	donpcevent getmdnpcname("nyd_crystal_white1")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_white2")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_white3")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_white_c")+ "::OnStart";
	initnpctimer;
	end;
OnClose:
	donpcevent getmdnpcname("nyd_crystal_white1")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_white2")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_white3")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_white_c")+ "::OnClose";
	hideonnpc getmdnpcname("nyd_crystal_white");
	end;
OnTouch:
	percentheal -50,0;
	sc_start SC_FREEZE,20000,5;
	end;
OnTimer10000:
	hideonnpc getmdnpcname("nyd_crystal_white");
	stopnpctimer;
	end;
}

2@nyd,6,7,0	script	nyd_crystal_white_c	139,{
OnStart:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_white_c")+ "::OnKilled";
	set .@mdmap$,getmdmapname("2@nyd");
	set .@mdnpc$,getmdnpcname("nyd_crystal_white_c");
	monster .@mdmap$,120,380,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,119,381,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,120,367,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,119,366,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,118,365,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	end;
OnClose:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_white_c")+ "::OnKilled";
	end;
OnKilled:
	set .mob,getmapmobs(getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_white_c")+ "::OnKilled");
	if(.mob <= 0) {
		announce "�j�[�Y�w�b�O�̉e : �˔j�������I �Ȃ�΂��̉������肵�Ă�낤�I �����܂ŗ��邪�����I",0x9,0x00FF00;
		donpcevent getmdnpcname("nyd_crystal_white")+ "::OnClose";
		donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnReset";
	}
	end;
}

2@nyd,127,354,0	script	nyd_crystal_white1	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_white1");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_white1");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,373;
	end;
}

2@nyd,140,357,0	script	nyd_crystal_white2	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_white2");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_white2");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,373;
	end;
}

2@nyd,145,367,0	script	nyd_crystal_white3	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_white3");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_white3");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,373;
	end;
}

2@nyd,284,278,0	script	nyd_crystal_yellow	139,5,5,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_yellow");
	donpcevent getmdnpcname("nyd_crystal_yellow1")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_yellow2")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_yellow3")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_yellow_")+ "::OnStart";
	initnpctimer;
	end;
OnClose:
	donpcevent getmdnpcname("nyd_crystal_yellow1")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_yellow2")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_yellow3")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_yellow_")+ "::OnClose";
	hideonnpc getmdnpcname("nyd_crystal_yellow");
	end;
OnTouch:
	percentheal 0,-50;
	sc_start SC_SLEEP,20000,5;
	sc_start SC_CONFUSION,60000,5;
	end;
OnTimer10000:
	hideonnpc getmdnpcname("nyd_crystal_yellow");
	stopnpctimer;
	end;
}

2@nyd,6,8,0	script	nyd_crystal_yellow_	139,{
OnStart:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_yellow_")+ "::OnKilled";
	set .@mdmap$,getmdmapname("2@nyd");
	set .@mdnpc$,getmdnpcname("nyd_crystal_yellow_");
	monster .@mdmap$,282,284,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,283,283,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,280,275,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,281,276,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,281,277,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	end;
OnClose:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_yellow_")+ "::OnKilled";
	end;
OnKilled:
	set .mob,getmapmobs(getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_yellow_")+ "::OnKilled");
	if(.mob <= 0) {
		announce "�j�[�Y�w�b�O�̉e : �ق��A�Ȃ��Ȃ����ȁc�c�悩�낤�B���̉����瑒���Ă�낤�I",0x9,0x00FF00;
		donpcevent getmdnpcname("nyd_crystal_yellow")+ "::OnClose";
		donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnReset";
	}
	end;
}

2@nyd,255,285,0	script	nyd_crystal_yellow1	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_yellow1");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_yellow1");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,257,296,0	script	nyd_crystal_yellow2	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_yellow2");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_yellow2");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,268,300,0	script	nyd_crystal_yellow3	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_yellow3");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_yellow3");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,284,374,0	script	nyd_crystal_green	139,5,5,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_green");
	donpcevent getmdnpcname("nyd_crystal_green1")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_green2")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_green3")+ "::OnStart";
	donpcevent getmdnpcname("nyd_crystal_green_c")+ "::OnStart";
	initnpctimer;
	end;
OnClose:
	donpcevent getmdnpcname("nyd_crystal_green1")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_green2")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_green3")+ "::OnClose";
	donpcevent getmdnpcname("nyd_crystal_green_c")+ "::OnClose";
	hideonnpc getmdnpcname("nyd_crystal_green");
	end;
OnTouch:
	percentheal -50,-50;
	sc_start SC_POISON,60000,5;
	end;
OnTimer10000:
	hideonnpc getmdnpcname("nyd_crystal_green");
	stopnpctimer;
	end;
}

2@nyd,6,9,0	script	nyd_crystal_green_c	139,{
OnStart:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_green_c")+ "::OnKilled";
	set .@mdmap$,getmdmapname("2@nyd");
	set .@mdnpc$,getmdnpcname("nyd_crystal_green_c");
	monster .@mdmap$,282,378,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,283,377,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,280,368,"�j�[�Y�w�b�O�̌�q��",2020,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,281,368,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	monster .@mdmap$,281,367,"�j�[�Y�w�b�O�̌�q��",2021,1,.@mdnpc$+ "::OnKilled";
	end;
OnClose:
	killmonster getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_green_c")+ "::OnKilled";
	end;
OnKilled:
	set .mob,getmapmobs(getmdmapname("2@nyd"),getmdnpcname("nyd_crystal_green_c")+ "::OnKilled");
	if(.mob <= 0) {
		announce "�j�[�Y�w�b�O�̉e : �˔j�������c�c ����Ȃɂ��̉��̎�ő����ė~�����̂��H �������낤�A�����܂ŗ��邪�����I",0x9,0x00FF00;
		donpcevent getmdnpcname("nyd_crystal_green")+ "::OnClose";
		donpcevent getmdnpcname("nyd_boss_enter_call")+ "::OnReset";
	}
	end;
}

2@nyd,274,356,0	script	nyd_crystal_green1	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_green1");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_green1");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,260,356,0	script	nyd_crystal_green2	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_green2");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_green2");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}

2@nyd,258,368,0	script	nyd_crystal_green3	139,6,6,{
OnStart:
	hideoffnpc getmdnpcname("nyd_crystal_green3");
	end;
OnClose:
	hideonnpc getmdnpcname("nyd_crystal_green3");
	end;
OnTouch:
	warp getmdmapname("2@nyd"),115,278;
	end;
}