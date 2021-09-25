package Lec64;

public class Lis_NlogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 11, 7, 15 };
		System.out.println(lIS(arr));

	}

	public static int lIS(int[] arr) {
		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		int len = 1;

		for (int i = 1; i < arr.length; i++) {

			if (dp[len - 1] < arr[i]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx] = arr[i];
			}

		}
		for (int k = 0; k < len; k++) {
			System.out.print(dp[k] + " ");
			

		}
		System.out.println();
		return len;

	}

	private static int BinarySearch(int[] dp, int i, int j, int item) {
		// TODO Auto-generated method stub
		int si = i;
		int ei = j;
		int ans = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;

			if (dp[mid] >= item) {
				ans = mid;
				ei = mid - 1;

			} else {
				si = mid + 1;
			}
		}

		return ans;
	}

}
