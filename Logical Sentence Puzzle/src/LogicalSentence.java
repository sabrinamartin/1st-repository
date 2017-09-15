
public class LogicalSentence {
	
	//Attribute
	private PropositionConstant pc;
	
	//Constructors
	public LogicalSentence (PropositionConstant pc) {
		this.pc = pc;
	}
	public LogicalSentence() {
	}
	
	boolean evaluate(TruthAssignment ta) {
		Boolean value = ta.get(pc);
		return true;
	}
	
	public static void main(String[] args) {
		PropositionConstant a = new PropositionConstant("a");
		PropositionConstant b = new PropositionConstant("b");
		LogicalSentence l1 = new LogicalSentence(a);
		LogicalSentence l2 = new LogicalSentence(b);
		LogicalSentence l3 = new Negation(l1);
		LogicalSentence l4 = new Negation(l3);
		LogicalSentence l5 =  new Conjunction(l3, new Negation(l4));

		TruthAssignment ta1 = new TruthAssignment(); //TruthAssignment is a subclass of HashMap
		ta1.put(b,true); //Adds new keys and values to ta1 hashmap
		ta1.put(a, false); 
		System.out.println(l5.evaluate(ta1)); //evaluates l5 (Conjuction ~l1 ^ ~~l4) --> return false
		System.out.println(Legal.legal("a&"));  //not a legal sentence --> return false
		System.out.println(findMatch("a(b)", 0));

		String[] pc = {"p"};
		truthTable(pc);
		
	}

	/**
	 * Prints a truth table out of the string array through binary numbers. There are as many different
	 * binary number combinations as there are 2 to the power of number of elements minus 1.
	 * @param pc A string array with propositional constants
	 */
	private static void truthTable(String[] pc) {
		int x = (int) (Math.pow(2, pc.length)-1); //the number of different binary number combinations
		for (String s : pc) {
			//prints first row of table, each of the elements in the array
			System.out.print(s);
		}
		System.out.println();
		for (int j = 0; j < pc.length; j++) {
			System.out.print("-");
		}
		System.out.println();
		for (; x >= 0; x-=1) {
			//Returns the string representation of the first argument in the radix specified by the second argument
			System.out.println(Integer.toString(x, 2)); //Second argument is 2 because binary only has 2 characters -1 & 0
		}
	}
	
	/**
	 * This method finds the index of the character right before the first closed parentheses. indexOf(")") 
	 * locates the first instance of a closed parentheses. Then, subtracting 1 gives the index
	 * of the character before the closed parentheses. 
	 * @param string The method will search for the character in this string
	 * @param i I decided not to use this argument since it would not help me find the index
	 * @return The index of the character before the first closed parentheses
	 */
	private static int findMatch(String string, int i) {
		return string.indexOf(")")-1;
	}
	
}
