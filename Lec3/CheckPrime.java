package Lec3;

import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuumber n");
		int n = sc.nextInt();
		int i = 2;
		int fact = 0;
		while (i < n) {

			if (n % i == 0) {
				fact = 8686;
				System.out.println("Not Prime");
				break;
			}
			i++;
		}
		if (fact == 0) {
			System.out.println("prime");
		}

	}

}
