package week1Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
	
	Set<Integer> setA = new HashSet<>();
	Integer[] arr = {1,2,5,8,3};
	/*setA.add(1);
	setA.add(2);
	setA.add(5);
	setA.add(8);
	setA.add(3);*/
	setA.addAll(Arrays.asList(arr));
	System.out.println(setA);
	Set<Integer> setB = new HashSet<>();
	setB.add(4);
	setB.add(9);
	setB.add(1);
	setB.add(2);
	setB.add(-1);
	setB.add(78);
	System.out.println(setB);
	//setB.retainAll(setA); // intersection == or
	//setB.addAll(setA); // union == and
	setB.removeAll(setA); // xor
	System.out.println("Difference: " + setB);
	
	boolean contain = setA.contains(8);
	System.out.println(contain);
	

	
	}
}
