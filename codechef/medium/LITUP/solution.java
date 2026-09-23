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
			int K = sc.nextInt();

			int C[] = new int[N];

			for(int i = 0; i < N; i++)
			{
				C[i] = sc.nextInt();
			}

			int ans = Integer.MAX_VALUE;

			for(int i = 0; i < N; i++)
			{
				for(int j = i + 1; j < N; j++)
				{
					int count = 0;

					for(int x = 0; x < N; x++)
					{
						if(Math.abs(i-x) <= K || Math.abs(j-x) <= K)
						{
							count++;
						}
					}

					if(count == N)
					{
						ans = Math.min(ans, C[i] + C[j]);
					}
				}
			}

			if(ans == Integer.MAX_VALUE)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(ans);
			}
		}
	}
}