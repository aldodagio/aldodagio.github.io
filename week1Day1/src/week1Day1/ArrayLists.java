package week1Day1;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * Programmer:
 * Description:
 * Date:
 * 
 * */
public class ArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList <String> employee = new ArrayList<String>();
		employee.add("Anna");
		employee.add("Tom");
		employee.add("David");
		System.out.println(employee);
		System.out.println(employee.size());
		System.out.println(employee.get(1));
		employee.add(3,"linus");
		for(int i = 0; i < employee.size();i++)
			System.out.println(employee.get(i));
		employee.remove(3);
		for(int i = 0; i < employee.size();i++)
			System.out.println(employee.get(i));
		employee.add("anna");
		Collections.sort(employee);
		for(int i = 0; i < employee.size();i++)
			System.out.println(employee.get(i));
	}

}
