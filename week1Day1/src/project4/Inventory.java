package project4;

import java.util.Scanner;



public class Inventory {
	
	Scanner input = new Scanner(System.in);
	private int itemNo;
	private int quant;
	private double cost;
	
	// Default Inventory constructor with default values set. 
	public Inventory() {
		itemNo = 0;
		quant = 0;
		cost = 0;
	}
	// Overloaded Inventory constructor with three parameters to set the Inventory object to custom values. 
	public Inventory(int itemNo, int quant, double cost) {
		this.itemNo = itemNo;
		setItemNo(itemNo);
		this.quant = quant;
		setQuantity(quant);
		this.cost = cost;
		setCost(cost);
	}
	/*
	 * Pre: passes an argument of an integer, which is the item number to be set.
	 * Post: sets item number to desired number. Then checks for valid int greater or equal to 0. 
	 * Return: none
	 * */
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
		validInt(itemNo);
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: item number of type int
	 * */
	public int getItemNo() {
		return itemNo;
	}
	/*
	 * Pre: passes an argument of an integer, which is the quantity to be set.
	 * Post: sets quantity to desired number. Then checks for valid quantity greater or equal to 0. 
	 * Return: none
	 * */
	public void setQuantity(int quant) {
		this.quant = quant;
		validInt(quant);
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: quantity of type int
	 * */
	public int getQuantity() {
		return quant;
	}
	/*
	 * Pre: passes an argument of a double, which is the item number to be set.
	 * Post: sets cost to desired number. Then checks for valid double greater or equal to 0. 
	 * Return: none
	 * */
	public void setCost(double cost) {
		this.cost = cost;
		validDouble(cost);
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: cost of type double
	 * */
	public double getCost() {
		return cost;
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: total cost of type double
	 * */
	public double getTotalCost() {
		return (this.cost*this.quant);
	}
	/*
	 * Pre: passes an argument of an integer, which is the integer to be validated.
	 * Post: checks if number is item number or quantity, then checks to see if the integer is valid. Takes user input until a valid integer is entered. 
	 * Return: true or false.
	 * */
	public Boolean validInt(int num) {
		if(num == this.itemNo)
		{
		if(num >= 0) {
			System.out.println("Good data. Integer value accepted ...");
		}
		else { 
			while(num < 0)
			{
				num = 0;
				System.out.println("Please re-enter the data. The number you enter must be a valid integer.");
				System.out.println("Valid integers for item number must be greater than or equal to 0.");
				num = input.nextInt();
			}
			this.itemNo = num;
			System.out.println("Good data. Integer value accepted ...");
		}
		}
		if(num == this.quant)
		{
		if(num >= 0) {
			System.out.println("Good data. Integer value accepted ...");
		}
		else { 
			while(num < 0)
			{
				num = 0;
				System.out.println("Please re-enter the data. The number you enter must be a valid integer.");
				System.out.println("Valid integers for quantity must be greater than or equal to 0.");
				num = input.nextInt();
			}
			this.quant = num;
			System.out.println("Good data. Integer value accepted ...");
		}
		}
		return true;
	}
	/*
	 * Pre: passes an argument of an double, which is the double to be validated.
	 * Post: checks to see if the double is valid. Takes user input until a valid double is entered. 
	 * Return: true or false.
	 * */
	public Boolean validDouble(double num) {
		if(num >= 0) {
			System.out.println("Good data. Double value accepted ...");
		}
		else { 
			while(num < 0)
			{
				num = 0;
				System.out.println("Please re-enter the data. The number you enter must be a valid double.");
				System.out.println("Valid doubles for cost must be greater than or equal to 0.");
				num = input.nextDouble();
			}
			this.cost = num;
			System.out.println("Good data. Double value accepted ...");
		}
		return true;
	}

}
