package Problems_20_29;

import java.math.BigInteger;

/**
 * he Fibonacci sequence is defined by the recurrence relation:
 *
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 *
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 *
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem_25 {

    public int calculateResult() {
        BigInteger limit = (new BigInteger("10")).pow(999);
        BigInteger[] fibNumbers = new BigInteger[3];

        fibNumbers[0] = BigInteger.ONE;
        fibNumbers[2] = BigInteger.ONE;

        int i = 0;
        int n = 2;

        while ((fibNumbers[i]).compareTo(limit) < 0) {
            i = (i + 1) % 3;
            fibNumbers[i] = fibNumbers[(i + 1) % 3].add(fibNumbers[(i + 2) % 3]);
            n++;
        }

        return n;
    }
}
