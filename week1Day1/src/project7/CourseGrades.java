/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This CourseGrades class uses an array of GradedActivity objects 
 * to store individual graded activities such as Exam, Lab, FinalExam and PassFailExam.
 * The exams are then sorted through in methods to find the highest of the grades and
 * lowest of the grades. A method to calculate the average grade is also defined. toString 
 * method is overridden to print directly in the main method.  
 * Date: 10/26/2021
 * 
 * */

package project7;

public class CourseGrades implements Analyzable {
	
	private GradedActivity[] grades = new GradedActivity[4];
	
	public void setLab(GradedActivity aLab) { grades[0] = aLab; }
	public void setPassFailExam(PassFailExam aPassFailExam) { grades[1] = aPassFailExam; }
	public void setEssay(Essay anEssay) { grades[2] = anEssay; }
	public void setFinalExam(FinalExam aFinalExam) { grades[3] = aFinalExam; }
	/*
	 * returns the average of all the objects individual scores.
	 * @param none
	 * */
	public double getAverage() { 
		double sum = 0;
		
		for(int i = 0; i < grades.length; i++)
			sum += grades[i].getScore();
		
		return sum/grades.length;
	}
	/*
	 * returns a reference of the object that had the highest score.
	 * @param none
	 * */
	public GradedActivity getHighest() {
		GradedActivity g = new GradedActivity();
		double max = 0;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i].getScore() > max) {
				max = grades[i].getScore();
				g = grades[i];
			}
		}
		return g;
	}
	/*
	 * returns a reference of the object that had the lowest score.
	 * @param none
	 * */
	public GradedActivity getLowest() {
		GradedActivity g = new GradedActivity();
		double min = 100;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i].getScore() <= min) {
				min = grades[i].getScore();
				g = grades[i];
			}
		}
		return g;
	}
	
	@Override
	public String toString() {
		
		return "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() +  "\nPass/Fail Exam Score: " + grades[1].getScore() + "     Grade: " + grades[1].getGrade() + "\nEssay Score: " + grades[2].getScore() + "       Grade:" + grades[2].getGrade() + "\nFinal Exam Score: " + grades[3].getScore() + "  Grade:" + grades[3].getGrade() + "\nAverage score: " + getAverage() + "\nHighest score: " + getHighest().getScore() + "\nLowest score: " + getLowest().getScore();
		
	}
	
	

}
