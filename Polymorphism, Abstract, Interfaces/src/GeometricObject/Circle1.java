package GeometricObject;
public class Circle1 implements GeometricObject {
   // Private variable
   protected double radius;

   // Constructor
   public Circle1(double radius) {
	   this.radius = radius;
   }

   // Implement methods defined in the interface GeometricObject
   @Override
   public double getPerimeter() { 
	   return (2*Math.PI*radius);
   }
   
   @Override
   public double getArea(){
	   return (Math.PI*Math.pow(radius, 2));
   }
}
