//-----------------------------------------------
//==== �`���[�W�A�^�b�N - KN_CHARGEATK
//	�� SKILL_CHARGEATK   -> 0�`8
//-----------------------------------------------
prt_in,85,99,2	script	�R�m�c��	734,{
	if(getskilllv(1001)) {
		mes "[�G�\�y]";
		mes "����t��肽�܂��B";
		mes "���̒��͊Â����̂ł͂Ȃ��B";
		mes "�Ȃ��g���̂ğӐg�̗͂�s�������Ƃ�";
		mes "�����Ĉ���������Ȃ��B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_KN) {
		mes "[�G�\�y]";
		mes "���͌ւ荂���v�����e����7�R�m�c��";
		mes "�G�\�y�E���[�����B";
		mes "�����ĂԂȂ�G�\�y�����ł����B";
		next;
		mes "[�G�\�y]";
		mes "�N�����̋R�m�c���w��]�ނȂ�";
		mes "�R�m�B�ɕ����Ȃ��قǂ̕i�i��";
		mes "�h�ӂ������ĕ������悤�ɁB";
		close;
	}
	switch(SKILL_CHARGEATK) {
	case 0:
		mes "[�G�\�y]";
		mes "�c�c���߂Č���炾�ȁB";
		mes "�ǂ��̋R�m�c�̏������H";
		mes "���͑�7�R�m�c�̋R�m�A";
		mes "�G�\�y�E���[�����B";
		next;
		mes "[�G�\�y]";
		mes "�������B�R�m�c�����ł͂Ȃ��悤���ȁB";
		mes "���Q�̋R�m���B������������낤�B";
		mes "���Ȃ��Ƃ������̘g��";
		mes "�����ĉ����ł��Ȃ��Ƃ��A";
		mes "���Ȃ����͂����ƃ}�V���ȁB";
		next;
		mes "[�G�\�y]";
		mes "�N�����̋R�m�c���ǂ��v����";
		mes "���邩�͕�����Ȃ��B";
		mes "�������ۂ̏��͌N���v���Ă������";
		mes "�����Ɛ[���ȏ�Ԃ��B";
		next;
		mes "[�G�\�y]";
		mes "���ꂪ�ǂ����������m�肽�����";
		mes "�P�����Ă��鏊�����w���Ă݂�΂����B";
		mes "���x���̋R�m�B�͍��P�����Ԃ�����";
		mes "���̕~�n�ŌP�������Ă���͂����B";
		mes "�K���߂��ɍs���Ă��̖ڂł��������";
		mes "�m�F���Ă݂Ȃ����B";
		next;
		mes "[�G�\�y]";
		mes "�����̍��ɔ���ꎩ�����g����";
		mes "������Ȃ��Ȃ��Ă��܂��Ƃ�������";
		mes "�ǂ��������Ȃ̂��c�c���R�ł���N�ɂ�";
		mes "����Ȏ��͕�����Ȃ����낤���ȁB";
		set SKILL_CHARGEATK,1;
		close;
	case 1:
		mes "[�G�\�y]";
		mes "���w���H�@������������낤�B";
		mes "�P�����w�������Ȃ�";
		mes "�O�̕~�n�ɏo�Ă݂�Ƃ����B";
		mes "�����[�R�m�c�����Ⴄ�R�m�c���B��";
		mes "�P�������Ă���͂����B";
		close;
	default:
		mes "[�G�\�y]";
		mes "���͌ւ荂���v�����e����7�R�m�c��";
		mes "�G�\�y�E���[�����B";
		mes "�����ĂԂȂ�G�\�y�����ł����B";
		next;
		mes "[�G�\�y]";
		mes "�N�����̋R�m�c���w��]�ނȂ�";
		mes "�R�m�B�ɕ����Ȃ��قǂ̕i�i��";
		mes "�h�ӂ������ĕ������悤�ɁB";
		close;
	case 6:
		mes "[�G�\�y]";
		mes "���̖ڂ́c�c�������B";
		mes "���B�R�m�c�̎��̂����ė����悤���ȁB";
		mes "���������A�����l��������";
		mes "�����ČN�ɂ͖��Ȃ��B";
		next;
		mes "[�G�\�y]";
		mes "���ׂ̈̋R�m���A";
		mes "���ׂ̈̌P���Ȃ̂��A";
		mes "���ɂ͂���ȏ�킩��Ȃ��B";
		next;
		mes "[�G�\�y]";
		mes "�����N�ʂ̎��ɂ́c�c�����A";
		mes "����̊댯�̒��ɂ悭������";
		mes "�g���N�������̂������B";
		next;
		mes "[�G�\�y]";
		mes "�c�c������Ȃ��ߋ��̘b���B";
		mes "�Ƃɂ����A���͓����o�Ȃ��ȁB";
		mes "������R�m�c�Ƃ�������";
		mes "�������ꂽ�҂̉^���Ȃ̂��c�c";
		set SKILL_CHARGEATK,7;
		close;
	case 7:
		if(countitem(530) < 5 || countitem(748) < 3) {
			mes "[�G�\�y]";
			mes "�����N�ʂ̎��ɂ́c�c�����A";
			mes "����̊댯�̒��ɂ悭������";
			mes "�g���N�������̂������B";
			next;
			mes "[�G�\�y]";
			mes "�c�c������Ȃ��ߋ��̘b���B";
			mes "�Ƃɂ����A���͓����o�Ȃ��ȁB";
			mes "������R�m�c�Ƃ�������";
			mes "�������ꂽ�҂̉^���Ȃ̂��c�c";
			close;
		}
		mes "[�G�\�y]";
		mes "�c�c�N�������ė�������";
		mes "�X�e�B�b�N�L�����f�B��";
		mes "������Ȃ��o��������Ȃ����낤���H";
		next;
		if(select("������","�����Ȃ�")==2) {
			mes "[�G�\�y]";
			mes "�������B�d�����Ȃ��ȁB";
			mes "�l�����ς������܂��b�������Ă���B";
			close;
		}
		mes "[�G�\�y]";
		mes "�c�c�v���o���ȁB";
		mes "�������ꂸ�ɉ߂������b�B�̓��X�B";
		mes "�Ⴆ�g�͂ڂ�ڂ�ɂȂ낤�Ƃ�";
		mes "�����Ȃ鎖���S�����������";
		mes "�v���Ă������̎��B";
		next;
		mes "[�G�\�y]";
		mes "�������ȁc�c�B";
		mes "���S�ɖ߂�Ȃ��Ƃ����Ȃ��ȁB";
		mes "�R�m�c�Ƃ��������ɔ����";
		mes "�������Ȃ������̂͂ނ���";
		mes "���̕��������悤���ȁB";
		next;
		mes "[�G�\�y]";
		mes "������x���S�ɋA���Ď��������ł�";
		mes "�K���ɂ���Ă݂悤�Ǝv���B";
		mes "�Ⴆ������S�Ă���������";
		mes "�s�����鎖���̂ɈӖ�������͂����B";
		next;
		mes "[�G�\�y]";
		mes "���l�����̓w�͂𗠐؂낤�Ƃ��B";
		mes "���͐₦���w�͂�����";
		mes "�����Ē��߂Ȃ����낤�B";
		next;
		mes "[�G�\�y]";
		mes "�N�̂������łǂ���玄�͐̂̐S��";
		mes "�v���o�����悤���B";
		mes "�{���ɂ��肪�Ƃ����Q�̋R�m��B";
		mes "����Ɏ��������̖��ɕ҂ݏo����";
		mes "�X�L���������悤�B";
		next;
		mes "[�G�\�y]";
		mes "���̃X�L���͂��̐�N��";
		mes "���ɗ��͂����B";
		mes "�������悯��Θb�������Ă���B";
		delitem 530,5;
		delitem 748,3;
		set SKILL_CHARGEATK,8;
		close;
	case 8:
		mes "[�G�\�y]";
		mes "�N�ɋ�����X�L����";
		mes "^FF0000�X�L���c���[�Ƃ͊֌W�Ȃ��B";
		mes "�N�G�X�g�X�L���Ƃ���SP����������";
		mes "���ł��g�p�\��";
		mes "�A�N�e�B�u�X�L�����B^000000";
		next;
		mes "[�G�\�y]";
		mes "^FF0000���̃X�L����SP��40����ēG1�̂�";
		mes "�Ώۂɂ����U���X�L�����B";
		mes "����Ƃ̋����������قǈЗ͂���������";
		mes "��������������ł���قǃ_���[�W��";
		mes "�^����܂ł̎��Ԃ������Ȃ�B^000000";
		next;
		mes "[�G�\�y]";
		mes "���̎��Ԃ͎g�p�҂��s���s�\��";
		mes "��ԂɂȂ�c�c�З͂������ق�";
		mes "�s���s�\���Ԃ�������̂ŕp�ɂ�";
		mes "�g�p�ł���X�L���ł͂Ȃ��B";
		next;
		mes "[�G�\�y]";
		mes "��͎g���Ȃ��炻�̎g������";
		mes "�g�ɒ�����悤�ɁB";
		mes "���̃X�L���̖��O��";
		mes "^FF0000�`���[�W�A�^�b�N^000000���B";
		mes "���܂�i�D�ǂ����O�ł͂Ȃ����A";
		mes "�U���̃C���[�W�����ׂΗǂ����낤�B";
		set SKILL_CHARGEATK,0;
		skill 1001,1,0;
		next;
		mes "[�G�\�y]";
		mes "�ł͊撣���Ă݂Ȃ����B";
		mes "�������߂��R�m�c�̖��_�����߂�̂�";
		mes "�S�͂�s�������B";
		close;
	}
}

prontera,69,350,0	script	�@	139,5,5,{
	if(getskilllv(1001))
		end;
	switch(SKILL_CHARGEATK) {
	case 0:
		mes "-��ςȌP�������Ă���R�m�c����������-";
		mes "-�傫�ȋC���̊|�����̂�����-";
		mes "-�X�̐l�B�ɖ��f�������鎞�����邪-";
		mes "-����t�撣��p�͂ƂĂ��i�D�ǂ�������-";
		close;
	case 1:
	case 2:
		mes "[�H]";
		mes "���@�b�I";
		next;
		mes "[�H]";
		mes "�^�@�b�I";
		next;
		mes "-�P������ҒB�̊|��������������-";
		mes "-����炪�������G�\�y�������Ă���-";
		mes "-���̋R�m�c���B�̂悤��-";
		next;
		mes "-�ƂĂ��M�S�ɌP�����Ă���-";
		mes "-�P�Ɍ��邾���ł��i�D�ǂ�-";
		if(SKILL_CHARGEATK == 1)
			set SKILL_CHARGEATK,2;
		close;
	default:
		end;
	}
}

prontera,72,352,7	script	�R�m�c��	733,{
	if(SKILL_CHARGEATK == 2 || SKILL_CHARGEATK == 3) {
		mes "[�R�m�c��]";
		mes "�����Ɠ����P���ł����X�̐ςݏd�˂�";
		mes "�厖�Ȃ̂����炵��������悤�ɁI";
		mes "���O�B�͂܂��Ⴂ�I�@�܂������Ȏ���";
		mes "�ł���Ƃ��������̂ɖ�����I";
		next;
		mes "[�R�m�c��]";
		mes "�W�����Ă��I�@�P���I�����Ԃ܂�";
		mes "�܂����Ԃ͏\���Ɏc���Ă��邼�I";
		mes "�P�����Ɏ��񂾂��ĒN��";
		mes "�C�ɂȂ�Ă��Ȃ��񂾂���ȁI";
		mes "�e���ْ��������悤�ɁI";
		if(SKILL_CHARGEATK == 2)
			set SKILL_CHARGEATK,3;
		close;
	}
	mes "[�R�m�c��]";
	mes "����t���I�@���B�̌��ɂ���";
	mes "�v�����e���̖������������Ă���I";
	mes "���B�̎g���͗L���̍ۂ�";
	mes "�s���B�̕��a�����̂��I";
	close;
}

prontera,78,354,3	script	�R�m�c��	734,{
	if(SKILL_CHARGEATK == 3 || SKILL_CHARGEATK == 4) {
		mes "[�R�m�c��]";
		mes "�R�m�͍��Ə���������";
		mes "�������ƂĂ������̂��B";
		mes "���ɉ������Ȃ��Ŗ����̌P������";
		mes "���܂�����Ă�΂������]������";
		mes "�����Ă���񂾂���ō����ˁB";
		next;
		mes "[�R�m�c��]";
		mes "���΂炭�����œ����ēK���ɉ҂���";
		mes "���̌�ɂł������ʂ̊y�Ȏd���ł�";
		mes "���ĘV���V��ŕ�炵�����ˁB";
		next;
		mes "[�R�m�c��]";
		mes "�����炵���������Ă���悤��";
		mes "�����Ȃ�����ȁB";
		if(SKILL_CHARGEATK == 3)
			set SKILL_CHARGEATK,4;
		close;
	}
	mes "[�R�m�c��]";
	mes "�G�C�b�I�@�C���b�I�@���A�b�I";
	mes "�ӂ��c�c�����Ȃ����C������ˁB";
	mes "�v�����e���R�m�c���΁B";
	close;
}

prontera,73,357,5	script	�R�m�c��	734,{
	if(SKILL_CHARGEATK == 4 || SKILL_CHARGEATK == 5) {
		mes "[�R�m�c��]";
		mes "���x���������������Ȃ�";
		mes "��΂̃A�N�Z�T���ł������Ă����悤�B";
		mes "�����Ɗ�Ԃ��낤�ȁI";
		next;
		mes "[�R�m�c��]";
		mes "�������܂Ō㉽�����邩�ȁH";
		mes "������ƌ��Ă݂邩�c�c";
		mes "�����ォ�v�Z����̂�����Ȃ��";
		mes "�y�������񂾂ȁB";
		if(SKILL_CHARGEATK == 4)
			set SKILL_CHARGEATK,5;
		close;
	}
	mes "[�R�m�c��]";
	mes "�������[�����Ă�ˁc�c����ς�";
	mes "�R�m�c�ɓ������̂͐�����������B";
	mes "�n�n�n�B";
	close;
}

prontera,78,357,3	script	�R�m�c��	734,{
	if(SKILL_CHARGEATK == 5 || SKILL_CHARGEATK == 6) {
		mes "[�R�m�c��]";
		mes "�����̋R�m�c�ɂ͐悪�Ȃ��ȁB";
		mes "���͂���Ƃ����ĕʂɂ���������";
		mes "�Ȃ����炱���ɂ���񂾂��ǁc�c";
		next;
		mes "[�R�m�c��]";
		mes "�ꉞ�P�������͂��邩�B";
		mes "�܂�Ȃ��������Ȃ��B";
		if(SKILL_CHARGEATK == 5)
			set SKILL_CHARGEATK,6;
		close;
	}
	mes "[�R�m�c��]";
	mes "�c�c�P�����ɂ͂���ׂ�Ȃ��I";
	close;
}

prontera,66,358,5	script	�R�m�c��	733,{
	if(SKILL_CHARGEATK == 7) {
		mes "[�R�m�c��]";
		mes "���������΃G�\�y����͉���";
		mes "�P���ɎQ�����ĂȂ��񂾂낤�H";
		mes "�̂�^FF0000�I�{���k^000000��^FF0000�~�X�g�P�[�X^000000��";
		mes "��R�������P�����Ȃ��Ă������̂��H";
		next;
		mes "[�R�m�c��]";
		mes "�������̐l����������ƐV�ċR�m��";
		mes "���ɂ��̃����X�^�[2�̂�|����";
		mes "�b�΂����肷�邩��ȁ[�B";
		mes "�������񂴂肵���Ⴄ��B";
		next;
		mes "[�R�m�c��]";
		mes "�V�ċR�m�ł�^FF0000�X�e�B�b�N�L�����f�B5��^000000";
		mes "��^FF0000������Ȃ��o��3��^000000�ʂ�";
		mes "���ł��l���Ă���ʂ̔\�͂�";
		mes "�Ȃ��Ƃ��߂��Ȃ�ĂˁB";
		mes "�������x����������ĕ����O������B";
		next;
		mes "[�R�m�c��]";
		mes "���͋R�m�c�̌����ɘU����";
		mes "�V�����X�L���Ƃ���������";
		mes "�������炵�����ǁB";
		close;
	}
	mes "[�R�m�c��]";
	mes "�R�m�c�P���͂ƂĂ���ς���B";
	mes "�ӂ��c�c�͂��͂��B";
	mes "�̗͂�����ȂɂȂ��R�m�ɂ�";
	mes "�z�����Ă���Ȃ��ƍ����˂��B";
	mes "�̗͂��Ȃ��̂�������ł��Ȃ����c�c�B";
	close;
}


//-----------------------------------------------
//==== �V�������N - CR_SHRINK
//	�� SKILL_SHRINK   -> 0�`8
//-----------------------------------------------
geffen,110,117,3	script	�t�H�[�h	752,{
	if(getskilllv(1002)) {
		mes "[�t�H�[�h]";
		mes "�X���b�e�B�ɖ��n�����悤���ˁB";
		mes "����J�l�I";
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		mes "[�t�H�[�h]";
		mes "���O�݂����ȓz��";
		mes "�䂪�R�m�c�ɋ���Ɨǂ����A";
		mes "�{���Ɏc�O���ȁB";
		next;
		mes "[�t�H�[�h]";
		mes "�����A�䂪�R�m�c��";
		mes "���肽����΁A���ł����Ă���B";
		mes "���O�Ȃ炢�ł����}���邼�B";
		mes "���ꂶ��A�܂��ȁB";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_CR) {
		mes "[�t�H�[�h]";
		mes "���͍��d�v�ȍl������";
		mes "���Ă��ĖZ��������";
		mes "�ז������Ȃ��ł���B";
		close;
	}
	switch(SKILL_SHRINK) {
	case 0:
		mes "[�t�H�[�h]";
		mes "�ӂށ`�@�ǂ������񂾂낤�B";
		mes "��������Ȏ��ԂȂ̂ɁA";
		mes "�܂����Ȃ��Ȃ�āc�c�B";
		mes "�u^FF0000����?!^000000�v";
		next;
		mes "[�t�H�[�h]";
		mes "�����`�@������!!";
		mes "���āA���������瑗��ꂽ";
		mes "�u^FF0000�莆^000000�v��";
		mes "�����Ă����̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ցH�@�ǂ��������ł��傤�c�c�H";
		mes "��������Ƃ͏��Ζʂł����c�c�B";
		next;
		mes "[�t�H�[�h]";
		mes "���A����H";
		mes "�Q�t�F���̓�n���";
		mes "����C���ɂ��Ă���R�m����Ȃ����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������܂��c�c�B";
		next;
		mes "[�t�H�[�h]";
		mes "�ӂށc�c�����Ă��ȁH";
		mes "��������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ⴂ�܂����Ă΁B";
		next;
		mes "[�t�H�[�h]";
		mes "�{���ɁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B";
		mes "�������܂����āB";
		mes "�c�c�B";
		next;
		mes "[�t�H�[�h]";
		mes "�c�c�B";
		next;
		mes "[�t�H�[�h]";
		mes "�����A����I";
		mes (Upper == UPPER_HIGH? "�p���f�B��": "�N���Z�C�_�[")+ "�̎p�����Ă����̂�";
		mes "�������҂��Ă���";
		mes "�l���Ǝv�����񂶂������B";
		next;
		mes "[�t�H�[�h]";
		mes "�ӂށ`�@�����A�܂������ȁB";
		mes "�{���ɍ���c�c�B";
		mes "���Ԃ��Ȃ��̂ɂ��c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������ł��c�c�H";
		next;
		mes "[�t�H�[�h]";
		mes "���̓v�����e���R�m�c��";
		mes "��������������󂯂Ă���";
		mes "�u^FF0000�t�H�[�h�E���X���[^000000�v���B";
		next;
		mes "[�t�H�[�h]";
		mes "���͎��ӂ̌x�����Ń����X�^�[��";
		mes "�\��邱�Ƃ�h���A";
		mes "���l��X�̐l�X��ی삷��";
		mes "�d�������Ă���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ł����B";
		next;
		mes "[�t�H�[�h]";
		mes "�Ƃ��낪�A�ŋߋ߂��̐X��";
		mes "�u^FF0000�S�u����^000000�v������";
		mes "�������񌻂��āA�l���P���Ă���̂�";
		mes "���Ȃ蓪��Y�܂��Ă���񂾁B";
		next;
		mes "[�t�H�[�h]";
		mes "����ŉ�X�R�m�c��";
		mes "���Ӓn������@���A�����";
		mes "2��󋵂�񍐂��Ă�����Ă���B";
		next;
		mes "[�t�H�[�h]";
		mes "�Ƃ��낪�A�����Ɍ�����";
		mes "�񍐂��x��Ă���B";
		mes "������肪�N�������ɈႢ�Ȃ��c�c�B";
		next;
		mes "[�t�H�[�h]";
		mes "�������A���͍���������";
		mes "���������ł��Ȃ�����";
		mes "�m�F���ɍs�������ł��Ȃ����A";
		mes "�{���ɍ����Ă���񂾁B";
		mes "�����񍐂��͂����Ԃ���";
		mes "�啪�o���Ă���B";
		next;
		mes "[�t�H�[�h]";
		mes "���������΁A���O��";
		mes (Upper == UPPER_HIGH? "�p���f�B��": "�N���Z�C�_�[")+ "�̂悤�����A";
		mes "�ǂ���Ύ��̗��݂������";
		mes "�����Ă���Ȃ����ȁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���݂��ĉ��ł����H";
		next;
		mes "[�t�H�[�h]";
		mes "��قǌ������ʂ�A���͍�������";
		mes "�l��҂��Ă�񂾁B";
		next;
		mes "[�t�H�[�h]";
		mes "�Q�t�F���̊O���ɂ���x������";
		mes "�h�q�C�������Ă���";
		mes "�X���b�e�B�Ƃ������������";
		mes "�������̏󋵕񍐏���";
		mes "�����͂��͂��Ȃ̂����ǁA";
		next;
		mes "[�t�H�[�h]";
		mes "�����Ɍ����Ă��܂�ɂ��x���񂾁B";
		mes "����ŁA���܂񂪌������ɍs����";
		mes "�󋵂����ė��Ă���Ȃ����H";
		next;
		mes "[�t�H�[�h]";
		mes "���͍��Ȃ��O������";
		mes "�ł��Ȃ�����c�c";
		mes "���ށI";
		next;
		if(select("����","�f��")==2) {
			mes "[�t�H�[�h]";
			mes "�ӂށc�c�������c�c�B";
			mes "�܂��A���悤���Ȃ��B";
			mes "���A����A����Ȏ���";
			mes "�֌W�҂ł͂Ȃ��҂ɔC����";
			mes "�����̂��Ԉ���Ă����ȁB";
			mes "���������B����A�C�����ĂȁB";
			close;
		}
		mes "[�t�H�[�h]";
		mes "�����I";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "��͂肨�O��" +(Upper == UPPER_HIGH? "�p���f�B��": "�N���Z�C�_�[")+ "��";
		mes "�����������Ă���̂��ȁB";
		next;
		mes "[�t�H�[�h]";
		mes "����A���Ԃ��Ȃ�����";
		mes "�Q�t�F���̓�Ɉʒu����x������";
		mes "�s���āu^FF0000�X���b�e�B^000000�v�Ƃ���";
		mes "�҂�T���Ă���B";
		next;
		mes "[�t�H�[�h]";
		mes "�ނɉ������A�񍐏�������";
		mes "���֎����ė���Ηǂ��B";
		mes "���ꂶ��A�X�������ށI";
		set SKILL_SHRINK,1;
		close;
	case 1:
		mes "[�t�H�[�h]";
		mes "�Q�t�F���̓�Ɉʒu����x������";
		mes "�s���āu^FF0000�X���b�e�B^000000�v�Ƃ���";
		mes "�҂�T���Ă���B";
		next;
		mes "[�t�H�[�h]";
		mes "�ނɉ������A�񍐏�������";
		mes "���֎����ė���Ηǂ��B";
		mes "�X�������ށI";
		close;
	case 2:
		mes "[�t�H�[�h]";
		mes "���H�@�X���b�e�B�ɉ����";
		mes "��������ĂȂ��̂��H";
		mes "�����߂��ĕ񍐏������ė���悤�ɁI";
		close;
	case 3:
		mes "[�t�H�[�h]";
		mes "�����`�@���Ă��ꂽ�ȁB";
		mes "�����A�������̏󋵂́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̎莆���c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�X���b�e�B��������";
		mes "�����t�����莆��";
		mes "�t�H�[�h�Ɏ�n����-";
		next;
		mes "[�t�H�[�h]";
		mes "��c�c�H";
		next;
		mes "[�t�H�[�h]";
		mes "-�S�V�S�V-";
		next;
		mes "[�t�H�[�h]";
		mes "�����c�c���̕����̌���";
		mes "��ɂ��ȁc�c";
		next;
		mes "[�t�H�[�h]";
		mes "���ށc�c�ǂ��Ȃ񂾁B";
		mes "-�S�V�S�V-";
		next;
		mes "[�t�H�[�h]";
		mes "�n�A�b!!�@������ȏ󋵂Ȃ̂��I";
		mes "����͑�ς��I�@�����A���K�l��";
		mes "�񍐂����Ȃ���΁I";
		mes "���͂𑝋����čU�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́A������Ƒ҂��Ă��������B";
		mes "���̎莆�����ꂽ�X���b�e�B���񂪁c�c";
		next;
		mes "[�t�H�[�h]";
		mes "���A�������B";
		mes "�X���b�e�B�͂ǂ������B";
		mes "�ǂ����Ĉ�l�ŗ����̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�S�u���������ɏP������A";
		mes "��������Ȃ��Ƃ���ł��B";
		next;
		mes "[�t�H�[�h]";
		mes "���I�@��ς��I";
		mes "�������A���͂��̎莆��������";
		mes "�A���K�l�ɑ����ĕ��͂̑�����";
		mes "�v�����˂΂Ȃ��B";
		next;
		mes "[�t�H�[�h]";
		mes "���܂Ȃ����A���O�͍������X���b�e�B��";
		mes "�����ɍs���Ă���Ȃ����H";
		mes "�x���Ɩ��ɂ������I";
		next;
		mes "[�t�H�[�h]";
		mes "�������c�c";
		mes "�X���b�e�B���S�u������";
		mes "���ꂽ�̂Ȃ�A";
		mes "������x�ꂩ�������ȁc�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����Ăł���?!";
		next;
		mes "[�t�H�[�h]";
		mes "�S�u�����B�͓��ɓł�h����";
		mes "�g������A�S�u�����̓��ɂ��";
		mes "���͉�Ō��ʂ̂�����";
		mes "�g��Ȃ����";
		mes "���������Ȃ����낤�B";
		next;
		mes "[�t�H�[�h]";
		mes "�����񕜗p�̃|�[�V������";
		mes "�g���Ă�����A�������̂��Ƃɂ�";
		mes "�C���t���Ă��邾�낤�B";
		next;
		mes "[�t�H�[�h]";
		mes "���̉�ō܂���ɓ���邽�߂ɂ�";
		mes "�v�����e���ɂ���吹����";
		mes "�A�[�T�[�i�Ղ̏��֍s�������Ȃ��B";
		mes "�����A��������͌��\��������";
		mes "�߂�ɂ����Ԃ��������Ă��܂��B";
		next;
		mes "[�t�H�[�h]";
		mes "���Ԃ��Ȃ����瑁���o�����Ă���B";
		mes "���͂��̎莆�ő�����v�����āA";
		mes "�S�u�������֑���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�킩��܂����I";
		mes "-�v�����e���吹����";
		mes "�A�[�T�[�i�Ղ�";
		mes "�������Ȃ���΂Ȃ�Ȃ�-";
		set SKILL_SHRINK,4;
		close;
	case 4:
		mes "[�t�H�[�h]";
		mes "��ō܂̓v�����e���吹����";
		mes "�A�[�T�[�i�Ղ�����邾�낤�B";
		mes "�}���ł���B";
		close;
	case 5:
	case 6:
		mes "[�t�H�[�h]";
		mes "�A�[�T�[�i�Ղɉ�����̂��H";
		mes "�������p�ӂ���";
		mes "�X���b�e�B�Ɉ��܂���悤�ɁB";
		close;
	default:
		mes "[�t�H�[�h]";
		mes "������ė����悤���ȁB";
		mes "����A�����X���b�e�B�̏���";
		mes "�s���ď����Ă���Ă���B";
		close;
	}
}

gef_fild13,297,242,3	script	���m	751,{
	if(getskilllv(1002)) {
		mes "[�X���b�e�B]";
		mes "�����A���͏������H";
		mes "���܂ɂ͂������ɗ���";
		mes "���ƌ��p�̗��K�ł������";
		mes "�ǂ��̂Ɂc�c�B�n�n�B";
		close;
	}
	switch(SKILL_SHRINK) {
	case 1:
		mes "[���m]";
		mes "�E�E�E�c�c";
		mes "�����c�c�����c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ�������ł����H";
		next;
		mes "[���m]";
		mes "�t�H�[�h�ɏ󋵂�";
		mes "�񍐂��ɍs���r����";
		mes "�S�u���������ɏP�����ꂽ�c�c�B";
		mes "���A�S�u�����̌Q�ꂪ����";
		mes "�P�����Ɖ��������Ă���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł́A���Ȃ����X���b�e�B����H";
		next;
		mes "[�X���b�e�B]";
		mes "�����B�����X���b�e�B���B";
		mes "���O�͉���m���Ă���̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�t�H�[�h���񂩂痊�܂ꎖ��";
		mes "�󂯂Ă����ł��B";
		next;
		mes "[�X���b�e�B]";
		mes "�������B����͂��傤�Ǘǂ������B";
		mes "���O�ɕ񍐏��ƌR���o���v������";
		mes "�n������A�����t�H�[�h�̏���";
		mes "�s���ēn���Ăق����B";
		next;
		mes "[�X���b�e�B]";
		mes "�������w���֕񍐂���";
		mes "���𑗂�ɂ̓t�H�[�h�ł����Ԃ�";
		mes "������Ǝv������ȁB";
		mes "�Ȃ�ׂ������c�c���̂ށB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł́A���Ȃ��́H";
		mes "����ȏ�Ԃłǂ��������ł����H";
		next;
		mes "[�X���b�e�B]";
		mes "���͑��v���B";
		mes "�E�E�E�b!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�{���ɑ��v�ł����H";
		next;
		mes "[�X���b�e�B]";
		mes "�n�n�B�{���ɑ��v�B";
		mes "�I�I�I�b�I�@�A�A�c�c�B";
		mes "�����c�c�B�A�A�b�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�B";
		next;
		mes "[�X���b�e�B]";
		mes "�n�n�c�c�S�z�Ȃ�����ȁ`";
		mes "�I�E�D!!!";
		mes "�N�I�I�I�`";
		next;
		mes "[�X���b�e�B]";
		mes "���I�E�E�b�I";
		mes "�E�I�I�b�I�A�t�D�c�c�B";
		mes "�����c�c�O�z�A�c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-����ς�ԃ|�[�V������";
		mes "�����ė��������ǂ�������-";
		set SKILL_SHRINK,2;
		close;
	case 2:
		if(countitem(501) < 1) {
			mes "[�X���b�e�B]";
			mes "�E�A�A�c�c���̑��c�c�B";
			mes "�E�E�E�c�c�B";
			mes "�N�I�I�I�I�c�c�B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "-����ς�ԃ|�[�V������";
			mes "�����ė��������ǂ�������-";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�ꉞ�|�[�V�����������ė����̂�";
		mes "���������ł݂Ă��������B";
		next;
		mes "[�X���b�e�B]";
		mes "�E�E�b�B���肪�Ƃ��c�c�B";
		mes "-�S�N�S�N-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-��Ԃ͏����ǂ��Ȃ������A";
		mes "�܂������~�܂�Ȃ�-";
		next;
		mes "[�X���b�e�B]";
		mes "�����ǂ��B";
		mes "���͂����ʖڂ�����A";
		mes "�������̌����Ƃ���Ɂc�c";
		mes "�莆�������čs���悤�Ɂc�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł��c�c�B";
		next;
		mes "[�X���b�e�B]";
		mes "�����s���I";
		mes "����͉��̖����~��������";
		mes "����������ł͂Ȃ��B";
		mes "�����A�����s���Ă���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�X���b�e�B����A���A";
		mes "�K���߂��ė��܂�����";
		mes "�����Ƃ��Ă��Ă��������ˁB";
		next;
		mes "[�X���b�e�B]";
		mes "���̌��t�����ŏ\�����B";
		mes "���肪�Ƃ��B";
		mes "������c�c�����}���ł���B";
		mes "�S�z���S�z���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�����t���Ă���莆���󂯎����-";
		delitem 501,1;
		set SKILL_SHRINK,3;
		close;
	case 3:
		mes "[�X���b�e�B]";
		mes "�����ŉ������Ă���񂾁I";
		mes "�����s��!!";
		mes "�����n�����莆��";
		mes "�t�H�[�h�ɓn��!!";
		close;
	case 4:
		mes "[�X���b�e�B]";
		mes "�N�E�E�b�B";
		mes "�c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�X���b�e�B�͂܂��S�u������";
		mes "�P��ꂽ�悤�ŁA���������Ă���B";
		mes "���_��Ԃ���������-";
		close;
	case 5:
		mes "[�X���b�e�B]";
		mes "�N�E�E�b�B";
		mes "�c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�X���b�e�B�͂܂��S�u������";
		mes "�P��ꂽ�悤�ŁA���������Ă���B";
		mes "���_��Ԃ����������B";
		mes "�ꍏ�������򂪕K�v�ȏ�Ԃ�-";
		close;
	case 6:
		mes "[�X���b�e�B]";
		mes "�c�c�B";
		mes "�c�c�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�X���b�e�B�͂܂��S�u������";
		mes "�P��ꂽ�悤�ŁA���������Ă���B";
		mes "���_��Ԃ����������B";
		mes "�ꍏ�������򂪕K�v�ȏ�Ԃ�-";
		close;
	case 7:
		if(rand(5) < 3) {
			mes "[" +strcharinfo(0)+ "]";
			mes "-�����ė�������X���b�e�B��";
			mes "���ɏ����������ł��������A";
			mes "�򂪊Ԉ���Ă����̂�";
			mes "�����܂����������Ȃ��B";
			mes "������x���Ⴂ�ɍs���Ȃ����-";
			set SKILL_SHRINK,8;
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "-�����ė������";
		mes "�X���b�e�B�̌��ɏ�������";
		mes "�����ł�����-";
		next;
		mes "[�X���b�e�B]";
		mes "-�S�N�S�N-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�Ԃɍ������̂�";
		mes "�X���b�e�B�̏���";
		mes "�{���ɖ����n�߂�-";
		next;
		mes "[�X���b�e�B]";
		mes "�E�E�E���`";
		mes "�N�E�E�b�I";
		mes "�ǂ������񂾁c�c�B";
		mes "���A�����Ă���̂��c�c�B";
		mes "!!!!?";
		next;
		mes "[�X���b�e�B]";
		mes "���A���O��?!";
		next;
		mes "[�X���b�e�B]";
		mes "�܂���?!";
		mes "���O�������~���Ă��ꂽ�̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B";
		next;
		mes "[�X���b�e�B]";
		mes "���A����ȁc�c�B";
		mes "���������Ă���Ȃ�āc�c�B";
		next;
		mes "[�X���b�e�B]";
		mes "�C�������O�܂�";
		mes "���̓���ʂ���͊F";
		mes "�����|�����񂾁c�c�B";
		mes "�������͂������񂾂�";
		mes "�v���Ă������A���O���߂��ė���";
		mes "�����Ă����Ƃ́c�c�B";
		next;
		mes "[�X���b�e�B]";
		mes "�������B";
		mes "�v�����͖����ɓn���Ă��ꂽ���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B";
		next;
		mes "[�X���b�e�B]";
		mes "����͍K�����B";
		mes "���ށc�c�����c�c";
		mes "���Ԃ����������񂾂��c�c�B";
		mes "�������A���O�ɉ��̋Z��`�����Ă��B";
		next;
		mes "[�X���b�e�B]";
		mes "������l�ł����܂őς��邱�Ƃ�";
		mes "�ł����̂��A���̋Z�̂��������낤�B";
		mes "�u^FF0000�V�������N^000000�v�Ƃ����Z���B";
		next;
		mes "[�X���b�e�B]";
		mes "�u^FF0000�V�������N^000000�v��";
		mes "���ꂪ�������Ă����Ԃ�";
		mes "�u�I�[�g�K�[�h�v���g����";
		mes "�G�̍U����h�����ꍇ�A���̓G��";
		mes "�e����΂��Ƃ����Z�Ȃ񂾁B";
		next;
		mes "[�X���b�e�B]";
		mes "���O�̖��ɂ����͂����B";
		mes "�����A���������Ă�낤�B";
		mes "�������̉��l�ɂ��Ă���̂�";
		mes "����Ȃ���ł��܂Ȃ����c�c�B";
		next;
		mes "[�X���b�e�B]";
		mes "�����A���ꂩ������̓N���Z�C�_�[��";
		mes "�V�Z��̓����Ă������肾����A";
		mes "���̎��͂��Љ��̏��ɗ��ė~�����B";
		mes "���O�ɂ͈�Ԃɋ����Ă�邩��ȁB";
		next;
		mes "[�X���b�e�B]";
		mes "���������������Z���g���āA";
		mes "���������Ă��ꂽ���̂悤��";
		mes "�l�X������ė~�����B";
		mes "�ł́A���̐�̗��ɂ��C������";
		mes "�����ȁB����A�܂��ȁB";
		set SKILL_SHRINK,0;
		skill 1002,1,0;
		close;
	case 8:
		mes "[" +strcharinfo(0)+ "]";
		mes "-�ǂ���痈��r����";
		mes "��̌��ʂ�����Ă��܂����悤���B";
		mes "�܂��A�[�T�[�i�Ղ̏��֍s����";
		mes "����ė��Ȃ���΂Ȃ�Ȃ�-";
		close;
	default:
		mes "[�X���b�e�B]";
		mes "�����̓S�u�����B�������o�v����";
		mes "�n�悾����C������悤�ɁI";
		close;
	}
}

prt_church,87,127,3	script	�i��	755,{
	if(getskilllv(1002)) {
		mes "[�A�[�T�[]";
		mes "����ɂ��́B";
		mes "���v���Ԃ�ł��ˁB";
		mes "�܂��ꂵ��ł������";
		mes "��������������A���ł�����";
		mes "���������Ă��������B";
		close;
	}
	switch(SKILL_SHRINK) {
	case 4:
		mes "[�A�[�T�[]";
		mes "���ށc�c�H";
		mes "�������p�ł��傤���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���镺�m���S�u�����ɏP���āA";
		mes "���댯�ȏ󋵂Ȃ�ł��B";
		mes "���Ȃ����S�u�����̓ł̉�ō܂�";
		mes "�����Ă���ƕ����ĖK�˂܂����B";
		next;
		mes "[�A�[�T�[]";
		mes "�ӂށA�S�u�����̓ł̉�ō܂Ȃ�A";
		mes "������邱�Ƃ��ł��܂��B";
		mes "�������A�����̖��؂炵�Ă��܂��āA";
		mes "���Ȃ�ޗ����K�v�ł����c�c";
		mes "�c�O�Ȃ���A�ޗ����茳�ɖ�����ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̍ޗ����ĉ��ł����H";
		mes "�����T���ė��܂��I";
		next;
		mes "[�A�[�T�[]";
		mes "�ޗ��́c�c";
		mes "�ׂƂׂƂ���t��20�A";
		mes "�󂫃r��3�{�A�[���s�[5�A";
		mes "�܂��n���ĂȂ������S1�A";
		mes "�u�h�E1�A�ΒY1�A";
		mes "�T�C�t�@�[3���K�v�ł��B";
		next;
		mes "[�A�[�T�[]";
		mes "�����A���̕������𕉂��Ă���";
		mes "���Ȃ莞�Ԃ��o���Ă���̂Ȃ�A";
		mes "�}���������ǂ��ł��傤�B";
		next;
		mes "[�A�[�T�[]";
		mes "�����āA������I";
		mes "���̖򂪊��������Ƃ��Ă�";
		mes "100�����ʂ�����Ƃ͌����܂���B";
		mes "����ɂ��Ă͍ޗ����������̍ۂ�";
		mes "���b���܂��B";
		next;
		mes "[�A�[�T�[]";
		mes "�ł́A���������A���";
		mes "���҂����Ă��܂��B";
		mes "���͂��Ȃ����߂��ė���܂�";
		mes "�����鏀�������Ă����܂��B";
		next;
		mes "[�A�[�T�[]";
		mes "������x�\���グ�܂����A";
		mes "�ޗ��́A�ׂƂׂƂ���t��20�A";
		mes "�󂫃r��3�{�A�[���s�[5�A";
		mes "�܂��n���ĂȂ������S1�A�ΒY1�A";
		mes "�u�h�E1�A�T�C�t�@�[3�ł��B";
		mes "�������Y��Ȃ��悤�ɁB";
		set SKILL_SHRINK,5;
		close;
	case 5:
		if(countitem(938) < 20 || countitem(713) < 3 || countitem(909) < 5 ||
			countitem(619) < 1 || countitem(1003) < 1 || countitem(514) < 1 || countitem(7053) < 3) { 
			mes "[�A�[�T�[]";
			mes "�ӂށc�c";
			mes "��̍ޗ�������܂���c�c";
			next;
			mes "[�A�[�T�[]";
			mes "�Ăѐ\���グ�܂����A";
			mes "�ޗ��́A�ׂƂׂƂ���t��20�A";
			mes "�󂫃r��3�{�A�[���s�[5�A";
			mes "�܂��n���ĂȂ������S1�A�ΒY1�A";
			mes "�u�h�E1�A�T�C�t�@�[3�ł��B";
			mes "���ꂮ������ԈႦ�Ȃ��B";
			close;
		}
		mes "[�A�[�T�[]";
		mes "���A�ޗ����������̂悤�ł��ˁB";
		mes "����ł́A�m�F���Ă݂܂��傤�B";
		mes "����c�c���ށc�c�B";
		next;
		mes "[�A�[�T�[]";
		mes "-�K�T�S�\-";
		mes "���ށc�c�����Ă��܂��ˁB";
		mes "�ł́A�����ɒ��܂��܂��傤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A�������B";
		mes "��قǖ߂��ė�����";
		mes "�����Ă�������Ƃ���������Ă���";
		mes "���ɂ��ċ����Ă��������܂����H";
		next;
		mes "[�A�[�T�[]";
		mes "�����A�����ł����ˁc�c�B";
		mes "���̖�́c�c";
		next;
		mes "[�A�[�T�[]";
		mes "����Ă��炷���A�łȂ����";
		mes "�ł�����葁�����܂Ȃ���";
		mes "���������Ă��܂��\����";
		mes "����̂ł��B";
		mes "�����Ȃ�ƁA��������܂���B";
		next;
		mes "[�A�[�T�[]";
		mes "���i�͊��҂̕����������";
		mes "�K�˂Ă���������̂�";
		mes "���ɋC�����Ă��Ȃ������̂ł����c�c";
		mes "����̂悤�ȏꍇ��";
		mes "�����C�����Ȃ���΂Ȃ�܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������܂����B";
		mes "�Ƃ肠�����A����Ă��������B";
		mes "��͎����Ȃ�Ƃ����܂��B";
		next;
		mes "[�A�[�T�[]";
		mes "��͂���������������������";
		mes "�ޗ����炽��������܂��̂ŁA";
		mes "�������򂪌����Ȃ������ꍇ��";
		mes "�܂����Ă��������B";
		mes "�����ɂ���肵�܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B������܂����B";
		next;
		mes "[�A�[�T�[]";
		mes "����ł͒��܂����܂��B";
		mes "���X���҂����������B";
		delitem 938,20;
		delitem 713,3;
		delitem 909,5;
		delitem 619,1;
		delitem 1003,1;
		delitem 514,1;
		delitem 7053,3;
		set SKILL_SHRINK,6;
		close;
	case 6:
		mes "[�A�[�T�[]";
		mes "-�u�N�u�N";
		mes "�`�����`����-";
		next;
		mes "[�A�[�T�[]";
		mes "���A�����傤�Ǌ�������Ƃ���ł��B";
		next;
		mes "[�A�[�T�[]";
		mes "����������Ɏ����Ă���";
		mes "��r�̈���A�����Е���";
		mes "���ꂽ�u�Ԃ��璲�����n�܂�܂��I";
		mes "��������͑��������ł��I";
		next;
		mes "[�A�[�T�[]";
		mes "��x�����������";
		mes "������߂�͂ł��܂���B";
		mes "�悭�����ɂȂ��Ă��Ă��������B";
		mes "����ł͂����܂���I";
		next;
		mes "[�A�[�T�[]";
		mes "���̖���������";
		mes "�Ԃɕς��͂��ł��B";
		mes "�ł́A���ꂩ�獬���܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�A�[�T�[�i�Ղ͉E���";
		mes "�����Ă����r�̉t�̂�";
		mes "�����̕r�ɔ����ʒ�����-";
		next;
		mes "[�A�[�T�[]";
		mes "-�`�����`����-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�F���Ԃɕς����-";
		next;
		mes "[�A�[�T�[]";
		mes "�����āA�������΂炭������ΐF�Ɂc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�r�̒��̉t�̂��΂�";
		mes "�ω��������肾����-";
		next;
		mes "[�A�[�T�[]";
		mes "�����Ŏc��������܂��B";
		next;
		mes "[�A�[�T�[]";
		mes "-�`�����`����-";
		next;
		mes "[�A�[�T�[]";
		mes "�������΂炭������A";
		mes "�Ō�ɐ��̂悤��";
		mes "�����ȉt�̂ɕς��܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-���b��A�r�̒���";
		mes "�򂪓����ɂȂ���-";
		mes "-�A�[�T�[�͂��̖�r��";
		mes "�p�S�[���n���Ă��ꂽ-";
		next;
		mes "[�A�[�T�[]";
		mes "-^FF0000�ł͋}���ŁI^000000-";
		mes "�K�^�����F�肵�Ă��܂��B";
		set SKILL_SHRINK,7;
		close;
	case 7:
		mes "[�A�[�T�[]";
		mes "���H�@�܂��o����";
		mes "���Ă��Ȃ������̂ł����B";
		mes "���܂莞�Ԃ��o���Ă��܂���";
		mes "��̌��ʂ��キ�Ȃ�̂�";
		mes "���}���ɂȂ��������ǂ��ł���B";
		close;
	case 8:
		mes "[�A�[�T�[]";
		mes "��̌��ʂ������Ȃ��Ă��܂���";
		mes "���҂���Ɍ����Ȃ������悤�ł��ˁc�c";
		mes "�܂�����肵�܂���B";
		next;
		mes "[�A�[�T�[]";
		mes "-�T�N�T�N�c�c�`�����`����-";
		mes "-�`�����`����-";
		mes "�o���オ��܂����B";
		mes "�ł́A�}���Ŏ����Ă�����";
		mes "�����Ă�������!!";
		set SKILL_SHRINK,7;
		close;
	default:
		mes "[�A�[�T�[]";
		mes "���͂�����v�����e���吹����";
		mes "�i�ՁA�A�[�T�[�Ɛ\���܂��B";
		mes "�����ł͐Â��ɂ��Ă��������ˁB";
		close;
	}
}


//-----------------------------------------------
//==== �\�j�b�N�A�N�Z�����[�V���� - AS_SONICACCEL
//	�� SKILL_SONICACCEL   -> 0�`4
//-----------------------------------------------
in_moc_16,23,27,5	script	�A�T�V��	885,{
	if(getbaseclass(Class,2) != CLASS_AS) {
		mes "[�A�T�V��]";
		mes "�c�c�c�c";
		close;
	}
	if(getskilllv(1003)) {
		mes "[�C�X�~��]";
		mes "�\�j�b�N�A�N�Z�����[�V������";
		mes "�g���Ă݂�������H";
		mes "�o����ׂɂ����w�͂�";
		mes "���ʂɂȂ�Ȃ��Ƃ�����ˁB";
		close;
	}
	if(getskilllv(1004) == 0) {
		mes "[�A�T�V��]";
		mes "��������悤�B�M���h�̕��ˁB";
		mes "�A�����󂯂Ă��炵���́H";
		emotion 18;
		next;
		menu "�A���c�c�H",-;
		mes "[�A�T�V��]";
		mes "����c�c";
		mes "������Ȃ��悤�ˁB";
		mes "���ɂ���������L���e�B�������";
		mes "���b�����Ă݂�Ε�����܂���B";
		mes "�t�t�b�B";
		close;
	}
	switch(SKILL_SONICACCEL) {
	case 0:
		mes "[�C�X�~��]";
		mes "��������悤�B";
		mes "���͋M���Ɠ����A�A�T�V����";
		mes "�C�X�~���Ɛ\���܂���B";
		mes "�L���e�B������ƈꏏ�ɃM���h��";
		mes "�Z�p����S�������Ă���̂�B";
		next;
		mes "[�C�X�~��]";
		mes "����ł́c�c";
		mes strcharinfo(0)+ "����B";
		mes "��{�I�ȃ\�j�b�N�A�N�Z�����[�V������";
		mes "�����̓L���e�B�������";
		mes "�f���Ă�����̂Ǝv���܂����c�c";
		next;
		mes "[�C�X�~��]";
		mes "�܂��������K�v�ł����";
		mes "���b���č����グ�鎖���ł��܂���";
		mes "�ǂ��Ȃ����܂����H";
		next;
		while(1) {
			if(select("�܂������𕷂��B","�����������Ă��܂��B")==2)
				break;
			mes "[�C�X�~��]";
			mes "�킩��܂����B";
			mes "�ł͐������������܂���B";
			mes "�\�j�b�N�A�N�Z�����[�V������";
			mes "^FF0000�\�j�b�N�u���[���X��";
			mes "�������Ă����⏕�X�L��^000000����";
			mes "�������B";
			next;
			mes "[�C�X�~��]";
			mes "�����̃\�j�b�N�u���[��";
			mes "�g���Ă݂�Ε�����Ƃ͎v�����ǁc�c";
			mes "�G�ɒv������^����Ƃ�������";
			mes "���Ȃ������Ȃ̂�B";
			next;
			mes "[�C�X�~��]";
			mes "���̏�A�f����8�A���Ō���";
			mes "���Ȃ���΂Ȃ�Ȃ��킯�ŁA";
			mes "���������������ɂ��ǂ��Ƃ�";
			mes "�����Ȃ����c�c�B";
			next;
			mes "[�C�X�~��]";
			mes "�_�����������U�����鎖������̂ŁA";
			mes "�X�L�������������Ƃ��Ă��A";
			mes "�傫�ȃ_���[�W��^���ɂ����̂�B";
			next;
			mes "[�C�X�~��]";
			mes "������񂱂�͐l�ɂ���ĈႤ���ǁA";
			mes "�����̐l�͂������Ƃ������ˁB";
			next;
			mes "[�C�X�~��]";
			mes "�M���́A���̒Z����₤";
			mes "�\�j�b�N�A�N�Z�����[�V������";
			mes "�w�Ԏ��ɂ���āA��苭�͂Ő��m��";
			mes "�\�j�b�N�u���[�ŁA����ɒv������";
			mes "�^���鎖���ł���c�c�B";
			next;
			mes "[�C�X�~��]";
			mes "�����c�c�l�������ł��ƂĂ����͓I�B";
			mes "���̂悤�ȃX�L�����J�������A";
			mes "�M���h�}�X�^�[�l�͂�͂�";
			mes "�ƂĂ��f�G�ł���c�c�B";
			emotion 3;
			next;
			mes "[�C�X�~��]";
			mes "�X�L���ɑ΂��Đ����ł��鎖��";
			mes "���̂��炢�ł���ˁB";
			mes "����ȏ�͒��ڎg���Ă݂Ȃ���";
			mes "���������܂��傤�B";
			next;
		}
		mes "[�C�X�~��]";
		mes "����ł͂�����";
		mes "�w�\�j�b�N�A�N�Z�����[�V�����x��";
		mes "���������܂��傤�B";
		next;
		mes "[�C�X�~��]";
		mes "�X�L�����w�ԏ������ł���������H";
		next;
		menu "�͂��I",-;
		mes "[�C�X�~��]";
		mes "��낵���ł���B";
		mes "�X�L�����w�Ԉׂɂ́A";
		mes "�w�M���h�ׂ̈ɂȂ�d��������x";
		mes "�Ƃ����̂������������B";
		next;
		if(getskilllv(136) < 1) {
			mes "[�C�X�~��]";
			mes "�c�c���āA������ƁB";
			mes "�M���A�A�T�V���̊�{���̊�{�X�L��";
			mes "�w�\�j�b�N�u���[�x���o���Ă��Ȃ�";
			mes "�̂ł͂Ȃ��āH";
			mes "�M���A�A�T�V���̊�{���̊�{�X�L��";
			mes "�w�\�j�b�N�u���[�x�����ł�";
			mes "�K�����鎖�͕s�\�Ȃ̂�B";
			next;
			mes "[�C�X�~��]";
			mes "�o�����Ă炵�āB";
			close;
		}
		mes "[�C�X�~��]";
		mes "���Ȃ�������d���́c�c";
		next;
		//�s���~�b�h���[�g������
		//set SKILL_SONICACCEL,rand(1,3);
		set SKILL_SONICACCEL,rand(1,2);
		switch(SKILL_SONICACCEL) {
		case 1:
			mes "[�C�X�~��]";
			mes "�X�t�B���N�X�_���W�����ɍs���āA";
			mes "�󕨂ɒl����i�������";
			mes "�����Ă��Ă��������B";
			mes "�������ɂ͉��l�̍����󕨂���������";
			mes "���邯�ǁA���͂ȃ����X�^�[�B��";
			mes "�����āA�ȒP�ɂ͋߂Â��Ȃ��̂�B";
			next;
			mes "[�C�X�~��]";
			mes "�����ɍs���Ă�����Ⴂ�B";
			mes "�X�t�B���N�X�_���W�����ŕ󕨂�";
			mes "�����Ă���̂ł���B";
			mes "������������w���x�̒���";
			mes "�󕨂����邩���m��Ȃ���ˁB";
			break;
		case 2:
			mes "[�C�X�~��]";
			mes "�X�t�B���N�X�_���W�����ɍs���āA";
			mes "�󕨂ɒl����i�������";
			mes "�����Ă��Ă��������B";
			mes "�������ɂ͉��l�̍����󕨂���������";
			mes "���邯�ǁA���͂ȃ����X�^�[�B��";
			mes "�����āA�ȒP�ɂ͋߂Â��Ȃ��̂�B";
			next;
			mes "[�C�X�~��]";
			mes "�����ɍs���Ă�����Ⴂ�B";
			mes "�X�t�B���N�X�_���W�����ŕ󕨂�";
			mes "�����Ă���̂ł���B";
			mes "������������w�Α��x�̋߂���";
			mes "�󕨂����邩���m��Ȃ���ˁB";
			break;
		}
		next;
		mes "[�C�X�~��]";
		mes "�M�����A�T�V���Ƃ��Ă��̎d����";
		mes "��肱�Ȃ������ł���̂��A";
		mes "����Ƃ��ł��Ȃ��̂����͂����B";
		mes "�\�j�b�N�A�N�Z�����[�V������������";
		mes "���邩�ǂ����͂��̌�ɔ��f�����ˁB";
		mes "�t�t�c�c�ł��邾���}���ł��������ˁB";
		close;
	case 1:
	case 2:
	case 3:
		mes "[�C�X�~��]";
		mes "�ǂ�������H";
		mes "�^����ꂽ�d���͐i��ł�H";
		mes "���܂蒷���͑҂��܂����B";
		mes "�����I��点�Ă�����Ⴂ�B";
		close;
	case 4:
		mes "[�C�X�~��]";
		mes "�ǂ��ł����H";
		mes "�^����ꂽ�d���͐i��ł邩����H";
		next;
		if(countitem(726) < 1 && countitem(723) < 1 && countitem(720) < 1) {
			mes "[�C�X�~��]";
			mes "����A����͂ǂ������́H";
			mes "�c�c�c�c�c�c�c�c";
			mes "��������������݂����ˁB";
			next;
			mes "[�C�X�~��]";
			mes "�c�c�d���Ȃ��ł���B";
			mes "���Ȃ�����ɓ��ꂽ����c�c";
			mes "���r�[�A�T�t�@�C�A";
			mes "�A�N�A�}�����̂ǂꂩ��";
			mes "�����Ă��Ȃ����B";
			mes "��i�͖��Ȃ���B";
			close;
		}
		menu "�����!!",-;
		mes "[�C�X�~��]";
		mes "���̋P���́c�c";
		mes "�����c�c";
		mes "�Ȃ�Ĕ������c�c";
		next;
		mes "[�C�X�~��]";
		mes "��낵���ł���B";
		mes "���ꂪ�s���~�b�h��X�t�B���N�X��";
		mes "��ɓ��ꂽ���ǂ�����";
		mes "���ɏd�v�ł͂Ȃ��̂�B";
		mes "�ƂĂ��Y��Ȃ��̕󕨂�";
		mes "�M���������ĂȂ����B";
		next;
		mes "[�C�X�~��]";
		mes "�������͂͌����Ă��ꂽ����󕨂�";
		mes "�K�v�Ȃ���B";
		mes "�t�t�c�c";
		next;
		mes "[�C�X�~��]";
		mes "���͂���̓M���h�Ŏw�����ꂽ���ł�";
		mes "�Ȃ������̂�B";
		mes "�����M���̗͂������������̂ł��B";
		mes "����ł͖񑩂ǂ��荡������";
		mes "^0000FF�\�j�b�N�A�N�Z�����[�V����^000000��";
		mes "�����č����グ�܂���B";
		next;
		mes "[�C�X�~��]";
		mes "���̂���{����������ƌ��āA";
		mes "�����č����グ����@�ʂ��";
		mes "���ۂɂ���Ă݂�̂�B";
		mes "�K���ł���悤�ɂȂ�܂���B";
		next;
		mes "[�C�X�~��]";
		mes "��낵���āH";
		mes "����ł́c�c";
		next;
		mes "[�C�X�~��]";
		mes "�܂��A�\�j�b�N�u���[���g���O��";
		mes "�c�c�c�c";
		mes "�����������āc�c";
		mes "�����āA�����I";
		misceffect 121;
		next;
		mes "[�C�X�~��]";
		mes "�����ƌ��Ă���������H";
		mes "���̕������d�v�Ȃ̂�B";
		mes "�r�Ǝ�̈ʒu���c�c�����c�c";
		mes "�����Ă�������̂�I";
		misceffect 121;
		next;
		mes "[�C�X�~��]";
		mes "�����A����Ă݂Ă��������B";
		next;
		misceffect 121,"";
		next;
		mes "[�C�X�~��]";
		mes "������x�I";
		next;
		misceffect 121,"";
		next;
		mes "[�C�X�~��]";
		mes "���[��A������ƈႤ��ˁB";
		mes "������x����Ă݂Ă��������B";
		next;
		misceffect 121,"";
		next;
		mes "[�C�X�~��]";
		mes "�c�c�c�c";
		next;
		mes "[�C�X�~��]";
		mes "�Ō�ɂ�����x�I";
		next;
		misceffect 121,"";
		next;
		mes "[�C�X�~��]";
		mes "�f���炵���ł���I";
		mes "����ŗǂ��̂ł��I";
		set SKILL_SONICACCEL,0;
		skill 1003,1,0;
		next;
		mes "[�C�X�~��]";
		mes "���������ł�����ˁH";
		mes "�ł͗��_�Ƃ���{�͏I����B";
		mes "�M�����^�̃A�T�V���Ȃ�";
		mes "���ꂭ�炢�ŏ\���̂͂��ł���B";
		mes "�Y��Ȃ��悤�ɁB";
		next;
		mes "[�C�X�~��]";
		mes "��͎��ۂɎ���Ŏg���Ă����Ȃ����B";
		mes "����o������Ԃ̗��K�ɂȂ�܂���B";
		mes "�t�t�c�c���͎��̃A�T�V���ׂ̈�";
		mes "���������Ȃ���΂����Ȃ��̂ŁA";
		mes "����Ŏ��炷���B";
		close;
	}
}

in_sphinx2,259,213,0	script	�Â���#1	139,7,8,{
	if(SKILL_SONICACCEL != 1)
		end;
	mes "�ƂĂ��Â����Ȋ�������B";
	mes "���̂ӂ�����������Ă���";
	mes "���̒��Ō��𔽎˂���P��";
	mes "����������悤���B";
	misceffect 71;
	next;
	mes "�ǂ�����H";
	next;
	while(1) {
		switch(select("������Ă݂�","����������Ƌ߂��Ŋm�F������","�ӂ����J���Ċm�F����","�������ɓ|��","��������")) {
		case 1:
			mes "���Ȃ��͎����ꂽ�B";
			mes "�����Ęr��[������ċP��������";
			mes "��낤�Ǝ��L�΂����B";
			next;
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			next;
			if(strnpcinfo(2) != 2 || rand(3)) {
				mes "^FF0000!!!!!!!!!!";
				mes "���������Ȃ��̎�Ɋ��ݕt����!!!!^000000";
				sc_start SC_POISON,30000,0;
				emotion 23,"";
				close;
			}
			mes "�d����������ɐG�ꂽ�B";
			mes "���Ȃ��͂�����������般�肵�߂�";
			mes "������o�����B";
			next;
			mes "���o��������J����";
			mes "�X�t�B���N�X�̍���炵��";
			mes "��΂���ɓ��ꂽ�B";
			set SKILL_SONICACCEL,4;
			getitem 726,1;
			close;
		case 2:
			mes "���Ȃ��͊��̊��ꂽ���Ԃ�";
			mes "����ߕt�����B";
			next;
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			next;
			mes "�Â����̒��ŉ���";
			mes "�����Ă���̂�������B";
			mes "����ȏ�͈Â��Č����Ȃ��B";
			sc_start SC_BLIND,30000,0;
			break;
		case 3:
			mes "���̂ӂ��͕s�v�c�ȗ͂�������";
			mes "�т��Ƃ����Ȃ��B";
			sc_start SC_CURSE,30000,0;
			break;
		case 4:
			mes "�������ɓ|�����Ƃ�����";
			mes "�܂����������Ȃ��B";
			break;
		case 5:
			close;
		}
		next;
	}
}
in_sphinx2,212,267,0	duplicate(�Â���#1)	�Â���#2	139,5,6

in_sphinx2,13,163,0	script	�Α�#1	139,7,7,{
	if(SKILL_SONICACCEL != 2)
		end;
	misceffect 71;
	mes "�Â����ȐΑ��������Ă���B";
	mes "��������������������Ă���";
	mes "���ɂ��|�ꂻ�����B";
	next;
	mes "�Α��̎���͂ۂ���Ƃ��ڂ�ł���B";
	mes "�悭����ƐΑ��̑�������";
	mes "�P������������B";
	misceffect 71;
	next;
	mes "�ǂ�����H";
	next;
	if(select("�߂Â��Ċm�F����","��������")==2) {
		mes "�c�c�c�c";
		close;
	}
	mes "���ڂ񂾏��֑��𓥂ݏo����";
	mes "�ꂩ�物�F�����������o�����B";
	next;
	if(strnpcinfo(2) != 1 || rand(3)) {
		mes "���Ȃ���";
		mes "���Ōċz���ꂵ���Ȃ����B";
		mes "���Ȃ��͈ӎ����������B";
		sc_start SC_SLEEP,30000,0;
		close;
	}
	mes "���Ȃ���";
	mes "�����~�߂āA";
	mes "�f�����Α��̑��������m�F�����B";
	next;
	if(strnpcinfo(2) != 1) {
		mes "�P�������͐܂�Ď̂Ă�ꂽ";
		mes "���̐n�������B";
		emotion 23,"";
		close;
	}
	mes "�X�t�B���N�X�̍���炵��";
	mes "��΂���ɓ��ꂽ�B";
	set SKILL_SONICACCEL,4;
	getitem 723,1;
	close;
}
in_sphinx2,13,146,0	duplicate(�Α�#1)	�Α�#2	139,7,7


//-----------------------------------------------
//==== �x�i���i�C�t - AS_VENOMKNIFE
//-----------------------------------------------
in_moc_16,14,27,5	script	�A�T�V��	884,{
	if(getbaseclass(Class,2) != CLASS_AS) {
		mes "[�A�T�V��]";
		mes "�c�c�c�c�c�c�c�c";
		close;
	}
	if(getskilllv(1003) && getskilllv(1004)) {
		mes "[�L���e�B��]";
		mes "���A�V�����X�L���𗼕��K���������B";
		mes "�Ȃ��Ȃ����ȁB";
		mes "�N�͂����Ƌ����Ȃ邾�낤��B";
		mes "���ꂩ����M���h�̂��߂�";
		mes "�����Ɨ͂�s�����Ă����B";
		close;
	}
	if(getskilllv(1004)) {
		mes "[�L���e�B��]";
		mes "�ǂ������A";
		mes "^9C009C�x�i���i�C�t^000000�͎g���Ă��邩���H";
		mes "�g�����͋C��t���Ă����B";
		mes "�ŕt���i�C�t�������Ǝg���Ȃ�����ȁB";
		mes "���Ƃ́A�Ԉ���ē����Ă��܂���";
		mes "���ʎg������悤�Ȏ����Ȃ��悤�ɂȁB";
		close;
	}
	mes "[�L���e�B��]";
	mes "��c�c�A�����A�N��";
	mes strcharinfo(0)+ "����Ȃ����H";
	mes "�v���Ԃ�ɃM���h�ɗ����ȁI";
	next;
	mes "[�L���e�B��]";
	mes "���傤�ǂ悩�����B";
	mes "���A���������Ŋ������Ă���";
	mes "�A�T�V���M���h�����������W���悤��";
	mes "���Ă����Ƃ��낾�B";
	next;
	menu "�M���h�ŉ����N��������ł����H",-;
	mes "[�L���e�B��]";
	mes "�����A���̒ʂ肾�B";
	mes "������A�������낢�����ȁc�c";
	next;
	mes "[�L���e�B��]";
	mes "�t�t�t�c�c�������A�����Ȃ�H";
	mes "�M���h�����������W���闝�R�Ƃ́I";
	mes "�M���h�}�X�^�[���҂ݏo����";
	mes "�A�T�V���̐V�����X�L����";
	mes "�`�����邽�߂Ȃ񂾂�I";
	next;
	menu "�V�����X�L���H",-;
	mes "[�L���e�B��]";
	mes "�ӂӂ�A�����Ɩڂ��P�����Ă�ȁB";
	mes "�����A�V�����X�L�����B";
	next;
	menu "�ڂ����I",-;
	mes "[�L���e�B��]";
	mes "�܂������}�����Ȃ��āI";
	mes "2�̃X�L�����V���ɊJ�����ꂽ�̂��B";
	mes "1�ڂ�^0000FF�\�j�b�N�u���[�̉��ǌ^^000000�B";
	mes "2�ڂ�^9C009C�x�i���i�C�t^000000�Ƃ���";
	mes "�������U���X�L�����B";
	mes "�ǂ�ȃX�L���Ȃ̂��m�肽�����낤�H";
	next;
	mes "[�L���e�B��]";
	mes "���Ⴀ2�̒��łǂ̃X�L������";
	mes "�������ė~�����H";
	mes "����Ƃ������͂���Ȃ����H";
	next;
	while(1) {
		switch(select("^0000FF�\�j�b�N�u���[�̉��ǌ^^000000","^9C009C�x�i���i�C�t^000000","�����͌��\�ł��B")) {
		case 1:
			mes "[�L���e�B��]";
			mes "�������A�T�V���M���h����";
			mes "��\�I�ȃX�L���ƌ����Ζܘ_";
			mes "^0000FF�\�j�b�N�u���[^000000���B";
			next;
			mes "[�L���e�B��]";
			mes "�N�����R�m���Ă���Ƃ͎v����";
			mes "�\�j�b�N�u���[�͑������C��";
			mes "8�A���U������X�L�����B";
			mes "�����A�����W���͂Ɗ�p����K�v��";
			mes "���邩��f�����G���U������̂�";
			mes "�Ȃ��Ȃ�������񂾁B";
			next;
			mes "[�L���e�B��]";
			mes "�M���h�}�X�^�[�͂������̖���";
			mes "�������悤�Ǝv���āA������";
			mes "�����𑱂��Ă����悤�łˁB";
			mes "���ɂ��̌��_��₤�������";
			mes "���o�����킯���B";
			next;
			mes "[�L���e�B��]";
			mes "���̉�����Ƃ́A";
			mes "�M���h�}�X�^�[���X�ɕ҂ݏo����";
			mes "^0000FF�\�j�b�N�A�N�Z�����[�V����^000000";
			mes "�Ƃ����X�L�����B";
			next;
			mes "[�L���e�B��]";
			mes "�\�j�b�N�A�N�Z�����[�V�����Ƃ́c�c";
			mes "�\�j�b�N�u���[���g������";
			mes "����̎�_��X�L�����ɂ߂邽�߂�";
			mes "�s���ڂ�g�ɂ��鎖���ł���";
			mes "�X�L���Ȃ̂��B";
			next;
			mes "[�L���e�B��]";
			mes "���ɁA";
			mes "�\�j�b�N�A�N�Z�����[�V������";
			mes "�\�j�b�N�u���[���g������";
			mes "���܂ł����������m�ȑŌ���";
			mes "�o�b�N�A�b�v���Ă����X�L���ł���B";
			next;
			mes "[�L���e�B��]";
			mes "���ɁA";
			mes "�\�j�b�N�A�N�Z�����[�V������";
			mes "�G���U������X�L���Ƃ�������";
			mes "�������g���\�j�b�N�u���[���g���̂�";
			mes "�ŗǂ̏����𐮂��Ă����";
			mes "�X�L�����ƌ�����B";
			next;
			mes "[�L���e�B��]";
			mes "�\�j�b�N�A�N�Z�����[�V�������K������";
			mes "�\�j�b�N�u���[���g����";
			mes "���̌��ʂ͔��Q���B";
			next;
			mes "[�L���e�B��]";
			mes "�K���������Ȃ�^9C009C�x�i���i�C�t^000000��";
			mes "�K�����Ă���A���̉��ɋ���";
			mes "�w�킵�̃A�T�V���N���X�x�A";
			mes "�C�X�~���ɘb���Ă݂ȁB";
			next;
			continue;
		case 2:
			mes "[�L���e�B��]";
			mes "�悵�B^9C009C�x�i���i�C�t^000000��";
			mes "�������A�T�V���ɕs�����Ă���";
			mes "�������U�����A�����ł�";
			mes "�₤�����ł���悤�ȃX�L���Ƃ���";
			mes "�҂ݏo���ꂽ���̂��B";
			next;
			mes "[�L���e�B��]";
			mes "�Γ����A�O�����g�D�[�X�A";
			mes "�\�E���u���C�J�[�Ƃ��������̂����邪";
			mes "�g���ɂ͂��Ȃ�̐��񂪂��邾�낤�H";
			mes "�����炱���A���̃X�L����";
			mes "�𗧂̂��B";
			next;
			mes "[�L���e�B��]";
			mes "�X�L���̃C���x�i����";
			mes "����̃i�C�t���g���񂾁B";
			mes "�C���x�i�����i�C�t��";
			mes "�Ԃ����񂾌�A����ɂ��̃i�C�t��";
			mes "�����Ďh���B����ƃi�C�t��";
			mes "�t�����Ă���C���x�i���̓ł�";
			next;
			mes "[�L���e�B��]";
			mes "����̑̓��ɓ��荞�ށc�c";
			mes "����ȃX�L�����ȁB";
			mes "�N������������ł�";
			mes "�������Ȃ���΂Ȃ�Ȃ����ɗL�����B";
			mes "�N�N�N�N�N�c�c";
			next;
			continue;
		case 3:
			break;
		}
		break;
	}
	mes "[�L���e�B��]";
	mes "�悵�A�Ȃ�N�͂ǂ̃X�L�����w�т����H";
	mes "�Ƃ͂�������^9C009C�x�i���i�C�t^000000����";
	mes "�����Ă��Ȃ����B";
	mes "���A^636363�i�C�t�ɃC���x�i�����Ԃ�����^000000";
	mes "���@����������΂����̂��B";
	mes "�����������Ă��邪�A�ǂ�����H";
	next;
	while(1) {
		if(select("�����Ă��炤�B","���͋����Ȃ��B")==1)
			break;
		mes "[�L���e�B��]";
		mes "�����H�@���ӋC�ȓz���c�c";
		mes "�M���h�}�X�^�[�̓w�͂�";
		mes "���ʂɂ��悤���Ă̂��H";
		mes "����������肽���ƌ����񂾁I";
		next;
	}
	mes "[�L���e�B��]";
	mes "�悵�I";
	mes "���Ⴀ�����Ă�邩��悭������B";
	mes "�܂�^9C009C�x�i���i�C�t^000000���g���O��";
	mes "^0000FF�i�C�t^000000�������Ă��Ȃ���΂Ȃ�Ȃ��B";
	mes "����ł����Ă��c�c";
	next;
	misceffect 129;
	mes "[�L���e�B��]";
	mes "�C���x�i�����������āc�c";
	next;
	mes "[�L���e�B��]";
	mes "�c�c��́c�c���������";
	mes "�����c�c�������ƁB";
	mes "�ȒP���낤�H";
	mes "������Ă݂ȁB";
	next;
	misceffect 129,"";
	next;
	mes "[�L���e�B��]";
	mes "�����I";
	mes "�������񂾁B";
	next;
	mes "[�L���e�B��]";
	mes "�Ȃ��Ȃ������݂�����ȁB";
	mes "�����܂��A���ۂ�";
	mes "�g���Ă݂�̂���Ԃ��Ǝv�����B";
	mes "������������ł�������ȁB";
	mes "�N�N�N�c�c";
	next;
	mes "[�L���e�B��]";
	mes "���Ⴀ���i�����B";
	mes "�A�T�V���M���h�̖��_�̂��߂Ɂc�c";
	skill 1004,1,0;
	close;
}

in_moc_16,22,20,7	shop	�A�C�ȏ��l	880,1771:-1


//-----------------------------------------------
//==== �N���[�Y�R���t�@�C�� - RG_CLOSECONFINE
//	�� SKILL_CLOSECONFINE   -> 0�`
//-----------------------------------------------
in_rogue,355,179,0	script	�n�C�W�����E�O���O	46,{
	if(getskilllv(1005)) {
		mes "[�n�C�W�����E�O���O]";
		mes "���̑O�͖{���ɂ��肪�Ƃ��B";
		mes "���O�ɂ��]���̌��E�𒴉z���Ăق����B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_RG) {
		mes "[�n�C�W�����E�O���O]";
		mes "�N���c�c�����c�c";
		mes "���[�O���Ă�ł���c�c";
		mes "���ށc�c�B";
		close;
	}
	switch(SKILL_CLOSECONFINE) {
	case 0:
		mes "[�n�C�W�����E�O���O]";
		mes "�󕨂Ƃ������̂́A";
		mes "�����傪�ŏ����猈�܂��Ă����";
		mes "�����邪�c�c";
		mes "�~���肷�������ȁc�c�B";
		close;
	case 1:
		mes "[�n�C�W�����E�O���O]";
		mes "���O�͒N���H�@�ǂ������";
		mes "���̕�����T���o�����̂��H";
		mes "��̉��҂����������܂�";
		mes "�ǂ��l�߂�̂��I";
		mes "���̂𖾂����I";
		next;
		if(select("���͔ނ�Ɗ֌W����܂���","�ړI�͕������Ă���ł��傤�H")==2) {
			mes "[�n�C�W�����E�O���O]";
			mes "^00FF00�u�N���[�Y�R���t�@�C��!!�v^000000";
			misceffect 174;
			misceffect 175,"";
			next;
			mes "[�n�C�W�����E�O���O]";
			//mes "^00FF00�u�o�b�N�X�e�b�v!!�v^000000";	//�{�I�d�l
			mes "^00FF00�u�o�b�N�X�^�u!!�v^000000";
			misceffect 190,"";
			percentheal -95,0;
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "���ꂭ�炢�ŋ����Ă��B";
			mes "��x�Ɖ��̑O�Ɍ����ȁI";
			close;
		}
		mes "[�n�C�W�����E�O���O]";
		//mes "���́c�c";	//�{�I�d�l
		mes "�z��Ƃ͈Ⴄ�̂��c�c�H";
		mes "�ł͂Ȃ������ɗ����H";
		next;
		if(select("���Ȃ��������ɗ��܂���","�����̒ʂ肷����ł�")==2) {
			mes "[�n�C�W�����E�O���O]";
			mes "����ł́A�܂����x�b�����B";
			close;
		}
		mes "[�n�C�W�����E�O���O]";
		mes "���c�c���肪�Ƃ��c�c�B";
		mes "���̑O�A�`���̃��[�O�A�`�F�e�N�x��";
		mes "��p���������āA���̒���";
		mes "�����̔閧��������Ă����B";
		mes "�`�F�e�N�x�ɂ��ĕ��������͂��邩�H";
		next;
		if(select("������","���������͂���܂�")==1) {
			mes "[�n�C�W�����E�O���O]";
			mes "�`�F�e�N�x��100�N�O�̐l���Ȃ̂��B";
			mes "�ނ͐l�Ŏn�߂ē]���𐬂��������B";
			mes "��ʓI�ɁA�]�����Ă��]���O�̋L����";
			mes "�ǂ����Ɏc��A���ɐE�Ƃ͓]���O��";
			mes "�������̂ɏA���͂��Ȃ̂����A";
			mes "�ނ͂��̏펯�𕢂����̂��B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�]���O�Ƀ����N�������ނ��A";
			mes "�]����ɏA�����E�Ƃ́c�c";
			mes "���[�O�������B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�����ăX�L�����A���[�O�̃X�L����";
			mes "�P�ɏK�����������ł͂Ȃ��A";
			mes "�����N�́u���H���v���c�c";
			mes "�������A�����N�̂�����";
			mes "����ɐ������ꂽ���̂�̓������̂��B";
			next;
		}
		mes "[�n�C�W�����E�O���O]";
		//mes "����" +(@menu==1? "��": "�n�C�W����")+ "�̔�p������ɓ���āA";	//�{�I�d�l
		mes "����" +(@menu==1? "��": "�`�F�e�N�x")+ "�̔�p������ɓ���āA";
		mes "�O�l�̑��q�B�ɋ������̂��B";
		mes "���ꂩ��A��肪�N�������B";
		mes "���A���͗]�T���Ȃ��B������`����";
		mes "�O�l�̑��q�Ǝ������S��";
		mes "�߂�����悤�ɂ��Ă���Ȃ����H";
		next;
		if(select("�͂��A����!!","���͎����]�T������܂���")==2) {
			mes "[�n�C�W�����E�O���O]";
			mes "����ł́A�܂����x�b�����B";
			close;
		}
		mes "[�n�C�W�����E�O���O]";
		mes "���肪�Ƃ��B";
		mes "�ł́A���̏����";
		mes "�����q�ł���^FF0000���C�E�O���O^000000��";
		mes "�}���œn���Ă���B";
		next;
		mes "^0000FF-�n�C�W�����̏���l��-^000000";
		set SKILL_CLOSECONFINE,2;
		close;
	case 2:
		mes "[�n�C�W�����E�O���O]";
		mes "���Ԃ��Ȃ��B";
		mes "����𖖂��q��^FF0000���C^000000��";
		mes "�n���Ăق����B";
		mes "^FF0000���C^000000�̓��[�O�M���h�̒���";
		mes "�z���O����Jr.�̋߂��ɂ���B";
		mes "�}���ł���I";
		close;
	case 3:
		mes "[�n�C�W�����E�O���O]";
		mes "^FF0000�g�[��^000000�̓w���}���\��Jr.��";
		mes "���ɂ���B";
		close;
	case 4:
		mes "[�n�C�W�����E�O���O]";
		mes "^FF0000�W�F�C^000000�̓M���h�̒���";
		mes "�A���g�j�IJr.�̉��ɂ���B";
		close;
	case 5:
		mes "^0000FF-�W�F�C�E�O���O�̏����n����-^000000";
		next;
		mes "[�n�C�W�����E�O���O]";
		mes "�Ӂ`�A�Ƃ肠�����O�l�̑��q��";
		mes "��@�I�󋵂ɂȂ������Ƃ͓`��������";
		mes "�����ق��Ƃ����B���肪�Ƃ��B";
		mes "���Ƃ̓M���h�ŏ�������Ǝv����B";
		mes "���O�̂������ŏ��������B���肪�Ƃ��B";
		next;
		mes "[�n�C�W�����E�O���O]";
		mes "���O�����Ȃ�������A���Ɖ��̑��q�B��";
		mes "�댯�Ȗڂɂ����������m��Ȃ��B";
		mes "����ɔ�p�������邩��A";
		mes "^FF0000�g�[��^000000�̏���";
		mes "�s���Ă݂�悤�ɁB";
		set SKILL_CLOSECONFINE,6;
		close;
	case 6:
		mes "[�n�C�W�����E�O���O]";
		mes "��p�K���̂��߂�";
		mes "^FF0000�g�[��^000000��K�˂Ă݂�悤�ɁB";
		close;
	case 7:
		mes "[�n�C�W�����E�O���O]";
		mes "���O�͏C����ɋ����͂������A";
		mes "�ǂ������H�@����ȏ��ŁB";
		mes "^FF0000�g�[��^000000�̏��֍s���ė����B";
		close;
	case 8:
		mes "[�n�C�W�����E�O���O]";
		mes "���O�͓��ʂƂ������Ƃ��c�c�B";
		mes "����Ȃɑ����K������Ƃ͂ȁB";
		mes "�܂�^FF0000�g�[��^000000�̏��֍s����";
		mes "�܂��߂��Ă����B";
		close;
	case 9:
		mes "[�n�C�W�����E�O���O]";
		mes "���c�c�߂��Ă������H";
		mes "�������ȁB�ł́A��p���c�c";
		mes "�ށH";
		mes "��p�c�c���c�c���c�c�B";
		misceffect 190;
		initnpctimer "#Assassin01";
		set SKILL_CLOSECONFINE,10;
		close;
	case 10:
		mes "[�n�C�W�����E�O���O]";
		mes "���́c�c�h�q�c�c�Ɂc�c";
		mes "��p�c�c���c�c���c�c�B";
		initnpctimer "#Assassin01";
		close;
	case 11:
		mes "^0000FF-�`�F�e�N�x�̔�p����n����-^000000";
		next;
		mes "[�n�C�W�����E�O���O]";
		mes "��p���o�����Ƃ������Ƃ́A";
		mes "�`�F�e�N�x�l���]���̌��E��";
		mes "�j�����悤�ɁA���O�ɂ�����ȓ���";
		mes "����悤����Ă���B";
		mes "�ꉞ�A��p�������ʂɂ���";
		mes "�����m���Ă��邱�Ƃ�b�������H";
		next;
		if(select("�͂��A���肢���܂�","�������A���\�ł�")==1) {
			mes "[�n�C�W�����E�O���O]";
			mes "�܂�^4D4DFF�N���[�Y�R���t�@�C��^000000��";
			mes "�ړ��W�Q�̃X�L�����Ƃ������Ƃ�";
			mes "���łɒm���Ă���͂�������A";
			mes "�ΏہA�܂�l�Ԃƃ����X�^�[��";
			mes "�����Đ������悤�B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�܂��A���O�͍U��퓙�ł�";
			mes "���[�O�̖����ɂ��āA������������";
			mes "���ƈႤ���������Ă��邩������񂪁A";
			mes "���̓X�g���b�v�n�̃X�L�������݂�";
			mes "�嗬���ƍl���Ă���B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�������A���H���Ǝ��Ă���";
			mes "^4D4DFF�N���[�Y�R���t�@�C��^000000��";
			mes "���ɍL����悤�ɂȂ�΁A";
			mes "��烍�[�O�̒n�ʂ������";
			mes "�オ�邱�Ƃ͖��炩���B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�������A���H��肪����̂�";
			mes "�Ȃ����̂悤�Ȍ��_���o���̂��H";
			mes "�Ƃ����^��͂��邾�낤�B";
			mes "�������A���̖��������H���Ƃ�";
			mes "�قȂ�Ƃ������Ƃ��������B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "^4D4DFF�N���[�Y�R���t�@�C��^000000��";
			mes "���H���Ƃ͎��Ĕ�Ȃ���̂��B";
			mes "�܂��A���H���͓G�̍U����";
			mes "���������ރX�L���ł��邪�A";
			mes "���̃X�L���͑���̓������̂�";
			mes "�����Ă��܂����̂��B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "����̍U���̗L�閳���Ƃ͊֌W�Ȃ��A";
			mes "�X�L�����̂̐������ɏ]����";
			mes "�Ώۂ̓����𕕂����߂�c�c";
			mes "�܂�ړ���s�\�ɂ���̂��B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�������A�n�C�f�B���O�A�e���|�[�g�A";
			mes "���̉H�A�n�G�̉H�A�m�b�N�o�b�N�Ȃǂ�";
			mes "�g�p�┭���Ŕ����o�������ł��邪�A";
			mes "�U���ł͍������������n�C�f�B���O";
			mes "�����L���ɂȂ�Ȃ�����A";
			mes "���Ɍ��ʂ��L���ɂȂ�X�L���Ȃ̂��B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "^4D4DFF�N���[�Y�R���t�@�C��^000000�ɂ��";
			mes "�����𕕂����Ώۂɂ́A�S�ẴX�L����";
			mes "�g�����Ƃ��ł���B";
			mes "�������A������X�L�����g����B";
			mes "���A�o�b�N�X�^�u�Ɍ����Ă�";
			mes "1�񂵂��g�����Ƃ��ł��Ȃ��B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�L���Ȏg�����̗�������悤�B";
			mes "�܂��A���O���G�̓����𕕂��A";
			mes "�X�g���b�v�n�X�L�����g�p������";
			mes "�����Ƌ��ɓG���W���U������B";
			mes "�ǂ����A�R���r�l�[�V�����Z�Ƃ���";
			mes "���Q�̐��ʂ��o���邾�낤�H";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�����Ă�����I�@�苭�������X�^�[";
			mes "�ɑ����������ɂ��d�v�Ȗ�����";
			mes "�_�������ł���̂��B";
			mes "�{�X�N���X�������������X�^�[��";
			mes "������10�b�ԕ������߂邱�Ƃ��ł���B";
			mes "����Œ��Ԃ���̊��҂��������낤�B";
			next;
			mes "[�n�C�W�����E�O���O]";
			mes "�ӂ��A���X�Ƙb�������A";
			mes "���̎g�����͎��ۂɐF�X��";
			mes "�����Ă��邤���Ɍ����邾�낤�B";
			mes "�悵�A�����������Ƃ͂Ȃ��B";
			mes "���O�����[�O�̓`����z�����Ƃ�";
			mes "�A�Ȃ������Ă��邼�B";
		}
		else {
			mes "[�n�C�W�����E�O���O]";
			mes "�܂��A���ۂɎg����";
			mes "�����ɐF�X�ƕ����邾�낤�B";
		}
		next;
		mes "-�N���[�Y�R���t�@�C�����K������-";
		set SKILL_CLOSECONFINE,0;
		skill 1005,1,0;
		misceffect 348,"";
		close;
	}
}

in_rogue,152,29,0	script	���C�E�O���O	84,{
	if(getskilllv(1005)) {
		mes "[���C�E�O���O]";
		mes "���̗L���ȃ`�F�e�N�x�l��";
		mes "�G�s�\�[�h�ɂ��ČZ����B��";
		mes "�����Ă��܂����B";
		mes "��p�̃R���Z�v�g��";
		mes "�u��l�߂炦����A�m���ɓ|���I�v";
		mes "�������ł��c�c�B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_RG) {
		mes "[���C�E�O���O]";
		mes "�g���l���h���C�u���D���ł��B";
		mes "���`���ƓG�Ɍ������ċ߂Â��c�c";
		mes "���̉��Ƃ������Ȃ����o�B";
		mes "���Ȃ��͂������ł����H";
		close;
	}
	switch(SKILL_CLOSECONFINE) {
	case 0:
		mes "[���C�E�O���O]";
		mes "^FF0000��������^000000�����B�ɔ�p��";
		mes "�`�����Ă���Ă���r���A";
		mes "�}�ɏ����܂����B";
		mes "�y�������ɋ����Ă����";
		mes "������ł����c�c";
		next;
		mes "[���C�E�O���O]";
		mes "�����炭�A���[�O�M���h��";
		mes "�ǂ����B���ꂽ�����ɂ���̂ł�";
		mes "�Ȃ��ł��傤���c�c�B";
		set SKILL_CLOSECONFINE,1;
		close;
	case 1:
		mes "[���C�E�O���O]";
		mes "^FF0000��������^000000�̓��[�O�M���h��";
		mes "�ǂ����B���ꂽ�����ɂ����";
		mes "�v���܂��c�c�B";
		mes "���̕����̓}�L�o�����";
		mes "�ׂ̕����炵���̂ł����A";
		mes "�T���Ă݂Ȃ��Ɓc�c�B";
		close;
	case 2:
		mes "^0000FF-�n�C�W�����̏����n����-^000000";
		next;
		mes "[���C�E�O���O]";
		mes "�������񂪁c�c!?";
		mes "�����Z����ɂ��̎���m�点�Ȃ��ƁI";
		mes "���̏����^FF0000�g�[��^000000�Z�����";
		mes "�n���Ē����܂����H";
		mes "^0000FF-���C�E�O���O�̏���l��-^000000";
		set SKILL_CLOSECONFINE,3;
		close;
	case 3:
		mes "[���C�E�O���O]";
		mes "�����Z����ɂ��̎���m�点�Ȃ��ƁI";
		mes "������g�[���Z����ɓn���Ă��������B";
		mes "^FF0000�g�[��^000000�Z����̓M���h��";
		mes "�w���}���\��Jr.�̉��ɂ��܂��B";
		close;
	case 4:
		mes "[���C�E�O���O]";
		mes "^FF0000�W�F�C^000000�Z����̓M���h��";
		mes "�A���g�j�IJr.�̉��ɂ��܂��B";
		close;
	case 5:
		mes "[���C�E�O���O]";
		mes "^FF0000��������^000000�͉B�������ɂ��܂��B";
		close;
	case 6:
		mes "[���C�E�O���O]";
		mes "��p�̏K���ł����H";
		mes "^FF0000�g�[��^000000�Z����̏���";
		mes "�s���Ă��������B";
		close;
	case 7:
		mes "[���C�E�O���O]";
		mes "���A�ǂ����Ă����ɁH";
		mes "���͂��낤�낵���Ⴂ���܂����B";
		mes "����^FF0000�g�[��^000000�Z����̏���";
		mes "�߂��Ă��������B";
		close;
	case 8:
		mes "[���C�E�O���O]";
		mes "�����I�@�������ł��ˁI";
		mes "^FF0000�g�[��^000000�Z����̏���";
		mes "�����ƐF�X�b�𕷂���͂��ł��B";
		close;
	case 9:
		mes "[���C�E�O���O]";
		mes "�����A�����Ȃ�^FF0000��������^000000�̏���";
		mes "�s���Ă݂Ă��������B";
		mes "���͂܂�������K�����Ă��܂��񂵁B";
		close;
	default:
		mes "[���C�E�O���O]";
		mes "����A�������ł��ˁI";
		mes "�������Ȃ��̂悤�ɂȂ肽���ł��B";
		close;
	}
}

in_rogue,268,125,2	script	�g�[���E�O���O	84,{
	if(getskilllv(1005)) {
		mes "[�g�[���E�O���O]";
		mes "�`�F�e�N�x�l�ɂ͂����";
		mes "�G�s�\�[�h������B";
		mes "�w���H�@���̓`�F�e�N�x���B�M�l�́H�x";
		mes "�w���O�́A�t�@���I���H�x";
		mes "�����������Ɠ����ɍU�������炵���B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_RG) {
		mes "[�g�[���E�O���O]";
		mes "�X�i�b�`���[���o����";
		mes "�N�����U������΂����ۂ��";
		mes "�A�C�e�����҂���񂾂낤���A";
		mes "���ŉ��ɂ͂ł��Ȃ��񂾁c�c�B";
		close;
	}
	switch(SKILL_CLOSECONFINE) {
	case 0:
		mes "[�g�[���E�O���O]";
		mes "����A�e���͉��������ŕ������܂�";
		mes "�ǂ��ɍs�����񂾁H";
		mes "�M���h���̉B�ꕔ���ɍs�����̂��H";
		mes "���������B���P���₪��������";
		mes "�����֌W������̂��c�c";
		mes "�Ȃ�^FF0000�e��^000000���P�����񂾁H�@��p���H";
		set SKILL_CLOSECONFINE,1;
		close;
	case 1:
		mes "[�g�[���E�O���O]";
		mes "^FF0000�e��^000000�̓��[�O�M���h��";
		mes "�B�ꕔ���ɂ���Ǝv�����c�c�B";
		mes "�}�L�̘b�ł́A�}�L�̍����̕�����";
		mes "���̂ǂ����ɉB��Ă���炵���c�c�B";
		close;
	case 2:
		mes "[�g�[���E�O���O]";
		mes "^FF0000���C^000000�̓��[�O�M���h�̒���";
		mes "�z���O����Jr.�̉��ɂ���͂����B";
		close;
	case 3:
		mes "^0000FF-���C�E�O���O�̏����n����-^000000";
		next;
		mes "[�g�[���E�O���O]";
		mes "�N�\!!�@�����������̂��I";
		mes "����𑁂��Z�M�ɒm�点�Ȃ��ƁI";
		mes "���O�����̏����͂��Ă����΁A";
		mes "����ɏ����Ă���ʂ肨�O�ɂ�";
		mes "��p�������Ă��B";
		mes "�����痊�񂾂��B";
		next;
		mes "[�g�[���E�O���O]";
		mes "^FF0000�W�F�C^000000�Z�M�̓M���h��";
		mes "�A���g�j�IJr.�̉��ɂ��邩��";
		mes "���������͂��Ă���B";
		mes "^0000FF-�g�[���E�O���O�̏���l��-^000000";
		set SKILL_CLOSECONFINE,4;
		close;
	case 4:
		mes "[�g�[���E�O���O]";
		mes "^FF0000�W�F�C^000000�Z�M�̓M���h��";
		mes "�A���g�j�IJr.�̉��ɂ��邩��";
		mes "���������͂��Ă���B";
		close;
	case 5:
		mes "[�g�[���E�O���O]";
		mes "^FF0000�e��^000000�̓M���h�̉B�������ɂ���B";
		close;
	case 6:
		mes "[�g�[���E�O���O]";
		mes "�������A��p���K�����邽�߂�";
		mes "�����ƁH�@���\��ς����H";
		mes "^4D4DFF�N���[�Y�R���t�@�C��^000000�͂܂��A";
		mes "�����̊T�O���o���Ȃ���΂Ȃ��";
		mes "�ȒP�ł͂Ȃ��B�o�債���B";
		mes "�����𕷂����H";
		next;
		if(select("�͂��A�����Ă�������","�����͂���܂���")==1) {
			mes "[�g�[���E�O���O]";
			mes "��x���������������Ȃ�����";
			mes "�悭�����B";
			mes "���ꂩ��C����̒��ɓ����";
			mes "�N�����o�Ă���͂����B";
			mes "����������A������߂܂���B";
			next;
			mes "[�g�[���E�O���O]";
			mes "�߂܂���Ƃ������Ƃ́A";
			mes "�҂�����Ƃ��΂ɐڋ߂��Ȃ���";
			mes "�Ȃ�Ȃ��Ƃ������Ƃ��B";
			next;
			mes "[�g�[���E�O���O]";
			mes "�������畕���̏C�����n�܂�B";
			mes "�����̐g�������~�߂�񂾁B";
			mes "���A�E�A���ɓ����Ȃ���";
			mes "���O���瓦����̂�W�Q����B";
			mes "����A�s���Ă����B";
			close2;
		}
		warp "in_rogue",89,114;
		end;
	case 7:
		mes "[�g�[���E�O���O]";
		mes "�Ȃ��Ȃ���ς��낤�H";
		mes "�C�����ɍs�����H";
		next;
		if(select("�͂��A�s���܂�","������")==2) {
			mes "[�g�[���E�O���O]";
			mes "�܂��C�������C���o���";
			mes "���ɐ��������ĂȁB";
			close;
		}
		mes "[�g�[���E�O���O]";
		mes "��x���������������Ȃ�����";
		mes "�悭�����B";
		mes "���ꂩ��C����̒��ɓ����";
		mes "�N�����o�Ă���͂����B";
		mes "����������A������߂܂���B";
		next;
		mes "[�g�[���E�O���O]";
		mes "�߂܂���Ƃ������Ƃ́A";
		mes "�҂�����Ƃ��΂ɐڋ߂��Ȃ���";
		mes "�Ȃ�Ȃ��Ƃ������Ƃ��B";
		next;
		mes "[�g�[���E�O���O]";
		mes "�������畕���̏C�����n�܂�B";
		mes "�����̐g�������~�߂�񂾁B";
		mes "���A�E�A���ɓ����Ȃ���";
		mes "���O���瓦����̂�W�Q����B";
		mes "����A�s���Ă����B";
		set SKILL_CLOSECONFINE,6;
		close2;
		warp "in_rogue",89,114;
		end;
	case 8:
		mes "[�g�[���E�O���O]";
		mes "��邶��Ȃ����B";
		mes "�����K�������܂��Ƃ͂ȁB";
		mes "���߂łƂ��ƌ����Ă������B";
		mes "����A^FF0000�e��^000000�̏��ɍs���Ă݂ȁB";
		mes "��������΃X�L���̂��Ƃ�";
		mes "�ڂ��������邾�낤�B";
		set SKILL_CLOSECONFINE,9;
		close;
	case 9:
		mes "[�g�[���E�O���O]";
		mes "^FF0000�e��^000000�̏��ɍs����";
		mes "���������낤�H";
		close;
	default:
		mes "[�g�[���E�O���O]";
		mes "�ق��A��������苭��������ȁB";
		close;
	}
}

in_rogue,181,114,3	script	�W�F�C�E�O���O	85,{
	if(getskilllv(1005)) {
		mes "[�W�F�C�E�O���O]";
		mes "�`�F�e�N�x�l�̐��i�͖��S�C�c�c�B";
		mes "�����A���S�C�Ȃ񂾂�B";
		mes "�`�F�e�N�x�l�̖��S�C�Ȑ��i�c�c";
		mes "���ꂪ��p�𐶂ݏo�����񂾂낤�ȁI";
		mes "���񂤂�B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_RG) {
		mes "[�W�F�C�E�O���O]";
		mes "�N���[���X�L���͖l�B���[�O�ɂƂ���";
		mes "�ō��̃X�L�����I";
		mes "�l�̓N���[���X�L�����K�����Ă��邯��";
		mes "���ꂩ�����Ŏ����Ă݂����B";
		mes "�ǂ��H�@������Ɩl�̑����";
		mes "���Ă݂Ȃ������H�@�͂́c�c�B";
		close;
	}
	switch(SKILL_CLOSECONFINE) {
	case 0:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000�e��^000000��K�˂ė����̂����H";
		mes "�������̓z��̈ꖡ����Ȃ��������ˁB";
		mes "���ށA�ǂ������B";
		mes "^FF0000�e��^000000�͂����炩�瓦��邽��";
		mes "�M���h�̒��̉B��������";
		mes "�g���B���Ă���񂾁B";
		set SKILL_CLOSECONFINE,1;
		close;
	case 1:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000�e��^000000�͂����炩�瓦��邽��";
		mes "�M���h�̒��̉B��������";
		mes "�g���B���Ă���񂾁B";
		mes "�}�L�̍����̕����̂ǂ����Ɂc�c�B";
		close;
	case 2:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000���C^000000�͂�������Ȃ��A";
		mes "���[�O�M���h�̃z���O����Jr.��";
		mes "���ɂ����B";
		close;
	case 3:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000�g�[��^000000�̓M���h��";
		mes "�w���}���\��Jr.�̑��ɂ����B";
		close;
	case 4:
		mes "^0000FF-�g�[���E�O���O�̏����n����-^000000";
		next;
		mes "[�W�F�C�E�O���O]";
		mes "��͂肻���������̂��B";
		mes "�����M���h�ɂ��̂��Ƃ�m�点��";
		mes "^FF0000�e��^000000�ɂ������n���Ȃ���";
		mes "�܂����ȁB������d�����ށB";
		mes "^0000FF-�W�F�C�E�O���O�̏���l��-^000000";
		set SKILL_CLOSECONFINE,5;
		close;
	case 5:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000�e��^000000�ɂ������n���Ȃ���";
		mes "�܂����B������d�����ށB";
		mes "^FF0000�e��^000000�̓M���h�̒���";
		mes "�B�������ɂ����B";
		close;
	case 6:
		mes "[�W�F�C�E�O���O]";
		mes "�ւ��A��p�K���̋����󂯂��̂����B";
		mes "���߂łƂ��B";
		mes "�����A������͖̂l����Ȃ��B";
		mes "^FF0000�g�[��^000000�̏��ɍs���Ă݂ȁB";
		close;
	case 7:
		mes "[�W�F�C�E�O���O]";
		mes "�r���Ŏ��s�����̂����H";
		mes "�܂��C�����󂯂�̂Ȃ�";
		mes "^FF0000�g�[��^000000�̏��ɍs���Ă݂ȁB";
		close;
	case 8:
		mes "[�W�F�C�E�O���O]";
		mes "���`����������Ȃ����B";
		mes "�l�ɐ�ɐ��������Ă����Ƃ�";
		mes "�������˂��B";
		mes "���A^FF0000�g�[��^000000�̏��ɂ��s���Ȃ�B";
		close;
	case 9:
		mes "[�W�F�C�E�O���O]";
		mes "^FF0000�e��^000000�ɃX�L���ɂ���";
		mes "�ڂ��������𕷂��Ƃ�����B";
		close;
	default:
		mes "[�W�F�C�E�O���O]";
		mes "�L�~�����[�O�B�̊�]�ɂȂ邱�Ƃ�";
		mes "�M���Ă����B";
		close;
	}
}

in_rogue,88,119,3	script	�ҋ@���S��#rogue10	828,{
	end;
OnInit:
	waitingroom "�C����",10,"�ҋ@���S��#rogue10::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	warpwaitingpc "prt_are01",150,150;
	end;
}

prt_are01,150,150,0	script	#Recognition1st	139,10,10,{
	initnpctimer "#Fiveminute1st";
	initnpctimer "#Moving1st";
	hideonnpc;
	end;
}

prt_are01,135,135,0	script	#Fiveminute1st	-1,{
OnTimer1000:
	announce "������͕����Z�p�̏C����ł��B���ꂵ�Ă���5����ɊO�ֈړ����܂��B",0x09,0x00FF00;
	end;
OnTimer290000:
	announce "20�b��ɊO�ֈړ����܂��B",0x09,0x00FF00;
	end;
OnTimer310000:
	announce "5�b��ɊO�ֈړ����܂��B",0x09,0x00FF00;
	end;
OnTimer315000:
	announce "�O�ֈړ����܂��B",0x09,0x00FF00;
	for(set .@i,1; .@i <= 8; set .@i,.@i+1)
		hideonnpc "�L�G�i#" +.@i;
	stopnpctimer "#Moving1st";
	hideoffnpc "#Recognition1st";
	enablewaitingroomevent "�ҋ@���S��#rogue10";
	stopnpctimer;
	mapwarp "prt_are01","in_rogue",264,124;
	end;
}

prt_are01,135,135,0	script	#Moving1st	-1,{
OnTimer3000:
	announce "1�b��ɃL�G�i���o�ꂵ�܂��B�L�G�i��߂܂��Ă��������B",0x09,0x00FF00;
	end;
OnTimer5000:
	hideoffnpc "�L�G�i#" +rand(1,8);
	end;
OnTimer8000:
	for(set .@i,1; .@i <= 8; set .@i,.@i+1)
		hideonnpc "�L�G�i#" +.@i;
	end;
OnTimer9000:
	initnpctimer;
	mapwarp "prt_are01","prt_are01",150,150;
	end;
}

prt_are01,149,162,0	script	�L�G�i#1	700,1,1,{
	end;
OnInit:
	hideonnpc;
	end;
OnTouch:
	switch(SKILL_CLOSECONFINE) {
	case 6:
		stopnpctimer "#Moving1st";
		mes "[�L�G�i]";
		mes "����҂͎��̈ړ�������";
		mes "�\�����āA����������";
		mes "�w�肵�Ă��������B";
		set SKILL_CLOSECONFINE,7;
		set .@suc,0;
		next;
		for(set .@lim,0; .@lim < 10; set .@lim,.@lim+1) {
			menu "���ړ�����",-,"�E�ړ�����",-,"����ړ�����",-;
			mes "[�L�G�i]";
			if(rand(3))
				mes "�������s";
			else {
				mes "��������!!!";
				misceffect 204;
				misceffect 210,"";
				set .@suc,.@suc+1;
			}
			next;
		}
		mes "[�L�G�i]";
		mes "---�C���I��---";
		mes "-���Ȃ��̃����N��-";
		switch(.@suc) {
			case 10: mes "------ S ------"; break;
			case 9: mes "------ A ------"; break;
			case 8: mes "------ B+ -----"; break;
			case 7: mes "------ B ------"; break;
			case 6: mes "------ C+ -----"; break;
			case 5: mes "------ C ------"; break;
			case 4: mes "------ D+ -----"; break;
			case 3: mes "------ D ------"; break;
			case 2:
			case 1: mes "------ F ------"; break;
			case 0: mes "---����s��---"; break;
		}
		next;
		if(.@suc > 5) {
			mes "[�L�G�i]";
			mes "�����l�ł����B";
			mes "���Ȃ��̓X�L�����K������";
			mes "�������\���Ɏ����Ă��܂��B";
			mes "�g�[���E�O���O�̂���ꏊ��";
			mes "�]�����Ă��������܂��B";
			set SKILL_CLOSECONFINE,8;
			close2;
			hideonnpc;
			stopnpctimer "#Fiveminute1st";
			hideoffnpc "#Recognition1st";
			enablewaitingroomevent "�ҋ@���S��#rogue10";
			warp "in_rogue",264,124;
			end;
		}
		mes "[�L�G�i]";
		mes "�܂����n�ł��ˁB";
		mes "�X�L���K���̂��߂�";
		mes "�Ē�������܂����H";
		next;
		if(select("�͂��A�Ē��킵�܂�!!","�������A��߂܂�")==1) {
			hideonnpc;
			initnpctimer "#Moving1st";
			set SKILL_CLOSECONFINE,6;
			warp "prt_are01",150,150;
			end;
		}
		hideonnpc;
		stopnpctimer "#Fiveminute1st";
		hideoffnpc "#Recognition1st";
		set SKILL_CLOSECONFINE,6;
		enablewaitingroomevent "�ҋ@���S��#rogue10";
		warp "in_rogue",264,124;
		end;
	case 7:
		mes "[�L�G�i]";
		mes "�C���𒆒f���ꂽ�̂ł��ˁB";
		mes "�ł́A�܂��ŏ�����";
		mes "�J�n���Ȃ���΂Ȃ�܂���B";
		set SKILL_CLOSECONFINE,6;
		close2;
		hideonnpc;
		initnpctimer "#Moving1st";
		warp "prt_are01",150,150;
		end;
	case 8:
		mes "[�L�G�i]";
		mes "���Ȃ��͏C�����I���Ă��܂��B";
		mes "�g�[���E�O���O�̂���ꏊ��";
		mes "�]�����Ă��������܂��B";
		close2;
		hideonnpc;
		stopnpctimer "#Fiveminute1st";
		hideoffnpc "#Recognition1st";
		enablewaitingroomevent "�ҋ@���S��#rogue10";
		warp "in_rogue",264,124;
		end;
	default:
		mes "[�L�G�i]";
		mes "�����ɓ����Ă��Ă͂����܂���B";
		close2;
		hideonnpc;
		stopnpctimer "#Fiveminute1st";
		hideoffnpc "#Recognition1st";
		enablewaitingroomevent "�ҋ@���S��#rogue10";
		warp "in_rogue",264,124;
		end;
	}
}
prt_are01,136,150,0	duplicate(�L�G�i#1)	�L�G�i#2	700,1,1
prt_are01,150,138,0	duplicate(�L�G�i#1)	�L�G�i#3	700,1,1
prt_are01,163,147,0	duplicate(�L�G�i#1)	�L�G�i#4	700,1,1
prt_are01,134,140,0	duplicate(�L�G�i#1)	�L�G�i#5	700,1,1
prt_are01,161,140,0	duplicate(�L�G�i#1)	�L�G�i#6	700,1,1
prt_are01,161,160,0	duplicate(�L�G�i#1)	�L�G�i#7	700,1,1
prt_are01,138,159,0	duplicate(�L�G�i#1)	�L�G�i#8	700,1,1

in_rogue,359,177,0	script	#Assassin01	-1,{
OnTimer1000:
	hideoffnpc "�h�q#rogue";
	end;
OnTimer120000:
	hideonnpc "�h�q#rogue";
	stopnpctimer;
	end;
}

in_rogue,357,174,2	script	�h�q#rogue	705,1,1,{
	end;
OnTouch:
	switch(SKILL_CLOSECONFINE) {
	case 10:
		misceffect 174,"";
		misceffect 175;
		misceffect 348,"";
		set SKILL_CLOSECONFINE,11;
		mes "[�h�q]";
		mes "�c�c";
		mes "���c�c���c�c���c�c�Ȃ��c�c�B";
		mes "�Ȃ�c�c���c�c�B";
		next;
		mes "[�n�C�W�����E�O���O]";
		mes "�������I�@���̔�p���N������";
		mes "�_���Ă���";
		mes "^4D4DFF�N���[�Y�R���t�@�C��^000000��!!";
		next;
		mes "[�n�C�W�����E�O���O]";
		mes "�u�h�q�v�̍��ړ��͔�!!!";
		mes "�u�h�q�v�̉E�ړ��͉�!!!";
		mes "�u�h�q�v�̌���ړ��͐�!!!";
		mes "�̃I�[����������͂��B";
		mes "���O��^4D4DFF�N���[�Y�R���t�@�C��^000000�͊������I";
		mes "�ނ����p�������߂��Ă���B";
		next;
		setarray .@effect,174,175,177;
		for(set .@lim,0; .@lim < 10; set .@lim,.@lim+1) {
			set .@move,rand(1,3);
			misceffect .@effect[.@move-1];
			if(select("���ړ�����","�E�ړ�����","����ړ�����")==.@move) {
				mes "��������!!!";
				misceffect 204;
				misceffect 210,"";
			}
			else
				mes "�������s";
			next;
		}
		mes "[�h�q]";
		mes "���c�c��c�c�B";
		mes "^0000FF�`�F�e�N�x�̔�p���l��-^000000";
		close2;
		hideonnpc;
		stopnpctimer "#Assassin01";
		end;
	case 11:
		mes "[�h�q]";
		mes "���c�c��c�c�B";
		mes "�N�D�c�c�B";
		close2;
		hideonnpc;
		stopnpctimer "#Assassin01";
		end;
	default:
		end;
	}
OnInit:
	hideonnpc;
	end;
}


//-----------------------------------------------
//==== �T�C�g�u���X�^�[ - WZ_SIGHTBLASTER
//	�� SKILL_SIGHTBLASTER   -> 0�`3
//-----------------------------------------------
gef_tower,115,36,4	script	�j���I	876,{
	if(getskilllv(1006)) {
		mes "[�j���I]";
		mes "Zzz�c�cZzz�c�c";
		mes "�E�[���c�c���j���c�c";
		mes "�J�g���[�k�c�c���ɂ݂ĂȂ����c�c";
		close;
	}
	switch(SKILL_SIGHTBLASTER) {
	case 0:
		mes "[�j���I]";
		mes "�E�[���c�c�����c�c";
		mes "���j�����j���c�c";
		next;
		mes "[�j���I]";
		mes "�����̂Ɂc�c";
		mes "���ɉ����p�ł�����́H";
		next;
		if(select("�����ɂȂ��L���H","���������c�c")==1) {
			mes "[�j���I]";
			mes "����c�c�L�c�c�H";
			mes "�������c�c���͔L��������ˁc�c";
			mes "�A�n�n�n�n�n�b!!";
			next;
			mes "[�j���I]";
			mes "�J�g���[�k�߁c�c������Ƒ������΂�";
			mes "����Ŏg�������x�Ŏ���L��";
			mes "�ς��Ă����g���Ȃ�āI";
			mes "���[�c�c�l���������ł���������I";
			next;
			mes "[�j���I]";
			mes "�����l�Ԃɖ߂�����݂ĂȂ����I";
			mes "����L�ɂ����J�g���[�k�͂������A";
			mes "�L�ƌĂ񂾎ҒB���F�L�ɂ��Ă���I";
			next;
			mes "[�j���I]";
			mes "���O����I";
			close;
		}
		mes "[�j���I]";
		mes "�����̂ɂȂ����ɐ����|����́H";
		mes "����������薰�낤�Ƃ��Ă�񂾂���A";
		mes "�ז����Ȃ��ŉƂ֋A���ĐQ�Ȃ����I";
		if(getbaseclass(Class,2) != CLASS_WZ)
			close;
		next;
		mes "[�j���I]";
		mes "�c�c�c�c";
		next;
		mes "[�j���I]";
		mes "�c�c�����Ă������͕�����Ȃ���������";
		mes "�悭�����炨�O�̓E�B�U�[�h�̂悤�ˁB";
		mes "���傤�ǂ�����B";
		mes "�E�B�U�[�h�B�ׂ̈ɐV���ɕ҂ݏo���ꂽ";
		mes "�X�L�������邯�ǁc�c";
		mes "�o���Ă݂�H";
		next;
		if(select("�o����̂��ʓ|�c�c�Q�܂�","�ǂ�ȃX�L���ł����H")==1) {
			mes "[�j���I]";
			mes "�������������Ă����悤�Ƃ����̂Ɂc�c";
			mes "�ʓ|�Ȃ瑧�����Ȃ���΂�������Ȃ��H";
			mes "���ׂ̈ɐ����Ă�́H";
			mes "���������Ă��������Ă���Ȏ�";
			mes "�����Ă�Ǝv���Ă�H";
			next;
			mes "[�j���I]";
			mes "�ӂ��c�c";
			mes "�J�g���[�k�����O���c�c";
			mes "�F�匙���I";
			close;
		}
		mes "[�j���I]";
		mes "���̕҂ݏo�����X�L������Ȃ����ǂˁB";
		mes "�J�g���[�k���V���ɕ҂ݏo�����X�L����";
		mes "�E�B�U�[�h�B�ɋ����Ȃ���΁A";
		mes "�����i���ɔL�ɂ��Ă����Ƌ����Ă���";
		mes "����ˁc�c�͂��c�c�B";
		next;
		mes "[�j���I]";
		mes "���������΃J�g���[�k�̉��ɂ���";
		mes "�}���A���A�O�X����l�ԂɂȂ�Ƃ�";
		mes "�����Ă邯�ǂ܂����̂܂܂̂悤�ˁB";
		mes "�J�g���[�k�̌��t��M�p���Ă��{����";
		mes "�ǂ��̂�����ˁc�c�B";
		next;
		mes "[�j���I]";
		mes "�]�v�Șb�������Ȃ�����ˁB";
		mes "�Ƃɂ����ǂ�ȃX�L�����������邩��A";
		mes "�Ƃ肠�����������蕷���āB";
		next;
		mes "[�j���I]";
		mes "�E�B�U�[�h�B�̋��͂Ȗ��@�͉�������";
		mes "�G���U�����鎖���ł��邯�ǁA";
		mes "�}�ɓG���߂��ɏo�����Đڋ߂����ƁA";
		mes "���̐E�Ƃɔ�ׂĐڋߐ�Ɏア";
		mes "�E�B�U�[�h�͌�������B";
		next;
		mes "[�j���I]";
		mes "���ꂩ�玄��������X�L���͂����";
		mes "�₤���߂ɕ҂ݏo���ꂽ�X�L����B";
		next;
		mes "[�j���I]";
		mes "�X�L�����g�p������A";
		mes "��莞�Ԗ��@�̉���������";
		mes "���ӂ���肾���́B";
		next;
		mes "[�j���I]";
		mes "���̊ԋ}�ɓG���o�����ďP���Ă��Ă��A";
		mes "�ߊ��ꂽ�u�ԂɎ��̖͂��@��";
		mes "�����G�������e����΂��āA";
		mes "�_���[�W��^����́B";
		next;
		mes "[�j���I]";
		mes "�ǂ��H�@�Ƃ����̎��Ԃ���̒E�o��";
		mes "�ƂĂ��֗����Ǝv��Ȃ��H";
		next;
		menu "�����ł��ˁB�Ƃ���Œe����΂��Ƃ́H",-;
		mes "[�j���I]";
		mes "���[��c�c���t�ʂ莩�g�ɋ߂Â����G��";
		mes "��苗���e����΂��Ƃ������ˁB";
		mes "����͌����̂͊ȒP�ł�����Ă݂��";
		mes "���Ȃ����Z�p��B";
		mes "�e����΂��Z�p�̌������킩��Ȃ����";
		mes "�X�L�����o���Ă��g���Ȃ��ł��傤�B";
		next;
		mes "[�j���I]";
		mes "���O�͂���Ȏ�ނ̃X�L�����g��������";
		mes "�Ȃ����猴���͕�����Ȃ��ł��傤�B";
		mes "�ł��A���̐E�ƒB�c�c���Ƀi�C�g��";
		mes "���̋Z�p���悭�g������A�ޓ��ɕ�����";
		mes "�����Ă���邩������Ȃ���ˁc�c�B";
		next;
		mes "[�j���I]";
		mes "�v�����e��11�������ɂ���";
		mes "�R�m�c�ɍs���Ă݂Ȃ����B";
		mes "�����Œe����΂��Z�p�̌������w��ŁA";
		mes "���ꂩ�������x���ɉ�ɗ��Ȃ����B";
		set SKILL_SIGHTBLASTER,1;
		close;
	case 1:
		mes "[�j���I]";
		mes "�������Ă�́H";
		mes "�v�����e���̋R�m�c�Œe����΂��Z�p��";
		mes "�������w��ŗ��Ȃ����ƌ������ł���I";
		close;
	case 2:
		mes "[�j���I]";
		mes "�e����΂��Z�p�̌�����";
		mes "�w��ŗ����݂����ˁB";
		mes "���Ⴀ�{�i�I�ɃX�L����������";
		mes "������c�c�Ƃł������Ǝv�����H";
		next;
		mes "[�j���I]";
		mes "���Ɨ��𕥂��Ȃ����I���Ɨ����I";
		mes "�{�����e�B�A����Ȃ����I";
		next;
		mes "[�j���I]";
		mes "�����J�g���[�k�̑������΂���������";
		mes "����Ŏg���s����������A";
		mes "�������΂������ɂ͂Ȃ��̂�B";
		mes "�����瑮�����΂������Ă��Ă����΁A";
		mes "���Ɨ����o�������ɂ��Ă�����B";
		next;
		mes "[�j���I]";
		mes "^FF0000�N���X�^���u���[10��";
		mes "�C�G���[���C�u10��";
		mes "���b�h�u���b�h10��";
		mes "�E�B���h�I�u���F���f���[��10��^000000";
		next;
		mes "[�j���I]";
		mes "���ꂾ���W�߂Ď����Ă��Ȃ����B";
		mes "���܂����͂Ȃ��ł��傤�H";
		mes "�������萔�𑵂��Ď����Ă��ĂˁB";
		mes "���͈ꖰ�肵�Ă��邩��c�c�ӂ��c�c�B";
		set SKILL_SIGHTBLASTER,3;
		close;
	case 3:
		if(countitem(991) < 10 || countitem(993) < 10 || countitem(990) < 10 || countitem(992) < 10) {
			mes "[�j���I]";
			mes "�ӂ��c�c���H�@�܂��W�߂ĂȂ��́H";
			mes "���������Ă���̂��Y�ꂽ�H";
			mes "���Ⴀ������x���������Ă�����B";
			next;
			mes "[�j���I]";
			mes "^FF0000�N���X�^���u���[10��";
			mes "�C�G���[���C�u10��";
			mes "���b�h�u���b�h10��";
			mes "�E�B���h�I�u���F���f���[��10��^000000";
			next;
			mes "[�j���I]";
			mes "���ꂾ���W�߂Ď����Ă��Ȃ����B";
			mes "�S�đ����܂ł͋N�����Ȃ��ŁI";
			close;
		}
		mes "[�j���I]";
		mes "�ӂ��c�c������c�c�N�H";
		mes "���[��c�c�����c�c�������΂͑S��";
		mes "�����Ă����H";
		next;
		mes "[�j���I]";
		mes "�w���ɒS���ŗ����悤�ˁB";
		mes "���Ⴀ�A������Ɗm���߂��B";
		next;
		mes "[�j���I]";
		mes "��A��A�O�A�l�c�c";
		next;
		mes "[�j���I]";
		mes "���[�c�c������̖ʓ|�ˁB";
		mes "�������������Ă邩�炢����B";
		mes "���Ⴀ�X�L�����������ˁB";
		mes "�X�L���̖��O�́w^FF0000�T�C�g�u���X�^�[^000000�x";
		mes "�Ȃ��Ȃ��������O���Ǝv��Ȃ��H";
		next;
		mes "[�j���I]";
		mes "���̖��@�͉Α�����������";
		mes "�Α������@��g�ɓZ��Ȃ��Ƃ��߂�B";
		mes "���O���E�B�U�[�h�����炻�̒��x��";
		mes "����Ȃ��ł��傤�H";
		mes "��x����Ă݂Ȃ����B";
		next;
		misceffect 183,"";
		mes "-�|�|�|��!!�@�|��!!-";
		next;
		mes "[�j���I]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		mes "[�j���I]";
		mes "���O�{���ɃE�B�U�[�h�Ȃ́H";
		mes "�c�c�܂����̕����͗��K��";
		mes "�g�ɒ�����Ηǂ���ˁB";
		mes "���Ⴀ���́c�c�c�c";
		next;
		mes "-��T�ԃj���I�̌��������P���󂯂�-";
		mes "-" +strcharinfo(0)+ "�͂悤�₭";
		mes "^FF0000�T�C�g�u���X�^�[^000000���g����悤�ɂȂ���-";
		misceffect 253,"";
		delitem 991,10;
		delitem 993,10;
		delitem 990,10;
		delitem 992,10;
		set SKILL_SIGHTBLASTER,0;
		skill 1006,1,0;
		next;
		mes "[�j���I]";
		mes "�ӂ��c�c��T�Ԃ����l�B";
		mes "���O�̂悤�ɍ˔\�̂Ȃ�";
		mes "�E�B�U�[�h�ɂ͏��߂ĉ������B";
		mes "�Ƃɂ����X�L���͂�������������A";
		mes "����������ׂ����͂Ȃ���ˁB";
		next;
		mes "[�j���I]";
		mes "����Ȏg���������āA�����������";
		mes "���̖��O�ɓD��h��Ȃ��悤�ɁB";
		mes "��J���ċ������񂾂���";
		mes "���܂��g���Ȃ����B";
		next;
		mes "[�j���I]";
		mes "��T�Ԃ������Ɨ͂��g���Ă�����";
		mes "���Ă��傤���Ȃ���B";
		mes "���͂����Q����I";
		close;
	}
}

prt_in,82,98,3	script	�Z�C�������C���X	46,{
	if(SKILL_SIGHTBLASTER != 1) {
		mes "[�Z�C����]";
		mes "����ς�킢�͌��ł��Ȃ��ƂȁI";
		close;
	}
	mes "[�Z�C����]";
	mes "�Ⴂ�E�B�U�[�h�����B�̋R�m�c��";
	mes "���̗p���ŗ����̂��ȁH";
	next;
	if(select("���ł��Ȃ��ł�","�e����΂��Z�p�̌������w�тɗ��܂���")==1) {
		mes "[�Z�C����]";
		mes "���O�̑̊i�Ȃ�R�m�ɂȂ��Ă�";
		mes "�ǂ������̂Ɂc�c����ς�";
		mes "�킢�͌��ł��Ȃ��ƂȁI";
		close;
	}
	mes "[�Z�C����]";
	mes "�e����΂��Z�p�̌����H�@�n�n�n�b�I";
	mes "�E�B�U�[�h�������m���Ăǂ�����H";
	mes "���O�͉΂̏�ǂ݂����Ȗ��@��";
	mes "�G�̐ڋ߂�h������A�ォ��~�炷";
	mes "�΂̉J�Ńp�p�p�p�b�I�@�Ă����";
	mes "�����񂶂�Ȃ��̂��H";
	next;
	menu "�������g�̐g�������@��m��ׂł�",-;
	mes "[�Z�C����]";
	mes "�ӂށc�c���������ΌN�̐E�Ƃ�";
	mes "�ڋߐ�Ɏア�E������A";
	mes "�G�ɋߊ��ꂽ��e����΂�";
	mes "�Ƃ����̂͌��ʓI���ȁB";
	mes "�悵�I�����Ă�낤�I";
	next;
	mes "[�Z�C����]";
	mes "�łƂ������ƒe����΂��Ƃ�������";
	mes "�Ⴄ���̂��B";
	mes "�łƂ������͑������x�ŕ��̂�";
	mes "�Ō��������A���̏u�Ԃ̔j��͂�";
	mes "�G��|���B";
	next;
	mes "[�Z�C����]";
	mes "�Ō�����������ɂ͑f�������̎p����";
	mes "�߂��āA���̍U�����邢�͖h���";
	mes "������̂���{���B";
	next;
	mes "[�Z�C����]";
	mes "�G��e����΂��U���������";
	mes "�������Ă��邪�Ⴄ�B";
	next;
	mes "[�Z�C����]";
	mes "�e����΂��U�����łU���Ɠ������A";
	mes "�������x�ŕ��̂ɑŌ��������āA";
	mes "�u�Ԃ̔j��͂��グ��B";
	next;
	mes "[�Z�C����]";
	mes "�������łU���ƈႢ�A���̌��";
	mes "��肵���͂������Ɖ����鎖�ŁA";
	mes "�G�����ɒe����΂��悤�ɂ��鎖���B";
	next;
	mes "[�Z�C����]";
	mes "�������e����΂����̗͂͑łu��";
	mes "��������邩��A���̎����̗͂�";
	mes "����������̂��|�C���g���B";
	next;
	mes "[�Z�C����]";
	mes "�����Ă�����A�d�v�Ȏ��͒e����΂�";
	mes "�u�Ԃǂ��̕����ɑł�����ł��邩���B";
	mes "���܂��̕��ɑł����ނƁA";
	mes "�G�̒e����΂���鋗���������āA";
	mes "�t�ɉ��̕��ɑł����ނƁA";
	mes "�G�͑O�ɓ|���B";
	next;
	mes "[�Z�C����]";
	mes "��ԗǂ������͂���ς蒆�S���I";
	mes "�G�̒��S�����ɍU������������A";
	mes "���̗͂�����������ΓG�͌���";
	mes "�e����΂����Ƃ��������B";
	next;
	mes "[�Z�C����]";
	mes "���ꂪ�e����΂��Z�p�̌������B";
	mes "���̒��x�ŏ\���Ȑ������낤�B";
	next;
	mes "[�Z�C����]";
	mes "�����ƕ����������͂��邩�H";
	mes "�e����΂��Z�p�̌����Ȃ�";
	mes "���̒��x�ŏ\�����B";
	mes "������ǂ����p���邩�͂��O���悾�B";
	set SKILL_SIGHTBLASTER,2;
	close;
}


//-----------------------------------------------
//==== �N���G�C�g�R���o�[�^�[ - SA_CREATECON
//==== �G�������^���`�F���W - SA_ELEMENT
//	�� SKILL_ELEMENT   -> 0�`6
//-----------------------------------------------
yuno_in03,176,24,3	script	�~�V���i	755,{
	if(getskilllv(1018) || getskilllv(1017) || getskilllv(1019) || getskilllv(1008)) {
		mes "[�~�V���i]";
		mes "�V�����m�����܂��K���Ă��Ȃ��Z�[�W��";
		mes "�g�߂ɂ�������������A����K��";
		mes "�K�₷��悤�ɂƌ����`���ĉ������B";
		mes "���̑O�����������m�����F�l��";
		mes "�o���Ă������������̂ł��B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_SA) {
		mes "[�~�V���i]";
		mes "����ɂ��́B";
		mes "���̓V���o�C�`�F�����@�A�J�f�~�[";
		mes "�����̃Z�[�W�A�~�V���i�Ɛ\���܂��B";
		mes "���Ȃ��͂��������ăZ�[�W�ł�";
		mes "�Ȃ��ł��傤���H";
		next;
		mes "[�~�V���i]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�~�V���i]";
		mes "�����c�c�Ⴄ�݂����ł��ˁB";
		mes "�\���󂠂�܂���B";
		mes "���A�����œ����o�����΂���̐V�l�ŁA";
		mes "�ْ����Ď��s���Ă��܂��܂��c�c�B";
		next;
		mes "[�~�V���i]";
		mes "�������Ȃ��̐g�߂ɃZ�[�W�̕���";
		mes "��������������A";
		mes "�V���o�C�`�F�����@�A�J�f�~�[������";
		mes "�Z�[�W�A�~�V���i���{���Ă�����";
		mes "�`���Ă��������܂����H";
		next;
		mes "[�~�V���i]";
		mes "�{���Ɏ��炵�܂����B";
		mes "����ł͗ǂ�������I";
		close;
	}
	switch(SKILL_ELEMENT) {
	case 0:
		mes "[�~�V���i]";
		mes "����ɂ��́B";
		mes "���̓V���o�C�`�F�����@�A�J�f�~�[";
		mes "�����̃Z�[�W�A�~�V���i�Ɛ\���܂��B";
		mes "�ǂ̂悤�Ȃ��p����";
		mes "��������Ⴂ�܂������H";
		next;
		menu "�V�����m���𓾂�ׂɗ��܂���",-;
		mes "[�~�V���i]";
		mes "�����A�Z�[�W" +strcharinfo(0)+ "�l";
		mes "�ł��ˁH�@�������Ȃ���T���Ă܂����B";
		mes "�ߋ��Ɏ���ꂽ�匫�҃o�������g��";
		mes "�m�����A�����ł����A�J�f�~�[��";
		mes "�������ꂽ�̂ŁA�Z�[�W�̕��X��";
		mes "���̐V�����m����`���Ă���̂ł��B";
		next;
		mes "[�~�V���i]";
		mes "�V���ɔ������ꂽ�m����";
		mes "�΁A�n�A���A����4�呮����";
		mes "�W���X�L���ł��B";
		next;
		mes "[�~�V���i]";
		mes "�����X�^�[�̑�����4�呮���ɕϊ�����";
		mes "^FF0000�G�������^���`�F���W^000000�Ƃ�����g���ׂ�";
		mes "�K�v�ȃG�������^���R���o�[�^�[��";
		mes "��������^FF0000�N���G�C�g�R���o�[�^�[^000000��";
		mes "����ɂ�����܂��B";
		next;
		mes "[�~�V���i]";
		mes "�ߋ��ɗb���̔����������N���������A";
		mes "�匫�҃o�������g�̓@��R���Ă��܂�";
		mes "�����̒m�����Ď����Ă��܂��܂����B";
		mes "���ꂾ���ł��������ꂽ�̂́A";
		mes "�{���ɍK�����Ǝv���܂��B";
		next;
		mes "[�~�V���i]";
		mes "�ł́A�V�����m�����w�ԏ�����";
		mes "�ł��܂������H";
		next;
		if(select("���͖Z�����̂ł܂��ɂ��܂�","�����V�����m���������ĉ�����")==1){
			mes "[�~�V���i]";
			mes "���c�c�ǂ���獡�͑��̎���";
			mes "�Z�����悤�ł��ˁB";
			mes "�������ł����炢�ł�����";
			mes "���������Ă���������Ό��\�ł��B";
			mes "����ł͗ǂ�������I";
			close;
		}
		mes "[�~�V���i]";
		mes "�܂��ŏ��Ɋw�΂Ȃ��Ă͂Ȃ�Ȃ��̂́A";
		mes "^FF0000�G�������^���`�F���W^000000���g���ׂ�";
		mes "�K�v�ȁA�G�������^���R���o�[�^�[��";
		mes "��������^FF0000�N���G�C�g�R���o�[�^�[^000000�ł��B";
		mes "�R���o�[�^�[���X�L���g�p�ɕK�{�Ȃ̂�";
		mes "������Ɋw�ԕK�v������܂��B";
		next;
		mes "[�~�V���i]";
		mes "�G�������^���R���o�[�^�[��";
		mes "��������ׂɂ́A�ȉ��̍ޗ���";
		mes "�K�v�ł��B";
		next;
		mes "[�~�V���i]";
		mes "^FF0000�T�\���̐K��10��";
		mes "�d���p7��";
		mes "�ؗ��峂̔�12��";
		mes "�J�^�V�����̔�10��";
		mes "�����̃X�N���[��4��^000000";
		next;
		mes "[�~�V���i]";
		mes "���̍ޗ����W�߂Ď����ė��ĉ������B";
		mes "�R���o�[�^�[�����ɕK�v�ȍޗ��Ȃ̂ŁA";
		mes "�K���S�ďW�߂Ď���K�˂ĉ������B";
		mes "�������g���āA�R���o�[�^�[�̓y���";
		mes "�쐬���܂��̂ŁA�W�߂Ă�����X�L����";
		mes "���������܂��ˁB";
		set SKILL_ELEMENT,1;
		close;
	case 1:
		if(countitem(904) < 10 || countitem(947) < 7 || countitem(1013) < 12 || countitem(946) < 10 || countitem(7433) < 4){
			mes "[�~�V���i]";
			mes "�܂��ޗ����W�܂��Ă��Ȃ��悤�ł��ˁB";
			mes "������x�K�v�ȍޗ������������܂��B";
			next;
			mes "[�~�V���i]";
			mes "^FF0000�T�\���̐K��10��";
			mes "�d���p7��";
			mes "�ؗ��峂̔�12��";
			mes "�J�^�V�����̔�10��";
			mes "�����̃X�N���[��4��^000000";
			next;
			mes "[�~�V���i]";
			mes "���̍ޗ����W�߂Ď��Ɏ����Ă���΁A";
			mes "^FF0000�N���G�C�g�R���o�[�^�[^000000��";
			mes "���������܂��B";
			close;
		}
		mes "[�~�V���i]";
		mes "�S���W�߂Ă��܂����ˁB";
		mes "����J�l�ł��B";
		mes "����ł͂��ꂩ��X�L����";
		mes "���������܂��B";
		next;
		mes "[�~�V���i]";
		mes "�������������܂������A";
		mes "�G�������^���R���o�[�^�[�́A";
		mes "�������ė����ޗ���";
		mes "�y����쐬���܂��B";
		next;
		mes "[�~�V���i]";
		mes "�ޗ��𑵂��ĕ��@��������ΒN�ł�";
		mes "���邩�H�@�Ƃ����Ƃ����ł͂Ȃ��A";
		mes "�����ŕK�v�Ȃ̂��Z�[�W�ŗL��";
		mes "�����t�^�X�L���Ȃ̂ł��B";
		next;
		mes "[�~�V���i]";
		mes "�t�@�C�A�[�G�������^���R���o�[�^�[��";
		mes "^FF0000�t���C�������`���[^000000���K�v�ŁA";
		mes "�A�[�X�G�������^���R���o�[�^�[��";
		mes "^FF0000�T�C�Y�~�b�N�E�F�|��^000000���K�v�ł��B";
		next;
		mes "[�~�V���i]";
		mes "�����悤�ɁA";
		mes "�E�B���h�G�������^���R���o�[�^�[��";
		mes "^FF0000���C�g�j���O���[�_�[^000000���K�v�ŁA";
		mes "�E�H�[�^�[�G�������^���R���o�[�^�[��";
		mes "^FF0000�t���X�g�E�F�|��^000000���K�v�ł��B";
		next;
		mes "[�~�V���i]";
		mes "�����āA�X�L�����g�p���Ă��m����";
		mes "���������킯�ł͂���܂���B";
		mes "�����Ɏ��s���čޗ�����������";
		mes "�\��������܂��B";
		mes "���̐������͑����t�^�X�L���̃��x����";
		mes "���Ȃ��̔\�͂Ō��܂�܂��B";
		next;
		mes "[�~�V���i]";
		mes "�����A���ꂪ�匫�҃o�������g��";
		mes "�c�����m���ł��B";
		mes "�����ǂ�ŃX�L�����K�����ĉ������B";
		next;
		mes "-�匫�҃o�������g���c�����Ƃ���-";
		mes "-�p�����̎ʖ{��ǂ�ŁA-";
		mes "-^FF0000�N���G�C�g�R���o�[�^�[^000000���o����-";
		misceffect 253,"";
		delitem 904,10;
		delitem 947,7;
		delitem 1013,12;
		delitem 946,10;
		delitem 7433,4;
		set SKILL_ELEMENT,2;
		skill 1007,1,0;
		next;
		mes "[�~�V���i]";
		mes "�{���ɐ������x�Ŋo���܂����ˁI";
		mes "�ƂĂ������Ɖ\�̃Z�[�W";
		mes strcharinfo(0)+ "�l��";
		mes "���͉͂\�ʂ�ł��ˁI";
		next;
		mes "[�~�V���i]";
		mes "�c��X�L���̓R���o�[�^�[���g���āA";
		mes "�����X�^�[�̑�����ς���";
		mes "^FF0000�G�������^���`�F���W^000000�ł��B";
		mes "�����̊ԁA���͐H�������Ă��܂��̂ŁA";
		mes "�X�L�����o���鏀�����ł�����A";
		mes "�܂���ŗ��ĉ������B";
		next;
		mes "[�~�V���i]";
		mes "�X�L���K�������l�ł����I";
		close;
	case 2:
		mes "[�~�V���i]";
		mes "���x��^FF0000�G�������^���`�F���W^000000��";
		mes "�g�ɕt����Ԃł��ˁB";
		next;
		mes "[�~�V���i]";
		mes "�����ɊY���̑����t�^�X�L�����������";
		mes "�������\������";
		mes "^FF0000�N���G�C�g�R���o�[�^�[^000000�Ƃ͈Ⴂ�A";
		mes "^FF0000�G�������^���`�F���W^000000��";
		mes "��̑��������K�����鎖���ł��܂��B";
		next;
		mes "[�~�V���i]";
		mes "�������Y���̑����t�^�X�L����";
		mes "�Ȃ���Ίo���鎖�͂ł��Ȃ����A";
		mes "��񂻂̑����Ɍ��߂��瑼�̑�����";
		mes "�ς��鎖���ł��Ȃ�����A";
		mes "���̓_�ɒ��ӂ��ĉ������B";
		next;
		mes "[�~�V���i]";
		mes "�ǂ̑�����^FF0000�G�������^���`�F���W^000000��";
		mes "�o���܂����H";
		mes "������x���ӂ��Ă����܂����A";
		mes "��񑮐������߂�ƁA";
		mes "�ύX�͂ł��܂���B";
		while(1) {
			next;
			setarray .@skillname$,"�t�@�C�A�[�G�������^���`�F���W","�A�[�X�G�������^���`�F���W","�E�B���h�G�������^���`�F���W","�E�H�[�^�[�G�������^���`�F���W";
			setarray .@needskillname$,"�t���C�������`���[","�T�C�Y�~�b�N�E�F�|��","���C�g�j���O���[�_�[","�t���X�g�E�F�|��";
			setarray .@needskillid,280,283,282,281;
			setarray .@needitemid,990,993,992,991;
			set @menu,select("�t�@�C�A�[�G�������^���`�F���W","�A�[�X�G�������^���`�F���W","�E�B���h�G�������^���`�F���W","�E�H�[�^�[�G�������^���`�F���W");
			if(getskilllv(.@needskillid[@menu-1]) == 0) {
				mes "[�~�V���i]";
				mes "�����t�^�X�L��^FF0000" +.@needskillname$[@menu-1]+ "^000000��";
				mes "�K�����ĂȂ��ƁA";
				mes "^FF0000" +.@skillname$[@menu-1]+ "^000000��";
				mes "�K���ł��܂���B";
				mes "���̑�����I�����Ă��������B";
				continue;
			}
			mes "[�~�V���i]";
			mes "^FF0000" +.@skillname$[@menu-1]+ "^000000��";
			mes "�I�������ł��ˁB";
			mes "�Y���̑����̔\�͂��o����ׂɂ́A";
			mes "���̍ޗ����K�v�ł��B";
			next;
			mes "[�~�V���i]";
			mes "^FF0000" +getitemname(.@needitemid[@menu-1])+ "20��";
			mes "�t�F�C�������n�t1��";
			mes "�����N���n�t1��^000000";
			next;
			mes "[�~�V���i]";
			mes "���̍ޗ����W�߂āA";
			mes "���܂ł����������������";
			mes "^FF0000" +.@skillname$[@menu-1]+ "^000000��";
			mes "���������܂��B";
			mes "�ł́A���҂����Ă��܂��ˁB";
			set SKILL_ELEMENT,SKILL_ELEMENT + @menu;
			close;
		}
	case 3:
		set .@skillname$,"�t�@�C�A�[�G�������^���`�F���W";
		set .@skillid,1018;
		set .@itemid,990;
		break;
	case 4:
		set .@skillname$,"�A�[�X�G�������^���`�F���W";
		set .@skillid,1017;
		set .@itemid,993;
		break;
	case 5:
		set .@skillname$,"�E�B���h�G�������^���`�F���W";
		set .@skillid,1019;
		set .@itemid,992;
		break;
	case 6:
		set .@skillname$,"�E�H�[�^�[�G�������^���`�F���W";
		set .@skillid,1008;
		set .@itemid,991;
		break;
	}
	//�X�L���K��
	if(countitem(.@itemid) < 20 || countitem(1089) < 1 || countitem(1088) < 1) {
		mes "[�~�V���i]";
		mes "�܂��ޗ����W�܂��ĂȂ��悤�ł��ˁB";
		mes "������x���������܂��ˁB";
		next;
		mes "[�~�V���i]";
		mes "^FF0000" +getitemname(.@itemid)+ "20��";
		mes "�t�F�C�������n�t1��";
		mes "�����N���n�t1��^000000";
		next;
		mes "[�~�V���i]";
		mes "���̍ޗ����W�߂āA";
		mes "���܂ł����������������";
		mes "^FF0000" +.@skillname$+ "^000000��";
		mes "���������܂��B";
		mes "�ł́A���҂����Ă��܂��ˁB";
		close;
	}
	mes "[�~�V���i]";
	mes "�ޗ���S�ďW�߂Ă��܂����ˁI";
	mes "����ł͂��񑩒ʂ�";
	mes "^FF0000" +.@skillname$+ "^000000��";
	mes "���������܂��B";
	next;
	mes "[�~�V���i]";
	mes "^FF0000�G�������^���`�F���W^000000��";
	mes "�G�������^���R���o�[�^�[�ƃX�L����";
	mes "�g�p����҂̑����t�^�X�L�����g���āA";
	mes "�^�[�Q�b�g�����X�^�[�̑������i�v��";
	mes "�ύX����X�L���ł��B";
	next;
	mes "[�~�V���i]";
	mes "^FF0000�N���G�C�g�R���o�[�^�[^000000�Ɠ������A";
	mes "�g�p�҂̔\�͂ɂ���Đ�������";
	mes "�ω����鎖�ɒ��ӂ��ĉ������B";
	next;
	mes "[�~�V���i]";
	mes "�����c�c������";
	mes "�Z�[�W" +strcharinfo(0)+ "�l�ɁA";
	mes "^FF0000" +.@skillname$+ "^000000��";
	mes "�o������������������܂��B";
	mes "�����̊Ԑg�̂𓮂����Ȃ��ŉ������B";
	next;
	mes "-�~�V���i��������������Ǝ�����-";
	mes "-���ӂɐ_��I�Ő������Y���n�߂�-";
	next;
	mes "[�~�V���i]";
	mes "�z���e�`���`���p����!!";
	misceffect 33,"";
	next;
	mes "-�����ςȎ�������-";
	mes "-�C�ɂ��Ȃ��ł�����-";
	next;
	mes "[�~�V���i]";
	mes "�z�����C�B�b���A�b!!";
	misceffect 70,"";
	delitem .@itemid,20;
	delitem 1089,1;
	delitem 1088,1;
	set SKILL_ELEMENT,0;
	skill .@skillid,1,0;
	next;
	mes "[�~�V���i]";
	mes "�����" +strcharinfo(0)+ "�l��";
	mes .@skillname$+ "��";
	mes "�K�������͂��ł��B";
	mes "���ꂩ��L���Ɋ��p���ĉ������I";
	mes "����ł͂����C�ŁI";
	close;
}

yuno_in03,176,22,3	shop	Scroll���l	67,7433:-1


//-----------------------------------------------
//==== �t�@���^�Y�~�b�N�A���[ - HT_PHANTASMIC
//	�� SKILL_PHANTASMIC  -> 0�`1
//-----------------------------------------------
pay_arche,109,169,3	script	�A���y�X�g	712,{
	if(getskilllv(1009)) {
		mes "[�A���y�X�g]";
		mes "�ӂ��ӂ��I";
		mes "���̑O�͒p�������������������ȁB";
		mes "���i�͐�΂���Ȏ��͂Ȃ��񂾂��B";
		mes "������Ȃ��ł����B";
		next;
		mes "[���C�f���E�J���X]";
		mes "�Ȃ񂾁A�ʂɒp����������K�v";
		mes "�Ȃ�����˂����B";
		mes "�����̎��Ȃ񂾂��ȁB";
		emotion 29;
		next;
		mes "[�A���y�X�g]";
		mes "���ق��I�@���ق�I";
		mes "�������������I";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_HT) {
		mes "[�A���y�X�g]";
		mes "�ŋ߁A���̑嗤�ɐ����Ă��镗��";
		mes "���܂�u�₩����Ȃ��ˁc�c";
		mes "�ȑO�Ƒ�Ⴂ���c�c";
		next;
		emotion 32,"���C�f���E�J���X";
		mes "[���C�f���E�J���X]";
		mes "�W�W�C�A�{���ɐS�z�����ȁI";
		emotion 19;
		mes "[�A���y�X�g]";
		mes "�ӂ��ӂ��A���C�ȓz�߁B";
		close;
	}
	if(JobLevel < 40) {
		mes "[�A���y�X�g]";
		mes "�}�X�^�[�Ɍ����Ă����̂��ȁH";
		mes "�����A�܂��n���^�[���ƌ����ɂ�";
		mes "�����͕s���Ɍ�����ˁB";
		mes "����ȋْ����̂Ȃ��ڂ��ł�";
		mes "���i�e�B�b�N��C�����鎖��";
		mes "�ł��Ȃ��񂶂�Ȃ����H";
		next;
		mes "[�A���y�X�g]";
		mes "�N�͂܂����̋�����X�L�����w�Ԃɂ́A";
		mes "�F�X����Ȃ��݂������ˁB";
		mes "���ꂪ���Ȃ̂��͗ǂ��l���āA";
		mes "���������C����ς�ł��Ȃ����B";
		close;
	}
	switch(SKILL_PHANTASMIC) {
	case 0:
		mes "[�A���y�X�g]";
		mes "�}�X�^�[�Ɍ����Ă����̂��ȁH";
		mes "���[��I�@�������̐킢��";
		mes "�o�������s���ڂ��I";
		mes "�ꕪ�̌����Ȃ��N�̓����I";
		mes "�C�ɓ������I";
		next;
		mes "[�A���y�X�g]";
		mes "�}�X�^�[�ɏn���̃n���^�[��������A";
		mes "���̏��ɑ����Ă����悤��";
		mes "���肢�������A����ς�}�X�^�[��";
		mes "�l������ڂ͂������ȁI";
		next;
		mes "[�A���y�X�g]";
		mes "�}�X�^�[�ɏn���̃n���^�[�����̏���";
		mes "����悤�ɗ��񂾂̂́A";
		mes "���͂��̊ԃ��f���[�T�Ɛ퓬����";
		mes "�҂ݏo�����X�L���������āA";
		mes "����������悤�Ǝv���ĂȁB";
		next;
		mes "[�A���y�X�g]";
		mes "�����A���̋Z�𑼂̃n���^�[�B��";
		mes "�L�߂����������A";
		mes "��l�O����Ȃ��n���^�[�B��";
		mes "������̂́A���̋Z����J����";
		mes "�҂ݏo�������̃v���C�h��";
		mes "�����Ȃ��̂��B";
		next;
		mes "[�A���y�X�g]";
		mes "���̋�J�𗝉����Ă����A";
		mes "�N�݂����Șr��������";
		mes "�n���^�[�B�ɋ����悤�Ǝv���B";
		next;
		mes "[�A���y�X�g]";
		mes "���̃X�L���Ƃ́A";
		mes "�w�A���y�X�g��3��^3131FF���}��^000000�x!!";
		next;
		mes "[�A���y�X�g]";
		mes "�����X�^�[���ɏW���������āA";
		mes "��؂ꂽ�I�@�Ƃ�����@�I�󋵂ł��A";
		mes "�Q�Ă��N�����h�ȃn���^�[�Ƃ��āA";
		mes "�Ō�̃v���C�h������ō��̃X�L���I";
		mes "���_�͂Ŗ�����̉����������o���I";
		mes "���̃X�L�����w�т������낤�H";
		next;
		if(select("�����Ă��������I","�ʂɁc�c")==2) {
			mes "[�A���y�X�g]";
			mes "���͂���Ȏ��ł������Ȃ����B";
			mes "���̃X�L�����K�v�ȓ���";
			mes "�K������͂�������A";
			mes "���̎��A�K������K�˂ė��邳�B";
			close;
		}
		mes "[�A���y�X�g]";
		mes "�������I�@��͂茩��ڂ�����ȁI";
		mes "���̃X�L���̂�������������N�I";
		mes "�����ČN�����̌��ւ悱����";
		mes "�}�X�^�[�̖ڂ����������I";
		next;
		mes "[�A���y�X�g]";
		mes "����Ɓc�c���̃X�L����";
		mes "����Z�p������A";
		mes "�����n���^�[���m�ł��������̂�";
		mes "�Ȃ񂾂��A�����΂�����Ɨ���";
		mes "����������B";
		next;
		mes "[���C�f���E�J���X]";
		mes "�W�W�C�������Ă񂾁B";
		mes "���̋Z�́w�ދ����Ȃ��x����";
		mes "�|���������Ă�����R�ł���";
		mes "�Z����Ȃ����B";
		emotion 29,"���C�f���E�J���X";
		next;
		emotion 23;
		mes "[�A���y�X�g]";
		mes "�Ȃ����������ɂ���������!!!!";
		mes "�Ȃ񂾂��̂ł���߂Șb��!!!!";
		mes "���̃X�L���͎��͂����Ԃ�O��";
		mes "�G�h�K�[�Ƃ̌������킢�̒���";
		mes "�҂ݏo�����Z�����I";
		mes "�ǂ��ł���Ȃł���߂Șb��!!";
		next;
		mes "[���C�f���E�J���X]";
		mes "�������̓��f���[�T�Ɛ퓬����";
		mes "�Ƃ������ĂȂ��������H";
		next;
		mes "[�A���y�X�g]";
		mes "���ق�I�@�Ƃɂ����A";
		mes "�{���ɓ���Z�p�Ȃ񂾁B";
		next;
		mes "[�A���y�X�g]";
		mes "^3131FF���ꂽ���r�[5��";
		mes "�n�[�s�[�̉H5�A^000000";
		mes "�����āA^3131FF�y�b�g�t�[�h30��^000000��";
		mes "�����ė��Ȃ����B";
		mes "����������X�L���������悤�B";
		next;
		mes "[���C�f���E�J���X]";
		mes "����ς�W�W�C�͎���ς��Ȃ��I";
		mes "���̕��͂Ƃ������A";
		mes "�y�b�g�t�[�h�͂Ȃ�ł��H";
		next;
		mes "[�A���y�X�g]";
		mes "���̃t�@���R���ɐH�ׂ������";
		mes "���܂��Ă邶��Ȃ����B";
		mes "������O�̎��𕷂��z���ȁB";
		next;
		mes "[���C�f���E�J���X]";
		mes "���A�����c�c�c�c";
		emotion 9,"���C�f���E�J���X";
		next;
		mes "[�A���y�X�g]";
		mes "�Ƃɂ������񂾕��������ė�����A";
		mes "���̎��X�L���������悤�B";
		set SKILL_PHANTASMIC,1;
		close;
	case 1:
		if(countitem(724) < 5 || countitem(7115) < 5 || countitem(537) < 30) {
			mes "[�A���y�X�g]";
			mes "^3131FF���ꂽ���r�[5��";
			mes "�n�[�s�[�̉H5�A^000000";
			mes "�����āA^3131FF�y�b�g�t�[�h30��^000000��";
			mes "�����ė��Ȃ����B";
			mes "����������X�L���������悤�B";
			close;
		}
		mes "[�A���y�X�g]";
		mes "�ǂ�A������ƌ��Ă݂悤���B";
		mes "�悵�I�@�S�������Ă����݂������ˁB";
		mes "����ł́c�c�N�ɒ��K�E�X�L����";
		mes "�����悤����Ȃ����I";
		next;
		mes "[�A���y�X�g]";
		mes "�A���y�X�g��1��!!";
		next;
		mes "[���C�f���E�J���X]";
		mes "�ŏ��͑�3���ƌ����ĂȂ��������H";
		emotion 4,"���C�f���E�J���X";
		next;
		mes "[�A���y�X�g]";
		mes "���I";
		mes "�}�I";
		mes "��I";
		next;
		mes "[���C�f���E�J���X]";
		mes "�W�W�C�I�@������Ƒ҂�!!!!";
		emotion 23;
		next;
		mes "[�A���y�X�g]";
		mes "�������!!!!";
		mes "�ō��̌�����̗����؂�Ȃ�āI";
		next;
		emotion 23;
		mes "[���C�f���E�J���X]";
		mes "���̖��O�c�c���}��H";
		mes "���܂�ɂ��i�D�������I";
		mes "����Ȋi�D�����X�L������";
		mes "���ɏo���Č����邩���I";
		mes "���Ȃ��Ό���Ȃ����I";
		mes "��΂�!!";
		next;
		mes "[�A���y�X�g]";
		mes "��΁H";
		emotion 9;
		next;
		mes "[���C�f���E�J���X]";
		mes "���!!!!";
		next;
		mes "[�A���y�X�g]";
		mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
		emotion 28;
		next;
		mes "[���C�f���E�J���X]";
		mes "���[��c�c�W�W�C�A";
		mes "�Ƃ肠�����A������������";
		mes "�}�V�Ȗ��O�����l���Ă��B";
		mes "�����̊ԑ҂��Ă�B";
		next;
		mes "[���C�f���E�J���X]";
		mes "���[��c�c�c�c�c�c";
		mes "�ނނނނނށc�c�c�c�c�c";
		next;
		mes "[���C�f���E�J���X]";
		mes "�������I�@�W�W�C�A����Ȃ̂ǂ����H";
		mes "^3131FF�t�@���^�Y�~�b�N�A���[^000000!!";
		mes "�������肫�Ă�Ǝv��Ȃ����H";
		emotion 5,"���C�f���E�J���X";
		next;
		mes "[�A���y�X�g]";
		mes "���ꂾ�I�@���C�f���E�J���X�I";
		mes "���܂ɂ͖��ɗ�����Ȃ����I";
		next;
		mes "[���C�f���E�J���X]";
		mes "����!?";
		next;
		mes "[�A���y�X�g]";
		mes "��[���A����ł͑���";
		mes "'^3131FF�t�@���^�Y�~�b�N�A���[^000000'��";
		mes "�����悤�I";
		next;
		mes "[�A���y�X�g]";
		mes "�t�@���I";
		mes "�^�I";
		mes "�Y�I";
		mes "�~�b�N�I";
		next;
		mes "[�A���y�X�g]";
		mes "�A���H�H�H�H�[�[�[�[�[�[�[!!!!";
		misceffect 99;
		misceffect 99,"";
		next;
		mes "[�A���y�X�g]";
		mes "�ӂ��ӂ��ӂ��ӂ��c�c�I";
		mes "�v�킸�͂������Ă��܂������B";
		next;
		mes "[�A���y�X�g]";
		mes "�Ƃ肠�����A���̂ŌN��";
		mes "�t�@���^�Y�~�b�N�A���[���o�����͂��B";
		mes "���̃X�L���͌N�̑傫�ȏ�����";
		mes "�Ȃ�͂�������A���܂��g���Ȃ����B";
		next;
		mes "[�A���y�X�g]";
		mes "�ǂ�A�����Ɉ�x�����Ă݂Ȃ����I";
		next;
		mes "-�q���b�I-";
		mes "-�ǂ���!!!!-";
		misceffect 1;
		emotion 23;
		emotion 23,"";
		next;
		mes "[�A���y�X�g]";
		mes "�Ȃ��c�c�c�c�I";
		mes "���c�c���c�c�c�c�I";
		mes "���͂����c�c�c�c�c�c�I";
		next;
		mes "[�A���y�X�g]";
		mes "�Ȃ��c�c�����c�c�c�������c�c�I";
		next;
		mes "-�ǂ���-";
		emotion 23,"���C�f���E�J���X";
		next;
		mes "[���C�f���E�J���X]";
		mes "������!!�@�W�W�C!!!!";
		mes "�c�c�c�c�Ȃ񂾁A���������������B";
		mes "�������c�c�傰���Ȃ񂾂����B";
		next;
		mes "[���C�f���E�J���X]";
		mes "���̃W�W�C���\�N����Ă���Ă̂�";
		mes "���邵�A�ςȂƂ��������񂾂��ǁA";
		mes "��������Ȋ��������炳�A";
		mes "�ʂɋC�ɂ��Ȃ��Ă�����B";
		mes "�܁A�W�W�C�͉����ʓ|���Ƃ���B";
		next;
		mes "[���C�f���E�J���X]";
		mes "�t�@���^�Y�~�b�N�A���[���A";
		mes "�ǂꂭ�炢�֗��Ȃ̂��͒m��񂪁A";
		mes "���̃W�W�C�̎��͂́A";
		mes "���X�̂��̂�����ȁI";
		mes "��x�M���Ă݂��炢���񂶂�Ȃ����H";
		mes "�n�n�b�I�@���ꂶ�Ⴀ�܂��ȁI";
		delitem 724,5;
		delitem 7115,5;
		delitem 537,30;
		set SKILL_PHANTASMIC,0;
		skill 1009,1,0;
		close;
	}
}


//-----------------------------------------------
//==== �p���{�C�X - BA_PANGVOICE
//	�� SKILL_PANGVOICE   -> 0�`
//-----------------------------------------------
prontera,169,72,7	script	�N#bard	89,3,3,{
	if(getbaseclass(Class,2) != CLASS_BA) {
		mes "[�̂��������N]";
		mes "���E�͖{���ɑf���炵���B";
		mes "�����͎v��Ȃ����H�@�c�c�c�c�B";
		mes "�n�g�����Č����Ă邩�킩��΂Ȃ��B";
		mes "�c�c�c�c�N���b�|�[�B";
		mes "���A���̘b�����Ă��������B";
		mes "�n�n�n�c�c";
		close;
	}
	emotion 23;
	mes "[�̂��������N]";
	mes "�q�C�C�b�[�I";
	if(Upper == UPPER_HIGH) mes "�N�c�c�N�c�c�N���E����!!";
	else mes "�o�c�c�o�c�c�o�[�h��!!";
	mes "���c�c�ߊ��ȁI";
	mes "���͂��O������";
	mes "����������������!!!!";
	next;
	if(select("�Ȃ��H�@�ǂ����Č����Ȃ�!?","�����������悤")==1) {
		mes "[�̂��������N]";
		mes "�q�C�C�C�C�b!!";
		mes "��c�c���ɉ�������C��!?";
		mes "�������I�@�O�������������I";
		mes "�e�����U������ċߕt���Ă���!!!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ߕt���Ă����z�͉��������́H";
		mes "���_�ł����Ă���ƌ������́H";
		next;
		mes "[�̂��������N]";
		mes "�����I�@���ꂾ�I";
		mes "���͂��O���";
		mes "���̂�����Ȃ���k��";
		mes "���̉���������!!!!";
		mes "�������֍s���I";
		close;
	}
	mes "[�̂��������N]";
	mes "�q�C�C�C�C�b!!";
	mes "��c�c���ɉ�������C��!?";
	mes "�������I�@�O�������������I";
	mes "�e�����U������ċߕt���Ă���!!!!";
	next;
	if(select("���ݕ��ł���t�n��","����������")==2) {
		mes "[�̂��������N]";
		mes "�c�c����!?";
		mes "���x�͉��̎􂢂���������肾!?";
		if(getskilllv(1010))
			mes "�c�c�������s���I";
		else {
			mes "���c�c";
			mes "�܂����O�͂��ꂪ�ł��Ȃ��̂��H";
			mes "�z�b�c�c�����������c�c";
		}
		close;
	}
	if(countitem(12112) < 1) {
		mes "[�̂��������N]";
		mes "�c�c�����H";
		mes "���ɉ��������̂�!!!!";
		mes "����Ȃ�A���͉ʕ���";
		mes "�����ς������Ă���̂��D�����I";
		next;
		mes "[�̂��������N]";
		mes "�������c�c";
		mes "����̓����N�̓��Y�ŁA";
		mes "��ɓ����̂���ςȂ񂾁B";
		mes "�c�c�V�N�V�N�B";
		next;
		mes "[�̂��������N]";
		mes "���āA���Ŏ������O��";
		mes "����Șb�����Ă����!?";
		next;
		mes "[�̂��������N]";
		mes "�c�c�c�c";
		mes "�A�A�c�c";
		mes "�g���s�J���E�\�O���g�c�c�c�c";
		mes "���݂����ȁc�c�c�c";
		close;
	}
	mes "[�̂��������N]";
	mes "�I�I�I�I�I�[!!";
	mes "����͎��̑�D���A";
	mes "�g���s�J���E�\�O���g����Ȃ����I";
	next;
	if(getskilllv(1010)) {
		mes "[�̂��������N]";
		mes "���肪����������B";
		mes "�S�N�S�N�b�c�c�c�c�t�H�b!?";
		mes "�܂��������";
		mes "���ْ̋����ɂ߂Ă����āA";
		mes "�܂�������g������Ȃ̂�!?!?";
		next;
		mes "[�̂��������N]";
		mes "�������֍s���Ă���!!!!";
		close;
	}
	if(SKILL_PANGVOICE) {
		mes "[�̂��������N]";
		mes "����H";
		mes "�N�͑O�ɂ��c�c�c�c";
		mes "���������A���Ɉ��ݕ���";
		mes "�����Ă��ꂽ�����l���ˁB";
		next;
		mes "[�̂��������N]";
		mes "�c�c�c�c�܂����A�O�Ɏ���������";
		mes "������w�т�";
		mes "�s���񂶂�Ȃ����낤�ˁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�b�n�b�[�I";
		mes "����Ȃ܂����`";
		close;
	}
	mes "[�̂��������N]";
	mes "�A�@�@�c�c�c�c";
	mes "�c�c����ȕ��������ė���Ȃ�āA";
	mes "��́A���ɉ��̗p�Ȃ񂾁H";
	next;
	if(select("��́A�������ꂽ�񂾁H","���т��Ă�悤�Ɍ����āc�c")==2) {
		mes "[�̂��������N]";
		mes "���͌N�����̂�����";
		mes "�Ƃ�ł��Ȃ��ڂɂ������I";
		mes "����͍��ł��g���E�}�̂悤��";
		mes "�����ꂵ�߂�I";
		next;
	}
	mes "[�̂��������N]";
	mes "����́c�c�c�c";
	mes "���̑O�A�E���o����";
	mes "���s�����ɍs���Ă��������B";
	mes "�E���o���̃V���[�}����";
	mes "�����w�тȂ����ƏЉ�ꂽ";
	mes "��V���l�ɉ�����񂾁B";
	next;
	mes "[�̂��������N]";
	mes "�ނɉ�������ŁA";
	mes "���͋��낵���o���������B";
	mes "�E���o���ɂ��邾��H";
	mes "���������c�c�c�c�c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�o���W�[�W�����v�䂩�c�c";
	mes "�������͋��H";
	next;
	mes "[�̂��������N]";
	mes "��b�������I";
	mes "�Ƃ��낪������";
	mes "�x���������Ă��ƌ����āc�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�H�@��납�牟�����Ƃ��H";
	next;
	mes "[�̂��������N]";
	mes "��������Ȃ��I";
	mes "��������ɂ��";
	mes "�����ԂԂƌ����Ă�ƁA";
	mes "�}�Ɏ��̑̂�";
	mes "����ɓ����n�߂���!!!!";
	next;
	mes "[�̂��������N]";
	mes "����������Ȃ�Ƃ��~��悤��";
	mes "�������΂������قǁA";
	mes "���̑̂͂���������������ɓ����c�c";
	mes "�����āc�c�c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "��т��肽�킯�ˁc�c�c�c";
	mes "�n�n�n�b�B";
	next;
	mes "[�̂��������N]";
	mes "�΂������I";
	mes "�����̈ӎu�ɔ����ē����A";
	mes "���̑̂̋��낵���I";
	mes "�o�����Ă��Ȃ��z�ɂ�";
	mes "�킩��Ȃ��c�c�c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�͂��B�͂��c�c";
	mes "����ɂ��Ă��c�c";
	mes "����͖{���ɕs�v�c�ȋZ���ˁH";
	mes "�����m���V���l�̉̂̒���";
	mes "����Ȃ��̂͂Ȃ��̂����c�c";
	next;
	mes "[�̂��������N]";
	mes "��������Ȃ̂��g�����";
	mes "���߂Č����I";
	mes "�ԂԂƌ����Ă���";
	mes "��̌����͏΂��Ă����񂾁I";
	mes "�����͒n���̎��q���B���q�I";
	next;
	mes "[�̂��������N]";
	mes "�c�c�c�c�Ƃɂ����A";
	mes "���̈��ݕ��͂��炤��B";
	mes "�{���ɂ��肪�Ƃ��B";
	mes "�Ⴂ������āA";
	mes "����ȋC�����������";
	mes "�T���̂͂�߂�����������B";
	next;
	if(JobLevel < 40) {
		mes "[�̂��������N]";
		mes "���̎��͂��Ⴀ�w�Ԃ��Ƃ�";
		mes "�ł��Ȃ����낤���B";
		mes "���Ȃ��Ƃ��E�ƃ��x����40�ȏ��";
		mes "�Ȃ��Ɩ����Ȃ񂶂�Ȃ��B";
		delitem 12112,1;
		close;
	}
	mes "[�̂��������N]";
	mes "�����ĒT������Ȃ�~�߂Ȃ����ǁA";
	mes "�ǂ��ɂ��邩�͒m��Ȃ�����ˁB";
	delitem 12112,1;
	set SKILL_PANGVOICE,1;
	close;
OnTouch:
	if(getbaseclass(Class,2) == CLASS_BA)
		emotion 23;
	end;
}

morocc_in,169,72,7	script	�A�C�ȃo�[�h#bard	741,3,3,{
	if(getskilllv(1010)) {
		mes "[���C�I�g]";
		mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
		mes "���������Ă�����Z�p�͂ǂ����H";
		mes "����́A���������Ɏg���Ă���";
		mes "���̂悤�ɑ��܂�Ă��܂����B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
		next;
		mes "[���C�I�g]";
		mes "������";
		mes "������������������";
		mes "�g���Ă��Ƃ����c�c";
		mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_BA) {
		emotion 29;
		mes "[���C�I�g]";
		mes "�c�c�N�b�N�b�N�b�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��������Ȃɖʔ����񂾂낤�H";
		next;
		if(GEF_1QUE != 30 && GEF_1QUE != 31) {
			mes "[���C�I�g]";
			mes "�����H";
			mes "�o�[�h�̗F�B�ł��Ȃ��z��";
			mes "�b�����Ƃ͂Ȃ��B";
			mes "�N�b�N�b�N�b�N�b�N�b�N�B";
			close;
		}
		mes "[���C�I�g]";
		mes "�ق��B" +(GEF_1QUE == 30? "��": "��")+ "�̖�͂����L���Ă���̂��B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�B";
		mes "�����������Ă݂�B";
		next;
		mes "-��V���l���ڔz���Ŏ���������";
		mes "���Ă݂�ƁA��l�������𕪂��Ă���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ʂɁc�c�ς���Ȃ��Ǝv�����ǁH";
		next;
		mes "[���C�I�g]";
		mes "�߂��ɍs���Ē��ڌ���Ƃ����B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�B";
		next;
		mes "-��V���l�͂��̓��̈�l���ɂ�ŁA";
		mes "�ԂԂƉ������Ԃ₫�n�߂�-";
		close;
	}
	switch(SKILL_PANGVOICE) {
	case 0:
	case 1:
		mes "[���C�I�g]";
		mes "�c�c�N�b�N�b�N�b�B";
		emotion 29;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��������Ȃɖʔ����񂾁H";
		next;
		if(GEF_1QUE != 30 && GEF_1QUE != 31) {
			mes "[���C�I�g]";
			mes "�c�c���͐Â��ɕ�炵�����B";
			mes "�c�c���������΁A";
			mes "��͂��Ȃ��F�B���܂�����ȁB";
			mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
			next;
			mes "[���C�I�g]";
			mes "���O���o�[�h�����A";
			mes "�^���ȃo�[�h�̗F�B�ł͂Ȃ��B";
			mes "�Q�t�F���ɂ���o�[�h��";
			mes "���������Ȃ����H";
			next;
			mes "[���C�I�g]";
			mes "�c�c�c�c�N�b�N�b�N�b�B";
			mes "���Ǝғ��m�A�b���Ă݂���ǂ����H";
			close;
		}
		mes "[���C�I�g]";
		mes "�ق��B" +(GEF_1QUE == 30? "��": "��")+ "�̖�͂����L���Ă���̂��B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�B";
		mes "�����������Ă݂�B";
		next;
		mes "-��V���l���ڔz���Ŏ���������";
		mes "���Ă݂�ƁA��l�������𕪂��Ă���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ʂɁc�c�ς���Ȃ��Ǝv�����ǁH";
		next;
		mes "[���C�I�g]";
		mes "�߂��ɍs���Ē��ڌ���Ƃ����B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�B";
		next;
		mes "-��V���l�͂��̓��̈�l���ɂ�ŁA";
		mes "�ԂԂƉ������Ԃ₫�n�߂�-";
		mes "-����ƁA���̒j�̍s����";
		mes "���������Ȃ�n�߂�-";
		next;
		mes "[�����������j]";
		mes "��H�@���c�c�ȁA�Ȃ񂾁H";
		mes "�ǂ����Ď��������Ŏ�����";
		mes "�����Ă�!?";
		next;
		mes "[�������񐌂����j]";
		mes "����H�@�����H";
		mes "���O�A�����ɕ����ꂽ���H";
		mes "�c�c�łȂ��ƁA�Ȃ��ƁB���H";
		mes "�����`�H";
		mes "���͂������ł������ɍs���`�B";
		next;
		mes "[�����������j]";
		mes "�������ɍs�������̂�";
		mes "�ǂ����Ă������ɁH";
		mes "���A�����I�@�����c�c";
		mes "�A�C�^�I";
		next;
		mes "[�������񐌂����j]";
		mes "�C�^�I";
		mes "�Ȃɂ��邟�������������B";
		mes "�ǂ����Ď��̂��Ԃׂ��b�I";
		mes "�q�b�N�B";
		next;
		mes "-��l�̒j�́A�݂���";
		mes "�ǂ��ɍs�����킩��Ȃ��悤��";
		mes "�s�����藈���肵�Ă���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���������Ă܂��ˁc�c";
		next;
		mes "[���C�I�g]";
		mes "�����ł͂Ȃ��B";
		mes "����͎��̔�p�B";
		mes "�ނ�̈ӎu�ƈႤ�悤�ɓ����B";
		mes "���_�����������̂���c�c�c�c";
		next;
		if(SKILL_PANGVOICE == 0) {
			mes "[" +strcharinfo(0)+ "]";
			mes "�͂��͂��B";
			mes "�������l�X����ɂ���ȉR����";
			mes "�ʂ��Ȃ���B";
			next;
			mes "[���C�I�g]";
			mes "�c�c�l�̘b��M���Ȃ��z�߁B";
			mes "���O�̂悤�ȓz��";
			mes "���̒��̈���!!";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "����H�@�����H";
		mes "����ɓ����c�c�H";
		mes "�܂����I";
		mes "�ȑO�A����j�ɂ�����g����";
		mes "�o���W�[�W�����v��";
		mes "���������Ƃ�����܂���!?";
		next;
		mes "[���C�I�g]";
		mes "�Ȃ������m���Ă���H";
		mes "�܂����c�c";
		mes "���̘b�𕷂���";
		mes "���̌��ɗ����̂��H";
		next;
		if(select("�����ł��I�@�����Ă��������I","������")==2) {
			mes "[���C�I�g]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�`�b�B";
			mes "�܂��B";
			close;
		}
		mes "[���C�I�g]";
		mes "�������ȁc�c�����Ă��������c�c";
		mes "�����c�c�ǂ����邩�ȁB";
		mes "���́A���͂����";
		mes "�E���o���̃V���[�}���̎􂢂���";
		mes "��肠�������̂Ȃ̂����A";
		mes "�ƂĂ���ɕ����Ȃ��ĂȁB";
		next;
		mes "[���C�I�g]";
		mes "����ɁA���̊Ǘ����ƂĂ��d�v���B";
		mes "�����ށc�c�ǂ����邩�B";
		mes "�c�c�c�c";
		mes "�I�@�������I";
		next;
		mes "[���C�I�g]";
		mes "�́A�E���o���ɂ���傫�Ȗ؂�";
		mes "�o���ėV��ł����B";
		mes "����������A�ςȏ��֏o�������������B";
		next;
		mes "[���C�I�g]";
		mes "�����Łu�C�q���v�Ƃ���";
		mes "���̃j���g���ɉ�������c�c";
		next;
		mes "[���C�I�g]";
		mes "�����̗����ō��������B";
		mes "�N�b�N�b�N�b�N�b�N�b�c�c";
		mes "^4D4DFF�C�q���̗���5��^000000����Ă���邩�H";
		mes "����͐��̒��q���悭�Ȃ�B";
		set SKILL_PANGVOICE,2;
		close;
	default:
		mes "[���C�I�g]";
		mes "�N�N�c�c���͂ǂ������H";
		mes "�����͑����������낤�H";
		mes "�N�b�N�b�N�b�N�b�N�b�N�b�c�c";
		close;
	case 7:
		if(countitem(574) < 5) {
			mes "[���C�I�g]";
			mes "�Ȃ�!?";
			mes "���������ł͂Ȃ���!?";
			mes "�ނ��c�c";
			mes "�������Ȃ��B";
			mes "���ꂶ�Ⴀ�A����";
			mes "^4D4DFF���i�b�N�l�`^000000��������Ă����B";
			next;
			mes "[���C�I�g]";
			mes "�q�F�O���Ƃ�����������";
			mes "���i�b�N�l�`�͓��ɏo���������B";
			mes "�N�N�N�N�N�N�c�c�c�c";
			if(countitem(574)) {
				mes "�ꉞ�A����Ă�������";
				mes "�������ׂĂ�����Ă������B";
				delitem 574,countitem(574);
			}
			set SKILL_PANGVOICE,8;
			next;
			mes "[���C�I�g]";
			mes "�c�c�c�c�ǂ����Ă���ȖڂŌ���!?";
			mes "�C�q���̗����H�ׂ����̂��H";
			mes "�����Ȃ̂�!?";
			mes "�c�c���񂼁c�c�c�c";
			close;
		}
		mes "[���C�I�g]";
		mes "�����b�I�@�{���Ɏ�ɓ���ė����ȁI";
		mes "���̏����ɋP�����B";
		mes "�܂������C�q���I";
		mes "�킴�킴�􂢂�������";
		mes "�j�u���w�C���ɕ����Ă�����";
		mes "����������c�c";
		next;
		mes "[���C�I�g]";
		mes "�悵�A����ł͑��������Ă�낤�B";
		break;
	case 8:
		if(countitem(7277) < 1) {
			mes "[���C�I�g]";
			mes "���i�b�N�l�`�I�@���i�b�N�l�`���I";
			mes "�C�q���̗��̎��͂������I";
			mes "�������ƃ��i�b�N�l�`�������ė����I";
			close;
		}
		mes "[���C�I�g]";
		mes "�I�I�b�I";
		mes "�{���Ɏ�ɓ���ė����ȁI";
		mes "�ؗ�Ȑj�̘r�O�I";
		mes "�ψ�ɖ������ꂽ�ȁI";
		mes "�܂������q�F�O���̘r�O���B";
		next;
		mes "[���C�I�g]";
		mes "�N�b�N�b�N�b�B";
		mes "�J�ߌ��t�͂��̂��炢�ɂ��āA";
		mes "���������A�����Ă�낤�B";
		mes "�N�b�N�b�N�b�N�b�N�b�N�b�c�c";
		next;
		mes "[���C�I�g]";
		break;
	}
	//�X�L���K������
	mes "���̋Z�p�́A";
	mes "�����E���o���𗷂��Ă������A";
	mes "�V���[�}���A�n�������̎􂢂���";
	mes "�������̋Z�p�ō�������́B";
	mes "�c�c�N�b�N�b�N�b�N�b�N�b�N�c�c";
	next;
	mes "[���C�I�g]";
	mes "�܂��A�Z�������鑊����ɂށB";
	mes "�����āA�הO����ꍞ�߂Ȃ���";
	mes "�����W���[�N��������B";
	mes "��Ȑ����o���̂��d�v���B";
	next;
	mes "[���C�I�g]";
	mes "��͉���!!";
	mes "������Ƃ����I�I";
	mes "�d���ɗp�����H";
	mes "�E�҂͑S���ŉ��l����H";
	mes "���݂����͊̑��ɂ��J���]�E�I";
	mes "�����������B�M���b�I";
	misceffect 295,"";
	if(SKILL_PANGVOICE == 7) delitem 574,5;
	else delitem 7277,1;
	set SKILL_PANGVOICE,0;
	skill 1010,1,0;
	next;
	mes "[���C�I�g]";
	mes "���̊����W���[�N�͑��̐l��";
	mes "�􂢂��ƋC�Â��Ȃ��悤��";
	mes "���ɂ��Ă���B";
	mes "�������Ă�����Z�p��";
	mes "�u�p���{�C�X�v�Ƃ����B";
	next;
	mes "[���C�I�g]";
	mes "�הO������������Ȑ���";
	mes "����̐��_�ɏՌ���������B";
	mes "����ő���͈ꎞ�I�ɂ����A";
	mes "�����̎v���悤��";
	mes "�������Ƃ��ł��Ȃ��B";
	mes "�c�c�N�b�N�b�N�b�N�b�N�b�N�b�c�c";
	next;
	mes "[���C�I�g]";
	mes "����́A���������Ɏg���Ă���";
	mes "���̂悤�ɑ��܂�Ă��܂����B";
	mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
	next;
	mes "[���C�I�g]";
	mes "������";
	mes "������������������";
	mes "�g���Ă��Ƃ����c�c";
	mes "�N�b�N�b�N�b�N�b�N�b�N�b�B";
	close;
OnTouch:
	emotion 29;
	end;
}

niflheim,239,70,1	script	�C�q��#1	800,3,3,{
	emotion 23;
	emotion 23,"";
	mes "[�j���g���E�C�q��]";
	mes "�R�P�b�H";
	mes "�R�R�R�R�R�R�P�[�b�R!!";
	next;
	hideonnpc;
	hideoffnpc "�C�q��#"+(strnpcinfo(2)%5+1);
	mes "-�j���g���������ē�����-";
	if(SKILL_PANGVOICE < 2 || SKILL_PANGVOICE > 6 || rand(3))
		close;
	mes "^4D4DFF-�C�q�����������Łu���v��������-";
	mes "-�u���v�����ɓ��ꂽ-^000000";
	set SKILL_PANGVOICE,SKILL_PANGVOICE+1;
	getitem 574,1;
	close;
OnTouch:
	emotion 23;
	emotion 23,"";
	mes "[�j���g���E�C�q��]";
	mes "�R�P�b�H";
	mes "�R�R�R�R�R�R�P�[�b�R!!";
	next;
	hideonnpc;
	hideoffnpc "�C�q��#"+(strnpcinfo(2)+1);
	mes "-�j���g���������ē�����-";
	close;
}
niflheim,185,205,3	duplicate(�C�q��#1)	�C�q��#2	800,3,3
niflheim,85,203,5	duplicate(�C�q��#1)	�C�q��#3	800,3,3
niflheim,149,81,7	duplicate(�C�q��#1)	�C�q��#4	800,3,3
niflheim,209,144,3	duplicate(�C�q��#1)	�C�q��#5	800,3,3

morocc_in,178,73,3	script	���q����#bard	54,{
	mes "[�����������j]";
	mes "��͂���͌��t���B";
	mes "�����ǂ����B";
	mes "�����������ꂪ��ԂȂ́I";
	mes "�g�c�c�g���X�^���H";
	next;
	mes "[�������񐌂����j]";
	mes "���`�g���X�^��13�N���H";
	mes "�q�b�N�B";
	mes "�������A�������݂����ȏ�����";
	mes "����ȍ����������ނ��Ƃ��ł��邩�H";
	next;
	mes "[�������񐌂����j]";
	mes "���́c�c�q�N�b�N�B";
	mes "�{�~���c�c�{�����c�c";
	mes "�l�ӂɃ{�g���c�c";
	next;
	mes "[�����������j]";
	mes "�{�~���H";
	mes "�{�~�������Ǝ����Ă��[�����I";
	mes "�O�E���I";
	mes "���ꖼ�i���낤�B";
	mes "��t�����������";
	mes "���̂܂ܖڂ̑O���^�ÂɂȂ�Ɓ`�I";
	next;
	mes "[�������񐌂����j]";
	mes "�q�b�N�B";
	mes "�g�A�g���s�J���I";
	mes "������f���炵���`";
	mes "���c�c";
	mes "�ق�̏����c�c";
	next;
	mes "[�����������j]";
	mes "��H�@���c�c�ȁA�Ȃ񂾁H";
	mes "�ǂ����Ď��������Ŏ�����";
	mes "�����Ă�!?";
	next;
	mes "[�������񐌂����j]";
	mes "����H�@�����H";
	mes "���O�A�����ɕ����ꂽ���H";
	mes "�c�c�łȂ��ƁA�Ȃ��ƁB���H";
	mes "�����`�H";
	mes "���͂������ł������ɍs���`�B";
	next;
	mes "[�����������j]";
	mes "�������ɍs�������̂�";
	mes "�ǂ����Ă������ɁH";
	mes "���A�����I�@�����c�c";
	mes "�A�C�^�I";
	next;
	mes "[�������񐌂����j]";
	mes "�C�^�I";
	mes "�Ȃɂ��邟�������������B";
	mes "�ǂ����Ď��̂��Ԃׂ��b�I";
	mes "�q�b�N�B";
	next;
	mes "[�����������j]";
	mes "�����c�c�q�b�N�c�c�����I";
	mes "�̂���������ɓ�����c�c�q�b�N�B";
	mes "�����c�c�E�B�b�N�B";
	mes "�����ς��c�c�q�B�b�N�c�c�̂������H";
	next;
	mes "-���������񂾓�l�̒j�́A";
	mes "�p�𑫂��ɍs�����ƕ����o���A";
	mes "�ςȕ����ɓ����Ȃ���Q�ĂĂ���-";
	next;
	mes "-����A���̌��i�����Ă���";
	mes "��V���l���ق����΂�ł���-";
	mes "-���͂���������ނ̂ł͂Ȃ�-";
	close;
}
morocc_in,175,70,7	duplicate(���q����#bard)	���q����	50

morocc_in,166,76,7	script	�o�[�e��	46,{
	mes "[�o�[�e��]";
	mes "�������H";
	next;
	if(select("�g���s�J���E�\�O���g","���@�[�~���I���E�U�E�r�[�`","������")==3){
		mes "[�o�[�e��]";
		mes "�������c�c";
		close;
	}
	if(MaxWeight - Weight < 2000) {
		mes "[�o�[�e��]";
		mes "���O�A�������Ă�̂��H";
		mes "�����ӂ�ӂ炵�Ă邼�B";
		close;
	}
	if(Zeny < 1000) {
		mes "[�o�[�e��]";
		mes "�c�c���͂���̂��H";
		mes "���z���m�F���Ă��璍�����Ă���B";
		mes "��t1000Zeny���B";
		close;
	}
	mes "[�o�[�e��]";
	if(@menu == 1) mes "����͂قƂ�ǂ��ʏ`�����A";
	mes "���݂����ɂ͋C�����ȁB";
	set Zeny,Zeny-1000;
	getitem 12111+@menu,1;
	close;
}


//-----------------------------------------------
//==== ���f�̃E�B���N - DC_WINKCHARM
//	�� SKILL_WINKCHARM   -> 0�`8
//-----------------------------------------------
comodo,204,172,5	script	�T�l��	724,{
	if(getskilllv(1011)) {
		emotion 32;
		mes "[�T�l��]";
		mes "����H�@�����p�H";
		mes "���[�A�킩�����B";
		mes "���񂽂����ɍ��ꂽ��!?";
		mes "�t�t�B�������͍߂�ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		next;
		mes "-�������������Ȃ�-";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_DC) {
		if(Sex) {
			mes "[�T�l��]";
			mes "������Ƃ��Z����B";
			mes "�����������ā�";
			mes "�i�`���b�j";
			emotion 30;
			misceffect 364,"";
			next;
			mes "-�Ȃ񂾂������ǂ��ǂ�����-";
			close;
		}
		else {
			mes "[�T�l��]";
			mes "����A����Ȃ�";
			mes "���o���񂪂��ꂢ�Ȃ̂�����`�H";
			mes "�@�̉����L�тĂ���B�ق��";
			next;
			mes "�i�c�c�����Ă��܂������c�c�H�j";
			close;
		}
	}
	if(JobLevel < 40) {
		mes "[�T�l��]";
		mes "����A�܂��܂���˂ˁB";
		mes "����������Ƒ傫���Ȃ��";
		mes "��l�O�̃��f�B�[�ɂȂ邱�Ƃ�";
		mes "��ς��ƕ�����悤�ɂȂ��B";
		mes "�E�ƃ��x����40�ʂɂȂ�Ȃ���";
		mes "������Ȃ�������H";
		close;
	}
	switch(SKILL_WINKCHARM) {
	case 0:
		mes "[�T�l��]";
		mes "�ɂ����c�c�ɂ�����ˁB";
		mes "���̔��e����͂�";
		mes "���̂܂܂ɂ��Ă��܂��̂�";
		mes "������ƁA���������Ȃ��Ȃ��H";
		next;
		mes "[�T�l��]";
		mes "���݂��邾���ł�";
		mes "���肪�����̂��������Ă����B";
		next;
		mes "[�T�l��]";
		mes "�ł��A��Ɏ����̖��͂̂��߁A";
		mes "�w�͂�ӂ����Ⴂ���Ȃ��Ƃ�������";
		mes "�����ƕ������Ă�H";
		mes "�ǂ��H";
		mes "���Ȃ��͎����̖��͂Ɏ��M������́H";
		next;
		if(select("�����A�ܘ_��I","�c�c���߂�Ȃ����c�c�c�c")==1) {
			mes "[�T�l��]";
			mes "�܂��܂���I�@���̂΂�!!";
			next;
			mes "�i�p�`���I�j";
			misceffect 1,"";
			percentheal -5,0;
			close;
		}
		mes "[�T�l��]";
		mes "�����̉߂���m���āA";
		mes "����𒼂����Ɠw�͂���Ȃ�";
		mes "�߂��ł͂Ȃ���B";
		mes "�ł��c�c";
		next;
		mes "[�T�l��]";
		mes "���܂�Ȃ���̒����������Ă���Ȃ�";
		mes "����͍߂�I";
		mes "��������!?";
		next;
		mes "�i�p�`���I�@�p�`���I�j";
		misceffect 1,"";
		percentheal -10,0;
		next;
		mes "[�T�l��]";
		mes "�����̒j�����̃n�[�g��D����";
		mes "�������f�B�[�ɐ��܂�Ă���̂ɁA";
		mes "���̒��x�̖��͂�";
		mes "�_���T�[�ƌ�����!?";
		next;
		mes "[�T�l��]";
		mes "�������ꂩ��A";
		mes "�l�X�̐S��n�����āA";
		mes "�����������C�ł����Ȃ��悤�ɂ��āA";
		mes "�V�g�������k�̂悤�ɂ��Ă��܂�";
		mes "���������͂�^���Ă�����B";
		next;
		mes "[�T�l��]";
		mes "���Ȃ��������ȃ��f�B�[�ɂ��Ă�����B";
		mes "�ǂ��H�@���ɔC���Ă݂Ȃ��H";
		next;
		if(select("����!!","���肢���܂��A�搶�I")==1) {
			mes "[�T�l��]";
			mes "�܂��킩���ĂȂ����!?";
			mes "���̎��̖��͂͂��񂽂��";
			mes "�f�R��Ȃ̂�I";
			mes "��y�̐����������Ă��I";
			next;
			mes "�i�p�`���I�@�p�`���I�@�p�`���I�j";
			misceffect 1,"";
			percentheal -10,0;
			next;
			mes "-���̐l����͂�����";
			mes "�����̖��͂��w�Ԃ��Ƃ��ł���̂��H-";
			mes "-�ƂĂ��^�₾���A";
			mes "�|���Č����Ԃ������ł��Ȃ��I-";
			close;
		}
		mes "[�T�l��]";
		mes "���������������̂�";
		mes "�����ւ̎��M��B";
		mes "�}�C���h�R���g���[����";
		mes "�C���[�W�g���[�j���O��";
		mes "���������f�B�[�ɂȂ邽�߂�";
		mes "�K�{�v�f��B";
		next;
		mes "[�T�l��]";
		mes "���ꂶ�Ⴀ�A�������";
		mes "^FF0000��^000000�������Ă��Ă����H";
		next;
		mes "[�Z�C�ȃT�l��]";
		mes "����A���̖ڂ��́H";
		mes "����Ȗڂœ˂������ĂȂ���";
		mes "�������ƍs���Ă���Ȃ���!?";
		next;
		misceffect 0;
		mes "�i�p�`���j";
		mes "-�ޏ��͕ڂŒn�ʂ�";
		mes "�����@����-";
		set SKILL_WINKCHARM,1;
		close;
	case 1:
		if(countitem(747) < 1) {
			misceffect 107;
			mes "[���ꂵ���T�l��]";
			mes "^FF0000��^000000��A^FF0000��^000000!!";
			mes "�����������ė������Ă����Ă�ł���I";
			close;
		}
		mes "[�T�l��]";
		mes "�����A���������Ă����Ȃ�";
		mes "��[�����Ă����Ȃ����B";
		mes "�����ĉ��x�������́B";
		mes "���͂��ꂢ�I";
		mes "���͖��͓I��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��c�c���͂��ꂢ�c�c";
		mes "�c�c���͖��͓I��c�c�c�c";
		next;
		mes "[���ȓ��������T�l��]";
		mes "�����Ƒ傫�Ȑ��ŁI";
		mes "���͔������I";
		mes "���͐��E�ň�Ԕ������I";
		next;
		misceffect 99,"";
		mes "[���ȓ�������" +strcharinfo(0)+ "]";
		mes "��A���͂ƂĂ�������!!";
		next;
		mes "-�Ȃ�ƁI-";
		mes "-���̒��ɉf���Ă���";
		mes "�����̎p���A�{����";
		mes "���E�ň�Ԃ��ꂢ�Ɍ�����-";
		delitem 747,1;
		set SKILL_WINKCHARM,2;
		close;
	case 2:
		mes "[�T�l��]";
		mes "�����A�܂��ŏ���";
		mes "�����̔�������m��́B";
		mes "�������������Ǝv����";
		mes "�N�ł����M�����Ă����";
		mes "���܂��Ă���̂�B";
		next;
		mes "[�T�l��]";
		mes "�ł��A�����玩���������Ǝv���Ă�";
		mes "���l�ɂ��������Ȃ�������";
		mes "�܂������̖��Ӗ��Ȃ̂�B";
		next;
		mes "[�T�l��]";
		mes "�����̖��͂�";
		mes "���l�ɔF�߂Ă��炢�����Ȃ�";
		mes "���̖��͂����ʓI��";
		mes "�\��������@���w�ԕK�v�������B";
		next;
		mes "[�T�l��]";
		mes "���̂��߂ɂ́A";
		mes "���̕���ɐ��ʂ����l��";
		mes "����Ă݂�ق���������ˁB";
		next;
		mes "[�T�l��]";
		mes "�v�����e�������̋߂���";
		mes "���̎o���񂪂����B";
		mes "���Ȃ��ɐF�X�����Ă����͂���B";
		next;
		mes "[�T�l��]";
		mes "����ł��A";
		mes "�����炢�ɔ������Ȃ�̂�";
		mes "�����X�^�[�ł���ς�B";
		mes "�z�[�z�z�z�z�z�z�B";
		next;
		emotion 7,"";
		mes "[�䖝����" +strcharinfo(0)+ "]";
		mes "�c�c�c�c!";
		next;
		mes "-�ς���N�̐S�Ɍ�����-";
		set SKILL_WINKCHARM,3;
		close;
	default:
		mes "[�T�l��]";
		mes "������ƁI";
		mes "�e�L�p�L���������ł��Ȃ��́H";
		mes "����Ȃӂ��Ƀ|�J�[���Ƃ��Ă���";
		mes "���̂���������������I";
		next;
		emotion 27;
		mes "[�T�l��]";
		mes "�v�����e�������̋߂���I";
		mes "�킩�����炳�����ƍs���I";
		mes "�f�n�A�f�n�A�f�n�I";
		close;
	case 7:
		mes "[�T�l��]";
		mes "�ǂ��H";
		mes "�����������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���ꂪ�c�c�b�̓r���Łc�c";
		mes "�A�G�����񂪁c�c�A���R�[���Łc�c";
		next;
		mes "[�T�l��]";
		mes "����ς�ˁB";
		mes "����Ȃ��Ƃ��낤�Ǝv������B";
		mes "��̉������������������B";
		next;
		mes "[�T�l��]";
		mes "�v����ɂ��Ȃ���";
		mes "��������΂����������������ǁA";
		mes "�ǂ�����Ă���΂����̂��A";
		mes "���@��������Ȃ��Ƃ������ƂˁH";
		next;
		mes "[�T�l��]";
		mes "�c�c";
		next;
		mes "[�T�l��]";
		mes "�Ă��I";
		misceffect 1,"";
		percentheal 5,0;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "????";
		mes "�������ł����I";
		next;
		mes "[�T�l��]";
		mes "�Ȃ�ł�����ł�";
		mes "�ꂩ�狳���Ă��炦��Ǝv���Ă�́I";
		mes "���ꂮ�炢�����ōl���Ȃ����I";
		next;
		mes "[�e�؂ȃT�l��]";
		mes "�c�c�c�c�ƌ��������������ǁB";
		mes "���͐e�؂ȃT�l�������􂾂��A";
		mes "��̂̃R�c�͋����Ă������B";
		next;
		mes "-�e�؂Ȑl�̏�����";
		mes "�l������Ȃ��A�Ƃ������Ƃ�";
		mes "�����Ă��Ȃ��̂��낤���H-";
		set SKILL_WINKCHARM,8;
		close;
	case 8:
		mes "[�e�؂ȃT�l�������]";
		mes "�R�c���������B";
		mes "1�b�Ԃ������ڂ����";
		mes "2�b��ɖڂ��J����́B";
		mes "����ȕ��ɁB";
		mes "�����ӂ��";
		emotion 21;
		next;
		if(select("�����ӂ�","���ӂ��","�����ӂ��")!=3) {
			mes "[�T�l��]";
			mes "������Ƃł��Ȃ���!?";
			next;
			mes "�i�p�`���I�j";
			misceffect 1,"";
			percentheal -5,0;
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ӂ��";
		emotion 21,"";
		misceffect 99,"";
		next;
		mes "-���������M���łĂ����I-";
		next;
		mes "[�T�l��]";
		mes "�悭�ł�����ˁB";
		mes "���̗v�̂�Y��Ȃ��悤�ɂˁB";
		mes "�`���b��";
		emotion 30;
		next;
		mes "[�T�l��]";
		mes "���ƁA����ӂ���_������Ƃ���ƁA";
		mes "�N�ł����̃E�B���N�ł��Ȃ��̗���";
		mes "�Ȃ�Ǝv�������ԈႢ��B";
		mes "���̒��ɂ͂��Ȃ��ł͎�ɂ��܂�悤��";
		mes "�����l�������ς�����̂�B";
		next;
		emotion 18;
		mes "[�T�l��]";
		mes "�������肪���Ȃ���苭���ƁA";
		mes "���̃E�B���N�͒ʂ��Ȃ���B";
		mes "�܂��͑����x�������";
		mes "�g���Ă݂��ق�����������";
		next;
		mes "[�T�l��]";
		mes "���ꂾ���̂ɖ����Ă�����";
		mes "����ȏ㋳���鎖�͂Ȃ���B";
		mes "�������X���X�ƈ�l�O�̃��f�B�[�Ƃ���";
		mes "�l�Ԃ��A�V�g���A������";
		mes "�F�A���ɂ��邱�Ƃ��ł�����";
		next;
		mes "[�T�l��]";
		mes "���ꂶ��A�������ʂ��B";
		mes "���x�܂������";
		mes "����������";
		mes "�P���Ă��Ȃ����B";
		next;
		misceffect 253,"";
		mes "^4D4DFF-���f�̃E�B���N�X�L�����o�����I-^000000";
		set SKILL_WINKCHARM,0;
		skill 1011,1,0;
		close;
	}
}

prontera,183,333,3	script	�A�G��	79,{
	if(getskilllv(1011)) {
		emotion 7;
		mes "[�����ɂ��A�G��]";
		mes "�c�c�E�E�E�c�c����������c�c";
		next;
		mes "[�A�G��]";
		mes "����A���Ȃ��́H";
		mes "�ւ��c�c";
		mes "���Ȃ痧�h�ȃ��f�B�[�Ɍ������B";
		next;
		mes "[�A�G��]";
		mes "���ꂩ��́A������";
		mes "��l�O�̃��f�B�[���Ǝ��o�Ȃ����B";
		mes "���f�B�[�͑��݂��邾����";
		mes "�F�̊��ӂ��󂯂鑶�݂Ȃ̂�B";
		next;
		mes "[�A�G��]";
		mes "�v��������Â��āA�ʁX�����˂āA";
		mes "�N���낤�ƁA���ł���������";
		mes "���肢���Ă݂Ȃ����B";
		next;
		mes "[�A�G��]";
		mes "�N�ł��Ђ��܂�������鎄�̂悤��";
		mes "�f�G�ȃ��f�B�[�ɂȂ��悤";
		mes "�F���Ă������B";
		mes "��ς����ǂˁA�E�t�t�`��";
		next;
		mes "-�{���ɂǂ��܂ł����Ă���o����-";
		close;
	}
	switch(SKILL_WINKCHARM) {
	default:
		mes "[�A�G��]";
		mes "�I�[�N�_���W�����A";
		mes "�O���X�g�w�C���A";
		mes "�~�����j�[���p�z�A";
		mes "�����Ń��[�v�|�[�^��";
		mes "���܂���`�I";
		next;
		mes "[??????]";
		mes "�܂�����Ƀ��[�v�|�[�^����";
		mes "�g���Ă��ł����I";
		mes "�A�G������I�@�ǂ��ł����I";
		mes "�����ɖ߂��Ă��Ȃ����I";
		next;
		emotion 23;
		mes "[�A�G��]";
		mes "��΁A�_���l���I";
		mes "�����ɂ��邱�Ƃ͔閧��!!";
		close;
	case 3:
		mes "[�A�G��]";
		mes "�I�[�N�_���W�����A";
		mes "�O���X�g�w�C���A";
		mes "�~�����j�[���p�z�A";
		mes "�����Ń��[�v�|�[�^��";
		mes "���܂���`";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		next;
		mes "[�A�G��]";
		mes "�ǂ��ɑ���܂��傤���H";
		mes "���[�v�|�[�^���͎O�ӏ��ł���`";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�T�l���̂��o����ł����H";
		next;
		mes "[�A�G��]";
		mes "��H�@�������B";
		mes "�����A���q���񂶂�Ȃ��񂾁B";
		mes "�����̔n���Ȗ����Љ�����ĂƂ��H";
		next;
		mes "-�ޏ��͂ƂĂ��������肵��";
		mes "�悤�����A����ĂĂ������Ȃ�";
		mes "�قُ΂�-";
		set SKILL_WINKCHARM,4;
		close;
	case 4:
		mes "[�A�G��]";
		mes "���̎q�̏Љ�Ȃ�";
		mes "�p���͑z������B";
		mes "�����ɋ����Ă�����邯�ǁA";
		mes "������������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����!?";
		next;
		mes "[�A�G��]";
		mes "���܂ł����Ƌq�񂹂��Ă�����";
		mes "�A���������̂�B";
		mes "�������ݕ��ł������ė��Ă���Ȃ��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���ݕ��ł����H";
		mes "�|�[�V�����Ƃ�!?";
		next;
		mes "[�A�G��]";
		mes "���񂽖{���ɋC�������Ȃ��ˁB";
		mes "���ݕ��ƌ�������";
		mes "^FF0000�A���R�[��^000000�ʂ͊�{��I";
		mes "���ق�I";
		next;
		mes "[�A�G��]";
		mes "�����Ă���������ƃZ���X������Ȃ�";
		mes "���܂݂������ė��Ă������ˁB";
		mes "�����̂��܂݂ɂ�^FF0000�ʕ�^000000��";
		mes "�s�b�^����ˁ`";
		next;
		mes "[�A�G��]";
		mes "^FF0000�����S��1��^000000�A";
		mes "^FF0000�o�i�i��3�{^000000�A";
		mes "^FF0000�N�b�L�[��5��^000000�A";
		mes "���̎O��^FF0000���M^000000��";
		mes "�����Ă��Ă��傤�����B";
		next;
		mes "[�A�G��]";
		mes "�ق�A�����ɍs���Ȃ�����!!";
		mes "���A�����̕���";
		mes "�C�Â���Ȃ��悤�ɂ��Ăˁ`�I";
		set SKILL_WINKCHARM,5;
		close;
	case 5:
		if(countitem(970) < 1 || countitem(512) < 1 || countitem(513) < 3 || countitem(538) < 5 || countitem(736) < 1) {
			mes "[�A�G��]";
			mes "�c�c�c�c";
			mes "�T�l�����������Ƃ���";
			mes "�{���Ƀg�����q���˂��B";
			next;
			mes "[�A�G��]";
			mes "^FF0000�A���R�[����1�{^000000�A";
			mes "^FF0000�����S��1��^000000�A";
			mes "^FF0000�o�i�i��3�{^000000�A";
			mes "^FF0000�N�b�L�[��5��^000000�A";
			mes "������^FF0000���M^000000�ɐ����Ă��āI";
			next;
			mes "[�A�G��]";
			mes "�ق�A�������Ƃ����������ė��āI";
			mes "����!!";
			mes "�A���R�[���΂񂴁[��!!!!!!!!!!!!";
			close;
		}
		mes "[�A�G��]";
		mes "�L���B������˂��B";
		mes "�A�����������͂���ς����ˁI";
		next;
		mes "-�ޏ��͏u���Ԃ�";
		mes "������S�Ă����炰��-";
		next;
		mes "[���@���A�G��]";
		mes "���������ρ`���A�����킹�`�I";
		mes "�悵�I";
		mes "���ꂶ�Ⴀ�A���񂽂�";
		mes "���̔閧�̃X�L����";
		mes "�`�����Ă������B";
		next;
		mes "[�A�G��]";
		mes "��J���Ȃ��Ŏ����̖��͂�";
		mes "����ɃA�s�[�����邱�Ƃ��ł���̂�";
		mes "�����킩��H";
		mes "�����^FF0000�E�B���N^000000��A^FF0000�E�B���N^000000�B";
		next;
		mes "[�A�G��]";
		mes "�P���ɕЕ��̖ڂ��ނ�B";
		mes "����ȏ����ȓ���Ȃ̂ɁA";
		mes "���̌��ʂ͂܂�ŃX�N���[���B";
		mes "�n�[�g�ɓ˂��h����";
		mes "�_�u���X�g���C�t�B���O!!";
		mes "�ƌ����Ă��ߌ�����Ȃ����`�I";
		next;
		mes "-�ޏ��͐�����������̂��A";
		mes "�悭�킩��Ȃ��Z���t��";
		mes "�����Ȃ���b���n�߂�-";
		next;
		mes "[�A�G��]";
		mes "�ڂ�������Ƃނ邾���ŁA";
		mes "�l�Ԃł��A�����ł��A�V�g������";
		mes "�����Ƃ����Ԃɍ��ꂳ����";
		mes "���܂��̂�B";
		next;
		mes "[�����������A�G��]";
		mes "���̏�Ƀn�[�g�������񂾂琬����B";
		mes "�U�������Ă��������X�^�[��";
		mes "���񎞂����́A���񂽂̗��`�j�n�n�B";
		next;
		mes "[�����������A�G��]";
		mes "�����Ȃ��Ă��A";
		mes "�����l�̂悤�ɖ���Ȃ�����̂̓_���B";
		mes "���ꂶ�Ⴀ�ܐ�N�̈����";
		mes "�����֔��ł����Ⴄ��`�B";
		next;
		emotion 21;
		mes "[�����������A�G��]";
		mes "�患���I";
		mes "���̃E�B���N�����ĂȂ����I";
		mes "����Ȋ�����I";
		mes "�i�����ӂ�j";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c����!?";
		mes "�Ȃ����c�c";
		mes "�Ȃ񂾂����Ȃ������ꂢ�Ɍ�����!!";
		mes "���ꂢ�Ɍ������I";
		mes "���Ȃ��̎���";
		mes "�D���ɂȂ���������݂����I";
		next;
		emotion 18;
		mes "[�����������A�G��]";
		mes "�E�t�t���B�N�G���Ⴄ�̂�`�I";
		mes "�����{�C�ɂȂ����Ⴆ��";
		mes "�o�t�H���b�g��I�[�N�q�[���[�A";
		mes "�G���W�F�����O������";
		mes "���ɂł����Ⴄ�񂾂���`�I";
		mes "�A�n�n�n�n�n���n�`��";
		next;
		percentheal -10,0;
		misceffect 1,"";
		emotion 9,"";
		mes "-�ޏ��͂��Ȃ��̓����΂��΂��@����";
		mes "�C�����ǂ������ɏ΂���-";
		mes "-�ƂĂ�������������";
		mes "�Ȃ�Ƃ������ꂽ-";
		delitem 970,1;
		delitem 512,1;
		delitem 513,3;
		delitem 538,5;
		delitem 736,1;
		set SKILL_WINKCHARM,6;
		close;
	case 6:
		mes "[" +strcharinfo(0)+ "]";
		mes "�i������Ƃ��o����̃E�B���N�́A";
		mes "���������ʂ��������ǁc�c�j";
		mes "�������ʂɃE�B���N���Ă�";
		mes "���߂݂����c�c";
		mes "�����R�c�ł������!?";
		next;
		mes "[�Q�Ă���A�G��]";
		mes "zZzz�c�cZzzz�c�c";
		mes "�c�c�c�c�ނɂ�c�c";
		mes "���͂������[�c�c";
		mes "�c�czzzZzz�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������!!";
		mes "�Q�Ȃ��ŁI�@�N���āI";
		mes "�R�c��������!!";
		next;
		mes "[�Q�N���̃A�G��]";
		mes "�N������!!!!";
		mes "�������֍s��!!";
		set SKILL_WINKCHARM,7;
		close2;
		warp "prontera",156,272;
		end;
	case 7:
	case 8:
		mes "[" +strcharinfo(0)+ "]";
		mes "������ƁA������̂�!!";
		next;
		mes "[�A�G��]";
		mes "�ނɂ�ނɂ�B";
		mes "�������N���������I";
		mes "���Ƃ͖��ɂł������Ȃ����I";
		close2;
		warp "prontera",156,272;
		end;
	}
}


//-----------------------------------------------
//==== �t�F�C�N�[�j�[ - BS_UNFAIRLYTRICK
//	�� SKILL_UNFAIRLYTRICK   -> 0�`6
//-----------------------------------------------
geffen,178,72,3	script	�A�L	726,{
	if(getskilllv(1012)) {
		if(getskilllv(1013) < 1) {
			mes "[�A�L]";
			mes "�u���b�N�X�~�X�̐V�����X�L��";
			mes "^FF0000�O���[�h^000000���o�������Ȃ�";
			mes "���������ɂ���";
			mes "�O�b�h�f�[�����q�˂ĉ������B";
			close;
		}
		mes "[�A�L]";
		mes "���v���Ԃ�ł��I";
		mes "�܂��A���Ԃ������";
		mes "�q�˂ė��ĉ������I";
		mes "���͋Ζ��n���ς��܂ł�";
		mes "�����Ƃ����ɂ���\��ł�����I";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_BS) {
		mes "[�A�L]";
		mes "�����V�C�ł��ˁI";
		mes "�����݂����ȓ��͖{����";
		mes "���B���a�ł���ˁI";
		next;
		mes "[�A�L]";
		mes "�Y��Ȑ��������J�ŁA";
		mes "�ǂ��ޗ��ƍ����x�̉΂��g���āA";
		mes "���B���v�������肵�����ł��ˁ[�B";
		close;
	}
	if(JobLevel < 30) {
		mes "[�A�L]";
		mes "���̓u���b�N�X�~�X�M���h�ŁA";
		mes "�吨�̃M���h�̊F����ɃX�L����";
		mes "����������ׂɔh�����ꂽ�w�A�L�x";
		mes "�ƌ����܂��B";
		next;
		mes "[�A�L]";
		mes "�\����Ȃ��̂ł����A";
		mes "[ "+strcharinfo(0)+" ]�l��";
		mes "�W���u���x�����s�����Ă���";
		mes "�o���鎖�͂ł��Ȃ��̂ł��B";
		close;
	}
	switch(SKILL_UNFAIRLYTRICK) {
	case 0:
		mes "[�A�L]";
		mes "����ɂ��́[�I";
		mes "�����͓V�C���ƂĂ��ǂ��ł��ˁB";
		mes "����ȓ��ɂ͏������������ǁA";
		mes "�������ɏo������̂�";
		mes "�����Ȃ��ł��ˁB";
		next;
		mes "[�A�L]";
		mes "���̓u���b�N�X�~�X�̐V�����X�L��";
		mes "^FF0000�t�F�C�N�[�j�[^000000������������ׂ�";
		mes "�u���b�N�X�~�X�M���h����h�����ꂽ�A";
		mes "�E���̃A�L�ƌ����܂��B";
		next;
		mes "[�A�L]";
		mes "��������������V�X�L����";
		mes "^FF0000�t�F�C�N�[�j�[�́A";
		mes "�����X�L���̃��}�[�i�C�g��";
		mes "zeny����ʂ�10�p�[�Z���g��";
		mes "����������p�b�V�u�X�L���ł��B^000000";
		next;
		mes "[�A�L]";
		mes "�������ƓI�ȖڂŌ������A";
		mes strcharinfo(0)+ "�l��";
		mes "���̃X�L�����w�ׂ΂ƂĂ��L����";
		mes "�g�p�ł���Ǝv���܂��ˁB";
		next;
		mes "[�A�L]";
		mes "�ǂ��ł����H";
		mes "������@��Ɋw��ł݂܂��񂩁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�c�c�c�c�c�c�c�c�c�c-";
		mes "-�u���b�N�X�~�X�M���h�Ј��w�j����-";
		mes "-�����Ă���p���t���b�g��-";
		mes "-���Ȃ��玄�ɓǂݏグ�Ă���-";
		next;
		if(select("�����Ă��炤","�f��I")==2) {
			mes "[�A�L]";
			mes "�����I�@�Ȃ��ł����I";
			mes "��������Ȃ�����������ł���!?";
			mes "�����Ȃ�ł����I�H";
			next;
			mes "[�A�L]";
			mes "���킟������I";
			mes "�w��ł����ĉ������[�I";
			mes "�{���ɔM�S�ɋ����܂�����I";
			mes "���񂨊肢���܂��[�I";
			next;
			mes "[�A�L]";
			mes "�u���b�N�X�~�X�M���h�̉ے��������A";
			mes "���ɕK�����т����ė��Ȃ�����";
			mes "��������ł��[�I";
			mes "�����c�c�c�c";
			mes "���A����n���������Ȃ���";
			mes "�����Ȃ��̂��ȁc�c";
			next;
			mes "[�A�L]";
			mes "�ł��d���Ȃ��ł��ˁc�c";
			mes "�������܂��{��ꂿ�Ⴄ���ǁc�c";
			mes "�ӂ���������I";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ĉ������B";
		next;
		mes "[�A�L]";
		mes "�悭�������Ă���܂����I";
		mes "����u���b�N�X�~�X�M���h��";
		mes "�ӗ~�I�ɊJ�������X�L���ł�����I";
		mes "�ӂӂӁB";
		next;
		mes "[�A�L]";
		mes "�ł́A�ꉞ���̃X�L���̌�����";
		mes "��ɐ������܂��ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�܂���قǂ̃p���t���b�g��-";
		mes "-�L���Ă����ǂݎn�߂�-";
		next;
		mes "[�A�L]";
		mes "^FF0000�t�F�C�N�[�j�[^000000�Ƃ�";
		mes "���}�[�i�C�g�Ɏg����zeny�̈ꕔ��";
		mes "�͑��i���g�p���āA";
		mes "�З͂͂��̂܂܂ŏ���zeny��";
		mes "�ߖ񂷂�p�b�V�u�X�L���ł��B";
		next;
		mes "[�A�L]";
		mes "���̃X�L�����w�Ԉׂɂ́A";
		mes "�͑��i�����Ȃ����";
		mes "�Ȃ�Ȃ��̂ŁA���������ޗ���";
		mes "��������W�߂Ď��Ɏ����Ă���";
		mes "�������B";
		next;
		mes "[�A�L]";
		mes "�X�L���K���ɕK�v�ȕ��́A";
		mes "�|�S1�A�ΒY5�A�|�S�̋���1��";
		mes "�����āc�c���[��c�c�����Ɓc�c";
		mes "���[��Ɓc�c��������c�c�B";
		next;
		mes "[�A�L]";
		mes "�����I�@���X���҂��������I";
		mes "���܂��V����Ȃ̂Łc�c";
		mes "����c�c�ǂ������������c�c";
		mes "�����ɐ��������ė����̂ɁA";
		mes "�ǂ��[�[!?";
		next;
		mes "[�A�L]";
		mes "-�y���y���c�c-";
		next;
		mes "[�A�L]";
		mes "�����[�I�������I";
		mes "����܂����A����܂����[�I";
		mes "����ł͑��������Ă��������܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[�A�L]";
		mes "�|�S1�A�ΒY5�A�|�S�̋���1�A";
		mes "�͑��i�����ׂ�500zeny�B";
		mes "�����ăf�B�g���~��1���K�v����";
		mes "�����ɏ����Ă��܂��ˁB";
		mes "���͂́I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�c�c�c�c-";
		mes "-�ʂ��Ă��̎q��-";
		mes "-�X�L���������鎖��-";
		mes "-�ł���񂾂낤���c�c-";
		next;
		mes "[�A�L]";
		mes "��" +strcharinfo(0)+ "�l�̊��";
		mes "���������Ƌ������񂾂낤���H";
		mes "���Ă����\������܂���ł�����!?";
		mes "�{���ɂ����v���Ă�����ł����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��A�����ł��B";
		next;
		mes "[�A�L]";
		mes "�����c�c����ς�c�c";
		mes "�ł��A�u���b�N�X�~�X�M���h�ɓ�����";
		mes "3�����c�c�A�L�͕����܂���!!";
		mes "���v�ł��I�S�z���Ȃ��ŉ������I";
		mes "��D�ɏ��������ŔC���ĉ������I";
		mes "���͂͂͂͂́I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[�A�L]";
		mes "�ꉞ�ޗ������W�߂Ă��܂���";
		mes "�����Ƌ����鎖���ł���͂��ł��I";
		next;
		mes "[�A�L]";
		mes "�����I����ł͂���������������";
		mes "�ޗ����W�߂Ă��ĉ������I";
		next;
		mes "[�A�L]";
		mes "�m�F�ׂ̈�����x�����܂����A�ޗ���";
		mes "�|�S1�A�ΒY5�A�|�S�̋���1��";
		mes "500zeny�ƃf�B�g���~��1��";
		mes "�K�v�ł��I";
		mes "�Y��Ȃ��ŉ������ˁI";
		next;
		mes "[�A�L]";
		mes "�����I�o���o���[�I";
		mes "���͂��̊Ԃɔ����Ă������p����";
		mes "�H�ׂĂ��܂��ˁB";
		mes "���������c�c";
		set SKILL_UNFAIRLYTRICK,1;
		close;
	case 1:
		if(countitem(999) < 1 || countitem(1003) < 5 || countitem(613) < 1 || countitem(971) < 1) {
			mes "[�A�L]";
			mes "�ޗ��͑S�Ď�ɓ���ė��܂������H";
			mes "���[��c�c�ǂ�ǂ�c�c";
			mes "����H�ޗ�������Ȃ��ł��ˁ[�B";
			next;
			mes "[�A�L]";
			mes "������x�����܂����A�ޗ���";
			mes "�|�S1�A�ΒY5�A�|�S�̋���1��";
			mes "500zeny�ƃf�B�g���~��1��";
			mes "�K�v�ł��B";
			mes "�Y��Ȃ��ŉ������ˁI";
			close;
		}
		if(Zeny < 500) {
			mes "[�A�L]";
			mes "�͑��i�����̂Ɏg��500zeny��";
			mes "�Ȃ��݂����ł��ˁB";
			mes "���������ė��ĉ������ˁB";
			close;
		}
		mes "[�A�L]";
		mes "�ǂ��ł����H";
		mes "�ޗ���S�Ď�ɓ���ė��܂������H";
		mes "��x�m�F���Ă݂܂��傤��";
		mes "�ӂނӂށc�c";
		next;
		mes "[�A�L]";
		mes "���m�ɏW�߂Ă��܂����ˁ[�A";
		mes "�f���炵���ł��I";
		next;
		mes "[�A�L]";
		mes "�ꉞ����Ŏ�����ɃX�L���ޗ���";
		mes "�e�X�g����x����Č����܂��̂ŁA";
		mes "�����̊ԑ҂��Ăĉ������B";
		delitem 999,1;
		delitem 1003,5;
		delitem 613,1;
		delitem 971,1;
		set Zeny,Zeny-500;
		set SKILL_UNFAIRLYTRICK,2;
		close;
	case 2:
		mes "[�A�L]";
		mes "����!!";
		mes "������������Ⴂ�܂������c�c";
		mes "�c�c�c�c�c�c�c�c�c�c�c�c";
		mes "���[�Ɓc�c������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		mes "[�A�L]";
		mes "���́c�c�ޗ���a�����āA";
		mes "������낤�Ƃ����̂ł����A";
		mes "���s���Ă��܂��܂����c�c";
		mes "���킟������I�@�\���󂠂�܂���I";
		mes "�ǂ����A�ǂ����M���h�ɂ�";
		mes "����Ȃ��ŉ������[�I";
		next;
		mes "[�A�L]";
		mes "������x�`�����X���������I";
		mes "���x�������������Ă݂��܂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�{���Ɂc�c�H";
		next;
		mes "[�A�L]";
		mes "���肢���܂��I";
		mes "�|�S1�ƐΒY3�����܂�";
		mes "��ɓ���ĉ������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������܂����B";
		mes "���ꂾ���W�߂Ă���΂�����ł��ˁH";
		next;
		mes "[�A�L]";
		mes "�͂��I�@�����ł��I";
		mes "���Ȃ��͖{���ɗǂ��l�ł��I";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�A�L]";
		mes "������x�����Ă���ޗ��̊m�F�ł��B";
		mes "�|�S1�ƐΒY3�ł��I";
		mes "��낵�����肢���܂��I";
		mes "�t�@�C�g�I�@�t�@�C�g�I";
		set SKILL_UNFAIRLYTRICK,3;
		close;
	case 3:
		if(countitem(999) < 1 || countitem(1003) < 3) {
			mes "[�A�L]";
			mes "������x�����Ă���ޗ��̊m�F�ł��B";
			mes "�|�S1�ƐΒY3�ł��I";
			mes "��낵�����肢���܂��I";
			mes "�t�@�C�g�I�@�t�@�C�g�I";
			close;
		}
		mes "[�A�L]";
		mes "�킠�I�@�����ė��ĉ���������ł��ˁI";
		mes "�{���ɂ��肪�Ƃ��[�I";
		mes "���x�͖{���ɂ��܂����܂��I";
		mes "����ł͏����҂��Ăĉ������I";
		delitem 999,1;
		delitem 1003,3;
		set SKILL_UNFAIRLYTRICK,4;
		close;
	case 4:
		mes "[�A�L]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�H";
		next;
		mes "[�A�L]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c�܂���!!";
		mes "�܂�!?";
		next;
		mes "[�A�L]";
		mes "���킟������I";
		mes "�������n�߂���|�S�̋��Ƃ��܂��";
		mes "���������ł��Ȃ�������ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�ǂ����V�����|�S�̋��Ƃ�-";
		mes "-�����ė��Ȃ���΂Ȃ�Ȃ��悤��-";
		mes "-�c�c�c�c�ǂ����Ă��낤���c�c-";
		mes "-���̂���������c�c-";
		set SKILL_UNFAIRLYTRICK,5;
		close;
	case 5:
		if(countitem(613) < 1) {
			mes "[�A�L]";
			mes "�|�S�̋��Ƃ������āc�c";
			mes "�������c�c������";
			mes "������x�����Ă��Ă����΁A";
			mes "�{���ɍ��x�������������Ă݂��܂��I";
			close;
		}
		mes "[�A�L]";
		mes "�����[�I";
		mes "�����Ă��Ă��ꂽ��ł��ˁI";
		mes "�����ł��I";
		next;
		mes "[�A�L]";
		mes "�����{���̖{���ɂ���";
		mes "���������܂���ŁA";
		mes "�����҂��ĉ������I";
		delitem 613,1;
		set SKILL_UNFAIRLYTRICK,6;
		close;
	case 6:
		mes "[�A�L]";
		mes "�����c�c�c�c";
		mes "�킟������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����������!?";
		mes "�܂����܂�����Ȃ��ł��傤��!?";
		next;
		mes "[�A�L]";
		mes "�Ȃ񂿂���āI�@�����ł��I";
		mes "���͂͂͂́I";
		mes "�����A���߂�Ȃ����I";
		mes "�{��Ȃ��ŉ������c�c";
		mes "��x������������Ă݂���������ł��B";
		next;
		mes "[�A�L]";
		mes "�X�L�����������āA";
		mes "�����e�X�g���Ă݂����A";
		mes "�����ł����݂���������";
		mes "^FF0000�t�F�C�N�[�j�[^000000���A";
		mes "���������܂��ˁB";
		next;
		if(getskilllv(1013) < 1) {
			mes "[�O�b�h�f�[]";
			mes "����Ƃ��̃X�L�����o�������";
			mes "���̐�y�̃O�b�h�f�[����ɉ��";
			mes "�V�X�L����^FF0000�O���[�h^000000��";
			mes "�����Ă����Ǝv���܂��B";
			next;
		}
		mes "[�A�L]";
		mes "����ł͂������������܂��B";
		mes "���Ǝ��������݂��ĉ������B";
		mes "-���������@�Ђ��Ђ�-";
		next;
		mes "[�A�L]";
		mes "���������������ʂ��";
		mes "���܂��g���ĉ������B";
		mes "���̎��s�̂����Ŗ��f��������";
		mes "�{���ɐ\���󂠂�܂���ł����B";
		next;
		mes "[�A�L]";
		mes "�܂��A���Ԃ������";
		mes "�q�˂ė��ĉ������I";
		mes "���͋Ζ��n���ς��܂ł�";
		mes "�����Ƃ����ɂ���\��ł�����B";
		mes "����ł͂��C�����Ė`���̑������I";
		mes "���ꂶ�Ⴀ�A�܂��ˁI";
		set SKILL_UNFAIRLYTRICK,0;
		skill 1012,1,0;
		close;
	}
}


//-----------------------------------------------
//==== �O���[�h - BS_GREED
//	�� SKILL_GREED   -> 0�`1
//-----------------------------------------------
geffen,172,52,1	script	�O�b�h�f�[	826,{
	if(getskilllv(1013)) {
		mes "[�O�b�h�f�[]";
		mes "�w�񂾃X�L���͗ǂ�";
		mes "�g���Ă��邩�ȁH";
		mes "���������܂�~���肷���Ȃ��悤�ɁA";
		mes "�F�X�ȏ��𒭂߂Ȃ���`�����Ȃ����B";
		close;
	}
	if(getbaseclass(Class,2) != CLASS_BS) {
		mes "[�O�b�h�f�[]";
		mes "�����݂����ȓ��̓J�o����w�����āA";
		mes "�������R�ɂł��o���Ėʔ�������";
		mes "�M�d�ȕ��T���ɍs�������Ȃ�ȁB";
		mes "���O���u���b�N�X�~�X�ɂȂ���";
		mes "�݂���킩��Ǝv�����I";
		close;
	}
	switch(SKILL_GREED) {
	case 0:
		mes "[�O�b�h�f�[]";
		mes "���̓u���b�N�X�~�X�M���h��";
		mes "�X�L���`���S���𓝊����Ă���";
		mes "�}�X�^�[�O�b�h�f�[�Ƃ����I";
		mes "�F�A�����O�b�h�}���ƌĂԂ�B";
		next;
		mes "[�O�b�h�}��]";
		mes "���x�V���ɏ��l����ƈꏏ��";
		mes "�J�������X�L�����A���l�����";
		mes "�u���b�N�X�~�X�M���h�����ŁA";
		mes "�M���h�����o�[�ɋ�����";
		mes "�C�x���g�����Ă���B";
		next;
		mes "[�O�b�h�}��]";
		mes "����ō���̃C�x���g�ׂ̈ɁA";
		mes "���炪�\���ł͂Ȃ��V���Ј�";
		mes "�܂ŊO�ɏo�Ďd�������Ă����B";
		mes "���������܂Ŏ��܂ł���ȋ�J";
		mes "����͂߂ɂȂ��Ă���񂾁B";
		next;
		mes "[�O�b�h�}��]";
		mes "���O���u���b�N�X�~�X�̂悤���ȁB";
		mes "�V�����J�����ꂽ�X�L��^FF0000�O���[�h^000000��";
		mes "�w��ł݂Ȃ����H";
		mes "�w�ԁA�w�΂Ȃ��͂��O�̑I�����A";
		mes "�������������̂����������Ȃ�";
		mes "�ǂ��X�L�������B";
		next;
		mes "[�O�b�h�}��]";
		mes "���O���w�Ԃ̂Ȃ�A";
		mes "�ȒP�ȃX�L���̐�����";
		mes "���̕��@�������ɋ����悤�B";
		mes "�ǂ����ȁH";
		next;
		if(select("�����ł��ˁA�����ĉ�����","��ł��肢���܂�")==2) {
			mes "[�O�b�h�}��]";
			mes "���[��c�c�������B";
			mes "�Ⴂ�z�͂����Z���������ˁB";
			mes "�����ɂ����Ԃ��؂Ɏg���񂾂��B";
			close;
		}
		mes "[�O�b�h�}��]";
		mes "���[��A�������f���B";
		mes "����V���ɊJ�����ꂽ�X�L���́A";
		mes "^FF0000�O���[�h^000000�́A�X�L�����g���ƁA";
		mes "�����̎���2���ȓ��͈̔͂ɂ���A";
		mes "�E���\�ȑS�Ă̕����A";
		mes "�܂Ƃ߂ďE����ƂĂ��֗��ȃX�L�����B";
		next;
		mes "[�O�b�h�}��]";
		mes "�`�����t�B�[���h�ɗ����������A";
		mes "��y�ɑf����������鎖���ł��邩��A";
		mes "�ƂĂ��֗��ȃX�L�����B";
		next;
		mes "[�O�b�h�}��]";
		mes "�ꉞ�A������X�L����������O�ɁA";
		mes "���O���X�L�����o���鎑�i��";
		mes "�����Ă��邩�A�ȒP�ȃe�X�g�ۑ��";
		mes "�o������A�ǂ������Ă����B";
		next;
		mes "[�O�b�h�}��]";
		mes "^FF0000���̎�ނ���Ɋ֌W�Ȃ��A";
		mes "���O�̏����d�ʂ̗]�T��";
		mes "500���Ȃ���Ԃɂ���";
		mes "���ɉ�ɗ��Ȃ����B^000000";
		next;
		mes "[�O�b�h�}��]";
		mes "���̏o���ۑ�͂���őS�����B";
		mes "���ꂶ�Ⴀ�A�������Ȃ��Ă��Ă���B";
		set SKILL_GREED,1;
		close;
	case 1:
		if((MaxWeight - Weight) >= 5000) {
			mes "[�O�b�h�}��]";
			mes "���[��c�c���߂��Ȃ��B";
			mes "�ЂƖڌ��Ă������������ۑ�𖞂�����";
			mes "�Ȃ��Ƃ킩��ȁB";
			mes "�������ۑ�������Ă����悤�B";
			mes "���͂��Ȃ��Ă��Ă����B";
			next;
			mes "[�O�b�h�}��]";
			mes "^FF0000���̎�ނ���Ɋ֌W�Ȃ��A";
			mes "���O�̏����d�ʂ̗]�T��";
			mes "500���Ȃ���Ԃɂ���";
			mes "���ɉ�ɗ��Ȃ����B^000000";
			close;
		}
		mes "[�O�b�h�}��]";
		mes "��H�@�����s���ė����̂��H";
		mes "�v���Ă�����肷�������ȁB";
		mes "�ǂ�A��x�J�o���������Ă���B";
		mes "���[��c�c�c�c�c�c�c�c";
		next;
		mes "[�O�b�h�}��]";
		mes "�ǂ�ǂ�c�c";
		mes "���[��c�c�����������ۑ��";
		mes "��������Ƃ��Ȃ��ė��Ă��ꂽ�ȁB";
		mes "�悵�I�@���i���B";
		next;
		mes "[�O�b�h�}��]";
		mes "���O�����̕����W�߂�ׂ�";
		mes "�߂��������Ԃƌo�����A";
		mes "�P���ɂ�����S�Ă����ɕς�������";
		mes "���l�����A�����Ƒ�؂Ȃ��̂Ȃ񂾂�";
		mes "���������������������񂾁B";
		next;
		mes "[�O�b�h�}��]";
		mes "�^�̃u���b�N�X�~�X�Ȃ�A";
		mes "���̐��ɑ��݂���قƂ�ǑS�Ă�";
		mes "����ڂŌ��āA����������΂���";
		mes "���h�Ȑ����\�͂ƁA����ɂӂ��킵��";
		mes "�x�Ɩ��_�������Ƃ��ł����";
		mes "���͎v���Ă����B";
		next;
		mes "[�O�b�h�}��]";
		mes "���̃e�X�g�ƁA�������O�ɋ�����";
		mes "�X�L���Ƃ͒��ړI�Ȋ֘A�͂Ȃ���";
		mes "�v���邪�A�����u���b�N�X�~�X��";
		mes "�Ȃ肽�Ă̂���A���̂��t���l��";
		mes "���ɗ^�����e�X�g�Ƃ��̋����Ȃ񂾁B";
		next;
		mes "[�O�b�h�}��]";
		mes "�ŋ߂͎�y�ɂ����Ɩ��_��";
		mes "���悤�Ǝv���҂������A";
		mes "�����ŉ��l��t���鎖�̂ł���";
		mes "���ƕ����݂̂����Đ��̒���";
		mes "������l�������Ȃ��Ă��āA";
		mes "��������邽�тɋ����ɂދC�������B";
		next;
		mes "[�O�b�h�}��]";
		mes "���̒��ԂƑ����̐l�X���K�v�Ƃ���";
		mes "�ޗp�═���b����ׂɁA";
		mes "����Ɏg���ޗ������߂āA";
		mes "�����ςȖ`���̗��ɏo��I";
		mes "����Ȗ��͓I�Ŋi�D�ǂ��E�Ƃ�";
		mes "�u���b�N�X�~�X������ˁB";
		next;
		mes "[�O�b�h�}��]";
		mes "���A�������O�ɋ�����X�L���̖��O��";
		mes "^FF0000�O���[�h^000000�ƌ������A";
		mes "����́w�×~�x�Ƃ����Ӗ��Ȃ񂾁B";
		mes "���O�����̃X�L�����o���Ďg���悤��";
		mes "�Ȃ�����A���̖��O�ŌĂ΂��悤��";
		mes "�Ȃ鎖���F���Ă����B";
		next;
		mes "[�O�b�h�}��]";
		mes "�����A���ꂶ�Ⴀ�����悤���I";
		set SKILL_GREED,0;
		skill 1013,1,0;
		close;
	}
}


//-----------------------------------------------
//==== ���f�B���v�e�B�I - PR_REDEMPTIO
//	�� SKILL_REDEMPTIO   -> 0�`2
//-----------------------------------------------
prt_church,111,112,2	script	���C�i�[�X�C����	79,{
	if(getskilllv(1016)) {
		mes "[���C�i�[�X�C����]";
		mes "���͊F�l�̖��������F�肵�Ă���܂��B";
		close;
	}
	switch(SKILL_REDEMPTIO) {
	default:
		mes "[���C�i�[�X�C����]";
		mes "�閾���̔Ԑl��A";
		mes "���Ȃ��̌��Ŕޏ��𓱂��ĉ������c�c�B";
		mes "��炪��I�[�f�B����A";
		mes "���Ȃ��̖����̎��߂ƈ���";
		mes "���^�����������c�c";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���Ȃ��̑O�ɗ��������炩�ȍ���";
		mes "����Ɏv���̂ł���΁A";
		mes "�ނ炪�肤�i���̈������c�c�B";
		mes "���Ȃ��̐_�X�����P���i���̌���";
		mes "�ނ���Ƃ炵�ĉ������c�c�B";
		if(getbaseclass(Class,2) != CLASS_PR)
			close;
		next;
		menu "�ǂȂ��ׂ̈ɋF���Ă���̂ł����H",-;
		mes "[���C�i�[�X�C����]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���̐́A�Ƃ���c���C���������܂����B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�ƂĂ����Ă�΂ŁA";
		mes "�F�X�Ə����Ȃ��������";
		mes "��������N�����Ă����̂ł����A";
		mes "�������邭�ĉ����q�ł����B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�`���҂̊F�l�͎���댯�Ȓn���I�сA";
		mes "�������ďC�s��ς񂾂肵�܂��B";
		mes "�����Ă��̖`���̗��͊댯�ȏꏊ�ق�";
		mes "���E�҂��K�v�ɂȂ�Ƃ�������";
		mes "�����m���Ǝv���܂��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "������A�Ƃ���`���ҒB��";
		mes "�`���ɓ��s���Ă���鐹�E�҂�{����";
		mes "�������q�˂ė�����������܂��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�c�c������^���̂�������ł��傤���H";
		mes "�吹���͂��̓��Ɍ����āA";
		mes "���̖`���ɓ��s���鎖���ł���";
		mes "��̋󂢂Ă��鐹�E�҂��N��";
		mes "���Ȃ����������ł��B";
		mes "�c�c���̎q�����������āB";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���X�D��S�̋�������";
		mes "���̎q�͂��Ȃ蒷���ԑʁX�����˂�";
		mes "���ǂ��̃p�[�e�B�[�ɎQ�����鎖��";
		mes "�Ȃ�܂����B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�ނ�͂ƂĂ��댯���Ƃ���";
		mes "^3131FF�O���X�g�w�C��^000000�ɍs���A";
		mes "�����Ő������̐킢�����A";
		mes "�����ނ����Ƃ����܂��B";
		mes "���̎q�����Ȃ蕱�����������ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�����Ĕނ�́c�c���̖`���̍Ō��";
		mes "��ϊ�@�I�ȏ󋵂Ɋׂ�܂����B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "^3131FF�f�r����^000000�炪�������񂢂�A";
		mes "�O���X�g�w�C���ł��ł��댯�ȏꏊ�ŁA";
		mes "���̎q���������S�Ă̒��ԒB���|��āA";
		mes "���ɂ��p�[�e�B�[���S�ł��Ă��܂��B";
		mes "�Ƃ����󋵂ł����B";
		next;
		menu "����Ŕނ�͂ǂ��Ȃ�����ł����H",-;
		mes "[���C�i�[�X�C����]";
		mes "�S�Ă̒��ԒB���퓬�s�\�ɂȂ������A";
		mes "���̎q�͌Â̌o���������n�߂܂����B";
		next;
		menu "���̌o���Ƃ́H",-;
		mes "[���C�i�[�X�C����]";
		mes "^FF0000�c�c���f�B���v�e�B�I^000000";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���E�҂̒��ł����͂̂���҂�����";
		mes "�g����Ƃ������̃X�L�����I";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���f�B���v�e�B�I�Ƃ͎������ӂ�";
		mes "�p�[�e�B�[�����o�[��퓬�s�\����";
		mes "�񕜂����āA����Ɏ��g��";
		mes "�퓬�s�\�̏�ԂɂȂ�B";
		mes "^3131FF���E�ҍō��̊�Ղ��N�����X�L��^000000�ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�{�Ȃ�Ă܂�Ȃ��ƂقƂ��";
		mes "�׋������Ȃ��������̎q���A";
		mes "�F����@�̏u�ԂɃ��f�B���v�e�B�I��";
		mes "�o�����v���o���Ē��ԒB��";
		mes "�����邽�߂Ɋ撣�����̂ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���炭���̏u�Ԕޏ���";
		mes "�ƂĂ��h�������ł��傤�ˁB";
		mes "�����̖��͂��������鎞��";
		mes "�h�����Ƃ͂Ȃ��ł��傤�B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "��Ղ��N�������ƐS����F�����A";
		mes "���̎q�̊肢��_�l�������͂���";
		mes "���ꂽ�̂ł��傤���H";
		mes "���f�B���v�e�B�I�����������̂ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "��ՓI�ɗ͂����߂������ԒB��";
		mes "����̓G��Еt���A�C�O�h���V���̗t��";
		mes "���̎q�������N�����āA";
		mes "�����`�����I���ăv�����e����";
		mes "�����ɋA���Ă��܂����B";
		next;
		mes "[^3131FF" +strcharinfo(0)+ "^000000]";
		mes "�b�𕷂��Ă��āA�߂��������Ȃ̂���";
		mes "�v���܂������A�����F��������";
		mes "�悩�����c�c�B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�ӂӁc�c�����ł��ˁB";
		mes "�`���ɏo�Ă���ԁA���̎q�͐�����";
		mes "�d�������Ă܂���ł������A";
		mes "�㋉�X�L���ł��郌�f�B���v�e�B�I��";
		mes "���������A���ԒB����@�I�󋵂���";
		mes "�����ɏ������Ƃ����������l�����āA";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���̎q�͐������Ԃ̏C�����o�āA";
		mes "�v���[�X�g����n�C�v���[�X�g��";
		mes "���i���܂����B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�n�C�v���[�X�g�ɂȂ��Ă���́A";
		mes "�O��������Ɋ����ɑ嗤�𗷂���";
		mes "�����̊�������Ă��܂����B";
		mes "���ς�炸�Q�����悤�ł����ǁB";
		mes "�ӂӁB";
		next;
		menu "�Ƃ���łǂ����Ă��̘b���H",-;
		mes "[���C�i�[�X�C����]";
		mes "�������O�ɂ��̎q�͒��ԒB��";
		mes "^3131FF�V���o���c�o���h���a��^000000��";
		mes "^3131FF���q�^���[��^000000�ŕz���ƏC�s�ׂ̈�";
		mes "���������̂ł����c�c�Z�����̂�";
		mes "����Ƃ��댯�Ȗڂɑ����Ă���̂��A";
		mes "�����ς�A�����Ȃ��̂ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����Ŏ��͂ƂĂ��S�z��";
		mes "���������̐����Ő_�l��";
		mes "���̎q�B�̈��S���F���Ă��܂��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "�ӂӁc�c���������ɋA���Ă���";
		mes "�����̂悤�Ɉ�Ӓ��y�Y�b��";
		mes "��������Ǝv���܂��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����A�����Ԃ񒷂��b�������";
		mes "���܂��܂����ˁB";
		mes (Sex? "�Z��": "�o��")+ "���F�X�ȏ��֖`���ɍs������";
		mes "����̂ł����H";
		mes "���ꂮ������C�����āB";
		mes (Sex? "�Z��": "�o��")+ "�ׂ̈Ɏ��������ŋF�������܂��B";
		next;
		mes "[^3131FF" +strcharinfo(0)+ "^000000]";
		mes "�Ƃ���ŏC�����l�A�n�C�v���[�X�g��";
		mes "�Ȃ������̂��Ă�ΐ��E�҂����";
		mes "�`���鎖�͂������܂����H";
		mes "�����`����ł���ł���΁A";
		mes "�C�����l�̘b��K�����`�����܂��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����c�c�{���ł����H";
		mes "���肪�Ƃ��������܂��B";
		mes "�{���ɐe�؂ȕ��ł��ˁB";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���̎q�̖��O�̓v���[�X�g�\�����B";
		mes "����A���̓n�C�v���[�X�g�ł����ˁB";
		mes "�n�C�v���[�X�g^3131FF�}�[�K���b�^=�\����^000000";
		mes "�ł��B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "���̎q�ɉ������A��������";
		mes "�����ł��O�ׂ̈ɋF���Ă���ƁA";
		mes "���ꂮ����C������悤�ɂƁA";
		mes "�`���Ă��������B";
		mes "����ł�" +(Sex? "�Z��": "�o��")+ "�������C�ŁB";
		set SKILL_REDEMPTIO,1;
		close;
	case 1:
		mes "[���C�i�[�X�C����]";
		mes "���Ȃ��̈��S�Ȗ`�����F��܂��c�c�B";
		next;
		if(select("^3131FF'���f�B���v�e�B�I'^000000���w��","�b��؂�グ��")==2) {
			mes "[���C�i�[�X�C����]";
			mes "�F��������ΐS�����������܂��B";
			mes "�S���D�����C�����Ŗ��������̂ł��B";
			mes "����Ŏ��͂��̓��ɓ��鎖��";
			mes "�I�񂾂̂�������܂���B";
			close;
		}
		mes "[���C�i�[�X�C����]";
		mes "^3131FF'���f�B���v�e�B�I'^000000�͎����̎����";
		mes "�퓬�s�\�̃p�[�e�B�[�����o�[����x��";
		mes "�񕜂�����㋉�X�L���ł��B";
		mes "���Ȃ����o���Ȃ̂ŁA";
		mes "�o���鎖���ȒP�ł͂Ȃ��ł��ˁB";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����Ƀ��f�B���v�e�B�I�͑�ϊ댯��";
		mes "���ȋ]���̃X�L���ł��B";
		mes "^FF0000�p�[�e�B�[�����o�[���񕜂�������";
		mes "���g���퓬�s�\�ɂȂ��Ă��܂���^000000��";
		mes "��΂ɖY��Ă͂����܂���B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����ł̓��f�B���v�e�B�I���w�Ԉׂ�";
		mes "�K�v�ȕ���X�L�����������v���܂��B";
		mes "^3131FF'���U���N�V����Lv1'";
		mes "'�u���[�W�F���X�g�[��20��'";
		mes "'����30��'^000000";
		mes "�ł��B";
		set SKILL_REDEMPTIO,2;
		close;
	case 2:
		if(getskilllv(54) < 1 || countitem(717) < 20 || countitem(523) < 30) {
			mes "[���C�i�[�X�C����]";
			mes "^3131FF'���U���N�V����Lv1'";
			mes "'�u���[�W�F���X�g�[��20��'";
			mes "'����30��'^000000";
			mes "�����p�ӂ��Ă���������΁A";
			mes "���f�B���v�e�B�I�̊o������";
			mes "�������ł��܂��B";
			close;
		}
		mes "[���C�i�[�X�C����]";
		mes "�����͂�낵���ł��ˁH";
		mes "����ł͍����烌�f�B���v�e�B�I��";
		mes "�o�������������v���܂��B";
		mes "���̏�����o�����o����Ηǂ��̂ł��B";
		mes "�������A^FF0000���s�����ꍇ���������";
		mes "�u���[�W�F���X�g�[��������܂��B^000000";
		next;
		mes "[���C�i�[�X�C����]";
		mes "����ł́c�c�n�߂܂��傤�B";
		next;
		mes "[���C�i�[�X�C����]";
		mes "^3131FF�������ł��т��_���ȕ���I";
		mes "���Ȃ��֐؂ɂ��F��v���܂��B";
		mes "���Ȃ��̎��߂Ŏ��B�����������������B";
		mes "�V��֒ʂ�����̓������^�����������B^000000";
		next;
		mes "[���C�i�[�X�C����]";
		mes "^3131FF���Ȃ��������Ȃ������悤�ɁA";
		mes "�����܂��A���̓�����݂܂��B";
		mes "���f�B���v�e�B�I!!^000000";
		next;
		if(JobLevel+25 <= rand(100)) {
			misceffect 53,"";
			delitem 523,1;
			delitem 717,1;
			mes "[���C�i�[�X�C����]";
			mes "�ǂ���玸�s�����݂����ł��ˁc�c";
			mes "������܂������āA";
			mes "������x����Ă݂܂��傤�B";
			close;
		}
		misceffect 14,"";
		delitem 523,30;
		delitem 717,20;
		set SKILL_REDEMPTIO,0;
		skill 1014,1,0;
		mes "[���C�i�[�X�C����]";
		mes "���߂łƂ��������܂��I";
		mes "���f�B���v�e�B�I���o���܂����ˁB";
		mes "�ł����A���f�B���v�e�B�I�͖{����";
		mes "�Ō�̃X�L���ł��B";
		mes "�C�����Ďg���Ă��������B";
		mes "�^�Ɋ댯�Ȏ��ɂ����g���̂ł���B";
		close;
	}
}


//-----------------------------------------------
//==== �C���]�� - MO_KITRANSLATION
//==== ���� - MO_BALKYOUNG
//	�� SKILL_BALKYOUNG   -> 0�`5
//-----------------------------------------------
monk_test,316,69,5	script	�C�s�m	823,{
	if(getskilllv(1016)) {
		mes "[�C�s�m]";
		mes "����ł͍s���Ȃ����B";
		mes "�������̍Œ��ɂł����̔n����";
		mes "��������ǂ����@���v��������";
		mes "�����Ă���B";
		close;
	}
	if(SKILL_BALKYOUNG < 3) {
		mes "[�C�s�m]";
		mes "���`�Ȃ��͂͂��̗͂Ɏ��ʂ��낤�B";
		mes "�͂Ȃ����`�͉����ł��Ȃ����낤�B";
		mes "�͑������`�ł͂Ȃ��B";
		mes "���`�Ƃ͑����͂��I";
		if(getbaseclass(Class,2) != CLASS_MO || SKILL_BALKYOUNG == 2)
			close;
		next;
	}
	switch(SKILL_BALKYOUNG) {
	case 0:
		mes "[�C�s�m]";
		mes "���O�������N�Ȃ炱�̐^����";
		mes "�m���ɉ����Ă����I";
		mes "��l�ŏC�s�ɑł����݁A���ȏC������";
		mes "������ǂ����̔n���͉��̂����";
		mes "�����ł��Ȃ��̂��c�c���������I";
		next;
		mes "[�C�s�m]";
		mes "���ʂ܂ň�l�ł������Ă��";
		mes "���������������c�c�B";
		mes "�܂����ꂪ������������̂��B";
		mes "������^FF0000�C���]��^000000�Ƃ����X�L����";
		mes "�g���Ȃ��Ǝ��B���V���ɕ҂ݏo����";
		mes "�X�L�����g�������ł��Ȃ��̂��B";
		next;
		mes "[�C�s�m]";
		mes "���B�����N����S����";
		mes "�҂ݏo����^FF0000����^000000��";
		mes "�C���]�ڂ��g���Ȃ��Ǝg�p�ł��Ȃ��c�c";
		mes "����Ȃ̂ɂ����́c�c";
		mes "�ʂ��������I";
		next;
		mes "[�C�s�m]";
		mes "������������A��������A";
		mes "�������Ă݂���A���鎖�͐F�X";
		mes "���Ă݂����z�͎����̋C���]�ڂ�";
		mes "���̓z�ɋ�������肪";
		mes "�Ȃ��݂������B";
		next;
		mes "[�C�s�m]";
		mes "���̏C�s�m�B���C���]�ڂ�";
		mes "���͂Őg�ɒ����Ă݂悤�ƁA";
		mes "���Ȃ�w�͂��������c�c";
		mes "��͂�ʖڂ������c�c�B";
		mes "�{���ɏ�Ȃ��Ă��傤���Ȃ��B";
		next;
		mes "[�C�s�m]";
		mes "���O�������N�Ȃ�A��������";
		mes "�C���]�ڂ������Ă��炤���A";
		mes "���͂Őg�ɒ����邩�A";
		mes "��Ɉ��I��ł���Ă݂邪�����B";
		next;
		mes "[�C�s�m]";
		mes "�����͂����������Ȃ�";
		mes "���ɗ����Ȃ��A��Ȃ��Ƃڂ₫�Ȃ���";
		mes "�C�s���Ă��邩��킩��₷�����낤�B";
		set SKILL_BALKYOUNG,1;
		close;
	case 1:
		mes "[�C�s�m]";
		mes "���̐^�����C���]�ڂ��ł���";
		mes "�B��̓V�˂ł���Ƌ��ɏ�Ȃ�";
		mes "���z���������ǂ����̔n����";
		mes "�����Ă���Ă���B";
		mes "���ꂪ���Ȃ�N���C���]�ڂ�";
		mes "���͂Őg�ɒ����Ă������B";
		close;
	case 3:
		mes "[�C�s�m]";
		mes "���H�@���ɐ����������Ă���ƁH";
		next;
		mes "[�C�s�m]";
		mes "����ɂ͓��肪����ȁB";
		next;
		mes "[�C�s�m]";
		mes "���ɋC���]�ڂ�g�ɒ����Ă��Ȃ��҂�";
		mes "�������g�����Ƃ��ł��Ȃ��B";
		mes "����͑O�ɘb��������";
		mes "�悭�������Ă���ȁH";
		next;
		mes "[�C�s�m]";
		mes "�����ē�ځA�������͂�";
		mes "�����Ȃ��҂ɂނ�݂ɋ��͂ȋZ��";
		mes "�����������鎖�͂ł��Ȃ��B";
		mes "�Ԉ�����͂����҂ɋ������";
		mes "���p����邩������Ȃ����炾�B";
		next;
		mes "[�C�s�m]";
		mes "��Ԗڂ͖{���ɂǂ����悤���Ȃ��B";
		mes "��Ԗڂ́c�c���B�͖{���ɐ������͂�";
		mes "�l�X�ׂ̈Ɏg�������ł���̂���";
		mes "�e�X�g���Ă���B";
		next;
		mes "[�C�s�m]";
		mes "�����ɗ���r���ɂ�������̐A���B��";
		mes "�U�����ꂽ�����낤�B";
		mes "�}���h���S���͖��Ȏ��ɂ����炪";
		mes "����o���Ȃ��Ă��A������������";
		mes "�U�����Ă��邩��ȁB";
		next;
		mes "[�C�s�m]";
		mes "���̗��l�B�������Ēʂ�";
		mes "�����ȐA���B��ގ�����B";
		mes "���ꂪ�͂Ƌ��ɑ��̗��l�B��";
		mes "���Ƃ����������S������";
		mes "�؋��ɂȂ邾�낤�B";
		next;
		mes "[�C�s�m]";
		mes "�҂����萔�����킹�Ă��̒��x�Ȃ�";
		mes "���i�I�Ƃ����̂͂Ȃ��񂾂�������";
		mes "��ɂȂ鐔�������ƁA";
		mes "^FF0000�A���̌s20��^000000��^FF0000���3��^000000��";
		mes "�����ė���΂܂����Ȃ����낤�B";
		next;
		mes "[�C�s�m]";
		mes "�������̃e�X�g���N���A����";
		mes "���Ă��]��Ӗ��͂Ȃ��ȁc�c";
		mes "�ǂ����e�X�g�ɍ��i���Ă�";
		mes "�C���]�ڂ��g���Ȃ��ȏ�A";
		mes "�������w�񂾏��Ŏg���Ȃ��B";
		mes "������c�O���������͒��߂�B";
		next;
		mes "[�C�s�m]";
		mes "�����c�c�ǂ�����΋C���]�ڂ�";
		mes "���̏C�s�m�B�ɍL�߂鎖��";
		mes "�ł���̂��c�c";
		set SKILL_BALKYOUNG,4;
		close;
	case 4:
		if(countitem(905) < 20 || countitem(711) < 3) {
			mes "[�C�s�m]";
			mes "���H";
			mes "�e�X�g���e��������x���������H";
			mes "�����Ă����傤���Ȃ��񂾂��c�c";
			mes "�d���Ȃ��A������x�����Ă�낤�B";
			next;
			mes "[�C�s�m]";
			mes "���l�B���U�����ē����ז�����";
			mes "�����ȐA���A�}���h���S����";
			mes "��������ގ����ė��鎖���A";
			mes "�e�X�g���e���B";
			next;
			mes "[�C�s�m]";
			mes "���̗��l�B�������Ēʂ�";
			mes "�����ȐA���B��ގ�����B";
			mes "���ꂪ�͂Ƌ��ɑ��̗��l�B��";
			mes "���Ƃ����������S������";
			mes "�؋��ɂȂ邾�낤�B";
			next;
			mes "[�C�s�m]";
			mes "�҂����萔�����킹�Ă��̒��x�Ȃ�";
			mes "���i�I�Ƃ����̂͂Ȃ��񂾂�������";
			mes "��ɂȂ鐔�������ƁA";
			mes "^FF0000�A���̌s20��^000000��^FF0000���3��^000000��";
			mes "�����ė���΂܂����Ȃ����낤�B";
			next;
			mes "[�C�s�m]";
			mes "�܂�}���h���S����ގ����邾����";
			mes "�͂�����A���̗��l�B�ׂ̈�";
			mes "���̃����X�^�[��ގ�����Ƃ���";
			mes "�v���������������Ă���΁A";
			mes "���̃e�X�g�ɍ��i�ł���킯���B";
			next;
			mes "[�C�s�m]";
			mes "�����������H";
			close;
		}
		mes "[�C�s�m]";
		mes "�c�c���O���������ȁB";
		mes "�Ȃ�قǁA�A���̌s20�Ɏ��3��";
		mes "�ȏゾ����}���h���S������������";
		mes "�|�����Ƃ����؋��ɂȂ�ȁB";
		mes "�������͂������Ă���Ƃ�������";
		mes "�m���ɏؖ����ꂽ�B";
		next;
		mes "[�C�s�m]";
		mes "�Ƃ���ł�����o���Ăǂ�����񂾁H";
		mes "�ǂ����̔n�����C���]�ڂ�N�ɂ�";
		mes "�����Ȃ��ȏ�A�������O�ɐ�����";
		mes "�����Ă������̗��_�ɉ߂����A";
		mes "�g�����ƂȂ�Ăł��Ȃ����H";
		next;
		mes "[�C�s�m]";
		mes "���_�������ɗ����������āA";
		mes "���ۂɎ��g�̋C�̃R���g���[����";
		mes "���܂��ł��Ȃ���΁A";
		mes "�������_�����̖��ʂȒm���ɂȂ�B";
		next;
		mes "[�C�s�m]";
		mes "�܂������A����ł��m�肽���̂��H";
		mes "��ł��ȁc�c���������B";
		mes "�������ł�����b�������Ă���B";
		mes "�܂��w��ł�����ɗ����Ȃ���";
		mes "�����Ă����͒m��񂼁B";
		delitem 905,20;
		delitem 711,3;
		set SKILL_BALKYOUNG,5;
		close;
	case 5:
		mes "[�C�s�m]";
		mes "�����͂������H";
		mes "�ꉞ���_�͋����悤�B";
		mes "���_���������c�c";
		next;
		mes "[�C�s�m]";
		mes "�X�L���̖��O�͐����A�O�ɂ����x��";
		mes "�b������������m���Ă���Ƃ͎v�����B";
		mes "���̃X�L���͎�̕��ɋC���W��������";
		mes "�����X�^�[�ɑŌ���������Ɠ�����";
		mes "���͂ȏՌ��g�𔭐������āA";
		mes "����̓G�܂Ő�����΂��X�L�����B";
		next;
		mes "[�C�s�m]";
		mes "�X�L���ɓ�����������ȊO�̎���ɂ���";
		mes "�����X�^�[�B�́A�Ռ��g�ɂ���Č���";
		mes "������΂��Ɠ����ɃX�^���ɂ�����B";
		mes "�Ō���^��������ɂ͐�����΂���";
		mes "�X�^���̌��ʂ͂�����Ȃ��B";
		next;
		mes "[�C�s�m]";
		mes "�g�p�̎���SP��20����āA";
		mes "HP��10������B";
		mes "�����͂��g���X�L���Ȃ̂�";
		mes "�ǂ����Ă��g�p�҂ɂ킸������";
		mes "���������Ă��܂��B";
		next;
		mes "[�C�s�m]";
		mes "����������Ώۂ������X�^�[�Ɗ�����";
		mes "���������R�͐l�ԂɎg�p����ꍇ�A";
		mes "�_���[�W��^���邱�Ƃ͂ł��邪";
		mes "����̐l�Ԃ��Ռ��g��";
		mes "������΂��Ȃ����炾�B";
		mes "�ǂ��o���Ă����Ƃ����B";
		next;
		mes "[�C�s�m]";
		mes "��܂��ɗ��_�͂��̒��x�����c�c";
		mes "�����܂ł̑S�Ă��������Ă��Ă�";
		mes "�C���]�ڂ��ł���ʂ�";
		mes "�C�̃R���g���[�����ł��Ȃ����";
		mes "�ǂ����悤���Ȃ��B";
		next;
		mes "[�C�s�m]";
		mes "�Ȃ񂾂����ʂȎ��Ԃ�";
		mes "�g�����C�����邪�c�c�B";
		mes "�Ƃɂ����񑩂ǂ���A";
		mes "���_�̑S�Ă����������B";
		mes "���O�����_��m���Ė����������H";
		next;
		mes "[�C�s�m]";
		mes "�Ƃ肠�������͋C���]�ڂ��F��";
		mes "�g����悤�ɂǂ����̔n����";
		mes "����������@���l���Ă݂悤�B";
		next;
		mes "[�C�s�m]";
		mes "����ł͍s���Ȃ����B";
		mes "�������̍Œ��ɂł����̔n����";
		mes "��������ǂ����@���v��������";
		mes "�����Ă���B";
		set SKILL_BALKYOUNG,0;
		skill 1016,1,0;
		close;
	}
}

prt_monk,270,198,3	script	�C�s���̃����N	753,{
	if(getskilllv(1015)) {
		mes "[�C�s�m]";
		mes "���������ׂ�����u����Ă���";
		mes "�󋵂�ǂ��l���Ă݂Ȃ����B";
		mes "�����������\�ł͂Ȃ��Ƃ�������";
		mes "��Ɋo���Ă����Ȃ����B";
		next;
		mes "[�C�s�m]";
		mes "�����������A�����C���]�ڂ�������";
		mes "�Ƃ������͑��̏C�s�m�B�ɂ�";
		mes "�閧�ɂ���悤�ɗ��ނ�B";
		mes "�ނ炪�m��΂��邳�����낤����ˁB";
		mes "���������ˁH";
		close;
	}
	switch(SKILL_BALKYOUNG) {
	case 0:
		mes "[�C�s�m]";
		mes "�����͉������ݏo���Ȃ��B";
		mes "���ȏC������؂Ȃ̂���B";
		close;
	case 1:
		mes "[�C�s�m]";
		mes "�����͉������ݏo���Ȃ��B";
		mes "���ȏC������؂Ȃ̂���B";
		next;
		mes "[�C�s�m]";
		mes "����H�@���߂Č���炾�ˁB";
		mes "���O�����̓z�̂悤�ɁA";
		mes "���ɗ͂��ǂ����Đ��`���Ƃ��������A";
		mes "�������ċC���]�ڂ��w�тɂ����̂��H";
		next;
		mes "[�C�s�m]";
		mes "���B�����N�͐킢����ɂ��ׂ����ł�";
		mes "�Ȃ��̂ɂ��ւ�炸�키�ׂ̏C����";
		mes "�d�˂Ă���c�c���������I";
		mes "�܂������c�c��Ȃ������N�B���B";
		next;
		mes "[�C�s�m]";
		mes "�F�����ɊԈ���Ă��邾�̉����̂�";
		mes "�����������Ă���B";
		mes "�܂������A�]�v�Ȃ����b�Ƃ������̂��B";
		mes "���ɂ͎��̍l�������莩���Ȃ�ɂ���";
		mes "�M�O������Ă��邾�����B";
		next;
		mes "[�C�s�m]";
		mes "�F�A���ʂȗ~�������Ă���悤���ˁB";
		mes "���`�̂��߂ɗ͂��g���Ƃ͌����Ă�";
		mes "�����͔ނ�������̗~�ׂ̈�";
		mes "�͂��g���悤�ɂȂ邩������Ȃ��B";
		next;
		mes "[�C�s�m]";
		mes "���O���������������Ǝv���Ȃ�";
		mes "�~���̂ĂȂ����B";
		mes "���ꂪ�^�̎��ȏC���ɂȂ�Ɠ�����";
		mes "���a�Ɛ��`���������铹�ɂȂ邾�낤�B";
		next;
		mes "[�C�s�m]";
		mes "�ӂށc�c";
		next;
	case 2:
		if(Weight) {
			mes "[�C�s�m]";
			mes "�ǂ����~�ň�t�̂悤���ˁB";
			mes "����Ȃɂ�������̕���������";
			mes "�������Ă���̂��H";
			mes "�܂��͕��~���̂ċ����Ă��痈�Ȃ����B";
			if(SKILL_BALKYOUNG == 1)
				set SKILL_BALKYOUNG,2;
			close;
		}
		mes "[�C�s�m]";
		if(SKILL_BALKYOUNG == 1)
			mes "���~���̂ĂȂ����Ɖ���c�c����H";
		mes "�ق��c�c�S�̗~���̂Ă����ǂ����܂ł�";
		mes "������Ȃ����A�ǂ���畨�~��";
		mes "��������̂ċ������悤���ˁB";
		mes "���O�̂悤�ȓz�͋v���Ԃ肾�B";
		next;
		mes "[�C�s�m]";
		mes "�C�ɓ������I";
		mes "���O�Ȃ玄���v�����z�I�Ȑ��`��";
		mes "���a���������鎖���ł��邾�낤�I";
		next;
		mes "[�C�s�m]";
		mes "����Ȏ��ŉ��𔄂������Ȃ����A";
		mes "���O�ɂ͓��ʂɎ��������g����";
		mes "�X�L���������Ă����悤�B";
		mes "���̏C�s�m�B�ɂ͎g���Ȃ�";
		mes "�������X�L�����B";
		next;
		mes "[�C�s�m]";
		mes "����ȂɊȒP�ȃX�L�����ǂ�����";
		mes "�F�g�������ł��Ȃ��̂��c�c";
		mes "�܂��~���̂Ă��Ɍ�����M�O��";
		mes "�����Ă��邩�炾�낤�B";
		mes "�����A�O�u���������Ȃ����A";
		mes "�����ɋ����Ă����悤�B";
		next;
		mes "[�C�s�m]";
		mes "�Ƃ͌����Ă����t�ɂ���͓̂�����A";
		mes "���t�ɂ���قǂ̎��ł��Ȃ��B";
		mes "�C���]�ڂ��g����悤�ɁA";
		mes "�������O���y���˂��Đg�̂�";
		mes "�o�������Ă����悤�B";
		next;
		mes "[�C�s�m]";
		mes "�n�@�@�@�@�@�@�@�@�@�@�@�@�c�c";
		mes "�t�D�D�D�D�D�c�c";
		next;
		mes "[�C�s�m]";
		mes "�A�^�^�^�^�^�^�^�^�^�^�^�^�^!!!";
		mes "�z���^�^�^�^�^�^�^�^!!!";
		next;
		mes "[�C�s�m]";
		mes "�z���b�`���A!!!!";
		next;
		mes "[�C�s�m]";
		mes "�t�D�c�c";
		next;
		mes "[�C�s�m]";
		mes "�悵�I";
		mes "�������O�̐g�͎̂��R�ɃX�L����";
		mes "�g����悤�ɂȂ����͂��B";
		mes "�g�̂ɒ��ڊo������������A���O����";
		mes "�N���ɋ����鎖�͂ł��Ȃ����A";
		mes "�������g����Ȃ���͂Ȃ����낤�B";
		next;
		mes "[�C�s�m]";
		mes "���O�Ȃ񂩂ǂ������Ă����񂾂��A";
		mes "���̏C�s�m�̓z��͂��O�����o����";
		mes "�X�L����^FF0000�C���]��^000000�ƌĂԂ悤���ˁB";
		mes "���O�������Ăт������";
		mes "�D���ɂ��Ȃ����B";
		next;
		mes "[�C�s�m]";
		mes "^FF0000���̃X�L����SP��40�����";
		mes "�����̋C�e���p�[�e�B�[�����o�[��";
		mes "�^����A�N�e�B�u�X�L�����B";
		mes "�g�p�O��̍s���s�\���Ԃ�";
		mes "���\���邩��C�����Ďg���Ȃ����B^000000";
		next;
		mes "[�C�s�m]";
		mes "��͎��ۂɎg���āA";
		mes "���̎g������g�ɒ����Ă����Ȃ����B";
		next;
		mes "[�C�s�m]";
		mes "�ꉞ�����Ă��������B�͑����ׂ�";
		mes "�g�̂�b�����̂ł͂Ȃ��A���ȏC����";
		mes "�ʂ��Đ��`���т��ׂ���B";
		mes "���̓_�������Y��Ȃ��悤��";
		mes "�s�����Ȃ����B";
		next;
		mes "[�C�s�m]";
		mes "�F�X���邳�������Ă��܂Ȃ������ˁB";
		mes "�`����ׂ����͓`������B";
		mes "���~����x�ł��̂Ă����O�Ȃ�A";
		mes "���̐M�O���󂯌p���ł�����";
		mes "�M���悤�B";
		next;
		set SKILL_BALKYOUNG,3;
		skill 1015,1,0;
		mes "[�C�s�m]";
		mes "�ł́A�撣��Ȃ����B";
		next;
		mes "[�C�s�m]";
		mes "�����A���������Ύ������O��";
		mes "���̃X�L�����������Ƃ�������";
		mes "���̏C�s�m�B�ɂ͔閧�ɂ��Ă���B";
		mes "�ނ炪�m������F�X��";
		mes "���邳�����낤����ˁB";
		next;
		mes "[�C�s�m]";
		mes "���������Ȃ�s���Ȃ����B";
		mes "���x���������A���B�̊w�ԋZ��";
		mes "�E���ׂ̈̓���ł͂Ȃ��Ƃ�������";
		mes "��΂ɖY��Ȃ��悤�ɁI";
		close;
	}
}


//-----------------------------------------------
//==== �����_�� - AM_BIOETHICS
//	�� SKILL_BIOETHICS   -> 0�`13
//-----------------------------------------------
lhz_in01,224,140,2	script	�P�����\�X	57,{
	if(getbaseclass(Class,2) != CLASS_AM) {
		mes "[�P�����\�X]";
		mes "�c�c";
		mes "�_�̗̈�ɒ��킷��c�c";
		mes "���ꂪ�ʂ����Đ����������A";
		mes "�������Ȃ������c�c";
		next;
		mes "[�P�����\�X]";
		mes "����͂��Ă����A";
		mes "�_�̗̈�ɒ��킷��҂̂��Ƃ��A";
		mes "^FF0000�B���p�t^000000�ƌĂԁB";
		mes "���邩�ȁH�@��҂�B";
		close;
	}
	if(SKILL_BIOETHICS == 13 || getskilllv(238)) {
		mes "[�P�����\�X]";
		mes "�w�͂�ӂ�ȁB������������A";
		mes "���O�Ɏ��B�B���p�t�̖�����";
		mes "�������Ă���̂����m��Ȃ�����ȁB";
		close;
	}
	switch(SKILL_BIOETHICS) {
	case 0:
		mes "[�P�����\�X]";
		mes "�ق��A�ᑢ�̘B���p�t���B";
		mes "���O�̂悤�ɖ��n�ȘB���p�t��";
		mes "�v���U��Ɍ���̂��B";
		mes "�ꌾ�ŘB���p�t�ƌ����Ă��A";
		mes "���͂͌l�������������̂���B";
		mes "���i���邪�悢�B";
		next;
		mes "[�P�����\�X]";
		mes "���m�ɑ΂���T���ƁA�����̒b�B�B";
		mes "���̐ςݏd�˂��A";
		mes "���O�̘B���p�t�Ƃ��Ă̔\�͂�";
		mes "��������Ă����̂���B";
		next;
		mes "[�P�����\�X]";
		mes "�ܘ_�A�s����������ɂ́A";
		mes "�����ĐG��Ă͂����Ȃ�";
		mes "�֒f�̗̈悪����̂��Ⴊ�c�c";
		mes "����܂ł͐₦���w�͂��邱�Ƃ���B";
		next;
		mes "[�P�����\�X]";
		mes "�����āA�{���ɂ��̓���";
		mes "���������Ȃ̂��ǂ����A";
		mes "��������ƍl���Ă݂邱�Ƃ���B";
		next;
		mes "[�P�����\�X]";
		mes "�Ƃɂ����A���i����B";
		set SKILL_BIOETHICS,1;
		close;
	case 1:
		mes "[�P�����\�X]";
		mes "�܂������ȁB";
		mes "�������łɁA�킵�̎����";
		mes "�����邪�悢�B";
		mes "�B���p�Ƃ́A�����H";
		next;
		mes "[�P�����\�X]";
		mes "�ӂށc�c�����Ȃ�̎���ɂ��ẮA";
		mes "���ƃX�P�[�����傫���������̂��H";
		mes "�ł́A�킵�������������Ă�낤�B";
		next;
		mes "[�P�����\�X]";
		mes "�B���p�t�́A��������𐶂ݏo��";
		mes "���\�܂����̋��~�Ȋw�₾��";
		mes "�v��ꂪ�������A�ʂ����Ă��ꂪ";
		mes "�{���Ȃ̂��H";
		mes "�ہI�@�ܘ_�A��������𐶂ݏo��";
		mes "�������Ă���B�������c�c";
		next;
		mes "[�P�����\�X]";
		mes "�����������́A��������𐶂ݏo��";
		mes "�ȂǂƂ������Ƃ��n�߂��̂��H";
		mes "���̗��R�͊ȒP���B";
		mes "��������𐶂ݏo�����Ƃɂ��A";
		mes "���҂�h�点�邱�Ƃ��ł����";
		mes "�M�������炾�낤�B";
		next;
		mes "[�P�����\�X]";
		mes "��w�A���w�A�����w�A�n���w�A";
		mes "�V���w�A�萯�w�A�����w�A�N�w�A";
		mes "�����w�A���w�c�c";
		mes "���̒��ɑ��݂��邷�ׂĂ̊w���";
		mes "�W�听�A���ꂪ�B���p����B";
		next;
		mes "[�P�����\�X]";
		mes "����قǕ��G������A������";
		mes "�c��Ȋw���T������ɂ́A";
		mes "�������g�̒b�B���K�v�s�����B";
		mes "������v���΁A���𐶂ݏo�����ƂȂ�";
		mes "�����������Ƃł͂Ȃ��B�܂��܂�";
		mes "���̌��ƌ����邾�낤�B";
		next;
		mes "[�P�����\�X]";
		mes "���O�͂���ȘB���p�̐��E��";
		mes "���𓥂ݓ��ꂽ�̂���B";
		mes "�ǂ�����c�c�킭�킭���邾�낤�H";
		mes "���i����̂��Ⴜ�B";
		next;
		mes "[�P�����\�X]";
		mes "���O�͂����B���p�̐��E�ւ�";
		mes "���𓥂ݓ���Ă��܂����̂���B";
		mes "����Ⴆ�������܂����悤�Ƃ��A";
		mes "�������ł������͒T�����˂�";
		mes "�����Ȃ��̂���B";
		set SKILL_BIOETHICS,2;
		close;
	case 2:
		mes "[�P�����\�X]";
		mes "�܂��������B";
		mes "�����Ȑl�Ԃ̖ʓ|��������́A";
		mes "���O�̂悤�ɓ��X�b�B�����Ă���";
		mes "���S�ҘB���p�t�̑�����������";
		mes "�����ƗL�v����ȁB";
		mes "�����A���x�͉��̘b�����Ă�낤���́B";
		next;
		mes "[�P�����\�X]";
		mes "�ӂށc�c���𐶂ݏo�����Ƃ��ł���";
		mes "�ʂȂ�A���ł����ݏo�����Ƃ��ł����";
		mes "�v����������Ȃ����A������";
		mes "���ݏo�����Ƃ����͂��Ȃ��B";
		next;
		mes "[�P�����\�X]";
		mes "�L�\�ȘB���p�t�̒��ɂ́A������";
		mes "���ݏo������̋Z�p������҂�";
		mes "���邪�A���ꂾ���͂��Ă͂����Ȃ��B";
		mes "�w�Ԃ��Ƃ��狖�����̂���B";
		next;
		mes "[�P�����\�X]";
		mes "�l���Ă݂邪�悢�c�c";
		mes "��X�̂��̐����́A�����Ȑ_�̈ӎv��";
		mes "����ė^����ꂽ���̂��B";
		mes "�����Ă��̈ӎv�́A���e�ɂ����";
		mes "�������A���̐��ɒa������̂���B";
		next;
		mes "[�P�����\�X]";
		mes "�����Ƃ́A�����A���������̂���B";
		mes "����Ȑ����𐶂ݏo���ȂǁA";
		mes "�l�Ԃ̗̈�𒴂��������ȍs�ׂ���B";
		mes "���̍s�ׂ͂��͂�T���A�b�B�Ƃ�����";
		mes "�����̂��̂ł͂Ȃ��A���炩��";
		mes "�B���p����O�ꂽ�s�ׂ���B";
		next;
		mes "[�P�����\�X]";
		mes "�킵�͂��̐����A";
		mes "^FF0000�z�����N���X^000000�ƌĂ΂�鐶����";
		mes "���ݏo���Z�p�̑��l�҂���B";
		mes "�������c�c";
		mes "���͌�����Ă��邪�ȁc�c";
		next;
		mes "[�P�����\�X]";
		mes "�����B���p����c�c";
		mes "����������w��̏W�听����c�c";
		mes "�킵�́A�l�Ԃ̘���������ȏ�";
		mes "�������Ƃ��ł��Ȃ��Ȃ����̂���c�c";
		next;
		mes "[�P�����\�X]";
		mes "�B���p��ǋy���Ă����ƁA����ƍ��܂�";
		mes "���鎞������ƁA�ȑO����������낤�H";
		mes "���O�͂܂����̌o���͂Ȃ��悤���Ⴊ�A";
		mes "���̓���ǋ����邩��ɂ́A";
		mes "�����Ƃ�����c�c";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		mes "���̎��ꂽ�z�����N���X�Z�p��";
		mes "����o�����Ƃɂ���ď��߂āA";
		mes "�����̑����𗝉�����Ƃ́c�c";
		mes "�����Ȃ��Ƃ��B�����āA";
		mes "��������Ɠ����ɋꂵ�ނ��낤�B";
		next;
		mes "[�P�����\�X]";
		mes "����̘B���p�t�ɂ́A����";
		mes "�z�����N���X�Z�p��`�����Ă�";
		mes "�Ȃ�Ȃ��B���̋Z�p�́A�i����";
		mes "���󂳂�Ȃ���΂Ȃ�Ȃ��̂���I";
		next;
		mes "[�P�����\�X]";
		mes "�킵�́A�m���Ƀz�����N���X��";
		mes "���ݏo���Z�p�������Ă���c�c";
		mes "�����A����ȏ�͂������߂񂶂�B";
		mes "���̋Z�p�͒N�ɂ��`�����Ȃ�";
		mes "���肶��B";
		next;
		mes "[�P�����\�X]";
		mes "�ӂ��c�c�b�����Ă��邤���ɁA";
		mes "�����������Ă��܂����悤����ȁB";
		mes "�Ƃɂ����A�킵�������邱�Ƃ�";
		mes "���ꂾ������B";
		next;
		mes "[�P�����\�X]";
		mes "����͎������g�œ���T��";
		mes "���邪�悢�B";
		mes "�����āA�z�����N���X�Z�p�ɂ�";
		mes "�֗^���Ă͂����񂼁B";
		mes "���̓���ǋ����邱�Ƃ���c�c";
		set SKILL_BIOETHICS,3;
		close;
	case 3:
		mes "[�P�����\�X]";
		mes "�܂������ȁB���̗p����H";
		mes "�O�Ɍ������悤�ɁA�킵����";
		mes "���O�ɓ`���邱�Ƃ͂����Ȃ��B";
		mes "���ʂȗp�ł�����̂��c�c�H";
		next;
		if(select("�z�����N���X�Z�p���w�т���","���ł��Ȃ�")==2) {
			mes "[�P�����\�X]";
			mes "�ӂށA�����������Ă���̂��c�c";
			mes "�Ƃɂ����A���Ԃ𖳑ʂɂ����A";
			mes "�����̒b�B�����Ȃ����B";
			close;
		}
		mes "["+strcharinfo(0)+"]";
		mes "���Ƀz�����N���X�Z�p��";
		mes "�����Ă��������B";
		next;
		mes "[�P�����\�X]";
		mes "�c�c�H";
		mes "�����ԈႢ���H";
		mes "�z�����N���X����ʂ�ƌ������悤��";
		mes "�����������c�c";
		mes "������x�����Ă���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ƀz�����N���X�Z�p��";
		mes "�����Ă��������B";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		next;
		mes "[�P�����\�X]";
		mes "���O�A�킵�����������Ƃ�";
		mes "�o���Ƃ��̂��H";
		mes "�z�����N���X�Z�p�ɂ͐�΂�";
		mes "����o���Ȃƌ������͂�����B";
		mes "�c�c�{�C�Ȃ̂��H";
		next;
		mes "[�P�����\�X]";
		mes "�킵�͂��O�Ɍ��炸�����Ȃ�҂�";
		mes "���낤�Ƃ��A�z�����N���X�Z�p��";
		mes "�`���������͖ѓ��Ȃ��B";
		mes "����ɁA���O�̓z�����N���X��";
		mes "�ւ���m�����܂������Ȃ������ɁA";
		mes "�}�ɉ��������o���̂���I";
		next;
		mes "[�P�����\�X]";
		mes "�s��������c�c�悭�m�������";
		mes "�y�X�����_�̗̈��N�����Ȃǂ�";
		mes "�l����Ƃ́c�c";
		mes "��΂ɋ�����킯�ɂ͂�����I";
		next;
		mes "[�P�����\�X]";
		mes "�C���������c�c";
		mes "�������킸�A�������ɂ킵�̑O����";
		mes "���������邪�悢�I";
		set SKILL_BIOETHICS,4;
		close;
	default: //4�`6�̎�
		mes "[�P�����\�X]";
		mes "�s��������A�킵�ɐ���������ȁI";
		mes "�������Ɨ������邪�悢�B";
		mes "���x���悤�Ƃ��A���O��";
		mes "�z�����N���X�Z�p��`�����Ă��";
		mes "����͂Ȃ�����ȁI";
		close;
	case 7:
		mes "[�P�����\�X]";
		mes "���O�A�������ȁc�c";
		mes "���x���悤���A�z�����N���X�Z�p��";
		mes "���O�ɓ`�����Ă��C�͔��o���Ȃ��B";
		mes "���������A���O�̓z�����N���X��";
		mes "���āA���̒m�����Ȃ��낤�B";
		next;
		menu "�w�т܂���",-;
		mes "["+strcharinfo(0)+"]";
		mes "�z�����N���X�ɂ��āA";
		mes "�X�N���U�h����A�P�V�r�I������A";
		mes "�u�����`�����񂩂�w�т܂����B";
		next;
		mes "[�P�����\�X]";
		mes "�ق��c�c�H";
		mes "�����������ƂȂ�A�ǂ̒��x�̂��̂�";
		mes "�e�X�g���Ă�낤�B";
		mes "�{���ɒm��������Ȃ�A";
		mes "��������͂�����B";
		next;
		mes "[�P�����\�X]";
		mes "�����������o���B";
		mes "���m�ɓ����������̂���B";
		next;
		mes "[�P�����\�X]";
		mes "�܂���Ԗڂ̖�肶��B";
		mes "�z�����N���X���ꎞ�I�ɋx�܂���";
		mes "�X�L���́A���Ƃ������H";
		next;
		input .@word$;
		if(.@word$ != "����")
			break;
		mes "[�P�����\�X]";
		mes "�ӂށc�c��������B";
		mes "����ł͓�Ԗڂ̖��B";
		mes "�R�[���z�����N���X�X�L����";
		mes "�g�����ɕK�v�ȃA�C�e���͉����H";
		next;
		input .@word$;
		if(.@word$ != "�G���u���I")
			break;
		mes "[�P�����\�X]";
		mes "�ق��c�c��������B";
		mes "�ł͎��A�O�Ԗڂ̖�肶��B";
		mes "�m����Ԃ̃z�����N���X��";
		mes "����������X�L���́A���Ƃ������H";
		next;
		input .@word$;
		if(.@word$ != "���U���N�V�����z�����N���X")
			break;
		mes "[�P�����\�X]";
		mes "�Ȃ�قǁc�c���O�A";
		mes "�{���Ɋw��ł����悤����ȁB";
		mes "�Ȃ��Ȃ��̎ᑢ�B���p�t����B";
		mes "����c�c�ᑢ�Ƃ͎��炶��ȁB";
		mes "���h�ȘB���p�t�ƌ����ׂ����B";
		next;
		mes "[�P�����\�X]";
		mes "�����ȁc�c�z�����N���X�Z�p��";
		mes "�`�����邱�Ƃ͂ł���B";
		mes "���O�͊m���ɐ��������B";
		mes "����͔F�߂悤�B�����A����ł�";
		mes "�`�����Ă�邱�Ƃ͂ł���̂���B";
		next;
		mes "[�P�����\�X]";
		mes "���O�̓z�����N���X�Z�p��";
		mes "�o������A�m���ɂ悭�������������B";
		mes "���O���̒m���������Ă���";
		mes "�B���p�t�́A�����������";
		mes "���Ȃ�����낤�B";
		next;
		mes "[�P�����\�X]";
		mes "�����A�킵���`�����Ȃ����R�́A";
		mes "�m�����ǂ��Ƃ������ł͂Ȃ��B";
		mes "�O�ɂ��������悤�ɁA";
		mes "�z�����N���X�͈�̐����ł���B";
		mes "������l�Ԃ��Ƃ����y�X����";
		mes "�����Ă͂�����̂���B";
		next;
		mes "[�P�����\�X]";
		mes "���ꂪ�A�킵���z�����N���X�Z�p��";
		mes "���󂵂����R����B";
		mes "�B���p�t�B�́A�^���̒ǋ���";
		mes "���Ă��������ɁA�����̑�����";
		mes "�Y��Ă��܂��B";
		next;
		mes "[�P�����\�X]";
		mes "�����Ȃ��Ƃ���c�c";
		mes "�����̂��߂����̓���i��ŁA";
		mes "��������Ƃ����̂���H";
		mes "�����̑�����Y��Ă��܂��ẮA";
		mes "�����Ȃ铹�����l�̂Ȃ�";
		mes "���̂ƂȂ��Ă��܂��B";
		next;
		mes "[�P�����\�X]";
		mes "�Ƃɂ����A�����������Ƃ���c�c";
		mes "���O�����łȂ��A���̒N�ł��낤�Ƃ�";
		mes "�z�����N���X�Z�p��`�����邱�Ƃ�";
		mes "���Ȃ��B���ꂾ���́A��΂�";
		mes "���邱�Ƃ͂ł���B";
		set SKILL_BIOETHICS,8;
		close;
	case 8:
		mes "[�P�����\�X]";
		mes "���O�̎��͔͂F�߂�B";
		mes "�����A����ƃz�����N���X�Z�p��";
		mes "�`���͕ʖ�肶��B";
		mes "�����A�s���������B";
		close;
	case 9:
		mes "[�P�����\�X]";
		mes "�܂������̂��H�@�܂������c�c";
		mes "�{���ɂ������z���ȁB";
		mes "�܂��B���p�t�Ȃ�ēz��́A";
		mes "������߂��������񂾂��ȁB";
		next;
		menu "�������̘b�����܂��񂩁H",-;
		mes "["+strcharinfo(0)+"]";
		mes "�����́A���̘b�����悤�Ǝv����";
		mes "���܂����B���̘b�𕷂���";
		mes "����܂��񂩁H";
		next;
		mes "[�P�����\�X]";
		mes "���̘b�H�@����͈ӊO���ȁc�c";
		mes "�ӂށc�c���܂ɂ͗ǂ�����낤�B";
		mes "�b���Ă݂Ȃ����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ��͉Ƒ�������A";
		mes "�j�̎q�����邻���ł��ˁB";
		next;
		mes "[�P�����\�X]";
		mes "��H�@�����A�킵�͌������Ƃ邼�B";
		mes "����ɉ������q����l����B";
		mes "�{���ɉ����񂶂�c�c";
		mes "�ڂɓ���Ă��ɂ��Ȃ����ɂȁB";
		mes "�킵���������Đ����Ă�����̂��A";
		mes "���q�����Ă�������B";
		next;
		mes "[�P�����\�X]";
		mes "����Ȃ��ƌ����Ă͍Ȃɐ\����Ȃ����A";
		mes "�킵�����������т������Ă���̂�";
		mes "���q�̂���������낤�B";
		mes "�ܘ_�A�Ȃɂ����ӂ��Ă��邪�ˁB";
		mes "�܂��A��ׂ�̂����������b����ȁB";
		mes "���͔̂閧�ɂ��Ƃ��Ă���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂��q���񂪁A�a�C�ɂȂ���";
		mes "���Ƃ����邻���ł��ˁc�c";
		mes "�ǂ�ȋC������������ł����H";
		next;
		mes "[�P�����\�X]";
		mes "�v���o���������Ȃ��c�c";
		mes "���q�𐶂������߂Ȃ�A���ł�";
		mes "���Ă�낤�Ǝv�����B";
		mes "�Ⴆ�l����a�܂���݌����悤�Ƃ�";
		mes "���q�̂��߂Ȃ牽�����Ă�邳�B";
		next;
		mes "[�P�����\�X]";
		mes "���ǁA�����������Ƃ̂Ȃ��a�C�ŁA";
		mes "���q�͂����Ɍ��N�ɂȂ����B";
		mes "�����A�������Ɏ���悤�ȕa�C��������";
		mes "�킵�͉������ł��������c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����Ȏ��ɁA�z�����N���X�Z�p��";
		mes "���ɗ��̂ł͂Ȃ��ł����H";
		mes "�厖�Ȑl�����Ɏ���ʂ悤��";
		mes "���邽�߂ɁB";
		next;
		mes "[�P�����\�X]";
		mes "����͂ǂ������Ӗ�����H";
		mes "�z�����N���X�Z�p�ŁA���ɂ䂭";
		mes "�҂𐶂������Ƃ��ł���ƁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ��͈ȑO�A�B���p�͂��ׂĂ�";
		mes "�w��̏W�听�Ƃ������Ⴂ�܂����B";
		mes "�����čŏI�ړI�́A�^���Ɏ��邱�ƂƁB";
		mes "�^���Ɏ���܂ł̉ߒ��ɁA";
		mes "�����𐶂ݏo���z�����N���X�Z�p��";
		mes "�������̂ł͂Ȃ��̂ł����H";
		next;
		mes "[�P�����\�X]";
		mes "�������ȁc�c�l�Ԃ́A�^�������߂�";
		mes "�����ɁA�֒f�̐_�̗̈�ɂ܂�";
		mes "����o���Ă��܂����B";
		mes "������M�ԂȂǂƂȁc�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�z�����N���X�Z�p�𐶖��n���̋Z�p";
		mes "�Ƃ΂���v�����ނ��炢���Ȃ��̂ł�";
		mes "�Ȃ��ł��傤���B";
		mes "�����̌��������邱�ƂŁA�����̌���";
		mes "�c�c����𔭌����A�₤���Ƃ�";
		mes "�ł���̂ł͂Ȃ��ł��傤���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�_�̗̈��N���֒f�̋Z�p";
		mes "�Ȃǂł͂Ȃ��A�l�𐶂������Ƃ��ł���";
		mes "�����ȋZ�p�Ƃ������Ƃł��B";
		next;
		mes "[�P�����\�X]";
		mes "����͐l�Ԃ̘�������c�c";
		mes "�l�Ԃ����ׂĂ𗝉����A���f���A";
		mes "�������Ƃ��ł���c�c";
		mes "�����l���邱�Ǝ��́A�����Ȃ̂���I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������͐l�Ԃł��B�l�Ԃ������B";
		mes "�l�Ԃ̖������Ă���͓̂��R��";
		mes "���Ƃł��B";
		mes "����̐������~�����߁A������";
		mes "�������s�����Ƃ͕K�v���Ǝv���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�m���Ɏ��R�̐������������Ƃ�";
		mes "���ꑽ�����Ƃł�����A";
		mes "�����p�̐����𐶂ݏo���A";
		mes "�����𑱂��Ă����̂ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂱ�����A���܂ŋ]���ƂȂ���";
		mes "�z�����N���X�ƘB���p�t�ɑ΂���";
		mes "�񂢂ł͂Ȃ��ł��傤���H";
		next;
		mes "[�P�����\�X]";
		mes "�c�c�Ⴆ���O�̘_�����������Ƃ��Ă�";
		mes "�z�����N���X�Z�p�ɂ͌�����";
		mes "����o���Ă͂����Ȃ��̂���I";
		mes "���̒��A�_�������ł��ׂĂ�";
		mes "���藧���Ă���킯�ł͂Ȃ��̂���I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ȃ��͐�قǁA���q����̂��߂Ȃ�";
		mes "�ǂ�Ȃ��Ƃł������";
		mes "�������Ⴂ�܂����B";
		mes "�Ⴆ�l����a�܂���݌�����悤��";
		mes "���Ƃł�����Ɓc�c";
		mes "���̌��t�͋U��ł����H";
		next;
		mes "[�P�����\�X]";
		mes "���I�@�ށc�c���A����́c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���q����A����A�����̑厖�Ȑl��";
		mes "����ł������ɉ����ł��Ȃ��c�c";
		mes "����ȋC�����𑼐l�ɂ��������";
		mes "�~�����Ǝv���Ă����ł����H";
		mes "�����Ă��Ȃ����g�A����ȋC����";
		mes "�Ăі��킢�����ł����H";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ȋC�����𖡂���Ă��炢������";
		mes "�Ȃ��ł��傤�H";
		mes "���l�ɂ��A�����Ă��Ȃ����B";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�_�̗̈��N���A�����𐶂ݏo���B";
		mes "����͋����ꂴ�邱�Ɓc�c";
		mes "�ߐ[���s�ׂ�������܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������A���̋Z�p�ɂ���āA";
		mes "���ɂ䂭�����̐l���~�����Ƃ�";
		mes "�ł��邩������Ȃ��B";
		mes "�P���ɍߐ[���s�ׂł��邩��";
		mes "�Ƃ����āA���󂵂Ă悢���̂Ȃ�";
		mes "�ł��傤���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�l�Ԃ͐����Ă������߂�";
		mes "�]�ޖ]�܂ʂɊւ�炸�A";
		mes "��ɐ������]���ɂ��Ă��܂��B";
		mes "�����c�c����͐l�Ԃ̌��߂Ƃ�";
		mes "������̂�������܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̎������󂯓���A";
		mes "��X�l�Ԃ͍���ǂ�����ׂ���";
		mes "�^���Ȏp���ł�����";
		mes "���܂��o�܂�����͍�����c�c";
		mes "���ꂱ�����^���ւ̓��ł�";
		mes "�Ȃ��̂ł��傤���H";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�P�����\�X����H";
		next;
		mes "[�P�����\�X]";
		mes "�c�c";
		mes "�����ł����c�c";
		mes "�����A��l�ɂ��Ă���Ȃ����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�킩��܂����c�c";
		set SKILL_BIOETHICS,10;
		close;
	case 10:
		mes "[�P�����\�X]";
		mes "�c�c�v�l���U�����Ă���B";
		mes "�����A��������ꂽ�悤�ɁA";
		mes "�Ռ��������Ă���c�c";
		set SKILL_BIOETHICS,11;
		close;
	case 11:
		mes "[�P�����\�X]";
		mes "�ӂށc�c����Ɠ������o���B";
		mes "��������ȁc�c";
		next;
		mes "[�P�����\�X]";
		mes "���O�������Ă��邱�Ƃ�";
		mes "�������̂��������ȁB";
		next;
		mes "[�P�����\�X]";
		mes "�܂������͂���B";
		mes "�{���ɂ��O����������������";
		mes "�̂��ǂ����c�c";
		next;
		mes "[�P�����\�X]";
		mes "�����A�����l����ς��Ă݂�";
		mes "���Ƃɂ����B�z�����N���X�Z�p��";
		mes "�{���ɐl�X�̖��ɗ��̂��ǂ���";
		mes "�c�c�킵�͂��̉\����M����";
		mes "�݂邱�Ƃɂ��悤�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����c�c�ԈႢ��������H";
		next;
		mes "[�P�����\�X]";
		mes "�����ȁc�c";
		mes "�킵�ɂ����M���Ȃ��񂶂�B";
		mes "����Ă݂Ȃ��Ă͂킩���c�c";
		mes "�Ƃ������Ƃ��B";
		next;
		mes "[�P�����\�X]";
		mes "�ꉞ���O��M���Ă݂悤�B";
		mes "�z�����N���X�Z�p��`�����Ă��B";
		next;
		mes "[�P�����\�X]";
		mes "�����āA�z�����N���X�Z�p��";
		mes "�l�Ԃ̖��ɗ����Ƃ��Ƃ������Ƃ��A";
		mes "�킵�Ɍ����Ă���B";
		mes "�킵���������Ƃ͊ԈႢ�ł͂Ȃ�������";
		mes "�ؖ����Ă���I";
		next;
		mes "[�P�����\�X]";
		mes "�����A�킵�����]�������Ȃ�A";
		mes "���O�Ƃ��̘B���p���A�ꐶ";
		mes "���݂Ȃ��琶���Ă������Ƃ�";
		mes "�Ȃ邾�낤�c�c";
		next;
		mes "[�P�����\�X]";
		mes "�����x�܂��Ă���B";
		mes "���̒��𐮗��������B";
		mes "�܂���Řb�������Ă���B";
		set SKILL_BIOETHICS,12;
		close;
	case 12:
		mes "[�P�����\�X]";
		mes "�������c�c";
		mes "����ł́A�`���v���B";
		mes "�z�����N���X���������߂̊�{�A";
		mes "^FF0000�����ϗ�^000000�ɂ���";
		mes "�������Ă�낤�B";
		next;
		mes "[�P�����\�X]";
		mes "�����ϗ��c�c";
		mes "����͐����ɑ΂��鈤���Ƃ�����B";
		mes "��������΁A�e�Ղ��l��������";
		mes "���Ƃ͂ł��Ȃ��B";
		mes "^FF0000�����̈�����^000000��";
		mes "�悭�������邱�Ƃ���B";
		next;
		mes "[�P�����\�X]";
		mes "�z�����N���X�ɑ΂��Ă���������B";
		mes "�������󂢂Ă��Ȃ����c�c";
		mes "�̒��͖��Ȃ����c�c";
		mes "����͂��Ă��Ȃ����c�c";
		next;
		mes "[�P�����\�X]";
		mes "�������������ׂĂ̂��Ƃɏ��";
		//mes "�C���g���A���̂��̂������邱�ƁB"; //�{�I�d�l
		mes "�C�������A���̂��̂������邱�ƁB";
		mes "���ꂪ�����ϗ�����B";
		next;
		mes "[�P�����\�X]";
		mes "�܂��͖��O��t���Ă�����B";
		mes "�D���ȐH�ו���c�����A�^����B";
		mes "�댯�Ȏ��͎���Ă�����B";
		mes "�����̂��Ƃ́A���ׂ�";
		mes "�z�����N���X�ɑ΂��鈤�䂦����B";
		next;
		mes "[�P�����\�X]";
		mes "�ȒP�Ǝv�����������ȁB";
		mes "���_�͊ȒP�����A���s����̂�";
		mes "�z����₷���������Ƃ���B";
		mes "���O�����ꂩ��z�����N���X��";
		mes "�����ۂɂ́A�S���Ă����悤�ɁB";
		next;
		mes "[�P�����\�X]";
		mes "�z�����N���X�𐶂ݏo���ɂ́c�c";
		mes "����͂����P�V�r�I������";
		mes "������Ă���悤���Ⴉ��A";
		mes "�����Đ����͕s�v����ȁB";
		next;
		mes "[�P�����\�X]";
		mes "���_�͂��ꂭ�炢����B";
		mes "��͎��ۂɃz�����N���X�𐶂ݏo��";
		mes "���O���g�̖ڂŊw���悢�B";
		mes "�^���ɓ��B����܂ŁA������";
		mes "�b�B��ӂ�łȂ����B";
		next;
		mes "[�P�����\�X]";
		mes "�ł́A����ŏI��肶��B";
		mes "�킵�́A���O��M���Ă��邼�B";
		mes "�����c�c���������΁A�킵��";
		mes "���O�̖��O���畷���Ă��Ȃ������ȁB";
		mes "���O�������Ă���񂩁H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̖��O��";
		mes strcharinfo(0);
		mes "�ł��B";
		next;
		mes "[�P�����\�X]";
		mes "�������c�c"+strcharinfo(0)+"���c�c";
		mes "�ǂ����O����B���̖��A";
		mes "�킵�̐S�ɉi���ɍ��ނł��낤�B";
		mes "�����A�s���������A�����̑�B���p�t";
		mes strcharinfo(0)+"��!!";
		set SKILL_BIOETHICS,13; //�N���G�C�^�[�ɓ]�E����܂Ŏc��
		skill 238,1,0;
		close;
	}
	//�₢�ɊԈႦ����
	mes "[�P�����\�X]";
	mes "���ꂭ�炢�̖����킩���Ƃ�";
	mes "��̉����w��ł����Ƃ����̂���H";
	mes "�΂킹��ȁI";
	mes "�����A�������Ə���������I";
	close;
}

lhz_in01,225,122,4	script	�X�N���U�h	754,{
	if(SKILL_BIOETHICS > 4 || getskilllv(238)) {
		mes "[�X�N���U�h]";
		mes "���Ȃ����q�˂�ׂ��l�́A";
		mes "�R�[���z�����N���X�X�L����";
		mes "���Ў҂ł���A�P�V�r�I�����ł��B";
		mes "�e�؂ȕ��ł��̂ŁA";
		mes "�悭�����Ă����ł��傤�B";
		close;
	}
	if(SKILL_BIOETHICS == 4) {
		mes "[�X�N���U�h]";
		mes "�Ȃ�قǁc�c�P�����\�X����";
		mes "��������������Ă��̂ł����c�c";
		mes "��܂��ȏ󋵂͂킩��܂����B";
		mes "�삯�o���̘B���p�t�̏�M�ɑ΂��A";
		mes "���͍ő���̐��ӂ�������";
		mes "���͂������܂��傤�B";
		next;
		mes "[�X�N���U�h]";
		mes "�������������邱�Ƃ́A";
		mes "�P�����\�X���ɏ����I��";
		mes "�z�����N���X�Z�p���w�ׂ΂���";
		mes "���l���o�邱�Ƃ����c�c";
		mes "����ł��A�ꉞ�����Ă����Ă��������B";
		next;
		mes "[�X�N���U�h]";
		mes "�܂��́A^FF0000����^000000�Ƃ����X�L���ł��B";
		mes "���ݏo�����z�����N���X��";
		mes "�ꎞ�I�ɋx�܂���X�L���ł��B";
		next;
		mes "[�X�N���U�h]";
		mes "�������g�p�����z�����N���X�́A";
		mes "^FF0000�R�[���z�����N���X^000000�Ƃ����X�L����";
		mes "����āA�ĂьĂяo�����Ƃ��ł��܂��B";
		mes "�������A�����ƃR�[���z�����N���X��";
		mes "�J��Ԃ����Ƃ́A";
		mes "���܂�]�܂����Ȃ��ł��傤�B";
		next;
		mes "[�X�N���U�h]";
		mes "�l���Ă݂Ă��������c�c";
		mes "�l�Ԃ����ݏo�����Ƃ͂����A";
		mes "�z�����N���X�����R���鐶���ł��B";
		mes "���̐������A�x�܂���A�܂��Ăяo��";
		mes "�Ƃ����s�ׂ́A���������D�������";
		mes "���ėǂ����Ƃł͂Ȃ��ł��ˁB";
		next;
		mes "[�X�N���U�h]";
		mes "�Ƃɂ����A�z�����N���X��";
		mes "��̐����Ƃ������Ƃ��A";
		mes "�悭�F�����Ȃ���΂����܂���B";
		mes "����͋Z�p�Ɠ����ɐS���˂΂Ȃ�Ȃ�";
		mes "�ƂĂ���{�I�Ȃ��Ƃł��B";
		next;
		mes "[�X�N���U�h]";
		mes "���Ƃ́c�c";
		mes "���̈����Ƃ����X�L���́A1���x����";
		mes "�}�X�^�[���邱�Ƃ��ł��܂��B";
		mes "�w�Ԃ̂ɂ������J�͂��Ȃ��ł��傤�B";
		next;
		mes "[�X�N���U�h]";
		mes "�����������ł��邱�Ƃ́A";
		mes "���̈ʂł��ˁc�c";
		mes "���́A^FF0000�R�[���z�����N���X^000000�̃X�L����";
		mes "�ڂ����A^FF0000�P�V�r�I��^000000����";
		mes "�K�˂Ă݂Ă��������B";
		next;
		mes "[�X�N���U�h]";
		mes "���̏Љ�ŗ����ƌ�����";
		mes "�e�؂ɋ����Ă����ł��傤�B";
		mes "�������悭�K���w�͂����邱�Ƃł��B";
		mes "���Ȃ��̘B���p�̓��Ɍ����˂����Ƃ�";
		mes "�F���Ă��܂��B";
		set SKILL_BIOETHICS,5;
		close;
	}
	mes "[�X�N���U�h]";
	mes "�B���p�͑f�G�Ȋw��ł��B";
	mes "�^����ǋ����A�ʂĂ��Ȃ��T����";
	mes "�ł���Ȃ�āA�l���������ł�";
	mes "�]�N�]�N���܂��񂩁H";
	close;
}

lhz_in01,204,138,4	script	�P�V�r�I��	750,{
	if(SKILL_BIOETHICS > 5 || getskilllv(238)) {
		mes "[�P�V�r�I��]";
		mes "���Ȃ����q�˂�ׂ��l�́A";
		mes "���U���N�V�����z�����N���X�X�L����";
		mes "���Ў҂ł���u�����`�����ł��B";
		mes "�ς��҂ł͂���܂����A";
		mes "���߂΂悭�����Ă����͂��ł��B";
		close;
	}
	if(SKILL_BIOETHICS == 5) {
		mes "[�P�V�r�I��]";
		mes "���A�X�N���U�h���̏Љ�ŗ���";
		mes "���ł��ˁH�@��낵���B";
		mes "���̓P�V�r�I���Ƃ����܂��B";
		mes "�ǂ��ɂł�����A�����Ȃ�";
		mes "�B���p�t�ł���B";
		next;
		mes "[�P�V�r�I��]";
		mes "����A���Ȃ��͎G�k�����ɗ���";
		mes "�킯�ł͂Ȃ��ł���ˁc�c";
		mes "�{��ɓ���Ƃ��܂��傤�B";
		next;
		mes "[�P�V�r�I��]";
		mes "^FF0000�R�[���z�����N���X^000000�c�c";
		mes "�X�L����������킩��ʂ�A";
		mes "�z�����N���X���Ăяo���X�L���ł��B";
		mes "�����X�L�����擾���Ă���҂̂�";
		mes "�w�Ԃ��Ƃ��ł��A1���x���Ń}�X�^�[";
		mes "���邱�Ƃ��ł��܂��B";
		next;
		mes "[�P�V�r�I��]";
		mes "������Ԃ̃z�����N���X��";
		mes "�Ăяo�����Ƃ��ł���킯�ł����c�c";
		mes "�z�����N���X�̕����Ȏ���";
		mes "�󂷍s�ׂł���̂ŁA���܂肨���߂�";
		mes "�������Ȃ��ł��ˁB";
		next;
		mes "[�P�V�r�I��]";
		mes "�܂��A�z�����N���X�����߂�";
		mes "���ݏo���̂����̃X�L���ł��B";
		mes "�z�����N���X�𐶂ݏo���ɂ́A";
		mes "^FF0000�G���u���I^000000��1�K�v�ł��B";
		next;
		mes "[�P�V�r�I��]";
		mes "���̃G���u���I���쐬����ɂ́A";
		mes "^FF0000����|�b�g^000000�A^FF0000�C�O�h���V���̘I^000000�A";
		mes "^FF0000�����̎�q^000000�A��";
		mes "1���K�v�ł��B";
		next;
		mes "[�P�V�r�I��]";
		mes "�Z�p�I�Ȗʂ͈ȏ�ł��ˁB";
		mes "�z�����N���X����̐����ł���";
		mes "�Ƃ������Ƃ������ĖY��Ȃ����Ƃł��B";
		mes "��؂Ɉ���Ȃ��Ă͂����܂���B";
		next;
		mes "[�P�V�r�I��]";
		mes "�c�c�����炢���痝�_���w��ł��A";
		mes "�P�����\�X���ɋZ�p�̊�b����";
		mes "�w�΂Ȃ��Ă͎g���Ȃ��ł��傤���c�c";
		mes "���������ɗ����Ƃ�����ł��傤�B";
		mes "�o���Ă����Ă��������B";
		next;
		mes "[�P�V�r�I��]";
		mes "�����������ł��邱�Ƃ́A";
		mes "���̈ʂł����ˁc�c";
		mes "^FF0000���U���N�V�����z�����N���X^000000�ɂ���";
		mes "^FF0000�u�����`��^000000����K�˂Ă݂Ȃ����B";
		next;
		mes "[�P�V�r�I��]";
		mes "���ǂ��ɂ��邩�́A�킩��܂���B";
		mes "���X�ς��҂ŁA�ǂ�����";
		mes "�V��ł���̂ł͂Ȃ����Ǝv���܂��B";
		next;
		mes "[�P�V�r�I��]";
		mes "�����ւ͍s���Ă��Ȃ��Ǝv���܂��B";
		mes "���q�^���[���̂ǂ����ɂ���ł��傤�B";
		next;
		mes "[�P�V�r�I��]";
		mes "����ł́A�K�^���F��܂��B";
		set SKILL_BIOETHICS,6;
		close;
	}
	mes "[�P�V�r�I��]";
	mes "�^����ǋ����邽�߂ɂ́A";
	mes "�K�������B���p���w�΂Ȃ��Ă�";
	mes "�Ȃ�Ȃ��c�c�Ƃ����킯�ł͂Ȃ��ł��B";
	mes "�^���Ƃ́A1�����Ƃ͌���Ȃ�";
	mes "�ł�����ˁc�c";
	mes "���Ȃ��������v���ł��傤�H";
	close;
}

lhz_in02,278,273,2	script	�u�����`��	709,{
	if(SKILL_BIOETHICS > 6 || getskilllv(238)) {
		mes "[�u�����`��]";
		mes "�g�����̂Ȃ��m���Ȃ�";
		mes "�w�ԕK�v�͂Ȃ��B";
		mes "�m���Ă���̂Ɏg���Ȃ��c�c";
		mes "���̋�ɂ����O�ɂ킩�邩�H";
		mes "���߂����������B";
		close;
	}
	if(SKILL_BIOETHICS == 6) {
		mes "[�u�����`��]";
		mes "���`�A�q�b�N�c�c";
		mes "������˂��c�c�����m����ςݏd�˂�";
		mes "�����Ŏg�����Ƃ��ł��Ȃ��c�c";
		mes "����Ȋw����w�Ԃ��A�V�ԕ���";
		mes "�������I�@�q�b�N�c�c";
		next;
		mes "[�u�����`��]";
		mes "��c�c�H�@�����H";
		mes "�P�V�r�I���ɏЉ�ꂽ���ƁH";
		mes "�܂������c�c�P�V�r�I���̓z�A";
		mes "���̘b��S�R�����Ă˂��ȁc�c";
		mes "�������m����ς�łǂ�����񂾁H";
		mes "�܁A���ɂ͊֌W�Ȃ����ȁc�c";
		next;
		mes "[�u�����`��]";
		mes "�ꉞ�A�ȒP�ɋ����Ă�낤�B";
		mes "�v�_�����ȁB";
		mes "^FF0000���U���N�V�����z�����N���X^000000�ɂ���";
		mes "���ȁc�c";
		next;
		mes "[�u�����`��]";
		mes "���U���N�V�����z�����N���X�́A";
		mes "�m����ԂƂȂ����z�����N���X��";
		//mes "���������c�c�܂�A";	// �{�I�d�l
		mes "����������c�c�܂�A";
		mes "HP��0�ɂȂ����z�����N���X��";
		mes "�ēx������悤�ɂ���X�L�����B";
		next;
		mes "[�u�����`��]";
		mes "5���x���Ń}�X�^�[���邱�Ƃ��ł���";
		mes "�X�L���ŁA�z�����N���X�֘A�ł�";
		mes "��ԍŌ�Ɋw�ԃX�L�����B";
		next;
		mes "[�u�����`��]";
		mes "�����狳���邱�Ƃ͂���ŏI��肾�B";
		mes "�ǂ݂̂��A�P�����\�X����";
		mes "��b���w�΂񂱂Ƃɂ́A";
		mes "�z�����N���X�𐶂ݏo�����Ƃ�";
		mes "�ł��Ȃ��̂ŁA�Ӗ����Ȃ����ȁB";
		next;
		mes "[�u�����`��]";
		mes "�P�����\�X�́A���̊�b�𑼐l��";
		mes "�`��������肪�Ȃ��悤������A";
		mes "���̂��̒m�������ʂ��Ă��Ƃ��B";
		next;
		mes "[�u�����`��]";
		mes "�ӂ�c�c���ʂȘb�������܂����ȁB";
		mes "�ȏゾ�B";
		mes "�ǂ����g�����Ƃ̂ł��Ȃ��m���A";
		mes "�w��łǂ�����Ƃ����񂾁H";
		next;
		mes "[�u�����`��]";
		mes "�����A�����s���B";
		mes "���͎������ށI";
		mes "���܂Ȃ������Ă��˂����I";
		set SKILL_BIOETHICS,7;
		close;
	}
	mes "[�u�����`��]";
	mes "�q�b�N�c�c���߂�V�ׂ�`";
	mes "���`�������܂����`";
	mes "�c�c�q�b�N";
	close;
}

lhz_in03,106,34,2	script	�R�[����	706,{
	if(SKILL_BIOETHICS == 8 || SKILL_BIOETHICS == 9) {
		mes "[�R�[����]";
		mes "�l�̂�������͂ˁA�̂��B���p�t";
		mes "�Ȃ񂾂�I�@�N�����m���������āA";
		mes "�N�����������񂾁I";
		next;
		mes "[�R�[����]";
		mes "�ł��ŋߑS�R���C���Ȃ��񂾁B";
		mes "�Ȃ񂩂ӂĂ�����Ă���悤�ȁA";
		mes "����Ȋ����B";
		mes "��̉����������̂��c�c";
		mes "���܂ł���Ȃ��ƂȂ������̂ɁB";
		next;
		mes "[�R�[����]";
		mes "�l���a�C�ɂȂ������Ȃ񂩂́A";
		mes "�ŕa���Ȃ���l�̎�����������";
		mes "�����āA�������ɂ��Ă����񂾁B";
		mes "����ŁA���������̕a�@��";
		mes "�A��čs���Ă���āA�ꐶ����";
		mes "�l������̂��F���Ă����́B";
		next;
		mes "[�R�[����]";
		mes "�l�́A��������݂����ȗ��h��";
		mes "��l�ɂȂ����Ȃ񂾁I";
		mes "�O�ł͗��h�ȘB���p�t�A";
		mes "�Ƃł͉Ƒ��z���̉ƒ��B";
		mes "�{���ɁA�����̂������񂪍ō�����I";
		next;
		mes "[�R�[����]";
		mes "���ւցc�c�Ƃɂ����A";
		mes "�ŋ߂͉��������C���Ȃ����ǁA";
		mes "�����ɂ����̑f�G�Ȃ��������";
		mes "�߂�͂������I";
		if(SKILL_BIOETHICS == 8)
			set SKILL_BIOETHICS,9;
		close;
	}
	mes "[�R�[����]";
	mes "�����̂�������͍ō�����I";
	mes "�l�������A��������̂悤�ȗ��h��";
	mes "�B���p�t�ɕK���Ȃ�񂾁I";
	close;
}

lhz_in03,109,31,4	script	�x�j�[�l	90,{
	if(SKILL_BIOETHICS == 8 || SKILL_BIOETHICS == 9) {
		mes "[�x�j�[�l]";
		mes "���̎�l�ɉ�܂������H";
		mes "��łŁA�����̎咣���Ȃ���̂�";
		mes "�匙���Łc�c�ł��A";
		mes "�������Ԉ���Ă���ƋC�Â�����";
		mes "�f���Ɏӂ�A�ԈႢ�𐳂��E�C��";
		mes "�������l�ł��B";
		next;
		mes "[�x�j�[�l]";
		mes "�d�����d�v�����A";
		mes "�{���ɏd�v�Ȃ��͉̂Ƒ����ƁA";
		mes "���������Ă���܂��B";
		next;
		mes "[�x�j�[�l]";
		mes "���B�Ƒ����A����ȃP�����\�X��";
		mes "�����Ă��܂��B";
		close;
	}
	mes "[�x�j�[�l]";
	mes "�B���p�t�̍Ȃ͑�ς�������";
	mes "�悭������̂ł����A";
	mes "���ۂ͂���Ȃ��Ƃ͂���܂���B";
	mes "�Ǝ����悭��`���Ă���܂����A";
	mes "�ƂĂ��������Ă܂���B";
	close;
}


//-----------------------------------------------
//==== ���W�X�g�|�[�V��������
//	�� SKILL_RESISTPOTION   -> 0�`11
//-----------------------------------------------
yuno_in04,33,108,4	script	�s�[�X���[�N	883,{
	if(getbaseclass(Class,2) != CLASS_AM) {
		mes "[�s�[�X���[�N]";
		mes "�����ŉ������Ă�I";
		mes "�O�ɏo�Ă���Ȃ����H";
		close;
	}
	if(JobLevel < 40) {
		mes "[�s�[�X���[�N]";
		mes "�c�c�S�z�b�S�z�b�S�z�S�z�B";
		mes "��オ����Ȃ��ȁc�c";
		mes "�z���g�܂������B";
		close;
	}
	switch(SKILL_RESISTPOTION) {
	case 0:
		mes "[�s�[�X���[�N]";
		mes "�S�z�b�S�z�S�z�S�z�b�c�c";
		mes "�y�����`���`���`�A�S�z�b";
		mes "�c�c����H";
		mes "�����A���l�̌���������Ɍ���ȁI";
		next;
		mes "[�s�[�X���[�N]";
		mes "���ꂾ����O�̓z�́c�c";
		mes "�u�c�u�c�u�c�u�c�u�c�u�c";
		set SKILL_RESISTPOTION,1;
		close;
	case 1:
		mes "[�s�[�X���[�N]";
		mes "�܂������̂��H";
		mes "�ǂ���猤�������ɗ��Ă�";
		mes "�킯����Ȃ��݂��������ǁc�c";
		mes "����ȂƂ��ɉ����p�H";
		next;
		if(select("���̌������H","�ǂ��������āc�c")==2) {
			mes "[�s�[�X���[�N]";
			mes "�����}�j���A���Ƃ��Ȃ�";
			mes "���X�ɂł��s���Ĕ����Ȃ����B";
			mes "�����ɂ���̂͑S��";
			mes "���B�̏��L�����B";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "���ĕ�����Ȃ��H";
		mes "�c�c�ƌ����Ă�������킯�Ȃ����B";
		mes "���̑O�A���l�̌���������Ɍ���Ȃ�";
		mes "�{�����̂������Ă�H";
		next;
		mes "[�s�[�X���[�N]";
		mes "���Ă̒ʂ�A�����͋������������B";
		mes "�n�R�l���Ꭹ�������̌�������";
		mes "�����Ƃ͂ł��Ȃ�����A";
		mes "���߂�ꂽ���z�𕥂���";
		mes "�����������̋�������";
		mes "�؂�Ă���񂾁B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�������A�����n�R�l�Łc�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�����ŁA����j�����l�̌����𓐂��";
		mes "�w�E�ɐi�o���������������B";
		mes "������A����ȕ���";
		mes "���͋C���E���Ƃ��Ă�񂾁B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�c�c�c�c";
		mes "�ł��A�n�R������";
		mes "�ǂ����悤���Ȃ��񂾁c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�������҂����@��";
		mes "�Ȃ��킯����Ȃ��c�c";
		mes "���鉓�����̘B���p�t��";
		mes "������˗����󂯁A";
		mes "�i����[�i���ɃL�`���ƍ��킹��";
		mes "�[�i����ƌ����Ă�B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�[�i�c�c";
		mes "���A����������";
		mes "�N�͖`���҂��ˁH";
		mes "���O�͉��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes strcharinfo(0)+ "�c�c�ł����B";
		next;
		mes "[�s�[�X���[�N]";
		mes "���A�����K�v�Ƃ��Ă���";
		mes "�����̍ޗ��������Ă��Ă����΁A";
		mes "���̑㏞�Ƃ��Ď����������̂�";
		mes "�����Ă����悤�B";
		mes "�ǂ����N�Ǝ��ł�";
		mes "�������e���Ⴄ�͂����c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�K�v�ȕ���";
		mes "�C�G���[�W�F���X�g�[��5�A";
		mes "��̃|�[�V�����r4�{�A";
		mes "�l���̐S��10�A";
		mes "��̉H��10�B";
		mes "�����������Ă��Ă���B";
		set SKILL_RESISTPOTION,2;
		close;
	case 2:
		mes "[�s�[�X���[�N]";
		mes strcharinfo(0)+ "�N�B";
		mes "���񂾕i���́c�c";
		mes "��̃|�[�V�����r4�{�Ɓc�c";
		mes "�c�c��c�c";
		mes "���������H";
		next;
		if(select("�C�G���[�W�F���X�g�[��5��","�u���[�W�F���X�g�[��5��","���b�h�W�F���X�g�[��5��")!=1) {
			mes "[�s�[�X���[�N]";
			mes (@menu==2? "�u���[": "���b�h")+ "�W�F���X�g�[���Ɓc�c";
			mes "���ꂾ�������H";
			mes "�m���ɂ������܂ł��Ă�����Ƃ�";
			mes "�������ƒ�R�͂����߂�";
			mes "�򕨂𒲍����Ă������c�c";
			mes "���ꂶ��c�c�S�z���ȁB";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "�C�G���[�W�F���X�g�[��5�Ɓc�c";
		mes "���Ɓc�c";
		next;
		if(select("�l���̐S��10��","�ł������[���s�[10��")==2) {
			mes "[�s�[�X���[�N]";
			mes "���A���������B�ł������[���s�[�B";
			mes "�c�c����Ȃ��ȁB";
			mes "�����ă[���s�[�̏�����";
			mes "�����ł��Ă��邩��c�c";
			mes "����ȊO�̕����ȁB";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "�l���̐S��10�c�c";
		mes "���Ɓc�c";
		next;
		if(select("�g�J�Q�̋݊�10��","��̉H��10��")==1) {
			mes "[�s�[�X���[�N]";
			mes "���[��c�c���ꂶ��Ȃ��ȁB";
			mes "�F�B�����ꂽ�̂�";
			mes "�������ɐς�ł��邩��c�c";
			mes "�����������Ȃ��H";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "�C�G���[�W�F���X�g�[��5�A";
		mes "��̃|�[�V�����r4�{�A";
		mes "�l���̐S��10�A";
		mes "��̉H��10�B";
		mes "�S����ɓ���Ă����H";
		next;
		if(select("�܂��ł�","�������ł��I")==1) {
			if(rand(5)) {
				mes "[�s�[�X���[�N]";
				mes "���[��c�c";
				mes "�ł��邾���������Ă���B";
				mes "�������������Ă��ł��Ȃ��āc�c";
				close;
			}
			mes "[�s�[�X���[�N]";
			mes "���Ȃ�W�߂Ȃ��Ă�����B";
			mes "�����Z��������ˁB";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "������Ƒ҂��āc�c";
		next;
		if(countitem(715) == 0 && countitem(1093) == 0 && countitem(950) == 0 && countitem(1057) == 0) {
			mes "[�s�[�X���[�N]";
			mes "���[�����[�������āA";
			mes "��������Ă��ĂȂ�����Ȃ����B";
			mes "�c�c�c�c";
			mes "���͂�����肪�Ȃ��̂Ȃ�";
			mes "�͂��߂��炻�������Ă���B";
			next;
			mes "[�s�[�X���[�N]";
			mes "�X�ł��ǂ��ł���������";
			mes "������ɂ���Ă��Ă���Ȃ����B";
			close;
		}
		if(countitem(715) < 5 || countitem(1093) < 4 || countitem(950) < 10 || countitem(1057) < 10) {
			mes "[�s�[�X���[�N]";
			mes "����Ȃ�����Ȃ����B";
			mes "�����炷������́A";
			mes "�ޗ�������Ȃ��Ƃǂ�Ȍ��ʂ�";
			mes "�Ȃ邩�킩��Ȃ��񂾂��B";
			mes "���������ɂ���";
			mes "�񑩂͎���Ă����B";
			next;
			mes "[�s�[�X���[�N]";
			mes "�ꉞ������";
			mes "��񂵂ɂ��Ă��������ǁA";
			mes "�ł��邾�����������Ă��Ă���B";
			mes "���̕���������B";
			close;
		}
		delitem 715,5;
		delitem 1093,4;
		delitem 950,10;
		delitem 1057,10;
		set SKILL_RESISTPOTION,3;
		mes "[�s�[�X���[�N]";
		mes "�m���ɁB";
		mes "�����Ȃ��Ȃ��ǂ��݂������B";
		mes "�悵�c�c���ꂶ�Ⴀ�A";
		mes "�����Ŏ������𒲍�����Ǝv���H";
		next;
		if(select("��H","���e�H")==1) {
			set SKILL_RESISTPOTION,4;
			mes "[�s�[�X���[�N]";
			mes "�����A���̒ʂ�B";
		}
		else {
			set SKILL_RESISTPOTION,4;
			mes "[�s�[�X���[�N]";
			mes "���e�Ƃ͂Ȃ񂾁B";
			mes "�򂾁A��I";
			next;
			mes "[�s�[�X���[�N]";
			mes "������񔚒e������";
			mes "�ȒP�ɂ������҂����͂ł��邪�c�c";
			mes "���̔��e���������āA�����g��";
			mes "����ł��܂��Ƃ������Ƃ́A";
			mes "�悭����b����H";
			next;
			mes "[�s�[�X���[�N]";
			mes "���R�A��������ꏊ���Ȃ��B";
			mes "�������e�����ɂ�";
			mes "����Ȃ�̐ݔ����K�v�Ȃ񂾁B";
			next;
			mes "[�s�[�X���[�N]";
			mes "�����ĉ������A";
			mes "���ɂ͂���Ȃ��̂�";
			mes "������܂������Ȃ��B";
			next;
			mes "[�s�[�X���[�N]";
			mes "�b��߂������B����";
		}
		mes "�ǂ�Ȗ����邩�Ƃ����Ɓc�c";
		next;
L_Label1:
		mes "[�s�[�X���[�N]";
		mes "����򂪑̓��̏����y�f��";
		mes "�����ł���悤�ɂȂ�΁A";
		mes "�}���ɑ̎���";
		mes "�ω�����悤�ɂȂ�B";
		next;
		mes "[�s�[�X���[�N]";
		mes "���������Ȃ�c�c";
		mes "���X�A�l�Ԃ̑̂�";
		mes "���M�Ɏア�B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�΂͖ܘ_�A";
		mes "�����Ŏ�ɂ₯�ǂ�����ƁA";
		mes "���̕����̔��͎��ʁB";
		mes "�������^�Ԃ̂������Ă���y�f��";
		mes "�M�ɂ���ĕς���Ă��܂����炾�B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�a�C�ɂ������č��M�Ŏ���ł��܂��̂�";
		mes "���̂��߂��B";
		mes "�����āA���������璲������̂́A";
		mes "������l�דI�ɑ���A";
		mes "�M�ɑ΂���ϐ������o�����̂��B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�����A����p������B";
		mes "���΂̑����ɂ͕K��";
		mes "�キ�Ȃ��Ă��܂��B";
		mes "���R�̗͂ɔ�����";
		mes "�l�H�I�ȕω��Ȃ̂�����";
		mes "�d���Ȃ����c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�������u���o���v�Ƃ������Ƃ�";
		mes "���ꂪ���X�����Ă������݂̈Ӗ���";
		mes "�Ȃ��Ă��܂����Ƃł�����c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�Ƃɂ����c�c";
		mes "�N���W�߂Ă��ꂽ�ޗ��𒲍����悤�B";
		mes "�ł��A";
		mes "�܂��H�l�A���̉Ԃ�����Ȃ��񂾁B";
		mes "�c�c20���B";
		next;
		mes "[�s�[�X���[�N]";
		mes "��������߂邩�ȁH";
		next;
		if(select("�����c�c������ƖZ������","�킩��܂���","�㉿�́H")==3) {
			mes "[�s�[�X���[�N]";
			mes "�c�c�c�c";
			mes "����������������A�N�ɂ�";
			mes "���@���^�_�ŋ����Ă�����񂾂��B";
			mes "�ǂ�����H";
			next;
			set @menu,select("�ǂ����Ă��Z�����āc�c","������܂����c�c");
		}
		if(@menu == 1) {
			set SKILL_RESISTPOTION,5;
			mes "[�s�[�X���[�N]";
			mes "�������B";
			mes "�Ȃ玩���Ŏ��ɍs�������c�c";
			mes "���͖񑩂ǂ���A";
			mes "�������̂��������񂾂���A";
			mes "����ȏケ���ɗp�͂Ȃ�����H";
			close;
		}
		set SKILL_RESISTPOTION,6;
		mes "[�s�[�X���[�N]";
		mes "���肪�Ƃ��B";
		mes "���ꂶ�Ⴀ�҂��Ă���Ԃ�";
		mes "���̓N���[�o�[�̃G�L�X��";
		mes "�����Ă��邩��c�c";
		next;
		menu "�������������̂ł����H",-;
		mes "[�s�[�X���[�N]";
		mes "��H�@�����B";
		mes "�N���[�o�[������";
		mes "�����킯����Ȃ��񂾁c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "���̓n�[�u��K�v�Ƃ��Ă���̂ɁA";
		mes "���̖`���҂Ƃ��Ă̗͂ł�";
		mes "�K�v�ȃn�[�u�����ɍs�����Ƃ�";
		mes "�ł��Ȃ��B";
		mes "������A�K���ɂ��̕ӂ�";
		mes "����̕�����ɓ���Ă���B";
		next;
		mes "[�s�[�X���[�N]";
		mes "���Ă̒ʂ�ڂ������A";
		mes "�S�����ア��������";
		mes "�����Ȏ��͂��Ȃ��悤�ɂ�";
		mes "�~�߂��Ă���c�c";
		mes "�����炱���A";
		mes "�������������̐����������c�c";
		if(Sex == 0) {
			mes "�c�c�N�Ȃ�";
			mes "�������Ă����C������B";
		}
		next;
		mes "[�s�[�X���[�N]";
		mes "�n�[�u�̓N���[�o�[��";
		mes "�Ȃ�Ƃ��Ȃ��Ă��A";
		mes "�H�l�A���̉Ԃ�����";
		mes "�ʂ̕��ő�p���邱�Ƃ��ł��Ȃ��B";
		mes "������A���񂾂�B";
		close;
	case 3:
		//������
		set SKILL_RESISTPOTION,4;
		close;
	case 4:
		mes "[�s�[�X���[�N]";
		mes "��𒲍�����ƌ�������H";
		mes "�������K�v�Ȃ̂��H";
		next;
		if(select("������","�͂�")==1) {
			mes "[�s�[�X���[�N]";
			mes "�������B";
			mes "���͍��Z�����񂾁B";
			close;
		}
		goto L_Label1;
	case 5:
		mes "[�s�[�X���[�N]";
		mes "�Z�����񂾂��ǁc�c";
		mes "�p�����Ȃ��̂�";
		mes "�����ɂ������x���������";
		mes "���̐l�̖��f�ɂȂ�񂾁B";
		mes "�킩���Ă���̂��H";
		next;
		if(select("�킩���Ă��܂�","����ς�A����`�����悤�Ǝv����")==1) {
			mes "[�s�[�X���[�N]";
			mes "�c�c";
			mes "�Ȃ�A�����O�ɏo�Ă���B";
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "�c�c���̐S���̕ω����m��Ȃ����A";
		mes "���͌��������ł���΂�������";
		mes "�\��ȁc�c";
		mes "�S�z�b�S�z�S�z�b�B";
		next;
		mes "[�s�[�X���[�N]";
		mes "�c�c�S�z�b�B";
		mes "���삳�����܂�΁c�c";
		mes "�����ɂ悭�Ȃ�c�c�c�c";
		mes "�c�c�c�c����A����ς薳�����B";
		mes "�n�n�n�c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "���ꂶ�Ⴀ���߂āA";
		mes "�H�l�A���̉Ԃ�20��";
		mes "�����Ă��Ă���Ȃ����B";
		if(Sex)
			mes "�ł��邾���������Ă���B";
		//else ������
		set SKILL_RESISTPOTION,6;
		close;
	case 6:
		if(countitem(1032) < 20) {
			mes "[�s�[�X���[�N]";
			mes "���[��c�c";
			mes "�H�l�A���̉Ԃ�";
			mes "20�͂���ȁc�c";
			next;
			mes "-�����ǂ�����";
			mes "�l������ł���-";
			close;
		}
		delitem 1032,20;
		set SKILL_RESISTPOTION,7;
		mes "[�s�[�X���[�N]";
		mes "�c�c���肪�Ƃ��B";
		if(Sex == 0) {
			mes "�{���Ɂc�c";
			mes "����ȂɎ�Ԃ������Ă���āc�c";
		}
		mes "�悵�c�c���Ƃ̓N���[�o�[�̃G�L�X��";
		mes "�H�l�A���̉Ԃ������邾���Łc�c";
		mes "�c�c";
		next;
L_Label2:
		set SKILL_RESISTPOTION,9;
		misceffect 183;
		mes "[�s�[�X���[�N]";
		mes "�����b�I";
		next;
		mes "[�s�[�X���[�N]";
		mes "�����͂Ȃ�!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���A���K�l���c�c";
		mes "�c�c";
		next;
		if(Sex) {
			mes "-���h�ȐN�B-";
			mes "-���K�l�̉��̑f�炩���";
			mes "���ɗႦ�悤���Ȃ�-";
			mes "-�������܂Řb���Ă����w�҂Ƃ�";
			mes "�܂�ňႤ�l����-";
		}
		else {
			mes "-�����ɋ�����������";
			mes "�ނ̃��K�l�������Ċ��ꂽ-";
			mes "-�����ɂ́A";
			mes "�������܂Řb���Ă����w�҂Ƃ�";
			mes "����l�����ƐM�����Ȃ�����";
			mes "�����N�������c�c-";
		}
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���́c�c���́c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�{���ɑ��v�H";
		mes "���߂�A�悭�����Ȃ��āB";
		mes "��������ĂȂ����Ƃ��炢����";
		mes "�킩��Ȃ��񂾁B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�͂��B";
		mes "�Ƃ���Łc�c���K�l���c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�c�c�����A���܂����B";
		mes "���͗\�����Ȃ��̂Ɂc�c";
		mes "�c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "���́A" +strcharinfo(0)+ "����B";
		mes "�������ǁA�����g���Ă����̂�";
		mes "�����悤�ȃ��K�l��";
		mes "�����Ă��Ă���Ȃ����H";
		next;
		mes "[�s�[�X���[�N]";
		mes "���͂قƂ�ǑO�������Ȃ��āA";
		mes "�����Ȃ�����c�c";
		mes "����ɌN�������Ă��Ă�����";
		mes "������񂾁c�c";
		mes "�c�c�z���g�B";
		mes "���ނ�B";
		close;
	case 7:
		set SKILL_RESISTPOTION,8;
		mes "[�s�[�X���[�N]";
		mes "�c�c�\�z�ʂ�ɂ����Ȃ��ȁB";
		mes "�H�l�A���̉ԁc�c";
		mes "���ƈ������ɓ���Ă���Ȃ����H";
		mes "���ނ�B";
		close;
	case 8:
		if(countitem(1032) < 1) {
			mes "[�s�[�X���[�N]";
			mes "�c�c�\�z�ʂ�ɂ����Ȃ��ȁB";
			mes "�H�l�A���̉ԁc�c";
			mes "���ƈ������ɓ���Ă���Ȃ����H";
			mes "���ނ�B";
			close;
		}
		delitem 1032,1;
		set SKILL_RESISTPOTION,7;
		mes "[�s�[�X���[�N]";
		mes "�c�c���肪�Ƃ��B";
		mes "�悵�c�c���Ƃ�";
		mes "�H�l�A���̉Ԃ�������΁c�c";
		mes "�c�c";
		next;
		goto L_Label2;
	case 9:
		mes "-�ނׂ͍������ڂ�";
		mes "���ꂽ���K�l���������Ă���-";
		mes "-���x���Ă��A���K�l���Ȃ�����";
		mes "�����ƃ}�V��-";
		next;
		if(select("�u���K�l�v��n��","�n���Ȃ�")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c���̕��������ƒj�O�Ȃ̂Ɂc�c";
			next;
			mes "[�s�[�X���[�N]";
			mes "����H";
			mes "�����������H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���c�c�A�n�n�c�c";
			mes "���ł��Ȃ��ł��I";
			close;
		}
		if(countitem(2243) < 1) {
			mes "-�ނɓn�����̂��Ȃ�-";
			close;
		}
		delitem 2243,1;
		set SKILL_RESISTPOTION,10;
		mes "-�ނ̎�ɂ�������";
		mes "���K�l�����点��-";
		next;
		mes "[�s�[�X���[�N]";
		mes "����H";
		mes "�N�H�c�c���A" +strcharinfo(0)+ "�H";
		mes "���肪�Ƃ��B";
		mes "�ӂށc�c";
		mes "�����͂����������ǂ�";
		mes "����ĂȂ��ˁB";
		next;
		mes "[�s�[�X���[�N]";
		mes "�n�n�c�c�т����肵�āA";
		mes "���K�l���󂵂Ă��܂����B";
		mes "���ꂶ�Ⴀ�A���ʂ��m���߂悤���c�c";
		mes "�c�c";
		next;
		mes "[�s�[�X���[�N]";
		mes "�c�c�悵�B";
		mes "���_�ʂ肤�܂��������悤���B";
		mes "�l�Ԃւ̖򕨓��^��";
		mes "������t�^����c�c";
		mes "������֗��ł��A���Ԃɂ�";
		mes "�󂯓�����h����������Ȃ����B";
		next;
		mes "[�s�[�X���[�N]";
		mes "���܂ł���Ȗ��@��";
		mes "�Ȃ������킯�ł��Ȃ����B";
		mes "�����Ɏ󂯓�����Ȃ����̂��ȁB";
		mes "���c�c���������B";
		mes strcharinfo(0)+ "����B";
		mes "���̖���g���Ă݂邩���H";
		next;
		mes "[�s�[�X���[�N]";
		mes "�N�͎��Ƃ͈Ⴂ�A";
		mes "�������ɘU��Ȃ���";
		mes "�O�Ŋ�������l�����B";
		mes "�����Ƃ��̖���g������";
		mes "����͂����B";
		next;
L_Label3:
		if(select("�����ł���","�����c�c")==2) {
			mes "[�s�[�X���[�N]";
			mes "�c�c�킩�����B";
			mes "�l�����ς������";
			mes "�܂������ŁB";
			if(Sex == 0) {
				next;
				mes "-���K�l�̌������ɂ���";
				mes "�ނ̖ڂ��A�������";
				mes "�₵�����Ɍ�����-";
			}
			close;
		}
		mes "[�s�[�X���[�N]";
		mes "���ꂶ�Ⴀ�A���̘_����";
		mes "�ǂ�ł����Ă����H";
		mes "���_�ʂ�Ɋ������Ă邵";
		mes "�_���͂�����o����B";
		mes "����͈ꏏ�ɐ��{����";
		mes "���ʖ{����B";
		next;
		mes "-�ނ͑�������������";
		mes "�ϐ��Ɋւ�������ƁA";
		mes "����g���ۂ�";
		mes "���ӓ_���������-";
		next;
		set SKILL_RESISTPOTION,11;
		getitem 7434,1;
		mes "[�s�[�X���[�N]";
		mes "�c�c����ł킩�������ȁB";
		mes "���ꂱ��ޗ����W�߂Ȃ���";
		mes "�ǂ�ȕ��Ɏg�����l�������낤���c�c";
		mes "���������ł��Ă���Ǝv���B";
		next;
		mes "[�s�[�X���[�N]";
		if(Sex) {
			mes "���x�܂���������";
			mes "�d�����������痊�ނ�B";
		}
		else
			mes "�c�c�b���肪�ł��Ċy���������B";
		mes "�S�z�b�S�z�c�c�S�z�b�B";
		mes "���낻�뎟�̌������n�߂邩�c�c";
		close;
	case 10:
		mes "[�s�[�X���[�N]";
		mes "���_�ʂ肤�܂��������݂��������A";
		mes "��ɂ��ċ����Ă����悤���H";
		next;
		goto L_Label3;
	case 11:
		switch(countitem(7434)) {
		case 0:
			mes "[�s�[�X���[�N]";
			mes "�c�c���̃|�[�V�����B";
			mes "�\�z�ƈ���āA";
			mes "�O������ɗ����Ȃ��悤���ˁB";
			close;
		case 1:
			mes "[�s�[�X���[�N]";
			mes "�|�[�V�����͎g���Ă邩���H";
			close;
		default:
			mes "[�s�[�X���[�N]";
			mes "�c�c";
			mes "�c�c���̐l�������Ă�̂��B";
			mes "��R�{�������Ă��邩��Ƃ�����";
			mes "�T�C���͂��Ȃ���B";
			close;
		}
	}
}

yuno_in04,22,107,5	script	�C���w	740,{
	mes "[�C���w]";
	mes "�c�c";
	mes "�c�c�c�c";
	mes "�悵�A�悵�B";
	mes "���ɂł������B";
	mes "�S�Ă�n�����Ă��܂�";
	mes "���ꂽ�t�́c�c";
	next;
	mes "[�C���w]";
	mes "�c�c����ɂ��Ă�";
	mes "�t���X�R���n���Ȃ��ȁB";
	mes "���s���c�c";
	close;
}

yuno_in04,27,107,4	script	�e�K�X	748,{
	mes "[�e�K�X]";
	mes "���ő����k���Ă���z��";
	mes "�����ςȕ�������Ă��邵�A";
	mes "���邮�郁�K�l��t�����z��";
	mes "�����P�����Ă�";
	mes "���ɂ��|�ꂻ�������c�c";
	next;
	mes "[�e�K�X]";
	mes "�������������";
	mes "���͂������o��̂ɁB";
	mes "�z���g�c�c";
	close;
}

yuno_in04,33,106,0	script	�`�F�b�N	111,{
	mes "-�����鏑�ނ┠��-";
	mes "������܂��ɎU��΂��Ă���-";
	mes "-���̎�l�͑S�R���Ȃ���";
	mes "�K�v�Ȃ��̂�T���o���Ă���-";
	close;
}