import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int power = 1000;
        BigInteger number = BigInteger.TWO;
        number = number.pow(power);

        String numberAsString = number.toString();

        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Character.getNumericValue(numberAsString.charAt(i));
        }
        System.out.println(sum);
    }
}
