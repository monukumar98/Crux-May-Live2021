package Lec26;

public class Coin_changes_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		CoinChangePermutation(coin, amount, "");

	}

	public static void CoinChangePermutation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				CoinChangePermutation(coin, amount - coin[i], ans + coin[i]);
			}
		}

	}

}
