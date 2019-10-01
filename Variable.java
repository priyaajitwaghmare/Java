//import java.lang.*;
import java.util.*;
import java.util.Scanner.*;

class Variable
{
	public static void main(String []args)
	{
	
		//1. by using assignment statement- giving direct vlaue
		int a=5; 
		
		//2.by reading from the keyboard - user input - dynamic initialization
		// import Scanner class and next() function
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		//int b=sc.nextInt();
		float b=sc.nextFloat();
		System.out.println("Assignment statement : a:"+a);
		
		System.out.println("User input : b:"+b);
		
		
	}
}

/* 
OUTPUT :
g:\Java> javac Variable.java

g:\Java> java Variable

Enter value:
89

Assignment statement :a:5
User input :b:89
*/