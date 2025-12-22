package LeetCode;

public class ReverseNodesInKGroups {

	// Given the head of a linked list, reverse the nodes of the list k at a time,
	// and return the modified list.
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(-1, head);
		ListNode[] nodes = new ListNode[k];
		ListNode first = dummy.next;
		ListNode temp = dummy;
		boolean broke = false;

		while (first != null) {
			broke = false;

			for (int i = 0; i < k; i++) {
				nodes[i] = first;
				first = first.next;

				if (first == null && i < k - 1) {
					broke = true;
					break;
				}
			}

			if (first == null && broke) {
				return dummy.next;
			}

			for (int i = k - 1; i >= 0; i--) {
				temp.next = nodes[i];
				temp = temp.next;
			}
			temp.next = first;
		}
		return dummy.next;
	}
}
