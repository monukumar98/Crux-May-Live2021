package Lec5;

import java.util.*;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			sum += n;
			if (sum <0) {
				break;
			} 
			else {
				System.out.println(n);
			}
		}

	}

}
