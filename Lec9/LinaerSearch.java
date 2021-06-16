package Lec9;

public class LinaerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,24,7,9,89,15};
		int item=24;
		System.out.println(linaerSerach(arr, item));

	}
	public static int linaerSerach(int []arr,int item) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
			
		}
		return -1;
		
	}

}
