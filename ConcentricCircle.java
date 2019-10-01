//Write a program to display a string "concentric circles" using font "Arial" size as 12 and style as bold+ italic 
//and display three concentric circles with different colors on the applet.

import java.lang.*;
import java.awt.*;
import java.applet.Applet;

/* <applet code="ConcentricCircle" width="300" height="300"> </applet> */

public class ConcentricCircle extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,12));
		g.drawString("Concentric Circles",50,200);
		
		
		g.setColor(Color.red);
		g.fillOval(20,70,100,100);
		
		g.setColor(Color.green);
		g.fillOval(35,90,70,70);
		
		g.setColor(Color.blue);
		g.fillOval(50,100,40,40);
	
	}
}