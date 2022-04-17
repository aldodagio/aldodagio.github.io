/*Programmer: Aldo Dagio - Ortega
Date : 03 / 01 / 2022
Description : Class definition for the myDate class.
Two functions are declared before the class definition. 
These functions convert from Gregorian calendar dates
to Julian calendar dates and vice-versa, using the atrributes
of the class: month, day, year. In the class definition, the 
functions from the class header are defined. */
#include "myDate.h"
#include <iostream>
using namespace std;

int Greg2Julian(int month, int day, int year) {
	int K = day;
	int I = year;
	int J = month;

	return K - 32075 + 1461 * (I + 4800 + (J - 14) / 12) / 4 + 367 * (J - 2 - (J - 14) / 12 * 12) / 12 - 3 * ((I + 4900 + (J - 14) / 12) / 100) / 4;
}

void Julian2Greg(int JD, int &month, int &day, int &year) {
	int L = JD + 68569;
	int N = 4 * L / 146097;
	L = L - (146097 * N + 3) / 4;
	int I = 4000 * (L + 1) / 1461001;
	L = L - 1461 * I / 4 + 31;
	int J = 80 * L / 2447;
	int K = L - 2447 * J / 80;
	L = J / 11;
	J = J + 2 - 12 * L;
	I = 100 * (N - 49) + I + L;
	year = I;
	month = J;
	day = K;
}


myDate::myDate() {
	day = 11;
	month = 5;
	year = 1959;
}
myDate::myDate(int m, int d, int y) {

	if (y > 0) {
		year = y;
	}
	else
	{
		day = 11;
		month = 5;
		year = 1959;
	}

	if (m >= 1 && m <= 12) {
		month = m;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if (d >= 1 && d <= 31) {
				day = d;
			}
			else {
				day = 11;
				month = 5;
				year = 1959;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			if (d >= 1 && d <= 30) {
				day = d;
			}
			else {
				day = 11;
				month = 5;
				year = 1959;
			}
		}
		else if (month == 2) {
			if (d >= 1 && d <= 29) {
				int JD = Greg2Julian(m, d, y);
				Julian2Greg(JD, m, d, y);
				if (d == 29)
				{
					day = d;
				}
				else if (m == 2)
				{
					day = d;
				}
				else {
					day = 11;
					month = 5;
					year = 1959;
				}
			}
		}
	}
	else {
			day = 11;
			month = 5;
			year = 1959;
	}

}
void myDate::display() {

	if (month == 1)
	{
		cout << "January " << day << ", " << year;
	}
	else if (month == 2)
	{
		cout << "February " << day << ", " << year;
	}
	else if (month == 3)
	{
		cout << "March " << day << ", " << year;
	}
	else if (month == 4)
	{
		cout << "April " << day << ", " << year;
	}
	else if (month == 5)
	{
		cout << "May " << day << ", " << year;
	}
	else if (month == 6)
	{
		cout << "June " << day << ", " << year;
	}
	else if (month == 7)
	{
		cout << "July " << day << ", " << year;
	}
	else if (month == 8)
	{
		cout << "August " << day << ", " << year;
	}
	else if (month == 9)
	{
		cout << "September " << day << ", " << year;
	}
	else if (month == 10)
	{
		cout << "October " << day << ", " << year;
	}
	else if (month == 11)
	{
		cout << "November " << day << ", " << year;
	}
	else if (month == 12)
	{
		cout << "December " << day << ", " << year;
	}

}
string myDate::getDate() {
		
	if (month == 1)
	{
		string s = "January " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 2)
	{
		string s = "February " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 3)
	{
		string s = "March " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 4)
	{
		string s = "April " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 5)
	{
		string s = "May " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 6)
	{
		string s = "June " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 7)
	{
		string s = "July " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 8)
	{
		string s = "August " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 9)
	{
		string s = "September " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 10)
	{
		string s = "October " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 11)
	{
		string s = "November " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else if (month == 12)
	{
		string s = "December " + to_string(day) + ", " + to_string(year);
		return s;
	}
	else return "";
}
void myDate::increaseDate(int n) {
	int inc = day + n;
	int JD = Greg2Julian(month, inc, year);
	Julian2Greg(JD, month, day, year);
}
void myDate::decreaseDate(int n) {
	int dec = day - n;
	int JD = Greg2Julian(month, dec, year);
	Julian2Greg(JD, month, day, year);
}
void myDate::addMonth() {
	int temp = month;
	int d = day;
	if (month == 12)
	{
		month = 1;
		year++;
	}
	else {
		month++;
	}
	int JD = Greg2Julian(month, day,year);
	Julian2Greg(JD, month, day, year);
	if (temp != 12 && month - temp > 1)
	{
		if (temp+1 == 2 || temp+1 == 4 || temp+1 == 6 || temp+1 == 9 || temp+1 == 11)
		{
			day = d - day;
			month = month - 1;
		}
	}
}
int myDate::daysBetween(myDate d) {
	int JD = Greg2Julian(d.getMonth(), d.getDay(), d.getYear());
	int JD1 = Greg2Julian(month, day, year);
	JD = JD - JD1;
	return JD;
}
int myDate::getMonth() {
	return month;
}
int myDate::getDay() {
	return day;
}
int myDate::getYear() {
	return year;
}
int myDate::dayOfYear() {
	int JD = Greg2Julian(1,1, year);
	int JD1 = Greg2Julian(month, day, year);
	int doy = (JD1 - JD)+1;
	return doy;
}
string myDate::dayName() {
	int JD = Greg2Julian(month, day, year);
	int weekDay = JD % 7;
	if (weekDay == 0) {
		return "Monday";
	}
	else if (weekDay == 1) {
		return "Tuesday";
	}
	else if (weekDay == 2) {
		return "Wednesday";
	}
	else if (weekDay == 3) {
		return "Thursday";
	}
	else if (weekDay == 4) {
		return "Friday";
	}
	else if (weekDay == 5) {
		return "Saturday";
	}
	else if (weekDay == 6) {
		return "Sunday";
	}
}