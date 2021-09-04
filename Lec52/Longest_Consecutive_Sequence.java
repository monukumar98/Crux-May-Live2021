package Lec52;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(Consecutive_Sequence(arr));

	}

	public static int Consecutive_Sequence(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (map.containsKey(key - 1)) {
				map.put(key, false);
			} else {
				map.put(key, true);
			}
			if (map.containsKey(key + 1)) {
				map.put(key + 1, false);
			}

		}
		System.out.println(map);
		int count = 0;
		for (int k : map.keySet()) {
			if (map.get(k)) {
				int temp = 0;
				while (map.containsKey(k)) {
					temp++;
					k++;
				}
				count = Math.max(temp, count);
			}

		}
		return count;

	}

}
