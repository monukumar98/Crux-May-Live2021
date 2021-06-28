package Lec16;


public class Product_Lees_then_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,2,1,2,5};
	//	int [] arr = {1,2,3,24,4};
		int k=10;
		System.out.println(productlessthenk(arr, k));

	}
	public static  int productlessthenk(int [] arr, int k) {
		int start=0;
		int end=0;
		int count =0;
		int p=1;
		while(end<arr.length) {
			p*=arr[end];
			
			// window km krenge
			while(p>=k) {
				p/=arr[start];
				start++;
			}
			
			// count Subarray having product less then k
			count += (end - start + 1);
			end++;
			
		}
		return count ;
	}

}
