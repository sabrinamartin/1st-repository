
public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational() {
		this.numerator = 0;
		this.numerator = 1;
	}
	
	public Rational(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public void printRational() {
		System.out.print(this.numerator + "/" + this.denominator);
	}
	
	public void Negate() {
		this.numerator *= -1;
	}	
	
	public void Invert() {
		int a = this.numerator;
		int b = this.denominator;
		this.numerator = b;
		this.denominator = a;
	}
	
	public double toDouble() {
		return (double) numerator/denominator;
	}
	
	public static int GCD(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		return GCD((int)Math.abs(a-b), Math.min(a, b));
	}
	
	public Rational reduce() {
		int gcd = GCD(numerator, denominator);
		return new Rational(numerator/gcd, denominator/gcd); 
	}
	
	public Rational add(Rational b) { //change
		int num = (this.numerator*b.denominator) + (b.numerator*this.denominator);
		int denom = (this.denominator*b.denominator);
		return new Rational(num, denom).reduce();
	}
				
	public static void main(String[] args) {
		Rational obj = new Rational();
		obj.numerator = 5;
		obj.denominator = 8;
		obj.printRational();
	}

}
