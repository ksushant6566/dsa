package dsa;

public class AddTwoLinkedList {

	class Node {
		int data;
		Node next;
	}
	
	class LinkedList {
		Node head;
		Node tail;
		int size;
		
		
		public void addFirst(int val) {

			Node temp = new Node();
			temp.data = val;
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
			size++;
		}
		
		
		public int helper(LinkedList ll, Node a, int i, Node b, int j) {
			if(a == null || b == null) {
				return 0;
			}
			
			int carry;
			if(i == j) {
				carry = helper(ll, a.next, i-1, b.next, j-1);
				int sum = a.data + b.data + carry;
				int d = sum%10;
				int nextCarry = sum/10;
				
				ll.addFirst(d);
				return nextCarry;
			
			}else {
				carry = helper(ll, a.next, i-1, b, j);
				
				int sum = a.data + carry;
				int d = sum%10;
				int nextCarry = sum/10;
				
				ll.addFirst(d);
				return nextCarry;
			}
		}
		
		public LinkedList addTwoLinkedList(LinkedList l1, LinkedList l2) {
			LinkedList ll = new LinkedList();
			int carry;
			if(l1.size > l2.size ) {
				carry = helper(ll, l1.head, l1.size, l2.head, l2.size);
			}else {
				carry = helper(ll, l2.head, l2.size, l1.head, l1.size);
			}
			
			if(carry != 0) {
				ll.addFirst(carry);
			}
			return ll;
		}
	}
	
}
