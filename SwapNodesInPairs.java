package LeetCode;

public class SwapNodesInPairs {
	
	// Given a linked list, swap every two adjacent nodes and return its head.
	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(-1, head);
		ListNode prev = dummy;
		ListNode first = dummy.next;
		ListNode second;
		ListNode temp;

		while (first != null && first.next != null) {
			second = first.next;
			temp = second.next;
			prev.next = second;
			second.next = first;
			first.next = temp;

			prev = first;
			first = temp;
		}

		return dummy.next;
	}
}
