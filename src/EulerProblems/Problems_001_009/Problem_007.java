package EulerProblems.Problems_001_009;

import EulerProblems.EulerProblem;
import Utility.Number;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem_007 implements EulerProblem {

    public String calculateResult() {
        int count = 0;
        int n = 1;

        while (count != 10001) {
            Number number = new Number(++n);
            if (number.isPrime()) {
                count++;
            }
        }
        return String.valueOf(n);
    }
}
