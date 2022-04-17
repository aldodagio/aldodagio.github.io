/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The DiscoverCreditCard class is derived from the CreditCard class
 * and it defines the values for the credit card and implements the methods from 
 * the abstract class. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public class DiscoverCreditCard extends CreditCard {
	private String cardType = "Discover";
	private int creditLimit = 20000000;
	private int annualCharge = 1000;
	
	public DiscoverCreditCard() {}
	public DiscoverCreditCard(int limit, int charge) { 
		creditLimit = limit;
		annualCharge = charge;
	}
	public String CardType() { return cardType; }
	public int CreditLimit() { return creditLimit; }
	public int AnnualCharge() { return annualCharge; }
}
