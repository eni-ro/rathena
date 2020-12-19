//=========================================================================
// アジトダンジョン行きのスイッチ
//	callfunc "DungeonSwitch","MAP",X,Y;
//-------------------------------------------------------------------------

function	script	DungeonSwitch	{
	mes "[声]";
	mes "試練に挑むならば先へ進むがよい";
	next;
	mes " ";
	mes "小さなレバーがあります。";
	mes "引きますか？";
	next;
	if(select("引く","引かない")==2)
		return;
	set .@dummy,getmapxy(.@map$,.@dummy,.@dummy,BL_NPC);		//.@map$以外はダミー
	set .@gid,getcastledata(.@map$,1);
	if(.@gid && .@gid == getcharid(2)) {
		warp getarg(0),getarg(1),getarg(2);
		end;
	}
	mes " ";
	mes "しかし何も起こらなかった。";
	return;
}


//==========================================
// ルイーナ
//------------------------------------------
aldeg_cas01,211,179,0	script	#DungeonSwitch_L1	111,{
	callfunc "DungeonSwitch","gld_dun02",32,122;
	close;
}

aldeg_cas02,194,136,0	script	#DungeonSwitch_L2	111,{
	callfunc "DungeonSwitch","gld_dun02",79,30;
	close;
}

aldeg_cas03,200,177,0	script	#DungeonSwitch_L3	111,{
	callfunc "DungeonSwitch","gld_dun02",165,38;
	close;
}

aldeg_cas04,76,64,0		script	#DungeonSwitch_L4	111,{
	callfunc "DungeonSwitch","gld_dun02",160,148;
	close;
}

aldeg_cas05,23,205,0		script	#DungeonSwitch_L5	111,{
	callfunc "DungeonSwitch","gld_dun02",103,169;
	close;
}

//==========================================
// ブリトニア
//------------------------------------------
gefg_cas01,78,84,0	script	#DungeonSwitch_B1	111,{
	callfunc "DungeonSwitch","gld_dun04",39,258;
	close;
}

gefg_cas02,167,40,0	script	#DungeonSwitch_B2	111,{
	callfunc "DungeonSwitch","gld_dun04",125,270;
	close;
}

gefg_cas03,221,43,0	script	#DungeonSwitch_B3	111,{
	callfunc "DungeonSwitch","gld_dun04",268,251;
	close;
}

gefg_cas04,58,75,0	script	#DungeonSwitch_B4	111,{
	callfunc "DungeonSwitch","gld_dun04",268,108;
	close;
}

gefg_cas05,65,22,0	script	#DungeonSwitch_B5	111,{
	callfunc "DungeonSwitch","gld_dun04",230,35;
	close;
}

//==========================================
// チュンリム
//------------------------------------------
payg_cas01,101,25,0		script	#DungeonSwitch_C1	111,{
	callfunc "DungeonSwitch","gld_dun01",186,165;
	close;
}

payg_cas02,278,247,0	script	#DungeonSwitch_C2	111,{
	callfunc "DungeonSwitch","gld_dun01",54,165;
	close;
}

payg_cas03,38,42,0		script	#DungeonSwitch_C3	111,{
	callfunc "DungeonSwitch","gld_dun01",54,39;
	close;
}

payg_cas04,52,48,0		script	#DungeonSwitch_C4	111,{
	callfunc "DungeonSwitch","gld_dun01",186,39;
	close;
}

payg_cas05,238,11,0		script	#DungeonSwitch_C5	111,{
	callfunc "DungeonSwitch","gld_dun01",223,202;
	close;
}

//==========================================
// ヴァルキリーレルム
//------------------------------------------
prtg_cas01,94,200,0	script	#DungeonSwitch_V1	111,{
	callfunc "DungeonSwitch","gld_dun03",28,251;
	close;
}

prtg_cas02,84,72,0	script	#DungeonSwitch_V2	111,{
	callfunc "DungeonSwitch","gld_dun03",164,268;
	close;
}

prtg_cas03,5,70,0	script	#DungeonSwitch_V3	111,{
	callfunc "DungeonSwitch","gld_dun03",164,179;
	close;
}

prtg_cas04,56,283,0	script	#DungeonSwitch_V4	111,{
	callfunc "DungeonSwitch","gld_dun03",268,203;
	close;
}

prtg_cas05,212,95,0	script	#DungeonSwitch_V5	111,{
	callfunc "DungeonSwitch","gld_dun03",199,28;
	close;
}
