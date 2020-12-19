//= Athena Script ==============================================================
// Ragnarok Online Turbo Track Script     by Blaze
//==============================================================================

//============================================================
// 建物外NPC
//------------------------------------------------------------
alde_gld,178,180,5	script	案内板	837,{
	mes "[アルデバランターボトラック]";
	mes "こちらは、アルデバラン";
	mes "ターボトラックです。";
	next;
	mes "[アルデバランターボトラック]";
	mes "ターボトラックは、多彩なコースを";
	mes "くぐり抜け、ゴールまでより早く";
	mes "辿り着くことを競う競技場です。";
	next;
	mes "[アルデバランターボトラック]";
	mes "競技では、多種多様なコースや仕掛けが";
	mes "選手たちを待ち構えています。";
	mes "よろしければ、一度挑戦してみて";
	mes "ください。";
	close;
}

alde_gld,186,199,3	script	入場係	845,{
	mes "[入場係]";
	mes "こんにちは～。";
	mes "アルデバランターボトラックへ";
	mes "ようこそ～。";
	next;
	mes "[入場係]";
	mes "アルデバランターボトラックでは";
	mes "ペコペコに乗っていらっしゃる方の";
	mes "ご入場は禁止しております。";
	next;
	mes "[入場係]";
	mes "ペコペコに乗っていらっしゃる場合は、";
	mes "入り口でペコペコを引き取らせて";
	mes "頂きます。その際は";
	mes "「ペコペコ無料利用券」を";
	mes "お渡ししますので、そちらを";
	mes "後でご利用ください。";
	next;
	mes "[入場係]";
	mes "それでは、ターボトラックを";
	mes "お楽しみください。";
	close;
}

alde_gld,181,199,5	script	ペコペコ管理係	845,{
	if(getskilllv(63)) {
		mes "[ペコペコ管理係]";
		mes "いらっしゃいませ～。";
		mes "ペコペコを引き取りに";
		mes "いらっしゃったのですね～。";
		mes "2,500Zeny、または";
		mes "「ペコペコ無料利用券」が";
		mes "必要になりますが、お持ちですか～？";
		next;
		if(select("はい、ペコペコに乗ります","いや、やっぱりやめます")==2) {
			mes "[ペコペコ管理係]";
			mes "競技にまた参加されるのですか～。";
			mes "優勝できるとよいですね～。";
			close;
		}
		if(checkriding()) {
			mes "[ペコペコ管理係]";
			mes "既にペコペコがいるじゃないですか～。";
			mes "ご自分の姿をもう一度見てください～。";
			close;
		}
		if(countitem(7310) < 1 && Zeny < 2500) {
			mes "[ペコペコ管理係]";
			mes "お～っと、利用券もお金も";
			mes "ないじゃないですか～。";
			mes "サービスのご利用には、その分の";
			mes "代価をきちんと払ってくださいよ～。";
			close;
		}
		if(countitem(7310)) 
			delitem 7310,1;
		else
			set Zeny,Zeny-2500;
		setriding;
		mes "[ペコペコ管理係]";
		mes "ご利用ありがとうございました～。";
		close;
	}
	mes "[ペコペコ管理係]";
	mes "アルデバランターボトラックへの";
	mes "ご来場ありがとうございます～。";
	close;
}

alde_gld,183,204,0	script	turbowarp1001	45,1,1,{
	if(checkitemblank() == 0) {
		mes "‐所持アイテムの種類数が";
		mes "多いため、アイテムを受けとる";
		mes "ことができません。";
		mes "所持アイテムを減らしてから";
		mes "再度お越しください。‐";
		close;
	}
	if(checkriding()) {
		mes "[入場係]";
		mes "申し訳ありませんが、ペコペコを";
		mes "引き取らせて頂きます。";
		mes "「ペコペコ無料利用券」を";
		mes "お渡ししますので、そちらを";
		mes "後でご利用ください。";
		close2;
		setoption 0x0000;
		getitem 7310,1;
	}
	if(sc_ison(SC_ALL_RIDING)) {
		mes "[入場係]";
		mes "申し訳ありませんが、";
		mes "騎乗生物に乗って入場することは";
		mes "禁止させていただいております。";
		close;
	}
	warp "turbo_room",100,65;
	end;
}

//============================================================
// 控え室NPC
//------------------------------------------------------------
turbo_room,100,62,0	warp	turbowarp1002	1,1,alde_gld,183,198

turbo_room,124,86,7	shop	ターボトラック商人	90,501:-1,502:-1,503:-1,504:-1,645:-1,656:-1,1065:-1,1750:-1

turbo_room,130,91,3	script	カプラ職員	115,{
	cutin "kafra_03",2;
	mes "[カプラ職員]";
	mes "いらっしゃいませ";
	mes "カプラサービスは";
	mes "いつも皆様のそばにいます。";
	next;
	mes "[カプラ職員]";
	mes "こちらでの位置セーブは";
	mes "アルデバランに保存されます。";
	mes "ご了承ください。";
	mes "何をお手伝いいたしましょう？";
	next;
	switch(select("位置セーブサービス","倉庫サービス","カプラポイント確認","終了")) {
	case 1:
		savepoint "aldebaran",167,112;
		mes "[カプラ職員]";
		mes "セーブしました。";
		mes "ご利用ありがとうございます。";
		break;
	case 2:
		callfunc "KafraStorage",40;
		break;
	case 3:
		mes "[カプラ職員]";
		mes strcharinfo(0)+ "様の獲得ポイントは、";
		mes KAFRA_PIT+ "点です。";
		next;
		mes "[カプラ職員]";
		mes "カプラポイントは当カプラサービスの";
		mes "本社で賞品と引き換えが可能です。";
		mes "今後ともカプラサービスをよろしく";
		mes "お願い致します。";
		break;
	case 4:
		mes "[カプラ職員]";
		mes "我々カプラサービスは、より完璧な";
		mes "サービスと管理業務を目指し";
		mes "お客様が安心してご利用いただけるよう";
		mes "いつも最善を尽くしています。";
		mes "（株）カプラサービスをご利用いただき";
		mes "ありがとうございました。";
		break;
	}
	close2;
	cutin "kafra_03",255;
	end;
}

turbo_room,75,95,5	script	1人モード記録板#turbo	857,{
	mes "[1人モードの最短記録保持者]";
	mes " ";
	mes "最強と呼ばれるその名は、";
	mes " ";
	mes "^4D4DFF"+ $TurboNameN$[0] +"^000000!!";
	mes " ";
	mes "さあ、君もここに名を刻もう!!";
	close;
}

turbo_room,77,115,5	duplicate(1人モード記録板#turbo)	1人モード記録板	857

turbo_room,67,95,5	script	一般モード優勝者リスト#	857,{
	mes "[一般モードの優勝者リスト最新版]";
	for(set .@i,1; .@i<=3; set .@i,.@i+1) {
		mes "一般・" +(2<<.@i)+ "人モードの優勝者";
		mes "^4D4DFF"+ $TurboNameN$[.@i] +"^000000";
	}
	close;
}

turbo_room,87,114,5	duplicate(一般モード優勝者リスト#)	一般モード優勝者リスト	857

turbo_room,71,95,5	script	熟練モード優勝者リスト#	857,{
	mes "[熟練モードの優勝者リスト最新版]";
	for(set .@i,1; .@i<=3; set .@i,.@i+1) {
		mes "熟練・" +(2<<.@i)+ "人モードの優勝者";
		mes "^4D4DFF"+ $TurboNameE$[.@i] +"^000000";
	}
	close;
}

turbo_room,112,114,3	duplicate(熟練モード優勝者リスト#)	熟練モード優勝者リスト	857

turbo_room,102,117,3	script	名誉の殿堂	857,{
	mes "[アルデバランターボトラック";
	mes " 　　　　　　　　名誉の殿堂]";
	mes "一人目：";
	mes "^4A4AFF"+ $TurboGreat$[1] +"^000000";
	mes " ";
	mes "二人目：";
	mes "^4A4AFF"+ $TurboGreat$[2] +"^000000";
	close;
}

turbo_room,97,117,5	script	常勝メンバー	857,{
	mes "[ターボトラック最多優勝者]";
	mes " ";
	for(set .@i,1; .@i<=5; set .@i,.@i+1)
		mes .@i+ "位：^4D4DFF"+ $TurboTop$[.@i] +"^000000";
	close;
}

turbo_room,99,120,3	script	ターボトラックガイド	124,{
	mes "[ターボトラックガイド]";
	mes "ターボトラックのご案内をしましょう。";
	mes "何をお知りになりたいですか?";
	next;
	while(1) {
		switch(select("ルール","各コース","各モード","特にありません")) {
		case 1:
			mes "[ターボトラックガイド]";
			mes "ルールは簡単です。";
			mes "障害物を乗り越えて、できるだけ早く";
			mes "ゴールに辿り着けばよいのです。";
			next;
			mes "[ターボトラックガイド]";
			mes "但し、選手の方々の身には";
			mes "様々な状況が発生いたします。";
			mes "けれども、具体的に何が起きるかは";
			mes "申し上げることはできません。";
			mes "ご了承ください。";
			next;
			mes "[ターボトラックガイド]";
			mes "ナイトやロードナイト、クルセイダー、";
			mes "パラディンの様に、ペコペコに";
			mes "乗っていらっしゃる方々は、";
			mes "事前にペコペコから降りてください。";
			mes "ペコペコへの騎乗は、";
			mes "競技終了後にお願いします。";
			next;
			mes "[ターボトラックガイド]";
			mes "一番最初にゴールに";
			mes "辿り着いた方が優勝となります。";
			mes "誰かがゴールインした時点で";
			mes "競技は終了となり、全員、";
			mes "自動的に控え室へ転送されます。";
			next;
			mes "[ターボトラックガイド]";
			mes "また、競技開始後、";
			mes "一定時間が経過すると";
			mes "優勝者が確定しなくても競技は終了し、";
			mes "全員脱落とされます。";
			mes "円滑な試合進行のためのルールですので";
			mes "ご了承ください。";
			next;
			mes "[ターボトラックガイド]";
			mes "参加に際して、";
			mes "職業の制限はございませんが、";
			mes "BaseLv10以上の方が対象となります。";
			mes "また、参加時に入場料として";
			mes "1000Zenyが必要です。";
			next;
			mes "[ターボトラックガイド]";
			mes "競技方法に関する案内は";
			mes "以上になります。";
			mes "他に何か知りたいことはございますか？";
			next;
			continue;
		case 2:
			mes "[ターボトラックガイド]";
			mes "コースに関してご案内をします。";
			mes "先にターボトラックの全体構成について";
			mes "ご説明しましょう。";
			next;
			mes "[ターボトラックガイド]";
			mes "ターボトラックは、";
			mes "^4A4AFF丸太橋、箱の丘、";
			mes "呪いと混乱の砂漠、暗黒の迷路、";
			mes "かたつむり、蛇の道、";
			mes "小さな洞窟、見えない迷路等で";
			mes "構成されています。^000000";
			next;
			mes "[ターボトラックガイド]";
			mes "コースの構成にはモード別の差が";
			mes "多少ありますが、基本的には";
			mes "スタート地点とゴール地点を除く";
			mes "計7種類のコースで構成されています。";
			mes "各コースの詳細をご説明しましょう。";
			next;
			while(1) {
				switch(select("丸太橋、箱の丘とは？","呪いと混乱の砂漠、暗黒の迷路とは？","かたつむり、見えない迷路とは？","蛇の道、小さな洞窟とは？","説明はいりません")) {
				case 1:
					mes "[ターボトラックガイド]";
					mes "丸太橋という言葉通り、競技の";
					mes "最初のコースは丸太の橋を渡ります。";
					mes "誤って落ちてしまった場合は";
					mes "最初から渡り直しとなります。";
					mes "早く、注意深く渡ることを";
					mes "心がけるとよいでしょう。";
					next;
					mes "[ターボトラックガイド]";
					mes "箱の丘は言葉通り、";
					mes "箱が積み上げられて形成された丘です。";
					mes "箱を乗り越えれば、次のコースへ";
					mes "進むことができます。";
					mes "あまり難しくはないと思います。";
					next;
					continue;
				case 2:
					mes "[ターボトラックガイド]";
					mes "呪いと混乱の砂漠は、砂漠を";
					mes "通過すればよいのですが……";
					mes "どんなことが起こるかは、";
					mes "予測できません。";
					mes "まさにその名のごとく、呪いと混乱が";
					mes "あふれていますからね。";
					next;
					mes "[ターボトラックガイド]";
					mes "暗黒の迷路は、罠が";
					mes "設置されている複雑な迷路です。";
					mes "ジグザグな水路の中に、どんな";
					mes "罠が仕掛けられているかは、";
					mes "私でも分かりません。";
					next;
					continue;
				case 3:
					mes "[ターボトラックガイド]";
					mes "かたつむりは、かたつむりの皮の様に";
					mes "グルグルと回る細道のコースです。";
					mes "特に落とし穴みたいな物は";
					mes "ありませんので、";
					mes "早く走り抜ければよいです。";
					mes "でも、とても走りづらいですけどね。";
					next;
					mes "[ターボトラックガイド]";
					mes "見えない迷路は、広いコースです。";
					mes "出口まで走り抜けるだけで";
					mes "よいのですが、見えない壁が道を";
					mes "塞いでいます。競技中に与えられる";
					mes "ヒントを参考にしてください。";
					mes "まさに見えない迷路ですからね";
					next;
					continue;
				case 4:
					mes "[ターボトラックガイド]";
					mes "蛇の道は、まるで蛇の様に";
					mes "曲がりくねった道です。";
					mes "どうしてサイコロで";
					mes "構成されているのかって？　それは、";
					mes "サイコロのような偶然に秘められた";
					mes "幸運が、道に隠されているからです。";
					next;
					mes "[ターボトラックガイド]";
					mes "どういう意味かを詳しく知りたければ、";
					mes "直接体験してみてください。";
					next;
					mes "[ターボトラックガイド]";
					mes "小さな洞窟は、フェイヨンのどこかに";
					mes "あると言われている洞窟のダンジョンを";
					mes "そっくり再現した物です。";
					mes "ダンジョンを探検するつもりで、";
					mes "楽しんでください。";
					next;
					continue;
				case 5:
					mes "[ターボトラックガイド]";
					mes "分かりました。";
					mes "コースに関する説明は、";
					mes "大丈夫なようですね。";
					next;
					mes "[ターボトラックガイド]";
					mes "他に何か知りたいことは";
					mes "ございますか？";
					next;
					break;
				}
				break;
			}
			break;
		case 3:
			mes "[ターボトラックガイド]";
			mes "各競技モードについて";
			mes "ご案内しましょう。";
			mes "競技は一般モード、熟練モード、";
			mes "1人モードの3種類あります。";
			next;
			mes "[ターボトラックガイド]";
			mes "いずれも一部、使用が制限される";
			mes "スキルがあります。また一般モードと";
			mes "異なり、^4A4AFF熟練モードは他選手に";
			mes "対しての攻撃も可能^000000です。";
			mes "パーティーやギルド対抗戦を";
			mes "行うのにちょうどよいでしょう。";
			next;
			mes "[ターボトラックガイド]";
			mes "それから各モード中、";
			mes "^0000FF1、16人用競技場のみ、";
			mes "見えない迷路が追加^000000されます。";
			mes "4人用、8人用には、";
			mes "このコースはございません。";
			mes "あらかじめご了承ください。";
			next;
			mes "[ターボトラックガイド]";
			mes "なお、1人モードには";
			mes "全てのコースが含まれています。";
			mes "ここでは、1番早くクリアした方の";
			mes "名前が記録されます。";
			mes "皆さんも新記録に";
			mes "挑戦してみてください。";
			next;
			continue;
		case 4:
			mes "[ターボトラックガイド]";
			mes "説明はもう十分ですか？";
			mes "楽しい一時を過ごせるといいですね。";
			mes "ありがとうございました。";
			close;
		}
	}
}

turbo_room,93,117,5	script	景品交換員	125,{
	if(checkitemblank() == 0) {
		mes "‐所持アイテムの種類数が";
		mes "多いため、アイテムを受けとる";
		mes "ことができません。";
		mes "所持アイテムを減らしてから";
		mes "再度話しかけてください。‐";
		close;
	}
	if(TURBO_POINT >= 10) {
		mes "[景品交換員]";
		mes "こんにちは。";
		mes strcharinfo(0) +"様の";
		mes "ターボトラックポイントは";
		mes TURBO_POINT +"点です。";
		mes "景品と交換しますか？";
		next;
		if(select("交換する","やめる")==2) {
			mes "[景品交換員]";
			mes "ターボトラックポイントは、";
			mes "アリーナポイントに";
			mes "交換することもできます。";
			mes "もちろん、アリーナポイントを";
			mes "ターボトラックポイントに";
			mes "交換することも可能です。";
			next;
			mes "[景品交換員]";
			mes "ターボトラックポイントの";
			mes "積み立て限界は、^4A4AFF29,000^000000点です。";
			mes "それ以上は、いくらゴールなさっても";
			mes "ポイントは加算されません。";
			mes "ポイントは随時、ご使用ください。";
			close;
		}
		mes "[景品交換員]";
		mes "では、お手持ちの";
		mes "ターボトラックポイントを";
		mes "考慮された上で、景品を";
		mes "お選びください。";
		next;
		switch(select("空間移動無料利用券","Lv5スクロール","経験値","ターボトラックコイン","速度変化ポーション","古く青い箱","古い紫色の箱","古いカード帖","やっぱり、やめておく")) {
		case 1:
			set .@point,10;
			set .@max,50;
			set .@itemid,7060;
			break;
		case 2:
			mes "[景品交換員]";
			mes "Lv5スクロールですね。";
			mes "Lv5スクロール1個につき";
			mes "^4A4AFF12点^000000必要です。";
			mes "どのスクロールと交換しますか？";
			mes "なお、こちらのスクロールで使用できる";
			mes "スキルは全てLv5になります。";
			next;
			set .@itemid,685+(2*select("アーススパイク","コールドボルト","ファイアーボルト","ライトニングボルト",
				"ソウルストライク","ファイアーボール","ファイアーウォール","フロストダイバー","ヒール"));
			if(.@itemid > 700)
				set .@itemid,.@itemid+11299;
			set .@point,12;
			set .@max,50;
			break;
		case 3:
			mes "[景品交換員]";
			mes "経験値ですね。";
			mes "交換には40点必要です。";
			mes "交換しますか？";
			next;
			if(select("やめておく","交換する")==1) {
				mes "[景品交換員]";
				mes "取り消しました。";
				close;
			}
			if(TURBO_POINT < 40) {
				mes "[景品交換員]";
				mes "ターボトラックポイントが足りません。";
				mes "お手持ちのポイント数を";
				mes "確認なさってからお越しください。";
				close;
			}
			set TURBO_POINT,TURBO_POINT-40;
			if(BaseLevel >= 90) 			getexp 30000,0;
			if(BaseLevel >= 80 && BaseLevel < 90) 	getexp 10000,0;
			if(BaseLevel >= 70 && BaseLevel < 80) 	getexp 9000,0;
			if(BaseLevel < 70) 			getexp 3000,0;
			mes "[景品交換員]";
			mes "ターボトラックポイントを";
			mes "経験値に交換しました。";
			close;
		case 4:
			mes "[景品交換員]";
			mes "ターボトラックコインですね。";
			mes "ターボトラックコイン 1枚につき";
			mes "^3131FF60点^000000必要です。";
			next;
			mes "[景品交換員]";
			mes "もし取り消す場合は、";
			mes "「0」とおっしゃってください。";
			mes "ターボトラックコイン何枚と";
			mes "交換しますか？";
			next;
			input .@num;
			if(.@num == 0) {
				mes "[景品交換員]";
				mes "取り消しました。";
				close;
			}
			if(.@num < 0) {
				mes "[景品交換員]";
				mes "数が正しくないようです。";
				close;
			}
			if(TURBO_POINT < .@num*60) {
				mes "[景品交換員]";
				mes "ターボトラックポイントが足りません。";
				mes "お手持ちのポイント数を";
				mes "確認なさってからお越しください。";
				close;
			}
			set TURBO_POINT,TURBO_POINT-.@num*60;
			getitem 6366,.@num;
			mes "[景品交換員]";
			mes "ご利用ありがとうございました。";
			close;
		case 5:
			set .@point,100;
			set .@max,10;
			set .@itemid,12016;
			break;
		case 6:
			set .@point,100;
			set .@max,10;
			set .@itemid,603;
			break;
		case 7:
			set .@point,300;
			set .@max,10;
			set .@itemid,617;
			break;
		case 8:
			mes "[景品交換員]";
			mes "古いカード帖ですね。";
			mes "古いカード帖 1冊につき";
			mes "^3131FF1000点^000000必要です。";
			next;
			mes "[景品交換員]";
			mes "一度に交換できるのは、";
			mes "10個までとなります。";
			mes "もし取り消す場合は、";
			mes "「0」とおっしゃってください。";
			mes "古いカード帖何冊と";
			mes "交換しますか？";
			next;
			input .@num;
			if(.@num == 0) {
				mes "[景品交換員]";
				mes "取り消しました。";
				close;
			}
			if(.@num < 0 || .@num > .@max) {
				mes "[景品交換員]";
				mes "交換可能個数を超えています。一度に";
				mes "交換できるのは10個までとなります。";
				close;
			}
			if(TURBO_POINT < .@num*1000) {
				mes "[景品交換員]";
				mes "ターボトラックポイントが足りません。";
				mes "お手持ちのポイント数を";
				mes "確認なさってからお越しください。";
				close;
			}
			set TURBO_POINT,TURBO_POINT-.@num*1000;
			getitem 616,.@num;
			mes "[景品交換員]";
			mes "ご利用ありがとうございました。";
			close;
		case 9:
			mes "[景品交換員]";
			mes "ポイントの景品交換は";
			mes "いつでも可能です。";
			mes "どうぞご利用ください。";
			next;
			mes "[景品交換員]";
			mes "なお、景品は……";
			mes "アルデバランカプラサービス本社";
			mes "ブラックスミスギルド";
			mes "コモドカジノ";
			mes "の協賛を受けています。";
			next;
			mes "[景品交換員]";
			mes "また、場所は……";
			mes "アルデバラン衛星都市";
			mes "ルイーナギルド砦連合";
			mes "にご提供して頂いてます。";
			mes "ありがとうございました。";
			close;
		}
		mes "[景品交換員]";
		mes getitemname(.@itemid)+ "ですね。";
		mes getitemname(.@itemid)+ "1個につき";
		mes "^4A4AFF" +.@point+ "点^000000必要です。";
		next;
		mes "[景品交換員]";
		mes "一度に交換できるのは、";
		mes .@max+ "個までとなります。";
		mes "もし取り消す場合は、";
		mes "「0」とおっしゃってください。";
		mes getitemname(.@itemid)+ "何個と交換しますか？";
		next;
		input .@num;
		if(.@num == 0) {
			mes "[景品交換員]";
			mes "取り消しました。";
			close;
		}
		if(.@num < 0 || .@num > .@max) {
			mes "[景品交換員]";
			mes "交換可能個数を超えています。一度に";
			mes "交換できるのは" +.@max+ "個までとなります。";
			close;
		}
		if(TURBO_POINT < .@num*.@point) {
			mes "[景品交換員]";
			mes "ターボトラックポイントが足りません。";
			mes "お手持ちのポイント数を";
			mes "確認なさってからお越しください。";
			close;
		}
		set TURBO_POINT,TURBO_POINT-.@num*.@point;
		getitem .@itemid,.@num;
		mes "[景品交換員]";
		mes "ご利用ありがとうございました。";
		close;
	}
	mes "[景品交換員]";
	mes "こんにちは。";
	mes strcharinfo(0) +"様の";
	mes "ターボトラックポイントは";
	mes TURBO_POINT +"点です。";
	next;
	mes "[景品交換員]";
	mes "景品の引き換えは、";
	mes "10点以上から可能です。";
	mes "景品リストをご覧になりますか？";
	next;
	if(select("景品リストを見る","やめておく")==2) {
		mes "[景品交換員]";
		mes "分かりました。";
		mes "ターボトラックを思いっきり";
		mes "楽しんでポイントをもらい、";
		mes "景品もたくさん獲得してください。";
		close;
	}
	mes "[景品交換員]";
	mes "交換対象の景品と各景品交換に";
	mes "必要ポイントは次の通りです。";
	next;
	mes "[景品交換員]";
	mes " 10 点：空間移動無料利用券";
	mes " 12 点：Lv5スクロール";
	mes " 40 点：経験値";
	mes " 60 点：ターボトラックコイン";
	mes "100 点：速度変化ポーション";
	mes "100 点：古く青い箱";
	mes "300 点：古い紫色の箱";
	mes "1000 点：古いカード帖";
	close;
}

turbo_room,106,117,3	script	ポイント管理人	833,{
	mes "[ターボトラックポイントガイド]";
	mes "こんにちは。";
	mes "競技をお楽しみ頂けたでしょうか。";
	mes "さて、何をお手伝いしましょう？";
	next;
	if(select("ポイントの確認","ターボトラックポイントとの交換")==1) {
		mes "[ターボトラックポイントガイド]";
		mes strcharinfo(0) +"様の";
		mes "ポイントは次の通りになります。";
		mes "ターボトラックポイント："+ TURBO_POINT +"点";
		mes "アリーナポイント："+ ARENA_POINT +"点";
		next;
		mes "[ターボトラックポイントガイド]";
		mes "お望みであれば、アリーナポイントを";
		mes "ターボトラックポイントへ";
		mes "交換することも可能です。";
		mes "ご一考してみるとよいでしょう。";
		close;
	}
	mes "[ターボトラックポイントガイド]";
	mes strcharinfo(0) +"様の";
	mes "ポイントは次の通りになります。";
	mes "ターボトラックポイント："+ TURBO_POINT +"点";
	mes "アリーナポイント："+ ARENA_POINT +"点";
	next;
	mes "[ターボトラックポイントガイド]";
	mes "アリーナポイントを";
	mes "ターボトラックポイントへ";
	mes "交換することができます。";
	next;
	mes "[ターボトラックポイントガイド]";
	mes "その際の交換比率は";
	mes "「アリーナ：ターボトラック＝２:１」";
	mes "となります。つまり……";
	mes "10点のアリーナポイントに対し、";
	mes "5点のターボトラックポイントを";
	mes "受け取ることになります。";
	next;
	mes "[ターボトラックポイントガイド]";
	mes "交換方法をお選びください。但し、";
	mes "10点以上のポイント交換に関しては";
	mes "^4A4AFF10点単位の交換数……";
	mes "つまり、倍数^000000を入力してください。";
	next;
	switch(select("アリーナ 2点 -> ターボトラック 1点","アリーナ 4点 -> ターボトラック 2点","アリーナ 6点 -> ターボトラック 3点","アリーナ 8点 -> ターボトラック 4点","アリーナポイント 10点単位","取り消し")) {
	default:
		set .@change_point,@menu*2;
		break;
	case 5:
		mes "[ターボトラックポイントガイド]";
		mes "アリーナポイントを";
		mes "ターボトラックポイントに";
		mes "^4A4AFF10点単位で交換^000000します。";
		mes "^4A4AFF一度に交換できる";
		mes "アリーナポイントは";
		mes "10点の20倍、200点まで^000000です。";
		next;
		mes "[ターボトラックポイントガイド]";
		mes "では、アリーナポイントを10点の何倍";
		mes "ターボトラックポイントに交換するかを";
		mes "入力してください。";
		mes "取り消す場合は「0」を";
		mes "入力してください。";
		next;
		input .@change_point;
		if(.@change_point == 0) {
			mes "[ターボトラックポイントガイド]";
			mes "取り消しました。";
			close;
		}
		if(.@change_point < 0 || .@change_point > 20) {
			mes "[ターボトラックポイントガイド]";
			mes "交換可能範囲を超えています。";
			mes "一度に交換できるアリーナポイントは";
			mes "10点の20倍までです。";
			close;
		}
		set .@change_point,.@change_point*10;
		break;
	}
	if(ARENA_POINT < .@change_point) {
		mes "[ターボトラックポイントガイド]";
		mes "アリーナポイントが不足しています。";
		mes "アリーナポイントは、";
		mes .@change_point +"点以上必要です。";
		mes "アリーナポイントを再度";
		mes "ご確認ください。";
		close;
	}
	set TURBO_POINT,TURBO_POINT+.@change_point/2;
	set ARENA_POINT,ARENA_POINT-.@change_point;
	mes "[ターボトラックポイントガイド]";
	mes strcharinfo(0)+"様の";
	mes "アリーナポイント"+ .@change_point +"点を";
	mes "ターボトラックポイント"+ .@change_point/2 +"点に";
	mes "交換しました。";
	next;
	mes "[ターボトラックポイントガイド]";
	mes strcharinfo(0) +"様の";
	mes "ポイントは次の通りになります。";
	mes "ターボトラックポイント："+ TURBO_POINT +"点";
	mes "アリーナポイント："+ ARENA_POINT +"点";
	mes "ご利用頂きありがとうございました。";
	close;
}

//============================================================
// 共通部分
//------------------------------------------------------------
-	script	コンパニオン#turbo	124,{
	mes "[コンパニオン]";
	mes "こちらは控え室です。";
	mes "カウント開始後30秒経過すると、";
	mes "自動で競技場へ転送します。";
	mes "装備及び回復アイテムを";
	mes "確認してください。";
	close;
OnStart:
	sleep 2000;
	announce "案内放送: こちらは、ターボトラック競技に参加する選手用の控え室です。",9;
	sleep 5000;
	announce "案内放送: カウント開始後30秒経過すると、競技場へ自動で転送します。",9;
	sleep 3000;
	announce "案内放送: 選手の方は、アイテム等の準備や確認をお願いします。",9;
	sleep 5000;
	announce "案内放送: カウントを開始します。",9;
	sleep 2000;
	announce "案内放送: 30秒後に競技場へ転送します。",9;
	sleep 10000;
	announce "案内放送: 20秒後に競技場へ転送します。",9;
	sleep 10000;
	announce "案内放送: 10秒後に競技場へ転送します。",9;
	sleep 5000;
	announce "案内放送: 5秒後に競技場へ転送します。",9;
	sleep 1000;
	announce "案内放送: 4秒後に競技場へ転送します。",9;
	sleep 1000;
	announce "案内放送: 3秒後に競技場へ転送します。",9;
	sleep 1000;
	announce "案内放送: 2秒後に競技場へ転送します。",9;
	sleep 1000;
	announce "案内放送: 1秒後に競技場へ転送します。",9;
	sleep 1000;
	announce "案内放送: 競技場へ転送します。",9;
	sleep 2000;
	areawarp "this",290,152,305,171,strnpcinfo(2),59,364;
	monster strnpcinfo(2)+".gat",279,284,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",279,268,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",279,260,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",287,288,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",287,280,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",287,264,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",295,284,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",295,268,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",295,260,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",303,288,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",303,280,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",303,264,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",311,284,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",311,268,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",311,260,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",347,288,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",347,280,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",347,264,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",355,284,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",355,268,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",355,260,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",363,288,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",363,280,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",363,264,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",371,284,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",371,268,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",371,260,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",379,288,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",379,280,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",379,264,"アーチャースケルトン",1420,1;
	monster strnpcinfo(2)+".gat",47,87,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",47,87,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",47,87,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",24,74,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",24,74,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",24,74,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",67,42,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",67,42,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",67,42,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",60,70,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",60,70,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",60,70,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",32,51,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",32,51,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",32,51,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",30,25,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",30,25,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",30,25,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",68,56,"ヒェグン",1612,1;
	monster strnpcinfo(2)+".gat",26,46,"ヒェグン",1612,1;
	monster strnpcinfo(2)+".gat",62,20,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",62,20,"ボンゴン",1611,1;
	monster strnpcinfo(2)+".gat",62,20,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",216,378,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",218,360,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",223,361,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",243,342,"ムナック",1610,1;
	monster strnpcinfo(2)+".gat",247,364,"ムナック",1610,1;
	if(strnpcinfo(2) == "turbo_n_16" || strnpcinfo(2) == "turbo_e_16") {
		monster strnpcinfo(2)+".gat",279,280,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",279,264,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",287,284,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",287,268,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",295,280,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",295,264,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",303,284,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",303,268,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",311,280,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",311,264,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",347,284,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",347,268,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",355,280,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",355,264,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",363,284,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",363,268,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",371,280,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",371,264,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",379,284,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",379,268,"アーチャースケルトン",1420,1;
		monster strnpcinfo(2)+".gat",68,56,"ムナック",1610,1;
		monster strnpcinfo(2)+".gat",68,56,"ムナック",1610,1;
		monster strnpcinfo(2)+".gat",26,46,"ムナック",1610,1;
		monster strnpcinfo(2)+".gat",26,46,"ムナック",1610,1;
	}
	sleep 7000;
	announce "進行者: ターボトラックへのご来場を歓迎します。",9;
	sleep 2000;
	announce "進行者: 競技時間は、15分です。15分経過してもゴールできなければ、脱落とします。",9;
	sleep 2000;
	announce "進行者: この点はよく覚えておいてください。",9;
	sleep 2000;
	announce "進行者: カウント開始後5秒経過すると、競技開始となります。選手の方はスタート位置に立ってください。",9;
	sleep 2000;
	announce "進行者: それではカウントを始めます。",9;
	sleep 2000;
	announce "進行者: ‐５‐",9;
	sleep 1000;
	announce "進行者: ‐４‐",9;
	sleep 1000;
	announce "進行者: ‐３‐",9;
	sleep 1000;
	announce "進行者: ‐２‐",9;
	sleep 1000;
	announce "進行者: ‐１‐",9;
	sleep 1000;
	announce "進行者: ‐０‐",9;
	sleep 1000;
	set getvariableofnpc(.time,strnpcinfo(0)),15;
	initnpctimer;
	announce "進行者: 競技開始!!　GO,GO,GO!!",9;
	hideonnpc "フライング1#"+strnpcinfo(2);
	hideonnpc "フライング2#"+strnpcinfo(2);
	sleep 7000;
	announce "進行者: 先程も言いましたが、競技時間は、15分です。15分経過後は脱落となります。",9;
	end;
OnTimer60000:
OnTimer120000:
OnTimer180000:
OnTimer240000:
OnTimer300000:
OnTimer360000:
OnTimer420000:
OnTimer480000:
OnTimer540000:
OnTimer600000:
OnTimer660000:
OnTimer720000:
OnTimer780000:
OnTimer840000:
	set getvariableofnpc(.time,strnpcinfo(0)),getvariableofnpc(.time,strnpcinfo(0))-1;
	announce "進行者: 残り時間は、" +getvariableofnpc(.time,strnpcinfo(0))+ "分です。",9;
	end;
OnTimer870000:
	announce "進行者: 残り時間は、30秒です。",9;
	end;
OnTimer880000:
	announce "進行者: 残り時間は、20秒です。",9;
	end;
OnTimer890000:
	announce "進行者: 残り時間は、10秒です。",9;
	end;
OnTimer895000:
	announce "進行者: 残り時間は、5秒です。",9;
	end;
OnTimer896000:
	announce "進行者: 残り時間は、4秒です。",9;
	end;
OnTimer897000:
	announce "進行者: 残り時間は、3秒です。",9;
	end;
OnTimer898000:
	announce "進行者: 残り時間は、2秒です。",9;
	end;
OnTimer899000:
	announce "進行者: 残り時間は、1秒です。",9;
	end;
OnTimer900000:
	announce "進行者: 制限時間になりました。",9;
	sleep 2000;
	announce "進行者: 競技を終了しました。",9;
	sleep 2000;
	announce "進行者: 控え室へ退場になります。",9;
	sleep 2000;
	stopnpctimer;
	areawarp "this",0,0,400,400,"turbo_room",71,89;
	killmonsterall "this";
	hideoffnpc "フライング1#"+strnpcinfo(2);
	hideoffnpc "フライング2#"+strnpcinfo(2);
	hideoffnpc "暗闇選択#"+strnpcinfo(2);
	hideoffnpc "暗闇出口1#"+strnpcinfo(2);
	hideoffnpc "暗闇出口2#"+strnpcinfo(2);
	hideoffnpc "トップ1#"+strnpcinfo(2);
	hideoffnpc "トップ2#"+strnpcinfo(2);
	hideoffnpc "トップ3#"+strnpcinfo(2);
	hideoffnpc "ゴール1#"+strnpcinfo(2);
	if(strnpcinfo(2) != "turbo_n_1") {
		hideoffnpc "妨害1#"+strnpcinfo(2);
		hideonnpc "妨害2#"+strnpcinfo(2);
		if(strnpcinfo(2) != "turbo_n_4" && strnpcinfo(2) != "turbo_e_4") {
			hideonnpc "ゴール2#"+strnpcinfo(2);
			hideonnpc "ゴール3#"+strnpcinfo(2);
		}
	}
	if(strnpcinfo(2) == "turbo_n_1") enablewaitingroomevent "1人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_4") enablewaitingroomevent "一般・4人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_8") enablewaitingroomevent "一般・8人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_16") enablewaitingroomevent "一般・16人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_4") enablewaitingroomevent "熟練・4人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_8") enablewaitingroomevent "熟練・8人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_16") enablewaitingroomevent "熟練・16人モード#turbo";
	end;
}

-	script	フライング1#turbo	139,{
	warp strnpcinfo(2)+".gat",59,364;
	end;
}

-	script	フライング2#turbo	139,{
	warp strnpcinfo(2)+".gat",59,364;
	end;
}

-	script	落とし穴#turbo	-1,{
	switch(rand(3)) {
	case 0:	warp strnpcinfo(2)+".gat",72,372; break;
	case 1:	warp strnpcinfo(2)+".gat",72,365; break;
	case 2:	warp strnpcinfo(2)+".gat",72,357; break;
	}
	end;
}

-	script	ワープ#turbo	-1,{
	switch(rand(20)) {
	case 0: warp strnpcinfo(2)+".gat",216,378; break;
	case 1: warp strnpcinfo(2)+".gat",218,360; break;
	case 2: warp strnpcinfo(2)+".gat",223,361; break;
	case 3: warp strnpcinfo(2)+".gat",243,342; break;
	case 4: warp strnpcinfo(2)+".gat",247,364; break;
	}
	end;
}

-	script	トラップ#turbo	139,{
	switch(rand(10)) {
	case 0: sc_start3 SC_CONFUSION,0,0,0,0,8000,10; emotion 19; break;
	case 1: sc_start3 SC_CURSE,0,0,0,0,8000,10; break;
	case 2: sc_start3 SC_STONE,0,0,0,0,4000,10; break;
	case 3: sc_start3 SC_SLEEP,0,0,0,0,4000,10; break;
	case 4: sc_start3 SC_FREEZE,0,0,0,0,4000,10; emotion 19; break;
	case 5: sc_start3 SC_STUN,0,0,0,0,4000,10; break;
	case 6: sc_start3 SC_CONFUSION,0,0,0,0,8000,10; break;
	}
	end;
}

-	script	広告#turbo	139,{
	if(rand(3)) {
		sc_start3 SC_CONFUSION,0,0,0,0,4000,10;
		end;
	}
	cutin "kafra_03",2;
	mes "-^9473DEこれは……広告のようだ。^000000-";
	next;
	mes "^4A4AFFアルデバランターボトラックは";
	mes "^840000カプラサービス^4A4AFFが協賛しています。^000000";
	next;
	mes "^8A0000カプラサービス^4A4AFFは";
	mes "^FF6342誠実^000000、^008400信用^000000、^0000CE正直^4A4AFFを三大原則とし^000000";
	mes "倉庫、位置セーブ、空間移動サービス^4A4AFFを";
	mes "提供しております。^000000";
	next;
	mes "^4A4AFF私ども^840000カプラサービス^4A4AFFを";
	mes "ご利用してくださる皆様への";
	mes "感謝の気持ちを深く心に刻みつつ、";
	mes "^840000カプラサービス^4A4AFFは、皆様の";
	mes "お幸せを心よりお祈りしております。^000000";
	next;
	mes "-^9473DEメッセージはここまでだ。^000000";
	mes "…………";
	mes "おや、下の方にこんな記述が……-";
	mes " ";
	mes "-^FF0000ターボトラック";
	mes "^FF5200砂漠の落とし穴!!^000000";
	mes "真心をつくす^840000カプラサービス提供^000000-";
	close2;
	cutin "kafra_03",255;
	end;
}

-	script	暗闇選択#turbo	139,1,1,{
	disablenpc "暗闇出口"+rand(1,2)+"#"+strnpcinfo(2);
	hideonnpc;
	end;
}

-	script	暗闇#turbo	-1,{
	sc_start3 SC_BLIND,0,0,0,0,600000,10;
	end;
}

-	script	暗闇解除#turbo	139,{
	sc_end SC_BLIND;
	end;
}

-	script	妨害#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",217,232; break;
	case 1: warp strnpcinfo(2)+".gat",233,207; break;
	case 2: warp strnpcinfo(2)+".gat",208,219; break;
	case 3: warp strnpcinfo(2)+".gat",219,202; break;
	case 4: warp strnpcinfo(2)+".gat",218,228; break;
	case 5: if(strnpcinfo(1) == "妨害2")
			warp strnpcinfo(2)+".gat",220,195;
		break;
	}
	if(strnpcinfo(1) == "妨害1") {
		hideonnpc;
		hideoffnpc "妨害2#"+strnpcinfo(2);
	}
	end;
OnInit:
	if(strnpcinfo(1) == "妨害2")
		hideonnpc;
	end;
}

-	script	蛇の道1#turbo	45,{
	switch(rand(7)) {
	case 0:
	case 1: warp strnpcinfo(2)+".gat",370,292; break;
	case 2:
	case 3: warp strnpcinfo(2)+".gat",295,293; break;
	case 4:
	case 5: warp strnpcinfo(2)+".gat",355,292; break;
	case 6: warp strnpcinfo(2)+".gat",279,292; break;
	}
	end;
}

-	script	蛇の道2#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",287,256; break;
	case 1: warp strnpcinfo(2)+".gat",303,256; break;
	case 2: warp strnpcinfo(2)+".gat",347,256; break;
	case 3: warp strnpcinfo(2)+".gat",363,256; break;
	}
	end;
}

-	script	蛇の道3#turbo	45,{
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",279,292; break;
	case 1: warp strnpcinfo(2)+".gat",311,292; break;
	case 2: warp strnpcinfo(2)+".gat",347,256; break;
	case 3: warp strnpcinfo(2)+".gat",370,292; break;
	}
	end;
}

-	script	蛇の道4#turbo	45,{
	switch(rand(7)) {
	case 0:
	case 1: warp strnpcinfo(2)+".gat",363,256; break;
	case 2:
	case 3: warp strnpcinfo(2)+".gat",295,293; break;
	case 4:
	case 5: warp strnpcinfo(2)+".gat",355,292; break;
	case 6: warp strnpcinfo(2)+".gat",287,256; break;
	}
	end;
}

-	script	通路#turbo	-1,{
	emotion 1,"";
	end;
}

-	script	正路#turbo	-1,{
	emotion 0,"";
	end;
}

-	script	ヒント#turbo	-1,{
	emotion 19,"";
	if(rand(4))
		end;
	if(strnpcinfo(1) == "ヒント1") emotion 0,"正路1#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "ヒント2") emotion 0,"正路2#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "ヒント3") emotion 0,"通路i#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "ヒント4") emotion 0,"通路j#"+strnpcinfo(2);
	else if(strnpcinfo(1) == "ヒント6" || strnpcinfo(1) == "ヒント7") emotion 0,"通路l#"+strnpcinfo(2);
	end;
}

-	script	ブラスト#turbo	139,{
	switch(rand(10)) {
	case 0:
	case 1:
	case 2: misceffect 106; percentheal -1,0; break;
	case 3:
	case 4:
	case 5: misceffect 106; percentheal -5,0; break;
	case 6: misceffect 106; percentheal -2,0; break;
	}
	end;
}

-	script	フリージング#turbo	139,{
	switch(rand(10)) {
	case 0:
	case 1:
	case 2: misceffect 108; percentheal -1,0; break;
	case 3:
	case 4:
	case 5: misceffect 108; percentheal -5,0; sc_start3 SC_FREEZE,0,0,0,0,3000,10; break;
	case 6: misceffect 108; percentheal -2,0; sc_start3 SC_FREEZE,0,0,0,0,4000,10; break;
	}
	end;
}

-	script	通過1#turbo	45,{
	announce strcharinfo(0) +"様が、丸太橋コースを通過しました！",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",210,369; break;
	case 1: warp strnpcinfo(2)+".gat",210,361; break;
	case 2: warp strnpcinfo(2)+".gat",210,354; break;
	}
	end;
}

-	script	通過2#turbo	45,{
	announce strcharinfo(0) +"様が、箱の丘コースを通過しました！",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",316,365;
	end;
}

-	script	通過3#turbo	45,{
	announce strcharinfo(0) +"様が、呪いと混乱の砂漠コースを通過しました！",9,0x73DEDE;
	switch(rand(4)) {
	case 0: warp strnpcinfo(2)+".gat",46,254; break;
	case 1: warp strnpcinfo(2)+".gat",76,227; break;
	case 2: warp strnpcinfo(2)+".gat",42,197; break;
	case 3: warp strnpcinfo(2)+".gat",86,220; break;
	}
	end;
}

-	script	暗闇出口#turbo	45,{
	announce strcharinfo(0) +"様が、暗黒の迷路コースを通過しました！",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",185,227;
	end;
}

-	script	通過5#turbo	45,{
	announce strcharinfo(0) +"様が、かたつむりコースを通過しました！",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",268,275;
	end;
}

-	script	通過6#turbo	45,{
	announce strcharinfo(0) +"様が、蛇の道コースを通過しました！",9,0x73DEDE;
	warp strnpcinfo(2)+".gat",5,91;
	end;
}

-	script	通過7#turbo	45,{
	if(strnpcinfo(2) == "turbo_n_1" || strnpcinfo(2) == "turbo_n_16" || strnpcinfo(2) == "turbo_e_16") {
		announce strcharinfo(0) +"様が、小さな洞窟コースを通過しました！",9,0x73DEDE;
		warp strnpcinfo(2)+".gat",167,55;
		end;
	}
	announce strcharinfo(0) +"様が、小さな洞窟コースを通過！　最後のコースへ入りました!!",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",307,52; break;
	case 1: warp strnpcinfo(2)+".gat",307,46; break;
	case 2: warp strnpcinfo(2)+".gat",307,40; break;
	}
	end;
}

-	script	通過8#turbo	45,{
	announce strcharinfo(0) +"様が、見えない迷路コースを通過！　最後のコースへ入りました!!",9,0x73DEDE;
	switch(rand(3)) {
	case 0: warp strnpcinfo(2)+".gat",307,52; break;
	case 1: warp strnpcinfo(2)+".gat",307,46; break;
	case 2: warp strnpcinfo(2)+".gat",307,40; break;
	}
	end;
}

-	script	トップ1#turbo	139,{
	if(strnpcinfo(2) == "turbo_n_1")
		announce "現在"+ strcharinfo(0) +"様が、かたつむりコースを走っております！",9;
	else
		announce strcharinfo(0) +"様が、かたつむりコースに入りました！　現在、先頭を走っています!!",9;
	hideonnpc;
	end;
}

-	script	トップ2#turbo	139,{
	announce strcharinfo(0) +"様が、小さな洞窟コースに入りました！",9;
	if(strnpcinfo(2) == "turbo_n_1") mapannounce "turbo_room","1人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_4") mapannounce "turbo_room","一般・4人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_8") mapannounce "turbo_room","一般・8人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_n_16") mapannounce "turbo_room","一般・16人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_4") mapannounce "turbo_room","熟練・4人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_8") mapannounce "turbo_room","熟練・8人モードの競技が、まもなく終了します。",0,0xADFF2F;
	else if(strnpcinfo(2) == "turbo_e_16") mapannounce "turbo_room","熟練・16人モードの競技が、まもなく終了します。",0,0xADFF2F;
	hideonnpc;
	end;
}

-	script	トップ3#turbo	139,{
	announce strcharinfo(0) +"様がゴールへ向けて、ラストスパートをかけております!!",9;
	hideonnpc;
	end;
}

//callfunc "TurboGoal","MapName",GetPoint,GoalNum,TurboMode;
function	script	TurboGoal	{
	if(getarg(0) != "turbo_n_1") {
		announce strcharinfo(0) +"様が、" +getarg(2)+ "位でゴールしました!!",9;
		set TURBO_POINT,TURBO_POINT+getarg(1);
		if(getarg(2) == 1) {
			if(getarg(3) < 10)
				set $TurboNameN$[getarg(3)],strcharinfo(0);
			else
				set $TurboNameE$[getarg(3)%10],strcharinfo(0);
			mapannounce "turbo_room","おめでとうございます！"+strcharinfo(0)+"様が、"+((getarg(3) < 10)? "一般": "熟練")+"・"+(1<<(getarg(3)%10)+1)+"モードを優勝しました!!",0,0x70DBDB;
			warp getarg(0)+".gat",384,161;
		}
		else {
			warp "turbo_room",71,89;
		}
	}
	else {
		announce strcharinfo(0) +"様がゴールしました!!",9;
		set .@time,getnpctimer(0,"コンパニオン#turbo_n_1");
		if(.@time <= $TurboTime || $TurboTime == 0) {
			set $TurboNameN$[0],strcharinfo(0);
			set $TurboTime,.@time;
			set TURBO_POINT,TURBO_POINT+30;
		}
		set TURBO_POINT,TURBO_POINT+getarg(1);
		warp getarg(0)+".gat",384,161;
	}
	hideonnpc;
	if(getarg(2) < 3 && (getarg(0) == "turbo_n_8" || getarg(0) == "turbo_e_8" || getarg(0) == "turbo_n_16" || getarg(0) == "turbo_e_16"))
		hideoffnpc "ゴール" +(getarg(2)+1)+ "#" +getarg(0);
	else {
		stopnpctimer "コンパニオン#"+strnpcinfo(2);
		donpcevent ((getarg(0) == "turbo_n_1")? "進行要員": "優勝者ガイド")+ "#" +getarg(0)+ "::OnStart";
	}
	return;
}

-	script	進行要員#turbo	47,{
	if(strnpcinfo(2) == "turbo_n_1") {
		mes "[ガイド]";
		mes "お疲れ様でした～！";
		mes "疲れを癒してさしあげましょう。";
		percentheal 100,100;
		next;
		mes "[ガイド]";
		mes "ターボトラックポイント";
		mes "を差し上げますが、";
		mes "ポイントが一杯だと支給されません。";
	}
	else {
		mes "[ガイド]";
		mes strcharinfo(0)+ "様、";
		mes "優勝おめでとうございます。";
		mes "では、優勝者ポイント0点を";
		mes "支給します。";
		mes "これで合計" +TURBO_POINT+ "点になります。";
		set TURBO_WIN,TURBO_WIN+1;
		next;

		mes "[ガイド]";
		mes "たくさん優勝すると、常勝メンバーに";
		mes "入ることができます。更に優秀な成績を";
		mes "収めますと、殿堂に登録されます。";
		mes "それはとても名誉あることです!!";
		mes strcharinfo(0)+ "様も";
		mes "挑戦してみてください。";
	}
	next;
	mes "[ガイド]";
	mes "当ターボトラックをご利用いただき";
	mes "ありがとうございました。";
	mes "控え室へ送りましょう。";
	close2;
	warp "turbo_room",72,89;
	end;
OnStart:
	sleep 4000;
	if(strnpcinfo(2) == "turbo_n_1") announce "ターボトラック1人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_4") announce "ターボトラック一般・4人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_8") announce "ターボトラック一般・8人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_n_16") announce "ターボトラック一般・16人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_4") announce "ターボトラック熟練・4人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_8") announce "ターボトラック熟練・8人モード競技の終了に関するご案内です。",9,0x31FF63;
	else if(strnpcinfo(2) == "turbo_e_16") announce "ターボトラック熟練・16人モード競技の終了に関するご案内です。",9,0x31FF63;
	sleep 4000;
	announce "円滑な進行のため、今から約1分後に競技を全て終了し、",9,0x31FF63;
	sleep 4000;
	announce "自動でワープが作動します。",9,0x31FF63;
	sleep 4000;
	announce "競技場内にいる選手の方は、競技終了の準備をし、",9,0x31FF63;
	sleep 4000;
	announce "速やかにお手続きをお済ませください。",9,0x31FF63;
	sleep 4000;
	announce "本日は当アルデバランターボトラックをご利用いただき、ありがとうございました。",9,0x31FF63;
	sleep 4000;
	announce "アルデバランターボトラックは",9,0x31FF63;
	sleep 4000;
	announce "[アルデバランカプラサービス本社]",9,0x31FF63;
	sleep 4000;
	announce "[アルデバラン衛星都市ルイーナギルド砦連合]",9,0x31FF63;
	sleep 4000;
	announce "[ブラックスミスギルド]",9,0x31FF63;
	sleep 4000;
	announce "[コモドカジノ]",9,0x31FF63;
	sleep 4000;
	announce "以上の団体の協賛を受けています。",9,0x31FF63;
	sleep 4000;
	announce "ありがとうございました。",9,0x31FF63;
	sleep 4000;
	areawarp "this",0,0,400,400,"turbo_room",71,89;
	killmonsterall "this";
	hideoffnpc "フライング1#"+strnpcinfo(2);
	hideoffnpc "フライング2#"+strnpcinfo(2);
	hideoffnpc "暗闇選択#"+strnpcinfo(2);
	hideoffnpc "暗闇出口1#"+strnpcinfo(2);
	hideoffnpc "暗闇出口2#"+strnpcinfo(2);
	hideoffnpc "トップ1#"+strnpcinfo(2);
	hideoffnpc "トップ2#"+strnpcinfo(2);
	hideoffnpc "トップ3#"+strnpcinfo(2);
	hideoffnpc "ゴール1#"+strnpcinfo(2);
	if(strnpcinfo(2) != "turbo_n_1") {
		hideoffnpc "妨害1#"+strnpcinfo(2);
		hideonnpc "妨害2#"+strnpcinfo(2);
		if(strnpcinfo(2) != "turbo_n_4" && strnpcinfo(2) != "turbo_e_4") {
			hideonnpc "ゴール2#"+strnpcinfo(2);
			hideonnpc "ゴール3#"+strnpcinfo(2);
		}
	}
	if(strnpcinfo(2) == "turbo_n_1") enablewaitingroomevent "1人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_4") enablewaitingroomevent "一般・4人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_8") enablewaitingroomevent "一般・8人モード#turbo";
	else if(strnpcinfo(2) == "turbo_n_16") enablewaitingroomevent "一般・16人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_4") enablewaitingroomevent "熟練・4人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_8") enablewaitingroomevent "熟練・8人モード#turbo";
	else if(strnpcinfo(2) == "turbo_e_16") enablewaitingroomevent "熟練・16人モード#turbo";
	end;
}

//============================================================
// 1人モード
//------------------------------------------------------------
turbo_room,72,132,3	script	1人モード#turbo	124,{
	end;
OnInit:
	waitingroom "1人モード",20,"1人モード#turbo::OnStart",1,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	if(attachrid(.@accid)) {
		if(Zeny >= 1000) {
			set Zeny,Zeny-1000;
			donpcevent "コンパニオン#turbo_n_1::OnStart";
			warpwaitingpc "turbo_n_1",298,161;
			end;
		}
		waitingroomkick strnpcinfo(0), .@accid;
	}
	enablewaitingroomevent;
	end;
}

turbo_n_1,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_n_1	124

turbo_n_1,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_n_1	139,0,15
turbo_n_1,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_n_1	139,5,15

turbo_n_1,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_n_1	139,44,1
turbo_n_1,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_n_1	139,3,1
turbo_n_1,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_n_1	139,1,1
turbo_n_1,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_n_1	139,0,2
turbo_n_1,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_n_1	139,0,2
turbo_n_1,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_n_1	139,1,2
turbo_n_1,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_n_1	139,1,2
turbo_n_1,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_n_1	139,2,4
turbo_n_1,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_n_1	139,0,4
turbo_n_1,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_n_1	139,7,2
turbo_n_1,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_n_1	139,6,2
turbo_n_1,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_n_1	139,0,3
turbo_n_1,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_n_1	139,1,1

turbo_n_1,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_n_1	139,2,2
turbo_n_1,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_n_1	139,0,2
turbo_n_1,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_n_1	139,3,0
turbo_n_1,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_n_1	139,5,1
turbo_n_1,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_n_1	139,2,1
turbo_n_1,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_n_1	139,2,5
turbo_n_1,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_n_1	139,1,3
turbo_n_1,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_n_1	139,4,1
turbo_n_1,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_n_1	139,7,2
turbo_n_1,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_n_1	139,7,0
turbo_n_1,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_n_1	139,3,2
turbo_n_1,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_n_1	139,0,5
turbo_n_1,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_n_1	139,6,1
turbo_n_1,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_n_1	139,8,1
turbo_n_1,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_n_1	139,8,0
turbo_n_1,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_n_1	139,2,3
turbo_n_1,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_n_1	139,0,3
turbo_n_1,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_n_1	139,7,0
turbo_n_1,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_n_1	139,7,0
turbo_n_1,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_n_1	139,3,0
turbo_n_1,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_n_1	139,1,0
turbo_n_1,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_n_1	139,0,1

turbo_n_1,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_n_1	139,4,1
turbo_n_1,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_n_1	139,4,1
turbo_n_1,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_n_1	139,0,1
turbo_n_1,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_n_1	139,5,1
turbo_n_1,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_n_1	139,1,1
turbo_n_1,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_n_1	139,1,1
turbo_n_1,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_n_1	139,1,1
turbo_n_1,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_n_1	139,6,1
turbo_n_1,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_n_1	139,6,0
turbo_n_1,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_n_1	139,2,2
turbo_n_1,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_n_1	139,1,2
turbo_n_1,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_n_1	139,0,2
turbo_n_1,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_n_1	139,3,1
turbo_n_1,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_n_1	139,0,2
turbo_n_1,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_n_1	139,0,2
turbo_n_1,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_n_1	139,0,2
turbo_n_1,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_n_1	139,0,2
turbo_n_1,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_n_1	139,12,1
turbo_n_1,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_n_1	139,12,0
turbo_n_1,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_n_1	139,2,1
turbo_n_1,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_n_1	139,2,1
turbo_n_1,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_n_1	139,16,1
turbo_n_1,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_n_1	139,1,0
turbo_n_1,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_n_1	139,1,4
turbo_n_1,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_n_1	139,2,2
turbo_n_1,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_n_1	139,1,2
turbo_n_1,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_n_1	139,1,0
turbo_n_1,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_n_1	139,0,0

turbo_n_1,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_n_1	139,5,2
turbo_n_1,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_n_1	139,0,1
turbo_n_1,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_n_1	139,14,0
turbo_n_1,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_n_1	139,14,0
turbo_n_1,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_n_1	139,3,3
turbo_n_1,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_n_1	139,0,3
turbo_n_1,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_n_1	139,5,1
turbo_n_1,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_n_1	139,0,1
turbo_n_1,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_n_1	139,0,1
turbo_n_1,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_n_1	139,3,2
turbo_n_1,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_n_1	139,0,2
turbo_n_1,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_n_1	139,17,1
turbo_n_1,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_n_1	139,10,1
turbo_n_1,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_n_1	139,1,2
turbo_n_1,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_n_1	139,1,2

turbo_n_1,168,363,0	duplicate(通過1#turbo)	通過1#turbo_n_1	45,1,1

turbo_n_1,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_n_1	139,1,1
turbo_n_1,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_n_1	139,1,1
turbo_n_1,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_n_1	139,1,1
turbo_n_1,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_n_1	139,1,1
turbo_n_1,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_n_1	139,1,1
turbo_n_1,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_n_1	139,1,1
turbo_n_1,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_n_1	139,2,2

turbo_n_1,258,364,0	duplicate(通過2#turbo)	通過2#turbo_n_1	45,1,1

turbo_n_1,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_n_1	139,3,3
turbo_n_1,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_n_1	139,3,3
turbo_n_1,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_n_1	139,1,1
turbo_n_1,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_n_1	139,3,3
turbo_n_1,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_n_1	139,1,1
turbo_n_1,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_n_1	139,3,3
turbo_n_1,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_n_1	139,3,3
turbo_n_1,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_n_1	139,3,3
turbo_n_1,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_n_1	139,2,2
turbo_n_1,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_n_1	139,1,1
turbo_n_1,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_n_1	139,3,3
turbo_n_1,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_n_1	139,1,1
turbo_n_1,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_n_1	139,2,2
turbo_n_1,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_n_1	139,9,9
turbo_n_1,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_n_1	139,3,3
turbo_n_1,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_n_1	139,1,1
turbo_n_1,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_n_1	139,3,3
turbo_n_1,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_n_1	139,2,2
turbo_n_1,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_n_1	139,3,3
turbo_n_1,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_n_1	139,1,1
turbo_n_1,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_n_1	139,3,3
turbo_n_1,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_n_1	139,2,2
turbo_n_1,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_n_1	139,1,1

turbo_n_1,355,362,0	duplicate(広告#turbo)	広告#turbo_n_1	139,3,3

turbo_n_1,385,365,0	duplicate(通過3#turbo)	通過3#turbo_n_1	45,1,1

turbo_n_1,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_n_1	139,1,1

turbo_n_1,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_n_1		139,0,2
turbo_n_1,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_n_1		139,1,0
turbo_n_1,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_n_1		139,1,0
turbo_n_1,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_n_1		139,0,1
turbo_n_1,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_n_1		139,1,0
turbo_n_1,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_n_1		139,1,0
turbo_n_1,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_n_1		139,0,1
turbo_n_1,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_n_1		139,1,0
turbo_n_1,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_n_1		139,0,1
turbo_n_1,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_n_1	139,1,0
turbo_n_1,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_n_1	139,0,1
turbo_n_1,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_n_1	139,1,0
turbo_n_1,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_n_1	139,1,0
turbo_n_1,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_n_1	139,1,0
turbo_n_1,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_n_1	139,1,0
turbo_n_1,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_n_1	139,0,1
turbo_n_1,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_n_1	139,1,0
turbo_n_1,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_n_1	139,0,1
turbo_n_1,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_n_1	139,0,1
turbo_n_1,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_n_1	139,0,1
turbo_n_1,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_n_1	139,0,1
turbo_n_1,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_n_1	139,2,0
turbo_n_1,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_n_1	139,2,0
turbo_n_1,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_n_1	139,0,1
turbo_n_1,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_n_1	139,0,1
turbo_n_1,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_n_1	139,2,0
turbo_n_1,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_n_1	139,1,0
turbo_n_1,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_n_1	139,0,1
turbo_n_1,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_n_1	139,0,1
turbo_n_1,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_n_1	139,1,0
turbo_n_1,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_n_1	139,1,1
turbo_n_1,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_n_1	139,1,0
turbo_n_1,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_n_1	139,1,1
turbo_n_1,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_n_1	139,1,1
turbo_n_1,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_n_1	139,2,0
turbo_n_1,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_n_1	139,1,1
turbo_n_1,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_n_1	139,2,0
turbo_n_1,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_n_1	139,1,0
turbo_n_1,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_n_1	139,1,1
turbo_n_1,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_n_1	139,1,1
turbo_n_1,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_n_1	139,1,1
turbo_n_1,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_n_1	139,1,1
turbo_n_1,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_n_1	139,1,1
turbo_n_1,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_n_1	139,1,1
turbo_n_1,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_n_1	139,1,1
turbo_n_1,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_n_1	139,1,0
turbo_n_1,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_n_1	139,2,1
turbo_n_1,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_n_1	139,1,1
turbo_n_1,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_n_1	139,0,1
turbo_n_1,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_n_1	139,1,0

turbo_n_1,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_n_1	139,3,3

turbo_n_1,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_n_1	45,1,1
turbo_n_1,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_n_1	45,1,1

turbo_n_1,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_n_1	139,2,2

turbo_n_1,250,200,0	duplicate(通過5#turbo)	通過5#turbo_n_1	45,1,1

turbo_n_1,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_n_1	45,1,1
turbo_n_1,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_n_1	45,1,1
turbo_n_1,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_n_1	45,1,1
turbo_n_1,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_n_1	45,1,1

turbo_n_1,389,275,0	duplicate(通過6#turbo)	通過6#turbo_n_1	45,1,1

turbo_n_1,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_n_1	139,3,3

turbo_n_1,93,19,0	duplicate(通過7#turbo)	通過7#turbo_n_1	45,1,1

turbo_n_1,179,55,0	duplicate(通路#turbo)	通路a#turbo_n_1	139,1,1
turbo_n_1,184,45,0	duplicate(通路#turbo)	通路b#turbo_n_1	139,1,1
turbo_n_1,181,30,0	duplicate(通路#turbo)	通路c#turbo_n_1	139,1,1
turbo_n_1,186,28,0	duplicate(通路#turbo)	通路d#turbo_n_1	139,1,1
turbo_n_1,183,19,0	duplicate(通路#turbo)	通路e#turbo_n_1	139,1,1
turbo_n_1,191,37,0	duplicate(通路#turbo)	通路f#turbo_n_1	139,1,1
turbo_n_1,173,25,0	duplicate(通路#turbo)	通路g#turbo_n_1	139,1,1
turbo_n_1,201,21,0	duplicate(通路#turbo)	通路h#turbo_n_1	139,1,1
turbo_n_1,222,21,0	duplicate(通路#turbo)	通路i#turbo_n_1	139,1,1
turbo_n_1,214,39,0	duplicate(通路#turbo)	通路j#turbo_n_1	139,1,1
turbo_n_1,222,48,0	duplicate(通路#turbo)	通路k#turbo_n_1	139,1,1
turbo_n_1,214,60,0	duplicate(通路#turbo)	通路l#turbo_n_1	139,1,1
turbo_n_1,209,61,0	duplicate(通路#turbo)	通路m#turbo_n_1	139,1,1
turbo_n_1,208,56,0	duplicate(通路#turbo)	通路n#turbo_n_1	139,1,1

turbo_n_1,178,63,0	duplicate(正路#turbo)	正路1#turbo_n_1	139,1,1
turbo_n_1,182,40,0	duplicate(正路#turbo)	正路2#turbo_n_1	139,1,1
turbo_n_1,176,29,0	duplicate(正路#turbo)	正路3#turbo_n_1	139,1,1
turbo_n_1,180,25,0	duplicate(正路#turbo)	正路4#turbo_n_1	139,1,1
turbo_n_1,201,157,0	duplicate(正路#turbo)	正路5#turbo_n_1	139,1,1
turbo_n_1,203,65,0	duplicate(正路#turbo)	正路6#turbo_n_1	139,1,1
turbo_n_1,208,52,0	duplicate(正路#turbo)	正路7#turbo_n_1	139,1,1
turbo_n_1,208,26,0	duplicate(正路#turbo)	正路8#turbo_n_1	139,1,1
turbo_n_1,191,30,0	duplicate(正路#turbo)	正路9#turbo_n_1	139,1,1

turbo_n_1,187,55,0	duplicate(ヒント#turbo)	ヒント1#turbo_n_1	139,1,1
turbo_n_1,176,45,0	duplicate(ヒント#turbo)	ヒント2#turbo_n_1	139,1,1
turbo_n_1,222,26,0	duplicate(ヒント#turbo)	ヒント3#turbo_n_1	139,1,1
turbo_n_1,219,39,0	duplicate(ヒント#turbo)	ヒント4#turbo_n_1	139,1,1
turbo_n_1,222,45,0	duplicate(ヒント#turbo)	ヒント5#turbo_n_1	139,1,1
turbo_n_1,222,61,0	duplicate(ヒント#turbo)	ヒント6#turbo_n_1	139,1,1
turbo_n_1,222,65,0	duplicate(ヒント#turbo)	ヒント7#turbo_n_1	139,1,1

turbo_n_1,226,15,0	duplicate(トップ3#turbo)	トップ3#turbo_n_1	139,3,3

turbo_n_1,232,14,0	duplicate(通過8#turbo)	通過8#turbo_n_1	45,1,1

turbo_n_1,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_n_1	139,1,1
turbo_n_1,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_n_1	139,1,1
turbo_n_1,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_n_1	139,1,1
turbo_n_1,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_n_1	139,1,1
turbo_n_1,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_n_1	139,1,1
turbo_n_1,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_n_1	139,1,1
turbo_n_1,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_n_1	139,1,1
turbo_n_1,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_n_1	139,1,1
turbo_n_1,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_n_1	139,1,1
turbo_n_1,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_n_1	139,1,1
turbo_n_1,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_n_1	139,1,1
turbo_n_1,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_n_1	139,1,1
turbo_n_1,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_n_1	139,1,1
turbo_n_1,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_n_1	139,1,1
turbo_n_1,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_n_1	139,1,1
turbo_n_1,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_n_1	139,1,1
turbo_n_1,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_n_1	139,1,1
turbo_n_1,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_n_1	139,1,1
turbo_n_1,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_n_1	139,1,1
turbo_n_1,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_n_1	139,1,1
turbo_n_1,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_n_1	139,1,1
turbo_n_1,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_n_1	139,1,1
turbo_n_1,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_n_1	139,1,1
turbo_n_1,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_n_1	139,1,1
turbo_n_1,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_n_1	139,1,1
turbo_n_1,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_n_1	139,1,1
turbo_n_1,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_n_1	139,1,1
turbo_n_1,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_n_1	139,1,1
turbo_n_1,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_n_1	139,1,1
turbo_n_1,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_n_1	139,1,1
turbo_n_1,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_n_1	139,1,1
turbo_n_1,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_n_1	139,1,1
turbo_n_1,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_n_1	139,1,1
turbo_n_1,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_n_1	139,1,1
turbo_n_1,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_n_1	139,1,1
turbo_n_1,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_n_1	139,1,1
turbo_n_1,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_n_1	139,1,1
turbo_n_1,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_n_1	139,1,1
turbo_n_1,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_n_1	139,1,1
turbo_n_1,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_n_1	139,1,1
turbo_n_1,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_n_1	139,1,1
turbo_n_1,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_n_1	139,1,1
turbo_n_1,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_n_1	139,1,1
turbo_n_1,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_n_1	139,1,1
turbo_n_1,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_n_1	139,1,1
turbo_n_1,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_n_1	139,1,1
turbo_n_1,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_n_1	139,1,1
turbo_n_1,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_n_1	139,1,1
turbo_n_1,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_n_1	139,1,1
turbo_n_1,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_n_1	139,1,1
turbo_n_1,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_n_1	139,1,1
turbo_n_1,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_n_1	139,1,1
turbo_n_1,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_n_1	139,1,1
turbo_n_1,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_n_1	139,1,1
turbo_n_1,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_n_1	139,1,1
turbo_n_1,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_n_1	139,1,1
turbo_n_1,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_n_1	139,1,1
turbo_n_1,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_n_1	139,1,1
turbo_n_1,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_n_1	139,1,1
turbo_n_1,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_n_1	139,1,1
turbo_n_1,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_n_1	139,1,1
turbo_n_1,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_n_1	139,1,1
turbo_n_1,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_n_1	139,1,1
turbo_n_1,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_n_1	139,1,1
turbo_n_1,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_n_1	139,1,1
turbo_n_1,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_n_1	139,1,1
turbo_n_1,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_n_1	139,1,1
turbo_n_1,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_n_1	139,1,1
turbo_n_1,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_n_1	139,1,1
turbo_n_1,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_n_1	139,1,1
turbo_n_1,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_n_1	139,1,1
turbo_n_1,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_n_1	139,1,1
turbo_n_1,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_n_1	139,1,1
turbo_n_1,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_n_1	139,1,1
turbo_n_1,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_n_1	139,1,1
turbo_n_1,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_n_1	139,1,1
turbo_n_1,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_n_1	139,1,1
turbo_n_1,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_n_1	139,1,1
turbo_n_1,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_n_1	139,1,1
turbo_n_1,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_n_1	139,1,1
turbo_n_1,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_n_1	139,1,1
turbo_n_1,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_n_1	139,1,1
turbo_n_1,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_n_1	139,1,1
turbo_n_1,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_n_1	139,1,1
turbo_n_1,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_n_1	139,1,1
turbo_n_1,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_n_1	139,1,1
turbo_n_1,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_n_1	139,1,1
turbo_n_1,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_n_1	139,1,1
turbo_n_1,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_n_1	139,1,1
turbo_n_1,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_n_1	139,1,1
turbo_n_1,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_n_1	139,1,1
turbo_n_1,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_n_1	139,1,1
turbo_n_1,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_n_1	139,1,1
turbo_n_1,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_n_1	139,1,1
turbo_n_1,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_n_1	139,1,1

turbo_n_1,371,47,0	script	ゴール1#turbo_n_1	45,1,1,{
	callfunc "TurboGoal","turbo_n_1",10,1,0;
	end;
}

turbo_n_1,384,167,1	duplicate(進行要員#turbo)	進行要員#turbo_n_1	47

//==============================================================
// 一般・4人モード
//==============================================================
turbo_room,77,135,3	script	一般・4人モード#turbo	124,{
	end;
OnInit:
	waitingroom "一般・4人モード",20,"一般・4人モード#turbo::OnStart",4,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 4; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_n_4::OnStart";
	warpwaitingpc "turbo_n_4",298,161;
	end;
}

turbo_n_4,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_n_4	124

turbo_n_4,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_n_4	139,0,15
turbo_n_4,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_n_4	139,5,15

turbo_n_4,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_n_4	139,44,1
turbo_n_4,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_n_4	139,3,1
turbo_n_4,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_n_4	139,1,1
turbo_n_4,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_n_4	139,0,2
turbo_n_4,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_n_4	139,0,2
turbo_n_4,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_n_4	139,1,2
turbo_n_4,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_n_4	139,1,2
turbo_n_4,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_n_4	139,2,4
turbo_n_4,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_n_4	139,0,4
turbo_n_4,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_n_4	139,7,2
turbo_n_4,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_n_4	139,6,2
turbo_n_4,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_n_4	139,0,3
turbo_n_4,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_n_4	139,1,1

turbo_n_4,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_n_4	139,2,2
turbo_n_4,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_n_4	139,0,2
turbo_n_4,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_n_4	139,3,0
turbo_n_4,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_n_4	139,5,1
turbo_n_4,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_n_4	139,2,1
turbo_n_4,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_n_4	139,2,5
turbo_n_4,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_n_4	139,1,3
turbo_n_4,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_n_4	139,4,1
turbo_n_4,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_n_4	139,7,2
turbo_n_4,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_n_4	139,7,0
turbo_n_4,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_n_4	139,3,2
turbo_n_4,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_n_4	139,0,5
turbo_n_4,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_n_4	139,6,1
turbo_n_4,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_n_4	139,8,1
turbo_n_4,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_n_4	139,8,0
turbo_n_4,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_n_4	139,2,3
turbo_n_4,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_n_4	139,0,3
turbo_n_4,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_n_4	139,7,0
turbo_n_4,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_n_4	139,7,0
turbo_n_4,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_n_4	139,3,0
turbo_n_4,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_n_4	139,1,0
turbo_n_4,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_n_4	139,0,1

turbo_n_4,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_n_4	139,4,1
turbo_n_4,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_n_4	139,4,1
turbo_n_4,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_n_4	139,0,1
turbo_n_4,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_n_4	139,5,1
turbo_n_4,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_n_4	139,1,1
turbo_n_4,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_n_4	139,1,1
turbo_n_4,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_n_4	139,1,1
turbo_n_4,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_n_4	139,6,1
turbo_n_4,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_n_4	139,6,0
turbo_n_4,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_n_4	139,2,2
turbo_n_4,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_n_4	139,1,2
turbo_n_4,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_n_4	139,0,2
turbo_n_4,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_n_4	139,3,1
turbo_n_4,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_n_4	139,0,2
turbo_n_4,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_n_4	139,0,2
turbo_n_4,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_n_4	139,0,2
turbo_n_4,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_n_4	139,0,2
turbo_n_4,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_n_4	139,12,1
turbo_n_4,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_n_4	139,12,0
turbo_n_4,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_n_4	139,2,1
turbo_n_4,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_n_4	139,2,1
turbo_n_4,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_n_4	139,16,1
turbo_n_4,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_n_4	139,1,0
turbo_n_4,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_n_4	139,1,4
turbo_n_4,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_n_4	139,2,2
turbo_n_4,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_n_4	139,1,2
turbo_n_4,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_n_4	139,1,0
turbo_n_4,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_n_4	139,0,0

turbo_n_4,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_n_4	139,5,2
turbo_n_4,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_n_4	139,0,1
turbo_n_4,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_n_4	139,14,0
turbo_n_4,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_n_4	139,14,0
turbo_n_4,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_n_4	139,3,3
turbo_n_4,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_n_4	139,0,3
turbo_n_4,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_n_4	139,5,1
turbo_n_4,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_n_4	139,0,1
turbo_n_4,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_n_4	139,0,1
turbo_n_4,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_n_4	139,3,2
turbo_n_4,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_n_4	139,0,2
turbo_n_4,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_n_4	139,17,1
turbo_n_4,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_n_4	139,10,1
turbo_n_4,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_n_4	139,1,2
turbo_n_4,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_n_4	139,1,2

turbo_n_4,168,363,0	duplicate(通過1#turbo)	通過1#turbo_n_4	45,1,1

turbo_n_4,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_n_4	139,1,1
turbo_n_4,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_n_4	139,1,1
turbo_n_4,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_n_4	139,1,1
turbo_n_4,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_n_4	139,1,1
turbo_n_4,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_n_4	139,1,1
turbo_n_4,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_n_4	139,1,1
turbo_n_4,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_n_4	139,2,2

turbo_n_4,258,364,0	duplicate(通過2#turbo)	通過2#turbo_n_4	45,1,1

turbo_n_4,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_n_4	139,3,3
turbo_n_4,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_n_4	139,3,3
turbo_n_4,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_n_4	139,1,1
turbo_n_4,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_n_4	139,3,3
turbo_n_4,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_n_4	139,1,1
turbo_n_4,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_n_4	139,3,3
turbo_n_4,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_n_4	139,3,3
turbo_n_4,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_n_4	139,3,3
turbo_n_4,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_n_4	139,2,2
turbo_n_4,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_n_4	139,1,1
turbo_n_4,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_n_4	139,3,3
turbo_n_4,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_n_4	139,1,1
turbo_n_4,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_n_4	139,2,2
turbo_n_4,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_n_4	139,9,9
turbo_n_4,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_n_4	139,3,3
turbo_n_4,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_n_4	139,1,1
turbo_n_4,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_n_4	139,3,3
turbo_n_4,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_n_4	139,2,2
turbo_n_4,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_n_4	139,3,3
turbo_n_4,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_n_4	139,1,1
turbo_n_4,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_n_4	139,3,3
turbo_n_4,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_n_4	139,2,2
turbo_n_4,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_n_4	139,1,1

turbo_n_4,355,362,0	duplicate(広告#turbo)	広告#turbo_n_4	139,3,3

turbo_n_4,385,365,0	duplicate(通過3#turbo)	通過3#turbo_n_4	45,1,1

turbo_n_4,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_n_4	139,1,1

turbo_n_4,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_n_4		139,0,2
turbo_n_4,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_n_4		139,1,0
turbo_n_4,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_n_4		139,1,0
turbo_n_4,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_n_4		139,0,1
turbo_n_4,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_n_4		139,1,0
turbo_n_4,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_n_4		139,1,0
turbo_n_4,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_n_4		139,0,1
turbo_n_4,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_n_4		139,1,0
turbo_n_4,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_n_4		139,0,1
turbo_n_4,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_n_4	139,1,0
turbo_n_4,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_n_4	139,0,1
turbo_n_4,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_n_4	139,1,0
turbo_n_4,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_n_4	139,1,0
turbo_n_4,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_n_4	139,1,0
turbo_n_4,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_n_4	139,1,0
turbo_n_4,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_n_4	139,0,1
turbo_n_4,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_n_4	139,1,0
turbo_n_4,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_n_4	139,0,1
turbo_n_4,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_n_4	139,0,1
turbo_n_4,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_n_4	139,0,1
turbo_n_4,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_n_4	139,0,1
turbo_n_4,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_n_4	139,2,0
turbo_n_4,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_n_4	139,2,0
turbo_n_4,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_n_4	139,0,1
turbo_n_4,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_n_4	139,0,1
turbo_n_4,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_n_4	139,2,0
turbo_n_4,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_n_4	139,1,0
turbo_n_4,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_n_4	139,0,1
turbo_n_4,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_n_4	139,0,1
turbo_n_4,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_n_4	139,1,0
turbo_n_4,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_n_4	139,1,1
turbo_n_4,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_n_4	139,1,0
turbo_n_4,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_n_4	139,1,1
turbo_n_4,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_n_4	139,1,1
turbo_n_4,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_n_4	139,2,0
turbo_n_4,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_n_4	139,1,1
turbo_n_4,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_n_4	139,2,0
turbo_n_4,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_n_4	139,1,0
turbo_n_4,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_n_4	139,1,1
turbo_n_4,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_n_4	139,1,1
turbo_n_4,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_n_4	139,1,1
turbo_n_4,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_n_4	139,1,1
turbo_n_4,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_n_4	139,1,1
turbo_n_4,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_n_4	139,1,1
turbo_n_4,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_n_4	139,1,1
turbo_n_4,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_n_4	139,1,0
turbo_n_4,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_n_4	139,2,1
turbo_n_4,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_n_4	139,1,1
turbo_n_4,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_n_4	139,0,1
turbo_n_4,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_n_4	139,1,0

turbo_n_4,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_n_4	139,3,3

turbo_n_4,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_n_4	45,1,1
turbo_n_4,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_n_4	45,1,1

turbo_n_4,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_n_4	45,3,3
turbo_n_4,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_n_4	45,3,3

turbo_n_4,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_n_4	139,2,2

turbo_n_4,250,200,0	duplicate(通過5#turbo)	通過5#turbo_n_4	45,1,1

turbo_n_4,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_n_4	45,1,1
turbo_n_4,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_n_4	45,1,1
turbo_n_4,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_n_4	45,1,1
turbo_n_4,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_n_4	45,1,1

turbo_n_4,389,275,0	duplicate(通過6#turbo)	通過6#turbo_n_4	45,1,1

turbo_n_4,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_n_4	139,3,3

turbo_n_4,93,19,0	duplicate(通過7#turbo)	通過7#turbo_n_4	45,1,1

turbo_n_4,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_n_4	139,1,1
turbo_n_4,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_n_4	139,1,1
turbo_n_4,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_n_4	139,1,1
turbo_n_4,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_n_4	139,1,1
turbo_n_4,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_n_4	139,1,1
turbo_n_4,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_n_4	139,1,1
turbo_n_4,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_n_4	139,1,1
turbo_n_4,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_n_4	139,1,1
turbo_n_4,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_n_4	139,1,1
turbo_n_4,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_n_4	139,1,1
turbo_n_4,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_n_4	139,1,1
turbo_n_4,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_n_4	139,1,1
turbo_n_4,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_n_4	139,1,1
turbo_n_4,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_n_4	139,1,1
turbo_n_4,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_n_4	139,1,1
turbo_n_4,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_n_4	139,1,1
turbo_n_4,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_n_4	139,1,1
turbo_n_4,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_n_4	139,1,1
turbo_n_4,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_n_4	139,1,1
turbo_n_4,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_n_4	139,1,1
turbo_n_4,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_n_4	139,1,1
turbo_n_4,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_n_4	139,1,1
turbo_n_4,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_n_4	139,1,1
turbo_n_4,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_n_4	139,1,1
turbo_n_4,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_n_4	139,1,1
turbo_n_4,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_n_4	139,1,1
turbo_n_4,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_n_4	139,1,1
turbo_n_4,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_n_4	139,1,1
turbo_n_4,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_n_4	139,1,1
turbo_n_4,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_n_4	139,1,1
turbo_n_4,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_n_4	139,1,1
turbo_n_4,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_n_4	139,1,1
turbo_n_4,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_n_4	139,1,1
turbo_n_4,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_n_4	139,1,1
turbo_n_4,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_n_4	139,1,1
turbo_n_4,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_n_4	139,1,1
turbo_n_4,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_n_4	139,1,1
turbo_n_4,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_n_4	139,1,1
turbo_n_4,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_n_4	139,1,1
turbo_n_4,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_n_4	139,1,1
turbo_n_4,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_n_4	139,1,1
turbo_n_4,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_n_4	139,1,1
turbo_n_4,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_n_4	139,1,1
turbo_n_4,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_n_4	139,1,1
turbo_n_4,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_n_4	139,1,1
turbo_n_4,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_n_4	139,1,1
turbo_n_4,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_n_4	139,1,1
turbo_n_4,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_n_4	139,1,1
turbo_n_4,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_n_4	139,1,1
turbo_n_4,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_n_4	139,1,1
turbo_n_4,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_n_4	139,1,1
turbo_n_4,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_n_4	139,1,1
turbo_n_4,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_n_4	139,1,1
turbo_n_4,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_n_4	139,1,1
turbo_n_4,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_n_4	139,1,1
turbo_n_4,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_n_4	139,1,1
turbo_n_4,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_n_4	139,1,1
turbo_n_4,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_n_4	139,1,1
turbo_n_4,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_n_4	139,1,1
turbo_n_4,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_n_4	139,1,1
turbo_n_4,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_n_4	139,1,1
turbo_n_4,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_n_4	139,1,1
turbo_n_4,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_n_4	139,1,1
turbo_n_4,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_n_4	139,1,1
turbo_n_4,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_n_4	139,1,1
turbo_n_4,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_n_4	139,1,1
turbo_n_4,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_n_4	139,1,1
turbo_n_4,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_n_4	139,1,1
turbo_n_4,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_n_4	139,1,1
turbo_n_4,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_n_4	139,1,1
turbo_n_4,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_n_4	139,1,1
turbo_n_4,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_n_4	139,1,1
turbo_n_4,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_n_4	139,1,1
turbo_n_4,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_n_4	139,1,1
turbo_n_4,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_n_4	139,1,1
turbo_n_4,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_n_4	139,1,1
turbo_n_4,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_n_4	139,1,1
turbo_n_4,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_n_4	139,1,1
turbo_n_4,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_n_4	139,1,1
turbo_n_4,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_n_4	139,1,1
turbo_n_4,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_n_4	139,1,1
turbo_n_4,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_n_4	139,1,1
turbo_n_4,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_n_4	139,1,1
turbo_n_4,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_n_4	139,1,1
turbo_n_4,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_n_4	139,1,1
turbo_n_4,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_n_4	139,1,1
turbo_n_4,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_n_4	139,1,1
turbo_n_4,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_n_4	139,1,1
turbo_n_4,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_n_4	139,1,1
turbo_n_4,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_n_4	139,1,1
turbo_n_4,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_n_4	139,1,1
turbo_n_4,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_n_4	139,1,1
turbo_n_4,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_n_4	139,1,1
turbo_n_4,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_n_4	139,1,1
turbo_n_4,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_n_4	139,1,1

turbo_n_4,371,47,0	script	ゴール1#turbo_n_4	45,1,1,{
	callfunc "TurboGoal","turbo_n_4",20,1,1;
	end;
}

turbo_n_4,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_n_4	47

//==============================================================
// 一般・8人モード
//==============================================================
turbo_room,84,135,3	script	一般・8人モード#turbo	124,{
	end;
OnInit:
	waitingroom "一般・8人モード",20,"一般・8人モード#turbo::OnStart",8,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 8; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_n_8::OnStart";
	warpwaitingpc "turbo_n_8",298,161;
	end;
}

turbo_n_8,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_n_8	124

turbo_n_8,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_n_8	139,0,15
turbo_n_8,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_n_8	139,5,15

turbo_n_8,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_n_8	139,44,1
turbo_n_8,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_n_8	139,3,1
turbo_n_8,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_n_8	139,1,1
turbo_n_8,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_n_8	139,0,2
turbo_n_8,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_n_8	139,0,2
turbo_n_8,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_n_8	139,1,2
turbo_n_8,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_n_8	139,1,2
turbo_n_8,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_n_8	139,2,4
turbo_n_8,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_n_8	139,0,4
turbo_n_8,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_n_8	139,7,2
turbo_n_8,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_n_8	139,6,2
turbo_n_8,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_n_8	139,0,3
turbo_n_8,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_n_8	139,1,1

turbo_n_8,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_n_8	139,2,2
turbo_n_8,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_n_8	139,0,2
turbo_n_8,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_n_8	139,3,0
turbo_n_8,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_n_8	139,5,1
turbo_n_8,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_n_8	139,2,1
turbo_n_8,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_n_8	139,2,5
turbo_n_8,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_n_8	139,1,3
turbo_n_8,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_n_8	139,4,1
turbo_n_8,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_n_8	139,7,2
turbo_n_8,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_n_8	139,7,0
turbo_n_8,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_n_8	139,3,2
turbo_n_8,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_n_8	139,0,5
turbo_n_8,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_n_8	139,6,1
turbo_n_8,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_n_8	139,8,1
turbo_n_8,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_n_8	139,8,0
turbo_n_8,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_n_8	139,2,3
turbo_n_8,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_n_8	139,0,3
turbo_n_8,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_n_8	139,7,0
turbo_n_8,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_n_8	139,7,0
turbo_n_8,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_n_8	139,3,0
turbo_n_8,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_n_8	139,1,0
turbo_n_8,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_n_8	139,0,1

turbo_n_8,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_n_8	139,4,1
turbo_n_8,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_n_8	139,4,1
turbo_n_8,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_n_8	139,0,1
turbo_n_8,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_n_8	139,5,1
turbo_n_8,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_n_8	139,1,1
turbo_n_8,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_n_8	139,1,1
turbo_n_8,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_n_8	139,1,1
turbo_n_8,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_n_8	139,6,1
turbo_n_8,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_n_8	139,6,0
turbo_n_8,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_n_8	139,2,2
turbo_n_8,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_n_8	139,1,2
turbo_n_8,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_n_8	139,0,2
turbo_n_8,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_n_8	139,3,1
turbo_n_8,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_n_8	139,0,2
turbo_n_8,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_n_8	139,0,2
turbo_n_8,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_n_8	139,0,2
turbo_n_8,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_n_8	139,0,2
turbo_n_8,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_n_8	139,12,1
turbo_n_8,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_n_8	139,12,0
turbo_n_8,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_n_8	139,2,1
turbo_n_8,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_n_8	139,2,1
turbo_n_8,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_n_8	139,16,1
turbo_n_8,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_n_8	139,1,0
turbo_n_8,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_n_8	139,1,4
turbo_n_8,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_n_8	139,2,2
turbo_n_8,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_n_8	139,1,2
turbo_n_8,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_n_8	139,1,0
turbo_n_8,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_n_8	139,0,0

turbo_n_8,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_n_8	139,5,2
turbo_n_8,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_n_8	139,0,1
turbo_n_8,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_n_8	139,14,0
turbo_n_8,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_n_8	139,14,0
turbo_n_8,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_n_8	139,3,3
turbo_n_8,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_n_8	139,0,3
turbo_n_8,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_n_8	139,5,1
turbo_n_8,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_n_8	139,0,1
turbo_n_8,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_n_8	139,0,1
turbo_n_8,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_n_8	139,3,2
turbo_n_8,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_n_8	139,0,2
turbo_n_8,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_n_8	139,17,1
turbo_n_8,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_n_8	139,10,1
turbo_n_8,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_n_8	139,1,2
turbo_n_8,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_n_8	139,1,2

turbo_n_8,168,363,0	duplicate(通過1#turbo)	通過1#turbo_n_8	45,1,1

turbo_n_8,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_n_8	139,1,1
turbo_n_8,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_n_8	139,1,1
turbo_n_8,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_n_8	139,1,1
turbo_n_8,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_n_8	139,1,1
turbo_n_8,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_n_8	139,1,1
turbo_n_8,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_n_8	139,1,1
turbo_n_8,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_n_8	139,2,2

turbo_n_8,258,364,0	duplicate(通過2#turbo)	通過2#turbo_n_8	45,1,1

turbo_n_8,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_n_8	139,3,3
turbo_n_8,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_n_8	139,3,3
turbo_n_8,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_n_8	139,1,1
turbo_n_8,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_n_8	139,3,3
turbo_n_8,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_n_8	139,1,1
turbo_n_8,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_n_8	139,3,3
turbo_n_8,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_n_8	139,3,3
turbo_n_8,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_n_8	139,3,3
turbo_n_8,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_n_8	139,2,2
turbo_n_8,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_n_8	139,1,1
turbo_n_8,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_n_8	139,3,3
turbo_n_8,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_n_8	139,1,1
turbo_n_8,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_n_8	139,2,2
turbo_n_8,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_n_8	139,9,9
turbo_n_8,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_n_8	139,3,3
turbo_n_8,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_n_8	139,1,1
turbo_n_8,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_n_8	139,3,3
turbo_n_8,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_n_8	139,2,2
turbo_n_8,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_n_8	139,3,3
turbo_n_8,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_n_8	139,1,1
turbo_n_8,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_n_8	139,3,3
turbo_n_8,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_n_8	139,2,2
turbo_n_8,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_n_8	139,1,1

turbo_n_8,355,362,0	duplicate(広告#turbo)	広告#turbo_n_8	139,3,3

turbo_n_8,385,365,0	duplicate(通過3#turbo)	通過3#turbo_n_8	45,1,1

turbo_n_8,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_n_8	139,1,1

turbo_n_8,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_n_8		139,0,2
turbo_n_8,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_n_8		139,1,0
turbo_n_8,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_n_8		139,1,0
turbo_n_8,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_n_8		139,0,1
turbo_n_8,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_n_8		139,1,0
turbo_n_8,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_n_8		139,1,0
turbo_n_8,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_n_8		139,0,1
turbo_n_8,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_n_8		139,1,0
turbo_n_8,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_n_8		139,0,1
turbo_n_8,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_n_8	139,1,0
turbo_n_8,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_n_8	139,0,1
turbo_n_8,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_n_8	139,1,0
turbo_n_8,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_n_8	139,1,0
turbo_n_8,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_n_8	139,1,0
turbo_n_8,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_n_8	139,1,0
turbo_n_8,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_n_8	139,0,1
turbo_n_8,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_n_8	139,1,0
turbo_n_8,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_n_8	139,0,1
turbo_n_8,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_n_8	139,0,1
turbo_n_8,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_n_8	139,0,1
turbo_n_8,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_n_8	139,0,1
turbo_n_8,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_n_8	139,2,0
turbo_n_8,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_n_8	139,2,0
turbo_n_8,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_n_8	139,0,1
turbo_n_8,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_n_8	139,0,1
turbo_n_8,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_n_8	139,2,0
turbo_n_8,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_n_8	139,1,0
turbo_n_8,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_n_8	139,0,1
turbo_n_8,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_n_8	139,0,1
turbo_n_8,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_n_8	139,1,0
turbo_n_8,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_n_8	139,1,1
turbo_n_8,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_n_8	139,1,0
turbo_n_8,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_n_8	139,1,1
turbo_n_8,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_n_8	139,1,1
turbo_n_8,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_n_8	139,2,0
turbo_n_8,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_n_8	139,1,1
turbo_n_8,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_n_8	139,2,0
turbo_n_8,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_n_8	139,1,0
turbo_n_8,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_n_8	139,1,1
turbo_n_8,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_n_8	139,1,1
turbo_n_8,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_n_8	139,1,1
turbo_n_8,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_n_8	139,1,1
turbo_n_8,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_n_8	139,1,1
turbo_n_8,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_n_8	139,1,1
turbo_n_8,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_n_8	139,1,1
turbo_n_8,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_n_8	139,1,0
turbo_n_8,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_n_8	139,2,1
turbo_n_8,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_n_8	139,1,1
turbo_n_8,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_n_8	139,0,1
turbo_n_8,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_n_8	139,1,0

turbo_n_8,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_n_8	139,3,3

turbo_n_8,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_n_8	45,1,1
turbo_n_8,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_n_8	45,1,1

turbo_n_8,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_n_8	45,3,3
turbo_n_8,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_n_8	45,3,3

turbo_n_8,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_n_8	139,2,2

turbo_n_8,250,200,0	duplicate(通過5#turbo)	通過5#turbo_n_8	45,1,1

turbo_n_8,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_n_8	45,1,1
turbo_n_8,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_n_8	45,1,1
turbo_n_8,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_n_8	45,1,1
turbo_n_8,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_n_8	45,1,1

turbo_n_8,389,275,0	duplicate(通過6#turbo)	通過6#turbo_n_8	45,1,1

turbo_n_8,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_n_8	139,3,3

turbo_n_8,93,19,0	duplicate(通過7#turbo)	通過7#turbo_n_8	45,1,1

turbo_n_8,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_n_8	139,1,1
turbo_n_8,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_n_8	139,1,1
turbo_n_8,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_n_8	139,1,1
turbo_n_8,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_n_8	139,1,1
turbo_n_8,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_n_8	139,1,1
turbo_n_8,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_n_8	139,1,1
turbo_n_8,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_n_8	139,1,1
turbo_n_8,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_n_8	139,1,1
turbo_n_8,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_n_8	139,1,1
turbo_n_8,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_n_8	139,1,1
turbo_n_8,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_n_8	139,1,1
turbo_n_8,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_n_8	139,1,1
turbo_n_8,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_n_8	139,1,1
turbo_n_8,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_n_8	139,1,1
turbo_n_8,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_n_8	139,1,1
turbo_n_8,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_n_8	139,1,1
turbo_n_8,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_n_8	139,1,1
turbo_n_8,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_n_8	139,1,1
turbo_n_8,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_n_8	139,1,1
turbo_n_8,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_n_8	139,1,1
turbo_n_8,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_n_8	139,1,1
turbo_n_8,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_n_8	139,1,1
turbo_n_8,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_n_8	139,1,1
turbo_n_8,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_n_8	139,1,1
turbo_n_8,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_n_8	139,1,1
turbo_n_8,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_n_8	139,1,1
turbo_n_8,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_n_8	139,1,1
turbo_n_8,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_n_8	139,1,1
turbo_n_8,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_n_8	139,1,1
turbo_n_8,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_n_8	139,1,1
turbo_n_8,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_n_8	139,1,1
turbo_n_8,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_n_8	139,1,1
turbo_n_8,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_n_8	139,1,1
turbo_n_8,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_n_8	139,1,1
turbo_n_8,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_n_8	139,1,1
turbo_n_8,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_n_8	139,1,1
turbo_n_8,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_n_8	139,1,1
turbo_n_8,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_n_8	139,1,1
turbo_n_8,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_n_8	139,1,1
turbo_n_8,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_n_8	139,1,1
turbo_n_8,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_n_8	139,1,1
turbo_n_8,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_n_8	139,1,1
turbo_n_8,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_n_8	139,1,1
turbo_n_8,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_n_8	139,1,1
turbo_n_8,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_n_8	139,1,1
turbo_n_8,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_n_8	139,1,1
turbo_n_8,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_n_8	139,1,1
turbo_n_8,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_n_8	139,1,1
turbo_n_8,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_n_8	139,1,1
turbo_n_8,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_n_8	139,1,1
turbo_n_8,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_n_8	139,1,1
turbo_n_8,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_n_8	139,1,1
turbo_n_8,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_n_8	139,1,1
turbo_n_8,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_n_8	139,1,1
turbo_n_8,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_n_8	139,1,1
turbo_n_8,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_n_8	139,1,1
turbo_n_8,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_n_8	139,1,1
turbo_n_8,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_n_8	139,1,1
turbo_n_8,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_n_8	139,1,1
turbo_n_8,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_n_8	139,1,1
turbo_n_8,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_n_8	139,1,1
turbo_n_8,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_n_8	139,1,1
turbo_n_8,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_n_8	139,1,1
turbo_n_8,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_n_8	139,1,1
turbo_n_8,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_n_8	139,1,1
turbo_n_8,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_n_8	139,1,1
turbo_n_8,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_n_8	139,1,1
turbo_n_8,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_n_8	139,1,1
turbo_n_8,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_n_8	139,1,1
turbo_n_8,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_n_8	139,1,1
turbo_n_8,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_n_8	139,1,1
turbo_n_8,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_n_8	139,1,1
turbo_n_8,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_n_8	139,1,1
turbo_n_8,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_n_8	139,1,1
turbo_n_8,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_n_8	139,1,1
turbo_n_8,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_n_8	139,1,1
turbo_n_8,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_n_8	139,1,1
turbo_n_8,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_n_8	139,1,1
turbo_n_8,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_n_8	139,1,1
turbo_n_8,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_n_8	139,1,1
turbo_n_8,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_n_8	139,1,1
turbo_n_8,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_n_8	139,1,1
turbo_n_8,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_n_8	139,1,1
turbo_n_8,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_n_8	139,1,1
turbo_n_8,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_n_8	139,1,1
turbo_n_8,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_n_8	139,1,1
turbo_n_8,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_n_8	139,1,1
turbo_n_8,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_n_8	139,1,1
turbo_n_8,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_n_8	139,1,1
turbo_n_8,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_n_8	139,1,1
turbo_n_8,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_n_8	139,1,1
turbo_n_8,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_n_8	139,1,1
turbo_n_8,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_n_8	139,1,1
turbo_n_8,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_n_8	139,1,1
turbo_n_8,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_n_8	139,1,1

turbo_n_8,371,47,0	script	ゴール1#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",30,1,2;
	end;
}
turbo_n_8,371,47,0	script	ゴール2#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",20,2,2;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_8,371,47,0	script	ゴール3#turbo_n_8	45,1,1,{
	callfunc "TurboGoal","turbo_n_8",20,3,2;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_n_8,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_n_8	47

//==============================================================
// 一般・16人モード
//==============================================================
turbo_room,91,135,3	script	一般・16人モード#turbo	124,{
	end;
OnInit:
	waitingroom "一般・16人モード",20,"一般・16人モード#turbo::OnStart",16,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 16; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_n_16::OnStart";
	warpwaitingpc "turbo_n_16",298,161;
	end;
}

turbo_n_16,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_n_16	124

turbo_n_16,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_n_16	139,0,15
turbo_n_16,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_n_16	139,5,15

turbo_n_16,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_n_16	139,44,1
turbo_n_16,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_n_16	139,3,1
turbo_n_16,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_n_16	139,1,1
turbo_n_16,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_n_16	139,0,2
turbo_n_16,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_n_16	139,0,2
turbo_n_16,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_n_16	139,1,2
turbo_n_16,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_n_16	139,1,2
turbo_n_16,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_n_16	139,2,4
turbo_n_16,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_n_16	139,0,4
turbo_n_16,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_n_16	139,7,2
turbo_n_16,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_n_16	139,6,2
turbo_n_16,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_n_16	139,0,3
turbo_n_16,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_n_16	139,1,1

turbo_n_16,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_n_16	139,2,2
turbo_n_16,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_n_16	139,0,2
turbo_n_16,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_n_16	139,3,0
turbo_n_16,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_n_16	139,5,1
turbo_n_16,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_n_16	139,2,1
turbo_n_16,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_n_16	139,2,5
turbo_n_16,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_n_16	139,1,3
turbo_n_16,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_n_16	139,4,1
turbo_n_16,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_n_16	139,7,2
turbo_n_16,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_n_16	139,7,0
turbo_n_16,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_n_16	139,3,2
turbo_n_16,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_n_16	139,0,5
turbo_n_16,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_n_16	139,6,1
turbo_n_16,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_n_16	139,8,1
turbo_n_16,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_n_16	139,8,0
turbo_n_16,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_n_16	139,2,3
turbo_n_16,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_n_16	139,0,3
turbo_n_16,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_n_16	139,7,0
turbo_n_16,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_n_16	139,7,0
turbo_n_16,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_n_16	139,3,0
turbo_n_16,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_n_16	139,1,0
turbo_n_16,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_n_16	139,0,1

turbo_n_16,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_n_16	139,4,1
turbo_n_16,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_n_16	139,4,1
turbo_n_16,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_n_16	139,0,1
turbo_n_16,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_n_16	139,5,1
turbo_n_16,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_n_16	139,1,1
turbo_n_16,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_n_16	139,1,1
turbo_n_16,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_n_16	139,1,1
turbo_n_16,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_n_16	139,6,1
turbo_n_16,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_n_16	139,6,0
turbo_n_16,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_n_16	139,2,2
turbo_n_16,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_n_16	139,1,2
turbo_n_16,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_n_16	139,0,2
turbo_n_16,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_n_16	139,3,1
turbo_n_16,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_n_16	139,0,2
turbo_n_16,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_n_16	139,0,2
turbo_n_16,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_n_16	139,0,2
turbo_n_16,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_n_16	139,0,2
turbo_n_16,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_n_16	139,12,1
turbo_n_16,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_n_16	139,12,0
turbo_n_16,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_n_16	139,2,1
turbo_n_16,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_n_16	139,2,1
turbo_n_16,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_n_16	139,16,1
turbo_n_16,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_n_16	139,1,0
turbo_n_16,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_n_16	139,1,4
turbo_n_16,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_n_16	139,2,2
turbo_n_16,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_n_16	139,1,2
turbo_n_16,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_n_16	139,1,0
turbo_n_16,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_n_16	139,0,0

turbo_n_16,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_n_16	139,5,2
turbo_n_16,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_n_16	139,0,1
turbo_n_16,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_n_16	139,14,0
turbo_n_16,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_n_16	139,14,0
turbo_n_16,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_n_16	139,3,3
turbo_n_16,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_n_16	139,0,3
turbo_n_16,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_n_16	139,5,1
turbo_n_16,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_n_16	139,0,1
turbo_n_16,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_n_16	139,0,1
turbo_n_16,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_n_16	139,3,2
turbo_n_16,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_n_16	139,0,2
turbo_n_16,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_n_16	139,17,1
turbo_n_16,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_n_16	139,10,1
turbo_n_16,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_n_16	139,1,2
turbo_n_16,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_n_16	139,1,2

turbo_n_16,168,363,0	duplicate(通過1#turbo)	通過1#turbo_n_16	45,1,1

turbo_n_16,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_n_16	139,1,1
turbo_n_16,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_n_16	139,1,1
turbo_n_16,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_n_16	139,1,1
turbo_n_16,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_n_16	139,1,1
turbo_n_16,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_n_16	139,1,1
turbo_n_16,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_n_16	139,1,1
turbo_n_16,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_n_16	139,2,2

turbo_n_16,258,364,0	duplicate(通過2#turbo)	通過2#turbo_n_16	45,1,1

turbo_n_16,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_n_16	139,3,3
turbo_n_16,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_n_16	139,3,3
turbo_n_16,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_n_16	139,1,1
turbo_n_16,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_n_16	139,3,3
turbo_n_16,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_n_16	139,1,1
turbo_n_16,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_n_16	139,3,3
turbo_n_16,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_n_16	139,3,3
turbo_n_16,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_n_16	139,3,3
turbo_n_16,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_n_16	139,2,2
turbo_n_16,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_n_16	139,1,1
turbo_n_16,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_n_16	139,3,3
turbo_n_16,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_n_16	139,1,1
turbo_n_16,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_n_16	139,2,2
turbo_n_16,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_n_16	139,9,9
turbo_n_16,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_n_16	139,3,3
turbo_n_16,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_n_16	139,1,1
turbo_n_16,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_n_16	139,3,3
turbo_n_16,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_n_16	139,2,2
turbo_n_16,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_n_16	139,3,3
turbo_n_16,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_n_16	139,1,1
turbo_n_16,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_n_16	139,3,3
turbo_n_16,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_n_16	139,2,2
turbo_n_16,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_n_16	139,1,1

turbo_n_16,355,362,0	duplicate(広告#turbo)	広告#turbo_n_16	139,3,3

turbo_n_16,385,365,0	duplicate(通過3#turbo)	通過3#turbo_n_16	45,1,1

turbo_n_16,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_n_16	139,1,1

turbo_n_16,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_n_16		139,0,2
turbo_n_16,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_n_16		139,1,0
turbo_n_16,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_n_16		139,1,0
turbo_n_16,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_n_16		139,0,1
turbo_n_16,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_n_16		139,1,0
turbo_n_16,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_n_16		139,1,0
turbo_n_16,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_n_16		139,0,1
turbo_n_16,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_n_16		139,1,0
turbo_n_16,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_n_16		139,0,1
turbo_n_16,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_n_16	139,1,0
turbo_n_16,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_n_16	139,0,1
turbo_n_16,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_n_16	139,1,0
turbo_n_16,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_n_16	139,1,0
turbo_n_16,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_n_16	139,1,0
turbo_n_16,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_n_16	139,1,0
turbo_n_16,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_n_16	139,0,1
turbo_n_16,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_n_16	139,1,0
turbo_n_16,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_n_16	139,0,1
turbo_n_16,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_n_16	139,0,1
turbo_n_16,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_n_16	139,0,1
turbo_n_16,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_n_16	139,0,1
turbo_n_16,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_n_16	139,2,0
turbo_n_16,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_n_16	139,2,0
turbo_n_16,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_n_16	139,0,1
turbo_n_16,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_n_16	139,0,1
turbo_n_16,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_n_16	139,2,0
turbo_n_16,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_n_16	139,1,0
turbo_n_16,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_n_16	139,0,1
turbo_n_16,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_n_16	139,0,1
turbo_n_16,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_n_16	139,1,0
turbo_n_16,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_n_16	139,1,1
turbo_n_16,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_n_16	139,1,0
turbo_n_16,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_n_16	139,1,1
turbo_n_16,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_n_16	139,1,1
turbo_n_16,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_n_16	139,2,0
turbo_n_16,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_n_16	139,1,1
turbo_n_16,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_n_16	139,2,0
turbo_n_16,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_n_16	139,1,0
turbo_n_16,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_n_16	139,1,1
turbo_n_16,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_n_16	139,1,1
turbo_n_16,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_n_16	139,1,1
turbo_n_16,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_n_16	139,1,1
turbo_n_16,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_n_16	139,1,1
turbo_n_16,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_n_16	139,1,1
turbo_n_16,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_n_16	139,1,1
turbo_n_16,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_n_16	139,1,0
turbo_n_16,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_n_16	139,2,1
turbo_n_16,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_n_16	139,1,1
turbo_n_16,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_n_16	139,0,1
turbo_n_16,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_n_16	139,1,0

turbo_n_16,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_n_16	139,3,3

turbo_n_16,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_n_16	45,1,1
turbo_n_16,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_n_16	45,1,1

turbo_n_16,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_n_16	45,3,3
turbo_n_16,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_n_16	45,3,3

turbo_n_16,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_n_16	139,2,2

turbo_n_16,250,200,0	duplicate(通過5#turbo)	通過5#turbo_n_16	45,1,1

turbo_n_16,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_n_16	45,1,1
turbo_n_16,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_n_16	45,1,1
turbo_n_16,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_n_16	45,1,1
turbo_n_16,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_n_16	45,1,1

turbo_n_16,389,275,0	duplicate(通過6#turbo)	通過6#turbo_n_16	45,1,1

turbo_n_16,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_n_16	139,3,3

turbo_n_16,93,19,0	duplicate(通過7#turbo)	通過7#turbo_n_16	45,1,1

turbo_n_16,179,55,0	duplicate(通路#turbo)	通路a#turbo_n_16	139,1,1
turbo_n_16,184,45,0	duplicate(通路#turbo)	通路b#turbo_n_16	139,1,1
turbo_n_16,181,30,0	duplicate(通路#turbo)	通路c#turbo_n_16	139,1,1
turbo_n_16,186,28,0	duplicate(通路#turbo)	通路d#turbo_n_16	139,1,1
turbo_n_16,183,19,0	duplicate(通路#turbo)	通路e#turbo_n_16	139,1,1
turbo_n_16,191,37,0	duplicate(通路#turbo)	通路f#turbo_n_16	139,1,1
turbo_n_16,173,25,0	duplicate(通路#turbo)	通路g#turbo_n_16	139,1,1
turbo_n_16,201,21,0	duplicate(通路#turbo)	通路h#turbo_n_16	139,1,1
turbo_n_16,222,21,0	duplicate(通路#turbo)	通路i#turbo_n_16	139,1,1
turbo_n_16,214,39,0	duplicate(通路#turbo)	通路j#turbo_n_16	139,1,1
turbo_n_16,222,48,0	duplicate(通路#turbo)	通路k#turbo_n_16	139,1,1
turbo_n_16,214,60,0	duplicate(通路#turbo)	通路l#turbo_n_16	139,1,1
turbo_n_16,209,61,0	duplicate(通路#turbo)	通路m#turbo_n_16	139,1,1
turbo_n_16,208,56,0	duplicate(通路#turbo)	通路n#turbo_n_16	139,1,1

turbo_n_16,178,63,0	duplicate(正路#turbo)	正路1#turbo_n_16	139,1,1
turbo_n_16,182,40,0	duplicate(正路#turbo)	正路2#turbo_n_16	139,1,1
turbo_n_16,176,29,0	duplicate(正路#turbo)	正路3#turbo_n_16	139,1,1
turbo_n_16,180,25,0	duplicate(正路#turbo)	正路4#turbo_n_16	139,1,1
turbo_n_16,201,157,0	duplicate(正路#turbo)	正路5#turbo_n_16	139,1,1
turbo_n_16,203,65,0	duplicate(正路#turbo)	正路6#turbo_n_16	139,1,1
turbo_n_16,208,52,0	duplicate(正路#turbo)	正路7#turbo_n_16	139,1,1
turbo_n_16,208,26,0	duplicate(正路#turbo)	正路8#turbo_n_16	139,1,1
turbo_n_16,191,30,0	duplicate(正路#turbo)	正路9#turbo_n_16	139,1,1

turbo_n_16,187,55,0	duplicate(ヒント#turbo)	ヒント1#turbo_n_16	139,1,1
turbo_n_16,176,45,0	duplicate(ヒント#turbo)	ヒント2#turbo_n_16	139,1,1
turbo_n_16,222,26,0	duplicate(ヒント#turbo)	ヒント3#turbo_n_16	139,1,1
turbo_n_16,219,39,0	duplicate(ヒント#turbo)	ヒント4#turbo_n_16	139,1,1
turbo_n_16,222,45,0	duplicate(ヒント#turbo)	ヒント5#turbo_n_16	139,1,1
turbo_n_16,222,61,0	duplicate(ヒント#turbo)	ヒント6#turbo_n_16	139,1,1
turbo_n_16,222,65,0	duplicate(ヒント#turbo)	ヒント7#turbo_n_16	139,1,1

turbo_n_16,226,15,0	duplicate(トップ3#turbo)	トップ3#turbo_n_16	139,3,3

turbo_n_16,232,14,0	duplicate(通過8#turbo)	通過8#turbo_n_16	45,1,1

turbo_n_16,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_n_16	139,1,1
turbo_n_16,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_n_16	139,1,1
turbo_n_16,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_n_16	139,1,1
turbo_n_16,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_n_16	139,1,1
turbo_n_16,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_n_16	139,1,1
turbo_n_16,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_n_16	139,1,1
turbo_n_16,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_n_16	139,1,1
turbo_n_16,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_n_16	139,1,1
turbo_n_16,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_n_16	139,1,1
turbo_n_16,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_n_16	139,1,1
turbo_n_16,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_n_16	139,1,1
turbo_n_16,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_n_16	139,1,1
turbo_n_16,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_n_16	139,1,1
turbo_n_16,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_n_16	139,1,1
turbo_n_16,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_n_16	139,1,1
turbo_n_16,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_n_16	139,1,1
turbo_n_16,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_n_16	139,1,1
turbo_n_16,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_n_16	139,1,1
turbo_n_16,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_n_16	139,1,1
turbo_n_16,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_n_16	139,1,1
turbo_n_16,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_n_16	139,1,1
turbo_n_16,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_n_16	139,1,1
turbo_n_16,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_n_16	139,1,1
turbo_n_16,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_n_16	139,1,1
turbo_n_16,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_n_16	139,1,1
turbo_n_16,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_n_16	139,1,1
turbo_n_16,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_n_16	139,1,1
turbo_n_16,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_n_16	139,1,1
turbo_n_16,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_n_16	139,1,1
turbo_n_16,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_n_16	139,1,1
turbo_n_16,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_n_16	139,1,1
turbo_n_16,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_n_16	139,1,1
turbo_n_16,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_n_16	139,1,1
turbo_n_16,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_n_16	139,1,1
turbo_n_16,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_n_16	139,1,1
turbo_n_16,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_n_16	139,1,1
turbo_n_16,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_n_16	139,1,1
turbo_n_16,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_n_16	139,1,1
turbo_n_16,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_n_16	139,1,1
turbo_n_16,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_n_16	139,1,1
turbo_n_16,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_n_16	139,1,1
turbo_n_16,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_n_16	139,1,1
turbo_n_16,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_n_16	139,1,1
turbo_n_16,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_n_16	139,1,1
turbo_n_16,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_n_16	139,1,1
turbo_n_16,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_n_16	139,1,1
turbo_n_16,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_n_16	139,1,1
turbo_n_16,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_n_16	139,1,1
turbo_n_16,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_n_16	139,1,1
turbo_n_16,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_n_16	139,1,1
turbo_n_16,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_n_16	139,1,1
turbo_n_16,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_n_16	139,1,1
turbo_n_16,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_n_16	139,1,1
turbo_n_16,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_n_16	139,1,1
turbo_n_16,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_n_16	139,1,1
turbo_n_16,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_n_16	139,1,1
turbo_n_16,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_n_16	139,1,1
turbo_n_16,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_n_16	139,1,1
turbo_n_16,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_n_16	139,1,1
turbo_n_16,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_n_16	139,1,1
turbo_n_16,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_n_16	139,1,1
turbo_n_16,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_n_16	139,1,1
turbo_n_16,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_n_16	139,1,1
turbo_n_16,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_n_16	139,1,1
turbo_n_16,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_n_16	139,1,1
turbo_n_16,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_n_16	139,1,1
turbo_n_16,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_n_16	139,1,1
turbo_n_16,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_n_16	139,1,1
turbo_n_16,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_n_16	139,1,1
turbo_n_16,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_n_16	139,1,1
turbo_n_16,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_n_16	139,1,1
turbo_n_16,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_n_16	139,1,1
turbo_n_16,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_n_16	139,1,1
turbo_n_16,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_n_16	139,1,1
turbo_n_16,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_n_16	139,1,1
turbo_n_16,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_n_16	139,1,1
turbo_n_16,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_n_16	139,1,1
turbo_n_16,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_n_16	139,1,1
turbo_n_16,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_n_16	139,1,1
turbo_n_16,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_n_16	139,1,1
turbo_n_16,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_n_16	139,1,1
turbo_n_16,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_n_16	139,1,1
turbo_n_16,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_n_16	139,1,1
turbo_n_16,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_n_16	139,1,1
turbo_n_16,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_n_16	139,1,1
turbo_n_16,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_n_16	139,1,1
turbo_n_16,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_n_16	139,1,1
turbo_n_16,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_n_16	139,1,1
turbo_n_16,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_n_16	139,1,1
turbo_n_16,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_n_16	139,1,1
turbo_n_16,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_n_16	139,1,1
turbo_n_16,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_n_16	139,1,1
turbo_n_16,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_n_16	139,1,1
turbo_n_16,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_n_16	139,1,1
turbo_n_16,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_n_16	139,1,1

turbo_n_16,371,47,0	script	ゴール1#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",40,1,3;
	end;
}
turbo_n_16,371,47,0	script	ゴール2#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",30,2,3;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_16,371,47,0	script	ゴール3#turbo_n_16	45,1,1,{
	callfunc "TurboGoal","turbo_n_16",20,3,3;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_n_16,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_n_16	47

//==============================================================
// 熟練・4人モード
//==============================================================
turbo_room,110,135,3	script	熟練・4人モード#turbo	124,{
	end;
OnInit:
	waitingroom "熟練・4人モード",20,"熟練・4人モード#turbo::OnStart",4,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 4; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_e_4::OnStart";
	warpwaitingpc "turbo_e_4",298,161;
	end;
}

turbo_e_4,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_e_4	124

turbo_e_4,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_e_4	139,0,15
turbo_e_4,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_e_4	139,5,15

turbo_e_4,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_e_4	139,44,1
turbo_e_4,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_e_4	139,3,1
turbo_e_4,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_e_4	139,1,1
turbo_e_4,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_e_4	139,0,2
turbo_e_4,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_e_4	139,0,2
turbo_e_4,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_e_4	139,1,2
turbo_e_4,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_e_4	139,1,2
turbo_e_4,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_e_4	139,2,4
turbo_e_4,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_e_4	139,0,4
turbo_e_4,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_e_4	139,7,2
turbo_e_4,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_e_4	139,6,2
turbo_e_4,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_e_4	139,0,3
turbo_e_4,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_e_4	139,1,1

turbo_e_4,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_e_4	139,2,2
turbo_e_4,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_e_4	139,0,2
turbo_e_4,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_e_4	139,3,0
turbo_e_4,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_e_4	139,5,1
turbo_e_4,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_e_4	139,2,1
turbo_e_4,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_e_4	139,2,5
turbo_e_4,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_e_4	139,1,3
turbo_e_4,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_e_4	139,4,1
turbo_e_4,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_e_4	139,7,2
turbo_e_4,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_e_4	139,7,0
turbo_e_4,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_e_4	139,3,2
turbo_e_4,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_e_4	139,0,5
turbo_e_4,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_e_4	139,6,1
turbo_e_4,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_e_4	139,8,1
turbo_e_4,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_e_4	139,8,0
turbo_e_4,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_e_4	139,2,3
turbo_e_4,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_e_4	139,0,3
turbo_e_4,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_e_4	139,7,0
turbo_e_4,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_e_4	139,7,0
turbo_e_4,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_e_4	139,3,0
turbo_e_4,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_e_4	139,1,0
turbo_e_4,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_e_4	139,0,1

turbo_e_4,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_e_4	139,4,1
turbo_e_4,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_e_4	139,4,1
turbo_e_4,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_e_4	139,0,1
turbo_e_4,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_e_4	139,5,1
turbo_e_4,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_e_4	139,1,1
turbo_e_4,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_e_4	139,1,1
turbo_e_4,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_e_4	139,1,1
turbo_e_4,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_e_4	139,6,1
turbo_e_4,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_e_4	139,6,0
turbo_e_4,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_e_4	139,2,2
turbo_e_4,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_e_4	139,1,2
turbo_e_4,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_e_4	139,0,2
turbo_e_4,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_e_4	139,3,1
turbo_e_4,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_e_4	139,0,2
turbo_e_4,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_e_4	139,0,2
turbo_e_4,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_e_4	139,0,2
turbo_e_4,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_e_4	139,0,2
turbo_e_4,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_e_4	139,12,1
turbo_e_4,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_e_4	139,12,0
turbo_e_4,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_e_4	139,2,1
turbo_e_4,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_e_4	139,2,1
turbo_e_4,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_e_4	139,16,1
turbo_e_4,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_e_4	139,1,0
turbo_e_4,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_e_4	139,1,4
turbo_e_4,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_e_4	139,2,2
turbo_e_4,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_e_4	139,1,2
turbo_e_4,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_e_4	139,1,0
turbo_e_4,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_e_4	139,0,0

turbo_e_4,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_e_4	139,5,2
turbo_e_4,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_e_4	139,0,1
turbo_e_4,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_e_4	139,14,0
turbo_e_4,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_e_4	139,14,0
turbo_e_4,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_e_4	139,3,3
turbo_e_4,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_e_4	139,0,3
turbo_e_4,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_e_4	139,5,1
turbo_e_4,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_e_4	139,0,1
turbo_e_4,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_e_4	139,0,1
turbo_e_4,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_e_4	139,3,2
turbo_e_4,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_e_4	139,0,2
turbo_e_4,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_e_4	139,17,1
turbo_e_4,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_e_4	139,10,1
turbo_e_4,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_e_4	139,1,2
turbo_e_4,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_e_4	139,1,2

turbo_e_4,168,363,0	duplicate(通過1#turbo)	通過1#turbo_e_4	45,1,1

turbo_e_4,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_e_4	139,1,1
turbo_e_4,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_e_4	139,1,1
turbo_e_4,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_e_4	139,1,1
turbo_e_4,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_e_4	139,1,1
turbo_e_4,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_e_4	139,1,1
turbo_e_4,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_e_4	139,1,1
turbo_e_4,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_e_4	139,2,2

turbo_e_4,258,364,0	duplicate(通過2#turbo)	通過2#turbo_e_4	45,1,1

turbo_e_4,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_e_4	139,3,3
turbo_e_4,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_e_4	139,3,3
turbo_e_4,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_e_4	139,1,1
turbo_e_4,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_e_4	139,3,3
turbo_e_4,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_e_4	139,1,1
turbo_e_4,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_e_4	139,3,3
turbo_e_4,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_e_4	139,3,3
turbo_e_4,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_e_4	139,3,3
turbo_e_4,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_e_4	139,2,2
turbo_e_4,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_e_4	139,1,1
turbo_e_4,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_e_4	139,3,3
turbo_e_4,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_e_4	139,1,1
turbo_e_4,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_e_4	139,2,2
turbo_e_4,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_e_4	139,9,9
turbo_e_4,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_e_4	139,3,3
turbo_e_4,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_e_4	139,1,1
turbo_e_4,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_e_4	139,3,3
turbo_e_4,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_e_4	139,2,2
turbo_e_4,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_e_4	139,3,3
turbo_e_4,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_e_4	139,1,1
turbo_e_4,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_e_4	139,3,3
turbo_e_4,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_e_4	139,2,2
turbo_e_4,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_e_4	139,1,1

turbo_e_4,355,362,0	duplicate(広告#turbo)	広告#turbo_e_4	139,3,3

turbo_e_4,385,365,0	duplicate(通過3#turbo)	通過3#turbo_e_4	45,1,1

turbo_e_4,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_e_4	139,1,1

turbo_e_4,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_e_4		139,0,2
turbo_e_4,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_e_4		139,1,0
turbo_e_4,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_e_4		139,1,0
turbo_e_4,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_e_4		139,0,1
turbo_e_4,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_e_4		139,1,0
turbo_e_4,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_e_4		139,1,0
turbo_e_4,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_e_4		139,0,1
turbo_e_4,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_e_4		139,1,0
turbo_e_4,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_e_4		139,0,1
turbo_e_4,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_e_4	139,1,0
turbo_e_4,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_e_4	139,0,1
turbo_e_4,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_e_4	139,1,0
turbo_e_4,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_e_4	139,1,0
turbo_e_4,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_e_4	139,1,0
turbo_e_4,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_e_4	139,1,0
turbo_e_4,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_e_4	139,0,1
turbo_e_4,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_e_4	139,1,0
turbo_e_4,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_e_4	139,0,1
turbo_e_4,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_e_4	139,0,1
turbo_e_4,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_e_4	139,0,1
turbo_e_4,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_e_4	139,0,1
turbo_e_4,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_e_4	139,2,0
turbo_e_4,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_e_4	139,2,0
turbo_e_4,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_e_4	139,0,1
turbo_e_4,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_e_4	139,0,1
turbo_e_4,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_e_4	139,2,0
turbo_e_4,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_e_4	139,1,0
turbo_e_4,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_e_4	139,0,1
turbo_e_4,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_e_4	139,0,1
turbo_e_4,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_e_4	139,1,0
turbo_e_4,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_e_4	139,1,1
turbo_e_4,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_e_4	139,1,0
turbo_e_4,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_e_4	139,1,1
turbo_e_4,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_e_4	139,1,1
turbo_e_4,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_e_4	139,2,0
turbo_e_4,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_e_4	139,1,1
turbo_e_4,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_e_4	139,2,0
turbo_e_4,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_e_4	139,1,0
turbo_e_4,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_e_4	139,1,1
turbo_e_4,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_e_4	139,1,1
turbo_e_4,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_e_4	139,1,1
turbo_e_4,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_e_4	139,1,1
turbo_e_4,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_e_4	139,1,1
turbo_e_4,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_e_4	139,1,1
turbo_e_4,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_e_4	139,1,1
turbo_e_4,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_e_4	139,1,0
turbo_e_4,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_e_4	139,2,1
turbo_e_4,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_e_4	139,1,1
turbo_e_4,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_e_4	139,0,1
turbo_e_4,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_e_4	139,1,0

turbo_e_4,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_e_4	139,3,3

turbo_e_4,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_e_4	45,1,1
turbo_e_4,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_e_4	45,1,1

turbo_e_4,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_e_4	45,3,3
turbo_e_4,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_e_4	45,3,3

turbo_e_4,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_e_4	139,2,2

turbo_e_4,250,200,0	duplicate(通過5#turbo)	通過5#turbo_e_4	45,1,1

turbo_e_4,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_e_4	45,1,1
turbo_e_4,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_e_4	45,1,1
turbo_e_4,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_e_4	45,1,1
turbo_e_4,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_e_4	45,1,1

turbo_e_4,389,275,0	duplicate(通過6#turbo)	通過6#turbo_e_4	45,1,1

turbo_e_4,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_e_4	139,3,3

turbo_e_4,93,19,0	duplicate(通過7#turbo)	通過7#turbo_e_4	45,1,1

turbo_e_4,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_e_4	139,1,1
turbo_e_4,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_e_4	139,1,1
turbo_e_4,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_e_4	139,1,1
turbo_e_4,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_e_4	139,1,1
turbo_e_4,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_e_4	139,1,1
turbo_e_4,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_e_4	139,1,1
turbo_e_4,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_e_4	139,1,1
turbo_e_4,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_e_4	139,1,1
turbo_e_4,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_e_4	139,1,1
turbo_e_4,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_e_4	139,1,1
turbo_e_4,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_e_4	139,1,1
turbo_e_4,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_e_4	139,1,1
turbo_e_4,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_e_4	139,1,1
turbo_e_4,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_e_4	139,1,1
turbo_e_4,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_e_4	139,1,1
turbo_e_4,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_e_4	139,1,1
turbo_e_4,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_e_4	139,1,1
turbo_e_4,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_e_4	139,1,1
turbo_e_4,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_e_4	139,1,1
turbo_e_4,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_e_4	139,1,1
turbo_e_4,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_e_4	139,1,1
turbo_e_4,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_e_4	139,1,1
turbo_e_4,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_e_4	139,1,1
turbo_e_4,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_e_4	139,1,1
turbo_e_4,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_e_4	139,1,1
turbo_e_4,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_e_4	139,1,1
turbo_e_4,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_e_4	139,1,1
turbo_e_4,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_e_4	139,1,1
turbo_e_4,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_e_4	139,1,1
turbo_e_4,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_e_4	139,1,1
turbo_e_4,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_e_4	139,1,1
turbo_e_4,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_e_4	139,1,1
turbo_e_4,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_e_4	139,1,1
turbo_e_4,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_e_4	139,1,1
turbo_e_4,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_e_4	139,1,1
turbo_e_4,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_e_4	139,1,1
turbo_e_4,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_e_4	139,1,1
turbo_e_4,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_e_4	139,1,1
turbo_e_4,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_e_4	139,1,1
turbo_e_4,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_e_4	139,1,1
turbo_e_4,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_e_4	139,1,1
turbo_e_4,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_e_4	139,1,1
turbo_e_4,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_e_4	139,1,1
turbo_e_4,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_e_4	139,1,1
turbo_e_4,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_e_4	139,1,1
turbo_e_4,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_e_4	139,1,1
turbo_e_4,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_e_4	139,1,1
turbo_e_4,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_e_4	139,1,1
turbo_e_4,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_e_4	139,1,1
turbo_e_4,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_e_4	139,1,1
turbo_e_4,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_e_4	139,1,1
turbo_e_4,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_e_4	139,1,1
turbo_e_4,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_e_4	139,1,1
turbo_e_4,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_e_4	139,1,1
turbo_e_4,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_e_4	139,1,1
turbo_e_4,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_e_4	139,1,1
turbo_e_4,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_e_4	139,1,1
turbo_e_4,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_e_4	139,1,1
turbo_e_4,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_e_4	139,1,1
turbo_e_4,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_e_4	139,1,1
turbo_e_4,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_e_4	139,1,1
turbo_e_4,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_e_4	139,1,1
turbo_e_4,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_e_4	139,1,1
turbo_e_4,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_e_4	139,1,1
turbo_e_4,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_e_4	139,1,1
turbo_e_4,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_e_4	139,1,1
turbo_e_4,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_e_4	139,1,1
turbo_e_4,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_e_4	139,1,1
turbo_e_4,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_e_4	139,1,1
turbo_e_4,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_e_4	139,1,1
turbo_e_4,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_e_4	139,1,1
turbo_e_4,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_e_4	139,1,1
turbo_e_4,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_e_4	139,1,1
turbo_e_4,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_e_4	139,1,1
turbo_e_4,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_e_4	139,1,1
turbo_e_4,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_e_4	139,1,1
turbo_e_4,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_e_4	139,1,1
turbo_e_4,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_e_4	139,1,1
turbo_e_4,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_e_4	139,1,1
turbo_e_4,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_e_4	139,1,1
turbo_e_4,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_e_4	139,1,1
turbo_e_4,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_e_4	139,1,1
turbo_e_4,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_e_4	139,1,1
turbo_e_4,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_e_4	139,1,1
turbo_e_4,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_e_4	139,1,1
turbo_e_4,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_e_4	139,1,1
turbo_e_4,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_e_4	139,1,1
turbo_e_4,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_e_4	139,1,1
turbo_e_4,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_e_4	139,1,1
turbo_e_4,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_e_4	139,1,1
turbo_e_4,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_e_4	139,1,1
turbo_e_4,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_e_4	139,1,1
turbo_e_4,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_e_4	139,1,1
turbo_e_4,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_e_4	139,1,1
turbo_e_4,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_e_4	139,1,1

turbo_e_4,371,47,0	script	ゴール1#turbo_e_4	45,1,1,{
	callfunc "TurboGoal","turbo_e_4",40,1,11;
	end;
}

turbo_e_4,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_e_4	47

//==============================================================
// 熟練・8人モード
//==============================================================
turbo_room,117,135,3	script	熟練・8人モード#turbo	124,{
	end;
OnInit:
	waitingroom "熟練・8人モード",20,"熟練・8人モード#turbo::OnStart",8,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 8; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_e_8::OnStart";
	warpwaitingpc "turbo_e_8",298,161;
	end;
}

turbo_e_8,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_e_8	124

turbo_e_8,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_e_8	139,0,15
turbo_e_8,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_e_8	139,5,15

turbo_e_8,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_e_8	139,44,1
turbo_e_8,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_e_8	139,3,1
turbo_e_8,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_e_8	139,1,1
turbo_e_8,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_e_8	139,0,2
turbo_e_8,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_e_8	139,0,2
turbo_e_8,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_e_8	139,1,2
turbo_e_8,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_e_8	139,1,2
turbo_e_8,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_e_8	139,2,4
turbo_e_8,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_e_8	139,0,4
turbo_e_8,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_e_8	139,7,2
turbo_e_8,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_e_8	139,6,2
turbo_e_8,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_e_8	139,0,3
turbo_e_8,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_e_8	139,1,1

turbo_e_8,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_e_8	139,2,2
turbo_e_8,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_e_8	139,0,2
turbo_e_8,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_e_8	139,3,0
turbo_e_8,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_e_8	139,5,1
turbo_e_8,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_e_8	139,2,1
turbo_e_8,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_e_8	139,2,5
turbo_e_8,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_e_8	139,1,3
turbo_e_8,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_e_8	139,4,1
turbo_e_8,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_e_8	139,7,2
turbo_e_8,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_e_8	139,7,0
turbo_e_8,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_e_8	139,3,2
turbo_e_8,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_e_8	139,0,5
turbo_e_8,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_e_8	139,6,1
turbo_e_8,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_e_8	139,8,1
turbo_e_8,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_e_8	139,8,0
turbo_e_8,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_e_8	139,2,3
turbo_e_8,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_e_8	139,0,3
turbo_e_8,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_e_8	139,7,0
turbo_e_8,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_e_8	139,7,0
turbo_e_8,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_e_8	139,3,0
turbo_e_8,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_e_8	139,1,0
turbo_e_8,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_e_8	139,0,1

turbo_e_8,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_e_8	139,4,1
turbo_e_8,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_e_8	139,4,1
turbo_e_8,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_e_8	139,0,1
turbo_e_8,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_e_8	139,5,1
turbo_e_8,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_e_8	139,1,1
turbo_e_8,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_e_8	139,1,1
turbo_e_8,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_e_8	139,1,1
turbo_e_8,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_e_8	139,6,1
turbo_e_8,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_e_8	139,6,0
turbo_e_8,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_e_8	139,2,2
turbo_e_8,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_e_8	139,1,2
turbo_e_8,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_e_8	139,0,2
turbo_e_8,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_e_8	139,3,1
turbo_e_8,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_e_8	139,0,2
turbo_e_8,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_e_8	139,0,2
turbo_e_8,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_e_8	139,0,2
turbo_e_8,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_e_8	139,0,2
turbo_e_8,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_e_8	139,12,1
turbo_e_8,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_e_8	139,12,0
turbo_e_8,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_e_8	139,2,1
turbo_e_8,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_e_8	139,2,1
turbo_e_8,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_e_8	139,16,1
turbo_e_8,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_e_8	139,1,0
turbo_e_8,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_e_8	139,1,4
turbo_e_8,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_e_8	139,2,2
turbo_e_8,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_e_8	139,1,2
turbo_e_8,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_e_8	139,1,0
turbo_e_8,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_e_8	139,0,0

turbo_e_8,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_e_8	139,5,2
turbo_e_8,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_e_8	139,0,1
turbo_e_8,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_e_8	139,14,0
turbo_e_8,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_e_8	139,14,0
turbo_e_8,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_e_8	139,3,3
turbo_e_8,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_e_8	139,0,3
turbo_e_8,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_e_8	139,5,1
turbo_e_8,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_e_8	139,0,1
turbo_e_8,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_e_8	139,0,1
turbo_e_8,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_e_8	139,3,2
turbo_e_8,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_e_8	139,0,2
turbo_e_8,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_e_8	139,17,1
turbo_e_8,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_e_8	139,10,1
turbo_e_8,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_e_8	139,1,2
turbo_e_8,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_e_8	139,1,2

turbo_e_8,168,363,0	duplicate(通過1#turbo)	通過1#turbo_e_8	45,1,1

turbo_e_8,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_e_8	139,1,1
turbo_e_8,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_e_8	139,1,1
turbo_e_8,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_e_8	139,1,1
turbo_e_8,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_e_8	139,1,1
turbo_e_8,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_e_8	139,1,1
turbo_e_8,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_e_8	139,1,1
turbo_e_8,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_e_8	139,2,2

turbo_e_8,258,364,0	duplicate(通過2#turbo)	通過2#turbo_e_8	45,1,1

turbo_e_8,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_e_8	139,3,3
turbo_e_8,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_e_8	139,3,3
turbo_e_8,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_e_8	139,1,1
turbo_e_8,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_e_8	139,3,3
turbo_e_8,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_e_8	139,1,1
turbo_e_8,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_e_8	139,3,3
turbo_e_8,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_e_8	139,3,3
turbo_e_8,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_e_8	139,3,3
turbo_e_8,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_e_8	139,2,2
turbo_e_8,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_e_8	139,1,1
turbo_e_8,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_e_8	139,3,3
turbo_e_8,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_e_8	139,1,1
turbo_e_8,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_e_8	139,2,2
turbo_e_8,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_e_8	139,9,9
turbo_e_8,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_e_8	139,3,3
turbo_e_8,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_e_8	139,1,1
turbo_e_8,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_e_8	139,3,3
turbo_e_8,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_e_8	139,2,2
turbo_e_8,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_e_8	139,3,3
turbo_e_8,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_e_8	139,1,1
turbo_e_8,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_e_8	139,3,3
turbo_e_8,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_e_8	139,2,2
turbo_e_8,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_e_8	139,1,1

turbo_e_8,355,362,0	duplicate(広告#turbo)	広告#turbo_e_8	139,3,3

turbo_e_8,385,365,0	duplicate(通過3#turbo)	通過3#turbo_e_8	45,1,1

turbo_e_8,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_e_8	139,1,1

turbo_e_8,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_e_8		139,0,2
turbo_e_8,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_e_8		139,1,0
turbo_e_8,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_e_8		139,1,0
turbo_e_8,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_e_8		139,0,1
turbo_e_8,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_e_8		139,1,0
turbo_e_8,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_e_8		139,1,0
turbo_e_8,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_e_8		139,0,1
turbo_e_8,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_e_8		139,1,0
turbo_e_8,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_e_8		139,0,1
turbo_e_8,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_e_8	139,1,0
turbo_e_8,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_e_8	139,0,1
turbo_e_8,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_e_8	139,1,0
turbo_e_8,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_e_8	139,1,0
turbo_e_8,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_e_8	139,1,0
turbo_e_8,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_e_8	139,1,0
turbo_e_8,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_e_8	139,0,1
turbo_e_8,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_e_8	139,1,0
turbo_e_8,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_e_8	139,0,1
turbo_e_8,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_e_8	139,0,1
turbo_e_8,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_e_8	139,0,1
turbo_e_8,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_e_8	139,0,1
turbo_e_8,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_e_8	139,2,0
turbo_e_8,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_e_8	139,2,0
turbo_e_8,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_e_8	139,0,1
turbo_e_8,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_e_8	139,0,1
turbo_e_8,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_e_8	139,2,0
turbo_e_8,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_e_8	139,1,0
turbo_e_8,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_e_8	139,0,1
turbo_e_8,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_e_8	139,0,1
turbo_e_8,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_e_8	139,1,0
turbo_e_8,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_e_8	139,1,1
turbo_e_8,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_e_8	139,1,0
turbo_e_8,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_e_8	139,1,1
turbo_e_8,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_e_8	139,1,1
turbo_e_8,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_e_8	139,2,0
turbo_e_8,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_e_8	139,1,1
turbo_e_8,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_e_8	139,2,0
turbo_e_8,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_e_8	139,1,0
turbo_e_8,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_e_8	139,1,1
turbo_e_8,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_e_8	139,1,1
turbo_e_8,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_e_8	139,1,1
turbo_e_8,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_e_8	139,1,1
turbo_e_8,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_e_8	139,1,1
turbo_e_8,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_e_8	139,1,1
turbo_e_8,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_e_8	139,1,1
turbo_e_8,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_e_8	139,1,0
turbo_e_8,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_e_8	139,2,1
turbo_e_8,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_e_8	139,1,1
turbo_e_8,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_e_8	139,0,1
turbo_e_8,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_e_8	139,1,0

turbo_e_8,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_e_8	139,3,3

turbo_e_8,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_e_8	45,1,1
turbo_e_8,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_e_8	45,1,1

turbo_e_8,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_e_8	45,3,3
turbo_e_8,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_e_8	45,3,3

turbo_e_8,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_e_8	139,2,2

turbo_e_8,250,200,0	duplicate(通過5#turbo)	通過5#turbo_e_8	45,1,1

turbo_e_8,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_e_8	45,1,1
turbo_e_8,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_e_8	45,1,1
turbo_e_8,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_e_8	45,1,1
turbo_e_8,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_e_8	45,1,1

turbo_e_8,389,275,0	duplicate(通過6#turbo)	通過6#turbo_e_8	45,1,1

turbo_e_8,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_e_8	139,3,3

turbo_e_8,93,19,0	duplicate(通過7#turbo)	通過7#turbo_e_8	45,1,1

turbo_e_8,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_e_8	139,1,1
turbo_e_8,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_e_8	139,1,1
turbo_e_8,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_e_8	139,1,1
turbo_e_8,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_e_8	139,1,1
turbo_e_8,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_e_8	139,1,1
turbo_e_8,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_e_8	139,1,1
turbo_e_8,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_e_8	139,1,1
turbo_e_8,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_e_8	139,1,1
turbo_e_8,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_e_8	139,1,1
turbo_e_8,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_e_8	139,1,1
turbo_e_8,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_e_8	139,1,1
turbo_e_8,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_e_8	139,1,1
turbo_e_8,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_e_8	139,1,1
turbo_e_8,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_e_8	139,1,1
turbo_e_8,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_e_8	139,1,1
turbo_e_8,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_e_8	139,1,1
turbo_e_8,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_e_8	139,1,1
turbo_e_8,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_e_8	139,1,1
turbo_e_8,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_e_8	139,1,1
turbo_e_8,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_e_8	139,1,1
turbo_e_8,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_e_8	139,1,1
turbo_e_8,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_e_8	139,1,1
turbo_e_8,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_e_8	139,1,1
turbo_e_8,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_e_8	139,1,1
turbo_e_8,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_e_8	139,1,1
turbo_e_8,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_e_8	139,1,1
turbo_e_8,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_e_8	139,1,1
turbo_e_8,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_e_8	139,1,1
turbo_e_8,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_e_8	139,1,1
turbo_e_8,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_e_8	139,1,1
turbo_e_8,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_e_8	139,1,1
turbo_e_8,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_e_8	139,1,1
turbo_e_8,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_e_8	139,1,1
turbo_e_8,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_e_8	139,1,1
turbo_e_8,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_e_8	139,1,1
turbo_e_8,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_e_8	139,1,1
turbo_e_8,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_e_8	139,1,1
turbo_e_8,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_e_8	139,1,1
turbo_e_8,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_e_8	139,1,1
turbo_e_8,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_e_8	139,1,1
turbo_e_8,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_e_8	139,1,1
turbo_e_8,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_e_8	139,1,1
turbo_e_8,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_e_8	139,1,1
turbo_e_8,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_e_8	139,1,1
turbo_e_8,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_e_8	139,1,1
turbo_e_8,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_e_8	139,1,1
turbo_e_8,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_e_8	139,1,1
turbo_e_8,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_e_8	139,1,1
turbo_e_8,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_e_8	139,1,1
turbo_e_8,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_e_8	139,1,1
turbo_e_8,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_e_8	139,1,1
turbo_e_8,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_e_8	139,1,1
turbo_e_8,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_e_8	139,1,1
turbo_e_8,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_e_8	139,1,1
turbo_e_8,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_e_8	139,1,1
turbo_e_8,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_e_8	139,1,1
turbo_e_8,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_e_8	139,1,1
turbo_e_8,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_e_8	139,1,1
turbo_e_8,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_e_8	139,1,1
turbo_e_8,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_e_8	139,1,1
turbo_e_8,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_e_8	139,1,1
turbo_e_8,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_e_8	139,1,1
turbo_e_8,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_e_8	139,1,1
turbo_e_8,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_e_8	139,1,1
turbo_e_8,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_e_8	139,1,1
turbo_e_8,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_e_8	139,1,1
turbo_e_8,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_e_8	139,1,1
turbo_e_8,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_e_8	139,1,1
turbo_e_8,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_e_8	139,1,1
turbo_e_8,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_e_8	139,1,1
turbo_e_8,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_e_8	139,1,1
turbo_e_8,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_e_8	139,1,1
turbo_e_8,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_e_8	139,1,1
turbo_e_8,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_e_8	139,1,1
turbo_e_8,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_e_8	139,1,1
turbo_e_8,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_e_8	139,1,1
turbo_e_8,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_e_8	139,1,1
turbo_e_8,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_e_8	139,1,1
turbo_e_8,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_e_8	139,1,1
turbo_e_8,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_e_8	139,1,1
turbo_e_8,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_e_8	139,1,1
turbo_e_8,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_e_8	139,1,1
turbo_e_8,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_e_8	139,1,1
turbo_e_8,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_e_8	139,1,1
turbo_e_8,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_e_8	139,1,1
turbo_e_8,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_e_8	139,1,1
turbo_e_8,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_e_8	139,1,1
turbo_e_8,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_e_8	139,1,1
turbo_e_8,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_e_8	139,1,1
turbo_e_8,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_e_8	139,1,1
turbo_e_8,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_e_8	139,1,1
turbo_e_8,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_e_8	139,1,1
turbo_e_8,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_e_8	139,1,1
turbo_e_8,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_e_8	139,1,1
turbo_e_8,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_e_8	139,1,1

turbo_e_8,371,47,0	script	ゴール1#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",50,1,12;
	end;
}
turbo_e_8,371,47,0	script	ゴール2#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",40,2,12;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_e_8,371,47,0	script	ゴール3#turbo_e_8	45,1,1,{
	callfunc "TurboGoal","turbo_e_8",30,3,12;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_e_8,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_e_8	47

//==============================================================
// 熟練・16人モード
//==============================================================
turbo_room,124,135,3	script	熟練・16人モード#turbo	124,{
	end;
OnInit:
	waitingroom "熟練・16人モード",20,"熟練・16人モード#turbo::OnStart",16,1000,10,150;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid .@accid;
	for(set .@i,0; .@i < 16; set .@i,.@i+1) {
		if(attachrid(.@accid[.@i])) {
			if(Zeny >= 1000)
				set Zeny,Zeny-1000;
			else
				waitingroomkick strnpcinfo(0), .@accid[.@i];
		}
	}
	donpcevent "コンパニオン#turbo_e_16::OnStart";
	warpwaitingpc "turbo_e_16",298,161;
	end;
}

turbo_e_16,298,167,3	duplicate(コンパニオン#turbo)	コンパニオン#turbo_e_16	124

turbo_e_16,62,364,0	duplicate(フライング1#turbo)	フライング1#turbo_e_16	139,0,15
turbo_e_16,68,364,0	duplicate(フライング2#turbo)	フライング2#turbo_e_16	139,5,15

turbo_e_16,118,377,0	duplicate(落とし穴#turbo)	落とし穴a1#turbo_e_16	139,44,1
turbo_e_16,77,375,0	duplicate(落とし穴#turbo)	落とし穴a2#turbo_e_16	139,3,1
turbo_e_16,82,375,0	duplicate(落とし穴#turbo)	落とし穴a3#turbo_e_16	139,1,1
turbo_e_16,82,372,0	duplicate(落とし穴#turbo)	落とし穴a4#turbo_e_16	139,0,2
turbo_e_16,83,372,0	duplicate(落とし穴#turbo)	落とし穴a5#turbo_e_16	139,0,2
turbo_e_16,97,374,0	duplicate(落とし穴#turbo)	落とし穴a6#turbo_e_16	139,1,2
turbo_e_16,98,374,0	duplicate(落とし穴#turbo)	落とし穴a7#turbo_e_16	139,1,2
turbo_e_16,122,372,0	duplicate(落とし穴#turbo)	落とし穴a8#turbo_e_16	139,2,4
turbo_e_16,125,374,0	duplicate(落とし穴#turbo)	落とし穴a9#turbo_e_16	139,0,4
turbo_e_16,132,374,0	duplicate(落とし穴#turbo)	落とし穴a10#turbo_e_16	139,7,2
turbo_e_16,156,374,0	duplicate(落とし穴#turbo)	落とし穴a11#turbo_e_16	139,6,2
turbo_e_16,163,375,0	duplicate(落とし穴#turbo)	落とし穴a12#turbo_e_16	139,0,3
turbo_e_16,164,377,0	duplicate(落とし穴#turbo)	落とし穴a13#turbo_e_16	139,1,1

turbo_e_16,76,369,0	duplicate(落とし穴#turbo)	落とし穴b1#turbo_e_16	139,2,2
turbo_e_16,79,369,0	duplicate(落とし穴#turbo)	落とし穴b2#turbo_e_16	139,0,2
turbo_e_16,77,366,0	duplicate(落とし穴#turbo)	落とし穴b3#turbo_e_16	139,3,0
turbo_e_16,85,366,0	duplicate(落とし穴#turbo)	落とし穴b4#turbo_e_16	139,5,1
turbo_e_16,87,363,0	duplicate(落とし穴#turbo)	落とし穴b5#turbo_e_16	139,2,1
turbo_e_16,88,368,0	duplicate(落とし穴#turbo)	落とし穴b6#turbo_e_16	139,2,5
turbo_e_16,92,370,0	duplicate(落とし穴#turbo)	落とし穴b7#turbo_e_16	139,1,3
turbo_e_16,98,368,0	duplicate(落とし穴#turbo)	落とし穴b8#turbo_e_16	139,4,1
turbo_e_16,109,371,0	duplicate(落とし穴#turbo)	落とし穴b9#turbo_e_16	139,7,2
turbo_e_16,110,368,0	duplicate(落とし穴#turbo)	落とし穴b10#turbo_e_16	139,7,0
turbo_e_16,113,366,0	duplicate(落とし穴#turbo)	落とし穴b11#turbo_e_16	139,3,2
turbo_e_16,117,368,0	duplicate(落とし穴#turbo)	落とし穴b12#turbo_e_16	139,0,5
turbo_e_16,123,364,0	duplicate(落とし穴#turbo)	落とし穴b13#turbo_e_16	139,6,1
turbo_e_16,136,368,0	duplicate(落とし穴#turbo)	落とし穴b14#turbo_e_16	139,8,1
turbo_e_16,136,366,0	duplicate(落とし穴#turbo)	落とし穴b15#turbo_e_16	139,8,0
turbo_e_16,144,370,0	duplicate(落とし穴#turbo)	落とし穴b16#turbo_e_16	139,2,3
turbo_e_16,147,370,0	duplicate(落とし穴#turbo)	落とし穴b17#turbo_e_16	139,0,3
turbo_e_16,155,369,0	duplicate(落とし穴#turbo)	落とし穴b18#turbo_e_16	139,7,0
turbo_e_16,155,368,0	duplicate(落とし穴#turbo)	落とし穴b19#turbo_e_16	139,7,0
turbo_e_16,151,367,0	duplicate(落とし穴#turbo)	落とし穴b20#turbo_e_16	139,3,0
turbo_e_16,153,366,0	duplicate(落とし穴#turbo)	落とし穴b21#turbo_e_16	139,1,0
turbo_e_16,155,367,0	duplicate(落とし穴#turbo)	落とし穴b22#turbo_e_16	139,0,1

turbo_e_16,78,362,0	duplicate(落とし穴#turbo)	落とし穴c1#turbo_e_16	139,4,1
turbo_e_16,78,359,0	duplicate(落とし穴#turbo)	落とし穴c2#turbo_e_16	139,4,1
turbo_e_16,83,362,0	duplicate(落とし穴#turbo)	落とし穴c3#turbo_e_16	139,0,1
turbo_e_16,88,359,0	duplicate(落とし穴#turbo)	落とし穴c4#turbo_e_16	139,5,1
turbo_e_16,89,357,0	duplicate(落とし穴#turbo)	落とし穴c5#turbo_e_16	139,1,1
turbo_e_16,92,390,0	duplicate(落とし穴#turbo)	落とし穴c6#turbo_e_16	139,1,1
turbo_e_16,92,357,0	duplicate(落とし穴#turbo)	落とし穴c7#turbo_e_16	139,1,1
turbo_e_16,98,364,0	duplicate(落とし穴#turbo)	落とし穴c8#turbo_e_16	139,6,1
turbo_e_16,98,362,0	duplicate(落とし穴#turbo)	落とし穴c9#turbo_e_16	139,6,0
turbo_e_16,106,364,0	duplicate(落とし穴#turbo)	落とし穴c10#turbo_e_16	139,2,2
turbo_e_16,107,360,0	duplicate(落とし穴#turbo)	落とし穴c11#turbo_e_16	139,1,2
turbo_e_16,109,360,0	duplicate(落とし穴#turbo)	落とし穴c12#turbo_e_16	139,0,2
turbo_e_16,112,361,0	duplicate(落とし穴#turbo)	落とし穴c13#turbo_e_16	139,3,1
turbo_e_16,116,359,0	duplicate(落とし穴#turbo)	落とし穴c14#turbo_e_16	139,0,2
turbo_e_16,117,359,0	duplicate(落とし穴#turbo)	落とし穴c15#turbo_e_16	139,0,2
turbo_e_16,116,356,0	duplicate(落とし穴#turbo)	落とし穴c16#turbo_e_16	139,0,2
turbo_e_16,117,356,0	duplicate(落とし穴#turbo)	落とし穴c17#turbo_e_16	139,0,2
turbo_e_16,129,360,0	duplicate(落とし穴#turbo)	落とし穴c18#turbo_e_16	139,12,1
turbo_e_16,129,358,0	duplicate(落とし穴#turbo)	落とし穴c19#turbo_e_16	139,12,0
turbo_e_16,132,357,0	duplicate(落とし穴#turbo)	落とし穴c20#turbo_e_16	139,2,1
turbo_e_16,137,357,0	duplicate(落とし穴#turbo)	落とし穴c21#turbo_e_16	139,2,1
turbo_e_16,147,363,0	duplicate(落とし穴#turbo)	落とし穴c22#turbo_e_16	139,16,1
turbo_e_16,149,365,0	duplicate(落とし穴#turbo)	落とし穴c23#turbo_e_16	139,1,0
turbo_e_16,158,362,0	duplicate(落とし穴#turbo)	落とし穴c24#turbo_e_16	139,1,4
turbo_e_16,154,360,0	duplicate(落とし穴#turbo)	落とし穴c25#turbo_e_16	139,2,2
turbo_e_16,161,360,0	duplicate(落とし穴#turbo)	落とし穴c26#turbo_e_16	139,1,2
turbo_e_16,161,365,0	duplicate(落とし穴#turbo)	落とし穴c27#turbo_e_16	139,1,0
turbo_e_16,160,366,0	duplicate(落とし穴#turbo)	落とし穴c28#turbo_e_16	139,0,0

turbo_e_16,79,353,0	duplicate(落とし穴#turbo)	落とし穴d1#turbo_e_16	139,5,2
turbo_e_16,85,354,0	duplicate(落とし穴#turbo)	落とし穴d2#turbo_e_16	139,0,1
turbo_e_16,99,353,0	duplicate(落とし穴#turbo)	落とし穴d3#turbo_e_16	139,14,0
turbo_e_16,99,352,0	duplicate(落とし穴#turbo)	落とし穴d4#turbo_e_16	139,14,0
turbo_e_16,99,356,0	duplicate(落とし穴#turbo)	落とし穴d5#turbo_e_16	139,3,3
turbo_e_16,103,356,0	duplicate(落とし穴#turbo)	落とし穴d6#turbo_e_16	139,0,3
turbo_e_16,108,354,0	duplicate(落とし穴#turbo)	落とし穴d7#turbo_e_16	139,5,1
turbo_e_16,112,356,0	duplicate(落とし穴#turbo)	落とし穴d8#turbo_e_16	139,0,1
turbo_e_16,113,356,0	duplicate(落とし穴#turbo)	落とし穴d9#turbo_e_16	139,0,1
turbo_e_16,123,353,0	duplicate(落とし穴#turbo)	落とし穴d10#turbo_e_16	139,3,2
turbo_e_16,127,353,0	duplicate(落とし穴#turbo)	落とし穴d11#turbo_e_16	139,0,2
turbo_e_16,145,352,0	duplicate(落とし穴#turbo)	落とし穴d12#turbo_e_16	139,17,1
turbo_e_16,152,354,0	duplicate(落とし穴#turbo)	落とし穴d13#turbo_e_16	139,10,1
turbo_e_16,145,357,0	duplicate(落とし穴#turbo)	落とし穴d14#turbo_e_16	139,1,2
turbo_e_16,148,357,0	duplicate(落とし穴#turbo)	落とし穴d15#turbo_e_16	139,1,2

turbo_e_16,168,363,0	duplicate(通過1#turbo)	通過1#turbo_e_16	45,1,1

turbo_e_16,227,379,0	duplicate(ワープ#turbo)	ワープ1#turbo_e_16	139,1,1
turbo_e_16,237,380,0	duplicate(ワープ#turbo)	ワープ2#turbo_e_16	139,1,1
turbo_e_16,227,367,0	duplicate(ワープ#turbo)	ワープ3#turbo_e_16	139,1,1
turbo_e_16,231,360,0	duplicate(ワープ#turbo)	ワープ4#turbo_e_16	139,1,1
turbo_e_16,225,349,0	duplicate(ワープ#turbo)	ワープ5#turbo_e_16	139,1,1
turbo_e_16,249,352,0	duplicate(ワープ#turbo)	ワープ6#turbo_e_16	139,1,1
turbo_e_16,253,364,0	duplicate(ワープ#turbo)	ワープ7#turbo_e_16	139,2,2

turbo_e_16,258,364,0	duplicate(通過2#turbo)	通過2#turbo_e_16	45,1,1

turbo_e_16,322,354,0	duplicate(トラップ#turbo)	トラップ1#turbo_e_16	139,3,3
turbo_e_16,323,360,0	duplicate(トラップ#turbo)	トラップ2#turbo_e_16	139,3,3
turbo_e_16,324,365,0	duplicate(トラップ#turbo)	トラップ3#turbo_e_16	139,1,1
turbo_e_16,325,370,0	duplicate(トラップ#turbo)	トラップ4#turbo_e_16	139,3,3
turbo_e_16,325,375,0	duplicate(トラップ#turbo)	トラップ5#turbo_e_16	139,1,1
turbo_e_16,329,377,0	duplicate(トラップ#turbo)	トラップ6#turbo_e_16	139,3,3
turbo_e_16,338,372,0	duplicate(トラップ#turbo)	トラップ7#turbo_e_16	139,3,3
turbo_e_16,341,364,0	duplicate(トラップ#turbo)	トラップ8#turbo_e_16	139,3,3
turbo_e_16,325,359,0	duplicate(トラップ#turbo)	トラップ9#turbo_e_16	139,2,2
turbo_e_16,341,355,0	duplicate(トラップ#turbo)	トラップ10#turbo_e_16	139,1,1
turbo_e_16,350,355,0	duplicate(トラップ#turbo)	トラップ11#turbo_e_16	139,3,3
turbo_e_16,348,363,0	duplicate(トラップ#turbo)	トラップ12#turbo_e_16	139,1,1
turbo_e_16,347,370,0	duplicate(トラップ#turbo)	トラップ13#turbo_e_16	139,2,2
turbo_e_16,349,377,0	duplicate(トラップ#turbo)	トラップ14#turbo_e_16	139,9,9
turbo_e_16,362,372,0	duplicate(トラップ#turbo)	トラップ15#turbo_e_16	139,3,3
turbo_e_16,364,365,0	duplicate(トラップ#turbo)	トラップ16#turbo_e_16	139,1,1
turbo_e_16,363,357,0	duplicate(トラップ#turbo)	トラップ17#turbo_e_16	139,3,3
turbo_e_16,374,358,0	duplicate(トラップ#turbo)	トラップ18#turbo_e_16	139,2,2
turbo_e_16,371,367,0	duplicate(トラップ#turbo)	トラップ19#turbo_e_16	139,3,3
turbo_e_16,371,376,0	duplicate(トラップ#turbo)	トラップ20#turbo_e_16	139,1,1
turbo_e_16,379,375,0	duplicate(トラップ#turbo)	トラップ21#turbo_e_16	139,3,3
turbo_e_16,382,363,0	duplicate(トラップ#turbo)	トラップ22#turbo_e_16	139,2,2
turbo_e_16,381,354,0	duplicate(トラップ#turbo)	トラップ23#turbo_e_16	139,1,1

turbo_e_16,355,362,0	duplicate(広告#turbo)	広告#turbo_e_16	139,3,3

turbo_e_16,385,365,0	duplicate(通過3#turbo)	通過3#turbo_e_16	45,1,1

turbo_e_16,316,365,0	duplicate(暗闇選択#turbo)	暗闇選択#turbo_e_16	139,1,1

turbo_e_16,13,266,0	duplicate(暗闇#turbo)	暗闇1#turbo_e_16		139,0,2
turbo_e_16,24,268,0	duplicate(暗闇#turbo)	暗闇2#turbo_e_16		139,1,0
turbo_e_16,20,258,0	duplicate(暗闇#turbo)	暗闇3#turbo_e_16		139,1,0
turbo_e_16,23,251,0	duplicate(暗闇#turbo)	暗闇4#turbo_e_16		139,0,1
turbo_e_16,36,270,0	duplicate(暗闇#turbo)	暗闇5#turbo_e_16		139,1,0
turbo_e_16,22,239,0	duplicate(暗闇#turbo)	暗闇6#turbo_e_16		139,1,0
turbo_e_16,38,239,0	duplicate(暗闇#turbo)	暗闇7#turbo_e_16		139,0,1
turbo_e_16,37,237,0	duplicate(暗闇#turbo)	暗闇8#turbo_e_16		139,1,0
turbo_e_16,55,247,0	duplicate(暗闇#turbo)	暗闇9#turbo_e_16		139,0,1
turbo_e_16,55,246,0	duplicate(暗闇#turbo)	暗闇10#turbo_e_16	139,1,0
turbo_e_16,63,253,0	duplicate(暗闇#turbo)	暗闇11#turbo_e_16	139,0,1
turbo_e_16,36,216,0	duplicate(暗闇#turbo)	暗闇12#turbo_e_16	139,1,0
turbo_e_16,20,209,0	duplicate(暗闇#turbo)	暗闇13#turbo_e_16	139,1,0
turbo_e_16,28,195,0	duplicate(暗闇#turbo)	暗闇14#turbo_e_16	139,1,0
turbo_e_16,82,264,0	duplicate(暗闇#turbo)	暗闇15#turbo_e_16	139,1,0
turbo_e_16,47,185,0	duplicate(暗闇#turbo)	暗闇16#turbo_e_16	139,0,1
turbo_e_16,53,207,0	duplicate(暗闇#turbo)	暗闇17#turbo_e_16	139,1,0
turbo_e_16,54,208,0	duplicate(暗闇#turbo)	暗闇18#turbo_e_16	139,0,1
turbo_e_16,81,247,0	duplicate(暗闇#turbo)	暗闇19#turbo_e_16	139,0,1
turbo_e_16,105,257,0	duplicate(暗闇#turbo)	暗闇20#turbo_e_16	139,0,1
turbo_e_16,95,242,0	duplicate(暗闇#turbo)	暗闇21#turbo_e_16	139,0,1
turbo_e_16,77,232,0	duplicate(暗闇#turbo)	暗闇22#turbo_e_16	139,2,0
turbo_e_16,67,222,0	duplicate(暗闇#turbo)	暗闇23#turbo_e_16	139,2,0
turbo_e_16,83,206,0	duplicate(暗闇#turbo)	暗闇24#turbo_e_16	139,0,1
turbo_e_16,95,224,0	duplicate(暗闇#turbo)	暗闇25#turbo_e_16	139,0,1
turbo_e_16,106,220,0	duplicate(暗闇#turbo)	暗闇26#turbo_e_16	139,2,0
turbo_e_16,93,191,0	duplicate(暗闇#turbo)	暗闇27#turbo_e_16	139,1,0
turbo_e_16,94,192,0	duplicate(暗闇#turbo)	暗闇28#turbo_e_16	139,0,1
turbo_e_16,46,214,0	duplicate(暗闇#turbo)	暗闇29#turbo_e_16	139,0,1
turbo_e_16,16,247,0	duplicate(暗闇#turbo)	暗闇30#turbo_e_16	139,1,0
turbo_e_16,58,268,0	duplicate(暗闇#turbo)	暗闇31#turbo_e_16	139,1,1
turbo_e_16,36,253,0	duplicate(暗闇#turbo)	暗闇32#turbo_e_16	139,1,0
turbo_e_16,69,238,0	duplicate(暗闇#turbo)	暗闇33#turbo_e_16	139,1,1
turbo_e_16,58,268,0	duplicate(暗闇#turbo)	暗闇34#turbo_e_16	139,1,1
turbo_e_16,74,188,0	duplicate(暗闇#turbo)	暗闇35#turbo_e_16	139,2,0
turbo_e_16,99,207,0	duplicate(暗闇#turbo)	暗闇36#turbo_e_16	139,1,1
turbo_e_16,74,188,0	duplicate(暗闇#turbo)	暗闇37#turbo_e_16	139,2,0
turbo_e_16,111,188,0	duplicate(暗闇#turbo)	暗闇38#turbo_e_16	139,1,0
turbo_e_16,51,232,0	duplicate(暗闇#turbo)	暗闇39#turbo_e_16	139,1,1
turbo_e_16,30,232,0	duplicate(暗闇#turbo)	暗闇40#turbo_e_16	139,1,1
turbo_e_16,92,256,0	duplicate(暗闇#turbo)	暗闇41#turbo_e_16	139,1,1
turbo_e_16,79,220,0	duplicate(暗闇#turbo)	暗闇42#turbo_e_16	139,1,1
turbo_e_16,51,192,0	duplicate(暗闇#turbo)	暗闇43#turbo_e_16	139,1,1
turbo_e_16,22,227,0	duplicate(暗闇#turbo)	暗闇44#turbo_e_16	139,1,1
turbo_e_16,51,232,0	duplicate(暗闇#turbo)	暗闇45#turbo_e_16	139,1,1
turbo_e_16,42,258,0	duplicate(暗闇#turbo)	暗闇46#turbo_e_16	139,1,0
turbo_e_16,45,271,0	duplicate(暗闇#turbo)	暗闇47#turbo_e_16	139,2,1
turbo_e_16,72,207,0	duplicate(暗闇#turbo)	暗闇48#turbo_e_16	139,1,1
turbo_e_16,33,192,0	duplicate(暗闇#turbo)	暗闇49#turbo_e_16	139,0,1
turbo_e_16,90,241,0	duplicate(暗闇#turbo)	暗闇50#turbo_e_16	139,1,0

turbo_e_16,193,236,0	duplicate(暗闇解除#turbo)	暗闇解除#turbo_e_16	139,3,3

turbo_e_16,11,266,0	duplicate(暗闇出口#turbo)	暗闇出口1#turbo_e_16	45,1,1
turbo_e_16,114,190,0	duplicate(暗闇出口#turbo)	暗闇出口2#turbo_e_16	45,1,1

turbo_e_16,217,214,0	duplicate(妨害#turbo)	妨害1#turbo_e_16	45,3,3
turbo_e_16,217,214,0	duplicate(妨害#turbo)	妨害2#turbo_e_16	45,3,3

turbo_e_16,234,223,0	duplicate(トップ1#turbo)	トップ1#turbo_e_16	139,2,2

turbo_e_16,250,200,0	duplicate(通過5#turbo)	通過5#turbo_e_16	45,1,1

turbo_e_16,324,279,0	duplicate(蛇の道1#turbo)	蛇の道1#turbo_e_16	45,1,1
turbo_e_16,332,279,0	duplicate(蛇の道2#turbo)	蛇の道2#turbo_e_16	45,1,1
turbo_e_16,324,270,0	duplicate(蛇の道3#turbo)	蛇の道3#turbo_e_16	45,1,1
turbo_e_16,332,270,0	duplicate(蛇の道4#turbo)	蛇の道4#turbo_e_16	45,1,1

turbo_e_16,389,275,0	duplicate(通過6#turbo)	通過6#turbo_e_16	45,1,1

turbo_e_16,11,91,0	duplicate(トップ2#turbo)	トップ2#turbo_e_16	139,3,3

turbo_e_16,93,19,0	duplicate(通過7#turbo)	通過7#turbo_e_16	45,1,1

turbo_e_16,179,55,0	duplicate(通路#turbo)	通路a#turbo_e_16	139,1,1
turbo_e_16,184,45,0	duplicate(通路#turbo)	通路b#turbo_e_16	139,1,1
turbo_e_16,181,30,0	duplicate(通路#turbo)	通路c#turbo_e_16	139,1,1
turbo_e_16,186,28,0	duplicate(通路#turbo)	通路d#turbo_e_16	139,1,1
turbo_e_16,183,19,0	duplicate(通路#turbo)	通路e#turbo_e_16	139,1,1
turbo_e_16,191,37,0	duplicate(通路#turbo)	通路f#turbo_e_16	139,1,1
turbo_e_16,173,25,0	duplicate(通路#turbo)	通路g#turbo_e_16	139,1,1
turbo_e_16,201,21,0	duplicate(通路#turbo)	通路h#turbo_e_16	139,1,1
turbo_e_16,222,21,0	duplicate(通路#turbo)	通路i#turbo_e_16	139,1,1
turbo_e_16,214,39,0	duplicate(通路#turbo)	通路j#turbo_e_16	139,1,1
turbo_e_16,222,48,0	duplicate(通路#turbo)	通路k#turbo_e_16	139,1,1
turbo_e_16,214,60,0	duplicate(通路#turbo)	通路l#turbo_e_16	139,1,1
turbo_e_16,209,61,0	duplicate(通路#turbo)	通路m#turbo_e_16	139,1,1
turbo_e_16,208,56,0	duplicate(通路#turbo)	通路n#turbo_e_16	139,1,1

turbo_e_16,178,63,0	duplicate(正路#turbo)	正路1#turbo_e_16	139,1,1
turbo_e_16,182,40,0	duplicate(正路#turbo)	正路2#turbo_e_16	139,1,1
turbo_e_16,176,29,0	duplicate(正路#turbo)	正路3#turbo_e_16	139,1,1
turbo_e_16,180,25,0	duplicate(正路#turbo)	正路4#turbo_e_16	139,1,1
turbo_e_16,201,157,0	duplicate(正路#turbo)	正路5#turbo_e_16	139,1,1
turbo_e_16,203,65,0	duplicate(正路#turbo)	正路6#turbo_e_16	139,1,1
turbo_e_16,208,52,0	duplicate(正路#turbo)	正路7#turbo_e_16	139,1,1
turbo_e_16,208,26,0	duplicate(正路#turbo)	正路8#turbo_e_16	139,1,1
turbo_e_16,191,30,0	duplicate(正路#turbo)	正路9#turbo_e_16	139,1,1

turbo_e_16,187,55,0	duplicate(ヒント#turbo)	ヒント1#turbo_e_16	139,1,1
turbo_e_16,176,45,0	duplicate(ヒント#turbo)	ヒント2#turbo_e_16	139,1,1
turbo_e_16,222,26,0	duplicate(ヒント#turbo)	ヒント3#turbo_e_16	139,1,1
turbo_e_16,219,39,0	duplicate(ヒント#turbo)	ヒント4#turbo_e_16	139,1,1
turbo_e_16,222,45,0	duplicate(ヒント#turbo)	ヒント5#turbo_e_16	139,1,1
turbo_e_16,222,61,0	duplicate(ヒント#turbo)	ヒント6#turbo_e_16	139,1,1
turbo_e_16,222,65,0	duplicate(ヒント#turbo)	ヒント7#turbo_e_16	139,1,1

turbo_e_16,226,15,0	duplicate(トップ3#turbo)	トップ3#turbo_e_16	139,3,3

turbo_e_16,232,14,0	duplicate(通過8#turbo)	通過8#turbo_e_16	45,1,1

turbo_e_16,307,55,0	duplicate(ブラスト#turbo)	地雷1#turbo_e_16	139,1,1
turbo_e_16,307,51,0	duplicate(ブラスト#turbo)	地雷2#turbo_e_16	139,1,1
turbo_e_16,307,47,0	duplicate(ブラスト#turbo)	地雷3#turbo_e_16	139,1,1
turbo_e_16,307,43,0	duplicate(ブラスト#turbo)	地雷4#turbo_e_16	139,1,1
turbo_e_16,307,39,0	duplicate(ブラスト#turbo)	地雷5#turbo_e_16	139,1,1
turbo_e_16,312,56,0	duplicate(ブラスト#turbo)	地雷6#turbo_e_16	139,1,1
turbo_e_16,312,52,0	duplicate(ブラスト#turbo)	地雷7#turbo_e_16	139,1,1
turbo_e_16,312,48,0	duplicate(ブラスト#turbo)	地雷8#turbo_e_16	139,1,1
turbo_e_16,312,44,0	duplicate(ブラスト#turbo)	地雷9#turbo_e_16	139,1,1
turbo_e_16,312,40,0	duplicate(ブラスト#turbo)	地雷10#turbo_e_16	139,1,1
turbo_e_16,312,36,0	duplicate(ブラスト#turbo)	地雷11#turbo_e_16	139,1,1
turbo_e_16,316,55,0	duplicate(ブラスト#turbo)	地雷12#turbo_e_16	139,1,1
turbo_e_16,316,51,0	duplicate(ブラスト#turbo)	地雷13#turbo_e_16	139,1,1
turbo_e_16,316,47,0	duplicate(ブラスト#turbo)	地雷14#turbo_e_16	139,1,1
turbo_e_16,316,43,0	duplicate(ブラスト#turbo)	地雷15#turbo_e_16	139,1,1
turbo_e_16,316,39,0	duplicate(ブラスト#turbo)	地雷16#turbo_e_16	139,1,1
turbo_e_16,316,36,0	duplicate(ブラスト#turbo)	地雷17#turbo_e_16	139,1,1
turbo_e_16,320,56,0	duplicate(ブラスト#turbo)	地雷18#turbo_e_16	139,1,1
turbo_e_16,320,52,0	duplicate(ブラスト#turbo)	地雷19#turbo_e_16	139,1,1
turbo_e_16,320,48,0	duplicate(ブラスト#turbo)	地雷20#turbo_e_16	139,1,1
turbo_e_16,320,44,0	duplicate(ブラスト#turbo)	地雷21#turbo_e_16	139,1,1
turbo_e_16,320,40,0	duplicate(ブラスト#turbo)	地雷22#turbo_e_16	139,1,1
turbo_e_16,320,36,0	duplicate(ブラスト#turbo)	地雷23#turbo_e_16	139,1,1
turbo_e_16,324,55,0	duplicate(ブラスト#turbo)	地雷24#turbo_e_16	139,1,1
turbo_e_16,324,51,0	duplicate(ブラスト#turbo)	地雷25#turbo_e_16	139,1,1
turbo_e_16,324,47,0	duplicate(ブラスト#turbo)	地雷26#turbo_e_16	139,1,1
turbo_e_16,324,43,0	duplicate(ブラスト#turbo)	地雷27#turbo_e_16	139,1,1
turbo_e_16,324,39,0	duplicate(ブラスト#turbo)	地雷28#turbo_e_16	139,1,1
turbo_e_16,324,36,0	duplicate(ブラスト#turbo)	地雷29#turbo_e_16	139,1,1
turbo_e_16,328,56,0	duplicate(ブラスト#turbo)	地雷30#turbo_e_16	139,1,1
turbo_e_16,328,52,0	duplicate(ブラスト#turbo)	地雷31#turbo_e_16	139,1,1
turbo_e_16,328,48,0	duplicate(ブラスト#turbo)	地雷32#turbo_e_16	139,1,1
turbo_e_16,328,44,0	duplicate(ブラスト#turbo)	地雷33#turbo_e_16	139,1,1
turbo_e_16,328,40,0	duplicate(ブラスト#turbo)	地雷34#turbo_e_16	139,1,1
turbo_e_16,328,36,0	duplicate(ブラスト#turbo)	地雷35#turbo_e_16	139,1,1
turbo_e_16,332,55,0	duplicate(ブラスト#turbo)	地雷36#turbo_e_16	139,1,1
turbo_e_16,332,51,0	duplicate(ブラスト#turbo)	地雷37#turbo_e_16	139,1,1
turbo_e_16,332,47,0	duplicate(ブラスト#turbo)	地雷38#turbo_e_16	139,1,1
turbo_e_16,332,43,0	duplicate(ブラスト#turbo)	地雷39#turbo_e_16	139,1,1
turbo_e_16,332,39,0	duplicate(ブラスト#turbo)	地雷40#turbo_e_16	139,1,1
turbo_e_16,332,36,0	duplicate(ブラスト#turbo)	地雷41#turbo_e_16	139,1,1
turbo_e_16,336,56,0	duplicate(フリージング#turbo)	地雷42#turbo_e_16	139,1,1
turbo_e_16,336,52,0	duplicate(フリージング#turbo)	地雷43#turbo_e_16	139,1,1
turbo_e_16,336,48,0	duplicate(フリージング#turbo)	地雷44#turbo_e_16	139,1,1
turbo_e_16,336,44,0	duplicate(フリージング#turbo)	地雷45#turbo_e_16	139,1,1
turbo_e_16,336,40,0	duplicate(フリージング#turbo)	地雷46#turbo_e_16	139,1,1
turbo_e_16,336,36,0	duplicate(フリージング#turbo)	地雷47#turbo_e_16	139,1,1
turbo_e_16,340,55,0	duplicate(ブラスト#turbo)	地雷48#turbo_e_16	139,1,1
turbo_e_16,340,51,0	duplicate(ブラスト#turbo)	地雷49#turbo_e_16	139,1,1
turbo_e_16,340,47,0	duplicate(ブラスト#turbo)	地雷50#turbo_e_16	139,1,1
turbo_e_16,340,43,0	duplicate(ブラスト#turbo)	地雷51#turbo_e_16	139,1,1
turbo_e_16,340,39,0	duplicate(ブラスト#turbo)	地雷52#turbo_e_16	139,1,1
turbo_e_16,340,36,0	duplicate(ブラスト#turbo)	地雷53#turbo_e_16	139,1,1
turbo_e_16,344,56,0	duplicate(ブラスト#turbo)	地雷54#turbo_e_16	139,1,1
turbo_e_16,344,52,0	duplicate(ブラスト#turbo)	地雷55#turbo_e_16	139,1,1
turbo_e_16,344,48,0	duplicate(ブラスト#turbo)	地雷56#turbo_e_16	139,1,1
turbo_e_16,344,44,0	duplicate(ブラスト#turbo)	地雷57#turbo_e_16	139,1,1
turbo_e_16,344,40,0	duplicate(ブラスト#turbo)	地雷58#turbo_e_16	139,1,1
turbo_e_16,344,36,0	duplicate(ブラスト#turbo)	地雷59#turbo_e_16	139,1,1
turbo_e_16,348,55,0	duplicate(ブラスト#turbo)	地雷60#turbo_e_16	139,1,1
turbo_e_16,348,51,0	duplicate(ブラスト#turbo)	地雷61#turbo_e_16	139,1,1
turbo_e_16,348,47,0	duplicate(ブラスト#turbo)	地雷62#turbo_e_16	139,1,1
turbo_e_16,348,43,0	duplicate(ブラスト#turbo)	地雷63#turbo_e_16	139,1,1
turbo_e_16,348,39,0	duplicate(ブラスト#turbo)	地雷64#turbo_e_16	139,1,1
turbo_e_16,348,36,0	duplicate(ブラスト#turbo)	地雷65#turbo_e_16	139,1,1
turbo_e_16,352,56,0	duplicate(ブラスト#turbo)	地雷66#turbo_e_16	139,1,1
turbo_e_16,352,52,0	duplicate(ブラスト#turbo)	地雷67#turbo_e_16	139,1,1
turbo_e_16,352,48,0	duplicate(ブラスト#turbo)	地雷68#turbo_e_16	139,1,1
turbo_e_16,352,44,0	duplicate(ブラスト#turbo)	地雷69#turbo_e_16	139,1,1
turbo_e_16,352,40,0	duplicate(ブラスト#turbo)	地雷70#turbo_e_16	139,1,1
turbo_e_16,352,36,0	duplicate(ブラスト#turbo)	地雷71#turbo_e_16	139,1,1
turbo_e_16,356,55,0	duplicate(ブラスト#turbo)	地雷72#turbo_e_16	139,1,1
turbo_e_16,356,51,0	duplicate(ブラスト#turbo)	地雷73#turbo_e_16	139,1,1
turbo_e_16,356,47,0	duplicate(ブラスト#turbo)	地雷74#turbo_e_16	139,1,1
turbo_e_16,356,43,0	duplicate(ブラスト#turbo)	地雷75#turbo_e_16	139,1,1
turbo_e_16,356,39,0	duplicate(ブラスト#turbo)	地雷76#turbo_e_16	139,1,1
turbo_e_16,356,36,0	duplicate(ブラスト#turbo)	地雷77#turbo_e_16	139,1,1
turbo_e_16,360,56,0	duplicate(ブラスト#turbo)	地雷78#turbo_e_16	139,1,1
turbo_e_16,360,52,0	duplicate(ブラスト#turbo)	地雷79#turbo_e_16	139,1,1
turbo_e_16,360,48,0	duplicate(ブラスト#turbo)	地雷80#turbo_e_16	139,1,1
turbo_e_16,360,44,0	duplicate(ブラスト#turbo)	地雷81#turbo_e_16	139,1,1
turbo_e_16,360,40,0	duplicate(ブラスト#turbo)	地雷82#turbo_e_16	139,1,1
turbo_e_16,360,36,0	duplicate(ブラスト#turbo)	地雷83#turbo_e_16	139,1,1
turbo_e_16,364,55,0	duplicate(ブラスト#turbo)	地雷84#turbo_e_16	139,1,1
turbo_e_16,364,51,0	duplicate(ブラスト#turbo)	地雷85#turbo_e_16	139,1,1
turbo_e_16,364,47,0	duplicate(ブラスト#turbo)	地雷86#turbo_e_16	139,1,1
turbo_e_16,364,43,0	duplicate(ブラスト#turbo)	地雷87#turbo_e_16	139,1,1
turbo_e_16,364,39,0	duplicate(ブラスト#turbo)	地雷88#turbo_e_16	139,1,1
turbo_e_16,364,36,0	duplicate(ブラスト#turbo)	地雷89#turbo_e_16	139,1,1
turbo_e_16,368,56,0	duplicate(ブラスト#turbo)	地雷90#turbo_e_16	139,1,1
turbo_e_16,368,52,0	duplicate(ブラスト#turbo)	地雷91#turbo_e_16	139,1,1
turbo_e_16,368,48,0	duplicate(ブラスト#turbo)	地雷92#turbo_e_16	139,1,1
turbo_e_16,368,44,0	duplicate(ブラスト#turbo)	地雷93#turbo_e_16	139,1,1
turbo_e_16,368,40,0	duplicate(ブラスト#turbo)	地雷94#turbo_e_16	139,1,1
turbo_e_16,368,36,0	duplicate(ブラスト#turbo)	地雷95#turbo_e_16	139,1,1

turbo_e_16,371,47,0	script	ゴール1#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",60,1,13;
	end;
}
turbo_e_16,371,47,0	script	ゴール2#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",50,2,13;
	end;
OnInit:
	hideonnpc;
	end;
}
turbo_e_16,371,47,0	script	ゴール3#turbo_e_16	45,1,1,{
	callfunc "TurboGoal","turbo_e_16",40,3,13;
	end;
OnInit:
	hideonnpc;
	end;
}

turbo_e_16,384,167,1	duplicate(進行要員#turbo)	優勝者ガイド#turbo_e_16	47
