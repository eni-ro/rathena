//====================================================================
//Ragnarok Online   Town Guide Script
//
//  �� @compass -> �~�jMAP�\����on/off
//		0x0001	�v�����e��
//		0x0002	�C�Y���[�h
//		0x0004	�Q�t�F��
//		0x0008	�t�F�C����
//		0x0010	�t�F�C�����|�葺
//		0x0020	�A���x���^
//		0x0040	�����N
//		0x0080	�A�C���u���O
//		0x0100	�A�C���x�t
//		0x0200	���q�^���[��
//		0x0400	�t�B�Q��
//		0x0800	���w��
//		0x1000	�x�C���X
//		0x2000	�u���W���X
//====================================================================

//[�ē��v�� - �v�����e��]
prontera,154,196,4	script	�ē��v��#prontera	105,{
	cutin "prt_soldier",2;
	mes "[�v�����e�� �ē��v��]";
	mes "�悤�����A���[���~�b�h�K�b�c������";
	mes "��������s�v�����e����";
	mes "���B�͂����v�����e���ɂ��炵��";
	mes "���l�B�ׂ̈ɊX�̓��ē������Ă��܂��B";
	mes "������Ȃ���������΁A���ł����B";
	mes "�ē��v���ɕ����Ă��������B";
	next;
	mes "[�v�����e�� �ē��v��]";
	mes "���B�̓��ē������߂ĕ�������";
	mes "�u���m�����v���j���[��";
	mes "�I��ł��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�v�����e�� �ē��v��]";
			mes "����ł͂��ē��������܂��傤�B";
			if(@compass&0x001 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x001;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			next;
			mes "[�v�����e�� �ē��v��]";
			mes "�ē����󂯂����ꏊ��I��ł��������B";
			while(1) {
				next;
				switch (select("���m�M���h","^0000FF�吹��^000000","�R�m�c","���퉮","���","����",
							"���B��","����","�}����","������","�v�����e����","������","������")) {
				case 1:
					mes "[�v�����e�� �ē��v��]";
					mes "���m�]�E�̋Ɩ�������";
					mes "�u���m�M���h�v��";
					mes "�q���s�s�C�Y���[�h�ֈڂ���";
					mes "���݂̃v�����e���ɂ�";
					mes "��Ƃ��c���Ă��܂��B";
					if(@compass&0x001)
						viewpoint 1,237,41,1,0x00FF00;
					continue;
				case 2:
					mes "[�v�����e�� �ē��v��]";
					mes "�A�R���C�g�ւ̓]�E�Ɩ�������";
					mes "�u�吹���v�͊X�̖k��";
					mes "�O���X�ɂ���܂��B";
					mes "���v�����ł�2���̕����ł��B";
					if(@compass&0x001)
						viewpoint 1,236,316,2,0xFF0000;
					continue;
				case 3:
					mes "[�v�����e�� �ē��v��]";
					mes "���[���~�b�h�K�b�c������";
					mes "��s�v�����e�������";
					mes "�u�R�m�c�v�̖{���͊X�̖k��";
					mes "�O���X�ɂ���܂��B";
					mes "���v�����ł�10���̕����ł��B";
					if(@compass&0x001)
						viewpoint 1,46,345,3,0x00FF00;
					continue;
				case 4:
					mes "[�v�����e�� �ē��v��]";
					mes "�u���퉮�v�͕����L���";
					mes "�k�����ɂ���܂��B";
					if(@compass&0x001)
						viewpoint 1,175,220,4,0xFF00FF;
					continue;
				case 5:
					mes "[�v�����e�� �ē��v��]";
					mes "�u����v�͕����L���";
					mes "�k�����ɂ���܂��B";
					if(@compass&0x001)
						viewpoint 1,134,221,5,0xFF00FF;
					continue;
				case 6:
					mes "[�v�����e�� �ē��v��]";
					mes "�u���فv�͕����L���";
					mes "�����Ɛ����ɂ���܂��B";
					if(@compass&0x001) {
						viewpoint 1,204,214,6,0xFF00FF;
						viewpoint 1,107,192,7,0xFF00FF;
					}
					continue;
				case 7:
					mes "[�v�����e�� �ē��v��]";
					mes "�u���B���v�͕����L���";
					mes "�쓌���ɂ���܂��B";
					if(@compass&0x001)
						viewpoint 1,179,184,8,0x00FF00;
					continue;
				case 8:
					mes "[�v�����e�� �ē��v��]";
					mes "�u����v�͕����L���";
					mes "�쓌���A���B���̌㑤�ɂ���܂��B";
					if(@compass&0x001)
						viewpoint 1,208,154,9,0x00FF00;
					continue;
				case 9:
					mes "[�v�����e�� �ē��v��]";
					mes "�u�}���فv�͕����L�ꂩ��";
					mes "�k�֐i�ޓ��̓����Ɛ����ɂ���܂��B";
					if(@compass&0x001) {
						viewpoint 1,120,267,10,0x00FF00;
						viewpoint 1,192,267,11,0x00FF00;
					}
					continue;
				case 10:
					mes "[�v�����e�� �ē��v��]";
					mes "�u�������v�͕����L���";
					mes "�쐼���ɂ���܂��B";
					if(@compass&0x001)
						viewpoint 1,133,183,12,0x00FF00;
					continue;
				case 11:
					mes "[�v�����e�� �ē��v��]";
					mes "�u�v�����e����v�͊X�̖k";
					mes "����n�����Ƃ���ɂ���܂��B";
					mes "���v�����ł�12���̕����ł��B";
					mes "��̌�傩��O�֏o���";
					mes "�k�v�����e���n���֌q�����Ă��܂��B";
					if(@compass&0x001)
						viewpoint 1,156,360,13,0x00FF00;
					continue;
				case 12:
					mes "[�v�����e�� �ē��v��]";
					mes "�u�������v�͊X�̓쓌";
					mes "�O���X�ɂ���܂��B";
					mes "���v�����ł�7���̕����ł��B";
					if(@compass&0x001)
						viewpoint 1,75,91,14,0x00FF00;
					continue;
				case 13:
					mes "[�v�����e�� �ē��v��]";
					mes "�ʒu�W����������������";
					mes "�u�~�jMAP��̈ʒu�\���������v��";
					mes "�I��ł��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,237,41,1,0x00FF00;
			viewpoint 2,236,316,2,0xFF0000;
			viewpoint 2,46,345,3,0x00FF00;
			viewpoint 2,175,220,4,0xFF00FF;
			viewpoint 2,8,134,5,0xFF00FF;
			viewpoint 2,204,214,6,0xFF00FF;
			viewpoint 2,107,192,7,0xFF00FF;
			viewpoint 2,179,184,8,0x00FF00;
			viewpoint 2,208,154,9,0x00FF00;
			viewpoint 2,120,267,10,0x00FF00;
			viewpoint 2,192,267,11,0x00FF00;
			viewpoint 2,133,183,12,0x00FF00;
			viewpoint 2,156,360,13,0x00FF00;
			viewpoint 2,75,91,14,0x00FF00;
			set @compass,@compass&~0x001;
			set .@flag,0;
			continue;
		case 3:
			mes "[�v�����e�� �ē��v��]";
			mes "�����̃A�i���O�ē���������";
			mes "�m�肽���ꏊ���~�jMAP��";
			mes "�\�����Ă����A�L��ē��V�X�e����";
			mes "���p�����Ő�[�f�W�^���ē�������";
			mes "�i�����܂����B";
			next;
			mes "[�v�����e�� �ē��v��]";
			mes "���[���~�b�h�K�b�c������";
			mes "���΂炵�����@�ƁA�Ȋw�Z�p��";
			mes "�g�ݍ��킹�ō��o����";
			mes "���̍L��ē��V�X�e���̐��\��";
			mes "���Ђ����������B";
			next;
			mes "[�v�����e�� �ē��v��]";
			mes "�{�ē��������p���������O��";
			mes "�܂����j�^�[�E��ɂ���";
			mes "�~�jMAP�������������B";
			next;
			mes "[�v�����e�� �ē��v��]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�B���h�E��";
			mes "�umap�v�{�^�����N���b�N���ĉ������B";
			next;
			mes "[�v�����e�� �ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes "^3355FF -^000000�{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肵�ĉ������B";
			continue;
		case 4:
			mes "[�v�����e�� �ē��v��]";
			mes "����ł͂悢�����I";
			close2;
			cutin "prt_soldier",255;
			end;
		}
	}
}

prontera,282,208,2	duplicate(�ē��v��#prontera)	����-�ē��v��	105
prontera,29,200,6	duplicate(�ē��v��#prontera)	����-�ē��v��	105
prontera,160,29,0	duplicate(�ē��v��#prontera)	���-�ē��v��	105
prontera,151,330,4	duplicate(�ē��v��#prontera)	�k��-�ē��v��	105


//----------------------------------------------------------------------
//[�ē��v�� - �C�Y���[�h]

izlude,123,87,6	script	�ē��v��	105,{
	cutin "prt_soldier",2;
	mes "[�C�Y���[�h�ē��v��]";
	mes "�q���s�s�C�Y���[�h�ɂ悤�����I";
	mes "���͂��̃C�Y���[�h�̓��ē���";
	mes "�S�����Ă�����v�������ł��B";
	mes "�����̈ʒu�ɂ��Ēm�肽���Ȃ�";
	mes "���ł������Ă��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�C�Y���[�h�ē��v��]";
			mes "����ł͈ē����܂��B";
			if(@compass&0x002 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x002;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000���m�M���h^000000","���m����","�A���[�i","�D����","���퉮","���","������")) {
				case 1:
					mes "[�C�Y���[�h�ē��v��]";
					mes "���m�ɓ]�E�������̂ł����H";
					if(@compass&0x002)
						viewpoint 1,52,140,1,0xFF0000;
					continue;
				case 2:
					mes "[�C�Y���[�h�ē��v��]";
					mes "���m�֘A�̎d������������";
					mes "���m����́A�����ɂ���܂��B";
					if(@compass&0x002)
						viewpoint 1,214,130,2,0x00FF00;
					continue;
				case 3:
					mes "[�C�Y���[�h�ē��v��]";
					mes "�C�Y���[�h�̖����u�A���[�i�v��";
					mes "�k�ɂ���܂��B12�������ł��B";
					mes "���̌Z�M�������̊֌W�҂Ȃ�ł�����";
					mes "�A���[�i�͂܂������J�炵���ł��B";
					mes "���s���Ă����ʂ��Ǝv���܂��B";
					if(@compass&0x002)
						viewpoint 1,128,225,3,0x00FF00;
					continue;
				case 4:
					mes "[�C�Y���[�h�ē��v��]";
					mes "�u�A���x���^�v��u�o�C�������v��";
					mes "�s�����Ƃ��ł���D����͖k����";
					mes "����܂��BMAP�ł�2�������ł��B";
					if(@compass&0x002)
						viewpoint 1,200,180,4,0xFF0000;
					continue;
				case 5:
					mes "[�C�Y���[�h�ē��v��]";
					mes "���퉮�͖k���ɂ���܂��B";
					mes "�߂��ł��̂ŁA����������ł��傤�B";
					if(@compass&0x002)
						viewpoint 1,111,149,5,0xFF00FF;
					continue;
				case 6:
					mes "[�C�Y���[�h�ē��v��]";
					mes "����͖k���ɂ���܂��B";
					mes "�߂��ł��̂ŁA����������ł��傤�B";
					if(@compass&0x002)
						viewpoint 1,148,148,6,0xFF00FF;
					continue;
				case 7:
					mes "[�C�Y���[�h �ē��v��]";
					mes "�\���ʒu�����������Ȃ�";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,52,140,1,0xFF0000;
			viewpoint 2,214,130,2,0x00FF00;
			viewpoint 2,128,225,3,0x00FF00;
			viewpoint 2,200,180,4,0xFF0000;
			viewpoint 2,111,149,5,0xFF00FF;
			viewpoint 2,148,148,6,0xFF00FF;
			set @compass,@compass&~0x002;
			set .@flag,0;
			continue;
		case 3:
			mes "[�C�Y���[�h�ē��v��]";
			mes "�����̃A�i���O�ē���������";
			mes "�m�肽���ꏊ���~�jMAP��";
			mes "�\�����Ă����A�L��ē��V�X�e����";
			mes "���p�����Ő�[�f�W�^���ē�������";
			mes "�i�����܂����B";
			next;
			mes "[�C�Y���[�h�ē��v��]";
			mes "���[���~�b�h�K�b�c������";
			mes "���΂炵�����@�ƁA�Ȋw�Z�p��";
			mes "�g�ݍ��킹�ō��o����";
			mes "���̍L��ē��V�X�e���̐��\��";
			mes "���Ђ������������B";
			next;
			mes "[�C�Y���[�h�ē��v��]";
			mes "�{�ē��������p���������O��";
			mes "�܂����j�^�[�E��ɂ���";
			mes "�~�jMAP�������������B";
			next;
			mes "[�C�Y���[�h�ē��v��]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�B���h�E��";
			mes "�umap�v�{�^�����N���b�N���ĉ������B";
			next;
			mes "[�C�Y���[�h�ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes " -�{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肵�ĉ������B";
			continue;
		case 4:
			mes "[�C�Y���[�h�ē��v��]";
			mes "���������ꏊ����������";
			mes "���ł������Ă��������B";
			close2;
			cutin "prt_soldier",255;
			end;
		}
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �Q�t�F��]

geffen,203,116,0	script	�ē��v��#geffen	705,{
	cutin "gef_soldier",2;
	mes "[�Q�t�F���ē��v��]";
	mes "���@�̓s�s�Q�t�F���ɗǂ����Q��ꂽ�B";
	mes "�䓙�͂����A�Q�t�F���ɎQ����";
	mes "���l�̂��߂ɊX�̈ē������Ă���B";
	mes "�X�̂��ƂȂ牽�ł��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�Q�t�F���ē��v��]";
			mes "����ł͈ē����������B";
			if(@compass&0x004 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c�����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x004;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000���@�w�Z^000000","�b�艮","���퉮","���","����","����","������")) {
				case 1:
					mes "[�Q�t�F���ē��v��]";
					mes "�}�W�V�����̓]�E�Ɩ���";
					mes "��������u���@�w�Z�v�ł���B";
					if(@compass&0x004)
						viewpoint 1,61,180,1,0xFF0000;
					continue;
				case 2:
					mes "[�Q�t�F���ē��v��]";
					mes "�u�u���b�N�X�~�X�M���h�v��";
					mes "MAP�̒��S����쓌������";
					mes "�ʒu���Ă���B";
					if(@compass&0x004)
						viewpoint 1,182,59,2,0x00FF00;
					continue;
				case 3:
					mes "[�Q�t�F���ē��v��]";
					mes "�u���퉮�v��MAP�̒��S����";
					mes "�k�������Ɉʒu���Ă���B";
					if(@compass&0x004)
						viewpoint 1,99,140,3,0xFF00FF;
					continue;
				case 4:
					mes "[�Q�t�F���ē��v��]";
					mes "�u����v��MAP�̒��S����";
					mes "�쐼�����Ɉʒu���Ă���B";
					if(@compass&0x004)
						viewpoint 1,44,86,4,0xFF00FF;
					continue;
				case 5:
					mes "[�Q�t�F���ē��v��]";
					mes "�u����v��MAP�̒��S����";
					mes "�k�������Ɉʒu���Ă���B";
					if(@compass&0x004)
						viewpoint 1,138,138,5,0xFF00FF;
					continue;
				case 6:
					mes "[�Q�t�F���ē��v��]";
					mes "�u���فv��MAP�̒��S����";
					mes "�k�������Ɉʒu���Ă���B";
					if(@compass&0x004)
						viewpoint 1,172,174,6,0xFF00FF;
					continue;
				case 7:
					mes "[�Q�t�F���ē��v��]";
					mes "�ʒu�\�������������ꍇ��";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I�����邪�X�����B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,61,180,1,0xFF0000;
			viewpoint 2,182,59,2,0x00FF00;
			viewpoint 2,99,140,3,0xFF00FF;
			viewpoint 2,44,86,4,0xFF00FF;
			viewpoint 2,138,138,5,0xFF00FF;
			viewpoint 2,172,174,6,0xFF00FF;
			set @compass,@compass&~0x004;
			set .@flag,0;
			continue;
		case 3:
			mes "[�Q�t�F�� �ē��v��]";
			mes "�����̃A�i���O�ē�������p�~��";
			mes "�m�肽���ꏊ���~�jMAP�ɕ\�������";
			mes "�悤�A�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�f�W�^���ē�������";
			mes "�ύX���ꂽ�̂��B";
			next;
			mes "[�Q�t�F�� �ē��v��]";
			mes "���[���~�b�h�K�b�c�����ɑ��݂���";
			//mes "���邱�̍L�g�ē��V�X�e���̐��\��";	//�{�I�d�l
			mes "���΂炵�����@�ƁA�Ȋw�Z�p�̐���";
			mes "���邱�̍L��ē��V�X�e���̐��\��";
			mes "�����Ƃ����ɂȂ�ƋX�����B";
			next;
			mes "[�Q�t�F�� �ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�jMAP���m�F���Ē��������B";
			mes "�~�jMAP�������Ȃ��ꍇ��";
			mes "�uctrl+tab�v�A�܂���";
			mes "��{�E�B���h�E�Łumap�v";
			mes "�{�^�����N���b�N����Ηǂ��B";
			next;
			mes "[�Q�t�F�� �ē��v��]";
			mes "�~�jMAP����������";
			mes "�u-�v�{�^�����ēx�N���b�N���A";
			mes "�X�S�̂�������悤�ɐݒ肷�邪";
			mes "�ǂ��낤�B";
			continue;
		case 4:
			mes "[�Q�t�F���ē��v��]";
			mes "�ǂ������c�c";
			close2;
			cutin "gef_soldier",255;
			end;
		}
	}
}

geffen,118,62,0	duplicate(�ē��v��#geffen)	�ē��v��	705


//----------------------------------------------------------------------
//[�ē��v�� - �t�F�C����]

payon,162,67,4	script	�ē��v��	708,{
	cutin "pay_soldier",2;
	mes "[�t�F�C�����ē��v��]";
	mes "�R�x�s�s�t�F�C�����ɂ悤�����B";
	mes "���B�͂����t�F�C�����ɂ��炵��";
	mes "���l����B�̂��߂ɁA���̈ē���";
	mes "���Ă���܂��B";
	while(1) {
		next;
		switch (select("���̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�t�F�C�����ē��v��]";
			mes "����ł͂��ē����܂��B";
			if(@compass&0x008 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x008;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000�A�[�`���[�M���h^000000","����E�h�","���","����","�����{",
									"�{�a�̑O��","�{�a�̕ʊ�","�|��̊�","���B��","������")) {
				case 1:
					mes "[�t�F�C�����ē��v��]";
					mes "�A�[�`���[�]�E�Ɩ�����������";
					mes "�u�A�[�`���[�M���h�v�ł��B";
					mes "�|�葺�̖k�����ʂɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,228,325,1,0xFF0000;
					continue;
				case 2:
					mes "[�t�F�C�����ē��v��]";
					mes "�u����E�h��v��";
					mes "���̈�̈ʒu�ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,138,158,2,0xFF00FF;
					continue;
				case 3:
					mes "[�t�F�C�����ē��v��]";
					mes "�u����v�͂��̈�̖k�ɂ���܂��B";
					mes "�܂��A���̈�̐����̌����̒��ɂ�";
					mes "����܂��B";
					if(@compass&0x008)
						viewpoint 1,149,87,3,0xFF00FF;
					continue;
				case 4:
					mes "[�t�F�C�����ē��v��]";
					mes "�u����v�͂��̈�̓����";
					mes "�����ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,220,117,4,0xFF00FF;
					continue;
				case 5:
					mes "[�t�F�C�����ē��v��]";
					mes "�u�����{�v�͂��̈��";
					mes "�k���ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,156,243,5,0x00FF00;
					continue;
				case 6:
					mes "[�t�F�C�����ē��v��]";
					mes "�u�{�a�̑O��v�͂��̈��";
					mes "�k���̕����ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,107,320,6,0x00FF00;
					continue;
				case 7:
					mes "[�t�F�C�����ē��v��]";
					mes "�u�{�a�̕ʊفv�͂��̈��";
					mes "�����ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,135,194,7,0x00FF00;
					continue;
				case 8:
					mes "[�t�F�C�����ē��v��]";
					mes "�u�|��̊ԁv�͂��̈��";
					mes "�k���ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,155,324,8,0x00FF00;
					continue;
				case 9:
					mes "[�t�F�C�����ē��v��]";
					mes "�u���B���v�͂��̈�̈ʒu�ɂ���܂��B";
					if(@compass&0x008)
						viewpoint 1,144,169,9,0x00FF00;
					continue;
				case 10:
					mes "[�t�F�C�����ē��v��]";
					mes "�ʒu�\�������������ꍇ��";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,228,325,1,0xFF0000;
			viewpoint 2,138,158,2,0xFF00FF;
			viewpoint 2,149,87,3,0xFF00FF;
			viewpoint 2,220,117,4,0xFF00FF;
			viewpoint 2,156,243,5,0x00FF00;
			viewpoint 2,107,320,6,0x00FF00;
			viewpoint 2,135,194,7,0x00FF00;
			viewpoint 2,155,324,8,0x00FF00;
			viewpoint 2,144,169,9,0x00FF00;
			set @compass,@compass&~0x008;
			set .@flag,0;
			continue;
		case 3:
			mes "[�t�F�C�����ē��v��]";
			mes "�����̃A�i���O�ē�������p�~���A";
			mes "�m�肽���ꏊ���~�jMAP�ɕ\������";
			mes "�����A�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�f�W�^���ē�������";
			mes "�ς������ł��B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "���[���~�b�h�K�b�c�����ɑ��݂���";
			mes "���΂炵�����@�ƁA�Ȋw�Z�p�̐���";
			//mes "���邱�̍L�g�����V�X�e���̐��\��";	//�{�I�d�l
			mes "���邱�̍L�挟���V�X�e���̐��\��";
			mes "���ڂ��̖ڂŌ��Ă��������B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�jMAP���m�F���Ă��������B";
			mes "�~�jMAP�������Ȃ�������A";
			mes "�uctrl+tab�v�܂���";
			mes "��{�E�C���h�E�Łumap�v";
			mes "�{�^�����N���b�N���܂��B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "�~�jMAP����������";
			mes "�u-�v�{�^�����ēx�N���b�N���āA";
			mes "���S�̂�������悤�ɐݒ肵������";
			mes "�ǂ��ł��傤�B";
			continue;
		case 4:
			mes "[�t�F�C�����ē��v��]";
			mes "�ǂ����ɂȂ�܂��悤�ɁB";
			close2;
			cutin "pay_soldier",255;
			end;
		}
	}
}

pay_arche,85,30,2	script	�ē��v��	708,{
	cutin "pay_soldier",2;
	mes "[�t�F�C�����ē��v��]";
	mes "�R�x�s�s�t�F�C�����ɂ悤�����B";
	mes "���͂����t�F�C�����ɂ��炵��";
	mes "���l����B�̂��߂ɁA�X�̈ē���";
	mes "���Ă���܂��B";
	while(1) {
		next;
		switch (select("���̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�t�F�C�����ē��v��]";
			mes "����ł͂��ē����܂��B";
			if(@compass&0x010 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x010;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000�A�[�`���[�M���h^000000","���","�t�F�C�����_���W����","������")) {
				case 1:
					mes "[�t�F�C�����ē��v��]";
					mes "�A�[�`���[�]�E�Ɩ�����������";
					mes "�u�A�[�`���[�M���h�v�ł��B";
					mes "�|�葺�̖k�����ʂɂ���܂��B";
					if(@compass&0x010)
						viewpoint 1,144,164,1,0xFF0000;
					continue;
				case 2:
					mes "[�t�F�C�����ē��v��]";
					mes "�u����v��MAP�̒��S����";
					mes "�k�����ɂ���܂��B";
					if(@compass&0x010)
						viewpoint 1,71,156,2,0xFF00FF;
					continue;
				case 3:
					mes "[�t�F�C�����ē��v��]";
					mes "�u�t�F�C�����_���W�����v��MAP��";
					mes "���S����k�����ʂɂ���܂��B";
					if(@compass&0x010)
						viewpoint 1,34,132,3,0xFFFFFF;
					continue;
				case 4:
					mes "[�t�F�C�����ē��v��]";
					mes "�ʒu�\�������������ꍇ��";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,144,164,1,0xFF0000;
			viewpoint 2,71,156,2,0xFF00FF;
			viewpoint 2,34,132,3,0xFFFFFF;
			set @compass,@compass&~0x010;
			set .@flag,0;
			continue;
		case 3:
			mes "[�t�F�C�����ē��v��]";
			mes "�����̃A�i���O�ē�������p�~���A";
			mes "�m�肽���ꏊ���~�jMAP�ɕ\������";
			mes "�����A�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�f�W�^���ē�������";
			mes "�ς������ł��B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "���[���~�b�h�K�b�c�����ɑ��݂���";
			mes "���΂炵�����@�ƁA�Ȋw�Z�p�̐���";
			mes "���邱�̍L�挟���V�X�e���̐��\��";
			mes "���ڂ��̖ڂŌ��Ă��������B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�jMAP���m�F���Ă��������B";
			mes "�~�jMAP�������Ȃ�������A";
			mes "�uctrl+tab�v�܂���";
			mes "��{�E�B���h�E�Łumap�v";
			mes "�{�^�����N���b�N���܂��B";
			next;
			mes "[�t�F�C�����ē��v��]";
			mes "�~�jMAP����������";
			mes "�u-�v�{�^�����ēx�N���b�N���āA";
			mes "���S�̂�������悤�ɐݒ肵������";
			mes "�ǂ��ł��傤�B";
			continue;
		case 4:
			mes "[�t�F�C�����ē��v��]";
			mes "�ǂ����ɂȂ�܂��悤�ɁB";
			close2;
			cutin "pay_soldier",255;
			end;
		}
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �A���x���^]

alberta,23,238,4	script	�ē��v��#alberta	105,{
	cutin "prt_soldier",2;
	mes "[�A���x���^�ē��v��]";
	mes "�`�̓s�s�A���x���^�ɂ悤�����B";
	mes "���B�͂����A���x���^�ɖK�ꂽ";
	mes "���l�B�̂��߂ɁA�X�̈ē�������";
	mes "����܂��B";
	mes "�X�̊e���ɂ��Ēm�肽��������";
	mes "���ł������Ă��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�A���x���^�ē��v��]";
			mes "�m�肽���ꏊ��I��ŉ������B";
			if(@compass&0x020 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x020;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000���l����^000000","���퉮","���","����","������")) {
				case 1:
					mes "[�A���x���^�ē��v��]";
					mes "���l�]�E�Ɩ�����������";
					mes "�u���l�g���v�ł��B";
					if(@compass&0x020)
						viewpoint 1,33,41,1,0xFF0000;
					continue;
				case 2:
					mes "[�A���x���^�ē��v��]";
					mes "�u���퉮�v��MAP�̓�[��";
					mes "����܂��B";
					if(@compass&0x020)
						viewpoint 1,117,37,2,0xFF00FF;
					continue;
				case 3:
					mes "[�A���x���^�ē��v��]";
					mes "�u����v��MAP�̒��S�t�߂�";
					mes "����܂��B";
					if(@compass&0x020)
						viewpoint 1,98,154,3,0xFF00FF;
					continue;
				case 4:
					mes "[�A���x���^�ē��v��]";
					//mes "�u���فv��MAP�̖k���ɂ��肠�܂��B";	//�{�I�d�l
					mes "�u���فv��MAP�̖k���ɂ���܂��B";
					if(@compass&0x020)
						viewpoint 1,65,233,4,0xFF00FF;
					continue;
				case 5:
					mes "[�A���x���^�ē��v��]";
					mes "�ʒu�\�������������ꍇ��";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,33,41,1,0xFF0000;
			viewpoint 2,117,37,2,0xFF00FF;
			viewpoint 2,98,154,3,0xFF00FF;
			viewpoint 2,65,233,4,0xFF00FF;
			set @compass,@compass&~0x020;
			set .@flag,0;
			continue;
		case 3:
			mes "[�A���x���^�ē��v��]";
			mes "�����̃A�i���O�ē�������p�~���A";
			mes "�m�肽���ꏊ���~�jMAP�ɕ\������";
			mes "�����A�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�f�W�^���ē�������";
			mes "�ς������ł��B";
			next;
			mes "[�A���x���^�ē��v��]";
			mes "���[���~�b�h�K�b�c�����ɑ��݂���";
			mes "���΂炵�����@�ƁA�Ȋw�Z�p�̐���";
			//mes "���邱�̍L�g�����V�X�e���̐��\��";	//�{�I�d�l
			mes "���邱�̍L�挟���V�X�e���̐��\��";
			mes "���ڂ��̖ڂŌ��Ă��������B";
			next;
			mes "[�A���x���^�ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�jMAP���m�F���Ă��������B";
			mes "�~�jMAP�������Ȃ�������A";
			mes "�uctrl+tab�v�܂���";
			mes "��{�E�B���h�E�Łumap�v";
			mes "�{�^�����N���b�N���܂��B";
			next;
			mes "[�A���x���^�ē��v��]";
			mes "�~�jMAP����������";
			mes "�u-�v�{�^�����ēx�N���b�N���āA";
			mes "�X�S�̂�������悤�ɐݒ肵������";
			mes "�ǂ��ł��傤�B";
			continue;
		case 4:
			mes "[�A���x���^�ē��v��]";
			mes "�ǂ������B";
			close2;
			cutin "prt_soldier",255;
			end;
		}
	}
}

alberta,120,60,3	duplicate(�ē��v��#alberta)	�ē��v��	105


//----------------------------------------------------------------------
//[�ē��v�� - �����N]

morocc,153,286,6	script	�ē��v��#morocc	707,{
	cutin "moc_soldier",2;
	mes "[�����N�ē��v��]";
	mes "�c�c�悤�����A�Ӌ��̒n�����N�ցB";
	mes "���͂��������N�ɗ������l�̂��߂�";
	mes "�X�̈ē������Ă���ҁB";
	mes "����������������΁A�ǂ����B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�����N�ē��v��]";
			mes "�c�c�m�肽���ꏊ�́H";
			if(@compass&0x040 == 0 && .@flag == 0) {
				mes "�~�jMAP�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x040;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("^FF0000�V�[�t�M���h^000000","���퉮","����","����","�b���M���h","������")) {
				case 1:
					mes "[�����N�ē��v��]";
					mes "�V�[�t�]�E�Ɩ�����������";
					mes "�u�V�[�t�M���h�v�́A�s���~�b�h�̒���";
					mes "����c�c";
					if(@compass&0x040)
						viewpoint 1,24,297,1,0xFF0000;
					continue;
				case 2:
					mes "[�����N�ē��v��]";
					mes "�u���퉮�v�͊X�̓쓌�ɂ���B";
					if(@compass&0x040)
						viewpoint 1,253,56,2,0xFF00FF;
					continue;
				case 3:
					mes "[�����N�ē��v��]";
					mes "�u���فv�͊X�̓�Ɩk���ɂ���B";
					if(@compass&0x040)
						viewpoint 1,197,66,3,0xFF00FF;
					continue;
				case 4:
					mes "[�����N�ē��v��]";
					mes "�u����v�͊X�̖k���ɂ���B";
					if(@compass&0x040)
						viewpoint 1,52,259,4,0xFF00FF;
					continue;
				case 5:
					mes "[�����N�ē��v��]";
					mes "�u�b���M���h�v�͊X�̓����ɂ���B";
					if(@compass&0x040)
						viewpoint 1,284,171,5,0x00FF00;
					continue;
				case 6:
					mes "[�����N�ē��v��]";
					mes "�ʒu�\�������������ꍇ��";
					mes "�u�~�jMAP��̈ʒu�\���������v";
					mes "��I������΂����B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,24,297,1,0xFF0000;
			viewpoint 2,253,56,2,0xFF00FF;
			viewpoint 2,197,66,3,0xFF00FF;
			viewpoint 2,52,259,4,0xFF00FF;
			viewpoint 2,284,171,5,0x00FF00;
			set @compass,@compass&~0x040;
			set .@flag,0;
			continue;
		case 3:
			mes "[�����N�ē��v��]";
			mes "�����̃A�i���O�ē�������p�~��";
			mes "�m�肽���ꏊ���~�jMAP�ɕ\������";
			mes "�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�f�W�^���ē�������";
			mes "�ύX���ꂽ�B";
			next;
			mes "[�����N�ē��v��]";
			mes "���[���~�b�h�K�b�c�����ɑ��݂���";
			mes "���@�ƉȊw�Z�p�̐��ł���";
			mes "���̍L�挟���V�X�e���̐��\��";
			mes "���ڂ��̖ڂŊm���߂Ăق����B";
			next;
			mes "[�����N�ē��v��]";
			mes "�܂��A��ʉE��ɂ���";
			mes "�~�jMAP���m�F���Ă���B";
			mes "�~�jMAP�������Ȃ��ꍇ�A";
			mes "�uctrl+tab�v�܂���";
			mes "��{�E�B���h�E�Łumap�v";
			mes "�{�^�����N���b�N����΂����B";
			next;
			mes "[�����N�ē��v��]";
			mes "�~�jMAP����������";
			mes "�u-�v�{�^�����ēx�N���b�N��";
			mes "�X�S�̂�������悤�ɐݒ肷���";
			mes "�ǂ����낤�B";
			continue;
		case 4:
			mes "[�����N�ē��v��]";
			mes "�ǂ��A�����c�c";
			close2;
			cutin "moc_soldier",255;
			end;
		}
	}
}

morocc,54,97,6	duplicate(�ē��v��#morocc)	�ē��v��	707


//----------------------------------------------------------------------
//[�ē��v�� - �A���f�o����]

aldebaran,139,63,4	script	���m	105,{
	cutin "prt_soldier",2;
	mes "[�A���f�o���������]";
	mes "���́A�ǂ��ɂł����镽�}��";
	mes "������ł͂���܂���B";
	mes "���O�́u�������v�ł����ǁc�c";
	mes "�Ƃɂ����A���]�݂Ƃ����";
	mes "�X�̂��ē������Ă�������";
	mes "�܂���B";
	next;
	if(select("�ē����Ă��炤","��߂�")==1) {
		viewpoint 1,57,222,1,0xFF6633;
		viewpoint 1,73,196,2,0x0000FF;
		viewpoint 1,224,224,3,0x00FFFF;
		viewpoint 1,233,106,4,0x515151;
		viewpoint 1,197,71,5,0x3355FF;
		viewpoint 1,60,60,6,0xFF5555;
		mes "^FF6633+^000000 -> �J�v���{��";
		mes "^0000FF+^000000 -> ���퉮";
		mes "^00FFFF+^000000 -> �\�[�T���[�M���h (Closed)";
		mes "^515151+^000000 -> ����";
		mes "^3355FF+^000000 -> ���";
		mes "^FF5555+^000000 -> �B���p�t�M���h";
	}
	else {
		mes "[�A���f�o���������]";
		mes "�A���f�o������";
		mes "�����������܂��I";
	}
	close2;
	cutin "prt_soldier",255;
	end;
}

aldebaran,241,136,2	script	���m	105,{
	cutin "prt_soldier",2;
	mes "[�A���f�o���������]";
	mes "���́A�ǂ��ɂł����镽�}��";
	mes "������ł͂���܂���B";
	mes "���O�́u�������v�ł����ǁc�c";
	mes "�Ƃɂ����A���]�݂Ƃ����";
	mes "�X�̂��ē������Ă�������";
	mes "�܂���B";
	next;
	switch (select("�J�v���{��","���퉮","�\�[�T���[�M���h","����","���","�B���p�t�M���h","��߂�")) {
	case 1:
		viewpoint 1,57,222,1,0xFF6633;
		mes "^FF6633+^000000 -> �J�v���{��";
		break;
	case 2:
		viewpoint 1,73,196,2,0x0000FF;
		mes "^0000FF+^000000 -> ���퉮";
		break;
	case 3:
		viewpoint 1,224,224,3,0x00FFFF;
		mes "^00FFFF+^000000 -> �\�[�T���[�M���h (Closed)";
		break;
	case 4:
		viewpoint 1,233,106,4,0x515151;
		mes "^515151+^000000 -> ����";
		break;
	case 5:
		viewpoint 1,197,71,5,0x3355FF;
		mes "^3355FF+^000000 -> ���";
		break;
	case 6:
		viewpoint 1,60,60,6,0xFF5555;
		mes "^FF5555+^000000 -> �B���p�t�M���h";
		break;
	case 7:
		mes "[�A���f�o���������]";
		mes "�A���f�o������";
		mes "�����������܂��I";
		break;
	}
	close2;
	cutin "prt_soldier",255;
	end;
}

//----------------------------------------------------------------------
//[�ē��v�� - �R���h]
comodo,322,178,4	script	�R���h�K�C�h#�R�R��	700,{
	mes "[���Z��"+strnpcinfo(2)+"]";	//#�ȍ~�̕�������Q��
	mes "���y�̖邪24���ԑ���";
	mes "���ƌ��z�̑��R���h�ւ悤�����I";
	mes "�������ē����Ă��������܂��B";
	mes "�ʒu����m�肽��������";
	mes "���ł������Ă��������ˁB";
	next;
	switch (select("�J�W�m","�t���_���X�X�e�[�W ^3355FF(�_���T�[�]�E��)^000000","����X","����X",
				"���Y���i�X","�J�v���T�[�r�X�����x��","�����̉�","���� (PUB)","�L�����v��","��b����߂�")) {
	case 1:
		viewpoint 1,140,98,1,0xFF6633;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^FF6633+^000000 -> �J�W�m";
		mes "�R���h�������ƃR���h�炵���I";
		mes "���l�����̔�������������c";
		mes "�������X�������O�ȏ����̏�B";
		mes "���ꂪ�u�J�W�m�v�I";
		break;
	case 2:
		viewpoint 1,188,168,2,0x0000FF;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^0000FF+^000000 -> �t���_���X�X�e�[�W";
		mes "�t���t���` �t���t���`";
		mes "����Ɋ��ꂽ��_���T�[�ւ̓]�E��";
		mes "�l���Ă݂Ă͂������ł��傤�B";
		mes "�u�t���_���X�X�e�[�W�v";
		mes "^3355FF(�_���T�[�]�E��)^000000";
		break;
	case 3:
		viewpoint 1,266,70,3,0x00FFFF;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^00FFFF+^000000 -> ����X";
		mes "�R���h�ɂ̓R���h������";
		mes "�A�C�e��������܂��B";
		mes "�u�R���h����X�v";
		break;
	case 4:
		viewpoint 1,86,128,4,0x515151;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^515151+^000000 -> ����X";
		mes "�R���h�ɂ̓R���h������";
		mes "�A�C�e��������܂��B";
		mes "�u�R���h����X�v";
		break;
	case 5:
		viewpoint 1,298,124,5,0x3355FF;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^3355FF+^000000 -> ���Y���i�X";
		mes "�R���h�ɂ̓R���h������";
		mes "�A�C�e��������܂�";
		mes "�u�R���h���Y���i�X�v";
		break;
	case 6:
		viewpoint 1,136,202,6,0xFF5555;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^FF5555+^000000 -> �J�v���T�[�r�X�����x���Z���^�[";
		mes "�~�b�h�K���h�嗤������S������";
		mes "�u�J�v���T�[�r�X�����x���Z���^�[�v";
		mes "���R���h�ɂ���܂��B";
		break;
	case 7:
		viewpoint 1,114,294,7,0xFF5555;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^FF5555+^000000 -> �����̉�";
		mes "�R���h�����l�����������鏊�ł��B";
		mes "�������Ȃ����R���h�ɐ[��������";
		mes "�������ł�����A���񑺒��l��";
		mes "������Ă݂Ă͂������ł��傤�B";
		break;
	case 8:
		viewpoint 1,166,298,8,0xFF5555;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^FF5555+^000000 -> ���� (PUB)";
		mes "���E�e�n�̗��l����������";
		mes "�ӌ��������������ł��B";
		mes "�R���h�̖����p�u�́A";
		mes "�i�ʂ̕��͋C�������o���Ă��܂���B";
		break;
	case 9:
		viewpoint 1,210,308,9,0xFF5555;
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "^FF5555+^000000 -> �L�����v��";
		mes "���ɂ͉Ƒ����m�c���ɂ͗��l���m�c";
		mes "�y�����ЂƂƂ���n��グ��";
		mes "�o�[�x�L���[�L�����v���B";
		mes "�R���h���������u�쐶���o�[�x�L���[�v";
		mes "�𖡂키���Ƃ��ł���B��̏ꏊ�I";
		break;
	case 10:
		mes "[���Z��"+strnpcinfo(2)+"]";
		mes "�R���h�͓��A�̒��ɑ��݂��Ă���";
		mes "������������Ȃ��̂ŁA";
		mes "24���ԁA1�����Â���ł��B";
		mes "�R���h�̏Z�������͂��̂悤�ȓ�����";
		mes "���p�����ό����i�ŏ�������";
		mes "�������Ă����ł��B";
		break;
	}
	close;
}

comodo,176,350,4	duplicate(�R���h�K�C�h#�R�R��)	�R���h�K�C�h#�m�b�R�R	700
comodo,37,219,4	duplicate(�R���h�K�C�h#�R�R��)	�R���h�K�C�h#�p�p��	700


//----------------------------------------------------------------------
//[�ē��v�� - �W���m�[]

yuno,153,47,4	script	"�W���m�[�K�C�h"	700,{
	mes "[�W���m�[�K�C�h]";
	mes "�ߋ���m��c�c";
	mes "���݂����߁c�c";
	mes "������\�m����c�c";
	mes "�����͌��҂����̓s�s";
	mes "- �W���m�[ -";
	mes "�W���m�[�ɂ悤����";
	next;
	switch (select("����h��X","����X","�Z�[�W�L���b�X�� (�Z�[�W�]�E��)","���X�ʂ�","�����L��",
				"���a���}����","�V���o�C�`�F�����@�A�J�f�~�[","�����X�^�[������","��b����߂�")) {
	case 1:
		viewpoint 1,120,138,1,0xFF3355;
		mes "[�W���m�[�K�C�h]";
		mes "^FF3355+^000000 -> ����h��X";
		break;
	case 2:
		viewpoint 1,193,142,2,0x3355FF;
		mes "[�W���m�[�K�C�h]";
		mes "^3355FF+^000000 -> ����X";
		break;
	case 3:
		viewpoint 1,90,318,3,0x33FF55;
		mes "[�W���m�[�K�C�h]";
		mes "^33FF55+^000000 -> �Z�[�W�L���b�X��";
		mes "(�Z�[�W�]�E��)";
		break;
	case 4:
		viewpoint 1,257,102,4,0xFF3355;
		mes "[�W���m�[�K�C�h]";
		mes "^FF3355+^000000 -> ���X�ʂ�";
		break;
	case 5:
		viewpoint 1,157,170,5,0x3355FF;
		mes "[�W���m�[�K�C�h]";
		mes "^3355FF+^000000 -> �����L��";
		break;
	case 6:
		viewpoint 1,336,204,6,0x33FF55;
		mes "[�W���m�[�K�C�h]";
		mes "^33FF55+^000000 -> ���a���}����";
		break;
	case 7:
		viewpoint 1,323,281,7,0xFF3355;
		mes "[�W���m�[�K�C�h]";
		mes "^FF3355+^000000 -> �V���o�C�`�F�����@�A�J�f�~�[";
		break;
	case 8:
		viewpoint 1,278,288,8,0x3355FF;
		mes "[�W���m�[�K�C�h]";
		mes "^3355FF+^000000 -> �����X�^�[������";
		break;
	case 9:
		mes "[�W���m�[�K�C�h]";
		mes "���҂����̑�s�s";
		mes "�����Ēm���̕��";
		mes "�W���m�[�ւ悤�����I";
		close;
	}
	mes "�ɂȂ�܂��B";
	mes "�ǂ��������߂������������B";
	close;
}

//----------------------------------------------------------------------
//[�ē��v�� - �A�}�c]

amatsu,207,91,4	script	�~�X�E�A�}�c::�u�����	758,{
	if(strnpcinfo(3) == "�u�����") {	//���ʎq���Q��
		mes "[�u�����]";
		mes "���́A��13��~�X�E�A�}�c";
		mes "�u�u�v�Ɛ\���܂��B";
		mes "�A�}�c��\�Ƃ���";
		mes "���̈ē����������Ă���܂��B";
		mes "�Ȃɂ������₪����܂�����";
		mes "�Ȃ�Ȃ�Ƃ���������Ă��������܂��B";
	}
	else {
		mes "[�ē��l]";
		mes "�悤�����B";
		mes "��������ɂ͗ǂ��G�߂ł��ˁB";
		mes "���͂��̃A�}�c��";
		mes "�ē��������󂯂Ă���҂ł��B";
		next;
		mes "[�ē��l]";
		mes "�������T���ł����H";
	}
	next;
	switch (select("��","����X","����X","������")) {
	case 1:
		viewpoint 1,85,235,0,0xFF3355;
		mes "["+strnpcinfo(3)+"]";
		mes "�~�j�}�b�v��";
		mes "^FF3355+^000000������";
		mes "��ł������܂��B";
		break;
	case 2:
		viewpoint 1,96,118,1,0xCE6300;
		mes "["+strnpcinfo(3)+"]";
		mes "�~�j�}�b�v��";
		mes "^CE6300+^000000������";
		mes "����X�ɂȂ�܂��B";
		break;
	case 3:
		viewpoint 1,132,117,2,0x55FF33;
		mes "["+strnpcinfo(3)+"]";
		mes "�~�j�}�b�v��";
		mes "^55FF33+^000000������";
		mes "����X�ɂȂ�܂��B";
		break;
	case 4:
		viewpoint 1,217,116,3,0x3355FF;
		mes "["+strnpcinfo(3)+"]";
		mes "�~�j�}�b�v��";
		mes "^3355FF+^000000������";
		mes "�������ɂȂ�܂��B";
		break;
	}
	mes "����ł́A�A�}�c��";
	mes "�y�������Ԃ����߂����������܂��B";
	close;
}

amatsu,251,283,4	duplicate(�u�����)	�ē��l	767


//----------------------------------------------------------------------
//[�ē��v�� - �R������]

gonryun,163,60,4	script	�R�������K�C�h	780,{
	mes "[�n �E�H���`]";
	mes "�������C�ɖ����āA�M�C�����ӂ�";
	mes "�����l�X���s�������Ă���";
	mes "�R�������ɂ�������Ⴂ�܂�!";
	next;
	mes "[�n �E�H���`]";
	mes "��������A���̈ē�������";
	mes "���܂��B�m�肽�����Ƃ������";
	mes "���ł������Ă��������B";
	next;
	switch (select("�����̉�","����l","���폤�l","�h��l","����")) {
	case 1:
		viewpoint 1,109,131,0,0xff3355;
		mes "[�n �E�H���`]";
		mes "�~�j�}�b�v��";
		mes "^ff3355+^000000�̈ʒu��";
		mes "�����̉Ƃ�����܂��B";
		break;
	case 2:
		viewpoint 1,147,84,1,0xce6300;
		mes "[�n �E�H���`]";
		mes "�~�j�}�b�v��";
		mes "^ce6300+^000000�̈ʒu��";
		mes "����l�����܂��B";
		break;
	case 3:
		viewpoint 1,174,101,2,0x55ff33;
		mes "[�n �E�H���`]";
		mes "�~�j�}�b�v��";
		mes "^55ff33+^000000�̈ʒu��";
		mes "���폤�l�����܂��B";
		break;
	case 4:
		viewpoint 1,173,84,3,0x3355ff;
		mes "[�n �E�H���`]";
		mes "�~�j�}�b�v��";
		mes "^3355ff+^000000�̈ʒu��";
		mes "�h��l�����܂��B";
		break;
	case 5:
		viewpoint 1,215,114,4,0xffffff;
		mes "[�n �E�H���`]";
		mes "�~�j�}�b�v��";
		mes "^ffffff+^000000�̈ʒu��";
		mes "���ق�����܂��B";
		break;
	}
	mes "���B�̊y�����R��������";
	mes "�v��������y����ł��������I";
	close;
}

//----------------------------------------------------------------------
//[�ē��v�� - �E���o��]

umbala,128,94,4	script	�T����	702,{
	mes "[�T����]";
	mes "�����͂ƂĂ��ςȏ��ł��B";
	mes "���J��̂��߂Ȃ̂��A";
	mes "�����ƂĂ����G�ł��B";
	next;
	mes "[�T����]";
	mes "���������́A�����ŉ��������T����";
	mes "�����Ă��܂��B�����瑺�̒n����ǂ�";
	mes "�m���Ă��܂��̂ŁA�ǂ��ɉ������邩";
	mes "�m�肽���Ȃ�A�����Ȃ������ĉ������B";
	next;
	switch (select("���̈ē����󂯂�","�~�j�}�b�v�̕\����S�ď���","��߂�")) {
	case 1:
		mes "[�T����]";
		mes "����m�肽���ł����H";
		next;
		switch (select("�U���̉�","�V���[�}���̉�","���퉮","���","�o���W�[�W�����v��","������")) {
			case 1:
				mes "[�T����]";
				mes "�U���l�̂���́A^FF3355+^000000�̈ʒu�ɂ���܂��B";
				mes "�U���l�������A�O���̌��t��b���܂��B";
				mes "�Ȃ̂ŁA�܂��U���l�ɂ�������";
				mes "�ǂ��ł��傤�B";
				viewpoint 0,66,250,2,0xFF3355;
				break;
			case 2:
				mes "[�T����]";
				mes "�V���[�}���̗͂͐_��ł��ˁB";
				mes "�V���[�}���̉Ƃ́A^CE6300+^000000�̈ʒu�ɂ���܂��B";
				mes "�ޏ��́A���R�̑����̌����╪����";
				mes "�ł��邻���ł��B";
				viewpoint 0,217,186,3,0xCE6300;
				break;
			case 3:
				mes "[�T����]";
				mes "���퉮�́A^55FF33+^000000�̈ʒu�ɂ���܂��B";
				mes "�O������̐N���������̂ŁA�l�X��";
				mes "���킪�p�ӂ���Ă���݂����ł��B";
				viewpoint 0,126,154,4,0x55FF33;
				break;
			case 4:
				mes "[�T����]";
				mes "����́A^3355FF+^000000�̈ʒu�ɂ���܂��B";
				mes "���s�ɕK�v�ȕ��𔄂��Ă��܂�����A";
				mes "���ɏo��O�ɗ�������Ă݂Ă��������B";
				viewpoint 0,136,127,5,0x3355FF;
				break;
			case 5:
				mes "[�T����]";
				mes "�E���o���ɂ́A���̏��ł͌����Ȃ�";
				mes "�u�o���W�[�W�����v��v�Ƃ������̂�";
				mes "����܂��B�o���W�[�W�����v��́A";
				mes "^00FF00+^000000�̈ʒu�ɂ���܂��B";
				mes "�����̗E�C�������Ă݂�����΁A����";
				mes "���킵�Ă݂Ă��������B";
				viewpoint 0,139,198,6,0x00FF00;
				break;
			case 6:
				mes "[�T����]";
				mes "�ʒu�\��������������΁A";
				mes "�u�~�j�}�b�v�̕\����S�ď����v";
				mes "��I�����Ă��������B";
				break;
		}
		close;
	case 2:
		mes "[�T����]";
		mes "�~�j�}�b�v�̕\����S�ď����܂����B";
		mes "�~�j�}�b�v�ɂ܂��\����������΁A";
		mes "���ł������Ă��������B";
		viewpoint 2,66,250,2,0x00FF00;
		viewpoint 2,217,186,3,0x00FF00;
		viewpoint 2,126,154,4,0x00FF00;
		viewpoint 2,136,127,5,0x00FF00;
		viewpoint 2,139,198,6,0x00FF00;
		close;
	case 3:
		mes "[�T����]";
		mes "���ځA�������Ȃ��猩��̂�";
		mes "�ʔ����ł��ˁB����ł͂�������悤�B";
		close;
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �j�u���w�C��]

niflheim,186,190,6	script	�����l	798,{
	mes "[���J�G��]";
	mes "����Ȃɋ��낵���X��";
	mes "����������Ȃ�āc�c";
	mes "���Ȃ������ɖ���ꂽ�̂ł��ˁB";
	mes "�l�͋���Ȏ��ɓ�����āA������";
	mes "���܂����B����ǂ������ԁA";
	mes "�E�o���邱�Ƃ��ł��܂���B";
	next;
	mes "[���J�G��]";
	mes "����ł������Əo����{���Ă����̂ŁA";
	mes "�X�̒n�������͂悭�����Ă��܂��B";
	mes "�O�֏o��̂ɖ𗧂�������Ȃ��̂ŁA";
	mes "�����Ȃ����q�˂��������B";
	next;
	switch (select("�X�̒n����q�˂�","�~�j�}�b�v�̕\����S�ď���","�b����߂�")) {
	case 1:
		mes "[���J�G��]";
		mes "����m�肽���ł����H";
		next;
		switch (select("�����̏�","���","���퉮","����","������")) {
			case 1:
				mes "[���J�G��]";
				mes "�j�u���w�C���ɂ͋��낵��������";
				mes "���܂��B ^FF3355+^000000 �̈ʒu�ɁA���̖�����";
				mes "�Z�ނ��邪����܂��B���͈�x����";
				mes "�s�������Ƃ�����܂����A�ƂĂ�";
				mes "���낵�������̂ŁA�����ɓ����o����";
				mes "���܂����B";
				viewpoint 0,253,191,2,0xFF3355;
				break;
			case 2:
				mes "[���J�G��]";
				mes "����� ^CE6300+^000000 �̈ʒu�ɂ���܂��B";
				mes "�O�̐��E�ł͔����Ă��Ȃ�";
				mes "��������������܂��̂ŁA�����x�A";
				mes "�s���Ă݂Ă��������B";
				viewpoint 0,217,196,3,0xCE6300;
				break;
			case 3:
				mes "[���J�G��]";
				mes "���퉮�� ^55FF33+^000000 �̈ʒu�ɂ���܂��B";
				mes "���̏��ł͌������Ȃ���������܂��̂�";
				mes "�����x�A�s���Ă݂Ă��������B";
				viewpoint 0,216,171,4,0x55FF33;
				break;
			case 4:
				mes "[���J�G��]";
				mes "������ ^3355FF+^000000 �̈ʒu�ɂ���܂��B";
				mes "�����ł͂��܂ɁA���ҒB���W�܂���";
				mes "�p�[�e�B�[�����Ă��܂��ˁB";
				viewpoint 0,189,207,5,0x3355FF;
				break;
			case 5:
				mes "[���J�G��]";
				mes "�ʒu�\���������������";
				mes "�u�~�j�}�b�v�̕\����S�ď����v";
				mes "��I�����Ă��������B";
				break;
		}
		close;
	case 2:
		mes "[���J�G��]";
		mes "�~�j�}�b�v�̕\����S�ď����܂����B";
		mes "�܂��~�j�}�b�v�̕\��������������΁A";
		mes "���ł����������Ă��������B";
		viewpoint 2,253,191,2,0x00FF00;
		viewpoint 2,217,196,3,0x00FF00;
		viewpoint 2,216,171,4,0x00FF00;
		viewpoint 2,189,207,5,0x00FF00;
		close;
	case 3:
		mes "[���J�G��]";
		mes "���ځA�����Č���̂͂ƂĂ�";
		mes "��Ȃ��̂Ɂc�c�C������";
		mes "�s���Ă�����Ⴂ�B";
		close;
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - ���V��]
louyang,224,104,4	script	�L���g#Lou	818,{
	mes "["+strnpcinfo(0)+"]";
	mes "���V��ւ悤�����B";
	mes "���̓x�A���V��͊O���Ƃ̐ϋɓI��";
	mes "�𗬂̂��߁A�V���ɍq�H���J�񂢂���";
	mes "�܂����B���̂������ő����̍��̕��X��";
	mes "���S���ĖK��邱�Ƃ��o����悤��";
	mes "�Ȃ����̂ł��B";
	next;
	mes "["+strnpcinfo(0)+"]";
	mes "���V��͒������j�Ƌ��ɍ݂�܂��B";
	mes "�ł��̂ŁA���ĉ���ꏊ����������";
	mes "������܂��B";
	mes "�킩��Ȃ���������܂�����";
	mes "���ē��������܂��傤�B";
	next;
	switch (select("���̈ē������肢����","�~�j�}�b�v�̕\��������","��߂�")) {
	case 1:
		mes "["+strnpcinfo(0)+"]";
		mes "�ǂ����ē��������܂��傤�H";
		next;
		switch (select("��","�a�@","����","����X","����X","����","��߂�")) {
			case 1:
				mes "["+strnpcinfo(0)+"]";
				mes "���^ff0000+^000000�ɂ���܂��B";
				mes "��ɂ͏��l���܂߁A�g���̍������X��";
				mes "�����܂��B��x�A���l�ւ����A��";
				mes "�f����̂��A��낵���̂ł͂Ȃ���";
				mes "���傤���B";
				viewpoint 1,218,255,1,0xff0000;
				break;
			case 2:
				mes "["+strnpcinfo(0)+"]";
				mes "���V��ɂ͗L���ȕa�@��";
				mes "^8a0000+^000000�ɂ������܂��B";
				mes "�\�ɂ��ƁA�ޓ��Ɏ����Ȃ��a�C�͂Ȃ�";
				mes "�ƌ������Ƃł����A���ꂪ�^���Ȃ̂�";
				mes "�ǂ����͂킩��܂���B";
				viewpoint 1,263,93,2,0x8a0000;
				break;
			case 3:
				mes "["+strnpcinfo(0)+"]";
				mes "���V��ɂ͊������������܂��B";
				mes "^777777+^000000�������̏ꏊ�ƂȂ�܂��B";
				mes "������肪���������ꍇ��";
				mes "���������q�ˉ������B";
				viewpoint 1,309,80,3,0x00ff00;
				break;
			case 4:
				mes "["+strnpcinfo(0)+"]";
				mes "����X�� ^00ff00+^000000�ɂ���܂��B";
				mes "�r�����̐E�l�ɂ�闧�h�ȕ��킪";
				mes "����ł���܂��B";
				viewpoint 1,145,174,4,0x00ff00;
				break;
			case 5:
				mes "["+strnpcinfo(0)+"]";
				mes "����X�� ^0000ff+^000000�ɂ���܂��B";
				mes "������ӂ�Ȃ���ΕS��S���I";
				viewpoint 1,136,97,5,0x0000ff;
				break;
			case 6:
				mes "["+strnpcinfo(0)+"]";
				mes "��ꂽ���͎���ɗ�������Ă݂Ă�";
				mes "�������ł��傤�B";
				mes "����� ^00ff00+^000000�ɂ���܂��B";
				mes "���ɂ��吨�̗��s�q�����炵��";
				mes "��������悤�ł���B";
				viewpoint 1,280,167,6,0x00ff00;
				break;
			case 7:
				mes "["+strnpcinfo(0)+"]";
				mes "�ʒu�\���������������";
				mes "�w�~�j�}�b�v�̕\���������x��";
				mes "�I�����Ă��������B";
				break;
		}
		close;
	case 2:
		mes "["+strnpcinfo(0)+"]";
		mes "�~�j�}�b�v�̕\����S�ď����܂����B";
		mes "�܂������\�����������";
		mes "���ł����ē��������܂��B";
		viewpoint 2,218,255,1,0xff0000;
		viewpoint 2,263,93,2,0x8a0000;
		viewpoint 2,309,80,3,0x00ff00;
		viewpoint 2,145,174,4,0x00ff00;
		viewpoint 2,136,97,5,0x0000ff;
		viewpoint 2,280,167,6,0x00ff00;
		close;
	case 3:
		mes "["+strnpcinfo(0)+"]";
		mes "�������ŕ������̂��ǂ��ł��ˁB";
		mes "�ł́A��@���悤�B";
		close;
	}
}

louyang,160,175,4	duplicate(�L���g#Lou)	���m	825
louyang,213,213,4	duplicate(�L���g#Lou)	���m	825


//----------------------------------------------------------------------
//[�ē��v�� - �A���^��]

ayothaya,203,169,4	script	�m�C	839,{
	mes "[�m�C]";
	mes "����ɂ��́B";
	mes "�A���^���ւ悤�����B";
	mes "�����A���^���́A�[���X�Ɉ͂܂�";
	mes "�삪����鎩�R�Ɍb�܂ꂽ";
	mes "�Â��ȑ��ł��B";
	next;
	mes "[�m�C]";
	mes "�܂��C�ɂ��߂��̂ŁA���Y���s���";
	mes "����܂��B�����ł͂��ڂɂ�����Ȃ�";
	mes "�Ɠ��Ȍ��z�����������񂠂�܂��B";
	mes "����ł͂��������ǂ����B";
	next;
	switch (select("���̈ē������Ă��炤","�~�j�}�b�v�̕\����S�ď���","��b����߂�")) {
	case 1:
		mes "[�m�C]";
		mes "�ǂ�������ē����܂��傤���H";
		next;
		switch (select("���퉮","���","����","�_�a","�ނ��","������")) {
			case 1:
				mes "[�m�C]";
				mes "���퉮��^55FF33+^000000�̈ʒu�ɂ���܂��B";
				mes "�A���^���̊C�̒j������";
				mes "������ŕ���𑵂��Ă��܂��B";
				viewpoint 1,182,59,2,0x00FF00;
				break;
			case 2:
				mes "[�m�C]";
				mes "�����^3355FF+^000000�̈ʒu�ɂ���܂��B";
				mes "�����A���^���̏Z���͂ǂ�����";
				mes "�o������ہA�K�����O�ȏ��������܂��B";
				mes "���O�������������肷�邱�Ƃ�";
				mes "�ƂĂ��厖�ł���ˁH";
				viewpoint 1,129,86,2,0x55FF33;
				break;
			case 3:
				mes "[�m�C]";
				mes "��x����ɍs���Ă݂�Ƃ悢�ł��傤�B";
				mes "�����^55FF33+^000000�̈ʒu�ɂ���܂��B";
				mes "�`���̊�{�͏����W�ł��B";
				mes "����͑����̗��s�q���K���ꏊ";
				mes "�ł�����A�L�p�ȏ��𓾂邱�Ƃ�";
				mes "�ł���ł��傤�B";
				viewpoint 1,229,69,2,0x00FF00;
				break;
			case 4:
				mes "[�m�C]";
				mes "�_�l�ɂ��F����Ȃ��肽���̂Ȃ�";
				mes "^55FF33+^000000�̈ʒu�ɂ���_�a��";
				mes "�s���Ă݂Ă��������B";
				viewpoint 1,208,283,2,0x00FF00;
				break;
			case 5:
				mes "[�m�C]";
				mes "�����A���^���͊C�݂��߂��̂�";
				mes "�C�ނ���y���ސl�������ł��B";
				mes "^55FF33+^000000�̈ʒu�ɂ���ނ���";
				mes "���ɗL���ł��B��x�s���Ă݂��";
				mes "�悢�ł��傤�B";
				viewpoint 1,253,99,2,0x00FF00;
				break;
			case 6:
				mes "[�m�C]";
				mes "�ʒu�\���������������";
				mes "�u�~�j�}�b�v�̕\����S�ď����v";
				mes "��I�����Ă��������B";
				break;
		}
		close;
	case 2:
		mes "[�m�C]";
		mes "�~�j�}�b�v�̕\����S�ď����܂����B";
		mes "�ēx�\���������ꍇ�́A���ł�";
		mes "���₢���킹���������B";
		viewpoint 2,182,59,2,0x00FF00;
		viewpoint 2,129,86,2,0x55FF33;
		viewpoint 2,229,69,2,0x00FF00;
		viewpoint 2,208,283,2,0x00FF00;
		viewpoint 2,253,99,2,0x00FF00;
		close;
	case 3:
		mes "[�m�C]";
		mes "�悢�����s�ɂȂ�܂��悤�ɁB";
		close;
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �A�C���u���b�N]

einbroch,72,202,4	script	�ē��v��#einbroch	852,{
	cutin "ein_soldier",2;
	mes "[�A�C���u���b�N�ē��v��]";
	mes "�|�S�̓s�s�A�C���u���b�N�ւ悤�����B";
	mes "�����́A�A�C���u���b�N�ɂ��炵������";
	mes "�X�̈ē����s���Ă��܂��B";
	mes "�����̈ē������߂Ď󂯂���́A";
	mes "�u���m�����𕷂��v��I��ł��������B";
	next;
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�ǂ����ē����܂��傤�H";
			if(@compass&0x080 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x080;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			next;
			while(1) {
				switch (select("^FF0000��`^000000","�w","�H��","�L��","�z�e��","���퉮",
							"������","�u���b�N�X�~�X�M���h","�L�O�^���[","������")) {
				case 1:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "^FF0000��`^000000�́A�k���ɂ���܂��B";
					mes "��`�ł́A�V���o���c�o���h��";
					mes "�ւ�ł����s�D��";
					mes "���p���邱�Ƃ��ł��܂��B";
					mes "��s�D�𗘗p����ۂ́A";
					mes "�ؕ����K�v�ł��B�����ӂ��������B";
					if(@compass&0x080)
						viewpoint 1,64,207,1,0xFF0000;
					continue;
				case 2:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�w�͊X�̖k���ɂ���܂��B";
					mes "�A�C���x�t���ʂ̋D�Ԃ�";
					mes "�^�s���Ă��܂��B";
					if(@compass&0x080)
						viewpoint 1,232,272,2,0xFF00FF;
					continue;
				case 3:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�H��͊X�̏d�v�{�݂ŁA";
					mes "�A�C���u���b�N�̒��S�Ƃ������܂��B";
					mes "�X�̓�Ɉʒu���A���̌����̒���";
					mes "������������܂��B";
					if(@compass&0x080)
						viewpoint 1,140,79,3,0xFF00FF;
					continue;
				case 4:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�L��́A�A�C���u���b�N��";
					mes "�������ɂ���A���X�X�ɂȂ��Ă��܂��B";
					mes "�z�e��������܂��̂ŁA";
					mes "�s���Ă݂�Ƃ����ł��傤�B";
					if(@compass&0x080)
						viewpoint 1,230,190,4,0xFF00FF;
					continue;
				case 5:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�z�e���́A�L��̓��ɂ���܂��B";
					mes "�ō����̐ݔ��Ő������Ă��܂��̂ŁA";
					mes "���K�ɉ߂�����Ǝv���܂��B";
					if(@compass&0x080)
						viewpoint 1,257,199,5,0x00FF00;
					continue;
				case 6:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "���퉮�́A�L����";
					mes "�����k���ɂ���܂��B";
					if(@compass&0x080)
						viewpoint 1,216,214,6,0x00FF00;
					continue;
				case 7:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�������͍H��̕t���{�݂ł��B";
					mes "�A�C���u���b�N�̓쐼�ɂ���܂��B";
					if(@compass&0x080)
						viewpoint 1,51,52,7,0x00FF00;
					continue;
				case 8:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�u���b�N�X�~�X�M���h�́A";
					mes "�A�C���u���b�N�̓쓌�ɂ���܂��B";
					mes "���B�������˂Ă��܂��B";
					if(@compass&0x080)
						viewpoint 1,255,107,8,0x00FF00;
					continue;
				case 9:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�L�O�^���[�́A�A�C���u���b�N��";
					mes "���S�ɂ���܂��B";
					mes "�L�O�^���[����A�A�C���u���b�N��";
					mes "�S�i�������낷���Ƃ��ł��܂��B";
					if(@compass&0x080)
						viewpoint 1,175,196,9,0x00FFFF;
					continue;
				case 10:
					mes "[�A�C���u���b�N�ē��v��]";
					mes "�ʒu�\���������������";
					mes "�u�~�j�}�b�v�̕\���������v��";
					mes "�I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�~�j�}�b�v�̕\���������܂����B";
			mes "�܂��̂����p�����҂����Ă���܂��B";
			viewpoint 2,64,207,1,0xFF0000;
			viewpoint 2,232,272,2,0xFF00FF;
			viewpoint 2,140,79,3,0xFF00FF;
			viewpoint 2,230,190,4,0xFF00FF;
			viewpoint 2,257,199,5,0x00FF00;
			viewpoint 2,216,214,6,0x00FF00;
			viewpoint 2,51,52,7,0x00FF00;
			viewpoint 2,255,107,8,0x00FF00;
			viewpoint 2,175,196,9,0x00FFFF;
			set @compass,@compass&~0x080;
			set .@flag,0;
			continue;
		case 3:
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�����̃A�i���O�ē���������A";
			mes "�m�肽���ꏊ���~�j�}�b�v�ɕ\������A";
			mes "�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�̃f�W�^���ē�������";
			mes "�ς��܂����B";
			next;
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�V���o���c�o���h���a����";
			mes "�V���ɊJ�����ꂽ�A���@�����S�r������";
			mes "�Z�p�ō��o�������̃V�X�e����";
			mes "���\�𒼐ڂ��m�F���������B";
			next;
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�j�}�b�v���m�F���Ă��������B";
			next;
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�����~�j�}�b�v�������Ȃ���΁A";
			mes "�V���[�g�J�b�g�L�[";
			mes "�uctrl�v+�utab�v";
			mes "�܂��͊�{�E�B���h�E��";
			mes "�umap�v�{�^�����N���b�N���Ă��������B";
			next;
			mes "[�A�C���u���b�N�ē��v��]";
			mes "�~�j�}�b�v��́u-�v�{�^����";
			mes "����N���b�N����ƁA";
			mes "�X�̑S�i��������悤�ɂȂ�܂��B";
			continue;
		case 4:
			mes "[�A�C���u���b�N�ē��v��]";
			mes "������ł́A�x�X";
			mes "�u��C�����x��v�����߂���܂��̂�";
			mes "���C�������������B";
			close2;
			cutin "ein_soldier",255;
			end;
		}
	}
}

//��C�����C�x���g�Ńn�C�h�����
einbroch,155,43,4	duplicate(�ē��v��#einbroch)	�ē��v��#einbrochdummy1	852
einbroch,162,317,4	duplicate(�ē��v��#einbroch)	�ē��v��#einbrochdummy2	852

//----------------------------------------------------------------------
//[�ē��v�� - �A�C���x�t]

einbech,67,37,4	script	�ē��v��#einbech	852,{
	cutin "ein_soldier",2;
	mes "[�A�C���x�t�ē��v��]";
	mes "�̍z�̑��A�C���x�t�ւ悤�����B";
	mes "���B�́A�A�C���x�t�ɂ��炵������";
	mes "���̈ē������Ă��܂��B";
	mes "�ē������߂Ď󂯂����";
	mes "�u���m�����𕷂��v��I��ł��������B";
	next;
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�A�C���x�t�ē��v��]";
			mes "�ǂ����ē����܂��傤�H";
			if(@compass&0x0100 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x0100;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("�w","����","���","�\�[�h�}���M���h","�z�R","������")) {
				case 1:
					mes "[�A�C���x�t�ē��v��]";
					mes "�w�́A�A�C���x�t��";
					mes "�k���Ɩk���ɂ���܂��B";
					mes "�w����A�A�C���u���b�N���ʂ�";
					mes "�D�Ԃ��o�Ă��܂��B";
					if(@compass&0x0100)
						viewpoint 1,43,214,1,0xFF0000;
					continue;
				case 2:
					mes "[�A�C���x�t�ē��v��]";
					mes "����́A�A�C���x�t�̓쑤�ɂ���܂��B";
					mes "�H�����ł��܂����A";
					mes "�d����̋x���ɂ��҂�����ł��B";
					if(@compass&0x0100)
						viewpoint 1,145,112,2,0xFF00FF;
					continue;
				case 3:
					mes "[�A�C���x�t�ē��v��]";
					mes "����́A�A�C���x�t��";
					mes "���S�ɂ���܂��B";
					if(@compass&0x0100)
						viewpoint 1,177,136,3,0xFF00FF;
					continue;
				case 4:
					mes "[�A�C���x�t�ē��v��]";
					mes "�\�[�h�}���M���h�́A";
					mes "�A�C���x�t�̓��ɂ���܂��B";
					mes "���݁A�����̍H�����ł��̂ŁA";
					mes "�]�E�̐\�����݂͎󂯕t���Ă��܂���B";
					if(@compass&0x0100)
						viewpoint 1,257,109,4,0xFF00FF;
					continue;
				case 5:
					mes "[�A�C���x�t�ē��v��]";
					mes "�z�R�̓A�C���x�t�̖k�ɂ���A���݂�";
					mes "�����ɔ��@��Ƃ��s���Ă��܂��B";
					mes "���ꂪ�A�C���x�t�̏d�v�����ł��B";
					mes "�����A�z�����Y�o�����ꏊ��";
					mes "���X�A�����X�^�[���o�v���A";
					mes "��Ƃ��W�Q����邱�Ƃ�����܂��B";
					if(@compass&0x0100)
						viewpoint 1,138,252,5,0x00FF00;
					continue;
				case 6:
					mes "[�A�C���x�t�ē��v��]";
					mes "�ʒu�\���������������";
					mes "�u�~�j�}�b�v�̕\���������v��";
					mes "�I�����Ă��������B";
				}
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			mes "[�A�C���x�t�ē��v��]";
			mes "�~�j�}�b�v�̕\���������܂����B";
			mes "�܂��̂����p�����҂����Ă���܂��B";
			viewpoint 2,43,214,1,0xFF0000;
			viewpoint 2,145,112,2,0xFF00FF;
			viewpoint 2,177,136,3,0xFF00FF;
			viewpoint 2,257,109,4,0xFF00FF;
			viewpoint 2,138,252,5,0x00FF00;
			set @compass,@compass&~0x0100;
			set .@flag,0;
			continue;
		case 3:
			mes "[�A�C���x�t�ē��v��]";
			mes "�����̃A�i���O�ē���������A";
			mes "�m�肽���ꏊ���~�j�}�b�v�ɕ\������A";
			mes "�L�挟���V�X�e���𗘗p����";
			mes "�Ő�[�̃f�W�^���ē�������";
			mes "�ς��܂����B";
			next;
			mes "[�A�C���x�t�ē��v��]";
			mes "�V���o���c�o���h���a����";
			mes "�V���ɊJ�����ꂽ�A���@�����S�r������";
			mes "�Z�p�ō��o�������̃V�X�e����";
			mes "���\�𒼐ڂ��m�F���������B";
			next;
			mes "[�A�C���x�t�ē��v��]";
			mes "�ē��̑O�ɁA��ʉE��ɂ���";
			mes "�~�j�}�b�v���m�F���Ă��������B";
			next;
			mes "[�A�C���x�t�ē��v��]";
			mes "�����~�j�}�b�v�������Ȃ���΁A";
			mes "�V���[�g�J�b�g�L�[";
			mes "�uctrl�v+�utab�v";
			mes "�܂��͊�{�E�B���h�E��";
			mes "�umap�v�{�^�����N���b�N���Ă��������B";
			next;
			mes "[�A�C���x�t�ē��v��]";
			mes "�~�j�}�b�v��́u-�v�{�^����";
			mes "����N���b�N����ƁA";
			mes "�X�̑S�i��������悤�ɂȂ�܂��B";
			continue;
		case 4:
			mes "[�A�C���x�t�ē��v��]";
			mes "�悢�����B";
			close2;
			cutin "ein_soldier",255;
			end;
		}
	}
}

einbech,48,214,4	duplicate(�ē��v��#einbech)	�ē��v��#einbechdummy	852

//----------------------------------------------------------------------
//[�ē��v�� - ���q�^���[��]

lighthalzen,207,310,5	script	�ē��v��#West_Lhz1	852,{
	cutin "ein_soldier",2;
	mes "[���q�^���[���ē��v��]";
	mes "��Ɠs�s���q�^���[���ւ悤�����I";
	mes "���͂������q�^���[���ɖK�ꂽ";
	mes "���l�̊F���܂ɁA�X�̈ē�������";
	mes "����܂��B";
	mes "�X�̂��Ƃ�F�X�ƒm�肽��������";
	mes "���ł����������������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			set .@code$,substr2(strnpcinfo(2),0,4);	//West or East
			mes "[���q�^���[���ē��v��]";
			if(.@code$ == "West") {
				mes "���̓��q�^���[����^FF0000�����^000000�̈ē���";
				mes "�S�����Ă���܂��B";
			}
			else if(.@code$ == "East") {
				mes "���̓��q�^���[����^FF0000�����-�n���X^000000��";
				mes "�ē���S�����Ă���܂��B";
			}
			if(@compass&0x0200 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x0200;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				if(.@code$ == "West") {
					switch (select("^FF0000���b�P���x��^000000","�w","�x�@��","��s","�z�e��","��`","���l�g��","��ΓX","���퉮","�f�p�[�g","������")) {
					case 1:
						mes "[���q�^���[���ē��v��]";
						mes "�V���o���c�o���h�����ő�̊��";
						mes "�u���b�P���x���v�́A�X�̐�����";
						mes "����܂��B";
						if(@compass&0x0200)
							viewpoint 1,101,248,1,0xFF0000;
						continue;
					case 2:
						mes "[���q�^���[���ē��v��]";
						mes "�u�w�v�́A�X�̒����ɂ���܂��B";
						mes "�A�C���u���b�N�s���̋D�Ԃ�";
						mes "�^�s���Ă��܂��B";
						if(@compass&0x0200)
							viewpoint 1,228,163,2,0xFF00FF;
						continue;
					case 3:
						mes "[���q�^���[���ē��v��]";
						mes "�X�̒������班���k���ɁA";
						mes "�u�x�@���v������܂��B";
						mes "�s�R�Ȏ҂�������������A";
						mes "�������������Ƃ�����΁A";
						mes "���k���Ă��������B";
						if(@compass&0x0200)
							viewpoint 1,236,276,3,0x99FFFF;
						continue;
					case 4:
						mes "[���q�^���[���ē��v��]";
						mes "�X�̒������班���k���ɁA";
						mes "�u��s�v������܂��B";
						mes "�e����Z�֌W����舵���Ă��܂��B";
						if(@compass&0x0200)
							viewpoint 1,198,257,4,0x0000FF;
						continue;
					case 5:
						mes "[���q�^���[���ē��v��]";
						mes "�X�̓쑤�ɂ���L��̒����ɁA";
						mes "�u�z�e���v������܂��B";
						mes "�ō����̐ݔ��ƃT�[�r�X��񋟂��Ă���";
						mes "�����l���p�ɂɗ��p���Ă��܂��B";
						if(@compass&0x0200)
							viewpoint 1,159,33,5,0x00FF00;
						continue;
					case 6:
						mes "[���q�^���[���ē��v��]";
						mes "�u��`�v�́A�����ʂ�̓˂�������";
						mes "�����ɂ���܂��B";
						mes "��s�D�𗘗p���āA���K�ȗ���";
						mes "�y���ނ��Ƃ��ł��܂��B";
						if(@compass&0x0200)
							viewpoint 1,267,75,6,0x00FF00;
						continue;
					case 7:
						mes "[���q�^���[���ē��v��]";
						mes "�u���l�g���v�́A�X�̓쐼�ɂ���܂��B";
						if(@compass&0x0200)
							viewpoint 1,73,52,7,0xFF99FF;
						continue;
					case 8:
						mes "[���q�^���[���ē��v��]";
						mes "�u��ΓX�v�́A�쑤�ɂ���L���";
						mes "�����ɂ���܂��B";
						if(@compass&0x0200)
							viewpoint 1,93,110,8,0xFF9900;
						continue;
					case 9:
						mes "[���q�^���[���ē��v��]";
						mes "�u���퉮�v�́A�����ʂ��";
						mes "�˂�������ɂ���܂��B";
						mes "�̔����Ă��镐��̎�ނ��L�x�ŁA";
						mes "���q�^���[���ōł��K�͂��傫��";
						mes "���퉮�ł��B";
						if(@compass&0x0200)
							viewpoint 1,196,46,9,0x330033;
						continue;
					case 10:
						mes "[���q�^���[���ē��v��]";
						mes "�X�̒����ɁA�u�f�p�[�g�v������܂��B";
						mes "�e�폤�X�����W���Ă���A";
						mes "�V���b�s���O�ɂƂĂ��֗��ł��B";
						if(@compass&0x0200)
							viewpoint 1,198,163,10,0xFF00;
						continue;
					case 11:
						break;
					}
				}
				if(.@code$ == "East") {
					switch (select("���","���B��","����","������")) {
					case 1:
						mes "[���q�^���[���ē��v��]";
						mes "�u����v�́A�n���X��";
						mes "�k���ɂ���܂��B";
						mes "���v�����ł�11���̕����ł��B";
						if(@compass&0x0200)
							viewpoint 1,324,301,11,0xFF0000;
						continue;
					case 2:
						mes "[���q�^���[���ē��v��]";
						mes "�u���B���v�́A�n���X��";
						mes "�k���ɂ���܂��B";
						mes "���v�����ł�1���̕����ł��B";
						if(@compass&0x0200)
							viewpoint 1,365,300,12,0xFF00FF;
						continue;
					case 3:
						mes "[���q�^���[���ē��v��]";
						mes "�u����v�́A�n���X�̓쑤�ɂ���܂��B";
						if(@compass&0x0200)
							viewpoint 1,339,240,13,0x99FFFF;
						continue;
					case 4:
						break;
					}
				}
				mes "[���q�^���[���ē��v��]";
				mes "�ʒu�\����������������";
				mes "�u�~�jMAP�̈ʒu�\���������v��";
				mes "�I��ł��������B";
				break;	//2�Ԗڂ�while�𔲂���
			}
			continue;	//1�Ԗڂ�while�ɖ߂�
		case 2:
			viewpoint 2,101,248,1,0xFF0000;
			viewpoint 2,228,163,2,0xFF00FF;
			viewpoint 2,236,276,3,0x99FFFF;
			viewpoint 2,198,257,4,0x0000FF;
			viewpoint 2,159,33,5,0x00FF00;
			viewpoint 2,267,75,6,0x00FF00;
			viewpoint 2,73,52,7,0xFF99FF;
			viewpoint 2,93,110,8,0xFF9900;
			viewpoint 2,196,46,9,0x330033;
			viewpoint 2,198,163,10,0xFF00;
			viewpoint 2,324,301,11,0xFF0000;
			viewpoint 2,365,300,12,0xFF00FF;
			viewpoint 2,339,240,13,0x99FFFF;
			set @compass,@compass&~0x0200;
			set .@flag,0;
			continue;
		case 3:
			mes "[���q�^���[���ē��v��]";
			mes "�{�ē��������p���������O��";
			mes "�܂����j�^�[�E��ɂ���";
			mes "�~�jMAP�������������B";
			next;
			mes "[���q�^���[���ē��v��]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�B���h�E��";
			mes "�umap�v�{�^�����N���b�N���ĉ������B";
			next;
			mes "[���q�^���[���ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes " ^4A4AFF-^000000�{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肵�ĉ������B";
			continue;
		case 4:
			mes "[���q�^���[���ē��v��]";
			mes "���q�^���[���́A�X�̒����ɑ���";
			mes "�D�Ԑ��H�����Ƃ��āA";
			mes "��̋��ɕ�����Ă��܂��B";
			mes "�x�������펞���@�����Ă���܂����A";
			mes "�������������Ƃ������";
			mes "���ł����ǂ��ɑ��k���Ă��������B";
			next;
			mes "[���q�^���[���ē��v��]";
			mes "����ł͂悢�����I";
			close2;
			cutin "ein_soldier",255;
			end;
		}
	}
}

lighthalzen,154,100,5	duplicate(�ē��v��#West_Lhz1)	�ē��v��#West_Lhz2	852
lighthalzen,220,311,3	duplicate(�ē��v��#West_Lhz1)	�ē��v��#East_Lhz1	852
lighthalzen,307,224,3	duplicate(�ē��v��#West_Lhz1)	�ē��v��#East_Lhz2	852

//----------------------------------------------------------------------
//[�ē��v�� - �t�B�Q��]

hugel,98,56,3	script	�ē��v��	863,{
	mes "[�t�B�Q���ē��v��]";
	mes "����A�Ⴂ�l�ˁB����ɂ���B";
	mes "�����̓V���o���c�o���h��";
	mes "�t�B�Q���Ƃ�������B";
	mes "��������������������̂����H";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�t�B�Q���ē��v��]";
			mes "�t�B�Q���Ȃ玄����[���m���Ă��B";
			if(@compass&0x0400 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c�������H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x0400;
			}
			set .@flag,1;	//�ǂ����I��ł��t���O�I���B�~�jMAP��̈ʒu�\����������I�Ԃ܂ŏ����܂���B
			while(1) {
				next;
				switch (select("����","����","��X","��s�D","���퉮","���","�p�[�e�B�p�i�X",
						"^3131FF�n���^�[�]�E��^000000","^3131FF�_�a���@�c^000000","�����X�^�[���[�X���","�r���S�Q�[�����","������")) {
				case 1:
					mes "[�t�B�Q���ē��v��]";
					mes "�u����v�ƌ������́A";
					mes "���؂ȘV�l�z�[���݂�����";
					mes "���̂����ǂ˂��B";
					if(@compass&0x0400)
						viewpoint 1,155,114,1,0xFF0000;
					continue;
				case 2:
					mes "[�t�B�Q���ē��v��]";
					mes "�t�B�Q���̊ό����ǂ����ǁA";
					mes "�܂��͔��܂鏊���Ȃ��Ƃ˂��B";
					mes "�u���فv�͂����E��ɂ����B";
					if(@compass&0x0400)
						viewpoint 1,104,79,2,0xFF00FF;
					continue;
				case 3:
					mes "[�t�B�Q���ē��v��]";
					mes "����ς��X�Řb�ɉԂ��炩����̂�";
					mes "���̑�햡��˂��B";
					mes "�u��X�v�͂����E�̕��ɍs���΂����B";
					if(@compass&0x0400)
						viewpoint 1,129,66,3,0x99FFFF;
					continue;
				case 4:
					mes "[�t�B�Q���ē��v��]";
					mes "�ŋ߁A���߂Č���l�������Ă�����B";
					mes "����ς肠�̑傫�Ȃ̂�";
					mes "���ɗ���悤�ɂȂ������炩�˂��B";
					mes "�u��s�D�v�c�c�����������H";
					if(@compass&0x0400)
						viewpoint 1,178,142,4,0x0000FF;
					continue;
				case 5:
					mes "[�t�B�Q���ē��v��]";
					mes "�u���퉮�v�͑������ɂ��邯�ǁc�c";
					mes "����ȓc�ɂ��ች��������B";
					if(@compass&0x0400)
						viewpoint 1,70,157,5,0x00FF00;
					continue;
				case 6:
					mes "[�t�B�Q���ē��v��]";
					mes "����Ȃ����ڂ�ɂȂ�����";
					mes "�����ԃ|�[�V��������";
					mes "�ǂ�Ȗ����킩��Ȃ��Ă˂��c�c";
					mes "�u����v�͑������ɂ����B";
					if(@compass&0x0400)
						viewpoint 1,92,167,6,0x00FF00;
					continue;
				case 7:
					mes "[�t�B�Q���ē��v��]";
					mes "�u�p�[�e�B�p�i�X�v�͑��̒�������";
					mes "�������ꂽ���ɂ����B";
					mes "�p�[�e�B�p�i�ł�������������";
					mes "��ςȎ��ɂȂ邩��";
					mes "�C������񂾂�B";
					if(@compass&0x0400)
						viewpoint 1,91,104,7,0xFF99FF;
					continue;
				case 8:
					mes "[�t�B�Q���ē��v��]";
					mes "�u�n���^�[�v�ɓ]�E�������Ȃ�";
					mes "���̖k���̕��A";
					mes "�C�݂ɉ����čs���΂�����B";
					if(@compass&0x0400)
						viewpoint 1,206,228,8,0xFF9900;
					continue;
				case 9:
					mes "[�t�B�Q���ē��v��]";
					mes "�u�_�a���@�c�v���Ă����̂�";
					mes "���̐��̕��ɂ����B";
					mes "�l���W���Ă���悤�����ǁA";
					mes "��̉������Ă���̂��B";
					if(@compass&0x0400)
						viewpoint 1,52,90,9,0xFFFFFF;
					continue;
				case 10:
					mes "[�t�B�Q���ē��v��]";
					mes "�������܂Ɂu�����X�^�[���[�X�v��";
					mes "�V��ł����B";
					mes "��x�y����ł݂���ǂ������H";
					if(@compass&0x0400)
						viewpoint 1,58,72,10,0xFF9900;
					continue;
				case 11:
					mes "[�t�B�Q���ē��v��]";
					mes "�r���S�Q�[���͍D�������H";
					mes "����Ȃ�A���N�������i������Ă���";
					mes "�u�r���S�Q�[�����v��";
					mes "�����Ă݂�Ƃ�����B";
					if(@compass&0x0400)
						viewpoint 1,55,208,11,0x66FFFF;
					continue;
				case 12:
					mes "[�t�B�Q���ē��v��]";
					mes "�ʒu�W����������������";
					mes "�u�~�jMAP��̈ʒu�\���������v��";
					mes "�I�ԂƂ�����B";
				}
				break;
			}
			continue;
		case 2:
			viewpoint 2,155,114,1,0xFF0000;
			viewpoint 2,104,79,2,0xFF00FF;
			viewpoint 2,129,66,3,0x99FFFF;
			viewpoint 2,178,142,4,0x0000FF;
			viewpoint 2,70,157,5,0x00FF00;
			viewpoint 2,92,167,6,0x00FF00;
			viewpoint 2,91,104,7,0xFF99FF;
			viewpoint 2,206,228,8,0xFF9900;
			viewpoint 2,52,90,9,0xFFFFFF;
			viewpoint 2,52,90,10,0xFF9900;
			viewpoint 2,58,72,11,0x66FFFF;
			set @compass,@compass&~0x0400;
			set .@flag,0;
			mes "[�t�B�Q���ē��v��]";
			mes "�ʒu�W����S����������B";
			mes "�m�肽����������Ȃ�";
			mes "���ł������Ă����B";
			continue;
		case 3:
			mes "[�t�B�Q���ē��v��]";
			mes "���̈ē����󂯂�O��";
			mes "�܂����j�^�[�E��ɂ���";
			mes "�~�jMAP�����Ă����B";
			next;
			mes "[�t�B�Q���ē��v��]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�C���h�E��";
			mes "�umap�v�{�^�����N���b�N����񂾂�B";
			next;
			mes "[�t�B�Q���ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes " ^3152FF-^000000 �{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肷��Ƃ�����B";
			continue;
		case 4:
			mes "[�t�B�Q���ē��v��]";
			mes "���̈ē�������̂�";
			mes "�Ȃ��Ȃ��y�������񂳁B";
			mes "�z�b�z�b�z�b�z�b�z�B";
			close;
		}
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - ���w��]

rachel,138,146,5	script	���w���ē��v��	934,{
	mes "[���w���ē��v��]";
	mes "���_�t���C���l�̈��ɕ�܂ꂽ";
	mes "�A���i�x���c�̎�s�A���w����";
	mes "�悤������������Ⴂ�܂����B";
	next;
	mes "[���w���ē��v��]";
	mes "���߂Ĉē������󂯂ɂȂ���Ȃ�A";
	mes "�u���m�����v���j���[��";
	mes "�I�����Č��Ă��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[���w���ē��v��]";
			mes "�ǂ��̏ꏊ�𒲂ׂ��܂����H";
			if(@compass&0x0800 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x0800;
			}
			set .@flag,1;
			while(1) {
				next;
				switch (select("�Z�X�����j���_�a","�z�e��","���퉮","���","��s�D","������")) {
				case 1:
					mes "[���w���ē��v��]";
					mes "�Z�X�����j���_�a��";
					mes "���_�t���C���l�̉��g�ł���";
					mes "���c�l������������";
					mes "�_���ȏꏊ�ł������܂��B";
					next;
					mes "[���w���ē��v��]";
					mes "���ɂ����Ėk�֌�������";
					mes "�����ɒH�蒅���ł��傤�B";
					if(@compass&0x0800)
						viewpoint 1,150,249,1,0xFF0000;
					continue;
				case 2:
					mes "[���w���ē��v��]";
					mes "���̔�������ɂ́A�z�e����";
					mes "��Ԃł��傤�B";
					mes "�������ɂ��錚�����z�e���ł��B";
					if(@compass&0x0800)
						viewpoint 1,115,149,2,0xFF00FF;
					continue;
				case 3:
					mes "[���w���ē��v��]";
					mes "���w���Ŕ̔����Ă���";
					mes "��v�ȕ�����䏊�]�ł����H";
					mes "���퉮�͐���̂����߂��ł��B";
					if(@compass&0x0800)
						viewpoint 1,42,87,3,0x99FFFF;
					continue;
				case 4:
					mes "[���w���ē��v��]";
					mes "�㎿�̍ō����|�[�V���������������A";
					mes "���w���̓����";
					mes "����̋߂��ɂ���܂��B";
					if(@compass&0x0800)
						viewpoint 1,83,78,4,0x0000FF;
					continue;
				case 5:
					mes "[���w���ē��v��]";
					mes "��s�D�́A���w���̓�����o��";
					mes "���ɍs�������ɂ���܂��B";
					if(@compass&0x0800)
						viewpoint 1,273,125,5,0x00FF00;
					continue;
				case 6:
					mes "[���w���ē��v��]";
					mes "�ʒu�W����������������";
					mes "�u�~�jMAP��̈ʒu�\���������v��";
					mes "�I�����Ă��������B";
				}
				break;
			}
			continue;
		case 2:
			viewpoint 2,150,249,1,0xFF0000;
			viewpoint 2,115,149,2,0xFF00FF;
			viewpoint 2,42,87,3,0x99FFFF;
			viewpoint 2,83,78,4,0x0000FF;
			viewpoint 2,273,125,5,0x00FF00;
			set @compass,@compass&~0x0800;
			set .@flag,0;
			mes "[���w���ē��v��]";
			mes "�~�jMAP��̈ʒu�\����";
			mes "�S�������܂����B";
			mes "�܂��A�C�ɂȂ鎖������܂�����";
			mes "���ł��A�����Ă��������B";
			continue;
		case 3:
			mes "[���w���ē��v��]";
			mes "���̈ē��́A���j�^�[�E��ɂ���";
			mes "�~�jMAP���Q�l���Ă��������B";
			next;
			mes "[���w���ē��v��]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�C���h�E��";
			mes "�umap�v�{�^����";
			mes "�N���b�N���Ă��������B";
			next;
			mes "[�t�B�Q���ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes " ^3152FF-^000000 �{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肵�Ă��������B";
			continue;
		case 4:
			mes "[���w���ē��v��]";
			mes "�ł́A�ǂ������B";
			close;
		}
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �x�C���X]

veins,210,345,5	script	�x�C���X�ē����m#ve	934,{
	mes "[�x�C���X�ē����m]";
	mes "������ʂ蔲���ė����F�l�A";
	mes "�悤�����I";
	mes "������";
	mes "���J�s�s�u�x�C���X�v�ł��B";
	next;
	mes "[�x�C���X�ē����m]";
	mes "���߂Ĉē������󂯂ɂȂ���Ȃ�A";
	mes "�u���m�����v���j���[��";
	mes "�I�����Č��Ă��������B";
	while(1) {
		next;
		switch (select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","���m����","��߂�")) {
		case 1:
			mes "[�x�C���X�ē����m]";
			mes "�ǂ̏ꏊ�𒲂ׂ��܂����H";
			if(@compass&0x0800 == 0 && .@flag == 0) {
				mes "�~�j�}�b�v�Ɉʒu�\�����c���܂����H";
				next;
				if(select("�͂�","������")==1)
					set @compass,@compass|0x1000;
			}
			set .@flag,1;
			while(1) {
				next;
				switch (select("�Z�X�����j���_�a","�z�e��","���퉮","���","��s�D","����","�n���w������","�����Ǘ���","������")) {
				case 1:
					mes "[�x�C���X�ē����m]";
					mes "�_�ɂ��F�������Q�q�q��";
					mes "���키�Z�X�����j���_�a�́A";
					mes "�x�C���X�̖k���ɂ���܂��B";
					if(@compass&0x1000)
						viewpoint 1,195,275,1,0xFF0000;
					continue;
				case 2:
					mes "[�x�C���X�ē����m]";
					mes "���̔�������Ă����";
					mes "�z�e���́A";
					mes "�x�C���X�̖k���ɂ���܂��B";
					if(@compass&0x1000)
						viewpoint 1,130,280,2,0xFF00FF;
					continue;
				case 3:
					mes "[�x�C���X�ē����m]";
					mes "�����̐g�����ɂ�";
					mes "���킪�d�v�ł��B";
					mes "�ǎ��ň������������";
					mes "���퉮�́A";
					mes "�x�C���X�̐��ɂ���܂��B";
					if(@compass&0x1000)
						viewpoint 1,148,185,3,0x99FFFF;
					continue;
				case 4:
					mes "[�x�C���X�ē����m]";
					mes "���ɂ͐F��ȕ����K�v�ł��B";
					mes "�x�C���X�̒����ɂ���";
					mes "����ő����Ă��������B";
					if(@compass&0x1000)
						viewpoint 1,230,173,4,0x0000FF;
					continue;
				case 5:
					mes "[�x�C���X�ē����m]";
					mes "�x�C���X�̔�s�D�́A";
					mes "�ݕ��̉^���݂̂�";
					mes "�g���Ă���܂��B";
					if(@compass&0x1000)
						viewpoint 1,271,292,5,0xCC99FF;
					continue;
				case 6:
					mes "[�x�C���X�ē����m]";
					mes "�x�C���X�̒n���̐l�Ƙb���������́A";
					mes "����ɗ������Ɨǂ��ł��B";
					mes "����̓x�C���X�̐��ɂ���܂��B";
					if(@compass&0x1000)
						viewpoint 1,140,228,6,0xCCCC33;
					continue;
				case 7:
					mes "[�x�C���X�ē����m]";
					mes "�n���w�ɋ������������ł����H";
					mes "�ł́A���퉮��2�K�ɂ���";
					mes "�n���w�������ɍs���Ă��������B";
					if(@compass&0x1000)
						viewpoint 1,148,185,7,0xFF9900;
					continue;
				case 8:
					mes "[�x�C���X�ē����m]";
					mes "�x�C���X�ɂ͎��������";
					mes "�����Ǘ���������܂��B";
					mes "������������������܂�����A";
					mes "�����ɍs���Ă��������B";
					if(@compass&0x1000)
						viewpoint 1,87,170,8,0xFF9900;
					continue;
				case 9:
					mes "[�x�C���X�ē����m]";
					mes "�ʒu�W����������������";
					mes "�u�~�jMAP��̈ʒu�\���������v��";
					mes "�I�����Ă��������B";
				}
				break;
			}
			continue;
		case 2:
			viewpoint 2,195,275,1,0xFF0000;
			viewpoint 2,130,280,2,0xFF00FF;
			viewpoint 2,148,185,3,0x99FFFF;
			viewpoint 2,230,173,4,0x0000FF;
			viewpoint 2,271,292,5,0xCC99FF;
			viewpoint 2,140,228,6,0xCCCC33;
			viewpoint 2,148,185,7,0xFF9900;
			viewpoint 2,87,170,8,0xFF9900;
			set @compass,@compass&~0x1000;
			set .@flag,0;
			mes "[�x�C���X�ē����m]";
			mes "�~�jMAP��̈ʒu�\����";
			mes "�S�������܂����B";
			mes "�܂��A�C�ɂȂ鎖������܂�����";
			mes "���ł��A�����Ă��������B";
			continue;
		case 3:
			mes "[�x�C���X�ē����m]";
			mes "�X�̈ē��́A���j�^�[�E��ɂ���";
			mes "�~�jMAP���Q�l���Ă��������B";
			next;
			mes "[�x�C���X�ē����m]";
			mes "�~�jMAP���\������Ă��Ȃ��ꍇ��";
			mes "�V���[�g�J�b�g�L�[�uCtrl + Tab�v";
			mes "�܂��͊�{���E�C���h�E��";
			mes "�umap�v�{�^����";
			mes "�N���b�N���Ă��������B";
			next;
			mes "[�t�B�Q���ē��v��]";
			mes "�~�jMAP���\�����ꂽ��";
			mes " ^3333FF-^000000 �{�^�����N���b�N����";
			mes "�}�b�v�̑S�̂�������悤��";
			mes "�ݒ肵�Ă��������B";
			continue;
		case 4:
			mes "[�x�C���X�ē����m]";
			mes "�ł́A�ǂ������B";
			close;
		}
	}
}
veins,189,101,5	duplicate(�x�C���X�ē����m#ve)	�x�C���X�ē����m	934

//----------------------------------------------------------------------
//[�ē��v�� - ���X�R�r�A]

moscovia,161,76,4	script	���X�R�r�A�K�C�h	959,{
	mes "[���X�R�r�A�K�C�h]";
	mes "�悤�����B";
	mes "�L���C�̏�ɕ����オ��y���B";
	mes "�������C�̉��F�ƒg������������";
	mes "���Ȃ���������X�R�r�A�ցB";
	next;
	mes "[���X�R�r�A�K�C�h]";
	mes "���̓��X�R�r�A���{����";
	mes "���l�̗��ւׂ̈ɁA�X�̈ē���";
	mes "����ׂɔh�����ꂽ�K�C�h�ł��B";
	mes "���������������͂���܂����H";
	next;
	switch(select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","��߂�")){
	case 1:
		mes "[���X�R�r�A�K�C�h]";
		mes "�ǂ�������ē����܂��傤���H";
		next;
		switch(select("���{","��q��","����E�h�","���","����")) {
		case 1:
			mes "[���X�R�r�A�K�C�h]";
			mes "���{�� ^FF3355+^000000 �ł��B";
			mes "���X�R�r�A�̃`���[���É���";
			mes "�Ɛb�B������������ꏊ�ł��B";
			viewpoint 1,255,140,1,0xFF3355;
			close;
		case 2:
			mes "[���X�R�r�A�K�C�h]";
			mes "��q���� ^CC6600+^000000 �ł��B";
			mes "���X�R�r�A�̕������F��";
			mes "�C���m�B����������Ⴂ�܂��B";
			viewpoint 1,265,163,2,0xCC6600;
			close;
		case 3:
			mes "[���X�R�r�A�K�C�h]";
			mes "����E�h��� ^AABBAA+^000000 �ł��B";
			mes "���X�R�r�A�ō��̐E�l�B�ɂ��";
			mes "��������鎖���ł��܂��B";
			viewpoint 1,186,190,3,0xAABBAA;
			close;
		case 4:
			mes "[���X�R�r�A�K�C�h]";
			mes "����� ^55FF33+^000000 �ł��B";
			mes "���ɏo�邽�߂ɂ͗l�X�ȏ�����";
			mes "�K�v�ł���ˁB";
			viewpoint 1,222,175,4,0x55FF33;
			close;
		case 5:
			mes "[���X�R�r�A�K�C�h]";
			mes "���ق� ^3355FF+^000000 �ł��B";
			mes "���̔��������Ŗ����Ă��������B";
			viewpoint 1,229,208,5,0x3355FF;
			close;
		}
	case 2:
		viewpoint 2,255,140,1,0xFF3355;
		viewpoint 2,265,163,2,0xCC6600;
		viewpoint 2,186,190,3,0xAABBAA;
		viewpoint 2,222,175,4,0x55FF33;
		viewpoint 2,229,208,5,0x3355FF;
		mes "[���X�R�r�A�K�C�h]";
		mes "�~�jMAP�̕\����S�ď����܂����B";
		close;
	case 3:
		mes "[���X�R�r�A�K�C�h]";
		mes "�����ň�������o���̂�";
		mes "���̊y���݂ł���ˁB";
		mes "�ł́A�ǂ������B";
		close;
	}
}

//----------------------------------------------------------------------
//[�ē��v�� - �u���W���X]

brasilis,240,81,3	script	�u���W���X�K�C�h	478,{
	mes "[�u���W���X�K�C�h]";
	mes "�^���ԂɋP�����z��";
	mes "��M�I�ȍ��A�u���W���X��";
	mes "�悤������������Ⴂ�܂����B";
	mes "��������Ȃ����Ƃ��������܂�����";
	mes "���������������I";
	next;
	while(1) {
		switch(select("�X�̈ē����󂯂�","�~�jMAP��̈ʒu�\��������","��߂�")) {
		case 1:
			mes "[�u���W���X�K�C�h]";
			mes "�ǂ�������ē��������܂��傤���H";
			if(@compass&0x2000 == 0 && .@flag == 0) {
				mes " ";
				mes "-�~�j�}�b�v�Ɉʒu�\����";
				mes "�@�c���܂����H-";
				next;
				if(select("�͂�","������") == 1)
					set @compass,@compass|0x2000;
			}
			set .@flag,1;
			while(1) {
				next;
				switch(select("�J�v���E��","�z�e��","�W�����O���P�[�u��","���p������","���X","�o���f���X�L�O��","��߂�")) {
				case 1:
					mes "[�u���W���X�K�C�h]";
					mes "�J�v���E������͊X�̒��S��";
					mes "��������Ⴂ�܂���B";
					mes "�߂��ŃA�C�X�N���[����";
					mes "�����Ă܂��I";
					if(@compass&0x2000)
						viewpoint 1,197,221,1,0xFFFFFF;
					continue;
				case 2:
					mes "[�u���W���X�K�C�h]";
					mes "�z�e���͂������炷��";
					mes "�k�k���ɂ���܂���B";
					mes "�������Y��ł������߂ł��I";
					if(@compass&0x2000)
						viewpoint 1,274,151,2,0xFF3355;
					continue;
				case 3:
					mes "[�u���W���X�K�C�h]";
					mes "�؁X�̐����΂�W�����O����";
					mes "���U�����܂����H";
					mes "����ł͂�����ɍs���Ă݂Ă��������I";
					mes "��������A�t�B�[���h��";
					mes "�o�邱�Ƃ��ł��܂���B";
					if(@compass&0x2000)
						viewpoint 1,308,335,3,0xCE6300;
					continue;
				case 4:
					mes "[�u���W���X�K�C�h]";
					mes "���E�I�K�͂̔��p�����ق�";
					mes "�u���W���X�̌ւ�ł��I";
					mes "���񑫂��^��ł݂Ă��������B";
					if(@compass&0x2000)
						viewpoint 1,137,167,4,0x00FF00;
					continue;
				case 5:
					mes "[�u���W���X�K�C�h]";
					mes "���������͂�����łł��܂���B";
					if(@compass&0x2000)
						viewpoint 1,254,248,5,0x55FF33;
					continue;
				case 6:
					mes "[�u���W���X�K�C�h]";
					mes "�u���W���X�̏ے��Ƃ�����";
					mes "�L�O��͂�����ł��B";
					if(@compass&0x2000)
						viewpoint 1,195,235,6,0x3355FF;
					continue;
				case 7:
					mes "[�u���W���X�K�C�h]";
					mes "�ʒu�W����������������";
					mes "�u�~�jMAP��̈ʒu�\���������v��";
					mes "�I�����Ă��������ˁB";
					break;
				}
				break;
			}
			continue;
		case 2:
			viewpoint 2,197,221,1,0xFFFFFF;
			viewpoint 2,274,151,2,0xFF3355;
			viewpoint 2,308,335,3,0x3355FF;
			viewpoint 2,137,167,4,0x00FF00;
			viewpoint 2,254,248,5,0x3355FF;
			viewpoint 2,195,235,6,0x3355FF;
			set @compass,@compass&~0x2000;
			set .@flag,0;
			mes "[�u���W���X�K�C�h]";
			mes "�~�jMAP��̈ʒu�\����";
			mes "�S�ď����܂����B";
			mes "�܂��A�C�ɂȂ鎖������܂�����";
			mes "���ł������Ă��������ˁB";
			close;
		case 3:
			mes "[�u���W���X�K�C�h]";
			mes "���ڊX�����ĉ��̂�";
			mes "�y�����ł���I";
			mes "����ł́A�u���W���X�ł̗���";
			mes "��������肨�y���݂��������I";
			close;
		}
	}
}


//----------------------------------------------------------------------
//[�ē��v�� - �f���^]

dewata,226,82,4	script	�f���^�ē��v��#dew1	537,{
	mes "[�f���^�ē��v��]";
	mes "�������g���S�����₩�ɂ�����A";
	mes "�����A^884411�f���^^000000�ւ悤�����B";
	mes "�X�̂��ē������܂��傤���H";
	while(1) {
		next;
		switch(select("�J�v���E��","�z�e���E�U�E�O�����g","�H���}�X�^�[","���폤�l","�h��l","����l","�ʕ����l","�N���J�g�ΎR�ē��l","�A���x���^�s�D��","�~�jMAP��̈ʒu�\��������","��߂�")) {
		case 1:
			mes "[�f���^�ē��v��]";
			mes "�J�v���E����";
			mes ((strnpcinfo(2) == "dew2")? "����������": "�X�̒���")+ "�ɂ��܂��B";
			viewpoint 1,202,184,1,0xFF0000;
			break;
		case 2:
			mes "[�f���^�ē��v��]";
			mes "�z�e���E�U�E�O�����g��";
			mes "�X�̖k���ɂ���܂��B";
			viewpoint 1,127,289,2,0x99FFFF;
			break;
		case 3:
			mes "[�f���^�ē��v��]";
			mes "�H���}�X�^�[��";
			mes "�X�̓쐼�ɂ��܂��B";
			viewpoint 1,146,109,3,0xFF00FF;
			break;
		case 4:
			mes "[�f���^�ē��v��]";
			mes "���폤�l��";
			mes "�X�̒����̂��쓌�ɂ��܂��B";
			viewpoint 1,218,164,4,0x0000FF;
			break;
		case 5:
			mes "[�f���^�ē��v��]";
			mes "�h��l��";
			mes "�X�̒����̂�␼�ɂ��܂��B";
			viewpoint 1,158,182,5,0xCC99FF;
			break;
		case 6:
			mes "[�f���^�ē��v��]";
			mes "����l��";
			mes "�X�̒����̂��쐼�ɂ��܂��B";
			viewpoint 1,182,164,6,0xCCCC33;
			break;
		case 7:
			mes "[�f���^�ē��v��]";
			mes "�ʕ����l��";
			mes "�X�̒����̖k���ɂ��܂��B";
			viewpoint 1,145,267,7,0xFF9900;
			break;
		case 8:
			mes "[�f���^�ē��v��]";
			mes "�N���J�g�ΎR�ē��l��";
			mes "�X�̓�ɂ��܂��B";
			viewpoint 1,235,56,8,0x00FF00;
			break;
		case 9:
			mes "[�f���^�ē��v��]";
			mes "�A���x���^�s�D����";
			mes "�X�̓�ɂ��܂��B";
			viewpoint 1,229,49,9,0xFFFFFF;
			break;
		case 10:
			viewpoint 2,202,184,1,0xFF0000;
			viewpoint 2,127,289,2,0x99FFFF;
			viewpoint 2,146,109,3,0xFF00FF;
			viewpoint 2,218,164,4,0x0000FF;
			viewpoint 2,158,182,5,0xCC99FF;
			viewpoint 2,182,164,6,0xCCCC33;
			viewpoint 2,145,267,7,0xFF9900;
			viewpoint 2,235,56,8,0x00FF00;
			viewpoint 2,229,49,9,0xFFFFFF;
			mes "[�f���^�ē��v��]";
			mes "�~�jMAP��̈ʒu�\����";
			mes "�S�ď����܂����B";
			break;
		case 11:
			mes "[�f���^�ē��v��]";
			mes "����ł́A�悢�ό����B";
			close;
		}
	}
}
dewata,197,184,4	duplicate(�f���^�ē��v��#dew1)	�f���^�ē��v��#dew2	537

//----------------------------------------------------------------------
//[�ē��v�� - �|�[�g�}����]

malaya,71,72,4	script	�|�[�g�}�����K�C�h#01	579,{
	mes "[�|�[�g�}�����K�C�h]";
	mes "���l�ȕ����Ɠ`���������钬";
	mes "^8B4513�|�[�g�}����^000000�ɂ悤�����B";
	mes "���͒��ē������Ă���̂�";
	mes "�m�肽�����Ƃ������";
	mes "�Ȃ�ł������ĉ������B";
	while(1) {
		next;
		switch(select("�J�v���E��","����","���폤�l","����l","�a�@","����","�`","�~�j�}�b�v��̈ʒu�\��������","��߂�")) {
		case 1:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^0000FF�J�v���E��^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,71,79,0,0x0A82FF;
			viewpoint 1,234,204,1,0x0A82FF;
			continue;
		case 2:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^006400����^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,178,208,2,0xAAFF00;
			continue;
		case 3:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^008080���폤�l^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,114,212,3,0x008080;
			continue;
		case 4:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^FF1493����l^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,297,167,4,0xFF1493;
			continue;
		case 5:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^FF4500�a�@^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,50,75,5,0xFF4500;
			continue;
		case 6:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^FF8C00����^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,280,360,6,0xFF8C00;
			continue;
		case 7:
			mes "[�|�[�g�}�����K�C�h]";
			mes "^8A2BE2�`^000000��";
			mes "�ʒu���~�j�}�b�v��";
			mes "�\�����܂��B";
			mes "���Ɉē����K�v�ł����H";
			viewpoint 1,276,55,7,0x8A2BE2;
			continue;
		case 8:
			mes "[�|�[�g�}�����K�C�h]";
			mes "�~�j�}�b�v��̈ʒu�\�����������܂��B";
			mes "���ɉ����K�v�ł����H";
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			viewpoint 2,1,1,6,0xFFFFFF;
			viewpoint 2,1,1,7,0xFFFFFF;
			continue;
		case 9:
			mes "[�|�[�g�}�����K�C�h]";
			mes "�y����ōs���ĉ������ˁB";
			close;
		}
	}
}
malaya,250,83,6		duplicate(�|�[�g�}�����K�C�h#01)	�|�[�g�}�����K�C�h#02	579
malaya,224,204,6	duplicate(�|�[�g�}�����K�C�h#01)	�|�[�g�}�����K�C�h#03	579