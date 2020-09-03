package Problems_01_09;

import Utility.Number;

public class Problem_07 {

    public int calculateResult() {
        int count = 0;
        int n = 1;

        while (count != 10001) {
            Number number = new Number(++n);
            if (number.isPrime()) {
                count++;
            }
        }
        return n;
    }
}
