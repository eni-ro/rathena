//= Athena Script ==============================================================
// Ragnarok Online Blacksmith Jobchange Script	by Blaze
//= Registry ===================================================================
// CHANGE_BS -> 0�`17
//==============================================================================

//============================================================
// �ē���
//------------------------------------------------------------
geffen_in,109,170,2	script	�M���h�֌W��	726,{
	mes "[�u���b�N�X�~�X�M���h�֌W��]";
	mes "����ɂ��́A";
	mes "�u���b�N�X�~�X�M���h��";
	mes "�q�˂ė����̂ł����H";
	next;
	mes "[�u���b�N�X�~�X�M���h�֌W��]";
	mes "�\���󂠂�܂��񂪁A";
	mes "�u���b�N�X�~�X�M���h��";
	mes "^3131FF�V���o���c�o���h���a����";
	mes "�u�|�S�̓s�s�@�A�C���u���b�N�v^000000";
	mes "�Ɉړ����܂����B";
	next;
	mes "[�u���b�N�X�~�X�M���h�֌W��]";
	mes "�V���o���c�o���h���a���ɂ�";
	mes "��s�D�𗘗p���Ĉړ��ł��܂��B";
	next;
	mes "[�u���b�N�X�~�X�M���h�֌W��]";
	mes "��낵����΁A";
	mes "��`���ݒu����Ă���C�Y���[�h�܂ŁA";
	mes "600Zeny�ŋ�Ԉړ����ł��܂����B";
	mes "��Ԉړ��𗘗p���܂����H";
	next;
	switch(select("�A�C���u���b�N�ւ̏ڂ����s����","�C�Y���[�h�ցI","���p���Ȃ�")) {
	case 1:
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "�킩��܂����B���������܂��B";
		next;
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "�V���o���c�o���h���a����";
		mes "��Ԉړ��T�[�r�X�̑����";
		mes "�u��s�D�v�𗘗p���Ă��܂��B";
		next;
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "^3131FF�u�C�Y���[�h�v^000000�ł�";
		mes "^3131FF�u�C�Y���[�h-�W���m�[�v^000000�Ԃ�";
		mes "�J��Ԃ��ړ����Ă���";
		mes "^3131FF���O�p��s�D^000000���^�s���ł��B";
		next;
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "���O�p��s�D�ŃW���m�[�܂ōs���A";
		mes "�V���o���c�o���h�������^�s����";
		mes "^3131FF�����p��s�D^000000�ɏ�芷�����";
		mes "�A�C���u���b�N�ɓ����ł��܂��B";
		next;
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "��s�D����芷���鎞�́A";
		mes "^3131FF��`�̊O�ɏo�Ȃ��悤��^000000";
		mes "�C��t���Ă��������B";
		next;
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "�b�����𕷂��Ɠ���ł����A";
		mes "�����ΊȒP�ł��B";
		mes "��s�D�ɏ���Ă��邾���ł�����B";
		mes "����ł́A�A�C���u���b�N�ɂ���";
		mes "�u���b�N�X�~�X���Ԃ�";
		mes "��낵�����`�����������B";
		close;
	case 2:
		if(Zeny < 600) {
			mes "[�u���b�N�X�~�X�M���h�֌W��]";
			mes "�������s�����Ă���悤�ł��B";
			close;
		}
		warp "izlude",94,103;
		end;
	case 3:
		mes "[�u���b�N�X�~�X�M���h�֌W��]";
		mes "����ł́A�y����������B";
		close;
	}
}

//============================================================
// ��t����ѓ]�E
//------------------------------------------------------------
//geffen_in,110,169,2	script	�M���h��	731,{
ein_in01,18,28,4	script	�M���h��	731,{
	if(Upper == UPPER_HIGH) {
		mes "[�A���g�A�C�[��]";
		mes "�N�A�N�A";
		mes "�������ǂ��Ȃ̂��킩����";
		mes "����̂����H";
		next;
		mes "[�A���g�A�C�[��]";
		mes "����Ƃ��c�c�ǂ����ŉ�������H";
		mes "���`��c�c";
		mes "�����`��c�c�c�c";
		next;
		mes "[�A���g�A�C�[��]";
		mes "���̍��������ł�������������";
		mes "�z���������c�c";
		mes "����Ƃ����������Ă���Ɨ��݂ɗ���";
		mes "���ǒ��߂ċA�����z���������ȁc�c";
		mes "���`��c�c";
		next;
		mes "[�A���g�A�C�[��]";
		mes "�c�c";
		mes "�킩���I�v���o����c�c";
		mes "�͂��c�c���ꂪ�f�W���r�����Ă��!";
		mes "?";
		next;
		mes "[�A���g�A�C�[��]";
		mes "�����ς�v���o����c�c";
		mes "�������ʂ���Ȃ��C�z�����邪�c�c";
		mes "�܁A�Ƃɂ����I";
		mes "�y����������߂�����ȁB";
		close;
	}
	mes "[�A���g�A�C�[��]";
	mes "�悤�����I���͓S������";
	mes "�u���b�N�X�~�X�M���h�ł���I";
	mes "�����ēS�֔M����M��R�₷";
	mes "�ҒB�ł���I";
	next;
	mes "[�A���g�A�C�[��]";
	mes "������n�����ĐV������������";
	mes "�Z�p�́A�܂��Ɉ�̌|�p�I";
	next;
	if(Job == Job_Priest) {
		mes "[�A���g�A�C�[��]";
		mes "����A�_�l�̌�g���ł����I";
		mes "�悭���Ă���܂����I";
		mes "���Ђ��̎��ɏj���̂��F���";
		mes "���肢���܂��B";
		close;
	}
	if(Job == Job_Blacksmith) {
		mes "[�A���g�A�C�[��]";
		mes "���I�v���Ԃ肾�ȁI";
		mes "�N���X�g�t�@�[�ɉ����p�����H";
		mes "���͋ߍ�����Ȏ����d���΂����ł��c";
		mes "���낻��n���}�[�ł��U�肽���Ȃ���";
		mes "������c�͂͂́c";
		close;
	}
	if(Job != Job_Merchant) {
		mes "[�A���g�A�C�[��]";
		mes "�ӂށA�����ڂ����Ă���" +(Sex? "�j": "��")+ "���ȁI";
		mes "�u���b�N�X�~�X�ɂȂ肽�������H";
		mes "�������A���͏��l����̂ݓ]�E";
		mes "�ł���B���͒��߂ȁB";
		close;
	}
	if(SkillPoint) {
		mes "[�A���g�A�C�[��]";
		mes "�����ƁA�X�L���|�C���g��";
		mes "�c���Ă���Ɠ]�E�ł��Ȃ����B";
		mes "�S���U���Ă���܂����Ă���B";
		close;
	}
	switch(CHANGE_BS) {
	case 0:
		mes "[�A���g�A�C�[��]";
		mes "�N�����l�ł��邱�Ƃɖ�������";
		mes "���Ȃ��ŁA���Ɖ��̌|�p�ɐg��";
		mes "�����Ă݂Ȃ������H";
		mes "�����̓]�E�\�����ɂ����O��";
		mes "JobLv�������Ă���B�ӂӂӁB";
		next;
		switch(select("�]�E�\�����݂�����","�]�E�����́H","�܂����x�c")) {
			case 1:
				break;
			case 2:
				mes "[�A���g�A�C�[��]";
				mes "�]�E�����̂��Ƃ����H";
				mes "�܂��A���lJobLv��40�ȏ�ɁB";
				mes "�����āA�e�X�g�ɍ��i���鎖�B";
				mes "���̓���B�܂��A�e�X�g���������";
				mes "�������ǁA������x�̒m����";
				mes "�����l�Ȃ���͂Ȃ��͂����B";
				next;
				mes "[�A���g�A�C�[��]";
				mes "�e�X�g�͏��i�̔z�B�����āA�e�n���";
				mes "���Y�i��c��������n�e�X�g�ƁA";
				mes "�u���b�N�X�~�X�ɂȂ邽�߂̒m����₤";
				mes "�M�L�e�X�g������B";
				close;
			case 3:
				mes "[�A���g�A�C�[��]";
				mes "���ށA�܂����x�ȁB";
				close;
		}
		if(JobLevel < 40) {
			mes "[�A���g�A�C�[��]";
			mes "�ӂށc�N�͂܂����l�Ƃ��Ă�";
			mes "JobLV������Ă��Ȃ��悤���B";
			mes "�]�E�͏��lJobLv40�ȏォ��";
			mes "�\�ƂȂ�B";
			mes "�����������Ă��ꂽ�̂Ɏc�O�����A";
			mes "����������ƒb���Ă��痈�Ă���B";
			close;
		}
		mes "[�A���g�A�C�[��]";
		mes "���ށc";
		mes "�ꉞJobLv�͑��v�݂������ȁB";
		next;
		mes "[�A���g�A�C�[��]";
		mes "�悵�A��{�͏o���Ă��邪�A";
		mes "���ꂾ���Ńu���b�N�X�~�X��";
		mes "�Ȃ��킯����Ȃ��B";
		mes "���Ȃ��Ƃ��A�N�̏��l�Ƃ��Ă�";
		mes "�������ƃu���b�N�X�~�X�ւ�";
		mes "��M�������Ă����Ȃ��ƂȁB";
		next;
		mes "- �����̏��ނ��o���� -";
		next;
		mes "[�A���g�A�C�[��]";
		//mes "�ӂށc���A���x���^�ɏo������";
		//mes "�ӂށc���A�C���x�t�ɏo������";
		mes "�M���h���u�Q�b�V���v���Z������";
		mes "�����Ă���l�q������A�ނ̎d����";
		mes "������Ǝ�`���Ă���ė~�����B";
		mes "���ꂪ�N�ւ̍ŏ��̎������B";
		next;
		mes "[�A���g�A�C�[��]";
		mes "���ꂶ��A�C��t���čs����";
		mes "���ĂȁB";
		set CHANGE_BS,1;
		close;
	case 1:
		mes "[�A���g�A�C�[��]";
		mes "�����A�܂��o�����Ă��Ȃ������̂��B";
		//mes "�A���x���^�ɂ���u�Q�b�V���v��";
		mes "�A�C���x�t�ɂ���u�Q�b�V���v��";
		mes "�K�˂Ă݂ĂȁB";
		mes "���ꂶ��A�܂��B";
		close;
	default:
		mes "[�A���g�A�C�[��]";
		mes "�Q�b�V���ɗ��܂ꂽ�d���͂ǂ��Ȃ���";
		mes "���邩�ȁH";
		mes "�ނ͂�����Ɗ�łłˁc";
		mes "�Ō�܂Ŋ撣���Ă���B";
		close;
	case 15:
		mes "[�A���g�A�C�[��]";
		mes "�����l�I";
		mes "��N���A���ȁB";
		next;
		mes "[�A���g�A�C�[��]";
		mes "����H �͂͂́c";
		mes "����Ŏ������I������킯����Ȃ����B";
		//mes "�悵�A�����N�ɍs���Ă���B";
		//mes "�������Ɏ��̒S���҂�����B";
		mes "�悵�A�߂��Ɏ��̒S���҂����邩��";
		mes "�b�����Ă��Ă���B";
		next;
		if(select("�g�z�z�c�c�s���܂��c�c","�c�c���������I")==2) {
			mes "[�A���g�A�C�[��]";
			mes "�ȂɁH�]�E��������߂�ƁH";
			mes "���̍����������I����͉䂪";
			mes "�M���h�ɑ΂��镎�J���I";
			mes "�A��I��x�Ɨ���񂶂�Ȃ��I";
			next;
			mes "[�A���g�A�C�[��]";
			mes "�e�X�g��r���œ����o���āA";
			mes "�u���b�N�X�~�X�ɂȂ���";
			mes "�v�����̂��I";
			close;
		}
		mes "[�A���g�A�C�[��]";
		mes "���܂񂪁c�d���Ȃ��񂾁B";
		mes "�N���m���Ă��邩�ȁH";
		mes "�ȑO�͒N�ł��e�X�g�����ɓ]�E";
		mes "�����Ă�������c���\�ƃm�[�}�i�[";
		mes "�s�ׂő����̔�Q�҂��o�Ă��܂����B";
		next;
		mes "[�A���g�A�C�[��]";
		mes "�ӂ��c";
		//mes "�Ƃ肠���������N�ɍs���A����";
		//mes "�e�X�g���撣���Ăق����B";
		mes "�Ƃ肠�������̃e�X�g��";
		mes "�撣���Ăق����B";
		set CHANGE_BS,16;
		close;
	case 16:
		mes "[�A���g�A�C�[��]";
		//mes "��H�����N�ɍs���ĂȂ������̂����H";
		//mes "�����������Ă���I";
		mes "��H";
		mes "��������Ă���I";
		close;
	case 17:
		if(countitem(1005)==0)
			close;
		mes "[�A���g�A�C�[��]";
		mes "�����A�������i�������I";
		mes "�ł͌N�ɂ����̌|�p���󂯌p��";
		mes "�\�͂�^���悤�B";
		next;
		mes "[�A���g�A�C�[��]";
		mes "�������Y��Ă͂Ȃ�Ȃ��B";
		mes "��X�́A�S�ɖ��𐁂����ގҒB�B";
		mes "�Ȃ̗~�̂��߂Ɏd�������Ă�";
		mes "�Ȃ�Ȃ����B";
		set .@amount,(JobLevel >= 50)? 30: 5;
		nude;
		set CHANGE_BS,0;
		jobchange Job_Blacksmith;
		next;
		mes "[�A���g�A�C�[��]";
		mes "�����Ă���͓]�E�j�����B";
		mes "�ł͗ǂ��b�艮�ɂȂ��I";
		delitem 1005,1;
		getitem 999,.@amount;
		close;
	}
}

//============================================================
// �ꎟ�����i�M�L����ѕ��퐻���j
//------------------------------------------------------------
//alberta_in,174,22,4	script	�u���b�N�X�~�X�M���h��	63,{
ein_in01,201,27,4	script	�u���b�N�X�~�X�M���h��	63,{
	mes "[�Q�b�V��]";
	mes "�M��!!���͔M���u���b�N�X�~�X";
	mes "�Q�b�V�����I��낵���I";
	next;
	if(Job != Job_Merchant) {
		mes "[�Q�b�V��]";
		mes "�u���b�N�X�~�X�͖{���ɏ[������";
		mes "����E�Ƃ���I";
		mes "�����v���܂��񂩁H�n�b�n�b�n�[";
		close;
	}
	mes "[�Q�b�V��]";
	mes "������!? ���l���B�悭�����ꂽ�I";
	mes "�l��ɍ����Ă��Ăˁ[�I";
	next;
	switch(CHANGE_BS) {
	case 0:
		mes "[�Q�b�V��]";
		mes "�������I";
		mes "�Z�����l�Ԃɖ��f�������Ă�";
		mes "�Ȃ�Ȃ��I";
		next;
		mes "[�Q�b�V��]";
		mes "���ꂶ��I";
		mes "�ǂ��������Ă���I";
		close;
	case 1:
		mes "[�Q�b�V��]";
		mes "�u���b�N�X�~�X�M���h����b��";
		mes "�����ė����l���ȁH";
		mes "����`�ŋߒ����������āA�l�肪";
		mes "����Ȃ��Ƃ��낾�����񂾂�B";
		next;
		mes "[�Q�b�V��]";
		mes "�ӂށA�d������`���ɗ��Ă��ꂽ�Ȃ�";
		mes "�����������̎���ɓ����Ă���B";
		next;
		mes "[�Q�b�V��]";
		mes "���̊ԗ����z�́A��{�I�Ȃ��Ƃ�";
		mes "�m��Ȃ��āA�Ԉ�������������Ă���";
		mes "���܂�������ȁc";
		mes "�厖�ȋ��𖳑ʂɂ��Ă��܂����񂾂�B";
		mes "����A���₷��I�p�ӂ͂������H";
		next;
		if(select("�́`��","������Ƒ҂��Ă�������")==2) {
			mes "[�Q�b�V��]";
			mes "�������B�Ȃ珀�������Ă���";
			mes "�܂������ŁB";
			mes "���܂ɂ͐T�d�ɂȂ�̂��厖���ˁB";
			close;
		}
		break;
	case 2:
		mes "[�Q�b�V��]";
		mes "�ӂށc�悵�A�׋����Ă������I";
		mes "���x�͈�񂭂炢�Ԉ���Ă�";
		mes "�����Ă��I";
		mes "�����A�p�ӂ͂����ȁH";
		next;
		break;
	case 3:
		mes "[�Q�b�V��]";
		mes "������Ƒ҂��āc�m����";
		mes "�����˗����͂����Ɂc";
		next;
		mes "[�Q�b�V��]";
		mes "�����I�������A�������I";
		mes "��ԋ}���ł������c";
		mes "�����[�Ɓc";
		next;
		mes "[�Q�b�V��]";
		mes "�܂��A�ޗ����K�v���ȁB";
		next;
		set CHANGE_BS,rand(4,8);
		switch(CHANGE_BS) {
		case 4:	//�q���b�P
			setarray .@need,1001,932,912,1219;
			setarray .@amount,2,1,1,1;
			break;
		case 5:	//�o�C�X
			setarray .@need,999,930,717,1610;
			setarray .@amount,2,1,2,1;
			break;
		case 6:	//�O����
			setarray .@need,1003,935,990,1119;
			setarray .@amount,2,2,2,1;
			break;
		case 7:	//�r�X�}���N
			setarray .@need,998,511,919,1122;
			setarray .@amount,8,20,2,1;
			break;
		case 8:	//�e���s�c
			setarray .@need,1002,2212,717,1713;
			setarray .@amount,8,1,2,1;
			break;
		}
		mes "[�Q�b�V��]";
		for(set .@i,0; .@i < 3; set .@i,.@i+1)
			mes getitemname(.@need[.@i])+ " " +.@amount[.@i]+ "��";
		mes "�����āc���X�Ŕ����Ă�";
		mes "�u" +getitemname(.@need[3])+ "�v��1���ށB";
		next;
		mes "[�Q�b�V��]";
		mes "����A���ɋ��������ė��ނ킯";
		mes "����Ȃ��B����̓e�X�g�Ȃ񂾁B";
		next;
		mes "[�Q�b�V��]";
		mes "������x��������悭�����ĂȁB";
		for(set .@i,0; .@i < 3; set .@i,.@i+1)
			mes getitemname(.@need[.@i])+ " " +.@amount[.@i]+ "��";
		mes "���X�Ŕ����Ă�" +getitemname(.@need[3])+ "��1�B";
		next;
		mes "[�Q�b�V��]";
		mes "����A���肢�B���������Ă��ĂˁI";
		close;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
		switch(CHANGE_BS) {
		case 4:	//�q���b�P
			setarray .@need,1001,932,912,1219;
			setarray .@amount,2,1,1,1;
			break;
		case 5:	//�o�C�X
			setarray .@need,999,930,717,1610;
			setarray .@amount,2,1,2,1;
			break;
		case 6:	//�O����
			setarray .@need,1003,935,990,1119;
			setarray .@amount,2,2,2,1;
			break;
		case 7:	//�r�X�}���N
			setarray .@need,998,511,919,1122;
			setarray .@amount,8,20,2,1;
			break;
		case 8:	//�e���s�c
			setarray .@need,1002,2212,717,1713;
			setarray .@amount,8,1,2,1;
			break;
		}
		mes "[�Q�b�V��]";
		mes "����H���񂾕��𑵂��Ă������H";
		next;
		for(set .@i,0; .@i<4; set .@i,.@i+1) {
			if(countitem(.@need[.@i]) < .@amount[.@i]) {
				mes "[�Q�b�V��]";
				mes "�c�c�܂��ޗ���������ĂȂ��c�B";
				mes "�c���񌾂킹���!?";
				for(set .@i,0; .@i<3; set .@i,.@i+1)
					mes getitemname(.@need[.@i])+ " " +.@amount[.@i]+ "��";
				mes "���X�Ŕ����Ă�" +getitemname(.@need[3])+ "1�B";
				next;
				mes "[�Q�b�V��]";
				mes "�������肵�Ă���A����̓e�X�g�����I";
				mes "���������o���Ȃ��z��";
				mes "�u���b�N�X�~�X�ɂȂ��Ǝv���̂��H";
				close;
			}
		}
		mes "[�Q�b�V��]";
		switch(CHANGE_BS) {
			case 4:
				mes "���̕��c 3����Ȃ��������H";
				next;
				mes "[�Q�b�V��]";
				mes "���A2�ł����Ă�B���̂́c";
				break;
			case 5:
				mes "�|�S�c 3����Ȃ��������H";
				next;
				mes "[�Q�b�V��]";
				mes "���A2�ł����Ă�B���̂́c";
				break;
			case 6:
				mes "�ΒY�c 3����Ȃ��������H";
				next;
				mes "[�Q�b�V��]";
				mes "���A2�ł����Ă�B���̂́c";
				break;
			case 7:
				mes "�S�c 40����Ȃ��������H";
				next;
				mes "[�Q�b�V��]";
				mes "���A8�ł����Ă�B���̂́c";
				break;
			case 8:
				mes "�S�z�΁c 30����Ȃ��������H";
				next;
				mes "[�Q�b�V��]";
				mes "���A8�ł����Ă�B���̂́c";
				break;
		}
		mes "�悵�I�������ȁB";
		mes "�ӂށc���ꂩ�珀�����邩��";
		mes "������Ƒ҂��ĂȁB";
		next;
		mes "[�Q�b�V��]";
		mes "���A�������c �N�A�����i�̒���";
		mes "^FF0000����" +getitemname(.@need[3])+ "^000000��������";
		mes "���Ȃ����H";
		next;
		if(select("���A������Ƒ҂��Ă�������","�]�E�����p�̂��������Ă��܂�")==1) {
			mes "[�Q�b�V��]";
			mes "���ށA�]�E�����p�ȊO�̂�";
			mes "�q�ɂɂł�����Ēu���Ƃ����B";
			close;
		}
		mes "[�Q�b�V��]";
		mes "�I�[�P�[�I";
		next;
		mes "[�Q�b�V��]";
		mes "�������c�c�B";
		next;
		mes "[�Q�b�V��]";
		mes "�悱�炵����Ɓc�c";
		next;
		for(set .@i,0; .@i<4; set .@i,.@i+1)
			delitem .@need[.@i],.@amount[.@i];
		set CHANGE_BS,CHANGE_BS+5;
		getitem .@need[3],1;	//���킪�n�����
		mes "[�Q�b�V��]";
		mes "�͂��B";
		mes "�o�����ȁc";
		switch(CHANGE_BS) {
			case  9: mes "�����A����������N�́u�q���b�P�v��"; 	break;
			case 10: mes "�����A������Q�t�F���́u�o�C�X�v��"; 	break;
			//case 11: mes "�����A������C�Y���[�h�́u�O�����v��"; 	break;
			case 11: mes "�����A��������q�^���[���́u�O�����v��"; 	break;
			//case 12: mes "�����A������R���h�́u�r�X�}���N�v��"; 	break;
			case 12: mes "�����A������t�B�Q���́u�r�X�}���N�v��"; 	break;
			case 13: mes "�����A������t�F�C�����́u�e���s�c�v��"; 	break;
		}
		mes "�n���āA���ɗ̎��؂������ė����";
		mes "�I�[�P�[���B";
		next;
		switch(CHANGE_BS) {
		case 9:
			mes "[�Q�b�V��]";
			mes "����H���ʂ̃O���f�B�E�X��";
			mes "�ǂ����Ⴄ������!?";
			mes "�c�B�����̐n�̕�������[������B";
			mes "����̃G���u�����������Ă�I";
			mes "�E���g�� �O���f�B�E�X";
			mes "�Q�b�V��Mk2 Version!!!";
			next;
			mes "[�Q�b�V��]";
			mes "�c�c";
			mes "���邾���ō���Ă��܂��������낤�H";
			next;
			mes "[�Q�b�V��]";
			mes "�Ƃɂ��������N�́u�q���b�P�v��";
			mes "�n���āA�̎��؂�������ė����I";
			close;
		case 10:
			mes "[�Q�b�V��]";
			mes "����H���ʂ̃A�[�N�����h��";
			mes "�ǂ����Ⴄ������!?";
			mes "�c�B�����̎���蕔������[������B";
			mes "�O���b�v�������܂�Ȃ��I";
			mes "�X�[�p�[ �A�[�N�����h";
			mes "�Q�b�V��Mk2 Version!!!";
			next;
			mes "[�Q�b�V��]";
			mes "�c�c";
			mes "�U�鎞�̊��G���Ⴄ�񂾂�I";
			mes "���G���I";
			next;
			mes "[�Q�b�V��]";
			mes "�Ƃɂ����Q�t�F���́u�o�C�X�v�ɓn����";
			mes "�̎��؂�������ė����I";
			close;
		case 11:
			mes "[�Q�b�V��]";
			mes "����H���ʂ̃c���M�Ƃǂ���";
			mes "�Ⴄ������!?";
			mes "�c�B�����̐n�̕�������[������B";
			mes "����̃G���u�����������Ă�!!!";
			mes "�񕶎��a�� �c���M";
			mes "�Q�b�V��Mk2 Version!!!";
			next;
			mes "[�Q�b�V��]";
			mes "�c�c";
			mes "���邾���ō���Ă��܂��������낤�H";
			next;
			mes "[�Q�b�V��]";
			//mes "�Ƃɂ����C�Y���[�h�́u�O�����v��";
			mes "�Ƃɂ������q�^���[���́u�O�����v��";
			mes "�n���āA�̎��؂�������ė����I";
			close;
		case 12:
			mes "[�Q�b�V��]";
			mes "����H���ʂ̊�������";
			mes "�ǂ����Ⴄ������!?";
			mes "�c�B�����̐n�̕�������[������B";
			mes "�΃n�[�u�t���܂܂�Ă���I";
			mes "�΃n�[�u�t���ˊ�����";
			mes "�Q�b�V��Mk2 Version!!!";
			next;
			mes "[�Q�b�V��]";
			mes "�c�B�łɂ��ꂽ���A����Ŏh����";
			mes "��������񂾂�I";
			mes "����͂����ƍ����Ȃ邯�ǁc";
			mes "�ł͎��Âł���!!";
			next;
			mes "[�Q�b�V��]";
			//mes "�Ƃɂ����R���h�́u�r�X�}���N�v��";
			mes "�Ƃɂ����t�B�Q���́u�r�X�}���N�v��";
			mes "�n���āA�̎��؂�������ė����I";
			close;
		case 13:
			mes "[�Q�b�V��]";
			mes "����H���ʂ̃A�[�o���X�g��";
			mes "�ǂ����Ⴄ������!?";
			mes "�c�B�����̐g�̕�������[������!";
			mes "��ю��[�ꏊ���t���Ă�!!!";
			mes "���i�܃l�Y�~(����)";
			mes "�Q�b�V��Mk2 Version!!!";
			next;
			mes "[�Q�b�V��]";
			mes "�c�B��т̌g�ѐ��������Ȃ�񂾂�I";
			next;
			mes "[�Q�b�V��]";
			mes "�Ƃɂ����t�F�C�����́u�e���s�c�v��";
			mes "�n���āA�̎��؂�������ė����I";
			close;
		}
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[�Q�b�V��]";
		mes "����H�����s���Ă����B";
		mes "�����H�͂����Y�ꂽ���āH";
		next;
		mes "[�Q�b�V��]";
		switch(CHANGE_BS) {
		case 9:
			mes "�����N �\�[�h���C�X���l�߂���";
			mes "�u�q���b�P�v�ɓn���āA�̎��؂�";
			mes "�����Ă��邱�ƁB";
			close;
		case 10:
			mes "�Q�t�F�� 11�������́u�o�C�X�v";
			mes "�ɓn���āA�̎��؂������Ă��邱�ƁB";
			close;
		case 11:
			//mes "�C�Y���[�h 11������ �����߂���";
			//mes "�u�O�����v�ɓn���āA�̎��؂�";
			//mes "�����Ă��邱�ƁB";
			mes "���q�^���[�� 6�������A";
			mes "���퉮�߂��́u�O�����v�ɓn����";
			mes "�̎����������Ă��邱�ƁB";
			close;
		case 12:
			//mes "�R���h 12�������́u�r�X�}���N�v";
			//mes "�ɓn���āA�̎��؂������Ă��邱�ƁB";
			mes "�t�B�Q�� 1�������A";
			mes "��s�D�߂��́u�r�X�}���N�v�ɓn����";
			mes "�̎��؂������Ă��邱�ƁB";
			close;
		case 13:
			mes "�t�F�C���� 5�������́u�e���s�c�v";
			mes "�ɓn���āA�̎��؂������Ă��邱�ƁB";
			close;
		}
	case 14:
		mes "[�Q�b�V��]";
		mes "���[ ���A��I";
		mes "���ށA�̎��؂́H";
		next;
		if(select("�͂��A����ł��B","���A���݂܂���I")==2) {
			mes "[�Q�b�V��]";
			mes "�킩�����B �̎��؂�����������";
			mes "�����ĂȁB";
			mes "�Ⴄ�̂�Y�ꂽ�Ƃ��c�܂��������";
			mes "�͂��͂Ȃ���ȁH�n�n�n�n�n�I";
			close;
		}
		if(countitem(1073) < 1) {
			mes "[�Q�b�V��]";
			mes "�c�c�̎��؂�Y�ꂽ�ƁH";
			mes "�c�c����Ȕn���ȁc�c";
			next;
			mes "[�Q�b�V��]";
			mes "����͂Ȃ��񂶂�Ȃ������H";
			mes "�ǂ������炻��𖳂������Ƃ��o����!?";
			next;
			mes "[�Q�b�V��]";
			mes "�̎��؂͏��l�̖��I�b�艮�̌ւ�I";
			mes "�����Y��邱�Ƃ͋�����Ȃ��I";
			mes "���߂���o�����I";
			set CHANGE_BS,3;	//�ޗ����B�����蒼��
			close;
		}
		mes "[�Q�b�V��]";
		mes "�����I �悵�c�B�m���ɁB";
		mes "����!! �{���ɂ�������҂���!!";
		mes "�������낤�I";
		//mes "�Q�t�F���́u�A���g�A�C�[���v��";
		mes "�A�C���u���b�N�́u�A���g�A�C�[���v��";
		mes "���ɖ߂�B�����A�]�E��t�̂ȁB";
		mes "����ꂳ��A�N�ɂ͏[������������I";
		delitem 1073,1;
		set CHANGE_BS,15;
		close;
	case 15:
		mes "[�Q�b�V��]";
		mes "���ށA�����낤�������B";
		//mes "�����Q�t�F���́u�A���g�A�C�[���v";
		//mes "�̂Ƃ���ɖ߂�Ȃ����B";
		mes "�����A�C���u���b�N��";
		mes "�u�A���g�A�C�[���v�̂Ƃ����";
		mes "�߂�Ȃ����B";
		close;
	case 16:
	case 17:
		mes "[�Q�b�V��]";
		mes "����H�����ɂ͂����p�͖���";
		mes "�͂������ǁH";
		//mes "�����N��Q�t�F���̕���";
		mes "�A�C���u���b�N�̕���";
		mes "�s���񂶂�Ȃ������̂��H";
		close;
	}
	//1,2�̂Ƃ������J�n
	if(rand(2)) {
		mes "[�Q�b�V��]";
		mes "1. ���̒��ŁA�n��Ɠ��Y�i��";
		mes "�����Ă��Ȃ����͂ǂꂩ�B";
		next;
		if(select("�����N - �V�[�t�N���[�X","�A���x���^ - �c�[�n���h�A�b�N�X","�R���h - �o�[�T�[�N�|�[�V����","�A���x���^ - �\�[�h���C�X")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "2. ���̒��Ńu���b�N�X�~�X�̃X�L��";
		mes "�u�����}�[�t�H�[���v�̌��ʂ́H";
		next;
		if(select("�X�^��","�È�","����","����")==1)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "3. ���̒��ŏ��l���o���Ȃ����́H";
		next;
		if(select("�I�X���J��","���i������������","���i�����������","���������")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "4. �u���[�W�F���X�g�[����";
		mes "�����Ă��鏤�X�͂ǂ��ɂ���H";
		next;
		if(select("�A���x���^","�����N","�Q�t�F��","�v�����e��")==3)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "5. ���ꂶ��A�Q�t�F���̓����";
		mes "�ǂ��ɂ��邩�H";
		next;
		if(select("�Q�t�F���^���[���� 8������","�Q�t�F���^���[���� 11������","�Q�t�F���^���[���� 6������","�Q�t�F���^���[���� 5������")==1)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "6. ���̒��ŏ��l���g���Ȃ�����́H";
		next;
		if(select("�X�e�B���b�g","������","�`�F�C��","�o�C�u��")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "7. ���̖h���̒��Ŗh��͂�";
		mes "��ԍ����̂́H";
		next;
		if(select("�u���[�t","�~���N�̃R�[�g","�E�h�D�����C��","�V���N���[�u")==2)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "8. ���x��3����𐸘B���鎞�A";
		mes "�ǂ��܂ň��S�ɐ��B�ł��邩�B";
		next;
		if(select("+3 �܂�","+4 �܂�","+5 �܂�","+6 �܂�")==3)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "9. �u�؋��v�������A�C�e���́H";
		next;
		if(select("�}","�S�҂̃w�A�o���h","�}�W�F�X�e�B�b�N�S�[�g","���̊p")==1)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "10. ���l�Ƃ��Ĉ�ԑ�؂Ȃ��̂́H";
		next;
		if(select("�M�p","����","����","�b�p"))		//�ǂ������
			set .@point,.@point+10;
	}
	else {
		mes "[�Q�b�V��]";
		mes "1. ���̒��ŁA�n��Ɠ��Y�i��";
		mes "�����Ă��Ȃ����͂ǂꂩ�B";
		next;
		if(select("�A���f�o���� - �C�O�h���V���̗t","�A���x���^ - �n���}�[","�R���h - ���C�̃|�[�V����","�A���f�o���� - �n���}�[")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "2. �[���s�[�̒l�i�́H";
		next;
		if(select("1 Zeny","2 Zeny","3 Zeny","4 Zeny")==3)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "3. �I�X���J�����߂ɕK�v�ȏ����́H";
		next;
		if(select("�J�[�g�𑕔����Ă��邱��","���i����Ɏ����Ă��邱��","����𑕔����Ă��邱��","�Z�𑕔����Ă��邱��")==1)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "4. ���̒��ŏ��l�]�E��������X�́H";
		next;
		if(select("�A���x���^","�����N","�Q�t�F��","�v�����e��")==1)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "5. �����N�̕��퉮�͂ǂ��ɂ���H";
		next;
		if(select("�������� 7���̕���","�������� 11���̕���","�������� 3���̕���","�������� 5���̕���")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "6. ���ŏ��l���g���Ȃ�����́H";
		next;
		if(select("�}�C���S�[�V��","�N���C���A","�`�F�C��","�c�[�n���h�A�b�N�X")==2)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "7. ���̖h��̒��ŁA�h��͂����";
		mes "�����̂́H";
		next;
		if(select("�u���[�t","�~���N�̃R�[�g","�E�h�D�����C��","�V���N���[�u")==2)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "8. ���x��3����𐸘B���鎞�A";
		mes "�ǂ��܂ň��S�ɐ��B�ł��邩�B";
		next;
		if(select("+3 �܂�","+4 �܂�","+5 �܂�","+6 �܂�")==3)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "9. �S�z�΂𗎂Ƃ��Ȃ�";
		mes "�����X�^�[�́H";
		next;
		if(select("�`�����`����","�X�`�[���`�����`����","�[����","�A�m���A��")==4)
			set .@point,.@point+10;
		mes "[�Q�b�V��]";
		mes "10. ���l�ɂƂ���";
		mes "��ԑ�؂Ȃ��Ƃ�!!?";
		next;
		if(select("�b�p","�M�p","����","�l�Ԋ֌W"))		//�ǂ������
			set .@point,.@point+10;
	}
	mes "[�Q�b�V��]";
	mes "���ށA�悵�I����ꂳ��I";
	next;
	mes "[�Q�b�V��]";
	mes "�ǂ�ǂ�c�_���́c";
	mes .@point+ "�_�I";
	if( (CHANGE_BS == 1 && .@point < 90) || (CHANGE_BS == 2 && .@point < 80) ) {
		mes "�c�c�c";
		next;
		mes "[�Q�b�V��]";
		mes "���`�ށA���������̒��x�̖��";
		mes "�y�X�N���A���Ă����Ȃ���";
		mes "�d���𗊂ނ͖̂������ȁB";
		mes "�׋����ďo�����Ă���B";
		set CHANGE_BS,2;
		close;
	}
	mes "�����I����Ȃ���Ȃ��I";
	mes "�Ȃ�΁c";
	next;
	mes "[�Q�b�V��]";
	mes "�ł́A�d������`���Ă��炨���B";
	mes "������Ə��������邩��";
	mes "�������Ă���܂��b�������Ă���B";
	set CHANGE_BS,3;
	close;
}

//============================================================
// �񎟎����i�z�B�j
//------------------------------------------------------------
morocc,27,112,4	script	�q���b�P	725,{
	switch(CHANGE_BS) {
	case 9:
		if(countitem(1219)) {
			cutin "job_black_hucke01",2;
			mes "[�q���b�P]";
			mes "�c�c�͂������I";
			mes "�悱���I";
			next;
			mes "[�q���b�P]";
			mes "���̎����������������낤�ȁH";
			mes "���O���g���Ă������Ȃǂ�";
			mes "����񂼁H";
			next;
			if(select("�����A����́c���́c","��肠��܂���B�V�i�ł�")==1) {
				cutin "job_black_hucke03",2;
				mes "[�q���b�P]";
				mes "�c�N���b�I";
				next;
				mes "- �{���Ă���悤�� -";
				break;
			}
			cutin "job_black_hucke02",2;
			mes "[�q���b�P]";
			mes "���͂͂͂́I";
			next;
			mes "- �{���Ɋ��������� -";
			next;
			cutin "job_black_hucke01",2;
			mes "[�q���b�P]";
			//mes "�Q�t�F���̃u���b�N�X�~�X�M���h��";
			mes "�A�C���u���b�N��";
			mes "�u���b�N�X�~�X�M���h��";
			mes "���O�̐搶�A�Q�b�V���ɓ`����I";
			next;
			cutin "job_black_hucke03",2;
			mes "[�q���b�P]";
			mes "�x���B";
			mes "�҂̂͌������B";
			next;
			cutin "job_black_hucke02",2;
			mes "[�q���b�P]";
			mes "�������A�i���͗ǂ��B���������B�ƁB";
			next;
			mes "(�����������Ă���B)";
			next;
			mes "[�q���b�P]";
			mes "�̎������B ���O�ɂ���������B";
			delitem 1219,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			break;
		}
		//fall through
	default:
		cutin "job_black_hucke03",2;
		mes "[�q���b�P]";
		mes "�c�c�c�B";
		mes "�c�c�����������c������񂾁H";
		next;
		mes "[�q���b�P]";
		//mes "�Q�t�F���̃u���b�N�X�~�X�M���h�c";
		mes "�A�C���u���b�N��";
		mes "�u���b�N�X�~�X�M���h�c";
		mes "�Q�b�V���c�x������I";
		next;
		mes "[�q���b�P]";
		mes "���́A�{�����I";
		break;
	case 14:
		cutin "job_black_hucke02",2;
		mes "[�q���b�P]";
		mes "���肪�Ƃ��B";
		break;
	}
	close2;
	cutin "dummy",255;
	end;
}

geffen,46,164,4	script	�o�C�X	69,{
	switch(CHANGE_BS) {
	case 10:
		if(countitem(1610)) {
			mes "[�o�C�X]";
			mes "����܂��c����Ɠ͂����̂ˁI";
			mes "���肪�Ƃ��`�{���ɑ҂��Ă��̂�B";
			next;
			mes "[�o�C�X]";
			mes "�������������������ł���ˁH";
			mes "���Ȃ����g���Ă����J�[�h��������";
			mes "�����肷�钆�Õi����Ȃ����ˁH";
			next;
			if(select("���A����͎��́c","��肠��܂���B�V�i�ł�")==1) {
				mes "[�o�C�X]";
				mes "�c�������肵�Ȃ����B";
				close;
			}
			mes "[�o�C�X]";
			mes "������ˁA�ӂӂӁc";
			next;
			mes "[�o�C�X]";
			//mes "�Q�t�F���̃u���b�N�X�~�X�M���h��";
			//mes "�˗�������A�A���x���^�ɘr�̗ǂ�";
			mes "�A�C���u���b�N��";
			mes "�u���b�N�X�~�X�M���h��";
			mes "�˗�������A�A�C���x�t�ɘr�̗ǂ�";
			mes "�l��������ĕ��������炨�肢�����́B";
			next;
			mes "[�o�C�X]";
			mes "����ȉ������܂ł킴�킴���Ă����";
			mes "�{���ɂ��肪�Ƃ��������܂��B";
			mes "���̃Q�b�V���̓z�A�ꔭ�����Ă����";
			mes "���������ȁB�{���ɑ҂����񂾂���B";
			next;
			mes "[�o�C�X]";
			mes "���A�҂��Ăˁ`�̎�����n���܂�����B";
			next;
			mes "-������������-";
			next;
			mes "[�o�C�X]";
			mes "�͂��A����ł��B���ꂶ��A";
			mes "�����l�ł����B�{���ɂ��肪�Ƃ��`";
			delitem 1610,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[�o�C�X]";
		//mes "��������c�B�A���x���^�͉�������";
		mes "��������c�B�A�C���x�t�͉�������";
		mes "���������i�����Ȃ��Ȃ����Ȃ��āc";
		next;
		mes "[�o�C�X]";
		//mes "�Q�t�F���̃u���b�N�X�~�X�M���h��";
		//mes "�˗�������A�A���x���^�ɘr�̗ǂ�";
		mes "�A�C���u���b�N��";
		mes "�u���b�N�X�~�X�M���h��";
		mes "�˗�������A�A�C���x�t�ɘr�̗ǂ�";
		mes "�l��������ĕ��������炨�肢�����́B";
		next;
		mes "[�o�C�X]";
		mes "��������";
		mes "�u������ƃC�C�����̃A�[�N�����h�v";
		mes "�͂��ɂȂ����痈��̂�����c";
		close;
	case 14:
		mes "[�o�C�X]";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
}

//izlude,69,181,4	script	�O����	734,{
lighthalzen,209,80,4	script	�O����	734,{
	switch(CHANGE_BS) {
	case 11:
		if(countitem(1119)) {
			mes "[�O����]";
			mes "�����c�͂��܂����ˁH";
			mes "�����ˁc������ƌ��Ă݂܂��傤�B";
			next;
			mes "[�O����]";
			mes "���������������ł���ˁH";
			mes "���Ȃ����g�������ł����牓�����܂��B";
			next;
			if(select("�����A����́c���́c","��肠��܂���B�V�i�ł�")==1) {
				mes "[�O����]";
				mes "�܂Ƃ��ȕ������������I";
				mes "�J�[�h�������Ă����萸�B���ꂽ";
				mes "���͗v��܂���I";
				next;
				mes "- �{���Ă���悤�� -";
				close;
			}
			mes "[�O����]";
			mes "�m�F���܂������H";
			mes "����c���������܂��B";
			next;
			mes "[�O����]";
			mes "�ق��c�B����Ȃ�c";
			mes "�����d�l���ǂ����ł��ˁB";
			next;
			mes "[�O����]";
			mes "���̃c���M�Ȃ�c���̕K�E�Z�c";
			mes "2�����a����������邱�Ƃ�";
			mes "�o����ł��傤�I";
			mes "�C�ɓ���܂���!!";
			next;
			mes "[�O����]";
			mes "���ꂶ��c�̎������B";
			next;
			mes "- �����������Ă��� -";
			next;
			mes "[�O����]";
			mes "�̎����ł��c�����l�ł����I";
			delitem 1119,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[�O����]";
		mes "�c�c�c�B";
		mes "�c�c�����������͂�����̂��ȁB";
		next;
		mes "[�O����]";
		mes "2�����a�����������ׂɂ́c";
		mes "���̃c���M�����Ȃ��̂Ɂc �����c";
		next;
		mes "[�O����]";
		mes "���������c�c�B";
		close;
	case 14:
		mes "[�O����]";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
}

//comodo,158,342,4	script	�r�X�}���N	118,{
hugel,168,183,4	script	�r�X�}���N	118,{
	switch(CHANGE_BS) {
	case 12:
		if(countitem(1122)) {
			mes "[�r�X�}���N]";
			mes "���ق��فc�c";
			mes "�͂��c�͂��c�B���c�������ɓn���āc";
			next;
			mes "[�r�X�}���N]";
			mes "�������������c���ł����c�H";
			mes "�Ⴄ���Ȃ�A���͏�����Ȃ��Ȃ�܂��c";
			next;
			if(select("�����A����́c���́c","��肠��܂���B�V�i�ł�")==1) {
				mes "[�r�X�}���N]";
				mes "�c���c���Ԃ��c�����c";
				mes "���فc�ł��c�ǁc�ł��c";
				next;
				mes "- ����Ă��� -";
				close;
			}
			mes "[�r�X�}���N]";
			mes "���c������c���c�Ɂc";
			next;
			mes "[�r�X�}���N]";
			mes "�����c�B";
			mes "�O���[���n�[�u�����c";
			mes "�����Əo���Ă܂���ˁc";
			next;
			mes "[�r�X�}���N]";
			mes "��`���āc�B��l�ł͓����Ȃ��c";
			mes "���Ӂc";
			next;
			mes "- �����̎�Ŏ����������� -";
			next;
			mes "[�r�X�}���N]";
			mes "�����c";
			next;
			mes "[�r�X�}���N]";
			mes "�ӂ��c ��Ō��ʂ������Ă���";
			mes "�悤���c";
			next;
			mes "[�r�X�}���N]";
			mes "����c�̎����ł��B������܂����c";
			delitem 1122,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[�r�X�}���N]";
		mes "�c�c�͂��c�͂��c�B";
		mes "�c�c�����������͂Ȃ����Ȃ��̂��c";
		next;
		mes "[�r�X�}���N]";
		mes "�c�B�������E���c�ł��̑S�̂Ɂc";
		mes "���c ���Ӂc";
		next;
		mes "[�r�X�}���N]";
		mes "�����c��ō܁c��Łc���c";
		close;
	case 14:
		mes "[�r�X�}���N]";
		mes "���肪�Ƃ��������܂����c";
		mes "�������ŏ�����܂����c";
		close;
	}
}

payon,214,79,2	script	�e���s�c	59,{
	switch(CHANGE_BS) {
	case 13:
		if(countitem(1713)) {
			mes "[�e���s�c]";
			mes "�c�c�B�����B ����!!!";
			mes "���܂������[!!!";
			mes "������!! ����!!";
			next;
			mes "[�e���s�c]";
			mes "����͖l�������������ł���ˁH";
			mes "���Ȃ����g���Â������͗v��܂���B";
			next;
			if(select("�����A����́c���́c","��肠��܂���B�V�i�ł�")==1) {
				mes "[�e���s�c]";
				mes "�ł́A�܂Ƃ��ȕ������������I";
				mes "�J�[�h�������Ă�����A���B���ꂽ";
				mes "���͌��\�ł��I";
				next;
				mes "- �{���ɓ{���Ă���悤�� -";
				close;
			}
			mes "[�e���s�c]";
			mes "�ǂ��ł��ˁB�V�i�ł��ˁI";
			next;
			mes "[�e���s�c]";
			mes "�͂��͂��͂��c�B";
			mes "�f���炵���o���ł��I";
			next;
			mes "[�e���s�c]";
			mes "���c���̊�ё܁I ���i�ł�!!";
			mes "���̎d�グ�����ō�!!";
			mes "�{���ɁA�{���ɋC�ɓ���܂����I";
			next;
			mes "[�e���s�c]";
			mes "���肪�Ƃ��A���肪�Ƃ��c";
			next;
			mes "-�����������Ă���-";
			next;
			mes "[�e���s�c]";
			mes "����A�̎����ł��B";
			mes "�{���ɂ��肪�Ƃ��������܂����[�I";
			delitem 1713,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[�e���s�c]";
		mes "�����c�c�B";
		mes "�c�c�����������͂��ɂȂ�����";
		mes "��������̂��ȁc";
		next;
		mes "[�e���s�c]";
		mes "�l�̊�т�����܂��Ȃ��c";
		mes "�����c����ȑ܂�����Ă����l��";
		mes "�u���̕��v�������Ȃ��̂Ɂc�͂��c";
		next;
		mes "[�e���s�c]";
		mes "�����c������񂾂낤�c�B";
		close;
	case 14:
		mes "[�e���s�c]";
		mes "����Ό���قǖ��i�c�c";
		close;
	}
}

//============================================================
// �O�������i�ŏI����j
//------------------------------------------------------------
//morocc,95,133,4	script	�u���b�N�X�~�X�M���h��	726,{
ein_in01,24,41,4	script	�u���b�N�X�~�X�M���h��	726,{
	switch(CHANGE_BS) {
	default:
		//mes "[�~�b�g�}�C��]";
		//mes "�͂��c �����N�͂���";
		//mes "��������˂��`�`";
		//mes "�c�c";
		//next;
		//mes "[�~�b�g�}�C��]";
		//mes "�܁A���B�u���b�N�X�~�X��";
		//mes "�����΂̋߂��̏����Ƃ����";
		//mes "�d�����Ă邩�珋���̂ɂ�";
		//mes "����Ă邯�ǃl�B";
		//next;
		//mes "[�~�b�g�}�C��]";
		//mes "�ł��c���������Ȃ�̂͂���c";
		//close;
		mes "[�~�b�g�}�C��]";
		mes "�͂��c �����N�͏�����������";
		mes "�����͉����h����ˁB";
		mes "�c�c";
		next;
		mes "[�~�b�g�}�C��]";
		mes "�ł��A�������u���b�N�X�~�X��";
		mes "�u���b�N�X�~�X�M���h��";
		mes "�����̖��_��������";
		mes "�ō��̕��퐻��̂��߂ɂ���";
		mes "�őP�������́B";
		next;
		mes "[�~�b�g�}�C��]";
		mes "�����A�E�ϗ͂Ȃ�";
		mes "�N�ɂ������Ȃ����g�������I";
		close;
	case 16:
		mes "[�~�b�g�}�C��]";
		mes "�悤�����B �ӂӁA�u���b�N�X�~�X��";
		mes "�Ȃ肽���H";
		mes "�����ł��傤�c";
		mes "�ł��A�����͂������";
		mes "�c���Ă����B";
		next;
		mes "[�~�b�g�}�C��]";
		mes "������́A�z�΂̒m����";
		mes "�u���b�N�X�~�X�̃X�L���ɂ���";
		mes "�F�X���₳���Ă��������܂��B";
		mes "����A�͂��߂܂��傤���c";
		next;
		if(select("�͂�","������")==2) {
			mes "[�~�b�g�}�C��]";
			mes "�����A�����������[�B";
			mes "�u���b�N�X�~�X�S���̊�{�ł��ˁB";
			close;
		}
		mes "[�~�b�g�}�C��]";
		mes "��낵���c�����o���܂��c";
		mes "������x�ԈႦ����";
		mes "���i�ɂ͂Ȃ�܂���B";
		next;
		mes "[�~�b�g�}�C��]";
		mes "���͑S����5��ł��B";
		mes "�T�d�ɑI��ł��������B";
		next;
		mes "[�~�b�g�}�C��]";
		mes "�c�s���܂��I";
		next;
		break;
	case 17:
		mes "[�~�b�g�}�C��]";
		mes "�͂��H���i�ł���I";
		next;
		mes "[�~�b�g�}�C��]";
		//mes "�Q�t�F���ɖ߂��Ă��������ˁB";
		mes "�A�C���u���b�N�ɖ߂��Ă��������ˁB";
		next;
		mes "[�~�b�g�}�C��]";
		mes "�b�艮�̋��Ɓc�Y��Ȃ��łˁI";
		next;
		mes "[�~�b�g�}�C��]";
		mes "���������A�]�E����O��";
		mes "�X�L���|�C���g��S���U�邱�Ƃ�";
		mes "�Y��Ȃ��łˁB";
		close;
	}
	//�ŏI���₱������
	switch(rand(3)) {
	case 0:
		mes "[�~�b�g�}�C��]";
		mes "1. ���ō|�S�𗎂Ƃ������X�^�[�́H";
		next;
		set @menu,select("�[����","�X�`�[���`�����`����","�X�P�����[�J�[","���N�C�G��");	//2��3������
		if(@menu == 2 || @menu == 3)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "2. ���Ń��b�h�u���b�h����";
		mes "���鑮���΂́H";
		next;
		if(select("�t���C���n�[�g","���t�E�B���h","�O���C�g�l�C�`��","�~�X�e�B�b�N�t���[�Y��")==1)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "3. �����̑q�ɂ̒���";
		mes "��ԑ����������΂́H";
		next;
		if(select("�E�B���h�I�u���F���f���[��","���b�h�u���b�h","�C�G���[���C�u","�N���X�^���u���["))	//�ǂ������
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "4. ��ʓI�ɍl���āA�����������";
		mes "�U������ƈ�Ԍ��ʂ̍��������́H";
		next;
		if(select("�Α���","������","�n����","������")==2)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "5. �|�S�����ɂ͓S�����K�v�H";
		next;
		if(select("5��","4��","3��","10��")==1)
			set .@point,.@point+20;
		break;
	case 1:
		mes "[�~�b�g�}�C��]";
		mes "1. �N���ɏ��������߂�ꂽ";
		mes "���͂ǂ����܂����H";
		next;
		if(select("�����K�v������","���΂炭�b�𕷂�","��������","�A�C�e���������Ă��̏ꂩ�狎��")<3)	//�P�ƂQ������
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "2. ���E�h�{�C�X�y�у`�F���W�J�[�g";
		mes "���w�Ԃ��Ƃ��ł���X�͂ǂ����B";
		next;
		if(select("�A���f�o����","�A���x���^","�����N","�C�Y���[�h")==2)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		//mes "3. �Q�t�F��������Ƃ��āA";
		mes "3. ���������Ƃ��āA";
		mes "�u���b�N�X�~�X�M���h�̈ʒu�́H";
		next;
		if(select("11������","5������","7������","12������")==2)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "4. �u���b�N�X�~�X��";
		mes "��ԑ�������X�́H";
		next;
		//if(select("�v�����e��","�����N","�A���x���^","�Q�t�F��")==4)
		if(select("�v�����e��","�����N","�A���x���^","�A�C���u���b�N")==4)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "5. �����ɉe�����y�ڂ�";
		mes "�X�e�[�^�X�́H";
		next;
		if(select("STR (��)","DEX (��p��)","AGI (�f����)","VIT (�̗�)")==2)
			set .@point,.@point+20;
		break;
	case 2:
		mes "[�~�b�g�}�C��]";
		mes "1. �f�B�X�J�E���g���K�����邽�߁A";
		mes "�K�v�ȉߒ��́H";
		next;
		if(select("�v�b�V���J�[�g Lv3","�A�C�e���Ӓ�","���}�[�i�C�g Lv10","�������E�ʑ��� Lv3")==4)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "2. �n���}�[�t�H�[�����Ώۂ�";
		mes "�q�b�g�������������ǉ����ʂ́H";
		next;
		if(select("�X�^��","�È�","����","����")==1)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "3. ���}�[�i�C�g Lv10�������A";
		mes "������Zeny�͂�����H";
		next;
		if(select("900 Zeny","1000 Zeny","2000 Zeny","10�� Zeny")==2)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "4. �f�B�X�J�E���g Lv10��";
		mes "�������͂�����H";
		next;
		if(select("21 %","22 %","23 %","24 %")==4)
			set .@point,.@point+20;
		mes "[�~�b�g�}�C��]";
		mes "5. �I�[�o�[�`���[�W Lv10�̎���";
		mes "��%�܂ō�������邩�B";
		next;
		if(select("21 %","22 %","23 %","24 %")==4)
			set .@point,.@point+20;
	}
	mes "[�~�b�g�}�C��]";
	mes "�����l�ł����c";
	next;
	mes "[�~�b�g�}�C��]";
	mes "�ӂނӂށc�_���� " +.@point+ "�_�I";
	if(.@point < 80) {
		mes "�c�O�c �����ƕ׋����Ă��������I";
		next;
		mes "[�~�b�g�}�C��]";
		mes "����ł́c ��Ζ����ł��c";
		mes "�b�艮�ɂȂ��Ă����䂵���Ⴂ�܂��B";
		close;
	}
	mes "�ӂӁc ���΂炵���c�I";
	mes "���߂łƂ��B ���i�ł��I";
	next;
	mes "[�~�b�g�}�C��]";
	mes "�ł��A����ŋC�𔲂��Ă͂��߂ł���B";
	mes "�u���b�N�X�~�X�ɂȂ��Ă��炪�{����";
	mes "�����̎n�܂�ł��B";
	mes "�͂��A����͍��i�̏؁A";
	mes "�b�艮�̋��Ɓ`";
	getitem 1005,1;
	set CHANGE_BS,17;
	next;
	mes "[�~�b�g�}�C��]";
	//mes "����������āA�Q�t�F����";
	mes "����������āA�A�C���u���b�N��";
	mes "�u���b�N�X�~�X�M���h��";
	mes "�߂��Ă��������B";
	next;
	mes "[�~�b�g�}�C��]";
	mes "���ꂶ��A�K�^���F��܂�!!!";
	close;
}

//============================================================
// ���B�p�i�̔���
//------------------------------------------------------------
ein_in,38,29,4	script	�|�[���X�p�i	63,{
	if((MaxWeight - Weight) < 2000) {
		mes "-�����A�C�e���̏d�ʂ���������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���-";
		mes "-�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă�������-";
		close;
	}
	mes "[�|�[���X�p�i]";
	mes "�悭�����ȁB";
	mes "�����͐��B�Ɋւ��";
	mes "�S�ẴA�C�e���������Ă���B";
	mes "�����~�����̂������Ă݂ȁB";
	next;
	switch(select("���~�̍w��","���B�i�̍w��","�����̍w��","���΂̐���","��߂�")) {
	case 1:
		mes "[�|�[���X�p�i]";
		mes "���~�͐��B�̊�{�A�C�e�����B";
		mes "�v���؂��ėǂ����";
		mes "�I��ł݂���ǂ����H";
		next;
		switch(select("���~-30000Zeny","�I���f�I�R���̋��~-120000Zeny","�����̋��~-300000Zeny","�����ƌ������~","����������߂�")) {
		case 1:
			set .@itemid,986;
			set .@price,30000;
			break;
		case 2:
			set .@itemid,987;
			set .@price,120000;
			break;
		case 3:
			set .@itemid,988;
			set .@price,300000;
			break;
		case 4:
			mes "[�|�[���X�p�i]";
			mes "�����̋��~��茘���̂͂Ȃ��ȁB";
			mes "����ȏ㌘�������ƂȂ��";
			mes "���̓X�ɂ��u���ĂȂ����낤�B";
			mes "�c�c�`���̋��~����҂ł���";
			mes "�u�����Q���v�Ȃ�c�c�c�c";
			close;
		case 5:
			mes "[�|�[���X�p�i]";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		if(Zeny < .@price) {
			mes "[�|�[���X�p�i]";
			mes "��������Ȃ��ȁB";
			mes "����������������Ȃ�łˁB";
			close;
		}
		set Zeny,Zeny-.@price;
		getitem .@itemid,1;
		switch(@menu) {
		case 1:
			mes "[�|�[���X�p�i]";
			mes "�l�i�͈�������������낤�B";
			break;
		case 2:
			mes "[�|�[���X�p�i]";
			mes "�Ȃ��Ȃ������ڂ����Ă���ȁB";
			mes "�b�艮�Ƃ��Ă��̈ʂ̋��~��";
			mes "�K���i���낤�ȁB";
			break;
		case 3:
			mes "[�|�[���X�p�i]";
			mes "�����̋��~��I������������";
			mes "���O�ɂ͗��h�Ȓb��̐S����";
			mes "����Ƃ����̂��킩��I";
			mes "���̍ō��̋��~��";
			mes "���h�ȕ�������ȁB";
			close;
		}
		break;
	case 2:
		mes "[�|�[���X�p�i]";
		mes "�z���𐸘B���A";
		mes "����𐻑�����ɂ͑����̍ޗ�������B";
		mes "���O�ɕK�v�ȃA�C�e����";
		mes "�S�Ă����ɂ���B";
		mes "�D���Ȃ��I��ł݂�B";
		next;
		switch(select("�g�їp�n�z�F-150Zeny","�|�S�̋���-1000Zeny","�����̋���3000 Zeny","�I���f�I�R���̋��� - 5000 Zeny","����������߂�")) {
		case 1:
			mes "[�|�[���X�p�i]";
			mes "���������ɂ͂������K�{��!!";
			next;
			set .@itemid,612;
			set .@price,150;
			break;
		case 2:
			set .@itemid,613;
			set .@price,1000;
			break;
		case 3:
			set .@itemid,614;
			set .@price,3000;
			break;
		case 4:
			set .@itemid,615;
			set .@price,5000;
			break;
		case 5:
			mes "[�|�[���X�p�i]";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		mes "[�|�[���X�p�i]";
		mes "�����A�����~�����񂾁H";
		mes "�������𒆎~���������";
		mes "�u0�v�Ɠ��͂���񂾁B";
		while(1) {
			next;
			input .@num;
			if(.@num < 0 || .@num > 500) {
				mes "[�|�[���X�p�i]";
				mes "500�ȉ��Ō��߂�񂾁B";
				continue;
			}
			break;
		}
		if(.@num == 0) {
			mes "[�|�[���X�p�i]";
			mes "�������𒆎~�����B";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		if(Zeny < .@price*.@num) {
			mes "[�|�[���X�p�i]";
			mes "��������Ȃ��ȁB";
			mes "����������������Ȃ�łˁB";
			close;
		}
		if(checkweight(.@itemid,.@num)==0) {
			mes "[�|�[���X�p�i]";
			mes "����ȂɎ��ĂȂ�����H";
			mes "�܂��͉ו��𐮗�������ǂ����B";
			close;
		}
		set Zeny,Zeny-.@price*.@num;
		getitem .@itemid,.@num;
		mes "[�|�[���X�p�i]";
		break;
	case 3:
		mes "[�|�[���X�p�i]";
		mes "���x�̍����������I��ł��邼�B";
		mes "���x��1�̕��퐻�B�Ɏg����";
		mes "^007373�v���R��^000000 ��";
		mes "���x��2�̕��퐻�B�Ɏg����";
		mes "^007373�G���x���^�R��^000000 �����邼�B";
		mes "�ǂ̋������w������񂾁H";
		next;
		if(checkweight(1010,10)==0 || checkweight(1011,10)==0) {
			mes "[�|�[���X�p�i]";
			mes "�ו��������ȁB";
			mes "�������𐮗����Ă���";
			mes "�܂������ŁB";
			close;
		}
		switch(select("�v���R���w��","�G���x���^�R���w��","����������߂�")) {
		case 1:
			set .@itemid,1010;
			set .@price,200;
			break;
		case 2:
			set .@itemid,1011;
			set .@price,1000;
			break;
		case 3:
			mes "[�|�[���X�p�i]";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		mes "[�|�[���X�p�i]";
		mes "�����A�����~�����񂾁H";
		mes "�������𒆎~���������";
		mes "�u0�v�Ɠ��͂���񂾁B";
		while(1) {
			next;
			input .@num;
			if(.@num < 0 || .@num > 500) {
				mes "[�|�[���X�p�i]";
				mes "500�ȉ��Ō��߂�񂾁B";
				continue;
			}
			break;
		}
		if(.@num == 0) {
			mes "[�|�[���X�p�i]";
			mes "�������𒆎~�����B";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		if(Zeny < .@price*.@num) {
			mes "[�|�[���X�p�i]";
			mes "��������Ȃ��ȁB";
			mes "����������������Ȃ�łˁB";
			close;
		}
		if(checkweight(.@itemid,.@num)==0) {
			mes "[�|�[���X�p�i]";
			mes "����ȂɎ��ĂȂ�����H";
			mes "�܂��͉ו��𐮗�������ǂ����B";
			close;
		}
		set Zeny,Zeny-.@price*.@num;
		getitem .@itemid,.@num;
		mes "[�|�[���X�p�i]";
		break;
	case 4:
		mes "[�|�[���X�p�i]";
		mes "�����ł��������";
		mes "�I���f�I�R���ƃG���j�E�����B";
		mes "���ꂼ��5�̌��΂𐸐����āA";
		mes "���x�̍������������B";
		mes "�����c�c�ǂ̋����ɂ���񂾁H";
		next;
		switch(select("�I���f�I�R�������","�G���j�E�������","��߂�")) {
		case 1:
			set .@itemid,756;
			set .@gain,984;
			break;
		case 2:
			set .@itemid,757;
			set .@gain,985;
			break;
		case 3:
			mes "[�|�[���X�p�i]";
			mes "�����K�v�ɂȂ�����";
			mes "�܂�����Ƃ����B";
			close;
		}
		if(countitem(.@itemid)<5) {
			mes "[�|�[���X�p�i]";
			mes getitemname(.@itemid)+ "��5�Ȃ���΁A";
			mes getitemname(.@gain)+ "�͍��Ȃ���";
			mes "����Ȃ��������H";
			close;
		}
		delitem .@itemid,5;
		getitem .@gain,1;
		mes "[�|�[���X�p�i]";
		mes "�����A" +getitemname(.@gain)+ "���B";
		mes "�܂��K�v�ɂȂ����炭��Ƃ����B";
		close;
	case 5:
		mes "[�|�[���X�p�i]";
		mes "�����K�v�ɂȂ�����";
		mes "�܂�����Ƃ����B";
		close;
	}
	mes "���肪�Ƃ�B";
	mes "�����K�v�ɂȂ�����";
	mes "�܂�����Ƃ����B";
	close;
}