package Lec62;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] cost = { 8, 4, 0, 5, 3 };
		int W = 4;
		System.out.println(Knap_sack(wt, cost, 1, W));
		int[][] dp = new int[W + 1][cost.length + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(Knap_sackTD(wt, cost, 1, W, dp));
		System.out.println(Knap_sackBU(wt, cost, W));

	}

	public static int Knap_sack(int[] wt, int[] cost, int i, int W) {
		if (i >= wt.length || W == 0) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		if (W >= wt[i - 1]) {
			inc += cost[i - 1] + Knap_sack(wt, cost, i + 1, W - wt[i - 1]);
		}
		exc += Knap_sack(wt, cost, i + 1, W);
		return Math.max(inc, exc);

	}

	public static int Knap_sackTD(int[] wt, int[] cost, int i, int W, int[][] dp) {
		if (i >= wt.length || W == 0) {
			return 0;
		}
		if (dp[W][i] != -1) {
			return dp[W][i];
		}
		int inc = 0;
		int exc = 0;
		if (W >= wt[i - 1]) {
			inc += cost[i - 1] + Knap_sackTD(wt, cost, i + 1, W - wt[i - 1], dp);
		}
		exc += Knap_sackTD(wt, cost, i + 1, W, dp);
		return dp[W][i] = Math.max(inc, exc);

	}
	public static int Knap_sackBU(int[] wt, int[] cost,int W) {
		int[][] dp = new int[W + 1][cost.length + 1];
		
		for (int w = 1; w <=W; w++) {
			for (int i = 1; i <=wt.length; i++) {
				int inc = 0;
				int exc = 0;
				if(w >= wt[i - 1]) {
					inc+=(cost[i-1]+dp[w-wt[i-1]][i-1]);
				}
				exc+=dp[w][i-1];
				dp[w][i] = Math.max(inc, exc);
			}
			
		}
		return dp[W][cost.length];
		
		
	}
	

}
