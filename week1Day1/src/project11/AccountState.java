/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The AccountState class is an abstract class that 
 * instantiates an Account object so that any state can access the 
 * methods to get and set the balance of an Account. It also creates
 * method signatures which are later implemented in other child classes. 
 * Date: 12/08/2021
 * 
 * */


package project11;

public abstract class AccountState {

	protected Account account = new Account();
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void calculateInterest();
	public abstract void stateChangeCheck();
	
}
