// CIS35A - Aldo Dagio
// Description: This program uses arithmetic to calculate the pay for someone who 
//              has or hasn't worked over time. 

package mod0_Ex_4;

import java.util.Scanner;

public class WorkPay {
	
	static public void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int hours = 0;
		double rate = 0, pay = 0; 
		
		System.out.println("Enter Hours: ");
		hours = input.nextInt();
		System.out.println("Enter Rate: ");
		rate = input.nextDouble();
		
		if(hours > 40)
		{
			double ot;
			pay = rate*40;
			hours = hours-40;
			ot = hours*rate*1.5;
			pay = pay+ot;
				System.out.println("Your pay is $" + pay);
		}
		else
				System.out.println("Your pay is $" + rate*hours);
		
		
		input.close();
		
	}

}


/*
Sample 1:
Enter Hours: 
70
Enter Rate: 
163.25
Your pay is $13876.25

Sample 2:
Enter Hours: 
45
Enter Rate: 
10
Your pay is $475.0
 */
