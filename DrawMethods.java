//Program of Applet

import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.io.*;

public class DrawMethods extends Applet
{
	String msg;
	/*public void init()
	{
	    msg="Applets Graphics class & draw methods";
	}*/
	
	public void paint(Graphics g)
	{
		g.drawLine(10,10,50,50);
		g.drawOval(20,20,45,60);
		g.drawRect(30,30,70,70);
		g.drawArc(25,25,30,40,90,145);
	//	g.drawPolygon(35,35,65,65);
		g.drawString("msg",45,30);
	}
}

/* 
<applet code="DrawMethods" width="300" height="300"> 
</applet> 
*/  