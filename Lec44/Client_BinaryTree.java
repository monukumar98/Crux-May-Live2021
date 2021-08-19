package Lec44;

public class Client_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binary_Tree bt = new Binary_Tree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.size());
		bt.PerOrder();
		bt.postOrder();
		bt.InOder();
		bt.LevelOrder();
		bt.LevelOrderLevelwise1();
		bt.LevelOrderLevelwise2();
		bt.Zig_ZagOrder();
		
		

	}
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
}
