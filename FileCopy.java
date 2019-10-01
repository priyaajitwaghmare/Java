//File Program - Write a program to copy contents of one file to another file.
// also Exception example- throws keyword
import java.io.*;
public class FileCopy
{
	public static void main(string[] args) throws IOException
	{
		FileInputStream in=new FileInputStream("input.txt");
	FileOutputStream out=new FileOutputStream("output.txt");
		try{
		int ch=0;
		while(ch!=-1)
		{
			ch=in.read();
			out.write(ch);
		}
		System.out.println("File Copied..");
		}

		finally
		{
		   	in.close();
			out.close();
		}
	}
}