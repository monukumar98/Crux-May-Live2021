package Lec3;

import java.util.Scanner;

public class Check_Prime_Useing_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 9
		int i = 2;
		while (i < n) {

			if (n % i == 0) {

				System.out.println("Not Prime");
				break;
			}
			i++;
		}
		System.out.println(i);
		if (i == n) {
			System.out.println("prime");
		}
	}

}
