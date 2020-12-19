//= Auriga Script ==============================================================
// Ragnarok Online Niflheim Monster Spawn Script　　Ep 15.2
//==============================================================================

//============================================================
// 死者の街ニブルヘイム - niflheim
//------------------------------------------------------------
niflheim,0,0,0,0	monster	キューブ	1508,75,5000,0,0
niflheim,0,0,0,0	monster	ルード	1509,75,5000,0,0

niflheim,0,0,0	script	#NifMVP	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer7980000:
	switch(rand(7)) {
	case 0:
		monster "niflheim",327,193,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",330,193,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",324,193,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",327,196,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",327,190,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",324,190,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",330,190,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",324,196,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",330,196,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 1:
		monster "niflheim",337,252,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",337,255,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",337,249,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",334,252,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",340,252,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",334,249,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",340,255,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",340,249,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",334,255,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 2:
		monster "niflheim",190,185,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",190,188,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",190,182,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",193,185,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",187,185,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",187,182,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",193,182,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",193,188,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",187,188,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 3:
		monster "niflheim",131,138,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",131,141,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",131,135,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",128,138,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",134,138,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",134,141,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",128,141,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",134,135,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",128,135,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 4:
		monster "niflheim",311,64,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",311,67,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",311,61,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",308,64,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",314,64,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",314,61,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",314,67,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",308,67,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",308,61,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 5:
		monster "niflheim",238,131,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",238,134,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",238,128,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",235,131,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",241,131,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",235,128,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",235,134,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",241,128,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",241,134,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	case 6:
		monster "niflheim",86,219,"ロードオブデス",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim",86,222,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",86,216,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",89,219,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",83,219,"ブラッディマーダー",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim",89,222,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",89,216,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",83,222,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim",83,216,"ロリルリ",1505,1,"#NifMVP::OnKilled2";
		break;
	}
	monster "niflheim",154,95,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",115,65,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",330,195,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",151,83,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",285,245,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",235,135,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",265,48,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",186,139,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",166,267,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",82,202,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",219,44,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",287,44,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",275,165,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",138,204,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",299,39,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",31,154,"ディスガイズ",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim",154,96,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",116,65,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",151,84,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",286,245,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",330,196,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",236,135,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",165,49,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",167,267,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",82,203,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",220,44,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",287,45,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",287,44,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",276,166,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",139,205,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",300,39,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim",31,155,"デュラハン",1504,1,"#NifMVP::OnKilled2";
	stopnpctimer;
	end;
OnKilled1:
	killmonster "niflheim","#NifMVP::OnKilled2";
	initnpctimer;
	end;
OnKilled2:
	end;	//ダミーイベント
}
