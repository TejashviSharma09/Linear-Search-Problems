package LinerSearchProblems;

public class EvenDigits {

	public static void main(String[] args) {

		int[] nums = {1, 22, 3211, 312, -7892};
		System.out.println(countEvenDigitNumbers(nums));
		
	}
	
	static int countEvenDigitNumbers(int[] nums) {
		int count = 0;
		
		for(int num : nums) {
			if(even(num))
				count++;
		}
		return count;	
	}
	
	static boolean even(int num) {
		int numberOfDigits = digits(num);
		
//		if (numberOfDigits % 2 == 0) {
//			return true;
//		}
//		return false;
		
		return numberOfDigits % 2 == 0;
	}
	
	// Because of the 'while' loop it takes more time.
	static int digits(int num) {
		// If the number is negative, covert it to a positive number
		if(num < 0) {
			num = num * -1;
		}
		if(num == 0) {
			return 1;
		}
		
		int count = 0;
		while(num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	
	// OPTIMIZED TRICK
	static int digits2(int num) {
		if(num < 0)
			num = num * -1;
		return (int)(Math.log10(num) + 1);
	}
	
	

}
