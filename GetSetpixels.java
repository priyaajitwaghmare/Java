import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GetSetpixels
{
	public static void main(String args[])throws IOException
	{
	BufferedImage bckimg = ImageIO.read(new File("scene.png"));
	int width = bckimg.getWidth();
	int height = bckimg.getHeight();
	System.out.println(width+"\n"+height);
	 int p = bckimg.getRGB(0,0);
	 System.out.println(p);
	 
	 //get alpha
    int a = (p>>24) & 0xff;
 System.out.println(a);
    //get red
    int r = (p>>16) & 0xff;
 System.out.println(r);
    //get green
    int g = (p>>8) & 0xff;
 System.out.println(g);
    //get blue
    int b = p & 0xff;
	 System.out.println(b);
	}
}