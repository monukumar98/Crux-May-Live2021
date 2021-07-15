package Lec24;

import java.util.ArrayList;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Partitioning("nitin", "");
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		ArrayList<String> list = new ArrayList<String>();
		Partitioning_LeetCode("aba", list, ans);
		System.out.println(ans);

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

				Partitioning(roq, ans + roa + "  ");
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

	public static void Partitioning_LeetCode(String ques, ArrayList<String> list, ArrayList<ArrayList<String>> ans) {
		if (ques.length() == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String roq = ques.substring(i);// Rest of Question
			String roa = ques.substring(0, i);// Rest of answer
			if (isPalindrome(roa)) {

				list.add(roa);
				Partitioning_LeetCode(roq, list, ans);
				list.remove(list.size() - 1);// 

			}

		}

	}
}
