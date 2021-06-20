package Lec11;

public class Divisble_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 6, 4 };
		System.out.println(GoodSubarray(arr, arr.length));

	}

	public static int GoodSubarray(int[] arr, int n) {
		int[] hole = new int[n];
		hole[0] = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if(sum<0) {
				sum%=n;
				sum+=n;
			}
			sum %= n;
			hole[sum]++;

		}
		int ans=0;
		for (int i = 0; i < hole.length; i++) {
			if(hole[i]>=2) {
				int p=hole[i];
				ans = ans + (p*(p-1))/2;
			}
			
		}
		return ans;

	}

}
