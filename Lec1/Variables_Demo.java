package Lec1;


public class Variables_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;

//		System.out.println("X is "+x);
//		int a=6;
//		int b =5;
//		int c = a+b;
//		System.out.println(c);
//		int d = a-b;
//		System.out.println(d);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(6%4);
		
		int a=5;
		int b=2;
		int c = a++ +b;//Post Inc
		System.out.println(c);
		System.out.println(a);
		//System.out.println(c);
		 

		int a1=5;
		int b1=2;
		int c1 = ++a1 +b1;// Pre Inc
		System.out.println(c1);
		System.out.println(a1);
		
		System.out.println();
		
		int a2=5;
		int b2=4;
		int c2=a2-- -b2;// Post Dec
		System.out.println(c2);
		System.out.println(a2);
		
		int a3=5;
		int b3=4;
		int c3=--a3 -b3;// Pre Dec
		System.out.println(c3);
		System.out.println(a3);
		System.out.println();
		int y =8;
		y-=4;// y = y -4;
		System.out.println(y);
		
		 
		 
	}

}
