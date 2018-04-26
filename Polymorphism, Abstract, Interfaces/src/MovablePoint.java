public class MovablePoint implements Movable { // saved as "MovablePoint.java"
   // instance variables
   int x, y, xSpeed, ySpeed;     // package access
   
   // Constructor
   public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
      this.x = x;
      this.y = y;
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
   }
   
   public String toString(){
	   return "X: " + this.x + ", Y: " + this.y + ", X Speed: " + this.xSpeed + ", Y Speed: " + this.ySpeed;
   }
   
   // Implement abstract methods declared in the interface Movable
   @Override
   public void moveUp() {
      y -= ySpeed;   // y-axis pointing down for 2D graphics
   }
   
   public void moveDown() {
	   y += ySpeed;
   }
   
   public void moveLeft() {
	   x -= xSpeed;
   }
   
   public void moveRight() {
	   x += xSpeed;
   }
   
   public static void main (String[] args) {
	   Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
	   System.out.println(m1);
	   m1.moveLeft();
	   System.out.println(m1);
	      
	   Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
	   System.out.println(m2);
	   m2.moveRight();
	   System.out.println(m2);
   }
}