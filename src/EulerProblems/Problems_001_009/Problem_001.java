package EulerProblems.Problems_001_009;

import EulerProblems.EulerProblem;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem_001 implements EulerProblem {

    @Override
    public String calculateResult() {
        int limit = 1000;
        int sum = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return String.valueOf((sum));
    }
}
