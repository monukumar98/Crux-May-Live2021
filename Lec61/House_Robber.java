package Lec61;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		System.out.println(robhouse(arr, 0));
		int dp[] = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(robhouseTD(arr, 0, dp));
		System.out.println(robhouseBU(arr));

	}

	public static int robhouse(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int house2 = robhouse(arr, i + 2);
		int house1 = robhouse(arr, i + 1);
		int house0 = Math.max(house2 + arr[i], house1);
		return house0;

	}

	public static int robhouseTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}

		if (dp[i] != -1) {
			return dp[i];
		}

		int house2 = robhouseTD(arr, i + 2, dp);
		int house1 = robhouseTD(arr, i + 1, dp);
		int house0 = Math.max(house2 + arr[i], house1);
		dp[i] = house0;
		return house0;

	}

	public static int robhouseBU(int[] arr) {
		 if(arr.length==1){
	            return arr[0];
	        }
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);

		}
		return dp[dp.length - 1];

	}
	
	public static int robhousSPOPTI(int[] arr) {
		 if(arr.length==1){
	            return arr[0];
	        }
		
		int first = arr[0];
		int second= Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			int third  = Math.max(arr[i] + first, second);
			first=second;
			second=third;

		}
		return second;

	}
	

}
