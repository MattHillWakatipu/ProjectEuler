package Problems_10_19;

import Utility.Number;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem_10 {
    public long calculateResult() {

        int limit = 2_000_000;
        long sum = 0;

        for (int i = 0; i < limit; i++) {
            Number number = new Number(i);
            if (number.isPrime()) {
                sum += i;
            }
        }

        return sum;
    }
}
