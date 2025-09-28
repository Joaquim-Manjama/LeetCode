package LeetCode;

public class ClimbingStairs {

	/*
	 * You are climbing a staircase. It takes n steps to reach the top. Each time
	 * you can either climb 1 or 2 steps. In how many distinct ways can you climb to
	 * the top?
	 */
	public static int climbStairs(int n) {
		int oldAns = 1;
		int newAns = 1;
		int temp;

		for (int i = 1; i < n; i++) {
			temp = newAns;
			newAns += oldAns;
			oldAns = temp;
		}
		return newAns;
	}
}
