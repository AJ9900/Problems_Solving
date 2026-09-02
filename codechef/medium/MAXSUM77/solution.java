import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static long solve(int N, int K, int[] A) {
        int window = N - K;

        long sum = 0;

        for (int i = 0; i < window; i++) {
            sum += A[i];
        }

        long maxSum = sum;
        
        for (int i = window; i < N; i++) {
            sum += A[i];
            sum -= A[i - window];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println(solve(N, K, A));
        }
    }
}