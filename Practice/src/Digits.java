import java.util.ArrayList;

public class Digits {
	
	private ArrayList<Integer> digitList;
	
	//My digitList was not in order and it did 
	//not contain all of the digits in num.
	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		int s = 0;
		int num2 = num;
		while (num2 > 0) {
			num2 /= 10;
			s+=1;
		}
		int[] temp = {s};
		for (int i = 0; i < temp.length; i++) {
			temp[i] = num%10;
			num /= 10;
		}
		for (int i = (temp.length) -1; i >= 0; i--) {
			digitList.add(temp[i]);
		}
		
	}
	
	//failed to test the two integers were equal for the boolean method 
	public boolean isStrictlyIncreasing() {
		//This caused an IndexOutOfBoundsException because the digitList
		//only had 1 integer.
		for (int i = 0; i < this.digitList.size(); i++) {
			if (this.digitList.get(i) > this.digitList.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	



public static void main (String[] args) {
	Digits d1 = new Digits(15704);
	System.out.print(d1.digitList);
	for(int i=0;i<d1.digitList.size();i++){
	    System.out.println(d1.digitList.get(i));
	} 
}

}
