package Lec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Input_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
