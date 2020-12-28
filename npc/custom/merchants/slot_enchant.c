-	script	�G���`�����gNPC_A#-1	72,{
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	set @name$,	"[" + strnpcinfo(1) + "]";	//���O(NPC)

	function my_message {	//���b�Z�[�W�̊Ǘ�
		switch (getarg(0)){
			case 1://���߂ɘb�����Ƃ�
				mes @name$;
				mes "�G���`�����g����������I��łˁB";
				mes "^3355FF�l�^�u�⑕���i��";
				mes "�f�ނƂ��ăJ�E���g���Ȃ�����";
				mes "���ӂ��Ă�^000000";
				next;
				break;
			case 2://�I���̌�E�쐬��
				mes @name$;
				mes getarg(1) + "���G���`�����g����ɂ́A^3355FF";
				break;
			case 3://�I���̌�E�K�v�ޗ�
				mes getarg(1) + " �� " + getarg(2);
				break;
			case 4://�I���̌�E�t�b�^
				mes "^000000�K�v�ɂȂ�܂��B";
				break;
			case 5://�I���̌�E�t�b�^
				mes "���s���܂����H";
				next;
				break;
			case 6://�I���
				mes @name$;
				mes "���肪�Ƃ��������܂���","�܂��̂����p�����҂����Ă���܂��B";
				break;
			case 97://�G���[
				mes @name$;
				mes "DB�ݒ�G���[�ł��B";
				mes "GM�ɕ񍐂��ĉ������B";
				break;
			case 98://�G���[
				mes @name$;
				mes "�G���[�ł��B";
				mes "�G���`�����g�𒆎~���܂��B";
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
	//	.@file$:	CSV�t�@�C���̏ꏊ
	//	.@row_num:	�ꎞ�I��CSV�t�@�C���̍s��
	//	.@row[.@level][.@line]:		CSV�t�@�C���̍s�����i�[
	//	.@type$[.@level][.@line]:	�I�����̓��e���i�[
	//	.@temp:	�ꎞ�I�Ɏg�p

	set .@level,1;
	set .@row_max,csvgetrows(.@file$);
	set .@row_num,1;
	while (1) {
		for( .@line=0; .@row_num < .@row_max; .@row_num++ ) {
			.@temp = csvread(.@file$, .@row_num, 0);

			if ( .@temp > .@level )
				continue;
			if ( .@temp < .@level )
				break;
			.@type$[.@line] = csvread(.@file$, .@row_num, 1);
			set .@row[.@line],.@row_num;
			.@line++;
		}

		.@menu_str$ = "";
		for( .@i = 0; .@i < .@line; .@i++ ){
			.@menu_str$ = .@menu_str$ + .@type$[.@i] + ":";
		}
		.@menu_str$ = .@menu_str$ + "��߂�";

		set @menu,select(.@menu_str$) - 1;
		if (@menu == .@line)
			close;

		set .@row_num,.@row[@menu]+1;
		set .@name$,.@type$[@menu];
		set .@temp, csvread(.@file$, .@row_num, 0);

		if (.@temp <= .@level)
			break;

		//�[�x��������
		set .@level,.@level+1;
	}

//�ޗ��ǂݍ���
	//	.@file$:	CSV�t�@�C���̏ꏊ
	//	.@line:		CSV�̍s��
	//	.@name$		�A�C�e�����̊i�[
	//	.@name_id	�A�C�e��ID�̊i�[
	//	.@part		�G���`�����g�ӏ�
	//	.@cols:		�A�C�e���̎�ރJ�E���g
	//	.@check_id[.@cols]:		�K�v�A�C�e��ID
	//	.@check_num[.@cols]:	�K�v�A�C�e����

	set .@line,.@row[@menu];
	set .@name_id, csvread(.@file$, .@line, 2);
	set .@part, csvread(.@file$, .@line, 3);
	set .@cols,1;

	if( getiteminfo(.@name_id,0) == -1 ){
		my_message 97;
		close;
	}
	my_message 2,"[<ITEM>"+getitemname(.@name_id)+"<INFO>"+.@name_id+"</INFO></ITEM>]";
	while (1) {
		set .@check_id[.@cols], csvread(.@file$, .@line, (.@cols * 2 + 2));
		if (!.@check_id[.@cols]) 
			break;

		set .@check_num[.@cols], csvread(.@file$, .@line, (.@cols * 2 + 3));
		switch( .@check_id[.@cols] ){
			case -1:
				my_message 3,"�[�j�[",.@check_num[.@cols] + "z";
				break;
			case -2:
				my_message 3,"�L���b�V���|�C���g",.@check_num[.@cols] + "�|�C���g";
				break;
			default:
				if( getiteminfo(.@check_id[.@cols],0) == -1 ){
					next;
					my_message 97;
					close;
				}
				my_message 3,"[<ITEM>"+getitemname(.@check_id[.@cols])+"<INFO>"+.@check_id[.@cols]+"</INFO></ITEM>]",.@check_num[.@cols] + "��";
				break;
		}

		set .@cols,.@cols + 1;
	}
	my_message 4;

//�`�F�b�N�E�I��
	//	.@cols:		�A�C�e���̎�ރJ�E���g
	//	.@check_id[.@cols]:		�K�v�A�C�e��ID
	//	.@check_num[.@cols]:	�K�v�A�C�e����
	//	.@temp:	�ꎞ�I�Ɏg�p
	set .@cols,1;
	while (1) {

		if (!.@check_id[.@cols])
			break;
		switch ( .@check_id[.@cols] ){
			case -1:
				set .@temp, (Zeny / .@check_num[.@cols] );
				break;
			case -2:
				set .@temp, (#CASHPOINTS / .@check_num[.@cols] );
				break;
			default:
				set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
				set .@temp,.@temp / .@check_num[.@cols];
				break;
		}

		if ( .@temp < 1 )
			close;

		set .@cols,.@cols + 1;
	}

	my_message 5;
	switch(select("�G���`�����g����","��߂�")){
		case 1:
			set .@number,1;
			break;
		case 2:
			close;
	}
	.@equip_id = getequipid(.@part);
	.@refine = getequiprefinerycnt(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
	copyarray .@tmp_card[0], .@card[0], 4;
	for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
		.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
		.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
		.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
	}

    //���ʔԍ����G���`���ӏ��Ȃ̂ŃG���`���ӏ����擾����
    if(!getequipisequiped(.@part)){
        mes @name$;
        mes "�����������ĂȂ�ˁB";
        mes "�������Ă���܂����ĂˁB";
        close;
    }
    
    //�G���`�����g���擾(4Slot���珇��1Slot�܂ŃG���`���\)
    set .@target,-1;
    for(.@i = 3; .@i >= getiteminfo(.@equip_id,10); .@i-- ) {
        if(.@card[.@i] == 0){
            .@card[.@i] = .@name_id;
			.@target = .@i;
            break;
        }
    }
    if( .@target == -1 ){
        mes @name$;
        mes "��������ȏ�G���`�����g�͏o���Ȃ���ˁB";
		mes "���~���܂��ˁB";
        close;
    }

	set .@cols,1;
	set .@dammy,0;
	while (1) {
		if (!.@check_id[.@cols])
			break;
		switch ( .@check_id[.@cols] ){
			case -1:
				if(Zeny < .@check_num[.@cols])
					set .@dammy,1;
				break;
			case -2:
				if(#CASHPOINTS < .@check_num[.@cols])
					set .@dammy,1;
				break;
			default:
				set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
				if(.@temp < .@check_num[.@cols])
					set .@dammy,1;
				break;
		}
		set .@cols,.@cols + 1;
	}

	if(.@dammy){
		mes @name$;
		mes "�A�C�e�������������݂���";
		mes "������x���߂������Ă�";
		close;
	}
	
	// anti-hack
	if (callfunc("F_IsEquipIDHack", .@part, .@equip_id) || callfunc("F_IsEquipRefineHack", .@part, .@refine) || callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3]))
		close;
	
    set .@cols,1;
    while (1) {
        if (!.@check_id[.@cols])
            break;
        switch( .@check_id[.@cols] ){
			case -1:
				Zeny -= .@check_num[.@cols];
				break;
			case -2:
				#CASHPOINTS -= .@check_num[.@cols];
				break;
			default:
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
	         	break;
        }
        set .@cols,.@cols + 1;
    }

	delequip .@part;
	getitem3 .@equip_id,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

    misceffect 610,0;

	close;
OnInterIfInitOnce:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	end;
}

//================================================================================
//NPC�l�[���̋L�q���[��
//"NPC�l�[��"#"ID"::"�ǂݍ���DB�l�[��"
//--------------------------------------------------------------------------------
ven_in01,116,96,5	duplicate(�G���`�����gNPC_A#-1)	�V���h�E�G���`��#0::slot_enchant1	496
