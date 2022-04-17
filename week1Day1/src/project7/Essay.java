/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The Essay class overrides the setScore class
 * and checks for input validation using the private checkValue
 * method. The four fields that determine the grade of an 
 * essay are all passed through a constructor for Essay as well 
 * as the setScore method.
 * Date: 10/26/2021
 * 
 * */

package project7;

import java.util.Scanner;

public class Essay extends GradedActivity {
	
	static Scanner input = new Scanner(System.in);
	private double grammer;
	private double spelling;
	private double correctLength;
	private double content;
	
	public Essay() {}
	public Essay(double g, double s, double cl, double c) {
		
		grammer = g;
		spelling = s;
		correctLength = cl;
		content = c;
		
	}
	/*
	 * sets the individual components for the grade of an essay and checks
	 * to see if each value is valid or invalid. 
	 * @param double gr, double sp, double len, double cnt
	 * */
	public void setScore(double gr, double sp, double len, double cnt) {
		grammer = gr;
		checkValue(grammer);
		spelling = sp;
		checkValue(spelling);
		correctLength = len;
		checkValue(correctLength);
		content = cnt;
		checkValue(content);
	}
	public void setGrammer(double g) {
		grammer = g;
		checkValue(grammer);
	}
	public void setSpelling(double s) {
		spelling = s; 
		checkValue(spelling);	
	}
	public void setCorrectLength(double c) { 
		correctLength = c; 
		checkValue(correctLength);	
	}
	public void setContent(double c) { 
		content = c; 
		checkValue(content);
	}
	public double getGrammer() { return grammer; }
	public double getSpelling() { return spelling; }
	public double getCorrectLength() { return correctLength; }
	public double getContent() { return content; }
	public double getScore() { 
		setScore(grammer+spelling+correctLength+content);
		return grammer+spelling+correctLength+content;
	}
	/*
	 * returns true once all values have been checked for validation.
	 * @param double dummy
	 * */
	private boolean checkValue(double dummy) {
		
		if(dummy == grammer) {
			while(dummy > 30 || dummy < 0) {
				System.out.print("The point total for grammer should be between 0 and 30 points. Please enter a valid number. \n");
				dummy = input.nextDouble();
			}
		grammer = dummy;
		}
		else if(dummy == spelling) {
			while(dummy > 20 || dummy < 0) {
				System.out.print("The point total for spelling should be between 0 and 20 points. Please enter a valid number. \n");
				dummy = input.nextDouble();
			}
		
		spelling = dummy;
		}
		else if(dummy == correctLength) {
			while(dummy > 20 || dummy < 0) {
				System.out.print("The point total for the correct length should be between 0 and 20 points. Please enter a valid number. \n");
				dummy = input.nextDouble();
			}
		
		correctLength = dummy;
		}
		else if(dummy == content) {
			while(dummy > 30 || dummy < 0) {
				System.out.print("The point total for content should be between 0 and 30 points. Please enter a valid number. \n");
				dummy = input.nextDouble();
			}
		
		content = dummy;
		}
		else 
			System.out.print("The value passed doesn't match any of the values for the Essay categories.");
		
		return true;
	}

	@Override
	public String toString() {
		
		return "Term Paper: \n" + "Grammer points: " + grammer + "\nSpelling points: " + spelling + "\nLength points: " + correctLength + "\nContent points: " + content + "\n" + "Total Points: " + getScore() + "\nGrade: " + getGrade();
		
	}
	
}
