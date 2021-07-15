package Lec26;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		CoinCombination(coin, 0, amount, "");
	}

	public static void CoinCombination(int[] coin, int idx, int amount, String ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				CoinCombination(coin,i, amount - coin[i], ans + coin[i]);
			}
		}

	}

}
