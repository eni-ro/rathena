//= Athena Script ==============================================================
// Ragnarok Online Turbo Track Script     by Blaze
//==============================================================================

//============================================================
// �����ONPC
//------------------------------------------------------------
alde_gld,178,180,5	script	�ē���	837,{
	mes "[�A���f�o�����^�[�{�g���b�N]";
	mes "������́A�A���f�o����";
	mes "�^�[�{�g���b�N�ł��B";
	next;
	mes "[�A���f�o�����^�[�{�g���b�N]";
	mes "�^�[�{�g���b�N�́A���ʂȃR�[�X��";
	mes "�����蔲���A�S�[���܂ł�葁��";
	mes "�H�蒅�����Ƃ��������Z��ł��B";
	next;
	mes "[�A���f�o�����^�[�{�g���b�N]";
	mes "���Z�ł́A���푽�l�ȃR�[�X��d�|����";
	mes "�I�肽����҂��\���Ă��܂��B";
	mes "��낵����΁A��x���킵�Ă݂�";
	mes "���������B";
	close;
}

alde_gld,186,199,3	script	����W	845,{
	mes "[����W]";
	mes "����ɂ��́`�B";
	mes "�A���f�o�����^�[�{�g���b�N��";
	mes "�悤�����`�B";
	next;
	mes "[����W]";
	mes "�A���f�o�����^�[�{�g���b�N�ł�";
	mes "�y�R�y�R�ɏ���Ă������������";
	mes "������͋֎~���Ă���܂��B";
	next;
	mes "[����W]";
	mes "�y�R�y�R�ɏ���Ă���������ꍇ�́A";
	mes "������Ńy�R�y�R��������点��";
	mes "�����܂��B���̍ۂ�";
	mes "�u�y�R�y�R�������p���v��";
	mes "���n�����܂��̂ŁA�������";
	mes "��ł����p���������B";
	next;
	mes "[����W]";
	mes "����ł́A�^�[�{�g���b�N��";
	mes "���y���݂��������B";
	close;
}

alde_gld,181,199,5	script	�y�R�y�R�Ǘ��W	845,{
	if(getskilllv(63)) {
		mes "[�y�R�y�R�Ǘ��W]";
		mes "��������Ⴂ�܂��`�B";
		mes "�y�R�y�R����������";
		mes "�������������̂ł��ˁ`�B";
		mes "2,500Zeny�A�܂���";
		mes "�u�y�R�y�R�������p���v��";
		mes "�K�v�ɂȂ�܂����A�������ł����`�H";
		next;
		if(select("�͂��A�y�R�y�R�ɏ��܂�","����A����ς��߂܂�")==2) {
			mes "[�y�R�y�R�Ǘ��W]";
			mes "���Z�ɂ܂��Q�������̂ł����`�B";
			mes "�D���ł���Ƃ悢�ł��ˁ`�B";
			close;
		}
		if(checkriding()) {
			mes "[�y�R�y�R�Ǘ��W]";
			mes "���Ƀy�R�y�R�����邶��Ȃ��ł����`�B";
			mes "�������̎p��������x���Ă��������`�B";
			close;
		}
		if(countitem(7310) < 1 && Zeny < 2500) {
			mes "[�y�R�y�R�Ǘ��W]";
			mes "���`���ƁA���p����������";
			mes "�Ȃ�����Ȃ��ł����`�B";
			mes "�T�[�r�X�̂����p�ɂ́A���̕���";
			mes "�㉿��������ƕ����Ă���������`�B";
			close;
		}
		if(countitem(7310)) 
			delitem 7310,1;
		else
			set Zeny,Zeny-2500;
		setriding;
		mes "[�y�R�y�R�Ǘ��W]";
		mes "�����p���肪�Ƃ��������܂����`�B";
		close;
	}
	mes "[�y�R�y�R�Ǘ��W]";
	mes "�A���f�o�����^�[�{�g���b�N�ւ�";
	mes "�����ꂠ�肪�Ƃ��������܂��`�B";
	close;
}

alde_gld,183,204,0	script	turbowarp1001	45,1,1,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ���";
		mes "�������߁A�A�C�e�����󂯂Ƃ�";
		mes "���Ƃ��ł��܂���B";
		mes "�����A�C�e�������炵�Ă���";
		mes "�ēx���z�����������B�]";
		close;
	}
	if(checkriding()) {
		mes "[����W]";
		mes "�\���󂠂�܂��񂪁A�y�R�y�R��";
		mes "������点�Ē����܂��B";
		mes "�u�y�R�y�R�������p���v��";
		mes "���n�����܂��̂ŁA�������";
		mes "��ł����p���������B";
		close2;
		setoption 0x0000;
		getitem 7310,1;
	}
	if(sc_ison(SC_ALL_RIDING)) {
		mes "[����W]";
		mes "�\���󂠂�܂��񂪁A";
		mes "�R�搶���ɏ���ē��ꂷ�邱�Ƃ�";
		mes "�֎~�����Ă��������Ă���܂��B";
		close;
	}
	warp "turbo_room",100,65;
	end;
}

//============================================================
// �T����NPC
//------------------------------------------------------------
turbo_room,100,62,0	warp	turbowarp1002	1,1,alde_gld,183,198

turbo_room,124,86,7	shop	�^�[�{�g���b�N���l	90,501:-1,502:-1,503:-1,504:-1,645:-1,656:-1,1065:-1,1750:-1

turbo_room,130,91,3	script	�J�v���E��	115,{
	cutin "kafra_03",2;
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂�";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	next;
	mes "[�J�v���E��]";
	mes "������ł̈ʒu�Z�[�u��";
	mes "�A���f�o�����ɕۑ�����܂��B";
	mes "���������������B";
	mes "��������`���������܂��傤�H";
	next;
	switch(select("�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X","�J�v���|�C���g�m�F","�I��")) {
	case 1:
		savepoint "aldebaran",167,112;
		mes "[�J�v���E��]";
		mes "�Z�[�u���܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		break;
	case 2:
		callfunc "KafraStorage",40;
		break;
	case 3:
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
	case 4:
		mes "[�J�v���E��]";
		mes "��X�J�v���T�[�r�X�́A��芮����";
		mes "�T�[�r�X�ƊǗ��Ɩ���ڎw��";
		mes "���q�l�����S���Ă����p����������悤";
		mes "�����őP��s�����Ă��܂��B";
		mes "�i���j�J�v���T�[�r�X�������p��������";
		mes "���肪�Ƃ��������܂����B";
		break;
	}
	close2;
	cutin "kafra_03",255;
	end;
}

turbo_room,75,95,5	script	1�l���[�h�L�^��#turbo	857,{
	mes "[1�l���[�h�̍ŒZ�L�^�ێ���]";
	mes " ";
	mes "�ŋ��ƌĂ΂�邻�̖��́A";
	mes " ";
	mes "^4D4DFF"+ $TurboNameN$[0] +"^000000!!";
	mes " ";
	mes "�����A�N�������ɖ���������!!";
	close;
}

turbo_room,77,115,5	duplicate(1�l���[�h�L�^��#turbo)	1�l���[�h�L�^��	857

turbo_room,67,95,5	script	��ʃ��[�h�D���҃��X�g#	857,{
	mes "[��ʃ��[�h�̗D���҃��X�g�ŐV��]";
	for(set .@i,1; .@i<=3; set .@i,.@i+1) {
		mes "��ʁE" +(2<<.@i)+ "�l���[�h�̗D����";
		mes "^4D4DFF"+ $TurboNameN$[.@i] +"^000000";
	}
	close;
}

turbo_room,87,114,5	duplicate(��ʃ��[�h�D���҃��X�g#)	��ʃ��[�h�D���҃��X�g	857

turbo_room,71,95,5	script	�n�����[�h�D���҃��X�g#	857,{
	mes "[�n�����[�h�̗D���҃��X�g�ŐV��]";
	for(set .@i,1; .@i<=3; set .@i,.@i+1) {
		mes "�n���E" +(2<<.@i)+ "�l���[�h�̗D����";
		mes "^4D4DFF"+ $TurboNameE$[.@i] +"^000000";
	}
	close;
}

turbo_room,112,114,3	duplicate(�n�����[�h�D���҃��X�g#)	�n�����[�h�D���҃��X�g	857

turbo_room,102,117,3	script	���_�̓a��	857,{
	mes "[�A���f�o�����^�[�{�g���b�N";
	mes " �@�@�@�@�@�@�@�@���_�̓a��]";
	mes "��l�ځF";
	mes "^4A4AFF"+ $TurboGreat$[1] +"^000000";
	mes " ";
	mes "��l�ځF";
	mes "^4A4AFF"+ $TurboGreat$[2] +"^000000";
	close;
}

turbo_room,97,117,5	script	�폟�����o�[	857,{
	mes "[�^�[�{�g���b�N�ő��D����]";
	mes " ";
	for(set .@i,1; .@i<=5; set .@i,.@i+1)
		mes .@i+ "�ʁF^4D4DFF"+ $TurboTop$[.@i] +"^000000";
	close;
}

turbo_room,99,120,3	script	�^�[�{�g���b�N�K�C�h	124,{
	mes "[�^�[�{�g���b�N�K�C�h]";
	mes "�^�[�{�g���b�N�̂��ē������܂��傤�B";
	mes "�������m��ɂȂ肽���ł���?";
	next;
	while(1) {
		switch(select("���[��","�e�R�[�X","�e���[�h","���ɂ���܂���")) {
		case 1:
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "���[���͊ȒP�ł��B";
			mes "��Q�������z���āA�ł��邾������";
			mes "�S�[���ɒH�蒅���΂悢�̂ł��B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�A���A�I��̕��X�̐g�ɂ�";
			mes "�l�X�ȏ󋵂������������܂��B";
			mes "����ǂ��A��̓I�ɉ����N���邩��";
			mes "�\���グ�邱�Ƃ͂ł��܂���B";
			mes "���������������B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�i�C�g�⃍�[�h�i�C�g�A�N���Z�C�_�[�A";
			mes "�p���f�B���̗l�ɁA�y�R�y�R��";
			mes "����Ă�����������X�́A";
			mes "���O�Ƀy�R�y�R����~��Ă��������B";
			mes "�y�R�y�R�ւ̋R��́A";
			mes "���Z�I����ɂ��肢���܂��B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "��ԍŏ��ɃS�[����";
			mes "�H�蒅���������D���ƂȂ�܂��B";
			mes "�N�����S�[���C���������_��";
			mes "���Z�͏I���ƂȂ�A�S���A";
			mes "�����I�ɍT�����֓]������܂��B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�܂��A���Z�J�n��A";
			mes "��莞�Ԃ��o�߂����";
			mes "�D���҂��m�肵�Ȃ��Ă����Z�͏I�����A";
			mes "�S���E���Ƃ���܂��B";
			mes "�~���Ȏ����i�s�̂��߂̃��[���ł��̂�";
			mes "���������������B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�Q���ɍۂ��āA";
			mes "�E�Ƃ̐����͂������܂��񂪁A";
			mes "BaseLv10�ȏ�̕����ΏۂƂȂ�܂��B";
			mes "�܂��A�Q�����ɓ��ꗿ�Ƃ���";
			mes "1000Zeny���K�v�ł��B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "���Z���@�Ɋւ���ē���";
			mes "�ȏ�ɂȂ�܂��B";
			mes "���ɉ����m�肽�����Ƃ͂������܂����H";
			next;
			continue;
		case 2:
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�R�[�X�Ɋւ��Ă��ē������܂��B";
			mes "��Ƀ^�[�{�g���b�N�̑S�̍\���ɂ���";
			mes "���������܂��傤�B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�^�[�{�g���b�N�́A";
			mes "^4A4AFF�ۑ����A���̋u�A";
			mes "�􂢂ƍ����̍����A�Í��̖��H�A";
			mes "�����ނ�A�ւ̓��A";
			mes "�����ȓ��A�A�����Ȃ����H����";
			mes "�\������Ă��܂��B^000000";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�R�[�X�̍\���ɂ̓��[�h�ʂ̍���";
			mes "��������܂����A��{�I�ɂ�";
			mes "�X�^�[�g�n�_�ƃS�[���n�_������";
			mes "�v7��ނ̃R�[�X�ō\������Ă��܂��B";
			mes "�e�R�[�X�̏ڍׂ����������܂��傤�B";
			next;
			while(1) {
				switch(select("�ۑ����A���̋u�Ƃ́H","�􂢂ƍ����̍����A�Í��̖��H�Ƃ́H","�����ނ�A�����Ȃ����H�Ƃ́H","�ւ̓��A�����ȓ��A�Ƃ́H","�����͂���܂���")) {
				case 1:
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�ۑ����Ƃ������t�ʂ�A���Z��";
					mes "�ŏ��̃R�[�X�͊ۑ��̋���n��܂��B";
					mes "����ė����Ă��܂����ꍇ��";
					mes "�ŏ�����n�蒼���ƂȂ�܂��B";
					mes "�����A���Ӑ[���n�邱�Ƃ�";
					mes "�S������Ƃ悢�ł��傤�B";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "���̋u�͌��t�ʂ�A";
					mes "�����ςݏグ���Č`�����ꂽ�u�ł��B";
					mes "�������z����΁A���̃R�[�X��";
					mes "�i�ނ��Ƃ��ł��܂��B";
					mes "���܂����͂Ȃ��Ǝv���܂��B";
					next;
					continue;
				case 2:
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�􂢂ƍ����̍����́A������";
					mes "�ʉ߂���΂悢�̂ł����c�c";
					mes "�ǂ�Ȃ��Ƃ��N���邩�́A";
					mes "�\���ł��܂���B";
					mes "�܂��ɂ��̖��̂��Ƃ��A�􂢂ƍ�����";
					mes "���ӂ�Ă��܂�����ˁB";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�Í��̖��H�́A㩂�";
					mes "�ݒu����Ă��镡�G�Ȗ��H�ł��B";
					mes "�W�O�U�O�Ȑ��H�̒��ɁA�ǂ��";
					mes "㩂��d�|�����Ă��邩�́A";
					mes "���ł�������܂���B";
					next;
					continue;
				case 3:
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�����ނ�́A�����ނ�̔�̗l��";
					mes "�O���O���Ɖ��ד��̃R�[�X�ł��B";
					mes "���ɗ��Ƃ����݂����ȕ���";
					mes "����܂���̂ŁA";
					mes "�������蔲����΂悢�ł��B";
					mes "�ł��A�ƂĂ�����Â炢�ł����ǂˁB";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�����Ȃ����H�́A�L���R�[�X�ł��B";
					mes "�o���܂ő��蔲���邾����";
					mes "�悢�̂ł����A�����Ȃ��ǂ�����";
					mes "�ǂ��ł��܂��B���Z���ɗ^������";
					mes "�q���g���Q�l�ɂ��Ă��������B";
					mes "�܂��Ɍ����Ȃ����H�ł������";
					next;
					continue;
				case 4:
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�ւ̓��́A�܂�Ŏւ̗l��";
					mes "�Ȃ��肭�˂������ł��B";
					mes "�ǂ����ăT�C�R����";
					mes "�\������Ă���̂����āH�@����́A";
					mes "�T�C�R���̂悤�ȋ��R�ɔ�߂�ꂽ";
					mes "�K�^���A���ɉB����Ă��邩��ł��B";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�ǂ������Ӗ������ڂ����m�肽����΁A";
					mes "���ڑ̌����Ă݂Ă��������B";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "�����ȓ��A�́A�t�F�C�����̂ǂ�����";
					mes "����ƌ����Ă��铴�A�̃_���W������";
					mes "��������Č��������ł��B";
					mes "�_���W������T���������ŁA";
					mes "�y����ł��������B";
					next;
					continue;
				case 5:
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "������܂����B";
					mes "�R�[�X�Ɋւ�������́A";
					mes "���v�Ȃ悤�ł��ˁB";
					next;
					mes "[�^�[�{�g���b�N�K�C�h]";
					mes "���ɉ����m�肽�����Ƃ�";
					mes "�������܂����H";
					next;
					break;
				}
				break;
			}
			break;
		case 3:
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�e���Z���[�h�ɂ���";
			mes "���ē����܂��傤�B";
			mes "���Z�͈�ʃ��[�h�A�n�����[�h�A";
			mes "1�l���[�h��3��ނ���܂��B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "��������ꕔ�A�g�p�����������";
			mes "�X�L��������܂��B�܂���ʃ��[�h��";
			mes "�قȂ�A^4A4AFF�n�����[�h�͑��I���";
			mes "�΂��Ă̍U�����\^000000�ł��B";
			mes "�p�[�e�B�[��M���h�΍R���";
			mes "�s���̂ɂ��傤�ǂ悢�ł��傤�B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "���ꂩ��e���[�h���A";
			mes "^0000FF1�A16�l�p���Z��̂݁A";
			mes "�����Ȃ����H���ǉ�^000000����܂��B";
			mes "4�l�p�A8�l�p�ɂ́A";
			mes "���̃R�[�X�͂������܂���B";
			mes "���炩���߂��������������B";
			next;
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�Ȃ��A1�l���[�h�ɂ�";
			mes "�S�ẴR�[�X���܂܂�Ă��܂��B";
			mes "�����ł́A1�ԑ����N���A��������";
			mes "���O���L�^����܂��B";
			mes "�F������V�L�^��";
			mes "���킵�Ă݂Ă��������B";
			next;
			continue;
		case 4:
			mes "[�^�[�{�g���b�N�K�C�h]";
			mes "�����͂����\���ł����H";
			mes "�y�����ꎞ���߂�����Ƃ����ł��ˁB";
			mes "���肪�Ƃ��������܂����B";
			close;
		}
	}
}

turbo_room,93,117,5	script	�i�i������	125,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ���";
		mes "�������߁A�A�C�e�����󂯂Ƃ�";
		mes "���Ƃ��ł��܂���B";
		mes "�����A�C�e�������炵�Ă���";
		mes "�ēx�b�������Ă��������B�]";
		close;
	}
	if(TURBO_POINT >= 10) {
		mes "[�i�i������]";
		mes "����ɂ��́B";
		mes strcharinfo(0) +"�l��";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes TURBO_POINT +"�_�ł��B";
		mes "�i�i�ƌ������܂����H";
		next;
		if(select("��������","��߂�")==2) {
			mes "[�i�i������]";
			mes "�^�[�{�g���b�N�|�C���g�́A";
			mes "�A���[�i�|�C���g��";
			mes "�������邱�Ƃ��ł��܂��B";
			mes "�������A�A���[�i�|�C���g��";
			mes "�^�[�{�g���b�N�|�C���g��";
			mes "�������邱�Ƃ��\�ł��B";
			next;
			mes "[�i�i������]";
			mes "�^�[�{�g���b�N�|�C���g��";
			mes "�ςݗ��Č��E�́A^4A4AFF29,000^000000�_�ł��B";
			mes "����ȏ�́A������S�[���Ȃ����Ă�";
			mes "�|�C���g�͉��Z����܂���B";
			mes "�|�C���g�͐����A���g�p���������B";
			close;
		}
		mes "[�i�i������]";
		mes "�ł́A���莝����";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "�l�����ꂽ��ŁA�i�i��";
		mes "���I�т��������B";
		next;
		switch(select("��Ԉړ��������p��","Lv5�X�N���[��","�o���l","�^�[�{�g���b�N�R�C��","���x�ω��|�[�V����","�Â�����","�Â����F�̔�","�Â��J�[�h��","����ς�A��߂Ă���")) {
		case 1:
			set .@point,10;
			set .@max,50;
			set .@itemid,7060;
			break;
		case 2:
			mes "[�i�i������]";
			mes "Lv5�X�N���[���ł��ˁB";
			mes "Lv5�X�N���[��1�ɂ�";
			mes "^4A4AFF12�_^000000�K�v�ł��B";
			mes "�ǂ̃X�N���[���ƌ������܂����H";
			mes "�Ȃ��A������̃X�N���[���Ŏg�p�ł���";
			mes "�X�L���͑S��Lv5�ɂȂ�܂��B";
			next;
			set .@itemid,685+(2*select("�A�[�X�X�p�C�N","�R�[���h�{���g","�t�@�C�A�[�{���g","���C�g�j���O�{���g",
				"�\�E���X�g���C�N","�t�@�C�A�[�{�[��","�t�@�C�A�[�E�H�[��","�t���X�g�_�C�o�[","�q�[��"));
			if(.@itemid > 700)
				set .@itemid,.@itemid+11299;
			set .@point,12;
			set .@max,50;
			break;
		case 3:
			mes "[�i�i������]";
			mes "�o���l�ł��ˁB";
			mes "�����ɂ�40�_�K�v�ł��B";
			mes "�������܂����H";
			next;
			if(select("��߂Ă���","��������")==1) {
				mes "[�i�i������]";
				mes "�������܂����B";
				close;
			}
			if(TURBO_POINT < 40) {
				mes "[�i�i������]";
				mes "�^�[�{�g���b�N�|�C���g������܂���B";
				mes "���莝���̃|�C���g����";
				mes "�m�F�Ȃ����Ă��炨�z�����������B";
				close;
			}
			set TURBO_POINT,TURBO_POINT-40;
			if(BaseLevel >= 90) 			getexp 30000,0;
			if(BaseLevel >= 80 && BaseLevel < 90) 	getexp 10000,0;
			if(BaseLevel >= 70 && BaseLevel < 80) 	getexp 9000,0;
			if(BaseLevel < 70) 			getexp 3000,0;
			mes "[�i�i������]";
			mes "�^�[�{�g���b�N�|�C���g��";
			mes "�o���l�Ɍ������܂����B";
			close;
		case 4:
			mes "[�i�i������]";
			mes "�^�[�{�g���b�N�R�C���ł��ˁB";
			mes "�^�[�{�g���b�N�R�C�� 1���ɂ�";
			mes "^3131FF60�_^000000�K�v�ł��B";
			next;
			mes "[�i�i������]";
			mes "�����������ꍇ�́A";
			mes "�u0�v�Ƃ���������Ă��������B";
			mes "�^�[�{�g���b�N�R�C��������";
			mes "�������܂����H";
			next;
			input .@num;
			if(.@num == 0) {
				mes "[�i�i������]";
				mes "�������܂����B";
				close;
			}
			if(.@num < 0) {
				mes "[�i�i������]";
				mes "�����������Ȃ��悤�ł��B";
				close;
			}
			if(TURBO_POINT < .@num*60) {
				mes "[�i�i������]";
				mes "�^�[�{�g���b�N�|�C���g������܂���B";
				mes "���莝���̃|�C���g����";
				mes "�m�F�Ȃ����Ă��炨�z�����������B";
				close;
			}
			set TURBO_POINT,TURBO_POINT-.@num*60;
			getitem 6366,.@num;
			mes "[�i�i������]";
			mes "�����p���肪�Ƃ��������܂����B";
			close;
		case 5:
			set .@point,100;
			set .@max,10;
			set .@itemid,12016;
			break;
		case 6:
			set .@point,100;
			set .@max,10;
			set .@itemid,603;
			break;
		case 7:
			set .@point,300;
			set .@max,10;
			set .@itemid,617;
			break;
		case 8:
			mes "[�i�i������]";
			mes "�Â��J�[�h���ł��ˁB";
			mes "�Â��J�[�h�� 1���ɂ�";
			mes "^3131FF1000�_^000000�K�v�ł��B";
			next;
			mes "[�i�i������]";
			mes "��x�Ɍ����ł���̂́A";
			mes "10�܂łƂȂ�܂��B";
			mes "�����������ꍇ�́A";
			mes "�u0�v�Ƃ���������Ă��������B";
			mes "�Â��J�[�h��������";
			mes "�������܂����H";
			next;
			input .@num;
			if(.@num == 0) {
				mes "[�i�i������]";
				mes "�������܂����B";
				close;
			}
			if(.@num < 0 || .@num > .@max) {
				mes "[�i�i������]";
				mes "�����\���𒴂��Ă��܂��B��x��";
				mes "�����ł���̂�10�܂łƂȂ�܂��B";
				close;
			}
			if(TURBO_POINT < .@num*1000) {
				mes "[�i�i������]";
				mes "�^�[�{�g���b�N�|�C���g������܂���B";
				mes "���莝���̃|�C���g����";
				mes "�m�F�Ȃ����Ă��炨�z�����������B";
				close;
			}
			set TURBO_POINT,TURBO_POINT-.@num*1000;
			getitem 616,.@num;
			mes "[�i�i������]";
			mes "�����p���肪�Ƃ��������܂����B";
			close;
		case 9:
			mes "[�i�i������]";
			mes "�|�C���g�̌i�i������";
			mes "���ł��\�ł��B";
			mes "�ǂ��������p���������B";
			next;
			mes "[�i�i������]";
			mes "�Ȃ��A�i�i�́c�c";
			mes "�A���f�o�����J�v���T�[�r�X�{��";
			mes "�u���b�N�X�~�X�M���h";
			mes "�R���h�J�W�m";
			mes "�̋��^���󂯂Ă��܂��B";
			next;
			mes "[�i�i������]";
			mes "�܂��A�ꏊ�́c�c";
			mes "�A���f�o�����q���s�s";
			mes "���C�[�i�M���h�ԘA��";
			mes "�ɂ��񋟂��Ē����Ă܂��B";
			mes "���肪�Ƃ��������܂����B";
			close;
		}
		mes "[�i�i������]";
		mes getitemname(.@itemid)+ "�ł��ˁB";
		mes getitemname(.@itemid)+ "1�ɂ�";
		mes "^4A4AFF" +.@point+ "�_^000000�K�v�ł��B";
		next;
		mes "[�i�i������]";
		mes "��x�Ɍ����ł���̂́A";
		mes .@max+ "�܂łƂȂ�܂��B";
		mes "�����������ꍇ�́A";
		mes "�u0�v�Ƃ���������Ă��������B";
		mes getitemname(.@itemid)+ "���ƌ������܂����H";
		next;
		input .@num;
		if(.@num == 0) {
			mes "[�i�i������]";
			mes "�������܂����B";
			close;
		}
		if(.@num < 0 || .@num > .@max) {
			mes "[�i�i������]";
			mes "�����\���𒴂��Ă��܂��B��x��";
			mes "�����ł���̂�" +.@max+ "�܂łƂȂ�܂��B";
			close;
		}
		if(TURBO_POINT < .@num*.@point) {
			mes "[�i�i������]";
			mes "�^�[�{�g���b�N�|�C���g������܂���B";
			mes "���莝���̃|�C���g����";
			mes "�m�F�Ȃ����Ă��炨�z�����������B";
			close;
		}
		set TURBO_POINT,TURBO_POINT-.@num*.@point;
		getitem .@itemid,.@num;
		mes "[�i�i������]";
		mes "�����p���肪�Ƃ��������܂����B";
		close;
	}
	mes "[�i�i������]";
	mes "����ɂ��́B";
	mes strcharinfo(0) +"�l��";
	mes "�^�[�{�g���b�N�|�C���g��";
	mes TURBO_POINT +"�_�ł��B";
	next;
	mes "[�i�i������]";
	mes "�i�i�̈��������́A";
	mes "10�_�ȏォ��\�ł��B";
	mes "�i�i���X�g�������ɂȂ�܂����H";
	next;
	if(select("�i�i���X�g������","��߂Ă���")==2) {
		mes "[�i�i������]";
		mes "������܂����B";
		mes "�^�[�{�g���b�N���v��������";
		mes "�y����Ń|�C���g�����炢�A";
		mes "�i�i����������l�����Ă��������B";
		close;
	}
	mes "[�i�i������]";
	mes "�����Ώۂ̌i�i�Ɗe�i�i������";
	mes "�K�v�|�C���g�͎��̒ʂ�ł��B";
	next;
	mes "[�i�i������]";
	mes " 10 �_�F��Ԉړ��������p��";
	mes " 12 �_�FLv5�X�N���[��";
	mes " 40 �_�F�o���l";
	mes " 60 �_�F�^�[�{�g���b�N�R�C��";
	mes "100 �_�F���x�ω��|�[�V����";
	mes "100 �_�F�Â�����";
	mes "300 �_�F�Â����F�̔�";
	mes "1000 �_�F�Â��J�[�h��";
	close;
}

turbo_room,106,117,3	script	�|�C���g�Ǘ��l	833,{
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes "����ɂ��́B";
	mes "���Z�����y���ݒ������ł��傤���B";
	mes "���āA��������`�����܂��傤�H";
	next;
	if(select("�|�C���g�̊m�F","�^�[�{�g���b�N�|�C���g�Ƃ̌���")==1) {
		mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
		mes strcharinfo(0) +"�l��";
		mes "�|�C���g�͎��̒ʂ�ɂȂ�܂��B";
		mes "�^�[�{�g���b�N�|�C���g�F"+ TURBO_POINT +"�_";
		mes "�A���[�i�|�C���g�F"+ ARENA_POINT +"�_";
		next;
		mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
		mes "���]�݂ł���΁A�A���[�i�|�C���g��";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "�������邱�Ƃ��\�ł��B";
		mes "����l���Ă݂�Ƃ悢�ł��傤�B";
		close;
	}
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes strcharinfo(0) +"�l��";
	mes "�|�C���g�͎��̒ʂ�ɂȂ�܂��B";
	mes "�^�[�{�g���b�N�|�C���g�F"+ TURBO_POINT +"�_";
	mes "�A���[�i�|�C���g�F"+ ARENA_POINT +"�_";
	next;
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes "�A���[�i�|�C���g��";
	mes "�^�[�{�g���b�N�|�C���g��";
	mes "�������邱�Ƃ��ł��܂��B";
	next;
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes "���̍ۂ̌����䗦��";
	mes "�u�A���[�i�F�^�[�{�g���b�N���Q:�P�v";
	mes "�ƂȂ�܂��B�܂�c�c";
	mes "10�_�̃A���[�i�|�C���g�ɑ΂��A";
	mes "5�_�̃^�[�{�g���b�N�|�C���g��";
	mes "�󂯎�邱�ƂɂȂ�܂��B";
	next;
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes "�������@�����I�т��������B�A���A";
	mes "10�_�ȏ�̃|�C���g�����Ɋւ��Ă�";
	mes "^4A4AFF10�_�P�ʂ̌������c�c";
	mes "�܂�A�{��^000000����͂��Ă��������B";
	next;
	switch(select("�A���[�i 2�_ -> �^�[�{�g���b�N 1�_","�A���[�i 4�_ -> �^�[�{�g���b�N 2�_","�A���[�i 6�_ -> �^�[�{�g���b�N 3�_","�A���[�i 8�_ -> �^�[�{�g���b�N 4�_","�A���[�i�|�C���g 10�_�P��","������")) {
	default:
		set .@change_point,@menu*2;
		break;
	case 5:
		mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
		mes "�A���[�i�|�C���g��";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "^4A4AFF10�_�P�ʂŌ���^000000���܂��B";
		mes "^4A4AFF��x�Ɍ����ł���";
		mes "�A���[�i�|�C���g��";
		mes "10�_��20�{�A200�_�܂�^000000�ł��B";
		next;
		mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
		mes "�ł́A�A���[�i�|�C���g��10�_�̉��{";
		mes "�^�[�{�g���b�N�|�C���g�Ɍ������邩��";
		mes "���͂��Ă��������B";
		mes "�������ꍇ�́u0�v��";
		mes "���͂��Ă��������B";
		next;
		input .@change_point;
		if(.@change_point == 0) {
			mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
			mes "�������܂����B";
			close;
		}
		if(.@change_point < 0 || .@change_point > 20) {
			mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
			mes "�����\�͈͂𒴂��Ă��܂��B";
			mes "��x�Ɍ����ł���A���[�i�|�C���g��";
			mes "10�_��20�{�܂łł��B";
			close;
		}
		set .@change_point,.@change_point*10;
		break;
	}
	if(ARENA_POINT < .@change_point) {
		mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
		mes "�A���[�i�|�C���g���s�����Ă��܂��B";
		mes "�A���[�i�|�C���g�́A";
		mes .@change_point +"�_�ȏ�K�v�ł��B";
		mes "�A���[�i�|�C���g���ēx";
		mes "���m�F���������B";
		close;
	}
	set TURBO_POINT,TURBO_POINT+.@change_point/2;
	set ARENA_POINT,ARENA_POINT-.@change_point;
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes strcharinfo(0)+"�l��";
	mes "�A���[�i�|�C���g"+ .@change_point +"�_��";
	mes "�^�[�{�g���b�N�|�C���g"+ .@change_point/2 +"�_��";
	mes "�������܂����B";
	next;
	mes "[�^�[�{�g���b�N�|�C���g�K�C�h]";
	mes strcharinfo(0) +"�l��";
	mes "�|�C���g�͎��̒ʂ�ɂȂ�܂��B";
	mes "�^�[�{�g���b�N�|�C���g�F"+ TURBO_POINT +"�_";
	mes "�A���[�i�|�C���g�F"+ ARENA_POINT +"�_";
	mes "�����p�������肪�Ƃ��������܂����B";
	close;
}

//============================================================
// ���ʕ���
//------------------------------------------------------------
-	script	�R���p�j�I��#turbo	124,{
	mes "[�R���p�j�I��]";
	mes "������͍T�����ł��B";
	mes "�J�E���g�J�n��30�b�o�߂���ƁA";
	mes "�����ŋ��Z��֓]�����܂��B";
	mes "�����y�щ񕜃A�C�e����";
	mes "�m�F���Ă��������B";
	close;
OnStart:
	sleep 2000;
	announce "�ē�����: ������́A�^�[�{�g���b�N���Z�ɎQ������I��p�̍T�����ł��B",9;
	sleep 5000;
	announce "�ē�����: �J�E���g�J�n��30�b�o�߂���ƁA���Z��֎����œ]�����܂��B",9;
	sleep 3000;
	announce "�ē�����: �I��̕��́A�A�C�e�����̏�����m�F�����肢���܂��B",9;
	sleep 5000;
	announce "�ē�����: �J�E���g���J�n���܂��B",9;
	sleep 2000;
	announce "�ē�����: 30�b��ɋ��Z��֓]�����܂��B",9;
	sleep 10000;
	announce "�ē�����: 20�b��ɋ��Z��֓]�����܂��B",9;
	sleep 10000;
	announce "�ē�����: 10�b��ɋ��Z��֓]�����܂��B",9;
	sleep 5000;
	announce "�ē�����: 5�b��ɋ��Z��֓]�����܂��B",9;
	sleep 1000;
	announce "�ē�����: 4�b��ɋ��Z��֓]�����܂��B",9;
	sleep 1000;
	announce "�ē�����: 3�b��ɋ��Z��֓]�����܂��B",9;
	sleep 1000;
	announce "�ē�����: 2�b��ɋ��Z��֓]�����܂��B",9;
	sleep 1000;
	announce "�ē�����: 1�b��ɋ��Z��֓]�����܂��B",9;
	sleep 1000;
	announce "�ē�����: ���Z��֓]�����܂��B",9;
	sleep 2000;
	areawarp "this",290,152,305,171,strnpcinfo(2),59,364;
	monster strnpcinfo(2)+".gat",279,284,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",279,268,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",279,260,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",287,288,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",287,280,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",287,264,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",295,284,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",295,268,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",295,260,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",303,288,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",303,280,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",303,264,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",311,284,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",311,268,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",311,260,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",347,288,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",347,280,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",347,264,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",355,284,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",355,268,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",355,260,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",363,288,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",363,280,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",363,264,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",371,284,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",371,268,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",371,260,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",379,288,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",379,280,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",379,264,"�A�[�`���[�X�P���g��",1420,1;
	monster strnpcinfo(2)+".gat",47,87,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",47,87,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",47,87,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",24,74,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",24,74,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",24,74,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",67,42,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",67,42,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",67,42,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",60,70,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",60,70,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",60,70,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",32,51,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",32,51,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",32,51,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",30,25,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",30,25,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",30,25,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",68,56,"�q�F�O��",1612,1;
	monster strnpcinfo(2)+".gat",26,46,"�q�F�O��",1612,1;
	monster strnpcinfo(2)+".gat",62,20,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",62,20,"�{���S��",1611,1;
	monster strnpcinfo(2)+".gat",62,20,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",216,378,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",218,360,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",223,361,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",243,342,"���i�b�N",1610,1;
	monster strnpcinfo(2)+".gat",247,364,"���i�b�N",1610,1;
	if(strnpcinfo(2) == "turbo_n_16" || strnpcinfo(2) == "turbo_e_16") {
		monster strnpcinfo(2)+".gat",279,280,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",279,264,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",287,284,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",287,268,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",295,280,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",295,264,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",303,284,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",303,268,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",311,280,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",311,264,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",347,284,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",347,268,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",355,280,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",355,264,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",363,284,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",363,268,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",371,280,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",371,264,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",379,284,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",379,268,"�A�[�`���[�X�P���g��",1420,1;
		monster strnpcinfo(2)+".gat",68,56,"���i�b�N",1610,1;
		monster strnpcinfo(2)+".gat",68,56,"���i�b�N",1610,1;
		monster strnpcinfo(2)+".gat",26,46,"���i�b�N",1610,1;
		monster strnpcinfo(2)+".gat",26,46,"���i�b�N",1610,1;
	}
	sleep 7000;
	announce "�i�s��: �^�[�{�g���b�N�ւ̂���������}���܂��B",9;
	sleep 2000;
	announce "�i�s��: ���Z���Ԃ́A15���ł��B15���o�߂��Ă��S�[���ł��Ȃ���΁A�E���Ƃ��܂��B",9;
	sleep 2000;
	announce "�i�s��: ���̓_�͂悭�o���Ă����Ă��������B",9;
	sleep 2000;
	announce "�i�s��: �J�E���g�J�n��5�b�o�߂���ƁA���Z�J�n�ƂȂ�܂��B�I��̕��̓X�^�[�g�ʒu�ɗ����Ă��������B",9;
	sleep 2000;
	announce "�i�s��: ����ł̓J�E���g���n�߂܂��B",9;
	sleep 2000;
	announce "�i�s��: �]�T�]",9;
	sleep 1000;
	announce "�i�s��: �]�S�]",9;
	sleep 1000;
	announce "�i�s��: �]�R�]",9;
	sleep 1000;
	announce "�i�s��: �]�Q�]",9;
	sleep 1000;
	announce "�i�s��: �]�P�]",9;
	sleep 1000;
	announce "�i�s��: �]�O�]",9;
	sleep 1000;
	set getvariableofnpc(.time,strnpcinfo(0)),15;
	initnpctimer;
	announce "�i�s��: ���Z�J�n!!�@GO,GO,GO!!",9;
	hideonnpc "�t���C���O1#"+strnpcinfo(2);
	hideonnpc "�t���C���O2#"+strnpcinfo(2);
	sleep 7000;
	announce "�i�s��: ����������܂������A���Z���Ԃ́A15���ł��B15���o�ߌ�͒E���ƂȂ�܂��B",9;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
OnTimer360000:
OnTimer420000:
OnTimer480000:
OnTimer540000:
OnTimer600000:
OnTimer660000:
OnTimer720000:
OnTimer780000:
OnTimer840000:
	set getvariableofnpc(.time,strnpcinfo(0)),getvariableofnpc(.time,strnpcinfo(0))-1;
	announce "�i�s��: �c�莞�Ԃ́A" +getvariableofnpc(.time,strnpcinfo(0))+ "���ł��B",9;
	end;
OnTimer870000:
	announce "�i�s��: �c�莞�Ԃ́A30�b�ł��B",9;
	end;
OnTimer880000:
	announce "�i�s��: �c�莞�Ԃ́A20�b�ł��B",9;
	end;
OnTimer890000:
	announce "�i�s��: �c�莞�Ԃ́A10�b�ł��B",9;
	end;
OnTimer895000:
	announce "�i�s��: �c�莞�Ԃ́A5�b�ł��B",9;
	end;
OnTimer896000:
	announce "�i�s��: �c�莞�Ԃ́A4�b�ł��B",9;
	end;
OnTimer897000:
	announce "�i�s��: �c�莞�Ԃ́A3�b�ł��B",9;
	end;
OnTimer898000:
	announce "�i�s��: �c�莞�Ԃ́A2�b�ł��B",9;
	end;
OnTimer899000:
	announce "�i�s��: �c�莞�Ԃ́A1�b�ł��B",9;
	end;
OnTimer900000:
	announce "�i�s��: �������ԂɂȂ�܂����B",9;
	sleep 2000;
	announce "�i�s��: ���Z���I�����܂����B",9;
	sleep 2000;
	announce "�i�s��: �T�����֑ޏ�ɂȂ�܂��B",9;
	sleep 2000;
	stopnpctimer;
	areawarp "this",0,0,400,400,"turbo_room",71,89;
	killmonsterall "this";
	hideoffnpc "�t���C���O1#"+strnpcinfo(2);
	hideoffnpc "�t���C���O2#"+strnpcinfo(2);
	hideoffnpc "�ÈőI��#"+strnpcinfo(2);
	hideoffnpc "�Èŏo��1#"+strnpcinfo(2);
	hideoffnpc "�Èŏo��2#"+strnpcinfo(2);
	hideoffnpc "�g�b�v1#"+strnpcinfo(2);
	hideoffnpc "�g�b�v2#"+strnpcinfo(2);
	hideoffnpc "�g�b�v3#"+strnpcinfo(2);
	hideoffnpc "�S�[��1#"+strnpcinfo(2);
	if(strnpcinfo(2) != "turbo_n_1") {
		hideoffnpc "�W�Q1#"+strnpcinfo(2);
		hideonnpc "�W�Q2#"+strnpcinfo(2);
		if(strnpcinfo(2) != "turbo_n_4" && strnpcinfo(2) != "turbo_e_4") {
			hideonnpc "�S�[��2#"+strnpcinfo(2);
			hideonnpc "�S�[��3#"+strnpcinfo(2);
		}
	}
	if(strnpcinfo(2) == "turbo_n_1") enablewaitingroomevent "1�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_4") enablewaitingroomevent "��ʁE4�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_8") enablewaitingroomevent "��ʁE8�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_16") enablewaitingroomevent "��ʁE16�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_4") enablewaitingroomevent "�n���E4�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_8") enablewaitingroomevent "�n���E8�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_16") enablewaitingroomevent "�n���E16�l���[�h#turbo";
	end;
}

-	script	�t���C���O1#turbo	139,{
	warp strnpcinfo(2)+".gat",59,364;
	end;
}

-	script	�t���C���O2#turbo	139,{
	warp strnpcinfo(2)+".gat",59,364;
	end;
}

-	script	���Ƃ���#turbo	-1,{
	switch(rand(3)) {
	case 0:	warp strnpcinfo(2)+".gat",72,372; break;
	case 1:	warp strnpcinfo(2)+".gat",72,365; break;
	case 2:	warp strnpcinfo(2)+".gat",72,357; break;
	}
	end;
}

-	script	���[�v#turbo	-1,{
	switch(rand(20)) {
	case 0: warp strnpcinfo(2)+".gat",216,378; break;
	case 1: warp strnpcinfo(2)+".gat",218,360; break;
	case 2: warp strnpcinfo(2)+".gat",223,361; break;
	case 3: warp strnpcinfo(2)+".gat",243,342; break;
	case 4: warp strnpcinfo(2)+".gat",247,364; break;
	}
	end;
}

-	script	�g���b�v#turbo	139,{
	switch(rand(10)) {
	case 0: sc_start3 SC_CONFUSION,0,0,0,0,8000,10; emotion 19; break;
	case 1: sc_start3 SC_CURSE,0,0,0,0,8000,10; break;
	case 2: sc_start3 SC_STONE,0,0,0,0,4000,10; break;
	case 3: sc_start3 SC_SLEEP,0,0,0,0,4000,10; break;
	case 4: sc_start3 SC_FREEZE,0,0,0,0,4000,10; emotion 19; break;
	case 5: sc_start3 SC_STUN,0,0,0,0,4000,10; break;
	case 6: sc_start3 SC_CONFUSION,0,0,0,0,8000,10; break;
	}
	end;
}

-	script	�L��#turbo	139,{
	if(rand(3)) {
		sc_start3 SC_CONFUSION,0,0,0,0,4000,10;
		end;
	}
	cutin "kafra_03",2;
	mes "-^9473DE����́c�c�L���̂悤���B^000000-";
	next;
	mes "^4A4AFF�A���f�o�����^�[�{�g���b�N��";
	mes "^840000�J�v���T�[�r�X^4A4AFF�����^���Ă��܂��B^000000";
	next;
	mes "^8A0000�J�v���T�[�r�X^4A4AFF��";
	mes "^FF6342����^000000�A^008400�M�p^000000�A^0000CE����^4A4AFF���O�匴���Ƃ�^000000";
	mes "�q�ɁA�ʒu�Z�[�u�A��Ԉړ��T�[�r�X^4A4AFF��";
	mes "�񋟂��Ă���܂��B^000000";
	next;
	mes "^4A4AFF���ǂ�^840000�J�v���T�[�r�X^4A4AFF��";
	mes "�����p���Ă�������F�l�ւ�";
	mes "���ӂ̋C������[���S�ɍ��݂A";
	mes "^840000�J�v���T�[�r�X^4A4AFF�́A�F�l��";
	mes "���K����S��肨�F�肵�Ă���܂��B^000000";
	next;
	mes "-^9473DE���b�Z�[�W�͂����܂ł��B^000000";
	mes "�c�c�c�c";
	mes "����A���̕��ɂ���ȋL�q���c�c-";
	mes " ";
	mes "-^FF0000�^�[�{�g���b�N";
	mes "^FF5200�����̗��Ƃ���!!^000000";
	mes "�^�S������^840000�J�v���T�[�r�X��^000000-";
	close2;
	cutin "kafra_03",255;
	end;
}

-	script	�ÈőI��#turbo	139,1,1,{
	disablenpc "�Èŏo��"+rand(1,2)+"#"+strnpcinfo(2);
	hideonnpc;
	end;
}

-	script	�È�#turbo	-1,{
	sc_start3 SC_BLIND,0,0,0,0,600000,10;
	end;
}

-	script	�Èŉ���#turbo	139,{
	sc_end SC_BLIND;
	end;
}

-	script	�W�Q#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",217,232; break;
	case 1: warp strnpcinfo(2)+".gat",233,207; break;
	case 2: warp strnpcinfo(2)+".gat",208,219; break;
	case 3: warp strnpcinfo(2)+".gat",219,202; break;
	case 4: warp strnpcinfo(2)+".gat",218,228; break;
	case 5: if(strnpcinfo(1) == "�W�Q2")
			warp strnpcinfo(2)+".gat",220,195;
		break;
	}
	if(strnpcinfo(1) == "�W�Q1") {
		hideonnpc;
		hideoffnpc "�W�Q2#"+strnpcinfo(2);
	}
	end;
OnInit:
	if(strnpcinfo(1) == "�W�Q2")
		hideonnpc;
	end;
}

-	script	�ւ̓�1#turbo	45,{
	switch(rand(7)) {
	case 0:
	case 1: warp strnpcinfo(2)+".gat",370,292; break;
	case 2:
	case 3: warp strnpcinfo(2)+".gat",295,293; break;
	case 4:
	case 5: warp strnpcinfo(2)+".gat",355,292; break;
	case 6: warp strnpcinfo(2)+".gat",279,292; break;
	}
	end;
}

-	script	�ւ̓�2#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",287,256; break;
	case 1: warp strnpcinfo(2)+".gat",303,256; break;
	case 2: warp strnpcinfo(2)+".gat",347,256; break;
	case 3: warp strnpcinfo(2)+".gat",363,256; break;
	}
	end;
}

-	script	�ւ̓�3#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",279,292; break;
	case 1: warp strnpcinfo(2)+".gat",311,292; break;
	case 2: warp strnpcinfo(2)+".gat",347,256; break;
	case 3: warp strnpcinfo(2)+".gat",370,292; break;
	}
	end;
}

-	script	�ւ̓�4#turbo	45,{
	switch(rand(7)) {
	case 0:
	case 1: warp strnpcinfo(2)+".gat",363,256; break;
	case 2:
	case 3: warp strnpcinfo(2)+".gat",295,293; break;
	case 4:
	case 5: warp strnpcinfo(2)+".gat",355,292; break;
	case 6: warp strnpcinfo(2)+".gat",287,256; break;
	}
	end;
}

-	script	�ʘH#turbo	-1,{
	emotion 1,"";
	end;
}

-	script	���H#turbo	-1,{
	emotion 0,"";
	end;
}

-	script	�q���g#turbo	-1,{
	emotion 19,"";
	if(rand(4))
		end;
	if(strnpcinfo(1) == "�q���g1") emotion 0,"���H1#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "�q���g2") emotion 0,"���H2#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "�q���g3") emotion 0,"�ʘHi#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "�q���g4") emotion 0,"�ʘHj#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "�q���g6" || strnpcinfo(1) == "�q���g7") emotion 0,"�ʘHl#"+strnpcinfo(2);
	end;
}

-	script	�u���X�g#turbo	139,{
	switch(rand(10)) {
	case 0:
	case 1:
	case 2: misceffect 106; percentheal -1,0; break;
	case 3:
	case 4:
	case 5: misceffect 106; percentheal -5,0; break;
	case 6: misceffect 106; percentheal -2,0; break;
	}
	end;
}

-	script	�t���[�W���O#turbo	139,{
	switch(rand(10)) {
	case 0:
	case 1:
	case 2: misceffect 108; percentheal -1,0; break;
	case 3:
	case 4:
	case 5: misceffect 108; percentheal -5,0; sc_start3 SC_FREEZE,0,0,0,0,3000,10; break;
	case 6: misceffect 108; percentheal -2,0; sc_start3 SC_FREEZE,0,0,0,0,4000,10; break;
	}
	end;
}

-	script	�ʉ�1#turbo	45,{
	announce strcharinfo(0) +"�l���A�ۑ����R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",210,369; break;
	case 1: warp strnpcinfo(2)+".gat",210,361; break;
	case 2: warp strnpcinfo(2)+".gat",210,354; break;
	}
	end;
}

-	script	�ʉ�2#turbo	45,{
	announce strcharinfo(0) +"�l���A���̋u�R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",316,365;
	end;
}

-	script	�ʉ�3#turbo	45,{
	announce strcharinfo(0) +"�l���A�􂢂ƍ����̍����R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",46,254; break;
	case 1: warp strnpcinfo(2)+".gat",76,227; break;
	case 2: warp strnpcinfo(2)+".gat",42,197; break;
	case 3: warp strnpcinfo(2)+".gat",86,220; break;
	}
	end;
}

-	script	�Èŏo��#turbo	45,{
	announce strcharinfo(0) +"�l���A�Í��̖��H�R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",185,227;
	end;
}

-	script	�ʉ�5#turbo	45,{
	announce strcharinfo(0) +"�l���A�����ނ�R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",268,275;
	end;
}

-	script	�ʉ�6#turbo	45,{
	announce strcharinfo(0) +"�l���A�ւ̓��R�[�X��ʉ߂��܂����I",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",5,91;
	end;
}

-	script	�ʉ�7#turbo	45,{
	if(strnpcinfo(2) == "turbo_n_1" || strnpcinfo(2) == "turbo_n_16" || strnpcinfo(2) == "turbo_e_16") {
		announce strcharinfo(0) +"�l���A�����ȓ��A�R�[�X��ʉ߂��܂����I",9,0x73DEDE;
		warp strnpcinfo(2)+".gat",167,55;
		end;
	}
	announce strcharinfo(0) +"�l���A�����ȓ��A�R�[�X��ʉ߁I�@�Ō�̃R�[�X�֓���܂���!!",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",307,52; break;
	case 1: warp strnpcinfo(2)+".gat",307,46; break;
	case 2: warp strnpcinfo(2)+".gat",307,40; break;
	}
	end;
}

-	script	�ʉ�8#turbo	45,{
	announce strcharinfo(0) +"�l���A�����Ȃ����H�R�[�X��ʉ߁I�@�Ō�̃R�[�X�֓���܂���!!",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",307,52; break;
	case 1: warp strnpcinfo(2)+".gat",307,46; break;
	case 2: warp strnpcinfo(2)+".gat",307,40; break;
	}
	end;
}

-	script	�g�b�v1#turbo	139,{
	if(strnpcinfo(2) == "turbo_n_1")
		announce "����"+ strcharinfo(0) +"�l���A�����ނ�R�[�X�𑖂��Ă���܂��I",9;
	else
		announce strcharinfo(0) +"�l���A�����ނ�R�[�X�ɓ���܂����I�@���݁A�擪�𑖂��Ă��܂�!!",9;
	hideonnpc;
	end;
}

-	script	�g�b�v2#turbo	139,{
	announce strcharinfo(0) +"�l���A�����ȓ��A�R�[�X�ɓ���܂����I",9;
	if(strnpcinfo(2) == "turbo_n_1") mapannounce "turbo_room","1�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_4") mapannounce "turbo_room","��ʁE4�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_8") mapannounce "turbo_room","��ʁE8�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_16") mapannounce "turbo_room","��ʁE16�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_4") mapannounce "turbo_room","�n���E4�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_8") mapannounce "turbo_room","�n���E8�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_16") mapannounce "turbo_room","�n���E16�l���[�h�̋��Z���A�܂��Ȃ��I�����܂��B",0,0xADFF2F;
	hideonnpc;
	end;
}

-	script	�g�b�v3#turbo	139,{
	announce strcharinfo(0) +"�l���S�[���֌����āA���X�g�X�p�[�g�������Ă���܂�!!",9;
	hideonnpc;
	end;
}

//callfunc "TurboGoal","MapName",GetPoint,GoalNum,TurboMode;
function	script	TurboGoal	{
	if(getarg(0) != "turbo_n_1") {
		announce strcharinfo(0) +"�l���A" +getarg(2)+ "�ʂŃS�[�����܂���!!",9;
		set TURBO_POINT,TURBO_POINT+getarg(1);
		if(getarg(2) == 1) {
			if(getarg(3) < 10)
				set $TurboNameN$[getarg(3)],strcharinfo(0);
			else
				set $TurboNameE$[getarg(3)%10],strcharinfo(0);
			mapannounce "turbo_room","���߂łƂ��������܂��I"+strcharinfo(0)+"�l���A"+((getarg(3) < 10)? "���": "�n��")+"�E"+(1<<(getarg(3)%10)+1)+"���[�h��D�����܂���!!",0,0x70DBDB;
			warp getarg(0)+".gat",384,161;
		}
		else {
			warp "turbo_room",71,89;
		}
	}
	else {
		announce strcharinfo(0) +"�l���S�[�����܂���!!",9;
		set .@time,getnpctimer(0,"�R���p�j�I��#turbo_n_1");
		if(.@time <= $TurboTime || $TurboTime == 0) {
			set $TurboNameN$[0],strcharinfo(0);
			set $TurboTime,.@time;
			set TURBO_POINT,TURBO_POINT+30;
		}
		set TURBO_POINT,TURBO_POINT+getarg(1);
		warp getarg(0)+".gat",384,161;
	}
	hideonnpc;
	if(getarg(2) < 3 && (getarg(0) == "turbo_n_8" || getarg(0) == "turbo_e_8" || getarg(0) == "turbo_n_16" || getarg(0) == "turbo_e_16"))
		hideoffnpc "�S�[��" +(getarg(2)+1)+ "#" +getarg(0);
	else {
		stopnpctimer "�R���p�j�I��#"+strnpcinfo(2);
		donpcevent ((getarg(0) == "turbo_n_1")? "�i�s�v��": "�D���҃K�C�h")+ "#" +getarg(0)+ "::OnStart";
	}
	return;
}

-	script	�i�s�v��#turbo	47,{
	if(strnpcinfo(2) == "turbo_n_1") {
		mes "[�K�C�h]";
		mes "�����l�ł����`�I";
		mes "��������Ă��������܂��傤�B";
		percentheal 100,100;
		next;
		mes "[�K�C�h]";
		mes "�^�[�{�g���b�N�|�C���g";
		mes "�������グ�܂����A";
		mes "�|�C���g����t���Ǝx������܂���B";
	}
	else {
		mes "[�K�C�h]";
		mes strcharinfo(0)+ "�l�A";
		mes "�D�����߂łƂ��������܂��B";
		mes "�ł́A�D���҃|�C���g0�_��";
		mes "�x�����܂��B";
		mes "����ō��v" +TURBO_POINT+ "�_�ɂȂ�܂��B";
		set TURBO_WIN,TURBO_WIN+1;
		next;

		mes "[�K�C�h]";
		mes "��������D������ƁA�폟�����o�[��";
		mes "���邱�Ƃ��ł��܂��B�X�ɗD�G�Ȑ��т�";
		mes "���߂܂��ƁA�a���ɓo�^����܂��B";
		mes "����͂ƂĂ����_���邱�Ƃł�!!";
		mes strcharinfo(0)+ "�l��";
		mes "���킵�Ă݂Ă��������B";
	}
	next;
	mes "[�K�C�h]";
	mes "���^�[�{�g���b�N�������p��������";
	mes "���肪�Ƃ��������܂����B";
	mes "�T�����֑���܂��傤�B";
	close2;
	warp "turbo_room",72,89;
	end;
OnStart:
	sleep 4000;
	if(strnpcinfo(2) == "turbo_n_1") announce "�^�[�{�g���b�N1�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_4") announce "�^�[�{�g���b�N��ʁE4�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_8") announce "�^�[�{�g���b�N��ʁE8�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_16") announce "�^�[�{�g���b�N��ʁE16�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_4") announce "�^�[�{�g���b�N�n���E4�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_8") announce "�^�[�{�g���b�N�n���E8�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_16") announce "�^�[�{�g���b�N�n���E16�l���[�h���Z�̏I���Ɋւ��邲�ē��ł��B",9,0x31FF63;
	sleep 4000;
	announce "�~���Ȑi�s�̂��߁A�������1����ɋ��Z��S�ďI�����A",9,0x31FF63;
	sleep 4000;
	announce "�����Ń��[�v���쓮���܂��B",9,0x31FF63;
	sleep 4000;
	announce "���Z����ɂ���I��̕��́A���Z�I���̏��������A",9,0x31FF63;
	sleep 4000;
	announce "���₩�ɂ��葱�������ς܂����������B",9,0x31FF63;
	sleep 4000;
	announce "�{���͓��A���f�o�����^�[�{�g���b�N�������p���������A���肪�Ƃ��������܂����B",9,0x31FF63;
	sleep 4000;
	announce "�A���f�o�����^�[�{�g���b�N��",9,0x31FF63;
	sleep 4000;
	announce "[�A���f�o�����J�v���T�[�r�X�{��]",9,0x31FF63;
	sleep 4000;
	announce "[�A���f�o�����q���s�s���C�[�i�M���h�ԘA��]",9,0x31FF63;
	sleep 4000;
	announce "[�u���b�N�X�~�X�M���h]",9,0x31FF63;
	sleep 4000;
	announce "[�R���h�J�W�m]",9,0x31FF63;
	sleep 4000;
	announce "�ȏ�̒c�̂̋��^���󂯂Ă��܂��B",9,0x31FF63;
	sleep 4000;
	announce "���肪�Ƃ��������܂����B",9,0x31FF63;
	sleep 4000;
	areawarp "this",0,0,400,400,"turbo_room",71,89;
	killmonsterall "this";
	hideoffnpc "�t���C���O1#"+strnpcinfo(2);
	hideoffnpc "�t���C���O2#"+strnpcinfo(2);
	hideoffnpc "�ÈőI��#"+strnpcinfo(2);
	hideoffnpc "�Èŏo��1#"+strnpcinfo(2);
	hideoffnpc "�Èŏo��2#"+strnpcinfo(2);
	hideoffnpc "�g�b�v1#"+strnpcinfo(2);
	hideoffnpc "�g�b�v2#"+strnpcinfo(2);
	hideoffnpc "�g�b�v3#"+strnpcinfo(2);
	hideoffnpc "�S�[��1#"+strnpcinfo(2);
	if(strnpcinfo(2) != "turbo_n_1") {
		hideoffnpc "�W�Q1#"+strnpcinfo(2);
		hideonnpc "�W�Q2#"+strnpcinfo(2);
		if(strnpcinfo(2) != "turbo_n_4" && strnpcinfo(2) != "turbo_e_4") {
			hideonnpc "�S�[��2#"+strnpcinfo(2);
			hideonnpc "�S�[��3#"+strnpcinfo(2);
		}
	}
	if(strnpcinfo(2) == "turbo_n_1") enablewaitingroomevent "1�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_4") enablewaitingroomevent "��ʁE4�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_8") enablewaitingroomevent "��ʁE8�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_n_16") enablewaitingroomevent "��ʁE16�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_4") enablewaitingroomevent "�n���E4�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_8") enablewaitingroomevent "�n���E8�l���[�h#turbo";
	else if(strnpcinfo(2) == "turbo_e_16") enablewaitingroomevent "�n���E16�l���[�h#turbo";
	end;
}

//============================================================
// 1�l���[�h
//------------------------------------------------------------
turbo_room,72,132,3	script	1�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "1�l���[�h",20,"1�l���[�h#turbo::OnStart",1,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			donpcevent "�R���p�j�I��#turbo_n_1::OnStart";
			warpwaitingpc "turbo_n_1",298,161;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

turbo_n_1,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_n_1	124

turbo_n_1,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_n_1	139,0,15
turbo_n_1,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_n_1	139,5,15

turbo_n_1,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_n_1	139,44,1
turbo_n_1,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_n_1	139,3,1
turbo_n_1,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_n_1	139,1,1
turbo_n_1,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_n_1	139,0,2
turbo_n_1,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_n_1	139,0,2
turbo_n_1,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_n_1	139,1,2
turbo_n_1,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_n_1	139,1,2
turbo_n_1,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_n_1	139,2,4
turbo_n_1,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_n_1	139,0,4
turbo_n_1,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_n_1	139,7,2
turbo_n_1,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_n_1	139,6,2
turbo_n_1,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_n_1	139,0,3
turbo_n_1,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_n_1	139,1,1

turbo_n_1,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_n_1	139,2,2
turbo_n_1,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_n_1	139,0,2
turbo_n_1,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_n_1	139,3,0
turbo_n_1,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_n_1	139,5,1
turbo_n_1,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_n_1	139,2,1
turbo_n_1,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_n_1	139,2,5
turbo_n_1,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_n_1	139,1,3
turbo_n_1,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_n_1	139,4,1
turbo_n_1,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_n_1	139,7,2
turbo_n_1,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_n_1	139,7,0
turbo_n_1,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_n_1	139,3,2
turbo_n_1,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_n_1	139,0,5
turbo_n_1,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_n_1	139,6,1
turbo_n_1,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_n_1	139,8,1
turbo_n_1,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_n_1	139,8,0
turbo_n_1,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_n_1	139,2,3
turbo_n_1,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_n_1	139,0,3
turbo_n_1,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_n_1	139,7,0
turbo_n_1,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_n_1	139,7,0
turbo_n_1,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_n_1	139,3,0
turbo_n_1,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_n_1	139,1,0
turbo_n_1,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_n_1	139,0,1

turbo_n_1,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_n_1	139,4,1
turbo_n_1,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_n_1	139,4,1
turbo_n_1,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_n_1	139,0,1
turbo_n_1,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_n_1	139,5,1
turbo_n_1,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_n_1	139,1,1
turbo_n_1,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_n_1	139,1,1
turbo_n_1,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_n_1	139,1,1
turbo_n_1,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_n_1	139,6,1
turbo_n_1,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_n_1	139,6,0
turbo_n_1,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_n_1	139,2,2
turbo_n_1,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_n_1	139,1,2
turbo_n_1,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_n_1	139,0,2
turbo_n_1,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_n_1	139,3,1
turbo_n_1,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_n_1	139,0,2
turbo_n_1,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_n_1	139,0,2
turbo_n_1,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_n_1	139,0,2
turbo_n_1,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_n_1	139,0,2
turbo_n_1,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_n_1	139,12,1
turbo_n_1,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_n_1	139,12,0
turbo_n_1,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_n_1	139,2,1
turbo_n_1,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_n_1	139,2,1
turbo_n_1,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_n_1	139,16,1
turbo_n_1,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_n_1	139,1,0
turbo_n_1,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_n_1	139,1,4
turbo_n_1,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_n_1	139,2,2
turbo_n_1,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_n_1	139,1,2
turbo_n_1,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_n_1	139,1,0
turbo_n_1,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_n_1	139,0,0

turbo_n_1,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_n_1	139,5,2
turbo_n_1,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_n_1	139,0,1
turbo_n_1,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_n_1	139,14,0
turbo_n_1,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_n_1	139,14,0
turbo_n_1,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_n_1	139,3,3
turbo_n_1,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_n_1	139,0,3
turbo_n_1,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_n_1	139,5,1
turbo_n_1,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_n_1	139,0,1
turbo_n_1,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_n_1	139,0,1
turbo_n_1,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_n_1	139,3,2
turbo_n_1,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_n_1	139,0,2
turbo_n_1,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_n_1	139,17,1
turbo_n_1,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_n_1	139,10,1
turbo_n_1,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_n_1	139,1,2
turbo_n_1,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_n_1	139,1,2

turbo_n_1,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_n_1	45,1,1

turbo_n_1,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_n_1	139,1,1
turbo_n_1,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_n_1	139,1,1
turbo_n_1,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_n_1	139,1,1
turbo_n_1,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_n_1	139,1,1
turbo_n_1,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_n_1	139,1,1
turbo_n_1,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_n_1	139,1,1
turbo_n_1,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_n_1	139,2,2

turbo_n_1,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_n_1	45,1,1

turbo_n_1,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_n_1	139,3,3
turbo_n_1,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_n_1	139,3,3
turbo_n_1,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_n_1	139,1,1
turbo_n_1,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_n_1	139,3,3
turbo_n_1,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_n_1	139,1,1
turbo_n_1,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_n_1	139,3,3
turbo_n_1,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_n_1	139,3,3
turbo_n_1,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_n_1	139,3,3
turbo_n_1,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_n_1	139,2,2
turbo_n_1,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_n_1	139,1,1
turbo_n_1,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_n_1	139,3,3
turbo_n_1,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_n_1	139,1,1
turbo_n_1,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_n_1	139,2,2
turbo_n_1,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_n_1	139,9,9
turbo_n_1,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_n_1	139,3,3
turbo_n_1,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_n_1	139,1,1
turbo_n_1,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_n_1	139,3,3
turbo_n_1,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_n_1	139,2,2
turbo_n_1,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_n_1	139,3,3
turbo_n_1,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_n_1	139,1,1
turbo_n_1,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_n_1	139,3,3
turbo_n_1,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_n_1	139,2,2
turbo_n_1,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_n_1	139,1,1

turbo_n_1,355,362,0	duplicate(�L��#turbo)	�L��#turbo_n_1	139,3,3

turbo_n_1,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_n_1	45,1,1

turbo_n_1,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_n_1	139,1,1

turbo_n_1,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_n_1		139,0,2
turbo_n_1,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_n_1		139,1,0
turbo_n_1,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_n_1		139,1,0
turbo_n_1,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_n_1		139,0,1
turbo_n_1,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_n_1		139,1,0
turbo_n_1,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_n_1		139,1,0
turbo_n_1,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_n_1		139,0,1
turbo_n_1,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_n_1		139,1,0
turbo_n_1,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_n_1		139,0,1
turbo_n_1,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_n_1	139,1,0
turbo_n_1,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_n_1	139,0,1
turbo_n_1,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_n_1	139,1,0
turbo_n_1,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_n_1	139,1,0
turbo_n_1,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_n_1	139,1,0
turbo_n_1,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_n_1	139,1,0
turbo_n_1,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_n_1	139,0,1
turbo_n_1,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_n_1	139,1,0
turbo_n_1,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_n_1	139,0,1
turbo_n_1,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_n_1	139,0,1
turbo_n_1,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_n_1	139,0,1
turbo_n_1,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_n_1	139,0,1
turbo_n_1,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_n_1	139,2,0
turbo_n_1,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_n_1	139,2,0
turbo_n_1,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_n_1	139,0,1
turbo_n_1,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_n_1	139,0,1
turbo_n_1,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_n_1	139,2,0
turbo_n_1,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_n_1	139,1,0
turbo_n_1,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_n_1	139,0,1
turbo_n_1,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_n_1	139,0,1
turbo_n_1,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_n_1	139,1,0
turbo_n_1,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_n_1	139,1,1
turbo_n_1,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_n_1	139,1,0
turbo_n_1,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_n_1	139,1,1
turbo_n_1,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_n_1	139,1,1
turbo_n_1,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_n_1	139,2,0
turbo_n_1,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_n_1	139,1,1
turbo_n_1,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_n_1	139,2,0
turbo_n_1,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_n_1	139,1,0
turbo_n_1,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_n_1	139,1,1
turbo_n_1,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_n_1	139,1,1
turbo_n_1,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_n_1	139,1,1
turbo_n_1,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_n_1	139,1,1
turbo_n_1,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_n_1	139,1,1
turbo_n_1,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_n_1	139,1,1
turbo_n_1,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_n_1	139,1,1
turbo_n_1,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_n_1	139,1,0
turbo_n_1,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_n_1	139,2,1
turbo_n_1,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_n_1	139,1,1
turbo_n_1,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_n_1	139,0,1
turbo_n_1,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_n_1	139,1,0

turbo_n_1,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_n_1	139,3,3

turbo_n_1,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_n_1	45,1,1
turbo_n_1,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_n_1	45,1,1

turbo_n_1,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_n_1	139,2,2

turbo_n_1,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_n_1	45,1,1

turbo_n_1,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_n_1	45,1,1
turbo_n_1,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_n_1	45,1,1
turbo_n_1,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_n_1	45,1,1
turbo_n_1,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_n_1	45,1,1

turbo_n_1,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_n_1	45,1,1

turbo_n_1,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_n_1	139,3,3

turbo_n_1,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_n_1	45,1,1

turbo_n_1,179,55,0	duplicate(�ʘH#turbo)	�ʘHa#turbo_n_1	139,1,1
turbo_n_1,184,45,0	duplicate(�ʘH#turbo)	�ʘHb#turbo_n_1	139,1,1
turbo_n_1,181,30,0	duplicate(�ʘH#turbo)	�ʘHc#turbo_n_1	139,1,1
turbo_n_1,186,28,0	duplicate(�ʘH#turbo)	�ʘHd#turbo_n_1	139,1,1
turbo_n_1,183,19,0	duplicate(�ʘH#turbo)	�ʘHe#turbo_n_1	139,1,1
turbo_n_1,191,37,0	duplicate(�ʘH#turbo)	�ʘHf#turbo_n_1	139,1,1
turbo_n_1,173,25,0	duplicate(�ʘH#turbo)	�ʘHg#turbo_n_1	139,1,1
turbo_n_1,201,21,0	duplicate(�ʘH#turbo)	�ʘHh#turbo_n_1	139,1,1
turbo_n_1,222,21,0	duplicate(�ʘH#turbo)	�ʘHi#turbo_n_1	139,1,1
turbo_n_1,214,39,0	duplicate(�ʘH#turbo)	�ʘHj#turbo_n_1	139,1,1
turbo_n_1,222,48,0	duplicate(�ʘH#turbo)	�ʘHk#turbo_n_1	139,1,1
turbo_n_1,214,60,0	duplicate(�ʘH#turbo)	�ʘHl#turbo_n_1	139,1,1
turbo_n_1,209,61,0	duplicate(�ʘH#turbo)	�ʘHm#turbo_n_1	139,1,1
turbo_n_1,208,56,0	duplicate(�ʘH#turbo)	�ʘHn#turbo_n_1	139,1,1

turbo_n_1,178,63,0	duplicate(���H#turbo)	���H1#turbo_n_1	139,1,1
turbo_n_1,182,40,0	duplicate(���H#turbo)	���H2#turbo_n_1	139,1,1
turbo_n_1,176,29,0	duplicate(���H#turbo)	���H3#turbo_n_1	139,1,1
turbo_n_1,180,25,0	duplicate(���H#turbo)	���H4#turbo_n_1	139,1,1
turbo_n_1,201,157,0	duplicate(���H#turbo)	���H5#turbo_n_1	139,1,1
turbo_n_1,203,65,0	duplicate(���H#turbo)	���H6#turbo_n_1	139,1,1
turbo_n_1,208,52,0	duplicate(���H#turbo)	���H7#turbo_n_1	139,1,1
turbo_n_1,208,26,0	duplicate(���H#turbo)	���H8#turbo_n_1	139,1,1
turbo_n_1,191,30,0	duplicate(���H#turbo)	���H9#turbo_n_1	139,1,1

turbo_n_1,187,55,0	duplicate(�q���g#turbo)	�q���g1#turbo_n_1	139,1,1
turbo_n_1,176,45,0	duplicate(�q���g#turbo)	�q���g2#turbo_n_1	139,1,1
turbo_n_1,222,26,0	duplicate(�q���g#turbo)	�q���g3#turbo_n_1	139,1,1
turbo_n_1,219,39,0	duplicate(�q���g#turbo)	�q���g4#turbo_n_1	139,1,1
turbo_n_1,222,45,0	duplicate(�q���g#turbo)	�q���g5#turbo_n_1	139,1,1
turbo_n_1,222,61,0	duplicate(�q���g#turbo)	�q���g6#turbo_n_1	139,1,1
turbo_n_1,222,65,0	duplicate(�q���g#turbo)	�q���g7#turbo_n_1	139,1,1

turbo_n_1,226,15,0	duplicate(�g�b�v3#turbo)	�g�b�v3#turbo_n_1	139,3,3

turbo_n_1,232,14,0	duplicate(�ʉ�8#turbo)	�ʉ�8#turbo_n_1	45,1,1

turbo_n_1,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_n_1	139,1,1
turbo_n_1,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_n_1	139,1,1
turbo_n_1,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_n_1	139,1,1
turbo_n_1,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_n_1	139,1,1
turbo_n_1,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_n_1	139,1,1
turbo_n_1,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_n_1	139,1,1
turbo_n_1,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_n_1	139,1,1
turbo_n_1,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_n_1	139,1,1
turbo_n_1,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_n_1	139,1,1
turbo_n_1,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_n_1	139,1,1
turbo_n_1,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_n_1	139,1,1
turbo_n_1,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_n_1	139,1,1
turbo_n_1,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_n_1	139,1,1
turbo_n_1,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_n_1	139,1,1
turbo_n_1,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_n_1	139,1,1
turbo_n_1,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_n_1	139,1,1
turbo_n_1,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_n_1	139,1,1
turbo_n_1,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_n_1	139,1,1
turbo_n_1,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_n_1	139,1,1
turbo_n_1,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_n_1	139,1,1
turbo_n_1,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_n_1	139,1,1
turbo_n_1,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_n_1	139,1,1
turbo_n_1,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_n_1	139,1,1
turbo_n_1,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_n_1	139,1,1
turbo_n_1,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_n_1	139,1,1
turbo_n_1,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_n_1	139,1,1
turbo_n_1,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_n_1	139,1,1
turbo_n_1,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_n_1	139,1,1
turbo_n_1,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_n_1	139,1,1
turbo_n_1,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_n_1	139,1,1
turbo_n_1,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_n_1	139,1,1
turbo_n_1,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_n_1	139,1,1
turbo_n_1,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_n_1	139,1,1
turbo_n_1,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_n_1	139,1,1
turbo_n_1,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_n_1	139,1,1
turbo_n_1,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_n_1	139,1,1
turbo_n_1,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_n_1	139,1,1
turbo_n_1,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_n_1	139,1,1
turbo_n_1,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_n_1	139,1,1
turbo_n_1,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_n_1	139,1,1
turbo_n_1,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_n_1	139,1,1
turbo_n_1,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_n_1	139,1,1
turbo_n_1,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_n_1	139,1,1
turbo_n_1,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_n_1	139,1,1
turbo_n_1,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_n_1	139,1,1
turbo_n_1,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_n_1	139,1,1
turbo_n_1,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_n_1	139,1,1
turbo_n_1,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_n_1	139,1,1
turbo_n_1,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_n_1	139,1,1
turbo_n_1,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_n_1	139,1,1
turbo_n_1,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_n_1	139,1,1
turbo_n_1,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_n_1	139,1,1
turbo_n_1,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_n_1	139,1,1
turbo_n_1,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_n_1	139,1,1
turbo_n_1,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_n_1	139,1,1
turbo_n_1,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_n_1	139,1,1
turbo_n_1,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_n_1	139,1,1
turbo_n_1,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_n_1	139,1,1
turbo_n_1,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_n_1	139,1,1
turbo_n_1,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_n_1	139,1,1
turbo_n_1,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_n_1	139,1,1
turbo_n_1,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_n_1	139,1,1
turbo_n_1,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_n_1	139,1,1
turbo_n_1,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_n_1	139,1,1
turbo_n_1,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_n_1	139,1,1
turbo_n_1,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_n_1	139,1,1
turbo_n_1,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_n_1	139,1,1
turbo_n_1,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_n_1	139,1,1
turbo_n_1,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_n_1	139,1,1
turbo_n_1,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_n_1	139,1,1
turbo_n_1,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_n_1	139,1,1
turbo_n_1,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_n_1	139,1,1
turbo_n_1,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_n_1	139,1,1
turbo_n_1,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_n_1	139,1,1
turbo_n_1,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_n_1	139,1,1
turbo_n_1,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_n_1	139,1,1
turbo_n_1,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_n_1	139,1,1
turbo_n_1,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_n_1	139,1,1
turbo_n_1,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_n_1	139,1,1
turbo_n_1,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_n_1	139,1,1
turbo_n_1,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_n_1	139,1,1
turbo_n_1,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_n_1	139,1,1
turbo_n_1,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_n_1	139,1,1
turbo_n_1,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_n_1	139,1,1
turbo_n_1,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_n_1	139,1,1
turbo_n_1,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_n_1	139,1,1
turbo_n_1,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_n_1	139,1,1
turbo_n_1,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_n_1	139,1,1
turbo_n_1,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_n_1	139,1,1
turbo_n_1,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_n_1	139,1,1
turbo_n_1,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_n_1	139,1,1
turbo_n_1,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_n_1	139,1,1
turbo_n_1,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_n_1	139,1,1
turbo_n_1,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_n_1	139,1,1
turbo_n_1,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_n_1	139,1,1

turbo_n_1,371,47,0	script	�S�[��1#turbo_n_1	45,1,1,{
	callfunc "TurboGoal","turbo_n_1",10,1,0;
	end;
}

turbo_n_1,384,167,1	duplicate(�i�s�v��#turbo)	�i�s�v��#turbo_n_1	47

//==============================================================
// ��ʁE4�l���[�h
//==============================================================
turbo_room,77,135,3	script	��ʁE4�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "��ʁE4�l���[�h",20,"��ʁE4�l���[�h#turbo::OnStart",4,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 4; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_n_4::OnStart";
	warpwaitingpc "turbo_n_4",298,161;
	end;
}

turbo_n_4,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_n_4	124

turbo_n_4,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_n_4	139,0,15
turbo_n_4,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_n_4	139,5,15

turbo_n_4,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_n_4	139,44,1
turbo_n_4,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_n_4	139,3,1
turbo_n_4,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_n_4	139,1,1
turbo_n_4,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_n_4	139,0,2
turbo_n_4,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_n_4	139,0,2
turbo_n_4,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_n_4	139,1,2
turbo_n_4,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_n_4	139,1,2
turbo_n_4,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_n_4	139,2,4
turbo_n_4,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_n_4	139,0,4
turbo_n_4,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_n_4	139,7,2
turbo_n_4,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_n_4	139,6,2
turbo_n_4,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_n_4	139,0,3
turbo_n_4,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_n_4	139,1,1

turbo_n_4,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_n_4	139,2,2
turbo_n_4,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_n_4	139,0,2
turbo_n_4,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_n_4	139,3,0
turbo_n_4,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_n_4	139,5,1
turbo_n_4,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_n_4	139,2,1
turbo_n_4,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_n_4	139,2,5
turbo_n_4,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_n_4	139,1,3
turbo_n_4,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_n_4	139,4,1
turbo_n_4,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_n_4	139,7,2
turbo_n_4,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_n_4	139,7,0
turbo_n_4,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_n_4	139,3,2
turbo_n_4,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_n_4	139,0,5
turbo_n_4,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_n_4	139,6,1
turbo_n_4,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_n_4	139,8,1
turbo_n_4,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_n_4	139,8,0
turbo_n_4,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_n_4	139,2,3
turbo_n_4,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_n_4	139,0,3
turbo_n_4,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_n_4	139,7,0
turbo_n_4,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_n_4	139,7,0
turbo_n_4,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_n_4	139,3,0
turbo_n_4,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_n_4	139,1,0
turbo_n_4,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_n_4	139,0,1

turbo_n_4,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_n_4	139,4,1
turbo_n_4,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_n_4	139,4,1
turbo_n_4,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_n_4	139,0,1
turbo_n_4,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_n_4	139,5,1
turbo_n_4,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_n_4	139,1,1
turbo_n_4,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_n_4	139,1,1
turbo_n_4,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_n_4	139,1,1
turbo_n_4,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_n_4	139,6,1
turbo_n_4,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_n_4	139,6,0
turbo_n_4,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_n_4	139,2,2
turbo_n_4,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_n_4	139,1,2
turbo_n_4,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_n_4	139,0,2
turbo_n_4,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_n_4	139,3,1
turbo_n_4,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_n_4	139,0,2
turbo_n_4,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_n_4	139,0,2
turbo_n_4,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_n_4	139,0,2
turbo_n_4,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_n_4	139,0,2
turbo_n_4,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_n_4	139,12,1
turbo_n_4,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_n_4	139,12,0
turbo_n_4,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_n_4	139,2,1
turbo_n_4,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_n_4	139,2,1
turbo_n_4,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_n_4	139,16,1
turbo_n_4,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_n_4	139,1,0
turbo_n_4,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_n_4	139,1,4
turbo_n_4,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_n_4	139,2,2
turbo_n_4,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_n_4	139,1,2
turbo_n_4,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_n_4	139,1,0
turbo_n_4,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_n_4	139,0,0

turbo_n_4,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_n_4	139,5,2
turbo_n_4,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_n_4	139,0,1
turbo_n_4,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_n_4	139,14,0
turbo_n_4,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_n_4	139,14,0
turbo_n_4,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_n_4	139,3,3
turbo_n_4,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_n_4	139,0,3
turbo_n_4,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_n_4	139,5,1
turbo_n_4,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_n_4	139,0,1
turbo_n_4,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_n_4	139,0,1
turbo_n_4,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_n_4	139,3,2
turbo_n_4,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_n_4	139,0,2
turbo_n_4,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_n_4	139,17,1
turbo_n_4,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_n_4	139,10,1
turbo_n_4,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_n_4	139,1,2
turbo_n_4,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_n_4	139,1,2

turbo_n_4,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_n_4	45,1,1

turbo_n_4,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_n_4	139,1,1
turbo_n_4,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_n_4	139,1,1
turbo_n_4,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_n_4	139,1,1
turbo_n_4,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_n_4	139,1,1
turbo_n_4,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_n_4	139,1,1
turbo_n_4,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_n_4	139,1,1
turbo_n_4,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_n_4	139,2,2

turbo_n_4,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_n_4	45,1,1

turbo_n_4,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_n_4	139,3,3
turbo_n_4,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_n_4	139,3,3
turbo_n_4,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_n_4	139,1,1
turbo_n_4,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_n_4	139,3,3
turbo_n_4,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_n_4	139,1,1
turbo_n_4,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_n_4	139,3,3
turbo_n_4,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_n_4	139,3,3
turbo_n_4,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_n_4	139,3,3
turbo_n_4,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_n_4	139,2,2
turbo_n_4,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_n_4	139,1,1
turbo_n_4,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_n_4	139,3,3
turbo_n_4,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_n_4	139,1,1
turbo_n_4,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_n_4	139,2,2
turbo_n_4,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_n_4	139,9,9
turbo_n_4,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_n_4	139,3,3
turbo_n_4,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_n_4	139,1,1
turbo_n_4,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_n_4	139,3,3
turbo_n_4,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_n_4	139,2,2
turbo_n_4,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_n_4	139,3,3
turbo_n_4,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_n_4	139,1,1
turbo_n_4,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_n_4	139,3,3
turbo_n_4,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_n_4	139,2,2
turbo_n_4,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_n_4	139,1,1

turbo_n_4,355,362,0	duplicate(�L��#turbo)	�L��#turbo_n_4	139,3,3

turbo_n_4,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_n_4	45,1,1

turbo_n_4,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_n_4	139,1,1

turbo_n_4,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_n_4		139,0,2
turbo_n_4,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_n_4		139,1,0
turbo_n_4,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_n_4		139,1,0
turbo_n_4,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_n_4		139,0,1
turbo_n_4,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_n_4		139,1,0
turbo_n_4,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_n_4		139,1,0
turbo_n_4,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_n_4		139,0,1
turbo_n_4,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_n_4		139,1,0
turbo_n_4,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_n_4		139,0,1
turbo_n_4,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_n_4	139,1,0
turbo_n_4,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_n_4	139,0,1
turbo_n_4,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_n_4	139,1,0
turbo_n_4,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_n_4	139,1,0
turbo_n_4,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_n_4	139,1,0
turbo_n_4,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_n_4	139,1,0
turbo_n_4,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_n_4	139,0,1
turbo_n_4,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_n_4	139,1,0
turbo_n_4,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_n_4	139,0,1
turbo_n_4,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_n_4	139,0,1
turbo_n_4,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_n_4	139,0,1
turbo_n_4,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_n_4	139,0,1
turbo_n_4,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_n_4	139,2,0
turbo_n_4,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_n_4	139,2,0
turbo_n_4,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_n_4	139,0,1
turbo_n_4,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_n_4	139,0,1
turbo_n_4,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_n_4	139,2,0
turbo_n_4,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_n_4	139,1,0
turbo_n_4,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_n_4	139,0,1
turbo_n_4,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_n_4	139,0,1
turbo_n_4,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_n_4	139,1,0
turbo_n_4,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_n_4	139,1,1
turbo_n_4,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_n_4	139,1,0
turbo_n_4,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_n_4	139,1,1
turbo_n_4,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_n_4	139,1,1
turbo_n_4,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_n_4	139,2,0
turbo_n_4,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_n_4	139,1,1
turbo_n_4,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_n_4	139,2,0
turbo_n_4,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_n_4	139,1,0
turbo_n_4,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_n_4	139,1,1
turbo_n_4,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_n_4	139,1,1
turbo_n_4,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_n_4	139,1,1
turbo_n_4,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_n_4	139,1,1
turbo_n_4,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_n_4	139,1,1
turbo_n_4,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_n_4	139,1,1
turbo_n_4,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_n_4	139,1,1
turbo_n_4,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_n_4	139,1,0
turbo_n_4,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_n_4	139,2,1
turbo_n_4,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_n_4	139,1,1
turbo_n_4,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_n_4	139,0,1
turbo_n_4,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_n_4	139,1,0

turbo_n_4,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_n_4	139,3,3

turbo_n_4,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_n_4	45,1,1
turbo_n_4,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_n_4	45,1,1

turbo_n_4,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_n_4	45,3,3
turbo_n_4,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_n_4	45,3,3

turbo_n_4,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_n_4	139,2,2

turbo_n_4,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_n_4	45,1,1

turbo_n_4,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_n_4	45,1,1
turbo_n_4,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_n_4	45,1,1
turbo_n_4,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_n_4	45,1,1
turbo_n_4,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_n_4	45,1,1

turbo_n_4,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_n_4	45,1,1

turbo_n_4,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_n_4	139,3,3

turbo_n_4,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_n_4	45,1,1

turbo_n_4,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_n_4	139,1,1
turbo_n_4,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_n_4	139,1,1
turbo_n_4,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_n_4	139,1,1
turbo_n_4,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_n_4	139,1,1
turbo_n_4,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_n_4	139,1,1
turbo_n_4,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_n_4	139,1,1
turbo_n_4,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_n_4	139,1,1
turbo_n_4,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_n_4	139,1,1
turbo_n_4,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_n_4	139,1,1
turbo_n_4,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_n_4	139,1,1
turbo_n_4,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_n_4	139,1,1
turbo_n_4,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_n_4	139,1,1
turbo_n_4,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_n_4	139,1,1
turbo_n_4,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_n_4	139,1,1
turbo_n_4,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_n_4	139,1,1
turbo_n_4,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_n_4	139,1,1
turbo_n_4,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_n_4	139,1,1
turbo_n_4,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_n_4	139,1,1
turbo_n_4,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_n_4	139,1,1
turbo_n_4,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_n_4	139,1,1
turbo_n_4,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_n_4	139,1,1
turbo_n_4,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_n_4	139,1,1
turbo_n_4,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_n_4	139,1,1
turbo_n_4,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_n_4	139,1,1
turbo_n_4,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_n_4	139,1,1
turbo_n_4,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_n_4	139,1,1
turbo_n_4,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_n_4	139,1,1
turbo_n_4,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_n_4	139,1,1
turbo_n_4,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_n_4	139,1,1
turbo_n_4,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_n_4	139,1,1
turbo_n_4,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_n_4	139,1,1
turbo_n_4,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_n_4	139,1,1
turbo_n_4,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_n_4	139,1,1
turbo_n_4,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_n_4	139,1,1
turbo_n_4,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_n_4	139,1,1
turbo_n_4,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_n_4	139,1,1
turbo_n_4,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_n_4	139,1,1
turbo_n_4,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_n_4	139,1,1
turbo_n_4,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_n_4	139,1,1
turbo_n_4,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_n_4	139,1,1
turbo_n_4,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_n_4	139,1,1
turbo_n_4,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_n_4	139,1,1
turbo_n_4,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_n_4	139,1,1
turbo_n_4,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_n_4	139,1,1
turbo_n_4,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_n_4	139,1,1
turbo_n_4,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_n_4	139,1,1
turbo_n_4,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_n_4	139,1,1
turbo_n_4,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_n_4	139,1,1
turbo_n_4,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_n_4	139,1,1
turbo_n_4,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_n_4	139,1,1
turbo_n_4,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_n_4	139,1,1
turbo_n_4,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_n_4	139,1,1
turbo_n_4,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_n_4	139,1,1
turbo_n_4,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_n_4	139,1,1
turbo_n_4,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_n_4	139,1,1
turbo_n_4,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_n_4	139,1,1
turbo_n_4,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_n_4	139,1,1
turbo_n_4,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_n_4	139,1,1
turbo_n_4,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_n_4	139,1,1
turbo_n_4,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_n_4	139,1,1
turbo_n_4,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_n_4	139,1,1
turbo_n_4,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_n_4	139,1,1
turbo_n_4,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_n_4	139,1,1
turbo_n_4,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_n_4	139,1,1
turbo_n_4,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_n_4	139,1,1
turbo_n_4,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_n_4	139,1,1
turbo_n_4,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_n_4	139,1,1
turbo_n_4,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_n_4	139,1,1
turbo_n_4,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_n_4	139,1,1
turbo_n_4,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_n_4	139,1,1
turbo_n_4,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_n_4	139,1,1
turbo_n_4,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_n_4	139,1,1
turbo_n_4,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_n_4	139,1,1
turbo_n_4,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_n_4	139,1,1
turbo_n_4,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_n_4	139,1,1
turbo_n_4,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_n_4	139,1,1
turbo_n_4,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_n_4	139,1,1
turbo_n_4,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_n_4	139,1,1
turbo_n_4,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_n_4	139,1,1
turbo_n_4,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_n_4	139,1,1
turbo_n_4,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_n_4	139,1,1
turbo_n_4,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_n_4	139,1,1
turbo_n_4,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_n_4	139,1,1
turbo_n_4,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_n_4	139,1,1
turbo_n_4,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_n_4	139,1,1
turbo_n_4,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_n_4	139,1,1
turbo_n_4,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_n_4	139,1,1
turbo_n_4,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_n_4	139,1,1
turbo_n_4,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_n_4	139,1,1
turbo_n_4,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_n_4	139,1,1
turbo_n_4,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_n_4	139,1,1
turbo_n_4,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_n_4	139,1,1
turbo_n_4,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_n_4	139,1,1
turbo_n_4,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_n_4	139,1,1
turbo_n_4,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_n_4	139,1,1

turbo_n_4,371,47,0	script	�S�[��1#turbo_n_4	45,1,1,{
	callfunc "TurboGoal","turbo_n_4",20,1,1;
	end;
}

turbo_n_4,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_n_4	47

//==============================================================
// ��ʁE8�l���[�h
//==============================================================
turbo_room,84,135,3	script	��ʁE8�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "��ʁE8�l���[�h",20,"��ʁE8�l���[�h#turbo::OnStart",8,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 8; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_n_8::OnStart";
	warpwaitingpc "turbo_n_8",298,161;
	end;
}

turbo_n_8,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_n_8	124

turbo_n_8,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_n_8	139,0,15
turbo_n_8,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_n_8	139,5,15

turbo_n_8,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_n_8	139,44,1
turbo_n_8,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_n_8	139,3,1
turbo_n_8,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_n_8	139,1,1
turbo_n_8,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_n_8	139,0,2
turbo_n_8,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_n_8	139,0,2
turbo_n_8,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_n_8	139,1,2
turbo_n_8,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_n_8	139,1,2
turbo_n_8,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_n_8	139,2,4
turbo_n_8,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_n_8	139,0,4
turbo_n_8,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_n_8	139,7,2
turbo_n_8,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_n_8	139,6,2
turbo_n_8,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_n_8	139,0,3
turbo_n_8,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_n_8	139,1,1

turbo_n_8,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_n_8	139,2,2
turbo_n_8,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_n_8	139,0,2
turbo_n_8,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_n_8	139,3,0
turbo_n_8,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_n_8	139,5,1
turbo_n_8,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_n_8	139,2,1
turbo_n_8,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_n_8	139,2,5
turbo_n_8,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_n_8	139,1,3
turbo_n_8,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_n_8	139,4,1
turbo_n_8,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_n_8	139,7,2
turbo_n_8,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_n_8	139,7,0
turbo_n_8,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_n_8	139,3,2
turbo_n_8,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_n_8	139,0,5
turbo_n_8,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_n_8	139,6,1
turbo_n_8,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_n_8	139,8,1
turbo_n_8,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_n_8	139,8,0
turbo_n_8,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_n_8	139,2,3
turbo_n_8,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_n_8	139,0,3
turbo_n_8,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_n_8	139,7,0
turbo_n_8,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_n_8	139,7,0
turbo_n_8,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_n_8	139,3,0
turbo_n_8,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_n_8	139,1,0
turbo_n_8,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_n_8	139,0,1

turbo_n_8,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_n_8	139,4,1
turbo_n_8,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_n_8	139,4,1
turbo_n_8,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_n_8	139,0,1
turbo_n_8,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_n_8	139,5,1
turbo_n_8,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_n_8	139,1,1
turbo_n_8,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_n_8	139,1,1
turbo_n_8,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_n_8	139,1,1
turbo_n_8,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_n_8	139,6,1
turbo_n_8,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_n_8	139,6,0
turbo_n_8,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_n_8	139,2,2
turbo_n_8,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_n_8	139,1,2
turbo_n_8,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_n_8	139,0,2
turbo_n_8,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_n_8	139,3,1
turbo_n_8,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_n_8	139,0,2
turbo_n_8,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_n_8	139,0,2
turbo_n_8,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_n_8	139,0,2
turbo_n_8,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_n_8	139,0,2
turbo_n_8,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_n_8	139,12,1
turbo_n_8,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_n_8	139,12,0
turbo_n_8,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_n_8	139,2,1
turbo_n_8,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_n_8	139,2,1
turbo_n_8,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_n_8	139,16,1
turbo_n_8,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_n_8	139,1,0
turbo_n_8,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_n_8	139,1,4
turbo_n_8,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_n_8	139,2,2
turbo_n_8,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_n_8	139,1,2
turbo_n_8,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_n_8	139,1,0
turbo_n_8,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_n_8	139,0,0

turbo_n_8,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_n_8	139,5,2
turbo_n_8,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_n_8	139,0,1
turbo_n_8,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_n_8	139,14,0
turbo_n_8,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_n_8	139,14,0
turbo_n_8,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_n_8	139,3,3
turbo_n_8,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_n_8	139,0,3
turbo_n_8,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_n_8	139,5,1
turbo_n_8,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_n_8	139,0,1
turbo_n_8,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_n_8	139,0,1
turbo_n_8,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_n_8	139,3,2
turbo_n_8,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_n_8	139,0,2
turbo_n_8,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_n_8	139,17,1
turbo_n_8,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_n_8	139,10,1
turbo_n_8,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_n_8	139,1,2
turbo_n_8,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_n_8	139,1,2

turbo_n_8,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_n_8	45,1,1

turbo_n_8,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_n_8	139,1,1
turbo_n_8,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_n_8	139,1,1
turbo_n_8,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_n_8	139,1,1
turbo_n_8,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_n_8	139,1,1
turbo_n_8,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_n_8	139,1,1
turbo_n_8,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_n_8	139,1,1
turbo_n_8,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_n_8	139,2,2

turbo_n_8,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_n_8	45,1,1

turbo_n_8,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_n_8	139,3,3
turbo_n_8,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_n_8	139,3,3
turbo_n_8,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_n_8	139,1,1
turbo_n_8,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_n_8	139,3,3
turbo_n_8,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_n_8	139,1,1
turbo_n_8,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_n_8	139,3,3
turbo_n_8,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_n_8	139,3,3
turbo_n_8,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_n_8	139,3,3
turbo_n_8,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_n_8	139,2,2
turbo_n_8,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_n_8	139,1,1
turbo_n_8,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_n_8	139,3,3
turbo_n_8,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_n_8	139,1,1
turbo_n_8,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_n_8	139,2,2
turbo_n_8,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_n_8	139,9,9
turbo_n_8,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_n_8	139,3,3
turbo_n_8,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_n_8	139,1,1
turbo_n_8,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_n_8	139,3,3
turbo_n_8,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_n_8	139,2,2
turbo_n_8,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_n_8	139,3,3
turbo_n_8,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_n_8	139,1,1
turbo_n_8,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_n_8	139,3,3
turbo_n_8,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_n_8	139,2,2
turbo_n_8,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_n_8	139,1,1

turbo_n_8,355,362,0	duplicate(�L��#turbo)	�L��#turbo_n_8	139,3,3

turbo_n_8,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_n_8	45,1,1

turbo_n_8,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_n_8	139,1,1

turbo_n_8,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_n_8		139,0,2
turbo_n_8,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_n_8		139,1,0
turbo_n_8,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_n_8		139,1,0
turbo_n_8,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_n_8		139,0,1
turbo_n_8,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_n_8		139,1,0
turbo_n_8,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_n_8		139,1,0
turbo_n_8,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_n_8		139,0,1
turbo_n_8,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_n_8		139,1,0
turbo_n_8,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_n_8		139,0,1
turbo_n_8,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_n_8	139,1,0
turbo_n_8,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_n_8	139,0,1
turbo_n_8,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_n_8	139,1,0
turbo_n_8,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_n_8	139,1,0
turbo_n_8,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_n_8	139,1,0
turbo_n_8,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_n_8	139,1,0
turbo_n_8,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_n_8	139,0,1
turbo_n_8,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_n_8	139,1,0
turbo_n_8,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_n_8	139,0,1
turbo_n_8,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_n_8	139,0,1
turbo_n_8,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_n_8	139,0,1
turbo_n_8,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_n_8	139,0,1
turbo_n_8,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_n_8	139,2,0
turbo_n_8,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_n_8	139,2,0
turbo_n_8,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_n_8	139,0,1
turbo_n_8,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_n_8	139,0,1
turbo_n_8,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_n_8	139,2,0
turbo_n_8,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_n_8	139,1,0
turbo_n_8,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_n_8	139,0,1
turbo_n_8,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_n_8	139,0,1
turbo_n_8,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_n_8	139,1,0
turbo_n_8,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_n_8	139,1,1
turbo_n_8,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_n_8	139,1,0
turbo_n_8,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_n_8	139,1,1
turbo_n_8,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_n_8	139,1,1
turbo_n_8,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_n_8	139,2,0
turbo_n_8,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_n_8	139,1,1
turbo_n_8,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_n_8	139,2,0
turbo_n_8,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_n_8	139,1,0
turbo_n_8,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_n_8	139,1,1
turbo_n_8,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_n_8	139,1,1
turbo_n_8,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_n_8	139,1,1
turbo_n_8,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_n_8	139,1,1
turbo_n_8,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_n_8	139,1,1
turbo_n_8,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_n_8	139,1,1
turbo_n_8,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_n_8	139,1,1
turbo_n_8,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_n_8	139,1,0
turbo_n_8,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_n_8	139,2,1
turbo_n_8,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_n_8	139,1,1
turbo_n_8,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_n_8	139,0,1
turbo_n_8,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_n_8	139,1,0

turbo_n_8,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_n_8	139,3,3

turbo_n_8,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_n_8	45,1,1
turbo_n_8,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_n_8	45,1,1

turbo_n_8,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_n_8	45,3,3
turbo_n_8,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_n_8	45,3,3

turbo_n_8,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_n_8	139,2,2

turbo_n_8,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_n_8	45,1,1

turbo_n_8,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_n_8	45,1,1
turbo_n_8,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_n_8	45,1,1
turbo_n_8,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_n_8	45,1,1
turbo_n_8,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_n_8	45,1,1

turbo_n_8,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_n_8	45,1,1

turbo_n_8,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_n_8	139,3,3

turbo_n_8,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_n_8	45,1,1

turbo_n_8,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_n_8	139,1,1
turbo_n_8,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_n_8	139,1,1
turbo_n_8,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_n_8	139,1,1
turbo_n_8,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_n_8	139,1,1
turbo_n_8,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_n_8	139,1,1
turbo_n_8,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_n_8	139,1,1
turbo_n_8,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_n_8	139,1,1
turbo_n_8,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_n_8	139,1,1
turbo_n_8,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_n_8	139,1,1
turbo_n_8,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_n_8	139,1,1
turbo_n_8,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_n_8	139,1,1
turbo_n_8,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_n_8	139,1,1
turbo_n_8,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_n_8	139,1,1
turbo_n_8,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_n_8	139,1,1
turbo_n_8,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_n_8	139,1,1
turbo_n_8,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_n_8	139,1,1
turbo_n_8,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_n_8	139,1,1
turbo_n_8,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_n_8	139,1,1
turbo_n_8,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_n_8	139,1,1
turbo_n_8,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_n_8	139,1,1
turbo_n_8,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_n_8	139,1,1
turbo_n_8,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_n_8	139,1,1
turbo_n_8,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_n_8	139,1,1
turbo_n_8,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_n_8	139,1,1
turbo_n_8,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_n_8	139,1,1
turbo_n_8,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_n_8	139,1,1
turbo_n_8,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_n_8	139,1,1
turbo_n_8,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_n_8	139,1,1
turbo_n_8,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_n_8	139,1,1
turbo_n_8,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_n_8	139,1,1
turbo_n_8,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_n_8	139,1,1
turbo_n_8,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_n_8	139,1,1
turbo_n_8,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_n_8	139,1,1
turbo_n_8,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_n_8	139,1,1
turbo_n_8,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_n_8	139,1,1
turbo_n_8,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_n_8	139,1,1
turbo_n_8,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_n_8	139,1,1
turbo_n_8,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_n_8	139,1,1
turbo_n_8,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_n_8	139,1,1
turbo_n_8,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_n_8	139,1,1
turbo_n_8,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_n_8	139,1,1
turbo_n_8,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_n_8	139,1,1
turbo_n_8,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_n_8	139,1,1
turbo_n_8,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_n_8	139,1,1
turbo_n_8,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_n_8	139,1,1
turbo_n_8,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_n_8	139,1,1
turbo_n_8,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_n_8	139,1,1
turbo_n_8,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_n_8	139,1,1
turbo_n_8,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_n_8	139,1,1
turbo_n_8,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_n_8	139,1,1
turbo_n_8,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_n_8	139,1,1
turbo_n_8,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_n_8	139,1,1
turbo_n_8,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_n_8	139,1,1
turbo_n_8,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_n_8	139,1,1
turbo_n_8,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_n_8	139,1,1
turbo_n_8,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_n_8	139,1,1
turbo_n_8,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_n_8	139,1,1
turbo_n_8,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_n_8	139,1,1
turbo_n_8,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_n_8	139,1,1
turbo_n_8,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_n_8	139,1,1
turbo_n_8,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_n_8	139,1,1
turbo_n_8,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_n_8	139,1,1
turbo_n_8,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_n_8	139,1,1
turbo_n_8,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_n_8	139,1,1
turbo_n_8,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_n_8	139,1,1
turbo_n_8,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_n_8	139,1,1
turbo_n_8,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_n_8	139,1,1
turbo_n_8,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_n_8	139,1,1
turbo_n_8,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_n_8	139,1,1
turbo_n_8,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_n_8	139,1,1
turbo_n_8,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_n_8	139,1,1
turbo_n_8,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_n_8	139,1,1
turbo_n_8,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_n_8	139,1,1
turbo_n_8,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_n_8	139,1,1
turbo_n_8,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_n_8	139,1,1
turbo_n_8,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_n_8	139,1,1
turbo_n_8,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_n_8	139,1,1
turbo_n_8,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_n_8	139,1,1
turbo_n_8,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_n_8	139,1,1
turbo_n_8,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_n_8	139,1,1
turbo_n_8,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_n_8	139,1,1
turbo_n_8,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_n_8	139,1,1
turbo_n_8,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_n_8	139,1,1
turbo_n_8,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_n_8	139,1,1
turbo_n_8,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_n_8	139,1,1
turbo_n_8,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_n_8	139,1,1
turbo_n_8,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_n_8	139,1,1
turbo_n_8,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_n_8	139,1,1
turbo_n_8,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_n_8	139,1,1
turbo_n_8,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_n_8	139,1,1
turbo_n_8,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_n_8	139,1,1
turbo_n_8,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_n_8	139,1,1
turbo_n_8,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_n_8	139,1,1
turbo_n_8,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_n_8	139,1,1
turbo_n_8,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_n_8	139,1,1

turbo_n_8,371,47,0	script	�S�[��1#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",30,1,2;
	end;
}
turbo_n_8,371,47,0	script	�S�[��2#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",20,2,2;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_8,371,47,0	script	�S�[��3#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",20,3,2;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_n_8,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_n_8	47

//==============================================================
// ��ʁE16�l���[�h
//==============================================================
turbo_room,91,135,3	script	��ʁE16�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "��ʁE16�l���[�h",20,"��ʁE16�l���[�h#turbo::OnStart",16,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 16; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_n_16::OnStart";
	warpwaitingpc "turbo_n_16",298,161;
	end;
}

turbo_n_16,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_n_16	124

turbo_n_16,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_n_16	139,0,15
turbo_n_16,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_n_16	139,5,15

turbo_n_16,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_n_16	139,44,1
turbo_n_16,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_n_16	139,3,1
turbo_n_16,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_n_16	139,1,1
turbo_n_16,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_n_16	139,0,2
turbo_n_16,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_n_16	139,0,2
turbo_n_16,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_n_16	139,1,2
turbo_n_16,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_n_16	139,1,2
turbo_n_16,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_n_16	139,2,4
turbo_n_16,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_n_16	139,0,4
turbo_n_16,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_n_16	139,7,2
turbo_n_16,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_n_16	139,6,2
turbo_n_16,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_n_16	139,0,3
turbo_n_16,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_n_16	139,1,1

turbo_n_16,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_n_16	139,2,2
turbo_n_16,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_n_16	139,0,2
turbo_n_16,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_n_16	139,3,0
turbo_n_16,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_n_16	139,5,1
turbo_n_16,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_n_16	139,2,1
turbo_n_16,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_n_16	139,2,5
turbo_n_16,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_n_16	139,1,3
turbo_n_16,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_n_16	139,4,1
turbo_n_16,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_n_16	139,7,2
turbo_n_16,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_n_16	139,7,0
turbo_n_16,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_n_16	139,3,2
turbo_n_16,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_n_16	139,0,5
turbo_n_16,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_n_16	139,6,1
turbo_n_16,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_n_16	139,8,1
turbo_n_16,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_n_16	139,8,0
turbo_n_16,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_n_16	139,2,3
turbo_n_16,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_n_16	139,0,3
turbo_n_16,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_n_16	139,7,0
turbo_n_16,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_n_16	139,7,0
turbo_n_16,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_n_16	139,3,0
turbo_n_16,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_n_16	139,1,0
turbo_n_16,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_n_16	139,0,1

turbo_n_16,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_n_16	139,4,1
turbo_n_16,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_n_16	139,4,1
turbo_n_16,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_n_16	139,0,1
turbo_n_16,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_n_16	139,5,1
turbo_n_16,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_n_16	139,1,1
turbo_n_16,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_n_16	139,1,1
turbo_n_16,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_n_16	139,1,1
turbo_n_16,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_n_16	139,6,1
turbo_n_16,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_n_16	139,6,0
turbo_n_16,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_n_16	139,2,2
turbo_n_16,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_n_16	139,1,2
turbo_n_16,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_n_16	139,0,2
turbo_n_16,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_n_16	139,3,1
turbo_n_16,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_n_16	139,0,2
turbo_n_16,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_n_16	139,0,2
turbo_n_16,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_n_16	139,0,2
turbo_n_16,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_n_16	139,0,2
turbo_n_16,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_n_16	139,12,1
turbo_n_16,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_n_16	139,12,0
turbo_n_16,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_n_16	139,2,1
turbo_n_16,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_n_16	139,2,1
turbo_n_16,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_n_16	139,16,1
turbo_n_16,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_n_16	139,1,0
turbo_n_16,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_n_16	139,1,4
turbo_n_16,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_n_16	139,2,2
turbo_n_16,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_n_16	139,1,2
turbo_n_16,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_n_16	139,1,0
turbo_n_16,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_n_16	139,0,0

turbo_n_16,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_n_16	139,5,2
turbo_n_16,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_n_16	139,0,1
turbo_n_16,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_n_16	139,14,0
turbo_n_16,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_n_16	139,14,0
turbo_n_16,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_n_16	139,3,3
turbo_n_16,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_n_16	139,0,3
turbo_n_16,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_n_16	139,5,1
turbo_n_16,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_n_16	139,0,1
turbo_n_16,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_n_16	139,0,1
turbo_n_16,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_n_16	139,3,2
turbo_n_16,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_n_16	139,0,2
turbo_n_16,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_n_16	139,17,1
turbo_n_16,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_n_16	139,10,1
turbo_n_16,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_n_16	139,1,2
turbo_n_16,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_n_16	139,1,2

turbo_n_16,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_n_16	45,1,1

turbo_n_16,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_n_16	139,1,1
turbo_n_16,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_n_16	139,1,1
turbo_n_16,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_n_16	139,1,1
turbo_n_16,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_n_16	139,1,1
turbo_n_16,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_n_16	139,1,1
turbo_n_16,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_n_16	139,1,1
turbo_n_16,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_n_16	139,2,2

turbo_n_16,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_n_16	45,1,1

turbo_n_16,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_n_16	139,3,3
turbo_n_16,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_n_16	139,3,3
turbo_n_16,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_n_16	139,1,1
turbo_n_16,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_n_16	139,3,3
turbo_n_16,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_n_16	139,1,1
turbo_n_16,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_n_16	139,3,3
turbo_n_16,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_n_16	139,3,3
turbo_n_16,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_n_16	139,3,3
turbo_n_16,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_n_16	139,2,2
turbo_n_16,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_n_16	139,1,1
turbo_n_16,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_n_16	139,3,3
turbo_n_16,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_n_16	139,1,1
turbo_n_16,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_n_16	139,2,2
turbo_n_16,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_n_16	139,9,9
turbo_n_16,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_n_16	139,3,3
turbo_n_16,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_n_16	139,1,1
turbo_n_16,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_n_16	139,3,3
turbo_n_16,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_n_16	139,2,2
turbo_n_16,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_n_16	139,3,3
turbo_n_16,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_n_16	139,1,1
turbo_n_16,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_n_16	139,3,3
turbo_n_16,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_n_16	139,2,2
turbo_n_16,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_n_16	139,1,1

turbo_n_16,355,362,0	duplicate(�L��#turbo)	�L��#turbo_n_16	139,3,3

turbo_n_16,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_n_16	45,1,1

turbo_n_16,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_n_16	139,1,1

turbo_n_16,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_n_16		139,0,2
turbo_n_16,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_n_16		139,1,0
turbo_n_16,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_n_16		139,1,0
turbo_n_16,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_n_16		139,0,1
turbo_n_16,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_n_16		139,1,0
turbo_n_16,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_n_16		139,1,0
turbo_n_16,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_n_16		139,0,1
turbo_n_16,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_n_16		139,1,0
turbo_n_16,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_n_16		139,0,1
turbo_n_16,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_n_16	139,1,0
turbo_n_16,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_n_16	139,0,1
turbo_n_16,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_n_16	139,1,0
turbo_n_16,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_n_16	139,1,0
turbo_n_16,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_n_16	139,1,0
turbo_n_16,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_n_16	139,1,0
turbo_n_16,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_n_16	139,0,1
turbo_n_16,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_n_16	139,1,0
turbo_n_16,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_n_16	139,0,1
turbo_n_16,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_n_16	139,0,1
turbo_n_16,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_n_16	139,0,1
turbo_n_16,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_n_16	139,0,1
turbo_n_16,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_n_16	139,2,0
turbo_n_16,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_n_16	139,2,0
turbo_n_16,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_n_16	139,0,1
turbo_n_16,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_n_16	139,0,1
turbo_n_16,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_n_16	139,2,0
turbo_n_16,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_n_16	139,1,0
turbo_n_16,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_n_16	139,0,1
turbo_n_16,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_n_16	139,0,1
turbo_n_16,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_n_16	139,1,0
turbo_n_16,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_n_16	139,1,1
turbo_n_16,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_n_16	139,1,0
turbo_n_16,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_n_16	139,1,1
turbo_n_16,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_n_16	139,1,1
turbo_n_16,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_n_16	139,2,0
turbo_n_16,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_n_16	139,1,1
turbo_n_16,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_n_16	139,2,0
turbo_n_16,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_n_16	139,1,0
turbo_n_16,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_n_16	139,1,1
turbo_n_16,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_n_16	139,1,1
turbo_n_16,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_n_16	139,1,1
turbo_n_16,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_n_16	139,1,1
turbo_n_16,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_n_16	139,1,1
turbo_n_16,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_n_16	139,1,1
turbo_n_16,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_n_16	139,1,1
turbo_n_16,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_n_16	139,1,0
turbo_n_16,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_n_16	139,2,1
turbo_n_16,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_n_16	139,1,1
turbo_n_16,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_n_16	139,0,1
turbo_n_16,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_n_16	139,1,0

turbo_n_16,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_n_16	139,3,3

turbo_n_16,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_n_16	45,1,1
turbo_n_16,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_n_16	45,1,1

turbo_n_16,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_n_16	45,3,3
turbo_n_16,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_n_16	45,3,3

turbo_n_16,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_n_16	139,2,2

turbo_n_16,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_n_16	45,1,1

turbo_n_16,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_n_16	45,1,1
turbo_n_16,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_n_16	45,1,1
turbo_n_16,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_n_16	45,1,1
turbo_n_16,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_n_16	45,1,1

turbo_n_16,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_n_16	45,1,1

turbo_n_16,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_n_16	139,3,3

turbo_n_16,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_n_16	45,1,1

turbo_n_16,179,55,0	duplicate(�ʘH#turbo)	�ʘHa#turbo_n_16	139,1,1
turbo_n_16,184,45,0	duplicate(�ʘH#turbo)	�ʘHb#turbo_n_16	139,1,1
turbo_n_16,181,30,0	duplicate(�ʘH#turbo)	�ʘHc#turbo_n_16	139,1,1
turbo_n_16,186,28,0	duplicate(�ʘH#turbo)	�ʘHd#turbo_n_16	139,1,1
turbo_n_16,183,19,0	duplicate(�ʘH#turbo)	�ʘHe#turbo_n_16	139,1,1
turbo_n_16,191,37,0	duplicate(�ʘH#turbo)	�ʘHf#turbo_n_16	139,1,1
turbo_n_16,173,25,0	duplicate(�ʘH#turbo)	�ʘHg#turbo_n_16	139,1,1
turbo_n_16,201,21,0	duplicate(�ʘH#turbo)	�ʘHh#turbo_n_16	139,1,1
turbo_n_16,222,21,0	duplicate(�ʘH#turbo)	�ʘHi#turbo_n_16	139,1,1
turbo_n_16,214,39,0	duplicate(�ʘH#turbo)	�ʘHj#turbo_n_16	139,1,1
turbo_n_16,222,48,0	duplicate(�ʘH#turbo)	�ʘHk#turbo_n_16	139,1,1
turbo_n_16,214,60,0	duplicate(�ʘH#turbo)	�ʘHl#turbo_n_16	139,1,1
turbo_n_16,209,61,0	duplicate(�ʘH#turbo)	�ʘHm#turbo_n_16	139,1,1
turbo_n_16,208,56,0	duplicate(�ʘH#turbo)	�ʘHn#turbo_n_16	139,1,1

turbo_n_16,178,63,0	duplicate(���H#turbo)	���H1#turbo_n_16	139,1,1
turbo_n_16,182,40,0	duplicate(���H#turbo)	���H2#turbo_n_16	139,1,1
turbo_n_16,176,29,0	duplicate(���H#turbo)	���H3#turbo_n_16	139,1,1
turbo_n_16,180,25,0	duplicate(���H#turbo)	���H4#turbo_n_16	139,1,1
turbo_n_16,201,157,0	duplicate(���H#turbo)	���H5#turbo_n_16	139,1,1
turbo_n_16,203,65,0	duplicate(���H#turbo)	���H6#turbo_n_16	139,1,1
turbo_n_16,208,52,0	duplicate(���H#turbo)	���H7#turbo_n_16	139,1,1
turbo_n_16,208,26,0	duplicate(���H#turbo)	���H8#turbo_n_16	139,1,1
turbo_n_16,191,30,0	duplicate(���H#turbo)	���H9#turbo_n_16	139,1,1

turbo_n_16,187,55,0	duplicate(�q���g#turbo)	�q���g1#turbo_n_16	139,1,1
turbo_n_16,176,45,0	duplicate(�q���g#turbo)	�q���g2#turbo_n_16	139,1,1
turbo_n_16,222,26,0	duplicate(�q���g#turbo)	�q���g3#turbo_n_16	139,1,1
turbo_n_16,219,39,0	duplicate(�q���g#turbo)	�q���g4#turbo_n_16	139,1,1
turbo_n_16,222,45,0	duplicate(�q���g#turbo)	�q���g5#turbo_n_16	139,1,1
turbo_n_16,222,61,0	duplicate(�q���g#turbo)	�q���g6#turbo_n_16	139,1,1
turbo_n_16,222,65,0	duplicate(�q���g#turbo)	�q���g7#turbo_n_16	139,1,1

turbo_n_16,226,15,0	duplicate(�g�b�v3#turbo)	�g�b�v3#turbo_n_16	139,3,3

turbo_n_16,232,14,0	duplicate(�ʉ�8#turbo)	�ʉ�8#turbo_n_16	45,1,1

turbo_n_16,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_n_16	139,1,1
turbo_n_16,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_n_16	139,1,1
turbo_n_16,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_n_16	139,1,1
turbo_n_16,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_n_16	139,1,1
turbo_n_16,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_n_16	139,1,1
turbo_n_16,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_n_16	139,1,1
turbo_n_16,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_n_16	139,1,1
turbo_n_16,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_n_16	139,1,1
turbo_n_16,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_n_16	139,1,1
turbo_n_16,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_n_16	139,1,1
turbo_n_16,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_n_16	139,1,1
turbo_n_16,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_n_16	139,1,1
turbo_n_16,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_n_16	139,1,1
turbo_n_16,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_n_16	139,1,1
turbo_n_16,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_n_16	139,1,1
turbo_n_16,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_n_16	139,1,1
turbo_n_16,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_n_16	139,1,1
turbo_n_16,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_n_16	139,1,1
turbo_n_16,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_n_16	139,1,1
turbo_n_16,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_n_16	139,1,1
turbo_n_16,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_n_16	139,1,1
turbo_n_16,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_n_16	139,1,1
turbo_n_16,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_n_16	139,1,1
turbo_n_16,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_n_16	139,1,1
turbo_n_16,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_n_16	139,1,1
turbo_n_16,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_n_16	139,1,1
turbo_n_16,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_n_16	139,1,1
turbo_n_16,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_n_16	139,1,1
turbo_n_16,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_n_16	139,1,1
turbo_n_16,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_n_16	139,1,1
turbo_n_16,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_n_16	139,1,1
turbo_n_16,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_n_16	139,1,1
turbo_n_16,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_n_16	139,1,1
turbo_n_16,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_n_16	139,1,1
turbo_n_16,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_n_16	139,1,1
turbo_n_16,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_n_16	139,1,1
turbo_n_16,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_n_16	139,1,1
turbo_n_16,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_n_16	139,1,1
turbo_n_16,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_n_16	139,1,1
turbo_n_16,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_n_16	139,1,1
turbo_n_16,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_n_16	139,1,1
turbo_n_16,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_n_16	139,1,1
turbo_n_16,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_n_16	139,1,1
turbo_n_16,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_n_16	139,1,1
turbo_n_16,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_n_16	139,1,1
turbo_n_16,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_n_16	139,1,1
turbo_n_16,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_n_16	139,1,1
turbo_n_16,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_n_16	139,1,1
turbo_n_16,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_n_16	139,1,1
turbo_n_16,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_n_16	139,1,1
turbo_n_16,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_n_16	139,1,1
turbo_n_16,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_n_16	139,1,1
turbo_n_16,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_n_16	139,1,1
turbo_n_16,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_n_16	139,1,1
turbo_n_16,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_n_16	139,1,1
turbo_n_16,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_n_16	139,1,1
turbo_n_16,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_n_16	139,1,1
turbo_n_16,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_n_16	139,1,1
turbo_n_16,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_n_16	139,1,1
turbo_n_16,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_n_16	139,1,1
turbo_n_16,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_n_16	139,1,1
turbo_n_16,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_n_16	139,1,1
turbo_n_16,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_n_16	139,1,1
turbo_n_16,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_n_16	139,1,1
turbo_n_16,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_n_16	139,1,1
turbo_n_16,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_n_16	139,1,1
turbo_n_16,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_n_16	139,1,1
turbo_n_16,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_n_16	139,1,1
turbo_n_16,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_n_16	139,1,1
turbo_n_16,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_n_16	139,1,1
turbo_n_16,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_n_16	139,1,1
turbo_n_16,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_n_16	139,1,1
turbo_n_16,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_n_16	139,1,1
turbo_n_16,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_n_16	139,1,1
turbo_n_16,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_n_16	139,1,1
turbo_n_16,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_n_16	139,1,1
turbo_n_16,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_n_16	139,1,1
turbo_n_16,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_n_16	139,1,1
turbo_n_16,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_n_16	139,1,1
turbo_n_16,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_n_16	139,1,1
turbo_n_16,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_n_16	139,1,1
turbo_n_16,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_n_16	139,1,1
turbo_n_16,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_n_16	139,1,1
turbo_n_16,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_n_16	139,1,1
turbo_n_16,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_n_16	139,1,1
turbo_n_16,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_n_16	139,1,1
turbo_n_16,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_n_16	139,1,1
turbo_n_16,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_n_16	139,1,1
turbo_n_16,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_n_16	139,1,1
turbo_n_16,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_n_16	139,1,1
turbo_n_16,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_n_16	139,1,1
turbo_n_16,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_n_16	139,1,1
turbo_n_16,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_n_16	139,1,1
turbo_n_16,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_n_16	139,1,1
turbo_n_16,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_n_16	139,1,1

turbo_n_16,371,47,0	script	�S�[��1#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",40,1,3;
	end;
}
turbo_n_16,371,47,0	script	�S�[��2#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",30,2,3;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_16,371,47,0	script	�S�[��3#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",20,3,3;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_16,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_n_16	47

//==============================================================
// �n���E4�l���[�h
//==============================================================
turbo_room,110,135,3	script	�n���E4�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "�n���E4�l���[�h",20,"�n���E4�l���[�h#turbo::OnStart",4,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 4; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_e_4::OnStart";
	warpwaitingpc "turbo_e_4",298,161;
	end;
}

turbo_e_4,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_e_4	124

turbo_e_4,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_e_4	139,0,15
turbo_e_4,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_e_4	139,5,15

turbo_e_4,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_e_4	139,44,1
turbo_e_4,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_e_4	139,3,1
turbo_e_4,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_e_4	139,1,1
turbo_e_4,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_e_4	139,0,2
turbo_e_4,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_e_4	139,0,2
turbo_e_4,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_e_4	139,1,2
turbo_e_4,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_e_4	139,1,2
turbo_e_4,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_e_4	139,2,4
turbo_e_4,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_e_4	139,0,4
turbo_e_4,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_e_4	139,7,2
turbo_e_4,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_e_4	139,6,2
turbo_e_4,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_e_4	139,0,3
turbo_e_4,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_e_4	139,1,1

turbo_e_4,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_e_4	139,2,2
turbo_e_4,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_e_4	139,0,2
turbo_e_4,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_e_4	139,3,0
turbo_e_4,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_e_4	139,5,1
turbo_e_4,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_e_4	139,2,1
turbo_e_4,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_e_4	139,2,5
turbo_e_4,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_e_4	139,1,3
turbo_e_4,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_e_4	139,4,1
turbo_e_4,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_e_4	139,7,2
turbo_e_4,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_e_4	139,7,0
turbo_e_4,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_e_4	139,3,2
turbo_e_4,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_e_4	139,0,5
turbo_e_4,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_e_4	139,6,1
turbo_e_4,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_e_4	139,8,1
turbo_e_4,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_e_4	139,8,0
turbo_e_4,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_e_4	139,2,3
turbo_e_4,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_e_4	139,0,3
turbo_e_4,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_e_4	139,7,0
turbo_e_4,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_e_4	139,7,0
turbo_e_4,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_e_4	139,3,0
turbo_e_4,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_e_4	139,1,0
turbo_e_4,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_e_4	139,0,1

turbo_e_4,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_e_4	139,4,1
turbo_e_4,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_e_4	139,4,1
turbo_e_4,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_e_4	139,0,1
turbo_e_4,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_e_4	139,5,1
turbo_e_4,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_e_4	139,1,1
turbo_e_4,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_e_4	139,1,1
turbo_e_4,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_e_4	139,1,1
turbo_e_4,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_e_4	139,6,1
turbo_e_4,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_e_4	139,6,0
turbo_e_4,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_e_4	139,2,2
turbo_e_4,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_e_4	139,1,2
turbo_e_4,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_e_4	139,0,2
turbo_e_4,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_e_4	139,3,1
turbo_e_4,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_e_4	139,0,2
turbo_e_4,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_e_4	139,0,2
turbo_e_4,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_e_4	139,0,2
turbo_e_4,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_e_4	139,0,2
turbo_e_4,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_e_4	139,12,1
turbo_e_4,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_e_4	139,12,0
turbo_e_4,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_e_4	139,2,1
turbo_e_4,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_e_4	139,2,1
turbo_e_4,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_e_4	139,16,1
turbo_e_4,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_e_4	139,1,0
turbo_e_4,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_e_4	139,1,4
turbo_e_4,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_e_4	139,2,2
turbo_e_4,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_e_4	139,1,2
turbo_e_4,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_e_4	139,1,0
turbo_e_4,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_e_4	139,0,0

turbo_e_4,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_e_4	139,5,2
turbo_e_4,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_e_4	139,0,1
turbo_e_4,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_e_4	139,14,0
turbo_e_4,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_e_4	139,14,0
turbo_e_4,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_e_4	139,3,3
turbo_e_4,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_e_4	139,0,3
turbo_e_4,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_e_4	139,5,1
turbo_e_4,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_e_4	139,0,1
turbo_e_4,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_e_4	139,0,1
turbo_e_4,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_e_4	139,3,2
turbo_e_4,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_e_4	139,0,2
turbo_e_4,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_e_4	139,17,1
turbo_e_4,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_e_4	139,10,1
turbo_e_4,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_e_4	139,1,2
turbo_e_4,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_e_4	139,1,2

turbo_e_4,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_e_4	45,1,1

turbo_e_4,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_e_4	139,1,1
turbo_e_4,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_e_4	139,1,1
turbo_e_4,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_e_4	139,1,1
turbo_e_4,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_e_4	139,1,1
turbo_e_4,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_e_4	139,1,1
turbo_e_4,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_e_4	139,1,1
turbo_e_4,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_e_4	139,2,2

turbo_e_4,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_e_4	45,1,1

turbo_e_4,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_e_4	139,3,3
turbo_e_4,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_e_4	139,3,3
turbo_e_4,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_e_4	139,1,1
turbo_e_4,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_e_4	139,3,3
turbo_e_4,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_e_4	139,1,1
turbo_e_4,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_e_4	139,3,3
turbo_e_4,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_e_4	139,3,3
turbo_e_4,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_e_4	139,3,3
turbo_e_4,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_e_4	139,2,2
turbo_e_4,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_e_4	139,1,1
turbo_e_4,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_e_4	139,3,3
turbo_e_4,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_e_4	139,1,1
turbo_e_4,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_e_4	139,2,2
turbo_e_4,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_e_4	139,9,9
turbo_e_4,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_e_4	139,3,3
turbo_e_4,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_e_4	139,1,1
turbo_e_4,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_e_4	139,3,3
turbo_e_4,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_e_4	139,2,2
turbo_e_4,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_e_4	139,3,3
turbo_e_4,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_e_4	139,1,1
turbo_e_4,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_e_4	139,3,3
turbo_e_4,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_e_4	139,2,2
turbo_e_4,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_e_4	139,1,1

turbo_e_4,355,362,0	duplicate(�L��#turbo)	�L��#turbo_e_4	139,3,3

turbo_e_4,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_e_4	45,1,1

turbo_e_4,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_e_4	139,1,1

turbo_e_4,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_e_4		139,0,2
turbo_e_4,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_e_4		139,1,0
turbo_e_4,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_e_4		139,1,0
turbo_e_4,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_e_4		139,0,1
turbo_e_4,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_e_4		139,1,0
turbo_e_4,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_e_4		139,1,0
turbo_e_4,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_e_4		139,0,1
turbo_e_4,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_e_4		139,1,0
turbo_e_4,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_e_4		139,0,1
turbo_e_4,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_e_4	139,1,0
turbo_e_4,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_e_4	139,0,1
turbo_e_4,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_e_4	139,1,0
turbo_e_4,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_e_4	139,1,0
turbo_e_4,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_e_4	139,1,0
turbo_e_4,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_e_4	139,1,0
turbo_e_4,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_e_4	139,0,1
turbo_e_4,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_e_4	139,1,0
turbo_e_4,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_e_4	139,0,1
turbo_e_4,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_e_4	139,0,1
turbo_e_4,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_e_4	139,0,1
turbo_e_4,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_e_4	139,0,1
turbo_e_4,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_e_4	139,2,0
turbo_e_4,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_e_4	139,2,0
turbo_e_4,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_e_4	139,0,1
turbo_e_4,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_e_4	139,0,1
turbo_e_4,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_e_4	139,2,0
turbo_e_4,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_e_4	139,1,0
turbo_e_4,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_e_4	139,0,1
turbo_e_4,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_e_4	139,0,1
turbo_e_4,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_e_4	139,1,0
turbo_e_4,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_e_4	139,1,1
turbo_e_4,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_e_4	139,1,0
turbo_e_4,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_e_4	139,1,1
turbo_e_4,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_e_4	139,1,1
turbo_e_4,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_e_4	139,2,0
turbo_e_4,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_e_4	139,1,1
turbo_e_4,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_e_4	139,2,0
turbo_e_4,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_e_4	139,1,0
turbo_e_4,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_e_4	139,1,1
turbo_e_4,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_e_4	139,1,1
turbo_e_4,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_e_4	139,1,1
turbo_e_4,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_e_4	139,1,1
turbo_e_4,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_e_4	139,1,1
turbo_e_4,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_e_4	139,1,1
turbo_e_4,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_e_4	139,1,1
turbo_e_4,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_e_4	139,1,0
turbo_e_4,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_e_4	139,2,1
turbo_e_4,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_e_4	139,1,1
turbo_e_4,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_e_4	139,0,1
turbo_e_4,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_e_4	139,1,0

turbo_e_4,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_e_4	139,3,3

turbo_e_4,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_e_4	45,1,1
turbo_e_4,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_e_4	45,1,1

turbo_e_4,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_e_4	45,3,3
turbo_e_4,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_e_4	45,3,3

turbo_e_4,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_e_4	139,2,2

turbo_e_4,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_e_4	45,1,1

turbo_e_4,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_e_4	45,1,1
turbo_e_4,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_e_4	45,1,1
turbo_e_4,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_e_4	45,1,1
turbo_e_4,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_e_4	45,1,1

turbo_e_4,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_e_4	45,1,1

turbo_e_4,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_e_4	139,3,3

turbo_e_4,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_e_4	45,1,1

turbo_e_4,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_e_4	139,1,1
turbo_e_4,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_e_4	139,1,1
turbo_e_4,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_e_4	139,1,1
turbo_e_4,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_e_4	139,1,1
turbo_e_4,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_e_4	139,1,1
turbo_e_4,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_e_4	139,1,1
turbo_e_4,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_e_4	139,1,1
turbo_e_4,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_e_4	139,1,1
turbo_e_4,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_e_4	139,1,1
turbo_e_4,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_e_4	139,1,1
turbo_e_4,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_e_4	139,1,1
turbo_e_4,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_e_4	139,1,1
turbo_e_4,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_e_4	139,1,1
turbo_e_4,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_e_4	139,1,1
turbo_e_4,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_e_4	139,1,1
turbo_e_4,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_e_4	139,1,1
turbo_e_4,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_e_4	139,1,1
turbo_e_4,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_e_4	139,1,1
turbo_e_4,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_e_4	139,1,1
turbo_e_4,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_e_4	139,1,1
turbo_e_4,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_e_4	139,1,1
turbo_e_4,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_e_4	139,1,1
turbo_e_4,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_e_4	139,1,1
turbo_e_4,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_e_4	139,1,1
turbo_e_4,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_e_4	139,1,1
turbo_e_4,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_e_4	139,1,1
turbo_e_4,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_e_4	139,1,1
turbo_e_4,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_e_4	139,1,1
turbo_e_4,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_e_4	139,1,1
turbo_e_4,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_e_4	139,1,1
turbo_e_4,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_e_4	139,1,1
turbo_e_4,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_e_4	139,1,1
turbo_e_4,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_e_4	139,1,1
turbo_e_4,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_e_4	139,1,1
turbo_e_4,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_e_4	139,1,1
turbo_e_4,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_e_4	139,1,1
turbo_e_4,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_e_4	139,1,1
turbo_e_4,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_e_4	139,1,1
turbo_e_4,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_e_4	139,1,1
turbo_e_4,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_e_4	139,1,1
turbo_e_4,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_e_4	139,1,1
turbo_e_4,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_e_4	139,1,1
turbo_e_4,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_e_4	139,1,1
turbo_e_4,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_e_4	139,1,1
turbo_e_4,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_e_4	139,1,1
turbo_e_4,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_e_4	139,1,1
turbo_e_4,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_e_4	139,1,1
turbo_e_4,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_e_4	139,1,1
turbo_e_4,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_e_4	139,1,1
turbo_e_4,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_e_4	139,1,1
turbo_e_4,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_e_4	139,1,1
turbo_e_4,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_e_4	139,1,1
turbo_e_4,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_e_4	139,1,1
turbo_e_4,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_e_4	139,1,1
turbo_e_4,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_e_4	139,1,1
turbo_e_4,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_e_4	139,1,1
turbo_e_4,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_e_4	139,1,1
turbo_e_4,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_e_4	139,1,1
turbo_e_4,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_e_4	139,1,1
turbo_e_4,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_e_4	139,1,1
turbo_e_4,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_e_4	139,1,1
turbo_e_4,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_e_4	139,1,1
turbo_e_4,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_e_4	139,1,1
turbo_e_4,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_e_4	139,1,1
turbo_e_4,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_e_4	139,1,1
turbo_e_4,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_e_4	139,1,1
turbo_e_4,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_e_4	139,1,1
turbo_e_4,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_e_4	139,1,1
turbo_e_4,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_e_4	139,1,1
turbo_e_4,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_e_4	139,1,1
turbo_e_4,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_e_4	139,1,1
turbo_e_4,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_e_4	139,1,1
turbo_e_4,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_e_4	139,1,1
turbo_e_4,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_e_4	139,1,1
turbo_e_4,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_e_4	139,1,1
turbo_e_4,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_e_4	139,1,1
turbo_e_4,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_e_4	139,1,1
turbo_e_4,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_e_4	139,1,1
turbo_e_4,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_e_4	139,1,1
turbo_e_4,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_e_4	139,1,1
turbo_e_4,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_e_4	139,1,1
turbo_e_4,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_e_4	139,1,1
turbo_e_4,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_e_4	139,1,1
turbo_e_4,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_e_4	139,1,1
turbo_e_4,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_e_4	139,1,1
turbo_e_4,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_e_4	139,1,1
turbo_e_4,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_e_4	139,1,1
turbo_e_4,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_e_4	139,1,1
turbo_e_4,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_e_4	139,1,1
turbo_e_4,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_e_4	139,1,1
turbo_e_4,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_e_4	139,1,1
turbo_e_4,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_e_4	139,1,1
turbo_e_4,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_e_4	139,1,1
turbo_e_4,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_e_4	139,1,1
turbo_e_4,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_e_4	139,1,1

turbo_e_4,371,47,0	script	�S�[��1#turbo_e_4	45,1,1,{
	callfunc "TurboGoal","turbo_e_4",40,1,11;
	end;
}

turbo_e_4,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_e_4	47

//==============================================================
// �n���E8�l���[�h
//==============================================================
turbo_room,117,135,3	script	�n���E8�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "�n���E8�l���[�h",20,"�n���E8�l���[�h#turbo::OnStart",8,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 8; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_e_8::OnStart";
	warpwaitingpc "turbo_e_8",298,161;
	end;
}

turbo_e_8,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_e_8	124

turbo_e_8,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_e_8	139,0,15
turbo_e_8,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_e_8	139,5,15

turbo_e_8,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_e_8	139,44,1
turbo_e_8,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_e_8	139,3,1
turbo_e_8,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_e_8	139,1,1
turbo_e_8,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_e_8	139,0,2
turbo_e_8,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_e_8	139,0,2
turbo_e_8,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_e_8	139,1,2
turbo_e_8,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_e_8	139,1,2
turbo_e_8,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_e_8	139,2,4
turbo_e_8,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_e_8	139,0,4
turbo_e_8,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_e_8	139,7,2
turbo_e_8,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_e_8	139,6,2
turbo_e_8,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_e_8	139,0,3
turbo_e_8,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_e_8	139,1,1

turbo_e_8,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_e_8	139,2,2
turbo_e_8,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_e_8	139,0,2
turbo_e_8,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_e_8	139,3,0
turbo_e_8,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_e_8	139,5,1
turbo_e_8,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_e_8	139,2,1
turbo_e_8,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_e_8	139,2,5
turbo_e_8,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_e_8	139,1,3
turbo_e_8,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_e_8	139,4,1
turbo_e_8,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_e_8	139,7,2
turbo_e_8,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_e_8	139,7,0
turbo_e_8,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_e_8	139,3,2
turbo_e_8,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_e_8	139,0,5
turbo_e_8,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_e_8	139,6,1
turbo_e_8,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_e_8	139,8,1
turbo_e_8,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_e_8	139,8,0
turbo_e_8,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_e_8	139,2,3
turbo_e_8,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_e_8	139,0,3
turbo_e_8,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_e_8	139,7,0
turbo_e_8,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_e_8	139,7,0
turbo_e_8,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_e_8	139,3,0
turbo_e_8,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_e_8	139,1,0
turbo_e_8,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_e_8	139,0,1

turbo_e_8,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_e_8	139,4,1
turbo_e_8,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_e_8	139,4,1
turbo_e_8,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_e_8	139,0,1
turbo_e_8,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_e_8	139,5,1
turbo_e_8,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_e_8	139,1,1
turbo_e_8,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_e_8	139,1,1
turbo_e_8,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_e_8	139,1,1
turbo_e_8,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_e_8	139,6,1
turbo_e_8,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_e_8	139,6,0
turbo_e_8,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_e_8	139,2,2
turbo_e_8,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_e_8	139,1,2
turbo_e_8,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_e_8	139,0,2
turbo_e_8,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_e_8	139,3,1
turbo_e_8,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_e_8	139,0,2
turbo_e_8,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_e_8	139,0,2
turbo_e_8,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_e_8	139,0,2
turbo_e_8,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_e_8	139,0,2
turbo_e_8,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_e_8	139,12,1
turbo_e_8,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_e_8	139,12,0
turbo_e_8,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_e_8	139,2,1
turbo_e_8,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_e_8	139,2,1
turbo_e_8,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_e_8	139,16,1
turbo_e_8,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_e_8	139,1,0
turbo_e_8,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_e_8	139,1,4
turbo_e_8,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_e_8	139,2,2
turbo_e_8,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_e_8	139,1,2
turbo_e_8,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_e_8	139,1,0
turbo_e_8,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_e_8	139,0,0

turbo_e_8,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_e_8	139,5,2
turbo_e_8,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_e_8	139,0,1
turbo_e_8,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_e_8	139,14,0
turbo_e_8,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_e_8	139,14,0
turbo_e_8,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_e_8	139,3,3
turbo_e_8,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_e_8	139,0,3
turbo_e_8,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_e_8	139,5,1
turbo_e_8,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_e_8	139,0,1
turbo_e_8,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_e_8	139,0,1
turbo_e_8,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_e_8	139,3,2
turbo_e_8,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_e_8	139,0,2
turbo_e_8,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_e_8	139,17,1
turbo_e_8,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_e_8	139,10,1
turbo_e_8,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_e_8	139,1,2
turbo_e_8,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_e_8	139,1,2

turbo_e_8,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_e_8	45,1,1

turbo_e_8,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_e_8	139,1,1
turbo_e_8,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_e_8	139,1,1
turbo_e_8,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_e_8	139,1,1
turbo_e_8,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_e_8	139,1,1
turbo_e_8,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_e_8	139,1,1
turbo_e_8,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_e_8	139,1,1
turbo_e_8,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_e_8	139,2,2

turbo_e_8,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_e_8	45,1,1

turbo_e_8,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_e_8	139,3,3
turbo_e_8,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_e_8	139,3,3
turbo_e_8,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_e_8	139,1,1
turbo_e_8,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_e_8	139,3,3
turbo_e_8,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_e_8	139,1,1
turbo_e_8,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_e_8	139,3,3
turbo_e_8,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_e_8	139,3,3
turbo_e_8,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_e_8	139,3,3
turbo_e_8,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_e_8	139,2,2
turbo_e_8,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_e_8	139,1,1
turbo_e_8,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_e_8	139,3,3
turbo_e_8,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_e_8	139,1,1
turbo_e_8,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_e_8	139,2,2
turbo_e_8,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_e_8	139,9,9
turbo_e_8,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_e_8	139,3,3
turbo_e_8,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_e_8	139,1,1
turbo_e_8,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_e_8	139,3,3
turbo_e_8,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_e_8	139,2,2
turbo_e_8,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_e_8	139,3,3
turbo_e_8,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_e_8	139,1,1
turbo_e_8,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_e_8	139,3,3
turbo_e_8,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_e_8	139,2,2
turbo_e_8,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_e_8	139,1,1

turbo_e_8,355,362,0	duplicate(�L��#turbo)	�L��#turbo_e_8	139,3,3

turbo_e_8,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_e_8	45,1,1

turbo_e_8,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_e_8	139,1,1

turbo_e_8,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_e_8		139,0,2
turbo_e_8,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_e_8		139,1,0
turbo_e_8,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_e_8		139,1,0
turbo_e_8,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_e_8		139,0,1
turbo_e_8,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_e_8		139,1,0
turbo_e_8,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_e_8		139,1,0
turbo_e_8,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_e_8		139,0,1
turbo_e_8,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_e_8		139,1,0
turbo_e_8,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_e_8		139,0,1
turbo_e_8,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_e_8	139,1,0
turbo_e_8,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_e_8	139,0,1
turbo_e_8,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_e_8	139,1,0
turbo_e_8,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_e_8	139,1,0
turbo_e_8,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_e_8	139,1,0
turbo_e_8,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_e_8	139,1,0
turbo_e_8,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_e_8	139,0,1
turbo_e_8,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_e_8	139,1,0
turbo_e_8,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_e_8	139,0,1
turbo_e_8,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_e_8	139,0,1
turbo_e_8,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_e_8	139,0,1
turbo_e_8,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_e_8	139,0,1
turbo_e_8,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_e_8	139,2,0
turbo_e_8,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_e_8	139,2,0
turbo_e_8,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_e_8	139,0,1
turbo_e_8,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_e_8	139,0,1
turbo_e_8,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_e_8	139,2,0
turbo_e_8,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_e_8	139,1,0
turbo_e_8,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_e_8	139,0,1
turbo_e_8,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_e_8	139,0,1
turbo_e_8,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_e_8	139,1,0
turbo_e_8,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_e_8	139,1,1
turbo_e_8,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_e_8	139,1,0
turbo_e_8,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_e_8	139,1,1
turbo_e_8,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_e_8	139,1,1
turbo_e_8,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_e_8	139,2,0
turbo_e_8,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_e_8	139,1,1
turbo_e_8,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_e_8	139,2,0
turbo_e_8,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_e_8	139,1,0
turbo_e_8,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_e_8	139,1,1
turbo_e_8,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_e_8	139,1,1
turbo_e_8,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_e_8	139,1,1
turbo_e_8,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_e_8	139,1,1
turbo_e_8,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_e_8	139,1,1
turbo_e_8,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_e_8	139,1,1
turbo_e_8,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_e_8	139,1,1
turbo_e_8,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_e_8	139,1,0
turbo_e_8,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_e_8	139,2,1
turbo_e_8,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_e_8	139,1,1
turbo_e_8,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_e_8	139,0,1
turbo_e_8,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_e_8	139,1,0

turbo_e_8,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_e_8	139,3,3

turbo_e_8,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_e_8	45,1,1
turbo_e_8,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_e_8	45,1,1

turbo_e_8,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_e_8	45,3,3
turbo_e_8,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_e_8	45,3,3

turbo_e_8,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_e_8	139,2,2

turbo_e_8,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_e_8	45,1,1

turbo_e_8,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_e_8	45,1,1
turbo_e_8,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_e_8	45,1,1
turbo_e_8,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_e_8	45,1,1
turbo_e_8,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_e_8	45,1,1

turbo_e_8,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_e_8	45,1,1

turbo_e_8,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_e_8	139,3,3

turbo_e_8,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_e_8	45,1,1

turbo_e_8,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_e_8	139,1,1
turbo_e_8,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_e_8	139,1,1
turbo_e_8,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_e_8	139,1,1
turbo_e_8,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_e_8	139,1,1
turbo_e_8,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_e_8	139,1,1
turbo_e_8,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_e_8	139,1,1
turbo_e_8,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_e_8	139,1,1
turbo_e_8,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_e_8	139,1,1
turbo_e_8,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_e_8	139,1,1
turbo_e_8,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_e_8	139,1,1
turbo_e_8,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_e_8	139,1,1
turbo_e_8,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_e_8	139,1,1
turbo_e_8,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_e_8	139,1,1
turbo_e_8,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_e_8	139,1,1
turbo_e_8,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_e_8	139,1,1
turbo_e_8,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_e_8	139,1,1
turbo_e_8,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_e_8	139,1,1
turbo_e_8,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_e_8	139,1,1
turbo_e_8,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_e_8	139,1,1
turbo_e_8,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_e_8	139,1,1
turbo_e_8,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_e_8	139,1,1
turbo_e_8,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_e_8	139,1,1
turbo_e_8,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_e_8	139,1,1
turbo_e_8,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_e_8	139,1,1
turbo_e_8,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_e_8	139,1,1
turbo_e_8,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_e_8	139,1,1
turbo_e_8,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_e_8	139,1,1
turbo_e_8,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_e_8	139,1,1
turbo_e_8,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_e_8	139,1,1
turbo_e_8,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_e_8	139,1,1
turbo_e_8,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_e_8	139,1,1
turbo_e_8,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_e_8	139,1,1
turbo_e_8,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_e_8	139,1,1
turbo_e_8,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_e_8	139,1,1
turbo_e_8,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_e_8	139,1,1
turbo_e_8,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_e_8	139,1,1
turbo_e_8,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_e_8	139,1,1
turbo_e_8,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_e_8	139,1,1
turbo_e_8,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_e_8	139,1,1
turbo_e_8,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_e_8	139,1,1
turbo_e_8,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_e_8	139,1,1
turbo_e_8,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_e_8	139,1,1
turbo_e_8,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_e_8	139,1,1
turbo_e_8,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_e_8	139,1,1
turbo_e_8,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_e_8	139,1,1
turbo_e_8,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_e_8	139,1,1
turbo_e_8,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_e_8	139,1,1
turbo_e_8,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_e_8	139,1,1
turbo_e_8,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_e_8	139,1,1
turbo_e_8,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_e_8	139,1,1
turbo_e_8,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_e_8	139,1,1
turbo_e_8,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_e_8	139,1,1
turbo_e_8,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_e_8	139,1,1
turbo_e_8,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_e_8	139,1,1
turbo_e_8,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_e_8	139,1,1
turbo_e_8,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_e_8	139,1,1
turbo_e_8,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_e_8	139,1,1
turbo_e_8,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_e_8	139,1,1
turbo_e_8,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_e_8	139,1,1
turbo_e_8,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_e_8	139,1,1
turbo_e_8,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_e_8	139,1,1
turbo_e_8,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_e_8	139,1,1
turbo_e_8,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_e_8	139,1,1
turbo_e_8,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_e_8	139,1,1
turbo_e_8,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_e_8	139,1,1
turbo_e_8,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_e_8	139,1,1
turbo_e_8,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_e_8	139,1,1
turbo_e_8,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_e_8	139,1,1
turbo_e_8,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_e_8	139,1,1
turbo_e_8,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_e_8	139,1,1
turbo_e_8,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_e_8	139,1,1
turbo_e_8,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_e_8	139,1,1
turbo_e_8,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_e_8	139,1,1
turbo_e_8,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_e_8	139,1,1
turbo_e_8,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_e_8	139,1,1
turbo_e_8,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_e_8	139,1,1
turbo_e_8,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_e_8	139,1,1
turbo_e_8,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_e_8	139,1,1
turbo_e_8,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_e_8	139,1,1
turbo_e_8,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_e_8	139,1,1
turbo_e_8,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_e_8	139,1,1
turbo_e_8,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_e_8	139,1,1
turbo_e_8,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_e_8	139,1,1
turbo_e_8,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_e_8	139,1,1
turbo_e_8,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_e_8	139,1,1
turbo_e_8,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_e_8	139,1,1
turbo_e_8,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_e_8	139,1,1
turbo_e_8,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_e_8	139,1,1
turbo_e_8,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_e_8	139,1,1
turbo_e_8,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_e_8	139,1,1
turbo_e_8,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_e_8	139,1,1
turbo_e_8,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_e_8	139,1,1
turbo_e_8,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_e_8	139,1,1
turbo_e_8,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_e_8	139,1,1
turbo_e_8,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_e_8	139,1,1

turbo_e_8,371,47,0	script	�S�[��1#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",50,1,12;
	end;
}
turbo_e_8,371,47,0	script	�S�[��2#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",40,2,12;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_e_8,371,47,0	script	�S�[��3#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",30,3,12;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_e_8,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_e_8	47

//==============================================================
// �n���E16�l���[�h
//==============================================================
turbo_room,124,135,3	script	�n���E16�l���[�h#turbo	124,{
	end;
OnInit:
	waitingroom "�n���E16�l���[�h",20,"�n���E16�l���[�h#turbo::OnStart",16,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 16; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "�R���p�j�I��#turbo_e_16::OnStart";
	warpwaitingpc "turbo_e_16",298,161;
	end;
}

turbo_e_16,298,167,3	duplicate(�R���p�j�I��#turbo)	�R���p�j�I��#turbo_e_16	124

turbo_e_16,62,364,0	duplicate(�t���C���O1#turbo)	�t���C���O1#turbo_e_16	139,0,15
turbo_e_16,68,364,0	duplicate(�t���C���O2#turbo)	�t���C���O2#turbo_e_16	139,5,15

turbo_e_16,118,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a1#turbo_e_16	139,44,1
turbo_e_16,77,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a2#turbo_e_16	139,3,1
turbo_e_16,82,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a3#turbo_e_16	139,1,1
turbo_e_16,82,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a4#turbo_e_16	139,0,2
turbo_e_16,83,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a5#turbo_e_16	139,0,2
turbo_e_16,97,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a6#turbo_e_16	139,1,2
turbo_e_16,98,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a7#turbo_e_16	139,1,2
turbo_e_16,122,372,0	duplicate(���Ƃ���#turbo)	���Ƃ���a8#turbo_e_16	139,2,4
turbo_e_16,125,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a9#turbo_e_16	139,0,4
turbo_e_16,132,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a10#turbo_e_16	139,7,2
turbo_e_16,156,374,0	duplicate(���Ƃ���#turbo)	���Ƃ���a11#turbo_e_16	139,6,2
turbo_e_16,163,375,0	duplicate(���Ƃ���#turbo)	���Ƃ���a12#turbo_e_16	139,0,3
turbo_e_16,164,377,0	duplicate(���Ƃ���#turbo)	���Ƃ���a13#turbo_e_16	139,1,1

turbo_e_16,76,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b1#turbo_e_16	139,2,2
turbo_e_16,79,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b2#turbo_e_16	139,0,2
turbo_e_16,77,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b3#turbo_e_16	139,3,0
turbo_e_16,85,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b4#turbo_e_16	139,5,1
turbo_e_16,87,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���b5#turbo_e_16	139,2,1
turbo_e_16,88,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b6#turbo_e_16	139,2,5
turbo_e_16,92,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b7#turbo_e_16	139,1,3
turbo_e_16,98,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b8#turbo_e_16	139,4,1
turbo_e_16,109,371,0	duplicate(���Ƃ���#turbo)	���Ƃ���b9#turbo_e_16	139,7,2
turbo_e_16,110,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b10#turbo_e_16	139,7,0
turbo_e_16,113,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b11#turbo_e_16	139,3,2
turbo_e_16,117,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b12#turbo_e_16	139,0,5
turbo_e_16,123,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���b13#turbo_e_16	139,6,1
turbo_e_16,136,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b14#turbo_e_16	139,8,1
turbo_e_16,136,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b15#turbo_e_16	139,8,0
turbo_e_16,144,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b16#turbo_e_16	139,2,3
turbo_e_16,147,370,0	duplicate(���Ƃ���#turbo)	���Ƃ���b17#turbo_e_16	139,0,3
turbo_e_16,155,369,0	duplicate(���Ƃ���#turbo)	���Ƃ���b18#turbo_e_16	139,7,0
turbo_e_16,155,368,0	duplicate(���Ƃ���#turbo)	���Ƃ���b19#turbo_e_16	139,7,0
turbo_e_16,151,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b20#turbo_e_16	139,3,0
turbo_e_16,153,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���b21#turbo_e_16	139,1,0
turbo_e_16,155,367,0	duplicate(���Ƃ���#turbo)	���Ƃ���b22#turbo_e_16	139,0,1

turbo_e_16,78,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c1#turbo_e_16	139,4,1
turbo_e_16,78,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c2#turbo_e_16	139,4,1
turbo_e_16,83,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c3#turbo_e_16	139,0,1
turbo_e_16,88,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c4#turbo_e_16	139,5,1
turbo_e_16,89,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c5#turbo_e_16	139,1,1
turbo_e_16,92,390,0	duplicate(���Ƃ���#turbo)	���Ƃ���c6#turbo_e_16	139,1,1
turbo_e_16,92,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c7#turbo_e_16	139,1,1
turbo_e_16,98,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c8#turbo_e_16	139,6,1
turbo_e_16,98,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c9#turbo_e_16	139,6,0
turbo_e_16,106,364,0	duplicate(���Ƃ���#turbo)	���Ƃ���c10#turbo_e_16	139,2,2
turbo_e_16,107,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c11#turbo_e_16	139,1,2
turbo_e_16,109,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c12#turbo_e_16	139,0,2
turbo_e_16,112,361,0	duplicate(���Ƃ���#turbo)	���Ƃ���c13#turbo_e_16	139,3,1
turbo_e_16,116,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c14#turbo_e_16	139,0,2
turbo_e_16,117,359,0	duplicate(���Ƃ���#turbo)	���Ƃ���c15#turbo_e_16	139,0,2
turbo_e_16,116,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c16#turbo_e_16	139,0,2
turbo_e_16,117,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���c17#turbo_e_16	139,0,2
turbo_e_16,129,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c18#turbo_e_16	139,12,1
turbo_e_16,129,358,0	duplicate(���Ƃ���#turbo)	���Ƃ���c19#turbo_e_16	139,12,0
turbo_e_16,132,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c20#turbo_e_16	139,2,1
turbo_e_16,137,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���c21#turbo_e_16	139,2,1
turbo_e_16,147,363,0	duplicate(���Ƃ���#turbo)	���Ƃ���c22#turbo_e_16	139,16,1
turbo_e_16,149,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c23#turbo_e_16	139,1,0
turbo_e_16,158,362,0	duplicate(���Ƃ���#turbo)	���Ƃ���c24#turbo_e_16	139,1,4
turbo_e_16,154,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c25#turbo_e_16	139,2,2
turbo_e_16,161,360,0	duplicate(���Ƃ���#turbo)	���Ƃ���c26#turbo_e_16	139,1,2
turbo_e_16,161,365,0	duplicate(���Ƃ���#turbo)	���Ƃ���c27#turbo_e_16	139,1,0
turbo_e_16,160,366,0	duplicate(���Ƃ���#turbo)	���Ƃ���c28#turbo_e_16	139,0,0

turbo_e_16,79,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d1#turbo_e_16	139,5,2
turbo_e_16,85,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d2#turbo_e_16	139,0,1
turbo_e_16,99,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d3#turbo_e_16	139,14,0
turbo_e_16,99,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d4#turbo_e_16	139,14,0
turbo_e_16,99,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d5#turbo_e_16	139,3,3
turbo_e_16,103,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d6#turbo_e_16	139,0,3
turbo_e_16,108,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d7#turbo_e_16	139,5,1
turbo_e_16,112,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d8#turbo_e_16	139,0,1
turbo_e_16,113,356,0	duplicate(���Ƃ���#turbo)	���Ƃ���d9#turbo_e_16	139,0,1
turbo_e_16,123,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d10#turbo_e_16	139,3,2
turbo_e_16,127,353,0	duplicate(���Ƃ���#turbo)	���Ƃ���d11#turbo_e_16	139,0,2
turbo_e_16,145,352,0	duplicate(���Ƃ���#turbo)	���Ƃ���d12#turbo_e_16	139,17,1
turbo_e_16,152,354,0	duplicate(���Ƃ���#turbo)	���Ƃ���d13#turbo_e_16	139,10,1
turbo_e_16,145,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d14#turbo_e_16	139,1,2
turbo_e_16,148,357,0	duplicate(���Ƃ���#turbo)	���Ƃ���d15#turbo_e_16	139,1,2

turbo_e_16,168,363,0	duplicate(�ʉ�1#turbo)	�ʉ�1#turbo_e_16	45,1,1

turbo_e_16,227,379,0	duplicate(���[�v#turbo)	���[�v1#turbo_e_16	139,1,1
turbo_e_16,237,380,0	duplicate(���[�v#turbo)	���[�v2#turbo_e_16	139,1,1
turbo_e_16,227,367,0	duplicate(���[�v#turbo)	���[�v3#turbo_e_16	139,1,1
turbo_e_16,231,360,0	duplicate(���[�v#turbo)	���[�v4#turbo_e_16	139,1,1
turbo_e_16,225,349,0	duplicate(���[�v#turbo)	���[�v5#turbo_e_16	139,1,1
turbo_e_16,249,352,0	duplicate(���[�v#turbo)	���[�v6#turbo_e_16	139,1,1
turbo_e_16,253,364,0	duplicate(���[�v#turbo)	���[�v7#turbo_e_16	139,2,2

turbo_e_16,258,364,0	duplicate(�ʉ�2#turbo)	�ʉ�2#turbo_e_16	45,1,1

turbo_e_16,322,354,0	duplicate(�g���b�v#turbo)	�g���b�v1#turbo_e_16	139,3,3
turbo_e_16,323,360,0	duplicate(�g���b�v#turbo)	�g���b�v2#turbo_e_16	139,3,3
turbo_e_16,324,365,0	duplicate(�g���b�v#turbo)	�g���b�v3#turbo_e_16	139,1,1
turbo_e_16,325,370,0	duplicate(�g���b�v#turbo)	�g���b�v4#turbo_e_16	139,3,3
turbo_e_16,325,375,0	duplicate(�g���b�v#turbo)	�g���b�v5#turbo_e_16	139,1,1
turbo_e_16,329,377,0	duplicate(�g���b�v#turbo)	�g���b�v6#turbo_e_16	139,3,3
turbo_e_16,338,372,0	duplicate(�g���b�v#turbo)	�g���b�v7#turbo_e_16	139,3,3
turbo_e_16,341,364,0	duplicate(�g���b�v#turbo)	�g���b�v8#turbo_e_16	139,3,3
turbo_e_16,325,359,0	duplicate(�g���b�v#turbo)	�g���b�v9#turbo_e_16	139,2,2
turbo_e_16,341,355,0	duplicate(�g���b�v#turbo)	�g���b�v10#turbo_e_16	139,1,1
turbo_e_16,350,355,0	duplicate(�g���b�v#turbo)	�g���b�v11#turbo_e_16	139,3,3
turbo_e_16,348,363,0	duplicate(�g���b�v#turbo)	�g���b�v12#turbo_e_16	139,1,1
turbo_e_16,347,370,0	duplicate(�g���b�v#turbo)	�g���b�v13#turbo_e_16	139,2,2
turbo_e_16,349,377,0	duplicate(�g���b�v#turbo)	�g���b�v14#turbo_e_16	139,9,9
turbo_e_16,362,372,0	duplicate(�g���b�v#turbo)	�g���b�v15#turbo_e_16	139,3,3
turbo_e_16,364,365,0	duplicate(�g���b�v#turbo)	�g���b�v16#turbo_e_16	139,1,1
turbo_e_16,363,357,0	duplicate(�g���b�v#turbo)	�g���b�v17#turbo_e_16	139,3,3
turbo_e_16,374,358,0	duplicate(�g���b�v#turbo)	�g���b�v18#turbo_e_16	139,2,2
turbo_e_16,371,367,0	duplicate(�g���b�v#turbo)	�g���b�v19#turbo_e_16	139,3,3
turbo_e_16,371,376,0	duplicate(�g���b�v#turbo)	�g���b�v20#turbo_e_16	139,1,1
turbo_e_16,379,375,0	duplicate(�g���b�v#turbo)	�g���b�v21#turbo_e_16	139,3,3
turbo_e_16,382,363,0	duplicate(�g���b�v#turbo)	�g���b�v22#turbo_e_16	139,2,2
turbo_e_16,381,354,0	duplicate(�g���b�v#turbo)	�g���b�v23#turbo_e_16	139,1,1

turbo_e_16,355,362,0	duplicate(�L��#turbo)	�L��#turbo_e_16	139,3,3

turbo_e_16,385,365,0	duplicate(�ʉ�3#turbo)	�ʉ�3#turbo_e_16	45,1,1

turbo_e_16,316,365,0	duplicate(�ÈőI��#turbo)	�ÈőI��#turbo_e_16	139,1,1

turbo_e_16,13,266,0	duplicate(�È�#turbo)	�È�1#turbo_e_16		139,0,2
turbo_e_16,24,268,0	duplicate(�È�#turbo)	�È�2#turbo_e_16		139,1,0
turbo_e_16,20,258,0	duplicate(�È�#turbo)	�È�3#turbo_e_16		139,1,0
turbo_e_16,23,251,0	duplicate(�È�#turbo)	�È�4#turbo_e_16		139,0,1
turbo_e_16,36,270,0	duplicate(�È�#turbo)	�È�5#turbo_e_16		139,1,0
turbo_e_16,22,239,0	duplicate(�È�#turbo)	�È�6#turbo_e_16		139,1,0
turbo_e_16,38,239,0	duplicate(�È�#turbo)	�È�7#turbo_e_16		139,0,1
turbo_e_16,37,237,0	duplicate(�È�#turbo)	�È�8#turbo_e_16		139,1,0
turbo_e_16,55,247,0	duplicate(�È�#turbo)	�È�9#turbo_e_16		139,0,1
turbo_e_16,55,246,0	duplicate(�È�#turbo)	�È�10#turbo_e_16	139,1,0
turbo_e_16,63,253,0	duplicate(�È�#turbo)	�È�11#turbo_e_16	139,0,1
turbo_e_16,36,216,0	duplicate(�È�#turbo)	�È�12#turbo_e_16	139,1,0
turbo_e_16,20,209,0	duplicate(�È�#turbo)	�È�13#turbo_e_16	139,1,0
turbo_e_16,28,195,0	duplicate(�È�#turbo)	�È�14#turbo_e_16	139,1,0
turbo_e_16,82,264,0	duplicate(�È�#turbo)	�È�15#turbo_e_16	139,1,0
turbo_e_16,47,185,0	duplicate(�È�#turbo)	�È�16#turbo_e_16	139,0,1
turbo_e_16,53,207,0	duplicate(�È�#turbo)	�È�17#turbo_e_16	139,1,0
turbo_e_16,54,208,0	duplicate(�È�#turbo)	�È�18#turbo_e_16	139,0,1
turbo_e_16,81,247,0	duplicate(�È�#turbo)	�È�19#turbo_e_16	139,0,1
turbo_e_16,105,257,0	duplicate(�È�#turbo)	�È�20#turbo_e_16	139,0,1
turbo_e_16,95,242,0	duplicate(�È�#turbo)	�È�21#turbo_e_16	139,0,1
turbo_e_16,77,232,0	duplicate(�È�#turbo)	�È�22#turbo_e_16	139,2,0
turbo_e_16,67,222,0	duplicate(�È�#turbo)	�È�23#turbo_e_16	139,2,0
turbo_e_16,83,206,0	duplicate(�È�#turbo)	�È�24#turbo_e_16	139,0,1
turbo_e_16,95,224,0	duplicate(�È�#turbo)	�È�25#turbo_e_16	139,0,1
turbo_e_16,106,220,0	duplicate(�È�#turbo)	�È�26#turbo_e_16	139,2,0
turbo_e_16,93,191,0	duplicate(�È�#turbo)	�È�27#turbo_e_16	139,1,0
turbo_e_16,94,192,0	duplicate(�È�#turbo)	�È�28#turbo_e_16	139,0,1
turbo_e_16,46,214,0	duplicate(�È�#turbo)	�È�29#turbo_e_16	139,0,1
turbo_e_16,16,247,0	duplicate(�È�#turbo)	�È�30#turbo_e_16	139,1,0
turbo_e_16,58,268,0	duplicate(�È�#turbo)	�È�31#turbo_e_16	139,1,1
turbo_e_16,36,253,0	duplicate(�È�#turbo)	�È�32#turbo_e_16	139,1,0
turbo_e_16,69,238,0	duplicate(�È�#turbo)	�È�33#turbo_e_16	139,1,1
turbo_e_16,58,268,0	duplicate(�È�#turbo)	�È�34#turbo_e_16	139,1,1
turbo_e_16,74,188,0	duplicate(�È�#turbo)	�È�35#turbo_e_16	139,2,0
turbo_e_16,99,207,0	duplicate(�È�#turbo)	�È�36#turbo_e_16	139,1,1
turbo_e_16,74,188,0	duplicate(�È�#turbo)	�È�37#turbo_e_16	139,2,0
turbo_e_16,111,188,0	duplicate(�È�#turbo)	�È�38#turbo_e_16	139,1,0
turbo_e_16,51,232,0	duplicate(�È�#turbo)	�È�39#turbo_e_16	139,1,1
turbo_e_16,30,232,0	duplicate(�È�#turbo)	�È�40#turbo_e_16	139,1,1
turbo_e_16,92,256,0	duplicate(�È�#turbo)	�È�41#turbo_e_16	139,1,1
turbo_e_16,79,220,0	duplicate(�È�#turbo)	�È�42#turbo_e_16	139,1,1
turbo_e_16,51,192,0	duplicate(�È�#turbo)	�È�43#turbo_e_16	139,1,1
turbo_e_16,22,227,0	duplicate(�È�#turbo)	�È�44#turbo_e_16	139,1,1
turbo_e_16,51,232,0	duplicate(�È�#turbo)	�È�45#turbo_e_16	139,1,1
turbo_e_16,42,258,0	duplicate(�È�#turbo)	�È�46#turbo_e_16	139,1,0
turbo_e_16,45,271,0	duplicate(�È�#turbo)	�È�47#turbo_e_16	139,2,1
turbo_e_16,72,207,0	duplicate(�È�#turbo)	�È�48#turbo_e_16	139,1,1
turbo_e_16,33,192,0	duplicate(�È�#turbo)	�È�49#turbo_e_16	139,0,1
turbo_e_16,90,241,0	duplicate(�È�#turbo)	�È�50#turbo_e_16	139,1,0

turbo_e_16,193,236,0	duplicate(�Èŉ���#turbo)	�Èŉ���#turbo_e_16	139,3,3

turbo_e_16,11,266,0	duplicate(�Èŏo��#turbo)	�Èŏo��1#turbo_e_16	45,1,1
turbo_e_16,114,190,0	duplicate(�Èŏo��#turbo)	�Èŏo��2#turbo_e_16	45,1,1

turbo_e_16,217,214,0	duplicate(�W�Q#turbo)	�W�Q1#turbo_e_16	45,3,3
turbo_e_16,217,214,0	duplicate(�W�Q#turbo)	�W�Q2#turbo_e_16	45,3,3

turbo_e_16,234,223,0	duplicate(�g�b�v1#turbo)	�g�b�v1#turbo_e_16	139,2,2

turbo_e_16,250,200,0	duplicate(�ʉ�5#turbo)	�ʉ�5#turbo_e_16	45,1,1

turbo_e_16,324,279,0	duplicate(�ւ̓�1#turbo)	�ւ̓�1#turbo_e_16	45,1,1
turbo_e_16,332,279,0	duplicate(�ւ̓�2#turbo)	�ւ̓�2#turbo_e_16	45,1,1
turbo_e_16,324,270,0	duplicate(�ւ̓�3#turbo)	�ւ̓�3#turbo_e_16	45,1,1
turbo_e_16,332,270,0	duplicate(�ւ̓�4#turbo)	�ւ̓�4#turbo_e_16	45,1,1

turbo_e_16,389,275,0	duplicate(�ʉ�6#turbo)	�ʉ�6#turbo_e_16	45,1,1

turbo_e_16,11,91,0	duplicate(�g�b�v2#turbo)	�g�b�v2#turbo_e_16	139,3,3

turbo_e_16,93,19,0	duplicate(�ʉ�7#turbo)	�ʉ�7#turbo_e_16	45,1,1

turbo_e_16,179,55,0	duplicate(�ʘH#turbo)	�ʘHa#turbo_e_16	139,1,1
turbo_e_16,184,45,0	duplicate(�ʘH#turbo)	�ʘHb#turbo_e_16	139,1,1
turbo_e_16,181,30,0	duplicate(�ʘH#turbo)	�ʘHc#turbo_e_16	139,1,1
turbo_e_16,186,28,0	duplicate(�ʘH#turbo)	�ʘHd#turbo_e_16	139,1,1
turbo_e_16,183,19,0	duplicate(�ʘH#turbo)	�ʘHe#turbo_e_16	139,1,1
turbo_e_16,191,37,0	duplicate(�ʘH#turbo)	�ʘHf#turbo_e_16	139,1,1
turbo_e_16,173,25,0	duplicate(�ʘH#turbo)	�ʘHg#turbo_e_16	139,1,1
turbo_e_16,201,21,0	duplicate(�ʘH#turbo)	�ʘHh#turbo_e_16	139,1,1
turbo_e_16,222,21,0	duplicate(�ʘH#turbo)	�ʘHi#turbo_e_16	139,1,1
turbo_e_16,214,39,0	duplicate(�ʘH#turbo)	�ʘHj#turbo_e_16	139,1,1
turbo_e_16,222,48,0	duplicate(�ʘH#turbo)	�ʘHk#turbo_e_16	139,1,1
turbo_e_16,214,60,0	duplicate(�ʘH#turbo)	�ʘHl#turbo_e_16	139,1,1
turbo_e_16,209,61,0	duplicate(�ʘH#turbo)	�ʘHm#turbo_e_16	139,1,1
turbo_e_16,208,56,0	duplicate(�ʘH#turbo)	�ʘHn#turbo_e_16	139,1,1

turbo_e_16,178,63,0	duplicate(���H#turbo)	���H1#turbo_e_16	139,1,1
turbo_e_16,182,40,0	duplicate(���H#turbo)	���H2#turbo_e_16	139,1,1
turbo_e_16,176,29,0	duplicate(���H#turbo)	���H3#turbo_e_16	139,1,1
turbo_e_16,180,25,0	duplicate(���H#turbo)	���H4#turbo_e_16	139,1,1
turbo_e_16,201,157,0	duplicate(���H#turbo)	���H5#turbo_e_16	139,1,1
turbo_e_16,203,65,0	duplicate(���H#turbo)	���H6#turbo_e_16	139,1,1
turbo_e_16,208,52,0	duplicate(���H#turbo)	���H7#turbo_e_16	139,1,1
turbo_e_16,208,26,0	duplicate(���H#turbo)	���H8#turbo_e_16	139,1,1
turbo_e_16,191,30,0	duplicate(���H#turbo)	���H9#turbo_e_16	139,1,1

turbo_e_16,187,55,0	duplicate(�q���g#turbo)	�q���g1#turbo_e_16	139,1,1
turbo_e_16,176,45,0	duplicate(�q���g#turbo)	�q���g2#turbo_e_16	139,1,1
turbo_e_16,222,26,0	duplicate(�q���g#turbo)	�q���g3#turbo_e_16	139,1,1
turbo_e_16,219,39,0	duplicate(�q���g#turbo)	�q���g4#turbo_e_16	139,1,1
turbo_e_16,222,45,0	duplicate(�q���g#turbo)	�q���g5#turbo_e_16	139,1,1
turbo_e_16,222,61,0	duplicate(�q���g#turbo)	�q���g6#turbo_e_16	139,1,1
turbo_e_16,222,65,0	duplicate(�q���g#turbo)	�q���g7#turbo_e_16	139,1,1

turbo_e_16,226,15,0	duplicate(�g�b�v3#turbo)	�g�b�v3#turbo_e_16	139,3,3

turbo_e_16,232,14,0	duplicate(�ʉ�8#turbo)	�ʉ�8#turbo_e_16	45,1,1

turbo_e_16,307,55,0	duplicate(�u���X�g#turbo)	�n��1#turbo_e_16	139,1,1
turbo_e_16,307,51,0	duplicate(�u���X�g#turbo)	�n��2#turbo_e_16	139,1,1
turbo_e_16,307,47,0	duplicate(�u���X�g#turbo)	�n��3#turbo_e_16	139,1,1
turbo_e_16,307,43,0	duplicate(�u���X�g#turbo)	�n��4#turbo_e_16	139,1,1
turbo_e_16,307,39,0	duplicate(�u���X�g#turbo)	�n��5#turbo_e_16	139,1,1
turbo_e_16,312,56,0	duplicate(�u���X�g#turbo)	�n��6#turbo_e_16	139,1,1
turbo_e_16,312,52,0	duplicate(�u���X�g#turbo)	�n��7#turbo_e_16	139,1,1
turbo_e_16,312,48,0	duplicate(�u���X�g#turbo)	�n��8#turbo_e_16	139,1,1
turbo_e_16,312,44,0	duplicate(�u���X�g#turbo)	�n��9#turbo_e_16	139,1,1
turbo_e_16,312,40,0	duplicate(�u���X�g#turbo)	�n��10#turbo_e_16	139,1,1
turbo_e_16,312,36,0	duplicate(�u���X�g#turbo)	�n��11#turbo_e_16	139,1,1
turbo_e_16,316,55,0	duplicate(�u���X�g#turbo)	�n��12#turbo_e_16	139,1,1
turbo_e_16,316,51,0	duplicate(�u���X�g#turbo)	�n��13#turbo_e_16	139,1,1
turbo_e_16,316,47,0	duplicate(�u���X�g#turbo)	�n��14#turbo_e_16	139,1,1
turbo_e_16,316,43,0	duplicate(�u���X�g#turbo)	�n��15#turbo_e_16	139,1,1
turbo_e_16,316,39,0	duplicate(�u���X�g#turbo)	�n��16#turbo_e_16	139,1,1
turbo_e_16,316,36,0	duplicate(�u���X�g#turbo)	�n��17#turbo_e_16	139,1,1
turbo_e_16,320,56,0	duplicate(�u���X�g#turbo)	�n��18#turbo_e_16	139,1,1
turbo_e_16,320,52,0	duplicate(�u���X�g#turbo)	�n��19#turbo_e_16	139,1,1
turbo_e_16,320,48,0	duplicate(�u���X�g#turbo)	�n��20#turbo_e_16	139,1,1
turbo_e_16,320,44,0	duplicate(�u���X�g#turbo)	�n��21#turbo_e_16	139,1,1
turbo_e_16,320,40,0	duplicate(�u���X�g#turbo)	�n��22#turbo_e_16	139,1,1
turbo_e_16,320,36,0	duplicate(�u���X�g#turbo)	�n��23#turbo_e_16	139,1,1
turbo_e_16,324,55,0	duplicate(�u���X�g#turbo)	�n��24#turbo_e_16	139,1,1
turbo_e_16,324,51,0	duplicate(�u���X�g#turbo)	�n��25#turbo_e_16	139,1,1
turbo_e_16,324,47,0	duplicate(�u���X�g#turbo)	�n��26#turbo_e_16	139,1,1
turbo_e_16,324,43,0	duplicate(�u���X�g#turbo)	�n��27#turbo_e_16	139,1,1
turbo_e_16,324,39,0	duplicate(�u���X�g#turbo)	�n��28#turbo_e_16	139,1,1
turbo_e_16,324,36,0	duplicate(�u���X�g#turbo)	�n��29#turbo_e_16	139,1,1
turbo_e_16,328,56,0	duplicate(�u���X�g#turbo)	�n��30#turbo_e_16	139,1,1
turbo_e_16,328,52,0	duplicate(�u���X�g#turbo)	�n��31#turbo_e_16	139,1,1
turbo_e_16,328,48,0	duplicate(�u���X�g#turbo)	�n��32#turbo_e_16	139,1,1
turbo_e_16,328,44,0	duplicate(�u���X�g#turbo)	�n��33#turbo_e_16	139,1,1
turbo_e_16,328,40,0	duplicate(�u���X�g#turbo)	�n��34#turbo_e_16	139,1,1
turbo_e_16,328,36,0	duplicate(�u���X�g#turbo)	�n��35#turbo_e_16	139,1,1
turbo_e_16,332,55,0	duplicate(�u���X�g#turbo)	�n��36#turbo_e_16	139,1,1
turbo_e_16,332,51,0	duplicate(�u���X�g#turbo)	�n��37#turbo_e_16	139,1,1
turbo_e_16,332,47,0	duplicate(�u���X�g#turbo)	�n��38#turbo_e_16	139,1,1
turbo_e_16,332,43,0	duplicate(�u���X�g#turbo)	�n��39#turbo_e_16	139,1,1
turbo_e_16,332,39,0	duplicate(�u���X�g#turbo)	�n��40#turbo_e_16	139,1,1
turbo_e_16,332,36,0	duplicate(�u���X�g#turbo)	�n��41#turbo_e_16	139,1,1
turbo_e_16,336,56,0	duplicate(�t���[�W���O#turbo)	�n��42#turbo_e_16	139,1,1
turbo_e_16,336,52,0	duplicate(�t���[�W���O#turbo)	�n��43#turbo_e_16	139,1,1
turbo_e_16,336,48,0	duplicate(�t���[�W���O#turbo)	�n��44#turbo_e_16	139,1,1
turbo_e_16,336,44,0	duplicate(�t���[�W���O#turbo)	�n��45#turbo_e_16	139,1,1
turbo_e_16,336,40,0	duplicate(�t���[�W���O#turbo)	�n��46#turbo_e_16	139,1,1
turbo_e_16,336,36,0	duplicate(�t���[�W���O#turbo)	�n��47#turbo_e_16	139,1,1
turbo_e_16,340,55,0	duplicate(�u���X�g#turbo)	�n��48#turbo_e_16	139,1,1
turbo_e_16,340,51,0	duplicate(�u���X�g#turbo)	�n��49#turbo_e_16	139,1,1
turbo_e_16,340,47,0	duplicate(�u���X�g#turbo)	�n��50#turbo_e_16	139,1,1
turbo_e_16,340,43,0	duplicate(�u���X�g#turbo)	�n��51#turbo_e_16	139,1,1
turbo_e_16,340,39,0	duplicate(�u���X�g#turbo)	�n��52#turbo_e_16	139,1,1
turbo_e_16,340,36,0	duplicate(�u���X�g#turbo)	�n��53#turbo_e_16	139,1,1
turbo_e_16,344,56,0	duplicate(�u���X�g#turbo)	�n��54#turbo_e_16	139,1,1
turbo_e_16,344,52,0	duplicate(�u���X�g#turbo)	�n��55#turbo_e_16	139,1,1
turbo_e_16,344,48,0	duplicate(�u���X�g#turbo)	�n��56#turbo_e_16	139,1,1
turbo_e_16,344,44,0	duplicate(�u���X�g#turbo)	�n��57#turbo_e_16	139,1,1
turbo_e_16,344,40,0	duplicate(�u���X�g#turbo)	�n��58#turbo_e_16	139,1,1
turbo_e_16,344,36,0	duplicate(�u���X�g#turbo)	�n��59#turbo_e_16	139,1,1
turbo_e_16,348,55,0	duplicate(�u���X�g#turbo)	�n��60#turbo_e_16	139,1,1
turbo_e_16,348,51,0	duplicate(�u���X�g#turbo)	�n��61#turbo_e_16	139,1,1
turbo_e_16,348,47,0	duplicate(�u���X�g#turbo)	�n��62#turbo_e_16	139,1,1
turbo_e_16,348,43,0	duplicate(�u���X�g#turbo)	�n��63#turbo_e_16	139,1,1
turbo_e_16,348,39,0	duplicate(�u���X�g#turbo)	�n��64#turbo_e_16	139,1,1
turbo_e_16,348,36,0	duplicate(�u���X�g#turbo)	�n��65#turbo_e_16	139,1,1
turbo_e_16,352,56,0	duplicate(�u���X�g#turbo)	�n��66#turbo_e_16	139,1,1
turbo_e_16,352,52,0	duplicate(�u���X�g#turbo)	�n��67#turbo_e_16	139,1,1
turbo_e_16,352,48,0	duplicate(�u���X�g#turbo)	�n��68#turbo_e_16	139,1,1
turbo_e_16,352,44,0	duplicate(�u���X�g#turbo)	�n��69#turbo_e_16	139,1,1
turbo_e_16,352,40,0	duplicate(�u���X�g#turbo)	�n��70#turbo_e_16	139,1,1
turbo_e_16,352,36,0	duplicate(�u���X�g#turbo)	�n��71#turbo_e_16	139,1,1
turbo_e_16,356,55,0	duplicate(�u���X�g#turbo)	�n��72#turbo_e_16	139,1,1
turbo_e_16,356,51,0	duplicate(�u���X�g#turbo)	�n��73#turbo_e_16	139,1,1
turbo_e_16,356,47,0	duplicate(�u���X�g#turbo)	�n��74#turbo_e_16	139,1,1
turbo_e_16,356,43,0	duplicate(�u���X�g#turbo)	�n��75#turbo_e_16	139,1,1
turbo_e_16,356,39,0	duplicate(�u���X�g#turbo)	�n��76#turbo_e_16	139,1,1
turbo_e_16,356,36,0	duplicate(�u���X�g#turbo)	�n��77#turbo_e_16	139,1,1
turbo_e_16,360,56,0	duplicate(�u���X�g#turbo)	�n��78#turbo_e_16	139,1,1
turbo_e_16,360,52,0	duplicate(�u���X�g#turbo)	�n��79#turbo_e_16	139,1,1
turbo_e_16,360,48,0	duplicate(�u���X�g#turbo)	�n��80#turbo_e_16	139,1,1
turbo_e_16,360,44,0	duplicate(�u���X�g#turbo)	�n��81#turbo_e_16	139,1,1
turbo_e_16,360,40,0	duplicate(�u���X�g#turbo)	�n��82#turbo_e_16	139,1,1
turbo_e_16,360,36,0	duplicate(�u���X�g#turbo)	�n��83#turbo_e_16	139,1,1
turbo_e_16,364,55,0	duplicate(�u���X�g#turbo)	�n��84#turbo_e_16	139,1,1
turbo_e_16,364,51,0	duplicate(�u���X�g#turbo)	�n��85#turbo_e_16	139,1,1
turbo_e_16,364,47,0	duplicate(�u���X�g#turbo)	�n��86#turbo_e_16	139,1,1
turbo_e_16,364,43,0	duplicate(�u���X�g#turbo)	�n��87#turbo_e_16	139,1,1
turbo_e_16,364,39,0	duplicate(�u���X�g#turbo)	�n��88#turbo_e_16	139,1,1
turbo_e_16,364,36,0	duplicate(�u���X�g#turbo)	�n��89#turbo_e_16	139,1,1
turbo_e_16,368,56,0	duplicate(�u���X�g#turbo)	�n��90#turbo_e_16	139,1,1
turbo_e_16,368,52,0	duplicate(�u���X�g#turbo)	�n��91#turbo_e_16	139,1,1
turbo_e_16,368,48,0	duplicate(�u���X�g#turbo)	�n��92#turbo_e_16	139,1,1
turbo_e_16,368,44,0	duplicate(�u���X�g#turbo)	�n��93#turbo_e_16	139,1,1
turbo_e_16,368,40,0	duplicate(�u���X�g#turbo)	�n��94#turbo_e_16	139,1,1
turbo_e_16,368,36,0	duplicate(�u���X�g#turbo)	�n��95#turbo_e_16	139,1,1

turbo_e_16,371,47,0	script	�S�[��1#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",60,1,13;
	end;
}
turbo_e_16,371,47,0	script	�S�[��2#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",50,2,13;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_e_16,371,47,0	script	�S�[��3#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",40,3,13;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_e_16,384,167,1	duplicate(�i�s�v��#turbo)	�D���҃K�C�h#turbo_e_16	47
