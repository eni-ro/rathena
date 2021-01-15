//= Athena Script ==============================================================
// Ragnarok Online Sage Jobchange Script	by Blaze
//= Registry ===================================================================
// CHANGE_SA -> 0�`15
//==============================================================================

//============================================================
// �]�E
//------------------------------------------------------------
yuno_in02,38,61,5	script	���@�A�J�f�~�[�w��	743,{
	cutin "job_sage_kayron",2;
	if(Upper == UPPER_HIGH) {
		mes "[�P�C����=�O���b�N]";
		mes "�ӂށc�c";
		mes "�����l�����Ă������A���Ȃ���";
		mes "���ʂȁu�\�́v�������Ă���ˁB";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "���Ȃ��͂���ȏꏊ�ɂ��Ȃ���";
		mes "�����Ɛ��ɏo�Ĕ\�͂��g���Ă���";
		mes "�Ȃ����B";
		mes "���S��Y��Ă͂Ȃ�Ȃ���B";
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job == Job_Sage) {
		mes "[�P�C����=�O���b�N]";
		mes "�ӂށA���̗p���ˁH";
		mes "�Z�[�W�ɂȂ�������Ƃ�����";
		mes "�׋���ӂ��Ă͂Ȃ�Ȃ���B";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "���B�̒m���́A���̑嗤�̔��W��";
		mes "�傫����^���Ă���B";
		mes "���ׂĂ̐l�̖��ɂ��悤��";
		mes "��Ɍ����ƋL�^���������Ȃ��悤�ɁB";
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job == Job_Novice) {
		mes "[�P�C����=�O���b�N]";
		mes "��H�����ւ͉��̗p�ŗ����̂��ȁH";
		mes "�����܂ŗ���̂͑�ς������낤��";
		mes "��قǃZ�[�W�ւ̊֐S�������̂��ȁH";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�����Z�[�W���w�Ԋw��ɋ���������Ȃ�";
		mes "�܂��u�}�W�V�����v�ɂȂ�׋������A";
		mes "������[�߂Ă��Ȃ����B";
		mes "�����܂�������";
		mes "�y���݂ɂ��Ă����B";
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	if(Job != Job_Mage) {
		mes "[�P�C����=�O���b�N]";
		mes "�ӂނ��c�c���B�͂��̐��E�ɂ���";
		mes "���X���������Ă��邪�A����Ȃ����̂�";
		mes "����B";
		mes "����́A���̐E�Ƃ̐l�X������";
		mes "�o���Ɋ�Â����m���ł��c�c";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�����A�߂��ɃZ�[�W��������";
		mes "���Ȃ����������o���ɂ��Ă悭";
		mes "����Ă����Ă��炢�����B";
		mes "�ނ�����Ȃ��̏����ɂȂ��Ă����";
		mes "�͂��ł��B";
		close2;
		cutin "job_sage_kayron",255;
		end;
	}
	switch(CHANGE_SA) {
	case 0:
	case 1:
	case 2:
		mes "[�P�C����=�O���b�N]";
		mes "���@�ɑ΂����M�����N��";
		mes "���}����B";
		mes "�����ւ͉��̗p�ŗ����̂��ȁH";
		next;
		switch(select("�Z�[�W�ɓ]�E�������ł�","�Z�[�W�]�E�ɂ��ċ����Ă�������","�Ȃ�ł��Ȃ��ł�")) {
		case 1:
			mes "[�P�C����=�O���b�N]";
			mes "����c�c�Z�[�W�ɓ]�E�������ƁH";
			mes "�]�E�Ɓc�c";
			mes "�܂����̍l��������ς��Ȃ��Ă�";
			mes "�Ȃ�Ȃ��ȁB";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�Z�[�W�Ƃ����̂͐��̒��̎�����";
			mes "�΂���ʂĂ��Ȃ������ƋL�^�ɂ����";
			mes "�嗤�̔��W�Ɋ�^����l�̂��Ƃ��w���B";
			mes "�ł��邩��A�������𒅑ւ�";
			mes "�����ڂ����ς�����Ƃ��Ă��A";
			mes "����͈Ӗ��������ƂȂ̂ł��B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�܂��A�V���o�C�`�F�����@�A�J�f�~�[��";
			mes "���w�菑���o���Ȃ����B";
			mes "������ł悭�������Ă����͂��ł��B";
			break;
		case 2:
			mes "[�P�C����=�O���b�N]";
			mes "�Z�[�W�]�E�c�c";
			mes "�N���Z�[�W�ɂȂ邱�Ƃ��u�]�E�v�Ƃ�";
			mes "�����܂���B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�Z�[�W�ɂȂ邽�߂ɂ́A";
			mes "�܂��V���o�C�`�F�����@�A�J�f�~�[��";
			mes "���w�菑���o���Ȃ����B";
			mes "�����ē��w�������󂯂Ă݂Ȃ����B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�������󂯂���A��U�Ȗڂɂ���";
			mes "�������d�ˁA�Ō�ɘ_����";
			mes "��o���Ă��炢�܂��B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�_���͎������A�]�����܂��B";
			mes "�����ō��i����΁A�Z�[�W�Ƃ���";
			mes "�����Ă������i��^���܂��傤�B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�܂��̓V���o�C�`�F�����@�A�J�f�~�[��";
			mes "�s���Č��Ȃ����B";
			mes "���e�E�X=�V���v�Ƃ����Ⴂ�Z�[�W��";
			mes "�\�����݂�����悤�ɁB";
			break;
		case 3:
			mes "[�P�C����=�O���b�N]";
			mes "�ӂށc�c�ɂ�����Ȃ�{�̈���ł�";
			mes "�ǂނ��Ƃ������߂��܂��B";
			mes "���̒��̂����Ă��̂��Ƃ�";
			mes "�{����w�Ԏ����ł��܂��B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�ܘ_�A�{�����ł����邱�Ƃ�";
			mes "�킩��킯�ł͂Ȃ��B";
			mes "����ł����B�Z�[�W�͖{��";
			mes "�m���̕�ɂƂ��ďd�󂵂Ă��܂��B";
			break;
		}
		close2;
		cutin "job_sage_kayron",255;
		end;
	default:	//3�`10�̂Ƃ�
		mes "[�P�C����=�O���b�N]";
		mes "�͂́A�Z�[�W�ɂȂ铹�͌�����";
		mes "�Ղ������̂ł͂Ȃ��B";
		mes "�������@��ǂ��g�����Ȃ��邾���ł�";
		mes "���ɂ��Ȃ�Ȃ�����ˁB";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "����΂��Ę_���܂Ŏd�グ��";
		mes "���Ȃ����B�҂��Ă��܂���B";
		break;
	case 15:
		if(countitem(1550) < 1) {
			mes "[�P�C����=�O���b�N]";
			mes "����H�_���͂ǂ����܂����H";
			mes "���������Α��������Ă��Ȃ����B";
			next;
			mes "[�P�C����=�O���b�N]";
			mes "�܂����Y�ꂽ�킯�ł͂Ȃ��ł��傤�H";
			mes "�Ƃɂ��������Ă���̂�҂��܂��傤�B";
			break;
		}
		if(SkillPoint) {
			mes "[�P�C����=�O���b�N]";
			mes "�N�ɂ͂܂�����U���";
			mes "�X�L�����c���Ă��܂���B";
			mes "�_�����o����O��";
			mes "�擾�ł���X�L�����K�����Ă��Ȃ����B";
			break;
		}
		mes "[�P�C����=�O���b�N]";
		mes "����A�撣���Ę_�����������悤���ˁB";
		mes "����ł͌����Ă��炢�܂��傤�B";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "����c�c";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�ӂށc�c";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�ނށc�c";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�܂����̂������Ă��Ȃ����c�c";
		mes "�N�̘_������͌����ɑ΂���";
		mes "�M�S�������Ď���B";
		mes "�悵�A�ǂ��ł��傤�B";
		next;
		set CHANGE_SA,0;
		nude;
		jobchange Job_Sage;
		mes "[�P�C����=�O���b�N]";
		mes "���Ƃ��I";
		mes "���ꂩ��̓Z�[�W�Ƃ��Đ�����";
		mes "�䂫�Ȃ����B";
		mes "������w�Ԃ��Ƃւ̔M�S����";
		mes "�Y��Ȃ��悤�ɁB";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�_���͑�؂ɕۊǂ��Ă����Ȃ����B";
		mes "�N���������B��̏����Ȃ̂�����B";
		mes "���ꂪ�𗧂��Ƃ�����ł��傤�B";
		next;
		mes "[�P�C����=�O���b�N]";
		mes "�����A�N���g���m���̕�ɂ�";
		mes "�Ȃ�悤�A�M�S�Ɋw�тȂ����I";
		break;
	}
	close2;
	cutin "job_sage_kayron",255;
	end;
}

//============================================================
// �����\��
//------------------------------------------------------------
yuno_in03,154,35,4	script	�A�J�f�~�[�֌W��	742,{
	if(Job == Job_Sage) {
		mes "[���e�E�X=�V���v]";
		mes "��������Ⴂ�܂��B";
		mes "�Ђ����Ԃ�ł��ˁB";
		mes "�����̕���";
		mes "�͂��ǂ��Ă��܂����H";
		next;
		mes "[���e�E�X=�V���v]";
		mes "��l�Ŗ{�⎑�������Ƃɕ׋���";
		mes "����̂��ǂ��ł����A";
		mes "���܂ɂ͊O�Ń����X�^�[�ƒ���";
		mes "�Λ����邱�Ƃ��d�v�ł��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�Z�[�W��]�҂���������������";
		mes "�悭�����Ă����Ă��������B";
		mes "���̓����̕��X�ɂ�";
		mes "��낵�����`�����������B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[���e�E�X=�V���v]";
		mes "�悤�����B";
		mes "�������";
		mes "�V���o�C�`�F�����@�A�J�f�~�[";
		mes "�ł��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "���ǂ��̓Z�[�W���琬����@�ւŁA";
		mes "�����X�^�[�Ɩ��@�Ɋւ��錤����";
		mes "�s���Ă��܂��B";
		mes "�܂��A���ł����w�����}���Ă��܂��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�}�W�V������JobLv 40 �ȏ�";
		mes "�̕��Ȃ���w���邱�Ƃ��ł��܂��B";
		mes "���߂�ꂽ�ߒ����o�āA";
		mes "�Z�[�W�ɂȂ邱�Ƃ��ł��܂��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�����Z�[�W�Ɋ֐S�������";
		mes "�܂��K�˂Ă��������B";
		mes "����ł́A�ǂ�������B";
		close;
	}
	if(Job != Job_Mage || Upper == UPPER_HIGH) {
		mes "[���e�E�X=�V���v]";
		mes "�悤�����B";
		mes "�������";
		mes "�V���o�C�`�F�����@�A�J�f�~�[";
		mes "�ł��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "���ǂ��̓Z�[�W���琬����@�ւŁA";
		mes "�����X�^�[�Ɩ��@�Ɋւ��錤����";
		mes "�s���Ă��܂��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�}�W�V������JobLv 40 �ȏ�";
		mes "�̕��Ȃ���w���邱�Ƃ��ł��܂��B";
		mes "���߂�ꂽ�ߒ����o�āA";
		mes "�Z�[�W�ɂȂ邱�Ƃ��ł��܂��B";
		mes "�߂��Ƀ}�W�V�����̂��m�荇����";
		mes "�����狳���Ă����Ă��������B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "����ł́A�ǂ�������B";
		close;
	}
	switch(CHANGE_SA) {
	case 0:
		mes "[���e�E�X=�V���v]";
		mes "�悤�����B";
		mes "�������";
		mes "�V���o�C�`�F�����@�A�J�f�~�[";
		mes "�ł��B";
		mes "�}�W�V�����̕��ł��ˁB";
		mes "������ւ͂ǂ̂悤�Ȃ��p�ŁH";
		next;
		switch(select("�Z�[�W�]�E�ɂ��ċ����Ă�������","���w�̐\�����݂��������ł�","�Ȃ�ł��Ȃ��ł�")) {
		case 1:
			mes "[���e�E�X=�V���v]";
			mes "�Z�[�W�ɓ]�E������]�ł����B";
			mes "�������A���ǂ��͓]�E��������";
			mes "�����Ă���킯�ł͂���܂���B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "���A�J�f�~�[�ɓ��w����";
			mes "�K��̉ߒ����I�������̂݁A";
			mes "�����Ȍ��������ɂ��ĔF���";
			mes "���������Ă���̂ł��B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "�ł�����A���ǂ��͓]�E�ł͂Ȃ�";
			mes "���ƂƌĂ�ł��܂��B";
			mes "���w�̐\�����݂Ƌ��ɓ��w����";
			mes "�[�߂Ă���������΁A������";
			mes "�󂯂邱�Ƃ��ł��܂��B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "�����A���ʂ�";
			mes "^3355FF�Â����@��^000000��^3355FF�d��^000000";
			mes "�����������X�Ɍ����Ă�";
			mes "���w����Ə����Ă��������Ă��܂��B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "�o�^���������������A�������󂯂�";
			mes "���Ƃ��ł��܂��B";
			mes "���w�����Ƀp�X������A�e�[�}�ɉ�����";
			mes "���������Ă��������܂��B";
			mes "�Ō�ɁA�����������Ƃ̘_����";
			mes "�����Ă��������܂��B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "�_���͊w�������܂��̂ŁA";
			mes "�w���̔��f�ō��ۂ����肳��܂��B";
			mes "���i����΃Z�[�W�Ƃ��Č���������";
			mes "�]�����邱�Ƃ��F�߂��܂��B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "����]������΂��ł�";
			mes "�\�����݂����҂����Ă���܂��B";
			mes "����ł́A�ǂ�������B";
			close;
		case 2:
			break;
		case 3:
			mes "[���e�E�X=�V���v]";
			mes "�����ł����B";
			mes "������茩�����Ă����Ă��������B";
			mes "����ł́A�ǂ�������B";
			close;
		}
		mes "[���e�E�X=�V���v]";
		mes "���w�̐\�����݂ł��ˁB";
		mes "�V���o�C�`�F�����@�A�J�f�~�[��";
		mes "�悤�����B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "���w���邽�߂̊�{�����́A";
		mes "JobLv 40 �ȏ�A�}�W�V�����Ƃ���";
		mes "�߂����Ă������Ƃł��B";
		mes "�����āA�w�K�ߒ��ɕK�v�ł���";
		mes "���o������w���Ƃ��Ĕ[�߂Ȃ����";
		mes "�Ȃ�܂���B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "���w���� 70,000Zeny�ł��B";
		mes "�܂���";
		mes "^3355FF�Â����@��^000000��^3355FF�d��^000000��";
		mes "��o�����Γ��w���͖Ə��ƂȂ�܂��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "����ł́A�����ɓ��w�̐\�����݂�";
		mes "����܂����H";
		next;
		switch(select("���w�̐\�����݂����܂�","���w�����������܂�","��ł܂����܂�")) {
		case 1:
			if(JobLevel < 40) {
				mes "[���e�E�X=�V���v]";
				mes "�܂�JobLv������Ȃ��悤�ł��B";
				mes "���������׋������Ă���";
				mes "���炵�Ă��������B";
				close;
			}
			if(SkillPoint) {
				mes "[���e�E�X=�V���v]";
				mes "�擾�ł���X�L�����K�����Ă���";
				mes "���炵�Ă��������B";
				mes "���r���[�ȐS�\���ł�";
				mes "���w��F�߂邱�Ƃ��ł��܂���B";
				close;
			}
			mes "[���e�E�X=�V���v]";
			mes "����ł́A���w�\�������쐬���܂��B";
			mes "������ɃT�C�����Ă��������B";
			next;
			menu strcharinfo(0),-;
			mes "[���e�E�X=�V���v]";
			mes "�����O�́c�c";
			mes strcharinfo(0);
			mes "����ł��ˁB�ǂ����O�ł��B";
			next;
			if(JobLevel >= 50) {
				mes "[���e�E�X=�V���v]";
				mes "�ق��A�}�W�V�������}�X�^�[���x���܂�";
				mes "�b�����܂������I";
				mes "���ʂɓ��w����";
				mes "�Ə����Ă��������܂��傤�I";
				next;
				mes "[���e�E�X=�V���v]";
				mes "�͂��A�葱���͊����ł��B";
				mes "����ł͓��w�������󂯂�";
				mes "���Ă��������B";
				set CHANGE_SA,4;
				next;
				mes "[���e�E�X=�V���v]";
				mes "�N���C�g�X�����̂Ƃ���ɍs����";
				mes "���������B���̍����̕�����";
				mes "��������Ⴂ�܂��B";
				close;
			}
			mes "[���e�E�X=�V���v]";
			mes "�ł́A���w�� 70,000 Zeny��";
			mes "�[�߂܂����H";
			mes "����Ƃ�";
			mes "^3355FF�Â����@��^000000��^3355FF�d��^000000��";
			mes "��o���܂����H";
			next;
			if(select("���w�� 70,000 Zeny�𕥂�","�Â����@���ƌd����o����")==1) {
				if(Zeny < 70000) {
					mes "[���e�E�X=�V���v]";
					mes "��c�c���A������������Ȃ�";
					mes "�悤�ł��B�m�F���Ă���܂�";
					mes "���炵�Ă��������B";
					close;
				}
				set Zeny,Zeny-70000;
			}
			else {
				if(countitem(1006) < 1 || countitem(1007) < 1) {
					mes "[���e�E�X=�V���v]";
					mes "��c�c�H";
					mes "�����Ă��Ȃ��悤�ł���H";
					mes "�ǂ����ɖY��Ă��Ă��܂����̂���";
					mes "����܂���ˁB";
					mes "�������������߂肭�������B";
					close;
				}
				delitem 1006,1;
				delitem 1007,1;
			}
			mes "[���e�E�X=�V���v]";
			mes "�͂��A���w�葱�����������܂����B";
			mes "����ł͓��w�������󂯂�";
			mes "���Ă��������B";
			set CHANGE_SA,4;
			next;
			mes "[���e�E�X=�V���v]";
			mes "�N���C�g�X�����̂Ƃ���ɍs����";
			mes "���������B���̍����̕�����";
			mes "��������Ⴂ�܂��B";
			close;
		case 2:
			if(JobLevel < 40) {
				mes "[���e�E�X=�V���v]";
				mes "���w���ȑO�ɁA�܂�JobLv��";
				mes "����Ă��Ȃ��悤�ł��B";
				mes "����������ƕ׋����Ȃ����Ă���";
				mes "���������������B";
				close;
			}
			if(JobLevel >= 50) {
				mes "[���e�E�X=�V���v]";
				mes "�ӂށc�c�������Ȃ���";
				mes "���w����[�߂Ă��������Ȃ���";
				mes "���w��F�߂��܂���c�c�B";
				mes "�����Ƃ������ɂȂ��Ă��A";
				mes "�Z�[�W�ƂȂ�ߒ��ɕK�v�Ȃ���";
				mes "�Ȃ̂ł��B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "��c�c�H";
				mes "�Ђ���Ƃ��Ă��Ȃ��́c�c";
				mes "�}�W�V�������}�X�^�[����Ă��܂��ˁH";
				mes "����͋����܂����B���ʂɓ��w����";
				mes "�Ə����Ă��������܂��傤�I";
				next;
				mes "[���e�E�X=�V���v]";
				mes "����ł́A���w�\�������쐬���܂��B";
				mes "������ɃT�C�����Ă��������B";
				next;
				menu strcharinfo(0),-;
				mes "[���e�E�X=�V���v]";
				mes "�����O�́c�c";
				mes strcharinfo(0);
				mes "����ł��ˁB�ǂ����O�ł��B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "�͂��A���w�葱�����������܂����B";
				mes "����ł͓��w�������󂯂�";
				mes "���Ă��������B";
				set CHANGE_SA,4;
				next;
				mes "[���e�E�X=�V���v]";
				mes "�N���C�g�X�����̂Ƃ���ɍs����";
				mes "���������B���̍����̕�����";
				mes "��������Ⴂ�܂��B";
				close;
			}
			if(Zeny > 43210) {
				mes "[���e�E�X=�V���v]";
				mes "���[��c�c�B";
				mes "���w����[�߂Ȃ���Γ��w��";
				mes "�F�߂邱�Ƃ͂ł��܂���B";
				mes "�����Ƃ������ɂȂ��Ă��A";
				mes "�Z�[�W�ƂȂ�ߒ��ɕK�v�Ȃ���";
				mes "�Ȃ̂ł��B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "����Ƃ�";
				mes "^3355FF�Â����@��^000000��^3355FF�d��^000000��";
				mes "��o�Ȃ����܂����H";
				mes "���ꂪ����̂ł���΁A��͂�";
				mes "���w�������p�ӂ��Ă��������B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "����ł́A�ǂ�������B";
				close;
			}
			mes "[���e�E�X=�V���v]";
			mes "�ӂށc�c����������܂��񂩁c�c";
			mes "�K��� 70,000 Zeny��";
			mes "�[�߂Ă��������Ȃ����";
			mes "�Ȃ�Ȃ��̂ł����c�c";
			next;
			if(select("���̕��@�͂Ȃ��ł��傤��","��ł܂����܂�")==1) {
				mes "[���e�E�X=�V���v]";
				mes "����ł͓��ʂɏ����������܂��傤�B";
				mes "���w���� 30,000 Zeny��";
				mes "�����Ă����܂��B���A";
				mes "�������̕i�����o���Ă��������B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "���̕i�����o���Ă��������B";
				set CHANGE_SA,rand(1,3);
				switch(CHANGE_SA) {
				case 1:
					mes "^3355FF���̉H��^000000 50��";
					mes "^3355FF�Ȗ�^000000 50��";
					mes "^3355FF�S�z��^000000 25��";
					break;
				case 2:
					mes "^3355FF�N���[�o�[^000000 50��";
					mes "^3355FF���炩�Ȗ�^000000 50��";
					mes "^3355FF�n�`^000000 25��";
					break;
				case 3:
					mes "^3355FF���̉H��^000000 50��";
					mes "^3355FF�Ȗ�^000000 50��";
					mes "^3355FF�N���[�o�[^000000 50��";
					mes "^3355FF���炩�Ȗ�^000000 50��";
					break;
				}
				next;
				mes "[���e�E�X=�V���v]";
				mes "�\���グ�����̂��o���ꂽ��";
				mes "���w���� 30,000 Zeny�ɂ��܂��B";
				mes "����Ȃ�\�ł��傤�B";
				mes "�撣���ďW�߂Ă݂Ă��������B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "������񂻂̑O��";
				mes "70,000 Zeny��p�ӂł�����";
				mes "���w����[�߂Ă��������܂��B";
				mes "�K��͋K��ł�����ˁB";
				next;
				mes "[���e�E�X=�V���v]";
				mes "��������";
				mes "^3355FF�Â����@��^000000��^3355FF�d��^000000��";
				mes "��o�Ȃ����Ă����\�ł��B";
				mes "����ł́A�ǂ�������B";
				close;
			}
			//else�Ȃ�fall through
		case 3:
			mes "[���e�E�X=�V���v]";
			mes "�͂��A����Ă������𐮂���";
			mes "���������ˁB";
			mes "����ł́A�ǂ�������B";
			close;
		}
	case 1:
	case 2:
	case 3:
		mes "[���e�E�X=�V���v]";
		mes "��������Ⴂ�܂��B";
		mes "���w�̂��\�����݂ł��ˁH";
		next;
		if(countitem(1006) && countitem(1007)) {	//������
			delitem 1006,1;
			delitem 1007,1;
			mes "[���e�E�X=�V���v]";
			mes "�Â����@���ƌd����o����";
			mes "���������܂����B";
			mes "���w��F�߂܂��B";
			set CHANGE_SA,4;
			break;
		}
		if(Zeny >= 70000) {
			set Zeny,Zeny-70000;
			mes "[���e�E�X=�V���v]";
			mes "70,000 Zeny��[�߂�";
			mes "���������܂����B";
			mes "���w��F�߂܂��B";
			set CHANGE_SA,4;
			break;
		}
		switch(CHANGE_SA) {
		case 1:
			setarray .@need,916,914,1002;
			setarray .@amount,50,50,25;
			break;
		case 2:
			setarray .@need,705,949,1024;
			setarray .@amount,50,50,25;
			break;
		case 3:
			setarray .@need,916,914,705,949;
			setarray .@amount,50,50,50,50;
			break;
		}
		set .@max,getarraysize(.@need);
		for(set .@i,0; .@i < .@max; set .@i,.@i+1) {
			if(countitem(.@need[.@i]) < .@amount[.@i]) {
				mes "[���e�E�X=�V���v]";
				mes "�������܂������������Ă��܂���ˁB";
				mes "�K�v�ȃA�C�e����������x�m�F���܂��B";
				next;
				mes "[���e�E�X=�V���v]";
				mes "���̕i�����o���Ă��������B";
				for(set .@j,0; .@j < .@max; set .@j,.@j+1)
					mes "^3355FF" +getitemname(.@need[.@j])+ "^000000 " +.@amount[.@j]+ "��";
				next;
				mes "[���e�E�X=�V���v]";
				mes "�\���グ�����̂��o���ꂽ��";
				mes "���w���� 30,000 Zeny�ɂ��܂��B";
				mes "�撣���ďW�߂Ă݂Ă��������B";
				mes "����ł́A�ǂ�������B";
				close;
			}
		}
		if(Zeny < 30000) {
			mes "[���e�E�X=�V���v]";
			mes "�������܂������������Ă��܂���ˁB";
			mes "�i���͂�����̂̓��w����";
			mes "����܂���B";
			next;
			mes "[���e�E�X=�V���v]";
			mes "�\���グ���悤�ɁA";
			mes "�i�����o�����";
			mes "30,000 Zeny�ɂ��܂��B";
			mes "�i���͓��w���Ƌ��ɔ[�߂Ă��������B";
			close;
		}
		for(set .@i,0; .@i < .@max; set .@i,.@i+1)
			delitem .@need[.@i],.@amount[.@i];
		set Zeny,Zeny-30000;
		mes "[���e�E�X=�V���v]";
		mes "�\���グ���i�����o����܂����ˁB";
		mes "30,000 Zeny�Ƌ���";
		mes "�[�߂Ă��������܂����B";
		mes "���w��F�߂܂��B";
		set CHANGE_SA,4;
		next;
		mes "[���e�E�X=�V���v]";
		mes "����ł́A���w�\�������쐬���܂��B";
		mes "������ɃT�C�����Ă��������B";
		next;
		menu strcharinfo(0),-;
		mes "[���e�E�X=�V���v]";
		mes "�����O�́c�c";
		mes strcharinfo(0);
		mes "����ł��ˁB�ǂ����O�ł��B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�͂��A���w�葱�����������܂����B";
		mes "����ł͓��w�������󂯂�";
		mes "���Ă��������B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�N���C�g�X�����̂Ƃ���ɍs����";
		mes "���������B���̍����̕�����";
		mes "��������Ⴂ�܂��B";
		close;
	case 4:
		mes "[���e�E�X=�V���v]";
		mes "����H�������Ă���̂ł����H";
		mes "�������n�܂�܂��B";
		mes "���̍����̕����ɂ���������";
		mes "�N���C�g�X�����̂Ƃ����";
		mes "�s���Ă��������B";
		close;
	case 15:
		mes "[���e�E�X=�V���v]";
		mes "���A�_�����ł��܂������B";
		mes "����������A�P�C�����w���̂Ƃ����";
		mes "�s���Ă��������B";
		next;
		mes "[���e�E�X=�V���v]";
		mes "�w�͂��ǂ����ʂɂȂ����";
		mes "�ǂ��ł��ˁB";
		mes "����ł́A�ǂ�������B";
		close;
	default:
		mes "[���e�E�X=�V���v]";
		mes "���A�\���󂲂����܂���B";
		mes "���A���X���č���ł܂��āc�c";
		mes "��قǂ܂����炵�Ă��������B";
		mes "�{���ɐ\���󂲂����܂���c�c";
		close;
	}
	//30K���[�g�̐\�����T�C��
	mes "[���e�E�X=�V���v]";
	mes "����ł́A���w�\�������쐬���܂��B";
	mes "������ɃT�C�����Ă��������B";
	next;
	menu strcharinfo(0),-;
	mes "[���e�E�X=�V���v]";
	mes "�����O�́c�c";
	mes strcharinfo(0);
	mes "����ł��ˁB�ǂ����O�ł��B";
	next;
	mes "[���e�E�X=�V���v]";
	mes "�ł́A�܂��N���C�g�X������";
	mes "�M�L�������󂯂Ă��炢�܂��B";
	next;
	mes "[���e�E�X=�V���v]";
	mes "�N���C�g�X������";
	mes "�A�J�f�~�[���̐}�����ɂ��܂��B";
	mes "�������牜�̍���̕����ɂȂ�̂ŁA";
	mes "������܂Ō������Ă��������B";
	next;
	mes "[���e�E�X=�V���v]";
	mes "����ł́A�K�^���F��܂��B";
	close;
}

//==========================================
// �ꎟ�����i�M�L�j
//------------------------------------------
yuno_in03,105,177,5	script	�M�L��������	754,{
	if(Job == Job_Sage) {
		mes "[�N���C�g�X=�x����]";
		mes "����H���Ƃ����҂����̗p���ȁH";
		mes "�܂��܂����w������]���ˁH";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�C�����͂킩�邪�A���B�����Ƃ�";
		mes "�F�߂��̂�����A���g�������Ȃ����B";
		mes "�w�юɂ��Ȃ����ނ̂͗ǂ���";
		mes "���܂ł������ł�����肵�Ă��Ă�";
		mes "�����Ȃ��B���܂ɂ͊댯�ȗ���";
		mes "���Ȃ����B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�o���������̂͑S�ċL�^���Ƃ邱�Ƃ�";
		mes "�Y��Ȃ��悤�ɁB";
		mes "�𗧂m���͑��̐l�ւ�������";
		mes "������悤�ɁB";
		close;
	}
	if(Job == Job_Wizard) {
		mes "[�N���C�g�X=�x����]";
		mes "��c�c�������薂�͂�";
		mes "�������Ă��܂����҂��ȁB";
		mes "������܂������͂Ȃ����낤�c�c";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�������ꂾ���͊̂ɖ����Ă����悤�ɁB";
		mes "�l�͈�l�ł͐����Ă����Ȃ��B";
		mes "�������w�񂾂��Ƃ́A�l�ɋ����Ă���";
		mes "�^���𔭊�����̂��B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[�N���C�g�X=�x����]";
		mes "���̗p���ˁH";
		mes "�����͗V�я�ł͂Ȃ��B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�O�Ń|�����Ƃł��V�тȂ����B";
		mes "�ق�A�o�Ă����Ȃ����B";
		close;
	}
	if(Job != Job_Mage) {
		mes "[�N���C�g�X=�x����]";
		mes "��c�c���w����]���Ă��A";
		mes "�N�̍��̐E�Ƃ���Z�[�W�ɂȂ邱�Ƃ�";
		mes "���Ȃ�Ȃ��B";
		mes "�N�ɂ͑��̍˔\������B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�����Ŗ��𔄂炸���̂Ƃ����";
		mes "�s���Ă݂Ȃ����B";
		close;
	}
	switch(CHANGE_SA) {
	case 0:
		mes "[�N���C�g�X=�x����]";
		mes "���ށc�c�Z�[�W�ɂȂ肽���̂��ȁB";
		mes "����ȕ\������Ă���B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "����ɂ͉䂪�A�J�f�~�[�ɓ��w";
		mes "���Ȃ��Ă͂Ȃ�Ȃ��B";
		mes "�葱�����ς܂�����܂����Ȃ����B";
		close;
	case 1:
	case 2:
	case 3:
		close;
	case 4:
		mes "[�N���C�g�X=�x����]";
		mes "���ށA�V���o�C�`�F���A�J�f�~�[��";
		mes "���w�������Ƃ����}����B";
		mes "�葱���͍ς܂��ė����ȁH";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "������ƌ��悤�B���O�́c�c";
		mes strcharinfo(0);
		mes "�ɊԈႢ�Ȃ��ȁH";
		mes "�悵�A����ł͂����������n�߂悤�B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�����o�������́A���̐��E�̑S�Ă�";
		mes "�ւ����̂��B";
		mes "����20��B";
		mes "���ꂼ��5�_�̔z�_�ŁA80�_�ȏ�";
		mes "���΍��i�ƂȂ�B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�����ɓ������Ȃ����";
		mes "�����͒��~�ƂȂ�B";
		mes "�ł͎n�߂�B";
		set CHANGE_SA,5;
		break;
	case 5:
		mes "[�N���C�g�X=�x����]";
		mes "����ł͍Ď������s���B";
		mes "���x�͂�������ƕ׋����Ă������ȁH";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "���āA��������i�_�͓������B";
		mes "20��e5�_�z�_�ŁA80�_�ȏ��";
		mes "���i�ƂȂ�B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "����ł͑����n�߂悤�B";
		mes "�����ɓ����Ȃ����";
		mes "�����͒��~�ɂȂ�̂�";
		mes "����΂��Ă��ꂽ�܂��B";
		break;
	case 6:
		mes "[�N���C�g�X=�x����]";
		mes "��H�܂��������󂯂����̂��H";
		mes "�N�͕M�L�����ɂ͍��i���Ă���B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�w�����X�����̂Ƃ���֍s����";
		mes "���Z�������󂯂Ȃ����B";
		mes "�̂�т肵�Ă��Ă͂����Ȃ����B";
		close;
	default:
		mes "[�N���C�g�X=�x����]";
		mes "���A���̓��w���̎������̓_����";
		mes "���邩��Z�����񂾁c�c";
		mes "���܂񂪌�ł܂����Ă���B";
		close;
	case 15:
		mes "[�N���C�g�X=�x����]";
		mes "���A�撣���Ę_�����d�グ���ȁB";
		mes "���������͘_���̍̓_�͂��Ă��Ȃ��B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�P�C�����w���ɂ��������Ȃ����B";
		mes "�N�̑��Ɖۂ͊w�������f";
		mes "�����B";
		close;
	}
	//�M�L������������
	next;
	switch(rand(3)) {
	case 0:
		mes "1.";
		mes "�v�����e���̃v���[���g���l��";
		mes "�����Ă��Ȃ��i���͂ǂꂩ�B";
		next;
		if(select("�����M","�Ԃ��z��","�Ԃ���","�K���X��")==3)
			set .@point,.@point+5;
		mes "2.";
		mes "�X�e�B���b�g�������Ă��Ȃ��X��";
		mes "�ǂ����B";
		next;
		if(select("�v�����e��","�����N","�Q�t�F��","���e�B�G")==1)
			set .@point,.@point+5;
		mes "3.";
		mes "�^�[�g���A�C�����h�����ԋ߂�";
		mes "�X�͂ǂ����B";
		next;
		if(select("�A���f�o����","�A���x���^","�R���h","�C�Y���[�h")==2)
			set .@point,.@point+5;
		mes "4.";
		mes "���̒��ŁA������푰�̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("���O����","�y�X�g","�t�����h��","�q�g�f")==4)
			set .@point,.@point+5;
		mes "5.";
		mes "���̒��ŁA����������̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("�}���e�B�X","���^����","���b�J�[","�z����")==2)
			set .@point,.@point+5;
		mes "6.";
		mes "���̒��ŁA������傫���̈Ⴄ";
		mes "���̂�����B�ǂꂩ�B";
		next;
		if(select("���C�h���b�N","���C�h���b�N�A�[�`���[","�f�r����","�_�[�N�t���[��")==1)
			set .@point,.@point+5;
		mes "7.";
		mes "���̒��ŁA�A���R�[���𗎂Ƃ��Ȃ�";
		mes "�����X�^�[�͂ǂꂩ�B";
		next;
		if(select("�z����","�v�����N�g��","�|�C�Y���X�|�A","�g�[�h")==3)
			set .@point,.@point+5;
		mes "8.";
		mes "���̒��ŁA�i�C�g�]�E�Ɗ֌W�̂Ȃ�";
		mes "�҂͒N���B";
		next;
		if(select("�W�F�[���Y=�V���L���[�Y","�g�[�}�X=�Z���o���e�X","�G�C�~�[=�x�A�g���X","�G�h�����h=�O���X�g")==2)
			set .@point,.@point+5;
		mes "9.";
		mes "���̒��ŁA�v�����e���ɋ��Ȃ�";
		mes "�҂͒N���B";
		next;
		if(select("�i�~","�A�E���f�B�t�H��","�g�[�}�X","�z���O����")==2)
			set .@point,.@point+5;
		mes "10.";
		mes "�ዾ���������J�v���E����";
		mes "���O�𓚂���B";
		next;
		if(select("�f�B�t�H���e�[","�e�[�����O","�O�����X","�v")==3)
			set .@point,.@point+5;
		mes "11.";
		mes "�X�L���u�T���_�[�X�g�[���vLv7";
		mes "�g�p���̏���SP�͂������B";
		next;
		if(select("49","59","69","74")==2)
			set .@point,.@point+5;
		mes "12.";
		mes "SP�� 50% �c���Ă���ꍇ�A";
		mes "�X�L���u�G�i�W�[�R�[�g�v�ł�";
		mes "�_���[�W�팸����SP����ʂ�";
		mes "�������B";
		next;
		if(select("24%�팸 SP1.5%����","24%�팸 SP2%����","18%�팸 SP1.5%����","18%�팸 SP2%����")==4)
			set .@point,.@point+5;
		mes "13.";
		mes "�}�W�V�����́u�{���g�n���@�v��";
		mes "���������𓚂���B";
		next;
		if(select("������","�n����","�Α���","������")==2)
			set .@point,.@point+5;
		mes "14.";
		mes "�V�[�t�̃X�L��";
		mes "�u�_�u���A�^�b�N�vLv7�K�����A";
		mes "�����m���ƍU���͂�";
		mes "�ǂ��Ȃ邩������B";
		next;
		if(select("35% / 120%","35% / 140%","40% / 120%","40% / 140%")==2)
			set .@point,.@point+5;
		mes "15.";
		mes "�v���[�X�g�̃X�L��";
		mes "�u�}�O�k�X�G�N�\�V�Y���v���K��";
		mes "���邽�߂̉ߒ��ɖ������̂�";
		mes "���̂����ǂꂩ�B";
		next;
		if(select("�f�B�o�C���v���e�N�V����","�q�[��","���A�t","�A�N�A�x�l�e�B�N�^")==1)
			set .@point,.@point+5;
		mes "16.";
		mes "�u�E�T�M�̃w�A�o���h�v��";
		mes "�h��l�ƒǉ��\�͒l�𓚂���B";
		next;
		if(select("1 / LUK +2","1 / LUK +5","2 / LUK +2","2 / LUK +5")==3)
			set .@point,.@point+5;
		mes "17.";
		mes "�A�[�}�[�𑕔��ł��Ȃ��E�Ƃ�";
		mes "���̂����ǂꂩ�B";
		next;
		if(select("���m","���l","�V�[�t","�A�[�`���[")==4)
			set .@point,.@point+5;
		mes "18.";
		mes "�S�Ă�HP�ESP���񕜂��Ă����";
		mes "�A�C�e���͎��̂����ǂꂩ�B";
		next;
		if(select("���[�����[���[","�C�O�h���V���̎�","�C�O�h���V���̎�","�}�X�e���̎�")==3)
			set .@point,.@point+5;
		mes "19.";
		mes "���[���~�b�h�K�b�c������";
		mes "�����̖��O�𓚂���B";
		next;
		if(select("�g���X�g�� 3��","�g���X�^�� 3��","�g���C�X�^�[ 3��","�g���X�g 3��")==2)
			set .@point,.@point+5;
		mes "20.";
		mes "�N���Z�C�_�[�B���d����_�́H";
		next;
		if(select("�I�[�f�B��","���L","�g�[��","�A���K���T���[")==1)
			set .@point,.@point+5;
		break;
	case 1:
		mes "1.";
		mes "�����N�̕�Ώ��l�������Ă�����";
		mes "�ɂ͂Ȃ����̂�������I�ׁB";
		next;
		if(select("�g�p�[�Y","�K�[�l�b�g","�_�C�A�����h","�T�t�@�C�A")==2)
			set .@point,.@point+5;
		mes "2.";
		mes "�������̃G�T�������Ă��Ȃ��X��";
		mes "�ǂ����B";
		next;
		if(select("�v�����e��","�����N","�A���f�o����","�A���x���^")==3)
			set .@point,.@point+5;
		mes "3.";
		mes "���{�̐X�����ԋ߂��X��";
		mes "�ǂ����B";
		next;
		if(select("�v�����e��","�����N","�Q�t�F��","�t�F�C����")==1)
			set .@point,.@point+5;
		mes "4.";
		mes "���̒��ŁA������푰�̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("���J�[","�h���b�v�X","�v�����N�g��","�y�m���i")==4)
			set .@point,.@point+5;
		mes "5.";
		mes "���̒��ŁA����������̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("�h�P�r","�C�V�X","�K�C�A�X","�f�r���`")==3)
			set .@point,.@point+5;
		mes "6.";
		mes "���̒��ŁA������傫����";
		mes "�Ⴄ���̂�����B�ǂꂩ�B";
		next;
		if(select("�Y���","�z����","���^����","�A���S�X")==4)
			set .@point,.@point+5;
		mes "7.";
		mes "���̒��ŁA�u�C�O�h���V���̗t�v";
		mes "�𗎂Ƃ��Ȃ������X�^�[�͂ǂꂩ�B";
		next;
		if(select("�}���h�D�[�N","�o�t�H���b�g.Jr","�G���W�F�����O","�f�r����")==1)
			set .@point,.@point+5;
		mes "8.";
		mes "�v���[�X�g�]�E�Ɗ֌W�̖����l��";
		mes "���̂����N���B";
		next;
		if(select("�g�[�}�X=�Z���o���e�X","�E�C���U�[=�x�l�f�B�N�g","�s�[�^�[ S. �A���x���g","�Z�V��=�}���K���[�^")==2)
			set .@point,.@point+5;
		mes "9.";
		mes "�����N�ɂ͂��Ȃ��҂�";
		mes "���̂����N���B";
		next;
		if(select("�A�u�h�D��","�A���K��","�A���g�j�I","�T�h")==3)
			set .@point,.@point+5;
		mes "10.";
		mes "���������͓I��";
		mes "�J�v���E���̖��O�́H";
		next;
		if(select("�f�B�t�H���e�[","�e�[�����O","�O�����X","�v")==1)
			set .@point,.@point+5;
		mes "11.";
		mes "�X�L���u�t�@�C�A�[�E�H�[���v��";
		mes "�C������ߒ��ŕK�v�̖������̂�";
		mes "���̒�����I�ׁB";
		next;
		if(select("�t�@�C�A�[�{���g Lv 4","�i�p�[���r�[�g Lv 4","�t�@�C�A�[�{�[�� Lv 5","�T�C�g Lv 1")==2)
			set .@point,.@point+5;
		mes "12.";
		mes "�X�L���uSP�񕜗͌���v��";
		mes "Lv6�܂ŏK�������ꍇ�A������";
		mes "�X�L�����ʂɂ����10�b�Ԃ�";
		mes "�񕜂���SP�l�͂������B";
		next;
		if(select("14","16","18","21")==3)
			set .@point,.@point+5;
		mes "13.";
		mes "�}�W�V������JobLv33��";
		mes "������INT���d�l�͂������B";
		next;
		if(select("7","6","5","4")==4)
			set .@point,.@point+5;
		mes "14.";
		mes "�A�[�`���[�̃X�L���u�W���͌���v";
		mes "Lv5��SP����ʂƎ������Ԃ�";
		mes "�������B";
		next;
		if(select("45 / 140�b","50 / 140�b","45 / 150�b","50 / 150�b")==1)
			set .@point,.@point+5;
		mes "15.";
		mes "�u���b�N�X�~�X�̃X�L��";
		mes "�u�}�L�V�}�C�Y�p���[�v���K������";
		mes "�ߒ��ɕK�v�̖������̂͂ǂꂩ�B";
		next;
		if(select("�q���g�o�C���f�B���O","�X�L���e���p�����O","�n���}�[�t�H�[��","�E�F�|���p�[�t�F�N�V����")==2)
			set .@point,.@point+5;
		mes "16.";
		mes "���{���̃w�A�o���h��";
		mes "�h��͂ƒǉ��\�͂𓚂���B";
		next;
		if(select("0 / SP +20","0 / SP +30","1 / SP +20","1 / SP +30")==3)
			set .@point,.@point+5;
		mes "17.";
		mes "�Z�C���g���[�u�𑕔����邱�Ƃ�";
		mes "�ł��Ȃ��E�Ƃ͎��̂����ǂꂩ�B";
		next;
		if(select("���m","���l","�V�[�t","�A�R���C�g")==3)	//���݂͌��m�������s�\
			set .@point,.@point+5;
		mes "18.";
		mes "�u�΃|�[�V�����v�ŉ񕜂��邱�Ƃ�";
		mes "�ł��Ȃ���Ԉُ�͎��̂����ǂꂩ�B";
		next;
		if(select("����","��","�Í�","��")==4)
			set .@point,.@point+5;
		mes "19.";
		mes "�Q�t�F���̂ǂ�����������Ƃ���";
		mes "�������Ñ㉤���̖��O�𓚂���B";
		next;
		if(select("�Q�t�F�C����","�Q�t�F�j�A","�Q�t�F�h���A","�Q�t�F���A")==2)
			set .@point,.@point+5;
		mes "20.";
		mes "���E�̍����ƌ�����؂̖��O��";
		mes "������B";
		next;
		if(select("�C�O�h���V��","�C�h�O���V��","�}�X�e��","�Ö؂̎}")==1)
			set .@point,.@point+5;
		break;
	case 2:
		mes "1.";
		mes "���̒��ŁA�Q�t�F���̖��@���l��";
		mes "�����Ă��Ȃ����̂𓚂���B";
		next;
		if(select("�����g��","�����h","�T�[�N���b�g","�V���o�[���[�u")==1)
			set .@point,.@point+5;
		mes "2.";
		mes "���̒��ŁA�u�u���C�h�v�������Ă��Ȃ�";
		mes "�X��I�ׁB";
		next;
		if(select("�v�����e��","�C�Y���[�h","�A���f�o����","�t�F�C����")==3)
			set .@point,.@point+5;
		mes "3.";
		mes "�O���X�g�w�C�������ԋ߂���";
		mes "�ʒu����X�͂ǂꂩ�B";
		next;
		if(select("�v�����e��","�Q�t�F��","�����N","�t�F�C����")==2)
			set .@point,.@point+5;
		mes "4.";
		mes "���̒��ŁA������푰�̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("�q�g�f","�}���N","�}���X","�}�[����")==4)
			set .@point,.@point+5;
		mes "5.";
		mes "���̒��ŁA����������̈Ⴄ���̂�";
		mes "����B�ǂꂩ�B";
		next;
		if(select("�q�f�U�[�g�E���t","�X���[�L�[","�s�b�L","�`���R")==2)
			set .@point,.@point+5;
		mes "6.";
		mes "���̒��ŁA������傫����";
		mes "�Ⴄ���̂�����B�ǂꂩ�B";
		next;
		if(select("�h���C�N","���C�X","�C�r���h���C�h","�J�[���b�c�o�[�O")==1)
			set .@point,.@point+5;
		mes "7.";
		mes "���̒��ŁA�u�v���R���v��";
		mes "���Ƃ��Ȃ������X�^�[�͂ǂꂩ�B";
		next;
		if(select("�v�p","�R���h��","�T�x�[�W�x�x","�q�f�U�[�g�E���t")==2)
			set .@point,.@point+5;
		mes "8.";
		mes "���̒��ŁA�u���b�N�X�~�X�]�E��";
		mes "�֌W�̖����҂͒N���B";
		next;
		if(select("�o�C�X","�q���b�P","�o���J�f�[","�~�b�g�}�C��")==3)
			set .@point,.@point+5;
		mes "9.";
		mes "���̒��ŁA�A���f�o������";
		mes "���Ȃ��҂͒N���B";
		next;
		if(select("RS125","�}�[�Z��","�}���X�^","�A�C�[���o�[�O")==2)
			set .@point,.@point+5;
		mes "10.";
		mes "�J�v���E���̒��ŁA��ԔN����";
		mes "�҂̖��O�𓚂���B";
		next;
		if(select("�f�B�t�H���e�[","�e�[�����O","�O�����X","�v")==4)
			set .@point,.@point+5;
		mes "11.";
		mes "�X�L���u�Z�C�t�e�B�E�H�[���v";
		mes "Lv6�g�p���́A����SP�Ɖ�𐔂�";
		mes "������B";
		next;
		if(select("SP 40, 6��","SP 35, 6��","SP 35, 7��","SP 40, 7��")==4)
			set .@point,.@point+5;
		mes "12.";
		mes "�X�L���u�i�p�[���r�[�g�vLv6";
		mes "�g�p���A�U���͂�MATK�̉��{���B";
		next;
		if(select("1.2�{","1.3�{","1.4�{","1.5�{")==2)
			set .@point,.@point+5;
		mes "13.";
		mes "�}�W�V�����]�E�����ŁA";
		mes "�����t4�̐G�}�ɂȂ�z�΂͂ǂꂩ�B";
		next;
		if(select("�u���[�W�F���X�g�[��","���b�h�W�F���X�g�[��","�C�G���[�W�F���X�g�[��","�������")==4)
			set .@point,.@point+5;
		mes "14.";
		mes "���m�̃X�L���u�o�b�V��Lv6�v";
		mes "�̍U���͂�SP����ʂ𓚂���B";
		next;
		if(select("250% / 8","280% / 8","280% / 15","310% / 15")==3)
			set .@point,.@point+5;
		mes "15.";
		mes "�n���^�[�̃X�L��";
		mes "�u�N���C���A�g���b�v�v��";
		mes "�K������ߒ��ŕK�v�̂Ȃ����̂�";
		mes "���̂����ǂꂩ�B";
		next;
		if(select("�����[�u�g���b�v","�����h�}�C��","�A���N���X�l�A","�t���b�V���[")==1)
			set .@point,.@point+5;
		mes "16.";
		mes "�u���F�[���v�̖h��͂�";
		mes "�ǉ��\�͒l�𓚂���B";
		next;
		if(select("0 / MDEF +3","0 / MDEF +5","1 / MDEF +3","1 / MDEF +5")==2)
			set .@point,.@point+5;
		mes "17.";
		mes "�u�����O�R�[�g�v�𑕔����邱�Ƃ�";
		mes "�ł��Ȃ��E�Ƃ͎��̂����ǂꂩ�B";
		next;
		if(select("���m","���l","�V�[�t","�m�[�r�X")==4)
			set .@point,.@point+5;
		mes "18.";
		mes "�F�̐����̍ޗ��łȂ��A�C�e����";
		mes "���̂����ǂꂩ�B";
		next;
		if(select("�A���R�[��","�f�B�g���~��","�J���{�[�f�B��","�n�[�u")==3)
			set .@point,.@point+5;
		mes "19.";
		mes "���E���n�������Ƃ��A�_�I�[�f�B����";
		mes "�g�����Ƃ�����A�C�e����";
		mes "���̂����ǂꂩ�B";
		next;
		if(select("���~���̐S��","���~���̒�","���~���̎�","���~���̈�i")==2)
			set .@point,.@point+5;
		mes "20.";
		mes "���̐��E�̉^����ς�����";
		mes "�҂̑O�ɏo�āA�^�������ɂ���";
		mes "�Ƃ��������͎��̂����ǂꂩ�B";
		next;
		if(select("�G���x���^�R��","�G���y���E��","�G���y��","�v���R��")==2)
			set .@point,.@point+5;
		break;
	}
	mes "[�N���C�g�X=�x����]";
	mes "�悵�A�����܂ŁB";
	mes "�ł͍̓_���悤���B";
	next;
	mes "[�N���C�g�X=�x����]";
	mes "�ǂ�c�c";
	mes "����c�c";
	next;
	mes "[�N���C�g�X=�x����]";
	mes "�̓_���I������B";
	mes "�N�̓_���� " +.@point+ "�_���B";
	if(.@point < 80) {
		mes "�c�c";
		mes "�c�O�����s���i���B";
		next;
		mes "[�N���C�g�X=�x����]";
		mes "�܂��������󂯂����Ă����邩��";
		mes "�����������E�ɂ��ĕ׋�����";
		mes "���Ȃ����B";
		close;
	}
	else if(.@point == 100) {
		mes "�������ɋ������ȁB";
		mes "�����܂łł���Ȃ�A";
		mes "�Z�[�W�ɂȂ�f���͏\�����B";
	}
	else {
		mes "�ӂށB";
		mes "���ꂾ���ł���Ηǂ��ȁB";
	}
	set CHANGE_SA,6;
	next;
	mes "[�N���C�g�X=�x����]";
	mes "�悵�A�M�L�����͒ʉ߂��B";
	mes "�w�����X�����̂Ƃ���֍s���A";
	mes "���Z�������󂯂Ă��Ȃ����B";
	close;
}

//==========================================
// �񎟎����i���Z�j
//------------------------------------------
yuno_in03,169,180,3	script	���Z��������	755,{
	if(Job == Job_Sage) {
		mes "[�w�����X=�g���X]";
		mes "�₟�A���C�����H";
		mes "��������Ƃ���A����Ȃ��";
		mes "��J���d�˂��悤����Ȃ����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "��͂�A�o�����d�˂邱�Ƃ͑厖���ˁB";
		mes "�m���Œm���Ă��邾���ƁA�����̑�";
		mes "�ő̌�����̂Ƃł͑傫�ȈႢ��";
		mes "���܂�邩��ˁB";
		next;
		mes "[�w�����X=�g���X]";
		mes "�ł��A�댯�ȃ_���W�����Ȃ񂩂�";
		mes "����钇�Ԃƈꏏ�ɍs���Ă݂��";
		mes "�����B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[�w�����X=�g���X]";
		mes "�͂́A���킢���m�[�r�X";
		mes "����Ȃ����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�~�b�h�K���h�嗤�ɂ́A�܂����B����";
		mes "�m��Ȃ����̂��������񂠂�B";
		mes "�A�C�e���̐��X�A�p�Y�Ɠ`���c�c";
		next;
		mes "[�w�����X=�g���X]";
		mes "�N���Z�[�W��ڎw���Ė���";
		mes "�c��܂��Ă݂Ȃ������H";
		mes "�܁A����������Ɛ��E�ɂ���";
		mes "�׋����Ă��炾���ˁB";
		next;
		mes "[�w�����X=�g���X]";
		mes "������������΂܂�����Ƃ�";
		mes "���邾�낤�B";
		mes "����ł͋C�����ċA���Ă���B";
		close;
	}
	if(Job != Job_Mage) {
		mes "[�w�����X=�g���X]";
		mes "������";
		mes "�V���o�C�`�F�����@�A�J�f�~�[���B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�������Z�[�W�͖��p�t�ƌ�������";
		mes "�w�҂ɋ߂����݂��낤�ȁB";
		mes "�p�[�e�B�[�ł������Ɩ��ɗ���";
		mes "�v����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�����Ɏ��̗��ɂ͂��ЃZ�[�W��";
		mes "�A��čs���Ȃ����B";
		mes "���h�Ɏ����̖�ڂ��ʂ����Ă����";
		mes "���낤�B";
		close;
	}
	switch(CHANGE_SA) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "[�w�����X=�g���X]";
		mes "���͎��Z������S������";
		mes "�w�����X�Ƃ����B";
		mes "�Z�[�W�u�]�̊w�����H";
		next;
		mes "[�w�����X=�g���X]";
		mes "�܂��A���w�葱�����I��点��";
		mes "�M�L�������󂯂Ă��Ȃ����B";
		close;
	case 4:
	case 5:
		mes "[�w�����X=�g���X]";
		mes "���͎��Z������S������";
		mes "�w�����X�Ƃ����B";
		mes "�Z�[�W�u�]�̊w�����H";
		next;
		mes "[�w�����X=�g���X]";
		mes "�N���C�g�X�����̕M�L������";
		mes "�p�X���ė���悤�ɁB";
		mes "���̌㎄�̎������󂯂Ă��炤�B";
		close;
	case 6:
		mes "[�w�����X=�g���X]";
		mes "���A�M�L�������p�X�����w�����ȁH";
		mes "����Ȃ炱�ꂩ����Z�������󂯂�";
		mes "���炤�B";
		next;
		mes "[�w�����X=�g���X]";
		mes "���Z�����́c�c�ȂɁA���[���͒P�����B";
		mes "���ꂽ�����X�^�[���A���Ԑ����ȓ���";
		mes "�S�ē|���Ηǂ��B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�S�񕷂������̌����Ă݂��ق���";
		mes "�����B���Ƃ킴�ɂ����邾�낤�H";
		mes "�����A�������������󂯂邩�ȁH";
		next;
		if(select("���Z�������󂯂܂�","���������Ă�������")==2) {
			set CHANGE_SA,7;
			mes "[�w�����X=�g���X]";
			mes "����A������B";
			mes "�������菀�������Ă��Ȃ����B";
			close;
		}
		set CHANGE_SA,7;
		mes "[�w�����X=�g���X]";
		mes "�悵�A�ł͂����n�߂悤�B";
		mes "�撣���Ă��ꂽ�܂��B";
		close2;
		warp "job_sage",50,154;
		end;
	case 7:
		mes "[�w�����X=�g���X]";
		mes "�₟�A���x�͂������菀������";
		mes "�������ȁH";
		mes "���Z�����͂����܂œ�����̂ł�";
		mes "�Ȃ�����撣���Ăق����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�����A�������󂯂邩�ȁH";
		next;
		if(select("���Z�������󂯂܂�","�������鎞�Ԃ���������")==2) {
			mes "[�w�����X=�g���X]";
			mes "����A������B";
			mes "�������菀�������Ă��Ȃ����B";
			close;
		}
		mes "[�w�����X=�g���X]";
		mes "�悵�A�ł͂����n�߂悤�B";
		mes "�撣���Ă��ꂽ�܂��B";
		close2;
		warp "job_sage",50,154;
		end;
	case 8:
		mes "[�w�����X=�g���X]";
		mes "�悵�A�撣�����B";
		mes "���Z�������p�X���B";
		mes "�N�̓��w�����}���悤�B";
		next;
		mes "[�w�����X=�g���X]";
		mes "����ł́A�N�Ɍ������Ă��炤";
		mes "��������߂悤���c�c";
		mes "������Ƒ҂��Ă���B";
		mes "�M�L�����̓_���Ɛ퓬������";
		mes "��₵�����Ԃ����悤���B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�ӂށc�c";
		mes "�悵�A����Ȃ���v���낤�B";
		next;
		switch(rand(3)) {
		case 0:
			set CHANGE_SA,9;
			mes "[�w�����X=�g���X]";
			mes "�N�ɂ̓C�O�h���V���Ɋւ��錤����";
			mes "���Ă��炤�B";
			mes "���������Z�ނ��̐��E�̍����ɂȂ���";
			mes "�؂Ɋւ��錤�����B";
			next;
			mes "[�w�����X=�g���X]";
			mes "���̂��̑嗤�̕ω��┭�W��";
			mes "���ɂ߂邽�߂ɏd�v�ȕ��삾�B";
			mes "�A�J�f�~�[�u�`���ɋ���";
			mes "�V�s�G��=���C�����[�X�����̘b��";
			mes "�����Ȃ����B";
			break;
		case 1:
			set CHANGE_SA,11;
			mes "[�w�����X=�g���X]";
			mes "�N�ɂ̓����X�^�[�Ɋւ��錤����";
			mes "���Ă��炤�B";
			mes "�嗤�̂����炱����ɂ���";
			mes "�����X�^�[�̌������B";
			next;
			mes "[�w�����X=�g���X]";
			mes "���ꂩ�琶���Ă������߂�";
			mes "�K�v�ɂȂ�m���𓾂鎖��";
			mes "�ł��邾�낤�B";
			mes "�����X�^�[�����قɋ���";
			mes "���V�E�X=�P���\�X�����̘b��";
			mes "�����Ȃ����B";
			break;
		case 2:
			set CHANGE_SA,13;
			mes "[�w�����X=�g���X]";
			mes "�N�ɂ͑������@�Ɋւ��錤����";
			mes "���Ă��炤�B";
			mes "���B���g����{�I�Ȗ��@�ɂ���";
			mes "������[�߂Ă��炤�B";
			next;
			mes "[�w�����X=�g���X]";
			mes "���@�Ƃ������̖̂{�����킩��";
			mes "�ǂ����삾�B";
			mes "�o�C�I�e�N�m���W�[�������ɋ���";
			mes "�G�x�V=�W�����_�����̘b��";
			mes "�����Ȃ����B";
			break;
		}
		next;
		mes "[�w�����X=�g���X]";
		mes "����ł͗ǂ����ʂ��o��悤";
		mes "�������F��B";
		close;
	case 9:
		mes "[�w�����X=�g���X]";
		mes "����H�ǂ������Ă��Ȃ������̂��H";
		mes "�C�O�h���V���Ɋւ��錤����";
		mes "���Ă��炤�ƌ������͂����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�A�J�f�~�[�u�`���ɋ���";
		mes "�V�s�G��=���C�����[�X������";
		mes "�Ƃ���֍s���Ȃ����B";
		close;
	case 11:
		mes "[�w�����X=�g���X]";
		mes "����H�ǂ������Ă��Ȃ������̂��H";
		mes "�����X�^�[�Ɋւ��錤����";
		mes "���Ă��炤�ƌ������͂����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�����X�^�[�����قɋ���";
		mes "���V�E�X=�P���\�X������";
		mes "�Ƃ���֍s���Ȃ����B";
		close;
	case 13:
		mes "[�w�����X=�g���X]";
		mes "����H�ǂ������Ă��Ȃ������̂��H";
		mes "�������@�Ɋւ��錤����";
		mes "���Ă��炤�ƌ������͂����B";
		next;
		mes "[�w�����X=�g���X]";
		mes "�o�C�I�e�N�m���W�[�������ɋ���";
		mes "�G�x�V=�W�����_������";
		mes "�Ƃ���֍s���Ȃ����B";
		close;
	case 15:
		mes "[�w�����X=�g���X]";
		mes "�����ŉ���������Ă���H";
		mes "�_�����o�����Ȃ瑁���w����";
		mes "���������Ȃ����B";
		mes "���Ɍ����Ă����̂͗ǂ���";
		mes "���Ƃ͊w�������f���邩��ˁB";
		next;
		mes "[�w�����X=�g���X]";
		mes "�ق�ق�A�����s���Ȃ����B";
		close;
	default:
		mes "[�w�����X=�g���X]";
		mes "��[�c�c";
		mes "���A���߂��A���������";
		mes "�Z�����񂾁B";
		mes "������Ȃ����Ƃ���������";
		mes "�N�̒S�������ɕ����Ă݂Ȃ����B";
		close;
	}
}

job_sage,50,165,4	script	���Z�����S��#sage	700,{
	mes "[���Z�����S��]";
	mes "�Z�[�W���Z�����ւ悤�����B";
	mes "�������󂯂������";
	mes "�����ҋ@���֓������Ă��������B";
	next;
	mes "[���Z�����S��]";
	mes "���̕����������̏ꍇ��";
	mes "���΂炭���҂����������B";
	mes "�i�s�󋵂��A�i�E���X����܂��̂�";
	mes "�I������炨�Ăт��܂��B";
	next;
	mes "[���Z�����S��]";
	mes "��l������̎������Ԃ�";
	mes "5�`10���ƂȂ�܂��B";
	mes "�퓬�ꂩ��o�����ꍇ��";
	mes "��x�ڑ��������Ă��������B";
	close;
OnInit:
	waitingroom "�����ҋ@��",20,"���Z�����S��#sage::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	hideonnpc "SageTestFail";
	warpwaitingpc "job_sage",116,97;
	donpcevent "SageTest::OnStart1";
	end;
}

job_sage,0,0,0	script	SageTest	-1,{
	end;
OnStart1:
	set .count,16;
	set .flag,1;	//1��ڃt���O
	monster "job_sage",111,102,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",120,93,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",107,98,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",124,98,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",115,106,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",115,90,"�P��",1183,1,"SageTest::OnKilled";
	monster "job_sage",103,110,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",128,110,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",103,85,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",128,85,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",107,106,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",124,106,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",107,89,"�P��",1184,1,"SageTest::OnKilled";
	monster "job_sage",124,89,"�P��",1184,1,"SageTest::OnKilled";
	initnpctimer;
	end;
OnStart2:
	set .count,24;
	set .flag,2;	//2��ڃt���O
	monster "job_sage",111,102,"���w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,102,"�����w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,102,"�j�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"�n���w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"�V���w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"�C�ۊw",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"���z�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"����w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"�v���w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"���v�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"�s�s�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,102,"����w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"�H�i�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"�h�{�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",111,93,"���`�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,93,"�l�ފw",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,93,"�����w",1063,1,"SageTest::OnKilled";
	monster "job_sage",120,93,"�ϗ��w",1063,1,"SageTest::OnKilled";
	monster "job_sage",107,98,"�o�ϊw",1063,1,"SageTest::OnKilled";
	monster "job_sage",107,98,"�����w",1063,1,"SageTest::OnKilled";
	monster "job_sage",107,98,"���@�w",1063,1,"SageTest::OnKilled";
	monster "job_sage",124,98,"�R�ъw",1063,1,"SageTest::OnKilled";
	monster "job_sage",124,98,"�ی��w",1063,1,"SageTest::OnKilled";
	monster "job_sage",124,98,"�S���w",1063,1,"SageTest::OnKilled";
	setnpctimer 1001;
	end;
OnStart3:
	set .flag,3;	//3��ڃt���O
	monster "job_sage",116,97,"�w�m�̍�",1179,1,"SageTest::OnPass";
	monster "job_sage",107,106,"����",1185,1;
	monster "job_sage",124,106,"�x��",1185,1;
	monster "job_sage",107,89,"�J���j���O",1185,1;
	monster "job_sage",124,89,"�݂��o��",1185,1;
	setnpctimer 123001;
	end;
OnKilled:
	set .count,.count-1;
	if(.count < 1) {
		announce "������: " +strcharinfo(0)+ "�l�A�����X�^�[���ސ���",9;
		if(.flag == 1)
			donpcevent "SageTest::OnStart2";
		else if(.flag == 2)
			donpcevent "SageTest::OnStart3";
	}
	end;
OnPass:
	stopnpctimer;
	killmonster "job_sage","All";
	set CHANGE_SA,8;
	announce "������: ���߂łƂ��������܂��A" +strcharinfo(0)+ "�l ���Z�����ɍ��i���܂���",9;
	sleep 2000;
	announce "������: ����ł͎c��̉ߒ����撣���Ă�������",9;
	sleep 2000;
	announce "������: ����Ŏ����I���ł��B���̎󌱎ҁA�������Ă�������",9;
	sleep 1000;
	areawarp "job_sage",100,82,131,113,"yuno_in03",163,180;
	hideoffnpc "SageTestFail";
	sleep 2000;
	announce "������: ���̎󌱎ҁA���ꂵ�Ă�������",9;
	sleep 2000;
	enablewaitingroomevent "���Z�����S��#sage";
	end;
OnTimer1000:
	if(.flag == 1)
		announce "������: ���w���Z�������n�߂܂��B",9;
	end;
OnTimer2000:
	announce "������: " +((.flag==1)? "��": "��")+ "�Ԗڂ̎��� - ���Ԑ��� 3��",9;
	end;
OnTimer3000:
	announce "������: ���Ԉȓ��ɂ��ׂẴ����X�^�[�����ނ��Ă��������B",9;
	end;
OnTimer33000:
	announce "������: �c��2�� 30�b",9;
	end;
OnTimer63000:
	announce "������: �c��2��",9;
	end;
OnTimer93000:
	announce "������: �c��1�� 30�b",9;
	end;
OnTimer123000:
	announce "������: �c��1��",9;
	end;
OnTimer124000:
	if(.flag == 3)
		announce "������: �O�Ԗڂ̎��� - ���Ԑ��� 1��",9;
	end;
OnTimer153000:
	announce "������: �c��30�b",9;
	end;
OnTimer173000:
	announce "������: �c��10�b",9;
	end;
OnTimer183000:
	killmonster "job_sage","All";
	announce "������: �������ԏI��",9;
	end;
OnTimer184000:
	hideoffnpc "SageTestFail";
	end;
OnTimer185000:
	announce "���̎󌱎ҁA���ꂵ�Ă�������",9;
	end;
OnTimer186000:
	stopnpctimer;
	set .flag,0;
	enablewaitingroomevent "���Z�����S��#sage";
	end;
}

job_sage,116,97,0	script	SageTestFail	139,16,16,{
OnTouch:
	announce "������: " +strcharinfo(0)+ "�l�������Ɏ��s���܂���",9;
	warp "yuno",324,258;
	end;
}

//==========================================
// �O�������i�C�O�h���V�������j
//------------------------------------------
yuno_in03,62,176,2	script	�j�w����	109,{
	if(Job == Job_Sage) {
		mes "[�V�s�G��=���C�����[�X]";
		mes "�N���ȁc�c�H";
		mes "�����A�����������w���ł��ˁB";
		mes "�������A�J�f�~�[�𑲋Ƃ��Ă����ˁB";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "�ߋ���m��Ό��݂𗝉����A";
		mes "������z�����邱�Ƃ��o����B";
		mes "�����ɑS�Ă̐^��������B";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "���̌N���ߋ���m�낤�Ƃ��Ă���B";
		mes "�����u���v����z���A�������݁A";
		mes "�ς���������𔭌����鎞��";
		mes "����ł��傤�B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[�V�s�G��=���C�����[�X]";
		mes "�m�[�r�X���񂪉��̗p���ȁH";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "�����̉\�����߂��N��";
		mes "���ꂩ��ǂ�ȓ�������";
		mes "�s���̂��ȁH";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "����͌N���g�����߂邱�Ƃł��B";
		mes "�Ԉ��������i�܂Ȃ��悤�ɁB";
		close;
	}
	if(Job != Job_Mage) {
		mes "[�V�s�G��=���C�����[�X]";
		mes "�͂��A���͎j�w�������Ă��܂��B";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "���̐��E�́A�����̋L���ƍΌ���";
		mes "���ƂɌ`���ꂽ���̂Ȃ̂ł��B";
		mes "�ߋ���m�邱�Ƃ͌��݂Ɩ�����";
		mes "�Ȃ��鋴�ƂȂ�ł��傤�B";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "�N���A�����̉ߋ���U��Ԃ���";
		mes "�݂Ȃ����B�����Ɩ����ւ̓���";
		mes "�����Ă���͂��ł��B";
		close;
	}
	switch(CHANGE_SA) {
	case 9:
		switch(RESEARCH_SA) {
		case 0:
			mes "[�V�s�G��=���C�����[�X]";
			mes "�͂��A" +strcharinfo(0)+ "�N���ˁB";
			mes "�悭���܂����B���͍u�`�S����";
			mes "�V�s�G��=���C�����[�X�Ƃ����܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�����ł̃e�[�}�́A�C�O�h���V��";
			mes "�Ɋւ��錤���ł��B";
			mes "�C�O�h���V���Ƃ������̂��ǂ�����";
			mes "���̂��A�N�͒m���Ă��邩�ȁH";
			next;
			if(select("�͂��A�m���Ă��܂�","�������A�悭�m��܂���c�c")==1) {
				mes "[�V�s�G��=���C�����[�X]";
				mes "����ł̓C�O�h���V���ɂ���";
				mes "�m���Ă��邱�Ƃ�b���Ă݂Ȃ����B";
				next;
				switch(select("�񕜃A�C�e���̖��O�ł�","���E�̍����ƌ�����؂ł�","���͂悭�m��܂���c�c")) {
				case 1:
					mes "[�V�s�G��=���C�����[�X]";
					mes "�Ⴂ�܂��B";
					mes strcharinfo(0)+ "�N�A";
					mes "���_10�_�ł��B";
					mes "����͂��̖؂���o��������";
					mes "���p���Ďg���Ă��邾���̘b�ł��B";
					next;
					mes "[�V�s�G��=���C�����[�X]";
					mes "�C�O�h���V���Ƃ����̂́A";
					mes "���E�̍����ƂȂ����؂�";
					mes "���O�ł��B";
					break;
				case 2:
					mes "[�V�s�G��=���C�����[�X]";
					mes "�����ł��ˁA�C�O�h���V����";
					mes "���������Z�ނ��̐��E��";
					mes "�����ƂȂ����؂̖��O�ł��B";
					break;
				case 3:
					mes "[�V�s�G��=���C�����[�X]";
					mes "�m��Ȃ��Ȃ�Βm��Ȃ��ƌ����Ȃ����B";
					mes strcharinfo(0)+ "�N�A";
					mes "���_10�_�ł��B";
					next;
					mes "[�V�s�G��=���C�����[�X]";
					mes "�C�O�h���V���Ƃ����̂́A";
					mes "���E�̍����ƂȂ����؂�";
					mes "���O�ł��B";
					break;
				}
			}
			else {
				mes "[�V�s�G��=���C�����[�X]";
				mes "����A�����͕��������Ƃ����邩��";
				mes "����܂��񂪁A�C�O�h���V���Ƃ���";
				mes "�̂́A�~�b�h�K���h�嗤�̍����ɂ�";
				mes "�Ȃ����؂̖��O�ł��B";
			}
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "����ł͍u�`�ɐ旧����";
			mes "�������������Ă��炢�������̂�";
			mes "����܂��B";
			mes "�C�O�h���V���𗝉����邽�߂ɂ�";
			mes "�K�v�Ȃ��Ƃł��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���ł��ǂ�����A�C�O�h���V����";
			mes "�ւ�镨���W�߂Ă��Ȃ����B";
			mes "��������Ԗ]�܂����ł��ˁB";
			mes "��ςł����撣���Č�����";
			mes "���Ă��������B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "����ł́A�������o������";
			mes "�u�`�ɓ���܂��B";
			mes "�����Ă�����Ⴂ�B";
			set RESEARCH_SA,1;
			close;
		case 1:
			if(countitem(607) < 1 && countitem(608) < 1 && countitem(610) < 1) {
				mes "[�V�s�G��=���C�����[�X]";
				mes "��H�܂��u�`���󂯂鏀����";
				mes "�ł��Ă��Ȃ��悤�ł���H";
				mes "���ł��ǂ�����A�C�O�h���V����";
				mes "�ւ�镨���W�߂Ă��Ȃ����B";
				next;
				mes "[�V�s�G��=���C�����[�X]";
				mes "�������ł�����n�߂܂��B";
				mes "�����A�s���Ă��Ȃ����B";
				close;
			}
			mes "[�V�s�G��=���C�����[�X]";
			mes "���ށA���������Ă������ȁH";
			if(countitem(607)) {
				mes "�c�c�I";
				mes "�C�O�h���V���̎��������Ă��܂������I";
				mes "���S���S�B";
			}
			else if(countitem(608)) {
				mes "�c�c";
				mes "�ق��A�C�O�h���V���̎�ł����B";
				mes "��J�����ł��傤�B";
			}
			else if(countitem(610)) {
				mes "�c�c";
				mes "�C�O�h���V���̗t�ł����B";
				next;
				mes "[�V�s�G��=���C�����[�X]";
				mes "����͊X�ɂ���Ă͔����Ă���ˁB";
				mes "�����͂����܂���B";
				mes strcharinfo(0)+ "�N�A���_10�_�ł��B";
			}
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "����ł͍u�`���n�߂܂��B";
			mes "������Ȃǂ����ɕ����Ȃ����B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���E�̍����ł���";
			mes "�C�O�h���V���̖؂�";
			mes "�S�嗤�ɍ��t���A���̍�����";
			mes "��ɂ܂ŒB����ƌ����Ă��܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�嗤�̊O�ɂ͑�m������A";
			mes "���E������Ȏւł���";
			mes "���������K���h���͂�ł��܂��B";
			mes "�嗤�̓A�X�K���h�E�~�b�h�K���h�E";
			mes "�E�g�K���h�ɕ������܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���l�����Z�ރE�g�K���h�c�c";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���B�l�Ԃ��Z�ރ~�b�h�K���h�c�c";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�����Đ_�X���Z�ރA�X�K���h�c�c";
			mes "���̑嗤�̒��S�ɂ��т�����";
			mes "�������C�O�h���V���Ȃ̂ł��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���ÂɃ��~���̎��������Đ��܂ꂽ";
			mes "���̑嗤�ɐ[�������͂�A������";
			mes "�x���邻�̍��͎O�̂Ƃ����";
			mes "�L�тĂ��܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "��ڂ̍��́A�_�X���Z��";
			mes "�A�X�K���h�ցB";
			mes "�������l�Ԃ̌��m���";
			mes "�n�ւƁc�c";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "��ڂ͋��l�B���Z��";
			mes "���g�D���w�C�����ƌ����Ă��܂��B";
			mes "�`����_�b�̐߁X�ł��̖���";
			mes "�������Ƃ�����܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�O�ڂ̓j�u���w�C����";
			mes "�L�тĂ��܂��B";
			mes "��n�͐[�����ƈłƕX��";
			mes "�����Ă��܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���B�����R��ɓ��ꂽ";
			mes "�C�O�h���V���̎��E��E�t";
			mes "�̂悤�ȕ��́A�܂��ɂ��̋�����";
			mes "�Y���ł���ƍl�����܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���z�I�ő��Â̗��j����������";
			mes "�����͂��ӂ��C�O�h���V���̎���";
			mes "HP��SP�����S�ɉ񕜂��Ă���܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���΂����ċꖡ�̂��鍁��";
			mes "���C���N���Ƃ����C�O�h���V���̎��";
			mes "HP��SP�𔼕����񕜂��Ă���܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���������͂������Ă���";
			mes "�C�O�h���V���̗t�͎��҂�";
			mes "�h�������邱�Ƃ��ł��܂��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�Ō�Ɂc�c�����N������������";
			mes "�A�X�K���h�֍s�����@����������A";
			mes "�K���C�O�h���V����T���Ă݂Ȃ����B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�������A�_�b�Ɠ`���Ɋ�Â���";
			mes "�b�����A�����炱���A�C�O�h���V����";
			mes "���݂��������Ȃ���΂Ȃ�Ȃ��̂ł��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�ł́A�u�`�͂����܂łɂ��܂��傤�B";
			mes "���������e���悭�������Ċo����";
			mes "������ł���B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "���͘_���������Ă��炢�܂��B";
			mes "�_�����������������Ă��Ă��������B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�������ł��������_�������";
			mes "�����Ă��炢�܂��B";
			set RESEARCH_SA,0;
			set CHANGE_SA,10;
			close;
		}
	case 10:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[�V�s�G��=���C�����[�X]";
			mes "�܂��_���������������ł���";
			mes "���Ȃ��悤�ł���B";
			mes "�������Ă��Ȃ����ƌ������͂��ł��B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�������ł��������_�������";
			mes "��`���Ă����܂��傤�B";
			mes "�ł́A�����Ă�����Ⴂ�B";
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[�V�s�G��=���C�����[�X]";
		mes "�ł́A�_���������n�߂Ȃ����B";
		mes "���Ō��ĂĂ����܂��B";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "�嗤�̊O�ɂ͑�m������A";
		mes "���̍L����m����ł���̂�";
		setarray .@word$,"����Ȑ��r���Ƃ���","����Ȏփ��������K���h���Ƃ���","����ȋT�Əۂ������Ƃ���","����Ȃ��M���Ƃ���";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=2)
			set .@failed,1;
		mes .@word$[@menu-1];
		mes "�嗤�͎O�ɕ�����Ă���";
		setarray .@word$,"�w偑����Z�ރ~�����j�[���R��","���l���Z�ރE���m�X","���l���Z�ރE�g�K���h","�~�̍����e�B�G";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=3)
			set .@failed,1;
		mes .@word$[@menu-1];
		setarray .@word$,"�l�ԒB���Z�ރ~�b�h�K���h","�l�ԒB���Z�ރ��[���~�b�h�K�b�c","�l������������g���g�j�A","�����̓s�s�����N";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=1)
			set .@failed,1;
		mes .@word$[@menu-1];
		setarray .@word$,"�_�X�̏Z�ރA�h�K���X","�_�X�̏Z�ރA�X�K���h","�s�����Z�ރV���o���c�o���h","���[���~�b�h�K�b�c�̎�s�v�����e��";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=2)
			set .@failed,1;
		mes .@word$[@menu-1];
		mes "���̂悤�ɕ������B";
		next;
		if(.@failed) {
			mes "[�V�s�G��=���C�����[�X]";
			mes "�c�c";
			mes strcharinfo(0)+ "�N�A";
			mes "�Ԉ���Ă���_������ˁB";
			mes "����ł͘_���ɂȂ�܂���B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�w���ɂ͌������܂��񂩂�";
			mes "���������ł��B";
			close;
		}
		mes "�C�O�h���V���͐��̒��̍����ł���";
		setarray .@word$,"����Ȏ��؂ł���","�f�G�ȃ}�X�e���̖؂ł���","�傫�Ȗ��ł���","�Â��؂̎}�ł���";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=1)
			set .@failed,1;
		mes .@word$[@menu-1];
		mes "���̍��͎O�ӏ��Ɍ������ĐL�т�B";
		setarray .@word$,"�V���o���c�o���h�A���g�D���w�C���A�j�u���w�C����","�~�b�h�K���h�A���g�D���w�C���A�i�u���w�C����","�A�X�K���h�A���g�D���w�C���A�i�u���w�C����","�A�X�K���h�A���g�D���w�C���A�j�u���w�C����";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=4)
			set .@failed,1;
		mes .@word$[@menu-1];
		mes "��n�Ɍł����𒣂菄�炵�Ă���B";
		mes "�C�O�h���V���̎���H�ׂ��҂�";
		setarray .@word$,"���ׂĂ̏�Ԉُ킪�񕜂���","HP�ESP���S�ĉ񕜂���","HP�ESP�������񕜂���","���فE�􂢁E�������畜�A����";
		if(select(.@word$[0],.@word$[1],.@word$[2],.@word$[3])!=2)
			set .@failed,1;
		mes .@word$[@menu-1];
		next;
		if(.@failed) {
			mes "[�V�s�G��=���C�����[�X]";
			mes "�c�c";
			mes strcharinfo(0)+ "�N�A";
			mes "�Ԉ���Ă���_������ˁB";
			mes "����ł͘_���ɂȂ�܂���B";
			next;
			mes "[�V�s�G��=���C�����[�X]";
			mes "�w���ɂ͌������܂��񂩂�";
			mes "���������ł��B";
			close;
		}
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "����A�撣��܂����ˁB";
		mes "����͑�؂Ɉ����Ă��������B";
		mes "��΂Ɏ������Ă͂����܂����B";
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[�V�s�G��=���C�����[�X]";
		mes "����ł͘_�����w���Ɍ�����";
		mes "���Ȃ����B";
		mes "���ƍ��ۂ͔ނ����肵�܂��B";
		close;
	case 15:
		mes "[�V�s�G��=���C�����[�X]";
		mes "�������Ă���̂ł����H";
		mes "�_���͂ł����̂�����";
		mes "�����w���Ɍ����Ă��Ȃ����B";
		mes "���̘_���𖳂����Ȃ������ɁI";
		close;
	default:
		mes "[�V�s�G��=���C�����[�X]";
		mes "�������ɗ����̂��m��Ȃ���";
		mes "���͍l�����ɐ�O�������B";
		mes "�܂���Őu�˂Ă��Ȃ����c�c";
		close;
	}
}

//==========================================
// �O�������i�����X�^�[�����j
//------------------------------------------
yuno_in03,32,102,1	script	�����w����	755,{
	if(Job == Job_Sage) {
		mes "[���V�E�X=�P���\�X]";
		mes "�����A�s���ȓ_�ł�����̂��ˁH";
		mes "���₪���������T�ԑO��";
		mes "�\�񂵂Ă���B���������Z�����ĂˁB";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "�����ǂꂾ���Z�������m���Ă邾�낤�H";
		mes "�Z�[�W�ɂȂ�����Ȃ�";
		mes "�킩���Ă�Ǝv�������c�c";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "�ɂ���������_���W�����ɂł�";
		mes "�s���Ă݂Ă���B";
		mes "���ɐQ�]�����ēV��𒭂߂邾���ł�";
		mes "�����׋��ɂȂ邱�Ƃ����邼�B";
		close;
	}
	if(Job == Job_Novice) {
		mes "[���V�E�X=�P���\�X]";
		mes "�Ȃ񂾁H";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "����ȂƂ���ŗV��ł��Ȃ���";
		mes "�F�B�ƊO�ŗV��ł��Ȃ����B";
		close;
	}
	if(Job != Job_Mage) {
		mes "[���V�E�X=�P���\�X]";
		mes "��H�����X�^�[�����ł�";
		mes "���ɗ����̂��ȁH";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "����̂͗ǂ����A��������";
		mes "�G��Ȃ�B";
		mes "�G��Ɗ댯�ȕ������邩��ȁB";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "�����āA���������������X�^�[��";
		mes "�߂܂����為�Ћ����Ă���B";
		mes "�����l�i�ŏ��𔃂���낤�B";
		close;
	}
	switch(CHANGE_SA) {
	case 11:
		switch(RESEARCH_SA) {
		case 0:
			mes "[���V�E�X=�P���\�X]";
			mes "�悵�A���Z�����͒ʂ������B";
			mes "���������w�̍Ő�[����������";
			mes "���V�E�X=�P���\�X���B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�l�����O���q�ׂ��玩���̖���";
			mes "�����̂���V���Ă��񂾁B";
			mes "���O�́H";
			next;
			menu strcharinfo(0)+ "�ł��B",-;
			mes "[���V�E�X=�P���\�X]";
			mes "�ǂ����O���B��Ċ������B";
			mes "����ł́A�N�������ɓ��镪���";
			mes "���Đ������悤�B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�m���Ă���悤�ɌN�̌����e�[�}��";
			mes "�����X�^�[�ɂ��Ă��B";
			mes "���܂łɁA�����̃����X�^�[�ɑ����A";
			mes "����Ă݂����ȁH";
			next;
			if(select("�͂��A��������w�͂��܂���","�������A���܂�c�c")==1) {
				mes "[���V�E�X=�P���\�X]";
				mes "�w�͂����H";
				mes "���������y�ȏ��΂���s���Ă�";
				mes "�񂶂�Ȃ����H";
				mes "�܂������B���̎��Ƃ͊y����Ȃ����B";
			}
			else {
				mes "[���V�E�X=�P���\�X]";
				mes "�������B�ʂɍ\����B";
				mes "���̌������ɓ������炻����";
				mes "�����Ȃ��Ȃ邾�낤�B�n�n�n�B";
			}
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "����ł͎n�߂悤���B";
			mes "���̎��Ƃ́A����Ŋw�Ԃ��Ƃ�";
			mes "�����Ƃ������Ƃ����̂ɖ����Ă����B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�悵�A�������W�߂Ă����B";
			set RESEARCH_SA,rand(1,3);
			switch(RESEARCH_SA) {
			case 1:
				mes "^3355FF�G��^000000 5��";
				mes "^3355FF�P�זE^000000 5��";
				mes "^3355FF���̐K��^000000 5��";
			case 2:
				mes "^3355FF���Ƀj�b�p^000000 5��";
				mes "^3355FF�L�̂ނ���^000000 5��";
				mes "^3355FF�l���̐S��^000000 5��";
				break;
			case 3:
				mes "^3355FF����^000000 5��";
				mes "^3355FF���Ƀj�b�p^000000 5��";
				mes "^3355FF�s����^000000 5��";
				break;
			}
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�S�đ�������b�𑱂���B";
			mes "����A�s���Ă����B";
			close;
		case 1:
		case 2:
		case 3:
			switch(RESEARCH_SA) {
				case 1: setarray .@need,962,1052,1023;  break;
				case 2: setarray .@need,960,966,950;   break;
				case 3: setarray .@need,1050,960,963; break;
			}
			for(set .@i,0; .@i<3; set .@i,.@i+1) {
				if(countitem(.@need[.@i]) < 5) {
					mes "[���V�E�X=�P���\�X]";
					mes "���������A�������肵�Ă���B";
					mes "������x��������悭�����Ă���B";
					next;
					mes "[���V�E�X=�P���\�X]";
					for(set .@i,0; .@i<3; set .@i,.@i+1) {
						mes "^3355FF" +getitemname(.@need[.@i])+ "^000000 5��";
					}
					close;
				}
			}
			mes "[���V�E�X=�P���\�X]";
			mes "�₟�A�����ꂳ��B";
			mes "���ڏE���Ă����̂��������̂���";
			mes "�킩��񂪁B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�Ƃɂ����A���̃A�C�e���𗎂Ƃ�";
			mes "���ɂ͋��ʓ_������B";
			mes "���ꂪ�����킩�邩�H";
			next;
			switch(select("�������ł�","���L�ނł�","�A�N�e�B�u�ł�","�����X�^�[�ł�")) {
			case 1:
			case 2:
				mes "[���V�E�X=�P���\�X]";
				mes "�����A�������ł���A���L�ނł�����B";
				mes "�啔���̋��L�ނ͐���ɐ�������";
				mes "���琅�����Ȃ񂾁B";
				break;
			case 3:
				if(RESEARCH_SA == 3) {
					mes "[���V�E�X=�P���\�X]";
					mes "�����c�c�}�����X�t�B�A�[��";
					mes "���ł������Ă����̂��H";
					mes "�{���Ɍ��ǂ͎��͂Ŏ���Ă���";
					mes "�񂾂낤�ȁc�c�H";
				}
				else {
					mes "[���V�E�X=�P���\�X]";
					mes "�ŋ߂͂������L���P���Ă���̂��B";
					mes "����Ƃ��o�h����J�j���A�C�e���ł�";
					mes "�~���������̂��c�c";
				}
				next;
				mes "[���V�E�X=�P���\�X]";
				//mes "�S����s�ł͂Ȃ���..."; //����͂Ȃ̂œ���
				//mes "���_������ƒ����Ȃ���.";
				//mes "���L�ނȂ��琅�����Ȃ��Ƃ����ʓ_���B";
				mes "�S���A�N�e�B�u�ł͂Ȃ��I";
				mes "�܂������c�c";
				mes "���L�ނŁA�����������̂�";
				mes "���ʓ_���B";
				break;
			case 4:
				mes "[���V�E�X=�P���\�X]";
				mes "�c�c";
				mes "�����������Ƃ𕷂��Ă���̂ł͂Ȃ��B";
				mes "�܂������c�c";
				mes "���L�ނŁA�����������̂�";
				mes "���ʓ_���B";
				break;
			}
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���ׂĂ̋��L�ނ��������Ƃ���";
			mes "�킯�ł͂Ȃ����A�����������������B";
			mes "����ł́A����狛�L�ނɌ���";
			mes "���@�͂ǂꂩ�ȁH";
			next;
			switch(select("���C�g�j���O�{���g�ł�","�t�@�C�A�[�{���g�ł�","�T���_�[�X�g�[���ł�","�t���X�g�_�C�o�[�ł�")) {
			case 1:
				mes "[���V�E�X=�P���\�X]";
				mes "�����B�������ɂ͕�������";
				mes "���@�ł��郉�C�g�j���O�{���g�������B";
				mes "�r���ɔ������郂���X�^�[�B�ɂ�";
				mes "���ӂ��Ȃ���΂Ȃ�Ȃ����B";
				break;
			case 2:
				mes "[���V�E�X=�P���\�X]";
				mes "��̒��ŕ����΂ł�����̂��B";
				mes "�����킯�Ȃ����낤���I";
				mes "���L�ނ͑啔����������������";
				mes "�������̖��@���悭�����񂾂�B";
				break;
			case 3:
				mes "[���V�E�X=�P���\�X]";
				mes "�T���_�[�X�g�[���ł����v���B";
				mes "���������@������ȁB";
				mes "�����A�U���n�_�ɂ͋C��";
				mes "���Ȃ���΂Ȃ�Ȃ��B";
				break;
			case 4:
				mes "[���V�E�X=�P���\�X]";
				mes "�c�c";
				mes "�����D���Ȃ��ɐ���^����";
				mes "�ǂ�����!!!!";
				mes "�������ɐ������U�������Ă�";
				mes "�قƂ�ǈӖ������B";
				break;
			}
			mes "[���V�E�X=�P���\�X]";
			mes "�Ƃ��낪�y�m���i��q�g�f�̂悤��";
			mes "�����X�^�[�͋��L�ނ���������";
			mes "�Ⴄ�̂ŋC�����Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "����ł́A���͍����ɂ���";
			mes "�׋����Ă݂悤���B";
			mes "�ł́c�c";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���͂������W�߂Ă����B";
			set RESEARCH_SA,rand(4,7);
			switch(RESEARCH_SA) {
			case 4:
				mes "^3355FF�����̎�^000000 5��";
				mes "^3355FF��������^000000 5��";
				mes "^3355FF�����\�p^000000 5��";
				break;
			case 5:
				mes "^3355FF�d���p^000000 5��";
				mes "^3355FF�J�^�V�����̔�^000000 5��";
				mes "^3355FF��̉H��^000000 5��";
				break;
			case 6:
				mes "^3355FF���܂���̎�^000000 5��";
				mes "^3355FF峂̔�^000000 5��";
				mes "^3355FF�ؗ��峂̔�^000000 5��";
				break;
			case 7:
				mes "^3355FF�����̎�^000000 5��";
				mes "^3355FF���܂���̎�^000000 5��";
				mes "^3355FF����������������^000000 5��";
				break;
			}
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�S�đ�������b�𑱂���B";
			mes "����A�s���Ă����B";
			close;
		case 4:
		case 5:
		case 6:
		case 7:
			switch(RESEARCH_SA) {
				case 4: setarray .@need,1025,935,928;  break;
				case 5: setarray .@need,947,946,1057;  break;
				case 6: setarray .@need,1031,955,1013; break;
				case 7: setarray .@need,1025,1031,943; break;
			}
			for(set .@i,0; .@i<3; set .@i,.@i+1) {
				if(countitem(.@need[.@i]) < 5) {
					mes "[���V�E�X=�P���\�X]";
					mes "�����A�������i��Y�ꂽ���ƁH";
					mes "�܂������A������x�������B";
					next;
					for(set .@i,0; .@i<3; set .@i,.@i+1) {
						mes "^3355FFFD" +getitemname(.@need[.@i])+ "^000000 5��";
					}
					close;
				}
			}
			mes "[���V�E�X=�P���\�X]";
			mes "�悵�A�悭�W�߂Ă����B";
			mes "�ώ@���ӂ�Ȃ��������낤�ȁB";
			mes "�܂����ꂭ�炢�Ȃ炻��Ȃ�";
			mes "��ςł��Ȃ��������낤�B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�����͈ĊO�F�X�ȑ�����";
			mes "�����Ă��邩�疂�@���g���O��";
			mes "������x�l���Ă����Ȃ����";
			mes "�Ȃ�Ȃ����낤�B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���ɁA�V�[�t�̃n�C�f�B���O��";
			mes "�A�T�V���̃N���[�L���O��";
			mes "���ɂ͌����Ȃ��Ƃ����_��";
			mes "���ڂ��ׂ��_���B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���ɂ͏W�c�s�����鍩��������B";
			mes "�{�X�N���X�̍������A���Ȃ���";
			mes "�������]���邩�̂��Ƃ��ȁB";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�����a�̃}���[�Ƃ��c�c";
			mes "�����I�̃~�X�g���X�A";
			mes "��峂̐e���|����峁c�c";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���������{�X�N���X�̂��";
			mes "��l�őΛ������ꍇ�����o��";
			mes "���Ȃ���΂Ȃ�Ȃ��B";
			mes "������̐��ݏ���T������";
			mes "�ꍇ�́A���Ԃ�A��čs���̂�";
			mes "�x�X�g���낤�B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "���āA�b�͂��ꂭ�炢�ɂ���";
			mes "���낻��_���������Ȃ��ƂȁB";
			mes "�`���I�ɂ��K�v�����炳������";
			mes "����Ă��܂����B";
			mes "���̑O�ɁA�ȉ��̂��̂�p�ӂ���";
			mes "���Ă���B";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�W�܂�����܂������ɗ��Ă���B";
			mes "�����������A�撣���ĂȁB";
			set RESEARCH_SA,0;
			set CHANGE_SA,12;
			close;
		}
	case 12:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[���V�E�X=�P���\�X]";
			mes "�Ȃ񂾁A�p�ӂł��Ă��Ȃ�����Ȃ����B";
			mes "������x�����c�c";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[���V�E�X=�P���\�X]";
			mes "����܂Ŋ撣���Ă����񂾂���";
			mes "���ꂭ�炢���ł��Ȃ����낤�H";
			mes "�ق�A�����p�ӂ��Ă��Ȃ����B";
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[���V�E�X=�P���\�X]";
		mes "�悵�A�悭�W�߂��ȁB";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "�����ČN�������ŏ����Ă��ǂ���";
		mes "�����ɗ��u������Q�l�ɂ��Ȃ����B";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "�������낤�H";
		mes "�����̑̂ő̌����Ă������Ƃ�";
		mes "�����\���ɈӖ��̂��邱�ƂȂ񂾁B";
		mes "����A�ł����猩���Ă��炨���B";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		menu "�����X�^�[�B�͎푰�ɂ����",-;
		mes "�����X�^�[�B�͎푰�ɂ����";
		menu "�l�X�ȑ����������Ă���",-;
		mes "�l�X�ȑ����������Ă���B";
		menu "�����X�^�[�B�̑��������炩���ߔc����",-;
		mes "�����X�^�[�B�̑��������炩���ߔc����";
		menu "�I�m�ɖ��@���g��Ȃ���΂Ȃ�Ȃ�",-;
		mes "�I�m�ɖ��@���g��Ȃ���΂Ȃ�Ȃ��B";
		menu "���ɒ��ӂ��ׂ������X�^�[��",-;
		mes "���ɒ��ӂ��ׂ������X�^�[��";
		menu "�������ƈő����̃����X�^�[�ł���",-;
		mes "�������ƈő����̃����X�^�[�ł���B";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "���ށA�����ꂳ��I";
		mes "����͐�Ύ������Ȃ�I";
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "������w���ɓǂ�ł������";
		mes "���Ƃ����܂�B";
		mes "�悭�����܂Ŋ撣�����ȁB";
		close;
	case 15:
		mes "[���V�E�X=�P���\�X]";
		mes "�����Ă�񂾁H�_�����w����";
		mes "������悤�������͂����B";
		mes "�ق�A����ȂƂ���Ŗ������ĂȂ��ŁB";
		close;
	default:
		mes "[���V�E�X=�P���\�X]";
		mes "���`�����ɂ��c�c";
		mes "�������镨����������񂾂�c�c";
		mes "�����I�������͖Z�����Ă��܂��I";
		next;
		mes "[���V�E�X=�P���\�X]";
		mes "���w�Ȃ珟��Ɍ��Ă����Ȃ����I";
		mes "�����ł��������ɂ��Ƃ����̂Ɂc�c";
		mes "�܂������c�c�i�u�c�u�c�j";
		close;
	}
}

//==========================================
// �O�������i���@�����j
//------------------------------------------
yuno_in03,244,31,3	script	�����w����	120,{
	if(Job == Job_Sage) {
		mes "[�G�x�V=�W�����_]";
		mes "�q���z�z�A����ɂ��́B";
		mes "���̗p���ȁH";
		mes "�c�c�����A�Z�[�W����Ȃ��́`�I";
		mes "��Ċ������˂��`";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "����ɂ��Ă��A����ȂƂ����";
		mes "�ɂԂ������`�H";
		mes "�܁A���͂ɓM�ꂽ�A������";
		mes "�}�V�����ǂˁ`�q���z�z�B";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�i�j�i�j�A���܂ɂ͊w�юɂ�";
		mes "�A�肽���Ȃ�H";
		mes "����Ȃ��ƌ���Ȃ��ŁA";
		mes "�ق�ق�O�ɏo�悤��A�q���z�z�c�c";
		close;
	}
	if(Job == Job_Novice) {
		mes "[�G�x�V=�W�����_]";
		mes "�i�j�i�j�A���킢���m�[�r�X����";
		mes "����Ȃ��́`";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�����ɂ͗V�тɗ����́H";
		mes "�L�����f�B�ł��~�����́H";
		mes "��`���Ɓc�c";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�q���z�z�A�L�����f�B������c�c";
		mes "�T���^�|�����ł��T���Ă����A";
		mes "�q���z�z�c�c";
		close;
	}
	if(Job != Job_Mage) {
		mes "[�G�x�V=�W�����_]";
		mes "��H��H�i�j�i�j�H";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�����Ɍ������ȁH";
		mes "�����ɂ͂���܂茩����̂�";
		mes "�����Ǝv����B";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�߂��炵�����āH";
		mes "���炻�`�q���z�z�z�z";
		close;
	}
	switch(CHANGE_SA) {
	case 13:
		switch(RESEARCH_SA) {
		case 0:
			mes "[�G�x�V=�W�����_]";
			mes "����ɂ��́A��Ċ�������B";
			mes "�v���Ԃ�ɗ����w�������`";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�q���z�z�A�����L�~�������鋳���B";
			mes "�ǂ��H�������ł��傤�H�q���z�z�z�I";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�ŁA�u�`�̑O�ɂ������";
			mes "���܂�Ă���Ȃ��`�H";
			mes "���₢��A������Ƃ���Ȃ�����B";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "^3355FF��^000000 30���������ė��āB";
			mes "���ꂾ���B���܂����Ȃ��ł���H";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�΂��E���̂���ς�������";
			mes "�F�B�̃V�[�t�ɂł�����ł����B";
			mes "����A30�҂��Ă��`";
			set RESEARCH_SA,1;
			close;
		case 1:
			if(countitem(7049) < 30) {
				mes "[�G�x�V=�W�����_]";
				mes "�Ȃɂ���́H";
				mes "���Ɉ��Y���ɗ����́H";
				mes "�ق�ق�V��łȂ��ōs���Ȃ����`�I";
				next;
				mes "[�G�x�V=�W�����_]";
				mes "^3355FF��^000000 30�W�߂Ă��Ă���";
				mes "����������Ȃ��́I";
				mes "���ɓ]�����Ă�΂Ȃ񂩊ȒP��";
				mes "�E����ł���`�H";
				close;
			}
			mes "[�G�x�V=�W�����_]";
			mes "�₟�A�悭�W�߂Ă��Ă��ꂽ�I";
			mes "������Ƃ܂��Ă˂�`";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�A�u���J�^�u��!!";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�A�`�u���J�^�u��!!";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�A�u���J�`�^�u��!!";
			next;
			delitem 7049,30;
			mes "[�G�x�V=�W�����_]";
			mes "�ق�A����Ȃ����̐΂���";
			mes "3�̗ǂ��΂��ł���������I";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "���������B";
			mes "�ˁH�������ł���H�q���z�z�I";
			next;
			set RESEARCH_SA,2;
			getitem 991,1;
			getitem 993,1;
			getitem 992,1;
			mes "[�G�x�V=�W�����_]";
			mes "�ق�A�������΂�����B";
			mes "����łˁA����ł�";
			mes "�܂��܂��Ō�܂Řb�𕷂��āB";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�ȉ��̖������Ă��āB";
			mes "^3355FF�����̖�^000000 50��";
			mes "^3355FF��΂̖�^000000 50��";
			mes "^3355FF���̖�^000000 50��";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�A�[�`���[�̗F�B�ł������";
			mes "����Ă����ł���B";
			mes "���ꂶ���낵���I�q���z�z�`";
			close;
		case 2:
			if(countitem(1754) < 50 || countitem(1756) < 50 || countitem(1755) < 50) {
				mes "[�G�x�V=�W�����_]";
				mes "�i�j�i�j�H";
				mes "�������n�����������΂͂ǂ������́H";
				mes "�܂����������񂶂�c�c";
				next;
				mes "[�G�x�V=�W�����_]";
				mes "^3355FF�����̖�^000000 50��";
				mes "^3355FF��΂̖�^000000 50��";
				mes "^3355FF���̖�^000000 50��";
				mes "�A�[�`���[�̗F�B�ɗ����";
				mes "����Ă��炢�ȁ`�q���z�z";
				close;
			}
			mes "[�G�x�V=�W�����_]";
			mes "�₟�A�悭�����Ă����ˁB";
			mes "���ꂶ��A�u�`���n�߂�����B";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�ǂ�ł����邩��ǂ�������";
			mes "�厖�ȂƂ���ɐ����Ђ��悤�ɁB";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "���������@�͉Α����ɋ����B";
			mes "���傤�ǉ΂ɐ���������Ǝv���Ηǂ��B";
			mes "�ȒP�ł���H";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "���������@�͐������ɋ����B";
			mes "�΂ɗ�����������ǂ��Ȃ邩�ȁH";
			mes "�q���z�z�I";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�n�������@�͕������ɋ����B";
			mes "����h�����Ƃ�����y�ŉƂ�";
			mes "���Ă�ł���H�\���\���B";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�Α������@�͒n�����ɋ����B";
			mes "�Ύ����N��������؂��R�����Ⴄ";
			mes "�ł���H����Ɠ����c�c";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "����A��������Ȏ��Ԃ��B";
			mes "���ꂶ��`�����͎��̎��Ԃɂ��悤�B";
			next;
			delitem 1754,50;
			delitem 1756,50;
			delitem 1755,50;
			mes "[�G�x�V=�W�����_]";
			mes "���̎��Ԃ܂ł�";
			mes "^3355FF����^000000 ��1�����p�ӂ���";
			mes "�����Ăق����B";
			mes "�F�B�ɐ��E�҂����Ȃ�������";
			mes "��l�ō�邵���Ȃ��ˁB";
			set RESEARCH_SA,3;
			close;
		case 3:
			if(countitem(523) < 1) {
				mes "[�G�x�V=�W�����_]";
				mes "�i�j���Ă�́I";
				mes "�ǖY�ꂵ���Ⴞ�߂���Ȃ��`";
				next;
				mes "[�G�x�V=�W�����_]";
				mes "^3355FF����^000000 1��";
				mes "�A�R���C�g��v���[�X�g�̗F�B��";
				mes "����ł݂Ȃ����B�q���z�z";
				close;
			}
			mes "[�G�x�V=�W�����_]";
			mes "��[��������I";
			mes "�悭�����Ă����I";
			mes "���Ă��āA�u�`�𑱂��Ȃ��ƂˁB";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "���x���ǂ�ł����邩��悭������";
			mes "��������񂾂�B";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�������͕��������@�Ɏア�I";
			mes "���������A������������ɂ�����";
			mes "���낤�H�q���z�z�I";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�������͒n�������@�Ɏア�I";
			mes "��щ���Ă�q���]�񂾂�";
			mes "�傫�ȃP�K�����邾�낤�H";
			mes "�q���c�c";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�n�����͉Α������@�Ɏア�I";
			mes "�n���琶����؂ɉ΂�������";
			mes "�R���Ė����Ȃ邾�낤�H";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�Α����͐��������@�Ɏア�I";
			mes "�M�����̂��₷�̂͂���ς�";
			mes "��������ˁB";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�悵�悵�A�u�`�͂���ɂ�";
			mes "�I���`�`�`�`�`�I";
			mes "�悭�킩�����ł���H";
			next;
			delitem 523,1;
			mes "[�G�x�V=�W�����_]";
			mes "����A���Ƃ͘_�����ł���Ί����B";
			mes "����ς莄�̍u�`�͍ō��ˁB";
			mes "�q���z�z�z�z�z�I";
			set RESEARCH_SA,0;
			set CHANGE_SA,14;
			next;
			mes "[�G�x�V=�W�����_]";
			mes "����A�����_�����������������悤�B";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "���ꂾ����������悤�ɁB";
			mes "�҂��Ă��B";
			close;
		}
	case 14:
		if(countitem(916) < 1 || countitem(919) < 1 || countitem(1019) < 1 || countitem(1024) < 1 || countitem(713) < 1) {
			mes "[�G�x�V=�W�����_]";
			mes "�i�j�i�j�H";
			mes "�ǖY��͂����Ȃ��ȁ`�`";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�M�L��Ɏg�� ^3355FF���̉H��^000000 1��";
			mes "���������� ^3355FF�b�̔�^000000 1��";
			mes "���{�ɕK�v�� ^3355FF�؋�^000000 1��";
			mes "�C���N�Ɏg�� ^3355FF�n�`^000000 1��";
			mes "�n�`������ ^3355FF�󂫃r��^000000 1��";
			next;
			mes "[�G�x�V=�W�����_]";
			mes "�������炢�A��l�łł����Ⴄ�ł���H";
			mes "��`���Ă�����Ă��������ǂˁ`";
			mes "����A�҂��Ă邩��I";
			close;
		}
		delitem 916,1;
		delitem 919,1;
		delitem 1019,1;
		delitem 1024,1;
		delitem 713,1;
		mes "[�G�x�V=�W�����_]";
		mes "���ށB";
		mes "���႟�����Ă݂悤�B";
		mes "���������Ă������񂾂���";
		mes "���v�����ā`�`�q���z�z�I";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "�������@��4���f����Ȃ�A";
		setarray .@word$,"��, �n, ��, ���ɕ�������","�n, ��, ��, ���ŕ�������","��, ��, �n, �΂ɕ�������";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1]+ "�B";
		mes "���ꂼ��̑����ɂ͓���������A";
		setarray .@word$,"���������@�͐������ɋ���","���������@�͉Α����ɋ���","�Α������@�͒n�����ɋ���";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1];
		setarray .@word$,"�n�������@�͕������ɋ����B","���������@�͐������ɋ����B","���������@�͉Α����ɋ����B";
		mes .@word$[@menu-1];
		setarray .@word$,"��������_�����݂��邩��","������������l��","�푰�ɂ���đ������l�X�ł��邩��";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1];
		setarray .@word$,"�����̔\�͂�c������K�v������","�ꏊ�ɂ���đ�����ς����ق����ǂ�","�ԃ|�[�V������䕖��Ƃ����\��";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1]+ "�B";
		next;
		setarray .@word$,"��ԉ������̓v�����e���̃G�C�~�[��","�ԃ|�[�V�����̓|����������ƌ�����","���@�̐[�݂͐l�q�𒴂�";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1];
		setarray .@word$,"�����N�̏��l�̂��삳������킢��","�ǂ�����䕖�������̂��킩��Ȃ�","�ނ�݂ɖ��͂ɗ���Ɗ댯��";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1]+ "�B";
		setarray .@word$,"���ɃE�T�M�̃w�A�o���h��^������","����ł͔��|�[�V�����̖���","�K�؂Ȗ��@�̎g�p�Ƌx�e��";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1];
		setarray .@word$,"��т�^���Ă����","�z�����ɂ���","���S�Ȑ퓬��ۏႵ�Ă����";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1]+ "�B";
		setarray .@word$,"�E�T�M�̃w�A�o���h�̓A�R���C�g�ɍ���","�n���n�����銴�����D����","���̐E�Ƃƃp�[�e�B������";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1];
		setarray .@word$,"�i�C�g�ɂ������̂��{���ɒm�肽��","�̗͂����s�������Ă����߂Ȃ�","����Ő퓬�ɖ]�ނ��Ƃ��]�܂���";
		set @menu,select(.@word$[0],.@word$[1],.@word$[2]);
		mes .@word$[@menu-1]+ "�B";
		next;
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c�c�c";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�قق��`";
		mes "�Ȃ��Ȃ��Z���X���邶��Ȃ��`";
		mes "�ق�A�ł����ˁB�q���z�z";
		set CHANGE_SA,15;
		getitem 1550,1;
		next;
		mes "[�G�x�V=�W�����_]";
		mes "������w���Ɍ����悤��B";
		mes "����������L�~�����Ƃ��I";
		mes "�q���z�`";
		close;
	case 15:
		mes "[�G�x�V=�W�����_]";
		mes "�Ȃɂ��Ă�́H";
		mes "�����s���Ȃ��Ⴞ�߂���ȁ`���I";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�Y�ꕨ�����Ⴄ��H";
		mes "��x��ɂȂ�܂��ɃT�T����";
		mes "���Ƃ�������Ă����ŁI";
		close;
	default:
		mes "[�G�x�V=�W�����_]";
		mes "�i�j�i�j�H";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "���w�ɗ����́H";
		mes "�����͂��܂茩����̖�����H";
		next;
		mes "[�G�x�V=�W�����_]";
		mes "�܂����R�Ɍ��Ă�����Ⴂ�`";
		mes "�q���z�z�z�z";
		close;
	}
}