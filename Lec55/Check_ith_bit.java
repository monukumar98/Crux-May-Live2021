package Lec55;

public class Check_ith_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=84;
		int i=2;
		System.out.println(Checkithbit(n, i));

	}
	public static int Checkithbit(int n, int i) {
		
		int mask = (1<<i-1);
		if((n&mask)!=0) {
			return 1;
		}
		else {
			return 0;
		}
		
		
	}

}
