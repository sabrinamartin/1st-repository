
public class function {
	
	public static void main (String[] args) {
		System.out.println(recursive(5));
		System.out.println(iterative(5));
	}
	
	public static int recursive (int n) {
		if (n < 3) {
			return n;
		} else {
			return recursive(n-1) + 2 * recursive(n-2) + 3 * recursive(n-3);
		}
	}
	
	public static int iterative (int n) {
		int f_minus_three = 0;
		int f_minus_two = 1;
		int f_minus_one = 2;
		int f = 0;
		if (n < 3) {
			return n;
		} else {
			for (int i = 3; i <= n; i++) {
				f = f_minus_one  + 2 * f_minus_two + 3 * f_minus_three;
				f_minus_three = f_minus_two;
				f_minus_two = f_minus_one;
				f_minus_one = f;
			}
			return f;
		}
	}
}
