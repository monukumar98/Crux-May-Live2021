package Lec25;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		int tq = 3;
		Queencombination(board, -1, tq, 0, "");

	}

	public static void Queencombination(boolean[] board, int last_index,int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = last_index+1; i < board.length; i++) {
			if (!board[i]) {// safe
				board[i] = true;
				Queencombination(board,i, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
				board[i] = false;
			}

		}

	}

}
