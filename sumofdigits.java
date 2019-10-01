//Write a program to compute sum of digits of a given integer numbers

import java.lang.*;
import java.util.Scanner;

class sumofdigits
{
	public static void main(String [] args)
	{
		int sum=0,remainder;
		
		//taking input from user
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 
		//direct input
		 // int num=56;
		
		while(num>0)
		{
			// by % operator we get remainder i.e. last digit of a number
			remainder=num%10;
			
			//we add one by one digit, startig from end
			sum=sum+remainder;
			
			// by / operator we get quotient i.e. remaining digits
			num=num/10;
		}//end of while loop
		
		//printing the result
		System.out.println("sum of digits of a given number is : "+sum);
		
	}
}

/* OUTPUT :
g:\Java> javac sumofdigits.java

g:\Java>java sumofdigits

Enter the number
63
sum of digits of a given number is : 9
*/