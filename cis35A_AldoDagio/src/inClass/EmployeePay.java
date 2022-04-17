// CIS35A - Aldo Dagio
// Description: Calculate Pay program using methods and a small array.

package inClass;

import java.util.Scanner;

public class EmployeePay {
	
	public static void main(String[] args) {
		
		double newHours = 0, newRate = 0, newPay = 0;
		double[] newArr = new double[2];
		
		newArr = getInputs();
		
		newHours = newArr[0];
		newRate = newArr[1];
		
		newPay = calculatePay(newHours, newRate);
		printPay(newPay);
		
		
		
	}

	public static double[] getInputs()
	{
		double[] smallArr = new double[2];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Hours: ");
		smallArr[0] = input.nextDouble();
		System.out.println("Enter Rate: ");
		smallArr[1] = input.nextDouble();
		input.close();
		
		return smallArr;
		
	}
	public static double calculatePay(double hours, double rate) 
	{
		double pay = 0;
		if(hours > 40)
		{
			double ot;
			pay = rate*40;
			hours = hours-40;
			ot = hours*rate*1.5;
			pay = pay+ot;
			//System.out.println("Your pay is $" + pay);
		}else
			//System.out.println("Your pay is $" + rate*hours);
		pay = rate*hours;
		
		return pay;
	}
	public static void printPay(double pay)
	{
		System.out.println("Your pay is $" + pay);
	}
	
}

/*
Sample 1:
Enter Hours: 
45
Enter Rate: 
10
Your pay is $475.0

Sample 2: 
Enter Hours: 
55
Enter Rate: 
36
Your pay is $2250.0
 */ 
