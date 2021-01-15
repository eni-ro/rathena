//==============================================================================
// Ragnarok Online Arena Script     by AthenaDev
//
//   �� ARENA_PIT -> �A���[�i�|�C���g
//	TURBO_PIT -> �^�[�{�g���b�N�|�C���g
//	$ArenaName$[] -> 1�ʋL�^�҂̃L�������A�v�f�̓Z�N�V�������Ƃ�0�`4
//	$ArenaTime[]   -> �L�^�^�C���A�v�f�͓���
//==============================================================================

//==============================================================
arena_room,94,93,4	script	�x���f�S�X	97,{
	mes "[�x���f�S�X]";
	mes "�A���[�i�̐��E�ւ悤����!!";
	mes "�����ē��𖱂߂Ă���x���f�S�X�ł��B";
	next;
	mes "[�x���f�S�X]";
	mes "���₪����΂��������܂��傤�I";
	while(1) {
		next;
		switch (select("�A���[�i���āH","�A���[�i�|�C���g���āH","�A���[�i�|�C���g�̊m�F","�Ȃ�ł��Ȃ��ł�")) {
		case 1:
			mes "[�x���f�S�X]";
			mes "�A���[�i�ł�^3131FF�l��^000000��^3131FF�p�[�e�B�[��^000000��";
			mes "����A�������Ԉȓ��łǂꂾ������";
			mes "�����X�^�[��|���邩��������";
			mes "���������܂��B";
			next;
			mes "[�x���f�S�X]";
			mes "^3131FF�l��^000000��";
			mes "�@���x��50�`69";
			mes "�@���x��60�`79";
			mes "�@���x��70�`89";
			mes "�@���x��80�`99";
			mes "�̃Z�N�V�����ɕ�����Ă��܂��B";
			next;
			mes "[�x���f�S�X]";
			mes "^3131FF�p�[�e�B�[��^000000��5�l�Ґ���";
			mes "�p�[�e�B�[�Œ��킷������ł��B";
			next;
			mes "[�x���f�S�X]";
			mes "�l��ł̓��x���ʂɁA�S���҂�";
			mes "�`���b�g���[�����J�݂��Ă��҂�����";
			mes "���܂��B�`���b�g���[�����̑ҋ@����";
			mes "�A���[�i�ɒ��킷�邱�Ƃ��o���܂��B";
			break;
		case 2:
			mes "[�x���f�S�X]";
			mes "^3131FF�A���[�i�|�C���g^000000�ɂ��Ă�����";
			mes "�������܂��B";
			mes "�A���[�i�|�C���g�Ƃ�^3131FF�A���[�i��^000000";
			mes "^3131FF�N���A������^000000�ɗ^������|�C���g��";
			mes "�ő�3���|�C���g�܂Ŋl�����邱�Ƃ�";
			mes "�o���܂��B";
			next;
			mes "[�x���f�S�X]";
			mes "�N���A���Ԃ𒴉߂��Ă��A�킸���ł�";
			mes "����܂����A�Q���|�C���g���x������";
			mes "�܂��B";
			next;
			mes "[�x���f�S�X]";
			mes "�A���[�i�|�C���g�̎g�p�ɂ��Ă�";
			mes "�S���҂̃M�u�����T�����������B";
			break;
		case 3:
			mes "[�x���f�S�X]";
			mes strcharinfo(0)+ "�l��";
			mes "�A���[�i�|�C���g���m�F�������܂��B";
			next;
			mes "[�x���f�S�X]";
			mes strcharinfo(0)+ "�l��";
			mes "�A���[�i�|�C���g�́c�c";
			mes "^3131FF" +ARENA_PIT+ "^000000�_�ł�";
			next;
			mes "[�x���f�S�X]";
			mes "�A���[�i�|�C���g�̎g�p�Ɋւ��Ă�";
			mes "^3131FF�A���[�i�|�C���g���āH^000000�Ő���������";
			mes "���������Ă���܂��̂ŁA�������";
			mes "���Q�l���������B";
			break;
		case 4:
			mes "[�x���f�S�X]";
			mes "����ł͊y�����ꎞ�����߂���";
			mes "�������܂��B";
			close;
		}
		next;
		mes "[�x���f�S�X]";
		mes "���ɂȂɂ��������܂����H";
	}
}

arena_room,105,82,2	script	�A���[�i�L�^�S��	57,{
	mes "[�A�E�F���L�[�v]";
	mes "����ɂ��́B";
	mes "�A���[�i�̋L�^���Ǘ����Ă���";
	mes "�A�E�F���L�[�v�ł��B";
	next;
	mes "[�A�E�F���L�[�v]";
	mes "�e�Z�N�V�����ōŒZ���Ԃ��L�^����";
	mes "�E�m�̖��O��m�肽���̂ł����H";
	mes "����]�̃Z�N�V�����������Ă��������B";
	next;
	setarray .@sect$,"�l��LV50�`69","�l��LV60�`79","�l��LV70�`89","�l��LV80�`99","�p�[�e�B�[��";
	set .@i,select(.@sect$[0],.@sect$[1],.@sect$[2],.@sect$[3],.@sect$[4])-1;
	mes "[�A�E�F���L�[�v]";
	mes "���݁A" +.@sect$[.@i]+ "��";
	mes "^3131FF" +$ArenaName$[.@i]+ "^000000�l��";
	mes "1�ʂł��B�L�^��";
	mes "^3131FF" +$ArenaTime[.@i]/60000+"^000000��^3131FF"+$ArenaTime[.@i]%60000/1000+"^000000�b�ł��B";
	close;
}

arena_room,105,93,2	script	(��)�œ]��	55,{
	mes "[(��)�œ]��]";
	mes "�A���[�i����Ȃ���Ԃɍs�������H";
	next;
	if(select("�s��","�s���Ȃ�")==1) {
		mes "[(��)�œ]��]";
		mes "���Ⴀ���Ă��ȁB";
		close2;
		warp "prt_are_in",60,14;
		end;
	}
	mes "[(��)�œ]��]";
	mes "�C����������܂������ŁB";
	close;
}

prt_are_in,98,14,3	script	�M�u#arena	728,{
	//�ʐ^�B�e����NPC����Ԃ�
	function PhotoName {
		switch(getarg(0)) {
			case 0: return "�o�t�H���b�g";
			case 1: return "�_�[�N���[�h";
			case 2: return "�h�b�y���Q���K�[";
			case 3: return "�G�h�K";
			case 4: return "�h���L����";
			case 5: return "���앐�m";
			case 6: return "�X�g�[���i�C�g";
			case 7: return "�t���I�j";
			case 8: return "���̎q";
			case 9: return "���@���L���[";
		}
	}

	//�^�C�}�[�J�E���^�ɉ������G���[�V�����ԍ���Ԃ�
	function EmotionNumber {
		switch(getarg(0)) {
			case 0: return 3;
			case 1: return 10;
			case 2: return 21;
			case 3: return 23;
			case 4: return 29;
			case 5: return 30;
		}
	}

	mes "[�M�u]";
	mes "����ɂ��́B";
	mes "�����A�A���[�i�|�C���g�̌�����";
	mes "�S�����Ă���M�u�ł��B";
	next;
	mes "[�M�u]";
	mes "������ł́A���Ȃ����擾�����A���[�i";
	mes "�|�C���g���A�C�e���Ȃǂƌ�������";
	mes "���Ƃ��o���܂��B";
	mes "�ǂ̃T�[�r�X������]���܂����H";
	next;
	switch (select("�i�i�ƌ���","�o���l�ƌ���","�ʐ^�B�e������","�A���[�i�|�C���g���m�F")) {
	case 1:
		mes "[�M�u]";
		mes "�ǂ̌i�i�ƌ������܂����H";
		next;
		switch (select("�n�`��","���[�����[���[","�}�X�e���̎�","�z���C�g�X�����|�[�V����","�A���e�B�y�C�������g",
						"�C�O�h���V���̎�","�C�O�h���V���̎�","�A���[�i�R�C��","�Â�����","�Â����F�̔�","�Â��J�[�h��")) {
			case 1:
				set .@point,20;
				set .@amount,5;
				set .@itemid,518;
				break;
			case 2:
				set .@point,30;
				set .@amount,5;
				set .@itemid,526;
				break;
			case 3:
				set .@point,30;
				set .@amount,5;
				set .@itemid,522;
				break;
			case 4:
				set .@point,30;
				set .@amount,8;
				set .@itemid,547;
				break;
			case 5:
				set .@point,20;
				set .@amount,3;
				set .@itemid,605;
				break;
			case 6:
				set .@point,20;
				set .@amount,1;
				set .@itemid,608;
				break;
			case 7:
				set .@point,40;
				set .@amount,1;
				set .@itemid,607;
				break;
			case 8:
				set .@point,60;
				set .@amount,1;
				set .@itemid,6365;
				break;
			case 9:
				set .@point,100;
				set .@amount,1;
				set .@itemid,603;
				break;
			case 10:
				set .@point,300;
				set .@amount,1;
				set .@itemid,617;
				break;
			case 11:
				set .@point,1000;
				set .@amount,1;
				set .@itemid,616;
				break;
		}
		mes "[�M�u]";
		mes "�A���[�i�|�C���g��" +getitemname(.@itemid)+ "��";
		mes "�����ł��ˁB�������[�g��";
		mes "^3131FF" +.@point+ "�|�C���g��" +getitemname(.@itemid) + .@amount+ "��^000000�ł��B";
		mes "����������0���A�����łȂ����";
		mes "^3131FF����^000000�������邩�����Ă��������B";
		next;
		input .@num;
		if(.@num==0) {
			mes "[�M�u]";
			mes "�������܂����B";
			close;
		}
		if(.@num<0) {
			mes "[�M�u]";
			mes "�����������Ȃ��悤�ł��B";
			close;
		}
		if(ARENA_PIT < .@point*.@num) {
			mes "[�M�u]";
			mes "�A���[�i�|�C���g���s�����Ă��܂��B";
			mes "���L�|�C���g�����m�F���Ă��������B";
			close;
		}
		getitem .@itemid,.@num*.@amount;
		set ARENA_PIT,ARENA_PIT - .@point*.@num;
		mes "[�M�u]";
		mes "�����p�A���肪�Ƃ��������܂����B";
		close;
	case 2:
		mes "[�M�u]";
		mes "�A���[�i�|�C���g���o���l��";
		mes "���Z�ł��ˁB���Z�ɂ�";
		mes "40�|�C���g���K�v�ƂȂ�܂��B";
		next;
		if(select("���Ȃ�","����")==1) {
			mes "[�M�u]";
			mes "�������܂����B";
			close;
		}
		if(ARENA_PIT < 40) {
			mes "[�M�u]";
			mes "�A���[�i�|�C���g���s�����Ă��܂��B";
			mes "���L�|�C���g�����m�F���Ă��������B";
			close;
		}
		if(BaseLevel >= 90) 			getexp 30000,0;
		if(BaseLevel >= 80 && BaseLevel < 90) 	getexp 10000,0;
		if(BaseLevel >= 70 && BaseLevel < 80) 	getexp 9000,0;
		if(BaseLevel < 70) 			getexp 3000,0;
		set ARENA_PIT,ARENA_PIT-40;
		mes "[�M�u]";
		mes "�A���[�i�|�C���g���o���l��";
		mes "���Z�������܂����B";
		close;
	case 3:
		mes "[�M�u]";
		mes "�ʐ^�B�e������]�ł��ˁB";
		next;
		if(select("�ʐ^�B�e���āH","�ʐ^�B�e����")==1) {
			mes "[�M�u]";
			mes "���̉E�ɊK�i������̂������܂����H";
			next;
			mes "[�M�u]";
			mes "���̊K�i�ɁA����]��NPC�����Ă�";
			mes "���܂��̂ŁA1���ԁA�����R��";
			mes "�X�N���[���V���b�g�@�\���g����";
			mes "�B�e���y����ł��������B";
			next;
			mes "[�M�u]";
			mes "�B�e���ANPC���G���[�V�������o����";
			mes "����܂��̂ŁA����^�C�~���O��";
			mes "���킹�L�O�B�e���Ă݂Ă��������B";
			close;
		}
		if(.flag) {
			mes "[�M�u]";
			mes "�ʐ^�B�e���ł��B���X���҂����������B";
			close;
		}
		mes "[�M�u]";
		mes "�ꏏ�ɎB�e������NPC��I�����������B";
		mes "NPC��1���ԌĂяo���̂ɁA10�A���[�i";
		mes "�|�C���g���K�v�ƂȂ�܂��B";
		next;
		set .@i,select("�o�t�H���b�g","�_�[�N���[�h","�h�b�y���Q���K�[","�G�h�K","�h���L����",
							"���앐�m","�X�g�[���i�C�g","�t���I�j","���̎q","���@���L���[")-1;
		mes "[�M�u]";
		if(ARENA_PIT < 10) {
			mes "�A���[�i�|�C���g���s�����Ă��܂��B";
			mes "���L�|�C���g�����m�F���Ă��������B";
			close;
		}
		if(.@i==8)
			mes "�������̎q�B�����Ăт��܂����H";
		else
			mes PhotoName(.@i)+ "�����Ăт��܂����H";
		next;
		if(select("����","��߂Ă���")==2) {
			mes "[�M�u]";
			mes "�����������l���ɂȂ�܂����H";
			close;
		}
		if(.flag) {	//����1��d���`�F�b�N
			mes "[�M�u]";
			mes "�ʐ^�B�e���ł��B���X���҂����������B";
			close;
		}
		set ARENA_PIT,ARENA_PIT-10;
		set .flag,1;
		set .i,.@i;	//�ʐ^�B�e�\�Ȃ�I��ԍ����X�N���v�g�ˑ��ϐ��ֈڂ��ւ��I
		if(.@i==8) {
			hideoffnpc "���̎q#arena1";
			hideoffnpc "���̎q#arena2";
			hideoffnpc "���̎q#arena3";
			hideoffnpc "���̎q#arena4";
		}
		else
			hideoffnpc PhotoName(.@i)+ "#arena";
		set .count,0;
		donpcevent "�M�u#arena::OnStart";	//�X�N���v�g�ˑ��ϐ��ɗ���̂ł���NPC�����őS����������I
		mes "[�M�u]";
		if(.@i==8)
			mes "�������̎q�B�����Ăт��܂����B";
		else
			mes PhotoName(.@i)+ "�����Ăт��܂����B";
		close;
	case 4:
		mes "[�M�u]";
		mes strcharinfo(0)+ "�l��";
		mes "�A���[�i�|�C���g���m�F�������܂��B";
		next;
		mes "[�M�u]";
		mes strcharinfo(0)+ "�l��";
		mes "�A���[�i�|�C���g��";
		mes "^3131FF" +ARENA_PIT+ "^000000�_�ł�";
		close;
	}
OnStart:
	sleep 2000;
	announce "�M�u : �^�C�~���O�����킹�ăG���[�V�������o���Ă������`��",9,0xFFCE00;
	initnpctimer;
	end;
OnTimer5000:
	switch(.count) {	//�^�C�}�[���[�v�J�E���^
	case 0:
		announce "�G���[�V���� : /�n�[�g �ł��肢���܂�",9,0xFFCE00;
		break;
	case 1:
		announce "�G���[�V���� : �`���L(CTRL+�|) �ł��肢���܂�",9,0xFFCE00;
		break;
	case 2:
		announce "�G���[�V���� : /�ō� �ł��肢���܂�",9,0xFFCE00;
		break;
	case 3:
		announce "�G���[�V���� : /�V���b�N�ł��肢���܂�",9,0xFFCE00;
		break;
	case 4:
		announce "�G���[�V���� : /�������� �ł��肢���܂�",9,0xFFCE00;
		break;
	case 5:
		announce "�G���[�V���� : /���� �ł��肢���܂�",9,0xFFCE00;
		break;
	case 6:
		announce "�ʐ^�B�e�I���ł��B�����p���肪�Ƃ��������܂����B",9,0xFFCE00;
		if(.i==8) {
			hideonnpc "���̎q#arena1";
			hideonnpc "���̎q#arena2";
			hideonnpc "���̎q#arena3";
			hideonnpc "���̎q#arena4";
		}
		else
			hideonnpc PhotoName(.i)+"#arena";
		set .flag,0;
		stopnpctimer;
		break;
	}
	end;
OnTimer7000:
	announce "3",9,0xFFCE00;
	sleep 1000;
	announce "2",9,0xFFCE00;
	sleep 1000;
	announce "1",9,0xFFCE00;
	sleep 1000;
	//���[�v��.count���ɃG���[�V�����ς��
	if(.i==8) {
		emotion EmotionNumber(.count),"���̎q#arena1";
		emotion EmotionNumber(.count),"���̎q#arena2";
		emotion EmotionNumber(.count),"���̎q#arena3";
		emotion EmotionNumber(.count),"���̎q#arena4";
	}
	else
		emotion EmotionNumber(.count),PhotoName(.i)+"#arena";
	set .count,.count+1;
	initnpctimer;	//�Ďn��
	end;
OnInit:
	for(set .@j,0; .@j<10; set .@j,.@j+1) {
		if(.@j==8) {
			hideonnpc "���̎q#arena1";
			hideonnpc "���̎q#arena2";
			hideonnpc "���̎q#arena3";
			hideonnpc "���̎q#arena4";
		}
		else
			hideonnpc PhotoName(.@j)+"#arena";
	}
	end;
}

prt_are_in,96,28,4	script	�o�t�H���b�g#arena	736,{}
prt_are_in,96,28,4	script	�_�[�N���[�h#arena	737,{}
prt_are_in,96,28,4	script	�h�b�y���Q���K�[#arena	739,{}
prt_are_in,96,28,4	script	�G�h�K#arena		1115,{}
prt_are_in,96,28,4	script	�h���L����#arena	1389,{}
prt_are_in,96,28,4	script	���앐�m#arena		1492,{}
prt_are_in,96,28,4	script	�X�g�[���i�C�g#arena	1251,{}
prt_are_in,96,28,4	script	�t���I�j#arena		1159,{}
prt_are_in,94,26,4	script	���̎q#arena1		714,{}
prt_are_in,96,28,4	script	���̎q#arena2		714,{}
prt_are_in,100,28,4	script	���̎q#arena3		714,{}
prt_are_in,102,26,4	script	���̎q#arena4		714,{}
prt_are_in,96,28,4	script	���@���L���[#arena	811,{}


prt_are_in,103,11,3	script	�|�C���g�Ǘ��l	732,{
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes "���y���݂��������܂����ł��傤���H";
	mes "������ł́c�c";
	mes "�A���f�o������^3131FF�^�[�{�g���b�N^000000��";
	mes "�C�Y���[�h��^FF0000�^�C���o�g���A���[�i^000000��";
	mes "�|�C���g���������邱�Ƃ��ł��܂��B";
	mes "�������]�݂ł����H";
	next;
	set @menu,select("�|�C���g�̊m�F","�A���[�i�|�C���g�Ƃ̌���");
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes strcharinfo(0)+ "�l��";
	mes "�|�C���g�͎��̒ʂ�ł��B";
	mes "�^�[�{�g���b�N�|�C���g�F" +TURBO_PIT+ "�_";
	mes "�A���[�i�|�C���g�F" +ARENA_PIT+ "�_";
	next;
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes "�^�[�{�g���b�N�|�C���g��";
	mes "�A���[�i�|�C���g��";
	mes "�������邱�Ƃ͂ł��܂��B";
	if(@menu==1) {
		mes "�|�C���g���p�̂��Q�l��";
		mes "���Ă���������΂Ǝv���܂��B";
		close;
	}
	next;
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes "���̍ۂ̌����䗦��";
	mes "�u�^�[�{�g���b�N�F�A���[�i���Q:�P�v";
	mes "�ƂȂ�܂��B�܂�c�c";
	mes "10�_�̃^�[�{�g���b�N�|�C���g��";
	mes "5�_�̃A���[�i�|�C���g��";
	mes "�������邱�Ƃ��ł��܂��B";
	next;
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes "�������@�����I�т��������B�A���A";
	mes "10�_�ȏ�̃|�C���g�����Ɋւ��Ă�";
	mes "^4A4AFF10�_�P�ʂ̌������c�c";
	mes "�܂�A�{��^000000����͂��Ă��������B";
	next;
	switch (select("�^�[�{�g���b�N 2�_ -> �A���[�i 1�_","�^�[�{�g���b�N 4�_ -> �A���[�i 2�_","�^�[�{�g���b�N 6�_ -> �A���[�i 3�_",
							"�^�[�{�g���b�N 8�_ -> �A���[�i 4�_","�^�[�{�g���b�N 10�_�P�ʂŌ���","������")) {
	default:
		set .@point,@menu*2;
		break;
	case 5:
		mes "[�A���[�i�|�C���g�K�C�h]";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "�A���[�i�|�C���g��";
		mes "^4A4AFF10�_�P�ʂŌ���^000000���܂��B";
		mes "^4A4AFF��x�Ɍ����ł���";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "10�_��20�{�A200�_�܂�^000000�ł��B";
		next;
		mes "[�A���[�i�|�C���g�K�C�h]";
		mes "�ł́A�^�[�{�g���b�N�|�C���g��";
		mes "10�_�̉��{�A�A���[�i�|�C���g��";
		mes "�������邩����͂��Ă��������B";
		mes "�������ꍇ�́u0�v��";
		mes "���͂��Ă��������B";
		next;
		input .@num;
		if(.@num == 0) {
			mes "[�A���[�i�|�C���g�K�C�h]";
			mes "�������܂����B";
			close;
		}
		if(.@num<0 || .@num>20) {
			mes "[�A���[�i�|�C���g�K�C�h]";
			mes "�����\�͈͂𒴂��Ă��܂��B";
			mes "��x�Ɍ����ł���";
			mes "�^�[�{�g���b�N�|�C���g��";
			mes "10�_��20�{�܂łł��B";
			close;
		}
		set .@point,.@num*10;
		break;
	case 6:
		mes "[�A���[�i�|�C���g�K�C�h]";
		mes "�������܂����B";
		close;
	}
	if(TURBO_PIT < .@point) {
		mes "[�A���[�i�|�C���g�K�C�h]";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "����܂���B";
		mes "�^�[�{�g���b�N�|�C���g�́A";
		mes .@point+ "�_�ȏ�K�v�ł��B";
		mes "�^�[�{�g���b�N�|�C���g��";
		mes "�ēx���m�F���������B";
		close;
	}
	set ARENA_PIT,ARENA_PIT+.@point/2;
	set TURBO_PIT,TURBO_PIT-.@point;
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes strcharinfo(0)+ "�l��";
	mes "�^�[�{�g���b�N�|�C���g" +.@point+ "�_��";
	mes "�A���[�i�|�C���g" +.@point/2+ "�_��";
	mes "�������܂����B";
	next;
	mes "[�A���[�i�|�C���g�K�C�h]";
	mes strcharinfo(0)+ "�l��";
	mes "�|�C���g�͎��̒ʂ�ɂȂ�܂��B";
	mes "�^�[�{�g���b�N�|�C���g�F" +TURBO_PIT+ "�_";
	mes "�A���[�i�|�C���g�F" +ARENA_PIT+ "�_";
	mes "�����p�������肪�Ƃ��������܂����B";
	close;
}


//==============================================================
// Function
//callfunc "ArenaAnnounce","ArenaSection",LimitTime;
function	script	ArenaAnnounce	{
	sleep 2000;
	announce strnpcinfo(1)+ ": ����ɂ��́B�^�C���A�^�b�N�o�g���A" +getarg(0)+ "�Z�N�V�����i��ҁA" +strnpcinfo(1)+ "�ł��I",9;
	sleep 1000;
	announce strnpcinfo(1)+ ": ���Ԃ��ǂ��ߖ񂷂邩�����s�̃R�c�ł��B�T�d�ɁI",9;
	sleep 1000;
	announce strnpcinfo(1)+ ": �S�[���ւ͎��v���ɐi��ł��������B�܂��A�����̓�������J�n���܂��B�������Ԃ�" +getarg(1)+ "���Ԃł��B�ł́AGOOD LUCK!!",9;
	return;
}

//callfunc "ArenaKilled",LvNumber,NextStage,"NpcName",.mob;
function	script	ArenaKilled	{
	set getarg(3),getarg(3)-1;	//.mob�J�E���^��1���炷
	if(getarg(3) <= 0) {
		killmonsterall "this";
		enablenpc "Arena"+getarg(0)+"warp#"+getarg(1);
		switch(getarg(1)) {
		case 2:
		case 3:
			announce getarg(2)+ ": �k�����̃h�A���J���܂����I",9;
			break;
		case 4:
			announce getarg(2)+ ": �N���A�I�������̃h�A���J���܂����I",9;
			break;
		case 5:
			announce getarg(2)+ ": �������̃h�A���J���܂����I",9;
			break;
		case 6:
			announce getarg(2)+ ": �N���A�I�암���̃h�A���J���܂����I",9;
			break;
		case 7:
			announce getarg(2)+ ": �암���̃h�A���J���܂����I",9;
			break;
		case 8:
			announce getarg(2)+ ": �N���A�I�������̃h�A���J���܂����I",9;
			break;
		case 10:
			announce getarg(2)+ ": �N���A!! �k�o�����J���܂����B�����l�ł����I",9;
			break;
		}
	}
	return;
}

//callfunc "ArenaClear",ArenaLevel,RoomNumber,"ArenaSection";
function	script	ArenaClear	{
	mes "[�i�s�v��]";
	mes "�����l�ł����B";
	mes "�����O�́c�c";
	mes "^3131FF" +strcharinfo(0)+ "^000000�l�ł��ˁH";
	mes "^3131FF" +strcharinfo(0)+ "^000000�l��";
	mes "�A���[�i���N���A����̂ɂ�������";
	mes "���Ԃ́c�c";
	next;
	mes "[�i�s�v��]";
	set .@time,getvariableofnpc(.time,"ArenaStage"+getarg(0));
	mes .@time/60000+ "��" +.@time%60000/1000+ "�b�ł��I";
	if(.@time <= $ArenaTime[getarg(0)] || $ArenaTime[getarg(0)] == 0) {	//�ō��L�^����
		next;
		mes "[�i�s�v��]";
		mes "�E�I�I�b!!�@�V�L�^�[�[�[!!";
		mes "���߂łƂ��������܂�!!!!";
		next;
		mes "[�i�s�v��]";
		mes "^FF0000�^�C���A�^�b�N";
		mes getarg(2)+ "�Z�N�V����^000000�ɂ��Ȃ���";
		mes "���O^3131FF" +strcharinfo(0)+ "^000000��";
		mes "�L�^�������܂��B";
		next;
		mes "[�i�s�v��]";
		mes "�A���[�i�̋L�^�̊m�F��";
		mes "�A���[�i�T����^3131FF�A�E�F���L�[�v^000000��";
		mes "���₢���킹���������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł̓A���[�i�|�C���g��";
		mes "�x���������܂��B�V�L�^�B��";
		mes "�ł��̂ŁA�{�[�i�X�|�C���g��";
		mes "�x���������܂��B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�����ɂ����肵�܂��傤�B";
		mes "����ꂳ�܂ł����`�B�܂���";
		mes "���z�������҂����Ă���܂��B";
		close2;
		set $ArenaName$[getarg(0)],strcharinfo(0);
		set $ArenaTime[getarg(0)],.@time;
		set ARENA_PIT,ARENA_PIT+60;
	}
	else {
		mes "���߂łƂ��������܂�!!";
		next;
		mes "[�i�s�v��]";
		mes "���݁A�^�C���A�^�b�N";
		mes getarg(2)+ "�Z�N�V��������ԑ���";
		mes "�N���A�����l�́c�c";
		mes "^3131FF" +$ArenaName$[getarg(0)]+ "^000000�l�ł��B";
		next;
		mes "[�i�s�v��]";
		mes "^3131FF" +$ArenaName$[getarg(0)]+ "^000000�l��";
		mes "�^�C����^3131FF" +$ArenaTime[getarg(0)]/60000+ "^000000��^3131FF" +$ArenaTime[getarg(0)]%60000/1000+ "^000000�b�ł��B";
		next;
		mes "[�i�s�v��]";
		mes "�L�^�X�V�͐����܂���ł������A";
		mes "���̋@��ɂ͐��񐬌������Ă��������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�A���[�i�|�C���g��";
		mes "�x���������܂��B";
		mes "�A���[�i�|�C���g�̊m�F��";
		mes "�A���[�i�T����^3131FF�x���f�S�X^000000��";
		mes "���₢���킹���������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�����ɂ����肵�܂��傤�B";
		mes "����ꂳ�܂ł����`�B�܂���";
		mes "���z�������҂����Ă���܂��B";
		close2;
		set ARENA_PIT,ARENA_PIT+20;
	}
	stopnpctimer "ArenaStage" +getarg(0);
	enablewaitingroomevent "[LV " +getarg(1)+ "]�T��#arena";
	warp "arena_room",100,75;
	return;
}


//==============================================================================
// �l�� LV50�`69
//==============================================================================
arena_room,68,135,3	script	�R���p�j�I�� �y�c	726,{
	mes "[�y�c]";
	mes "����ɂ��́`";
	mes "�l��LV50�`69�Z�N�V������";
	mes "�R���p�j�I���A�y�c�ł��B";
	next;
	mes "[�y�c]";
	mes "^3131FF�l��LV50�`69^000000�Z�N�V������";
	mes "^FF0000���x��50^000000����^FF0000���x��69^000000�܂œ���";
	mes "�ł��܂��B";
	next;
	mes "[�y�c]";
	mes "�����x���v���C���[��������背�x����";
	mes "�Ⴂ�A���[�i�Ń����L���O�l������̂�";
	mes "�h�~���邽�߁A������݂��Ă���܂��B";
	next;
	mes "[�y�c]";
	mes "�l��Q������1000z�ł��B";
	next;
	mes "[�y�c]";
	mes "����ł́A�A���[�i�i�s���@�Ɋւ���";
	mes "���ē��������܂��B";
	next;
	mes "[�y�c]";
	mes "�Q���T���ƂȂ�^3131FF�`���b�g���[���̒���";
	mes "�����̏��Ԃ����҂����������B^000000";
	mes "�����̏��ɂȂ�΃A���[�i���֎����I��";
	mes "�ړ��ƂȂ�܂��B";
	next;
	mes "[�y�c]";
	mes "�A���[�i����Ɠ����ɃJ�E���g�_�E����";
	mes "�n�܂�܂��B";
	mes "^3131FF�q���g^000000���N���A�������o�肵�܂��̂�";
	mes "�����ɏ]���ăN���A��ڎw���ĉ�����";
	next;
	mes "[�y�c]";
	mes "�������Ԃ�^3131FF5��^000000�ł��̂ōQ�Ă�";
	mes "���v���ɍs�����邱�Ƃ�������";
	mes "�������܂��B";
	next;
	mes "[�y�c]";
	mes "�Ō�̃{�X���[�����N���A�����";
	mes "^3131FF�I���T��^000000�Ɉړ��ƂȂ�܂��B";
	mes "^3131FF�I���T��^000000�ɂ�1�����������܂���̂�";
	mes "�S���҂���A���[�i�|�C���g����������";
	mes "�đf�����O�ɏo�Ă��������B";
	next;
	mes "[�y�c]";
	mes "�I���T���ŃA���[�i�|�C���g���󂯎��";
	mes "���Ƃ��ł��Ȃ������ꍇ�A�A���[�i";
	mes "�|�C���g�̕⏞�͍s���Ă���܂���̂�";
	mes "���ꂮ��������ӂ��������I";
	next;
	mes "[�y�c]";
	mes "�ȏ�A�l��LV50�`69�ɂ��Ăł����B";
	mes "����A���[�i�ɂ��Q�����������܂��`�B";
	close;
}

arena_room,64,138,5	script	[LV 50]�T��#arena	124,{
	end;
OnInit:
	waitingroom "�l�� LV50�`69",20,"[LV 50]�T��#arena::OnStart",1,1000,50,69;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			killmonsterall "force_1-1";
			donpcevent "�q���g#arena::OnStart";
			warp "force_1-1",100,12;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

force_1-1,99,20,3	script	�q���g#arena	124,{
	end;
OnStart:
	set .count,5;
	enablenpc "Arena0warp#1";
	disablenpc "Arena0warp#9";
	initnpctimer;
	callfunc "ArenaAnnounce","LV50�`69",5;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
	set .count,.count-1;
	if(.count)
		announce "�q���g: �c�莞�� : " +.count+ " ��",9;
	else
		announce "�q���g: ���Ԑ؂�ł��B�c�O�I",9;
	end;
OnTimer305000:
	stopnpctimer;
	areawarp "force_1-1",0,0,200,200,"prt_are_in",126,192;
	enablewaitingroomevent "[LV 50]�T��#arena";
	end;
}

force_1-1,0,0,0	script	ArenaStage0	-1,{
OnSummon1:
	set .mob,5;
	disablenpc "Arena0warp#2";
	monster "force_1-1",25,25,"�X���[�L�[",1561,1,"ArenaStage0::OnKilled1";
	monster "force_1-1",18,25,"�X���[�L�[",1561,1,"ArenaStage0::OnKilled1";
	monster "force_1-1",32,25,"�X���[�L�[",1561,1,"ArenaStage0::OnKilled1";
	monster "force_1-1",25,32,"�X���[�L�[",1561,1,"ArenaStage0::OnKilled1";
	monster "force_1-1",25,18,"�X���[�L�[",1561,1,"ArenaStage0::OnKilled1";
	monster "force_1-1",25,26,"�h���b�v�X",1572,1;
	monster "force_1-1",15,25,"�h���b�v�X",1572,1;
	monster "force_1-1",30,25,"�h���b�v�X",1572,1;
	monster "force_1-1",25,31,"�h���b�v�X",1572,1;
	monster "force_1-1",24,19,"�h���b�v�X",1572,1;
	monster "force_1-1",25,28,"�h���b�v�X",1572,1;
	monster "force_1-1",18,23,"�h���b�v�X",1572,1;
	monster "force_1-1",24,25,"�h���b�v�X",1572,1;
	monster "force_1-1",23,18,"�h���b�v�X",1572,1;
	monster "force_1-1",20,18,"�h���b�v�X",1572,1;
	monster "force_1-1",35,31,"�q�h��",1579,1;
	monster "force_1-1",35,28,"�q�h��",1579,1;
	monster "force_1-1",35,25,"�q�h��",1579,1;
	monster "force_1-1",35,21,"�q�h��",1579,1;
	monster "force_1-1",26,16,"����^",1556,1;
	monster "force_1-1",26,15,"����^",1556,1;
	monster "force_1-1",26,14,"����^",1556,1;
	monster "force_1-1",23,17,"����^",1556,1;
	monster "force_1-1",23,18,"����^",1556,1;
	monster "force_1-1",23,19,"����^",1556,1;
	monster "force_1-1",29,20,"����^",1556,1;
	monster "force_1-1",23,16,"����^",1556,1;
	monster "force_1-1",19,16,"����^",1556,1;
	monster "force_1-1",32,19,"����^",1556,1;
	sleep 500;
	announce "�q���g: �N���A���� : �X���[�L�[��S�đގ����Ă�������",9;
	end;
OnKilled1:
	callfunc "ArenaKilled",0,2,"�q���g",.mob;
	end;
OnSummon2:
	monster "force_1-1",24,76,"�t�@�~���A�[",1419,1;
	monster "force_1-1",28,76,"�t�@�~���A�[",1419,1;
	monster "force_1-1",24,86,"�t�@�~���A�[",1419,1;
	monster "force_1-1",26,86,"�O�[��",1423,1;
	monster "force_1-1",25,100,"�O�[��",1423,1;
	monster "force_1-1",26,118,"�O�[��",1423,1;
	monster "force_1-1",28,79,"�}�~�[",1393,1;
	monster "force_1-1",23,87,"�}�~�[",1393,1;
	monster "force_1-1",28,99,"�}�~�[",1393,1;
	monster "force_1-1",23,112,"�}�~�[",1393,1;
	monster "force_1-1",28,128,"�}�~�[",1393,1;
	sleep 500;
	announce "�q���g: �N���A���� : �����X�^�[������Ėk�o������E�o���Ă��������I",9;
	end;
OnSummon3:
	set .mob,5;
	disablenpc "Arena0warp#4";
	monster "force_1-1",23,174,"�J���P",1544,1,"ArenaStage0::OnKilled3";
	monster "force_1-1",18,173,"�J���P",1544,1,"ArenaStage0::OnKilled3";
	monster "force_1-1",33,173,"�J���P",1544,1,"ArenaStage0::OnKilled3";
	monster "force_1-1",26,181,"�J���P",1544,1,"ArenaStage0::OnKilled3";
	monster "force_1-1",26,166,"�J���P",1544,1,"ArenaStage0::OnKilled3";
	monster "force_1-1",26,173,"�q�h��",1579,1;
	monster "force_1-1",21,173,"�q�h��",1579,1;
	monster "force_1-1",31,173,"�q�h��",1579,1;
	monster "force_1-1",26,186,"�}���X",1551,1;
	monster "force_1-1",26,161,"�}���X",1551,1;
	monster "force_1-1",13,173,"�}���X",1551,1;
	monster "force_1-1",38,173,"�}���X",1551,1;
	monster "force_1-1",29,174,"�}���X",1551,1;
	sleep 500;
	announce "�q���g: �N���A���� : �J���P��S�đގ����Ă�������",9;
	end;
OnKilled3:
	callfunc "ArenaKilled",0,4,"�q���g",.mob;
	end;
OnSummon4:
	set .mob,3;
	disablenpc "Arena0warp#5";
	monster "force_1-1",85,172,"�R�{���h",1546,1,"ArenaStage0::OnKilled4";
	monster "force_1-1",95,172,"�R�{���h",1546,1,"ArenaStage0::OnKilled4";
	monster "force_1-1",120,172,"�R�{���h",1545,1,"ArenaStage0::OnKilled4";
	monster "force_1-1",99,174,"�t�@�~���A�[",1419,1;
	monster "force_1-1",103,174,"�t�@�~���A�[",1419,1;
	monster "force_1-1",107,174,"�t�@�~���A�[",1419,1;
	monster "force_1-1",111,176,"�t�@�~���A�[",1419,1;
	monster "force_1-1",115,176,"�t�@�~���A�[",1419,1;
	monster "force_1-1",119,172,"�t�@�~���A�[",1419,1;
	monster "force_1-1",95,178,"�t�@�~���A�[",1419,1;
	monster "force_1-1",100,178,"�t�@�~���A�[",1419,1;
	monster "force_1-1",105,172,"�t�@�~���A�[",1419,1;
	monster "force_1-1",110,172,"�t���[��",1575,1;
	monster "force_1-1",115,172,"�t���[��",1575,1;
	monster "force_1-1",120,172,"�t���[��",1575,1;
	monster "force_1-1",125,172,"�t���[��",1575,1;
	monster "force_1-1",105,178,"�t���[��",1575,1;
	sleep 500;
	announce "�q���g: �N���A���� : �R�{���h��S�đގ����Ă�������",9;
	end;
OnKilled4:
	callfunc "ArenaKilled",0,5,"�q���g",.mob;
	end;
OnSummon5:
	set .mob,6;
	disablenpc "Arena0warp#6";
	monster "force_1-1",173,166,"�q�h��",1579,1,"ArenaStage0::OnKilled5";
	monster "force_1-1",171,170,"�q�h��",1579,1,"ArenaStage0::OnKilled5";
	monster "force_1-1",177,170,"�q�h��",1579,1,"ArenaStage0::OnKilled5";
	monster "force_1-1",183,173,"�I�[�N���f�B",1452,1,"ArenaStage0::OnKilled5";
	monster "force_1-1",173,173,"�I�[�N���f�B",1452,1,"ArenaStage0::OnKilled5";
	monster "force_1-1",181,173,"�S�[����",1540,1,"ArenaStage0::OnKilled5";
//	monster "force_1-1",171,177,"�S�[����",1540,1,"ArenaStage0::OnKilled5";
	sleep 500;
	announce "�q���g: �N���A���� : �ŏ����炢�郂���X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled5:
	if(rand(2))
		monster "force_1-1",174,174,"�f�U�[�g�E���t",1432,1;
	else
		monster "force_1-1",173,173,"�[����",1470,1;
	callfunc "ArenaKilled",0,6,"�q���g",.mob;
	end;
OnSummon6:
	set .mob,5;
	disablenpc "Arena0warp#7";
	monster "force_1-1",173,90,"�h���b�v�X",1572,1,"ArenaStage0::OnKilled6";
	monster "force_1-1",173,79,"�h���b�v�X",1572,1,"ArenaStage0::OnKilled6";
	monster "force_1-1",172,70,"�h���b�v�X",1572,1,"ArenaStage0::OnKilled6";
	monster "force_1-1",175,70,"�h���b�v�X",1572,1,"ArenaStage0::OnKilled6";
	monster "force_1-1",171,118,"�h���b�v�X",1572,1,"ArenaStage0::OnKilled6";
	monster "force_1-1",173,118,"�X���[�L�[",1561,1;
	monster "force_1-1",173,108,"�X���[�L�[",1561,1;
	monster "force_1-1",173,99,"�X���[�L�[",1561,1;
	monster "force_1-1",171,108,"�S�[����",1540,1;
	monster "force_1-1",171,99,"�X�P�����[�J�[",1469,1;
	monster "force_1-1",171,85,"�X�P�����[�J�[",1469,1;
	monster "force_1-1",171,90,"�S�[����",1540,1;
	monster "force_1-1",171,79,"�X�R�[�s�I��",1559,1;
	monster "force_1-1",175,118,"�X�R�[�s�I��",1559,1;
	monster "force_1-1",175,108,"�T���h�}��",1558,1;
	monster "force_1-1",175,99,"�T���h�}��",1558,1;
	sleep 500;
	announce "�q���g: �N���A���� : �h���b�v�X��S�đގ����Ă�������",9;
	end;
OnKilled6:
	callfunc "ArenaKilled",0,7,"�q���g",.mob;
	end;
OnSummon7:
	set .mob,1;
	disablenpc "Arena0warp#8";
	monster "force_1-1",174,25,"�Ԃ���",1078,1,"ArenaStage0::OnKilled7";
	monster "force_1-1",163,36,"�q�h��",1579,1;
	monster "force_1-1",167,36,"�q�h��",1579,1;
	monster "force_1-1",171,36,"�q�h��",1579,1;
	monster "force_1-1",175,36,"�q�h��",1579,1;
	monster "force_1-1",179,36,"�q�h��",1579,1;
	monster "force_1-1",183,36,"�q�h��",1579,1;
	monster "force_1-1",183,32,"�q�h��",1579,1;
	monster "force_1-1",183,28,"�q�h��",1579,1;
	monster "force_1-1",183,24,"�q�h��",1579,1;
	monster "force_1-1",183,20,"�q�h��",1579,1;
	monster "force_1-1",183,16,"�q�h��",1579,1;
	monster "force_1-1",179,16,"�q�h��",1579,1;
	monster "force_1-1",175,16,"�q�h��",1579,1;
	monster "force_1-1",171,16,"�q�h��",1579,1;
	monster "force_1-1",167,16,"�q�h��",1579,1;
	monster "force_1-1",163,16,"�q�h��",1579,1;
	monster "force_1-1",163,20,"�q�h��",1579,1;
	monster "force_1-1",163,24,"�q�h��",1579,1;
	monster "force_1-1",163,28,"�q�h��",1579,1;
	monster "force_1-1",163,32,"�q�h��",1579,1;
	monster "force_1-1",163,31,"�p���N",1481,1;
	monster "force_1-1",163,23,"�p���N",1481,1;
	sleep 500;
	announce "�q���g: �N���A���� : �q�h���̍U��������Ȃ���A�����̐Ԃ������쏜���Ă�������",9;
	end;
OnKilled7:
	callfunc "ArenaKilled",0,8,"�q���g",.mob;
	end;
OnSummon8:
	disablenpc "Arena0warp#1";
	enablenpc "Arena0warp#9";
	sleep 500;
	announce "�q���g: �k�o������E�o���Ă��������I",9;
	end;
OnSummon9:
	set .mob,1;
	disablenpc "Arena0warp#10";
	monster "force_1-1",99,99,"�{�[�J��",1581,1,"ArenaStage0::OnKilled9";
	monster "force_1-1",110,110,"�t�@�~���A�[",1419,1;
	monster "force_1-1",89,110,"�t�@�~���A�[",1419,1;
	monster "force_1-1",89,89,"�t�@�~���A�[",1419,1;
	monster "force_1-1",110,89,"�t�@�~���A�[",1419,1;
	monster "force_1-1",105,105,"�t�@�~���A�[",1419,1;
	monster "force_1-1",94,105,"�t�@�~���A�[",1419,1;
	monster "force_1-1",94,94,"�t�@�~���A�[",1419,1;
	monster "force_1-1",110,110,"�t�@�~���A�[",1419,1;
	monster "force_1-1",89,110,"�t�@�~���A�[",1419,1;
	monster "force_1-1",89,89,"�t�@�~���A�[",1419,1;
	monster "force_1-1",110,89,"�t�@�~���A�[",1419,1;
	monster "force_1-1",105,105,"�t�@�~���A�[",1419,1;
	monster "force_1-1",94,105,"�t�@�~���A�[",1419,1;
	monster "force_1-1",94,94,"�t�@�~���A�[",1419,1;
	monster "force_1-1",105,94,"�t�@�~���A�[",1419,1;
	sleep 500;
	announce "�q���g: �N���A���� : �{�X�����X�^�[�A�{�[�J���o���I�{�[�J����|���Ă�������",9;
	end;
OnKilled9:
	callfunc "ArenaKilled",0,10,"�q���g",.mob;
	if(.mob <= 0)
		set .time,getnpctimer(0,"�q���g#arena");	//�^�C���L�^
	end;
//�N���A����1���^�C�}�[
OnTimer2000:
	mapannounce "prt_are_in","�^�C���A�^�b�NLV50�`69�Ɋւ���ē������ł��B",0,0xFFCE00;
	end;
OnTimer3000:
	mapannounce "prt_are_in","�~���Ȑi�s�̂��߁A�N���A��T���̑؍݂�1���Ƃ����Ă��������Ă��܂��B",0,0xFFCE00;
	end;
OnTimer4000:
	mapannounce "prt_are_in","�A���[�i�|�C���g�̎󂯎��͑��₩�ɂ��ς܂����������B",0,0xFFCE00;
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "prt_are_in",14,178,29,195,"arena_room",100,75;
	enablewaitingroomevent "[LV 50]�T��#arena";
	end;
}

force_1-1,62,25,0	script	Arena0warp#1	45,1,1,{
	set .@num,strnpcinfo(2);
	switch(.@num) {
		case 1: warp "force_1-1",40,26; 	break;
		case 2: warp "force_1-1",25,69; 	break;
		case 3: warp "force_1-1",25,159; 	break;
		case 4: warp "force_1-1",69,174; 	break;
		case 5: warp "force_1-1",159,174; 	break;
		case 6: warp "force_1-1",174,130; 	break;
		case 7: warp "force_1-1",174,40; 	break;
		case 8: warp "force_1-1",132,26; 	break;
		case 9: warp "force_1-1",99,86; 	break;
	}
	donpcevent "ArenaStage0::OnSummon"+.@num;
	end;
}

force_1-1,25,44,0		duplicate(Arena0warp#1)		Arena0warp#2	45,1,1
force_1-1,25,134,0		duplicate(Arena0warp#1)		Arena0warp#3	45,1,1
force_1-1,44,173,0		duplicate(Arena0warp#1)		Arena0warp#4	45,1,1
force_1-1,134,173,0		duplicate(Arena0warp#1)		Arena0warp#5	45,1,1
force_1-1,174,155,0		duplicate(Arena0warp#1)		Arena0warp#6	45,1,1
force_1-1,174,65,0		duplicate(Arena0warp#1)		Arena0warp#7	45,1,1
force_1-1,155,26,0		duplicate(Arena0warp#1)		Arena0warp#8	45,1,1
force_1-1,99,54,0		duplicate(Arena0warp#1)		Arena0warp#9	45,1,1

force_1-1,99,123,0	script	Arena0warp#10	45,1,1,{
	stopnpctimer "�q���g#arena";
	initnpctimer "ArenaStage0";
	warp "prt_are_in",22,192;
	end;
}

prt_are_in,25,187,3	script	�i�s�v��	67,{
	callfunc "ArenaClear",0,50,"LV50�`69";
	end;
}

//duplicate���Ƃ��Ă��g����
prt_are_in,129,187,3	script	�i�s�v��#arenafailed	67,{
	mes "[�i�s�v��]";
	mes "�����l�ł����B";
	mes "�^�C���A�^�b�N�͎��s�ł������A";
	mes "�A���[�i�|�C���g���x���������܂��B";
	next;
	mes "[�i�s�v��]";
	mes "�����͂����l�ł����B";
	mes "����ł́A�܂��̂��z�����A";
	mes "���҂����Ă���܂��B";
	close2;
	set ARENA_PIT,ARENA_PIT+1;
	warp "arena_room",100,75;
	end;
}


//==============================================================================
// �l�� LV60�`79
//==============================================================================
arena_room,41,93,5	script	�R���p�j�I�� �x��	750,{
	mes "[�x��]";
	mes "�悤�����B";
	mes "�l��LV60�`79�Z�N�V������";
	mes "�R���p�j�I���A�x���Ɛ\���܂��B";
	next;
	mes "[�x��]";
	mes "^3131FF�l��LV60�`79^000000�Z�N�V������";
	mes "^FF0000���x��60^000000����^FF0000���x��79^000000�܂œ���";
	mes "�\�ƂȂ��Ă���܂��B";
	next;
	mes "[�x��]";
	mes "�����x���v���C���[�ɂ��A�჌�x��";
	mes "�A���[�i�ł̃����L���O�l���h�~�̂���";
	mes "���x��������݂��Ă���܂��B";
	mes "���������������܂��B";
	next;
	mes "[�x��]";
	mes "�l��Q������1000z�ł��B";
	next;
	mes "[�x��]";
	mes "����ł́A�A���[�i�i�s���@�Ɋւ���";
	mes "���ē��������܂��B";
	next;
	mes "[�x��]";
	mes "�Q���T���ƂȂ�^3131FF�`���b�g���[���̒���";
	mes "�����̏��Ԃ����҂����������B^000000";
	mes "�����̏��ɂȂ�΃A���[�i���֎����I��";
	mes "�ړ��ƂȂ�܂��B";
	next;
	mes "[�x��]";
	mes "�A���[�i����Ɠ����ɃJ�E���g�_�E����";
	mes "�J�n�������܂��B";
	mes "�i��S����^3131FF�~��^000000���N���A�������";
	mes "���܂��B���̏����ɏ]���ăN���A��ڎw";
	mes "���ĉ������B";
	next;
	mes "[�x��]";
	mes "�������Ԃ�^3131FF6��^000000�ł��B";
	mes "�g�b�v�X�R�A��_���Ȃ�A���Ԓ��߂�";
	mes "�d�v�ƂȂ�܂��B";
	next;
	mes "[�x��]";
	mes "�Ō�̃{�X���[�����N���A�����";
	mes "^3131FF�I���T��^000000�Ɉړ��ƂȂ�܂��B";
	mes "^3131FF�I���T��^000000�ɂ�1�����������܂���̂�";
	mes "�S���҂���A���[�i�|�C���g����������";
	mes "�đf�����O�ɏo�Ă��������B";
	next;
	mes "[�x��]";
	mes "�I���T���ŃA���[�i�|�C���g���󂯎��";
	mes "���Ƃ��ł��Ȃ������ꍇ�A�A���[�i";
	mes "�|�C���g�̕⏞�͍s���Ă���܂���B";
	next;
	mes "[�x��]";
	mes "�ȏ�A�l��LV60�`79�ɂ��Ă̈ē���";
	mes "�I���������܂��B�A���[�i�Q���̂��Q";
	mes "�l�ɂȂ�΍K���Ƒ����܂��B";
	close;
}

arena_room,38,87,6	script	[LV 60]�T��#arena	124,{
	end;
OnInit:
	waitingroom "�l�� LV60�`79",20,"[LV 60]�T��#arena::OnStart",1,1000,60,79;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			killmonsterall "force_2-1";
			donpcevent "�~��#arena::OnStart";
			warp "force_2-1",100,12;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

force_2-1,99,20,3	script	�~��#arena	124,{
	end;
OnStart:
	set .count,6;
	enablenpc "Arena1warp#1";
	disablenpc "Arena1warp#9";
	initnpctimer;
	callfunc "ArenaAnnounce","LV60�`79",6;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
OnTimer360000:
	set .count,.count-1;
	if(.count)
		announce "�~��: �c�莞�� : " +.count+ " ��",9;
	else
		announce "�~��: ���Ԑ؂�ł��B�c�O�I",9;
	end;
OnTimer365000:
	stopnpctimer;
	areawarp "force_2-1",0,0,200,200,"prt_are_in",126,140;
	enablewaitingroomevent "[LV 60]�T��#arena";
	end;
}

force_2-1,0,0,0	script	ArenaStage1	-1,{
OnSummon1:
	set .mob,5;
	disablenpc "Arena1warp#2";
	monster "force_2-1",25,32,"�S�u�����A�[�`���[",1577,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",21,26,"�S�u����",1534,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",25,36,"�S�u����",1536,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",20,15,"�S�u�����A�[�`���[",1577,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",23,33,"�S�u����",1537,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",25,15,"�S�u����",1534,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",40,30,"�S�u����",1536,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",20,23,"�S�u����",1535,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",23,22,"�S�u�����A�[�`���[",1577,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",25,24,"�S�u����",1534,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",25,9,"�S�u����",1536,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",28,15,"�S�u�����A�[�`���[",1577,1,"ArenaStage1::OnKilled1";
//	monster "force_2-1",25,16,"�S�u����",1537,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",12,33,"�S�u����",1536,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",24,20,"�S�u����",1535,1,"ArenaStage1::OnKilled1";
	monster "force_2-1",25,25,"���[�^�[�W���C��",1557,1;
	sleep 500;
	announce "�~��: �N���A���� : ���[�^�[�W���C��������Ȃ���A�S�u������5�̈ȏ�ގ����Ă�������",9;
	end;
OnKilled1:
	callfunc "ArenaKilled",1,2,"�~��",.mob;
	end;
OnSummon2:
	monster "force_2-1",24,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",28,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",24,86,"�h���C�����A�[",1434,1;
	monster "force_2-1",24,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",28,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",24,86,"�h���C�����A�[",1434,1;
	monster "force_2-1",24,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",28,76,"�h���C�����A�[",1434,1;
	monster "force_2-1",23,76,"���N�C�G��",1468,1;
	monster "force_2-1",27,76,"���N�C�G��",1468,1;
	monster "force_2-1",25,86,"���N�C�G��",1468,1;
	monster "force_2-1",26,86,"�O�[��",1423,1;
	monster "force_2-1",25,100,"�O�[��",1423,1;
	monster "force_2-1",26,118,"�O�[��",1423,1;
	monster "force_2-1",25,100,"�O�[��",1423,1;
	monster "force_2-1",26,118,"�O�[��",1423,1;
	monster "force_2-1",28,79,"�[����",1470,1;
	monster "force_2-1",23,87,"�[����",1470,1;
	monster "force_2-1",28,99,"�[����",1470,1;
	monster "force_2-1",23,112,"�[����",1470,1;
	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
//	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
	monster "force_2-1",28,128,"�I�[�N�]���r",1463,1;
	monster "force_2-1",28,128,"�I�[�N�]���r",1463,1;
	monster "force_2-1",28,128,"�I�[�N�]���r",1463,1;
	monster "force_2-1",28,128,"�I�[�N�]���r",1463,1;
	monster "force_2-1",28,128,"�I�[�N�]���r",1463,1;
	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
	monster "force_2-1",28,128,"�}�[�^�[",1460,1;
	sleep 500;
	announce "�~��: �N���A���� : �����X�^�[������Ėk�o������E�o���Ă�������",9;
	end;
OnSummon3:
	set .mob,4;
	disablenpc "Arena1warp#4";
	monster "force_2-1",23,174,"�}���e�B�X",1457,1,"ArenaStage1::OnKilled3";
	monster "force_2-1",18,173,"�}���e�B�X",1457,1,"ArenaStage1::OnKilled3";
	monster "force_2-1",33,173,"�}���e�B�X",1457,1,"ArenaStage1::OnKilled3";
	monster "force_2-1",26,181,"�}���e�B�X",1457,1,"ArenaStage1::OnKilled3";
//	monster "force_2-1",26,166,"�}���e�B�X",1457,1,"ArenaStage1::OnKilled3";
	monster "force_2-1",26,173,"�q�h��",1579,1;
	monster "force_2-1",21,173,"�q�h��",1579,1;
	monster "force_2-1",31,173,"�q�h��",1579,1;
	monster "force_2-1",26,178,"�q�h��",1579,1;
	monster "force_2-1",21,178,"�q�h��",1579,1;
	monster "force_2-1",31,178,"�q�h��",1579,1;
	monster "force_2-1",19,174,"�I�{���k",1425,1;
	monster "force_2-1",26,161,"�I�{���k",1425,1;
	monster "force_2-1",13,173,"�I�{���k",1425,1;
	monster "force_2-1",38,173,"�I�{���k",1425,1;
//	monster "force_2-1",19,174,"�I�{���k",1425,1;
	sleep 500;
	announce "�~��: �N���A���� : �}���e�B�X��S�đގ����Ă�������",9;
	end;
OnKilled3:
	callfunc "ArenaKilled",1,4,"�~��",.mob;
	end;
OnSummon4:
	set .mob,2;
	disablenpc "Arena1warp#5";
	monster "force_2-1",79,174,"�S�[����",1540,1,"ArenaStage1::OnKilled4";
	monster "force_2-1",131,178,"�}���X",1551,1,"ArenaStage1::OnKilled4";
	monster "force_2-1",84,177,"�T�X�J�b�`",1442,1;
	monster "force_2-1",125,170,"�T�X�J�b�`",1442,1;
	monster "force_2-1",109,172,"�R�E",1524,1;
	monster "force_2-1",121,172,"�R�E",1524,1;
	monster "force_2-1",104,173,"�`�F�y�b�g",1444,1;
	monster "force_2-1",75,174,"�h�P�r",1491,1;
//	monster "force_2-1",95,175,"�h�P�r",1491,1;
	monster "force_2-1",102,176,"�h�P�r",1491,1;
	sleep 500;
	announce "�~��: �N���A���� : �A�N�e�B�u�����X�^�[������Ĕ�A�N�e�B�u�����X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled4:
	callfunc "ArenaKilled",1,5,"�~��",.mob;
	end;
OnSummon5:
	set .mob,5;
	disablenpc "Arena1warp#6";
	monster "force_2-1",163,173,"�h���C�����A�[",1434,1,"ArenaStage1::OnKilled5";
	monster "force_2-1",173,173,"�~�X�g",1553,1,"ArenaStage1::OnKilled5";
	monster "force_2-1",181,173,"�I�[�N�X�P���g��",1462,1,"ArenaStage1::OnKilled5";
	monster "force_2-1",171,177,"�I�[�N�X�P���g��",1462,1,"ArenaStage1::OnKilled5";
	monster "force_2-1",173,181,"���O����",1445,1,"ArenaStage1::OnKilled5";
	monster "force_2-1",168,177,"�q�h��",1579,1;
	monster "force_2-1",170,179,"�q�h��",1579,1;
	monster "force_2-1",177,179,"�q�h��",1579,1;
	monster "force_2-1",179,178,"�q�h��",1579,1;
	monster "force_2-1",179,170,"�q�h��",1579,1;
	monster "force_2-1",177,168,"�q�h��",1579,1;
	monster "force_2-1",170,168,"�q�h��",1579,1;
	monster "force_2-1",173,174,"�q�h��",1579,1;
	monster "force_2-1",174,174,"�q�h��",1579,1;
	monster "force_2-1",173,173,"�q�h��",1579,1;
	monster "force_2-1",174,173,"�q�h��",1579,1;
	monster "force_2-1",173,181,"�͓�",1543,1;
	sleep 500;
	announce "�~��: �N���A���� : �q�h���Ɖ͓����������S�Ẵ����X�^�[��ގ����Ă�������",9;
	end;
OnKilled5:
	callfunc "ArenaKilled",1,6,"�~��",.mob;
	end;
OnSummon6:
	set .mob,2;
	disablenpc "Arena1warp#7";
	monster "force_2-1",174,100,"��l�`",1552,1,"ArenaStage1::OnKilled6";
	monster "force_2-1",174,80,"��l�`",1552,1,"ArenaStage1::OnKilled6";
	monster "force_2-1",169,130,"�V���叫�R",1541,1;
	monster "force_2-1",178,130,"�V���叫�R",1541,1;
	monster "force_2-1",169,125,"�V���叫�R",1541,1;
	monster "force_2-1",178,125,"�V���叫�R",1541,1;
	monster "force_2-1",169,120,"�V���叫�R",1541,1;
	monster "force_2-1",178,120,"�V���叫�R",1541,1;
	monster "force_2-1",169,115,"�V���叫�R",1541,1;
	monster "force_2-1",178,115,"�V���叫�R",1541,1;
	monster "force_2-1",169,110,"�V���叫�R",1541,1;
	monster "force_2-1",178,110,"�V���叫�R",1541,1;
	monster "force_2-1",169,105,"�V���叫�R",1541,1;
	monster "force_2-1",178,105,"�V���叫�R",1541,1;
	monster "force_2-1",169,100,"�V���叫�R",1541,1;
	monster "force_2-1",178,100,"�V���叫�R",1541,1;
	monster "force_2-1",169,95,"�V���叫�R",1541,1;
	monster "force_2-1",178,95,"�V���叫�R",1541,1;
	monster "force_2-1",169,90,"�V���叫�R",1541,1;
	monster "force_2-1",178,90,"�V���叫�R",1541,1;
	monster "force_2-1",169,85,"�V���叫�R",1541,1;
	monster "force_2-1",178,85,"�V���叫�R",1541,1;
	monster "force_2-1",169,80,"�V���叫�R",1541,1;
	monster "force_2-1",178,80,"�V���叫�R",1541,1;
	monster "force_2-1",169,75,"�V���叫�R",1541,1;
	monster "force_2-1",178,75,"�V���叫�R",1541,1;
	sleep 500;
	announce "�~��: �N���A���� : ��l�`��S�đގ����Ă�������",9;
	end;
OnKilled6:
	switch(rand(3)) {
		case 0: areamonster "force_2-1",170,70,177,120,"�T�C�h���C���_�[",1424,1; 	break;
		case 1: areamonster "force_2-1",170,70,177,120,"�V�l�Q",1565,1; 		break;
		case 2: areamonster "force_2-1",170,70,177,120,"�N���[�U�[",1443,1; 	break;
	}
	callfunc "ArenaKilled",1,7,"�~��",.mob;
	end;
OnSummon7:
	set .mob,4;
	disablenpc "Arena1warp#8";
	monster "force_2-1",170,25,"�W���b�N",1436,1,"ArenaStage1::OnKilled7";
	monster "force_2-1",170,25,"�W���b�N",1436,1,"ArenaStage1::OnKilled7";
	monster "force_2-1",175,25,"�C�V�X",1421,1,"ArenaStage1::OnKilled7";
	monster "force_2-1",179,25,"�~�X�g",1553,1,"ArenaStage1::OnKilled7";
	sleep 500;
	announce "�~��: �N���A���� : �����X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled7:
	callfunc "ArenaKilled",1,8,"�~��",.mob;
	end;
OnSummon8:
	disablenpc "Arena1warp#1";
	enablenpc "Arena1warp#9";
	sleep 500;
	announce "�~��: �k�o������E�o���Ă��������I",9;
	end;
OnSummon9:
	set .mob,1;
	disablenpc "Arena1warp#10";
	monster "force_2-1",99,99,"�S�u�������[�_�[",1539,1,"ArenaStage1::OnKilled9";
	monster "force_2-1",90,100,"�z����",1578,1;
	monster "force_2-1",92,100,"�z����",1578,1;
	monster "force_2-1",99,100,"�z����",1578,1;
	monster "force_2-1",105,100,"�z����",1578,1;
	monster "force_2-1",85,114,"�V���叫�R",1541,1;
	monster "force_2-1",87,114,"�V���叫�R",1541,1;
	monster "force_2-1",89,114,"�V���叫�R",1541,1;
	monster "force_2-1",91,114,"�V���叫�R",1541,1;
	monster "force_2-1",93,114,"�V���叫�R",1541,1;
	monster "force_2-1",95,114,"�V���叫�R",1541,1;
	monster "force_2-1",85,112,"�V���叫�R",1541,1;
	monster "force_2-1",85,110,"�V���叫�R",1541,1;
	monster "force_2-1",85,108,"�V���叫�R",1541,1;
	monster "force_2-1",85,106,"�V���叫�R",1541,1;
	monster "force_2-1",85,104,"�V���叫�R",1541,1;
	monster "force_2-1",103,114,"�V���叫�R",1541,1;
	monster "force_2-1",105,114,"�V���叫�R",1541,1;
	monster "force_2-1",107,114,"�V���叫�R",1541,1;
	monster "force_2-1",109,114,"�V���叫�R",1541,1;
	monster "force_2-1",111,114,"�V���叫�R",1541,1;
	monster "force_2-1",113,114,"�V���叫�R",1541,1;
	monster "force_2-1",115,114,"�V���叫�R",1541,1;
	monster "force_2-1",115,112,"�V���叫�R",1541,1;
	monster "force_2-1",115,110,"�V���叫�R",1541,1;
	monster "force_2-1",115,108,"�V���叫�R",1541,1;
	monster "force_2-1",115,106,"�V���叫�R",1541,1;
	monster "force_2-1",115,104,"�V���叫�R",1541,1;
	sleep 500;
	announce "�~��: �N���A���� : �{�X�����X�^�[�A�S�u�������[�_�[�o���I�S�u�������[�_�[��|���Ă�������",9;
	end;
OnKilled9:
	callfunc "ArenaKilled",1,10,"�~��",.mob;
	if(.mob <= 0)
		set .time,getnpctimer(0,"�~��#arena");	//�^�C���L�^
	end;
//�N���A����1���^�C�}�[
OnTimer2000:
	mapannounce "prt_are_in","�^�C���A�^�b�NLV60�`79�Ɋւ���ē������ł��B",0,0xFFCE00;
	end;
OnTimer3000:
	mapannounce "prt_are_in","�~���Ȑi�s�̂��߁A�N���A��T���̑؍݂�1���Ƃ����Ă��������Ă��܂��B",0,0xFFCE00;
	end;
OnTimer4000:
	mapannounce "prt_are_in","�A���[�i�|�C���g�̎󂯎��͑��₩�ɂ��ς܂����������B",0,0xFFCE00;
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "prt_are_in",14,126,29,143,"arena_room",100,75;
	enablewaitingroomevent "[LV 60]�T��#arena";
	end;
}

force_2-1,62,25,0	script	Arena1warp#1	45,1,1,{
	set .@num,strnpcinfo(2);
	switch(.@num) {
		case 1: warp "force_2-1",40,26; 	break;
		case 2: warp "force_2-1",25,69; 	break;
		case 3: warp "force_2-1",25,159; 	break;
		case 4: warp "force_2-1",69,174; 	break;
		case 5: warp "force_2-1",159,174; 	break;
		case 6: warp "force_2-1",174,130; 	break;
		case 7: warp "force_2-1",174,40; 	break;
		case 8: warp "force_2-1",132,26; 	break;
		case 9: warp "force_2-1",99,86; 	break;
	}
	donpcevent "ArenaStage1::OnSummon"+.@num;
	end;
}

force_2-1,25,44,0		duplicate(Arena1warp#1)		Arena1warp#2	45,1,1
force_2-1,25,134,0		duplicate(Arena1warp#1)		Arena1warp#3	45,1,1
force_2-1,44,173,0		duplicate(Arena1warp#1)		Arena1warp#4	45,1,1
force_2-1,134,173,0		duplicate(Arena1warp#1)		Arena1warp#5	45,1,1
force_2-1,174,155,0		duplicate(Arena1warp#1)		Arena1warp#6	45,1,1
force_2-1,174,65,0		duplicate(Arena1warp#1)		Arena1warp#7	45,1,1
force_2-1,155,26,0		duplicate(Arena1warp#1)		Arena1warp#8	45,1,1
force_2-1,99,54,0		duplicate(Arena1warp#1)		Arena1warp#9	45,1,1

force_2-1,99,123,0	script	Arena1warp#10	45,1,1,{
	stopnpctimer "�~��#arena";
	initnpctimer "ArenaStage1";
	warp "prt_are_in",22,140;
	end;
}

prt_are_in,25,135,3	script	�i�s�v��	67,{
	callfunc "ArenaClear",1,60,"LV60�`79";
	end;
}

prt_are_in,129,135,3	duplicate(�i�s�v��#arenafailed)	�i�s�v��	67


//==============================================================================
// �l�� LV70�`89
//==============================================================================
arena_room,53,48,2	script	�R���p�j�I�� �r�V���X	730,{
	mes "[�r�V���X]";
	mes "�c�c�ǂ����B";
	mes "�l��LV70�`89�Z�N�V������";
	mes "�R���p�j�I���A�r�V���X���B";
	mes "(�c�c�ǂ����ĉ�������Ȃ��Ƃ�)";
	mes "(�c�c�u�c�u�c�c�c)";
	next;
	mes "[�r�V���X]";
	mes "^3131FF�l��LV70�`89^000000��";
	mes "^FF0000���x��70^000000����^FF0000���x��89^000000�܂œ���";
	mes "�ł���B";
	next;
	mes "[�r�V���X]";
	mes "���x���������v���C���[���������Ⴂ";
	mes "���x���̃A���[�i�ňВ��肿�炵��";
	mes "�����N������肵�Ȃ��悤�ɐ�����";
	mes "�������B";
	next;
	mes "[�r�V���X]";
	mes "�l��Q������1000z���B";
	next;
	mes "[�r�V���X]";
	mes "���ꂶ��A�A���[�i�i�s�ɂ���";
	mes "�����Ă��B";
	next;
	mes "[�r�V���X]";
	mes "�Q���T����^3131FF�`���b�g���[���ɓ�����";
	mes "�����̏��Ԃ�҂��Ă���΂����B^000000";
	mes "�����̏��ɂȂ�Ώ���ɃA���[�i��";
	mes "�ړ������B";
	next;
	mes "[�r�V���X]";
	mes "�A���[�i�ɓ������u�ԂɃJ�E���g��";
	mes "�n�܂��Ă邩��ȁB";
	mes "^3131FF�L�����b�N^000000���N���A�������o������";
	mes "���̒ʂ�ɐ���Ă����B";
	next;
	mes "[�r�V���X]";
	mes "�������Ԃ�^3131FF7��^000000���B";
	mes "�������Ē����Ȃ�����A�W�����Č�����";
	mes "�l���Ȃ��Ɩ������낤��B";
	next;
	mes "[�r�V���X]";
	mes "�Ō�̃{�X���[�����N���A�����";
	mes "^3131FF�I���T��^000000�Ɉړ����B";
	mes "^3131FF�I���T��^000000�̑؍ݎ��Ԃ�";
	mes "1���������B�S���҂��炳�����ƃA���[";
	mes "�i�|�C���g��������āA�������ƊO��";
	mes "�o�邱�Ƃ��ȁB";
	next;
	mes "[�r�V���X]";
	mes "�I���T���ŃA���[�i�|�C���g���󂯎��";
	mes "�Ȃ��Ă��A�⏞�͂��ĂȂ�����ȁB";
	mes "���������Ēm��˂����B";
	next;
	mes "[�r�V���X]";
	mes "������������̂͂����܂ł��B";
	mes "�킩�������H";
	close;
}

arena_room,52,42,7	script	[LV 70]�T��#arena	124,{
	end;
OnInit:
	waitingroom "�l�� LV70�`89",20,"[LV 70]�T��#arena::OnStart",1,1000,70,89;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			killmonsterall "force_3-1";
			donpcevent "�L�����b�N#arena::OnStart";
			warp "force_3-1",100,12;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

force_3-1,99,20,3	script	�L�����b�N#arena	124,{
	end;
OnStart:
	set .count,7;
	enablenpc "Arena2warp#1";
	disablenpc "Arena2warp#9";
	initnpctimer;
	callfunc "ArenaAnnounce","LV70�`89",7;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
OnTimer360000:
OnTimer420000:
	set .count,.count-1;
	if(.count)
		announce "�L�����b�N: �c�莞�� : " +.count+ " ��",9;
	else
		announce "�L�����b�N: ���Ԑ؂�ł��B�c�O�I",9;
	end;
OnTimer425000:
	stopnpctimer;
	areawarp "force_3-1",0,0,200,200,"prt_are_in",126,88;
	enablewaitingroomevent "[LV 70]�T��#arena";
	end;
}

force_3-1,0,0,0	script	ArenaStage2	-1,{
OnSummon1:
	set .mob,5;
	disablenpc "Arena2warp#2";
	monster "force_3-1",25,36,"�R�{���h",1545,1,"ArenaStage2::OnKilled1";
	monster "force_3-1",20,36,"�R�{���h",1545,1,"ArenaStage2::OnKilled1";
	monster "force_3-1",25,20,"�R�{���h",1546,1,"ArenaStage2::OnKilled1";
	monster "force_3-1",30,36,"�R�{���h",1547,2,"ArenaStage2::OnKilled1";
	monster "force_3-1",28,15,"�R�{���h",1547,2,"ArenaStage2::OnKilled1";
	sleep 500;
	announce "�L�����b�N: �N���A���� : �R�{���h��S�đގ����Ă�������",9;
	end;
OnKilled1:
	callfunc "ArenaKilled",2,2,"�L�����b�N",.mob;
	end;
OnSummon2:
	set .mob,2;
	disablenpc "Arena2warp#3";
	monster "force_3-1",25,79,"�z����",1578,1,"ArenaStage2::OnKilled2";
	monster "force_3-1",29,114,"�z����",1578,1,"ArenaStage2::OnKilled2";
	monster "force_3-1",21,78,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_3-1",22,93,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_3-1",29,93,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_3-1",25,101,"�}�~�[",1393,1;
	monster "force_3-1",26,101,"�}�~�[",1393,1;
	monster "force_3-1",27,101,"�}�~�[",1393,1;
	monster "force_3-1",28,101,"�}�~�[",1393,1;
	monster "force_3-1",24,104,"�O�[��",1423,1;
	monster "force_3-1",24,113,"�O�[��",1423,1;
	monster "force_3-1",29,120,"�O�[��",1423,1;
	monster "force_3-1",29,126,"�O�[��",1423,1;
	monster "force_3-1",30,110,"�O�[��",1423,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �z������S�đގ����Ă�������",9;
	end;
OnKilled2:	//killmonster���Ȃ��̂�function�g��Ȃ�
	set .mob,.mob-1;
	if(.mob <= 0) {
		enablenpc "Arena2warp#3";
		announce "�L�����b�N: �k�����̃h�A���J���܂����I",9;
	}
	end;
OnSummon3:
	set .mob,3;
	disablenpc "Arena2warp#4";
	monster "force_3-1",23,174,"�t�F�A���[�t",1555,1,"ArenaStage2::OnKilled3";
	monster "force_3-1",33,173,"�t�F�A���[�t",1555,1,"ArenaStage2::OnKilled3";
	monster "force_3-1",26,166,"�p�s����",1526,1,"ArenaStage2::OnKilled3";
	monster "force_3-1",10,170,"�l�ʓ���",1550,1;
	monster "force_3-1",26,180,"�l�ʓ���",1550,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �l�ʓ����������������X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled3:
	callfunc "ArenaKilled",2,4,"�L�����b�N",.mob;
	end;
OnSummon4:
	set .mob,3;
	disablenpc "Arena2warp#5";
	monster "force_3-1",87,174,"�X�e�����[��",1440,1,"ArenaStage2::OnKilled4";
	monster "force_3-1",103,174,"�X�e�����[��",1440,1,"ArenaStage2::OnKilled4";
	monster "force_3-1",96,170,"�X�e�����[��",1440,1,"ArenaStage2::OnKilled4";
	monster "force_3-1",72,126,"�o�[�X���[",1525,1;
	monster "force_3-1",110,179,"�o�[�X���[",1525,1;
	monster "force_3-1",80,140,"�o�[�X���[",1525,1;
	monster "force_3-1",100,170,"�o�[�X���[",1525,1;
	monster "force_3-1",92,135,"�o�[�X���[",1525,1;
	monster "force_3-1",125,169,"�o�[�X���[",1525,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �o�[�X���[������Ȃ���X�e�����[����ގ����Ă�������",9;
	end;
OnKilled4:
	callfunc "ArenaKilled",2,5,"�L�����b�N",.mob;
	end;
OnSummon5:
	set .mob,5;
	disablenpc "Arena2warp#6";
	monster "force_3-1",164,183,"�A���M�I�y",1429,1,"ArenaStage2::OnKilled5";
	monster "force_3-1",168,158,"�A���M�I�y",1429,1,"ArenaStage2::OnKilled5";
	monster "force_3-1",175,174,"�A���M�I�y",1429,1,"ArenaStage2::OnKilled5";
	monster "force_3-1",176,179,"�A���M�I�y",1429,1,"ArenaStage2::OnKilled5";
	monster "force_3-1",183,160,"�A���M�I�y",1429,1,"ArenaStage2::OnKilled5";
	sleep 500;
	announce "�L�����b�N: �N���A���� : �A���M�I�y��S�đގ����Ă�������",9;
	end;
OnKilled5:
	switch(rand(3)) {
		case 0: monster "force_3-1",174,174,"���C�h���[�h",1478,1; break;
		case 1: monster "force_3-1",173,173,"�}���e�B�X",1457,1; break;
		case 2: break;
	}
	callfunc "ArenaKilled",2,6,"�L�����b�N",.mob;
	end;
OnSummon6:
	set .mob,5;
	disablenpc "Arena2warp#7";
	monster "force_3-1",179,90,"�S�u����",1537,1,"ArenaStage2::OnKilled6";
	monster "force_3-1",173,120,"�S�u����",1537,1,"ArenaStage2::OnKilled6";
	monster "force_3-1",172,113,"�S�u����",1537,1,"ArenaStage2::OnKilled6";
	monster "force_3-1",175,98,"�S�u����",1537,1,"ArenaStage2::OnKilled6";
	monster "force_3-1",170,118,"�S�u����",1537,1,"ArenaStage2::OnKilled6";
//	monster "force_3-1",171,126,"�S�u����",1534,1;
	monster "force_3-1",176,99,"�S�u����",1534,1;
	monster "force_3-1",170,86,"�S�u����",1535,1;
	monster "force_3-1",176,97,"�S�u����",1535,1;
	monster "force_3-1",170,108,"�S�u����",1535,1;
	monster "force_3-1",176,112,"�S�u����",1536,1;
	monster "force_3-1",173,120,"�S�u����",1536,1;
	monster "force_3-1",177,74,"�S�u����",1536,1;
	monster "force_3-1",173,118,"�S�u����",1538,1;
	monster "force_3-1",171,101,"�S�u����",1538,1;
	monster "force_3-1",174,118,"�S�u����",1538,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �S�u�����̒�����S�u����(��)������|���Ă�������",9;
	end;
OnKilled6:
	callfunc "ArenaKilled",2,7,"�L�����b�N",.mob;
	end;
OnSummon7:
	set .mob,1;
	disablenpc "Arena2warp#8";
	monster "force_3-1",174,25,"�A���X",1521,1,"ArenaStage2::OnKilled7";
	monster "force_3-1",168,26,"�i�C�g���A",1427,1;
	monster "force_3-1",186,23,"�i�C�g���A",1427,1;
	monster "force_3-1",160,23,"�i�C�g���A",1427,1;
	monster "force_3-1",188,33,"�i�C�g���A",1427,1;
	monster "force_3-1",174,13,"���C�h���b�N",1467,1;
	monster "force_3-1",163,15,"�t�@�~���A�[",1419,1;
	monster "force_3-1",164,15,"�t�@�~���A�[",1419,1;
	monster "force_3-1",163,16,"�t�@�~���A�[",1419,1;
	monster "force_3-1",164,16,"�t�@�~���A�[",1419,1;
	monster "force_3-1",187,13,"�t�@�~���A�[",1419,1;
	monster "force_3-1",187,14,"�t�@�~���A�[",1419,1;
	monster "force_3-1",186,13,"�t�@�~���A�[",1419,1;
	monster "force_3-1",186,14,"�t�@�~���A�[",1419,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �A���X��|���Ă�������",9;
	end;
OnKilled7:
	callfunc "ArenaKilled",2,8,"�L�����b�N",.mob;
	end;
OnSummon8:
	disablenpc "Arena2warp#1";
	enablenpc "Arena2warp#9";
	sleep 500;
	announce "�L�����b�N: �k�o������E�o���Ă��������I",9;
	end;
OnSummon9:
	set .mob,4;
	disablenpc "Arena2warp#10";
	monster "force_3-1",99,99,"�R�{���h���[�_�[",1548,1,"ArenaStage2::OnKilled9";
	monster "force_3-1",98,99,"�R�{���h",1545,1,"ArenaStage2::OnKilled9";
	monster "force_3-1",100,99,"�R�{���h",1546,1,"ArenaStage2::OnKilled9";
	monster "force_3-1",99,98,"�R�{���h",1547,1,"ArenaStage2::OnKilled9";
	monster "force_3-1",93,100,"�t�@�~���A�[",1419,1;
	monster "force_3-1",94,100,"�t�@�~���A�[",1419,1;
	monster "force_3-1",93,99,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",87,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",89,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",91,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",93,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",95,114,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,112,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,110,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,108,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,106,"�t�@�~���A�[",1419,1;
	monster "force_3-1",85,104,"�t�@�~���A�[",1419,1;
	sleep 500;
	announce "�L�����b�N: �N���A���� : �{�X�����X�^�[�A�R�{���h���[�_�[�o���I�R�{���h���[�_�[�ƃR�{���h��|���Ă�������",9;
	end;
OnKilled9:
	callfunc "ArenaKilled",2,10,"�L�����b�N",.mob;
	if(.mob <= 0)
		set .time,getnpctimer(0,"�L�����b�N#arena");	//�^�C���L�^
	end;
//�N���A����1���^�C�}�[
OnTimer2000:
	mapannounce "prt_are_in","�^�C���A�^�b�NLV70�`89�Ɋւ���ē������ł��B",0,0xFFCE00;
	end;
OnTimer3000:
	mapannounce "prt_are_in","�~���Ȑi�s�̂��߁A�N���A��T���̑؍݂�1���Ƃ����Ă��������Ă��܂��B",0,0xFFCE00;
	end;
OnTimer4000:
	mapannounce "prt_are_in","�A���[�i�|�C���g�̎󂯎��͑��₩�ɂ��ς܂����������B",0,0xFFCE00;
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "prt_are_in",14,74,29,91,"arena_room",100,75;
	enablewaitingroomevent "[LV 70]�T��#arena";
	end;
}

force_3-1,62,25,0	script	Arena2warp#1	45,1,1,{
	set .@num,strnpcinfo(2);
	switch(.@num) {
		case 1: warp "force_3-1",40,26; break;
		case 2: warp "force_3-1",25,69; break;
		case 3: warp "force_3-1",25,159; break;
		case 4: warp "force_3-1",69,174; break;
		case 5: warp "force_3-1",159,174; break;
		case 6: warp "force_3-1",174,130; break;
		case 7: warp "force_3-1",174,40; break;
		case 8: warp "force_3-1",132,26; break;
		case 9: warp "force_3-1",99,86; break;
	}
	donpcevent "ArenaStage2::OnSummon"+.@num;
	end;
}

force_3-1,25,44,0		duplicate(Arena2warp#1)		Arena2warp#2	45,1,1
force_3-1,25,134,0		duplicate(Arena2warp#1)		Arena2warp#3	45,1,1
force_3-1,44,173,0		duplicate(Arena2warp#1)		Arena2warp#4	45,1,1
force_3-1,134,173,0		duplicate(Arena2warp#1)		Arena2warp#5	45,1,1
force_3-1,174,155,0		duplicate(Arena2warp#1)		Arena2warp#6	45,1,1
force_3-1,174,65,0		duplicate(Arena2warp#1)		Arena2warp#7	45,1,1
force_3-1,155,26,0		duplicate(Arena2warp#1)		Arena2warp#8	45,1,1
force_3-1,99,54,0		duplicate(Arena2warp#1)		Arena2warp#9	45,1,1

force_3-1,99,123,0	script	Arena2warp#10	45,1,1,{
	stopnpctimer "�L�����b�N#arena";
	initnpctimer "ArenaStage2";
	warp "prt_are_in",22,88;
	end;
}

prt_are_in,25,83,3	script	�i�s�v��	67,{
	callfunc "ArenaClear",2,70,"LV70�`89";
	end;
}

prt_are_in,129,83,3	duplicate(�i�s�v��#arenafailed)	�i�s�v��	67


//==============================================================================
// �l�� LV80�`99
//==============================================================================
arena_room,147,49,2	script	�R���p�j�I�� �G�s��	727,{
	mes "[�G�s��]";
	mes "����ɂ��́`��";
	mes "�l��LV80�`99�̃R���p�j�I�������";
	mes "�܁`���B���O�́`�A�G�s���Ł`����";
	mes "��͓Ǐ��ŁA�N�́c�c";
	mes "�c�c���A���������Ȃ��H";
	next;
	emotion 28;
	mes "[�G�s��]";
	mes "��������A�킩��܂����c�c";
	mes "�c�c�܂�Ȃ���`�c�c";
	next;
	mes "[�G�s��]";
	mes "^3131FF�l��LV80�`99^000000�Z�N�V������";
	mes "^FF0000���x��80^000000����^FF0000���x��99^000000�܂œ���";
	mes "�ł��܁`���B";
	next;
	mes "[�G�s��]";
	mes "�Q������1000z�ł���B";
	next;
	mes "[�G�s��]";
	mes "�A���[�i�̐i�߂����́`";
	mes "�Q���T����^3131FF�`���b�g���[������";
	mes "�����̏��Ԃ�҂��ĂĂˁB^000000";
	mes "�����̏��ɂȂ�΃A���[�i�Ɏ����I��";
	mes "�ړ��ł����Ⴂ�܂��B";
	next;
	mes "[�G�s��]";
	mes "�A���[�i�ɓ���ƃJ�E���gSTART!!";
	mes "^3131FF�A�g�X^000000���N���A�����������Ă���邩��";
	mes "���̒ʂ�Ƀ����X�^�[���{�R�{�R��";
	mes "�����OK��B";
	next;
	mes "[�G�s��]";
	mes "�������Ԃ�^3131FF8��^000000������";
	mes "���܁`�����Ԃ��g���ĂˁB";
	mes "�v���Ă�قǊȒP����Ȃ����`�B";
	next;
	mes "[�G�s��]";
	mes "�Ō�̃{�X���[�����N���A�����";
	mes "^3131FF�I���T��^000000�Ɉړ����܂��B";
	mes "^3131FF�I���T��^000000�ɂ�1�����������Ȃ�";
	mes "����S���҂���`���b�`���ƃA���[�i";
	mes "�|�C���g��������ĂˁB";
	next;
	mes "[�G�s��]";
	mes "�����A�I���T���ŃA���[�i�|�C���g��";
	mes "�󂯎��Ȃ�������A���߂�ˁB";
	mes "�A���[�i�|�C���g�̕⏞�͂��ĂȂ��́B";
	mes "�������΁I�C�����ĂˁB";
	next;
	mes "[�G�s��]";
	mes "�ȏ�Ł`���B�킩�������ȁH";
	mes "�����N�C������Ƃ����ˁB";
	mes "�t�@�C�g�`!!";
	close;
}

arena_room,147,42,1	script	[LV 80]�T��#arena	124,{
	end;
OnInit:
	waitingroom "�l�� LV80�`99",20,"[LV 80]�T��#arena::OnStart",1,1000,80,99;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			killmonsterall "force_4-1";
			donpcevent "�A�g�X#arena::OnStart";
			warp "force_4-1",100,12;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

force_4-1,99,20,3	script	�A�g�X#arena	124,{
	end;
OnStart:
	set .count,8;
	enablenpc "Arena3warp#1";
	disablenpc "Arena3warp#9";
	initnpctimer;
	callfunc "ArenaAnnounce","LV80�`99",8;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
OnTimer360000:
OnTimer420000:
OnTimer480000:
	set .count,.count-1;
	if(.count)
		announce "�A�g�X: �c�莞�� : " +.count+ " ��",9;
	else
		announce "�A�g�X: ���Ԑ؂�ł��B�c�O�I",9;
	end;
OnTimer485000:
	stopnpctimer;
	areawarp "force_4-1",0,0,200,200,"prt_are_in",178,192;
	enablewaitingroomevent "[LV 80]�T��#arena";
	end;
}

force_4-1,0,0,0	script	ArenaStage3	-1,{
OnSummon1:
	set .mob,4;
	disablenpc "Arena3warp#2";
	monster "force_4-1",35,13,"�i�C�g���A",1427,1,"ArenaStage3::OnKilled1";
	monster "force_4-1",25,36,"�i�C�g���A",1427,1,"ArenaStage3::OnKilled1";
	monster "force_4-1",22,23,"�i�C�g���A",1427,1,"ArenaStage3::OnKilled1";
	monster "force_4-1",25,17,"�i�C�g���A",1427,1,"ArenaStage3::OnKilled1";
//	monster "force_4-1",25,15,"�i�C�g���A",1427,1,"ArenaStage3::OnKilled1";
	monster "force_4-1",11,25,"�n���^�[�t���C",1422,1;
	monster "force_4-1",22,22,"�n���^�[�t���C",1422,1;
//	monster "force_4-1",25,25,"�n���^�[�t���C",1422,1;
	monster "force_4-1",35,13,"�n���^�[�t���C",1422,1;
	monster "force_4-1",18,33,"�n���^�[�t���C",1422,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : �i�C�g���A��S�đގ����Ă�������",9;
	end;
OnKilled1:
	callfunc "ArenaKilled",3,2,"�A�g�X",.mob;
	end;
OnSummon2:
	set .mob,15;
	disablenpc "Arena3warp#3";
	monster "force_4-1",24,80,"�}���I�l�b�g",1459,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",23,110,"�}���I�l�b�g",1459,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",26,90,"�}���I�l�b�g",1459,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",28,75,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",24,90,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",28,85,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",24,82,"�f�r���`",1433,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",28,86,"�X�P���v���Y�i�[",1479,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",27,73,"�X�P���v���Y�i�[",1479,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",26,118,"�X�P���v���Y�i�[",1479,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",25,127,"�X�P���v���Y�i�[",1479,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",28,128,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",27,100,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",29,90,"�]���r",1394,1,"ArenaStage3::OnKilled2";
	monster "force_4-1",28,128,"���C�h���b�N�A�[�`���[",1453,1,"ArenaStage3::OnKilled2";
	sleep 500;
	announce "�A�g�X: �N���A���� : �����X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled2:
	callfunc "ArenaKilled",3,3,"�A�g�X",.mob;
	end;
OnSummon3:
	set .mob,2;
	disablenpc "Arena3warp#4";
	monster "force_4-1",23,174,"�A�T���g�^�[�g��",1364,1,"ArenaStage3::OnKilled3";
	monster "force_4-1",18,173,"�A�T���g�^�[�g��",1364,1,"ArenaStage3::OnKilled3";
	monster "force_4-1",26,173,"���v���Ǘ���",1527,1;
	monster "force_4-1",21,173,"�}���I�l�b�g",1459,1;
	monster "force_4-1",31,173,"���v���Ǘ���",1527,1;
	monster "force_4-1",26,178,"�}���I�l�b�g",1459,1;
	monster "force_4-1",21,178,"�}���I�l�b�g",1459,1;
	monster "force_4-1",31,178,"�}���I�l�b�g",1459,1;
//	monster "force_4-1",26,186,"�T�C�h���C���_�[",1424,1;
	monster "force_4-1",26,161,"�T�C�h���C���_�[",1424,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : �A�T���g�^�[�g����S�đގ����Ă�������",9;
	end;
OnKilled3:
	callfunc "ArenaKilled",3,4,"�A�g�X",.mob;
	end;
OnSummon4:
	set .mob,4;
	disablenpc "Arena3warp#5";
	monster "force_4-1",80,172,"�����",1471,1,"ArenaStage3::OnKilled4";
	monster "force_4-1",105,172,"�����",1471,1,"ArenaStage3::OnKilled4";
	monster "force_4-1",90,172,"�����",1471,1,"ArenaStage3::OnKilled4";
	monster "force_4-1",117,172,"�����",1471,1,"ArenaStage3::OnKilled4";
	monster "force_4-1",99,174,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_4-1",101,174,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_4-1",103,174,"�A�[�`���[�X�P���g��",1420,1;
//	monster "force_4-1",105,174,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_4-1",107,174,"�A�[�`���[�X�P���g��",1420,1;
	monster "force_4-1",109,177,"�p�T�i",1464,1;
	monster "force_4-1",99,170,"�~�m�^�E���X",1461,1;
//	monster "force_4-1",111,170,"�~�m�^�E���X",1461,1;
	monster "force_4-1",110,170,"���[���@�S�[����",1549,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : ����ς�S�đގ����Ă�������",9;
	end;
OnKilled4:
	callfunc "ArenaKilled",3,5,"�A�g�X",.mob;
	end;
OnSummon5:
	set .mob,4;
	disablenpc "Arena3warp#6";
	monster "force_4-1",164,174,"�v�e�B�b�g",1465,1,"ArenaStage3::OnKilled5";
	monster "force_4-1",169,159,"�v�e�B�b�g",1465,1,"ArenaStage3::OnKilled5";
	monster "force_4-1",174,183,"�v�e�B�b�g",1465,1,"ArenaStage3::OnKilled5";
	monster "force_4-1",177,170,"�v�e�B�b�g",1465,1,"ArenaStage3::OnKilled5";
	monster "force_4-1",168,190,"�v�e�B�b�g",1466,1;
//	monster "force_4-1",173,166,"�v�e�B�b�g",1466,1;
//	monster "force_4-1",171,170,"�v�e�B�b�g",1466,1;
	monster "force_4-1",188,167,"�v�e�B�b�g",1466,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : �v�e�B�b�g�n��S�đގ����Ă�������",9;
	end;
OnKilled5:
	monster "force_4-1",168,190,"�v�e�B�b�g",1466,1;
//	monster "force_4-1",173,166,"�v�e�B�b�g",1466,1;
//	monster "force_4-1",171,170,"�v�e�B�b�g",1466,1;
	monster "force_4-1",188,167,"�v�e�B�b�g",1466,1;
	callfunc "ArenaKilled",3,6,"�A�g�X",.mob;
	end;
OnSummon6:
	set .mob,6;
	disablenpc "Arena3warp#7";
	monster "force_4-1",173,118,"�o�t�H���b�gJr.",1431,1,"ArenaStage3::OnKilled6";
	monster "force_4-1",173,90,"�o�t�H���b�gJr.",1431,1,"ArenaStage3::OnKilled6";
//	monster "force_4-1",177,72,"�o�t�H���b�gJr.",1431,1,"ArenaStage3::OnKilled6";
	monster "force_4-1",171,108,"�f�r���`",1433,1,"ArenaStage3::OnKilled6";
	monster "force_4-1",171,85,"�f�r���`",1433,1,"ArenaStage3::OnKilled6";
	monster "force_4-1",171,79,"�A���X",1521,1,"ArenaStage3::OnKilled6";
	monster "force_4-1",172,118,"�A���X",1521,1,"ArenaStage3::OnKilled6";
//	monster "force_4-1",175,99,"�A���X",1521,1,"ArenaStage3::OnKilled6";
	sleep 500;
	announce "�A�g�X: �N���A���� : �����X�^�[��S�đގ����Ă�������",9;
	end;
OnKilled6:
	callfunc "ArenaKilled",3,7,"�A�g�X",.mob;
	end;
OnSummon7:
	set .mob,3;
	disablenpc "Arena3warp#8";
	monster "force_4-1",165,27,"�I�b�g�[",1533,1,"ArenaStage3::OnKilled7";
	monster "force_4-1",184,23,"�I�b�g�[",1533,1,"ArenaStage3::OnKilled7";
	monster "force_4-1",174,19,"�I�b�g�[",1533,1,"ArenaStage3::OnKilled7";
//	monster "force_4-1",160,34,"�����l",1451,1;
	monster "force_4-1",163,27,"�����l",1451,1;
	monster "force_4-1",163,23,"�����l",1451,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : �I�b�g�[��S�đގ����Ă�������",9;
	end;
OnKilled7:
	callfunc "ArenaKilled",3,8,"�A�g�X",.mob;
	end;
OnSummon8:
	disablenpc "Arena3warp#1";
	enablenpc "Arena3warp#9";
	sleep 500;
	announce "�A�g�X: �k�o������E�o���Ă��������I",9;
	end;
OnSummon9:
	set .mob,1;
	disablenpc "Arena3warp#10";
	monster "force_4-1",99,99,"�G���V�F���g�}�~�[",1522,1,"ArenaStage3::OnKilled9";
	monster "force_4-1",91,99,"�A���S�X",1430,1;
	monster "force_4-1",95,105,"�A���S�X",1430,1;
	monster "force_4-1",122,99,"�A���S�X",1430,1;
	monster "force_4-1",88,107,"�A���S�X",1430,1;
	monster "force_4-1",85,104,"�A���S�X",1430,1;
	sleep 500;
	announce "�A�g�X: �N���A���� : �{�X�����X�^�[�A�G���V�F���g�}�~�[�o���I�G���V�F���g�}�~�[��|���Ă�������",9;
	end;
OnKilled9:
	callfunc "ArenaKilled",3,10,"�A�g�X",.mob;
	if(.mob <= 0)
		set .time,getnpctimer(0,"�A�g�X#arena");	//�^�C���L�^
	end;
//�N���A����1���^�C�}�[
OnTimer2000:
	mapannounce "prt_are_in","�^�C���A�^�b�NLV80�`99�Ɋւ���ē������ł��B",0,0xFFCE00;
	end;
OnTimer3000:
	mapannounce "prt_are_in","�~���Ȑi�s�̂��߁A�N���A��T���̑؍݂�1���Ƃ����Ă��������Ă��܂��B",0,0xFFCE00;
	end;
OnTimer4000:
	mapannounce "prt_are_in","�A���[�i�|�C���g�̎󂯎��͑��₩�ɂ��ς܂����������B",0,0xFFCE00;
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "prt_are_in",66,178,81,195,"arena_room",100,75;
	enablewaitingroomevent "[LV 80]�T��#arena";
	end;
}

force_4-1,62,25,0	script	Arena3warp#1	45,1,1,{
	set .@num,strnpcinfo(2);
	switch(.@num) {
		case 1: warp "force_4-1",40,26; 	break;
		case 2: warp "force_4-1",25,69; 	break;
		case 3: warp "force_4-1",25,159; 	break;
		case 4: warp "force_4-1",69,174; 	break;
		case 5: warp "force_4-1",159,174; 	break;
		case 6: warp "force_4-1",174,130; 	break;
		case 7: warp "force_4-1",174,40; 	break;
		case 8: warp "force_4-1",132,26; 	break;
		case 9: warp "force_4-1",99,86; 	break;
	}
	donpcevent "ArenaStage3::OnSummon"+.@num;
	end;
}

force_4-1,25,44,0		duplicate(Arena3warp#1)		Arena3warp#2	45,1,1
force_4-1,25,134,0		duplicate(Arena3warp#1)		Arena3warp#3	45,1,1
force_4-1,44,173,0		duplicate(Arena3warp#1)		Arena3warp#4	45,1,1
force_4-1,134,173,0		duplicate(Arena3warp#1)		Arena3warp#5	45,1,1
force_4-1,174,155,0		duplicate(Arena3warp#1)		Arena3warp#6	45,1,1
force_4-1,174,65,0		duplicate(Arena3warp#1)		Arena3warp#7	45,1,1
force_4-1,155,26,0		duplicate(Arena3warp#1)		Arena3warp#8	45,1,1
force_4-1,99,54,0		duplicate(Arena3warp#1)		Arena3warp#9	45,1,1

force_4-1,99,123,0	script	Arena3warp#10	45,1,1,{
	stopnpctimer "�A�g�X#arena";
	initnpctimer "ArenaStage3";
	warp "prt_are_in",74,192;
	end;
}

prt_are_in,77,187,3	script	�i�s�v��	67,{
	callfunc "ArenaClear",3,80,"LV80�`99";
	end;
}

prt_are_in,181,187,3	duplicate(�i�s�v��#arenafailed)	�i�s�v��	67


//==============================================================================
// �p�[�e�B�[��
//==============================================================================
arena_room,158,93,4	script	�R���p�j�I�� ���[�N	828,{
	mes "[���[�N]";
	mes "����ɂ��́B";
	mes "�p�[�e�B�[��̐�����S�����Ă܂��A";
	mes "���[�N�ł��B";
	mes "�p�[�e�B�[��͌l��Ƃ��Ȃ�Ⴄ�̂�";
	mes "�����ƕ����Ă��������B";
	next;
	mes "[���[�N]";
	mes "^3131FF�p�[�e�B�[��^000000�́A";
	mes "^FF0000���x��10^000000����^FF0000���x��99^000000�܂�";
	mes "����\�ł��B";
	next;
	mes "[���[�N]";
	mes "5�l�Ńp�[�e�B�[��g��ł����";
	mes "�Q���ł��܂��B";
	mes "���ꗿ�́A��1�l1000z�ł��B";
	next;
	mes "[���[�N]";
	mes "����ł́A�A���[�i�i�s�Ɋւ���";
	mes "�������܂��B";
	next;
	mes "[���[�N]";
	mes "�܂��A^3131FF���Ԃƃp�[�e�B�[��g���^000000";
	mes "�T����^3131FF�`���b�g���[����^000000���Ԃ�҂���";
	mes "���������B�����ł����A^3131FF�K��^000000�p�[�e�B�[";
	mes "��g��ł��Q�����������B�p�[�e�B�[��";
	mes "�g�܂Ȃ��ł̎Q���Ńg���u�����N������";
	mes "���A������͑Ή����������˂܂��B";
	next;
	mes "[���[�N]";
	mes "�`���b�g���[���ɂ́A�p�[�e�B�[��";
	mes "�g��^3131FF5�l�S��^000000�œ����Ă��������B";
	next;
	mes "[���[�N]";
	mes "�����Œ��ӂł����A�`���b�g���[������";
	mes "���ԂɁA�p�[�e�B�[�����o�[�ȊO�̕���";
	mes "�r���������Ă���ƁA���̕����ꏏ��";
	mes "�]������Ă��܂��܂��B";
	mes "�C�����Ă��������B";
	next;
	mes "[���[�N]";
	mes "�`���b�g���[���őҋ@���A���ԂɂȂ��";
	mes "�S���R���p�j�I��������}�b�v�Ɉړ�";
	mes "���܂��B�p�[�e�B�[�������Ȃ��܂�";
	mes "�ړ����Ă��܂����ꍇ�A�}�b�v����";
	mes "���[�v�ōT���̂���ꏊ�ɖ߂�܂��B";
	next;
	mes "[���[�N]";
	mes "�p�[�e�B�[����J�n���鎞�́A�S���҂�";
	mes "�b��������Ɛi�s�ł��܂��B�S���҂ɂ�";
	mes "�Y���}�b�v�ɂ���^FF0000�N��1�l^000000��";
	mes "�b��������Α��v�ł��B";
	next;
	mes "[���[�N]";
	mes "�p�[�e�B�[����J�n����ƁA���̏��";
	mes "����S�����A���[�i���Ɉړ����܂���";
	mes "^3131FF���ꗿ������Ȃ���^000000�͓���o���܂���B";
	next;
	mes "[���[�N]";
	mes "�A���[�i�O�̍T���̎��Ԃ�^FF00001��^000000�ł��̂�";
	mes "�����ӂ��������B";
	next;
	mes "[���[�N]";
	mes "�A���[�i����Ɠ����ɃJ�E���g��";
	mes "�n�܂�܂��B";
	mes "^3131FF�X������^000000���N���A�������o�肵�܂��B";
	mes "���̏������N���A���āA�S�[����";
	mes "�ڎw���Ă��������B";
	next;
	mes "[���[�N]";
	mes "�҂����Ԃ�^3131FF10��^000000�ł��B";
	mes "���ʂɂł��鎞�Ԃ͂���܂��񂩂�";
	mes "���ӂ��Ă��������B";
	next;
	mes "[���[�N]";
	mes "�Ō�̃{�X���[�����N���A�����";
	mes "^3131FF�I���T��^000000�Ɉړ����܂��B";
	mes "^3131FF�I���T��^000000�ɂ�1�����������܂��񂩂�";
	mes "�f�����A�S���҂���A���[�i�|�C���g��";
	mes "������Ă��������B";
	next;
	mes "[���[�N]";
	mes "�I���T���ŃA���[�i�|�C���g���󂯎��";
	mes "���Ƃ��ł��Ȃ������ꍇ�A�A���[�i";
	mes "�|�C���g�̕⏞�͍s���Ă���܂���̂�";
	mes "���ꂮ��������ӂ��������B";
	next;
	mes "[���[�N]";
	mes "�p�[�e�B�[���V�L�^��B�������ꍇ�A";
	mes "^3131FF�p�[�e�B�[��^000000��a����";
	mes "�L�^���邱�Ƃ��o���܂��B";
	next;
	mes "[���[�N]";
	mes "�N���A���Ƀp�[�e�B�[�����o�[��������";
	mes "�����^FF0000����ȋL�^���o���܂���^000000�̂�";
	mes "�K���J�n�O��5�l�p�[�e�B�[��g�݁A";
	mes "�S���ŎQ������悤���肢���܂��B";
	next;
	mes "[���[�N]";
	mes "�p�[�e�B�[��ɂ��Ă͈ȏ�ł��B";
	mes "���Ȃ��̂��Q���A���҂����Ă��܂��B";
	close;
}

arena_room,158,82,0	script	�R���p�j�I�� ���j	828,{
	emotion 21;
	mes "[���j]";
	mes "���b�V���[�b�I";
	mes "���j�ɁA���C���ł���[�b!!";
	next;
	mes "[���j]";
	mes "���A���ɐl�����邩���Ȃ���";
	mes "�킩��Ȃ��ĕs���Ȃ�ł���H";
	mes "��[���A���j�������Ă����܂��傤�[�b";
	next;
	mes "[���j]";
	mes "�ǁ[��ǂ�c�c";
	next;
	if(getareausers("prt_are_in",66,74,81,91) || getmapusers("force_1-2")) {
		emotion 24;
		mes "[���j]";
		mes " Y E S - !!";
		mes "�N�����ɋ���݂����`";
		next;
		mes "[���j]";
		mes "����������Ƒ҂Ɨǂ��`����";
		mes "�����A���ȁB";
	}
	else {
		emotion 25;
		mes "[���j]";
		mes " N O - !!!!!!!";
		mes "�N�����Ȃ��b�B�悵�A�o�w���[�b��";
	}
	close;
}

arena_room,162,88,2	script	�|�m#arena	124,{
	end;
OnInit:
	waitingroom "�p�[�e�B�[��[5�l����]",10,"�|�m#arena::OnStart",5,1000,10,99;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid getvariableofnpc(.id,"�R���p�j�I��#arena");
	initnpctimer "�R���p�j�I��#arena";
	warpwaitingpc "prt_are_in",73,78;
	end;
}

prt_are_in,76,87,3	script	�R���p�j�I��#arena	67,{
	if(.flag) {
		mes "[�����[]";
		mes "���̕����b���������܂����̂�";
		mes "�����A������̑Ή������Ă���܂��B";
		mes "���̂܂܂��҂��������B";
		mes "�A���A1���ȏ�o�߂��Ă��܂����ۂ́A";
		mes "�ēx�`���b�g���[������̂������";
		mes "���肢���܂��B";
		close;
	}
	set .flag,1;
	mes "[�����[]";
	mes "����ɂ��́B";
	mes "������ŃA���[�i�p�p�[�e�B�[��";
	mes "�������Ă����Ă��������B";
	next;
	mes "[�����[]";
	mes "������ɂ�1���ȏ�؍݂ł��܂���B";
	mes "�����A���[�i�Ɉړ����܂����H";
	next;
	if(select("����������ƍl����","�ړ�����")==1) {
		mes "[�����[]";
		mes "�킩��܂����B";
		mes "�A���A1���ȏ�o�߂��Ă��܂����ۂ́A";
		mes "�ēx�`���b�g���[������̂������";
		mes "���肢���܂��B";
		set .flag,0;
		close;
	}
	mes "[�����[]";
	mes "�A���[�i�ֈړ����܂��`�B";
	mes "�A���[�i�s�����[�v���J���܂��B";
	mes "�����X�^�[�Ƃ̎����𐶂��c��A";
	mes "���̉h���Ƌ��ɂ������̖��O��";
	mes "���j�ɍ��ݍ��߂�悤";
	mes "���F�肵�Ă���܂��B";
	close2;
	stopnpctimer;
	killmonsterall "force_1-2";
	for(set .@i,0; .@i<5; set .@i,.@i+1) {
		if(attachrid(.id[.@i])) {
			set .@dummy,getmapxy(.@map$,.@x,.@y,BL_PC);
			if(Zeny >= 1000 && .@map$ == "prt_are_in" && .@x >= 66 && .@x <= 81 && .@y >= 74 && .@y <= 91) {
				set Zeny,Zeny-1000;
				warp "force_1-2",99,26;
			}
		}
	}
	areawarp "prt_are_in",66,74,81,91,"arena_room",100,75;
	set .flag,0;
	donpcevent "�X������#arena::OnStart";
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "prt_are_in",66,74,81,91,"arena_room",100,75;
	set .flag,0;
	enablewaitingroomevent "�|�m#arena";
	end;
}
prt_are_in,73,74,0	warp	Arena4warp	1,1,arena_room,100,75

force_1-2,99,31,4	script	�X������#arena	124,{
	end;
OnStart:
	set .count,10;
	initnpctimer;
	sleep 2000;
	announce "�X������: ����ɂ��́B�^�C���A�^�b�N�o�g���A�p�[�e�B�[��Z�N�V�����i��ҁA�X�������ł��I",9;
	sleep 1000;
	announce "�X������: ������̃A���[�i�ł́A�����X�^�[�̑S�ł��ڕW�ł��B",9;
	sleep 1000;
	announce "�X������: �܂��́A���������E���E�ǂꂩ�̕����ɐi��ł��������B",9;
	sleep 1000;
	announce "�X������: �������Ԃ�10���ł��B�݂Ȃ���̗E�p�����҂��Ă���܂��I",9;
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
	set .count,.count-1;
	if(.count)
		announce "�X������: �c�莞�� : " +.count+ " ��",9;
	else
		announce "�X������: ���Ԑ؂�ł��B�c�O�I",9;
	end;
OnTimer605000:
	stopnpctimer;
	areawarp "force_1-2",0,0,200,200,"prt_are_in",177,140;
	set getvariableofnpc(.flag,"ArenaStage4"),0;
	enablewaitingroomevent "�|�m#arena";
	end;
}

force_1-2,0,0,0	script	ArenaStage4	-1,{
OnSummon1:
	if(.flag&0x001)
		end;
	set .flag,.flag|0x001;
	set .mob1,26;
	disablenpc "Arena4warp#4";
	monster "force_1-2",15,35,"�y�m���i",1441,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",35,35,"�y�m���i",1441,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",15,15,"�y�m���i",1441,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",35,15,"�y�m���i",1441,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",15,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",17,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",19,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",21,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",15,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",17,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",19,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",21,25,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",15,30,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",17,22,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",19,32,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",21,22,"�N���b�N",1528,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",26,33,"���v���Ǘ���",1527,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",26,33,"���v���Ǘ���",1527,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",26,14,"�G���V�F���g���[��",1567,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",30,27,"�G���V�F���g���[��",1567,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",29,25,"�G���V�F���g���[��",1567,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",26,14,"�G���V�F���g���[��",1567,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",33,26,"�C���L���o�X",1580,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",29,28,"�C���L���o�X",1580,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",33,20,"�C���L���o�X",1580,1,"ArenaStage4::OnKilled1";
	monster "force_1-2",33,30,"�C���L���o�X",1580,1,"ArenaStage4::OnKilled1";
	end;
OnKilled1:
	set .mob1,.mob1-1;
	if(.mob1)
		end;
	set .flag,.flag|0x002;
	enablenpc "Arena4warp#4";
	if(.flag == 0x03F) {
		enablenpc "Arena4warp#7";
		announce "�X������: ����4�Ԗڂ̕����̃h�A���J���܂����I",9;
	}
	else
		announce "�X������: �N���A�I�������̃h�A���J���܂����I",9;
	end;
OnSummon2:
	if(.flag&0x004)
		end;
	set .flag,.flag|0x004;
	set .mob2,30;
	disablenpc "Arena4warp#5";
	monster "force_1-2",163,36,"�y�m���i",1441,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",184,36,"�y�m���i",1441,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",184,16,"�y�m���i",1441,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",163,16,"�y�m���i",1441,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",171,37,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",177,37,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",184,29,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",184,22,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",177,16,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",170,16,"�W���[�J�[",1437,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",169,28,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",171,28,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",173,28,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",175,28,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",177,28,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",177,23,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",175,23,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",173,23,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",171,23,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",169,23,"�o�[�X���[",1525,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,30,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,30,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,30,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,22,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,22,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",187,22,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",173,40,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",173,40,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",181,25,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	monster "force_1-2",181,25,"�A�N���E�X",1477,1,"ArenaStage4::OnKilled2";
	end;
OnKilled2:
	set .mob2,.mob2-1;
	if(.mob2)
		end;
	set .flag,.flag|0x008;
	enablenpc "Arena4warp#5";
	if(.flag == 0x03F) {
		enablenpc "Arena4warp#7";
		announce "�X������: ����4�Ԗڂ̕����̃h�A���J���܂����I",9;
	}
	else
		announce "�X������: �N���A�I�������̃h�A���J���܂����I",9;
	end;
OnSummon3:
	if(.flag&0x010)
		end;
	set .flag,.flag|0x010;
	set .mob3,26;
	disablenpc "Arena4warp#6";
	disablenpc "Arena4warp#7";
	disablenpc "Arena4warp#9";
	monster "force_1-2",89,81,"�����l",1451,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",90,81,"�����l",1451,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",91,81,"�����l",1451,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",92,81,"�����l",1451,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",93,81,"�����l",1451,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",96,85,"�E�B���h�S�[�X�g",1450,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",98,85,"�E�B���h�S�[�X�g",1450,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",100,85,"�E�B���h�S�[�X�g",1450,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",102,85,"�E�B���h�S�[�X�g",1450,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",104,85,"�E�B���h�S�[�X�g",1450,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",88,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",90,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",92,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",94,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",96,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",98,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",100,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",102,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",104,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",106,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",108,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",110,79,"�f�r���`",1433,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",91,86,"�f�r����",1490,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",108,86,"�f�r����",1490,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",91,69,"�f�r����",1490,1,"ArenaStage4::OnKilled3";
	monster "force_1-2",108,69,"�f�r����",1490,1,"ArenaStage4::OnKilled3";
	end;
OnKilled3:
	set .mob3,.mob3-1;
	if(.mob3)
		end;
	set .flag,.flag|0x020;
	enablenpc "Arena4warp#6";
	if(.flag == 0x03F) {
		enablenpc "Arena4warp#7";
		announce "�X������: ����4�Ԗڂ̕����̃h�A���J���܂����I",9;
	}
	else
		announce "�X������: �N���A�I�암���̃h�A���J���܂����I",9;
	end;
OnSummon4:
	if(.flag&0x040)
		end;
	set .flag,.flag|0x040;
	set .mob,22;
	disablenpc "Arena4warp#8";
	monster "force_1-2",174,78,"�y�m���i",1441,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",184,78,"�y�m���i",1441,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",184,68,"�y�m���i",1441,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",174,68,"�y�m���i",1441,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",169,87,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",170,87,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",171,87,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",172,87,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",169,77,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",170,77,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",171,77,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",172,77,"���C�h���[�h",1478,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",183,83,"�f�b�h���[���C�X",1566,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",183,80,"�f�b�h���[���C�X",1566,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",183,73,"�f�b�h���[���C�X",1566,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",183,70,"�f�b�h���[���C�X",1566,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",179,77,"�f�b�h���[���C�X",1566,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",169,72,"�A�T���g�^�[�g��",1364,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",171,72,"�A�T���g�^�[�g��",1364,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",173,72,"�A�T���g�^�[�g��",1364,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",175,72,"�A�T���g�^�[�g��",1364,1,"ArenaStage4::OnKilled4";
	monster "force_1-2",177,72,"�A�T���g�^�[�g��",1364,1,"ArenaStage4::OnKilled4";
	end;
OnKilled4:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#8";
	enablenpc "Arena4warp#9";
	announce "�X������: ���̕������N���A���Ă��������I",9;
	end;
OnSummon5:
	if(.flag&0x080)
		end;
	set .flag,.flag|0x080;
	set .mob,24;
	disablenpc "Arena4warp#10";
	monster "force_1-2",25,68,"�y�m���i",1441,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",36,68,"�y�m���i",1441,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",16,88,"�y�m���i",1441,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",15,78,"�y�m���i",1441,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",33,89,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",29,87,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",25,81,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",25,78,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",25,72,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",29,70,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",21,70,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",19,76,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",19,83,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",23,89,"�X�e�B���O",1489,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",22,85,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",23,85,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",24,85,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",23,86,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",22,86,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",22,71,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",22,72,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",23,71,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",23,72,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	monster "force_1-2",24,71,"�N�����v",1570,1,"ArenaStage4::OnKilled5";
	end;
OnKilled5:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#10";
	announce "�X������: �k�����̃h�A���J���܂����I",9;
	end;
OnSummon6:
	if(.flag&0x100)
		end;
	set .flag,.flag|0x100;
	set .mob,22;
	disablenpc "Arena4warp#11";
	monster "force_1-2",24,127,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",27,127,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",24,128,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",27,128,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",24,129,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",27,129,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",19,135,"�V�א�l",1531,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",24,135,"�V�א�l",1531,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",28,135,"�V�א�l",1531,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",32,135,"�V�א�l",1531,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,140,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,136,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,132,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,128,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,124,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,120,"��V��",1563,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,140,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,136,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,132,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,128,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,124,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	monster "force_1-2",16,120,"�V�喺�X",1564,1,"ArenaStage4::OnKilled6";
	end;
OnKilled6:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#11";
	announce "�X������: �������̃h�A���J���܂����I",9;
	end;
OnSummon7:
	if(.flag&0x200)
		end;
	set .flag,.flag|0x200;
	set .mob,12;
	disablenpc "Arena4warp#12";
	monster "force_1-2",108,140,"�L����",1456,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",98,122,"�G�N�X�L���[�V���i�[",1487,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",98,122,"�J�[���b�c�o�[�O",1438,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",90,119,"�J�[���b�c�o�[�O",1438,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",104,134,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",104,136,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",104,137,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",104,139,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",111,134,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",111,136,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",111,137,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	monster "force_1-2",111,139,"�V���叫�R",1541,1,"ArenaStage4::OnKilled7";
	end;
OnKilled7:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#12";
	announce "�X������: �k�����̃h�A���J���܂����I",9;
	end;
OnSummon8:
	if(.flag&0x400)
		end;
	set .flag,.flag|0x400;
	set .mob,35;
	disablenpc "Arena4warp#13";
	monster "force_1-2",174,145,"�L����",1456,1,"ArenaStage4::OnKilled8";
	monster "force_1-2",174,145,"�S�[�X�g�����O",1576,1,"ArenaStage4::OnKilled8";
	monster "force_1-2",172,154,"�u���b�f�B�i�C�g",1569,1,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"�C���W���X�e�B�X",1446,5,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"���C�h���b�N�A�[�`���[",1453,1,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"�i�C�g���A�e���[",1554,5,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"�G���V�F���g�}�~�[",1522,6,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"�X�P���v���Y�i�[",1479,10,"ArenaStage4::OnKilled8";
	areamonster "force_1-2",162,122,184,185,"�n���^�[�t���C",1422,5,"ArenaStage4::OnKilled8";
	end;
OnKilled8:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#13";
	announce "�X������: �������̃h�A���J���܂����I",9;
	end;
OnSummon9:
	if(.flag&0x800)
		end;
	set .flag,.flag|0x800;
	set .mob,15;
	disablenpc "Arena4warp#14";
	disablenpc "Arena4warp#16";
	monster "force_1-2",122,177,"���[���@�S�[����",1549,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",112,179,"���[���@�S�[����",1549,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",122,178,"�A�m���A��",1488,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",121,177,"�A�m���A��",1488,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",122,177,"�A�m���A��",1488,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",86,180,"�G���_�[",1573,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",86,176,"�G���_�[",1573,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",95,183,"�G���_�[",1573,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",94,175,"�G���_�[",1573,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",76,178,"�G���_�[",1573,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",84,179,"�G�N�X�v���[�W����",1532,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",74,181,"�G�N�X�v���[�W����",1532,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",73,176,"�G�N�X�v���[�W����",1532,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",62,178,"�G�N�X�v���[�W����",1532,1,"ArenaStage4::OnKilled9";
	monster "force_1-2",68,177,"�G�N�X�v���[�W����",1532,1,"ArenaStage4::OnKilled9";
	end;
OnKilled9:
	set .mob,.mob-1;
	if(.mob)
		end;
	enablenpc "Arena4warp#14";
	announce "�X������: �������̃h�A���J���܂����I",9;
	end;
OnSummon10:
	if(.flag&0x1000)
		end;
	set .flag,.flag|0x1000;
	disablenpc "Arena4warp#15";
	if(rand(2))
		monster "force_1-2",16,179,"���։�",1529,1,"ArenaStage4::OnKilled10_1";
	else
		monster "force_1-2",24,179,"�h���L����",1530,1,"ArenaStage4::OnKilled10_1";
	end;
OnKilled10_1:
	set .mob,6;
	monster "force_1-2",16,179,"���앐�m",1542,1,"ArenaStage4::OnKilled10_2";
	monster "force_1-2",16,179,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled10_2";
	monster "force_1-2",16,179,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled10_2";
	monster "force_1-2",16,179,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled10_2";
	monster "force_1-2",16,179,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled10_2";
	monster "force_1-2",16,179,"�J�u�L�E��",1560,1,"ArenaStage4::OnKilled10_2";
	end;
OnKilled10_2:
	set .mob,.mob-1;
	if(.mob)
		end;
	set .time,getnpctimer(0,"�X������#arena");
	enablenpc "Arena4warp#15";
	announce "�X������: �{�X�X�e�[�W���N���A�I���o������E�o���Ă��������I",9;
	end;
OnSummon11:
	if(.flag&0x2000)
		end;
	set .flag,.flag|0x2000;
	enablenpc "Arena4warp#16";
	monster "force_1-2",95,177,"���悤�Ȃ�",1393,1;
	monster "force_1-2",95,177,"���Ȃ�������",1543,1;
	monster "force_1-2",95,177,"�`���R���[�g���D��",1472,1;
	monster "force_1-2",95,177,"���Ȃ��͍D���ł����H",1472,1;
	monster "force_1-2",95,177,"���߂�Ȃ���",1420,1;
	monster "force_1-2",95,177,"�g���X�^��2��",1562,1;
	monster "force_1-2",95,177,"�����󂢂�",1468,1;
	monster "force_1-2",95,177,"�o�C�o�C",1419,1;
	monster "force_1-2",95,177,"����",1394,1;
	monster "force_1-2",95,177,"�Z�N�V�[�{�f�B",1578,1;
	monster "force_1-2",95,177,"�v���b�V���[",1471,1;
	monster "force_1-2",95,177,"�C�y��",1491,1;
	monster "force_1-2",95,177,"�@������ł����H",1555,1;
	monster "force_1-2",95,177,"���l",1428,1;
	monster "force_1-2",95,177,"�L������",1472,1;
	monster "force_1-2",95,177,"�i���Z",1472,1;
	monster "force_1-2",95,177,"�p�[�g�^�C�}�[",1420,1;
	monster "force_1-2",95,177,"�{�X",1562,1;
	monster "force_1-2",95,177,"�Â����F�̔�",1474,1;
	monster "force_1-2",95,177,"�R�E����",1419,1;
	monster "force_1-2",95,177,"�G�L�X�g��",1394,1;
	monster "force_1-2",95,177,"�~���N���l",1578,1;
	monster "force_1-2",95,177,"�_�[����",1471,1;
	monster "force_1-2",95,177,"�S",1491,1;
	monster "force_1-2",95,177,"���C�X����Ȃ���",1566,1;
	monster "force_1-2",95,177,"���C�X�}�}",1566,1;
	monster "force_1-2",95,177,"���C�X�p�p",1566,1;
	monster "force_1-2",95,177,"�u�b�N[3]",1478,1;
	monster "force_1-2",95,177,"�������L",1478,1;
	sleep 500;
	announce "�X������: �����X�^�[������Ėk�o������E�o���Ă��������I",9;
	end;
//�N���A����1���^�C�}�[
OnTimer2000:
	mapannounce "prt_are_in","�^�C���A�^�b�N�p�[�e�B��Ɋւ���ē������ł��B",0,0xFFCE00;
	end;
OnTimer3000:
	mapannounce "prt_are_in","�~���Ȑi�s�̂��߁A�N���A��T���̑؍݂�1���Ƃ����Ă��������Ă��܂��B",0,0xFFCE00;
	end;
OnTimer4000:
	mapannounce "prt_are_in","�A���[�i�|�C���g�̎󂯎��͑��₩�ɂ��ς܂����������B",0,0xFFCE00;
	end;
OnTimer60000:
	stopnpctimer;
	areawarp "force_1-2",0,0,200,200,"arena_room",100,75;
	areawarp "prt_are_in",66,126,81,143,"arena_room",100,75;
	enablewaitingroomevent "�|�m#arena";
	set .flag,0;
	end;
}

force_1-2,85,26,0	script	Arena4warp#1	45,1,1,{
	set .@num,strnpcinfo(2);
	switch(.@num) {
		case 1: warp "force_1-2",37,26;	donpcevent "ArenaStage4::OnSummon1";	break;
		case 2: warp "force_1-2",162,26;	donpcevent "ArenaStage4::OnSummon2";	break;
		case 3: warp "force_1-2",99,66;	donpcevent "ArenaStage4::OnSummon3";	break;
		case 4: warp "force_1-2",89,26; 	break;
		case 5: warp "force_1-2",110,26;	break;
		case 6: warp "force_1-2",99,36; 	break;
		case 7: warp "force_1-2",162,78;	donpcevent "ArenaStage4::OnSummon4";	break;
		case 8: warp "force_1-2",110,78; 	break;
		case 9: warp "force_1-2",37,78;	donpcevent "ArenaStage4::OnSummon5";	break;
		case 10: warp "force_1-2",26,118;	donpcevent "ArenaStage4::OnSummon6";	break;
		case 11: warp "force_1-2",91,125;	donpcevent "ArenaStage4::OnSummon7";	break;
		case 12: warp "force_1-2",173,118;	donpcevent "ArenaStage4::OnSummon8";	break;
		case 13: warp "force_1-2",133,178;	donpcevent "ArenaStage4::OnSummon9";	break;
		case 14: warp "force_1-2",29,178;	donpcevent "ArenaStage4::OnSummon10";	break;
		case 15: warp "force_1-2",59,178;	donpcevent "ArenaStage4::OnSummon11";	break;
	}
	//donpcevent "ArenaStage4::OnSummon"+.@num;
	end;
}

force_1-2,114,26,0		duplicate(Arena4warp#1)		Arena4warp#2	45,1,1
force_1-2,99,40,0		duplicate(Arena4warp#1)		Arena4warp#3	45,1,1
force_1-2,41,26,0		duplicate(Arena4warp#1)		Arena4warp#4	45,1,1
force_1-2,158,26,0		duplicate(Arena4warp#1)		Arena4warp#5	45,1,1
force_1-2,99,63,0		duplicate(Arena4warp#1)		Arena4warp#6	45,1,1
force_1-2,115,78,0		duplicate(Arena4warp#1)		Arena4warp#7	45,1,1
force_1-2,158,77,0		duplicate(Arena4warp#1)		Arena4warp#8	45,1,1
force_1-2,84,77,0		duplicate(Arena4warp#1)		Arena4warp#9	45,1,1
force_1-2,25,93,0		duplicate(Arena4warp#1)		Arena4warp#10	45,1,1
force_1-2,49,130,0		duplicate(Arena4warp#1)		Arena4warp#11	45,1,1
force_1-2,107,145,0		duplicate(Arena4warp#1)		Arena4warp#12	45,1,1
force_1-2,158,178,0		duplicate(Arena4warp#1)		Arena4warp#13	45,1,1
force_1-2,55,178,0		duplicate(Arena4warp#1)		Arena4warp#14	45,1,1
force_1-2,33,178,0		duplicate(Arena4warp#1)		Arena4warp#15	45,1,1
force_1-2,95,187,0	script	Arena4warp#16	45,1,1,{
	stopnpctimer "�X������#arena";
	initnpctimer "ArenaStage4";
	warp "prt_are_in",74,140;
	end;
}

prt_are_in,77,135,3	script	�i�s�v��	67,{
	mes "[�i�s�v��]";
	mes "�����l�ł����B";
	mes "�����O�́c�c";
	mes "^3131FF" +strcharinfo(0)+ "^000000�l�ł��ˁH";
	mes "^3131FF" +strcharinfo(0)+ "^000000�l��";
	mes "�A���[�i���N���A����̂ɂ�������";
	mes "���Ԃ́c�c";
	next;
	mes "[�i�s�v��]";
	set .@time,getvariableofnpc(.time,"ArenaStage4");
	mes .@time/60000+ "��" +.@time%60000/1000+ "�b�ł��I";
	if(.@time <= $ArenaTime[4] || $ArenaTime[4] == 0) {	//�p�[�e�B���L�^�X�V
		next;
		mes "[�i�s�v��]";
		mes "�E�I�I�b!!�@�V�L�^�[�[�[!!";
		mes "���߂łƂ��������܂�!!!!";
		next;
		mes "[�i�s�v��]";
		mes "^FF0000�^�C���A�^�b�N";
		mes "�p�[�e�B�[��Z�N�V����^000000�ɂ��Ȃ���";
		mes "�p�[�e�B�[^3131FF" +strcharinfo(1)+ "^000000��";
		mes "�L�^�������܂��B";
		next;
		mes "[�i�s�v��]";
		mes "�A���[�i�̋L�^�̊m�F��";
		mes "�A���[�i�T����^3131FF�A�E�F���L�[�v^000000��";
		mes "���₢���킹���������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł̓A���[�i�|�C���g��";
		mes "�x���������܂��B�V�L�^�B��";
		mes "�ł��̂ŁA�{�[�i�X�|�C���g��";
		mes "�x���������܂��B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�����ɂ����肵�܂��傤�B";
		mes "����ꂳ�܂ł����`�B�܂���";
		mes "���z�������҂����Ă���܂��B";
		close2;
		set $ArenaName$[4],strcharinfo(1);
		set $ArenaTime[4],.@time;
		set ARENA_PIT,ARENA_PIT+100;
	}
	else {
		mes "���߂łƂ��������܂�!!";
		next;
		mes "[�i�s�v��]";
		mes "���݁A�^�C���A�^�b�N";
		mes "�p�[�e�B�[��Z�N�V��������ԑ���";
		mes "�N���A�����p�[�e�B�[�́c�c";
		mes "^3131FF" +$ArenaName$[4]+ "^000000�l�ł��B";
		next;
		mes "[�i�s�v��]";
		mes "^3131FF" +$ArenaName$[4]+ "^000000�l��";
		mes "�^�C����^3131FF" +$ArenaTime[4]/60000+ "^000000��^3131FF" +$ArenaTime[4]%60000/1000+ "^000000�b�ł��B";
		next;
		mes "[�i�s�v��]";
		mes "�L�^�X�V�͐����܂���ł������A";
		mes "���̋@��ɂ͐��񐬌������Ă��������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�A���[�i�|�C���g��";
		mes "�x���������܂��B";
		mes "�A���[�i�|�C���g�̊m�F��";
		mes "�A���[�i�T����^3131FF�x���f�S�X^000000��";
		mes "���₢���킹���������B";
		next;
		mes "[�i�s�v��]";
		mes "����ł́A�����ɂ����肵�܂��傤�B";
		mes "����ꂳ�܂ł����`�B�܂���";
		mes "���z�������҂����Ă���܂��B";
		close2;
		set ARENA_PIT,ARENA_PIT+40;
	}
	warp "arena_room",100,75;
	end;
}

prt_are_in,181,135,3	duplicate(�i�s�v��#arenafailed)	�i�s�v��	67


//==============================================================================
// ���E�҃Z�N�V����
//
// �@�� $ArenaName$[] -> 1�ʋL�^�҂̃L�������A�v�f�̓��[�h���Ƃ�5�`9
//                       �i�ʏ킨���PT�Z�N�V������0�`4�j
//      $ArenaTime[]   -> �L�^�^�C���A�v�f�͓���
//==============================================================================

arena_room,94,82,2	script	�A���[�i�L�^�S��	79,{
	mes "[�}�e�B�A]";
	mes "����ɂ��́B";
	mes "�A���[�i�̐��E�҃Z�N�V������";
	mes "�L�^���Ǘ��E�ē����Ă���";
	mes "�}�e�B�A�Ɛ\���܂��B";
	mes "���Z�N�V�����̋L�^�́A������ɂ���";
	mes "�A�E�F���L�[�v�ɂ��q�˂��������B";
	next;
	mes "[�}�e�B�A]";
	mes "�e���[�h�ōŒZ���Ԃ�";
	mes "�L�^�������X�̂����O��";
	mes "�m�肽���̂ł����H";
	mes "����]�̃��[�h�����I�т��������B";
	next;
	switch (select("�A�R���C�g","��ʐE-LV70����","��ʐE-LV70�`79","��ʐE-LV80�`89","��ʐE-LV90�`Lv99")) {
		case 1: set .@word$,"�A�R���C�g���[�h"; 	break;
		case 2: set .@word$,"��ʐE���[�hLV70����"; 	break;
		case 3: set .@word$,"��ʐE���[�hLV70�`79"; 	break;
		case 4: set .@word$,"��ʐE���[�hLV80�`89"; 	break;
		case 5: set .@word$,"��ʐE���[�hLV90�`99"; 	break;
	}
	mes "[�}�e�B�A]";
	mes "���݁A���E�҃Z�N�V����";
	mes .@word$+ "�́A";
	mes "^3131FF" +$ArenaName$[@menu+4]+ "^000000�l��";
	mes "1�ʂł��B�L�^��";
	mes "^3131FF" +$ArenaTime[@menu+4]/60000+"^000000��^3131FF"+$ArenaTime[@menu+4]%60000/1000+"^000000�b�ł��B";
	close;
}

arena_room,114,102,0	script	#ArenaAcoMode	45,1,1,{
	if(getbaseclass(Class) == CLASS_AL) {
		warp "area_room",135,129;
		end;
	}
	mes "������́A�A�R���C�g��";
	mes "���̏�ʐE�̕���ΏۂƂ���";
	mes "���E�҃Z�N�V�����ł��B";
	close;
}

arena_room,140,136,2	script	�R���p�j�I���E�A���X	729,{
	mes "[�A���X]";
	mes "����ɂ��́B";
	mes "���͐��E�҃Z�N�V������";
	mes "�ē���S������A���X�ƌ����܂��B";
	mes "�ł́A���E�҃Z�N�V�����ɂ���";
	mes "���������܂��傤�B";
	next;
	mes "[�A���X]";
	mes "���E�҃Z�N�V�����ɂ́A";
	mes "^3131FF�A�R���C�g���[�h^000000��";
	mes "^3131FF��ʐE���[�h^000000������܂��B";
	next;
	mes "[�A���X]";
	mes "�A�R���C�g�₻�̏�ʐE�̕���";
	mes "^3131FF���E�ҍT��^000000�ɂ�";
	mes "�ҋ@���Ă��܂��ƁA";
	mes "�������̔ԂɂȂ莟��A";
	mes "�A���[�i�ɒ��킷�邱�Ƃ��ł��܂��B";
	mes "���ꗿ�́A����l�l1000z�ł��B";
	next;
	mes "[�A���X]";
	mes "�T�����͊F�l���ꏏ�ɂȂ�܂����A";
	mes "��Փx�ɂ��Ă͂��S�z����܂���B";
	mes "�e���̃��x���ɉ��������[�h��";
	mes "���p�ӂ��Ă���܂��B";
	next;
	mes "[�A���X]";
	mes "���Ē��ӎ����ł����A";
	mes "�A���[�i�ɓo�ꂷ��^3131FF�Ԃ���^000000��";
	mes "^3131FF�p�[���b�g�^�[�g��^000000�́A";
	mes "^FF0000�o���l�ƃA�C�e�����h���b�v����";
	mes "��ʃ����X�^�[^000000�ƂȂ��Ă���܂��B";
	mes "���������������B";
	next;
	mes "[�A���X]";
	mes "���ꂩ��A�A���[�i�Ɉړ���́A";
	mes "�i��҂�^3131FF�g���R^000000�̎w���ɏ]����";
	mes "���v�����Ɋe�������܂���Ă��������B";
	mes "���A�������Ԃ́A^3131FF8��^000000�ł��B";
	next;
	mes "[�A���X]";
	mes "�A���[�i�N���A��A";
	mes "���[�v�����N�������p�Ȃ���΁A";
	mes "^3131FF�T����^000000�Ɉړ����܂��B";
	next;
	mes "[�A���X]";
	mes "������ŃA���[�i�|�C���g��";
	mes "�󂯂Ƃ邱�Ƃ��ł��܂����A";
	mes "^3131FF1���ȏ�؍݂��邱�Ƃ�";
	mes "�ł��܂���^000000�̂�";
	mes "�����ӂ��������B";
	next;
	mes "[�A���X]";
	mes "1���o�߂��ĊO�֏o����́A";
	mes "�A���[�i�|�C���g��";
	mes "�󂯎�邱�Ƃ͂ł��܂���̂ŁA";
	mes "�K�����ԓ��Ƀ|�C���g��";
	mes "�󂯎���Ă��������B";
	mes "��낵���ł��傤���H";
	next;
	mes "[�A���X]";
	mes "����ł́A�悢�����I";
	mes "Good Luck!!";
	close;
}

arena_room,136,138,4	script	���E�ҍT��#arena	124,{
	end;
OnInit:
	//�����ł͑��E�r�����Ȃ����O�̂���
	waitingroom "�l��-���E�Ґ�p",20,"���E�ҍT��#arena::OnStart",1,1000,0,255,(1<<CLASS_AL)|(1<<CLASS_PR)|(1<<CLASS_MO),0;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			killmonsterall "force_5-1";
			donpcevent "�g�R��#arena::OnStart";
			//warp "force_5-1",100,12;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

force_5-1,0,0,0	script	�g�R��#arena	-1,{
OnStart:
	end;
}