#include <sstream>
#include <ctime>

// 職業から性別を取得する。
int // 取得した性別。男女両方が就ける場合は男性。
pc_jobid2sex(
	int job // 職業。
) {
	int sex;
	switch (job) {
	case JOB_OBORO:
	case JOB_DANCER:
	case JOB_GYPSY:
	case JOB_BABY_OBORO:
	case JOB_BABY_DANCER:
	case JOB_WANDERER:
	case JOB_WANDERER_T:
	case JOB_BABY_WANDERER:
		sex = SEX_FEMALE;
		break;
	default:
		sex = SEX_MALE;
	};
	return sex;
}

// 装備部位の順序。
enum equip_pos_orders {
	EPO_HEAD_TOP        , // 頭上。
	EPO_BODY            , // 体。
	EPO_HAND_L          , // 左手。
	EPO_HAND_R          , // 右手。
	EPO_SHOLDER         , // 肩。
	EPO_FOOT            , // 足。
	EPO_ACC_L           , // 左アクセサリ。
	EPO_ACC_R           , // 右アクセサリ。
	EPO_HEAD_MID        , // 頭中。
	EPO_HEAD_LOW        , // 頭下。
	EPO_COSTUME_HEAD_TOP, // 衣頭上。
	EPO_COSTUME_HEAD_MID, // 衣頭中。
	EPO_COSTUME_HEAD_LOW, // 衣頭下。
	EPO_COSTUME_GARMENT , // 衣肩。
	EPO_AMMO            , // 矢/弾。
	EPO_MAX             ,
};

// 装備部位の順序を装備部位のインデックスに変換するテーブル。
const std::array<
	equip_index, // 装備部位のインデックス。
	EPO_MAX      // 装備部位の順序の数。
> EPO2EQI_TABLE {
	EQI_HEAD_TOP        ,
	EQI_ARMOR           ,   
	EQI_HAND_L          ,	 
	EQI_HAND_R          ,
	EQI_GARMENT         ,
	EQI_SHOES           ,
	EQI_ACC_L           ,
	EQI_ACC_R           ,
	EQI_HEAD_MID        ,
	EQI_HEAD_LOW        ,
	EQI_COSTUME_HEAD_TOP,
	EQI_COSTUME_HEAD_MID,
	EQI_COSTUME_HEAD_LOW,
	EQI_COSTUME_GARMENT ,
	EQI_AMMO            ,
};

// 装備部位順序を装備インデックスに変換する。
static equip_index // 変換した装備インデックス。変換できなければINT_MIN。
equip_pos_order_to_index(
	int ord // 装備部位順序。
) {
	equip_index ind = equip_index(INT_MIN);
	if (ord >= 0 &&
		ord < EPO2EQI_TABLE.size()
	) ind = EPO2EQI_TABLE[ord];
	return ind;
}
// 装備部位名のテーブル。
static_assert(EQI_MAX==21,"err");
const std::array<
	std::string, // 装備部位名。
	EQI_MAX      // 装備部位の数。
> EQUIP_POS_NAME_TABLE = {
	"左ア"   ,
	"右ア"   ,
	"足"     ,
	"肩"     ,
	"頭下"   ,
	"頭中"   ,
	"頭上"   ,
	"体"     ,
	"左手"   ,
	"右手"   ,
	"衣頭上" ,
	"衣頭中" ,
	"衣頭下" ,
	"衣肩"   ,
	"矢/弾"  ,
	"影体"   ,
	"影右手" ,
	"影左手" ,
	"影足"   ,
	"影右ア" ,
	"影左ア" ,
};

// 装備部位名を取得する。
const char* get_equip_pos_name(equip_index equ_ind) {
	return EQUIP_POS_NAME_TABLE[equ_ind].c_str();
}

BUILDIN_FUNC(allowuseitem) {
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(areakillmonster) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) return SCRIPT_CMD_SUCCESS;
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	map_foreachinarea(buildin_killmonsterall_sub, m, x0, y0, x1, y1, BL_MOB);
	return SCRIPT_CMD_SUCCESS;
}
static int buildin_misceffect_sub(struct block_list *bl,va_list ap)
{
	map_session_data* sd = (map_session_data*)(bl);
	int typ = va_arg(ap,int);
	clif_misceffect(&sd->bl, typ);
	return 0;
}
BUILDIN_FUNC(areamisceffect) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) return SCRIPT_CMD_SUCCESS;
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	int typ = script_getnum(st, 7);
	map_foreachinarea(buildin_misceffect_sub, m, x0, y0, x1, y1, BL_PC, typ);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(areamobuseskill2) {
	block_list center;
	center.m = script_mapname2mapid(st, script_getstr(st, 2));
	if (center.m < 0 ) {
		ShowError("areamobuseskill: invalid map name.\n");
		return SCRIPT_CMD_SUCCESS;
	}
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	center.x = (x0 + x1) / 2;
	center.y = (y0 + y1) / 2;
	int rx = abs(center.x - x0);
	int ry = abs(center.y - y0);
	int range = max(rx, ry);
	int mobid = script_getnum(st, 7);
	script_data* data = script_getdata(st, 8);
	get_val(st, data);
	int skill_id = (data_isstring(data) ? skill_name2id(script_getstr(st, 8)) : script_getnum(st ,8));
	int skill_lv = script_getnum(st, 9);
	skill_lv = min(skill_lv, battle_config.mob_max_skilllvl);
	int casttime = script_getnum(st, 10);
	int cancel = script_getnum(st, 11);
	int emotion = script_getnum(st, 12);
	int target = script_getnum(st, 13);
	map_foreachinallrange(buildin_mobuseskill_sub, &center, range, BL_MOB, mobid, skill_id, skill_lv, casttime, cancel, emotion, target);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(areasetcell) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) return SCRIPT_CMD_SUCCESS;
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	int typ = script_getnum(st, 7);

	for (int y = y0; y <= y1; ++y) {
		for (int x = x0; x <= x1; ++x) {
			map_setcell(m, x, y, CELL_WALKABLE, !typ);
			clif_changemapcell(0, m, x, y, typ, ALL_SAMEMAP);
		}
	}
	return SCRIPT_CMD_SUCCESS;
}
static int buildin_soundeffect_sub(struct block_list *bl,va_list ap)
{
	map_session_data* sd = (map_session_data*)(bl);
	const char* nam = va_arg(ap,const char*);
	int typ = va_arg(ap,int);
	int interval = va_arg(ap,int);
	clif_soundeffect(sd, bl, nam, typ, interval);
	return 0;
}
BUILDIN_FUNC(areasoundeffect) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) return SCRIPT_CMD_SUCCESS;
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	const char* nam = script_getstr(st, 7);
	int typ = script_getnum(st, 8);
	int interval = 0;
	if (script_hasdata(st, 9)) interval = script_getnum(st, 9);
	map_foreachinarea(buildin_soundeffect_sub, m, x0, y0, x1, y1, BL_PC, nam, typ, interval);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(checkdead) {
	script_pushint(st,pc_isdead(map_id2sd(st->rid)));
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(checkitemblank) {
	int slos = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) slos = pc_inventoryblank(sd);
	script_pushint(st, slos);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(checkquest2) {
	map_session_data* sd;
	if (!script_rid2sd(sd)) return SCRIPT_CMD_FAILURE;
	int qid = script_getnum(st, 2);
	int res = 0;
	int i;
	ARR_FIND(0, sd->num_quests, i, sd->quest_log[i].quest_id == qid);
	if (i < sd->num_quests) {
		quest* que = &sd->quest_log[i];
		if(que->state == 2) res |= 0x08; // クエスト達成済み
		else {
			res |= 0x05; // クエスト受注済み+討伐数クリア
			if(que->time < (unsigned int)(std::time(NULL))) res |= 0x02; // 時間制限クリア
			std::shared_ptr<s_quest_db> qdb = quest_search(qid);
			ARR_FIND(0, qdb->objectives.size(), i, que->count[i] >= qdb->objectives[i]->count);
			if (i == qdb->objectives.size()) res &= ~0x04; // 討伐数未クリア
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(chgquest) {
	return buildin_changequest(st);
}
BUILDIN_FUNC(compquest) {
	return buildin_completequest(st);
}
BUILDIN_FUNC(delequip2) {
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				pc_unequipitem(sd, inv_ind, 3);
				pc_delitem(sd, inv_ind, 1, 0, 2, LOG_TYPE_SCRIPT);
			}
		}
	}
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(delquest) {
	return buildin_erasequest(st);
}
BUILDIN_FUNC(distance2) {
	map_session_data* sd = map_id2sd(script_getnum(st, 2));
	npc_data* nd = npc_name2id(script_getstr(st, 3));
	if (!nd) nd = map_id2nd(st->oid);
	int dis = -1;
	if(sd &&
		nd &&
		sd->bl.m == nd->bl.m
	) dis = distance_bl(&sd->bl, &nd->bl);
	push_val(st->stack, C_INT, dis);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(downrefitem2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				item_data* idb = sd->inventory_data[inv_ind];
				int equ = itm->equip;
				log_pick_pc(sd, LOG_TYPE_SCRIPT, -1, itm);
				pc_unequipitem(sd, inv_ind, 2);
				int amo = 1;
				if (script_hasdata(st, 3)) amo = script_getnum(st, 3);
				itm->refine = cap_value(itm->refine - amo, 0, MAX_REFINE);
				clif_refine(sd->fd, 2, inv_ind, itm->refine);
				clif_delitem(sd, inv_ind, 1, 3);
				log_pick_pc(sd, LOG_TYPE_SCRIPT, 1, itm);
				clif_additem(sd, inv_ind, 1, 0);
				pc_equipitem(sd, inv_ind, equ);
				clif_misceffect(&sd->bl, 2);
				achievement_update_objective(sd, AG_REFINE_FAIL, 1, itm->refine);
				res = itm->refine;
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(dropitem) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) return SCRIPT_CMD_SUCCESS;
	int x = script_getnum(st, 3);
	int y = script_getnum(st, 4);
	int nid = 0;
	if (script_isstring(st, 5)) {
		item_data* idb = itemdb_searchname(script_getstr(st, 5));
		if(idb) nid = idb->nameid;

	} else nid = script_getnum(st, 5);
	if (nid <= 0) return SCRIPT_CMD_SUCCESS;
	int amo = script_getnum(st, 6);
	int tic = script_getnum(st, 7);
	int lim = 0;
	if (script_hasdata(st, 8)) lim = script_getnum(st, 8);
	item itm = {};
	itm.nameid = nid;
	if (lim) itm.expire_time = (unsigned int)(time(NULL) + lim);
	battle_config.flooritem_lifetime += tic;
	map_addflooritem(&itm, amo, m, x, y, 0, 0, 0, 0, 0, 0);
	battle_config.flooritem_lifetime -= tic;
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(equippeditem) {
	int equ_id = script_getnum(st, 2);
	map_session_data* sd = NULL;
	if (script_hasdata(st, 3)) sd = map_nick2sd(script_getstr(st, 3), false);
	else script_rid2sd(sd);
	if (sd) {
		for (int i = 0; i < EQI_MAX; ++i) {
			int equ_ind = sd->equip_index[i];
			if (equ_ind < 0) continue;
			item* equ_itm = &sd->inventory.u.items_inventory[equ_ind];
			if (equ_itm->nameid == equ_id) {
				script_pushint(st, 1);
				return SCRIPT_CMD_SUCCESS;
			}
		}
	}
	script_pushint(st, 0);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(failedrefitem2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				itm->refine = 0;
				pc_unequipitem(sd, inv_ind, 3);

				int ntf = 1;
				if (script_hasdata(st, 3)) ntf = script_getnum(st, 3);
				if (ntf) clif_refine(sd->fd, 1, inv_ind, itm->refine);

				pc_delitem(sd, inv_ind, 1, 0, 2, LOG_TYPE_SCRIPT);

				if (ntf) clif_misceffect(&sd->bl, 2);

				achievement_update_objective(sd, AG_REFINE_FAIL, 1, 1);
				res = 1;
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(failedrefitem3) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				if (itm->refine) {
					int equ = itm->equip;
					log_pick_pc(sd, LOG_TYPE_SCRIPT, -1, itm);
					--itm->refine;
					pc_unequipitem(sd, inv_ind, 2);

					int ntf = 1;
					if (script_hasdata(st, 3)) ntf = script_getnum(st, 3);
					if (ntf) clif_refine(sd->fd, 1, inv_ind, itm->refine);

					clif_delitem(sd, inv_ind, 1, 3);
					log_pick_pc(sd, LOG_TYPE_SCRIPT, 1, itm);
					clif_additem(sd, inv_ind, 1, 0);
					pc_equipitem(sd, inv_ind, equ);

					if (ntf) clif_misceffect(&sd->bl, 2);

					achievement_update_objective(sd, AG_REFINE_FAIL, 1, 1);
				}
				res = itm->refine;
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(failedrefitem4) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				int ntf = 1;
				if (script_hasdata(st, 3)) ntf = script_getnum(st, 3);
				if (ntf) clif_refine(sd->fd, 1, inv_ind, itm->refine);
				if (ntf) clif_misceffect(&sd->bl, 2);
				achievement_update_objective(sd, AG_REFINE_FAIL, 1, 1);
				res = itm->refine;
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(failedremovecards2) {
	int i=-1,c,cardflag=0;

	TBL_PC* sd;
	int typefail;

	if( !script_rid2sd(sd) )
		return SCRIPT_CMD_SUCCESS;

	equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
	typefail = script_getnum(st,3);

	if (equip_index_check(equ_ind))
		i=pc_checkequip(sd,equip_bitmask[equ_ind]);

	if (i < 0 || !sd->inventory_data[i])
		return SCRIPT_CMD_SUCCESS;

	if(itemdb_isspecial(sd->inventory.u.items_inventory[i].card[0]))
		return SCRIPT_CMD_SUCCESS;

	for( c = sd->inventory_data[i]->slots - 1; c >= 0; --c ) {
		if( sd->inventory.u.items_inventory[i].card[c] && itemdb_type(sd->inventory.u.items_inventory[i].card[c]) == IT_CARD ) {
			cardflag = 1;

			if(typefail == 2) {// add cards to inventory, clear
				unsigned char flag = 0;
				struct item item_tmp;

				memset(&item_tmp,0,sizeof(item_tmp));

				item_tmp.nameid   = sd->inventory.u.items_inventory[i].card[c];
				item_tmp.identify = 1;

				if((flag=pc_additem(sd,&item_tmp,1,LOG_TYPE_SCRIPT))){
					clif_additem(sd,0,0,flag);
					map_addflooritem(&item_tmp,1,sd->bl.m,sd->bl.x,sd->bl.y,0,0,0,0,0);
				}
			}
		}
	}

	if(cardflag == 1) {
		if(typefail == 0 || typefail == 2){	// destroy the item
			pc_delitem(sd,i,1,0,2,LOG_TYPE_SCRIPT);
		}else if(typefail == 1){ // destroy the card
			unsigned char flag = 0;
			struct item item_tmp;

			memset(&item_tmp,0,sizeof(item_tmp));

			item_tmp.nameid      = sd->inventory.u.items_inventory[i].nameid;
			item_tmp.identify    = 1;
			item_tmp.refine      = sd->inventory.u.items_inventory[i].refine;
			item_tmp.attribute   = sd->inventory.u.items_inventory[i].attribute;
			item_tmp.expire_time = sd->inventory.u.items_inventory[i].expire_time;
			item_tmp.bound       = sd->inventory.u.items_inventory[i].bound;

			for (uint16_t j = sd->inventory_data[i]->slots; j < MAX_SLOTS; j++)
				item_tmp.card[j]=sd->inventory.u.items_inventory[i].card[j];
			
			for (uint16_t j = 0; j < MAX_ITEM_RDM_OPT; j++){
				item_tmp.option[j].id=sd->inventory.u.items_inventory[i].option[j].id;
				item_tmp.option[j].value=sd->inventory.u.items_inventory[i].option[j].value;
				item_tmp.option[j].param=sd->inventory.u.items_inventory[i].option[j].param;
			}

			pc_delitem(sd,i,1,0,2,LOG_TYPE_SCRIPT);

			if((flag=pc_additem(sd,&item_tmp,1,LOG_TYPE_SCRIPT))){
				clif_additem(sd,0,0,flag);
				map_addflooritem(&item_tmp,1,sd->bl.m,sd->bl.x,sd->bl.y,0,0,0,0,0);
			}
		}
		clif_misceffect(&sd->bl,2);
	}
	return SCRIPT_CMD_SUCCESS;
}
static int buildin_getareamobs_sub(block_list *bl, va_list ap) {
	const char* eve = va_arg(ap, char*);
	int mob_id = va_arg(ap, int);
	mob_data* md = (mob_data *)(bl);
	return md->status.hp > 0 &&
		((eve &&
				strcmp(md->npc_event, eve) == 0
			) || (mob_id &&
				md->mob_id == mob_id
			)
		);
}
BUILDIN_FUNC(getareamobs) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) {
		script_pushint(st, 0);
		return SCRIPT_CMD_SUCCESS;
	}
	int x0 = script_getnum(st, 3);
	int y0 = script_getnum(st, 4);
	int x1 = script_getnum(st, 5);
	int y1 = script_getnum(st, 6);
	const char* eve = NULL;
	int mob_id = 0;
	if (script_hasdata(st, 7)) {
		script_data* data = script_getdata(st, 7);
		if (data_isstring(data)) eve = conv_str(st, data);
		else mob_id = conv_num(st, data);
	}
	script_pushint(st, map_foreachinarea(buildin_getareamobs_sub, m, x0, y0, x1, y1, BL_MOB, eve, mob_id));
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getbaseclass) {
	int job = script_getnum(st, 2);
	int cla = pc_jobid2mapid(job);
	int sex = pc_jobid2sex(job);
	int typ = 0;
	if (script_hasdata(st, 3)) typ = script_getnum(st, 3);
	int bas_cla;
	if (typ == 2) bas_cla = cla & MAPID_UPPERMASK;
	else bas_cla = cla & MAPID_BASEMASK;
	script_pushint(st, pc_mapid2jobid(bas_cla, sex));
	return SCRIPT_CMD_SUCCESS;
}
static int buildin_getmapmobs_sub(block_list *bl, va_list ap) {
	const char* eve = va_arg(ap, char*);
	int mob_id = va_arg(ap, int);
	mob_data* md = (mob_data *)(bl);
	return md->status.hp > 0 &&
		((eve &&
				strcmp(md->npc_event, eve) == 0
			) || (mob_id &&
				md->mob_id == mob_id
			)
		);
}
BUILDIN_FUNC(getequipcardcnt2)
{
	int i=-1,j;
	TBL_PC *sd;
	int count;

	if( !script_rid2sd(sd) )
		return SCRIPT_CMD_SUCCESS;

	equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
	if (equip_index_check(equ_ind))
		i=pc_checkequip(sd,equip_bitmask[equ_ind]);

	if (i < 0 || !sd->inventory_data[i]) {
		script_pushint(st,0);
		return SCRIPT_CMD_SUCCESS;
	}

	if(itemdb_isspecial(sd->inventory.u.items_inventory[i].card[0]))
	{
		script_pushint(st,0);
		return SCRIPT_CMD_SUCCESS;
	}

	count = 0;
	for( j = 0; j < sd->inventory_data[i]->slots; j++ )
		if( sd->inventory.u.items_inventory[i].card[j] && itemdb_type(sd->inventory.u.items_inventory[i].card[j]) == IT_CARD )
			count++;

	script_pushint(st,count);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipcardid2)
{
	int id = 0;
	map_session_data* sd;
	if (script_rid2sd(sd))	{
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int i = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (i >= 0 &&
				sd->inventory_data[i]
			) {
				int slo = script_getnum(st, 3);
				if (slo < MAX_SLOTS) id = sd->inventory.u.items_inventory[i].card[slo];
			}
		}
	}
	script_pushint(st, id);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipid2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) res = sd->inventory.u.items_inventory[inv_ind].nameid;
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipisenableref2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0)
				res = !sd->inventory_data[inv_ind]->flag.no_refine &&
					!sd->inventory.u.items_inventory[inv_ind].expire_time;
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipisequiped2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind))
			res = pc_checkequip(sd, equip_bitmask[equ_ind]) >= 0;
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipisidentify) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) res = sd->inventory.u.items_inventory[inv_ind].identify;
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipname2) {
	std::stringstream out;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) out << sd->inventory_data[inv_ind]->ename;
			else out << "(未装備@" << get_equip_pos_name(equ_ind) << ")";
		}
	}
	script_pushstrcopy(st, out.str().c_str());
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequippercentrefinery2) {
	int res = 0;
	bool enr = false;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				if (itm->refine < MAX_REFINE) {
					item_data* idb = sd->inventory_data[inv_ind];
					refine_type typ = REFINE_TYPE_SHADOW;
					if (idb->type != IT_SHADOWGEAR)	typ = refine_type(idb->wlv);
					if (script_hasdata(st, 3)) enr = script_getnum(st, 3);
					res = status_get_refine_chance(typ, itm->refine, enr);
				}
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequiprefinerycnt2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) res = sd->inventory.u.items_inventory[inv_ind].refine;
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getequipweaponlv2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) res = sd->inventory_data[inv_ind]->wlv;
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getmapmobs) {
	const char* map_nam = script_getstr(st, 2);
	int m = script_mapname2mapid(st, map_nam);
	if (m < 0) {
		script_pushint(st, 0);
		return SCRIPT_CMD_SUCCESS;
	}
	const char* eve = NULL;
	int mob_id = 0;
	if (script_hasdata(st, 3)) {
		script_data* data = script_getdata(st, 3);
		if (data_isstring(data)) eve = conv_str(st, data);
		else mob_id = conv_num(st, data);
	}
	script_pushint(st, map_foreachinmap(buildin_getmapmobs_sub, m, BL_MOB, eve, mob_id));
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getmapname) {
	struct block_list *bl = NULL;
	TBL_PC *sd = NULL;
	if (script_nick2sd(2,sd)) bl = &sd->bl;
	if (bl) script_pushstr(st, map_getmapdata(bl->m)->name);
	else script_pushnil(st);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getmdmapname) {
	return buildin_instance_mapname(st);
}
BUILDIN_FUNC(getmdnpcname) {
	return buildin_instance_npcname(st);
}
BUILDIN_FUNC(getonlinepartymember) {
	int par_id = 0;
	if (script_hasdata(st, 2)) par_id = script_getnum(st, 2);
	if (!par_id) {
		map_session_data* sd;
		if (script_rid2sd(sd)) par_id = sd->status.party_id;
	}
	int cou = 0;
	if (par_id) {
		party_data* pd = party_search(par_id);
		if (pd) {
			for (int i = 0; i < MAX_PARTY; ++i) {
				if (pd->party.member[i].online) ++cou;
			}
		}
	}
	script_pushint(st, cou);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getrepairableitemcount) {
	int bro_equ_cou = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		for(int i = 0; i < MAX_INVENTORY; ++i)
			bro_equ_cou += bool(sd->inventory.u.items_inventory[i].attribute);
	}
	push_val(st->stack, C_INT, bro_equ_cou);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(getwaitingpcid) {
	script_data* rid = script_getdata(st, 2);
	if (!data_isreference(rid)) {
		ShowError("script:getwaitingpcid: not a variable\n");
		script_reportdata(rid);
		st->state = END;
		return SCRIPT_CMD_FAILURE;// not a variable
	}
	map_session_data *sd = NULL;
	if (not_server_variable(*reference_getname(rid))) {
		if (!script_rid2sd(sd)) return SCRIPT_CMD_SUCCESS;
	}
	npc_data* nd = NULL;
	if (script_hasdata(st, 3)) nd = npc_name2id(script_getstr(st, 3));
	if (!nd) nd = map_id2nd(st->oid);
	if (nd) {
		chat_data* cd = map_id2cd(nd->chat_id);
		if(cd &&
			cd->users >= 1 &&
			!is_string_variable(reference_getname(rid))
		) set_reg_num(
			st,
			sd,
			reference_getuid(rid),
			reference_getname(rid),
			cd->usersd[0]->bl.id,
			reference_getref(rid)
		);
	}
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(mdcreate) {
	return buildin_instance_create(st);
}
BUILDIN_FUNC(mdenter) {
	return buildin_instance_enter(st);
}
BUILDIN_FUNC(npcskillsupport) {
	int kid = script_getnum(st, 2);
	int hea = script_getnum(st, 3);
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		block_list* sbl = &sd->bl;
		if (script_hasdata(st, 4)) {
			npc_data* nd = npc_name2id(script_getstr(st, 4));
			if (nd) sbl = &nd->bl;
		}
		block_list* tbl = &sd->bl;
		if (script_hasdata(st, 5)) {
			npc_data* nd = npc_name2id(script_getstr(st, 5));
			if (nd) tbl = &nd->bl;
		}
		clif_skill_nodamage(sbl, tbl, kid, hea, 1);
	}
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(openbook) {
	map_session_data *sd;
	if (script_rid2sd(sd)) {
		int bk_id = script_getnum(st, 2);
		int pag = 1;
		if (script_hasdata(st, 3)) pag = script_getnum(st, 3);
		clif_readbook(sd->fd, bk_id, pag);
	}
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(printarray) {
	script_data* arr = script_getdata(st, 2);
	if (!data_isreference(arr)) {
		ShowError("script:getwaitingpcid: not a variable\n");
		script_reportdata(arr);
		st->state = END;
		return SCRIPT_CMD_FAILURE;
	}
	const char* arr_nam = reference_getname(arr);
	map_session_data* sd = NULL;
	if (not_server_variable(*arr_nam)) {
		if (!script_rid2sd(sd)) return SCRIPT_CMD_SUCCESS;
	}
	const char* sep = ":";
	if (script_hasdata(st, 3)) sep = script_getstr(st, 3);
	int arr_siz = script_array_highest_key(st, sd, arr_nam, reference_getref(arr));
	std::stringstream out;
	uint32 ind = reference_getindex(arr);
	for (int i = 0; i < arr_siz; ++i) {
		if (i) out << sep;
		const void* val = get_val2_str(st, reference_uid(reference_getid(arr), ind++), reference_getref(arr));
		script_removetop(st, -1, 0);
		if (is_string_variable(arr_nam)) out << (const char*)val;
		else out << int(__64BPRTSIZE(val));
	}
	script_pushstrcopy(st, out.str().c_str());
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(repairitem) {
	return buildin_repairall(st);
}
BUILDIN_FUNC(sc_ison) {
	map_session_data* sd;
	if (!script_charid2sd(4, sd)) return SCRIPT_CMD_FAILURE;
	int id = script_getnum(st, 2);
	if (id <= SC_NONE ||
		id >= SC_MAX
	) {
		ShowWarning("script.inc:sc_ison: Invalid status type given (%d).\n", id);
		script_pushint(st, 0);
		return SCRIPT_CMD_SUCCESS;
	}
	script_pushint(st, sd->sc.count && sd->sc.data[id]);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(sc_start3) {
	int typ = script_getnum(st, 2);
	int val1 = script_getnum(st, 3);
	int val2 = script_getnum(st, 4);
	int val3 = script_getnum(st, 5);
	int val4 = script_getnum(st, 6);
	int tic = script_getnum(st, 7);
	int fla = script_getnum(st, 8);
	int id;
	if (script_hasdata(st, 9)) id = script_getnum(st, 9);
	else id = st->rid;
	block_list* bl = map_id2bl(id);
	if (bl &&
		!status_isdead(bl)
	) status_change_start(bl, bl, sc_type(typ), 0, val1, val2, val3, val4, tic, fla);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(strstr) {
	return buildin_compare(st);
}
BUILDIN_FUNC(substr2) {
	const char* str = script_getstr(st, 2);
	int beg = script_getnum(st, 3);
	int len = script_getnum(st, 4);
	int str_len = std::strlen(str);
	if (beg < 0) beg += str_len;
	if (beg + len > str_len) len = str_len - beg;
	char* res;
	if(beg >= 0 &&
		beg < str_len &&
		len > 0
	) {
		res = (char*)(aMalloc(len + 1));
		std::memcpy(res, str + beg, len);
	} else res = (char*)(aMalloc(1));
	res[len] = '\0';
	script_pushstr(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(successrefitem2) {
	int res = 0;
	map_session_data* sd;
	if (script_rid2sd(sd)) {
		equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
		if (equip_index_check(equ_ind)) {
			int inv_ind = pc_checkequip(sd, equip_bitmask[equ_ind]);
			if (inv_ind >= 0) {
				item* itm = &sd->inventory.u.items_inventory[inv_ind];
				if (itm->refine < MAX_REFINE) {
					int equ = itm->equip;
					log_pick_pc(sd, LOG_TYPE_SCRIPT, -1, itm);
					++itm->refine;
					pc_unequipitem(sd, inv_ind, 2);

					int ntf = 1;
					if (script_hasdata(st, 3)) ntf = script_getnum(st, 3);
					if (ntf) clif_refine(sd->fd, 0, inv_ind, itm->refine);

					clif_delitem(sd, inv_ind, 1, 3);
					log_pick_pc(sd, LOG_TYPE_SCRIPT, 1, itm);
					clif_additem(sd, inv_ind, 1, 0);
					pc_equipitem(sd, inv_ind, equ);

					if (ntf) clif_misceffect(&sd->bl, 3);

					item_data* idb = sd->inventory_data[inv_ind];
					achievement_update_objective(sd, AG_REFINE_SUCCESS, 2, idb->wlv, itm->refine);
					if (itm->refine == MAX_REFINE &&
						itm->card[0] == CARD0_FORGE &&
						sd->status.char_id == MakeDWord(itm->card[2], itm->card[3])
					) {
						if (idb->wlv == 1) pc_addfame(sd, battle_config.fame_refine_lv1);
						else if (idb->wlv == 2) pc_addfame(sd, battle_config.fame_refine_lv2);
						else if (idb->wlv == 3) pc_addfame(sd, battle_config.fame_refine_lv3);
					}
				}
				res = itm->refine;
			}
		}
	}
	script_pushint(st, res);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(successremovecards2) {
	int i=-1,c,cardflag=0;

	TBL_PC* sd;

	if( !script_rid2sd(sd) )
		return SCRIPT_CMD_SUCCESS;

	equip_index equ_ind = equip_index(equip_pos_order_to_index(script_getnum(st, 2) - 1));
	if (equip_index_check(equ_ind))
		i=pc_checkequip(sd,equip_bitmask[equ_ind]);

	if (i < 0 || !sd->inventory_data[i]) {
		return SCRIPT_CMD_SUCCESS;
	}

	if(itemdb_isspecial(sd->inventory.u.items_inventory[i].card[0]))
		return SCRIPT_CMD_SUCCESS;

	for( c = sd->inventory_data[i]->slots - 1; c >= 0; --c ) {
		if( sd->inventory.u.items_inventory[i].card[c] && itemdb_type(sd->inventory.u.items_inventory[i].card[c]) == IT_CARD ) {// extract this card from the item
			unsigned char flag = 0;
			struct item item_tmp;
			memset(&item_tmp,0,sizeof(item_tmp));
			cardflag = 1;
			item_tmp.nameid   = sd->inventory.u.items_inventory[i].card[c];
			item_tmp.identify = 1;

			if((flag=pc_additem(sd,&item_tmp,1,LOG_TYPE_SCRIPT))){	// get back the cart in inventory
				clif_additem(sd,0,0,flag);
				map_addflooritem(&item_tmp,1,sd->bl.m,sd->bl.x,sd->bl.y,0,0,0,0,0);
			}
		}
	}

	if(cardflag == 1) {//if card was remove remplace item with no card
		unsigned char flag = 0, j;
		struct item item_tmp;
		memset(&item_tmp,0,sizeof(item_tmp));

		item_tmp.nameid      = sd->inventory.u.items_inventory[i].nameid;
		item_tmp.identify    = 1;
		item_tmp.refine      = sd->inventory.u.items_inventory[i].refine;
		item_tmp.attribute   = sd->inventory.u.items_inventory[i].attribute;
		item_tmp.expire_time = sd->inventory.u.items_inventory[i].expire_time;
		item_tmp.bound       = sd->inventory.u.items_inventory[i].bound;

		for (j = sd->inventory_data[i]->slots; j < MAX_SLOTS; j++)
			item_tmp.card[j]=sd->inventory.u.items_inventory[i].card[j];
		
		for (j = 0; j < MAX_ITEM_RDM_OPT; j++){
			item_tmp.option[j].id=sd->inventory.u.items_inventory[i].option[j].id;
			item_tmp.option[j].value=sd->inventory.u.items_inventory[i].option[j].value;
			item_tmp.option[j].param=sd->inventory.u.items_inventory[i].option[j].param;
		}

		pc_delitem(sd,i,1,0,3,LOG_TYPE_SCRIPT);
		if((flag=pc_additem(sd,&item_tmp,1,LOG_TYPE_SCRIPT))){	//chk if can be spawn in inventory otherwise put on floor
			clif_additem(sd,0,0,flag);
			map_addflooritem(&item_tmp,1,sd->bl.m,sd->bl.x,sd->bl.y,0,0,0,0,0);
		}

		clif_misceffect(&sd->bl,3);
	}
	return SCRIPT_CMD_SUCCESS;
}


/*==========================================
 * Spawn a monster:
 * *monster "<map name>",<x>,<y>,"<name to show>",<mob id>{,"<event label>",<size>,<ai>};
 *------------------------------------------*/
BUILDIN_FUNC(callmonster)
{
	const char* mapn	= script_getstr(st,2);
	int x				= script_getnum(st,3);
	int y				= script_getnum(st,4);
	const char* str		= script_getstr(st,5);
	int class_			= script_getnum(st,6);
	const char* event	= "";
	unsigned int size	= SZ_SMALL;
	enum mob_ai ai		= AI_NONE;

	struct map_session_data* sd;
	int16 m;
	int i;

	if (script_hasdata(st, 7)) {
		event = script_getstr(st, 7);
		check_event(st, event);
	}

	if (script_hasdata(st, 8)) {
		size = script_getnum(st, 8);
		if (size > SZ_BIG) {
			ShowWarning("buildin_monster: Attempted to spawn non-existing size %d for monster class %d\n", size, class_);
			return 0;
		}
	}

	if (script_hasdata(st, 9)) {
		ai = static_cast<enum mob_ai>(script_getnum(st, 9));
		if (ai >= AI_MAX) {
			ShowWarning("buildin_monster: Attempted to spawn non-existing ai %d for monster class %d\n", ai, class_);
			return 0;
		}
	}

	if (class_ >= 0 && !mobdb_checkid(class_)) {
		ShowWarning("buildin_monster: Attempted to spawn non-existing monster class %d\n", class_);
		return 0;
	}

	sd = map_id2sd(st->rid);

	if (sd && strcmp(mapn, "this") == 0)
		m = sd->bl.m;
	else
		m = map_mapname2mapid(mapn);

	int mobid = mob_once_spawn(sd, m, x, y, str, class_, 1, event, size, ai);

	if (mobid)
		mapreg_setreg(reference_uid(add_str("$@mobid"), i), mobid);

	return mobid;
}
