package LeetCode;

public class MergeSortedLists {

	// Merge all the linked-lists into one sorted linked-list and return it.
	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode output = null;

		for (ListNode list : lists) {
			output = merge(output, list);
		}
		return output;
	}

	private static ListNode merge(ListNode list1, ListNode list2) {
		ListNode output = new ListNode();
		ListNode temp1 = list1;
		ListNode temp2 = list2;
		ListNode tempOutput = output;

		boolean empty = true;

		while (temp1 != null && temp2 != null) {
			empty = false;

			if (temp1.val < temp2.val) {
				tempOutput.val = temp1.val;
				temp1 = temp1.next;

			} else {
				tempOutput.val = temp2.val;
				temp2 = temp2.next;
			}

			if (temp1 != null && temp2 != null) {
				tempOutput.next = new ListNode();
				tempOutput = tempOutput.next;
			}
		}

		if (temp1 == null) {
			tempOutput.next = temp2;
		}

		if (temp2 == null) {
			tempOutput.next = temp1;
		}

		return !empty ? output : output.next;
	}
}
