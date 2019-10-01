//Exception example- ArrayIndexOutOfBond

import java.lang.*;

class Myexception2
{
	public static void main(String [] args)
	{
		int arr[]=new int[5];
		
		try
		{
		System.out.println("TRY");
		arr[5]=10;
		
		System.out.println("array : "+arr[6]);
		}
		catch(ArrayIndexOutOfBoundException e)
		{
		
		}
		catch(Exception e)
		{
			System.out.println("CATCH");
			System.out.println(e);
		}
		finally
		{
			System.out.println("FINALLY");
			System.out.println("Exception handled");
		}
	}
}