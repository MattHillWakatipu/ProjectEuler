/**
 * Representation of a Fibonacci number.
 */
public class FibonacciNumber {

    private final int number;

    /**
     * Constructor for a FibonacciNumber, creates fibonacci number with recursive call.
     *
     * @param n nth FibonacciNumber.
     */
    public FibonacciNumber(int n) {
        number = createFib(n);
    }

    /**
     * Creates Fibonacci number with recursive call.
     *
     * @param n nth Fibonacci number to create.
     * @return Fibonacci number.
     */
    private int createFib(int n) {
        if (n <= 1) {
            return n;
        }
        return createFib(n - 1) + (createFib(n - 2));
    }

    /**
     * Getter for number.
     *
     * @return number.
     */
    public int getNumber() {
        return number;
    }
}
