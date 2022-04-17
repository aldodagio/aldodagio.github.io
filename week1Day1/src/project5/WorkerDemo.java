/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This program uses the ProductionWorker class to access methods from the parent class Employee,
 * as well as its own unique methods. The ProductionWorker class accesses the name, number, date hired, shift,
 * and the pay rate for select employees. The overloaded constructor demonstrates how to properly create a 
 * ProductionWorker object and prints it out. Then, another ProductionWorker object is created to demonstrate
 * a user customized object that sets the values from a user. These values are validated by methods in the
 * ProductionWorker class. 
 * Date: 10/06/2021
 * 
 * */


package project5;

import java.util.Scanner;

public class WorkerDemo {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Here's the first production worker: \n");
		ProductionWorker aldo = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.50);
		System.out.print(aldo + "\n\n");
		ProductionWorker aldo1 = new ProductionWorker();
		System.out.print("Demonstrating user input validation: \n\n");
		System.out.print("Enter the employee name (ex: John Doe): \n");
		aldo1.setName(input.nextLine());
		System.out.print("Enter the employee number (ex: 555-L): \n");
		aldo1.setEmployeeNumer(input.nextLine());
		System.out.print("Enter the employee hire date (ex: 11-19-2000): \n");
		aldo1.setHireDate(input.nextLine());
		System.out.print("Enter the employee workers shift (Day = 1 or Night = 2): \n");
		aldo1.setShift(input.nextInt());
		System.out.print("Enter the employee pay rate (ex: 100): \n");
		aldo1.setPayRate(input.nextDouble());
		System.out.print("Here's the second production worker: \n");
		System.out.print(aldo1 + "\n");
	}

}
