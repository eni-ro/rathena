/*==================================================================================
�ėpCSV�ŃA�C�e������NPC�@<Ver1.1>

getinventorylist �̊g���g�p

-------------------------------------------------------------------------------------*/
-	script	����NPC_Rental#dammy	72,{

	set @name$,	"[" + strnpcinfo(1) + "]";	//���O(NPC)

	function my_message {	//���b�Z�[�W�̊Ǘ�
		switch (getarg(0)){
			case 1://���߂ɘb�����Ƃ�
				mes @name$;
                mes "�R�X�`���[�����������܂����H";
				next;
				break;
			case 2://�I���̌�E�쐬��
				mes @name$;
				mes getarg(1) + "��" + getarg(2) + "�ɑ΂��āA^3355FF";
				break;
			case 3://�I���̌�E�K�v�ޗ�
				mes getarg(1) + " �� " + getarg(2);
				break;
			case 4://�I���̌�E�t�b�^
				mes "^000000�K�v�ɂȂ�܂��B";
				break;
			case 5://�I���̌�E�t�b�^
				mes "�������܂����H","","�l�^�u�̃A�C�e���������̂Œ��ӂ��Ă��������B";
				next;
				break;
			case 6://�I���
				mes @name$;
				mes "���肪�Ƃ��������܂���","�܂��̂����p�����҂����Ă���܂��B";
				break;
			case 7://�����^��
				mes @name$;
				mes "�����^���̏ꍇ�A���Ԃ�3���ɂȂ�܂�";
				break;
			case 98://�G���[
				mes @name$;
				mes "�G���[�ł��B";
				mes "�����𒆎~���܂��B";
				break;
			case 99://�L�����Z��
				mes "�܂��̂����p�����҂����Ă���܂��B";
				break;
		}
		return;
	}

	my_message 1;

//�I��
	//	.@level:	�I�����̐[�x
	//	.@line:		�I�����̐�
	//	.filename$	CSV�t�@�C���̏ꏊ
	//	.@row_num:	�ꎞ�I��CSV�t�@�C���̍s��
	//	.@row[.@level][.@line]:		CSV�t�@�C���̍s�����i�[
	//	.@type$[.@level][.@line]:	�I�����̓��e���i�[
	//	.@temp:	�ꎞ�I�Ɏg�p

	set .@level,1;
	set .@row_max,csvgetrows(.filename$);
	set .@row_num,1;
	while (1) {
		freeloop(1);
		for( .@line=0; .@row_num < .@row_max; .@row_num++ ) {
			.@temp = .col_lv$[.@row_num];
			//debugmes "csvread line = " + .@row_num + ", lv = " + .@temp;
			if ( .@temp > .@level )
				continue;
			if ( .@temp < .@level )
				break;
			.@type$[.@line] = .col_name$[.@row_num];
			set .@row[.@line],.@row_num;
			set .@line,.@line+1;
		}

		.@menu_str$ = "";
		for( .@i = 0; .@i < .@line; .@i++ ){
			.@menu_str$ = .@menu_str$ + .@type$[.@i] + ":";
		}
		.@menu_str$ = .@menu_str$ + "��߂�";

		set @menu,select(.@menu_str$) - 1;
		freeloop(0);
		if (@menu == .@line)
			close;

		set .@row_num,.@row[@menu]+1;
		set .@name$,.@type$[@menu];
		set .@temp, csvread(.filename$, .@row_num, 0);

		if (.@temp <= .@level)
			break;

		//�[�x��������
		set .@level,.@level+1;
	}

//�ޗ��ǂݍ���
	//	.filename$:	CSV�t�@�C���̏ꏊ
	//	.@line:		CSV�̍s��
	//	.@name$		�A�C�e�����̊i�[
	//	.@name_id	�A�C�e��ID�̊i�[
	//	.@name_num	�A�C�e�����̊i�[
	//	.@cols:		�A�C�e���̎�ރJ�E���g
	//	.@check_id[.@cols]:		�K�v�A�C�e��ID
	//	.@check_num[.@cols]:	�K�v�A�C�e����

	set .@line,.@row[@menu];
	set .@name_id, csvread(.filename$, .@line, 2);
	set .@name_num, csvread(.filename$, .@line, 3);
	set .@cols,1;
	my_message 2,.@name$,.@name_num;
	while (1) {
		set .@check_id[.@cols], csvread(.filename$, .@line, (.@cols * 2 + 2));
		if (!.@check_id[.@cols]) 
			break;

		set .@check_num[.@cols], csvread(.filename$, .@line, (.@cols * 2 + 3));
		if (.@check_id[.@cols] < 0 ) 
			my_message 3,"�[�j�[",.@check_num[.@cols] + "z";

		else 
			my_message 3,getitemname(.@check_id[.@cols]),.@check_num[.@cols] + "��";

		set .@cols,.@cols + 1;
	}
	my_message 4;

//�`�F�b�N�E�I��
	//	.@min:		���鐔
	//	.@cols:		�A�C�e���̎�ރJ�E���g
	//	.@check_id[.@cols]:		�K�v�A�C�e��ID
	//	.@check_num[.@cols]:	�K�v�A�C�e����
	//	.@temp:	�ꎞ�I�Ɏg�p
	set .@min,30000;
	set .@cols,1;
	while (1) {

		if (!.@check_id[.@cols])
			break;
		if ( .@check_id[.@cols] == -1 ) 
			set .@temp, (Zeny / .@check_num[.@cols] );
		else {
			set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
			set .@temp,.@temp / .@check_num[.@cols];
		}

		if ( .@min > .@temp )
			set .@min,.@temp;

		set .@cols,.@cols + 1;
	}
	//�C���x���g���̋󂫃`�F�b�N
	if(.@min > checkitemblank()){
		set .@min,checkitemblank();
	}
	if (.@min < 1)
		close;

	my_message 5;
	switch(select("�P�����","�񐔎w��",.@min + "��(�ő�)����","�����^��","��߂�")){
		case 1:
			set .@number,1;
			break;
		case 2:
			input .@number;
			break;
		case 3:
			set .@number,.@min;
			break;
		case 4:
			my_message 7;
			getitem2 .@name_id,1,1,0,0,0,0,0,0,180;
			break;
		case 5:
			close;
	}
	// �d�ʃ`�F�b�N
	if ((checkweight(.@name_id ,.@name_num * .@number)) == 0){
		mes @name$;
		mes "����A�A�C�e������t����";
		mes "�������Ă���܂������ŁB";
		close;
	}

	// 100��`�F�b�N
	if(!checkitemblank()){
		mes @name$;
		mes "����A�A�C�e������t����";
		mes "�������Ă���܂������ŁB";
		close;
	}

	if(.@min < .@number)
		close;

//�ŏI�`�F�b�N�E�쐬
	if (.@number < 1)
		close;

	set .@cols,1;
	set .@dammy,0;
	while (1) {
		if (!.@check_id[.@cols])
			break;
		if ( .@check_id[.@cols] == -1 ){
			if(Zeny < .@check_num[.@cols])
				set .@dammy,1;
		} else {
			set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
			if(.@temp < .@check_num[.@cols])
				set .@dammy,1;
		}
		set .@cols,.@cols + 1;
	}

	if(.@dammy){
		mes @name$;
		mes "�A�C�e�������������݂���";
		mes "������x���߂������Ă�";
		close;
	}
	
	for(set .@j,0;.@j < .@number;set .@j,.@j + 1) {
		set .@cols,1;
		while (1) {
			if (!.@check_id[.@cols])
				break;
			if ( .@check_id[.@cols] == -1 ){
				set Zeny, Zeny - .@check_num[.@cols];
			} else {
				set .@type,getiteminfo(.@check_id[.@cols],2);
				if(.@type == IT_ARMOR || .@type == IT_WEAPON || .@type == IT_PETARMOR || .@type == IT_SHADOWGEAR){
					for(set .@b,0;.@b < .@check_num[.@cols];set .@b,.@b + 1) {
						//set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],1);
						delitem .@check_id[.@cols],1;
					}
				} else {
					//set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],.@check_num[.@cols]);
					delitem .@check_id[.@cols],.@check_num[.@cols];
				}
			}
			set .@cols,.@cols + 1;
		}
		getitem .@name_id,1;
	}

	close;
OnInit:
	if( getarraysize(.col_lv$[0]) == 0){
		.filename$ = "npc/custom/merchants/normal_cos.txt";
		csvreadcol(.filename$,0,.col_lv$[0]);
		csvreadcol(.filename$,1,.col_name$[0]);
	}
	end;
}

ven_in01,90,87,5	duplicate(����NPC_Rental#dammy)	�R�X�`���[������#1	10220
