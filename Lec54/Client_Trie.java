package Lec54;

public class Client_Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie t = new Trie();
		t.insert("raj");
		t.insert("rahul");
		t.insert("apple");
		t.insert("hack");
		t.insert("hackerrank");
		System.out.println(t.search("raj"));
		System.out.println(t.search("app"));
		System.out.println(t.noofword_startsWith("hack"));
		

	}

}
