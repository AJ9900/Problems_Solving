import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;
            int m = 0;

            while (count < N) {
                m++;
                if (m % K != 0) {
                    count++;
                }
            }

            System.out.println(m);
        }
    }
}