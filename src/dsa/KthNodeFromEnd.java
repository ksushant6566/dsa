package dsa;

public class KthNodeFromEnd {

	class Node {
		int data;
		Node next;
	}
	
	public Node head = new Node();
	
	public int KthNodeFromEnd(int k) {
		
		Node s = head;
		Node f = head;
		
		while(k-- > 0) f = f.next;
		while(f.next != null) {
			f = f.next;
			s = s.next;
		}
		
		return s.data;
	}
}
