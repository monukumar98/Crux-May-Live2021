package Lec8;

public class Array_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = null;
		//System.out.println(arr);
		arr = new int [5];
		System.out.println(arr);
		// get 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// set
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=8;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// E__F__L
		System.out.println("E__F__L");
		for(int val : arr) {
			System.out.print(val+" ");
		}





	}

}
