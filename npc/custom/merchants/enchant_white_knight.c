-	script	WhiteKnightEnchant#-1	72,{
	function GetNextEnchantRow;
	function GetSelectableItemID;
	function TryEnchant;
	function SuccessEnchant;
	
	.@file$ = .itemdb$[atoi(strnpcinfo(2))];

	.@name$ = "[" + strnpcinfo(1) + "]";
	mes .@name$;
	mes "���ʂȃA�C�e����";
	mes "���ʂȃG���`�����g�����Ă����悤�B";
	mes "������񂨑�͒������ǂˁB";
	next;

    setarray .@indices, EQI_HAND_R;
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
	setarray .@req_item,6607,250,6608,250;
	.@req_item_size = getarraysize(.@req_item);
	
	mes .@name$;
	mes "�G���`�����g���s���ɂ�";
	for( .@j = 0; .@j < .@req_item_size; .@j+= 2 ){
		mes sprintf("[<ITEM>%s<INFO>%d</INFO></ITEM>]��%d��",getitemname(.@req_item[.@j]),.@req_item[.@j],.@req_item[.@j+1]);
	}
	mes "�K�v���B";
	next;

	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		if( countitem(.@req_item[.@i]) < .@req_item[.@i+1] ){
			mes .@name$;
			mes "�ޗ�������Ȃ��悤���B";
			close;
		}
	}
	mes .@name$;
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]";
	mes sprintf("��%d��ڂ̃G���`�����g���������񂾂ȁB",.@row - .@csv_row[.@sel] + 1);
	next;

	if(select("�G���`�����g����","��߂�") == 2) {
		mes .@name$;
		mes "�C���ς������܂�����Ƃ����B";
		close;
	}
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
	mes .@name$;
	mes "������A�����p���[�I�I�I";
	next;
	
	// anti-hack
	if ( callfunc("F_IsEquipIDHack", .@part, .@iid)
	|| callfunc("F_IsEquipRefineHack", .@part, .@refine)
	|| callfunc("F_IsEquipCardHack", .@part, .@tmp_card[0], .@tmp_card[1], .@tmp_card[2], .@tmp_card[3])
	|| ( countitem(.@req_iid) < .@req_amount )){
		mes "Anti-Hack!!!","���O�Ɏc���܂���";
		errormes "�����R�m�c�G���`�����gAnti-Hack:"+strcharinfo(0);
		close;
	}
	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		if( countitem(.@req_item[.@i]) < .@req_item[.@i+1] ){
			mes "Anti-Hack!!!","���O�Ɏc���܂���";
			errormes "�����R�m�c�G���`�����gAnti-Hack:"+strcharinfo(0);
			close;
		}
	}
	mes .@name$;
	switch( TryEnchant( .@file$, .@row, .@part, .@eiid )){
		case 0:
			specialeffect EF_LORD;
			mes "���߂łƂ��B";
			mes "���܂��G���`�����g�ł�����B";
			break;
		default:
			errormes sprintf("�G���`�����g�ݒ�ُ� : Main Failure TryEnchant,file = %s,row = %d", .@file$, .@row );
			break;
	}
	for( .@i = 0; .@i < .@req_item_size; .@i+= 2 ){
		delitem .@req_item[.@i],.@req_item[.@i+1];
	}
	close;
OnInit:
	.@dbid = atoi(strnpcinfo(2));
	if( .@dbid >= 0 ){
		set .itemdb$[.@dbid],"npc/custom/merchants/" + strnpcinfo(3) + ".csv";
		csvreload .itemdb$[.@dbid];
	}
	end;
	
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
			.@tmpslot = atoi( csvread( .@file$, .@row, 1 ));
			.@chkcardid = .@card[ .@tmpslot ];	//�ΏۃX���b�g�̃J�[�h���擾
			if( !.@chkcardid ){
				return .@row;
			}
		}
		return -1;
	}

	// @brief	�I�����őI���\�ȃA�C�e��ID�����[�U�ϐ��ɓǂ݂���
	// return	0:�����A-1:���s
	function GetSelectableItemID{
		.@row = getarg(1);
		.@index = 0;
		for( .@col = 2; 1; .@col++ ){
			set .@tmpip,csvread( getarg(0), .@row, .@col );
			if( .@tmpip <= 0 ){
				break;
			}
			set getelementofarray(getarg(2),.@index),.@tmpip;
			.@index++;
		}
		return .@index;
	}

	// @brief	�G���`�����g�����{
	// return	0:�����A1:���s�A-1:�ُ�I��
	function TryEnchant{
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@eiid = getarg(3,-1);

		if( SuccessEnchant( .@file$, .@row, .@part, .@eiid ) != 0 ){
			return -1;
		}
		return 0;
	}
	// @brief	�G���`�����g�������̏���
	// return	0:����I���A-1:�ُ�I��
	function SuccessEnchant {
		.@file$ = getarg(0);
		.@row = getarg(1);
		.@part = getarg(2);
		.@iid = getequipid( .@part );
		.@eiid = getarg(3);
		.@slot = atoi( csvread( .@file$, .@row, 1 ));

		.@refine = getequiprefinerycnt(.@part);
		setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);
		for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
			.@randopt_id[.@i] = getequiprandomoption( .@part, .@i, ROA_ID );
			.@randopt_val[.@i] = getequiprandomoption( .@part, .@i, ROA_VALUE );
			.@randopt_param[.@i] = getequiprandomoption( .@part, .@i, ROA_PARAM );
		}
		.@card[ .@slot ] = .@eiid;
		delequip .@part;
		getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],.@card[3],.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];

		return 0;
	}
}

ven_in01,19,104,5	duplicate(WhiteKnightEnchant#-1)	���̋R�m�c�G���`��#0::enchant_white_knight	4_M_MERCAT1
