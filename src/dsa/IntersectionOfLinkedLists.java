package dsa;

public class IntersectionOfLinkedLists {
	class ListNode {
		ListNode next;
		int data;
		
		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tailA = headA;
		ListNode tailB = headB;
		
		while(headA != null && headB != null) {
			if(headA == headB) return headB;
			
			if(tailB == null) headA = headA.next;
			else tailB = tailB.next;
			
			if(tailA == null) headB = headB.next;
			else tailA = tailA.next;
			
		}         
		return null;
	}
}
