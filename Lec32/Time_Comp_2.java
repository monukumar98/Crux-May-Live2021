package Lec32;

public class Time_Comp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;

		for (i = 1; i <= n; i *= 2) {
			// lon N
			System.out.println("hey");
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (int k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}

	}

}
