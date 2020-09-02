import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger limit = (new BigInteger("10")).pow(999);
        BigInteger[] fibNumbers = new BigInteger[3];

        fibNumbers[0] = BigInteger.ONE;
        fibNumbers[2] = BigInteger.ONE;

        int i = 0;
        int n = 2;

        while ((fibNumbers[i]).compareTo(limit) < 0) {
            i = (i + 1) % 3;
            fibNumbers[i] = fibNumbers[(i + 1) % 3].add(fibNumbers[(i + 2) % 3]);
            n++;
        }

        System.out.println(n);
    }
}
