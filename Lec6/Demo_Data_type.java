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
		byte bb = 123;
		System.out.println(bb);
		// b=i;
		// i=l;
		i = b;
		int i1 = 1000000000;
		l = (1_000_000_0000l);
		// long ll = sc.nextLong();
		System.out.println(b);
		// System.out.println(ll);
		double d = 6.9;// 8 byte
		float f = 5.6f;// 4 byte
		f = (float) d;
		System.out.println(f);
		i = (int) d;
		System.out.println(i);
		d = i;
		System.out.println(d);
//		d = sc.nextDouble();
//		f = sc.nextFloat();
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);
		// ch =197;
		// System.out.println(ch);
		ch++;// ch = (char) (ch+1);
		System.out.println(ch);
	
//		System.out.println("bye");
//		System.out.println(1);
		ch = (char) (ch+1);
		System.out.println(ch);
		ch = (char) (ch +  '1');
		char ch1='1';
		System.out.println((int)ch1);
		System.out.println();
		System.out.println(ch);
//		char ch1 = 'y';
//		//ch =  (ch + ch1);//ab
//		System.out.println(ch);
		boolean bl= true;
		bl=false;

	}
	 

}
