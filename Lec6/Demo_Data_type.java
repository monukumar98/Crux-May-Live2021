package Lec6;

import java.util.Scanner;

public class Demo_Data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b = (byte) 428;
		short s = 167;
		int i = 171;
		long l = 618;
		// b=i;
		// i=l;
		i = b;
		int i1 = 1000000000;
		l = 1_000_000_000_000_000l;
		long ll = sc.nextLong();
		System.out.println(b);
		System.out.println(ll);

	}

}
