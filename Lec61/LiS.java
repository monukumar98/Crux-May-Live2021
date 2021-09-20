package Lec61;

import java.util.Arrays;

public class LiS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,9,2,5,3,7,101,18};

	}
	public static int LIS(int [] arr) {
		int n=arr.length;
		int dp[]= new int [n];
		Arrays.fill(dp, 1);
		for (int i = 1; i < dp.length; i++) {
			
			for(int j=0 ; j<i; j++) {
				if(arr[j]<arr[i]) {
					dp[i]=Math.max(dp[j]+1, dp[i]);
				}
			}
			
		}
		Arrays.sort(dp);
		return dp[dp.length-1];
	}

}
