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
		char n;
		Scanner Sc=new Scanner(System.in);
		n=Sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
