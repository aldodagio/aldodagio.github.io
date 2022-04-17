/*
 * Programmers: Aldo Dagio, Gerson Beltran, Miguel Oh
 * Description: This class stores employee information such as name
 * and salary into an object. It uses constructors to initialize values
 * and it can raise an employees salary by a percentage using the 
 * raiseSalary method. 
 * Date: 09/22/2021
 * 
 * */

package week1Day1;

public class Employee {
	
	private String name;
	private double salary;
	
	
	// defualt constructor setting employee to default values
	public Employee() {
		this(" default ", 0);
	}
	// overloaded constructor which takes custom arguments for name and salary
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: name of type String
	 * */
	public String getName() {
		return this.name;
	}
	/*
	 * Pre: none
	 * Post: none
	 * Return: salary of type double 
	 * */
	public double getSalary() {
		return this.salary;
	}
	/*
	 * Pre: passes an argument of a double, which is the percent salary will be raised by.
	 * Post: calculates new salary determined by percent 
	 * Return: none
	 * */
	public void raiseSalary(double byPercent) {
		byPercent /= 100;		// get the percentage to decimal form
		byPercent *= this.salary; // multiply previous salary by the percent to be added
		this.salary += byPercent; // add the percentage to the old salary, which gives you the new salary
	}

}
