/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This class checks whether a grade is a 'P' for pass
 * or a 'F' for fail based on the minimum passing score which is passed
 * through a constructor and is a private field belonging to this class.
 * Date: 10/26/2021
 * 
 * */

package project7;

public class PassFailActivity extends GradedActivity {

	private double minPassingScore;
	
	public PassFailActivity() {}
	public PassFailActivity(double min) { minPassingScore = min; }
	/*
	 * returns the letter 'P' if score is above minimum passing score
	 * and returns the letter 'F' if score is less than minimum passing 
	 * score.
	 * @param none
	 * */
	public char getGrade() {
		char grade = 0;
		if(getScore() >= 0 && getScore() <= 100) {
		if(getScore()>=minPassingScore)
			grade = 'P';
		else if(getScore()<minPassingScore) 
			grade = 'F';
		}
		
		return grade; 
		}
	
}
