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

			int A[] = new int[N];
			long prefix[] = new long[N];
			long suffix[] = new long[N];

			for(int i = 0; i < N; i++)
			{
				A[i] = sc.nextInt();
			}

			// Prefix sum
			prefix[0] = A[0];

			for(int i = 1; i < N; i++)
			{
				prefix[i] = prefix[i-1] + A[i];
			}

			boolean good = true;

			for(int i = 0; i < N; i++)
			{
				if(prefix[i] < 0)
				{
					good = false;
					break;
				}
			}

			if(good)
			{
				System.out.println("YES");
				continue;
			}

			// Suffix minimum of prefix sums
			suffix[N-1] = prefix[N-1];

			for(int i = N-2; i >= 0; i--)
			{
				suffix[i] = Math.min(prefix[i], suffix[i+1]);
			}

			boolean possible = false;

			// Try deleting one element
			for(int i = 0; i < N; i++)
			{
				// Sum before A[i] must already be >= 0
				if(i > 0 && prefix[i-1] < 0)
				{
					break;
				}

				long minAfter;

				if(i == N-1)
				{
					minAfter = 0;
				}
				else
				{
					minAfter = suffix[i+1];
				}

				// After deleting A[i]
				if(minAfter - A[i] >= 0)
				{
					possible = true;
					break;
				}
			}

			if(possible)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}