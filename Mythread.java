//write a program to create two threads, one to print numbers in orignal order and other in reverse order from 1 to 10.
import java.lang.Thread.*;

class Mythread extends Thread //implements Runnable
{

	public void run()
	{
	
		for(int i=1;i<=10;i++)
		{
		System.out.println("print 1 to 10 : "+i);
		}	
	}
	
public static void main(String [] args)
{
	Mythread mt=new Mythread();
	Thread t1=new Thread(mt);
	
	Mythread1 mt1=new Mythread1();
	Thread t2=new Thread(mt1);

	t1.start();
	t2.start();
}

}

class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
		System.out.println("reverse 10 to 1 : "+i);
		}
	}
}
