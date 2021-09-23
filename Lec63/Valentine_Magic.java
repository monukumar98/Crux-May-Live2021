package Lec63;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] boys = new int[n];
		for (int i = 0; i < boys.length; i++) {
			boys[i] = sc.nextInt();

		}

		int[] girls = new int[m];

		for (int i = 0; i < girls.length; i++) {
			girls[i] = sc.nextInt();
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
	//	System.out.println(ValentineMagic(boys, girls, 0, 0));
		int[][] dp = new int[boys.length][girls.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		
		System.out.println(ValentineMagicTD(boys, girls, 0,0,dp));

	}

	public static int ValentineMagic(int[] boys, int[] girls, int i, int j) {

		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 1000000;
		}

		int gs = Math.abs(boys[i] - girls[j]) + ValentineMagic(boys, girls, i + 1, j + 1);
		int gr = ValentineMagic(boys, girls, i, j + 1);
		return Math.min(gs, gr);

	}
	public static int ValentineMagicTD(int[] boys, int[] girls, int i, int j,int [][]dp) {

		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 1000000;
		}

		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int gs = Math.abs(boys[i] - girls[j]) + ValentineMagicTD(boys, girls, i + 1, j + 1,dp);
		int gr = ValentineMagicTD(boys, girls, i, j + 1,dp);
		return dp[i][j]=Math.min(gs, gr);

	}
	
	

}
