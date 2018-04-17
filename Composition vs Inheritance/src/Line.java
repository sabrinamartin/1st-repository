
public class Line {
   // A line composes of two points (as instance variables)
   private Point begin;    // beginning point
   private Point end;      // ending point
   
   // Constructors
   public Line (Point begin, Point end) {  // caller to construct the Points
      this.begin = begin;
      this.end = end;
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // construct the Points here
      end = new Point(endX, endY);
   }
   
   // Public methods
   public String toString() { 
	   return "Line: Begins: " + begin.toString() + ", Ends: " + end.toString();
   }
   
   public Point getBegin() { 
	   return this.begin;
   }
   public Point getEnd() { 
	   return this.end;
   }
   public void setBegin(int x, int y) { 
	   this.begin = new Point(x, y);
   }
   public void setEnd(int x, int y) { 
	   this.end = new Point(x, y);
   }
   
   public int getBeginX() { 
	   return this.begin.getX();
   }
   public int getBeginY() {
	   return this.begin.getY();
   }
   public int getEndX() { 
	   return this.end.getX();
   }	
   public int getEndY() { 
	   return this.end.getY();
   }
   
   public void setBeginX(int x) { 
	   this.begin.setX(x);;
   }
   public void setBeginY(int y) { 
	   this.begin.setY(y);
   }
   public void setBeginXY(int x, int y) { 
	   this.begin.setXY(x, y);
   }
   public void setEndX(int x) { 
	   this.end.setX(x);
   }
   public void setEndY(int y) { 
	   this.end.setY(y);
   }
   public void setEndXY(int x, int y) { 
	   this.end.setXY(x, y);
   }
   
   public int getLength() { 
	   double xDiffSq = Math.pow(getBeginX()-getEndX(), 2);
	   double yDiffSq = Math.pow(getBeginY()-getEndY(), 2);
	   double sum = xDiffSq + yDiffSq;
	   return (int) (Math.sqrt(sum));
   } // Length of the line
     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
   public double getGradient() { 
	   double yDiff = getEndY()-getBeginY();
	   double xDiff = getEndX()-getBeginX();
	   return (Math.atan2(yDiff, xDiff));
   } // Gradient in radians
     // Math.atan2(yDiff, xDiff)
}
