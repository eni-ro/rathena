/*=========================================================================
 * SQL�N�G�����s�e�X�g
 *				created by Rayce (Auriga0107)
 *
 * �� sqlquery�֐���csv�A�N�Z�X����/�֐��Ɠ��l�̓����SQL�ɂ���čs��
 *    ���߂̊֐��ł��B
 *    csv�A�N�Z�X����/�֐������_��ȑ��삪�s���闘�_������܂��B
 *    ������SQL���Ɋւ��Ă͔@���Ȃ鐧�����݂��Ă��Ȃ��̂ŁA�֗��ł��锽��
 *    �댯�ȓ�����e�ՂɎ��s�ł���Ƃ�����������܂��B
 *    ���p�҂̐ӔC�ɂ����ď\�����ӂ��Ďg���Ă��������B
 *
 * �� SQL���ɕ�������܂ޏꍇ�ɂ͕K��strescape�֐���ʂ��Ă��������B
 *-------------------------------------------------------------------------
 */
prontera,155,195,4	script	����񂯂�	113,{
	mes "[����񂯂�]";
	mes "����񂯂�͂ǂ��ł����H";
	next;
	switch(select("����񂯂񂷂�","�����L���O������","���悤�Ȃ�")) {
	case 1:
		mes "[����񂯂�]";
		mes "����`�񂯁`��E�E�E";
		next;
		set .@own,select("�`���L","�O�[","�p�[")-1;
		gmcommand "@emotion "+(.@own+10);
		set .@enemy,rand(3);
		emotion .@enemy+10;
		mes "[����񂯂�]";
		mes "�|���b�I";
		next;
		if(.@own == .@enemy) {
			mes "[����񂯂�]";
			mes "�������ł��B";
			close;
		}
		if(.@own != (.@enemy+1)%3) {
			mes "[����񂯂�]";
			mes "���Ȃ��̕����ł��B";
			close;
		}
		// �������Ƃ��̓X�R�A�L�^
		set .@rid,getcharid(0);
		if(sqlquery("SELECT `score` FROM `janken` WHERE `char_id`=" + .@rid,.@score) > 0) {
			// ���Ƀf�[�^������ꍇ�̓X�R�A���Z���čX�V
			set .@dummy,sqlquery("UPDATE `janken` SET `score`=" +(.@score+1)+ " WHERE `char_id`=" + .@rid);
		}
		else {
			// �X�R�A1�_�Ƃ��ĐV�K�o�^
			// �L�������͕K��strescape���邱�ƁI
			set .@dummy,sqlquery("INSERT INTO `janken` (`char_id`, `name`, `score`) VALUES"
						"(" +.@rid+ ", '" +strescape(strcharinfo(0))+ "', 1)");
		}
		mes "[����񂯂�]";
		mes "���Ȃ��̏����ł��B";
		mes "���݂̃X�R�A��";
		mes "^FF0000" +(.@score+1)+ "^000000 �_�ł��B";
		close;
	case 2:
		// �����s�̃f�[�^��z��ϐ��Ɏ擾
		set .@max,sqlquery("SELECT `name`,`score` FROM `janken` ORDER BY `score` DESC",.@data$);
		if(.@max > 0) {
			// .@max�̍ő�l�͔z������128�Ȃ̂ŁA�\���\�Ȃ̂�129�ʂ܂�
			while(1) {
				mes "[����񂯂�]";
				for(set .@i,0; .@i < 6 && .@j < .@max; set .@i,.@i+1) {
					mes (.@j+1) + "�ʁF" +.@data$[.@j][0]+ " [^FF0000" +.@data$[.@j][1]+ "^000000]";
					set .@j,.@j+1;
				}
				if(.@j >= .@max) {
					break;
				}
				next;
			}
		}
		else {
			mes "[����񂯂�]";
			mes "�����L���O�͂���܂���B";
		}
		close;
	case 3:
		mes "[����񂯂�]";
		mes "�܂��ǂ����B";
		close;
	}

OnInit:
	// CREATE��GRANT������Ȃ�ȉ���L���ɂ���
	// �����ł���Ύ��O�Ńe�[�u�����쐬���邱��
	/*
	if(sqlquery(
		"CREATE TABLE IF NOT EXISTS `janken`"
		"(`char_id` int(11) NOT NULL DEFAULT .0',"
		"`name` varchar(255) NOT NULL DEFAULT '',"
		"`score` int(11) NOT NULL DEFAULT .0',"
		"PRIMARY KEY (`char_id`)) TYPE = MyISAM") < 0
	) {
		hideonnpc;
	}
	*/
	end;
}