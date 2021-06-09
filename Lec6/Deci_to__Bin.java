package Lec6;

public class Deci_to__Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 38;
		int ans = 0;
		int mul = 1;
		// Dis se division Src se mul  Dis is 2 and Src is 10
		while (n != 0) {
			int rem = n % 2;
			ans = ans + rem * mul;
			mul = mul * 10;
			n /= 2;

		}
		System.out.println(ans);

	}

}
