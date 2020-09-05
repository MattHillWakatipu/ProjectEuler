package EulerProblems.Problems_10_19;

import EulerProblems.EulerProblem;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
public class Problem_015 implements EulerProblem {

    public String calculateResult() {

        int n = 20;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= (i + n);
            result /= i;
        }

        return Long.toString(result);
    }
}
