
public class Main {
	
	Bird canary = new Bird("yellow");

}

class Bird {
	
	private String color;

	public Bird(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
