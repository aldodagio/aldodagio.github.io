package pay;

import java.util.Scanner;

import inClass.Pay;

public class calculateEmployeePay {


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
	public void getInputs() throws RuntimeException
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Hours: ");
		hours = input.nextInt();
		
			if(hours >= 0)
		System.out.println("Enter Rate: ");
			else 
		throw new RuntimeException();
			
		rate = input.nextDouble();
			if(rate >= 0)
		input.close();
		else
			throw new RuntimeException();
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
		}else
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
		try {
			newPay.getInputs();
		}
		catch(RuntimeException ex) {
			System.out.println("Please enter valid hours and rate. They must both be greater than or equal to 0.");
		}
		newPay.calculatePay();
		newPay.printPay();
	}
}


