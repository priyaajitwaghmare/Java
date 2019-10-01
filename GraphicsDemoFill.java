import java.applet.Applet;  
import java.awt.*;  
  
/* <applet code="GraphicsDemoFill" width="300" height="300"> </applet> */
  
public class GraphicsDemoFill extends Applet
{  
	public void paint(Graphics g)
	{   
		//9.setColor(Color c): is used to set the graphics current color to the specified color.
		g.setColor(Color.pink);  
		
		//10.fillRect(int x, int y, int width, int height):
		//is used to fill rectangle with the default color and specified width and height.
		g.fillRect(170,100,50,50);  
		
		//11.fillOval(int x, int y, int width, int height): 
		//is used to fill oval with the default color and specified width and height.
		g.fillOval(170,200,80,50);  
		
		//12.fillArc(int x, int y, int width, int height, int startAngle, int arcAngle):
        //is used to fill a circular or elliptical arc.
		g.fillArc(270,150,180,180,0,180);  
		
		//13.fillPolygon(int x[],int y[],int length)
		//used to fillcolor in polygon, polygon may have any numbber number of sides,
		//x[] indicates array of x-coordinate and y[] indicates array of y-coordinate
		int x[]={20,50,100};
		int y[]={50,150,200};
		int n=x.length;
		g.fillPolygon(x,y,n);
		
		//14.fillRoundRect(int x,int y,int width,int height,int WidthOfCornerAngle, int HeightOfCornerAngle) : 
		//is used to fill color in round rectangle
		g.fillRoundRect(170,100,50,50);  
	}
}	