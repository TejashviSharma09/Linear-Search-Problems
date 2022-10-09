package LinerSearchProblems;

public class SearchInRange {

	public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;
        System.out.println(lsInRange(arr, target, 1, 4));
		
	}
	
	static int lsInRange(int[] arr, int target, int start, int end) {
		
		if(arr.length == 0)
			return -1;
		
		for(int index = start; index <= end; index++) {
			if(arr[index] == target) {
				return index;
			}
		}
		return -1;
	}

}
