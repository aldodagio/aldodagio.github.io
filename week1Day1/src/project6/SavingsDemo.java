/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This program uses a main method to create an instance of the SavingsAccount class to 
 * demonstrate the capabilities of a child of an abstract class. First, the instance is created using
 * an overloaded constructor, which sets the balance, interest rate and monthly service charge to fixed 
 * values and then displays the results. Next, there is a do-while loop which handles deposits for the 
 * SavingsAccount object and continues to get deposits until the user types something other than 'yes'.
 * After the loop is broken, the new balance, number of withdrawals and deposits are updated and displayed.
 * Then, the same process is completed for the user to withdrawal from the savings account. And then finally, 
 * after both loops have been broken, the monthly processing is calculated and called by the SavingsAccount
 * object. The resulting balance, deposits and withdrawals are updated and displayed to the user.
 * Date: 10/12/2021
 * 
 * */

package project6;

import java.util.Scanner;

public class SavingsDemo {
	
	
	public static void main(String[] args) {
		String response = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Create a SavingsAccount object with a $100 balance, 3% interest rate, and a monthly service charge of $2.50" + "\n");
		SavingsAccount mySavings = new SavingsAccount(100, .03, 2.5);
		System.out.printf("Balance: $%.2f", mySavings.getBalance());
		System.out.print("\nNumber of deposits: " + mySavings.getNumDeposits() + "\n");
		System.out.print("Number of withdrawals: " + mySavings.getNumWithdrawals() + "\n\n");
		do {
			System.out.print("Please enter the amount you want to deposit: $");
			mySavings.deposit(input.nextDouble());
			System.out.print("Do you want to make another deposit?");
			response = input.next();
		}while(response.equalsIgnoreCase("yes"));
		System.out.print(" Display what we've done so far.\n\n");
		System.out.printf("Balance: $%.2f", mySavings.getBalance());
		System.out.print("\nNumber of deposits: " + mySavings.getNumDeposits() + "\n");
		System.out.print("Number of withdrawals: " + mySavings.getNumWithdrawals() + "\n\n");
		do {
			System.out.print("Please enter the amount you want to Withdrawal: $");
			mySavings.withdrawal(input.nextDouble());
			System.out.print("Do you want to make another Withdrawal?");
			response = input.next();
		}while(response.equalsIgnoreCase("yes"));
		System.out.print(" Display what we've done so far.\n\n");
		System.out.printf("Balance: $%.2f", mySavings.getBalance());
		System.out.print("\nNumber of deposits: " + mySavings.getNumDeposits() + "\n");
		System.out.print("Number of withdrawals: " + mySavings.getNumWithdrawals() + "\n\n");
		
		System.out.print("Doing the monthly processing. \n");
		mySavings.monthlyProcess();
		System.out.printf("Balance: $%.2f", mySavings.getBalance());
		System.out.print("\nNumber of deposits: " + mySavings.getNumDeposits() + "\n");
		System.out.print("Number of withdrawals: " + mySavings.getNumWithdrawals() + "\n\n");
		input.close();
		
	}

}
