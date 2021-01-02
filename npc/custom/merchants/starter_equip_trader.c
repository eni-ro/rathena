
ven_in01,93,96,5	script	スターター装備交換	4_M_GUILLOTINE,{ //4_SYS_MSG
	disable_items;
	if (checkweight(1201,1) == 0 || (MaxWeight - Weight) < 10000) {
		mes "^ff0000インベントリの中身を減らして来て下さい^000000";
		close;
	}
	mes "[スターター装備交換]";
	mes "スターター装備を欲しくないか？";
	mes "同じシリーズの装備なら2個、";
	mes "違うシリーズの装備なら3個と欲しい装備を交換するぜ。";
	next;
	setarray .@list_type$,
		"天秤宮シリーズ","処女宮シリーズ","宝瓶宮シリーズ",
		"天蝎宮シリーズ","人馬宮シリーズ","双魚宮シリーズ","ポルックスシリーズ";
	.@size = getarraysize( .@list_type$ );
	.@menu$ = "";
	for(.@i = 0; .@i < .@size; .@i++)
		.@menu$ = .@menu$ + .@list_type$[.@i] + ":";
	.@menu$ = .@menu$ + "やめる";
	.@sel = select( .@menu$ ) - 1;
	if ( .@sel == .@size ) {
		goto L_CANCEL_END;
	}
	mes "[スターター装備交換]";
	mes .@list_type$[ .@sel ] + "の何が欲しいんだ？";
	next;
	setarray .@list_iid,
		1150,	19468,	15418,	20970,	22227,	32261,	//天秤宮
		640002,	5599,	450015,	480009,	470014,	490010,	//処女宮
		26167,	19496,	15426,	20972,	22231,	32266,	//宝瓶宮
		28047,	19471,	15424,	20976,	22233,	32267,	//天蝎宮
		700010,	5739,	450140,	480050,	470045,	490041,	//人馬宮
		640006,	5514,	450133,	480041,	470038,	490034,	//双魚宮
		28643,	15823,	15447,	20983,	2400,	32293;	//ポルックス
	.@menu$ = "";
	for(.@i = 0; .@i < 6; .@i++)
		.@menu$ = .@menu$ + getitemname( .@list_iid[.@sel*6+.@i] ) + ":";
	.@menu$ = .@menu$ + "やめる";
	.@idx = select( .@menu$ ) - 1;
	if ( .@idx == 6 ) {
		goto L_CANCEL_END;
	}
	.@iid = .@list_iid[.@sel*6+.@idx];
	mes "[スターター装備交換]";
	mes "[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]だな。";
	mes "同じシリーズの装備と、";
	mes "違うシリーズの装備";
	mes "どちらと交換してくれるんだ？";
	next;
	.@exch_size = 0;
	switch(select("同じシリーズ:違うシリーズ:やめる")){
		case 1:
			for(.@i = 0; .@i < 6; .@i++){
				if(( .@i != .@idx ) && ( countitem( .@list_iid[.@sel*6+.@i] ) )){
					.@exchg[.@exch_size] = .@list_iid[.@sel*6+.@i];
					.@exch_size++;
				}
			}
			.@req_num = 2;
			break;
		case 2:
			for(.@i = 0; .@i < .@size; .@i++){
				if( .@i == .@sel ){
					continue;
				}
				for(.@j = 0; .@j < 6; .@j++){
					if( countitem( .@list_iid[.@i*6+.@j] )){
						.@exchg[.@exch_size] = .@list_iid[.@i*6+.@j];
						.@exch_size++;
					}
				}
			}
			.@req_num = 3;
			break;
		case 3:
			goto L_CANCEL_END;
	}
	if( .@exch_size == 0 ){
		mes "[スターター装備交換]";
		mes "交換対象の装備を";
		mes "何も持っていないな。";
		close;
	}
	.@menu$ = "";
	for(.@i = 0; .@i < .@exch_size; .@i++)
		.@menu$ = .@menu$ + getitemname( .@exchg[.@i] ) + ":";
	.@menu$ = .@menu$ + "やめる";
	
	for(.@i = 1; .@i <= .@req_num; .@i++){
		mes sprintf("交換したい%d番目の装備を選んでくれ。",.@i);
		mes "";
		mes "^ff0000※個人タブ、精錬済み、カード挿入済みも削除されるので注意して下さい。^000000";
		next;
		.@sel = select( .@menu$ ) - 1;
		if ( .@sel == .@exch_size ) {
			goto L_CANCEL_END;
		}
		.@deliid = .@exchg[ .@sel ];
		.@ins = getarraysize( .@delist );
		for( .@j = 0; .@j < .@ins; .@j += 2 ){
			if( .@delist[.@j] == .@deliid ){
				break;
			}
		}
		.@delist[ .@j ] = .@deliid;
		.@delist[ .@j + 1 ] += 1;
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		if( countitem( .@delist[ .@i ] ) < .@delist[ .@i + 1 ] ){
			mes "[スターター装備交換]";
			mes "アイテムがたりないな。";
			close;
		}
	}
	mes "[スターター装備交換]";
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		mes sprintf("[<ITEM>%s<INFO>%d</INFO></ITEM>]を%d個",getitemname(.@delist[ .@i ]),.@delist[ .@i ],.@delist[ .@i + 1 ]);
	}
	mes "と[<ITEM>"+getitemname(.@iid)+"<INFO>"+.@iid+"</INFO></ITEM>]を交換でいいんだな？";
	next;
	if( select("交換する:やめる") == 2 ){
		goto L_CANCEL_END;
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		if( countitem( .@delist[ .@i ] ) < .@delist[ .@i + 1 ] ){
			mes "Anti-Hack!!!","ログに残しました";
			errormes "スターター交換Anti-Hack:"+strcharinfo(0);
			close;
		}
	}
	for( .@i = 0; .@i < getarraysize( .@delist ); .@i += 2 ){
		delitem .@delist[ .@i ],.@delist[ .@i + 1 ];
	}
	getitem .@iid,1;
	mes "[スターター装備交換]";
	mes "ほら、これがお望みの装備だ。";
	mes "また欲しいものができたら来いよ。";
	close;
L_CANCEL_END:
	mes "[スターター装備交換]";
	mes "なんだ、冷やかしか。";
	mes "次は交換用の装備をもってこいよ。";
	close;
}
