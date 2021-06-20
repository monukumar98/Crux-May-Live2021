package Lec11;

import java.util.*;

public class Max_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -3, 4 - 1, 5, -7 };
		//Arrays.sort(arr);
		System.out.println(max_sum(arr));

	}

	public static int max_sum(int[] arr) {
		int max_sum = Integer.MIN_VALUE;// - 2^31
		for (int i = 0; i < arr.length; i++) {
			int crr_sum = 0;
			for (int j = i; j < arr.length; j++) {

				crr_sum += arr[j];
				max_sum = max(max_sum, crr_sum);
			}

		}
		return max_sum;

	}
	public static int max(int a , int b) {
		if(a>=b) {
			return a;
		}
		else {
			return b;
		}
	}

}
