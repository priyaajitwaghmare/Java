import java.applet.Applet;  
import java.awt.*;  
  
public class GraphicsDemoDraw extends Applet
{  
	public void paint(Graphics g)
	{   
		//1.drawString(String str, int x, int y) :used to draw a text string
		g.drawString("Welcome",50, 50);  
		
		//2.drawLine(int x1, int y1, int x2, int y2): 
		//is used to draw line between the points(x1, y1) and (x2, y2).
		g.drawLine(20,30,20,300);  
		
		//3.drawRect(int x, int y, int width, int height): 
		//draws a rectangle with the points(x,y) & specified width and height.
		g.drawRect(70,100,30,30);  
		
		//4.
		g.drawArc(90,150,30,30,30,270);  
		
		//5.
		g.drawOval(70,200,30,30);  
		
		//6.
		g.drawPolygon();
		
		//7.
		g.drawRoundRect();
  
	}  
}  

/* to run applet program,use following commands:
g:\Java>javac GraphicsDemo.java

g:\Java>appletviewer GraphicsDemo.java
*/
/* <applet code="GraphicsDemo" width="300" height="300"> </applet> */