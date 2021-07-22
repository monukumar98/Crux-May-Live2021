package Lec30;

public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 8, 1, 2, 7 };
		int ans[]=merge(arr, 0, arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

	public static int[] merge(int[] arr, int si, int end) {
		if (si == end) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + end) / 2;
		int[] fs = merge(arr, si, mid);
		int[] ss = merge(arr, mid + 1, end);
		return meregetwoarray(fs, ss);

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

		while (i < arr1.length) {
			c[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			c[k] = arr2[j];
			j++;
			k++;
		}
		return c;

	}

}
