package Lec16;

public class Maximum_Sum_of_Window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,7,9,2,11,4,3};
		int k=3;
		System.out.println(MaximumSumofWindowsizek(arr, k));

	}
	public static int  MaximumSumofWindowsizek(int [] arr, int k ) {
		int sum=0;
		int max_sum=0;
		for (int i = 0; i < k; i++) {
			sum+=arr[i];
		}
		max_sum=sum;
		for (int i = k; i < arr.length; i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			
			max_sum=Math.max(max_sum, sum);			
		}
		return max_sum;
	}
	
	

}
