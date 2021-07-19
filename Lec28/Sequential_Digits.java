package Lec28;

import java.util.*;

public class Sequential_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 1000;
		int high = 13000;
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			SequentialDigits(low, i, high, ans);

		}
		Collections.sort(ans);
		System.out.println(ans);

	}

	private static void SequentialDigits(int low, int i, int high, List<Integer> ans) {
		// TODO Auto-generated method stub
		if (low <= i && i <= high) {
			ans.add(i);
		}
		int ld = i % 10;
		if (i > high || ld == 9) {
			return;
		}

		SequentialDigits(low, (i * 10) + ld + 1, high, ans);

	}

}
