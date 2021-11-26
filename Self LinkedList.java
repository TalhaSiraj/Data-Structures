Part: A

package linkedListDemo;

public class Node {
	int data;
	Node next;

}

Part: B

package linkedListDemo;

public class linkedList {
	Node head = null;
	
	void insertAtStart(int value) {
		Node n = new Node();
		n.data = value;
		n.next = null;
		if(head == null) {
			head = n;
		}
		else
			n.next = head;
			head = n;
	}
	
	void insert(int value) {
		Node n = new Node();
		n.data = value;
		n.next = null;
		if(head == null) {
			head = n;
		}
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	void insertAtPos(int index, int value) {
		Node n = new Node();
		n.data = value;
		n.next = null;
		if(index == 0) {
			insertAtStart(value);
		}
		else{
			Node temp = head;
			for (int i=0; i < index-1; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}
	
	void delete(int index) {
		if(index == 0) {
			head = head.next;
		}
		else{
			Node n = head;
			for (int i=0 ; i< index-1; i++) {
				n = n.next;
			}
			Node temp = n.next;
			n.next = temp.next;
			temp =null;
		}
	}
	
	void display() {
		Node n = head;
		while(n!= null) {
			System.out.print(n.data+ " -> ");
			n = n.next;
		}
	}
}

Part: C

package linkedListDemo;

public class mainClass {
	public static void main(String[] args) {
		linkedList list = new linkedList ();
		list.insert (3);
		list.insert (4);
		list.insert (7);
		list.insert (-1);
		list.insertAtPos(2, 10);
		list.display();
	}
}


