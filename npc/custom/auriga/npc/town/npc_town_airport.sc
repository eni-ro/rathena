//= Athena Script ==============================================================
// Ragnarok Online Airport Script	by Blaze
//= Registry ===================================================================
// $TypingScore -> �^�C�s���O�n�C�X�R�A
// $TypingName$ -> �^�C�s���O�L�^�ێ��҂̃L������
//==============================================================================

//============================================================
// �K�C�h�E��
//------------------------------------------------------------
-	script	��s�D�E��#guide	91,{
	mes "[��s�D�E��]";
	mes "����ɂ��́B";
	mes "���D�ł́A����";
	mes "���q�l�̉��K�ȗ��s�̂��߂�";
	mes "�őP��s�����Ă���܂��B";
	next;
	mes "[��s�D�E��]";
	mes "��s�D�ɏ�肽���ꍇ�́A";
	mes "������̓�������炨���肭�������B";
	mes "��`���o�����ꍇ�́A";
	mes "������̊K�i�����~�肭�������B";
	close;
}

//�A�C���u���b�N
einbroch,94,267,3	duplicate(��s�D�E��#guide)	��s�D�E��	91

//�W���m�[
yuno,88,263,3	duplicate(��s�D�E��#guide)	��s�D�E��	91
yuno,14,262,5	duplicate(��s�D�E��#guide)	��s�D�E��	91

//============================================================
// ��`�Q�[�g���E��
//------------------------------------------------------------
-	script	��`�E��#AirportIn	90,{
	mes "[��`�E��]";
	mes "����ɂ��́B";
	mes "��X�́A���q�l�ɉ��K�ȋ�̗���";
	mes "�񋟂ł���悤�A�S�|���Ă���܂��B";
	mes "��������`���������܂��傤�H";
	next;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//map�ȊO�̓_�~�[
	if(.@map$ == "izlude")
		set .@word$,"�W���m�[/���w���s���̔�s�D�ɏ��";
	else
		set .@word$,"��`�ɓ���";

	if(select(.@word$,"������")==1) {
		mes "[��`�E��]";
		mes "��s�D�̗��p������1200zeny�ł��B";
		mes "��s�D�������p�����������̏ꍇ��";
		mes "�����ł����p�ł��܂��B";
		if(.@map$ == "izlude")
			mes "��s�D�ɏ��܂����H";
		else
			mes "��`�ɓ���܂����H";
		next;
		if(select("�͂�","������")==1) {
			if(countitem(7311))
				delitem 7311,1;
			else if(Zeny<1200) {
				mes "[��`�E��]";
				mes "��s�D�̗��p������";
				mes "1200zeny�ł��B";
				close;
			}
			else {
				set Zeny,Zeny-1200;
			}
			if(.@map$ == "izlude")
				warp "airplane_01",244,58;
			else
				warp .@map$,148,51;
			end;
		}
	}
	mes "[��`�E��]";
	mes "�܂��̂����p�����҂����Ă���܂��B";
	close;
}

//�A�C���u���b�N
airport,126,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90
airport,143,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90
airport,158,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90

//�W���m�[
y_airport,126,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90
y_airport,143,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90
y_airport,158,43,5		duplicate(��`�E��#AirportIn)	��`�E��	90

//���q�^���[��
lhz_airport,126,43,5	duplicate(��`�E��#AirportIn)	��`�E��	90
lhz_airport,143,43,5	duplicate(��`�E��#AirportIn)	��`�E��	90
lhz_airport,158,43,5	duplicate(��`�E��#AirportIn)	��`�E��	90

//�C�Y���[�h
izlude,206,55,2		duplicate(��`�E��#AirportIn)	��`�E��	90

//�t�B�Q��
hugel,178,142,0	script	hugelwarp	45,1,1,{
	mes "��s�D�ɏ��ɂ́A";
	mes "��s�D�������p����";
	mes "1200Zeny���K�v�ƂȂ�܂��B";
	mes "��s�D�ɏ��܂����H";
	next;
	if(select("���","���Ȃ�")==2) {
		mes "����̂����p�����҂����Ă��܂��B";
		close;
	}
	if(countitem(7311))
		delitem 7311,1;
	else if(Zeny<1200) {
		mes "������������܂���";
		mes "��s�D�ɏ��ɂ�";
		mes "1200Zeny�K�v�ł��B";
		close;
	}
	else
		set Zeny,Zeny-1200;
	warp "airplane",244,58;
	end;
}

//���w��
ra_fild12,295,208,0	script	rachelwarp	45,1,1,{
	mes "��s�D�ɏ��ɂ́A";
	mes "��s�D�������p����";
	mes "1200Zeny���K�v�ƂȂ�܂��B";
	mes "��s�D�ɏ��܂����H";
	next;
	if(select("���","���Ȃ�")==2) {
		mes "����̂����p�����҂����Ă��܂��B";
		close;
	}
	if(countitem(7311))
		delitem 7311,1;
	else if(Zeny<1200) {
		mes "������������܂���";
		mes "��s�D�ɏ��ɂ�";
		mes "1200Zeny�K�v�ł��B";
		close;
	}
	else
		set Zeny,Zeny-1200;
	warp "airplane_01",245,60;
	end;
}

//============================================================
// ��`�Q�[�g�O�E��
//------------------------------------------------------------
-	script	��`�E��#AirportOut	90,{
	mes "[��`�E��]";
	mes "����ɂ��́B";
	mes "��X�́A���q�l�ɉ��K�ȋ�̗���";
	mes "�񋟂ł���悤�A�S�|���Ă���܂��B";
	mes "��������`���������܂��傤�H";
	next;
	if(select("��`����o��","������")==1) {
		mes "[��`�E��]";
		mes "��x�o�Ă��܂��ƁA�ē���̍ۂ�";
		mes "�������𒸂����ƂƂȂ�܂��B";
		mes "�o�܂����H";
		next;
		if(select("�͂�","������")==1) {
			set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//map�ȊO�̓_�~�[
			warp .@map$,142,40;
			end;
		}
	}
	mes "[��`�E��]";
	mes "�܂��̂����p�����҂����Ă���܂��B";
	close;
}

//�A�C���u���b�N
airport,126,51,3		duplicate(��`�E��#AirportOut)	��`�E��	90
airport,143,49,3		duplicate(��`�E��#AirportOut)	��`�E��	90
airport,158,50,3		duplicate(��`�E��#AirportOut)	��`�E��	90

//�W���m�[
y_airport,126,51,3		duplicate(��`�E��#AirportOut)	��`�E��	90
y_airport,143,49,3		duplicate(��`�E��#AirportOut)	��`�E��	90
y_airport,158,50,3		duplicate(��`�E��#AirportOut)	��`�E��	90

//���q�^���[��
lhz_airport,126,51,3	duplicate(��`�E��#AirportOut)	��`�E��	90
lhz_airport,143,49,3	duplicate(��`�E��#AirportOut)	��`�E��	90
lhz_airport,158,50,3	duplicate(��`�E��#AirportOut)	��`�E��	90

//============================================================
// �A�C���u���b�N��`NPC
//------------------------------------------------------------
airport,174,41,6	script	�N	99,{
	mes "[�����A��]";
	mes "���͐��E�����璿��������";
	mes "�W�߂Ă����ł����c�c";
	mes "�ŋ߂̋������́A������";
	mes "���i�ɑ΂���ڂ��삦�Ă��āA";
	mes "�����Ƃ����ƒ���������";
	mes "�T���Ă������Ă��邳����ł���c�c";
	next;
	mes "[�����A��]";
	mes "�̂́A�[���s�[�ł��璿������ꂽ�̂�";
	mes "�����Ⴀ��ӂꂽ���c�c";
	mes "�͂��`�c�c��H�@���A���Ȃ��I";
	mes "���̐g�ɂ��Ă���h��ȕ���";
	mes "�ǂ��Ŏ�ɓ��ꂽ�̂ł����H";
	close;
}

airport,176,41,4	script	��������	88,{
	mes "[�`���A��]";
	mes "������ӂɂ��郂���X�^�[����A";
	mes "�ԕr�̍ޗ��ƂȂ�h��Ȍ����o���z����";
	mes "�����������Ƃ����b�𕷂��܂����B";
	next;
	mes "[�`���A��]";
	mes "����ǁA����͖{���ɁA";
	mes "�ԕr�ɂ����g���Ȃ��̂ł��傤���H";
	next;
	mes "[�`���A��]";
	mes "�c�c���̗F�B�ɕ������b�Ȃ�ł����A";
	mes "�l�`���Ă̂́A����ꂵ�������̔��";
	mes "�H�т��l�߂āA�ڂɃT�C�t�@�[��";
	mes "�W�����S�������Ă��邻���ł��B";
	mes "�����āA�d�S�𐮂��邽�߁A";
	mes "���K�̕��Ƀ[���s�[���l�߂邻���ł��I";
	next;
	mes "[�`���A��]";
	mes "�c�c�C�Â��܂������H�@�܂�A����";
	mes "�����͈̂������Ƃł͂���܂���B";
	mes "���ǁA�S�ĉ����Ɏg����̂ł�����B";
	mes "������A���̗l�Ȏ��W�i���l�́A";
	mes "�q�ɂ̋K�͂������̋K�͂����߂�B";
	mes "�����v���܂��񂩁H";
	close;
}

//============================================================
// �W���m�[��`�H���ύX�E��
//------------------------------------------------------------
y_airport,145,63,4	script	��`�E��	91,{
	mes "[��`�E��]";
	mes "�V���o���c�o���h���a������";
	mes "�e�n����s��������";
	mes "��s�D�������p�Ȃ����܂����H";
	next;
	if(select("�͂�","������")==1) {
		warp "yuno",59,244;
		end;
	}
	mes "[��`�E��]";
	mes "���K�ȗ��ɂȂ�܂��悤�ɁB";
	close;
}

y_airport,140,63,4	script	��`�E��	91,{
	mes "[��`�E��]";
	mes "�W���m�[�E�C�Y���[�h�E���w��";
	mes "���^�s�����s�D��";
	mes "�����p�Ȃ����܂����H";
	next;
	if(select("�͂�","������")==1) {
		warp "yuno",47,244;
		end;
	}
	mes "[��`�E��]";
	mes "���K�ȗ��ɂȂ�܂��悤�ɁB";
	close;
}

//============================================================
// �V���o���c�o���h������ ��s�DNPC
//------------------------------------------------------------
airplane,100,69,3	script	�斱��	852,{
	mes "[�斱��]";
	mes "��s�D�������p�̕��́A";
	mes "�����̊K�i������Ă��������B";
	mes "������s�D�𗘗p���Ă�������";
	mes "���肪�Ƃ��������܂��B";
	close;
}

airplane,250,58,2	script	��s�D�ē���	67,{
	mes "[��s�D�ē���]";
	mes "����ɂ��́B";
	mes "���D�ł́A����";
	mes "���q�l�̉��K�ȗ��s�̂��߂�";
	mes "�őP��s�����Ă���܂��B";
	mes "�������ē��������܂��傤���H";
	next;
	if(HU_7QUE == 3) {
		menu "�e�B�I���Ƃ����l��m��Ȃ�������",-;
		mes "[��s�D�ē���]";
		mes "�\���󂠂�܂���B";
		mes "�E���̒��ɂ��̂悤�Ȏ҂�";
		mes "���Ȃ��悤�ł��B";
		close;
	}
	switch(select("��s�D�̗��p���@","�D�����̈ʒu","�����{��","���������ł�")) {
	case 1:
		mes "[��s�D�ē���]";
		mes "��s�D�ŖړI�n�֍s�����ꍇ�́A";
		mes "�ē��������悭���������������B";
		mes "�����āA�ړI�n�̓����ē���";
		mes "����܂�����A�b�ɂ���";
		mes "�o�����炨�~�肭�������B";
		next;
		mes "[��s�D�ē���]";
		mes "������A�~���^�C�~���O��";
		mes "�����Ă��܂����Ƃ��Ă��A���v�ł��B";
		mes "��s�D�͂����Əz�^�s��";
		mes "���Ă���܂��̂ŁB";
		mes "�������҂��ɂȂ��āA���̓�������";
		mes "�~���悤�ɂ��Ă��������B";
		close;
	case 2:
		mes "[��s�D�ē���]";
		mes "�D�����͔�s�D�̈�ԑO���ɂ���܂��B";
		mes "���̒��ɂ́A��s�D���w������D����";
		mes "�ǂ��Ƃ��Ă��鑀�c�m������܂��B";
		mes "�D���͖{���ɂ悢�����Ȃ̂ŁA";
		mes "����A��x����Ă݂Ă��������B";
		close;
	case 3:
		mes "[��s�D�ē���]";
		mes "��s�D�ɂ́A���q�l�������s�̊ԁA";
		mes "�ދ��Ȃ���Ȃ��悤��";
		mes "�~�j�Q�[�������p�ӂ��Ă���܂��B";
		mes "�����ɔ�ꂽ���A�C���]�����������A";
		mes "�����x�݂������ɂ��낰��ꏊ�Ȃ̂�";
		mes "�����Ȃ������p���������B";
		close;
	case 4:
		mes "[��s�D�ē���]";
		mes "�ł́A�悢���ɂȂ�܂��悤�ɁB";
		close;
	}
}

airplane,221,158,2	script	���c�m	852,{
	if(HU_7QUE == 3) {
		mes "[���c�m]";
		mes "�ǂ��֍s���Ă��A";
		mes "���������߂�΂����ł��B";
		mes "���͎��̐l���I�@���͎��̗́I";
		mes "�����Ȃ��l���́A";
		mes "�������Ȃ��܂񂶂イ�ƈꏏ�ł��I�I";
		next;
		emotion 28;
		mes "[���c�m]";
		mes "�ł��A�����^�]�͐�ΑʖځI";
		mes "���ꂪ�A���̎d����";
		mes "�h���Ƃ���Ȃ�ł��`�B";
		next;
		menu "�e�B�I���Ƃ����l��m��Ȃ�������",-;
		mes "[���c�m]";
		mes "�ӂ��`�B";
		mes "���̐������ƁA�������Ȃ��`�B";
		mes "�D�����ɐl�͗��Ȃ�����A";
		mes "�p���c�p�ł��悤���ȁc�c�B";
		next;
		mes "[���c�m]";
		mes "�c�c�c�c�B";
		next;
		emotion 23;
		mes "[���c�m]";
		mes "�n�b!!";
		mes "�N�ł�?!";
		next;
		mes "-�c�c�S�R�����Ă��Ȃ�����-";
		close;
	}
	switch(rand(4)) {
	case 0:
		mes "[���c�m]";
		mes "�����͓V�C���{���ɗǂ��ł��ˁB";
		mes "����ȓ��̑��c�́A";
		mes "�������C���������ł��B";
		close;
	case 1:
		mes "[���c�m]";
		mes "���ǂ��̑D���́A";
		mes "�悢�l�i�Ɗi���̗��������˔�����";
		mes "�f���炵�����Ƃ��āA";
		mes "�V���o���c�o���h���ł��L���ł��B";
		mes "�������A�D���B�͊F�A";
		mes "�D����炢�A���h���Ă��܂��B";
		next;
		mes "[���c�m]";
		mes "����Ɉ��������A�D���̂��Z�����";
		mes "���X�C������ł��āc�c";
		mes "�ł��A����Ȃ��Z�����D���́A";
		mes "��D���Ȃ񂾂����ł��B";
		next;
		mes "[���c�m]";
		mes "�Ƃ���ŁA���̂��Z���񂪑D����";
		mes "�����؂�Ă����悤�ł��ˁB";
		mes "�D���́A���ꂪ�}�ɕK�v�ɂȂ����A";
		mes "�Ƃ������ĒT���Ă����悤�ł����c�c�B";
		close;
	case 2:
		mes "[���c�m]";
		mes "�ǂ��֍s���Ă��A";
		mes "���������߂�΂����ł��B";
		mes "���͎��̐l���I�@���͎��̗́I";
		mes "�����Ȃ��l���́A";
		mes "�������Ȃ��܂񂶂イ�ƈꏏ�ł��I�I";
		next;
		emotion 28;
		mes "[���c�m]";
		mes "�ł��A�����^�]�͐�ΑʖځI";
		mes "���ꂪ�A���̎d����";
		mes "�h���Ƃ���Ȃ�ł��`�B";
		close;
	case 3:
		mes "[���c�m]";
		mes "�ӂ��`�B";
		mes "���̐������ƁA�������Ȃ��`�B";
		mes "�D�����ɐl�͗��Ȃ�����A";
		mes "�p���c�p�ł��悤���ȁc�c�B";
		next;
		mes "[���c�m]";
		mes "�c�c�c�c�B";
		next;
		emotion 23;
		mes "[���c�m]";
		mes "�n�b!!";
		mes "�N�ł�?!";
		close;
	}
}

airplane,65,63,4	script	����	714,{
	mes "[����]";
	mes "���̔�s�D�́A";
	mes "�����e�B�G�ɒ����̂�����H";
	mes "������҂��Ă��A";
	mes "�u���e�B�G�ɓ��������v�Ƃ���";
	mes "�������Ȃ��̂�ˁc�c";
	close;
}

airplane,80,71,2	script	�[���^	834,{
	mes "[�[���^]";
	mes "���́A���鋳�����L�߂邽�߂�";
	mes "���Ƃ��Ă���҂ł��B";
	mes "���̋����ɂ��A";
	mes "���[���~�b�h�K�b�c�����S�̂�";
	mes "�c�������邱�Ƃ��A���̊肢�ł��B";
	close;
}

airplane,72,34,6	script	�A�m�[�X	702,{
	mes "[�A�m�[�X]";
	mes "�󂩂璭�߂�i�F�́A";
	mes "�{���ɗǂ��ł��ˁB";
	mes "���ɂȂ��āA���R�ɔ�щ�ꂽ��";
	mes "�ǂ�Ȃɗǂ����낤�ȁB";
	close;
}

airplane,71,91,6	script	�E���o���̒j��	789,{
	if(UM_1QUE < 3) {
		mes "[��������]";
		mes "�E���o�o�A�t���o�o�B";
		next;
		emotion 32;
		mes "[��������]";
		mes "�E���o�A�E�o�t���o�A�E���o�o�B";
		mes "�E�o�o�A�E���o�o�A�t���o�o�A";
		mes "�E���o�A�t���o�E���o�A�E���o�B";
		close;
	}
	mes "[��������]";
	mes "���ꂪ��s�D���B";
	next;
	emotion 32;
	mes "[��������]";
	mes "���́A��s�D�̏斱�������́A";
	mes "�������|�ǂ���������̂ɁA";
	mes "�E���o���ŌP������̂ł��B";
	mes "���ɂ́A�������|�ǂ������ł����A";
	mes "���҂̊X�֍s���Ă��܂����l��";
	mes "����Ƃ��A���Ȃ��Ƃ��B";
	close;
}

airplane,66,93,2	script	�E���o���̏���	783,{
	if(UM_1QUE < 3) {
		emotion 9;
		mes "[���ꂳ��]";
		mes "�E���o�E���o�c�c";
		mes "�E���E���o�A�E���o�t���o�A�E���o�o�H";
		mes "�E���o�A�E���o�o�o�B�E���o�E���o�B";
		close;
	}
	emotion 9;
	mes "[���ꂳ��]";
	mes "���̎q������c�c";
	mes "�����͐Â��ɂł��Ȃ��́H";
	mes "�l�����鏊�ő�������_���ł��傤�B";
	close;
}

airplane,64,94,0	script	�E���o���̎q��	787,{
	if(UM_1QUE < 3) {
		emotion 19;
		mes "[�q��]";
		mes "�E���o�E���o!!";
		mes "�E���o�o�A�E���o�E���o�A";
		mes "�t���o!!!";
		close;
	}
	emotion 19;
	mes "[�q��]";
	mes "�E���[�A�}�}�A���Č��āI";
	mes "�����ł��[!!!!";
	close;
}

airplane,0,0,0	script	airplane	-1,{
OnInit:
	disablenpc "airplanewarp#ein1";
	disablenpc "airplanewarp#ein2";
	disablenpc "airplanewarp#lhz1";
	disablenpc "airplanewarp#lhz2";
	disablenpc "airplanewarp#hu1";
	disablenpc "airplanewarp#hu2";
	initnpctimer;
	end;
OnTimer1000:
	disablenpc "airplanewarp#yuno1";
	disablenpc "airplanewarp#yuno2";
	announce "���D�͗������܂��B���̖ړI�n�̓A�C���u���b�N�ł��B",9,0x00FF00;
	end;
OnTimer16000:
	announce "���D�͌��݁A�A�C���u���b�N�Ɍ������Ă���܂��B",9,0x00FF00;
	end;
OnTimer31000:
	announce "�܂��Ȃ��A�A�C���u���b�N�ɒ����������܂��B",9,0x00FF00;
	end;
OnTimer41000:
	enablenpc "airplanewarp#ein1";
	enablenpc "airplanewarp#ein2";
	announce "�A�C���u���b�N�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0x00FF00;
	end;
OnTimer51000:
	announce "���݁A�A�C���u���b�N�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0x00FF00;
	end;
OnTimer61000:
	disablenpc "airplanewarp#ein1";
	disablenpc "airplanewarp#ein2";
	announce "��s�D�A�������܂��B���̖ړI�n�̓��q�^���[���ł��B",9,0x73DEDE;
	end;
OnTimer76000:
	announce "���D�͌��݁A���q�^���[���Ɍ������Ă���܂��B",9,0x73DEDE;
	end;
OnTimer91000:
	announce "�܂��Ȃ��A���q�^���[���ɒ����������܂��B",9,0x73DEDE;
	end;
OnTimer101000:
	enablenpc "airplanewarp#lhz1";
	enablenpc "airplanewarp#lhz2";
	announce "���q�^���[���ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0x73DEDE;
	end;
OnTimer111000:
	announce "���݁A���q�^���[���ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0x73DEDE;
	end;
OnTimer121000:
	disablenpc "airplanewarp#lhz1";
	disablenpc "airplanewarp#lhz2";
	announce "���D�͗������܂��B���̖ړI�n�̓A�C���u���b�N�ł��B",9,0x00FF00;
	end;
OnTimer136000:
	announce "���D�͌��݁A�A�C���u���b�N�Ɍ������Ă���܂��B",9,0x00FF00;
	end;
OnTimer151000:
	announce "�܂��Ȃ��A�A�C���u���b�N�ɒ����������܂��B",9,0x00FF00;
	end;
OnTimer161000:
	enablenpc "airplanewarp#ein1";
	enablenpc "airplanewarp#ein2";
	announce "�A�C���u���b�N�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0x00FF00;
	end;
OnTimer171000:
	announce "���݁A�A�C���u���b�N�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0x00FF00;
	end;
OnTimer181000:
	disablenpc "airplanewarp#ein1";
	disablenpc "airplanewarp#ein2";
	announce "���D�͗������܂��B���̖ړI�n�̓W���m�[�ł��B",9,0xFF8400;
	end;
OnTimer196000:
	announce "���D�͌��݁A�W���m�[�Ɍ������Ă���܂��B",9,0xFF8400;
	end;
OnTimer211000:
	announce "�܂��Ȃ��A�W���m�[�ɒ����������܂��B",9,0xFF8400;
	end;
OnTimer221000:
	enablenpc "airplanewarp#yuno1";
	enablenpc "airplanewarp#yuno2";
	announce "�W���m�[�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0xFF8400;
	end;
OnTimer231000:
	announce "���݁A�W���m�[�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0xFF8400;
	end;
OnTimer241000:
	disablenpc "airplanewarp#yuno1";
	disablenpc "airplanewarp#yuno2";
	announce "��s�D�A�������܂��B���̖ړI�n�̓t�B�Q���ł��B",9,0xCE4AF7;
	end;
OnTimer256000:
	announce "���D�͌��݁A�t�B�Q���Ɍ������Ă���܂��B",9,0xCE4AF7;
	end;
OnTimer271000:
	announce "�܂��Ȃ��A�t�B�Q���ɒ����������܂��B",9,0xCE4AF7;
	end;
OnTimer281000:
	enablenpc "airplanewarp#hu1";
	enablenpc "airplanewarp#hu2";
	announce "�t�B�Q���ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0xCE4AF7;
	end;
OnTimer291000:
	announce "���݁A�t�B�Q���ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0xCE4AF7;
	end;
OnTimer301000:
	disablenpc "airplanewarp#hu1";
	disablenpc "airplanewarp#hu2";
	announce "���D�͗������܂��B���̖ړI�n�̓W���m�[�ł��B",9,0xFF8400;
	end;
OnTimer316000:
	announce "���D�͌��݁A�W���m�[�Ɍ������Ă���܂��B",9,0xFF8400;
	end;
OnTimer331000:
	announce "�܂��Ȃ��A�W���m�[�ɒ����������܂��B",9,0xFF8400;
	end;
OnTimer341000:
	enablenpc "airplanewarp#yuno1";
	enablenpc "airplanewarp#yuno2";
	announce "�W���m�[�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0xFF8400;
	end;
OnTimer351000:
	announce "���݁A�W���m�[�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0xFF8400;
	end;
OnTimer360000:
	initnpctimer;
	end;
}

airplane,243,29	warp	airplanewarp#yuno1	1,1,yuno,92,260
airplane,243,73	warp	airplanewarp#yuno2	1,1,yuno,92,260
airplane,243,29	warp	airplanewarp#ein1	1,1,einbroch,92,278
airplane,243,73	warp	airplanewarp#ein2	1,1,einbroch,92,278
airplane,243,29	warp	airplanewarp#lhz1	1,1,lighthalzen,302,75
airplane,243,73	warp	airplanewarp#lhz2	1,1,lighthalzen,302,75
airplane,243,29	warp	airplanewarp#hu1	1,1,hugel,181,146
airplane,243,73	warp	airplanewarp#hu2	1,1,hugel,181,146

airplane,240,64,5	script	�o��	857,{}
airplane,247,64,5	script	�o��	857,{}
airplane,240,40,0	script	�o��	857,{}
airplane,247,40,0	script	�o��	857,{}

//============================================================
// ���O�� ��s�DNPC
//------------------------------------------------------------
airplane_01,250,58,3	script	��s�D�ē���#AirEvent	67,{
	mes "[��s�D�ē���]";
	mes "����ɂ��́B";
	mes "���D�ł́A����";
	mes "���q�l�̉��K�ȗ��s�̂��߂�";
	mes "�őP��s�����Ă���܂��B";
	mes "�������ē��������܂��傤���H";
	next;
	switch(select("��s�D�̗��p���@","�D�����̈ʒu","�����{��","���������ł�")) {
	case 1:
		mes "[��s�D�ē���]";
		mes "��s�D�ŖړI�n�֍s�����ꍇ�́A";
		mes "�ē��������悭���������������B";
		mes "�����āA�ړI�n�̓����ē���";
		mes "����܂�����A�b�ɂ���";
		mes "�o�����炨�~�肭�������B";
		next;
		mes "[��s�D�ē���]";
		mes "������A�~���^�C�~���O��";
		mes "�����Ă��܂����Ƃ��Ă��A���v�ł��B";
		mes "��s�D�͂����Əz�^�s��";
		mes "���Ă���܂��̂ŁB";
		mes "�������҂��Ȃ��āA���̓�������";
		mes "�~���悤�ɂ��Ă��������B";
		close;
	case 2:
		mes "[��s�D�ē���]";
		mes "�D�����͔�s�D�̈�ԑO���ɂ���܂��B";
		mes "���̒��ɂ́A��s�D���w������D����";
		mes "�ǂ��Ƃ��Ă��鑀�c�m������܂��B";
		mes "�D���͐��i�����X�c�c�B";
		mes "�܂��A���b���鎞�́A";
		mes "�C�����Ă��������ˁB";
		close;
	case 3:
		mes "[��s�D�ē���]";
		mes "��s�D�ɂ́A���q�l�������s�̊ԁA";
		mes "�ދ��Ȃ���Ȃ��悤��";
		mes "�~�j�Q�[�������p�ӂ��Ă���܂��B";
		mes "�����ɔ�ꂽ���A�C���]�����������A";
		mes "�����x�݂������ɂ��낰��ꏊ�Ȃ̂�";
		mes "�����Ȃ������p���������B";
		close;
	case 4:
		mes "[��s�D�ē���]";
		mes "�ł́A�悢���ɂȂ�܂��悤�ɁB";
		close;
	}
}

airplane_01,221,158,2	script	���c�m	852,{
	switch(rand(4)) {
	case 0:
		mes "[���c�m]";
		mes "�����͉_�������ł��ˁB";
		mes "����ȓ��͍q�H��������̂�";
		mes "��ςȂ�ł��B";
		mes "�͂��`";
		close;
	case 1:
		mes "[���c�m]";
		mes "�D���́A�C������ł��B";
		mes "���������N�����ƁA";
		mes "���̌�n���͑S���A";
		mes "���ǂ��D���B�����܂��B";
		mes "�������܂��A���̃g���u����";
		mes "�N�������Ƃ��c�c�͂��`�B";
		next;
		mes "[^FF0000�y�����b�N^000000]";
		mes "^FF0000�����I�@����!!";
		mes "���ʘb���ĂȂ��œ����I^000000";
		next;
		mes "[���c�m]";
		mes "�́A�͂��I";
		mes "�����ł�!!";
		close;
	case 2:
		mes "[���c�m]";
		mes "���݁A��131�A��52�̏���q�s���B";
		mes "�ُ�Ȃ��I";
		close;
	case 3:
		mes "[���c�m]";
		mes "�ӂ��`�B";
		mes "���̐������ƁA�������Ȃ��`�B";
		mes "�D�����ɐl�͗��Ȃ�����A";
		mes "�p���c�p�ł��悤���ȁc�c�B";
		next;
		mes "[���c�m]";
		mes "�c�c�c�c�B";
		next;
		emotion 23;
		mes "[���c�m]";
		mes "�n�b!!";
		mes "�N�ł�?!";
		close;
	}
}

airplane_01,83,61,2	script	����	72,2,2,{
	mes "[����]";
	mes "����`��!!";
	mes "���O�ł͂��Ⴂ�ł���A";
	mes "������{��ꂽ�`�B";
	mes "�т����肵����`�B";
	close;
OnTouch:
	emotion 28;
	end;
}

airplane_01,69,63,2	script	�M���̒j��	55,{
	mes "[�M���̒j��]";
	mes "��͂�@���H�́A���̌��ɍ���Ȃ��ˁB";
	mes "�C�i���A�Z���X���Ȃ��B";
	mes "�ꑮ�����l��A��ė���΂悩�����B";
	close;
}

airplane_01,71,31,2	script	���m	106,{
	mes "[���m]";
	mes "�c�c5�N�O�̕��Q�c�c�B";
	mes "�c�c�o���Ă�c�c�B";
	mes "���x�͐�΂ɓ�������!!";
	close;
}

airplane_01,0,0,0	script	airplane_01	-1,{
OnInit:
	disablenpc "airplanewarp#iz1";
	disablenpc "airplanewarp#iz2";
	disablenpc "airplanewarp#yuno1_";
	disablenpc "airplanewarp#yuno2_";
	set .count,12;
	initnpctimer;
	end;
OnTimer1000:
	disablenpc "airplanewarp#ra1";
	disablenpc "airplanewarp#ra2";
	announce "���D�͗������܂��B���̖ړI�n�̓C�Y���[�h�ł��B",9,0x00FF00;
	end;
OnTimer26000:
	announce "���D�͌��݁A�C�Y���[�h�Ɍ������Ă���܂��B",9,0x00FF00;
	end;
OnTimer31000:
	if(.count <= 0) {
		if(rand(3) == 0)
			callsub L_Attack;
		set .count,12;
	}
	end;
OnTimer51000:
	announce "�܂��Ȃ��A�C�Y���[�h�ɒ����������܂��B",9,0x00FF00;
	end;
OnTimer61000:
	enablenpc "airplanewarp#iz1";
	enablenpc "airplanewarp#iz2";
	announce "�C�Y���[�h�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0x00FF00;
	end;
OnTimer71000:
	announce "���݁A�C�Y���[�h�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0x00FF00;
	end;
OnTimer81000:
	disablenpc "airplanewarp#iz1";
	disablenpc "airplanewarp#iz2";
	announce "���D�͗������܂��B���̖ړI�n�̓W���m�[�ł��B",9,0x73DEDE;
	end;
OnTimer106000:
	announce "���D�͌��݁A�W���m�[�Ɍ������Ă���܂��B",9,0x73DEDE;
	end;
OnTimer131000:
	announce "�܂��Ȃ��A�W���m�[�ɒ����������܂��B",9,0x73DEDE;
	end;
OnTimer141000:
	enablenpc "airplanewarp#yuno1_";
	enablenpc "airplanewarp#yuno2_";
	announce "�W���m�[�ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0x73DEDE;
	end;
OnTimer151000:
	announce "���݁A�W���m�[�ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0x73DEDE;
	end;
OnTimer161000:
	disablenpc "airplanewarp#yuno1_";
	disablenpc "airplanewarp#yuno2_";
	announce "���D�͗������܂��B���̖ړI�n�̓��w���ł��B",9,0xFF8400;
	end;
OnTimer176000:
	announce "���D�͌��݁A���w���Ɍ������Ă���܂��B",9,0xFF8400;
	end;
OnTimer191000:
	announce "�܂��Ȃ��A���w���ɒ����������܂��B",9,0xFF8400;
	end;
OnTimer201000:
	enablenpc "airplanewarp#ra1";
	enablenpc "airplanewarp#ra2";
	announce "���w���ɓ������܂����B�܂��̂����p�����҂����Ă���܂��B",9,0xFF8400;
	end;
OnTimer211000:
	announce "���݁A���w���ɒ�D���ł��B�o���܂ŁA���΂炭���҂����������B",9,0xFF8400;
	end;
OnTimer220000:
	set .count,.count-1;
	initnpctimer;
	end;
L_Attack:
	stopnpctimer;
	announce "�ϑ����F����c�c����`��!! �ςȂ��̂��߂Â��Ă��Ă�?!",9,0x00FF00;
	sleep 4000;
	announce "�ē������F��q�̊F�l�A���݁A���̕s���̃����X�^�[�B�����D�Ɍ����Ă���܂�!!",9,0x00FF00;
	sleep 4000;
	announce "�ē������F�b�ɂ�����������X�́A���}�A���֔��Ă��������B",9,0x00FF00;
	hideonnpc "��s�D�ē���#AirEvent";
	sleep 10000;
	monster "airplane_01",245,57,"�O��������",1632,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",247,59,"�O��������",1632,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",249,52,"�O��������",1632,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",243,62,"�O��������",1632,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",239,52,"�r�z���_�[",1633,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",234,56,"�r�z���_�[",1633,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",227,49,"�r�z���_�[",1633,1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",233,41,"�r�z���_�[",1633,1,"Airplane#AirEvent1" + "::OnEvent";;
	setarray .@mobid,1111,1392,1005,1049,1042;
	monster "airplane_01",251,47,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",245,53,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",234,46,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",233,58,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",243,60,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",228,54,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",232,41,"--ja--",.@mobid[rand(5)],1,"Airplane#AirEvent1" + "::OnEvent";;
	monster "airplane_01",238,56,"�O��������",1632,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",239,56,"�O��������",1632,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",240,50,"�O��������",1632,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",241,56,"�O��������",1632,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",247,51,"�O��������",1632,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",237,44,"�r�z���_�[",1633,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",233,54,"�r�z���_�[",1633,1,"Airplane#AirEvent2" + "::OnEvent";;
	monster "airplane_01",237,62,"�r�z���_�[",1633,1,"Airplane#AirEvent2" + "::OnEvent";;
	sleep 5000;
	announce "�斱���F�y�����b�N�D���A��ςł��I�@�O���������ǂ����v���y���Ɂc�c!!",9,0x00FF00;
	sleep 5000;
	announce "�y�����b�N�D���F������?!�@�z��߁`�A�������Ⴈ���˂��`!!�@���̉��l�����ځc�c�I",9,0x73DEDE;
	sleep 5000;
	hideonnpc "��s�D�D��#Air";
	hideoffnpc "��s�D�D��#AirEvent";
	sleep 5000;
	emotion 7,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F������߁`!!�@�������艺�낷���Ƃ��ł��˂��[��!!",9,0x73DEDE;
	sleep 5000;
	announce "-�M�C�M�C�[�b�c�c�O�����D�[�b�A�M�C�M�C�M�B�[�b�A�O�A�@�[�b!!-",9,0x00FF00;
	misceffect 183,"Effect#AirEvent6";
	sleep 500;
	misceffect 183,"Effect#AirEvent7";
	sleep 500;
	misceffect 183,"Effect#AirEvent8";
	sleep 500;
	misceffect 183,"Effect#AirEvent9";
	sleep 500;
	misceffect 183,"Effect#AirEvent10";
	sleep 500;
	misceffect 183,"Effect#AirEvent6";
	sleep 500;
	misceffect 183,"Effect#AirEvent7";
	sleep 500;
	misceffect 183,"Effect#AirEvent8";
	sleep 500;
	misceffect 183,"Effect#AirEvent9";
	sleep 500;
	misceffect 183,"Effect#AirEvent10";
	sleep 500;
	misceffect 183,"Effect#AirEvent6";
	announce "�@�֎m�F����`��!!�@1�Ԃ̌���G���W�������c�c�I",9,0x00FF00;
	sleep 1000;
	misceffect 183,"Effect#AirEvent7";
	sleep 1000;
	misceffect 183,"Effect#AirEvent8";
	sleep 1000;
	misceffect 183,"Effect#AirEvent9";
	sleep 1000;
	misceffect 183,"Effect#AirEvent10";
	sleep 1000;
	misceffect 183,"Effect#AirEvent6";
	sleep 1000;
	announce "���c�m�F�V�l�Ə����A�q�����Ɉ��S�ȏꏊ�ցI�@�}��!!",9,0x00FF00;
	sleep 1000;
	misceffect 183,"Effect#AirEvent6";
	sleep 1000;
	misceffect 183,"Effect#AirEvent7";
	sleep 1000;
	misceffect 183,"Effect#AirEvent8";
	sleep 1000;
	misceffect 183,"Effect#AirEvent7";
	sleep 1000;
	emotion 7,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�ʂ��`���I�@���͍s�g�����Ȃ��������ȁc�c�B",9,0x73DEDE;
	sleep 5000;
	emotion 6,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F���l�̑D�Ŗ\���Ƃǂ��Ȃ邩�A�v���m�点�Ă���!!",9,0x73DEDE;
	sleep 5000;
	emotion 32,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�����̃G�N�\�_�X�W���[�J�[�]�V�A���̂Ƃ��Ă����̃��C�t���ŃP�������Ă���!!",9,0x73DEDE;
	sleep 5000;
	announce "�V���b!!�@�p���p���I�@�p���p���I�@�Y�h���Y�h���Y�h���b!!",9,0x00FF00;
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent1";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent2";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent3";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent4";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent5";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent0";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent1";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent2";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent3";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent4";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent5";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent0";
	killmonster "airplane_01","Airplane#AirEvent2";
	sleep 5000;
	emotion 32,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�O�n�n�n�b�I�@����łǂ���?!",9,0x73DEDE;
	sleep 5000;
	announce "�V���b!!�@�p���p���I�@�p���p���I�@�Y�h���Y�h���Y�h���b!!",9,0x00FF00;
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent6";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent7";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent8";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent9";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent10";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent6";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent7";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent8";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent9";
	misceffect 5,"��s�D�D��#AirEvent";
	sleep 500;
	misceffect 183,"Effect#AirEvent8";
	announce "�{���I�@�v�X�v�X�c�c�h�J���h�J���I",9,0x00FF00;
	sleep 1000;
	misceffect 183,"Effect#AirEvent9";
	sleep 1000;
	misceffect 183,"Effect#AirEvent10";
	sleep 1000;
	misceffect 183,"Effect#AirEvent6";
	sleep 1000;
	misceffect 183,"Effect#AirEvent7";
	sleep 1000;
	emotion 6,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�Ȃ�?!�@������A�܂��G���W�����󂵂₪����?!",9,0x73DEDE;
	sleep 5000;
	announce "���c�m�F���A���́c�c�G���W������ꂽ�̂́A�D���̃��C�t���̂������Ɓc�c�B",9,0x00FF00;
	sleep 5000;
	emotion 4,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�񂠁H�@����́c�c�܂��`�A�N�����ԈႢ�͂��邾��I�@�t�n�n�n�n�b�I",9,0x73DEDE;
	sleep 5000;
	emotion 17,"��s�D�D��#AirEvent";
	announce "�y�����b�N�D���F�Ƃɂ����A��̂��Ƃ͂��O�B�ɔC�����c�c�B�n�n�n�n�[�b�I",9,0x73DEDE;
	sleep 5000;
	hideonnpc "��s�D�D��#AirEvent";
	hideoffnpc "��s�D�D��#Air";
	sleep 150000;
	killmonster "airplane_01","Airplane#AirEvent1";
	sleep 5000;
	announce "�ē������F�����X�^�[�B�́A�S�Ă��Ȃ��Ȃ����悤�ł��B�ł́A�Ăђʏ�^�s�ɖ߂�܂��B",9,0x00FF00;
	hideoffnpc "��s�D�ē���#AirEvent";
	setnpctimer 46000;
	startnpctimer;
	return;
OnEvent:
	end;
}

airplane_01,243,29	warp	airplanewarp#yuno1_	1,1,yuno,12,261
airplane_01,243,73	warp	airplanewarp#yuno2_	1,1,yuno,12,261
airplane_01,243,29	warp	airplanewarp#iz1	1,1,izlude,200,56
airplane_01,243,73	warp	airplanewarp#iz2	1,1,izlude,200,56
airplane_01,243,29	warp	airplanewarp#ra1	1,1,ra_fild12,292,204
airplane_01,243,73	warp	airplanewarp#ra2	1,1,ra_fild12,292,204

airplane_01,240,64,5	script	�o��	857,{}
airplane_01,247,64,5	script	�o��	857,{}
airplane_01,240,40,0	script	�o��	857,{}
airplane_01,247,40,0	script	�o��	857,{}

airplane_01,247,54,3	script	��s�D�D��#AirEvent	873,{
	mes "[�y�����b�N]";
	mes "�����A���̔�s�D�̑D���y�����b�N���B";
	mes "���̓O���������Ή��ŖZ��������A";
	mes "��ɂ��Ă���Ȃ����I";
	close;
OnInit:
	hideonnpc;
	end;
}

airplane_01,249,50,0	script	Effect#AirEvent0	139,{}
airplane_01,239,62,0	script	Effect#AirEvent1	139,{}
airplane_01,244,55,0	script	Effect#AirEvent2	139,{}
airplane_01,239,50,0	script	Effect#AirEvent3	139,{}
airplane_01,245,59,0	script	Effect#AirEvent4	139,{}
airplane_01,245,48,0	script	Effect#AirEvent5	139,{}
airplane_01,235,39,0	script	Effect#AirEvent6	139,{}
airplane_01,252,41,0	script	Effect#AirEvent7	139,{}
airplane_01,252,63,0	script	Effect#AirEvent8	139,{}
airplane_01,234,65,0	script	Effect#AirEvent9	139,{}
airplane_01,227,67,0	script	Effect#AirEvent10	139,{}

//============================================================
// �D���{��
//------------------------------------------------------------
-	script	AirApple	-1,{
	mes "[" +strnpcinfo(2)+ "]";
	mes "��������Ⴂ�܂��`�B";
	mes "���������`�A�Á`�������S��";
	mes "�������ł����`�B";
	mes "�����S�W���[�X�����܂���`�B";
	next;
	if(strnpcinfo(2) == "�t���c")	//�t���c�̏ꍇ�A�I��������
		set .@word$,"���̂����Ƀ����S���肪�H";
	switch(select("�����S�𔃂�","�����S�W���[�X�����",.@word$,"������")) {
	case 1:
		mes "[" +strnpcinfo(2)+ "]";
		mes "�����S��1�A15zeny�ł��B";
		mes "1�x��500�܂Ŕ����܂��B";
		mes "����ς��߂����ĕ���";
		mes "0����͂��Ă��������ˁB";
		mes "���~�����ł����H";
		next;
		while(1) {
			input .@num;
			if(.@num>500 || .@num<0) {
				mes "[" +strnpcinfo(2)+ "]";
				mes "��x�ɔ�����̂́A500�܂łł���B";
				next;
				continue;
			}
			break;	//while��������
		}
		if(.@num==0)
			break;	//switch��������
		set .@price,.@num*15;
		mes "[" +strnpcinfo(2)+ "]";
		mes "�����S^FF0000"+.@num+"��^000000�ŁA";
		mes "���z��^FF0000"+.@price+"zeny^000000�ł��ˁB";
		mes "�����܂����H";
		next;
		if(select("�͂�","������")==2)
			break;	//�u�������v�Ȃ�switch��������
		if(Zeny<.@price) {
			mes "[" +strnpcinfo(2)+ "]";
			mes "����A����������Ȃ��悤�ł���B";
			mes "����������������Ǝ����Ă��邩�A";
			mes "�w�����郊���S�̐���";
			mes "���炵�Ă��������ˁ`�B";
			close;
		}
		if(checkweight(512,.@num)==0) {
			mes "[" +strnpcinfo(2)+ "]";
			mes "���炠��A���ꂶ�Ⴀ�ו���������";
			mes "�����S�𔃂��Ă����Ă܂����B";
			mes "�ו��A���炵�Ă�������";
			mes "�����Ǝv���܂���B";
			close;
		}
		set Zeny,Zeny-.@price;
		getitem 512,.@num;
		mes "[" +strnpcinfo(2)+ "]";
		mes "���x�A���肪�Ƃ��������܂����`�I";
		mes "�����S���K�v�ɂȂ�����";
		mes "���ł����Ă��������ˁB";
		close;
	case 2:
		mes "[" +strnpcinfo(2)+ "]";
		mes "�����S�W���[�X��";
		mes "^FF0000�����S3�A�󂫃r��1��^000000��";
		mes "���܂��B";
		mes "�����S�W���[�X�����܂����H";
		next;
		if(select("�͂�","������")==2)
			break;	//switch��������
		if(countitem(512) < 3 || countitem(713) < 1) {
			mes "[" +strnpcinfo(2)+ "]";
			mes "����A�ޗ�������Ȃ��݂����ł��ˁB";
			mes "�����ł����A^FF0000�����S3�A";
			mes "�󂫃r��1��^000000�ł���B";
			mes "�ޗ������������A";
			mes "�܂����炵�Ă��������ˁB";
			close;
		}
		mes "[" +strnpcinfo(2)+ "]";
		mes "�͂��A������Ƒ҂��ĂĂ��������ˁB";
		next;
		mes "�T�N�A�T�N�A�g���g���c�c";
		mes "�M���I�`���A�O�H���O�H���A";
		mes "�M���I�`�`�`��!!";
		next;
		delitem 512,3;
		delitem 713,1;
		getitem 531,1;
		mes "[" +strnpcinfo(2)+ "]";
		mes "�͂��A�V�N�ȃ����S�W���[�X�ł��B";
		mes "���x�A���肪�Ƃ��������܂����`�I";
		mes "�����S�W���[�X���K�v�ɂȂ�����";
		mes "���ł����Ă��������ˁB";
		close;
	case 3:
		mes "[�t���c]";
		mes "���͎��A�ȑO�͓��X�̐H�ו��ł���";
		mes "�l���������Đ������Ă��܂����B";
		mes "����Ȃ�����A�؂̉��ł�������";
		mes "�����Ă�����A���̓��ɉ�����";
		mes "�h�����ė����Ă��܂��āc�c";
		next;
		mes "[�t���c]";
		mes "�т����肵�ċN���āA�ӂ�����񂷂�";
		mes "�����S���]�����Ă��܂����B";
		mes "���A�����S�̖؂̉���";
		mes "�����Ă�����ł��ˁB";
		next;
		mes "[�t���c]";
		mes "���傤�ǂ������󂢂Ă��̂ŁA";
		mes "���̃����S��H�ׂ邱�Ƃɂ��܂����B";
		mes "����ƁA��s�D�̂��������";
		mes "�����Ă���`����";
		mes "�}�ɌĂ΂ꂽ��ł���B";
		next;
		mes "[�t���c]";
		mes "����ŁA���΂炭��s�D��";
		mes "����`�������܂����B";
		mes "���̌�ɁA�����S��q����";
		mes "�T�C�R���Q�[�������Ă���";
		mes "���o����ɋC��������ł��B";
		next;
		mes "[�t���c]";
		mes "�ދ����������A���傤��";
		mes "�����S�������Ă�������A";
		mes "���̃Q�[���ŗV��ł݂܂����B";
		mes "����������A�^���ǂ������̂�";
		mes "1�����������S��2�A";
		mes "2��4�ɂȂ��Ă����c�c";
		next;
		mes "[�t���c]";
		mes "�����������Ă��邤���ɁA";
		mes "���Ə������ł��邭�炢��";
		mes "�����S���W�܂����Ⴂ�܂����I";
		mes "�M�����Ȃ��o�����ł����ǁA";
		mes "�����S1�����̐l����ς�����ł��I";
		next;
		mes "[�t���c]";
		mes "�b�������Ȃ����Ⴂ�܂����ˁB";
		mes "�����S�͌��N�ɂ����e�ɂ������ł���B";
		mes "����ǂ��ł����H";
		close;
	case 4:
		break;
	}
	mes "[" +strnpcinfo(2)+ "]";
	mes "�悩�����玟�͔����Ă��������ˁB";
	mes "�ł́A�����C�Ł`�B";
	close;
}
airplane,50,66,5	duplicate(AirApple)	�����S���l#�t���c	86
airplane_01,50,66,5	duplicate(AirApple)	�����S���l#�����c	86

-	script	AirDice	-1,{
	if(strnpcinfo(1) == "�P�[�W") {
		switch(HU_7QUE) {
		case 3:
			mes "[�P�[�W]";
			mes "����ɂ��́B";
			mes "���̖��O�̓P�[�W�B";
			mes "������Ƒދ����Ă�́B";
			mes "�ɂԂ��ɁA���ƃT�N���ƌy��";
			mes "�T�C�R���Q�[���ł����Ȃ��H";
			next;
			menu "�e�B�I���Ƃ����l��m��Ȃ�������",-;
			mes "[�P�[�W]";
			mes "�e�B�I���H";
			mes "�ǂ����ŕ������悤�ȁc�c";
			next;
			mes "[�P�[�W]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c";
			mes "�c�c";
			next;
			mes "[�P�[�W]";
			mes "�A�A�b�I�@�e�B�I��!!";
			next;
			mes "-�}�Ɏv���o�����悤��";
			mes "�ޏ��͑傫�������o����-";
			mes "-�������Ŏ��͐H�ׂĂ�����񂲂�";
			mes "���Ƃ��Ă��܂���-";
			next;
			mes "[�P�[�W]";
			mes "�A�n�n�b�B���߂�Ȃ����B";
			mes "�}�ɑ吺���o���Ă��܂��āB";
			mes "����܂�����������O����������";
			mes "�Ȃ��Ȃ��v���o���Ȃ������́B";
			next;
			mes "[�P�[�W]";
			mes "�����ȑO�}�E�H���O�t����";
			mes "�Q�[����������Ă������A";
			mes "�ׂ�ɏZ��ł����N��������B";
			mes "�����ǂ��ĐF��Ȍ�����";
			mes "���Ă������Ƃ��o���Ă��B";
			next;
			mes "[�P�[�W]";
			mes "���������΁A�}�E�H���O�t���̉���";
			mes "�ꏏ�ɃQ�[�����w�񂾃��X������";
			mes "�e�B�I���̓��u���u��������ˁB";
			mes "��l�̊֌W�͂ǂ��Ȃ����̂�����B";
			next;
			mes "-���͔ޏ��Ƀ��X�����ƃe�B�I����";
			mes "���񂵂Ă��āA�e�B�I���̓��X������";
			mes "�a�C���������߂ɔ�s�D�ɏ����";
			mes "�ǂ����֍s���Ă��܂�������b����-";
			next;
			mes "[�P�[�W]";
			mes "���c�c����ȁc�c";
			mes "���̃��X����������ȏd���a�C�Ɂc�c";
			mes "�c�c�����c�c�c�c";
			next;
			mes "-�}�Șb�ɏՌ����󂯂��P�[�W��";
			mes "�œ_���������܂܏����łڂ��ڂ���";
			mes "�Ԃ₢�Ă���-";
			mes "-���΂炭����ƁA�n�b��";
			mes "���ɋC�Â��ĉ�ɕԂ���-";
			next;
			mes "[�P�[�W]";
			mes "���߂�Ȃ����c�c";
			mes "�������ɗ����������ǁA";
			mes "�Ō�ɉ�����̂͐��N�O�B";
			mes "�ǂ��ɍs�����̂��킩��Ȃ���B";
			next;
			mes "[�P�[�W]";
			mes "�������@�́c�c";
			next;
			mes "[�P�[�W]";
			mes "�c�c���I";
			mes "�D���Ȃ�m���Ă��邩���B";
			mes "����҃��X�g������͂���B";
			next;
			mes "[�P�[�W]";
			mes "�ł��A����҃��X�g��";
			mes "��ʐl�Ɍ��J���Ȃ��̂������c�c";
			next;
			mes "[�P�[�W]";
			mes "����ł������b����";
			mes "�D���͂킩���Ă����͂��B";
			mes "�D���ɗ���ł݂āI";
			next;
			mes "[�P�[�W]";
			mes "���ƁA���X�����ɉ������A";
			mes "���͂��Ȃ��̍K��������Ă�";
			mes "���ē`���ė~�����́B";
			mes "���肢�B";
			next;
			mes "-�؎��Ȕޏ��̊肢���A";
			mes "�K���`����Ɩ񑩂���-";
			set HU_7QUE,4;
			close;
		case 4:
			mes "[�P�[�W]";
			mes "�e�B�I�����ǂ��ɍs��������";
			mes "�D���ɕ����Ă݂āB";
			mes "�����b���΂킩���Ă����͂���B";
			close;
		}
		switch(AIR_2QUE) {
		case 2:
			mes "[�P�[�W]";
			mes "����ɂ��́B";
			mes "���̖��O�̓P�[�W�B";
			mes "������Ƒދ����Ă�́B";
			mes "�ɂԂ��ɁA���ƃT�N���ƌy��";
			mes "�T�C�R���Q�[���ł����Ȃ��H";
			next;
			menu "�w�C�������ɗ��܂ꂽ�莆��n���B",-;
			mes "[�P�[�W]";
			mes "��H�@���c�c";
			mes "�w�C�������ɗ��܂ꂽ�̂ˁB";
			mes "���̎q������c�c";
			mes "����ꂽ���Ƃ�������";
			mes "���Ă�΂����̂Ɂc�c";
			mes "���q�l�ɖ��f���������������ˁB";
			next;
			mes "[�P�[�W]";
			mes "���A���������B";
			mes "����A���肪�Ƃ��B";
			mes "���͂�����Ǝ莆��ǂ�ł邩��A";
			mes "�����������炢�ł������ĂˁB";
			set AIR_2QUE,3;
			close;
		case 3:
			mes "[�P�[�W]";
			mes "����ɂ��́B";
			mes "�莆�A���肪�ƂˁB";
			mes "�����m�肽�����Ƃ���������";
			mes "�����Ȃ��ǂ����B";
			while(.@tolk < 0x7) {
				next;
				switch(select("�w�C�������Ǝo��Ȃ̂�����","�莆�𑗂����}�E�H���O�ɂ��ĕ���","��s�D���ǂ��v���Ă���̂�����")) {
				case 1:
					mes "[�P�[�W]";
					mes "�w�C�������ƁH";
					mes "�������A�o�킶��Ȃ���B";
					mes "���̕���̂����̑��q�A";
					mes "���Ə]�o����Ă��Ƃ��ȁB";
					next;
					mes "[�P�[�W]";
					mes "20�N�O�A���̂�������";
					mes "�A�C���x�t�ŋN����";
					mes "�z�R�������̂Ŏ���ňȗ��c�c";
					mes "��l�ɂȂ�������";
					mes "�W���m�[�ɂ���";
					mes "����̂����̉Ƃň�����́B";
					next;
					mes "[�P�[�W]";
					mes "�������邤���ɋ��R�A";
					mes "�T�C�R���Q�[����";
					mes "�l�X���y���܂��Ă����̂�";
					mes "�g���b�N�D���Ɍ����܂��";
					mes "���̔�s�D�ɏ�鎖�ɂȂ����́B";
					next;
					mes "[�P�[�W]";
					mes "�����������牽�������̂�";
					mes "�D���������w�C��������";
					mes "������s�D�œ������ƂɂȂ���";
					mes "�ƕ����ƁA���ł����邩��";
					mes "��s�D�ňꏏ�ɓ������Ă���";
					mes "�g���b�N�D���ɂ����񂾂̂�B";
					next;
					mes "[�P�[�W]";
					mes "����ŁA���ǂ��̎q��";
					mes "�ꏏ�ɂ�����ł��B";
					mes "��x�����o���ƕ����Ȃ��q������B";
					mes "�t�t�b�B";
					next;
					set .@tolk,.@tolk|0x1;
					break;
				case 2:
					mes "[�P�[�W]";
					mes "���A�}�E�H���O�搶�ˁB";
					mes "�}�E�H���O�搶�͖ʔ����Q�[����";
					mes "���������邱�ƂŗL���Ȑl��B";
					mes "�����āA���̉��t�ł�����́B";
					next;
					mes "[�P�[�W]";
					mes "��������̂����̉Ƃɂ������A";
					mes "������A";
					mes "���Ƀ}�E�H���O�搶��������B";
					next;
					mes "[�P�[�W]";
					mes "��������܂Ƃ��ɂł��Ȃ��������A";
					mes "������̎��ŗ�������łāc�c";
					mes "�}�E�H���O�搶���������Ƃ𕷂��Ă�";
					mes "�S�R�֐S���Ȃ�������B";
					next;
					mes "[�P�[�W]";
					mes "����Ȃ̂Ɂc�c";
					mes "���R�ɂ����ǁA�搶�ɉ�����́B";
					mes "�搶�́A���̎��܂Ŏ����Y��Ă���";
					mes "�΂������߂��Ă��ꂽ��B";
					next;
					mes "[�P�[�W]";
					mes "�}�E�H���O�搶�Əo����āA";
					mes "���̐l���ɂ��΂��ƍK�������邱�Ƃ�";
					mes "�킩�����̂�B";
					next;
					mes "[�P�[�W]";
					mes "���̌�c�c";
					mes "���͎����������΂��ƍK����";
					mes "�ȑO�̎��̂悤�ɗ�������ł���";
					mes "�l�����ɓ`���悤�Ǝv���āA";
					mes "�搶�̒�q�ɂȂ����́B";
					next;
					mes "[�P�[�W]";
					mes "�搶�ɂ�";
					mes "�F�X�ȃQ�[���������Ă��������c�c";
					mes "�}�E�H���O�搶�Ƃ̉���";
					mes "����ȕ��Ɏn�܂����̂�B";
					next;
					set .@tolk,.@tolk|0x2;
					break;
				case 3:
					mes "[�P�[�W]";
					mes "�傫���āc�c��������B";
					mes "����ȑ傫�ȕ��̂�";
					mes "����щ���̂�";
					mes "�{���ɕs�v�c�Łc�c";
					mes "�_��I�Ɋ������B";
					next;
					mes "[�P�[�W]";
					mes "�����֗���O����A";
					mes "�������Ő��E�𒭂߂Ȃ���";
					mes "�D���Ȃ��Ƃ����������āA";
					mes "�����l���Ă���B";
					next;
					mes "[�P�[�W]";
					mes "���������炠����A";
					mes "���ƃT�C�R���Q�[��������";
					mes "�g���b�N�D�����A��s�D��";
					mes "�ꏏ�ɓ������ƌ����Ă��ꂽ�́B";
					mes "���͂����Ɂu�͂��v���ē�������B";
					next;
					set .@tolk,.@tolk|0x4;
					break;
				}
				if(.@tolk < 0x7) {
					mes "[�P�[�W]";
					mes "���ɒm�肽����������Ȃ�ǂ����B";
				}
			}
			mes "[�P�[�W]";
			mes "�܂��A�w�C��������";
			mes "���q�l�ɖ��f��������悤��������A";
			mes "�͂�����ƒf���ĂˁB";
			mes "���̎q�A�����Â����Ⴄ����B";
			mes "�t�t�b�B";
			next;
			mes "[�P�[�W]";
			mes "���낻��܂��d����";
			mes "�n�߂Ȃ�����B";
			mes "���ꂶ��A�y����������I";
			set AIR_2QUE,4;
			close;
		case 8:
			mes "[�P�[�W]";
			mes "����ɂ��́B";
			mes strcharinfo(0)+ "����B";
			mes "��s�D�ł悭���ڂɂ�����܂��ˁB";
			mes "�t�t�b�B";
			mes "���������������Ƃł�����́H";
			next;
			menu "���������Ă���l���N������",-;
			mes "[�P�[�W]";
			mes "�����A���̐l�H";
			mes "�ǂ����A�C���u���b�N�ɂ���";
			mes "�������̏�������݂�����B";
			next;
			mes "[�P�[�W]";
			mes "��������������ł�";
			mes "���Ƀ����S���D����̂�";
			mes "�D�����Č����Ă邯�ǁA";
			mes "�����S��������";
			mes "����ς藎������ł��ˁB";
			next;
			mes "[�P�[�W]";
			mes "���̑O�A���ɂ��郊���S���l���񂩂�";
			mes "�����S���R������";
			mes "�j�Y��������O�ɂȂ��Ă���B";
			next;
			mes "[�P�[�W]";
			mes "�ł��A����Ȃ�������̂�������";
			mes "���̎d�����O���";
			mes "�����ƍD���ɂȂꂽ�C�������B";
			mes "���肪�������q���񂩂���ˁB";
			next;
			mes "[�P�[�W]";
			mes "����ɂ��Ă��A";
			mes "�������Ă���݂����ˁB";
			mes "�������񂾂��A";
			mes "�d������ςȂ̂�����H";
			mes "�����m���Ă�̂͂��ꂮ�炢��B";
			next;
			mes "�i���[��c�c";
			mes "�A�C���u���b�N�̌��������c�c";
			mes "��ʐl�͓���Ȃ���������";
			mes "�ǂ����������ȁc�c�j";
			next;
			mes "�i���̐l��";
			mes "���~���̐S����m���Ă���Ȃ�c�c";
			mes "���̌������ɉ������c�c�j";
			next;
			mes "�i�悵�I";
			mes "�A�C���u���b�N�̌�������";
			mes "�s���Ă݂悤�B�j";
			set AIR_2QUE,9;
			close;
		}
	}
	mes "[" +strnpcinfo(1)+ "]";
	mes "����ɂ��́B";
	mes "���̖��O��" +strnpcinfo(1)+ "�B";
	mes "������Ƒދ����Ă�́B";
	mes "�ɂԂ��ɁA���ƃT�N���ƌy��";
	mes "�T�C�R���Q�[���ł����Ȃ��H";
	next;
	switch (select("����","���[����������","���Ȃ�")) {
	case 1:
		mes "[" +strnpcinfo(1)+ "]";
		mes "�T�C�R���Q�[��������ɂ́A";
		mes "�����S���K�v��B";
		mes "�����S�A���q����H";
		mes "�ő�50�܂œq�������B";
		mes "�~�߂�񂾂�����A0���ē���ĂˁB";
		while(1) {
			next;
			input .@apple;
			if(.@apple<=0) {
				mes "[" +strnpcinfo(1)+ "]";
				mes "�ދ���������A��ł܂����ĂˁB";
				mes "���Ⴀ�ˁI";
				close;
			}
			if(.@apple>50) {
				mes "[" +strnpcinfo(1)+ "]";
				mes "�ő��50�܂ł�B";
				mes "���͊ԈႦ�Ȃ��悤�����ĂˁB";
				continue;
			}
			mes "[" +strnpcinfo(1)+ "]";
			mes "�����S^FF0000" +.@apple+ "��^000000��";
			mes "�ԈႢ�Ȃ��H";
			next;
			if(select("�͂�","������")==2) {
				mes "[" +strnpcinfo(1)+ "]";
				mes "���x�͊ԈႢ�Ȃ����͂��ĂˁB";
				continue;
			}
			if(countitem(512) < .@apple) {
				mes "[" +strnpcinfo(1)+ "]";
				mes "�����S������Ȃ��݂�����B";
				mes "���q����H";
				continue;
			}
			break;	//while���𔲂���
		}
		delitem 512,.@apple;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�́[���B";
		mes "�ł́A�Q�[���̎n�܂�n�܂�B";
		mes "������ɓ]������ˁB";
		next;
		mes "-�R���`���A�R���R��-";
		next;
		//[0]:���v,[1]:1��,[2]:2��,[3]:3��
		setarray .@enemy[1],rand(1,6),rand(1,6);
		setarray .@mine[1],rand(1,6),rand(1,6);
		set .@enemy[0],.@enemy[1]+.@enemy[2];
		set .@mine[0],.@mine[1]+.@mine[2];
		mes "[" +strnpcinfo(1)+ "]";
		mes "���̎��^0000FF" +.@enemy[1]+ "^000000��^0000FF" +.@enemy[2]+ "^000000�B";
		mes "���v��^0000FF" +.@enemy+ "^000000�ˁB";
		mes "���x��^FF0000" +strcharinfo(0)+ "^000000�����";
		mes "�Ԃ�B";
		next;
		menu "�T�C�R����]����",-;
		mes "-�R���`���A�R���R��-";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "^FF0000" +strcharinfo(0)+ "^000000����̎��";
		mes "^FF0000" +.@mine[1]+ "^000000��^FF0000" +.@mine[2]+ "^000000�ˁB";
		mes "���v��^FF0000" +.@mine+ "^000000�I";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "����^0000FF" +.@enemy+ "^000000�ŁA";
		mes "^FF0000" +strcharinfo(0)+ "^000000����^FF0000" +.@mine+ "^000000�ˁB";
		if(.@mine < .@enemy)  {	//�����Ă�ꍇ
			mes "����������[�h�I";
			mes "�ǂ��A�T�C�R��������1�]�����H";
		}
		if(.@mine > .@enemy) {	//�����Ă�ꍇ
			mes "^FF0000" +strcharinfo(0)+ "^000000����";
			mes "������[�h�I";
			mes "�ǂ��A�T�C�R��������1�]�����H";
		}
		if(.@mine == .@enemy) {	//���_�̏ꍇ
			mes "���_������ǁA�ǂ�����H";
			mes "�T�C�R��������1�]�����H";
		}
		next;
		if(select("����","������")==1) {
			mes "-�R�������A�R�����R�����A�g���I-";
			next;
			set .@mine[3],rand(1,6);
			set .@mine[0],.@mine[0]+.@mine[3];
			mes "[" +strnpcinfo(1)+ "]";
			mes "^FF0000" +strcharinfo(0)+ "^000000����̎��";
			mes "^FF0000" +.@mine[3]+ "^000000������";
			mes "���v��^FF0000" +.@mine+ "^000000�ˁB";
			if(.@mine > 12) {	//12�𒴂����ꍇ
				mes "���v��12�𒴂������������";
				mes "�������̕����`�I";
				mes "�c�O�������ˁB";
				close;
			}
			if(.@mine < .@enemy) {	//�����Ă�ꍇ
				mes "���̎�̕����܂��傫����B�c�O�I";
				mes "�������̕����`�I";
				close;
			}
			if(.@mine == .@enemy) {	//���_�̏ꍇ
				mes "���_���c�c�������ȗ\�������邩��";
				mes "����͈��������ɂ��悤���B";
				mes "�͂��A�ŏ��ɓq���������S��Ԃ���ˁB";
				getitem 512,.@apple;
				next;
				mes "[" +strnpcinfo(1)+ "]";
				mes "���͕����Ȃ����`�B";
				close;
			}
			if(.@mine > .@enemy) {	//�����Ă�ꍇ
				mes "���͎��̔Ԃ�B";
			}
		}
		else {
			mes "[" +strnpcinfo(1)+ "]";
			if(.@mine < .@enemy) {	//�����Ă�ꍇ
				mes "���[�A���߂�́H";
				mes "�]���������]�����Ă݂�΂����̂ɁB";
				mes "�c�c�Ȃ�A���̏����ɂȂ��ˁB";
				mes "�܂��V�тɂ����łˁB";
				mes "���Ⴀ�ˁ`�B";
				close;
			}
			if(.@mine > .@enemy) {	//�����Ă�ꍇ
				mes "�����Ă�񂾂���A";
				mes "�������邱�ƂȂ�����ˁB";
			}
			if(.@mine == .@enemy) {	//���_�̏ꍇ
				mes "����A�]�����Ȃ��́H";
			}
			mes "���Ⴀ�A���͓]������ˁB";
		}
		next;
		mes "-�R�����A�R���������I-";
		next;
		set .@enemy[3],rand(1,6);
		set .@enemy[0],.@enemy[0]+.@enemy[3];
		mes "[" +strnpcinfo(1)+ "]";
		mes "���̎��^0000FF" +.@enemy[3]+ "^000000������A���v��^0000FF" +.@enemy+ "^000000�ˁB";
		if(.@enemy > 12) {	//12�𒴂����ꍇ
			mes "���v��12�𒴂������������";
			mes "���̕������`�I";
			mes "�͂��A�����S��B";
			mes "�悩������A�܂��������悤�ˁB";
			getitem 512,.@apple*2;
			close;
		}
		if(.@mine > .@enemy) {	//�������ꍇ
			mes "���v��^FF0000" +.@mine+ "^000000��";
			mes "^FF0000" +strcharinfo(0)+ "^000000����̏����I";
			mes "�͂��A�����S��B";
			mes "�悩������A�܂��������悤�ˁB";
			getitem 512,.@apple*2;
			close;
		}
		if(.@mine < .@enemy) {	//�������ꍇ
			mes "���v��^FF0000" +.@mine+ "^000000��";
			mes "^FF0000" +strcharinfo(0)+ "^000000����̕����I";
			mes "�c�O�������ˁB";
			close;
		}
		if(.@mine == .@enemy) {	//���_�̏ꍇ
			mes "����́A���������ˁI";
			mes "^FF0000" +strcharinfo(0)+ "^000000����";
			mes "�ŏ��ɓq���������S��Ԃ���B";
			mes "�悩������A�܂��������悤�ˁB";
			getitem 512,.@apple;
			close;
		}
	case 2:
		mes "[" +strnpcinfo(1)+ "]";
		mes "���Ⴀ�A�T�C�R���Q�[���̃��[����";
		mes "���������ˁB�ƂĂ��ȒP��B";
		mes "�܂��A�q���镪������";
		mes "�����S�����ɗa���ĂˁB";
		mes "�����S��50�܂œq�������B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "���ɁA�T�C�R����2�]�����́B";
		mes "����ŁA�T�C�R���̖ڂ�";
		mes "���v���������������I";
		mes "�ł��A���ꂶ�Ⴀ�ȒP�������ˁB";
		mes "������A�T�C�R��������1��";
		mes "�]�����`�����X������̂�B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�T�C�R��������1�A�]�������ǂ�����";
		mes "�{�l�̎��R�B�A���I";
		mes "���̒i�K�ŃT�C�R���̖ڂ̍��v��";
		mes "12�𒴂����������A������B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "3�ڂ̃T�C�R����]�������ꍇ�A";
		mes "���v��12�𒴂����������A";
		mes "���̎��_�ŕ��������B�����H";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�Q�[���ŏ��������́A�����Ƒ����";
		mes "�q���������S��S�����炦��́B";
		mes "�ˁA�ȒP�ł���B";
		close;
	case 3:
		mes "[" +strnpcinfo(1)+ "]";
		mes "����Ă݂����Ȃ�����";
		mes "���ł��������ĂˁB";
		mes "���Ⴀ�ˁ`�B";
		close;
	}
}

airplane,33,69,4	duplicate(AirDice)	�P�[�W#Air	73
airplane_01,33,69,4	duplicate(AirDice)	�N�����X#Air	74

//callfunc "Typing#Einbroch","Name";
//  �Ăяo������NPC���O������
function	script	Typing#Air	{
	set .@t,gettimetick(0);
	switch(rand(7)) {	//�o�蕶��z��Ɋi�[����
	case 0:
		setarray .@term$,"^39BDBD","�X�������������̂����A","^39BDBD","�����X���������̂���","",
				"^39BDBD","������炭���̎R�̍��ԁA","�炭������U�������"; break;
	case 1:
		setarray .@term$,"^39BDBD","�}���p�[�v���I�[�K�g�D�[�X","^39BDBD","�L���b�g�i�C���e�C��","",
				"^840084","����峃G�h�K�����","�h�b�y���Q���K�[�~�X�g���X"; break;
	case 2:
		setarray .@term$,"^39BDBD","�󂫃r���J�^�V�����̔�","^39BDBD","�ł������[���s�[�����S","",
				"^FF1094","�ԃ|�[�V�������|�[�V����","���|�[�V�����|�[�V����"; break;
	case 3:
		setarray .@term$,"^39BDBD","�͂Ȃ̂����","^39BDBD","����ɂ����","�����Â��",
				"^39BDBD","�킪�݂�ɂӂ�","�Ȃ��߂����܂�"; break;
	case 4:
		setarray .@term$,"^0000FF","abcdefghijklmnopqrstuvwxyz","^39BDBD","1234567890","",
				"^FF1094","LoadKnightAssassin","PriestProfessorSniper"; break;
	case 5:
		setarray .@term$,"^39BDBD","�O���f�B�E�X�N���C���A","^39BDBD","�p���`�U���o�g���A�b�N�X","",
				"^FF1094","����L�E�T�M�̃w�A�o���h","�s�G���̕@�傫�ȃ��{��"; break;
	case 6:
		setarray .@term$,"^39BDBD","�l��m��҂́A�q�Ȃ�B","^39BDBD","����m��҂́A���Ȃ�B","",
				"^FF1094","�l�ɏ��҂́A�͂���B","���珟�҂́A�����B"; break;
	}
	mes "[" +getarg(0)+ "]";
	mes .@term$[0] + .@term$[1];
	mes .@term$[2] + .@term$[3];
	mes .@term$[4] + "^000000";
	next;
	//3���o�߂��Ă���close����
	if(getarg(0) == "�Z�L�����e�B�V�X�e��" && (gettimetick(0)-.@t) >= 180000)
		close;
	input .@typing1$;
	mes "[" +getarg(0)+ "]";
	mes .@term$[5] + .@term$[6];
	mes .@term$[7] + "^000000";
	next;
	if(getarg(0) == "�Z�L�����e�B�V�X�e��" && (gettimetick(0)-.@t) >= 180000)
		close;
	input .@typing2$;
	if(.@typing1$ != .@term$[1]+.@term$[3]+.@term$[4] || .@typing2$ != .@term$[6]+.@term$[7]) {
		if(getarg(0) == "�Z�L�����e�B�V�X�e��") {
			mes "[�Z�L�����e�B�V�X�e��]";
			mes "�F�؂Ɏ��s���܂����B";
		}
		else {
			mes "[" +getarg(0)+ "]";
			mes "���m�ɓ��͂��Ă��������B";
		}
		close;
	}
	//�J�n���ԂƏI�����Ԃ̍�����^�C�s���O�b���v�Z�ims�ȉ��؎̂āj
	return (gettimetick(0)-.@t)/1000;
}

-	script	AirTyping	-1,{
	mes "[" +strnpcinfo(1)+ "]";
	mes "����ɂ��́I";
	mes "^FF0000�^�C�s���O���O�i���N^000000��";
	mes "�i�s�A" +strnpcinfo(1)+ "�ł��I";
	next;
	switch (select("^FF0000�^�C�s���O���O�i���N^000000�ɒ��킷��","^FF0000�^�C�s���O���O�i���N^000000�̐����𕷂�","�ō��L�^������","������")) {
	case 1:
		mes "[" +strnpcinfo(1)+ "]";
		mes "^FF0000�^�C�s���O���O�i���N^000000��";
		mes "���킷��̂ł��ˁI";
		mes "�ł́A���ꂩ��񎦂��镶�͂�";
		mes "�o���邾�������A���m��";
		mes "���͂��Ă��������B";
		mes "����ł͎n�߂܂��I";
		next;
		set .@time,callfunc("Typing#Air",strnpcinfo(1));	//�^�C�s���O�^�C�����擾
		set .@score,(1450/.@time)*6;
		if(.@time < 0 || .@score < 0)
			set .@score,0;
		mes "[" +strnpcinfo(1)+ "]";
		mes "^FF0000" +.@time+ "�b^000000�Ő��m�ɓ��͊����I";
		mes "�X�R�A��" +.@score+ "�Əo�܂����I";
		next;
		if(.@score >= 1300) {
			mes "[" +strnpcinfo(1)+ "]";
			mes "�������A�l�Ԃ��o���鑬�x�ł�";
			mes "����܂���ˁB";
			mes "�����Y���ł����܂������H";
			mes "���͐��X���X�ƒ���ł��������B";
			close;
		}
		if(.@score >= $TypingScore) {	//���b�Z�[�W���擾
			mes "[" +strnpcinfo(1)+ "]";
			mes "�O��̍ō��X�R�A�́A";
			mes "^0000FF" +$TypingName$+ "�l^000000��";
			mes "^0000FF" +$TypingScore+ "^000000�ł������A";
			mes "^0000FF" +strcharinfo(0)+ "�l^000000�̋L�^��";
			mes "�ō��L�^���X�V����܂����I";
			mes "���߂łƂ��������܂��I";
			set $TypingScore,.@score;
			set $TypingName$,strcharinfo(0);
		}
		else {
			mes "[" +strnpcinfo(1)+ "]";
			mes "���݂̍ō��X�R�A�́A";
			mes "^0000FF" +$TypingName$+ "�l^000000��";
			mes "^0000FF" +$TypingScore+ "^000000�ł��B";
			mes "���͐���A�ō��L�^�X�V��";
			mes "���킵�Ă��������I";
		}
		close;
	case 2:
		mes "[" +strnpcinfo(1)+ "]";
		mes "^FF0000�^�C�s���O���O�i���N^000000��";
		mes "�����񎦂��镶�͂�f�����A";
		mes "���m�ɓ��͂���Q�[���ł��B";
		next;
		mes "[" +strnpcinfo(1)+ "]";
		mes "�X�R�A����ԍ������̋L�^�́A";
		mes "�a������ƂȂ�܂��B";
		mes "�^�C�s���O�Ɏ��M�̂������";
		mes "���񒧐킵�Ă��������I";
		close;
	case 3:
		mes "[" +strnpcinfo(1)+ "]";
		mes "���݂̍ō��X�R�A�́A";
		mes "^0000FF" +$TypingName$+ "�l^000000��";
		mes "^0000FF" +$TypingScore+ "^000000�ł��B";
		close;
	case 4:
		mes "[" +strnpcinfo(1)+ "]";
		mes "^FF0000�^�C�s���O���O�i���N^000000��";
		mes "���킵�����Ȃ�����A";
		mes "���ł����Ă��������I";
		close;
	}
}

airplane,32,61,4	duplicate(AirTyping)	�W����#Air	51
airplane_01,32,61,4	duplicate(AirTyping)	�j���X#Air	49

//============================================================
// ���[���@�փN�G�X�gNPC
//- Registry -------------------------------------------------
// AIR_1QUE -> 0�`7
//------------------------------------------------------------
airplane_01,238,154,2	script	��s�D�D��#Air	873,{
	cutin "fly_felrock",2;
	mes "[�y�����b�N]";
	mes "�����A���̔�s�D�̑D���y�����b�N���B";
	mes "���ɉ����p���ł�����̂��ˁH";
	mes "����H";
	next;
	switch(AIR_1QUE) {
	default: set .@word$,"��s�D�͂ǂ�����ē����Ă�̂ł����H"; break;
	case 4: set .@word$,"�g���b�N�D���̎莆��n��"; break;
	case 5:
	case 6: set .@word$,"�D�����莆��ǂݏI�����̂��A�m�F���Ă݂�"; break;
	}
	switch(select("���́A�g�i�J�C���D���Ȃ́H",.@word$,"��������܂���")) {
	case 1:
		mes "[�y�����b�N]";
		mes "�ȁc�c�g�i�J�C����?!";
		mes "���ꂾ����l�Ԃ̎�҂͑ʖڂ��ȁB";
		mes "��V���Ȃ��ĂȂ��I�@��V���I";
		mes "�ӂ��������ƌ����Ă�ƁA";
		mes "���ɓ������Ƃ���!!";
		next;
		mes "[�y�����b�N]";
		mes "���̈ꑰ�́A��X�A";
		mes "�M�������󂯌p���M�����B";
		mes "�N�B�l�Ԃǂ��Ƃ́A�i���Ⴄ�I";
		mes "���̋���Ȕ�s�D�̑D����";
		mes "�����󂯂邱�Ƃ����āA";
		mes "���Ղ������Ƃ���Ȃ��񂾁B";
		next;
		mes "[�y�����b�N]";
		mes "�܂��`�A���ɂƂ��āA";
		mes "��s�D�őS���E�𗷂��邱�Ƃ́A";
		mes "�y���݂ł�����";
		mes "�l���̖ړI�ł����邪�ȁB";
		close2;
		cutin "fly_felrock",255;
		end;
	case 2:
		break;
	case 3:
		mes "[�y�����b�N]";
		mes "������?!";
		mes "���͖Z�����񂾁I";
		mes "�p���Ȃ��Ȃ�b�����Ȃ��ł���I";
		close2;
		cutin "fly_felrock",255;
		end;
	}
	switch(AIR_1QUE) {
	case 0:
		mes "[�y�����b�N]";
		mes "��s�D���ǂ�����ē��������āH";
		mes "����Ȃ́A���������Ƃ����";
		mes "�f�l�ɂ͗����͂ł����B";
		set AIR_1QUE,1;
		break;
	case 1:
		mes "[�y�����b�N]";
		mes "�O�ɓ������₵�Ă����z���������c�c�B";
		if(BaseLevel < 60) {
			mes "�N�̂悤�Ȑl�Ԃ̂Ђ������";
			mes "�����邱�ƂȂǂȂ��I";
			break;
		}
		mes "��H�@�������c�c";
		mes "����͌N���������I";
		mes "����Ȃɒm�肽���̂��ˁH";
		next;
		if(select("�������A�����ł͂���܂��񂪁c�c","�͂��A�m�肽���ł�")==1) {
			mes "[�y�����b�N]";
			mes "�債�ċ������Ȃ����Ƃ�";
			mes "�܂����₵�āA";
			mes "���̋M�d�Ȏ��Ԃ�D���Ƃ́I";
			mes "����ȂɊO�ɕ���o���ꂽ���̂�?!";
			break;
		}
		mes "[�y�����b�N]";
		mes "�債�ċ������Ȃ����Ƃ�";
		mes "�܂����₵�āA";
		mes "���̋M�d�Ȏ��Ԃ�D���Ƃ́I";
		mes "����ȂɊO�ɕ���o���ꂽ���̂�?!";
		next;
		mes "[�y�����b�N]";
		mes "�������c�c";
		mes "����͖{���A�D���B������";
		mes "�m�炳��Ă���@�����������c�c�B";
		mes "�Ƃ͌����Ă��A��i�B��";
		mes "�����l���Ă邾�������c�c�B";
		mes "���傤�Ǘ��݂������Ƃ����邵�ȁc�c�B";
		next;
		mes "[�y�����b�N]";
		mes "�������ȁA���̗��݂������Ă��ꂽ��A";
		mes "�����Ă���Ă��������B";
		next;
		mes "[�y�����b�N]";
		mes "�ǂ����c�c";
		mes "�����������ł͂Ȃ����낤�H";
		mes "���̗��݂������Ă���邩�ˁH";
		next;
		if(select("�������܂�","�����󂯂܂�")==1) {
			mes "[�y�����b�N]";
			mes "�܂��A���������͂��Ȃ���B";
			mes "�����A�l�����ς������܂����Ă���B";
			break;
		}
		mes "[�y�����b�N]";
		mes "����Ȃ�b�͑����B";
		mes "�ł́A���ނ��Ƃɂ��悤�B";
		next;
		mes "[�y�����b�N]";
		mes "���ɂ́A���̂悤�ɔ�s�D�ɏ����";
		mes "�������Ă���킪����B";
		mes "�����c�c���ꂼ���s�D��";
		mes "����ė������Ă���ƁA";
		mes "�Ȃ��Ȃ�����Ƃ��ł��Ȃ��Ăȁc�c�B";
		mes "�A�����Ƃ���@���قƂ�ǂȂ��񂾂�B";
		next;
		mes "[�y�����b�N]";
		mes "�����ł��B";
		mes "�������������̎莆��";
		mes "�䂪��ɓ͂��A";
		mes "���̕Ԏ���������Ă��Ă���Ȃ����H";
		next;
		mes "-�y�����b�N����莆���󂯎����-";
		next;
		mes "[�y�����b�N]";
		mes "����ł͂�낵���ȁB";
		set AIR_1QUE,2;
		break;
	default:
		mes "[�y�����b�N]";
		mes "��s�D���ǂ�����ē��������āH";
		mes "�܂��A���̒킩��Ԏ���";
		mes "������Ă��ĂȂ�����H";
		mes "���̎莆��͂�����ŁA";
		mes "�Ԏ���������Ă����狳���Ă��B";
		break;
	case 4:
		mes "[�y�����b�N]";
		mes "�����I";
		mes "�{���ɕԎ���������Ă��Ă��ꂽ�̂��I";
		mes "���́A���܂���҂�";
		mes "���Ă��Ȃ������񂾂��c�c�B";
		mes "�莆��ǂނ���A";
		mes "������Ƒ҂��ĂĂ���B";
		set AIR_1QUE,5;
		break;
	case 5:
		mes "[�y�����b�N]";
		mes "�����ށc�c�n�n�n�b�I";
		mes "�����߁A���l���ł����悤���ȁB";
		mes "�����A�^�̒j�́A�^�̖��G�̓��́A";
		mes "���G�̃\���R�c���c�c�B";
		mes "����H�@���͉��������Ă�񂾁H";
		mes "�u�c�u�c�c�c�B";
		next;
		mes "-�܂��ǂݓr���̂悤�Ȃ̂ŁA";
		mes "���������҂Ƃ�-";
		set AIR_1QUE,6;
		break;
	case 6:
		mes "[�y�����b�N]";
		mes "�莆�͑S���ǂ񂾁B";
		mes "�����ɉ�����̂Ȃ番���邾�낤���A";
		mes "���Ƃ͑S���Ⴄ���i����H";
		mes "������A���������͂悭�P���J�����B";
		mes "�ł��A��l�ꏏ�Ȃ�";
		mes "�|�����̂Ȃ����������ȁc�c�B";
		next;
		mes "[�y�����b�N]";
		mes "�����A����Ȑ̘b�ł͂Ȃ��A";
		mes "�N���m�肽�����Ă����Ƃ�";
		mes "�����Ă�낤�B";
		next;
		mes "[�y�����b�N]";
		mes "��s�D�������Ԋ�{�����͂ȁc�c";
		mes "��^�{�C���[�ɉ΂����A";
		mes "���𕦂��������ɂł���C�̈��͂�";
		mes "�s�X�g���Ǝ��ԁA�^�[�r���𓮂����āA";
		mes "�v���y�����񂵂Ă���񂾁B";
		mes "�ȁH�@����ŕ�����������H";
		next;
		menu "���H�@���ꂾ��?!�@�����Ɖ�������ł���H",-;
		mes "[�y�����b�N]";
		mes "�n�n�n�b�I";
		mes "��G�c�ɐ������ďI��炻���Ǝv������";
		mes "�N�ɂ͂���Œʗp���Ȃ��������B";
		mes "�N�̌����Ƃ���A���b�����̂́A";
		mes "�N�����m���{�������B";
		next;
		mes "[�y�����b�N]";
		mes "�m���ɏ��C�����ł́A";
		mes "���̏d��������ɕ����ׂ�͖̂������B";
		mes "������^FF0000���[���@��^000000�Ƃ���";
		mes "��������g���񂾂�B";
		next;
		menu "���[���@�ցH�@����͉��ł����H",-;
		mes "[�y�����b�N]";
		mes "���@�̐΂��g�������u���B";
		mes "������ǂ����邩�܂ł́A";
		mes "�o���ĂȂ����c�c�B";
		mes "�b�𕷂��������������A";
		mes "�ڂ������O���Y�ꂽ���c�c�B";
		next;
		mes "[�y�����b�N]";
		mes "���~�c�c�Ȃ񂾂������ȁH";
		mes "����̃C�~�e�[�V������";
		mes "���C�@�ւ݂����Ȃ��̂ɑ�������ƁA";
		mes "���̐΂��痬��o�郋�[����";
		mes "�G�l���M�[�����������񂾁B";
		next;
		mes "[�y�����b�N]";
		mes "���͐e�w�قǂ̐΂�����";
		mes "���̂ł��������������Ă����";
		mes "�����Ă��ߌ��ł͂Ȃ��B";
		mes "���ꂾ�������͂����邩��ȁB";
		next;
		mes "[�y�����b�N]";
		mes "����Ŕ[���������ˁH";
		mes "���́A�����x�ނ�B";
		mes "�莆�̓ǂݏ�����";
		mes "������Ɣ�ꂽ����ȁB";
		misceffect 231,"";
		set AIR_1QUE,7;
		if(checkre())
			getexp 20000,1000;
		else
			getexp 200000,10000;
		break;
	case 7:
		mes "[�y�����b�N]";
		mes "�O�ɋ����Ă��������H";
		mes "����Ȗʓ|�Ȃ��ƁA";
		mes "���x�������񂶂�Ȃ��I";
		break;
	}
	close2;
	cutin "fly_felrock",255;
	end;
}

airplane,236,163,2	script	��s�D�D��	873,{
	cutin "fly_trock",2;
	switch(HU_7QUE) {
	case 3:
	case 4:
		mes "[�g���b�N]";
		mes "�䂪��s�D�ւ̂���D��";
		mes "���}�������܂��B";
		mes "���͂��̔�s�D�̑D��";
		mes "�g���b�N�Ɛ\���܂��B";
		mes "�����������܂����H";
		next;
		menu "�e�B�I���Ƃ����l��m��Ȃ�������",-;
		mes "[�g���b�N]";
		mes "���[��c�c";
		mes "���̂悤�Ȗ��O�͏����ł��ˁB";
		mes "���Ȃ��Ƃ����̔�s�D��";
		mes "�斱���ł͂���܂���B";
		next;
		menu "����Җ�������鎖���ł���̂�����",-;
		mes "[�g���b�N]";
		mes "����҃��X�g�͂���܂����A";
		mes "��ʐl�ɂ͌��J���邱�Ƃ��ł��܂���B";
		mes "�\���󂠂�܂���B";
		if(HU_7QUE == 3)
			close;
		next;
		menu "������������",-;
		mes "-�Ȃ��e�B�I����T���Ă���̂�";
		mes "�����������Ă���ԁA";
		mes "�g���b�N�D���͉�������ׂ炸";
		mes "���Ȃ����Ă΂��肢��-";
		next;
		mes "[�g���b�N]";
		mes "����͏[���悭�킩��܂������A";
		mes "����Җ������ʐl��";
		mes "���J���Ȃ����Ƃ͌����ł��B";
		next;
		mes "[�g���b�N]";
		mes "�c�c�������������ł��B";
		mes "���񂾂��͌������܂��傤�B";
		mes "�����҂��Ă��������B";
		next;
		mes "-�g���b�N�D���͂ǂ����炩";
		mes "�傫�Ȗ�������o����";
		mes "������1�y�[�W�ڂ�";
		mes "�u�e�B�I���v�Ə�����-";
		mes "-����ƁA������������Ə����āA";
		mes "����̃y�[�W������ɂ߂��ꂾ����-";
		next;
		mes "-���΂炭���Ė{���~�܂����y�[�W�ɂ�";
		mes "�e�B�I���̓���L�^��������-";
		next;
		mes "[�g���b�N]";
		mes "�n�n�b�B�����܂������H";
		mes "���̖���ɂ͖��@���������Ă��āA";
		mes "���O���������ΊȒP�ɂ킩��܂��B";
		next;
		mes "[�g���b�N]";
		mes "�̗̂F�B�ɂ����������㕨�Łc�c";
		mes "�����A�b���E�����Ă��܂��܂����ˁB";
		next;
		mes "[�g���b�N]";
		mes "�e�B�I���ł��ˁc�c";
		mes "�ӂށA�ꃖ�����O�ɏ�D���Ă��܂��B";
		mes "�ړI�n�̓t�B�Q���B";
		mes "���傤�ǂ��̔�s�D�Ƀt�B�Q���H����";
		mes "�ǉ����ꂽ���ł��ˁB";
		next;
		mes "[�g���b�N]";
		mes "�����A���������΁B";
		mes "���̐l�͌����Ƃł����ˁB";
		mes "�v���o���܂�����B";
		next;
		mes "[�g���b�N]";
		mes "�t�B�Q���H�����ǉ����ꂽ���̓��A";
		mes "�����Ȃ�h���S���ɏP���܂����B";
		mes "�������������Ă��Ȃ�������������";
		mes "��@�I�ȏ󋵂Ɋׂ�܂����B";
		next;
		mes "[�g���b�N]";
		mes "�l���Č���΃t�B�Q���Ƃ�������";
		mes "�l�������Ȃ����R�Ƃ���";
		mes "�h���S��������Ƃ����b�ł����B";
		mes "���͂������肻�̎���Y��Ă��܂����B";
		next;
		mes "[�g���b�N]";
		mes "�@�̂͌̏Ⴕ�A�������߂��Ǝv�������A";
		mes "���̐N���@�̂̏C����";
		mes "��`���Ă���āA�Ȃ�Ƃ�";
		mes "�h���S�����瓦���鎖���ł��܂����B";
		mes "���̐N�̖��O��";
		mes "�e�B�I���������̂ł��ˁB";
		next;
		mes "[�g���b�N]";
		mes "�ǂ����߂������Ȋ��";
		mes "���Ă����̂�";
		mes "����Ȏ������������ł��ˁc�c";
		mes "�ނ��ǂ��ɍs�����̂�";
		mes "��������҂̕���";
		mes "�����Ă����Ă��������B";
		next;
		mes "[�g���b�N]";
		mes "�����ނɏo�������A";
		mes "���̎��͖{���ɂ��肪�Ƃ�";
		mes "�Ɠ`���Ă��������B";
		set HU_7QUE,5;
		close2;
		cutin "fly_trock",255;
		end;
	case 5:
		mes "[�g���b�N]";
		mes "�͂₭����҂̕���";
		mes "�ނ��t�B�Q���ɍs��������";
		mes "�����Ă����Ă��������B";
		close2;
		cutin "fly_trock",255;
		end;
	}
	switch(AIR_2QUE) {
	case 11:
		mes "[�g���b�N]";
		mes "���c�c";
		mes "��������Ⴂ�܂����ˁB";
		mes "�ǂ̘b���炷��΂�����";
		mes "�킩��܂��񂪁c�c�܂��A";
		mes "���Ȃ��ɕ���������������܂��B";
		next;
		mes "[�g���b�N]";
		mes "���Ȃ���";
		mes "���~���̐S���̃C�~�e�[�V������";
		mes "�������悤�Ƃ����̂́A";
		mes "�P���ȍD��S����ł����H";
		mes "����Ƃ��c�c";
		mes "���̉���������������ł��傤���H";
		next;
		if(select("�P���ȍD��S","����������������")==1) {
			mes "[�g���b�N]";
			mes "����Ȃ�c�c";
			mes "���Ȃ��̍D��S��";
			mes "�����Ŏ~�߂����������ł��B";
			mes "����͒����ł͂Ȃ��A�x���ł��B";
			close2;
			cutin "fly_trock",255;
			end;
		}
		mes "[�g���b�N]";
		mes "�c�c�c�c";
		mes "���Ȃ����M�p�ł��邩";
		mes "�܂��킩��܂��񂪁c�c";
		mes "�댯�Ƃ킩���Ă��Ȃ����";
		mes "�������ɔE�э��񂾂̂�����ƁA";
		mes "�{���ɉ������������̂ł��傤�B";
		next;
		mes "[�g���b�N]";
		mes "�c�c�킩��܂����B";
		mes "���̉�����";
		mes "���Ɠ������킩��܂��񂪁A";
		mes "���Ȃ��Ƃ����Ȃ��Ǝ���";
		mes "�G�Ί֌W�ł͂Ȃ��ł��傤�B";
		next;
		mes "[�g���b�N]";
		mes "�c�c��񑩂��Ă��������B";
		mes "�����玄���b�����́A";
		mes "���̒N�ɂ��b���Ȃ��ƁB";
		next;
		menu "��Δ閧�ɂ���Ɩ񑩂���",-;
		mes "[�g���b�N]";
		mes "�킩��܂����B";
		mes "����ł͂��b���܂��傤�B";
		next;
		mes "[�g���b�N]";
		mes "�����m�ł��傤���A";
		mes "��s�D�̓��͌���";
		mes "���[���@�ւƌĂ΂��";
		mes "���~���̐S���̃C�~�e�[�V�����ł��B";
		next;
		mes "[�g���b�N]";
		mes "���[���@�ւ́A";
		mes "���~���̐S���ɔ��";
		mes "���̗͂͗����܂��B";
		next;
		mes "[�g���b�N]";
		mes "�ł����A�ǂ��łǂ������";
		mes "���܂ꂽ�̂��킩�炸�A";
		mes "�������Ȃ����~���̐S���Ƃ͈Ⴂ�A";
		mes "�l�Ԃ̎��";
		mes "���グ�邱�Ƃ��ł��铮�͌��c�c";
		next;
		mes "[�g���b�N]";
		mes "���ꂱ�������[���@�ւȂ̂ł��B";
		next;
		mes "[�g���b�N]";
		mes "�����āA���̐��������c�c";
		mes "�A�C���u���b�N�̌������B";
		mes "���Ȃ����E�э��񂾏��ł��B";
		next;
		mes "[�g���b�N]";
		mes "��܂��ɂł������ł��B";
		mes "�킩��܂����H";
		next;
		menu "�o�������g�v���W�F�N�g�Ƃ͈�́H",-;
		mes "[�g���b�N]";
		mes "�匫�҃o�������g�̂��Ƃ�";
		mes "�m���Ă��܂��ˁH";
		mes "�ނ̋Ɛт͗L���ł����A";
		mes "���ɒm���Ȃ����Ƃ�����܂��B";
		next;
		mes "[�g���b�N]";
		mes "�Ⴆ�΁c�c";
		mes "�����c�c���[���@�ւł��B";
		mes "���[���@�ւ𐶂ݏo�����l�������A";
		mes "�匫�҃o�������g�Ȃ̂ł��B";
		next;
		mes "[�g���b�N]";
		mes "�c��������V�˓I�ȓ��]�ŁA";
		mes "�W���m�[������w�̋����ɂ܂�";
		mes "���F���ꂽ�o�������g�B";
		next;
		mes "[�g���b�N]";
		mes "�ނ͌�w�{�����A";
		mes "�Ñ��Ղ̔��@��";
		mes "�Ȋw�����ɗ͂��������ƕ����܂��B";
		next;
		mes "[�g���b�N]";
		mes "�������A";
		mes "�n�����_�v�̑��q�ɐ��܂ꂽ";
		mes "�o�������g���A�����𑱂���ɂ�";
		mes "�o�ϓI�ɖ�肪����܂����B";
		next;
		mes "[�g���b�N]";
		mes "����ȃo�������g���I�񂾓��́A";
		mes "�u��Ɓv�Ǝ��g�ނ��Ƃł����B";
		mes "�����āA�ނ��c�������[���@�ւ�";
		mes "��Ƃ̗͂ƂȂ����̂ł��B";
		next;
		mes "[�g���b�N]";
		mes "���[���@�ւ�";
		mes "��s�D�̓��͌��Ɏg���܂����A";
		mes "�K�[�f�B�A���̓��͌��ɂ�";
		mes "�g���Ă��܂��B";
		next;
		mes "[�g���b�N]";
		mes "�������A���݂̃��[���@�ւ�";
		mes "���~���̐S���ƈႢ�A";
		mes "�s���S�ȏ�Ԃł��B";
		next;
		mes "[�g���b�N]";
		mes "�Ȃ��Ȃ�A";
		mes "���~���̐S���̂悤��";
		mes "�i�v�ɗ͂𐶂ݏo�����Ƃ��ł����A";
		mes "�˔@�Ƃ��ė͐s���A����ȏ�";
		mes "�g�����Ƃ��ł��Ȃ��Ȃ邩��ł��B";
		next;
		mes "[�g���b�N]";
		mes "�������̓��A";
		mes "�������֍s�����̂�";
		mes "�͐s���钼�O�̃��[���@�ւ�";
		mes "�������邽�߂������̂ł��B";
		next;
		mes "[�g���b�N]";
		mes "�����m���Ă���";
		mes "�o�������g�v���W�F�N�g�́A";
		mes "���[���@�ւ̕s���S�ȗv�f��";
		mes "�₤���߂̃v���W�F�N�g�ł��B";
		mes "����ȏ�ڂ������́A";
		mes "���ɂ��킩��܂���B";
		next;
		mes "[�g���b�N]";
		mes "�t�D�c�c";
		mes "�ꑧ����܂��傤�B";
		set AIR_2QUE,12;
		close2;
		cutin "fly_trock",255;
		end;
	case 12:
		mes "[�g���b�N]";
		mes "����ł͑����܂��B";
		mes "��������Șb��";
		mes strcharinfo(0)+ "�����";
		mes "����̂ɂ͗��R������܂��B";
		next;
		mes "[�g���b�N]";
		mes "�����ŋ߁c�c�c�c";
		mes "���̃��[���@�ւ����͂ނ悤�ɁA";
		mes "�������N���낤�Ƃ��Ă���悤��";
		mes "����������ł��B";
		next;
		mes "[�g���b�N]";
		mes "���́A�Z����̔�s�D��";
		mes "�O���������ƃr�z���_�[��";
		mes "�P��ꂽ�̂�������������܂��B";
		next;
		mes "[�g���b�N]";
		mes "���X�O���������́A";
		mes "�����܂����O���Ƃ͗����ɁA";
		mes "���̐����̂Ɏ�������";
		mes "����o���悤�Ȏ��͂��Ȃ��A";
		mes "��r�I��l���������X�^�[�ł��B";
		next;
		mes "[�g���b�N]";
		mes "�������A�@�B�⑕�u���󂷁A";
		mes "��������D���ȃ����X�^�[�ł��B";
		mes "���̃O���������ɂ��H�͂���܂����A";
		mes "����Ԃ��Ƃ͂ł��܂���B";
		next;
		mes "[�g���b�N]";
		mes "���́A����ׂȂ������X�^�[���A";
		mes "���x8000���[�g�������щ��";
		mes "��s�D���P�����Ƃ��ł��܂����H";
		next;
		mes "[�g���b�N]";
		mes "�����������X�^�[����ɏグ�A";
		mes "��s�D�ɗ��Ƃ����Ƃ���";
		mes "�l�����܂���B";
		next;
		mes "[�g���b�N]";
		mes "�������A���̃O����������";
		mes "�ǂ����Ď�������";
		mes "��s�D���P�����̂��B";
		mes "�^�₪�c��܂��ˁH";
		next;
		mes "[�g���b�N]";
		mes "����ɂ��Ē������Ă�����A";
		mes "��s�D���P�����O���������̑̓���";
		mes "�Í��̈ӎu�����ߍ��܂�Ă���";
		mes "�Ƃ������Ƃ��킩��܂����B";
		next;
		mes "[�g���b�N]";
		mes "�Í��̈ӎu�Ƃ́A";
		mes "���ꂪ���ߍ��܂ꂽ������";
		mes "���_���x�z���鋰�낵���㕨�ł��B";
		next;
		mes "[�g���b�N]";
		mes "�܂�A�N�����̈ӂ�";
		mes "�O���������̑̓���";
		mes "�Í��̈ӎu�𖄂ߍ��݁A";
		mes "��s�D���P�킹�Ă���̂ł��B";
		next;
		mes "[�g���b�N]";
		mes "���̐����𗠕t����";
		mes "�����̈���A";
		mes "�r�z���_�[�Ƃ��������X�^�[��";
		mes "�O���������Ƃ���";
		mes "�ꏏ�ɏo�����鎖�ł��B";
		next;
		mes "[�g���b�N]";
		mes "�r�z���_�[�͕ʖ��A";
		mes "�����҂ƌĂ΂�郂���X�^�[�ŁA";
		mes "���҂����҂�";
		mes "�ڂ̖��������Ă���܂��B";
		next;
		mes "[�g���b�N]";
		mes "�N�����A";
		mes "�O���������⑼�̃����X�^�[��";
		mes "�P�킹�Ȃ���A�r�z���_�[��ʂ���";
		mes "�Ď����Ă���Ƃ������ł��B";
		next;
		mes "[�g���b�N]";
		mes "�����œ�̋^�₪�o�܂��B";
		mes "��́u�Ȃ��v�P���̂��B";
		mes "������́u�N���v�P���̂��B";
		mes "���̓�ł��B";
		next;
		mes "[�g���b�N]";
		mes "��ڂ̋^��͊ȒP�ł��B";
		mes "����͔�s�D�̓��͌��ł���";
		mes "���[���@�ցA�܂�";
		mes "���~���̐S���̃C�~�e�[�V������";
		mes "��ɓ���邽�߂ł��B";
		next;
		mes "[�g���b�N]";
		mes "�������A��ڂ̋^��ł���";
		mes "�����N���_���A";
		mes "�ǂ����đ_���̂���";
		mes "�����ɂ킩���Ă��܂���B";
		next;
		mes "[�g���b�N]";
		mes "��s�D���P�����O����������";
		mes "�r�z���_�[����o��";
		mes "�Í��̈ӎu�ƃg�Q�̎�����";
		mes "�����˂��~�߂悤�Ƃ��܂������A";
		mes "���ꂪ�v����������āc�c";
		next;
		mes "[�g���b�N]";
		mes "���̑O�A";
		mes "�Z����ɂ��̎���b������A";
		mes "�������ׂ�ƌ�����";
		mes "�Í��̈ӎu�ƃg�Q�̎���";
		mes "�����čs�������Ƃ�����܂����B";
		next;
		mes "[�g���b�N]";
		mes "�������A���̎���";
		mes "��������Y��Ă��܂�����A";
		mes "�������ǂ��ɒu�����̂�����";
		mes "�Y��Ă��悤�Łc�c�c�c";
		next;
		mes "[�g���b�N]";
		mes "�V���o���c�o���h�����̐l��";
		mes "�^�������܂������A";
		mes "�V���o���c�o���h��������";
		mes "�^�s���鎄�̔�s�D��";
		mes "�P��Ȃ���������ƁA";
		mes "�O���̐l�̕����������ł��ˁB";
		next;
		mes "[�g���b�N]";
		mes "�Ɛl���킩������N�Ȃ̂��A";
		mes strcharinfo(0)+ "�����";
		mes "�^����ɋ����܂��ˁB";
		next;
		mes "[�g���b�N]";
		mes strcharinfo(0)+ "������A";
		mes "�����V������񂪎�ɓ�������";
		mes "���ɋ����Ă��������B";
		next;
		mes "[�g���b�N]";
		mes "���̒m���Ă��邱�Ƃ͂��ꂾ���ł��B";
		mes "������x�����܂����A";
		mes "���̘b�͐�΂ɁA�N�ɂ�";
		mes "�b���Ȃ��ł��������B";
		mes "����ł́A�܂����A�����܂��B";
		close2;
		cutin "fly_trock",255;
		set AIR_2QUE,13;
		if(checkre())
			getexp 70000,40000;
		else
			getexp 700000,400000;
		misceffect 253,"";
		close2;
		cutin "fly_trock",255;
		end;
	case 13:
		mes "[�g���b�N]";
		mes "�ŋ߁A�d�����ƂĂ��Z�����̂�";
		mes "���܂蒲���͂ł��܂���B";
		mes "�ł��̂ŁA�����V��������";
		mes "����͓̂���ł��傤�c�c";
		close2;
		cutin "fly_trock",255;
		end;
	}
	mes "[�g���b�N]";
	mes "�䂪��s�D�ւ̂���D��";
	mes "���}�������܂��B";
	mes "���͂��̔�s�D�̑D��";
	mes "�g���b�N�Ɛ\���܂��B";
	mes "�����������܂����H";
	next;
	if(AIR_1QUE == 2) set .@word$,"�y�����b�N�D���̎莆��n��";
	else if(AIR_1QUE == 3) set .@word$,"�D���ɗ��܂ꂽ����n��";
	switch(select("��s�D�͂ǂ�����ē����Ă�̂ł����H",.@word$,"���ɂ���܂���")) {
	case 1:
		mes "[�g���b�N]";
		mes "�\���󂲂����܂���B";
		mes "����Ɋւ��ẮA";
		mes "�D���B�����ɒm�炳��Ă���";
		mes "�@�������ƂȂ�܂��̂Łc�c�B";
		mes "��ʂ̕��X�ɂ��������邱�Ƃ�";
		mes "�ł��܂���B���������������B";
		close2;
		cutin "fly_trock",255;
		end;
	case 2:
		break;
	case 3:
		mes "[�g���b�N]";
		mes "����ł́A�悢���ɂȂ�Ƃ����ł��ˁB";
		close2;
		cutin "fly_trock",255;
		end;
	}
	switch(AIR_1QUE) {
	case 2:
		mes "-�y�����b�N�D���̎莆��";
		mes "�g���b�N�D���ɓn����-";
		next;
		mes "[�g���b�N]";
		mes "����c�c";
		mes "�Z����̎莆�ł����B";
		mes "���Z�������A";
		mes "�킴�킴�͂��Ă���������";
		mes "���肪�Ƃ��������܂��B";
		mes "���X���҂����������B";
		next;
		mes "-�g���b�N�D���́A�莆��ǂݎn�߂�-";
		next;
		mes "[�g���b�N]";
		mes "���[��c�c�n�n�b�c�c";
		mes "�Z���񂽂�c�c�B";
		mes "������c�c���[��c�c";
		mes "����H�c�c�n�n�n�b�I";
		mes "�c�c�ւ��`�A����Ȏ����c�c";
		mes "������c�c�u�c�u�c�c�c�B";
		next;
		mes "[�g���b�N]";
		mes "�͂��A�ǂ݂܂����B";
		mes "���҂������Đ\���󂠂�܂���B";
		next;
		mes "[�g���b�N]";
		mes "�Z�����Ɏ莆���悱���̂́A";
		mes "���ۂ��m�F���邽�߂ł͂���܂����c�c";
		mes "����́A���̑O�A�Z��������؂肽����";
		mes "�Ԃ����߂ł�����܂����B";
		next;
		mes "[�g���b�N]";
		mes "���ɂƂ��ĕK�v�ȕ��ł��B";
		mes "�Ƃ��낪�A�Z�͂ǂ���炻�̕i����";
		mes "�Ȃ����Ă��܂����悤�Łc�c�B";
		mes "�莆�ɂ͂��������Ă���܂��ˁB";
		next;
		mes "[�g���b�N]";
		mes "^FF0000�u���̎莆�������ė��Ă��ꂽ�l���A";
		mes "���̕i����n���Ă���邾�낤�B";
		mes "���������A���̐l���i����";
		mes "�n���Ă���Ȃ�������A";
		mes "���ɕԎ����悱���Ȃ��ł���B�v^000000�ƂˁB";
		next;
		mes "[�g���b�N]";
		mes "�Z�ɉ�����_�ł�";
		mes "�����Ă����ł����H";
		mes "�n�b�n�b�I";
		mes "�܂��A���ɂ͕K�v�ȕ��Ȃ̂ŁA";
		mes "�����Ă��Ă���������΂Ǝv���܂��B";
		next;
		mes "[�g���b�N]";
		mes "���肢�������i���́A";
		mes "^FF0000�Í��̈ӎu2��^000000��";
		mes "^FF0000�g�Q�̎�2��^000000�ł��B";
		next;
		mes "[�g���b�N]";
		mes "���ƁA�������b�ɂ��ƁA";
		mes "�Z�̔�s�D�����܂�";
		mes "�P���A�������邻���ł��B";
		mes "�ڂ������Ƃ͕�����܂��񂪁c�c�B";
		mes "����ł͂��肢���܂��ˁB";
		set AIR_1QUE,3;
		break;
	case 3:
		if(countitem(7340) < 2 || countitem(576) < 2) {
			mes "[�g���b�N]";
			mes "����H";
			mes "�܂����񂾕i��";
			mes "�����Ă��Ȃ��悤�ł����c�c�B";
			mes "�O�̂��߁A������x";
			mes "�\���グ�܂��傤���B";
			next;
			mes "[�g���b�N]";
			mes "^FF0000�Í��̈ӎu2��^000000��";
			mes "^FF0000�g�Q�̎�2��^000000��";
			mes "�W�߂Ă��Ă��������B";
			mes "����ł͂�낵�����肢���܂��B";
			break;
		}
		delitem 7340,2;
		delitem 576,2;
		set AIR_1QUE,4;
		mes "[�g���b�N]";
		mes "�����Ă��Ă��������܂������I";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�Z�ւ̎莆�͂�����ł��B";
		next;
		mes "-�D������莆���󂯂Ƃ���-";
		next;
		mes "[�g���b�N]";
		mes "�Z�ɂ�낵�����`�����������B";
		mes "����ł͂悢������B";
		break;
	}
	close2;
	cutin "fly_trock",255;
	end;
}

//============================================================
// ���~���̐S���N�G�X�gNPC
//- Registry -------------------------------------------------
// AIR_2QUE -> 0�`13
//------------------------------------------------------------
airplane,236,63,4	script	�w�C������	706,{
	if(HU_7QUE == 3) {
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "��s�D�̎d���Ȃ�";
		mes "�l�ɔC���ȁI";
		mes "�w�w�b�B";
		next;
		menu "�e�B�I���Ƃ����l��m��Ȃ�������",-;
		mes "[�w�C������]";
		mes "�e�B�I���H";
		mes "���`��c�c�m��Ȃ��ȁ`";
		mes "���̐l�ɂ������Ă݂Ă�B";
		mes "�P�[�W�o�����Ȃ�m���Ă邩���B";
		close;
	}
	switch(AIR_2QUE) {
	case 0:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		if(BaseLevel < 60) {
			mes "[�w�C������]";
			mes "��s�D�̎d���Ȃ�";
			mes "�l�ɔC���ȁI";
			mes "�w�w�b�B";
			close;
		}
		mes "[�w�C������]";
		mes "��H�@��q�̐l�H";
		mes "���ɂ��킟�`";
		next;
		if(select("��q����Ȃ���H","�����ŉ����Ă�́H")==1) {
			emotion 1;
			mes "[�w�C������]";
			mes "��q����Ȃ����āc�c�斱���H";
			mes "�����`�H�@�������Ȃ���c�c";
			mes "�܂����A�l���܂�" +(Sex? "�Z": "�o")+ "����񂽂���";
			mes "����o�����ĂȂ�!?";
			next;
			mes "[�w�C������]";
			mes "�c�c�c�c!!";
			next;
			emotion 0;
			mes "[�w�C������]";
			mes "�A�b�I";
			mes "�悭�����畞��";
			mes "�S�R�Ⴄ�����I";
			mes "�l���܂��������������";
			mes "�o�J�ɂ���Ȃ�b�I";
			next;
			mes "[�w�C������]";
			mes "�т����肵���Ȃ��B";
			mes "�����`";
		}
		else {
			mes "[�w�C������]";
			mes "���Ă킩��Ȃ��H";
			mes "�b�̑|�����Ɍ��܂��Ă邶���B";
			mes "�l����ԏ������Ⴂ����A";
			mes "���������d����";
			mes "�����t������񂾂�B";
			next;
			mes "[�w�C������]";
			mes "���ĂƁA";
		}
		mes "�|�����������ƏI��点�āA";
		mes "�P�[�W�o�����Ƃ��ɗV�т�";
		mes "�s�����ƁB";
		next;
		menu "�P�[�W�c�c���o����H",-;
		mes "[�w�C������]";
		mes "��c�c�H";
		mes "��s�D�̒��ŃT�C�R���Q�[����";
		mes "���Ă���l�A�m��Ȃ��H";
		mes "�ދ��Ȃ����Ă݂���H";
		next;
		mes "[�w�C������]";
		mes "�T�C�R����]�����āA";
		mes "���������������S�����Q�[������B";
		mes "����܂菟�����������������A";
		mes "��ɓ��ꂽ�����S�ŏ���������l��";
		mes "�߂��ɂ��邮�炢����B";
		next;
		mes "[�w�C������]";
		mes "���͂��̘b�A�E�\���Ǝv����";
		mes "�o�����ɕ����Ă݂���c�c";
		mes "�{���Ȃ񂾂��Ă��B";
		mes "��������ˁ`";
		next;
		mes "[�w�C������]";
		mes "���A���̘b�͔閧�������I";
		mes "�c�c�c�c�ւցA�܂������B";
		mes "���ꂶ��A�l�͂܂��d�������邩��B";
		mes "�܂����x�ˁA" +(Sex? "�Z": "�o")+ "�����B";
		set AIR_2QUE,1;
		close;
	case 1:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "�I�b�H";
		mes "�O�ɉ����" +(Sex? "�Z": "�o")+ "����񂾂ˁB";
		mes "���ɂ��킟�`���ƁB";
		mes "�������M�S�ɑ|�������I";
		next;
		emotion 0;
		mes "[�w�C������]";
		mes "���I";
		mes "�������";
		mes "���肢������񂾂��ǂ������ȁH";
		mes "�ȒP�����炳�A�ˁH";
		next;
		if(select("���Z�����āc�c���߂�","���H�@�ȒP�Ȃ炢�����ǁc�c")==1) {
			mes "[�w�C������]";
			mes "�������c�c�Z�����Ȃ炢����B";
			mes "�|�����I��点�Ă���";
			mes "�����ł��邩��c�c";
			mes "����A�l�͑|���𑱂��邩��B";
			close;
		}
		mes "[�w�C������]";
		mes "�w�w�b�B�T���L���[�T���L���[�B";
		mes "�������������Ȃ���B";
		next;
		mes "[�w�C������]";
		mes "����I�ɏ斱���݂̂�Ȃ�";
		mes "�����Ă�莆���A";
		mes "�W���m�[��`�Ŗl���W�߂Ă�񂾁B";
		mes "���̒��ɃP�[�W�o�����ւ�";
		mes "�莆�������ĂˁB";
		next;
		mes "[�w�C������]";
		mes "���A�|���ŖZ��������";
		mes "�l�̑���ɂ����";
		mes "�P�[�W�o�����ɓ͂��Ă�B";
		mes "�}�E�H���O���Đl����̎莆�����ǁA";
		mes "�o�����̂��t���l�Ƃ������Ƃ���";
		mes "�l���m��Ȃ���B";
		next;
		mes "-�w�C����������莆���󂯂Ƃ���-";
		next;
		mes "[�w�C������]";
		mes "�P�[�W�o�����͔�s�D�̒��ɂ����B";
		mes "���񂾂�`";
		set AIR_2QUE,2;
		close;
	case 2:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "�ӂ��c�c";
		mes "����A���I���񂾁c�c";
		mes "�T�b�T�b�T�c�c�c�c";
		next;
		mes "[�w�C������]";
		mes "���A" +(Sex? "�Z": "�o")+ "�����I";
		mes "�P�[�W�o�����Ɏ莆�͓n�����H";
		close;
	case 3:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "����A���I���񂾁c�c";
		mes "�T�b�T�b�T�c�c�c�c";
		close;
	case 4:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "���I�@���ɂ��킟�`";
		mes "���̑O���񂾎莆�A���肪�ƂˁB";
		next;
		mes "[�w�C������]";
		mes "�ł��A�P�[�W�o������";
		mes "��q�̕��ɖʓ|�ɂ�����Ȃ���";
		mes "�{��ꂿ�������c�c�������B";
		next;
		mes "[�w�C������]";
		mes "�l�Ԋ֌W���Ă����̂�";
		mes "�Z�������͂��݂���";
		mes "�����������Ƃ��Ƃ͎v��Ȃ��H";
		next;
		if(select("�c�c�c�c","�������ˁB��������Ȃ��Ƃ����Ȃ�")==1) {
			mes "[�w�C������]";
			mes "�ǂ����ĉ�������Ȃ��̂��B";
			mes "���������āA����ҁH";
			set AIR_2QUE,5;
			close;
		}
		mes "[�w�C������]";
		mes "�����b�I";
		mes "����ς�" +(Sex? "�Z": "�o")+ "�����͘b���킩��ˁI";
		mes "�����" +(Sex? "�Z": "�o")+ "�����ɂ�";
		mes "����������悤�I";
		next;
		mes "[�w�C������]";
		mes "�w�w�b�B";
		mes "��Ȃ����ɂł��g���Ă�B";
		mes "���ꂶ��A�l�͑|�������邩��B";
		mes "�܂��ˁ`";
		set AIR_2QUE,5;
		getitem 501,1;
		close;
	case 5:
		mes "[�w�C������]";
		mes (Sex? "�Z": "�o")+ "����`��B";
		mes "���ɂ��킟�`";
		next;
		menu "�����͑|�������Ȃ��́H",-;
		mes "[�w�C������]";
		mes "�l���������|������";
		mes "���Ă���Ǝv�����H";
		mes "�l�����Ă��܂ɂ͋x�ނ�B";
		next;
		mes "[�w�C������]";
		mes "�l�ɂ��������񂾁B";
		mes "�W���m�[�ŕ�炵�Ă��鎞�A";
		mes "�ׂ̉ƂɃC�{���ČZ����񂪂��āA";
		mes "�Z�����͖{���ɉ��ł�����";
		mes "���\���m�������񂾁B";
		next;
		mes "[�w�C������]";
		mes "���̌Z�����";
		mes "�l�̗��z�Ȃ񂾁B";
		mes "�l���s�v�c�ȕ���";
		mes "�����ς������";
		mes "�C�{�Z�����݂����ɂȂ肽���񂾁B";
		next;
		mes "[�w�C������]";
		mes "�匫�҃o�������g";
		mes "�Ƃ܂ł͌���Ȃ����ǁA";
		mes "�F��ȕ�������āA";
		mes "�l�X�Ɋ�΂ꂽ���񂾁B";
		mes "���ɂ��Ă͑傫�����邩�ȁH";
		mes "�A�n�n�b�B";
		next;
		menu "�匫�҃o�������g�H",-;
		mes "[�w�C������]";
		mes "����B���H�@���H";
		mes "�匫�҃o�������g��m��Ȃ��H";
		next;
		mes "[�w�C������]";
		mes "���[��c�c";
		mes "�l���������b������";
		mes "���܂�ڂ����͒m��Ȃ����ǁc�c";
		next;
		mes "[�w�C������]";
		mes "300�N���炢�O��";
		mes "�o�������g���Ă����l���A";
		mes "��������̋Ɛт��c�������Ƃ�";
		mes "�匫�҂ɂȂ����񂾂��āB";
		next;
		mes "[�w�C������]";
		mes "�l���������A";
		mes "����Ȃɕ֗��Ȑ������Ă��邱�Ƃ�";
		mes "�݁`��Ȃ��̐l�̂������炵����B";
		next;
		mes "[�w�C������]";
		mes "�����ǁA���̐l�͂����Ȃ�";
		mes "�s���s���ɂȂ���������񂾂��āB";
		mes "�ǂ��ɂ���̂��N�ɂ��킩��Ȃ��āA";
		mes "�₪�āA�l�X�̊Ԃł�";
		mes "�`���̂悤�Ȑl�ɂȂ����񂾂��Ă��B";
		next;
		mes "[�w�C������]";
		mes "����ȂƂ����ȁc�c";
		mes "���������΁A" +(Sex? "�Z": "�o")+ "������";
		mes "���̔�s�D�̎��A";
		mes "�悭�m���Ă�H";
		next;
		menu "�ǂ����ċ}�ɔ�s�D�H",-;
		mes "[�w�C������]";
		mes "��s�D�͂������傫���ďd���̂ɁA";
		mes "����Ȃ̂��ǂ������";
		mes "��ɔ��ł�̂��m�肽���Ȃ��H";
		mes "�����������������ǁA";
		mes "�l�͂Ȃ�ł���肽���񂾁B";
		next;
		mes "[�w�C������]";
		mes "������A�l�͂��̔�s�D�ɂ���";
		mes "���X�܂Œm�肽���񂾁B";
		mes "�ł��A�ǂ����Ă�����ȏd���̂�";
		mes "�l���悹�ē�����̂�";
		mes "�S�R�킩��Ȃ��āc�c���[��c�c";
		set AIR_2QUE,6;
		close;
	case 6:
		mes "[�w�C������]";
		mes (Sex? "�Z": "�o")+ "�����͔�s�D��";
		mes "�ǂ�����ē����Ă邩";
		mes "�m���Ă�H";
		next;
		if(AIR_1QUE < 7) {
			menu "���[��c�c���ɂ��킩��Ȃ�",-;
			mes "[�w�C������]";
			mes "�������c�c";
			mes "����ς킩��Ȃ���ˁB";
			mes "�g���b�N�D���Ȃ�";
			mes "�m���Ă邾�낤����";
			mes "�����Ă݂���@�����������";
			mes "�����Ă���Ȃ��񂾂�B�������B";
			next;
			mes "[�w�C������]";
			mes (Sex? "�Z": "�o")+ "����񂩂���������";
			mes "�����Ă݂Ă���Ȃ��H";
			mes "�g���b�N�D���������Ă���Ȃ��Ȃ�A";
			mes "���̑D���ł��������炳�B";
			next;
			mes "[�w�C������]";
			mes "�ǂ����Ă��m�肽���񂾁B";
			mes "�킩������A�܂����";
			mes "�����Ă�ˁI";
			mes "���񂾂�I";
			next;
			mes "-�w�C�������͎����l����Ԃ��Ȃ��A";
			mes "�b��؂�グ��";
			mes "�d���ɏW�����n�߂�-";
			close;
		}
		menu "����c�c�m���Ă�",-;
		mes "[�w�C������]";
		mes "���b�H�@�{��!?";
		mes "�{���ɒm���Ă��!?";
		mes "������!!";
		mes "�ǂ�����āA����ȑ傫���ďd��";
		mes "��s�D�������Ă��!?";
		next;
		mes "-�y�����b�N�D���ɕ������b��";
		mes "���~���̐S���̃C�~�e�[�V������";
		mes "�����������ăw�C�������ɋ�����-";
		next;
		mes "[�w�C������]";
		mes "����A����B";
		mes "�ȒP�ɂ����ƁA�����C�𗘗p����";
		mes "�v���y�����񂵂Ă�񂾂ˁB";
		next;
		mes "[�w�C������]";
		mes "�c�c�ł��A���̏d����s�D��";
		mes "����ȒP���ȋ@�B�ŕ����Ԃ́H";
		mes "�����ƁA�Ⴄ����������񂶂�c�c";
		next;
		mes "[�w�C������]";
		mes "�{���ɕ������̂͂��ꂾ���Ȃ́H";
		next;
		menu "���[���@�ւɂ��ċ�����",-;
		mes "-�q���ɂȂ玖���������Ă�";
		mes "���͂Ȃ����낤�Ǝv���A";
		mes "���[���@�ցA�܂�";
		mes "���~���̐S���̃C�~�e�[�V����";
		mes "�ɂ��Ęb����-";
		next;
		mes "[�w�C������]";
		mes "���b�H�@�{���ɂ���ȕ�������́H";
		mes "��I�@�z���g�H�@�������I";
		mes "�c�c����H";
		mes "�Ȃ񂾂����~�����Č��t��";
		mes "�����o�����c�c";
		next;
		mes "[�w�C������]";
		mes "�ǂ����ŕ������悤�ȁc�c";
		mes "���`��c�c";
		mes "������Ǝv���o���Ă݂�B";
		set AIR_2QUE,7;
		close;
	case 7:
		mes "[�w�C������]";
		mes "���[��c�c�v���o���Ȃ���B";
		mes "�ǂ����ŕ��������Ƃ���񂾂��ǁc�c";
		mes "�ǂ����������Ȃ��c�c";
		next;
		emotion 0;
		mes "[�w�C������]";
		mes "���b�I�@�v���o����!!";
		mes "����A�P�[�W�o�����̏���";
		mes "�������񂾁I";
		next;
		menu "�P�[�W���o����̏��H",-;
		mes "[�w�C������]";
		mes "����I";
		mes "�o����񂪃T�C�R���Q�[�����鏊��";
		mes "����������������ł��邨������";
		mes "����Ȃ��ƌ����Ă��I";
		next;
		if(EIN_3QUE == 11) {
			mes "�i���������΂��̑O�A";
			mes "�V�h�N�X����̗��݂�";
			mes "����������";
			mes "����Ȑl�ɉ�������Ƃ��������j";
			next;
			mes "�i���̐l�͊m��";
			mes "���~���̐S���̌��Ђ�����";
			mes "�A�C���u���b�N��";
			mes "�����������������C���c�c�j";
			next;
			mes "�i��H�@����Ȃ�";
			mes "���~���̐S���̃C�~�e�[�V������";
			mes "�A�C���u���b�N�������ɂ���";
			mes "���~���̐S���̌��Ђ�";
			mes "�����֌W���Ă���񂶂�H";
			mes "��x���ׂĂ݂��ق����������낤�j";
			next;
		}
		mes "[�w�C������]";
		mes "�Ƃɂ���" +(Sex? "�Z": "�o")+ "�����B";
		mes "��s�D�ɂ��ċ����Ă����";
		mes "���肪�ƂˁB";
		mes "���������ǁA������������I";
		next;
		mes "[�w�C������]";
		mes "�w�w�b�B";
		mes "�����������镨����Ȃ���ˁB";
		mes "���ꂶ��A�l�͎d�������邩��B";
		mes "���x�܂��ˁB";
		mes "�΂��΁`���B";
		if(EIN_3QUE == 11)
			set AIR_2QUE,9;
		else
			set AIR_2QUE,8;
		getitem 501,1;
		close;
	case 8:
		mes "[�w�C������]";
		mes "�P�[�W�o������";
		mes "���̐�������������ɂ���";
		mes "�����Ă݂Ă�B";
		mes "���������Ă邩��A";
		mes "�o�����Ȃ牽���m���Ă邩���B";
		close;
	default:
		mes "[�w�C������]";
		mes "�T�b�T�b�T�`";
		mes "���|���T�b�T�`";
		next;
		mes "[�w�C������]";
		mes "���A���̑O�͂��肪�ƂˁB";
		mes "�w�w�b�B";
		mes "�l�������͂���ȁA";
		mes "�傫����s�D������Ă��񂾃b�I";
		close;
	}
}

ein_in01,279,25,0	script	#����������	139,1,1,{
	if(AIR_2QUE == 9) {
		mes "�i�������̒���T���΁A";
		mes "�����o�邩���m��Ȃ��j";
		close;
	}
}

ein_in01,264,17,0	script	#�Í��`�F�b�N�@	139,1,1,{
	if(AIR_2QUE == 9) {
		mes "�i��!?�@����́c�c�H";
		mes "�Í��`�F�b�N�@�H";
		mes "�c�c�ǂ����A";
		mes "�Í����ǂꂾ����������";
		mes "�`�F�b�N���Ă����@�B�̂悤���j";
		next;
		mes "-�Í��`�F�b�N�@�𓮂�����-";
		set AIR_2QUE,10;
		close;
	}
}

ein_in01,261,35,0	script	#�Í����͋@	139,1,1,{
	if(AIR_2QUE == 9 || AIR_2QUE == 10) {
		mes "�i��!?�@��������j";
		next;
		mes "�i�c�c�ǂ����Í���";
		mes "�K�v�݂������j";
		next;
		mes "^FF0000[�O���̐��������킹��B";
		mes "0���g�킸�A�d�������Ȃ��B";
		mes "���ɂ�3���ȓ���";
		mes "���͂��Ȃ���΂Ȃ�Ȃ��B";
		mes "10��ԈႦ���ꍇ�A";
		mes "�Í��͕ύX�����B]^000000";
		next;
		if(AIR_2QUE == 9) {
			mes "�i�c�c�Ə����Ă���B";
			mes "���̂܂܈Í������킹��̂�";
			mes "�ƂĂ�����ȁc�c";
			mes "�߂��ɉ����Ȃ����T���Ă݂悤�j";
			close;
		}
		mes "�i�c�c�Ə����Ă���B";
		mes "�������̈Í��`�F�b�N�@�𗘗p����";
		mes "������3���͂��Ă݂悤�j";
		next;
		mes "[�Z�L�����e�B�V�X�e��]";
		mes "�Í�����͂��Ă��������B";
		mes "0���g�킸�d�������Ȃ�";
		mes "�O�̐�������͂��Ă��������B";
		mes "���͔͈͂𒴉߂���l����͂���ƁA";
		mes "�F�؂���������܂��B";
		next;
		set .@cnt,10;
		setarray .@num$[2],"��","�O","�l","��","�Z","��","��","��";
		setarray .@list,1,2,3,4,5,6,7,8,9;
		for(set .@i,0; .@i < 3; set .@i,.@i+1) {
			set .@r,rand(getarraysize(.@list));
			set .@ans[.@i],.@list[.@r];
			deletearray .@list[.@r],1;
		}
		while(1) {
			input .@temp;
			if(.@temp < 100 || .@temp > 999) {
				mes "[�Z�L�����e�B�V�X�e��]";
				mes "���͒l�͈̔͂𒴉߂��܂����B";
				mes "�F�؂͎�������܂��B";
				close;
			}
			setarray .@num,.@temp/100,.@temp%100/10,.@temp%100%10;
			if(.@num[0] == 0 || .@num[1] == 0 || .@num[2] == 0 || .@num[0] == .@num[1] || .@num[1] == .@num[2] || .@num[0] == .@num[2]) {
				mes "[�Z�L�����e�B�V�X�e��]";
				mes "���͂��ꂽ�l��";
				mes "0�������Ă��邩�A";
				mes "�d������Ă��܂��B";
				mes "�ēx���͂��Ă��������B";
				next;
				continue;
			}
			mes "[�Z�L�����e�B�V�X�e��]";
			mes "^FF0000" +strcharinfo(0)+ "^000000�l�����͂������l��";
			mes "^0000FF" +.@num[0]+ "^000000, ^0000FF" +.@num[1]+ "^000000, ^0000FF" +.@num[2]+ "^000000 �ł��B";
			mes "�F�،��ʂ�\�����܂��B";
			next;
			if(.@num[0] == .@ans[0])
				set .@match,.@match+1;
			if(.@num[0] == .@ans[1] || .@num[0] == .@ans[2])
				set .@shift,.@shift+1;
			if(.@num[1] == .@ans[1])
				set .@match,.@match+1;
			if(.@num[1] == .@ans[0] || .@num[1] == .@ans[2])
				set .@shift,.@shift+1;
			if(.@num[2] == .@ans[2])
				set .@match,.@match+1;
			if(.@num[2] == .@ans[0] || .@num[2] == .@ans[1])
				set .@shift,.@shift+1;
			if(.@match == 3)
				break;
			mes "[�Z�L�����e�B�V�X�e��]";
			mes "�G���[�I";
			mes "�Í����Ⴂ�܂��B";
			next;
			mes "[�Í��`�F�b�N�@]";
			mes "�����ƌ����������Ă���̂�^FF0000" +.@match+ "^000000��";
			mes "�������������Ă���̂�^FF0000" +.@shift+ "^000000�ł��B";
			next;
			set .@match,0;
			set .@shift,0;
			set .@cnt,.@cnt-1;
			if(.@cnt > 1)
				mes "�i�`�����X�͂���" +.@num$[.@cnt]+ "�񂾁B";
			else if(.@cnt == 1)
				mes "�i�Ō�̃`�����X���B";
			else {
				mes "�i������^FF0000" +.@ans[0]+ "^000000,^FF0000" +.@ans[1]+ "^000000,^FF0000" +.@ans[2]+ "^000000";
				mes "�������悤���B";
				mes "�������A10��̎��s��";
				mes "�Í����ς���Ă��܂����B�j";
				close;
			}
			mes "�Í��`�F�b�N�@�̌��ʂ�����";
			mes "�Í����l���悤�B�j";
			next;
			continue;
		}
		mes "[�Z�L�����e�B�V�X�e��]";
		mes "�F�؂��m�F����܂����B";
		mes "�����̉{�����\�ƂȂ�܂����B";
		next;
		mes "�i�Í������킹���";
		mes "�����������Ă���h�A���J�����B";
		mes "�������̕����������Ă������A";
		mes "���̒��ł����ɖڗ����ނ�����j";
		next;
		mes "-�o�������g�v���W�F�N�g�@No.3-";
		mes "-�ۈ����x���F1���@C-";
		next;
		mes "-���ӁF���̃v���W�F�N�g�́A������";
		mes "���~���̐S���̃C�~�e�[�V������";
		mes "���삷�邽�߂̃v���W�F�N�g�ł���-";
		next;
		mes "-���̕�����1����C�ɂ�����";
		mes "�ۈ����x���ɂ��A";
		mes "�v���W�F�N�g�Q���҂��������҂�";
		mes "���̕����������ƁA";
		mes "�E�����ɒ������󂯂�̂ŁA";
		mes "���ӂ��Ă�������-";
		next;
		mes "�i����ς�c�c";
		mes "���~���̐S���̃C�~�e�[�V������";
		mes "�����Ɗ֘A���������ȁc�c";
		mes "�ǂ̏��ނ���ǂ�ł݂邩�c�c�j";
		next;
		mes "-�g���A�g���A�g��-";
		next;
		mes "�i�A�b�c�c�N�������I�j";
		next;
		mes "-�������ŏ��ނ����ʂ�ɂ������A";
		mes "�������Ă��܂����悤��-";
		next;
		hideoffnpc "�g���b�N#Air";
		initnpctimer "�g���b�N#Air";
		mes "[�g���b�N]";
		mes "���炵�܂��B";
		mes "�������̕��ł��傤���H";
		mes "���[���@�ւ̌��������Ɂc�c";
		next;
		mes "[�g���b�N]";
		mes "�c�c����!?";
		mes "���o��������悤�ȁc�c";
		mes "�ǂ����ł���c�c";
		next;
		emotion 23,"�g���b�N#Air";
		mes "[�g���b�N]";
		mes "�A�b!!";
		mes "�ȑO�A�Z����̎莆��";
		mes "�͂��Ă��ꂽ���ł��ˁI";
		next;
		mes "[�g���b�N]";
		mes "�c�c�����āA";
		mes "�Z�ɔ�s�D���ǂ�����ē�����";
		mes "�����Ă��܂�����ˁc�c";
		mes "�����̌������Ȃ�A";
		mes "����Ȏ���͂��Ȃ��͂��c�c";
		next;
		mes "[�g���b�N]";
		mes "�����āA�֌W�҈ȊO����Ȃ�";
		mes "�����ɂ���������̂́c�c";
		mes "��܂��ɂł������������܂��ˁB�c�c";
		next;
		mes "[�g���b�N]";
		mes "���A���S���Ă��������B";
		mes "�x�����ĂԂ���͂���܂���B";
		mes "�ꏊ���ꏊ�Ȃ̂ŁA����";
		mes "�ڂ������Ƃ������܂���B";
		next;
		mes "[�g���b�N]";
		mes "�����͎��Ԃ��ƂɌx���������ė��āA";
		mes "�������������`�F�b�N���Ă��܂��B";
		mes "�����O�ɏo�Ă��������B";
		next;
		mes "[�g���b�N]";
		mes "�ڂ����b�͌�Ŏ��̂Ƃ���ŁB";
		mes "�����c�c�}���ł��������I";
		close2;
		set AIR_2QUE,11;
		stopnpctimer "�g���b�N#Air";
		hideonnpc "�g���b�N#Air";
		end;
	}
}

ein_in01,263,35,2	script	�g���b�N#Air	873,{
	end;
OnTimer120000:
	stopnpctimer;
OnInit:
	hideonnpc;
	end;
}