//program to take input from command line and check for even or odd number.

import java.lang.*;

class even_odd
{
    
	public static void main(String [] args)
	{
	// taking input from command line
	 int a=Integer.parseInt(args[0]);
	 
	 // even odd logic- if number is divisible by 2 then even otherwise odd
	 if(a%2==0)
	 {
		System.out.println("Number is even : "+a);
	 }
	 else
	 {
		System.out.println("Number is odd : "+a);
	 }
	}
}
/* output :
g:\Java> javac even_odd.java

g:\Java> java even_odd 56
Number is even : 56


*/