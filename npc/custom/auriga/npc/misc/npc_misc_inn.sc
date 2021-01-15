//==============================================================================
// Ragnarok Online Inn Town Script	2005-05-22	by AthenaWiki
//==============================================================================

//�S��function�ɔ[�߂�
//  callfunc "TownInn",Num,"Name","Map",SaveX,SaveY,WarpX,WarpY;
//				Num = 0:���ʁA1:�Z�~�A2:�A���}�A3:�z�e��

function	script	TownInn	{
	next;
	switch (select("�ʒu�Z�[�u����","�h������ - 5000z","��߂�")) {
	case 1:
		savepoint getarg(2),getarg(3),getarg(4);
		mes "["+getarg(1)+"]";
		switch(getarg(0)) {
			case 0:
				mes "�ʒu�Z�[�u���܂����B";
				mes "�܂��̂����p�����҂����Ă���܂��B";
				return;
			case 1:
				mes "�͂��A�Z�[�u�ł��܂����B";
				mes "���肪�Ƃ��������܂����I";
				break;
			case 2:
				mes "�͂��A������ŃZ�[�u�ł��܂����B";
				mes "�����p���肪�Ƃ��������܁`���B";
				break;
			case 3:
				mes "�͂��A�ʒu�Z�[�u���s���܂����B";
				mes "�����p�A���肪�Ƃ��������܂��B";
				next;
				mes "[�z�e���E��]";
				mes "����ł́A�悢������B";
				return;
		}
		next;	//1,2����next���Ĕ�����
		break;
	case 2:
		if(Zeny<5000) {
			mes "["+getarg(1)+"]";
			switch(getarg(0)) {
			case 0:
				mes "�h������5000z�ɂȂ�܂��B";
				mes "������x�����������m�F���������B";
				return;
			case 1:
				mes "�h������5000z�ł����c�c";
				mes "������Ƃ���������Ȃ��݂����ł��ˁB";
				return;
			case 2:
				mes "�h������5000z�ł���B";
				mes "������x�A�����z�̒���";
				mes "�m�F���Ă��������܂��H";
				return;
			case 3:
				mes "�h�������́B5000zeny�ł��B";
				mes "���������ēx���m�F���������B";
				return;
			}
		}
		mes "["+getarg(1)+"]";
		switch(getarg(0)) {
			case 0: mes "��������肨�x�݂��������B"; 	break;
			case 1: mes "���������ǂ����`�B"; 		break;
			case 2: mes "���ЁA���낢�ł��������ˁ`�B"; 	break;
			case 3: mes "��������肨�x�݂��������B"; 	break;
		}
		close2;
		set Zeny,Zeny-5000;
		warp getarg(2),getarg(5),getarg(6);
		percentheal 100,100;
		end;
	}
	//�u��߂�v�Ȃ�fall through
	switch(getarg(0)) {
		case 0:
			break;
		case 1:
		case 2:
			mes "["+getarg(1)+"]";
			mes "�܂��̂��z�������҂����Ă���܂��`";
			break;
		case 3:
			mes "[�z�e���E��]";
			mes "�܂��̂��z�������҂����Ă���܂��B";
			break;
	}
	return;
}

// �v�����e��
prt_in,244,135,0	script	���ُ]�ƈ�	53,{
	mes "[�]�ƈ��Z�~]";
	mes "��������Ⴂ�܂��I";
	mes "���فu�l���J���X�v�{�قɂ悤�����`�B";
	mes "���q�l�A���̌�p�ł����H";
	callfunc "TownInn",1,"�]�ƈ��Z�~","prt_in",238,131,247,104;
	close;
}

prt_in,61,141,4	script	���ُ]�ƈ�	94,{
	mes "[�]�ƈ��A���}]";
	mes "��������Ⴂ�܂��I";
	mes "���فu�l���J���X�v�ʊقɂ悤�����`�B";
	mes "���q�l�A���̌�p�ł����H";
	callfunc "TownInn",2,"�]�ƈ��A���}","prt_in",63,136,60,166;
	close;
}

// �A�C���u���b�N
ein_in01,206,224,3	script	�z�e���E��	855,{
	mes "[�z�e���E��]";
	mes "�悤������������Ⴂ�܂����B";
	mes "���z�e���́A�����A�e�؁A";
	mes "�Ί�����b�g�[�ɁA";
	mes "���q�l�ɍō��̋x����񋟂���A";
	mes "�A�C���u���b�N�ō��̎{�݂ł��B";
	if(EIN_2QUE == 4) {	//�D���̉ߋ��N�G�X�g�Ŕ��s
		next;
		mes "[�z�e���E��]";
		mes "�f�B�[�^�[�E�A�[�N�l�ł����H";
		mes "���X���҂����������B";
		next;
		mes "[�z�e���E��]";
		mes "�A�[�N�l��201������";
		mes "�h�����Ă�������Ⴂ�܂��B";
		next;
		mes "[�z�e���E��]";
		mes "����ł́A�悢������B";
		close;
	}
	callfunc "TownInn",3,"�z�e���E��","ein_in01",201,223,272,167;
	close;
}

// �A���f�o����
aldeba_in,92,58,2	script	���ُ]�ƈ�	53,{
	mes "[�]�ƈ�������]";
	mes "��������Ⴂ�܂��B";
	mes "��������`�����܂��傤���H";
	callfunc "TownInn",0,"�]�ƈ�������","aldeba_in",93,50,92,112;
	close;
}

// (�V)�t�F�C����
payon_in01,132,62,2	script	���ُ]�ƈ�	53,{
	mes "[�]�ƈ��A�L]";
	mes "���A���q����";
	mes "������̓t�F�C�������قł��B";
	mes "��������`�����܂��傤���H";
	callfunc "TownInn",0,"�]�ƈ��A�L","payon_in01",135,62,132,11;
	close;
}

// �����N
//morocc_in,147,141,2	script	���ُ]�ƈ�	53,{
//	mes "[�]�ƈ��n�[�V��]";
//	mes "��������Ⴂ�܂��I";
//	mes "��������`�����܂��傤���H";
//	callfunc "TownInn",0,"�]�ƈ��n�[�V��","morocc_in",142,139,173,135;
//	close;
//}

//morocc_in,78,100,4	script	���ُ]�ƈ�	53,{
//	mes "[�]�ƈ��}�i��]";
//	mes "��������Ⴂ�܂��I";
//	mes "��������`�����܂��傤���H";
//	callfunc "TownInn",0,"�]�ƈ��}�i��","morocc_in",78,95,78,95;
//	close;
//}

// �A���x���^
alberta_in,32,142,2	script	���ُ]�ƈ�	53,{
	mes "[�]�ƈ��W�F�j�[]";
	mes "��������Ⴂ�܂��B";
	mes "������͗��كt�B�b�V���[�}���ł��B";
	mes "��������`�����܂��傤���H";
	callfunc "TownInn",0,"�]�ƈ��W�F�j�[","alberta_in",25,142,16,105;
	close;
}

// �Q�t�F��
geffen_in,70,64,3	script	���ُ]�ƈ�	53,{
	mes "[�]�ƈ��Z�i]";
	mes "��������Ⴂ�܂��B";
	mes "������̓Q�t�F���B���";
	mes "���كC�t���[�g�ł��B";
	mes "��������`�����܂��傤���H";
	callfunc "TownInn",0,"�]�ƈ��Z�i","geffen_in",70,60,31,31;
	close;
}

//���q�^���[��
//�@function�͎g��Ȃ�
lhz_in02,230,284,4	script	�z�e���]�ƈ�	86,{
	mes "[�z�e���]�ƈ�]";
	mes "�悤�����I�@���E�ō��̃z�e���A";
	mes "���C�����h���S���ł��B";
	mes "�q�����A�e��T�[�r�X�ȂǁA";
	mes "���̃z�e���Ƃ͔�ו��ɂȂ�܂���I";
	mes "���K�Ȋ��ł��q�l��";
	mes "�ō��̎��Ԃ�񑩒v���܂��B";
	next;
	switch(select("�ʒu���Z�[�u����","������Ƌx�� - 5000z","�A��")) {
	case 1:
		savepoint "lhz_in02",232,273;
		mes "[�z�e���]�ƈ�]";
		mes "�Z�[�u���܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		close;
	case 2:
		if(Zeny<5000) {
			mes "[�z�e���]�ƈ�]";
			mes "���p���� 5000z �ł��B";
			close;
		}
		mes "[�z�e���]�ƈ�]";
		mes "���������ǂ���";
		close2;
		sc_start 10,240000,10;	//SC_BLESSING
		set Zeny,Zeny-5000;
		warp "lhz_in02",220,150;
		percentheal 100,100;
		end;
	case 3:
		mes "[�z�e���]�ƈ�]";
		mes "���肪�Ƃ��������܂��B";
		mes "�܂����z�����������܂��B";
		close;
	}
}

//�t�B�Q��
hu_in01,246,107,3	script	���ِE��	53,{
	mes "[���ِE��]";
	mes "��������Ⴂ�܂��`";
	mes "�����̗��ق�";
	mes "���s�q�̂��߂ɂ������ꂢ��";
	mes "����₩�ȐQ��p�ӂ���Ă��܂��B";
	next;
	switch(select("�Z�[�u����","�h������-5000z","��߂�")) {
	case 1:
		savepoint "hu_in01",263,95;
		mes "[���ِE��]";
		mes "�͂��A������ŃZ�[�u���܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		next;
		mes "[���ِE��]";
		mes "����ł́A";
		mes "�y������������߂������������B";
		close;
	case 2:
		if(Zeny<5000) {
			mes "[���ِE��]";
			mes "���ٗ��p����5000Zeny�ł��B";
			mes "������������Ȃ��݂����ł��ˁB";
			close;
		}
		mes "[���ِE��]";
		mes "�ǂ������������B";
		close2;
		set Zeny,Zeny-5000;
		warp "hu_in01",267,5;
		percentheal 100,100;
		end;
	case 3:
		mes "[���ِE��]";
		mes "�܂��ǂ����`";
		close;
	}
}

//���w��
ra_in01,376,69,4	script	�z�e���E��	931,{
	mes "[�z�e���E��]";
	mes "���_�t���C���l�̌���삪";
	mes "���ɂ���񎖂��c�c";
	mes "�t���C���l�̉ʂĂ��Ȃ����̗l��";
	mes "�ō��̈��炬���ւ�";
	mes "���̃��w���z�e���ւ悤�����B";
	next;
	switch(select("�Z�[�u����","�x�� - 5000z","��߂�")) {
	case 1:
		savepoint "ra_in01",375,61;
		mes "[�z�e���E��]";
		mes "�͂��A�����ɃZ�[�u���܂����B";
		mes "�����p�A���肪�Ƃ��������܂��B";
		next;
		mes "[�z�e���E��]";
		mes "����ł́A";
		mes "�y������������߂������������I";
		close;
	case 2:
		if(Zeny<5000) {
			mes "[�z�e���E��]";
			mes "�z�e���̗��p�z�� 5000z �ł��B";
			mes "�������킹������Ȃ��悤�ł��ˁB";
			close;
		}
		mes "[�z�e���E��]";
		mes "�ł́A���������B";
		close2;
		set Zeny,Zeny-5000;
		warp "ra_in01",358,130;
		percentheal 100,100;
		end;
	case 3:
		mes "[�z�e���E��]";
		mes "�܂��̂����p�����҂����Ă���܂��B";
		close;
	}
}

//�x�C���X
ve_in,157,219,5	script	���ق̎�l	709,{
	mes "[���ق̎�l]";
	mes "����ɂ��́I";
	mes "�x�C���X�ň�ԗ��������ق�";
	mes "�悤�����I";
	next;
	switch(select("�Z�[�u����","�x�� - 5000z","�~�߂�")) {
	case 1:
		savepoint "ve_in",157,210;
		mes "[���ق̎�l]";
		mes "�͂��I";
		mes "�����ɃZ�[�u���܂����I";
		mes "���x�A���肪�Ƃ��������܂��B";
		close;
	case 2:
		if(Zeny<5000) {
			mes "[���ق̎�l]";
			mes "���ق̏h������ 5000z �ł��B";
			mes "����������Ȃ��l�ł��ˁc�c�B";
			close;
		}
		mes "[���ق̎�l]";
		mes "�ł́A���������ǂ����B";
		close2;
		set Zeny,Zeny-5000;
		warp "ve_in",184,228;
		percentheal 100,100;
		end;
	case 3:
		mes "[���ق̎�l]";
		mes "�܂��̂����p��";
		mes "���҂����Ă���܂��B";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
}

//�u���W���X
bra_in01,27,24,3	script	�z�e���Ǘ��l	478,{
	mes "[�z�e���Ǘ��l]";
	mes "�ō����̉Ƌ�ł����ĂȂ��I";
	mes "�؍ݒ��̍K���Ȏ��Ԃ����񑩂���A";
	mes "�u���W���X�z�e���ւ悤����!!";
	next;
	if(select("�Z�[�u����","��Ӕ��܂� - 5,000zeny") == 1) {
		mes "[�z�e���Ǘ��l]";
		mes "�Z�[�u�|�C���g��";
		mes "������ɂ������܂����H";
		next;
		if(select("��߂�","�Z�[�u����") == 1) {
			mes "[�z�e���Ǘ��l]";
			mes "����������܂����B";
			close;
		}
		savepoint "bra_in01",144,69;
		mes "[�z�e���Ǘ��l]";
		mes "�Z�[�u���܂����B";
		mes "�ł́A���������ƃu���W���X��";
		mes "���i���Ă��������܂��B";
		close;
	}
	if(Zeny < 5000) {
		mes "[�z�e���Ǘ��l]";
		mes "�h����͈�� 5,000zeny �ł��B";
		close;
	}
	mes "[�z�e���Ǘ��l]";
	mes "�ō��̕����ɂ��ē��������܂��B";
	close2;
	set Zeny,Zeny-5000;
	warp "bra_in01",144,69;
	percentheal 100,100;
	end;
}