import java.lang.Math;

public class StirlingsFormula {
	
	public static final double PI = Math.PI;
	public static final double E = Math.E;
	
	public static double stirlings (double n) {
		double radicand = 2*PI*n;
		double root = Math.sqrt(radicand);
		double quotient = (n/E);
		double exponent = Math.pow(quotient, n);
		double retval = root*exponent;
		return retval;
	}
	
	public static void main(String[] args) {
		System.out.println("The approximation of 1! is " + stirlings(1));
		System.out.println("The approximation of 9! is " + stirlings(9));
	}

}
