/*
Programmer: Aldo Dagio-Ortega
Date: 04/12/2022
Description: The main file was created by Master Gold. The top
part of this file is the implementation of the friend functions
and the overloaded ostream operator. The main program demonstrates all
functionalities of the upDate class.
*/
#include "upDate.h"
#include <iostream>
using namespace std;
int upDate::count = 0;
ostream& operator<<(ostream& outs, const upDate& date) {
	outs << date.pArr[0] << "/" << date.pArr[1] << "/" << date.pArr[2];
	return outs;
}
upDate operator+(int i, upDate d) {
	upDate temp(d.julian() + i);
	return temp;
}

int main()
{
	upDate Bday;
	upDate duedate(4, 12, 2022);
	upDate today(duedate);


	cout << endl;
	cout << "Today is " << today << endl;
	cout << "This program is due on " << duedate;
	cout << endl;

	cout << "(3)Right now there are " << upDate::GetDateCount() << " upDate objects\n";
	{
		upDate d1, d2, d3;
		cout << "(6)Inside this block there are " << upDate::GetDateCount() << " upDate objects\n";
	}
	cout << "(3)Outside the block there are " << upDate::GetDateCount() << " upDate objects\n";

	upDate dtemp(duedate);
	dtemp++;
	cout << "If you turn this assignment in on " << dtemp << " then is will be late.\n"; 
	cout << "It is due on " << --dtemp << " so don't be late.\n"; 
	cout << "One week from due date is " << duedate + 7 << endl;
	cout << "One week from due date is " << 7 + duedate << endl; 
	cout << "One week earlier from due date is " << duedate - 7 << endl;

	cout << "Your professor was born on " << Bday << " : ";
	cout << "Master Gold is " << duedate - Bday << " days old today\n";

	cout << "Today is Julian date " << duedate.julian() << endl;;
	cout << "Tomorrrow is Julian date " << (++duedate).julian() << endl;;

	cout << "The very first Julian date was " << upDate(10, 2, 2021) - upDate(11, 2, 2021).julian() << endl;

	cout << "The very first Julian date was " << today - today.julian() << endl;


	upDate yesterday, tomorrow;
	yesterday = today - 1;
	tomorrow = today + 1;

	cout << "Yesterday was " << yesterday << endl;
	cout << "Today is " << today << endl;
	cout << "Tomorrow is " << tomorrow << endl;

	cout << "Today is ";
	cout << ((today > tomorrow) ? "greater than" : "not greater than");
	cout << " than tomorrow\n";

	cout << "Today is ";
	cout << ((today < tomorrow) ? "less than" : "not less than");
	cout << " than tomorrow\n";

	cout << "Today is ";
	cout << ((today == tomorrow) ? "equal to" : "not equal to");
	cout << " tomorrow\n";

	getchar();
	return 0;
}




/*int main() {

	upDate D1(10,27,2010);
	cout << D1 << endl;
	upDate D2(D1);
	upDate D3 = D2;
	upDate D4, D5;
	D1 = D2;
	cout << D1 << endl;
	D1 += 5;
	cout << D1 << endl;
	D1 -= 7;
	D5 = D2 + 5;
	cout << D3 << endl;
	D3 = 5 + D2;
	D4 = D2 - 4;
	cout << D3 << endl;
	int x = D5 - D4;
	cout << x << endl;
	cout << upDate::GetDateCount() << endl;
	cout << D1 << endl;
	D1++;
	++D1;
	D1--;
	--D1;
	cout << D1.julian() << endl;
	cout << D1 << endl;
	if (D1 == D2) {
		cout << "D1 == D2";
	}
	else if (D1 < D2) {
		cout << "D1 < D2";
	}
	else if (D1 > D2) {
		cout << "D1 > D2";
	}
}*/