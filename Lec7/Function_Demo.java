package Lec7;

public class Function_Demo {
   static  int val =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		// Addition();
		int c = 8;
		int d = 9;
		int x = AdditionReturn(8, 8);
		if (x != 0)
			System.out.println(x);
		System.out.println("bye");
		hello(AdditionReturn(c, d));
		

	}
	public static void hello(int a) {
		System.out.println(val);
		val+=5;
		System.out.println(a);
	}

	public static int  AdditionReturn(int a,int b) {

		int c = a + b;
		a = 19;
		if (a == 18) {
			
		}
		System.out.println("bye add");
		return c;

	}

	public static void AdditionParam(int a, int b) {

		int c = a + b;
		a = 19;

		System.out.println(c);
		if (a == 19)
			return;
		System.out.println("bye");

	}

	public static void Addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		Sub();
		System.out.println(c);

	}

	public static void Sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println(c);

	}

}
