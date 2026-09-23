import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	
	String S = sc.nextLine().toLowerCase();
    
    if (S.charAt(0)==S.charAt(2) && S.charAt(1)==S.charAt(3) ){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }

	}
}
