//Write a program to draw a bar chart for plotting students passing percentage in last 5 years

import java.applet.*;
import java.awt.*;

/*<Applet code="StudentBarChartApplet" height="300" width="300">
<PARAM NAME="m1" value="15">
<PARAM NAME="m2" value="25">
<PARAM NAME="m3" value="35">
<PARAM NAME="m4" value="45">
<PARAM NAME="m5" value="55">

<PARAM NAME="y1" value="2001">
<PARAM NAME="y2" value="2002">
<PARAM NAME="y3" value="2003">
<PARAM NAME="y4" value="2004">
<PARAM NAME="y5" value="2005">

</Applet>*/


public class StudentBarChartApplet extends Applet
{
	public void paint(Graphics g)
	{
		int marks[]=new int[5];
		String years[]=new String[5];
		
	  	marks[0]=Integer.parseInt(getParameter("m1"));
		marks[1]=Integer.parseInt(getParameter("m2"));
		marks[2]=Integer.parseInt(getParameter("m3"));
		marks[3]=Integer.parseInt(getParameter("m4"));
		marks[4]=Integer.parseInt(getParameter("m5"));
		
		years[0]=getParameter("y1");
		years[1]=getParameter("y2");
		years[2]=getParameter("y3");
		years[3]=getParameter("y4");
		years[4]=getParameter("y5");
		
		
		for(int i=0;i<5;i++)
		{
			g.drawString(years[i],20,i*50+30);
			
			g.drawRect(50,i*50+10,marks[i],30);
		}
	}

}