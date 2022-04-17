/*
Programmer: Aldo Dagio-Ortega
Date: 03/15/2022
*/
#include "myDate.h" // X-code users change this to myDate.hpp
#include <iostream>
#include <iomanip>
#include <cstring>
#include <string>
using namespace std;

struct Movie
{
	char name[100]; // size must be big enough for any title
	int runningTime; // total minutes 
	double rating; // between 1-10
	myDate releaseDate;
	string mainActor;
};

void buildMovies(Movie* mov[]) {

	mov[0] = new Movie;
	mov[1] = new Movie;
	mov[2] = new Movie;
	mov[3] = new Movie;
	mov[4] = new Movie;
	mov[5] = new Movie;
	mov[6] = new Movie;
	mov[7] = new Movie;
	mov[8] = new Movie;
	mov[9] = new Movie;
	// movie titles
	strcpy_s((*mov[0]).name, "Scarface");
	strcpy_s((*mov[1]).name, "Titanic");
	strcpy_s((*mov[2]).name, "The Dark Knight");
	strcpy_s((*mov[3]).name, "Shrek");
	strcpy_s((*mov[4]).name, "Mean Girls");
	strcpy_s((*mov[5]).name, "Superbad");
	strcpy_s((*mov[6]).name, "Rocky");
	strcpy_s((*mov[7]).name, "The Karate Kid");
	strcpy_s((*mov[8]).name, "The Spongebob Squarepants Movie");
	strcpy_s((*mov[9]).name, "I Love You, Man");
	// movie running times 
	(*mov[0]).runningTime = 170; // december 9, 1983
	(*mov[1]).runningTime = 194; // december 19, 1997
	(*mov[2]).runningTime = 152; // release date = july 18 2008 rating = 9.1/10
	(*mov[3]).runningTime = 90; // release date may 18 2001 = rating = 7.9/10
	(*mov[4]).runningTime = 97; // release date april 30 2004 = rating = 7.1 / 10
	(*mov[5]).runningTime = 113; // release date august 17 2007 = rating = 7.6/10
	(*mov[6]).runningTime = 120; // release date december 3 1976 = rating = 8.1/10
	(*mov[7]).runningTime = 126; // release date june 22 1984 = rating = 7.3/10
	(*mov[8]).runningTime = 87; // november 19, 2004
	(*mov[9]).runningTime = 105; // release date march 20 2009 = rating = 7/10
	// ratings 
	(*mov[0]).rating = 8.3;
	(*mov[1]).rating = 7.9;
	(*mov[2]).rating = 9.1;
	(*mov[3]).rating = 7.9;
	(*mov[4]).rating = 7.1;
	(*mov[5]).rating = 7.6;
	(*mov[6]).rating = 8.1;
	(*mov[7]).rating = 7.3;
	(*mov[8]).rating = 7.1;
	(*mov[9]).rating = 7.0;
	// release dates
	(*mov[0]).releaseDate = myDate(12, 9, 1983);
	(*mov[1]).releaseDate = myDate(12, 19, 1997);
	(*mov[2]).releaseDate = myDate(7, 18, 2008);
	(*mov[3]).releaseDate = myDate(5, 18, 2001);
	(*mov[4]).releaseDate = myDate(4, 30, 2004);
	(*mov[5]).releaseDate = myDate(8, 17, 2007);
	(*mov[6]).releaseDate = myDate(12, 3, 1976);
	(*mov[7]).releaseDate = myDate(6, 22, 1984);
	(*mov[8]).releaseDate = myDate(11, 19, 2004);
	(*mov[9]).releaseDate = myDate(3, 20, 2009);
	// main actors
	(*mov[0]).mainActor = "Al Pacino";
	(*mov[1]).mainActor = "Kate Winslet";
	(*mov[2]).mainActor = "Christian Bale";
	(*mov[3]).mainActor = "Mike Myers";
	(*mov[4]).mainActor = "Lindsey Lohan";
	(*mov[5]).mainActor = "Jonah Hill";
	(*mov[6]).mainActor = "Sylvester Stallone";
	(*mov[7]).mainActor = "Ralph Macchio";
	(*mov[8]).mainActor = "Tom Kenny"; //tom kenny
	(*mov[9]).mainActor = "Paul Rudd";

}
void byName(Movie* mov[]) {
	int maxLen = 0;
	buildMovies(mov);
	int min = 0;
	int index = 0;
	for (int i = 0; i < 9; i++) {
		Movie temp;
		min = i;
		for (int j = i + 1; j < 10; j++) {
			if (toupper((*mov[j]).name[0]) < toupper((*mov[min]).name[0])) {
				min = j;
			}
			else if (toupper((*mov[j]).name[0]) == toupper((*mov[min]).name[0])) {
				while (toupper((*mov[j]).name[index]) == toupper((*mov[min]).name[index])) {
					index++;
				}
				if (toupper((*mov[j]).name[index]) < toupper((*mov[min]).name[index])) {
					min = j;
				}
				index = 0;
			}
		}
		temp = *mov[i];
		*mov[i] = *mov[min];
		*mov[min] = temp;
	}
	for (int i = 0; i < 10; i++) {

		if (maxLen < strlen((*mov[i]).name)) {
			maxLen = strlen((*mov[i]).name);
		}
	}
	for (int k = 0; k < 10; k++) {
		int add = 0;
		if (maxLen > strlen((*mov[k]).name))
		{
			add = maxLen - strlen((*mov[k]).name);
		}

		for (int i = 0; i < add; i++) {
			strcat_s((*mov[k]).name, " ");
		}

	}
	for (int j = 0; j < 10; j++) {

		if (j == 0) {
			cout << left << "Name" << right << setw(57) << "Running Time" << right << setw(29) << "IMDB Rating" << right << setw(29) << "Release Date" << right << setw(48)
				<< "Main Actor" << endl	<< "_______________________________"  << right << setw(32) << "______________" << right << setw(28) << "____________" << 
				right << setw(33) << "_________________" << right << setw(51) << "__________________" << endl;
		}
		cout << left << (*mov[j]).name << right << setw(21) << (*mov[j]).runningTime << right << setw(30) << (*mov[j]).rating << right << setw(42) << 
			(*mov[j]).releaseDate.getDate() << right << setw(51) <<	(*mov[j]).mainActor << endl;
	}
}
void byRunningTime(Movie* mov[]) {
	buildMovies(mov);
	int min = 0;
	int maxLen = 0;
	for (int i = 0; i < 9; i++) {
		Movie temp;
		min = i;
		for (int j = i + 1; j < 10; j++) {
			if ((*mov[j]).runningTime < (*mov[min]).runningTime) {
				min = j;
			}
		}
		temp = *mov[i];
		*mov[i] = *mov[min];
		*mov[min] = temp;
	}

	for (int i = 0; i < 10; i++) {

		if (maxLen < strlen((*mov[i]).name)) {
			maxLen = strlen((*mov[i]).name);
		}
	}
	for (int k = 0; k < 10; k++) {
		int add = 0;
		if (maxLen > strlen((*mov[k]).name))
		{
			add = maxLen - strlen((*mov[k]).name);
		}

		for (int i = 0; i < add; i++) {
			strcat_s((*mov[k]).name, " ");
		}

	}
	

	for (int j = 0; j < 10; j++) {

		if (j == 0) {
			cout << left << "Name" << right << setw(51) << "Running Time" << right << setw(29) << "IMDB Rating" << right << setw(29) << "Release Date" << right << setw(27) << "Main Actor" << endl
				<<"_______________________________" << right << setw(24) << "____________"<< right << setw(30) << "____________" << right << setw(33) << "_________________" << right << setw(30) <<
				"__________________" << endl;
		}

		cout << left << (*mov[j]).name << right << setw(15) << (*mov[j]).runningTime << right << setw(30) << (*mov[j]).rating << right << setw(42) << (*mov[j]).releaseDate.getDate() << right << setw(30) <<
			(*mov[j]).mainActor << endl;
	}
}
void byRating(Movie* mov[]) {
	buildMovies(mov);
	int maxLen = 0;
	int min = 0;
	for (int i = 0; i < 9; i++) {
		Movie temp;
		min = i;
		for (int j = i + 1; j < 10; j++) {
			if ((*mov[j]).rating < (*mov[min]).rating) {
				min = j;
			}
		}
		temp = *mov[i];
		*mov[i] = *mov[min];
		*mov[min] = temp;
	}
	for (int i = 0; i < 10; i++) {

		if (maxLen < strlen((*mov[i]).name)) {
			maxLen = strlen((*mov[i]).name);
		}
	}
	for (int k = 0; k < 10; k++) {
		int add = 0;
		if (maxLen > strlen((*mov[k]).name))
		{
			add = maxLen - strlen((*mov[k]).name);
		}

		for (int i = 0; i < add; i++) {
			strcat_s((*mov[k]).name, " ");
		}

	}


	for (int j = 0; j < 10; j++) {

		if (j == 0) {
			cout << left << "Name" << right << setw(51) << "Running Time" << right << setw(29) << "IMDB Rating" << right << setw(29) << "Release Date" << right << setw(27) << "Main Actor" << endl
				<< "_______________________________" << right << setw(24) << "____________" << right << setw(30) << "____________" << right << setw(33) << "_________________" << right << setw(30) <<
				"__________________" << endl;
		}

		cout << left << (*mov[j]).name << right << setw(15) << (*mov[j]).runningTime << right << setw(30) << (*mov[j]).rating << right << setw(42) << (*mov[j]).releaseDate.getDate() << right << setw(30) <<
			(*mov[j]).mainActor << endl;
	}

}
void byReleaseDate(Movie* mov[]) {
	int maxLen = 0;
	buildMovies(mov);
	int min = 0;
	for (int i = 0; i < 9; i++) {
		Movie temp;
		min = i;
		for (int j = i + 1; j < 10; j++) {
			if ((*mov[j]).releaseDate.getYear() < (*mov[min]).releaseDate.getYear()) {
				min = j;
			}
			else if ((*mov[j]).releaseDate.getYear() == (*mov[min]).releaseDate.getYear()) {
				if ((*mov[j]).releaseDate.getMonth() < (*mov[min]).releaseDate.getMonth())
					min = j;
				else if ((*mov[j]).releaseDate.getMonth() == (*mov[min]).releaseDate.getMonth())
					if ((*mov[j]).releaseDate.getDay() < (*mov[min]).releaseDate.getDay())
						min = j;
				}
				
			
		}
		temp = *mov[i];
		*mov[i] = *mov[min];
		*mov[min] = temp;
	}
	for (int i = 0; i < 10; i++) {

		if (maxLen < strlen((*mov[i]).name)) {
			maxLen = strlen((*mov[i]).name);
		}
	}
	for (int k = 0; k < 10; k++) {
		int add = 0;
		if (maxLen > strlen((*mov[k]).name))
		{
			add = maxLen - strlen((*mov[k]).name);
		}

		for (int i = 0; i < add; i++) {
			strcat_s((*mov[k]).name, " ");
		}

	}


	for (int j = 0; j < 10; j++) {

		if (j == 0) {
			cout << left << "Name" << right << setw(51) << "Running Time" << right << setw(29) << "IMDB Rating" << right << setw(29) << "Release Date" << right << setw(27)
				<< "Main Actor" << endl << "_______________________________" << right << setw(24) << "____________" << right << setw(30) << "____________" << right <<
				setw(33) << "_________________" << right << setw(30) << "__________________" << endl;
		}

		cout << left << (*mov[j]).name << right << setw(15) << (*mov[j]).runningTime << right << setw(30) << (*mov[j]).rating << right << setw(42) << 
			(*mov[j]).releaseDate.getDate() << right << setw(30) << (*mov[j]).mainActor << endl;
	}
	
}
void byActor(Movie* mov[]) {
	buildMovies(mov);
	int min = 0;
	int index = 0;
	int maxLen = 0;
	for (int i = 0; i < 9; i++) {
		Movie temp;
		min = i;
		for (int j = i + 1; j < 10; j++) {
			if (toupper((*mov[j]).mainActor[0]) < toupper((*mov[min]).mainActor[0])) {
				min = j;
			}
			else if (toupper((*mov[j]).mainActor[0]) == toupper((*mov[min]).mainActor[0])) {
				while (toupper((*mov[j]).mainActor[index]) == toupper((*mov[min]).mainActor[index])) {
					index++;
				}
				if (toupper((*mov[j]).mainActor[index]) < toupper((*mov[min]).mainActor[index])) {
					min = j;
				}
				index = 0;
			}
		}
		temp = *mov[i];
		*mov[i] = *mov[min];
		*mov[min] = temp;
	}
	for (int i = 0; i < 10; i++) {

		if (maxLen < strlen((*mov[i]).name)) {
			maxLen = strlen((*mov[i]).name);
		}
	}
	for (int k = 0; k < 10; k++) {
		int add = 0;
		if (maxLen > strlen((*mov[k]).name))
		{
			add = maxLen - strlen((*mov[k]).name);
		}

		for (int i = 0; i < add; i++) {
			strcat_s((*mov[k]).name, " ");
		}

	}


	for (int j = 0; j < 10; j++) {

		if (j == 0) {
			cout << left << "Name" << right << setw(51) << "Running Time" << right << setw(29) << "IMDB Rating" << right << setw(29) << "Release Date" << right << setw(27) << "Main Actor" << endl
				<< "_______________________________" << right << setw(24) << "____________" << right << setw(30) << "____________" << right << setw(33) << "_________________" << right << setw(30) <<
				"__________________" << endl;
		}

		cout << left << (*mov[j]).name << right << setw(15) << (*mov[j]).runningTime << right << setw(30) << (*mov[j]).rating << right << setw(42) << (*mov[j]).releaseDate.getDate() << right << setw(30) <<
			(*mov[j]).mainActor << endl;
	}
}

int main() {

	Movie* mov[10];
	int choice = 0;
	do {
		//system("cls");
		cout <<  "1) Display list sorted by Name \n" <<
			"2) Display list sorted by Running Time \n" <<
			"3) Display list sorted by IMDB Rating \n" <<
			"4) Display list sorted by Release Date \n" <<
			"5) Display list sorted by Main Actor \n" <<
			"6) Exit \n";
		cin >> choice;

		if (choice == 1)
			byName(mov);
		else if (choice == 2)
			byRunningTime(mov);
		else if (choice == 3)
			byRating(mov);
		else if (choice == 4)
			byReleaseDate(mov);
		else if (choice == 5)
			byActor(mov);
	}while(choice != 6);
		
	

}
