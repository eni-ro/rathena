//= Athena Script ==============================================================
// Ragnarok Online Kiel Hyre Quest Script     by Blaze
//= Registry ===================================================================
// KH_QUE -> 0�`56
//==============================================================================

//============================================================
// �z�BNPC
//------------------------------------------------------------
yuno_in01,35,179,4	script	��l	46,3,3,{
	switch(KH_QUE) {
	case 0:
		mes "[�o���h]";
		mes "�c�c�c�c";
		next;
		mes "[�o���h]";
		mes "���c�c";
		break;
	case 1:
		set .@str$,"���������Ă���̂ł����H";
		mes "[�o���h]";
		break;
	case 2:
	case 3:
 		mes "[�o���h]";
		mes "���Ԃɒx��Ȃ��悤�ɂ��Ă��������B";
		mes "�u^FF0000�L���E�n�C���w�@^000000�v��";
		mes "�u^FF0000���R���E���C���w�l^000000�v�͋C����A";
		mes "�����ł��x���Ƒ�ςȎ��ɂȂ�܂��B";
		close;
	case 4:
		if(KH_QUE_SUB&0x1 == 0) {
			mes "[�o���h]";
			mes "�z�B�����l�ł����B";
			mes "�{���ɏ�����܂����B";
			mes "��낵����΁A���Ȃ��ł���";
			mes "�萔���Ǝv���Ď󂯎���Ă��������B";
			next;
			menu "�ł���Η����p���C�����c�c",-;
			mes "[�o���h]";
			mes "����A������̂ق��������ł����H";
			mes "�킩��܂����B";
			mes "���X���҂����������B";
			next;
			mes "���������c�c";
			mes "���������c�c";
			mes "�c�c";
			next;
			mes "[�o���h]";
			mes "�͂��A�ǂ����B";
			mes "�������󂯎���Ă��������B";
			mes "���̊��ӂ̋C�����ł��B";
			mes "�ǂ������肪�Ƃ��������܂����B";
			getitem 7487,1;
			set Zeny,Zeny+1000;
			set KH_QUE_SUB,KH_QUE_SUB|0x01;
			close;
		}
	default:
		mes "[�o���h]";
		mes "�ȑO�͖{���ɏ�����܂����B";
		mes "�܂��A�@������";
		mes "��낵�����肢���܂��B";
		close;
	}
	mes "��������Ⴂ�܂��B";
	mes "���ɂ��܂����H";
	next;
	switch(select("�r�[��","�J�N�e��","�Ē�",.@str$,"���͂܂��c�c")) {
	case 1:
		mes "[�o���h]";
		mes "�r�[���ł��ˁB";
		mes "���X���҂����������B";
		next;
		mes "-�c�c�c�c�c�c-";
		next;
		mes "[�o���h]";
		mes "���҂������܂����B";
		mes "����͓����A";
		mes "�u�V���o���c�s�I�v�Ƃ����܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�V���o���c�s�I�c�c";
		mes "-�N�₩�ŔZ�����F��";
		mes "�K���X�̃R�b�v�̒��ł���߂��Ă���-";
		next;
		percentheal 0,-5;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ւ��c�c�c�c";
		mes "���������B";
		next;
		mes "[�o���h]";
		mes "�n�n�B";
		mes "�C�ɓ���ꂽ�悤�ł��ˁB";
		close;
	case 2:
		mes "[�o���h]";
		mes "�c�c";
		mes "���q�l�A�\���󂠂�܂���B";
		mes "�������܍݌ɂ������c�c";
		mes "�߂�������";
		mes "�������Ă����܂��B";
		close;
	case 3:
		mes "[�o���h]";
		mes "�c�c�H";
		mes "�u�Ē��v�ł����c�c";
		mes "���q�l�A�\���󂠂�܂���B";
		mes "���������������͈����Ă���܂���B";
		close;
	case 4:
		break;
	case 5:
		mes "[�o���h]";
		mes "�킩��܂����B";
		mes "���܂莟�您�Ăт��������B";
		close;
	}
	mes "[�o���h]";
	mes "���c�c����́c�c";
	mes "�ǂ����Ƃ茾�𕷂��ꂽ�悤�ł��ˁB";
	mes "�c�c���͔z�B�E�����P�K�����܂��āA";
	mes "���ׂ��鏤�i�Əo�ׂ��鏤�i��";
	mes "���܂��Ă��Ă��܂��c�c";
	next;
	mes "[�o���h]";
	mes "���ׂ̕��͎���悪";
	mes "���Ƃ����Ă������邻���ł����c�c";
	mes "���͏o�ׂ̕��Ȃ̂ł��B";
	mes "�u�L���E�n�C���w�@�v��";
	mes "�z�B���Ȃ���΂Ȃ�Ȃ��i�����c�c";
	next;
	mes "[�o���h]";
	mes "���[��c�c";
	next;
	if(select("��ςł���","��������`�����܂��傤���H")==1) {
		mes "[�o���h]";
		mes "�����A�����Ȃ�ł��c�c";
		mes "���A�\���󂠂�܂���B";
		mes "���ʘb�������܂����ˁB";
		close;
	}
	mes "[�o���h]";
	mes "���H";
	mes "����͏�����܂����c�c";
	mes "�������Ȃ��ƂȂ̂ł��B";
	mes "��낵���̂ł��傤���H";
	next;
	if(select("�ܘ_�ł�","�����l���Ă݂܂�")==2) {
		mes "[�o���h]";
		mes "�c�c�c�c";
		mes "�킩��܂����c�c";
		close;
	}
	mes "[�o���h]";
	mes "�{���ł����H";
	mes "���肪�Ƃ��������܂��B";
	next;
	mes "[�o���h]";
	mes "�ł́A�z�B����i����";
	mes "���l�̖��O�����������܂��B";
	next;
	mes "[�o���h]";
	mes "�z�B����i���́u^0000FF�����p���C��^000000�v";
	mes "�����āA���l��";
	mes "�u�L���E�n�C���w�@�v��";
	mes "�u^FF0000���R���E���C���w�l^000000�v�ł��B";
	next;
	mes "[�o���h]";
	mes "����ł́A";
	mes "��낵�����肢�������܂��B";
	getitem 7487,1;
	set KH_QUE,2;
	close;
OnTouch:
	if(KH_QUE == 0 && BaseLevel >= 70) {
		mes "[�o���h]";
		mes "����܂����ˁc�c";
		mes "����͂ǂ�����΁c�c";
		set KH_QUE,1;
		close;
	}
	end;
}

yuno,217,114,6	script	�����q��	96,{
	if(KH_QUE < 4) {
		mes "[�X�Y]";
		mes "�g�[�X�g�������ł��ォ�`";
		mes "���������̂ق����ق��ł����`";
		close;
	}
	if(KH_QUE == 4 && KH_QUE_SUB&0x2 == 0) {
		mes "[�X�Y]";
		mes "��������Ⴂ�܂ā`";
		mes "�g�[�X�g�͂������ł��ォ�H";
		next;
		if(select("�G���[�̗��݂ł��܂���","������")==2) {
			mes "[�X�Y]";
			mes "�܂����Ăˁ`";
			close;
		}
		mes "[�X�Y]";
		mes "��`�H";
		mes "^FF0000�G���[^000000�o���܂́H";
		next;
		mes "[�X�Y]";
		mes "���`�A��̂킩��܂�B";
		mes "�܁`�����K�̍ޗ��𗎂Ƃ�����ł���H";
		mes "�z���g�A^FF0000�G���[^000000�o���܂�";
		mes "�������傱���傢�łˁB";
		next;
		mes "[�X�Y]";
		mes "�킩��܂����I";
		mes "^FF0000�G���[^000000�o���܂̂��߂�";
		mes "������x�ޗ��������܂�B";
		next;
		mes "[�X�Y]";
		mes "�c�c���ƌ��������̂ł��c�c";
		mes "���傤�Ǎޗ����؂�Ă܂����B";
		mes "�悩�����烊�q�^���[���̐��ď��܂�";
		mes "�ޗ������ɍs���Ă��炦�܂��ォ�H";
		next;
		mes "[�X�Y]";
		mes "�W���m�[�̃g�[�X�g�V���b�v�ƌ�����";
		mes "�������Ƃ��܂������炦���͂��łB";
		set KH_QUE_SUB,KH_QUE_SUB|0x2;
		close;
	}
	if(KH_QUE == 4 && KH_QUE_SUB&0x4 == 0) {
		mes "[�X�Y]";
		mes "���q�^���[���̐��ď��ŏ�������";
		mes "���܂����󂯎���Ă��Ă��������B";
		mes "�W���m�[�̃g�[�X�g�V���b�v����";
		mes "�����ƌ����΂킩���Ǝv���܂���B";
		close;
	}
	if(KH_QUE == 4 && KH_QUE_SUB&0x8 == 0) {
		mes "[�X�Y]";
		mes "����ꂳ�܂ł����B";
		mes "���ꂪ���Ȃ��̏������Ƃ��܂��łB";
		mes "^FF0000�G���[^000000�o���܂�";
		mes "����΂���Č����Ă����Ă������Ⴂ�B";
		delitem 7488,1;
		getitem 7488,1;
		set KH_QUE_SUB,KH_QUE_SUB|0x8;
		close;
	}
	mes "[�X�Y]";
	mes "�Ă����Ăق����ق���";
	mes "�g�[�X�g�͂������ł��ォ�`�H";
	close;
}

lighthalzen,366,301,4	script	���ď��̎�l	46,{
	if(KH_QUE < 4 || (KH_QUE == 4 && KH_QUE_SUB&0x2 == 0)) {
		mes "[�~���X]";
		mes "�����H";
		mes "���͖Z���������ɂ��Ă���B";
		close;
	}
	if(KH_QUE == 4 && KH_QUE_SUB&0x6 == 0x2) {
		mes "[�~���X]";
		mes "�����H";
		mes "���͖Z���������ɂ��Ă���B";
		next;
		if(select("�W���m�[�̃g�[�X�g�V���b�v����c�c","�c�c�c�c")==2) {
			mes "[�~���X]";
			mes "�c�c�Ȃ񂾁A�܂������̂��B";
			mes "�ǂ����s���Ă���Ȃ����B";
			close;
		}
		mes "[�~���X]";
		mes "�����c�c";
		mes "�����т����̂Ƃ��̂���B";
		mes "������Ƒ҂��ĂĂ���B";
		next;
		mes "[�~���X]";
		mes "�������c�c";
		mes "������ǂ��ɒu���₪�����c�c";
		mes "���̂�낣�A���������˂��Łc�c";
		next;
		mes "[�~���X]";
		mes "�����A�������������B";
		mes "�킩���Ă邾�낤���A";
		mes "���܂��͊���₷������C�������B";
		getitem 7488,1;
		set KH_QUE_SUB,KH_QUE_SUB|0x4;
		close;
	}
	mes "[�~���X]";
	mes "�������A�Z�����c�c";
	mes "�������������Ă΂��肾�B";
	mes "���܂ɂ͗V�тɍs���Ă��B";
	close;
}

lighthalzen,366,289,2	script	���ď��̏���	84,{
	if(KH_QUE < 4 || (KH_QUE == 4 && KH_QUE_SUB&0x2 == 0)) {
		mes "[�N�X]";
		mes "�`�b�c�c";
		mes "�債�ĖZ�������Ȃ�������";
		mes "�Z�����ӂ�����₪���āc�c";
		mes "�ԂԂc�c";
		close;
	}
	if(KH_QUE == 4 && KH_QUE_SUB&0x6 == 0x2) {
		mes "[�N�X]";
		mes "��b!?";
		mes "���A�V��ł˂���I";
		mes "�ق猩��I�@�����Ă邾��I";
		mes "�������c�c�ԂԂc�c";
		close;
	}
	mes "[�N�X]";
	mes "���`";
	mes "�W���m�[�̃g�[�X�g�V���b�v�ˁB";
	mes "�m���Ă�m���Ă�B";
	mes "�������̏��̎q�A������Ȃ��B";
	mes "�c�c�E�w�w�c�c�c�c";
	close;
}

//============================================================
// �L���E�n�C���w�@NPC1
//------------------------------------------------------------
yuno_fild08,196,196,5	script	����	102,{
	mes "[����]";
	mes "���[���A�����u^0000FF�L���E�n�C���w�@^000000�v��";
	mes "���w�������̂ɂȁ[";
	mes "�ǂ����Ă��ꂳ���";
	mes "�����ǎ��ɂ��Ă���Ȃ������́c�c";
	next;
	menu "�L���E�n�C���w�@�H",-;
	mes "[����]";
	mes "��H�@���̌����̂��Ƃ�B";
	mes "�ǎ����������w�ł���w�@�B";
	next;
	mes "[����]";
	mes "�w�@�����Ă��l��";
	mes "�u^FF0000�L���E�n�C��^000000�v�Ƃ����āA";
	mes "�ςȋ@�B��������������";
	mes "��ׂ������񂾂��āB";
	next;
	mes "[����]";
	mes "����Łc�c���[���ƁA�Љ���H";
	mes "�ǎ������̂��߂ɂ��̊w�@��";
	mes "���Ă��񂾂��Ă��B";
	next;
	mes "[����]";
	mes "���̊w�@�𑲋Ƃ����";
	mes "�ǂ���ƂɏA�E�ł�����Č������ǁc�c";
	mes "���[���A�����w�@�ɓ��w�����[���B";
	close;
}

yuno_fild08,158,194,6	script	�K�[�h�}��#kh	852,{
	if(KH_QUE > 15) {
		mes "[�K�[�h�}��]";
		mes "��ʐl�͗�������֎~�ł��B";
		mes "�p���A�܂��͖񑩂���������";
		mes "�w�@���ւ̗�������͋��ł��܂���B";
		close;
	}
	if(KH_QUE > 2) {
		mes "[�K�[�h�}��]";
		mes "�܂��p����";
		mes "�I����Ă��Ȃ��̂ł����H";
		close2;
		warp "kh_school",71,155;
		end;
	}
	mes "[�K�[�h�}��]";
	mes "�����́u^0000FF�L���E�n�C���w�@^000000�v�B";
	mes "��ʐl�͗�������֎~�ł��B";
	mes "�p���A�܂��͖񑩂���������";
	mes "�w�@���ւ̗�������͋�����܂���B";
	if(KH_QUE < 2)
		close;
	next;
	if(select("�z�B�ɂ��܂���","�c�c�c�c")==2) {
		mes "[�K�[�h�}��]";
		mes "�p���������Ȃ�";
		mes "�w�@���痣��Ă��������B";
		close;
	}
	mes "[�K�[�h�}��]";
	mes "�z�B�ł����H";
	mes "�܂��͎��l�̖��O�B";
	mes "���ɔz�B�i������";
	mes "����������Ă��������B";
	next;
	input .@str$;
	if(substr2(.@str$,0,6) != "���R��") {
		mes "[�K�[�h�}��]";
		mes .@str$;
		mes "�Ƃ������́A���w�@�ɂ�����";
		mes "���l�ɓo�^����Ă��܂���B";
		mes "�z�B����Ԉ���Ă��܂��񂩁H";
		close;
	}
	input .@str$;
	mes "[�K�[�h�}��]";
	mes "^0000FF" +.@str$+ "^000000��";
	mes "^FF0000���R���E���C���w�l^000000�ɂł����H";
	mes "�m�F����̂ł��΂炭���҂����������B";
	next;
	mes "-�K�[�h�}���͌�ɂ���";
	mes "�����𑀍삵�Ă���-";
	next;
	mes "[�K�[�h�}��]";
	mes "�͂��B����ł��B";
	mes "^FF0000���R���E���C���w�l^000000�ւ̔z�B�ł��B";
	mes "�m�F�����肢���܂��B";
	mes "�z�B�i��";
	mes "^0000FF" +.@str$+ "^000000�ł��B";
	next;
	mes "[�K�[�h�}��]";
	mes "�c�c�͂��c�c�͂��c�c";
	mes "�c�c�͂��B�킩��܂����B";
	next;
	if(.@str$ != "�����p���C��") {
		mes "[�K�[�h�}��]";
		mes "�m�F�������A^FF0000���R���E���C���w�l^000000��";
		mes "���̂悤�ȕi����";
		mes "�����������Ƃ��Ȃ��Ƃ̂��Ƃł��B";
		next;
		mes "[�K�[�h�}��]";
		mes "���l�A�i����";
		mes "�悭�m�F���Ă݂Ă��������B";
		close;
	}
	mes "[�K�[�h�}��]";
	mes "�m�F�����Ă��炢�܂�";
	mes "�u^FF0000���R���E���C���w�l^000000�v���Ă�";
	mes "�u^0000FF�����p���C��^000000�v�B";
	mes "�ԈႢ����܂���ˁH";
	next;
	menu "�͂�",-;
	mes "[�K�[�h�}��]";
	mes "�m�F�ł��܂����B";
	mes "���ڎ󂯎�邻���Ȃ̂�";
	mes "�w�@���ւ̗�������������܂��B";
	close2;
	warp "kh_school",71,155;
	end;
}
yuno_fild08,158,185,0	duplicate(�K�[�h�}��#kh)	�K�[�h�}��	852

kh_school,57,142,6	script	�w��	893,3,3,{
	mes "[���V]";
	mes "��H�c�c�N�H";
	mes "�w�@���͗�������֎~����";
	mes "�m��Ȃ��́H";
	close;
OnTouch:
	mes "[���V]";
	mes "�˂��˂��B";
	mes "���̂��킳�������H";
	next;
	mes "[�N�B�l�V��]";
	mes "����H";
	mes "���̂��킳�H";
	next;
	mes "[���V]";
	mes "���������B";
	mes "�H�삪����ꂽ�񂾂��ā`";
	mes "�H���H��c�c";
	next;
	mes "[�N�B�l�V��]";
	mes "���c�c�H��c�c�H";
	mes "�c�c�܂������c�c";
	next;
	mes "[���V]";
	mes "�{���̎��炵����B";
	mes "�ׂ̃N���X�́u�A�V�v���Ďq�B";
	mes "�m���Ă�H";
	mes "���̎q�A�ŋߌ��Ȃ�����Ȃ��B";
	mes "�ǂ����H������āc�c";
	next;
	mes "[�N�B�l�V��]";
	mes "����{���Ȃ́H";
	mes "���`���c�c";
	mes "�˂��A����Șb������߂�H";
	close;
}

kh_school,57,139,0	script	�w��	893,{
	emotion 19;
	mes "[�N�B�l�V��]";
	mes "����c�c";
	mes "����c�c�������c�c";
	mes "���������c�c";
	mes "���񂤂�c�c";
	close;
}

kh_school,176,60,4	script	�w�l	101,{
	if(KH_QUE != 2) {
		mes "[���R���E���C��]";
		mes "�p�����I�����̂ł�����";
		mes "�͂₭���A�肭�������B";
		mes "�܂������A�ŋ߂̐l�́c�c";
		close;
	}
	mes "[���R���E���C��]";
	mes "������p�ł����H";
	next;
	if(select("�z�B�ɗ��܂���","���ł��Ȃ��ł�")==2) {
		mes "[���R���E���C��]";
		mes "�����͕��O��";
		mes "��������֎~�Ȃ̂ł�����A";
		mes "�ނ�݂ɕ������Ȃ��ł��������B";
		close;
	}
	mes "[���R���E���C��]";
	mes "�����A�����ł����ˁB";
	mes "�\�z�ȏ�̒x��ł��B";
	mes "������͂����Ɩ񑩂̎��Ԃ�";
	mes "�͂���悤�ɂ��Ă��������B";
	mes "�܂��x���悤�ł�����";
	mes "������ς������Ă��炢�܂��B";
	next;
	mes "[���R���E���C��]";
	mes "����Ɂc�c";
	mes "[????]";
	mes "�ӂ��H�@�c�c�ӂ���!?";
	next;
	mes "-�K�`���@�ǂĂ�I-";
	mes "[????]";
	mes "�����c�c�������������`";
	next;
	mes "�c�c�c�c�c�c";
	mes "�c�c�c�c";
	mes "�c�c";
	next;
	mes "[���R���E���C��]";
	mes "�ӂ��c�c�u^FF0000�G���[^000000�v�B";
	mes "�܂�����Ȃ��Ƃ��c�c";
	mes "��̂��܂ŗV��ł���̂ł����H";
	mes "�����̗[���܂ŃN�b�L�[���ł��Ȃ���";
	mes "���w���͗��N�ł���B";
	mes "�킩���Ă���̂ł����H";
	next;
	mes "[�G���[]";
	mes "�ӁA�ӂ�������!?";
	mes "���c�c���ꂾ���́c�c";
	next;
	mes "[���R���E���C��]";
	mes "�u^FF0000�G���[^000000�v!!";
	next;
	mes "[�G���[]";
	mes "�ӂ��I";
	mes "��c�c�킩��܂����I";
	mes "�搶�I";
	next;
	mes "[���R���E���C��]";
	mes "��낵���B";
	mes "�c�c�c�c���āB";
	mes "�ו��͎󂯎�����̂�";
	mes "���Ȃ��͂�����肭�������B";
	mes "�w�@���ɒ�������Ă͍���܂��B";
	delitem 7487,1;
	set KH_QUE,3;
	close;
}

kh_school,179,39,0	script	�����w��	895,{
	cutin "kh_elly01",2;
	switch(KH_QUE) {
	default:
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "�ӂ�!?�@�ӂ���b�I";
		mes "�c�c�b�z�c�c";
		mes "�܁[�����Ƃ��Ƃ����������`";
		mes "���ԂȂ����ԂȂ��B";
		break;
	case 3:
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "���[�A���[�c�c";
		mes "�ǂ�����A�ǂ����患�`";
		mes "�ӂ����c�c";
		next;
		if(select("�ǂ������́H","�c�c�c�c")==2) {
			mes "[�G���[]";
			mes "�ӂ��������c�c";
			break;
		}
		mes "[�G���[]";
		mes "�ӂ��H";
		mes "���c�c���ꂪ�c�c";
		mes "�N�b�L�[�����Ȃ��Ƃ����Ȃ��̂ɁA";
		mes "�ޗ��𗎂Ƃ�������āc�c";
		mes "�Ӂc�c�ӂ��c�c";
		mes "�����̗[���܂łȂ̂Ɂ`";
		next;
		if(select("������`�������H","����́c�c�˂��c�c")==2) {
			mes "[�G���[]";
			mes "�ӂ����c�c";
			mes "�ǁA�ǂ����悤�c�c";
			mes "�ӂ��c�c";
			mes "���A�������I";
			next;
			menu "????",-;
			mes "[�G���[]";
			mes "���́c�c";
			mes "�z�B������ł���ˁH";
			mes "�悩�������`���Ă��������I";
			mes "�ˁH�@���肢�I";
			mes "���肢���܂��I";
			next;
			mes "-�����͋}�Ɏ��̘r�����";
			mes "���ݎn�߂�-";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���H";
			mes "���c�c����c�c���́c�c";
			mes "�A�n�n�c�c";
			next;
			mes "[�G���[]";
			mes "�ˁH�@�ˁH";
			mes "��`���āI";
			mes "���肢�I";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�A�n�n�[�c�c�c�c";
			next;
			if(select("��`���Ă�����","�f��")==2) {
				mes "[" +strcharinfo(0)+ "]";
				mes "���߂�B";
				mes "�d�����Z�����āc�c";
				next;
				cutin "kh_elly04",2;
				emotion 28;
				mes "[�G���[]";
				mes "�ӂ��H";
				mes "�����Ȃ�ł����c�c";
				mes "���������Ă��߂�Ȃ����B";
				mes "�c�c�c�c�ӂ����c�c";
				mes "�ǂ����悤�c�c�c�c";
				break;
			}
		}
		cutin "kh_elly02",2;
		mes "[�G���[]";
		mes "�ӂ��������`�`�`!?";
		mes "�فc�c�z���g�H";
		mes "�ق�ƂɃz���g!?";
		mes "���A���肪�Ƃ��I";
		mes "���肪�Ƃ��A���肪�Ƃ��A���肪�Ƃ��A";
		mes "���肪�Ƃ��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@����c�c�n�n�c�c";
		next;
		mes "[�G���[]";
		mes "�G�w�b�A�G�w�w�B";
		mes "���肪�ƁI";
		mes "�G�w�w�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�A�A�A�n�n�c�c";
		mes "����Łc�c";
		mes "������`���΂������ȁH";
		next;
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "�ӂ��c�c���ꂪ�c�c";
		mes "���́A�������N�b�L�[�̍ޗ���";
		mes "���Ƃ������������";
		mes "�ޗ����W�߂Ă��Ȃ��Ɓc�c";
		next;
		mes "[�G���[]";
		mes "���������Ă�";
		mes "�Ō�̍ޗ�����������c�c";
		mes "�ӁA�ӂ����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������A���v�I�@���v������I";
		mes "�ق�A�����ƍŌ�܂Řb���āB";
		mes "�N�b�L�[�̍ޗ����W�߂Ă���΂����́H";
		next;
		mes "[�G���[]";
		mes "����c�c";
		mes "�c�c�ł��c�c";
		mes "�����Ȃ肱��Ȃ���";
		mes "���肢����Ȃ�āc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�C�ɂ��Ȃ��Ă�������B";
		mes "�����ޗ��������āB";
		mes "�������Ȃ��Ɛ_�o���Ȃ��w�l��";
		mes "���N������ꂿ�Ⴄ��H";
		next;
		cutin "kh_elly01",2;
		mes "[�G���[]";
		mes "�ӂ�!?";
		mes "�́A�͂��I";
		mes "���c�c���Ɓc�c�ޗ��́c�c";
		mes "^FF0000������1�A���܂�1�A�`�[�Y2�A";
		mes "�����p���C��1�A�~���N7�A�J�J�I5^000000";
		mes "���ꂾ���K�v�ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c��c�c";
		mes "������Ƒ����ˁc�c";
		next;
		cutin "kh_elly04",2;
		mes "[�G���[]";
		mes "�ӂ����c�c";
		mes "���A���߂�Ȃ����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c����A���v����B";
		mes "����ɂ��Ă��c�c";
		mes "�������������邯�ǁA";
		mes "���̍ޗ��͂ǂ��Ŏ�ɓ���́H";
		next;
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "�u^0000FF������^000000�v�Ɓu^0000FF���܂�^000000�v��";
		mes "^009C00�W���m�[^000000�ɂ���u^0000FF�g�[�X�g�V���b�v^000000�v��";
		mes "���肢����΂����͂��ł��B";
		mes "�u^0000FF�����p���C��^000000�v�͓���^009C00�W���m�[^000000��";
		mes "�u^FF0000��X^000000�v�ɒu���Ă���܂��B";
		next;
		mes "[�G���[]";
		mes "�u^0000FF�J�J�I^000000�v�́u^FF0000���[���[^000000�v�Ƃ���";
		mes "���������ɓ���炵���ł��B";
		next;
		mes "[�G���[]";
		mes "���߂�Ȃ����B";
		mes "��R�����đ�ς��Ǝv�����ǁc�c";
		mes "��낵�����肢���܂��I";
		set KH_QUE,4;
		break;
	case 4:
		if(KH_QUE_SUB < 0xF || countitem(548) < 2 || countitem(519) < 7 || countitem(7182) < 5) {
			mes "[�G���[]";
			mes "�u^0000FF������^000000�v�Ɓu^0000FF���܂�^000000�v��";
			mes "^009C00�W���m�[^000000�ɂ���u^0000FF�g�[�X�g�V���b�v^000000�v��";
			mes "���肢����΂����͂��ł��B";
			mes "�u^0000FF�����p���C��^000000�v�͓���^009C00�W���m�[^000000��";
			mes "�u^FF0000��X^000000�v�ɒu���Ă���܂��B";
			next;
			mes "[�G���[]";
			mes "�u^0000FF�J�J�I^000000�v�́u^FF0000���[���[^000000�v�Ƃ���";
			mes "���������ɓ���炵���ł��B";
			mes "��R�����đ�ς��Ǝv�����ǁc�c";
			mes "��낵�����肢���܂��I";
			break;
		}
		cutin "kh_elly02",2;
		mes "[�G���[]";
		mes "�ӂ�!?";
		mes "�����W�܂�����!?";
		mes "�G�w�w�c�c";
		mes "�{���ɂ��肪�ƁI";
		mes "�G�w�w�b�B";
		next;
		emotion 2;
		mes "[�G���[]";
		mes "�G�w�w�c�c";
		mes "�ӂ��I";
		mes "���A�������I�@�������Ȃ��ƁI";
		mes "����A������Ƒ҂��ĂĂˁB";
		mes "�ӂ������c�c";
		delitem 7488,1;
		delitem 548,2;
		delitem 7487,1;
		delitem 519,7;
		delitem 7182,5;
		set KH_QUE,5;
		set KH_QUE_SUB,0;
		break;
	case 5:
		mes "[�G���[]";
		mes "����񂶂Ⴖ��`��B";
		mes "�G���[�����N�b�L�[�̊����`";
		mes "�G�b�w�b�w�`";
		next;
		mes "[�G���[]";
		mes "���肪�Ƃ��B";
		mes "�������ŏ�������������B";
		mes "�G�w�w�b�c�c";
		mes "�{���ɂ��肪�Ɓc�c";
		next;
		mes "[�G���[]";
		mes "�ӂ�!?";
		mes "���������Ζ��O�I";
		mes "���O�����̖Y��Ă��I";
		mes "���̓G�����V���B";
		mes "^FF0000�G���[^000000���j�b�N�l�[���Ȃ́B";
		mes "��낵���ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����^0000FF" +strcharinfo(0)+ "^000000�B";
		mes "��낵���B";
		next;
		cutin "kh_elly02",2;
		mes "[�G���[]";
		mes "�G�w�w�b�c�c";
		mes strcharinfo(0)+ " ���񂾂ˁB";
		mes "�悩������R���A������āB";
		mes "���ӂ̋C��������B";
		getitem 538,5;
		set KH_QUE,6;
		break;
	case 6:
		mes "[�G���[]";
		mes "�ӂ��c�c���c�c";
		mes "�c�c���߂�Ȃ����I";
		mes "�܂����肢���ł���������B";
		mes "�c�c�����c�c���Ȃ��H";
		next;
		if(select("���肢�H","���߂�B���͖Z�����āc�c")==2) {
			cutin "kh_elly03",2;
			mes "[�G���[]";
			mes "�ӂ�!?";
			mes "�c�c�ӂ����c�c";
			mes "���ꂶ��d���Ȃ���ˁc�c";
			mes "�ӂ����c�c�c�c";
			break;
		}
		mes "[�G���[]";
		mes "����c�c���́c�c";
		mes "���ɂ͂Ƃ��Ă���D����";
		mes "���ꂿ��񂪂���́B";
		mes "�Ƃ��Ă��c�c�Ƃ��Ă���؂Ȑl�B";
		next;
		mes "[�G���[]";
		mes strcharinfo(0)+ "����";
		mes "��`���Ă��ꂽ�������ŁA";
		mes "���߂ăN�b�L�[�����ɏĂ����́I";
		mes "�������N�b�L�[��";
		mes "���s��������Ă�����c�c";
		mes "�G�w�w�b�c�c";
		next;
		mes "[�G���[]";
		mes "������c�c������c�c";
		mes "���ꂿ���ɂ��̃N�b�L�[��";
		mes "�H�ׂĂ��炢�����́I";
		mes "���ꂿ���A������";
		mes "��������ԂƎv���́I";
		next;
		mes "[�G���[]";
		mes "�ł���Ύ���";
		mes "���ړn�������񂾂��ǁA";
		mes "�w�@���o��̂͋�����ĂȂ�����c�c";
		mes "�N�b�L�[���Ă����Ă���Ȃ���";
		mes "�����������Ⴄ�Ǝv�����c�c";
		next;
		mes "[�G���[]";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�ӂ����c�c�c�c";
		next;
		if(select("�킩�����A�n���Ă����","���͂�����ƖZ������")==2) {
			cutin "kh_elly03",2;
			mes "[�G���[]";
			mes "�ӂ����c�c";
			mes "���ꂶ��d���Ȃ���ˁc�c";
			break;
		}
		cutin "kh_elly02",2;
		mes "[�G���[]";
		mes "�ӂ��I�@���A���肪�Ƃ��I";
		mes "�{���ɂ��肪�ƁI";
		mes strcharinfo(0)+ "����͗D�����ˁB";
		mes "�G�w�b�c�c";
		mes "�G�w�w�b�c�c";
		next;
		mes "[�G���[]";
		mes "���ꂿ���́u^0000FF�L���E�n�C���̕ʑ�^000000�v��";
		mes "�Z��ł���́B";
		mes "�G���[����̑��蕨���Č�����";
		mes "����Ă����͂�����B";
		set KH_QUE,7;
		break;
	case 7:
		mes "[�G���[]";
		mes "�u^FF0000�L���E�n�C���̕ʑ�^000000�v��";
		mes "�u^FF0000���̊w�@�̖k^000000�v�ɂ����B";
		break;
	case 8:
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "�ӂ��H";
		mes "���ꂿ��񂪏o�����H";
		mes "�c�c�c�c";
		next;
		mes "[�G���[]";
		mes "�����������Ȃ��c�c";
		mes "�o���Ȃ�ĕ����ĂȂ��̂Ɂc�c";
		mes "�����͕ʑ��ɂ���͂��Ȃ񂾂��ǂȂ��B";
		next;
		cutin "kh_elly04",2;
		mes "[�G���[]";
		mes "���́c�c";
		mes "������x�s���Ă��炦�Ȃ����ȁH";
		mes "���x�͂��̌����g���āB";
		mes "���̌����g���Εʑ��̒���";
		mes "������B";
		getitem 7489,1;
		set KH_QUE,9;
		break;
	case 9:
	case 10:
		mes "[�G���[]";
		mes "�ς��Ȃ��c�c";
		mes "�����Ƃ������";
		mes "�����Ă��̂Ɂc�c";
		mes "�ӁA�ӂ����c�c�c�c";
		break;
	case 11:
		mes "[�G���[]";
		mes "���H";
		mes "����́c�c";
		mes "�c�c�c�c";
		next;
		mes "-�G���[�͕������J����";
		mes "���̎莆��ǂݎn�߂�-";
		next;
		mes "-�G���[��-";
		mes "���q�Ƙb�����Ƃ�����̂ŁA";
		mes "�{�Ƃɂ���L�G���ɉ�ɍs���B";
		mes "�������̎莆���c����������";
		mes "��T�Ԉȏ�A��������������A";
		mes "���O�̂��߂Ɏc���Ă�����";
		mes "���������Ċw�@���o�Ȃ����B";
		next;
		mes "����͕ʑ��̏��ւɉB���Ă������B";
		mes "���O�ɐM���ł���F�l������Ȃ�A";
		mes "���̐l�ɗ���ŁA�ʑ��Ɏc����";
		mes "�������̃��b�Z�[�W��H����";
		mes "�ו���T���Ă��炤�Ƃ����B";
		next;
		mes "�����������";
		mes "��Ȃ��ڂɂ��������m��Ȃ��c�c";
		mes "�������A���O���M���Ă���";
		mes "�F�l�Ȃ���v����";
		mes "�����M����Ƃ��悤�c�c";
		next;
		mes "�����A�w�@�̊w����֌W�҂͂��߂��B";
		mes "�ނ�̓L�G���Ɗ֌W�����邩�������B";
		mes "�K���w�@�Ɗւ��̖����҂ɂ���";
		mes "���̎莆�̎��͘b���Ă͂Ȃ�Ȃ��B";
		mes "�킩��ȁA�G���[�B";
		mes "�ł́A�C��t���čs�����Ȃ����B";
		next;
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "���ꂿ���c�c";
		mes "�O�ɂ�����������";
		mes "����10�����o���Ă����c�c";
		mes "�c�c���ꂿ���A�����������́H";
		mes "���c�c�ǂ�����΁c�c�c�c";
		mes "�Ӂc�c�ӂ��c�c�c�c";
		delitem 7490,1;
		set KH_QUE,12;
		break;
	case 12:
		cutin "kh_elly03",2;
		mes "[�G���[]";
		mes "�ӂ����c�c�c�c";
		next;
		switch(select("���ꂳ��ɂ��ĕ����Ă݂�","���q�Ƃ����L�G���ɂ��ĕ����Ă݂�","�w�@�ɂ��ĕ����Ă݂�")) {
		case 1:
			mes "[" +strcharinfo(0)+ "]";
			mes "�G���[�̂��ꂳ����āA";
			mes "�ǂ�Ȑl�Ȃ́H";
			mes "�������G�Ȏ��";
			mes "����݂��������ǁc�c";
			next;
			mes "[�G���[]";
			mes "�c�c�c�c";
			mes "���̂��ꂿ���̓L���E�n�C���B";
			mes "���c�̉�ł���";
			mes "�u^FF0000�L���E�n�C��^000000�v��B";
			next;
			mes "[�G���[]";
			mes "�ł��A�ǎ�����������";
			mes "������������厖�ɂ��Ă��ꂽ";
			mes "�e�̂悤�Ȑl�c�c";
			mes "���������Ɍ����邯��";
			mes "�N�����g�����āc�c�D�����l�c�c";
			next;
			mes "[�G���[]";
			mes "����Ȃ̂Ɂc�c";
			mes "�c�c���ꂿ���c�c";
			mes "�����Ȃ́c�c�H";
			break;
		case 2:
			mes "[" +strcharinfo(0)+ "]";
			mes "�莆�ɏ����Ă���";
			mes "���ꂳ��̑��q����A";
			mes "�u^0000FF�L�G��^000000�v���Ăǂ�Ȑl�H";
			mes "���ꂳ��ƒ��������݂��������ǁc�c";
			next;
			mes "[�G���[]";
			mes "�u^0000FF�L�G��^000000�v����̎���";
			mes "�����ǂ��m��Ȃ��́B";
			mes "�w�@���ł̍s���̎��A";
			mes "���̂�������x�ł����������ƂȂ��́B";
			next;
			mes "[�G���[]";
			mes "�ł��c�c�炾���͖Y����Ȃ��c�c";
			mes "�₽���┯�Ƃ����������ڂ��B";
			mes "�s���Ďh���肻���Ȏ�����";
			mes "�݂�Ȃ����Ă��c�c";
			next;
			mes "[�G���[]";
			mes "�j�����ǂ��ꂢ�Ȋ�ɔ�������";
			mes "�������Y��Ȑl�B";
			mes "�w�@�̒��ɂ��u^0000FF�L�G��^000000�v����ɓ����";
			mes "�l�͑����݂����B";
			next;
			mes "[�G���[]";
			mes "�ł��A���ꂿ���Ɓu^0000FF�L�G��^000000�v�����";
			mes "�����Ƃ��Ă����������݂����B";
			next;
			mes "[�G���[]";
			mes "���ꂿ���́u^0000FF�L�G��^000000�v�����";
			mes "�b���o��Ƃ����ɓ{���Ă��B";
			mes "�ڂ������͕����Ȃ���������";
			mes "���x�����������Ă�݂����B";
			next;
			mes "[�G���[]";
			mes "�ǂ����Ē��������񂾂�c�c";
			mes "����Ȃ��Y��Ȑl��";
			mes "�D�������ꂿ���Ȃ̂Ɂc�c";
			break;
		case 3:
			mes "[" +strcharinfo(0)+ "]";
			mes "���̊w�@�͈�̂ǂ�ȏ��H";
			mes "�w�@�ɂ��Ă͕ۈ����O��I�B";
			mes "�{�݂��������������肵�Ă�";
			mes "�悤�Ɍ�����񂾂��ǁB";
			next;
			mes "[�G���[]";
			mes "�����́A�L���E�n�C�����c�����Ă�";
			mes "�ǎ������̂��߂̐��w�@�B";
			mes "�u�]����E�Ƃ̐�勳���";
			mes "�󂯂邱�Ƃ��ł���́B";
			next;
			mes "[�G���[]";
			mes "���A���̓J�v���T�[�r�X��";
			mes "�L���E�n�C���{�Ђ̔鏑�E��";
			mes "�u�]���Ă�́B";
			mes "�u^0000FF�G���V�A^000000�v����̂悤��";
			mes "�f�G�ȏ����ɂȂ�̂����I";
			mes "�G�w�w�b�c�c";
			next;
			mes "[�G���[]";
			mes "�ł��c�c�ӂ��c�c";
			mes "�ŋ߁A�w�@�̒���";
			mes "�ςȎ����N���Ă�́B";
			mes "�݂�ȁA��l�ł���̂�";
			mes "�����邮�炢�c�c�c�c";
			next;
			cutin "kh_elly02",2;
			mes "[�G���[]";
			mes "�ł��A���͑��v�I";
			mes "�����ƂȂ�����";
			mes "�u" +strcharinfo(0)+ "�v����";
			mes "�����Ă����͂�������ˁI";
			mes "�G�w�w�b�c�c";
			next;
			if(select("^0000FF�G���V�A^000000����H","�ςȎ��H")==1) {
				mes "[�G���[]";
				mes "���ꂿ���̔鏑�B";
				mes "���������Y��Ȃ񂾂���I";
				break;
			}
			cutin "kh_elly04",2;
			mes "[�G���[]";
			mes "�c�c����͊O���̐l��";
			mes "�b�����Ⴂ���Ȃ�����";
			mes "�����Ă�񂾂��ǁc�c";
			mes "�u" +strcharinfo(0)+ "�v�����";
			mes "���ɂƂ��ē��ʂȐl������";
			mes "�b���Ă�����ˁB";
			next;
			mes "[�G���[]";
			mes "�c�c�ŋ߁A�w�@���ɗH�삪";
			mes "�o��́I";
			mes "�c�c�c�c";
			mes "�c�c�ӂ��c�c�M���ĂȂ��ł���I";
			mes "�{���̎��Ȃ񂾂���ˁI";
			next;
			mes "[�G���[]";
			mes "���̂ˁA�H��͖���";
			mes "�w�@�̒���������Ă�́B";
			mes "���̗H��Əo������������Ō�B";
			mes "�H��̎􂢂̌��t�𕷂����r�[�A";
			mes "�̂��l�`�݂����Ɍł܂����Ⴄ�́I";
			next;
			mes "[�G���[]";
			mes "�w�@���̂��镔���ɔ��܂��Ă���";
			mes "���̗F�B�u�}���v���H��ɏo�����";
			mes "�l�`�݂����ɂ��ꂿ������́c�c";
			mes "��Łu�}���v���㖱���Ɉڂ��ꂽ����";
			mes "�����āA�搶�����Ȃ����Ɉ㖱����";
			mes "�s���Ă݂��́c�c�c�c";
			next;
			mes "[�G���[]";
			mes "�c�c�x�b�h��Ɂu�}���v�͂����c�c";
			mes "�ł��c�c������b�������Ă�";
			mes "�S�R�Ԏ��������āc�c";
			mes "���̔����������c�c";
			mes "�{���Ɂc�c�l�`�݂����������́I";
			next;
			mes "[�G���[]";
			mes "�c�c���̏u�ԁA";
			mes "���͂ƂĂ������Ȃ���";
			mes "�㖱�����瓦���o�����́c�c";
			next;
			mes "[�G���[]";
			mes "�������̗H��ɏo������������A";
			mes "����ȕ��ɂȂ����Ⴄ�́H";
			mes "�u" +strcharinfo(0)+ "�v����̎���";
			mes "�킩��Ȃ��Ȃ����Ⴄ�́H";
			next;
			cutin "kh_elly02",2;
			mes "[�G���[]";
			mes "������c�c����Ȃ��ƂȂ��I";
			mes "���������H��Əo�����";
			mes "���ꂿ����Ă��A";
			mes "�u" +strcharinfo(0)+ "�v����";
			mes "�����Ə����Ă�����ˁI";
			mes "�G�w�w�b�c�c";
			next;
			mes "[�G���[]";
			mes "�����ł܂�������Ă��A";
			mes "�u" +strcharinfo(0)+ "�v����";
			mes "�u^FF0000�G���[�A�N����^000000�v";
			mes "���Č����Ă�����";
			mes "�����Ƃ����ɓ�����悤�ɂȂ��B";
			mes "�G�w�w�b�c�c";
			next;
			mes "[�G���[]";
			mes "�u^FF0000�G���[�A�N����^000000�v����B";
			mes "�������̕ςȎ�����ꂽ��";
			mes "�{���Ă����Ɛl�`�̂܂܂Ȃ񂾂���I";
			mes "�c�c�Ȃ�ĂˁB";
			next;
			mes "[�G���[]";
			mes "�G�w�w�b�c�c";
			mes "���ꂶ��u" +strcharinfo(0)+ "�v�����";
			mes "�������Ⴄ�ł���H";
			set KH_QUE,13;
			break;
		}
		break;
	case 13:
		cutin "kh_elly04",2;
		mes "[�G���[]";
		mes "�ӂ�!?�@��ρI";
		mes "�ۑ�̒�o���ԖY��Ă��I";
		mes "���A�������R���E���C���搶��";
		mes "��ɍs���Ȃ��ƁB";
		next;
		mes "[�G���[]";
		mes "���́c�c�悩������ʑ��ɍs����";
		mes "^FF0000���ꂿ��񂪎c���Ă��ꂽ��^000000��";
		mes "�T���Ă��炦�Ȃ����ȁH";
		mes "�����M������l��";
		mes "�u" +strcharinfo(0)+ "�v����";
		mes "�������Ȃ��́c�c";
		next;
		mes "[���R���E���C��]";
		mes "�c�c���[�I";
		mes "�c�c�c�c�G���[!!";
		mes "�ۑ�̒�o���Ԃł���I";
		mes "���������Ȃ̂��A";
		mes "�킩���Ă���̂ł����I";
		next;
		mes "[�G���[]";
		mes "�ӂ�����!?";
		mes "���߂�ˁI";
		mes "�����s���Ȃ��ƁI";
		next;
		mes "[�G���[]";
		mes "��!?�@���������I";
		mes "�����̗[�����A";
		mes "���̎��̕����ɂ��āB";
		mes "�܂��b���������Ƃ����邩��I";
		next;
		mes "[�G���[]";
		mes "���͊w�@�̌��ɂ���́B";
		mes "���̕����͗��̓쑤��2�K�B";
		mes "���ւ����ԉ��̕����ŁA";
		mes "��q�ŏオ���Ă����́B";
		mes "�߂����瑋�͊J���Ă�������ˁI";
		set KH_QUE,14;
		break;
	case 14:
	case 15:
		mes "[�G���[]";
		mes "�ق�ق�A�����s���āI";
		mes "�搶���{�����Ⴄ��!?";
		break;
	}
	close2;
	cutin "kh_elly01",255;
	end;
}

//============================================================
// �L���E�n�C���̕ʑ�NPC
//------------------------------------------------------------
yuno_fild02,93,210,4	script	�K�[�h�}��	85,{
	mes "[�K�[�h�}��]";
	mes "�����͎��L�n�ł��B";
	mes "�������ɗ�������Ȃ��ł��炢�����B";
	if(KH_QUE != 7)
		close;
	next;
	if(select("^FF0000�L���E�n�C��^000000����ɉ����","�킩��܂���")==2) {
		mes "[�K�[�h�}��]";
		mes "���悤�Ȃ�B";
		close;
	}
	mes "[�K�[�h�}��]";
	mes "�񑩂���Ă��܂����H";
	next;
	if(select("�͂�","������")==2) {
		mes "[�K�[�h�}��]";
		mes "�񑩂��Ȃ���Ή���͂ł��܂���B";
		mes "��������肭�������B";
		close;
	}
	mes "[�K�[�h�}��]";
	mes "�c�c�\���󂠂�܂��񂪁A";
	mes "��l�͏o�����ł��B";
	mes "��������肭�������B";
	set KH_QUE,8;
	close;
}

yuno_fild02,75,218,0	script	��	111,{
	if(KH_QUE >= 10) {
		mes "-�����J���Ă���-";
		next;
		if(select("����","����Ȃ�")==2)
			close;
		warp "kh_vila",188,18;
		end;
	}
	mes "-���ɂ͌����|�����Ă���-";
	if(KH_QUE != 9)
		close;
	next;
	if(select("�G���[�̌����g��","�ق����Ă���")==2) {
		mes "�c�c�c�c";
		close;
	}
	mes "-�����g���Ĕ����J����ƁA";
	mes "���̊Ԃɋ��܂��Ă����̂��c�c";
	mes "�����������ꂽ���؂ꂪ������-";
	mes "-�������A���؂�͏E���Ԃ��Ȃ��A";
	mes "���ɐ�����Ĕ��ł����Ă��܂���-";
	next;
	mes "-��u�̎����������A�m��";
	mes "�u^FF0000�O��6���A����3���A";
	mes "�O��3���A����4��^000000�v";
	mes "�Ə�����Ă���-";
	mes "-���̎����킩��Ȃ����A";
	mes "�o���Ă����������������낤-";
	set KH_QUE,10;
	close2;
	warp "kh_vila",188,18;
	end;
}

yuno_fild02,109,218,0	script	��	111,{
	mes "-���ɂ͌����|�����Ă���-";
	if(KH_QUE != 9)
		close;
	next;
	if(select("�G���[�̌����g��","�ق����Ă���")==2) {
		mes "�c�c�c�c";
		close;
	}
	mes "-�G���[����󂯎����";
	mes "���Ƃ͈Ⴄ�悤��-";
	close;
}

kh_vila,179,11,0	script	#�莆	139,1,1,{
OnTouch:
	if(KH_QUE == 10) {
		mes "-���ɗ����Ă���";
		mes "�u^FF0000�莆^000000�v���E���グ��-";
		getitem 7490,1;
		set KH_QUE,11;
		close;
	}
	mes "-���������悤��-";
	close;
}

kh_vila,184,20,0	script	�{#kiel	111,{
	if(KH_QUE != 14 || rand(5)) {
		mes "-�{������-";
		close;
	}
	mes "-�{�I�������̖{�����o����";
	mes "�K�i���̕ǂ���ʘH������ꂽ-";
	misceffect 316,"��#kiel";
	set KH_QUE,15;
	close;
}
kh_vila,181,20,0	duplicate(�{#kiel)	�{	111
kh_vila,178,20,0	duplicate(�{#kiel)	�{	111
kh_vila,175,19,0	duplicate(�{#kiel)	�{	111

kh_vila,191,14,0	script	��#kiel	111,{
	if(KH_QUE >= 20) {
		mes "�ʘH���ǂ���Ă���B";
		close;
	}
	if(KH_QUE < 15) {
		mes "-�����̕ǂ̂悤�Ɍ�����-";
		mes "-�����A�ǂ�����a����������̂�";
		mes "�C�̂������낤���H-";
		close;
	}
	mes "-�閧�̒ʘH�������Ă���-";
	next;
	if(select("���ɍs��","�g��Ȃ�")==2)
		close;
	warp "kh_vila",17,177;
	end;
}

kh_vila,16,175,0	script	��	111,{
	mes "-���������ĉh�{���̍���";
	mes "�y�b�g�t�[�h�����̔��@-";
	mes "-���Ȃ��̉����y�b�g�̂��߂ɁI-";
	mes "-�s�̂Ƃ͈ꖡ�Ⴄ���̎|���I-";
	next;
	mes "-�g�p���@-";
	mes "-��������1100Zeny�����āA";
	mes "�_�C�������E��2�x�񂵂Ă�������-";
	mes "-���������ĉh�{���̍���";
	mes "�y�b�g�t�[�h���o�Ă��܂�-";
	next;
	if(select("�����Ă݂�","��߂Ă���")==2) {
		mes "-�Ȃ񂾂����������Ɍ�����-";
		mes "-��߂Ă�����-";
		close;
	}
	if(Zeny < 1000) {
		mes "-Zeny������Ȃ�-";
		close;
	}
	mes "-���������悤���������Ă݂悤-";
	next;
	mes "-�c�c�c�c-";
	mes "-�����̃y�b�g�t�[�h�ɂ��������Ȃ�-";
	set Zeny,Zeny-1000;
	getitem 537,1;
	close;
}

kh_vila,30,184,0	script	�����S��	111,{
	mes "-�����������ȃ����S��";
	mes "�����ς��ɐ����Ă���-";
	next;
	if(select("�����čs��","�����čs���Ȃ�")==2) {
		mes "-�Ȃ񂾂����������Ɍ�����-";
		mes "-��߂Ă�����-";
		close;
	}
	mes "-��񂲂���ɂ��悤�Ƃ����u�ԁA";
	mes "���ȏL�������Ă���-";
	mes "-�c�c�܁A�܂����c�c-";
	next;
	mes "-���̃����S�͊댯������-";
	mes "-��߂Ă�����-";
	close;
}

kh_vila,44,126,0	script	�n�}	111,{
	if(KH_QUE_SUB&0x004 || KH_QUE >= 17) {
		mes "-���b�Z�[�W�������ꂽ����";
		mes "����������-";
		mes "-���b�Z�[�W��������x";
		mes "�m�F���Ă݂悤���H-";
		next;
		if(select("�m�F����","�K�v�Ȃ�")==2) {
			mes "-���̕K�v�͂Ȃ�������-";
			close;
		}
		callsub L_Routine;
		close;
	}
	if(KH_QUE_SUB&0x002) {
		mes "-�₩��ɓ����Ă���M�����A";
		mes "�n�}���Œ肵�Ă��鑐�ɂ����Ă݂�-";
		mes "-�c�c�S���͂���܂����̂��A";
		mes "�n�}�������������-";
		next;
		mes "-�n�}��ǂ���O������";
		mes "�ق�̏����������炵���u�ԁA";
		mes "�ۂ߂�ꂽ�����]���藎���Ă���-";
		next;
		mes "-���ɂ̓��b�Z�[�W��������Ă���-";
		next;
		callsub L_Routine;
		next;
		mes "-�c�c�Ӗ����킩��Ȃ�-";
		mes "-�����A�d�v�Ȏ������͊m�����낤-";
		set KH_QUE_SUB,KH_QUE_SUB|0x004;
		close;
	}
	mes "-�Â��n�}���`����Ă���-";
	next;
	if(select("�C�ɂ��Ȃ�","�����������Ă݂�")==1) {
		mes "-���܂�d�v�ł͂Ȃ����낤-";
		close;
	}
	mes "-�悭���Ă݂�ƁA";
	mes "�ꕔ��������";
	mes "�����ɕ����o�Ă���悤��-";
	mes "-�n�}�̗��ɉ�������̂��낤���H-";
	next;
	mes "-�n�}�͕ǂ�";
	mes "�����Œ肳��Ă���-";
	mes "-�ǂ���瑐�̂悤�ȕ��̂�";
	mes "�Œ肳��Ă���悤��-";
	mes "-���̔S���͂���߂ꂽ��";
	mes "�n�}���O�������ł�������-";
	set KH_QUE_SUB,KH_QUE_SUB|0x001;
	close;
L_Routine:
	mes "^0000FF���������A�n�������";
	mes "�ޏ��̐S���ɍs�����͊J�����";
	mes "�ޏ��̐S���͓����ȃN���X�^��";
	mes "�ޏ��̂��鏊�͖k�̊C�̂悤�ɗ₽��";
	mes "��͔ޏ���T������";
	mes "4�{�̌��������ċ�̎ւƌ�������^000000";
	next;
	mes "^0000FF1�ԖځF�����{��";
	mes "2�ԖځF������";
	mes "3�ԖځF������]";
	mes "4�ԖځF������]^000000";
	next;
	mes "^0000FF�ޏ������鏊��K�˂邽��";
	mes "�ޏ������̎�ɕ�������";
	mes "���4�{�̌���������";
	mes "��̎ւƌ�������^000000";
	return;
}

kh_vila,33,184,0	script	�₩��	111,{
	if(KH_QUE_SUB&0x002 || KH_QUE >= 17) {
		mes "-�₩�񂪂������ꏊ��-";
		close;
	}
	mes "-�M�����Ȃ����������Ă���₩��-";
	mes "-���C�������Ɨ��������Ă���-";
	if(KH_QUE_SUB&0x001 == 0)
		close;
	next;
	mes "-�c�c�M���c�c-";
	mes "-����Œn�}���Œ肵�Ă��鑐��";
	mes "�Ȃ�Ƃ��ł��Ȃ����낤���H-";
	next;
	if(select("���݂Ă݂�","���܂���҂ł��Ȃ�")==2) {
		mes "-���̕��@��T���Ă݂悤-";
		close;
	}
	mes "-^FF0000�M���̓������₩�����ɓ��ꂽ^000000-";
	mes "-�₯�ǂ����Ȃ��悤�ɒ��ӂ��悤-";
	set KH_QUE_SUB,KH_QUE_SUB|0x002;
	close;
}

kh_vila,39,41,0	script	����	111,{
	if(KH_QUE_SUB&0x008 || KH_QUE >= 17) {
		mes "-�{�^�������������A";
		mes "�K�i�̕�����u�J�V�����v��";
		mes "�y���������������C������-";
		close;
	}
	mes "-�₽�����Ȑ������܂��Ă���-";
	next;
	if(KH_QUE_SUB&0x004 == 0) {
		mes "-�c�c���ނ͖̂������낤-";
		close;
	}
	mes "-���q�̑��Ɠ�̎���肪������-";
	mes "-�������Ƃ��ł����������c�c-";
	next;
	if(select("�����Ă݂�","��߂Ă���")==2) {
		mes "-�ނ�݂ɐG��Ȃ������������낤-";
		close;
	}
	mes "-�ǂ����������Ă݂悤���H-";
	next;
	if(select("�E���̎����","�����̎����")==1) {
		mes "-��������������ƁA";
		mes "���q�̌����琅������n�߂�-";
		mes "-�������A�����ɗ���͎~�܂���-";
		mes "-�c�c�c�c-";
		mes "-���ɕω��͂Ȃ�������-";
		close;
	}
	mes "-��������������ƁA";
	mes "��Ɍ����J���A���܂��Ă�������";
	mes "�S�ė���Ă�����-";
	mes "-���̖����Ȃ�����ɂ�";
	mes "�ΐF�̃R�P���т�����Ɛ����Ă���-";
	next;
	if(select("���ɂȂɂ��Ȃ�������","���������悭����")==1) {
		mes "-�c�c�C���������Ȃ肻����-";
		close;
	}
	mes "-�悭����Ƌ��̕���";
	mes "�����ȃ{�^����������-";
	next;
	if(select("�����Ă݂�","�c�c�ق����Ă���")==2) {
		mes "-�����N���邩�킩��Ȃ�-";
		mes "-�ނ�݂ɐG��Ȃ������������낤-";
		close;
	}
	mes "-�{�^���������Ɓu�J�V�����v";
	mes "�Ɖ����y��������������-";
	mes "-^FF0000�L���̊K�i^000000�̕����炾����-";
	set KH_QUE_SUB,KH_QUE_SUB|0x008;
	close;
}

kh_vila,118,143,0	script	��	111,{
	if(KH_QUE_SUB&0x010 || KH_QUE >= 17) {
		mes "-���̏�ɖ{�⎆�؂ꂪ";
		mes "�U��΂��Ă���-";
		mes "-������ȓ��e�΂��肾-";
		close;
	}
	mes "-���̏�ɖ{�⎆�؂ꂪ";
	mes "�U��΂��Ă���-";
	mes "-�l�H���͂̐��@�Ɨ��p���@�c�c-";
	mes "-�匫�҃o�������g�̘_���W�c�c-";
	mes "-�H��p�����@�B�̊��p���@�c�c-";
	mes "-�������@�X�N���[���̐��@�c�c-";
	mes "-�G���[�̂��߂Ɂc�c-";
	next;
	mes "�u�G���[�H�v";
	mes "-�����̃y�[�W�΂���̖{��";
	mes "�悭���ׂ�ƁA��؂�̎���";
	mes "���܂��Ă���̂�������-";
	mes "���ɂ́u�L���E�n�C����Ƃ̕��́v";
	mes "�������ʂ��Ă���B";
	mes "�c�c�ꉞ�����Ă������B";
	next;
	mes "�u^FF0000�L���E�n�C���̖�͂��ʂ�����^000000�v";
	mes "���l�������B";
	set KH_QUE_SUB,KH_QUE_SUB|0x010;
	close;
}

kh_vila,123,170,0	script	�I	111,{
	if(KH_QUE_SUB&0x020 || KH_QUE >= 17) {
		mes "-�L���E�n�C���̖�͂��ʂ�������";
		mes "�B���ꂽ��������������-";
		mes "-������x�ǂ�ł݂悤���H-";
		next;
		if(select("����Ȏ��Ԃ͂Ȃ�","�ǂ�ł݂�")==1) {
			mes "-�͂₭���̏��𒲂ׂɍs����-";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "-�l�X�ȐF�̉t�̂������ꂽ";
	mes "�����ǂ��u����Ă���-";
	mes "-���Ɏg����̂��낤���H-";
	if(KH_QUE_SUB&0x010 == 0)
		close;
	next;
	mes "-�c�c���������΁A";
	mes "�ǂ����œǂ񂾖{�ɁA";
	mes "����̉t�̂ɔ�������C���N�������";
	mes "�����Ă������C������c�c-";
	next;
	if(select("����Ȃ��̂���킯���c�c","�L���E�n�C���̖�͂��ʂ������Ɂc�c")==1) {
		mes "����ȕ֗��ȕ��A����킯�Ȃ�-";
		close;
	}
	setarray .@str$[1],"��","��","��","��";
	if(select("�ԐF�̉t�̂𗎂Ƃ��Ă݂�","�F�̉t�̂𗎂Ƃ��Ă݂�","���F���t�̂𗎂Ƃ��Ă݂�","�ΐF�̉t�̂𗎂Ƃ��Ă݂�","��߂Ă���")==5) {
		mes "����ȕ֗��ȕ��A����킯�Ȃ�-";
		close;
	}
	mes "-" +.@str$[@menu]+ "�F�̉t�̂����̕\�ʂɉ�����";
	mes "����Ă���-";
	if(@menu != 2) {
		mes "-�s�v�c�Ȃ��Ƃ�";
		mes "�t�͎̂���G�炳�Ȃ��������A";
		mes "���ɕω��͖����݂�����-";
		close;
	}
	mes "-����ƁA�t�̂����ꂽ�Ղ���";
	mes "���������������X�ƌ��ꂽ-";
	next;
	callsub L_Routine;
	next;
	mes "-�c�c�c�c-";
	mes "-�Ȃ񂾂낤�c�c";
	mes "-���ɋC�ɂȂ鎍��-";
	set KH_QUE_SUB,KH_QUE_SUB|0x020;
	close;
L_Routine:
	mes "^0000FF-1�Ԗ�-";
	mes "��̎ւ͑L�S�ō��ꂵ��";
	mes "�₽���̂ƌ�����������";
	mes "��͓{��������Ďւ̓��ɐU�艺�낷";
	mes "��̎ւ͖���ɂ�^000000";
	next;
	mes "^0000FF-2�Ԗ�-";
	mes "��̎ւ͖��@�ō��ꂵ��";
	mes "���@�̑̂ƌƑ��ȓ�������";
	mes "��͈��������Ďւ̐S����˂�";
	mes "��̎ւ͖���ɂ�^000000";
	next;
	mes "^0000FF-3�Ԗ�-";
	mes "��̎ւ͌��Ɠ��ō��ꂵ��";
	mes "�g�����̂Ə_�炩����������";
	mes "��͊�]�������Ďւ̑̂����";
	mes "��̎ւ͖���ɂ�^000000";
	next;
	mes "^0000FF-4�Ԗ�-";
	mes "��̎ւ͊�̂Ȃ���";
	mes "���̑̂Ɠ��͒N�ɂ������Ȃ�";
	mes "��͐�]�������ċ���֓�������";
	mes "��̎ւ��ǂ��Ȃ������N���킩��Ȃ�";
	mes "�c�c�N�ɂ��킩��Ȃ��c�c^000000";
	next;
	mes "^0000FF�䂪���́u^FF0000���������������Ȉ���^0000FF�v";
	mes "���A�l�{�̌���������";
	mes "�Í��̒��̔ޏ���K�˂�^000000";
	return;
}

kh_vila,136,68,0	script	������	111,{
	if(KH_QUE_SUB&0x040 || KH_QUE >= 17) {
		mes "-�B���������ցH-";
		next;
		if(select("�ړ�����","�ړ����Ȃ�")==2) {
			mes "-�����������׉���Ă݂悤-";
			close;
		}
		warp "kh_vila",178,72;
		end;
	}
	mes "-�n���Ⴄ4�{�̌���";
	mes "��ŏo����4�C�̎ւ̑�������-";
	if(KH_QUE_SUB&0x004 == 0)
		close;
	if(KH_QUE_SUB&0x020 == 0)
		mes "-�n�}�̗��ɂ��������ɉB���ꂽ����";
	else {
		mes "-�L���E�n�C���̖�͂��ʂ�������";
		mes "�B����Ă�������";
	}
	mes "�ǂ��������C������-";
	next;
	if(select("��͂�֌W�͂Ȃ�������","���������悭�݂�")==1) {
		mes "-���炭���R���낤-";
		close;
	}
	mes "-�ւ̑����悭���Ă݂�ƁA";
	mes "1�C���Ƃɉ������h�����߂�����";
	mes "�����J���Ă���-";
	next;
	if(select("�����悭���ׂ�","�����Ă��錕���h���Ă݂�")==1) {
		mes "-�c�c���ȊO��";
		mes "�h������͖̂���������-";
		close;
	}
	if(KH_QUE_SUB&0x008 == 0) {
		mes "-�����Ă��錕��";
		mes "�����Ɉ����������Ă���悤��-";
		mes "-�ǂ�����Ă���ꂻ���ɖ���-";
		close;
	}
	if(KH_QUE_SUB&0x020 == 0) {
		mes "-���ɕω��͂Ȃ�-";
		mes "-�����@���ł�����̂��낤���H-";
		close;
	}
	mes "-�ǂ̌����ǂ��Ɏh�������H-";
	next;
	for(set .@i,0; .@i<4; set .@i,.@i+1) {
		switch(.@i) {
		case 0: mes "-����P�����𔲂���-"; break;
		case 1: mes "-�K���X�̌��𔲂���-"; break;
		case 2: mes "-�S�̌��𔲂���-"; break;
		case 3: mes "-�K�т����𔲂���-"; break;
		}
		next;
		set .@order[.@i],select("1�Ԗڂ̎�","2�Ԗڂ̎�","3�Ԗڂ̎�","4�Ԗڂ̎�");
	}
	if(.@order[0] != 2 || .@order[1] != 4 || .@order[2] != 1 || .@order[3] != 3) {
		mes "-�c�c���̕ω����Ȃ�-";
		mes "-����߂��Ă�����-";
		close;
	}
	mes "-�����c�c���c�c-";
	mes "-�}�ɒႢ���������������Ǝv���ƁA";
	mes "�̂��ǂ��������ɍs������������-";
	set KH_QUE_SUB,KH_QUE_SUB|0x040;
	close2;
	warp "kh_vila",178,72;
	end;
}

kh_vila,179,68,0	script	������	111,{
	mes "-�L���E�n�C���w�@�̐����𒅂�";
	mes "�j�̎q�������ǂɓ����Ă���-";
	close;
}

kh_vila,185,68,0	script	������	111,{
	if(KH_QUE_SUB&0x080 || KH_QUE >= 17) {
		mes "-^FF00004772961^000000�H-";
		mes "-��̉��̐������낤�H-";
		mes "-�c�c�c�c-";
		if(KH_QUE_SUB == 0x3FF) {
			mes "-��ʂ蒲�אs�������悤��-";
			mes "-�G���[�ɉ�ɍs����-";
			close;
		}
		mes "-�܂��������肻����-";
		mes "-�����ƐF��ȏ��𒲂ׂĂ݂悤-";
		close;
	}
	if(KH_QUE_SUB&0x040 == 0)
		end;
	mes "-!?-";
	mes "-�V�l�������ǂɓ����Ă���I-";
	mes "-�c�c�c�c-";
	mes "-�����ǂ̉��ɐԐF�{�^��������-";
	next;
	if(select("�{�^��������","�����������ׂ�")==2) {
		mes "-�O�̂��߁A������悭���ׂ悤-";
		close;
	}
	mes "-�{�^���������ƁA";
	mes "�����ǂ̒��̘V�l��";
	mes "�b�������Ă���-";
	next;
	mes "�u�c�c�c�c�c�c�v";
	mes "�u���O�͒N���c�c�v";
	mes "�u������ʓz���c�c�v";
	mes "�u���O���䂪�F�Ȃ�A";
	mes "�䂪����m���Ă���ȁH�v";
	next;
	input .@str$;
	if(.@str$ != "���������������Ȉ���") {
		mes "�u����͎��̖��O�ł͂Ȃ��c�c�v";
		close;
	}
	mes "�u�c�c���̐������o���Ă����B�v";
	mes "�u^FF00004,7,7,2,9,6,1^000000�v";
	next;
	mes "-^FF00004772961^000000-";
	mes "-��̉��̐������낤�H-";
	if(KH_QUE == 15)
		set KH_QUE,16;
	set KH_QUE_SUB,KH_QUE_SUB|0x080;
	close;
}

kh_vila,181,178,4	script	�|�����Ȍ�	81,7,3,{
	end;
OnTouch:
	mes "�O�������������c�c";
	next;
	mes "-�r�X�����X�萺���グ�Ă���-";
	mes "-�����ɒʂ蔲�����̂��H-";
	next;
	if(select("�����Ă݂�","���߂�")==2) {
		mes "-�������Ɋ댯������-";
		mes "-���̐�͒��߂悤-";
		close2;
		warp "kh_vila",126,70;
		end;
	}
	if(countitem(537)) {
		mes "-���������΁A�y�b�g�t�[�h��";
		mes "�����Ă���-";
		next;
		if(select("�y�b�g�t�[�h���g���Ă݂�","����Ȃ��͎̂g��Ȃ�")==1) {
			mes "-���鋰��y�b�g�t�[�h��";
			mes "���̑O�ɓ����̂Ă�ƁA";
			mes "���͐K����U��Ȃ���";
			mes "�y�b�g�t�[�h��H�׎n�߂�-";
			mes "-���̂����ɒʂ蔲���悤-";
			close2;
			delitem 537,1;
			warp "kh_vila",173,182;
			end;
		}
	}
	mes "-���鋰��߂Â��Ă݂�-";
	mes "-���̂��Ȃ萺��";
	mes "�傫���Ȃ��Ă���C������-";
	next;
	mes "-���̉���ʂ蔲���悤�Ɓc�c-";
	mes "-�c�c�c�c-";
	mes "�����I�@�����I�@�����I";
	mes "�����I�@�����I�@�����I�@�����I";
	next;
	mes "-�c�c�c�c�c�c-";
	mes "-�K�i���~���܂�";
	mes "���ɒǂ��񂳂ꂽ-";
	close2;
	warp "kh_vila",126,70;
	end;
}

kh_vila,115,186,0	script	�����o��	111,{
	if(KH_QUE_SUB&0x100 || KH_QUE >= 17) {
		if(KH_QUE_SUB == 0x3FF) {
			mes "-��ʂ蒲�ׂ��݂�����-";
			mes "-���낻��G���[�ɉ�ɍs����-";
			close;
		}
		mes "-^009CFF���F�̃J�[�h�L�[^000000��";
		mes "�����������o����-";
		close;
	}
	mes "-���x���g��ꂽ�悤��";
	mes "�ɂ񂾈����o��������-";
	next;
	if(select("�����o���������Ă݂�","�ق����Ă���")==2) {
		mes "-���̏���T���Ă݂悤-";
		close;
	}
	mes "-�����o���̒��ɂ�";
	mes "���F�̃J�[�h�L�[��������-";
	getitem 7492,1;
	set KH_QUE_SUB,KH_QUE_SUB|0x100;
	close;
}

kh_vila,14,55,0	script	�Ƃ�����	111,{
	if(countitem(7329)) {
		mes "-�Â����̌�����ɓ��ꂽ�r��-";
		mes "-�c�c��͂荂�����Ɍ�����-";
		close;
	}
	mes "-�������ȕr������-";
	mes "-�c�c�ǂ�����H-";
	next;
	switch(select("�r�������Ă݂�","�悭���Ă݂�","�ق����Ă���")) {
	case 1:
		mes "-�ƂĂ����������c�c-";
		mes "-�������ɉ󂷂̂͂܂������낤-";
		close;
	case 2:
		mes "-�c�c�c�c-";
		mes "-���������Ă���̂��낤���H-";
		next;
		mes "-�r�������ƐU���Ă݂��";
		mes "�u�W�B���v�Ɠ݂���������-";
		mes "-��͂艽���������Ă���悤��-";
		next;
		mes "-�u^FF0000�Â����̌�^000000�v����ɓ��ꂽ-";
		getitem 7329,1;
		close;
	case 3:
		mes "-�c�c��������-";
		mes "-�ނ�݂ɐG��Ȃ������������낤-";
		close;
	}
}

kh_vila,107,126,0	script	��	111,{
	if(countitem(7516) || KH_QUE >= 17) {
		mes "-^009C00�ΐF�̃J�[�h�L�[^000000�������Ă�������-";
		close;
	}
	mes "-���������u����Ă���-";
	mes "-�����J����ƁA���ɂ������";
	mes "���������Ă���-";
	next;
	mes "-���̔��͌����|�����Ă���-";
	if(countitem(7329) < 1)
		close;
	mes "-�Â����̌��ŊJ���ꂻ����-";
	next;
	if(select("�J���Ă݂�","�J���Ȃ�")==2) {
		mes "-���������Ă��邩�킩��Ȃ�-";
		mes "-��߂Ă������ق����������낤-";
		close;
	}
	mes "-�u�J�`�����v-";
	next;
	mes "-���̒��ɂ�";
	mes "�ΐF�̃J�[�h�L�[�������Ă���-";
	delitem 7329,1;
	getitem 7516,1;
	close;
}

kh_vila,181,138,0	script	�{�I	111,{
	if(KH_QUE_SUB&0x200 || KH_QUE >= 17) {
		if(KH_QUE_SUB == 0x3FF) {
			mes "-��ʂ蒲�ׂ��悤��-";
			mes "-���낻��G���[�ɉ�ɍs����-";
			close;
		}
		mes "-�܂����ׂ���Ȃ�-";
		mes "-�����ƐF��ȏ��𒲂ׂĂ݂悤-";
		close;
	}
	mes "-�{�ň�t�ɂȂ����{�I��-";
	mes "-���Ԃ��܂������Ȃ�-";
	if(countitem(7516) < 1 && countitem(7329) < 1)
		close;
	mes "-�c�c�c�c-";
	next;
	mes "-�c�c�c�c�c�c�H-";
	mes "-�u�G���[�̂��߂Ɂv-";
	mes "-�G���[�H-";
	next;
	if(select("�{��ǂ�ł݂�","�ق����Ă���")==2) {
		mes "-���ɖڂڂ����{�͂Ȃ�������-";
		close;
	}
	mes "-�{��ǂ����Ƃ������A";
	mes "�m��Ȃ������œǂ߂Ȃ�����-";
	mes "-�{�����̏ꏊ�ɖ߂����Ƃ�����A";
	mes "�{�I�̉��ɉ����d���S�̂悤��";
	mes "��������̂��ڂɎʂ���-";
	next;
	if(select("���������悭����","�ǂ��낤")==2) {
		mes "-�{�����ɖ߂��Ă�����-";
		close;
	}
	mes "-����̖{�����o���ƁA";
	mes "�B�����ɂ��o�Ă���-";
	mes "-���������-";
	next;
	if(select("�����Ă��錮�������Ă݂�","�c�c���������������Ȃ�")==2) {
		mes "-����T���Ă݂悤-";
		close;
	}
	for(set .@i,1; .@i <= 2; set .@i,.@i+1) {
		mes "-" +.@i+ "�ڂ̌�-";
		next;
		set .@order[.@i],select((countitem(7516)? "�ΐF�̃J�[�h�L�[": "�Â����̌�"),"�G���[�̌�");
	}
	if(.@order[1] != 2 || .@order[2] != 1 || countitem(7516) < 1) {
		mes "-�J���Ȃ�-";
		close;
	}
	mes "-�u�J�`�����v�ƌy����������";
	mes "���ɂ��J����-";
	mes "-���ɂ̒��ɂ͓S�̔��������Ă���-";
	next;
	mes "-^FF0000�S�̔�^000000����ɓ��ꂽ-";
	delitem 7489,1;
	delitem 7516,1;
	getitem 7491,1;
	if(KH_QUE == 15)
		set KH_QUE,16;
	set KH_QUE_SUB,KH_QUE_SUB|0x200;
	close;
}

//============================================================
// �L���E�n�C���w�@NPC2
//------------------------------------------------------------
yuno_fild08,69,185,0	script	��	111,{
	if(KH_QUE > 55) {
		mes "-���͕܂��Ă���-";
		close;
	}
	if(KH_QUE < 14) {
		mes "-�N�̕������낤-";
		mes "-�����畔���̒��ɂ��鏗�̎q�炵��";
		mes "�����͗l�̃J�[�e����������-";
		close;
	}
	if(KH_QUE < 16) {
		mes "-�G���[�������Ă�������-";
		mes "-��q�͌�������Ȃ�-";
		mes "-�܂��߂��ĂȂ��݂�����-";
		close;
	}
	if(KH_QUE == 16) {
		if(KH_QUE_SUB < 0x3FF) {
			mes "-�܂��\���ȏ��𓾂Ă��Ȃ�-";
			mes "-�G���[�̂��߂ɂ�����x";
			mes "�ʑ��𒲂ׂĂ݂悤-";
			close;
		}
		mes "-�G���[�������Ă�������-";
		mes "-�܂���q�͖����悤��-";
		mes "-�c�c��H�@���������J���Ă���-";
		mes "-�z���ǂ��g����";
		mes "�o��Ȃ����Ƃ��Ȃ����c�c-";
		next;
	}
	if(select("�z���ǂ�o��","���̕��@��T���Ă݂�")==2) {
		mes "-����Ɏg�������ȕ��͂Ȃ�-";
		close;
	}
	if(rand(5)) {
		mes "-�c�c�c�c�h�T�b-";
		mes "-�z���ǂ��犊�藎���Ă��܂���-";
		percentheal -10,0;
		close;
	}
	mes "-�z���ǂ�o���āA";
	mes "�G���[�̕����ɔE�э���-";
	close2;
	warp "kh_school",185,185;
	end;
}

kh_school,188,185,0	script	��	111,{
	warp "yuno_fild08",69,183;
	end;
}

kh_school,175,176,0	script	�N�b�L�[����	111,{
	if(KH_QUE == 55) {
		mes "-�N�b�L�[�����𒭂߂Ă�����A";
		mes "�J�����ςȂ��̑�����̕���";
		mes "�N�b�L�[�����������h�ꂽ-";
		mes "-���̎��A������ʂ̎莆��";
		mes "�܂��B����Ă����̂ɋC�Â���-";
		mes "-���炭�c�c�G���[��������";
		mes "^FF0000�莆^000000�̂悤��-";
		next;
		mes "-" +strcharinfo(0)+ "����ցc�c-";
		mes "�����h�W�΂����肵�āA";
		mes "�搶�ɓ{���Ă�G���[�����ǁA";
		mes "�����̃N�b�L�[�͂悭�ł��Ă����";
		mes "�搶�ɖJ�߂�ꂿ�������B";
		mes "�G�w�w�b�c�c";
		next;
		mes "������݁[���";
		mes strcharinfo(0)+ "����";
		mes "��`���Ă��ꂽ�������I";
		mes "�{���ɂ��肪�ƁI";
		next;
		mes strcharinfo(0)+ "����";
		mes "�݂����Ȑl������ƁA";
		mes "���̒��ɂ͂Ƃ��Ă��ǂ�����";
		mes "�������񂢂�C�������B";
		next;
		mes strcharinfo(0)+ "����́c�c";
		mes "�Ƃ��Ă����������Ȑl�Łc�c";
		mes "�G���[�͑�D������I";
		mes "�G�w�w�b�c�c";
		next;
		mes "�����A���ꂿ���ɉ����";
		mes " " +strcharinfo(0)+ "�����";
		mes "�Љ���ĂˁB";
		mes "���ꂿ����";
		mes strcharinfo(0)+ "����";
		mes "�ɉ����A�����ƏΊ�ɂȂ��B";
		next;
		mes strcharinfo(0)+ "����B";
		mes "�Ō�Ɉ�����c�c";
		mes "�悩������A���܂ł��c�c";
		mes "�G���[�̑�؂Ȑl�ɂȂ��āI";
		mes "�c�c�G�w�w�b�c�c�p���������ȁB";
		mes "����" +strcharinfo(0)+ "�����";
		mes "�Ί�ɂ������Ⴄ�悤�ɂ���΂��I";
		next;
		mes "-�����̒��̃N�b�L�[����";
		mes "���܂��ɃG���[�̉����肪";
		mes "�����Ƃ��C������-";
		mes "-���̓N�b�L�[������o����";
		mes "����H�ׂĂ݂�-";
		next;
		mes "-�c�c�c�c�c�c-";
		mes "-���C���Ă͂������A";
		mes "�Â��`���R���[�g�̖���";
		mes "�������ς��ɍL�������c�c-";
		mes "-�c�c�c�c�c�c-";
		next;
		mes "-���̂܂ɂ��A���͋����Ă���-";
		next;
		mes "-�c�c�c�c-";
		mes "-�����ɂ͂������Ȃ��c�c-";
		set KH_QUE,56;
		close2;
		warp "yuno_fild08",69,183;
		end;
	}
	if(KH_QUE != 16) {
		mes "-���C�����N�b�L�[�������Ă���-";
		close;
	}
	mes "-�G���[�̃N�b�L�[������-";
	mes "-�R�̂悤�ɐ����Ă���";
	mes "�N�b�L�[�̊ԂɁA����������������-";
	mes "-�N�b�L�[����ǂ����Ă݂���A";
	mes "^FF0000���b�Z�[�W^000000�������ꂽ";
	mes "���؂��������-";
	next;
	if(select("�ǂ�Ō���","�ق����Ă���")==2) {
		mes "�c�c�c�c";
		close;
	}
	mes "�������𒅂��ςȒj��";
	mes "�w�@�̒�������Ă�c�c";
	mes "�j�̎����������𕷂���";
	mes "�݂�Ȑl�`�݂����Ɍł܂��Ă��I";
	mes "�����c�c������c�c";
	next;
	mes "���A�����̕����ɉB���";
	mes "���̃��b�Z�[�W�������Ă�́B";
	mes "���͊J���Ă�������B";
	mes "�c�c���̃��b�Z�[�W�ɂ�";
	mes "�C�Â��Ă��炦�邩�ȁH";
	next;
	mes "�����A�F�݂����ɂȂ����Ⴄ�̂��ȁH";
	mes "�c�c�₾�I�@����Ȃ̂₾�I";
	mes "!?�@�N�����Ă�I";
	mes "�₾�c�c�c�c";
	mes "�₾�I�@�₾�I�@�₾�I";
	mes "�u" +strcharinfo(0)+ "�v����I";
	set KH_QUE,17;
	set KH_QUE_SUB,0;
	close;
}

kh_school,177,180,4	script	�G���[	895,{
	if(KH_QUE < 17) {
		mes "[�G���[]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		mes "[�G���[]";
		mes "�c�c�c�c�c�c�c�c";
		close;
	}
	switch(KH_QUE) {
	case 17:
		mes "[�G���[]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		mes "-�G���[���ł܂��Ă���c�c-";
		mes "-�ǂ�����΂����񂾁c�c-";
		next;
		switch(select("�G���[�ɐG��Ă݂�","���t�������Ă݂�","�ق����Ă���")) {
		case 1:
			mes "-���͐k�����ŃG���[��";
			mes "�r���y���h�炵�Ă݂�-";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�G���[�H�@�G���[�H";
			next;
			mes "-���̔������Ȃ�-";
			mes "-�ǂ�����΂����񂾁c�c-";
			close;
		case 2:
			input .@str$;
			break;
		case 3:
			break;
		}
		mes "[�G���[]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		if(.@str$ == "�G���[�A�N����") {
			mes "-���̏u�ԁA�G���[�̈����Ă���";
			mes "�肪�y���J���āA";
			mes "^0000FF�����ȉ����̌�^000000��";
			mes "^0000FF�{�^��^000000�����ڂꗎ����-";
			mes "-�c�c����́H-";
			delitem 7491,1;
			getitem 7493,1;
			getitem 7494,1;
			set KH_QUE,18;
			close;
		}
		mes "-���̔������Ȃ�-";
		close;
	case 18:
		mes "-�G���[���瓾��^FF0000�����̌�^000000��";
		mes "^0000FF�S�̔�^000000���J����ꂻ����-";
		next;
		mes "-^FF0000�����̌�^000000��^0000FF�S�̔�^000000���J����-";
		mes "-���̒��ɂ�^009C00�莆^000000��";
		mes "^0000FF�F�̃J�[�h�L�[^000000�������Ă���-";
		break;
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
	case 24:
	case 25:
		mes "-���̒��ɓ����Ă����莆�ɂ�";
		mes "���̂悤�ɏ�����Ă���-";
		break;
	default:
		mes "[�G���[]";
		mes "�c�c�c�c�c�c�c�c";
		close;
	}
	next;
	mes "-�G���[��-";
	mes "�G���[��A�L�G���̓^�u�[��Ƃ����B";
	mes "���̊�]�������N�������A";
	mes "�g����ȗ~�]�ŉ������{���Ă���B";
	mes "���͂��̋��s���~�߂Ȃ���΂Ȃ�Ȃ��B";
	next;
	mes "���O�����̔����������Ƃ������́A";
	mes "���ɉ����������Ƃ��������B";
	mes "������A���̔���ʂ���";
	mes "���̖����N�Ɉς˂邱�Ƃɂ���B";
	mes "�N�ɂ����J�����Ȃ����̔��Ȃ�";
	mes "���S���Ĉς˂���B";
	next;
	mes "�G���[�A���������ēǂ�ŗ~�����B";
	mes "�G���[�c�c�N�́c�c";
	mes "�c�c�N�͐l�Ԃł͂Ȃ��B";
	mes "�R�̂悤�����A����͎������B";
	mes "�ڂ������́A�H��ɍs����";
	mes "�킩��͂����B";
	next;
	mes "�H��̓�����^0000FF���̂��΂̕�n^000000�ɂ���B";
	mes "�����āA�H��̉B�������ɂ���";
	mes "^0000FF�G���V�A^000000��T���Ȃ����B";
	mes "�ޏ��̕ۈ��V�X�e���ɁA";
	mes "�N�̖��O����͂��Ă������B";
	mes "�ޏ��Ȃ�A����T���o������";
	mes "�ł��邾�낤�B";
	if(KH_QUE == 18) {
		getitem 7495,1;
		set KH_QUE,19;
	}
	close;
}

yuno_fild08,71,170,0	script	��	111,{
	if(KH_QUE >= 55 && countitem(7509)) {
		mes "-��̈ꕔ�������Ɍ����Ă���-";
		next;
		if(select("^FF0000���F�̃J�[�h�L�[^000000���g��","�ق����Ă���")==1) {
			mes "-�J�[�h�L�[���g���ƁA";
			mes "���ɑ����ʘH���J����-";
			next;
			if(select("�i��","��߂Ă���")==1) {
				warp "kh_dun01",3,230;
				end;
			}
		}
		mes "�c�c�c�c�c�c";
		close;
	}
	if(KH_QUE >= 20) {
		mes "-�H��֒ʂ���ʘH���J���Ă���-";
		next;
		if(select("����","����Ȃ�")==2) {
			mes "-���͍s���Ȃ��Ă������낤-";
			close;
		}
		warp "kh_dun01",3,230;
		end;
	}
	if(KH_QUE < 19) {
		mes "-�N���̂��悾-";
		close;
	}
	mes "-��n�̎���𒲂ׂ�ƁA";
	mes "�B���ʘH����������-";
	next;
	mes "-�悭����ƁA";
	mes "�����������ꂻ���ȏ����Ȍ��ƁA";
	mes "0����9�܂ł̐����Ղ�����-";
	next;
	mes "-�����Ȍ��ɉ�������H-";
	next;
	input .@str$;
	if(.@str$ != "���F�̃J�[�h�L�[") {
		mes "-���̔������Ȃ�-";
		close;
	}
	mes "-�u^0000FF���F�̃J�[�h�L�[^000000�v�������";
	mes "�u�s�v�Ƃ������̌�ɐ�������o��-";
	mes "�u^009C00�Ïؔԍ�^000000����͂��Ă��������B�v";
	next;
	mes "-��������͂��悤-";
	next;
	input .@str$;
	if(.@str$ != "4772961") {
		mes "�u���F�G���[�B�v";
		mes "�u�ēx���͂��Ă��������B�v";
		close;
	}
	mes "�u���F�����B�v";
	mes "�u�悤�����A^FF0000�L���E�n�C��^000000�l�B�v";
	mes " ";
	mes "-�u�s�[�v�Ƃ������ƂƂ���";
	mes "�ʘH������ꂽ-";
	set KH_QUE,20;
	close;
}

//============================================================
// �@�B�l�`�H��NPC
//------------------------------------------------------------
kh_dun01,235,48,0	script	�d���h�A#kiel	111,{
	if(KH_QUE >= 24) {
		mes "-���ŏd���h�A��-";
		close;
	}
	mes "-�d�����ȃh�A������-";
	next;
	if(select("�A�C�e�����g��","�ق����Ă���")==2) {
		mes "-�C�ɂ��Ȃ��Ă������낤-";
		close;
	}
	input .@str$;
	if(strnpcinfo(2) != "kiel" || .@str$ != "�F�̃J�[�h�L�[") {
		mes "-�J���������Ȃ�-";
		close;
	}
	mes "-�h�A���J����-";
	close2;
	warp "kh_school",119,144;
	end;
}
kh_dun01,6,18,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,6,30,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,6,60,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,6,133,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,6,164,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,76,233,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,106,233,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,235,70,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,235,93,0	duplicate(�d���h�A#kiel)	�d���h�A	111
kh_dun01,235,114,0	duplicate(�d���h�A#kiel)	�d���h�A	111

kh_school,119,149,4	script	����������	894,{
	cutin "kh_ellisia",2;
	if(KH_QUE != 20) {
		mes "[�G���V�A]";
		mes "�c�c�͂₭�s���܂��傤�B";
		close2;
		cutin "kh_ellisia",255;
		warp "kh_school",120,180;
		end;
	}
	mes "[�G���V�A]";
	mes "�c�c�c�c";
	mes "���Ȃ��͎��̋L���ɖ������ł��ˁB";
	next;
	mes "[�G���V�A]";
	mes "�L���E�n�C���l�̂��b�ł�";
	mes "�����ɓ��邱�Ƃ�������Ă���l�́A";
	mes "^FF0000�����^�C�v�̃G���[^000000��";
	mes "^FF0000�G���[�̗F�l^000000�����ł��B";
	next;
	mes "[�G���V�A]";
	mes "^FF0000�G���[^000000�̎p�͌�������܂���ˁB";
	mes "�ޏ��ɉ����������̂ł����H";
	mes "�����āA���Ȃ���";
	mes "^FF0000�G���[�̗F�l^000000�Ȃ̂ł����H";
	next;
	mes "[�G���V�A]";
	mes "���������Ȃ�A���Ȃ���";
	mes "^FF0000�G���[�̗F�l^000000�ł��鎖��";
	mes "�ؖ��ł��镨�������Ă��������܂����H";
	next;
	switch(select("���F�̃J�[�h�L�[","�F�̃J�[�h�L�[","�����̌�","���l���`���ꂽ�{�^��","�c�c�c�c�H")) {
	default:
		mes "[�G���V�A]";
		mes "����ł�^FF0000�G���[�̗F�l^000000����";
		mes "�ؖ����邱�Ƃ͂ł��܂���B";
		mes "���̕��������Ă��������܂����H";
		close2;
		cutin "kh_ellisia",255;
		end;
	case 3:
		mes "[�G���V�A]";
		mes "�L���E�n�C���l��^FF0000�G���[^000000�ɑ�����";
		mes "���ł��ˁB";
		mes "�킩��܂����B";
		mes "���Ȃ��͊ԈႢ�Ȃ�";
		mes "^FF0000�G���[�̗F�l^000000�ł��B";
		next;
		mes "[�G���V�A]";
		mes "�c�c���҂����Ă���܂����B";
		mes "�ǂ���������ցB";
		close2;
		cutin "kh_ellisia",255;
		warp "kh_school",120,180;
		end;
	case 4:
		mes "[�G���V�A]";
		mes "�����!?";
		mes "^0000FF�L�G��^000000�l�̖�́I";
		mes "����D���ɂ������������̂ł���!?";
		close2;
		cutin "kh_ellisia",255;
		monster "kh_school",118,145,"���e",1745,5;
		end;
	case 5:
		mes "[�G���V�A]";
		mes "�c�c�c�c�c�c";
		close2;
		cutin "kh_ellisia",255;
		end;
	}

}
kh_school,117,149,4	script	����������	894,{}
kh_school,118,149,4	script	����������	894,{}
kh_school,120,149,4	script	����������	894,{}
kh_school,121,149,4	script	����������	894,{}

kh_school,122,186,4	script	����������	894,{
	cutin "kh_ellisia",2;
	switch(KH_QUE) {
	default:
		cutin "kh_ellisia",255;
		warp "yuno_fild08",73,172;
		end;
	case 20:
		mes "[�G���V�A]";
		mes "���������ł����A";
		mes "���Ԃ̐����������Ă��������܂��B";
		mes "^FF0000�L���E�n�C��^000000�l�͌��݁A";
		mes "�H��̂ǂ����Ɋċւ����";
		mes "��������Ⴂ�܂��B";
		next;
		mes "[�G���V�A]";
		mes "^FF0000�L���E�n�C��^000000�l�̋~�o��";
		mes "���͂��Ă��������܂��񂩁H";
		next;
		if(select("�H��Ƃ͈�́c�c�H","^FF0000�L���E�n�C��^000000����ɉ����H")==1) {
			mes "[�G���V�A]";
			mes "�L���E�n�C����Ƃ̔閧���ƁA";
			mes "�����@�B�l�`�����H��ł��B";
			mes "���Ȃ��������Ă��鎄��";
			mes "�u�L���E�n�C���w�@�v�̊w���͊F�A";
			mes "�l�Ԃł͂���܂���B";
			mes "�u�@�B�l�`�v�ł��B";
			next;
			mes "[�G���V�A]";
			mes "�l�Ԃƍ������Ă��܂����A";
			mes "���̓I�A���_�I�ɏ��鎩���@�B�l�`��";
			mes "�l�ԎЉ�ɒ񋟂��鎖���A";
			mes "�������u�L���E�n�C����Ɓv�̖ڕW�A";
			mes "���O�Ȃ̂ł��B";
			close2;
			cutin "kh_ellisia",255;
			end;
		}
		mes "[�G���V�A]";
		mes "^0000FF�L�G��^000000�l�͐l�`������";
		mes "�u�����v���{���܂����B";
		mes "���̎�����m����^FF0000�L���E�n�C��^000000�l��";
		mes "^0000FF�L�G��^000000�l�̍s����";
		mes "��߂ɂ�������Ⴂ�܂������A";
		mes "�����A���Ă���܂���B";
		next;
		mes "[�G���V�A]";
		mes "^FF0000�L���E�n�C��^000000�l��";
		mes "^0000FF�L�G��^000000�l�̎�ɕ߂���鎖��";
		mes "�\�����Ă����܂����B";
		mes "�����ŁA���������Ɏc�������̐l�`��";
		mes "�A��čs���܂����B";
		next;
		mes "[�G���V�A]";
		mes "^FF0000�L���E�n�C��^000000�l�̐��̔�����";
		mes "��M�ł��܂��̂ŁA^FF0000�L���E�n�C��^000000�l��";
		mes "�����ł�������Ⴂ�܂��B";
		mes "�ǂ���^FF0000�L���E�n�C��^000000�l��";
		mes "�߂���Ă��鏊��";
		mes "�T���o���Ă��������B";
		next;
		mes "[�G���V�A]";
		mes "�閧�H������R�ɏo����ł���";
		mes "^FF0000�J�[�h�L�[^000000�������グ�܂��B";
		mes "^FF0000�L���E�n�C��^000000�l����������";
		mes "���ɒm�点�Ă��������B";
		getitem 7496,1;
		set KH_QUE,21;
		close2;
		cutin "kh_ellisia",255;
		end;
	case 21:
		mes "[�G���V�A]";
		mes "�}����^FF0000�L���E�n�C��^000000�l��";
		mes "���T�����������B";
		close2;
		cutin "kh_ellisia",255;
		warp "kh_dun01",22,216;
		end;
	case 22:
		mes "[�G���V�A]";
		mes "�L���E�n�C���l�͌�����܂������H";
		next;
		mes "-���͔ޏ��ɃL���E�n�C����";
		mes "�ċւ���Ă����ꏊ�������A";
		mes "�ނ�������ꂽ^FF0000�����̔j��^000000��";
		mes "�ޏ��ɓn����-";
		next;
		mes "[�G���V�A]";
		mes "���肪�Ƃ��������܂��B";
		mes " ";
		mes "-^0000FF�G���V�A^000000��";
		mes "^FF0000�����̃p�[�c^000000��";
		mes "�����̎��ɖ��ߍ���-";
		next;
		mes "[�G���V�A]";
		mes "�c�c�c�c�c�c";
		mes "^FF0000�L���E�n�C��^000000�l�̈Í����m�F�B";
		mes "B_2_3�n��A���̔�������B";
		mes "�c�c�c�c";
		mes "���������m�F�B";
		mes "�����l�`�݌v�}�A���M�����B";
		delitem 7497,1;
		set KH_QUE,23;
		close2;
		cutin "kh_ellisia",255;
		end;
	case 23:
		mes "[�G���V�A]";
		mes "�c�c�c�c���҂������܂����B";
		mes "���͍�����^FF0000�L���E�n�C��^000000�l��";
		mes "�����߂𐋍s���܂��B";
		mes "��قǁA^0000FF���q�^���[����";
		mes "�u�L���E�n�C���@��v^000000�܂�";
		mes "���z�����������B";
		next;
		mes "[�G���V�A]";
		mes "�Ȃ��A����ł����A";
		mes "���Ȃ����ێ����Ă���J�[�h�L�[��";
		mes "�ۈ���A��������Ă��������܂��B";
		next;
		mes "[�G���V�A]";
		mes "�@��ւ�^FF0000�����̌�^000000��";
		mes "��������������΁A";
		mes "�@��̒��ɓ����悤�ɂȂ�܂��B";
		delitem 7492,1;
		delitem 7495,1;
		delitem 7496,1;
		set KH_QUE,24;
		close2;
		cutin "kh_ellisia",255;
		warp "yuno_fild08",73,172;
		end;
	}
}

kh_dun01,163,223,4	script	�Ŕ�	857,{
	mes "-�y�b�g�֎~-";
	close;
}

kh_dun01,200,220,0	script	MonsterWarp#kiel1	139,5,20,{
	end;
OnTouchNPC:
	warp "kh_dun01",178,138;
	end;
}
kh_dun01,190,220,0	duplicate(MonsterWarp#kiel1)	MonsterWarp#kiel2	139,5,20
kh_dun01,180,220,0	duplicate(MonsterWarp#kiel1)	MonsterWarp#kiel3	139,5,20
kh_dun01,210,220,0	duplicate(MonsterWarp#kiel1)	MonsterWarp#kiel4	139,5,20
kh_dun01,220,220,0	duplicate(MonsterWarp#kiel1)	MonsterWarp#kiel5	139,5,20

kh_dun01,166,223,0	script	�@�B���u#kiel1	111,{
	mes "-���������邱�Ƃ��ł���";
	mes "�@�B���u��-";
	if(KH_QUE < 21 || KH_QUE > 23)
		close;
	next;
	input .@str$;
	if(.@str$ != "�ԐF�̃J�[�h�L�[") {
		mes "-���̔������Ȃ�-";
		close;
	}
	mes "-�J�[�h�L�[�������";
	mes "�h�A��������-";
	close2;
	if(strnpcinfo(2) != "")
		warp "kh_dun01",170,227;
	else
		warp "kh_dun01",165,204;
	end;
}
kh_dun01,162,206,0	duplicate(�@�B���u#kiel1)	�@�B���u	111

kh_dun01,224,233,0	script	�h�A	139,5,5,{
OnTouch:
	if(KH_QUE != 21) {
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		close;
	}
	mes "[????]";
	mes "�c�c�c�c�c�c";
	next;
	mes "-���̌�����������A";
	mes "�N���̘b��������������-";
	next;
	mes "[????]";
	mes "�c�c^0000FF�L�G��^000000�c�c";
	mes "�c�c���O�́c�c�ǂ����āc�c";
	next;
	mes "-�c�c^FF0000�L���E�n�C��^000000���񂾂낤���H-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "^FF0000�L���E�n�C��^000000����H";
	next;
	mes "[�L���E�n�C��]";
	mes "�c�c�N���ˁH";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���́c�c�c�c";
	next;
	mes "-^FF0000�L���E�n�C��^000000�����";
	mes "^FF0000�G���[^000000��^0000FF�G���V�A^000000�����";
	mes "�b��`����-";
	next;
	mes "[�L���E�n�C��]";
	mes "�c�c�������B";
	mes "�G���[�́c�c�c�c";
	mes "�c�c�c�c�c�c";
	next;
	mes "[�L���E�n�C��]";
	mes "�c�c�c�c�c�c";
	mes "����������čs�����܂��B";
	mes "^0000FF�G���V�A^000000�ɓn�������ł����B";
	next;
	mes "-���̂����Ԃ���";
	mes "^FF0000�����̃p�[�c^000000���o�Ă���-";
	getitem 7497,1;
	set KH_QUE,22;
	next;
	mes "[�L���E�n�C��]";
	mes "�c�c�c�c�c�c";
	close;
}

kh_dun01,44,203,0	script	�@�B���u#kiel2	111,{
	if(countitem(7509) < 1 || KH_QUE < 26) {
		mes "-�傫�ȃh�A������-";
		close;
	}
	mes "-�J�[�h�L�[���g����h�A��-";
	next;
	input .@str$;
	if(.@str$ != "���F�̃J�[�h�L�[") {
		mes "-�J���Ȃ�-";
		close;
	}
	mes "-�u���F�̃J�[�h�L�[�v���g���ƁA";
	mes "�傫�ȃh�A���J���āA";
	mes "�K�i������ꂽ-";
	next;
	if(select("�~���","�~��Ȃ�")==2) {
		mes "-���Ԃ��o�ƁA�傪�܂���-";
		close;
	}
	warp "kh_dun02",41,198;
	end;
}
kh_dun01,36,195,0	duplicate(�@�B���u#kiel2)	�@�B���u	111

//============================================================
// �L���E�n�C���@NPC
//------------------------------------------------------------
kh_mansion,78,54,4	script	����	109,{
	if(KH_QUE < 24) {
		mes "[����]";
		mes "������͌l�Z��ł��B";
		mes "������肭�������B";
		close2;
		warp "lighthalzen",188,201;
		end;
	}
	switch(KH_QUE) {
	case 24:
	case 25:
		mes "[����]";
		mes "��l�̂��q�l�ł����H";
		mes "�ł́A���̏؋������������������B";
		next;
		if(select("�����̌���������","????")==2) {
			mes "[����]";
			mes "�c�c������肭�������B";
			close2;
			warp "lighthalzen",188,201;
			end;
		}
		mes "[����]";
		mes strcharinfo(0)+ " �l�ł��ˁB";
		mes "���҂����Ă���܂����B";
		mes "���ē������Ă��������܂��B";
		close2;
		warp "kh_mansion",21,14;
		end;
	default:
		mes "[����]";
		mes "�c�c�c�c";
		mes "��l�ɉ���܂����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[����]";
			mes "���҂����Ă���܂��B";
			close;
		}
		mes "[����]";
		mes "������ւǂ����B";
		close2;
		warp "kh_mansion",21,14;
		end;
	case 33:
	case 34:
	case 35:
	case 36:
		mes "[����]";
		mes "�悤���������ł��������܂����B";
		mes "��l�ɉ���܂����H";
		mes "����Ƃ��c�c";
		next;
		if(select("^FF0000�L���E�n�C��^000000����Ƙb���c�c","^0000FF�~�b�`�F��^000000���c�c")==1) {
			mes "[����]";
			mes "���m�������܂����B";
			mes "������ւǂ����B";
			close2;
			warp "kh_mansion",21,14;
			end;
		}
		mes "[����]";
		mes "�c�c�c�c";
		mes "�����������ł����悤�ł��ˁB";
		next;
		mes "-���ӂ����񂷎����̖ڂ���";
		mes "�}�ɉs���Ȃ���-";
		next;
		mes "[����]";
		mes "�c�c���Ȓ��͂��Ȃ��悤�ł��ˁB";
		mes "�ł́A������ցc�c";
		close2;
		warp "kh_mansion",20,86;
		end;
	}
}

kh_mansion,22,28,4	script	�L���E�n�C��	903,{
	cutin "kh_kyel01",2;
	switch(KH_QUE) {
	case 24:
		mes "[�L���E�n�C��]";
		mes "�ق��c�c";
		mes "�N��" +strcharinfo(0)+ "���H";
		mes "����̏��́A���ӂ��Ă���B";
		next;
		mes "[�L���E�n�C��]";
		mes "�ӂށc�c";
		mes "���������������肻���Ȋ炾�ȁB";
		next;
		mes "[�L���E�n�C��]";
		mes "�m�肽����������Ȃ牓���Ȃ�";
		mes "�������܂��B";
		mes "�����A���ɂ��p�������邩��c�c";
		mes "�������ȁA�O�܂łȂ�";
		mes "�ǂ�Ȏ���ɂ������悤�B";
		for(set .@i,0; .@i<3; set .@i,.@i+1) {
			next;
			switch(select("�@�B�l�`�Ƃ́c�c�H","^0000FF�L�G��^000000�Ƃ����l�́c�c�H","^FF0000�G���[^000000�������Ă�������́H")) {
			case 1:
				mes "[�L���E�n�C��]";
				mes "32�N�O�c�c";
				mes "����20�΂̎����獰�������";
				mes "�������Ă������������B";
				mes "�匫�҃o�������g����낤�Ƃ���";
				mes "�l�Ԃƍ������A�l�Ԃ̂悤�ɍs������A";
				mes "�l�Ԃ̎�ɂ���č��ꂽ�l�`�B";
				next;
				mes "[�L���E�n�C��]";
				mes "�O���̓K�[�f�B�A���Ǝ��Ă���悤��";
				mes "�����邩���m��Ȃ����A";
				mes "�����̈ӎv�������A";
				mes "���ߖ����ł͓��������ł��Ȃ�";
				mes "�K�[�f�B�A���Ƃ͈Ⴂ�A����l��";
				mes "�s���ł��錻��Ȋw�̌���ł���B";
				next;
				mes "[�L���E�n�C��]";
				mes "�����Əڂ����m�肽���̂Ȃ�";
				mes "^0000FF�G���V�A^000000�ɕ������܂��B";
				break;
			case 2:
				mes "[�L���E�n�C��]";
				mes "^0000FF�L�G��^000000�͎����B�ꈤ���������Ƃ̊Ԃ�";
				mes "���܂ꂽ�A��������l�̑��q���B";
				mes "�ޏ��͂������Y���";
				mes "����ł��܂����c�c";
				mes "^0000FF�L�G��^000000�͓V�˓I�ȋ@�B�̐݌v�\�͂�";
				mes "�����Ă���B";
				next;
				mes "[�L���E�n�C��]";
				mes "^FF0000�G���[^000000�̂悤�ȑ�3����̋@�B�l�`��";
				mes "^0000FF�L�G��^000000���݌v���������B";
				mes "���������́c�c��3����̋@�B�l�`��";
				mes "�������āA�{���Ƃ͈Ⴄ�p�r��";
				mes "�g�p���Ă���c�c";
				next;
				mes "[�L���E�n�C��]";
				mes "���͂�����~�߂悤�Ƃ������A";
				mes "�t�ɕ߂炦���A";
				mes "���̏ꏊ�Ɋċւ���Ă����B";
				mes "��́A����������]��ł���̂��c�c";
				mes "���̂���ȍs���������̂��A";
				mes "���ɂ͂܂��킩���Ă��Ȃ��B";
				break;
			case 3:
				mes "[�L���E�n�C��]";
				mes "�c�c���̖�͂�^0000FF�L�G��^000000�̖�͂��ȁB";
				mes "�������̒j�������Ă����̂��H";
				mes "������^0000FF�L�G��^000000�l�̗p�S�_�A";
				mes "�u�J�C�]�v�����m���ȁB";
				next;
				mes "[�L���E�n�C��]";
				mes "���̊Ԃɂ�^0000FF�L�G��^000000��";
				mes "����Ɍق��Ă������̕s���̒j���B";
				mes "��ɍ������𒅂Ďp���B���Ă���B";
				mes "��������̊�͌������Ƃ������B";
				break;
			}
		}
		next;
		mes "[�L���E�n�C��]";
		mes "�ӂ��c�c";
		mes "����͂���ʂł������ȁH";
		set KH_QUE,25;
		break;
	case 25:
		mes "[�L���E�n�C��]";
		mes "���Ɓc�c";
		mes "����͊��ӂ̋C�������B";
		mes "�債�����ł͂Ȃ����A";
		mes "�󂯎���Ă��ꂽ�܂��B";
		delitem 7493,1;
		delitem 7494,1;
		getitem 12105,1;
		if(checkre())
			getexp 70000,0;
		else
			getexp 700000,0;
		set KH_QUE,26;
		break;
	case 26:
	case 27:
	case 28:
	case 29:
	case 30:
		mes "[�L���E�n�C��]";
		mes "���ɕ����������Ƃ�����̂��ˁH";
		break;
	case 31:
	case 32:
	case 33:
		mes "[�L���E�n�C��]";
		mes "�����b�ł����邩�ˁH";
		next;
		mes "-�܂��m���ȏ��͂Ȃ�-";
		break;
	case 34:
		mes "[�L���E�n�C��]";
		mes "�ӂށc�c";
		mes strcharinfo(0)+ "�N";
		mes "�������ȁH";
		mes "���̗p���ȁH";
		next;
		menu "^0000FF�G���V�A^000000�ɂ���",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "�W���m�[�̂���p����";
		mes "^0000FF�G���V�A^000000�Ƃ܂������������";
		mes "�ё���������܂����B";
		next;
		cutin "kh_kyel02",2;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		mes "�������������̂��킩��Ȃ��B";
		mes "���ꂪ�ǂ��������̂��ˁH";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "���̒��ɂ͎��Ă���l������B";
		mes "���̕s�v�c�ȋ��R��";
		mes "���ɘb���������Ƃ��ˁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�������B";
		mes "�ё���̏�����^0000FF�G���V�A^000000��";
		mes "����l���ł͂Ȃ�����";
		mes "�����Ă���̂ł��B";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�n�b�n�b�n�b�n�I";
		mes "�N�͈�̉��������Ă���̂��ˁH";
		mes "^0000FF�G���V�A^000000�̊O����";
		mes "�������ڃf�U�C���������̂��B";
		next;
		mes "[�L���E�n�C��]";
		mes "�������ȁc�c�ё���Ȃ�c�c";
		mes "�N����^0000FF�G���V�A^000000�̎p������";
		mes "���������c�����Ƃ����̂͂킩��B";
		mes "��Ƃ͎������C�ɓ�������ʑ̂Ȃ�";
		mes "���ł��`����������̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ɂ��ẮA���̏ё����";
		mes "�ƂĂ��Â������悤�ł����c�c";
		mes "���̌����ё���́A��30�N�O��";
		mes "�����������A���̏����̖��O��";
		mes "�u^0000FF�G���V�A^000000�v";
		mes "�W���m�[�Ɏ��݂��Ă��������ł��B";
		next;
		cutin "kh_kyel02",2;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		next;
		cutin "kh_kyel01",2;
		mes "[" +strcharinfo(0)+ "]";
		mes "���ɂ͊m�M������܂��B";
		mes "�ޏ������̃G���V�A�̃��f���B";
		mes "�����āA���Ȃ����B��";
		mes "�����������ł͂Ȃ����Ɓc�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c��l�̕n�����j��";
		mes "��l�̏����������܂����B";
		mes "�������A�ޏ��͑��̒j��";
		mes "�����Ă����B";
		mes "�������A";
		mes "���̒j���ޏ��������Ă����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ޏ����������j��";
		mes "�n�����j�Ƃ͔�ׂ��Ȃ�����";
		mes "�x�ƌ��͂��������l�ł����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������A����Ȃ��ƂɁA";
		mes "�ޏ����������l�ɂ�";
		mes "�e�����߂�����҂������B";
		mes "������A���̒j��";
		mes "�ޏ��𗠐؂��āA����҂�";
		mes "�������Ă��܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ޏ��͂��̗��؂��";
		mes "�ς��邱�Ƃ��ł����A";
		mes "�₽����ɂ��̐g�𓊂����B";
		mes "�����Ĕޏ����������n�����j��";
		mes "���Q�𐾂�����ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�j�ɂ͓��ʂȋZ�p��";
		mes "���������܂����B";
		mes "���̋Z�p�́A�ǂ̊�Ƃ�";
		mes "�ؖ]���Ă����Z�p�ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�j�͂��̋Z�p����Ƃɔ���A";
		mes "��Ƃ͂��̑㉿�Ƃ���";
		mes "�j�̕��Q����`�����̂ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���؂����j�̓W�F�[���Y�B";
		mes "���ȏ����̓G���V�A�B";
		mes "�����āc�c";
		mes "�n�����j�̓L���E�n�C���c�c";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�N�b�N�b�N�b�c�c";
		mes "�n�b�n�b�n�b�n�b�n�b�n�I";
		mes "�������z���͂ł͂Ȃ����B";
		mes "^0000FF�G���V�A^000000�Ƃ��̏�����";
		mes "���O�������A�����e�p�Ƃ���������";
		mes "����Șb���l�����̂��H";
		next;
		mes "[�L���E�n�C��]";
		mes "������������A�����̂�";
		mes "�������̏����������̂����m��Ȃ��B";
		mes "����ŁA���ӎ��̓���";
		mes "^0000FF�G���V�A^000000�����̏������������";
		mes "���グ���̂�������Ȃ��ȁB";
		next;
		mes "[�L���E�n�C��]";
		mes "�������A�������̏������������H";
		mes "����͌N�̖ϑz�ɉ߂��Ȃ��B";
		mes "���̏����Ǝ��������ꏊ��";
		mes "�߂����Ă����Ƃ����؋���";
		mes "��̂ǂ��ɂ���̂��ˁH";
		next;
		menu "�����Ō������ё����������",-;
		cutin "kh_kyel02",2;
		mes "[�L���E�n�C��]";
		mes "��!?�c�c�����!?";
		mes "�c�c�c�c�ǂ��ł�����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�L���E�n�C������B";
		mes "����͂��Ȃ��̏ё���B";
		mes "���̔��������Ă����炩�ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u^0000FF�G���V�A^000000�v�̎��̂�������";
		mes "���t���񂪋����Ă���܂����B";
		mes "�ޏ��̎w�ւ����ɗ����j��";
		mes "�Z��ł����ƁB";
		mes "�����Ō������ё���ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��͂��̏������͂߂Ă����w�ւ�";
		mes "�����ȏ�́A���肦�Ȃ��قǂ̑喇��";
		mes "�����Ĕ�������������ł��ˁB";
		mes "����Ȃ��ƁA�ޏ���m��Ȃ��l��";
		mes "�ł��鎖�Ȃ̂ł��傤���H";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		mes "�����悭���ׂ��ȁc�c�c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�������B";
		mes "�@�B�l�`^0000FF�G���V�A^000000��";
		mes "����^0000FF�G���V�A^000000�����f����";
		mes "����Ă���B";
		mes "�ޏ��������Ă��邩��c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�������A�����W�F�[���Y��";
		mes "�ǂ����񂾂̂͌N�̍��o���B";
		mes "���͂����̋@�B�H�w�҂��B";
		mes "���̎��ɋ����͂Ȃ��B";
		next;
		mes "[�L���E�n�C��]";
		mes "�ނ𑞂񂾂͎̂�������";
		mes "����͎Ⴉ�������̎����B";
		mes "����ɁA���ɂ̓��V�~�G���Ƃ̂悤��";
		mes "�R���������ƌn��ׂ�����";
		mes "�͎͂����Ă��Ȃ��B";
		next;
		cutin "kh_kyel02",2;
		mes "-�m���ȏ؋����K�v�݂�����-";
		next;
		menu "���V�~�G���Ƃ̏ё���",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "�{���ɂ����Ȃ̂ł��傤���H";
		mes "��������Ă��������B";
		mes "���̏ё���̓��V�~�G���Ƃ̔p����";
		mes "���������ł��B";
		mes "���炭�A���V�~�G���Ɓc�c";
		mes "�����A�������̓W�F�[���Y�̉Ƒ��ł��B";
		next;
		mes "-^FF0000�L���E�n�C��^000000��";
		mes "�ё����������ƌ���-";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�c�c���ꂪ�ǂ������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "^FF0000�L���E�n�C��^000000����B";
		mes "���Ȃ��������Ă���������v�c�c";
		mes "�����Â����ł��ˁB";
		mes "���̏ё���̒��ɓ����悤��";
		mes "��������݂����ł����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����Ă��Ȃ������̉������v��";
		mes "�����Ă���̂ł����H";
		next;
		cutin "kh_kyel02",2;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-����͌������݂������I-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�m���ɁA���Ȃ��Ƀ��V�~�G���Ƃ�";
		mes "�ǂ����ޗ͖͂�����������Ȃ��c�c";
		mes "�ł����I";
		mes "���Ȃ��̎x���҂ł���";
		mes "���b�P���x���Ȃ�A���̒��x�̎�";
		mes "�ȒP�ɂł��Ă��܂��̂ł�!?";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�c�c���ł͂Ȃ����B";
		mes "�����A���̒ʂ�B";
		mes "����������ǂ����񂾁c�c";
		mes "�������I�@�c�c�����I";
		mes "����͗��؂��A�S�Ăɐ�]����";
		mes "^0000FF�G���V�A^000000�̂��߂��I";
		next;
		mes "[�L���E�n�C��]";
		mes "�W�F�[���Y���ޏ���";
		mes "���؂�Ȃ�������c�c";
		mes "�ޏ��ƍK���ɕ�炵����c�c";
		mes "�ޏ������E���Ȃ�������c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�ӂ�I";
		mes "����ȓz�͒n���ɗ�����΂����I";
		mes "���̕��Q�̂ǂ��������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ޏ��͎��E�����̂ł͂���܂���B";
		mes "������c�c";
		mes "���Ȃ��̕��Q�͊Ԉ���Ă��܂��I";
		next;
		mes "[�L���E�n�C��]";
		mes "������!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c��������Ă��������B";
		next;
		menu "�W�F�[���Y�̃�����������",-;
		mes "[�L���E�n�C��]";
		mes "�c�c����Ȏ��������I";
		mes "����Ȏ��؂��ŁA";
		mes "�W�F�[���Y���ޏ���";
		mes "���؂�Ȃ������Ƃł������̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������B";
		mes "���؂�Ȃ������Ƃ����b��";
		mes "���Ă���̂ł͂���܂���B";
		mes "���͎��ɏ����ꂽ���t�ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���؂�ɂ́A�W�F�[���Y�͔ޏ���";
		mes "�ꏏ�ɓ����o���Ə����Ă���܂��B";
		mes "�����30�N�O��8��20���c�c";
		mes "�����āA�ޏ��̎��̂��������ꂽ����";
		mes "8��20���ł��B";
		mes "�ς��Ⴀ��܂��񂩁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "8��20���̒��ɁA�ޏ��̎��̂�";
		mes "���������Ƃ����͎̂����B";
		mes "�܂�A�ޏ���8��19���̖��";
		mes "���񂾂Ƃ������ɂȂ�܂��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����Ĕޏ���";
		mes "������j���ꏏ�ɓ�����Ƃ�����";
		mes "���̑O���̖�ɁA�₽�����";
		mes "��т��܂Ȃ���΂Ȃ�Ȃ���ł����H";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c���̒j��M���邱�Ƃ�";
		mes "�ł��Ȃ������̂��낤�B";
		mes "�c�c�����c�c���ꂾ�����B";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�������B";
		mes "�ޏ��͂���ȗ��R��";
		mes "��ɔ�э��ނ͂�������܂���B";
		mes "���̎莆�ɉR������Ƃ�";
		mes "�v���܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���炭�c�c";
		mes "�O���A���Ȃ킿8��19����";
		mes "�ޏ�����֗������R�́A";
		mes "���Ȃ����ޏ����Ă񂾂���ł��B";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�b!?�c�c";
		mes "�ӂ�����̂���T�ɂ��Ȃ����I";
		mes "�������̓��ޏ����Ă񂾂Ƃ����؋���";
		mes "�ǂ��ɂ���Ƃ����̂�!!";
		next;
		menu "K.H�̃��b�Z�[�W",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "�؋��Ȃ炱���ɂ���܂��B";
		mes "���̎莆�ɂ�8��19���̖�A";
		mes "�ޏ��Ə��߂ĉ�����ꏊ�ő҂Ƃ���";
		mes "���e��������Ă��܂��B";
		mes "�������c�c�삾������ł��傤�ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ɏg���Ă���C�j�V����K.H�A";
		mes "���Ȃ��̏ё���ɏ����Ă����̂�";
		mes "�����C�j�V�����ł��B";
		mes "�c�c�c�c";
		mes "��́A���Ȃ��Ɣޏ��̊Ԃ�";
		mes "������������ł����H";
		next;
		cutin "kh_kyel02",2;
		mes "[�L���E�n�C��]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�t�c�c�n�n�n�c�c";
		mes "�����c�c���̔Ӂc�c";
		mes "�c�c�c�c";
		next;
		cutin "kh_kyel01",2;
		mes "[�L���E�n�C��]";
		mes "���̔ӁA�ޏ���";
		mes "��ӂɗ��Ă��ꂽ�B";
		mes "���͂���Ȕޏ���";
		mes "���؂�҂̃W�F�[���Y��Y���";
		mes "���ƈꏏ�ɕ�炻���ƌ������B";
		next;
		mes "[�L���E�n�C��]";
		mes "�Ƃ��낪�A�ޏ��̓W�F�[���Y��";
		mes "�����𗠐؂�Ȃ��������A������";
		mes "�ꏏ�ɓ�����������";
		mes "�񑩂����ƌ������񂾁B";
		next;
		mes "[�L���E�n�C��]";
		mes "���̌��t�𕷂�������";
		mes "���̋C�������킩�邩�H";
		mes "�t�t�c�c�{���ɔߎS�������B";
		next;
		mes "[�L���E�n�C��]";
		mes "����Ȏ��A�ޏ������Ă���";
		mes "�w�ւ������u�ԁc�c";
		mes "�c�c�������ȁc�c�s����̖���";
		mes "�{�肪���������Ƃł������ׂ����c�c";
		mes "���́A�ޏ�����w�ւ�D����";
		mes "��ɓ����̂Ă悤�Ƃ����B";
		next;
		mes "[�L���E�n�C��]";
		mes "�ޏ��͂���Ȏ�����";
		mes "�w�ւ����߂����Ƃ����̂��낤�B";
		mes "�ޏ��炵���A��X������R�������c�c";
		mes "�������A�������������\�J��";
		mes "�Ƃ��Ȃ��Ă����n�ʂ��c�c";
		mes "�c�c�c�c�c�c";
		next;
		menu "�c�c�c�c�c�c",-;
		mes "[�L���E�n�C��]";
		mes "�N�c�c�N�b�N�c�c";
		mes "�n�[�b�n�b�n�b�n�I";
		mes "�c�c�c�c�N�N�N�c�c";
		mes "�c�c�n�n�c�c";
		mes "�c�c�c�c�c�c";
		delitem 7499,1;
		delitem 7500,1;
		delitem 7501,1;
		delitem 7502,1;
		delitem 7503,1;
		set KH_QUE,35;
		break;
	case 35:
		mes "[�L���E�n�C��]";
		mes "�c�c�����c�c";
		mes "�ޏ��̎��̂����������B";
		mes "���̎w�ւ͈������܂܂������B";
		mes "�c�c�n�n�c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�����l���Ă����̂��A";
		mes "���͂��̎w�ւ𔃂���邽�߁A";
		mes "������S�ċ��t�Ɏx�������B";
		mes "�����āc�c";
		mes "���ꂽ�W���m�[���������B";
		next;
		mes "[�L���E�n�C��]";
		mes "�W���m�[����������A";
		mes "������������Q���Ȃ���l�����B";
		mes "�Ȃ���������Ȗڂɂ������̂��B";
		mes "�Ȃ��I�@�ǂ����āI";
		mes "�c�c�S�āc�c�S�Ă��̒j�c�c";
		mes "�W�F�[���Y�������I";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "��΂ɋ������Ƃ��ł��Ȃ������B";
		mes "���ɂ͖����A����Ƃ����镨��";
		mes "�����Ă���Ƃ����̂ɁA";
		mes "^0000FF�G���V�A^000000�܂Ŏ�ɂ��悤�Ƃ���";
		mes "���̋��������c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�z�������镨�����������A";
		mes "�ǂꂾ���X���Ȃ�̂��A";
		mes "����^0000FF�G���V�A^000000��";
		mes "�����Ă�肽�������I";
		next;
		mes "[�L���E�n�C��]";
		mes "����Łc�c";
		mes "��1����̋@�B�l�`�c�c";
		mes "^0000FF�G���V�A^000000�̐݌v�}��������";
		mes "���b�P���x���ɍs�����B";
		next;
		mes "[�L���E�n�C��]";
		mes "���b�P���x���͎����]�ޕ��A";
		mes "�S�Ă�񋟂��Ă��ꂽ�B";
		mes "���A���́A�l���c�c";
		mes "�����ă��V�~�G���Ƃ�ׂ�";
		mes "���@�܂łȁc�c";
		next;
		mes "[�L���E�n�C��]";
		mes "���������Ƃ͂킩���Ă����B";
		mes "�Ď��A�ÎE�A�X�p�C�c�c";
		mes "�����؂邩���m��Ȃ��l�Ԃ�";
		mes "���̎���ɑ�R���ꂽ�B";
		next;
		mes "[�L���E�n�C��]";
		mes "�t�t�b�c�c�����܂Œ��ׂ�ꂽ";
		mes "�N�̌��ɂ��N������悤���ȁB";
		mes "������͉���]��ł���̂��ˁH";
		mes "���̖����H";
		mes "����Ƃ��@�B�l�`�̐݌v�}�H";
		mes "���̂ǂ�������ˁH�@�n�n�n�b";
		next;
		menu "�ނ�́c�c",-;
		cutin "kh_kyel01",2;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��ƃ��b�P���x���̊֌W�B";
		mes "�����āA^0000FF�L�G��^000000�ɂ��Ă�";
		mes "����]��ł��܂��B";
		next;
		mes "[�L���E�n�C��]";
		mes "^0000FF�L�G��^000000���c�c";
		mes "�N�ɂ͌��������Ă���̂���H";
		mes "�����̐��̂ɂ��āc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��͂�c�c�@�B�l�`�ł����H";
		mes "��2����́c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�������B";
		mes "^0000FF�L�G��^000000�͈��k���@�X�N���[����";
		mes "�ŏ��Ɏg�p������2����̋@�B�l�`���B";
		mes "�����̎��s�ƊԈႢ������������";
		mes "�B��̑�2����c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�����炱���A";
		mes "���͂����Ɉ������������B";
		mes "����^0000FF�G���V�A^000000�̖������A";
		mes "^0000FF�L�G��^000000�Ɩ��Â��Ă�����B";
		next;
		mes "[�L���E�n�C��]";
		mes "�����āA���ł͑�3����̋@�B�l�`��";
		mes "�C��������̋Z�p���������B";
		mes "�������c�c";
		mes "���͗ǂ��l�Ԃ𐶂ݏo�����Ƃ�";
		mes "�ł��Ȃ������悤���B";
		mes "�����A�ǂ���p�҂Ȃ������c�c";
		next;
		menu "�c�c�c�c�c�c",-;
		mes "[�L���E�n�C��]";
		mes "����^0000FF�L�G��^000000�̓V�˓I�Ȋw�K�\�́A";
		mes "�����́A����̕s���肳���뜜�����B";
		next;
		mes "[�L���E�n�C��]";
		mes "�����ŁA��3����ɂ͐l�Ԃƍ�������";
		mes "�ؗ͂Ɗw�K�\�͂�t�^���A";
		mes "�W�c������ʂ��Đl�Ԃ̊����";
		mes "�w�Ԃ悤�ɂ����B";
		next;
		mes "[�L���E�n�C��]";
		mes "�Ƃ��낪�A^0000FF�L�G��^000000����������";
		mes "��3����̐l�`�����́A";
		mes "���̃R���g���[����";
		mes "���S�ɖ������Ă���B";
		next;
		mes "[�L���E�n�C��]";
		mes "^0000FF�L�G��^000000������������@�B�l�`�B";
		mes "�l�Ԃ̎p�������E�l����B";
		mes "�����A�N���������邱�Ƃ��ł��Ȃ�";
		mes "�l�Ԃ̎p�������c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�����X�^�[�Ɏ��Ă���\�͂𓋍ځA";
		mes "�@�B�ƗZ�����ꂽ�q���B�c�c";
		mes "����̓��b�P���x��������";
		mes "�l�Ԃ̐��̎����̂悤���c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�l���Č���Ƃ����B";
		mes "�l�Ԃ��l�Ԃ̑�����";
		mes "�F�߂Ȃ����E���c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "���������΁c�c�N��";
		mes "�����v���o�������Ȃ��ߋ��ɐG�ꂽ�ȁB";
		mes "�����A�N�͎��̑����𓥂݂ɂ������B";
		mes "���͂��������āA";
		mes "�ƂĂ��{���Ă���̂���B";
		next;
		mes "[�L���E�n�C��]";
		mes "�c�c�N�����̖]�݂�";
		mes "�������������A";
		mes "�����Ă���Ă��������낤�B";
		next;
		menu "�]�݁H",-;
		mes "[�L���E�n�C��]";
		mes "�������c�c";
		mes "�N�ɒ����𗊂񂾎҂�����";
		mes "�ړI�Ƃ����ς��Ȃ������낤�B";
		next;
		menu "????",-;
		mes "[�L���E�n�C��]";
		mes "�c�c^0000FF�L�G��^000000���~�߂Ă���B";
		mes "����ȏ㎄��������q��������";
		mes "�󂳂��̂͌������Ȃ��B";
		next;
		menu "��������",-,"���݂��󂯓����",-,"���Ȃ���",-;
		mes "[�L���E�n�C��]";
		mes "���肪�Ƃ��B";
		mes "^0000FF�L�G��^000000�͂��̓@��̒n���ɂ���B";
		next;
		mes "[�L���E�n�C��]";
		mes "�������c�c��2����̋@�B�l�`��";
		mes "�J�������ꏊ�B";
		mes "���̓L�G���ɉ�������A���ł���";
		mes "���ɍs�����͂ł��Ȃ��Ȃ����B";
		next;
		mes "[�L���E�n�C��]";
		mes "��������A������T���o���Ă���B";
		mes "�����āA�����̐S������";
		mes "���镨�����o���Ă���񂾁B";
		mes "����ł����̖\���͎~�܂�B";
		next;
		menu "���镨�H",-;
		mes "[�L���E�n�C��]";
		mes "^0000FF�G���V�A^000000�̎w�ցc�c";
		mes "�S�Ă̎n�܂�ƂȂ������B";
		mes "���͂����̐S�������Ȃ���A";
		mes "�W�F�[���Y�ւ̍��݂Ǝ��̎v����";
		mes "�Y��Ȃ����߂ɁA�����̐S����";
		mes "���̎w�ւ𖄂ߍ��񂾁B";
		next;
		mes "[�L���E�n�C��]";
		mes "���ʂ̕���ł������~�߂�̂�";
		mes "�܂��s�\���B";
		mes "��2����̃{�f�B�[�̓��͂�";
		mes "�~�߂�悤�ɂ���@�B���g���B";
		next;
		cutin "kh_kyel03",2;
		mes "[�L���E�n�C��]";
		mes "�����^0000FF�L�G��^000000�̑̂�";
		mes "�ڐG������΁A�����͂��΂炭�̊�";
		mes "�����ɓ����Ȃ��Ȃ�B";
		mes "���̊ԂɁA�����̋����J����";
		mes "�w�ւ𔲂��o���񂾁B";
		mes "�c�c���񂾂��B";
		getitem 7504,1;
		set KH_QUE,36;
		next;
		mes "[�L���E�n�C��]";
		mes "�������ł�����";
		mes "^0000FF�L�G��^000000�̕����܂ő��낤�B";
		break;
	default:
		if(KH_QUE < 36 || KH_QUE > 54) {
			mes "[�L���E�n�C��]";
			mes "�c�c�c�c";
			break;
		}
		mes "[�L���E�n�C��]";
		mes "�����͂ł����̂��ˁH";
		next;
		if(select("�͂�","������")==2) {
			mes "[�L���E�n�C��]";
			mes "�������������炫���܂��B";
			break;
		}
		mes "[�L���E�n�C��]";
		mes "�c�c���񂾂��B";
		close2;
		cutin "kh_kyel01",255;
		enablenpc "�L�G���̕�������#kiel";
		initnpctimer;
		end;
	case 54:
		mes "[�L���E�n�C��]";
		mes "�������c�c";
		mes "^0000FF�L�G��^000000�͂ǂ������H";
		next;
		mes "-^FF0000�L���E�n�C��^000000�ɁA";
		mes "���܂ł̎���b����-";
		mes "^FF0000�L���E�n�C��^000000�͒��ɂȊ�����Ă���-";
		next;
		mes "[�L���E�n�C��]";
		mes "�������c�c���ɑ�4������c�c";
		mes "������܂łɂ����̔\�͂́c�c";
		next;
		mes "[�L���E�n�C��]";
		mes "�Ƃ肠�����A����������B";
		mes strcharinfo(0)+ "�N�c�c";
		mes "���肪�Ƃ��B";
		next;
		mes "[�L���E�n�C��]";
		mes "���������Ƃ��Ă͂����Ȃ��ȁB";
		mes "���������ɒ��킷��Ƃ����Ȃ�";
		mes "�������ӂ�s�����Ă�����";
		mes "�j��ł��Ȃ���΂Ȃ�Ȃ��B";
		next;
		mes "[�L���E�n�C��]";
		mes "�悩�����炱����󂯎���Ă���B";
		mes "���̊��ӂ̋C�������B";
		next;
		mes "[�L���E�n�C��]";
		mes "�����āA�p�m�炸�ł͂��邪�A";
		mes "����݂�����B";
		mes "���͍H��Ɋċւ���Ă������A";
		mes "^0000FF�L�G��^000000�̂悤�Ȏp������";
		mes "�@�B�l�`���������Ƃ�����B";
		next;
		mes "[�L���E�n�C��]";
		mes "���̎���^0000FF�L�G��^000000���C�܂���ō����";
		mes "�����̃R�s�[���Ǝv�������c�c";
		mes "�N�̘b�𕷂��ƁA����͂ǂ����";
		mes "��4����̎���i�̂悤���B";
		next;
		mes "[�L���E�n�C��]";
		mes "�H��̐[�w���܂œ��邱�Ƃ��ł���";
		mes "�J�[�h�L�[�������悤�B";
		mes "�N�ɂ͍H��𒲍����Ă��炢�����B";
		mes "���͕��ꂽ^0000FF�L�G��^000000�̕�����";
		mes "�ǂ��ɂ����Ē��ׂĂ݂�B";
		next;
		mes "[�L���E�n�C��]";
		mes "�\���ɋC�������܂��B";
		delitem 7508,1;
		getitem 7509,1;
		getitem 616,1;
		if(checkre())
			getexp 100000,0;
		else
			getexp 1300000,0;
		set KH_QUE,55;
		break;
	}
	close2;
	cutin "kh_kyel01",255;
	end;
OnTimer30000:
	stopnpctimer;
	disablenpc "�L�G���̕�������#kiel";
	end;
}

kh_mansion,18,30,4	script	�G���V�A	894,{
	cutin "kh_ellisia",2;
	switch(KH_QUE) {
	case 24:
		mes "[�G���V�A]";
		mes "�悤���������ł��������܂����B";
		mes strcharinfo(0)+ "�l�A";
		mes "^FF0000�L���E�n�C��^000000�l����";
		mes "���b���������܂��B";
		break;
	case 25:
	case 26:
		mes "[�G���V�A]";
		mes "�@�B�l�`�Ɋւ��������";
		mes "�K�v�ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�G���V�A]";
			mes "��������΂��\���t�����������B";
			break;
		}
		mes "[�G���V�A]";
		mes "�@�B�l�`�Ƃ́A���Ȃ�������";
		mes "�l�`���Ӗ����Ă��܂��B";
		mes "�ߋ��A�����̌��҂������������A";
		mes "�J��Ԃ����s���Ă����@�B�H�w��";
		mes "�ō��i�ł��B";
		next;
		mes "[�G���V�A]";
		mes "���̃}�X�^�[�ł���^FF0000�L���E�n�C��^000000�l��";
		mes "20�΂��猤�����n�߂Ă��܂��B";
		mes "���݁A�@�B�l�`��3��ނ���A";
		mes "���ꂼ����1����A��2����A��3����";
		mes "�̋@�B�l�`�Ƌ�ʂ���Ă��܂��B";
		next;
		switch(select("��1����H","��2����H","��3����H")) {
		case 1:
			mes "[�G���V�A]";
			mes "���̎��u^0000FF�G���V�A^000000�v��";
			mes "^FF0000�L���E�n�C��^000000�l�����ꂽ";
			mes "��1����̋@�B�l�`�ł��B";
			next;
			mes "[�G���V�A]";
			mes "�����@�B���i�ɐl�H�S�������A";
			mes "�Ȋw�I�ɍ��ꂽ�l�H���������Ă܂��B";
			next;
			mes "[�G���V�A]";
			mes "���]�ɂ͖��@�X�N���[�������p����";
			mes "�u�L���X�N���[���v��g�ݍ���";
			mes "���`�@�B���]���g�p���Ă��܂��B";
			next;
			mes "[�G���V�A]";
			mes "�@�B���i���g�p���Ă��邽�߁A";
			mes "�d�ʂ��傫���Ȃ�B";
			mes "�܂��A����I�ȃX�N���[���e�ʂȂ��߁A";
			mes "���G�Ȋw�K���ł����A";
			mes "�l�ԓI�Ȋ���\�����s�\�Ƃ���";
			mes "��̌��_������܂��B";
			break;
		case 2:
			mes "[�G���V�A]";
			mes "��1���㓯�l�ɁA";
			mes "^FF0000�L���E�n�C��^000000�l�����ꂽ";
			mes "�@�B�l�`�ł��B";
			next;
			mes "[�G���V�A]";
			mes "��2����̋@�B�l�`��";
			mes "�Z�[�W�̃X�N���[���쐬�A";
			mes "�A���P�~�X�g�̃z�����N���X����";
			mes "�������p�����V�����@�B�l�`�ł��B";
			next;
			mes "[�G���V�A]";
			mes "��1���㓯�l�ɋ@�B���i��";
			mes "�l�H�S���𓮗͌��Ƃ��Ă��܂����A";
			mes "�z�����N���X���@�𗘗p����";
			mes "�l�H�{�f�B�[������Ă��܂��B";
			next;
			mes "[�G���V�A]";
			mes "�܂��A�u�L���X�N���[���v��";
			mes "10���{�ȏ�̗e�ʂƌ�������������";
			mes "�u���k�L���X�N���[���v�ɂ���āA";
			mes "���l�Ԃɋ߂��w�K���\�ł��B";
			next;
			mes "[�G���V�A]";
			mes "�������A���k�L���X�N���[����";
			mes "�s��������A�l�Ԍ^�{�f�B�[��";
			mes "�@�B���i�̊ԂɓK�����Ƃꂸ�A";
			mes "6�N���x�ŋ@�\���~���Ă��܂��܂��B";
			break;
		case 3:
			mes "[�G���V�A]";
			mes "��2����̋@�B�l�`�ƈႢ�A";
			mes "��3�����";
			mes "^FF0000�L���E�n�C��^000000�l�̑��q�ł���";
			mes "^0000FF�L�G��^000000�l���݌v���ꂽ���ł��B";
			next;
			mes "[�G���V�A]";
			mes "�@�B���i���g��Ȃ�";
			mes "�����ȃz�����N���X�̃{�f�B�[�B";
			mes "�[�����~���̐S���̌��Ђ���������";
			mes "�l�H�S���𓮗͌��Ƃ��Ă��邽�߁A";
			mes "�l�Ԃ̂悤�Ȑ��̋@�\�������Ƃ�";
			mes "�\�ƂȂ�܂����B";
			next;
			mes "[�G���V�A]";
			mes "�L���X�N���[���́A";
			mes "��2����Ɏg��ꂽ";
			mes "�u���k�L���X�N���[���v��";
			mes "�������������g�p���Ă���܂��B";
			next;
			mes "[�G���V�A]";
			mes "��2����̃X�N���[�����";
			mes "���\�͗����܂����A���萫�͏オ��";
			mes "���Y�R�X�g��}����";
			mes "�ʎY�^�u���k�X�N���[���v�ł��B";
			next;
			mes "[�G���V�A]";
			mes "���Ȃ���������u^FF0000�G���[^000000�v��";
			mes "��3����̃v���g�^�C�v�ł��B";
			mes "���݂͍H��ő�ʔ̔��̂��߁A";
			mes "�ʎY�^�@�B�l�`�V���[�Y��";
			mes "���Y���I������Ԃł��B";
			next;
			mes "[�G���V�A]";
			mes "�V�������������w�K���@�Ƃ��āA";
			mes "�w�@�Ƃ�����ŋ����������o�����A";
			mes "�œK���̃e�X�g���s���Ă��܂��B";
			break;
		}
		break;
	default:
		mes "[�G���V�A]";
		mes "�c�c�c�c�c�c";
		break;
	}
	close2;
	cutin "kh_ellisia",255;
	end;
}

lighthalzen,188,200,0	script	�@��O	139,3,1,{
OnTouch:
	if(KH_QUE != 26 && KH_QUE != 27)
		end;
	mes "-�@����o���u�ԁA";
	mes "���ɏՌ����󂯂�";
	mes "�ӎ���������-";
	close2;
	heal -Hp+1,0;
	warp "kh_mansion",30,75;
	end;
}

kh_mansion,25,79,4	script	��̂��鏗	727,3,3,{
L_Start:
	switch(KH_QUE) {
	case 26:
		mes "-�c�c�c�c�c�c-";
		mes "-���Ɍy���ɂ݂�����-";
		mes "-�ӎ����n�b�L������ƁA";
		mes "�ڂ̑O�Ɉ�l�̏����������Ă���-";
		next;
		mes "[??????]";
		mes "�t�t�A���ڊo�߂ɂȂ�܂������H";
		mes "�ӊO�Ɗ��Ȃ�ł��ˁB";
		mes "������ƌ����āA";
		mes "�\��Ȃ��ł��������B";
		next;
		mes "[??????]";
		mes "�łȂ��ƁA���Ȃ��̈��S��";
		mes "�ۏ�ł��Ȃ��Ȃ�܂��B";
		mes "���̏󋵂͗����ł��Ă��܂����H";
		mes "���̓V���o���c�o���h���";
		mes "�����̎҂ł��B";
		next;
		mes "[??????]";
		mes "�ŋ߁A�u���b�P���x���v��";
		mes "�u�L���E�n�C����Ɓv�̊Ԃ�";
		mes "��������������悤�Ȃ̂ŁA";
		mes "�����̒��������̂ł��B";
		next;
		mes "[??????]";
		mes "���̂��߁A�L���E�n�C���̓@���";
		mes "�Ď����Ă������A";
		mes "���Ȃ���^FF0000�L���E�n�C��^000000�ƒP�Ƃ�";
		mes "�b���Ă���Ƃ̕񍐂��󂯂܂����B";
		mes "�����ŁA���X�����ȕ��@�ł������A";
		mes "���Ȃ��������֘A��ė��܂����B";
		next;
		mes "[??????]";
		mes "�c�c�����������͎̂Ӎ߂��܂��B";
		mes "�ł����c�c";
		mes "���Ȃ���^FF0000�L���E�n�C��^000000��";
		mes "�ǂ�Ȋ֌W�Ȃ̂ł����H";
		next;
		if(select("���܂ł̎���b��","�킩��Ȃ�")==1) {
			mes "-���Ȃ��́A���܂łɂ���������";
			mes "�����ɔޏ��ɘb����-";
			mes "-^FF0000�G���[^000000�̘b�����鎞�A";
			mes "�ӂƎ����̐������񂾂��";
			mes "�����Ȃ��Ă����̂ɋC�Â���-";
			mes "�c�c�c�c";
			mes "�c�c";
			next;
			mes "[??????]";
			mes "����c�c�����c�c";
			mes "�ޏ��͎c�O��������ˁc�c";
			next;
			mes "[??????]";
			mes "�ޏ��̂悤�ȋ]���҂𑝂₳�Ȃ����߁A";
			mes "���̎������������邽�߁A";
			mes "���Ȃ�������������`���Ă��ꂽ��";
			mes "�ƂĂ�������񂾂��ǁc�c";
			mes "�ǂ�������H";
		}
		else {
			mes "[??????]";
			mes "�{���ɂ킩��Ȃ��́H";
			mes "^FF0000�L���E�n�C��^000000�ƒP�Ƃŉ��l�Ȃ��";
			mes "���������͂Ȃ��̂�H";
			mes "���Ȃ��ɖ��f�͂����Ȃ�����A";
			mes "�m���Ă��邱�Ƃ�b���āB";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c�c�c";
			next;
			mes "[??????]";
			mes "���Ȃ����ق��Ă��������";
			mes "��������Ȃ��Ȃ�́B";
			mes "���Ȃ��̏����������";
			mes "�d���������I���̂�B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c�c�c";
			next;
			mes "[??????]";
			mes "�����c�c���傤���Ȃ���ˁc�c";
			mes "����Ȃ�A�������̕������";
			mes "����񋟂����B";
			mes "������A���Ȃ����m���Ă������";
			mes "���Ԃ�Ƃ��Ď������ɒ񋟂��āB";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���H";
			mes "���́c�c�������!?";
			next;
			mes "[??????]";
			mes "����ȓ���l���Ȃ��Ă�����B";
			mes "���݂��ɒm���Ă�����";
			mes "�����ɂȂ邾���B";
			mes "����A���������m���Ă����񂩂�";
			mes "�b����ˁB";
			next;
			mes "[??????]";
			mes "�c�c�c�c";
			mes "^FF0000�L���E�n�C��^000000�͂�����";
			mes "�����@�B�𐶎Y�̔�����";
			mes "�u�L���E�n�C���v��Ƃ̉��B";
			next;
			mes "[??????]";
			mes "����Ȕނ��A";
			mes "���߂̓A�C���u���b�N��";
			mes "�����ȍH����J���Ă����B";
			mes "�������A��������b�P���x����";
			mes "�L���E�n�C���ƐڐG�����B";
			mes "���̎q��Ђ̂悤�ȊT�O��B";
			next;
			mes "[??????]";
			mes "���͂������~�\�B";
			mes "�d�v�J���҂��������Ȃ��Ȃ������߁A";
			mes "�����̃��b�P���x���ő厖�Ƃ�����";
			mes "�K�[�f�B�A���̏C����";
			mes "�u^FF0000�L���E�n�C��^000000�v��";
			mes "�C����悤�ɂȂ����́B";
			next;
			mes "[??????]";
			mes "�����ɁA���R�ȊO��";
			mes "�����ʂ̗v��������������";
			mes "�킩���Ă��Ȃ���B";
			next;
			mes "[??????]";
			mes "�Ƃɂ����A";
			mes "�����ŗ\�z�O�̌�p�҂����܂ꂽ�B";
			mes "�ނ̖��́u^0000FF�L�G��^000000�v�B";
			next;
			mes "[??????]";
			mes "�������A�L���E�n�C���͖����B";
			mes "����������ƁA�L���E�n�C���̔鏑";
			mes "^0000FF�G���V�A^000000�Ƃ̎q������";
			mes "�����ł��Ȃ����Ƃ��Ȃ����ǁc�c";
			next;
			mes "[??????]";
			mes "��p�ҁu^0000FF�L�G��^000000�v��";
			mes "�����Ȏp������������B";
			mes "�O���A�̗́A�Z�p�c�c�ǂ���";
			mes "�����Ă��Ȃ��c�c";
			next;
			mes "[??????]";
			mes "�����āA���̂��킩��Ȃ�����";
			mes "�u^0000FF�L�G��^000000�v�͓��˂ɂ��鎖�Ƃ��n�߂��B";
			mes "���Ƃƌ����̂͂����������ǁc�c";
			mes "�����{�݂����˂�";
			mes "���w�@��ݗ������̂�B";
			next;
			mes "[??????]";
			mes "�Љ���ƌ������ĂˁB";
			mes "�����ŁA���{�⑼�̋����֌W�ɂ�����";
			mes "��Ƃ͂��̊w�@��";
			mes "�w���ɋU����������������";
			mes "���������悤�Ƃ����B";
			next;
			mes "[??????]";
			mes "�������A���̑S�Ă����w��";
			mes "���ۂ��ꂽ";
			mes "�ǎ��ɋU���������ށA�D�ꂽ���сc�c";
			mes "����ʂ��Ȃ������B";
			mes "�܂�Łc�c���炩���ߌ��߂�ꂽ";
			mes "�q�������������w�ł��Ȃ��悤�Ɂc�c";
			next;
			mes "[??????]";
			mes "�����Ă�����A";
			mes "���́u^0000FF�L�G��^000000�v��";
			mes "���b�P���x���֌W�҂�֘A��Ƃ�";
			mes "�В��������W�߂�";
			mes "�ɔ�W����s���Ă���́B";
			next;
			mes "[??????]";
			mes "������ɔ�W��Ƃ͂����A";
			mes "����������܂��ȏ��͓��Ă����B";
			mes "���̏W��Łu^0000FF�L�G��^000000�v��";
			mes "�V�����v���W�F�N�g�𔭕\�����B";
			next;
			mes "[??????]";
			mes "���ꂪ�@�B�l�`�B";
			mes "�K�[�f�B�A���ƈႢ�A";
			mes "���Ȃ������čs���ł���@�B�l�`�B";
			next;
			mes "[??????]";
			mes "�Ƃ��낪�A�s�v�c�Ȃ��Ƃ�";
			mes "����ȏd�v�ȏW��Ƃ����̂�";
			mes "��ł���u^FF0000�L���E�n�C��^000000�v��";
			mes "�p�������Ȃ������B";
			mes "�ނ̔鏑�ł���u^0000FF�G���V�A^000000�v���ˁB";
			next;
			mes "[??????]";
			mes "���������A���̏W��̐����O����";
			mes "�u^FF0000�L���E�n�C��^000000�v�̍s����";
			mes "�킩��Ȃ������c�c";
			mes "���Ǝv������A���̂܂ɂ��ނ�";
			mes "�@��Ɏp�����킵�Ă���";
			mes "�܂�ŉ������Ȃ������悤�ɂˁB";
			next;
			mes "[??????]";
			mes "����ƁA���x�́u^0000FF�L�G��^000000�v��";
			mes "������������Ɍ����̐Ȃ��O���Ă���B";
			next;
			mes "[??????]";
			mes "�ǂ����Ă��s���R�������B";
			mes "�܂�œ�l������ւ���Ă���݂����B";
			mes "����ɁA�W��̗��łǂ�ȉA�d��";
			mes "����̂����킩��Ȃ����B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�ނ�̔w��ɂ�";
			mes "���b�P���x�������邩��ł��ˁB";
			next;
			mes "[??????]";
			mes "����A�悤�₭�b���C�ɂȂ����H";
			mes "���Ⴀ���낻�날�Ȃ��̔Ԃ�����ˁB";
			mes "�ǂ����A�y�ɘb���Ƃ�����B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���c�c���c�c����Ȃ��肶��c�c";
			mes "�c�c�c�c�c�c";
			mes "-�������A�ޏ��̏���";
			mes "�ƂĂ��M�d������-";
			mes "-�����d���Ȃ��b���n�߂�-";
			mes "�c�c�c�c�c�c";
			next;
			mes "-^FF0000�G���[^000000�ɂł�������-";
			mes "-^0000FF�G���V�A^000000�A^FF0000�L���E�n�C��^000000�ɂ���-";
			mes "-���܂ł̑S�Ă�b����-";
			mes "�c�c�c�c";
			mes "�c�c";
			next;
			mes "[??????]";
			mes "��c�c�c�c";
			mes "��������ˁc�c";
			mes "�@�B�l�`�������܂Łc�c�c�c";
			next;
			mes "[??????]";
			mes "�˂��B";
			mes "���Ȃ�������������`���Ă��ꂽ��";
			mes "�ƂĂ�������񂾂��ǁc�c";
			mes "�ǂ�������H";
		}
		next;
		if(select("��`��","�c�c�c�c")==2) {
			mes "[??????]";
			mes "����ς�c�c������ˁc�c";
			mes "���񂤂�c�c���ق͍m���ˁB";
			mes "�t�t�c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���H";
			mes "���́c�c�������!?";
			next;
			mes "[??????]";
			mes "�����S�z���Ȃ��ł�����B";
			mes "���Ȃ��̈��S�͎��������ۏႷ��B";
			mes "���Ȃ��͂����A�������ɋ��͂���";
			mes "�����������Ă����΂����̂�B";
			next;
			menu "�c�c�킩��܂���",-;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c";
			mes "�킩��܂����B";
			next;
			mes "[??????]";
		}
		else {
			mes "[??????]";
			mes "����A�ӊO�ƕ��킩�肪�����̂ˁB";
		}
		mes "�t�t�c�c";
		mes "���A�܂����ȏЉ�����ĂȂ�������ˁB";
		mes "���̓V���o���c�o���h��񕔏�����";
		mes "�u^0000FF�~�b�`�F���E���C��^000000�v";
		mes "��낵���ˁB";
		set KH_QUE,27;
		close;
	case 27:
		mes "[�~�b�`�F��]";
		mes "����ł́A";
		mes "�������肪������グ���B";
		mes "�W���m�[��30�N���O�A";
		mes "^FF0000�L���E�n�C��^000000�̔鏑�A";
		mes "^0000FF�G���V�A^000000��";
		mes "�����Ƃ�������������́B";
		next;
		mes "[�~�b�`�F��]";
		mes "�������A�ޏ��̘b�ɂ��ƁA";
		mes "^0000FF�G���V�A^000000��30�N�O�Ɏ��E���A";
		mes "����^FF0000�L���E�n�C��^000000�̔鏑�ł���";
		mes "^0000FF�G���V�A^000000��";
		mes "30�N�O�̔ޏ��Ƃ܂���������";
		mes "�p�����Ă���Ƃ̂��ƁB";
		next;
		mes "[�~�b�`�F��]";
		mes "�����ň�̉���B";
		mes "^0000FF�G���V�A^000000�̃��f����";
		mes "�܂��ɔޏ��ł͂Ȃ����Ƃ������B";
		mes "������A���Ȃ��̓W���m�[�ɍs����";
		mes "^0000FF�G���V�A^000000�ɂ��Ē��ׂė~�����́B";
		next;
		mes "[�~�b�`�F��]";
		mes "��񂪂��܂�����A";
		mes "�L���E�n�C���@��ɂ��鎷����";
		mes "�����|����΁A";
		mes "���̏��܂ňē����Ă�����B";
		next;
		mes "[�~�b�`�F��]";
		mes "��������������A��p��s�D��";
		mes "�W���m�[�܂ő����Ă�������B";
		set KH_QUE,28;
		close;
	case 28:
		mes "[�~�b�`�F��]";
		mes "�ǂ��H";
		mes "�����͂ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�~�b�`�F��]";
			mes "�������ł����猾���āB";
			close;
		}
		mes "[�~�b�`�F��]";
		mes "���ꂶ��A���肢�ˁB";
		close2;
		warp "yuno",54,209;
		end;
	case 33:
		mes "[�~�b�`�F��]";
		mes "�����A���A��Ȃ����B";
		mes "����������񂪂������H";
		next;
		mes "-���Ȃ��̓W���m�[�œ�������";
		mes "�ڂ����b����-";
		next;
		mes "[�~�b�`�F��]";
		mes "�����c�c�c�c";
		mes "����ς肠�Ȃ��ɗ���ł悩������B";
		mes "�L�͂ȏ���B";
		mes "�����ŁA�Ō�̂��肢������́B";
		next;
		mes "[�~�b�`�F��]";
		mes "���̘b��^FF0000�L���E�n�C��^000000�ɂ���΁A";
		mes "^0000FF�L�G��^000000�̐��̂�";
		mes "���b�P���x���Ƃ̊֌W��";
		mes "�m�鎖���ł��邩������Ȃ��́B";
		mes "���肢�A�͂�݂��āB";
		next;
		mes "[�~�b�`�F��]";
		mes "���v�B";
		mes "��Ȃ��Ȃ����玄�̃`�[����";
		mes "�t�H���[�ɓ���B";
		mes "�{���ɖ����͂��Ȃ��Ă�������B";
		set KH_QUE,34;
		next;
		warp "kh_mansion",83,50;
		end;
	default:
		mes "[�~�b�`�F��]";
		mes "�͂₭�s���܂��傤�B";
		next;
		warp "kh_mansion",83,50;
		end;
	}
OnTouch:
	if(KH_QUE == 26)
		goto L_Start;
	end;
}

//============================================================
// ���V�~�G���@NPC
//------------------------------------------------------------
yuno,257,140,4	script	���Ȃ��k����	846,{
	if(KH_QUE > 30) {
		mes "[���k����]";
		mes "�����Ȃ������H�@^0000FF�G���V�A^000000�B";
		mes "��H�@�������󂢂Ă�́H";
		mes "���ꂶ�Ⴀ���тɂ��Ȃ��Ƃ˂��c�c";
		close;
	}
	if(KH_QUE != 28) {
		mes "[���k����]";
		mes "�����̎q�͂ǂ��ɍs�����́H";
		mes "�ǂ��c�c�ǂ��Ȃ́H";
		if(countitem(7500) < 1)
			close;
		next;
		menu "���������āc�c",-;
		cutin "kh_ellisia_port",1;
		mes "-���k�����^0000FF�G���V�A^000000��";
		mes "�ё���������Ă݂�-";
		next;
		cutin "kh_ellisia_port",255;
		mes "[���k����]";
		mes "��H";
		mes "�����I";
		mes "�G���[�I�@^0000FF�G���V�A^000000!!";
		mes "���̃G���[��m���Ă���!?";
		mes "�����̎q�͂ǂ��ɂ����!?!";
		next;
		mes "[���k����]";
		mes "�����̎q�c�c�G���[��";
		mes "����A�Ƃ��o�Ă���A���Ă��Ȃ��̂�I";
		mes "�����̎q���ǂ��ɂ��邩�킩������";
		mes "�����Ă��傤�����I";
		next;
		mes "-�c�c���k�����";
		mes "�ё����������u����";
		mes "���C�����߂����悤�����A";
		mes "�܂������ɓƂ茾��";
		mes "�Ԃ₫�n�߂�-";
		close;
	}
	mes "[���k����]";
	mes "�����A���������Ȃ��ŁB";
	mes "����Ȃɋ����ꂽ��";
	mes "����Ȃ�����Ȃ��B";
	mes "�܂����������c�c";
	next;
	mes "[���k����]";
	mes "�ق�A�����~��ŁB";
	mes "�����Ȃ��A�����Ȃ��B";
	mes "����Ȃɋ����Ă���";
	mes "���̒��̋��܂�";
	mes "����Ȃ��Ȃ����Ⴄ���B";
	next;
	if(select("�������Ă����ł����H","�q�����悭�����̂ł����H")==1) {
		mes "[���k����]";
		mes "����H";
		mes "�����c�c�����̎q�������~�܂Ȃ��āA";
		mes "�S�R�Q���Ȃ��̂�B";
		mes "���̎q���Q��Ǝ������S����";
		mes "�d�����ł���̂Ɂc�c";
		next;
		mes "[���k����]";
		mes "�q�����Q�Ȃ�����d�����ł��Ȃ���";
		mes "�������䖳���Ȃ̂�c�c";
		next;
		menu "�q���͂ǂ��ɂ���̂ł����H",-;
		mes "[���k����]";
		mes "��H";
		mes "���I�@�܂������ǂ��s���Ă��́I";
		mes "�ǂꂾ���S�z�������c�c";
		mes "�V�тɍs���Ă΂��肢��񂶂�Ȃ��́I";
		next;
		mes "[���k����]";
		mes "���߂�Ȃ����ˁB";
		mes "���f����������āB";
		mes "�ق�A�͂₭�A���I";
		mes "�܂����������c�c";
	}
	else {
		mes "[���k����]";
		mes "����H�@����c�c";
		mes "�q�����������ċ����Ă˂��B";
		mes "����ȂɊ����Ȃ�";
		mes "�����ɋA���ė���΂����̂ɁB";
		next;
		mes "[���k����]";
		mes "�ǂ����Ă���Ȃɐ����D���Ȃ́c�c";
		mes "�ق�A�G���V�A�B";
		mes "�������ɗ��đ����Q�Ȃ����B";
		next;
		mes "[���k����]";
		mes "�����Q�Ă���Ȃ���";
		mes "�d�����ł��Ȃ�����Ȃ��c�c";
	}
	sc_start SC_CURSE,30000,1;
	set KH_QUE,29;
	close;
}

yuno,250,132,7	script	���΂���	711,{
	if(KH_QUE < 29) {
		mes "[���΂���]";
		mes "�͂��c�c";
		mes "�ŋ߁A�N�̂�����";
		mes "�Ȃ񂾂�����킟�c�c";
		close;
	}
	switch(KH_QUE) {
	case 29:
		mes "[���΂���]";
		mes "��[�c�c";
		mes "�Ȃ񂾂��V�C��������ˁB";
		next;
		if(select("�c�c�c�c","���̂��k����̎��ł�����Ɓc�c")==1) {
			mes "[���΂���]";
			mes "�����N���Ƃ�����˂��c�c";
			mes "�c�c�͂��c�c�c�c";
			close;
		}
		mes "[���΂���]";
		mes "��H�@�����c�c���̐l�H";
		mes "���̐l�Ȃ�悭�m���Ă��B";
		mes "���̗F�B�̂��ꂳ��B";
		mes "�u^0000FF�G���V�A^000000�v�c�c";
		mes "�Ⴂ���Ɏ��񂶂�����́c�c";
		mes "�{���ɗǂ��q�������̂Ɂc�c";
		next;
		mes "[���΂���]";
		mes "���̓��ȗ��A���̂��k�����";
		mes "�V���b�N�ł���ȕ���";
		mes "�Ȃ��Ă��܂����̂�c�c�c�c";
		next;
		menu "^0000FF�G���V�A^000000����́c�c",-;
		mes "[���΂���]";
		mes "^0000FF�G���V�A^000000�́c�c";
		mes "�{���ɂ��ꂢ��������c�c";
		mes "���̎����������炢��B";
		next;
		mes "[���΂���]";
		mes "������A���͂̒j���������";
		mes "�l�C���������́B";
		mes "���ɂ��̃��V�~�G���Ƃ̒��j�A";
		mes "�W�F�[���Y���M�����Ă���B";
		mes "�������b���ƃv���|�[�Y��";
		mes "�����炵���񂾂��ǁc�c";
		next;
		mes "[���΂���]";
		mes "�������^0000FF�G���V�A^000000��";
		mes "���񂾂������A���V�~�G���Ƃ�";
		mes "�j�Y�����́B";
		mes "�c�c�c�c";
		next;
		menu "���V�~�G���H",-;
		mes "[���΂���]";
		mes "�����c�c���V�~�G����";
		mes "�W���m�[�̒��ł��R������Ɩ�B";
		mes "�ł��c�c";
		mes "^0000FF�G���V�A^000000�����񂾌�A";
		mes "���q�̃W�F�[���Y�����Ƃ����s���āA";
		mes "�j�Y�����̂�c�c";
		next;
		mes "[���΂���]";
		mes "���̎��A�@����Ǘ����Ă�������";
		mes "����C����ꂽ�̂�c�c";
		next;
		menu "�@��ɓ��邱�Ƃ͂ł��܂����H",-;
		mes "[���΂���]";
		mes "���[��c�c�{���͂ł��Ȃ����ǁc�c";
		mes "���Ȃ���^0000FF�G���V�A^000000��";
		mes "�m���Ă��邵�A�M���Č���a�����B";
		mes "�s�̖���������O��";
		mes "����Ԃ��Ă��傤�����ˁB";
		getitem 7498,1;
		set KH_QUE,30;
		close;
	case 30:
		if(countitem(7499) < 1 || countitem(7500) < 1 || countitem(7501) < 1 || countitem(7502) < 1) {
			mes "[���΂���]";
			mes "�s���Ȃ瑁���s���āA";
			mes "����Ԃ��ĂˁB";
			close;
		}
		mes "[���΂���]";
		mes "�I������́H";
		mes "�����ɂȂ肻���ȕ���";
		mes "�قƂ�ǂȂ������ł���B";
		mes "�����Ԃ�O�ɑ����̐l��";
		mes "�����čs����������̂�B";
		next;
		menu "^0000FF�G���V�A^000000�͂Ȃ��c�c�H",-;
		mes "[���΂���]";
		mes "�����c�c";
		mes "�O�Ƀ��V�~�G���̒��j�A";
		mes "�W�F�[���Y��^0000FF�G���V�A^000000��";
		mes "������񑩂������Č���Ȃ������H";
		next;
		mes "[���΂���]";
		mes "�ł��A���̓W�F�[���Y�ɂ�";
		mes "�e�����߂�����҂������̂�B";
		mes "����ŁA�W�F�[���Y�͂���";
		mes "����҂ƌ������Ă��܂����̂�B";
		next;
		mes "[���΂���]";
		mes "^0000FF�G���V�A^000000�͐����Ə����Ăˁc�c";
		mes "���E���Ă��܂����̂�c�c";
		next;
		menu "����������Əڂ����c�c",-;
		mes "[���΂���]";
		mes "����Ȃ玄���u�L���E�n�C���w�@�v��";
		mes "��ŕ�炵�Ă��鋙�t�����";
		mes "�����Ă݂�Ƃ�����B";
		mes "���̐l�����^0000FF�G���V�A^000000��";
		mes "���̂��������̂�B";
		mes "���Ƃ͂��̐l�ɕ����Ă݂Ȃ����B";
		delitem 7498,1;
		set KH_QUE,31;
		close;
	default:
		mes "[���΂���]";
		mes "�ӂ��c�c���󕨂��Ȃ��ƁB";
		close;
	}
}

yuno,273,141,0	script	���V�~�G���@����	45,1,1,{
	if(KH_QUE == 30)
		warp "kh_rossi",20,92;
	else
		warp "yuno",270,141;
	end;
}

kh_rossi,23,23,0	script	�e�[�u��	111,{
	if(KH_QUE != 30)
		end;
	if(countitem(7499)) {
		mes "-�ё��悪����������-";
		close;
	}
	cutin "kh_family_port",1;
	mes "-�����悭���ׂ�ƁA";
	mes "�����o�����J���邱�Ƃ��ł���-";
	mes "-�����o���̒��ɂ�";
	mes "�ё��悪�����Ă���-";
	getitem 7499,1;
	close2;
	cutin "kh_family_port",255;
	end;
}

kh_rossi,92,40,0	script	���I	111,{
	if(KH_QUE != 30)
		end;
	if(countitem(7500)) {
		mes "-�����̏ё�����������I��-";
		close;
	}
	mes "-�����|�����������o��������-";
	next;
	if(select("�����g��","�ق����Ă���")==1) {
		if(select("1�ڂ̈����o��","2�ڂ̈����o��")==1) {
			cutin "kh_ellisia_port",2;
			mes "-�����悭���ׂ�ƁA";
			mes "�����o�����J���邱�Ƃ��ł���-";
			mes "-�����o���̒��ɂ�";
			mes "�ё��悪�����Ă���-";
			getitem 7500,1;
			close2;
			cutin "kh_ellisia_port",255;
			end;
		}
	}
	mes "-���ɉ�������-";
	close;
}

kh_rossi,144,286,0	script	��	111,{
	if(KH_QUE != 30)
		end;
	mes "-3�̈����o�����������-";
	next;
	switch(select("1�ڂ̈����o��","2�ڂ̈����o��","3�ڂ̈����o��","�C�ɂ��Ȃ�")) {
	case 1:
		mes "-�����ɂЂ��������ĊJ���Ȃ�-";
		close;
	case 2:
		if(countitem(7501)) {
			mes "-�����o���̒��͋���ۂ�-";
			close;
		}
		mes "-�����o���̒��Ɏ莆��������-";
		next;
		mes "-�uk.h�v�Ƃ����C�j�V�����̐l��";
		mes "^0000FF�G���V�A^000000�ɑ���莆�̂悤��-";
		getitem 7501,1;
		close;
	case 3:
		mes "-�����o���̒��Ɏ莆��������-";
		next;
		mes "-�莆�̓��e�́A�W�F�[���Y��";
		mes "^0000FF�G���V�A^000000�Ƀv���|�[�Y����";
		mes "���̂�����-";
		mes "-^0000FF�G���V�A^000000�̓W�F�[���Y����";
		mes "����w�ւ��󂯂Ƃ����悤��-";
		close;
	case 4:
		mes "�c�c�c�c�c�c";
		close;
	}
}

kh_rossi,148,288,0	script	�{�I	111,{
	if(KH_QUE != 30)
		end;
	if(countitem(7502)) {
		mes "-�ق���̐ς������{������-";
		close;
	}
	mes "-�{�I�ɂ��܂�ꂽ�{�̊Ԃ�";
	mes "�W�F�[���Y�̃��b�Z�[�W��";
	mes "���܂��Ă���̂�������-";
	getitem 7502,1;
	close;
}

yuno_fild12,232,222,6	script	�V�������t	709,{
	if(KH_QUE > 31) {
		mes "[���t]";
		mes "�Ȃ񂾂�Y�ꂽ�̂��H";
		mes "�������Ⴂ�����ɂ�B";
		mes "������x�����Ă�邩��";
		mes "�����Ɗo�����ȁB";
		next;
		mes "[���t]";
		mes "�u^FF0000�k���̕��p^000000�v�ɂ���";
		mes "�u^FF0000�x������c�n^000000�v�̏���";
		mes "�킩�����ȁH";
		close;
	}
	if(KH_QUE < 31) {
		mes "[���t]";
		mes "���[���A�ނ��Ȃ��B";
		mes "�߂����苛�̐�������₪���Ă悧�B";
		close;
	}
	mes "[���t]";
	mes "��H";
	mes "�������O�H";
	mes "�������ɗp���H";
	mes "���݂��Ƃ�����Ȃ牽�������B";
	mes "�����B";
	next;
	mes "[���t]";
	mes "�ӂ��[";
	mes "���������΍ŋ߁A";
	mes "�V�N�Ȃ����݂�H���ĂȂ��ȁ[";
	mes "���[�A���������[";
	if(countitem(544) < 10)
		close;
	next;
	mes "[���t]";
	mes "��H";
	mes "��������ɂ����̂��H";
	mes "�ق�Ƃ��H";
	mes "�ւ��ւ��ցc�c���肪�Ƃ�B";
	mes "�����ƁA�����p������񂾂�H";
	mes "�����Ȃ������ȁB";
	delitem 544,10;
	next;
	menu "30�N�O�ɂ����Łc�c",-;
	mes "[���t]";
	mes "��H�@�����c�c�܂��o���Ă��B";
	mes "30�N�O��8��20���̂��Ƃ���H";
	mes "����͂悭�����Ă���B";
	mes "�������[�̒a�����������B";
	mes "�ւցB";
	next;
	mes "[���t]";
	mes "����ŁA���[�ɉ���";
	mes "���蕨�ł����邩���Ďv����";
	mes "����������Ԃ𓊂��ɗ��Ă��񂾁B";
	next;
	mes "[���t]";
	mes "�Ƃ��낪�A���ɖԂ��d����";
	mes "�u�啨���I�v���Ďv����";
	mes "�����グ�Ă݂���A";
	mes "�Ȃ�ƁA���̎��̂������グ���܂����B";
	next;
	mes "[���t]";
	mes "�����ăW���m�[�x�����ɓ͂�����B";
	mes "�ォ�畷�����񂾂��ǁA���̏���";
	mes "�D���������j�ɗ��؂���";
	mes "���E�����܂����񂾂ƁB";
	mes "�������A�����j��������񂾂��B";
	next;
	mes "[���t]";
	mes "����ŁA���̏��̎��̂��x����";
	mes "���W���m�[�Ɏ����Ă����r���ɁA";
	mes "������ƈ����Ă������̏��̎肩��";
	mes "�������镨���������񂾁B";
	next;
	mes "[���t]";
	mes "�Ƃ��낪�A�x�����̒N��";
	mes "�C�t���₵�Ȃ�������A";
	mes "�x���������Ȃ��Ȃ��Ă���A";
	mes "��������Ƃ����T���Ă݂��񂾁B";
	next;
	mes "[���t]";
	mes "����ƁA��������������";
	mes "�w�ւ������Ă����񂾁B";
	next;
	mes "[���t]";
	mes "������ǂ����邩���Ďv�������ǂ�B";
	mes "���̂��w�ւ��ĂĂ����傤���Ȃ�����H";
	mes "�Ȃ�A�����Ă鉴�̖��ɗ�����";
	mes "�������Ă��񂶂�˂����H";
	next;
	mes "[���t]";
	mes "����ŁA�w�ւ𔄂��ď��[�ւ�";
	mes "���蕨�ł��������Ǝv���Ă�����A";
	mes "����j����S�s���ɂ�������";
	mes "�����Ă��邶��Ȃ����B";
	next;
	mes "[���t]";
	mes "����ƁA���̒j�͋S�C���銴����";
	mes "���ɏ��̎��̂������グ���{�l��";
	mes "�����Ă��Ă�B";
	mes "������Ƌ�����������A�f����";
	mes "���������Č������񂾁B";
	next;
	mes "[���t]";
	mes "��������A�w�ւ��E��Ȃ��������H";
	mes "�ƕ����Ă��₪�����B";
	mes "���͒m���U��������ˁB";
	next;
	mes "[���t]";
	mes "����ƁA���̒j�͂ǂ����Ă����̎w�ւ�";
	mes "�K�v���Ɖ��x�������Ă���񂾁B";
	mes "�w�ւ͍��������Ƃ��������B";
	next;
	mes "[���t]";
	mes "����Ȃ�A�����ɍ���";
	mes "�����Ă��炨���Ǝv���Ă�B";
	mes "�܂��A�j�̋C���ɕ��������Ă̂�";
	mes "���������ǂȁB";
	mes "���̒j�Ɏw�ւ𔄂����񂾁B";
	next;
	mes "[���t]";
	mes "��������A�\�z�O�̑��������Ă�B";
	mes "��ő��̂���畷������A";
	mes "�̏Ⴕ���@�B���C�����Ȃ���";
	mes "�ׁX�ƕ�炷�l���������Ă�B";
	mes "���̌�A�ǂ����������܂����炵���B";
	next;
	mes "[���t]";
	mes "�܂��A���̒m���Ă�̂͂��ꂮ�炢���B";
	next;
	menu "���̒j�̖��O�́H",-;
	mes "[���t]";
	mes "��H�@���O�H";
	mes "���[�A�������c�c���H";
	mes "���`��A�ǂ����ɂ���";
	mes "�o���ĂȂ��Ȃ��B";
	next;
	mes "[���t]";
	mes "����30�N�O�����ȁB";
	mes "�����A�ł��Z��ł��ꏊ�͊o���Ă���B";
	mes "�m���A�u^FF0000�k���̕��p^000000�v�ɂ���";
	mes "�u^FF0000�x������c�n^000000�v�̏���";
	mes "��������B";
	set KH_QUE,32;
	close;
}

yuno_fild09,158,217,0	script	�ؔ�	111,{
	if(KH_QUE != 32) {
		mes "-��R�̖؂̔�";
		mes "���ނ�̒��ɗ����Ă���-";
		close;
	}
	mes "-�؂̔������Ă���-";
	mes "-�؂̔ɂ�K.H�Ƃ�������";
	mes "�����Ă���-";
	next;
	cutin "kh_kyel_port",2;
	mes "-�؂̔��Ђ�����Ԃ��ƁA";
	mes "�ǂ����Ō����悤�ȎႢ�j��";
	mes "�ё��悪�`����Ă���-";
	mes "-�c�c�ǂ���^FF0000�L���E�n�C��^000000�����";
	mes "���Ă���C������-";
	getitem 7503,1;
	set KH_QUE,33;
	next;
	cutin "kh_kyel_port",255;
	mes "-������x��񂪏W�܂����݂�����-";
	mes "-�u�~�b�`�F���v�ɉ�ɍs����-";
	close;
}

//============================================================
// �L�G���̕���NPC
//------------------------------------------------------------
kh_mansion,27,27,0	script	�L�G���̕�������#kiel	45,1,1,{
	warp "kh_kiehl01",10,31;
	end;
OnInit:
	disablenpc;
	end;
}

kh_kiehl01,17,39,0	script	��M�@#kiel	111,{
	if(.mob)
		end;
	mes "-�c�c�W�c�c�W�W�c�c�W�c�c-";
	if(KH_QUE == 36) {
		mes "-�G���܂݂�̎�M�@����";
		mes "�N���̐�������Ă���-";
		next;
		mes "[????]";
		mes "���₨��B";
		mes "������Ȃ���ł��ˁc�c";
		mes "���ɑ���ꂽ�h�q�c�c�ł��傤���B";
		next;
		mes "[????]";
		mes "�t�t�c�c";
		mes "�����ł��ˁc�c";
		mes "�����܂Ŗ����ɗ��ꂽ��A";
		mes "���̃X�N���[���������グ�܂��傤�B";
		mes "���Ȃ��̗́A�����Ē����܂���B";
		set KH_QUE,37;
	}
	close2;
	set .mob,.mob+2;
	monster "kh_kiehl01",17,33,"�G���Z��",1739,1,"��M�@#kiel::OnKilled";
	monster "kh_kiehl01",18,33,"�G���I�b�g",1740,1,"��M�@#kiel::OnKilled";
	end;
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0)
		dropitem "kh_kiehl01",19,36,7506,1,0;
	end;
}

kh_kiehl01,13,40,0	script	�ԕr	111,{
	if(KH_QUE < 38) {
		mes "-�ԕr���u����Ă���-";
		if(KH_QUE != 37)
			close;
		next;
		switch(select("�ԕr����ɂ���","�ԕr����","�ԕr���Ђ�����Ԃ�")) {
		case 1:
			mes "-�����N���Ȃ�-";
			close;
		case 2:
			mes "-�c�c����Ȃ�-";
			mes "-���b�P���x���̓����i���H-";
			close;
		case 3:
			set KH_QUE,38;
			break;
		}
	}
	mes "-�ԕr�̒��";
	mes "������������Ă���-";
	mes "^FF0000-�S�Ă͔ޏ��̂��߂�-";
	mes "-�S�Ă͎v���o�̂��߂�-";
	mes "-�������N�̎��͖Y��Ȃ��c�c-";
	close;
}

kh_kiehl01,19,24,0	script	��	111,{
	if(KH_QUE >= 39) {
		mes "-���̒��ɂ͂�����������-";
		close;
	}
	mes "-�����J���Ȃ�-";
	mes "-�悭����ƁA���ɂ�";
	mes "��������R����ł���-";
	next;
	input .@str$;
	if(.@str$ != "�G���V�A" || KH_QUE != 38) {
		mes "�u�s�[�I�v";
		mes "�u�Í����Ⴂ�܂��I�v";
		close;
	}
	mes "-�����J����ƁA";
	mes "�u�`�������v�Ƃ�����������-";
	mes "-���̒��ɂ�";
	mes "^FF0000�����Ȍ�^000000�������Ă���-";
	getitem 7505,1;
	set KH_QUE,39;
	close;
}

kh_kiehl01,44,33,0	script	�傫�ȃh�A#kiel1	111,{
	if(KH_QUE < 39 || KH_QUE > 53) {
		mes "-�h�A�Ɍ����|�����Ă���-";
		close;
	}
	mes "-�h�A���J����-";
	enablenpc "kiehlwarp1";
	initnpctimer;
	close;
OnTimer30000:
	stopnpctimer;
	disablenpc "kiehlwarp1";
	end;
}
kh_kiehl01,43,33,0	script	kiehlwarp1	45,1,1,{
	warp "kh_kiehl01",55,34;
	end;
OnInit:
	disablenpc;
	end;
}

kh_kiehl01,174,40,0	script	�傫�ȃh�A#kiel2	111,{
	if(KH_QUE >= 40 && KH_QUE <= 53) {
		enablenpc "kiehlwarp2";
		initnpctimer;
		end;
	}
	if(KH_QUE < 39 || KH_QUE > 53) {
		mes "-�h�A�Ɍ����|�����Ă���-";
		close;
	}
	mes "-�h�A�Ɍ����|�����Ă���-";
	mes "-�����������-";
	next;
	input .@str$;
	if(.@str$ != "�����Ȍ�") {
		mes "-�h�A�͊J���Ȃ�-";
		close;
	}
	mes "-^FF0000��^000000���������ނ�";
	mes "�h�A���J����-";
	delitem 7505,1;
	set KH_QUE,40;
	enablenpc "kiehlwarp2";
	initnpctimer;
	close;
OnTimer30000:
	stopnpctimer;
	disablenpc "kiehlwarp2";
	end;
}
kh_kiehl01,174,39,0	script	kiehlwarp2	45,1,1,{
	warp "kh_kiehl01",173,52;
	end;
OnInit:
	disablenpc;
	end;
}

kh_kiehl01,77,107,0	script	�傫�ȃh�A#kiel3	111,{
	if(KH_QUE < 40 || KH_QUE > 53) {
		mes "-�h�A�Ɍ����|�����Ă���-";
		close;
	}
	mes "-�h�A�Ɍ����|�����Ă���-";
	mes "-�����̐؂�ڂ�����-";
	next;
	input .@str$;
	if(.@str$ != "���F�̃J�[�h�L�[" || countitem(7506) < 1) {
		mes "-�h�A�͊J���Ȃ�-";
		close;
	}
	mes "-^0000FF���F�̃J�[�h�L�[^000000��ʂ��ƁA";
	mes "�h�A���J����-";
	delitem 7506,1;
	enablenpc "kiehlwarp3";
	initnpctimer;
	close;
OnTimer30000:
	stopnpctimer;
	disablenpc "kiehlwarp3";
	end;
}
kh_kiehl01,78,107,0	script	kiehlwarp3	45,1,1,{
	warp "kh_kiehl01",68,107;
	end;
OnInit:
	disablenpc;
	end;
}
kh_kiehl01,15,177,0	script	�@�B�l�`	111,{}
kh_kiehl01,15,181,0	script	�@�B�l�`	111,{}
kh_kiehl01,15,182,0	script	�@�B�l�`	111,{}
kh_kiehl01,15,178,0	script	�@�B�l�`#kiel	111,{
	if(.mob)
		end;
	mes "-�����ǂɐG���ƁA";
	mes "�@�B�l�`����яo���Ă���-";
	close2;
	set .mob,.mob+3;
	monster "kh_kiehl01",18,181,"�G���I�b�g",1740,1,"�@�B�l�`#kiel::OnKilled";
	monster "kh_kiehl01",18,180,"�G���Z��",1739,2,"�@�B�l�`#kiel::OnKilled";
	monster "kh_kiehl01",18,179,"�G���I�b�g",1740,1,"�@�B�l�`#kiel::OnKilled";
	end;
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0)
		dropitem "kh_kiehl01",18,179,7506,1,0;
	end;
}

kh_kiehl01,42,178,0	script	�傫�ȃh�A#kiel4	111,{
	if(KH_QUE < 40 || KH_QUE > 53) {
		mes "-�h�A�Ɍ����|�����Ă���-";
		close;
	}
	mes "-�h�A�Ɍ����|�����Ă���-";
	mes "-�����̐؂�ڂ�����-";
	next;
	input .@str$;
	if(.@str$ != "���F�̃J�[�h�L�[" || countitem(7506) < 1) {
		mes "-�h�A�͊J���Ȃ�-";
		close;
	}
	mes "-^0000FF���F�̃J�[�h�L�[^000000��ʂ��ƁA";
	mes "�h�A���J����-";
	delitem 7506,1;
	enablenpc "kiehlwarp4";
	initnpctimer;
	close;
OnTimer30000:
	stopnpctimer;
	disablenpc "kiehlwarp4";
	end;
}
kh_kiehl01,41,178,0	script	kiehlwarp4	45,1,1,{
	//warp "kh_kiehl01",47,171;	//�X�^�b�N�ʒu�Ȃ̂ňʒu�␳
	warp "kh_kiehl01",47,178;
	end;
OnInit:
	disablenpc;
	end;
}

kh_kiehl01,166,187,0	script	�傫�ȃh�A#kiel5	111,{
	if(.mob)
		end;
	if(getnpctimer(1,"�L�G��#kiel1")) {
		mes "-�h�A�͂т��Ƃ����Ȃ�-";
		mes "-�J����͖̂����݂�����-";
		close;
	}
	switch(KH_QUE) {
	default:
		mes "-�����Ȃ��傫�ȃh�A������-";
		close;
	case 40:
	case 41:
	case 42:
	case 43:
		mes "-�傫�ȃh�A������-";
		mes "-�h�A�̉�����A";
		mes "�����ȕ�������������-";
		next;
		menu "�h�A������",-,"�h�A������",-,"�h�A���R��",-,"�h�A�Ɍy���G���",-,"�h�A�𒲂ׂ�",-;
		mes "-�h�A�ɐG�ꂽ�u�ԁA";
		mes "�@�B�l�`���o������-";
		mes "-�������u�ł�����̂��H-";
		set KH_QUE,KH_QUE+1;
		close2;
		set .mob,.mob+2;
		monster "kh_kiehl01",165,183,"�G���I�b�g",1740,1,"�傫�ȃh�A#kiel5::OnKilled";
		monster "kh_kiehl01",163,183,"�G���Z��",1739,1,"�傫�ȃh�A#kiel5::OnKilled";
		end;
	case 44:
	case 45:
	case 46:
	case 47:
		mes "-�h�A���ق�̏��������J���Ă���-";
		mes "-�����ł����������";
		mes "�ʂ��悤�ɂȂ邩������Ȃ�-";
		if(countitem(7507) < 1)
			close;
		next;
		if(select("�|�S","���т��S�̕�","�d���S�̌���","�˂�","��߂Ă���")!=3) {
			mes "-�h�A�͊J���Ȃ�-";
			close;
		}
		if(KH_QUE < 47) {
			mes "-�h�A�����������J����-";
			mes "-����������Ƃ���΂��";
			mes "�ʂ��悤�ɂȂ肻����-";
		}
		else {
			mes "^0000FF-�d���S�̌��Ђ����x��";
			mes "�g���āA�悤�₭";
			mes "�ʂ蔲����邾���̋�Ԃ��ł���-^000000";
		}
		delitem 7507,1;
		set KH_QUE,KH_QUE+1;
		close;
	case 48:
	case 49:
	case 50:
	case 51:
	case 52:
	case 53:
		mes "-�h�A�̉��ɐi�݂܂����H-";
		next;
		if(select("�͂�","������")==2)
			close;
		enablenpc "kiehlwarp5";
		initnpctimer;
		close;
	}
OnKilled:
	set .mob,.mob-1;
	end;
OnTimer30000:
	stopnpctimer;
	disablenpc "kiehlwarp5";
	end;
}
kh_kiehl01,166,186,0	script	kiehlwarp5	45,1,1,{
	if(KH_QUE >= 48 && KH_QUE <= 53) {
		enablenpc "kiehlwarp5";
		initnpctimer "�L�G��#kiel1";
		switch(KH_QUE) {
		case 51:
		case 52:
			hideoffnpc "�~�b�`�F��#kiel";
			for(set .@i,1; .@i<=5; set .@i,.@i+1)
				hideoffnpc "�v��#kiel"+.@i;
			break;
		case 53:
			enablenpc "kiehlwarp6";
			break;
		}
	}
	warp "kh_kiehl02",49,6;
	end;
OnInit:
	disablenpc;
	end;
}

kh_kiehl02,49,10,0	script	�g���b�v	139,4,2,{
	if(KH_QUE != 48)
		end;
	monster "kh_kiehl02",46,13,"�A���Z��",1739,1;
	monster "kh_kiehl02",47,13,"�A���I�b�g",1740,1;
	monster "kh_kiehl02",48,13,"�A���Z��",1739,1;
	monster "kh_kiehl02",49,13,"�A���I�b�g",1740,1;
	monster "kh_kiehl02",50,13,"�A���Z��",1739,1;
	monster "kh_kiehl02",51,13,"�A���I�b�g",1740,1;
	monster "kh_kiehl02",52,13,"�A���Z��",1739,1;
	monster "kh_kiehl02",53,13,"�A���I�b�g",1740,1;
	set KH_QUE,49;
	end;
}

kh_kiehl02,50,52,4	script	�L�G��#kiel1	902,{
	cutin "kh_kiel01",2;
	switch(KH_QUE) {
	default:
		mes "[�L�G��]";
		mes "�c�c���Â��Ɋ肢�܂��c�c";
		break;
	case 49:
		mes "[�L�G��]";
		mes "���҂����Ă���܂����B";
		mes "���̂悤�ȏ��܂�";
		mes "����������Ƃ́A";
		mes "��ό��h�ł��B";
		next;
		mes "[�L�G��]";
		mes "���āA��قǂ��b�����ʂ�A";
		mes "���̃X�N���[���ł�";
		mes "�����グ�������ł����c�c";
		next;
		mes "[�L�G��]";
		mes "�c�O�Ȃ���A";
		mes "����𔲂�����Ă��܂�����";
		mes "���͂��ꂱ�������̐l�`�B";
		mes "�\���󂠂�܂��񂪁A";
		mes "���X��R�����Ă��炢�܂��B";
		close2;
		cutin "kh_kiel01",255;
		hideonnpc;
		set KH_QUE,50;
		set getvariableofnpc(.mob,"kielmob"),10;
		monster "kh_kiehl02",49,51,"�G���I�b�g",1740,2,"kielmob::OnKilled";
		monster "kh_kiehl02",49,51,"�G���Z��",1739,2,"kielmob::OnKilled";
		monster "kh_kiehl02",49,51,"�R���X�^���g",1745,1,"kielmob::OnKilled";
		monster "kh_kiehl02",50,51,"�G���I�b�g",1740,2,"kielmob::OnKilled";
		monster "kh_kiehl02",50,51,"�G���Z��",1739,2,"kielmob::OnKilled";
		monster "kh_kiehl02",50,51,"�R���X�^���g",1745,1,"kielmob::OnKilled";
		end;
	case 50:
		cutin "kh_kiel03",2;
		mes "[�L�G��]";
		mes "���΁c�c�ł��ˁB";
		mes "���̎h�q���������āA";
		mes "���͂�������̂悤���B";
		next;
		mes "[�L�G��]";
		mes "���āc�c���̂܂ܗV��ł��Ă�";
		mes "�܂�Ȃ����ł����A";
		mes "�������Ȃ��ɉ����������̂�";
		mes "���������肦�܂����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "^FF0000�L���E�n�C��^000000�����";
		mes "���Ȃ����~�߂Ă���ƌ����܂����B";
		mes "�ނ͎����̉ߋ��ɋꂵ��ł܂��B";
		mes "^0000FF�L�G��^000000�c�c";
		mes "����Ȏ��͂�߂āA���ƈꏏ��";
		mes "��������̌��ɋA���Ă��������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��͓������ꂵ�߂Ă���B";
		mes "����Ȃ́A�Ԉ���Ă���I";
		next;
		cutin "kh_kiel01",2;
		mes "[�L�G��]";
		mes "�����c�c�ł����H";
		mes "�c�c�t�t�c�c";
		mes "����͐l�Ԃł��邠�Ȃ�����";
		mes "�����ł͂���܂��񂩁H";
		mes "�_�̑n�����ł���l�ԁB";
		mes "�l�Ԃ̑n�����ł���@�B�l�`�B";
		next;
		mes "[�L�G��]";
		mes "�����̗��v�̂��߁A";
		mes "�����l�Ԃ��E���A�������邠�Ȃ������B";
		mes "���̊肢�̂��߁A";
		mes "�l�`��K�v�Ƃ��Ă���҂ɒ񋟂��鎄�B";
		mes "�ǂ����Ⴄ�Ƃ����̂ł��H";
		next;
		mes "[�L�G��]";
		mes "���̍�����l�`�͐l�ԂƎ��Ă��܂����A";
		mes "�w�K�ɑ΂��ĉ��������鎖���Ȃ��B";
		mes "�ɂ݂���ɂ������邱�Ƃ͂Ȃ��B";
		mes "��������Ă���̂ł��B";
		next;
		mes "[�L�G��]";
		mes "�������l�Ԃ͈Ⴄ�B";
		mes "�ڂ̑O�ŋ�ɂ������A";
		mes "�i���鎩���̓����ł���u�l�ԁv��";
		mes "���Ȃ������͖������Ă���B";
		mes "���ߐ[���̂��ǂ���Ȃ̂��A";
		mes "���炩�ł͂���܂��񂩁H";
		next;
		cutin "kh_kiel04",2;
		mes "[�L�G��]";
		mes "�\���󂠂�܂��񂪁A";
		mes "���Ȃ��̒�Ă͋p�������Ē����܂��B";
		mes "�c�񂾈���̂��߁A";
		mes "���l�̉ƒ��j�ł����Ă��܂��B";
		mes "����ȕ����A�����܂Ƃ��ɐl�`��";
		mes "������Ƃ͓���l�����܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�����B";
		mes "�ނ͉߂���Ƃ��Ă��܂����B";
		mes "�ł�^0000FF�L�G��^000000�I";
		mes "���Ȃ������g��ł���";
		mes "���b�P���x�������A";
		mes "����Ȑl�Ԃ̑�\�Ȃ񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ނ�Ƃ����ւ��Ȃ��ŁI";
		mes "�ނ�ɋ��͂���قǁA";
		mes "�s�K�ɂȂ�l�������Ă��܂��I";
		next;
		cutin "kh_kiel02",2;
		mes "[�L�G��]";
		mes "�c�c�c�c";
		mes "���Ȃ��������ōŏ��Ɍ��������B";
		mes "�ǂ�ȕ����������̂��o���Ă��܂����H";
		mes "�c�c�܂������q���p�i��";
		mes "�������������ł��傤�c�c";
		next;
		mes "[�L�G��]";
		mes "�����͎���";
		mes "���߂č��ꂽ���̕����ł��B";
		mes "�ł����A�ǂ�����";
		mes "����l�������Ȃ��Ƃ����̂ɁA";
		mes "�܂��������������Ă���̂��A";
		mes "���Ȃ��ɂ킩��܂����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c!?";
		next;
		mes "[�L�G��]";
		mes "�ŏ��̑�2����Ƃ��č��ꂽ";
		mes "�@�B�l�`��5�́B";
		mes "�������̓��b�P���x������h�����ꂽ";
		mes "�E�����狳����󂯂��B";
		next;
		mes "[�L�G��]";
		mes "�@�B�l�`�ł��鎄�����ł�";
		mes "�ς������ł����c�c";
		mes "���������B�w�K�\�͎����B";
		mes "�󋵂ɂ�銴��\���̊w�K�c�c";
		next;
		mes "[�L�G��]";
		mes "�����s�ǂ������̂��A";
		mes "����Ƃ��΂�������̂��߂��c�c";
		mes "4�̂̋@�B�l�`���w�K�A";
		mes "�������ɋ@�\���~���܂����B";
		next;
		mes "[�L�G��]";
		mes "�����āA�B�ꐶ���c�����̂�";
		mes "���̎��ł��B";
		mes "���́A����܂Ŗ��O���Ȃ���������";
		mes "^0000FF�L�G��^000000�Ƃ�������";
		mes "�^���Ă��������܂����B";
		next;
		cutin "kh_kiel03",2;
		mes "[�L�G��]";
		mes "���b�P���x���B";
		mes "�ނ�̔�l���I�ȍs����";
		mes "�N�����m���Ă��܂���B";
		mes "�����c�c���̐g�������ĂˁB";
		mes "�������A���͍���ł��܂���B";
		next;
		mes "[�L�G��]";
		mes "���ꂪ�l�Ԃ̖{���B";
		mes "�l����ɗ��҂�";
		mes "�{��������ł��I";
		next;
		mes "[�L�G��]";
		mes "�c�c���āA";
		mes "���ꂮ�炢�ɂ��Ă����܂��傤�B";
		mes "���Ȃ��͂Ȃ��Ȃ��ʔ��������B";
		mes "���̂܂܋A���Ă�������Ȃ�A";
		mes "�o���܂ł��ē����܂��傤�B";
		close2;
		cutin "kh_kiel01",255;
		set KH_QUE,51;
		hideoffnpc "�~�b�`�F��#kiel";
		for(set .@i,1; .@i<=5; set .@i,.@i+1)
			hideoffnpc "�v��#kiel"+.@i;
		end;
	case 51:
		mes "[�~�b�`�F��]";
		mes "�����͂����Ȃ���I";
		mes "^0000FF�L�G���E�n�C��^000000�I";
		mes "���O��s�@���퐻����";
		mes "���A���̗e�^�őߕ߂���I";
		next;
		mes "[�L�G��]";
		mes "�c�c���₨��B";
		mes "����܂����ˁB";
		mes "����ł͎���";
		mes "��R���Ȃ���΂Ȃ�Ȃ��B";
		mes "�c�c�d������܂���B";
		next;
		mes "[�L�G��]";
		mes "�ז��Ȃ��Ȃ�������";
		mes "���΂��̊Ԃ��x�݂��������B";
		next;
		mes "[�~�b�`�F��]";
		mes "��!?�@�����!!";
		misceffect 404,"�~�b�`�F��#kiel";
		for(set .@i,1; .@i<=5; set .@i,.@i+1)
			misceffect 404,"�v��#kiel"+.@i;
		next;
		cutin "kh_kiel03",2;
		mes "[�L�G��]";
		mes "���āB";
		mes "����ł͂��Ȃ���";
		mes "�A�邱�Ƃ͂ł��܂���ˁH";
		mes "�c�c�ł́A������x";
		mes "������肢�܂��B";
		close2;
		cutin "kh_kiel01",255;
		hideonnpc;
		set KH_QUE,52;
		set getvariableofnpc(.mob,"kielmob"),1;
		monster "kh_kiehl02",50,52,"�L�G��",1733,1,"kielmob::OnKilled";
		end;
	case 52:
		cutin "kh_kiel02",2;
		mes "[�L�G��]";
		mes "�c�c�t�b�t�b�t�b�t�c�c";
		mes "��͂�A���Ȃ��̎��͂�";
		mes "�z�肵���������̂�����܂��B";
		next;
		cutin "kh_kiel03",2;
		mes "[�L�G��]";
		mes "�t�t�c�c�ł����B";
		mes "���Ȃ��Ɏ���߂܂��鎖�͂ł��܂���B";
		mes "�Ȃ��Ȃ�A���ƈꏏ��";
		mes "���̐��ւƍs�����ɂȂ邩��ł��I";
		mes "�����c�c���ɂ͍��������̂�";
		mes "�s���̂͂��Ȃ������ł��ˁc�c�t�t�B";
		next;
		mes "[�~�b�`�F��]";
		mes "!!!!";
		announce "�L���L���L���L���@�h�h�[��!!�@�K�V���I�@�K�`�����I�@�K�`�����I",9,0xFF0000;
		next;
		mes "[�~�b�`�F��]";
		mes "!!!!";
		mes "���̉���!?";
		mes "���܂����I�@�����߂�ꂽ�I";
		next;
		mes "[�L�G��]";
		mes "�N�b�N�b�N�b�N�c�c";
		mes "�ǂ��ł��H";
		mes "�ʔ����d�|���ł��傤�B";
		next;
		mes "[�~�b�`�F��]";
		mes "�b�c�c";
		mes "�����I";
		mes "^FF0000�L���E�n�C��^000000����󂯎����";
		mes "���u���g���̂�I";
		next;
		mes "[�L�G��]";
		mes "�t�t�c�c";
		mes "�������Ă����ʂł���B";
		mes "�Ȃɂ��A�������u�������Ă���̂�";
		mes "���ł͂���܂��񂩂�B";
		mes "�t�t�t�c�c";
		announce "WARNING�@WARNING",9,0xFF0000;
		next;
		mes "[�~�b�`�F��]";
		mes "�ȃb!?";
		mes "�܂����ɂ��ꂩ�c�c";
		mes "�܂����I";
		mes "���b�P���x����������!?";
		next;
		mes "[????]";
		mes "���b�P���x���ł͂���܂����B";
		mes "�t�t�c�c";
		mes "�{�̂܂ł��������Ă���Ƃ����̂ɁB";
		next;
		mes "[�~�b�`�F��]";
		mes "�N�I";
		mes "�p�������Ȃ����I";
		next;
		mes "[????]";
		mes "�܂��킩��Ȃ��̂ł����H";
		mes "����Ƃ��A���̐���";
		mes "�킩��Ȃ��Ƃł��H";
		next;
		mes "[�~�b�`�F��]";
		mes "�ȁc�c";
		mes "�܂���!!";
		next;
		hideoffnpc "�L�G��#kiel2";
		next;
		cutin "kh_kiel01",0;
		mes "[�L�G��]";
		mes "�������炪�߂��܂����ˁB";
		mes "���߂Ă����A�����Ă��������܂��B";
		mes "^0000FF�L�G���E�n�C��^000000�Ɛ\���܂��B";
		next;
		mes "[�~�b�`�F��]";
		mes "�c�c�Ȃ��H";
		mes "�ǂ�����^0000FF�L�G��^000000����l�����!?";
		next;
		cutin "kh_kiel03",2;
		mes "[�L�G��]";
		mes "�t�t�c�c���Y��ł����H";
		mes "���͋@�B�l�`�ł���B";
		mes "^0000FF�~�b�`�F���E���C��^000000����B";
		next;
		mes "[�~�b�`�F��]";
		mes "!?";
		mes "���̖��O���c�c";
		mes "�ǂ������!?";
		next;
		mes "[�L�G��]";
		mes "���₨��B";
		mes "�X�p�C�����Ȃ�����������";
		mes "�{�C�Ŏv���Ă���̂ł����H";
		next;
		mes "[���ʂ̒j]";
		mes "�\���󂠂�܂���B�~�b�`�F���l�B";
		next;
		mes "[�~�b�`�F��]";
		mes "�{���P�E�X�I";
		mes "���Ȃ����c�c�ǂ�����!?";
		mes "�d���𕉂��Ă܂�";
		mes "�哝�̂����������Ȃ����I";
		next;
		mes "[�{���P�E�X]";
		mes "�M�p�𓾂邽�߂Ȃ牽�ł�����B";
		mes "�~�b�`�F���l�B";
		mes "�g�߂Ȑl�Ԃ���C��t����ƌ�����";
		mes "���Ȃ����g���A����M�p���Ă���̂�";
		mes "���ĂĖʔ��������B";
		next;
		mes "[�~�b�`�F��]";
		mes "����ȁc�c";
		mes "�����c�c�\���󂠂�܂���A�t���c�c";
		next;
		mes "[�L�G��]";
		mes "�a�m�I�ł͂���܂���ˁA�J�C�]�B";
		mes "�c�c�c�c�����ƁB";
		mes "�t�t�A�c�O�ł����A";
		mes "�������Ԃ������悤�ł��B";
		next;
		cutin "kh_kiel01",2;
		mes "[�L�G��]";
		mes "�������u���쓮���Ă���";
		mes "5����ɂ��̕����͏��ł��܂��B";
		mes "^0000FF�~�b�`�F���E���C��^000000�����";
		mes "�������ƈꏏ�ɗ��Ă��������܂��傤�B";
		next;
		mes "[�L�G��]";
		mes "���̓V���o���c�o���h�̑哝�̂�";
		mes "�����l���Ă���̂�";
		mes "�m�肽���̂ł��c�c�t�t�B";
		next;
		mes "[�L�G��]";
		mes "�J�C�]�A^0000FF�~�b�`�F��^000000�����";
		mes "���d�ɂ��A�ꂵ�Ă��������B";
		next;
		mes "[�{���P�E�X-�J�C�]]";
		mes "�c�c���������B";
		next;
		mes "[�~�b�`�F��]";
		mes "�����I";
		mes "�����I";
		mes "�����A�{���P�E�X!!";
		next;
		hideonnpc "�~�b�`�F��#kiel";
		for(set .@i,1; .@i<=5; set .@i,.@i+1)
			hideonnpc "�v��#kiel"+.@i;
		next;
		cutin "kh_kiel02",2;
		mes "[�L�G��]";
		mes "���āc�c";
		mes "������̖����Еt�������ł����c�c";
		mes "���X���Ƃ��b�����܂��傤���H";
		next;
		mes "[�L�G��]";
		mes "�����A���炵�܂����B";
		mes "���Ȃ��ɂ͂������Ԃ�";
		mes "�Ȃ��悤�ł��ˁB";
		mes "�t�t�t�c�c";
		next;
		mes "[�L�G��]";
		mes "�����͂��������̂�";
		mes "�������������������ł��傤�B";
		next;
		mes "[�L�G��]";
		mes "���Łc�c�ƌ����Ă͂Ȃ�ł����c�c";
		mes "���Ɉ�`�������肢�ł��܂����H";
		next;
		mes "[�L�G��]";
		mes "���炭�c�c���͎��̖{�̂ɂ���";
		mes "^FF0000�w��^000000�������ė���悤��";
		mes "���񂾂̂ł͂Ȃ��ł����H";
		mes "�����A�w�ւ����߂Č�������";
		mes "�ƂĂ������܂����B";
		next;
		cutin "kh_kiel04",2;
		mes "[�L�G��]";
		mes "��؂ȕ��������悤�ł��ˁB";
		mes "�����󂵂Ă��܂��Ǝv����";
		mes "�C���C�ł͂Ȃ������ł��傤�B";
		next;
		cutin "kh_kiel01",2;
		mes "[�L�G��]";
		mes "23�N�Ԍ��J���܂ł����B";
		mes "�������x�݂��������B";
		mes "�c�c���̎��A^0000FF�L�G��^000000�B";
		next;
		misceffect 372;
		next;
		mes "[�L�G��]";
		mes "�c�c�U������ӎv���Ȃ��؂Ƃ��āA";
		mes "�{�̂������Ɏc���Ă����܂��B";
		mes "�����A�ǂ����B";
		mes "^FF0000�w��^000000���������";
		mes "���ɂ��`�����������B";
		next;
		mes "[�L�G��]";
		mes "�u���Ȃ��ɍ��ꂽ";
		mes "�̂�Ԃ����̂ł�����A";
		mes "��������ȏ�A���Ȃ��Ƃ�";
		mes "���̉����Ȃ��B";
		mes "���悤�Ȃ�c�c�v";
		next;
		mes "[�L�G��]";
		mes "���͂��łɁA���̐݌v�}�ɔ���ꂽ";
		mes "��2����̐l�`�ł͂���܂���B";
		mes "�����g�ŊJ�������V�����́B";
		mes "���̎����g����4����Ȃ̂ł��B";
		next;
		mes "[�L�G��]";
		mes "���Ȃ��̓��ł͏��X����ł��傤���A";
		mes "���ɂ͂킩��͂��ł���B";
		mes "���āA�����c��3����������܂���B";
		mes "����Ȃ���A���͂���Łc�c";
		mes "�܂��A������܂��傤�c�c�t�t�t�B";
		next;
		hideonnpc "�L�G��#kiel2";
		enablenpc "kiehlwarp6";
		delitem 7504,1;
		setnpctimer 1999000;
		set KH_QUE,53;
		break;
	case 53:
		cutin "kh_kiel02",2;
		mes "-�܂����������Ȃ�^0000FF�L�G��^000000��";
		mes "�{�̂���^FF0000�w��^000000�����o����-";
		getitem 7508,1;
		set KH_QUE,54;
		break;
	case 54:
	case 55:
	case 56:
		cutin "kh_kiel02",2;
		mes "-^0000FF�L�G��^000000�̖{�̂������c���Ă���-";
		break;
	}
	close2;
	cutin "kh_kiel01",255;
	end;
OnTimer1200000:
	areawarp "kh_kiehl02",0,0,100,100,"lighthalzen",193,202;
	killmonster "kh_kiehl02","All";
	disablenpc "kiehlwarp6";
	hideonnpc "�~�b�`�F��#kiel";
	for(set .@i,1; .@i<=5; set .@i,.@i+1)
		hideonnpc "�v��#kiel"+.@i;
	hideonnpc "�L�G��#kiel2";
	hideoffnpc;
	set .mob,0;
	stopnpctimer;
	end;
OnTimer2000000:
	announce "�����܂ŁA����3��",9,0xFF0000;
	end;
OnTimer2060000:
	announce "�����܂ŁA����2��",9,0xFF0000;
	end;
OnTimer2120000:
	announce "�����܂ŁA����1��",9,0xFF0000;
	end;
OnTimer2150000:
	announce "�����܂ŁA����30�b",9,0xFF0000;
	end;
OnTimer2160000:
	announce "�����܂ŁA����20�b",9,0xFF0000;
	end;
OnTimer2170000:
	announce "�����܂ŁA����10�b",9,0xFF0000;
	end;
OnTimer2175000:
	announce "5",9,0xFF0000;
	end;
OnTimer2176000:
	announce "4",9,0xFF0000;
	end;
OnTimer2177000:
	announce "3",9,0xFF0000;
	end;
OnTimer2178000:
	announce "2",9,0xFF0000;
	end;
OnTimer2179000:
	announce "1",9,0xFF0000;
	end;
OnTimer2180000:
	announce "�s�[�[�[",9,0xFF0000;
	areawarp "kh_kiehl02",0,0,100,100,"lighthalzen",193,202;
	killmonster "kh_kiehl02","All";
	disablenpc "kiehlwarp6";
	hideonnpc "�~�b�`�F��#kiel";
	for(set .@i,1; .@i<=5; set .@i,.@i+1)
		hideonnpc "�v��#kiel"+.@i;
	hideonnpc "�L�G��#kiel2";
	hideoffnpc;
	set .mob,0;
	stopnpctimer;
	end;
}

kh_kiehl02,0,0,0	script	kielmob	-1,{
OnKilled:
	set .mob,.mob-1;
	if(.mob == 0)
		hideoffnpc "�L�G��#kiel1";
	end;
}

kh_kiehl02,49,55,6	script	�~�b�`�F��#kiel	727,{
	end;
OnInit:
	hideonnpc;
	end;
}
kh_kiehl02,53,52,4	duplicate(�~�b�`�F��#kiel)	�v��#kiel1	880
kh_kiehl02,51,49,1	duplicate(�~�b�`�F��#kiel)	�v��#kiel2	880
kh_kiehl02,47,50,0	duplicate(�~�b�`�F��#kiel)	�v��#kiel3	880
kh_kiehl02,46,53,6	duplicate(�~�b�`�F��#kiel)	�v��#kiel4	880
kh_kiehl02,48,53,5	duplicate(�~�b�`�F��#kiel)	�L�G��#kiel2	902

kh_kiehl02,49,56,0	script	kiehlwarp6	45,1,1,{
	warp "lighthalzen",193,202;
	end;
OnInit:
	disablenpc;
	end;
}