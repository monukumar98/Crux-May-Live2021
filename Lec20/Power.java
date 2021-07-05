package Lec20;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2, 5));

	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int ans = a * pow(a, b - 1);
		return ans;

	}

}
