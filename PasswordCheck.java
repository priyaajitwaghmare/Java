//Write a program(WAP) to accept a password from the user and throw "authentication Failure" 
//if the password is incorrect.

import java.util.Scanner;

class PasswordCheck
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur password : ");
		String pwd=sc.next();
		try
		{
			if(pwd.equals("abc123"))
			{
				System.out.println("Authentication Success");
			}
			else
			{
				throw new passwordException("Authentication Failure");
			}
		}
		catch(passwordException e)
		{
			System.out.println(e);
		}
	}
}

class passwordException extends Exception
{
	passwordException(String str)
	{
		super(str);
	}
}