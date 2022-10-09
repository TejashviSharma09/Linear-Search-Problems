package LinerSearchProblems;

public class FindMinNumber {

	public static void main(String[] args) {

		int[] nums = {22, 125, -2, 0, 44};
		System.out.println(findMinNumber(nums));
		
	}
	
	static int findMinNumber(int[] nums) {
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min)
				min = nums[i];
		}
		return min;
	}

}
