/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Discover Factory class uses constructors to modify 
 * the values of discover credit cards. The GetCreditCard is then used to 
 * access the new values of the credit card. 
 * Date: 11/29/2021
 * 
 * */


package project10;

public class DiscoverFactory extends CardFactory {
	private int creditLimit;
	private int annualCharge;
	
	public DiscoverFactory() {}
	public DiscoverFactory(int limit, int charge) {
		creditLimit = limit;
		annualCharge = charge;
	}
	/*
	 * This method instantiates a new discover credit card 
	 * which carries values defined by a user.
	 * @param none
	 * @return CreditCard with modified values 
	 * */
	@Override
	public CreditCard GetCreditCard() {
		 DiscoverCreditCard disc = new DiscoverCreditCard(creditLimit, annualCharge);
		  return disc;
	}

}
