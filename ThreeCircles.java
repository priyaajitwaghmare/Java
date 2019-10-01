//Write a program to design an applet to display three circles filled with three different colors on screen

import java.lang.*;
import java.awt.*;
import java.applet.Applet;

/* <applet code="ThreeCircles" width="300" height="300"> </applet> */

public class ThreeCircles extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(20,70,100,100);
		
		g.setColor(Color.green);
		g.fillOval(120,70,100,100);
		
		g.setColor(Color.blue);
		g.fillOval(220,70,100,100);
	
	}
}