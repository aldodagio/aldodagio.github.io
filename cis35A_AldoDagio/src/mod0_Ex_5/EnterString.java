// CIS35A - Aldo Dagio
// Description: This program takes a string input and uses different methods to 
//              access and format the string.


package mod0_Ex_5;

import java.util.Scanner;

public class EnterString 
{

	static public void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a string of characters: ");
			String myString = input.nextLine();
			System.out.println("String w/out any white spaces: " + myString.trim());
			System.out.println("Length of string: " + myString.length());
			System.out.println("String in all caps: " + myString.toUpperCase());
			System.out.println("First character of the string is: " + myString.charAt(0));
			System.out.println("Your input was " + myString);
			input.close();
		}
	
}

/*
Sample 1:
Enter a string of characters: 
              what the heck                  
String w/out any white spaces: what the heck
Length of string: 45
String in all caps:               WHAT THE HECK                  
First character of the string is:  
Your input was               what the heck    

Sample 2:
Enter a string of characters: 
i am the man                                
String w/out any white spaces: i am the man
Length of string: 44
String in all caps: I AM THE MAN                                
First character of the string is: i
Your input was i am the man   

*/