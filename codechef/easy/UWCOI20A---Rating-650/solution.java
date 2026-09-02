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
		  while(T--> 0){
	
		      int N = sc.nextInt();
		      
		      long A[] = new  long [N];
		      
		      for(int i=0;i<N; i++){
		          A[i] = sc.nextLong();
		      }
		      
		      long max =0;
		      
		      for(int i=0;i< A.length; i++){
		          if(max < A[i]){
		              max = A[i];
		              
		          }
		     
		      }
		      System.out.println(max);
		      
		  }
	}
}
