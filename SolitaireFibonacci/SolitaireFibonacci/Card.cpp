/*
Programmer: Aldo Dagio-Ortega
Date: 02/14/2022
Description: The card class uses its overloaded
constructor to set the card, while assuring the
rank and suit are both capitalized. It also 
defines functions such as getValue and the display 
function. 
*/
#include "Card.h"
#include <cctype>
#include <iostream>
using namespace std;

Card::Card() {
	faceDown = true;
}
Card::Card(char s, char r) {
	faceDown = false;
	if(isalpha(s))
		suit = toupper(s);
	if (isalpha(r))
		rank = toupper(r);
	else
		rank = r;
}
void Card::setCard(char s, char r) {
	faceDown = false;
	if (isalpha(s))
		suit = toupper(s);
	if (isalpha(r))
		rank = toupper(r);
	else
		rank = r;
}
int Card::getValue() {
	if (rank == 'A')
		return 1;
	else if (rank == '2')
		return 2;
	else if (rank == '3')
		return 3;
	else if (rank == '4')
		return 4;
	else if (rank == '5')
		return 5;
	else if (rank == '6')
		return 6;
	else if (rank == '7')
		return 7;
	else if (rank == '8')
		return 8;
	else if (rank == '9')
		return 9;
	else if (rank == '0')
		return 10;
	else if (rank == 'J')
		return 10;
	else if (rank == 'Q')
		return 10;
	else if (rank == 'K')
		return 10;
}
void Card::display() {
	if (rank == '0') {
		cout << "1";
		cout << rank << suit << ",";
	}
	else
	cout << rank << suit << ",";
}