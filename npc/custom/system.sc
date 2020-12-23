/*============================================================
 3�����Ƃ�,�����ތ��v�Z�y��2�̕ϐ����������l��Ԃ�
���_���2,000,000,000,000,000,000 �܂ň�����
��ʕϐ��������ꍇ��0����
set .@dammy$,callfunc ("Sistem_Digit",���ʕϐ�,��ʕϐ�);
------------------------------------------------------------*/
function	script	Sistem_Digit	{

	if(getarg(1))
		set .@for,3;
	else
		set .@for,2;

	for(set .@b, 1; .@b < .@for; set .@b, .@b + 1){

		set .@number,getarg(.@b - 1);
		set .@digit,0;
		set .@dammy,.@number;
		setarray .@digit_number[1],-1,-1,-1,-1,-1,-1,-1,-1,-1,-1;
		while(.@dammy != 0){	//�������v�Z
			set .@dammy,.@dammy / 10;
			set .@digit,.@digit + 1;
		}

		set .@num,1;
		for(set .@i, 1; .@i < .@digit; set .@i, .@i + 1){
			set .@num,.@num * 10;
		}

		set .@digit2,.@digit;
		for(set .@i, 0; .@i < .@digit; set .@i, .@i + 1){
			set .@dammy,0;
			while(1){
				if(.@number < .@num)
					break;
				set .@number,.@number - .@num;
				set .@dammy,.@dammy + 1;
			}
			set .@digit_number[.@digit2],.@dammy;
			set .@digit2,.@digit2 - 1;
			set .@num,.@num / 10;
		}

		set .@digit2,.@digit;
		set .@digit$[.@b],"";

		switch(.@digit % 3){
			case 0: set .@count,3; break;
			case 1: set .@count,1; break;
			case 2: set .@count,2; break;
		}

		for(set .@i, 0; .@i < .@digit; set .@i, .@i + 1){
			if(.@i && !.@count){
				set .@digit$[.@b],.@digit$[.@b]+",";
				set .@count,3;
			}

			set .@digit$[.@b],.@digit$[.@b] + .@digit_number[.@digit2 - .@i];
			set .@count,.@count - 1;
		}
	}

	if(getarg(1)){
		set .@number,getarg(0);
		set .@digit,0;
		while(.@number != 0){	//�������v�Z
			set .@number,.@number / 10;
			set .@digit,.@digit + 1;
		}

		switch(.@digit){
			case 0: set .@digit$[3],",000,000,000"; break;
			case 1:	set .@digit$[3],",000,000,00"; break;
			case 2:	set .@digit$[3],",000,000,0"; break;
			case 3:	set .@digit$[3],",000,000,"; break;
			case 4:	set .@digit$[3],",000,00"; break;
			case 5:	set .@digit$[3],",000,0"; break;
			case 6:	set .@digit$[3],",000,"; break;
			case 7:	set .@digit$[3],",00"; break;
			case 8:	set .@digit$[3],",0"; break;
			case 9:	set .@digit$[3],","; break;
		}
		set .@digit$,.@digit$[2]+.@digit$[3]+.@digit$[1];
	} else {
		set .@digit$,.@digit$[1];
	}

	return .@digit$;

}

/*============================================================
�����i���[�h<�C���f�b�N�X>�@<Ver,1.0>
set .@dammy,callfunc ("Load_inventorylist","�m�F�A�C�e��ID","�m�F��");
�������ĂȂ�������l�^�u�E�����i�̏ꍇ��-1��Ԃ�
����ȊO�̓C���f�b�N�X��Ԃ�
**�C���f�b�N�X�Ƃ́H�����i�̔z��ʒu�̎�
------------------------------------------------------------*/
function	script	Load_inventorylist	{

	set .@check_id,getarg(0);
	set .@check_count,getarg(1);
	set .@list_count,0;

	if(countitem(.@check_id) < .@check_count)	//�ȈՃ`�F�b�N�A�������ĂȂ����-1��Ԃ�
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;
	
	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "�����A�C�e�������������܂�";
		mes "�����i�����炵�Ă��痈�Ă�������";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//�l�^�u�E�����i�����ΐ����}�C�i�X����
		if(.@check_id == @inventorylist_id[.@i]){
			if(!@inventorylist_equip[.@i] && !@inventorylist_private[.@i])
				set .@list_count,.@list_count + @inventorylist_amount[.@i];
		}
	}

	if(.@list_count < .@check_count)	//�ă`�F�b�N
		return -1;

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//�Č����������āA�l�^�u�E�����i�ȊO�̃C���f�b�N�X��Ԃ�
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_equip[.@i] || @inventorylist_private[.@i])
				continue;
			return @inventorylist_index[.@i];
		}
	}

	return -1;	//�C���f�b�N�X�Ɉ���������Ȃ������ꍇ��-1��Ԃ�

}

/*============================================================
�����i���[�h<������>�@<Ver,1.0>
set .@dammy,callfunc ("Load_amount","�m�F�A�C�e��ID");
�l�^�u�E�����i�ȊO�̃A�C�e���̌���Ԃ�
------------------------------------------------------------*/
function	script	Load_amount	{

	set .@check_id,getarg(0);
	set .@list_count,0;
	set .@list_count,0;
	set .@dammy,0;

	if(!countitem(.@check_id))	//�ȈՃ`�F�b�N�A�������ĂȂ����-1��Ԃ�
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "�����A�C�e�������������܂�";
		mes "�����i�����炵�Ă��痈�Ă�������";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){	//�l�^�u�E�����i�����ΐ����}�C�i�X����
		if(.@check_id == @inventorylist_id[.@i]){
			if(!@inventorylist_equip[.@i] && !@inventorylist_private[.@i])
				set .@list_count,.@list_count + @inventorylist_amount[.@i];
		}
	}

	return .@list_count;

}

/*============================================================
�����i���[�h<���B�l>�@<Ver,1.0>
set .@dammy,callfunc ("Load_refinet","�m�F�A�C�e��ID","���B�l");
�l�^�u�E�����i�ȊO�̃A�C�e���̎w�萸�B�l�ȏ�̃A�C�e���̃C���f�b�N�X��Ԃ�
------------------------------------------------------------*/
function	script	Load_refine	{

	set .@check_id,getarg(0);
	set .@check_refine,getarg(1);
	set .@list_count,countitem(.@check_id);

	if(!.@list_count)	//�ȈՃ`�F�b�N�A�������ĂȂ����-1��Ԃ�
		return -1;

	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_amount,0,128;
	cleararray @inventorylist_equip,0,128;
	cleararray @inventorylist_private,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "�����A�C�e�������������܂�";
		mes "�����i�����炵�Ă��痈�Ă�������";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_equip[.@i] || @inventorylist_private[.@i])
				continue;
			if(.@check_refine > @inventorylist_refine[.@i])
				continue;

			return @inventorylist_index[.@i];
		}
	}

	return -1;	//�C���f�b�N�X�Ɉ���������Ȃ������ꍇ��-1��Ԃ�

}
/*============================================================
�����i���[�h<�����^��>�@<Ver,1.0>
callfunc ("Load_Limit_Item","�m�F�A�C�e��ID");
�A�C�e���ɐ������Ԃ��݂����Ă���ꍇ�̓G���[�Ƃ��ĕ���
------------------------------------------------------------*/
function	script	Load_Limit_Item	{

	set .@check_id,getarg(0);
	cleararray @inventorylist_id,0,128;
	cleararray @inventorylist_index,0,128;
	cleararray @inventorylist_limit,0,128;

	getinventorylist;

	set .@count,@inventorylist_count;
	if(.@count > 128){
		mes "�����A�C�e�������������܂�";
		mes "�����i�����炵�Ă��痈�Ă�������";
		close;
	}

	for(set .@i,0; .@i < .@count; set .@i,.@i+1){
		if(.@check_id == @inventorylist_id[.@i]){
			if(@inventorylist_limit[.@i]){
				mes "�G���[";
				mes "�����^���A�C�e���ł�";
				close;
			} else {
				return;
			}
		}
	}

	mes "�G���[";
	mes "�A�C�e������������ɍs���܂���ł���";
	mes "�A�C�e���̏��������ނ����炵�Ă�������";
	close;

}
