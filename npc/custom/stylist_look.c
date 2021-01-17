//===== rAthena Script ======================================= 
//= Dress Room
//===== Description ==========================================
//= Dress room NPC that allows players to disguise as another
//= class in their classline.
//===== By: ================================================== 
//= Secret's Scripting Service
//===== Changelog: ===========================================
//= 1.0 Initial version. [Secret]
//===== License: =============================================
// Copyright 2018 Jittapan P.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
//= to deal in the Software without restriction, including without limitation the rights to use,
//= copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
//= and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
//=
//= The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//=
//= THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
//= EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//= FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
//= IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
//= DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
//= TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//============================================================

venette,135,120,4	script	クッキィちゃん	1_F_SIGNZISK,{
function HasjROCostume;

function HasjROCostume {
	switch(getarg(0)) {
		case Job_Rune_Knight:
		case Job_Warlock:
		case Job_Ranger:
		case Job_Arch_Bishop:
		case Job_Mechanic:
		case Job_Guillotine_Cross:
		case Job_Royal_Guard:
		case Job_Sorcerer:
		case Job_Minstrel:
		case Job_Wanderer:
		case Job_Sura:
		case Job_Genetic:
		case Job_Shadow_Chaser:
			return 1;
		default:
			return 0;
	}
}

	.@TYPE_CHANGEBASE = 0;
	.@TYPE_SETLOOK = 1;
	set .@current_eac, eaclass();
	if(( .@current_eac & EAJ_BASEMASK ) == EAJ_SUMMONER ){
		setarray .@base_eac,
			EAJ_SUMMONER;
	}
	else{
		setarray .@base_eac,
			EAJ_SWORDMAN,
			EAJ_MAGE,
			EAJ_ARCHER,
			EAJ_ACOLYTE,
			EAJ_MERCHANT,
			EAJ_THIEF,
			EAJ_NOVICE,
			EAJ_TAEKWON,
			EAJ_GUNSLINGER,
			EAJ_NINJA;
	}
	.@size = getarraysize( .@base_eac );
	.@menu$ = "今のまま:元の姿に戻す";
	for( .@i = 0; .@i < .@size; .@i++ ){
		.@menu$ += ":" + jobname(roclass(.@base_eac[.@i]))+"系列";
	}

	mes "[クッキィちゃん]";
	mes "特別なエステで理想のボディを手に入れてみる？";
	mes "どんなのが理想か言ってみて！";
	next;
	.@sel = select( .@menu$ ) - 3;
	if( .@sel < -1 ){
		mes "[クッキィちゃん]";
		mes "イメチェンしたくなったら来てね。";
		close;
	}
	else if( .@sel == -1 ){
		.@body2 = 0;
		if( HasjROCostume(roclass(.@current_eac & EAJ_THIRDMASK)) ){
			mes "[クッキィちゃん]";
			mes "元々どっちだったっけ？";
			next;
			if(select("通常:セカコス") == 2){
				.@body2 = 1;
			}
		}
		mes "[クッキィちゃん]";
		mes "それではいきます";
		mes "まじかるエステ！","ピアノマッサージ！！";
		next;
		specialeffect2 EF_FLASHER;
		setlook LOOK_BODY2,0;
		changebase roclass(.@current_eac);
		setlook LOOK_BODY2,.@body2;
		baselook=0;
		close;
	}
	.@beaj = .@base_eac[ .@sel ];
	setarray .@upper,0,EAJL_2_1,EAJL_2_2;
	.@sizeupper = getarraysize(.@upper);
	setarray	.@opt,0,	//2-*
				EAJL_BABY,	//2-*(Baby)
				EAJL_UPPER,	//Trans 2-*
				EAJL_UPPER | EAJL_THIRD,	//Trans 3-*
				EAJL_THIRD | EAJL_BABY;	//3-*(Baby)
	.@sizeopt = getarraysize(.@opt);

	.@num = 0;
	.@menu$ = "やっぱり今のまま";
	for( .@i = 0; .@i < .@sizeupper; .@i++ ){
		for( .@j = 0; .@j < .@sizeopt; .@j++ ){
			.@eac = .@beaj | .@upper[.@i] | .@opt[.@j];
			if( roclass(.@eac) != -1 ){
				.@menu$ += ":" + jobname(roclass(.@eac));
				.@menu_eac[.@num] = .@eac;
				.@num++;
			}
		}
	}
	mes "[クッキィちゃん]";
	mes "もっと具体的に理想をイメージしてみて？";
	next;
	.@sel = select( .@menu$ ) - 2;
	if( .@sel < 0 ){
		mes "[クッキィちゃん]";
		mes "イメチェンしたくなったら来てね。";
		close;
	}
	.@roc = roclass(.@menu_eac[.@sel]);
	.@body2 = 0;
	if( HasjROCostume(roclass(.@menu_eac[.@sel] & EAJ_THIRDMASK)) ){
		mes "[クッキィちゃん]";
		mes "なんだかもっと素敵になれそうじゃない？";
		next;
		if(select("通常:セカコス") == 2){
			.@body2 = 1;
		}
	}

	mes "[クッキィちゃん]";
	mes "それではいきます";
	mes "まじかるエステ！","ピアノマッサージ！！";
	next;
	specialeffect2 EF_FLASHER;
	setlook LOOK_BODY2,0;
	changelook LOOK_BODY2,0;
	changebase .@roc;
	changelook LOOK_BODY2,.@body2;
	if( HasjROCostume(roclass(.@current_eac & EAJ_THIRDMASK)) ){
		setlook LOOK_BODY2,.@body2;
	}
	set baselook, .@roc;
	set body2look, .@body2;

	mes "[クッキィちゃん]";
	mes "また来てね。";
	close;
		
OnPCLoginEvent:
	if(baselook && .dress_perma){
		changebase baselook;
		changelook LOOK_BODY2,body2look;
	}
	end;
OnInit:
	.dress_perma = 1;
}