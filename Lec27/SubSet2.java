package Lec27;

import java.util.ArrayList;
import java.util.List;

public class SubSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans ="acb";
		String org="acb";//
		if(ans.compareTo(org)>=0) {
			System.out.println(ans);
		}

	}
	public static void Subset_User_Res(int[] arr, List<Integer> list, List<List<Integer>> ans, int idx) {

		ans.add(new ArrayList<Integer>(list));

		for (int i = idx; i < arr.length; i++) {
			if(i!=idx && arr[i]==arr[i-1]) {
				continue;
			}
			list.add(arr[i]);
			Subset_User_Res(arr, list, ans, i + 1);
			list.remove(list.size() - 1);

		}

	}


}
