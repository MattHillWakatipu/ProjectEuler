package EulerProblems.Problems_010_019;

import EulerProblems.EulerProblem;
import Utility.CollatzSequence;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem_014 implements EulerProblem {

    @Override
    public String calculateResult() {

        int limit = 1000000;
        CollatzSequence longestChainSoFar = new CollatzSequence(1);

        for (int i = 2; i < limit; i++) {
            CollatzSequence collatzSequence = new CollatzSequence(i);
            if (collatzSequence.compareTo(longestChainSoFar) > 0) {
                longestChainSoFar = collatzSequence;
            }
        }

        return String.valueOf(longestChainSoFar.getStartingNumber());
    }
}
