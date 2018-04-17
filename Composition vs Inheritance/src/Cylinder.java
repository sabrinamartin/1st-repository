
public class Cylinder {
   private Circle base;   // Base circle, an instance of Circle class
   private double height;
   
   // Constructor with default color, radius and height
   public Cylinder() {
      base = new Circle(); // Call the constructor to construct the Circle
      height = 1.0; 
   }
   
   public Cylinder(double height) {
	   base = new Circle();
	   this.height = height;
   }
   
   public Cylinder(double radius, double height) {
	   base = new Circle(radius);
	   this.height = height;
   }
   
   public double getHeight() {
	      return height; 
	   }
   
   public double getArea() {
	   return 2*base.getArea() + (2*Math.PI*base.getRadius()*height);
   }
   
   public double getVolume() {
	      return base.getArea()*height; 
	   }
}
