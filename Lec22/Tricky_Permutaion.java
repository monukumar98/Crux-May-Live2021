package Lec22;

import java.util.Arrays;

public class Tricky_Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print_Tri_Permutation("abac", "");

	}

	public static void Print_Tri_Permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] visited = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			if (!visited[ch]) {
				visited[ch] = true;
				String roq = ques.substring(0, i) + ques.substring(i + 1);
				Print_Tri_Permutation(roq, ans + ch);

			}

		}

	}

}
