package Lec20;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));

	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

}
