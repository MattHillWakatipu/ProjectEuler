public class Main {

    public static void main(String[] args) {

        int n = 1;

        while (true) {
            TriangleNumber triangleNumber = new TriangleNumber(n);
            if (triangleNumber.numberOfFactors() > 500) {
                System.out.println(triangleNumber);
                break;
            }
            n++;
        }
    }
}
