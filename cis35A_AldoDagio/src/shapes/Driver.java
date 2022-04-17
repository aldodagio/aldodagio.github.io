// CIS35A - Aldo Dagio
// Description - Program uses Comparable interface to compare the sizes of different shape objects. 


package shapes;

public class Driver {

	public static void main(String[] args) {
		
		/*Triangle tri = new Triangle();
		tri.getInputs();
		tri.getArea();
		tri.getPerimeter();
		System.out.println(tri.toString());*/
		
		 {
			
			 Circle circle1 = new Circle(5.12);
			 Circle circle2 = new Circle(5.1);
			 
			 Circle circle = (Circle)GeometricObject.max(circle1, circle2);
			 System.out.println("The max circle's area is " +
			 circle.getArea());
			 System.out.println("");
			 System.out.println(circle);
			 System.out.println("");
			 
			 Rectangle rec1 = new Rectangle(5, 10);
			 Rectangle rec2 = new Rectangle(10, 15);
			 
			 Rectangle rec = (Rectangle)GeometricObject.max(rec1, rec2);
			 System.out.println("The max Rectangle's area is " +
			 rec.getArea());
			 System.out.println("");
			 System.out.println(rec);
			 
			 }
	}
	
}

/*

The max circle's area is 82.35496645826427

Object has color: white and filled: false

The max Rectangle's area is 150.0

Object has color: white and filled: false

*/