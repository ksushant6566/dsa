package dsa;

public class ReverseLinkedList {

	class Node {
		int data;
		Node next;
	}
	
	public void reversePI(Node head, Node tail ) {
		Node prev = null;
		Node cur = head;
		
		while(cur != null) {
			Node nextNode = cur.next;
			
			cur.next = prev;
			prev = cur;
			cur = nextNode;
		}
		
		Node temp = head;
		head = tail;
		tail = temp;
	}

}