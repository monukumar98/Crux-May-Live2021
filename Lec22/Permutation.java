package Lec22;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_Permutation("abc", "");

	}

	public static void Print_Permutation(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			Print_Permutation(roq, ans + ques.charAt(i));

		}

	}

}
