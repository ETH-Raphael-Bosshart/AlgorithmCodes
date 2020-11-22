package DynamicProgramming;

import java.util.Arrays;

public class Aerial {
	
	public int solve(int[] arr) {
		int n = arr.length-1;
		int[] dp = new int[n];
		
		
		if (arr.length >= 3) {
			dp[0] = 0;
			dp[1] = Math.min(arr[1] + dp[0], arr[2] + dp[0]);
			dp[2] = Math.min(arr[0] + dp[0], Math.min(arr[1] + dp[0], arr[2] + dp[0]));
			
			
			for (int i = 3; i < dp.length-1; i++) {
				dp[i] = Math.min(arr[i-1] + dp[i-3], Math.min(arr[i] + dp[i-2], arr[i+1] + dp[i-1]));
			}
			dp[n] = Math.min(arr[n-1] + dp[n - 3], arr[n] + dp[n-2]);
		}
		return dp[n];
	}
	public static void main(String[] args) {
		Aerial aerial = new Aerial();
		int[] arr = {1,5,8,4,6,2,7,4};
		
		System.out.println(aerial.solve(arr));
	}
	

	
	
}
