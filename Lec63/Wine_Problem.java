package Lec63;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[cost.length][cost.length];
		System.out.println(wineProblem(cost, 1, 0, cost.length - 1));
		System.out.println(wineProblemTD(cost, 1, 0, cost.length - 1, dp));
		System.out.println(wineProblemBU(cost));

	}

	public static int wineProblem(int[] cost, int year, int i, int j) {
		if (i > j) {
			return 0;
		}

		int fs = cost[i] * year + wineProblem(cost, year + 1, i + 1, j);
		int ls = cost[j] * year + wineProblem(cost, year + 1, i, j - 1);

		return Math.max(fs, ls);
	}

	public static int wineProblemTD(int[] cost, int year, int i, int j, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int fs = cost[i] * year + wineProblemTD(cost, year + 1, i + 1, j, dp);
		int ls = cost[j] * year + wineProblemTD(cost, year + 1, i, j - 1, dp);

		return dp[i][j] = Math.max(fs, ls);
	}

	public static int wineProblemBU(int[] cost) {
		int[][] dp = new int[cost.length][cost.length];
		// last year
		for (int k = 0; k < dp.length; k++) {
			dp[k][k] = cost.length * cost[k];

		}
		int year = cost.length - 1;
		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int fs = cost[i] * year + dp[i + 1][j];
				int ls = cost[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(fs, ls);
			}
			year--;

		}
		return dp[0][cost.length-1];
	}

}
