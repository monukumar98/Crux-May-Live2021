package Lec63;

import java.util.Arrays;
import java.util.Scanner;



public class Optimal_Game_Strategy_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();

		}
		int[][] dp = new int[n][n];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Optimal_GameStrategy_II(coin, 0, n - 1, dp));

	}

	public static int Optimal_GameStrategy_II(int[] coin, int i, int j, int[][] dp) {

		if (i > j) {
			return 0;
		}
		if (i + 1 == j) {
			return Math.max(coin[i], coin[j]);
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}

		int op1 = coin[i] + Math.min(Optimal_GameStrategy_II(coin, i + 2, j, dp),
				Optimal_GameStrategy_II(coin, i + 1, j - 1, dp));

		int op2 = coin[j] + Math.min(Optimal_GameStrategy_II(coin, i + 1, j - 1, dp),
				Optimal_GameStrategy_II(coin, i, j - 2, dp));

		return dp[i][j] = Math.max(op1, op2);

	}

}
