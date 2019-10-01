import java.io.*;
import java.lang.*;

class MultipleInheritance
{
	//instance variables declare
	String name;
	int roll;
	double m1,m2;
	
	//parameterized constructor
	MultipleInheritance(String name,int roll,double m1,double m2)
	{
		this.name=name;
		this.roll=roll;
		this.m1=m1;
		this.m2=m2;
	}
	
	public static void main(String []args)
    {
	//create object of child class i.e. student
	student s=new student("abc",1,50,60);
	
	s.calculate_per();
	
	s.display();
	
   }
	
}

//interface-it is an class which contains abstract (incomplete)methods
interface exam
{
	public void calculate_per();
	
	public void display();
}

//child class-inheritance concept
//extends+implements->multiple inheritance
class student extends MultipleInheritance implements exam
{	
	double result;
	student(String name,int roll,double m1,double m2)
	{	
	//cal to parent class constructor
		super(name,roll,m1,m2);
	}
	
	public void calculate_per()
	{
		 result=((m1+m2)*100)/200;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Percentage is : "+result);
	}
}
/* output :
g:\Java>javac MultipleInheritance.java

g:\Java>java MultipleInheritance
Name : abc
Percentage is : 55.0
*/


