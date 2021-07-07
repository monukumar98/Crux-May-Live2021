package Lec21;

public class Coin_Toss_no_two_heads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinToss_no_2_cons_head(3, "", false);

	}

	public static void CoinToss_no_2_cons_head(int n, String ans, boolean flag) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (!flag) {
			CoinToss_no_2_cons_head(n - 1, ans + "H", true);// Head
		}
		CoinToss_no_2_cons_head(n - 1, ans + "T", false);// Tail

	}

}
