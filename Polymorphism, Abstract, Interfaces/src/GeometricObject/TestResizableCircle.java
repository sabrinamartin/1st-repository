package GeometricObject;

public class TestResizableCircle {
	
	public static void main(String []args) {
		ResizableCircle c1 = new ResizableCircle(5.0);
		c1.resize(20);
		System.out.println(c1.radius);
	}

}
