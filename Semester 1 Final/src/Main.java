
public class Main {
	
	public static void main (String[] args) {
		System.out.println(7%33);
		System.out.print(7/33);
		int [] pies = {3, 5, 7};
	}
	
	int wrapAccess (int[] data, int index) {
		if (index > data.length) {
			return data[correctIndex(data, index)];
		} else {
			return data[index];
		}
	}
	
	int correctIndex (int[] data, int index) {
		int correctIndex = (data.length%index)-1;
		return correctIndex;
	}
	
	boolean makeAbsolute?(int[] data, int index) {
		  if (Math.abs(index) > data.length) {
		    return true;
		  } else {
		    return false;
		  }
		}

}
