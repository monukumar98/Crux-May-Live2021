package Lec9;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 1, 2, 34, 5, 90 };
		// int [] other = new int [2];
//		int []other=arr;
//		System.out.println(other.length);
//		for (int i = 0; i < other.length; i++) {
//			System.out.print(other[i]+" ");
//		}
		int[] arr = { 100, 200, 34, 5, 90 };
	//	System.out.println(arr[0]+" "+arr[1]);
		
		//swap1(arr[0], arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
		swap2(arr, 0,1);
		System.out.println(arr[0]+" "+arr[1]);

		

	}

	public static void swap2(int [] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;

	}
	public static void swap1(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}

}
