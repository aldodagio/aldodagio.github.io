/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The BankAccount class is an abstract class that initialized values and methods
 * to later be used by its derived classes. This class has a default and overloaded constructor which
 * takes arguments to set the balance, interest rate and monthly service charge. It also has unique
 * methods such as deposit(), withdrawal(), calcInterest() and monthlyProcess(). These methods all 
 * have the capability to update the classes fields such as the balance, numDeposits, numWithdrawals,
 * interestRate and monthlyServiceCharge. These fields also have mutators and accessors where ever 
 * necessary.
 * Date: 10/12/2021
 * 
 * */

package project6;

public abstract class BankAccount {
	
	private double balance;
	private int numDeposits;
	private int numWithdrawals;
	private double interestRate;
	private double monthlyServiceCharge;
	
	public BankAccount() {
		balance = 0;
		interestRate = 0;
		monthlyServiceCharge = 0;
		numDeposits = 0;
		numWithdrawals = 0;
	}
	public BankAccount(double bal, double intRate, double mon) {
		balance = bal;
		interestRate = intRate;
		monthlyServiceCharge = mon;
		numDeposits = 0;
		numWithdrawals = 0;
	}
	/*
	 * adds an amount to the balance in the bank account
	 * @param double amount
	 * */
	public void deposit(double amount) {
		balance += amount;
		numDeposits++;
	}
	/*
	 * subtracts an amount from the balance in the bank account
	 * @param double amount
	 * */
	public void withdrawal(double amount) {
		balance -= amount;
		numWithdrawals++;
	}
	/*
	 * divides the interest rate by 12 to get a monthly interest rate.
	 * Then multiplies the balance by the monthly interest rate to get 
	 * the total interest for the month. The total interest for the month
	 * is then added to the balance
	 * @param none
	 * */
	private void calcInterest() {
		double monthlyInterestRate = interestRate/12;
		double monthlyInterest = balance*monthlyInterestRate;
		balance += monthlyInterest;
	}
	/*
	 * deducts the monthly service charge from the balance, then calls
	 * the method to calculate the interest for the month. Resets the 
	 * number of deposits, withdrawals and the amount for the monthly 
	 * service charge back to 0.
	 * @param none
	 * */
	public void monthlyProcess() {
		balance -= monthlyServiceCharge;
		calcInterest();
		numDeposits = numWithdrawals = 0;
		monthlyServiceCharge = 0;
	}
	/*
	 * sets the monthly service charge to the amount in the parameter
	 * @param double amount
	 * */
	public void setMonthlyCharges(double amount) { monthlyServiceCharge = amount; }
	/*
	 * returns the balance
	 * @param none
	 * */
	public double getBalance() { return balance; }
	/*
	 * returns the number of deposits
	 * @param none
	 * */
	public int getNumDeposits() { return numDeposits; }
	/*
	 * returns the number of withdrawals
	 * @param none
	 * */
	public int getNumWithdrawals() { return numWithdrawals; }
	/*
	 * returns the interest rate
	 * @param none
	 * */
	public double getInterestRate() { return interestRate; }
	/*
	 * returns the monthly service charge
	 * @param none
	 * */
	public double getMonthlyServiceCharges() { return monthlyServiceCharge; }

}
