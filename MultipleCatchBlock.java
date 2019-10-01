class MultipleCatchBlock
{  
  public static void main(String args[])
  {  
   try
   {  
		//ArrayOutOfBound Exception
		int a[]=new int[5];  
		a[4]=30/5; 
		System.out.println("Array[5] : "+a[4]);
		
		//Arithmetic Exception
		int num=10/10;
		System.out.println("Number is :"+num);
		
		//NullPointerException
		String s="kkkkk";  
		System.out.println(s.length());  
		
		//NumberFormatException 
		String str="abc";  
		int i=Integer.parseInt(str); 
			
   }  
    
   catch(ArithmeticException e)
   {
		System.out.println("Arithmetic Exception excuted");
		e.printStackTrace();
   }  
   catch(ArrayIndexOutOfBoundsException e)
   {
		System.out.println("ArrayIndexOutOfBounds Exception excuted");
		System.out.println(e);
   }  
   catch(Exception e)
   {
		System.out.println("Generic Exception excuted");
		System.out.println(e);
   } 
   finally
   {
		System.out.println("Resources closed");  
   }
   
   System.out.println("Program Ends..");
 }  
} 

/*output :
//1.Array exception :
g:\Java>javac MultipleCatchBlock.java
g:\Java>java MultipleCatchBlock
ArrayIndexOutOfBounds Exception excuted
java.lang.ArrayIndexOutOfBoundsException: 5
Resources closed
Program Ends..

//2.arithmetic :
g:\Java>javac MultipleCatchBlock.java
g:\Java>java MultipleCatchBlock
Array[5] : 6
Arithmetic Exception excuted
java.lang.ArithmeticException: / by zero
        at MultipleCatchBlock.main(MultipleCatchBlock.java:11)
Resources closed
Program Ends..

//3.Null pointer
g:\Java>javac MultipleCatchBlock.java
g:\Java>java MultipleCatchBlock
Array[5] : 6
Number is :1
Generic Exception excuted
java.lang.NullPointerException
Resources closed
Program Ends..

//4.NumberFormat
g:\Java>javac MultipleCatchBlock.java
g:\Java>java MultipleCatchBlock
Array[5] : 6
Number is :1
5
Generic Exception excuted
java.lang.NumberFormatException: For input string: "abc"
Resources closed
Program Ends..
*/