package dsa;
import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
	
	class Node {
		int data;
		Node next;
	}
	
	public static LinkedList<Integer> mergeTwoSorted(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		int a = 0;
		int b = 0;
		
		while(a < l1.size() && b < l2.size()) {
			Integer va = l1.get(a);
			Integer vb = l2.get(b);
			
			if (va < vb) {
				ll.add(va);
				a++;
			}else {
				ll.add(vb);
				b++;
			}
		}
		
		if(a == l1.size()) {
			while(b < l2.size()) {
				ll.add(l2.get(b++));
			}
		}else {
			while(a < l2.size()) {
				ll.add(l1.get(a++));
			}
		}
		
		return ll;
	}
	
	public static Node getMid(Node head, Node tail) {
		Node s = head;
		Node f = head;
		
		while( f != tail && f.next != tail) {
			f = f.next.next;
			s = s.next.next;
		}
		
		return s;
		
	}
	
	public static LinkedList<Integer> mergeSort(Node head, Node tail) {
		if(head == null || tail == null) {
			return new LinkedList<Integer>();
		}
		if(head == tail) {
			LinkedList<Integer> ll = new LinkedList<Integer>();
			ll.add(head.data);
			return ll;
		}
		
		Node mid = getMid(head, tail);
		
		LinkedList<Integer> l1 = mergeSort(head, mid);
		LinkedList<Integer> l2 = mergeSort(mid.next, tail);
		
		LinkedList<Integer> ll = mergeTwoSorted(l1, l2);
		return ll;
		
	}
}	



























