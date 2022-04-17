/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The NormalAccountState implements all the methods 
 * of the AccountState abstract class, so that the NormalAccountState
 * can have a tangible meaning, which in this case is an account
 * with a balance greater than 0 and less than 20000. 
 * Date: 12/08/2021
 * 
 * */


package project11;

public class NormalAccountState extends AccountState {
	
	
	
	NormalAccountState() {}
	NormalAccountState(Account account) { 
		this.account.setBalance(account.getBalance());
	}
	NormalAccountState(AccountState state) {
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
	 * takes a parameter value of type double and subtracts it from the balance
	 * @param double amount
	 * @return none
	 * */
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.print("Limited operation!\n");
		this.account.setBalance(account.getBalance()-amount);
	}
	/*
	 * since this is the normal state, no interest applied
	 * @param none
	 * @return none
	 * */
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.print("Normal state, no interest applies!\n");
	}
	/*
	 * since this is the normal state, just print out the state  
	 * @param none
	 * @return none
	 * */
	@Override
	public void stateChangeCheck() {
		// TODO Auto-generated method stub
		System.out.print("NormalAccountState\n");
	}

}
