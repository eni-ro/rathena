#include "./csv_db.hpp"

using namespace csv_script;
BUILDIN_FUNC(csvgetrows) {
	const char* file = script_getstr(st, 2);
	int rows = MyCSVDB::GetCSV(file).GetRows();
	script_pushint(st, rows );
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvgetcols) {
	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
    int cols = MyCSVDB::GetCSV(file).GetCols(row);
	script_pushint(st, cols );
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvread) {
	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
	int col = script_getnum(st, 4);
    string data = MyCSVDB::GetCSV(file).Read(row,col);
	script_pushstrcopy(st, data.c_str() );
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvreadrow) {
	TBL_PC* sd = NULL;

	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
	struct script_data* data = script_getdata(st, 4);
	if( !data_isreference(data) )
	{
		ShowError("script:csvreadarray: not a variable\n");
		script_reportdata(data);
		st->state = END;
		return SCRIPT_CMD_FAILURE;// not a variable
	}

	int32 id = reference_getid(data);
	uint32 start = reference_getindex(data);
	const char* name = reference_getname(data);

	if( not_server_variable(*name) )
	{
		if( !script_rid2sd(sd) )
			return SCRIPT_CMD_SUCCESS;// no player attached
	}

    vector<string> tmp = MyCSVDB::GetCSV(file).ReadLine(row);
	uint32 end = start + tmp.size();
	if( end > SCRIPT_MAX_ARRAYSIZE )
		end = SCRIPT_MAX_ARRAYSIZE;

	if( is_string_variable(name) )
	{// string array
		int32 i;
		for( i = 0; start < end; ++start, ++i )
			set_reg_str( st, sd, reference_uid( id, start ), name, tmp[i].c_str(), reference_getref( data ) );
		
		int arr_size = script_array_highest_key(st, sd, reference_getname(data), reference_getref(data));
		char empty_str[] = "\0";
		for( ; start < arr_size; ++start )
			set_reg_str( st, sd, reference_uid( id, start ), name, empty_str, reference_getref( data ) );
	}
	else
	{// int array
		ShowError("script:csvreadarray: not a string variable\n");
	    return SCRIPT_CMD_SUCCESS;
	}
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvreadcol) {
	TBL_PC* sd = NULL;

	const char* file = script_getstr(st, 2);
	int col = script_getnum(st, 3);
	struct script_data* data = script_getdata(st, 4);
	if( !data_isreference(data) )
	{
		ShowError("script:csvreadarray: not a variable\n");
		script_reportdata(data);
		st->state = END;
		return SCRIPT_CMD_FAILURE;// not a variable
	}

	int32 id = reference_getid(data);
	uint32 start = reference_getindex(data);
	const char* name = reference_getname(data);

	if( not_server_variable(*name) )
	{
		if( !script_rid2sd(sd) )
			return SCRIPT_CMD_SUCCESS;// no player attached
	}

    MyCSV tmp = MyCSVDB::GetCSV(file);
	uint32 end = start + tmp.GetRows();
	if( end > SCRIPT_MAX_ARRAYSIZE )
		end = SCRIPT_MAX_ARRAYSIZE;

	if( is_string_variable(name) )
	{// string array
		int32 i;
		for( i = 0; start < end; ++start, ++i )
			set_reg_str( st, sd, reference_uid( id, start ), name, tmp.Read(i,col).c_str(), reference_getref( data ) );
		
		int arr_size = script_array_highest_key(st, sd, reference_getname(data), reference_getref(data));
		char empty_str[] = "\0";
		for( ; start < arr_size; ++start )
			set_reg_str( st, sd, reference_uid( id, start ), name, empty_str, reference_getref( data ) );
	}
	else
	{// int array
		ShowError("script:csvreadarray: not a string variable\n");
	    return SCRIPT_CMD_SUCCESS;
	}
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvwrite) {
	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
	int col = script_getnum(st, 4);
    const char* val = script_getstr(st, 5);
    MyCSVDB::GetCSV(file).Write(row,col,val);
	return SCRIPT_CMD_SUCCESS;
}
BUILDIN_FUNC(csvwritearray) {
	struct script_data* data2;
	const char* name2;
	TBL_PC* sd = NULL;

	data2 = script_getdata(st, 4);
	if( !data_isreference(data2) )
	{
		ShowError("script:csvwritearray: not a variable\n");
		script_reportdata(data2);
		st->state = END;
		return SCRIPT_CMD_FAILURE;// not a variable
	}

	int32 id2 = reference_getid(data2);
	int32 idx2 = reference_getindex(data2);
	name2 = reference_getname(data2);

	if( !is_string_variable( name2 ) ){
		ShowError("script:csvwritearray: type mismatch\n");
		script_reportdata(data2);
		st->state = END;
		return SCRIPT_CMD_FAILURE;// data type mismatch
	}

	if( not_server_variable(*name2) )
	{
		if( !script_rid2sd(sd) )
			return SCRIPT_CMD_SUCCESS;// no player attached
	}

	int arr_size = script_array_highest_key(st, sd, reference_getname(data2), reference_getref(data2));
    vector<string> data;

    // normal copy
    for( int32 i = idx2; i < arr_size; i++ ){
        const char* value = get_val2_str( st, reference_uid( id2, idx2 + i ), reference_getref( data2 ) );
        data.push_back(value);
        // Remove stack entry from get_val2_str
        script_removetop( st, -1, 0 );
    }

	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
    MyCSVDB::GetCSV(file).Write(row,data);

	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvfind) {
	const char* file = script_getstr(st, 2);
	int col = script_getnum(st, 3);
	const char* val = script_getstr(st, 4);
	script_pushint(st, MyCSVDB::GetCSV(file).Find(col,val) );
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvreload) {
	const char* file = script_getstr(st, 2);
    MyCSVDB::GetCSV(file).Flush();
    MyCSVDB::GetCSV(file).Load(file);
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvinsert) {
	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
    MyCSVDB::GetCSV(file).Insert(row);
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvdelete) {
	const char* file = script_getstr(st, 2);
	int row = script_getnum(st, 3);
    MyCSVDB::GetCSV(file).Delete(row);
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvsort) {
	const char* file = script_getstr(st, 2);
	int col = script_getnum(st, 3);
	int order = script_getnum(st, 4);
    MyCSVDB::GetCSV(file).Sort(col,order);
	return SCRIPT_CMD_SUCCESS;
}

BUILDIN_FUNC(csvflush) {
	const char* file = script_getstr(st, 2);
    MyCSVDB::GetCSV(file).Flush();
	return SCRIPT_CMD_SUCCESS;
}
