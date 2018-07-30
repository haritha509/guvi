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
		int num,number,temp,total=0;
		Scanner Sc=new Scanner(System.in);
		num=Sc.nextInt();
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if(total==num)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
