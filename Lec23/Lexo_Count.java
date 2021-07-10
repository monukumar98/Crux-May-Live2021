package Lec23;

public class Lexo_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counting(0, 1000);

	}

	public static void counting(int curr, int end) {
		if (curr > end) {
			return;
		}

		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			counting(curr * 10 + i, end);
		}

	}

}
