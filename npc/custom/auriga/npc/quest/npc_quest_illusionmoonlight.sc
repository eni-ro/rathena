//===== rAthena Script ===========================================|
//= Illusion of Moonlight ( jRO )( iRO Translation )             =|
//===== By: ======================================================|
//= crazyarashi                                                  =|
//===== Current Version: =========================================|
//= 1.0 Initial Version                                          =|
//= 1.1 Fix MVP Summon to random location                        =|
//================================================================|
//= A Custom Illusion Moonlight Storyline                        =|
//================================================================|
payon,164,229,5	script	元老サンユル#illusion_moonlight	1_F_ORIENT_04,{
	if(BaseLevel < 100){
		mes "[ サンユル ]";		mes "[サンユル]";
		mes "何か怪しい事が";
		mes "起きている予感がします。";
		mes "君がもう少し強い冒険者なら";
		mes "話をしてみるが……残念だ。";
		next;
		mes "- ^4d4dffBaseLv100以上の時";
		mes "  進行可能なクエストです。^000000 -";
		close;
	}
	if(illusion_moonlight == 0){

		mes "[サンユル]";
		mes "今回の件は私たちの手には";
		mes "負えないようだ。";
		mes "これでもう何回目だ。";
		next;
		mes "[ サンユル ]";
		mes "対処法を考えるにも";
		mes "情報が足りていない。";
		mes "まずはムヒョンを";
		mes "待つことにしよう。";
		mes "無事だと良いのだが。";
		next;
		if(select("あの"))
		mes "[ サンユル ]";
		mes "うむ？冒険者ではないか。";
		mes "私たちの話を";
		mes "聞いていたのか？";
		next;
		mes "[ サンユル ]";
		mes "……ふむ、そうか。";
		mes "これも全て神様の";
		mes "意向なのだろう。";
		mes "ひょっとしたら君が私たちの";
		mes "力になるかもしれない。";
		next;
		mes "[ サンユル ]";
		mes "フェイヨンの裏の方にある弓手村に";
		mes "洞窟があるのは知っているか？";
		mes "そこでは定期的に";
		mes "亡霊たちが現れるから";
		mes "浄化儀式を行っているんだ。";
		next;
		mes "[ サンユル ]";
		mes "だが私たちが考えてるより";
		mes "九尾狐の怨念が強いのだろう。";
		mes "狐の魂を浄化しようとすると";
		mes "浄化している者に";
		mes "狐の魂が移ってしまい";
		mes "悪夢にうなされていた。";
		npctalk "It's as if the spirits were antagonized by them.","元老ジャギョム#illusion_moonlight",bc_self;
		next;
		mes "[ サンユル ]";
		mes "今回はついに気を失ったまま";
		mes "洞窟に走って行ってしまったんだ。";
		mes "だから心配でしょうがない。";
		next;
		if(select("ムヒョンさんのことですか？"))
		npctalk "Maybe we should send someone else.","元老ジャギョム#illusion_moonlight",bc_self;
		mes "[ サンユル ]";
		mes "ムヒョンはソウルリンカーだ。";
		mes "今頃は探しに向かうため";
		mes "兵士が洞窟近くに来ているので";
		mes "大丈夫だとは思うが。";
		next;
		mes "[ ジャギョム ]";
		mes "そうだな。しかし";
		mes "万が一があるかもしれない。";
		mes "君もそこに行って無事なのか";
		mes "確認してくれないか？";
		next;
		npctalk "Yes. could you?","",bc_self;
		if(select("分かりました","お化けが怖いので無理です") == 2){
			mes "[ サンユル ]";
			mes "私たちがいつ";
			mes "お化けがでると言った？";
			mes "言ったか？";
			close;
		}
		mes "[ ジャギョム ]";
		mes "兵士が無事に見つける事が";
		mes "出来たなら良いが、";
		mes "それが出来なかったなら";
		mes "洞窟の奥にある廃村まで";
		mes "行ってしまったはずだ。";
		next;
		mes "[ ジャギョム ]";
		mes "一旦、洞窟近くにムヒョンと兵士が";
		mes "出て来ているか確認してくれ。";
		mes "若い学士も後を追って行ったけど";
		mes "やっぱり任せられないからな。";
		next;
		mes "[ ジャギョム ]";
		mes "その学士に会って";
		mes "事情を聴いてみるのもいい。";
		setquest 7776;
		illusion_moonlight = 1;
		end;
    }
	if(illusion_moonlight == 1){
		mes "[ サンユル ]";
		mes "Please go to the cave's entrance in the Archer Village.";
		mes "Ask the young scholar there about ムヒョン's whereabouts.";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ サンユル ]";
        mes "I hope everything will be okay.";
        mes "Huh? I was talking about the cave in the back.";
        mes "I'm worried about what's happening there.";
        close;	
	}

OnInit:
	questinfo 7776,QTYPE_QUEST2;
	//setquestinfo_level 7776,100,175;
	end;
}
payon,167,229,3	script	元老ジャギョム#illusion_moonlight	4_M_HUOLDARMY,{
	if(BaseLevel < 100){
		mes "[ ジャギョム ]";
		mes "I hope everything will be okay.";
		mes "Seeing that you're an adventurer, I assume you're familiar with the ^0000FFPayon Cave^000000.";
		mes "Be careful, something bad is happening inside.";
		next;
		mes "^0000FFYou must be Level 100 or above to perform this quest.";
		close;
	}
	if(illusion_moonlight == 0){
		mes "[ ジャギョム ]";
		mes "This matter is out of our hands now.";
		mes "We can't let it keep happening like this.";
		next;
		mes "[ サンユル ]";
		mes "Let's wait for ^0000FFムヒョン^000000 now.";
		mes "Her safety is more important than anything else.";
		next;
		if(select("Excuse me."))
		mes "[ サンユル ]";
		mes "Hm? You're an adventurer.";
		mes "Did you happen to hear our conversation?";
		next;
		mes "[ サンユル ]";
		mes "I see.";
		mes "Maybe it's faith that you overheard us.";
		next;
		mes "[ サンユル ]";
		mes "There's a cave near the Archer Village in the back of Payon.";
		mes "It's a haunted cave, so we've been preforming rituals and exorcism there regularly.";
		next;
		mes "[ サンユル ]";
		mes "But the Nine-tailed foxes spirits are more enraged than we thought.";
		mes "Every time someone tries to preform a ritual to the fox beads, they get nightmares.";
		npctalk "It's as if the spirits were antagonized by them.","元老ジャギョム#illusion_moonlight",bc_self;
		next;
		mes "[ サンユル ]";
		mes "And this time, she's completely lost her mind and entered the cave.";
		mes "That's why we're worried about her.";
		next;
		if(select("Is it about ムヒョン?"))
		npctalk "Maybe we should send someone else.","元老ジャギョム#illusion_moonlight",bc_self;
		mes "[ サンユル ]";
		mes "Yes. She's the Soul Linker who performs the ritual regularly.";
		mes "We've asked a soldier to find her.";
		mes "They must be near the cave by now.";
		next;
		mes "[ ジャギョム ]";
		mes "Could you go check up ^0000FFムヒョン^000000 for us?";
		next;
		npctalk "Yes. could you?","",bc_self;
		if(select("Sure, I will:Sorry, I'm afraid of ghost.") == 2){
			mes "[ サンユル ]";
			mes "Huh? We didn't say anything about ghost. Or did we?";
			close;
		}
		mes "[ ジャギョム ]";
		mes "I hope the soldier will find her before she goes deep inside the ruined village.";
		next;
		mes "[ ジャギョム ]";
		mes "Please go to the cave and see if ムヒョン and the soldier are outside already.";
		mes "A young scholar followed the soldier, but she doesn't seem reliable at all.";
		next;
		mes "[ ジャギョム ]";
		mes "Talk to the scholar, maybe he could give you an information on the situation.";
		setquest 7776;
		illusion_moonlight = 1;
		end;
	}
	if(illusion_moonlight == 1){
		mes "[ ジャギョム ]";
		mes "I hope the soldier will find her before she goes deep inside the ruined village.";
		next;
		mes "[ ジャギョム ]";
		mes "Please go to the cave and see if ムヒョン and the soldier are outside already.";
		mes "A young scholar followed the soldier, but she doesn't seem reliable at all.";
		next;
		mes "[ ジャギョム ]";
		mes "Talk to the scholar, maybe he could give you an information on the situation.";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ ジャギョム ]";
		mes "Maybe it's time we leave things to the younger generations.";
		mes "There is nothing we old folk could do.";
		close;
	}
}
pay_arche,48,137,4	script	青年学士#illusion_moonlight	4_F_03,{
	if(illusion_moonlight == 0){ 
        npctalk "青年学士 : どうして出てこないんだ……","",bc_self; 
        end; 
    }
	if(illusion_moonlight == 1){
		npctalk "青年学士 : どうして出てこないんだ……","",bc_self;
		mes "[ 青年学士 ]";
		mes "こんな幸運が起きるなんて！";
		mes "困った時に待っていたかのように";
		mes "冒険者が目の前に現れるとは！";
        next;
        mes "[ 青年学士 ]";
		mes "私が聞くに冒険者は";
		mes "色んな仕事を我々の代わりに";
		mes "務めてくれるというのは本当ですか？";
        next;
        if(select("すでに仕事を受けている"))
        mes "[ 青年学士 ]";
		mes "……そうですか。";
		mes "忙しいみたいですね。";
		mes "大変失礼しました。";
		mes "ここには何用で";
		mes "いらっしゃったんですか？";
        next;
        if(select("ムヒョンを見ませんでしたか？"))
        mes "[ 青年学士 ]";
		mes "ムヒョン？ソウルリンカーの";
		mes "ムヒョンのことですか？";
		mes "いや、まだ正式なソウルリンカーではなく";
		mes "修練中の身ですが……。";
        next;
        mes "[ 青年学士 ]";
		mes "浄化をしていたムヒョンが";
		mes "何かに憑りつかれて";
		mes "洞窟の奥まで入ってしまったので";
		mes "ジュウヒ……いや、";
		mes "兵士が探しに入ったのですが";
		mes "まだ何の知らせもありません。";
        next;
        mes "[ 青年学士 ]";
		mes "私は2人の帰りをここで";
		mes "待っていたのですが";
		mes "あまりにも音沙汰がないため";
		mes "別の人を探して";
		mes "探索に向かわせるかどうか";
		mes "悩んでいたところでした。";
        next;
        mes "[ 青年学士 ]";
		mes "何事もなければいいですが…";
		classchange 4_M_PAY_SOLDIER,"Payon Soldier#archer_dummy",bc_self;
		classchange 4_F_TAEKWON,"ムヒョン#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "青年学士 : 出て来ました！無事みたいです！","青年学士#illusion_moonlight",bc_self;
        sleep2 2000;
        npctalk "ムヒョン : ああ！もうやめる！浄化なんかやめたぁぁぁ!!","ムヒョン#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "兵士シンジュウヒ : ……。","Payon Soldier#archer_dummy",bc_self;
        next;
		mes "[ ムヒョン ]";
		mes "あれ、ホドニ？";
		mes "君はどうしてここにいるの？";
        npctalk "青年学士 : それは心配だったから……。","青年学士#moonlight",bc_self;
        next;
        mes "[ ムヒョン ]";
		mes "心配だと言う割には";
		mes "ここでこうしているのが";
		mes "精一杯なんでしょ？";
		mes "ホドニに心配してもらう";
		mes "筋合いはないから。";
        sleep2 2000;
        npctalk "兵士シンジュウヒ : 適当にやってろ。","Payon Soldier#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "青年学士 : ちょっと、酷くないか。","青年学士#illusion_moonlight",bc_self;
        next;
        npctalk "ムヒョン : バイバイ！","ムヒョン#archer_dummy",bc_self;
        mes "[ ムヒョン ]";
		mes "あ！私もうこれやめた。";
		mes "やらないから爺たちに";
		mes "代わりに伝えておいて！";
		mes "それじゃあバイバイ！";
        next;
        npctalk "兵士シンジュウヒ : ふう、それでは私もこれで失礼する。一旦ムヒョンを追うから、元老たちに伝えてくれ。","Payon Soldier#archer_dummy",bc_self;
        sleep2 1500;
		classchange HIDDEN_WARP_NPC,"Payon Soldier#archer_dummy",bc_self;
		classchange HIDDEN_WARP_NPC,"ムヒョン#archer_dummy",bc_self;
        mes "[ 青年学士 ]";
		mes "……詳しい話は";
		mes "何もしないで";
		mes "行ってしまいましたね。";
        next;
        mes "[ 青年学士 ]";
		mes "うわあ！ジュウヒまで！";
		mes "そういえば冒険者様";
		mes "ムヒョンに用事があると";
		mes "言っていたのでは？";
        next;
        if(select("戻るしかない"))
        mes "[ 青年学士 ]";
		mes "ムヒョンは多分^4d4dffフェイヨン離宮^000000へ向かったと思います。";
		mes "一緒に行きませんか？";
        next;
        if(select("一緒に行く","別々に行く") == 2){  
            mes "[ 青年学士 ]";
			mes "ムヒョンは多分";
			mes "^4d4dffフェイヨン離宮^000000へ";
			mes "向かったと思います。";
			mes "そこに行って詳しい話を";
			mes "聞いてみることにしましょう。";
			mes "元老たちには私が伝えておきます。";
            illusion_moonlight = 2;
            completequest 7776;
            setquest 7777;
            end;
        }
		mes "[ 青年学士 ]";
		mes "それじゃ離宮へと…";
        illusion_moonlight = 2;
        completequest 7776;
        setquest 7777;
        close2;
        warp "payon",105,320;
        end;	
	}
	if(illusion_moonlight == 2){
		mes "[ 青年学士 ]";
		mes "ムヒョンは多分";
		mes "^4d4dffフェイヨン離宮^000000へ";
		mes "向かったと思います。";
		mes "そこに行って詳しい話を";
		mes "聞いてみることにしましょう。";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ 青年学士 ]";
		mes "その昔、徳を長く積み上げた神獣が";
		mes "九尾狐になったらしいです。";
		mes "その子孫が月夜花になった";
		mes "という話もあります。";
		mes "十分に研究してみる価値のある";
		mes "話だと考えています。";
		close;
	}
	if(illusion_moonlight >= 6){
		mes "[ 青年学士 ]";
		mes "廃村に早く調査を！";
		mes "一緒に行きますか？";
		next;
		if(select("一緒に行く","別々に行く") == 2) {
			mes "[ 青年学士 ]";
			mes "それでは私たちもジュウヒを呼んで";
			mes "すぐに後を追って行くようにします！";
			close;
		}
		mes "[ 青年学士 ]";
		mes "さあ、早く行きましょう！";
		close2;
		warp "pay_dun03",145,43;
		end;
	}
	
	
OnInit:
	questinfo 7777,QTYPE_QUEST;
	//setquestinfo_req 7777,7776,1;
	end;
}
payon_in03,33,95,3	script	ムヒョン#moonlight_in	4_F_TAEKWON,{
	if(illusion_moonlight < 2){
		mes "[ ムヒョン ]";
		mes "イェジョル先生を探しに来たなら";
		mes "もっと奥の部屋に行って下さい。";
		close;
	}
	if(illusion_moonlight == 2){
		setpcblock PCBLOCK_ALL,true;
		sleep2 2000;
		npctalk "ムヒョン : だからいくら話しても私はもうやりません！","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : これでもう三回目ですよ。もうこの悪夢とは関わりたくないです。","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		unittalk getcharid(3),strcharinfo(0)+ " : 悪夢？",bc_self;
		npctalk "青年学士 : 悪夢？","青年学士#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : 狐の悪夢だよ。そこに九尾狐と月夜花がいたんだ","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : とても酷い内容だった。二度とあんな経験をしたくない。","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ジャギョム : だけど君がやらなければ誰がそれを浄化するんだ？","ジャギョム#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ジャギョム : みんな出来ないと辞めていった。それでもムヒョン君は三回もやったじゃないか。","ジャギョム#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : それがですね、今回は嫌な夢で終わるだけではなかったんですよ。","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : 今までは狐玉に込められた悪夢の気を浄化すると、嫌な夢を見ていただけだったのに……","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "青年学士 : 今回は何が違うんですか？","青年学士#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : ……","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : 夢と現実の境界が崩れるのではと不安を感じた。","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ジャギョム : ……それは何の話だ！今まではただ九尾狐の怨念を鎮めるだけで良かったじゃないか。","ジャギョム#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ジャギョム : いったい洞窟で何を見たんだ？","ジャギョム#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : 私が言葉でいくら説明するより、直接見た方が良いと思いますよ。","ムヒョン#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "ムヒョン : どうせなら強い方がいいです。今いらっしゃっている冒険者の人くらい。","ムヒョン#moonlight_in",bc_self;
		completequest 7777;
		setquest 7778;
		illusion_moonlight = 3;
		setpcblock PCBLOCK_ALL,false;
		end;
	}
	if(illusion_moonlight == 3){
		mes "[ ムヒョン ]";
		mes "分かりました。";
		mes "……悪夢を見せる前に";
		mes "少しだけ昔話をしましょう。";
		next;
		mes "[ ムヒョン ]";
		mes "フェイヨン洞窟は昔に発生した";
		mes "ある事件で山崩れが起きて";
		mes "村の一部が埋まって作られたものです。";
		next;
		mes "[ ムヒョン ]";
		mes "当たり前だと思いますが";
		mes "悔しい思いを抱えたまま";
		mes "死を迎えた者たちも";
		mes "多かったのでしょう。";
		mes "今でも亡霊たちが";
		mes "たくさん残っています。";
		next;
		mes "[ ムヒョン ]";
		mes "特に廃村に生息する";
		mes "九尾狐たちの怨念は";
		mes "凄まじいほど強力なので定期的に";
		mes "浄化儀式を行うのですが";
		mes "問題はここからです。";
		next;
		mes "[ ムヒョン ]";
		mes "原因は誰にも分かりませんが";
		mes "最近になって狐たちの怨念が";
		mes "さらに強くなってしまったんです。";
		mes "強くなったと言うよりは";
		mes "浄化がうまく行われていないと";
		mes "言った方が正しいかも知れません。";
		next;
		mes "[ ムヒョン ]";
		mes "九尾狐たちの怨念は凄まじく";
		mes "普段通り浄化をしたら";
		mes "怨念によって悪夢を見たり";
		mes "感応して泣いたり……。";
		mes "そのような嫌なことが";
		mes "起きるようになりました。";
		next;
		mes "[ ムヒョン ]";
		mes "ソウルリンカーというのが";
		mes "魂の共感を行う職業なので";
		mes "稀にですが退魔儀式を行った後、";
		mes "夢見が悪くなることがあります。";
		next;
		mes "[ ムヒョン ]";
		mes "私もただ疲れてるとしか";
		mes "考えていませんでした。";
		mes "しかし今回の件で知る事が出来ました。";
		mes "そうじゃなかったと！";
		next;
		mes "[ムヒョン]";
		mes "何が狐たちの怨念を";
		mes "増幅させているかは知りません。";
		mes "私は自分の意識をなくし、たくさんの";
		mes "狐の泣き声が聞こえる廃村に";
		mes "私自身も知らず知らずのうちに";
		mes "向かっていました。";
		next;
		mes "[ ムヒョン ]";
		mes "そして見てしまったのです。";
		mes "この世の向こう側を。";
		mes "これ以上、人が近づいてはダメです！";
		next;
		mes "[ ムヒョン ]";
		mes "とても不吉な何かが";
		mes "起きそうな予感がします。";
		mes "いや、すでに始まっているのかも。";
		next;
		mes "[ ムヒョン ]";
		mes "私が見たぼんやりした残像の";
		mes "向こう側は地獄でした。";
		mes "怨念を浄化した後は";
		mes "いつも見ていた狐たちの悪夢。";
		next;
		mes "[ ムヒョン ]";
		mes "……なのでもう二度と私に";
		mes "この仕事をさせないで下さい。";
		mes "私の精神の弱さから";
		mes "始まった悪夢なら";
		mes "私が甘受すべきことです。";
		next;
		mes "[ ムヒョン ]";
		mes "だけど狐たちの悪夢には";
		mes "二度と関わりたくありません。";
		next;
		mes "[ ムヒョン ]";
		mes "本当に気になるのであれば";
		mes "直接経験してみた方がいいですよ。";
		mes "丁度、先ほど浄化しようとしていた";
		mes "狐の魂があるので、準備ができましたら";
		mes "いつでも教えて下さい。";
		completequest 7778;
		setquest 7779;
		illusion_moonlight = 4;
		end;
	}
	if(illusion_moonlight == 4){
		mes "[ ムヒョン ]";
		mes "準備は出来ましたか？";
		next;
		if(select("出来ました","まだです") == 2) {
			mes "[ ムヒョン ]";
			mes "お待ちしていますので";
			mes "準備ができましたら";
			mes "教えて下さい。";
			close;
		}
		mes "[ ムヒョン ]";
		mes "分かりました。";
		mes "これはまだ浄化が";
		mes "終わっていない狐の魂です。";
		mes "これを手の上にのせて…";
		next;
		mes "[ ムヒョン ]";
		mes "精神を集中し";
		mes "心を穏やかにして下さい。";
		mes "心の扉を開いて";
		mes "受け入れなければなりません。";
		close2;
		setpcblock PCBLOCK_ALL,true;
		npctalk "ムヒョン : 見よ、聞きなさい、彷徨う魂よ","",bc_self;
		specialeffect 513;
		specialeffect2 334;
		sleep2 1500;
		specialeffect 368;
		specialeffect 550;
		sleep2 1500;
		specialeffect 550;
		npctalk "ムヒョン : 三途の川の向こうを見ろ。","",bc_self;
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#01",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#01";
		specialeffect 550,AREA,"Nine Tail Spirit#01";
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#02",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#02";
		specialeffect 550,AREA,"Nine Tail Spirit#02";
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#02",bc_self;
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#03",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#04",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#04";
		specialeffect 550,AREA,"Nine Tail Spirit#04";
		sleep2 2000;
		npctalk "ムヒョン : 三途の川の向こうを見ろ。","",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#01",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 2000;
		npctalk "ムヒョン : 見るな、聞くな、悔しい魂よ。","",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#02",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 2000;
		npctalk "ムヒョン : この世から背を向け","",bc_self;
		npctalk "Die!","Nine Tail Spirit#03",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";		
		sleep2 2000;
		npctalk "ムヒョン : 重いものはここに置いて","",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#01",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#02",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#03",bc_self;
		npctalk "狐魂 : 死ね！！","Nine Tail Spirit#04",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";		
		sleep2 2000;
		npctalk "ムヒョン : 川の向こうへと飛んで行け","",bc_self;
		npctalk "狐魂 : 死ね！！！！","Nine Tail Spirit#02",bc_self;
		sleep2 250;
		npctalk "狐魂 : 死ね！！！！","Nine Tail Spirit#01",bc_self;
		sleep2 250;
		npctalk "狐魂 : 死ね！！！！","Nine Tail Spirit#03",bc_self;
		sleep2 250;
		npctalk "狐魂 : 死ね！！！！","Nine Tail Spirit#04",bc_self;
		sleep2 1000;
		specialeffect2 445;
		sleep2 250;
		illusion_moonlight = 5;
		completequest 7779;
		setquest 7780;
		setpcblock PCBLOCK_ALL,false;
		warp "pay_dun03",145,43;
		end;
	}
	if(illusion_moonlight == 5){
		mes "[ ムヒョン ]";
		mes "[ムヒョン]";
		mes "……これで分かりましたね？";
		mes "私が何を経験したのかを。";
		mes "もっと詳しい真相を調査するなら";
		mes "もう一度、廃村に";
		mes "行かなければなりません。";
		next;
		mes "[ ムヒョン ]";
		mes "冒険者様が";
		mes "今回の現象に対して";
		mes "調査するのなら";
		mes "そこにいるバカが";
		mes "とても喜びそうですね。";
		close;
	}
	if(illusion_moonlight < 9){
		mes "[ ムヒョン ]";
		mes "イェジョル先生を探しに来たなら";
		mes "もっと奥の部屋に行って下さい。";
		close;
	}
	if(illusion_moonlight == 9){
		mes "[ ムヒョン ]";
		mes "そうですか。";
		mes "結局、具体化されて";
		mes "しまったのですね。";
		mes "理由については";
		mes "知らないんですよね？";
		next;
		mes "[ ムヒョン ]";
		mes "具体化されたと言うよりは";
		mes "夢と現実の境界が崩れたと";
		mes "言うのが正しいでしょうか？";
		mes "普通の人が誰かの夢の中を";
		mes "あんな風に行き来することは";
		mes "出来ません。";
		next;
		mes "[ ムヒョン ]";
		mes "それが^4d4dff月夜花の悪夢^000000だと";
		mes "言うのはよく分かりました。";
		mes "でもどうやってそれが現実と";
		mes "繋がるようになったのかは";
		mes "誰も知りません。";
		next;
		mes "[ ムヒョン ]";
		mes "これと似た事例でもあったら";
		mes "参考にしますけど";
		mes "まだそのような話は";
		mes "聞いた事もありません。";
		mes "まあ、その部分については";
		mes "ホドニがうまく調査するかと。";
		next;
		mes "[ ムヒョン ]";
		mes "よし～！では久しぶりに";
		mes "少し休んでみようかな！";
		mes "これで余計な事は考えずに";
		mes "ぐっすり寝れそうです。";
		next;
		mes "[ ムヒョン ]";
		mes "浄化作業をするよりも";
		mes "その夢さえ処理すれば";
		mes "一気に解決できそうなので！";
		mes "私は解放！解放です！";
		mes "ありがとうございます";
		mes "冒険者様！";
		illusion_moonlight = 10;
		completequest 7788;
		end;
	}
	mes "[ムヒョン]";
	mes "ホドニと一緒に調査、研究！";
	mes "頑張って下さい！";
	mes "九尾狐の悪夢が消えたら";
	mes "このうんざりする儀式も";
	mes "無くなりますから～！";
	next;
	mes "[ ムヒョン ]";
	mes "なぜ知っているのか";
	mes "気になるんですか？";
	mes "ただの勘ですよ！あははははは！";
	mes "多分消えないであのまま";
	mes "一生いるかも知れないけど！";
	mes "私と関係ないことですから！";
	close;
		
OnInit:
	questinfo 7778,QTYPE_QUEST;
	//setquestinfo_req 7778,7777,1;
	questinfo 7779,QTYPE_QUEST;
	//setquestinfo_req 7779,7778,1;
	questinfo 7780,QTYPE_QUEST;
	//setquestinfo_req 7780,7779,1;
	end;
}
payon_in03,30,96,5	script	ジャギョム#moonlight_in	4_M_HUOLDARMY,{
	if(illusion_moonlight < 2){
		mes "[ ジャギョム ]";
		mes "Please observe proper manners inside the palace.";
		close;
	}
	if(illusion_moonlight == 2){
		npctalk "ムヒョン... If you can't do it, no one else can!","",bc_self;
		end;
	}
	if(illusion_moonlight < 5){
		npctalk "Let's listen for now.","",bc_self;
		end;
	}
	if(illusion_moonlight == 5){
		mes "[ ジャギョム ]";
		mes "We should grasp the situation first.","It'll be great if you can help us, Adventurer.";
		close;
	}
	if(illusion_moonlight < 10){
		mes "[ ジャギョム ]";
		mes "Please observe proper manners inside the palace.";
		close;
	}
	mes "[ ジャギョム ]";
	mes "The Moonlight Flower are recreating the past in their nightmares.","In a way, they're also victims.";
	next;
	mes "[ ジャギョム ]";
	mes "I'll make sure no villagers gets close to the collapsed walls of reality and dreams.";
	close;
}

payon_in03,33,93,1	script	青年学士#moonlight_in	4_F_03,{
	if(illusion_moonlight < 2){
		mes "[ 青年学士 ]";
		mes "フェイヨンは昔から";
		mes "神獣たちと一緒に暮らす街でした。";
		mes "山で隔離されていて";
		mes "余所と比べると考え方に";
		mes "かなり違いがあります。";
		close;
	}
	if(illusion_moonlight == 2){
		npctalk "青年学士 : ムヒョンはとても興奮しています。話を聞いてみないといけないのですが……","",bc_self;
		end;
	}
	if(illusion_moonlight < 5){
		npctalk "青年学士 : ムヒョンの話から聞いてみた方がよさそうです。";
		end;
	}
	if(illusion_moonlight == 5){
		mes "[ 青年学士 ]";
		mes "本当に悲惨ですね。";
		mes "こんなことをムヒョンが";
		mes "ひとりで背負っていたんですね。";
		mes "九尾狐の怨念が";
		mes "想像していた以上で驚きました。";
		next;
		mes "[ 青年学士 ]";
		mes "もう少し研究が必要です。";
		mes "やはり直接、廃村に";
		mes "行ってみるしかなさそうです。";
		close;
	}
	if(illusion_moonlight > 5){
		mes "[ 青年学士 ]";
		mes "当分の間は廃村で";
		mes "この奇妙な現象を";
		mes "研究することにします。";
		mes "どうしてもひとりじゃ大変なので";
		mes "外にいるジュウヒと一緒に";
		mes "行動しようと考えています。";
		next;
		mes "[ 青年学士 ]";
		mes "この前にみたいに冒険者様が";
		mes "一緒にいてくれるなら申し分ないです。";
		mes "それでは廃村で会いましょう。";
		close;
	}
}


//= Dummy
pay_arche,44,133,7	script	Payon Soldier#archer_dummy	HIDDEN_WARP_NPC,{ end; }
pay_arche,46,135,5	script	ムヒョン#archer_dummy	HIDDEN_WARP_NPC,{ end; }
payon_in03,30,96,5	script	Nine Tail Spirit#01	HIDDEN_WARP_NPC,{ end; }
payon_in03,35,96,3	script	Nine Tail Spirit#02	HIDDEN_WARP_NPC,{ end; }
payon_in03,30,93,7	script	Nine Tail Spirit#03	HIDDEN_WARP_NPC,{ end; }
payon_in03,35,93,1	script	Nine Tail Spirit#04	HIDDEN_WARP_NPC,{ end; }
pay_dun03,143,45,4	script	ジュウヒ#dun_dummy	HIDDEN_WARP_NPC,{ end; }
pay_dun03,138,43,7	script	青年学士#dun_dummy	HIDDEN_WARP_NPC,{ end; }

//= Warp
pay_dun03,140,46,0	script	揺らぐ空間#illusion_moonlight	4_ENERGY_BLUE,{
	if(illusion_moonlight < 5){
		mes "怪しい気が揺らいでいる。";
		mes "不気味な感じがする。";
		close;
	}
	if(illusion_moonlight == 5){ 
		mes "空間が歪んでいるような部分が見える。";
		next;
		classchange 4_F_03,"青年学士#dun_dummy",bc_self;
		classchange 4_M_PAY_SOLDIER,"ジュウヒ#dun_dummy",bc_self;
		npctalk "青年学士 : はあはあ、ここにいらっしゃったのですね。","青年学士#dun_dummy",bc_self;
		mes "[ 青年学士 ]";
		mes "急に消えて";
		mes "びっくりしました。";
		mes "これがムヒョンの言っていた";
		mes "具体化された悪夢と";
		mes "いうものなんですか？";
		next;
		if(select("れから調査をしようと考えている"))
		npctalk "兵士シンジュウヒ : 予想はしていたけど……ホドニ、お前は本当に適当じゃないか？","ジュウヒ#dun_dummy",bc_self;
		mes "[ 青年学士 ]";
		mes "それじゃその調査に";
		mes "私も同行したらダメですか？";
		mes "勿論、私ひとりでは";
		mes "危険だと思いますが";
		mes "ここにいるジュウヒと一緒なら";
		mes "大丈夫だと思いませんか？！";
		next;
		npctalk "兵士シンジュウヒ : 勝手に触るな！","ジュウヒ#dun_dummy",bc_self;
		mes "[ 青年学士 ]";
		mes "それじゃ、こ……これに触れればいいのかな？";
		illusion_moonlight = 6;
		completequest 7780;
		setquest 7781;
		close2;
		npctalk "青年学士 : うわあああああ～！！！","",bc_self;
		specialeffect 885,AREA,"青年学士#dun_dummy";
		sleep 500;
		classchange HIDDEN_WARP_NPC,"青年学士#dun_dummy",bc_self;
		sleep 2000;
		npctalk "兵士シンジュウヒ : おい～！ホドニ！！！","ジュウヒ#dun_dummy",bc_self;
		sleep 2000;
		npctalk "兵士シンジュウヒ : ……あのバカが余計なことをしやがって！！！","ジュウヒ#dun_dummy",bc_self;
		specialeffect 885,AREA,"ジュウヒ#dun_dummy";
		sleep 500;
		classchange HIDDEN_WARP_NPC,"ジュウヒ#dun_dummy",bc_self;
		end;
	}
	if(illusion_moonlight > 5){
		mes "歪曲された空間の向こうに";
		mes "何かが映る。";
		mes "どうしようかな？";
		next;
		if(select("進入する","やめる") == 2){
			mes "今はやめておこう。";
			close;
		}
		warp "pay_d03_i",140,44;
		end;
	}
	
OnInit:
	questinfo 7781,QTYPE_QUEST;
	//setquestinfo_req 7781,7780,1;
	end;
}
pay_d03_i,140,46,0	script	Shimmering Portal#illusion_moonlight_2	4_ENERGY_BLUE,{
	mes "I can go back to the ruined village.","What should I do?";
	next;
	if(select("Exit.:Do not exit.") == 2){
		end;
	}
	warp "pay_dun03",140,44;
	end;
}

//= Illusion Dungeon
pay_d03_i,149,45,4	script	学士ホドニ#illusion_moonlight	4_F_03,{
	if(illusion_moonlight == 6){
		mes "[ ホドニ ]";
		mes "ちょっとこっちを見て下さい！";
		mes "先ほど私たちがいた";
		mes "廃村に間違いないのに";
		mes "そうじゃないようにも見えます！";
		next;
		mes "[ ホドニ ]";
		mes "ここにいる人たちも";
		mes "九尾狐たちも何か様子が変です。";
		mes "特に妙な魔法使いが";
		mes "歩き回っているのですが";
		mes "この事件の元凶ではないんでしょうか？";
		next;
		mes "[ ホドニ ]";
		mes "そして九尾狐たち！";
		mes "人々！死霊たち！";
		mes "まるで昔話に聞いた事件の";
		mes "山崩れで村が埋まったその時に";
		mes "戻ってしまったような……。";
		next;
		mes "[ ホドニ ]";
		mes "調査！調査が必要になると思います。";
		mes "勿論、協力して頂けますよね？";
		next;
		mes "[ ホドニ ]";
		mes "準備ができたら";
		mes "話かけて下さい。";
		illusion_moonlight = 7;
		completequest 7781;
		end;
	}
	if(illusion_moonlight == 7){
		mes "[ ホドニ ]";
		mes "ここの人々から聞けた話は";
		mes "怪しい魔法使いのことばかりでした。";
		next;
		mes "[ ホドニ ]";
		mes "何も考えずに大魔法を使い";
		mes "そのせいで地盤が崩れて";
		mes "山崩れが起きたそうです。";
		mes "当たり前だと思うけど";
		mes "そんな事件なら住民も";
		mes "たくさん死んだんでしょうね。";
		next;
		mes "[ ホドニ ]";
		mes "いくら考えても、悪夢の元凶は";
		mes "その怪しい魔法使いでしょう。";
		mes "悪夢の元凶を除去すれば";
		mes "この悪夢は具体化されず";
		mes "消えるのではないでしょうか？";
		next;
		mes "[ ホドニ ]";
		mes "実際には魔法使いは";
		mes "何も関連の無い人物である";
		mes "可能性もありますが";
		mes "調べてみる価値は";
		mes "あると考えています。";
		next;
		mes "[ ホドニ ]";
		mes "ただ今回の件で最も重要なのは";
		mes "夢と現実の境界がなぜ崩れたのかです。";
		mes "他の場所でもこのようなことが";
		mes "また発生するのでしょうか？";
		next;
		mes "[ ホドニ ]";
		mes "とにかく調査してみましょう。";
		mes "^4d4dff真理の魔法使い^000000は";
		mes "かなり強力そうに見えるので";
		mes "気を付けてください。";
		mes "冒険者様の仲間がいるなら一緒に";
		mes "相手する事をお勧めします。";
		next;
		if(select("調査をする","断る") == 2){
			mes "[ ホドニ ]";
			mes "うう……では他の要素を";
			mes "調査するしかありませんね！";
			mes "勿論、今回のことで";
			mes "私が冒険者様を恨んだりはしませんが！";
			end;
		}
		mes "[ ホドニ ]";
		mes "私もその間に";
		mes "周囲を調べてみますので";
		mes "少し経ったら";
		mes "もう一度話しかけてください。";
		setquest 7782;
		illusion_moonlight = 8;
		end;
	}
	if(illusion_moonlight == 8){
		switch(checkquest(7782,HUNTING)){
			case -1:
				mes "- Unknown has occured. -";
				end;
			case 0:
			case 1:
				mes "[ ホドニ ]";
				mes "That ^0000FFenlightened mage^000000 looks dangerous.","Please stop him.";
				end;
			case 2:
				mes "[ ホドニ ]";
				mes "お待たせいたしました。";
				mes "何となく今回の件の";
				mes "原因が掴めてきましたよ。";
				next;
				mes "[ ホドニ ]";
				mes "ムヒョンが言っていたことを";
				mes "覚えていますか？";
				mes "狐の悪夢が具体化されたと";
				mes "言っていたのを。";
				next;
				mes "[ ホドニ ]";
				mes "周辺を調査しながら";
				mes "考えてみましたが";
				mes "ここはやはり月夜花が作り出した";
				mes "悪夢のようです。";
				next;
				mes "[ ホドニ ]";
				mes "どうして悪夢が現実と";
				mes "繋がるようになったのか";
				mes "分かりませんが、ひとつだけ";
				mes "確かなことがあります。";
				next;
				mes "[ ホドニ ]";
				mes "月夜花が過去の事件を";
				mes "まだ忘れていないということです。";
				next;
				mes "[ ホドニ ]";
				mes "当時の事件が";
				mes "大きいな苦痛として残り";
				mes "今現在まで恨みとして";
				mes "積もり続けていたようです。";
				mes "それが何かの切っ掛けで";
				mes "爆発したのではないかと……。";
				next;
				mes "[ ホドニ ]";
				mes "まだ知らない事実が";
				mes "あると思いませんか？";
				mes "もう少しここで";
				mes "調査を続けようと思います。";
				next;
				mes "[ ホドニ ]";
				mes "このことをフェイヨン離宮にいる";
				mes "ムヒョンにも伝えて下さい。";
				mes "私はそれまでの間";
				mes "ジュウヒと一緒に";
				mes "付近を回って調べてみます。";
				next;
				mes "[ ホドニ ]";
				mes "この現象に対する";
				mes "何かしらの解答が";
				mes "出るならいいですが。";
				getitem 25271,1; //= Illusion Stone
				erasequest 7782;
				setquest 7783;
				setquest 7788;
				illusion_moonlight = 9;
				end;
		}
	}
	switch(checkquest(7783,PLAYTIME)){
		case -1:
			break;
			
		case 0:
		case 1:
			mes "[ ホドニ ]";
			mes "Now I know this is not the ruined village.","Are we really inside a Moonlight Flower's nightmare?";
			next;
			mes "[ ホドニ ]";
			mes "That's what ムヒョン said.","Their nightmares are coming true.";
			next;
			mes "[ ホドニ ]";
			mes "This place is a worth of a serious study.";
			end;
			
		case 2:
			erasequest 7783;
			break;	
	}
	switch(checkquest(7782,HUNTING)){
		case -1:
			mes "[ ホドニ ]";
			mes "ここの人々から聞けた話は";
			mes "怪しい魔法使いのことばかりでした。";
			next;
			mes "[ ホドニ ]";
			mes "何も考えずに大魔法を使い";
			mes "そのせいで地盤が崩れて";
			mes "山崩れが起きたそうです。";
			mes "当たり前だと思うけど";
			mes "そんな事件なら住民も";
			mes "たくさん死んだんでしょうね。";
			next;
			mes "[ ホドニ ]";
			mes "いくら考えても、悪夢の元凶は";
			mes "その怪しい魔法使いでしょう。";
			mes "悪夢の元凶を除去すれば";
			mes "この悪夢は具体化されず";
			mes "消えるのではないでしょうか？";
			next;
			mes "[ ホドニ ]";
			mes "実際には魔法使いは";
			mes "何も関連の無い人物である";
			mes "可能性もありますが";
			mes "調べてみる価値は";
			mes "あると考えています。";
			next;
			mes "[ ホドニ ]";
			mes "ただ今回の件で最も重要なのは";
			mes "夢と現実の境界がなぜ崩れたのかです。";
			mes "他の場所でもこのようなことが";
			mes "また発生するのでしょうか？";
			next;
			mes "[ ホドニ ]";
			mes "とにかく調査してみましょう。";
			mes "^4d4dff真理の魔法使い^000000は";
			mes "かなり強力そうに見えるので";
			mes "気を付けてください。";
			mes "冒険者様の仲間がいるなら一緒に";
			mes "相手する事をお勧めします。";
			next;
			mes "[ ホドニ ]";
			mes "He is pretty formidable. I wouldn't recommend ^0000FFfight him alone.^000000";
			next;
			if(select("Will do.:No, thanks.") == 2){
				mes "[ ホドニ ]";
				mes "Err, then I'll have to investigate something else.","But I won't resent you for this. I promise.";
				end;
			}
			mes "[ ホドニ ]";
			mes "Good luck.","That wizard looks pretty strong.","Please be careful.";
			setquest 7782;
			end;
		case 0:
		case 1:
			mes "[ ホドニ ]";
			mes "That ^0000FFenlightened mage^000000 looks dangerous.","Please stop him.";
			end;
		case 2:
			mes "[ ホドニ ]";
			mes "まだ知らない事実が";
			mes "あると思いませんか？";
			mes "もう少しここで";
			mes "調査を続けようと思います。";
			next;
			mes "[ ホドニ ]";
			mes "この現象に対する";
			mes "何かしらの解答が";
			mes "出るならいいですが。";
			getitem 25271,1; //= Illusion Stone
			erasequest 7782;
			setquest 7783;
			end;		
	}		
}
pay_d03_i,152,45,4	script	Soldier ジュウヒ#illusion_moonlight	4_M_PAY_SOLDIER,{
	if(illusion_moonlight == 6){
		mes "[ ジュウヒ ]";
		mes "何の対策もないまま";
		mes "入った時から感じてましたが、";
		mes "少しの間、ホドニと一緒に";
		mes "行動をしなければならなさそうですね。";
		next;
		mes "[ ジュウヒ ]";
		mes "何よりもここの九尾狐は";
		mes "亡霊たちからよくない気配が感じられます。";
		mes "…これは困ったことになりました。";
		close;
	}
	if(illusion_moonlight > 6){
		if(checkquest(7784,HUNTING) == 2){
			mes "[ ジュウヒ ]";
			mes "これが実体であろうがなかろうが";
			mes "危険要素になるのは間違いありません。";
			mes "よく処理して下さいました。";
			next;
			mes "[ ジュウヒ ]";
			mes "ホドニの調査も終わりに";
			mes "向かっているようですし";
			mes "そろそろ帰還の準備を";
			mes "しておいた方がよさそうですね。";
			erasequest 7784;
			setquest 7785;
			getitem 25271,1; //= Illusion Stone
			end;
		}
		if(checkquest(7786,HUNTING)  == 2){
			mes "[ ジュウヒ ]";
			mes "これが実体であろうがなかろうが";
			mes "危険要素になるのは間違いありません。";
			mes "I can symphatize with the soldier.";
			next;
			mes "[ ジュウヒ ]";
			mes "All he wanted to do was protect others, and he died without fulfilling that wish.","Thank you for helping them rest.";
			erasequest 7786;
			setquest 7787;
			getitem 25271,1; //= Illusion Stone
			end;
		}
		mes "[ ジュウヒ ]";
		mes "There's another portal that looks just like the one we came through.","I touched it, and it sent me back to the original ruined village.";
		next;
		if(select("怒りの九尾狐について:About the angry Soldiers.") == 1){
			switch(checkquest(7785,PLAYTIME)){
				case -1:
					break;
				case 0:
				case 1:
					mes "[ ジュウヒ ]";
					mes "ホドニの調査によれば";
					mes "ここは月夜花の悪夢の中だそうです。";
					mes "幻影にすぎない九尾狐ですが";
					mes "こいつらが万が一";
					mes "生きている人に害を及ぼすなら";
					mes "退治するのは当然だと考えています。";
					next;
					mes "[ ジュウヒ ]";
					mes "死霊に慈悲も";
					mes "持たない奴だと言われても";
					mes "返す言葉はありません。";
					mes "それじゃ私はホドニと一緒に";
					mes "他の場所を見回ってみることにします。";
					end;
				case 2:
					erasequest 7785;
					break;
			}
			switch(checkquest(7784,HUNTING)){
				case -1:
					mes "[ ジュウヒ ]";
					mes "近くいる怒りの九尾狐たちが";
					mes "脅かしに来てホドニは調査に";
					mes "苦労しているみたいです。";
					mes "冒険者様に九尾狐たちの退治を";
					mes "お願いしたいですが……。";
					next;
					if(select("受託する","断る") == 2){
						mes "[ ジュウヒ ]";
						mes "遠くまで調査に出かけることは";
						mes "出来なさそうですね。";
						end;
					}
					mes "[ ジュウヒ ]";
					mes "それではお願いします。";
					mes "^4d4dff怒りの九尾狐^000000の";
					mes "心情を理解できないわけでは";
					mes "ありませんけど、それはそれ";
					mes "これはこれですから。";
					setquest 7784;
					end;
					
				case 0:
				case 1:
					mes "[ ジュウヒ ]";
					mes "周辺にいる^4d4dff怒りの九尾狐^000000を";
					mes "退治してください。";
					mes "ホドニの調査がもう少し円滑になる為です。";
					close;
			}
		} else {
			switch(checkquest(7787,PLAYTIME)){
				case -1:
					break;
				case 0:
				case 1:
					mes "[ ジュウヒ ]";
					mes "If we're really inside Moonlight Flower's nightmare, like ホドニ thinks,","then the angry soldier over there must have been the guard of this village.";
					next;
					mes "[ ジュウヒ ]";
					mes "It doesn't matter if this is real or not. Watching my ancestors suffer is difficult.","I may end up wasting our time, but I want to try to help them rest.";
					close;
				case 2:
					erasequest 7787;
					break;
			}
			switch(checkquest(7786,HUNTING)){
				case -1:
					mes "[ ジュウヒ ]";
					mes "These soldiers tried to protect their villagers until the last moment,","and got buried with them. No wonder they're so angry.";
					next;
					mes "[ ジュウヒ ]";
					mes "Would you be so kind as to put them to rest for me?";
					next;
					if(select("受諾する","断る") == 2){
						mes "[ ジュウヒ ]";
						mes "I really don't want to deal with them myself,","but I guess I'll have to.";
						end;
					}
					mes "[ ジュウヒ ]";
					mes "Thank you.","I'll leave the ^0000FFAngry Soldiers^000000 to you.","Please send them to heaven.";
					setquest 7786;
					end;
					
				case 0:
				case 1:
					mes "[ ジュウヒ ]";
					mes "Please take care of the ^0000FFAngry Soldiers^000000 in this place.","I mean... send them to Heaven.";
					close;
			}
		}
	}
}

pay_d03_i,160,45,4	script	Gemcutter#illusion_moonlight	4_TOWER_17,{
	mes "[ Gemcutter ]";
	mes "Do you have business with me?";
	next;
	switch(select("What are you doing here?:Upgrade Weapon.:Upgrade Armor.")){
		case 1:
			mes "[ Gemcutter ]";
			mes "I came to the ruined village,","looking for some materials. Touched some strange light, and now I'm here.";
			next;
			mes "[ Gemcutter ]";
			mes "I've decided to stick around for a little while. Figured I'd be safe so long as I stay close to this soldier.","I have a proposition for you. I want some materials that can only be found in this place.";
			next;
			mes "[ Gemcutter ]";
			mes "Get them for me, and I'll improve your equipment in exchange. Just so you know, I can only improve certain types.";
			next;
			mes "[ Gemcutter ]";
			mes "If you're interested, we can discuss the details of our bargain.";
			close;
			
		case 2:
			mes "[ Gemcutter ]";
			mes "The following is the list of equipment I can handle.";
			for(.@i = 0; .@i < getarraysize(.weapon_upgrade$); .@i += 3){
				mes "<ITEM>"+getitemname(atoi(.weapon_upgrade$[.@i]))+"<INFO>"+atoi(.weapon_upgrade$[.@i])+"</INFO></ITEM>";
			}
			next;
			mes "[ Gemcutter ]";
			mes "Make sure ^0000FFyour equipment is refined to at least +7^000000 before bringing it to me.","That's the minimum requirement for my upgrade service to have any visible effects on your equipment.";
			next;
			mes "[ Gemcutter ]";
			mes "Make sure you're ^0000FFequipped with the item that you want to improve.^000000","Otherwise, I can't evaluate its condition.";
			next;
			mes "[ Gemcutter ]";
			mes "As you may have guessed, your equipment will transform into something new after this.","In other words, ^0000FFIt'll lose its current refining levels, cards and enchantments.^000000";
			next;
			mes "[ Gemcutter ]";
			mes "And I need ^0000FFIllusion Stones and some other materials^000000 to upgrade your equipment.","Pick an item you want and I'll tell you what I need.";
			next;
			for(.@i = 0; .@i < getarraysize(.weapon_upgrade$); .@i += 3){
				.@menu$ += getitemname(atoi(.weapon_upgrade$[.@i])) + ":";
			}
			.@s = (select(.@menu$) - 1) * 3;
			mes "[ Gemcutter ]";
			mes "For that equipment, I need the following materials.";
			mes "^0000FF+7 " + getitemname(atoi(.weapon_upgrade$[.@s+1])) +"^000000";
			getinventorylist(getcharid(0));
			for(.@i = 0; .@i < @inventorylist_count; .@i++){
				if(@inventorylist_id[.@i] !=  atoi(.weapon_upgrade$[.@s+1])){ 
					continue;
				}
				if(@inventorylist_refine[.@i] >= 7){
					.@index = .@i;
					.@weapon_check = 1;
					break;
				} else {
					continue;
				}	
			}
			explode(.@data$,.weapon_upgrade$[.@s+2],",");
			for(.@i = 0; .@i < getarraysize(.@data$); .@i += 2){
				if(countitem(atoi(.@data$[.@i])) < atoi(.@data$[.@i+1])) .@missing += 1;
				mes "^0000FF"+.@data$[.@i+1]+ " " +getitemname(atoi(.@data$[.@i]))+"^000000";
			}
			mes "Do you want to continue?";
			next;
			if(select("Continue.:I'll bring those materials") == 2){
				mes "[ Gemcutter ]";
				mes "Comeback when you're ready.";
				close;
			}
			if(.@weapon_check < 1 || .@missing > 0){
				mes "[ Gemcutter ]";
				mes "You don't have all the materials";
				end;
			}
			delitem2 @inventorylist_id[.@index],1,@inventorylist_identify[.@index],@inventorylist_refine[.@index],@inventorylist_attribute[.@index],@inventorylist_card1[.@index],@inventorylist_card2[.@index],@inventorylist_card3[.@index],@inventorylist_card4[.@index]; 
			for(.@i = 0; .@i < getarraysize(.@data$); .@i += 2){
				delitem atoi(.@data$[.@i]),atoi(.@data$[.@i+1]);
			}
			mes "[ Gemcutter ]";
			mes "Here is your upgraded equipment.";
			getitem atoi(.weapon_upgrade$[.@s]),1;
			end;
			
		case 3:
			mes "[ Gemcutter ]";
			mes "The following is the list of equipment I can handle.";
			for(.@i = 0; .@i < getarraysize(.armor_upgrade$); .@i += 3){
				mes "<ITEM>"+getitemname(atoi(.armor_upgrade$[.@i]))+"<INFO>"+atoi(.armor_upgrade$[.@i])+"</INFO></ITEM>";
			}
			next;
			mes "[ Gemcutter ]";
			mes "Make sure ^0000FFyour equipment is refined to at least +7^000000 before bringing it to me.","That's the minimum requirement for my upgrade service to have any visible effects on your equipment.";
			next;
			mes "[ Gemcutter ]";
			mes "Make sure you're ^0000FFequipped with the item that you want to improve.^000000","Otherwise, I can't evaluate its condition.";
			next;
			mes "[ Gemcutter ]";
			mes "As you may have guessed, your equipment will transform into something new after this.","In other words, ^0000FFIt'll lose its current refining levels, cards and enchantments.^000000";
			next;
			mes "[ Gemcutter ]";
			mes "And I need ^0000FFIllusion Stones and some other materials^000000 to upgrade your equipment.","Pick an item you want and I'll tell you what I need.";
			next;
			for(.@i = 0; .@i < getarraysize(.armor_upgrade$); .@i += 3){
				.@menu$ += getitemname(atoi(.armor_upgrade$[.@i])) + ":";
			}
			.@s = (select(.@menu$) - 1) * 3;
			mes "[ Gemcutter ]";
			mes "For that equipment, I need the following materials.";
			mes "^0000FF+7 " + getitemname(atoi(.armor_upgrade$[.@s+1])) +"^000000";
			getinventorylist(getcharid(0));
			for(.@i = 0; .@i < @inventorylist_count; .@i++){
				if(@inventorylist_id[.@i] !=  atoi(.armor_upgrade$[.@s+1])){ 
					continue;
				}
				if(@inventorylist_refine[.@i] >= 7){
					.@index = .@i;
					.@weapon_check = 1;
					break;
				} else {
					continue;
				}	
			}
			explode(.@data$,.armor_upgrade$[.@s+2],",");
			for(.@i = 0; .@i < getarraysize(.@data$); .@i += 2){
				if(countitem(atoi(.@data$[.@i])) < atoi(.@data$[.@i+1])) .@missing += 1;
				mes "^0000FF"+.@data$[.@i+1]+ " " +getitemname(atoi(.@data$[.@i]))+"^000000";
			}
			mes "Do you want to continue?";
			next;
			if(select("Continue.:I'll bring those materials") == 2){
				mes "[ Gemcutter ]";
				mes "Comeback when you're ready.";
				close;
			}
			if(.@weapon_check < 1 || .@missing > 0){
				mes "[ Gemcutter ]";
				mes "You don't have all the materials";
				end;
			}
			delitem2 @inventorylist_id[.@index],1,@inventorylist_identify[.@index],@inventorylist_refine[.@index],@inventorylist_attribute[.@index],@inventorylist_card1[.@index],@inventorylist_card2[.@index],@inventorylist_card3[.@index],@inventorylist_card4[.@index]; 
			for(.@i = 0; .@i < getarraysize(.@data$); .@i += 2){
				delitem atoi(.@data$[.@i]),atoi(.@data$[.@i+1]);
			}
			mes "[ Gemcutter ]";
			mes "Here is your upgraded equipment.";
			getitem atoi(.armor_upgrade$[.@s]),1;
			end;
	}
	end;
	
OnInit:
	setarray .weapon_upgrade$,
	26109,1648,"25271,30,25256,100",
	28725,1234,"25271,30,25256,100",
	16063,1525,"25271,10,25256,20",
	26007,1477,"25271,10,25256,100";
	setarray .armor_upgrade$,
	19209,2277,"25271,10,25257,100",
	19210,2285,"25271,10,25258,100",
	15195,15012,"25271,10,25256,100",
	20838,2504,"25271,10,23228,100",
	22133,2404,"25271,10,23228,100";
	end;
	
}

-	script	illusion_mob#moonlight	-1,{
	OnInit:
		monster "pay_d03_i",0,0,"Angry Nine Tail",3759,15,strnpcinfo(0)+"::OnSummonMVP";
		monster "pay_d03_i",55,75,"Wizard of Truth",3764,1,strnpcinfo(0)+"::OnSummonWizard";
		end;
		
	OnSummonMVP:
		monster "pay_d03_i",0,0,"Angry Nine Tail",3759,1,strnpcinfo(0)+"::OnSummonMVP";
		$illusion_mvp += 1;
		if($illusion_mvp >= 5){ //= jRO Summons the MVP after 800 kills or so
			mapannounce "pay_d03_i","Angry Moonlight Flower : Who dares bully us again? They're in a lot of trouble.",bc_map;
			monster "pay_d03_i",0,0,"Angry Moonlight Flower",3758,1;
			$illusion_mvp = 0;
		}
		end;
		
	OnSummonWizard:
		monster "pay_d03_i",55,75,"Wizard of Truth",3764,1,strnpcinfo(0)+"::OnSummonWizard";
		end;
}

pay_d03_i,0,0	monster	Cursed Munak	3760,20,5000
pay_d03_i,0,0	monster	Cursed Bongun	3761,20,5000
pay_d03_i,0,0	monster	Cursed Sohee	3762,20,5000
pay_d03_i,0,0	monster	Angry Soldier	3763,10,5000
pay_d03_i,0,0	monster	Fury Hero	3765,5,5000

