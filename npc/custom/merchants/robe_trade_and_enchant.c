ven_in01,89,87,5	script	ローブマニア	4_M_ROKI,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000インベントリの中身を減らして来て下さい^000000";
		close;
	}
	mes "[ローブマニア]";
	mes "覚醒ローブと超越者のローブのことなら儂にまかせなさい。";
	next;
	switch( select("覚醒ローブ交換:覚醒ローブエンチャント:時魔術師のローブ交換:超越者のローブ交換:超越者のローブエンチャント")){
		case 1:
			.@reqiid = 15157;
			.@neediid = 15121;
			break;
		case 2:
			.@iid = 15157;
			goto L_ENCHANT;
		case 3:
			goto L_EXCHANGE_TIME_ROBE;
		case 4:
			.@reqiid = 15194;
			.@neediid = 15193;
			break;
		case 5:
			.@iid = 15194;
			goto L_ENCHANT;
	}
	//上位交換
	if(( getequipid(EQI_ARMOR) != .@neediid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 )){
		mes "[ローブマニア]";
		mes getitemname(.@reqiid)+"が欲しければ、+9以上の"+getitemname(.@neediid)+"を装備してまた来なさい。";
		close;
	}
	mes "[ローブマニア]";
	mes "装備している"+getitemname(.@neediid)+"と交換してよいかのう？";
	mes "※挿入しているカードは消失します。";
	next;
	if(select("交換する:やめる")==2){
		mes "[ローブマニア]";
		mes "そうか、気が変わったらまた来なさい。";
		close;
	}
	if(( getequipid(EQI_ARMOR) != .@neediid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 )){
		mes "Anti-Hack!!!","ログに残しました";
		errormes "ローブ交換Anti-Hack:"+strcharinfo(0);
		close;
	}
	delequip EQI_ARMOR;
	getitem .@reqiid,1;
	mes "[ローブマニア]";
	mes "ほれ、儂の秘蔵の一品じゃ。","もっていくがよい。";
	close;

L_ENCHANT:
	.@refine = getequiprefinerycnt(.@part);
	setarray .@card[0], getequipcardid(.@part,0), getequipcardid(.@part,1), getequipcardid(.@part,2), getequipcardid(.@part,3);

	if(( getequipid(EQI_ARMOR) != .@iid ) || ( getequiprefinerycnt(EQI_ARMOR) < 9 ) || ( .@card[3] != 0 )){
		mes "[ローブマニア]";
		mes "エンチャントして欲しければ、+9以上の"+getitemname(.@iid)+"を装備してまた来なさい。";
		close;
	}
	for( .@i = 0; .@i < MAX_ITEM_RDM_OPT; .@i++ ){
		.@randopt_id[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_ID );
		.@randopt_val[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_VALUE );
		.@randopt_param[.@i] = getequiprandomoption( EQI_ARMOR, .@i, ROA_PARAM );
	}
	delequip EQI_ARMOR;
	getitem3 .@iid,1,1,.@refine,0,.@card[0],.@card[1],.@card[2],4876,.@randopt_id[0],.@randopt_val[0],.@randopt_param[0];
	specialeffect EF_LORD;

	mes "[ローブマニア]";
	mes "ふぉっふぉっふぉっ、いい出来じゃ。","もっていくがよい。";
	close;
L_EXCHANGE_TIME_ROBE:
	mes "[ローブマニア]";
	mes getitemname(15193)+"が欲しければ、",getitemname(6941)+"を1個と交換だのう。";
	mes "いくつ欲しいんじゃ？";
	mes "※0でキャンセル";
	next;
	input .@num;
	if(.@num<=0){
		mes "[ローブマニア]";
		mes "そうか、気が変わったらまた来なさい。";
		close;
	}
	if( countitem(6941) < .@num ){
		mes "[ローブマニア]";
		mes getitemname(6941)+"が足りんのう。";
		close;
	}
	if( checkweight(15193,.@num) == 0 ){
		mes "[ローブマニア]";
		mes "持ちきれんようじゃのう。";
		close;
	}
	delitem 6941,.@num;
	getitem 15193,.@num;
	mes "[ローブマニア]";
	mes "ほれ、儂の秘蔵の一品じゃ。","もっていくがよい。";
	close;
}
