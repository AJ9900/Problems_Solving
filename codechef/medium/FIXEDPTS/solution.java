import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int N = sc.nextInt();
            
            int K = sc.nextInt();

            if (K == N || K <= N - 2)
            {
                System.out.println("Yes");
            }
            
            
            else
            {
                System.out.println("No");
            }
        }
    }
}