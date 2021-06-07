package Lec5;

import java.util.Scanner;

public class Shoping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			{
				int m = scn.nextInt();
				int n = scn.nextInt();

				int Aayush = 0, Harshit = 0;
				int count = 1;
				while (true) {

					Aayush += count;
					if (Aayush > m) {
						System.out.println("Harshit");
						break;
					}
					count++;

					Harshit += count;
					if (Harshit > n) {
						System.out.println("Aayush");
						break;
					}
					count++;
				}

			}
			T--;
		}
	}

}
