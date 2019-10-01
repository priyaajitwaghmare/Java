// Define a class Rectangle calculate area of rectanle
//parametrized constructor program and default constructor

import java.lang.*;

class Rectangle
{	
  int l,b,area;
  // default constructor- which has same name as class name and no returntype and parameter
  Rectangle()
  {
	l=2;
	b=3;
  }
  //parameterized constructor- same name as class name and having parameter list and no return type
  Rectangle(int l,int b)
  {
	this.l=l;
	this.b=b;
  }

  // Area method to calculate area of rectangle
   int Area()
   {
	area=l*b;
	return area;
   }

   void display()
   {
	System.out.println("area:"+area);
   }

   public static void main(String[]args)
	{
	// create object of class-constructor cals automatically when object gets created and call methods
	Rectangle r=new Rectangle();
	//cal to area method
	int a=r.Area();
	//cal to display method
	r.display();
   //create object to automatically cal parameterized constructor
   Rectangle r1=new Rectangle(5,10);
   r1.Area();
    r1.display();
}
}

/*output :
g:\Java>javac Rectangle.java
g:\Java>java Rectangle
area:6
area:50
*/
