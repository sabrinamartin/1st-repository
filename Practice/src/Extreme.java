
public class Extreme {
	
	public static void main (String[] args) {
		int[] numbers = {3, 4, 7, 9, 18};
		System.out.println("Max: " + max(numbers));
		System.out.print("Min: " + min(numbers));
	}
	
	public static int max (int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
