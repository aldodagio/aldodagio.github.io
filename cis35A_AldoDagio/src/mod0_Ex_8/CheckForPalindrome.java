// CIS35A - Aldo Dagio
// Description: This program uses a boolean function to check if a string is a palindrome 
//				or not.

package mod0_Ex_8;

import java.util.Scanner;

public class CheckForPalindrome 
{
	static public void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to check if it is a palindrome or not: ");
		String message = input.nextLine();
		
		if(isPalindrome(message))
			System.out.println(message + " is palindrome.");
		else 
			System.out.println(message + " is not palindrome.");
		
		input.close();
	}
	
	static boolean isPalindrome(String message)
	{
		int i = 0, j = message.length()-1;
			while(i < j)
			{
				if(message.charAt(i) != message.charAt(j))
					return false;
						i++;
						j--;
			}
			return true;
	}
}

/*
Sample 1:
Enter a word to check if it is a palindrome or not: 
dad
dad is palindrome.

Sample 2: 
Enter a word to check if it is a palindrome or not: 
Java
Java is not palindrome.

Sample 3: 
Enter a word to check if it is a palindrome or not: 
yaaaaaaaaaaaaaaaaaaaaaaay
yaaaaaaaaaaaaaaaaaaaaaaay is palindrome.
*/
