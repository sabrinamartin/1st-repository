
public class Negation extends LogicalSentence {
	
	//Attribute
	private LogicalSentence ls;

	//Constructor
	public Negation(LogicalSentence ls) {
		this.ls = ls;
	}
	
	//Returns the opposite of the value of ls. If ls is true, it returns false, and vice versa
	public boolean evaluate(TruthAssignment ta) {
		return ! ls.evaluate(ta);
	}
}
