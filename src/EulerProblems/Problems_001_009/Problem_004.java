package EulerProblems.Problems_001_009;

import EulerProblems.EulerProblem;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem_004 implements EulerProblem {

    public String calculateResult() {
        int limit = 999;
        int largestSoFar = 1;

        for (int i = 100; i <= limit; i++) {
            for (int j = 100; j <= limit; j++) {

                int number = i * j;

                if (isPalindromeReversal(number) && number > largestSoFar) {
                    largestSoFar = number;
                }
            }
        }
        return String.valueOf((largestSoFar));
    }

    private boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);
        int stringLength = numberAsString.length();

        for (int i = 0; i < stringLength; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(stringLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindromeReversal(int number) {
        return number == reverse(number);
    }

    private int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = 10 * reversed + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
