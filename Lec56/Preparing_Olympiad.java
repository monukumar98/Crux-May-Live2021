package Lec56;

import java.util.Scanner;



public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] diff = new int[n];
		for (int i = 0; i < diff.length; i++) {
			diff[i] = sc.nextInt();
		}
		System.out.println(Olympiad(diff, l, r, x));

	}

	public static int Olympiad(int[] arr, int l, int r, int x) {
		int n = arr.length;
		int count = 0;
		for (int i = 3; i < (1 << n); i++) {

			if (countSetBit_Optimize(i) >= 2 && ispossible(arr, i, x, l, r)) {
				count++;

			}
		}
		return count;

	}

	public static boolean ispossible(int[] arr, int i, int x, int l, int r) {
		int pos = 0;
		int sum = 0;
		int easy = Integer.MAX_VALUE;
		int hard = Integer.MIN_VALUE;
		while (i != 0) {
			if ((i & 1) == 1) {
				sum += arr[pos];
				easy = Math.min(easy, arr[pos]);
				hard = Math.max(hard, arr[pos]);
			}
			pos++;
			i >>= 1;

		}
		return l <= sum && sum <= r && hard - easy >= x;

	}

	public static int countSetBit_Optimize(int n) {

		int count = 0;
		while (n != 0) {
			count++;
			n = (n & (n - 1));

		}
		return count;
	}

}
