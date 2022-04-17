/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This program uses the Inventory class to assign and access item numbers,
 * item quantities, item costs and total costs inside of the main method in the InventorySimulator class.
 * The inventory class only takes valid inputs of integers and doubles which are non negative. This
 * capability is made possible using Boolean methods which return true only after a valid, positive number is entered.
 * Date: 09/27/2021
 * 
 * */

package project4;

import java.util.Scanner;

public class InventorySimulator {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Demonstration of the default constructor being used to create a new inventory object.
		Inventory items = new Inventory();
		System.out.printf("Default constructor simulation: " + "Default item number: " + items.getItemNo() + "\n"
				+ "Default item quantity: " + items.getQuantity() + "\n" 
				+ "Default item cost: $%.2f", items.getCost());
				System.out.println();
				System.out.printf("Deault total cost: $%.2f",  items.getTotalCost());
				System.out.println();
				System.out.println();
				
		// Demonstration of the overloaded constructor being used to create a new inventory object
		// and input validation for a negative cost is also demonstrated.
		Inventory item1 = new Inventory(1234,5,-5.5);
		System.out.printf("Overloaded constructor simulation: " + "Item number: " + item1.getItemNo() + "\n"
				+ "Item quantity: " + item1.getQuantity() + "\n" 
				+ "Item cost: $%.2f", item1.getCost());
		System.out.println();
		System.out.printf("Total cost: $%.2f",  item1.getTotalCost());
		System.out.println();
		System.out.println();
		
		// Demonstration of the overloaded constructor being used to create a new inventory object
		// and input validation for a negative quantity is also demonstrated.
		Inventory item2 = new Inventory(4321,-5, 10.00);
		System.out.printf("Overloaded constructor simulation: " + "Item number: " + item2.getItemNo() + "\n"
				+ "Item quantity: " + item2.getQuantity() + "\n" 
				+ "Item cost: $%.2f", item2.getCost());
		System.out.println();
		System.out.printf("Total cost: $%.2f",  item2.getTotalCost());
		System.out.println();
		System.out.println();
		
		// Demonstration of the overloaded constructor being used to create a new inventory object
		// and input validation for a negative item number is also demonstrated.
		Inventory item3 = new Inventory(-2341,5,5.00);
		System.out.printf("Overloaded constructor simulation: " + "Item number: " + item3.getItemNo() + "\n"
				+ "Item quantity: " + item3.getQuantity() + "\n" 
				+ "Item cost: $%.2f", item3.getCost());
		System.out.println();
		System.out.printf("Total cost: $%.2f",  item3.getTotalCost());
		System.out.println();
		
	}
	
}
