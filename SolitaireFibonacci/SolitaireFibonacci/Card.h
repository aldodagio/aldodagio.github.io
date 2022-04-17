#ifndef CARD_H
#define CARD_H

class Card {
private:
	char suit; // suit can be S, H, C, D
	char rank; // rank can be A-K
	bool faceDown; // is it face up or face down? 
public:
	Card(); // default constructor
	Card(char, char); // overloaded constructor where card attributes can be initialized
	void setCard(char, char); // card attributes can be set using this function
	int getValue(); // what is the card value based on rank? 
	void display(); // display the card attributes
};

#endif 