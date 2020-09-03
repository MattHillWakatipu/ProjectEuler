package Problems_10_19;

import Utility.TriangleNumber;

public class Problem_12 {
    public long calculateResult() {

        int n = 1;

        while (true) {
            TriangleNumber triangleNumber = new TriangleNumber(n);
            if (triangleNumber.numberOfFactors() > 500) {
                return triangleNumber.getNumber();
            }
            n++;
        }
    }
}
