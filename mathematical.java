//program of mathematical functions - min(),max(),sqrt(),pow(),abs()
//package com.example;
import java.lang.*;

class mathematical
{
	int a=5,b=3,Result;
	float x=5.3,y=9.9,R;
	
	public static void main(String [] args)
	{
	//1. min()-used to find minimum of two numbers
	 Result=Math.min(a,b);
	 R=Math.min(x,y);
	 System.out.println("Minimum value is : "+Result);
	 System.out.println("Minimum value is : "+R);

	//2. max()-used to find maximum of two numbers
	Result =Math.max(5,10);
	System.out.println("Maximum value is : "+Result);
	
	//3. sqrt()-find square root.-compulsary double data type
	double rr=Math.sqrt(64.0);
	System.out.println("Square root is: "+rr);
	
	//4. pow()- raised to function -compulsary double data type
	rr=Math.pow(2.0,3.0)
		System.out.println("power is: "+rr);

	//5.abs()-absoultly
	Result=Math.abs(-962555);
		System.out.println("abs() is : "+Result);

		}
}
