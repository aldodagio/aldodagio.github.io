/*
Programmer: Aldo Dagio-Ortega
Date: 04/12/2022
Description: Calendar (Julian Calendar & Gregorian Calendar) functions are defined
below for the upDate class. 
*/
#include "upDate.h"

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

upDate::upDate() {
	pArr = new int[3];
	pArr[0] = 5;
	pArr[1] = 11;
	pArr[2] = 1959;
	count++;
}
upDate::upDate(const upDate &copy) {
	pArr = new int[3];
	pArr[0] = copy.pArr[0];
	pArr[1] = copy.pArr[1];
	pArr[2] = copy.pArr[2];
	count++;
}
upDate::upDate(int m, int d, int y) {
	pArr = new int[3];
	if (y > 0) {
		pArr[2] = y;
	}
	else
	{
		pArr[0] = 5;
		pArr[1] = 11;
		pArr[2] = 1959;
	}

	if (m >= 1 && m <= 12) {
		pArr[0] = m;
		if (m == 1 || m == 3 || m == 5 || m== 7 || m == 8 || m == 10 || m == 12)
		{
			if (d >= 1 && d <= 31) {
				pArr[1] = d;
			}
			else {
				pArr[0] = 5;
				pArr[1] = 11;
				pArr[2] = 1959;
			}
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11)
		{
			if (d >= 1 && d <= 30) {
				pArr[1] = d;
			}
			else {
				pArr[0] = 5;
				pArr[1] = 11;
				pArr[2] = 1959;
			}
		}
		else if (m == 2) {
			if (d >= 1 && d <= 29) {
				int JD = Greg2Julian(m, d, y);
				Julian2Greg(JD, m, d, y);
				if (d == 29)
				{
					pArr[1] = d;
				}
				else if (m == 2)
				{
					pArr[1] = d;
				}
				else {
					pArr[0] = 5;
					pArr[1] = 11;
					pArr[2] = 1959;
				}
			}
		}
	}
	else {
		pArr[0] = 5;
		pArr[1] = 11;
		pArr[2] = 1959;
	}
	count++;
}
upDate::upDate(int j) {
	pArr = new int[3];
	pArr[0] = 5;
	pArr[1] = 11;
	pArr[2] = 1959;
	Julian2Greg(j, pArr[0], pArr[1], pArr[2]);
	count++;
}
upDate::~upDate() {
	delete[] pArr;
	count--;
}
int upDate::julian() {

	int j = Greg2Julian(pArr[0], pArr[1], pArr[2]);
	return j;
}
void upDate::setDate(int m, int d, int y) {
	if (y > 0) {
		pArr[2] = y;
	}
	else
	{
		pArr[0] = 5;
		pArr[1] = 11;
		pArr[2] = 1959;
	}

	if (m >= 1 && m <= 12) {
		pArr[0] = m;
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			if (d >= 1 && d <= 31) {
				pArr[1] = d;
			}
			else {
				pArr[0] = 5;
				pArr[1] = 11;
				pArr[2] = 1959;
			}
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11)
		{
			if (d >= 1 && d <= 30) {
				pArr[1] = d;
			}
			else {
				pArr[0] = 5;
				pArr[1] = 11;
				pArr[2] = 1959;
			}
		}
		else if (m == 2) {
			if (d >= 1 && d <= 29) {
				int JD = Greg2Julian(m, d, y);
				Julian2Greg(JD, m, d, y);
				if (d == 29)
				{
					pArr[1] = d;
				}
				else if (m == 2)
				{
					pArr[1] = d;
				}
				else {
					pArr[0] = 5;
					pArr[1] = 11;
					pArr[2] = 1959;
				}
			}
		}
	}
	else {
		pArr[0] = 5;
		pArr[1] = 11;
		pArr[2] = 1959;
	}
	
}
int upDate::GetDateCount() {
	return count;
}
int upDate::getMonth() {
	return pArr[0];
}
int upDate::getDay() {
	return pArr[1];
}
int upDate::getYear() {
	return pArr[2];
}
string upDate::getMonthName() {

	if (pArr[0] == 1)
	{
		return "January";
	}
	else if (pArr[0] == 2)
	{
		return "February";
	}
	else if (pArr[0] == 3)
	{
		return "March";
	}
	else if (pArr[0] == 4)
	{
		return "April";
	}
	else if (pArr[0] == 5)
	{
		return "May";
	}
	else if (pArr[0] == 6)
	{
		return "June";
	}
	else if (pArr[0] == 7)
	{
		return "July";
	}
	else if (pArr[0] == 8)
	{
		return "August";
	}
	else if (pArr[0] == 9)
	{
		return "September";
	}
	else if (pArr[0] == 10)
	{
		return "October";
	}
	else if (pArr[0] == 11)
	{
		return "November";
	}
	else if (pArr[0] == 12)
	{
		return "December";
	}
}
upDate upDate::operator+=(int i) {
	upDate a(i + julian());
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;
}
upDate upDate::operator-=(int i) {
	upDate a(julian()-i);
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;
}
upDate upDate::operator+(int i) {
	upDate a(i + julian());
	return a;
}
upDate upDate::operator-(int i) {
	upDate a(julian()-i);
	return a;
}
int upDate::operator-(upDate d) {
	return (julian() - d.julian());
}
upDate upDate::operator++() {
	int i = julian();
	upDate a(++i);
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;
}
upDate upDate::operator++(int i) {
	i = julian();
	i++;
	upDate a(i);
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;
}
upDate upDate::operator--() {
	int i = julian();
	upDate a(--i);
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;
}
upDate upDate::operator--(int i) {
	i = julian();
	i--;
	upDate a(i);
	pArr[0] = a.pArr[0];
	pArr[1] = a.pArr[1];
	pArr[2] = a.pArr[2];
	return *this;

}
bool upDate::operator==(upDate d) {
	bool flag = false;
	if (julian() == d.julian())
		flag = true;
	return flag;
}
bool upDate::operator>(upDate d) {
	bool flag = false;
	if (julian() > d.julian())
		flag = true;
	return flag;
}
bool upDate::operator<(upDate d) {
	bool flag = false;
	if (julian() < d.julian())
		flag = true;
	return flag;
}
upDate& upDate::operator=(const upDate& d) {
	pArr[0] = d.pArr[0];
	pArr[1] = d.pArr[1];
	pArr[2] = d.pArr[2];
	return *this;
}
