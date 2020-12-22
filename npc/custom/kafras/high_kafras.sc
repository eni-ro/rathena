function	script	highkafra	{

	function Buff;		//支援
	function Storage;	//倉庫
	function SavePoint_K;	//位置セーブ
	function GuildStorage;	//ギルド倉庫
	function Confirmation;	//色々確認用
	function SoulLink;	//魂のクラス参照
	function GM_Menu;

	if(getgmlevel())
		set .@gm$,"GMメニュー";

	set @name$, "[カプラ職員]";
	set @zeny,0;
	set @kind,0;

	mes @name$;
	mes "いらっしゃいませ";
	mes "カプラサービスは";
	mes "いつも皆様のそばにいます。";
	if(CASHPOINTS)
		mes "ShopPoint："+callfunc ("Sistem_Digit",CASHPOINTS,0);
	next;
	switch(select("支援サービス","倉庫を利用する","位置セーブサービス","ギルド倉庫を利用する","終了",.@gm$)){
		case 1:
			Buff; break;
		case 2:
			Storage; break;
		case 3:
			SavePoint_K; break;
		case 4:
			GuildStorage; break;
		case 5:
		case 6:
			GM_Menu;
			break;
	}
	mes @name$;
	mes "我々カプラサービスは、より完璧な";
	mes "サービスと管理業務を目指し";
	mes "お客様が安心してご利用いただけるよう";
	mes "いつも最善を尽くしています。";
	mes "カプラサービスをご利用いただき";
	mes "ありがとうございました。";
	close;

	function Buff {		//支援
		mes @name$;
		mes "こちらは支援サービスを行っています。";
		mes "ご希望の支援をお選びください。";
		next;
		switch(select("標準セット","ソウルリンク","コーティング","装備修理","今はいいです")) {
			case 1:	//標準セット
				mes @name$;
				mes "このセットでは以下の支援スキルを行います。";
				mes "^0000FFブレッシング、速度増加、";
				mes "イムポシティオマヌス、サクラメント";
				mes "キリエエレイソン、マグニフィカート";
				mes "装備修理もついでに！^000000";
				mes "効率よく狩りしたい方にオススメです♪";
				mes "料金は^FF000010分：1000 Zeny^000000になりますが";
				mes "よろしいですか？";
				next;
				if(select("支援してもらう","今はいいです")==2)
					return;

				set @kind,1;
				set @zeny,1000;
				Confirmation;

				sc_start SC_BLESSING,600000,10; //ブレッシング
				skilleffect "AL_BLESSING",0;
				sc_start SC_INCREASEAGI,600000,10; //速度増加
				skilleffect "AL_INCAGI",0;
				sc_start SC_IMPOSITIO,600000,5; //イムポシティオマヌス
				skilleffect "PR_IMPOSITIO",0;
				sc_start SC_KYRIE,600000,10; //キリエエレイソン
				skilleffect "PR_KYRIE",0;
				sc_start SC_MAGNIFICAT,600000,5; //マグニフィカート
				skilleffect "PR_MAGNIFICAT",0;
				sc_start SC_SECRAMENT,180000,5; //サクラメント
				skilleffect "AB_SECRAMENT",0;
				skilleffect "CR_FULLPROTECTION",0;

				if(getrepairableitemcount()){	//装備が破損している場合の条件分岐
					mes @name$;
					mes "あれあれ、装備が破損していますね";
					mes "ついでに修理していきますか？";
					next;
					if(select("装備を修理してもらう","今は大丈夫です")==2)
						return;

					set @kind,4;
					set @zeny,5000*getrepairableitemcount();
					Confirmation;

					repairitem;
					skilleffect "BS_REPAIRWEAPON",0;
				}
				break;
			case 2:	//ソウルリンク
				mes @name$;
				mes "あなたの魂にソウルリンクっ";
				mes "魂注入サービスですね。";
				mes "職業に合ったご先祖様をリンクします。";
				mes "料金はどれでも^FF000030分：5000 Zeny^000000";
				mes "になりますが、よろしいですか？";
				next;
				if(select("リンクしてもらう","今はいいです")==2)
					return;
				
				set @kind,2;
				set @zeny,5000;
				Confirmation;
				SoulLink;
				break;
			case 3:	//コーティング
				mes @name$;
				mes "装備部位のコーティングですね。";
				mes "^0000FFフルケミカルチャージ^000000を行います。";
				mes "負けられない決戦はこれで決まり♪";
				mes "料金は^FF000010分：4000 Zeny^000000になりますが";
				mes "よろしいですか？";
				next;

				if(select("コーティングしてもらう","今はいいです")==2)
					return;
				set @kind,3;
				set @zeny,4000;
				Confirmation;

				sc_start SC_CP_WEAPON,600000,5; // ケミカルウェポンチャージ
				sc_start SC_CP_SHIELD,600000,5; // ケミカルシールドチャージ
				sc_start SC_CP_ARMOR,600000,5; // ケミカルアーマーチャージ
				sc_start SC_CP_HELM,600000,5; // ケミカルヘルムチャージ
				skilleffect "CR_FULLPROTECTION",0;
				break;


			case 4:	//装備修理
				mes @name$;
				mes "修理したいアイテムはありますか？";
				mes "アイテムの修理は私にお任せあれ！";
				next;
				if(select("実は修理して欲しいアイテムが……","今は特に無いです")==2)
					return;
				set @kind,4;
				set @zeny,5000*getrepairableitemcount();
				Confirmation;
				repairitem;
				skilleffect "BS_REPAIRWEAPON",0;
				break;
			default:
				break;
		}
		return;
	}


	function SavePoint_K {	//位置セーブ
		.@map$ = strcharinfo(3);
		.@charn$ = strcharinfo(0);
		if( getmapxy(.@map$,.@xpos,.@ypos) == -1 ){
			mes "エラー。";
			close;
		}
		savepoint .@map$,.@xpos,.@ypos;
		mes @name$;
		mes "セーブしました。";
		mes "ゆっくりお過ごしください。";
		close;
	}


	function Storage {	//倉庫
		set @zeny,40;
		set @kind,0;
		Confirmation;
		openstorage;
		return;
	}

	function GuildStorage {	//ギルド倉庫
		switch(guildopenstorage()){
			case GSTORAGE_OPEN:	//倉庫オープン
				break;
			case GSTORAGE_STORAGE_ALREADY_OPEN:	//ギルド倉庫使用中
			case GSTORAGE_ALREADY_OPEN:
				mes @name$;
				mes "ギルドメンバーが倉庫を使用中です。";
				mes "しばらく待ってから利用してください。";
				close;
			case GSTORAGE_NO_GUILD:	//ギルド未所属
				mes @name$;
				mes "ギルドに所属してない方は";
				mes "利用することができません。";
				close;
			case GSTORAGE_NO_STORAGE:
				mes @name$;
				mes "ギルド倉庫機能は";
				mes "まだ開放されていません。";
				close;
			case GSTORAGE_NO_PERMISSION:
				mes @name$;
				mes "ギルド倉庫の";
				mes "利用権限がありません。";
				close;
		}
		return;
	}
	function Confirmation {	//Zenyやスキルの確認
		//武器修理時の所持確認
		if(@kind == 4 && !getrepairableitemcount()){
			mes @name$;
			mes "あれあれ……";
			mes "修理する必要のあるものなんて";
			mes "一つも持っていませんよ？";
			close;
		} else if(@kind ==4){
			mes @name$;
			mes "貴方がが持っているアイテムで";
			mes "損傷しているアイテムは";
			mes "全部で"+getrepairableitemcount()+ "個になります";
			next;
			mes @name$;
			mes "一つ修理するのに 5000 Zenyになります";
			mes "全て直すと" +@zeny+ "Zenyになりますが";
			mes "修理いたしますか？";
			next;
			if(select("お願いします","いいえ")==2) {
				mes @name$;
				mes "アイテムが傷ついたまま";
				mes "放って置かれるなんて・・・";
				mes "冒険者失格ですよ？";
				close;
			}
		}

		if(Zeny < @zeny){	//Zeny確認
			mes @name$;
			mes "お客様、お金が足りません。";
			mes "所持金をお確かめください。";
			mes "ご利用には^FF0000"+@zeny+"^000000Zeny必要です";
			close;
		}

		if (((getskilllv(1) < 6) && (getskilllv(5018)<0))&& !@kind) {	//スキル確認
			mes @name$;
			mes "倉庫は基本スキルレベル6";
			mes "ドラム基本スキルレベル1を";
			mes "習得してから利用可能となります。";
			close;
		}

		if(@kind == 2){
			switch(Job){	//ガンスリンガー・忍者・影狼・朧のリンク対象外の弾き
				case Job_Gunslinger:
				case Job_Ninja:
				case Job_Kagerou:
				case Job_Oboro:
					mes @name$;
					mes "あら、お客様の職業は";
					mes "リンクできないようです。";
					mes "他の職業の時に";
					mes "またいらして下さい。";
					close;
			}
		}
		set Zeny,Zeny-@zeny;
		return;
	}

	function SoulLink {	//魂のクラス参照
		set .@eac, eaclass();
		switch(.@eac & EAJ_UPPERMASK){
			case EAJ_KNIGHT:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_KNIGHT",0;
				set .@soul_name$,"ナイトの魂";
				break;
			case EAJ_CRUSADER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_CRUSADER",0;
				set .@soul_name$,"クルセイダーの魂";
				break;
			case EAJ_WIZARD:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_WIZARD",0;
				set .@soul_name$,"ウィザードの魂";
				break;
			case EAJ_SAGE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SAGE",0;
				set .@soul_name$,"セージの魂";
				break;
			case EAJ_HUNTER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_HUNTER",0;
				set .@soul_name$,"ハンターの魂";
				break;
			case EAJ_BARDDANCER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_BARDDANCER",0;
				set .@soul_name$,"バードとダンサーの魂";
				break;
			case EAJ_PRIEST:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_PRIEST",0;
				set .@soul_name$,"プリーストの魂";
				break;
			case EAJ_MONK:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_MONK",0;
				set .@soul_name$,"モンクの魂";
				break;
			case EAJ_BLACKSMITH:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_BLACKSMITH",0;
				set .@soul_name$,"ブラックスミスの魂";
				break;
			case EAJ_ALCHEMIST:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ALCHEMIST",0;
				set .@soul_name$,"アルケミストの魂";
				break;
			case EAJ_ASSASSIN:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ASSASIN",0;
				set .@soul_name$,"アサシンの魂";
				break;
			case EAJ_ROGUE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_ROGUE",0;
				set .@soul_name$,"ローグの魂";
				break;
			case EAJ_STARGLADIATOR:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_STAR",0;
				set .@soul_name$,"拳聖の魂";
				break;
			case EAJ_SOULLINKER:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SOULLINKER",0;
				set .@soul_name$,"ソウルリンカーの魂";
				break;
			case EAJ_SUPERNOVICE:
				sc_start SC_SPIRIT,1800000,5;
				skilleffect "SL_SUPERNOVICE",0;
				set .@soul_name$,"スーパーノービスの魂";
				break;
			default:
				if( .@eac & EAJL_UPPER ){
					sc_start SC_SPIRIT,1800000,5;
					skilleffect "SL_HIGH",0;
					set .@soul_name$,"転生一次職の魂";
					break;
				}
				mes "Error";
				close;
		}
		mes "☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆";
		mes " ";
		mes "     リンクしました。";
		mes " ";
		mes "    『 ^4169E1"+ .@soul_name$ + "^000000 』";
		mes " ";
		mes "☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆";
		next;
		return;
	}

	function GM_Menu {	//GMメニュー
		if(!getgmlevel())
			return;

		mes @name$;
		mes "如何いたしますか？";
		next;
		switch(select("転送","GMコマンド","IP検索","やめる")){
			case 1:
				break;
			case 2:
				callfunc "GmComand";
				close;
			case 3:
				callfunc "IP_Search";
				close;
			default:
				close;
		}
		
		switch(select("GM執務室","やめる")){
			case 1:
				warp "vip",65,46;
				end;
			default:
				break;
		}
		return;
	}
}

/*================================================
	設置例
--------------------------------------------------
cut-in名 / getarg(0)		ID番号
========			======
kafra_01 (ディフォルテー)	117
kafra_02 (ポニーテール)		116
kafra_03 (黒髪ロング)		115
kafra_04 (オレンジショート)	114
kafra_05 (メガネ)		113
kafra_06 (ツインテール)		112
kafra_07 (コモド)		721
kafra_08 (青ショート)		860
kafra_09 (赤ロング)		861
--------------------------------------------------
callfunc "highkafra","0"
--------------------------------------------------*/
venette,122,134,5	script	カプラ職員::1	861,{
	callfunc "highkafra";
	end;
}
venette,88,136,4	script	カプラ職員::デフォルテー	117,{
	callfunc "highkafra";
	end;
}
venette,162,136,4	script	カプラ職員::テーリング		116,{
	callfunc "highkafra";
	end;
}
vip,83,62,3	script	カプラ職員::1	860,{
	callfunc "highkafra";
	end;
}
ven_in01,268,58,2	script	カプラ職員::1	861,{
	callfunc "highkafra";
	end;
}
ven_in01,106,96,4	script	カプラ職員::1	861,{
	callfunc "highkafra";
	end;
}
department,187,116,5	script	カプラ職員::1	861,{
	callfunc "highkafra";
	end;
}
department,54,102,3	script	カプラ職員::1	861,{
	callfunc "highkafra";
	end;
}
//=============================================================================
function	script	AutoBuff	{	//ワンクリックでオートバフ

	if(Zeny > 1000){
		sc_start SC_BLESSING,600000,10; //ブレッシング
		skilleffect "AL_BLESSING",0;
		sc_start SC_INCREASEAGI,600000,10; //速度増加
		skilleffect "AL_INCAGI",0;
		sc_start SC_IMPOSITIO,600000,5; //イムポシティオマヌス
		skilleffect "PR_IMPOSITIO",0;
		sc_start SC_KYRIE,600000,10; //キリエエレイソン
		skilleffect "PR_KYRIE",0;
		sc_start SC_MAGNIFICAT,600000,5; //マグニフィカート
		skilleffect "PR_MAGNIFICAT",0;
		sc_start SC_SECRAMENT,180000,5; //サクラメント
		skilleffect "AB_SECRAMENT",0;
		sc_start SC_CP_WEAPON,600000,5; // ケミカルウェポンチャージ
		sc_start SC_CP_SHIELD,600000,5; // ケミカルシールドチャージ
		sc_start SC_CP_ARMOR,600000,5; // ケミカルアーマーチャージ
		sc_start SC_CP_HELM,600000,5; // ケミカルヘルムチャージ
		skilleffect "CR_FULLPROTECTION",0;
		percentheal 100,100;
		set Zeny,Zeny - 1000;
	}

	if(getrepairableitemcount()){
		set @zeny,5000*getrepairableitemcount();
		if(Zeny > @zeny){
			repairitem;
			skilleffect "BS_REPAIRWEAPON",0;
			set Zeny,Zeny - @zeny;
		}
	}
	end;	

}

venette,128,131,5	script	ベネットの祝福	111,{
	callfunc "AutoBuff";
	end;
}
vip,72,51,3	script	バフ	469 ,{
	callfunc "AutoBuff";
	end;
}