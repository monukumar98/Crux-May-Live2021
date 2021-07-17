package Lec27;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(arr);
		CoinCombination(arr, 0, 8, "");

	}

	public static void CoinCombination(int[] coin, int idx, int amount, String ans) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (i != idx && coin[i] == coin[i - 1]) {
				continue;
			}

			if (amount >= coin[i]) {
				CoinCombination(coin, i + 1, amount - coin[i], ans + coin[i]);
			}

		}

	}

	public static void CoinCombination_Leet(int[] coin, int idx, int amount, ArrayList<Integer> list,
			ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (i != idx && coin[i] == coin[i - 1]) {
				continue;
			}

			if (amount >= coin[i]) {
				list.add(coin[i]);
				CoinCombination_Leet(coin, i + 1, amount - coin[i], ans + coin[i]);
				list.remove(list.size() - 1);
			}

		}

	}
}
