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
		while(T-->0){
		    
		 int N = sc.nextInt();
		 if (N%2==0){
		     
		     System.out.println(N*15);
		 } else{
		     System.out.println(N*15+5);
		 }
		}
	    	    
	}
}
