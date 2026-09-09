import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();

     String A = sc.next();
     String B = sc.next();
     
     int aC = 0,bC =0;
     for(int i=0;i<N;i++)
     {
         if(A.charAt(i)=='a'){
             aC++;
         }
         if(B.charAt(i)=='a'){
             bC++;
         }
     } 
     if(aC == bC){
         System.out.println("NO");
     }else{
         System.out.println("YES");
     }
     
}
}