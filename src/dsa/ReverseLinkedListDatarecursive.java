package dsa;

public class ReverseLinkedListDatarecursive {
	class Node {
		int data;
		Node next;
	}
	
	class LinkedList {
		Node head;
		Node tail;
		int size;
		
		
		private Node rleft;
		public void reverse() {
			rleft = head;
			reverseHelper(head, 0);
		}
		
		private void reverseHelper(Node node, int floor) {
			if(node == null) return;
			
			reverseHelper(node.next, floor+1);
			
			if(floor >= size/2) {
				int temp = node.data;
				node.data = rleft.data;
				rleft.data = temp;
				
				rleft = rleft.next;				
			}
			
		}
	}
	
}
