/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The RestrictedAccountState implements all the methods 
 * of the AccountState abstract class, so that the RestrictedAccountState
 * can have a tangible meaning, which in this case is an account
 * with a balance equal to or less than 0. 
 * Date: 12/08/2021
 * 
 * */

package project11;

public class RestrictedAccountState extends AccountState {

	
	
	RestrictedAccountState() {}
	RestrictedAccountState(Account account) { 
		this.account.setBalance(account.getBalance()); 
		}
	RestrictedAccountState(AccountState state) { 
		this.account.setBalance(state.account.getBalance());
	}
	
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
	 * since this is the restricted state, no money can be withdrawn
	 * @param double amount
	 * @return none
	 * */
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double bal = this.account.getBalance();
		if(bal <= 0) {
		System.out.print("Account limit, withdrawal failed\n");
		}
		else 
			 bal -= amount;
		this.account.setBalance(bal);
	}
	/*
	 * since this is the restricted state, no interest applied
	 * @param none
	 * @return none
	 * */
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.print("Restricted state, no interest applies!\n");
	}
	/*
	 * since this is the restricted state, just print out the state  
	 * @param none
	 * @return none
	 * */
	@Override
	public void stateChangeCheck() {
		// TODO Auto-generated method stub
		System.out.print("RestrictedAccountState\n");
	}
	
}
