//===============================================================================================
//Ragnarok Online Bard jobchange script
//
//�@�� CHANGE_BA -> 0�`4
//�@�@ LUTIE_1QUE -> �X�m�E�m�E�N�G�X�g�t���O
//===============================================================================================

comodo,211,155,5 script �����炢�̋�V���l 741,{
	cutin "job_bard_aiolo01",2;
	if(Upper == UPPER_HIGH) {
		mes "[�A�C�I���f]";
		mes "�p�Y����f�������l�Ԃ�";
		mes "���̎���ɐ������ꂸ���܂�";
		mes "�������\����^����Y��";
		mes "���}�ȕ�炵�����Ă��܂��c�c";
		next;
		mes "[�A�C�I���f]";
		mes "����A�_��A�F�ɓ`���Ă����";
		mes "�H�ׂĈ���ŉ̂����X�𑗂�F��";
		mes "���Ȃ��̐l���͂����ł͂Ȃ��̂���";
		mes "�厖�Ȃ��Ƃ�Y��Ă����Ɓc�c";
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job == Job_Novice) {
		mes "[�A�C�I���f]";
		mes "���̒��Ɉ����܂��ɂ݂�";
		mes "�S�Đ����鎖�͂ł��Ȃ����B";
		mes "�A�C�e���͊ȒP�ɏo�邯���";
		mes "���ꂪ���̑����ɂȂ邩���Č����Ƃˁc";
		mes "�����܂����A�Ȃ�Č������ƂȂ����B";
		next;
		mes "[�A�C�I���f]";
		mes "���̉̂��������������H";
		mes "���߂��B";
		mes "�V�����̂�����Ă���Ƃ���Ȃ񂾁B";
		next;
		mes "[�A�C�I���f]";
		mes "�n�n�c�c���̐l�ɉ̂��Ă����悤";
		mes "����ł���Ȃ������H";
		mes "���͍�������Ǝ肪�����Ȃ��ĂˁB";
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job == Job_Bard) {
		mes "[�A�C�I���f]";
		mes "�₟�A���������C�ɉ̂��Ă邩���H";
		mes "��������̂���悤�ɂȂ��������H";
		next;
		mes "[�A�C�I���f]";
		mes "�̂͐l�X�Ɋy�����Ɗ�����";
		mes "�`����̂�����A��ɐV�����̂�";
		mes "�o���邱�Ƃ�Y��Ă͂����Ȃ���B";
		next;
		mes "[�A�C�I���f]";
		mes "�y�����S���Y��Ȃ��悤�ɁB";
		mes "�K����X�ŉ̂��Ă����邱�Ƃ��ˁB";
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	if(Job != Job_Archer) {
		mes "[�A�C�I���f]";
		mes "�������`�A�������`�A�������R���h�`";
		mes "�����y�������Ƃň�t�Ȃ́`";
		next;
		mes "[�A�C�I���f]";
		mes "�N�������͂����邱�Ƃ�Y��ā`";
		mes "�v��������y����ł�����`";
		mes "�����ƌ������͓�x�͗��Ȃ�����`";
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	switch(CHANGE_BA) {
	case 0:
		mes "[�A�C�I���f]";
		if(Sex)
			mes "����ɂ��́I�����ȃA�[�`���[�̗F��";
		else {
			mes "����ɂ��́I";
			mes "�f�G�ȃA�[�`���[�̂��삳��";
		}
		mes "���̂悤�ȗ���҂ɉ��̗p�����H";
		next;
		switch(select("�ǂ��������Ă��܂��ˁB","�̂���ȕ������Ă��������B","���ɗp�͂Ȃ��B")) {
			case 1:
				mes "[�A�C�I���f]";
				mes "�n�n�n! �ܘ_���Ƃ��I";
				mes "�����y�����C�����ŉ̂���";
				mes "���R�Ƃ����Ȃ���̂��I";
				next;
				mes "[�A�C�I���f]";
				mes "�������A�o�[�h�Ƃ����E�Ƃ͐��������B";
				mes "���܂ɂ͐�������鎞�����邩��";
				mes "�C��t���Ȃ���΂Ȃ�Ȃ���B";
				break;
			case 2:
				mes "[�A�C�I���f]";
				mes "�̂���? ������B";
				mes "����ł́A��ȉ̂��Ă݂悤���c�c";
				next;
				mes "[�A�C�I���f]";
				mes "���̉̂��̂��Ă݂悤���ȁB";
				mes "�t���t���A�z�b�z�b";
				mes "1�A2�A3�A4�`";
				next;
				mes "�n��������苿�����̉�";
				mes "�[�z�𕢂��t�F�C�����̓y��";
				mes "���Ɋ���̖ڂ��J�����u��";
				mes "��s�̏������������ƔR�₹";
				next;
				mes "��������A�S���̌ۓ�";
				mes "�����񂹂�A���̖���";
				mes "�`���A�Z�̏d��";
				mes "�����A�G���̎p";
				next;
				mes "�����Ƒ傫���A�����Ƒ傫���A";
				mes "�����Ƒ傫���炷�������I";
				mes "�i�ޕ�����A�͂����߂�I";
				mes "�����ƍ����A�����ƍ����A";
				mes "�����ƍ������Ԃ������I";
				mes "�����ƌ������͓�x�Ɨ��Ȃ��낤�I";
				next;
				mes "������A��n�𓥂ݒ��߂�I";
				mes "�􂯂����ȐS���삯�o���悤�ɁI";
				mes "�ق�J����ǂɍ�������I";
				mes "�����ƌ������͓�x�Ɨ��Ȃ��낤�I";
				next;
				mes "[�A�C�I���f]";
				mes "�t���t���c�c���̂��Ă��ǂ��̂�";
				mes "�N�������v��Ȃ������H";
				next;
				if(select("�����A�ǂ��̂ł��ˁB","�������A�ʂɁc�c")==2) {
					cutin "job_bard_aiolo02",2;
					mes "[�A�C�I���f]";
					mes "����c�c���̘r�����������B";
					mes "�����Ɠw�͂��Ȃ��Ă͂ˁB";
					mes "�Ƃɂ����A�����Ă���Ă��肪�Ƃ��B";
					break;
				}
				mes "[�A�C�I���f]";
				mes "���肪�Ƃ�! ���̉̂�";
				mes "�C�ɓ����Ă����Ƃ͊�������B";
				next;
				if(Sex == 1 && JobLevel >=40) {
					mes "[�A�C�I���f]";
					mes "�����Ƃ�������̐l��";
					mes "�̂��Ă��ꂽ��ǂ��̂Ɂc�c";
					mes "���̂܂܂ł��A�܂�";
					mes "�����񂾂��ˁc�c�n�b�n�[�B";
					set CHANGE_BA,1;
				}
				else {
					mes "[�A�C�I���f]";
					mes "���������Ȃ�����A�܂������ŁB";
				}
				break;
			case 3:
				cutin "job_bard_aiolo02",2;
				mes "[�A�C�I���f]";
				mes "�o�[�h�ɉ̂𗊂܂Ȃ��ƌ��������H";
				mes "�c�c���[��A�Z�����̂����H";
				next;
				mes "[�A�C�I���f]";
				mes "�����ǂ����c�c";
				mes "�����͐S�ɗ]�T�������Ă͂ǂ������B";
				mes "�����Ƃ������͋A���Ă͂��Ȃ����̂��B";
				break;
		}
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 1:
		mes "[�A�C�I���f]";
		mes "����ɂ��́I�����ȃA�[�`���[�̗F��";
		mes "���̂悤�ȗ���҂ɉ��̗p�����H";
		next;
		switch(select("�ǂ��������Ă��܂��ˁB","�̂���ȕ������Ă��������B","���ɗp�͂Ȃ��B")) {
			case 1:
				mes "[�A�C�I���f]";
				mes "�n�b�n�[�A�N��";
				mes "�ǂ��������Ă邶��Ȃ����B";
				mes "�N���̂��Č������͂Ȃ������H";
				next;
				if(select("�ܘ_�ł��I","�����̂��Ȃ�āc�c")==1) {
					mes "[�A�C�I���f]";
					mes "�n�b�n�[�A�����ˁB���񂤂�B";
					mes "����ł́A�����o�[�h�ɂȂ�";
					mes "��`�������Ă����悤�B";
					next;
					mes "[�A�C�I���f]";
					mes "�ł����̑O�Ɂc�c";
					mes "�Ԃ���֎����ė��Ă���Ȃ������H";
					mes "�Ԃ̍����k����΁A";
					mes "�ǂ��̂�������ꂻ�����B";
					next;
					mes "[�A�C�I���f]";
					mes "���̉Ԃł������񂾂��A";
					mes "�����D���ȉԂ������ė��Ă���Ȃ�����";
					mes "�o����Δ����ĂȂ��悤�ȉԂ������ȁB";
					set CHANGE_BA,2;
				}
				else {
					mes "[�A�C�I���f]";
					mes "�n�b�n�[�A�|���邱�Ƃ͂Ȃ���B";
					mes "�������ߏ��]�������Ⴂ���Ȃ��ȁB";
					next;
					mes "[�A�C�I���f]";
					mes "�N�ɂ͏\���˔\������񂾂���";
					mes "�C���ς������A�܂��q�˂Ă����ŁB";
				}
				break;
			case 2:
				mes "[�A�C�I���f]";
				mes "�̂̑f�������肻���Ȃ̂Ɏc�O���B";
				mes "�͕̂����Ă΂��肶��Ȃ��āA";
				mes "���̐l�ɕ������邱�Ƃ��y������B";
				next;
				mes "[�A�C�I���f]";
				mes "�����瑺�ցA�̂��ĉ��̂��i�ʂ��B";
				mes "�N���o�[�h�Ƃ��Đ����Ă݂Ȃ������H";
				break;
			case 3:
				mes "[�A�C�I���f]";
				mes "����c�c�������B";
				mes "����͂�����Ǝc�O���B";
				next;
				mes "[�A�C�I���f]";
				mes "����ł́A�܂��ǂ����Ł`�B";
				break;
		}
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 2:
		mes "[�A�C�I���f]";
		mes "���������ˁA�F��I";
		mes "�Ԃ������ė��������H";
		mes "�����Ă���Ȃ������H";
		next;
		if(countitem(629)) { //�̂���
			mes "[�A�C�I���f]";
			mes "���`�A����͉̂��Ԃ���Ȃ����I";
			mes "���̎v���o�̉Ԃ��c�c";
			next;
			mes "[�A�C�I���f]";
			mes "���̗F�B�������W���C�R�t�X�L��";
			mes "�D���������Ԃ��B";
			mes "���͂ǂ��ŉ������Ă���̂��낤�c�c";
			delitem 629,1;
		}
		else if(countitem(703)) { //�q�i��
			mes "[�A�C�I���f]";
			mes "�����c�c�����q�i���c";
			mes "����͂Ȃ����f�p�ŉ����Ԃ��ˁB";
			next;
			mes "[�A�C�I���f]";
			mes "�q�i���̗t�͎����|�ꂽ���ɗ͂����ꂽ";
			mes "�{���ɖ𗧂Ԃ��B���肪�Ƃ��B";
			delitem 703,1;
		}
		else if(countitem(704)) { //�A���G
			mes "[�A�C�I���f]";
			mes "�A���G���c�c����͒������ˁB";
			mes "�悭��ɓ����ꂽ�ˁI";
			next;
			mes "[�A�C�I���f]";
			mes "�A���G�̗t�������������c�c";
			mes "��͂�Ԃ���Ԃ����ˁB";
			delitem 704,1;
		}
		else if(countitem(708)) { //�����g
			mes "[�A�C�I���f]";
			mes "�����g�c�c";
			mes "������؂Ȏ����v���o����C�������c";
			mes "�v���Ԃ�Ɍ���āA�{���ɂ悩�����B";
			next;
			mes "[�A�C�I���f]";
			mes "�A���e�B�y�C�����g������炵�����c";
			mes "��������ɂ͐ɂ�����ˁB���肪�Ƃ��B";
			delitem 708,1;
		}
		else if(countitem(709)) { //�C�W�h��
			mes "[�A�C�I���f]";
			mes "���[�A����̓C�W�h�����ˁB";
			mes "��Ȃ�����ǁA�ƂĂ��������Ԃ��c�c";
			next;
			mes "[�A�C�I���f]";
			mes "�Z�����F�ɁA�l�𜒍��Ƃ����鍁��c�c";
			mes "�C�ɓ�������B���肪�Ƃ��B";
			delitem 709,1;
		}
		else if(countitem(710)) { //���z�̉�
			mes "[�A�C�I���f]";
			mes "���A����͌��z�̉ԁI";
			mes "����ȋM�d�Ȃ��̂������Ă���Ȃ�āI";
			next;
			mes "[�A�C�I���f]";
			mes "�����c�c�V�����ڂ̑O�Ɍ�����悤���B";
			mes "�f���炵���I�{���Ɋ�������I";
			delitem 710,1;
		}
		else if(countitem(748)) { //������Ȃ��o��
			mes "[�A�C�I���f]";
			mes "������Ȃ��o���c�ނނ��Ƃ̂Ȃ��o���B";
			mes "���ł͂Ȃ����l�ɂ�����΂����̂ɁB";
			next;
			mes "[�A�C�I���f]";
			mes "���̂悤�Ȏ҂��󂯎���Ă����̂��ȁB";
			mes "�n�b�n�[�A���肪�Ƃ��B";
			delitem 748,1;
		}
		else if(countitem(749)) { //�X�o��
			mes "[�A�C�I���f]";
			mes "�X�o���c�c�����ȃo����B";
			mes "�ԂƂ͌����Ȃ���������Ȃ����ǁA";
			mes "����ł��������ˁc�c";
			next;
			mes "[�A�C�I���f]";
			mes "�������ˁA���肪�Y��Ȃ��Ă�";
			mes "�ԂȂ̂�������Ȃ��ˁB";
			mes "����ł͎󂯂Ƃ点�Ē�����B";
			delitem 749,1;
		}
		else if(countitem(712)) { //��
			cutin "job_bard_aiolo02",2;
			mes "[�A�C�I���f]";
			mes "�������A���̕��}�ȉԂ́B";
			mes "�Ԃ͉Ԃ����c����ł͑ʖڂ��ˁB";
			next;
			mes "[�A�C�I���f]";
			mes "�v�����e���ŏ����������Ă��ˁB";
			mes "���̉Ԃ������Ă��Ă���Ȃ������B";
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(744)) { //�Ԃ���
			mes "[�A�C�I���f]";
			mes "�ق��ق��A�ԑ��������ė����ˁB";
			mes "����͎��Ɏ����Ă��镨�ł͂Ȃ����낤";
			next;
			mes "[�A�C�I���f]";
			mes "���j����������ˁA";
			mes "�]�E����m�[�r�X�N�ɂł�";
			mes "��������ǂ������H";
			mes "�l�ɂ͑��̉Ԃ𗊂ނ�B";
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		else if(countitem(745)) { //�u�[�P
			cutin "job_bard_aiolo02",2;
			mes "[�A�C�I���f]";
			mes "���������c�c";
			mes "�������ł���������肩���H";
			mes "�j�Ƀu�[�P�������Ăǂ�����B";
			next;
			mes "[�A�C�I���f]";
			mes "���������̂��삳��ɂł�";
			mes "�v���[���g���Ȃ�B";
			mes "�l�ɂ͑��̉Ԃ𗊂ނ�B";
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(1032)) { //�H�l�A���̉�
			cutin "job_bard_aiolo02",2;
			mes "[�A�C�I���f]";
			mes "�c�c�ǂ����Ă���ȏX�����̂�";
			mes "�����ė����񂾂��H";
			mes "���������l���Ă���Ȃ�����c�c";
			next;
			mes "[�A�C�I���f]";
			mes "�΂킹�悤�Ƃł������̂����H";
			mes "���������܂Ƃ��ȉԂ��������Ă����B";
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		else if(countitem(2207)) { //�����p��
			mes "[�A�C�I���f]";
			mes "���[��c�c����͑����p�Ԃ��ˁB";
			mes "�Ԃ͉Ԃ����c����ł͑ʖڂ��ˁB";
			next;
			mes "[�A�C�I���f]";
			mes "���͔������č������Ԃ��D���Ȃ񂾁B";
			mes "���邽�߂����̉Ԃ͌�������B";
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		else {
			cutin "job_bard_aiolo02",2;
			mes "[�A�C�I���f]";
			mes "����H���������ĂȂ�����Ȃ����B";
			mes "�Ԃ������ė��Ăƌ���Ȃ��������ȁB";
			next;
			mes "[�A�C�I���f]";
			mes "��l�Ŋw�т����Ȃ�A����ł��������B";
			mes "�̂����Ƃ͎��R�Ȃ񂾂���B";
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		next;
		mes "[�A�C�I���f]";
		mes "���ꂶ�Ⴀ�񑩂ǂ���A";
		mes "�o�[�h�ɂȂ��`�������Ȃ��Ă͂ˁB";
		mes "�������ȒP�ł͂Ȃ����B�n�b�n�[�I";
		next;
		mes "[�A�C�I���f]";
		mes "�̂��w�Ԃ��߂ɂ�";
		mes "�����̐l�ƐG�ꍇ�����Ƃ���؂��B";
		mes "���������̑��̂��܂��܂Ȏ�����";
		mes "���������Ȃ���΂Ȃ�Ȃ����c�c";
		next;
		mes "[�A�C�I���f]";
		mes "�������A���e�B�G�Ƃ�������";
		mes "����Ⴞ��܂�����񂾁B";
		mes "���̑��֍s���āA";
		mes "���蕨��������ė���悤�ɁB�����ˁB";
		next;
		mes "[�A�C�I���f]";
		mes "�X�m�E�m�E�ƗF�B�ɂȂ�΁A";
		mes "�����Ⴄ���Ƃ��ł��邾�낤�B";
		mes "���̐l�B�Ƃ��A�������񌾗t��";
		mes "���킵�Ă��Ă݂Ă���Ȃ������H";
		set CHANGE_BA,3;
		set LUTIE_1QUE,1;
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	case 3:
		if(LUTIE_1QUE < 11) { //npc_town_lutie.txt�ɂĔ��s
			mes "[�A�C�I���f]";
			mes "�������A�ނƗF�B�ɂȂ邱�Ƃ�";
			mes "�o���Ȃ��������B";
			mes "���t�����ł͑ʖڂȂ��Ƃ�����񂾂�B";
			next;
			mes "[�A�C�I���f]";
			mes "�X�m�E�m�E�ƗF�B�ɂȂ�΁A";
			mes "�����Ⴄ���Ƃ��ł��邾�낤�B";
			mes "���̐l�B�Ƃ��A�������񌾗t��";
			mes "���킵�Ă��Ă݂Ă���Ȃ������H";
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		mes "[�A�C�I���f]";
		mes "��������B";
		mes "��������l�ɉ���ė��������H";
		mes "���蕨�������Ƒ�؂Ȃ��Ƃ�";
		mes "������Ă킩�����ˁB";
		next;
		mes "[�A�C�I���f]";
		mes "����ł́A�̂��̂��Č��邩�c�c";
		mes "��������{���̂��Ă݂邩��c�c";
		mes "�K���ĉ̂��Ă݂Ă��ꂽ�܂��B";
		next;
		mes "[�A�C�I���f]";
		mes "�n�߂悤��";
		mes "�t���t���A�z�b�z�b";
		mes "1�A2�A3�A4�`";
		next;
		switch(rand(5)) {
		case 0: //�j�����h�̉�
			setarray .@list$,"�������Ȃ��������l����","�������Ȃ��������l����","�Ȃ�Ƃ�������������","���Ɠ��𔄂����̂�","�ŏ��͐ԃ|�[�V������","�v�����e���ň����������ƌ�����";
			break;
		case 1: //���̉�
			setarray .@list$,"�����Ƒ傫���炷�������I","�i�ޕ�����A�͂����߂�I","������A��n�𓥂ݒ��߂�I","�􂯂����ȐS���삯�o���悤�ɁI","�ق�J����ǂɍ�������I","�����ƌ������͓�x�Ɨ��Ȃ��낤�I";
			break;
		case 2: //�W�[�N�t���[�h�̉�
			setarray .@list$,"�s���g�ƌĂ΂ꂽ","�j������","���̖����u�W�[�N�t���[�h�v","�p�Y�u�W�[�N�����g�v�̑��q","�׈��ȋ��l�u�t�@�t�j�[���v","���ɕς���Ĕނ�j��";
			break;
		case 3: //�u���M�̉�
			setarray .@list$,"�u���M�A�u���M","�i���̎��l�̖����ĂтȂ���","�䂪�͔̂ނ̑��Â���","�䂪�S�͔ނ̈ӎu","��V���l�͔ނ̉��g","���ׂẲ͔̂ނɋA��ł��傤";
			break;
		case 4: //�C�h�D���̉�
			setarray .@list$,"���������_�C�h�D��","�������Ĕ����L���̏��_��","�I�[�f�B���̑��q�u���M�̍�","�ޏ����Ă����ς�����ꂽ�ь�","�ޏ��̊Á`���ь�̂��������낤","�_�X�͉i���ɘV���邱�Ƃ��Ȃ�";
			break;
		}
		for(set .@i,0; .@i<6; set .@i,.@i+1) {
			for(set .@j,0; .@j<6; set .@j,.@j+1)
				mes ((.@count<.@j)? "^000000": "^3173FF") +.@list$[.@j]+ "^000000";
			next;
			input .@word$;
			if(.@word$==.@list$[.@i])
				set .@point,.@point+1;
		}
		if(.@point<6) {
			cutin "job_bard_aiolo02",2;
			mes "[�A�C�I���f]";
			mes "���₨��c�c�̎����Ⴄ����Ȃ����B";
			mes "������Ɖ̂��Ă���Ȃ��Ă͂ˁc�c";
			next;
			mes "[�A�C�I���f]";
			mes "�������܂��܂��̂悤���ˁB";
			mes "���́A�����Ƃ�����Ɛ����o���悤�ɁB";
			close2;
			cutin "job_bard_aiolo02",255;
			end;
		}
		mes "�c�c";
		next;
		mes "[�A�C�I���f]";
		mes "���h���I��������Ȃ����I";
		mes "����Ȃ�A�ǂ��o�[�h�ɂȂ�邾�낤�I";
		next;
		mes "[�A�C�I���f]";
		mes "����ł́c";
		mes "���ꂩ��o�[�h�ɂȂ�Ƃ����B";
		mes "���̑O�ɋL�O�ɂȂ���̂��グ�����ȁB";
		next;
		mes "[�A�C�I���f]";
		mes "���̂܂ܓ]�E���邩���H";
		mes "����Ƃ������~���������H";
		next;
		if(select("���̂܂ܓ]�E���܂��B","���蕨���~�����ł��B")==2) {
			mes "[�A�C�I���f]";
			mes "����c�������ˁB";
			mes "^3173FF�؋�^000000����ɓ���ė��Ă���Ȃ������B";
			mes "�Ȃ�ł��\��Ȃ�����A";
			mes "������ނ�60���ނ�B";
			next;
			mes "[�A�C�I���f]";
			mes "�����ė��Ă��ꂽ��A";
			mes "�L�O�i����������B";
			mes "����A�����Ă�����Ⴂ�B";
			set CHANGE_BA,4;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
	case 4:
		if(SkillPoint) {
			mes "[�A�C�I���f]";
			mes "����c�܂��X�L���|�C���g��";
			mes "�c���Ă���悤���ˁB";
			mes "�S���g�������Ă��痈�Ă��ꂽ�܂��B";
			next;
			mes "[�A�C�I���f]";
			mes "�ł͋L�O�i����肽������A�������ˁc";
			mes "^3173FF�؋�^000000���W�߂Ă��ĖႦ�Ȃ����ȁB";
			mes "�Ȃ�ł��\��Ȃ�����A";
			mes "������ނ�60���ނ�B";
			set CHANGE_BA,4;
			close2;
			cutin "job_bard_aiolo01",255;
			end;
		}
		if(CHANGE_BA == 3) break;
		if(countitem(1066) >= 60) {
			set .@trunkid,1066;
			set .@itemid,(JobLevel >= 50)? 1910: 1905;
		}
		else if(countitem(1067) >= 60) {
			set .@trunkid,1067;
			set .@itemid,1903;
		}
		else if(countitem(1068) >= 60) {
			set .@trunkid,1068;
			set .@itemid,1903;
		}
		else if(countitem(1019) >= 60) {
			set .@trunkid,1019;
			set .@itemid,1901;
		}
		else {
			mes "[�A�C�I���f]";
			mes "���[��A^3173FF�؋�^000000���W�߂���肾�����̂�";
			mes "���̂܂ܓ]�E���邱�Ƃɂ����̂����H";
			next;
			if(select("���̂܂ܓ]�E���܂��B","�������A�W�߂Ă��܂��B")==2) {
				mes "[�A�C�I���f]";
				mes "����c�������ˁB";
				mes "^3173FF�؋�^000000����ɓ���ė��Ă���Ȃ������B";
				mes "�Ȃ�ł��\��Ȃ�����A";
				mes "������ނ�60���ނ�B";
				next;
				mes "[�A�C�I���f]";
				mes "�����ė��Ă��ꂽ��A";
				mes "�L�O�i����������B";
				mes "����A�����Ă�����Ⴂ�B";
				close2;
				cutin "job_bard_aiolo01",255;
				end;
			}
			break;
		}
		mes "[�A�C�I���f]";
		mes "�₟�A�����l�B";
		mes "�����A�]�E�L�O�i������Ă������B";
		mes "�����̊Ԃ����҂��ĂĂ���Ȃ������B";
		next;
		mes "^3173FF�M�[�M�[�A�g���^���A�g���^��";
		mes "�J���J���A�L�[�R�L�[�R^000000";
		next;
		delitem .@trunkid,60;
		getitem .@itemid,1;
		nude;
		jobchange Job_Bard;
		set CHANGE_BA,0;
		mes "[�A�C�I���f]";
		mes "�����A�L�O�i���B";
		mes "�̂����Ɏg���Ă���Ȃ������B";
		mes "����Ŋy�����̂��ė~�����B";
		mes "���Ⴀ�A�܂�����I";
		close2;
		cutin "job_bard_aiolo01",255;
		end;
	}
	nude;
	jobchange Job_Bard;
	set CHANGE_BA,0;
	mes "[�A�C�I���f]";
	mes "�����I�y�����̂��Ă��������B";
	mes "���̂悤�ɉ_�̂悤�ɂˁI";
	next;
	mes "[�A�C�I���f]";
	mes "���Ⴀ�A�܂�����I";
	close2;
	cutin "job_bard_aiolo01",255;
	end;
}