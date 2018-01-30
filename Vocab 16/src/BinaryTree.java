
public class BinaryTree {
	
	public static boolean binaryTree(int n) {
		if (n == 2) {
			System.out.println("The number is 2.");
			return true;
		} else if (n > 2) {
			if(n > 15) {
				System.out.println("The number is greater than 15.");
				return true;
			} else {
				System.out.println("Number: " + n);
				return false;
			}
		} else {
			System.out.println("Num: " + n);
			return false;
		}
	}
	
	public static void main (String[] args) {
		System.out.println(binaryTree(5));
	}

}
