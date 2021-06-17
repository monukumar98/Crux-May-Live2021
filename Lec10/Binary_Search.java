package Lec10;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 7, 9, 11, 13, 15, 18 };
		System.out.println(binarySearch(arr, 10));

	}

	public static int binarySearch(int arr[], int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi= mid-1;
				
			}
			else {
				lo=mid+1;
			}
		}
		return -1;

	}

}
