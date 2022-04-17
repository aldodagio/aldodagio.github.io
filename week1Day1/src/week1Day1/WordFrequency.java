package week1Day1;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// this program prints the frequencies of all words in "Alice in Wonderland"
public class WordFrequency {

	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String,Integer> frequencies = new TreeMap<>();
		Scanner in = new Scanner(new File("alice30.txt"));
		while(in.hasNext()) {
			String word = clean(in.next());
			System.out.println(word);
			//get the old frequency count
			Integer count = frequencies.get(word);
			if(count == null) 
				count = 1;
			else
				count += 1; 
			frequencies.put(word, count);
		}
		for(String key: frequencies.keySet()) {
			System.out.printf("%-20s %10d%n", key, frequencies.get(key));
		}
		
		
	}
	/*
	 * Removes characters from a string that are not letters,
	 * @param s a string
	 * @return a string with all the letters from S
	 * */
	public static String clean(String s) {
		
		String r = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				r = r + c;
			}
		}
		return r.toLowerCase();
	}
}
