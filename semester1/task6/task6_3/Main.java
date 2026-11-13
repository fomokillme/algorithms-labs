import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double left = 1;
        double right = a + 1;

        while (right - left > 0.0000001) {
            double mid = (left + right) / 2;

            double result = mid * mid - mid + Math.sqrt(mid);

            if (result < a) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.println((left + right) / 2);
    }
}
