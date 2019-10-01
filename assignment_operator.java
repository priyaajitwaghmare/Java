//program for assignment and shorthand operators

class assignment_operator
{

	//shorthand operators
	public static void main(String []args)
	{
		int x=10,b=5;
		
		//1.
		//x=x+b;
		x+=b;
		System.out.println("Shorthand addition operator:"+x);
		
		//2.
		//x=x-10;
		x-=10;
		System.out.println("Shorthand substraction operator:"+x);
		
		//3.
		//x=x*10;
		x*=10;
		System.out.println("Shorthand multiplication operator:"+x);
		
		//4.
		//x=x/10;
		x/=10;
		System.out.println("Shorthand division operator:"+x);
		
		
		//5.
		//x=x%10;
		x%=10;
		System.out.println("Shorthand modulo division operator:"+x);
		
	}
}

/*
OUTPUT :

g:\Java> javac assignment_operator.java

g:\Java> java assignment_operator
Shorthand addition operator:20
Shorthand substraction operator:10
Shorthand multiplication operator:100
Shorthand division operator:10
Shorthand modulo division operator:0
*/