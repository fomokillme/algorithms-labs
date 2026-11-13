import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (a[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            int answer;

            if (left == 0) {
                answer = a[0];
            } else if (left == n) {
                answer = a[n - 1];
            } else if ((long) x - a[left - 1] <= (long) a[left] - x) {
                answer = a[left - 1];
            } else {
                answer = a[left];
            }

            if (i > 0) System.out.print(" ");
            System.out.print(answer);
        }
    }
}
