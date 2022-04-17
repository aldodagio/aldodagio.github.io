package shapes;

public class GeometricObject {
	
	 private boolean filled;
	 private String color = "white";
	 private double area;
	
	 public GeometricObject()
	 {
		
	 }
	
	 public GeometricObject(String color, boolean filled)
	 {
		this.color = color;
		this.filled = filled;
	 }

	 public String getColor() 
	 {
	 return color;
	 }
	 
	 public double getArea()
	 {
		 return area;
	 }
	
	 public void setColor(String color) 
	 {
	 this.color = color;
	 }
	
	 public boolean isFilled() 
	 {
	 return filled;
	 }
	
	 public void setFilled(boolean filled)
	 {
	 this.filled = filled;
	 }
	
	 public String toString() 
	 {
		return "Object has color: " + color +  " and filled: " + filled;
	 }
	 
	 public static GeometricObject max(GeometricObject g1, GeometricObject g2)
	 {
		 boolean check = true;
		 
		 if(g1.getArea() > g2.getArea())
		 {
			 check = true;
			 return g1;
		 }
		 else if(g2.getArea() > g1.getArea())
		 {
			 check = false;
			 return g2;
		 }
		 else 
			 System.out.println("The objects are equal. ");
		 
		 return g1=g2;
	 }

}
