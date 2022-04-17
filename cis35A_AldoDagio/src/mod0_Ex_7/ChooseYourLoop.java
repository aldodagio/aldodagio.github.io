// CIS35A - Aldo Dagio
// Description - this program demonstrates basic loop instructions in a switch menu.

package mod0_Ex_7;

import java.util.Scanner;

public class ChooseYourLoop
{
	static public void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a message: ");
		String message = input.nextLine();
		System.out.println("How many times do you want to loop?");
		int loop = input.nextInt();
		System.out.println("There are three different types of loops: ");
		System.out.println("1 - While ");
		System.out.println("2 - Do-While ");
		System.out.println("3 - For ");
		System.out.println("Enter the corresponding # of the loop you want: ");
		int count = input.nextInt();
		
		switch(count)
		{
		case 1:	
			
			System.out.println("Invoking while loop...");
		int num = 0;
		while(num < loop)
		{
			System.out.println(num+1 + "=> " + message);
			num++;
		}
		break;
		
		case 2:
			
			System.out.println("Invoking do-while loop...");
		int num1 = 0;
		do {
			System.out.println(num1+1 + "=> " + message);
			num1++;
			}while(num1 < loop);
		break;
		
		case 3: 
			
			System.out.println("Invoking for loop...");
		for(int num2 = 0; num2 < loop; num2++)
		{
			System.out.println(num2+1 + "=> " + message);	
		}
		break;
		
		default:System.out.println("Invalid user input. Try again."); 
		
		}
		
		input.close();
	}
}


/*
Sample 1: 
Enter a message: 
Welcome to Java!
How many times do you want to loop?
14
There are three different types of loops: 
1 - While 
2 - Do-While 
3 - For 
Enter the corresponding # of the loop you want: 
1
Invoking while loop...
1=> Welcome to Java!
2=> Welcome to Java!
3=> Welcome to Java!
4=> Welcome to Java!
5=> Welcome to Java!
6=> Welcome to Java!
7=> Welcome to Java!
8=> Welcome to Java!
9=> Welcome to Java!
10=> Welcome to Java!
11=> Welcome to Java!
12=> Welcome to Java!
13=> Welcome to Java!
14=> Welcome to Java!

Sample 2:
Enter a message: 
testing loops...
How many times do you want to loop?
4
There are three different types of loops: 
1 - While 
2 - Do-While 
3 - For 
Enter the corresponding # of the loop you want: 
2
Invoking do-while loop...
1=> testing loops...
2=> testing loops...
3=> testing loops...
4=> testing loops...

Sample 3: 
Enter a message: 
final testing
How many times do you want to loop?
1
There are three different types of loops: 
1 - While 
2 - Do-While 
3 - For 
Enter the corresponding # of the loop you want: 
3
Invoking for loop...
1=> final testing
*/