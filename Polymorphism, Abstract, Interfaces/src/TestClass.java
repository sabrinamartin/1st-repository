
public class TestClass {
	
	public static void main (String[] args) {
		Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // "Circle"
		System.out.println(s1.getArea());          // 94.98
		System.out.println(s1.getPerimeter());     // 34.54
		System.out.println(s1.getColor());		   // "RED"
		System.out.println(s1.isFilled());		   // false
//		System.out.println(s1.getRadius());		   // not allowed bc instance of Shape not Circle
		   
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.println(c1);					  // "Circle"
		System.out.println(c1.getArea());		  // 94.98
		System.out.println(c1.getPerimeter());    // 34.54
		System.out.println(c1.getColor());		  // "RED"
		System.out.println(c1.isFilled());		  // false
		System.out.println(c1.getRadius());		  // 5.5
		   
//		Shape s2 = new Shape();
		   
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
		System.out.println(s3); // "Rectangle"
		System.out.println(s3.getArea()); // 2.0
		System.out.println(s3.getPerimeter()); // 6.0
		System.out.println(s3.getColor()); // "RED"
//		System.out.println(s3.getLength()); //error because the Shape class does not have a getLength() method
//		   
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.println(r1); // "Rectangle"
		System.out.println(r1.getArea()); // 2.0
		System.out.println(r1.getColor()); // "RED"
		System.out.println(r1.getLength()); // 2.0
		   
		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4); // "Square"
		System.out.println(s4.getArea()); // 43.26
		System.out.println(s4.getColor()); // "blue"
//		System.out.println(s4.getSide()); // no getSide() method in Shape class
		  
		// Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2); // "Square"
		System.out.println(r2.getArea()); // 43.26
		System.out.println(r2.getColor()); // "blue"
//		System.out.println(r2.getSide()); // error because no getSide in Rectangle
		System.out.println(r2.getLength()); // 6.6
		   
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2; 
		System.out.println(sq1); // "Square"
		System.out.println(sq1.getArea()); // 43.26
		System.out.println(sq1.getColor()); //"blue
		System.out.println(sq1.getSide()); // 6.6
		System.out.println(sq1.getLength()); // 6.6
	}

}
