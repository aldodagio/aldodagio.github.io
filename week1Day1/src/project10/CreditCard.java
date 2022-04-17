/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The CreditCard class is the base class for all the credit card classes and 
 * simply declares abstract methods which return unique values that will belong to the different
 * types of credit cards.  
 * Date: 11/29/2021
 * 
 * */

package project10;

public abstract class CreditCard {

	public abstract String CardType();
	public abstract int CreditLimit();
	public abstract int AnnualCharge();
	
	
}
