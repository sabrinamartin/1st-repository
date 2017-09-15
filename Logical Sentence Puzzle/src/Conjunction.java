
public class Conjunction extends LogicalSentence {
	
	//Attributes
	private LogicalSentence ls1;
	private LogicalSentence ls2;
	
	//Constructor
	public Conjunction(LogicalSentence ls1, LogicalSentence ls2) {
		super();
		this.ls1 = ls1;
		this.ls2 = ls2;
	}
	
	//Returns true if ls1 and ls2 are both true or both false
	public boolean evaluate(TruthAssignment ta) {
		return ls1.evaluate(ta) && ls2.evaluate(ta);
	}

}
