package EulerProblems.Problems_010_019;

import EulerProblems.EulerProblem;

import java.math.BigInteger;

/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 21000?
 */
public class Problem_016 implements EulerProblem {

    @Override
    public String calculateResult() {

        int sum = 0;
        int power = 1000;
        BigInteger number = BigInteger.TWO;
        number = number.pow(power);

        String numberAsString = number.toString();

        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Character.getNumericValue(numberAsString.charAt(i));
        }

        return String.valueOf(sum);
    }
}
