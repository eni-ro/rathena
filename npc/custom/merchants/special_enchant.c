-	script	SpecialEnchant#-1	72,{
	function GetEnchanteID;
	function GetNextEnchantRow;
	function GetRequiedRefineCnt;
	function IsNextTypeSelect;
	function GetNextRequiedItemID;
	function GetNextRequiedItemAmount;
	function GetSelectableItemID;
	function GetFailureRate;
	function GetFailureType;
	function TryEnchant;
	function SuccessEnchant;
	function SelectRandomID;
	function FailEnchant;
	
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	.@name$ = "[" + strnpcinfo(1) + "]";
	mes .@name$;
	mes "���ʂȃA�C�e����";
	mes "���ʂȃG���`�����g�����Ă����悤�B";
	mes "������񂨑�͒������ǂˁB";
	next;
	
	setarray .@indices[1], EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
	.@indlen = getarraysize(.@indices) - 1;

    setarray .@indices, EQI_HEAD_TOP, EQI_HEAD_MID, EQI_HEAD_LOW, EQI_ARMOR, EQI_HAND_R, EQI_HAND_L, EQI_GARMENT, EQI_SHOES, EQI_ACC_R, EQI_ACC_L;
    .@indlen = getarraysize(.@indices)+1;
    .@menu$ = "";
	.@menu_len = 0;
	for(.@i = 0; .@i < .@indlen; .@i++){
		if( getequipisequiped(.@indices[.@i]) ){
			.@r = csvfind( .@file$, 0, sprintf("%d",getequipid(.@indices[.@i])));
			if( .@r >= 0 ){
				.@menu$ = .@menu$ + getequipname(.@indices[.@i]) + ":";
				.@menu_indices[.@menu_len] = .@indices[.@i];
				.@csv_row[.@menu_len] = .@r;
				.@menu_len++;
			}
		}
	}
	.@menu$ = .@menu$ + "��߂�";
	if( .@menu_len == 0 ){
		mes .@name$;
		mes "�Ή����Ă���";
		mes "�A�C�e���𑕔����Ă��Ȃ��悤���B";
		close;
	}
	.@sel = select(.@menu$)-1;
	if( .@sel == .@menu_len ){
		mes .@name$;
		mes "�C���ς������܂�����Ƃ����B";
		close;
	}
	.@part = .@menu_indices[.@sel];
	.@iid = getequipid(.@part);
	.@row = GetNextEnchantRow(.@file$,.@part);

	.@refine = getequiprefinerycnt(.@part);
	setarray .@tmp_card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	if( .@row < 0 ) {
		mes .@name$;
		mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]��";
		mes "����ȏ�G���`�����g�ł��Ȃ��悤���B";
		close;
	}
	.@reqrefine = GetRequiedRefineCnt( .@file$, .@row );
	if( .@reqrefine > getequiprefinerycnt(.@part) ){
		mes .@name$;
		mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
		mes sprintf("��%d��ڂ̃G���`�����g���s���ɂ́A+%d�ȏ�ɐ��B����K�v������B",.@row - .@csv_row[.@sel] + 1, .@reqrefine );
		close;
	}
	.@req_iid = GetNextRequiedItemID( .@file$, .@row );
	.@req_amount = GetNextRequiedItemAmount( .@file$, .@row );

	if( countitem(.@req_iid) < .@req_amount ){
		mes .@name$;
		mes "�G���`�����g���s���ɂ�";
		mes "[<ITEM>"+getitemname(.@req_iid)+"<INFO>"+.@req_iid+"</INFO></ITEM>]";
		mes sprintf("��%d�K�v���B",.@req_amount);
		close;
	}
	mes .@name$;
	mes "[<ITEM>"+getitemname(.@req_iid)+"<INFO>"+.@req_iid+"</INFO></ITEM>]";
	mes sprintf("��%d�����",.@req_amount);
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
	mes sprintf("��%d��ڂ̃G���`�����g���������񂾂ȁB",.@row - .@csv_row[.@sel] + 1);
	next;

	if( GetFailureRate( .@file$, .@row ) > 0 ){
		mes .@name$;
		mes "���̑����̓G���`�����g�Ɏ��s����\��������B";
		mes "�G���`�����g�Ɏ��s�����ꍇ";
		switch( GetFailureType( .@file$, .@row ) ){
			case 0:
				mes "�����͂��̂܂܈ێ������B";
				break;
			case 1:
				mes "�����͏������Ă��܂��B";
				break;
			case 2:
				mes "�I�������ӏ��̃G���`�����g�̂ݏ�������B";
				break;
			case 3:
				mes "�S�ẴG���`�����g����������B";
				break;
			default:
				errormes sprintf("�G���`�����g�ݒ�ُ� : Main Failure Type,file = %s,row = %d", .@file$, .@row );
				close;
		}
		next;
	}
	if(select("�G���`�����g����","��߂�") == 2) {
		mes .@name$;
		mes "�C���ς������܂�����Ƃ����B";
		close;
	}
	if( IsNextTypeSelect( .@file$, .@row ) ){
		mes .@name$;
		mes "��]����G���`�����g�͂ǂꂾ�H";
		next;
		.@size = GetSelectableItemID( .@file$, .@row, .@eiid_arr[0] );
		.@menu$ = "";
		for( .@i = 0; .@i < .@size; .@i++ ){
			.@menu$ = .@menu$ + getitemname(.@eiid_arr[.@i]) + ":";
		}
		.@menu$ = .@menu$ + "��߂�";
		.@esel = select( .@menu$ ) - 1;
		.@eiid = .@eiid_arr[.@esel];
		mes getitemname(.@eiid) + "����";
		next;
	}
	else{
		.@eiid = -1;
	}
	mes .@name$;
	mes "������A�����p���[�I�I�I";
	next;
	
	// anti-hack
	if ( callfunc("F_IsEquipIDHack", .@part, .@iid)
	|| callfunc("F_IsEquipRefineHack", .@part, .@refine)
	|| callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3])
	|| ( countitem(.@req_iid) < .@req_amount )){
		mes "Anti-Hack!!!","���O�Ɏc���܂���";
		errormes "�X�y�V�����G���`�����gAnti-Hack:"+strcharinfo(0);
		close;
	}
	mes .@name$;
	switch( TryEnchant( .@file$, .@row, .@part, .@eiid )){
		case 0:
			specialeffect EF_LORD;
			mes "���߂łƂ��B";
			mes "���܂��G���`�����g�ł�����B";
			break;
		case 1:
			specialeffect EF_SUI_EXPLOSION;
			mes "���܂Ȃ��B";
			mes "�����p���[������Ȃ������悤���B";
			break;
		default:
			errormes sprintf("�G���`�����g�ݒ�ُ� : Main Failure TryEnchant,file = %s,row = %d", .@file$, .@row );
			break;
	}
	delitem .@req_iid,.@req_amount;
	close;
OnInit:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	/*
	//for debug
	setarray .@item_exist_check,29012,29248,4947,4950,29243,4815,4814,4869,4872,4944,4900,29372,
	29012,29248,4947,4950,29243,4815,4814,4869,4872,4944,4900,29372,
	29371;
	debugmes "Item exits check...";
	for( .@i = 0; .@i < getarraysize(.@item_exist_check); .@i++ ){
		if( getiteminfo(.@item_exist_check[.@i], 2 ) == -1 ){
			errormes sprintf("Items not exits : %d",.@item_exist_check[.@i] );
		}
	}
	*/
	end;
	
	// @brief	�A�C�e��ID�ɑΉ������G���`�����gID���擾����
	function GetEnchanteID {
		//���������̏ꍇ�͏I��
		if( @equipid == 0 ){
			return -1;
		}
		set .@readrow,csvfind( .fname_itemid$[getarg(0)], 0, sprintf("%d",@equipid ));	//ItemID�Ō���
		if( .@readrow < 0 ){
			return -1;
		}
		set .@tmpid,csvread( .fname_itemid$[getarg(0)], .@readrow, 1 );
		return	.@tmpid;
	}
	// @brief	���̃G���`�����g�ݒ肪����s���擾����
	function GetNextEnchantRow{
		.@file$ = getarg(0);
		.@part = getarg(1);
		.@iid = getequipid(.@part);
		.@row = csvfind( .@file$, 0, sprintf("%d", .@iid ));

		if(( .@iid == -1 ) || ( .@row == -1 )){
			return -1;
		}

		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		
		.@maxrow = csvgetrows( .@file$ );
		for( ; .@row < .@maxrow  && atoi( csvread( .@file$, .@row, 0 )) == .@iid ; .@row++ ){
			.@tmpslot = atoi( csvread( .@file$, .@row, 2 ));
			.@chkcardid = .@card[ .@tmpslot ];	//�ΏۃX���b�g�̃J�[�h���擾

			if( !.@chkcardid ){
				return .@row;
			}

			.@maxcol = csvgetcols( .@file$, .@row );
			for( .@col = 8; .@col < .@maxcol; .@col = .@col+2 ){
				.@tmpid = atoi( csvread( .@file$, .@row, .@col ));
				if( .@tmpid <= 0 ){
					return .@row;
				}
				if( .@chkcardid == .@tmpid ){
					break;
				}
			}
		}
		return -1;
	}

	// @brief	�G���`�����g�ɕK�v�ȃA�C�e��ID���擾
	function GetRequiedRefineCnt{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 1 ));
	}

	// @brief	���̃G���`�����g�����͑I���������f����
	// return	1:�I�����A0:����ȊO
	function IsNextTypeSelect{
		.@row = getarg(1);
		.@tmptype = atoi(csvread( getarg(0), .@row, 3 ));
		if( .@tmptype == 0 ){
			return 1;
		}
		return 0;
	}

	// @brief	�G���`�����g�ɕK�v�ȃA�C�e��ID���擾
	// return	�K�v�ȃA�C�e��ID
	function GetNextRequiedItemID{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 4 ));
	}

	// @brief	�G���`�����g�ɕK�v�ȃA�C�e�������擾
	// return	�K�v�ȃA�C�e����
	function GetNextRequiedItemAmount{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 5 ));
	}

	// @brief	�I�����őI���\�ȃA�C�e��ID�����[�U�ϐ�@enchant_selectable_list�ɓǂ݂���
	// return	0:�����A-1:���s
	function GetSelectableItemID{
		.@row = getarg(1);
		.@index = 0;
		for( .@col = 8; 1; .@col += 2 ){
			set .@tmpip,csvread( getarg(0), .@row, .@col );
			if( .@tmpip <= 0 ){
				break;
			}
			set getelementofarray(getarg(2),.@index),.@tmpip;
			.@index++;
		}
		return .@index;
	}

	// @brief	�I�����őI���\�ȃA�C�e��ID�����[�U�ϐ�@enchant_selectable_list�ɓǂ݂���
	// return	0:�����A-1:���s
	function GetFailureRate{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 6 ));
	}
	function GetFailureType{
		.@row = getarg(1);
		return atoi( csvread( getarg(0), .@row, 7 ));
	}

	// @brief	�G���`�����g�����{
	// return	0:�����A1:���s�A-1:�ُ�I��
	function TryEnchant{
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@eiid = getarg(3,-1);
		.@failure_rate = atoi( csvread( .@file$, .@row, 6 ));

		if( rand(100) >= .@failure_rate ){
			if( SuccessEnchant( .@file$, .@row, .@part, .@eiid ) != 0 ){
				return -1;
			}
			return 0;
		}
		else{
			if( FailEnchant( .@file$, .@row, .@part ) ){
				return -1;
			}
			return 1;
		}
		return -1;
	}
	// @brief	�G���`�����g�������̏���
	// return	0:����I���A-1:�ُ�I��
	function SuccessEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@eiid = getarg(3);
		.@slot = atoi( csvread( .@file$, .@row, 2 ));
		.@type = atoi( csvread( .@file$, .@row, 3 ));

		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}

		switch( .@type ){
			case 0:	//�I�����ꂽ���̂��G���`�����g����
				.@card[ .@slot ] = .@eiid;
				break;
			case 1:	//�����_���őI������
				.@tmpid = SelectRandomID( .@file$, .@row );
				if( .@tmpid <= 0 ){
					errormes sprintf("�G���`�����g�ݒ�ُ� : SuccessEnchant,file = %s,row = %d",.@file$,.@row);
					return -1;
				}
				.@card[ .@slot ] = .@tmpid;
				break;
			default:
				errormes sprintf("�G���`�����g�ݒ�ُ� : SuccessEnchant,file = %s,row = %d",.@file$,.@row);
				return -1;
		}
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}

	// @brief	�����_�������̃G���`�����g�̒��I���s��
	// return	-1:�G���[�A����ȊO:�G���`�����g����A�C�e��ID
	function SelectRandomID {
		.@file$ = getarg(0);
		.@row = getarg(1);
		//�e�A�C�e��ID�̐��������̍��v�l���Z�o
		.@maxcol = csvgetcols( .@file$, .@row );
		.@sum = 0;
		for( .@col = 9; .@col < .@maxcol; .@col += 2 ){
			.@rate = atoi( csvread( .@file$, .@row, .@col ));
			if( .@rate > 0 ){
				.@sum += .@rate;
			}
		}
		.@rand_val = rand( .@sum );	//0-.@sum-1�𐶐�
		
		//�����ɖ����Ȃ������Ƃ��낪���I
		.@sum = 0;
		for( .@col = 9; .@col < .@maxcol; .@col += 2 ){
			.@rate = atoi( csvread( .@file$, .@row, .@col ));
			if( .@rate > 0 ){
				.@sum += .@rate;
				if( .@rand_val < .@sum ){
					return atoi( csvread( .@file$, .@row, .@col - 1 ));
				}
			}
		}
		return -1;	//��{�I�ɂ����ɂ͗��Ȃ�
	}
	// @brief	�G���`�����g���s���̏���
	// return	0:����I���A-1:�ُ�I��
	function FailEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@slot = atoi( csvread( .@file$, .@row, 2 ));
		.@type = atoi( csvread( .@file$, .@row, 7 ));
		
		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}
		switch( .@type ){
			case 0:	//�������Ȃ�
				return 0;
			case 1:	//������j��
				delequip .@part;
				return 0;
			case 2:	//�G���`�����g�����{���悤�Ƃ����X���b�g���N���A
				set .@refine,getequiprefinerycnt2( getarg(1) );
				setarray .@card[ .@slot ],0;
				break;
			case 3:	//�G���`�����g�����{���悤�Ƃ����X���b�g�y�т���ȍ~�̃X���b�g���N���A
				for( .@i = getitemslots( .@iid ); .@i < 4; .@i++ ){
					.@card[ .@i ] = 0;
				}
				break;
			default:
				errormes sprintf("�G���`�����g�ݒ�ُ� : FailEnchant,file = %s,row = %d",.@file$,.@row);
				return -1;
		}
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}
}

ven_in01,23,112,5	duplicate(SpecialEnchant#-1)	��iSP�G���`��#0::sp_enc_head_top	4_M_CATMAN1
ven_in01,32,111,3	duplicate(SpecialEnchant#-1)	���iSP�G���`��#1::sp_enc_head_mid	4_M_CATMAN1
ven_in01,30,109,3	duplicate(SpecialEnchant#-1)	�ZSP�G���`��#3::sp_enc_armor	4_M_CATMAN1
ven_in01,32,107,3	duplicate(SpecialEnchant#-1)	��SP�G���`��#5::sp_enc_shield	4_M_CATMAN1
ven_in01,21,106,5	duplicate(SpecialEnchant#-1)	��SP�G���`��#4::sp_enc_garment	4_M_CATMAN1
ven_in01,30,105,3	duplicate(SpecialEnchant#-1)	�CSP�G���`��#6::sp_enc_shoes	4_M_CATMAN1
ven_in01,23,104,5	duplicate(SpecialEnchant#-1)	�A�N�ZSP�G���`��#8::sp_enc_acc	4_M_CATMAN1
