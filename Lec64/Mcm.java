package Lec64;

import java.util.Arrays;

public class Mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };
		System.out.println(mcm(arr, 0, arr.length - 1));
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(mcmTD(arr, 0, arr.length - 1, dp));
		System.out.println(mcmBU(arr));

	}

	public static int mcm(int[] arr, int si, int ei) {
		if (si + 1 == ei) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;
		for (int k = si + 1; k < ei; k++) {
			int fs = mcm(arr, si, k);
			int ss = mcm(arr, k, ei);
			int self = arr[si] * arr[k] * arr[ei];
			ans = Math.min(ans, self + fs + ss);

		}
		return ans;
	}

	public static int mcmTD(int[] arr, int si, int ei, int[][] dp) {
		if (si + 1 == ei) {
			return 0;
		}
		if (dp[si][ei] != -1) {
			return dp[si][ei];
		}

		int ans = Integer.MAX_VALUE;
		for (int k = si + 1; k < ei; k++) {
			int fs = mcmTD(arr, si, k, dp);
			int ss = mcmTD(arr, k, ei, dp);
			int self = arr[si] * arr[k] * arr[ei];
			ans = Math.min(ans, self + fs + ss);

		}
		return dp[si][ei] = ans;
	}

	public static int mcmBU(int[] arr) {
		int dp[][] = new int[arr.length][arr.length];

		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				if (i + 1 == j) {
					dp[i][j] = 0;
				} else {
					int ans = Integer.MAX_VALUE;
					for (int k = i + 1; k < j; k++) {
						int fs = dp[i][k];
						int ss = dp[k][j];
						int self = arr[i] * arr[k] * arr[j];
						ans = Math.min(ans, self + fs + ss);

					}
					dp[i][j]=ans;
					
				}

			}

		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[0][arr.length-1];
	}

}
