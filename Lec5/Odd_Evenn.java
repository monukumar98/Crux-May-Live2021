package Lec5;

import java.util.*;

public class Odd_Evenn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int odd_sum = 0;
			int even_sum = 0;
			while (n != 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					even_sum += rem;// even_sum=even_sum+rem
				} else {
					odd_sum += rem;
				}
				n /= 10;

			}
			if (even_sum % 4 == 0 || odd_sum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}
	}

}
