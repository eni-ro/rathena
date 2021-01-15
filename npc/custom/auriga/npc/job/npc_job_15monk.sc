//===============================================================================================
//Ragnarok Online Monk jobchange script
//
//�@�� CHANGE_MO -> 0�`20
//     @monk_test -> 0�`10�A�}���\������
//===============================================================================================

//==========================================
// �]�E�ē�
//------------------------------------------

prt_monk,59,247,4	script	�C�s�m	120,6,2,{
	if(Job == Job_Monk) {
		mes "[�s��{��]";
		mes "���J�s�[�g���i�C���@�ɂ��炵��";
		mes "���Ƃ����}���܂��B";
		mes "�ȂɂƂ��C�s���̃����N�̎ז���";
		mes "�Ȃ���Ȃ��ł��������B";
		mes "���Ƃ����Ȃ��������N���Ƃ��Ă��c�c";
		close;
	}
	switch(CHANGE_MO) {
	case 0:
		mes "[�s��{��]";
		mes "��c�c���ɉ��̗p�ł����H";
		mes "�_���ȏC����ɓ��肽����";
		mes "���ɖ��O��JobLv��񎦂��Ă���";
		mes "�����Ă��������܂��B";
		next;
		if(Upper == UPPER_HIGH) {
			mes "[�s��{��]";
			mes "���c�c";
			mes "�\���󂲂����܂���I";
			mes "���ԈႦ�܂����c�c";
			next;
			mes "[�s��{��]";
			mes "�c�c";
			mes "�c�c�c�c";
			next;
			mes "[�s��{��]";
			mes "�����ԈႦ��̂��߂��炵���c�c";
			mes "�c�c�ǂ�������߂����Ă��������B";
			close;
		}
		mes "[�s��{��]";
		mes "�����A���O��JobLv���B";
		next;
		if(select("��������","������")==1) {
			mes "[�s��{��]";
			mes "����ҁI�o�čs���Ȃ����I";
			close2;
			warp "prt_fild03",357,256;
			end;
		}
		mes "[�s��{��]";
		mes "����c�c" +strcharinfo(0);
		mes "�ł��ˁc�c�B";
		mes "JobLv��" +JobLevel+ "�ł����B";
		next;
		mes "[�s��{��]";
		mes "���āA���̗p�ŖK�˂Ă��܂������H";
		mes strcharinfo(0)+ "��c�c";
		setarray .@word$,"�����N�B�̏C�s�p�����悤��","�����N�ɂȂ낤��","�C����ŋx�݂�";
		break;
	case 1:
		if(Job == Job_Acolyte && JobLevel >= 40) {
			mes "[�s��{��]";
			mes "�ǂ��ł����H";
			mes "�����l�����ς��܂������H";
			setarray .@word$,"������","�����N�ɂȂ肽���ł��I","���������x�݂܂�";
			break;
		}
		mes "[�s��{��]";
		mes "������茩�Ă����Ȃ����B";
		mes "����������̂����邩������܂���B";
		close;
	case 2:
		mes "[�s��{��]";
		mes "���U���V�ɂ���Ȃ����B";
		mes "���V�͂�������쓌�̕��p�A";
		mes "�C���@�����ɂ���������͂��ł��B";
		close;
	default:
		mes "[�s��{��]";
		mes "����c�c�������C�s�����z��";
		mes "�ǂ������N�ɂȂ��Ă��������B";
		close;
	}
	//���j���[����
	next;
	switch(select(.@word$[0],.@word$[1],.@word$[2])) {
	case 1:
		mes "[�s��{��]";
		mes "����A�����ł����c�c";
		mes "������܂����B";
		mes "�����������N�̏C�s����p��";
		mes "�����̖��ɗ��悤";
		mes "����Ă��܂��B";
		set CHANGE_MO,1;
		close;
	case 2:
		if(Job != Job_Acolyte) {
			mes "[�s��{��]";
			mes "�͂́A�������낢��k�������܂��ˁB";
			close;
		}
		if(JobLevel < 40) {
			mes "[�s��{��]";
			mes "����c�c���Ȃ��ɂ͂܂�";
			mes "���̎��i�������悤�ł��B";
			mes "��X�́A�A�R���C�gJobLv��";
			mes "40�ȏ�̐l�����Ɏ������󂯂�";
			mes "���i��^���Ă���̂ł��B";
			next;
			mes "[�s��{��]";
			mes "�܁A�����������H���炵��";
			mes "�̂ł�����A�����N�B�̏C�s�p��";
			mes "�ώ@���Ă����Ɨǂ��ł��傤�B";
			next;
			mes "[�s��{��]";
			mes "��X�����N�̏C�s����p��";
			mes "�����̖��ɗ��悤";
			mes "����Ă��܂��B";
			set CHANGE_MO,1;
			close;
		}
		mes "[�s��{��]";
		mes "����AJobLv��������x�܂�";
		mes "�B���Ă���l�q�B";
		mes "�悵�A���ɓ����Ė��U���V��";
		mes "����Ȃ����B���̕���";
		mes "���Ȃ��𓱂��Ă�������ł��傤�B";
		set CHANGE_MO,2;
		close;
	case 3:
		mes "[�s��{��]";
		mes "�����ł����c�c�����ł����̗l�q";
		mes "���܂ɂ͋x�ނ��Ƃ���؂ł��B";
		mes "������̃����N�C����ŋx���";
		mes "�����Ɨǂ��ł��傤�B";
		next;
		mes "[�s��{��]";
		mes "�����_�ɋ߂Â����Ɠw�͂���";
		mes "���B�����N�̎p���A���Ȃ���";
		mes "�C�s�ɂ��𗧂��Ƃ��肢�܂��B";
		set CHANGE_MO,1;
		close;
	}
OnTouch:
	if(Job == Job_Monk)
		end;
	switch(CHANGE_MO) {
	case 0:
		mes "[�s��{��]";
		mes "���ҁI";
		mes "�ّm�̋��Ȃ����̐_����";
		mes "�C����ɗ������邱�Ƃ�";
		mes "������܂���I";
		next;
		mes "[�s��{��]";
		mes "���X�ɗ�������Ȃ����I";
		close;
	case 1:
		mes "[�s��{��]";
		mes "������茩�Ă����Ȃ����B";
		mes "����������̂����邩������܂���B";
		close;
	case 2:
		mes "[�s��{��]";
		mes "���U���V�ɂ���Ȃ����B";
		mes "���V�͂�������쓌�̕��p�A";
		mes "�C���@�����ɂ���������͂��ł��B";
		close;
	default:
		mes "[�s��{��]";
		mes "����c�c�������C�s�����z��";
		mes "�ǂ������N�ɂȂ��Ă��������B";
		close;
	}
}

//==========================================
// �����\������ѓ]�E
//------------------------------------------

monk_in,99,58,4	script	���V	60,{
	mes "[���U���V]";
	mes "��n�ƋC�̗͂��F��";
	mes "�K�^�������炳�񂱂Ƃ��c�c";
	mes "�ӂށA���p�ł킵��K�˂��H";
	next;
	if(SkillPoint) {
		mes "[���U���V]";
		mes "�X�L���|�C���g���c���Ă��Ă�";
		mes "�]�E�͂��Ȃ�ʁI";
		mes "�F����ė��Ȃ����B";
		close;
	}
	if(Job == Job_Monk) {
		mes "[���U���V]";
		mes "�C�s�͑����Ă��邩�H";
		mes "��ɐ��i��S������悤�ɁB";
		next;
		mes "[���U���V]";
		mes "��X�͓��̂�b���A�������_��ۂ��˂�";
		mes "�׈��Ȃ�҂����̓��̂�_���ɗ���B";
		next;
		mes "[���U���V]";
		mes "������X�͐_���̑�s��";
		mes "�_�̑㗝���邱�Ƃ�Y��Ă͂Ȃ�ʁB";
		mes "�׈��Ȉӎu�ɂ����܂�ʂ悤";
		mes "�C������̂���B";
		close;
	}
	if(Job != Job_Acolyte) {
		mes "[���U���V]";
		mes "���k������Ȃ�A�v�����e���吹����";
		mes "�s�����悢�B�����͑��k���ł͂Ȃ��B";
		mes "�܂��Ă��ʂ��̂悤�ɑ��̐E�ƂɏA��";
		mes "�҂ɏq�ׂ邱�Ƃ͂Ȃ��B";
		close;
	}
	switch(CHANGE_MO) {
	case 0:
	case 1:
		mes "[���U���V]";
		mes "���ʂ��̓A�R���C�g���ȁB";
		mes "���k������Ȃ�A�v�����e���吹����";
		mes "�s���Ă݂�B�����͑��k���ł͂Ȃ��B";
		mes "�����N�ɂȂ���肪�Ȃ���΁A";
		mes "���̏ꏊ�֍s���悤�ɁB";
		close;
	case 2:
		mes "[���U���V]";
		mes "�����N�ɂȂ肽���Ƃ���";
		mes "��҂̂悤�����c�c�H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���U���V]";
			mes "�ӂށc�c";
			mes "�킵�̊������������񂶂�c�c";
			close;
		}
		mes "[���U���V]";
		mes "�ӂށc�c����Ȏ���ɂ�";
		mes "�܂���X�����N�̑��݂�";
		mes "�Y��ʎ҂�����Ƃ͂ȁc�c";
		mes "�悭�Q�����ȁA" +(Sex? "�N": "��")+ "��B";
		next;
		mes "[���U���V]";
		mes "�����N�u�]�����c�c";
		mes "�������̂��B";
		mes "�ꉞ�A�����N�ɂȂ�O��";
		mes "�m���Ă����˂΂Ȃ�ʂ��Ƃ�����B";
		next;
		mes "[���U���V]";
		mes "��烂���N�͐_�Ɏd���Ȃ����";
		mes "�Ȃ̓��̂��Ɍ��ɂ܂Œb���A";
		mes "���̐��ɐM��`����҂ł���B";
		next;
		mes "[���U���V]";
		mes "���̂�b���邱�Ƃ́A�M�ɋw�Ȃ�";
		mes "���m��ނ��A���R�̑S�Ă̎�����";
		mes "���a���A���̉��b���Ȑg�Ŏ󂯂�";
		mes "���߂���B";
		next;
		mes "[���U���V]";
		mes "�ܘ_�A���_��b���A";
		mes "�הO��ނ��邱�Ƃ��厖�����B";
		next;
		mes "[���U���V]";
		mes "�����̏C�s�ߒ��͔���";
		mes "�������A�傫�ȋ�𔺂����������B";
		mes "���A����ɑς����邩�ǂ�����";
		mes "�����N�ɂȂ�邩�ǂ����̕�����ڂ�";
		mes "�Ȃ�B";
		next;
		mes "[���U���V]";
		mes "���āA�ł͂��ʂ��������N�ƂȂ�";
		mes "�_�Ɏd����m�ł���ӎu�����邩";
		mes "�ǂ��������������Ǝv���B";
		next;
		mes "[���U���V]";
		mes "�܂��A���̐S�\�����ł��Ă��邩";
		mes "���邩��A�ȉ��̂��̂��W�߂�";
		mes "���Ȃ����B";
		next;
		set CHANGE_MO,rand(3,9);
		switch(CHANGE_MO) {
		case 3:	//�ׂƂׂƂ���t��5�A�~�~�Y�̔�10�A�΃n�[�u20
			setarray .@need,938,1055,511;
			setarray .@amount,5,10,20;
			break;
		case 4:	//�T���̂�����20�A�S�z��5�A�n�[�u3
			setarray .@need,942,1002,510;
			setarray .@amount,20,5,3;
			break;
		case 5:	//�A���̌s30�A�[���s�[5�A峂̔�10
			setarray .@need,905,909,955;
			setarray .@amount,30,5,10;
			break;
		case 6:	//����������������5�A��������20�A�W�����S��5
			setarray .@need,943,935,912;
			setarray .@amount,5,20,5;
			break;
		case 7:	//�T�C�t�@�[5�A���n�[�u10�A���n�[�u10
			setarray .@need,7053,509,508;
			setarray .@amount,5,10,10;
			break;
		case 8:	//��������̉�10�A���܂̑��̗�5�A�ŃL�m�R�̖E�q20
			setarray .@need,913,948,7033;
			setarray .@amount,10,5,20;
			break;
		case 9:	//�n���l�Y�~�̐j5�A�����̎�20�A�Z����10
			setarray .@need,1027,1025,1042;
			setarray .@amount,5,20,10;
			break;
		}
		mes "[���U���V]";
		for(set .@i,0; .@i<3; set .@i,.@i+1)
			mes getitemname(.@need[.@i])+ " " +.@amount[.@i]+ "��";
		mes "���W�߂Ă���悤�ɁB";
		next;
		mes "[���U���V]";
		mes "���ʂ����g�������̂�����A";
		mes "�����̎�Œ��ڏW�߂Ă���悤�ɁB";
		next;
		mes "[���U���V]";
		mes "�ł͑�������܂����Ȃ����B";
		mes "�����o������I";
		mes "�_�̂����삪����悤�F���Ă���B";
		close;
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
		mes "[���U���V]";
		mes "�ӂނ��c�c";
		next;
		switch(CHANGE_MO) {
		case 3:	//�ׂƂׂƂ���t��5�A�~�~�Y�̔�10�A�΃n�[�u20
			setarray .@need,938,1055,511;
			setarray .@amount,5,10,20;
			break;
		case 4:	//�T���̂�����20�A�S�z��5�A�n�[�u3
			setarray .@need,942,1002,510;
			setarray .@amount,20,5,3;
			break;
		case 5:	//�A���̌s30�A�[���s�[5�A峂̔�10
			setarray .@need,905,909,955;
			setarray .@amount,30,5,10;
			break;
		case 6:	//����������������5�A��������20�A�W�����S��5
			setarray .@need,943,935,912;
			setarray .@amount,5,20,5;
			break;
		case 7:	//�T�C�t�@�[5�A���n�[�u10�A���n�[�u10
			setarray .@need,7053,509,508;
			setarray .@amount,5,10,10;
			break;
		case 8:	//��������̉�10�A���܂̑��̗�5�A�ŃL�m�R�̖E�q20
			setarray .@need,913,948,7033;
			setarray .@amount,10,5,20;
			break;
		case 9:	//�n���l�Y�~�̐j5�A�����̎�20�A�Z����10
			setarray .@need,1027,1025,1042;
			setarray .@amount,5,20,10;
			break;
		}
		for(set .@i,0; .@i<3; set .@i,.@i+1) {
			if(countitem(.@need[.@i]) < .@amount[.@i]) {
				mes "[���U���V]";
				mes "�܂��������ł��Ă��Ȃ��B";
				mes "�W�߂�͈̂ȉ��̂��̂���B";
				for(set .@i,0; .@i<3; set .@i,.@i+1)
					mes getitemname(.@need[.@i])+ " " +.@amount[.@i]+ "��";
				mes "���W�߂Ă���悤�ɁB";
				close;
			}
		}
		for(set .@i,0; .@i<3; set .@i,.@i+1)
			delitem .@need[.@i],.@amount[.@i];
		set CHANGE_MO,10;
		mes "[���U���V]";
		mes "���ށI�S�Ď�ɓ���Ă����ȁI";
		mes "��J�����ȁI";
		mes "�������ʂ��̈ӎu�͕K���_��";
		mes "�`��������Ƃ���낤�B";
		next;
		mes "[���U���V]";
		mes "�悵�A����ł͐�̏C�s��";
		mes "�i��ł��炨���B";
		mes "�u���b�v�ɉ�悤�ɁB";
		mes "�z�͂�������k��";
		mes "��n�ɂ���͂�����B";
		close;
	case 10:
		mes "[���U���V]";
		mes "���̏C�s�ɐi��ł��炤�B";
		mes "�u���b�v�̂Ƃ���ɍs���Ȃ����B";
		mes "�z�͂�������k��";
		mes "��n�ɂ���͂�����B";
		close;
	default:	//11�`19�̏ꍇ
		mes "[���U���V]";
		mes "���ށA�C�s������ȁB";
		mes "�w�͂���悤�ɁB";
		close;
	case 20:
		if(countitem(506)) {
			mes "[���U���V]";
			mes "����H�܂���������ł��Ȃ��ȁB";
			mes "���̗΃|�[�V�����Ɏ��Ă�����";
			mes "���݂Ȃ����B";
			mes "���̖�����܂Ȃ��Ă̓����N�Ƃ���";
			mes "�g�̂𐮂��邱�Ƃ��ł��񂼁B";
			close;
		}
		mes "[���U���V]";
		mes "�S�Ă̏C�s���I�����ȁB";
		mes "�������ʂ��̓����N�ɂȂ鎑�i��";
		mes "�\���������B";
		mes "�����񂾗��ɂ���Đg�̂�";
		mes "������ꂽ����낤�B";
		next;
		mes "[���U���V]";
		mes "�܂����M�d�Ȗ���̂ĂĂ͂��܂��ȁH";
		mes "�ł́A�����N�Ƃ��Đ����邽�߂�";
		mes "�����������Γ]�E�����Ƃ���B";
		next;
		mes "[���U���V]";
		mes "���ʂ��͎c�������̑S�Ă�";
		mes "�_�̂��߂ɕ����邩�H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���U���V]";
			mes "�c�c";
			mes "�܂������N�ɂȂ邽�߂�";
			mes "�S���ł��Ă��Ȃ��ƌ����̂��H";
			mes "���������C�s�����Ă��Ȃ����B";
			mes "���ɐ��܂�҂������N�ɂ���";
			mes "�킯�ɂ͂����ʁB";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͎�ɓ��ꂽ�\�͂�";
		mes "�Ȃ̂��߂����ɍs�g���邩�H";
		next;
		if(select("�͂�","������")==1) {
			mes "[���U���V]";
			mes "�Ȃ�ʁB��X�����N�̗͂�";
			mes "�Ȃ̂��߂����Ɏg���̂ł͂Ȃ��B";
			mes "�_�̑�s�ҁE�_���̎��s�҂���";
			mes "���o�����������Ȃ���΂Ȃ�Ȃ��B";
			mes "������Ȃ̂��߂ɍs�g����Ƃ́I";
			next;
			mes "[���U���V]";
			mes "�����N�Ƃ͂ǂ�ȑ��݂Ȃ̂���";
			mes "������x�悭�l���Ă���̂��B";
			mes "����ȐS�\���ł͐����̗~�S��";
			mes "���܂�A�������ɔ\�͂��������낤�B";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͐_�������҂�";
		mes "���`�̐R�����������Ƃ�";
		mes "���߂��Ȃ����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���U���V]";
			mes "��X�����N�����ƐS����B";
			mes "���l����Ƃ��_�������҂�";
			mes "���ɂ����Ă͂Ȃ�ʁB";
			next;
			mes "[���U���V]";
			mes "���������A�R���C�g��";
			mes "�C�s��ς�ł��Ȃ����B";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͐��`�̐R�����������A";
		mes "�Ȃ̋]�����Ȃ݂����邩�H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���U���V]";
			mes "����Ȋo��ł͂Ȃ�ʁB";
			mes "�Ȃ��]���ɂ��Ă����`���т����Ƃ�";
			mes "���h�Ȃ��Ƃ���B";
			next;
			mes "[���U���V]";
			mes "�]���Ƃ����̂͂ǂ������Ӗ�����";
			mes "�悭�l���Ă��Ȃ����B";
			mes "�����ĈՂ������̂ł͂Ȃ��c�c";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͑����̃����X�^�[��";
		mes "�����A��邱�ƂɂȂ낤�Ƃ�";
		mes "���l�̐퓬�������邩�H";
		next;
		if(select("�͂�","������")==1) {
			mes "[���U���V]";
			mes "����͂Ȃ�ʁB";
			mes "�����̃����X�^�[�������A���";
			mes "���Ƃ́A���]���𑝂₷���";
			mes "�Ȃ낤�B���������s���͐T�܂˂�";
			mes "�Ȃ��̂��B";
			next;
			mes "[���U���V]";
			mes "��X�̋��x�Ȑ��_�Ɠ��̂��Ȃ�����";
			mes "���Ă��A�����͂Ȃ��B";
			next;
			mes "[���U���V]";
			mes "���ꂪ���l�������Ă������ł��A";
			mes "���ʓI�ɂ���ȏ�̈������Ԃ������炷";
			mes "�����ɂȂ肩�˂�B";
			mes "�����N�̂��ׂ����Ƃ����Ȃ̂�";
			mes "������x�l���Ă��Ȃ����B";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͊X�⑺�ŁA�������t��";
		mes "�����Ȃ���������Ƃ����邩�H";
		next;
		if(select("�͂�","������")==1) {
			mes "[���U���V]";
			mes "������B";
			mes "����̓����N�����ɂł͂Ȃ��A";
			mes "�S�Ă̐l�ԂɌ����邱�Ƃ���B";
			mes "���邳�����񂾂Ƃ���ő����";
			mes "����񂶂�낤���ȁB";
			next;
			mes "[���U���V]";
			mes "���@���s���Ƃ��ł��������B";
			mes "�Ȃ̍s��������x�U��Ԃ�̂���B";
			close;
		}
		mes "[���U���V]";
		mes "���ʂ��͎������_�̑�s�҂�";
		mes "���邱�Ƃ����o���A�_�̂��߂�";
		mes "�g������邱�Ƃ��ł��邩�H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���U���V]";
			mes "����ȐS���ł̓����N��";
			mes "�Ȃ邱�Ƃ͂��Ȃ�ʁB";
			mes "��X�̎��Ƌ��ɐ_�ɔ�����";
			mes "�҂���ł����炷���Ƃ�";
			mes "�ł���΁A����͈Ӗ��𐬂�";
			mes "�̂���B";
			close;
		}
		mes "[���U���V]";
		mes "�Ō�ɁA���܂ŏq�ׂ����Ƃ�";
		mes "�S�Ď��Ɛ����Ȃ����B";
		next;
		if(select("�����܂�","�����ł�")==2) {
			mes "[���U���V]";
			mes "�c�c";
			next;
			mes "[���U���V]";
			mes "�܂��C�s������Ȃ��悤���B";
			mes (Sex? "�N": "��")+ "��A�܂������N�ɔF�߂�";
			mes "���Ƃ͂ł��ʁB";
			next;
			mes "[���U���V]";
			mes "�Ăюn�߂���C�s���s����";
			mes "�ق����ǂ����c�c";
			mes "�S����߂Ă܂��Q��B";
			next;
			mes "[���U���V]";
			mes (Sex? "�N": "��")+ "�ɐM�`���`���悤�Ɂc�c";
			close;
		}
		mes "[���U���V]";
		mes "����ł́A����ɂĐ���̋V��";
		mes "�I���B";
		mes "��X��" +(Sex? "�Z��": "�o��")+ "�A�������ɐ��܂��I";
		next;
		mes "[���U���V]";
		mes (Sex? "�N": "��")+ "�̐���͎��̋��ƌN�̋��A";
		mes "��X�������_�ɓ`������B";
		next;
		mes "[���U���V]";
		mes "����ł͂��ꂩ��";
		mes "���ʂ��̌o����˂��B";
		next;
		mes "[���U���V]";
		mes "�����c�c���ꂩ��365�̌o����";
		mes "�˂����B�����Ȃ�I";
		next;
		mes "[���U���V]";
		mes "�J�[�[�[�[�b";
		next;
		mes "[���U���V]";
		mes "�t�D�D�D�D�[�[";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- �t���͐[�ċz�������� -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- ���̌o����˂��n�߂� -";
		next;
		mes "[���U���V]";
		mes "�k�I�����I�I";
		next;
		mes "[���U���V]";
		mes "�A�^�^�^�^�^�^";
		next;
		mes "[���U���V]";
		mes "�Z�C�b�I";
		next;
		mes "[���U���V]";
		mes "�`���C���[�I";
		next;
		mes "[���U���V]";
		mes "�t�D�D�D�D�D�[";
		next;
		mes "[���U���V]";
		mes "�I���^�@�I";
		next;
		set .@itemid,(JobLevel >= 50)? 1804: 1801;
		nude;
		jobchange job_Monk;
		set CHANGE_MO,0;
		mes "[���U���V]";
		mes "�]�E�������B";
		next;
		mes "[���U���V]";
		mes "�N�b�c�c";
		next;
		mes "[���U���V]";
		mes "��͂�c�c�V���ɂ͏��Ăʁc�c";
		next;
		mes "[���U���V]";
		mes "�����A���ʂ��������N���B";
		mes "���u�ɂȂ������Ƃ��j�����B";
		next;
		mes "[���U���V]";
		mes "��قǂ̐����Y���łȂ����B";
		next;
		mes "[���U���V]";
		mes "��邬�Ȃ��M�̂��ƁA";
		mes "�Ȃ̏C�s��Y���Ȃ�B";
		next;
		mes "[���U���V]";
		mes "����͌N�ɗ^����j���̕i���B";
		mes "�𗧂Ă邪�悢�B";
		getitem .@itemid,1;
		close;
	}
}

//==========================================
// �ꎟ�����i�S���Ï��j
//------------------------------------------

prt_monk,251,255,4	script	���b	79,{
	switch(CHANGE_MO) {
	default:
		mes "[���b]";
		mes "�����������N�́A";
		mes "�_�̑�َ҂ł��c�c";
		mes "�����Đ_���̑�s�ҁI";
		next;
		mes "[���b]";
		mes "�������̓����Ղ邱�Ƃ�";
		mes "���Ȃ킿�_�ɔ����邱�ƁI";
		next;
		mes "[���b]";
		mes "����āc�c";
		mes "���Ȃ����G�ł���!?";
		mes "���̑O���ǂ�������c�c";
		next;
		mes "[���b]";
		mes "���̑O��j�ނ��Ƃ́c�c";
		mes "�c�c";
		mes "�L�B�F�F�F�F�F�F�B�I";
		next;
		mes "[���b]";
		mes "�n�b�n�b�n�c�c";
		next;
		mes "[���b]";
		mes "�����܂������H";
		mes "�ȂɁA�f�U��ł��B";
		close;
	case 10:
		mes "[���b]";
		mes "���̗p�ł����H";
		mes "�_�Ɋւ���b���������̂ł����H";
		next;
		mes "[���b]";
		mes "���Ȃ��̓����N�ւ̏C�s��";
		mes "������g�B���Ȃ��̋C�̗����";
		mes "�����ԃ����N�̂���ɋ߂��B";
		next;
		mes "[���b]";
		mes "�C�����J����Ă��邱�Ƃ��������";
		mes "���U���V�l�̂Ƃ���֍s����";
		mes "�ǂ��ł��傤�B";
		next;
		mes "[���b]";
		mes "���́A�����N�ɂȂ�҂Ȃ��";
		mes "���Ȃ炸�m���Ă��Ȃ���΂Ȃ�Ȃ�";
		mes "�m���ɂ��ċ����Ă��܂��B";
		mes "������̋����𗝉�������A";
		mes "�g�̂̒b�B���s���܂��B";
		next;
		mes "[���b]";
		mes "�������ꂩ��q�ׂ邱�Ƃ��o���A";
		mes "��ňÏ����Ă�������Ό��\�ł��B";
		mes "�����A���_�W���͂ł��Ă��܂����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���b]";
			mes "�������ł�����܂����Ă��������B";
			close;
		}
		mes "[���b]";
		mes "����ł́c�c";
		next;
		mes "[���b]";
		mes "�悭�����ĐS�Ŋo���Ă��������B";
		set CHANGE_MO,rand(11,13);
		break;
	case 11:
	case 12:
	case 13:
		mes "[���b]";
		mes "��낵���A������x�����܂��傤�B";
		break;
	case 14:
		mes "[���b]";
		mes "����c�c�H";
		mes "�N�̌��֍s�����͂��ł�";
		mes "�������͂��c�c";
		next;
		mes "[���b]";
		mes "������c�c";
		next;
		mes "[���b]";
		mes "���̔E�ϗ͂������Ă���Ƃ��c�c�H";
		next;
		mes "[���b]";
		mes "��낵���B";
		mes "������x�\���グ�܂���";
		mes "�x�N�l�ɂ�����������B";
		close;
	case 15:
		mes "[���b]";
		mes "�c�����C�s���������Ă��������B";
		close;
	}
	next;
	switch(CHANGE_MO) {
	case 11:
		setarray .@list$,"�_�ɋw�����҂ɐR�����I","�_�ɋw�����҂ɓV�����I","�_�ɋw�����҂ɏI�����I","�����������N��","�_�̈ӎu��n��ɓ`����","�_�̑�َ҂ł���","�_���̑�s�҂ł���","���̐g�؂�􂩂�Ă���悤��","���ׂĂ͐_�̂��߂�","�_�ɋw�����҂��ق����߂�";
		break;
	case 12:
		setarray .@list$,"�_�̑�َ҂ł���","�_���̑�s�҂ł���","�����N","�������̎g����","�������ɗ^����ꂽ���̂�","�_�ɋw����","�����Ȃ�ғ���","�p�j����׈��Ȏғ���","�Ō�܂Œǂ��l��","���ł����邱��";
		break;
	case 13:
		setarray .@list$,"�_�̐��𐢂ɓ`����ׂ�","�^����ꂽ���̂�����","�����������N��","�_���̑�s�҂ł���","�_�̑�َ҂ł���","�������̎g����","�_�ɋw����","���ʂ��Ƃ����ł��ʎ�","�����Ȏғ���","���ł����邱��";
		break;
	}
	for(set .@i,0; .@i<10; set .@i,.@i+1) {
		mes "[���b]";
		mes .@list$[.@i];
		next;
	}
	mes "[���b]";
	mes "�͂��A�����܂łł��B";
	mes strcharinfo(0)+ "�A���Ȃ��̔Ԃł��B";
	next;
	function Shuffle;
	for(set .@c,0; .@c<10; set .@c,.@c+1) {
		Shuffle .@list$;
		set .@ret,select(	@monk_word$[0],@monk_word$[1],@monk_word$[2],@monk_word$[3],@monk_word$[4],
					@monk_word$[5],@monk_word$[6],@monk_word$[7],@monk_word$[8],@monk_word$[9])-1;
		if(.@c == 0)
			mes "["+strcharinfo(0)+"]";
		mes @monk_word$[.@ret];
		if(@monk_word$[.@ret] == .@list$[.@c])
			set .@point,.@point+1;
	}
	cleararray @monk_word$,"",10;	//�����g��Ȃ��̂ŏ���
	next;
	mes "[���b]";
	mes "�ӂ��c�c";
	mes "����ꂳ�܂ł����B";
	next;
	mes "[���b]";
	mes "���āc�c";
	next;
	if(.@point == 10) {
		mes "[���b]";
		mes "���h�ł��ˁA�����ł����B";
		next;
		mes "[���b]";
		mes "���������f�͋֕��B";
		mes "�����N�ւ̓��͂܂��܂�";
		mes "�������c�c";
		next;
		mes "[���b]";
		mes "�^�@�b�I";
		next;
		mes "�Z�C�b�I";
		next;
		mes "�n�@�b�I";
		next;
		mes "�C���@�b�I";
		next;
		mes "[���b]";
		mes "���Ȃ��̌����͂ЂƂ�";
		mes "�����N�̂���ɋ߂Â����悤�ł��B";
		next;
		mes "[���b]";
		mes "�ł́A�x�N�l�̂Ƃ����";
		mes "�s���Č��Ȃ����B";
		set CHANGE_MO,14;
		close;
	}
	mes "[���b]";
	mes "��c�c���̒��x���o�����Ȃ��Ƃ́c�c";
	next;
	mes "[���b]";
	mes "�����قǂ��\���グ�܂�����";
	mes "�����o����̂ł͂Ȃ��A";
	mes "�S�ŗ�������̂ł��B";
	next;
	mes "[���b]";
	mes "�����A������x���݂܂��傤�B";
	next;
	mes "[���b]";
	mes "�ꉞ�\���グ�Ă����܂����A";
	mes "������I���Ȃ����";
	mes "��ɐi�ނ��Ƃ͂ł��܂���B";
	close;

	//.@list$�̕�������V���b�t������@monk_word$�Ɋi�[����
	function Shuffle {
		setarray .@num,0,1,2,3,4,5,6,7,8,9;
		for(set .@i,10; .@i>0; set .@i,.@i-1) {
			set .@r,rand(.@i);
			set @monk_word$[10-.@i],getelementofarray(getarg(0),.@num[.@r]);	//�O���[�o���ϐ��Ƃ��Ĉ���
			deletearray .@num[.@r],1;						//�I�����ꂽ�ԍ��͍��
		}
		return;
	}
}

//==========================================
// �j�������i�ۑ莎���j
//------------------------------------------

prt_monk,57,179,0	script	�x�N	110,{
	switch(CHANGE_MO) {
	default:
		mes "[�x�N]";
		mes "�n�@�@�@�@�I";
		next;
		mes "- �ґz�ɒ^���Ă���悤�� -";
		close;
	case 14:
		mes "[�x�N]";
		mes "�c�c";
		next;
		mes "[�x�N]";
		mes "�c�c�c�c";
		next;
		mes "[�x�N]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�x�N]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		menu "���́c�c",-;
		mes "[�x�N]";
		mes "�����c�c";
		mes "�_�Ƃ̑Θb���ז����邩��ɂ�";
		mes "�����̖󂠂��Ă̂��Ƃ��낤�ȁH";
		next;
		mes "[�x�N]";
		mes "�c�c";
		mes "�܂����̖��A�a���낤�B";
		next;
		mes "[�x�N]";
		mes "�����A���p�ŗ�����";
		mes "��������悤�ɁB";
		next;
		if(select("���b�l�̏Љ�ŗ��܂���","���ł��Ȃ��ł�")==2) {
			mes "[�x�N]";
			mes "�c�c";
			mes "�ӂށc�c�����ŋA����";
			mes "�v���Ȃ�H";
			close;
		}
		mes "[�x�N]";
		mes "����H�������c�c";
		mes "�ǂ�c�c";
		next;
		mes "[�x�N]";
		mes "�ӂށc�c";
		mes "�������c�c";
		mes "�������A�悵�c�c";
		next;
		mes "[�x�N]";
		mes "�Ƃ���ŁA���b��";
		mes "���������̂��H";
		next;
		if(select("���c�c�����Ɓc�c","�����Ï����܂���","�����f�f�����Ă��炢�܂���")!=2) {
			mes "[�x�N]";
			mes "���킯���I";
			mes "�ז�����łȂ��I";
			close;
		}
		mes "[�x�N]";
		mes "�ӂށA���āc�c";
		mes "���̌��ʂ́H";
		next;
		switch(select("���c�c���������c�c","�̂�b���܂���","�����N�ւ̏����������Ă��������܂���","�����N�̌����ɋ߂Â��Ă��������܂���")) {
			default:
				mes "[�x�N]";
				mes "���킯���I";
				mes "�ז�����łȂ��I";
				close;
			case 3:
				mes "[�x�N]";
				mes "�������������邪�c�c";
				mes "���m�ȓ����ł͂Ȃ��B";
				close;
			case 4:
				mes "[�x�N]";
				mes "�����A�����̑̂̒���";
				mes "�����ς���������o�����ȁB";
				mes "�悵�A���̏C�s�ֈڂ邩�B";
				next;
				mes "[�x�N]";
				mes "�悵�A���͂��O�ɏC�s�ɂ���";
				mes "�I���̗]�n��^���Ă��B";
				mes "�����炢���ꂩ��I���";
				mes "�C�s���s�����悢�B";
				next;
				if(select("�L�m�R�̏W","�}���\��")==1) {
					mes "[�x�N]";
					mes "�ӂށA�L�m�R�̏W�Ƃ������Ƃ�";
					mes "�E�ϗ͂�b���悤�Ƃ����̂��B";
					mes "�킩�����B�������I���Ă���";
					mes "�܂��b�������邪�悢�B";
					set CHANGE_MO,15;
				}
				else {
					mes "[�x�N]";
					mes "�ӂށA�̗͂̌��E�����ɂ߂�";
					mes "���x�ȓ��̂𓾂�Ƃ����̂��ȁB";
					mes "�悵�A�������I���Ă���";
					mes "�܂��b�������邪�悢�B";
					set CHANGE_MO,16;
				}
				close;
		}
	case 15:
		mes "[�x�N]";
		mes "�����͂ł������B";
		next;
		mes "[�x�N]";
		mes "���O���I�񂾃L�m�R�̏W��";
		mes "���Ƃ���Ȃ�E�ϗ͂̎������B";
		next;
		mes "[�x�N]";
		mes "�����̏C���@�̒���";
		mes "���O�Ǝu�����ɂ���҂�";
		mes "�ꏏ�Ɏ������󂯂Ă��炤�B";
		next;
		mes "[�x�N]";
		mes "�����Ɏ󂯂�҂��������";
		mes "���ꂾ���L�m�R��T���̂�";
		mes "����ɂȂ邪�A���������������";
		mes "���钇�Ԃ��B�����łȂ����B";
		close;
	case 16:
		mes "[�x�N]";
		mes "�����͂ł������B";
		next;
		mes "[�x�N]";
		mes "���O���I�񂾃}���\����";
		mes "���Ƃ���Ȃ玩���Ƃ̐킢���B";
		next;
		mes "[�x�N]";
		mes "�����̏C���@�̒��֓��邪�ǂ��B";
		next;
		mes "[�x�N]";
		mes "����R�[�X���w��񐔂܂�鎎�����B";
		mes "�ł͍s���Ă����B";
		close;
	}
}

prt_monk,199,169,3	script	��叫	746,{
	mes "[��叫����]";
	mes "�������";
	mes "�����N�]�E������ł��B";
	next;
	switch(CHANGE_MO) {
	default:
		mes "[��叫����]";
		mes "���ł͐Â��ɁI";
		close;
	case 14:
		mes "[��叫����]";
		mes "�x�N�l�ł����c�c�H";
		next;
		mes "[��叫����]";
		mes "�x�N�l�͐Â��ȏꏊ��";
		mes "�D�܂�܂��B";
		mes "���̕��Ƃ��ł��ˁc�c";
		close;
	case 15:
	case 16:
		mes "[��叫����]";
		mes strcharinfo(0)+ "�c�c�ł����H";
		next;
		if(select("�͂��I","������")==1) {
			mes "[��叫����]";
			mes "�悵�A�ǂ��Ԏ��ł��I";
			mes "���������Ȃ���҂��Ă��܂���I";
			mes "���ւǂ����B";
			close;
		}
		mes "[��叫����]";
		mes "�Ⴄ�킯�͂Ȃ��I";
		mes "�������ɓ���̂ł��I";
		close;
	}
}

monk_test,329,61,3	script	����	753,{
	switch(CHANGE_MO) {
	default:
		mes "[�n��]";
		mes "����ɂ��́A������̓����N�C����A";
		mes "���J�s�g�[���i�C���@�ł��B";
		mes "���ɂ͓l��l����������Ⴂ�܂��B";
		next;
		mes "[�n��]";
		mes "���������u���Ă��镨��";
		mes "�G������A�������肷�邱��";
		mes "�����͉������Ă��������B";
		close;
	case 15:
	case 16:
		mes "[�n��]";
		mes "�ǂ̎�����Ɉړ����܂����H";
		next;
		mes "[�n��]";
		mes "�ꉞ�A�����������Ƃ���ɂ���";
		mes ((CHANGE_MO==15)? "�L�m�R�̏W": "�}���\��")+"�����ł������c�c";
		mes "�I���͎��R�ł��B";
		next;
		if(select("�E��-�L�m�R�̏W","�����Ƃ̐킢-�}���\������")==1) {
			mes "�E��-�L�m�R�̏W������";
			mes "�I�����܂����B";
			set CHANGE_MO,15;
			close2;
			warp "job_monk",226,175;
		}
		else {
			mes "�����ւ̒���-�}���\����";
			mes "�I�����܂����B";
			set CHANGE_MO,16;
			close2;
			warp "monk_test",386,387;
		}
		end;
	}
}

//==========================================
// �ۑ莎���i�L�m�R�̏W�j
//------------------------------------------

job_monk,225,180,0	script	����	89,{
	if(countitem(1069)) {	//�g�̖уx�g�x�g�L�m�R�����ł͖�����
		if(countitem(1069) >=30 || countitem(1070) >=30) {
			mes "[����]";
			mes "���ށI�㓙���I";
			mes "��ɐi��ł�낵���B";
			next;
			mes "[����]";
			mes "���́u�l��v�l��";
			mes "����Ă݂Ȃ����B";
			mes "�l��l�͏C���@��������";
			mes "��ԉ��ɂ���������͂����B";
			delitem 1069,countitem(1069);
			delitem 1070,countitem(1070);
			set CHANGE_MO,17;
			close2;
			warp "prt_monk",194,168;
			end;
		}
		mes "[����]";
		mes "�ނ��c�c�܂����Ȃ��ȁB";
		next;
		mes "[����]";
		mes "������߂邩�H";
		next;
		if(select("�L�m�R�������ƒT��","������߂�")==1) {
			mes "[����]";
			mes "�撣�ꂡ�I";
			close;
		}
	}
	else {
		mes "[����]";
		mes "�悵�A���͂��̃L�m�R�̏W������";
		mes "�S�����Ă���u�����v�ƌ����B";
		next;
		mes "[����]";
		mes "�M�l��������̌��������";
		mes "����Ύ����Ǝv���悤�ɁB";
		next;
		mes "[����]";
		mes "���͐��_�C�s�̈�Ƃ���";
		mes "�ȒP�ȍ앨���͔|���Ă���B";
		mes "�������ŋ߁A���̍앨�̂܂���";
		mes "�Ђǂ��L������L�m�R���ł���";
		mes "���܂��Ăȁc�c";
		next;
		mes "[����]";
		mes "���̃L�m�R��o�ł���̂�";
		mes "��`���Ă��炤�B";
		mes "������x���̂ł�����";
		mes "���̏؋��������Ă���Ηǂ��B";
		next;
		mes "[����]";
		mes "�؋��Ƃ́A";
		mes "�u�g�̖іԃL�m�R�v��";
		mes "�u�g�̖уx�g�x�g�L�m�R�v";
		mes "�ł���B";
		next;
		mes "[����]";
		mes "���������N�ɂȂ肽���΁A";
		mes "�������Ƃ������W�߂邱�Ƃ��B";
		mes "�����W�߂�Ƃ͌���ʂ��A";
		mes "������x�W�߂��猩���ɂ���悤�ɁB";
		next;
		mes "[����]";
		mes "�ł͎n�߂邩�H";
		next;
		if(select("�L�m�R�����","������߂�")==1) {
			mes "[����]";
			mes "�ł͊撣���Ă���I";
			close;
		}
	}
	announce "����: " +strcharinfo(0)+ "�A�]�E���� -�L�m�R�̏W- ��f�O",9;
	mes "[����]";
	mes "�M�l�������������ȁc�c";
	close2;
	warp "prt_monk",194,168;
	end;
}

//==========================================
// �ۑ莎���i�}���\���j
//------------------------------------------

monk_test,386,388,4	script	����	110,{
	mes "[���K�������N]";
	mes "�悭��������Ⴂ�܂����B";
	mes "�����͎��������������̏�B";
	next;
	mes "[���K�������N]";
	mes "�ƌ����Ă��������邾���ł��B";
	mes "�Ƃɂ����Ђ����瑖��̂ł��B";
	next;
	mes "[���K�������N]";
	mes "�r���œ����o�����肵�Ă͂Ȃ�܂���B";
	next;
	if(select("�����ł�","�Ƃɂ�������")==2) {
		mes "[���K�������N]";
		mes "�����ł��A���葱����̂ł��I";
		close;
	}
	announce "����: " +strcharinfo(0)+ "�A�]�E����������I",9;
	mes "[���K�������N]";
	mes strcharinfo(0)+ "�A�]�E����������I";
	set @monk_test,0;
	close2;
	warp "prt_monk",194,168;
	end;
}

monk_test,387,350,0	script	#MO_Goal	45,2,2,{
	set @monk_test,@monk_test+1;
	if(@monk_test == 9) {
		warp "monk_test",385,388;
		sleep 500;
		announce "�ē�: �悵�A�Ō�̎��񂾁B������I����Ύ����I�����B",9;
		end;
	}
	if(@monk_test == 10) {
		announce "�ē�: �撣�����ȁA" +strcharinfo(0)+ "!! �������I",9;
		mes "[�����ē�]";
		mes "�悵�A�u�l��v�l�̂Ƃ����";
		mes "�s���Ȃ����B";
		mes "�l��l�͏C���@������";
		mes "��ԉ��ɂ���������B";
		set CHANGE_MO,17;
		close2;
		warp "prt_monk",194,168;
		end;
	}
	warp "monk_test",385,388;
	end;
}

monk_test,82,384,0	script	#MO_Abyss	139,0,0,{
	announce "���Ƃ���: " +strcharinfo(0)+ "�A�R�[�X����O�ꂽ�B���̈ʒu����J�n���B",9;
	warp "monk_test",387,387;
	end;
}

monk_test,82,385,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,83,384,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,83,385,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,82,390,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,82,391,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,83,390,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,83,391,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,38,387,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,1
monk_test,38,389,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,39,387,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,1
monk_test,39,389,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,11,158,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,13,158,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,11,159,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,13,159,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,11,30,0	duplicate(#MO_Abyss)	���Ƃ���	139,3,0
monk_test,15,30,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,11,31,0	duplicate(#MO_Abyss)	���Ƃ���	139,3,0
monk_test,15,31,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,70,11,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,1
monk_test,70,13,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,71,11,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,1
monk_test,71,13,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,186,11,0	duplicate(#MO_Abyss)	���Ƃ���	139,2,3
monk_test,189,11,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,3
monk_test,387,42,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,387,43,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,389,42,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,389,43,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,387,164,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,387,165,0	duplicate(#MO_Abyss)	���Ƃ���	139,1,0
monk_test,389,164,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0
monk_test,389,165,0	duplicate(#MO_Abyss)	���Ƃ���	139,0,0

//==========================================
// �O�������i�얂�C�s�j
//------------------------------------------

monk_test,319,139,4	script	�l��	52,{
	switch(CHANGE_MO) {
	default:
		mes "[�l��]";
		mes "�Â��ɂ��Ȃ����c�c";
		mes "�t�D�D�D�D�c�c";
		next;
		mes "[�l��]";
		mes "�������J�s�g�[���i�C���@�ɂ�";
		mes "�����̎c���ꂽ�̋Ƃ�";
		mes "�����Ă���B";
		next;
		mes "[�l��]";
		mes "���̗��ɕ��󂳂ꂽ���̏h�G��";
		mes "����������Ă͂Ȃ�ʁc�c";
		close;
	case 17:
		mes "[�l��]";
		mes "�悭�������܂œw�͂����I";
		mes "���͍Ō�̎����A�얂�C�s��";
		mes "�S�����Ă���u�l��v�ƌ����B";
		next;
		mes "[�l��]";
		mes "�����A���t�͕K�v�Ȃ��I";
		mes "�s������݂̂��B";
		next;
		mes "[�l��]";
		mes "���H�̒��Ɍ����S�Ắu���v��";
		mes "���O�̎�ł��̐������������̂��B";
		next;
		mes "[�l��]";
		mes "�Ў�ȃv���[�X�g�ƈꏏ�ɂȂ�Ȃ�B";
		mes "���ɂ͒b����ꂽ���x�ȓ��̂�����B";
		next;
		mes "[�l��]";
		mes "�����A��������A�����オ��̂��I";
		next;
		mes "[�l��]";
		mes "�v���؂���͂𔭊����Ă݂�I";
		set CHANGE_MO,18;
		close2;
		warp "monk_test",88,74;
		end;
	case 18:
		mes "[�l��]";
		mes "���ށc�c";
		mes "���s�͐����̕�ƌ����B";
		mes "�����A�͂��o���čs���̂��I";
		close2;
		warp "monk_test",88,74;
		end;
	case 19:
		mes "[�l��]";
		mes "�悭�ł����I";
		mes "���̖ڂɋ����͂Ȃ������ȁB";
		mes "�悵�A���O�̓��������߂Ă�낤�B";
		next;
		mes "[�l��]";
		mes "��������߂΁A���O�̓�����";
		mes "���܂�A�����N���鎑�i�𓾂�";
		mes "���Ƃ��ł���͂����B";
		mes "���Ƃ́u���U�v���V�̌��֍s���I";
		getitem 506,1;
		set CHANGE_MO,20;
		close;
	case 20:
		mes "[�l��]";
		mes "���U���V�̌��֍s���I";
		close;
	}
}

monk_test,88,91,4	script	�����ē�#MO_Test	52,{
	mes "[�l��]";
	mes "���āA�얂�C�s�̏�����";
	mes "���������ȁH";
	next;
	switch(select("�͂�","������","���ӎ����𕷂�")) {
	case 1:
		mes "[�l��]";
		mes "����ł͌������F��B";
		mes "���H�ɖ����A�A��Ȃ��Ȃ�����";
		mes "��x�I������Ƃ����c�c";
		mes "���������̏ꍇ�͍Ō�ɋL�^";
		mes "�����ꏊ�ɖ߂���邪�ȁB";
		close2;
		if(strnpcinfo(2) == "MO_Test")
			warp "monk_test",125,177;
		else if(strnpcinfo(2) == "MO_Test1")
			warp "monk_test",125,277;
		else
			warp "monk_test",229,277;
		if(getnpctimer(1,"MO_Timer") == 0)	//�^�C�}�[����~���Ă���n��
			initnpctimer "MO_Timer";
		end;
	case 2:
		mes "[�l��]";
		mes "�p�ӂ��ł�����b�������Ă���B";
		close;
	case 3:
		mes "[�l��]";
		mes "����������ɂ́A�ڂɌ����Ȃ�";
		mes "�ǂ�����B";
		mes "�C�s�̂��߁A�ȒP�Ɉړ��ł���";
		mes "�悤���E���͂����̂��B";
		next;
		mes "[�l��]";
		mes "�J�n�ʒu���甽�Α��܂�";
		mes "�H�蒅���Ώo��������B";
		next;
		mes "[�l��]";
		mes "�C�s������ɂ�";
		mes "�׈��Ȃ�҂��p�j���Ă���B";
		mes "�s�����j�܂ꂽ����킸";
		mes "�ł��|���̂��B";
		mes "����ł͌������F��B";
		close;
	}
}

monk_test,82,85,1	duplicate(�����ē�#MO_Test)	�����ē�#MO_Test1	95
monk_test,95,85,4	duplicate(�����ē�#MO_Test)	�����ē�#MO_Test2	79

//==============================================================
monk_test,140,181,0	script	#MO_Test1-1	139,1,1,{
	monster "monk_test",140,181,"�]���r",1015,4;
	end;
}

monk_test,150,164,0	script	#MO_Test1-2	139,1,1,{
	monster "monk_test",150,164,"�]���r",1015,4;
	end;
}

monk_test,158,192,0	script	#MO_Test1-3	139,1,1,{
	monster "monk_test",158,192,"�}�~�[",1041,1;
	end;
}

monk_test,134,291,0	script	#MO_Test2-1	139,1,1,{
	monster "monk_test",134,291,"�]���r",1015,4;
	end;
}

monk_test,144,277,0	script	#MO_Test2-2	139,1,1,{
	monster "monk_test",144,277,"�]���r",1015,4;
	end;
}

monk_test,149,268,0	script	#MO_Test2-3	139,1,1,{
	monster "monk_test",149,268,"�]���r",1015,5;
	end;
}

monk_test,249,277,0	script	#MO_Test3-1	139,1,1,{
	monster "monk_test",249,277,"�]���r",1015,4;
	end;
}

monk_test,252,284,0	script	#MO_Test3-2	139,1,1,{
	monster "monk_test",252,284,"�}�~�[",1041,1;
	end;
}

monk_test,264,292,0	script	#MO_Test3-3	139,1,1,{
	monster "monk_test",264,292,"�}�~�[",1041,1;
	end;
}

//==============================================================
monk_test,0,0,0	script	MO_Timer	-1,{
	end;
OnTimer100000:
	killmonster "monk_test","All";
	//�����G���A���ɒN�����Ȃ��Ȃ�^�C�}�[�~�߂�
	if(getareausers("this",124,158,167,197) + getareausers("this",124,259,167,296) + getareausers("this",228,258,271,297) == 0)
		stopnpctimer;
	else
		initnpctimer;
	end;
}

//==============================================================

monk_test,166,178,0	script	#MO_Goal_	45,1,1,{
	mes "[�����ē�]";
	mes "�悵�A�撣�����ȁB";
	mes "�l��l�̌��֖߂�B";
	set CHANGE_MO,19;
	close2;
	warp "prt_monk",196,168;
	end;
}

monk_test,166,278,0	duplicate(#MO_Goal_)	#MO_Goal	45,1,1
monk_test,270,278,0	duplicate(#MO_Goal_)	#MO_Goal	45,1,1