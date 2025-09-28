package LeetCode;

public class MergeTwoSortedLists {

	// Merge two lists into a sorted list
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode mergedList = new ListNode(0);
		ListNode tail = mergedList;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}

			tail = tail.next;
		}

		if (list1 == null)
			tail.next = list2;
		else
			tail.next = list1;

		return mergedList.next;
	}
}
