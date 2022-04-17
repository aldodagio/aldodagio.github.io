package project9;

import java.util.Objects;

public class Task implements Comparable<Task> {
	private int priority;
	private String description;
	
	public Task() {
		priority = 1;
		description = "";
	}
	public Task(int aPriority, String aDescription) {
		priority = aPriority;
		description = aDescription; 
	}
	/*
	 * Takes an instance of Task object and checks
	 * to see if the priority is greater, less than
	 * or equal to the other members.
	 * @param Task object
	 * @return int value 1,-1 or 0
	 * */
	@Override
	public int compareTo(Task task) {
		if(priority > task.priority)
			return 1;
		else if(priority < task.priority)
			return -1;
		else return 0;
	}
	/*
	 * Takes an object and casts it to the Task object.
	 * The description of the Task object is then compared
	 * to the local description to check if they are 
	 * the same description or not. 
	 * @param Object obj
	 * @return boolean true or false 
	 * */
	@Override
	public boolean equals(Object obj) {
		Task task = (Task) obj;
		if(description.equalsIgnoreCase(task.description))
			return true;
		else return false;
	}
	/*
	 * Returns a hashcode for the description of a Task object.
	 * @param none
	 * @return int value
	 * */
	@Override
	public int hashCode() {
		return Objects.hash(description);
	}
	/*
	 * Returns the description of the Task object
	 * @param none
	 * @return String value
	 * */
	@Override 
	public String toString() {
		return description;
	}
	
}
