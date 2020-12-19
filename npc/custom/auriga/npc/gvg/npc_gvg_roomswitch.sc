//=========================================================================
// マスタールームからの帰還スイッチ
//	callfunc "RoomSwitch",X,Y;
//-------------------------------------------------------------------------

function	script	RoomSwitch	{
	mes "小さなレバーがあります。";
	mes "引きますか？";
	next;
	if(select("引く","引かない")==1) {
		set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//.@map$以外はダミー
		warp .@map$,getarg(0),getarg(1);
		end;
	}
	return;
}


//==========================================
// ルイーナ
//------------------------------------------
aldeg_cas01,123,223,0	script	#RoomSwitch_L1	111,{
	callfunc "RoomSwitch",218,176;
	close;
}

aldeg_cas02,139,234,0	script	#RoomSwitch_L2	111,{
	callfunc "RoomSwitch",78,75;
	close;
}

aldeg_cas03,229,267,0	script	#RoomSwitch_L3	111,{
	callfunc "RoomSwitch",110,119;
	close;
}

aldeg_cas04,83,17,0		script	#RoomSwitch_L4	111,{
	callfunc "RoomSwitch",67,117;
	close;
}

aldeg_cas05,64,8,0		script	#RoomSwitch_L5	111,{
	callfunc "RoomSwitch",51,179;
	close;
}

//==========================================
// ブリトニア
//------------------------------------------
gefg_cas01,152,117,0	script	#RoomSwitch_B1	111,{
	callfunc "RoomSwitch",40,49;
	close;
}

gefg_cas02,145,115,0	script	#RoomSwitch_B2	111,{
	callfunc "RoomSwitch",12,67;
	close;
}

gefg_cas03,275,290,0	script	#RoomSwitch_B3	111,{
	callfunc "RoomSwitch",106,24;
	close;
}

gefg_cas04,116,123,0	script	#RoomSwitch_B4	111,{
	callfunc "RoomSwitch",73,47;
	close;
}

gefg_cas05,149,106,0	script	#RoomSwitch_B5	111,{
	callfunc "RoomSwitch",70,53;
	close;
}

//==========================================
// チュンリム
//------------------------------------------
payg_cas01,295,8,0		script	#RoomSwitch_C1	111,{
	callfunc "RoomSwitch",120,59;
	close;
}

payg_cas02,149,149,0	script	#RoomSwitch_C2	111,{
	callfunc "RoomSwitch",22,261;
	close;
}

payg_cas03,163,167,0	script	#RoomSwitch_C3	111,{
	callfunc "RoomSwitch",50,262;
	close;
}

payg_cas04,151,47,0		script	#RoomSwitch_C4	111,{
	callfunc "RoomSwitch",38,285;
	close;
}

payg_cas05,161,137,0	script	#RoomSwitch_C5	111,{
	callfunc "RoomSwitch",277,250;
	close;
}

//==========================================
// ヴァルキリーレルム
//------------------------------------------
prtg_cas01,15,209,0		script	#RoomSwitch_V1	111,{
	callfunc "RoomSwitch",111,181;
	close;
}

prtg_cas02,206,228,0	script	#RoomSwitch_V2	111,{
	callfunc "RoomSwitch",94,62;
	close;
}

prtg_cas03,193,130,0	script	#RoomSwitch_V3	111,{
	callfunc "RoomSwitch",51,101;
	close;
}

prtg_cas04,275,160,0	script	#RoomSwitch_V4	111,{
	callfunc "RoomSwitch",260,265;
	close;
}

prtg_cas05,281,176,0	script	#RoomSwitch_V5	111,{
	callfunc "RoomSwitch",36,38;
	close;
}
