//program of relational operator- <, > ,<= ,>= ,== ,!=

class relational_operator
{
	public static void main(String []args)
	{
		int a=10,b=20;
		
		//1.less than operator : <
		boolean c= a<b;
		System.out.println("a<b :"+c);
		
		//2.greater than operator : >
		System.out.println("a>b :"+(a>b));
		
		//3.less than equal to operator : <=
		System.out.println("a<=b :"+(a<=b));
		
		//4.greater than equal to operator : >=
		System.out.println("a>=b :"+(a>=b));
		
		//5.equal to operator : ==
		System.out.println("a==b :"+(a==b));
		
		//6.not equal to operator : !=
		System.out.println("a!=b :"+(a!=b));
		
	}
}

/* 
output:
g:\Java> javac relational_operator.java

g:\Java>java relational_operator
a<b :true
a>b :false
a<=b :true
a>=b :false
a==b :false
a!=b :true
*/