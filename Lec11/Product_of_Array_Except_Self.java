package Lec11;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 3 };
		int [] ans=Product_of_Array(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
		

	}

	public static int[] Product_of_Array(int[] arr) {

		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < right.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		right[right.length - 1] = 1;
		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left;

	}
	public static int[] Product_of_Array1(int[] arr) {

		int left[] = new int[arr.length];
		left[0] = 1;
		// left 
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		int r =1;
		for (int i = left.length-1; i>=0; i--) {
			left[i] = left[i] * r;
			r*=arr[i];
		}
		return left;

	}

}
