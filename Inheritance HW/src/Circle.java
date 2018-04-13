
/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle extends Shape {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   
   public Circle(double r, String c, boolean f) {
	   super(c, f);
	   radius = r;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   public void setRadius(double r) {
	   radius = r;
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   public double getPerimeter() {
	   return 2*Math.PI*radius;
   }
   
   public String toString(){
	   return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString() + ".";
   }
}
