
public class ShapeTest {
	
	public static void main (String[] args) {
		Shape polygon = new Shape();
		System.out.println(polygon.toString());
		polygon.setColor("purple");
		polygon.setFilled(false);
		System.out.println("Polygon is now " + polygon.getColor() + " and filled is " + polygon.isFilled());
		
		Square square = new Square(3.0);
		System.out.println(square.toString());
		square.setSide(2.0);
		System.out.println("New square: " + square.toString());
		
		Rectangle rectangle = new Rectangle(2.0, 4.0, "blue", false);
		System.out.println(rectangle.toString());
		rectangle.setColor("green");
		rectangle.setWidth(6.0);
		System.out.println("New rectangle: " + rectangle.toString());
	}

}
