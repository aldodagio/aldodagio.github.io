/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The AccountStateDesignDemo demonstrates the polymorphism of
 * a state design pattern by entering different states based on the value of
 * the balance. The Account class creates an object and it uses a stateChangeCheck
 * method to continue to have the correct Account state.  
 * Date: 12/08/2021
 * 
 * */


package project11;

public class AccountStateDesignDemo {
	
	public static void main(String[] args) {
		Account account = new Account("Tom zank", 0);
		System.out.print("-----------------------------------------------\n");
		account.deposit(3000);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.deposit(2000);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.deposit(5000);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.calculateInterest();
		account.withdraw(10000);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.withdraw(1100);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.deposit(20000);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
		account.calculateInterest();
		account.deposit(1500);
		account.stateChangeCheck();
		System.out.print("-----------------------------------------------\n");
	}

}
