package Problems_01_09;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem_09 {

    public int calculateResult() {
        int limit = 1000;

        for (int a = 1; a < limit; a++) {
            for (int b = a + 1; b < limit; b++) {

                int c = limit - a - b;

                if (c * c == a * a + b * b) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }
}
