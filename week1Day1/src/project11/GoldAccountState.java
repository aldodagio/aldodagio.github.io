/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The GoldAccountState implements all the methods 
 * of the AccountState abstract class, so that the GoldAccountState
 * can have a tangible meaning, which in this case is an account
 * with a balance greater than or equal to 20000.  
 * Date: 12/08/2021
 * 
 * */

package project11;

public class GoldAccountState extends AccountState {
	GoldAccountState() {}
	GoldAccountState(Account account) { this.account.setBalance(account.getBalance()); }
	GoldAccountState(AccountState state) { this.account.setBalance(state.account.getBalance()); }
	
	/*
	 * takes a parameter value of type double and adds it to the balance
	 * @param double amount
	 * @return none
	 * */
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		double dep = this.account.getBalance()+amount;
		this.account.setBalance(dep);
	}
	
	/*
	 * takes a parameter value of type double and subtracts it from the balance
	 * @param double amount
	 * @return none
	 * */
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.print("Limited operation!\n");
		double balance = this.account.getBalance();
		balance -= amount;
		this.account.setBalance(balance);
	}
	
	/*
	 * since this is the gold state, there is interest to calculate.
	 * we take the balance and add 1% yearly interest. 
	 * @param none
	 * @return none
	 * */
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.print("Gold Account, interest amount will be applied!\n");
		double balance = this.account.getBalance();
		balance*=.01;
		this.account.setBalance(balance+this.account.getBalance());
		System.out.print("interest amount: $ " + balance + "\n balance after interest: $" + this.account.getBalance() + "\n");
	}
	/*
	 * since this is the gold state, just print out the state  
	 * @param none
	 * @return none
	 * */
	@Override
	public void stateChangeCheck() {
		// TODO Auto-generated method stub
		System.out.print("GoldAccountState\n");
	}
}
