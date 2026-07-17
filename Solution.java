package LeetCode;

import java.util.*;

import java.util.Map.Entry;


@SuppressWarnings("unused")
public class Solution {

	public static void main(String[] args) {
//        String num1 = "2";
//        String num2 = "3";
        // 6
        String num1 = "123";
        String num2 = "456";
        // 56088

        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        int powerOfTen1 = 0;
        int answer = 0;

        for (int i = num1.length() - 1; i >=0; i--){

            int powerOfTen2 = 0;
            int mult = 0;
            for (int j = num2.length() - 1; j >=0; j--) {
                mult += charToInt(num1.charAt(i)) * charToInt(num2.charAt(j)) * (int)Math.pow(10, powerOfTen2);
                powerOfTen2++;
            }

            mult *= (int)Math.pow(10, powerOfTen1);
            answer += mult;
            powerOfTen1++;

            System.out.println(mult);
        }

        StringBuilder ans = new StringBuilder();

        while (answer > 0) {
            int num = answer % 10;
            answer /= 10;

            ans.append(num);
        }

        return ans.reverse().toString();
    }

    private static int charToInt(char character) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);

        return map.get(character);
    }

    // DISPLAY A ENTRY QUEUE
    public static void display(Queue<Entry<Integer, List<Integer>>> queue) {
        int i = 1;
        for (Entry<Integer, List<Integer>> entry : queue) {

            display(i + ": {" + entry.getKey() + ": " + entry.getValue() + " }");
            i++;
        }
    }

    // PRINT A TREE
    private static void display(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        TreeNode currentNode;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize > 0) {
                currentNode = queue.remove();

                if (currentNode != null) {
                    System.out.print(currentNode.val);
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                }
                levelSize--;
            }

            System.out.println("");
        }
    }

	// PRINT A STRING
	public static void display(String message) {
		System.out.println(message);
	}

	// PRINT AN INT
	public static void display(int number) {
		System.out.println(number);
	}

	// PRINT A DOUBLE
	private static void display(double number) {
		System.out.println(number);
	}

	// PRINT A BOOLEAN
	private static void display(boolean bool) {
		System.out.println(bool);
	}

	// PRINT A LIST OF INTEGERS
	public static void display(List<Integer> list) {
		StringBuilder output = new StringBuilder("[ ");

		for (int i = 0; i < list.size(); i++) {
			output.append(list.get(i));

			if (i < list.size() - 1) {
				output.append(", ");
			}
		}

		output.append(" ]");
		System.out.println(output);
	}

	// PRINT AN ARRAY OF INTEGERS
	private static void display(int[] array) {
		StringBuilder output = new StringBuilder("[ ");

		for (int i = 0; i < array.length; i++) {
			output.append(array[i]);

			if (i < array.length - 1) {
				output.append(", ");
			}
		}

		output.append(" ]");
		System.out.println(output);
	}
}
