package LeetCode;

public class DivideTwoIntegers {

	// Divide two integers 
	// Without using multiplication, division, and mod operator
	public static int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }

        if (divisor == -1) {
            if (dividend < 0) {
                return abs(dividend);
            }

            return (0 - dividend);
        }

        int absDividend = abs(dividend);
        int absDivisor = abs(divisor);
        int sum = 0;

        if (divisor == Integer.MIN_VALUE && divisor != dividend && absDividend == absDivisor) {
            return 0;
        }

        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            sum++;
        }

        if (dividend == Integer.MIN_VALUE && (divisor == 2 || divisor == 4)) {
            sum++;
        }

        return (dividend >= 0 && divisor >= 0 || dividend < 0 && divisor < 0) ? sum : 0 - sum;
    }

	private static int abs(int number) {
		if (number == Integer.MIN_VALUE){
			return Integer.MAX_VALUE;
		}

		return Math.abs(number);
	}
}
