package Lec17;

import java.util.Scanner;

public class Form_minimum_number_from {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	while (t > 0) {
			String str = sc.next();
			minimumnumber(str);
			t--;

		}

	}

	public static void minimumnumber(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		int ans[] = new int[n + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
					ans[j] = count;
					count++;
				}
			}

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();

	}

}
