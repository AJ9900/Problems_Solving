import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            int L = Integer.MIN_VALUE;
            int L2 = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (L < a[i]) {
                    L2 = L;
                    L = a[i];
                }
                else if (L2 < a[i] && a[i] != L) {
                    L2 = a[i];
                }
            }

            System.out.println(L + L2);
        }
    }
}