/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The American Express Factory class uses constructors to modify 
 * the values of american express credit cards. The GetCreditCard is then used to 
 * access the new values of the credit card. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public class AmericanExpressFactory extends CardFactory {
	
	private int creditLimit;
	private int annualCharge;
	
	public AmericanExpressFactory() {}
	public AmericanExpressFactory(int limit, int charge) {
		creditLimit = limit;
		annualCharge = charge;
	}
	/*
	 * This method instantiates a new american express credit card 
	 * which carries values defined by a user.
	 * @param none
	 * @return CreditCard with modified values 
	 * */
	@Override
	public CreditCard GetCreditCard() {
	   AmericanExpressCreditCard amex = new AmericanExpressCreditCard(creditLimit, annualCharge);
	   return amex;
	}
}
