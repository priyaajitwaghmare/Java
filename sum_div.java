//Write a program to find number and sum of all integers greater than 100 and less than 200 that are divisible by 7

import java.lang.*;

public class sum_div
{
	public static void main(String []args)
	{
	
		// variable declaration and value assigning
		int sum=0,count=0;
		
		//for loop - start from 101 as number should be greater than 100 and ends at 200 as number should be less than 200
		for(int i=101;i<200;i++)
		{
			//to check whether number is divisible by 7 or not
			if(i%7==0)
			{
				//adding elements and storing result back to sum
				sum=sum+i; //sum=+i;
				
				//counting number of elements which are divisible by 7
				count++;
			}
		}
		
		System.out.println("Number of elemeents : "+count);
		System.out.println("Sum of elemeents : "+sum);
	}

}


/* OUTPUT :

g:\Java> set path="C:\Program Files\Java\jdk1.8.0_144\bin";

g:\Java> set classpath="C:\Program Files\Java\jre1.8.0_144\lib\rt.jar";

g:\Java> javac sum_div.java

g:\Java>java sum_div

Number of elemeents : 14
Sum of elemeents : 2107

*/