package project6;

public class SavingsAccount extends BankAccount {
	
	private boolean status;
	
	public SavingsAccount(double bal, double intRate, double mon) {
		super(bal, intRate, mon);
	}
	/*
	 * checks to see if the balance is greater than or equal to 25.
	 * If that is true, the status is true and the account is active.
	 * Therefore, the withdrawal method from the superclass is called 
	 * to handle the withdrawal.
	 * @param double amount
	 * */
	public void withdrawal(double amount) {
		if(getBalance() >= 25)
			status = true;
		else if(getBalance() < 25)
			status = false;
		if(status)
			super.withdrawal(amount);
	}
	/*
	 * calls the deposit method from the superclass and then checks to 
	 * see if account is active or not. If account is active, then
	 * the status is set to true and if not, then it is set to false.
	 * @param double amount
	 * */
	public void deposit(double amount) {
			super.deposit(amount);
		if(getBalance() >= 25)
			status = true;
		else if(getBalance() < 25)
			status = false;
	}
	/*
	 * If there were more than 4 withdrawals during the month, then
	 * for each withdrawal over 4, the account is charged one dollar.
	 * So we get the total number of withdrawals and subtract by 4 to 
	 * find the amount to charge. Then that value is added to the old
	 * monthly service charge, which creates a new charge. The new
	 * charge is set to the new monthly charge using the setMonthlyCharges
	 * method. Then, the account is checked to see if it is active or inactive.
	 * And finally, the monthlyProcess method from the superclass is called.
	 * @param none
	 * */
	public void monthlyProcess() {
		if(getNumWithdrawals() > 4) {
		double charge = getMonthlyServiceCharges();
		int totalWithdrawals = getNumWithdrawals();
		totalWithdrawals -= 4;
		charge+=totalWithdrawals;
		setMonthlyCharges(charge);
		}
		if(getBalance() >= 25)
			status = true;
		else if(getBalance() < 25)
			status = false;
		super.monthlyProcess();
	}
}
