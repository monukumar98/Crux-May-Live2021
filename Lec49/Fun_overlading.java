package Lec49;

public class Fun_overlading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2, 7));
		System.out.println(sum(1, 2, 3.9));
		System.out.println(sum(new int [6]));

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int sum(int... b) {
		int sum = 0;
		for (int val : b) {
			sum += val;

		}

		return sum;

	}

}
