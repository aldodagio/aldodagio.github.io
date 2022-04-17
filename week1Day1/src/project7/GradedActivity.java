/*
 * Programmer: Aldo Dagio-Ortega
 * Description: The GradedActivity class uses simple methods to set
 * the score of an activity. It also uses a method to sort for the correct
 * letter grade based on the numeric score.  
 * Date: 10/26/2021
 * 
 * */

package project7;

public class GradedActivity {
	
	private double score;
	
	
	public GradedActivity() {}
	public GradedActivity(double s) { score = s; }
	public void setScore(double s) { score = s; }
	public double getScore() { return score; }
	/*
	 * returns the letter grades based on the numeric score.
	 * @param none
	 * */
	public char getGrade() { 
		char grade = 0;
		if(score >= 0 && score <= 100) {
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else if(score<60) 
			grade = 'F';
		}
		
		return grade; 
		}
	

}
