/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The ToDoListTester class demonstrates the 
 * capabilities of the ToDoList class by instantiating an
 * object and using its methods to add and remove tasks. 
 * Date: 11/11/2021
 * 
 * */


package project9;

public class ToDoListTester {
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.run();
		System.out.print("Adding the following 6 items to the list. \n"
				+"add 1 Complete Programming Exercise 15.11 \n"
				+ "add 8 Read for tomorrow's class \n"
				+ "add 3 Soccer practice \n"
				+ "add 6 Call parents \n"
				+ "add 5 Have dinner with friends \n"
				+ "add 9 Sleep well \n");
		list.addTask("add 1 Complete Programming Exercise 15.11");
		list.addTask("add 8 Read for tomorrow's class");
		list.addTask("add 3 Soccer practice");
		list.addTask("add 6 Call parents");
		list.addTask("add 5 Have dinner with friends");
		list.addTask("add 9 Sleep well");
		System.out.print("\nEntering 'add bad command' \n");
		list.addTask("add bad command");
		System.out.print("Expected: The priority must be an integer between 1 and 9. \n\n"
				+ "Pulling most urgent items out. \n");
		list.nextTask();
		System.out.print("Expected: Complete Programming Exercise 15.11 \n");
		list.nextTask();
		System.out.print("Expected: Soccer practice \n");
		list.nextTask();
		System.out.print("Expected: Have dinner with friends \n");
		list.nextTask();
		System.out.print("Expected: Call parents \n");
		list.nextTask();
		System.out.print("Expected: Read for tomorrow's class \n");
		list.nextTask();
		System.out.print("Expected: Sleep well \n");
		list.nextTask();
		System.out.print("Expected: There are no tasks in this list \n");
		list.addTask("add 2 Wash dishes");
		list.addTask("add 1 Wash dishes");
		list.nextTask();
		list.nextTask();
		list.addTask("add 25 play bball");
		list.nextTask();
	}	
}
