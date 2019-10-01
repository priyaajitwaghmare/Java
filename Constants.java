class Constants
{
	public static void main(String []args)
	{
		// 1.Decimal integer constant-Staring with nothing i.e.any digit - consist of set of digits from 0 to 9 
		int a=965;
		
		//2.Octal integer - with prefix 0 - consists of set of digit from 0 to 7 
		int b=022;
		
		//3.Hexadecimal integer - starting with 0x - any digits
		int c=0x100;
		
		//4.Real constant- consist of fraction or floating point value
		double d=5.66;
		
		//5.Character constant - single alphabet character with  single quotes
		char ch="6";
		
		//6.String constant - array of character with double quotes
		String name="Java";
		
		System.out.println("Decimal integer constant : a :"+a);
		
	    System.out.println("Octal integer constant : b :"+b);
		
		System.out.println("Hexadecimal integer constant : c :"+c);
		
	    System.out.println("Real integer constant : d :"+d);
		
		System.out.println("Character constant : ch :"+ch);
		
		System.out.println("String constant : name :"+name);
		
		
	}
}

/*
OUTPUT :

g:\Java> javac Constants.java

g:\Java> java Constants

Decimal integer constant : a :965
Octal integer constant : b :18
Hexadecimal integer constant : c :256
Real integer constant : d :5.66
Character constant : ch :F
String constant : name :Java

*/