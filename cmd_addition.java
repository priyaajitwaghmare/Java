// Write a program to accept a number as command line arguments and print addition of it
import java.lang.*;

class cmd_addition
{
	public static void main(String []args)
    {    
	  // taking input as command line argument
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
		int result=0;
		result=a+b;
		System.out.println("Addition is : "+result);
  }
}

/* output :
g:\Java> javac cmd_addition.java

g:\Java> java cmd_addition 10 20
Addition is : 30
*/