package Lec24;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partitioning("nitin", "");

	}

	public static void Partitioning(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String roq = ques.substring(i);// Rest of Question
			String roa = ques.substring(0, i);// Rest of answer
			if (isPalindrome(roa)) {

				Partitioning(roq, ans + roa+"  ");
			}

		}

	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
