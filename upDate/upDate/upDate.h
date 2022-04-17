/*
Programmer: Aldo Dagio-Ortega
Date: 04/12/2022
Description: upDate.h is the header file for the upDate class.
You can find all functions and data members for the class below in this file.
*/
#ifndef UPDATE_H
#define UPDATE_H
#include <string>
#include <iostream>
using namespace std;
class upDate {

private:
	int* pArr;
	static int count;
public:
	upDate();
	upDate(const upDate&);
	upDate(int,int,int);
	upDate(int);
	~upDate();
	void setDate(int, int, int);
	static int GetDateCount();
	int getMonth();
	int getDay();
	int getYear();
	int julian();
	string getMonthName();
	upDate operator+=(int);
	upDate operator-=(int);
	upDate operator+(int);
	upDate operator-(int);
	upDate operator++();
	upDate operator++(int);
	upDate operator--();
	upDate operator--(int);
	int operator-(upDate);
	bool operator==(upDate);
	bool operator>(upDate);
	bool operator<(upDate);
	upDate& operator=(const upDate&);
	friend upDate operator+(int, upDate);
	friend ostream &operator<<(ostream &, const upDate&);
};
#endif