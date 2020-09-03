package Problems_01_09;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem_05 {

    public long calculateResult() {
        int largestDivisor = 20;
        int result = 0;
        int number = 1;

        while (result == 0) {

            if (isDivisible(number, largestDivisor)) {
                result = number;
            }

            number++;
        }
        return result;
    }

    private boolean isDivisible(int number, int largestDivisor) {

        for (int i = 2; i < largestDivisor; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
