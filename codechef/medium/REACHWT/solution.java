import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
	      int N=0, N1=0,N2=0;
	      if( T==1){
	          N1 =20;
	      }
	      else if (T==2){
	          N2 =30;
	      }
	      else{
	          N = N1+N2;
	      }
	    System.out.println(N);
	}
}
