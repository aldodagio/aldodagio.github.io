/*Programmer: Aldo Dagio - Ortega
Date : 03 / 01 / 2022
Description : The header file for the myDate class.
Contains the myDate attributes and the function prototypes.
*/
#ifndef MYDATE_H
#define MYDATE_H
#include <string>
using namespace std;
class myDate {
public:
	myDate();
	myDate(int, int, int);
	string getDate();
	void display();
	void increaseDate(int);
	void decreaseDate(int);
	void addMonth();
	int daysBetween(myDate);
	int getMonth();
	int getDay();
	int getYear();
	int dayOfYear();
	string dayName();
private:
	int day = 0;
	int month = 0;
	int year = 0;
};
#endif