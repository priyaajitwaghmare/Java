//write a simple program which display message "welcome to java"
import java.applet.*;
import java.awt.*; 
 
 /*<applet code="WelcomeApplet" width="500" height="300"> </applet>*/

public class WelcomeApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,50));
		g.drawString("Welcome to java",50,50);
	}
}   