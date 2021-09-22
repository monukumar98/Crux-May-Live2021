package Lec62;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin_Chamges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = { 1, 2, 5 };
		int ammount = 5;
		int ans = CoinChanges(coins, ammount, coins.length);
		int[][] dp = new int[ammount + 1][coins.length + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
	//	System.out.println(CoinChangesTD(coins, ammount, coins.length, dp));
		System.out.println(CoinChangesBU(coins, ammount));
		

	}

	private static int CoinChanges(int[] coins, int ammount, int i) {
		// TODO Auto-generated method stub
		if (ammount == 0) {// 1 Method milgya
			return 1;
		}
		if (i == 0) {
			return 0;
		}

		int inc = 0;
		int exc = 0;

		if (ammount >= coins[i - 1]) {
			inc += CoinChanges(coins, ammount - coins[i - 1], i);// amount index
		}

		exc += CoinChanges(coins, ammount, i - 1);

		return inc + exc;
	}

	private static int CoinChangesTD(int[] coins, int ammount, int i, int[][] dp) {
		// TODO Auto-generated method stub
		if (ammount == 0) {// 1 Method milgya
			return 1;
		}
		if (i == 0) {
			return 0;
		}
		if (dp[ammount][i] != -1) {
			return dp[ammount][i];

		}

		int inc = 0;
		int exc = 0;

		if (ammount >= coins[i - 1]) {
			inc += CoinChangesTD(coins, ammount - coins[i - 1], i, dp);// amount-coint [i] index
		}

		exc += CoinChangesTD(coins, ammount, i - 1, dp);

		return dp[ammount][i] = inc + exc;
	}

	private static int CoinChangesBU(int[] coins, int ammount) {
		int[][] dp = new int[ammount + 1][coins.length + 1];

		// Base Case  amount ka 1 Method milgya 
		for (int i = 0; i <= coins.length; i++) {
			dp[0][i] = 1;

		}
		// Coin nhi hai 
		dp[0][0] = 0;
		for (int amount = 1; amount <= ammount; amount++) {// am
			for (int idx = 1; idx <= coins.length; idx++) {// idx
				int inc = 0;
				int exc = 0;
				if (amount >= coins[idx - 1]) {
					inc += dp[amount - coins[idx - 1]][idx];
				}
				exc += dp[amount][idx - 1];
				dp[amount][idx] = inc + exc;

			}

		}
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
			
		}
		return dp[ammount][coins.length];
		

	}

}
