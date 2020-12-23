/*==================================================================================
汎用CSV版アイテム交換NPC　<Ver1.1>

getinventorylist の拡張使用

-------------------------------------------------------------------------------------*/
-	script	交換NPC_Rental#dammy	72,{

	set @name$,	"[" + strnpcinfo(1) + "]";	//名前(NPC)

	function my_message {	//メッセージの管理
		switch (getarg(0)){
			case 1://初めに話したとき
				mes @name$;
                mes "コスチュームを交換しますか？";
				next;
				break;
			case 2://選択の後・作成名
				mes @name$;
				mes getarg(1) + "を" + getarg(2) + "個に対して、^3355FF";
				break;
			case 3://選択の後・必要材料
				mes getarg(1) + " が " + getarg(2);
				break;
			case 4://選択の後・フッタ
				mes "^000000必要になります。";
				break;
			case 5://選択の後・フッタ
				mes "交換しますか？","","個人タブのアイテムも消費するので注意してください。";
				next;
				break;
			case 6://終わり
				mes @name$;
				mes "ありがとうございました","またのご利用をお待ちしております。";
				break;
			case 7://レンタル
				mes @name$;
				mes "レンタルの場合、期間は3分になります";
				break;
			case 98://エラー
				mes @name$;
				mes "エラーです。";
				mes "交換を中止します。";
				break;
			case 99://キャンセル
				mes "またのご利用をお待ちしております。";
				break;
		}
		return;
	}

	my_message 1;

//選択
	//	.@level:	選択肢の深度
	//	.@line:		選択肢の数
	//	.filename$	CSVファイルの場所
	//	.@row_num:	一時的なCSVファイルの行数
	//	.@row[.@level][.@line]:		CSVファイルの行数を格納
	//	.@type$[.@level][.@line]:	選択肢の内容を格納
	//	.@temp:	一時的に使用

	set .@level,1;
	set .@row_max,csvgetrows(.filename$);
	set .@row_num,1;
	while (1) {
		freeloop(1);
		for( .@line=0; .@row_num < .@row_max; .@row_num++ ) {
			.@temp = .col_lv$[.@row_num];
			//debugmes "csvread line = " + .@row_num + ", lv = " + .@temp;
			if ( .@temp > .@level )
				continue;
			if ( .@temp < .@level )
				break;
			.@type$[.@line] = .col_name$[.@row_num];
			set .@row[.@line],.@row_num;
			set .@line,.@line+1;
		}

		.@menu_str$ = "";
		for( .@i = 0; .@i < .@line; .@i++ ){
			.@menu_str$ = .@menu_str$ + .@type$[.@i] + ":";
		}
		.@menu_str$ = .@menu_str$ + "やめる";

		set @menu,select(.@menu_str$) - 1;
		freeloop(0);
		if (@menu == .@line)
			close;

		set .@row_num,.@row[@menu]+1;
		set .@name$,.@type$[@menu];
		set .@temp, csvread(.filename$, .@row_num, 0);

		if (.@temp <= .@level)
			break;

		//深度をあげる
		set .@level,.@level+1;
	}

//材料読み込み
	//	.filename$:	CSVファイルの場所
	//	.@line:		CSVの行数
	//	.@name$		アイテム名の格納
	//	.@name_id	アイテムIDの格納
	//	.@name_num	アイテム数の格納
	//	.@cols:		アイテムの種類カウント
	//	.@check_id[.@cols]:		必要アイテムID
	//	.@check_num[.@cols]:	必要アイテム個数

	set .@line,.@row[@menu];
	set .@name_id, csvread(.filename$, .@line, 2);
	set .@name_num, csvread(.filename$, .@line, 3);
	set .@cols,1;
	my_message 2,.@name$,.@name_num;
	while (1) {
		set .@check_id[.@cols], csvread(.filename$, .@line, (.@cols * 2 + 2));
		if (!.@check_id[.@cols]) 
			break;

		set .@check_num[.@cols], csvread(.filename$, .@line, (.@cols * 2 + 3));
		if (.@check_id[.@cols] < 0 ) 
			my_message 3,"ゼニー",.@check_num[.@cols] + "z";

		else 
			my_message 3,getitemname(.@check_id[.@cols]),.@check_num[.@cols] + "個";

		set .@cols,.@cols + 1;
	}
	my_message 4;

//チェック・選択
	//	.@min:		作れる数
	//	.@cols:		アイテムの種類カウント
	//	.@check_id[.@cols]:		必要アイテムID
	//	.@check_num[.@cols]:	必要アイテム個数
	//	.@temp:	一時的に使用
	set .@min,30000;
	set .@cols,1;
	while (1) {

		if (!.@check_id[.@cols])
			break;
		if ( .@check_id[.@cols] == -1 ) 
			set .@temp, (Zeny / .@check_num[.@cols] );
		else {
			set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
			set .@temp,.@temp / .@check_num[.@cols];
		}

		if ( .@min > .@temp )
			set .@min,.@temp;

		set .@cols,.@cols + 1;
	}
	//インベントリの空きチェック
	if(.@min > checkitemblank()){
		set .@min,checkitemblank();
	}
	if (.@min < 1)
		close;

	my_message 5;
	switch(select("１回交換","回数指定",.@min + "回(最大)交換","レンタル","やめる")){
		case 1:
			set .@number,1;
			break;
		case 2:
			input .@number;
			break;
		case 3:
			set .@number,.@min;
			break;
		case 4:
			my_message 7;
			getitem2 .@name_id,1,1,0,0,0,0,0,0,180;
			break;
		case 5:
			close;
	}
	// 重量チェック
	if ((checkweight(.@name_id ,.@name_num * .@number)) == 0){
		mes @name$;
		mes "おや、アイテムが一杯だね";
		mes "整理してからまたおいで。";
		close;
	}

	// 100種チェック
	if(!checkitemblank()){
		mes @name$;
		mes "おや、アイテムが一杯だね";
		mes "整理してからまたおいで。";
		close;
	}

	if(.@min < .@number)
		close;

//最終チェック・作成
	if (.@number < 1)
		close;

	set .@cols,1;
	set .@dammy,0;
	while (1) {
		if (!.@check_id[.@cols])
			break;
		if ( .@check_id[.@cols] == -1 ){
			if(Zeny < .@check_num[.@cols])
				set .@dammy,1;
		} else {
			set .@temp,callfunc ("Load_amount",.@check_id[.@cols]);
			if(.@temp < .@check_num[.@cols])
				set .@dammy,1;
		}
		set .@cols,.@cols + 1;
	}

	if(.@dammy){
		mes @name$;
		mes "アイテムがおかしいみたい";
		mes "もう一度初めからやってね";
		close;
	}
	
	for(set .@j,0;.@j < .@number;set .@j,.@j + 1) {
		set .@cols,1;
		while (1) {
			if (!.@check_id[.@cols])
				break;
			if ( .@check_id[.@cols] == -1 ){
				set Zeny, Zeny - .@check_num[.@cols];
			} else {
				set .@type,getiteminfo(.@check_id[.@cols],2);
				if(.@type == IT_ARMOR || .@type == IT_WEAPON || .@type == IT_PETARMOR || .@type == IT_SHADOWGEAR){
					for(set .@b,0;.@b < .@check_num[.@cols];set .@b,.@b + 1) {
						//set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],1);
						delitem .@check_id[.@cols],1;
					}
				} else {
					//set .@dammy,callfunc ("Load_inventorylist",.@check_id[.@cols],.@check_num[.@cols]);
					delitem .@check_id[.@cols],.@check_num[.@cols];
				}
			}
			set .@cols,.@cols + 1;
		}
		getitem .@name_id,1;
	}

	close;
OnInit:
	if( getarraysize(.col_lv$[0]) == 0){
		.filename$ = "npc/custom/merchants/normal_cos.txt";
		csvreadcol(.filename$,0,.col_lv$[0]);
		csvreadcol(.filename$,1,.col_name$[0]);
	}
	end;
}

ven_in01,90,87,5	duplicate(交換NPC_Rental#dammy)	コスチューム交換#1	10220
