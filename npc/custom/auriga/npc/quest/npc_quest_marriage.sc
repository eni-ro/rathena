//====================================================================
//Ragnarok Online EP4.0(J) Marriage System      V2.0
//
//  �� @event_marry -> ��t�t���O 0or1
//  �� @defend -> �^�C���A�b�v�t���O�A�łɂ̂ݎd����
//====================================================================
prt_church,94,100,4	script	�����R���p�j�I��	71,{
	cutin "wedding_marry01",2;
	mes "[�n�b�s�[�}���[]";
	mes "����ɂ��́B";
	mes "�����R���p�j�I����";
	mes "�n�b�s�[�}���[�ł��B";
	if(Upper == UPPER_BABY) {
		mes "����A�ǂ�����܂����H";
		next;
		if(select("�����������ł��I","����A���ł��Ȃ��ł�") == 2) {
			mes "[�n�b�s�[�}���[]";
			mes "�͂��A�킩��܂����B";
			mes "�ł́A���C�����āB";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		mes "[�n�b�s�[�}���[]";
		mes "�\���󂠂�܂���B";
		mes "�{�q�ɂȂ�ꂽ���ɂ́A������";
		mes "���������Ē����Ă���܂��B";
		mes "�����e�ɐe�F�s���Ȃ���K����";
		mes "�Ȃ����Ă��������ˁB";
		close2;
		cutin "wedding_marry02",255;
		end;
	}
	next;
	mes "[�n�b�s�[�}���[]";
	mes "�K���𖲌���J�b�v���Ȃ�";
	mes "����ς茋���������������ł���ˁH";
	mes "����H�@���������āc�c";
	mes "������������������������̂ł����H";
	next;
	switch (select("�������ɂ��ĕ�������","�������̎菇�͂ǂ��Ȃ�܂���","��������\�����݂���","���́A���G�̃\���R�c���I")) {
	case 1:
		mes "[�n�b�s�[�}���[]";
		mes "�ȑO�́A�����É��̐i�s��";
		mes "���������s���Ă����̂ł����A";
		mes "���݂́A���O���Ƃ̍���������ɂȂ�A";
		mes "��Z�����ׂ������ɖ߂��Ă���܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���̑���A���ꂩ���";
		mes "���[���~�b�h�K�b�c�����̎勳�ł���";
		mes "�{�}���X�l���������̐i�s��";
		mes "�S�����鎖�ɂȂ�܂����B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�勳�l�́A�\�������������̐l�X��";
		mes "�S�[���C�����������ŁA";
		mes "�e���̎勳�@���u�v���[�X�g�I�f�Ƃ���";
		mes "���������t���Ă܂��̂�I�@�z�z�b";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�v���|�[�Y�͐T�d�ɁA";
		mes "���A���J�ɍs��Ȃ���΂����܂���I";
		mes "��k�Ō������悤�Ȃ�Č�������c�c";
		mes "�ꐶ���܂�܂���I";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "����������l�́A";
		mes "���̐������邻�̓��܂�";
		mes "�ꏏ�Ȃ̂ł��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�����́A�ِ��Ԃ̂݋�����Ă���܂��B";
		mes "�H�ɁA�������m��َ푰�Ԃł̌�����";
		mes "��]���������������Ⴂ�܂����c�c";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�����A���[���~�b�h�K�b�c������";
		mes "�勳�l�����F�߂ɂȂ�Ȃ��̂ŁA";
		mes "���������������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "������񑩂�����������������Ȃ�A";
		mes "�v���|�[�Y���Ă݂��炢�����ł����H";
		mes "�K���Ȗ����𖲌�����l�̊F�����";
		mes "��������̏j�����K��鎖��";
		mes "�F��܂�!!";
		close2;
		cutin "wedding_marry01",255;
		end;
	case 2:
		mes "[�n�b�s�[�}���[]";
		mes "�܂��A�V�Y�ƐV�w����A����l�Ƃ�";
		mes "���Ɍ����̐\�����݂��������A";
		mes "�m�F���Ă��������B";
		mes "�ܘ_�A�����ғ��m�݂̂ł���I";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�\�����݂��ł��܂�����A";
		mes "��l�����̃p�[�e�B�[��g�݁A";
		mes "�勳�l�ɉ�ɍs���Ă��������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�勳�l�ɂ́A�K��^0000FF�j��^000000����ɘb����";
		mes "���Ă��������B";
		mes "�����āA���������������̖��O��";
		mes "���m�ɂ��`�����������B";
		mes "���O���ԈႦ�܂��ƁA�����ł��܂���B";
		mes "�C�����Ă��������ˁI";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�V�Y����̘b���I�������A";
		mes "���́A�V�w����̔Ԃł��B";
		mes "�勳�l�ɘb���|���Ă��������A";
		mes "����ƁA�V�Y����̖��O�𕷂���܂��B";
		mes "�ԈႦ���ɁA���m�ɓ`���Ă��������I";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���݂���������̖��O�����m�ɓ`����";
		mes "�w�ւ̌������s���܂��B";
		mes "���̏u�Ԃ���A��l�͉i���̈���";
		mes "���΂�鎖�ɂȂ�̂ł��I";
		mes "�Ȃ�đf�G�Ȃ�ł��傤!?";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ܘ_�A�H�Ɏw�֌����̒i�K��";
		mes "�f���鎖������܂����ǁc�c";
		mes "��������āA�߂��܂Ȃ��ł��������ˁB";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "������\�����ޕ����������񂢂鎞�́A";
		mes "���Ԃ�����Ă����������ɂȂ�܂��B";
		mes "�勳�l�́A�����ɕ����̃J�b�v����";
		mes "���������s���܂���B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�Ō�Ɉ�I";
		mes "�勳�l�ɖ��O��`���鎞�́A";
		mes "�f�����s���K�v������܂��B";
		mes "^ff0000�ŏ��ɐV�Y�������|���Ă���3���ȓ���";
		mes "���ׂẲߒ����I��点�Ă��������B^000000";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�����A3���ȓ��ɏI���Ȃ��ꍇ�́A";
		mes "�������������f����A";
		mes "�ĊJ���鎖���o���Ȃ��Ȃ�܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�܂��A��������������̖��O�ł����A";
		mes "�������̑O�ɁA�K������̖��O��";
		mes "���m�ȒԂ�����m�F���������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�m�F�̕��@�Ƃ��܂��ẮA";
		mes "����̕��Ɏ��ł����s���Ă݂��";
		mes "��낵���Ǝv���܂��B";
		mes "����ɒʂ���΁A���̖��O��";
		mes "�������Ԃ�ł����A�ʂ��Ȃ���΁A";
		mes "���O���Ԉ���Ă���\��������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�܂��A����Ɉ�x���ł������āA";
		mes "�`���b�g�E�B���h�E�����̃{�^����";
		mes "�����܂��B";
		mes "����ƁA���ł����X�g�ɑ���̖��O��";
		mes "�\������܂��̂ŁA�I�����܂��傤�B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "����̖��O���{�^���̍���";
		mes "�\������܂��̂ŁA���̖��O��";
		mes "Ctrl+C�ŃR�s�[���Ă����܂��B";
		mes "��������΁A�񍐂̍ۂ�";
		mes "Shift�{Insert�ő���̖��O��";
		mes "�Ăяo�������ł��܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "1)����Ǝ��ł���b������";
		mes "2)���ł����X�g�ɕ\�����ꂽ";
		mes "�@����̖��O��I������";
		mes "3)�`���b�g�E�B���h�E�̍�����";
		mes "�@�\�����ꂽ����̖��O��";
		mes "�@Ctrl+C�ŃR�s�[����B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���̕��@�ŁA����̖��O��";
		mes "�m���Ɋo���鎖���ł��܂����A";
		mes "�勳�l�ɕ񍐂��鎞�ɂ�";
		mes "�g���Ă���������Ǝv���܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���������ł��ƁA�킩��Â炢�ł���";
		mes "1�x�A�����Ă݂܂��傤���B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "Ctrl�{C�ŃR�s�[�������̂�";
		mes "Shift�{Insert�L�[��";
		mes "�Ăяo���Ă݂Ă��������B";
		mes "��낵���ł����H";
		next;
		input .@test$;
		mes "[�n�b�s�[�}���[]";
		mes "�ǂ��ł��A�o���܂������H";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A���������������Ǝv�������肪";
		mes "���܂�����A�\�����݂𐥔�ǂ����B";
		close2;
		cutin "wedding_marry01",255;
		end;
	case 3:
		cutin "wedding_marry02",2;
		mes "[�n�b�s�[�}���[]";
		mes "���������邽�߂ɂ́A";
		mes "�������������������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�܂��A��������ɂ�^3377FF�x�[�X���x����";
		mes "45�ȏ�^000000�łȂ���΂Ȃ�܂���B";
		mes "�����āA�V�Y�V�w��l�Ƃ��A�\�����݂�";
		mes "���Ă��������K�v���������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�\�����݂̍ہA�j����^3377FF1,300,000zeny^000000��";
		mes "^3377FF�^�L�V�[�h1��^000000�A������^3377FF1,200,000zeny^000000��";
		mes "^3377FF�E�F�f�B���O�h���X1��^000000���K�v�ł��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "����c�c�H";
		mes "���I�@�厖�ȕ���Y��Ă��܂����I";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�\�����݂̍ۂ�^3377FF�_�C���̎w��^000000��";
		mes "��l���A�p�ӂ��Ă��������B";
		mes "���ꂪ�A�����w�ւƂȂ�܂��B";
		mes "�w�ւ́A�V�Y�ƐV�w�ň����";
		mes "�����Ă��������ˁB";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ȏ�̕i���S�Ă�����Ă���̂�";
		mes "�m�F���܂�����A�\�����ݏ���";
		mes "�����̖��O���L�����Ă��������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "��l�Ƃ��\�����݂��ς݂܂�����";
		mes "�������������鎖���ł��܂��B";
		mes "�\�����݂��Ȃ����܂����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�n�b�s�[�}���[]";
			mes "�������K���Ȉ���ɂȁ`����I";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if(PartnerId) {
			mes "[�n�b�s�[�}���[]";
			mes "���łɌ������Ă�����悤�ł��ˁB";
			mes "�d���͔F�߂Ă����܂���B";
			next;
			mes "[�n�b�s�[�}���[]";
			mes "����ȑO�ɁA�ꐶ�����ɂ���Ƃ���";
			mes "�񑩂�j��Ƃ��������A";
			mes "�ǂ̂悤�ȈӖ��������c�c";
			mes "����̂��C������";
			mes "�l������������܂����H";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if(@event_marry) {
			mes "[�n�b�s�[�}���[]";
			mes "����H";
			mes "���łɐ\�����݂���Ă���悤�ł��ˁB";
			mes "���̉��Ɏ勳�l����������Ⴂ�܂��B";
			mes "�勳�l�̌��ւƕ����A";
			mes "�������̏��Ԃ����҂����������B";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if(BaseLevel<45) {
			mes "[�n�b�s�[�}���[]";
			mes "�v���|�[�Y�Ȃ������ɁA��������";
			mes "�b�����K�v�Ȃ悤�ł��B�����ɂ͋`����";
			mes "�ӔC�������܂��B����̕������邭��";
			mes "�������Ȃ��Ă���A���炵�ĉ������B";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if(countitem(2613)<1) {
			mes "[�n�b�s�[�}���[]";
			mes "�����w�ւɎg���_�C���̎w�ւ�";
			mes "�Y��Ă������������悤�ł��ˁB";
			mes "�_�C���̎w�ւ��������ɂȂ��Ă���";
			mes "�܂��A���\�����݂��������B";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if((Sex==0 && Zeny<1200000) || (Sex==1 && Zeny<1300000)) {
			mes "[�n�b�s�[�}���[]";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "�������̔�p�Ƃ���";
			if(Sex==0)
				mes "1,200,000zeny���A�K�v�ł��B";
			else
				mes "1,300,000zeny���A�K�v�ł��B";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		if((Sex==0 && countitem(2338)<1) || (Sex==1 && countitem(7170)<1)) {
			mes "[�n�b�s�[�}���[]";
			mes "����H";
			if(Sex==0) {
				mes "�E�F�f�B���O�h���X���A����܂���ˁH";
				mes "��������������̂ɁA";
				mes "�ԉł��A���̂悤�ȏo�ŗ����ł́c�c";
			}
			else {
				mes "�^�L�V�[�h���A����܂���ˁH";
				mes "��������������̂ɁA";
				mes "�Ԗ����A���̂悤�ȏo�ŗ����ł́c�c";
			}
			mes "�Y�ꂸ�ɏ������Ă��Ă��������܂��B";
			close2;
			cutin "wedding_marry02",255;
			end;
		}
		mes "[�n�b�s�[�}���[]";
		mes "�䌋���A���j���\���グ�܂��I";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "����ł́A���ꂪ�\�����ݏ��ł��B";
		mes "�����Ɏ����̖��O���L�����Ă��������B";
		while(1) {
			next;
			input .@name$;
			if(.@name$ != strcharinfo(0)) {
				mes "[�n�b�s�[�}���[]";
				mes "�܂��܂��I";
				mes "�����̖��O�𐳂��������Ȃ���ł����H";
				mes "�{���Ɍ����������Ȃ�A";
				mes "���O���炢���m�ɖ�����Ă��������I";
				mes "������x�A�����̖��O��";
				mes "���m�ɋL�����Ă��������B";
				continue;
			}
			break;
		}
		mes "[�n�b�s�[�}���[]";
		mes "�͂��A�\�����ݏ�������܂����B";
		mes "����A�勳�l�ɂ́A";
		mes "��������̖��O���񍐂������܂��B";
		mes "�������̑O�ɑ���̖��O��";
		mes "���O�𐳊m�Ɍ�����悤�A";
		mes "�������Ă������������߂������܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A��������̕���";
		mes "�\�����݂��ς܂��܂�����A";
		mes "��l�����Ńp�[�e�B�[��g�݁A";
		mes "���ɂ���������勳�l�̌��֕����A";
		mes "�b�������Ă��������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A���K���Ɂ`";
		emotion 3;
		if(Sex==0) {
			set Zeny,Zeny-1200000;
			delitem 2338,1;
		}
		else {
			set Zeny,Zeny-1300000;
			delitem 7170,1;
		}
		delitem 2613,1;
		set @event_marry,1;
		close2;
		cutin "wedding_marry02",255;
		end;
	case 4:
		cutin "wedding_marry02",2;
		emotion 23;
		hideoffnpc "�\���R�c#�v�����e��";
		hideoffnpc "�\���R�c#�Q�t�F��";
		hideoffnpc "�\���R�c#�����N";
		hideoffnpc "�\���R�c#�t�F�C����";
		hideoffnpc "�\���R�c#�A�}�c";
		hideoffnpc "�\���R�c#�R������";
		emotion 27,"�\���R�c#�v�����e��";
		emotion 27,"�\���R�c#�Q�t�F��";
		emotion 27,"�\���R�c#�����N";
		emotion 27,"�\���R�c#�t�F�C����";
		emotion 27,"�\���R�c#�A�}�c";
		emotion 27,"�\���R�c#�R������";
		mes "[�\���R�c]";
		mes "���B��1�l�ŏo�����Ⴄ���I";
		mes "�_���W�����Ńp�[�e�B�[���ґ򂾁I";
		mes "���ɂ͐S�Ɍ��߂�NPC������I";
		mes "���܂�ē]�E�܂œƂ�ł����I";
		mes "�N���X�}�X�ɂ̓V���O���x�`���I";
		mes "�������͖��G�̃\���R�c�I";
		next;
		hideonnpc "�\���R�c#�v�����e��";
		hideonnpc "�\���R�c#�Q�t�F��";
		hideonnpc "�\���R�c#�����N";
		hideonnpc "�\���R�c#�t�F�C����";
		hideonnpc "�\���R�c#�A�}�c";
		hideonnpc "�\���R�c#�R������";
		emotion 4;
		close2;
		cutin "wedding_marry02",255;
		end;
	}
OnInit:
	hideonnpc "�\���R�c#�v�����e��";
	hideonnpc "�\���R�c#�Q�t�F��";
	hideonnpc "�\���R�c#�����N";
	hideonnpc "�\���R�c#�t�F�C����";
	hideonnpc "�\���R�c#�A�}�c";
	hideonnpc "�\���R�c#�R������";
	end;
}

//========================================================================================
prt_church,100,128,4	script	�勳	60,{
	//1�Ȃ�ⓚ���p�Œe���A2�Ŋ��ňȊO�Ȃ�e��
	cutin "wedding_bomars01",2;
	if(.flag==1) {
		mes "[�{�}���X]";
		mes "���̌��������i�s�����B";
		mes "���Ԃ����҂��Ȃ����B";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(.flag==2 && strcharinfo(0) != .bride$) {
		mes "[�{�}���X]";
		mes "�V�Y" +.groom$+ "��";
		mes "�V�w" +.bride$+ "��";
		mes "���������i�s�����B";
		mes "�Â��ɁB";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(PartnerId) {
		mes "[�{�}���X]";
		mes "���܂ł��A���K���ɁB";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(Upper == UPPER_BABY) {
		mes "[�{�}���X]";
		mes "�����ɓ����̂́A�ǂ������B";
		mes "�����������厖�����A";
		mes "���Ȃ��̗��e�̂悤�ɗǐl��";
		mes "�����鎖���厖�����B";
		mes "��l�ɂȂ��Ă���A�܂����Ȃ����B";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(@event_marry==0) {
		mes "[�{�}���X]";
		mes "������]�ނȂ�A���������������l��";
		mes "�\�����݂���ς܂��Ă��Ȃ����B";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	getpartymember getcharid(1);
	for(set .@i,0; .@i<2; set .@i,.@i+1) {
		if($@partymembername$[.@i] != strcharinfo(0))
			set .@another$,$@partymembername$[.@i];		//PT���ɋ��鑊��̖��O���ꎞ�ۑ�
	}
	if($@partymembercount != 2 || readparam(Sex,.@another$) == 1) {	//2�lPT����Ȃ��A�������͑��肪�j���I�t���C��
		mes "[�{�}���X]";
		mes "������]�ނȂ�A���������������l��";
		mes "�p�[�e�B�[���������Ȃ����B";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(Sex==1) {	//�\�����݂͐V�Y����
		set .flag,1;
		initnpctimer;	//�葱����3���ȓ�
		set .groom$,strcharinfo(0);
		mes "[�{�}���X]";
		mes "�K���Ȗ����𖲌����҂�B";
		mes "���ꂩ���l�ŕ��ސl���������ɖ����A";
		mes "���ɉ߂�����������ƂȂ�悤�c�c";
		next;
		announce "�勳: �V�Y" +.groom$+ "��A���ɖ₤�c�c",9;
		mes "[�{�}���X]";
		mes .groom$+ "��B";
		mes "���̏����𖾂邭�Ƃ炵�A���U��";
		mes "���ɕ��܂�Ƃ��鏗���̖��O��";
		mes "�����ɍ�����B";
		next;
		input .bride$;
		//�����ł����O�C�����Ă�Ȃ�d���܂ꂽ�^�C���A�b�v�t���O��낷
		if(attachrid(getcharid(3,.bride$))) {
			set @defend,0;
			detachrid;
		}
		if(attachrid(getcharid(3,.groom$))) {	//�ēx�A�^�b�`
			//PT����̂���Ă��悤���ł����łɃ��O�A�E�g��Ԃł��낤���֌W�Ȃ��I���]���͍l�����Ȃ�
			announce "�勳: ���A���̕x�߂鎞���A�n���������A�a�߂�Ƃ����A���₩�Ȃ鎞��",9;
			mes "[�{�}���X]";
			mes "�V�Y" +.groom$+ "��B";
			mes "���A���̕x�߂鎞���A�n���������A";
			mes "�a�߂�Ƃ����A���₩�Ȃ鎞���A";
			mes .bride$+ "������";
			mes "�h���A�Ԃ߁A�����A���̖��̌���";
			mes "�����ߑ�����鎖�𐾂����H";
			next;
			announce "�勳: " +.bride$+ "�������A�h���A�Ԃ߁A�����A���̖��̌��茘���ߑ�����鎖�𐾂����H",9;
			menu "�����܂�",-;
			announce "�勳: �V�Y" +.groom$+ "���V�w" +.bride$+ "�Ɉ��𐾂����c�c",9;
			mes "[�{�}���X]";
			mes "���ށI";
			mes "�ł́A�V�w�ɖ₤�Ă݂悤�B";
			set .flag,2;
			set @event_marry,0;	//�t���O���
		}
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	//�V�w���̏���
	if(.flag==0) {
		mes "[�{�}���X]";
		mes "�悸�A�V�Y���玄�ɕ񍐂Ȃ����B";
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	mes "[�{�}���X]";
	mes "�K���Ȗ����𖲌����҂�B";
	mes "���ꂩ���l�ŕ��ސl���������ɖ����A";
	mes "���ɉ߂�����������ƂȂ�悤�c�c";
	next;
	announce "�勳: �V�w" +.bride$+ "��A���ɖ₤�c�c",9;
	mes "[�{�}���X]";
	mes .bride$+ "��B";
	mes "������Ɏ��A���U������";
	mes "���܂�Ƃ���j���̖��O��";
	mes .groom$+ "���H";
	next;
	if(select("�͂�","������")==2) {
		cutin "wedding_bomars03",2;
		announce "�勳: �������͎������ꂽ�B���̌��������s���҂�A�O�ցB",9;
		mes "[�{�}���X]";
		mes "���̈�����҂̖��O���m�F���A";
		mes "�܂��������̐\�����݂��Ȃ����B";
		stopnpctimer;
		set .flag,0;
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	announce "�勳: ���A���̕x�߂鎞���A�n���������A�a�߂�Ƃ����A���₩�Ȃ鎞��",9;
	mes "[�{�}���X]";
	mes "�V�w" +.bride$+ "��B";
	mes "���A���̕x�߂鎞���A�n���������A";
	mes "�a�߂�Ƃ����A���₩�Ȃ鎞���A";
	mes .groom$+ "������";
	mes "�h���A�Ԃ߁A�����A���̖��̌���";
	mes "�����ߑ�����邱�Ƃ𐾂����B";
	announce "�勳: " +.groom$+ "�������A�h���A�Ԃ߁A�����A���̖��̌��茘���ߑ�����鎖�𐾂����H",9;
	next;
	if(select("�����܂�","�c�c����ς��߂܂�")==2) {
		cutin "wedding_bomars03",2;
		announce "�勳#w: �V�w" +.bride$+ "�͐V�Y" +.groom$+ "�Ƃ̈��̐����𓥂ݗ��܂����c�c",9;
		mes "[�{�}���X]";
		mes "�������c�c";
		mes "���f����ɂ́A";
		mes "�܂��A�S�̏���������ʂ��B";
		mes "�����l��������������΁A";
		mes "�܂����o�łȂ����B";
		stopnpctimer;
		set .flag,0;
		close2;
		cutin "wedding_bomars03",255;
		end;
	}
	if(@defend) {	//�^�C���A�b�v���Ă邩�ǂ����ŏI�`�F�b�N
		set @event_marry,0;
		cutin "wedding_bomars03",255;
		close;
	}
	//��������
	if(getcharid(3,.groom$)<=0) {	//�V�Y���}���b�W�u���[�Ń��O�A�E�g���Ă���w�֓n���Ȃ��I
		stopnpctimer;
		set .flag,0;
		set @event_marry,0;
		cutin "wedding_bomars03",255;
		close;
	}
	set .@dummy,marriage(.groom$);
	getitem 2635,1,0;
	getitem 2634,1,0,getcharid(3,.groom$);
	set .flag,0;
	set @event_marry,0;
	sc_start SC_WEDDING,3600000,0;
	sc_start SC_WEDDING,3600000,0,getcharid(3,.groom$);
	wedding;
	stopnpctimer;
	cutin "wedding_bomars02",2;
	announce "�勳: �V�Y" +.groom$+ "�ƐV�w" +.bride$+ "�A�V���Ȃ�v�w�̒a���������ɏj�����悤�I",9;
	mes "[�{�}���X]";
	mes "���[���~�b�h�K�b�c�����̎勳�ł���";
	mes "�{�}���X�̖��ɂ����āA";
	mes "�����l�̖������j�����悤�B";
	next;
	mes "[�{�}���X]";
	mes "��l�ɐ_�̏j�����I";
	close2;
	cutin "wedding_bomars03",255;
	end;
OnTimer180000:
	announce "�勳: �Ԏ����x���c�c���̎����s���Ƃ��悤�B",9;
	set .flag,0;
	stopnpctimer;
	//�^�C���A�b�v�̏ꍇ�͉łɃt���O���d����
	//�����������O�Ƀ`�F�b�N���邱�ƂŁA�����������d������̂�h�~�I
	if(attachrid(getcharid(3,.bride$)))
		set @defend,1;
	end;
}

//=======================Solo�R�c==============================
prt_church,97,102,0	script	�\���R�c#�v�����e��	105,{
	mes "[�\���R�c]";
	mes "���B��1�l�ŏo�����Ⴄ���I";
	close;
}

prt_church,98,102,0	script	�\���R�c#�Q�t�F��	705,{
	mes "[�\���R�c]";
	mes "�_���W�����Ńp�[�e�B�[���ґ򂾁I";
	close;
}

prt_church,99,102,0	script	�\���R�c#�����N		707,{
	mes "[�\���R�c]";
	mes "���ɂ͐S�Ɍ��߂�NPC������I";
	close;
}

prt_church,100,102,0	script	�\���R�c#�t�F�C����	708,{
	mes "[�\���R�c]";
	mes "���܂�ē]�E�܂œƂ�ł����I";
	close;
}

prt_church,101,102,0	script	�\���R�c#�A�}�c	767,{
	mes "[�\���R�c]";
	mes "�N���X�}�X�ɂ̓V���O���x�`���I";
	close;
}

prt_church,102,102,0	script	�\���R�c#�R������	780,{
	mes "[�\���R�c]";
	mes "�������͖��G�̃\���R�c�I";
	close;
}