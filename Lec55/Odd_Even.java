package Lec55;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 70;
		if(checkoddeven(n)) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

	public static boolean checkoddeven(int n) {

		if ((n & 1) == 0) {
			return true;
		}
		return false;

	}

}
