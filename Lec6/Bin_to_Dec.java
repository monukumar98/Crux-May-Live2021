package Lec6;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100110;
		int ans = 0;
		int mul = 1;
		while(n!=0) {
			int rem = n%10;
			ans = ans + rem*mul;
			mul=mul*2;
			n/=10;
		}
		System.out.println(ans);
		

	}

}
