import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner sc= new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int F = sc.nextInt();
		
		if(X*12 < Y*12+F){
		    System.out.println(X*12);
		}
		else{
		    System.out.println(Y*12+F);
		}

	}
}
