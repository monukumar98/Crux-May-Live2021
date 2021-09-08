package Lec54;

import java.util.*;

public class Trie {

	public class Node {
		char data;
		HashMap<Character, Node> children = new HashMap<>();
		boolean IsTerminal;
		int count=0;

		public Node(char data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			IsTerminal = false;
			 count=0;
			
		}

	}

	private Node root;

	public Trie() {
		this.root = new Node('*');
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			if (curr.children.containsKey(word.charAt(i))) {// Ravi
				curr = curr.children.get(word.charAt(i));

			} else {
				Node node = new Node(word.charAt(i));
				curr.children.put(word.charAt(i), node);
				curr = node;

			}
			curr.count++;

		}
		curr.IsTerminal = true;

	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			if (!curr.children.containsKey(word.charAt(i))) {
				return false;
			} else {
				curr = curr.children.get(word.charAt(i));
			}

		}
		return curr.IsTerminal;

	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			if (!curr.children.containsKey(word.charAt(i))) {
				return false;
			} else {
				curr = curr.children.get(word.charAt(i));
			}

		}
		return true;
		
	}
	public int noofword_startsWith(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			if (!curr.children.containsKey(word.charAt(i))) {
				return 0;
			} else {
				curr = curr.children.get(word.charAt(i));
			}

		}
		return curr.count;
		
	}

}
