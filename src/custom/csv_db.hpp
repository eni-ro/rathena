#ifndef CSV_DB_HPP_
#define CSV_DB_HPP_


#include <vector>
#include <string>
#include <unordered_map>

namespace csv_script{
    class MyCSV
    {
    public:
        MyCSV();
        ~MyCSV();
        bool Load(const std::string &path);
        int GetRows();
        int GetCols(int row);
		std::string Read(int row, int col);
		std::vector<std::string> ReadLine(int row);
        bool Write(int row, int col, std::string val);
        bool Write(int row, std::vector<std::string> vals);
        int Find(int col, std::string val);
        void Insert(int row);
        void Delete(int row);
        void Sort(int col, int order);
        void Flush();
    private:
		std::vector<std::string> Split(const std::string &str);
		std::string Join(const std::vector<std::string> &cols);
		std::string filepath;
		std::vector<std::vector<std::string>> data;
        bool dirty;
    };
    class MyCSVDB
    {
    public:
        static MyCSV GetCSV( const char *cfilepath );
        static void Reload( const char *cfilepath );
    private:
        MyCSVDB(){}
        static std::unordered_map<std::string,MyCSV> csv_db;
    };
};
#endif
