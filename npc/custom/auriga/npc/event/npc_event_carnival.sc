//==============================================================================
//Ragnarok Online - Carnival Event Script (1st)
//==============================================================================
izlude,139,93,3	script	(�L)�œ]��	82,{
	mes "[�œ]���E��]";
	mes "�Ӂc�J�v���T�[�r�X�Ɏd����";
	mes "����č����Ⴑ�̂��肳�܂��c";
	mes "�����I�z�������T�[�r�X��";
	mes "��Ђ��Č����Ă݂���I";
	mes "�����͂��ׂē��Е��S?!";
	mes "�����c�I�ׁI";
	next;
	switch (select("���܂��� -> �Hz","�v�����e��","�Q�t�F��","�t�F�C����","��߂�")) {
	case 1:
		switch(rand(10)) {
			case 0: warp "gl_dun02",234,64; 	break;
			case 1: warp "gl_dun02",219,192; 	break;
			case 2: warp "gl_dun02",221,261; 	break;
			case 3: warp "gl_dun01",215,101; 	break;
			case 4: warp "gl_dun01",237,170; 	break;
			case 5: warp "gl_dun01",163,247; 	break;
			case 6: warp "gl_dun01",64,73; 	break;
			case 7: warp "gl_knt02",100,87; 	break;
			case 8: warp "alde_dun04",173,152; 	break;
			case 9: warp "c_tower04",110,73; 	break;
		}
		end;
	default:
		mes "[�œ]���E��]";
		mes "�߂���";
		mes "�����Ă����Ă���";
		close;
	case 5:
		close;
	}
}

//�J�[�j�o���C�x���g SHOP
geffen,76,135,8	shop	���₵�����l	89,998:-1,999:-1,984:-1
payon,136,185,8	shop	�ޏ�	720,1766:-1