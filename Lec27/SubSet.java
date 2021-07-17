package Lec27;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
		// Subset_Ele_Res(arr, "", 0);
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		Subset_User_Res(arr, list, ans, 0);

	}

	public static void Subset_Ele_Res(int[] arr, String ans, int i) {
		if (i == arr.length) {
			System.out.println(ans);
			return;
		}
		Subset_Ele_Res(arr, ans, i + 1);// no
		Subset_User_Res(arr, ans + arr[i], i + 1);// yes

	}

	public static void Subset_User_Res(int[] arr, List<Integer> list, List<List<Integer>> ans, int idx) {

		ans.add(new ArrayList<Integer>(list));

		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			Subset_User_Res(arr, list, ans, i + 1);
			list.remove(list.size() - 1);

		}

	}

}
