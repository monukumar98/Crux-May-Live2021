package Lec55;

public class UniqueNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 2, 3, 7,7,5,8};
		System.out.println(UniqueNumber_I(arr));

	}

	public static int UniqueNumber_I(int[] arr) {
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans^=arr[i];// ans= ans^arr[i];
		}
		return ans;
		
		

	}

}
