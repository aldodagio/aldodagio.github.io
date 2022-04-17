/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Employee class has three private attributes that belong to each object
 * of type Employee. It uses accessors and mutators to set and get these attributes.It
 * also has a method for input validation for all possible wrong cases for employee number.
 * The new, correct employee number will be taken in by the user and stored in a scanner
 * object which is the other field that belongs to Employee. 
 * Date: 10/06/2021
 * 
 * */

package project5;

import java.util.Scanner;

public class Employee {
	
	static Scanner input = new Scanner(System.in);
	private String name;
	private String employeeNumber;
	private String hireDate;
	
	public Employee() {
		name = employeeNumber = hireDate = "";
	}
	public Employee(String n, String num, String date) {
		name = n;
		employeeNumber = num;
		hireDate = date;
	}
	
	public void setName(String n) { name = n; }
	public void setEmployeeNumer(String num) { 
		employeeNumber = num;
		isValidEmpNum(num);
	}
	public void setHireDate(String date) { hireDate = date; }
	public String getName() { return name; }
	public String getEmployeeNumber() { return employeeNumber; }
	public String getHireDate() { return hireDate; }
	
	private boolean isValidEmpNum(String e) { 
		
		while(e.length() != 5 || !Character.isDigit(e.charAt(0)) || !Character.isDigit(e.charAt(1)) || !Character.isDigit(e.charAt(2)) ||  e.charAt(3) != '-' || !Character.isLetter(e.charAt(4))) {
		if(e.length() > 5) {
			System.out.print("The employee number you entered is greater than 5 characters total. \n"
					+ "The employee number should be 5 characters total. In the following format XXX-A, \n"
					+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
			e = input.nextLine();
		}
		else if (e.length() < 5) {
			System.out.print("The employee number you entered is less than 5 characters total. \n"
					+ "The employee number should be 5 characters total. In the following format XXX-A, \n"
					+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
			e = input.nextLine();
		}
		
		else if(!Character.isDigit(e.charAt(0))) {
					System.out.print("The employee number you entered has an invalid digit in the first character place. \n"
							+ "The first character should be a digit 0-9. The employee number should be 5 characters total. In the following format XXX-A, \n"
							+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
					input.hasNext();
					e = input.nextLine();
		}
		else if(!Character.isDigit(e.charAt(1))) {
				System.out.print("The employee number you entered has an invalid digit in the second character place. \n"
						+ "The second character should be a digit 0-9. The employee number should be 5 characters total. In the following format XXX-A, \n"
						+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
				e = input.nextLine();
		}
		else if(!Character.isDigit(e.charAt(2))) {
				System.out.print("The employee number you entered has an invalid digit in the third character place. \n"
						+ "The third character should be a digit 0-9. The employee number should be 5 characters total. In the following format XXX-A, \n"
						+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
				e = input.nextLine();
		}		
		else if(e.charAt(3) != '-') {
			System.out.print("The employee number you entered has an invalid entry in the fourth character place. \n"
					+ "The fourth character should be a dash '-'. The employee number should be 5 characters total. In the following format XXX-A, \n"
					+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
			e = input.nextLine();
		}
		else if(!Character.isLetter(e.charAt(4))) {
			System.out.print("The employee number you entered has an invalid letter in the fifth character place. \n"
					+ "The fifth character should be a letter A-Z. The employee number should be 5 characters total. In the following format XXX-A, \n"
					+ "where 'XXX' is three numerical digits, '-' is a simple dash, and 'A' is a letter A-Z. \n");
			e = input.nextLine();
		}
		}
		employeeNumber = e;
							
				return true;
		}
	@Override
	public String toString() {
		return "Name: " + name + " \nEmployee Number: " + employeeNumber + " \nHire Date: " + hireDate + " \n";
		}
	
}
