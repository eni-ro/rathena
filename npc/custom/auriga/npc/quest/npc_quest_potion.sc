//----------------------------------------------------------------------
// �X�N���v�g : Event_Potion v1.1
//----------------------------------------------------------------------

prontera,73,140,0	script	�������l	86,{
	mes "[�������l]";
	mes "�󂫃r���������Ă�����A";
	mes "������ 15Zeny�Ń~���N1��";
	mes "�������Ă����܂���[";
	next;
	switch(select("�󂫃r����S����������","��߂�")) {
	case 1:
		if(countitem(713)<1) {
			mes "[�������l]";
			mes "�����A�󂫃r�����B";
			mes "�c�c����܂��񂩁H";
			close;
		}
		set .@num,countitem(713);
		if(Zeny<.@num*15) {
			mes "[�������l]";
			mes "����A����������܂���ˁB";
			mes (.@num*15)+ " Zeny����܂���c�c";
			close;
		}
		if(checkweight(519,.@num)==0) {
			mes "[�������l]";
			mes "������Ɖו��������悤�ł��ˁc�c";
			mes "����ł̓~���N����������Ȃ��ł���B";
			mes "�ו������炷���A��������󂫃r��";
			mes "�̐������炵�Ă��炨�������������B";
			close;
		}
		delitem 713,.@num;
		set Zeny,Zeny-.@num*15;
		getitem 519,.@num;
		close;
	case 2:
		mes "[�������l]";
		mes "�܂��ǂ����[�B";
		close;
	}
}

// �� JUICE_EVE -> 0�`13�A13�ŃW���[�X����\
//                    10�܂ł͓���������x��1�����Z

prt_in,49,172,3	script	�}���G�k	53,{
	switch(JUICE_EVE) {
	case 0:
		mes "[��w�}���G�k]";
		mes "�����X��!!";
		mes "�͂₭�ʕ��H�ׂȂ���!!";
		mes "�H�ׂȂ������Ă΁`�I";
		next;
		mes "�������`!!";
		mes "�ǂ����āA����Ȃ��Ƃ���";
		mes "��������ɂ�������Ȃ̂�����c�c";
		next;
		if(select("�b������","��߂�")==2) {
			mes "[��w�}���G�k]";
			mes "�����X��!!";
			mes "���ꂳ��̌������ƕ����Ȃ���";
			mes "�{����I";
			close;
		}
		mes "[��w�}���G�k]";
		mes "�Ӂc���̎q�͎��̑��q�A�����X���ł��B";
		mes "���̍��A���̎q���ʕ���H�ׂ悤��";
		mes "���Ȃ���ł��B�ʕ������񂺂�";
		mes "�H�ׂȂ������F�������āc�c";
		next;
		mes "[��w�}���G�k]";
		mes "�����Ɠ��΂���H�ׂ悤�Ƃ��āc�c";
		mes "�ӂ��c�c�Ȃ�Ƃ����ĉʕ��Ƃ���؂�";
		mes "�H�ׂ����Ȃ���c�c";
		close;
	case 1:
		mes "[��w�}���G�k]";
		mes "�����X��!!";
		mes "�͂₭�ʕ���H�ׂȂ���!!";
		mes "���Ȃ��A��̉��΂ɂȂ��Ă܂�";
		mes "����ȂɃ��K�}�}�Ȃ�?!";
		mes "�������؂݂����ɂȂ肽���́H";
		next;
		if(select("�b������","��߂�")==2) {
			mes "[��w�}���G�k]";
			mes "�����X��!!";
			mes "���������ɂ��Ȃ���";
			mes "�}�}�{���ɓ{����I";
			close;
		}
		mes "[��w�}���G�k]";
		mes "���A���Ȃ��I�����̃����X����";
		mes "����H�ׂ������l��?!";
		mes "�Ђ���Ƃ��āA�����m��Ȃ��Ǝv����";
		mes "�܂�������ł����H";
		mes "�ӂ�c�c�}�X������ˁB";
		mes "�����n�����Ǝv���Ă�킯�H";
		next;
		mes "[��w�}���G�k]";
		mes "�������o�Ă����Ȃ���!!!";
		close;
	default:	//�C�x���g���Ń��[�g
		mes "[��w�}���G�k]";
		mes "�����!!";
		mes "�ȁ`��ł����A����!!";
		mes "�����̎q�ɂ���Ȃ��̐H�ׂ����Ȃ���";
		mes "���������I���Ӂ`�`�}�X����!!";
		mes "�����o�čs���Ă��������I";
		close;
	case 12:
	case 13:
		mes "[��w�}���G�k]";
		mes "�ӂ��c�c������Ȃ���";
		mes "�H�ׂ悤�Ƃ����Ȃ��Ȃ�āc�c";
		mes "�ʕ���H�ׂ₷������΁A";
		mes "�H�ׂĂ���邩����c�c�Ⴆ�΁c�c";
		mes "�W���[�X�ɂ����肵�āc�c";
		next;
		mes "[��w�}���G�k]";
		mes "���I���������΁A���鑺�ŉʕ���";
		mes "�W���[�X�ɂ��Ă����ƌ����Ă���B";
		mes "�c�c�t�F�C����������������H";
		mes "�c�c�����N������������c�c";
		if(JUICE_EVE == 12)
			set JUICE_EVE,13;
		close;
	}
}

prt_in,47,173,3	script	�����X��	97,{
	switch(JUICE_EVE) {
	default:	//0�`9�̂Ƃ�
		mes "[���у����X��]";
		mes "���c�c�A�A�@�b!!!";
		mes "���c�c�H�ׂȂ��񂾂���I";
		mes "�ʕ��Ȃ񂩁A�H�ׂȂ��񂾂���!!";
		next;
		if(countitem(517))
			set .@talk$,"����������";
		switch (select("�b������",.@talk$,"��߂�")) {
			case 1:
				mes "[���у����X��]";
				mes "�A�A�A�b!! ��񂩓�񂾂�����";
				mes "���������m��Ȃ�����!!";
				mes "��������ȏ�ʕ��͐H�ׂ��Ȃ��I";
				next;
				mes "[���у����X��]";
				mes "�l�́c�c�ʕ��݂����Ȃ���c�c";
				mes "����ނ��̂��ʓ|�����A";
				mes "���C�������ċC����������";
				mes "����ɂ����ς��ăk���k���c�c";
				mes "�H�ׂ���͕�����Ȃ����A";
				mes "�A�A�A�b�I�����H�ׂ����`�I";
				close;
			case 2:
				mes "[���у����X��]";
				mes "�A�A�b�I�Ɂc�c������";
				mes "�c�c������";
				mes "���c�c���c�c�����󂢂��c�c";
				mes "���̓��̓����c�c���́c�c";
				mes "����炦�܂��񂩁H";
				next;
				if(select("����������","���������Ȃ�")==1) {
					delitem 517,1;
					set JUICE_EVE,JUICE_EVE+1;
					mes "[���у����X��]";
					mes "�킠�`!!!�����A���I�����������B";
					mes "���肪�Ƃ��B�������������ł��B";
					mes "���肪�� �ނ���ނ���c�c";
				}
				else {
					mes "[���у����X��]";
					mes "�����c�c���c�c�����c�c";
					mes "�����킩������I";
					mes "��l�Ȃ�Ă݂�ȓ������I";
					set JUICE_EVE,12;
				}
				close;
			case 3:
				mes "[���у����X��]";
				mes "������!!!���ƌ����Ă�";
				mes "�l�͖�؂Ɖʕ��͐H�ׂ�Ȃ���I";
				close;
		}
	case 10:
	case 11:
		mes "[���у����X��]";
		mes "���c�c�������������ς����B";
		mes "���������ł��B";
		mes "�������͂����ł��B";
		mes "����ȏ�H�ׂ���";
		mes "�������j��Ă��܂������B";
		if(JUICE_EVE == 10) {
			next;
			mes "[���у����X��]";
			mes "�����āc�c����A�󂯎���āB";
			mes "�l���A���̊Ԃ�������L�����f�B�B";
			mes "���������ŐH�ׂ悤�ƁA";
			mes "�B���Ă��񂾂��ǁA�������ꂽ����";
			mes "����ɂ������B";
			set JUICE_EVE,11;
			getitem 529,3;
			getitem 530,1;
		}
		close;
	case 12:
	case 13:
		mes "[���у����X��]";
		mes "�������c�c������A�����c�c";
		mes "�����Ɖʕ��΂�����H�ׂ�";
		mes "���񂶂Ⴄ����B�l�̂��Ƃ���";
		mes "�C�ɂ��Ȃ��ł��傤�����B";
		close;
	}
}

payon_in03,188,146,4	script	�}���N�n���Z��	86,{
	if(JUICE_EVE < 13) {
		mes "[���l�}���N�n���Z��]";
		mes "��������Ⴂ�I";
		mes "�Ȃ�̂��p�ł����H";
		next;
		if(select("�b������","��߂�")==2) {
			mes "[���l�}���N�n���Z��]";
			mes "�l��K�˂Ă����̂Ȃ�A";
			mes "�p����b������ǂ��ł����H";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[���l�}���N�n���Z��]";
	mes "��������Ⴂ�I";
	mes "���Ȃ����ʕ������H���ɗ��܂������H";
	next;
	switch (select("�t���[�c�W���[�X������","�b������","��߂�")) {
	case 1:
		mes "[���l�}���N�n���Z��]";
		mes "�ǂ�ȃt���[�c�W���[�X�����܂����H";
		next;
		switch (select("�����S�W���[�X","�o�i�i�W���[�X","�j���W���W���[�X","�u�h�E�W���[�X","��߂�")) {
			case 1:
				setarray .@need,512,713;
				set .@gain,531;
				break;
			case 2:
				setarray .@need,513,713;
				set .@gain,532;
				break;
			case 3:
				setarray .@need,515,713;
				set .@gain,534;
				break;
			case 4:
				setarray .@need,514,713;
				set .@gain,533;
				break;
			case 5:
				mes "[���l�}���N�n���Z��]";
				mes "�Ӂ[�ށA���Ȃ炵�悤���Ȃ��c�c";
				close;
		}
		setarray .@amount,1,1;	//���͂ǂ̃W���[�X�ł�����
		set .@max,callfunc("MathMax",.@need,.@amount,3);
		if(.@max==0) {
			mes "[���l�}���N�n���Z��]";
			mes "�ޗ�������Ȃ��悤�ł��ˁB";
			mes getitemname(.@gain)+ "�����ɂ�";
			mes getitemname(.@need[0])+ "1�� �󂫃r��1��";
			mes "���K�v�ł��B";
			mes "�܂��萔�� 3 zeny ������܂��B";
			mes "������`���i���āA";
			mes "�H�ׂ₷�����Ă����܂��傤�B";
			close;
		}
		mes "[���l �}���N�n���Z��]";
		mes "�����قǂق����̂ł��傤���H";
		next;
		switch (select("�ł��邾���S��","�������߂�","��߂�")) {
			case 1:
				set .@num,.@max;
				break;
			case 2:
				mes "[���l�}���N�n���Z��]";
				mes "100�ȉ��Ō��߂ĉ������B";
				mes "����Ȃ��̂Ȃ�0�ł��肢���܂��B";
				mes "�N�������Ă���A�C�e���ł�";
				mes "�ő� " +.@max+ " �܂ŏo���܂��ˁB";
				while(1) {
					next;
					input .@num;
					if(.@num>100 || .@num<0) {
						mes "[���l�}���N�n���Z��]";
						mes "100�ȏ�͖����ł��B";
						continue;
					}
					break;
				}
				if(.@num==0) {
					mes "[���l�}���N�n���Z��]";
					mes "����A�܂��c�c";
					close;
				}
				if(.@num > .@max) {
					mes "[���l�}���N�n���Z��]";
					mes "�ޗ�������Ȃ��悤�ł��ˁB";
					mes "�ޗ��𑁂��W�߂Ă��Ă��������c�c";
					close;
				}
				break;
			case 3:
				mes "[���l�}���N�n���Z��]";
				mes "����܂��c�c";
				close;
		}
		delitem .@need[0],.@num;
		delitem .@need[1],.@num;
		set Zeny,Zeny-.@num*3;
		getitem .@gain,.@num;
		mes "[���l�}���N�n���Z��]";
		mes "���I�񑩂����W���[�X�ł��B";
		mes "�����������ł���B";
		mes "�ł́A�܂����񗈂Ă��������B";
		close;
	case 2:
		callsub L_Routine;
		next;
		mes "# �t���[�c�W���[�X #";
		mes "��񂲃W���[�X";
		mes "^3355FF���1�A�󂫃r��1�A3 zeny^000000";
		mes "�o�i�i�W���[�X";
		mes "^3355FF�o�i�i1�A�󂫃r��1�A3 zeny^000000";
		next;
		mes "# �t���[�c�W���[�X #";
		mes "�j���W���W���[�X";
		mes "^3355FF�j���W��1�A�󂫃r��1�A3 zeny^000000";
		mes "�u�h�E�W���[�X";
		mes "^3355FF�u�h�E1�A�󂫃r��1�A3 zeny^000000";
		close;
	case 3:
		mes "[���l�}���N�n���Z��]";
		mes "�l��K�˂Ă����̂Ȃ�A";
		mes "�p����b������ǂ��ł����H";
		close;
	}
L_Routine:	//sub routine
	mes "[���l�}���N�n���Z��]";
	mes "�l�Ԃ��܂��A���̂悤�ɑ����̒m����";
	mes "���O�ł����A�݂�ȉʕ�����������";
	mes "�H�ׂĐ����Ă����ƌ����܂��B";
	next;
	mes "[���l�}���N�n���Z��]";
	mes "�Ђ���Ƃ�����A�ʕ���";
	mes "�l�Ԃ����̐��ɑ��݂ł���悤�ɂ���";
	mes "�厩�R�̌b�݂ł͂Ȃ��̂ł��傤���B";
	next;
	mes "[���l�}���N�n���Z��]";
	mes "�������A�������L���ɂȂ�";
	mes "���̍��̎�҂͉ʕ���H�ׂȂ��悤��";
	mes "�Ȃ��Ă��܂����݂����ł��B";
	mes "�����ŁA�ʕ���H�ׂ₷��������@��";
	mes "�l���Ă݂܂����B";
	next;
	mes "[���l�}���N�n���Z��]";
	mes "���̌��ʁA�ʕ����悭�i����";
	mes "�ʏ`�ɂ�����A�H�ׂ₷���Ȃ�A";
	mes "���������Ɨǂ��Ȃ邱�Ƃ�";
	mes "������܂����B";
	return;
}

alberta_in,16,28,4	script	��t����������	61,{
	mes "[����t����������]";
	mes "�����c���q���񂩁c�H";
	mes "���̗p���ˁH";
	next;
	switch (select("�|�[�V���������","�b�𕷂�","�g�ݍ��킹�𕷂�","���ł�����܂���")) {
	case 1:
		mes "[����t����������]";
		mes "�ޗ��͗p�ӂ��ė������ˁH";
		mes "�ǂꂪ�~�������ˁH";
		next;
		switch (select("�ԃ|�[�V����","�g�|�[�V����","���|�[�V����","���|�[�V����","�|�[�V����","�΃|�[�V����","����ς��߂�")) {
			case 1:
				setarray .@need,507,713;
				setarray .@amount,2,1;
				set .@price,3;
				set .@gain,501;
				break;
			case 2:
				setarray .@need,507,508,713;
				setarray .@amount,1,1,1;
				set .@price,5;
				set .@gain,502;
				break;
			case 3:
				setarray .@need,508,713;
				setarray .@amount,2,1;
				set .@price,10;
				set .@gain,503;
				break;
			case 4:
				setarray .@need,509,713;
				setarray .@amount,2,1;
				set .@price,20;
				set .@gain,504;
				break;
			case 5:
				setarray .@need,510,713;
				setarray .@amount,2,1;
				set .@price,30;
				set .@gain,505;
				break;
			case 6:
				setarray .@need,511,713;
				setarray .@amount,2,1;
				set .@price,3;
				set .@gain,506;
				break;
			case 7:
				close;
		}
		if(Zeny<.@price) {	//1�����Ȃ����炢�����Ȃ��ꍇ
			mes "[����t����������]";
			mes "���̈��K�L�I";
			mes "�����Ȃ������ɍ��ƂȁH";
			mes "�A��I�A��I";
			close;
		}
		set .@max,callfunc("MathMax",.@need,.@amount,.@price);
		if(.@max==0) {
			mes "[����t����������]";
			mes "���̈��K�L�I";
			mes "�ޗ����Ȃ������ɂɍ��ƂȁH";
			mes "�A��I�A��I";
			close;
		}
		mes "[����t����������]";
		mes "�ǂ̂��炢�~�����H";
		next;
		switch (select("�o�������","�������߂܂�","����ς��߂܂�")) {
			case 1:
				set .@num,.@max;
				break;
			case 2:
				mes "[����t����������]";
				mes "�Ȃ�΁A100�ȉ��ɂ���";
				mes "����邩�ȁB��߂�񂾂�����";
				mes "0�ɂ��Ă���邩�ȁB";
				mes "�N�������Ă���ޗ��ł�";
				mes .@max+" ���炢��ꂻ�����́B";
				while(1) {
					next;
					input .@num;
					if(.@num>100 || .@num<0) {
						mes "[����t����������]";
						mes "�N�A���������̂��́H";
						mes "100�ȉ��ɂ��Ă����";
						mes "���������낤�I";
						continue;
					}
					break;
				}
				if(.@num==0) {
					mes "[����t����������]";
					mes "�͂����茈�߂񂩂��I";
					close;
				}
				if(.@num > .@max) {
					mes "[����t����������]";
					mes "�ޗ����Ȃ������ɍ��ƂȁH";
					close;
				}
				break;
			case 3:
				mes "[����t����������]";
				mes "�ȂɁH�p���Ȃ��Ȃ�";
				mes "�b��������łȂ��I";
				close;
		}
		if(.@gain==502) {	//�g������2��ނ̃n�[�u���K�v
			delitem 507,.@num;
			delitem 508,.@num;
		}
		else {
			delitem .@need[0],.@num*2;
		}
		delitem 713,.@num;
		set Zeny,Zeny-.@price*.@num;
		getitem .@gain,.@num;
		mes "[����t����������]";
		mes "���ށA�����������I";
		mes "�ق�A�󂯎���Ă���邩�ȁB";
		mes "�C��t����I��͎g���������";
		mes "�̂ɂ悭�Ȃ�����́I";
		close;
	case 2:
		mes "[����t����������]";
		mes "��͐l�Ԃ̉񕜔\�͂����コ����";
		mes "�����B�l�Ԃ̉񕜔\�͂��ǂ��܂ł�";
		mes "�����o���Ă�����ł͂Ȃ����ȁc�c";
		next;
		mes "[����t����������]";
		mes "�Ƃقفc�c�N�����������Ȃ̂��A";
		mes "�̂̂��Ƃ�ǂ��v���o���ȁc�c";
		mes "�Ƃɂ����A�|�[�V�����͖�ł��邾���c";
		mes "�c����ȏ�ł�����ȉ��ł��Ȃ��B";
		close;
	case 3:
		mes "[����t����������]";
		mes "�����c�c�Ⴂ���c�̓V�c�R�C�̂��B";
		mes "�悵�A�����܂ŕ��������̂Ȃ�A";
		mes "�ڂ����������Ă�邩�B";
		next;
		mes "[����t����������]";
		mes "�n�[�u�͂��̂܂܎g���Ă����ʂ��邪�A";
		mes "�킵�̗D�ꂽ�m���ƁA�����@��";
		mes "����ɂ���΁A���̌��ʂ͂�����";
		mes "�����Ȃ�";
		next;
		mes "[����t����������]";
		mes "�~�����Ƃ����Ȃ����Ă����悤�B";
		mes "�����A�����ƌ����킯�ɂ͂�����c�c";
		mes "�኱�A�萔���������������A";
		mes "�킵�̏��������x������";
		mes "����Ȃɍ����͂Ȃ��B";
		next;
		mes "[����t����������]";
		mes "�ԃ|�[�V����";
		mes "^0098E5�ԃn�[�u 2�A�󂫃r�� 1��";
		mes "�萔�� 3 zeny^000000";
		mes "�g�|�[�V����";
		mes "^0098E5�ԃn�[�u 1�A���n�[�u 1�A�󂫃r��";	//���p�u�A�v����Ȃ��Ƃ���܂��B
		mes "1��";
		mes "�萔�� 5 zeny^000000";
		next;
		mes "[����t����������]";
		mes "���|�[�V����";
		mes "^0098E5���n�[�u 2�A�󂫃r�� 1��";
		mes "�萔�� 10 zeny^000000";
		mes "���|�[�V����";
		mes "^0098E5���n�[�u 2�A�󂫃r�� 1��";
		mes "�萔�� 20 zeny^000000";
		next;
		mes "[����t����������]";
		mes "�|�[�V����";
		mes "^0098E5��n�[�u 2�A�󂫃r�� 1��";
		mes "�萔�� 30 zeny^000000";
		mes "�^�|�[�V����";
		mes "^0098E5�^�n�[�u 2�A�󂫃r�� 1��";
		mes "�萔�� 3 zeny^000000";
		close;
	case 4:
		mes "[����t����������]";
		mes "�����ˁH";
		mes "�����������Ƃ���������";
		mes "�͂����茾������ǂ����ˁI";
		close;
	}
}