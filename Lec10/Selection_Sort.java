package Lec10;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 4, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void Sort(int arr[]) {
		
		
		for(int counter=0; counter<arr.length; counter++) {
			int min= counter;
			for (int i = counter+1; i < arr.length; i++) {
				if(arr[i]<arr[min]) {
					min=i;
				}
			}
			
			// swap
			int t = arr[counter];
			arr[counter]=arr[min];
			arr[min]=t;
			
		}
		
	}

}
