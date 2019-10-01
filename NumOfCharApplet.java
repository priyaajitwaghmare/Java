//Design an applet which accepts username as a parameter for html page and
// display number of character from it

import java.applet.*;
import java.awt.*;

/*<Applet code="NumOfCharApplet" height="300" width="300">
<PARAM NAME="username" value="abclldfghjk">
</Applet>*/

public class NumOfCharApplet extends Applet
{
public void paint(Graphics g)
{

String xyz=getParameter("username");
String l=Integer.toString(xyz.length());

g.drawString(l,40,50);
 


}


}

