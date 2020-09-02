public class Main {

    public static void main(String[] args) {

        int n = 1;

        while (true) {
            TriangleNumber triangleNumber = new TriangleNumber(n);
            System.out.println(triangleNumber.number);
            if (triangleNumber.numberOfFactors() > 500) {
                System.out.println(triangleNumber);
                break;
            }
        }
    }
}
