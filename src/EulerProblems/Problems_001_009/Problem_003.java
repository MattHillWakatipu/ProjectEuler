package EulerProblems.Problems_001_009;

import EulerProblems.EulerProblem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem_003 implements EulerProblem {

    @Override
    public String calculateResult() {

        long number = 600_851_475_143L;
        int factor = 2;
        int lastFactor = 1;

        while (number > 1) {

            //check if number divisible by factor
            if (number % factor == 0) {
                lastFactor = factor;
                number = number / factor;

                //check same factor again
                while (number % factor == 0) {
                    number = number / factor;
                }
            }
            factor++;
        }
        return String.valueOf(lastFactor);
    }
}
