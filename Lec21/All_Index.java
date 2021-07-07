package Lec21;

public class All_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 8, 9, 5, 5, 89, 5, 9 };
		int ans[] = All_occ(arr, 5, 0, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] All_occ(int[] arr, int item, int i, int count) {
		if (i == arr.length) {

			return new int[count];

		}

		if (arr[i] == item) {
			count++;

			int res[] = All_occ(arr, item, i + 1, count);
			res[count-1] = i;
			return res;

		} else {
			return All_occ(arr, item, i + 1, count);
		}

	}

}
