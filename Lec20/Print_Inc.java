package Lec20;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void PI(int n) {
		// Base case
		if (n == 0) {
			return;
		}

		// small problem
		PI(n - 1);
		// self work
		System.out.println(n);
	}

}
