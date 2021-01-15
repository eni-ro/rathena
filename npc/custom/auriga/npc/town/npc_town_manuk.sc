//= Auriga Script ==============================================================
// Ragnarok Online Manuk Town Script	by refis
//==============================================================================

//============================================================
// �L�̎�E��
//------------------------------------------------------------
manuk,108,357,4	script	�L�̎�E��	421,{
	if(CATHAND_POINT == 0) {
		mes "[�L�̎�E��]";
		mes "�����p���肪�Ƃ��������܂��B";
		mes "�L�̎�T�[�r�X�ł������܂��B";
		next;
		mes "[�L�̎�E��]";
		mes "�c�c���ɂ�ɂ�H";
		mes "���Ȃ���";
		mes "�L�̎�T�[�r�X��";
		mes "����_�񂵂Ă��Ȃ��悤�ł��Ȃ��B";
		next;
		mes "[�L�̎�E��]";
		mes "���̋@��ɐ�����ł�";
		mes "����_�񂵂ė~�����ł��I";
		mes "�_�񂷂�ƕ֗��ȃT�[�r�X��";
		mes "�󂯂���ł���B";
		next;
		mes "[�L�̎�E��]";
		mes "�_���";
		mes "^FF0000�~�b�h�K���h�A���R���Ԓn�ɂ���";
		mes "�L�̎�E��^000000�����Ă���邩��";
		mes "����A�ނɘb��������";
		mes "�_�񂵂Ă��������B";
		close;
	}
	mes "[�L�̎�E��]";
	mes "���ɂ�A";
	mes "����^FF0000�L�̎�T�[�r�X^000000";
	mes "�����p���肪�Ƃ��������܂��B";
	next;
	mes "[�L�̎�E��]";
	mes "���݁A���Ȃ���";
	mes "�L�̎�M�p�|�C���g�́A";
	mes "^FF0000" +CATHAND_POINT+ "^000000�|�C���g�ł��B";
	mes "�����́A�ǂ̃T�[�r�X�������p�ł����H";
	next;
	setarray .@str$,(CATHAND_POINT >= 10)? "�q�ɃT�[�r�X": "",
			(CATHAND_POINT >= 100)? "�L���[�v": "";
	switch(select("�ʒu�ۑ��T�[�r�X(�A���R���Ԓn)",.@str$[0],.@str$[1],"��߂�")) {
	case 1:
		savepoint "mid_camp",56,138;
		mes "[�L�̎�E��]";
		mes "���̐�ɂ���X�̏Z���B��";
		mes "������������";
		mes "�����ł̓Z�[�u�ł��Ȃ���ł��B";
		next;
		mes "[�L�̎�E��]";
		mes "������A";
		mes "�~�b�h�K���h�A���R���Ԓn";
		mes "�ɃZ�[�u���Ă����܂����B";
		mes "�\����Ȃ����ɂ�B";
		mes "���͔����̌����͎��ł��B";
		next;
		mes "[�L�̎�E��]";
		mes "���̑O�A�؂��Ǝv���Ē܂Ƃ���������";
		mes "�ߖ�����������ł��B";
		mes "�s�v�c�Ɏv���Ă悭������A";
		mes "�؂ł͂Ȃ����̐�̊X�̏Z���ł����B";
		mes "���ꂩ��ł��ɂ�A";
		mes "�Z�����₽���Ȃ����̂́B";
		close;
	case 2:
		if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
			mes "[�L�̎�E��]";
			mes "�ɂ�ɂ�H";
			mes "���������ł��ˁB";
			mes "�����ɐV�Ė`���҂�";
			mes "����Ȃ��͂��Ȃ̂Ɂc�c";
			next;
			mes "[�L�̎�E��]";
			mes "��{�X�L�������x��6�܂�";
			mes "�K�����Ă��Ȃ���";
			mes "�q�ɂ͗��p�ł��Ȃ��̂ł��B";
			close;
		}
		if(Zeny < 60) {
			mes "[�L�̎�E��]";
			mes "�ɂ�ɂ�H";
			mes "Zeny������Ȃ��悤�ł���B";
			mes "��X�L�̎�T�[�r�X��";
			mes "�q�ɗ��p����60Zeny�ł��B";
			mes "�������ł��傤�H";
			close;
		}
		set Zeny,Zeny-60;
		openstorage;
		close;
	case 3:
		mes "[�L�̎�E��]";
		mes "���݁A";
		mes strcharinfo(0)+ "�l��";
		mes "�L�̎�M�p�|�C���g�́A";
		mes "^FF0000" +CATHAND_POINT+ "^000000�|�C���g";
		mes "�ł��̂ŁA���̊X�ւ�";
		mes "�L���[�v�T�[�r�X�����p�ł��܂��B";
		next;
		switch(select("�A���R���Ԓn----5500z","�X�v�����f�B�b�h�t�B�[���h02----7500z","��߂�")) {
		case 1:
			set .@map$,"mid_camp";
			set .@warpx,56;
			set .@warpy,139;
			set .@zeny,5500;
			break;
		case 2:
			set .@map$,"spl_fild02";
			set .@warpx,32;
			set .@warpy,225;
			set .@zeny,7500;
			break;
		case 3:
			mes "[�L�̎�E��]";
			mes "�킩��܂����B";
			mes "�܂��̗��p�����҂����Ă��܂��B";
			close;
		}
		if(Zeny < .@zeny) {
			mes "[�L�̎�E��]";
			mes "�ɂ�ɂ�A����������܂����B";
			close;
		}
		mes "[�L�̎�E��]";
		mes "�ɂ�ɂ�A";
		mes "����ł͂����肵�܂��B";
		close2;
		set Zeny,Zeny - .@zeny;
		warp .@map$,.@warpx,.@warpy;
		end;
	case 4:
		mes "[�L�̎�E��]";
		mes "�킩��܂����B";
		mes "�܂����҂����Ă���܂��B";
		close;
	}
}

//============================================================
// �}�k�N���l
//------------------------------------------------------------
man_in01,286,16,1	script	�}�k�N���l	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�}�k�N���l]";
		mes "�聽��";
		mes "�偼��@���@��";
		close;
	}
	mes "[�}�k�N���l]";
	mes "��������Ⴂ�܂��B";
	mes "���������߂ł��傤���H";
	next;
	switch(select("���i�̐�����������","�}�k�N�̍��C","�}�k�N�̈ӎv","�}�k�N�̐M�O","��߂Ă���")) {
	case 1:
		mes "[�}�k�N���l]";
		mes "�͂��A";
		mes "�����珤�i�̐������ł��B";
		close2;
		openbook 11019;
		end;
	case 2:
		set .@gain,12342;
		break;
	case 3:
		set .@gain,12343;
		break;
	case 4:
		set .@gain,12348;
		break;
	case 5:
		mes "[�}�k�N���l]";
		mes "�����ł����A";
		mes "�܂����z�����������B";
		close;
	}
	mes "[�}�k�N���l]";
	mes "^3131FF�}�k�N�R�C��1��^000000�ɂ�";
	mes getitemname(.@gain)+ "��";
	mes "^3131FF3��^000000���w���ł��܂��B";
	next;
	if(select("����","����Ȃ�") == 2) {
		mes "[�}�k�N���l]";
		mes "�����ł����A";
		mes "�܂����z�����������B";
		close;
	}
	if(countitem(6080) < 1) {
		mes "[�}�k�N���l]";
		mes "�\���󂠂�܂���";
		mes "�R�C��������܂����B";
		close;
	}
	if(checkitemblank() == 0) {
		mes "[���l]";
		mes "����H";
		mes "�ו������������ł���B";
		mes "����ł͏��i��n�����Ƃ͏o���܂���B";
		mes "�ו��̎�ނ����炵�Ă���";
		mes "�܂��b�������Ă��������ˁB";
		close;
	}
	if(checkweight(.@gain,3) == 0) {
		mes "[���l]";
		mes "����H";
		mes "�ו������������ł���B";
		mes "����ł͏��i��n�����Ƃ͏o���܂���B";
		mes "�ו��̏d�ʂ����炵�Ă���";
		mes "�܂��b�������Ă��������ˁB";
		close;
	}
	mes "[�}�k�N���l]";
	mes "�����p�A���肪�Ƃ��������܂����B";
	delitem 6080,1;
	getitem .@gain,3;
	close;
}

//============================================================
// �}�k�N�Z�l
//------------------------------------------------------------
manuk,215,132,4	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "�ځ灹 �� ������ �� �ȇ���";
		mes "������ �� ����� �� �́�";
		mes "��ʁ� �� ������ �� ";
		mes "����� �� �΁灺 �� ����";
		close;
	}
	mes "[�N]";
	mes "���O�́c�c�������ȁB";
	mes "�������d���Ƃ͈قȂ��̂悤���ȁB";
	mes "�d���ł͂Ȃ��Ƃ������Ƃ�";
	mes "��X�̓G�ł͂Ȃ��Ƃ������Ƃ��B";
	close;
}

manuk,188,216,3	script	�w��	449,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�w��]";
		mes "�ځ��� �� �́��� �� ��";
		mes "�ʁ͇� �� ������ �� ";
		mes "������ �� ��?�� �� ��";
		next;
		mes "[�w��]";
		mes "��?�� �� ������ �� ";
		mes "�偹�� �� �恼��";
		mes "��?�� �� ��?�� ? ";
		close;
	}
	mes "[�w��]";
	mes "���O�͂ǂ����Ă����ɗ����H";
	mes "���O�͗d���Ƃ͈قȂ��Ȃ̂��H";
	mes "���̏ꏊ�͂��O������������";
	mes "�ǂ��ꏊ�ł͂Ȃ��B";
	next;
	mes "[�w��]";
	mes "���̏ꏊ�͐_���Ȃ�䓙�̑�n�A";
	mes "^0000ff���g�D���փC��^000000�B";
	mes "�y���D��S�ŗ�������Ă͍���B";
	close;
}

manuk,169,260,3	script	�N	455,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "��ʁ� �� ��ʁ� �� ";
		mes "���ȁ� �� ������";
		mes "�΁灿 �� ������ �� ";
		mes "��́� �� �́ځ� �� ��";
		mes "��偾 �� ";
		close;
	}
	mes "[�N]";
	mes "��X�T�t�@���͈�S���́B";
	mes "���������Ȃ鎞�ł����";
	mes "�S��1�Ȃ̂��B";
	mes "�����A������������ĕǂ�";
	mes "���߂Ă��鎞���ȁc�c";
	close;
}

manuk,218,163,3	script	���l�̐�m	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���l�̐�m]";
		mes "��聸 �� �䁸�� �� ��";
		mes "������ �� �́��� �� ";
		mes "��΁� �� ������ �� ";
		next;
		mes "[���l�̐�m]";
		mes "���恼 �� ������ �� ";
		mes "���� �� �́�� �� ��";
		mes "���΁� ? �ځ�� �� �聸";
		mes "��΁� �� ���� �� ";
		close;
	}
	mes "[���l�̐�m]";
	mes "�ŋ߁A�䓙�̎�����щ��";
	mes "�����ȗd���ǂ����p�ɂɌ����B";
	next;
	mes "[���l�̐�m]";
	mes "�܂��A�z��̏o���鎖�Ƃ����΁A";
	mes "��������`�}�`�}�Ɩ��@��";
	mes "�U�����邱�Ƃ��炢���B";
	mes "�ʓ|�ł͂��邪�|�������Ƃ��Ȃ��B";
	mes "�����{�C���o���΁A";
	mes "��u�ŏR�U�炷���Ƃ��ł��邵�ȁB";
	close;
}

manuk,266,199,5	script	���l�̐�m	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���l�̐�m]";
		mes "���́� �� ��͇� �� ?";
		mes "�ȁ灾 �� ��́� �� ";
		mes "���䁻 �� ������ �� ��";
		mes "�臓��";
		close;
	}
	mes "[���l�̐�m]";
	mes "���ꂾ���̃u���f�B�E����";
	mes "���~������΁A����S�ł͂��邪";
	mes "�܂���������Ƃ������B";
	mes "�����ƏW�߂Ȃ��ƂȁB";
	close;
}

manuk,225,129,5	script	�w��	449,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�w��]";
		mes "�䁼�� �� ��ځ� ? ��?��";
		mes "���恺 �� ���́� ? ���";
		mes "�ȁ��� �� ���恹 �� ��?��";
		mes "������ �� ���";
		close;
	}
	mes "[�w��]";
	mes "�����ƁI";
	mes "�d�����Ǝv������Ⴄ�̂��I";
	mes "����������ԈႢ�����ɂȂ�����B";
	next;
	mes "[�w��]";
	mes "�c";
	mes "�c�c�ŁA���O�͉��҂��H";
	mes "�����̂��H";
	mes "��X�̌��t�͂킩��̂��H";
	mes "�݂�΂݂�قǒ������z���ȁc�c�B";
	close;
}

manuk,286,147,3	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "���� �� ����� �� ��";
		mes "���ځ� �� �凓�� �� ����";
		mes "������ �� ������ �� ���";
		mes "�́��� �� �偹��";
		next;
		mes "[�N]";
		mes "������ �� �ʇ��� �� �偹";
		mes "���ʁ� �� �ʁ�� �� ";
		mes "�ځ� �� ";
		close;
	}
	mes "[�N]";
	mes "���̓y�n���J�񂵂�";
	mes "��X�̑c��B�̋�J��";
	mes "���͖Y��Ȃ��B";
	mes "�ނ�̋�J�𖳑ʂɂ��Ȃ��ׂɂ�";
	mes "��X���撣��˂΂ȁB";
	next;
	mes "[�N]";
	mes "�܂��́A���̃��t�B�l�����Ƃ�����";
	mes "�d���ǂ���ǂ������p��";
	mes "�l���Ȃ���΂����Ȃ��ȁB";
	close;
}

manuk,183,185,5	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "������ �� �灹�� �� ";
		mes "���� �� �΁́� ��";
		mes "���ȁ� �� ����� �� ";
		mes "�́臓 �� ��";
		next;
		mes "[�N]";
		mes "������ �� ��恾 �� ";
		mes "�΁��� �� ������ �� ";
		mes "��聼 �� ��";
		close;
	}
	mes "[�N]";
	mes "�w�F�͈�l�ׂ̈ɁA";
	mes "��l�͊F�ׂ̈Ɂx";
	mes "���̌��t�́A�䂪�ꑰ�̐M�����B";
	next;
	mes "[�N]";
	mes "�������̋����ɏ]���A";
	mes "�F�Ƌ��Ɉ�ۂƂȂ��ē����I";
	mes "�S�Ă̓T�t�@���̂��߂ɁI";
	close;
}

manuk,256,143,3	script	���l�̐�m	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���l�̐�m]";
		mes "���� �� �ȁ΁� �� ��";
		mes "�͇��� �� �䁼�� �� ��";
		mes "��� �� �� �� �� �́�";
		close;
	}
	mes "[���l�̐�m]";
	mes "�G�ɏ������A��X�T�t�@����";
	mes "��葱���邱�Ƃ��ł���̂ł���΁A";
	mes "�䂪�g���ӂ��悤�Ƃ��ɂ����Ȃ��B";
	close;
}

manuk,245,124,3	script	�N	455,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "�́��� �� ���΁� �� ��";
		mes "���ȁ� ���ȁ�";
		mes "���? �� ��� �� ";
		mes "�΁��� �� �΁��";
		mes "����� �� �䁼�� �� ";
		close;
	}
	mes "[�N]";
	mes "���O�B�̖ڂɂ́A";
	mes "��X�̐킢���ǂ̂悤�ɉf��̂��A";
	mes "�킩��Ȃ����A��X�͖�������";
	mes "�킢�����Ă���̂��B";
	mes "���ꂾ���͊o���Ă����ė~�����B";
	close;
}

manuk,103,354,5	script	��m	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��m]";
		mes "�́����@�ʁ@�ȁ��@��";
		mes "��́�@���@���ځ��@���@?";
		close;
	}
	mes "[��m]";
	mes "�����́A";
	mes "�x���Q���~���̎q���ł���";
	mes "�T�t�@���̊X�}�k�N�ł��B";
	close;
}

manuk,122,354,3	script	��m	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��m]";
		mes "�́����@�ʁ@�ȁ�� ��";
		mes "��́�@���@���ځ��@���@?";
		close;
	}
	mes "[��m]";
	mes "�����́A";
	mes "�x���Q���~���̎q���ł���";
	mes "�T�t�@���̊X�}�k�N�ł��B";
	close;
}

manuk,99,334,5	script	�H��	460,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "������@?�@���ʁ�";
		mes "��@���聽�@����";
		mes "���ȇ��@���@���΁��@�́@����";
		mes "����?�@�΁@�䁸?�@���@�聾��";
		mes "�ȁ@��??�@�ȁ@�䇓���@�́@��?";
		mes "�ʁ����@?�@���恻";
		close;
	}
	mes "[�H��]";
	mes "���B�T�t�@���ɂ�";
	mes "���ꂼ�����������񂾂�B";
	mes "���Ȃ݂ɉ���^0000ff�s�I��^000000���Ă����������B";
	mes "�u���f�B�E���H��̍H�����Ƃ�";
	mes "�}�k�N�ł̘J����S�����Ă���񂾁B";
	next;
	mes "[�H��]";
	mes "������S�����Ă���̂�^0000ff�K���g��^000000���B";
	mes "�ނ炪���邩��";
	mes "���B�͈��S���Đ����ł���񂾁B";
	mes "�{���ɑ��h���Ă��邺�B";
	next;
	mes "[�H��]";
	mes "�ق��ɂ��F�X�Ȗ���������񂾂��B";
	close;
}

manuk,103,311,3	script	�H��	455,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "�ȁ́��@���@";
		mes "�ȁ�ځ@���@�������@���@��";
		close;
	}
	mes "[�H��]";
	mes "���A�����c�c";
	mes "�����u���f�B�E���𒍎˂��鎞�Ԃ��c�c";
	close;
}

manuk,293,203,3	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "���΁� �� ��";
		mes "�䁻�ځ@?�@�ʁ́��@��";
		mes "�ځ����@��@���ȁ@��";
		mes "�����ʁ@�ʁ@���聻�@���@�恸";
		close;
	}
	mes "[�H��]";
	mes "�������A�C������!!";
	mes "����̓T�t�@���̖��Ƃ�������";
	mes "�u���f�B�E���Ȃ񂾁I";
	mes "��舵���v���ӁI";
	close;
}

manuk,253,173,3	script	�w��	449,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�w��]";
		mes "���ȁځ@���@�䇔";
		mes "����ȁ@��@������@��";
		mes "��?���@���@�������@���@�燔";
		mes "�恽���@�́@�ځځ� �΁@����";
		close;
	}
	mes "[�w��]";
	mes "���̓����������܂����H";
	mes "���̂����́A�䂪�T�t�@���̐�c";
	mes "�x���Q���~���l�ł��B";
	mes "�Е����X�Ƃ��Ă���";
	mes "�f���炵���Ǝv���܂��񂩁H";
	close;
}

man_in01,346,135,0	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "���灬�@��@����΁@���@�����";
		mes "������@���@�́����@���@";
		mes "�́��ȁ@�΁@��́�@���@";
		close;
	}
	mes "[�H��]";
	mes "�����ƃo���u��";
	mes "�`�F�b�N�����Ȃ��ƂˁB";
	mes "���̑O�A��������J���������ɂ���";
	mes "�厖�̂ɂȂ肻���ɂȂ����񂾁`�B";
	close;
}

man_in01,393,134,3	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "�������@���@������";
		mes "�ȁ����@��";
		close;
	}
	mes "[�H��]";
	mes "�����͉�X�ɂƂ��āA";
	mes "�d�v�Ȏ{�݂Ȃ̂��B";
	mes "�䂦�ɁA�O��I�Ȋ�@�Ǘ���";
	mes "�K�v�Ȃ̂��B";
	next;
	mes "[�H��]";
	mes "�p���������b�����A";
	mes "���̑O�A�H���̈�l�̃~�X��";
	mes "�厖�̂ɂȂ肻���ɂȂ����̂��B";
	mes "�Ĕ��h�~��O�ꂵ�Ȃ��ĂȁB";
	close;
}

man_in01,377,143,5	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "���䁹�@���@������";
		mes "���@�ځ����@���@���@�� ";
		close;
	}
	mes "[�H��]";
	mes "����Ɉُ�Ȃ��c�c�ƁB";
	close;
}

man_in01,333,128,5	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "�������@���@������";
		mes "�ځ@������";
		close;
	}
	mes "[�H��]";
	mes "�˂��˂��I";
	mes "�N�̐��E�ɂ͋����";
	mes "�l�^���킪������Ė{��!?";
	next;
	mes "[�H��]";
	mes "����ׂ�����̎��A";
	mes "�_�a���^����ɕ�����A";
	mes "���̒����猻�����ĕ�������I";
	next;
	mes "[�H��]";
	mes "������r�ꋶ������f���A";
	mes "�p����͗��𔭂��A";
	mes "������͐����̐n��������A";
	mes "������͔M�������o��炵���ˁI";
	next;
	mes "[�H��]";
	mes "���̑O�A�A���i�x���c����";
	mes "�����痈���l�������Ă����񂾁B";
	mes "�����Ȃ��A�������Ȃ��B";
	close;
}

man_in01,336,128,5	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "������ �� ����";
		close;
	}
	mes "[�H��]";
	mes "���̑O�A�~�b�h�K���h���痈���Ƃ���";
	mes "�����ҒB�����������w���čs�������B";
	mes "���̌����ҒB�Ƀ~�b�h�K���h�̘b��";
	mes "�F�X�ƕ����Ėʔ����������B";
	close;
}

man_in01,283,288,3	script	�H��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H��]";
		mes "�烮���@�� �����";
		mes "�ȁ@�䁺���@�ځ@�䃰�@��";
		next;
		mes "[�H��]";
		mes "�偬���@�ځ@������";
		mes "���@�ځځ��@���@��";
		close;
	}
	mes "[�H��]";
	mes "����A�Ȃ��Ȃ����̂悢";
	mes "�u���f�B�E�����B";
	next;
	mes "[�H��]";
	mes "�u���f�B�E����";
	mes "�������̖�������ˁB";
	close;
}