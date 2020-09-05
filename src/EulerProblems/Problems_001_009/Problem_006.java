package EulerProblems.Problems_001_009;

import EulerProblems.EulerProblem;

/**
 * The sum of the squares of the first ten natural numbers is,
 *      1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *      (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 *      3025 - 385 = 2640
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem_006 implements EulerProblem {

    public String calculateResult() {
        int limit = 100;
        int sum = 0;
        long sumOfSquares = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
            sumOfSquares += Math.pow(i, 2);
        }
        long squareOfSum = (long) Math.pow(sum, 2);

        return String.valueOf(squareOfSum - sumOfSquares);
    }
}
