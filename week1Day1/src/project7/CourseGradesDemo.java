/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This program uses a main method to create an instance of the CourseGrades class.
 * The instance is used to demonstrate the capabilities of the CourseGrades class. Using an instance 
 * of the CourseGrades object, a series of other objects can be accessed and initialized. The values
 * of these objects are then printed to the console.  
 * Date: 10/26/2021
 * 
 * */


package project7;

public class CourseGradesDemo {

	public static void main(String[] args) {
		
		CourseGrades demo = new CourseGrades();
		demo.setLab(new GradedActivity(85));
		demo.setPassFailExam(new PassFailExam(20,3,70));
		demo.setEssay(new Essay(25,18,17,20));
		demo.setFinalExam(new FinalExam(50,10));
		
		System.out.print(demo);
		
	}
	
}
