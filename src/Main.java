public class Main {

    public static void main(String[] args) {

        int limit = 1000000;
        CollatzSequence longestChainSoFar = new CollatzSequence(1);

        for (int i = 2; i < limit; i++) {
            CollatzSequence collatzSequence = new CollatzSequence(i);
            if (collatzSequence.compareTo(longestChainSoFar) > 0) {
                longestChainSoFar = collatzSequence;
            }
            System.out.println(i);
        }

        System.out.println(longestChainSoFar);

    }
}
