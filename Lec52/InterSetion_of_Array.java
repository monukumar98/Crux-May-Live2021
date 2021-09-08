package Lec52;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSetion_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 7, 5, 2, 6, 1, 7 };
		int[] arr2 = { 2, 7, 3, 5, 9, 18, 6, 7 };
		InterSetionofArray(arr2, arr1);

	}

	public static void InterSetionofArray(int[] arr, int[] arr1) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr[i])) {
				// int f =map.get(arr[i]) ;
				map.put(arr[i], map.get(arr[i]) + 1);

			} else {
				map.put(arr[i], 1);
			}

		}
		// int[] arr2 = { 2, 7, 3, 5, 9, 18, 6, 7 };
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]) && map.get(arr1[i]) != 0) {
				ans.add(arr1[i]);
				map.put(arr1[i], map.get(arr1[i]) - 1);

			}

		}
		System.out.println(ans);

	}

}
