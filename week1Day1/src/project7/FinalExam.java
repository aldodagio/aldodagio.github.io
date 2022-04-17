/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This class uses three fields to determine the score
 * of the final exam. The determination is based on 
 * the number of questions, the number of questions missed, and the 
 * point value for each question.  
 * Date: 10/26/2021
 * 
 * */

package project7;

public class FinalExam extends GradedActivity {
	
	private int numQuestions;
	private int numMissed;
	private  double pointsEach;
	
	public FinalExam() {}
	public FinalExam(int numQ, int numM) {
		double numericScore;
		numQuestions = numQ;
		numMissed = numM;
		pointsEach = 100 / numQuestions;
		numericScore = 100-(numMissed*pointsEach);
		setScore(numericScore);
	}
	
	public void setNumQuestions(int numQ) { numQuestions = numQ; }
	public void setPointsEach(double points) { pointsEach = points; }
	public void setNumMissed(int numM) { numMissed = numM; }
	public double getNumQuestions() { return numQuestions; }
	public double getPointsEach() { return pointsEach; }
	public double getNumMissed() { return numMissed; }

}
