import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();

     String A[N] = sc.next();
     String B[N] = sc.next();
     
     for(int i=0;i<A[N];i++)
     {
         
     if(A.charAt(i) == B.charAt(i)){
         System.out.println("NO");
     }else{
         System.out.println("YES");
     }
     } 
     
}
}