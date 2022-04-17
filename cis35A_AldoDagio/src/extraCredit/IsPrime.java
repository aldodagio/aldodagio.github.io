// CIS35A - Aldo Dagio
// Description - This program checks to see if a number is prime or not.

package extraCredit;

import java.util.Scanner;

public class IsPrime 
{
	static public void main(String[] args)
	{
		Scanner input = new Scanner(System.in);			// take in user input
		System.out.println("Enter a number: ");			// prompt user for an integer
		int num = input.nextInt();	// store the input into the integer variable num
		int temp = num;
		
		for(int j = 0; j< num; j++)
		{
		if(isPrime(temp))								// checking if num is Prime
			System.out.print(temp +" ");
		temp--;
		}
		
		input.close();
	}
	
	static boolean isPrime(int num)		// function isPrime that takes an integer as an argument
	{	
        if (num <= 1) 
            return false; 
  
        for (int i = 2; i < num; i++) 
        {
        	if (num % i == 0) 
                return false; 
        }
        return true; 
	}
}

/*
Sample 1:
Enter a number: 
7
prime 

Sample 2: 
Enter a number: 
8
not prime

Sample 3:
Enter a number: 
17
prime
 */
