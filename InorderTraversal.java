package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	// Given the root of a binary tree, return the inorder traversal of its nodes'
	// values
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		TreeNode node = root;

		if (node == null)
			return list;

		list.addAll(inorderTraversal(node.left));
		list.add(node.val);
		list.addAll(inorderTraversal(node.right));
		;

		return list;
	}
}
