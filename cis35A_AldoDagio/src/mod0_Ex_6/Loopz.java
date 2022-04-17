// CIS35A - Aldo Dagio
// Description: This program demonstrates the while, do-while and for loop.

package mod0_Ex_6;

import java.util.Scanner;

public class Loopz 
{

	static public void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a message: ");
		String message = input.next();
		System.out.println("How many times do you want to loop?");
		int count = input.nextInt();
		int num = 0;
		while(num < count)
		{
			System.out.println(num+1 + "=> " + message);
			num++;
		}
		
	
		System.out.println("Enter a message: ");
		String message1 = input.next();
		System.out.println("How many times do you want to loop?");
		int count1 = input.nextInt();
		int num1 = 05;
		
		do 
		{
			System.out.println(num1+1 + "=> " + message1);
			num1++;
		}while(num1 < count1);
		
		System.out.println("Enter a message: ");
		String message2 = input.next();
		System.out.println("How many times do you want to loop?");
		int count2 = input.nextInt();
		for(int num2 = 0; num2 < count2; num2++)
		{
			System.out.println(num2+1 + "=> " + message2);	
		}
		
		input.close();
	}
	
}

/*
Sample 1:
Enter a message: 
hi
How many times do you want to loop?
5
1=> hi
2=> hi
3=> hi
4=> hi
5=> hi
Enter a message: 
hey
How many times do you want to loop?
6
1=> hey
2=> hey
3=> hey
4=> hey
5=> hey
6=> hey
Enter a message: 
hello
How many times do you want to loop?
7
1=> hello
2=> hello
3=> hello
4=> hello
5=> hello
6=> hello
7=> hello

Sample 2:
Enter a message: 
trying
How many times do you want to loop?
3
1=> trying
2=> trying
3=> trying
Enter a message: 
out
How many times do you want to loop?
6
1=> out
2=> out
3=> out
4=> out
5=> out
6=> out
Enter a message: 
loops
How many times do you want to loop?
9
1=> loops
2=> loops
3=> loops
4=> loops
5=> loops
6=> loops
7=> loops
8=> loops
9=> loops
*/

