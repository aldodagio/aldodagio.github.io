/*
 * Programmers: Aldo Dagio, Gerson Beltran, Miguel Oh
 * Description: The main method initializes an object using an overloaded
 * constructor. It then demonstrates how to raise an employees salary. 
 * Finally it prints the new salary using the getSalary method. 
 * Date: 09/22/2021
 * 
 * */

package week1Day1;

public class Main {

	public static void main(String[] args) {
		Employee harry = new Employee("Hacker, Harry", 50000);
		harry.raiseSalary(10);
		System.out.printf(harry.getName() + "'s new salary is $%.2f", harry.getSalary());
	}
	
}
