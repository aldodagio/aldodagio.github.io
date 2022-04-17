#ifndef DECK_H
#define DECK_H
#include "Card.h"

class Deck {
private:
	Card myDeck[52]; // Array of 52 Cards
	int topCard; // first index in deck is 0. Therefore, top card should be 0.
public:
	Deck(); // default deck constructor
	void refreshDeck(); // if deck is in use, this function resets the deck
	Card deal(); // deals a card 
	void shuffle(); // shuffles the deck 
	bool isEmpty(); // is the deck empty?
	void display(); // display all cards in deck
};
#endif