package Lec11;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,0,0,2,0,4};
		System.out.println(rainwater(arr));

	}
	public static int rainwater(int [] arr) {
		int n = arr.length;
		int [] left = new  int [n];
		int [] right = new int [n];
		left[0]=arr[0];
		right[n-1]=arr[n-1];
		for (int i = 1; i < right.length; i++) {
			left[i]=Math.max(left[i-1],arr[i]);
		}
		for(int i=n-2; i>=0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		
		for (int i = 0; i < right.length; i++) {
			int water= Math.min(left[i], right[i])-arr[i];
			ans= ans+water;
		}
		return ans;
	}

}
