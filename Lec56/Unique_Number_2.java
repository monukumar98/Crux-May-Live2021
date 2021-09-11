package Lec56;

public class Unique_Number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub6
		int[] arr = { 7, 2, 3, 1, 3, 2, 1, 6 };
		UniqueNumber_2(arr);

	}

	public static void UniqueNumber_2(int[] arr) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a ^= arr[i];

		}

		int mask = (a & (~(a - 1)));/// a = 11001000100 ---> 100
		int b = 0;

		// ek ka Xor Group
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) == 0) {
				b ^= arr[i];
			}

		}
		a = (a ^ b);

		System.out.println(a + " " + b);

	}

}
