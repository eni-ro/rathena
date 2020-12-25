//====================rAthena Script=======================================
//=                  ___   __  __                                          
//=            _____/   | / /_/ /_  ___  ____  ____ _                      
//=           / ___/ /| |/ __/ __ \\/ _ \\/ __ \\/ __ `/                   
//=          / /  / ___ / /_/ / / /  __/ / / / /_/ /                       
//=         /_/  /_/  |_\\__/_/ /_/\\___/_/ /_/\\__,_/                     
//=                                                                        
//================http://rathena.org/board/ ===============================
//===== By: ===============================================================
//= Eni-Ro
//===== Description: ======================================================
//===== Comments: =========================================
//====================================================
venette,141,151,3	script	����������	586,{
	mes "[����������]";
	mes "�͂��~�������E�E�E�H";
	next;
	if( select("��������:�͂��~����") == 1 ){
		mes "[����������]";
		mes "������Ȃ��悤�ɂȁE�E�E";
		mes "�N�P�P�P�P";
		close;
	}
	mes "[����������]";
	mes "���O�ɂ�"+.grow_name$[grow_type]+"�̗͂������Ă���B";
	mes "�����A���~�����͂������Ă݂�B";
	next;
	
	.@menu$ = "����ς��߂�";
	for ( .@i = 0; .@i < .grow_type_size; .@i++ ) {
		.@menu$ += ":"+.grow_name$[.@i];
	}
	.@sel = select(.@menu$) - 2;
	if( .@sel < 0 ){
		mes "[����������]";
		mes "������Ȃ��悤�ɂȁE�E�E";
		mes "�N�P�P�P�P";
		close;
	}
	.@indx = .@sel * 6;
	mes "[����������]";
	mes .grow_name$[.@sel] + "�̗͂�������ƁA�������͂�����������Ȋ����ɂȂ肻�����B";
	mes "����ł����񂾂ȁH";
	mes "Str : " + .grow_rate[.@indx] + "   Agi : " + (.grow_rate[.@indx+1] - .grow_rate[.@indx])  + "   Vit : " + (.grow_rate[.@indx+2] - .grow_rate[.@indx+1]);
	mes "Int : " + (.grow_rate[.@indx+3] - .grow_rate[.@indx+2]) + "   Dex : " + (.grow_rate[.@indx+4] - .grow_rate[.@indx+3]) + "   Luk : " + (.grow_rate[.@indx+5] - .grow_rate[.@indx+4]);
	next;
	if( select("����ς��߂�:����ł���") == 1 ){
		mes "[����������]";
		mes "������Ȃ��悤�ɂȁE�E�E";
		mes "�N�P�P�P�P";
		close;
	}
	mes "[����������]";
	mes "�͂��~�����Ȃ�";
	mes "����Ă��I�I";
	grow_type = .@sel;
	specialeffect2 EF_SCREEN_QUAKE;
	specialeffect2 EF_METEORSTORM;
	close;

OnNPCKillEvent:
	//�X�e�[�^�X�A�b�v����(LV���ϓ�)
	.@lvdiff = strmobinfo(3,killedrid) - readparam(BaseLevel);
	if( .@lvdiff <= -20 ){	//0.6%
		.@glow_chance = 600;
	}
	else if(.@lvdiff >= 20 ){	//2%
		.@glow_chance = 2000;
	}
	else{
		.@glow_chance =  35 * .@lvdiff + 1300;
	}
	if( getmonsterinfo( killedrid, MOB_MVPEXP )){
		.@glow_chance *= 5;
	}
	if( rand(100000) < .@glow_chance ){
		//StatusUp
		.@indx = grow_type * 6;
		.@rnd = rand( .grow_rate[.@indx+5] );
		for( .@i = 0; .@i < 6; .@i++ ){
			if( .@rnd < .grow_rate[ .@indx + .@i ] ){
				.@type = .@i;
				break;
			}
		}
		if( readparam( .grow_status_prm[.@type] ) < .max_status ){
			statusup .grow_status_prm[.@type];
			unittalk getcharid(3),.grow_status_msg$[.@type],bc_self;
			specialeffect2 371;
		}
	}
	//�X�L���A�b�v����(�m���Œ�)
	if( rand(100000) < .skup_chance ){
		if( SkillPoint < .sk_max ){
			atcommand "@skpoint 1";
			unittalk getcharid(3),.gain_skill_point_msg$,bc_self;
			specialeffect2 337;
		}
	}
	end;
OnInit:
	setarray .grow_name$[0],
		"�o�����X",
		"�ߐڕ���[Str�d��]",
		"�ߐڕ���[Agi�d��]",
		"�ߐڕ���[Luk�d��]",
		"����������",
		"���@[�o�����X]",
		"���@[Int�d��]",
		"���@[Dex�d��]",
		"�^���N",
		"�q�[���[";
	setarray .grow_rate[0],
		100,100,100,100,100,100,
		150,100,120,70,100,60,
		120,150,80,70,100,80,
		100,150,80,70,50,150,
		100,150,100,100,150,60,
		60,100,80,150,150,60,
		60,100,80,160,140,60,
		60,100,80,140,160,60,
		70,130,150,70,100,80,
		70,90,120,120,120,80;
	setarray .grow_status_prm[0],bStr,bAgi,bVit,bInt,bDex,bLuk;
	setarray .grow_status_msg$[0],
		"Str���オ����",
		"Agi���オ����",
		"Vit���オ����",
		"Int���オ����",
		"Dex���オ����",
		"Luk���オ����";
	.grow_type_size = getarraysize(.grow_name$[0]);
	for ( .@i = 0; .@i < .grow_type_size; .@i++ ) {
		for ( .@j = 1; .@j < 6; .@j++ ) {
			.grow_rate[.@i*6+.@j] += .grow_rate[.@i*6+.@j-1];
		}
	}
	.max_status = 150;

	.skup_chance = 750;
	.sk_max = 999;
	.gain_skill_point_msg$ = "�W���u�ւ̗������[�܂���";
}
