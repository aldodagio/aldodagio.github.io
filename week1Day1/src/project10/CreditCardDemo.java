/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The CreditCardDemo uses the main method to demonstrate the 
 * open-closed principle for the the factory method. Here we see objects of
 * different factory classes being instantiated depending on the card type
 * being entered through a scanner as a String type variable. An instance
 * of CardFactory is also defined to access any of the different factories. 
 * The values of the CreditCard can be accessed and modified using the factory
 * objects, but the card name is not subject to change. 
 * Date: 11/29/2021
 * 
 * */

package project10;

import java.util.Scanner;

public class CreditCardDemo {

	public static void main(String[] args) {
		String card = null;
		CardFactory fact;
		do {
			System.out.print("Welcome to Banking" + "\n=========================== \n\n"
					+ " American Express \n" + " Visa \n" + " Discover \n" + " Quit \n\n" + 
					"Enter the card type you would like to visit: ");
			Scanner input = new Scanner(System.in);
			card = input.next();
			if(card.equalsIgnoreCase("AmericanExpress")) {
				System.out.println("\nYour card details are below : \n");
				fact = new AmericanExpressFactory(500000,100);
				System.out.print("Card Type:" + fact.GetCreditCard().CardType() + "\nCredit Limit: $" + fact.GetCreditCard().CreditLimit() +  " \nAnnual Charge: $" + fact.GetCreditCard().AnnualCharge() + "\n\n");
				}
			else if(card.equalsIgnoreCase("Visa")) {
				System.out.println("\nYour card details are below : \n");
				fact = new VisaFactory(100000,0);
				System.out.print("Card Type:" + fact.GetCreditCard().CardType() + "\nCredit Limit: $" + fact.GetCreditCard().CreditLimit() +  " \nAnnual Charge: $" + fact.GetCreditCard().AnnualCharge() + "\n\n");
			}
			else if(card.equalsIgnoreCase("Discover")) {
				System.out.println("\nYour card details are below : \n");
				fact = new DiscoverFactory(50000,75);
				System.out.print("Card Type:" + fact.GetCreditCard().CardType() + "\nCredit Limit: $" + fact.GetCreditCard().CreditLimit() +  " \nAnnual Charge: $" + fact.GetCreditCard().AnnualCharge()+ "\n\n");
			}
			else
				System.out.print("Existing the program.. Good bye");
				
			}while(!card.equalsIgnoreCase("quit"));
	}

}
