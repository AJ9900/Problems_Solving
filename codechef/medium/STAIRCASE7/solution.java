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

            HashMap<Integer, Integer> map = new HashMap<>();

            int max = 0;

            for(int i = 0; i < N; i++)
            {
                int x = sc.nextInt();

                int value = x - i;

                map.put(value, map.getOrDefault(value, 0) + 1);

                max = Math.max(max, map.get(value));
            }

            System.out.println(N - max);
        }
    }
}