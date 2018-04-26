
public class Square extends Rectangle {
	
	public Square() {
		super(5.0, 5.0);
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return this.length;
	}
	
	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}
	
	public String toString(){
		return "Square";
	}

}
