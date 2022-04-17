/*
 * Programmer: Aldo Dagio-Ortega
 * Description: This simple interface defines the signature of three
 * methods that are later used in the CourseGrades class to calculate 
 * and search for values.
 * Date: 10/26/2021
 * 
 * */

package project7;

public interface Analyzable {
	
	public double getAverage();
	public GradedActivity getHighest();
	public GradedActivity getLowest();

}
