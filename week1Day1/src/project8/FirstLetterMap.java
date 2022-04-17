/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The FirstLetterMap class demonstrates how the Map
 * interface works using instances such as TreeMap objects to store
 * keys and values specific to a desired text file. In the main 
 * method, the text file is read word by word and the first letter
 * of each word is extracted using the letter method. Once the letter
 * is extracted, it is passed to the wordSets method so that it a set
 * of words in the desired file can be found which are values mapped to
 * the key. These values are sorted in the wordSets method to find every
 * word in the file that starts with each character key which is defined and
 * passed through in the main. Finally, the character keys are mapped to the
 * TreeSet values using the put function and it is printed to the screen. 
 * Date: 11/03/2021
 * 
 * */

package project8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstLetterMap {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	Map<Character,TreeSet<String>> frequencies = new TreeMap<>();
	Scanner in = new Scanner(new File("test1.txt"));
	Character c = null;
	TreeSet<String> str1 = new TreeSet<>(); 
	ArrayList<Character> ch = new ArrayList<>();
	while(in.hasNext()) {
		String s = in.next();
		c = letter(s);
		ch.add(c);
		str1= wordSets(c);
		frequencies.put(c,str1);
	}
	
	for(Character key: frequencies.keySet()) {
		System.out.print(key + ": " + frequencies.get(key) + "\n");
	}
	}

/*
 * Extracts the first character of a word
 * @param s a string
 * @return a Character 
 * */
public static Character letter(String s) {
	
	char c = 0;
	
	for(int i = 0; i < s.length(); i++)
		 c = s.toLowerCase().charAt(0);
	
	return c;
}
/*
 * Takes a Character parameter k and finds every word 
 * in a file that begins with that Character k
 * @param s a string
 * @return a TreeSet<String>  
 * */
public static TreeSet<String> wordSets(Character k) throws FileNotFoundException {
	
	Scanner in1 = new Scanner(new File("test1.txt"));
	TreeSet<String> str1 = new TreeSet<>();
	while(in1.hasNext()) {
	String r = "";
	String s = in1.next();
		if(k.equals(s.toLowerCase().charAt(0))) {
				r = r + s; 
		if(!Character.isLetter(s.charAt(s.length()-1))) {
			    r = s.substring(0, s.length()-1);
		}
		}
		if(!r.isBlank()) {
		str1.add(r.toLowerCase());
		}
	}
	return str1;
}
}