package LeetCode;

public class DeleteDuplicates {

	// Delete all duplicates such that each element appears only once. Return the
	// linked list sorted as well.

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		while (temp != null) {

			if (temp.next == null)
				break;

			if (temp.next.val == temp.val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}

		return head;
	}
}
