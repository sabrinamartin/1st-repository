package GeometricObject;

public class ResizableCircle extends Circle1 implements Resizable {
 
   // Constructor
   public ResizableCircle(double radius) {
      super(radius);
   }
 
   // Implement methods defined in the interface Resizable
   @Override
   public void resize(int percent) {
	   radius *= (percent/100.0);
   }
}
