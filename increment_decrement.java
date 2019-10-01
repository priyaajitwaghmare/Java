//program for increment and decrement operator- ++,--
class increment_decrement
{ 

	public static void main(String [] args)
	{
		int x=5;
		
		//1.pre-increment
		++x;
		System.out.println("Pre-increment :"+x);
		
		//2.post-increment
		x++;
		System.out.println("Post-increment :"+x);
		
		//3.pre-decrement
		--x;
		System.out.println("Pre-decrement :"+x);
		
		
		//4.post-decrement
		x--;
		System.out.println("Post-decrement :"+x);
		
		
	}
	
}
/*
OUTPUT :
g:\Java>javac increment_decrement.java

g:\Java>java increment_decrement
Pre-increment :6
Post-increment :7
Pre-decrement :6
Post-decrement :5
*/
