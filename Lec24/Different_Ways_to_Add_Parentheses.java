package Lec24;

import java.util.*;

public class Different_Ways_to_Add_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans = Parentheses("2*3-4*5");
		System.out.println(ans);

	}

	public static ArrayList<Integer> Parentheses(String str) {
		if (str.indexOf('+') == -1 && str.indexOf('-') == -1 && str.indexOf('*') == -1) {

			ArrayList<Integer> bs = new ArrayList<Integer>();
			bs.add(Integer.parseInt(str));// Integer.parseInt String to Integer
			return bs;

		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				ArrayList<Integer> left = Parentheses(str.substring(0, i));
				ArrayList<Integer> right = Parentheses(str.substring(i + 1));
				for (int val : left) {
					for (int val1 : right) {
						if (ch == '-') {
							ans.add(val - val1);
						}
						if (ch == '+') {
							ans.add(val + val1);
						}
						if (ch == '*') {
							ans.add(val * val1);
						}
					}

				}
			}

		}
		return ans;
	}

}
