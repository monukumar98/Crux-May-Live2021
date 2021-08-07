package Lec38;

import java.util.Scanner;

public class Client_Min_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack ms = new MinStack();
		ms.push(10);
		ms.push(50);
		ms.push(5);
		ms.push(60);
		ms.push(40);
		ms.push(7);
		ms.push(3);

		System.out.println(ms.min());
		System.out.println(ms.pop());
		System.out.println(ms.min());

	}

}
