package Lec20;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		// head 
	int ans = n*fact(n-1);
	return ans;
		
	}
	public static int fact_tail(int n,int ans) {
		if(n==0) {
			return ans;
		}
		
		
	return fact_tail(n-1,ans*n);
	
		
	}

}
