package finalPart1;

public abstract class Order implements OrderInterface {
	
	// Very basic display function.
		public void display()
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

		public abstract void getInputs();
		public abstract void calculate();
		public abstract void printBill();
		
		public abstract void saveBillToFile();
		
}
