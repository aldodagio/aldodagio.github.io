/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Card Factory is the base class for all the factory classes and 
 * simply declares an abstract method which returns a CreditCard and will be used
 * to return any type of credit card. 
 * Date: 11/29/2021
 * 
 * */

package project10;

public abstract class CardFactory {

	public abstract CreditCard GetCreditCard();
	
}
