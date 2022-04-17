package finalPart1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class OrderBurger extends Order {

	private double[] quants = new double[5];
	private double quantity, choice;	
	private double subTotal, total, tax;
	private String ans, fn;
	
	// The getInputs() function takes the order of the user and continues until 6 is pressed.
	// It also receives the file path for where to store the text file that has the bill. 
	// And it asks the user whether they are a student or not for tax purposes.
	public void getInputs() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the file path where you would like to save the bill: ");
		String fileName = input.nextLine();
		fn = fileName;
	
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
				
			} while(choice != 6);
			
			System.out.println("Are you a student? Enter yes or no in the form (y/n): ");
			String answer = input.nextLine();
			ans.equals(answer);
}

		// The calculate function checks each elements for quantities greater than 0.
		// If there is a quantity greater than 0 present, the indexed element is multiplied
		// by its corresponding price, which is also an indexed array.
		// The product of the elements are summed up as i steps through the array.
	public void calculate() {

		for(int i = 0; i < quants.length; i++)
		{
			if(quants[i] > 0)
			subTotal += quants[i]*priceArr[i];
		}
		
		  if (ans.equals("y")) 
		  {
			  total = subTotal;
		  }
		  else if (ans.equals("n")) 
		  {
			  tax = subTotal*.09;
			  total = subTotal+tax;
		  }
		  else 
		     System.out.println("Sorry, I didn't catch that. Please answer (y/n)");
		 
		
	}
	
	// A receipt that displays all categories for the bill and displays only if there is an order present.
	public void printBill() {
		for(int j = 0; j < quants[j]; j++)
		{	
			if(quants[j] > 0)
			
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
	
	// A method to save the bill to a text file called Bill.txt. It is triggered if there is an order present.
	public void saveBillToFile() {
		for(int j = 0; j < quants[j]; j++)
		{	
			if(quants[j] > 0)

			try {
				File sourceFile = new File(fn);
				PrintWriter write = new PrintWriter("Bill.txt");
				
				write.println((""));
				write.println("");
				write.println("__________________________________________________________________________________________________________");
				write.println("|                  |               |            |               |              |                         |");
				write.println("|                  |               |            |               |              |                         |");
				write.println("|    FOOD ITEM     |   QUANTITY    |    COST    |  BEFORE TAX   |  TAX AMOUNT  |  TOTAL PRICE AFTER TAX  |");
				write.println("|                  |               |            |               |              |                         |");
				write.println("|__________________|_______________|____________|_______________|______________|_________________________|");
				
				for(int i = 0; i < quants.length; i++)
				{
					if(quants[i] > 0)
				write.println("|  " + item[i] + "  |      " + quants[i] + "      |    " + priceArr[i] + "    |     " + Math.round(subTotal*100.0)/100.0 + "      |     " + Math.round(tax*100.0)/100.0 + "       |     " + Math.round(total*100.0)/100.0 + "               |");
			
				}

				write.println("|________________________________________________________________________________________________________|");
				write.println("|        |               |            |                                                                  |");
				write.println("|        |               |            |                                                                  |");
				write.println("|  TAX   |   CUPERTINO   |   9.000%   |    Santa Clara                                                   |");
				write.println("|        |               |            |                                                                  |");
				write.println("|________|_______________|____________|__________________________________________________________________|");
				
				write.close();
			}
				catch(Exception e)
			{
					System.out.println(e);
					
			}
		}
	}
}
