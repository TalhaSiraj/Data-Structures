Part A:

package bstDemo;

import javafx.scene.Node;

public class BST {
	Node root;
	public BST() {
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root,key);
	}
	Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		else if(root.key > key) {
			root.left = insertRec(root.left,key);
		}
		else if(root.key < key) {
			root.right = insertRec(root.right,key);
		}
		return root;
	}
	
	Node search(Node root, int key) {
		if(root == null || root.key == key) {
			return root;
		}
		else if(root.key > key) {
			return search(root.left,key);
		}
		else if(root.key < key) {
			return search(root.right,key);
		}
		return root;
	}


	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(40);
		bst.insert(35);
		bst.insert(42);
		bst.insert(32);
		bst.insert(37);
		bst.insert(41);
		Node result = bst.search(bst.root, 7);
		if(result == null)
			System.out.println("Value doesn't exist");
		else
			System.out.println("Value exist");
	}
}

Part B:

package bstDemo;

public class Node {
		int key;
		Node left;
		Node right;

		public Node(int val) {
			key = val;
			left = null;
			right = null;
		}
}