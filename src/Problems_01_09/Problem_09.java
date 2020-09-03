package Problems_01_09;

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
