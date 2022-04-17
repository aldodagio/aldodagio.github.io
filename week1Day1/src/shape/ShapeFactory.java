package shape;

public class ShapeFactory {
	
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("CIRCLE")) {
		return new Circle(); 
		}
		else if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle(); 
			}
		else if(type.equalsIgnoreCase("SQUARE")) {
			return new Square(); 
			}
		else return null;
	}

}
