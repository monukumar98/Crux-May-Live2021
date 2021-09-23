package Lec63;

import java.util.Arrays;

public class Max_Dot_Product_of_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, -2, 5 };
		int[] arr1 = { 3, 0, -6 };
		System.out.println(maxdotoftwoarray(arr, arr1, 0, 0,true));
		int[][] dp = new int[arr.length][arr1.length];
		for (int[] a : dp) {
			Arrays.fill(a, -10000000);
		}
		System.out.println(maxdotoftwoarrayTD(arr, arr1, 0 ,0, dp,true));

	}

	public static int maxdotoftwoarray(int[] arr, int[] arr1, int i, int j, boolean istaken) {
		if (i == arr.length || j == arr1.length) {
			return 0;
		}

		int dot_prodouct = arr[i] * arr1[j] + maxdotoftwoarray(arr, arr1, i + 1, j + 1,true);
		int fd = maxdotoftwoarray(arr, arr1, i + 1, j,false);
		int sd = maxdotoftwoarray(arr, arr1, i, j + 1,false);
		return Math.max(dot_prodouct, Math.max(fd, sd));

	}

	public static int maxdotoftwoarrayTD(int[] arr, int[] arr1, int i, int j, int[][] dp,boolean istaken) {
		if (i == arr.length || j == arr1.length) {
			if(istaken)
			  return 0;
			else {
				return -10000000;
			}
		}

		if (dp[i][j] != -10000000) {
			return dp[i][j];
		}

		int dot_prodouct = arr[i] * arr1[j] + maxdotoftwoarrayTD(arr, arr1, i + 1, j + 1, dp,true);
		int fd = maxdotoftwoarrayTD(arr, arr1, i + 1, j, dp,false);
		int sd = maxdotoftwoarrayTD(arr, arr1, i, j + 1, dp,false);
		return dp[i][j] = Math.max(arr[i]*arr1[j],Math.max(dot_prodouct, Math.max(fd, sd)));

	}

}
