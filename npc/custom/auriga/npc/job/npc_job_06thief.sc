//====================================================================
//Ragnarok Online Thief jobchange script
//
//�@�� CHANGE_TF  -> 0�`1, 0�`3(Old)
//     OLD_CLASS  -> �]���O�̐E��
//     @doubt_npc -> 0�`4
//====================================================================

//==========================================
// �����\������ѓ]�E
//------------------------------------------

moc_prydb1,39,129,2	script	�M���h�֌W��#TF	69,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Assassin || OLD_CLASS == Job_Rogue)) {
		if(Job == Job_Novice) {
			mes "[�V�[�t�M���h�֌W��]";
			mes "����A�ǂ����Ō����C������ˁB";
			mes "�Z��ł�����̂����H";
			next;
			if(getskilllv(1) < 9) {
				mes "[�V�[�t�M���h�֌W��]";
				mes "�Ȃ񂾁A�V�[�t�ɂȂ肽���̂��B";
				mes "�ł��A����ɂ�����ȒP�Ȃ��Ƃ�";
				mes "�Y��Ă��Ȃ����H";
				next;
				mes "[�V�[�t�M���h�֌W��]";
				mes "JobLv��10�ɂ܂Ő��������A";
				mes "^0000FF�u��{�X�L���v�̃��x����9�@^000000��";
				mes "���Ă���񂾁B";
				next;
				mes "[�V�[�t�M���h�֌W��]";
				mes "^0000FF�u��{�X�L���v^000000�̃��x����";
				mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "�グ�邱�Ƃ��ł��邩��ˁI";
				mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "^0000FF�u��{���v^000000�E�B���h�E����";
				mes "^0000FF�uSkill�v^000000�{�^���ŕ\��������B";
				next;
				mes "[�V�[�t�M���h�֌W��]";
				mes "�X�L���̃��x�����グ��ɂ́A";
				mes "�X�L���|�C���g������U������A";
				mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ邩��ˁB";
				mes "���ӂ��Ă����B";
				next;
				mes "[�V�[�t�M���h�֌W��]";
				mes "�܂��A���������b���Ă���o�����ȁI";
				close;
			}
			mes "[�V�[�t�M���h�֌W��]";
			mes "����Ƃ��̂ɓ]�E�������z���H";
			mes "�悵�A�܂��]�E�����Ă���I";
			next;
			nude;
			jobchange Job_Thief,UPPER_HIGH;
			//setquest 51010;
			//setquest 51050;
			//setquest 51105;
			//setquest 51160;
			skill 149,1,0;
			skill 150,1,0;
			skill 151,1,0;
			skill 152,1,0;
			mes "[�V�[�t�M���h�֌W��]";
			mes "�V�[�t�̓V�[�t�炵����炵�ȁI";
			mes "���Ƃ͖Z��������ȗ����B";
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[�V�[�t�M���h�֌W��]";
		mes (Sex)? "�����A�Z�����B": "�ق�A�o�����B";
		mes "�����ɗ����H�@�A��A�A��I";
		close;
	}
	if(Job == Job_Thief) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "��[";
		mes "�Y�݂��������炢�ł�";
		mes "���̂��ˁ[����ɑ��k���Ă�I";
		mes "����H";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes (Sex)? "�Z�����A": "�o�����A";
		mes "�V�[�t�ɂȂ����񂾂���A";
		mes "�`���҃A�J�f�~�[��";
		mes "�s���Ă݂�Ƃ�����B";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "���̕����̋�������";
		mes "�`���҃A�J�f�~�[�̃T�|�[�g��";
		mes "�s���Ă���l�������邾��B";
		mes "�����Ă�����B";
		close;
	}
	if(Job != Job_Novice) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "���O�͂Ȃ񂾁c�c�H";
		switch(Job) {
			case Job_Swordman: mes "�n���ȃ\�[�h�}�����I"; 		break;
			case Job_Mage: mes "�T�[�J�X�c�̃}�W�V�������I"; 	break;
			case Job_Archer:   mes "�A�z�E�̃A�[�`���[���ȁI"; 	break;
			case Job_Acolyte:  mes "���E�ŋ��|�\�l���q�҃A�R���C�g���I"; 	break;
			case Job_Merchant: mes "�����ȏ��l���I"; 		break;
		}
		if(Job < Job_Thief) {
			next;
			mes "[�V�[�t�M���h�֌W��]";
		}
		mes (Sex)? "�����A�Z�����B": "�ق�A�o�����B";
		mes "�����ɗ����H�@�A��A�A��I";
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[�V�[�t�M���h�֌W��]";
		mes "�ւ��c�c" +((Sex == 0)?"����l":"�V�����")+ "�����̗p��";
		mes "����ȉ������܂ł킴�킴";
		mes "�����̂��ȁH";
		break;
	case 1:
		mes "[�V�[�t�M���h�֌W��]";
		mes "���[�܂��������B";
		mes "���x�͊ԈႢ�Ȃ����낤�H";
		break;
	}
	//case0,1�̑���
	next;
	if(select("�V�[�t�ɂȂ肽���B","�Ȃ�ł��Ȃ��B")==2) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "�Ȃ񂾂�B�]�E�����Ȃ��̂Ɂc�c";
		mes "�{���ɉ����ɗ����H";
		mes "�����l���Ă���񂾂�c�c�H";
		close;
	}
	if(CHANGE_TF==0) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "�c�c�������鎖�͂Ȃ����낤�H";
		mes "�V�[�t�ɂȂ肽�����āA�����";
		mes "�p�������������悭������ȁB";
		mes "�n�����H�@�������Ă�l�Ɏ���";
		mes "�V�[�t�ɂȂ�܂����āA�L���ł�����";
		mes "�C���H�@������ƁA���ɉ�������H";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "�{���ɃV�[�t�ɂȂ肽���̂��H";
		next;
		switch (select("����B","������B","����Ȃ��ƌ����Ă�N�́H")) {
		case 1:
			mes "[�V�[�t�M���h�֌W��]";
			mes "�ӂ�c�c";
			mes "�܂��A���[��������d���Ȃ����B";
			break;
		case 2:
			mes "[�V�[�t�M���h�֌W��]";
			mes "��������A�Ȃ񂾂�H";
			mes "�����ɗ��l�ł�����̂��H";
			mes "����Ȃ�������";
			mes "�V�[�t�M���h�܂ŉ����ɗ����H";
			break;
		case 3:
			mes "[�V�[�t�M���h�֌W��]";
			mes "���c�c�H�@�������c�c�H";
			mes "�܂��A�������́c�c�����c�c�����A";
			mes "�ׂ������͕����ȁI";
			break;
		}
		mes "�Ƃ肠�����A�������E�ŃV�[�t��";
		mes "�Ȃ肽���Ƃ���������ʖڂ���I";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "�{���ɁA";
		mes "�{���ɃV�[�t�ɂȂ肽���̂��H";
		next;
		if(select("����B","����ς��߂�B")==2) {
			mes "[�V�[�t�M���h�֌W��]";
			mes "�Ȃ񂾂�B�]�E�����Ȃ��̂Ɂc�c";
			mes "�{���ɉ����ɗ����H";
			mes "�����l���Ă���񂾂�c�c�H";
			close;
		}
		set CHANGE_TF,1;
		mes "[�V�[�t�M���h�֌W��]";
		mes "��������N�̖��O�������āB";
		mes "����H�@�ȂɁH";
		mes " " +strcharinfo(0)+ " �c�c";
		mes " " +strcharinfo(0)+ " ���ˁB";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "�\������OK�B";
		mes "�]�E�����������m���Ă�񂾂�����A";
		mes "���̂܂ܖʐڂɓ����B";
		mes "����Ă݂邩�H";
		next;
		if(select("����A������","����A���")==2) {
			mes "[�V�[�t�M���h�֌W��]";
			mes "�܂��A�D���ɂ��ȁB�΂��΂��`";
			close;
		}
	}
	mes "[�V�[�t�M���h�֌W��]";
	mes "�����A����ł́A�m�F���悤���H";
	next;
	mes "[�V�[�t�M���h�֌W��]";
	mes "���O�� " +strcharinfo(0)+ "�B";
	mes "�����Ɓc�c���A���ꂾ�ȁB";
	mes "���� " +strcharinfo(0)+ "�B";
	mes "������Ɓ`�҂��ā`";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "�V�[�t�ɂȂ肽���Ƃ���";
		mes "�N�̈ӎu�͂킩�邪�c�c";
		mes "�ӎu�����Ő��̒�������";
		mes "�s���Ȃ��񂾂�I";
		mes "�Œ�ł�^0000FF�u��{�X�L���v��";
		mes "���x����9^000000 �ɂȂ�Ȃ��Ƒʖڂ��I";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "JobLv��10�ɂ܂Ő��������A";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "���Ă���񂾁B";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł��邩��ˁI";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\��������B";
		next;
		mes "[�V�[�t�M���h�֌W��]";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ邩��ˁB";
		mes "���ӂ��ĂˁB";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[�V�[�t�M���h�֌W��]";
	mes "����c�c�����������炠����x";
	mes "�����[�����������邵�c�c";
	mes "��{���o���Ă邵�c�c������B";
	mes "�����";
	mes "�V�[�t�M���h�̖ʐڂ͏I���I";
	next;
	getitem 11028,1;
	nude;
	jobchange Job_Thief;
	set CHANGE_TF,0;
	setquest 50115;
	mes "[�V�[�t�M���h�֌W��]";
	mes "�N�̃V�[�t�]�E�����j������B";
	mes "�Ȍ�A�V�[�t�M���h�̈���Ƃ��āA";
	mes "�M���h�̒����ƋK�͂����B������A";
	mes "�͂��ꂽ�s���⃋�[���ᔽ�ȂǂŁA";
	mes "�V�[�t�M���h�ɔ�Q���������ꍇ�A";
	next;
	mes "[�V�[�t�M���h�֌W��]";
	mes "�N�̑��݂̓M���h�ɂ����";
	mes "��������鎖�����ꂮ����Y�ꂸ�ɁB";
	mes "�܂��A�f���炵�����������҂���B";
	mes "�ȏ�B";
	next;
	mes "[�V�[�t�M���h�֌W��]";
	mes "���ꂵ���b�͂���ŏI����B";
	next;
	mes "[�V�[�t�M���h�֌W��]";
	mes "���̃V�[�t�̏��ɂ�";
	mes "�V�[�t�Ƃ��ĉ�����������";
	mes "�����������Ă���B";
	mes "�ڂ�ʂ��Ă����Ƃ�����B";
	next;
	mes "[�V�[�t�M���h�֌W��]";
	mes "����ɂāA�V�[�t�ւ̓]�E�͊����I";
	mes "�V�[�t�̓V�[�t�炵����炵�ȁI";
	mes "�N�̊�������҂��Ă��I";
	close;
OnInit:
	waitingroom "�]�E",0;
	end;
}


//==========================================
// �L�m�R�̏W
//------------------------------------------

moc_ruins,141,125,3	script	�������z	83,{
	if(Job == Job_Thief) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "�ւ��A���h�ȃV�[�t�ɂȂ����ȁB";
		mes "�ł��A�����ɂ͂�������Ȃ���B";
		mes "�N���m���Ă�Ǝv�����ǁA������";
		mes "�]�E��]�̓z��������Ȃ�";
		mes "�����ꂾ����B�����Ɩʔ������ցA";
		mes "�������������E���ɍs���Ă���B";
		close;
	}
	if(Job != Job_Novice) {
		switch(@doubt_npc) {
		case 0:
			mes "[�������z]";
			mes "����ɂ��́[�����V�C�ł��ˁI";
			mes "�����݂����ɒg�����z�˂̋C���������ߌ�̓s���~�b�h�t�߂Ńs�N�j�b�N����̂���Ԃ���ˁB";
			break;
		case 1:
			mes "[�������z]";
			mes "'�A��Ƃ�����Ƃ������Ƃ͍K���̑����ł���B";
			mes "������ԍD���Ȃ��Ƃ킴�ł��B�A��Ƃ��c";
			break;
		case 2:
			mes "[�������z]";
			mes "............... ";
			break;
		case 3:
			mes "[�������z]";
			mes "���[���͂��A��A���A���A�l�ł͂���܂���B";
			mes "����ȖڂŌ��Ȃ��ł��A���A���A���B";
			break;
		case 4:
			mes "[�������z]";
			mes "�c�c�������ȁB";
			mes "�����b�����Ƃ��Ȃ����炠�����s����B";
			close;
		}
		set @doubt_npc,@doubt_npc+1;
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[�������z]";
		mes "�����̏��S�ҁI";
		mes "�f���炵���l���𑗂肽�����H";
		mes "�����Ɗy�Ȑ��������������H";
		mes "�Ȃ�΃V�[�t�ɂȂ�I";
		mes "�����ăV�[�t�M���h�ɓ��c����̂��I";
		next;
		mes "[�������z]";
		mes "�V�[�t�M���h�͌N���������}����I";
		mes "����������������";
		mes "�|�C���g�J�[�h�t�I�i��k�j";
		mes "�ꏊ�̓s���~�b�h�_���W����1�K������";
		mes "�K�i������č����I�@�E��������Ȃ��I";
		mes "�܂������s������ʖڂ��I";
		close;
	case 1:
		mes "[�������z]";
		mes "���ȃV�[�t�̓���������c�c";
		mes "���O�́c�c�����A�V�[�t�ɂȂ�c�c";
		close;
	}
}

moc_prydb1,42,133,2	script	�M���h�֌W��	118,{
	if(Job == Job_Thief) {
		mes "[�u���[�h]";
		mes "���͓��ɃC�x���g���Ȃ��񂾁B";
		mes "�A��������W�����邱�Ƃ��B";
		close;
	}
	if(Job != Job_Novice || Upper == UPPER_HIGH) {
		mes "[�V�[�t�M���h�֌W��]";
		mes "���[���A���[���A�����̓z�I";
		mes "�����ŉ����Ă�H";
		mes "�����ɂ͂��O�̋��ꏊ�͂Ȃ�����";
		mes "�����o�Ă��炨���B";
		close;
	}
	mes "[�V�[�t�M���h�֌W��]";
	mes "����H";
	mes "���S�҂̂����ɂ����ɉ��̗p���ȁH";
	mes "�����A�V�[�t�ɓ]�E�������̂Ȃ�A";
	mes "���ׂ̗̎o�����ɕ�����B";
	close;
}