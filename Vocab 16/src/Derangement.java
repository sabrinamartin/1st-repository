import java.util.Arrays;

public class Derangement {
	
	public static int[] derangement(int[] nums){
		for (int i = 0; i < nums.length-1; i++) {
			int temp = 0;
			temp = nums[i+1];
			nums[i+1] = nums[i];
			nums[i] = temp;
		}
		return nums;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println("Original arrangement: " + Arrays.toString(nums));
		System.out.println("Derangement: " + Arrays.toString(derangement(nums)));
	}

}
