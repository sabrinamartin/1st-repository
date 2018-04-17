
public class LineSub extends Point {
   // A line needs two points: begin and end.
   // The begin point is inherited from its superclass Point.
   // Private variables
   Point end;               // Ending point
   
   // Constructors
   public LineSub (int beginX, int beginY, int endX, int endY) {
      super(beginX, beginY);             // construct the begin Point
      this.end = new Point(endX, endY);  // construct the end Point
   }
   public LineSub (Point begin, Point end) {  // caller to construct the Points
      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
      this.end = end;
   }
   
   // Public methods
   // Inherits methods getX() and getY() from superclass Point
   public String toString() { 
	   return "Line: Begins: " + super.toString() + ", Ends: " + end.toString();
   }
   
   public Point getBegin() { 
	   return this;
   }
 
   public Point getEnd() { 
	   return this.end;
   }
 
   public void setBegin(int x, int y) { 
	   super.setXY(x, y);
   }
   public void setEnd(int x, int y) { 
	   end.setXY(x, y);
   }
   
   public int getBeginX() {
	   return this.getX();
   }
   public int getBeginY() { 
	   return this.getY();
   }
   public int getEndX() { 
	   return end.getX();
   }
   public int getEndY() {
	   return end.getY();
   }
   
   public void setBeginX(int x) { 
	   this.setX(x);
   }
   public void setBeginY(int y) {
	   this.setY(y);
   }
   public void setBeginXY(int x, int y) { 
	   this.setXY(x, y);
   }
   public void setEndX(int x) { 
	   end.setX(x);
   }
   public void setEndY(int y) { 
	   end.setY(y);
   }
   public void setEndXY(int x, int y) { 
	   end.setXY(x, y);
   }
   
   public int getLength() {  
	   double xDiffSq = Math.pow(getBeginX()-getEndX(), 2);
	   double yDiffSq = Math.pow(getBeginY()-getEndY(), 2);
	   double sum = xDiffSq + yDiffSq;
	   return (int) (Math.sqrt(sum));
   }
   
   public double getGradient() { 
	   double yDiff = getEndY()-getBeginY();
	   double xDiff = getEndX()-getBeginX();
	   return (Math.atan2(yDiff, xDiff));
   }
}// Gradient in radians
