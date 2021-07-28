package Lec32;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void SOE(int n) {
		boolean[] prime = new boolean[n + 1];
		// fasle -- > prime
		prime[0] = true;// Not Prime
		prime[1] = true;// Not Prime
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {
				for (int table = 2; table * i <= n; table++) {
                    prime[table*i]=true;// Not Prime
				}
			}

		}

	}

}
