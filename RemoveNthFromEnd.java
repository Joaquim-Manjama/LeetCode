package LeetCode;

public class RemoveNthFromEnd {

	// Given the head of a linked list, remove the nth node from the end of the list
	// and return its head.
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head;

		while (temp != null) {
			n--;
			temp = temp.next;
		}

		if (n == 0) {
			return head.next;
		}

		temp = head;

		for (int i = 0; i > n; i--) {
			if (i == n + 1) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}

		return head;
	}
}
