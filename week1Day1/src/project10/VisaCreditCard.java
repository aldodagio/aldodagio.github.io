/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The VisaCreditCard class is derived from the CreditCard class
 * and it defines the values for the credit card and implements the methods from 
 * the abstract class. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public class VisaCreditCard extends CreditCard {
	private String cardType = "Visa";
	private int creditLimit = 5500000;
	private int annualCharge = 3000;
	
	public VisaCreditCard() {}
	public VisaCreditCard(int limit, int charge) { 
		creditLimit = limit;
		annualCharge = charge;
	}
	public String CardType() { return cardType; }
	public int CreditLimit() { return creditLimit; }
	public int AnnualCharge() { return annualCharge; }
}
