ven_in01,89,87,5	script	���[�u�}�j�A	4_M_ROKI,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000�C���x���g���̒��g�����炵�ė��ĉ�����^000000";
		close;
	}
	mes "[���[�u�}�j�A]";
	mes "�o�����[�u�ƒ��z�҂̃��[�u�̂��ƂȂ�N�ɂ܂����Ȃ����B";
	next;
	switch( select("�o�����[�u����:�o�����[�u�G���`�����g:�����p�t�̃��[�u����:���z�҂̃��[�u����:���z�҂̃��[�u�G���`�����g")){
		case 1:
			.@reqiid = 15157;
			.@neediid = 15121;
			break;
		case 2:
			.@iid = 15157;
			goto L_ENCHANT;
		case 3:
			goto L_EXCHANGE_TIME_ROBE;
		case 4:
			.@reqiid = 15194;
			.@neediid = 15193;
			break;
		case 5:
			.@iid = 15194;
			goto L_ENCHANT;
	}
	//��ʌ���
	if(( getequipid(EQI_ARMOR) != .@neediid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 )){
		mes "[���[�u�}�j�A]";
		mes getitemname(.@reqiid)+"���~������΁A+9�ȏ��"+getitemname(.@neediid)+"�𑕔����Ă܂����Ȃ����B";
		close;
	}
	mes "[���[�u�}�j�A]";
	mes "�������Ă���"+getitemname(.@neediid)+"�ƌ������Ă悢���̂��H";
	mes "���}�����Ă���J�[�h�͏������܂��B";
	next;
	if(select("��������:��߂�")==2){
		mes "[���[�u�}�j�A]";
		mes "�������A�C���ς������܂����Ȃ����B";
		close;
	}
	if(( getequipid(EQI_ARMOR) != .@neediid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 )){
		mes "Anti-Hack!!!","���O�Ɏc���܂���";
		errormes "���[�u����Anti-Hack:"+strcharinfo(0);
		close;
	}
	delequip EQI_ARMOR;
	getitem .@reqiid,1;
	mes "[���[�u�}�j�A]";
	mes "�ق�A�N�̔鑠�̈�i����B","�����Ă������悢�B";
	close;

L_ENCHANT:
	.@refine = getequiprefinerycnt(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	if(( getequipid(EQI_ARMOR) != .@iid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 ) || ( .@card[3] != 0 )){
		mes "[���[�u�}�j�A]";
		mes "�G���`�����g���ė~������΁A+9�ȏ��"+getitemname(.@iid)+"�𑕔����Ă܂����Ȃ����B";
		close;
	}
	for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
		.@randopt_id[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_ID );
		.@randopt_val[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_VALUE );
		.@randopt_param[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_PARAM );
	}
	delequip EQI_ARMOR;
	getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],4876,.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];
	specialeffect EF_LORD;

	mes "[���[�u�}�j�A]";
	mes "�ӂ����ӂ����ӂ����A�����o������B","�����Ă������悢�B";
	close;
L_EXCHANGE_TIME_ROBE:
	mes "[���[�u�}�j�A]";
	mes getitemname(15193)+"���~������΁A",getitemname(6941)+"��1�ƌ������̂��B";
	mes "�����~�����񂶂�H";
	mes "��0�ŃL�����Z��";
	next;
	input .@num;
	if(.@num<=0){
		mes "[���[�u�}�j�A]";
		mes "�������A�C���ς������܂����Ȃ����B";
		close;
	}
	if( countitem(6941) < .@num ){
		mes "[���[�u�}�j�A]";
		mes getitemname(6941)+"�������̂��B";
		close;
	}
	if( checkweight(15193,.@num) == 0 ){
		mes "[���[�u�}�j�A]";
		mes "���������悤����̂��B";
		close;
	}
	delitem 6941,.@num;
	getitem 15193,.@num;
	mes "[���[�u�}�j�A]";
	mes "�ق�A�N�̔鑠�̈�i����B","�����Ă������悢�B";
	close;
}
