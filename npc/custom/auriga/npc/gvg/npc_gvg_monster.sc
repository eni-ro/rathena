//=========================================================================
// �G���y���E������у����X�^�[�����t�@���N�V����
// �i�U���J�n���E�A�W�g�������E�G���y�j�󎞂ɌĂяo�����j
//	callfunc "AgitSummon","AgitCode";
//-------------------------------------------------------------------------

function	script	AgitSummon	{
	//AgitCode�𐔒l�ɕϊ�����֐���ݒ�
	function enum {
		if(getarg(0)=="L1") return 11;
		if(getarg(0)=="L2") return 12;
		if(getarg(0)=="L3") return 13;
		if(getarg(0)=="L4") return 14;
		if(getarg(0)=="L5") return 15;
		if(getarg(0)=="B1") return 21;
		if(getarg(0)=="B2") return 22;
		if(getarg(0)=="B3") return 23;
		if(getarg(0)=="B4") return 24;
		if(getarg(0)=="B5") return 25;
		if(getarg(0)=="C1") return 31;
		if(getarg(0)=="C2") return 32;
		if(getarg(0)=="C3") return 33;
		if(getarg(0)=="C4") return 34;
		if(getarg(0)=="C5") return 35;
		if(getarg(0)=="V1") return 41;
		if(getarg(0)=="V2") return 42;
		if(getarg(0)=="V3") return 43;
		if(getarg(0)=="V4") return 44;
		if(getarg(0)=="V5") return 45;
		return 0;
	}

	//�G���y���E���̏���
	switch (enum(getarg(0))) {
		case 11: monster "aldeg_cas01",216,24,"�G���y���E��",1288,1,"AgitExe#L1::OnAgitBreak"; 	break;
		case 12: monster "aldeg_cas02",214,24,"�G���y���E��",1288,1,"AgitExe#L2::OnAgitBreak"; 	break;
		case 13: monster "aldeg_cas03",206,32,"�G���y���E��",1288,1,"AgitExe#L3::OnAgitBreak"; 	break;
		case 14: monster "aldeg_cas04",36,218,"�G���y���E��",1288,1,"AgitExe#L4::OnAgitBreak"; 	break;
		case 15: monster "aldeg_cas05",28,102,"�G���y���E��",1288,1,"AgitExe#L5::OnAgitBreak"; 	break;
		case 21: monster "gefg_cas01",198,182,"�G���y���E��",1288,1,"AgitExe#B1::OnAgitBreak"; 	break;
		case 22: monster "gefg_cas02",176,178,"�G���y���E��",1288,1,"AgitExe#B2::OnAgitBreak"; 	break;
		case 23: monster "gefg_cas03",245,167,"�G���y���E��",1288,1,"AgitExe#B3::OnAgitBreak"; 	break;
		case 24: monster "gefg_cas04",174,178,"�G���y���E��",1288,1,"AgitExe#B4::OnAgitBreak"; 	break;
		case 25: monster "gefg_cas05",194,184,"�G���y���E��",1288,1,"AgitExe#B5::OnAgitBreak"; 	break;
		case 31: monster "payg_cas01",139,139,"�G���y���E��",1288,1,"AgitExe#C1::OnAgitBreak"; 	break;
		case 32: monster "payg_cas02",39,25,"�G���y���E��",1288,1,"AgitExe#C2::OnAgitBreak"; 	break;
		case 33: monster "payg_cas03",269,265,"�G���y���E��",1288,1,"AgitExe#C3::OnAgitBreak"; 	break;
		case 34: monster "payg_cas04",271,29,"�G���y���E��",1288,1,"AgitExe#C4::OnAgitBreak"; 	break;
		case 35: monster "payg_cas05",30,30,"�G���y���E��",1288,1,"AgitExe#C5::OnAgitBreak"; 	break;
		case 41: monster "prtg_cas01",197,197,"�G���y���E��",1288,1,"AgitExe#V1::OnAgitBreak"; 	break;
		case 42: monster "prtg_cas02",158,174,"�G���y���E��",1288,1,"AgitExe#V2::OnAgitBreak"; 	break;
		case 43: monster "prtg_cas03",17,221,"�G���y���E��",1288,1,"AgitExe#V3::OnAgitBreak"; 	break;
		case 44: monster "prtg_cas04",292,14,"�G���y���E��",1288,1,"AgitExe#V4::OnAgitBreak"; 	break;
		case 45: monster "prtg_cas05",266,266,"�G���y���E��",1288,1,"AgitExe#V5::OnAgitBreak"; 	break;
	}
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//.@map$�ȊO�̓_�~�[
	if(getcastledata(.@map$,1))
		return;					//���M���h������Ȃ炱��ŏI��

	//�e�Ԃɂ����郂���X�^�[�o�����W�̐ݒ�
	switch (enum(getarg(0))) {
		case 11: setarray .@pos,216,23; 	break;
		case 12: setarray .@pos,213,23; 	break;
		case 13: setarray .@pos,205,31; 	break;
		case 14: setarray .@pos,36,217; 	break;
		case 15: setarray .@pos,27,101; 	break;
		case 21: setarray .@pos,197,181; 	break;
		case 22: setarray .@pos,176,178; 	break;
		case 23: setarray .@pos,244,166; 	break;
		case 24: setarray .@pos,174,177; 	break;
		case 25: setarray .@pos,194,184; 	break;
		case 31: setarray .@pos,138,138; 	break;
		case 32: setarray .@pos,38,25; 		break;
		case 33: setarray .@pos,268,264; 	break;
		case 34: setarray .@pos,270,28; 	break;
		case 35: setarray .@pos,30,30; 		break;
		case 41: setarray .@pos,197,197; 	break;
		case 42: setarray .@pos,157,174; 	break;
		case 43: setarray .@pos,16,220; 	break;
		case 44: setarray .@pos,291,14; 	break;
		case 45: setarray .@pos,266,266; 	break;
	}
	//���M���h�s�ݎ��̃����X�^�[�̏���
	switch (enum(getarg(0))/10) {
	case 1:	//���C�[�i
		areamonster .@map$,0,0,0,0,"�C�r���h���C�h",1117,10;
		areamonster .@map$,0,0,0,0,"�J�[���b�c�o�[�O",1132,4;
		areamonster .@map$,0,0,0,0,"�[���̋R�m",1219,2;
		areamonster .@map$,0,0,0,0,"�G�N�X�L���[�V���i�[",1205,1;
		areamonster .@map$,0,0,0,0,"�y�m���i",1216,10;
		areamonster .@map$,0,0,0,0,"�A���[��",1193,17;
		areamonster .@map$,0,0,0,0,"�N���b�N",1269,9;
		areamonster .@map$,0,0,0,0,"���C�h���b�N�A�[�`���[",1276,7;
		areamonster .@map$,0,0,0,0,"�f�r����",1208,3;
		areamonster .@map$,0,0,0,0,"�A���X",1275,1;
		areamonster .@map$,0,0,0,0,"�u���b�f�B�i�C�g",1268,1;
		areamonster .@map$,0,0,0,0,"�_�[�N���[�h",1272,1;
		monster .@map$,.@pos[0],.@pos[1],"�_�[�N���[�h",1272,1;
		monster .@map$,.@pos[0],.@pos[1],"���v���Ǘ���",1270,4;
		monster .@map$,.@pos[0],.@pos[1],"�u���b�f�B�i�C�g",1268,1;
		monster .@map$,.@pos[0],.@pos[1],"�[���̋R�m",1219,1;
		monster .@map$,.@pos[0],.@pos[1],"���C�h���b�N�A�[�`���[",1276,5;
		break;
	case 2:	//�u���g�j�A
		areamonster .@map$,0,0,0,0,"�C�r���h���C�h",1117,10;
		areamonster .@map$,0,0,0,0,"�E�B���h�S�[�X�g",1263,11;
		areamonster .@map$,0,0,0,0,"�o�[�X���[",1102,10;
		areamonster .@map$,0,0,0,0,"�W���b�N",1130,10;
		areamonster .@map$,0,0,0,0,"�}���h�D�[�N",1140,20;
		areamonster .@map$,0,0,0,0,"���C�h���b�N",1163,9;
		areamonster .@map$,0,0,0,0,"�A���X",1275,1;
		areamonster .@map$,0,0,0,0,"�[���̋R�m",1219,1;
		areamonster .@map$,0,0,0,0,"�����",1150,1;
		areamonster .@map$,0,0,0,0,"�t���I�j",1159,1;
		monster .@map$,.@pos[0],.@pos[1],"�~�X�e���e�C��",1203,1;
		monster .@map$,.@pos[0],.@pos[1],"�I�[�N�q�[���[",1087,1;
		monster .@map$,.@pos[0],.@pos[1],"�n�C�I�[�N",1213,10;
		monster .@map$,.@pos[0],.@pos[1],"�I�[�N�A�[�`���[",1189,10;
		break;
	case 3:	//�`��������
		areamonster .@map$,0,0,0,0,"�V���叫�R",1277,10;
		areamonster .@map$,0,0,0,0,"�f�r����",1208,10;
		areamonster .@map$,0,0,0,0,"�~���[�^���g�h���S��",1262,5;
		areamonster .@map$,0,0,0,0,"�o�[�X���[",1102,5;
		areamonster .@map$,0,0,0,0,"�����",1150,1;
		areamonster .@map$,0,0,0,0,"�G�h�K",1115,1;
		areamonster .@map$,0,0,0,0,"�z����",1129,11;
		areamonster .@map$,0,0,0,0,"���C�h���b�N�A�[�`���[",1276,5;
		areamonster .@map$,0,0,0,0,"�R�{���h�A�[�`���[",1282,4;
		areamonster .@map$,0,0,0,0,"�K�[�S�C��",1253,5;
		monster .@map$,.@pos[0],.@pos[1],"�����",1150,1;
		monster .@map$,.@pos[0],.@pos[1],"�G�h�K",1115,1;
		monster .@map$,.@pos[0],.@pos[1],"�f�r����",1208,6;
		monster .@map$,.@pos[0],.@pos[1],"���C�h���b�N�A�[�`���[",1276,5;
		break;
	case 4:	//���@���L���[������
		areamonster .@map$,0,0,0,0,"���C�h���b�N",1163,15;
		areamonster .@map$,0,0,0,0,"�J�[���b�c�o�[�O",1132,10;
		areamonster .@map$,0,0,0,0,"�[���̋R�m",1219,5;
		areamonster .@map$,0,0,0,0,"�u���b�f�B�i�C�g",1268,5;
		areamonster .@map$,0,0,0,0,"�X�g�[���i�C�g",1251,1;
		areamonster .@map$,0,0,0,0,"�n�e�B�[",1252,1;
		areamonster .@map$,0,0,0,0,"���C�h���b�N�A�[�`���[",1276,5;
		areamonster .@map$,0,0,0,0,"�O���t�H��",1259,2;
		areamonster .@map$,0,0,0,0,"�L����",1283,2;
		areamonster .@map$,0,0,0,0,"�A���X",1275,1;
		areamonster .@map$,0,0,0,0,"�W���^�X",1200,1;
		monster .@map$,.@pos[0],.@pos[1],"�u���b�f�B�i�C�g",1268,1;
		monster .@map$,.@pos[0],.@pos[1],"�X�g�[���i�C�g",1251,1;
		monster .@map$,.@pos[0],.@pos[1],"�n�e�B�[",1252,1;
		monster .@map$,.@pos[0],.@pos[1],"�[���̋R�m",1219,2;
		monster .@map$,.@pos[0],.@pos[1],"���C�h���b�N�A�[�`���[",1276,5;
		break;
	}
	return;
}


//=========================================================================
// �K�[�f�B�A�������t�@���N�V����
// �iInter�T�[�o�ڑ����������͎����ɂ�鏢���ŌĂяo�����j
//	callfunc "GuardianCall","AgitCode",Num,Mes;
//
// �� �����̏ڍ�
//	"AgitCode" -> �A�W�g�������R�[�h�i��FL1,B2,C3,V4�j
//	    Num    -> ��������K�[�f�B�A���̔ԍ��A10�`17
//	    Mes    -> 0:���b�Z�[�W�Ȃ��A1:���b�Z�[�W����i�����̂Ƃ��j
//-------------------------------------------------------------------------

function	script	GuardianCall	{
	if(getarg(0)=="L1") {
		switch(getarg(1)) {
			case 10: monster "aldeg_cas01",17,218,"--ja--",1287,1,"#GuardianKilled::On_L1_10"; 	break;
			case 11: monster "aldeg_cas01",39,205,"--ja--",1285,1,"#GuardianKilled::On_L1_11"; 	break;
			case 12: monster "aldeg_cas01",38,196,"--ja--",1285,1,"#GuardianKilled::On_L1_12"; 	break;
			case 13: monster "aldeg_cas01",21,194,"--ja--",1286,1,"#GuardianKilled::On_L1_13"; 	break;
			case 14: monster "aldeg_cas01",218,24,"--ja--",1286,1,"#GuardianKilled::On_L1_14"; 	break;
			case 15: monster "aldeg_cas01",213,24,"--ja--",1286,1,"#GuardianKilled::On_L1_15"; 	break;
			case 16: monster "aldeg_cas01",73,70,"--ja--",1286,1,"#GuardianKilled::On_L1_16"; 	break;
			case 17: monster "aldeg_cas01",45,228,"--ja--",1285,1,"#GuardianKilled::On_L1_17"; 	break;
		}
	}
	if(getarg(0)=="L2") {
		switch(getarg(1)) {
			case 10: monster "aldeg_cas02",51,183,"--ja--",1287,1,"#GuardianKilled::On_L2_10"; 	break;
			case 11: monster "aldeg_cas02",27,184,"--ja--",1286,1,"#GuardianKilled::On_L2_11"; 	break;
			case 12: monster "aldeg_cas02",88,43,"--ja--",1286,1,"#GuardianKilled::On_L2_12"; 	break;
			case 13: monster "aldeg_cas02",210,7,"--ja--",1285,1,"#GuardianKilled::On_L2_13"; 	break;
			case 14: monster "aldeg_cas02",60,203,"--ja--",1287,1,"#GuardianKilled::On_L2_14"; 	break;
			case 15: monster "aldeg_cas02",21,177,"--ja--",1285,1,"#GuardianKilled::On_L2_15"; 	break;
			case 16: monster "aldeg_cas02",117,46,"--ja--",1286,1,"#GuardianKilled::On_L2_16"; 	break;
			case 17: monster "aldeg_cas02",36,183,"--ja--",1285,1,"#GuardianKilled::On_L2_17"; 	break;
		}
	}
	if(getarg(0)=="L3") {
		switch(getarg(1)) {
			case 10: monster "aldeg_cas03",110,217,"--ja--",1285,1,"#GuardianKilled::On_L3_10"; break;
			case 11: monster "aldeg_cas03",90,112,"--ja--",1286,1,"#GuardianKilled::On_L3_11"; 	break;
			case 12: monster "aldeg_cas03",86,120,"--ja--",1287,1,"#GuardianKilled::On_L3_12"; 	break;
			case 13: monster "aldeg_cas03",195,151,"--ja--",1285,1,"#GuardianKilled::On_L3_13"; break;
			case 14: monster "aldeg_cas03",116,112,"--ja--",1286,1,"#GuardianKilled::On_L3_14"; break;
			case 15: monster "aldeg_cas03",116,76,"--ja--",1287,1,"#GuardianKilled::On_L3_15"; 	break;
			case 16: monster "aldeg_cas03",64,103,"--ja--",1287,1,"#GuardianKilled::On_L3_16"; 	break;
			case 17: monster "aldeg_cas03",212,160,"--ja--",1285,1,"#GuardianKilled::On_L3_17"; break;
		}
	}
	if(getarg(0)=="L4") {
		switch(getarg(1)) {
			case 10: monster "aldeg_cas04",187,100,"--ja--",1285,1,"#GuardianKilled::On_L4_10"; break;
			case 11: monster "aldeg_cas04",192,42,"--ja--",1285,1,"#GuardianKilled::On_L4_11"; 	break;
			case 12: monster "aldeg_cas04",55,88,"--ja--",1286,1,"#GuardianKilled::On_L4_12"; 	break;
			case 13: monster "aldeg_cas04",145,209,"--ja--",1287,1,"#GuardianKilled::On_L4_13"; break;
			case 14: monster "aldeg_cas04",169,53,"--ja--",1287,1,"#GuardianKilled::On_L4_14"; 	break;
			case 15: monster "aldeg_cas04",198,77,"--ja--",1287,1,"#GuardianKilled::On_L4_15"; 	break;
			case 16: monster "aldeg_cas04",148,88,"--ja--",1285,1,"#GuardianKilled::On_L4_16"; 	break;
			case 17: monster "aldeg_cas04",48,72,"--ja--",1286,1,"#GuardianKilled::On_L4_17"; 	break;
		}
	}
	if(getarg(0)=="L5") {
		switch(getarg(1)) {
			case 10: monster "aldeg_cas05",51,202,"--ja--",1285,1,"#GuardianKilled::On_L5_10"; 	break;
			case 11: monster "aldeg_cas05",27,221,"--ja--",1286,1,"#GuardianKilled::On_L5_11"; 	break;
			case 12: monster "aldeg_cas05",145,78,"--ja--",1286,1,"#GuardianKilled::On_L5_12"; 	break;
			case 13: monster "aldeg_cas05",157,192,"--ja--",1287,1,"#GuardianKilled::On_L5_13"; break;
			case 14: monster "aldeg_cas05",157,74,"--ja--",1287,1,"#GuardianKilled::On_L5_14"; 	break;
			case 15: monster "aldeg_cas05",188,79,"--ja--",1285,1,"#GuardianKilled::On_L5_15"; 	break;
			case 16: monster "aldeg_cas05",156,73,"--ja--",1286,1,"#GuardianKilled::On_L5_16"; 	break;
			case 17: monster "aldeg_cas05",41,112,"--ja--",1286,1,"#GuardianKilled::On_L5_17"; 	break;
		}
	}
	if(getarg(0)=="B1") {
		switch(getarg(1)) {
			case 10: monster "gefg_cas01",67,179,"--ja--",1287,1,"#GuardianKilled::On_B1_10"; 	break;
			case 11: monster "gefg_cas01",36,186,"--ja--",1285,1,"#GuardianKilled::On_B1_11"; 	break;
			case 12: monster "gefg_cas01",50,186,"--ja--",1285,1,"#GuardianKilled::On_B1_12"; 	break;
			case 13: monster "gefg_cas01",62,41,"--ja--",1287,1,"#GuardianKilled::On_B1_13"; 	break;
			case 14: monster "gefg_cas01",50,67,"--ja--",1286,1,"#GuardianKilled::On_B1_14"; 	break;
			case 15: monster "gefg_cas01",184,20,"--ja--",1287,1,"#GuardianKilled::On_B1_15"; 	break;
			case 16: monster "gefg_cas01",189,41,"--ja--",1286,1,"#GuardianKilled::On_B1_16"; 	break;
			case 17: monster "gefg_cas01",200,167,"--ja--",1286,1,"#GuardianKilled::On_B1_17"; 	break;
		}
	}
	if(getarg(0)=="B2") {
		switch(getarg(1)) {
			case 10: monster "gefg_cas02",64,168,"--ja--",1287,1,"#GuardianKilled::On_B2_10"; 	break;
			case 11: monster "gefg_cas02",35,148,"--ja--",1285,1,"#GuardianKilled::On_B2_11"; 	break;
			case 12: monster "gefg_cas02",20,150,"--ja--",1285,1,"#GuardianKilled::On_B2_12"; 	break;
			case 13: monster "gefg_cas02",56,41,"--ja--",1287,1,"#GuardianKilled::On_B2_13"; 	break;
			case 14: monster "gefg_cas02",19,41,"--ja--",1286,1,"#GuardianKilled::On_B2_14"; 	break;
			case 15: monster "gefg_cas02",166,25,"--ja--",1287,1,"#GuardianKilled::On_B2_15"; 	break;
			case 16: monster "gefg_cas02",166,42,"--ja--",1286,1,"#GuardianKilled::On_B2_16"; 	break;
			case 17: monster "gefg_cas02",159,188,"--ja--",1286,1,"#GuardianKilled::On_B2_17"; 	break;
		}
	}
	if(getarg(0)=="B3") {
		switch(getarg(1)) {
			case 10: monster "gefg_cas03",48,176,"--ja--",1285,1,"#GuardianKilled::On_B3_10"; 	break;
			case 11: monster "gefg_cas03",113,214,"--ja--",1285,1,"#GuardianKilled::On_B3_11"; 	break;
			case 12: monster "gefg_cas03",48,207,"--ja--",1287,1,"#GuardianKilled::On_B3_12"; 	break;
			case 13: monster "gefg_cas03",157,62,"--ja--",1287,1,"#GuardianKilled::On_B3_13"; 	break;
			case 14: monster "gefg_cas03",157,45,"--ja--",1286,1,"#GuardianKilled::On_B3_14"; 	break;
			case 15: monster "gefg_cas03",243,41,"--ja--",1287,1,"#GuardianKilled::On_B3_15"; 	break;
			case 16: monster "gefg_cas03",234,25,"--ja--",1286,1,"#GuardianKilled::On_B3_16"; 	break;
			case 17: monster "gefg_cas03",238,160,"--ja--",1286,1,"#GuardianKilled::On_B3_17"; 	break;
		}
	}
	if(getarg(0)=="B4") {
		switch(getarg(1)) {
			case 10: monster "gefg_cas04",53,191,"--ja--",1285,1,"#GuardianKilled::On_B4_10"; 	break;
			case 11: monster "gefg_cas04",31,178,"--ja--",1285,1,"#GuardianKilled::On_B4_11"; 	break;
			case 12: monster "gefg_cas04",49,220,"--ja--",1287,1,"#GuardianKilled::On_B4_12"; 	break;
			case 13: monster "gefg_cas04",29,46,"--ja--",1287,1,"#GuardianKilled::On_B4_13"; 	break;
			case 14: monster "gefg_cas04",57,46,"--ja--",1286,1,"#GuardianKilled::On_B4_14"; 	break;
			case 15: monster "gefg_cas04",147,65,"--ja--",1287,1,"#GuardianKilled::On_B4_15"; 	break;
			case 16: monster "gefg_cas04",160,50,"--ja--",1286,1,"#GuardianKilled::On_B4_16"; 	break;
			case 17: monster "gefg_cas04",148,189,"--ja--",1286,1,"#GuardianKilled::On_B4_17"; 	break;
		}
	}
	if(getarg(0)=="B5") {
		switch(getarg(1)) {
			case 10: monster "gefg_cas05",45,149,"--ja--",1285,1,"#GuardianKilled::On_B5_10"; 	break;
			case 11: monster "gefg_cas05",71,163,"--ja--",1285,1,"#GuardianKilled::On_B5_11"; 	break;
			case 12: monster "gefg_cas05",72,142,"--ja--",1287,1,"#GuardianKilled::On_B5_12"; 	break;
			case 13: monster "gefg_cas05",66,47,"--ja--",1287,1,"#GuardianKilled::On_B5_13"; 	break;
			case 14: monster "gefg_cas05",66,17,"--ja--",1286,1,"#GuardianKilled::On_B5_14"; 	break;
			case 15: monster "gefg_cas05",177,50,"--ja--",1287,1,"#GuardianKilled::On_B5_15"; 	break;
			case 16: monster "gefg_cas05",177,35,"--ja--",1286,1,"#GuardianKilled::On_B5_16"; 	break;
			case 17: monster "gefg_cas05",193,166,"--ja--",1286,1,"#GuardianKilled::On_B5_17"; 	break;
		}
	}
	if(getarg(0)=="C1") {
		switch(getarg(1)) {
			case 10: monster "payg_cas01",229,92,"--ja--",1285,1,"#GuardianKilled::On_C1_10"; 	break;
			case 11: monster "payg_cas01",225,80,"--ja--",1285,1,"#GuardianKilled::On_C1_11"; 	break;
			case 12: monster "payg_cas01",222,111,"--ja--",1285,1,"#GuardianKilled::On_C1_12"; 	break;
			case 13: monster "payg_cas01",99,45,"--ja--",1285,1,"#GuardianKilled::On_C1_13"; 	break;
			case 14: monster "payg_cas01",65,31,"--ja--",1285,1,"#GuardianKilled::On_C1_14"; 	break;
			case 15: monster "payg_cas01",36,127,"--ja--",1285,1,"#GuardianKilled::On_C1_15"; 	break;
			case 16: monster "payg_cas01",51,144,"--ja--",1285,1,"#GuardianKilled::On_C1_16"; 	break;
			case 17: monster "payg_cas01",138,133,"--ja--",1286,1,"#GuardianKilled::On_C1_17"; 	break;
		}
	}
	if(getarg(0)=="C2") {
		switch(getarg(1)) {
			case 10: monster "payg_cas02",237,54,"--ja--",1285,1,"#GuardianKilled::On_C2_10"; 	break;
			case 11: monster "payg_cas02",228,72,"--ja--",1285,1,"#GuardianKilled::On_C2_11"; 	break;
			case 12: monster "payg_cas02",210,41,"--ja--",1285,1,"#GuardianKilled::On_C2_12"; 	break;
			case 13: monster "payg_cas02",57,241,"--ja--",1285,1,"#GuardianKilled::On_C2_13"; 	break;
			case 14: monster "payg_cas02",42,241,"--ja--",1285,1,"#GuardianKilled::On_C2_14"; 	break;
			case 15: monster "payg_cas02",287,257,"--ja--",1285,1,"#GuardianKilled::On_C2_15"; 	break;
			case 16: monster "payg_cas02",264,272,"--ja--",1285,1,"#GuardianKilled::On_C2_16"; 	break;
			case 17: monster "payg_cas02",27,20,"--ja--",1286,1,"#GuardianKilled::On_C2_17"; 	break;
		}
	}
	if(getarg(0)=="C3") {
		switch(getarg(1)) {
			case 10: monster "payg_cas03",245,37,"--ja--",1285,1,"#GuardianKilled::On_C3_10"; 	break;
			case 11: monster "payg_cas03",269,51,"--ja--",1285,1,"#GuardianKilled::On_C3_11"; 	break;
			case 12: monster "payg_cas03",36,39,"--ja--",1285,1,"#GuardianKilled::On_C3_12"; 	break;
			case 13: monster "payg_cas03",41,39,"--ja--",1285,1,"#GuardianKilled::On_C3_13"; 	break;
			case 14: monster "payg_cas03",39,65,"--ja--",1285,1,"#GuardianKilled::On_C3_14"; 	break;
			case 15: monster "payg_cas03",19,276,"--ja--",1285,1,"#GuardianKilled::On_C3_15"; 	break;
			case 16: monster "payg_cas03",37,277,"--ja--",1285,1,"#GuardianKilled::On_C3_16"; 	break;
			case 17: monster "payg_cas03",268,244,"--ja--",1286,1,"#GuardianKilled::On_C3_17"; 	break;
		}
	}
	if(getarg(0)=="C4") {
		switch(getarg(1)) {
			case 10: monster "payg_cas04",251,212,"--ja--",1285,1,"#GuardianKilled::On_C4_10"; 	break;
			case 11: monster "payg_cas04",232,212,"--ja--",1285,1,"#GuardianKilled::On_C4_11"; 	break;
			case 12: monster "payg_cas04",231,175,"--ja--",1285,1,"#GuardianKilled::On_C4_12"; 	break;
			case 13: monster "payg_cas04",32,287,"--ja--",1285,1,"#GuardianKilled::On_C4_13"; 	break;
			case 14: monster "payg_cas04",32,232,"--ja--",1285,1,"#GuardianKilled::On_C4_14"; 	break;
			case 15: monster "payg_cas04",35,45,"--ja--",1285,1,"#GuardianKilled::On_C4_15"; 	break;
			case 16: monster "payg_cas04",36,17,"--ja--",1285,1,"#GuardianKilled::On_C4_16"; 	break;
			case 17: monster "payg_cas04",270,41,"--ja--",1286,1,"#GuardianKilled::On_C4_17"; 	break;
		}
	}
	if(getarg(0)=="C5") {
		switch(getarg(1)) {
			case 10: monster "payg_cas05",19,279,"--ja--",1285,1,"#GuardianKilled::On_C5_10"; 	break;
			case 11: monster "payg_cas05",33,260,"--ja--",1285,1,"#GuardianKilled::On_C5_11"; 	break;
			case 12: monster "payg_cas05",266,234,"--ja--",1285,1,"#GuardianKilled::On_C5_12"; 	break;
			case 13: monster "payg_cas05",266,279,"--ja--",1285,1,"#GuardianKilled::On_C5_13"; 	break;
			case 14: monster "payg_cas05",263,37,"--ja--",1285,1,"#GuardianKilled::On_C5_14"; 	break;
			case 15: monster "payg_cas05",263,21,"--ja--",1285,1,"#GuardianKilled::On_C5_15"; 	break;
			case 16: monster "payg_cas05",250,22,"--ja--",1285,1,"#GuardianKilled::On_C5_16"; 	break;
			case 17: monster "payg_cas05",36,36,"--ja--",1286,1,"#GuardianKilled::On_C5_17"; 	break;
		}
	}
	if(getarg(0)=="V1") {
		switch(getarg(1)) {
			case 10: monster "prtg_cas01",182,68,"--ja--",1287,1,"#GuardianKilled::On_V1_10"; 	break;
			case 11: monster "prtg_cas01",182,116,"--ja--",1287,1,"#GuardianKilled::On_V1_11"; 	break;
			case 12: monster "prtg_cas01",153,86,"--ja--",1287,1,"#GuardianKilled::On_V1_12"; 	break;
			case 13: monster "prtg_cas01",59,28,"--ja--",1285,1,"#GuardianKilled::On_V1_13"; 	break;
			case 14: monster "prtg_cas01",50,36,"--ja--",1285,1,"#GuardianKilled::On_V1_14"; 	break;
			case 15: monster "prtg_cas01",184,183,"--ja--",1286,1,"#GuardianKilled::On_V1_15"; 	break;
			case 16: monster "prtg_cas01",196,189,"--ja--",1286,1,"#GuardianKilled::On_V1_16"; 	break;
			case 17: monster "prtg_cas01",107,179,"--ja--",1286,1,"#GuardianKilled::On_V1_17"; 	break;
		}
	}
	if(getarg(0)=="V2") {
		switch(getarg(1)) {
			case 10: monster "prtg_cas02",188,175,"--ja--",1286,1,"#GuardianKilled::On_V2_10"; 	break;
			case 11: monster "prtg_cas02",198,175,"--ja--",1286,1,"#GuardianKilled::On_V2_11"; 	break;
			case 12: monster "prtg_cas02",178,44,"--ja--",1286,1,"#GuardianKilled::On_V2_12"; 	break;
			case 13: monster "prtg_cas02",71,75,"--ja--",1287,1,"#GuardianKilled::On_V2_13"; 	break;
			case 14: monster "prtg_cas02",49,28,"--ja--",1287,1,"#GuardianKilled::On_V2_14"; 	break;
			case 15: monster "prtg_cas02",64,186,"--ja--",1285,1,"#GuardianKilled::On_V2_15"; 	break;
			case 16: monster "prtg_cas02",76,196,"--ja--",1285,1,"#GuardianKilled::On_V2_16"; 	break;
			case 17: monster "prtg_cas02",75,175,"--ja--",1285,1,"#GuardianKilled::On_V2_17"; 	break;
		}
	}
	if(getarg(0)=="V3") {
		switch(getarg(1)) {
			case 10: monster "prtg_cas03",191,190,"--ja--",1286,1,"#GuardianKilled::On_V3_10"; 	break;
			case 11: monster "prtg_cas03",137,190,"--ja--",1286,1,"#GuardianKilled::On_V3_11"; 	break;
			case 12: monster "prtg_cas03",45,99,"--ja--",1286,1,"#GuardianKilled::On_V3_12"; 	break;
			case 13: monster "prtg_cas03",50,87,"--ja--",1287,1,"#GuardianKilled::On_V3_13"; 	break;
			case 14: monster "prtg_cas03",41,87,"--ja--",1287,1,"#GuardianKilled::On_V3_14"; 	break;
			case 15: monster "prtg_cas03",191,42,"--ja--",1285,1,"#GuardianKilled::On_V3_15"; 	break;
			case 16: monster "prtg_cas03",179,43,"--ja--",1285,1,"#GuardianKilled::On_V3_16"; 	break;
			case 17: monster "prtg_cas03",191,72,"--ja--",1285,1,"#GuardianKilled::On_V3_17"; 	break;
		}
	}
	if(getarg(0)=="V4") {
		switch(getarg(1)) {
			case 10: monster "prtg_cas04",276,14,"--ja--",1286,1,"#GuardianKilled::On_V4_10"; 	break;
			case 11: monster "prtg_cas04",274,35,"--ja--",1286,1,"#GuardianKilled::On_V4_11"; 	break;
			case 12: monster "prtg_cas04",246,246,"--ja--",1286,1,"#GuardianKilled::On_V4_12"; 	break;
			case 13: monster "prtg_cas04",38,240,"--ja--",1287,1,"#GuardianKilled::On_V4_13"; 	break;
			case 14: monster "prtg_cas04",29,240,"--ja--",1287,1,"#GuardianKilled::On_V4_14"; 	break;
			case 15: monster "prtg_cas04",33,258,"--ja--",1287,1,"#GuardianKilled::On_V4_15"; 	break;
			case 16: monster "prtg_cas04",78,48,"--ja--",1285,1,"#GuardianKilled::On_V4_16"; 	break;
			case 17: monster "prtg_cas04",36,61,"--ja--",1285,1,"#GuardianKilled::On_V4_17"; 	break;
		}
	}
	if(getarg(0)=="V5") {
		switch(getarg(1)) {
			case 10: monster "prtg_cas05",266,262,"--ja--",1286,1,"#GuardianKilled::On_V5_10"; 	break;
			case 11: monster "prtg_cas05",287,280,"--ja--",1286,1,"#GuardianKilled::On_V5_11"; 	break;
			case 12: monster "prtg_cas05",245,250,"--ja--",1286,1,"#GuardianKilled::On_V5_12"; 	break;
			case 13: monster "prtg_cas05",236,63,"--ja--",1287,1,"#GuardianKilled::On_V5_13"; 	break;
			case 14: monster "prtg_cas05",251,63,"--ja--",1287,1,"#GuardianKilled::On_V5_14"; 	break;
			case 15: monster "prtg_cas05",278,71,"--ja--",1287,1,"#GuardianKilled::On_V5_15"; 	break;
			case 16: monster "prtg_cas05",32,253,"--ja--",1285,1,"#GuardianKilled::On_V5_16"; 	break;
			case 17: monster "prtg_cas05",44,248,"--ja--",1285,1,"#GuardianKilled::On_V5_17"; 	break;
		}
	}
	if(getarg(2)) {		//�Ăяo�����������̂Ƃ�
		mes "[����"+strnpcinfo(0)+"]";
		mes "�K�[�f�B�A�����ݒu����܂����B";
		mes "�K�[�f�B�A���͎��B�̏��";
		mes "�G�������Ă����ł��傤�B";
		close;
	}
	return;
}


//=========================================================================
// �e�Ԃ̃K�[�f�B�A���j���ɏ�f�[�^��ύX
//-------------------------------------------------------------------------

-	script	#GuardianKilled	-1,{
	//���C�[�i
	On_L1_10: setcastledata "aldeg_cas01",10,0; end;
	On_L1_11: setcastledata "aldeg_cas01",11,0; end;
	On_L1_12: setcastledata "aldeg_cas01",12,0; end;
	On_L1_13: setcastledata "aldeg_cas01",13,0; end;
	On_L1_14: setcastledata "aldeg_cas01",14,0; end;
	On_L1_15: setcastledata "aldeg_cas01",15,0; end;
	On_L1_16: setcastledata "aldeg_cas01",16,0; end;
	On_L1_17: setcastledata "aldeg_cas01",17,0; end;
	On_L2_10: setcastledata "aldeg_cas02",10,0; end;
	On_L2_11: setcastledata "aldeg_cas02",11,0; end;
	On_L2_12: setcastledata "aldeg_cas02",12,0; end;
	On_L2_13: setcastledata "aldeg_cas02",13,0; end;
	On_L2_14: setcastledata "aldeg_cas02",14,0; end;
	On_L2_15: setcastledata "aldeg_cas02",15,0; end;
	On_L2_16: setcastledata "aldeg_cas02",16,0; end;
	On_L2_17: setcastledata "aldeg_cas02",17,0; end;
	On_L3_10: setcastledata "aldeg_cas03",10,0; end;
	On_L3_11: setcastledata "aldeg_cas03",11,0; end;
	On_L3_12: setcastledata "aldeg_cas03",12,0; end;
	On_L3_13: setcastledata "aldeg_cas03",13,0; end;
	On_L3_14: setcastledata "aldeg_cas03",14,0; end;
	On_L3_15: setcastledata "aldeg_cas03",15,0; end;
	On_L3_16: setcastledata "aldeg_cas03",16,0; end;
	On_L3_17: setcastledata "aldeg_cas03",17,0; end;
	On_L4_10: setcastledata "aldeg_cas04",10,0; end;
	On_L4_11: setcastledata "aldeg_cas04",11,0; end;
	On_L4_12: setcastledata "aldeg_cas04",12,0; end;
	On_L4_13: setcastledata "aldeg_cas04",13,0; end;
	On_L4_14: setcastledata "aldeg_cas04",14,0; end;
	On_L4_15: setcastledata "aldeg_cas04",15,0; end;
	On_L4_16: setcastledata "aldeg_cas04",16,0; end;
	On_L4_17: setcastledata "aldeg_cas04",17,0; end;
	On_L5_10: setcastledata "aldeg_cas05",10,0; end;
	On_L5_11: setcastledata "aldeg_cas05",11,0; end;
	On_L5_12: setcastledata "aldeg_cas05",12,0; end;
	On_L5_13: setcastledata "aldeg_cas05",13,0; end;
	On_L5_14: setcastledata "aldeg_cas05",14,0; end;
	On_L5_15: setcastledata "aldeg_cas05",15,0; end;
	On_L5_16: setcastledata "aldeg_cas05",16,0; end;
	On_L5_17: setcastledata "aldeg_cas05",17,0; end;
	//�u���g�j�A
	On_B1_10: setcastledata "gefg_cas01",10,0; end;
	On_B1_11: setcastledata "gefg_cas01",11,0; end;
	On_B1_12: setcastledata "gefg_cas01",12,0; end;
	On_B1_13: setcastledata "gefg_cas01",13,0; end;
	On_B1_14: setcastledata "gefg_cas01",14,0; end;
	On_B1_15: setcastledata "gefg_cas01",15,0; end;
	On_B1_16: setcastledata "gefg_cas01",16,0; end;
	On_B1_17: setcastledata "gefg_cas01",17,0; end;
	On_B2_10: setcastledata "gefg_cas02",10,0; end;
	On_B2_11: setcastledata "gefg_cas02",11,0; end;
	On_B2_12: setcastledata "gefg_cas02",12,0; end;
	On_B2_13: setcastledata "gefg_cas02",13,0; end;
	On_B2_14: setcastledata "gefg_cas02",14,0; end;
	On_B2_15: setcastledata "gefg_cas02",15,0; end;
	On_B2_16: setcastledata "gefg_cas02",16,0; end;
	On_B2_17: setcastledata "gefg_cas02",17,0; end;
	On_B3_10: setcastledata "gefg_cas03",10,0; end;
	On_B3_11: setcastledata "gefg_cas03",11,0; end;
	On_B3_12: setcastledata "gefg_cas03",12,0; end;
	On_B3_13: setcastledata "gefg_cas03",13,0; end;
	On_B3_14: setcastledata "gefg_cas03",14,0; end;
	On_B3_15: setcastledata "gefg_cas03",15,0; end;
	On_B3_16: setcastledata "gefg_cas03",16,0; end;
	On_B3_17: setcastledata "gefg_cas03",17,0; end;
	On_B4_10: setcastledata "gefg_cas04",10,0; end;
	On_B4_11: setcastledata "gefg_cas04",11,0; end;
	On_B4_12: setcastledata "gefg_cas04",12,0; end;
	On_B4_13: setcastledata "gefg_cas04",13,0; end;
	On_B4_14: setcastledata "gefg_cas04",14,0; end;
	On_B4_15: setcastledata "gefg_cas04",15,0; end;
	On_B4_16: setcastledata "gefg_cas04",16,0; end;
	On_B4_17: setcastledata "gefg_cas04",17,0; end;
	On_B5_10: setcastledata "gefg_cas05",10,0; end;
	On_B5_11: setcastledata "gefg_cas05",11,0; end;
	On_B5_12: setcastledata "gefg_cas05",12,0; end;
	On_B5_13: setcastledata "gefg_cas05",13,0; end;
	On_B5_14: setcastledata "gefg_cas05",14,0; end;
	On_B5_15: setcastledata "gefg_cas05",15,0; end;
	On_B5_16: setcastledata "gefg_cas05",16,0; end;
	On_B5_17: setcastledata "gefg_cas05",17,0; end;
	//�`��������
	On_C1_10: setcastledata "payg_cas01",10,0; end;
	On_C1_11: setcastledata "payg_cas01",11,0; end;
	On_C1_12: setcastledata "payg_cas01",12,0; end;
	On_C1_13: setcastledata "payg_cas01",13,0; end;
	On_C1_14: setcastledata "payg_cas01",14,0; end;
	On_C1_15: setcastledata "payg_cas01",15,0; end;
	On_C1_16: setcastledata "payg_cas01",16,0; end;
	On_C1_17: setcastledata "payg_cas01",17,0; end;
	On_C2_10: setcastledata "payg_cas02",10,0; end;
	On_C2_11: setcastledata "payg_cas02",11,0; end;
	On_C2_12: setcastledata "payg_cas02",12,0; end;
	On_C2_13: setcastledata "payg_cas02",13,0; end;
	On_C2_14: setcastledata "payg_cas02",14,0; end;
	On_C2_15: setcastledata "payg_cas02",15,0; end;
	On_C2_16: setcastledata "payg_cas02",16,0; end;
	On_C2_17: setcastledata "payg_cas02",17,0; end;
	On_C3_10: setcastledata "payg_cas03",10,0; end;
	On_C3_11: setcastledata "payg_cas03",11,0; end;
	On_C3_12: setcastledata "payg_cas03",12,0; end;
	On_C3_13: setcastledata "payg_cas03",13,0; end;
	On_C3_14: setcastledata "payg_cas03",14,0; end;
	On_C3_15: setcastledata "payg_cas03",15,0; end;
	On_C3_16: setcastledata "payg_cas03",16,0; end;
	On_C3_17: setcastledata "payg_cas03",17,0; end;
	On_C4_10: setcastledata "payg_cas04",10,0; end;
	On_C4_11: setcastledata "payg_cas04",11,0; end;
	On_C4_12: setcastledata "payg_cas04",12,0; end;
	On_C4_13: setcastledata "payg_cas04",13,0; end;
	On_C4_14: setcastledata "payg_cas04",14,0; end;
	On_C4_15: setcastledata "payg_cas04",15,0; end;
	On_C4_16: setcastledata "payg_cas04",16,0; end;
	On_C4_17: setcastledata "payg_cas04",17,0; end;
	On_C5_10: setcastledata "payg_cas05",10,0; end;
	On_C5_11: setcastledata "payg_cas05",11,0; end;
	On_C5_12: setcastledata "payg_cas05",12,0; end;
	On_C5_13: setcastledata "payg_cas05",13,0; end;
	On_C5_14: setcastledata "payg_cas05",14,0; end;
	On_C5_15: setcastledata "payg_cas05",15,0; end;
	On_C5_16: setcastledata "payg_cas05",16,0; end;
	On_C5_17: setcastledata "payg_cas05",17,0; end;
	//���@���L���[������
	On_V1_10: setcastledata "prtg_cas01",10,0; end;
	On_V1_11: setcastledata "prtg_cas01",11,0; end;
	On_V1_12: setcastledata "prtg_cas01",12,0; end;
	On_V1_13: setcastledata "prtg_cas01",13,0; end;
	On_V1_14: setcastledata "prtg_cas01",14,0; end;
	On_V1_15: setcastledata "prtg_cas01",15,0; end;
	On_V1_16: setcastledata "prtg_cas01",16,0; end;
	On_V1_17: setcastledata "prtg_cas01",17,0; end;
	On_V2_10: setcastledata "prtg_cas02",10,0; end;
	On_V2_11: setcastledata "prtg_cas02",11,0; end;
	On_V2_12: setcastledata "prtg_cas02",12,0; end;
	On_V2_13: setcastledata "prtg_cas02",13,0; end;
	On_V2_14: setcastledata "prtg_cas02",14,0; end;
	On_V2_15: setcastledata "prtg_cas02",15,0; end;
	On_V2_16: setcastledata "prtg_cas02",16,0; end;
	On_V2_17: setcastledata "prtg_cas02",17,0; end;
	On_V3_10: setcastledata "prtg_cas03",10,0; end;
	On_V3_11: setcastledata "prtg_cas03",11,0; end;
	On_V3_12: setcastledata "prtg_cas03",12,0; end;
	On_V3_13: setcastledata "prtg_cas03",13,0; end;
	On_V3_14: setcastledata "prtg_cas03",14,0; end;
	On_V3_15: setcastledata "prtg_cas03",15,0; end;
	On_V3_16: setcastledata "prtg_cas03",16,0; end;
	On_V3_17: setcastledata "prtg_cas03",17,0; end;
	On_V4_10: setcastledata "prtg_cas04",10,0; end;
	On_V4_11: setcastledata "prtg_cas04",11,0; end;
	On_V4_12: setcastledata "prtg_cas04",12,0; end;
	On_V4_13: setcastledata "prtg_cas04",13,0; end;
	On_V4_14: setcastledata "prtg_cas04",14,0; end;
	On_V4_15: setcastledata "prtg_cas04",15,0; end;
	On_V4_16: setcastledata "prtg_cas04",16,0; end;
	On_V4_17: setcastledata "prtg_cas04",17,0; end;
	On_V5_10: setcastledata "prtg_cas05",10,0; end;
	On_V5_11: setcastledata "prtg_cas05",11,0; end;
	On_V5_12: setcastledata "prtg_cas05",12,0; end;
	On_V5_13: setcastledata "prtg_cas05",13,0; end;
	On_V5_14: setcastledata "prtg_cas05",14,0; end;
	On_V5_15: setcastledata "prtg_cas05",15,0; end;
	On_V5_16: setcastledata "prtg_cas05",16,0; end;
	On_V5_17: setcastledata "prtg_cas05",17,0; end;
}
