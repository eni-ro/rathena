//= Auriga Script ==============================================================
// Ragnarok Online Yggdrasil Script	by refis
//==============================================================================

//============================================================
// �m�b�̉��̎w�փN�G�X�g
//- Registry -------------------------------------------------
// YGG_1QUE -> 0�`12	����:100
//------------------------------------------------------------
mid_camp,197,237,3	script	�@�B�H�w��	869,{
	if(ASH_1QUE < 100) {
		mes "[�@�B�H�w��]";
		mes "�Ӂ`�A";
		mes "�������Ă������Ƃ����ǁA";
		mes "���܂������Ȃ��ȁc�c";
		next;
		mes "�]�j���Y��ł���悤���]";
		close;
	}
	switch(YGG_1QUE) {
	case 0:
		mes "[�@�B�H�w��]";
		mes "�Ӂ`�A";
		mes "���܂������Ȃ��ȁc�c";
		next;
		mes "�]�j���Y��ł���悤���]";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�@�B�H�w��]";
		mes "����A���������āc�c";
		mes "�l�A�Ƃ茾�������Ă��H";
		next;
		menu "�͂�",-;
		mes "[�@�B�H�w��]";
		mes "�n�n�n�A�������B";
		mes "���߂񂲂߂�B";
		next;
		mes "[�@�B�H�w��]";
		mes "������ƌ�����";
		mes "���܂��i��ł��Ȃ��Ă��B";
		mes "����ŁA���Ƃ茾��";
		mes "����������Ă��݂����c�c";
		next;
		mes "[�h�����X]";
		mes "�l��^0000FF�V���o���c�o���h���a��^000000��";
		mes "�@�B�H�w�҂�^0000FF�h�����X^000000�B";
		next;
		mes "[�h�����X]";
		mes "���錤���v���W�F�N�g��";
		mes "���[�_�[�����Ă���񂾂���";
		mes "�Ȃ��Ȃ����܂������ĂȂ��Ă��B";
		mes "����ŁA���Ƃ茾��";
		mes "����������Ă��݂����c�c";
		next;
		mes "[�h�����X]";
		mes "�܂��A�x��Ă���̂�";
		mes "�P���ɐl�ނ�����Ȃ��̂�";
		mes "�����Ȃ񂾂��ǁB";
		next;
		mes "[�h�����X]";
		mes "�c�c";
		mes "�l�͍��܂Ŗ{����";
		mes "�l�ށA�����A�ݔ�������������";
		mes "�������Ă������炳�A";
		mes "�ǂ������炢��������������āB";
		next;
		menu "���̌��������Ă����ł����H",-;
		mes "[�h�����X]";
		mes "����^FF0000�w��^000000��";
		mes "���������悤�Ƃ��Ă���񂾁B";
		next;
		menu "�w�ցH",-;
		mes "[�h�����X]";
		mes "�����A�w�ցB";
		mes "�N�͗y���̂�";
		mes "^FF0000�m�b�̉�^000000�ƌĂ΂��";
		mes "�����������Ƃ�m���Ă�H";
		next;
		mes "[�h�����X]";
		mes "���̒m�b�̉������w�ւ�";
		mes "�w�ɂ͂߂��";
		mes "�ǂ�Ȍ��t�ł������ł��A";
		mes "�����Ƃ��b���������Ȃ񂾁B";
		next;
		mes "[�h�����X]";
		mes "�`��������ǂ��܂Ŗ{���̘b��";
		mes "�肩�ł͂Ȃ����ǂˁB";
		next;
		mes "[�h�����X]";
		mes "�ł��A�~�b�h�K���h�嗤�̋Z�p�͂�";
		mes "���W����΁A���̎w�ւ�";
		mes "���o�����Ƃ͉\�Ȃ񂾂�B";
		next;
		mes "[�h�����X]";
		mes "���͂������ɁA";
		mes "���̃~�b�h�K���h�A���R�ŁA";
		mes "�m�b�̉��̎w�ւƓ����̋@�\������";
		mes "�|��@���������Ă���񂾁B";
		mes "���ꂪ�������������v���W�F�N�g���B";
		next;
		mes "[�h�����X]";
		mes "���̒��Ԓn�̊O��";
		mes "�~�b�h�K���h�嗤�ɂ͂Ȃ�";
		mes "�����b���푰������炵���񂾂�B";
		next;
		mes "[�h�����X]";
		mes "�ނ�ƐڐG���邽�߂ɁA";
		mes "���̘A���R�̔C���̒���";
		mes "���D�掖���Ƃ���";
		mes "���̌�����i�߂Ă���񂾁B";
		next;
		mes "[�h�����X]";
		mes "�c�c";
		mes "�����ǁA�������������ʂ�A";
		mes "�l�ނ��S�R����Ȃ��񂾁B";
		if(ASH_6QUE > 2) {
			mes "�M�p�ł���D�G�Ȑl�ނ��~�����c�c";
			next;
			mes "[�h�����X]";
			mes "����c�c";
			next;
			mes "�]�j�͂��Ȃ��̊������";
			mes "�@�����ɋC�t�����悤���]";
			next;
			mes "[�h�����X]";
			mes "������������N��";
			mes strcharinfo(0)+ "����H";
			next;
			mes "�]���Ȃ����������]";
			next;
			mes "[�h�����X]";
			mes "�����A����ς�I";
			mes "�b�͕����Ă����B";
			mes "�A�b�V���E�o�L���[���̒�����";
			mes "���Ȃ�v�����Ă���l�����āB";
			next;
			mes "[�h�����X]";
			mes "�i�ߕ����ɔ�C����";
			mes "���Ȃ��Ɉ˗����Ă���Ƃ����\��";
			mes "����邭�炢����B";
			next;
			mes "[�h�����X]";
			mes "�c�c";
			next;
			mes "[�h�����X]";
			mes strcharinfo(0)+ "����A";
			mes "���肢������񂾁B";
			mes "�l�B�̌�������`���Ă���Ȃ��H";
			mes "���̌������΂ɐ������������񂾁B";
			mes "���̂��߂ɌN�̗͂�݂��Ăق����B";
		}
		else {
			next;
			mes "[�h�����X]";
			mes "�˂��A�N�I";
			mes "�c�c���[�Ɓc�c����H";
			next;
			mes "[�h�����X]";
			mes "�c�c���������΁A�N�̖��O�A";
			mes "�܂������ĂȂ������ˁB";
			mes "�ǂ������狳���Ă���Ȃ����ȁH";
			next;
			menu "�����",-;
			mes "[�h�����X]";
			mes strcharinfo(0)+ "���񂾂ˁH";
			mes strcharinfo(0)+ "����A";
			mes "���肢������񂾁B";
			next;
			mes "[�h�����X]";
			mes "�l�B�̌�������`���Ă���Ȃ��H";
			mes "���̌������΂ɐ������������񂾁B";
			mes "���̂��߂ɌN�̗͂�݂��Ăق����B";
		}
		next;
		mes "�]���̌������������A";
		mes "�@�A�b�V���E�o�L���[���ɏZ��";
		mes "�@�푰�Ƙb���ł���悤�ɂȂ��";
		mes "�@���̒n�𒲍�����̂�";
		mes "�@���ɗ��̂͊ԈႢ�Ȃ����낤�]";
		next;
		mes "�]���Ȃ��́A�����l����";
		mes "�@�˗����󂯂邱�Ƃɂ����]";
		next;
		mes "[�h�����X]";
		mes "�{���ɂ��H";
		mes "���肪�Ƃ�!!";
		next;
		mes "[�h�����X]";
		mes "���ꂩ���낵���ˁI";
		next;
		mes "[�h�����X]";
		mes "���Ⴀ�A����";
		mes "���肢���������Ƃ�����񂾁B";
		mes "�������ȁH";
		next;
		mes "�]���Ȃ����������]";
		next;
		mes "[�h�����X]";
		mes "���肪�Ƃ��B";
		next;
		mes "[�h�����X]";
		mes "���A�l�͂ˁA";
		mes "���[���~�b�h�K�b�c�����̖��@�w�ҁA";
		mes "�A���i�x���c�����̌���w�҂�";
		mes "���͂��Č�����i�߂Ă���񂾂���";
		mes "��l�Ƃ��ǂɂԂ���������Ă�񂾁B";
		next;
		mes "[�h�����X]";
		mes strcharinfo(0)+ "����";
		mes "�ɂ͍ŏ��ɁA";
		mes "�A���i�x���c�����̌���w��";
		mes "^FF0000�f�B�N�V���i���[^000000��";
		mes "��`���ė~�����񂾁B";
		next;
		mes "[�h�����X]";
		mes "�ނ���Ԍ�����";
		mes "�i��ł��Ȃ��݂���������ˁB";
		mes "�ނ�^FF0000���Ԓn�{���̌�����2�K^000000�ɂ���B";
		mes "���ꂶ�Ⴀ�A��낵���ˁB";
		set YGG_1QUE,1;
		setquest 8243;
		close;
	case 1:
		mes "[�h�����X]";
		mes "����w�҂�^FF0000�f�B�N�V���i���[^000000��";
		mes "��`���ė~�����񂾁B";
		mes "�ނ�^FF0000���Ԓn�{���̌�����2�K^000000�ɋ���B";
		mes "���ꂶ�Ⴀ�A��낵���ˁB";
		close;
	case 7:
		mes "[�h�����X]";
		mes "���A";
		mes strcharinfo(0)+ "����B";
		next;
		mes "[�h�����X]";
		mes "���肪�Ƃ��I";
		mes "�N�̋��͂̂�������";
		mes "�f�B�N�V���i���[�̖|��";
		mes "�I������񂾂��ĂˁB";
		next;
		mes "[�h�����X]";
		mes "���ĂƁA�f�[�^�͂����������A";
		mes "���悢�掟�͖l�ƃE�B�X�p��";
		mes "���������̐��ʂ̌����ǂ��낾�ȁB";
		next;
		mes "[�h�����X]";
		mes "�ƁA���̑O�ɖl�͂��ꂩ��";
		mes "�f�B�N�V���i���[����";
		mes "���}�̂ł�������f�[�^��";
		mes "�C���v�b�g���Ȃ��Ƃ����Ȃ����c�c";
		next;
		mes "[�h�����X]";
		mes strcharinfo(0)+ "����A";
		mes "��������肢���Ă������ȁH";
		next;
		menu "�����ł���",-;
		mes "[�h�����X]";
		mes "���肪�Ƃ��I";
		emotion 15;
		next;
		mes "[�h�����X]";
		mes "�E�B�X�p��";
		mes "�u�w�ւ̓y��̌��A�i���ǂ��ł����v";
		mes "���ĕ����Ă�����Ă������ȁH";
		mes "���������Ε����邩�炳�B";
		next;
		menu "�킩��܂���",-;
		mes "[�h�����X]";
		mes "���񂾂�B";
		mes "����̌����̏W�听�Ƃ�";
		mes "�����镨�Ȃ񂾂���B";
		set YGG_1QUE,8;
		chgquest 8248,8249;
		close;
	case 8:
		mes "[�h�����X]";
		mes "�E�B�X�p��";
		mes "�u�w�ւ̓y��̌��A�i���ǂ��ł����v";
		mes "���ĕ����Ă�����Ă������ȁH";
		next;
		mes "[�h�����X]";
		mes "���񂾂�B";
		mes "����̌����̏W�听�Ƃ�";
		mes "�����镨�Ȃ񂾂���B";
		close;
	case 9:
	case 10:
		mes "[�h�����X]";
		mes "�ł����@���Ă̂͂�������ˁB";
		mes "�Ȋw��؂������l���猩���";
		mes "�{���ɂ������񂾂�B";
		mes "���@�ƉȊw���Z�������";
		mes "�ʔ����������ł��������Ȃ��B";
		close;
	case 11:
		mes "[�h�����X]";
		mes "�E�B�X�p�͂ǂ��������H";
		next;
		menu "�����O��n��",-;
		mes "[�h�����X]";
		mes "���������񂾂ˁI";
		mes "��������!!";
		emotion 0;
		next;
		mes "[�h�����X]";
		mes "�悵�A���ꂳ�������";
		mes "�m�b�̉��̎w�ւ�����I";
		next;
		mes "[�h�����X]";
		mes strcharinfo(0)+ "����A";
		mes "������Ǝ���B";
		next;
		mes "�]�h�����X�͋����̃����O��";
		mes "�@���Ȃ��̎w�ɂ͂߂��B";
		mes "�@���̃����O�ɂ͐����q�����Ă���";
		mes "�@�@�B�ɐڑ�����Ă���]";
		next;
		mes "�]�h�����X�͋@�B�𑀍삵�Ă���]";
		next;
		mes "[�h�����X]";
		mes "����A����ł悵�I";
		mes "������ƌN��";
		mes "���̃f�[�^�����������I";
		next;
		menu "���H",-;
		mes "[�h�����X]";
		mes "���Ⴀ�A�l�͂��ꂩ��";
		mes "�w�ւ����������邩��";
		mes "������Ƒ҂��ĂĂ�!!";
		next;
		mes "�]���������ƃh�����X��";
		mes "�@��}���ŏ����̒��ɓ����Ă������]";
		next;
		mes "�]�����̒�����";
		mes "�@�h�����X�̋��Ԑ������������]";
		next;
		mes "[�h�����X]";
		mes "������Ƒ҂��Ă�!!";
		mes "�����ɂł���͂�������!!";
		mes "��u�����҂��ĂĂ�!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i������x";
		mes "�h�����X�ɘb�������悤�j";
		set YGG_1QUE,12;
		chgquest 8252,8253;
		close;
	case 12:
		mes "[�h�����X]";
		mes "�������[�[!!";
		mes "��������!!";
		next;
		mes "�]�����̒�����";
		mes "�@�h�����X����яo�Ă����]";
		next;
		mes "[�h�����X]";
		mes strcharinfo(0)+ "����I";
		mes "���x�����Ƃ���ɗ����ˁI";
		mes "����������!!";
		mes "^FF0000�m�b�̉��̎w��^000000����!!";
		next;
		mes "�]�h�����X�͂��Ȃ��Ɏw�ւ��������]";
		next;
		mes "[�h�����X]";
		mes "����𑕔����Ă����";
		mes "�َ푰�̌��t�𗝉��ł��A";
		mes "�b�����Ƃ��������Ƃ��ł���񂾁I";
		next;
		mes "[�h�����X]";
		mes "����ɂ��Ă�";
		mes "�{���Ɋ��������񂾂ȁc�c";
		next;
		mes "�]�h�����X��";
		mes "�@�܂�ڂɂ����ׂȂ���";
		mes "�@�w�ւ����Ă���B";
		mes "�@��قǊ������̂��낤�]";
		emotion 28;
		next;
		mes "[�h�����X]";
		mes "�ꎞ�͂ǂ��Ȃ邱�Ƃ��Ǝv�������ǁA";
		mes "�{���Ɋ����ł����񂾁c�c";
		next;
		mes "[�h�����X]";
		mes "�l�����̗͂ł�";
		mes "��΂Ɋ����ł��Ȃ������B";
		next;
		mes "[�h�����X]";
		mes "�V���o���c�o���h���a���̋Z�p�A";
		mes "���[���~�b�h�K�b�c�����̖��@�A";
		mes "�����ăA���i�x���c�����̒m���B";
		mes "���̎O�����������炱��";
		mes "�����ł����񂾁B";
		next;
		mes "[�h�����X]";
		mes "���̒m�b�̉��̎w�ցA";
		mes "�{���ɂ������񂾂�B";
		mes "�O�����ő����Ă����̂�";
		mes "�ق�Ɓ`�ɁA�n���炵���Ȃ�ʁB";
		next;
		mes "[�h�����X]";
		mes "����قǂ̕������ۂɍ���Ȃ�";
		mes "���ꂩ���������";
		mes "�O�����ɒ��ǂ����Ă��炢�����ˁB";
		next;
		menu "�����ł���",-;
		mes "[�h�����X]";
		mes "�����A";
		mes strcharinfo(0)+ "����B";
		mes "�󂯎���Ă��������B";
		next;
		mes "�]�h�����X��";
		mes "�@�m�b�̉��̎w�ւ������o�����]";
		next;
		menu "������ł����H",-;
		mes "[�h�����X]";
		mes "�����`���Ă���������炾��B";
		mes "�N����`���Ă���Ȃ�������";
		mes "����Ȃɑ������������邱�Ƃ�";
		mes "�ł��Ȃ�����B";
		mes "���̒m�b�̉��̎w�ցA";
		mes "�N�̖`���ɖ𗧂Ăė~�����B";
		next;
		mes "[�h�����X]";
		mes "����ɂ��̎w�ցA";
		mes "��ʂ̖`���҂���ɂł���̂�";
		mes "������ɂȂ�Ǝv���B";
		mes "���󂯎���Ă�����������B";
		next;
		mes "[�h�����X]";
		mes "����A��ʐ��Y�ł��Ȃ���";
		mes "�A���R�̒������̏�̕��̖�E�̐l��";
		mes "�Ɛ肵���Ⴄ���낤����B";
		mes "�󂯎���Ă�B";
		next;
		menu "���肪�Ƃ��������܂�",-;
		mes "[�h�����X]";
		mes "����A��؂Ɏg���ĂˁB";
		if(checkitemblank() == 0) {
			next;
			mes "[�h�����X]";
			mes "��H";
			mes "�ו���������������B";
			mes "����ł͓n�����Ƃ͏o���Ȃ���B";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������ĂˁB";
			close;
		}
		if(checkweight(2782,1) == 0) {
			next;
			mes "[�h�����X]";
			mes "��H";
			mes "�ו���������������B";
			mes "����ł͓n�����Ƃ͏o���Ȃ���B";
			mes "�ו��̏d�ʂ����炵�Ă���";
			mes "�܂��b�������ĂˁB";
			close;
		}
		set YGG_1QUE,100;
		chgquest 8253,200885;
		if(checkre())
			getexp 200000,60000;
		else
			getexp 2000000,600000;
		getitem 2782,1;
		if(YGG_2QUE == 0)
			setquest 70365;
		if(YGG_3QUE == 0)
			setquest 70366;
		if(YGG_4QUE == 0)
			setquest 70367;
		if(YGG_5QUE == 0)
			setquest 70368;
		if(YGG_6QUE == 0)
			setquest 70369;
		if(YGG_7QUE == 0)
			setquest 70370;
		if(YGG_8QUE == 0)
			setquest 70371;
		if(YGG_9QUE == 0)
			setquest 70372;
		if(YGG_10QUE == 0)
			setquest 70373;
		if(NYD_1QUE == 0)
			setquest 70374;
		next;
		mes "[�h�����X]";
		mes "���Ƃ��̎w�ւ�^FF0000�|��@�\^000000��";
		mes "^0000FF�N�ɂ������ʂ��Ȃ�^000000����ˁB";
		mes "�N�̐��̃f�[�^�����";
		mes "������������Ă��邩�炳�B";
		next;
		menu "�킩��܂���",-;
		mes "[�h�����X]";
		mes "����B���ꂶ�Ⴀ";
		mes "�m�b�̉��̎w�ւ�`���ɖ𗧂ĂĂˁI";
		mes "���Ɠ��Ɉَ푰�̊X���������";
		mes "�����Ă��邩��s���Ă݂Ȃ�B";
		next;
		mes "[�h�����X]";
		mes "���ĂƖl�͎��̌�����";
		mes "��肩����Ƃ��邩�B";
		mes "�O���������ǂ����Ă���Ԃ�";
		mes "���͂��č��܂łɂȂ�";
		mes "�������������񂾁B";
		close;
	case 100:
		mes "[�h�����X]";
		mes "��`���Ă���Ė{���ɂ��肪�Ƃ��I";
		mes "�m�b�̉��̎w�ւ�`���ɖ𗧂ĂĂˁI";
		mes "���Ɠ��Ɉَ푰�̊X���������";
		mes "�����Ă��邩��s���Ă݂Ȃ�B";
		close;
	default:
		mes "�]�h�����X�͐^���Ȋ����";
		mes "�@�@�B�𒲐����Ă���]";
		close;
	}
}

mid_campin,168,82,3	script	����w��	935,{
	switch(YGG_1QUE) {
	case 0:
		mes "[�f�B�N�V���i���[]";
		mes "�͂��߂܂��āB";
		mes "����^FF0000�A���i�x���c�����̌���w��^000000��";
		mes "^FF0000�f�B�N�V���i���[^000000�ƌ����܂��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "���Ȃ��ƌ���w�ɂ���";
		mes "�F�X�Ƃ��b���������̂ł����A";
		mes "���́A�������Z����";
		mes "���̎��Ԃ͂���܂���B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�܂����Ԃ��ł�����";
		mes "���b�����܂��傤�B";
		mes "����ł́A���͌����ɂ��ǂ�܂��B";
		close;
	case 1:
		mes "[�f�B�N�V���i���[]";
		mes "�͂��߂܂��āB";
		mes "����^FF0000�A���i�x���c�����̌���w��^000000��";
		mes "^FF0000�f�B�N�V���i���[^000000�ƌ����܂��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "���Ȃ��ƌ���w�ɂ���";
		mes "�F�X�Ƃ��b���������̂ł����A";
		mes "���́A�������Z����";
		mes "���̎��Ԃ͂���܂���B";
		next;
		if(select("�h�����X�ɉ�悤�Ɍ����܂���","����ł͂܂����x") == 2) {
			mes "[�f�B�N�V���i���[]";
			mes "�\���󂠂�܂���B";
			mes "�܂����Ԃ��ł�����";
			mes "���b�����܂��傤�B";
			mes "����ł́A���͌����ɂ��ǂ�܂��B";
			close;
		}
		mes "[�f�B�N�V���i���[]";
		mes "�h�����X����ł����H";
		mes "��̉��ł��傤���H";
		next;
		menu "��`���悤�Ɍ����܂���",-;
		mes "[�f�B�N�V���i���[]";
		mes "���A�{����";
		mes "��`���Ă�����ł���!?";
		mes "����͏�����܂��I";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "���傤�ǁA���̒n��Ɠ��̒n���";
		mes "�s����l��T���Ă�����ł��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�������ɍs�������̂ł����A";
		mes "���\�ȃ����X�^�[������";
		mes "�ߊ��Ȃ���ł���B";
		mes "�ȑO�͕��m�B�ɗ���ł����̂ł����A";
		mes "���͖Z������";
		mes "�肪�����Ȃ��炵���̂ł��c�c";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�ƂĂ��댯�ȏꏊ�ł����A";
		mes "�s���܂����H";
		next;
		mes "�]���Ȃ����������]";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�{���ł����H";
		mes "����Ȋ댯�ȏꏊ��";
		mes "�s����Ȃ�đ��h���܂��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�����A�{��ɓ���܂��傤�B";
		mes "���Ȃ��́A";
		mes "�d���̂悤�ȊO���̎푰��";
		mes "�؂̋��l�̂悤�ȊO���̎푰";
		mes "�ɉ�������Ƃ͂���܂����H";
		next;
		if((!checkquest2(2158) && !checkquest2(2159)) || (!checkquest2(200850) && !checkquest2(200855))) {
			mes "�]���Ȃ��͉�������Ƃ��Ȃ���";
			mes "�@�f�B�N�V���i���[�ɓ`�����]";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���̒n��ɗd���̂悤�Ȏ푰�A";
			mes "���̒n��ɖ؂̋��l�̂悤�Ȏ푰��";
			mes "����炵����ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�ނ�̌������͂��邽�߂ɁA";
			mes "^FF0000�ނ�̘b�����t��";
			mes "�L�^���Ă��ė~������ł��B^000000";
			mes "�ꌾ���ԈႦ����";
			mes "�������Ă��Ă��������B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���̕��Ŕނ�̌����";
			mes "�قډ�͂ł��Ă����ł��B";
			mes "���Ȃ������������ނ�̌��t��";
			mes "�|��ł��邩�m�F�������̂ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�{���́A���ڎ����ނ��";
			mes "�b������΂悢�̂ł��傤��";
			mes "���Ɠ��̒n��̉ߍ��Ȋ���";
			mes "�̂̎ア���ɂ͖����Ȃ�ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���ƁA���̗d���Ɩ؂̋��l�ɉ������";
			mes "^FF0000�x�����̑���^000000�ɕ񍐂���Ƃ����ł���B";
			mes "�ڌ�����T���Ă��܂�������ˁB";
			mes "�x�����̑����͒��Ԓn�̖{���O��";
			mes "����͂��ł��B";
			set YGG_1QUE,2;
			chgquest 8243,8244;
			close;
		}
		else {
			mes "�]���Ȃ��͉�������Ƃ������";
			mes "�@�f�B�N�V���i���[�ɓ`�����]";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�������������̂ł����I";
			mes "����ł͘b�������ł��ˁI";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���Ȃ��ɂ́A�ނ�̘b�����t��";
			mes "�L�^���Ă��ė~�����̂ł��B";
			mes "�ނ�̘b�����t���ꌾ���";
			mes "�ԈႦ���Ƀ������Ă��Ă��������B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���̕��Ŕނ�̌����";
			mes "�قډ�͂ł��Ă����ł��B";
			mes "���Ȃ������������ނ�̌��t��";
			mes "�|��ł��邩�m�F�������̂ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�{���́A���ڎ����ނ��";
			mes "�b������΂悢�̂ł��傤��";
			mes "���Ɠ��̒n��̉ߍ��Ȋ���";
			mes "�̂̎ア���ɂ͖����Ȃ�ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�ނ�̘b���������͂��邽�߂�";
			mes "��낵�����˂������܂��B";
			set YGG_1QUE,2;
			chgquest 8243,8244;
			close;
		}
	case 2:
		if(!checkquest2(70355) || !checkquest2(70360)) {
			mes "[�f�B�N�V���i���[]";
			mes "�������b�ł��ƁA";
			mes "���̒n��ɗd���̂悤�Ȏ푰�A";
			mes "���̒n��ɖ؂̋��l�̂悤�Ȏ푰��";
			mes "����炵���̂ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�����ŁA";
			mes "���Ȃ��ɔނ�̘b�����t��";
			mes "�L�^���Ă��ė~�����̂ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�ނ�̘b�������t����";
			mes "�d���̌���Ɩ؂̋��l�̌����";
			mes "��͂��悤�Ǝv���܂��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "����ł́A";
			mes "�ނ�̘b�����t���ꌾ���";
			mes "�ԈႦ���Ƀ������Ă��Ă��������B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "���ƁA���̗d���Ɩ؂̋��l�ɉ������";
			mes "^FF0000�x�����̑���^000000�ɕ񍐂���Ƃ����ł���B";
			mes "�ڌ�����T���Ă��܂�������ˁB";
			mes "�x�����̑����͒��Ԓn�̖{���O��";
			mes "����͂��ł��B";
			close;
		}
		mes "[�f�B�N�V���i���[]";
		mes "�����A";
		mes "���A��Ȃ����B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�ǂ��ł������H";
		mes "�ނ�̘b�����t��";
		mes "�������Ă��܂������H";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "����ł͂܂��A";
		mes "�d���̌��t�������Ă��������B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�d���̌��t���ꕶ����";
		mes "�����ɏ����Ă��������B";
		next;
		input .@str1$;
		mes "[�f�B�N�V���i���[]";
		mes .@str1$;
		mes "�ł����c�c";
		mes "���̎��́H";
		if(.@str1$ == "RLGHLRXLA TKANTLFDMS" || .@str1$ == "RLGHLRXLA�@TKANTLFDMS")
			set .@spl_score,.@spl_score+1;
		next;
		input .@str2$;
		mes "[�f�B�N�V���i���[]";
		mes .@str2$;
		mes "�ł����c�c";
		mes "���̎��́H";
		if(.@str2$ == "WJACK TNAHRDNJSDMFH" || .@str2$ == "WJACK�@TNAHRDNJSDMFH")
			set .@spl_score,.@spl_score+1;
		next;
		input .@str3$;
		mes "[�f�B�N�V���i���[]";
		mes .@str3$;
		mes "�ł����c�c�B";
		mes "����ŏI���ł����H";
		if(.@str3$ == "WLSGHKWND!!" || .@str3$ == "WLSGHKWND")
			set .@spl_score,.@spl_score+1;
		next;
		if(.@spl_score < 3) {
			mes "[�f�B�N�V���i���[]";
			mes "�c�c���������ł��ˁB";
			mes "�c�O�Ȃ����͕s�\�ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�{���ɂ���ō����Ă܂����H";
			close;
		}
		mes "[�f�B�N�V���i���[]";
		mes "�S�����킹�Č���ƁA";
		mes "RLGHLRXLA�@TKANTLFDMS";
		mes "WJACK�@TNAHRDNJSDMFH";
		mes "WLSGHKWND!!";
		mes "�Ȃ�ł��ˁB";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�悵�AOK�ł��I";
		mes "���́A�؂̋��l�̌����";
		mes "�����Ă��������B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�d���̎��Ɠ������A";
		mes "�ꕶ�������ɏ����Ă��������B";
		next;
		input .@str4$;
		mes "[�f�B�N�V���i���[]";
		mes .@str4$;
		mes "�ł����c�c";
		mes "���̎��́H";
		if(.@str4$ == "TJDTMFJDNS CJFDI" || .@str4$ == "TJDTMFJDNS�@CJFDI")
			set .@man_score,.@man_score+1;
		next;
		input .@str5$;
		mes "[�f�B�N�V���i���[]";
		mes .@str5$;
		mes "�ł����c�c";
		mes "���̎��́H";
		if(.@str5$ == "TKADLFDMF QKATOS" || .@str5$ == "TKADLFDMF�@QKATOS")
			set .@man_score,.@man_score+1;
		next;
		input .@str6$;
		mes "[�f�B�N�V���i���[]";
		mes .@str6$;
		mes "�ł����c�c�B";
		mes "����ŏI���ł����H";
		if(.@str6$ == "EKDTLSDML DLFMADMS" || .@str6$ == "EKDTLSDML�@DLFMADMS")
			set .@man_score,.@man_score+1;
		next;
		if(.@man_score < 3) {
			mes "[�f�B�N�V���i���[]";
			mes "�c�c���������ł��ˁB";
			mes "�c�O�Ȃ����͕s�\�ł��B";
			next;
			mes "[�f�B�N�V���i���[]";
			mes "�{���ɂ���ō����Ă܂����H";
			close;
		}
		mes "[�f�B�N�V���i���[]";
		mes "�S�����킹�Č����";
		mes "TJDTMFJDNS�@CJFDI";
		mes "TKADLFDMF�@QKATOS";
		mes "EKDTLSDML�@DLFMADMS�c�c�B";
		mes "�Ȃ�ł��ˁB";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�c�c";
		mes "����A�킩�邼�c�c";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "��ǂł���ȁc�c";
		next;
		mes "�]�f�B�N�V���i���[��";
		mes "�@�d���Ƌ��l�̌��������������";
		mes "�@�������̌����{�����Ȃ���";
		mes "�@���ׂĂ���]";
		set YGG_1QUE,3;
		delquest 70360;
		delquest 70355;
		chgquest 8244,70350;
		close;
	case 3:
		mes "[�f�B�N�V���i���[]";
		mes "�c�c";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�؂̋��l�̌��t��|�󂷂��";
		mes "�u�������B";
		mes "�N�̎푰�����߂Č����B";
		mes "�N���������ċ����Ă��邾��H�v";
		mes "�Ƃ��������ł��ˁB";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�d���̌��t��|�󂷂��";
		mes "�u�N�͒N�H";
		mes "�T�t�@���̒��ԁH";
		mes "�������ɗ���ȁI�v";
		mes "�Ƃ��������ł��B";
		next;
		menu "�������ł���",-;
		mes "[�f�B�N�V���i���[]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł��܂��܂��ł���B";
		mes "���̏ゾ��������|��ł��܂�����";
		mes "�����͂܂����S�ɂ�";
		mes "���͂ł��Ă��Ȃ��̂ł��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�������킩��Ȃ����";
		mes "�R�~���j�P�[�V�������Ƃ�܂���B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "^FF0000�E�B�X�p^000000���َ푰�̐���";
		mes "�L�^������@������Ƃ�";
		mes "�����Ă����̂ł���";
		mes "�܂��A�������Ȃ��Ƃ������Ƃ�";
		mes "���܂������Ă��Ȃ��񂾂낤�ȁc�c";
		next;
		menu "�E�B�X�p�H",-;
		mes "[�f�B�N�V���i���[]";
		mes "�͂��B";
		mes "�E�B�X�p��";
		mes "���[���~�b�h�K�b�c������";
		mes "���@�w�҂ł��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�ޏ����َ푰�̐���";
		mes "�L�^������@������A";
		mes "�ƌ����Ă����̂�";
		mes "���҂��Ă����̂ł����c�c";
		next;
		menu "�m�F���Ă��܂��傤���H",-;
		mes "[�f�B�N�V���i���[]";
		mes "��낵���̂ł����H";
		mes "�����牽�܂ł��݂܂���B";
		mes "�ł����ɏ�����܂��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "����ł͂��̒��Ԓn�ɂ���";
		mes "�E�B�X�p�ɕ����Ă݂Ă��������B";
		mes "���̎i�ߕ����o��";
		mes "���̕��ɂ���͂��ł��B";
		set YGG_1QUE,4;
		chgquest 70350,8245;
		close;
	case 4:
		mes "[�f�B�N�V���i���[]";
		mes "���̒��Ԓn�ɂ���E�B�X�p��";
		mes "�����Ă݂Ă��������B";
		mes "���̎i�ߕ����o��";
		mes "���̕��ɂ���͂��ł��B";
		close;
	case 6:
		mes "�]�f�B�N�V���i���[��";
		mes "�@�����ɂƂ���ꂽ���̂悤��";
		mes "�@���ɕ��������������Ă���]";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�悵�A�ł���!!";
		next;
		menu "����������",-;
		mes "[�f�B�N�V���i���[]";
		mes "����I";
		mes "���̊ԂɌ���!!";
		next;
		menu "�������Ă��݂܂���",-;
		mes "[�f�B�N�V���i���[]";
		mes "���������A�C�ɂ��Ȃ��ł��������B";
		mes "�����蕷���Ă��������I";
		mes "����Ɣ����L��������������ł��I";
		mes "�������E�B�X�p�������Ă��Ă��ꂽ";
		mes "���̕�΂̂������ŁI";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "����Ŗl�̕��̍�Ƃ͑S�Ċ����ł��I";
		mes "�َ푰�̌��t���T�͊������܂����B";
		mes "�l�͂����َ푰�Ɖ�b�ł��܂���B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�l�̓h�����X�̂Ƃ���";
		mes "�s���Ă��܂��ˁI";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "�悢�������!!";
		mes "�@";
		mes "�]�f�B�N�V���i���[��";
		mes "�@�������ʂł��镪�������ނ̑���";
		mes "�@�����đ����čs�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�f�B�N�V���i���[��";
		mes "�h�����X�Ɍ������ʂ�n���ɍs�����B";
		mes "�h�����X�̂Ƃ���֍s����)";
		set YGG_1QUE,7;
		chgquest 8247,8248;
		close;
	case 7:
		mes "["+strcharinfo(0)+"]";
		mes "�i�f�B�N�V���i���[��";
		mes "�h�����X�Ɍ������ʂ�n���ɍs�����B";
		mes "�h�����X�̂Ƃ���֍s����)";
		close;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�f�B�N�V���i���[]";
		mes "��`���Ă����";
		mes "���肪�Ƃ��������܂����B";
		mes "������������Ƃ����ł���ˁB";
		close;
	case 100:
		mes "[�f�B�N�V���i���[]";
		mes "�m�b�̉��̎w�ւ�";
		mes "���������ł��Ă悩�����ł��B";
		next;
		mes "[�f�B�N�V���i���[]";
		mes "���񏉂߂đ����̐l��";
		mes "�ꏏ�Ɍ��������܂�������";
		mes "�b�Ƃ͈���ĂƂĂ������l�B�ł����B";
		close;
	default:
		mes "�]�f�B�N�V���i���[��";
		mes "�@�K���Ȋ�ŏ��ނ������Ă���B";
		mes "�@�ז����Ȃ��ł������]";
		close;
	}
}

mid_camp,147,256,3	script	���@�w��	735,{
	switch(YGG_1QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "[�E�B�X�p]";
		mes "�͂��c�c";
		mes "�v���悤�Ɍ������i�݂܂���c�c";
		close;
	case 4:
		mes "[�E�B�X�p]";
		mes "����H";
		mes "���ɉ����p�ł��傤���H";
		next;
		menu "�f�B�N�V���i���[�̎���b��",-;
		mes "[�E�B�X�p]";
		mes "���Ȃ���";
		mes strcharinfo(0)+ "����";
		mes "�ł��ˁB";
		mes "�h�����X���畷���Ă��܂��B";
		mes "����ɂ��Ă�";
		mes "�َ푰�̉�b���L�^���錏�ł����B";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "���͂܂�����ł��Ă��܂���B";
		mes "^FF0000���^000000��������ɍs�������Ă�";
		mes "�s���Ȃ���ł��c�c";
		next;
		menu "��΂�����H",-;
		mes "[�E�B�X�p]";
		mes "�͂��B";
		mes "���͂��ِ̈��E�̎푰��";
		mes "���ۂɘb���Ă��鐺���L�^���āA";
		mes "���x�ł�������悤��";
		mes "���̕�΂��g�����̂ł��B";
		next;
		mes "�]�E�B�X�p�́A���Ȃ���";
		mes "�@^FF0000�Ԃ����^000000��^0000FF�����^000000���������]";
		next;
		mes "[�E�B�X�p]";
		mes "���̕�΂́A���̂��������@�ɂ��";
		mes "����ȗ͂������Ă��܂��āA";
		mes "���̔g���𖂗͂ɕϊ�����";
		mes "�L�^�����ł��B";
		mes "�������A���Ȃ�̍L�͈͂�";
		mes "�������m���ċL�^�����ł���B";
		next;
		mes "[�E�B�X�p]";
		mes "�A�T�V���B�ɗ����";
		mes "���̒n��Ɠ��̒n���";
		mes "���̕�΂𖄂߂Ă�������̂ł����A";
		mes "�A�T�V���B�͍��A";
		mes "���̔C���Ŏ肪�����Ȃ��炵����";
		mes "��΂̉�����ł��Ȃ���ł��B";
		next;
		mes "[�E�B�X�p]";
		mes "������f�B�N�V���i���[��";
		mes "��b�L�^��n���Ȃ���ł��B";
		mes "�N������ɉ���ɍs���Ă�����";
		mes "�������ł����c�c";
		next;
		mes "�]�E�B�X�p�́A";
		mes "�@�u��`���āv�ƌ����΂����";
		mes "�@���Ȃ��̊�����߂Ă���]";
		next;
		if(select("����ł͂܂���ŗ��܂�","����������ė��܂�") == 1) {
			mes "[�E�B�X�p]";
			mes "�c�c";
			next;
			mes "[�E�B�X�p]";
			mes "^666666�Ȃ�Ŏ�`��Ȃ��̂�c�c^000000";
			next;
			menu "���������܂������H",-;
			mes "[�E�B�X�p]";
			mes "���������ĂȂ��ł���B";
			mes "�C�̂����ł��B";
			next;
			menu "����ł́A�܂���ŗ��܂�",-;
			mes "[�E�B�X�p]";
			mes "�c�c";
			mes "���́A�����܂���B";
			next;
			mes "�]�E�B�X�p��";
			mes "�@���Ȃ��������~�߂��]";
			next;
			mes "[�E�B�X�p]";
			mes "���A�����Ă����ł���A";
			mes "��΂�����ł��Ȃ��āB";
			mes "�@";
			mes "������܂���ˁH";
			next;
			mes "[�E�B�X�p]";
			mes "�O�����ŋ��͂���";
			mes "�|��@�̌�����i�߂Ă����ł��B";
			next;
			mes "[�E�B�X�p]";
			mes "���������Ŏ��s����΁A";
			mes "���l�̎��s�ł͂Ȃ�";
			mes "���[���~�b�h�K�b�c������";
			mes "���s�Ƃ݂Ȃ��ꂿ�Ⴄ��ł���B";
			next;
			mes "[�E�B�X�p]";
			mes "����ł�����ł����H";
			next;
			menu "�c�c",-;
			mes "[�E�B�X�p]";
			mes "�c�c";
			mes "�����܂�肭�ǂ�";
			mes "�������͂�߂܂��B";
			next;
			mes "[�E�B�X�p]";
			mes "��`���Ă��������B";
			next;
			mes "[�E�B�X�p]";
			mes "���肢�ł�����";
			mes "��΂�������Ă��Ă��������B";
			next;
			mes "�]�E�B�X�p�̋C���ɉ�����";
			mes "�@�����Ă��܂����]";
			next;
		}
		mes "[�E�B�X�p]";
		mes "�{���ł���!?";
		mes "���肪�Ƃ��������܂��I";
		mes "���Ȃ��Ȃ��`���Ă����";
		mes "���ĐM���Ă��܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "����ł́A��Ή����";
		mes "��낵�����肢���܂��ˁB";
		next;
		mes "[�E�B�X�p]";
		mes "��΂𖄂߂��ꏊ��2�ӏ��ł��B";
		mes "^FF0000���^000000�͐��̒n���";
		mes "�d���̖ڌ���񂪂������ꏊ��";
		mes "�߂��ł��B";
		mes "�L�m�R�̂悤�ȍ\������";
		mes "���ɖ��߂��炵���ł��B";
		next;
		mes "[�E�B�X�p]";
		mes "^0000FF���^000000�͓��̒n���";
		mes "���l�̖ڌ���񂪂������ꏊ��";
		mes "�߂��ł��B";
		mes "�؂̉��ɖ��߂��炵���ł��B";
		next;
		mes "[�E�B�X�p]";
		mes "���̓�̕�΂��������";
		mes "�����ė��Ă��������B";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "�����A�����ł��I";
		mes "�Y��Ă��܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "�A�T�V���B����΂𖄂߂鎞��";
		mes "������Ƃ����g���b�v��";
		mes "�d�|�����炵����ł���B";
		mes "�C�����Ă��������ˁB";
		next;
		mes "[�E�B�X�p]";
		mes "��������������";
		mes "���_����悤�ȃg���b�v����";
		mes "�΂��Č����Ă܂����B";
		set YGG_1QUE,5;
		chgquest 8245,8246;
		close;
	case 5:
		if(countitem(7575) < 1 || countitem(7576) < 1) {
			mes "[�E�B�X�p]";
			mes "��΂𖄂߂��ꏊ��2�ӏ��ł��B";
			mes "��ڂ͐��̒n���";
			mes "�d���̖ڌ���񂪂������ꏊ��";
			mes "�߂��ł��B";
			mes "�L�m�R�̂悤�ȍ\������";
			mes "���ɖ��߂��炵���ł��B";
			next;
			mes "[�E�B�X�p]";
			mes "��ڂ͓��̒n���";
			mes "���l�̖ڌ���񂪂������ꏊ��";
			mes "�߂��ł��B";
			mes "�؂̉��ɖ��߂��炵���ł��B";
			next;
			mes "[�E�B�X�p]";
			mes "���̓�̕�΂��������";
			mes "�����ė��Ă��������B";
			next;
			mes "[�E�B�X�p]";
			mes "�c�c";
			mes "�����A�����ł��I";
			mes "�Y��Ă��܂����B";
			next;
			mes "[�E�B�X�p]";
			mes "�A�T�V���B����΂𖄂߂鎞��";
			mes "������Ƃ����g���b�v��";
			mes "�d�|�����炵����ł���B";
			mes "�C�����Ă��������ˁB";
			next;
			mes "[�E�B�X�p]";
			mes "��������������";
			mes "���_����悤�ȃg���b�v����";
			mes "�΂��Č����Ă܂����B";
			close;
		}
		mes "[�E�B�X�p]";
		mes "���A��Ȃ����I";
		mes "�v������葁�������ł��ˁB";
		mes "�ł́A��΂������Ē����܂����H";
		next;
		mes "�]���Ȃ��͕�΂�";
		mes "�@�E�B�X�p�ɓn�����]";
		next;
		mes "[�E�B�X�p]";
		mes "�����ł��A���̕�΂ł�!!";
		mes "���肪�Ƃ��������܂��I";
		mes "�������ׂĂ݂܂��ˁB";
		next;
		mes "�]�E�B�X�p��";
		mes "�@��΂��Ӓ肷�邩�̂悤��";
		mes "�@��������ƌ��߂Ă���]";
		next;
		mes "[�E�B�X�p]";
		mes "�G���͑����ł����ǁA";
		mes "�����̒��o�͂ł��܂��ˁB";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		next;
		mes "[�E�B�X�p]";
		mes "WJACK�@TNAH�c�c";
		mes "RDN�c�c";
		mes "JSDMFH�c�c";
		mes "���ꂪ�ِ��E�̎푰�̌��t�ˁc�c";
		mes "�����^���ł��Ă����c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�cTJDTMF�c�c";
		mes "�c�cJDNS�c�c";
		mes "CJFDI�c�c";
		mes "����A���Ȃ���ˁc�c";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c����H";
		next;
		mes "[�E�B�X�p]";
		mes "�l�Ԃ̐������������c�c";
		mes "����ȂЂƋC�̂Ȃ��Ƃ����";
		mes "�����Ă�̂�����H";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�₾���c�c";
		mes "���̍����c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "�����A�U��ꂿ������c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "���ɂ������c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�����A���̓�l!?";
		mes "�R�A�������Ă��́H";
		mes "�y�������Ƀf�[�g���Ă�c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�����܂������c�c!!";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "����������A���ɂ�������";
		mes "��b���^��Ă�݂����B";
		next;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "���ӂӁA";
		mes "��ł������y���������Ɓc�c";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�E�B�X�p]";
		mes "�����A���ł�����܂���I";
		mes "���`�ƁA";
		mes "���v�ł��ˁB";
		mes "�����Ƙ^���ł��Ă��܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "���̕��ňِ��E�̎푰��";
		mes "�b���Ă���Ǝv�����b��";
		mes "�S�����o���āA";
		mes "�f�B�N�V���i���[�ɓn���Ă����܂��B";
		next;
		mes "[�E�B�X�p]";
		mes "�f�B�N�V���i���[��";
		mes "�܂������Ă����肵����";
		mes "��`���Ă����Ă��������ˁB";
		mes "��`���Ă����";
		mes "���肪�Ƃ��������܂����B";
		set YGG_1QUE,6;
		delquest 8241;
		delquest 8242;
		chgquest 8246,8247;
		delitem 7575,1;
		delitem 7576,1;
		next;
		mes "[�E�B�X�p]";
		mes "�����f�B�N�V���i���[��";
		mes "���̉�b�L�^��n���Ă��܂��ˁ�";
		mes "�@";
		mes "�]�E�B�X�p�͎i�ߕ��̕���";
		mes "�@�����čs�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�f�B�N�V���i���[��";
		mes "�Ƃ���֍s�����j";
		close;
	case 6:
		mes "�]�E�B�X�p��";
		mes "�@�f�B�N�V���i���[�̂Ƃ���ɍs�����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�f�B�N�V���i���[��";
		mes "�Ƃ���֍s�����j";
		close;
	case 7:
		mes "[�E�B�X�p]";
		mes "�f�B�N�V���i���[����";
		mes "�������ł���ˁB";
		mes "�L���͂Ƃ��m���Ƃ����B";
		mes "���h�����Ⴄ�c�c";
		close;
	case 8:
		mes "[�E�B�X�p]";
		mes "����A�����p�ł��傤���H";
		next;
		menu "�w�ւ̓y��̌�",-;
		mes "[�E�B�X�p]";
		mes "�c�c";
		mes "����ς肻���ł������B";
		next;
		mes "[�E�B�X�p]";
		mes "�c�O�Ȃ���܂��ł��c�c";
		mes "�ł������̖ڏ��͂��Ă����ł���I";
		mes "�����ޗ����Ȃ��Ȃ�����ł��B";
		next;
		menu "�y����ĉ��ł����H",-;
		mes "[�E�B�X�p]";
		mes "�w�ւ̃����O�����ɂ���";
		mes "^FF0000���@��^000000�̂��Ƃł��B";
		mes "���̖��@�΂����̂�";
		mes "���̖����Ȃ�ł���B";
		next;
		mes "[�E�B�X�p]";
		mes "�l�̈ӎ��ɏ�ɏ���`���Â��A";
		mes "�����������͂Ɛ��_�͂�";
		mes "���߂���ʂ����閂�@�΁B";
		next;
		mes "[�E�B�X�p]";
		mes "������g�p���邱�Ƃ�";
		mes "�����@�B�Ɋi�[���ꂽ����";
		mes "�g�̂Ɛ��_�ɕ��S�Ȃ�";
		mes "�ӎ��ɓ`�������邱�Ƃ�";
		mes "�ł���悤�ɂȂ��ł��B";
		next;
		mes "[�E�B�X�p]";
		mes "���x���h�����X�Ǝ���������";
		mes "���񎸔s���Ă����ł��B";
		mes "�����͂������̖��@�΁B";
		mes "�@�B�̐M���ɍ��킹�悤�Ƃ����";
		mes "�ǂ����Ă����Ă��܂��̂ł��B";
		next;
		mes "[�E�B�X�p]";
		mes "�{�����畉�ׂɑς��ꂻ����";
		mes "�΂��΂����񂹂�";
		mes "�F�X�Ǝ������̂ł���";
		mes "�S�ĉ��Ă��܂��܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "�ł�����ɑς����΂�";
		mes "����ƌ�������ł��B";
		mes "�ł���ɓ��ꂽ���̐΂�����������̂�";
		mes "���������傫���T�C�Y�̕���";
		mes "�K�v�Ȃ�ł��B";
		next;
		menu "���Ƃ����΂ł����H",-;
		mes "[�E�B�X�p]";
		mes "^0000FF���m�F�z��^000000�Ƃ����΂ł��B";
		mes "���̒n��ɂ���炵���̂ł���";
		mes "�݂�ȖZ�����čs���Ă���܂���B";
		mes "���ꂳ������Ί�������̂Ɂc�c";
		next;
		if(select("����ł͂܂���ŗ��܂�","����������ė��܂�") == 1) {
			mes "[�E�B�X�p]";
			mes "�c�c";
			next;
			mes "[�E�B�X�p]";
			mes "^666666��C�ǂ߂�c�c^000000";
			next;
			menu "���������܂������H",-;
			mes "[�E�B�X�p]";
			mes "���������ĂȂ��ł���B";
			mes "�C�̂����ł��B";
			next;
			menu "����ł͎��炵�܂�",-;
			mes "[�E�B�X�p]";
			mes "�c�c";
			mes "���́A�����܂���B";
			next;
			mes "�]�E�B�X�p��";
			mes "�@���Ȃ��̘r�������";
			mes "�@�����~�߂��]";
			next;
			mes "[�E�B�X�p]";
			mes "���́c�c";
			mes "���������Ă���́A�킩��܂��񂩁H";
			mes "���m�F�z�΂��������";
			mes "���@�΂����������ł���H";
			next;
			mes "�]�E�B�X�p�̎�ɗ͂�����B";
			mes "�@�r���ɂ��c�c-";
			next;
			mes "[�E�B�X�p]";
			mes "���������Ŏ��s����΁A";
			mes "���l�̎��s�ł͂Ȃ�";
			mes "���[���~�b�h�K�b�c������";
			mes "���s�Ƃ݂Ȃ��ꂿ�Ⴄ��ł���B";
			next;
			mes "[�E�B�X�p]";
			mes "����ł�����ł����H";
			next;
			menu "�c�c",-;
			mes "[�E�B�X�p]";
			mes "�c�c";
			mes "�����܂�肭�ǂ�";
			mes "�������͂�߂܂��B";
			next;
			mes "[�E�B�X�p]";
			mes "��`���Ă��������B";
			next;
			mes "[�E�B�X�p]";
			mes "���肢�ł�����";
			mes "���m�F�z�΂������Ă��Ă��������B";
			next;
			mes "�]�E�B�X�p�̋C���ɉ�����";
			mes "�@�����Ă��܂����]";
			next;
		}
		mes "[�E�B�X�p]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "^0000FF���m�F�z��^000000��";
		mes "�s�v�c�Ȋ�Ƃ����₩��";
		mes "�܂�ɍ̌@�ł���炵���ł��B";
		mes "��낵�����肢���܂���";
		set YGG_1QUE,9;
		chgquest 8249,8250;
		close;
	case 9:
		if(countitem(6048) < 1) {
			mes "[�E�B�X�p]";
			mes "^0000FF���m�F�z��^000000��";
			mes "���̒n��ɂ���";
			mes "�s�v�c�Ȋ�Ƃ����₩��";
			mes "�܂�ɍ̌@�ł���炵���ł��B";
			mes "��낵�����肢���܂���";
			close;
		}
		mes "[�E�B�X�p]";
		mes "�����A���m�F�z�΁I";
		mes "�����Ă��Ă��ꂽ��ł��ˁI";
		next;
		mes "�]���Ȃ��͖��m�F�z�΂�";
		mes "�@�E�B�X�p�ɓn�����]";
		next;
		mes "[�E�B�X�p]";
		mes "�悵�悵�A";
		mes "���̑傫���Ȃ���v�ł��傤�B";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "[�E�B�X�p]";
		mes "�ł͑������̍z�΂�";
		mes "���̖��͂��h���܂��傤�I";
		next;
		mes "�]�E�B�X�p�͎����������n�߂��]";
		next;
		mes "�]���m�F�z�΂����������肾�����]";
		next;
		mes "�]�E�B�X�p�͑傫�Ȑ���";
		mes "�@�����̎��������񂾏u�ԁA";
		mes "�@���m�F�z�΂͑傫�Ȍ�������A";
		mes "�@���̎p��ς����]";
		misceffect 99;
		emotion 0;
		next;
		mes "[�E�B�X�p]";
		mes "���i�K�I���c�c";
		next;
		mes "[�E�B�X�p]";
		mes "�ł��܂������ł͂���܂����B";
		mes "������Ə���������̂�";
		mes "������x�b�������Ă��������B";
		set YGG_1QUE,10;
		chgquest 8250,8251;
		delitem 6048,1;
		close;
	case 10:
		if(rand(1,5) != 3) {
			mes "[�E�B�X�p]";
			mes "�������������҂��Ă��������ˁB";
			mes "���̃����O��Z��";
			mes "�n�t���Ȃ��Ȃ��ł��Ȃ��c�c";
			close;
		}
		mes "[�E�B�X�p]";
		mes "�悵�A���������I";
		mes "�����O�����̗n�t�ɐZ���Ί����ł��I";
		next;
		mes "�]�E�B�X�p�̓����O��n�t�ɐZ�����]";
		next;
		mes "�]�����O�̐F����F����";
		mes "�@���F�ɕϐF���Ă����]";
		next;
		mes "�]�E�B�X�p�͎w�ւ�";
		mes "�@�n�t������o��";
		mes "�@�w�ɂ͂߂Ď������������]";
		next;
		mes "[�E�B�X�p]";
		mes "����A�����ˁI";
		mes "���܂����삷���ˁB";
		next;
		mes "[�E�B�X�p]";
		mes "���Ȃ��������Ă��Ă��ꂽ";
		mes "���m�F�z�΂̂�������";
		mes "�����������܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "���̃����O���h�����X��";
		mes "�n���Ă��������B";
		next;
		mes "�]�����O���󂯎�����]";
		set YGG_1QUE,11;
		chgquest 8251,8252;
		close;
	case 11:
		mes "[�E�B�X�p]";
		mes "���Ȃ��������Ă��Ă��ꂽ";
		mes "���m�F�z�΂̂�������";
		mes "�����������܂����B";
		next;
		mes "[�E�B�X�p]";
		mes "�����O���h�����X��";
		mes "�n���Ă��������ˁB";
		close;
	case 12:
		mes "[�E�B�X�p]";
		mes "���������Ŋ����ł��ˁB";
		mes "�c��̓h�����X�̍�Ƃ̂݁B";
		mes "�h�����X�撣���";
		close;
	case 100:
		mes "[�E�B�X�p]";
		mes "�m�b�̉��̎w�ւ��������܂����ˁB";
		mes "�ǂ�ǂ�g���Ă��������ˁB";
		close;
	}
}

spl_fild02,27,218,0	script	�����ꂽ���#ygg_red	844,{
	if(YGG_1QUE < 5) {
		mes "�]����オ���Ă���y�̉��";
		mes "�@�Ԃ���΂�������Ă���B";
		mes "�@�C�̂������������̂���ʂ�";
		mes "�@�����߂��Ă���c�c";
		mes "�@�ߊ��Ȃ������������낤�]";
		close;
	}
	if(YGG_1QUE > 5 || countitem(7575)>0) {
		mes "�]�Ԃ���΂��@��o����";
		mes "�@�Ղ��c���Ă���]";
		close;
	}
	mes "�]����オ���Ă���y�̉��";
	mes "�@�Ԃ���΂�������Ă���]";
	next;
	if(select("��΂����","�����Ă���") == 2) {
		mes "�]���Ȃ���";
		mes "�@���̏ꂩ�痧���������]";
		close;
	}
	if(rand(3) == 2) {
		mes "�]���Ȃ�����΂ɐG����";
		mes "�@��峂��P���Ă����B";
		mes "�@�A�T�V���B���d�|�����g���b�v���B";
		mes "�@���Ȃ��͋����Ă��܂��A";
		mes "�@��΂���葹�˂��B";
		mes "�@^FF0000������S�ē|����";
		mes "�@������x���ׂ悤^000000�]";
		donpcevent "YggWiseRing_Red::OnStart";
		close;
	}
	mes "�]���Ȃ��͓y�̒��ɂ�����";
	mes "�@�Ԃ���΂��@��o�����]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�����A�C�e���̎�ސ���������";
		mes "�@�Ԃ���΂��Ƃ邱�Ƃ��ł��Ȃ������B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	setquest 8241;
	getitem 7575,1;
	close;
}

spl_fild02,0,0,0	script	YggWiseRing_Red	-1,{
OnStart:
	initnpctimer;
	monster "spl_fild02",25,220,"���",1051,3,"YggWiseRing_Red::OnKilled";
	hideonnpc "�����ꂽ���#ygg_red";
	end;
OnKilled:
	set .mob,getmapmobs("spl_fild02","YggWiseRing_Red::OnKilled");
	if(.mob <= 0) {
		hideoffnpc "�����ꂽ���#ygg_red";
		stopnpctimer;
	}
	end;
OnTimer30000:
	killmonster "spl_fild02","YggWiseRing_Red::OnKilled";
	hideoffnpc "�����ꂽ���#ygg_red";
	stopnpctimer;
	end;
}

man_fild02,310,371,0	script	�����ꂽ���#ygg_blue	844,{
	if(YGG_1QUE < 5) {
		mes "�]����オ���Ă���y�̉��";
		mes "�@����΂�������Ă���B";
		mes "�@�C�̂������������̂���ʂ�";
		mes "�@�����߂��Ă���c�c";
		mes "�@�ߊ��Ȃ������������낤�]";
		close;
	}
	if(YGG_1QUE > 5 || countitem(7576)>0) {
		mes "�]����΂��@��o����";
		mes "�@�Ղ��c���Ă���]";
		close;
	}
	mes "�]����オ���Ă���y�̉��";
	mes "�@����΂�������Ă���]";
	next;
	if(select("��΂����","�����Ă���") == 2) {
		mes "�]���Ȃ���";
		mes "�@���̏ꂩ�痧���������]";
		close;
	}
	if(rand(3) == 2) {
		mes "�]���Ȃ�����΂ɐG����";
		mes "�@��峂��P���Ă����B";
		mes "�@�A�T�V���B���d�|�����g���b�v���B";
		mes "�@���Ȃ��͋����Ă��܂��A";
		mes "�@��΂���葹�˂��B";
		mes "�@^FF0000������S�ē|����";
		mes "�@������x���ׂ悤^000000�]";
		donpcevent "YggWiseRing_Blue::OnStart";
		close;
	}
	mes "�]���Ȃ��͓y�̒��ɂ�����";
	mes "�@����΂��@��o�����]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�����A�C�e���̎�ސ���������";
		mes "�@����΂��Ƃ邱�Ƃ��ł��Ȃ������B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	setquest 8242;
	getitem 7576,1;
	close;
}

man_fild02,0,0,0	script	YggWiseRing_Blue	-1,{
OnStart:
	initnpctimer;
	monster "man_fild02",310,371,"���",1051,3,"YggWiseRing_Blue::OnKilled";
	hideonnpc "�����ꂽ���#ygg_blue";
	end;
OnKilled:
	set .mob,getmapmobs("man_fild02","YggWiseRing_Blue::OnKilled");
	if(.mob <= 0) {
		hideoffnpc "�����ꂽ���#ygg_blue";
		stopnpctimer;
	}
	end;
OnTimer30000:
	killmonster "man_fild02","YggWiseRing_Blue::OnKilled";
	hideoffnpc "�����ꂽ���#ygg_blue";
	stopnpctimer;
	end;
}

//============================================================
// ��̎푰�N�G�X�g
//- Registry -------------------------------------------------
// YGG_2QUE -> 0�`27
//------------------------------------------------------------
spl_in01,32,306,3	script	�x����#ygg	447,2,2,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		if(YGG_2QUE) {
			mes "[�A�[�N]";
			mes "Yur,Dur�@AnoVa?";
			mes "Wha?�@Dieb�@OsaDur..";
			mes "ah..RuffThus�@NeAsh.";
			mes "man�@nesAsh�@OdesAlah?";
			close;
		}
		mes "[�x����]";
		mes "NeiVil�@!";
		mes "narNoth�@nesMush.";
		mes "AnuDur�@AmanDana";
		mes "Goth�@nar!";
		close;
	}
	switch(YGG_2QUE) {
	case 0:
		mes "[�x����]";
		mes "����H";
		mes "�N�̓��t�B�l���ł�";
		mes "�T�t�@���ł��Ȃ��c�c";
		next;
		mes "[�x����]";
		mes "�ŋ߁A�p�ɂɌ����悤�ɂȂ���";
		mes "�َ푰���B";
		next;
		mes "[�x����]";
		mes "���̖��O�̓A�[�N�B";
		mes "�˂��A���̌����Ă��邱�Ƃ킩��H";
		mes "�@";
		mes "���J���}�X�J�[�H";
		mes "���Ă킩��킯�Ȃ����c�c";
		next;
		if(select("�킩��܂���","�c�c") == 2) {
			mes "[�A�[�N]";
			mes "�������A";
			mes "���t���ʂ��Ȃ��̂��c�c";
			mes "�܂������ȁ[�B";
			close;
		}
		mes "[�A�[�N]";
		mes "������I";
		mes "���̌����Ă��邱�Ƃ�";
		mes "�����ł���̂��I";
		next;
		mes "[�A�[�N]";
		mes "�������ȁc�c";
		mes "��́A�ǂ�����Č��t��";
		mes "�o�����񂾂�H";
		next;
		mes "[�A�[�N]";
		mes "����ɂ��񂽂݂����Ȏ푰��";
		mes "�ŋ߂悭�������邪�A";
		mes "��̉��҂Ȃ񂾁H";
		next;
		mes "�]���Ȃ��́A�A�[�N��";
		mes "�@�m�b�̉��̎w�ւ̂��Ƃ�";
		mes "�@�����͐l�ԂƂ����푰��";
		mes "�@�~�b�h�K���h�嗤����";
		mes "�@�������Ƃ�b�����]";
		next;
		mes "[�A�[�N]";
		mes "�Ӂ`��A�������B";
		mes "�~�b�h�K���h�嗤���痈���̂��B";
		next;
		mes "[�A�[�N]";
		mes "����ɂ��Ă��A";
		mes "����ȕ֗��Ȏw�ւ�����Ȃ��";
		mes "���܂��B�l�Ԃ͂������ȁ[�B";
		next;
		mes "[�A�[�N]";
		mes "�Ȃ��A";
		mes "���̎w�ւ�";
		mes "�����Ă���Ȃ����H";
		next;
		mes "�]���Ȃ���";
		mes "�@�m�b�̉��̎w�ւ�";
		mes "�@�A�[�N�Ɍ������]";
		next;
		mes "[�A�[�N]";
		mes "���̎w�ցA�������ȁc�c";
		mes "�ǂ��Ȃ��Ă���񂾂낤�B";
		next;
		mes "�]�A�[�N��";
		mes "�@�m�b�̉��̎w�ւ�";
		mes "�@�ڂ��P�����Č��Ă���]";
		set YGG_2QUE,1;
		setquest 70400;
		delquest 70365;
		close;
	case 1:
		mes "[�A�[�N]";
		mes "�w�ւ������Ă����";
		mes "���肪�Ƃ��B";
		mes "���₠�A";
		mes "���A������Ă��܂����B";
		next;
		mes "[�A�[�N]";
		mes "�˂��A";
		mes "���O�������Ă���Ȃ����ȁH";
		next;
		menu "�����",-;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "���B";
		mes "�������O���ˁB";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "���̂����A";
		mes "�����Ȃ�ň����񂾂��ǁA";
		mes "����肢���������Ƃ�";
		mes "����񂾂��ǁc�c";
		next;
		if(select("���ł����H","���͂�����Ɓc�c") == 2) {
			mes "[�A�[�N]";
			mes "�c�c";
			mes "�������B";
			mes "�d���Ȃ����c�c";
			close;
		}
		mes "[�A�[�N]";
		mes "���͂��A";
		mes "���̗c�����^FF0000�e��^000000���Ă����q��";
		mes "�O�o���Ă���߂��Ă��Ȃ��񂾁B";
		mes "�Ō�ɂ������̂�����O�c�c";
		next;
		mes "[�A�[�N]";
		mes "�e�����s�������ȏꏊ��";
		mes "�{���Ă݂͂��񂾂��ǁA";
		mes "������Ȃ��ĐS�z�Ȃ񂾂�B";
		next;
		mes "[�A�[�N]";
		mes "�e���́A���i���炸����";
		mes "�ǂ����ɍs���Ă��邵�A";
		mes "�D��S�����ł��A";
		mes "�����ɍs������^�C�v�Ȃ񂾁B";
		mes "������A�ǂ�����";
		mes "���o���Ă��邾�����Ǝv���񂾂��ǂ��B";
		next;
		mes "[�A�[�N]";
		mes "�ł��A������������A";
		mes "���̊��X�������l^FF0000�T�t�@��^000000��";
		mes "�P��ꂽ���ĉ\�������邵�c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�T�t�@�����Ēm���Ă���H";
		next;
		switch(select("�m���Ă���","�m��Ȃ�")) {
		case 1:
			mes "[�A�[�N]";
			mes "�ւ��A�m���Ă���񂾁B";
			mes "�ł������炪";
			mes "�ǂꂾ���Ђǂ��ꑰ��";
			mes "�m��Ȃ����낤�H";
			mes "���������Ă������B";
			break;
		case 2:
			mes "[�A�[�N]";
			mes "�悵�A���ꂶ�Ⴀ�A";
			mes "���������Ă������B";
			break;
		}
		next;
		mes "[�A�[�N]";
		mes "�T�t�@�����Ă̂�";
		mes "^FF0000�C�O�h���V��^000000��������";
		mes "�׈��ȋ��l�̈ꑰ�Ȃ񂾂�B";
		mes "�����Ɛ̂���C�O�h���V����";
		mes "���������Ă���񂾁B";
		next;
		mes "[�A�[�N]";
		mes "������̂����ŃC�O�h���V����";
		mes "�{���Ɏ���Ă��܂����c�c";
		next;
		mes "[�A�[�N]";
		mes "���������t�B�l����";
		mes "�C�O�h���V������삷��ꑰ�Ȃ񂾁B";
		mes "������A�C�O�h���V������邽�߂�";
		mes "^0000FF���g�D���փC��^000000�̒n�ɗ����񂾂�B";
		next;
		mes "[�A�[�N]";
		mes "�����ăT�t�@���Ƃ̐킢���n�܂����B";
		mes "���̃C�O�h���V�������킢�́A";
		mes "�����܂������Ă���񂾁B";
		next;
		mes "[�A�[�N]";
		mes "�܂��A�T�t�@���ɂ��Ă�";
		mes "����ȂƂ����ȁB";
		next;
		mes "[�A�[�N]";
		mes "�e�������Ȃ��Ȃ������Ƃ�";
		mes "�T�t�@�����ւ���Ă���";
		mes "��������Ȃ��Ǝv���Ɓc�c";
		next;
		mes "[�A�[�N]";
		mes "���肢������ꏏ��";
		mes "�e����{���Ă���Ȃ����H";
		next;
		if(select("������܂���","���͂�����Ɓc�c") == 2) {
			mes "[�A�[�N]";
			mes "�c�c";
			mes "�������B";
			mes "�d���Ȃ����c�c";
			close;
		}
		mes "[�A�[�N]";
		mes "���肪�Ƃ��I";
		mes "�N���Ă�������ˁB";
		next;
		mes "[�A�[�N]";
		mes "�����W�߂���񂾂�";
		mes "�e���́A�ǂ����";
		mes "���̃X�v�����f�B�b�h����";
		mes "���̒n��ɍs�����炵���񂾁B";
		next;
		mes "[�A�[�N]";
		mes "������A";
		mes "���̒n���{���ė~�����񂾁B";
		mes "�����E�����I�����炷���ɍs�����炳�B";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "���Ƃ��A�e���͉������������A";
		mes "^4d4dff�ڈ�Ƃ��đ�������ŁA";
		mes "���Ղ��c����^000000�B";
		next;
		mes "[�A�[�N]";
		mes "�����A���Ŗڈ���c���̂�";
		mes "��펖�Ԃ̎�����������A";
		mes "����󂪂Ȃ����ǂˁB";
		next;
		mes "[�A�[�N]";
		mes "���ꂶ�Ⴀ�A";
		mes "���̒n��ɍs����";
		mes "�e����{���ė��Ă���B";
		next;
		menu "�킩��܂���",-;
		mes "[�A�[�N]";
		mes "���񂾂�!!";
		set YGG_2QUE,2;
		chgquest 70400,7056;
		close;
	case 2:
		mes "[�A�[�N]";
		mes "������A";
		mes "���̒n���{���ė~�����񂾁B";
		mes "�����E�����I������A";
		mes "�����ɍs�����炳�B";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "���Ƃ��A�e���͉������������A";
		mes "^4d4dff�ڈ�Ƃ��đ�������ŁA";
		mes "���Ղ��c����^000000�B";
		next;
		mes "[�A�[�N]";
		mes "�����A���Ŗڈ���c���̂�";
		mes "��펖�Ԃ̎�����������A";
		mes "����󂪂Ȃ����ǂˁB";
		next;
		mes "[�A�[�N]";
		mes "���ꂶ�Ⴀ";
		mes "���̒n��ɍs����";
		mes "�e����{���ė��ĂˁB";
		close;
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�A�[�N]";
		mes "�e���́A���������H";
		next;
		menu "�ڈ�����������Ƃ�񍐂���",-;
		mes "[�A�[�N]";
		mes "�ڈ󂪂�����!?";
		mes "�e���ɉ����������c�c";
		mes "�Ȃ�A���̖ڈ��ǂ��Ă݂āI";
		next;
		mes "[�A�[�N]";
		mes "��������������";
		mes "�l���{���ɍs�����炳!!";
		close;
	case 7:
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�I";
		mes "��ς��I";
		next;
		menu "�ǂ����܂����H",-;
		mes "�]�A�[�N�́A";
		mes "�@�C�����]���Ă���]";
		next;
		mes "[�A�[�N]";
		mes "�e�����c�c";
		next;
		mes "[�A�[�N]";
		mes "�e�����A���ė�����!!";
		mes "�̒��ɏ��𕉂��āI";
		next;
		menu "�̒��ɏ��H",-;
		mes "[�A�[�N]";
		mes "�����I";
		mes "��������";
		mes "�����͎��Â��󂯂Ȃ��ŁA";
		mes "�����Ȃ�^FF0000�u���f�B�E��^000000��D����";
		mes "�ǂ����ɍs���Ă��܂�����!!";
		next;
		mes "[�A�[�N]";
		mes "��̂����͂ǂ��ɁA";
		mes "�ǂ��ɍs�����񂾁H";
		next;
		mes "[�A�[�N]";
		mes "�����������񂾁H";
		mes "�����󂪂킩��Ȃ���!!";
		next;
		menu "���A�ɂ��ĕ񍐂���",-;
		mes "[�A�[�N]";
		mes "�e���̖ڈ�����ǂ��čs������";
		mes "���A�����������āH";
		mes "�����ɐ΂̂悤�ɂȂ���";
		mes "�T�t�@���������c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "���A�ɂ͐΂̂悤�ȃT�t�@���c�c";
		mes "�e���͂����ɍs���Ă����̂��c�c�H";
		next;
		mes "[�A�[�N]";
		mes "�e���������čs����";
		mes "�u���f�B�E���̓T�t�@���ɂƂ��āA";
		mes "�a��}����򂾂����͂��c�c";
		mes "�������^FF0000��^000000�Ƃ������ׂ����c�c";
		next;
		mes "[�A�[�N]";
		mes "���߂����c�c";
		mes "�e�����������悤�Ƃ��Ă��邩";
		mes "�킩��Ȃ����c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes strcharinfo(0)+ "�A";
		mes "������Ƒ҂��ĂĂ���I";
		next;
		mes "�]�A�[�N�́A";
		mes "�@�}���ő��������n�߂��]";
		set YGG_2QUE,8;
		chgquest 7058,70420;
		close;
	case 8:
		mes "[�A�[�N]";
		mes "�悵�A���������I";
		next;
		menu "�ǂ��������ł����H",-;
		mes "[�A�[�N]";
		mes "�e����{���ɍs���񂾂�I";
		mes "���������Ȃ�����!!";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���A�̏ꏊ�������Ă���!!";
		mes "�����ƁA�e���͓��A��";
		mes "����ɂ���Ǝv���񂾁I";
		next;
		mes "�]�A�[�N�ɁA";
		mes "�@���A�̏ꏊ���������]";
		next;
		mes "[�A�[�N]";
		mes "�悵�B���Ⴀ�������A�ɍs�����I";
		mes "�ꏏ�ɍs�������H";
		mes "����������Ȃ��ɍs���Ă邼�I";
		next;
		if(select("�ꏏ�ɍs��","��ōs��") == 2) {
			mes "[�A�[�N]";
			mes "�킩�����I";
			mes "�������o�����炷���ɗ��Ă���B";
			mes "�ꏏ�Ɍ������Ȃ�܂����������Ă���I";
			set YGG_2QUE,9;
			setquest 7059;
			delquest 70420;
			close;
		}
		mes "[�A�[�N]";
		mes "�悵�B���Ⴀ�o�����I";
		set YGG_2QUE,9;
		setquest 7059;
		delquest 70420;
		close2;
		warp "spl_fild01",369,109;
		end;
	case 9:
		mes "[�A�[�N]";
		mes "���A�Ɍ��������I";
		mes "�ꏏ�ɍs�������H";
		next;
		if(select("�ꏏ�ɍs��","��ōs��") == 2) {
			mes "[�A�[�N]";
			mes "�킩�����I";
			mes "�������o�����炷���ɗ��Ă���B";
			mes "�ꏏ�Ɍ������Ȃ�܂����������Ă���I";
			close;
		}
		mes "[�A�[�N]";
		mes "�悵�B���Ⴀ�o�����I";
		close2;
		warp "spl_fild01",369,109;
		end;
	case 10:
	case 11:
	case 12:
		mes "[�A�[�N]";
		mes "�ʖڂ��A";
		mes "�e����������Ȃ��c�c!!";
		close;
	case 13:
		mes "�]���Ȃ��́A�A�[�N��";
		mes "�@���t�B�l���̕ߗ������āA";
		mes "�@����ŋꂵ��ł��邱�Ƃ�`�����]";
		next;
		mes "[�A�[�N]";
		mes "�Ȃ񂾂��āI";
		mes "���̕ߗ��̓e���Ȃ̂�!?";
		next;
		menu "�e�����ǂ����͂킩��܂���",-;
		mes "[�A�[�N]";
		mes "�������A�ł�";
		mes "�e���̉\���������ȁc�c";
		next;
		mes "[�A�[�N]";
		mes "�N�\�b!!";
		mes "�ǂ�����΂�����!?";
		mes "�}�k�N����A�����ɍs���悤���Ȃ�!!";
		next;
		mes "�]�T�t�@���́A���̂Ƃ���";
		mes "�@���t�B�l���̕ߗ���";
		mes "�@��Q�����������͂Ȃ��A";
		mes "�@�ނ���A������������";
		mes "�@�T���Ă��邱�Ƃ�`�����]";
		next;
		mes "[�A�[�N]";
		mes "���l�̂���";
		mes "�ߗ��Ɋ�Q��";
		mes "�����悤�Ƃ��Ă��Ȃ��̂��c�c";
		next;
		mes "[�A�[�N]";
		mes "��ō���ł����āA";
		mes "���t�B�l���̏���";
		mes "�����o�����Ƃ��Ă���̂��낤���A";
		mes "�Ƃ肠���������������B";
		next;
		menu "��������Ă��������̂ł���",-;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���t�B�l���̉���̎��Âɂ�";
		mes "�C�O�h���V���̎�����Ԃ��I";
		mes "�C�O�h���V���̎���^FF00006��^000000��";
		mes "����ΐ�΂ɑ��v���낤�B";
		next;
		mes "[�A�[�N]";
		mes "������Ƒ҂��Ă���B";
		mes "�C�O�h���V���̎��Ȃ�";
		mes "�����Ă����͂����B";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "���܂Ȃ��B";
		mes "���A�C�O�h���V���̎���";
		mes "3���������Ă��Ȃ������c�c";
		mes "�c���3���ǂ��ɂ����Ȃ��ƂȁB";
		next;
		menu "�T���Ă��܂�",-;
		mes "[�A�[�N]";
		mes "�{�����I";
		mes "���肪�Ƃ��I";
		next;
		mes "[�A�[�N]";
		mes "�C�O�h���V���̍��������";
		mes "�C�O�h���V���̎���";
		mes "�����Ă��邱�Ƃ�����񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���̒n��̏��n�t�߂�";
		mes "����Ȗ؂̍�������񂾂��ǁA";
		mes "���ꂪ�C�O�h���V���̍��Ȃ񂾂�B";
		next;
		mes "[�A�[�N]";
		mes "���̃C�O�h���V���̍��t�߂�";
		mes "�T���Ă݂Ă���B";
		mes "���Ȃ�A�C�O�h���V���̎�3���x�Ȃ�";
		mes "^FF0000��ɓ��邩������Ȃ��B^000000";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�C�O�h���V���̎��͊󏭂ȕ����B";
		mes "^FF0000���̉�����������t�B�l������������";
		mes "�����C�O�h���V���̍�����";
		mes "�C�O�h���V���̎���";
		mes "��ɓ���Ȃ��Ǝv���Ă���B^000000";
		next;
		if(checkitemblank() == 0) {
			mes "[�A�[�N]";
			mes "��H";
			mes "�ו����������������B";
			mes "����ł̓C�O�h���V���̎���";
			mes "�n�����Ƃ͏o���Ȃ���B";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă���B";
			close;
		}
		if(checkweight(607,3) == 0) {
			mes "[�A�[�N]";
			mes "��H";
			mes "�ו����������������B";
			mes "����ł̓C�O�h���V���̎���";
			mes "�n�����Ƃ͏o���Ȃ���B";
			mes "�ו��̏d�ʂ����炵�Ă���";
			mes "�܂��b�������Ă���B";
			close;
		}
		getitem 607,3;
		set YGG_2QUE,14;
		chgquest 7062,7063;
		mes "[�A�[�N]";
		mes "���̎����Ă��镪���󂯎���Ă���B";
		next;
		mes "[�A�[�N]";
		mes "���͓G�n�̃}�k�N��";
		mes "�ڗ������s���͏o���Ȃ��B";
		mes "�Ƃ肠�����C�O�h���V���̎���";
		mes "����ꏊ�t�߂܂ł�";
		mes "�ē��ł��邪�ǂ�����B";
		mes "�����Ɍ��������H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�A�[�N]";
			mes "�������A�킩�����B";
			mes "�K�v�Ȏ��͌����Ă���B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i^FF0000�C�O�h���V���̎�6��^000000��";
			mes "�X�m�[�����ɓn�����B";
			mes "�C�O�h���V���̎���";
			mes "�e����������܂ł́A";
			mes "�C�O�h���V���̍��t�߂�";
			mes "3��ɓ���炵���j";
			close;
		}
		mes "[�A�[�N]";
		mes "�悵�B���ꂶ�Ⴀ���낤�B";
		mes "���񂾂��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i^FF0000�C�O�h���V���̎�6��^000000��";
		mes "�X�m�[�����ɓn�����B";
		mes "�C�O�h���V���̎���";
		mes "�e����������܂ł́A";
		mes "�C�O�h���V���̍��t�߂�";
		mes "3��ɓ���炵���j";
		close2;
		warp "spl_fild01",356,42;
		end;
	case 14:
	case 15:
	case 16:
	case 17:
		mes "[�A�[�N]";
		mes "�����A�C�O�h���V���̎���";
		mes "����Ȃ��ꍇ�́A";
		mes "���̒n��̏��n�t�߂�";
		mes "����Ȗ؂̍�������͂����B";
		mes "����́A���̒n��܂�";
		mes "�L�тĂ����C�O�h���V���̍��Ȃ񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���̃C�O�h���V���̍��t�߂�";
		mes "�T���Ă݂Ă���B";
		mes "���Ȃ�A�C�O�h���V���̎�3���x�Ȃ�";
		mes "^FF0000��ɓ��邩������Ȃ��B^000000";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�C�O�h���V���̎��͊󏭂ȕ����B";
		mes "^FF0000���̉�����������t�B�l������������";
		mes "�����C�O�h���V���̍�����";
		mes "�C�O�h���V���̎���";
		mes "��ɓ���Ȃ��Ǝv���Ă���B^000000";
		next;
		mes "[�A�[�N]";
		mes "���͓G�n�̃}�k�N��";
		mes "�ڗ������s���͏o���Ȃ��B";
		mes "�Ƃ肠�����C�O�h���V���̎���";
		mes "����ꏊ�t�߂܂ł�";
		mes "�ē��ł��邪�ǂ�����B";
		mes "�����Ɍ��������H";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�A�[�N]";
			mes "�������A�킩�����B";
			mes "�K�v�Ȏ��͌����Ă���B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i^FF0000�C�O�h���V���̎�6��^000000��";
			mes "�X�m�[�����ɓn�����B";
			mes "�C�O�h���V���̎���";
			mes "�e����������܂ł́A";
			mes "�C�O�h���V���̍��t�߂�";
			mes "3��ɓ���炵���j";
			close;
		}
		mes "[�A�[�N]";
		mes "�悵�B���ꂶ�Ⴀ���낤�B";
		mes "���񂾂��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i^FF0000�C�O�h���V���̎�6��^000000��";
		mes "�X�m�[�����ɓn�����B";
		mes "�C�O�h���V���̎���";
		mes "�e����������܂ł́A";
		mes "�C�O�h���V���̍��t�߂�";
		mes "3��ɓ���炵���j";
		close2;
		warp "spl_fild01",356,42;
		end;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
	case 24:
		mes "[�A�[�N]";
		mes "�e���c�c";
		close;
	case 25:
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "!!";
		mes "�e�����A���ė�����I";
		next;
		menu "�悩����",-;
		mes "[�A�[�N]";
		mes "�N�����Ȃ�������";
		mes "�e���������邱�Ƃ��ł��Ȃ������c�c";
		mes strcharinfo(0)+ "�A";
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		mes "[�A�[�N]";
		mes "����łˁA�e���͍��A";
		mes "^FF0000���C^000000�ŗ×{���Ă���񂾁B";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���C�Ɋ���čs���Ă�B";
		mes "�������x�������ɍs������";
		mes "�v���Ă������ˁB";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�����A���߂�B";
		mes "���C���Ă����͉̂Ƃ̂��Ƃ���B";
		mes "���t�B�l�����L�̌��������ȁB";
		set YGG_2QUE,26;
		chgquest 7070,7071;
		close;
	case 26:
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���C�Ɋ���čs���Ă�B";
		mes "�������x�������ɍs������";
		mes "�v���Ă������ˁB";
		close;
	case 27:
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���肪�Ƃ��B";
		mes "�e���������Ŗ{���ɗǂ�������B";
		close;
	}
OnTouch:
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�x����]";
		mes "Tal-!";
		mes "AnuDur�@AmanDana";
		mes "Goth nar�I";
		mes "Agoltas Me�c�c";
		close;
	}
	if(!YGG_2QUE) {
		mes "[�x����]";
		mes "�~�܂�I";
		mes "�����͋��Ȃ��ł͓���Ȃ���I";
		close;
	}
	end;
}

spl_fild02,45,214,0	script	��	844,{
	if(YGG_2QUE == 2) {
		cutin "ep13_plant01",2;
		mes "�]���������Ă���]";
		next;
		mes "�]�悭����Ƒ�������ł���B";
		mes "�@�A�[�N�������Ă���";
		mes "�@�e���̖ڈ�̂悤���]";
		next;
		mes "�]���΂ꂽ����";
		mes "�@^4d4dff�쓌^000000�ɌX���Ă���B";
		mes "�@�e�����A��������쓌��";
		mes "�@�����������Ƃ������Ă���悤���]";
		set YGG_2QUE,3;
		chgquest 7056,7057;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ڈ��ǂ��Ă������B";
		mes "�ڈ��ǂ��Ă�����";
		mes "���������邩������Ȃ��j";
		close2;
		cutin "13_",255;
		end;
	}
	else if(YGG_2QUE == 3) {
		mes "�]���������Ă���]";
		next;
		mes "�]�悭����Ƒ�������ł���B";
		mes "�@�A�[�N�������Ă���";
		mes "�@�e���̖ڈ�̂悤���]";
		next;
		mes "�]���΂ꂽ����";
		mes "�@^4d4dff����^000000�ɌX���Ă���B";
		mes "�@�e�����A����������";
		mes "�@�����������Ƃ������Ă���悤���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ڈ��ǂ��Ă������B";
		mes "�ڈ��ǂ��Ă�����";
		mes "���������邩������Ȃ��j";
		close;
	}
	mes "�]���������Ă���]";
	close;
}

spl_fild02,122,106,0	script	��	844,{
	if(YGG_2QUE == 3) {
		cutin "ep13_plant01",2;
		mes "�]���������Ă���]";
		next;
		mes "�]�悭����Ƒ�������ł���B";
		mes "�@�A�[�N�������Ă���";
		mes "�@�e���̖ڈ�̂悤���]";
		next;
		mes "�]���΂ꂽ����";
		mes "�@^4d4dff��^000000�ɌX���Ă���B";
		mes "�@�e�����A�������瓌��";
		mes "�@�����������Ƃ������Ă���悤���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ڈ��ǂ��Ă������B";
		mes "�ڈ��ǂ��Ă�����";
		mes "���������邩������Ȃ��j";
		close2;
		if(!checkquest2(70401))
			setquest 70401;
		if(checkquest2(7057))
			delquest 7057;
		cutin "13_",255;
		end;
	}
	mes "�]���������Ă���]";
	close;
}

spl_fild02,329,191,0	script	��	844,{
	if(YGG_2QUE == 3 || YGG_2QUE == 4) {
		cutin "ep13_plant01",2;
		mes "�]���������Ă���]";
		next;
		mes "�]�悭����Ƒ�������ł���B";
		mes "�@�A�[�N�������Ă���";
		mes "�@�e���̖ڈ�̂悤���]";
		next;
		mes "�]���΂ꂽ����";
		mes "�@^4d4dff�k^000000�ɌX���Ă���B";
		mes "�@�e�����A��������k��";
		mes "�@�����������Ƃ������Ă���悤���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ڈ��ǂ��Ă������B";
		mes "�ڈ��ǂ��Ă�����";
		mes "���������邩������Ȃ��j";
		close2;
		cutin "13_",255;
		if(!checkquest2(70402))
			setquest 70402;
		if(checkquest2(7057))
			delquest 7057;
		if(checkquest2(70401))
			delquest 70401;
		end;
	}
	mes "�]���������Ă���]";
	close;
}

spl_fild02,328,323,0	script	�����̐�	844,{
	if(YGG_2QUE == 2) {
		mes "�]���Ղ���R���邪�A";
		mes "�@���ɂ������ȓ_�͌�������Ȃ��]";
		close;
	}
	else if(YGG_2QUE == 3) {
		mes "�]���Ղ���R����B";
		mes "�@���������̂悤�Ɍ������`�Ղ��]";
		next;
		mes "�]�悭�����";
		mes "�@�傫���ƌ`�̈Ⴂ����";
		mes "�@���ނ̑��Ղł��邱�Ƃ��킩��B";
		mes "�@��͈ٗl�ɑ傫�ȑ��ՁA";
		mes "�@������͈ٗl�ɏ��������Ձ]";
		next;
		mes "�]���̓��ނ̑��Ղ����āA";
		mes "�@���Ȃ��̓T�t�@���ƃ��t�B�l����";
		mes "�@���Ղ�z�������]";
		next;
		mes "�]�e���Ɋ֌W���Ă���\���������B";
		mes "�@���Ղ�^4d4dff�k�̕�^000000�ɑ����Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���Ղ�ǂ����B";
		mes "���Ղ̐�Ƀe�������邩������Ȃ��j";
		set YGG_2QUE,4;
		setquest 70405;
		if(checkquest2(7057))
			delquest 7057;
		if(checkquest2(70401))
			delquest 70401;
		if(checkquest2(70402))
			delquest 70402;
		close2;
		warp "spl_fild01",345,109;
		end;
	}
	else if(YGG_2QUE == 4) {
		mes "�]���Ղ���R����B";
		mes "�@���������̂悤�Ɍ������`�Ղ��]";
		next;
		mes "�]�e���Ɋ֌W���Ă���\���������B";
		mes "�@���Ղ�^4d4dff�k�̕�^000000�ɑ����Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���Ղ�ǂ����B";
		mes "���Ղ̐�Ƀe�������邩������Ȃ��j";
		close2;
		warp "spl_fild01",345,109;
		end;
	}
	mes "�]���Ղ���R����]";
	close;
}

spl_fild01,341,109,0	script	�����̐�	844,{
	if(YGG_2QUE == 2 || YGG_2QUE == 3) {
		mes "�]���Ղ���R���邪�A";
		mes "�@���ɂ������ȓ_�͌�������Ȃ��]";
		close;
	}
	else if(YGG_2QUE == 4) {
		mes "�]���Ղ���R����B";
		mes "�@���������̂悤�Ɍ������`�Ղ��]";
		next;
		mes "�]�������̑��ՂƓ�����";
		mes "�@�傫���ƌ`�̈Ⴂ����";
		mes "�@���ނ̑��Ղł��邱�Ƃ��킩��]";
		next;
		mes "�]�e���Ɋ֌W���Ă���̂��낤���H";
		mes "�@���Ղ�^4d4dff����Ȗ؂̍�^000000�̕���";
		mes "�@�����Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i����Ȗ؂̍��𒲂ׂĂ݂悤�j";
		set YGG_2QUE,5;
		setquest 70410;
		delquest 70405;
		close2;
		warp "spl_fild01",369,109;
		end;
	}
	else if(YGG_2QUE == 5) {
		mes "�]�����ɂ����Ղ���R����B";
		mes "�@���������̂悤�Ɍ������`�Ղ��]";
		next;
		mes "�]�e���Ɋ֌W���Ă���̂��낤���H";
		mes "�@���Ղ�^4d4dff����Ȗ؂̍�^000000�̕���";
		mes "�@�����Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i����Ȗ؂̍��𒲂ׂĂ݂悤�j";
		close2;
		warp "spl_fild01",369,109;
		end;
	}
	mes "�]���Ղ���R����]";
	close;
}

spl_fild01,375,109,4	script	����Ȗ؂̍�	111,{
	if(YGG_2QUE < 5) {
		mes "�]���܂Ō������Ƃ��Ȃ��悤��";
		mes "�@����Ȗ؂̍�������]";
		close;
	}
	else if(YGG_2QUE == 5) {
		mes "�]���܂Ō������Ƃ̂Ȃ��悤��";
		mes "�@����Ȗ؂̍������܂��Ă���]";
		next;
		mes "�]�悭����Ɖ��������̕���";
		mes "�@���藎�������Ղ�����A";
		mes "�@���̐�̕�����A";
		mes "�@�₽����������ė��Ă���悤���]";
		next;
		if(select("���Ղ����ǂ�","�������Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ��͂������ƍ��Ղ����ǂ����B";
		mes "�@��ɐi�ނƓ��A�ɂȂ����Ă����B";
		mes "�@���Ȃ��͉^�ǂ������X�^�[��";
		mes "�@�������邱�ƂȂ��i�ނ��Ƃ��ł����B";
		mes "�@�����āc�c�]";
		set YGG_2QUE,6;
		setquest 70415;
		delquest 70410;
		close2;
		warp "nyd_dun_jp",66,222;
		end;
	}
	else if(YGG_2QUE == 6 || YGG_2QUE == 9 || YGG_2QUE == 21 || YGG_2QUE == 23) {
		mes "�]����Ȗ؂̍��̊ԂɁA";
		mes "�@�n���ɒʂ��錊������]";
		next;
		if(select("����","����Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ��͂��̋��l�̐Α��̂��Ƃ�";
		mes "�@���������]";
		close2;
		warp "nyd_dun_jp",66,222;
		end;
	}
	mes "�]����Ȗ؂̍��̊ԂɁA";
	mes "�@�n���ɒʂ��錊������]";
	mes "�@�������牜�ɐi�ނ��Ƃ��o���������B";
	next;
	if(NYD_1QUE == 111 || NYD_1QUE == 112 || NYD_1QUE == 200 || NYD_1QUE == 201)
		set .@str$,"���҂̖�ɐi��";
	switch(select("�����Ɍ�����",.@str$,"����Ȃ�")) {
	case 1:
		mes "�]���Ȃ��͐�ɐi�񂾁]";
		close2;
		warp "nyd_dun01",72,125;
		end;
	case 2:
		mes "�]���Ȃ��͎��҂̖�Ɍ��������]";
		close2;
		warp "nyd_dun02",61,265;
		end;
	case 3:
		mes "�]���͂�߂Ă������]";
		close;
	}
}

nyd_dun_jp,88,220,0	script	to_nyd_dun01	139,10,10,{
	warp "nyd_dun_jp",66,222;
	end;
}

nyd_dun01,58,223,0	script	�T�t�@���̐Α�#ygg	844,{
	switch(YGG_2QUE) {
	case 6:
		mes "�]����Ȗ؂̍���}��";
		mes "�@�����ɕǂ����яo�Ă���A";
		mes "�@�ؘR������܂Ԃ����]";
		next;
		mes "�]�悭����ƁA���l�̎p������";
		mes "�@�Α�����������Ă���]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�H";
		next;
		menu "�Α�����Ȃ��c�c",-;
		mes "�]�悭����ƐΑ��ł͂Ȃ��A";
		mes "�@�T�t�@���̂悤���B";
		mes "�@�������A�̂�";
		mes "�@�΂̂悤�Ɍł܂��Ă���B";
		mes "�@�e���Ɗ֌W����̂��낤���H-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��̉����N���Ă���̂��낤�c�c";
		mes "�o����T���o����";
		mes "��x�A�[�N�̂Ƃ���ɖ߂�A";
		mes "�񍐂��悤�j";
		next;
		menu "����́H",-;
		mes "�]��������؂̂邪";
		mes "�@���ꉺ�����Ă���̂�������B";
		mes "�@�؂̂�����ƒn��ɋA�ꂻ�����]";
		set YGG_2QUE,7;
		chgquest 70415,7058;
		close;
	case 7:
	case 8:
		mes "["+strcharinfo(0)+"]";
		mes "�i��̉����N���Ă���̂��낤�c�c";
		mes "�o����T���o����";
		mes "��x�A�[�N�̂Ƃ���ɖ߂�A";
		mes "�񍐂��悤�j";
		close;
	case 9:
		mes "�]��������n���Ă��e���͂��Ȃ��]";
		next;
		menu "���������Ă���H",-;
		mes "�]�����P���΂������Ă���B";
		mes "�@�ŏ��ɂ��̏ꏊ�ɗ������́A";
		mes "�@���̐΂͂Ȃ������]";
		next;
		mes "�]����́A�e���������o�����Ƃ���";
		mes "�@^FF0000�u���f�B�E��^000000���]";
		next;
		menu "�e���͂����ɗ�����",-;
		mes "�]������������A";
		mes "�@�e���̓u���f�B�E�����g�p���āA";
		mes "�@�G�Ύ푰�ł���";
		mes "�@���̃T�t�@�������炩�̗��R��";
		mes "�@�����悤�Ƃ����̂��낤���H�]";
		next;
		mes "�]�������Ƃ���ƁA�e����";
		mes "�@�����Ă����u���f�B�E���ł�";
		mes "�@���̃T�t�@����";
		mes "�@�����邱�Ƃ��ł��Ȃ������̂��낤�]";
		next;
		mes "�]������������A";
		mes "�@���̃u���f�B�E����";
		mes "�@��ɓ���邽�߂�";
		mes "�@�ǂ����֍s�����̂�������Ȃ��]";
		next;
		menu "��̂ǂ��ցc�c",-;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		next;
		menu "�T�t�@���̊X�c�c�H",-;
		mes "�]�u���f�B�E����";
		mes "�@�T�t�@���ɂƂ��Ė��B";
		mes "�@����Ȃ�΁A";
		mes "�@�T�t�@���̏Z�ފX�ɂȂ��";
		mes "�@�������񂠂�ɈႢ�Ȃ��]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�T�t�@���̊X�ɍs���A";
		mes "�e���̎肪�����T�����j";
		set YGG_2QUE,10;
		setquest 7060;
		delquest 7059;
		close;
	case 10:
		mes "�]�T�t�@���̊X�ɍs����";
		mes "�@������񂪂��邩������Ȃ��]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�T�t�@���̊X�ɍs���A";
		mes "�e���̎肪�����T�����j";
		close;
	case 21:
		mes "�]�����g�����킩�肻����";
		mes "�@���������čs�����]";
		next;
		switch(select("���̖�","�}�t���[","�Y�{��","�u���f�B�E���̔j��")) {
		case 1:
			mes "�]���̖тł�";
			mes "�@�g���͂킩��Ȃ����낤�]";
			close;
		case 2:
			mes "�]�}�t���[�������čs�����Ƃɂ����B";
			mes "�@���ɂ����������čs�����]";
			next;
			switch(select("���̖�","�Y�{��","�u���f�B�E���̔j��")) {
			case 1:
				mes "�]���̖тł�";
				mes "�@�g���͂킩��Ȃ����낤�]";
				close;
			case 2:
				mes "�]�x���g���j�����Ă���A";
				mes "�@�E���������ɂȂ��B";
				mes "�@�c�c";
				mes "�@���������Y�{���͂�߂Ă������]";
				close;
			case 3:
				break;
			}
			break;
		case 3:
			mes "�]�x���g���j�����Ă���A";
			mes "�@�E���������ɂȂ��B";
			mes "�@�c�c";
			mes "�@���������Y�{���͂�߂Ă������]";
			close;
		case 4:
			mes "�]�u���f�B�E���̔j�Ђ�";
			mes "�@�����čs�����Ƃɂ����B";
			mes "�@���ɂ����������čs�����]";
			next;
			switch(select("���̖�","�}�t���[","�Y�{��")) {
			case 1:
				mes "�]���̖тł�";
				mes "�@�g���͂킩��Ȃ����낤�]";
				close;
			case 2:
				break;
			case 3:
				mes "�]�x���g���j�����Ă���A";
				mes "�@�E���������ɂȂ��B";
				mes "�@�c�c";
				mes "�@���������Y�{���͂�߂Ă������]";
				close;
			}
			break;
		}
		mes "�]�u���e�B�E���̔j�Ђ�";
		mes "�@�}�t���[�������";
		mes "�@�g�����킩�邩������Ȃ��]";
		if(checkitemblank() < 2) {
			next;
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		getitem 6085,1;
		getitem 6084,1;
		set YGG_2QUE,22;
		chgquest 7066,7067;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�X�m�[������";
		mes "�u���e�B�E���̔j�Ђ�";
		mes "�}�t���[�������悤�j";
		close;
	case 22:
		mes "�]�u���e�B�E���̔j�Ђ�";
		mes "�@�}�t���[�������";
		mes "�@�g�����킩�邩������Ȃ��]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�X�m�[������";
		mes "�u���e�B�E���̔j�Ђ�";
		mes "�}�t���[�������悤�j";
		close;
	case 23:
		if(!equippeditem(2782)) {
			mes "["+strcharinfo(0)+"]";
			mes "�i�w�ւ�Y��Ă��܂����B";
			mes "�m�b�̉��̎w�ւ������ė��悤�j";
			close;
		}
		mes "�]�X�m�[�����́A";
		mes "�@�΂̂悤�ɂȂ���";
		mes "�@�T�t�@�������đ���o�����]";
		hideoffnpc "�X�m�[����#ygg";
		next;
		mes "[�X�m�[����]";
		mes "�I�[�Q��!!";
		mes "�ԈႢ�Ȃ��A�I�[�Q�����c�c";
		next;
		mes "[�X�m�[����]";
		mes "�c�c";
		next;
		mes "[�X�m�[����]";
		mes "�N�\�b�c�c!!";
		next;
		menu "�΂ɂȂ�a�C�������܂����H",-;
		mes "[�X�m�[����]";
		mes "�c�c�������B";
		next;
		menu "���H",-;
		mes "[�X�m�[����]";
		mes "�m���ɃI�[�Q����";
		mes "�΂̂悤�ɍd���Ȃ�a�C��";
		mes "�������Ă���c�c";
		next;
		mes "[�X�m�[����]";
		mes "�ł��A�����������c�c";
		mes "��������ł���񂾁B";
		next;
		menu "����ȁI",-;
		mes "[�X�m�[����]";
		mes "����ł������A";
		mes "�a�����̂�I��ł�����";
		mes "�΂ɂȂ����܂����񂾁c�c";
		next;
		mes "[�X�m�[����]";
		mes "�������킢�������񂾂낤�ȁc�c";
		mes "����Ȕ����ꂿ�܂��āc�c";
		next;
		mes "[�X�m�[����]";
		mes "���܂��͓G�ł���e����";
		mes "����ȂɂȂ��Ă܂ŁA";
		mes "��낤�Ƃ����̂��c�c�H";
		next;
		mes "[�X�m�[����]";
		mes "�I�[�Q���c�c";
		next;
		mes "[�X�m�[����]";
		mes "���A�A��ċA�邺�c�c";
		next;
		mes "�]�X�m�[�����́A";
		mes "�@�I�[�Q���̑̂��N�����āA";
		mes "�@���̂܂ܔw���������A";
		mes "�@�d���ő����ӂ�����]";
		next;
		menu "��`���܂��傤���H",-;
		mes "[�X�m�[����]";
		mes "����A�����c�c";
		mes "��ɖ߂��Ă��邺�B";
		next;
		set YGG_2QUE,24;
		chgquest 7068,7069;
		hideonnpc "�X�m�[����#ygg";
		mes "["+strcharinfo(0)+"]";
		mes "�i�T�t�@���̊X�ɖ߂���";
		mes "�X�m�[�����ɉ���j";
		close;
	default:
		if(YGG_2QUE >= 24) {
			mes "�]�I�[�Q���������Ă����ꏊ���]";
			close;
		}
		mes "�]�T�t�@���̋��l���ł܂��Ă���]";
		close;
	}
}

nyd_dun_jp,58,223,0	duplicate(�T�t�@���̐Α�#ygg)	�T�t�@���̐Α�#ygg2	844

nyd_dun01,55,223,5	script	�X�m�[����#ygg	454,{
OnInit:
	hideonnpc;
	end;
}

nyd_dun_jp,58,223,0	duplicate(�X�m�[����#ygg)	�X�m�[����#ygg2	844

nyd_dun01,62,233,0	script	�؂̂�#ygg	844,2,2,{
	mes "�]��̕�������������Ă���B";
	mes "�@��������";
	mes "�@�؂̂邪����Ă��Ă���B";
	mes "�@���̂������";
	mes "�@�n��ɖ߂ꂻ�����]";
	next;
	if(select("���","��߂�") == 2) {
		mes "�]���͂�߂Ă������]";
		close;
	}
	mes "�]����悶�o�����]";
	close2;
	warp "spl_fild01",376,65;
	end;
}

nyd_dun_jp,62,233,0	duplicate(�؂̂�#ygg)	�؂̂�#ygg2	844,2,2

manuk,278,177,5	script	���l#ygg	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���l]";
		mes "�燔?";
		mes "��́ʁ@�� ����!";
		mes "������ ��...�@";
		mes "�恿�� ���@���.";
		close;
	}
	if(YGG_2QUE == 10) {
		mes "�]�T�t�@�����b�������Ă���]";
		next;
		mes "[���l���E�B�l]";
		mes "�����Ȃ̂��A";
		mes "����Ȃ�������^FF0000�ߗ�^000000��";
		mes "�č��ɂ���̂��H";
		mes "�m��Ȃ������ȁB";
		next;
		mes "[���l���r�G��]";
		mes "�����B";
		mes "����߂܂�ɗ���z�Ȃ��";
		mes "���߂Ă��c�c";
		mes "�s�C���Ŏd�����Ȃ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ߗ��H�j";
		next;
		switch(select("��b�ɎQ������","�ق��ĕ���")) {
		case 1:
			mes "[���l���E�B�l]";
			mes "�Ȃ񂾁A���񂽂́H";
			mes "�ʖڂ��A�������͉����m��Ȃ��B";
			next;
			mes "�]���l���x�����Ă���B";
			mes "�@����ȏ��";
			mes "�@�b�𕷂������ɂȂ��B";
			mes "�@�ߗ��Ƃ̓e���̂��Ƃ��낤���H";
			mes "�@���̕ߗ���{���Ă݂悤�]";
			set YGG_2QUE,11;
			chgquest 7060,7061;
			close;
		case 2:
			mes "[���l���r�G��]";
			mes "���̖ړI�ŗ����̂���";
			mes "�킩��Ȃ����A";
			mes "�b�𕷂��ɂ����t�B�l�̌��t��";
			mes "�����ł���z�����͂��Ȃ��ĂȁB";
			next;
			mes "[���l���r�G��]";
			mes "�Ƃ肠����";
			mes "�č��ɕ����߂Ă��邻�����B";
			next;
			mes "[���l���E�B�l]";
			mes "��H";
			mes "���r�G���A�يE�l�����邼�I";
			next;
			mes "[���l���r�G��]";
			mes "�������Ȃ�����!!";
			next;
			mes "[���l���r�G��]";
			mes "�c�c";
			mes "�܂��������낤�A";
			mes "�ǂ����������̌��t��";
			mes "�����ł��Ȃ����낤����ȁB";
			next;
			mes "�]���t�B�l���̒N����";
			mes "�@�č��ɕ����߂��Ă���炵���B";
			mes "�@�e�����낤���H";
			mes "�@�č���T�����]";
			set YGG_2QUE,11;
			chgquest 7060,7061;
			close;
		}
	}
	if(YGG_2QUE == 11) {
		mes "[���l���E�B�l]";
		mes "�c�c";
		next;
		mes "[���l���r�G��]";
		mes "�c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�ߗ�������Ƃ���";
		mes "�č���T���Ă݂悤�j";
		close;
	}
	mes "[���l]";
	mes "���������͖Z�����B";
	close;
}

manuk,281,177,3	duplicate(���l#ygg)	���l#ygg2	449

man_in01,175,59,5	script	�X�m�[����	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�X�m�[����]";
		mes "�燔?";
		mes "��́ʁ@�ȁ@����!";
		mes "������ ��...";
		mes "�恿��@���@���.";
		close;
	}
	switch(YGG_2QUE) {
	case 11:
		mes "�]�T�t�@���̒j���{���Ă���]";
		next;
		mes "[�T�t�@���̒j]";
		mes "������A���̕ߗ���";
		mes "��킹�����!!";
		next;
		menu "���������H",-;
		mes "�]�{���Ă���j��";
		mes "�@���Ȃ��̑��݂ɋC�t��";
		mes "�@�����������]";
		next;
		mes "[�T�t�@���̒j]";
		mes "������!?";
		mes "�يE�l�I";
		mes "���̊Ԃɉ��̔w���!?";
		next;
		if(select("���t�B�l���̕ߗ��ɂ��ĕ���","���̏ꏊ�ɂ��ĕ���") == 2) {
			mes "[�T�t�@���̒j]";
			mes "�����͌��Ă̒ʂ�̊č�����B";
			mes "���������F�l��";
			mes "�����Ɏ��Ă����񂾁B";
			mes "���Ȃ݂ɁA";
			mes "���͎��l����Ȃ�����ȁB";
			close;
		}
		mes "[�T�t�@���̒j]";
		mes "�Ȃ�ŁA���񂽂�";
		mes "���t�B�l���̕ߗ��ɂ���";
		mes "�m���Ă���񂾁H";
		mes "�Ƃ������A���t�������H";
		mes "�ǂ����Ă�!?";
		next;
		mes "�]�m�b�̉��̎w�ւ�������";
		mes "�@���������]";
		next;
		mes "[�T�t�@���̒j]";
		mes "���̎w�ւł����c�c";
		mes "�������Ȃ��A";
		mes "���t�𑀂邱�Ƃ��ł���";
		mes "�w�ւȂ�āB";
		next;
		mes "[�T�t�@���̒j]";
		mes "���������΁A";
		mes "�ŋ߁A���B�̌��t�𑀂�";
		mes "�يE�l�����ꂽ�A����";
		mes "�N���������Ă����C������Ȃ��B";
		next;
		mes "[�T�t�@���̒j]";
		mes "��������������";
		mes "���ȏЉ�Ă������B";
		mes "���̖��O��";
		mes "�X�m�[�������Č����񂾁B";
		next;
		menu "�����",-;
		mes "[�T�t�@���̒j]";
		mes "��낵���ȁB";
		mes "�Ƃ���ŁA";
		mes "���t�B�l���̕ߗ��ɂ���";
		mes "�m�肽���񂾂�H";
		next;
		mes "[�X�m�[����]";
		mes "���͉����Ȃ񂾂�ȁB";
		mes "�ǂ����Ă��A���̕ߗ���";
		mes "�����������Ƃ������ĂȁB";
		next;
		mes "[�X�m�[����]";
		mes "�����A���̊č��̌x������";
		mes "���̕ߗ��ɉ�킹�Ă���Ȃ��񂾂�B";
		next;
		mes "[�X�m�[����]";
		mes "����Ɍx�����������ɂ́A";
		mes "���A�ʖ�ł���z�����Ȃ�����";
		mes "����Ă���b���ł��Ȃ��炵���c�c";
		next;
		mes "[�X�m�[����]";
		mes "�N�\�b�I";
		mes "���̕ߗ���";
		mes "^0000FF�I�[�Q���̎��H^000000�ɂ���";
		mes "�����m���Ă��邩������Ȃ��̂ɁI";
		next;
		menu "�I�[�Q���̎��H�H",-;
		mes "[�X�m�[����]";
		mes "�����A���̗F�l�̃I�[�Q����";
		mes "�s���s���ɂȂ����񂾁B";
		mes "���͂��̃I�[�Q���̍s����";
		mes "���ׂĂ���񂾁B";
		next;
		mes "[�X�m�[����]";
		mes "�I�[�Q����";
		mes "���񂽂�̎푰��";
		mes "�Z��ł���ꏊ���@����A";
		mes "�ƌ����Ă��B";
		next;
		menu "�i�A���R���Ԓn�̂��Ƃ��c�c�j",-;
		mes "[�X�m�[����]";
		mes "�I�[�Q���͂��������";
		mes "�p�������Ȃ��Ȃ����񂾁B";
		next;
		mes "[�X�m�[����]";
		mes "�����āA���ꂩ��2�`3������";
		mes "���̃��t�B�l���̗d����";
		mes "�������Ă����񂾂�ȁB";
		mes "���������Ă��B";
		next;
		mes "[�X�m�[����]";
		mes "�ł���A";
		mes "�I�[�Q�����s���s���ɂȂ��āA";
		mes "���̗d�������������Č��ꂽ�A";
		mes "���Ă����Ƃ��낪";
		mes "�C�ɂȂ�Ȃ����H";
		next;
		mes "[�X�m�[����]";
		mes "���̍l���͂������B";
		mes "���񂽂���@���ɍs����";
		mes "�I�[�Q�����P�����d���������񂾁B";
		mes "���ꂪ���ߗ��ƂȂ��Ă���";
		mes "�d�����B";
		next;
		mes "[�X�m�[����]";
		mes "�����āA�I�[�Q���̎���";
		mes "�u���f�B�E����D������";
		mes "�I�[�Q���̉ƂɔE�э������Ƃ����B";
		next;
		mes "[�X�m�[����]";
		mes "�����A�I�[�Q���Ƃ̐킢��";
		mes "����������̂�����";
		mes "�ӎ��������낤�Ƃ��ĕ߂܂����c�c";
		next;
		menu "�u���f�B�E����D���H",-;
		mes "[�X�m�[����]";
		mes "�����A";
		mes "�u���f�B�E����";
		mes "�T�t�@���ƃ��t�B�l����";
		mes "�o���ɂƂ��ďd�v�ȕ��Ȃ񂾁B";
		next;
		mes "[�X�m�[����]";
		mes "���̐푈�����͂ƌ����΁A";
		mes "�u���f�B�E������邽�߂�";
		mes "�n�܂����炵�����ȁB";
		next;
		menu "�����Ȃ�ł����H",-;
		mes "[�X�m�[����]";
		mes "���͂������������B";
		mes "������A�z�炪�ˑR�����";
		mes "�u���f�B�E���z�R��";
		mes "�}�ɏP���Ă����������B";
		next;
		mes "[�X�m�[����]";
		mes "����ȗ��A�����Ɛ푈��Ԃ���B";
		mes "�b�������A�a�������s��ꂽ�Ȃ��";
		mes "�����͈�x���Ȃ��B";
		next;
		mes "[�X�m�[����]";
		mes "����ɍ��A";
		mes "���̗d���͘S���̒��ŁA";
		mes "������K���ɓ`���悤��";
		mes "���Ă���炵�����A";
		mes "��͂�A�u���f�B�E���Ƃ���";
		mes "�P������x�������Ă��邻�����B";
		next;
		mes "[�X�m�[����]";
		mes "�d���͂Ȃ�ł��D�����Ƃ���";
		mes "�Ƃ�ł��Ȃ��N����������B";
		next;
		mes "�]�m���ɁA���̓��A�̑O��";
		mes "�@�������悤�Ȍ�����";
		mes "�@���Ղ̌`�Ղ��������B";
		mes "�@����́A�I�[�Q���ƃe����";
		mes "�@�������Ղ������̂��낤���H�]";
		next;
		switch(select("�Ȃ�قǁI","�Ⴄ�Ǝv���܂��c�c")) {
		case 1:
			mes "[�X�m�[����]";
			mes "�܂��A�����܂Ő����̈��";
			mes "�o�Ȃ��񂾂��ǂȁB";
			mes "�ǂ��ɂ����āA";
			mes "���̗d���������";
			mes "�����o�������񂾂��c�c";
			break;
		case 2:
			mes "[�X�m�[����]";
			mes "�c�c";
			mes "����Ȃ��Ƃ��������Ă��Ƃ�";
			mes "�������A����肢���l����";
			mes "����񂾂낤�ȁB";
			break;
		}
		next;
		menu "�ߗ��̒ʖ�������Ă�������",-;
		mes "[�X�m�[����]";
		mes "�c�c";
		mes "���񂽂́A";
		mes "���t�B�l���̌��t���킩��̂��H";
		next;
		menu "�͂�",-;
		mes "[�X�m�[����]";
		mes "�{������!";
		mes "����̌��t��������Ȃ��A";
		mes "���t�B�l���̌��t�܂ŕ�����̂�!?";
		next;
		mes "[�X�m�[����]";
		mes "�c�c�悵!!";
		mes "�ʖ������Ȃ�A";
		mes "�ߗ��̗d����";
		mes "��킹�Ă����͂����I";
		next;
		mes "[�X�m�[����]";
		mes "�悵�A�ʖ�𗊂ނ��I";
		mes "���A���C�N���ĂԂ���";
		mes "������Ƃ����҂��Ă����ȁB";
		set YGG_2QUE,12;
		setquest 70425;
		delquest 7061;
		close;
	case 12:
		mes "[�X�m�[����]";
		mes "���C�N!!";
		mes "�����A���C�N!!";
		next;
		mes "[�X�m�[����]";
		mes "�d���̌��t���킩��z��";
		mes "�A��ė�����!!";
		mes "�����A�Ԏ������₪���!!";
		next;
		mes "[�h�A�z�����畷�����鐺]";
		mes "�X�m�[����!!";
		mes "��ς���!!";
		next;
		mes "[�X�m�[����]";
		mes "�ǂ������A���C�N!?";
		next;
		mes "[���C�N]";
		mes "�ߗ��̃��t�B�l���|�ꂽ��!!";
		mes "�N�������Ƃ��Ă��ӎ����߂�Ȃ�!!";
		mes "�ǂ�������̂�����";
		mes "�̗͂����E�݂����Ȃ񂾁I";
		next;
		mes "[���C�N]";
		mes "���ł��������玡�Ö��";
		mes "�����Ă��Ă���!!";
		next;
		mes "[�X�m�[����]";
		mes "�|�ꂽ!?";
		mes "���Č���������";
		mes "�������ă��t�B�l�̖�Ȃ��";
		mes "�m��ˁ[��!!";
		next;
		mes "[�X�m�[����]";
		mes strcharinfo(0)+"�I";
		mes "���񂽂͒m���Ă��邩!?";
		next;
		menu "�m��܂��񂪑{���Ă݂܂��I",-;
		mes "[�X�m�[����]";
		mes strcharinfo(0)+"!!";
		mes "������!!";
		mes "���񂾂��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[�N�ɕ����Ă݂悤�B";
		mes "������񂪓�����͂����j";
		set YGG_2QUE,13;
		setquest 7062;
		delquest 70425;
		close;
	case 13:
	case 14:
	case 15:
	case 16:
		mes "[�X�m�[����]";
		mes strcharinfo(0)+"!!";
		mes "�������t�B�l�̗d����";
		mes "������������ė��Ă���I";
		close;
	case 17:
		if(countitem(607) < 6) {
			mes "[�X�m�[����]";
			mes "��A�����Ă������H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�C�O�h���V���̎���6�K�v���j";
			next;
			mes "[�X�m�[����]";
			mes "���������Ă��Ă���I";
			close;
		}
		mes "[�X�m�[����]";
		mes "�悵�A";
		mes "��������Ă����悤���ȁB";
		mes "���̕ςȎ�����ɂȂ�̂��B";
		mes "���ꂪ�{���Ɏ����̗͂�����̂��H";
		mes "�܂������A���̖�͗a�����Ă����B";
		delitem 607,6;
		set YGG_2QUE,18;
		setquest 70435;
		delquest 7064;
		next;
		mes "[�X�m�[����]";
		mes "���A���ɓ��낤���B";
		close;
	case 21:
		mes "[�X�m�[����]";
		mes "�I�[�Q���c�c";
		mes "�I�[�Q���Ȃ̂��H";
		close;
	case 23:
		mes "[�X�m�[����]";
		mes "��Ɍ������Ă���B";
		mes "���̓u���f�B�E���������ɍs���Ă���";
		mes "�����Ɍ��ǂ�����B";
		close;
	case 24:
		mes "[�X�m�[����]";
		mes "�悤�A�߂��Ă����ȁB";
		next;
		mes "[�X�m�[����]";
		mes "���C�N����`�����B";
		mes "�e������������������B";
		next;
		mes "[�X�m�[����]";
		mes "�{���͉���Ȃǂł��Ȃ��񂾂��A";
		mes "���C�N��������������";
		mes "����������炵���B";
		next;
		mes "[�X�m�[����]";
		mes "�c�c";
		next;
		mes "[�X�m�[����]";
		mes "�I�[�Q���A";
		mes "�Ȃ�Ń��t�B�l��";
		mes "����Ď��񂾂񂾁c�c�H";
		next;
		mes "[�X�m�[����]";
		mes "�c�c";
		next;
		mes "[�X�m�[����]";
		mes "�������������킩��ˁ[���ǁc�c";
		mes "�����̓��t�B�l���A�e�����A";
		mes "���ׂ��҂Ɣ��f�����񂾂낤�ȁc�c";
		next;
		mes "[�X�m�[����]";
		mes "����ŁA����������";
		mes "���ʂ����񂾂낤�c�c";
		next;
		mes "[�X�m�[����]";
		mes strcharinfo(0)+ "�A";
		mes "�����A�܂������S��������";
		mes "�ł��Ȃ��Ăȁc�c";
		mes "��l�ɂ����Ă���B";
		next;
		mes "[�X�m�[����]";
		mes "�c�c";
		mes "�F�X�Ƃ��肪�ƂȁB";
		mes "�I�[�Q�������������̂�";
		mes "���񂽂̂��������B";
		mes "����͗炾�B";
		mes "�󂯎���Ă���B";
		if(checkitemblank() == 0) {
			next;
			mes "[�X�m�[����]";
			mes "����A���񂽁B";
			mes "�ו�������������";
			mes "����̕i��n���Ȃ����B";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�܂��b�������Ă���B";
			close;
		}
		getitem 6080,15;
		set YGG_2QUE,25;
		chgquest 7069,7070;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�e���͖����ɉ�����ꂽ�B";
		mes "�A�[�N�ɉ�ɍs�����j";
		close;
	default:
		if(YGG_2QUE >= 25) {
			mes "[�X�m�[����]";
			mes "�I�[�Q����";
			mes "���̃e����������̂��A�Ȃ��";
			mes "�����ǂ��ł��������B";
			next;
			mes "[�X�m�[����]";
			mes "������";
			mes "�����̎��ׂ��҂����ʂ��A";
			mes "���ĐM�O���т��ʂ��A";
			mes "�Ō�܂Ŏ��ʂ����B";
			next;
			mes "[�X�m�[����]";
			mes "���͂������ւ�Ɏv���c�c";
			close;
		}
		else if(YGG_2QUE >= 18) {
			mes "[�X�m�[����]";
			mes "���C�N�ɂ͋���������Ă���B";
			mes "���֓��낤�B";
			close;
		}
		else {
			mes "[�X�m�[����]";
			mes "�����͗����֎~�Ȃ͂����B";
			mes "���߂ɏo�čs�����ق��������B";
			close;
		}
	}
}

man_in01,183,58,0	script	to_yggin	45,1,1,{
	if(YGG_2QUE >= 18 && YGG_2QUE <= 23) {
		warp "man_in01",13,125;
		end;
	}
	else if(YGG_2QUE >= 24) {
		warp "man_in01",68,125;
		end;
	}
	mes "�]�����������Ă���]";
	close;
}

man_in01,10,125,0	script	to_yggout1	45,1,1,{
	if(YGG_2QUE == 21 || YGG_2QUE == 23) {
		mes "�]���A�֌������܂����H�]";
		next;
		switch(select("������","������Ȃ�")) {
		case 1:
			mes "�]���A�֌��������]";
			close2;
			warp "spl_fild01",369,109;
			end;
		case 2:
			mes "�]���̂܂ܕ������o���]";
			close2;
			warp "man_in01",179,58;
			end;
		}
	}
	warp "man_in01",179,58;
	end;
}

man_in01,65,125,0	warp	to_yggout2	1,1,man_in01,179,58

man_in01,22,126,3	script	���t�B�l��	441,{
	if(!equippeditem(2782)) {
		if(YGG_2QUE <= 18) {
			mes "�]�ӎ����Ȃ��悤��";
			mes "�@�̒��̕�т��ɁX�����]";
			close;
		}
		mes "[���C�N]";
		mes "�΁偾?�@�́@����?";
		mes "���� �� ?";
		mes "���..?";
		next;
		mes "[���䂵�����t�B�l��]";
		mes "...Riveh...AshIman";
		mes "Or�@mah...";
		mes "..ah..Thor..ThorOsa";
		mes "Yee�@Lu..ung...";
		close;
	}
	switch(YGG_2QUE) {
	case 19:
		mes "�]�C�O�h���V���̎���";
		mes "�@���C�N�A�X�m�[�����̊ŕa��";
		mes "�@���t�B�l���̈ӎ����߂����悤���]";
		next;
		mes "[���䂵�����t�B�l��]";
		mes "������c�c";
		next;
		mes "[���C�N]";
		mes "�C���t�����悤���ˁB";
		mes "�����ň������ǁA";
		mes "�����͘b���ł���l��A��Ă����B";
		mes "���낢��b���Ăق����񂾁B";
		next;
		mes "[���䂵�����t�B�l��]";
		mes "�����͂ǂ��c�c�H";
		mes "�������I";
		mes "�u���f�B�E�����K�v�Ȃ񂾁I";
		mes "������������o���Ă��������I";
		next;
		mes "[���䂵�����t�B�l��]";
		mes "�������Ȃ��Ɣނ�����ł��܂��I";
		next;
		set .@menu,select("�ށH","�e���ł���ˁH");
		do {
			switch(.@menu) {
			case 1:
				set .@menu2,.@menu2|1;
				mes "[���䂵�����t�B�l��]";
				mes "���A�ŁA�T�t�@���̋��l��";
				mes "���̂��Ƃ������X�^�[����";
				mes "����Ă��ꂽ��ł��B";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "�����X�^�[�������ɂЂ�����";
				mes "�������𓦂����āc�c";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "���A��������A����̂�����";
				mes "�C�������Ă��܂��āc�c";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "�����āA�C������";
				mes "���̏ꏊ�ɖ߂�ƁA";
				mes "�����Ă��ꂽ���l��";
				mes "�΂̂悤�Ɍł܂��Ă��āA";
				mes "�܂�Ŏ��҂̂悤��";
				mes "�₽���Ȃ��Ă�����ł��c�c";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "���l�͓G�ł����c�c";
				mes "�ł��A���������Ă��ꂽ";
				mes "���̐l������������ł��B";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "���l�ɂ͐΂̂悤�Ɍ����Ȃ�";
				mes "�a�C���������";
				mes "���������Ƃ����邩��c�c";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "�a�C���������߂�";
				mes "�u���f�B�E�����W�߂Ȃ�����c�c";
				next;
				menu "������A���̊X�ɁH",-;
				mes "[���䂵�����t�B�l��]";
				mes "�͂��c�c";
				mes "���̎����Ă���";
				mes "�u���f�B�E����������";
				mes "����Ȃ�������ł��c�c";
				next;
				mes "[���䂵�����t�B�l��]";
				mes "������A�T�t�@���̋��l�B��";
				mes "�u���f�B�E����";
				mes "�����Ă��炨����";
				mes "���̊X�ɗ�����ł��c�c";
				if(.@menu2 & 0x3)
					break;
				next;
				menu "�e���ł���ˁH",-;
			case 2:
				set .@menu2,.@menu2|2;
				mes "[�e��]";
				mes "�����I";
				mes "�ǂ����Ď��̖��O���H";
				next;
				mes "�]�e���ɁA";
				mes "�@�A�[�N����e����{���悤��";
				mes "�@���܂�Ă��邱�Ƃ�`�����]";
				next;
				mes "[�e��]";
				mes "�����c�c�I";
				mes "�A�[�N���c�c";
				next;
				mes "[�e��]";
				mes "�S�z�����Ă��߂�ˁc�c";
				next;
				mes "[�e��]";
				mes "�ł��A���c�c";
				mes "���̋��l�������Ȃ�����";
				mes "�����Ȃ���ł�!!";
				if(.@menu2 & 0x3)
					break;
				next;
				set .@menu,1;
				continue;
			}
			break;
		} while(1);
		next;
		mes "[�e��]";
		mes "���A�������ȁc�c����c";
		mes "�c�c";
		next;
		mes "�]�e���͉��䂪";
		mes "�@�܂������Ă��Ȃ��̂�";
		mes "�@�C�������Ă��܂����]";
		next;
		mes "[���C�N]";
		mes "�C�������Ă��܂������c�c";
		mes "�啪�������Ă����݂������ȁB";
		mes "���v�A�S�z����Ȃ���B";
		next;
		mes "[���C�N]";
		mes "�G�Ƃ����ǁA�����Ă���";
		mes "�҂������߂�����͂��Ȃ��B";
		set YGG_2QUE,20;
		setquest 70440;
		delquest 7065;
		close;
	case 20:
		mes "[�X�m�[����]";
		mes "�c�c";
		mes "�I�[�Q���Ȃ̂��H";
		mes "���A�œ|��Ă���A";
		mes "�e�����������z�́c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���C�N�ɘb�������悤�j";
		close;
	default:
		mes "[���C�N]";
		mes "�܂��̂��������Ă��Ȃ�����";
		mes "���̂܂܂ɂ��Ă����Ă����悤�B";
		close;
	}
}

man_in01,17,128,5	script	�X�m�[����	454,{
	if(!equippeditem(2782)) {
		mes "[�X�m�[����]";
		mes "�ʁ��...";
		mes "���懓 �� ";
		mes "�灼~!";
		mes "�ʁ���.. �� �ځ���...!";
		close;
	}
	switch(YGG_2QUE) {
	case 18:
		mes "�]���Ȃ��ƃX�m�[�����B�́A";
		mes "�@�C�O�h���V���̎����g�p����";
		mes "�@���t�B�l�����Ō삵���]";
		next;
		mes "�]�����Ԍ�]";
		next;
		mes "[���t�B�l��]";
		mes "������c�c";
		mes "����A���́c�c";
		next;
		mes "�]���t�B�l���͖ڂ��o�܂����]";
		next;
		mes "[�X�m�[����]";
		mes "�悵�c�c";
		mes "�ǂ��Ȃ����݂������ȁB";
		next;
		mes "[�X�m�[����]";
		mes "�d���ɘb�𕷂��Ă݂Ă����B";
		set YGG_2QUE,19;
		setquest 7065;
		delquest 70435;
		close;
	case 19:
		mes "[�X�m�[����]";
		mes "�d���ɘb�𕷂��Ă݂Ă����B";
		close;
	case 20:
		mes "[�X�m�[����]";
		mes "�d���͉��Č����Ă����񂾁H";
		mes "�����Ă����B";
		close;
	case 21:
		mes "[�X�m�[����]";
		mes "�I�[�Q���Ȃ̂��c�c";
		mes "�����m�؂��~�����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�X�m�[�����́A";
		mes "���A�ɓ|��Ă���T�t�@����";
		mes "�I�[�Q���ł��邩�S�z���Ă���B";
		mes "���A�ɂ���T�t�@���̌��֍s���A";
		mes "���������i�������Ă��悤�j";
		close;
	case 22:
		mes "[�X�m�[����]";
		mes "�ǂ������񂾁H";
		next;
		menu "���A�ɂ����T�t�@���̕���������",-;
		mes "[�X�m�[����]";
		mes "���̃u���f�B�E���̔j�Ђ�";
		mes "�T�t�@�������H�������̂���Ȃ��ȁc�c";
		mes "���t�B�l�̗d���̕����H";
		next;
		mes "[�X�m�[����]";
		mes "��A���̃}�t���[�́c�c�H";
		next;
		mes "[�X�m�[����]";
		mes "����̓I�[�Q���̕����I";
		mes "�ԈႢ�Ȃ�!!";
		next;
		mes "[�X�m�[����]";
		mes "����𓴌A�Ō������̂��H";
		mes "�������̏ꏊ�ɘA��čs���Ă���!";
		next;
		menu "�킩��܂����I",-;
		mes "[�X�m�[����]";
		mes "�I�[�Q���c�c!!";
		set YGG_2QUE,23;
		delitem 6085,1;
		delitem 6084,1;
		chgquest 7067,7068;
		close;
	case 23:
		mes "[�X�m�[����]";
		mes "���񂽂̌�����Ă�������";
		mes "�������A�̃I�[�Q���̌���";
		mes "�s���Ă���I";
		close;
	default:
		mes "[�X�m�[����]";
		mes "�c�c";
		close;
	}
}

man_in01,19,126,3	script	���C�N	450,{
	if(!equippeditem(2782)) {
		mes "[���C�N]";
		mes "�������@?~!�@�ȁ�";
		mes "?��?�@��.�@";
		mes "���?";
		close;
	}
	switch(YGG_2QUE) {
	case 20:
		mes "[���C�N]";
		mes "���̗d���͉��Č����Ă����񂾁H";
		next;
		mes "�]�e�����畷�����b��S�Ęb�����]";
		next;
		mes "[���C�N]";
		mes "�T�t�@���������邽�߂ɁH";
		mes "�ǂ����Ă��̃e���Ƃ����q��";
		mes "���̎푰��";
		mes "�����悤�Ƃ��Ă���񂾁H";
		next;
		mes "[���C�N]";
		mes "����c�c";
		next;
		mes "[���C�N]";
		mes "��������";
		mes "���́A���̃T�t�@���̒j��";
		mes "�e�����������񂾁H";
		mes "�G�ł��郉�t�B�l�����B";
		next;
		menu "���Ȃ��B���e����������",-;
		mes "[���C�N]";
		mes "�c�c";
		mes "�����X�m�[������";
		mes "����R�̎҂��U������悤��";
		mes "���Ƃ͂��Ȃ��B";
		next;
		mes "[���C�N]";
		mes "���t�B�l����";
		mes "�ⓚ���p�̎c�s�Ȏ푰��";
		mes "�����C���[�W�������Ăȁc�c";
		mes "�T�t�@����������Ȃ��";
		mes "�M�����Ȃ��̂��B";
		next;
		mes "[�X�m�[����]";
		mes "�c�c";
		mes "�e�����������j��";
		mes "�{���ɃI�[�Q���Ȃ̂��c�c�H";
		next;
		mes "[�X�m�[����]";
		mes "�I�[�Q���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̓��A�ɂ���";
		mes "�΂̂悤�ȃT�t�@������";
		mes "�����g�����킩�镨��";
		mes "�����Ă��悤�j";
		set YGG_2QUE,21;
		setquest 7066;
		delquest 70440;
		close;
	case 21:
		mes "[���C�N]";
		mes "�������A���̃T�t�@���̒j�A";
		mes "�b���炷��Ɓc�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̓��A�ɂ���";
		mes "�Ή������T�t�@������";
		mes "�����g�����킩�镨��";
		mes "�����Ă��悤�j";
		close;
	case 22:
		mes "[�X�m�[����]";
		mes "�ǂ������񂾁H";
		next;
		menu "���A�ɂ����T�t�@���̕���������",-;
		mes "[�X�m�[����]";
		mes "���̃u���f�B�E���̔j�Ђ�";
		mes "�T�t�@�������H�������̂���Ȃ��ȁc�c";
		mes "���t�B�l�̗d���̕����H";
		next;
		mes "[�X�m�[����]";
		mes "��A���̃}�t���[�́c�c�H";
		next;
		mes "[�X�m�[����]";
		mes "����̓I�[�Q���̕����I";
		mes "�ԈႢ�Ȃ�!!";
		next;
		mes "[�X�m�[����]";
		mes "����𓴌A�Ō������̂��H";
		mes "�������̏ꏊ�ɘA��čs���Ă���!";
		next;
		menu "�킩��܂����I",-;
		mes "[�X�m�[����]";
		mes "�I�[�Q���c�c!!";
		set YGG_2QUE,23;
		delitem 6085,1;
		delitem 6084,1;
		chgquest 7067,7068;
		close;
	case 23:
		mes "[���C�N]";
		mes "�I�[�Q���͗D���������j�������c�c";
		close;
	default:
		mes "[���C�N]";
		mes "�c�c";
		close;
	}
}

man_in01,71,125,0	script	�e���������ꏊ	139,3,3,{
	mes "�]�e���͉�����ꂽ�]";
	close;
}

spl_in02,239,93,3	script	�e��	441,{
	if(!equippeditem(2782)) {
		mes "[�e��]";
		mes "ModBurDana...?";
		mes "Mu�@AnduWehFus";
		mes "Yee�@OsaLoLars...";
		mes "eoFusser....";
		mes "maurNohser�@Ur......";
		mes "ThorNuffLars�@So�@";
		close;
	}
	if(YGG_2QUE == 26) {
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���Ă��ꂽ�ˁB";
		next;
		mes "[�e��]";
		mes strcharinfo(0)+ "�A";
		mes "�����Ă���Ė{����";
		mes "���肪�Ƃ��������܂��B";
		next;
		menu "����͂������v�ł����H",-;
		mes "[�e��]";
		mes "�͂��B";
		mes "�����Ƃ͂����܂��񂪁A";
		mes "�啪�ǂ��Ȃ�܂����B";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "����̂��ƁA";
		mes "�e������ڂ����������񂾁B";
		mes "�b�́A�����炵���B";
		next;
		mes "[�A�[�N]";
		mes "�e���́A�N�B�l�Ԃ̊�n��";
		mes "���ɍs�����炵���񂾁B";
		mes "�����ŁA�T�t�@���̋��l���������B";
		next;
		mes "[�A�[�N]";
		mes "�e���͂��̋��l����s�����B";
		mes "�������A�r���������Ă��܂��A";
		mes "�������ܐ킢���n�܂����B";
		next;
		mes "[�A�[�N]";
		mes "�{���Ɍ������킢�������炵���B";
		next;
		mes "[�A�[�N]";
		mes "�������l�߂悤�Ƃ��鋐�l�A";
		mes "������ۂƂ��Ƃ���e���B";
		mes "���|�I�ȋ��l�̍U�������킵�A";
		mes "�e������������c�c";
		next;
		mes "[�A�[�N]";
		mes "�݂��ɔ�J���~�ς��Ă������낤���ǁA";
		mes "����ł��Ȃ��A��������";
		mes "��i��ނ̍U�h���������B";
		next;
		mes "[�A�[�N]";
		mes "�e���͏����������Ȃ��������A";
		mes "�̗͂̌��E���K��Ă��܂����B";
		next;
		mes "[�A�[�N]";
		mes "����A���l��";
		mes "�܂��]�T������悤�������B";
		mes "�e���͍Ō�̗͂�U��i��";
		mes "���l�ɒ��݂��������B";
		next;
		mes "[�A�[�N]";
		mes "�������Ռ��Ńe���Ƌ��l��";
		mes "�C�O�h���V���̍��̕���";
		mes "������񂾁B";
		next;
		mes "[�A�[�N]";
		mes "�����āA��l��";
		mes "�C�O�h���V���̍��ɂ�����";
		mes "���m�̓��A�ɗ����Ă��܂����񂾁B";
		next;
		mes "[�A�[�N]";
		mes "��u�̐Î�̒��A";
		mes "�e���Ƌ��l�͎�������n����";
		mes "���A�̒��œ�l�́A���|�I�Ȑ���";
		mes "�����X�^�[�Ɉ͂܂�Ă����B";
		next;
		mes "[�e��]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "�����ŋ��l��";
		mes "�����ׂ��s�����Ƃ����񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���l�̓e����������񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���ꂩ��A��l��";
		mes "�K���Ƀ����X�^�[�Ɛ�����������B";
		mes "���l���킢�A";
		mes "�e�����T�|�[�g����B";
		next;
		mes "[�A�[�N]";
		mes "���̋��l�͍Ō�̍Ō�܂�";
		mes "�e���̂��Ƃ���������A";
		mes "�c�c";
		mes "�������A�₪�Ď�肫��Ȃ��Ȃ�A";
		mes "�e�������𓦂������B";
		next;
		mes "[�A�[�N]";
		mes "������r���A�e����";
		mes "�����X�^�[����̍U����";
		mes "���Ȃ�̏����󂯂Ă��܂����B";
		next;
		mes "[�A�[�N]";
		mes "���������邱�Ƃɐ���������";
		mes "���̏�ňӎ����������B";
		next;
		mes "[�A�[�N]";
		mes "�e���́A�ӎ������߂��Ă���A";
		mes "�߂��Ă݂�Ƌ��l�͐΂̂悤��";
		mes "�ł܂��Ă����炵���񂾁B";
		mes "������e���́A���̋��l��";
		mes "�����悤�Ƃ����c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�܂��A����Ȋ����������炵���B";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "���̑O�ɑ���䂵�Č��ꂽ�̂́A";
		mes "���̋��l�������悤�Ƃ���";
		mes "�u���f�B�E����T����";
		mes "�����Ƃ��낾�����񂾂ȁB";
		next;
		menu "�����������Ƃ�������ł���",-;
		mes "[�A�[�N]";
		mes "�܂������c�c";
		mes "�e���͖������������c�c!!";
		next;
		mes "[�A�[�N]";
		mes "�b���画�f�����";
		mes "�ۈ���C�������Ă����񂾂��I";
		mes "������������";
		mes "���̂܂܎���ł����̂���";
		mes "����Ȃ��񂾂��I";
		next;
		mes "[�e��]";
		mes "���߂�A�S�z��������ˁc�c";
		mes "�ł��A���͂ǂ����Ă�";
		mes "�����Ă��ꂽ���l�����������āc�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�e��]";
		mes "���̋��l�A�D���������c�c";
		mes "����Ă���������c�c";
		mes "�������킩�����́c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c�e���B";
		next;
		mes "[�e��]";
		mes "�킩���Ă��c�c";
		mes "���l�͓G������ˁc�c";
		mes "����Ȃ킯�Ȃ��c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c������B";
		mes "���̑O�ł͑��v�B";
		mes "�v�������Ƃ������΂�����B";
		mes "�����ǁA�݂�Ȃ̑O�ł�";
		mes "��΂Ɍ����ȁB";
		next;
		mes "[�e��]";
		mes "�A�[�N�c�c";
		mes "���肪�Ƃ��B";
		next;
		mes "[�e��]";
		mes strcharinfo(0)+ "�c�c";
		next;
		mes "[�e��]";
		mes "���̋��l�A";
		mes "����������ł���ˁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		mes "�i�����ɂ����ׂ����낤���c�c�j";
		next;
		if(select("�c�O�Ȃ��瑧�₦�Ă���","����������") == 1) {
			mes "�]���Ȃ��������o�����Ƃ���ƁA";
			mes "�@�A�[�N�̔ߒɂ̊炪���E�ɓ������B";
			mes "�@�A�[�N�̓I�[�Q�����ǂ��Ȃ����̂�";
			mes "�@�@���Ă���悤���]";
			next;
			mes "�]�I�[�Q���̎����e���ɓ`����ƁA";
			mes "�@�e���̐S�ɏ������A�������̂�";
			mes "�@���S�������邩������Ȃ��B";
			mes "�@���Ȃ��͂����v�����]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c";
			next;
			menu "����������",-;
		}
		mes "[�e��]";
		mes "�悩����!!";
		mes "����������ł��ˁB";
		next;
		mes "[�e��]";
		mes "�c�c";
		next;
		mes "[�e��]";
		mes "���̐l�̖��O�������Ă���܂��񂩁H";
		mes "��������͂Ȃ��ł��傤���c�c";
		next;
		menu "�I�[�Q��",-;
		mes "[�e��]";
		mes "�I�[�Q���c�c";
		next;
		mes "[�e��]";
		mes "�����A�I�[�Q���ɉ���Ƃ���������A";
		mes "����������Ă��������B";
		mes "���ƁA���Ȃ��̂�������";
		mes "�����������������Ă��Ƃ�";
		mes "�`���Ă��������B";
		next;
		menu "�킩��܂���",-;
		mes "[�e��]";
		mes "���肢���܂��B";
		next;
		mes "[�A�[�N]";
		mes "���Ⴀ�A�e���͂����x�݂ȁB";
		mes strcharinfo(0)+ "�A";
		mes "���낻��s�������B";
		mes "���܂蒷�������";
		mes "�e������ꂿ�Ⴄ���낤����B";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "�e���������Ă����";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "����͂��炾��A";
		mes "�󂯎���Ăق����񂾁B";
		if(checkitemblank() < 2) {
			next;
			mes "[�A�[�N]";
			mes "��H";
			mes "�ו�������������";
			mes "����̕i��n���Ȃ����B";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�܂��b�������Ă���B";
			close;
		}
		if(checkre())
			getexp 240000,20000;
		else
			getexp 2400000,200000;
		set YGG_2QUE,27;
		getitem 6081,50;
		getitem 6080,35;
		setquest 200890;
		delquest 7071;
		next;
		mes "[�A�[�N]";
		mes "�ꉞ�A�������Ă�����";
		mes "�X�v�����f�B�b�h�R�C����";
		mes "���t�B�l���̒ʉ݂��B";
		mes "������ӂ̃����X�^�[��ގ�����̂�";
		mes "�֗��ȃA�C�e���ƌ����ł��邺�B";
		next;
		mes "[�A�[�N]";
		mes "�}�k�N�R�C����";
		mes "�T�t�@���̒ʉ݂��B";
		mes "�G�̕ߗ������������������A";
		mes strcharinfo(0)+ "�ɂ�";
		mes "���ɗ����Ƃ����邩������Ȃ��B";
		mes "�n���Ă�����B";
		close;
	}
	mes "[�e��]";
	mes strcharinfo(0)+ "�A";
	mes "���ł��V�тɗ��Ă��������B";
	mes "���Ȃ��͐M�p�ł���l������B";
	close;
}

spl_in02,236,92,5	script	�A�[�N	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�A�[�N]";
		mes "HirWosWeh.�@Yee�@DiebVilFar";
		mes " U manTalVil.";
		mes "LarsNeiser...??";
		mes "VeldTiTal�@Ko";
		mes "SharDurYur Di ?";
		close;
	}
	if(YGG_2QUE == 26) {
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "���Ă��ꂽ�ˁB";
		next;
		mes "[�e��]";
		mes strcharinfo(0)+ "�A";
		mes "�����Ă���Ė{����";
		mes "���肪�Ƃ��������܂��B";
		next;
		menu "����͂������v�ł����H",-;
		mes "[�e��]";
		mes "�͂��B";
		mes "�����Ƃ͂����܂��񂪁A";
		mes "�啪�ǂ��Ȃ�܂����B";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "����̂��ƁA";
		mes "�e������ڂ����������񂾁B";
		mes "�b�́A�����炵���B";
		next;
		mes "[�A�[�N]";
		mes "�e���́A�N�B�l�Ԃ̊�n��";
		mes "���ɍs�����炵���񂾁B";
		mes "�����ŁA�T�t�@���̋��l���������B";
		next;
		mes "[�A�[�N]";
		mes "�e���͂��̋��l����s�����B";
		mes "�������A�r���������Ă��܂��A";
		mes "�������ܐ킢���n�܂����B";
		next;
		mes "[�A�[�N]";
		mes "�{���Ɍ������킢�������炵���B";
		next;
		mes "[�A�[�N]";
		mes "�������l�߂悤�Ƃ��鋐�l�A";
		mes "������ۂƂ��Ƃ���e���B";
		mes "���|�I�ȋ��l�̍U�������킵�A";
		mes "�e������������c�c";
		next;
		mes "[�A�[�N]";
		mes "�݂��ɔ�J���~�ς��Ă������낤���ǁA";
		mes "����ł��Ȃ��A��������";
		mes "��i��ނ̍U�h���������B";
		next;
		mes "[�A�[�N]";
		mes "�e���͏����������Ȃ��������A";
		mes "�̗͂̌��E���K��Ă��܂����B";
		next;
		mes "[�A�[�N]";
		mes "����A���l��";
		mes "�܂��]�T������悤�������B";
		mes "�e���͍Ō�̗͂�U��i��";
		mes "���l�ɒ��݂��������B";
		next;
		mes "[�A�[�N]";
		mes "�������Ռ��Ńe���Ƌ��l��";
		mes "�C�O�h���V���̍��̕���";
		mes "������񂾁B";
		next;
		mes "[�A�[�N]";
		mes "�����āA��l��";
		mes "�C�O�h���V���̍��ɂ�����";
		mes "���m�̓��A�ɗ����Ă��܂����񂾁B";
		next;
		mes "[�A�[�N]";
		mes "��u�̐Î�̒��A";
		mes "�e���Ƌ��l�͎�������n����";
		mes "���A�̒��œ�l�́A���|�I�Ȑ���";
		mes "�����X�^�[�Ɉ͂܂�Ă����B";
		next;
		mes "[�e��]";
		mes "�c�c";
		next;
		mes "[�A�[�N]";
		mes "�����ŋ��l��";
		mes "�����ׂ��s�����Ƃ����񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���l�̓e����������񂾁B";
		next;
		mes "[�A�[�N]";
		mes "���ꂩ��A��l��";
		mes "�K���Ƀ����X�^�[�Ɛ�����������B";
		mes "���l���킢�A";
		mes "�e�����T�|�[�g����B";
		next;
		mes "[�A�[�N]";
		mes "���̋��l�͍Ō�̍Ō�܂�";
		mes "�e���̂��Ƃ���������A";
		mes "�c�c";
		mes "�������A�₪�Ď�肫��Ȃ��Ȃ�A";
		mes "�e�������𓦂������B";
		next;
		mes "[�A�[�N]";
		mes "������r���A�e����";
		mes "�����X�^�[����̍U����";
		mes "���Ȃ�̏����󂯂Ă��܂����B";
		next;
		mes "[�A�[�N]";
		mes "���������邱�Ƃɐ���������";
		mes "���̏�ňӎ����������B";
		next;
		mes "[�A�[�N]";
		mes "�e���́A�ӎ������߂��Ă���A";
		mes "�߂��Ă݂�Ƌ��l�͐΂̂悤��";
		mes "�ł܂��Ă����炵���񂾁B";
		mes "������e���́A���̋��l��";
		mes "�����悤�Ƃ����c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "�܂��A����Ȋ����������炵���B";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		mes "���̑O�ɑ���䂵�Č��ꂽ�̂́A";
		mes "���̋��l�������悤�Ƃ���";
		mes "�u���f�B�E����T����";
		mes "�����Ƃ��낾�����񂾂ȁB";
		next;
		menu "�����������Ƃ�������ł���",-;
		mes "[�A�[�N]";
		mes "�܂������c�c";
		mes "�e���͖������������c�c!!";
		next;
		mes "[�A�[�N]";
		mes "�b���画�f�����";
		mes "�ۈ���C�������Ă����񂾂��I";
		mes "������������";
		mes "���̂܂܎���ł����̂���";
		mes "����Ȃ��񂾂��I";
		next;
		mes "[�e��]";
		mes "���߂�A�S�z��������ˁc�c";
		mes "�ł��A���͂ǂ����Ă�";
		mes "�����Ă��ꂽ���l�����������āc�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c";
		next;
		mes "[�e��]";
		mes "���̋��l�A�D���������c�c";
		mes "����Ă���������c�c";
		mes "�������킩�����́c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c�e���B";
		next;
		mes "[�e��]";
		mes "�킩���Ă��c�c";
		mes "���l�͓G������ˁc�c";
		mes "����Ȃ킯�Ȃ��c�c";
		next;
		mes "[�A�[�N]";
		mes "�c�c������B";
		mes "���̑O�ł͑��v�B";
		mes "�v�������Ƃ������΂�����B";
		mes "�����ǁA�݂�Ȃ̑O�ł�";
		mes "��΂Ɍ����ȁB";
		next;
		mes "[�e��]";
		mes "�A�[�N�c�c";
		mes "���肪�Ƃ��B";
		next;
		mes "[�e��]";
		mes strcharinfo(0)+ "�c�c";
		next;
		mes "[�e��]";
		mes "���̋��l�A";
		mes "����������ł���ˁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		mes "�i�����ɂ����ׂ����낤���c�c�j";
		next;
		if(select("�c�O�Ȃ��瑧�₦�Ă���","����������") == 1) {
			mes "�]���Ȃ��������o�����Ƃ���ƁA";
			mes "�@�A�[�N�̔ߒɂ̊炪���E�ɓ������B";
			mes "�@�A�[�N�̓I�[�Q�����ǂ��Ȃ����̂�";
			mes "�@�@���Ă���悤���]";
			next;
			mes "�]�I�[�Q���̎����e���ɓ`����ƁA";
			mes "�@�e���̐S�ɏ������A�������̂�";
			mes "�@���S�������邩������Ȃ��B";
			mes "�@���Ȃ��͂����v�����]";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c";
			next;
			menu "����������",-;
		}
		mes "[�e��]";
		mes "�悩����!!";
		mes "����������ł��ˁB";
		next;
		mes "[�e��]";
		mes "�c�c";
		next;
		mes "[�e��]";
		mes "���̐l�̖��O�������Ă���܂��񂩁H";
		mes "��������͂Ȃ��ł��傤���c�c";
		next;
		menu "�I�[�Q��",-;
		mes "[�e��]";
		mes "�I�[�Q���c�c";
		next;
		mes "[�e��]";
		mes "�����A�I�[�Q���ɉ���Ƃ���������A";
		mes "����������Ă��������B";
		mes "���ƁA���Ȃ��̂�������";
		mes "�����������������Ă��Ƃ�";
		mes "�`���Ă��������B";
		next;
		menu "�킩��܂���",-;
		mes "[�e��]";
		mes "���肢���܂��B";
		next;
		mes "[�A�[�N]";
		mes "���Ⴀ�A�e���͂����x�݂ȁB";
		mes strcharinfo(0)+ "�A";
		mes "���낻��s�������B";
		mes "���܂蒷�������";
		mes "�e������ꂿ�Ⴄ���낤����B";
		next;
		mes "[�A�[�N]";
		mes strcharinfo(0)+ "�A";
		mes "�e���������Ă����";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "����͂��炾��A";
		mes "�󂯎���Ăق����񂾁B";
		if(checkitemblank() < 2) {
			next;
			mes "[�A�[�N]";
			mes "��H";
			mes "�ו�������������";
			mes "����̕i��n���Ȃ����B";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�܂��b�������Ă���B";
			close;
		}
		if(checkre())
			getexp 240000,20000;
		else
			getexp 2400000,200000;
		set YGG_2QUE,27;
		getitem 6081,50;
		getitem 6080,35;
		setquest 200890;
		delquest 7071;
		next;
		mes "[�A�[�N]";
		mes "�ꉞ�A�������Ă�����";
		mes "�X�v�����f�B�b�h�R�C����";
		mes "���t�B�l���̒ʉ݂��B";
		mes "������ӂ̃����X�^�[��ގ�����̂�";
		mes "�֗��ȃA�C�e���ƌ����ł��邺�B";
		next;
		mes "[�A�[�N]";
		mes "�}�k�N�R�C����";
		mes "�T�t�@���̒ʉ݂��B";
		mes "�G�̕ߗ������������������A";
		mes strcharinfo(0)+ "�ɂ�";
		mes "���ɗ����Ƃ����邩������Ȃ��B";
		mes "�n���Ă�����B";
		close;
	}
	mes "[�A�[�N]";
	mes "�e���������Ŗ{���ɂ悩�����c�c";
	close;
}

splendide,287,140,0	script	terrashome_in	45,1,1,{
	if(YGG_2QUE < 26) {
		mes "�]�����������Ă���]";
		close;
	}
	warp "spl_in02",237,89;
	end;
}

spl_in02,236,86,0	warp	terrashome_out	1,1,splendide,285,139

spl_fild01,357,44,0	script	�t����	844,{
	mes "�]�t���ς���ʂɎU��΂��Ă���]";
	if(YGG_2QUE == 14) {
		next;
		mes "�]�悭����ƁA";
		mes "�@�C�O�h���V���̎���";
		mes "�@�}�X�e���̎��������Ă���]";
		next;
		if(checkitemblank() < 2) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		set YGG_2QUE,15;
		setquest 70430;
		delquest 7063;
		getitem 607,1;
		getitem 522,1;
		mes "�]���Ȃ���";
		mes "�@�C�O�h���V���̎�1��";
		mes "�@�}�X�e���̎�1���E�����B";
		mes "�@���̏ꏊ���T�����]";
		close2;
		warp "spl_fild01",311,77;
		end;
	}
	if(YGG_2QUE == 15) {
		next;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		if(select("������","�������Ȃ�") == 2) {
			mes "�]����}�����]";
			close;
		}
		set .@apple,rand(1,100);
		if(.@apple < 50) {
			mes "�]��Ɍ��ɂ��͂���B";
			mes "�@峂Ɏh���ꂽ�悤���c�c�]";
			percentheal -30,0;
			close;
		} else if(.@apple == 50) {
			mes "�]�����S���������B";
			mes "�@�c�O�Ȃ���A�����ɂ�";
			mes "�@�債�����͂Ȃ��������c�c�]";
			getitem 512,1;
			close;
		} else {
			mes "�]����������Ȃ������]";
			close;
		}
	}
	close;
}

spl_fild01,312,79,0	script	�t����	844,{
	mes "�]�t���ς���ʂɎU��΂��Ă���]";
	if(YGG_2QUE == 15) {
		next;
		mes "�]�悭����ƁA";
		mes "�@�C�O�h���V���̎���";
		mes "�@�}�X�e���̎��������Ă���]";
		next;
		if(checkitemblank() < 2) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		set YGG_2QUE,16;
		setquest 70431;
		delquest 70430;
		getitem 607,1;
		getitem 522,1;
		mes "�]���Ȃ���";
		mes "�@�C�O�h���V���̎�1��";
		mes "�@�}�X�e���̎�1���E�����]";
		mes "�@���̏ꏊ���T�����]";
		close2;
		warp "spl_fild01",328,26;
		//warp "spl_fild01",328,27;
		end;
	}
	if(YGG_2QUE == 16) {
		next;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		if(select("������","�������Ȃ�") == 2) {
			mes "�]����}�����]";
			close;
		}
		set .@apple,rand(1,100);
		if(.@apple < 50) {
			mes "�]��Ɍ��ɂ��͂���B";
			mes "�@峂Ɏh���ꂽ�悤���c�c�]";
			percentheal -30,0;
			close;
		} else if(.@apple == 50) {
			mes "�]�����S���������B";
			mes "�@�c�O�Ȃ���A�����ɂ�";
			mes "�@�債�����͂Ȃ��������c�c�]";
			getitem 512,1;
			close;
		} else {
			mes "�]����������Ȃ������]";
			close;
		}
	}
	close;
}

spl_fild01,329,29,0	script	�t����	844,{
	mes "�]�t���ς���ʂɎU��΂��Ă���]";
	if(YGG_2QUE == 16) {
		next;
		mes "�]�悭����ƁA";
		mes "�@�C�O�h���V���̎���";
		mes "�@�}�X�e���̎��������Ă���]";
		next;
		if(checkitemblank() < 2) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		set YGG_2QUE,17;
		setquest 7064;
		delquest 70431;
		getitem 607,1;
		getitem 522,1;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�C�O�h���V���̎������v3�E�����B";
		mes "���̒n��ł́A";
		mes "����ȏ�́A�C�O�h���V���̎���";
		mes "��ɓ��肻���ɂȂ��j";
		close;
	}
	if(YGG_2QUE == 17) {
		next;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		if(checkweight(607,2) == 0) {
			mes "�]�A�C�e���̏d�ʂ�������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@�d�ʂ����炵�Ă���E�����]";
			close;
		}
		if(select("������","�������Ȃ�") == 2) {
			mes "�]����}�����]";
			close;
		}
		set .@apple,rand(1,100);
		if(.@apple < 50) {
			mes "�]��Ɍ��ɂ��͂���B";
			mes "�@峂Ɏh���ꂽ�悤���c�c�]";
			percentheal -30,0;
			close;
		} else if(.@apple == 50) {
			mes "�]�����S���������B";
			mes "�@�c�O�Ȃ���A�����ɂ�";
			mes "�@�債�����͂Ȃ��������c�c�]";
			getitem 512,1;
			close;
		} else {
			mes "�]����������Ȃ������]";
			close;
		}
	}
	close;
}

//============================================================
// �َ푰�̒����N�G�X�g
//- Registry -------------------------------------------------
// YGG_3QUE -> 0�`9
//------------------------------------------------------------
mid_camp,283,198,5	script	�o�[�b�g	883,{
	if(YGG_1QUE < 100) {
		mes "[�����ɖv�����Ă���j]";
		mes "����͋����[���b���ȁB";
		mes "�c�c";
		mes "�����A�����p�m�[�g�ɏ����Ȃ��ẮI";
		emotion 5;
		next;
		mes "�V���J�V���J�c�c";
		mes "�J���J���c�c";
		next;
		mes "�]�j�͖����ɂȂ��Č������Ă���]";
		close;
	}
	switch(YGG_3QUE) {
	case 0:
		if(!equippeditem(2782)) {
			mes "[�����ɖv�����Ă���j]";
			mes "TalDathMush�@Di�@nahDeh";
			mes "ReAnduDu�@So�@sehr";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�H";
			mes "�́H";
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "�����A����͎���B";
			mes "����̌����ɖv�����Ă��Ă��c�c";
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "���́A�A�b�V��.�o�L���[���ɏZ��";
			mes "�d���Ƌ��l�̌��������Ă���񂾁B";
			mes "�������A���t���ʂ����A";
			mes "�������v���悤�ɐi�܂Ȃ��c�c";
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "�N���A^0000FF�ނ�̌���𗝉��ł���l^000000��";
			mes "���Ȃ����낤���c�c";
			close;
		}
		mes "[�����ɖv�����Ă���j]";
		mes "����͋����[���b���ȁB";
		mes "�c�c";
		mes "�����A�����p�m�[�g�ɏ����Ȃ��ẮI";
		emotion 5;
		next;
		mes "�]�j�͂��Ȃ��̑��݂ɋC�t������";
		mes "�@�����ɖv�����Ă���]";
		next;
		mes "�V���J�V���J�c�c";
		mes "�J���J���c�c";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�c�c��H";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�����!!";
		mes "�ǁA�ǂȂ��ł���!?";
		mes "�����炻����!!";
		emotion 23;
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�c�c";
		mes "���A���͌������Ă���񂾁B";
		mes "�������ǁA�p���Ȃ����";
		mes "�ז����Ȃ��ŗ~�����B";
		next;
		mes "�]���Ȃ��́A";
		mes "�@�����̎ז����������Ƃ��ӂ�A";
		mes "�@�������낤�Ƃ����]";
		emotion 19,"";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "������Ƒ҂���!!";
		next;
		mes "�]�j�͓ˑR���Ȃ��̎������A";
		mes "�@�������ڂ����ɂݎn�߂��]";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "���A����́I";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "^0000FF�m�b�̉��̎w��^000000��!!";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�N�͂��̗d���Ƌ��l��";
		mes "�b�����Ƃ��ł���񂾂ˁI";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�Ȃ�Ă��Ƃ��I";
		mes "��������`���Ă����l��";
		mes "�T�����Ƃ����u�ԁA";
		mes "�ڂ̑O�Ɍ����Ȃ�āI";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�������I";
		mes "����͉^���I�Ȃ��̂������邼�I";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "�����Ɖ^���̐_�l��";
		mes "�l�̌��������܂������悤��";
		mes "���Ȃ������̂Ƃ����";
		mes "�����Ă��ꂽ��!!";
		next;
		switch(select("�����Ȃ�ł�","���������Ă�������")) {
		case 1:
			mes "[�����ɖv�����Ă���j]";
			mes "�^���̐l�I";
			mes "���Ȃ��͎��̓V�g����!!";
			mes "�{���ɂ��肪�Ƃ�!!";
			mes "�@";
			mes "�]�j�͂��Ȃ���������߂��]";
			emotion 21;
			emotion 23,"";
			break;
		case 2:
			mes "[�����ɖv�����Ă���j]";
			mes "�����A���߂񂲂߂�c�c";
			mes "�ł��A�{���Ɋ������Ă��I";
			mes "����Ȃ��Ƃ��Ă���񂾂ˁI";
			break;
		}
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "����A���̌����̘b��";
		mes "�����Ă���Ȃ������H";
		mes "�N�Ɏ�`���ė~�����񂾁I";
		next;
		switch(select("�ǂ�Ȍ����ł����H","�����ł���","�܂����̋@���")) {
		case 1:
			mes "[�����ɖv�����Ă���j]";
			mes "���́A�A�b�V���E�o�L���[����";
			mes "�m�I�����́A���Ȃ킿";
			mes "���̒��Ԓn�̓��Ɛ��̒n��ɏZ��";
			mes "�d���Ƌ��l�̌��������Ă���񂾁B";
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "�ނ��";
			mes "�����A�@���A�Z�p�A�����c�c";
			mes "�����炩�ɂ��Ă����񂾁B";
			next;
			if(select("����͖ʔ������ł���","�܂��̋@���") == 2) {
				mes "[�����ɖv�����Ă���j]";
				mes "�c�c";
				mes "����Ȃ��c�c";
				emotion 28;
				next;
				mes "[�����ɖv�����Ă���j]";
				mes "�ł��I";
				mes "�����������Ă����炢�ł�";
				mes "���ė~�����I";
				mes "���͂����Ƃ����ő҂��Ă��邩��I";
				set YGG_3QUE,1;
				close;
			}
			// fall through
		case 2:
			mes "[�����ɖv�����Ă���j]";
			mes "���肪�Ƃ��A";
			mes "���������Ă�����";
			mes "�M���Ă�����I";
			mes "�N�Ȃ炱�̌����̑f���炵����";
			mes "�킩����āI";
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "���ȏЉ���Ă��炤�ˁB";
			mes "���́A";
			mes "^0000FF�o�[�b�g�E�e�B�[�u���b�N^000000�B";
			mes "���̃A�b�V���E�o�L���[����";
			mes "�m�I�����̂Ɋւ��錤����";
			mes "�S�����Ă���B";
			next;
			menu "���ȏЉ��",-;
			mes "[�o�[�b�g]";
			mes strcharinfo(0)+ "���B";
			mes "���ꂩ���낵�����ނ�I";
			next;
			menu "������`���΂�����ł����H",-;
			mes "[�o�[�b�g]";
			mes "�d���Ƌ��l�̕����␶����";
			mes "�������ė~�����񂾁B";
			next;
			mes "[�o�[�b�g]";
			mes "����́A�ނ�̌��t��";
			mes "�����ł���l�ɂ������߂Ȃ��񂾁B";
			mes "���̒m�b�̉��̎w�ւ�";
			mes "�܂��l�̂悤�Ȉ�ʌ����҂ɂ�";
			mes "�x������Ă��Ȃ����炳�B";
			next;
			mes "[�o�[�b�g]";
			mes "�������A��������`���Ă��炤�Ȃ�";
			mes "�N�ɒ����񍐗p��";
			mes "�m�[�g��n���Ȃ��ƂȁB";
			next;
			mes "[�o�[�b�g]";
			mes "������ƃm�[�g�������Ă��邩��";
			mes "�����҂��ĂāB";
			set YGG_3QUE,2;
			setquest 11101;
			delquest 70366;
			close;
		case 3:
			mes "[�����ɖv�����Ă���j]";
			mes "�c�c";
			mes "����Ȃ��c�c";
			emotion 28;
			next;
			mes "[�����ɖv�����Ă���j]";
			mes "�ł��I";
			mes "�����������Ă����炢�ł�";
			mes "���ė~�����I";
			mes "���͂����Ƃ����ő҂��Ă��邩��I";
			set YGG_3QUE,1;
			close;
		}
	case 1:
		mes "[�o�[�b�g]";
		mes "�����A�܂����Ă��ꂽ�ˁB";
		mes "�����ɋ����������Ă��ꂽ���ȁH";
		next;
		if(select("�͂����I�������������ł��I","�S���Ȃ��ł�") == 2) {
			mes "[�����ɖv�����Ă���j]";
			mes "�c�c";
			mes "�������c�c";
			mes "�ł��A���͒��߂Ȃ���B";
			emotion 28;
			close;
		}
		mes "[�����ɖv�����Ă���j]";
		mes "���肪�Ƃ��A";
		mes "���������Ă�����";
		mes "�M���Ă�����I";
		mes "�N�Ȃ炱�̌����̑f���炵����";
		mes "�킩����āI";
		next;
		mes "[�����ɖv�����Ă���j]";
		mes "���ȏЉ���Ă��炤�ˁB";
		mes "���́A";
		mes "^0000FF�o�[�b�g�E�e�B�[�u���b�N^000000�B";
		mes "���̃A�b�V���E�o�L���[����";
		mes "�m�I�����̂Ɋւ��錤����";
		mes "�S�����Ă���B";
		next;
		menu "���ȏЉ��",-;
		mes "[�o�[�b�g]";
		mes strcharinfo(0)+ "���B";
		mes "���ꂩ���낵�����ނ�I";
		next;
		menu "������`���΂�����ł����H",-;
		mes "[�o�[�b�g]";
		mes "�܂��A���l���Z�ފX�ɍs���A";
		mes "�ނ�̕����␶����";
		mes "�������ė~�����񂾁B";
		next;
		mes "[�o�[�b�g]";
		mes "����́A�ނ�̌��t��";
		mes "�����ł���l�ɂ������߂Ȃ��񂾁B";
		mes "�N�����Ă���Ė{���ɏ������B";
		next;
		mes "[�o�[�b�g]";
		mes "�������A��������`���Ă��炤�Ȃ�";
		mes "�N�ɒ����񍐗p��";
		mes "�m�[�g��n���Ȃ��ƂȁB";
		next;
		mes "[�o�[�b�g]";
		mes "������ƃm�[�g�������Ă��邩��";
		mes "�����҂��ĂāB";
		set YGG_3QUE,2;
		setquest 11101;
		delquest 70366;
		close;
	case 2:
		mes "[�o�[�b�g]";
		mes "�c�c";
		mes "�������������A";
		mes "�����p�m�[�g�B";
		next;
		mes "�]�o�[�b�g�̓m�[�g�������A";
		mes "�@���Ȃ��̌��ɖ߂��ė����]";
		next;
		mes "[�o�[�b�g]";
		mes strcharinfo(0)+ "�A";
		mes "���҂����B";
		mes "�ł́A���������𗊂������ȁB";
		next;
		mes "[�o�[�b�g]";
		mes "���̒n���^0000FF���l���Z�ފX^000000��";
		mes "����炵���񂾁B";
		next;
		mes "[�o�[�b�g]";
		mes "���̋��l�̊X�ɍs���āA";
		mes "�ނ�̕�����K����";
		mes "���̖ڂŒ��ڌ��ė��āA";
		mes "���̌����p�m�[�g��";
		mes "�L�ڂ��Ă���Ȃ����ȁB";
		next;
		mes "[�o�[�b�g]";
		mes "���ɔނ�̍l������";
		mes "�����I�ȓ�����m�肽���񂾁B";
		mes "�����U�����������āA";
		mes "�푈���D�ނ悤�Ȗ����ł�������";
		mes "���B���x�����Ȃ��Ƃ����Ȃ�����ˁB";
		next;
		mes "[�o�[�b�g]";
		mes "�������A���l�B�ƐڐG����ɂ��Ă�";
		mes "���A���x�̂���ׂ����̉�b����";
		mes "������ӂ͌������Ȃ��Ǝv���񂾁B";
		next;
		mes "[�o�[�b�g]";
		mes "������A���l�������Ă�����";
		mes "�����Ă������肵�āA";
		mes "�M����[�߂��肷��Ƃ����Ǝv���B";
		mes "��������΁A";
		mes "�{����������񂶂�Ȃ����ȁB";
		next;
		mes "[�o�[�b�g]";
		mes "�ł́A���̌����p�m�[�g��";
		mes "�󂯎���āB";
		mes "����ɋL�ڂ��ĂˁB";
		if(checkitemblank() == 0) {
			next;
			mes "[�o�[�b�g]";
			mes "����H";
			mes "�ו��������ς��̂悤��";
			mes "�n���Ȃ���B";
			next;
			mes "[�o�[�b�g]";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�b�������Ă���Ȃ����ȁB";
			close;
		}
		getitem 6074,1;
		set YGG_3QUE,3;
		chgquest 11101,11102;
		close;
	case 3:
	case 4:
	case 7:
	case 8:
		mes "[�o�[�b�g]";
		mes "�ǂ������A";
		mes "�����͐i��ł��邩�ȁH";
		next;
		mes "[�o�[�b�g]";
		mes "���l�̊X�ɍs�����̂��";
		mes "���\�ȃ����X�^�[�������炵������";
		mes "�����͂��Ȃ��悤�ɂˁB";
		close;
	case 5:
	case 9:
		mes "[�o�[�b�g]";
		mes "����������";
		mes "�������I������̂����H";
		next;
		if(select("�͂�","�܂��ł�") == 2) {
			mes "[�o�[�b�g]";
			mes "���܂薳���͂��Ȃ��łˁB";
			close;
		}
		mes "�]���Ȃ��́A�o�[�b�g��";
		mes "�@�����p�m�[�g��n�����]";
		next;
		mes "[�o�[�b�g]";
		mes "����!!";
		mes "�����A�q�������Ă��炤�ˁI";
		next;
		mes "�]�o�[�b�g��";
		mes "�@�����p�m�[�g��ǂݎn�߂��]";
		next;
		mes "[�o�[�b�g]";
		mes "�Ȃ�قǁc�c";
		next;
		mes "[�o�[�b�g]";
		mes "�ӂނӂށc�c";
		next;
		mes "[�o�[�b�g]";
		mes "����͂Ȃ��Ȃ�";
		mes "�����[�����e���c�c";
		next;
		mes "[�o�[�b�g]";
		mes strcharinfo(0)+ "�A";
		mes "���肪�Ƃ��I";
		mes "�ƂĂ��Q�l�ɂȂ�M�d��";
		mes "���e��������I";
		next;
		mes "[�o�[�b�g]";
		mes "�N���M�����񂩂畷�������Ԙb����";
		mes "�ނ�̐����X�^�C����l��������";
		mes "�ǂݎ����B";
		next;
		mes "[�o�[�b�g]";
		mes "��������`���Ă������";
		mes "���肪�Ƃ��I";
		next;
		mes "[�o�[�b�g]";
		mes "�F�X�Ɣ�ꂽ�ł��傤�H";
		mes "�������x��Ŕ����Ƃ��ĂˁB";
		next;
		mes "[�o�[�b�g]";
		mes "�����悩�����疾�������āA";
		mes "��������`���Ă���Ȃ����ȁB";
		mes "���̌����ɂ�";
		mes strcharinfo(0)+ "�����";
		mes "�͂��K�v�Ȃ񂾂�B";
		next;
		mes "[�o�[�b�g]";
		mes "���A����Ɓc�c";
		mes "������󂯎���ė~�����񂾁B";
		mes "�����̂��߂Ɏ�ɓ��ꂽ��������";
		mes "��`���Ă����������ɂ������B";
		if(checkitemblank() == 0) {
			next;
			mes "[�o�[�b�g]";
			mes "���͂����";
			mes strcharinfo(0)+ "�����";
			mes "�n���������������ł����A";
			mes "�ו��������ς��̂悤��";
			mes "�n���܂���B";
			next;
			mes "[�o�[�b�g]";
			mes "����A�n�������̂�";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�b�������Ă��������B";
			close;
		}
		delitem 6074,1;
		getitem 6080,1;
		set YGG_3QUE,6;
		setquest 11104;
		delquest 70651;
		close;
	case 6:
		mes "[�o�[�b�g]";
		mes strcharinfo(0)+ "����A";
		mes "���͂Ƃꂽ���ȁH";
		next;
		mes "[�o�[�b�g]";
		mes "�悩������A�܂�������";
		mes "��`���Ă��炢�����񂾂��ǁB";
		next;
		menu "�����ł���",-;
		mes "[�o�[�b�g]";
		mes "���肪�Ƃ��B";
		mes "�܂��A���l�̒�����";
		mes "���肢�������񂾁B";
		mes "�ł���΁A�܂��M�����񂩂�";
		mes "�b�𕷂��ė~�����B";
		next;
		mes "[�o�[�b�g]";
		mes "�M�������";
		mes "�V�����B������Ă���񂾂�ˁB";
		mes "�܂��A�B������`����";
		mes "�F�X�Ƙb���Ă����Ǝv���񂾁B";
		next;
		mes "[�o�[�b�g]";
		mes "�M������̏��͋M�d�Ȃ񂾂�B";
		mes "��ς��낤���Ǘ��񂾂�B";
		mes "�@";
		mes "�͂��A";
		mes "�����p�m�[�g��n���ˁB";
		if(checkitemblank() == 0) {
			next;
			mes "[�o�[�b�g]";
			mes "����H";
			mes "�ו��������ς��̂悤��";
			mes "�n���Ȃ���B";
			next;
			mes "[�o�[�b�g]";
			mes "�ו��̎�ސ������炵�Ă���";
			mes "�b�������Ă���Ȃ����ȁB";
			close;
		}
		getitem 6074,1;
		set YGG_3QUE,7;
		setquest 70655;
		delquest 11104;
		close;
	}
}

manuk,193,135,0	script	�M��	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�M��]";
		mes "���恼";
		mes "��?�� ���@��";
		mes "��ځ�@�ȁ@�ځ·��@��";
		next;
		mes "[�M��]";
		mes "��ʁ�";
		mes "������@�́@��";
		mes "�́��";
		next;
		mes "�]���������Ă���̂�";
		mes "�@�S��������Ȃ��]";
		close;
	}
	switch(YGG_3QUE) {
	case 3:
		mes "[�H��]";
		mes "�ށA�����!?";
		emotion 23;
		next;
		mes "[�H��]";
		mes "���`�ށA";
		mes "���̂܂ܕ��u���Ƃ��Ɗ�Ȃ��Ȃ��B";
		mes "�����������Ȃ��Ɓc�c";
		next;
		mes "[�H��]";
		mes "�ǂ��������̂��c�c";
		next;
		mes "�]���l�������Ă���悤���B";
		mes "�@���Ȃ��́A�o�[�b�g�ɗ��܂ꂽ";
		mes "�@���l�����̂��߂ɂ�";
		mes "�@�E�C���o���Ęb�������Ă݂��]";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�H��]";
		mes "����H";
		mes "���Ȃ��́c�c";
		next;
		mes "�]���l�͋����Ă���悤���]";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�H��]";
		mes "����A����͎���B";
		mes "���Ȃ�����X�̌��t��";
		mes "�����ɘb�����̂ŋ������̂ł��B";
		mes "���₠�A�����ł��Ȃ��B";
		next;
		menu "����������ł����H",-;
		mes "[�H��]";
		mes "�����B";
		mes "���̓V���̓B���Â��Ȃ���";
		mes "���ɂ���ꂻ���Ȃ̂ł��B";
		next;
		mes "[�H��]";
		mes "���̂܂܁A�����Ă�����";
		mes "���̓B�͐܂�Ă��܂��A";
		mes "�₪�Ă��̓V����";
		mes "�|��Ă��܂��ł��傤�c�c";
		next;
		mes "[�H��]";
		mes "���������ƂɁA";
		mes "����͓V���𒣂��Ă���";
		mes "�B�S�ĂɌ����鎖�Ȃ̂ł��B";
		next;
		mes "[�H��]";
		mes "���Ȃ�̂ɍ��ꂽ�B�ŁA";
		mes "���̓����̋Z�p�ō��ꂽ���̂Ȃ̂�";
		mes "�ϋv�����Ⴂ�̂ł��B";
		next;
		mes "[�H��]";
		mes "���`�ށA�ޗ����W�߂�";
		mes "�V�����B����邵���Ȃ����c�c";
		next;
		menu "��`���܂��傤���H",-;
		mes "[�H��]";
		mes "���Ȃ��͗D�����l�ł��ˁB";
		mes "�����ǁA�C���������ŏ\���ł��B";
		mes "���Ζʂ̂��Ȃ���";
		mes "���f�����������͂���܂���B";
		next;
		menu "�������킸�ɐ���",-;
		mes "[�H��]";
		mes "���₢��A";
		mes "�{���Ɍ��\�ł���B";
		next;
		menu "�������Ȃ���",-;
		mes "[�H��]";
		mes "�C�����͊������ł���";
		mes "�{���ɑ��v�ł��̂ŁB";
		next;
		mes "�]^FF0000�p�L�b!!^000000�]";
		next;
		mes "�]��l�ŉ����ⓚ�����Ă��鉡��";
		mes "�@�B���^����Ɋ��ꂽ�]";
		next;
		mes "[�H��]";
		mes "������!!";
		emotion 28;
		emotion 28,"";
		next;
		mes "�]���l�͓B�������Ȃ��悤��";
		mes "�@��ŉ��������]";
		next;
		mes "[�H��]";
		mes "�c�c";
		mes "���͂≓�����Ă�";
		mes "�ꍇ����Ȃ��ł��ˁB";
		mes "���͂��Ă�����Ă����ł����ȁH";
		next;
		menu "�͂�",-;
		mes "[�H��]";
		mes "���肪�Ƃ��������܂��B";
		mes "����^0000FF�M��^000000�Ɛ\���܂��B";
		next;
		menu "�����",-;
		mes "[�M��]";
		mes strcharinfo(0)+ "����";
		mes "�ł��ˁB";
		next;
		mes "[�M��]";
		mes "���Ζʂł��肢����̂�";
		mes "�S�ꂵ���ł����A";
		mes "^0000FF�q���X���I���̊p��30��^000000";
		mes "�����ė��Ă��炦�Ȃ��ł��傤���H";
		mes "^0000FF�q���X���I��^000000�ƌ��������X�^�[����";
		mes "��ɓ���鎖���ł��܂��B";
		next;
		mes "[�M��]";
		mes "���ꂳ������΁A";
		mes "�܂�邱�Ƃ̂Ȃ�";
		mes "�����ȓB����邱�Ƃ��ł��܂��B";
		next;
		mes "[�M��]";
		mes "�ꏏ�Ƀq���X���I���̊p��";
		mes "�W�߂����̂ł���";
		mes "���͂��̓V�����|��Ȃ���";
		mes "���Ă��Ȃ��Ă͂����܂���B";
		mes "�\����Ȃ��ł���";
		mes "��낵�����肢���܂��B";
		set YGG_3QUE,4;
		setquest 11105;
		delquest 11102;
		close;
	case 4:
	case 8:
		if(countitem(6032) < 30) {
			mes "[�M��]";
			mes "^0000FF�q���X���I���̊p��30��^000000";
			mes "�����ė��Ă��炦�Ȃ��ł��傤���H";
			mes "^0000FF�q���X���I��^000000�ƌ��������X�^�[����";
			mes "��ɓ���鎖���ł��܂��B";
			next;
			mes "[�M��]";
			mes "���ꂳ������΁A";
			mes "�܂�邱�Ƃ̂Ȃ�";
			mes "�����ȓB����邱�Ƃ��ł��܂��B";
			close;
		}
		mes "[�M��]";
		mes "�q���X���I���̊p��";
		mes "�����Ă��Ă���܂������I";
		next;
		mes "[�M��]";
		mes "���肪�Ƃ��������܂��I";
		mes "����ŐV�����B��";
		mes "��邱�Ƃ��ł��܂��B";
		next;
		mes "[�M��]";
		mes strcharinfo(0)+ "����";
		mes "�ɂ͊��ӂ̋C������";
		mes "�����ς��ł���B";
		next;
		mes "[�M��]";
		mes "�c�c";
		mes "�悩������A";
		mes "�����b�ł����܂��񂩁H";
		next;
		mes "[�M��]";
		mes "���Ȃ��Ǝ��͈Ⴄ�푰�Ȃ̂�";
		mes "�݂��ɒm��Ȃ����Ƃ�";
		mes "�����ł��傤�B";
		mes "�݂��ɖʔ����b��";
		mes "������Ǝv���܂��B";
		next;
		menu "����",-;
		mes "�]�M���Ɛ��Ԙb�������]";
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c";
		next;
		mes "[�M��]";
		mes "���b�n�b�n�B";
		mes "�ʔ����b�����肪�Ƃ��B";
		mes "�l�ԂƂ͖ʔ����푰�ł��ȁB";
		next;
		mes "[�M��]";
		mes "�����b������ł��܂��܂����ˁB";
		mes "���ĂƁA���낻��";
		mes "���̓q���X���I���̊p��";
		mes "�B�ł����Ƃ��܂��傤�B";
		next;
		delitem 6032,30;
		if(YGG_3QUE == 4)
			set YGG_3QUE,5;
		else if(YGG_3QUE == 8)
			set YGG_3QUE,9;
		delquest 11105;
		setquest 70651;
		mes "�]���Ȃ��́A";
		mes "�@�M�����畷�����b��";
		mes "�@�����p�m�[�g�ɏ������񂾁]";
		next;
		mes "[�M��]";
		mes "�悩������܂���`���Ă��������B";
		mes "���͂��ꂩ��A";
		mes "�S�Ă̌Â��B����蒼���܂��B";
		mes "���Ȃ��̗͂𐥔�؂肽���ł��B";
		next;
		mes "[�M��]";
		mes "����ł͎��炵�܂��B";
		close;
	case 5:
	case 9:
		mes "[�M��]";
		mes "�悩������܂���`���Ă��������B";
		mes "���͂��ꂩ��A";
		mes "�S�Ă̌Â��B����蒼���܂��B";
		mes "���Ȃ��̗͂𐥔�؂肽���ł��B";
		close;
	case 7:
		mes "[�M��]";
		mes "�ǂ����A";
		mes strcharinfo(0)+ "����B";
		mes "��`���ɗ��Ă��ꂽ��ł����H";
		next;
		menu "�͂�",-;
		mes "[�M��]";
		mes "���肪�Ƃ��������܂��I";
		mes "�{���ɏ�����܂��B";
		next;
		mes "[�M��]";
		mes "����ł́A";
		mes "^0000FF�q���X���I���̊p��30��^000000";
		mes "�����ė��Ă��炦�Ȃ��ł��傤���H";
		mes "^0000FF�q���X���I��^000000�ƌ��������X�^�[����";
		mes "��ɓ���鎖���ł��܂��B";
		next;
		mes "[�M��]";
		mes "���ꂳ������΁A";
		mes "�܂�邱�Ƃ̂Ȃ�";
		mes "�����ȓB����邱�Ƃ��ł��܂��B";
		set YGG_3QUE,8;
		setquest 11105;
		delquest 70655;
		close;
	default:
		mes "[�M��]";
		mes "���`�ށA";
		mes "���̂܂ܕ��u���Ƃ��Ɗ�Ȃ��Ȃ��B";
		mes "�����������Ȃ��Ɓc�c";
		close;
	}
}

manuk,251,180,5	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "��́ȁ@���@��΁�";
		mes "�ځ@����@���@�偽�@��";
		close;
	}
	mes "[�N]";
	mes "���̑O�A���񂽂Ɠ����푰�̓z�炪";
	mes "���l�������ɗ��Ă������B";
	mes "���񂽂�A";
	mes "�~�b�h�K���h�Ƃ�����";
	mes "�ꏊ���痈���炵���ȁB";
	close;
}

man_in01,360,137,5	script	�C����	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�C����]";
		mes "���ȁ��@���@��聿�@��";
		mes "�������@���@�́����@��";
		close;
	}
	mes "[�C����]";
	mes "�����͗�������֎~�ł��B";
	mes "�댯�ł����痣��Ă��������B";
	close;
}

man_in01,68,187,0	script	�{���K������	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�{���K������]";
		mes "�䁼���@���@���";
		mes "�����@��@����";
		next;
		mes "[�{���K������]";
		mes "�΁�?�@�́@������";
		mes "���@�䁿���@�́@��́@��";
		close;
	}
	mes "[�{���K������]";
	mes "�ӂށA�����j�I�C������ȁB";
	mes "�Ђ�����Ԃ��͍̂����ȁH";
	next;
	mes "[�{���K������]";
	mes "���`��A���܂������B";
	mes "����ς�";
	mes "�n�[�h���b�N�}�����X�X�e�[�L��";
	mes "�ō����ȁB";
	next;
	mes "[�{���K������]";
	mes "�悵�A�M��p�ӂ���!!";
	close;
}

man_in01,76,184,3	script	�����l	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�����l]";
		mes "�΁�?�@�΁@���偾�@���@��";
		close;
	}
	mes "[�����l]";
	mes "�������M��S�����Ƃ���";
	mes "�����Ă��܂����c�c";
	next;
	mes "[�����l]";
	mes "�{���K�������A";
	mes "��������������!!";
	close;
}

man_in01,227,280,5	script	�Ȋw��	449,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�Ȋw��]";
		mes "�́災�@���@���ځ�";
		mes "�ȁ@���ʁ@���@���@��";
		close;
	}
	mes "[�Ȋw��]";
	mes "��X�������c����@��";
	mes "���ꂵ���Ȃ��̂��낤���c�c";
	close;
}

splendide,121,259,3	script	�d��	436,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�d��]";
		mes "VaFuloDor An ";
		mes "WosNuffremu Ha TurAshTi";
		mes "VilTiRini O ";
		close;
	}
	mes "[�d��]";
	mes "�ӂ��������c�c";
	mes "���������Ȃ��Ă���������c�c";
	mes "���сA�H�׉߂���������݂����B";
	close;
}

splendide,163,264,3	script	�d��	438,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�d��]";
		mes "UorVeLars No Ador";
		next;
		mes "[�d��]";
		mes "SeGothShar An AshDur";
		close;
	}
	mes "[�d��]";
	mes "������������";
	mes "�����W���W�����Ă���̂�I";
	next;
	mes "[�d��]";
	mes "�ӂ�c�c";
	mes "�ł����Ɍ������Ȃ��";
	mes "�Z���X����������Ȃ��B";
	mes "������A�D���Ȃ���������Ȃ����B";
	close;
}

//============================================================
// ���[���̈˗��N�G�X�g
//- Registry -------------------------------------------------
// YGG_4QUE -> 0�`2
//------------------------------------------------------------
mid_camp,192,239,4	script	�w����z��	857,{
	if(YGG_2QUE < 23) {	// ��̎푰�N�G�X�g
		mes "�]���͎w����z�����\���Ă��Ȃ��]";
		close;
	}
	switch(YGG_4QUE) {
	case 0:
		mes "�]�w����z��������]";
		next;
		mes "[�w����z��]";
		mes "�y�Ώہz�@�_���f���I���̃����o�[";
		mes "�y�˗���z�@���[��";
		mes "�y��V�z�@���[�����厖�ɂ��Ă����";
		next;
		mes "[�w����z��]";
		mes "�_���f���I���̐��͂�";
		mes "���̃A�b�V���E�o�L���[����";
		mes "�܂��m�F���ꂽ�́I";
		next;
		mes "[�w����z��]";
		mes "���ɂ̓_���f���I���ɂ�";
		mes "�Y��邱�Ƃ��ł��Ȃ��؂肪����I";
		mes "�N�ł��\��Ȃ�����";
		mes "����������������A";
		mes "���̑���ɓV���������ė~�����I";
		next;
		mes "[�w����z��]";
		mes "��V�́A�����厖�ɂ��Ă���";
		mes "�󔠂�������B";
		mes "���͂ǂ�����^0000FF���A^000000��";
		mes "�ڌ����ꂽ�炵������";
		mes "�O��I�ɒT���Ă݂āI";
		next;
		mes "�ǐL�j���A�Ȃ��Ȃ���";
		mes "�g���肾�Ɖ\����B�������Ȃ��łˁB";
		mes "�킢�Ɏ��M���Ȃ����";
		mes "��l�ōs���Ȃ��ق���������B";
		next;
		mes "�ǐL2�j������I";
		mes "��V�͎�����ł͂Ȃ��A";
		mes "^0000FF�t�@�C���f��^000000����󂯎���ĂˁI";
		next;
		if(select("�˗����󂯂�","���͂�߂Ă���") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "�i�܂��̋@��ɂ��悤�B�j";
			close;
		}
		mes "�]���Ȃ��́A";
		mes "�@�˗����󂯂邱�Ƃɂ����]";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�_���f���I���̃����o�[��T�����B";
		mes "�ǂ����̓��A�Ŗڌ����ꂽ�炵�����c�c";
		mes "������������A^FF0000�e���ƃI�[�Q����";
		mes "���������A^000000�̂��Ƃ��낤���H�j";
		set YGG_4QUE,1;
		setquest 7076;
		delquest 70367;
		close;
	case 1:
		mes "�]�w����z��������]";
		next;
		if(select("������x�ǂ�","���͂�߂Ă���") == 2) {
			mes "["+strcharinfo(0)+"]";
			mes "�i�܂��̋@��ɂ��悤�B�j";
			close;
		}
		mes "[�w����z��]";
		mes "�y�Ώہz�@�_���f���I���̃����o�[";
		mes "�y�˗���z�@���[��";
		mes "�y��V�z�@���[�����厖�ɂ��Ă����";
		next;
		mes "[�w����z��]";
		mes "�_���f���I���̐��͂�";
		mes "���̃A�b�V���E�o�L���[����";
		mes "�܂��m�F���ꂽ�́I";
		next;
		mes "[�w����z��]";
		mes "���ɂ̓_���f���I���ɂ�";
		mes "�Y��邱�Ƃ��ł��Ȃ��؂肪����I";
		mes "�N�ł��\��Ȃ�����";
		mes "����������������A";
		mes "���̑���ɓV���������ė~�����I";
		next;
		mes "[�w����z��]";
		mes "��V�́A�����厖�ɂ��Ă���";
		mes "�󔠂�������B";
		mes "���͂ǂ�����^0000FF���A^000000��";
		mes "�ڌ����ꂽ�炵������";
		mes "�O��I�ɒT���Ă݂āI";
		next;
		mes "�ǐL�j���A�Ȃ��Ȃ���";
		mes "�g���肾�Ɖ\����B�������Ȃ��łˁB";
		mes "�킢�Ɏ��M���Ȃ����";
		mes "��l�ōs���Ȃ��ق���������B";
		next;
		mes "�ǐL2�j������I";
		mes "��V�͎�����ł͂Ȃ��A";
		mes "^0000FF�t�@�C���f��^000000����󂯎���ĂˁI";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�_���f���I���̃����o�[��T�����B";
		mes "�ǂ����̓��A�Ŗڌ����ꂽ�炵�����c�c";
		mes "������������A^FF0000�e���ƃI�[�Q����";
		mes "���������A^000000�̂��Ƃ��낤���H�j";
		close;
	case 2:
		mes "�]�w����z��������]";
		close;
	}
}

nyd_dun02,1,1,0	script	ygg_dandelion	-1,{
OnKilled:
	initnpctimer;
	end;
OnTimer300000:
	if(rand(2))
		hideoffnpc "�������j#ygg_dan01";
	else
		hideoffnpc "�������j#ygg_dan02";
	stopnpctimer;
	end;
}
nyd_dun02,144,103,3	script	�������j#ygg_dan01	456,3,3,{
	end;
OnTouch:
	emotion 0,"";
	emotion 23;
	hideonnpc "�������j#ygg_dan01";
	monster "nyd_dun02",144,103,"�_���f���I���̃����o�[",2026,1,"ygg_dandelion::OnKilled";
	end;
}

nyd_dun02,206,114,5	script	�������j#ygg_dan02	456,3,3,{
	end;
OnTouch:
	emotion 0,"";
	emotion 23;
	hideonnpc "�������j#ygg_dan02";
	monster "nyd_dun02",206,114,"�_���f���I���̃����o�[",2026,1,"ygg_dandelion::OnKilled";
	end;
OnInit:
	hideonnpc "�������j#ygg_dan02";
	end;
}

//============================================================
// �h���R�̗��N�G�X�g
//- Registry -------------------------------------------------
// YGG_5QUE -> 0�`3
//------------------------------------------------------------
mid_camp,146,306,3	script	�t�@�C���f��	982,{
	if(YGG_2QUE < 23) {	// ��̎푰�N�G�X�g
		mes "�]��l�����������Ă���]";
		next;
		mes "[�t�@�C���f��]";
		mes "�������I";
		mes "�^�u���������";
		mes "�ǂ����ĕs�\���Ƃ�";
		mes "������ł���!?";
		mes "����͐�΂ɐ������܂��I";
		next;
		mes "[�^�u]";
		mes "�t�@�C���f������I";
		mes "�������̎q�B�͂����q����";
		mes "�M���Ă��܂��B";
		mes "�ł��A����ς�댯�ł���I";
		next;
		mes "[�t�@�C���f��]";
		mes "�������A�K��";
		mes "�L���[�y�b�g���ł���͂��ł��I";
		next;
		mes "[�^�u]";
		mes "�����玄��������悤���Ă�";
		mes "�ʖڂȂ��̂͑ʖڂł��B";
		mes "���̎q�B�̉����͔F�߂܂��B";
		mes "�ł��A�ʖڂȂ̂͑ʖڂȂ�ł��I";
		next;
		mes "[�t�@�C���f��]";
		mes "�ǂ����đʖڂȂ�ł����I";
		next;
		mes "[�^�u]";
		mes "�댯�����܂���I";
		mes "�����ҏb�̈����Ɋւ��Ă�";
		mes "���Ȃ莩�M������܂��B";
		next;
		mes "[�^�u]";
		mes "�ł��A���̎q�B������";
		mes "���܂�Ȃ���̋��\����";
		mes "����łȂ�Ƃ��Ȃ镨�ł͂���܂���B";
		mes "�@";
		mes "����ɍ����L���[�y�b�g�Ȃ񂩁c�c";
		next;
		mes "[�t�@�C���f��]";
		mes "���Ď��������̂ł���!?";
		mes "�܂�����";
		mes "�L���[�y�b�g�ƊE�ւ̕��J�I";
		mes "�^�u����A";
		mes "���̒���A�󂯂܂���I";
		next;
		mes "�]��l�̉�b�͉��M���Ă���B";
		mes "�@���͂܂��b�������ꂻ���ɂȂ��]";
		close;
	}
	if(YGG_4QUE > 1 || YGG_5QUE > 1) {
		mes "[�t�@�C���f��]";
		mes "����ɂ��́B";
		mes "���q�͂ǂ��ł����H";
		mes "���̓L���[�y�b�g�E�̂��߂�";
		mes "�撣���Ă܂���B";
	}
	else {
		mes "[�t�@�C���f��]";
		mes "�������I";
		mes "�^�u����͖{���Ɋ�łł��ˁB";
		mes "�L���[�y�b�g�̑f���炵����";
		mes "�������Ă��܂���B";
		next;
		mes "[�t�@�C���f��]";
		mes "�c��A���Ȃ��́H";
		mes "�����p�ł����H";
	}
	next;
	switch(select("�������Ă��邩����","�L���[�y�b�g�ɂ���")) {
	case 1:
		if(YGG_4QUE == 1) {
			if(checkquest2(7076)){
				if(checkquest2(7076) & 0x4){
					mes "[�t�@�C���f��]";
					mes "���Ȃ����_���f���I����";
					mes "�c�}��|�������ł��ˁB";
					next;
					mes "[�t�@�C���f��]";
					mes "�c�c";
					mes "�悵�A�����ł��傤�B";
					next;
					mes "[�t�@�C���f��]";
					mes "�͂��A";
					mes "�󂯎���Ă��������B";
					mes "���[������a��������V�ł��B";
					next;
					mes "[�t�@�C���f��]";
					mes "���[���������ɂ́A";
					mes "����͑������l�̂����";
					mes "�������ł���B";
					if(checkitemblank() < 3) {
						next;
						mes "[�t�@�C���f��]";
						mes "�ו������������ł���B";
						mes "���[������a�����Ă��镨��";
						mes "�n���Ȃ��̂�";
						mes "�ו��̎�ނ����炵�Ă���";
						mes "�܂��b�������Ă��������B";
						close;
					}
					delquest 7076;
					set YGG_4QUE,2;
					getitem 7444,1;
					getitem 6080,20;
					setquest 200900;
					close;
				}
				mes "[�t�@�C���f��]";
				mes "�͂��͂��A";
				mes "�w����z�̌��ł��ˁB";
				next;
				mes "[�t�@�C���f��]";
				mes "�_���f���I���̃����o�[��";
				mes "�A�b�V���E�o�L���[���ɂ���";
				mes "���A�Ŗڌ����ꂽ�����ł��B";
				mes "���炵�߂Ă����ĉ������B";
				next;
				mes "[�t�@�C���f��]";
				mes "�_���f���I���̃����o�[�́A";
				mes "�Ȃ��Ȃ��苭���ƕ����Ă��܂��B";
				mes "�C�����Ă��������ˁB";
				next;
				mes "[�t�@�C���f��]";
				mes "�����A���炵�߂邱�Ƃ��o������";
				mes "���ɕ񍐂��Ă��������B";
				mes "���[������a�����Ă��镨��";
				mes "���n�����܂��̂ŁB";
				close;
			}
		}
		else if(YGG_4QUE == 2) {
			mes "[�t�@�C���f��]";
			mes "���[���ɁA����̐��ʂ�";
			mes "�`���Ă����܂���B";
			mes "�{���ɂ����l�ł����B";
			close;
		}
		mes "[�t�@�C���f��]";
		mes "�������Ă��邩���āA";
		mes "��łŕ����炸���̃^�u�����";
		mes "�K���ɐ������Ă����ł���B";
		next;
		mes "[�t�@�C���f��]";
		mes "�^�u�����";
		mes "�h���R���L���[�y�b�g�ɂ���";
		mes "�f���炵��������������";
		mes "�������ė~�����ł��ˁc�c";
		next;
		mes "[�t�@�C���f��]";
		mes "�����ł����A�Z�����̂�";
		mes "^0000FF���[���ɗ��݂���^000000�����ꂿ�Ⴄ���B";
		next;
		mes "[�t�@�C���f��]";
		mes "���Ȃ����悩������A";
		mes "���̒��Ԓn�̒���������ɂ���";
		mes "�w����z�������Ă��������B";
		next;
		mes "[�t�@�C���f��]";
		mes "���̗F�B�̃��[�����\������ł���B";
		mes "�ޏ��ɋ��͂��Ă����Ă��������B";
		close;
	case 2:
		switch(YGG_5QUE) {
		case 0:
			mes "[�t�@�C���f��]";
			mes "���̓L���[�y�b�g�ɂ���";
			mes "�������Ă��܂��B";
			mes "�A�b�V���E�o�L���[���ɂ�";
			mes "�L���[�y�b�g�ɑ�������";
			mes "�����X�^�[�������ς����܂��B";
			next;
			mes "[�t�@�C���f��]";
			mes "���̃����X�^�[�̒��ŁA";
			mes "�ڂ����Ă���̂�";
			mes "�ŋߖڌ���񂪂�����";
			mes "^0000FF�h���R^000000�Ƃ��������X�^�[�ł��B";
			next;
			mes "[�t�@�C���f��]";
			mes "�h���R������";
			mes "�L���[�y�b�g�E�̎����";
			mes "�Ȃ�ł��傤�B";
			next;
			mes "[�t�@�C���f��]";
			mes "�h���R�̗����ǂ����Ă�";
			mes "��ɓ��ꂽ���̂ł����A";
			mes "�댯�ȏꏊ�ɂ���̂�";
			mes "�̎悵�ɂ����Ȃ��̂ł��B";
			next;
			if(select("����Ɏ���Ă��܂��傤���H","�撣���Ă�������") == 2) {
				mes "[�t�@�C���f��]";
				mes "���肪�Ƃ��������܂��I";
				mes "�c�c";
				mes "�ł��A���ɂ͖����I";
				mes "����Ȋ댯�ȏꏊ�ɍs���Ȃ�āB";
				mes "�N����`���Ă���Ȃ����ȁc�c";
				next;
				mes "�]�t�@�C���f���̔����𕷂���";
				mes "�@�^�u�������r�����]";
				next;
				mes "[�^�u]";
				mes "�����炱���̃����X�^�[��";
				mes "�L���[�y�b�g�v��Ȃ��";
				mes "�l���͎̂ĂĂ��������I";
				mes "���񌾂��Ε������ł����I";
				next;
				mes "[�t�@�C���f��]";
				mes "�^�u�����";
				mes "�������Ă��񂪂Ȃ���ł���I";
				mes "����Ȃ񂶂�";
				mes "�ʖڂȐl���ɂȂ����Ⴂ�܂���H";
				next;
				mes "[�^�u]";
				mes "�]�v�Ȃ����b�ł�����!!";
				close;
			}
			mes "[�t�@�C���f��]";
			mes "�{���ł����H";
			mes "���肪�Ƃ��������܂��I";
			next;
			mes "[�t�@�C���f��]";
			mes "�h���R�̗���";
			mes "^FF0000�ŋߔ������ꂽ���A^000000��";
			mes "���邻���ł��B";
			next;
			mes "[�t�@�C���f��]";
			mes "^FF0000�h���R�̗�^000000��^0000FF10��^000000";
			mes "�����ė��Ă��������B";
			mes "�����A�h���R�̃L���[�y�b�g�c�c";
			mes "�l���邾���ł��]�N�]�N���܂��B";
			next;
			mes "[�t�@�C���f��]";
			mes "�ł��A��肷���ɒ��ӂ��Ă��������ˁB";
			mes "10�ŏ\���ł�����B";
			set YGG_5QUE,1;
			setquest 7077;
			delquest 70368;
			close;
		case 1:
			if(countitem(6093) < 10) {
				mes "[�t�@�C���f��]";
				mes "^FF0000�h���R�̗�^000000��^0000FF10��^000000";
				mes "�����Ă��Ă��������B";
				mes "�K���L���[�y�b�g�����Ă݂��܂���B";
				next;
				mes "[�t�@�C���f��]";
				mes "�h���R�̗���";
				mes "^FF0000�ŋߔ������ꂽ���A^000000��";
				mes "���邻���ł��B";
				mes "���ƁA��肷���ɒ��ӂ��Ă��������ˁB";
				mes "10�ŏ\���ł�����B";
				close;
			}
			if(checkitemblank() < 2) {
				mes "[�t�@�C���f��]";
				mes "�ו������������̂悤�ł���B";
				mes "��ސ������炵�Ă���";
				mes "�܂����Ă��������B";
				close;
			}
			mes "[�t�@�C���f��]";
			mes "�܂��I";
			mes "�h���R�̗���10����I";
			mes "�@";
			mes "�]�h���R�̗���10�n�����]";
			delitem 6093,10;
			delquest 7077;
			setquest 7078;
			//setquest 70800;
			//compquest 70800;
			set YGG_5QUE,2;
			if(checkre())
				getexp 4000,4000;
			else
				getexp 40000,40000;
			getitem 6081,1;
			getitem 6080,1;
			next;
			mes "[�t�@�C���f��]";
			mes "���肪�Ƃ��������܂��I";
			mes "����͂���̕i�ł��B";
			mes "���̒n�Ŏ�ɓ������R�C���ł��B";
			mes "���Ɏg�����킩��܂��񂪁A";
			mes "�����Ɖ��l������܂���B";
			next;
			mes "[�t�@�C���f��]";
			mes "�܂��܂����͕K�v�ł��I";
			mes "�����A�h���R�̃L���[�y�b�g�c�c";
			mes "�l���邾���ł��]�N�]�N���܂��B";
			mes "�܂����������Ă��ė~�����̂ŁA";
			mes "�s������������";
			mes "�b�������Ă��������ˁB";
			close;
		case 2:
			if(checkquest2(7078)) {
				mes "[�t�@�C���f��]";
				mes "�ȑO��������������";
				mes "���݁A�z���������ł��B";
				mes "�{���ɂ������Č������s���\��ł��B";
				delquest 7078;
				next;
				mes "[�t�@�C���f��]";
				mes "�Ƃ���ŁA�h���R�̗���";
				mes "���������K�v�ɂȂ�����ł��B";
				mes "�܂����肢�������̂ŁA";
				mes "��낵����ΐ��������Ă��������B";
				close;
			}
			mes "[�t�@�C���f��]";
			mes "�܂��A�h���R�̗���10��";
			mes "�W�߂ė~�����̂ł����c�c";
			next;
			if(select("�����ł���","���͂�����Ɓc�c") == 2) {
				mes "[�t�@�C���f��]";
				mes "������܂����B";
				mes "���Ȃ����Z�����ł��傤����B";
				mes "���Ԃ��ł�����";
				mes "�܂���`���Ă��������ˁB";
				close;
			}
			mes "[�t�@�C���f��]";
			mes "���肪�Ƃ��������܂��B";
			mes "�ł͂�낵�����肢���܂��I";
			set YGG_5QUE,1;
			setquest 7077;
			next;
			mes "[�t�@�C���f��]";
			mes "�h���R�̗���10��";
			mes "�����ė��Ă��������B";
			mes "�L���[�y�b�g�E�̖����̂��߂ɁI";
			mes "�ł��A��肷���ɒ��ӂ��Ă��������ˁB";
			mes "10�ŏ\���ł�����B";
			close;
		}
	}
}

nyd_dun01,258,134,0	script	�h���R�̗�#ygg_egg01	463,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ����������߁A";
		mes "�@�A�C�e�����E�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	if(YGG_5QUE != 1) {
		mes "�]�h���R�̗�������B";
		mes "�@���͓��ɕK�v�Ȃ��̂�";
		mes "�@�����Ƃ��Ă������]";
		close;
	}
	if(countitem(6093) >= 10) {
		mes "�]�h���R�̗��͊���10��ɓ��ꂽ�B";
		mes "�@����ȏ���̂͂�߂Ă������]";
		close;
	}
	mes "�]�h���R�̗�����肵���]";
	getitem 6093,1;
	initnpctimer;
	hideonnpc strnpcinfo(0);
	close;
OnTimer420000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}

nyd_dun01,100,210,0	duplicate(�h���R�̗�#ygg_egg01)	�h���R�̗�#ygg_egg02	463
nyd_dun01,74,68,0	duplicate(�h���R�̗�#ygg_egg01)	�h���R�̗�#ygg_egg03	463
nyd_dun01,98,142,0	duplicate(�h���R�̗�#ygg_egg01)	�h���R�̗�#ygg_egg04	463
nyd_dun01,244,157,0	duplicate(�h���R�̗�#ygg_egg01)	�h���R�̗�#ygg_egg05	463
nyd_dun01,59,185,0	duplicate(�h���R�̗�#ygg_egg01)	�h���R�̗�#ygg_egg06	463

nyd_dun02,68,256,0	script	�h���R�̗�#ygg_egg11	463,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ����������߁A";
		mes "�@�A�C�e�����E�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	if(YGG_5QUE != 1) {
		mes "�]�h���R�̗�������B";
		mes "�@���͓��ɕK�v�Ȃ��̂�";
		mes "�@�����Ƃ��Ă������]";
		close;
	}
	if(countitem(6093) >= 10) {
		mes "�]�h���R�̗��͊���10��ɓ��ꂽ�B";
		mes "�@����ȏ���̂͂�߂Ă������]";
		close;
	}
	mes "�]�h���R�̗�����肵���]";
	getitem 6093,1;
	initnpctimer;
	hideonnpc strnpcinfo(0);
	close;
OnTimer240000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}

nyd_dun02,202,166,0	duplicate(�h���R�̗�#ygg_egg11)	�h���R�̗�#ygg_egg12	463
nyd_dun02,200,165,0	duplicate(�h���R�̗�#ygg_egg11)	�h���R�̗�#ygg_egg13	463

nyd_dun02,201,166,0	script	�h���R�̗�#ygg_egg16	463,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ����������߁A";
		mes "�@�A�C�e�����E�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���܂����ׂ悤�]";
		close;
	}
	if(YGG_5QUE != 1) {
		mes "�]�h���R�̗�������B";
		mes "�@���͓��ɕK�v�Ȃ��̂�";
		mes "�@�����Ƃ��Ă������]";
		close;
	}
	if(countitem(6093) >= 10) {
		mes "�]�h���R�̗��͊���10��ɓ��ꂽ�B";
		mes "�@����ȏ���̂͂�߂Ă������]";
		close;
	}
	mes "�]�h���R�̗�����肵���]";
	getitem 6093,1;
	initnpctimer;
	hideonnpc strnpcinfo(0);
	close;
OnTimer120000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}

nyd_dun02,203,167,0	duplicate(�h���R�̗�#ygg_egg16)	�h���R�̗�#ygg_egg17	463
nyd_dun02,201,164,0	duplicate(�h���R�̗�#ygg_egg16)	�h���R�̗�#ygg_egg18	463

//============================================================
// ���t�B�l���̃��C�N�G�X�g
//- Registry -------------------------------------------------
// YGG_6QUE -> 0�`
//------------------------------------------------------------
spl_in01,97,313,3	script	���C�E�l	446,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���C�E�l]";
		mes "Yur,Dur�@AnoVa?";
		mes "Wha?�@Dieb�@OsaDur�@..";
		mes "ah..RuffThus�@NeAsh.";
		mes "man nesAsh OdesAlah ?";
		close;
	}
	if(YGG_2QUE < 6) {	// ��̎푰�N�G�X�g
		mes "[���C�E�l]";
		mes "�}�p�łȂ����";
		mes "��ɂ��Ă��炦�܂��񂩁H";
		mes "���͍��I�[�_�[�������Ă��āA";
		mes "���C�p�̏����";
		mes "���Ȃ���΂Ȃ�܂���B";
		mes "�����������c�c";
		close;
	}
	switch(YGG_6QUE) {
	case 0:
		mes "[���C�E�l]";
		mes "�͂��A�����p�ł����H";
		mes "���͍��A";
		mes "�I�[�_�[�������Ă���";
		mes "���C�p�̏�������Ȃ��Ă�";
		mes "�����Ȃ���ł���B";
		next;
		if(select("��������`�����܂����H","���C���ĉ��ł����H") == 2) {
			mes "[���C�E�l]";
			mes "���C�̓��C�ł���B";
			mes "���l�̃��t�B�l���Ȃ�";
			mes "�N�ł��K���ꌬ�͎����Ă��܂��B";
			next;
			mes "[���C�E�l]";
			mes "�����̋�Ԃ�厖�ɂ���";
			mes "���t�B�l���ɂ�";
			mes "��΂ɕK�v�Ȃ��̂Ȃ�ł��B";
			next;
			menu "������Ƃ̂��Ƃł����H",-;
			mes "[���C�E�l]";
			mes "�����ł��A�ƂƂ������܂��ˁB";
			mes "���t�B�l����";
			mes "���C�ɂ�����z���͐�����ł���B";
			mes "�����̑S�Ă����C����";
			mes "������l������ʂł��B";
			next;
			mes "[���C�E�l]";
			mes "�������C���Ȃ���΁A";
			mes "�����Ă����Ȃ��̂ł���B";
			close;
		}
		mes "[���C�E�l]";
		mes "�����A";
		mes "�{���ł����H";
		mes "�ƂĂ�������܂���B";
		next;
		mes "[���C�E�l]";
		mes "���̓��C����郄�C�E�l�ł��B";
		mes "�����̓T�t�@���Ƃ̐킢��";
		mes "�O����n�Ȃ�ł����A";
		mes "���m�ɂƂ���";
		mes "�����̋�Ԃł�����悤��";
		mes "�����Ń��C������Ă����ł��B";
		next;
		mes "[���C�E�l]";
		mes "���������t�B�l����";
		mes "�l�l�̌���F�߁A���h�������A";
		mes "�v���C�x�[�g�ȋ�Ԃ�";
		mes "�ƂĂ��d�v�������ł���B";
		next;
		mes "[���C�E�l]";
		mes "������A�R�̊�n�ł���Ȃ���";
		mes "�l�̃��C�̍쐬��";
		mes "�F�߂Ă����ł���B";
		next;
		mes "[���C�E�l]";
		mes "���͂��̑O����n�ɁA";
		mes "�l�̌����ő���ɐ�������";
		mes "���܂łɂȂ��悤��";
		mes "���C����肽���̂ł���B";
		next;
		mes "[���C�E�l]";
		mes "����ȕ���";
		mes "�����Ɩ����Ă�����ł����A";
		mes "�ŋ߁A�A�[�N�Ƃ������m��";
		mes "���܂��ܔ��������Ƃ������A��";
		mes "���̖������Ȃ��Ă���镨��";
		mes "����̂�����������ł��B";
		next;
		mes "[���C�E�l]";
		mes "���̓��A�ɂ�";
		mes "���̗d���̂悤�Ȏp�����Ă���";
		mes "^0000FF�A�N�A�G�������^��^000000�Ƃ���";
		mes "�����X�^�[�����邻���Ȃ̂ł����A";
		mes "���̗d�������ɓ���Ƃ����A�C�e����";
		mes "���C���Ɏg�������Ȃ�ł��B";
		next;
		mes "[���C�E�l]";
		mes "������g���΁A";
		mes "���܂łɂȂ���Ղ̂悤��";
		mes "���������C������Ǝv����ł���B";
		next;
		mes "[���C�E�l]";
		mes "�ł��A���͐퓬�����Ȃ�ł��c�c";
		mes "���ł͖����Ȃ�ł��B";
		mes "�����ƃA�N�A�G�������^����";
		mes "�R�e���p���ɂ��ꂿ�Ⴂ�܂��B";
		mes "�N���ɂ��̃A�C�e����";
		mes "�����Ă��ė~������ł���c�c";
		next;
		mes "[���C�E�l]";
		mes "�ƁA�v���Ă�������";
		mes "���Ȃ�������܂����B";
		mes "�ƂĂ�������܂��B";
		next;
		menu "�͂��H",-;
		mes "[���C�E�l]";
		mes "���̃A�N�A�G�������^������";
		mes "��ɓ���Ƃ���";
		mes "^0000FF�܂̌���^00000015��^FF0000�u���F�̉t��^00000015��";
		mes "�����Ă��Ă���܂��񂩁H";
		next;
		if(select("�����ł���","�f��܂�") == 2) {
			mes "[���C�E�l]";
			mes "���A";
			mes "��`���Ă�������";
			mes "���Ȃ����猾�����̂ɁB";
			mes "�Ђǂ��ł���c�c";
			mes "���V���b�N�ł��c�c";
			close;
		}
		mes "[���C�E�l]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "���͂��Ȃ��̂悤��";
		mes "�e�؂Ȑl���D���ł���B";
		next;
		mes "[���C�E�l]";
		mes "�ŋߔ������ꂽ���A�ɂ���";
		mes "^0000FF�A�N�A�G�������^��^000000�����ɓ���";
		mes "^0000FF�܂̌���^000000��^FF0000�u���F�̉t��^000000��";
		mes "15�������ė��Ă��������B";
		set YGG_6QUE,1;
		setquest 7081;
		delquest 70369;
		close;
	case 1:
		if(countitem(7326) < 15 || countitem(6075) < 15) {
			mes "[���C�E�l]";
			mes "^0000FF�܂̌���^000000��^FF0000�u���F�̉t��^000000��";
			mes "15���ł���B";
			mes "�ǂ�����낵�����肢���܂��B";
			close;
		}
		if(checkitemblank() < 1) {
			mes "[���C�E�l]";
			mes "�ו��̎��������݂����ł��B";
			mes "��ސ������炵�Ă���";
			mes "�܂����Ă��������B";
			close;
		}
		mes "[���C�E�l]";
		mes "�����A�����";
		mes "�u���F�̉t�̂Ɨ܂̌����B";
		mes "�����ė��Ă��ꂽ��ł��ˁB";
		mes "�@";
		mes "�]�u���F�̉t�̂Ɨ܂̌�����";
		mes "�@���C�E�l��15�n�����]";
		delitem 7326,15;
		delitem 6075,15;
		set YGG_6QUE,2;
		chgquest 7081,7082;
		//setquest 70750;
		//delquest 70750;
		if(checkre())
			getexp 3000,3000;
		else
			getexp 30000,30000;
		getitem 6081,3;
		next;
		mes "[���C�E�l]";
		mes "���肪�Ƃ��������܂��B";
		mes "�͂��A����͂���ł��B";
		mes "��؂ɂ��Ă��������ˁB";
		next;
		mes "[���C�E�l]";
		mes "���Ȃ��͂ƂĂ��e�؂Ȑl�ł��B";
		mes "���ꂩ������ǂ�����";
		mes "���������Ǝv���܂���B";
		mes "�������Ƃ��Ȃ��͗F�B�ł��B";
		next;
		mes "[���C�E�l]";
		mes "�܂��A�ޗ�������Ȃ�������";
		mes "���肢�������ł��B";
		mes "���Ȃ��͗F�B������f��܂��񂩂�ˁB";
		close;
	case 2:
		if(checkquest2(7082)) {
			mes "[���C�E�l]";
			mes "���Ȃ����W�߂Ă��ꂽ";
			mes "�u���F�̉t�̂Ɨ܂̌����A";
			mes "�ƂĂ�������܂�����B";
			next;
			mes "[���C�E�l]";
			mes "�܂���������Ȃ��Ȃ��Ă����̂�";
			mes "���낻�남�肢�������ł��B";
			mes "�������ł�����";
			mes "�b�������Ăق����ł���B";
			delquest 7082;
			close;
		}
		mes "[���C�E�l]";
		mes "����̓��C���̍ޗ���";
		mes "�����Ă��Ă���ď�����܂����B";
		mes "�A�N�A�G�������^����";
		mes "���������ł��傤�H";
		mes "�{���Ɋ��ӂ��Ă܂���B";
		next;
		mes "[���C�E�l]";
		mes "����łł��ˁA";
		mes "^0000ff�܂̌���^00000015��^FF0000�u���F�̉t��^00000015��";
		mes "�܂��W�߂Ăق����ł���B";
		next;
		mes "[���C�E�l]";
		mes "�����m���Ă���Ǝv���܂�����";
		mes "���̓��A��";
		mes "���̗d���̂悤�Ȏp�����Ă���";
		mes "^0000ff�A�N�A�G�������^��^000000�Ƃ���";
		mes "�����X�^�[�����ɓ���܂���B";
		next;
		if(select("�����ł���","�f��܂�") == 2) {
			mes "[���C�E�l]";
			mes "���A";
			mes "�F�B�̂��肢��f��̂ł����H";
			mes "�Ђǂ��ł���c�c";
			mes "���V���b�N�ł��c�c";
			close;
		}
		mes "[���C�E�l]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "���͂��Ȃ��̂悤��";
		mes "�e�؂Ȑl����D���ł���B";
		next;
		mes "[���C�E�l]";
		mes "�ŋߔ������ꂽ���A�ɂ���";
		mes "^0000ff�A�N�A�G�������^��^000000�����ɓ���";
		mes "^0000ff�܂̌���^000000��^FF0000�u���F�̉t��^000000��";
		mes "15�������ė��Ă��������B";
		set YGG_6QUE,1;
		setquest 7081;
		close;
	}
}

//============================================================
// �A�[���u�w�C���̍����N�G�X�g
//- Registry -------------------------------------------------
// YGG_7QUE -> 0�`
//------------------------------------------------------------
spl_in01,30,324,3	script	�O���k�C��	446,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�d��]";
		mes "BurYurDath�@Ee�@NeKoIyaz";
		mes "er�@ModRuAlah�@Yee";
		mes "VeldDuDur�@Yee";
		mes "SeYurOsa�@U ReNudNud�@Ra";
		close;
	}
	switch(YGG_7QUE) {
	case 0:
		mes "[�d��]";
		mes "���Ȃ��͂��������āA";
		mes "�~�b�h�K���h�嗤�Ƃ����ꏊ����";
		mes "�����Ƃ����َ푰�̕��ł���!?";
		next;
		menu "�����ł�",-;
		mes "[�d��]";
		mes "�َ푰�̕��ɉ��Ȃ��";
		mes "�������ł��B";
		mes "���ȏЉ�x��܂����ˁB";
		mes "���͊w�҂̃O���k�C���ƌ����܂��B";
		next;
		mes "[�O���k�C��]";
		mes "����ɂ��Ă�";
		mes "���Ȃ��B�̎푰���ς���Ă��܂��ˁB";
		mes "���̋Ɋ��̒n^0000ff���g�D���փC��^000000��";
		mes "�킴�킴������Ȃ�āB";
		next;
		mes "[�O���k�C��]";
		mes "���B���t�B�l����";
		mes "�C�O�h���V����������T�t�@����";
		mes "�ǂ��o�����߂ɂ��̒n�ɗ�����ł��B";
		mes "�݂�ȁA�����T�t�@����ǂ��o����";
		mes "�̋�^FF0000�A�[���u�w�C��^000000�ɋA�肽���A";
		mes "���Ďv���Ă��ł���B";
		next;
		mes "[�O���k�C��]";
		mes "�܂��A���Ȃ��ɂ�";
		mes "�F��Ȏ�������ł��傤���ǂˁB";
		next;
		mes "[�O���k�C��]";
		mes "�ł��A�T�t�@���̂悤�ɁA";
		mes "�u���f�B�E���̌@�̂��߂Ƃ�������";
		mes "�[�������@�葱����";
		mes "�C�O�h���V���̍���������悤��";
		mes "���Ƃ͐�΂ɂ��Ȃ��ł��������ˁB";
		next;
		mes "[�O���k�C��]";
		mes "���̓T�t�@����";
		mes "�ꍏ�������ǂ��o����悤��";
		mes "^FF0000����^000000���撣��܂��B";
		next;
		if(select("���̌����ł����H","����ł͎��炵�܂�") == 2) {
			mes "[�O���k�C��]";
			mes "�����A�����Ⴄ��ł����H";
			mes "�c�O�ł��B";
			mes "����^FF0000����^000000�̘b��";
			mes "�����Ă��炢���������̂Ɂc�c";
			close;
		}
		mes "[�O���k�C��]";
		mes "�����ɋ�������܂����H";
		mes "�������ł��B";
		next;
		mes "[�O���k�C��]";
		mes "�������Č����Ă�";
		mes "�\�͓I�Ȃ��̂ł͂���܂��񂩂�";
		mes "���S���Ă��������ˁB";
		mes "���A��؂Ȃ��̂͋��ł����B";
		next;
		mes "[�O���k�C��]";
		mes "���̌����͕��m�B��";
		mes "�z�[���V�b�N���������錤���ł��I";
		mes "���Ȃ킿^0000ff����^000000�̌����ł��I";
		next;
		mes "[�O���k�C��]";
		mes "���t�B�l����";
		mes "���̃��g�D���փC���ɗ��Ă���";
		mes "�����Ԑ푈�������Ă��܂��B";
		next;
		mes "[�O���k�C��]";
		mes "���m���A�[���u�w�C����";
		mes "�A���Ȃ�Ă��Ƃ͖ő��ɂ���܂���B";
		mes "�̋��ɋA�肽���ĕs����ɂȂ��Ă���";
		mes "���m���������񂢂܂��B";
		next;
		mes "[�O���k�C��]";
		mes "���̕��m�̐S��������߂�";
		mes "�ǂ�����΂�����";
		mes "���������Ă���̂ł��B";
		next;
		mes "[�O���k�C��]";
		mes "�����āA���̖��������̈�Ƃ���";
		mes "���͌̋��A�[���u�w�C���̓���������";
		mes "^FF0000����^000000����낤�Ƃ��Ă��܂��B";
		next;
		mes "[�O���k�C��]";
		mes "�̋��̓����������ł������";
		mes "�S������Ă��炤��ł��B";
		mes "���t�B�l���ɂƂ���";
		mes "�������đ厖�Ȃ�ł���B";
		mes "�����͖����Ȃ�ł��B";
		next;
		mes "[�O���k�C��]";
		mes "�����̋��A�[���u�w�C���̉Ԃ�";
		mes "�����ł͂Ȃ��Ȃ���ɓ���܂���B";
		mes "������A�[���u�w�C���̉�1�{�ł�";
		mes "����������������悤��";
		mes "���̋@�B���쐬�����̂ł��B";
		next;
		mes "[�O���k�C��]";
		mes "�����A�̐S�̉Ԃ��c�c";
		next;
		menu "�Ԃ��ǂ�������ł����H",-;
		mes "[�O���k�C��]";
		mes "�A�[���u�w�C���̉Ԃ̎��";
		mes "�����Ă���^FF0000�t���[����^000000�Ƃ����q��";
		mes "�����ł����A";
		mes "���̃t���[�������c�c";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�O���k�C��]";
		mes "�͂��A�َ푰�̂��Ȃ��ɂ�";
		mes "�p���������b�ł�����";
		mes "�����͎U�炩����ςȂ���";
		mes "������Q�Ă΂�����Ȃ�ł��B";
		next;
		mes "[�O���k�C��]";
		mes "���̎q�̕����Ɏ킪�����ł���";
		mes "���x�����Ă��A���x�T���A����";
		mes "�����ĐQ�Ă΂������";
		mes "�T���Ă���Ȃ���ł���B";
		next;
		mes "[�O���k�C��]";
		mes "�ǂ��������̂ł��傤���c�c";
		next;
		mes "�]�u���m�̐S����������v";
		mes "�@���̃O���k�C���̗D������";
		mes "�@������������Ă��������A";
		mes "�@�Ƃ��Ȃ��͍l�����]";
		next;
		menu "���������ė��܂��傤���H",-;
		mes "[�O���k�C��]";
		mes "���A������ł����H";
		mes "���肪�Ƃ��������܂��B";
		mes "���Ȃ��Ȃ���v��������܂���B";
		mes "�t���[�����͎��̌������Ƃ�";
		mes "�S�������Ă���܂��񂩂�B";
		next;
		mes "[�O���k�C��]";
		mes "�t���[������";
		mes "����Ɍ�����傫�ȗt���ς�";
		mes "���Ă��Ă��郄�C�ɂ��܂��B";
		mes "��낵�����肢���܂��B";
		set YGG_7QUE,1;
		setquest 2183;
		delquest 70370;
		close;
	case 3:
	case 9:
		mes "[�O���k�C��]";
		mes "��͂��炦�܂������H";
		next;
		menu "�Ԃɂ��Ă��܂���",-;
		mes "[�O���k�C��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���򉻑��u��";
		mes "����Ԃɂ��Ă��ꂽ��ł��ˁB";
		mes "������܂��B";
		emotion 2;
		next;
		mes "[�O���k�C��]";
		mes "����ł͑����A";
		mes "���̋@�B�ō��������܂��傤�B";
		if(YGG_7QUE == 3)
			set YGG_7QUE,4;
		else if(YGG_7QUE == 9)
			set YGG_7QUE,10;
		setquest 2184;
		delquest 70605;
		delitem 6079,1;
		close;
	case 4:
	case 10:
		mes "�]�@�B���A�[���u�w�C���̉Ԃ�";
		mes "�@�����͂񂵂āA";
		mes "�@�G�L�X�𒊏o���Ă���]";
		next;
		if(rand(1,10) < 8) {
			mes "[�O���k�C��]";
			mes "���������ł��B";
			mes "����������Ƒ҂��Ă��������ˁB";
			close;
		}
		mes "�]�G�L�X�̒��o���I������炵��";
		mes "�@�@�B����u�U�[�������]";
		next;
		mes "[�O���k�C��]";
		mes "�ł��܂����I";
		mes "^3131FF�A�[���u�w�C���̍���^000000�ł��I";
		next;
		mes "�]�O���k�C����";
		mes "�@�����̓������������]";
		next;
		mes "[�O���k�C��]";
		mes "�͂��c�c";
		mes "�����ł��A���̓����ł��B";
		mes "�A�[���u�w�C���̓����c�c";
		mes "�v���o����c�c";
		next;
		mes "[�O���k�C��]";
		mes "������5�ł��܂����B";
		mes "���͒p���������̂�";
		mes "���Ȃ������̍�����";
		mes "���m�B�ɂ������Ă����Ă��������B";
		next;
		mes "[�O���k�C��]";
		mes "���������n���܂��B";
		mes "�ǂ������m�����̐S��";
		mes "�����Ă����Ă��������B";
		if(checkitemblank() == 0) {
			next;
			mes "[�O���k�C��]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������ˁB";
			close;
		}
		if(YGG_7QUE == 4)
			set YGG_7QUE,5;
		else if(YGG_7QUE == 10)
			set YGG_7QUE,11;
		getitem 6082,5;
		delquest 2184;
		setquest 70610;
		close;
	case 5:
	case 11:
		if(countitem(6082) > 0) {
			mes "[�O���k�C��]";
			mes "�A�[���u�w�C���̍�����";
			mes "�ǂ������m�����̐S��";
			mes "�����Ă����Ă��������B";
			close;
		}
		mes "[�O���k�C��]";
		mes "�ǂ��ł������H";
		mes "���m�����͖������Ă���܂������H";
		next;
		mes "�]���Ȃ����������]";
		next;
		mes "[�O���k�C��]";
		mes "���C�ɂȂ�����ł��ˁI";
		mes "�ǂ������c�c";
		next;
		mes "[�O���k�C��]";
		mes "�ł��܂��z�[���V�b�N�ɂȂ��Ă���";
		mes "���m�����͂������񂢂�͂��ł��B";
		mes "���̕��m�����̂��߂ɂ�";
		mes "�������͑����܂��傤�ˁB";
		next;
		mes "[�O���k�C��]";
		mes "�{����";
		mes "���肪�Ƃ��������܂����B";
		mes "���Ȃ��ɂ͊��ӂ̋C������";
		mes "�����ς��ł��B";
		next;
		mes "[�O���k�C��]";
		mes "���ׂȕ��ł����A";
		mes "����͎�����̋C�����ł��B";
		mes "�ǂ����󂯎���Ă��������B";
		getitem 6081,3;
		set YGG_7QUE,6;
		setquest 2186;
		delquest 70640;
		//setquest 70645;
		//compquest 70645;
		delquest 70620;
		delquest 70621;
		delquest 70622;
		delquest 70623;
		delquest 70624;
		delquest 70625;
		delquest 70626;
		next;
		mes "[�O���k�C��]";
		mes "�����悩������";
		mes "�܂���`���Ă���܂��񂩁H";
		mes "�����x�񂾂�";
		mes "�܂����Ă����Ɗ������ł��B";
		close;
	case 6:
		if(checkquest2(2186)) {
			if(!(checkquest2(2186) & 0x2)) {
				mes "[�O���k�C��]";
				mes "�����悩������";
				mes "�܂���`���Ă���܂��񂩁H";
				mes "�����x�񂾂�";
				mes "�܂����Ă����Ɗ������ł��B";
				close;
			}
			delquest 2186;
		}
		mes "[�O���k�C��]";
		mes "�����A����͂��肪�Ƃ��������܂����B";
		mes "�܂������������";
		mes "���m�ɓ͂�������ł��B";
		mes "��`���Ă��炦�܂��񂩁H";
		next;
		if(select("�����ł���","���͖����ł�") == 2) {
			mes "[�O���k�C��]";
			mes "�����ł����c�c";
			mes "���Ԃ��ł������`���Ă��������ˁB";
			mes "���肢���܂��B";
			close;
		}
		mes "[�O���k�C��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���������m������";
		mes "�̋��A�[���u�w�C���̓�����";
		mes "�͂��Ė����Ă����܂��傤�B";
		next;
		mes "[�O���k�C��]";
		mes "�ł̓t���[��������";
		mes "���������ė��Ă��������B";
		next;
		mes "[�O���k�C��]";
		mes "�t���[������";
		mes "����Ɍ�����傫�ȗt���ς�";
		mes "���Ă��Ă��郄�C�ɂ��܂��B";
		mes "��낵�����肢���܂��B";
		set YGG_7QUE,7;
		setquest 2183;
		close;
	default:
		mes "[�O���k�C��]";
		mes "�ŋߕ��m�����̊炪�Â���B";
		mes "�����ƌ̋��ɋA�肽���̂ˁc�c";
		close;
	}
}

spl_in02,139,65,3	script	�t���[����	438,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�d��]";
		mes "NeiKoFulo�@An";
		mes "DielOdesMush�@Or";
		mes "KoDanaOsa�@Ir";
		mes "FarBurnes�@Ir";
		close;
	}
	switch(YGG_7QUE) {
	case 1:
		mes "�]�U�炩���Ă��镔���̒���";
		mes "�@�d�����Q�Ă���]";
		next;
		mes "�]���Ȃ��̋C�z���������̂�";
		mes "�@�d���͖ڂ��o�܂����]";
		next;
		mes "[�t���[����]";
		mes "��c�c";
		mes "���Ȃ��͒N�H";
		emotion 45;
		next;
		mes "[�t���[����]";
		mes "�������Ƃ̂Ȃ��푰�c�c";
		mes "�ŋߌ��ꂽ�َ푰������c�c";
		next;
		menu "�O���k�C���ɗ��܂�āc�c",-;
		mes "[�t���[����]";
		mes "�O���k�C���ɗ��܂�āH";
		mes "���Ă��Ƃ́A";
		mes "�Ԃ̎���悱���A";
		mes "���Č��ˁB";
		next;
		mes "[�t���[����]";
		mes "�َ푰�ɗ��ވʂ�����";
		mes "����ۂǗ~�����̂ˁc�c";
		next;
		mes "[�t���[����]";
		mes "�d���Ȃ��c�c";
		mes "���T���܂��傤�B";
		next;
		mes "�]�t���[�����͖ڂ�������Ȃ���";
		mes "�@�����̒����ɂ���";
		mes "�@�S�~�̎R��������o�����]";
		next;
		mes "[�t���[����]";
		mes "���Ȃ݂ɂ���c�c";
		mes "���u����B";
		mes "���̐����ɕK�v�Ȃ��̂�����B";
		mes "�S�~�̎R�Ƃ��v���Ă��Ȃ���ˁH";
		next;
		mes "�]�K�T�K�T�c�c�]";
		emotion 9;
		next;
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		emotion 9;
		next;
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		emotion 5;
		next;
		mes "[�t���[����]";
		mes "��������A��B";
		next;
		mes "[�t���[����]";
		mes "���ꂪ��������΁A";
		mes "�A�[���u�w�C���̉ԂɂȂ��B";
		mes "��������������Ԃɂ��Ă���";
		mes "�O���k�C���ɓ͂��Ă����āB";
		next;
		menu "��������܂ő҂�ł����H",-;
		mes "[�t���[����]";
		mes "�������A�m��Ȃ��񂾂ˁc�c";
		next;
		mes "[�t���[����]";
		mes "���̊X�ɂˁA�������";
		mes "�L�m�R�^�̒�������̒m���Ă���H";
		mes "����͊��򉻑��u�Ȃ񂾁B";
		next;
		mes "[�t���[����]";
		mes "���򉻑��u��";
		mes "�A���𐬒������邱�Ƃ��ł���񂾁B";
		mes "������̉��ɒu���Ă݂āB";
		next;
		menu "�킩��܂���",-;
		mes "[�t���[����]";
		mes "�͂��A���ꂠ����B";
		mes "�@";
		mes "�]����󂯎�����]";
		next;
		mes "[�t���[����]";
		mes "���򉻑��u��";
		mes "���̊X��6�ʂ������C������B";
		mes "����̂ǂ�ł���������B";
		next;
		mes "[�t���[����]";
		mes "���ꂶ��A���Q��ˁB";
		mes "���₷�݂Ȃ����B";
		set YGG_7QUE,2;
		delquest 2183;
		setquest 70600;
		close;
	case 2:
	case 8:
		mes "[�t���[����]";
		mes "���򉻑��u��";
		mes "���̊X��6�ʂ������C������B";
		mes "����̂ǂ�ł���������B";
		next;
		mes "[�t���[����]";
		mes "�ӂ킟�����c�c";
		mes "���x�݂Ȃ����c�c";
		close;
	case 7:
		mes "�]�t���[�������Q�Ă���]";
		next;
		mes "�]���Ȃ��̋C�z���������̂�";
		mes "�@�t���[�����͖ڂ��o�܂����]";
		next;
		mes "[�t���[����]";
		mes "�ӂ������c�c";
		mes "�܂������́H";
		emotion 45;
		next;
		mes "[�t���[����]";
		mes "�킪�~������ł��傤�H";
		next;
		menu "�͂�",-;
		mes "[�t���[����]";
		mes "^a9a9a9�c�c";
		mes "���A�푈�Ɋւ��̂���������";
		mes "�����ƐQ���ӂ肵�Ă���񂾂�B";
		mes "�c�c";
		mes "�ق��Ƃ��Ăق����c�c^000000";
		next;
		menu "���������܂������H",-;
		mes "[�t���[����]";
		mes "������A���ł��Ȃ��c�c";
		mes "���A�����Ɠ����Ă��邾��������B";
		mes "������Ƒ҂��ĂˁB";
		next;
		mes "�]�K�T�K�T�c�c�]";
		emotion 9;
		next;
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		emotion 9;
		next;
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		mes "�]�K�T�K�T�c�c�]";
		emotion 5;
		next;
		mes "[�t���[����]";
		mes "��������A��B";
		next;
		mes "[�t���[����]";
		mes "���ꂪ��������΁A";
		mes "�A�[���u�w�C���̉ԂɂȂ��B";
		mes "�Ԃɂ��Ă���";
		mes "�O���k�C���ɓ͂��Ă����āB";
		next;
		mes "[�t���[����]";
		mes "�����̂������A�����m���Ă����ˁH";
		mes "���򉻑��u�̉���";
		mes "���u���Ă݂āB";
		next;
		mes "[�t���[����]";
		mes "�͂��A�󂯎���āB";
		mes "�@";
		mes "�]����󂯎�����]";
		next;
		mes "[�t���[����]";
		mes "���򉻑��u��";
		mes "���̊X��6�ʂ������C������B";
		mes "����̂ǂ�ł���������B";
		next;
		mes "[�t���[����]";
		mes "���ꂶ��A���Q��ˁB";
		mes "���₷�݂Ȃ����B";
		set YGG_7QUE,8;
		delquest 2183;
		setquest 70600;
		close;
	default:
		mes "�]�C�����悳�����ɐQ�Ă���B";
		mes "�@�ז����Ȃ��ł������]";
		close;
	}
}

splendide,160,265,3	script	���򉻑��u#ygg	844,{
	if(YGG_7QUE != 2 && YGG_7QUE != 8) {
		mes "�]�L�m�R�^�̒�����������Ă���]";
		close;
	}
	mes "�]�t���[�����������������";
	mes "�@��̕��ɒu����";
	mes "�@���򉻑��u�̌��ɓ��Ă��]";
	next;
	mes "�]�킪�܂΂䂢������]";
	misceffect 14,"";
	next;
	mes "�]�킩��肪�o�āA";
	mes "�@��u�ŉԂ܂Ő��������]";
	if(checkitemblank() == 0) {
		next;
		mes "�]�A�C�e�������������̂悤���B";
		mes "�@�A�C�e���̎�ސ������炵�Ă���";
		mes "�@�܂����ׂ悤�]";
		close;
	}
	getitem 6079,1;
	if(YGG_7QUE == 2)
		set YGG_7QUE,3;
	else if(YGG_7QUE == 8)
		set YGG_7QUE,9;
	delquest 70600;
	setquest 70605;
	close;
}

splendide,262,262,3	duplicate(���򉻑��u#ygg)	���򉻑��u	844
splendide,262,187,3	duplicate(���򉻑��u#ygg)	���򉻑��u	844
splendide,164,82,3	duplicate(���򉻑��u#ygg)	���򉻑��u	844
splendide,171,116,3	duplicate(���򉻑��u#ygg)	���򉻑��u	844
splendide,134,280,3	duplicate(���򉻑��u#ygg)	���򉻑��u	844

splendide,205,139,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70630) & 0x8) {
			if(checkquest2(70620) & 0x8) {
				mes "[���m]";
				mes "���肪�Ƃ��B";
				mes "���񂽂̂������ŋC�������y�ɂȂꂽ�B";
				mes "�܂����̐S���܂ꂻ���ɂȂ�����";
				mes "�����̓������������Ă���B";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "�₠�A�v���Ԃ肾�ˁI";
				mes "���̑O�͖{���ɂ��肪�Ƃ��B";
				mes "�A�[���u�w�C�����v���o������B";
				next;
				mes "[���m]";
				mes "�c�c�ŋ߂ˁA";
				mes "�܂��C��������������ł������";
				mes "�����������Ă���";
				mes "�������Ăق����񂾁B";
				mes "�܂����������d�ǂ���ȁB";
				close;
			}
			mes "[���m]";
			mes "�₠�A�v���Ԃ肾�ˁI";
			mes "���̑O�͖{���ɂ��肪�Ƃ��B";
			mes "�A�[���u�w�C�����v���o������B";
			next;
			mes "[���m]";
			mes "�c�c�ŋ߂ˁA";
			mes "�܂��C��������������ł������";
			mes "�����������Ă���";
			mes "�������Ăق����񂾁B";
			mes "�܂����������d�ǂ���ȁB";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "���̓����́c�c�c";
			mes "�̋��́A";
			mes "�A�[���u�w�C���̓�����!!";
			mes "����������!!";
			mes "�s�v�c�Ɨ͂������Ă���I";
			next;
			mes "[���m]";
			mes "���܂ł̈Â������C������";
			mes "����Ă����̂�������c�c";
			mes "�{���ɏ���������B";
			mes "�A�[���u�w�C���̓�����";
			mes "�������Ă���Ă��肪�Ƃ��I";
			emotion 18;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70620;
			compquest 70620;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70620) & 0x8) {
			mes "[���m]";
			mes "���肪�Ƃ��B";
			mes "���񂽂̂������ŋC�������y�ɂȂꂽ�B";
			mes "�܂����̐S���܂ꂻ���ɂȂ�����";
			mes "�����̓������������Ă���B";
			close;
		}
		mes "[���m]";
		mes "�ʖڂ��c�c";
		mes "�ŋߌ̋��̃A�[���u�w�C����";
		mes "�������Ăǂ����悤���Ȃ��c�c";
		mes "����Ȃ񂶂�ʖڂ��c�c";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "���̓����́c�c�c";
		mes "�̋��́A";
		mes "�A�[���u�w�C���̓�����!!";
		mes "����������!!";
		mes "�s�v�c�Ɨ͂������Ă���I";
		next;
		mes "[���m]";
		mes "���܂ł̈Â������C������";
		mes "����Ă����̂�������c�c";
		mes "�{���ɏ���������B";
		mes "�A�[���u�w�C���̓�����";
		mes "�������Ă���Ă��肪�Ƃ��I";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70620;
		compquest 70620;
		setquest 70630;
		compquest 70630;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�ʖڂ��c�c";
		mes "�ŋߌ̋��̃A�[���u�w�C����";
		mes "�������Ăǂ����悤���Ȃ��c�c";
		mes "����Ȃ񂶂�ʖڂ��c�c";
		close;
	}
}

splendide,181,135,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "Guppa�@Gapopn�@Bubibi";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70631) & 0x8) {
			if(checkquest2(70621) & 0x8) {
				mes "[���m]";
				mes "�������������Ă���Ă��肪�Ƃ��B";
				mes "�̋����v���o���Ċ����������Ȃ��B";
				mes "�܂����x�A�������������ĂˁB";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "���̑O�͍������������Ă����";
				mes "���肪�Ƃ��B";
				mes "�c�c�Ƃ���ł��A";
				mes "���̍������������";
				mes "������x�������Ă���Ȃ����ȁB";
				mes "�҂��Ă����B";
				close;
			}
			mes "[���m]";
			mes "���̑O�͍������������Ă����";
			mes "���肪�Ƃ��B";
			mes "�c�c�Ƃ���ł��A";
			mes "���̍����������Ă���ł����񂾂��ǁA";
			mes "������x�������Ă���Ȃ����ȁB";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "���킠���I";
			mes "������ăA�[���u�w�C���̓����I";
			mes "������!!";
			next;
			mes "[���m]";
			mes "�A�[���u�w�C�����v���o����c�c";
			mes "�l�A�A�[���u�w�C���̂��߂ɂ�";
			mes "�撣��Ȃ�����I";
			emotion 18;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70621;
			compquest 70621;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70621) & 0x8) {
			mes "[���m]";
			mes "�������������Ă���Ă��肪�Ƃ��B";
			mes "�̋����v���o���Ċ����������Ȃ��B";
			mes "�܂����x�A�������������ĂˁB";
			close;
		}
		mes "[���m]";
		mes "�͂��c�c�A";
		mes "�̋��̃A�[���u�w�C���ɋA�肽���c�c";
		mes "�T�t�@���̔؍s��";
		mes "�~�߂Ȃ����Ⴂ���Ȃ��̂�";
		mes "�킩���Ă��邯�ǁA";
		mes "�̋��ɋA�肽���񂾁c�c";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "���킠���I";
		mes "������ăA�[���u�w�C���̓����I";
		mes "������!!";
		next;
		mes "[���m]";
		mes "�A�[���u�w�C�����v���o����c�c";
		mes "�l�A�A�[���u�w�C���̂��߂ɂ�";
		mes "�撣��Ȃ�����I";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70621;
		compquest 70621;
		setquest 70631;
		compquest 70631;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�͂��c�c�A";
		mes "�̋��̃A�[���u�w�C���ɋA�肽���c�c";
		mes "�T�t�@���̔؍s��";
		mes "�~�߂Ȃ����Ⴂ���Ȃ��̂�";
		mes "�킩���Ă��邯�ǁA";
		mes "�̋��ɋA�肽���񂾁c�c";
		close;
	}
}

splendide,139,178,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70632) & 0x8) {
			if(checkquest2(70622) & 0x8) {
				mes "[���m]";
				mes "���Ȃ��̂�������";
				mes "�A�[���u�w�C�����v���o���܂����B";
				mes "�S���犴�ӂ��܂��B";
				mes "�c�c";
				mes "��͂�̋��Ƃ�";
				mes "���������̂Ȃ����̂ł��ˁB";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "����ɂ��́B";
				mes "���̑O�͂��肪�Ƃ��������܂����B";
				mes "�ǂ���������肵�Ă����Ă��������B";
				next;
				mes "[���m]";
				mes "�c�c";
				mes "�����悩������ł����̂ł����A";
				mes "����̍����A������x";
				mes "�������Ă���܂��񂩁H";
				mes "��������ł����̂ł����B";
				close;
			}
			mes "[���m]";
			mes "����ɂ��́B";
			mes "���̑O�͂��肪�Ƃ��������܂����B";
			mes "�ǂ���������肵�Ă����Ă��������B";
			next;
			mes "[���m]";
			mes "�c�c";
			mes "�����悩������ł����̂ł����A";
			mes "����̍����A������x";
			mes "�������Ă���܂��񂩁H";
			mes "�����悩������ł����̂ł��c�c";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "��c�c";
			mes "���̍���́A�܂����H";
			mes "�̋��A�[���u�w�C���̍���I";
			next;
			mes "[���m]";
			mes "�����A�Ȃ�Ƃ������Ƃ��낤�B";
			mes "���̍���������������Ȃ̂ɁA";
			mes "�A�[���u�w�C���̕��i���ڂɕ����ԁc�c";
			next;
			mes "[���m]";
			mes "�c�c";
			mes "�َ푰�̕���B";
			mes "�{���ɂ��肪�Ƃ��������܂��B";
			mes "���̂悤�ȋC�����ɂȂ��Ȃ�āA";
			mes "���ӂ��Ă����ӂ�����܂���c�c";
			emotion 18;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70622;
			compquest 70622;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70622) & 0x8) {
			mes "[���m]";
			mes "���₠�A�������������Ă����";
			mes "���肪�ƂȁB";
			mes "�ق�Ə���������B";
			mes "������Ɛ��_�I��";
			mes "���Ă��܂��Ă������炳�B";
			mes "�܂��������������Ă����ȁB";
			close;
		}
		mes "[���m]";
		mes "�ӂ��c�c";
		next;
		mes "�]���m�͉����ڂ����Ȃ���";
		mes "�@���ߑ��������]";
		next;
		mes "[���m]";
		mes "����͎���A";
		mes "���ߑ��Ȃǂ��Ă��܂��āB";
		mes "�c�c";
		mes "�����A�̋������������āA";
		mes "���������Ďd���Ȃ��̂ł��B";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "��c�c";
		mes "���̍���́A�܂����H";
		mes "�̋��A�[���u�w�C���̍���I";
		next;
		mes "[���m]";
		mes "�����A�Ȃ�Ƃ������Ƃ��낤�B";
		mes "���̍���������������Ȃ̂ɁA";
		mes "�A�[���u�w�C���̕��i���ڂɕ����ԁc�c";
		next;
		mes "[���m]";
		mes "�c�c";
		mes "�َ푰�̕���B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���̂悤�ȋC�����ɂȂ��Ȃ�āA";
		mes "���ӂ��Ă����ӂ�����܂���c�c";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70622;
		compquest 70622;
		setquest 70632;
		compquest 70632;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�������l����|���A�ƂɋA��Ȃ��ẮI";
		close;
	}
}

splendide,164,188,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70633) & 0x8) {
			if(checkquest2(70623) & 0x8) {
				mes "[���m]";
				mes "���₠�A�������������Ă����";
				mes "���肪�ƂȁB";
				mes "�ق�Ə���������B";
				mes "������Ɛ��_�I��";
				mes "���Ă��܂��Ă������炳�B";
				mes "�܂��������������Ă����ȁB";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "���A�܂����Ă��ꂽ�ˁI";
				mes "���̑O�͍������������Ă����";
				mes "�ق�Ə���������B";
				mes "����ς�̋���";
				mes "�ō��ɂ������񂾂�Ȃ��B";
				mes "����Ă݂ď��߂Ă킩������B";
				next;
				mes "[���m]";
				mes "�Ƃ���ł��A";
				mes "�܂�������������炩�����ĂˁB";
				mes "�y���݂ɂ��Ă��邩��B";
				close;
			}
			mes "[���m]";
			mes "���A�܂����Ă��ꂽ�ˁI";
			mes "���̑O�͍������������Ă����";
			mes "�ق�Ə���������B";
			mes "����ς�̋���";
			mes "�ō��ɂ������񂾂�Ȃ��B";
			mes "����Ă݂ď��߂Ă킩������B";
			next;
			mes "[���m]";
			mes "�Ƃ���ŁA";
			mes "�܂��������������Ă���Ȃ��H";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "�c�c�Ȃ񂾁H";
			mes "���̓����c�c";
			mes "�A�[���u�w�C���̓�������Ȃ����I";
			mes "�����A���������̋��̍���`�B";
			next;
			mes "[���m]";
			mes "��΂��A�܂��c�c";
			mes "�����A���̋����Ă���Ƃ���";
			mes "���Ȃ��ł����I";
			mes "�������ɍs���Ă���I";
			mes "�c�c";
			mes "�ł��A�{���ɂ��肪�Ƃȁc�c";
			emotion 28;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70623;
			compquest 70623;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70623) & 0x8) {
			mes "[���m]";
			mes "���₠�A�������������Ă����";
			mes "���肪�ƂȁB";
			mes "�ق�Ə���������B";
			mes "������Ɛ��_�I��";
			mes "���Ă��܂��Ă������炳�B";
			mes "�܂��������������Ă����ȁB";
			close;
		}
		mes "[���m]";
		mes "�̋��̃A�[���u�w�C�������������c�c";
		mes "�͂₭�킢���I��点��";
		mes "�A�[���u�w�C���ɋA�肽���B";
		mes "�Ƃ�����荡�����A�肽��!!";
		next;
		mes "�]���m���՗����Ă���]";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "�c�c�Ȃ񂾁H";
		mes "���̓����c�c";
		mes "�A�[���u�w�C���̓�������Ȃ����I";
		mes "�����A���������̋��̍���`�B";
		next;
		mes "[���m]";
		mes "��΂��A�܂��c�c";
		mes "�����A���̋����Ă���Ƃ���";
		mes "���Ȃ��ł����I";
		mes "�������ɍs���Ă���I";
		mes "�c�c";
		mes "�ł��A�{���ɂ��肪�Ƃȁc�c";
		emotion 28;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70623;
		compquest 70623;
		setquest 70633;
		compquest 70633;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�̋��̃A�[���u�w�C�������������c�c";
		mes "�͂₭�킢���I��点��";
		mes "�A�[���u�w�C���ɋA�肽���B";
		mes "�Ƃ�����荡�����A�肽��!!";
		next;
		mes "�]���m���՗����Ă���]";
		close;
	}
}

splendide,177,257,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70634) & 0x8) {
			if(checkquest2(70624) & 0x8) {
				mes "[���m]";
				mes "�������������Ă���Ă��肪�Ƃ�I";
				mes "�܂��̋��̓�����";
				mes "���������Ȃ邾�낤����";
				mes "���̎��́A�܂������Ă��Ă����I";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "����A���񂽁I";
				mes "���̑O�͂��肪�ƂȁI";
				mes "�{���Ɋ��ӂ��Ă���񂾂��B";
				mes "���񂽂��v���Ă���";
				mes "100�{�ȏ㊴�ӂ��Ă���I";
				next;
				mes "[���m]";
				mes "�����炳�A����������x";
				mes "�������������Ă���Ȃ��H";
				mes "���ނ�!!";
				mes "100�{�Ƃ͌��킸�A";
				mes "1000�{���ӂ��邩��I";
				close;
			}
			mes "[���m]";
			mes "����A���񂽁I";
			mes "���̑O�͂��肪�ƂȁI";
			mes "�{���Ɋ��ӂ��Ă���񂾂��B";
			mes "���񂽂��v���Ă���";
			mes "100�{�ȏ㊴�ӂ��Ă���I";
			next;
			mes "[���m]";
			mes "�����炳�A������x";
			mes "�������������Ă���Ȃ��H";
			mes "���ނ�!!";
			mes "100�{�Ƃ͌��킸�A";
			mes "1000�{���ӂ��邩��I";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "���c!!";
			mes "����͂��ꂶ��Ȃ��̂��c�c";
			mes "�����A�A�[���u�w�C���̓���!!";
			mes "�̋��̉������������c�c";
			next;
			mes "[���m]";
			mes "�������[�K��!!";
			mes "�������A�撣�邼!!";
			mes "�撣���C�����Ă������I";
			emotion 18;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70624;
			compquest 70624;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70624) & 0x8) {
			mes "[���m]";
			mes "�������������Ă���Ă��肪�Ƃ�I";
			mes "�܂��̋��̓�����";
			mes "���������Ȃ邾�낤����";
			mes "���̎��́A�܂������Ă��Ă����I";
			close;
		}
		mes "[���m]";
		mes "���[�A�������E�����I";
		mes "�����A�[���u�w�C���ɋA���Ă���[�I";
		mes "�̋��ɋA�点��[�I";
		next;
		mes "�]���m����l�ő����ł���]";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "���c!!";
		mes "����͂��ꂶ��Ȃ��̂��c�c";
		mes "�����A�A�[���u�w�C���̓���!!";
		mes "�̋��̉������������c�c";
		next;
		mes "[���m]";
		mes "�������[�K��!!";
		mes "�������A�撣�邼!!";
		mes "�撣���C�����Ă������I";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70624;
		compquest 70624;
		setquest 70634;
		compquest 70634;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "���[�A�̋��ɋA�肽�����B";
		close;
	}
}

splendide,124,212,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70635) & 0x8) {
			if(checkquest2(70625) & 0x8) {
				mes "[���m]";
				mes "�������������Ă���Ă��肪�Ƃ��B";
				mes "�̋����v���o���Ċ����������Ȃ��B";
				mes "�܂����x�A�������������ĂˁB";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "�����A�N�I";
				mes "���̑O�͖{���ɂ��肪�ƂˁI";
				mes "�{���ɏ��������񂾂�B";
				mes "���̎��A�l�A�������Ă����񂾁B";
				next;
				mes "[���m]";
				mes "�����A���̍����������ł��Ȃ�������";
				mes "��ςȂ��ƂɂȂ��Ă��܂���";
				mes "��������Ȃ��B";
				mes "�{���ɌN�ɂ͊��ӂ���I";
				next;
				mes "[���m]";
				mes "���̍����A�{���ɗǂ������Ȃ��B";
				mes "�c�c";
				mes "�˂��A������x������";
				mes "�������Ă���Ȃ����ȁH";
				mes "���������܂��Ă���ł������炳�B";
				close;
			}
			mes "[���m]";
			mes "�����A�N�I";
			mes "���̑O�͖{���ɂ��肪�ƂˁI";
			mes "�{���ɏ��������񂾂�B";
			mes "���̎��A�l�A�������Ă����񂾁B";
			next;
			mes "[���m]";
			mes "�����A���̍����������ł��Ȃ�������";
			mes "��ςȂ��ƂɂȂ��Ă��܂���";
			mes "��������Ȃ��B";
			mes "�{���ɌN�ɂ͊��ӂ���I";
			next;
			mes "[���m]";
			mes "���̍����A�{���ɗǂ������Ȃ��B";
			mes "�c�c";
			mes "�˂��A������x������";
			mes "�������Ă���Ȃ����ȁH";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "����A���̍���́c�c";
			mes "�ԈႢ�Ȃ��I";
			mes "�A�[���u�w�C�����I";
			next;
			mes "[���m]";
			mes "�����A���������B";
			mes "�{���ɉ���������c�c";
			mes "���������C���o�Ă���c�c!!";
			emotion 18;
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70625;
			compquest 70625;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70625) & 0x8) {
			mes "[���m]";
			mes "�N�̂�������";
			mes "�A�[���u�w�C���̕��i��";
			mes "���̒��őh������I";
			mes "�l�A�撣�ꂻ�����I";
			close;
		}
		mes "[���m]";
		mes "�ŋ߁A�̋��A�[���u�w�C���̂��Ƃ�";
		mes "���������ς��Ȃ񂾁B";
		mes "���������A�肽����c�c";
		next;
		mes "[���m]";
		mes "�ł��A�݂�ȓ����󋵂�";
		mes "�撣���Ă���񂾂�ˁB";
		mes "�l���䖝���Ȃ�����c�c";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "����A���̍���́c�c";
		mes "�ԈႢ�Ȃ��I";
		mes "�A�[���u�w�C�����I";
		next;
		mes "[���m]";
		mes "�����A���������B";
		mes "�{���ɉ���������c�c";
		mes "���������C���o�Ă���c�c!!";
		emotion 18;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70625;
		compquest 70625;
		setquest 70635;
		compquest 70635;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�ŋ߁A�̋��A�[���u�w�C���̂��Ƃ�";
		mes "���������ς��Ȃ񂾁B";
		close;
	}
}

splendide,196,153,5	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "CyaResehr";
		close;
	}
	switch(YGG_7QUE) {
	case 5:
	case 11:
		if(checkquest2(70636) & 0x8) {
			if(checkquest2(70626) & 0x8) {
				mes "[���m]";
				mes "���ꂩ��̂̒��q���悢�B";
				mes "���񂽂ɂ͗��������B";
				mes "�悯��΂܂��������������Ă���B";
				mes "�܂��̋��̂��Ƃ����ɕ�����łȁB";
				close;
			}
			if(countitem(6082) < 1) {
				mes "[���m]";
				mes "���ꂩ��̂̒��q���悢�B";
				mes "���񂽂ɂ͗��������B";
				mes "�悯��΂܂��������������Ă���B";
				mes "�܂��̋��̂��Ƃ����ɕ�����łȁB";
				close;
			}
			mes "[���m]";
			mes "���ꂩ��̂̒��q���悢�B";
			mes "���񂽂ɂ͗��������B";
			mes "�悯��΂܂��������������Ă���B";
			mes "�܂��̋��̂��Ƃ����ɕ�����łȁB";
			next;
			if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
				mes "�]���͂�߂Ă������]";
				close;
			}
			mes "�]���Ȃ���";
			mes "�@�A�[���u�w�C���̍�����";
			mes "�@���m�ɂ������]";
			misceffect 83;
			next;
			mes "[���m]";
			mes "���̓����́A";
			mes "�A�[���u�w�C���̓������c�c";
			mes "���̂��A�����M���Ȃ�c�c";
			mes "�@";
			mes "�]���m�̖j�ɗ܂��`�����]";
			emotion 28;
			next;
			mes "[���m]";
			mes "�������A";
			mes "���͌̋��ɋA�肽�������̂��c�c";
			mes "���̓�����������";
			mes "�S����������Ă�����B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�A�[���u�w�C���̍�����";
			mes "���m�̐S��������Ƃ��ł����j";
			delitem 6082,1;
			setquest 70626;
			compquest 70626;
			if(checkquest2(70610)) {
				delquest 70610;
				setquest 70611;
			} else if(checkquest2(70611)) {
				delquest 70611;
				setquest 70612;
			} else if(checkquest2(70612)) {
				delquest 70612;
				setquest 70613;
			} else if(checkquest2(70613)) {
				delquest 70613;
				setquest 70614;
			} else if(checkquest2(70614)) {
				delquest 70614;
				setquest 70640;
			}
			close;
		}
		if(checkquest2(70626) & 0x8) {
			mes "[���m]";
			mes "���񂽂ɂ͗�������B";
			mes "�����ł��C�Â��Ȃ��������A";
			mes "���̎������̊Ԃɂ�";
			mes "�̋��ɋA�肽���Ȃ��Ă����̂��ȁB";
			close;
		}
		mes "[���m]";
		mes "�ŋ߁A���̑̂̒��q�����������B";
		mes "���_�I�ɂ��������������Ȃ��B";
		mes "�����āA���̂�";
		mes "�̋��̂��Ƃ����ɕ����Ԃ񂾁B";
		if(countitem(6082) < 1) {
			close;
		}
		next;
		if(select("�A�[���u�w�C���̍������g��","�A�[���u�w�C���̍������g��Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]���Ȃ���";
		mes "�@�A�[���u�w�C���̍�����";
		mes "�@���m�ɂ������]";
		misceffect 83;
		next;
		mes "[���m]";
		mes "���̓����́A";
		mes "�A�[���u�w�C���̓������c�c";
		mes "���̂��A�����M���Ȃ�c�c";
		mes "�@";
		mes "�]���m�̖j�ɗ܂��`�����]";
		emotion 28;
		next;
		mes "[���m]";
		mes "�������A";
		mes "���͌̋��ɋA�肽�������̂��c�c";
		mes "���̓�����������";
		mes "�S����������Ă�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�A�[���u�w�C���̍�����";
		mes "���m�̐S��������Ƃ��ł����j";
		delitem 6082,1;
		setquest 70626;
		compquest 70626;
		setquest 70636;
		compquest 70636;
		if(checkquest2(70610)) {
			delquest 70610;
			setquest 70611;
		} else if(checkquest2(70611)) {
			delquest 70611;
			setquest 70612;
		} else if(checkquest2(70612)) {
			delquest 70612;
			setquest 70613;
		} else if(checkquest2(70613)) {
			delquest 70613;
			setquest 70614;
		} else if(checkquest2(70614)) {
			delquest 70614;
			setquest 70640;
		}
		close;
	default:
		mes "[���m]";
		mes "�ŋߑ̂̒��q�����������B";
		mes "�x��ł͂���񂾂��c�c";
		close;
	}
}

//============================================================
// �}�k�N�̃����X�^�[�����N�G�X�g
//- Registry -------------------------------------------------
// YGG_8QUE -> 0�`2
//------------------------------------------------------------
manuk,252,116,3	script	�X�g����	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�������ȋ��l]";
		mes "�΁偾?�@�́@����?";
		mes "���ځ@�΁@?";
		mes "���..?";
		close;
	}
	switch(YGG_8QUE) {
	case 0:
		mes "[�������ȋ��l]";
		mes "�͂��߂܂��āA���̕��B";
		mes "���Ȃ��͍ŋߌ��ꂽ�Ƃ���";
		mes "�l�Ԃƌ����푰�ł��ˁB";
		next;
		mes "[�X�g����]";
		mes "���̓T�t�@����^FF0000�K���g��^000000�A";
		mes "�X�g�����Ɛ\���܂��B";
		mes "�K���g���Ƃ́A";
		mes "�T�t�@�����O�G������";
		mes "�������������҂��w����ł���B";
		next;
		mes "[�X�g����]";
		mes "�c�c";
		mes "�Ƃ���Ől�ԂƂ����푰�́A";
		mes "�������Č���Ǝセ���Ɍ����܂��ˁB";
		next;
		mes "[�X�g����]";
		mes "��̂悤�Ɋ��Ȕ畆��";
		mes "�����ł��Ȃ���";
		mes "�͂����肻���ɂȂ��c�c";
		next;
		mes "[�X�g����]";
		mes "�Ӂ[�ށA";
		mes "�悭�����܂�";
		mes "���ǂ蒅�������̂��B";
		next;
		mes "[�X�g����]";
		mes "�����Ă����܂ŗ��ꂽ�̂�";
		mes "��ՂƂ��������悤���Ȃ��B";
		mes "���ɐl�ԂƂ͕s�v�c�Ȏ푰�ł��B";
		next;
		mes "�]�X�g������";
		mes "�@���ӂ͂Ȃ��̂��낤���A";
		mes "�@���J����Ă���悤�ȋC�����]";
		next;
		if(select("�l�Ԃ͎キ�Ȃ��ł��I","��������") == 2) {
			mes "[�X�g����]";
			mes "����ł́A�@������";
			mes "�܂�������܂��傤�B";
			close;
		}
		mes "[�X�g����]";
		mes "�c�c";
		mes "�����⎄�̌�������";
		mes "�C�ɏ��܂������H";
		next;
		mes "[�X�g����]";
		mes "����͎���c�c";
		mes "��������������͂Ȃ��̂ł��B";
		next;
		mes "[�X�g����]";
		mes "�����A�������ƈႢ�A";
		mes "���܂�ɔ�͂Ɍ��������̂ŁA";
		mes "�����Ȋ��z�������������Ȃ̂ł��B";
		mes "�C�ɂȂ���ʂ悤�B";
		next;
		mes "�]���Ȃ��̓X�g�����ɁA";
		mes "�@�l�Ԃ̈�l��l�̗͂�";
		mes "�@�X�g�����̌����ʂ�ア�Ƃ��Ă��A";
		mes "�@�݂��Ɏx�������A���͂��邱�Ƃ�";
		mes "�@�f���炵���͂𐶂ݏo�����Ƃ�";
		mes "�@�ł��邱�Ƃ�b�����]";
		next;
		mes "[�X�g����]";
		mes "�c�c";
		mes "�ӂނӂށA�Ȃ�قǁB";
		next;
		mes "[�X�g����]";
		mes "�l�Ԃɂ͂��̂悤��";
		mes "����������̂ł����B";
		mes "�f���炵�����Ƃ��B";
		next;
		mes "[�X�g����]";
		mes "�c�c";
		mes "�܂��A������";
		mes "���͂��̋�����������ł͂Ȃ��̂�";
		mes "���Ƃ������܂���B";
		next;
		mes "�]���Ȃ��́A";
		mes "�@�ǂ�����ΐl�Ԃ̗͂�";
		mes "�@�F�߂Ă����̂�";
		mes "�@�X�g�����ɐq�˂��]";
		next;
		if(YGG_2QUE < 23) {	// ��̎푰�N�G�X�g
			mes "[�X�g����]";
			mes "���i�ł���΁A";
			mes "���ɊQ���Ȃ������X�^�[�ł�";
			mes "�ގ����Ă��炤�̂ł����A";
			mes "^FF0000���͓��ɂ������������X�^�[^000000��";
			mes "���܂��񂩂�ˁB";
			next;
			mes "[�X�g����]";
			mes "�܂��A�������߂�";
			mes "�܂����Ă��������B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�Q���Ȃ������X�^�[�c�c";
			mes "�T�t�@���ł���m��Ȃ��ꏊ�ł�";
			mes "������΁A����ȃ����X�^�[��";
			mes "����邩������Ȃ��B";
			mes "���͏o�������j";
			close;
		}
		mes "[�X�g����]";
		mes "�����ł��ˁA";
		mes "�ŋߔ������ꂽ�ƌ���";
		mes "���A��m���Ă��܂����H";
		next;
		menu "���A�H",-;
		mes "[�X�g����]";
		mes "�͂��B";
		mes "�X�m�[�����Ƃ�����҂�";
		mes "���̎푰�Ɉē�����āA";
		mes "�����������A�������ł��B";
		next;
		menu "�͂��A�m���Ă܂�",-;
		mes "[�X�g����]";
		mes "���́A�������̒��Ԃ�";
		mes "���̓��A�𒲍����Ɍ��������̂ł����A";
		mes "^4d4dff���^�g�X�N^000000��";
		mes "^4d4dff�h�D�l�C�[��^000000�Ƃ���";
		mes "�׈��ȃI�[�����������X�^�[��";
		mes "����𕉂킳�ꂽ�̂ł��B";
		next;
		mes "[�X�g����]";
		mes "����^4d4dff���^�g�X�N^000000��";
		mes "^4d4dff�h�D�l�C�[��^000000��";
		mes "�|���ė��Ă���܂��񂩁H";
		mes "��������΁A�l�Ԃ������ƌ������Ƃ�";
		mes "�F�߂܂��傤�B";
		set YGG_8QUE,1;
		setquest 7074;
		setquest 7075;
		delquest 70371;
		close;
	case 1:
		if( (checkquest2(7074) & 0x4) && (checkquest2(7075) & 0x4) ) {
			mes "[�X�g����]";
			mes "�����A���Ȃ����B";
			mes "�ǂ����܂������H";
			next;
			mes "�]���^�g�X�N�ƃh�D�l�C�[����";
			mes "�@�|�������Ƃ�`�����]";
			next;
			mes "[�X�g����]";
			mes "���^�g�X�N�ƃh�D�l�C�[�����c�c�H";
			next;
			mes "�]���Ȃ����������]";
			next;
			mes "[�X�g����]";
			mes "�Ȃ�ƁI";
			mes "���̃����X�^�[��|���Ƃ́I";
			next;
			mes "[�X�g����]";
			mes "���̖ڂ������";
			mes "���^�g�X�N�ƃh�D�l�C�[����";
			mes "�|�������Ƃ�";
			mes "�^���ł��邱�Ƃ��킩��܂��B";
			next;
			mes "[�X�g����]";
			mes "�l�Ԃ̗͂��^��������";
			mes "���l�т������܂��B";
			next;
			mes "[�X�g����]";
			mes "���Ȃ��͎����F�߂��E�m�ł��B";
			mes "���̃}�k�N�ɂ��ł����Ă��������B";
			mes "���}�������܂��B";
			next;
			mes "[�X�g����]";
			mes "��낵�����";
			mes "������󂯎���Ă��������B";
			mes "���ɗ��͂��ł��B";
			if(checkitemblank() == 0) {
				next;
				mes "[�X�g����]";
				mes "����A�ו������������̂悤��";
				mes "�i��n�����Ƃ��ł��܂���ˁB";
				mes "�ו��̎�ނ����炵�Ă���";
				mes "�܂��b�������Ă��������B";
				close;
			}
			delquest 7074;
			delquest 7075;
			set YGG_8QUE,2;
			getitem 6080,50;
			if(checkre())
				getexp 100000,60000;
			else
				getexp 1000000,600000;
			setquest 200895;
			close;
		}
		mes "[�X�g����]";
		mes "�����ł��ˁA";
		mes "�ŋߔ������ꂽ�ƌ���";
		mes "���A��m���Ă��܂����H";
		next;
		mes "[�X�g����]";
		mes "�������̒��Ԃ�";
		mes "���̓��A�𒲍����Ɍ��������̂ł����A";
		mes "^4d4dff���^�g�X�N^000000��";
		mes "^4d4dff�h�D�l�C�[��^000000�Ƃ���";
		mes "�׈��ȃI�[�����������X�^�[��";
		mes "����𕉂킳�ꂽ�̂ł��B";
		next;
		mes "[�X�g����]";
		mes "����^4d4dff���^�g�X�N^000000��";
		mes "^4d4dff�h�D�l�C�[��^000000��";
		mes "�|���ė��Ă���܂��񂩁H";
		mes "��������΁A�l�Ԃ������ƌ������Ƃ�";
		mes "�F�߂܂��傤�B";
		next;
		menu "�킩��܂���",-;
		mes "[�X�g����]";
		mes "���̃����X�^�[��";
		mes "���Ȃ�̋����̂悤�ł��B";
		mes "�������Ȃ���ʂ悤�B";
		close;
	case 2:
		mes "[�X�g����]";
		mes "�l�ԂƂ͋����푰�ł��ȁB";
		mes "���Ȃ��͎����F�߂��E�m�ł��B";
		mes "���̃}�k�N�ɂ��ł����Ă��������B";
		mes "���}�������܂��B";
		close;
	}
}

//============================================================
// �u���f�B�E���N�G�X�g
//- Registry -------------------------------------------------
// YGG_9QUE -> 0�`2
//------------------------------------------------------------
man_in01,378,276,3	script	�H�w��	453,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�H�w��]";
		mes "�燔?";
		mes "��́ʁ@�ȁ@����!";
		mes "�����ځ@��...�@�恿�� ���@���.";
		close;
	}
	switch(YGG_9QUE) {
	case 0:
		mes "[�H�w��]";
		mes "����A����͒������ł��ˁB";
		mes "�����Ɉَ푰������Ȃ�āB";
		next;
		mes "[�H�w��]";
		mes "�����͍z���������ł��B";
		mes "���O�̒ʂ�A";
		mes "�z���̌��������Ă���{�݂ł��B";
		mes "�{�����܂藧��������̂�";
		mes "�D�܂����Ȃ��̂ł����c�c";
		next;
		mes "[�H�w��]";
		mes "�c�c";
		mes "�܂��A�����ł��傤�B";
		mes "�����̊Ǘ��҂ł��鎄��";
		mes "�����������܂���B";
		mes "���͋@���ɂ���悤�ȕ���";
		mes "����܂��񂵂ˁB";
		next;
		mes "[�H�w��]";
		mes "�������������̂ł�����A";
		mes "�z���ɂ��Ęb�𕷂��Ă����܂��񂩁H";
		mes "�َ푰�̕��Ƃ��b������@���";
		mes "�����Ȃ��ł�����B";
		next;
		if(select("�������Ă�������","���������ł�") == 2) {
			mes "[�H�w��]";
			mes "�����ł����A�c�O�ł��B";
			mes "�����A�������ꂽ�u���f�B�E��";
			mes "�ɂ��Ēm�肽���Ȃ�����";
			mes "�܂��b�������Ă��������B";
			close;
		}
		mes "[�H�w��]";
		mes "����ł́A";
		mes "�T�t�@���̖��̌��ł���";
		mes "�u���f�B�E���ɂ��Ęb���܂��傤�B";
		next;
		mes "[�H�w��]";
		mes "�u���f�B�E���Ƃ�";
		mes "����^FF0000���g�D���փC��^000000��";
		mes "�̌@�ł���z�΂ł��B";
		mes "�u���f�B�E�������";
		mes "���ʂȕ��������o�����̂ł��B";
		next;
		mes "[�H�w��]";
		mes "���B�T�t�@���͕s���̕a��";
		mes "�������Ă���̂ł����A";
		mes "���̕�����̂Ɏ�荞�ނ��Ƃ�";
		mes "�a�̐i�s��}���邱�Ƃ��ł��A";
		mes "���B�͐����Ă�����̂ł��B";
		next;
		mes "[�H�w��]";
		mes "�܂��Ƀu���f�B�E����";
		mes "�T�t�@���̖��Ƃ�������̂ł��傤�B";
		next;
		mes "[�H�w��]";
		mes "�������A�ŋ�";
		mes "�u���f�B�E�����̌@�ł���";
		mes "�z�R�̈���p�z�ɂȂ�A";
		mes "�S�̂̍̌@�ʂ����Ȃ��Ȃ����̂ł��B";
		next;
		mes "[�H�w��]";
		mes "���̂Ƃ�����͂Ȃ��̂ł����A";
		mes "�X�g�b�N��������";
		mes "�z�������͂���܂���B";
		mes "���̓u���f�B�E���̃X�g�b�N��";
		mes "���₵�Ă����ׂ����Ǝv���̂ł��B";
		next;
		mes "[�H�w��]";
		mes "����^FF0000�u���f�B�E���S�[����^000000�Ƃ���";
		mes "�����X�^�[��|���Ă��A";
		mes "^FF0000�������ꂽ�u���f�B�E��^000000��";
		mes "����ł���̂ł��B";
		next;
		mes "[�H�w��]";
		mes "���Ƃ��Ă�";
		mes "�u���f�B�E���S�[������|����";
		mes "�������ꂽ�u���f�B�E����";
		mes "���肵�����̂ł����c�c";
		next;
		if(select("��ɓ���܂��傤���H","�撣���Ă�������") == 2) {
			mes "[�H�w��]";
			mes "�����A���Ƃ�����";
			mes "�������ꂽ�u���f�B�E����";
			mes "���肵�悤�Ǝv���܂��B";
			close;
		}
		mes "[�H�w��]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "�َ푰�̃T�t�@���̂��߂Ȃ̂Ɂc�c";
		mes "���Ȃ��͑f���炵�����ł��I";
		next;
		mes "[�H�w��]";
		mes "����ł�";
		mes "^FF0000�������ꂽ�u���f�B�E��^000000��^0000FF20��^000000";
		mes "�W�߂ė��Ă��������B";
		mes "������񂨗�͂������܂���B";
		set YGG_9QUE,1;
		setquest 7079;
		delquest 70372;
		close;
	case 1:
		if(countitem(6090) < 20) {
			mes "[�H�w��]";
			mes "^FF0000�������ꂽ�u���f�B�E��^000000��^0000FF20��^000000";
			mes "�W�߂��玝���Ă��Ă��������B";
			mes "��낵�����肢�������܂��B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�H�w��]";
			mes "����A�ו������������ł��ˁB";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		mes "[�H�w��]";
		mes "�������ꂽ�u���f�B�E����";
		mes "�����Ă��Ă��ꂽ��ł��ˁB";
		mes "���肪�Ƃ��������܂��I";
		mes "�@";
		mes "�]�������ꂽ�u���f�B�E����n�����]";
		delitem 6090, 20;
		set YGG_9QUE,2;
		chgquest 7079,7080;
		if(checkre())
			getexp 4000,4000;
		else
			getexp 40000,40000;
		getitem 6080,3;
		next;
		mes "[�H�w��]";
		mes "����̕i���󂯎���Ă��������B";
		mes "�{���ɂ���J�l�ł����B";
		mes "�������x�݂��������B";
		next;
		mes "[�H�w��]";
		mes "�x��ł���Ō��\�Ȃ̂�";
		mes "�����A�܂����肢�ł���Ȃ��";
		mes "�܂��������ꂽ�u���f�B�E��";
		mes "���W�߂Ă��Ē��������ł��B";
		mes "������񂨗�͂������܂��B";
		close;
	case 2:
		if(checkquest2(7080)) {
			mes "[�H�w��]";
			mes "����́A";
			mes "�������ꂽ�u���f�B�E����";
			mes "�W�߂Ē����Ă��肪�Ƃ��������܂����B";
			next;
			mes "[�H�w��]";
			mes "�\����Ȃ��̂ł����A";
			mes "�܂��A���Ȃ���";
			mes "�������ꂽ�u���f�B�E����";
			mes "�����Ă��Ē��������̂ł��B";
			next;
			mes "[�H�w��]";
			mes "�������ł�����A";
			mes "�b�������Ă��������B";
			delquest 7080;
			close;
		}
		mes "[�H�w��]";
		mes "�܂����Ȃ���";
		mes "�������ꂽ�u���f�B�E����";
		mes "�W�߂Ă��Ē��������̂ł��B";
		mes "���x�����肢���Đ\����Ȃ��ł����A";
		mes "������낵�����肢�������܂��B";
		next;
		if(select("�����ł���","���͖����ł�") == 2) {
			mes "[�H�w��]";
			mes "�����ł����A�c�O�ł��c�c";
			close;
		}
		mes "[�H�w��]";
		mes "�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "�َ푰�̃T�t�@���̂��߂Ȃ̂Ɂc�c";
		mes "���Ȃ��͑f���炵�����ł��I";
		next;
		mes "[�H�w��]";
		mes "����ł�";
		mes "^FF0000�������ꂽ�u���f�B�E��^000000��^0000ff20��^000000";
		mes "�W�߂ė��Ă��������B";
		mes "^FF0000�u���f�B�E���S�[����^000000��|����";
		mes "^FF0000�������ꂽ�u���f�B�E��^000000��";
		mes "����ł��܂��B";
		set YGG_9QUE,1;
		setquest 7079;
		close;
	}
}

//============================================================
// �~�b�h�K���h�嗤�̍z�΃N�G�X�g
//- Registry -------------------------------------------------
// YGG_10QUE -> 0�`4, 100
//------------------------------------------------------------
man_in01,372,221,5	script	�w��	449,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�w��]";
		mes "�́聿�@��@�������@���@����";
		mes "�ʁ��ʁ@����?��?�ʁ���";
		mes "�@������?��?�����@���@�΁���";
		mes "�@���@�������@���@�΁@��";
		close;
	}
	switch(YGG_10QUE) {
	case 0:
		mes "�]���l���������������Ă������A";
		mes "�@���Ȃ������邱�ƂɋC�Â�";
		mes "�@�b�������Ă����]";
		next;
		mes "[���w�K�[�h]";
		mes "���҂����Ă���܂����B";
		mes "�~�b�h�K���h�嗤���痈���يE�l�B";
		mes "���̓��w�K�[�h�ƌ����܂��B";
		next;
		menu "�҂��Ă����H",-;
		mes "[���w�K�[�h]";
		mes "�͂��B";
		mes "�~�b�h�K���h�嗤�̕���";
		mes "���Ђ��肢���������Ƃ�����̂ł��B";
		next;
		if(select("�b���Ă�������","���͖Z�����̂ł܂����܂�") == 2) {
			mes "[���w�K�[�h]";
			mes "�����ł����A�c�O�ł��c�c";
			mes "���Ԃ��o������";
			mes "�K�����Ă��������B";
			mes "���Ȃ��ɂ��肢���������Ƃ�";
			mes "����̂ł��B";
			close;
		}
		mes "[���w�K�[�h]";
		mes "�͂��A���������̑O��";
		mes "�T�t�@���̗��j�ɂ��Ęb���܂��傤�B";
		mes "�b�����������ꂩ��";
		mes "���Ȃ��ɗ��ނ��Ƃ̏d�傳��";
		mes "�������Ē�����͂��ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�y���́A���鋐�l���͑�^���ɂ��";
		mes "��Ő��O�܂Œǂ����܂�܂����B";
		mes "���̎��A�����c�������l";
		mes "�x���Q���~��������";
		mes "���B�̑c��Ȃ̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�����āA��c�ł��邻�̋��l��";
		mes "���̒n�ɂ��ǂ�����̂ł��B";
		mes "��ł����������l���ł����A";
		mes "���������������āA���ł͂��̒ʂ�";
		mes "�ɉh�����߂����Ƃ��ł��܂����B";
		next;
		mes "[���w�K�[�h]";
		mes "�c�c";
		mes "�������A���鎞����";
		mes "�a�����s�肾�����̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "��������ɂ��";
		mes "�̂��΂̂悤�ɍd���Ȃ��Ă����A";
		mes "�؂̂悤�Ɍ͂�A";
		mes "�₪�Ă͋����ʂĂ�s���̕a�B";
		mes "�c�c";
		mes "�������̕a�ɂ������Ă��܂��B";
		next;
		mes "[���w�K�[�h]";
		mes "�����̎҂����̕a�̋]���ɂȂ�܂����B";
		mes "���̕a�����Â��邽�߂ɁA";
		mes "�Ȋw�ҒB�ɂ�茤�����d�˂��";
		mes "��̉������@����������܂����B";
		next;
		mes "[���w�K�[�h]";
		mes "���̕��@�Ƃ́A";
		mes "����^0000ff���g�D���w�C��^000000�ɑ��݂���";
		mes "^FF0000�u���f�B�E��^000000�Ƃ����z�΂���";
		mes "���o����镨����";
		mes "�̓��ɒ������邱�Ƃł��B";
		next;
		mes "[���w�K�[�h]";
		mes "���̕�����̓��ɒ�������΁A";
		mes "�a�̐i�s���x���ꎞ�I��";
		mes "�~�߂邱�Ƃ��ł���A";
		mes "�ƕ��������̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�T�t�@���̂قƂ�ǂ�";
		mes "���̕a�ɂ������Ă���̂ł��B";
		mes "�F�A�u���f�B�E���𒍓����A";
		mes "�a�̐i�s���~�߂Ă���̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�������A�u���f�B�E����������";
		mes "�������������ł��傤�B";
		mes "����ł��������̕a����������";
		mes "����������K�v������܂��B";
		next;
		mes "[���w�K�[�h]";
		mes "���͂��̕����̊����ɂ�";
		mes "�܂��������Ԃ��K�v����";
		mes "�l���Ă����̂ł����A";
		mes "���Ȃ����يE�l�����̒n�ɗ���";
		mes "�傫�Ȑi�W���������̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "���̍z�΂����Ă��������B";
		mes "�@";
		mes "�]���w�K�[�h�͂��Ȃ��ɐ΂��������]";
		next;
		mes "[���w�K�[�h]";
		mes "�������O�ɂ��̃}�k�N��";
		mes "^0000ff�~�b�h�K���h�嗤^000000�Ƃ����n����";
		mes "�يE�l�̒����c�������̂ł��B";
		mes "���Ȃ��̂悤�ɂ��̎w�ւ�����";
		mes "�����Ɍ��t��b���܂����B";
		next;
		mes "[���w�K�[�h]";
		mes "���̒��ɁA";
		mes "���[���~�b�h�K�b�c�����A";
		mes "�V���o���c�o���h���a���A";
		mes "�A���i�x���c�����Ƃ�������";
		mes "�����ҒB�����܂����B";
		next;
		mes "[���w�K�[�h]";
		mes "���̌����ҒB�́A";
		mes "���B�̃u���f�B�E���̌��������āA";
		mes "�����̍��ɂ���Ƃ����z�΂�";
		mes "�����Ă��Ă��ꂽ�̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�O�������ꂼ��̍z�΂𒲂ׂĂ݂��";
		mes "�����ׂ��������������̂ł��I";
		mes "���B�𒷔N�ꂵ�߂Ă������̕a��";
		mes "�킸���Ȃ���ł����A";
		mes "���ʂ�����ꂽ�̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "���A�������w�҂̊Ԃł́A";
		mes "���Ȃ����̐��E�~�b�h�K���h�ɂ�";
		mes "���B�̕a�������ł��镨����";
		mes "���݂���̂ł́A";
		mes "�Ɗ��҂����܂��Ă���̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�����ł��Ȃ��ɂ��肢������̂ł��B";
		mes "^FF0000�~�b�h�K���h�嗤�ɂ���z�΂�";
		mes "�����Ă��Ă������������̂ł�^000000�B";
		mes "�����ҒB�ɂ�������z�΂�";
		mes "�S�Č����Ɏg���Ă��܂��܂����B";
		next;
		mes "[���w�K�[�h]";
		mes "����Ȃ��Ƃ𗊂��";
		mes "���Ȃ��ɂ͖��f��������܂���B";
		mes "�������A�T�t�@���̖�����";
		mes "�������Ă���̂ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "���̗��݂𕷂��Ē�����Ȃ�";
		mes "������x�A���ɘb�������Ă��������B";
		mes "���Ȃ��ɂ��̗��݂�";
		mes "�����Ē����邱�Ƃ��肢�܂��B";
		set YGG_10QUE,1;
		setquest 70550;
		delquest 70373;
		close;
	case 1:
		if(checkquest2(2182)) {
			if(!(checkquest2(2182) & 0x2)) {
				mes "[���w�K�[�h]";
				mes "�~�b�h�K���h�嗤�̍z�΂�";
				mes "�����Ă��Ă�������";
				mes "���肪�Ƃ��������܂����B";
				mes "����Ō������i�߂��܂��B";
				next;
				mes "[���w�K�[�h]";
				mes "�������A���̃~�b�h�K���h�嗤�̍z�΂�";
				mes "�����̂��߂Ɏg���̂�";
				mes "�����ɂȂ��Ȃ��Ă��܂��ł��傤�B";
				mes "�ł�����A";
				mes "�܂��z�΂������Ă��ė~�����ł��B";
				mes "�������ł�����b�������Ă��������B";
				close;
			}
			delquest 2182;
		}
		mes "[���w�K�[�h]";
		mes "�b�������Ă��ꂽ�Ƃ������Ƃ�";
		mes "�����󂯂Ă���������̂ł��ˁB";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[���w�K�[�h]";
		mes "�܂�������󂯎���Ă��������B";
		mes "���̌g�їp������g���A";
		mes "�z�΂��̌@���Ă��Ă��������B";
		next;
		if(checkitemblank() == 0) {
			mes "[���w�K�[�h]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		mes "[���w�K�[�h]";
		mes "���͎��}��";
		mes "^FF0000�V���o���c�o���h���a���̌�����^000000";
		mes "�������Ă��Ă��ꂽ�z�΂�";
		mes "�����������̂ł��B";
		set YGG_10QUE,3;
		setquest 2180;
		getitem 6076,1;
		next;
		mes "[���w�K�[�h]";
		mes "�����҂�^FF0000�h���S�����Z��ł���Ύ���^000000��";
		mes "�̌@�����ƌ����Ă��܂����B";
		mes "����^FF00005��^000000���x����Ώ\���ł��B";
		next;
		mes "[���w�K�[�h]";
		mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
		mes "�����قǓn�����g�їp�����";
		mes "���ɗ��͂��ł��B";
		mes "^FF0000�h���S�����Z��ł���Ύ���^000000�ɍs���΁A";
		mes "�z�΂̂��肩�������Ă����͂��ł��B";
		close;
	case 2:
		if(countitem(6077) < 10) {
			mes "[���w�K�[�h]";
			mes "���[���~�b�h�K�b�c������";
			mes "�����҂������Ă����z�΂�";
			mes "���ׂ����̂ł��B";
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�~�����j�[���R��^000000�ō̌@����";
			mes "�ƌ����Ă��܂����B";
			mes "^FF000010��^000000�W�߂Ē����Ȃ��ł��傤���H";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "^0000ff�g�їp���^000000���g���Ă��������B";
			mes "��낵�����肢�������܂��B";
			close;
		}
		mes "[���w�K�[�h]";
		mes "�����Ă��Ă���܂������I";
		mes "���肪�Ƃ��������܂��I";
		mes "�~�b�h�K���h�嗤�ō̌@����";
		mes "^FF0000�z�΂�S�Ă��������܂��傤�B^000000";
		next;
		mes "�]�~�b�h�K���h�嗤�̍z�΂�";
		mes "�@�g�їp�����";
		mes "�@���w�K�[�h�ɓn�����]";
		next;
		mes "[���w�K�[�h]";
		mes "����͎�����̋C�����ł��B";
		mes "�󂯎���Ă��������B";
		if(checkitemblank() == 0) {
			next;
			mes "[���w�K�[�h]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		delitem 6077,countitem(6077);
		delitem 6078,countitem(6078);
		delitem 6076,countitem(6076);
		set YGG_10QUE,100;
		getitem 6080,3;
		chgquest 2179,2182;
		next;
		mes "[���w�K�[�h]";
		mes "���[���~�b�h�K�b�c�����ɂ���Ƃ���";
		mes "���̍z�΂�����΁A";
		mes "���B�̕a������������";
		mes "�����邱�Ƃ��ł��܂��B";
		mes "�K�������𐬌������Č����܂���B";
		close;
	case 3:
		if(countitem(6077) < 5) {
			mes "[���w�K�[�h]";
			mes "�V���o���c�o���h���a����";
			mes "�����҂������Ă��Ă��ꂽ�z�΂�";
			mes "�����Ă��Ă��������Ȃ��ł��傤���B";
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�h���S�����Z��ł���Ύ���^000000�ō̌@����";
			mes "�ƌ����Ă��܂����B";
			mes "����^FF00005��^000000���x����Ώ\���ł��B";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "^0000ff�g�їp���^000000���g�p���Ă��������B";
			close;
		}
		mes "[���w�K�[�h]";
		mes "�����Ă��Ă���܂������I";
		mes "���肪�Ƃ��������܂��I";
		mes "�~�b�h�K���h�嗤�ō̌@����";
		mes "^FF0000�z�΂�S�Ă��������܂��傤�B^000000";
		next;
		mes "�]�~�b�h�K���h�嗤�̍z�΂�";
		mes "�@�g�їp�����";
		mes "�@���w�K�[�h�ɓn�����]";
		next;
		mes "[���w�K�[�h]";
		mes "����͎�����̋C�����ł��B";
		mes "�󂯎���Ă��������B";
		if(checkitemblank() == 0) {
			next;
			mes "[���w�K�[�h]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		delitem 6077,countitem(6077);
		delitem 6078,countitem(6078);
		delitem 6076,countitem(6076);
		set YGG_10QUE,100;
		getitem 6080,3;
		chgquest 2180,2182;
		next;
		mes "[���w�K�[�h]";
		mes "���Ȃ��������Ă��Ă��ꂽ";
		mes "���̃V���o���c�o���h���a���̍z�΁B";
		mes "��΂ɖ��ʂɂ��܂����B";
		mes "�K�������𐬌������Č����܂��B";
		close;
	case 4:
		if(countitem(6077) < 5) {
			mes "[���w�K�[�h]";
			mes "�A���i�x���c������";
			mes "�����҂������Ă��Ă��ꂽ�z�΂�";
			mes "�����Ă��Ă��������Ȃ��ł��傤���B";
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�g�[���ΎR�O�̎R�n^000000�ō̌@����";
			mes "�ƌ����Ă��܂����B";
			mes "����^FF00005��^000000���x����Ώ\���ł��B";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "^0000ff�g�їp���^000000���g�p���Ă��������B";
			close;
		}
		mes "[���w�K�[�h]";
		mes "�����Ă��Ă���܂������I";
		mes "���肪�Ƃ��������܂��I";
		mes "�~�b�h�K���h�嗤�ō̌@����";
		mes "^FF0000�z�΂�S�Ă��������܂��傤�B^000000";
		next;
		mes "�]�~�b�h�K���h�嗤�̍z�΂�";
		mes "�@�g�їp�����";
		mes "�@���w�K�[�h�ɓn�����]";
		next;
		mes "[���w�K�[�h]";
		mes "����͎�����̋C�����ł��B";
		mes "�󂯎���Ă��������B";
		if(checkitemblank() == 0) {
			next;
			mes "[���w�K�[�h]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		delitem 6077,countitem(6077);
		delitem 6078,countitem(6078);
		delitem 6076,countitem(6076);
		set YGG_10QUE,100;
		getitem 6080,3;
		chgquest 2181,2182;
		next;
		mes "[���w�K�[�h]";
		mes "�����A���̃A���i�x���c������";
		mes "�z�΂��g�p����";
		mes "������i�߂����Ă��炢�܂��B";
		mes "�{���ɏ�����܂����B";
		close;
	case 100:
		if(checkquest2(2182)) {
			if(!(checkquest2(2182) & 0x2)) {
				mes "[���w�K�[�h]";
				mes "�~�b�h�K���h�嗤�̍z�΂�";
				mes "�����Ă��Ă�������";
				mes "���肪�Ƃ��������܂����B";
				mes "����Ō������i�߂��܂��B";
				next;
				mes "[���w�K�[�h]";
				mes "�������A���̃~�b�h�K���h�嗤�̍z�΂�";
				mes "�����̂��߂Ɏg���̂�";
				mes "�����ɂȂ��Ȃ��Ă��܂��ł��傤�B";
				mes "�ł�����A";
				mes "�܂��z�΂������Ă��ė~�����ł��B";
				mes "�������ł�����b�������Ă��������B";
				close;
			}
			delquest 2182;
		}
		mes "[���w�K�[�h]";
		mes "�����p�Ɏg�p���Ă��܂��A";
		mes "�~�b�h�K���h�嗤�̍z�΂�";
		mes "�S�ĂȂ��Ȃ��Ă��܂��܂����c�c";
		next;
		mes "[���w�K�[�h]";
		mes "�܂�������󂯎���Ă��������B";
		mes "���̌g�їp������g���A";
		mes "�z�΂��̌@���Ă��Ă��������B";
		next;
		if(checkitemblank() == 0) {
			mes "[���w�K�[�h]";
			mes "�ו������������̂悤�ł���B";
			mes "����ł͓n�����Ƃ͏o���܂���";
			mes "�ו��̎�ނ����炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		switch(rand(3)) {
		case 0:
			mes "[���w�K�[�h]";
			mes "���x��";
			mes "^FF0000���[���~�b�h�K�b�c�����̌�����^000000";
			mes "�������Ă��Ă��ꂽ�z�΂�";
			mes "�����Ă��Ă��������Ȃ��ł��傤���B";
			set YGG_10QUE,2;
			setquest 2179;
			getitem 6076,1;
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�~�����j�[���R��^000000";
			mes "�ō̌@�����ƌ����Ă��܂����B";
			mes "^FF000010��^000000�W�߂Ē����Ȃ��ł��傤���H";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "�����قǓn�����g�їp�����";
			mes "���ɗ��͂��ł��B";
			mes "^FF0000�~�����j�[���R��^000000�ɍs���΁A";
			mes "�z�΂̂��肩�������Ă����͂��ł��B";
			close;
		case 1:
			mes "[���w�K�[�h]";
			mes "���x��";
			mes "^FF0000�V���o���c�o���h���a���̌�����^000000";
			mes "�������Ă��Ă��ꂽ�z�΂�";
			mes "�����Ă��Ă��������Ȃ��ł��傤���B";
			set YGG_10QUE,3;
			setquest 2180;
			getitem 6076,1;
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�h���S�����Z��ł���Ύ���^000000��";
			mes "�̌@�����ƌ����Ă��܂����B";
			mes "����^FF00005��^000000���x����Ώ\���ł��B";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "�����قǓn�����g�їp�����";
			mes "���ɗ��͂��ł��B";
			mes "^FF0000�h���S�����Z��ł���Ύ���^000000�ɍs���΁A";
			mes "�z�΂̂��肩�������Ă����͂��ł��B";
			close;
		case 2:
			mes "[���w�K�[�h]";
			mes "���x��";
			mes "^FF0000�A���i�x���c�����̌�����^000000";
			mes "�������Ă��Ă��ꂽ�z�΂�";
			mes "�����Ă��Ă��������Ȃ��ł��傤���B";
			set YGG_10QUE,4;
			setquest 2181;
			getitem 6076,1;
			next;
			mes "[���w�K�[�h]";
			mes "�����҂�^FF0000�g�[���ΎR�O�̎R�n^000000�ō̌@����";
			mes "�ƌ����Ă��܂����B";
			mes "^FF00005��^000000�W�߂Ē����Ȃ��ł��傤���H";
			next;
			mes "[���w�K�[�h]";
			mes "�~�b�h�K���h�嗤�̍z�΂�T�����߂ɂ�";
			mes "�����قǓn�����g�їp�����";
			mes "���ɗ��͂��ł��B";
			mes "^FF0000�g�[���ΎR�O�̎R�n^000000�ɍs���΁A";
			mes "�z�΂̂��肩�������Ă����͂��ł��B";
			close;
		}
	}
}

mjolnir_01,364,256,0	script	#mj01_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,32,309,1,0x00FF00;
		viewpoint 1,217,34,2,0x00FF00;
		close;
	}
	end;
}

mjolnir_01,32,309,3	script	#mj01_01	111,7,7,{
	if(YGG_10QUE == 2 && countitem(6076) > 0) {
		if(countitem(6077) >= 10) {
			mes "�]���w�K�[�h�Ɍ���ꂽ��";
			mes "�@�~�b�h�K���h�嗤�̍z�΂��W�߂��B";
			mes "�@����ȏ�̌@����K�v�͂Ȃ����낤�B";
			mes "�@���w�K�[�h�ɍz�΂�";
			mes "�@�����Ă������]";
			close;
		}
		progressbar "FFFF00",4;
		if(checkitemblank() == 0) {
			mes "�]�����A�C�e���̎�ސ������E��";
			mes "�@�A�C�e������肷�邱�Ƃ��ł��Ȃ��B";
			mes "�@�A�C�e���̎�ސ������炵��";
			mes "�@�܂����ׂ悤�]";
			close;
		}
		if(rand(1,6) < 4) {
			mes "�]���Ȃ��͍̌@�Ɏ��s���A";
			mes "�@�����̐΂̔j�Ђ���ɓ������]";
			getitem 6078,1;
			close;
		}
		mes "�]�̌@�ɐ��������I�]";
		emotion 5,"";
		set .@rand,rand(1,5);
		if(.@rand == 5)
			getitem 6077,5;
		else if(.@rand == 1)
			getitem 6077,2;
		else
			getitem 6077,1;
		initnpctimer;
		disablenpc strnpcinfo(0);
		next;
		mes "�]^FF0000���΂炭���Ȃ���";
		mes "�@�̌@�ł��Ȃ������B";
		mes "�@�����҂Ƃ�^000000�]";
		close;
	}
	end;
OnTouch:
	if(YGG_10QUE == 2 && countitem(6076) > 0)
		misceffect 342;
	end;
OnTimer60000:
	enablenpc strnpcinfo(0);
	stopnpctimer;
	end;
}

mjolnir_01,217,35,3	duplicate(#mj01_01)	#mj01_02	139,7,7

mjolnir_02,313,289,0	script	#mj02_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,90,195,1,0x00FF00;
		viewpoint 1,206,187,2,0x00FF00;
		close;
	}
	end;
}

mjolnir_02,78,258,0		duplicate(#mj02_find_1)	#mj02_find_2	139,5,5

mjolnir_02,90,195,3		duplicate(#mj01_01)	#mj02_01	111,5,10
mjolnir_02,206,187,3	duplicate(#mj01_01)	#mj02_02	111,7,7

mjolnir_03,76,258,0		script	#mj03_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�c�c";
		next;
		mes "�]�g�їp����������������Ȃ��B";
		mes "�@�ǂ���炱�̒n��ɂ�";
		mes "�@���߂�z�΂͂Ȃ��悤���]";
		close;
	}
	end;
}

mjolnir_03,227,204,0	duplicate(#mj03_find_1)	#mj03_find_2	139,5,5

mjolnir_04,147,208,0	script	#mj04_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,125,380,1,0x00FF00;
		viewpoint 1,220,130,2,0x00FF00;
		close;
	}
	end;
}

mjolnir_04,160,77,0		duplicate(#mj04_find_1)	#mj04_find_2	139,5,5
mjolnir_04,361,174,0	duplicate(#mj04_find_1)	#mj04_find_3	139,5,5

mjolnir_04,125,380,3	duplicate(#mj01_01)	#mj04_01	111,7,7
mjolnir_04,220,130,3	duplicate(#mj01_01)	#mj04_02	111,7,7

mjolnir_05,82,171,0		duplicate(#mj03_find_1)	#mj05_find_1	139,5,5
mjolnir_05,219,375,0	duplicate(#mj03_find_1)	#mj05_find_2	139,5,5

mjolnir_06,28,332,0		duplicate(#mj03_find_1)	#mj06_find_1	139,5,5
mjolnir_06,275,50,0		duplicate(#mj03_find_1)	#mj06_find_2	139,5,5
mjolnir_06,371,78,0		duplicate(#mj03_find_1)	#mj06_find_3	139,5,5

mjolnir_07,26,373,0		duplicate(#mj03_find_1)	#mj07_find_1	139,5,5
mjolnir_07,214,373,0	duplicate(#mj03_find_1)	#mj07_find_2	139,5,5
mjolnir_07,372,355,0	duplicate(#mj03_find_1)	#mj07_find_3	139,5,5
mjolnir_07,375,233,0	duplicate(#mj03_find_1)	#mj07_find_4	139,5,5
mjolnir_07,26,78,0		duplicate(#mj03_find_1)	#mj07_find_5	139,5,5
mjolnir_07,157,25,0		duplicate(#mj03_find_1)	#mj07_find_6	139,5,5

mjolnir_08,39,239,0		duplicate(#mj03_find_1)	#mj08_find_1	139,5,5
mjolnir_08,36,344,0		duplicate(#mj03_find_1)	#mj08_find_2	139,5,5
mjolnir_08,160,349,0	duplicate(#mj03_find_1)	#mj08_find_3	139,5,5
mjolnir_08,359,258,0	duplicate(#mj03_find_1)	#mj08_find_4	139,5,5
mjolnir_08,193,62,0		duplicate(#mj03_find_1)	#mj08_find_5	139,5,5

mjolnir_09,201,355,0	script	#mj09_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,229,214,1,0x00FF00; //50024
		close;
	}
	end;
}

mjolnir_09,38,245,0		duplicate(#mj09_find_1)	#mj09_find_2	139,2,2
mjolnir_09,106,36,0		duplicate(#mj09_find_1)	#mj09_find_3	139,1,1
mjolnir_09,304,36,0		duplicate(#mj09_find_1)	#mj09_find_4	139,1,1
mjolnir_09,369,279,0	duplicate(#mj09_find_1)	#mj09_find_5	139,5,5

mjolnir_09,229,214,3	duplicate(#mj01_01)	#mj09_01	111,10,10

mjolnir_10,201,355,0	script	#mj10_find_1	139,5,5,{
	if(YGG_10QUE == 2 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]�~�����j�[���R���ɓ��������]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,188,260,1,0x00FF00; //50024
		close;
	}
	end;
}

mjolnir_10,374,215,0	duplicate(#mj10_find_1)	#mj10_find_2	139,5,5
mjolnir_10,272,20,0		duplicate(#mj10_find_1)	#mj10_find_3	139,5,5
mjolnir_10,75,22,0		duplicate(#mj10_find_1)	#mj10_find_4	139,5,5
mjolnir_10,27,258,0		duplicate(#mj10_find_1)	#mj10_find_5	139,5,5

mjolnir_10,188,260,3	duplicate(#mj01_01)	#mj10_01	111,10,10

mjolnir_11,29,220,0		duplicate(#mj03_find_1)	#mj11_find_1	139,5,5
mjolnir_11,175,29,0		duplicate(#mj03_find_1)	#mj11_find_2	139,5,5

mjolnir_12,199,370,0	duplicate(#mj03_find_1)	#mj12_find_1	139,5,5
mjolnir_12,44,25,0		duplicate(#mj03_find_1)	#mj12_find_2	139,5,5
mjolnir_12,220,37,0		duplicate(#mj03_find_1)	#mj12_find_3	139,5,5

hu_fild05,335,152,0	script	#hu_find_1	139,5,5,{
	if(YGG_10QUE == 3 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]���̏ꏊ�����w�K�[�h�̌���";
		mes "�@�h���S������������ꏊ�̂悤���]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,251,345,1,0x00FF00;
		viewpoint 1,134,322,2,0x00FF00;
		viewpoint 1,72,104,3,0x00FF00;
		viewpoint 1,65,99,4,0x00FF00;
		viewpoint 1,323,84,5,0x00FF00;
		close;
	}
	end;
}

hu_fild05,251,345,3	script	#hu_01	111,10,10,{
	if(YGG_10QUE == 3 && countitem(6076) > 0) {
		if(countitem(6077) >= 5) {
			mes "�]���w�K�[�h�Ɍ���ꂽ��";
			mes "�@�~�b�h�K���h�嗤�̍z�΂��W�߂��B";
			mes "�@����ȏ�̌@����K�v�͂Ȃ����낤�B";
			mes "�@���w�K�[�h�ɍz�΂�";
			mes "�@�����Ă������]";
			close;
		}
		progressbar "FFFF00",4;
		if(checkitemblank() == 0) {
			mes "�]�����A�C�e���̎�ސ������E��";
			mes "�@�A�C�e������肷�邱�Ƃ��ł��Ȃ��B";
			mes "�@�A�C�e���̎�ސ������炵��";
			mes "�@�܂����ׂ悤�]";
			close;
		}
		if(rand(1,6) < 4) {
			mes "�]���Ȃ��͍̌@�Ɏ��s���A";
			mes "�@�����̐΂̔j�Ђ���ɓ������]";
			getitem 6078,1;
			close;
		}
		mes "�]�̌@�ɐ��������I�]";
		emotion 5,"";
		set .@rand,rand(1,5);
		if(.@rand == 5)
			getitem 6077,5;
		else if(.@rand == 1)
			getitem 6077,2;
		else
			getitem 6077,1;
		initnpctimer;
		disablenpc strnpcinfo(0);
		next;
		mes "�]^FF0000���΂炭���Ȃ���";
		mes "�@�̌@�ł��Ȃ������B";
		mes "�@�����҂Ƃ�^000000�]";
		close;
	}
	end;
OnTouch:
	if(YGG_10QUE == 3 && countitem(6076) > 0)
		misceffect 342;
	end;
OnTimer60000:
	enablenpc strnpcinfo(0);
	stopnpctimer;
	end;
}

hu_fild05,134,322,3	duplicate(#hu_01)	#hu_02	111,10,10
hu_fild05,72,104,3	duplicate(#hu_01)	#hu_03	111,10,10
hu_fild05,65,99,3	duplicate(#hu_01)	#hu_04	111,10,10
hu_fild05,323,84,3	duplicate(#hu_01)	#hu_05	111,10,10

ve_fild03,351,219,0	script	#ve_find_1	139,5,5,{
	if(YGG_10QUE == 4 && countitem(6076) > 0 && countitem(6077) < 5) {
		mes "�]���̏ꏊ�����w�K�[�h�̌���";
		mes "�@�g�[���ΎR�O�̎R�n�̂悤���]";
		next;
		if(select("�g�їp������g�p����","�g�їp������g�p���Ȃ�") == 2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "[�g�їp���]";
		mes "�s�s�b!!";
		mes "�@";
		mes "�]�g�їp������z�΂̈ʒu���������]";
		viewpoint 1,152,134,1,0x00FF00;
		viewpoint 1,256,228,2,0x00FF00;
		viewpoint 1,85,189,3,0x00FF00;
		viewpoint 1,282,268,4,0x00FF00;
		close;
	}
	end;
}

ve_fild03,223,51,3	duplicate(#ve_find_1)	#ve_find_2	139,5,5

ve_fild03,152,134,3	script	#ve_01	111,10,10,{
	if(YGG_10QUE == 4 && countitem(6076) > 0) {
		if(countitem(6077) >= 5) {
			mes "�]���w�K�[�h�Ɍ���ꂽ��";
			mes "�@�~�b�h�K���h�嗤�̍z�΂��W�߂��B";
			mes "�@����ȏ�̌@����K�v�͂Ȃ����낤�B";
			mes "�@���w�K�[�h�ɍz�΂�";
			mes "�@�����Ă������]";
			close;
		}
		progressbar "FFFF00",4;
		if(checkitemblank() == 0) {
			mes "�]�����A�C�e���̎�ސ������E��";
			mes "�@�A�C�e������肷�邱�Ƃ��ł��Ȃ��B";
			mes "�@�A�C�e���̎�ސ������炵��";
			mes "�@�܂����ׂ悤�]";
			close;
		}
		if(rand(1,6) < 4) {
			mes "�]���Ȃ��͍̌@�Ɏ��s���A";
			mes "�@�����̐΂̔j�Ђ���ɓ������]";
			getitem 6078,1;
			close;
		}
		mes "�]�̌@�ɐ��������I�]";
		emotion 5,"";
		set .@rand,rand(1,5);
		if(.@rand == 5)
			getitem 6077,5;
		else if(.@rand == 1)
			getitem 6077,2;
		else
			getitem 6077,1;
		initnpctimer;
		disablenpc strnpcinfo(0);
		next;
		mes "�]^FF0000���΂炭���Ȃ���";
		mes "�@�̌@�ł��Ȃ������B";
		mes "�@�����҂Ƃ�^000000�]";
		close;
	}
	end;
OnTouch:
	if(YGG_10QUE == 4 && countitem(6076) > 0)
		misceffect 342;
	end;
OnTimer40000:
	enablenpc strnpcinfo(0);
	stopnpctimer;
	end;
}

ve_fild03,256,228,3	duplicate(#ve_01)	#ve_02	111,10,10
ve_fild03,85,189,3	duplicate(#ve_01)	#ve_03	111,10,10
ve_fild03,282,268,3	duplicate(#ve_01)	#ve_04	111,10,10

//============================================================
// ���҃N�G�X�g
//- Registry -------------------------------------------------
// NYD_1QUE -> 0�`14
//------------------------------------------------------------
mid_camp,271,299,3	script	�}�O�j�t�@	755,{
	switch(NYD_1QUE) {
	case 2:
		mes "[�}�O�j�t�@]";
		mes "�͂��߂܂��āB";
		mes "���̓��[���~�b�h�K�b�c��������";
		mes "�h�����ꂽ�}�O��t�@�Ƃ����܂��B";
		mes "���͌����Ŏ肪�����܂���B";
		mes "�܂���ŗ��Ă��������B";
		next;
		menu "�i�ߊ��Ɍ����ė��܂���",-;
		mes "[�}�O�j�t�@]";
		mes "�A�W�t�i�ߊ�����ł����H";
		mes "�����ʔ������ȗ\�������܂��ˁB";
		mes "�����ł��傤�B";
		mes "���`�ƁA�����O��";
		mes "�����Ă���낵���ł��傤���H";
		next;
		menu "�����",-;
		mes "[�}�O�j�t�@]";
		mes strcharinfo(0)+ "����";
		mes "�ł��ˁB";
		mes "����ŉ��̗p�ł��傤���H";
		mes "�ڂ����������Ă��������B";
		next;
		mes "�]���Ȃ��͓��A�Ō�����";
		mes "�@��ɂ��Ęb�����]";
		next;
		mes "[�}�O�j�t�@]";
		mes "����͖{���ł���!?";
		mes "���̓��A�ɖ傪�c�c";
		mes "��͂��Ղ��������̂��B";
		mes "�������l���߂Â��Ȃ��悤��";
		mes "���E�������Ă���c�c";
		next;
		mes "[�}�O�j�t�@]";
		mes "���͂��̓��A��";
		mes "^0000FF�C�O�h���V���̒��S��^000000�֌q����";
		mes "��������ƍl���Ă��܂��B";
		mes "�����������Ƃ����";
		mes "���j�I�唭���ƂȂ�܂��ˁB";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����Ƃ�������������܂��B";
		mes strcharinfo(0)+ "�����";
		mes "���t�B�l���Ɖ�������Ƃ�����܂����H";
		next;
		mes "�]���Ȃ��͂��Ȃ������]";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����ɂ��΃��t�B�l����";
		mes "���E���C�O�h���V����";
		mes "��삷��ꑰ�ł���ƕ����Ă��܂��B";
		mes "�Â������ł����̃��t�B�l����";
		mes "�v����푰��`��������������܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "���̕����ł��C�O�h���V����";
		mes "��邽�߂̎푰�Ƃ��ĕ`����Ă��܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "���̃��t�B�l����";
		mes strcharinfo(0)+ "����";
		mes "������������A��";
		mes "�x�����Ă���悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����Ŏ��͂��̓��A�̏���";
		mes "�ǂ��ɂ����Ď�ɓ���悤�Ǝv���A";
		mes "�m�b�̉��̎w�ւ�����������";
		mes "���ׂĂ�������̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����āA����";
		mes "���̒���������񍐏���";
		mes "�͂����̂ł��B";
		mes "���A�ɂ��Ă̏��";
		mes "������Ă���͂��ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�肪�����Ȃ��ĂȂ��Ȃ�";
		mes "�ǂ߂Ȃ������̂ł����A";
		mes "���x�����B";
		mes "���Ȃ������ꏏ�ɓǂ�ł��������B";
		next;
		menu "�͂�",-;
		mes "[�}�O�j�t�@]";
		mes "�ł͂�����Ƒ҂��Ă��������B";
		next;
		mes "�]�}�O�j�t�@�͊���������n�߂��]";
		next;
		mes "[�}�O�j�t�@]";
		mes "�c�c";
		mes "����A���������c�c";
		mes "�񍐏����Ȃ����c�c";
		next;
		mes "[�}�O�j�t�@]";
		mes "�c�c";
		next;
		mes "[�}�O�j�t�@]";
		mes "�܂���^FF0000�i�I�~^000000���c�c";
		next;
		menu "�i�I�~�H",-;
		mes "[�}�O�j�t�@]";
		mes "�͂��A����";
		mes "�v�����e���̐}���ق�";
		mes "����{��T���ɍs�����̂ł����A";
		mes "���̎��A�Ԉ���ĕ񍐏���";
		mes "�����čs���Ă��܂����̂���";
		mes "����܂���B";
		next;
		mes "[�}�O�j�t�@]";
		mes "����ɂ��Ă��A�肪�x���ȁB";
		mes "�������{��T�������Ȃ̂ɁB";
		mes "�Ȃɂ��������̂��낤���c�c";
		mes "�S�z�ł��ˁc�c";
		next;
		mes "[�}�O�j�t�@]";
		mes "�������A���͍�";
		mes "�����𗣂��킯�ɂ͂����Ȃ��c�c";
		mes "�ǂ��������̂��c�c";
		next;
		menu "�i�I�~��T���Ă��܂��傤���H",-;
		mes "[�}�O�j�t�@]";
		mes "��낵���̂ł����H";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�}�O�j�t�@]";
		mes "�i�I�~��";
		mes "�v�����e���̐}���قɂ���͂��ł��B";
		mes "�ޏ���������";
		mes "�m�F���ɍs���Ă��������B";
		set NYD_1QUE,3;
		setquest 70860;
		delquest 70855;
		close;
	case 3:
		mes "[�}�O�j�t�@]";
		mes "���A���̏���̃i�I�~��";
		mes "�v�����e���̐}���ق�";
		mes "�C�O�h���V���ɂ��Ă̖{��";
		mes "�T���ɍs���Ă��܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�������A�ޏ��̋A�肪�x���B";
		mes "�����������̂�������܂���B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�ޏ���������";
		mes "�m�F���ɍs���Ă��������B";
		close;
	case 4:
		mes "[�}�O�j�t�@]";
		mes "�i�I�~�͖����ł������H";
		next;
		menu "�����ł���",-;
		mes "[�}�O�j�t�@]";
		mes "�����ł������c�c";
		mes "�{���ɂ悩�����B";
		next;
		mes "�]���Ȃ��́A";
		mes "�@�i�I�~����a�������{��";
		mes "�@�񍐏����}�O��t�@�ɓn�����]";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����ł��A���̕񍐏��B";
		mes "�����ăi�I�~�͂�����";
		mes "���̒T���Ă���";
		mes "�C�O�h���V���ɂ���";
		mes "������Ă��镶����";
		mes "�T���o�����悤�ł��ˁB";
		next;
		mes "[�}�O�j�t�@]";
		mes "���āA�񍐏��̕���";
		mes "�����ǂ�ł݂܂��傤�B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�c�c";
		mes "�@";
		mes "�]�}�O�j�t�@�͕񍐏���";
		mes "�@�ǂ�ł���]";
		next;
		menu "�������͂���܂����H",-;
		mes "[�}�O�j�t�@]";
		mes "�͂��B���̒�������";
		mes "�X�v�����f�B�b�h�ƃ}�k�N��";
		mes "���A�ɂ��Ă̘b��";
		mes "���R�������Ƃ��ł��������ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�X�v�����f�B�b�h�ł�";
		mes "^FF0000���m^000000�����A�ɂ��ĉ���";
		mes "�b���Ă��������ł��B";
		mes "���������A�̌x���ɂ���";
		mes "�s��������";
		mes "���������Ă����悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����ă}�k�N�B";
		mes "�}�k�N�̎񒷂����錚����";
		mes "^FF0000���t�B�l���̕ߗ�^000000��";
		mes "�����炵���̂ł���";
		mes "���̕ߗ������A�ɂ���";
		mes "��������ł����悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�c�c";
		mes "���A�ɂ��ď�񂪏��Ȃ��ȏ�";
		mes "���̕��m�����t�B�l���̕ߗ�����";
		mes "�b�𕷂����Ƃ����Ȃ������ł��ˁc�c";
		next;
		mes "�]�X�v�����f�B�b�h�ɂ��镺�m��";
		mes "�@�}�k�N�ɂ��郉�t�B�l���̕ߗ���";
		mes "�@�b�𕷂��Ă݂悤�]";
		set NYD_1QUE,5;
		setquest 70870;
		delquest 70865;
		close;
	case 5:
	case 51:
	case 52:
		mes "[�}�O�j�t�@]";
		mes "�X�v�����f�B�b�h�ł�";
		mes "^FF0000���m^000000�����A�ɂ��ĉ���";
		mes "�b���Ă��������ł��B";
		mes "���������A�̌x���ɂ���";
		mes "�s��������";
		mes "���������Ă����悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����ă}�k�N�B";
		mes "�}�k�N�̎񒷂����錚����";
		mes "^FF0000���t�B�l���̕ߗ�^000000��";
		mes "�����炵���̂ł���";
		mes "���̕ߗ������A�ɂ���";
		mes "��������ł����悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�c�c";
		mes "���A�ɂ��ď�񂪏��Ȃ��ȏ�";
		mes "���̕��m�����t�B�l���̕ߗ�����";
		mes "�b�𕷂����Ƃ����Ȃ������ł��ˁc�c";
		close;
	case 61:
	case 62:
		mes "[�}�O�j�t�@]";
		mes "�₠�A";
		mes strcharinfo(0)+ "����B";
		mes "���͍��C�O�h���V���ɂ���";
		mes "���ׂĂ��܂����B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�i�I�~�͂Ȃ��Ȃ�";
		mes "�ǂ��{��T���Ă���܂����ˁB";
		mes "�������͂��ǂ�܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "����X�����邱�̏ꏊ��";
		mes "���x�C�O�h���V���̍��̈�{��";
		mes "�ʂ��Ă���ꏊ�̂悤�Ȃ̂ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "��͂肠�̓��A��";
		mes "�C�O�h���V���̒��S���c�c";
		next;
		mes "[�}�O�j�t�@]";
		mes "�Ƃ���ŁA";
		mes strcharinfo(0)+ "����B";
		mes "�ǂ����܂������H";
		next;
		menu "���܂ł̂��Ƃ�񍐂���",-;
		mes "[�}�O�j�t�@]";
		mes "�����ł������c�c";
		mes "�َ푰�Ɗ֌W������";
		mes "������Ă��܂��܂������B";
		mes "���ɂ�����������܂��ˁc�c";
		next;
		mes "�]�}�O�j�t�@�͏����l�����񂾁]";
		next;
		mes "[�}�O�j�t�@]";
		mes "��x�A�W�t�i�ߊ��ɑ��k���܂��񂩁H";
		mes "���̒n�̐l�ԑ�\�Ƃ���";
		mes "���ӌ��𒸂��܂��傤�B";
		set NYD_1QUE,7;
		setquest 70885;
		delquest 70876;
		close;
	case 7:
		mes "[�}�O�j�t�@]";
		mes "��x�A�W�t�i�ߊ��ɑ��k���܂��񂩁H";
		mes "�A���R�̑�\�Ƃ���";
		mes "���ӌ��𒸂��܂��傤�B";
		close;
	case 121:
	case 122:
	case 131:
	case 132:
	case 14:
		mes "�]�}�O�j�t�@�͖Z����������";
		mes "�@�����ɖڂ�ʂ��Ă���B";
		mes "�@�����Ƃ��Ă������]";
		close;
	default:
		mes "[�}�O�j�t�@]";
		mes "�͂��߂܂��āB";
		mes "���̓��[���~�b�h�K�b�c��������";
		mes "�h�����ꂽ�}�O��t�@�Ƃ����܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�����͖`���҂������ł��ˁB";
		mes "�������A�݂�Ȋј\��������";
		mes "�ƂĂ��S�����ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "���͗��j�w�҂����Ă����ł����A";
		mes "���ِ̈��E�̔�����";
		mes "���j�I�ɂ��Ƃ�ł��Ȃ��唭���ł��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "���ِ̈��E�͂ǂ̂悤�ɏo������";
		mes "�����ɏZ�ގ푰�̕�����";
		mes "�ǂ̂悤�ɔ��W���Ă����̂��c�c";
		mes "���ׂȂ��Ă͂����Ȃ����Ƃ�";
		mes "�������񂠂�܂��B";
		next;
		mes "[�}�O�j�t�@]";
		mes "�ł�����A���Ȃ��̂悤��";
		mes "�`���҂ւ̊��҂͑傫����ł��B";
		mes "�����珬���Ȕ����ł��\���܂���B";
		mes "��������������񍐂��Ă��������ˁB";
		close;
	}
}

prt_in,171,94,3	script	�i�I�~	893,{
	if(NYD_1QUE == 3) {
		mes "�]�S���͂���ł��낤";
		mes "�@��ʂ̖{���ς݂������Ă��鉡��";
		mes "�@�������{��K���ɓǂ�ł���]";
		next;
		mes "[����]";
		mes "�c�c";
		next;
		mes "[����]";
		mes "�悵���I";
		mes "���̖{�����m�̌����Ă���";
		mes "�{�ɈႢ�Ȃ���I";
		next;
		mes "[����]";
		mes "����ƁA����ƌ�������c�c";
		mes "��ꂽ�A�������E�c�c";
		next;
		mes "[����]";
		mes "�c�c";
		mes "�ł����ꂩ�炱�̖{��S��";
		mes "���̏ꏊ��";
		mes "�߂��Ȃ��Ⴂ���Ȃ��̂ˁc�c";
		next;
		mes "[����]";
		mes "�c�c";
		mes "��l���ᖳ������c�c";
		next;
		mes "�]������������������]";
		next;
		mes "[����]";
		mes "�˂��˂��A�����̂��Ȃ��I";
		mes "�����񂾂��ǁA";
		mes "���̖{��Еt����̂�";
		mes "��`���Ă���Ȃ����ȁH";
		next;
		mes "[����]";
		mes "����l���ᖳ�������Ȃ́B";
		mes "���肢�I";
		next;
		if(select("��������","�Ƃ肠������`��") == 1) {
			mes "[����]";
			mes "�c�c";
			mes "��������ˁc�c";
			mes "��������ˁc�c";
			emotion 28;
			close;
		}
		mes "[�i�I�~]";
		mes "���肪�Ƃ��I";
		mes "���̓i�I�~���Ă����񂾁B";
		mes "���j�w�҂̃}�O��t�@���m��";
		mes "��������Ă���́B";
		next;
		menu "�����",-;
		mes "[�i�I�~]";
		mes "����A";
		mes strcharinfo(0)+ "�B";
		mes "�ꏏ�ɖ{��߂��܂��傤�I";
		mes "���͂������̕���߂�����";
		mes "���Ȃ��͂������̕������肢�ˁI";
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c";
		next;
		mes "[�i�I�~]";
		mes "�����F-3�ɖ߂��ĂƁc�c";
		emotion 19;
		emotion 19,"";
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c";
		next;
		mes "[�i�I�~]";
		mes "���[�ƁA����B-4���c�c";
		mes "���Ă����c�c";
		emotion 19;
		emotion 19,"";
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c";
		next;
		mes "[�i�I�~]";
		mes strcharinfo(0)+ "�c�c";
		mes "���Ȃ��͖{���ǂꂭ�炢�߂����H";
		next;
		switch(select("�������炢","�����I���܂���","���͉�������Ă��܂���")) {
		case 1:
			mes "[�i�I�~]";
			mes "�����������ˁI";
			mes "�撣���Ďc���߂����I";
			emotion 21;
			break;
		case 2:
			mes "[�i�I�~]";
			mes "���A�{��!?";
			emotion 0;
			next;
			mes "[�i�I�~]";
			mes "���A�܂��������炢�c�c";
			emotion 28;
			break;
		case 3:
			mes "[�i�I�~]";
			mes "������Ɓ[�[�[�[!!";
			emotion 23;
			break;
		}
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c";
		next;
		mes "[�i�I�~]";
		mes "�悵���A����őS���I";
		mes "����ƏI������c�c";
		mes "���Ȃ��̂���������A";
		mes "���肪�Ƃ��I";
		emotion 2;
		next;
		menu "�}�O�j�t�@���m�̌���b��",-;
		mes "[�i�I�~]";
		mes "�����A�����Ȃ́H";
		mes "����T���ɁH";
		mes "��Ɍ����Ă�`�B";
		next;
		mes "[�i�I�~]";
		mes "�c�c";
		mes "�ł��ǂ����ɂ��Ă�";
		mes "��`���Ă�����Ă����B";
		emotion 20;
		next;
		mes "[�i�I�~]";
		mes "����ɂ��Ă�";
		mes "���m���ĂЂ��ǁ`�`���I";
		mes "�����A�肪�x�������I";
		emotion 36;
		next;
		mes "[�i�I�~]";
		mes strcharinfo(0)+ "�A";
		mes "�����Ă�I";
		next;
		mes "[�i�I�~]";
		mes "���m�͂ˁA����";
		mes "�C�O�h���V���̕�����";
		mes "�T���ė������Č������񂾂��ǁA";
		mes "�^�C�g�������҂��o���ĂȂ�";
		mes "���Č����񂾂�I";
		next;
		mes "[�i�I�~]";
		mes "���m���o���Ă���";
		mes "���e�Ƒ}�G�̃C���[�W������";
		mes "���A�T���Ă����񂾂�I";
		mes "�����[�A���Ԃ���������[�́I";
		emotion 36;
		next;
		mes "[�i�I�~]";
		mes "�c�c�ł�";
		mes "�S�z���Ă��ꂽ�̂͊��������ȁB";
		next;
		mes "[�i�I�~]";
		mes "�Ȃ񂾂��񂾂�";
		mes "���̂��ƍl���Ă���Ă�񂾂ˁA";
		mes "���m�c�c";
		emotion 40;
		next;
		menu "�񍐏��������Ă��܂����H",-;
		mes "[�i�I�~]";
		mes "�����A�񍐏��H";
		mes "������Ƒ҂��Ăˁc�c";
		next;
		mes "�]�i�I�~�͊������������]";
		next;
		mes "[�i�I�~]";
		mes "�����A�����Ă�I";
		mes "���ɓ���Ď����Ă��������!!";
		emotion 1;
		next;
		mes "[�i�I�~]";
		mes "����[�A";
		mes "�A���R���Ԓn���珑�ނ�";
		mes "�����o���̂ɂ͋�������̂Ɂc�c";
		mes "������������B";
		mes "����A���\���ɂȂ�̂�B";
		mes "�ł��B���ʂ����ǂˁB";
		next;
		switch(select("���ꂪ�����ł���","�����Ɍ������ق��������ł���")) {
		case 1:
			mes "[�i�I�~]";
			mes "�ł���H";
			mes "���Ȃ����b���킩���ˁB";
			break;
		case 2:
			mes "[�i�I�~]";
			mes "�����ł����Ƃ���Ȃ��́I";
			break;
		}
		next;
		mes "[�i�I�~]";
		mes "����͂����Ǝ���ꂿ���������";
		mes "�x��ł���߂��B";
		mes "�������������c�c";
		mes "���Ⴀ�A���̕񍐏���n���ˁB";
		next;
		mes "[�i�I�~]";
		mes "���ƁA���̖{��n���Ă�����B";
		mes "���m���T���Ă����{�B";
		mes "���Ȃ�����n���Ă����āB";
		next;
		menu "�킩��܂���",-;
		mes "[�i�I�~]";
		mes "���ꂶ�Ⴀ�A";
		mes "�}�O�j�t�@���m�ɓn���Ă����ĂˁB";
		set NYD_1QUE,4;
		setquest 70865;
		delquest 70860;
		close;
	} else if(NYD_1QUE == 4) {
		mes "[�i�I�~]";
		mes "���ꂶ�Ⴀ�A";
		mes "�}�O�j�t�@���m��";
		mes "�{�ƕ񍐏���n���Ă����ĂˁB";
		next;
		mes "[�i�I�~]";
		mes "���m�̂����ł����N�^�N�^�c�c";
		mes "�ł����̐l�̂��߂Ȃ�";
		mes "�撣�ꂿ�Ⴄ���ȁB";
		next;
		mes "[�i�I�~]";
		mes "���m�͂ˁA5�N�O����";
		mes "�I�[�f�B���Ɛ_�̐킢��_�̈ꑰ�A";
		mes "���������N�Ɋւ���";
		mes "���������Ă���񂾁B";
		next;
		mes "[�i�I�~]";
		mes "���������N�������������Ȃ��";
		mes "�`���҂̌��ɉB���";
		mes "�������Œ������Ă����񂾂�B";
		mes "���������Ƃ���͑��h�ł����ˁB";
		close;
	}
	mes "[����]";
	mes "�{��T���̂ɔ�ꂽ�c�c";
	mes "������c�c";
	emotion 45;
	close;
}

splendide,198,178,3	script	���m	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "SeLarsmar Di marThusVil U SeMushVohl";
		close;
	}
	if(NYD_1QUE == 5) {
		mes "[���m]";
		mes "���́A�i�ߕ��͉�������";
		mes "�����^FF0000���A���x��^000000��������񂾁c�c";
		next;
		mes "[���m]";
		mes "��ʕ��ɂ͉����B���Ă���̂��H";
		mes "�يE�l�̌N�Ɍ����̂��Ȃ񂾂�";
		mes "��̍l���邱�Ƃ͂悭�킩��Ȃ��ȁB";
		next;
		switch(select("�ڂ����������Ă�������","�T�t�@���ɂ��ĕ���","��b����߂�")) {
		case 1:
			mes "[���m]";
			mes "�����O�ɓ��A�����������̂����A";
			mes "���ꂩ��Ƃ�������";
			mes "�i�ߕ��͉�����";
			mes "������������Ă���񂾁B";
			next;
			mes "[���m]";
			mes "�i�ߊ���^FF0000���r�I���f�B��^000000�l��";
			mes "�����l���Ă�����̂��H";
			mes "���ڕ����ɍs�������ʂ���";
			mes "�ꕺ�m�̎��ɂ�";
			mes "����Ȃ��Ƃ͂ł��Ȃ��c�c";
			next;
			mes "[���m]";
			mes "�������يE�l�̌N��";
			mes "���r�I���f�B���l��";
			mes "�����ė~�������̂��B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�i�ߊ����r�I���f�B���Ȃ��";
			mes "���A�ɂ�������ɂ���";
			mes "�����m���Ă��������j";
			set NYD_1QUE,51;
			setquest 70875;
			delquest 70870;
			close;
		case 2:
			mes "[���m]";
			mes "�T�t�@���̂����ŉ�������";
			mes "����ȏꏊ�Œ����Ԑ�������";
			mes "�͂߂ɂȂ����񂾁B";
			next;
			mes "[���m]";
			mes "�����炪���鏊�Ɍ����@�邩��";
			mes "�C�O�h���V���̍�������";
			mes "�C�O�h���V���̗͂�";
			mes "��܂��Ă���񂾂�B";
			next;
			mes "[���m]";
			mes "�܂��������ēz������I";
			mes "���B�͐�΂ɂ��̒n����T�t�@����";
			mes "�ǂ��o���Ă݂���B";
			close;
		case 3:
			mes "�]���Ȃ��͗����������]";
			close;
		}
	} else if(NYD_1QUE == 51) {
		mes "[���m]";
		mes "�����O�ɓ��A�����������̂����A";
		mes "���ꂩ��Ƃ�������";
		mes "�i�ߕ��͉�����";
		mes "������������Ă���񂾁B";
		next;
		mes "[���m]";
		mes "�i�ߊ���^FF0000���r�I���f�B��^000000�l��";
		mes "�����l���Ă�����̂��H";
		mes "���ڕ����ɍs�������ʂ���";
		mes "�ꕺ�m�̎��ɂ�";
		mes "����Ȃ��Ƃ͂ł��Ȃ��c�c";
		next;
		mes "[���m]";
		mes "�������يE�l�̌N��";
		mes "���r�I���f�B���l��";
		mes "�����ė~�������̂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�i�ߊ����r�I���f�B���Ȃ��";
		mes "���A�ɂ�������ɂ���";
		mes "�����m���Ă��������j";
		close;
	}
	mes "[���m]";
	mes "�c�c";
	next;
	mes "�]���m���^���Ȋ�ōl������ł���B";
	mes "�@�ז����Ȃ��ł������]";
	close;
}

splendide,240,164,3	script	���m	461,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���m]";
		mes "VohlLarsmar Ha DielCyatas";
		close;
	}
	if(NYD_1QUE == 5) {
		mes "[���m]";
		mes "^FF0000���r�I���f�B��^000000�l��";
		mes "���̎w�߂�^FF0000���A�̌x��^000000���B";
		mes "�T�t�@���Ɛ퓬���Ȃ�����";
		mes "�}�V�Ȏw�߂����ȁB";
		next;
		mes "[���m]";
		mes "��������Ȗ��v�Ȑ푈�A";
		mes "�I����Ăق������̂��B";
		next;
		switch(select("�ڂ����������Ă�������","�T�t�@���ɂ��ĕ���","��b����߂�")) {
		case 1:
			mes "[���m]";
			mes "�i�ߊ���^FF0000���r�I���f�B��^000000�l����";
			mes "�w�߂�^FF0000���A�̌x��^000000��";
			mes "������ꂽ�̂��B";
			next;
			mes "[���m]";
			mes "�����̊Ԕ������ꂽ���A�A";
			mes "�ƂȂ��Ă��邪";
			mes "�i�ߕ��̕��ł͑O�X����";
			mes "���A�̑��݂�m���Ă����悤���ȁB";
			next;
			mes "[���m]";
			mes "�����B���Ă���񂾂낤���A";
			mes "���̒m�������Ƃ���Ȃ��ȁB";
			mes "�܂��A�ォ��̎w�߂�����";
			mes "�x���͂��邯�ǂȁB";
			next;
			mes "[���m]";
			mes "�Ȃ����A���x������̂�";
			mes "�m�肽����΁A";
			mes "^FF0000���r�I���f�B��^000000�l����";
			mes "���ڕ����Ƃ����̂ł͂Ȃ����H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�i�i�ߊ����r�I���f�B���Ȃ��";
			mes "���A�ɂ�������ɂ���";
			mes "�����m���Ă��������j";
			set NYD_1QUE,51;
			setquest 70875;
			delquest 70870;
			close;
		case 2:
			mes "[���m]";
			mes "���������t�B�l����";
			mes "�T�t�@���Ƙb����������x��";
			mes "�������Ƃ��Ȃ��B";
			mes "���͍s�g�΂��肾�B";
			next;
			mes "[���m]";
			mes "��ɍU�������������̂�";
			mes "���t�B�l���Ȃ񂾂��B";
			mes "�c�c";
			mes "�ǂ����Ă����t�B�l����";
			mes "��肪����񂶂�Ȃ����H";
			next;
			mes "[���m]";
			mes "�Ƃɂ����A";
			mes "���͂��̐푈�����Ȃ񂾁B";
			close;
		case 3:
			mes "�]���Ȃ��͗����������]";
			close;
		}
	} else if(NYD_1QUE == 51) {
		mes "[���m]";
		mes "�i�ߊ���^FF0000���r�I���f�B��^000000�l����";
		mes "�w�߂�^FF0000���A�̌x��^000000��";
		mes "������ꂽ�̂��B";
		next;
		mes "[���m]";
		mes "�����̊Ԕ������ꂽ���A�A";
		mes "�ƂȂ��Ă��邪";
		mes "�i�ߕ��̕��ł͑O�X����";
		mes "���A�̑��݂�m���Ă����悤���ȁB";
		next;
		mes "[���m]";
		mes "�����B���Ă���񂾂낤���A";
		mes "���̒m�������Ƃ���Ȃ��ȁB";
		mes "�܂��A�ォ��̎w�߂�����";
		mes "�x���͂��邯�ǂȁB";
		next;
		mes "[���m]";
		mes "�Ȃ����A���x������̂�";
		mes "�m�肽����΁A";
		mes "^FF0000���r�I���f�B��^000000�l����";
		mes "���ڕ����Ƃ����̂ł͂Ȃ����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�i�ߊ����r�I���f�B���Ȃ��";
		mes "���A�ɂ�������ɂ���";
		mes "�����m���Ă��������j";
		close;
	}
	mes "[���m]";
	mes "�T�t�@���Ƃ̐푈��";
	mes "��̂��ɂȂ��";
	mes "�I���̂��낤���H";
	next;
	mes "[���m]";
	mes "�c�c���͐����A";
	mes "�T�t�@�����ǂ����Ă�";
	mes "�G�Ƃ͎v���Ȃ��񂾁B";
	next;
	mes "[���m]";
	mes "�푈�ł͂Ȃ��A";
	mes "�Θb�ŉ����ł��Ȃ��̂��낤���c�c";
	mes "�푈�͂悭�Ȃ����B";
	close;
}

spl_in01,109,60,5	script	���r�I���f�B��	435,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���r�I���f�B��]";
		mes "ThusDurnah�@Ra";
		mes "SharVeldIyaz�@U";
		mes "UorAmanDur�@Yee";
		mes "neaOsaAdor�@Yee";
		close;
	}
	switch(NYD_1QUE) {
	case 51:
		mes "[���r�I���f�B��]";
		mes "���t�B�l���̑O����n";
		mes "�X�v�����f�B�b�h�ւ悤�����B";
		mes "���͎i�ߊ��̃��r�I���f�B���B";
		next;
		mes "[���r�I���f�B��]";
		mes "�N�́c�c";
		next;
		mes "�]���r�I���f�B����";
		mes "�@���Ȃ��̊�����ĕ\��ς�����]";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "���ˁB";
		mes "�N���ŋ߂��̎��ӂ�";
		mes "�����W�߂Ă���Ƃ���";
		mes "�񍐂��󂯂Ă���B";
		next;
		mes "[���r�I���f�B��]";
		mes "���t�B�l���͌��݁A";
		mes "�N�̎푰�ɂ͗F�D�������Ă���B";
		next;
		mes "[���r�I���f�B��]";
		mes "�����������";
		mes "��X�̃��[��������Ă���΁A";
		mes "�Ƃ��������t���ł̂��ƁB";
		mes "���܂�h��ɓ�������";
		mes "�ɂ��ڂ����邼�B";
		next;
		mes "[���r�I���f�B��]";
		mes "�ȏ�̂��Ƃ�";
		mes "�������Ă��炦��΍K�����B";
		mes "���t�B�l���ƌN�����l�Ԃ�";
		mes "�F�D�֌W���������Ƃ��F��B";
		next;
		if(select("�킩��܂���","���A���ĕ������Ă�������") == 1) {
			mes "[���r�I���f�B��]";
			mes "�������Ă��炦���悤���ȁB";
			mes "�N�����������ԓx�ł���Ȃ��";
			mes "���t�B�l���͂��ł��N��";
			mes "���}���悤�B";
			close;
		}
		mes "[���r�I���f�B��]";
		mes "���A���Ɓc�c�H";
		next;
		mes "[��q��]";
		mes "�i�ߊ��A";
		mes "�A�s���܂��傤���H";
		next;
		mes "[���r�I���f�B��]";
		mes "����A�����񂾁B";
		mes "�����Ǝ��̐�����";
		mes "����Ȃ������̂��낤�B";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�B";
		mes "���̓��A�ɋ߂Â��̂͂�߂Ă���B";
		mes "���Ȃǂ�藧�ꂪ�y����̕��X�����";
		mes "���߂Ȃ̂��B";
		mes "�K������Ă���B";
		next;
		mes "[���r�I���f�B��]";
		mes "�����N�����̎���";
		mes "�j��悤�Ȃ��ƂɂȂ��";
		mes "�N�B�l�ԂƂ̗F�D�֌W��";
		mes "�傫�ȋT�􂪓��邱�ƂɂȂ�B";
		next;
		mes "[���r�I���f�B��]";
		mes "���̓��A�ɉ������邩�Ȃ�";
		mes "�N�B���C�ɂ��邱�Ƃł͂Ȃ��̂��B";
		mes "��΂ɋ߂Â��Ȃ��ŗ~�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�A���R���Ԓn�ɖ߂�";
		mes "�}�O��t�@�ɕ񍐂��悤�j";
		set NYD_1QUE,61;
		setquest 70876;
		delquest 70875;
		close;
	case 61:
		mes "[���r�I���f�B��]";
		mes "���̓��A�ɋ߂Â��̂͂�߂Ă���B";
		mes "���Ȃǂ�藧�ꂪ�y����̕��X�����";
		mes "���߂Ȃ̂��B";
		mes "�K������Ă���B";
		next;
		mes "[���r�I���f�B��]";
		mes "�����j��ΌN�B�l�ԂƂ̗F�D�֌W��";
		mes "�傫�ȋT�􂪓���Ǝv���Ă���B";
		mes "���̓��A�ɉ������邩�Ȃ�";
		mes "�N�B���C�ɂ��邱�Ƃł͂Ȃ��̂��B";
		mes "��΂ɋ߂Â��Ȃ��ŗ~�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�A���R���Ԓn�ɖ߂�";
		mes "�}�O��t�@�ɕ񍐂��悤�j";
		close;
	case 81:
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "���B";
		mes "���x�͉��̗p���ŗ����̂��H";
		next;
		menu "��\�̂��Ȃ��ɘb������܂�",-;
		mes "[���r�I���f�B��]";
		mes "�c�c";
		mes "�b���Ă݂�Ƃ����B";
		next;
		menu "���A�̒����������Ă�������",-;
		mes "[���r�I���f�B��]";
		mes "�܂�A���̌x����";
		mes "��������ƌ������Ƃ��ȁB";
		mes "����͌N�l�̈ӎv���A";
		mes "����Ƃ��N�̎푰�A";
		mes "�l�Ԃ̑�\�Ƃ��Ă̈ӎv���H";
		next;
		menu "�l�Ԃ��\���Ă̈ӎv�ł�",-;
		mes "[���r�I���f�B��]";
		mes "�l�Ԃ͉�烉�t�B�l����";
		mes "�Â����Ă���̂��H";
		mes "�푈��]��ł���ƌ����̂��H";
		next;
		mes "[���r�I���f�B��]";
		mes "�c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "��������!!";
		next;
		mes "[���r�I���f�B��]";
		mes "�����A���I�X�A";
		mes "�l�Ԃւ̕��j�����߂邽�߂�";
		mes "��c���s���I";
		next;
		mes "[�A���I�X]";
		mes "�͂��A�킩��܂����B";
		mes "������z�������܂��B";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "�N�͂����������Ă���Ȃ����B";
		next;
		menu "�T�t�@���Ǝ��g�݂܂�",-;
		mes "[���r�I���f�B��]";
		mes "�����Ɓc�c�H";
		next;
		mes "�]���r�I���f�B����";
		mes "�@�\���ς����]";
		next;
		mes "[���r�I���f�B��]";
		mes "�M�l�I";
		mes "�����ƌ�����!?";
		next;
		menu "�T�t�@���Ɠ��A�𒲍����܂�",-;
		mes "[���r�I���f�B��]";
		mes "�{�C�Ō����Ă���̂�!?";
		next;
		mes "[�A���I�X]";
		mes "�w�ߊ��B";
		mes "���̎҂�߂炦�܂��傤���H";
		next;
		mes "[���r�I���f�B��]";
		mes "�c�c";
		mes "����A�҂񂾁B";
		next;
		mes "[���r�I���f�B��]";
		mes "�{���ɃT�t�@����";
		mes "���g�����ƍl���Ă���̂��H";
		next;
		menu "���t�B�l���̕ԓ�����ł�",-;
		mes "[���r�I���f�B��]";
		mes "�c�c";
		mes "�@";
		mes "�]���r�I���f�B���͍l�����񂾁]";
		next;
		mes "[�A���I�X]";
		mes "�i�ߊ��B";
		mes "��͂肱�̎҂�߂炦�܂��傤�B";
		next;
		mes "�]���r�I���f�B����";
		mes "�@�A���I�X�̌��t�ɋC�t���Ȃ��ق�";
		mes "�@�l������ł���悤���]";
		next;
		mes "[���r�I���f�B��]";
		mes "�c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		next;
		mes "�]���r�I���f�B���������J�����]";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "�悭�����������B";
		next;
		mes "[���r�I���f�B��]";
		mes "���A�𒲍����鋖��^���悤�B";
		next;
		mes "[�A���I�X]";
		mes "�c�c�I";
		mes "�i�ߊ�";
		mes "��낵���̂ł����H";
		next;
		mes "[���r�I���f�B��]";
		mes "�����ȁA���ɓ��͂���܂��B";
		mes "���̐��Ȃ�ꏊ��";
		mes "�T�t�@���ɉ������̂�����";
		mes "��΂ɔ����Ȃ��Ă͂����Ȃ��B";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "����������������B";
		mes "�N��������ɓ��ꂽ����";
		mes "�S�Ď��ɕ񍐂��邱�ƁB";
		mes "���͑S�ċ��L���Ă��炤�B";
		next;
		mes "[���r�I���f�B��]";
		mes "�����A���̏�����";
		mes "���߂Ȃ��ƌ����Ȃ��";
		mes "�����ɂ��̒n���o�Ă����Ă��炤�B";
		mes "���������H";
		next;
		menu "�͂��I�����ɂ��������܂��B",-;
		mes "[���r�I���f�B��]";
		mes "��낵���B";
		next;
		mes "[���r�I���f�B��]";
		mes "�ł́A�A���I�X�B";
		mes "���ꂩ��l�Ԃ̒����ɋ��͂���悤�ɁB";
		mes "�����Ă��̎҂�";
		mes "���̏ꏊ���ǂ̂悤�ȏꏊ��";
		mes "�����Ă����Ăق����B";
		next;
		mes "[�A���I�X]";
		mes "�������c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "�A���I�X�B";
		mes "���̒n���T�t�@����";
		mes "�r�炳��邭�炢�Ȃ��";
		mes "�B�����ɋ����������悢���낤�B";
		next;
		mes "[�A���I�X]";
		mes "�T�t�@���Ǝ��g�񂾂Ƃ����";
		mes "���̋��Ђɂ��Ȃ�Ȃ���";
		mes "���̗D�ʐ��͗h�邪�Ȃ���";
		mes "�]�v�Ȏ�Ԃ͏��Ȃ��ق����悢�B";
		next;
		mes "�]���t�Ƃ͗����ɁA";
		mes "�@���r�I���f�B����";
		mes "�@�l�ԂƃT�t�@�������g�ނ̂�";
		mes "�@���ɋ���Ă���̂��낤�]";
		next;
		mes "�]��͂�A�r�_���̌v����";
		mes "�@�������悤���]";
		next;
		mes "[�A���I�X]";
		mes "�������c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "���҂̖��";
		mes "^FF0000�C�O�h���V�����A�h^000000�l��";
		mes "��b������x�Ȃ�Ζ��Ȃ����낤�B";
		mes "���̕��̈̑傳�������";
		mes "��l�����Ȃ�͂����B";
		next;
		mes "[���r�I���f�B��]";
		mes "����Ƃ�";
		mes "���̖��߂ɏ]���Ȃ��̂��H";
		next;
		mes "[�A���I�X]";
		mes "�����A���̂悤�Ȃ��Ƃ́c�c";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "���̕����ł���A���I�X��";
		mes "�N���T�|�[�g����B";
		mes "�A���I�X����b�𕷂��������B";
		set NYD_1QUE,91;
		setquest 70891;
		delquest 70890;
		close;
	case 91:
	case 101:
	case 111:
	case 200:
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "���̕����ł���A���I�X��";
		mes "�N���T�|�[�g����B";
		mes "�A���I�X����b�𕷂��������B";
		close;
	case 202:
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "�C�O�h���V�����A�h�l����";
		mes "�b�͕��������H";
		mes "����ł������A�̒�����";
		mes "�����������낤�H";
		next;
		menu "�j�[�Y�w�b�O�̉e�ɂ��Ęb��",-;
		mes "[���r�I���f�B��]";
		mes "���������Ă���c�c�H";
		mes "���҂̑���";
		mes "�j�[�Y�w�b�O�����Ȃ��H";
		next;
		mes "[���r�I���f�B��]";
		mes "�j�[�Y�w�b�O�̉e��";
		mes "�C�O�h���V���̗͂��z������";
		mes "��߂Ă���H";
		next;
		mes "[���r�I���f�B��]";
		mes "�R�����̂͂�߂�B";
		mes "���t�B�l���𕎐J����C��!!";
		next;
		mes "[�A���I�X]";
		mes "�����c�c";
		mes "�@";
		mes "�]�A���I�X�͐k���Ă���]";
		next;
		mes "[���r�I���f�B��]";
		mes "�n���ɂ��Ă���I";
		mes "�{���̓C�O�h���V�����A�h�l�ɂ�";
		mes "����Ă��Ȃ��̂��낤!?";
		next;
		menu "�C�O�h���V�����A�h�̎���b��",-;
		mes "[���r�I���f�B��]";
		mes "���̂�����";
		mes "���_�����������Ă���c�c�H";
		mes "���̃C�O�h���V�����A�h�l�̐��_��";
		mes "����ȏ�T�t�@���Ɛ키�̂�";
		mes "��߂�悤�Ɍ���ꂽ�c�c�H";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "!!";
		mes "���������ɂ��Ȃ���!";
		next;
		mes "[�A���I�X]";
		mes "�c�c�i�ߊ��B";
		next;
		mes "[���r�I���f�B��]";
		mes "�ǂ������A�A���I�X�H";
		next;
		mes "[�A���I�X]";
		mes strcharinfo(0)+ "��";
		mes "�����Ă��邱�Ƃ͐^���ł��c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "�A���I�X!!";
		mes "���]�ł���N�����������Ă���!?";
		next;
		mes "[�A���I�X]";
		mes strcharinfo(0)+ "����";
		mes "�C�O�h���V�����A�h�l��";
		mes "�͂�������̂ł��c�c";
		next;
		mes "[�A���I�X]";
		mes strcharinfo(0)+ "�́A";
		mes "�C�O�h���V�����A�h�l����";
		mes "���]�Ƃ��Đ����ɔF�߂�ꂽ�̂ł��B";
		next;
		mes "[���r�I���f�B��]";
		mes "�c�c���H";
		next;
		mes "[�A���I�X]";
		mes "�����Ď��]�ł��鎄�ɂ�";
		mes strcharinfo(0)+ "����";
		mes "�j�[�Y�w�b�O�̋C��������̂ł��B";
		mes "���ۂɂ�������悤�ł��c�c";
		next;
		mes "[�A���I�X]";
		mes "�c�c�c�O�Ȃ���";
		mes "�j�[�Y�w�b�O�̋C��";
		mes "�ȑO�Ƃ͑S���ʂ̕��c�c";
		mes "�׈��Ƃ��������Ȃ��A";
		mes "���낵���C�z�ɂȂ��Ă��܂��c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "�n���ȁc�c";
		next;
		mes "[���r�I���f�B��]";
		mes "�C�O�h���V���̐����";
		mes "���҂̖\�����������ƌ����̂��c�c�H";
		mes "�j�[�Y�w�b�O�̉e�c�c";
		mes "���Ƃ������Ɓc�c";
		mes "�T�t�@���̂����ł͂Ȃ������c�c";
		next;
		mes "�]���r�I���f�B����";
		mes "�@���܂Ō��������Ƃ̂Ȃ�";
		mes "�@�\������Ă���B";
		mes "�@���Ȃ蓮�h���Ă���悤���]";
		next;
		mes "[���r�I���f�B��]";
		mes "�ǂ�����΂����c�c";
		next;
		mes "[���r�I���f�B��]";
		mes "�A�[���u�w�C���̑�i�ՒB��";
		mes "���̂��Ƃ�񍐂��˂΂Ȃ�Ȃ��̂��c�c";
		next;
		mes "[�A���I�X]";
		mes "�i�ߊ��B";
		mes "�󂯓��ꂪ���������ł����A";
		mes "���}�ɖ{���ɘA�������܂��傤�c�c";
		next;
		mes "�]���r�I���f�B���̕\���ς��A";
		mes "�@�A���I�X��{�����]";
		next;
		mes "[���r�I���f�B��]";
		mes "�킩���Ă���I";
		mes "�������i�ߊ��͎����B";
		mes "���̂��Ƃ͎i�ߊ��ł��鎄����������I";
		next;
		mes "[�A���I�X]";
		mes "�i�ߊ��c�c�H";
		next;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "�j�[�Y�w�b�O�̉e��";
		mes "�ނ������Ƃ͊��ӂ���B";
		next;
		mes "[���r�I���f�B��]";
		mes "����������̎���";
		mes "�܂��閧�ɂ��Ă����ė~�����B";
		next;
		mes "[���r�I���f�B��]";
		mes "���܂�ɂ��d��Ȃ��ƂȂ̂��B";
		mes "�����������̂܂�";
		mes "�F�ɓ`������卬�����������낤�B";
		next;
		mes "[���r�I���f�B��]";
		mes "�ǂ����邩���߂�̂�";
		mes "�������Ԃ��~�����B";
		next;
		mes "[�A���I�X]";
		mes "�������c�c";
		next;
		mes "�]�}���őΉ����������悢�̂�";
		mes "�@�ԈႢ�Ȃ����A";
		mes "�@���r�I���f�B���̌�������";
		mes "�@���Ȃ��ɂ͗����ł����]";
		next;
		menu "������܂���",-;
		mes "[���r�I���f�B��]";
		mes strcharinfo(0)+ "�A";
		mes "��������B";
		mes "������̋C�������B";
		mes "�A���I�X�����V���󂯎���Ăق����B";
		next;
		mes "[�A���I�X]";
		mes "�c�c";
		set NYD_1QUE,121;
		setquest 70910;
		delquest 70905;
		close;
	case 121:
	case 131:
		mes "[���r�I���f�B��]";
		mes "����������̎���";
		mes "�܂��閧�ɂ��Ă����ė~�����B";
		next;
		mes "[���r�I���f�B��]";
		mes "���܂�ɂ��d��Ȃ��ƂȂ̂��B";
		mes "�����������̂܂�";
		mes "�F�ɓ`������卬�����������낤�B";
		next;
		mes "[���r�I���f�B��]";
		mes "�ǂ����邩���߂�̂�";
		mes "�������Ԃ��~�����B";
		close;
	case 122:
		mes "[���r�I���f�B��]";
		mes "���t�B�l���̑O����n";
		mes "���͎i�ߊ��̃��r�I���f�B���B";
		mes "���܂Ȃ����Ǎ��͎肪�����Ȃ��B";
		close;
	default:
		mes "[���r�I���f�B��]";
		mes "���t�B�l���̑O����n";
		mes "�X�v�����f�B�b�h�ւ悤�����B";
		mes "���͎i�ߊ��̃��r�I���f�B�����B";
		next;
		mes "[���r�I���f�B��]";
		mes "���ꂮ����y���ȍs����";
		mes "�T����悤���肢�������B";
		mes "��X�̓T�t�@���Ƃ̐킢��";
		mes "�肪����Ȃ��̂��B";
		close;
	}
}

spl_in01,104,56,5	script	�A���I�X	437,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�A���I�X]";
		mes "AmanVilShar�@Ie";
		mes "DorLuShar Mu Re";
		close;
	}
	switch(NYD_1QUE) {
	case 91:
		mes "[�A���I�X]";
		mes strcharinfo(0)+ "�A";
		mes "���ȏЉ�����Ă����܂��傤�B";
		mes "���͕����̃A���I�X�B";
		mes "�i�ߊ��̖��߂ɂ��";
		mes "���Ȃ��̒�����";
		mes "���͂��邱�ƂɂȂ�܂����B";
		next;
		mes "[�A���I�X]";
		mes "�ł͂��Ȃ������ׂ悤�Ƃ��Ă���";
		mes "���A�ɂ��Đ������܂��傤�B";
		mes "���ꂩ��b�����e�̓��t�B�l����";
		mes "��w�������m��Ȃ�";
		mes "�ɔ鎖���ɂȂ�܂��B";
		next;
		mes "[�A���I�X]";
		mes "�ł����炠�Ȃ������ꂩ��b��";
		mes "���e�̋@���͎���Ă��������B";
		mes "���Ȃ��̎푰�l�Ԃ̒��ł�";
		mes "����ꂽ�҂݂̂ɘb���Ă��������B";
		next;
		menu "�킩��܂���",-;
		mes "[�A���I�X]";
		mes "�ł͂��b���܂��傤�B";
		next;
		mes "[�A���I�X]";
		mes "���̓��A�̓C�O�h���V���̒��S����";
		mes "�q�����Ă��܂��B";
		mes "�����Ă����ɂ�";
		mes "���҂̑�������̂ł��B";
		next;
		menu "���҂̑��H",-;
		mes "[�A���I�X]";
		mes "�����ł��B";
		mes "�C�O�h���V����";
		mes "����^FF0000�j�[�Y�w�b�O^000000�̑��B";
		mes "���҂̖�̉���";
		mes "�j�[�Y�w�b�O������������̂ł��B";
		next;
		mes "[�A���I�X]";
		mes "���t�B�l���ɂƂ��Đ��n�Ȃ̂ł��B";
		mes "�����ăj�[�Y�w�b�O�̂�����";
		mes "�j�[�Y�w�b�O��^FF0000�厘�]^000000�ł�����";
		mes "^FF0000�C�O�h���V�����A�h^000000�l��";
		mes "��������Ⴂ�܂��B";
		next;
		mes "[�A���I�X]";
		mes "���҂̖�ɍs���A";
		mes "�C�O�h���V�����A�h�l����";
		mes "�b�𕷂��Ă��������B";
		next;
		mes "[�A���I�X]";
		mes "�������҂����������B";
		mes "���Ȃ������҂̖��";
		mes "�ڐG�ł���悤�ɂ��鏀�������܂��B";
		next;
		mes "�]�A���I�X�͕������т������";
		mes "�@�����ꂽ�D��p�ӂ����]";
		set NYD_1QUE,101;
		setquest 70892;
		delquest 70891;
		close;
	case 101:
		mes "[�A���I�X]";
		mes "���҂̖�ƐڐG�ł���҂�";
		mes "�����Ă��܂��B";
		mes "�j�[�Y�w�b�O�̎��]�݂̂�";
		mes "�ڐG��������Ă��܂��B";
		mes "����ȊO�̎҂͋߂Â��܂���B";
		next;
		mes "[�A���I�X]";
		mes "���������]�Ƃ����ǁA";
		mes "������Ă���̂͐ڐG�݂̂ł��B";
		mes "���҂̖��ʂ邱�Ƃ��ł���̂�";
		mes "�厘�]�C�O�h���V�����A�h�l�����ł��B";
		next;
		mes "[�A���I�X]";
		mes "�����Ď����j�[�Y�w�b�O��";
		mes "���]�̈�l�Ȃ̂ł��B";
		mes "���]�̗͂��g���A";
		mes "���Ȃ������҂̖��";
		mes "�߂Â���悤�ɂ��܂��傤�B";
		next;
		mes "�]�A���I�X�͎D��������";
		mes "�@�������������]";
		next;
		misceffect 152,"";
		next;
		mes "[�A���I�X]";
		mes "����Ŏ��҂̖��";
		mes "�ڐG�ł���͂��ł��B";
		mes "���������Ȃ��̏ꍇ�A";
		mes "�����Ȏ��]�ł͂Ȃ��̂�";
		mes "�ꎞ�I�Ȍ��ʂ�������܂���B";
		next;
		mes "[�A���I�X]";
		mes "�����Ă��ꂩ��";
		mes "���Ȃ��Ɏ����������܂��B";
		mes "�C�O�h���V�����A�h�l��";
		mes "��b���邽�߂ɕK�v�ɂȂ�܂��B";
		next;
		mes "[�A���I�X]";
		mes "AnomarDu�@Ha";
		mes "desUdenVer�@Ie";
		next;
		mes "[�A���I�X]";
		mes "remuAlaAsh�@Mu";
		mes "ModtasAn�@Yu�@Dur";
		next;
		mes "[�A���I�X]";
		mes "TalsehrDur�@So";
		mes "CyaReMush�@Di�@DielAlaWos";
		mes "Ie�@RuffserIman�@Ie";
		next;
		mes "[�A���I�X]";
		mes "���҂̖��";
		mes "���̎������������";
		mes "�C�O�h���V�����A�h�l��";
		mes "�����������Ă���͂��ł��B";
		next;
		mes "[�A���I�X]";
		mes "�厘�]�C�O�h���V���l��";
		mes "�̑�ȕ��ł��̂�";
		mes "���ꂮ����e���̂Ȃ��悤��";
		mes "���Ă��������B";
		next;
		mes "[�A���I�X]";
		mes "�c�c";
		next;
		mes "[�A���I�X]";
		mes "�c�c";
		mes "�����C�O�h���V�����A�h�l��";
		mes "�l�q����������������c�c";
		next;
		menu "�H",-;
		mes "[�A���I�X]";
		mes "�����A���ł�����܂���c�c";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�A���I�X]";
		mes "�c�c";
		mes "���͍ŋ�";
		mes "�C�O�h���V�����A�h�l��";
		mes "�l�q�����������悤��";
		mes "�C�����Ă���̂ł��B";
		mes "�l���������Ƃ͎v���̂ł����c�c";
		next;
		mes "[�A���I�X]";
		mes "�c�c";
		next;
		mes "[�A���I�X]";
		mes "��͂艽�ł�����܂���B";
		mes "���̘b�͖Y��Ă��������B";
		mes "����ł͎��҂̖��";
		mes "�������Ă��������B";
		set NYD_1QUE,111;
		setquest 70893;
		delquest 70892;
		close;
	case 111:
	case 200:
		mes "[�A���I�X]";
		mes "����ł͎��҂̖��";
		mes "�������Ă��������B";
		close;
	case 121:
		mes "[�A���I�X]";
		mes "�܂������̂悤�Ȏ��Ԃ�";
		mes "�Ȃ��Ă���Ȃ�āc�c";
		mes "�M�������Ȃ��ł����A";
		mes "�������󂯎~�߂Ȃ��Ă͂����܂���B";
		next;
		mes "[�A���I�X]";
		mes "�^�������������̂�";
		mes "���Ȃ��̂������ł��B";
		mes "������󂯎���Ă��������B";
		next;
		if(checkitemblank() == 0) {
			mes "[�A���I�X]";
			mes "�ǂ���玝�����̎�ސ���";
			mes "�����悤�ł��ˁB";
			mes "����ł͂���̕i��";
			mes "���Ȃ��ɓn�����Ƃ��ł��܂���B";
			mes "��ސ������炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		if(checkre())
			getexp 300000,70000;
		else
			getexp 3000000,700000;
		getitem 6081,100;
		set NYD_1QUE,131;
		setquest 200920;
		delquest 70910;
		mes "[�A���I�X]";
		mes "����ɂ��Ă�";
		mes "���ꂩ���̂ǂ��Ȃ�̂ł��傤���B";
		mes "�i�ߊ��͂ǂ��������c�c";
		close;
	case 131:
		mes "[�A���I�X]";
		mes "����ɂ��Ă�";
		mes "���ꂩ���̂ǂ��Ȃ�̂ł��傤���B";
		mes "�i�ߊ��͂ǂ��������c�c";
		close;
	default:
		mes "[�A���I�X]";
		mes "�\���󂠂�܂���";
		mes "���͎肪�����܂���B";
		mes "���̎҂Ƙb���Ă��������B";
		close;
	}
}

spl_in01,101,52,5	script	��q��#1	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��q��]";
		mes "ThusDurnah�@Ra";
		mes "SharVeldIyaz�@U�@UorAmanDur";
		mes " Yee neaOsaAdor Yee ";
		close;
	}
	mes "[��q��]";
	mes "�����̓X�v�����f�B�b�h�̎i�ߎ��B";
	mes "�����񂶂�Ȃ����B";
	close;
}

spl_in01,118,52,5	script	��q��#2	447,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��q��]";
		mes "ThusDurnah�@Ra";
		mes "SharVeldIyaz�@U�@UorAmanDur";
		mes " Yee neaOsaAdor Yee ";
		close;
	}
	mes "[��q��]";
	mes "�����̓X�v�����f�B�b�h�̎i�ߎ��B";
	mes "�����񂶂�Ȃ����B";
	close;
}

man_in01,311,57,3	script	�G�g��	453,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�G�g��]";
		mes "���ʁ� �� �偾�� �� �ڇ��� �� ? �� ";
		close;
	}
	switch(NYD_1QUE) {
	case 52:
		mes "[�G�g��]";
		mes "�傫�Ȑ����o���Ă��܂���";
		mes "���܂Ȃ������B";
		mes "����������Ă��ꂽ�܂��B";
		next;
		mes "[�G�g��]";
		mes "���������Ȃ��ɂ�";
		mes "�T�t�@���̑�\�Ƃ���";
		mes "�`���Ă����������Ƃ�����B";
		next;
		mes "[�G�g��]";
		mes "�ŋߎ����̘c�݂��������A";
		mes "�������炠�Ȃ��̎푰��";
		mes "���̑嗤��K���悤�ɂȂ����̂�";
		mes "�������Ă���B";
		next;
		mes "[�G�g��]";
		mes "���Ȃ������̒n�̏󋵂�";
		mes "�������Ă����낤�H";
		next;
		mes "[�G�g��]";
		mes "�T�t�@���ƃ��t�B�l����";
		mes "�����Ԑ푈���s���Ă���B";
		next;
		mes "[�G�g��]";
		mes "�������T�t�@����";
		mes "�a�ɂ������Ă���A";
		mes "�u���f�B�E�����Ȃ����";
		mes "�̂��؂̂悤��";
		mes "�͂�ʂĂċ����ʂĂĂ��܂��B";
		next;
		mes "[�G�g��]";
		mes "�����玄�B�͂��Ȃ�����";
		mes "���ߎ����N���������͂Ȃ��B";
		mes "�F�D�Ȋ֌W�ł������̂��B";
		next;
		mes "[�G�g��]";
		mes "�������ŋ�";
		mes "���Ȃ��B�̎푰�l�Ԃ̍s����";
		mes "���߂������Ƃ��ł��Ȃ��B";
		mes "�����قǕߗ��Ɖ�b���Ă����悤��";
		mes "���B�̋K���𖳎�����悤��";
		mes "�s�����ڗ����Ă���B";
		next;
		mes "[�G�g��]";
		mes "���B�̋K���������";
		mes "�s�����Ă���Ȃ����H";
		next;
		if(select("�����Ƃ���ɂ���","�ߗ��Ƙb�����Ă�������") == 1) {
			mes "[�G�g��]";
			mes "�������A����͗ǂ������B";
			mes "���ꂩ��͋K��������Ă���B";
			close;
		}
		mes "[�G�g��]";
		mes "�Ȃ�ƁA�܂��킩��Ȃ��̂��B";
		next;
		mes "[�G�g��]";
		mes "�ŋ߃��t�B�l����";
		mes "�}�ɓ��A�̌x�������n�߁A";
		mes "�s���ȓ����������Ă���̂ɁA";
		mes "���Ȃ��܂ł��̂悤�ȑԓx�����̂��B";
		next;
		mes "[�G�g��]";
		mes "�c�c";
		mes "������x�����b���Ă����悤�B";
		mes "�ߗ��Ƃ͘b�����Ȃ��ł���B";
		next;
		mes "[�G�g��]";
		mes "���̕ߗ��͓��ʂȕߗ����B";
		mes "���t�B�l���ł����Ȃ��";
		mes "�g���̎҂̂悤�Ȃ̂��B";
		next;
		mes "[�G�g��]";
		mes "�������A�悭�����ė~�����B";
		mes "����ȏ�K����j��̂͂�߂Ă���B";
		mes "����͂��Ȃ��̎푰�ւ̌x�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�A���R���Ԓn�ɖ߂�";
		mes "�}�O��t�@�ɕ񍐂��悤�j";
		set NYD_1QUE,62;
		setquest 70881;
		delquest 70880;
		close;
	case 62:
		mes "[�G�g��]";
		mes "�������A�悭�����ė~�����B";
		mes "����ȏ�K����j��̂͂�߂Ă���B";
		mes "����͂��Ȃ��̎푰�ւ̌x�����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i��x�A���R���Ԓn�ɖ߂�";
		mes "�}�O��t�@�ɕ񍐂��悤�j";
		close;
	case 82:
		mes "[�G�g��]";
		mes "���x�͉��̗p���ŗ����̂��H";
		next;
		mes "[�G�g��]";
		mes "^FF0000�ŋ߃��t�B�l����";
		mes "�}�ɓ��A�̌x�������n�߁A";
		mes "�s���ȓ����������Ă���^000000�B";
		mes "���Ȃ������t�B�l���̂悤��";
		mes "�s���ȓ������Ƃ�Ȃ��悤�Ɋ肤�B";
		next;
		menu "��\�̂��Ȃ��ɘb������܂�",-;
		mes "[�G�g��]";
		mes "�����ˁH";
		next;
		menu "���̓��A�̒����ɋ��͂��Ă�������",-;
		mes "[�G�g��]";
		mes "���������Ă���̂��H";
		mes "���t�B�l�����x������";
		mes "���̓��A�����ƁH";
		next;
		mes "[�G�g��]";
		mes "�{�C�Ō����Ă���̂��H";
		mes "����͂��Ȃ��l�̈ӎv���A";
		mes "���Ȃ��̎푰�Ƃ��Ă̈ӎv���H";
		next;
		menu "�푰���\���Ă̈ӎv�ł�",-;
		mes "[�G�g��]";
		mes "��̓��A�𒲍�����";
		mes "�T�t�@���ɉ��̗��v������H";
		mes "�ނ��냉�t�B�l���Ƃ�";
		mes "�푈���������邾�����I";
		next;
		mes "[�G�g��]";
		mes "�n���ɂ���̂����������ɂ��Ă���B";
		mes "��������o�čs���Ă���B";
		next;
		menu "���t�B�l���Ǝ��g�݂܂�",-;
		mes "[�G�g��]";
		mes "�����Ɓc�H";
		mes "�{�C�Ȃ̂��H";
		next;
		menu "���t�B�l���Ɠ��A�𒲍����܂�",-;
		mes "[�G�g��]";
		mes "�����܂ł���";
		mes "���̓��A�𒲂ׂ����̂��H";
		mes "���B��G�ɂ��Ă܂ł��c�c";
		next;
		mes "[�G�g��]";
		mes "�����ށc�c";
		next;
		mes "�]�G�g���͍l�����񂾁]";
		next;
		mes "[�G�g��]";
		mes "�c�c";
		next;
		mes "[�G�g��]";
		mes "�킩�����A";
		mes "���͂��邱�Ƃɂ��悤�B";
		next;
		mes "[�G�g��]";
		mes "���Ȃ��B�푰�ƃ��t�B�l����";
		mes "���g�܂��͍̂���B";
		next;
		mes "[�G�g��]";
		mes "����ɂ��̓��A�B";
		mes "�C�ɂȂ�Ȃ���ł͂Ȃ��̂łȁB";
		mes "���t�B�l���͉������悤�Ƃ��Ă���̂�";
		mes "���ׂ�̂��悢���낤�B";
		next;
		menu "���肪�Ƃ��������܂��I",-;
		mes "[�G�g��]";
		mes "���ށA����ł�";
		mes "�����ɂ��郉�t�B�l���̕ߗ���";
		mes "�b�𕷂��Ă݂邪�悢�B";
		next;
		mes "[�G�g��]";
		mes "���̕ߗ��̓��t�B�l���ł�";
		mes "�n�ʂ̍����҂��B";
		mes "���A�ɂ��ĉ���";
		mes "�m���Ă���ɈႢ�Ȃ��B";
		set NYD_1QUE,92;
		setquest 70896;
		delquest 70895;
		close;
	case 92:
	case 102:
	case 112:
	case 201:
		mes "[�G�g��]";
		mes "�T�t�@����";
		mes "���Ȃ��ɋ��͂��悤�B";
		close;
	case 200:
	case 202:
		mes "[�G�g��]";
		mes "�}�k�N�ւ悤�����B";
		mes "�y���ȍs�����Ƃ�Ȃ����Ƃ�";
		mes "�񑩂��ė~�����B";
		mes "��������΂��̊X��";
		mes "�؍݂��邱�Ƃ������悤�B";
		next;
		mes "[�G�g��]";
		mes "�����񑩂�j������";
		mes "�����o�čs���Ă��炤����ȁB";
		close;
	case 203:
		mes "[�G�g��]";
		mes "���̓��A�ŉ��������������H";
		next;
		menu "���҂ɂ��Ęb��",-;
		mes "[�G�g��]";
		mes "�c�c";
		mes "���̏ꏊ�̓C�O�h���V����";
		mes "���҃j�[�Y�w�b�O�̑����������̂��B";
		mes "�Ȃ�قǁA���t�B�l����";
		mes "�x�����Ă���킯���ȁB";
		next;
		menu "�j�[�Y�w�b�O�̉e�ɂ��Ęb��",-;
		mes "[�G�g��]";
		mes "����͖{����!?";
		mes "�C�O�h���V���̗͂�";
		mes "���コ���Ă����̂�";
		mes "�j�[�Y�w�b�O�̉e�Ƃ���";
		mes "�ח��������̂�!!";
		next;
		mes "[�G�g��]";
		mes "����ł͂��̐푈��";
		mes "���t�B�l���̊��Ⴂ����";
		mes "�n�܂����Ƃ����̂��c�c";
		next;
		mes "[�G�g��]";
		mes "�{����o����̂Ɠ�����";
		mes "�傫�Ȋ�т�������c�c";
		mes "�푈���I�邩������Ȃ��̂�����B";
		next;
		mes "[�G�g��]";
		mes "���������Ƃ͋t��";
		mes "��т����������{���";
		mes "�o������̂����邾�낤�B";
		next;
		mes "[�G�g��]";
		mes "���Ⴂ�Ő푈���N������A";
		mes "�厖�Ȑl���������҂���������ȁB";
		next;
		mes "[�G�g��]";
		mes "�j�[�Y�w�b�O�̉e�̂��Ƃɂ��Ă�";
		mes "�܂������ɂ��Ă���B";
		mes "�b���傫������B";
		mes "�F�ɂ͏�����ǂ���";
		mes "�������Ȃ��Ă�";
		mes "�卬���������Ă��܂��B";
		next;
		mes "[�G�g��]";
		mes "���v���B";
		mes "�K�������a�������������Ă݂���B";
		next;
		mes "[�G�g��]";
		mes "�悭�������Ă��ꂽ�I";
		mes "����͗炾�B";
		mes "�󂯎���Ă���I";
		next;
		if(checkitemblank() == 0) {
			// ������
			mes "[�G�g��]";
			mes "�ǂ���玝�����̎�ސ���";
			mes "�����悤�ł��ˁB";
			mes "����ł͂���̕i��";
			mes "���Ȃ��ɓn�����Ƃ��ł��܂���B";
			mes "��ސ������炵�Ă���";
			mes "�܂��b�������Ă��������B";
			close;
		}
		if(checkre())
			getexp 300000,70000;
		else
			getexp 3000000,700000;
		getitem 6080,100;
		set NYD_1QUE,122;
		setquest 200920;
		delquest 70907;
		close;
	case 122:
		mes "[�G�g��]";
		mes "�j�[�Y�w�b�O�̉e�̂��Ƃɂ��Ă�";
		mes "�܂������ɂ��Ă���B";
		mes "�b���傫������B";
		mes "�F�ɂ͏�����ǂ���";
		mes "�������Ȃ��Ă�";
		mes "�卬���������Ă��܂��B";
		close;
	default:
		mes "[�G�g��]";
		mes "�}�k�N�ւ悤�����B";
		mes "���͂��̊X�̎񒷃G�g���B";
		mes "������肵�Ă����Ƃ����B";
		next;
		mes "[�G�g��]";
		mes "�������A";
		mes "���̊X�𑛂����悤�ȍs����";
		mes "�ɗ͍T���Ăق����B";
		mes "��X�̓��t�B�l���Ƃ̐킢��";
		mes "��ςȂ̂��B";
		close;
	}
}

man_in01,286,61,5	script	��q��#1	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��q��]";
		mes "��偿 �� �恻";
		close;
	}
	mes "[��q��]";
	mes "�����ƁA����ȏ�";
	mes "�ߗ��ɋ߂Â��Ȃ��ł���B";
	close;
}

man_in01,295,61,3	script	��q��#2	450,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��q��]";
		mes "��偿 ��";
		close;
	}
	mes "[��q��]";
	mes "�ߗ��ɋ߂Â��Ȃ��łق����B";
	close;
}

man_in01,291,62,3	script	���t�B�l���̕ߗ�	437,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[���t�B�l���̕ߗ�]";
		mes "AmanVilShar Ie DorLuShar Mu Re";
		close;
	}
	switch(NYD_1QUE) {
	case 5:
		mes "�]���t�B�l���̏�����";
		mes "�@�����ł���]";
		next;
		mes "�]�T�t�@���̐�m��";
		mes "�@���t��������Ȃ��炵���A";
		mes "�@���邳�����Ȋ������";
		mes "�@���t�B�l���̏��������Ă���]";
		next;
		mes "�]���Ȃ��͗l�q�����邱�Ƃɂ����]";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�˂��A���т܂��Ȃ�!?";
		mes "��������������";
		mes "�����Ă邶��Ȃ��I";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���������ł̊y���݂�";
		mes "�H�������Ȃ񂾂���I";
		mes "���������Ă���!!";
		next;
		mes "[��q��]";
		mes "���������炱����";
		mes "���𑛂��ł���񂾁H";
		next;
		mes "[������l�̌�q��]";
		mes "���������邳���̂�";
		mes "�����̂��Ƃ����ǂȁB";
		mes "�ǂ����܂��A�т��悱���Ƃ�";
		mes "�����Ă���񂶂�Ȃ����H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�������т��悱���Ȃ���!!";
		mes "�����{���ɂ��̋��l�B��";
		mes "�̂낢�񂾂���!!";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���͂ˁA";
		mes "�C�O�h���V����^FF0000���җl�̎��]^000000";
		mes "�Ȃ񂾂���ˁI";
		mes "���t�B�l���ł�";
		mes "���������Ȓn�ʂɂ���̂�!!";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "^FF0000���A�ɂ�����҂̖�^000000�ƐڐG�ł���";
		mes "^FF0000�厘�]�C�O�h���V�����A�h�l^000000��";
		mes "�b�����Ƃ��ł���";
		mes "�����Ȃ����]�̈�l�Ȃ񂾂����!!";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���t�B�l���ł��ꕔ����";
		mes "�m��Ȃ����Ƃ�����";
		mes "�m���Ă���񂾂���!!";
		mes "�����瑁�����т��悱���Ȃ���!!";
		next;
		mes "�]���̃��t�B�l���̕ߗ���";
		mes "�@���A�ɂ���";
		mes "�@�����m���Ă���悤���]";
		next;
		if(select("���邳���̂ŗ�������","���҂̖���ĉ��ł����H") == 1) {
			mes "�]���Ȃ��͂��̏�𗧂��������]";
			close;
		}
		mes "[���t�B�l���̕ߗ�]";
		mes "�����I";
		next;
		mes "�]���t�B�l���̕ߗ���";
		mes "�@���Ȃ��̑��݂ɋ����Ă���]";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���Ȃ��͒N�H";
		mes "�����炻���ɂ���́c�c�H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���t�B�l���̌��t��";
		mes "�킩����Ă��Ƃ́c�c";
		mes "���������č��̘b�𕷂��ꂽ���ȁc�c";
		next;
		menu "���҂̎��]���ĉ��ł����H",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "�܂����A�܂�����c�c";
		mes "�@�������𕷂��ꂿ������c�c";
		next;
		mes "�]���̎��A";
		mes "�@��q�����Ԃɓ����Ă����]";
		next;
		mes "[��q��]";
		mes "�����A�يE�l�B";
		mes "���܂Ȃ����ߗ���";
		mes "�b��������̂͂�߂Ă��c�c";
		next;
		mes "[�H]";
		mes "��q��!!";
		next;
		mes "�]��q�������t�������I���O��";
		mes "�@�����̏�̕�����傫�Ȑ��������]";
		next;
		mes "[��q��]";
		mes "�͂��A^FF0000�G�g��^000000�l!!";
		next;
		mes "[�G�g��]";
		mes "���̈يE�l�Ɏ��̂Ƃ���܂�";
		mes "����悤�ɓ`���Ă���!!";
		mes "�b���������Ƃ�����!!";
		next;
		mes "[��q��]";
		mes "�킩��܂���!!";
		next;
		mes "[��q��]";
		mes "�����A�يE�l�B";
		mes "�������Ă������낤�H";
		mes "�G�g���l�̂Ƃ���܂ōs���Ă���B";
		next;
		menu "�킩��܂���",-;
		mes "[��q��]";
		mes "�{��ꂻ���ȕ��͋C������";
		mes "�����Ȃ��ł����ƍs���Ă���B";
		set NYD_1QUE,52;
		setquest 70880;
		delquest 70870;
		close;
	case 52:
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "�܂����A�܂�����c�c";
		mes "�@���������يE�l��";
		mes "�����ꂿ������c�c";
		next;
		mes "[��q��]";
		mes "�����A�يE�l�B";
		mes "�G�g���l�̂Ƃ���܂ōs���Ă���B";
		close;
	case 92:
		mes "[���t�B�l���̕ߗ�]";
		mes "�˂��A���Ȃ��B";
		mes "���������ăT�t�@����";
		mes "�g�񂶂�����킯�H";
		next;
		menu "�͂�",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "������Ɖ����Ă���Ă�̂�I";
		mes "�z�΂��̌@���邽�߂Ɍ����@��܂�����";
		mes "�C�O�h���V���̍���������";
		mes "�C�O�h���V����";
		mes "���コ���Ă���ꑰ�Ȃ̂�!!";
		next;
		menu "���A�ɂ��ċ����Ăق���",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "���A���Ȃ��H";
		mes "���̓��A�ɋ߂Â����Ƃ��Ă���́H";
		mes "�T�t�@���ƁH";
		next;
		mes "�]���Ȃ��͂��Ȃ������]";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "������Ƃ�߂ā[�[�[!!";
		mes "���ꂾ���͂��肢������!!";
		next;
		mes "�]���̓��A�ɂ���";
		mes "�@�����m���Ă���悤���]";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���肢�A���肢�c�c";
		mes "���̓��A�̓��t�B�l���ɂƂ���";
		mes "�厖�ȏꏊ�Ȃ́c�c";
		mes "����ꂽ�҂�������Ȃ�";
		mes "�_���ȏꏊ�Ȃ́c�c";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "�킩������B";
		mes "�������܂��傤�B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���Ȃ��ɂ��̓��A�̔閧���������B";
		mes "���̂����A�T�t�@���ɂ�";
		mes "�閧�ɂ��ė~�����́B";
		mes "����͎����B";
		next;
		menu "���A�ɂ����ɂ��Ă�������",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "���҂̖��m���Ă���́H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "�܂����c�c";
		mes "�����܂Œm���Ă���́c�c�H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�킩������B";
		mes "���̖��^FF0000�C�O�h���V�����A�h^000000�l��";
		mes "�b�����Ă�����B";
		mes "����͂��������Ƃ�B";
		mes "�����炨�˂����B";
		mes "�T�t�@���ɂ͔閧�ɂ��āB";
		next;
		menu "�����ł��傤",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "�������ˁB";
		mes "�����Ă������B";
		set NYD_1QUE,102;
		setquest 70897;
		delquest 70896;
		close;
	case 102:
		mes "[���t�B�l���̕ߗ�]";
		mes "���̓��A�̓C�O�h���V���̒��S����";
		mes "�q�����Ă���́B";
		mes "�����Ă����ɂ�";
		mes "���҂̑�������̂�B";
		next;
		menu "���҂̑��H",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "�����B";
		mes "�C�O�h���V����";
		mes "����^FF0000�j�[�Y�w�b�O^000000�̑��B";
		mes "���҂̖�̉���";
		mes "�j�[�Y�w�b�O������������́B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���t�B�l���ɂƂ��Đ��n�Ȃ񂾂�B";
		mes "�����ăj�[�Y�w�b�O�̂�����";
		mes "�j�[�Y�w�b�O��^FF0000�厘�]^000000�ł�����";
		mes "^FF0000�C�O�h���V�����A�h^000000�l��";
		mes "����������́B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���҂̖�ɍs���A";
		mes "�C�O�h���V�����A�h�l����";
		mes "�b�𕷂��Ƃ�����B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�����܂��Ă��傤�����B";
		mes "���Ȃ������҂̖��";
		mes "�ڐG�ł���悤�ɂ��鏀�����邩��B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���҂̖�ƐڐG�ł���҂�";
		mes "�����Ă���̂�B";
		mes "�j�[�Y�w�b�O�̎��]�݂̂�";
		mes "�ڐG��������Ă���́B";
		mes "����ȊO�̎҂͋߂Â��Ȃ��B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���������]�Ƃ����ǁA";
		mes "������Ă���̂͐ڐG�݂̂�B";
		mes "���҂̖��ʂ邱�Ƃ��ł���̂�";
		mes "�厘�]�C�O�h���V�����A�h�l�����B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�����Ď����j�[�Y�w�b�O��";
		mes "���]�̈�l�Ȃ񂾂�B";
		mes "���]�̗͂��g���A";
		mes "���Ȃ������҂̖��";
		mes "�߂Â���悤�ɂ��Ă�����B";
		next;
		mes "�]�ߗ��͎������������]";
		misceffect 152,"";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "����Ŏ��҂̖��";
		mes "�ڐG�ł���͂�����B";
		mes "���������Ȃ��̏ꍇ�A";
		mes "�����Ȏ��]�ł͂Ȃ��̂�";
		mes "�ꎞ�I�Ȍ��ʂ����Ȃ�����ˁB";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�����Ă��ꂩ��";
		mes "���Ȃ��Ɏ������������B";
		mes "�C�O�h���V�����A�h�l��";
		mes "��b���邽�߂ɕK�v�ɂȂ�́B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "AnomarDu�@Ha";
		mes "desUdenVer�@Ie";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "remuAlaAsh�@Mu";
		mes "ModtasAn�@Yu�@Dur";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "TalsehrDur�@So";
		mes "CyaReMush�@Di�@DielAlaWos";
		mes "Ie�@RuffserIman�@Ie";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���҂̖��";
		mes "���̎������������";
		mes "�C�O�h���V�����A�h�l��";
		mes "�����������Ă���͂���B";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�厘�]�C�O�h���V���l��";
		mes "�̑�ȕ�������";
		mes "���ꂮ����e���̂Ȃ��悤��";
		mes "���Ă��傤�����ˁB";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "�����C�O�h���V�����A�h�l��";
		mes "�l�q����������������c�c";
		next;
		menu "�H",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "������A���ł��Ȃ��c�c";
		next;
		menu "�ǂ������́H",-;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		mes "���͍ŋ�";
		mes "�C�O�h���V�����A�h�l��";
		mes "�l�q�����������悤��";
		mes "�C�����Ă���񂾁c�c";
		mes "�l���������Ƃ͎v���񂾂��ǁc�c";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "��͂艽�ł��Ȃ���I";
		mes "���̘b�͖Y��āB";
		mes "����ł͎��҂̖��";
		mes "�s���Ă������B";
		mes "�T�t�@���ɂ͔閧������ˁI";
		set NYD_1QUE,112;
		setquest 70898;
		delquest 70897;
		close;
	case 112:
		mes "[���t�B�l���̕ߗ�]";
		mes "���҂̖�Ɍ������āB";
		mes "�����߂Â���͂�����B";
		mes "���ꂮ����C�O�h���V�����A�h�l��";
		mes "����̂Ȃ��悤�ɂ��ĂˁB";
		close;
	case 122:
		mes "[���t�B�l���̕ߗ�]";
		mes "����c�c";
		mes "���Ȃ��A���̗́c�c";
		mes "�����Ɏ��]�ɂȂ����́c�c�H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "���������Ȃ�����";
		mes "�킸���Ȃ�����҂̗͂�";
		mes "������c�c";
		mes "�܂������҂ɉ�����́H";
		next;
		mes "[���t�B�l���̕ߗ�]";
		mes "�ł����҂̗͂�";
		mes "�׈��Ȋ����ɕς���Ă���c�c";
		mes "�˂��A��̉�����������!?";
		next;
		mes "[��q��]";
		mes "�����ƁA";
		mes "���܂Ȃ����b�͂����܂ł��B";
		mes "�G�g���l���炳�������߂��o�ĂˁB";
		mes "���̕ߗ��Ƃ̉�b�͋֎~���B";
		close;
	default:
		mes "[���t�B�l���̕ߗ�]";
		mes "�c�c";
		next;
		mes "[��q��]";
		mes "���܂Ȃ����ߗ���";
		mes "�b�������Ȃ��ł���B";
		close;
	}
}

nyd_dun02,178,255,0	script	���u#nyd_out	844,3,3,{
	mes "�]�����̑��u������B";
	mes "�@���u�̒����ɂ͎��Ԃ��܂���Ă���A";
	mes "�@�s�v�c�Ȍ��������Ă���B";
	mes "�@���Ԃ̉��Ƀ��o�[�炵����������]";
	next;
	if(select("���삷��","��߂�") == 2) {
		mes "�]���Ȃ��͂��̏�𗧂��������]";
		close;
	}
	mes "�]���u�𑀍삷���";
	mes "�@�u�Ԏ��삪�Â��Ȃ����]";
	close2;
	warp "nyd_dun02",139,268;
	end;
OnTouch:
	misceffect 362;
	end;
}

nyd_dun02,139,274,0	script	���u#nyd_in	844,3,3,{
	if(.work) {
		mes "�]�����̑��u������B";
		mes "�@�����쒆�̂悤���B";
		mes "�@���삪�I��܂ŏ����҂Ƃ��]";
		close;
	}
	mes "�]�����̑��u������B";
	mes "�@���u�̒����ɂ͎��Ԃ��܂���Ă���A";
	mes "�@�s�v�c�Ȍ��������Ă���B";
	mes "�@���Ԃ̉��Ƀ��o�[�炵����������]";
	next;
	if(select("���삷��","��߂�") == 2) {
		mes "�]���Ȃ��͂��̏�𗧂��������]";
		close;
	}
	if(.work) {
		mes "�]�����쒆�̂悤���B";
		mes "�@���삪�I��܂ŏ����҂Ƃ��]";
		close;
	}
	set .work,1;
	if(rand(2)) {
		donpcevent "nyd_warp_s1::OnStart";
		donpcevent "nyd_warp_11::OnStart";
		donpcevent "nyd_warp_21::OnStart";
		donpcevent "nyd_warp_22::OnStart";
		donpcevent "nyd_warp_22_2::OnStart";
	}
	else {
		donpcevent "nyd_warp_s3::OnStart";
		donpcevent "nyd_warp_13::OnStart";
		donpcevent "nyd_warp_14::OnStart";
		donpcevent "nyd_warp_24::OnStart";
		donpcevent "nyd_warp_24_2::OnStart";
	}
	initnpctimer;
	mes "�]���u���쓮���n�߁A";
	mes "�@����������n�߂��]";
	close;
OnTimer70000:
	hideoffnpc "nyd_warp_s1";
	hideoffnpc "nyd_warp_s3";

	hideoffnpc "nyd_warp_11";
	hideoffnpc "nyd_warp_13";
	hideoffnpc "nyd_warp_14";

	hideoffnpc "nyd_warp_21";
	hideoffnpc "nyd_warp_22";
	hideoffnpc "nyd_warp_24";
	hideoffnpc "nyd_warp_25";
	hideoffnpc "nyd_warp_26";

	hideoffnpc "nyd_warp_31";
	hideoffnpc "nyd_warp_33";
	hideoffnpc "nyd_warp_35";

	hideoffnpc "nyd_warp_41";
	hideoffnpc "nyd_warp_42";
	hideoffnpc "nyd_warp_43";
	hideoffnpc "nyd_warp_45";
	hideoffnpc "nyd_warp_46";

	hideoffnpc "nyd_warp_52";
	hideoffnpc "nyd_warp_55";
	hideoffnpc "nyd_warp_56";

	hideoffnpc "nyd_warp_61";
	hideoffnpc "nyd_warp_62";
	hideoffnpc "nyd_warp_64";
	hideoffnpc "nyd_warp_65";
	hideoffnpc "nyd_warp_66";

	hideoffnpc "nyd_warp_71";
	hideoffnpc "nyd_warp_72";
	hideoffnpc "nyd_warp_73";
	hideoffnpc "nyd_warp_75";
	hideoffnpc "nyd_warp_76";

	hideoffnpc "nyd_warp_81";
	hideoffnpc "nyd_warp_82";
	hideoffnpc "nyd_warp_83";
	hideoffnpc "nyd_warp_84";
	hideoffnpc "nyd_warp_85";

	hideoffnpc "nyd_warp_91";
	hideoffnpc "nyd_warp_92";
	hideoffnpc "nyd_warp_93";
	hideoffnpc "nyd_warp_94";
	hideoffnpc "nyd_warp_95";

	hideoffnpc "nyd_warp_e1";
	hideoffnpc "nyd_warp_e2";
	hideoffnpc "nyd_warp_e3";

	hideonnpc "nyd_warp_22_2";
	hideonnpc "nyd_warp_24_2";
	hideonnpc "nyd_warp_43_2";
	hideonnpc "nyd_warp_45_2";
	hideonnpc "nyd_warp_61_2";
	hideonnpc "nyd_warp_65_2";
	hideonnpc "nyd_warp_81_2";
	hideonnpc "nyd_warp_83_2";
	hideonnpc "nyd_warp_85_2";
	set .work,0;
	stopnpctimer;
	end;
OnTouch:
	misceffect 362;
	end;
}

nyd_dun02,143,272,0	script	nyd_warp_s1	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_s1";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_s1";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}
nyd_dun02,143,269,0	script	nyd_warp_s2	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,143,266,0	script	nyd_warp_s3	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_s3";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_s3";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,143,263,0	script	nyd_warp_s4	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,146,272,0	script	nyd_warp_11	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_11";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_11";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,146,269,0	script	nyd_warp_12	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,146,266,0	script	nyd_warp_13	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_13";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_13";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,146,263,0	script	nyd_warp_14	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_14";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_14";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,146,260,0	script	nyd_warp_15	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,272,0	script	nyd_warp_21	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_21";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_21";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,269,0	script	nyd_warp_22	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_22";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_22";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,269,0	script	nyd_warp_22_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_22_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_22_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_22_2";
	donpcevent "nyd_warp_31::OnStart";
	donpcevent "nyd_warp_41::OnStart";
	donpcevent "nyd_warp_42::OnStart";
	donpcevent "nyd_warp_43::OnStart";
	donpcevent "nyd_warp_43_2::OnStart";
	end;
}

nyd_dun02,149,266,0	script	nyd_warp_23	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,263,0	script	nyd_warp_24	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_24";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_24";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,263,0	script	nyd_warp_24_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_24_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_24_2";
	end;
OnTouch:
	if(rand(2)) {
		donpcevent "nyd_warp_33::OnStart";
		donpcevent "nyd_warp_43::OnStart";
		donpcevent "nyd_warp_43_2::OnStart";
	} else {
		donpcevent "nyd_warp_25::OnStart";
		donpcevent "nyd_warp_26::OnStart";
		donpcevent "nyd_warp_35::OnStart";
		donpcevent "nyd_warp_45::OnStart";
		donpcevent "nyd_warp_45_2::OnStart";
	}
	hideonnpc "nyd_warp_24_2";
	end;
}

nyd_dun02,149,260,0	script	nyd_warp_25	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_25";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_25";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,149,257,0	script	nyd_warp_26	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_26";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_26";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,152,270,0	script	nyd_warp_31	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_31";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_31";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,152,267,0	script	nyd_warp_32	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,152,264,0	script	nyd_warp_33	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_33";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_33";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,152,261,0	script	nyd_warp_34	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,152,258,0	script	nyd_warp_35	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_35";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_35";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,269,0	script	nyd_warp_41	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_41";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_41";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,266,0	script	nyd_warp_42	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_42";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_42";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,263,0	script	nyd_warp_43	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_43";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_43";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,263,0	script	nyd_warp_43_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_43_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_43_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_43_2";
	donpcevent "nyd_warp_52::OnStart";
	donpcevent "nyd_warp_61::OnStart";
	donpcevent "nyd_warp_61_2::OnStart";
	end;
}

nyd_dun02,155,260,0	script	nyd_warp_44	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,257,0	script	nyd_warp_45	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_45";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_45";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,155,257,0	script	nyd_warp_45_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_45_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_45_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_45_2";
	donpcevent "nyd_warp_46::OnStart";
	donpcevent "nyd_warp_55::OnStart";
	donpcevent "nyd_warp_56::OnStart";
	donpcevent "nyd_warp_65::OnStart";
	donpcevent "nyd_warp_65_2::OnStart";
	end;
}

nyd_dun02,155,254,0	script	nyd_warp_46	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_46";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_46";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,266,0	script	nyd_warp_51	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,263,0	script	nyd_warp_52	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_52";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_52";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,260,0	script	nyd_warp_53	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,257,0	script	nyd_warp_54	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,254,0	script	nyd_warp_55	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_55";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_55";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,158,251,0	script	nyd_warp_56	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_56";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_56";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,264,0	script	nyd_warp_61	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_61";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_61";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,264,0	script	nyd_warp_61_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_61_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_61_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_61_2";
	donpcevent "nyd_warp_62::OnStart";
	donpcevent "nyd_warp_71::OnStart";
	donpcevent "nyd_warp_72::OnStart";
	donpcevent "nyd_warp_81::OnStart";
	donpcevent "nyd_warp_81_2::OnStart";
	end;
}

nyd_dun02,161,261,0	script	nyd_warp_62	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_62";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_62";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,258,0	script	nyd_warp_63	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,255,0	script	nyd_warp_64	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_64";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_64";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,252,0	script	nyd_warp_65	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_65";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_65";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,161,252,0	script	nyd_warp_65_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_65_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_65_2";
	end;
OnTouch:
	if(rand(2)) {
		donpcevent "nyd_warp_64::OnStart";
		donpcevent "nyd_warp_73::OnStart";
		donpcevent "nyd_warp_82::OnStart";
		donpcevent "nyd_warp_83::OnStart";
		donpcevent "nyd_warp_83_2::OnStart";
	} else {
		donpcevent "nyd_warp_66::OnStart";
		donpcevent "nyd_warp_75::OnStart";
		donpcevent "nyd_warp_76::OnStart";
		donpcevent "nyd_warp_85::OnStart";
		donpcevent "nyd_warp_85_2::OnStart";
	}
	hideonnpc "nyd_warp_65_2";
	end;
}

nyd_dun02,161,249,0	script	nyd_warp_66	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_66";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_66";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,261,0	script	nyd_warp_71	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_71";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_71";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,258,0	script	nyd_warp_72	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_72";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_72";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,255,0	script	nyd_warp_73	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_73";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_73";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,252,0	script	nyd_warp_74	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,249,0	script	nyd_warp_75	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_75";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_75";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,164,246,0	script	nyd_warp_76	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_76";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_76";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,258,0	script	nyd_warp_81	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_81";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_81";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,258,0	script	nyd_warp_81_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_81_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_81_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_81_2";
	donpcevent "nyd_warp_91::OnStart";
	donpcevent "nyd_warp_92::OnStart";
	donpcevent "nyd_warp_93::OnStart";
	donpcevent "nyd_warp_e1::OnStart";
	end;
}

nyd_dun02,167,255,0	script	nyd_warp_82	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_82";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_82";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,252,0	script	nyd_warp_83	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_83";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_83";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,252,0	script	nyd_warp_83_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_83_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_83_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_83_2";
	donpcevent "nyd_warp_84::OnStart";
	donpcevent "nyd_warp_94::OnStart";
	donpcevent "nyd_warp_e2::OnStart";
	end;
}

nyd_dun02,167,249,0	script	nyd_warp_84	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_84";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_84";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,246,0	script	nyd_warp_85	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_85";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_85";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,167,246,0	script	nyd_warp_85_2	139,1,1,{
OnInit:
	hideonnpc "nyd_warp_85_2";
	end;
OnStart:
	hideoffnpc "nyd_warp_85_2";
	end;
OnTouch:
	hideonnpc "nyd_warp_85_2";
	donpcevent "nyd_warp_95::OnStart";
	donpcevent "nyd_warp_e3::OnStart";
	end;
}

nyd_dun02,170,257,0	script	nyd_warp_91	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_91";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_91";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,170,254,0	script	nyd_warp_92	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_92";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_92";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,170,251,0	script	nyd_warp_93	139,1,1,1,1,{
OnStart:
	hideonnpc "nyd_warp_93";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
OnTimer10000:
	misceffect 18;
	end;
OnTimer12000:
	hideoffnpc "nyd_warp_93";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,170,248,0	script	nyd_warp_94	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_94";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_94";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,170,245,0	script	nyd_warp_95	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_95";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
	misceffect 224;
	end;
OnTimer8000:
	misceffect 18;
	end;
OnTimer10000:
	hideoffnpc "nyd_warp_95";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,173,251,0	script	nyd_warp_e1	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_e1";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_e1";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,173,248,0	script	nyd_warp_e2	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_e2";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_e2";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,173,245,0	script	nyd_warp_e3	139,1,1,{
OnStart:
	hideonnpc "nyd_warp_e3";
	initnpctimer;
	misceffect 224;
	end;
OnTimer2000:
OnTimer4000:
OnTimer6000:
OnTimer8000:
	misceffect 224;
	end;
OnTimer10000:
OnTimer12000:
	misceffect 18;
	end;
OnTimer15000:
	hideoffnpc "nyd_warp_e3";
	stopnpctimer;
	end;
OnTouch:
	warp "nyd_dun01",214,68;
	end;
}

nyd_dun02,173,242,0	script	nyd_warp_e4	139,1,1,{
	warp "nyd_dun01",214,68;
	end;
}

//============================================================
// �L�̎�T�[�r�X�N�G�X�g
//------------------------------------------------------------
-	script	���̌Q��#Ygg	844,{
	if(checkquest2(12060)) {
		mes "[" +strcharinfo(0)+ "]";
		mes "�i���́A�K�����Ɍ���ꂽ";
		mes "�ނ�����Ă͂����Ȃ����Ԃ��B";
		mes "�ނ����߂Ă������j";
		close;
	}
	if(countitem(6039) >= 20) {
		mes "[" +strcharinfo(0)+ "]";
		mes "�i����߂肷����������";
		mes "���̐����������C������B";
		mes "���͂���ȏ�A";
		mes "����߂�̂͂�߂Ă������j";
		close;
	}
	if(checkitemblank() < 4) {
		mes "�]�����ŋ���߂ꂻ�����B";
		mes "�@�������A�����A�C�e���̎�ނ������B";
		mes "�@���炵�Ă��璧�킵�悤�]";
		close;
	}
	if((MaxWeight - Weight) < 1000) {
		mes "�]�����ŋ���߂ꂻ�����B";
		mes "�@�������A�����A�C�e���̏d�ʂ������B";
		mes "�@���炵�Ă��璧�킵�悤�]";
		close;
	}
	set .@time,15;
	if(equippeditem(2550)) set .@time,.@time - 2;	// �ނ�l�̃}�t���[
	if(equippeditem(2443)) set .@time,.@time - 2;	// �ނ�p���C
	if(equippeditem(2764)) set .@time,.@time - 3;	// �����Ȓނ��
	if(equippeditem(2775)) set .@time,.@time - 1;	// �ނ�a
	if(equippeditem(1599)) set .@time,.@time - 3;	// �A�[���}��(�f�o�b�O�p)
	if(equippeditem(2199)) set .@time,.@time - 4;	// �A�t���}�Y�_�[(�f�o�b�O�p)
	misceffect 109,"";
	misceffect 65,"";
	progressbar "FFFF00",.@time;
	if(ASH_3QUE == 13 && rand(5) == 0) {	//��c�̂��Ƃ��N�G�X�g�i�s��
		set ASH_3QUE,14;
		chgquest 8201,70150;
		getitem 6037,1;		//�ڂ�ڂ�ȏ���
		misceffect 109;
		announce strcharinfo(0)+ " : ���̌Q�ꂪ����ꏊ�ŁA�ڂ�ڂ�ȏ��ނ�������!!",9,0xFF77FF;
		close;
	}
	set .@rand,rand(1,70);
	if(.@rand < 20)		getitem 6039,1;		//���̂͂�����
	else if(.@rand == 20)	getitem 908,1;		//������̗�
	else if(.@rand == 21)	getitem 909,1;		//�[���s�[
	else if(.@rand == 22)	getitem 963,1;		//�s����
	else if(.@rand == 23)	getitem 956,1;		//�g�Q�����Ă���G��
	else if(.@rand == 24)	getitem 6049,1;		//�܂�����
	else if(.@rand == 25)	getitem 918,1;		//�ׂƂׂƐ�����
	else if(.@rand == 26)	getitem 960,1;		//���Ƀj�b�p
	else if(.@rand == 27)	getitem 910,1;		//�K���b�g
	else if(.@rand == 28)	getitem 6081,1;		//�X�v�����f�B�b�h�R�C��
	else if(.@rand < 40)	getitem 7049,1;		//��
	else if(!rand(200)) {
		getitem 644,1;		//�v���[���g�{�b�N�X
		announce strcharinfo(0)+ " : ���̌Q�ꂪ����ꏊ�ŁA�v���[���g�{�b�N�X��������!!",9,0x00FFFF;
	}
	else if(!rand(500)) {
		getitem 603,1;		//�Â�����
		announce strcharinfo(0)+ " : ���̌Q�ꂪ����ꏊ�ŁA�Â�������������!!",9,0x00FFFF;
	}
	else if(!rand(3000)) {
		getitem 617,1;		//�Â����F�̔�
		announce strcharinfo(0)+ " : ���̌Q�ꂪ����ꏊ�ŁA�Â����F�̔���������!!",9,0x44FF44;
	}
	else {
		mes "�]�����߂�Ȃ������]";
		close;
	}
	end;
}

spl_fild03,226,151,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild03,268,230,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild03,293,253,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild03,165,100,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild03,317,190,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild01,41,118,0		duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild01,317,361,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild01,55,269,0		duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild01,332,131,0	duplicate(���̌Q��#Ygg)	���̌Q��#2	844
spl_fild01,170,74,0		duplicate(���̌Q��#Ygg)	���̌Q��#2	844

-	script	�s�v�c�Ȋ�#Ygg	844,{
	if(checkquest2(12062)) {
		if(checkquest(12062,PLAYTIME) == 0) {
			mes "[" +strcharinfo(0)+ "]";
			mes "�i���́A";
			mes "�z�ΒS���̔L�̎�E�l�Ɍ���ꂽ";
			mes "�z�΍̌@�����Ă͂����Ȃ����Ԃ��B";
			mes "�z�΍̌@����߂Ă������j";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�z�ΒS���̔L�̎�E���Ɍ���ꂽ";
		mes "�z�΍̌@�����Ă͂����Ȃ�";
		mes "���Ԃ͏I������B";
		mes "�z�ΒS���̔L�̎�E����";
		mes "�z�΍̌@�̋������炨���j";
		close;
	}
	if(countitem(6048) >= 3) {
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�s�v�c�Ȋ₩��";
		mes "���̂��̌@�ł��Ȃ��c�c";
		mes "�������Ă��関�m�F�z�΂�";
		mes "�����̂悤�ȋC������c�c�j";
		close;
	}
	if(checkitemblank() == 0) {
		mes "�]�����ō̌@�����";
		mes "�@������ɓ���悤���B";
		mes "�@�����������A�C�e���̎�ނ������̂�";
		mes "�@���炵�Ă��璧�킵�悤�]";
		close;
	}
	if((MaxWeight - Weight) < 1000) {
		mes "�]�����ō̌@�����";
		mes "�@������ɓ���悤���B";
		mes "�@�����������A�C�e���̏d�ʂ������̂�";
		mes "�@���炵�Ă��璧�킵�悤�]";
		close;
	}
	misceffect 101,"";
	progressbar "FFFF00",10;
	set .@rand,rand(1,20);
	if(.@rand < 13)		getitem 7049,1;		//��
	else if(.@rand == 13)	getitem 990,1;		//���b�h�u���b�h
	else if(.@rand == 14)	getitem 991,1;		//�N���X�^���u���[
	else if(.@rand == 15)	getitem 992,1;		//�E�B���h�I�u���F���f���[��
	else if(.@rand == 16)	getitem 993,1;		//�C�G���[���C�u
	else if(.@rand == 17)	getitem 6080,1;		//�}�k�N�R�C��
	else 			getitem 6048,1;		//���m�F�z��
	initnpctimer;
	hideonnpc;
	end;
OnTimer120000:
	stopnpctimer;
	hideoffnpc;
	end;
}

man_fild02,146,81,0		duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash31	844
man_fild02,140,148,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash32	844
man_fild02,88,263,0		duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash33	844
man_fild02,146,365,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash34	844
man_fild02,336,305,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash35	844
man_fild02,248,124,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash36	844
man_fild02,285,115,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash37	844
man_fild02,346,116,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash38	844
man_fild02,358,174,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash39	844
man_fild02,241,227,0	duplicate(�s�v�c�Ȋ�#Ygg)	�s�v�c�Ȋ�#Ash40	844

manuk,304,195,5	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�N]";
		mes "�̓����@�� ���́�";
		mes "���@�������@���@";
		mes "���΁́@���@��";
		mes "��ȁ@���@�����";
		mes "���@����";
		close;
	}
	mes "[�N]";
	mes "�������T�t�@���́A";
	mes "�n���ɑ��݂���z�΃u���f�B�E������";
	mes "���o����������ێ悵��";
	mes "�a�̏Ǐ��}���Ă���̂ł��B";
	close;
}

manuk,274,239,5	script	���m	455,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�}�k�N������]";
		mes "�������@���@�΁���";
		mes "��@���΁ځ@��";
		mes "����ȁ@��";
		mes "��ȁ΁@���@���灬�@��";
		mes "�́�";
		next;
		mes "[�}�k�N������]";
		mes "�́��ځ@�� �����́@���@��";
		close;
	}
	mes "[�}�k�N������]";
	mes "���́A���̊��܂킵���׈���";
	mes "�d�����t�B�l���Ƃ̐킢�ŁA";
	mes "���̏��𕉂��Ă��܂����c�c";
	next;
	mes "[�}�k�N������]";
	mes "�ǂ����A���̏��̂�����";
	mes "�u���f�B�E�����z���ł��Ȃ�";
	mes "�̂ɂȂ��Ă��܂����̂��B";
	next;
	mes "[�}�k�N������]";
	mes "�c�c";
	mes "���̂܂�";
	mes "���͎��ʂ̂��낤���c�c";
	close;
}

manuk,107,233,5	script	�N	454,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�l�����ސN]";
		mes "�́����@�� ������";
		mes "���@�́���";
		mes "���@��́�";
		mes "���@�聾�ȁ@��";
		mes "������@���@�ځ�";
		close;
	}
	mes "[�l�����ސN]";
	mes "�����ށc�c";
	mes "���Ƃ������Ƃ�";
	mes "�}�k�N�̒��݂ł���^FF0000�}�k�N�R�C��^000000��";
	mes "�ǂ����֗��Ƃ��Ă��܂����炵���B";
	mes "�ܑ̖������Ƃ������c�c";
	next;
	mes "[�l�����ސN]";
	mes "�ጴ�ɂ���s�v�c�Ȋ��";
	mes "���Q������܂ł�";
	mes "�����Ă����̂͊o���Ă���̂����c�c";
	next;
	mes "[�l�����ސN]";
	mes "�c�c";
	mes "���߂邵���Ȃ����B";
	mes "�E�����l���L����";
	mes "�g���Ă���邱�Ƃ��F�낤�B";
	close;
}

splendide,218,193,3	script	�d��	441,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[��ꂽ�悤�Ɍ�����d��]";
		mes "OdesKoUor�@Ko";
		mes "NuffSharUden�@";
		mes "Ko�@CyaVenah�@An";
		next;
		mes "[��ꂽ�悤�Ɍ�����d��]";
		mes "NudNuffser";
		mes "An�@KoRivehAdor";
		mes "Mu�@LarseorAnu";
		mes "O�@DorNe";
		close;
	}
	mes "[��ꂽ�悤�Ɍ�����d��]";
	mes "������ƁA����ȏ�";
	mes "�߂Â��Ȃ��ł����!?";
	next;
	mes "[��ꂽ�悤�Ɍ�����d��]";
	mes "���Ȃ��̓����̂�����";
	mes "�����Y�L�Y�L�ɂނ̂�I";
	close;
}

splendide,180,223,3	script	�{���d��	440,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�J�����A]";
		mes "AlahCyamah�@U�@MeKoser";
		mes "Ir�@TimaurRiveh�@Di";
		mes "LarsRasTi�@Di�@AgolKones";
		mes "Or�@AlahUdenAndu";
		mes "Ee�@FusRe";
		close;
	}
	mes "[�J�����A]";
	mes "������Ƃǂ���������!?";
	mes "�傫�ȔL�݂����Ȃ̂�";
	mes "�����Ȃ莄�̉H��";
	mes "�͂����Ă����񂾂���!!";
	next;
	mes "[�J�����A]";
	mes "��΂ɂ��̊X��";
	mes "����Ă��Ȃ��񂾂���!!";
	close;
}

splendide,125,227,3	script	�d��	444,{
	if(!equippeditem(2782) || YGG_1QUE < 100) {
		mes "[�v�����A]";
		mes "AnuFuloUor�@Ko";
		mes "CyaWosnes";
		mes "Ha�@WosAnuAsh";
		mes "O�@WosDuAno�@O";
		mes "FuloAndueo�@Ie";
		next;
		mes "[�v�����A]";
		mes "WosGothLars�@Ee";
		mes "Tinarmaur�@Or";
		mes "AlahnahVa�@Or";
		mes "narAnuFulo�@";
		mes "So�@KoCya";
		close;
	}
	mes "[�v�����A]";
	mes "�����A�ʔ����i�D�����Ă܂��ˁB";
	mes "�����A�ʂɕςȈӖ���";
	mes "�����Ă���󂶂�Ȃ��ł��B";
	mes "�����A�������āB";
	next;
	mes "[�v�����A]";
	mes "�ŋ߁A���Ȃ��̂悤�Ȏ푰��";
	mes "�傫�ȔL�̂悤�Ȏ푰��";
	mes "�悭�������܂��B";
	close;
}