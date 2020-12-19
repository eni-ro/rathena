//====================================================================
//Ragnarok Online Thief jobchange script
//
//　■ CHANGE_TF  -> 0〜1, 0〜3(Old)
//     OLD_CLASS  -> 転生前の職業
//     @doubt_npc -> 0〜4
//====================================================================

//==========================================
// 試験申請および転職
//------------------------------------------

moc_prydb1,39,129,2	script	ギルド関係者#TF	69,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Assassin || OLD_CLASS == Job_Rogue)) {
		if(Job == Job_Novice) {
			mes "[シーフギルド関係者]";
			mes "あれ、どこかで見た気がするね。";
			mes "兄弟でもいるのかい？";
			next;
			if(getskilllv(1) < 9) {
				mes "[シーフギルド関係者]";
				mes "なんだ、シーフになりたいのか。";
				mes "でも、それにしちゃ簡単なことを";
				mes "忘れていないか？";
				next;
				mes "[シーフギルド関係者]";
				mes "JobLvを10にまで成長させ、";
				mes "^0000FF「基本スキル」のレベルを9　^000000に";
				mes "してくるんだ。";
				next;
				mes "[シーフギルド関係者]";
				mes "^0000FF「基本スキル」^000000のレベルは";
				mes "^0000FF「スキルリスト」^000000ウィンドウで";
				mes "上げることができるからね！";
				mes "^0000FF「スキルリスト」^000000ウィンドウは";
				mes "^0000FF「基本情報」^000000ウィンドウ内の";
				mes "^0000FF「Skill」^000000ボタンで表示されるよ。";
				next;
				mes "[シーフギルド関係者]";
				mes "スキルのレベルを上げるには、";
				mes "スキルポイントを割り振った後、";
				mes "^FF0000「確定」^000000ボタンが必要となるからね。";
				mes "注意してくれよ。";
				next;
				mes "[シーフギルド関係者]";
				mes "まあ、もう少し鍛えてから出直しな！";
				close;
			}
			mes "[シーフギルド関係者]";
			mes "それとも昔に転職させた奴か？";
			mes "よし、また転職させてやるよ！";
			next;
			nude;
			jobchange Job_Thief,UPPER_HIGH;
			//setquest 51010;
			//setquest 51050;
			//setquest 51105;
			//setquest 51160;
			skill 149,1,0;
			skill 150,1,0;
			skill 151,1,0;
			skill 152,1,0;
			mes "[シーフギルド関係者]";
			mes "シーフはシーフらしく暮らしな！";
			mes "あとは忙しいから省略だ。";
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[シーフギルド関係者]";
		mes (Sex)? "おい、兄ちゃん。": "ほら、姉ちゃん。";
		mes "何しに来た？　帰れ、帰れ！";
		close;
	}
	if(Job == Job_Thief) {
		mes "[シーフギルド関係者]";
		mes "よー";
		mes "悩みがあったらいつでも";
		mes "このおねーさんに相談してよ！";
		mes "うん？";
		next;
		mes "[シーフギルド関係者]";
		mes (Sex)? "兄ちゃん、": "姉ちゃん、";
		mes "シーフになったんだから、";
		mes "冒険者アカデミーに";
		mes "行ってみるといいよ。";
		next;
		mes "[シーフギルド関係者]";
		mes "この部屋の隅っこに";
		mes "冒険者アカデミーのサポートを";
		mes "行っている人が見えるだろ。";
		mes "送ってくれるよ。";
		close;
	}
	if(Job != Job_Novice) {
		mes "[シーフギルド関係者]";
		mes "お前はなんだ……？";
		switch(Job) {
			case Job_Swordman: mes "馬鹿なソードマンか！"; 		break;
			case Job_Mage: mes "サーカス団のマジシャンか！"; 	break;
			case Job_Archer:   mes "アホウのアーチャーだな！"; 	break;
			case Job_Acolyte:  mes "世界最強芸能人崇拝者アコライトか！"; 	break;
			case Job_Merchant: mes "悪質な商人か！"; 		break;
		}
		if(Job < Job_Thief) {
			next;
			mes "[シーフギルド関係者]";
		}
		mes (Sex)? "おい、兄ちゃん。": "ほら、姉ちゃん。";
		mes "何しに来た？　帰れ、帰れ！";
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[シーフギルド関係者]";
		mes "へえ……" +((Sex == 0)?"お嬢様":"坊ちゃま")+ "が何の用で";
		mes "こんな汚い所までわざわざ";
		mes "来たのかな？";
		break;
	case 1:
		mes "[シーフギルド関係者]";
		mes "おーまた来たか。";
		mes "今度は間違いないだろう？";
		break;
	}
	//case0,1の続き
	next;
	if(select("シーフになりたい。","なんでもない。")==2) {
		mes "[シーフギルド関係者]";
		mes "なんだよ。転職もしないのに……";
		mes "本当に何しに来た？";
		mes "何を考えているんだよ……？";
		close;
	}
	if(CHANGE_TF==0) {
		mes "[シーフギルド関係者]";
		mes "……自慢する事はないだろう？";
		mes "シーフになりたいって、そんな";
		mes "恥ずかしい事がよく言えるな。";
		mes "馬鹿か？　道歩いてる人に私は";
		mes "シーフになりますって、広告でもする";
		mes "気か？　ちょっと、頭に何がある？";
		next;
		mes "[シーフギルド関係者]";
		mes "本当にシーフになりたいのか？";
		next;
		switch (select("うん。","ううん。","そんなこと言ってる君は？")) {
		case 1:
			mes "[シーフギルド関係者]";
			mes "ふん……";
			mes "まあ、そーだったら仕方ないか。";
			break;
		case 2:
			mes "[シーフギルド関係者]";
			mes "だったら、なんだよ？";
			mes "ここに恋人でもいるのか？";
			mes "じゃなかったら";
			mes "シーフギルドまで何しに来た？";
			break;
		case 3:
			mes "[シーフギルド関係者]";
			mes "え……？　あたし……？";
			mes "まあ、あたしは……ただ……うう、";
			mes "細かい事は聞くな！";
			break;
		}
		mes "とりあえず、現実世界でシーフに";
		mes "なりたいとか言ったら駄目だよ！";
		next;
		mes "[シーフギルド関係者]";
		mes "本当に、";
		mes "本当にシーフになりたいのか？";
		next;
		if(select("うん。","やっぱりやめる。")==2) {
			mes "[シーフギルド関係者]";
			mes "なんだよ。転職もしないのに……";
			mes "本当に何しに来た？";
			mes "何を考えているんだよ……？";
			close;
		}
		set CHANGE_TF,1;
		mes "[シーフギルド関係者]";
		mes "だったら君の名前を言って。";
		mes "うん？　なに？";
		mes " " +strcharinfo(0)+ " ……";
		mes " " +strcharinfo(0)+ " だね。";
		next;
		mes "[シーフギルド関係者]";
		mes "申請書はOK。";
		mes "転職条件をもう知ってるんだったら、";
		mes "このまま面接に入るよ。";
		mes "やってみるか？";
		next;
		if(select("うん、いいよ","いや、後で")==2) {
			mes "[シーフギルド関係者]";
			mes "まあ、好きにしな。ばいばい〜";
			close;
		}
	}
	mes "[シーフギルド関係者]";
	mes "さあ、それでは、確認しようか？";
	next;
	mes "[シーフギルド関係者]";
	mes "名前が " +strcharinfo(0)+ "。";
	mes "えっと……あ、これだな。";
	mes "姓名 " +strcharinfo(0)+ "。";
	mes "ちょっと〜待って〜";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[シーフギルド関係者]";
		mes "シーフになりたいという";
		mes "君の意志はわかるが……";
		mes "意志だけで世の中生きて";
		mes "行けないんだよ！";
		mes "最低でも^0000FF「基本スキル」の";
		mes "レベルが9^000000 にならないと駄目だ！";
		next;
		mes "[シーフギルド関係者]";
		mes "JobLvを10にまで成長させ、";
		mes "^0000FF「基本スキル」のレベルを9^000000 に";
		mes "してくるんだ。";
		next;
		mes "[シーフギルド関係者]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができるからね！";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示されるよ。";
		next;
		mes "[シーフギルド関係者]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要となるからね。";
		mes "注意してね。";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[シーフギルド関係者]";
	mes "うん……資料を見たらある程度";
	mes "興味深い部分もあるし……";
	mes "基本も出来てるし……いいよ。";
	mes "これで";
	mes "シーフギルドの面接は終わり！";
	next;
	getitem 11028,1;
	nude;
	jobchange Job_Thief;
	set CHANGE_TF,0;
	setquest 50115;
	mes "[シーフギルド関係者]";
	mes "君のシーフ転職をお祝いする。";
	mes "以後、シーフギルドの一員として、";
	mes "ギルドの秩序と規範を守れ。万が一、";
	mes "はぐれた行動やルール違反などで、";
	mes "シーフギルドに被害があった場合、";
	next;
	mes "[シーフギルド関係者]";
	mes "君の存在はギルドによって";
	mes "抹消される事をくれぐれも忘れずに。";
	mes "まあ、素晴らしい活動を期待する。";
	mes "以上。";
	next;
	mes "[シーフギルド関係者]";
	mes "堅苦しい話はこれで終わりよ。";
	next;
	mes "[シーフギルド関係者]";
	mes "このシーフの書には";
	mes "シーフとして何をした方が";
	mes "いいか書いてある。";
	mes "目を通しておくといいよ。";
	next;
	mes "[シーフギルド関係者]";
	mes "これにて、シーフへの転職は完了！";
	mes "シーフはシーフらしく暮らしな！";
	mes "君の活躍を期待してるよ！";
	close;
OnInit:
	waitingroom "転職",0;
	end;
}


//==========================================
// キノコ採集
//------------------------------------------

moc_ruins,141,125,3	script	怪しい奴	83,{
	if(Job == Job_Thief) {
		mes "[シーフギルド関係者]";
		mes "へえ、立派なシーフになったな。";
		mes "でも、ここにはもう入れないよ。";
		mes "君も知ってると思うけど、ここは";
		mes "転職希望の奴しか入れない";
		mes "試験場だから。もっと面白い所へ、";
		mes "美味しい物を拾いに行ってくれ。";
		close;
	}
	if(Job != Job_Novice) {
		switch(@doubt_npc) {
		case 0:
			mes "[怪しい奴]";
			mes "こんにちはーいい天気ですね！";
			mes "今日みたいに暖かい陽射の気持ちいい午後はピラミッド付近でピクニックするのが一番だよね。";
			break;
		case 1:
			mes "[怪しい奴]";
			mes "'帰る家があるということは幸せの第一歩である。";
			mes "私が一番好きなことわざです。帰る家か…";
			break;
		case 2:
			mes "[怪しい奴]";
			mes "............... ";
			break;
		case 3:
			mes "[怪しい奴]";
			mes "おー私はあ、や、し、い、人ではありません。";
			mes "そんな目で見ないでく、だ、さ、い。";
			break;
		case 4:
			mes "[怪しい奴]";
			mes "……しつこいな。";
			mes "もう話すこともないからあっち行けよ。";
			close;
		}
		set @doubt_npc,@doubt_npc+1;
		close;
	}
	switch(CHANGE_TF) {
	case 0:
		mes "[怪しい奴]";
		mes "そこの初心者！";
		mes "素晴らしい人生を送りたいか？";
		mes "もっと楽な生活をしたいか？";
		mes "ならばシーフになれ！";
		mes "そしてシーフギルドに入団するのだ！";
		next;
		mes "[怪しい奴]";
		mes "シーフギルドは君たちを歓迎する！";
		mes "今すぐ加入したら";
		mes "ポイントカード付！（冗談）";
		mes "場所はピラミッドダンジョン1階中央の";
		mes "階段をおりて左だ！　右かもしれない！";
		mes "まっすぐ行ったら駄目だ！";
		close;
	case 1:
		mes "[怪しい奴]";
		mes "妙なシーフの匂いがする……";
		mes "お前は……将来、シーフになる……";
		close;
	}
}

moc_prydb1,42,133,2	script	ギルド関係者	118,{
	if(Job == Job_Thief) {
		mes "[ブレード]";
		mes "今は特にイベントがないんだ。";
		mes "連絡したら集合することだ。";
		close;
	}
	if(Job != Job_Novice || Upper == UPPER_HIGH) {
		mes "[シーフギルド関係者]";
		mes "おーい、おーい、そこの奴！";
		mes "ここで何してる？";
		mes "ここにはお前の居場所はないから";
		mes "早く出てもらおう。";
		close;
	}
	mes "[シーフギルド関係者]";
	mes "うん？";
	mes "初心者のくせにここに何の用かな？";
	mes "もし、シーフに転職したいのなら、";
	mes "俺の隣の姉ちゃんに聞けよ。";
	close;
}
