//= Athena Script ==============================================================
// Ragnarok Online Zonda Script	by Blaze
//= Registry ===================================================================
// $VoteTime -> �������[�^�C�}�[
// $VoteResult -> �������[���ԋ��
// $VoteNumber -> �������[��
// $VoteKafra -> �������[�J�v���[
// $VoteZonda -> �������[�W�����_�[
// $VoteKafraP -> �������[�J�v���A�����I
// $VoteZondaP -> �������[�W�����_�A�����I
//==============================================================================

//============================================================
// �W�����_�E��
//------------------------------------------------------------
-	script	�W�����_�E��#Zonda	874,{
	cutin "zonda_01",2;
	mes "[�W�����_�E��]";
	mes "��������Ⴂ�܂��B";
	mes "�i�L�j�W�����_�C�x���g�́A���";
	mes "�ō��̃T�[�r�X��񋟂��Ă���܂��B";
	mes "�ǂ̃T�[�r�X�������p�������܂����H";
	next;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);
	if(.@map$ == "rachel" || .@map$ == "veins")
		set .@word$,"��Ԉړ��T�[�r�X";
	switch(select("�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X",.@word$,"�J�[�g�T�[�r�X","�I��")) {
	case 1:
		if(.@map$ == "lighthalzen")
			savepoint "lighthalzen",94,240;
		else if(.@map$ == "hugel")
			savepoint "hugel",97,153;
		else if(.@map$ == "rachel")
			savepoint "rachel",115,125;
		else if(.@map$ == "veins")
			savepoint "veins",205,102;
		mes "[�W�����_�E��]";
		mes "�Z�[�u�������܂����B";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂��B";
		break;
	case 2:
		if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
			mes "[�W�����_�E��]";
			mes "���ɐ\���󂲂����܂���A���q�l�B";
			mes "�q�ɂ́A��{�X�L�����x��6��";
			mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
			break;
		}
		if(Zeny < 40) {
			mes "[�W�����_�E��]";
			mes "���q�l�A�q�ɗ��p����";
			mes "40 Zeny�ƂȂ��Ă���܂��B";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "�����������m���߂̏�A";
			mes "�ēx�b���|���Ă��������B";
			break;
		}
		set Zeny,Zeny-40;
		mes "[�W�����_�E��]";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂��B";
		close2;
		openstorage;
		cutin "zonda_01",255;
		end;
	case 3:
		mes "[�W�����_�E��]";
		mes "�ړI�n��I��ł��������B";
		next;
		if(.@map$ == "rachel")
			set .@word$,"�x�C���X";
		else if(.@map$ == "veins")
			set .@word$,"���w��";
		if(select(.@word$+ " -> 2200 z","�L�����Z��")==2) {
			mes "[�W�����_�E��]";
			mes "�܂������p���������܂��B";
			break;
		}
		if(Zeny < 2200) {
			mes "[�W�����_�E��]";
			mes "���q�l�A" +.@word$+ "�܂ł�";
			mes "��Ԉړ��T�[�r�X�̗�����";
			mes "2200 Zeny�ƂȂ��Ă���܂��B";
			mes "�����������m���߂̏�A";
			mes "�ēx�����p���������B";
			break;
		}
		cutin "zonda_01",255;
		set Zeny,Zeny-2200;
		if(.@map$ == "rachel")
			warp "veins",205,102;
		else if(.@map$ == "veins")
			warp "rachel",115,125;
		end;
	case 4:
		if(getbaseclass(Class) != CLASS_MC) {
			mes "[�W�����_�E��]";
			mes "���q�l�A��ϐ\���󂲂����܂��񂪁A";
			mes "�J�[�g�T�[�r�X�́A���l�Ƃ��̏�ʐE";
			mes "��p�̃T�[�r�X�ƂȂ��Ă���܂��B";
			break;
		}
		if(checkcart()) {
			mes "[�W�����_�E��]";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "���q�l�͌��݃J�[�g��";
			mes "�����p����Ă���܂��B";
			break;
		}
		mes "[�W�����_�E��]";
		mes "�J�[�g���p������ 800 Zeny�ł��B";
		mes "�܂��A�J�[�g�𗘗p����ɂ�";
		mes "�u�v�b�V���J�[�g�v�X�L�����K�v�ł��B";
		mes "���̃X�L�����Ȃ��ƃJ�[�g�𗘗p";
		mes "�ł����ɂ������������Ă��܂��܂��B";
		mes "�����͂�낵���ł����H";
		next;
		if(select("���p����","������")==2) {
			mes "[�W�����_�E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "�܂��̂����p�����҂����Ă���܂��B";
			break;
		}
		if(Zeny < 800) {
			mes "[�W�����_�E��]";
			mes "���q�l�A�J�[�g���p������";
			mes "800 Zeny�ł��B";
			mes "��ϐ\���󂲂����܂��񂪁A";
			mes "�����������m���߂̏�A";
			mes "�ēx�b���|���Ă��������B";
			break;
		}
		set Zeny,Zeny-800;
		setcart;
		break;
	case 5:
		mes "[�W�����_�E��]";
		mes "�i�L�j�W�����_�C�x���g�́A���q�l��";
		mes "��ɍō��̃T�[�r�X��";
		mes "�񋟂������Ă���܂��B";
		mes "���ӌ��E���v�]�Ȃǂ������܂�����A";
		mes "���ł�����������Ă��������B";
		next;
		mes "[�W�����_�E��]";
		mes "�����p�����܂��āA";
		mes "���ɂ��肪�Ƃ��������܂����B";
		break;
	}
	close2;
	cutin "zonda_01",255;
	end;
}

//============================================================
// ���q�^���[��-�W�����_�E��
//------------------------------------------------------------
lighthalzen,94,248,4	duplicate(�W�����_�E��#Zonda)	�W�����_�E��	874

//============================================================
// �t�B�Q��-�W�����_�E��
//------------------------------------------------------------
hugel,88,168,4	duplicate(�W�����_�E��#Zonda)	�W�����_�E��	874

//============================================================
// ���w��-�W�����_�E��
//------------------------------------------------------------
rachel,109,138,5	duplicate(�W�����_�E��#Zonda)	�W�����_�E��	874

//============================================================
// �x�C���X-�W�����_�E��
//------------------------------------------------------------
veins,208,128,5	duplicate(�W�����_�E��#Zonda)	�W�����_�E��	874

//==========================================
// �������[
//------------------------------------------
-	script	VoteEvent	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer60000:
	set $VoteTime,$VoteTime+1;
	if($VoteResult == 0) {	//���[���Ԓ�
		if($VoteTime >= 1440) {
			if($VoteKafra < 20 && $VoteZonda < 20)	//�ǂ����20�[�ɖ����Ȃ��ꍇ�̓^�C�}�[0
				set $VoteTime,0;
			else {
				if($VoteKafra >= $VoteZonda) {	//�J�v���T�[�r�X����
					if($VoteZondaP < 2)
						set $VoteZondaP,$VoteZondaP+1;
					set $VoteResult,1;
				}
				else {
					if($VoteKafraP < 2)
						set $VoteKafraP,$VoteKafraP+1;
					set $VoteResult,2;
				}
				announce "�����A���{���Ă����������[���I���������܂����B���ʔ��\�����҂����������B",8;
				sleep 5000;
				announce "�������[�̌��ʂ𔭕\�������܂��B",8;
				sleep 5000;
				announce "���[�����������̂́A"+(($VoteResult == 1)? "�J�v���T�[�r�X": "�W�����_�C�x���g")+"�ł��B"+(($VoteResult == 1)? "�J�v���T�[�r�X": "�W�����_�C�x���g")+"�������𓾂܂����B",8;
				sleep 5000;
				announce "����������p�A���肢�\���グ�܂��B",8;
				set $VoteTime,0;
				initnpctimer;
				end;
			}
		}
		if($VoteTime % 120 == 0)
			announce "���݁A�������[�����{���ł��B�F�l�̂��Q�����A���҂��������Ă���܂��B",8;
	}
	else if($VoteTime >= 8640) {		//�T�[�r�X���ԏI��
		if($VoteResult == 1 && $VoteKafraP > 0)
			set $VoteKafraP,$VoteKafraP-1;
		if($VoteResult == 2 && $VoteZondaP > 0)
			set $VoteZondaP,$VoteZondaP-1;
		set $VoteTime,0;
		set $VoteResult,0;
		set $VoteKafra,0;
		set $VoteZonda,0;
		set $VoteNumber,$VoteNumber+1;
		announce "���݁A�������[�����{���ł��B�F�l�̂��Q�����A���҂��������Ă���܂��B",8;
	}
	initnpctimer;
	end;
}

-	script	�J�v�����[�L��E��#vt	116,{
	if(strnpcinfo(4) == "�W���m�[" || strnpcinfo(4) == "���q�^���[��")
		cutin "kafra_09",2;
	else
		cutin "kafra_02",2;
	mes "[�J�v�����[�L��E��]";
	mes "��������Ⴂ�܂��B";
	mes "�W�����_�C�x���g�ƃJ�v���T�[�r�X";
	mes "�̊ԂɌ��΂ꂽ����^FF0000�������[^000000�̂��߁A";
	mes "�J�v���{������" +strnpcinfo(4)+ "��";
	mes "�h�����ꂽ���[�L��E���ł��B";
	mes "��������`���������܂��傤���H";
	next;
	switch(select("�������[�ɂ���","���[�ɎQ��","��Ԉړ��T�[�r�X","������")) {
	case 1:
		mes "[�J�v�����[�L��E��]";
		mes "�J�v���T�[�r�X�ł́A";
		mes "���݃T�[�r�X���̋�Ԉړ��T�[�r�X���A";
		mes "���̑��̒n��ɂ��]������T�[�r�X��";
		mes "��悵�Ă���܂����B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "�������A�Ώےn��͈قȂ���̂́A";
		mes "�W�����_�C�x���g�ł����̃T�[�r�X��";
		mes "��悵�Ă����悤�Ȃ̂ł��B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "���݂������悤�ȃT�[�r�X��";
		mes "��悵�Ă��邱�Ƃ�m��A";
		mes "�W�����_�C�x���g�ƃJ�v���T�[�r�X��";
		mes "�Η����邱�ƂƂȂ�܂����B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "���ЂŘb�������̌��ʍl�Ă��ꂽ�̂�";
		mes "����^FF0000�������[^000000�ł��B";
		mes "���Ȃ킿�A�ǂ���̊�Ƃ��T�[�r�X��";
		mes "���{���邩�A���q�l�̓��[�ɂ����";
		mes "���߂悤�Ƃ������̂ł��B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "���݂��A�ǂ̂悤�ȃT�[�r�X�����邩";
		mes "���q�l�Ɍ��\���A���q�l��";
		mes "��]�ɉ����T�[�r�X���s����Ƃ�";
		mes "���[����Ηǂ��Ƃ������Ƃł��B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "�������A1��̓��[�ō���̃T�[�r�X��";
		mes "�i���I�Ɍ��߂Ă��܂��ƁA";
		mes "���ЊԂ̖��C���[�܂鋰�ꂪ����܂��B";
		mes "���̂��߁A1��ڂ̓��[�Ō����𓾂�";
		mes "��Ƃ������Ԑ�ɃT�[�r�X���s���A";
		mes "���̌�ē��[���邱�Ƃɂ������܂����B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "�������ē��[������Ƃ��Ă��A";
		mes "����̊�Ƃ����񌠗��𓾂�";
		mes "�\��������̂ŁA���ЂɂƂ��Ă�";
		mes "�����b�g�Ƃ��f�����b�g�Ƃ�";
		mes "�����邱�Ƃł��傤�B";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "�䂪�J�v���T�[�r�X�ł́A";
		mes "���q�l����]����T�[�r�X���s�����߁A";
		mes "�őP��s��������ł��B";
		mes "���ꂩ����A";
		mes "����������낵�����肢�������܂��B";
		break;
	case 2:
		if(BaseLevel < 60) {
			mes "[�J�v�����[�L��E��]";
			mes "�\���󂲂����܂���B";
			mes "���[�����Ȃ���΁A";
			mes "�������[�ɂ͎Q���ł��܂���B";
			mes "���[���𓾂Ă���A";
			mes "���[�ɂ��Q�����������B";
			next;
			mes "[�J�v�����[�L��E��]";
			mes "���[���Ɋւ��ẮA";
			mes "�A���f�o�����ɂ���J�v���{�ЂɂāA";
			mes "�ē��������Ă���܂��B";
			break;
		}
		if($VoteResult) {
			mes "[�J�v�����[�L��E��]";
			mes "���݂͓��[���Ԃł͂������܂���̂ŁA";
			mes "���[���邱�Ƃ��ł��܂���B";
			mes "���񓊕[�̍ۂɁA�܂����z�����������B";
			mes "����ł́A�y����������B";
			break;
		}
		if(ZONDA_VOTE > $VoteNumber) {
			mes "[�J�v�����[�L��E��]";
			mes "�\���󂲂����܂��񂪁A";
			mes "���q�l�͊��ɓ��[�ς݂ł��B";
			mes "���񓊕[�̍ۂɁA�܂����z�����������B";
			mes "����ł́A�y����������B";
			break;
		}
		mes "[�J�v�����[�L��E��]";
		mes "�䂪�J�v���T�[�r�X�Ŋ�撆��";
		mes "�]���n��́A���̒n��ł��B";
		mes "-^FF0000�������ᕪ�ޏ�^000000-";
		if($VoteKafraP >= 1) mes "-^FF0000�A���f�o�������v���n��3F^000000-";
		if($VoteKafraP >= 2) mes "-^FF0000�m�[�O���[�h2�w^000000-";
		next;
		mes "[�J�v�����[�L��E��]";
		mes "���̒n��ւ̋�Ԉړ��T�[�r�X��";
		mes "��]�����ꍇ�́A�J�v���T�[�r�X��";
		mes "���[�����肢�������܂��B";
		mes "�J�v���T�[�r�X�ɋM�d�Ȉ�[���A";
		mes "��낵�����肢�������܂��B";
		next;
		if(select("������","�͂�")==1) {
			mes "[�J�v�����[�L��E��]";
			mes "�����ł����c�c�c�O�ł����A";
			mes "���[�͂��q�l�̈ӎv�ɂ���čs��";
			mes "���̂ł��̂ŁA�d�����Ȃ��ł��ˁB";
			mes "�����A�C���ς��܂�����A";
			mes "�������q�˂��������B";
			next;
			mes "[�J�v�����[�L��E��]";
			mes "�����J�v���T�[�r�X��";
			mes "�F����ƈꏏ�ɂ��܂��B";
			mes "����ł́A�y����������B";
			break;
		}
		set ZONDA_VOTE,$VoteNumber+1;
		set $VoteKafra,$VoteKafra+1;
		mes "[�J�v�����[�L��E��]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���q�l�̋M�d�Ȉ�[��Y�ꂸ�ɁA";
		mes "������J�v���T�[�r�X��";
		mes "�w�͂��Ă܂���܂��B";
		mes "����ł́A�y����������B";
		break;
	case 3:
		if($VoteResult == 0) {
			mes "[�J�v�����[�L��E��]";
			mes "�\���󂲂����܂���B";
			mes "���ݓ��[���Ԓ��̂��߁A��Ԉړ�";
			mes "�T�[�r�X�𗘗p���邱�Ƃ��ł��܂���B";
			mes "���[���ԏI����A���[���ʂɂ����";
			mes "�����p�����������Ƃ��ł��܂��B";
			break;
		}
		if($VoteResult == 2) {
			mes "[�J�v�����[�L��E��]";
			mes "�\���󂲂����܂���A���[�̌��ʁA";
			mes "���݃J�v���T�[�r�X�ł͋�Ԉړ�";
			mes "�T�[�r�X���������Ă���܂���B";
			mes "���񓊕[�̍ۂɂ́A�J�v���T�[�r�X�ւ�";
			mes "��[����낵�����肢�������܂��B";
			mes "����ł́A�y����������B";
			break;
		}
		mes "[�J�v�����[�L��E��]";
		mes "�ړI�n������������Ă��������B";
		mes "����͂��������Ԃ�";
		mes "�Ȃ��Ă���܂��̂ŁA";
		mes "�J�v���|�C���g�͔������܂���B";
		next;
		if($VoteKafraP >= 1) set .@warp1$,"�A���f�o�������v���n��3F -> 4000z";
		if($VoteKafraP >= 2) set .@warp2$,"�m�[�O���[�h2�w -> 4000z";
		switch(select("�������ᕪ�ޏ� -> 4000 z",.@warp1$,.@warp2$,"������")) {
		case 1:	//�������ᕪ�ޏ�
			set .@mapname$,"xmas_dun02";
			setarray .@warp,130,123;
			break;
		case 2:	//�A���f�o�������v���n��3F
			set .@mapname$,"alde_dun03";
			setarray .@warp,265,22;
			break;
		case 3:	//�m�[�O���[�h2�w
			set .@mapname$,"mag_dun02";
			setarray .@warp,47,40;
			break;
		case 4: break;	//fall through
		}
		if(.@mapname$ != "") {
			if(Zeny < 4000) {
				mes "[�J�v�����[�L��E��]";
				mes "���q�l�A����������Ȃ��悤�ł����B";
				break;
			}
			set Zeny,Zeny-4000;
			warp .@mapname$,.@warp[0],.@warp[1];
			end;
		}
	case 4:
		mes "[�J�v�����[�L��E��]";
		mes "��X�J�v���T�[�r�X�́A��芮����";
		mes "�T�[�r�X�ƊǗ��Ɩ���ڎw��";
		mes "���q�l�����S���Ă����p����������悤";
		mes "�����őP��s�����Ă��܂��B";
		mes "�i���j�J�v���T�[�r�X�������p��������";
		mes "���肪�Ƃ��������܂����B";
		break;
	}
	close2;
	cutin "kafra_02",255;
	end;
}

-	script	�W�����_���[�L��E��#vt	874,{
	cutin "zonda_01",2;
	mes "[�W�����_���[�L��E��]";
	mes "��������Ⴂ�܂��A���q�l�B";
	mes "���́A�J�v���T�[�r�X��";
	mes "�W�����_�C�x���g�̊ԂɌ��΂ꂽ����";
	mes "^FF0000�������[^000000�̂��߂ɔh�����ꂽ�A";
	mes "���[�L��E���ł��B";
	mes "���p�������f�����܂��傤�B";
	next;
	switch(select("�������[�ɂ���","���[�ɎQ��","��Ԉړ��T�[�r�X","������")) {
	case 1:
		mes "[�W�����_���[�L��E��]";
		mes "���݁A�~�b�h�K���h�̋�Ԉړ�";
		mes "�T�[�r�X�́A�啔����";
		mes "�J�v���T�[�r�X���s���Ă���܂��B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�����ŃW�����_�C�x���g�ł�";
		mes "�J�v���T�[�r�X�Ƃ̍��ʉ��̂��߁A";
		mes "�J�v���T�[�r�X�ł͒񋟂��Ă��Ȃ�";
		mes "�_���W�����Ȃǂɑ΂��Ď�ɃT�[�r�X��";
		mes "����������Ă��܂����B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�������A���R�ɂ��J�v���T�[�r�X��";
		mes "���l�̊����������Ă����悤�ł��B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�䂪�ЂƂ��ẮA���������̂قƂ�ǂ�";
		mes "�J�v���T�[�r�X���������Ă��邽�߁A";
		mes "�V�K�����͉䂪�ЂŊl������������";
		mes "�̂ł����A�J�v���T�[�r�X����";
		mes "�������������ł��邱�Ƃł͂Ȃ��A";
		mes "���Ђ͑Η����邱�ƂƂȂ�܂����B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "���ЂŘb�������̌��ʍl�Ă��ꂽ�̂�";
		mes "����^FF0000�������[^000000�ł��B";
		mes "���Ȃ킿�A�ǂ���̊�Ƃ��T�[�r�X��";
		mes "���{���邩�A���q�l�̓��[�ɂ����";
		mes "���߂悤�Ƃ������̂ł��B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�������A1��̓��[�ō���̃T�[�r�X��";
		mes "�i���I�Ɍ��߂Ă��܂��ƁA";
		mes "���ЊԂ̖��C���[�܂鋰�ꂪ����܂��B";
		mes "���̂��߁A1��ڂ̓��[�Ō����𓾂�";
		mes "��Ƃ������Ԑ�ɃT�[�r�X���s���A";
		mes "���̌�ē��[���邱�Ƃɂ������܂����B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�������ē��[������Ƃ��Ă��A";
		mes "����̊�Ƃ����񌠗��𓾂�";
		mes "�\��������̂ŁA���ЂɂƂ��Ă�";
		mes "�����b�g�Ƃ��f�����b�g�Ƃ�";
		mes "�����邱�Ƃł��傤�B";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "�W�����_�C�x���g�́A�J�v���T�[�r�X��";
		mes "������`�ł��q�l�ɍō��̃T�[�r�X��";
		mes "�񋟂��Ă܂���܂��B";
		mes "������䂪�W�����_�C�x���g���A";
		mes "�����ڂ��������܂��悤�A";
		mes "��낵�����肢�v���܂��B";
		break;
	case 2:
		if(BaseLevel < 60) {
			mes "[�W�����_���[�L��E��]";
			mes "�\���󂲂����܂���B";
			mes "���[�����Ȃ���΁A";
			mes "�������[�ɂ͎Q���ł��܂���B";
			mes "���[���𓾂Ă���A";
			mes "���[�ɂ��Q�����������B";
			next;
			mes "[�W�����_���[�L��E��]";
			mes "���[���Ɋւ��ẮA";
			mes "���q�^���[���ɂ���W�����_�{�Ђɂ�";
			mes "�ē��������Ă���܂��B";
			break;
		}
		if($VoteResult) {
			mes "[�W�����_���[�L��E��]";
			mes "���݂͓��[���Ԃł͂������܂���̂ŁA";
			mes "���[���邱�Ƃ��ł��܂���B";
			mes "���񓊕[�̍ۂɁA�܂����z�����������B";
			mes "����ł́A�ǂ�������B";
			break;
		}
		if(ZONDA_VOTE > $VoteNumber) {
			mes "[�W�����_���[�L��E��]";
			mes "�\���󂲂����܂��񂪁A";
			mes "���q�l�͊��ɓ��[�ς݂ł��B";
			mes "���񓊕[�̍ۂɁA�܂����z�����������B";
			mes "����ł́A�ǂ�������B";
			break;
		}
		mes "[�W�����_���[�L��E��]";
		mes "�䂪�W�����_�C�x���g�Ŋ�撆��";
		mes "�]���n��́A���̒n��ł��B";
		mes "-^FF0000�C�Y���[�h�C�ꓴ�A3�w^000000-";
		if($VoteZondaP >= 1) mes "-^FF0000�A���f�o�������v���n��3F^000000-";
		if($VoteZondaP >= 2) mes "-^FF0000�O���X�g�w�C���Ï�^000000-";
		next;
		mes "[�W�����_���[�L��E��]";
		mes "���̒n��ւ̋�Ԉړ��T�[�r�X��";
		mes "��]�����ꍇ�́A�W�����_�C�x���g��";
		mes "���[�����肢�������܂��B";
		mes "�W�����_�C�x���g�ɋM�d�Ȉ�[���A";
		mes "��낵�����肢�������܂��B";
		next;
		if(select("������","�͂�")==1) {
			mes "[�W�����_���[�L��E��]";
			mes "�����ł����c�c�c�O�ł����A";
			mes "���[�͂��q�l�̈ӎv�ɂ���čs��";
			mes "���̂ł��̂ŁA�d�����Ȃ��ł��ˁB";
			mes "�����A�C���ς��܂�����A";
			mes "�������q�˂��������B";
			next;
			mes "[�W�����_���[�L��E��]";
			mes "�W�����_�C�x���g�́A���q�l��";
			mes "��ɍō��̃T�[�r�X��";
			mes "�񋟂������Ă���܂��B";
			mes "����ł́A�ǂ�������B";
			break;
		}
		set ZONDA_VOTE,$VoteNumber+1;
		set $VoteZonda,$VoteZonda+1;
		mes "[�W�����_���[�L��E��]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���q�l�̋M�d�Ȉ�[��Y�ꂸ�ɁA";
		mes "������W�����_�C�x���g��";
		mes "�w�͂��Ă܂���܂��B";
		mes "����ł́A�ǂ�������B";
		break;
	case 3:
		if($VoteResult == 0) {
			mes "[�W�����_���[�L��E��]";
			mes "�\���󂲂����܂���B";
			mes "���ݓ��[���Ԓ��̂��߁A��Ԉړ�";
			mes "�T�[�r�X�𗘗p���邱�Ƃ��ł��܂���B";
			mes "���[���ԏI����A���[���ʂɂ����";
			mes "�����p�����������Ƃ��ł��܂��B";
			break;
		}
		if($VoteResult == 1) {
			mes "[�W�����_���[�L��E��]";
			mes "�\���󂲂����܂���A���[�̌��ʁA";
			mes "���݃W�����_�C�x���g�ł͋�Ԉړ�";
			mes "�T�[�r�X���������Ă���܂���B";
			mes "���񓊕[�̍ۂɂ́A�W�����_�C�x���g��";
			mes "��[����낵�����肢�������܂��B";
			mes "����ł́A�ǂ�������B";
			break;
		}
		mes "[�W�����_���[�L��E��]";
		mes "�ړI�n������������Ă��������B";
		next;
		if($VoteZondaP >= 1) set .@warp1$,"�A���f�o�������v���n��3F -> 4000z";
		if($VoteZondaP >= 2) set .@warp2$,"�O���X�g�w�C���Ï� -> 4000z";
		switch(select("�C�Y���[�h�C�ꓴ�A3�w -> 4000 z",.@warp1$,.@warp2$,"������")) {
		case 1:	//�C�Y���[�h�C�ꓴ�A3�w
			set .@mapname$,"iz_dun02";
			setarray .@warp,234,206;
			break;
		case 2:	//�A���f�o�������v���n��3F
			set .@mapname$,"c_tower3";
			setarray .@warp,64,143;
			break;
		case 3:	//�O���X�g�w�C���Ï�
			set .@mapname$,"glast_01";
			setarray .@warp,368,303;
			break;
		case 4: break;	//fall through
		}
		if(.@mapname$ != "") {
			if(Zeny < 4000) {
				mes "[�W�����_���[�L��E��]";
				mes "���q�l�A����������Ȃ��悤�ł����B";
				break;
			}
			set Zeny,Zeny-4000;
			warp .@mapname$,.@warp[0],.@warp[1];
			end;
		}
	case 4:
		mes "[�W�����_���[�L��E��]";
		mes "�W�����_�C�x���g�́A���q�l��";
		mes "��ɍō��̃T�[�r�X��";
		mes "�񋟂������Ă���܂��B";
		mes "����ł́A�ǂ�������B";
		break;
	}
	close2;
	cutin "zonda_01",255;
	end;
}

yuno,162,191,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�W���m�[		861
yuno,153,191,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�W���m�[		874
prontera,164,125,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�v�����e��		116
prontera,147,125,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�v�����e��	874
//morocc,164,114,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�����N		116
//morocc,155,114,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�����N		874
moc_ruins,104,133,3	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�����N		116
moc_ruins,97,133,5	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�����N		874
geffen,122,37,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�Q�t�F��		116
geffen,117,37,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�Q�t�F��		874
payon,158,182,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�t�F�C����		116
payon,153,182,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�t�F�C����	874
alberta,119,70,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�A���x���^		116
alberta,114,70,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�A���x���^	874
aldebaran,145,102,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::�A���f�o����	116
aldebaran,138,102,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::�A���f���o��	874
lighthalzen,163,60,4	duplicate(�J�v�����[�L��E��#vt)	�J�v�����[�L��E��::���q�^���[��	861
lighthalzen,154,60,6	duplicate(�W�����_���[�L��E��#vt)	�W�����_���[�L��E��::���q�^���[��	874