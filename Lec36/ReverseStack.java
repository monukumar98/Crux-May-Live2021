package Lec36;

import Lec34.Stack;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack s = new DynamicStack();
		for (int i = 1; i <= 6; i++) {
			s.push(10 * i);
		}
		s.DisPlay();
		System.out.println("............");
		Reverse(s);
		s.DisPlay();
	}

	public static void Reverse(Stack s) throws Exception {

		if (s.isEmpty()) {
			return;
		}
		int item = s.pop();
		Reverse(s);
		Insert_bottom(s,item);
		//s.push(item);

	}

	private static void Insert_bottom(Stack s, int item) throws Exception {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		int item1 = s.pop();
		Insert_bottom(s, item);
		s.push(item1);
		
	}

}
