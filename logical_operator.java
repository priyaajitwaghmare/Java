//program for logical operator -  && , ||, !

class logical_operator
{
	public static void main(String []args)
	{
		int x=10,y=20;
		
		//1.logical AND &&
		boolean result= x>y && x<50;
		
		System.out.println("Result is :"+result);
		
		//2.logical OR ||
		 result= x>y || x>5;
		
		System.out.println("Result is :"+result);
		
		//3.logical NOT !
		 result= !(x<y);
		
		System.out.println("Result is :"+result);
		
		
	}

}
/*
OUTPUT :
g:\Java> javac logical_operator.java

g:\Java> java logical_operator
Result is :false
Result is :true
Result is :false
*/