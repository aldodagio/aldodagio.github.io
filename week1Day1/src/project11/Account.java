/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Account class encapsulates the state desing pattern 
 * by calling each individual method based on the state. Any method called
 * could return a different output depending on the state. 
 * Date: 12/08/2021
 * 
 * */


package project11;

public class Account {

	private AccountState state;
	private String owner;
	private double balance;
	
	Account() {}
	Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
		setState(state);
		System.out.print(owner + ": Open an account with an initial amount of " + balance + "\n");
	}
	/*
	 * calls the method value based on state 
	 * @param double amount
	 * @return none
	 * */
	public void deposit(double amount) {
		state.deposit(amount);
		balance = state.account.getBalance();
		System.out.print(owner + " deposited $ " + amount + "\nNow the balance is:$" + balance + "\n");
	}
	/*
	 * calls the withdraw method based on state 
	 * @param double amount
	 * @return none
	 * */
	public void withdraw(double amount) {
		state.withdraw(amount);
		balance = state.account.getBalance();
		System.out.print(owner + " withdraw money :$" + amount + "\nNow the balance is:$" + balance + "\n");
	}
	/*
	 * calls the calcInterest method based on state 
	 * @param none
	 * @return none
	 * */
	public void calculateInterest() {
		state.calculateInterest();
	}
	/*
	 * calls the stateChangeCheck method based on state 
	 * @param none
	 * @return none
	 * */
	public void stateChangeCheck() {
		setState(state);
		System.out.print("The account status is now: ");
		state.stateChangeCheck();
	}
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	/*
	 * sets the state based on the balance of the account
	 * @param AccountState state
	 * @return none
	 * */
	public void setState(AccountState state) { 
		if(balance <= 0)
		{
			state = new RestrictedAccountState();
			state.account.setBalance(this.balance);
			state = new RestrictedAccountState(state.account);
		}	
		else if(balance > 0 && balance < 20000)
		{
			state = new NormalAccountState(state.account);
			state.account.setBalance(this.balance);
			state = new NormalAccountState(state.account);
		}
		else if(balance >= 20000)
		{
			state = new GoldAccountState(state.account);
			state.account.setBalance(this.balance);
			state = new GoldAccountState(state.account);
		}
			this.state = state;
	}
}
