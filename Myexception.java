//Exception Program
//Program to handle exception- arithmetic exception-divide by zero

import java.lang.*;

class Myexception
{
	public static void main(String []args)
	{
		int a=10,b=0;
		try
		{
			System.out.println("In try block");
			int c=a/b;
			System.out.println("division of a and b : "+c);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("In catch block");
		}
		
		finally
		{
			System.out.println("In finally block");
			System.out.println("Exception handled");
		}
	}
 }