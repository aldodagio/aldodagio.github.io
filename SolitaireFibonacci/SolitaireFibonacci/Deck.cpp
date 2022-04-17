/*
Programmer: Aldo Dagio-Ortega
Date: 02/14/2022
Description: The deck class uses its default constructor
to instantiate every card in the 52 card deck. It also 
defines all the behaviors the deck can perform, such as 
shuffle and deal. 
*/

#include "Deck.h"
#include "iostream"
using namespace std;

Deck::Deck() {
	topCard = 0;
	myDeck[0] = Card('S','A');
	myDeck[1] = Card('S', '2');
	myDeck[2] = Card('S', '3');
	myDeck[3] = Card('S', '4');
	myDeck[4] = Card('S', '5');
	myDeck[5] = Card('S', '6');
	myDeck[6] = Card('S', '7');
	myDeck[7] = Card('S', '8');
	myDeck[8] = Card('S', '9');
	myDeck[9] = Card('S', '0');
	myDeck[10] = Card('S', 'J');
	myDeck[11] = Card('S', 'Q');
	myDeck[12] = Card('S', 'K');

	myDeck[13] = Card('H', 'A');
	myDeck[14] = Card('H', '2');
	myDeck[15] = Card('H', '3');
	myDeck[16] = Card('H', '4');
	myDeck[17] = Card('H', '5');
	myDeck[18] = Card('H', '6');
	myDeck[19] = Card('H', '7');
	myDeck[20] = Card('H', '8');
	myDeck[21] = Card('H', '9');
	myDeck[22] = Card('H', '0');
	myDeck[23] = Card('H', 'J');
	myDeck[24] = Card('H', 'Q');
	myDeck[25] = Card('H', 'K');

	myDeck[26] = Card('D', 'A');
	myDeck[27] = Card('D', '2');
	myDeck[28] = Card('D', '3');
	myDeck[29] = Card('D', '4');
	myDeck[30] = Card('D', '5');
	myDeck[31] = Card('D', '6');
	myDeck[32] = Card('D', '7');
	myDeck[33] = Card('D', '8');
	myDeck[34] = Card('D', '9');
	myDeck[35] = Card('D', '0');
	myDeck[36] = Card('D', 'J');
	myDeck[37] = Card('D', 'Q');
	myDeck[38] = Card('D', 'K');

	myDeck[39] = Card('C', 'A');
	myDeck[40] = Card('C', '2');
	myDeck[41] = Card('C', '3');
	myDeck[42] = Card('C', '4');
	myDeck[43] = Card('C', '5');
	myDeck[44] = Card('C', '6');
	myDeck[45] = Card('C', '7');
	myDeck[46] = Card('C', '8');
	myDeck[47] = Card('C', '9');
	myDeck[48] = Card('C', '0');
	myDeck[49] = Card('C', 'J');
	myDeck[50] = Card('C', 'Q');
	myDeck[51] = Card('C', 'K');
}
void Deck::refreshDeck() {
	topCard = 0;
	Deck newDeck;
	for (int i = 0; i < 52; i++)
	myDeck[i] = newDeck.myDeck[i];
}
Card Deck::deal() {
	return myDeck[topCard++];
}
void Deck::shuffle() {
	for (int i = 0; i < 1000; i++) {
		int x = rand() % 52;
		int y = rand() % 52;

		Card temp = myDeck[x];
		myDeck[x] = myDeck[y];
		myDeck[y] = temp;
	}
}
bool Deck::isEmpty() {
	if (topCard == 52)
		return true;
	else
		return false;
}
void Deck::display() {
	for (int i = 0; i < 52; i++)
		if (i >= 0 && i < 13) {
			myDeck[i].display();
			cout << " ";
		}
		else if (i >= 13 && i < 26) {
			if (i == 13) {
				cout << endl;
			}
			myDeck[i].display();
			cout << " ";
		}
		else if (i >= 26 && i < 39) {
			if (i == 26) {
				cout << endl;
			}
			myDeck[i].display();
			cout << " ";
		}
		else if (i >= 39 && i < 52) {
			if (i == 39) {
				cout << endl;
			}
			myDeck[i].display();
			cout << " ";
		}
}