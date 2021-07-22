package Lec30;

public class Merge_Two_SortdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,3,5,7,9};
		int [] arr2= {1,3,6,8,9,11,13,15};
		int [] ans = meregetwoarray(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int[] meregetwoarray(int arr1[], int arr2[]) {
		int i = 0;// -->arr1
		int j = 0;// -->arr2
		int c[] = new int[arr1.length + arr2.length];
		int k = 0;// -->c
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				c[k] = arr1[i];
				i++;
				k++;
			} else {
				c[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			c[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			c[k] = arr2[j];
			j++;
			k++;
		}
		return c;

	}

}
