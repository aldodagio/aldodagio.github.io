// CIS35A - Aldo Dagio
// Description - this program demonstrates basic array data manipulation and the use of methods. 

package mod1_Exercise1;

import java.util.Scanner;

public class Gpa {

	static public void main(String[] args)
	{
		int scores, highScore, temp = 016;
		double average;
		int[] storeArr = null; 
		Scanner input = new Scanner(System.in);
		System.out.println("How many scores do you want to enter? ");
		scores = input.nextInt();
		storeArr = new int[scores];
		
		for(int i = 0; i < storeArr.length; i++)
		{
			System.out.println("Enter your score for the quarter: ");
			temp = input.nextInt();
			storeArr[i] = temp;
		}
		
		highScore = max(storeArr);
		average = avg(storeArr);
		System.out.println("Your best score of the ones you entered is: " + highScore);
		System.out.println("Your average score is: " + average);
		print(average);
		
		input.close();
	}
	
	public static int max(int[] userArr)
	{
		
		int max = userArr[0];
		for(int i = 0; i < userArr.length; i++)
		{
			if(userArr[i] > max)
				max = userArr[i];
		}
		
		return max;
	}
	
	public static double avg(int[] userArr)
	{
		double sum = 0;
		for(int i = 0; i < userArr.length; i++)
		{
			sum += userArr[i];
		}
		return sum/userArr.length;
	}
	
	public static void print(double avg)
	{
		if (avg >= 90.0)
			System.out.println("Your score gets you a letter grade of A! Congrats!");
		else if(avg >= 80.0)System.out.println("Your score gets you a letter grade of B! Congrats!");
		else if(avg >= 70.0)System.out.println("Your score gets you a letter grade of C! Congrats!");
		else if(avg >= 60.0)System.out.println("Your score gets you a letter grade of D! Congrats!");
		else System.out.println("Your score gets you a letter grade of F! Congrats!");
	}
}

/*
Sample 1:
How many scores do you want to enter? 
3
Enter your score for the quarter: 
80
Enter your score for the quarter: 
85
Enter your score for the quarter: 
90
Your best score of the ones you entered is: 90
Your average score is: 85.0
Your score gets you a letter grade of B! Congrats!

Sample 2: 
How many scores do you want to enter? 
12
Enter your score for the quarter: 
15
Enter your score for the quarter: 
78
Enter your score for the quarter: 
23
Enter your score for the quarter: 
96
Enter your score for the quarter: 
44
Enter your score for the quarter: 
25
Enter your score for the quarter: 
67
Enter your score for the quarter: 
42
Enter your score for the quarter: 
36
Enter your score for the quarter: 
77
Enter your score for the quarter: 
45
Enter your score for the quarter: 
33
Your best score of the ones you entered is: 96
Your average score is: 48.416666666666664
Your score gets you a letter grade of F! Congrats!
*/