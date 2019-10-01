//Write an applet program that accept two input,strings using <Param> tag and concatenate the strings and display it in status window.

import java.applet.*;
import java.awt.*;

/*<applet code="ConcatApplet" width=300 height=300>
<PARAM NAME="name1" VALUE="Pallavi">
<PARAM NAME="name2" VALUE="Mhamane">
</applet> */

public class ConcatApplet extends Applet
{
	public void paint(Graphics g)
	{
		String str=getParameter("name1");
		String str1=getParameter("name2");
		
		g.drawString(str.concat(str1),40,40);
		
	}
}
