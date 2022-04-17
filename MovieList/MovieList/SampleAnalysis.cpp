/*Programmer: Aldo Dagio-Ortega
Date: 03/26/2022
Description: This program reads in the file "ccases.csv" from the following source:
Horwood, Anglim, J., & Mallawaarachchi, S. R. (2021). Problematic smartphone use in a large nationally representative
	sample: Age, reporting biases, and technology concerns. Computers in Human Behavior, 122. 
	https://doi.org/10.1016/j.chb.2021.106848.
The program then calculates averages for certain staistics found in the file and taken from the sample.
*/

#include <iostream>
#include <fstream>
#include <vector>
#include <string>

#include <sstream>
using namespace std;
int main() {

	fstream fin;

	fin.open("ccases.csv", ios::in);

	vector<string> row;
	vector<string> ageGroups;
	vector<int> age;
	vector<double> prob;
	vector<double> femaleObjRatings;
	vector<double> maleObjRatings;
	vector<double> femaleObjRatings1;
	vector<double> maleObjRatings1;
	vector<double> femaleObjRatings2;
	vector<double> maleObjRatings2;
	vector<double> femaleObjRatings3;
	vector<double> maleObjRatings3;
	vector<double> femaleObjRatings4;
	vector<double> maleObjRatings4;
	vector<double> femaleObjRatings5;
	vector<double> maleObjRatings5;
	string line, word, temp;
	int i = 0;
	int max = 0;
	double max1 = 0;
	int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0; // 18-24, 25-34, 35-44, 45-54,55-64,65-120
	int count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0;
	int count12 = 0, count13 = 0, count14 = 0, count15 = 0, count16 = 0, count17 = 0;
	int count18 = 0, count19 = 0, count20 = 0, count21 = 0, count22 = 0, count23 = 0;
	int count24 = 0, count25 = 0, count26 = 0, count27 = 0, count28 = 0, count29 = 0;
	int count30 = 0, count31 = 0, count32 = 0, count33 = 0, count34 = 0, count35 = 0;

	while (fin >> temp) {
		row.clear();

		getline(fin, line);

		stringstream s(temp);

		while (getline(s, word, ',')) {
			row.push_back(word);
		}
		stringstream s1(line);
		while (getline(s1, word, ',')) {
			row.push_back(word);
		}
		if (!row.empty()) {

			if (i != 0) {
				cout << row[88] << "\n";
				age.push_back(stoi(row[3]));
				prob.push_back(stod(row[88]));

				if (row[4] == "\"18-24\"") {
					ageGroups.push_back(row[4]);
					count++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings.push_back(stod(row[74]));
						if (stoi(row[22]) == 1)
							count6++;
						else if (stoi(row[22]) == 2)
							count7++;
						else if (stoi(row[22]) == 3)
							count8++;
						else if (stoi(row[22]) == 4)
							count9++;
						else if (stoi(row[22]) == 5)
							count10++;
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings.push_back(stod(row[74]));
						if (stoi(row[22]) == 1)
							count11++;
						else if (stoi(row[22]) == 2)
							count12++;
						else if (stoi(row[22]) == 3)
							count13++;
						else if (stoi(row[22]) == 4)
							count14++;
						else if (stoi(row[22]) == 5)
							count15++;
					}
				}
				else if (row[4] == "\"25-34\"") {
					ageGroups.push_back(row[4]);
					count1++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings1.push_back(stod(row[74]));
						if (stoi(row[22]) == 1)
							count11++;
						else if (stoi(row[22]) == 2)
							count12++;
						else if (stoi(row[22]) == 3)
							count13++;
						else if (stoi(row[22]) == 4)
							count14++;
						else if (stoi(row[22]) == 5)
							count15++;
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings1.push_back(stod(row[74]));
					}
				}
				else if (row[4] == "\"35-44\"") {
					ageGroups.push_back(row[4]);
					count2++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings2.push_back(stod(row[74]));
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings2.push_back(stod(row[74]));
					}
				}
				else if (row[4] == "\"45-54\"") {
					ageGroups.push_back(row[4]);
					count3++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings3.push_back(stod(row[74]));
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings3.push_back(stod(row[74]));
					}
				}
				else if (row[4] == "\"55-64\"") {
					ageGroups.push_back(row[4]);
					count4++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings4.push_back(stod(row[74]));
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings4.push_back(stod(row[74]));
					}
				}
				else if (row[4] == "\"65-120\"") {
					ageGroups.push_back(row[4]);
					count5++;
					if (row[2] == "\"Female\"")
					{
						if (row.size() >= 47)
							femaleObjRatings5.push_back(stod(row[74]));
					}
					if (row[2] == "\"Male\"")
					{
						if (row.size() >= 47)
							maleObjRatings5.push_back(stod(row[74]));
					}
				}

			}
			i++;
		}

	}
	for (int i = 0; i < age.size(); i++) {

		if (max < age[i]) {
			max = age[i];
		}
	}
	for (int i = 0; i < prob.size(); i++) {

		if (max1 < prob[i]) {
			max1 = prob[i];
		}
	}
	cout << "Max integer found: " << max << endl;
	cout << "Max PSU found: " << max1 << endl;
	double sum = count + count1 + count2 + count3 + count4 + count5;
	double q = 0;
	q = count / sum;
	cout << "Percent of participants age 18-24: %" << q * 100 << endl;
	q = count1 / sum;
	cout << "Percent of participants age 25-34: %" << q * 100 << endl;
	q = count2 / sum;
	cout << "Percent of participants age 35-44: %" << q * 100 << endl;
	q = count3 / sum;
	cout << "Percent of participants age 45-54: %" << q * 100 << endl;
	q = count4 / sum;
	cout << "Percent of participants age 55-64: %" << q * 100 << endl;
	q = count5 / sum;
	cout << "Percent of participants age 65+: %" << q * 100 << endl;
	double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0, sum10 = 0, sum11 = 0, sum12 = 0;
	for (int i = 0; i < femaleObjRatings.size(); i++) {

		sum1 += femaleObjRatings[i];

	}
	for (int i = 0; i < maleObjRatings.size(); i++) {

		sum2 += maleObjRatings[i];

	}
	for (int i = 0; i < femaleObjRatings1.size(); i++) {

		sum3 += femaleObjRatings1[i];

	}
	for (int i = 0; i < maleObjRatings1.size(); i++) {

		sum4 += maleObjRatings1[i];

	}
	for (int i = 0; i < femaleObjRatings2.size(); i++) {

		sum5 += femaleObjRatings2[i];

	}
	for (int i = 0; i < maleObjRatings2.size(); i++) {

		sum6 += maleObjRatings2[i];

	}
	for (int i = 0; i < femaleObjRatings3.size(); i++) {

		sum7 += femaleObjRatings3[i];

	}
	for (int i = 0; i < maleObjRatings3.size(); i++) {

		sum8 += maleObjRatings3[i];

	}
	for (int i = 0; i < femaleObjRatings4.size(); i++) {

		sum9 += femaleObjRatings4[i];

	}
	for (int i = 0; i < maleObjRatings4.size(); i++) {

		sum10 += maleObjRatings4[i];

	}
	for (int i = 0; i < femaleObjRatings5.size(); i++) {

		sum11 += femaleObjRatings5[i];

	}
	for (int i = 0; i < maleObjRatings5.size(); i++) {

		sum12 += maleObjRatings5[i];

	}
	double avg = sum1 / femaleObjRatings.size();
	double avg1 = sum2 / maleObjRatings.size();
	double avg2 = sum3 / femaleObjRatings1.size();
	double avg3 = sum4 / maleObjRatings1.size();
	double avg4 = sum5 / femaleObjRatings2.size();
	double avg5 = sum6 / maleObjRatings2.size();
	double avg6 = sum7 / femaleObjRatings3.size();
	double avg7 = sum8 / maleObjRatings3.size();
	double avg8 = sum9 / femaleObjRatings4.size();
	double avg9 = sum10 / maleObjRatings4.size();
	double avg10 = sum11 / femaleObjRatings5.size();
	double avg11 = sum12 / maleObjRatings5.size();
	cout << "Female average objective screen time (ages 18-24) in minutes: " << avg << "\n" <<
		"Male average objective screen time (ages 18-24) in minutes: " << avg1 << "\n";
	cout << "Female average objective screen time (ages 25-34) in minutes: " << avg2 << "\n" <<
		"Male average objective screen time (ages 25-34) in minutes: " << avg3 << "\n";
	cout << "Female average objective screen time (ages 35-44) in minutes: " << avg4 << "\n" <<
		"Male average objective screen time (ages 35-44) in minutes: " << avg5 << "\n";
	cout << "Female average objective screen time (ages 45-54) in minutes: " << avg6 << "\n" <<
		"Male average objective screen time (ages 45-54) in minutes: " << avg7 << "\n";
	cout << "Female average objective screen time (ages 55-64) in minutes: " << avg8 << "\n" <<
		"Male average objective screen time (ages 55-64) in minutes: " << avg9 << "\n";
	cout << "Female average objective screen time (ages 65+) in minutes: " << avg10 << "\n" <<
		"Male average objective screen time (ages 65+) in minutes: " << avg11 << "\n";
}