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

            String S = sc.next();
            String L = sc.next();

            int current = 0;
            int max = 0;
            boolean previousLeft = false;

            for(int i = 0; i < N; i++)
            {
                boolean left = L.indexOf(S.charAt(i)) != -1;

                if(i == 0 || left != previousLeft)
                {
                    current = 1;
                }
                else
                {
                    current++;
                }

                max = Math.max(max, current);
                previousLeft = left;
            }

            System.out.println(max);
        }
    }
}