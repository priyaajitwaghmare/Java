//Write an applet to accept user name in the form of parameters and print 'Hello<username>'.
//Applet tag- parameter

import java.applet.*;
import java.awt.*;

/*<applet code="ParameterApplet" width=300 height=300>
<PARAM NAME="username" VALUE="abc">
</applet> */

public class ParameterApplet extends Applet
{
	public void paint(Graphics g)
	{
		String str=getParameter("username");
		g.drawString("Hello"+str,40,40);
		
	}
}
