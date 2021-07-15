package Lec26;

public class Tilling_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		System.out.println(TillingProblem(n));

	}

	public static int TillingProblem(int n) {
		// TODO Auto-generated method stub
		if(n<4) {
			return 1;
		}

		int h=TillingProblem(n - 4);
		int v=TillingProblem(n - 1);
		return h+v;

	}

}
