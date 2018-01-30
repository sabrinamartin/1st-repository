import java.util.Scanner;

public class HashFunction {
	public static Object[][] hash;

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		p("How many Pets (one Pet = name and type) would you like to be in your hash?: ");
		int length = input.nextInt();
		hash = new Object[length][2];
		initialize(input, length);
		pln("Congrats! all elements have been added. Here is your hash: ");
		print();

	}

	public static void initialize(Scanner input, int length) {
		for (int i = 0; i < length; i++) {
			p("\nWhat would you like Object " + (i + 1) + "'s type to be?: ");
			hash[i][0] = input.next();
			p("\nWhat would you like Object " + (i + 1) + "'s name to be?: ");
			hash[i][1] = input.next();
		}
	}

	public static void print() {
		p("\n[");
		for (int i = 0; i < hash.length; i++) {
			p("[" + hash[i][0] + ", " + hash[i][1] + "]");
			if (i == hash.length - 1) {
				p("]");
			} else {
				p(", ");
			}
		}
	}

	public static void p (Object args) {
		System.out.print(args);
	}

	public static void pln (Object args) {
		System.out.println(args);
	}

}
