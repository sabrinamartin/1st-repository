
public class problems {
	
	public static void main(String[] args) {
		stars(5);
		System.out.print(logic(false, true, false));
		
	}
	
	//Problem 1
	public int ret() {
		return 17;
	}
	
	//Problem 2
	public static int logic(boolean a, boolean b, boolean c) {
		if (a && b && c) {
			return 1;
		} else {
			return 0;
		}
	}
	
	//Problem 3
	public static void stars(int n) {
		for (int i = 0; i < n + 1; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	//Problem 4
	public int coins(int n) {
		
	}

}
