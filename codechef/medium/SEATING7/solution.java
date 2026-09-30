import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            boolean[] occupied = new boolean[N + 1];

            // Already occupied seats
            for(int i = 0; i < M; i++)
            {
                int seat = sc.nextInt();
                occupied[seat] = true;
            }

            int count = 0;

            // Find K lowest available seats
            for(int i = 1; i <= N && count < K; i++)
            {
                if(!occupied[i])
                {
                    System.out.print(i + " ");
                    occupied[i] = true;
                    count++;
                }
            }

            System.out.println();
        }
    }
}