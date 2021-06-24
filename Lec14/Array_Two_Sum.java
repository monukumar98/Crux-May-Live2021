package Lec14;

import java.util.ArrayList;


public class Array_Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 6 };
		int[] arr1 = { 9, 5, 7, 6 };
		System.out.println(Add_sum(arr, arr1));

	}

	public static ArrayList<Integer> Add_sum(int[] arr, int[] arr1) {
		int carry = 0;
		int i=arr.length-1;
		int j=arr1.length-1;
		ArrayList<Integer> list = new ArrayList<>();
		while(i>=0 || j>=0) {
			int sum=0;
			if(i>=0) {
				sum+=arr[i];
				i--;
			}
			if(j>=0) {
				sum+=arr1[j];
				j--;
			}
			sum+=carry;
			carry=sum/10;
			list.add(0,sum%10);
		}
		if(carry!=0) {
			list.add(0, carry);
		}
		return list;

	}

}
