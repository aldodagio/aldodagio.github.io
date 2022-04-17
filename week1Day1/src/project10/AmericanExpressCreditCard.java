/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The AmericanExpressCreditCard class is derived from the CreditCard class
 * and it defines the values for the credit card and implements the methods from 
 * the abstract class. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public class AmericanExpressCreditCard extends CreditCard {

	private String cardType = "American Express";
	private int creditLimit = 10000000;
	private int annualCharge = 5000;
	
	public AmericanExpressCreditCard() {}
	public AmericanExpressCreditCard(int limit, int charge) { 
		creditLimit = limit;
		annualCharge = charge;
	}
	public String CardType() { return cardType; }
	public int CreditLimit() { return creditLimit; }
	public int AnnualCharge() { return annualCharge; }
	
}
