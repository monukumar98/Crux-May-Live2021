package Lec33;

public class Power_Opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 9;
		System.out.println(power(a,b));

	}

	public static int power(int a, int n) {
		if (n == 1) {
			return a;
		}
// log(n)
		int ans = power(a, n / 2);
		if (n % 2 != 0) {
			return ans * ans*a;
		} else
			return ans * ans;
	}

}
