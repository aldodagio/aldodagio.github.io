// CIS35A - Aldo Dagio
// Description - This is a detailed program meant for a small organization such as De Anza Burger Grill.
//             - The program uses a menu to let the user order based on the number they input. 
//			   - Once the inputs are retrieved, they are stored into a quant[] array for future use.
//             - There is a constant priceArr with all the corresponding prices. 
//             - Once the user has finished ordering, the quant[] and price[] are multiplied and summed
//             - up in the calculate() method. Finally, a long detailed receipt is nicely organized and
//             - displayed to the user.

package midtermPart1;

import java.util.Scanner;
import java.util.Arrays;

public class Driver 
{

	public static void main(String[] args)
	{
		Order newOrder = new Order();
		newOrder.displayMenu();
		newOrder.getInputs();
		newOrder.calculate();
		newOrder.printBill();
	}
	
}


/*
 				SAMPLE 1:
 Welcome to De Anza Grill Burger Club! 
   Grill Hours are 10:35AM - 7:30PM 
         No Substitutions.         
 
         1. De Anza Burger:          
       Charbroiled Beef Patty,       
         Green Leaf, Tomato,         
      Red Onion, White Cheddar       
          on a Toasted Bun. 
           Price: 5.25
 
          2. Bacon & Cheese:         
        Charbroiled Beef Patty,      
             Smoked Bacon,           
           Carmelized Onion,         
          & American Cheese          
           on a Toasted Bun.         
            Price: 5.75
 
         3. Mushroom Swiss:          
        Beef Patty, Mushrooms        
       & Swiss Cheese, Garlic        
      Mayo, Green Leaf Lettuce,      
             & Tomato                
          on a Toasted Bun.          
           Price: 5.95
 
        4. Western Burger:           
      Charbroiled Beef Patty,        
    Beer Battered Onion Rings,       
       Sriracha BBQ Sauce &,         
          American Cheese            
         on a Toasted Bun.           
          Price: 5.95
 
        5. Don Cali Burger:          
       Charbroiled Beef Patty,       
         Spring Mix Lettuce          
         Tomato, Red Onion,          
       Avocado, Smoked Gouda         
          on a Toasted Bun.         
           Price: 5.95
 
Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
5
How many Bacon and Cheese Burgers would you like to order?
2

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
3
How many Mushroom Swiss Burgers would you like to order?
1

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
1
How many De Anza Burgers would you like to order?
6

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
6
Leaving function getInputs() to function calculate() ... 


Are you a student? Enter yes or no in the form (y/n): 
n


__________________________________________________________________________________________________________
|                  |               |            |               |              |                         |
|                  |               |            |               |              |                         |
|    FOOD ITEM     |   QUANTITY    |    COST    |  BEFORE TAX   |  TAX AMOUNT  |  TOTAL PRICE AFTER TAX  |
|                  |               |            |               |              |                         |
|__________________|_______________|____________|_______________|______________|_________________________|
|  De Anza Burger  |      6.0      |    5.25    |     49.35      |     4.44       |     53.79               |
|  Mushroom Swiss  |      1.0      |    5.95    |     49.35      |     4.44       |     53.79               |
|  Don Cali Burger  |      2.0      |    5.95    |     49.35      |     4.44       |     53.79               |
|________________________________________________________________________________________________________|
|        |               |            |                                                                  |
|        |               |            |                                                                  |
|  TAX   |   CUPERTINO   |   9.000%   |    Santa Clara                                                   |
|        |               |            |                                                                  |
|________|_______________|____________|__________________________________________________________________|







               SAMPLE 2:
 Welcome to De Anza Grill Burger Club! 
   Grill Hours are 10:35AM - 7:30PM 
         No Substitutions.         
 
         1. De Anza Burger:          
       Charbroiled Beef Patty,       
         Green Leaf, Tomato,         
      Red Onion, White Cheddar       
          on a Toasted Bun. 
           Price: 5.25
 
          2. Bacon & Cheese:         
        Charbroiled Beef Patty,      
             Smoked Bacon,           
           Carmelized Onion,         
          & American Cheese          
           on a Toasted Bun.         
            Price: 5.75
 
         3. Mushroom Swiss:          
        Beef Patty, Mushrooms        
       & Swiss Cheese, Garlic        
      Mayo, Green Leaf Lettuce,      
             & Tomato                
          on a Toasted Bun.          
           Price: 5.95
 
        4. Western Burger:           
      Charbroiled Beef Patty,        
    Beer Battered Onion Rings,       
       Sriracha BBQ Sauce &,         
          American Cheese            
         on a Toasted Bun.           
          Price: 5.95
 
        5. Don Cali Burger:          
       Charbroiled Beef Patty,       
         Spring Mix Lettuce          
         Tomato, Red Onion,          
       Avocado, Smoked Gouda         
          on a Toasted Bun.         
           Price: 5.95
 
Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
5
How many Don Cali Burgers would you like to order?
2

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
3
How many Mushroom Swiss Burgers would you like to order?
7

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
1
How many De Anza Burgers would you like to order?
1

Use numbers 1-5 to order one of our fine burgers.
Press 6 to exit the menu when done ordering.
6
Leaving function getInputs() to function calculate() ... 


Are you a student? Enter yes or no in the form (y/n): 
y


__________________________________________________________________________________________________________
|                  |               |            |               |              |                         |
|                  |               |            |               |              |                         |
|    FOOD ITEM     |   QUANTITY    |    COST    |  BEFORE TAX   |  TAX AMOUNT  |  TOTAL PRICE AFTER TAX  |
|                  |               |            |               |              |                         |
|__________________|_______________|____________|_______________|______________|_________________________|
|  De Anza Burger  |      1.0      |    5.25    |     58.8      |     0.0       |     58.8               |
|  Mushroom Swiss  |      7.0      |    5.95    |     58.8      |     0.0       |     58.8               |
|  Don Cali Burger  |      2.0      |    5.95    |     58.8      |     0.0       |     58.8               |
|________________________________________________________________________________________________________|
|        |               |            |                                                                  |
|        |               |            |                                                                  |
|  TAX   |   CUPERTINO   |   9.000%   |    Santa Clara                                                   |
|        |               |            |                                                                  |
|________|_______________|____________|__________________________________________________________________|
*/