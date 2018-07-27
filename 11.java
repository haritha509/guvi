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
		int k,n,i,sum=0;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		k=Sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		for(i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
