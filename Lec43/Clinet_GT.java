package Lec43;

public class Clinet_GT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_tree gt = new Generic_tree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.find(100));
		System.out.println(gt.max());
		System.out.println(gt.ht());
		gt.PreOrde();
		gt.PostOrde();
		gt.linearize();
		gt.display();

	}

}
// 10 3 20 2 50 0 60 0 30 1 90 0 40 2 100 0 200 0