/* 
 * @author: Aldo Dagio-Ortega
 * Description: This program is designed to read and write from a file. It has methods 
 * to calculate averages and find the lowest test score. 
 * Date: 09/20/2021
 * @version: 1
*/

package week1Day1;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class project3 {
	static String fname;
	static ArrayList<Double> scores = new ArrayList<Double>();
	static ArrayList<String> names = new ArrayList<String>();
	static Scanner input;
	static void readData(){
		String ln = null;
		
		
		try {
			FileInputStream f1 = new FileInputStream(fname);
			input = new Scanner(f1);
			while(input.hasNext())
			{
				//if(input.hasNextDouble())
				//scores.add(Double.parseDouble(input.next()));
				while(input.hasNext())
				{
					String temp = null;
					 if(input.hasNextDouble())
						 scores.add(Double.parseDouble(input.next()));
				else {
						ln = input.next();
						if(temp == null)
							temp = ln;
						else
							names.add(temp + " " + ln);
						}
					
				}
					
			}
		
		}
			catch (IOException e) {
				System.out.println("File not found.");
				System.exit(1);
			} 
		
	}
	//static double calculateAverage(ArrayList<Double> scores) {}
	//static double findLowestScore(ArrayList<Double> scores) {}
	static void writeData() {}
	//static double classAverage() {}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Scanner input = new Scanner(System.in);
		fname = input.nextLine();
		readData();
		System.out.println(scores);
		
	}

}
