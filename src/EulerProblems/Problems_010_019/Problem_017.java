package EulerProblems.Problems_010_019;

import EulerProblems.EulerProblem;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 *
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
 * and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Problem_017 implements EulerProblem {

    private final String[] ONES = {"zero" + "one" + "two" + "three" + "four" + "five" + "six" + "seven" + "eight" + "nine"};
    private final String[] ELEVENS = {"eleven" + "twelve" + "thirteen" + "fourteen" + "fifteen" + "sixteen" + "seventeen" + "eighteen" + "nineteen"};
    private final String[] TENS = {"twenty" + "thirty" + "forty" + "fifty" + "sixty" + "seventy" + "eighty" + "ninety"};

    @Override
    public String calculateResult() {
        return null;
        /*int sum = 0;
        int limit = 10;

        for (int i = 1; i < limit; i++) {
            sum += intFullString(i).length();
        }
        return String.valueOf(sum);*/
    }

    private String intFullString(int number) {

        //Zero to twenty
        if (number >= 0 && number <= 9) {
            return ONES[number];
        }
        return ONES[0];
    }
}
