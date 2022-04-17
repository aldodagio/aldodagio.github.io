package shapes;

import java.util.Scanner;
import java.lang.Math;

public class Triangle extends GeometricObject {

	private double side1, side2, side3, area, perimeter;
	
	
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void getInputs() 
	{
		 double sides[] = new double[3];
		Scanner points = new Scanner(System.in); 
		for(int i = 0; i < sides.length; i++)
		{
			System.out.println("Enter two points to create each side of the triangle.");
			double p1 = points.nextDouble();
			double p2 = points.nextDouble();
			sides[i] = Math.abs(p1)+Math.abs(p2);
		}
		
		side1 = sides[0];
		side2 = sides[1];
		side3 = sides[2];
	}
	
	public double getArea()
	{
		double temp = side1+side2+side3;
		double s = temp/2;
		
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		return area;
	}
	
	public double getPerimeter()
	{
		perimeter = side1+side2+side3;
		return perimeter;
	}
	
	 public String toString() 
	 {
		 return "Triangle has area: " + Math.round(area*100.0)/100.0 +  " and perimeter: " + Math.round(perimeter*100.0)/100.0 
				 + "\n Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3;
	 }
	
}
