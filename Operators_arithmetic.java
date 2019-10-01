//program of arithmetic operators

class Operators_arithmetic
{
	
	public static void main(String [] args)
	{
	
	int a=6,b=3;

	//1.Addition
	int c=a+b;
	System.out.println("Addition of a & b is (a+b) :"+c);
	
	//2.substraction
	System.out.println("Substraction of a & b is (a-b) :"+(a-b));
	
	//3.Multiplication
	System.out.println("Multiplication of a & b is (a*b) :"+(a*b));
	
	//4.Division
	System.out.println("Divsion of a & b is (a/b) :"+(a/b));
	
	//5.Modulo Division (remainder)
	int md=a%b;
	System.out.println("Modulo Division of a & b is (a%b) :"+md);
	}
}

/*output :

g:\Java> javac Operators_arithmetic.java

g:\Java> java Operators_arithmetic
Addition of a & b is (a+b) :9
Substraction of a & b is (a-b) :3
Multiplication of a & b is (a*b) :18
Divsion of a & b is (a/b) :2
Modulo Division of a & b is (a%b) :0

*/