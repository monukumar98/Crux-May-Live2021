package Lec23;

public class Kpc {
	static String[] Get_String = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyPaid("235", "");

	}

	// Ques-> 234
	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);// 2
		String keyString = Get_String[ch - '1'];
		for (int i = 0; i < keyString.length(); i++) {
			KeyPaid(ques.substring(1), ans + keyString.charAt(i));

		}

	}

}
