//File Program - Write a program that will count number of characters in a file

import java.io.*;
class CountChar
{
	public static void main(String [] args)
	{
		try{
			//open file in read mode
			FileReader fr=new FileReader("a.txt");
			int ch;
			int count=0;
			//loop works until all character in file are read,-1 indicates end of file
			while((ch=fr.read())!=-1)
			{
				count++;
			}
			fr.close();
			System.out.println("Number of characters in file are :"+count);
		}
		catch(Exception e)
		{
		}
	}
}
/* output :
g:\Java>javac CountChar.java
g:\Java>java CountChar
Number of characters in file are :31
*/ 