package Lec48;

public class Bst_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		Binary_Search_tree bst = new Binary_Search_tree(in);
		bst.PostOrder();
	}

}
