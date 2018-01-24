
public class LogicalSentence {
	
	private boolean[] truthValues;
	
	public boolean[] truthValues() {
		return truthValues;
	}
	
	public LogicalSentence(boolean[] truthValues){
		this.truthValues = truthValues;
	}
	
	public boolean equivalent(LogicalSentence other) {
		if (this.truthValues.length == other.truthValues.length) {
			for (int i = 0; i < other.truthValues.length; i++) {
				if ((this.truthValues[i] != (other.truthValues[i]))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main (String[] args) {
		LogicalSentence s1 = new LogicalSentence(new boolean[] {true, false, false});
		LogicalSentence s2 = new LogicalSentence(new boolean[] {true, false, false});
		LogicalSentence s3 = new LogicalSentence(new boolean[] {false, false, false});
		LogicalSentence s4 = new LogicalSentence(new boolean[] {true, false, false, false});
		System.out.println(s1.equivalent(s2)); //true
		System.out.println(s1.equivalent(s3)); //false
		System.out.println(s3.equivalent(s4)); //false
	}
}