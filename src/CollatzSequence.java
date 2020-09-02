/**
 * CollatzSequence class for problem 14.
 */
public class CollatzSequence implements Comparable<CollatzSequence> {

    private final long startingNumber;
    private final long chainLength;

    /**
     * Constructor for CollatzSequence.
     *
     * @param startingNumber Starting number to create a CollatzSequence from.
     */
    public CollatzSequence(int startingNumber) {
        this.startingNumber = startingNumber;
        chainLength = calculateChainLength();
    }

    /**
     * Calculate the chain length of the CollatzSequence.
     *
     * @return ChainLength of the CollatzSequence.
     */
    private long calculateChainLength() {
        int count = 1;
        long num = startingNumber;
        while (num != 1) {
            num = nextNumberInSequence(num);
            count++;
        }
        return count;
    }

    /**
     * Calculates the next number in collatz sequence.
     * If passed number is even, divide by 2, otherwise times by 3 and add 1.
     *
     * @param num Number to calculate next from.
     * @return Next number in Collatz sequence.
     */
    private long nextNumberInSequence(long num) {

        if (num % 2 == 0) {
            return num / 2;
        } else {
            return (num * 3) + 1;
        }
    }

    /**
     * Getter for chainLength.
     *
     * @return chainLength.
     */
    public long getChainLength() {
        return chainLength;
    }

    @Override
    public int compareTo(CollatzSequence o) {
        return (int) (this.getChainLength() - o.getChainLength());
    }

    @Override
    public String toString() {
        return "CollatzSequence{" +
                "startingNumber=" + startingNumber +
                ", chainLength=" + chainLength +
                '}';
    }
}
