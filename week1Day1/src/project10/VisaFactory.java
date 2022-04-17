/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Visa Factory class uses constructors to modify 
 * the values of visa credit cards. The GetCreditCard is then used to 
 * access the new values of the credit card. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public class VisaFactory extends CardFactory {
	private int creditLimit;
	private int annualCharge;
	
	public VisaFactory() {}
	public VisaFactory(int limit, int charge) {
		creditLimit = limit;
		annualCharge = charge;
	}
	/*
	 * This method instantiates a new visa credit card 
	 * which carries values defined by a user.
	 * @param none
	 * @return CreditCard with modified values 
	 * */
	@Override
	public CreditCard GetCreditCard() {
		 VisaCreditCard visa = new VisaCreditCard(creditLimit, annualCharge);
		  return visa;
	}

}
