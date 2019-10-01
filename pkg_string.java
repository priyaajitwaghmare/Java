//Strings methods :
package demo;
import java.lang.*;

class pkg_string
{
	
	public static void main(String []args)
	{
	String s1="Hello world";
	String s2="World";
	
	//1.CharAt() - finds character at specified location or index 
	char ch = (s1.charAt(2));
	System.out.println(ch);
	
	System.out.println(s2.charAt(1));
	
	//2.substring : substring(starting index,end index)-finds substring of starting index and ending-1
	String sub=s1.substring(0,3);
	System.out.println("Substring is "+sub);
	
	
	//3.indexOf- find character of particular index
	int i=s1.indexOf('o');
    System.out.println("index is "+i);
	
	//4.replace-replace string with another
	String re=s2.replace("World","hello");
	System.out.println("Replace : "+re);
	
	//5.length
	int l=s1.length();
	System.out.println("length:"+l);
	
	}
}
/*
output:
//to compile package program we use -d or -classpath command,after that . indicates current directory 
//or if u want to save .class  file in other directory then specify directory name instead of .
g:\Java>javac -d . pkg_string.java

//to run package programs fully qualified name is used i.e. packagename.classname
g:\Java>java demo.pkg_string

l
o
Substring is Hel
index is 4
Replace : hello
length:11
*/

