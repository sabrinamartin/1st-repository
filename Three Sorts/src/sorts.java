import java.util.Arrays;

public class sorts {
	
	public static void main(String[] args) {
		int[] a = {3, 6, 5, 2, 1, 9, 0};
		System.out.println(Arrays.toString(bubbleSort(a)));
		System.out.println(Arrays.toString(selectionSort(a)));
		System.out.println(Arrays.toString(insertionSort(a)));
	}
	
	public static int[] bubbleSort(int[] a) {
		for (int n = a.length-1; n > 0; n--) {
			for (int i = 0; i < n; i++) {
				int temp = 0;
				if (a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a) {
		int n = a.length-1;
		for (int i = 1; i < n; i++) {
			for (int k = i; k > 0; k--) {
				int temp = 0;
				if (a[k] < a[k-1]) {
					temp = a[k];
					a[k] = a[k-1];
					a[k-1] = temp;
				}
			}
		}
		return a;
	}
	
	public static int[] selectionSort(int[] a) {
		for (int n = a.length-1; n > 0; n--) {
			int max_index = 0;
			int temp = 0;
			for (int i = 0; i <= n; i++) {
				if (a[i] > a[max_index]) {
					max_index = i;
				}
			}
			temp = a[max_index];
			a[max_index] = a[n];
			a[n] = temp;
		} 
		return a;
	} 

}
