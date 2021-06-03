package Lec3;

import java.util.Scanner;

public class Sum_of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n;// sum = sum +n;
			n--;
		}
		System.out.println(sum);
	}

}
