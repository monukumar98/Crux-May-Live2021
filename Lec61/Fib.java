package Lec61;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		// System.out.println(FibNo(n));
		int[] dp = new int[n + 1];
		//System.out.println(FibNoTD(n, dp));
		//System.out.println(FibNoBU(n));
       System.out.println(FibNoBUSpOPTi(n));
	}

	public static int FibNo(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		System.out.println(n);
		int fb1 = FibNo(n - 1);
		int fb2 = FibNo(n - 2);
		int fbn = fb1 + fb2;
		return fbn;

	}

// O(N)
	public static int FibNoTD(int n, int[] dp) {

		if (n == 1 || n == 0) {
			return n;
		}
		// Exe use krenge
		if (dp[n] != 0) {
			return dp[n];
		}
		//System.out.println(n);
		int fb1 = FibNoTD(n - 1, dp);
		int fb2 = FibNoTD(n - 2, dp);
		int fbn = fb1 + fb2;
		dp[n] = fbn;// mere Exe
		return fbn;

	}
	// O(N)
	public static int FibNoBU(int n) {
		int[] dp = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];

		}
		return dp[n];

	}
	// O(N)
	public static int FibNoBUSpOPTi(int n) {
		
		int a=0;
		int b=1;
		for (int i = 2; i <=n; i++) {
			int c =a+b;
			a=b;
			b=c;
			
		}
		return b;

	}
	

}
