package Lec20;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,8,9,5,5,89,5,9};
		System.out.println(firstOcc(arr, 10, 0));

	}
	public static int firstOcc(int [] arr, int item, int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return firstOcc(arr, item, i+1);
	}

}
