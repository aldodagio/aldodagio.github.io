package project9;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {
	
	private PriorityQueue<Task> q = new PriorityQueue<>();

	/*
	 * This method displays instructions to the user
	 * and runs a loop meant for adding and removing
	 * tasks from a list. The loop is broken when the 
	 * user enters the keyword 'quit'.
	 * @param none
	 * @return none 
	 * */
	public void run() {
		System.out.print("To Do List -Please enter an option \n"
				+ "add priority description (add a new task) \n"
				+ "next (remove and print most urgent task) \n"
				+ "quit (exit this program) \n");
		String in = null;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print(">");
			in = input.nextLine();
			if(in.contains("add"))
				addTask(in);
			else if(in.equalsIgnoreCase("next"))
				nextTask();
		}while(!in.equalsIgnoreCase("quit"));
	
	}
	/*
	 * This method parses the description passed in
	 * the argument and determines if the priority
	 * integer being passed is in bounds and then
	 * takes the rest of the description and passes
	 * both of them to a new Task object. The method
	 * then checks to see if the description already 
	 * exists in the PriorityQueue, if it doesn't 
	 * exist then it is added, if it does then it 
	 * is not added. 
	 * @param description as a string
	 * @return none 
	 * */
	public void addTask(String des) {
		Task task = null;
		int i = 0;
		Scanner input = new Scanner(des);
		String str = input.next();
		if(input.hasNextInt()) {
		   i = input.nextInt();
		}
		if(i >= 1 && i <= 9) {
		task = new Task(i,input.nextLine().trim());
		} else System.out.print("The priority must be an integer between 1 and 9. \n");
		if(task != null) {
		boolean flag = false;
		for(Task t: q) {
			if(task.equals(t)) {
				System.out.print("The description has already been used. All descriptions must be unique to be added to priority queue. \n");
				System.out.print(task.hashCode() + "\n");
				System.out.println(t.hashCode());
				flag = true;
				break;
			}
				}
		if(!flag)
		q.add(task);
		}
	}
	/*
	 * This method checks to see if the PriorityQueue is null,
	 * if it isnt, it prints and removes the next object. If it
	 * is, it lets the user know there are no tasks in the list.
	 * @param none
	 * @return none 
	 * */
	public void nextTask() {
		if(q.peek() != null)
		System.out.print(q.remove() + "\n");
		else System.out.print("There are no tasks in the list. \n");
		
	}

}
