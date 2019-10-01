//define Employee class with data members empid,name,salary. accept data of 5 objects and display it.

import java.lang.*;
import java.util.*;
import java.util.Scanner.*;

class Employee
{
	int empid;
	String name;
	float salary;
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String [] args)
	{
		// Employee e=new Employee();
		//int arr[5]; or int arr[]=new int[5]
		
		Employee e[]=new Employee[5];
		
		for(int i=0;i<5;i++)
		{
			e[i]=new Employee();
		}
		
		for(int i=0;i<5;i++)
		{
			e[i].getdata();
			
		}
		for(int i=0;i<5;i++)
		{
		e[i].display();
		}
	}
	
	
	void getdata()
	{
		System.out.println("Enter Id : ");
		empid=sc.nextInt();
		
		System.out.println("Enter Name : ");
		name=sc.next();
		
		System.out.println("Enter Salary : ");
		salary=sc.nextFloat();
		
	}
	
	void display()
	{
		System.out.println("Id = "+empid);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
}

/* output :

g:\Java>java Employee
Enter Id :
1
Enter Name :
apl
Enter Salary :
100
Enter Id :
2
Enter Name :
pll
Enter Salary :
200
Enter Id :
3
Enter Name :
sss
Enter Salary :
500
Enter Id :
4
Enter Name :
rtg
Enter Salary :
542
Enter Id :
5
Enter Name :
fff
Enter Salary :
203
Id = 1
Name = apl
Salary = 100.0
Id = 2
Name = pll
Salary = 200.0
Id = 3
Name = sss
Salary = 500.0
Id = 4
Name = rtg
Salary = 542.0
Id = 5
Name = fff
Salary = 203.0

*/