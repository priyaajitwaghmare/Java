//program for bitwise operator & | >> <

class bitwise_operator
{  
	public static void main(String args[])
	{  
	
		//1.Right shift - 10/2^2=10/4=2    ->  number1/2^number2
		System.out.println("Right Shift : "+(-10>>2));  
		
		//2.Left shift - 10*2^3=10*8=80    ->   number1*2^number2
		System.out.println("Left shift : "+(10<<3));  
		
		//3.Right shift with zero fill - works same as right shift, only for negative number it works differnetly
		System.out.println("Right shift with zero fill : "+ (-10>>>2)); 
		
		//4.bitwise and &
		System.out.println("bitwise and : "+(10 & 2));
		
		//5.bitwise or |
		System.out.println("bitwise or : "+(10 | 2));
		
		//6.bitwise ex-or ^
		System.out.println("bitwise ex-or : "+(10 ^ 2));
	}
}  

/*
OUTPUT :
g:\Java> javac bitwise_operator.java

g:\Java> java bitwise_operator

Right Shift : 2
Left shift : 80
Right shift with zero fill : 2
bitwise and : 2
bitwise or : 10
bitwise ex-or : 8
*/