/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card num1 = new Card("10", "hearts", 10);
		Card num2 = new Card("queen", "spades", 12);
		Card num3 = new Card("10", "hearts", 10);
		System.out.println(num1.toString());
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num1.matches(num3));
		System.out.println(num1.matches(num2));
	}
}
