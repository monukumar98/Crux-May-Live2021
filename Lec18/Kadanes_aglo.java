package Lec18;

public class Kadanes_aglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -11, -1, -11, -78, -8, -17, 0 };
		System.out.println(kadanes(arr));

	}

	public static int kadanes(int[] arr) {
		int max_sum = Integer.MIN_VALUE;// -2^31
		int cur_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			cur_sum += arr[i];
			max_sum = Math.max(max_sum, cur_sum);
			if (cur_sum < 0) {
				cur_sum = 0;
			}

		}
		return max_sum;
	}
	

}
