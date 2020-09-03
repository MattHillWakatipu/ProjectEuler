package Utility;

/**
 * Utility.Number class for use in ProjectEuler problems.
 */
public class Number {

    public Number(int number) {
        this.number = number;
    }

    int number;

    /**
     * Checks whether the number is prime.
     *
     * @return True if number is prime, otherwise false.
     */
    public boolean isPrime() {

        //Case 1: Less than 2, not prime.
        if (number < 2) {
            return false;
        }

        //Case 2: 2 or 3 are prime.
        if (number == 2 || number == 3) {
            return true;
        }

        //Case 3: Divisible by 2 or 3, not prime.
        if ((number & 1) == 0 || number % 3 == 0) {
            return false;
        }

        //Case 4: Need to check if prime
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //TODO More efficient version? Need to check.
    /**
     * Checks whether the number is prime.
     *
     * @return True if number is prime, otherwise false.
     */
    public boolean untestedIsPrime() {

        //Case 1: Less than 2, not prime.
        if (number < 2) {
            return false;
        }

        //Case 2: 2 or 3 are prime.
        if (number == 2 || number == 3) {
            return true;
        }

        //Case 3: Divisible by 2 or 3, not prime.
        if ((number & 1) == 0 || number % 3 == 0) {
            return false;
        }

        //Case 4: Need to check if prime
        int squareRoot = (int) Math.sqrt(number);   //TODO check if this needs to be Math.sqrt(number) + 1
        for (int i = 6; i <= squareRoot; i += 6) {// loop 6 step
            if (number % (i - 1) == 0 || number % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
