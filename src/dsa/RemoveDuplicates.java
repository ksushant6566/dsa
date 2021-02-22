package dsa;

public class RemoveDuplicates {
	class Node {
		int data;
		Node next;
	}
	
	static Node head;
	
	static void removeDuplicates() {
		Node cur = head;
		
		while(cur != null && cur.next != null) {
			if(cur.data == cur.next.data) {
				Node temp = cur.next;
				while( temp != null && cur.data == temp.data) temp = temp.next;
				cur.next = temp;
			}
			cur = cur.next;
		}
	}
}
