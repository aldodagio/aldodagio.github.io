package discreteMath;

import java.util.Scanner;

public class uniqueFactorization {
	
		public static void main(String[] args) {
			
			int num = 0;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a number for prime factorization: ");
			num = input.nextInt();
			
			
				for(int i = 2; num > i; i++) { // starting with i = 2
											
					while(num % i == 0) // checking if i | num 
					{
						System.out.println(i + ""); 
						num /= i;		// keep dividing num by i
					}
				}
				if (num > 1)	// if num has a value, print it because it is a part of the factorization
				{
					System.out.println(num);
				}
				
		}
	}
