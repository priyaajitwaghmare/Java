import java.applet.Applet;  
import java.awt.*;  
  
/* <applet code="GraphicsDemoDraw" width="300" height="300"> </applet> */
  
public class GraphicsDemoDraw extends Applet
{  
	public void paint(Graphics g)
	{   
		//1.setFont(Font font): is used to set the graphics font to text
		g.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,20));
			
		//2.drawString(String str, int x, int y) :used to draw a text string
		g.drawString("Welcome",40, 40);  
		
		//3.drawLine(int x1, int y1, int x2, int y2): 
		//is used to draw line between the points(x1, y1) and (x2, y2).
		g.drawLine(20,30,20,250);  
		
		//4.drawRect(int x, int y, int width, int height): 
		//draws a rectangle with the points(x,y) & specified width and height.
		g.drawRect(70,100,30,30);  
		
		//5.drawArc(int x, int y, int width, int height, int startAngle, int arcAngle):
		//is used draw a circular or elliptical arc.
		g.drawArc(90,150,30,30,30,270);  
		
		//6.drawOval(int x, int y, int width, int height): 
		//is used to draw oval with the specified width and height.
		g.drawOval(70,200,50,50);  
		
		//7. drawPolygon(int x[],int y[],int length) : is used to draw a hollow polygon
		int x[]={90,150,180,200,300};
		int y[]={70,60,100,180,150};
		int length=x.length;
		g.drawPolygon(x,y,length);
		
		//8.drawRoundRect(int x,int y,int width,int height,int WidthOfCornerAngle, int HeightOfCornerAngle) : 
		//is used to draw a hollow rectangle with rounded corners
		g.drawRoundRect(150,250,30,30,10,10);
  
	}  
}  

/* to run applet program,use following commands:
g:\Java>javac GraphicsDemo.java

g:\Java>appletviewer GraphicsDemo.java
*/
