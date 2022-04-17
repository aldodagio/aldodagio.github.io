package midtermPart1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Order 
{
			private final double[] priceArr = {5.25, 5.75, 5.95, 5.95, 5.95};
			private String[] item = {"De Anza Burger","Bacon & Cheese","Mushroom Swiss","Western Burger","Don Cali Burger"};
			private double[] quants = new double[5];
			private double quantity, choice;	
			private double subTotal, total, tax;
			private String answer;
			
			
	// Very basic display function.
	public void displayMenu()
	{
			System.out.println(" Welcome to De Anza Grill Burger Club! ");
			System.out.println("   Grill Hours are 10:35AM - 7:30PM ");
			System.out.println("         No Substitutions.         ");
			System.out.println(" ");
			System.out.println("         1. De Anza Burger:          ");
			System.out.println("       Charbroiled Beef Patty,       ");
			System.out.println("         Green Leaf, Tomato,         ");
			System.out.println("      Red Onion, White Cheddar       ");
			System.out.println("          on a Toasted Bun. ");
			System.out.println("           Price: "+ priceArr[0]);
			System.out.println(" ");
			System.out.println("          2. Bacon & Cheese:         ");
			System.out.println("        Charbroiled Beef Patty,      ");
			System.out.println("             Smoked Bacon,           ");
			System.out.println("           Carmelized Onion,         ");
			System.out.println("          & American Cheese          ");
			System.out.println("           on a Toasted Bun.         ");
			System.out.println("            Price: "+ priceArr[1]);
			System.out.println(" ");
			System.out.println("         3. Mushroom Swiss:          ");
			System.out.println("        Beef Patty, Mushrooms        ");
			System.out.println("       & Swiss Cheese, Garlic        ");
			System.out.println("      Mayo, Green Leaf Lettuce,      ");
			System.out.println("             & Tomato                ");
			System.out.println("          on a Toasted Bun.          ");
			System.out.println("           Price: "+ priceArr[2]);
			System.out.println(" ");
			System.out.println("        4. Western Burger:           ");
			System.out.println("      Charbroiled Beef Patty,        ");
			System.out.println("    Beer Battered Onion Rings,       ");
			System.out.println("       Sriracha BBQ Sauce &,         ");
			System.out.println("          American Cheese            ");
			System.out.println("         on a Toasted Bun.           ");
			System.out.println("          Price: "+ priceArr[3]);
			System.out.println(" ");
			System.out.println("        5. Don Cali Burger:          ");
			System.out.println("       Charbroiled Beef Patty,       ");
			System.out.println("         Spring Mix Lettuce          ");
			System.out.println("         Tomato, Red Onion,          ");
			System.out.println("       Avocado, Smoked Gouda         ");
			System.out.println("          on a Toasted Bun.         ");
			System.out.println("           Price: "+ priceArr[4]);
			System.out.println(" ");
	}
	
	
	// The getInputs() function takes all items and stores their quatities in an array based on the choice of the user.
	public void getInputs() 
{
		
		Scanner input = new Scanner(System.in);
		
		do 
			{	
				System.out.println("Use numbers 1-5 to order one of our fine burgers.");
				System.out.println("Press 6 to exit the menu when done ordering.");
			
				choice = input.nextInt();
				
				if(choice == 1)
			{
				System.out.println("How many De Anza Burgers would you like to order?");
				quantity = input.nextDouble();	
				quants[0] = quantity;
			}
			else if (choice == 2)
			{
				System.out.println("How many Bacon and Cheese Burgers would you like to order?");
				quantity = input.nextDouble();
				quants[1] = quantity;
			}
			else if(choice == 3)
			{
				System.out.println("How many Mushroom Swiss Burgers would you like to order?");
				quantity = input.nextDouble();
				quants[2] = quantity;
			}
			else if(choice == 4)
			{
				System.out.println("How many Western Burgers would you like to order?");
				quantity = input.nextDouble();
				quants[3] = quantity; 
			}
			else if(choice == 5)
			{
				System.out.println("How many Don Cali Burgers would you like to order?");
				quantity = input.nextDouble();
				quants[4] = quantity;
			}
			else if(choice == 6)
			{
				System.out.println("");
				
			}
			else if(choice < 1)
			{
				System.out.println("Please pick a positive number, not including zero.");
				System.out.println("");
			}
			else
			{
				System.out.println("Please pick a number between 1 and 5.");
				System.out.println("");
			}
				
				boolean yn;
				  
		    	System.out.println("Are you a student? Enter yes or no in the form (y/n): ");
		        answer = input.nextLine();

		        switch(answer){
		        case "yes":
		        	total = subTotal;
		            yn = false;
		            break;
		        case "no": 
		        	tax = subTotal*.09;
					total = subTotal+tax;
		            yn = true;
		            break;
		        default : 
		            System.out.println("Sorry, I didn't catch that. Please answer (y/n)");
		        }
				
			} while(choice != 6);
		    
	}

	
	
	// The calculate function checks each elements for quantities greater than 0.
	// If there is a quantity greater than 0 present, the indexed element is multiplied
	// by its corresponding price, which is also an indexed array.
	// The product of the elements are summed up as i steps through the array.
	// Then the function checks to see if the user is a student or staff.
	public void calculate()
	{	
			
			for(int i = 0; i < quants.length; i++)
			{
				if(quants[i] > 0)
				subTotal += quants[i]*priceArr[i];
			}

	}
	
	// A receipt that displays all categories for the bill to your order. 
	public void printBill()
	{
			System.out.println("");
			System.out.println("");
			System.out.println("__________________________________________________________________________________________________________");
			System.out.println("|                  |               |            |               |              |                         |");
			System.out.println("|                  |               |            |               |              |                         |");
			System.out.println("|    FOOD ITEM     |   QUANTITY    |    COST    |  BEFORE TAX   |  TAX AMOUNT  |  TOTAL PRICE AFTER TAX  |");
			System.out.println("|                  |               |            |               |              |                         |");
			System.out.println("|__________________|_______________|____________|_______________|______________|_________________________|");
			
			for(int i = 0; i < quants.length; i++)
			{
				if(quants[i] > 0)
			System.out.println("|  " + item[i] + "  |      " + quants[i] + "      |    " + priceArr[i] + "    |     " + Math.round(subTotal*100.0)/100.0 + "      |     " + Math.round(tax*100.0)/100.0 + "       |     " + Math.round(total*100.0)/100.0 + "               |");
		
			}

			System.out.println("|________________________________________________________________________________________________________|");
			System.out.println("|        |               |            |                                                                  |");
			System.out.println("|        |               |            |                                                                  |");
			System.out.println("|  TAX   |   CUPERTINO   |   9.000%   |    Santa Clara                                                   |");
			System.out.println("|        |               |            |                                                                  |");
			System.out.println("|________|_______________|____________|__________________________________________________________________|");
	}

}
