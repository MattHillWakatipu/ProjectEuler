public class PrimeChecker {

    boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        /*if ((n & 1) == 0 || n % 3 == 0) {
            return false;
        }
        int sqrtN = (int) Math.sqrt(n) + 1;
        for (int i = 6; i <= sqrtN; i += 6) {// loop 6 step
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;*/

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
