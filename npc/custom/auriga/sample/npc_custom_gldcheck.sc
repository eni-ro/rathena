//script: �H�}(kohri.net) rev. 1.3 //

prontera,148,187,4	script	�ԊǗ��ψ����	105,{
	mes "[�ԊǗ��ψ����]";
	mes "�������̓��[���~�b�h�K���h�̍Ԃ�";
	mes "��ɒ������A�ŐV�̏������`����";
	mes "�Ă���܂��B�ǂ̒n��̍Ԃɂ���";
	mes "�����ׂł����H";
	next;
	switch(select("�A���f�o����","�Q�t�F��","�t�F�C����","�v�����e��")) {
		case 1: setarray .@map$,"aldeg_cas01","aldeg_cas02","aldeg_cas03","aldeg_cas04","aldeg_cas05"; break;
		case 2: setarray .@map$,"gefg_cas01","gefg_cas02","gefg_cas03","gefg_cas04","gefg_cas05";      break;
		case 3: setarray .@map$,"payg_cas01","payg_cas02","payg_cas03","payg_cas04","payg_cas05";      break;
		case 4: setarray .@map$,"prtg_cas01","prtg_cas02","prtg_cas03","prtg_cas04","prtg_cas05";      break;
	}
	mes "[�ԊǗ��ψ����]";
	mes "�����_�ł́A";
	for(set .@i,0; .@i < 4; set .@i,.@i+1) {
		set .@gid,getcastledata(.@map$[.@i],1);
		mes getcastlename(.@map$[.@i]);
		mes "^CE2AEA���L�F^000000" + ((.@gid == 0)? "�Ȃ�": getguildname(.@gid) +" ("+ getguildmaster(.@gid) +")");
	}
	mes "�ƂȂ��Ă���܂��B";
	close;
}
