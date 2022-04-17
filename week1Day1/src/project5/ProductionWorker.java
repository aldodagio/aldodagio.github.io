/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The ProductionWorker class inherits from the Employee class. It uses
 * the super() function to set attributes from the parent class and also uses it to access
 * methods from the parent class.  The ProductionWorker class has four attributes that are
 * unique to the ProductionWorker class and it goes along with accessor and mutator functions
 * built for each. It also has a method to validate user input for the shift value. 
 * Date: 10/06/2021
 * 
 * */

package project5;

public class ProductionWorker extends Employee {

	private int shift;
	private double payRate;
	static final int DAY_SHIFT = 1;
	static final int NIGHT_SHIFT = 2;
	
	public ProductionWorker() {
		super();
		shift = 1;
		payRate = 0;
	}
	public ProductionWorker(String n, String num, String date, int sh, double rate) {
		super(n, num, date);
		while(sh != DAY_SHIFT && sh != NIGHT_SHIFT)
		{
			if(sh > NIGHT_SHIFT)
			{
				System.out.print("The shift number you entered is greater than 1 and 2, which is not an acceptable response. \n"
						+ "Remember, for shift number: Day Shift = 1 and Night Shift = 2. Please try again. \n");
				sh = input.nextInt();
			}
			else if(sh < DAY_SHIFT)
			{
				System.out.print("The shift number you entered is less than 1 and 2, which is not an acceptable response. \n"
						+ "Remember, for shift number: Day Shift = 1 and Night Shift = 2. Please try again. \n");
				sh = input.nextInt();
			}
		}
		
		shift = sh;
		payRate = rate;
	}
	public void setShift(int s) { 
		while(s != DAY_SHIFT && s != NIGHT_SHIFT)
		{
			if(s > NIGHT_SHIFT)
			{
				System.out.print("The shift number you entered is greater than 1 or 2, which is not an acceptable response. \n"
						+ "Remember, for shift number: Day Shift = 1 and Night Shift = 2. Please try again. \n");
				s = input.nextInt();
			}
			else if( s < DAY_SHIFT)
			{
				System.out.print("The shift number you entered is less than 1 or 2, which is not an acceptable response. \n"
						+ "Remember, for shift number: Day Shift = 1 and Night Shift = 2. Please try again. \n");
				s = input.nextInt();
			}
		}
			
		shift = s; 
	}
	public void setPayRate(double p) { payRate = p; }
	public int getShift() { return shift; }
	public double getPayRate() { return payRate; }
	public String toString() { 
		String shift = null;
		
		if(this.shift == DAY_SHIFT)
			shift = "Day";
		else if(this.shift == NIGHT_SHIFT)
			shift = "Night";
		
		return super.toString() + "Shift: " + shift + " \n".format("Pay Rate: $%.2f", payRate); 
	}
	
}
