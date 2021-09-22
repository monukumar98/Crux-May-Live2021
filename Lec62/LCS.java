package Lec62;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		System.out.println(lcs(s1, s2));
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(lcsTD(s1, s2, dp));

	}

	public static int lcs(String s1, String s2) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}

		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + lcs(s1.substring(1), s2.substring(1));

		} else {
			return Math.max(lcs(s1.substring(1), s2), lcs(s1, s2.substring(1)));
		}

	}
	public static int lcsTD(String s1, String s2, int [] []dp) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
         if(dp[s1.length()][s2.length()]!=-1) {
        	 return dp[s1.length()][s2.length()];
         }
		if (s1.charAt(0) == s2.charAt(0)) {
			return  dp[s1.length()][s2.length()]=1 + lcsTD(s1.substring(1), s2.substring(1),dp);

		} else {
			return dp[s1.length()][s2.length()]=Math.max(lcsTD(s1.substring(1), s2,dp), lcsTD(s1, s2.substring(1),dp));
		}

	}
	public static int lcsBU(String s1, String s2) {
		int [] []dp = new int  [s1.length()+1] [s2.length()+1];
		
		for (int i = 1; i <=s1.length(); i++) {
			for (int j = 1; j <=s2.length(); j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
			}
			
		}
		return dp[s1.length()][s2.length()];
		
	}

	
}
