package Lec21;

import java.util.ArrayList;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		GenerateParentheses(3, 0, 0, "",list );
		System.out.println(list);

	}

	public static void GenerateParentheses(int n, int nop, int noc, String ans,ArrayList<String> list ) {
		if (nop == n && noc == n) {
			list.add(ans);
			return;
		}

		// opening
		if (nop < n) {
			GenerateParentheses(n, nop + 1, noc, ans + "(",list);
		}
		// closing
		if (noc < nop) {
			GenerateParentheses(n, nop, noc + 1, ans + ")",list);
		}

	}
	
	
	

}
