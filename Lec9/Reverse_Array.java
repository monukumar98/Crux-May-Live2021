package Lec9;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 24, 7, 9, 89, 15 };
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	public static void reverse(int[] arr) {
		int i=0;
		int j =arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		

	}
	

}
