package week1Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class practice4 {
	static ArrayList <String> employees = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);
	static int option;
	static void addEmployee()
	{
		System.out.println("Enter the employee name and enter -1 once you are finished..");
		while(input.hasNext())
		{
			String name = input.next();
			if(name.equals("-1"))
				break;
			else
				employees.add(name);
		}
	}
	static void removeEmployee()
	{
		System.out.println("Which employee do you want to remove?");
		employees.remove(input.next());
	}
	static void displayName()
	{
		System.out.println(employees);
		for(int i = 0; i < employees.size();i++)
			System.out.printf("employee[%d] = %s", i,employees.get(i));
	}
	public static void main(String[] args) {
		System.out.println("1- Add a new Employee\r\n" + 
				"2- Remove an Employee\r\n" + 
				"3- Insert new Employee \r\n" + 
				"4- Sort in descending order\r\n" + 
				"5- Search for an employee\r\n" + 
				"6- Display the list of employees\r\n" + 
				"7- Quit the program exit()\r\n" + 
				"\r\n"
				+ "option: " );
		option = input.nextInt();
		switch (option)
		{
		case 1: addEmployee();
		break;
		case 2: displayName();
		case 7: System.exit(0);
		}
		while(option != 8);
	}

}
