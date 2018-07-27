/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,rem,palin=0,n;
		Scanner Sc=new Scanner(System.in);
		num=Sc.nextInt();
		n=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			palin=palin*10+rem;
		}
		if(palin==n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
