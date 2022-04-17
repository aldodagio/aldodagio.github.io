/* 
 * @author: Aldo Dagio-Ortega
 * Description: This program is designed to take the number of students in a class and store their
 * 5 individual test scores in a two dimensional array, where it is then summed up (after dropping the lowest
 * and highest grade) and divided by a fixed number of three, to find out the average score for said student. 
 * These capabilities are possible through a number of functions, such as findLowest to find the lowest grade, 
 * findHighest to find the highest grade, getStudentInfo to fetch data, calcScore to get the averages and 
 * print which prints the scores in a nice, formatted manner. 
 * Date: 09/13/2021
 * @version: 1
*/

package week1Day1;

import java.util.Scanner;

public class project2 {
	
	static Scanner input = new Scanner(System.in);
	static int numStudents;
	static String[] names;
	static int[][] scores;
	static double[] res;
	
	// getStudentInfo fetches all the necessary data from the user and stores names
	// in a single dimensional array, while storing the scores for those individuals 
	// in a two dimensional array. 
	public static void getStudentInfo() {
		System.out.println("How many students do you have in your class?");
		numStudents = input.nextInt();
		names = new String[numStudents];
		scores = new int[5][names.length];
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Please enter student last name: ");
			String lastName = input.next();
			lastName.substring(0, 1).toUpperCase();
			System.out.println("Please enter student first name: ");
			String firstName = input.next();
			firstName.substring(0, 1).toUpperCase();
			names[i] = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()) + " " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length());
		}
		for(int j = 0; j < names.length; j++)
		{
			for(int k = 0; k < scores.length; k++)
			{
			System.out.println("What was the score for " + names[j] + " on exam #" + (k+1));
			scores[k][j] = validateUserInput(input.nextInt());
			
			
			}
		}	
	}
	// validateUserInput ensures the score entered by the user is within the boundaries of 0 and 100.
	public static int validateUserInput(int score) {
		if(score > 100 || score < 0) {
			System.out.println("The value you entered is out of bounds for test scores. \n"
					+ "Please enter an integer value between 0 and 100 for each exam. ");
			score = input.nextInt();
		}
		return score;
	}
	// findLowest takes two parameters to find the min value within
	// an individual students test scores. 
	public static int findLowest(int[][] scores, int i) {
		int min = 100;
		
		for(int j = 0; j < scores.length; j++)
		{
			if(scores[j][i] <= min)
			{
				min = scores[j][i];
			}
		}
		
		
		return min;
		
	}
	// findHighest takes two parameters to find the max value within
	// an individual students test scores. 
	public static int findHighest(int[][] scores, int i) {
		int max = 0;
		
		for(int j = 0; j < scores.length; j++)
		{
			if(scores[j][i] >= max)
			{
				max = scores[j][i];
			}
		}
		
		
		return max;
		
	}
	// calcScore calculates the average of the three test scores used, by adding all five test scores and then 
	// subtracting the min and max from the sum and dividing it by the fixed number of tests used to calculate average
	// (3). Finally, it uses an array to store the averages for each individual student. 
	public static double[] calcScore(int[][] scores) {
		
		
			res= new double[names.length];
			for(int i = 0; i < names.length; i++) { 
			for(int j = 0; j < scores.length; j++)
			{
				res[i] += scores[j][i];
			}
			
			res[i] = res[i] - (findLowest(scores, i)+findHighest(scores, i));
			res[i] = res[i] / 3;
			
			}
		
		
			return res;
		
	}
	
	// The print function prints out the names and scores of the students, followed by the average.
	public static void print() {
		
		System.out.print("student Name ex1 | ex2 | ex3 | ex4 | ex5 | average \n"
				+ "=========================================================== \n");
		for(int i = 0; i < numStudents; i++) {
			System.out.printf(names[i], "%3s");
			for(int j = 0; j < scores.length; j++)
			{
				System.out.printf("%6d", scores[j][i]);
			}
			res = calcScore(scores);
			System.out.printf("     %.1f",res[i]);
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {

		getStudentInfo();
		print();
	
	}

}
