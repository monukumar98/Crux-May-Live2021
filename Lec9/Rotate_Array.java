package Lec9;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		//rotate(arr, k);
		Reversal_Algo(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

	public static void rotate(int[] arr, int k) {
		k = k % arr.length;
		for (int i = 1; i <= k; i++) {// no of rotation
			int a = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {// 1st 2nd 3rd
				arr[j + 1] = arr[j];
			}
			arr[0] = a;

		}

	}
	public static void Reversal_Algo(int [] arr, int k) {
		k = k % arr.length;
		reverse(arr, arr.length-k, arr.length-1);
		reverse(arr, 0, arr.length-k-1);
		reverse(arr, 0, arr.length-1);
		
		
	}

	public static void reverse(int[] arr,int i, int j) {
		
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}

	}

}
