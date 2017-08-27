package legalSentence;

public class Main {
	
	public static void main (String[] args) {
		String s = "~P~";
		if (legal(s)) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
	
	/**
	 * Helper method that returns true if string is simple sentence
	 * @param s The string being checked if it is a simple sentence
	 * @return If it is equal to "P" or "Q", returns true, else, return false
	 */
	public static boolean simpleSentence (String s) {
		if (s.equalsIgnoreCase("P") || s.equalsIgnoreCase("Q")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Helper method returns true if first character is "~"
	 * @param s The string being checked if it begins with "~"
	 * @return If it begins with "~", it returns true, if it doesn't begin with "~", returns false
	 */
	public static boolean beginsWithNot (String s) {
		if (s.substring(0,1).equals("~")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Helper method removes the "~" from the string
	 * @param s The string from which the "~" is being cut
	 * @return The s string, from index 1 to the end of the string
	 */
	public static String cutNot(String s) {
		return s.substring(1);
	}
	
	
	/**
	 * Recursive method that ultimately returns true if string is legal sentence
	 * @param s The string being tested for a legal sentence
	 * @return If it is a legal sentence, returns true, if it is not a legal sentence, return false
	 */
	
	public static boolean legal (String s) {
		// Returns false if empty string
		if (s.equals("")) {
			return false;
		// Runs simpleSentence() method to check if whole string is simple
		} else if (simpleSentence(s)) {
			return true;
		// Runs beginsWithNot() method and if true, it reassigns a new string to "s" with cutNot() method.
		// Then runs legal() method on s again
		} else if (beginsWithNot(s)) {
			s = cutNot(s);
			return legal(s);
		// If string s contains "&", index would be something other than -1
		} else if (s.indexOf("&") != -1) {
			// Assigns index of "&" to integer
			int index = s.indexOf("&");
			// Checks left side of "&" and right side for legal sentence by running them through legal method
			return legal(s.substring(0, index)) && legal(s.substring(index+1));
		// If string s contains "|", index would be something other than -1
		} else if (s.indexOf("|") != -1) {
			// Assigns index of "|" to integer
			int index = s.indexOf("|");
			// Checks left side of "|" and right side for legal sentence by running them through legal method
			return legal(s.substring(0, index)) && legal(s.substring(index+1));
		// If string doesn't meet any criteria, returns false
		} else {
			return false;
		}
	}

}
