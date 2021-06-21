package Lec11;

import java.util.Scanner;

public class Divisble_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(GoodSubarray(arr, n));
		}

	}

	public static long GoodSubarray(int[] arr, int n) {
		long [] hole = new long[n];
		hole[0] = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum < 0) {
				sum %= n;
				sum += n;
			}
			sum %= n;
			hole[sum]++;

		}
		long ans = 0;
		for (int i = 0; i < hole.length; i++) {
			if (hole[i] >= 2) {
				long p = hole[i];
				ans = ans + (p * (p - 1)) / 2;
			}

		}
		return ans;

	}

}
