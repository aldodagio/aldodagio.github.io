// CIS35A - Aldo Dagio
// Description - program demonstrating knowledge of creating and accessing objects. 

package inClass;

import java.util.Scanner;

public class Account {
	
	private int id = 0;
	private double balance = 0, annualInterestRate = 0;
	private String dateCreated = "07/20/2020";
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	public int getID()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	// 4.5% interest has to be divided by 100 to return the correct rate.
	public double getInterestRate()
	{
		return annualInterestRate/100;
	}
	public String getDateCreated()
	{
		return dateCreated;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setBalance(double balance)
	{
		this.balance  = balance;
	}
	public void setInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	// Method that divides the annual interest rate by 12 to obtain the monthly interest. 
	public double getMonthlyInterestRate()
	{
		double monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate/100;
	}
	// Method that withdrawals money from the bank account.
	public double withdraw(double amount)
	{
		double newBalance = 0;
		
		newBalance = balance - amount;
		balance = newBalance;
		
		return balance;
	}
	// Method that deposits money to the bank account. 
	public double deposit(double amount)
	{
		double newBalance = 0;
		
		newBalance = balance + amount;
		balance = newBalance;
		
		return balance;
	}
	
	public static void main(String[] args) 
	{
		Account bankAccount = new Account(1122,20000);
		bankAccount.setInterestRate(4.5);
		
		bankAccount.withdraw(2500);
		bankAccount.deposit(3000);
		System.out.println("Balance is $" + bankAccount.getBalance() + ".");
		System.out.println("Monthly interest rate is " + bankAccount.getMonthlyInterestRate() + ".");
		System.out.println("Monthly interest is the monthlyInterestRate*Balance = $" + bankAccount.getMonthlyInterestRate()*bankAccount.getBalance() + ".");
		System.out.println("This account was created on " + bankAccount.getDateCreated() + ".");
	}
}

/* 
Balance is $20500.0.
Monthly interest rate is 0.00375.
Monthly interest is the monthlyInterestRate*Balance = $76.875.
This account was created on 07/20/2020.
*/
