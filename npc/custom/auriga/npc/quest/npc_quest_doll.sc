//==============================================================================
//Ragnarok Online - Doll Exchange Script
//==============================================================================
alberta,117,135,0	script	���т���	96,{
	set .@sex$,(Sex)? "���ɂ������": "���˂������";
	mes "[���т���]";
	mes .@sex$+ "�A����ɂ��́I";
	if(Sex==0) {
		mes "�˂��˂��A���o������";
		mes "�ʂ�����ݍD���H";
	}
	else {
		mes "�ށ[�A���Z�����͒j������";
		mes "�ʂ�����݂͍D������Ȃ����ȁH";
	}
	mes "�������A�ʂ�����݂���D���Ȃ́B";
	next;
	mes "[���т���]";
	mes "�������A�V�����ʂ�����݂��~�����B";
	mes "���x�̂��a�����Ƀp�p��������";
	mes "�����́B";
	next;
	if(select("�����ˁ[","�ʂ�����݂����悤���H")==1) {
		mes "[���т���]";
		mes "�ǂ�Ȃʂ�����݂��������ȁ`";
		mes "�������I�T���l�`���~�����ȁ[";
		mes "�Ƃ��Ă����킢���Ǝv���́B";
		close;
	}
	mes "[���т���]";
	mes "���H";
	mes .@sex$+ "�������́H";
	mes "�ʂ�����݂��H";
	mes "������[�I";
	mes "�ǂ�Ȃʂ�����݂�";
	mes "�����̂��ȁI�H";
	next;
	setarray .@itemid,741,742,740,752,743,751,750,754,753;
	set @menu,select("�|�����l�`","�`�����`�����l�`","�E�T�M����","�o�b�^�l�`","�X�|�A�l�`","�I�V���X�l�`",
									"�o�t�H���b�g�l�`","�^�k�L�l�`","�T���l�`");
	if(countitem(.@itemid[@menu-1])<1) {
		mes "[���т���]";
		mes "�������I" +.@sex$;
		mes "�ʂ�����ݎ����ĂȂ��ł���I";
		mes "(�v�C�b)";
		close;
	}
	switch(@menu) {
	case 1:
		mes "[���т���]";
		mes "��I�|�����l�`�͂�������";
		mes "�����Ă邯�ǁA";
		mes "����ł�" +.@sex$+ "��";
		mes "������Ȃ�厖�ɂ���I";
		mes "�|�����l�`�A�ӂ�ӂ�`";
		next;
		mes "[���т���]";
		mes "���������ɁA����������";
		mes .@sex$+ "��";
		mes "�v���[���g������I";
		mes "�ق�A�B���Ă������L�����f�B�B";
		next;
		delitem 741,1;
		getitem 529,1;
		mes "[���т���]";
		mes "�w�w�b";
		mes "��������H�ׂ�ƃ}�}�Ɏ����邩��A";
		mes .@sex$+ "�ɂ�������B";
		mes "�ʂ�����݂��肪�ƂˁI";
		close;
	case 2:
		mes "[���т���]";
		mes "���c�c �`�����`�����c�c";
		mes "�l�`�c�c";
		next;
		mes "[���т���]";
		mes "���[ ��������" +.@sex$+ "��";
		mes "�����񂾂���厖�ɂ��Ȃ���c�c";
		next;
		mes "[���т���]";
		mes "�͂��A" +.@sex$;
		mes "�R��������B";
		next;
		delitem 742,1;
		getitem 530,1;
		mes "[���т���]";
		mes "��������H�ׂ�ƒ����ɂȂ邩��";
		mes .@sex$+ "��";
		mes "������Ƃ��H�ׂĂˁB";
		mes "���肪�Ƃ��c�c";
		next;
		mes "[���т���]";
		mes "(�`�����`�����c�c �ԂԂ�)";
		close;
	case 3:
		mes "[���т���]";
		mes "����[�I�E�T�M���񂾁I";
		mes "���ꂩ�킢���I";
		mes .@sex$+ "�A���肪�Ƃ��I";
		next;
		mes "[���т���]";
		mes "�ӂ��ӂ��`";
		mes "�������I" +.@sex$+ "�ɂ�";
		mes "�v���[���g������I";
		mes "�����Ɓc�c�������I";
		mes "�͂��ǂ����I";
		next;
		delitem 740,1;
		getitem 530,1;
		mes "[���т���]";
		mes "����̓T���^����ɂ������";
		mes "�L�����f�B�Ȃ񂾂�`";
		mes .@sex$+ "���H�ׂĂ݂āB";
		mes "���������񂠂肪�Ƃ��I";
		mes "���������ĐQ��`";
		close;
	case 4:
		mes "[���т���]";
		mes "���A�o�b�^�l�`���B";
		mes "���b�J�̂ʂ�����݂��ˁ`";
		mes "���˂Ă���̂͌��������ǁA";
		mes "�ʂ�����݂͂��킢���ˁB";
		next;
		mes "[���т���]";
		mes "���肪�Ƃ��`";
		mes "��������" +.@sex$+ "�ɉ���������B";
		mes "�������̂����������ɂ���������̂�";
		mes "���������ȁc�c";
		next;
		delitem 752,1;
		getitem 532,7;
		mes "[���т���]";
		mes "�����ɂ����ς����邩��";
		mes .@sex$+ "�ɂ��������킯�`";
		mes "�ʂ�����݂��肪�ƁI";
		close;
	case 5:
		mes "[���т���]";
		mes "�������c�c";
		mes "�L�m�R���c�c";
		mes "�����}�}�ɃL�m�R���H�ׂȂ�������";
		mes "�������Ă�́c�c";
		next;
		mes "[���т���]";
		mes "�ł��A�ʂ�����݂Ȃ炩�킢������";
		mes "���炤�[�B�L�m�R�͐H�ׂȂ����ǁc�c";
		mes "�������������v���[���g����ˁB";
		next;
		delitem 743,1;
		getitem 538,5;
		mes "[���т���]";
		mes "����A�}�}���������";
		mes .@sex$+ "���ǂ����I";
		next;
		mes "[���т���]";
		mes "�ʂ�����݂��肪�Ɓ`";
		close;
	case 6:
		mes "[���т���]";
		mes "���킢��[�I";
		mes "����Ȃʂ�����݁A���߂Č���c�c";
		next;
		mes "[���т���]";
		mes "�߂��炵������p�p�ɂ�";
		mes "�����Ă��������I";
		mes "���႟�A" +.@sex$+ "�ɂ�";
		mes "���ꂠ����I";
		next;
		delitem 751,1;
		getitem 522,2;
		mes "[���т���]";
		mes "�}�}�ɓ����ŐX�ɓ�������";
		mes "����Ȏ����������́B";
		mes "������邩��A";
		mes (Sex? "�{�[�C": "�K�[��")+ "�t�����h�ƐH�ׂĂˁI";
		mes "�G�w�w�c�c";
		close;
	case 7:
		mes "[���т���]";
		mes "�ց`�I";
		mes "����Ȃ̏��߂Č����I";
		mes "���킢�����ǂȂ񂩂��킢�ˁB";
		next;
		mes "[���т���]";
		mes "���ꂢ�Ȃʂ������";
		mes "����������������A";
		mes .@sex$+ "�ɂ�����������`";
		next;
		delitem 750,1;
		getitem 526,2;
		mes "[���т���]";
		mes "����͂킽�����a�C�ɂȂ�����";
		mes "�p�p�����ꂽ�́B";
		mes "���͌��C������";
		mes .@sex$+ "�ɂ�����`";
		next;
		mes "[���т���]";
		mes "�ʂ�����݁A���肪�Ƃ��I";
		close;
	case 8:
		mes "[���т���]";
		mes "���A�^�k�L�l�`���`";
		mes "�X���[�L�[�͌���������";
		mes "�ʂ�����݂͂��킢���ˁI";
		next;
		mes "[���т���]";
		mes "���킢���ȁ`";
		mes .@sex$+ "���肪�ƁI";
		next;
		delitem 754,1;
		getitem 539,3;
		mes "[���т���]";
		mes "���΂������̎���P�[�L������I";
		mes .@sex$+ "��";
		mes "�Â����̂��炢�H";
		mes "����A������������H�ׂĂ݂ā`";
		next;
		mes "[���т���]";
		mes "���킢���ʂ�����݁A���肪�ƁI";
		close;
	case 9:
		mes "[���т���]";
		mes "��[!!!";
		mes "���T�����񂾁I���킢���`";
		mes .@sex$+ "�A�{���ɂ��肪�ƁI";
		mes "����~���������́`";
		next;
		mes "[���т���]";
		mes "���킢���ȁ`";
		mes "�������I" +.@sex$+ "��";
		mes "���炵�����́B";
		next;
		delitem 753,1;
		getitem 608,1;
		mes "[���т���]";
		mes "����̓p�p�Ƒ��̑��ɍs���r����";
		mes "�E�����́B�����̎�݂����B";
		mes "�������̒�ɖ��߂Ă�";
		mes "�����Ƃ��肪�o�Ȃ�����";
		mes .@sex$+ "�ɂ�����I";
		next;
		mes "[���т���]";
		mes "�ʂ�����݁A���肪�ƁI";
		close;
	}
}