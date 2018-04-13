
public class Square extends Rectangle {
	
	public Square(){
		super();
	}
	
	public Square(double side) {
		   super(side, side);  // Call superclass Rectangle(double, double)
	}
	
	public Square(double side, String color, boolean filled) {
		   super(side, side, color, filled);  // Call superclass Rectangle(double, double)
	}
	
	public String toString() {
		return "A Square with sides=" + getLength() + ", which is a subclass of " + super.toString() + ".";
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double width) {
		setSide(width);
	}
	
	public void setLength(double length) {
		setSide(length);
	}

}
