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
payon,164,229,5	script	���V�T������#illusion_moonlight	1_F_ORIENT_04,{
	if(BaseLevel < 100){
		mes "[ �T������ ]";		mes "[�T������]";
		mes "��������������";
		mes "�N���Ă���\�������܂��B";
		mes "�N���������������`���҂Ȃ�";
		mes "�b�����Ă݂邪�c�c�c�O���B";
		next;
		mes "- ^4d4dffBaseLv100�ȏ�̎�";
		mes "  �i�s�\�ȃN�G�X�g�ł��B^000000 -";
		close;
	}
	if(illusion_moonlight == 0){

		mes "[�T������]";
		mes "����̌��͎������̎�ɂ�";
		mes "�����Ȃ��悤���B";
		mes "����ł�������ڂ��B";
		next;
		mes "[ �T������ ]";
		mes "�Ώ��@���l����ɂ�";
		mes "��񂪑���Ă��Ȃ��B";
		mes "�܂��̓��q������";
		mes "�҂��Ƃɂ��悤�B";
		mes "�������Ɨǂ��̂����B";
		next;
		if(select("����"))
		mes "[ �T������ ]";
		mes "���ށH�`���҂ł͂Ȃ����B";
		mes "�������̘b��";
		mes "�����Ă����̂��H";
		next;
		mes "[ �T������ ]";
		mes "�c�c�ӂށA�������B";
		mes "������S�Đ_�l��";
		mes "�ӌ��Ȃ̂��낤�B";
		mes "�Ђ���Ƃ�����N����������";
		mes "�͂ɂȂ邩������Ȃ��B";
		next;
		mes "[ �T������ ]";
		mes "�t�F�C�����̗��̕��ɂ���|�葺��";
		mes "���A������̂͒m���Ă��邩�H";
		mes "�����ł͒���I��";
		mes "�S�삽��������邩��";
		mes "�򉻋V�����s���Ă���񂾁B";
		next;
		mes "[ �T������ ]";
		mes "�������������l���Ă���";
		mes "����ς̉��O�������̂��낤�B";
		mes "�ς̍����򉻂��悤�Ƃ����";
		mes "�򉻂��Ă���҂�";
		mes "�ς̍����ڂ��Ă��܂�";
		mes "�����ɂ��Ȃ���Ă����B";
		npctalk "It's as if the spirits were antagonized by them.","���V�W���M����#illusion_moonlight",bc_self;
		next;
		mes "[ �T������ ]";
		mes "����͂��ɋC���������܂�";
		mes "���A�ɑ����čs���Ă��܂����񂾁B";
		mes "������S�z�ł��傤���Ȃ��B";
		next;
		if(select("���q��������̂��Ƃł����H"))
		npctalk "Maybe we should send someone else.","���V�W���M����#illusion_moonlight",bc_self;
		mes "[ �T������ ]";
		mes "���q�����̓\�E�������J�[���B";
		mes "�����͒T���Ɍ���������";
		mes "���m�����A�߂��ɗ��Ă���̂�";
		mes "���v���Ƃ͎v�����B";
		next;
		mes "[ �W���M���� ]";
		mes "�������ȁB������";
		mes "�����ꂪ���邩������Ȃ��B";
		mes "�N�������ɍs���Ė����Ȃ̂�";
		mes "�m�F���Ă���Ȃ����H";
		next;
		npctalk "Yes. could you?","",bc_self;
		if(select("������܂���","���������|���̂Ŗ����ł�") == 2){
			mes "[ �T������ ]";
			mes "������������";
			mes "���������ł�ƌ������H";
			mes "���������H";
			close;
		}
		mes "[ �W���M���� ]";
		mes "���m�������Ɍ����鎖��";
		mes "�o�����Ȃ�ǂ����A";
		mes "���ꂪ�o���Ȃ������Ȃ�";
		mes "���A�̉��ɂ���p���܂�";
		mes "�s���Ă��܂����͂����B";
		next;
		mes "[ �W���M���� ]";
		mes "��U�A���A�߂��Ƀ��q�����ƕ��m��";
		mes "�o�ė��Ă��邩�m�F���Ă���B";
		mes "�Ⴂ�w�m�����ǂ��čs��������";
		mes "����ς�C�����Ȃ�����ȁB";
		next;
		mes "[ �W���M���� ]";
		mes "���̊w�m�ɉ����";
		mes "����𒮂��Ă݂�̂������B";
		setquest 7776;
		illusion_moonlight = 1;
		end;
    }
	if(illusion_moonlight == 1){
		mes "[ �T������ ]";
		mes "Please go to the cave's entrance in the Archer Village.";
		mes "Ask the young scholar there about ���q����'s whereabouts.";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ �T������ ]";
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
payon,167,229,3	script	���V�W���M����#illusion_moonlight	4_M_HUOLDARMY,{
	if(BaseLevel < 100){
		mes "[ �W���M���� ]";
		mes "I hope everything will be okay.";
		mes "Seeing that you're an adventurer, I assume you're familiar with the ^0000FFPayon Cave^000000.";
		mes "Be careful, something bad is happening inside.";
		next;
		mes "^0000FFYou must be Level 100 or above to perform this quest.";
		close;
	}
	if(illusion_moonlight == 0){
		mes "[ �W���M���� ]";
		mes "This matter is out of our hands now.";
		mes "We can't let it keep happening like this.";
		next;
		mes "[ �T������ ]";
		mes "Let's wait for ^0000FF���q����^000000 now.";
		mes "Her safety is more important than anything else.";
		next;
		if(select("Excuse me."))
		mes "[ �T������ ]";
		mes "Hm? You're an adventurer.";
		mes "Did you happen to hear our conversation?";
		next;
		mes "[ �T������ ]";
		mes "I see.";
		mes "Maybe it's faith that you overheard us.";
		next;
		mes "[ �T������ ]";
		mes "There's a cave near the Archer Village in the back of Payon.";
		mes "It's a haunted cave, so we've been preforming rituals and exorcism there regularly.";
		next;
		mes "[ �T������ ]";
		mes "But the Nine-tailed foxes spirits are more enraged than we thought.";
		mes "Every time someone tries to preform a ritual to the fox beads, they get nightmares.";
		npctalk "It's as if the spirits were antagonized by them.","���V�W���M����#illusion_moonlight",bc_self;
		next;
		mes "[ �T������ ]";
		mes "And this time, she's completely lost her mind and entered the cave.";
		mes "That's why we're worried about her.";
		next;
		if(select("Is it about ���q����?"))
		npctalk "Maybe we should send someone else.","���V�W���M����#illusion_moonlight",bc_self;
		mes "[ �T������ ]";
		mes "Yes. She's the Soul Linker who performs the ritual regularly.";
		mes "We've asked a soldier to find her.";
		mes "They must be near the cave by now.";
		next;
		mes "[ �W���M���� ]";
		mes "Could you go check up ^0000FF���q����^000000 for us?";
		next;
		npctalk "Yes. could you?","",bc_self;
		if(select("Sure, I will:Sorry, I'm afraid of ghost.") == 2){
			mes "[ �T������ ]";
			mes "Huh? We didn't say anything about ghost. Or did we?";
			close;
		}
		mes "[ �W���M���� ]";
		mes "I hope the soldier will find her before she goes deep inside the ruined village.";
		next;
		mes "[ �W���M���� ]";
		mes "Please go to the cave and see if ���q���� and the soldier are outside already.";
		mes "A young scholar followed the soldier, but she doesn't seem reliable at all.";
		next;
		mes "[ �W���M���� ]";
		mes "Talk to the scholar, maybe he could give you an information on the situation.";
		setquest 7776;
		illusion_moonlight = 1;
		end;
	}
	if(illusion_moonlight == 1){
		mes "[ �W���M���� ]";
		mes "I hope the soldier will find her before she goes deep inside the ruined village.";
		next;
		mes "[ �W���M���� ]";
		mes "Please go to the cave and see if ���q���� and the soldier are outside already.";
		mes "A young scholar followed the soldier, but she doesn't seem reliable at all.";
		next;
		mes "[ �W���M���� ]";
		mes "Talk to the scholar, maybe he could give you an information on the situation.";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ �W���M���� ]";
		mes "Maybe it's time we leave things to the younger generations.";
		mes "There is nothing we old folk could do.";
		close;
	}
}
pay_arche,48,137,4	script	�N�w�m#illusion_moonlight	4_F_03,{
	if(illusion_moonlight == 0){ 
        npctalk "�N�w�m : �ǂ����ďo�Ă��Ȃ��񂾁c�c","",bc_self; 
        end; 
    }
	if(illusion_moonlight == 1){
		npctalk "�N�w�m : �ǂ����ďo�Ă��Ȃ��񂾁c�c","",bc_self;
		mes "[ �N�w�m ]";
		mes "����ȍK�^���N����Ȃ�āI";
		mes "���������ɑ҂��Ă������̂悤��";
		mes "�`���҂��ڂ̑O�Ɍ����Ƃ́I";
        next;
        mes "[ �N�w�m ]";
		mes "���������ɖ`���҂�";
		mes "�F��Ȏd������X�̑����";
		mes "���߂Ă����Ƃ����͖̂{���ł����H";
        next;
        if(select("���łɎd�����󂯂Ă���"))
        mes "[ �N�w�m ]";
		mes "�c�c�����ł����B";
		mes "�Z�����݂����ł��ˁB";
		mes "��ώ��炵�܂����B";
		mes "�����ɂ͉��p��";
		mes "��������������ł����H";
        next;
        if(select("���q���������܂���ł������H"))
        mes "[ �N�w�m ]";
		mes "���q�����H�\�E�������J�[��";
		mes "���q�����̂��Ƃł����H";
		mes "����A�܂������ȃ\�E�������J�[�ł͂Ȃ�";
		mes "�C�����̐g�ł����c�c�B";
        next;
        mes "[ �N�w�m ]";
		mes "�򉻂����Ă������q������";
		mes "�����ɜ߂�����";
		mes "���A�̉��܂œ����Ă��܂����̂�";
		mes "�W���E�q�c�c����A";
		mes "���m���T���ɓ������̂ł���";
		mes "�܂����̒m�点������܂���B";
        next;
        mes "[ �N�w�m ]";
		mes "����2�l�̋A���������";
		mes "�҂��Ă����̂ł���";
		mes "���܂�ɂ����������Ȃ�����";
		mes "�ʂ̐l��T����";
		mes "�T���Ɍ����킹�邩�ǂ���";
		mes "�Y��ł����Ƃ���ł����B";
        next;
        mes "[ �N�w�m ]";
		mes "�������Ȃ���΂����ł����c";
		classchange 4_M_PAY_SOLDIER,"Payon Soldier#archer_dummy",bc_self;
		classchange 4_F_TAEKWON,"���q����#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "�N�w�m : �o�ė��܂����I�����݂����ł��I","�N�w�m#illusion_moonlight",bc_self;
        sleep2 2000;
        npctalk "���q���� : �����I������߂�I�򉻂Ȃ񂩂�߂�������!!","���q����#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "���m�V���W���E�q : �c�c�B","Payon Soldier#archer_dummy",bc_self;
        next;
		mes "[ ���q���� ]";
		mes "����A�z�h�j�H";
		mes "�N�͂ǂ����Ă����ɂ���́H";
        npctalk "�N�w�m : ����͐S�z����������c�c�B","�N�w�m#moonlight",bc_self;
        next;
        mes "[ ���q���� ]";
		mes "�S�z���ƌ������ɂ�";
		mes "�����ł������Ă���̂�";
		mes "����t�Ȃ�ł���H";
		mes "�z�h�j�ɐS�z���Ă��炤";
		mes "�؍����͂Ȃ�����B";
        sleep2 2000;
        npctalk "���m�V���W���E�q : �K���ɂ���Ă�B","Payon Soldier#archer_dummy",bc_self;
        sleep2 2000;
        npctalk "�N�w�m : ������ƁA�����Ȃ����B","�N�w�m#illusion_moonlight",bc_self;
        next;
        npctalk "���q���� : �o�C�o�C�I","���q����#archer_dummy",bc_self;
        mes "[ ���q���� ]";
		mes "���I�����������߂��B";
		mes "���Ȃ�����ꂽ����";
		mes "����ɓ`���Ă����āI";
		mes "���ꂶ�Ⴀ�o�C�o�C�I";
        next;
        npctalk "���m�V���W���E�q : �ӂ��A����ł͎�������Ŏ��炷��B��U���q������ǂ�����A���V�����ɓ`���Ă���B","Payon Soldier#archer_dummy",bc_self;
        sleep2 1500;
		classchange HIDDEN_WARP_NPC,"Payon Soldier#archer_dummy",bc_self;
		classchange HIDDEN_WARP_NPC,"���q����#archer_dummy",bc_self;
        mes "[ �N�w�m ]";
		mes "�c�c�ڂ����b��";
		mes "�������Ȃ���";
		mes "�s���Ă��܂��܂����ˁB";
        next;
        mes "[ �N�w�m ]";
		mes "���킠�I�W���E�q�܂ŁI";
		mes "���������Ζ`���җl";
		mes "���q�����ɗp���������";
		mes "�����Ă����̂ł́H";
        next;
        if(select("�߂邵���Ȃ�"))
        mes "[ �N�w�m ]";
		mes "���q�����͑���^4d4dff�t�F�C�������{^000000�֌��������Ǝv���܂��B";
		mes "�ꏏ�ɍs���܂��񂩁H";
        next;
        if(select("�ꏏ�ɍs��","�ʁX�ɍs��") == 2){  
            mes "[ �N�w�m ]";
			mes "���q�����͑���";
			mes "^4d4dff�t�F�C�������{^000000��";
			mes "���������Ǝv���܂��B";
			mes "�����ɍs���ďڂ����b��";
			mes "�����Ă݂邱�Ƃɂ��܂��傤�B";
			mes "���V�����ɂ͎����`���Ă����܂��B";
            illusion_moonlight = 2;
            completequest 7776;
            setquest 7777;
            end;
        }
		mes "[ �N�w�m ]";
		mes "���ꂶ�ᗣ�{�ւƁc";
        illusion_moonlight = 2;
        completequest 7776;
        setquest 7777;
        close2;
        warp "payon",105,320;
        end;	
	}
	if(illusion_moonlight == 2){
		mes "[ �N�w�m ]";
		mes "���q�����͑���";
		mes "^4d4dff�t�F�C�������{^000000��";
		mes "���������Ǝv���܂��B";
		mes "�����ɍs���ďڂ����b��";
		mes "�����Ă݂邱�Ƃɂ��܂��傤�B";
		close;
	}
	if(illusion_moonlight < 6){
		mes "[ �N�w�m ]";
		mes "���̐́A���𒷂��ςݏグ���_�b��";
		mes "����ςɂȂ����炵���ł��B";
		mes "���̎q��������ԂɂȂ���";
		mes "�Ƃ����b������܂��B";
		mes "�\���Ɍ������Ă݂鉿�l�̂���";
		mes "�b���ƍl���Ă��܂��B";
		close;
	}
	if(illusion_moonlight >= 6){
		mes "[ �N�w�m ]";
		mes "�p���ɑ����������I";
		mes "�ꏏ�ɍs���܂����H";
		next;
		if(select("�ꏏ�ɍs��","�ʁX�ɍs��") == 2) {
			mes "[ �N�w�m ]";
			mes "����ł͎��������W���E�q���Ă��";
			mes "�����Ɍ��ǂ��čs���悤�ɂ��܂��I";
			close;
		}
		mes "[ �N�w�m ]";
		mes "�����A�����s���܂��傤�I";
		close2;
		warp "pay_dun03",145,43;
		end;
	}
	
	
OnInit:
	questinfo 7777,QTYPE_QUEST;
	//setquestinfo_req 7777,7776,1;
	end;
}
payon_in03,33,95,3	script	���q����#moonlight_in	4_F_TAEKWON,{
	if(illusion_moonlight < 2){
		mes "[ ���q���� ]";
		mes "�C�F�W�����搶��T���ɗ����Ȃ�";
		mes "�����Ɖ��̕����ɍs���ĉ������B";
		close;
	}
	if(illusion_moonlight == 2){
		setpcblock PCBLOCK_ALL,true;
		sleep2 2000;
		npctalk "���q���� : �����炢����b���Ă����͂������܂���I","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : ����ł����O��ڂł���B�������̈����Ƃ͊ւ�肽���Ȃ��ł��B","���q����#moonlight_in",bc_self;
		sleep2 2000;
		unittalk getcharid(3),strcharinfo(0)+ " : �����H",bc_self;
		npctalk "�N�w�m : �����H","�N�w�m#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : �ς̈�������B�����ɋ���ςƌ���Ԃ�������","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : �ƂĂ��������e�������B��x�Ƃ���Ȍo�����������Ȃ��B","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "�W���M���� : �����ǌN�����Ȃ���ΒN��������򉻂���񂾁H","�W���M����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "�W���M���� : �݂�ȏo���Ȃ��Ǝ��߂Ă������B����ł����q�����N�͎O������������Ȃ����B","�W���M����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : ���ꂪ�ł��ˁA����͌��Ȗ��ŏI��邾���ł͂Ȃ�������ł���B","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : ���܂ł͌ϋʂɍ��߂�ꂽ�����̋C���򉻂���ƁA���Ȗ������Ă��������������̂Ɂc�c","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "�N�w�m : ����͉����Ⴄ��ł����H","�N�w�m#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : �c�c","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : ���ƌ����̋��E�������̂ł͂ƕs�����������B","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "�W���M���� : �c�c����͉��̘b���I���܂ł͂�������ς̉��O����߂邾���ŗǂ���������Ȃ����B","�W���M����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "�W���M���� : �����������A�ŉ��������񂾁H","�W���M����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : �������t�ł��������������A���ڌ��������ǂ��Ǝv���܂���B","���q����#moonlight_in",bc_self;
		sleep2 2000;
		npctalk "���q���� : �ǂ����Ȃ狭�����������ł��B�������������Ă���`���҂̐l���炢�B","���q����#moonlight_in",bc_self;
		completequest 7777;
		setquest 7778;
		illusion_moonlight = 3;
		setpcblock PCBLOCK_ALL,false;
		end;
	}
	if(illusion_moonlight == 3){
		mes "[ ���q���� ]";
		mes "������܂����B";
		mes "�c�c������������O��";
		mes "���������̘b�����܂��傤�B";
		next;
		mes "[ ���q���� ]";
		mes "�t�F�C�������A�͐̂ɔ�������";
		mes "���鎖���ŎR���ꂪ�N����";
		mes "���̈ꕔ�����܂��č��ꂽ���̂ł��B";
		next;
		mes "[ ���q���� ]";
		mes "������O���Ǝv���܂���";
		mes "�������v����������܂�";
		mes "�����}�����҂�����";
		mes "���������̂ł��傤�B";
		mes "���ł��S�삽����";
		mes "��������c���Ă��܂��B";
		next;
		mes "[ ���q���� ]";
		mes "���ɔp���ɐ�������";
		mes "����ς����̉��O��";
		mes "���܂����قǋ��͂Ȃ̂Œ���I��";
		mes "�򉻋V�����s���̂ł���";
		mes "���͂�������ł��B";
		next;
		mes "[ ���q���� ]";
		mes "�����͒N�ɂ�������܂���";
		mes "�ŋ߂ɂȂ��Čς����̉��O��";
		mes "����ɋ����Ȃ��Ă��܂�����ł��B";
		mes "�����Ȃ����ƌ�������";
		mes "�򉻂����܂��s���Ă��Ȃ���";
		mes "���������������������m��܂���B";
		next;
		mes "[ ���q���� ]";
		mes "����ς����̉��O�͐��܂���";
		mes "���i�ʂ�򉻂�������";
		mes "���O�ɂ���Ĉ�����������";
		mes "�������ċ�������c�c�B";
		mes "���̂悤�Ȍ��Ȃ��Ƃ�";
		mes "�N����悤�ɂȂ�܂����B";
		next;
		mes "[ ���q���� ]";
		mes "�\�E�������J�[�Ƃ����̂�";
		mes "���̋������s���E�ƂȂ̂�";
		mes "�H�ɂł����ޖ��V�����s������A";
		mes "�����������Ȃ邱�Ƃ�����܂��B";
		next;
		mes "[ ���q���� ]";
		mes "�����������Ă�Ƃ���";
		mes "�l���Ă��܂���ł����B";
		mes "����������̌��Œm�鎖���o���܂����B";
		mes "��������Ȃ������ƁI";
		next;
		mes "[���q����]";
		mes "�����ς����̉��O��";
		mes "���������Ă��邩�͒m��܂���B";
		mes "���͎����̈ӎ����Ȃ����A���������";
		mes "�ς̋���������������p����";
		mes "�����g���m�炸�m�炸�̂�����";
		mes "�������Ă��܂����B";
		next;
		mes "[ ���q���� ]";
		mes "�����Č��Ă��܂����̂ł��B";
		mes "���̐��̌����������B";
		mes "����ȏ�A�l���߂Â��Ă̓_���ł��I";
		next;
		mes "[ ���q���� ]";
		mes "�ƂĂ��s�g�ȉ�����";
		mes "�N�������ȗ\�������܂��B";
		mes "����A���łɎn�܂��Ă���̂����B";
		next;
		mes "[ ���q���� ]";
		mes "���������ڂ��肵���c����";
		mes "���������͒n���ł����B";
		mes "���O���򉻂������";
		mes "�������Ă����ς����̈����B";
		next;
		mes "[ ���q���� ]";
		mes "�c�c�Ȃ̂ł�����x�Ǝ���";
		mes "���̎d���������Ȃ��ŉ������B";
		mes "���̐��_�̎コ����";
		mes "�n�܂��������Ȃ�";
		mes "�����Î󂷂ׂ����Ƃł��B";
		next;
		mes "[ ���q���� ]";
		mes "�����ǌς����̈����ɂ�";
		mes "��x�Ɗւ�肽������܂���B";
		next;
		mes "[ ���q���� ]";
		mes "�{���ɋC�ɂȂ�̂ł����";
		mes "���ڌo�����Ă݂����������ł���B";
		mes "���x�A��قǏ򉻂��悤�Ƃ��Ă���";
		mes "�ς̍�������̂ŁA�������ł��܂�����";
		mes "���ł������ĉ������B";
		completequest 7778;
		setquest 7779;
		illusion_moonlight = 4;
		end;
	}
	if(illusion_moonlight == 4){
		mes "[ ���q���� ]";
		mes "�����͏o���܂������H";
		next;
		if(select("�o���܂���","�܂��ł�") == 2) {
			mes "[ ���q���� ]";
			mes "���҂����Ă��܂��̂�";
			mes "�������ł��܂�����";
			mes "�����ĉ������B";
			close;
		}
		mes "[ ���q���� ]";
		mes "������܂����B";
		mes "����͂܂��򉻂�";
		mes "�I����Ă��Ȃ��ς̍��ł��B";
		mes "�������̏�ɂ̂��āc";
		next;
		mes "[ ���q���� ]";
		mes "���_���W����";
		mes "�S�����₩�ɂ��ĉ������B";
		mes "�S�̔����J����";
		mes "�󂯓���Ȃ���΂Ȃ�܂���B";
		close2;
		setpcblock PCBLOCK_ALL,true;
		npctalk "���q���� : ����A�����Ȃ����A�f�r������","",bc_self;
		specialeffect 513;
		specialeffect2 334;
		sleep2 1500;
		specialeffect 368;
		specialeffect 550;
		sleep2 1500;
		specialeffect 550;
		npctalk "���q���� : �O�r�̐�̌�����������B","",bc_self;
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#01",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#01";
		specialeffect 550,AREA,"Nine Tail Spirit#01";
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#02",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#02";
		specialeffect 550,AREA,"Nine Tail Spirit#02";
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#02",bc_self;
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#03",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 250;
		classchange 1180,"Nine Tail Spirit#04",bc_self;
		specialeffect 368,AREA,"Nine Tail Spirit#04";
		specialeffect 550,AREA,"Nine Tail Spirit#04";
		sleep2 2000;
		npctalk "���q���� : �O�r�̐�̌�����������B","",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#01",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 2000;
		npctalk "���q���� : ����ȁA�����ȁA����������B","",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#02",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		sleep2 2000;
		npctalk "���q���� : ���̐�����w������","",bc_self;
		npctalk "Die!","Nine Tail Spirit#03",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";		
		sleep2 2000;
		npctalk "���q���� : �d�����̂͂����ɒu����","",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#01",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#02",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#03",bc_self;
		npctalk "�ύ� : ���ˁI�I","Nine Tail Spirit#04",bc_self;
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";
		specialeffect 550,AREA,"Nine Tail Spirit#03";		
		sleep2 2000;
		npctalk "���q���� : ��̌������ւƔ��ōs��","",bc_self;
		npctalk "�ύ� : ���ˁI�I�I�I","Nine Tail Spirit#02",bc_self;
		sleep2 250;
		npctalk "�ύ� : ���ˁI�I�I�I","Nine Tail Spirit#01",bc_self;
		sleep2 250;
		npctalk "�ύ� : ���ˁI�I�I�I","Nine Tail Spirit#03",bc_self;
		sleep2 250;
		npctalk "�ύ� : ���ˁI�I�I�I","Nine Tail Spirit#04",bc_self;
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
		mes "[ ���q���� ]";
		mes "[���q����]";
		mes "�c�c����ŕ�����܂����ˁH";
		mes "���������o�������̂����B";
		mes "�����Əڂ����^���𒲍�����Ȃ�";
		mes "������x�A�p����";
		mes "�s���Ȃ���΂Ȃ�܂���B";
		next;
		mes "[ ���q���� ]";
		mes "�`���җl��";
		mes "����̌��ۂɑ΂���";
		mes "��������̂Ȃ�";
		mes "�����ɂ���o�J��";
		mes "�ƂĂ���т����ł��ˁB";
		close;
	}
	if(illusion_moonlight < 9){
		mes "[ ���q���� ]";
		mes "�C�F�W�����搶��T���ɗ����Ȃ�";
		mes "�����Ɖ��̕����ɍs���ĉ������B";
		close;
	}
	if(illusion_moonlight == 9){
		mes "[ ���q���� ]";
		mes "�����ł����B";
		mes "���ǁA��̉������";
		mes "���܂����̂ł��ˁB";
		mes "���R�ɂ��Ă�";
		mes "�m��Ȃ���ł���ˁH";
		next;
		mes "[ ���q���� ]";
		mes "��̉����ꂽ�ƌ�������";
		mes "���ƌ����̋��E�����ꂽ��";
		mes "�����̂��������ł��傤���H";
		mes "���ʂ̐l���N���̖��̒���";
		mes "����ȕ��ɍs�������邱�Ƃ�";
		mes "�o���܂���B";
		next;
		mes "[ ���q���� ]";
		mes "���ꂪ^4d4dff����Ԃ̈���^000000����";
		mes "�����̂͂悭������܂����B";
		mes "�ł��ǂ�����Ă��ꂪ������";
		mes "�q����悤�ɂȂ����̂���";
		mes "�N���m��܂���B";
		next;
		mes "[ ���q���� ]";
		mes "����Ǝ�������ł���������";
		mes "�Q�l�ɂ��܂�����";
		mes "�܂����̂悤�Șb��";
		mes "��������������܂���B";
		mes "�܂��A���̕����ɂ��Ă�";
		mes "�z�h�j�����܂��������邩�ƁB";
		next;
		mes "[ ���q���� ]";
		mes "�悵�`�I�ł͋v���Ԃ��";
		mes "�����x��ł݂悤���ȁI";
		mes "����ŗ]�v�Ȏ��͍l������";
		mes "��������Q�ꂻ���ł��B";
		next;
		mes "[ ���q���� ]";
		mes "�򉻍�Ƃ��������";
		mes "���̖��������������";
		mes "��C�ɉ����ł������Ȃ̂ŁI";
		mes "���͉���I����ł��I";
		mes "���肪�Ƃ��������܂�";
		mes "�`���җl�I";
		illusion_moonlight = 10;
		completequest 7788;
		end;
	}
	mes "[���q����]";
	mes "�z�h�j�ƈꏏ�ɒ����A�����I";
	mes "�撣���ĉ������I";
	mes "����ς̈�������������";
	mes "���̂��񂴂肷��V����";
	mes "�����Ȃ�܂�����`�I";
	next;
	mes "[ ���q���� ]";
	mes "�Ȃ��m���Ă���̂�";
	mes "�C�ɂȂ��ł����H";
	mes "�����̊��ł���I���͂͂͂͂́I";
	mes "���������Ȃ��ł��̂܂�";
	mes "�ꐶ���邩���m��Ȃ����ǁI";
	mes "���Ɗ֌W�Ȃ����Ƃł�����I";
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
payon_in03,30,96,5	script	�W���M����#moonlight_in	4_M_HUOLDARMY,{
	if(illusion_moonlight < 2){
		mes "[ �W���M���� ]";
		mes "Please observe proper manners inside the palace.";
		close;
	}
	if(illusion_moonlight == 2){
		npctalk "���q����... If you can't do it, no one else can!","",bc_self;
		end;
	}
	if(illusion_moonlight < 5){
		npctalk "Let's listen for now.","",bc_self;
		end;
	}
	if(illusion_moonlight == 5){
		mes "[ �W���M���� ]";
		mes "We should grasp the situation first.","It'll be great if you can help us, Adventurer.";
		close;
	}
	if(illusion_moonlight < 10){
		mes "[ �W���M���� ]";
		mes "Please observe proper manners inside the palace.";
		close;
	}
	mes "[ �W���M���� ]";
	mes "The Moonlight Flower are recreating the past in their nightmares.","In a way, they're also victims.";
	next;
	mes "[ �W���M���� ]";
	mes "I'll make sure no villagers gets close to the collapsed walls of reality and dreams.";
	close;
}

payon_in03,33,93,1	script	�N�w�m#moonlight_in	4_F_03,{
	if(illusion_moonlight < 2){
		mes "[ �N�w�m ]";
		mes "�t�F�C�����͐̂���";
		mes "�_�b�����ƈꏏ�ɕ�炷�X�ł����B";
		mes "�R�Ŋu������Ă���";
		mes "�]���Ɣ�ׂ�ƍl������";
		mes "���Ȃ�Ⴂ������܂��B";
		close;
	}
	if(illusion_moonlight == 2){
		npctalk "�N�w�m : ���q�����͂ƂĂ��������Ă��܂��B�b�𕷂��Ă݂Ȃ��Ƃ����Ȃ��̂ł����c�c","",bc_self;
		end;
	}
	if(illusion_moonlight < 5){
		npctalk "�N�w�m : ���q�����̘b���畷���Ă݂������悳�����ł��B";
		end;
	}
	if(illusion_moonlight == 5){
		mes "[ �N�w�m ]";
		mes "�{���ɔߎS�ł��ˁB";
		mes "����Ȃ��Ƃ����q������";
		mes "�ЂƂ�Ŕw�����Ă�����ł��ˁB";
		mes "����ς̉��O��";
		mes "�z�����Ă����ȏ�ŋ����܂����B";
		next;
		mes "[ �N�w�m ]";
		mes "���������������K�v�ł��B";
		mes "��͂蒼�ځA�p����";
		mes "�s���Ă݂邵���Ȃ������ł��B";
		close;
	}
	if(illusion_moonlight > 5){
		mes "[ �N�w�m ]";
		mes "�����̊Ԃ͔p����";
		mes "���̊�Ȍ��ۂ�";
		mes "�������邱�Ƃɂ��܂��B";
		mes "�ǂ����Ă��ЂƂ肶���ςȂ̂�";
		mes "�O�ɂ���W���E�q�ƈꏏ��";
		mes "�s�����悤�ƍl���Ă��܂��B";
		next;
		mes "[ �N�w�m ]";
		mes "���̑O�ɂ݂����ɖ`���җl��";
		mes "�ꏏ�ɂ��Ă����Ȃ�\�����Ȃ��ł��B";
		mes "����ł͔p���ŉ�܂��傤�B";
		close;
	}
}


//= Dummy
pay_arche,44,133,7	script	Payon Soldier#archer_dummy	HIDDEN_WARP_NPC,{ end; }
pay_arche,46,135,5	script	���q����#archer_dummy	HIDDEN_WARP_NPC,{ end; }
payon_in03,30,96,5	script	Nine Tail Spirit#01	HIDDEN_WARP_NPC,{ end; }
payon_in03,35,96,3	script	Nine Tail Spirit#02	HIDDEN_WARP_NPC,{ end; }
payon_in03,30,93,7	script	Nine Tail Spirit#03	HIDDEN_WARP_NPC,{ end; }
payon_in03,35,93,1	script	Nine Tail Spirit#04	HIDDEN_WARP_NPC,{ end; }
pay_dun03,143,45,4	script	�W���E�q#dun_dummy	HIDDEN_WARP_NPC,{ end; }
pay_dun03,138,43,7	script	�N�w�m#dun_dummy	HIDDEN_WARP_NPC,{ end; }

//= Warp
pay_dun03,140,46,0	script	�h�炮���#illusion_moonlight	4_ENERGY_BLUE,{
	if(illusion_moonlight < 5){
		mes "�������C���h�炢�ł���B";
		mes "�s�C���Ȋ���������B";
		close;
	}
	if(illusion_moonlight == 5){ 
		mes "��Ԃ��c��ł���悤�ȕ�����������B";
		next;
		classchange 4_F_03,"�N�w�m#dun_dummy",bc_self;
		classchange 4_M_PAY_SOLDIER,"�W���E�q#dun_dummy",bc_self;
		npctalk "�N�w�m : �͂��͂��A�����ɂ������������̂ł��ˁB","�N�w�m#dun_dummy",bc_self;
		mes "[ �N�w�m ]";
		mes "�}�ɏ�����";
		mes "�т����肵�܂����B";
		mes "���ꂪ���q�����̌����Ă���";
		mes "��̉����ꂽ������";
		mes "�������̂Ȃ�ł����H";
		next;
		if(select("�ꂩ�璲�������悤�ƍl���Ă���"))
		npctalk "���m�V���W���E�q : �\�z�͂��Ă������ǁc�c�z�h�j�A���O�͖{���ɓK������Ȃ����H","�W���E�q#dun_dummy",bc_self;
		mes "[ �N�w�m ]";
		mes "���ꂶ�Ⴛ�̒�����";
		mes "�������s������_���ł����H";
		mes "�ܘ_�A���ЂƂ�ł�";
		mes "�댯���Ǝv���܂���";
		mes "�����ɂ���W���E�q�ƈꏏ�Ȃ�";
		mes "���v���Ǝv���܂��񂩁H�I";
		next;
		npctalk "���m�V���W���E�q : ����ɐG��ȁI","�W���E�q#dun_dummy",bc_self;
		mes "[ �N�w�m ]";
		mes "���ꂶ��A���c�c����ɐG���΂����̂��ȁH";
		illusion_moonlight = 6;
		completequest 7780;
		setquest 7781;
		close2;
		npctalk "�N�w�m : ���킠���������`�I�I�I","",bc_self;
		specialeffect 885,AREA,"�N�w�m#dun_dummy";
		sleep 500;
		classchange HIDDEN_WARP_NPC,"�N�w�m#dun_dummy",bc_self;
		sleep 2000;
		npctalk "���m�V���W���E�q : �����`�I�z�h�j�I�I�I","�W���E�q#dun_dummy",bc_self;
		sleep 2000;
		npctalk "���m�V���W���E�q : �c�c���̃o�J���]�v�Ȃ��Ƃ����₪���āI�I�I","�W���E�q#dun_dummy",bc_self;
		specialeffect 885,AREA,"�W���E�q#dun_dummy";
		sleep 500;
		classchange HIDDEN_WARP_NPC,"�W���E�q#dun_dummy",bc_self;
		end;
	}
	if(illusion_moonlight > 5){
		mes "�c�Ȃ��ꂽ��Ԃ̌�������";
		mes "�������f��B";
		mes "�ǂ����悤���ȁH";
		next;
		if(select("�i������","��߂�") == 2){
			mes "���͂�߂Ă������B";
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
pay_d03_i,149,45,4	script	�w�m�z�h�j#illusion_moonlight	4_F_03,{
	if(illusion_moonlight == 6){
		mes "[ �z�h�j ]";
		mes "������Ƃ����������ĉ������I";
		mes "��قǎ�����������";
		mes "�p���ɊԈႢ�Ȃ��̂�";
		mes "��������Ȃ��悤�ɂ������܂��I";
		next;
		mes "[ �z�h�j ]";
		mes "�����ɂ���l������";
		mes "����ς����������l�q���ςł��B";
		mes "���ɖ��Ȗ��@�g����";
		mes "��������Ă���̂ł���";
		mes "���̎����̌����ł͂Ȃ���ł��傤���H";
		next;
		mes "[ �z�h�j ]";
		mes "�����ċ���ς����I";
		mes "�l�X�I���삽���I";
		mes "�܂�Ő̘b�ɕ�����������";
		mes "�R����ő������܂������̎���";
		mes "�߂��Ă��܂����悤�ȁc�c�B";
		next;
		mes "[ �z�h�j ]";
		mes "�����I�������K�v�ɂȂ�Ǝv���܂��B";
		mes "�ܘ_�A���͂��Ē����܂���ˁH";
		next;
		mes "[ �z�h�j ]";
		mes "�������ł�����";
		mes "�b�����ĉ������B";
		illusion_moonlight = 7;
		completequest 7781;
		end;
	}
	if(illusion_moonlight == 7){
		mes "[ �z�h�j ]";
		mes "�����̐l�X���畷�����b��";
		mes "���������@�g���̂��Ƃ΂���ł����B";
		next;
		mes "[ �z�h�j ]";
		mes "�����l�����ɑ喂�@���g��";
		mes "���̂����Œn�Ղ������";
		mes "�R���ꂪ�N���������ł��B";
		mes "������O���Ǝv������";
		mes "����Ȏ����Ȃ�Z����";
		mes "�������񎀂񂾂�ł��傤�ˁB";
		next;
		mes "[ �z�h�j ]";
		mes "������l���Ă��A�����̌�����";
		mes "���̉��������@�g���ł��傤�B";
		mes "�����̌��������������";
		mes "���̈����͋�̉����ꂸ";
		mes "������̂ł͂Ȃ��ł��傤���H";
		next;
		mes "[ �z�h�j ]";
		mes "���ۂɂ͖��@�g����";
		mes "�����֘A�̖����l���ł���";
		mes "�\��������܂���";
		mes "���ׂĂ݂鉿�l��";
		mes "����ƍl���Ă��܂��B";
		next;
		mes "[ �z�h�j ]";
		mes "��������̌��ōł��d�v�Ȃ̂�";
		mes "���ƌ����̋��E���Ȃ����ꂽ�̂��ł��B";
		mes "���̏ꏊ�ł����̂悤�Ȃ��Ƃ�";
		mes "�܂���������̂ł��傤���H";
		next;
		mes "[ �z�h�j ]";
		mes "�Ƃɂ����������Ă݂܂��傤�B";
		mes "^4d4dff�^���̖��@�g��^000000��";
		mes "���Ȃ苭�͂����Ɍ�����̂�";
		mes "�C��t���Ă��������B";
		mes "�`���җl�̒��Ԃ�����Ȃ�ꏏ��";
		mes "���肷�鎖�������߂��܂��B";
		next;
		if(select("����������","�f��") == 2){
			mes "[ �z�h�j ]";
			mes "�����c�c�ł͑��̗v�f��";
			mes "�������邵������܂���ˁI";
			mes "�ܘ_�A����̂��Ƃ�";
			mes "�����`���җl�����񂾂�͂��܂��񂪁I";
			end;
		}
		mes "[ �z�h�j ]";
		mes "�������̊Ԃ�";
		mes "���͂𒲂ׂĂ݂܂��̂�";
		mes "�����o������";
		mes "������x�b�������Ă��������B";
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
				mes "[ �z�h�j ]";
				mes "That ^0000FFenlightened mage^000000 looks dangerous.","Please stop him.";
				end;
			case 2:
				mes "[ �z�h�j ]";
				mes "���҂����������܂����B";
				mes "���ƂȂ�����̌���";
				mes "�������͂߂Ă��܂�����B";
				next;
				mes "[ �z�h�j ]";
				mes "���q�����������Ă������Ƃ�";
				mes "�o���Ă��܂����H";
				mes "�ς̈�������̉����ꂽ��";
				mes "�����Ă����̂��B";
				next;
				mes "[ �z�h�j ]";
				mes "���ӂ𒲍����Ȃ���";
				mes "�l���Ă݂܂�����";
				mes "�����͂�͂茎��Ԃ����o����";
				mes "�����̂悤�ł��B";
				next;
				mes "[ �z�h�j ]";
				mes "�ǂ����Ĉ�����������";
				mes "�q����悤�ɂȂ����̂�";
				mes "������܂��񂪁A�ЂƂ���";
				mes "�m���Ȃ��Ƃ�����܂��B";
				next;
				mes "[ �z�h�j ]";
				mes "����Ԃ��ߋ��̎�����";
				mes "�܂��Y��Ă��Ȃ��Ƃ������Ƃł��B";
				next;
				mes "[ �z�h�j ]";
				mes "�����̎�����";
				mes "�傫���ȋ�ɂƂ��Ďc��";
				mes "�����݂܂ō��݂Ƃ���";
				mes "�ς��葱���Ă����悤�ł��B";
				mes "���ꂪ�����̐؂��|����";
				mes "���������̂ł͂Ȃ����Ɓc�c�B";
				next;
				mes "[ �z�h�j ]";
				mes "�܂��m��Ȃ�������";
				mes "����Ǝv���܂��񂩁H";
				mes "��������������";
				mes "�����𑱂��悤�Ǝv���܂��B";
				next;
				mes "[ �z�h�j ]";
				mes "���̂��Ƃ��t�F�C�������{�ɂ���";
				mes "���q�����ɂ��`���ĉ������B";
				mes "���͂���܂ł̊�";
				mes "�W���E�q�ƈꏏ��";
				mes "�t�߂�����Ē��ׂĂ݂܂��B";
				next;
				mes "[ �z�h�j ]";
				mes "���̌��ۂɑ΂���";
				mes "��������̉𓚂�";
				mes "�o��Ȃ炢���ł����B";
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
			mes "[ �z�h�j ]";
			mes "Now I know this is not the ruined village.","Are we really inside a Moonlight Flower's nightmare?";
			next;
			mes "[ �z�h�j ]";
			mes "That's what ���q���� said.","Their nightmares are coming true.";
			next;
			mes "[ �z�h�j ]";
			mes "This place is a worth of a serious study.";
			end;
			
		case 2:
			erasequest 7783;
			break;	
	}
	switch(checkquest(7782,HUNTING)){
		case -1:
			mes "[ �z�h�j ]";
			mes "�����̐l�X���畷�����b��";
			mes "���������@�g���̂��Ƃ΂���ł����B";
			next;
			mes "[ �z�h�j ]";
			mes "�����l�����ɑ喂�@���g��";
			mes "���̂����Œn�Ղ������";
			mes "�R���ꂪ�N���������ł��B";
			mes "������O���Ǝv������";
			mes "����Ȏ����Ȃ�Z����";
			mes "�������񎀂񂾂�ł��傤�ˁB";
			next;
			mes "[ �z�h�j ]";
			mes "������l���Ă��A�����̌�����";
			mes "���̉��������@�g���ł��傤�B";
			mes "�����̌��������������";
			mes "���̈����͋�̉����ꂸ";
			mes "������̂ł͂Ȃ��ł��傤���H";
			next;
			mes "[ �z�h�j ]";
			mes "���ۂɂ͖��@�g����";
			mes "�����֘A�̖����l���ł���";
			mes "�\��������܂���";
			mes "���ׂĂ݂鉿�l��";
			mes "����ƍl���Ă��܂��B";
			next;
			mes "[ �z�h�j ]";
			mes "��������̌��ōł��d�v�Ȃ̂�";
			mes "���ƌ����̋��E���Ȃ����ꂽ�̂��ł��B";
			mes "���̏ꏊ�ł����̂悤�Ȃ��Ƃ�";
			mes "�܂���������̂ł��傤���H";
			next;
			mes "[ �z�h�j ]";
			mes "�Ƃɂ����������Ă݂܂��傤�B";
			mes "^4d4dff�^���̖��@�g��^000000��";
			mes "���Ȃ苭�͂����Ɍ�����̂�";
			mes "�C��t���Ă��������B";
			mes "�`���җl�̒��Ԃ�����Ȃ�ꏏ��";
			mes "���肷�鎖�������߂��܂��B";
			next;
			mes "[ �z�h�j ]";
			mes "He is pretty formidable. I wouldn't recommend ^0000FFfight him alone.^000000";
			next;
			if(select("Will do.:No, thanks.") == 2){
				mes "[ �z�h�j ]";
				mes "Err, then I'll have to investigate something else.","But I won't resent you for this. I promise.";
				end;
			}
			mes "[ �z�h�j ]";
			mes "Good luck.","That wizard looks pretty strong.","Please be careful.";
			setquest 7782;
			end;
		case 0:
		case 1:
			mes "[ �z�h�j ]";
			mes "That ^0000FFenlightened mage^000000 looks dangerous.","Please stop him.";
			end;
		case 2:
			mes "[ �z�h�j ]";
			mes "�܂��m��Ȃ�������";
			mes "����Ǝv���܂��񂩁H";
			mes "��������������";
			mes "�����𑱂��悤�Ǝv���܂��B";
			next;
			mes "[ �z�h�j ]";
			mes "���̌��ۂɑ΂���";
			mes "��������̉𓚂�";
			mes "�o��Ȃ炢���ł����B";
			getitem 25271,1; //= Illusion Stone
			erasequest 7782;
			setquest 7783;
			end;		
	}		
}
pay_d03_i,152,45,4	script	Soldier �W���E�q#illusion_moonlight	4_M_PAY_SOLDIER,{
	if(illusion_moonlight == 6){
		mes "[ �W���E�q ]";
		mes "���̑΍���Ȃ��܂�";
		mes "�����������犴���Ă܂������A";
		mes "�����̊ԁA�z�h�j�ƈꏏ��";
		mes "�s�������Ȃ���΂Ȃ�Ȃ������ł��ˁB";
		next;
		mes "[ �W���E�q ]";
		mes "�����������̋���ς�";
		mes "�S�삽������悭�Ȃ��C�z���������܂��B";
		mes "�c����͍��������ƂɂȂ�܂����B";
		close;
	}
	if(illusion_moonlight > 6){
		if(checkquest(7784,HUNTING) == 2){
			mes "[ �W���E�q ]";
			mes "���ꂪ���̂ł��낤���Ȃ��낤��";
			mes "�댯�v�f�ɂȂ�̂͊ԈႢ����܂���B";
			mes "�悭�������ĉ������܂����B";
			next;
			mes "[ �W���E�q ]";
			mes "�z�h�j�̒������I����";
			mes "�������Ă���悤�ł���";
			mes "���낻��A�҂̏�����";
			mes "���Ă����������悳�����ł��ˁB";
			erasequest 7784;
			setquest 7785;
			getitem 25271,1; //= Illusion Stone
			end;
		}
		if(checkquest(7786,HUNTING)  == 2){
			mes "[ �W���E�q ]";
			mes "���ꂪ���̂ł��낤���Ȃ��낤��";
			mes "�댯�v�f�ɂȂ�̂͊ԈႢ����܂���B";
			mes "I can symphatize with the soldier.";
			next;
			mes "[ �W���E�q ]";
			mes "All he wanted to do was protect others, and he died without fulfilling that wish.","Thank you for helping them rest.";
			erasequest 7786;
			setquest 7787;
			getitem 25271,1; //= Illusion Stone
			end;
		}
		mes "[ �W���E�q ]";
		mes "There's another portal that looks just like the one we came through.","I touched it, and it sent me back to the original ruined village.";
		next;
		if(select("�{��̋���ςɂ���:About the angry Soldiers.") == 1){
			switch(checkquest(7785,PLAYTIME)){
				case -1:
					break;
				case 0:
				case 1:
					mes "[ �W���E�q ]";
					mes "�z�h�j�̒����ɂ���";
					mes "�����͌���Ԃ̈����̒��������ł��B";
					mes "���e�ɂ����Ȃ�����ςł���";
					mes "�����炪������";
					mes "�����Ă���l�ɊQ���y�ڂ��Ȃ�";
					mes "�ގ�����͓̂��R���ƍl���Ă��܂��B";
					next;
					mes "[ �W���E�q ]";
					mes "����Ɏ��߂�";
					mes "�����Ȃ��z���ƌ����Ă�";
					mes "�Ԃ����t�͂���܂���B";
					mes "���ꂶ�ᎄ�̓z�h�j�ƈꏏ��";
					mes "���̏ꏊ��������Ă݂邱�Ƃɂ��܂��B";
					end;
				case 2:
					erasequest 7785;
					break;
			}
			switch(checkquest(7784,HUNTING)){
				case -1:
					mes "[ �W���E�q ]";
					mes "�߂�����{��̋���ς�����";
					mes "�������ɗ��ăz�h�j�͒�����";
					mes "��J���Ă���݂����ł��B";
					mes "�`���җl�ɋ���ς����̑ގ���";
					mes "���肢�������ł����c�c�B";
					next;
					if(select("�������","�f��") == 2){
						mes "[ �W���E�q ]";
						mes "�����܂Œ����ɏo�����邱�Ƃ�";
						mes "�o���Ȃ������ł��ˁB";
						end;
					}
					mes "[ �W���E�q ]";
					mes "����ł͂��肢���܂��B";
					mes "^4d4dff�{��̋����^000000��";
					mes "�S��𗝉��ł��Ȃ��킯�ł�";
					mes "����܂��񂯂ǁA����͂���";
					mes "����͂���ł�����B";
					setquest 7784;
					end;
					
				case 0:
				case 1:
					mes "[ �W���E�q ]";
					mes "���ӂɂ���^4d4dff�{��̋����^000000��";
					mes "�ގ����Ă��������B";
					mes "�z�h�j�̒��������������~���ɂȂ�ׂł��B";
					close;
			}
		} else {
			switch(checkquest(7787,PLAYTIME)){
				case -1:
					break;
				case 0:
				case 1:
					mes "[ �W���E�q ]";
					mes "If we're really inside Moonlight Flower's nightmare, like �z�h�j thinks,","then the angry soldier over there must have been the guard of this village.";
					next;
					mes "[ �W���E�q ]";
					mes "It doesn't matter if this is real or not. Watching my ancestors suffer is difficult.","I may end up wasting our time, but I want to try to help them rest.";
					close;
				case 2:
					erasequest 7787;
					break;
			}
			switch(checkquest(7786,HUNTING)){
				case -1:
					mes "[ �W���E�q ]";
					mes "These soldiers tried to protect their villagers until the last moment,","and got buried with them. No wonder they're so angry.";
					next;
					mes "[ �W���E�q ]";
					mes "Would you be so kind as to put them to rest for me?";
					next;
					if(select("�������","�f��") == 2){
						mes "[ �W���E�q ]";
						mes "I really don't want to deal with them myself,","but I guess I'll have to.";
						end;
					}
					mes "[ �W���E�q ]";
					mes "Thank you.","I'll leave the ^0000FFAngry Soldiers^000000 to you.","Please send them to heaven.";
					setquest 7786;
					end;
					
				case 0:
				case 1:
					mes "[ �W���E�q ]";
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

