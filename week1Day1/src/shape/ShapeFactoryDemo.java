package shape;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = factory.getShape("SQUARE");
		shape2.draw();
		
		Shape shape3 = factory.getShape("RECTANGLE");
		shape3.draw();
	}

}
