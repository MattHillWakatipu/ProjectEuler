package Problems_10_19;

import Utility.Number;

public class Problem_10 {
    public long calculateResult() {

        int limit = 2_000_000;
        long sum = 0;

        for (int i = 0; i < limit; i++) {
            Number number = new Number(i);
            if (number.isPrime()) {
                sum += i;
            }
        }

        return sum;
    }
}
