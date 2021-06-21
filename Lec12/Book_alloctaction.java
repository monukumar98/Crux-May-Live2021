package Lec12;

import java.util.Scanner;

import Lec4.pattern4;

public class Book_alloctaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int[] page = new int[nob];
			for (int i = 0; i < page.length; i++) {
				page[i] = sc.nextInt();
			}
			System.out.println(bookallocation(page, nos));
		}

	}

	public static int bookallocation(int[] book, int nos) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < book.length; i++) {
			hi += book[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(book, nos, mid)) {
				hi = mid - 1;
				ans = mid;

			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] book, int nos, int mid) {
		// TODO Auto-generated method stub
		int student =1;
		int no_of_pages=0;
		int i=0;
		while(i<book.length) {
			if(no_of_pages+book[i]<=mid) {
				no_of_pages+=book[i];
				i++;
				
			}
			else {
				no_of_pages=0;
				student++;
			}
			
			if(student>nos) {
				return false;
			}
		}
		return true;
		
		
	}

}
