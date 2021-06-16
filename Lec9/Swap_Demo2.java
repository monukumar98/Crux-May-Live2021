package Lec9;

public class Swap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 34, 5, 90 };
		int[] other = { 12, 34, 56, 67 };
	//	arr=other;
		System.out.println(arr[0]+" "+other[0]);
		swap4(arr, other);
		System.out.println(arr[0]+" "+other[0]);


	}
	public static void swap4(int []arr, int []other) {

		int [] temp = arr;
		arr = other;
		other = temp;
		System.out.println("swap 4 "+arr[0]+" "+other[0]);


	}

	public static void swap3(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

	}

}
