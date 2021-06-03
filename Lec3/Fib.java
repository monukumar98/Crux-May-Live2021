package Lec3;

public class Fib {
	public static void main(String[] args) {
		int n = 1;
		int a=0;
		int b=1;
		while(n>=1) {
			int c = a+b;
			a=b;
			b=c;
			n--;
		}
		System.out.println(a);
	}
}
