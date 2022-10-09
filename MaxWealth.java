package LinerSearchProblems;


// LeetCode Problem :- Richest Customer Wealth
public class MaxWealth {

	public static void main(String[] args) {

		int[][] accounts = {
				{1,5},
				{7,3},
				{3,5}
				};
		System.out.println(maximumWealth(accounts));
		
	}
	
	static int maximumWealth(int[][] accounts) {
		// 'accounts' array's ROWS represents list of Banks the Customer has accounts in.
		// 'accounts' array's COLUMNS represents Cutomer's Bank Account
		
		int ans = Integer.MIN_VALUE;
		
		for(int[] customerBankAccounts : accounts) {
			
			int sum = 0;
			for(int account : customerBankAccounts) {
				sum += account;
			}
			if(sum > ans)
				ans = sum;
		}
		return ans;
	}

}
