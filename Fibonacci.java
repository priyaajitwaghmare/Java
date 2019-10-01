// Write a program to generate Fibonacci series 1 1 2 3 5 8 13 21 34 55 89.

import java.lang.*;

class Fibonacci
{
	public static void main(String []args)
	{
		int a=1,b=1,c=0;
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		
		while(c<100)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}

/*OUTPUT

g:\Java> javac Fibonacci.java

g:\Java>java Fibonacci
1
1
2
3
5
8
13
21
34
55
89
*/