package Lec15;

public class Print_Stubtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nitin";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {
				String ans = str.substring(i, j);
				if (isPalidrome(ans)) {
					System.out.println(ans);
				}
			}
		}

	}

	public static boolean isPalidrome(String str) {
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
