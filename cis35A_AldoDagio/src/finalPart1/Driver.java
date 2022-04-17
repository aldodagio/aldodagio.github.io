// CIS35A - Aldo Dagio
// Description - Final Part 1 is a more detailed and better functioning program than midterm part 1.
//			   - It has the new capability of saving the receipt to the file Bill.txt.
//			   - The file path is chosen by the user and if there is no order, nothing is printed.
//             - The program still is able to take as many orders as the user wants and calculates
//             - and displays the bill to the user. 

package finalPart1;

public class Driver {

	public static void main(String[] args) {
		
		OrderBurger newOrder = new OrderBurger();
		
		newOrder.display();
		newOrder.getInputs();
		newOrder.calculate();
		newOrder.printBill();
		
		newOrder.saveBillToFile();
		
	}
	
}
