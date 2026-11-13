import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long w = sc.nextLong();
        long h = sc.nextLong();

        long left = 0;
        long right = Math.max(w, h) * n;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long columns = Math.min(n, mid / w);
            long rows = Math.min(n, mid / h);

            if (columns * rows >= n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}
