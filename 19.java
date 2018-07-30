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
		int n,s,e,i,rem,temp,count=0;
		Scanner Sc=new Scanner(System.in);
		s=Sc.nextInt();
		e=Sc.nextInt();
		for(i=s+1;i<e;i++)
		{
			temp=i;
			n=0;
			while(temp!=0)
			{
				rem=temp%10;
				n=n+rem*rem*rem;
				temp=temp/10;
			}
			if(i==n)
			{
				System.out.println(i+"\t");
				count++;
			}
		}
	}
}
