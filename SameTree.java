package LeetCode;

public class SameTree {

	// Given the roots of two binary trees p and q, write a function to check if
	// they are the same or not
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q != null || q == null && p != null)
			return false;

		if (p != null && q != null) {

			if (p.val != q.val)
				return false;
			if (!isSameTree(p.left, q.left) || !isSameTree(p.right, q.right))
				return false;
		}

		return true;
	}
}
