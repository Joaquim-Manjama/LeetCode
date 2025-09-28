package LeetCode;

public class AddTwoNumbers {

	// Add two numbers represented by linked lists in reverse order.
	// Each node contains a single digit. Return the sum as a linked list.
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
		ListNode temp = head;
		int carry = 0;
		int sum;

		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + carry;

			if (sum >= 10) {
				temp.val = sum % 10;
				carry = 1;
			} else {
				temp.val = sum;
				carry = 0;
			}

			if (l1.next != null && l2.next != null) {
				temp.next = new ListNode();
				temp = temp.next;
			}

			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			temp.next = new ListNode();
			temp = temp.next;

			sum = l1.val + carry;

			if (sum >= 10) {
				temp.val = sum % 10;
				carry = 1;
			} else {
				temp.val = sum;
				carry = 0;
			}

			l1 = l1.next;
		}

		while (l2 != null) {
			temp.next = new ListNode();
			temp = temp.next;

			sum = l2.val + carry;

			if (sum >= 10) {
				temp.val = sum % 10;
				carry = 1;
			} else {
				temp.val = sum;
				carry = 0;
			}

			l2 = l2.next;
		}

		if (carry != 0) {
			temp.next = new ListNode(1, null);
		}

		return head;
	}
}
