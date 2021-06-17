package Lec10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 4, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {

		for (int pass = 1; pass <= arr.length - 1; pass++) {

			for (int i = 0; i < arr.length - pass; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;

				}
			}

		}
	}

	public static void Optimize_Sort(int[] arr) {
		
		for (int pass = 1; pass <= arr.length - 1; pass++) {
			boolean flag = true;
			for (int i = 0; i < arr.length - pass; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
					flag = false;
				}
			}
			System.out.println(pass);
			if (flag == true) {
				return;
			}
		

		}
	}

}
