
public class Binding {
	
	public static void main(String[] args) {
		String song = "what";
		song("hello");
		System.out.print(song);
		pr("hello");
	}

	public static void song(String name) {
		String song = "hello";
	}
	
	public static void pr(String string) {
		System.out.println(string);
	}
}
