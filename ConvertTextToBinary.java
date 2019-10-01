import java.lang.*;
import java.util.Scanner;

public class ConvertTextToBinary
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter msg : ");
		String msg=sc.next();
		
		byte[] BytesArr=msg.getBytes();
		StringBuilder binary=new StringBuilder();
		
		for(byte b : BytesArr)
		{
			int val=b;
			for(int i=0;i<8;i++)
			{
				binary.append((val & 128)==0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println(" ' "+msg+" ' to binary : "+binary);
	}
}