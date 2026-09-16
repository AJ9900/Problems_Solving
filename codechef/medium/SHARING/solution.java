import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc = new Scanner(System.in);
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       if(A>B){
           if((A+B)%2==0){
              
               System.out.println(B);
           } else{
               System.out.println("-1");
           }
                  	}
       }
}
