package Utility;

/**
 * Utility.TriangleNumber class for problem 12.
 */
public class TriangleNumber {

    long number = 0;

    /**
     * Constructor for Utility.TriangleNumber, creates the nth natural number via iteration.
     *
     * @param n nth triangle number to create.
     */
    public TriangleNumber(int n) {
        for (int i = 0; i <= n; i++) {
            number += i;
        }
    }

    /**
     * Calculate how many factors the triangle number has.
     *
     * @return Utility.Number of factors.
     */
    public int numberOfFactors() {

        int count = 0;
        int sqrtNum = (int) Math.sqrt(number);

        for (int i = 1; i <= sqrtNum; i++) {
            if (number % i == 0) {
                count += 2;
            }
        }

        if (number % sqrtNum == 0) {
            count++;
        }

        return count;
    }

    @Override
    public String toString() {
        return "Utility.TriangleNumber{" +
                "number=" + number +
                '}';
    }
}
