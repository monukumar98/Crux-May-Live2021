package Lec64;

import java.util.Arrays;
import java.util.Scanner;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
		String a = sc.next();
		String b = sc.next();
		int[][] dp = new int[a.length()][b.length()];
		for (int[] ar : dp) {
			Arrays.fill(ar, -1);
		}
		System.out.println(EditDistance(a, b, 0, 0,dp));
        }

	}

	public static int EditDistance(String a, String b, int i, int j,int [][]dp) {
		
		if(i==a.length()  || j==b.length()) {
			return Math.max( b.length()-j, a.length()-i);
		}
     if(dp[i][j]!=-1) {
    	 return dp[i][j];
     }
		if (a.charAt(i) == b.charAt(j)) {
			return dp[i][j]= EditDistance(a, b, i+1, j+1,dp);//dp[i][j]

		}
		else {
			int d = EditDistance(a, b, i+1, j,dp);// dp[i-1][j]
			int ii = EditDistance(a, b, i, j+1,dp);//dp[i][j-1]
			int r = EditDistance(a, b, i+1, j+1,dp);//dp[i-1][j-]
			
			int ans = Math.min(ii, Math.min(d, r))+1;
			return  dp[i][j]=ans;
		}

	}
	private static int  Edit_distanceBU(String a, String b) {
		// TODO Auto-generated method stub
		
		
		int dp [][]= new int [a.length()+1][b.length()+1];
		
		for(int i=1; i<=b.length(); i++) {
			dp[0][i]=i;
		}
		for(int i=1; i<=a.length(); i++) {
			dp[i][0]=i;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					int d = dp[i-1][j];
					int ii=dp[i][j-1];
					int r = dp[i-1][j-1];
					dp[i][j]=Math.min(d, Math.min(ii, r))+1;
				}
				
			}
		}
	     
		
		
		return dp[a.length()][b.length()];
		
	}
}
