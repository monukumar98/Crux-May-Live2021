package Lec61;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		System.out.println(Climbing_Stairs(arr));
		int[] dp = new int[arr.length + 1];
		Arrays.fill(dp, -1);
		System.out.println(Climbing_StairsTD(arr, dp));

	}

	public static int Climbing_Stairs(int[] arr) {

		int first = helper(arr, 0);
		int Second = helper(arr, 1);
		return Math.min(first, Second);

	}

	public static int Climbing_StairsTD(int[] arr, int[] dp) {

		int first = helperTd(arr, 0, dp);
		int Second = helperTd(arr, 1, dp);
		return Math.min(first, Second);

	}

	private static int helper(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i >= arr.length) {
			return 0;
		}

		int second = helper(arr, i + 2);
		int first = helper(arr, i + 1);

		return arr[i] + Math.min(second, first);
	}

	private static int helperTd(int[] arr, int i, int[] dp) {
		// TODO Auto-generated method stub
		if (i >= arr.length) {
			return 0;
		}

		if (dp[i] != -1) {
			return dp[i];
		}
		int second = helperTd(arr, i + 2, dp);
		int first = helperTd(arr, i + 1, dp);

		dp[i] = arr[i] + Math.min(second, first);
		return dp[i];
	}

	public static int Climbing_StairsBU(int[] arr) {

		int n = arr.length;

		int[] dp = new int[n + 1];
		dp[0] = arr[0];
		dp[1] = arr[1];

		for (int i = 2; i < n; i++) {
			dp[i] = arr[i] + Math.min(dp[i - 1], dp[i - 2]);
		}
		return Math.min(dp[n - 2], dp[n - 1]);

	}
}
