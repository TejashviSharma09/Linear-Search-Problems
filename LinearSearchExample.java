package LinerSearchProblems;

public class LinearSearchExample {
	
	public static void main(String[] args) {
		
		int[] nums = {2, 5, 3, 98, -1};
		int target = -1;
		
		boolean ans = linearSearchBoolean(nums, target);
//		int ans = linearSearchFindNumber(nums, target);
//		int ans = linearSearchFindIndex(nums, target);
		System.out.println(ans);
		
	}
	
	// Search the Target number and return true or false.
	static boolean linearSearchBoolean(int[] nums, int target) {
		
		// Check if the array is empty
		if(nums.length == 0) {
			return false;
		}
		
		for(int num : nums) {
			if(num == target) {
				return true;
			}
		}
		return false;
	}
	
	
	// Search the target element and return the element
	static int linearSearchFindNumber(int[] nums, int target) {
		
//		if(nums.length == 0) {
//			return -1;	// WHY???!, or it should be return Integer.MIN_VALUE;
//		}
		
		for(int num : nums) {
			if(num == target) {
				return num;
			}
		}
		
		return Integer.MAX_VALUE;		
	}
	
	
	// Search the element and return the index
	static int linearSearchFindIndex(int[] nums, int target) {
		
		if(nums.length == 0)
			return -1;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target)
				return i;
		}
		
		// If element not found
		return -1;
	}
	
	
	
	
	
}
