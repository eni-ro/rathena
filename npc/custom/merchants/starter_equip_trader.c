
ven_in01,93,96,5	script	�X�^�[�^�[��������	4_M_GUILLOTINE,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000�C���x���g���̒��g�����炵�ė��ĉ�����^000000";
		close;
	}
	mes "[�X�^�[�^�[��������]";
	mes "�X�^�[�^�[������~�����Ȃ����H";
	mes "�����V���[�Y�̑����Ȃ�2�A";
	mes "�Ⴄ�V���[�Y�̑����Ȃ�3�Ɨ~�����������������邺�B";
	next;
	setarray .@list_type$,
		"�V���{�V���[�Y","�����{�V���[�Y","��r�{�V���[�Y",
		"�V噋{�V���[�Y","�l�n�{�V���[�Y","�o���{�V���[�Y","�|���b�N�X�V���[�Y";
	.@size = getarraysize( .@list_type$ );
	.@menu$ = "";
	for(.@i = 0; .@i < .@size; .@i++)
		.@menu$ = .@menu$ + .@list_type$[.@i] + ":";
	.@menu$ = .@menu$ + "��߂�";
	.@sel = select( .@menu$ ) - 1;
	if ( .@sel == .@size ) {
		goto L_CANCEL_END;
	}
	mes "[�X�^�[�^�[��������]";
	mes .@list_type$[ .@sel ] + "�̉����~�����񂾁H";
	next;
	setarray .@list_iid,
		1150,	19468,	15418,	20970,	22227,	32261,	//�V���{
		640002,	5599,	450015,	480009,	470014,	490010,	//�����{
		26167,	19496,	15426,	20972,	22231,	32266,	//��r�{
		28047,	19471,	15424,	20976,	22233,	32267,	//�V噋{
		700010,	5739,	450140,	480050,	470045,	490041,	//�l�n�{
		640006,	5514,	450133,	480041,	470038,	490034,	//�o���{
		28643,	15823,	15447,	20983,	2400,	32293;	//�|���b�N�X
	.@menu$ = "";
	for(.@i = 0; .@i < 6; .@i++)
		.@menu$ = .@menu$ + getitemname( .@list_iid[.@sel*6+.@i] ) + ":";
	.@menu$ = .@menu$ + "��߂�";
	.@idx = select( .@menu$ ) - 1;
	if ( .@idx == 6 ) {
		goto L_CANCEL_END;
	}
	.@iid = .@list_iid[.@sel*6+.@idx];
	mes "[�X�^�[�^�[��������]";
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]���ȁB";
	mes "�����V���[�Y�̑����ƁA";
	mes "�Ⴄ�V���[�Y�̑���";
	mes "�ǂ���ƌ������Ă����񂾁H";
	next;
	.@exch_size = 0;
	switch(select("�����V���[�Y:�Ⴄ�V���[�Y:��߂�")){
		case 1:
			for(.@i = 0; .@i < 6; .@i++){
				if(( .@i != .@idx ) && ( countitem( .@list_iid[.@sel*6+.@i] ) )){
					.@exchg[.@exch_size] = .@list_iid[.@sel*6+.@i];
					.@exch_size++;
				}
			}
			.@req_num = 2;
			break;
		case 2:
			for(.@i = 0; .@i < .@size; .@i++){
				if( .@i == .@sel ){
					continue;
				}
				for(.@j = 0; .@j < 6; .@j++){
					if( countitem( .@list_iid[.@i*6+.@j] )){
						.@exchg[.@exch_size] = .@list_iid[.@i*6+.@j];
						.@exch_size++;
					}
				}
			}
			.@req_num = 3;
			break;
		case 3:
			goto L_CANCEL_END;
	}
	if( .@exch_size == 0 ){
		mes "[�X�^�[�^�[��������]";
		mes "�����Ώۂ̑�����";
		mes "���������Ă��Ȃ��ȁB";
		close;
	}
	.@menu$ = "";
	for(.@i = 0; .@i < .@exch_size; .@i++)
		.@menu$ = .@menu$ + getitemname( .@exchg[.@i] ) + ":";
	.@menu$ = .@menu$ + "��߂�";
	
	for(.@i = 1; .@i <= .@req_num; .@i++){
		mes sprintf("����������%d�Ԗڂ̑�����I��ł���B",.@i);
		mes "";
		mes "^ff0000���l�^�u�A���B�ς݁A�J�[�h�}���ς݂��폜�����̂Œ��ӂ��ĉ������B^000000";
		next;
		.@sel = select( .@menu$ ) - 1;
		if ( .@sel == .@exch_size ) {
			goto L_CANCEL_END;
		}
		.@deliid = .@exchg[ .@sel ];
		.@ins = getarraysize( .@delist );
		for( .@j = 0; .@j < .@ins; .@j += 2 ){
			if( .@delist[.@j] == .@deliid ){
				break;
			}
		}
		.@delist[ .@j ] = .@deliid;
		.@delist[ .@j + 1 ] += 1;
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		if( countitem( .@delist[ .@i ] ) < .@delist[ .@i + 1 ] ){
			mes "[�X�^�[�^�[��������]";
			mes "�A�C�e��������Ȃ��ȁB";
			close;
		}
	}
	mes "[�X�^�[�^�[��������]";
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		mes sprintf("[<ITEM>%s<INFO>%d</INFO></ITEM>]��%d��",getitemname(.@delist[ .@i ]),.@delist[ .@i ],.@delist[ .@i + 1 ]);
	}
	mes "��[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]�������ł����񂾂ȁH";
	next;
	if( select("��������:��߂�") == 2 ){
		goto L_CANCEL_END;
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		if( countitem( .@delist[ .@i ] ) < .@delist[ .@i + 1 ] ){
			mes "Anti-Hack!!!","���O�Ɏc���܂���";
			errormes "�X�^�[�^�[����Anti-Hack:"+strcharinfo(0);
			close;
		}
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		delitem .@delist[ .@i ],.@delist[ .@i + 1 ];
	}
	getitem .@iid,1;
	mes "[�X�^�[�^�[��������]";
	mes "�ق�A���ꂪ���]�݂̑������B";
	mes "�܂��~�������̂��ł����痈����B";
	close;
L_CANCEL_END:
	mes "[�X�^�[�^�[��������]";
	mes "�Ȃ񂾁A��₩�����B";
	mes "���͌����p�̑����������Ă�����B";
	close;
}
