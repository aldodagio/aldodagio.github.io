package finalPart1;

public interface OrderInterface {

	final double[] priceArr = {5.25, 5.75, 5.95, 5.95, 5.95};
	final String[] item = {"De Anza Burger","Bacon & Cheese","Mushroom Swiss","Western Burger","Don Cali Burger"};
	final double TAX = 0.09;
	
	void display();
	void getInputs();
	void calculate();
	void printBill();
	
	void saveBillToFile();
	
}
