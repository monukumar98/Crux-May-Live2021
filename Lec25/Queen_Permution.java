package Lec25;

public class Queen_Permution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		int tq = 2;
		Queenpermutation(board, tq, 0, "");

	}

	public static void Queenpermutation(boolean []board ,int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			if (!board[i]) {// safe
				board[i] = true;
				Queenpermutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
				board[i]=false;
			}

		}

	}

}
