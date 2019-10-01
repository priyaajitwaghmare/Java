//program to check whether given number is prime number or not.take command line argument

class cmd_prime
{  
  public static void main(String args[])
  {  
	int i,m,flag=0;

	//take input from command line 
	int n=Integer.parseInt(args[0]);  
	
	//m - denotes number of times for loop should excute- normally half of given number
	m=n/2;   
	
	//prime number is divisible by 1 and the number itself,so for loop starts from 2 and ends at m(half of n)
	for(i=2;i<=m;i++)
	{    
		if(n%i==0)
		{    
			flag=1;
			
		}
	}
	if(flag==1)
	System.out.println("Number is not prime : "+n); 
	else
  System.out.println("Number is prime : "+n);    
	}  
}  