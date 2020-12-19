//==============================================================================
// GvG and PvP Warp Point Script   2005-06-08
//==============================================================================

//-------------------------------------------
// warp0xxx 	MAPの区切り  	
// warp01xx 	街へ         	
// warp02xx 	GvGルームへ  	
// warp03xx 	砦へ         	(使わない)
// warp04xx 	ダンジョンへ 	
// warp05xx 	フィールドへ 	
// warp06xx 	JOBステージへ	
// warp07xx 	PvPステージへ	(使わない)
// warp1xxx 	街           	(使わない)
// warp2xxx 	GvGルーム    	(使わない)
// warp3xxx 	GvG 砦       	
// warp31xx 	GvG 砦１     	
// warp32xx 	GvG 砦２     	
// warp33xx 	GvG 砦３     	
// warp34xx 	GvG 砦４     	
// warp35xx 	GvG 砦５     	
// warp4xxx 	ダンジョン   	(使わない)
// warp5xxx 	フィールド   	(使わない)
// warp6xxx 	JOBステージ  	(使わない)
// warp7xxxx	PvPステージ  	
// warp71xxx	PvPステージ１	
// warp72xxx	PvPステージ２	
// warp73xxx	PvPステージ３	
// warp74xxx	PvPステージ４	
// warp75xxx	PvPステージ５	
// warp76xxx	PvPステージ６	
// warp77xxx	PvPステージ７	
// warp78xxx	PvPステージ８	
//-------------------------------------------
// #     	script warp	
//-------------------------------------------
// TAB :    	8
//-------------------------------------------


//==============================================================
// pvp_y_room	PvP : 控え室
// pvp_n_room	PvP : 控え室
// pvp_c_room	PvP : 控え室
// pvp_n_1-1	PvP : 南北戦争       1 ～ 8
// pvp_n_1-2	PvP : ロックオン     1 ～ 8
// pvp_n_1-3	PvP : フォールーム   1 ～ 8
// pvp_n_1-4	PvP : アンダークロス 1 ～ 8
// pvp_n_1-5	PvP : ザナクルーム   1 ～ 8
// pvp_y_1-1	PvP : プロンテラ     1 ～ 8
// pvp_y_1-2	PvP : イズルード     1 ～ 8
// pvp_y_1-3	PvP : フェイヨン     1 ～ 8
// pvp_y_1-4	PvP : アルベルタ     1 ～ 8
// pvp_y_1-5	PvP : モロク         1 ～ 8
// pvp_2vs2		PvP : イベントホール
// -----
//==============================================================
pvp_n_1-4,100,181,0		warp	pvpwarp71401		1,1,pvp_n_1-4,139,82
pvp_n_1-4,137,84,0		warp	pvpwarp71402		1,1,pvp_n_1-4,100,177
pvp_n_1-4,150,71,0		warp	pvpwarp71403		1,1,pvp_n_1-4,142,164
pvp_n_1-4,144,166,0		warp	pvpwarp71404		1,1,pvp_n_1-4,148,73
pvp_n_1-4,32,122,0		warp	pvpwarp71405		1,1,pvp_n_1-4,60,82
pvp_n_1-4,62,84,0		warp	pvpwarp71406		1,1,pvp_n_1-4,36,122
pvp_n_1-4,49,71,0		warp	pvpwarp71407		1,1,pvp_n_1-4,54,164
pvp_n_1-4,56,166,0		warp	pvpwarp71408		1,1,pvp_n_1-4,51,73

pvp_n_2-4,100,181,0		warp	pvpwarp72401		1,1,pvp_n_2-4,139,82
pvp_n_2-4,137,84,0		warp	pvpwarp72402		1,1,pvp_n_2-4,100,177
pvp_n_2-4,150,71,0		warp	pvpwarp72403		1,1,pvp_n_2-4,142,164
pvp_n_2-4,144,166,0		warp	pvpwarp72404		1,1,pvp_n_2-4,148,73
pvp_n_2-4,32,122,0		warp	pvpwarp72405		1,1,pvp_n_2-4,60,82
pvp_n_2-4,62,84,0		warp	pvpwarp72406		1,1,pvp_n_2-4,36,122
pvp_n_2-4,49,71,0		warp	pvpwarp72407		1,1,pvp_n_2-4,54,164
pvp_n_2-4,56,166,0		warp	pvpwarp72408		1,1,pvp_n_2-4,51,73

pvp_n_3-4,100,181,0		warp	pvpwarp73401		1,1,pvp_n_3-4,139,82
pvp_n_3-4,137,84,0		warp	pvpwarp73402		1,1,pvp_n_3-4,100,177
pvp_n_3-4,150,71,0		warp	pvpwarp73403		1,1,pvp_n_3-4,142,164
pvp_n_3-4,144,166,0		warp	pvpwarp73404		1,1,pvp_n_3-4,148,73
pvp_n_3-4,32,122,0		warp	pvpwarp73405		1,1,pvp_n_3-4,60,82
pvp_n_3-4,62,84,0		warp	pvpwarp73406		1,1,pvp_n_3-4,36,122
pvp_n_3-4,49,71,0		warp	pvpwarp73407		1,1,pvp_n_3-4,54,164
pvp_n_3-4,56,166,0		warp	pvpwarp73408		1,1,pvp_n_3-4,51,73

pvp_n_4-4,100,181,0		warp	pvpwarp74401		1,1,pvp_n_4-4,139,82
pvp_n_4-4,137,84,0		warp	pvpwarp74402		1,1,pvp_n_4-4,100,177
pvp_n_4-4,150,71,0		warp	pvpwarp74403		1,1,pvp_n_4-4,142,164
pvp_n_4-4,144,166,0		warp	pvpwarp74404		1,1,pvp_n_4-4,148,73
pvp_n_4-4,32,122,0		warp	pvpwarp74405		1,1,pvp_n_4-4,60,82
pvp_n_4-4,62,84,0		warp	pvpwarp74406		1,1,pvp_n_4-4,36,122
pvp_n_4-4,49,71,0		warp	pvpwarp74407		1,1,pvp_n_4-4,54,164
pvp_n_4-4,56,166,0		warp	pvpwarp74408		1,1,pvp_n_4-4,51,73

pvp_n_5-4,100,181,0		warp	pvpwarp75401		1,1,pvp_n_5-4,139,82
pvp_n_5-4,137,84,0		warp	pvpwarp75402		1,1,pvp_n_5-4,100,177
pvp_n_5-4,150,71,0		warp	pvpwarp75403		1,1,pvp_n_5-4,142,164
pvp_n_5-4,144,166,0		warp	pvpwarp75404		1,1,pvp_n_5-4,148,73
pvp_n_5-4,32,122,0		warp	pvpwarp75405		1,1,pvp_n_5-4,60,82
pvp_n_5-4,62,84,0		warp	pvpwarp75406		1,1,pvp_n_5-4,36,122
pvp_n_5-4,49,71,0		warp	pvpwarp75407		1,1,pvp_n_5-4,54,164
pvp_n_5-4,56,166,0		warp	pvpwarp75408		1,1,pvp_n_5-4,51,73

pvp_n_6-4,100,181,0		warp	pvpwarp76401		1,1,pvp_n_6-4,139,82
pvp_n_6-4,137,84,0		warp	pvpwarp76402		1,1,pvp_n_6-4,100,177
pvp_n_6-4,150,71,0		warp	pvpwarp76403		1,1,pvp_n_6-4,142,164
pvp_n_6-4,144,166,0		warp	pvpwarp76404		1,1,pvp_n_6-4,148,73
pvp_n_6-4,32,122,0		warp	pvpwarp76405		1,1,pvp_n_6-4,60,82
pvp_n_6-4,62,84,0		warp	pvpwarp76406		1,1,pvp_n_6-4,36,122
pvp_n_6-4,49,71,0		warp	pvpwarp76407		1,1,pvp_n_6-4,54,164
pvp_n_6-4,56,166,0		warp	pvpwarp76408		1,1,pvp_n_6-4,51,73

pvp_n_7-4,100,181,0		warp	pvpwarp77401		1,1,pvp_n_7-4,139,82
pvp_n_7-4,137,84,0		warp	pvpwarp77402		1,1,pvp_n_7-4,100,177
pvp_n_7-4,150,71,0		warp	pvpwarp77403		1,1,pvp_n_7-4,142,164
pvp_n_7-4,144,166,0		warp	pvpwarp77404		1,1,pvp_n_7-4,148,73
pvp_n_7-4,32,122,0		warp	pvpwarp77405		1,1,pvp_n_7-4,60,82
pvp_n_7-4,62,84,0		warp	pvpwarp77406		1,1,pvp_n_7-4,36,122
pvp_n_7-4,49,71,0		warp	pvpwarp77407		1,1,pvp_n_7-4,54,164
pvp_n_7-4,56,166,0		warp	pvpwarp77408		1,1,pvp_n_7-4,51,73

pvp_n_8-4,100,181,0		warp	pvpwarp78401		1,1,pvp_n_8-4,139,82
pvp_n_8-4,137,84,0		warp	pvpwarp78402		1,1,pvp_n_8-4,100,177
pvp_n_8-4,150,71,0		warp	pvpwarp78403		1,1,pvp_n_8-4,142,164
pvp_n_8-4,144,166,0		warp	pvpwarp78404		1,1,pvp_n_8-4,148,73
pvp_n_8-4,32,122,0		warp	pvpwarp78405		1,1,pvp_n_8-4,60,82
pvp_n_8-4,62,84,0		warp	pvpwarp78406		1,1,pvp_n_8-4,36,122
pvp_n_8-4,49,71,0		warp	pvpwarp78407		1,1,pvp_n_8-4,54,164
pvp_n_8-4,56,166,0		warp	pvpwarp78408		1,1,pvp_n_8-4,51,73



//==============================================================
// ----- バトルオディール -----
// ordeal_1-1	バトルオディールモード 1 ～ 4
// ordeal_2-1	バトルオディールモード 1 ～ 4
// ordeal_3-1	バトルオディールモード 1 ～ 4
// -----
//==============================================================
ordeal_1-1,100,150,0	warp	ordealwarp4101		1,1,ordeal_1-1,128,150
ordeal_1-1,123,150,0	warp	ordealwarp4102		1,1,ordeal_1-1,95,150
ordeal_1-1,114,183,0	warp	ordealwarp4103		1,1,ordeal_1-1,135,163
ordeal_1-1,130,168,0	warp	ordealwarp4104		1,1,ordeal_1-1,109,188
ordeal_1-1,115,115,0	warp	ordealwarp4105		1,1,ordeal_1-1,136,136
ordeal_1-1,131,131,0	warp	ordealwarp4106		1,1,ordeal_1-1,110,110
ordeal_1-1,148,176,0	warp	ordealwarp4107		1,1,ordeal_1-1,149,204
ordeal_1-1,149,199,0	warp	ordealwarp4108		1,1,ordeal_1-1,148,171
ordeal_1-1,149,99,0		warp	ordealwarp4109		1,1,ordeal_1-1,151,129
ordeal_1-1,151,124,0	warp	ordealwarp4110		1,1,ordeal_1-1,151,94
ordeal_1-1,168,168,0	warp	ordealwarp4111		1,1,ordeal_1-1,189,189
ordeal_1-1,184,184,0	warp	ordealwarp4112		1,1,ordeal_1-1,163,163
ordeal_1-1,169,131,0	warp	ordealwarp4113		1,1,ordeal_1-1,188,111
ordeal_1-1,183,116,0	warp	ordealwarp4114		1,1,ordeal_1-1,164,136
ordeal_1-1,176,150,0	warp	ordealwarp4115		1,1,ordeal_1-1,204,150
ordeal_1-1,199,150,0	warp	ordealwarp4116		1,1,ordeal_1-1,171,150
ordeal_1-2,128,154,0	warp	ordealwarp4117		1,1,ordeal_1-2,24,154
ordeal_1-2,136,136,0	warp	ordealwarp4118		1,1,ordeal_1-2,24,24
ordeal_1-2,136,172,0	warp	ordealwarp4119		1,1,ordeal_1-2,24,284
ordeal_1-2,153,128,0	warp	ordealwarp4120		1,1,ordeal_1-2,153,23
ordeal_1-2,153,180,0	warp	ordealwarp4121		1,1,ordeal_1-2,144,284
ordeal_1-2,172,135,0	warp	ordealwarp4122		1,1,ordeal_1-2,284,24
ordeal_1-2,172,172,0	warp	ordealwarp4123		1,1,ordeal_1-2,284,284
ordeal_1-2,180,154,0	warp	ordealwarp4124		1,1,ordeal_1-2,284,164
//ordeal_1-3,100,150,0	warp	ordealwarp4125		1,1,ordeal_1-3,128,150
//ordeal_1-3,114,183,0	warp	ordealwarp4126		1,1,ordeal_1-3,135,163
//ordeal_1-3,115,115,0	warp	ordealwarp4127		1,1,ordeal_1-3,136,136
//ordeal_1-3,123,150,0	warp	ordealwarp4128		1,1,ordeal_1-3,95,150
//ordeal_1-3,130,168,0	warp	ordealwarp4129		1,1,ordeal_1-3,109,188
//ordeal_1-3,131,131,0	warp	ordealwarp4130		1,1,ordeal_1-3,110,110
//ordeal_1-3,148,176,0	warp	ordealwarp4131		1,1,ordeal_1-3,149,204
//ordeal_1-3,149,99,0		warp	ordealwarp4132		1,1,ordeal_1-3,151,129
//ordeal_1-3,149,199,0	warp	ordealwarp4133		1,1,ordeal_1-3,148,171
//ordeal_1-3,151,124,0	warp	ordealwarp4134		1,1,ordeal_1-3,151,94
//ordeal_1-3,168,168,0	warp	ordealwarp4135		1,1,ordeal_1-3,189,189
//ordeal_1-3,169,131,0	warp	ordealwarp4136		1,1,ordeal_1-3,188,111
//ordeal_1-3,176,150,0	warp	ordealwarp4137		1,1,ordeal_1-3,204,150
//ordeal_1-3,183,116,0	warp	ordealwarp4138		1,1,ordeal_1-3,164,136
//ordeal_1-3,184,184,0	warp	ordealwarp4139		1,1,ordeal_1-3,163,163
//ordeal_1-3,199,150,0	warp	ordealwarp4140		1,1,ordeal_1-3,171,150
//ordeal_1-4,128,154,0	warp	ordealwarp4141		1,1,ordeal_1-4,24,154
//ordeal_1-4,136,136,0	warp	ordealwarp4142		1,1,ordeal_1-4,24,24
//ordeal_1-4,136,172,0	warp	ordealwarp4143		1,1,ordeal_1-4,24,284
//ordeal_1-4,153,128,0	warp	ordealwarp4144		1,1,ordeal_1-4,153,23
//ordeal_1-4,153,180,0	warp	ordealwarp4145		1,1,ordeal_1-4,144,284
//ordeal_1-4,172,135,0	warp	ordealwarp4146		1,1,ordeal_1-4,284,24
//ordeal_1-4,172,172,0	warp	ordealwarp4147		1,1,ordeal_1-4,284,284
//ordeal_1-4,180,154,0	warp	ordealwarp4148		1,1,ordeal_1-4,284,164

ordeal_2-1,100,150,0	warp	ordealwarp4201		1,1,ordeal_2-1,128,150
ordeal_2-1,123,150,0	warp	ordealwarp4202		1,1,ordeal_2-1,95,150
ordeal_2-1,114,183,0	warp	ordealwarp4203		1,1,ordeal_2-1,135,163
ordeal_2-1,130,168,0	warp	ordealwarp4204		1,1,ordeal_2-1,109,188
ordeal_2-1,115,115,0	warp	ordealwarp4205		1,1,ordeal_2-1,136,136
ordeal_2-1,131,131,0	warp	ordealwarp4206		1,1,ordeal_2-1,110,110
ordeal_2-1,148,176,0	warp	ordealwarp4207		1,1,ordeal_2-1,149,204
ordeal_2-1,149,199,0	warp	ordealwarp4208		1,1,ordeal_2-1,148,171
ordeal_2-1,149,99,0		warp	ordealwarp4209		1,1,ordeal_2-1,151,129
ordeal_2-1,151,124,0	warp	ordealwarp4210		1,1,ordeal_2-1,151,94
ordeal_2-1,168,168,0	warp	ordealwarp4211		1,1,ordeal_2-1,189,189
ordeal_2-1,184,184,0	warp	ordealwarp4212		1,1,ordeal_2-1,163,163
ordeal_2-1,169,131,0	warp	ordealwarp4213		1,1,ordeal_2-1,188,111
ordeal_2-1,183,116,0	warp	ordealwarp4214		1,1,ordeal_2-1,164,136
ordeal_2-1,176,150,0	warp	ordealwarp4215		1,1,ordeal_2-1,204,150
ordeal_2-1,199,150,0	warp	ordealwarp4216		1,1,ordeal_2-1,171,150
ordeal_2-2,128,154,0	warp	ordealwarp4217		1,1,ordeal_2-2,24,154
ordeal_2-2,136,136,0	warp	ordealwarp4218		1,1,ordeal_2-2,24,24
ordeal_2-2,136,172,0	warp	ordealwarp4219		1,1,ordeal_2-2,24,284
ordeal_2-2,153,128,0	warp	ordealwarp4220		1,1,ordeal_2-2,153,23
ordeal_2-2,153,180,0	warp	ordealwarp4221		1,1,ordeal_2-2,144,284
ordeal_2-2,172,135,0	warp	ordealwarp4222		1,1,ordeal_2-2,284,24
ordeal_2-2,172,172,0	warp	ordealwarp4223		1,1,ordeal_2-2,284,284
ordeal_2-2,180,154,0	warp	ordealwarp4224		1,1,ordeal_2-2,284,164
//ordeal_2-3,100,150,0	warp	ordealwarp4225		1,1,ordeal_2-3,128,150
//ordeal_2-3,114,183,0	warp	ordealwarp4226		1,1,ordeal_2-3,135,163
//ordeal_2-3,115,115,0	warp	ordealwarp4227		1,1,ordeal_2-3,136,136
//ordeal_2-3,123,150,0	warp	ordealwarp4228		1,1,ordeal_2-3,95,150
//ordeal_2-3,130,168,0	warp	ordealwarp4229		1,1,ordeal_2-3,109,188
//ordeal_2-3,131,131,0	warp	ordealwarp4230		1,1,ordeal_2-3,110,110
//ordeal_2-3,148,176,0	warp	ordealwarp4231		1,1,ordeal_2-3,149,204
//ordeal_2-3,149,99,0		warp	ordealwarp4232		1,1,ordeal_2-3,151,129
//ordeal_2-3,149,199,0	warp	ordealwarp4233		1,1,ordeal_2-3,148,171
//ordeal_2-3,151,124,0	warp	ordealwarp4234		1,1,ordeal_2-3,151,94
//ordeal_2-3,168,168,0	warp	ordealwarp4235		1,1,ordeal_2-3,189,189
//ordeal_2-3,169,131,0	warp	ordealwarp4236		1,1,ordeal_2-3,188,111
//ordeal_2-3,176,150,0	warp	ordealwarp4237		1,1,ordeal_2-3,204,150
//ordeal_2-3,183,116,0	warp	ordealwarp4238		1,1,ordeal_2-3,164,136
//ordeal_2-3,184,184,0	warp	ordealwarp4239		1,1,ordeal_2-3,163,163
//ordeal_2-3,199,150,0	warp	ordealwarp4240		1,1,ordeal_2-3,171,150
//ordeal_2-4,128,154,0	warp	ordealwarp4241		1,1,ordeal_2-4,24,154
//ordeal_2-4,136,136,0	warp	ordealwarp4242		1,1,ordeal_2-4,24,24
//ordeal_2-4,136,172,0	warp	ordealwarp4243		1,1,ordeal_2-4,24,284
//ordeal_2-4,153,128,0	warp	ordealwarp4244		1,1,ordeal_2-4,153,23
//ordeal_2-4,153,180,0	warp	ordealwarp4245		1,1,ordeal_2-4,144,284
//ordeal_2-4,172,135,0	warp	ordealwarp4246		1,1,ordeal_2-4,284,24
//ordeal_2-4,172,172,0	warp	ordealwarp4247		1,1,ordeal_2-4,284,284
//ordeal_2-4,180,154,0	warp	ordealwarp4248		1,1,ordeal_2-4,284,164

ordeal_3-1,100,150,0	warp	ordealwarp4301		1,1,ordeal_3-1,128,150
ordeal_3-1,123,150,0	warp	ordealwarp4302		1,1,ordeal_3-1,95,150
ordeal_3-1,114,183,0	warp	ordealwarp4303		1,1,ordeal_3-1,135,163
ordeal_3-1,130,168,0	warp	ordealwarp4304		1,1,ordeal_3-1,109,188
ordeal_3-1,115,115,0	warp	ordealwarp4305		1,1,ordeal_3-1,136,136
ordeal_3-1,131,131,0	warp	ordealwarp4306		1,1,ordeal_3-1,110,110
ordeal_3-1,148,176,0	warp	ordealwarp4307		1,1,ordeal_3-1,149,204
ordeal_3-1,149,199,0	warp	ordealwarp4308		1,1,ordeal_3-1,148,171
ordeal_3-1,149,99,0		warp	ordealwarp4309		1,1,ordeal_3-1,151,129
ordeal_3-1,151,124,0	warp	ordealwarp4310		1,1,ordeal_3-1,151,94
ordeal_3-1,168,168,0	warp	ordealwarp4311		1,1,ordeal_3-1,189,189
ordeal_3-1,184,184,0	warp	ordealwarp4312		1,1,ordeal_3-1,163,163
ordeal_3-1,169,131,0	warp	ordealwarp4313		1,1,ordeal_3-1,188,111
ordeal_3-1,183,116,0	warp	ordealwarp4314		1,1,ordeal_3-1,164,136
ordeal_3-1,176,150,0	warp	ordealwarp4315		1,1,ordeal_3-1,204,150
ordeal_3-1,199,150,0	warp	ordealwarp4316		1,1,ordeal_3-1,171,150
ordeal_3-2,128,154,0	warp	ordealwarp4317		1,1,ordeal_3-2,24,154
ordeal_3-2,136,136,0	warp	ordealwarp4318		1,1,ordeal_3-2,24,24
ordeal_3-2,136,172,0	warp	ordealwarp4319		1,1,ordeal_3-2,24,284
ordeal_3-2,153,128,0	warp	ordealwarp4320		1,1,ordeal_3-2,153,23
ordeal_3-2,153,180,0	warp	ordealwarp4321		1,1,ordeal_3-2,144,284
ordeal_3-2,172,135,0	warp	ordealwarp4322		1,1,ordeal_3-2,284,24
ordeal_3-2,172,172,0	warp	ordealwarp4323		1,1,ordeal_3-2,284,284
ordeal_3-2,180,154,0	warp	ordealwarp4324		1,1,ordeal_3-2,284,164
//ordeal_3-3,100,150,0	warp	ordealwarp4325		1,1,ordeal_3-3,128,150
//ordeal_3-3,114,183,0	warp	ordealwarp4326		1,1,ordeal_3-3,135,163
//ordeal_3-3,115,115,0	warp	ordealwarp4327		1,1,ordeal_3-3,136,136
//ordeal_3-3,123,150,0	warp	ordealwarp4328		1,1,ordeal_3-3,95,150
//ordeal_3-3,130,168,0	warp	ordealwarp4329		1,1,ordeal_3-3,109,188
//ordeal_3-3,131,131,0	warp	ordealwarp4330		1,1,ordeal_3-3,110,110
//ordeal_3-3,148,176,0	warp	ordealwarp4331		1,1,ordeal_3-3,149,204
//ordeal_3-3,149,99,0		warp	ordealwarp4332		1,1,ordeal_3-3,151,129
//ordeal_3-3,149,199,0	warp	ordealwarp4333		1,1,ordeal_3-3,148,171
//ordeal_3-3,151,124,0	warp	ordealwarp4334		1,1,ordeal_3-3,151,94
//ordeal_3-3,168,168,0	warp	ordealwarp4335		1,1,ordeal_3-3,189,189
//ordeal_3-3,169,131,0	warp	ordealwarp4336		1,1,ordeal_3-3,188,111
//ordeal_3-3,176,150,0	warp	ordealwarp4337		1,1,ordeal_3-3,204,150
//ordeal_3-3,183,116,0	warp	ordealwarp4338		1,1,ordeal_3-3,164,136
//ordeal_3-3,184,184,0	warp	ordealwarp4339		1,1,ordeal_3-3,163,163
//ordeal_3-3,199,150,0	warp	ordealwarp4340		1,1,ordeal_3-3,171,150
//ordeal_3-4,128,154,0	warp	ordealwarp4341		1,1,ordeal_3-4,24,154
//ordeal_3-4,136,136,0	warp	ordealwarp4342		1,1,ordeal_3-4,24,24
//ordeal_3-4,136,172,0	warp	ordealwarp4343		1,1,ordeal_3-4,24,284
//ordeal_3-4,153,128,0	warp	ordealwarp4344		1,1,ordeal_3-4,153,23
//ordeal_3-4,153,180,0	warp	ordealwarp4345		1,1,ordeal_3-4,144,284
//ordeal_3-4,172,135,0	warp	ordealwarp4346		1,1,ordeal_3-4,284,24
//ordeal_3-4,172,172,0	warp	ordealwarp4347		1,1,ordeal_3-4,284,284
//ordeal_3-4,180,154,0	warp	ordealwarp4348		1,1,ordeal_3-4,284,164


//---JP2.0 追加マップ---


//---JP2.5 追加マップ---


//==============================================================
// ----- Payon フェイヨン -----
// payg_cas01	チュンリム湖 砦 1 ～ 5
// -----
// pay_gld		チェンリム湖
//==============================================================
payg_cas01,214,44,0		warp	payonwarp0201		1,1,pay_gld,121,233
payg_cas02,276,61,0		warp	payonwarp0202		1,1,pay_gld,295,116
payg_cas03,226,22,0		warp	payonwarp0203		1,1,pay_gld,317,293
payg_cas04,252,275,0	warp	payonwarp0204		1,1,pay_gld,140,160
payg_cas05,62,223,0		warp	payonwarp0205		1,1,pay_gld,198,264

payg_cas01,201,126,0	warp	payonwarp3101		1,1,payg_cas01,102,21
payg_cas01,102,17,0		warp	payonwarp3102		1,1,payg_cas01,201,121
payg_cas01,222,130,0	warp	payonwarp3103		1,1,payg_cas01,130,43
payg_cas01,134,43,0		warp	payonwarp3104		1,1,payg_cas01,226,130
payg_cas01,218,112,0	warp	payonwarp3105		1,1,payg_cas01,230,94
payg_cas01,230,98,0		warp	payonwarp3106		1,1,payg_cas01,222,112
payg_cas01,213,76,0		warp	payonwarp3107		1,1,payg_cas01,201,118
payg_cas01,201,114,0	warp	payonwarp3108		1,1,payg_cas01,213,72
payg_cas01,84,15,0		warp	payonwarp3109		1,1,payg_cas01,15,115
payg_cas01,11,115,0		warp	payonwarp3110		1,1,payg_cas01,81,15
payg_cas01,53,111,0		warp	payonwarp3111		1,1,payg_cas01,115,147
payg_cas01,115,151,0	warp	payonwarp3112		1,1,payg_cas01,53,115

payg_cas02,232,72,0		warp	payonwarp3201		1,1,payg_cas02,28,289
payg_cas02,28,293,0		warp	payonwarp3202		1,1,payg_cas02,229,72
payg_cas02,236,59,0		warp	payonwarp3203		1,1,payg_cas02,229,72
payg_cas02,222,26,0		warp	payonwarp3204		1,1,payg_cas02,80,240
payg_cas02,84,240,0		warp	payonwarp3205		1,1,payg_cas02,224,30
payg_cas02,215,31,0		warp	payonwarp3206		1,1,payg_cas02,65,288
payg_cas02,65,292,0		warp	payonwarp3207		1,1,payg_cas02,215,35
payg_cas02,47,223,0		warp	payonwarp3208		1,1,payg_cas02,280,287
payg_cas02,280,291,0	warp	payonwarp3209		1,1,payg_cas02,47,227
payg_cas02,254,239,0	warp	payonwarp3210		1,1,payg_cas02,13,38
payg_cas02,13,42,0		warp	payonwarp3211		1,1,payg_cas02,254,243

payg_cas03,255,76,0		warp	payonwarp3301		1,1,payg_cas03,24,19
payg_cas03,20,19,0		warp	payonwarp3302		1,1,payg_cas03,255,72
payg_cas03,269,79,0		warp	payonwarp3303		1,1,payg_cas03,53,19
payg_cas03,57,19,0		warp	payonwarp3304		1,1,payg_cas03,269,75
payg_cas03,255,64,0		warp	payonwarp3305		1,1,payg_cas03,245,37
payg_cas03,245,41,0		warp	payonwarp3306		1,1,payg_cas03,255,68
payg_cas03,262,71,0		warp	payonwarp3307		1,1,payg_cas03,39,9
payg_cas03,39,5,0		warp	payonwarp3308		1,1,payg_cas03,263,66
payg_cas03,272,68,0		warp	payonwarp3309		1,1,payg_cas03,261,38
payg_cas03,261,34,0		warp	payonwarp3310		1,1,payg_cas03,270,66
payg_cas03,39,84,0		warp	payonwarp3311		1,1,payg_cas03,29,249
payg_cas03,29,245,0		warp	payonwarp3312		1,1,payg_cas03,39,80
payg_cas03,29,269,0		warp	payonwarp3313		1,1,payg_cas03,269,287
payg_cas03,269,290,0	warp	payonwarp3314		1,1,payg_cas03,29,273

payg_cas04,260,212,0	warp	payonwarp3401		1,1,payg_cas04,70,240
payg_cas04,74,240,0		warp	payonwarp3402		1,1,payg_cas04,256,212
payg_cas04,232,189,0	warp	payonwarp3403		1,1,payg_cas04,74,261
payg_cas04,78,261,0		warp	payonwarp3404		1,1,payg_cas04,236,189
payg_cas04,229,208,0	warp	payonwarp3405		1,1,payg_cas04,70,282
payg_cas04,74,282,0		warp	payonwarp3406		1,1,payg_cas04,225,208
payg_cas04,7,261,0		warp	payonwarp3407		1,1,payg_cas04,55,30
payg_cas04,59,30,0		warp	payonwarp3408		1,1,payg_cas04,11,261
payg_cas04,28,31,0		warp	payonwarp3409		1,1,payg_cas04,251,42
payg_cas04,254,45,0		warp	payonwarp3410		1,1,payg_cas04,24,31

payg_cas05,23,283,0		warp	payonwarp3501		1,1,payg_cas05,237,282
payg_cas05,237,286,0	warp	payonwarp3502		1,1,payg_cas05,19,282
payg_cas05,56,255,0		warp	payonwarp3503		1,1,payg_cas05,223,256
payg_cas05,219,256,0	warp	payonwarp3504		1,1,payg_cas05,52,255
payg_cas05,39,264,0		warp	payonwarp3505		1,1,payg_cas05,237,231
payg_cas05,237,227,0	warp	payonwarp3506		1,1,payg_cas05,40,260
payg_cas05,283,256,0	warp	payonwarp3507		1,1,payg_cas05,286,43
payg_cas05,290,43,0		warp	payonwarp3508		1,1,payg_cas05,287,256
payg_cas05,242,41,0		warp	payonwarp3509		1,1,payg_cas05,18,18
payg_cas05,14,14,0		warp	payonwarp3510		1,1,payg_cas05,246,41



//==============================================================
// ----- Aldebarana アルデバラン -----
// aldeg_cas01	ルイーナ 砦 1 ～ 5
// -----
// alde_gld		アルデバラン衛星都市ルイーナ
//==============================================================
aldeg_cas01,34,252,0	warp	aldebaranwarp0201	1,1,alde_gld,48,83
aldeg_cas02,88,159,0	warp	aldebaranwarp0202	1,1,alde_gld,95,249
aldeg_cas03,114,290,0	warp	aldebaranwarp0203	1,1,alde_gld,142,85
aldeg_cas04,145,17,0	warp	aldebaranwarp0204	1,1,alde_gld,239,242
aldeg_cas05,216,107,0	warp	aldebaranwarp0205	1,1,alde_gld,264,90

aldeg_cas01,50,222,0	warp	aldebaranwarp3101	1,1,aldeg_cas01,104,108
aldeg_cas01,104,112,0	warp	aldebaranwarp3102	1,1,aldeg_cas01,45,224
aldeg_cas01,66,191,0	warp	aldebaranwarp3103	1,1,aldeg_cas01,122,61
aldeg_cas01,126,61,0	warp	aldebaranwarp3104	1,1,aldeg_cas01,62,191
aldeg_cas01,54,27,0		warp	aldebaranwarp3105	1,1,aldeg_cas01,62,191
aldeg_cas01,26,188,0	warp	aldebaranwarp3106	1,1,aldeg_cas01,50,70
aldeg_cas01,46,70,0		warp	aldebaranwarp3107	1,1,aldeg_cas01,24,188
aldeg_cas01,70,112,0	warp	aldebaranwarp3108	1,1,aldeg_cas01,42,225
aldeg_cas01,39,222,0	warp	aldebaranwarp3109	1,1,aldeg_cas01,70,108
aldeg_cas01,89,23,0		warp	aldebaranwarp3110	1,1,aldeg_cas01,207,132
aldeg_cas01,207,128,0	warp	aldebaranwarp3111	1,1,aldeg_cas01,89,27
aldeg_cas01,206,188,0	warp	aldebaranwarp3112	1,1,aldeg_cas01,216,50
aldeg_cas01,216,54,0	warp	aldebaranwarp3113	1,1,aldeg_cas01,206,184
aldeg_cas01,232,186,0	warp	aldebaranwarp3114	1,1,aldeg_cas01,42,197
aldeg_cas01,46,197,0	warp	aldebaranwarp3115	1,1,aldeg_cas01,232,182
aldeg_cas01,171,175,0	warp	aldebaranwarp3116	1,1,aldeg_cas01,35,197
aldeg_cas01,31,197,0	warp	aldebaranwarp3117	1,1,aldeg_cas01,175,175

aldeg_cas02,84,208,0	warp	aldebaranwarp3201	1,1,aldeg_cas02,105,84
aldeg_cas02,105,88,0	warp	aldebaranwarp3202	1,1,aldeg_cas02,79,208
aldeg_cas02,45,39,0		warp	aldebaranwarp3203	1,1,aldeg_cas02,79,208
aldeg_cas02,50,185,0	warp	aldebaranwarp3204	1,1,aldeg_cas02,192,192
aldeg_cas02,192,196,0	warp	aldebaranwarp3205	1,1,aldeg_cas02,50,180
aldeg_cas02,33,174,0	warp	aldebaranwarp3206	1,1,aldeg_cas02,126,61
aldeg_cas02,130,61,0	warp	aldebaranwarp3207	1,1,aldeg_cas02,33,179
aldeg_cas02,22,194,0	warp	aldebaranwarp3208	1,1,aldeg_cas02,88,13
aldeg_cas02,88,9,0		warp	aldebaranwarp3209	1,1,aldeg_cas02,22,190
aldeg_cas02,121,88,0	warp	aldebaranwarp3210	1,1,aldeg_cas02,177,135
aldeg_cas02,177,131,0	warp	aldebaranwarp3211	1,1,aldeg_cas02,121,84
aldeg_cas02,206,196,0	warp	aldebaranwarp3212	1,1,aldeg_cas02,197,13
aldeg_cas02,197,9,0		warp	aldebaranwarp3213	1,1,aldeg_cas02,206,192

aldeg_cas03,92,217,0	warp	aldebaranwarp3301	1,1,aldeg_cas03,127,90
aldeg_cas03,130,90,0	warp	aldebaranwarp3302	1,1,aldeg_cas03,96,215
aldeg_cas03,87,247,0	warp	aldebaranwarp3303	1,1,aldeg_cas03,54,90
aldeg_cas03,51,90,0		warp	aldebaranwarp3304	1,1,aldeg_cas03,87,251
aldeg_cas03,93,124,0	warp	aldebaranwarp3305	1,1,aldeg_cas03,87,251
aldeg_cas03,44,222,0	warp	aldebaranwarp3306	1,1,aldeg_cas03,213,182
aldeg_cas03,214,186,0	warp	aldebaranwarp3307	1,1,aldeg_cas03,49,222
aldeg_cas03,91,57,0		warp	aldebaranwarp3308	1,1,aldeg_cas03,60,236
aldeg_cas03,60,241,0	warp	aldebaranwarp3309	1,1,aldeg_cas03,91,61
aldeg_cas03,79,130,0	warp	aldebaranwarp3310	1,1,aldeg_cas03,201,149
aldeg_cas03,201,145,0	warp	aldebaranwarp3311	1,1,aldeg_cas03,79,126
aldeg_cas03,199,190,0	warp	aldebaranwarp3312	1,1,aldeg_cas03,195,51
aldeg_cas03,195,54,0	warp	aldebaranwarp3313	1,1,aldeg_cas03,199,186

aldeg_cas04,197,40,0	warp	aldebaranwarp3401	1,1,aldeg_cas04,26,88
aldeg_cas04,22,88,0		warp	aldebaranwarp3402	1,1,aldeg_cas04,192,41
aldeg_cas04,175,54,0	warp	aldebaranwarp3403	1,1,aldeg_cas04,74,88
aldeg_cas04,50,132,0	warp	aldebaranwarp3404	1,1,aldeg_cas04,74,88
aldeg_cas04,78,88,0		warp	aldebaranwarp3405	1,1,aldeg_cas04,174,58
aldeg_cas04,185,87,0	warp	aldebaranwarp3406	1,1,aldeg_cas04,111,210
aldeg_cas04,108,210,0	warp	aldebaranwarp3407	1,1,aldeg_cas04,186,92
aldeg_cas04,171,100,0	warp	aldebaranwarp3408	1,1,aldeg_cas04,152,210
aldeg_cas04,156,210,0	warp	aldebaranwarp3409	1,1,aldeg_cas04,169,97
aldeg_cas04,196,86,0	warp	aldebaranwarp3410	1,1,aldeg_cas04,49,57
aldeg_cas04,49,53,0		warp	aldebaranwarp3411	1,1,aldeg_cas04,196,82
aldeg_cas04,21,123,0	warp	aldebaranwarp3412	1,1,aldeg_cas04,125,168
aldeg_cas04,121,168,0	warp	aldebaranwarp3413	1,1,aldeg_cas04,25,123
aldeg_cas04,132,209,0	warp	aldebaranwarp3414	1,1,aldeg_cas04,14,196
aldeg_cas04,17,196,0	warp	aldebaranwarp3415	1,1,aldeg_cas04,132,228

aldeg_cas04,132,231,4	script	#aldebaranwarp3416	45,1,1,{
	switch(rand(4)) {
		case 0: warp "aldeg_cas04",170,100; end;
		case 1: warp "aldeg_cas04",186,88;  end;
		case 2: warp "aldeg_cas04",129,212; end;
		case 3: warp "aldeg_cas04",132,209; end;
	}
}

aldeg_cas05,194,71,0	warp	aldebaranwarp3501	1,1,aldeg_cas05,129,194
aldeg_cas05,125,194,0	warp	aldebaranwarp3502	1,1,aldeg_cas05,199,70
aldeg_cas05,164,86,0	warp	aldebaranwarp3503	1,1,aldeg_cas05,66,189
aldeg_cas05,70,189,0	warp	aldebaranwarp3504	1,1,aldeg_cas05,166,81
aldeg_cas05,150,67,0	warp	aldebaranwarp3505	1,1,aldeg_cas05,9,187
aldeg_cas05,5,187,0		warp	aldebaranwarp3506	1,1,aldeg_cas05,151,62
aldeg_cas05,165,232,0	warp	aldebaranwarp3507	1,1,aldeg_cas05,193,49
aldeg_cas05,188,49,0	warp	aldebaranwarp3508	1,1,aldeg_cas05,165,288
aldeg_cas05,195,42,0	warp	aldebaranwarp3509	1,1,aldeg_cas05,19,227
aldeg_cas05,15,227,0	warp	aldebaranwarp3510	1,1,aldeg_cas05,195,46
aldeg_cas05,13,175,0	warp	aldebaranwarp3511	1,1,aldeg_cas05,162,194
aldeg_cas05,166,194,0	warp	aldebaranwarp3512	1,1,aldeg_cas05,13,179
aldeg_cas05,156,231,0	warp	aldebaranwarp3513	1,1,aldeg_cas05,18,88
aldeg_cas05,14,88,0		warp	aldebaranwarp3514	1,1,aldeg_cas05,156,227



//==============================================================
// ----- Geffen ゲフェン -----
// gefg_cas01	ブリトニア 砦 1 ～ 5
// -----
// gef_fild13	ブリトニア
//==============================================================
gefg_cas01,34,136,0		warp	geffenwarp0501		1,1,gef_fild13,150,50
gefg_cas01,99,178,0		warp	geffenwarp0502		1,1,gef_fild13,214,75
gefg_cas02,70,147,0		warp	geffenwarp0503		1,1,gef_fild13,308,240
gefg_cas03,68,290,0		warp	geffenwarp0504		1,1,gef_fild13,74,287
gefg_cas03,103,283,0	warp	geffenwarp0505		1,1,gef_fild13,117,273
gefg_cas03,130,250,0	warp	geffenwarp0506		1,1,gef_fild13,143,240
gefg_cas03,93,159,0		warp	geffenwarp0507		1,1,gef_fild13,83,181
gefg_cas04,24,145,0		warp	geffenwarp0508		1,1,gef_fild13,193,278
gefg_cas05,7,134,0		warp	geffenwarp0509		1,1,gef_fild13,252,57
gefg_cas05,99,204,0		warp	geffenwarp0510		1,1,gef_fild13,305,87

gefg_cas01,39,196,0		warp	geffenwarp3101		1,1,gefg_cas01,62,13
gefg_cas01,62,9,0		warp	geffenwarp3102		1,1,gefg_cas01,39,192
gefg_cas01,58,185,0		warp	geffenwarp3103		1,1,gefg_cas01,90,47
gefg_cas01,90,51,0		warp	geffenwarp3104		1,1,gefg_cas01,54,185
gefg_cas01,59,170,0		warp	geffenwarp3105		1,1,gefg_cas01,205,34
gefg_cas01,209,34,0		warp	geffenwarp3106		1,1,gefg_cas01,56,170
gefg_cas01,31,185,0		warp	geffenwarp3107		1,1,gefg_cas01,33,47
gefg_cas01,33,51,0		warp	geffenwarp3108		1,1,gefg_cas01,35,185
gefg_cas01,34,167,0		warp	geffenwarp3109		1,1,gefg_cas01,174,34
gefg_cas01,170,34,0		warp	geffenwarp3110		1,1,gefg_cas01,30,167
gefg_cas01,54,84,0		warp	geffenwarp3111		1,1,gefg_cas01,174,14
gefg_cas01,170,14,0		warp	geffenwarp3112		1,1,gefg_cas01,50,84
gefg_cas01,181,52,0		warp	geffenwarp3113		1,1,gefg_cas01,198,160
gefg_cas01,202,160,0	warp	geffenwarp3114		1,1,gefg_cas01,185,52

gefg_cas02,35,173,0		warp	geffenwarp3201		1,1,gefg_cas02,76,42
gefg_cas02,80,42,0		warp	geffenwarp3202		1,1,gefg_cas02,39,173
gefg_cas02,46,175,0		warp	geffenwarp3203		1,1,gefg_cas02,34,64
gefg_cas02,34,68,0		warp	geffenwarp3204		1,1,gefg_cas02,50,175
gefg_cas02,22,160,0		warp	geffenwarp3205		1,1,gefg_cas02,34,17
gefg_cas02,34,13,0		warp	geffenwarp3206		1,1,gefg_cas02,22,156
gefg_cas02,48,159,0		warp	geffenwarp3207		1,1,gefg_cas02,184,41
gefg_cas02,184,36,0		warp	geffenwarp3208		1,1,gefg_cas02,48,155
gefg_cas02,34,152,0		warp	geffenwarp3209		1,1,gefg_cas02,153,18
gefg_cas02,148,18,0		warp	geffenwarp3210		1,1,gefg_cas02,35,150
gefg_cas02,57,136,0		warp	geffenwarp3211		1,1,gefg_cas02,180,18
gefg_cas02,185,18,0		warp	geffenwarp3212		1,1,gefg_cas02,53,136
gefg_cas02,25,13,0		warp	geffenwarp3213		1,1,gefg_cas02,170,11
gefg_cas02,174,11,0		warp	geffenwarp3214		1,1,gefg_cas02,21,13
gefg_cas02,150,36,0		warp	geffenwarp3215		1,1,gefg_cas02,152,186
gefg_cas02,152,190,0	warp	geffenwarp3216		1,1,gefg_cas02,150,41

gefg_cas03,66,223,0		warp	geffenwarp3301		1,1,gefg_cas03,96,53
gefg_cas03,92,53,0		warp	geffenwarp3302		1,1,gefg_cas03,62,223
gefg_cas03,34,286,0		warp	geffenwarp3303		1,1,gefg_cas03,131,92
gefg_cas03,135,92,0		warp	geffenwarp3304		1,1,gefg_cas03,34,282
gefg_cas03,47,271,0		warp	geffenwarp3305		1,1,gefg_cas03,38,255
gefg_cas03,38,259,0		warp	geffenwarp3306		1,1,gefg_cas03,43,271
gefg_cas03,63,255,0		warp	geffenwarp3307		1,1,gefg_cas03,156,92
gefg_cas03,152,92,0		warp	geffenwarp3308		1,1,gefg_cas03,59,255
gefg_cas03,50,248,0		warp	geffenwarp3309		1,1,gefg_cas03,54,229
gefg_cas03,58,232,0		warp	geffenwarp3310		1,1,gefg_cas03,62,213
gefg_cas03,38,243,0		warp	geffenwarp3311		1,1,gefg_cas03,29,219
gefg_cas03,17,206,0		warp	geffenwarp3312		1,1,gefg_cas03,29,219
gefg_cas03,27,215,0		warp	geffenwarp3313		1,1,gefg_cas03,17,202
gefg_cas03,106,217,0	warp	geffenwarp3314		1,1,gefg_cas03,131,15
gefg_cas03,135,15,0		warp	geffenwarp3315		1,1,gefg_cas03,110,217
gefg_cas03,115,210,0	warp	geffenwarp3316		1,1,gefg_cas03,92,215
gefg_cas03,90,218,0		warp	geffenwarp3317		1,1,gefg_cas03,111,210
gefg_cas03,42,175,0		warp	geffenwarp3318		1,1,gefg_cas03,266,43
gefg_cas03,266,47,0		warp	geffenwarp3319		1,1,gefg_cas03,45,175
gefg_cas03,70,182,0		warp	geffenwarp3320		1,1,gefg_cas03,39,191
gefg_cas03,43,191,0		warp	geffenwarp3321		1,1,gefg_cas03,70,185
gefg_cas03,93,209,0		warp	geffenwarp3322		1,1,gefg_cas03,92,250
gefg_cas03,88,248,0		warp	geffenwarp3323		1,1,gefg_cas03,76,242
gefg_cas03,65,215,0		warp	geffenwarp3324		1,1,gefg_cas03,233,74
gefg_cas03,237,74,0		warp	geffenwarp3325		1,1,gefg_cas03,62,213
gefg_cas03,95,251,0		warp	geffenwarp3326		1,1,gefg_cas03,91,209
gefg_cas03,79,244,0		warp	geffenwarp3327		1,1,gefg_cas03,91,250
gefg_cas03,154,16,0		warp	geffenwarp3328		1,1,gefg_cas03,252,11
gefg_cas03,256,11,0		warp	geffenwarp3329		1,1,gefg_cas03,159,16
gefg_cas03,212,46,0		warp	geffenwarp3330		1,1,gefg_cas03,225,158
gefg_cas03,225,154,0	warp	geffenwarp3331		1,1,gefg_cas03,212,42

gefg_cas04,34,211,0		warp	geffenwarp3401		1,1,gefg_cas04,18,78
gefg_cas04,18,82,0		warp	geffenwarp3402		1,1,gefg_cas04,34,215
gefg_cas04,57,224,0		warp	geffenwarp3403		1,1,gefg_cas04,18,13
gefg_cas04,18,9,0		warp	geffenwarp3404		1,1,gefg_cas04,57,220
gefg_cas04,53,196,0		warp	geffenwarp3405		1,1,gefg_cas04,170,36
gefg_cas04,174,36,0		warp	geffenwarp3406		1,1,gefg_cas04,53,192
gefg_cas04,27,180,0		warp	geffenwarp3407		1,1,gefg_cas04,142,59
gefg_cas04,142,55,0		warp	geffenwarp3408		1,1,gefg_cas04,32,180
gefg_cas04,42,81,0		warp	geffenwarp3409		1,1,gefg_cas04,42,13
gefg_cas04,42,9,0		warp	geffenwarp3410		1,1,gefg_cas04,42,77
gefg_cas04,52,25,0		warp	geffenwarp3411		1,1,gefg_cas04,142,37
gefg_cas04,142,33,0		warp	geffenwarp3412		1,1,gefg_cas04,52,21
gefg_cas04,178,57,0		warp	geffenwarp3413		1,1,gefg_cas04,143,166
gefg_cas04,140,168,0	warp	geffenwarp3414		1,1,gefg_cas04,178,61

gefg_cas05,50,165,0		warp	geffenwarp3501		1,1,gefg_cas05,178,68
gefg_cas05,178,72,0		warp	geffenwarp3502		1,1,gefg_cas05,46,165
gefg_cas05,87,165,0		warp	geffenwarp3503		1,1,gefg_cas05,84,62
gefg_cas05,88,62,0		warp	geffenwarp3504		1,1,gefg_cas05,83,165
gefg_cas05,44,143,0		warp	geffenwarp3505		1,1,gefg_cas05,70,155
gefg_cas05,68,150,0		warp	geffenwarp3506		1,1,gefg_cas05,44,147
gefg_cas05,83,152,0		warp	geffenwarp3507		1,1,gefg_cas05,66,72
gefg_cas05,66,76,0		warp	geffenwarp3508		1,1,gefg_cas05,80,155
gefg_cas05,74,138,0		warp	geffenwarp3509		1,1,gefg_cas05,47,62
gefg_cas05,43,62,0		warp	geffenwarp3510		1,1,gefg_cas05,78,138
gefg_cas05,37,16,0		warp	geffenwarp3511		1,1,gefg_cas05,153,44
gefg_cas05,149,44,0		warp	geffenwarp3512		1,1,gefg_cas05,37,20
gefg_cas05,93,16,0		warp	geffenwarp3513		1,1,gefg_cas05,202,44
gefg_cas05,206,44,0		warp	geffenwarp3514		1,1,gefg_cas05,93,20
gefg_cas05,190,20,0		warp	geffenwarp3515		1,1,gefg_cas05,194,151
gefg_cas05,194,147,0	warp	geffenwarp3516		1,1,gefg_cas05,190,16



//==============================================================
// ----- Prontera プロンテラ -----
// prtg_cas01	砦 1 ～ 5
// -----
// prt_gld		ヴァルキリーレルム
//==============================================================
prtg_cas01,103,32,0		warp	pronterawarp0201	1,1,prt_gld,134,65
prtg_cas02,43,233,0		warp	pronterawarp0202	1,1,prt_gld,240,128
prtg_cas03,168,8,0		warp	pronterawarp0203	1,1,prt_gld,153,137
prtg_cas04,86,9,0		warp	pronterawarp0204	1,1,prt_gld,111,240
prtg_cas05,17,231,0		warp	pronterawarp0205	1,1,prt_gld,208,240

// prontera guild
prtg_cas01,57,19,0		warp	pronterawarp3101	1,1,prtg_cas01,80,49
prtg_cas01,84,49,0		warp	pronterawarp3102	1,1,prtg_cas01,61,19
prtg_cas01,41,34,0		warp	pronterawarp3103	1,1,prtg_cas01,40,47
prtg_cas01,37,47,0		warp	pronterawarp3104	1,1,prtg_cas01,45,34
prtg_cas01,37,54,0		warp	pronterawarp3105	1,1,prtg_cas01,192,119
prtg_cas01,196,119,0	warp	pronterawarp3106	1,1,prtg_cas01,40,54
prtg_cas01,71,54,0		warp	pronterawarp3107	1,1,prtg_cas01,192,65
prtg_cas01,196,65,0		warp	pronterawarp3108	1,1,prtg_cas01,75,54
prtg_cas01,51,70,0		warp	pronterawarp3109	1,1,prtg_cas01,202,92
prtg_cas01,206,92,0		warp	pronterawarp3110	1,1,prtg_cas01,55,70
prtg_cas01,147,120,0	warp	pronterawarp3111	1,1,prtg_cas01,75,187
prtg_cas01,75,183,0		warp	pronterawarp3112	1,1,prtg_cas01,147,116
prtg_cas01,109,163,0	warp	pronterawarp3113	1,1,prtg_cas01,202,183
prtg_cas01,206,183,0	warp	pronterawarp3114	1,1,prtg_cas01,113,163
prtg_cas01,62,34,0		warp	pronterawarp3115	1,1,prtg_cas01,192,119
prtg_cas01,84,19,0		warp	pronterawarp3116	1,1,prtg_cas01,192,65

prtg_cas02,88,215,0		warp	pronterawarp3201	1,1,prtg_cas02,206,41
prtg_cas02,210,41,0		warp	pronterawarp3202	1,1,prtg_cas02,84,215
prtg_cas02,53,202,0		warp	pronterawarp3203	1,1,prtg_cas02,165,41
prtg_cas02,161,41,0		warp	pronterawarp3204	1,1,prtg_cas02,57,202
prtg_cas02,64,164,0		warp	pronterawarp3205	1,1,prtg_cas02,98,25
prtg_cas02,98,21,0		warp	pronterawarp3206	1,1,prtg_cas02,64,168
prtg_cas02,35,183,0		warp	pronterawarp3207	1,1,prtg_cas02,71,82
prtg_cas02,71,86,0		warp	pronterawarp3208	1,1,prtg_cas02,35,187
prtg_cas02,45,21,0		warp	pronterawarp3209	1,1,prtg_cas02,203,25
prtg_cas02,203,21,0		warp	pronterawarp3210	1,1,prtg_cas02,45,25
prtg_cas02,184,44,0		warp	pronterawarp3211	1,1,prtg_cas02,157,140
prtg_cas02,157,135,0	warp	pronterawarp3212	1,1,prtg_cas02,184,40

prtg_cas03,178,85,0		warp	pronterawarp3301	1,1,prtg_cas03,82,73
prtg_cas03,86,73,0		warp	pronterawarp3302	1,1,prtg_cas03,178,81
prtg_cas03,191,55,0		warp	pronterawarp3303	1,1,prtg_cas03,190,233
prtg_cas03,194,233,0	warp	pronterawarp3304	1,1,prtg_cas03,191,59
prtg_cas03,172,44,0		warp	pronterawarp3305	1,1,prtg_cas03,10,78
prtg_cas03,6,78,0		warp	pronterawarp3306	1,1,prtg_cas03,176,44
prtg_cas03,165,59,0		warp	pronterawarp3307	1,1,prtg_cas03,45,47
prtg_cas03,45,43,0		warp	pronterawarp3308	1,1,prtg_cas03,165,54
prtg_cas03,45,120,0		warp	pronterawarp3309	1,1,prtg_cas03,164,177
prtg_cas03,164,173,0	warp	pronterawarp3310	1,1,prtg_cas03,45,117
prtg_cas03,169,235,0	warp	pronterawarp3311	1,1,prtg_cas03,11,200
prtg_cas03,7,200,0		warp	pronterawarp3312	1,1,prtg_cas03,169,231

prtg_cas04,48,48,0		warp	pronterawarp3401	1,1,prtg_cas04,10,233
prtg_cas04,10,229,0		warp	pronterawarp3402	1,1,prtg_cas04,48,44
prtg_cas04,63,30,0		warp	pronterawarp3403	1,1,prtg_cas04,34,229
prtg_cas04,34,225,0		warp	pronterawarp3404	1,1,prtg_cas04,63,26
prtg_cas04,32,28,0		warp	pronterawarp3405	1,1,prtg_cas04,11,254
prtg_cas04,7,254,0		warp	pronterawarp3406	1,1,prtg_cas04,32,32
prtg_cas04,42,13,0		warp	pronterawarp3407	1,1,prtg_cas04,56,254
prtg_cas04,60,254,0		warp	pronterawarp3408	1,1,prtg_cas04,42,17
prtg_cas04,54,25,0		warp	pronterawarp3409	1,1,prtg_cas04,56,233
prtg_cas04,56,229,0		warp	pronterawarp3410	1,1,prtg_cas04,54,29
prtg_cas04,34,290,0		warp	pronterawarp3411	1,1,prtg_cas04,238,261 
prtg_cas04,238,257,0	warp	pronterawarp3412	1,1,prtg_cas04,34,286
prtg_cas04,247,258,0	warp	pronterawarp3413	1,1,prtg_cas04,255,14
prtg_cas04,251,14,0		warp	pronterawarp3414	1,1,prtg_cas04,247,254

prtg_cas05,38,250,0		warp	pronterawarp3501	1,1,prtg_cas05,244,7
prtg_cas05,244,3,0		warp	pronterawarp3502	1,1,prtg_cas05,35,247
prtg_cas05,76,242,0		warp	pronterawarp3503	1,1,prtg_cas05,288,13
prtg_cas05,292,13,0		warp	pronterawarp3504	1,1,prtg_cas05,76,246
prtg_cas05,66,225,0		warp	pronterawarp3505	1,1,prtg_cas05,260,92
prtg_cas05,260,96,0		warp	pronterawarp3506	1,1,prtg_cas05,66,229
prtg_cas05,53,246,0		warp	pronterawarp3507	1,1,prtg_cas05,199,13
prtg_cas05,195,13,0		warp	pronterawarp3508	1,1,prtg_cas05,55,248
prtg_cas05,228,96,0		warp	pronterawarp3509	1,1,prtg_cas05,26,7
prtg_cas05,26,3,0		warp	pronterawarp3510	1,1,prtg_cas05,228,92
prtg_cas05,58,7,0		warp	pronterawarp3511	1,1,prtg_cas05,253,290
prtg_cas05,253,294,0	warp	pronterawarp3512	1,1,prtg_cas05,58,11


//==============================================================
// guild_room	ギルドコロシアム控室
// guild_vs1	ギルドコロシアム
// guild_vs2	ギルドコロシアム
// guild_vs3	ギルドコロシアム
// guild_vs4	ギルドコロシアム
// guild_vs5	ギルドコロシアム
// -----
//==============================================================



//---JP3.0 追加マップ---


//---アマツ追加マップ---


//---コンロン追加マップ---


//---ウンバラ追加マップ


//---ニブルヘイム追加マップ


//---龍之城追加マップ


//---神器クエスト追加マップ


//---アユタヤ追加マップ


//---ジュノーフィールド追加マップ


//---アルデバランターボトラック追加マップ


//==============================================================
// turbo_room	ターボトラック控え室
// turbo_n_1	ターボトラック競技場
// turbo_n_4	ターボトラック競技場
// turbo_n_8	ターボトラック競技場
// turbo_n_16	ターボトラック競技場
// turbo_e_4	ターボトラック競技場
// turbo_e_8	ターボトラック競技場
// turbo_e_16	ターボトラック競技場
// -----
//==============================================================



//---鋼鉄都市アインブロク追加マップ


//---企業都市リヒタルゼン追加マップ



//==============================================================
// ----- Prontera プロンテラ -----
// nguild_prt	プロンテラギルド
// -----
// n_castle	ノービスキャッスル
//==============================================================
n_castle,15,13,0	warp	npronterawarp3001	1,1,nguild_prt,100,32
nguild_prt,103,32,0	warp	npronterawarp3002	1,1,n_castle,18,13
nguild_prt,57,19,0	warp	npronterawarp3003	1,1,nguild_prt,80,49
nguild_prt,41,34,0	warp	npronterawarp3004	1,1,nguild_prt,40,47
nguild_prt,37,54,0	warp	npronterawarp3005	1,1,nguild_prt,192,119
nguild_prt,71,54,0	warp	npronterawarp3006	1,1,nguild_prt,192,65
nguild_prt,51,70,0	warp	npronterawarp3007	1,1,nguild_prt,202,92
nguild_prt,84,49,0	warp	npronterawarp3008	1,1,nguild_prt,61,19
nguild_prt,37,47,0	warp	npronterawarp3009	1,1,nguild_prt,45,34
nguild_prt,62,34,0	warp	npronterawarp3010	1,1,nguild_prt,192,119
nguild_prt,84,19,0	warp	npronterawarp3011	1,1,nguild_prt,192,65
nguild_prt,206,92,0	warp	npronterawarp3012	1,1,nguild_prt,55,70
nguild_prt,196,65,0	warp	npronterawarp3013	1,1,nguild_prt,75,54
nguild_prt,196,119,0	warp	npronterawarp3014	1,1,nguild_prt,40,54
nguild_prt,147,120,0	warp	npronterawarp3015	1,1,nguild_prt,75,187
nguild_prt,75,183,0	warp	npronterawarp3016	1,1,nguild_prt,147,116
nguild_prt,109,163,0	warp	npronterawarp3017	1,1,nguild_prt,202,183
nguild_prt,206,183,0	warp	npronterawarp3018	1,1,nguild_prt,113,163


//==============================================================
// ----- Geffen ゲフェン -----
// nguild_gef	ゲフェンギルド
// -----
// n_castle	ノービスキャッスル
//==============================================================
n_castle,184,184,0	warp	ngeffenwarp3001	1,1,nguild_gef,34,139
nguild_gef,34,136,0	warp	ngeffenwarp3002	1,1,n_castle,184,181
nguild_gef,39,196,0	warp	ngeffenwarp3003	1,1,nguild_gef,62,13
nguild_gef,58,185,0	warp	ngeffenwarp3004	1,1,nguild_gef,90,47
nguild_gef,59,170,0	warp	ngeffenwarp3005	1,1,nguild_gef,205,34
nguild_gef,31,185,0	warp	ngeffenwarp3006	1,1,nguild_gef,33,47
nguild_gef,34,167,0	warp	ngeffenwarp3007	1,1,nguild_gef,174,34
nguild_gef,54,84,0	warp	ngeffenwarp3008	1,1,nguild_gef,174,14
nguild_gef,33,51,0	warp	ngeffenwarp3009	1,1,nguild_gef,35,185
nguild_gef,90,51,0	warp	ngeffenwarp3010	1,1,nguild_gef,54,185
nguild_gef,62,9,0	warp	ngeffenwarp3011	1,1,nguild_gef,39,192
nguild_gef,181,52,0	warp	ngeffenwarp3012	1,1,nguild_gef,198,160
nguild_gef,170,34,0	warp	ngeffenwarp3013	1,1,nguild_gef,30,167
nguild_gef,209,34,0	warp	ngeffenwarp3014	1,1,nguild_gef,56,170
nguild_gef,170,14,0	warp	ngeffenwarp3015	1,1,nguild_gef,50,84
nguild_gef,202,160,0	warp	ngeffenwarp3016	1,1,nguild_gef,185,52


//==============================================================
// ----- Payon フェイヨン -----
// nguild_pay	フェイヨンギルド
// -----
// n_castle	ノービスキャッスル
//==============================================================
nguild_pay,214,44,0	warp	npayonwarp3001	1,1,n_castle,17,179
n_castle,17,182,0	warp	npayonwarp3002	1,1,nguild_pay,214,48
nguild_pay,201,126,0	warp	npayonwarp3003	1,1,nguild_pay,102,21
nguild_pay,222,130,0	warp	npayonwarp3004	1,1,nguild_pay,130,43
nguild_pay,218,112,0	warp	npayonwarp3005	1,1,nguild_pay,230,94
nguild_pay,230,98,0	warp	npayonwarp3006	1,1,nguild_pay,222,112
nguild_pay,213,76,0	warp	npayonwarp3007	1,1,nguild_pay,201,118
nguild_pay,201,114,0	warp	npayonwarp3008	1,1,nguild_pay,213,72
nguild_pay,134,43,0	warp	npayonwarp3009	1,1,nguild_pay,226,130
nguild_pay,102,17,0	warp	npayonwarp3000	1,1,nguild_pay,201,121
nguild_pay,84,15,0	warp	npayonwarp3010	1,1,nguild_pay,15,115
nguild_pay,53,111,0	warp	npayonwarp3011	1,1,nguild_pay,115,147
nguild_pay,11,115,0	warp	npayonwarp3012	1,1,nguild_pay,81,15
nguild_pay,115,151,0	warp	npayonwarp3013	1,1,nguild_pay,53,115


//==============================================================
// ----- Aldebaran アルデバラン -----
// nguild_alde	アルデバランギルド
// -----
// n_castle	ノービスキャッスル
//==============================================================
nguild_alde,34,252,0	warp	naldebaranwarp3001	1,1,n_castle,186,15
n_castle,183,15,0	warp	naldebaranwarp3002	1,1,nguild_alde,34,248
nguild_alde,50,222,0	warp	naldebaranwarp3003	1,1,nguild_alde,104,108
nguild_alde,66,191,0	warp	naldebaranwarp3004	1,1,nguild_alde,122,61
nguild_alde,26,188,0	warp	naldebaranwarp3005	1,1,nguild_alde,50,70
nguild_alde,70,112,0	warp	naldebaranwarp3006	1,1,nguild_alde,42,225
nguild_alde,104,112,0	warp	naldebaranwarp3007	1,1,nguild_alde,45,224
nguild_alde,126,61,0	warp	naldebaranwarp3008	1,1,nguild_alde,62,191
nguild_alde,89,23,0	warp	naldebaranwarp3009	1,1,nguild_alde,207,132
nguild_alde,54,27,0	warp	naldebaranwarp3010	1,1,nguild_alde,62,191
nguild_alde,46,70,0	warp	naldebaranwarp3011	1,1,nguild_alde,24,188
nguild_alde,206,188,0	warp	naldebaranwarp3012	1,1,nguild_alde,216,50
nguild_alde,232,186,0	warp	naldebaranwarp3013	1,1,nguild_alde,42,197
nguild_alde,207,128,0	warp	naldebaranwarp3014	1,1,nguild_alde,89,27
nguild_alde,171,175,0	warp	naldebaranwarp3015	1,1,nguild_alde,35,197
nguild_alde,216,54,0	warp	naldebaranwarp3016	1,1,nguild_alde,206,184
nguild_alde,46,197,0	warp	naldebaranwarp3017	1,1,nguild_alde,232,182
nguild_alde,31,197,0	warp	naldebaranwarp3018	1,1,nguild_alde,175,175
nguild_alde,39,222,0	warp	naldebaranwarp3019	1,1,nguild_alde,70,108


//==============================================================
// ----- Schwaltzvalt シュバルツバルド -----
// schg_cas01	ニダヴェリール 砦1 ～ 5
// -----
// sch_gld	ニダヴェリール
//==============================================================
sch_gld,354,89,0		warp	schwaltzvaltwarp0101	1,1,yuno,16,126

schg_cas01,119,4,0		warp	schwaltzvaltwarp0201	1,1,sch_gld,293,100
schg_cas02,339,73,0		warp	schwaltzvaltwarp0202	1,1,sch_gld,288,252
schg_cas03,337,336,0	warp	schwaltzvaltwarp0203	1,1,sch_gld,97,196
schg_cas04,119,4,0		warp	schwaltzvaltwarp0204	1,1,sch_gld,137,90
schg_cas05,119,4,0		warp	schwaltzvaltwarp0205	1,1,sch_gld,71,315

sch_gld,293,90,0		warp	schwaltzvaltwarp0301	1,1,schg_cas01,119,8
sch_gld,288,258,0		warp	schwaltzvaltwarp0302	1,1,schg_cas02,339,78
sch_gld,97,183,0		warp	schwaltzvaltwarp0303	1,1,schg_cas03,337,330
sch_gld,137,98,0		warp	schwaltzvaltwarp0304	1,1,schg_cas04,119,8
sch_gld,65,315,0		warp	schwaltzvaltwarp0305	1,1,schg_cas05,119,8

yuno,13,126,0		warp	schwaltzvaltwarp2001	1,1,sch_gld,351,89

schg_cas01,275,240,0	warp	schwaltzvaltwarp3101	1,1,schg_cas01,120,7
schg_cas02,101,301,0	warp	schwaltzvaltwarp3201	1,1,schg_cas02,340,78
schg_cas03,57,9,0		warp	schwaltzvaltwarp3301	1,1,schg_cas03,337,330
schg_cas04,275,240,0	warp	schwaltzvaltwarp3401	1,1,schg_cas04,120,7
schg_cas05,275,240,0	warp	schwaltzvaltwarp3501	1,1,schg_cas05,120,7


//==============================================================
// ----- Arunafeltz アルナベルツ -----
// arug_cas01	ヴァルフレイヤ 砦1 ～ 5
// -----
// aru_gld	ヴァルフレイヤ
//==============================================================
arug_cas01,281,93,0		warp	arunafeltzwarp0201	1,1,aru_gld,158,272
arug_cas02,139,25,0		warp	arunafeltzwarp0202	1,1,aru_gld,83,47
arug_cas03,141,40,0		warp	arunafeltzwarp0203	1,1,aru_gld,68,155
arug_cas04,141,40,0		warp	arunafeltzwarp0204	1,1,aru_gld,299,345
arug_cas05,141,40,0		warp	arunafeltzwarp0205	1,1,aru_gld,292,107

aru_gld,155,274,0		warp	arunafeltzwarp0301	1,1,arug_cas01,275,93
aru_gld,78,47,0		warp	arunafeltzwarp0302	1,1,arug_cas02,139,31
aru_gld,68,150,0		warp	arunafeltzwarp0303	1,1,arug_cas03,141,45
aru_gld,289,347,0		warp	arunafeltzwarp0304	1,1,arug_cas04,141,45
aru_gld,287,107,0		warp	arunafeltzwarp0305	1,1,arug_cas05,141,45

aru_gld,195,363,0		warp	arunafeltzwarp0501	1,1,ve_fild02,191,24

ve_fild02,191,21,0		warp	arunafeltzwarp2001	1,1,aru_gld,195,360

arug_cas01,127,357,0	warp	arunafeltzwarp3101	1,1,arug_cas01,275,93
arug_cas02,393,324,0	warp	arunafeltzwarp3201	1,1,arug_cas02,139,31
arug_cas03,321,52,0		warp	arunafeltzwarp3301	1,1,arug_cas03,141,45
arug_cas04,321,52,0		warp	arunafeltzwarp3401	1,1,arug_cas04,141,45
arug_cas05,321,52,0		warp	arunafeltzwarp3501	1,1,arug_cas05,141,45
