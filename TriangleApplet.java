//Write a java program to display triangle filled with red color
//Polygon program

import java.applet.*;
import java.awt.*;

/*<applet code="TriangleApplet" width="300" height="300"> </applet> */

public class TriangleApplet extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={20,50,100};
		int y[]={50,150,200};
		int n=x.length;
		
		g.setColor(Color.red);
		g.fillPolygon(x,y,n);
		//g.drawPolygon(x,y,n);
	}
}


