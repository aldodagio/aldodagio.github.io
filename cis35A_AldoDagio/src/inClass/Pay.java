// CIS35A - Aldo Dagio
// Description - This program demonstrates oop in Java. It practices using instances of objects in your code.

package inClass;

import java.util.Scanner;

public class Pay {
	
		private int hours = 0;
		private double rate = 0, pay = 0;
		
		public int getHours()
		{
			return this.hours;
		}
		public double getRate() 
		{
			return this.rate;
			}
		public void getInputs()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Hours: ");
			hours = input.nextInt();
			System.out.println("Enter Rate: ");
			rate = input.nextDouble();
			input.close();
		}
		public double calculatePay() 
		{
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
		public void printPay()
		{
			System.out.println("Your pay is $" + pay);
		}
		public void setHours(int hours)
		{
			this.hours = hours;
		}
		public void setRate(double rate)
		{
			this.rate = rate;
		}
		public void setPay(double pay)
		{
			this.pay = pay;
		}

static public void main(String[] args)
{
	Pay newPay = new Pay();
	newPay.getInputs();
	newPay.calculatePay();
	newPay.printPay();
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
62
Enter Rate: 
41
Your pay is $2993.0
 */
