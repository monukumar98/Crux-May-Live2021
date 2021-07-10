package Lec23;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		// print_board_path(0, n, "");
		System.out.println(count_board_path(0, n, 0));

	}

	public static void print_board_path(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}

//		if (curr > end) {
//			return;
//		}

		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
			print_board_path(curr + dice, end, ans + dice);

		}

	}

	public static int count_board_path(int curr, int end, int ans) {
		if (curr == end) {
			// System.out.println(ans);
			return ans;
		}
		int count = 0;
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			
			 count+= count_board_path(curr + dice, end, ans+1);

		}
  
		return count;

	}

}
