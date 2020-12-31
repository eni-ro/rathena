#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <algorithm>
#include <unordered_map>
#include "./csv_db.hpp"

using namespace std;
using namespace csv_script;

unordered_map<string, MyCSV> MyCSVDB::csv_db = unordered_map<string, MyCSV>();

MyCSV::MyCSV()
{
}

bool MyCSV::Load(const string &path)
{
    filepath = path;
    dirty = false;
    data.clear();

    ifstream ifs;
    ifs.open(filepath.c_str());
    if(!ifs){
        ShowError("Failed to open csv file : %s\n",path.c_str());
        return false;
    }
    while (!ifs.eof())
    {
        string line;
        getline(ifs, line);
        data.push_back(Split(line));
    }
    ifs.close();

    return true;
}

MyCSV::~MyCSV()
{
    //Flush();
}

int MyCSV::GetRows()
{
    return data.size();
}

int MyCSV::GetCols(int row)
{
    if (row >= data.size())
    {
        return 0;
    }
    return data[row].size();
}

string MyCSV::Read(int row, int col)
{
    if ((data.size() <= row) || (data[row].size() <= col))
    {
        return "";
    }
    return data[row][col];
}

vector<string> MyCSV::ReadLine(int row)
{
    if (data.size() <= row)
    {
        return vector<string>();
    }
    return data[row];
}

bool MyCSV::Write(int row, int col, std::string val)
{
    //append blank lines to write
    for (decltype(data.size()) i = data.size(); i <= row; i++)
    {
        data.push_back(vector<string>());
    }
    for (decltype(data[row].size()) i = data[row].size(); i <= col; i++)
    {
        data[row].push_back("");
    }
    data[row][col] = val;

    return true;
}

bool MyCSV::Write(int row, vector<string> vals)
{
    //append blank lines to write
    for (decltype(data.size()) i = data.size(); i <= row; i++)
    {
        data.push_back(vector<string>());
    }
    data[row] = vals;

    dirty = true;

    return true;
}

int MyCSV::Find(int col, string val)
{
    for (decltype(data.size()) i = 0, maxcol = data.size(); i < maxcol; i++)
    {
        if ((data[i].size() > col) && (data[i][col] == val))
        {
            return i;
        }
    }
    return -1;
}

void MyCSV::Insert(int row)
{
    for (decltype(data.size()) i = data.size(); i < row; i++)
    {
        data.push_back(vector<string>());
    }
    data.insert(data.begin() + row, vector<string>());

    dirty = true;
}

void MyCSV::Delete(int row)
{
    if (data.size() <= row)
    {
        return;
    }
    data.erase(data.begin() + row);
    dirty = true;
}

void MyCSV::Sort(int col, int order)
{
    stable_sort(data.begin(), data.end(), [col, order](auto const &lhs, auto const &rhs) {
        string lstr, rstr;
        if (lhs.size() > col)
        {
            lstr = lhs[col];
        }
        else
        {
            lstr = "";
        }
        if (rhs.size() > col)
        {
            rstr = rhs[col];
        }
        else
        {
            rstr = "";
        }
        if (order == -1)
        {
            return lstr < rstr;
        }
        return lstr > rstr;
    });
    dirty = true;
}

void MyCSV::Flush()
{
    if (!dirty)
    {
        return;
    }
    ofstream ofs;
    ofs.open(filepath.c_str());
    if(!ofs){
        ShowError("Failed to open csv file : %s\n",filepath.c_str());
        return;
    }
    data = vector<vector<string>>();
    for (vector<string> line : data)
    {
        ofs << Join(line) << '\n';
    }
    ofs.close();
    dirty = false;
}

vector<string> MyCSV::Split(const string &str)
{
    vector<string> cols;
    string item;
    for (char ch : str)
    {
        if (ch == ',')
        {
            if (!item.empty())
                cols.push_back(item);
            item.clear();
        }
        else
        {
            item += ch;
        }
    }
    if (!item.empty())
        cols.push_back(item);
    return cols;
}

string MyCSV::Join(const vector<string> &cols)
{
    std::string str;
    if (!cols.empty())
    {
        str += cols[0];
        for (decltype(cols.size()) i = 1, maxcol = cols.size(); i < maxcol; i++)
        {
            str += ',';
            str += cols[i];
        }
    }
    return str;
}

MyCSV& MyCSVDB::GetCSV(const char *cfilepath)
{
    string file = cfilepath;
    auto itr = csv_db.find(file);
    if (itr == csv_db.end())
    {
        MyCSV tmp = MyCSV();
        tmp.Load(file);
        csv_db[file] = tmp;
    }
    return csv_db[file];
}
void MyCSVDB::Reload(const char *cfilepath)
{
    string file = cfilepath;
    auto itr = csv_db.find(file);
    if (itr == csv_db.end())
    {
        MyCSV tmp = MyCSV();
        csv_db[file] = tmp;
    }
	else {
		csv_db[file].Flush();
	}
    csv_db[file].Load(file);
}
