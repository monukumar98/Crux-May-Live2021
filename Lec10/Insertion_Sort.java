package Lec10;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 4, 25, 6, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int item = arr[counter];
			int j = counter - 1;
			while ( j>=0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;

		}

	}

}
