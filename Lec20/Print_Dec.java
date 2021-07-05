package Lec20;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(100100);

	}

	public static void PD(int n) {
		// Base case
		if (n == 0) {
			return;
		}
		// self work
		System.out.println(n);
		// small problem
		PD(n - 1);
	}

}
