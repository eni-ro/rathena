//==============================================================================
// Field Warp Point Script   2005-06-28(β3 mod by kia)
//==============================================================================

//-------------------------------------------
// warp0xxx 	MAPの区切り  	
// warp01xx 	街へ         	
// warp02xx 	GvGルームへ  	
// warp03xx 	砦へ         	
// warp04xx 	ダンジョンへ 	
// warp05xx 	フィールドへ 	
// warp06xx 	JOBステージへ	
// warp07xx 	PvPステージへ	
// warp1xxx 	街           	(使わない)
// warp2xxx 	GvGルーム    	(使わない)
// warp3xxx 	GvG 砦       	(使わない)
// warp31xx 	GvG 砦１     	
// warp32xx 	GvG 砦２     	
// warp33xx 	GvG 砦３     	
// warp34xx 	GvG 砦４     	
// warp35xx 	GvG 砦５     	
// warp4xxx 	ダンジョン   	(使わない)
// warp5xxx 	フィールド   	
// warp6xxx 	JOBステージ  	(使わない)
// warp7xxx 	PvPステージ  	(使わない)
// warp71xxx	PvPステージ１	
// warp72xxx	PvPステージ２	
// warp73xxx	PvPステージ３	
// warp74xxx	PvPステージ４	
// warp75xxx	PvPステージ５	
// warp76xxx	PvPステージ６	
// warp77xxx	PvPステージ７	
// warp78xxx	PvPステージ８	
//-------------------------------------------
// #        	script warp	
//-------------------------------------------
// TAB :    	8
//-------------------------------------------


//==============================================================
// ----- Xmas ルティエ -----
// mas_fild01	ルティエフィールド
// -----
// xmas 		雪の街ルティエ
// aldebaran	国境都市アルデバラン
//==============================================================
xmas_fild01,69,252,0	warp	xmaswarp0101		18,2,xmas,149,44
xmas_fild01,90,252,0	warp	xmaswarp0102		18,2,xmas,149,44
xmas_fild01,84,51,0		warp	xmaswarp0103		10,2,aldebaran,140,234



//==============================================================
// ----- Mjolnir ミョルニール山脈 -----
// mjolnir_01	ミョルニール山脈 01 ～ 12
// -----
// aldebaran	国境都市アルデバラン
// mjo_dun01	ミョルニール廃坑 B1F
// gef_fild00	ゲフェンフィールド 00 ～ 11
// prt_maze01	迷宮の森
//==============================================================
mjolnir_12,199,378,0	warp	mjolnirwarp0101		2,2,aldebaran,138,37
mjolnir_02,79,365,0		warp	mjolnirwarp0401		2,1,mjo_dun01,52,17

// mjolnir
mjolnir_01,284,18,0		warp	mjolnirwarp0501		4,2,gef_fild04,261,359
mjolnir_06,18,331,0		warp	mjolnirwarp0502		2,4,gef_fild04,359,322
mjolnir_06,265,29,0		warp	mjolnirwarp0503		2,2,gef_fild00,267,379
mjolnir_07,156,16,0		warp	mjolnirwarp0504		4,2,prt_fild00,159,380
mjolnir_09,106,28,0		warp	mjolnirwarp0505		4,2,prt_fild05,105,378
mjolnir_09,30,249,0		warp	mjolnirwarp0506		2,4,prt_fild00,380,249
mjolnir_09,300,28,0		warp	mjolnirwarp0507		4,2,prt_fild05,292,382
mjolnir_10,265,13,0		warp	mjolnirwarp0508		3,2,prt_fild01,261,370
mjolnir_10,66,15,0		warp	mjolnirwarp0509		4,2,prt_fild01,66,370
mjolnir_11,174,20,0		warp	mjolnirwarp0510		4,2,prt_fild02,173,379
mjolnir_09,373,288,0	warp	mjolnirwarp0511		2,2,prt_fild01,23,292
//prt maze Entrance(Prt,Ald)
mjolnir_12,44,17,0		warp	mjolnirwarp0512		1,1,prt_maze01,17,111	/*To No.1-11*/

mjolnir_01,378,256,0	warp	mjolnirwarp5001		1,2,mjolnir_02,30,258
mjolnir_02,28,258,0		warp	mjolnirwarp5002		2,2,mjolnir_01,376,256
mjolnir_02,326,289,0	warp	mjolnirwarp5003		1,1,mjolnir_03,24,258
mjolnir_03,21,258,0		warp	mjolnirwarp5004		2,2,mjolnir_02,323,289
mjolnir_02,361,18,0		warp	mjolnirwarp5005		4,2,mjolnir_06,366,380
mjolnir_06,366,383,0	warp	mjolnirwarp5006		4,2,mjolnir_02,361,21
mjolnir_03,212,17,0		warp	mjolnirwarp5007		4,2,mjolnir_07,214,380
mjolnir_07,214,383,0	warp	mjolnirwarp5008		4,2,mjolnir_03,212,20
mjolnir_03,242,204,0	warp	mjolnirwarp5009		1,1,mjolnir_04,125,208
mjolnir_04,122,208,0	warp	mjolnirwarp5010		1,1,mjolnir_03,239,204
mjolnir_04,160,46,0		warp	mjolnirwarp5011		4,2,mjolnir_08,159,370
mjolnir_08,159,373,0	warp	mjolnirwarp5012		1,1,mjolnir_04,160,49
mjolnir_04,387,174,0	warp	mjolnirwarp5013		2,2,mjolnir_05,19,171
mjolnir_05,16,171,0		warp	mjolnirwarp5014		2,2,mjolnir_04,384,174
mjolnir_05,220,382,0	warp	mjolnirwarp5015		4,2,mjolnir_12,220,29
mjolnir_12,220,26,0		warp	mjolnirwarp5016		3,2,mjolnir_05,220,379
mjolnir_05,235,16,0		warp	mjolnirwarp5017		4,2,mjolnir_10,235,378
mjolnir_10,235,381,0	warp	mjolnirwarp5018		4,2,mjolnir_05,235,19
mjolnir_06,382,377,0	warp	mjolnirwarp5019		2,4,mjolnir_07,19,377
mjolnir_07,16,377,0		warp	mjolnirwarp5020		2,4,mjolnir_06,379,377
mjolnir_06,383,74,0		warp	mjolnirwarp5021		2,4,mjolnir_07,20,77
mjolnir_07,17,77,0		warp	mjolnirwarp5022		2,4,mjolnir_06,380,74
mjolnir_07,383,233,0	warp	mjolnirwarp5023		2,4,mjolnir_08,33,234
mjolnir_08,30,234,0		warp	mjolnirwarp5024		2,4,mjolnir_07,380,233
mjolnir_07,383,362,0	warp	mjolnirwarp5025		2,4,mjolnir_08,32,346
mjolnir_08,29,346,0		warp	mjolnirwarp5026		2,4,mjolnir_07,380,362
mjolnir_08,185,28,0		warp	mjolnirwarp5027		17,2,mjolnir_09,196,364
mjolnir_09,194,367,0	warp	mjolnirwarp5028		8,2,mjolnir_08,185,31
mjolnir_08,369,257,0	warp	mjolnirwarp5029		2,4,mjolnir_10,18,258
mjolnir_10,15,258,0		warp	mjolnirwarp5030		2,4,mjolnir_08,366,257
mjolnir_10,384,220,0	warp	mjolnirwarp5031		2,4,mjolnir_11,23,220
mjolnir_11,20,220,0		warp	mjolnirwarp5032		2,4,mjolnir_10,381,220



//==============================================================
// ----- Prontera プロンテラ -----
// prt_fild00	プロンテラフィールド 00 ～ 11
// -----
// prontera		ルーンミッドガッツ王国の首都プロンテラ
// izlude		衛星都市イズルード
// gef_fild00	ゲフェンフィールド 00 ～ 11
// mjolnir_01	ミョルニール山脈 01 ～ 12
// moc_fild01	ソクラド砂漠 01 ～ 19
// moc_fild20	次元の狭間 01
// prt_maze01	迷宮の森
// prt_monk		聖カピトーリナ修道院
//==============================================================
prt_fild05,373,205,0	warp	pronterawarp0101	3,3,prontera,26,203
prt_fild06,23,193,0		warp	pronterawarp0102	2,3,prontera,285,203
prt_fild08,170,378,0	warp	pronterawarp0103	3,2,prontera,156,26
prt_fild08,371,212,0	warp	pronterawarp0104	3,3,izlude,35,78
//prt_fild01,199,24,0	warp	pronterawarp0105	3,2,prt_castle,102,178
prt_fild01,199,24,0		warp	pronterawarp0201	3,2,prt_gld,159,295

prt_fild00,18,129,0		warp	pronterawarp0501	2,6,gef_fild00,376,140
prt_fild04,17,114,0		warp	pronterawarp0502	2,10,gef_fild01,375,111
prt_fild07,13,64,0		warp	pronterawarp0503	3,8,gef_fild02,376,69
prt_fild07,14,289,0		warp	pronterawarp0504	3,10,gef_fild02,375,292
prt_fild07,17,145,0		warp	pronterawarp0505	3,12,gef_fild02,376,156
prt_fild10,227,299,0	warp	pronterawarp0506	5,2,gef_fild02,266,21
prt_fild11,17,281,0		warp	pronterawarp0507	2,4,gef_fild11,374,293
prt_fild11,302,301,0	warp	pronterawarp0508	5,2,gef_fild03,312,19
prt_fild00,159,383,0	warp	pronterawarp0509	4,2,mjolnir_07,156,19
prt_fild00,383,249,0	warp	pronterawarp0510	2,4,mjolnir_09,33,248
prt_fild01,20,292,0		warp	pronterawarp0511	2,3,mjolnir_09,370,288
prt_fild01,261,373,0	warp	pronterawarp0512	6,2,mjolnir_10,265,16
prt_fild01,66,373,0		warp	pronterawarp0513	2,2,mjolnir_10,66,18
prt_fild02,173,382,0	warp	pronterawarp0514	4,2,mjolnir_11,174,23
prt_fild05,105,381,0	warp	pronterawarp0515	5,2,mjolnir_09,106,34
prt_fild05,292,385,0	warp	pronterawarp0516	4,2,mjolnir_09,305,33
prt_fild08,233,16,0		warp	pronterawarp0517	12,1,moc_fild01,238,378
prt_fild08,55,21,0		warp	pronterawarp0518	4,2,moc_fild01,56,380
//prt_fild09,246,16,0	warp	pronterawarp0519	7,2,moc_fild04,92,378
prt_fild09,246,17,0		warp	pronterawarp0519	1,1,moc_fild20,209,333
prt_fild09,383,223,0	warp	pronterawarp0520	2,15,moc_fild01,25,242
prt_fild09,383,251,0	warp	pronterawarp0521	2,15,moc_fild01,25,242
//prt_fild09,95,16,0	warp	pronterawarp0522	7,2,moc_fild05,325,379
prt_fild09,95,19,0		warp	pronterawarp0522	1,1,moc_fild20,209,333
//prt_fild10,263,20,0	warp	pronterawarp0523	6,2,moc_fild05,144,372
prt_fild10,263,23,0		warp	pronterawarp0523	1,1,moc_fild20,209,333
prt_fild01,136,373,0	warp	pronterawarp0524	1,1,prt_maze01,99,31	/*To No.1-23*/
//prt_fild01,136,373,0	warp	pronterawarp0525	2,2,prt_maze01,176,7

prt_fild03,371,256,0	warp	pronterawarp0601	2,2,prt_monk,25,248

prt_fild00,165,18,0		warp	pronterawarp5001	9,3,prt_fild04,158,384
prt_fild04,160,387,0	warp	pronterawarp5001	10,2,prt_fild00,164,24
prt_fild00,317,18,0		warp	pronterawarp5002	8,2,prt_fild04,323,384
prt_fild04,323,387,0	warp	pronterawarp5002	7,2,prt_fild00,315,21
prt_fild01,380,243,0	warp	pronterawarp5003	2,5,prt_fild02,20,242
prt_fild02,17,242,0		warp	pronterawarp5003	2,5,prt_fild01,377,243
prt_fild01,382,304,0	warp	pronterawarp5004	2,10,prt_fild02,20,305
prt_fild02,17,305,0		warp	pronterawarp5004	2,5,prt_fild01,379,302
prt_fild01,382,351,0	warp	pronterawarp5005	2,8,prt_fild02,20,350
prt_fild02,17,350,0		warp	pronterawarp5005	2,7,prt_fild01,379,351
prt_fild02,305,17,0		warp	pronterawarp5006	10,2,prt_fild06,277,315
prt_fild06,277,320,0	warp	pronterawarp5006	10,2,prt_fild02,305,22
prt_fild02,380,347,0	warp	pronterawarp5007	2,10,prt_fild03,23,249
prt_fild03,16,249,0		warp	pronterawarp5007	2,10,prt_fild02,373,353
prt_fild04,378,72,0		warp	pronterawarp5008	2,6,prt_fild05,17,59
prt_fild05,13,63,0		warp	pronterawarp5008	2,15,prt_fild04,374,73
prt_fild04,384,155,0	warp	pronterawarp5009	2,7,prt_fild05,20,134
prt_fild05,14,141,0		warp	pronterawarp5009	2,18,prt_fild04,380,158
prt_fild04,384,334,0	warp	pronterawarp5010	2,6,prt_fild05,20,333
prt_fild05,15,333,0		warp	pronterawarp5010	2,8,prt_fild04,380,332
prt_fild05,134,14,0		warp	pronterawarp5011	14,3,prt_fild07,129,374
prt_fild07,132,381,0	warp	pronterawarp5011	9,3,prt_fild05,142,18
prt_fild05,255,14,0		warp	pronterawarp5012	12,2,prt_fild07,248,369
prt_fild07,248,376,0	warp	pronterawarp5012	8,2,prt_fild05,257,18
prt_fild07,206,12,0		warp	pronterawarp5013	4,2,prt_fild09,224,377
prt_fild09,224,380,0	warp	pronterawarp5013	4,2,prt_fild07,206,15
prt_fild07,383,239,0	warp	pronterawarp5014	3,20,prt_fild08,20,239
prt_fild08,16,239,0		warp	pronterawarp5014	3,15,prt_fild07,379,239
prt_fild07,385,186,0	warp	pronterawarp5015	3,20,prt_fild08,20,186
prt_fild08,16,187,0		warp	pronterawarp5015	3,17,prt_fild07,380,186
prt_fild07,84,13,0		warp	pronterawarp5016	4,2,prt_fild09,87,377
prt_fild09,87,380,0		warp	pronterawarp5016	5,2,prt_fild07,84,16
prt_fild09,14,124,0		warp	pronterawarp5017	2,6,prt_fild10,336,126
prt_fild09,14,139,0		warp	pronterawarp5017	2,8,prt_fild10,336,126
prt_fild10,339,126,0	warp	pronterawarp0000	2,8,prt_fild09,17,133
prt_fild10,20,122,0		warp	pronterawarp5019	2,4,prt_fild11,359,111
prt_fild11,362,111,0	warp	pronterawarp5019	2,6,prt_fild10,23,122
prt_fild10,20,196,0		warp	pronterawarp5020	2,4,prt_fild11,358,184
prt_fild11,361,184,0	warp	pronterawarp5020	2,5,prt_fild10,23,196



//==============================================================
// ----- Geffen ゲフェン -----
// gef_fild00	ゲフェンフィールド 00 ～ 11
// gef_fild12	コードの森
// gef_fild13	ブリトニア
// gef_fild14	オーク西の村
// -----
// geffen		魔法の都市ゲフェン
// in_orcs01	オーク村の室内
// gefg_cas01	ブリトニア砦 1 ～ 5
// glast_01		グラストヘイム古城
// mjolnir_01	ミョルニール山脈 01 ～ 12
// prt_fild00	プロンテラフィールド 00 ～ 11
//==============================================================
gef_fild00,40,199,0		warp	geffenwarp0101		2,7,geffen,213,119
gef_fild04,187,39,0		warp	geffenwarp0102		4,2,geffen,119,210
gef_fild07,339,187,0	warp	geffenwarp0103		2,4,geffen,29,119
gef_fild10,136,331,0	warp	geffenwarp0104		1,1,in_orcs01,122,171
gef_fild10,138,284,0	warp	geffenwarp0105		1,1,in_orcs01,29,114
gef_fild10,215,51,0		warp	geffenwarp0106		1,1,in_orcs01,162,53
gef_fild10,223,205,0	warp	geffenwarp0107		1,1,in_orcs01,108,89
gef_fild10,63,337,0		warp	geffenwarp0108		1,1,in_orcs01,30,157

// geffen guild
gef_fild13,150,54,0		warp	geffenwarp0301		1,1,gefg_cas01,34,140
gef_fild13,210,75,0		warp	geffenwarp0302		1,1,gefg_cas01,95,178
gef_fild13,308,244,0	warp	geffenwarp0303		1,1,gefg_cas02,70,143
gef_fild13,77,284,0		warp	geffenwarp0304		1,1,gefg_cas03,60,286
gef_fild13,112,269,0	warp	geffenwarp0305		1,1,gefg_cas03,100,280
gef_fild13,139,240,0	warp	geffenwarp0306		1,1,gefg_cas03,125,250
gef_fild13,83,185,0		warp	geffenwarp0307		1,1,gefg_cas03,89,159
gef_fild13,196,281,0	warp	geffenwarp0308		1,1,gefg_cas04,24,149
gef_fild13,256,57,0		warp	geffenwarp0309		1,1,gefg_cas05,11,134
gef_fild13,305,83,0		warp	geffenwarp0309		1,1,gefg_cas05,99,200

gef_fild06,18,304,0		warp	geffenwarp0401		3,3,glast_01,376,304

//geffen field
gef_fild00,267,382,0	warp	geffenwarp0501		4,2,mjolnir_06,265,32
gef_fild00,381,137,0	warp	geffenwarp0502		3,9,prt_fild00,24,125
gef_fild01,382,111,0	warp	geffenwarp0503		2,9,prt_fild04,20,114
gef_fild02,266,18,0		warp	geffenwarp0504		5,2,prt_fild10,227,296
gef_fild02,380,156,0	warp	geffenwarp0505		3,7,prt_fild07,21,143
gef_fild02,380,289,0	warp	geffenwarp0506		3,12,prt_fild07,18,289
gef_fild02,380,68,0		warp	geffenwarp0507		3,10,prt_fild07,17,64
gef_fild03,312,16,0		warp	geffenwarp0508		5,2,prt_fild11,302,298
gef_fild04,261,362,0	warp	geffenwarp0509		4,2,mjolnir_01,284,21
gef_fild04,362,322,0	warp	geffenwarp0510		2,4,mjolnir_06,21,331
gef_fild11,377,293,0	warp	geffenwarp0511		2,4,prt_fild11,20,281

gef_fild01,16,102,0		warp	geffenwarp5001		2,4,gef_fild09,368,92
gef_fild09,368,95,0		warp	geffenwarp5002		4,2,gef_fild01,19,102
gef_fild01,69,17,0		warp	geffenwarp5003		4,2,gef_fild03,66,379
gef_fild03,66,382,0		warp	geffenwarp5004		4,2,gef_fild01,69,20
gef_fild02,14,78,0		warp	geffenwarp5005		2,4,gef_fild03,379,77
gef_fild03,382,77,0		warp	geffenwarp5006		2,4,gef_fild02,17,78
gef_fild02,16,275,0		warp	geffenwarp5007		2,4,gef_fild03,379,277
gef_fild03,382,277,0	warp	geffenwarp5008		2,4,gef_fild02,19,275
gef_fild03,18,52,0		warp	geffenwarp5009		2,4,gef_fild10,367,56
gef_fild10,370,56,0		warp	geffenwarp5010		2,5,gef_fild03,21,52
gef_fild04,16,309,0		warp	geffenwarp5011		2,6,gef_fild05,361,309
gef_fild05,364,309,0	warp	geffenwarp5012		2,8,gef_fild04,19,309
gef_fild05,15,201,0		warp	geffenwarp5013		2,4,gef_fild06,379,211
gef_fild06,382,211,0	warp	geffenwarp5014		2,4,gef_fild05,18,201
gef_fild05,64,15,0		warp	geffenwarp5015		4,2,gef_fild07,64,360
gef_fild07,64,363,0		warp	geffenwarp5016		4,2,gef_fild05,64,18
gef_fild06,218,17,0		warp	geffenwarp5017		4,2,gef_fild08,200,352
gef_fild08,200,355,0	warp	geffenwarp5018		4,2,gef_fild06,218,20
gef_fild07,18,191,0		warp	geffenwarp5019		2,4,gef_fild08,357,187
gef_fild08,360,187,0	warp	geffenwarp5020		2,4,gef_fild07,21,191
gef_fild07,40,19,0		warp	geffenwarp5021		1,1,gef_fild13,41,369
gef_fild13,41,373,0		warp	geffenwarp5022		1,1,gef_fild07,40,23
gef_fild08,215,18,0		warp	geffenwarp5023		1,1,gef_fild12,221,369
gef_fild12,221,374,0	warp	geffenwarp5024		1,1,gef_fild08,215,25
gef_fild09,225,25,0		warp	geffenwarp5025		3,2,gef_fild10,251,368
gef_fild10,251,371,0	warp	geffenwarp5026		5,2,gef_fild09,225,28
gef_fild09,23,56,0		warp	geffenwarp5027		1,1,gef_fild13,376,56
gef_fild13,380,56,0		warp	geffenwarp5028		1,1,gef_fild09,27,56
gef_fild10,104,21,0		warp	geffenwarp5029		5,2,gef_fild11,114,360
gef_fild11,111,364,0	warp	geffenwarp5030		6,3,gef_fild10,104,24
gef_fild10,27,219,0		warp	geffenwarp5031		1,1,gef_fild14,367,219
gef_fild14,371,219,0	warp	geffenwarp5032		1,1,gef_fild10,31,219
gef_fild12,368,180,0	warp	geffenwarp5033		1,1,gef_fild13,29,202
gef_fild13,25,202,0		warp	geffenwarp5034		1,1,gef_fild12,364,180
gef_fild12,372,50,0		warp	geffenwarp5035		1,1,gef_fild13,29,59
gef_fild13,26,59,0		warp	geffenwarp5036		1,1,gef_fild12,370,50
gef_fild13,200,25,0		warp	geffenwarp5037		1,1,gef_fild14,180,357
gef_fild14,180,360,0	warp	geffenwarp5038		1,1,gef_fild13,200,29



//==============================================================
// ----- Morocc モロク -----
// moc_fild01	ソクラド砂漠 01 ～ 19
// moc_fild20	次元の狭間 01 ～ 03
// -----
// morocc		砂漠の都市モロク
// moc_ruins	モロク - ピラミッド周辺
// pay_gld		チェンリム湖
// anthell01	蟻地獄ダンジョン B1F
// in_sphinx1	スフィンクスダンジョン B1F
// pay_fild01	フェイヨン迷いの森 01 ～ 11
// prt_fild00	プロンテラフィールド 00 ～ 11
// cmd_fild08	サンダルマン要塞 東
// cmd_fild09	サンダルマン要塞 南
// in_moc_16	アサシンギルド
//==============================================================
moc_fild07,198,21,0		warp	moroccwarp0101		2,2,morocc,160,294
moc_fild10,19,207,0		warp	moroccwarp0102		2,2,morocc,299,207
moc_fild12,159,381,0	warp	moroccwarp0103		2,2,morocc,160,20
moc_fild19,169,107,0	warp	moroccwarp0104		1,4,morocc,27,164
moc_fild19,71,170,0		warp	moroccwarp0105		8,2,moc_ruins,71,19
moc_fild20,35,173,0		warp	moroccwarp0106		1,1,morocc,293,207

moc_fild02,378,272,0	warp	moroccwarp0201		1,1,pay_gld,20,276

//moc_fild04,219,327,0	warp	moroccwarp0401		3,4,anthell01,35,262
//moc_fild15,258,253,0	warp	moroccwarp0402		3,3,anthell01,35,262
//moc_fild20,156,143,0	warp	moroccwarp0401		1,1,anthell01,35,263
//moc_fild20,337,315,0	warp	moroccwarp0402		1,1,anthell02,168,170

moc_fild04,219,327,0	script	#moroccwarp0401		45,3,4,{
	set ANTHELL_FLAG,0;
	warp "anthell01",35,262;
	end;
}
moc_fild15,258,253,0	script	#moroccwarp0402		45,3,3,{
	set ANTHELL_FLAG,1;
	warp "anthell01",35,262;
	end;
}

moc_fild19,98,99,0		warp	moroccwarp0403		1,1,in_sphinx1,288,9

moc_fild01,379,162,0	warp	moroccwarp0501		2,12,pay_fild04,20,165
moc_fild02,350,339,0	warp	moroccwarp0502		6,2,pay_fild04,194,20
moc_fild03,179,16,0		warp	moroccwarp0503		4,2,pay_fild11,38,327
moc_fild03,303,170,0	warp	moroccwarp0504		2,7,pay_fild01,17,152
moc_fild01,22,242,0		warp	moroccwarp0505		2,2,prt_fild09,380,237
moc_fild01,239,382,0	warp	moroccwarp0506		12,1,prt_fild08,233,20
moc_fild01,56,384,0		warp	moroccwarp0507		3,2,prt_fild08,54,24
moc_fild04,92,381,0		warp	moroccwarp0508		9,2,prt_fild09,246,19
moc_fild05,144,375,0	warp	moroccwarp0509		11,2,prt_fild10,263,23
moc_fild05,325,382,0	warp	moroccwarp0510		6,2,prt_fild09,95,19

// other point
//moc_fild12,35,303,0	warp	moroccwarp0511		3,3,cmd_fild08,331,319
moc_fild18,51,170,0		warp	moroccwarp0512		1,3,cmd_fild09,363,164
moc_fild20,356,179,0	warp	moroccwarp0513		1,1,moc_fild13,38,172
moc_fild20,195,15,0		warp	moroccwarp0514		1,1,moc_fild16,333,375
moc_fild20,209,342,0	warp	moroccwarp0515		1,1,moc_fild01,84,26

moc_fild16,205,296,0	warp	moroccwarp0601		1,1,in_moc_16,18,11

//moc_fild01,68,16,0	warp	moroccwarp5001		15,3,moc_fild04,317,376
//moc_fild01,101,16,0	warp	moroccwarp5002		15,3,moc_fild04,317,376
moc_fild01,84,19,0		warp	moroccwarp5001		1,1,moc_fild20,209,333
moc_fild04,292,381,0	warp	moroccwarp5003		10,1,moc_fild01,76,25
moc_fild04,314,381,0	warp	moroccwarp5004		10,1,moc_fild01,76,25
moc_fild04,336,381,0	warp	moroccwarp5005		10,1,moc_fild01,76,25
moc_fild01,301,16,0		warp	moroccwarp5006		10,1,moc_fild02,77,338
moc_fild01,321,16,0		warp	moroccwarp5007		10,1,moc_fild02,77,338
moc_fild01,341,16,0		warp	moroccwarp5008		10,1,moc_fild02,77,338
moc_fild02,67,342,0		warp	moroccwarp5009		11,3,moc_fild01,315,25
moc_fild02,92,342,0		warp	moroccwarp5010		11,3,moc_fild01,315,25
moc_fild02,228,29,0		warp	moroccwarp5011		4,2,moc_fild13,298,367
moc_fild13,298,370,0	warp	moroccwarp5012		4,2,moc_fild02,228,32
moc_fild02,332,19,0		warp	moroccwarp5013		5,3,moc_fild03,70,336
moc_fild03,70,341,0		warp	moroccwarp5014		5,2,moc_fild02,332,23
moc_fild02,71,18,0		warp	moroccwarp5015		4,2,moc_fild13,146,365
moc_fild13,146,368,0	warp	moroccwarp5016		5,2,moc_fild02,71,21
moc_fild03,17,37,0		warp	moroccwarp5017		2,4,moc_fild13,305,49
moc_fild13,308,49,0		warp	moroccwarp5018		2,4,moc_fild03,20,37
moc_fild04,14,98,0		warp	moroccwarp5019		1,11,moc_fild05,378,119
moc_fild04,14,122,0		warp	moroccwarp5020		1,11,moc_fild05,378,119
moc_fild04,14,146,0		warp	moroccwarp5021		1,11,moc_fild05,378,119
moc_fild05,384,108,0	warp	moroccwarp5022		1,8,moc_fild04,22,123
moc_fild05,384,126,0	warp	moroccwarp5023		1,8,moc_fild04,22,123
moc_fild05,384,144,0	warp	moroccwarp5024		1,8,moc_fild04,22,123
moc_fild04,175,18,0		warp	moroccwarp5025		3,2,moc_fild08,170,380
moc_fild08,170,383,0	warp	moroccwarp5026		3,2,moc_fild04,175,21
moc_fild04,19,206,0		warp	moroccwarp5027		3,15,moc_fild05,373,208
moc_fild05,378,208,0	warp	moroccwarp5028		3,14,moc_fild04,26,206
moc_fild05,18,136,0		warp	moroccwarp5029		1,8,moc_fild06,367,317
moc_fild05,18,154,0		warp	moroccwarp5030		1,8,moc_fild06,367,317
moc_fild05,18,172,0		warp	moroccwarp5031		1,8,moc_fild06,367,317
moc_fild06,377,316,0	warp	moroccwarp5032		1,15,moc_fild05,24,153
moc_fild05,268,18,0		warp	moroccwarp5033		4,2,moc_fild09,267,368
moc_fild09,267,371,0	warp	moroccwarp5034		4,2,moc_fild05,268,21
moc_fild05,82,16,0		warp	moroccwarp5035		5,2,moc_fild09,80,366
moc_fild09,80,369,0		warp	moroccwarp5036		7,2,moc_fild05,82,19
moc_fild06,18,198,0		warp	moroccwarp5037		1,18,moc_fild07,378,201
//moc_fild07,381,201,0	warp	moroccwarp5038		2,16,moc_fild06,28,201
moc_fild07,380,202,0	warp	moroccwarp5038		1,1,moc_fild20,36,177
moc_fild06,207,18,0		warp	moroccwarp5039		11,2,moc_fild10,208,295
moc_fild10,208,298,0	warp	moroccwarp5040		10,2,moc_fild06,207,21
moc_fild08,16,207,0		warp	moroccwarp5041		2,4,moc_fild09,371,195
moc_fild09,374,195,0	warp	moroccwarp5042		2,8,moc_fild08,19,207
moc_fild08,204,16,0		warp	moroccwarp5043		4,2,moc_fild14,196,379
moc_fild14,196,382,0	warp	moroccwarp5044		4,2,moc_fild08,204,19
moc_fild08,383,211,0	warp	moroccwarp5045		2,4,moc_fild13,32,171
//moc_fild13,29,171,0	warp	moroccwarp5046		2,4,moc_fild08,380,211
moc_fild13,32,171,0		warp	moroccwarp5046		1,1,moc_fild20,349,179
moc_fild09,126,20,0		warp	moroccwarp5047		4,2,moc_fild15,158,360
moc_fild15,158,363,0	warp	moroccwarp5048		6,2,moc_fild09,126,23
moc_fild09,30,162,0		warp	moroccwarp5049		2,3,moc_fild10,381,258
moc_fild10,384,258,0	warp	moroccwarp5050		2,3,moc_fild09,33,162
moc_fild10,189,23,0		warp	moroccwarp5051		3,2,moc_fild11,189,360
//moc_fild11,189,363,0	warp	moroccwarp5052		3,2,moc_fild10,189,26
moc_fild11,189,360,0	warp	moroccwarp5052		1,1,moc_fild20,197,24
moc_fild11,212,29,0		warp	moroccwarp5053		4,2,moc_fild17,218,366
moc_fild17,218,369,0	warp	moroccwarp5054		5,2,moc_fild11,212,32
moc_fild11,26,161,0		warp	moroccwarp5055		2,10,moc_fild12,286,168
moc_fild12,289,168,0	warp	moroccwarp5056		2,3,moc_fild11,29,161
//moc_fild11,379,197,0	warp	moroccwarp5057		2,6,moc_fild15,41,105
moc_fild11,377,197,0	warp	moroccwarp5057		1,1,moc_fild20,36,177
moc_fild15,38,105,0		warp	moroccwarp5058		2,4,moc_fild11,376,197
moc_fild12,118,30,0		warp	moroccwarp5059		4,2,moc_fild18,158,379
moc_fild18,158,382,0	warp	moroccwarp5060		4,2,moc_fild12,118,33
moc_fild14,16,278,0		warp	moroccwarp5061		2,6,moc_fild15,364,276
moc_fild15,367,276,0	warp	moroccwarp5062		2,4,moc_fild14,19,278
moc_fild15,104,16,0		warp	moroccwarp5063		9,2,moc_fild16,125,380
//moc_fild16,125,383,0	warp	moroccwarp5064		5,2,moc_fild15,104,19
moc_fild16,124,381,0	warp	moroccwarp5064		1,1,moc_fild20,197,24
moc_fild15,348,18,0		warp	moroccwarp5065		5,2,moc_fild16,334,379
//moc_fild16,334,382,0	warp	moroccwarp5066		4,2,moc_fild15,348,21
moc_fild16,333,380,0	warp	moroccwarp5066		1,1,moc_fild20,197,24
moc_fild16,16,179,0		warp	moroccwarp5067		2,6,moc_fild17,366,272
moc_fild17,369,272,0	warp	moroccwarp5068		2,3,moc_fild16,19,179
moc_fild17,30,300,0		warp	moroccwarp5069		2,5,moc_fild18,379,305
moc_fild18,382,305,0	warp	moroccwarp5070		2,4,moc_fild17,33,300
moc_fild21,26,196,0		warp	moroccwarp5071		1,1,moc_fild20,349,179
moc_fild22,32,196,0		warp	moroccwarp5072		1,1,moc_fild20,349,179



//==============================================================
// ----- Payon フェイヨン -----
// pay_fild01	フェイヨン迷いの森 01 ～ 11
// -----
// payon		山岳の都市フェイヨン
// alberta		港の都市アルベルタ
// moc_fild01	ソクラド砂漠 01 ～ 19
//==============================================================
pay_fild01,333,360,0	warp	payonwarp0101		5,3,payon,122,31
pay_fild08,17,75,0		warp	payonwarp0102		2,4,payon,265,92
pay_fild03,392,63,0		warp	payonwarp0103		2,7,alberta,19,233

// payon field
pay_fild01,13,152,0		warp	payonwarp0501		2,7,moc_fild03,299,170
pay_fild04,17,165,0		warp	payonwarp0502		2,8,moc_fild01,376,162
pay_fild04,194,17,0		warp	payonwarp0503		7,2,moc_fild02,350,336
pay_fild11,38,330,0		warp	payonwarp0504		4,2,moc_fild03,179,19

pay_fild01,278,14,0		warp	payonwarp5001		13,2,pay_fild02,83,382
pay_fild02,83,386,0		warp	payonwarp5002		13,2,pay_fild01,278,18
pay_fild01,353,14,0		warp	payonwarp5003		20,3,pay_fild02,160,381
pay_fild02,167,390,0	warp	payonwarp5004		20,3,pay_fild01,354,18
pay_fild01,379,201,0	warp	payonwarp5005		2,6,pay_fild07,23,207
pay_fild07,16,200,0		warp	payonwarp5006		3,3,pay_fild01,371,205
pay_fild02,134,16,0		warp	payonwarp5007		5,2,pay_fild05,127,375
pay_fild05,127,378,0	warp	payonwarp5008		4,2,pay_fild02,134,19
pay_fild02,16,175,0		warp	payonwarp5009		2,4,pay_fild11,294,135
pay_fild11,297,135,0	warp	payonwarp5010		2,4,pay_fild02,19,175
pay_fild02,284,108,0	warp	payonwarp5011		2,7,pay_fild03,20,110
pay_fild03,15,110,0		warp	payonwarp5012		2,10,pay_fild02,280,108
pay_fild03,172,281,0	warp	payonwarp5013		5,2,pay_fild07,167,20
pay_fild07,163,17,0		warp	payonwarp5014		5,2,pay_fild03,177,275
pay_fild03,313,16,0		warp	payonwarp5015		4,2,pay_fild06,305,372
pay_fild06,305,375,0	warp	payonwarp5016		6,2,pay_fild03,313,19
pay_fild05,271,284,0	warp	payonwarp5017		2,4,pay_fild06,31,288
pay_fild06,28,288,0		warp	payonwarp5018		2,2,pay_fild05,268,284
pay_fild07,280,382,0	warp	payonwarp5019		4,2,pay_fild08,160,19
pay_fild08,160,16,0		warp	payonwarp5020		4,2,pay_fild07,280,379
pay_fild07,382,290,0	warp	payonwarp5021		2,5,pay_fild10,19,290
pay_fild10,16,290,0		warp	payonwarp5022		2,5,pay_fild07,379,290
pay_fild08,262,91,0		warp	payonwarp5023		2,4,pay_fild09,19,91
pay_fild09,16,91,0		warp	payonwarp5024		2,4,pay_fild08,259,91
pay_fild09,112,16,0		warp	payonwarp5025		4,2,pay_fild10,112,379
pay_fild10,112,382,0	warp	payonwarp5026		3,2,pay_fild09,112,19



//==============================================================
// prt_maze01	迷宮の森
// prt_maze02	迷宮の森
// prt_maze03	迷宮の森
// -----
// mjolnir_12	(1st Floor No.16)ミョルニール山脈 12
// prt_fild01	(1st Floor No.20)プロンテラフィールド 01
//==============================================================
// ----- (1st Floor No.03)(1st Floor No.16)(1st Floor No.20)
// 1st Floor No.01 -------------------------------------------------------------
prt_maze01,22,194,0		warp	mazewarp5101		1,1,prt_maze01,16,31	/*To No.1-21*/
prt_maze01,5,186,0		warp	mazewarp5102		1,1,prt_maze01,182,88	/*To No.1-15*/
// 1st Floor No.02
prt_maze01,58,194,0		warp	mazewarp5103		1,1,prt_maze01,23,128	/*To No.1-6*/
// 1st Floor No.03
prt_maze01,102,165,0	warp	mazewarp5104		1,1,prt_maze01,99,31	/*To No.1-23*/
prt_maze01,85,174,0		warp	mazewarp5105		1,1,prt_maze02,93,20
// 1st Floor No.04
prt_maze01,154,181,0	warp	mazewarp5106		1,1,prt_maze01,191,175	/*To No.1-5*/
prt_maze01,125,171,0	warp	mazewarp5107		1,1,prt_maze01,8,186	/*To No.1-1*/
// 1st Floor No.05
prt_maze01,175,165,0	warp	mazewarp5108		1,1,prt_maze01,48,104	/*To No.1-12*/
prt_maze01,194,175,0	warp	mazewarp5109		1,1,prt_maze01,23,128	/*To No.1-6*/
// 1st Floor No.06
prt_maze01,18,154,0		warp	mazewarp5110		1,1,prt_maze01,177,71	/*To No.1-20*/
prt_maze01,23,125,0		warp	mazewarp5111		1,1,prt_maze01,151,22	/*To No.1-24*/
prt_maze01,5,140,0		warp	mazewarp5112		1,1,prt_maze01,58,48	/*To No.1-17*/
// 1st Floor No.07
prt_maze01,54,154,0		warp	mazewarp5113		1,1,prt_maze01,191,175	/*To No.1-5*/
prt_maze01,63,125,0		warp	mazewarp5114		1,1,prt_maze01,182,88	/*To No.1-15*/
// 1st Floor No.08
prt_maze01,98,154,0		warp	mazewarp5115		1,1,prt_maze01,102,168	/*To No.1-3*/
prt_maze01,114,145,0	warp	mazewarp5116		1,1,prt_maze01,23,128	/*To No.1-6*/
prt_maze01,85,146,0		warp	mazewarp5117		1,1,prt_maze01,142,111	/*To No.1-14*/
// 1st Floor No.09
prt_maze01,137,125,0	warp	mazewarp5118		1,1,prt_maze01,191,139	/*To No.1-10*/
prt_maze01,154,134,0	warp	mazewarp5119		1,1,prt_maze01,58,191	/*To No.1-2*/
// 1st Floor No.10
prt_maze01,194,139,0	warp	mazewarp5120		1,1,prt_maze01,22,88	/*To No.1-11*/
prt_maze01,166,139,0	warp	mazewarp5121		1,1,prt_maze01,128,173	/*To No.1-4*/
// 1st Floor No.11
prt_maze01,17,114,0		warp	mazewarp5122		1,1,prt_maze01,8,186	/*To No.1-1*/
prt_maze01,22,85,0		warp	mazewarp5123		1,1,prt_maze01,137,128	/*To No.1-9*/
// 1st Floor No.12
prt_maze01,63,114,0		warp	mazewarp5124		1,1,prt_maze01,111,56	/*To No.1-18*/
prt_maze01,63,85,0		warp	mazewarp5125		1,1,prt_maze01,151,22	/*To No.1-24*/
prt_maze01,74,97,0		warp	mazewarp5126		1,1,prt_maze01,71,11	/*To No.1-22*/
prt_maze01,45,104,0		warp	mazewarp5127		1,1,prt_maze01,63,128	/*To No.1-7*/
// 1st Floor No.13
prt_maze01,105,114,0	warp	mazewarp5128		1,1,prt_maze01,111,145	/*To No.1-8*/
prt_maze01,114,95,0		warp	mazewarp5129		1,1,prt_maze01,14,48	/*To No.1-16*/
prt_maze01,85,97,0		warp	mazewarp5130		1,1,prt_maze01,63,128	/*To No.1-7*/
// 1st Floor No.14
prt_maze01,142,114,0	warp	mazewarp5131		1,1,prt_maze01,23,128	/*To No.1-6*/
prt_maze01,125,105,0	warp	mazewarp5132		1,1,prt_maze01,14,48	/*To No.1-16*/
// 1st Floor No.15
prt_maze01,182,85,0		warp	mazewarp5133		1,1,prt_maze01,58,48	/*To No.1-17*/
prt_maze01,194,94,0		warp	mazewarp5134		1,1,prt_maze01,58,191	/*To No.1-2*/
prt_maze01,168,94,0		warp	mazewarp5135		1,1,prt_maze01,191,139	/*To No.1-10*/
// 1st Floor No.16
prt_maze01,14,74,0		warp	mazewarp5136		1,1,prt_maze01,151,22	/*To No.1-24*/
prt_maze01,14,45,0		warp	mazewarp5137		1,1,mjolnir_12,44,20
prt_maze01,5,58,0		warp	mazewarp5138		1,1,prt_maze01,48,104	/*To No.1-12*/
// 1st Floor No.17
prt_maze01,74,74,0		warp	mazewarp5139		1,1,prt_maze01,58,191	/*To No.1-2*/
prt_maze01,52,45,0		warp	mazewarp5140		1,1,prt_maze01,139,48	/*To No.1-19*/
// 1st Floor No.18
prt_maze01,104,74,0		warp	mazewarp5141		1,1,prt_maze01,14,48	/*To No.1-16*/
prt_maze01,96,45,0		warp	mazewarp5142		1,1,prt_maze01,63,128	/*To No.1-7*/
prt_maze01,114,56,0		warp	mazewarp5143		1,1,prt_maze01,176,8	/*To No.1-25*/
prt_maze01,85,56,0		warp	mazewarp5144		1,1,prt_maze01,105,111	/*To No.1-13*/
// 1st Floor No.19
prt_maze01,137,74,0		warp	mazewarp5145		1,1,prt_maze01,182,88	/*To No.1-15*/
prt_maze01,139,45,0		warp	mazewarp5146		1,1,prt_maze01,71,11	/*To No.1-22*/
// 1st Floor No.20
prt_maze01,177,74,0		warp	mazewarp5147		1,1,prt_fild01,136,368
prt_maze01,175,45,0		warp	mazewarp5148		1,1,prt_maze01,58,48	/*To No.1-17*/
prt_maze01,194,54,0		warp	mazewarp5149		1,1,prt_maze01,99,31	/*To No.1-23*/
// 1st Floor No.21
prt_maze01,16,34,0		warp	mazewarp5150		1,1,prt_maze01,128,173	/*To No.1-4*/
prt_maze01,23,5,0		warp	mazewarp5151		1,1,prt_maze01,176,8	/*To No.1-25*/
// 1st Floor No.22
prt_maze01,54,5,0		warp	mazewarp5152		1,1,prt_maze01,128,173	/*To No.1-4*/
prt_maze01,74,12,0		warp	mazewarp5153		1,1,prt_maze01,58,48	/*To No.1-17*/
prt_maze01,45,21,0		warp	mazewarp5154		1,1,prt_maze01,142,111	/*To No.1-14*/
// 1st Floor No.23
prt_maze01,99,34,0		warp	mazewarp5155		1,1,prt_maze01,137,128	/*To No.1-9*/
prt_maze01,114,22,0		warp	mazewarp5156		1,1,prt_maze01,177,71	/*To No.1-20*/
prt_maze01,85,13,0		warp	mazewarp5157		1,1,prt_maze01,22,88	/*To No.1-11*/
//1st Floor No.24
prt_maze01,154,22,0		warp	mazewarp5158		1,1,prt_maze01,139,48	/*To No.1-19*/
// 1st Floor No.25
prt_maze01,176,34,0		warp	mazewarp5159		1,1,prt_maze01,8,186	/*To No.1-1*/
prt_maze01,176,5,0		warp	mazewarp5160		1,1,prt_maze01,137,128	/*To No.1-9*/
prt_maze01,194,15,0		warp	mazewarp5161		1,1,prt_maze01,52,48	/*To No.1-17*/
prt_maze01,165,22,0		warp	mazewarp5162		1,1,prt_maze01,63,128	/*To No.1-7*/
// 2nd Floor -------------------------------------------------------------------
prt_maze02,93,16,0		warp	mazewarp5201		1,1,prt_maze01,102,168	/*To No.1-3*/
prt_maze02,100,182,0	warp	mazewarp5202		1,1,prt_maze03,182,88	/*To No.3-15*/
// 3rd Floor No.01 -------------------------------------------------------------
prt_maze03,22,194,0		warp	mazewarp5301		1,1,prt_maze03,175,48	/*To No.3-20*/
prt_maze03,5,186,0		warp	mazewarp5302		1,1,prt_maze03,151,134	/*To No.3-9*/
//3rd Floor No.02
prt_maze03,58,194,0		script	#mazewarp5303		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.03
prt_maze03,102,165,0	warp	mazewarp5304		1,1,prt_maze03,137,71	/*To No.3-19*/
prt_maze03,85,174,0		warp	mazewarp5305		1,1,prt_maze03,14,47	/*To No.3-16*/
// 3rd Floor No.04
prt_maze03,154,181,0	warp	mazewarp5306		1,1,prt_maze03,139,48	/*To No.3-19*/
prt_maze03,125,171,0	warp	mazewarp5307		1,1,prt_maze03,105,111	/*To No.3-13*/
// 3rd Floor No.05
prt_maze03,175,165,0	warp	mazewarp5308		1,1,prt_maze03,71,12	/*To No.3-22*/
prt_maze03,194,175,0	warp	mazewarp5309		1,1,prt_maze03,191,139	/*To No.3-10*/
// 3rd Floor No.06
prt_maze03,18,154,0		warp	mazewarp5310		1,1,prt_maze03,48,21	/*To No.3-22*/
prt_maze03,23,125,0		warp	mazewarp5311		1,1,prt_maze03,177,71	/*To No.3-20*/
prt_maze03,5,140,0		warp	mazewarp5312		1,1,prt_maze03,111,56	/*To No.3-18*/
// 3rd Floor No.07
prt_maze03,54,154,0		warp	mazewarp5313		1,1,prt_maze03,142,111	/*To No.3-14*/
prt_maze03,63,125,0		warp	mazewarp5314		1,1,prt_maze03,88,97	/*To No.3-13*/
// 3rd Floor No.08
prt_maze03,98,154,0		warp	mazewarp5315		1,1,prt_maze03,99,31	/*To No.3-23*/
prt_maze03,114,145,0	warp	mazewarp5316		1,1,prt_maze03,168,22	/*To No.3-25*/
prt_maze03,85,146,0		warp	mazewarp5317		1,1,prt_maze03,22,88	/*To No.3-11*/
// 3rd Floor No.09
prt_maze03,137,125,0	warp	mazewarp5318		1,1,prt_maze03,71,71	/*To No.3-17*/
prt_maze03,154,134,0	warp	mazewarp5319		1,1,prt_maze03,8,186	/*To No.3-1*/
// 3rd Floor No.10
prt_maze03,194,139,0	warp	mazewarp5320		1,1,prt_maze03,191,175	/*To No.3-5*/
prt_maze03,166,139,0	warp	mazewarp5321		1,1,prt_maze03,63,88	/*To No.3-12*/
// 3rd Floor No.11
prt_maze03,17,114,0		warp	mazewarp5322		1,1,prt_maze03,128,105	/*To No.3-14*/
prt_maze03,22,85,0		warp	mazewarp5323		1,1,prt_maze03,88,146	/*To No.3-8*/
// 3rd Floor No.12
prt_maze03,63,114,0		warp	mazewarp5324		1,1,prt_maze03,14,71	/*To No.3-16*/
prt_maze03,63,85,0		warp	mazewarp5325		1,1,prt_maze03,169,139	/*To No.3-10*/
prt_maze03,74,97,0		warp	mazewarp5326		1,1,prt_maze03,54,8		/*To No.3-22*/
prt_maze03,45,104,0		warp	mazewarp5327		1,1,prt_maze03,96,48	/*To No.3-18*/
// 3rd Floor No.13
prt_maze03,105,114,0	warp	mazewarp5328		1,1,prt_maze03,128,171	/*To No.3-4*/
prt_maze03,114,95,0		warp	mazewarp5329		1,1,prt_maze03,176,8	/*To No.3-25*/
prt_maze03,85,97,0		warp	mazewarp5330		1,1,prt_maze03,63,128	/*To No.3-7*/
// 3rd Floor No.14
prt_maze03,142,114,0	warp	mazewarp5331		1,1,prt_maze03,54,151	/*To No.3-7*/
prt_maze03,125,105,0	warp	mazewarp5332		1,1,prt_maze03,58,191	/*To No.3-2*/
// 3rd Floor No.15
prt_maze03,182,85,0		warp	mazewarp5333		1,1,prt_maze02,100,179
prt_maze03,194,94,0		warp	mazewarp5334		1,1,prt_maze03,151,22	/*To No.3-24*/
prt_maze03,168,94,0		warp	mazewarp5335		1,1,prt_maze03,191,54	/*To No.3-20*/
// 3rd Floor No.16
prt_maze03,14,74,0		warp	mazewarp5336		1,1,prt_maze03,63,111	/*To No.3-12*/
prt_maze03,14,45,0		warp	mazewarp5337		1,1,prt_maze03,88,174	/*To No.3-3*/
prt_maze03,5,58,0		warp	mazewarp5338		1,1,prt_maze03,191,15	/*To No.3-25*/
// 3rd Floor No.17
prt_maze03,74,74,0		script	#mazewarp5339		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03",54,8;    end;	/*To No.3-22*/
	}
}
prt_maze03,52,45,0		warp	mazewarp5340		1,1,prt_maze03,16,31	/*To No.3-21*/
// 3rd Floor No.18
prt_maze03,104,74,0		warp	mazewarp5341		1,1,prt_maze03,111,22	/*To No.3-23*/
prt_maze03,96,45,0		warp	mazewarp5342		1,1,prt_maze03,48,104	/*To No.3-12*/
prt_maze03,114,56,0		warp	mazewarp5343		1,1,prt_maze03,8,140	/*To No.3-6*/
prt_maze03,85,56,0		warp	mazewarp5344		1,1,prt_maze03,176,31	/*To No.3-25*/
// 3rd Floor No.19
prt_maze03,137,74,0		warp	mazewarp5345		1,1,prt_maze03,102,168	/*To No.3-3*/

prt_maze03,139,45,0		script	#mazewarp5346		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.20
prt_maze03,177,74,0		warp	mazewarp5347		1,1,prt_maze03,23,128	/*To No.3-6*/
prt_maze03,175,45,0		warp	mazewarp5348		1,1,prt_maze03,22,191	/*To No.3-1*/
prt_maze03,194,54,0		warp	mazewarp5349		1,1,prt_maze03,171,94	/*To No.3-15*/
// 3rd Floor No.21
prt_maze03,16,34,0		warp	mazewarp5350		1,1,prt_maze03,52,48	/*To No.3-17*/
prt_maze03,23,5,0		warp	mazewarp5351		1,1,prt_maze03,88,13	/*To No.3-23*/
// 3rd Floor No.22
prt_maze03,54,5,0		warp	mazewarp5352		1,1,prt_maze03,71,97	/*To No.3-12*/
prt_maze03,74,12,0		warp	mazewarp5353		1,1,prt_maze03,175,168	/*To No.3-5*/
prt_maze03,45,21,0		warp	mazewarp5354		1,1,prt_maze03,18,151	/*To No.3-6*/
// 3rd Floor No.23
prt_maze03,99,34,0		warp	mazewarp5355		1,1,prt_maze03,98,151	/*To No.3-8*/
prt_maze03,114,22,0		warp	mazewarp5356		1,1,prt_maze03,104,71	/*To No.3-18*/
prt_maze03,85,13,0		warp	mazewarp5357		1,1,prt_maze03,23,8		/*To No.3-21*/
// 3rd Floor No.24
prt_maze03,154,22,0		script	#mazewarp5358		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.25
prt_maze03,176,34,0		warp	mazewarp5359		1,1,prt_maze03,88,56	/*To No.3-18*/
prt_maze03,176,5,0		warp	mazewarp5360		1,1,prt_maze03,111,95	/*To No.3-13*/
prt_maze03,194,15,0		warp	mazewarp5361		1,1,prt_maze03,8,58		/*To No.3-16*/
prt_maze03,165,22,0		warp	mazewarp5362		1,1,prt_maze03,111,145	/*To No.3-8*/



//==============================================================
// ----- Alberta アルベルタ -----
// alb2trea		沈没船付近の島
// -----
// treasure01	沈没船１層
//==============================================================
alb2trea,88,111,0		warp	albertawarp0401		1,1,treasure01,69,24



//---JP2.0 追加マップ---


//==============================================================
// ----- Comodo コモド -----
// cmd_fild01	パプチカ森
// cmd_fild02	ココモビーチ
// cmd_fild03	ジナイ沼
// cmd_fild04	ココモビーチ
// cmd_fild05	パプチカ森境
// cmd_fild06	サンダルマン要塞 西
// cmd_fild07	ファロス灯台島
// cmd_fild08	サンダルマン要塞 東
// cmd_fild09	サンダルマン要塞 南
// -----
// beach_dun3	東洞窟 マオ
// um_fild03	カララ沼
// moc_fild01	ソクラド砂漠 01 ～ 19
// in_rogue		ローグギルド
//==============================================================
// 東洞窟 マオ
cmd_fild01,26,318,0		warp	comodowarp0401		1,1,beach_dun3,281,56
// カララ沼
cmd_fild01,178,370,0	warp	comodowarp0501		1,1,um_fild03,243,29
cmd_fild01,77,366,0		warp	comodowarp0502		1,1,um_fild03,114,53
// other point
cmd_fild08,354,324,0	warp	comodowarp0503		1,1,moc_fild12,26,305
cmd_fild09,369,164,0	warp	comodowarp0504		2,2,moc_fild18,55,170
// Rogue
cmd_fild07,193,117,0	warp	comodowarp0601		0,0,in_rogue,379,46

cmd_fild01,222,24,0		warp	comodowarp5001		1,1,cmd_fild02,222,372
cmd_fild02,222,376,0	warp	comodowarp5002		1,1,cmd_fild01,222,30
cmd_fild01,362,73,0		warp	comodowarp5003		1,1,cmd_fild03,27,68
cmd_fild03,23,68,0		warp	comodowarp5004		1,1,cmd_fild01,359,76
cmd_fild01,362,263,0	warp	comodowarp5005		1,1,cmd_fild03,27,269
cmd_fild03,23,269,0		warp	comodowarp5006		1,1,cmd_fild01,359,260
cmd_fild02,358,95,0		warp	comodowarp5007		1,1,cmd_fild04,35,94
cmd_fild04,31,92,0		warp	comodowarp5008		1,1,cmd_fild02,351,92
cmd_fild02,382,269,0	warp	comodowarp5009		1,1,cmd_fild04,25,275
cmd_fild04,21,275,0		warp	comodowarp5010		1,1,cmd_fild02,378,264
cmd_fild03,181,17,0		warp	comodowarp5011		1,1,cmd_fild04,181,367
cmd_fild04,180,372,0	warp	comodowarp5012		1,1,cmd_fild03,183,23
cmd_fild03,384,165,0	warp	comodowarp5013		1,1,cmd_fild05,26,161
cmd_fild05,21,163,0		warp	comodowarp5014		1,1,cmd_fild03,377,167
cmd_fild04,376,287,0	warp	comodowarp5015		1,1,cmd_fild06,26,288
cmd_fild06,21,285,0		warp	comodowarp5016		1,1,cmd_fild04,371,288
cmd_fild05,148,19,0		warp	comodowarp5017		1,1,cmd_fild06,150,374
cmd_fild06,150,380,0	warp	comodowarp5018		1,1,cmd_fild05,146,27
cmd_fild06,151,27,0		warp	comodowarp5019		1,1,cmd_fild07,147,370
cmd_fild07,149,379,0	warp	comodowarp5020		10,1,cmd_fild06,147,36
cmd_fild06,368,96,0		warp	comodowarp5021		1,1,cmd_fild08,25,102
cmd_fild08,15,102,0		warp	comodowarp5022		1,1,cmd_fild06,361,96
cmd_fild06,372,359,0	warp	comodowarp5023		1,1,cmd_fild08,31,359
cmd_fild08,25,355,0		warp	comodowarp5024		1,1,cmd_fild06,369,359
cmd_fild06,379,174,0	warp	comodowarp5025		1,1,cmd_fild08,28,166
cmd_fild08,25,170,0		warp	comodowarp5026		1,1,cmd_fild06,374,167
cmd_fild07,389,186,0	warp	comodowarp5027		1,3,cmd_fild09,18,170
cmd_fild09,12,170,0		warp	comodowarp5028		1,4,cmd_fild07,382,184
cmd_fild08,76,31,0		warp	comodowarp5029		2,1,cmd_fild09,76,375
cmd_fild09,75,382,0		warp	comodowarp5030		2,1,cmd_fild08,75,42
cmd_fild08,309,48,0		warp	comodowarp5031		2,1,cmd_fild09,307,374
cmd_fild09,309,381,0	warp	comodowarp5032		2,1,cmd_fild08,309,60
cmd_fild08,335,355,0	warp	comodowarp5033		1,1,anthell01,35,263
cmd_fild08,348,82,0		warp	comodowarp5034		1,1,anthell02,168,170



//---JP2.5 追加マップ---


//---JP3.0 追加マップ---


//==============================================================
// ----- Yuno ジュノー -----
// yuno_fild01	国境検問所
// yuno_fild02	キルハイルの別荘
// yuno_fild03	エルメスプレート
// yuno_fild04	エルメスプレート
// -----
// aldebaran	国境都市アルデバラン
// yuno 		シュバルツバルド共和国の首都ジュノー
// mag_dun01	ノーグロード 1層
//==============================================================
yuno_fild01,208,18,0	warp	yunowarp0101		1,1,aldebaran,140,239
yuno_fild04,231,288,0	warp	yunowarp0102		1,1,yuno,158,16

yuno_fild03,32,139,0	warp	yunowarp0401		1,1,mag_dun01,126,69

//YunoFild01⇔YunoFild02
//yuno_fild01,70,378,0	warp	yunowarp5001		1,1,yuno_fild02,70,27
//yuno_fild02,70,23,0	warp	yunowarp5002		1,1,yuno_fild01,70,375
//yuno_fild01,286,368,0	warp	yunowarp5003		1,1,yuno_fild02,294,28
//yuno_fild02,294,24,0	warp	yunowarp5004		1,1,yuno_fild01,286,365
//YunoFild02⇔YunoFild03
yuno_fild02,18,337,0	warp	yunowarp5005		1,1,yuno_fild03,379,331
yuno_fild03,383,331,0	warp	yunowarp5006		1,1,yuno_fild02,22,337
//YunoFild03⇔YunoFild04
yuno_fild03,21,162,0	warp	yunowarp5007		1,1,yuno_fild04,371,147
yuno_fild04,374,149,0	warp	yunowarp5008		1,1,yuno_fild03,25,162
yuno_fild03,20,79,0		warp	yunowarp5009		1,1,yuno_fild04,370,81
yuno_fild04,374,82,0	warp	yunowarp5010		1,1,yuno_fild03,24,79



//---アマツ追加マップ---


//==============================================================
// ----- Amatsu アマツ -----
// ama_fild01	アマツフィールド
// -----
// amatsu		泉水の国アマツ
// ama_in01		アマツ 室内
//==============================================================
ama_fild01,75,30,0		warp	amatsuwarp0101		1,1,amatsu,248,289
ama_fild01,174,331,0	warp	amatsuwarp0102		1,1,ama_in01,175,174
ama_fild01,330,141,0	warp	amatsuwarp0103		1,1,ama_in01,174,124



//---コンロン追加マップ---


//==============================================================
// ----- Gonryun コンロン -----
// gon_fild01	コンロンフィールド
// -----
// gonryun		神仙の島コンロン
//==============================================================
gon_fild01,192,266,0	warp	gonryunwarp0101		1,1,gonryun,161,11



//---ウンバラ追加マップ


//==============================================================
// ----- Umbala ウンバラ -----
// um_fild01	ルルカ森
// um_fild02	フムガ森
// um_fild03	カララ沼
// um_fild04	フムガジャングル
// -----
// umbala		ウータン族の村ウンバラ
// beach_dun2	北洞窟 ルワンダ
// cmd_fild01	パプチカ森
//==============================================================
um_fild04,215,339,0		warp	umbalawarp0101		1,1,umbala,130,82

um_fild01,31,274,0		warp	umbalawarp0401		1,1,beach_dun2,255,244

um_fild03,243,26,0		warp	umbalawarp0501		1,1,cmd_fild01,176,367
um_fild03,114,50,0		warp	umbalawarp0502		1,1,cmd_fild01,74,363

//ルルカ森 ⇔ フムガ森
um_fild01,369,277,0		warp	umbalawarp5001		1,1,um_fild02,25,272
um_fild02,22,272,0		warp	umbalawarp5002		1,1,um_fild01,366,277
//カララ沼 ⇔ フムガ森(上)
um_fild03,19,334,0		warp	umbalawarp5003		1,1,um_fild02,370,329
um_fild02,373,329,0		warp	umbalawarp5004		1,1,um_fild03,23,334
//カララ沼 ⇔ フムガ森(下)
um_fild03,32,145,0		warp	umbalawarp5005		1,1,um_fild02,370,148
um_fild02,373,148,0		warp	umbalawarp5006		1,1,um_fild03,36,145
//フムガ森 ⇔ フムガジャングル
um_fild02,188,374,0		warp	umbalawarp5007		1,1,um_fild04,182,16
um_fild04,182,13,0		warp	umbalawarp5008		1,1,um_fild02,190,371



//---ニブルヘイム追加マップ


//==============================================================
// ----- フベルゲルミルの泉 -----
// yggdrasil01	フベルゲルミルの泉(イグドラシルの幹)
// -----
// um_dun02		深奥の密林
// nif_fild01	秘境の村
//==============================================================
//yggdrasil01,36,63,0	warp	yggdrasiwarp0401	1,1,um_dun02,126,147
yggdrasil01,248,259,0	warp	yggdrasiwarp0501	1,1,nif_fild01,315,67

//yggdrasil01
yggdrasil01,270,52,0	warp	yggdrasiwarp5001	1,1,yggdrasil01,30,196
yggdrasil01,27,195,0	warp	yggdrasiwarp5002	1,1,yggdrasil01,267,56



//==============================================================
// ----- Niflheimg ニブルヘイム -----
// nif_fild01	秘境の村
// nif_fild02	ギョル渓谷
// -----
// niflheim		死者の街ニブルヘイム
// yggdrasil01	フベルゲルミルの泉(イグドラシルの幹)
//==============================================================
nif_fild02,378,235,0	warp	niflheimwarp0101	1,1,niflheim,23,154
//nif_fild01,315,63,0	warp	niflheimwarp0501	1,1,yggdrasil01,245,259

nif_fild01,344,322,0	warp	niflheimwarp5001	1,1,nif_fild02,26,311
nif_fild02,22,311,0		warp	niflheimwarp5002	1,1,nif_fild01,340,322



//---龍之城追加マップ


//==============================================================
// ----- Louyang 龍之城 -----
// lou_fild01	龍之城フィールド
// -----
// louyang		古都 龍之城
//==============================================================
lou_fild01,233,356,0	warp	louyangwarp0101		2,1,louyang,218,22



//---神器クエスト追加マップ


//---アユタヤ追加マップ


//==============================================================
// ----- Ayothaya アユタヤ -----
// ayo_fild01	アユタヤフィールド
// ayo_fild02	アユタヤフィールド
// -----
//==============================================================
ayo_fild01,32,240,0		warp	ayothayawarp0101	1,1,ayothaya,273,176

ayo_fild02,285,150,0	warp	ayothayawarp0501	1,1,ayo_dun01,275,18




//---アルデバランターボトラック追加マップ


//---鋼鉄の都市アインブロック追加マップ


//==============================================================
// ----- Einbroch アインブロック -----
// -- ジュノーフィールド追加マップ --
// yuno_fild05	エルメスプレート
// yuno_fild07	エルメス峡谷 深淵の谷間
// yuno_fild08	キルハイル学校
// yuno_fild09	シュバルツバルド警備隊野営地
// yuno_fild11	ジュノーフィールド
// yuno_fild12	国境検問所
// ein_fild06	アインブロックフィールド
// ein_fild07	アインブロックフィールド
// ein_fild08	アインブロックフィールド
// ein_fild09	アインブロックフィールド
// ein_fild10	アインブロックフィールド
// -----
// einbroch		鋼鉄の都市アインブロック
// einbech		採鉱の村アインベフ
// yuno_fild04	エルメスプレート
//==============================================================
ein_fild08,164,380,0	warp	einbrochwarp0101	2,2,einbroch,150,28
ein_fild09,71,352,0		warp	einbrochwarp0102	2,2,einbech,62,32

//YunoFild01⇔YunoFild09
yuno_fild01,70,377,0	warp	einbrochwarp5001	1,1,yuno_fild09,70,21
yuno_fild09,70,18,0		warp	einbrochwarp5002	1,1,yuno_fild01,70,374
yuno_fild01,287,367,0	warp	einbrochwarp5003	1,1,yuno_fild09,280,32
yuno_fild09,280,29,0	warp	einbrochwarp5004	1,1,yuno_fild01,287,364
//YunoFild01⇔YunoFild12
yuno_fild01,26,246,0	warp	einbrochwarp5005	1,1,yuno_fild12,366,244
yuno_fild12,369,244,0	warp	einbrochwarp5006	1,1,yuno_fild01,31,248
//YunoFild02⇔YunoFild08
yuno_fild02,69,22,0		warp	einbrochwarp5007	1,1,yuno_fild08,75,372
yuno_fild08,75,375,0	warp	einbrochwarp5008	1,1,yuno_fild02,69,25
yuno_fild02,287,16,0	warp	einbrochwarp5009	1,1,yuno_fild08,285,382
yuno_fild08,285,385,0	warp	einbrochwarp5010	1,1,yuno_fild02,290,20
//YunoFild03⇔YunoFild07
yuno_fild03,178,15,0	warp	einbrochwarp5011	1,1,yuno_fild07,179,351
yuno_fild07,179,354,0	warp	einbrochwarp5012	1,1,yuno_fild03,178,18
//YunoFild04⇔YunoFild05
yuno_fild04,42,370,0	warp	einbrochwarp5013	1,1,yuno_fild05,61,33
yuno_fild05,61,29,0		warp	einbrochwarp5014	1,1,yuno_fild04,42,366
//YunoFild07⇔YunoFild08
yuno_fild07,360,72,0	warp	einbrochwarp5015	1,1,yuno_fild08,35,61
yuno_fild08,31,58,0		warp	einbrochwarp5016	1,1,yuno_fild07,357,75
yuno_fild07,352,292,0	warp	einbrochwarp5017	1,1,yuno_fild08,27,275
yuno_fild08,24,275,0	warp	einbrochwarp5018	1,1,yuno_fild07,348,288
//YunoFild07⇔YunoFild11
yuno_fild07,92,28,0		warp	einbrochwarp5019	1,1,yuno_fild11,91,369
yuno_fild11,91,372,0	warp	einbrochwarp5020	1,1,yuno_fild07,92,31
//YunoFild08⇔YunoFild09
yuno_fild08,375,194,0	warp	einbrochwarp5021	1,1,yuno_fild09,23,193
yuno_fild09,20,193,0	warp	einbrochwarp5022	1,1,yuno_fild08,372,194
//YunoFild08⇔YunoFild12
yuno_fild08,134,29,0	warp	einbrochwarp5023	1,1,yuno_fild12,197,371
yuno_fild12,193,372,0	warp	einbrochwarp5024	1,1,yuno_fild08,134,33
//YunoFild11⇔YunoFild12
yuno_fild11,364,218,0	warp	einbrochwarp5025	1,1,yuno_fild12,26,230
yuno_fild12,23,226,0	warp	einbrochwarp5026	1,1,yuno_fild11,361,218
yuno_fild11,368,361,0	warp	einbrochwarp5027	1,1,yuno_fild12,27,336
yuno_fild12,23,339,0	warp	einbrochwarp5028	1,1,yuno_fild11,364,356
//EinFild06⇔YunoFild04
ein_fild06,251,365,0	warp	einbrochwarp5029	1,1,yuno_fild04,249,25
yuno_fild04,249,22,0	warp	einbrochwarp5030	1,1,ein_fild06,251,362
//EinFild06⇔YunoFild07
ein_fild06,355,95,0		warp	einbrochwarp5031	1,1,yuno_fild07,60,79
yuno_fild07,57,79,0		warp	einbrochwarp5032	1,1,ein_fild06,352,95
ein_fild06,335,176,0	warp	einbrochwarp5033	1,1,yuno_fild07,76,220
yuno_fild07,73,220,0	warp	einbrochwarp5034	1,1,ein_fild06,332,176
//EinFild06⇔EinFild07
ein_fild06,135,36,0		warp	einbrochwarp5035	1,1,ein_fild07,147,359
ein_fild07,144,362,0	warp	einbrochwarp5036	1,1,ein_fild06,135,39
//EinFild07⇔YunoFild11
ein_fild07,381,264,0	warp	einbrochwarp5037	1,1,yuno_fild11,31,266
yuno_fild11,28,266,0	warp	einbrochwarp5038	1,1,ein_fild07,378,264
//EinFild07⇔EinFild10
ein_fild07,183,43,0		warp	einbrochwarp5039	1,1,ein_fild10,196,368
ein_fild10,196,371,0	warp	einbrochwarp5040	1,1,ein_fild07,179,46
//EinFild08⇔EinFild09
ein_fild08,361,129,0	warp	einbrochwarp5041	1,1,ein_fild09,37,135
ein_fild09,34,135,0		warp	einbrochwarp5042	1,1,ein_fild08,358,130
//EinFild09⇔EinFild10
ein_fild09,328,344,0	warp	einbrochwarp5043	1,1,ein_fild10,28,330
ein_fild10,25,330,0		warp	einbrochwarp5044	1,1,ein_fild09,325,344



//---企業都市リヒタルゼン追加マップ


//==============================================================
// -----  リヒタルゼン -----
// ein_fild03	アインブロックフィールド
// ein_fild04	アインブロックフィールド
// lhz_fild01	リヒタルゼンフィールド
// lhz_fild02	リヒタルゼンフィールド(死神の渓谷)
// lhz_fild03	リヒタルゼンフィールド
// -----
// lighthalzen	企業都市リヒタルゼン
// ein_fild08	アインブロックフィールド
//==============================================================
//アインブロックフィールド04⇒アインブロック
ein_fild04,184,26,0		warp	lighthalzenwarp0101	1,1,einbroch,157,327
//リヒタルゼンフィールド01⇒企業都市リヒタルゼン
lhz_fild01,210,18,0		warp	lighthalzenwarp0102	1,1,lighthalzen,214,327

//アインブロックフィールド03⇒アインブロックフィールド04
ein_fild03,361,204,0	warp	lighthalzenwarp5003	1,1,ein_fild04,19,205
ein_fild04,14,205,0		warp	lighthalzenwarp5004	1,1,ein_fild03,355,204
ein_fild03,361,219,0	warp	lighthalzenwarp5005	1,1,ein_fild04,19,215
ein_fild04,14,215,0		warp	lighthalzenwarp5006	1,1,ein_fild03,355,219
ein_fild03,363,257,0	warp	lighthalzenwarp5007	1,1,ein_fild04,26,251
ein_fild04,22,250,0		warp	lighthalzenwarp5008	1,1,ein_fild03,357,261
//アインブロックフィールド03⇒リヒタルゼンフィールド02(死神の渓谷)
ein_fild03,142,32,0		warp	lighthalzenwarp5009	1,1,lhz_fild02,163,360
lhz_fild02,166,366,0	warp	lighthalzenwarp5010	1,1,ein_fild03,142,40
//アインブロックフィールド08⇒Lリヒタルゼンフィールド03
ein_fild08,23,275,0		warp	lighthalzenwarp5011	1,1,lhz_fild03,357,284
lhz_fild03,364,282,0	warp	lighthalzenwarp5012	1,1,ein_fild08,29,276
//リヒタルゼンフィールド01⇒リヒタルゼンフィールド02(死神の渓谷)
lhz_fild01,367,222,0	warp	lighthalzenwarp5013	1,1,lhz_fild02,36,221
lhz_fild02,29,219,0		warp	lighthalzenwarp5014	1,1,lhz_fild01,361,222
//リヒタルゼンフィールド02(死神の渓谷)⇒リヒタルゼンフィールド03
lhz_fild02,164,37,0		warp	lighthalzenwarp5015	1,1,lhz_fild03,158,343
lhz_fild03,158,350,0	warp	lighthalzenwarp5016	1,1,lhz_fild02,164,44



//---ノーグハルト追加マップ


//==============================================================
// -----  ノーグハルト -----
// yuno_fild06	エレメスプレート
// hu_fild01	タナトスタワー
// hu_fild04	フィゲルフィールド
// hu_fild05	アビスレイク
// hu_fild07	フィゲルフィールド
// -----
// yuno_fild02	エレメスプレート
// yuno_fild03	エレメスプレート
// yuno_fild05	エレメスプレート
// yuno_fild09	シュバルツバルド警備隊野営地
//==============================================================
//ジュノーフィールド06⇔ジュノーフィールド05
yuno_fild06,41,319,0	warp	noghaltwarp5001	1,1,yuno_fild05,366,319
yuno_fild05,370,321,0	warp	noghaltwarp5002	1,1,yuno_fild06,48,322
//ジュノーフィールド06⇔ジュノーフィールド03
yuno_fild06,214,27,0	warp	noghaltwarp5003	1,1,yuno_fild03,215,375
yuno_fild03,215,382,0	warp	noghaltwarp5004	1,1,yuno_fild06,218,33
//フィゲルフィールド01⇔ジュノーフィールド06
hu_fild01,141,36,0		warp	noghaltwarp5005	1,1,yuno_fild06,156,368
yuno_fild06,151,370,0	warp	noghaltwarp5006	1,1,hu_fild01,135,42
//フィゲルフィールド04⇔ジュノーフィールド06
hu_fild04,27,126,0		warp	noghaltwarp5007	1,1,yuno_fild06,362,132
yuno_fild06,369,132,0	warp	noghaltwarp5008	1,1,hu_fild04,34,126
//フィゲルフィールド04⇔ジュノーフィールド02
hu_fild04,122,27,0		warp	noghaltwarp5009	1,1,yuno_fild02,114,370
yuno_fild02,117,375,0	warp	noghaltwarp5010	1,1,hu_fild04,122,35
//フィゲルフィールド04⇔フィゲルフィールド05
hu_fild04,380,183,0		warp	noghaltwarp5011	1,1,hu_fild05,39,206
hu_fild05,33,198,0		warp	noghaltwarp5012	1,1,hu_fild04,373,181
//フィゲルフィールド05⇔フィゲルフィールド07
hu_fild05,89,43,0		warp	noghaltwarp5013	1,1,hu_fild07,80,365
hu_fild07,81,370,0		warp	noghaltwarp5014	1,1,hu_fild05,89,50
//フィゲルフィールド07⇔ジュノーフィールド02
hu_fild07,36,352,0		warp	noghaltwarp5015	1,1,yuno_fild02,378,336
yuno_fild02,383,339,0	warp	noghaltwarp5016	1,1,hu_fild07,42,351
//フィゲルフィールド07⇔ジュノーフィールド09
hu_fild07,57,37,0		warp	noghaltwarp5017	1,1,yuno_fild09,48,370
yuno_fild09,48,376,0	warp	noghaltwarp5018	1,1,hu_fild07,58,42
hu_fild07,226,38,0		warp	noghaltwarp5019	1,1,yuno_fild09,220,368
yuno_fild09,220,373,0	warp	noghaltwarp5020	1,1,hu_fild07,224,43



//---田園都市フィゲル追加マップ


//==============================================================
// -----  フィゲル -----
// hu_fild01	フィゲルフィールド01
// hu_fild02	フィゲルフィールド02
// hu_fild03	フィゲルフィールド03
// hu_fild04	フィゲルフィールド04
// hu_fild05	フィゲルフィールド05
// hu_fild06	フィゲルフィールド06
// hu_fild07	フィゲルフィールド07
// -----
// odin_tem01	オーディン神殿
// odin_tem02	オーディン神殿
// odin_tem03	オーディン神殿
// -----
// ein_fild01	アインブロックフィールド01
// ein_fild02	アインブロックフィールド02
// ein_fild05	アインブロックフィールド05
// -----
// yuno_fild06	ジュノーフィールド06
//==============================================================
hu_fild06,200,372,0		warp	hugelwarp0101	1,1,hugel,95,37

//フィゲルフィールド01⇔フィゲルフィールド02
hu_fild01,366,185,0		warp	hugelwarp5001	1,1,hu_fild02,22,168
hu_fild02,17,168,0		warp	hugelwarp5002	1,1,hu_fild01,361,189
//フィゲルフィールド02⇔フィゲルフィールド03
hu_fild02,378,162,0		warp	hugelwarp5003	1,1,hu_fild03,30,163
hu_fild03,25,163,0		warp	hugelwarp5004	1,1,hu_fild02,373,160
hu_fild02,374,339,0		warp	hugelwarp5005	1,1,hu_fild03,24,337
hu_fild03,20,338,0		warp	hugelwarp5006	1,1,hu_fild02,370,339
//フィゲルフィールド02⇔フィゲルフィールド04
hu_fild02,40,22,0		warp	hugelwarp5007	1,1,hu_fild04,48,368
hu_fild04,47,372,0		warp	hugelwarp5008	1,1,hu_fild02,40,27
hu_fild02,283,28,0		warp	hugelwarp5009	1,1,hu_fild04,289,376
hu_fild04,294,379,0		warp	hugelwarp5010	1,1,hu_fild02,280,31
//フィゲルフィールド03⇔フィゲルフィールド05
hu_fild03,288,19,0		warp	hugelwarp5011	1,1,hu_fild05,276,346
hu_fild05,284,356,0		warp	hugelwarp5012	1,1,hu_fild03,288,26
//フィゲルフィールド05⇔フィゲルフィールド06
hu_fild05,353,126,0		warp	hugelwarp5013	1,1,hu_fild06,34,119
hu_fild06,28,119,0		warp	hugelwarp5014	1,1,hu_fild05,347,130

//ジュノーフィールド04⇔アインブロックフィールド02
yuno_fild04,33,279,0	warp	hugelwarp5015	1,1,ein_fild02,350,250
ein_fild02,357,251,0	warp	hugelwarp5016	1,1,yuno_fild04,38,280
//ジュノーフィールド05⇔アインブロックフィールド01
yuno_fild05,41,350,0	warp	hugelwarp5017	1,1,ein_fild01,345,367
ein_fild01,349,369,0	warp	hugelwarp5018	1,1,yuno_fild05,43,346
//ジュノーフィールド09⇔ジュノーフィールド10
yuno_fild09,377,184,0	warp	hugelwarp5019	1,1,yuno_fild10,44,183
yuno_fild10,39,183,0	warp	hugelwarp5020	1,1,yuno_fild09,371,184

//アインブロックフィールド01⇔アインブロックフィールド02
ein_fild01,106,34,0		warp	hugelwarp5021	1,1,ein_fild02,109,358
ein_fild02,108,364,0	warp	hugelwarp5022	1,1,ein_fild01,106,40
ein_fild01,234,34,0		warp	hugelwarp5023	1,1,ein_fild02,258,343
ein_fild02,257,350,0	warp	hugelwarp5024	1,1,ein_fild01,231,40
//アインブロックフィールド02⇔アインブロックフィールド05
ein_fild02,170,29,0		warp	hugelwarp5025	1,1,ein_fild05,172,366
ein_fild05,172,371,0	warp	hugelwarp5026	1,1,ein_fild02,170,37
//アインブロックフィールド04⇔アインブロックフィールド05
ein_fild04,343,293,0	warp	hugelwarp5027	1,1,ein_fild05,80,294
ein_fild05,76,294,0		warp	hugelwarp5028	1,1,ein_fild04,336,292
//アインブロックフィールド05⇔アインブロックフィールド06
ein_fild05,376,183,0	warp	hugelwarp5029	1,1,ein_fild06,47,166
ein_fild06,42,171,0		warp	hugelwarp5030	1,1,ein_fild05,371,183
//アインブロックフィールド01⇔アインブロックフィールド05
ein_fild01,106,34,0		warp	hugelwarp5031	1,1,ein_fild05,172,366
ein_fild05,172,371,0	warp	hugelwarp5032	1,1,ein_fild01,106,40

//==============================================================
//オーディン神殿01⇔オーディン神殿02
odin_tem01,377,182,0	warp	odinwarp5001	1,1,odin_tem02,28,180
odin_tem02,21,180,0		warp	odinwarp5002	1,1,odin_tem01,373,182
odin_tem01,383,334,0	warp	odinwarp5003	1,1,odin_tem02,27,334
odin_tem02,21,334,0		warp	odinwarp5004	1,1,odin_tem01,379,334
//オーディン神殿02⇔オーディン神殿03
odin_tem02,153,349,0	warp	odinwarp5005	1,1,odin_tem03,120,54
odin_tem03,121,49,0		warp	odinwarp5006	1,1,odin_tem02,154,345
odin_tem02,261,377,0	warp	odinwarp5007	1,1,odin_tem03,247,40
odin_tem03,247,34,0		warp	odinwarp5008	1,1,odin_tem02,263,372



//---ラヘル追加マップ


//==============================================================
// -----  ラヘル -----
// rachel		アルナベルツ教国首都 ラヘル
// ra_fild01	アウドムラ草原
// ra_fild02	オズ狭谷
// ra_fild03	イダ平原
// ra_fild04	アウドムラ草原
// ra_fild05	アウドムラ草原
// ra_fild06	ポルトルナ
// ra_fild07	オズ狭谷
// ra_fild08	イダ平原
// ra_fild09	アウドムラ草原
// ra_fild10	オズ狭谷
// ra_fild11	イダ平原
// ra_fild12	イダ平原
// ra_fild13	涙の海岸
// lhz_fild01	リヒタルゼンフィールド
// -----
// ice_dun01	氷の洞窟
//==============================================================
//ラヘルフィールド 11⇒アルナベルツ教国首都 ラヘル
ra_fild11,360,226,0		warp	rachelwarp0101	1,1,rachel,30,125
//ラヘルフィールド 12⇒アルナベルツ教国首都 ラヘル
ra_fild12,36,225,0		warp	rachelwarp0102	1,1,rachel,270,125

//ラヘルフィールド 01⇒氷の洞窟 01
ra_fild01,233,333,0		warp	rachelwarp0401	1,1,ice_dun01,157,15

//ラヘルフィールド 01⇔ラヘルフィールド 04
ra_fild01,306,38,0		warp	rachelwarp5001	1,1,ra_fild04,322,371
ra_fild04,322,378,0		warp	rachelwarp5002	1,1,ra_fild01,306,43
//ラヘルフィールド 02⇔ラヘルフィールド 03
ra_fild02,373,275,0		warp	rachelwarp5003	1,1,ra_fild03,28,294
ra_fild03,23,294,0		warp	rachelwarp5004	1,1,ra_fild02,367,270
//ラヘルフィールド 02⇔ラヘルフィールド 07
ra_fild02,168,36,0		warp	rachelwarp5005	1,1,ra_fild07,168,349
ra_fild07,168,353,0		warp	rachelwarp5006	1,1,ra_fild02,171,45
//ラヘルフィールド 03⇔ラヘルフィールド 04
ra_fild03,374,168,0		warp	rachelwarp5007	1,1,ra_fild04,29,176
ra_fild04,23,176,0		warp	rachelwarp5008	1,1,ra_fild03,370,172
//ラヘルフィールド 04⇔ラヘルフィールド 05
ra_fild04,362,351,0		warp	rachelwarp5009	1,1,ra_fild05,39,353
ra_fild05,33,353,0		warp	rachelwarp5010	1,1,ra_fild04,356,351
//ラヘルフィールド 04⇔ラヘルフィールド 08
ra_fild04,263,54,0		warp	rachelwarp5011	1,1,ra_fild08,287,365
ra_fild08,287,370,0		warp	rachelwarp5012	1,1,ra_fild04,263,60
//ラヘルフィールド 05⇔ラヘルフィールド 06
ra_fild05,348,274,0		warp	rachelwarp5013	1,1,ra_fild06,24,277
ra_fild06,19,277,0		warp	rachelwarp5014	1,1,ra_fild05,341,273
//ラヘルフィールド 05⇔ラヘルフィールド 09
ra_fild05,27,13,0		warp	rachelwarp5015	1,1,ra_fild09,30,337
ra_fild09,29,343,0		warp	rachelwarp5016	1,1,ra_fild05,31,17
//ラヘルフィールド 06⇔リヒタルゼンフィールド 01
ra_fild06,294,21,0		warp	rachelwarp5017	1,1,lhz_fild01,296,376
lhz_fild01,296,382,0	warp	rachelwarp5018	1,1,ra_fild06,298,25
//ラヘルフィールド 07⇔ラヘルフィールド 11
ra_fild07,215,27,0		warp	rachelwarp5019	1,1,ra_fild11,201,329
ra_fild11,202,335,0		warp	rachelwarp5020	1,1,ra_fild07,215,32
//ラヘルフィールド 08⇔ラヘルフィールド 09
ra_fild08,368,234,0		warp	rachelwarp5021	1,1,ra_fild09,35,238
ra_fild09,27,238,0		warp	rachelwarp5022	1,1,ra_fild08,360,234
//ラヘルフィールド 08⇔ラヘルフィールド 12
ra_fild08,165,29,0		warp	rachelwarp5023	1,1,ra_fild12,149,369
ra_fild12,149,374,0		warp	rachelwarp5024	1,1,ra_fild08,165,36
//ラヘルフィールド 10⇔ラヘルフィールド 11
ra_fild10,384,287,0		warp	rachelwarp5025	1,1,ra_fild11,28,290
ra_fild11,21,290,0		warp	rachelwarp5026	1,1,ra_fild10,379,283
//ラヘルフィールド 12⇔ラヘルフィールド 13
ra_fild12,303,27,0		warp	rachelwarp5027	1,1,ra_fild13,295,341
ra_fild13,295,346,0		warp	rachelwarp5028	1,1,ra_fild12,303,33



//---ベインス追加マップ


//==============================================================
// -----  ベインス -----
// ve_fild01	ベインスフィールド 01
// ve_fild02	ベインスフィールド 02
// ve_fild03	ベインスフィールド 03
// ve_fild04	ベインスフィールド 04
// ve_fild05	ベインスフィールド 05
// ve_fild06	ベインスフィールド 06
// ve_fild07	ベインスフィールド 07
// -----
// veins		峡谷都市ベインス
// rachel		アルナベルツ教国首都 ラヘル
// ra_fild11	イダ平原
// ra_fild13	涙の海岸
// thor_v01		トール火山ダンジョン 01
//==============================================================
//ベインスフィールド 06⇒峡谷都市ベインス
ve_fild06,153,220,0		warp	veinswarp0101	1,1,veins,218,355
//ベインスフィールド 07⇒峡谷都市ベインス
ve_fild07,147,371,0		warp	veinswarp0102	1,1,veins,146,28
//ベインスフィールド 02⇒アルナベルツ教国首都 ラヘル
ve_fild02,195,382,0		warp	veinswarp0103	1,1,rachel,130,25

//ベインスフィールド 03⇒トール火山ダンジョン 01
ve_fild03,168,240,0		warp	veinswarp0401	1,1,thor_v01,21,229

//ベインスフィールド 01⇔ラヘルフィールド 11
ve_fild01,243,368,0		warp	veinswarp5001	1,1,ra_fild11,232,32
ra_fild11,233,27,0		warp	veinswarp5002	1,1,ve_fild01,243,363
//ベインスフィールド 01⇔ベインスフィールド 02
ve_fild01,366,267,0		warp	veinswarp5003	1,1,ve_fild02,36,263
ve_fild02,31,263,0		warp	veinswarp5004	1,1,ve_fild01,361,267
ve_fild01,350,92,0		warp	veinswarp5005	1,1,ve_fild02,78,133
ve_fild02,73,133,0		warp	veinswarp5006	1,1,ve_fild01,345,92
//ベインスフィールド 01⇔ベインスフィールド 04
ve_fild01,184,20,0		warp	veinswarp5007	1,1,ve_fild04,174,334
ve_fild04,174,339,0		warp	veinswarp5008	1,1,ve_fild01,184,25
//ベインスフィールド 02⇔ラヘルフィールド 13
ve_fild02,385,308,0		warp	veinswarp5009	1,1,ra_fild13,34,308
ra_fild13,29,308,0		warp	veinswarp5010	1,1,ve_fild02,184,25
//ベインスフィールド 03⇔ベインスフィールド 04
ve_fild03,355,223,0		warp	veinswarp5011	1,1,ve_fild04,49,249
ve_fild04,44,249,0		warp	veinswarp5012	1,1,ve_fild03,350,220
//ベインスフィールド 03⇔ベインスフィールド 05
ve_fild03,222,43,0		warp	veinswarp5013	1,1,ve_fild05,200,325
ve_fild05,200,330,0		warp	veinswarp5014	1,1,ve_fild03,222,48
//ベインスフィールド 04⇒ベインスフィールド 06
ve_fild04,115,50,0		warp	veinswarp5015	1,1,ve_fild06,80,183
//ベインスフィールド 05⇒ベインスフィールド 06
ve_fild05,359,192,0		warp	veinswarp5016	1,1,ve_fild06,80,183
//ベインスフィールド 06⇒ベインスフィールド 04・05
ve_fild06,81,177,0		script	#veinswarp5017	45,1,1,{
	if(rand(2)) warp "ve_fild04",115,55;
	else warp "ve_fild05",354,191;
	end;
}



//---モスコビア追加マップ


//==============================================================
// -----  モスコビア -----
// mosk_fild02	モスコビアフィールド
// -----
// mosk_dun01	森
//==============================================================
//モスコビアフィールド⇒森
mosk_fild02,190,257,0	warp	moscoviawarp0401	1,1,mosk_dun01,189,45



//---魔王モロク追加マップ


//==============================================================
// -----  洞窟の村 -----
// ein_fild01	アインブロックフィールド01
// -----
// cave		洞窟の村
//==============================================================
//アインブロックフィールド01⇒洞窟の村
ein_fild01,28,261,0	warp	cavewarp0101	1,1,cave,97,24



//---アッシュ・バキューム追加マップ


//==============================================================
// -----  鉱山の街 マヌク  -----
// man_fild01	マヌクフィールド 01
// man_fild02	マヌクフィールド 02
// man_fild03	マヌクフィールド 03
// -----
// mid_camp		ミッドガルド連合軍駐屯地
// manuk		鉱山の街 マヌク
//==============================================================
//マヌクフィールド 01⇒ミッドガルド連合軍駐屯地
man_fild01,35,232,0		warp	manukwarp0101	1,1,mid_camp,341,176
//マヌクフィールド 02⇒鉱山の街 マヌク
man_fild02,139,41,0		warp	manukwarp0102	1,1,manuk,112,356

//マヌクフィールド 01⇔マヌクフィールド 03
man_fild01,103,55,0		warp	manukwarp5001	1,1,man_fild03,84,366
man_fild03,84,369,0		warp	manukwarp5002	1,1,man_fild01,103,58
//マヌクフィールド 01⇔マヌクフィールド 02
man_fild01,372,230,0	warp	manukwarp5003	1,1,man_fild02,34,261
man_fild02,32,261,0		warp	manukwarp5004	1,1,man_fild01,369,230


//==============================================================
// -----  前線基地 スプレンディッド  -----
// spl_fild01	スプレンディッドフィールド 01
// spl_fild02	スプレンディッドフィールド 02
// spl_fild03	スプレンディッドフィールド 03
// -----
// mid_camp		ミッドガルド連合軍駐屯地
// splendide	前線基地 スプレンディッド
//==============================================================
//スプレンディッドフィールド 02⇒ミッドガルド連合軍駐屯地
spl_fild02,382,143,0	warp	splendidewarp0101	1,1,mid_camp,16,143
spl_fild02,383,216,0	warp	splendidewarp0102	1,1,mid_camp,12,215
//スプレンディッドフィールド 02⇒前線基地 スプレンディッド
spl_fild02,6,241,0		warp	splendidewarp0103	1,1,splendide,386,251

//スプレンディッドフィールド 02⇔スプレンディッドフィールド 03
spl_fild02,310,10,0		warp	splendidewarp5001	1,1,spl_fild03,306,376
spl_fild03,306,379,0	warp	splendidewarp5002	1,1,spl_fild02,311,12
spl_fild02,103,30,0		warp	splendidewarp5003	1,1,spl_fild03,99,370
spl_fild03,99,373,0		warp	splendidewarp5004	1,1,spl_fild02,102,32
//スプレンディッドフィールド 01⇔スプレンディッドフィールド 02
spl_fild01,289,28,0		warp	splendidewarp5005	1,1,spl_fild02,292,377
spl_fild02,293,379,0	warp	splendidewarp5006	1,1,spl_fild01,289,30



//---ブラジリス追加マップ


//==============================================================
// -----  ブラジリス  -----
// bra_fild01	ブラジリスフィールド 01
// -----
// brasilis		ブラジリス
//==============================================================
//ブラジリスフィールド 01⇒ブラジリス
bra_fild01,72,34,0		warp	brasiliswarp0101	1,1,brasilis,309,334



//---エルディカスティス追加マップ


//==============================================================
// -----  エルディカスティス -----
// dic_fild01	カミダル山麓 01
// dic_fild02	カミダル山麓 02
// -----
// dic_dun01	カミダルトンネル
//==============================================================
//カミダル山麓 01⇒カミダルトンネル
dic_fild01,24,79,0		warp	dicasteswarp0401	1,1,dic_dun01,366,45

//カミダル山麓 01⇔カミダル山麓 02
dic_fild01,69,23,0		warp	dicasteswarp5001	1,1,dic_fild02,70,373
dic_fild02,71,375,0		warp	dicasteswarp5002	1,1,dic_fild01,69,25



//---デワタ追加マップ


//==============================================================
// -----  デワタ -----
// dew_fild01	デワタフィールド 01
// -----
// dewata		デワタ
// dew_in01		デワタ 室内
// dew_dun02	イスタナ洞窟
//==============================================================
//デワタフィールド 01⇒デワタ
dew_fild01,375,212,0	warp	dewatawarp0101	1,1,dewata,46,251
//デワタフィールド 01⇒デワタ 室内
dew_fild01,57,273,0		warp	dewatawarp0102	1,1,dew_in01,15,33

//デワタフィールド 01⇒イスタナ洞窟
dew_fild01,48,65,0		warp	dewatawarp0401	1,1,dew_dun02,302,30



//---ビフロスト追加マップ


//==============================================================
// -----  ビフロスト -----
// bif_fild01	ビフロストフィールド 01
// bif_fild02	ビフロストフィールド 02
// -----
// splendide	前線基地 スプレンディッド
// ecl_fild01	花が咲き始めた大地
//==============================================================
//ビフロストフィールド 01⇒前線基地 スプレンディッド
bif_fild01,318,48,0		warp	bifrostwarp0101	1,1,splendide,270,378

//ビフロストフィールド 02⇒花が咲き始めた大地
bif_fild02,292,351,0	warp	bifrostwarp0501	1,1,ecl_fild01,205,76



//---ポートマラヤ追加マップ


//==============================================================
// -----  ポートマラヤ -----
// ma_fild01	バリオ・マヒワガ
// ma_fild02	バリオ・フォレスト
// -----
// malaya		ポートマラヤ
// ma_in01		ポートマラヤ 室内
// ma_in01_jp	ポートマラヤ 室内
// ma_scene01	バコナワ湖
// ma_c_jp		ブワヤの洞窟
//==============================================================
//バリオ・マヒワガ⇒ポートマラヤ
ma_fild01,37,272,0		warp	malayawarp0101	1,1,malaya,367,277
//バリオ・マヒワガ⇒ポートマラヤ 室内
ma_fild01,251,190,0		warp	malayawarp0102	1,1,ma_in01,108,160
ma_fild01,160,219,0		warp	malayawarp0103	1,1,ma_in01_jp,83,17
ma_fild01,262,212,0		warp	malayawarp0104	1,1,ma_in01_jp,36,152

//バリオ・マヒワガ⇒バコナワ湖
ma_fild01,288,52,0		warp	malayawarp0401	1,1,ma_scene01,142,78
//バリオ・フォレスト⇒ブワヤの洞窟
ma_fild02,315,323,0		warp	malayawarp0402	1,1,ma_c_jp,31,56

//バリオ・マヒワガ⇔バリオ・フォレスト
ma_fild01,266,359,0		warp	malayawarp5001	1,1,ma_fild02,248,36
ma_fild02,248,33,0		warp	malayawarp5002	1,1,ma_fild01,266,356



//---エクラージュ追加マップ


//==============================================================
// -----  エクラージュ -----
// ecl_fild01	花が咲き始めた大地
// -----
// ecl_tdun01		ビフロストタワー 1階
// bif_fild02		ビフロストフィールド 02
//==============================================================
//花が咲き始めた大地⇒ビフロストタワー 1階
ecl_fild01,182,82,0	warp	eclagewarp0401	1,1,ecl_tdun01,60,13

//花が咲き始めた大地⇒ビフロストフィールド 02
ecl_fild01,207,72,0	warp	eclagewarp0501	1,1,bif_fild02,294,350



//---ラザーニャ追加マップ


//==============================================================
// -----  ラザーニャ -----
// lasa_fild01	ラビオル平原 01
// lasa_fild02	ラビオル森 01
// -----
// lasagna		港町ラザーニャ
// lasa_dun01	龍の巣 01
//==============================================================
//ラビオル平原 01⇒港町ラザーニャ
lasa_fild01,134,381,0	warp	lasagnawarp0101	2,2,lasagna,153,58
lasa_fild01,341,375,0	warp	lasagnawarp0102	2,2,lasagna,327,56
//ラビオル森 01⇒港町ラザーニャ
lasa_fild02,16,98,0		warp	lasagnawarp0103	2,2,lasagna,355,92

//ラビオル森 01⇒龍の巣 01
lasa_fild02,348,244,0	warp	lasagnawarp0401	2,2,lasa_dun01,24,143



//---ロックリッジ追加マップ


//==============================================================
// -----  ロックリッジ -----
// rockrdg1	キワワ砂漠 01
// rockrdg2	キワワ砂漠 02
// -----
// harboro1	ロックリッジ
//==============================================================
//キワワ砂漠 01⇒ロックリッジ
rockrdg1,33,246,0	warp	rockwarp0101	1,1,harboro1,358,206

//キワワ砂漠 01⇔キワワ砂漠 01
rockrdg1,371,206,0	warp	rockwarp5001	1,1,rockrdg2,31,207
rockrdg2,27,207,0	warp	rockwarp5002	1,1,rockrdg1,367,206
