/*
Programmer: Aldo Dagio-Ortega
Date: 02/14/2022
Description: Solitaire game based on the Fibonacci number sequence. 
The main function handles user input and displays a menu to the console
to complete the desired behavior. The user can choose to create a new deck, 
display the deck, shuffle the deck, play the game or exit. If the user does
not choose one of these options, a prompt will be displayed reminding the 
user to check their input. A combination of loops and if-else statements 
check every scenario for winners and losers. 
*/

#include <iostream>
#include <string>
#include "Card.h"
#include "Deck.h"
#include <time.h>
using namespace std;


int main(){
	srand(time(NULL));
	int choice;
	int numGames = 0;
	bool winner = NULL;
	do
	{ 
		cout << "\nWelcome to Fibonacci Solitaire!\n"
			<< "1) New Deck\n"
			<< "2) Display Deck\n"
			<< "3) Shuffle Deck\n"
			<< "4) Play Solitaire\n"
			<< "5) Exit\n";
		cin >> choice;
		if (choice == 1) {
			Deck newDeck;
			newDeck.display();
		}
	    else if (choice == 2) {
		Deck newDeck;
		newDeck.display();
	}
		 else if (choice == 3) {
			Deck newDeck;
			newDeck.shuffle();
			newDeck.display();
	}
		 else 	if (choice == 4)
	{
			if(winner == true)
				numGames = 0;
			winner = NULL;
			cout << "Playing Fibonacci Solitaire !!!\n";
			if(winner != true) {
				int sum = 0;
				int index = 0;
				int piles = 1;
				Deck newDeck;
				newDeck.refreshDeck();
				newDeck.shuffle();
				while (!newDeck.isEmpty()) {
					Card newCard = newDeck.deal();
					if (newCard.getValue() == 0 || newCard.getValue() == 1 || newCard.getValue() == 2 || newCard.getValue() == 3 || newCard.getValue() == 5 || newCard.getValue() == 8)
					{
						newCard.display();
						sum += newCard.getValue();
						if (sum == 1 || sum == 2 || sum == 3 || sum == 5 || sum == 8) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 13) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 21) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 34)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 55) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 89)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 144)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 233)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
					}
					else {
						newCard.display();
						sum += newCard.getValue();
						if (sum == 13) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 21) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 34)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 55) {
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 89)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 144)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
						else if (sum == 233)
						{
							if (index == 51) {
								cout << "Winner in " << piles << " piles! " << "\n";
								winner = true;
								cout << "games played:" << numGames << "\n";
							}
							else {
								cout << "Fibo: " << sum << "\n";
								sum = 0;
								piles++;
							}
						}
					}
					if (index == 51) {
						if (sum != 1 && sum != 2 && sum != 3 && sum != 5 && sum != 8 && sum != 13 && sum != 21 && sum != 34 && sum != 55 && sum != 89 && sum != 144 && sum != 233)
						{
							cout << "Last hand value: " << sum << "\n";
							cout << "Loser in " << piles << " piles! " << "\n";
							winner = false;
						}
					}
					index++;
				}
				numGames++;
			}
		}
		else if (choice > 5 || choice < 1)
		cout << "Please enter a number 1-5 from the menu." << "\n";
	}while (choice != 5);
}