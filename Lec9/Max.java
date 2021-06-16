package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,24,7,9,89,15};
		System.out.println(max_index(arr));

	}
	public static int max_index(int arr[]) {
		int idx=0;
		for (int i = 1; i <arr.length; i++) {
			if(arr[idx]<arr[i]) {
				idx=i;
			}
			
		}
		return idx;
	}

}
