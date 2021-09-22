package Lec62;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "rabbbit";
		String t="rabbit";
		int[][] dp = new int[t.length() + 1][s.length() + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(CoinChangesTD(s, t, s.length(), t.length(), dp));

	}
	// n--> t
	// m-->s
	private static int CoinChangesTD(String s, String t , int m,int n, int[][] dp) {
		// TODO Auto-generated method stub
		if ( n== 0) {// 1 Method milgya
			return 1;
		}
		if (m == 0) {// Coin nhi hai 
			return 0;
		}
		if (dp[n][m] != -1) {
			return dp[n][m];

		}

		int inc = 0;
		int exc = 0;

		if (s.charAt(m-1)==t.charAt(n-1)) {
			inc += CoinChangesTD(s, t , m-1,n-1, dp);// amount-coint [i] index
		}

		exc += CoinChangesTD(s, t, m - 1,n, dp);

		return dp[n][m] = inc + exc;
	}

}
