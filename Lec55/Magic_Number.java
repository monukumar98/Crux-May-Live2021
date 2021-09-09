package Lec55;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(magicnumber(n));

	}

	public static int magicnumber(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			int last_bit = (n & 1);
			ans = ans + last_bit * mul;
			mul *= 5;
			n>>=1;

		}
		return ans;

	}

}
