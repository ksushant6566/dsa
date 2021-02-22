package dsa;
import java.util.*;

public class FoldLinkedList {
	class Node {
		Node next;
		int data;
	}
	
	class LinkedList {
		Node head;
		Node tail;
		int size;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			
			if(head == null) {
				tail = temp;
				head = temp;
			}
			else {
				tail.next = temp;
			}
			size++;
		}
		
		public void foldHelper(LinkedList ll, Node node , int floor) {
			if(node == null);
			
			foldHelper(ll, node.next, floor+1);
			
			if(floor >= size/2) {
				if(size%2 == 1 && floor == size/2) {
					ll.addLast(rleft.data);
				}else {
					ll.addLast(rleft.data);
					ll.addLast(node.data);
					
					rleft = rleft.next;					
				}
			}
		}
		
		Node rleft;
		public void fold() {
			LinkedList ll = new LinkedList();
			rleft = head;
			
			foldHelper(ll, head, 0);
			this.head = ll.head;
			this.tail = ll.tail;
		}
	}
}
