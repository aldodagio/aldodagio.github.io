/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This class uses three fields to determine whether
 * an exam score is a pass or fail. The determination is based on 
 * the number of questions, the number of questions missed, and the 
 * minimum value to pass the exam which is passed through a super
 * constructor. 
 * Date: 10/26/2021
 * 
 * */

package project7;

public class PassFailExam extends PassFailActivity {
	
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public PassFailExam() {}
	public PassFailExam(int numQ, int numM, int min) { 
		super(min);
		double numericScore;
		numQuestions = numQ;
		numMissed = numM;
		if(numQuestions != 0) {
		pointsEach = 100 / numQuestions;
		numericScore = 100-(numMissed*pointsEach);
		setScore(numericScore);
		}
	}
	public double getPointsEach() { return pointsEach; }
	public int getNumMissed() { return numMissed; }

	
}
