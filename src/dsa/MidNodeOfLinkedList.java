package dsa;

public class MidNodeOfLinkedList {
	class Node {
		int data;
		Node next;
	}
	
	public Node head;
	
	public int midNode() {
		Node s = head;
		Node f = head;
		
		while(f.next != null && f.next.next != null) {
			f = f.next.next;
			s = s.next;
		}
		
		return s.data;
	}
}
