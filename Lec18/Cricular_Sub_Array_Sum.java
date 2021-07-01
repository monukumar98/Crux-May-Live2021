package Lec18;

public class Cricular_Sub_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -8, 100, -4, 6, 7 };
		System.out.println(CircularSum(arr));
        
	}

	public static int CircularSum(int[] arr) {
		int kadanes_sum = kadanes(arr);
		int toatl_sum = 0;
		for (int i = 0; i < arr.length; i++) {

			toatl_sum += arr[i];
			arr[i] = -1 * arr[i];

		}
		toatl_sum+=kadanes(arr); // toatl_sum = toatl_sum - (- kadanes(arr))
		return Math.max(kadanes_sum, toatl_sum);

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
