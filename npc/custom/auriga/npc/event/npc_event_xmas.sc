//==============================================================================
// Ragnarok Online XmasEvent2005 Script     by AthenaDev
//==============================================================================
xmas_in,87,91,6	script	�J�v���f�B�t�H���e�[	117,{
	cutin "kafra_01",2;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "��������Ⴂ�܂�";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	mes "�����A�N���X�}�X���Ԍ���";
	mes "�u���b�s���O�T�[�r�X�v��";
	mes "���񋟂��Ă���܂��B";
	next;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "�F�B��Ƒ��A���l�ɓ��ʂȑ��蕨��";
	mes "���������ׂ̈ɁA�v���[���g�{�b�N�X��";
	mes "���ƃ��{���ł���݂��Ă���܂��B";
	mes "�܂�������łȂ��A�����̕���";
	mes "�����O���v���[���g�{�b�N�X��";
	mes "�L�����Ă���܂��B";
	next;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "�u���b�s���O�T�[�r�X�v�̓N���X�}�X";
	mes "���Ԓ��ɍޗ������p�ӂ��������";
	mes "�ǂȂ��ł������p�ɂȂ�܂��B";
	mes "�z����`���������֐S�����߂�";
	mes "���蕨���Ȃ��肽����΁A����";
	mes "�J�v���E���ɂ��\���t�����������B";
	close2;
	cutin "kafra_01",255;
	end;
}

xmas_in,87,89,6	script	�J�v���e�[�����O	116,{
	cutin "kafra_02",2;
	mes "[�J�v���e�[�����O]";
	mes "�N���X�}�X���Ԍ���J�v���T�[�r�X";
	mes "�u���b�s���O�T�[�r�X�v�ł��I";
	mes "�ǂȂ����󂯎���Ă�������";
	mes "��΂��Ǝv���܂��B";
	next;
	switch (select("�v���[���g�{�b�N�X����ł�������","���������ł�")) {
	case 1:
		if(countitem(644)<1 || countitem(7174)<1 || countitem(7175)<1) {
			mes "[�J�v���e�[�����O]";
			mes "���b�s���O�T�[�r�X�̂����p�ɂ́A";
			mes "���p�ӂ��Ă������������������܂��B";
			mes "���͑��̂��q�l�̕��Ƃ�";
			mes "�������܂��̂Ő\���󂠂�܂��񂪁A";
			mes "�K�v�ޗ��Ɋւ��Ă͎��̂��΂ɂ���";
			mes "�J�v���\�����ɂ��q�˂��������B";
			break;
		}
		mes "[�J�v���e�[�����O]";
		mes "���b�s���O�T�[�r�X��";
		mes "�����p���肪�Ƃ��������܂��B";
		mes "���q�l�̐S���`���悤";
		mes "�F���Ă���܂��B�ł́A";
		mes "�^�S�����߂Ă���݂��܂��傤�B";
		next;
		mes "[�J�v���e�[�����O]";
		mes "���҂������܂����B";
		mes "������ɂȂ�܂��B";
		mes "�����Q���ꂽ�ޗ��ł���݂��܂����B";
		mes "�����Ă��q�l�̂����O��";
		mes "�L�����܂����̂ŁA������";
		mes "���S���`���Ǝv���܂��B";
		delitem 644,1;
		delitem 7174,1;
		delitem 7175,1;
		set Zeny,Zeny-1000;
		if(BaseLevel<50)
			set .@itemid,664;
		if(BaseLevel>=50 && BaseLevel<70)
			set .@itemid,665;
		if(BaseLevel>=70 && BaseLevel<90)
			set .@itemid,666;
		if(BaseLevel>=90)
			set .@itemid,667;
		getitem2 .@itemid,1,1,0,0,254,0,getcharid(0)&0xffff,(getcharid(0)>>16)&0xffff;
		next;
		mes "[�J�v���e�[�����O]";
		mes "�܂�����������蕨���������܂�����";
		mes "���ł�����������Ă��������B";
		break;
	case 2:
		mes "[�J�v���e�[�����O]";
		mes "����݂��������蕨���������܂�����";
		mes "���ł�����������Ă��������B";
		break;
	}
	close2;
	cutin "kafra_02",255;
	end;
}

xmas_in,87,87,6	script	�J�v���\����	115,{
	cutin "kafra_03",2;
	mes "[�J�v���\����]";
	mes "����ɂ���";
	mes "�J�v���o���X�y�V�����T�[�r�X";
	mes "�u���b�s���O�T�[�r�X�I�v";
	mes "�����p�ɕK�v�ȍޗ������������܂��̂�";
	mes "�������蕷���ď������Ă��������B";
	next;
	mes "[�J�v���\����]";
	mes "�܂��A���q�l���������";
	mes "�v���[���g�{�b�N�X1�����K�v�ł��B";
	mes "��ޑ��蕨���̂��Ȃ���";
	mes "�����ł��܂��񂩂�ˁB";
	next;
	mes "[�J�v���\����]";
	mes "�����āA����{���ƕ����1����";
	mes "�K�v�ɂȂ�܂��B�ŏ��A������";
	mes "������p�ӂ��Ă����̂ł���";
	mes "�c�c�q�ɂɂ��܂��Ă������ޗ���";
	mes "���҂��ɓ��܂�Ă��܂����̂ł��B";
	next;
	mes "[�J�v���\����]";
	mes "�����I�������̏�ɂ�����c�c";
	mes "�������o�V�b�ƕ߂܂���";
	mes "�v�������艣����";
	mes "�R��΂��ē˂���΂��āc�c";
	next;
	mes "[�J�v���\����]";
	mes "�n�b�A���͈�̉����c�c�H";
	mes "���A���̂��q�l�A";
	mes "���̘b�͖Y��Ă��������ˁB���ق�B";
	mes "���ꂩ���萔���Ƃ���1000Zeny��";
	mes "�K�v�ł��B����͂��q�l�̂����O��";
	mes "�L�����邽�߂̔�p�ƂȂ�܂��B";
	next;
	mes "[�J�v���\����]";
	mes "����ł͕K�v�Ȃ��̂𐮗����܂��B";
	mes "^3131FF�v���[���g�{�b�N�X1��";
	mes "����{��1��";
	mes "���1��";
	mes "1000Zeny^000000";
	next;
	mes "[�J�v���\����]";
	mes "�ȏ�̍ޗ����S�đ����܂�����";
	mes "�e�[�����O�ɂ��\���t�����������B";
	mes "�J�v���T�[�r�X�̓N���X�}�X��";
	mes "���q�l�̂��΂ɂ��܂��B";
	close2;
	cutin "kafra_03",255;
	end;
}

xmas_in,112,86,4	script	�J�v���r�j�b�g	114,{
	cutin "kafra_04",2;
	mes "[�J�v���r�j�b�g]";
	mes "����ɂ��́A�J�v���T�[�r�X�ł��B";
	mes "���q�l�����ɁA����̎����̔閧��";
	mes "��������Ƃ��������Ⴂ�܂��B";
	mes "���������閧�ł��Ȃ���ł�";
	mes "���ǂˁc�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�����̃J�v���q�ɂ��P������";
	mes "�q���B�̌C���Ɍ����J����";
	mes "�v���[���g�𓐂����Ƃ��Ă���";
	mes "�̂́A���N�����ꂽ�A���\�j�Ƃ���";
	mes "�T���^���Ƃ����܂��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�l�X�́A�A���\�j���T���^�ɂȂ�";
	mes "���߂̌P�����h���ē����o����";
	mes "�񂾂Ǝv���Ă��܂����A";
	mes "���͂�������Ȃ���ł���B";
	mes "�����������b�ł́A�A���\�j��";
	mes "�c�����Ɍ���������Ƃ��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�N���X�}�X�ɂ́A�q���B�̓T���^�����";
	mes "�v���[���g�����炢�܂������A";
	mes "�A���\�j�̂��������";
	mes "�u�T���^�Ȃ�Ă��Ȃ��v";
	mes "�ƌ����Ă��ăv���[���g��";
	mes "�����Ȃ������݂����Ȃ�ł��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "����ŁA���N���̎����ɂȂ��";
	mes "�K�������Ȏq�����ƂĂ���������";
	mes "�݂����Ȃ�ł���B";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�V�B�[�b�I";
	mes "���̐l�ɕ����ꂿ�Ⴄ����";
	mes "����܂��񂩂�c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "���́A�A���\�j�̂��������";
	mes "�����̂��߂̂����Ő�����";
	mes "���F�̔��𔃂��Ă��Ă�";
	mes "�����őS���J��������Ă�";
	mes "�炵����ł��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "���̂܂ܕs�K�ȗc��������߂�����";
	mes "�A���\�j������āA�K�������Ȑl��";
	mes "���ނ悤�ɂȂ����������ł��B";
	mes "�A���\�j�̂�������͂���ł�";
	mes "�����⎇�F�̔��̖��͂�";
	mes "���߂��ꂽ�܂܂������݂����ł����B";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�����āA�A���\�j�͍��A";
	mes "���e�B�G�ŉ��������ł���";
	mes "�݂����Ȃ�ł��B";
	mes "���������������悤�Ƃ��Ă����";
	mes "������c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "������낵����΁A�T���^�̂ڂ�����";
	mes "���Ԃ��������X�^�[�B��ގ�����";
	mes "����܂��񂩁H";
	mes "���B�̑q�ɂ��P�����̂������炭";
	mes "�A���\�j�̈ꖡ�ł��傤����c�c";
	close2;
	cutin "kafra_04",255;
	end;
}

xmas_in,97,99,4	script	�J�v���O�����X	113,{
	cutin "kafra_05",2;
	callfunc "KafraMain",1,0x102,0,0,0,0,0,0,100,0;
	end;
}

xmas_in,87,102,0	script	�J�v���v	112,{
	cutin "kafra_06",2;
	if(countitem(2636) || countitem(2637)) {
		mes "[�J�v���v]";
		mes "�d�����I�������J���܂��ˁ[�B";
		mes "���肪�Ƃ��I";
		mes "�����[�N���X�}�X�[�I";
		close2;
		cutin "kafra_06",255;
		end;
	}
	mes "[�J�v���v]";
	mes "����ɂ��͂��[�B";
	mes "�J�v���T�[�r�X�̂����p";
	mes "���肪�Ƃ��������܂��B";
	mes "�����[�N���X�}�X�[�I";
	next;
	mes "[�J�v���v]";
	mes "���̓e�[�����O�o������";
	mes "���Ƃ̂���`�������Ă��܂��[�B";
	mes "���̂��d���͕���ꂽ���ɖ��O��";
	mes "�������Ƃł��B����̏�ɏ����̂�";
	mes "�v���[���g���J������A�Ӗ���";
	mes "�Ȃ��Ȃ����Ⴂ�܂����ǂˁB";
	next;
	mes "[�J�v���v]";
	mes "�{���͊y�����N���X�}�X�c�c";
	mes "�̂͂��Ȃ̂ɑq�ɂ̕���";
	mes "�����l�����ɓ��܂ꂿ��������";
	mes "�������݋C���Ȃ�ł��[�B";
	mes "����`��c�c���d�������邩��";
	mes "���C���o���Ȃ��Ⴂ���Ȃ��̂Ɂc�c";
	next;
	switch (select("�v���[���g�ɖ��O�������Ă�������","�w�ւɖ��O�������Ă�������","���C���o���Ă��������I")) {
	case 1:
		mes "[�J�v���v]";
		mes "�v���[���g�ɖ��O�������ė~�����Ȃ�";
		mes "�������ɂ���e�[�����O�o������";
		mes "��𗊂�ł��������B";
		mes "���͕���ɖ��O�������Ă������";
		mes "����������Ȃ��ł����[�B";
		close2;
		cutin "kafra_06",255;
		end;
	case 2:
		emotion 28;
		mes "[�J�v���v]";
		mes "�w�ւł����`�H����ȕ���";
		mes "���O�����ރT�[�r�X�͂��Ă܂���B";
		mes "�����łȂ��Ă��A����ɖ��O��";
		mes "�����Ă΂��肢�邩��肪�ɂ��ł��[�B";
		mes "�V�N�V�N�c�c";
		mes "�݂�ȍK�������ł����ȁB";
		close2;
		cutin "kafra_06",255;
		end;
	}
	//case3��fall through
	mes "[�J�v���v]";
	mes "�����A�C���������ł����肪�Ƃ��B";
	mes "�ł����C���o�Ȃ���ł��c�c";
	mes "���e�B�G�ɏo�����Ă��Ƃ�";
	mes "�ƂĂ��y���݂ɂ��Ă���ł����ǂˁB";
	mes "�T���^�̂ڂ����������";
	mes "�C�������ނ�ł��[�B";
	next;
	if(select("�������C�ɂ��Ă����܂�","�撣���Ă��������I")==2) {
		mes "[�J�v���v]";
		mes "�Ђ����A�Ђ����c�c";
		mes "�b�����ł������Ă���Ă��肪�Ƃ��B";
		mes "�����[�N���X�}�X�[�I";
		close2;
		cutin "kafra_06",255;
		end;
	}
	emotion 28;
	mes "[�J�v���v]";
	mes "�{���ł����[�H";
	mes "�V�N�V�N�c�c";
	mes "�ǂ�Ȃ��Ƃ����Ă�����ł����H";
	mes "�V�N�V�N�c�c";
	next;
	switch (select("�v���[���g�{�b�N�X�������܂�","�T���^�̂ڂ����������܂�","�L���������̂��Ă����܂�","�����ȃ_���X��x���Ă����܂�")) {
	case 1:
		//�ǂ̎�ނ�PBox�������ĂȂ��A�������͋��E�₢����̎w�ւ������ĂȂ��Ȃ�true
		if((countitem(664)<1 && countitem(665)<1 && countitem(666)<1 && countitem(667)<1) ||
									(countitem(2610)<1 && countitem(2611)<1)) {
			mes "[�J�v���v]";
			mes "�m��Ȃ��l���畨����������";
			mes "�킯�ɂ͂����Ȃ��ł��[�B";
			mes "���o���񂽂��ɓ{���Ă��܂��܂��B";
			mes "���v�ł�����A";
			mes "�C���g��Ȃ��ł��������B";
			break;
		}
		emotion 28;
		mes "[�J�v���v]";
		mes "�V�N�V�N�c�c";
		mes "���ꂢ�ɕ�܂ł��Ă���";
		mes "�厖�ȃv���[���g������";
		mes "������Ă�������ł����H";
		next;
		if(select("�����[�N���X�}�X�I","����ς肠���܂���")==2) {
			emotion 28;
			mes "[�J�v���v]";
			mes "�����`��c�c";
			break;
		}
		emotion 15;
		mes "[�J�v���v]";
		mes "�킠�`�A���肪�Ƃ��[�I";
		mes "���[�������������ł��[�B";
		mes "����Ȃɑ厖�ȕ�����������������ɂ�";
		mes "����������������Ȃ���";
		mes "�����Ȃ��ł��ˁB";
		next;
		mes "[�J�v���v]";
		mes "���A�w�ւ������Ă����ł����B";
		mes "���Ⴀ�A���̎w�ւɖ��O��";
		mes "�����Ă����܂��B";
		mes "���ւցc�c";
		mes "�����Ȃ񂩂���Ȃ��ł���[�B";
		next;
		mes "[�J�v���v]";
		mes "���A���̎w�ւ������Ă���ꍇ��";
		mes "���̎w�ւɏ������Ⴂ�܂��B";
		mes "�����A���̎w�ւƋ�̎w�ւ�";
		mes "�����Ă��āA��̎w�ւ̕���";
		mes "���O�������Ăق���������";
		next;
		mes "[�J�v���v]";
		mes "���̎w�ւ͂ǂ����ɂ�������";
		mes "���Ă��������ˁB";
		next;
		switch (select("���̎w�ւɏ�����","��̎w�ւɏ�����","������Ƃ܂��Ă�")) {
			case 1:
				set .@itemid,2610;
				set .@gain,2636;
				break;
			case 2:
				set .@itemid,2611;
				set .@gain,2637;
				break;
			case 3:
				mes "[�J�v���v]";
				mes "�͂��A���҂����Ă܁[���B";
				close2;
				cutin "kafra_06",255;
				end;
		}
		if(countitem(.@itemid)<1) {
			mes "[�J�v���v]";
			mes "����H" +getitemname(.@itemid)+ "�A�����Ă��Ȃ�";
			mes "�݂����ł����ǁ[�B";
			break;
		}
		if(.@itemid==2611 && countitem(2610)) {
			mes "[�J�v���v]";
			mes "������Ƒ҂��Ă��������B";
			mes "���̎w�ւ������Ă�݂����ł���B";
			mes "���̎w�ւ͂������Ă��Ă���������";
			break;
		}
		mes "[�J�v���v]";
		mes "�͂��A���Ꮡ�����Ⴂ�܂��B";
		mes "�J�L�J�L�J�L�J�L�c�c";
		next;
		mes "[�J�v���v]";
		mes "�͂��A�ǂ����B";
		mes "�v���[���g�A�{���ɂ��肪�Ƃ��I";
		mes "�����[�N���X�}�X�[�I";
		delitem .@itemid,1;
		if(countitem(664))
			delitem 664,1;
		else if(countitem(665))
			delitem 665,1;
		else if(countitem(666))
			delitem 666,1;
		else
			delitem 667,1;
		getitem2 .@gain,1,1,0,0,254,0,getcharid(0)&0xffff,(getcharid(0)>>16)&0xffff;
		break;
	case 2:
		emotion 6;
		mes "[�J�v���v]";
		mes "�c�c�������ł�!!";
		break;
	case 3:
		mes "[�J�v���v]";
		mes "�c�c�{���͉̂����Ƃ�";
		mes "���ӂ���Ȃ���ł���H";
		mes "�����ł���A�������Ȃ��āI";
		break;
	case 4:
		emotion 9;
		mes "[�J�v���v]";
		mes "�c�c�c";
		next;
		emotion 9;
		mes "^FF0000�s���R�s���R�s���R�A�L���b�L���b";
		mes "�^�^�b�^�^�^�b�^�A�p���p���p���I^000000";
		next;
		mes "[�J�v���v]";
		mes "�����A�V�N�V�N�c�c";
		next;
		emotion 28;
		mes "[�J�v���v]";
		mes "�V�N�V�N�V�N�V�N�c�c";
		break;

	}
	close2;
	cutin "kafra_06",255;
	end;
}

//==============================================================
// �Z���̃N���X�}�X
//
//   �� XMAS_1QUE -> 0�`11�A�N�G�X�g�I�����ɂ�0�ɖ߂�
//==============================================================
xmas,137,233,3	script	�^�X�e�B	793,{
	switch(XMAS_1QUE) {
	case 0:
		mes "[�^�X�e�B]";
		mes "�S�z���A�S�z���c�c";
		mes "�}�b�`�A�}�b�`�͂���܂��񂩁`�H";
		mes "�`�F�y�b�g����D���c�c����A";
		mes "�����ƁA�`�F�y�b�g��";
		mes "���Ƃ����}�b�`�ł��`�B";
		mes "�c�c�S�z���S�z���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�킟�`�A�������Ȏq�B";
		mes "�ł��c�c����ȂɊ������A";
		mes "��������Ȃ�đ�ς������ȁc�c�B";
		mes "��{�ʔ����Ă��������������̂��ȁH";
		next;
		emotion 23,"";
		mes "-�����́A�����Ȃ肠�Ȃ��̎���";
		mes "���݁A�����̕��ֈ����񂹂�-";
		mes "-�����āA�Ⴂ����";
		mes "�����ł����₢��-";
		next;
		mes "[�^�X�e�B]";
		mes "�Â��ɁI�@��`�������Ȃ����B";
		mes "�������A�����̉Ƃ̒��ɂ���";
		mes "^3131FF���b�Z^000000�Ƃ����l�������Ȃ���!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��?!";
		mes "�ȁA���ł���Ȃ��Ƃ��c�c�B";
		next;
		emotion 29;
		mes "[�^�X�e�B]";
		mes "�J�v���q�ɂ�R�₳�ꂽ���Ȃ�������A";
		mes "���ƂȂ�����������";
		mes "�������������Ȃ���!!";
		next;
		mes "-�����́A�����Ă����}�b�`��";
		mes "�΂����A�N�X�N�X�Ə΂���-";
		mes "-�c�c�ǂ����A�{�C�̂悤���B";
		mes "�����ʂ�ɂ��������ǂ�������-";
		set XMAS_1QUE,1;
		close;
	default:	//1�`10�̂Ƃ�
		emotion 29;
		mes "[�^�X�e�B]";
		mes "���̉Ƃ̒��ɂ���";
		mes "^3131FF���b�Z^000000����`���Ă����āI";
		mes "�����ʂ�ɂ�������������B";
		mes "�������Ȃ��ƌ�Łc�c";
		mes "�t�t�t�t�c�c�B";
		next;
		mes "-�₽���A�T�ɔ��΂ޏ����̓���";
		mes "�Ԃ��h���}�b�`�̖��肪�f����-";
		close;
	case 11:
		mes "[�^�X�e�B]";
		mes "�c�c���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A���܂ꂽ���͑S���������I";
		mes "�������A�N����点�����Ă��Ƃ�";
		mes "�����ĂȂ��B����������A";
		mes "�J�v���q�ɂ�R�₷�Ƃ����b��";
		mes "�Ȃ�����ˁH";
		next;
		mes "[�^�X�e�B]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c���A���肪�Ƃ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ȏ�́A�����������͂����Ȃ���B";
		mes "�����ˁc�c�H";
		mes "�c�c��A�ǂ������H";
		next;
		mes "-�����͂��΂炭���ނ��Ă������A";
		mes "�����Ă����}�b�`���A�t�b�Ɛ�����";
		mes "�΂�������-";
		next;
		mes "[�^�X�e�B]";
		mes "�c�c�ӂ��`�B";
		mes "���肪�Ƃ��A�`���җl�B";
		mes "�������l�ł��Z�����";
		mes "���C�ɂȂ�܂����B";
		next;
		mes "[�^�X�e�B]";
		mes "�c�c�������̗��e�́A��������";
		mes "���������ɂ��Ȃ��Ȃ�܂����B";
		mes "���ꂩ�疈�N�A�N���X�}�X��";
		mes "���Z����񂪃v���[���g������܂����B";
		next;
		mes "[�^�X�e�B]";
		mes "�ł����N�́A���Z�����";
		mes "���ׂ��Ђ��Ă��܂��āA";
		mes "�o�C�g����ł��Ȃ��āc�c�B";
		mes "���Z�����A�������Ƀv���[���g��";
		mes "�������Ȃ��A���܂Ȃ�����";
		mes "��������������ł�����ł��B";
		next;
		mes "[�^�X�e�B]";
		mes "�����ŁA�������A�l���܂����B";
		mes "����Ȃ��Z�����ɁA";
		mes "����������������v���[���g�c�c�B";
		mes "�����^0000FF�N���X�}�X��";
		mes "���Ƀv���[���g��������";
		mes "���Z����񎩐g^000000�B";
		next;
		mes "[�^�X�e�B]";
		mes "������A�����ɂ��肢�����́B";
		mes "�������̂��肢�A�����Ă����";
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A����c�c���͂́B";
		mes "�i�c�c���݂ł͂Ȃ��A";
		mes "�����������ł��傤���I�j";
		next;
		mes "[�^�X�e�B]";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "�`���җl�̋�J�ɔ�ׂ��";
		mes "�債�����̂���Ȃ����ǁc�c";
		mes "���ꂠ���܂��B";
		next;
		emotion 18;
		mes "[�^�X�e�B]";
		mes "���́A����͈ȑO�A";
		mes "^3131FF���C�[�[^000000�Ƃ����f�U�C�i�[����";
		mes "����c�c����A��������T���^���ł��B";
		mes "�C�ɓ����Ă��ꂽ��������ł��B";
		next;
		emotion 18,"";
		mes "["+strcharinfo(0)+"]";
		mes "���c�c���A�����A�ǂ����`�B";
		next;
		sc_start3 SC_BLIND,0,0,0,0,10000,10;
		mes "-���Ȃ��́A��������^���Ԃȑ܂�";
		mes "�󂯎��A������ƊJ���Ă݂�-";
		mes "-���̏u�ԁA�L�����ƌ��鐯�������A";
		mes "�㓪���ɓ݂��ɂ݂������c�c";
		mes "�ڂ̑O���^���ÂɂȂ���-";
		next;
		mes "[�^�X�e�B]";
		mes "�{���ɂ��肪�Ƃ��A�`���җl�B";
		mes "�����Ď����܂��A���肢���܂��ˁB";
		mes "�N�X�N�X�c�c�B";
		next;
		mes "-���Ȃ����C���������O�A������";
		mes "�������Ԃ₫�Ȃ���A�}�b�`��";
		mes "�΂����Ėڂ̑O�Ńu���ƐU��A";
		mes "�����Ȑ��ł����₭�̂���������-";
		mes "-�����Ă��Ȃ��́A���̒����܂��܂�";
		mes "�^�����ɂȂ�A�C��������-";
		getitem 12132,1;
		set XMAS_1QUE,0;
		close;
	}
}

xmas_in,109,109,3	script	���b�Z	887,{
	switch(XMAS_1QUE) {
	case 0:
		mes "[���b�Z]";
		mes "�c�c�������c�c";
		mes "�o�C�g���Ȃ��Ⴂ���Ȃ��̂Ɂc�c";
		mes "�Q�z�Q�z�c�c�B";
		mes "���N���^�X�e�B�ɃN���X�}�X";
		mes "�v���[���g�����������̂Ɂc�c";
		mes "�w�`�b�N�V�����I�@�Q�z�Q�z�z�c�c�B";
		close;
	case 1:
		mes "[���b�Z]";
		mes "�c�c�������c�c�Q�z�Q�z�B";
		mes "�o�C�g���Ȃ��Ⴂ���Ȃ��̂Ɂc�c�B";
		mes "���N���^�X�e�B�ɃN���X�}�X";
		mes "�v���[���g�����������̂Ɂc�c�B";
		mes "���ɂ���Ă���Ȏ���";
		mes "���ׂ��Ђ��Ȃ�āc�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��`���Ă����܂�!!";
		next;
		mes "[���b�Z]";
		mes "�����H�@���A�N�H";
		mes "�ǂ����Ă����Ɂc�c�H";
		next;
		emotion 28,"";
		mes "["+strcharinfo(0)+"]";
		mes "�������Ȃ��Ⴂ���Ȃ�����";
		mes "�����Ă�������!!�@�o�C�g!?";
		mes "�ǂ��ŁA��������΂�����ł����H";
		mes "�i�������Ȃ��ƁA�J�v���q�ɂ�";
		mes "�R�₳��Ă��܂�!!�j";
		next;
		mes "[���b�Z]";
		mes "�q�B�c�c���A���c�c�o�A�o�C�g�H";
		mes "�����A�d�z�B�o�C�g�c�c";
		mes "�c���[�̑O�ɂ���";
		mes "^3131FF���C���f�B�A^000000���񂪁A";
		mes "�N���X�}�X�Ɏg����d���c�c";
		mes "���c�c�Q�z�c�c�w�A�w�`�b�N�V�����I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c���[�̑O�ɂ���";
		mes "^3131FF���C���f�B�A^000000����ł���!?";
		mes "����ł͂��厖�ɁI";
		mes "���͂����!!";
		next;
		mes "[���b�Z]";
		mes "���A�������H";
		mes "���A������Ɓc�c�Q�z�c�c";
		mes "���Ȃ��́A��́H";
		mes "���҂Ȃ�ł��c�c?!";
		next;
		mes "-�w�ォ�牽�����Ԑ��������������A";
		mes "����Ȃ͖̂������āA";
		mes "�X�̒����c���[�֋}�����B";
		mes "�J�v���q�ɂ̉^���́A";
		mes "���̎�̒��ɂ����!!-";
		set XMAS_1QUE,2;
		close;
	default:	//2�`8�̂Ƃ�
		mes "[���b�Z]";
		mes "�Y���Y���c�c��!!�@���Ȃ���??";
		mes "^3131FF���C���f�B�A^000000����́c�c";
		mes "�w�b�N�V�����c�c�o�C�g�́c�c";
		mes "�ǂ�������ł���?!";
		mes "�Q�z�Q�z�Q�z�c�c";
		mes "��̂ǂ��������Ƃł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���c�c���ꂪ���́c�c�B";
		next;
		mes "[�H�H�H�H]";
		mes "�ւ��`�A�S�z���S�z���B";
		mes "�i�V���b�V���b�V���c�c�{�E�b�I�j";
		next;
		mes "-�O����A�����ȋ�P�ƂƂ��ɁA";
		mes "�΂�����悤�Ȗ��C������������-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�����Ȃ��Ă��Ƃ��c�c�j";
		mes "�ł́A���͖Z�����̂ł����!!";
		next;
		mes "[���b�Z]";
		mes "�������I";
		mes "����A������Ɓc�c�Y���Y���B";
		mes "��̂��Ȃ��͉��҂Ȃ�ł���?!";
		next;
		mes "-�w�ォ�牽�����Ԑ��������������A";
		mes "����Ȃ͖̂������āA";
		mes "�X�̒����c���[�֋}�����B";
		mes "�J�v���q�ɂ̉^���́A";
		mes "���̎�̒��ɂ����!!-";
		close;
	case 9:
		mes "[���b�Z]";
		mes "����?!�@����??";
		mes "�܂������Ȃ������̃o�C�g���c�c�H";
		mes "����肵����ł���?!";
		mes "�����Ȃ�ł���?!";
		mes "�����A���ɂ͗{���Ă��閅��";
		mes "����̂Ɂc�c���Łc�c�������c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A����!!�@�����ł͂Ȃ��c�c";
		mes "���̃o�C�g�̂���`�����悤�Ɓc�c";
		mes "�ʂɑ��ӂ͂���܂���!!";
		mes "�ق�A�o�C�g�ゾ����";
		mes "������Ǝ����Ă��܂�����I";
		next;
		if(countitem(644)<1 || countitem(7174)<1 || countitem(7175)<1) {
			mes "[���b�Z]";
			mes "�ǂ��ɂ����ł��H";
			mes "�w�b�N�V�����c�c";
			mes "�������܂��C�ł����H";
			mes "�˂��˂��˂�!?";
			next;
			emotion 4,"";
			mes "["+strcharinfo(0)+"]";
			mes "���A���܂��H";
			mes "����A����Ȃ���́c�c�B";
			mes "�i�c�c����A�ǂ��ɂ���������H";
			mes "���������ȁc�c�j";
			next;
			mes "-�O���炷���܂����E�C��";
			mes "�S�g�Ŋ�����-";
			close;
		}
		mes "-���Ȃ��́A���̂�����������";
		mes "�܂������Ă�ނ̖ڂ̑O��";
		mes "�o�C�g���˂��o����-";
		mes "-��u�A�ނ̖ڂ��ۂ��Ȃ���-";
		next;
		mes "[���b�Z]";
		mes "����A�ł�����?!�@�S�z���S�z���B";
		mes "�ǂ����Ď�`���Ă����̂ł����H";
		mes "�����m�炸�̎����c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂��āA����́c�c���͂́c�c�B";
		next;
		mes "-���Ȃ��͉��ڂő��̕�������-";
		mes "-�����ȑ��̊O�ł����Ɨh���";
		mes "�}�b�`�̉΂��������C������-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A����͂ˁc�c";
		mes "�����A�����A���[��A�������Ɓc�c";
		mes "�i�����A�K���ɂ��܂������I�j";
		mes "�������A����!!";
		next;
		input .@word$;
		emotion 23;
		emotion 23,"";
		mes "["+strcharinfo(0)+"]";
		mes "���A����͂ˁc�c";
		mes "�����A�����A���[��A�������Ɓc�c";
		mes "�i�����A�K���ɂ��܂������I�j";
		mes "�������A����!!";
		mes "^3131FF" +.@word$+ "^000000������Ȃ�ł��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���A���A����b��������?!�j";
		mes "�c�c���A�����A����������ł��B";
		mes "����Łc�c�B";
		next;
		emotion 5;
		mes "[���b�Z]";
		mes "�c�c�����Ȃ�ł����A�Ȃ�قǁc�c";
		mes "���Ȃ���^3131FF" +.@word$+ "^000000������";
		mes "���ł�����ŗǂ��̂ł��ˁH";
		mes "�Ӂ`��c�c�n�n�n�c�c�B";
		mes "�i�Ȃ�΁c�c�j";
		next;
		emotion 4,"";
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c���A�ȁA���ł���Ȏ���";
		mes "�Ȃ��Ă��܂����̂��c�c�j";
		mes "���A���͂́c�c�����ł��A�����ł���B";
		mes "�ł��A���ƈ�񂾂��ł���A���ݎ��́B";
		mes "�i�c�c�f��Ȃ���������Ȃ��I�j";
		next;
		mes "[���b�Z]";
		mes "�����A�{���ɁA�S�z���A";
		mes "^3131FF" +.@word$+ "^000000�Ȃ�ł��ˁI";
		mes "�ł͂����t�ɊÂ��āA�w�b�N�V�����I";
		mes "���Ă̒ʂ�A���̑̂͂���ȏ�ԂȂ̂�";
		mes "�c�c�i�ӂ��j";
		next;
		mes "[���b�Z]";
		mes "���̑���ɉ����l�`��";
		mes "��ɓ���Ă��Ă��������B";
		mes "�Y���Y���c�c���ɉ����A";
		mes "�N���X�}�X�v���[���g��";
		mes "���������̂ł��B";
		next;
		mes "[���b�Z]";
		mes "���̃v���[���g�{�b�N�X�Ɍ�����";
		mes "�l�`�����肢���܂���B";
		mes "�w�A�w�b�N�V�����I";
		mes "�i�ӂ��j�Q�z�Q�z�Q�z�c�c";
		mes "�w�F�`�b�N�b�V�����I�I";
		next;
		mes "-�ނ͂�����ɕ@���ӂ��Ȃ���A";
		mes "������݂ƊP���䖝���A";
		mes "���낤���Ă���������-";
		mes "-�����ăx�b�h�ɉ��ɂȂ���-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����Ȃ�������܂���I";
		mes "�C���Ă��������B";
		mes "�ł́A�������x��ł��Ă��������ˁB";
		mes "���A����͒u���Ă����܂��B";
		delitem 7175,1;
		delitem 7174,1;
		delitem 644,1;
		set XMAS_1QUE,10;
		close;
	case 10:
		mes "[���b�Z]";
		mes "�Y���Y���Y���c�c";
		mes "���A��������Ⴂ�܂����ˁB";
		mes "�ǂ�Ȑl�`�������ė��܂������H";
		next;
		switch (select("�|�����l�`","�`�����`�����l�`","�ʂ������","�݂艺����ꂽ�l�`","�X�|�A�l�`","�^�k�L�l�`",
					"�T���l�`","�o�b�^�l�`","���L�̐l�`","���i�b�N�l�`","�I�V���X�l�`","�o�t�H���b�g�l�`")) {
			case 1:	set .@itemid,741; break;
			case 2:	set .@itemid,742; break;
			case 3:	set .@itemid,740; break;
			case 4:	set .@itemid,7212; break;
			case 5:	set .@itemid,743; break;
			case 6:	set .@itemid,754; break;
			case 7:	set .@itemid,753; break;
			case 8:	set .@itemid,752; break;
			case 9:	set .@itemid,7206; break;
			case 10: set .@itemid,7277; break;
			case 11: set .@itemid,751; break;
			case 12: set .@itemid,750; break;
		}
		if(countitem(.@itemid)<1) {
			emotion 1;
			mes "[���b�Z]";
			mes "���H�@���ł����H";
			mes "�c�c�w�b�N�V�����I";
			mes "�������炩���C�ł����H";
			close;
		}
		mes "[���b�Z]";
		mes "���A���킢��" +getitemname(.@itemid)+ "�ł��ˁB";
		mes "����́c�c�w�b�N�b�V�����I";
		mes "�����Ɩ�����ԂƎv���܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		next;
		mes "-�ނ�" +getitemname(.@itemid)+ "���󂯎��A";
		mes "�T�ɂ������v���[���g�{�b�N�X�ɓ���A";
		mes "����Ȃ�����ŕ����-";
		mes "-�����āA����ꂽ�v���[���g��";
		mes "���S�[���Ɍ��߂���A�ǂɂ�������";
		mes "�C���ɂ�������Ɠ��ꂽ-";
		next;
		mes "[���b�Z]";
		mes "�w�`�b�N�V�����c�c�i�ӂ��j";
		mes "����c�c�B���߂Ċ��ӂ��܂��B";
		mes "���N�������Ȃ��A�Ȃ��ƌ�����";
		mes "�債�ČZ�̖�ڂ��ʂ�����";
		mes "���܂���ł������c�c�Q�z�c�c";
		mes "�������l�ŏ����̖͑ʂ��ۂĂ����ł��B";
		next;
		switch(.@itemid) {
			case 741:	//�|�����l�`
			case 742:	//�`�����`�����l�`
			case 740:	//�ʂ������
			case 7212:	//�݂艺����ꂽ�l�`
				getitem 12130,3;
				getitem 522,1;
				break;
			case 743:	//�X�|�A�l�`
			case 754:	//�^�k�L�l�`
			case 753:	//�T���l�`
			case 752:	//�o�b�^�l�`
				getitem 12130,3;
				getitem 522,1;
				getitem 548,3;
				break;
			case 7206:	//���L�̐l�`
			case 7277:	//���i�b�N�l�`
				getitem 12130,5;
				getitem 12122,3;
				getitem 12123,3;
				getitem 12124,3;
				break;
			case 751:	//�I�V���X�l�`
			case 750:	//�o�t�H���b�g�l�`
				getitem 12130,5;
				getitem 12122,5;
				getitem 12123,5;
				getitem 12124,5;
				getitem 607,1;
				break;
		}
		delitem .@itemid,1;
		set XMAS_1QUE,11;
		mes "[���b�Z]";
		mes "�����Ă���́c�c";
		mes "�債�����̂ł͂���܂��񂪁c�c";
		mes "�w�b�N�V�����c�c���ӂ̋C�����ł��B";
		close;
	case 11:
		mes "[���b�Z]";
		mes "�c�c�ӂ��A�i�ӂ��j";
		mes "�Y���Y���Y���c�c";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		mes "���ɗ^���Ă����������K���Ŋy����";
		mes "�N���X�}�X���A���Ȃ����g��";
		mes "�}������悤���F�肵�܂��B";
		close;
	}
}

xmas,138,140,0	script	���C���f�B�A	873,{
	switch(XMAS_1QUE) {
	case 0:
	case 10:
	case 11:
		mes "[���C���f�B�A]";
		mes "����I";
		mes "�N���g�i�J�C������?!";
		mes "���̓\���Ȃ񂩈�����!!";
		next;
		emotion 6;
		mes "[���C���f�B�A]";
		mes "�������A�����͂ǂ�����";
		mes "���Ȃ���!!";
		mes "�N���X�}�X�̖�ɂ����K�v�Ȑd��";
		mes "����Ȃ��Ȃ����狻���߂���Ȃ����I";
		mes "^3131FF���b�Z^000000�߁A�������Ɨ����I";
		close;
	case 1:
	case 2:
		emotion 6;
		mes "[���C���f�B�A]";
		mes "�������A�ǂ����ė��Ȃ���!!";
		mes "���̃N���X�}�X�̎������A";
		mes "��ԖZ�������Ă̂�!!";
		mes "��Ԑd���K�v�Ȃ��̎�����";
		mes "�����͉�����Ă�񂾁I";
		mes "^3131FF���b�Z^000000�߁A�o���Ă�I";
		if(XMAS_1QUE == 1)
			close;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���b�Z����̑���ɗ��܂���!!";
		mes "��������΂悢�ł����H";
		next;
		mes "[���C���f�B�A]";
		mes "�c�c�N�͉����H";
		mes "�d���͊��Ƀ��b�Z�����邱�ƂɁc�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���b�Z����́A���A���ׂ��Ђ��Ă���";
		mes "�x�b�h����N���オ�邱�Ƃ�";
		mes "�ł��Ȃ���ł��B";
		mes "�ł�����A���Ɏd����C��";
		mes "�×{���Ȃ�ł��B";
		mes "�������Ɏd���������Ă�������!!";
		next;
		mes "[���C���f�B�A]";
		mes "�c�c���O�A�M���ǂ��ڂ����Ă����!!";
		mes "�悵�A�C�ɓ�����!!";
		mes "���̔M�ӂŁA�N���X�}�X�p�̐d��";
		mes "�z�B���ė���!!";
		next;
		mes "[���C���f�B�A]";
		mes "���̑O��!!";
		mes "�c�c���R�A�d�͎����Ă��ȁH";
		next;
		emotion 23,"";
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�͂��H";
		mes "���c�c�H";
		mes "�����ɗp�ӂ��ė��܂�!!";
		next;
		emotion 27;
		mes "[���C���f�B�A]";
		mes "�悵�I�@���̐����ŁA";
		mes "^0000FF�؋�20��^000000�������Ɏ����ė����I";
		mes "5�b��낤!!�@���A�����s���I";
		set XMAS_1QUE,3;
		close;
	case 3:
		if(countitem(1019)<20) {
			mes "[���C���f�B�A]";
			mes "���������čs��!!";
			mes "^0000FF�؋�20��^000000��!!";
			mes "�l�X�̃N���X�}�X�̉^����";
			mes "���O�̑��ɂ������Ă��邱�Ƃ�";
			mes "�̂ɖ�����!!";
			close;
		}
		mes "[���C���f�B�A]";
		mes "����!!�@���������̂��H";
		mes "�{���ɂ悭�����ȁA���O!!";
		mes "�Ȃ�A���̂��߂ɂ����Ɠ����āc�c";
		mes "�S�z���A�E���B";
		mes "�����A��𒷂����Đd��҂��Ă���";
		mes "�l�X�̂��߂�!!�s���ė���!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������܂���!!";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c���́A";
		mes "�ǂ��֍s���΂�����ł����H";
		next;
		viewpoint 1,168,160,1,0xCE6300;
		viewpoint 1,113,273,2,0xCE6300;
		viewpoint 1,119,155,3,0xCE6300;
		viewpoint 1,157,126,4,0xCE6300;
		mes "[���C���f�B�A]";
		mes "�񂠁H�@�C��������悤��";
		mes "���Ƃ������ȁI";
		mes "���������Ȃ��ᕪ�����̂��I";
		mes "�}�b�v������I�@�}�b�v��!!";
		mes "�������֔����v������!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c";
		mes "�i����Ȃ̕����Ȃ���";
		mes "������Ȃ����āc�c�j";
		mes "�Ƃɂ����s���Ă��܂��B";
		next;
		mes "[���C���f�B�A]";
		mes "�C���ƍ������I";
		mes "�����̑��ő����čs��!!";
		mes "�����A�y���悤�Ƃ���";
		mes "��𔲂��񂶂�Ȃ����I";
		mes "�������A�e���|�[�g�͎g���ȁI";
		next;
		mes "[���C���f�B�A]";
		mes "�������ɔ����v������!!";
		mes "������?!";
		mes "��Ŕz�B�悪�ǂ��Ȃ̂������ɗ��Ă�";
		mes "�����Ă��Ȃ�����ȁI";
		set XMAS_1QUE,4;
		close;
	default:	//4�`7
		mes "[���C���f�B�A]";
		mes "���������čs���I";
		mes "���N�̃N���X�}�X�̉^����";
		mes "�F�A���O�̑��ɂ������Ă���!!";
		mes "�F�Ƀn�b�s�[�N���X�}�X��!!";
		close;
	case 8:
		mes "[���C���f�B�A]";
		mes "�ق��`�A�����z�B���Ă����悤���ȁB";
		mes "�����ɓ͂����ƘA�������Ă�����B";
		mes "�{���ɂ���J�l!!";
		next;
		mes "[���C���f�B�A]";
		mes "���I�@����̓��b�Z�ɖ񑩂���";
		mes "�A���o�C�g�ゾ�B";
		mes "�債�����̂ł͂Ȃ����c�c";
		mes "�ق�A�������莝�āB";
		mes "���ׂȂ񂩑���������";
		mes "�܂����ƈꏏ�ɓ������Ɠ`���Ă���B";
		next;
		getitem 7175,1;
		getitem 7174,1;
		getitem 644,1;
		set XMAS_1QUE,9;
		//fall through
	case 9:
		emotion 18;
		mes "[���C���f�B�A]";
		mes "�ق�A�o�C�g��͕K��";
		mes "���b�Z�ɓn����I";
		mes "�܁A����̓T���^�̑����";
		mes "���O���ނ�K�˂�񂾂ȁB";
		mes "�n�b�n�n�n�c�c�����[�N���X�}�X�`�B";
		close;
	}
}

xmas,168,160,4	script	�t�F���Y	46,{
	if(XMAS_1QUE >= 5) {
		mes "[�t�F���Y]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "����Œg�����N���X�}�X��";
		mes "���邱�Ƃ��ł��܂��B";
		mes "���Ȃ����K���ȃN���X�}�X�ɂȂ�悤";
		mes "�F���Ă��܂��B";
		close;
	}
	if(XMAS_1QUE == 4 && countitem(1019)>=5) {
		mes "[�t�F���Y]";
		mes "�����A�����A���܂������܂���!!";
		mes "����Ɨ��܂����ˁB";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���N�͐d�Ȃ��ŃN���X�}�X��";
		mes "�߂������ƂɂȂ�̂���";
		mes "�S�z���Ă��܂����B";
		next;
		mes "[�t�F���Y]";
		mes "����Őd�̗p�ӂ͐����܂����ˁB";
		mes "�N���X�}�X�C�u�̗[������";
		mes "���̗����̒��܂ŁA";
		mes "�d��₦���R�₵������΁A";
		mes "���̉Ƃɂ͈�N���K�^��";
		mes "���������ƌ����Ă��܂��B";
		next;
		emotion 23,"";
		mes "[�t�F���Y]";
		mes "����H�@�����ł����H";
		mes "����ȑ厖�Ȃ��Ƃ���m��ʎ҂ɂ́A";
		mes "����^���Ȃ���΂Ȃ��!!";
		next;
		emotion 18;
		mes "[�t�F���Y]";
		mes "�n�n�n�A�����܂������H";
		mes "��k�ł���B�䂪�Ƃ̓`���Ȃ̂�";
		mes "�m��Ȃ���������܂���ˁB";
		mes "�������A�����l�ł����B";
		mes "���C���f�B�A����ɂ́A�m����";
		mes "�󂯎��܂����Ɠ`���Ă����܂��傤�B";
		delitem 1019,5;
		set XMAS_1QUE,5;
		close;
	}
	mes "[�t�F���Y]";
	mes "�����A�d���ǂ����ė��Ȃ��̂��I";
	mes "�܂����d���Ȃ��s�K�Œn���̂悤��";
	mes "�N���X�}�X�ɂȂ邩������Ȃ��Ȃ��";
	mes "�v���Ă����Ȃ�������c�c�B";
	mes "^3131FF���C���f�B�A^000000�����";
	mes "�������Ă���񂾁I";
	close;
}

xmas,113,273,4	script	�i�r�_	711,{
	if(XMAS_1QUE >= 6) {
		emotion 18;
		mes "[�i�r�_]";
		mes "����ō��N���g�����čK����";
		mes "�N���X�}�X�ɂȂ�܂��B";
		mes "���Ȃ����K���ȃN���X�}�X��";
		mes "�Ȃ��ė~�����ł��B";
		close;
	}
	if(XMAS_1QUE == 5 && countitem(1019)>=5) {
		mes "[�i�r�_]";
		mes "�����A���肪�Ƃ��������܂��I";
		mes "�Ƃ��Ƃ��d�����܂����ˁI";
		mes "���܂�ɂ��x������A";
		mes "�������̂ɂł��������񂶂�Ȃ�����";
		mes "�S�z���Ă��܂�����B";
		next;
		emotion 18;
		mes "[�i�r�_]";
		mes "����ō��N���g�����čK����";
		mes "�N���X�}�X�ɂȂ�܂��B";
		mes "���Ȃ����K���ȃN���X�}�X��";
		mes "�Ȃ��ė~�����ł��B";
		mes "���C���f�B�A����ɂ�";
		mes "��낵�����`���Ă��������B";
		delitem 1019,5;
		set XMAS_1QUE,6;
		close;
	}
	mes "[�i�r�_]";
	mes "�����A�����B";
	mes "�d�͂ǂ��Ȃ�����ł��傤�c�c�B";
	mes "^3131FF���C���f�B�A^000000�����";
	mes "�������Ă���̂ł��傤���H";
	close;
}

xmas,119,155,5	script	�W���[�C	878,{
	if(XMAS_1QUE >= 7) {
		switch(Sex) {
		case 0:
			mes "[�W���[�C]";
			mes "��������Ⴂ�B";
			mes "�܂��o�����Ă��Ȃ�������ł��ˁB";
			mes "�܂��A�d���͂������Ƃł����A";
			mes "�ނ����邵���Ƃł����A";
			mes "�����������֓����Ă��������B";
			next;
			emotion 30;
			mes "[�W���[�C]";
			mes "���̔M���S�ō�����Â����邢";
			mes "�`���R���[�g�ł������オ��܂��񂩁H";
			break;
		case 1:
			emotion 32;
			mes "[�W���[�C]";
			mes "���A�{�[�b�Ɠ˂������Ă񂾁H";
			mes "�z�B���I������炳�����Əo�Ă����B";
			mes "������N���}�W�}�W�ƒ��߂Ă�";
			mes "���̐S�́A���f�B�[�����̂��̂��B";
			break;
		}
		close;
	}
	if(XMAS_1QUE == 6 && countitem(1019)>=5) {
		switch(Sex) {
		case 0:
			mes "[�W���[�C]";
			mes "�����`�A���Ȃ��̂悤�Ȃ�����������";
			mes "�ǂ����Ă���Ȑh������";
			mes "�Ȃ���Ȃ���΂����Ȃ��̂ł��傤���B";
			mes "���������A������֗��Ȃ����B";
			next;
			mes "[�W���[�C]";
			mes "�N�̂��ア�肪�A������";
			mes "������Ă��܂��܂����ˁB";
			mes "�����`�A�����`�A���킢�����Ɂ`�B";
			next;
			mes "-�ނ́A���Ȃ��̎�������";
			mes "�W���ƌ��߁A�����߂Â���";
			mes "�ꐶ�����A���������𐁂�������-";
			next;
			emotion 19,"";
			mes "["+strcharinfo(0)+"]";
			mes "���A���͂́c�c���A���v�ł��B";
			mes "�z�B���x��Đ\���󂠂�܂���B";
			mes "�ł͎��́A�܂��z�B��";
			mes "����܂��̂Łc�c�B";
			next;
			emotion 30;
			mes "[�W���[�C]";
			mes "���A���f�B�[" +strcharinfo(0)+ "!!";
			mes "�������ł��A�������ł��A";
			mes "���񎄂�T���Ă��������I";
			mes "���ł����Ȃ�������Ă����܂��I";
			mes "���Ȃ���z�����̐S��";
			mes "���̐��܂ŉ��߂Ă����܂��B";
			break;
		case 1:
			mes "[�W���[�C]";
			mes "�c�c�x���B";
			mes "�����ɒu���Ă����B";
			break;
		}
		delitem 1019,5;
		set XMAS_1QUE,7;
		close;
	}
	switch(Sex) {
	case 0:
		mes "[�W���[�C]";
		mes "����ȂɊ����̂ɉ���";
		mes "�}���ł���̂ł��H";
		mes "��낵����΁A���΂炭������̉Ƃ�";
		mes "�Â����邢�`���R���[�g�ł�";
		mes "���ꏏ�ɂ������ł��H";
		next;
		emotion 30;
		mes "[�W���[�C]";
		mes "^3131FF���C���f�B�A^000000���񂪑ӂ��Ă��邹����";
		mes "�d�����������Ƃł����A";
		mes "���̐S�̓��f�B�[��z���A";
		mes "���X�ƔR���������Ă��܂��B";
		break;
	case 1:
		mes "[�W���[�C]";
		mes "�����Ă�񂾁H";
		mes "���ɂł��������̂��H";
		next;
		mes "[�W���[�C]";
		mes "^3131FF���C���f�B�A^000000����͉�����Ă񂾁H";
		mes "���̐S�̓��f�B�[�����ւ̑z����";
		mes "�R���Ă͂��邪�A";
		mes "�d���Ȃ������ŐH�삪";
		mes "�₽���Ă��Ȃ��B";
		mes "�����d�������ė����B";
		break;
	}
	close;
}

xmas,157,126,5	script	�m�G��	717,{
	if(XMAS_1QUE >= 8) {
		switch(Sex) {
		case 0:
			emotion 18;
			mes "[�m�G��]";
			mes "�����H�@�܂��������������́H";
			mes "����Ȃɑӂ��Ă���ƁA";
			mes "�킫���̎��b��R�Ă�������";
			mes "�@��𓦂����ƂɂȂ���I";
			mes "�L���n�n�n�n�n�b�I";
			break;
		case 1:
			mes "[�m�G��]";
			mes "����A�܂��������������̂ł��ˁB";
			mes "��قǂ͐\���󂠂�܂���ł����B";
			mes "�t�B�A���Z�͎��i�[���A";
			mes "�������l�ł��āc�c�B";
			mes "�E�t�t�c�c�B";
			next;
			mes "[�H�H�H]";
			mes "�����A�m�G��!!!";
			mes "�܂��O�ŉ����Ă��!!";
			next;
			emotion 18;
			mes "[�m�G��]";
			mes "���ł�����܂���B";
			mes "�����ɍs���܂��ˁ`�B";
			next;
			emotion 9,"";
			mes "-�ޏ��́A�܂����Ȃ��̐K��";
			mes "�|���Ɖ����o���āA���̂������";
			mes "�U��Ԃ��Ăقُ΂�-";
			break;
		}
		close;
	}
	if(XMAS_1QUE == 7 && countitem(1019)>=5) {
		switch(Sex) {
		case 0:
			emotion 18;
			emotion 6,"";
			mes "[�m�G��]";
			mes "�����`�A���o����B";
			mes "�������������ē͂��Ă���Ȃ���";
			mes "�����܂����B";
			mes "�ق�ق�A�����ɂ������c�c�B";
			next;
			mes "[�m�G��]";
			mes "�z�B�ł������Ɗ撣���";
			mes "�����͑�����ł��傤��B";
			mes "�d�͂����֒u���Ă����Ă��������B";
			break;
		case 1:
			emotion 3;
			mes "[�m�G��]";
			mes "����A�f�G�Ȃ��Z����B";
			mes "���̐d�́A���̒����������̂ł����H";
			mes "����Ȃɑf�G�Ȃ��Z����";
			mes "�d��z�B���Ă�������Ȃ��";
			mes "���������܂ō��N�̃N���X�}�X��";
			mes "�������K���ɉ߂��������ł��B";
			next;
			mes "[�m�G��]";
			mes "�����A�����Ԃ�����܂�����";
			mes "���֓����Ă����ł���t�������ł��H";
			next;
			mes "[�H�H�H]";
			mes "�����A�m�G��!!";
			mes "���̒j�͒N��!?";
			next;
			mes "[�m�G��]";
			mes "��I�@���A���ł��Ȃ���I";
			mes "�����̐d�̔z�B����B";
			next;
			emotion 9,"";
			mes "-�ޏ��͂��Ȃ��̐K��";
			mes "�|���Ɖ����Ăǂ����A";
			mes "���̂�����֌�������";
			mes "�قُ΂ݕԂ���-";
			break;
		}
		delitem 1019,5;
		set XMAS_1QUE,8;
		close;
	}
	switch(Sex) {
	case 0:
		mes "[�m�G��]";
		mes "�����A�����B^3131FF���C���f�B�A^000000�����";
		mes "���d�������ė���";
		mes "��������̂ł��傤���H";
		mes "���[��H�@���Ȃ��c�c";
		next;
		emotion 18;
		mes "[�m�G��]";
		mes "�͂͂��B";
		mes "����ȓ��ɂ���l���Ȃ�āA";
		mes "�������ɓ�����Ⴂ�܂���B";
		mes "���߂Ď������F��ł�";
		mes "���Ă����܂��傤�B�t�t�c�c�B";
		break;
	case 1:
		emotion 30;
		mes "[�m�G��]";
		mes "�L���n�n�n�n�n�b�I";
		mes "�����[�N���X�}�X�`�A�f�G�Ȃ��Z����B";
		mes "^3131FF���C���f�B�A^000000����ɉ������";
		mes "�d�𑁂��z�B���Ă���������";
		mes "�`���Ă��������܂��H";
		break;
	}
	close;
}

//==============================================================
// �������N���X�}�X�L������
//
//   �� XMAS_2QUE -> 0�`3�A�N�G�X�g�I�����ɂ�0�ɖ߂�
//==============================================================
-	script	�I�[���[#xmas	79,{
	switch(XMAS_2QUE) {
	case 0:
		misceffect 75;
		mes "[�I�[���[]";
		mes "���l������āA�}���܂�`";
		mes "�v�����҂��ɂ��A��͗��܂���`��";
		next;
		mes "[�I�[���[]";
		mes "�����[�N���X�}�X�`��";
		mes "�Z��l�A�N���X�}�X�ƌ����܂��ƁA";
		mes "������ԍŏ��Ɏv�������т܂��H";
		next;
		switch (select("�T���^�N���[�X�I","�v���[���g�I","�N���X�}�X�L�������I","�T���^�̂ڂ����I","�����`�A�J�b�v���B���������I")) {
			case 1:
				mes "[�I�[���[]";
				mes "�T���^�N���[�X�ł����I";
				mes "�܂��܂��A���S��";
				mes "�Y��Ă��Ȃ���ł���!!";
				mes "�z�z�z�c�c�B";
				next;
				mes "[�I�[���[]";
				mes "���́A���������̘b�ł����c�c";
				mes "��N���N���X�}�X�̊X��";
				mes "�T���^�N���[�X���Z��ł���Ƃ���";
				mes "�\������܂��B";
				next;
				emotion 18;
				mes "[�I�[���[]";
				mes "�ȏ�A�I�[���[��";
				mes "�ŐV�j���[�X!!�ł����B";
				mes "�ˁA�����ł�����ˁH";
				close;
			case 2:
				mes "[�I�[���[]";
				mes "�v���[���g�ł����I";
				mes "�m���ɁA����͒�Ԃł���ˁB";
				mes "�����Ă��鎞�ɁA���������";
				mes "�����ɒu���Ă����ꂽ�v���[���g�B";
				mes "������A���A�N���Ă�����";
				mes "�J���鎞�̊��Ҋ��Ƃ�����������`!!";
				next;
				mes "[�I�[���[]";
				mes "���������΁A���̘b�͂������ł��H";
				mes "���N�A�N���X�}�X�Ɍ����";
				mes "�����T���^�N���[�X!!";
				mes "�S���E�̑P�ǂȎq���B�ɔz����";
				mes "�v���[���g��S���A";
				mes "�����������Ă��܂������z�ł��B";
				next;
				mes "[�I�[���[]";
				mes "����ŁA�Ƃ��Ƃ��A";
				mes "�N���X�}�X�̊X�ɏZ��";
				mes "�T���^�N���[�X���A";
				mes "���̋U�҃T���^�u�A���\�j�v��";
				mes "���܋��������������ł��B";
				next;
				emotion 18;
				mes "[�I�[���[]";
				mes "�ȏ�A�I�[���[��";
				mes "�ŐV�j���[�X!!�ł����B";
				mes "�ˁA�����ł�����ˁH";
				close;
			case 3:
				mes "[�I�[���[]";
				mes "�����ł��傤�A�����ł��傤�I";
				mes "����ς�N���X�}�X�L�������ł���ˁI";
				mes "���͗c�����A�N���X�}�X���߂Â���";
				mes "�X�̂����炱���炩�畷�����Ă���";
				mes "�N���X�}�X�L�������̉��ɁA";
				mes "�S���x���Ă��܂����B";
				next;
				mes "[�I�[���[]";
				mes "���������̍��́A�̗̂l�ɂ�";
				mes "�N���X�}�X�L��������";
				mes "�������Ă��Ȃ��Ȃ�܂����B";
				mes "�L�������̉����������Ă��Ȃ���";
				mes "�N���X�}�X���߂Â��Ă��A";
				mes "���܂�������N���܂���B";
				next;
				mes "[�I�[���[]";
				mes "�����ŁA���A�F�l�Ɋy�����N���X�}�X��";
				mes "�v���[���g���悤�Ǝv���A�e�Ƃ����A";
				mes "�N���X�}�X�L���������̂��Ȃ���A";
				mes "�q���B�Ƀv���[���g��z���Ă��܂����B";
				next;
				mes "[�I�[���[]";
				mes "����Ȏ��A�厖�ȃN���X�}�X�L��������";
				mes "�y�����A���������B�ɁA����Ȃɂ�";
				mes "���c�Ɉ����􂩂�Ă��܂����̂ł��B";
				next;
				mes "[�I�[���[]";
				mes "�܂��s���Ȃ���΂Ȃ�Ȃ��Ƃ�";
				mes "�������񂠂�Ƃ����̂Ɂc�c�B";
				mes "�q���B�̂������肵�������A";
				mes "�����܂ŕ������Ă������ŁA";
				mes "�ƂĂ��C���d���ł��B";
				next;
				menu "�c�c����`�����܂��傤���H",-;
				emotion 18;
				mes "[�I�[���[]";
				mes "�܂��A�܂��A�{���ł����H";
				mes "�����`�A�������܂��H";
				mes "�S���E�̎q���B����Ԑ����I";
				mes "�{���Ȃ�A�y�����Ȃ��Ƃ��A";
				mes "�N���X�}�X�L��������";
				mes "�̂�������ׂ��ł��傤���c�c�B";
				next;
				mes "[�I�[���[]";
				mes "�ł��A���Ȃ��ɂ��̋C������Ȃ�A";
				mes "���ނ̂����߂炤�K�v�͂���܂���ˁB";
				mes "�����A�q���B�ɖ��Ɗ�]��";
				mes "�^���ɍs���܂��傤�I";
				next;
				mes "[�I�[���[]";
				mes "�܂�" +strcharinfo(0)+ "�l�́A";
				mes "���̈�����������A";
				mes "�N���X�}�X�L�������̊y����";
				mes "���߂��Ă��������B";
				next;
				mes "[�I�[���[]";
				mes "�y�����D���Ă���A�܂�����Ȃ�";
				mes "���Ԃ͌o���Ă��܂��񂩂�A";
				mes "���炭�X���炻�������ւ�";
				mes "�s���Ă��Ȃ��͂��ł��B";
				next;
				emotion 21;
				mes "[�I�[���[]";
				mes "�����Ȃ̂ŁA����������";
				mes "���Ă��邩������܂���B";
				mes "�C�����Ă��������B";
				mes "����ł́A���肢�������܂��I";
				set XMAS_2QUE,1;
				close;
			case 4:
				mes "[�I�[���[]";
				mes "�T���^�̂ڂ����ł����I";
				mes "���́A�����X�^�[�B������Ă���";
				mes "�T���^�̂ڂ����c�c";
				mes "����̓T���^�N���[�X��";
				mes "����Ă��镨�Ƃ͈Ⴄ���Ă���";
				mes "�����m�ł���ˁH";
				next;
				mes "[�I�[���[]";
				mes "�\�ɂ��Ƃ��̖X�q��";
				mes "���e�B�G�ɂ���f�U�C�i�[��";
				mes "����������ł��B";
				next;
				mes "[�I�[���[]";
				mes "���N�N���X�}�X�ɂȂ��";
				mes "��������̖`���҂��U�҃T���^";
				mes "�u�A���\�j�v��ǂ������Ă��܂��B";
				mes "�ł��ނ��A�Ȃ��Ȃ��߂܂�Ȃ��̂́A";
				mes "�ނ�����Ă���X�q�ƃT���^���̂���";
				mes "�Ƃ����b������܂��B";
				next;
				mes "[�I�[���[]";
				mes "�X�q�ƕ��ɉ������ʂȗ͂�";
				mes "���߂��Ă���̂ł��傤���H";
				mes "�܂��N���X�}�X�̊X��";
				mes "���̃f�U�C�i�[������悤�ł��B";
				mes "���x�A�V�����T���^�̂ڂ����쐬��";
				mes "�ȗ��ɂł��s���Ă݂Ă͂������ł��H";
				next;
				emotion 18;
				mes "[�I�[���[]";
				mes "�ȏ�A�I�[���[��";
				mes "�ŐV�j���[�X!!�ł����B";
				mes "�ˁA�����ł�����ˁH";
				close;
			case 5:
				mes "[�I�[���[]";
				mes "���炠��B";
				mes "���Ɠ����l���Ȃ�ł��ˁc�c�B";
				mes "�����A����̃N���X�}�X��";
				mes "���̗l�ɂ��l���̕���";
				mes "������������������݂����ł���B";
				next;
				mes "[�I�[���[]";
				mes "�\�ɂ��ƁA����ȕ��X���W�܂���";
				mes "���x�̃N���X�}�X�ɁA�����傫�Ȏ���";
				mes "���悤�Ƃ��Ă��邻���ł��B";
				mes "�c�c���܂������Ƃ悢�ł��ˁB";
				mes "�i�E�t�t�j";
				next;
				emotion 18;
				mes "[�I�[���[]";
				mes "�ȏ�A�I�[���[��";
				mes "�ŐV�j���[�X!!�ł����B";
				mes "�ˁA�����ł�����ˁH";
				close;
		}
	case 1:
		mes "[�I�[���[]";
		mes "�܂��������������̂ł��ˁB";
		mes "�������̈�����T���o����";
		mes "�y�������߂��Ă��������B";
		mes "�N���X�}�X��䖳���ɂ���";
		mes "���������ɓV����!!";
		close;
	case 2:
		if(countitem(1097)<1) {
			mes "[�I�[���[]";
			mes "���Ƃ��A���̈�����";
			mes "�������悤�ł���!!";
			mes "����ǂ��c�c";
			mes "�y���͂ǂ��ɂ���̂ł���?!";
			close;
		}
		mes "[�I�[���[]";
		mes "�܂��A�܂��`��";
		mes "�����A�������܂����̂ˁI";
		mes "���̈����A�����ςȎ���";
		mes "���Ă��܂���ł����H";
		mes "�c�c�z�b�A�����Ȃ悤�ŁA";
		mes "�{���ɂ悩�����ł��B";
		next;
		mes "[�I�[���[]";
		mes "�ł́A����ɁA���̊y���ɏ����Ă���";
		mes "�N���X�}�X�L���������̂��Ă����܂��B";
		next;
		misceffect 75;
		mes "[�I�[���[]";
		mes "���[��I�@����!!�@����!!";
		mes "�^���ԂȂ��@�̃g�i�J�C�����";
		mes "�����݂�Ȃ̏΂����́`��";
		mes "�ł����̔N�̃N���X�}�X�̓�";
		mes "�T���^�̂�������͌����܂����`��";
		next;
		mes "-����ɐS�������������A";
		mes "�y�����Ȃ��Ă���-";
		mes "-���Ȃ��͂��̊Ԃɂ��A";
		mes "�ޏ��Ƌ��ɃN���X�}�X�L��������";
		mes "�������ݎn�߂Ă���-";
		next;
		misceffect 75,"";
		mes "["+strcharinfo(0)+"]";
		mes "�Â��铹�͂҂��҂���";
		mes "���O�̕@�����ɗ��̂��`��";
		mes "���������Ă��g�i�J�C�����";
		mes "���������͂Ɗ�т܂����`��";
		next;
		mes "[�I�[���[]";
		mes "�܂��A�ƂĂ������ł��ˁ`�I";
		mes "�����ł��I�@�厖�Ȃ̂͐S�ł�!!";
		mes "���́A����́A�q���B�ɂ����悤��";
		mes "���Ă����v���[���g�Ȃ�ł����c�c";
		next;
		mes "[�I�[���[]";
		mes "�y�������߂��Ă��������܂������A";
		mes "�N���X�}�X�L��������";
		mes "�ꏏ�ɉ̂��Ă��������܂����̂ŁA";
		mes "���Ȃ��ɂ��̂���Ƃ���";
		mes "�v���[���g�������グ�܂��傤�I";
		next;
		mes "-�ޏ��͑傫�ȑ܂����o����";
		mes "���Ȃ��̑O�ɒu���A�܂̌����J����-";
		next;
		mes "[�I�[���[]";
		mes "���I�@�����̂����Ă͂����܂����I";
		mes "�����A������āA";
		mes "��������o���Ă��������B";
		next;
		delitem 1097,1;
		emotion 18;
		switch(rand(15)) {
			case 0:
				mes "[�I�[���[]";
				mes "�L�����f�B�ł��ˁI";
				mes "����́A�����̏C���@���l��";
				mes "�����ɂȂ���";
				mes "�N���X�}�X�L�����f�B�ł��B";
				mes "�ƂĂ��Â��Ă��������ł���B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 529,20;
				break;
			case 1:
				mes "[�I�[���[]";
				mes "�X�e�B�b�N�L�����f�B�ł��ˁI";
				mes "����́A�����̏C���@���l��";
				mes "�����ɂȂ���";
				mes "�N���X�}�X�L�����f�B�ł��B";
				mes "�ƂĂ��Â��Ă��������ł���B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 530,15;
				break;
			case 2:
				mes "[�I�[���[]";
				mes "�悭�Ă����N�b�L�[�ł��ˁI";
				mes "����́A��C�A�R���C�g�l��";
				mes "����悭���Ă��ɂȂ����N�b�L�[�ł��B";
				mes "�T�N�T�N���Ă��������ł���B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 538,10;
				break;
			case 3:
				mes "[�I�[���[]";
				mes "�ЂƂ����P�[�L�ł��ˁI";
				mes "����́A��C�A�R���C�g�l��";
				mes "���炨�Ă��ɂȂ���";
				mes "�N���X�}�X�P�[�L�ł��B";
				mes "�ƂĂ��_�炩���Ă��������ł���B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 539,5;
				break;
			case 4:
				mes "[�I�[���[]";
				mes "�َq��݂ł��ˁI";
				mes "����͎�����������̂ł��B";
				mes "��������������������";
				mes "������������Ă܂���B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 12130,7;
				break;
			case 5:
				mes "[�I�[���[]";
				mes "�T���^�̂ڂ����ł��ˁI";
				mes "����́A�N���X�}�X�V�[�Y���ɂ���";
				mes "�G�ߌ���Ő��Y����钿�����i�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 2236,1;
				break;
			case 6:
				mes "[�I�[���[]";
				mes "�X�|�A�l�`�ł��ˁI";
				mes "����́A�g�[�}�X�i���l������";
				mes "��j�A��j�A�^�S�����߂�";
				mes "�����ɂȂ����X�|�A�l�`�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 743,1;
				break;
			case 7:
				mes "[�I�[���[]";
				mes "�o�t�H���b�g�l�`�ł��ˁI";
				mes "�c�c�c�c?!";
				mes "���ꂪ�ǂ����Ă�����?!";
				mes "���A�����Ɓc�c�܂��A";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 750,1;
				break;
			case 8:
				mes "[�I�[���[]";
				mes "�I�V���X�l�`�ł��ˁI";
				mes "�c�c�c�c?!";
				mes "���ꂪ�ǂ����Ă�����?!";
				mes "���A�����Ɓc�c�܂��A";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 751,1;
				break;
			case 9:
				mes "[�I�[���[]";
				mes "�o�b�^�l�`�ł��ˁI";
				mes "����́A�i�C�g�̃��e�����l���A";
				mes "�����X�^�[�{�[�J����|�����ۂɊl����";
				mes "�����Ɋ�t���Ă����������l�`�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 752,1;
				break;
			case 10:
				mes "[�I�[���[]";
				mes "�T���l�`�ł��ˁI";
				mes "����́A�A�T�V���̃}���U�i�l��";
				mes "�����X�^�[���[���[��|�����ۂɊl����";
				mes "�����Ɋ�t���Ă����������l�`�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 753,1;
				break;
			case 11:
				mes "[�I�[���[]";
				mes "�^�k�L�l�`�ł��ˁI";
				mes "����́A�n���^�[�̃��C�f�B���R�X�l��";
				mes "�����X�^�[�X���[�L�[��";
				mes "�|�����ۂɊl�����A������";
				mes "��t���Ă����������l�`�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 754,1;
				break;
			case 12:
				mes "[�I�[���[]";
				mes "���L�̐l�`�ł��ˁI";
				mes "����́A�ȑO�����ɂ��z���ɂȂ��Ă���";
				mes "�}�[�K���b�^�o���l���A�����X�^�[";
				mes "����������|�����ۂɊl�����A";
				mes "�����Ɋ�t���Ă����������l�`�ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 7206,1;
				break;
			case 13:
				mes "[�I�[���[]";
				mes "�݂艺����ꂽ�l�`�ł��ˁI";
				mes "����́A�����������l�`�ł��B";
				mes "�ƂĂ����킢���ł���ˁH";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 7212,1;
				break;
			case 14:
				mes "[�I�[���[]";
				mes "���i�b�N�l�`�ł��ˁI";
				mes "����́A�ǂ����������̐E�l���񂪁A";
				mes "����̖����v���`���A";
				mes "�Ӑg�̗͂����߂č�����Ƃ���";
				mes "�l�`�������ł��B";
				mes "�y�����N���X�}�X�ɂȂ�܂��悤�Ɂ`��";
				getitem 7277,1;
				break;
		}
		set XMAS_2QUE,3;
		close;
	case 3:
		mes "[�I�[���[]";
		mes "��`���Ă�������A";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "����ǂ��c�c�l�X������������";
		mes "�N���X�}�X�B�������܂�����";
		mes "���Ă��邩������܂���B";
		next;
		mes "[�I�[���[]";
		mes "�����N�����ۂ́A�Ă�";
		mes "��`���Ă��������܂���ˁH";
		mes "��낵�����肢���܂��`��";
		mes "�ł́A���͂̕��ɂǂ�ǂ�P�s���{��";
		mes "�F���K���ȃN���X�}�X�ɂ��܂��傤�I";
		set XMAS_2QUE,0;
		close;
	}
}

prontera,156,242,3	duplicate(�I�[���[#xmas)	�I�[���[	79
geffen,120,188,3	duplicate(�I�[���[#xmas)	�I�[���[	79
payon,165,153,3	duplicate(�I�[���[#xmas)	�I�[���[	79
morocc,161,85,3	duplicate(�I�[���[#xmas)	�I�[���[	79
alberta,54,237,3	duplicate(�I�[���[#xmas)	�I�[���[	79


-	script	�f�r���`#Xmas	-1,{
	emotion 29;
	mes "[�f�r���`]";
	mes "�N�b�N�b�N�b�c�c";
	mes "�����̐l��!!";
	mes "��������A�킵�ƌ_�񂵂Ȃ����H";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�����`��!?";
	switch(XMAS_2QUE) {
	case 0:
		mes "�f�r���`�[��!!";
		break;
	case 1:
		mes "�������Ă��O�̂���!?";
		mes "�f�r���`��!!";
		break;
	}
	mes "�c�c�悵�A�߂܂���!!";
	next;
	mes "-���Ȃ��́A�f�����f�r���`��";
	mes "�̂�����ŁA�����グ��-";
	next;
	emotion 23;
	emotion 23,"";
	mes "[�f�r���`]";
	mes "�ȁA���������!?";
	mes "�l�Ԃ��Ƃ���!!";
	mes "�O�k�k�k�c�c";
	mes "���A����A�����`��!!";
	next;
	//�Ăяo������MAP�R�[�h�ƃf�r���`�ԍ���؂�o��
	set .@code$,substr2(strnpcinfo(0),-2,1);
	set .@num,substr2(strnpcinfo(0),-1,1);
	hideonnpc;
	setarray .@ref,0,1,2;
	deletearray .@ref[.@num],1;
	hideoffnpc "�f�r���`#Xmas" +.@code$+ .@ref[rand(2)];	//�b�����ĂȂ��f�r���`�̂ǂ��炩���o��������

	if( XMAS_2QUE == 1 && !(rand(5)) ) {
		mes "-�f�r���`�͑f���������o����-";
		mes "-^3131FF�f�r���`�������ꏊ��";
		mes "�j�ꂽ�����ꂪ�����Ă���^000000-";
		mes "-�����E���ēǂ�ł݂�Ɓc�c-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�^���ԁc�c�g�i�J�C�c�c";
		mes "�T���^�c�c�s�J�s�J�c�c";
		mes "�����H�@�y�����Ă���̂��Ƃ��ȁB";
		mes "�I�[���[����ɕ񍐂��悤�I";
		getitem 1097,1;
		set XMAS_2QUE,2;
		close;
	}
	mes "-�f�r���`�͑f���������A";
	mes "���Ȃ��̕��������A�����Ԃ₢��-";
	if( XMAS_2QUE != 1 || !(rand(4)) ) {
		mes "-�ǂ����ֈړ���������̂�������-";
		close2;
		if(.@code$ == "P") warp "prontera",155,230;
		if(.@code$ == "G") warp "geffen",120,35;
		if(.@code$ == "F") warp "payon",166,60;
		if(.@code$ == "M") warp "morocc",160,51;
		if(.@code$ == "A") warp "alberta",28,235;
		end;
	}
	next;
	emotion 23,"";
	switch(rand(3)) {
	case 0:
		mes "-�łɂ�������!!-";
		sc_start3 SC_POISON,0,0,0,0,10000,10;
		close;
	case 1:
		mes "-�􂢂ɂ�������!!-";
		sc_start3 SC_CURSE,0,0,0,0,10000,10;
		close;
	case 2:
		mes "-�Í��ɂ�������!!-";
		sc_start SC_BLIND,0,0,0,0,10000,10;
		close;
	}
OnInit:
	//duplicate���ȊO�ŁA����0�ԈȊO�Ȃ�n�C�h
	if(strnpcinfo(2) != "Xmas" && substr2(strnpcinfo(0),-1,1) != "0") {
		hideonnpc;
	}
	end;
}

prontera,94,297,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasP0	738,3,3
prontera,126,117,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasP1	738,3,3
prontera,205,242,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasP2	738,3,3

geffen,111,101,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasG0	738,3,3
geffen,120,188,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasG1	738,3,3
geffen,173,163,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasG2	738,3,3

payon,140,56,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasF0	738,3,3
payon,142,203,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasF1	738,3,3
payon,248,239,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasF2	738,3,3

morocc,52,134,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasM0	738,3,3
morocc,210,264,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasM1	738,3,3
morocc,223,74,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasM2	738,3,3

alberta,54,132,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasA0	738,3,3
alberta,97,86,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasA1	738,3,3
alberta,180,48,3	duplicate(�f�r���`#Xmas)	�f�r���`#XmasA2	738,3,3


//==============================================================
// ���G�̃\���R�c
//
//   �� XMAS_3QUE -> 0�`6�A�N�G�X�g�I�����ɂ�0�ɖ߂�
//==============================================================
prontera,155,285,3	script	�G���W���C#Xmas	753,{
	switch(XMAS_3QUE) {
	case 0:
		mes "[�G���W���C]";
		mes "���N���c�c�n���̋G�߂�����ė���!!";
		mes "���Ă��₽�������̂̒���ʂ蔲���A";
		mes "�X�ɑ̂̐c�܂ŗ�₵�A�S�̉���܂�";
		mes "��₳�ꂽ�\��������[�I";
		mes "�N���X�}�X���J�b�v�������̓�����";
		mes "��̒N�����߂��Ƃ�����!!!!";
		next;
		mes "[�G���W���C]";
		mes "�u�N���X�}�X�͉Ƒ��ƈꏏ�Ɂv�Ƃ���";
		mes "�������W����f���Ȃ�����A�f�[�g��";
		mes "�o�����閅����������������B";
		next;
		mes "[�G���W���C]";
		mes "�₵���Ɛ킢�Ȃ���A�������̂���";
		mes "���P���ł����悤���Ǝv���Ă��܂�";
		mes "�n���݂����Ȉ�����A�ς킵��������";
		mes "�Y�߂��Ȃ���������I";
		next;
		mes "[�G���W���C]";
		mes "���A�G���W���C���N�B�̑����";
		mes "�吺�ŋ��ڂ��I";
		mes "���N�̃N���X�}�X�́c�c";
		mes "��炪������[!!";
		mes "�����y���ނ��[!!!!";
		next;
		switch (select("�I�I�[�b!!","�ʂɁc�c","���ɂ͑��肪���܂��̂Ł`��")) {
			case 1:
				mes "[�G���W���C]";
				mes "�悵!!�@��X����x�A�f�G�ɁI";
				mes "�����Ċy�����V�Ԃׂ���!!";
				mes "���āA���̌v��͂������B";
				mes "�N���X�}�X������ƐS��������������";
				mes "���͂��C�ɂ��Ȃ��J�b�v��������";
				mes "���߂邽�߂ɊX���P���\�肾�B";
				next;
				mes "[�G���W���C]";
				mes "���̂��߂ɂ͑����̒��Ԃ��K�v���B";
				mes "�X�̂����炱����ɎU��΂��Ă���";
				mes "���̓��u��";
				mes "���̌v��𖧂��ɒm�点�Ă���B";
				mes "��ł����ŗ����������I";
				mes "�ł́A�������F��!!";
				next;
				mes "[�G���W���C]";
				mes "���͊e����l�̘A���悾����";
				mes "�c�����Ă���B";
				mes "������A���O�Ɍv�悪�R��Ă��܂��Ă�";
				mes "�c��̒��Ԃ������v���";
				mes "���s���邽�߂ɂȁI";
				mes "�����m��A����́A^0000FF�n�b�s�[^000000�N���B";
				next;
				mes "[�G���W���C]";
				mes "�܂�^0000FF�n�b�s�[^000000�N��K�ˁA";
				mes "�v��̎n����m�点�Ă���B";
				mes "�����Ďc��̒��Ԃ������W�߂�̂�";
				mes "���͂�s�����Ă���!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "���W���[!!";
				next;
				emotion 29;
				mes "[�G���W���C]";
				mes "�����֖߂��ė��鎞�͕K���A";
				mes "�Ö؂̎}5�������Ă����I";
				mes "�X���P���̂ɕK�{�̕i������ȁB";
				mes "�t�t�c�c�t�t�t�c�c�B";
				next;
				mes "[�G���W���C]";
				mes "�����A�s���A���u��I";
				mes "�A���A���͌�����";
				mes "�J�b�v���������A�܂�����";
				mes "�����������Ƃ����Ă���킯�ł͂Ȃ�";
				mes "�Ƃ������Ƃ��̂ɖ����Ă���!!";
				mes "�y���ȃJ�b�v�������ɓV����!!!!";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "�V����!!!!";
				set XMAS_3QUE,1;
				close;
			case 2:
				mes "[�G���W���C]";
				mes "�������O��!?";
				mes "�ǂ���������!!";
				mes "���̈ӌ��Ɏ^�����Ȃ��Ȃ�A";
				mes "�Ƃ��ƂƏ�����!!";
				close;
			case 3:
				misceffect 42;
				mes "[�G���W���C]";
				mes "�c�c�c�c";
				next;
				misceffect 43;
				mes "[�G���W���C]";
				mes "�c�c�c�c�c�c";
				next;
				misceffect 254;
				mes "[�G���W���C]";
				mes "�c�c�c�c�c�c�c�c";
				next;
				misceffect 328;
				misceffect 1,"";
				heal -(Hp-1),0;
				mes "[�G���W���C]";
				mes "�c�c�c�c�c�c�c�c�c�c";
				mes "�Ƃ��ƂƏ�����A���̈�����!!";
				close;
		}
	default:	//1�`4�̂Ƃ�
		mes "[�G���W���C]";
		mes "���͊e����l�̘A���悾����";
		mes "�c�����Ă���B";
		mes "������A���O�Ɍv�悪�R��Ă��܂��Ă�";
		mes "�c��̒��Ԃ������v���";
		mes "���s���邽�߂ɂȁI";
		mes "�����m��A����́A^0000FF�n�b�s�[^000000�N���B";
		next;
		mes "[�G���W���C]";
		mes "�܂�^0000FF�n�b�s�[^000000�N��K�ˁA";
		mes "�v��̎n����m�点�Ă���B";
		mes "�����Ďc��̒��Ԃ������W�߂�̂�";
		mes "���͂�s�����Ă���!!";
		next;
		mes "[�G���W���C]";
		mes "�����֖߂��ė��鎞�͕K���A";
		mes "^0000FF�Ö؂̎}5��^000000�������Ă���!!";
		mes "��ΖY���Ȃ�I";
		mes "�y���ȃJ�b�v�������ɓV����!!!!";
		close;
	case 5:
		if(countitem(604)<5) {
			mes "[�G���W���C]";
			mes "���Ԃ͂Ȃ���!!";
			mes "�N�����߂���Ă��鍡�A���̎���";
			mes "�J�b�v�������͍��ꍏ�Ǝ����B�̂��߂�";
			mes "�y�����N���X�}�X���߂����Ă���̂��B";
			mes "����^0000FF�Ö؂̎}5��^000000��";
			mes "�p�ӂ��Ă����I";
			close;
		}
		mes "[�G���W���C]";
		mes "�C���͐��s������!?";
		mes "�����A�Ö؂̎}���H";
		mes "�悵�A������ƌ����Ă݂�I";
		next;
		mes "[�G���W���C]";
		mes "�����I�@�������������ȁI";
		mes "����ł͎n�߂�Ƃ��悤!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������Ƒ҂��Ă�������!!";
		mes "�܂��A���̐l�B��";
		mes "���Ă��Ȃ��悤�ł����H";
		next;
		mes "[�G���W���C]";
		mes "���̘b���H";
		mes "�ނ�͂Ƃ����Ɂc�c";
		mes "�ق�A";
		next;
		hideoffnpc "�n�b�s�[#xmas";
		hideoffnpc "�����[#xmas";
		hideoffnpc "�N���X#xmas";
		hideoffnpc "�}�X#xmas";
		emotion 27,"�n�b�s�[#xmas";
		emotion 27,"�����[#xmas";
		emotion 27,"�N���X#xmas";
		emotion 27,"�}�X#xmas";
		mes "[�G���W���C]";
		mes "���Ă�ł͂Ȃ����I";
		mes "�Ⴂ���񂪁c�c�������肵��I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�m���ɁA�l�l�Ƃ��I";
		next;
		mes "[�G���W���C]";
		mes "���}����!!�@���N��!!";
		mes "��l�g�Ƃ����̂�";
		mes "�܂�ō߂ł��邩�̂悤�ɁA";
		next;
		mes "[�G���W���C]";
		mes "�J�b�v�������̖ڂ�����A";
		mes "���Ԃ̖ڂ�����A";
		mes "���₩�Ȑߖڂ�L�O���̓x��";
		mes "�A�ɉA�ɒǂ�����Ă����\��������I";
		next;
		mes "[�G���W���C]";
		mes "�F�B�ɗ��l���ł������c�c";
		mes "���[�ŃL�X������l�B���������c�c";
		mes "�ǂ����Ď������ڂ�w���Ȃ����";
		mes "�Ȃ�Ȃ��̂�!?";
		mes "�{��ɐg��k�킹�Ȃ��玕�����肵��";
		mes "���A�߂̂Ȃ��\��������!!";
		next;
		mes "[�G���W���C]";
		mes "���N�̓J�b�v�������̃N���X�}�X��";
		mes "�����̂ł͂Ȃ�!!";
		next;
		mes "[�G���W���C]";
		mes "�f��Ńs�b�L�������΂��A";
		mes "�������̃G�T��";
		mes "�S��H�ׂ邩�̂悤�Ɋ��ݍӂ��A";
		mes "�����s�D�����э~��A";
		mes "�|�S�̂悤�ɒb�B���ꂽ";
		mes "���\��������I";
		next;
		mes "[�G���W���C]";
		mes "�p�[�e�B�[�𒭂߂āA�A�܂�����";
		mes "��������ړ���G�炵���ßT�Ȏ����";
		mes "�����I��肾�I";
		mes "�N���X�}�X���J�b�v���̐�L������";
		mes "�N�����߂��̂��[!!";
		mes "���N�̃N���X�}�X�͉�炪�����!!";
		next;
		mes "[�ꓯ]";
		mes "�����A���N�̃N���X�}�X�́A";
		mes "��炪������I";
		mes "���̐S�I�@���݁I�@�{��I�@��Y!!";
		mes "�F�A�����ɏW�߂ĕ����o�����[!!";
		next;
		mes "-�G���W���C�́A�W�߂Ă���";
		mes "�Ö؂̎}���܂Ƃ߂Ă킵�Â��݂ɂ��A";
		mes "�͂�������-";
		next;
		mes "[�G���W���C]";
		mes "�N���X�}�X������Ƃ����āA";
		mes "�v��������S�������������Ă���";
		mes "�y���ȃJ�b�v���ɓV�����[�I";
		mes " ";
		mes "[�ꓯ]";
		mes "�V�����[!!";
		delitem 604,5;
		misceffect 330;
		emotion 27;
		emotion 27,"�n�b�s�[#xmas";
		emotion 27,"�����[#xmas";
		emotion 27,"�N���X#xmas";
		emotion 27,"�}�X#xmas";
		hideonnpc;
		hideonnpc "�n�b�s�[#xmas";
		hideonnpc "�����[#xmas";
		hideonnpc "�N���X#xmas";
		hideonnpc "�}�X#xmas";
		set XMAS_3QUE,6;
		set .@name$,strcharinfo(0);
		donpcevent "XmasSoloShout::OnStart";
		close2;
		announce "�\���R�c��"+.@name$+"�l�̐S�̋��т��X���P���܂����B",8,0x73DEDE;
		monster "prontera",154,296,.@name$+"�̔�������",1588,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",155,296,.@name$+"�̌��",1588,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",156,296,.@name$+"�̍U��",1588,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",157,296,.@name$+"�̉e",1588,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",158,296,.@name$+"�̔߂���",1588,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",154,297,.@name$+"�̋�������",1244,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",155,297,.@name$+"�̗J�T",1244,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",156,297,.@name$+"����",1244,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",157,297,.@name$+"�̚���",1244,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",158,297,.@name$+"�̎��i",1244,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",154,298,.@name$+"�̎₵��",1245,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",155,298,.@name$+"�̍ق�",1245,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",156,298,.@name$+"�̈�",1245,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",157,298,.@name$+"�̎�",1245,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",158,298,.@name$+"�̈���",1245,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",154,299,.@name$+"�̓i��",1062,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",155,299,.@name$+"�̔��e",1062,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",156,299,.@name$+"�̋�Y",1062,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",157,299,.@name$+"�̐�]",1062,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",158,299,.@name$+"�̍���",1062,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",154,300,.@name$+"�̓{��",1246,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",155,300,.@name$+"�̍���",1246,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",156,300,.@name$+"�̎�",1246,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",157,300,.@name$+"�̏��S",1246,1,"�G���W���C#Xmas::OnKilled";
		monster "prontera",158,300,.@name$+"�̑���",1246,1,"�G���W���C#Xmas::OnKilled";
		initnpctimer;
		end;
	case 6:
		mes "[�G���W���C]";
		mes "����c�c�v������s���Ă��A";
		mes "�܂��J�b�v�������̖҈Ђ͂������I";
		mes "�\���������w�؂��o���b�ƐL�΂���";
		mes "�\���̖��������݂����!!";
		mes "�����A�˂��i�߁A���u��!!";
		next;
		mes "[�G���W���C]";
		mes "�h�������ނ��̓��܂ŁI";
		mes "�\�����S�̕��������߂����̓��܂ŁA";
		mes "���̒���͉ʂĂ��Ȃ��������낤�B";
		mes "�͂��o���A��F��I";
		mes "�S����������܂ŁA�v�������V�ׁI";
		set XMAS_3QUE,0;
		close;
	}
OnTimer180000:
	stopnpctimer;
	mapannounce "prontera","�\���R�c���B���A�F�A�y�����N���X�}�X���}������悤�F��܂��B",0,0x73DEDE;
	killmonster "prontera","�G���W���C#Xmas::OnKilled";
	hideoffnpc;
	end;
OnInit:
	hideonnpc "�n�b�s�[#xmas";
	hideonnpc "�����[#xmas";
	hideonnpc "�N���X#xmas";
	hideonnpc "�}�X#xmas";
	end;
OnKilled:	//�_�~�[�C�x���g
	end;
}

prontera,0,0,0	script	XmasSoloShout	-1,{
OnStart:
	sleep 3000;
	mapannounce "prontera","���B��1�l�ŏo�����Ⴄ���I",0,0x73DEDE;
	sleep 2000;
	mapannounce "prontera","�_���W�����Ńp�[�e�B�[���ґ򂾁I",0,0x73DEDE;
	sleep 2000;
	mapannounce "prontera","���ɂ͐S�Ɍ��߂�NPC������I",0,0x73DEDE;
	sleep 2000;
	mapannounce "prontera","���܂�ē]�E�܂œƂ�ł����I",0,0x73DEDE;
	sleep 2000;
	mapannounce "prontera","�N���X�}�X�ɂ̓V���O���x�`���I",0,0x73DEDE;
	sleep 2000;
	mapannounce "prontera","�c�c�������͖��G�̃\���R�c!!",0,0x73DEDE;
	end;
}

prontera,150,286,5	script	�n�b�s�[#xmas	869,{}
prontera,161,286,3	script	�����[#xmas	875,{}
prontera,161,281,1	script	�N���X#xmas	748,{}
prontera,150,281,7	script	�}�X#xmas	881,{}


prontera,188,177,4	script	�n�b�s�[	869,{
	switch(XMAS_3QUE) {
	case 0:
	case 1:
		emotion 28;
		mes "[�n�b�s�[]";
		mes "�E�E�c�c�V�N�V�N�c�c";
		mes "�z���O�����A�M�l���`!!";
		mes "���̒��������I�@���B������!!!!";
		mes "�N���X�}�X�������[��!!!!";
		next;
		if(XMAS_3QUE == 1) {
			mes "["+strcharinfo(0)+"]";
			mes "���́c�c���������H";
			next;
		}
		mes "[�n�b�s�[]";
		mes "�����H�@�΂������Ȃ�΂��΂���!!";
		mes "�N���𗊂��Đ��B����ӋC�n��";
		mes "�Ȃ��������I";
		mes "������A��l�Ő��X���X��";
		mes "���B�ɗ�������������!!";
		next;
		mes "[�n�b�s�[]";
		mes "�u���b�V���O�������I";
		mes "�O�����A�������I";
		mes "�J�b�v���������[!!!!";
		if(XMAS_3QUE == 0)
			close;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���́c�c";
		mes "���Ȃ����A�n�b�s�[����ł����H";
		mes "�G���W���C����";
		mes "�҂��Ă�������Ⴂ�܂��B";
		mes "�s���܂��傤!!";
		next;
		mes "[�n�b�s�[]";
		mes "�c�c�I";
		mes "���悢�掞�������̂��H";
		mes "���N�̃N���X�}�X�A���B�Ɏ��s����";
		mes "���C�͂ɂȂ��Ă������A";
		mes "���ɐ����铹�������Ă��ꂽ����";
		mes "�����Ă�ł����������̂�?!";
		next;
		mes "[�n�b�s�[]";
		mes "�悵�I�@�����̂��߂Ɉ�N�ς����񂾁I";
		mes "���h�ɃN���X�}�X���ז�����I";
		mes "���̎v���ō����܂Ŋ撣���Ă����I";
		mes "�ŁA�ǂ��ɍs���Ή��񂾁H";
		mes "�G���W���C����ɂ́H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������ł��҂��ł��B";
		mes "���͑��̒��Ԃ�";
		mes "�A�������Ă���s���܂��B";
		mes "��ɍs���Ă��������B";
		next;
		mes "[�n�b�s�[]";
		mes "�悵�I�@���������I";
		mes "���̒��Ԃ�^0000FF�����[^000000���I";
		mes "�ނɘA���𗊂ށI";
		mes "���͏�������������s���B";
		mes "��ŉ���I";
		set XMAS_3QUE,2;
		close;
	default:	//2�`6�̂Ƃ�
		mes "[�n�b�s�[]";
		mes "�F�X�ƕK�v�Ȃ��̂������񂾁B";
		mes "��N�����ď������Ă�������ȁB";
		mes "���͏�������������A�s���B";
		mes "���̒��Ԃ�^0000FF�����[^000000���I";
		mes "�ނɘA���𗊂ށI";
		close;
	}
}

prontera,62,339,3	script	�����[	875,{
	switch(XMAS_3QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�����[]";
		mes "�t�b�t�b�t�b�t�b�c�c�B";
		mes "�Ƃ��Ƃ��c�c�Ƃ��Ƃ��c�c";
		mes "�y�R�y�R�ɏ�邱�Ƃ��ł������`!!";
		mes "�v���[�X�g�A��p�[�e�B�[�Ȃ�";
		mes "�ґ�ɂ܂�Ȃ��I";
		next;
		mes "[�����[]";
		mes "���ɂ́A���̎q�������Ă�����";
		mes "�\�����I";
		mes "�t�t�t�t�t�c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���́c�c�B";
		next;
		mes "[�����[]";
		mes "�����I�@�M�l��!!";
		mes "���̃y�R�����̎����������ȁI";
		mes "�����`�A�|�������낤�H�@�y�R�����B";
		mes "���v�A���v������ˁ`�B";
		next;
		mes "[�����[]";
		mes "�G���W���C����́A";
		mes "���܂�Ă���]�E�܂œƂ�ŁA";
		mes "�͂��S�Ă������݂��������ǁA";
		mes "���ɂ͂��̃y�R����񂪂��邩��";
		mes "���v���c�c�t�t�t�b�c�c�B";
		next;
		mes "[�����[]";
		mes "�y�R�����ƃN���X�}�X�P�[�L��";
		mes "�����ĐH�ׂ邵�A";
		mes "�p�[�e�B�[�����Ă����₩�Ȃ����";
		mes "������Ƃ�邳�B";
		next;
		mes "[�����[]";
		mes "���͔߂����Ȃ��I";
		mes "�₵���Ȃ񂩂Ȃ����[!!";
		mes "�t�n�n�n�n�n�c�c�B";
		if(XMAS_3QUE < 2)
			close;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���A���́A���̃G���W���C���񂪁c�c�B";
		next;
		mes "[�����[]";
		mes "���H�@���O�A���ŃG���W���C�����";
		mes "�m���Ă���񂾁H";
		mes "���O�܂����A";
		mes "�n�b�s�[�������ė����z���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��A�����ł��B";
		mes "�n�b�s�[����Ɍ����āc�c�B";
		next;
		mes "[�����[]";
		mes "�������c�c���������̂��B";
		mes "�c�c����H�@�y�R�����B";
		mes "����Ǝ��������񂾂�B";
		next;
		mes "[�����[]";
		mes "�c�c�J�b�v��������������Ƃɑ΂���";
		mes "��������������������A";
		mes "�{���Ɋy�������̃N���X�}�X���c�c�B";
		mes "�Ƃ��Ƃ��c�c�t�t�t�c�c�B";
		next;
		mes "[�����[]";
		mes "�悵�I�@���ꂶ��A���̓y�R������";
		mes "�ꏏ�ɃG���W���C����̂Ƃ��֍s���I";
		mes "���O�͐�ɁA���̗F�B^0000FF�N���X^000000��";
		mes "���̌���`���Ă���I";
		mes "����A��łȁI";
		set XMAS_3QUE,3;
		close;
	default:	//3�`6�̂Ƃ�
		mes "[�����[]";
		mes "���̓y�R�����ƈꏏ��";
		mes "�G���W���C����̂Ƃ��֍s���I";
		mes "���O�͐�ɁA���̗F�B^0000FF�N���X^000000��";
		mes "���̌���`���Ă���I";
		mes "����A��łȁI";
		close;
	}
}

prontera,163,66,7	script	�N���X	748,{
	switch(XMAS_3QUE) {
	default:	//0�`3�̂Ƃ�
		mes "[�N���X]";
		mes "��!!�@���͂ǂ����H�@�ǂ����H";
		mes "�����`�A�����W�߂Ȃ���c�c�B";
		mes "�撣���ăn�[�u���͔|���āA";
		mes "�|�[�V�����𑢂��āA";
		mes "�\�����������ɔ����!!";
		next;
		mes "[�N���X]";
		mes "�������[�I";
		mes "�q�ɂɂ��������t�ɐς����Ă���";
		mes "��������̃n�[�u�����Ă���ƁA";
		mes "�ǂ����Ă�������t�ɂȂ��āc�c�B";
		next;
		mes "[�N���X]";
		mes "���A����Ȃ��ƌ����Ă�ꍇ����Ȃ��I";
		mes "�]�v�Ȏ����l���Ă���ɂ͂Ȃ��I";
		mes "�܂������W�߂Ȃ���c�c";
		mes "�����W�߂Ȃ��Ⴂ���Ȃ��c�c�B";
		if(XMAS_3QUE < 3)
			close;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̘b�𕷂��Ă��������I";
		mes "���Ȃ����N���X����ł����H";
		next;
		mes "[�N���X]";
		mes "�����`�H�@�N�Ȃ񂾁A�N��!!";
		mes "�c�c�͂��A���������΁A";
		mes "�N���Ƃ܂Ƃ��ɘb������̂́A";
		mes "����A����Ƃł���";
		mes "�{���ɁA�{���ɋv���Ԃ肾�c�c�B";
		next;
		mes "[�N���X]";
		mes "�����A���̂����肪���������c�c";
		mes "���A���܂����I";
		mes "�܂��]�v�Ȏ����l���Ă��܂����I";
		mes "�ǂ��āI�@���͑����̂�ɍs��!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�N���X����!!";
		mes "������Ƙb�𕷂��Ă�������!!";
		mes "�����[����Ɍ����ė��܂���!!";
		mes "�G���W���C���񂪁A";
		mes "�N���X�}�X�v����c�c�B";
		next;
		mes "[�N���X]";
		mes "��������?!�@��������ȓ����H";
		mes "�����A�������A������!!";
		mes "���N�͑��΂�����W�ߕ����āA";
		mes "���Ԃ�ׂ��Ȃ��Ă�������!!";
		next;
		mes "[�N���X]";
		mes "�G���W���C���񂪁A";
		mes "���W���߂��������񂾂��?!";
		mes "�悵�A�悵�I�@�����ɍs����!!";
		mes "���c�c�N���ꏏ�ɍs���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ɂ́A�܂����ׂ����Ƃ�����܂��B";
		mes "���̒��Ԃ����ɘA����";
		mes "���Ȃ���΂Ȃ�܂���B";
		mes "��ɃG���W���C����̂Ƃ����";
		mes "�s���Ă��������B";
		mes "���������ɍs���܂��̂ŁB";
		next;
		mes "[�N���X]";
		mes "���A�����A�����A��������ˁB";
		mes "�Ȃ�^0000FF�}�X^000000�ƌ����l��";
		mes "�Ƃ���֍s���Ă���B";
		mes "���́A��ɍs����B";
		next;
		mes "[�N���X]";
		mes "�n�n�n�c�c���Ȃ񂩁c�c";
		mes "�J�b�v���Ȃ񂩁c�c�B";
		mes "���N�͖{���ɁA";
		mes "�y�����N���X�}�X�ɂȂ肻�����c�c";
		mes "�n�n�n�n�n�c�c�B";
		set XMAS_3QUE,4;
		close;
	case 4:
	case 5:
	case 6:
		mes "[�N���X]";
		mes "^0000FF�}�X^000000�ƌ����l�̂Ƃ���֍s���Ă���B";
		mes "���́A��ɍs����B";
		next;
		mes "[�N���X]";
		mes "�n�n�n�c�c���Ȃ񂩁c�c";
		mes "�J�b�v���Ȃ񂩁c�c�B";
		mes "���N�͖{���ɁA";
		mes "�y�����N���X�}�X�ɂȂ肻�����c�c";
		mes "�n�n�n�n�n�c�c�B";
		close;
	}
}

prontera,35,209,5	script	�}�X	881,{
	switch(XMAS_3QUE) {
	default:	//0�`4�̂Ƃ�
		mes "[�}�X]";
		mes "�c�c�c�c�c�c";
		next;
		if(XMAS_3QUE == 4) {
			mes "["+strcharinfo(0)+"]";
			mes "�c�c���́c�c���������H";
			next;
		}
		emotion 23,"";
		mes "[�}�X]";
		mes "�c�c�����`�A�����̃J�v�����o�l�`!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i����A�т����肵���c�c�j";
		next;
		mes "[�}�X]";
		mes "����A���v����A�e�B�[�x�B";
		mes "�l�͎₵���Ȃ�����B";
		mes "�����Ėl�ɂ́A�M���n�[�g�������";
		mes "�o�[�X���[���o�l��";
		mes "�I�[�N���f�B���o�l�����邩��ˁB";
		mes "�q�q�b�A�q�q�q�q�b�c�c�B";
		next;
		emotion 29;
		mes "-�ނ́A�����̉E���";
		mes "�R�\�R�\�Ƙb�����A";
		mes "�j���j���Ə΂���-";
		if(XMAS_3QUE < 4)
			close;
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���́c�c�}�X����H";
		mes "���̓N���X����Ɍ����āc�c�B";
		mes "�G���W���C����̏��W���߂Łc�c�B";
		mes "�c�c���́A�����Ă�������Ⴂ�܂��H";
		next;
		mes "[�}�X]";
		mes "�c�c�����B";
		mes "�����Ă邩���H�@�e�B�[�x�B";
		mes "�Ƃ��Ƃ�����̓��������悤���B";
		mes "�n�n�n�A�n�n�n�c�c�B";
		next;
		mes "[�}�X]";
		mes "���ꂶ�Ⴀ�A�J�v�����o�l�B";
		mes "�����̊ԁA�₵���Ȃ�ł��傤���A";
		mes "�䖝���Ȃ����Ă��������B";
		mes "�����A�ʔ����N���X�}�X��";
		mes "����č����グ�܂�����B";
		mes "�����A�s�����A�e�B�[�x�B";
		next;
		mes "-�ނ͎����̉E��ɂ����₢����A";
		mes "�J�v���E���Ɉ��A�����A";
		mes "���C�Ȃ����������܂�����-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ӂ��`�A����ƑS�����������B";
		mes "��������^0000FF�Ö؂̎}^000000���W�߂Ė߂낤�I";
		mes "�t�t�t�t�t�t�c�c";
		mes "�y���J�b�v���ɓV�����c�c�B";
		set XMAS_3QUE,5;
		close;
	case 5:
	case 6:
		mes "[�}�X]";
		mes "�J�v�����o�l�A�����̊ԁA";
		mes "�₵���Ȃ�ł��傤���A";
		mes "�䖝���Ȃ����Ă��������B";
		mes "�����A�ʔ����N���X�}�X��";
		mes "����č����グ�܂�����B";
		mes "�����A�s�����A�e�B�[�x�B";
		next;
		mes "-�ނ͎����̉E��ɂ����₢����A";
		mes "�J�v���E���Ɉ��A�����A";
		mes "���C�Ȃ����������܂�����-";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ӂ��`�A����ƑS�����������B";
		mes "���������Ö؂̎}���W�߂Ė߂낤�I";
		mes "�t�t�t�t�t�t�c�c";
		mes "�y���J�b�v���ɓV�����c�c�B";
		close;
	}
}

//==============================================================
// ���C�[�[�̃T���^�X
//==============================================================
xmas_in,89,92,4	script	���C�[�[	714,{
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�˂��˂��B";
	mes "���̐Ԃ��z���̎O�p�X";
	mes "�u�T���^�̂ڂ����v�̃f�U�C������";
	mes "������ƃ_�T�C�Ǝv��Ȃ��H";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����ŁI�@�A�[�e�B�X�g�ł���";
	mes "���̃��C�[�[���A�ꔧ�E���ŁA";
	mes "���̖X�q��������f�G�ɁA";
	mes "���h�ɂ��Ă����܂��傤�`�I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���A������Ƙb�͕ς�邯�ǁA";
	mes "���̈��������A���\�j��";
	mes "����Ă���X�q�c�c����";
	mes "���̎�������Ă��������̂Ȃ̂�B";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A���\�j��߂܂��Â炢�̂́A";
	mes "�ނ̖X�q�ɓ���ȗ͂����邹���Ȃ́B";
	mes "�E�t�t�c�c�����X�q��";
	mes "������Ƃ����͂�^��������ˁB";
	next;
	emotion 3;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���āA�����̕z������ɉ߂��Ȃ�";
	mes "���ʂ́u�T���^�̂ڂ����v����������A";
	mes "���̂Ƃ��Ɏ����ė��Ă���Ȃ��H";
	mes "��������A������";
	mes "�V�����X�q������Ă�������B";
	next;
	if(countitem(2236)<1) {
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "��Łu�T���^�̂ڂ����v������΁A";
		mes "���̌����Ă��邱�Ƃ���������B";
		mes "�z�`���g���}������A";
		mes "��������������Ȃ�������͂��I";
		next;
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "���̎����V�˓I�f�U�C���Z���X��";
		mes "�������āA���̖X�q��";
		mes "�f���炵�����̂ɂ��Ă�����B";
		mes "�����Ȃ������Ă��ĂˁI";
		close;
	}
	if(select("����̂��Ƃł����H","�������܂�")==2) {
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�����`�H";
		mes "�ށ`�A�d���Ȃ���ˁB";
		mes "���`���������ɂ͂Ȃ�Ȃ��̂ɁB";
		mes "�c�c�܂��悩������A���ĂˁI";
		close;
	}
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����I�@�����A����悱��B";
	mes "����A�t���t���B�����ˁ`�B";
	mes "������������āA���������������āA";
	mes "��������������΁A����A�������ˁB";
	mes "���A���̖X�q��f�G�ɂ��邽�߂ɁA";
	mes "������ƕK�v�ȕ�������񂾂��ǁc�c�B";
	next;
	if(select("�����K�v�ł����H","��ς����Ȃ̂ŁA���������ł�")==2) {
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�����`���I";
		mes "��`���l���Ă݂āI";
		mes "����ȃ`�����X�ő��ɂȂ��̂�B";
		mes "�c�c�܂��悩������A���Ă�I";
		close;
	}
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����肪������ˁB���̎p���D����B";
	mes "���Ⴀ�A�ޗ������ǁA��{�͂���ς�";
	mes "�u�T���^�̂ڂ����v���̂��́B";
	mes "������A���̎��̍˔\�������g����";
	mes "�f���炵���A�����W���Ă������B";
	mes "������A���̖X�q�͕K�v�Ȃ����B";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����A�ޗ����������`�B";
	mes "�x�[�X�ƂȂ�^0000FF�T���^�̂ڂ���^000000��";
	mes "�X�q��҂ވׂ�^0000FF�T�{�e���̐j1��^000000�B";
	mes "�j����^����ׂ�^0000FF����10��^000000�B";
	mes "�K�^���Ăэ��ވׂ�^0000FF���U���[1��^000000�B";
	mes "���ꂾ������΁A�\���I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����ŗ��h�ɁA���̖����ɂ��ӂ��킵��";
	mes "�f���炵���X�q������Ă������B";
	next;
	if(countitem(2236)<1 || countitem(952)<1 || countitem(523)<10 || countitem(2608)<1) {
		emotion 3;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�ޗ���������΁A������";
		mes "�X�q���A�����W���Ă������I";
		mes "�����ˁ`�A���ʂɎ萔���͂���Ȃ���I";
		mes "�����C����������A�A�����傤�����B";
		close;
	}
	menu "���A����Ȃ炱���Ɂc�c",-;
	emotion 21;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�킨�I";
	mes "�����肾�������������łȂ�";
	mes "�s���͂�����̂ˁI";
	mes "�悵�A����Ȃ�A�����ɂł����B";
	mes "�A�[�e�B�X�g���C�[�[�̔\�͂�";
	mes "�ڂ̑O�łƂ��ƌ����Ă����܂��傤�`�I";
	next;
	mes "-�ޏ��́A�ޗ���S���󂯎����-";
	mes "-�����ĉ̂��������݂Ȃ���A";
	mes "�����𒍂������ɖX�q��Z���Ă�����";
	mes "���o���A����f�����قǂ���-";
	next;
	misceffect 42;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A�[�e�B�X�g���C�[�[�̎�ɂ�����΁`";
	mes "���̒��S�Ă̏j�����^������`��";
	next;
	mes "-�ޏ��́A�悭������Ȃ��n�t��";
	mes "���U���[�����ėn������-";
	mes "-�����āA�M�����̗n�t�ɂ��A";
	mes "�X�q���\�����Ă�����";
	mes "��{��{�ɁA���J�ɓh����-";
	next;
	misceffect 75;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A�[�e�B�X�g���C�[�[�̎�ɂ�����΁`";
	mes "���̒��S�Ă̍K�����^������`��";
	next;
	mes "-�T�{�e���̐j���g���āA";
	mes "�ޏ��͂��̎��̉��f�����҂݁A";
	mes "�X�q�������-";
	next;
	misceffect 91;
	emotion 3;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����̓A�[�e�B�X�g���C�[�[�̊�Ձ`";
	mes "��V�˃f�U�C�i�[�̖��́A�����I";
	mes "�A�`�e�B�X�g�A���C�`�[��`��";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����A�����I";
	mes "�ǂ��H�@�f�G�ł���H";
	mes "�v��������J�߂Ă���Ă����̂�B";
	mes "���̍�i�͑f���炵���ł���`��";
	mes "���̃f�U�C�i�[�s�G�[����";
	mes "�������Ⴄ���������̂�B";
	next;
	emotion 18;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�{���Ȃ瑽���̎萔����";
	mes "��������Ƃ��낾���ǁc�c";
	mes "�N���X�}�X���ʑ�T�[�r�X!!";
	mes "���̖X�q�𑼂̐l�ɂ�";
	mes "�����Ă�������Ă��Ƃ�";
	mes "�^�_�ɂ��܂��傤�I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�ǂ��ɍs���Ă��������ĂĂ�";
	mes "��ΐ�ΐ��!!";
	mes "���̖X�q��E���Ȃ��łˁI";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����قǑf���炵���X�q��";
	mes "�悻�ł͂����炨���������Ă�";
	mes "��ɓ�����Ȃ�����ˁI";
	mes "�����������x�Ǝ�ɂ��邱�Ƃ�";
	mes "�ł��Ȃ��A���`�������M�d��";
	mes "���󂾂����!!";
	next;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���ꂶ��A�����X�q�𑼂̐l��";
	mes "�������ɂ����Ă�����Ⴂ�`�B";
	mes "�����`�A�A�[�e�B�X�g���C�[�[�Ɂ`";
	mes "�A�����W�ł��Ȃ����̂ȂǁA";
	mes "���̐��ɂȂ��`��";
	delitem 2236,1;
	delitem 952,1;
	delitem 523,10;
	delitem 2608,1;
	getitem 5136,1;
	close;
}