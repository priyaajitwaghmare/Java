import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class SetPixels 
{
  public static void main(String args[])throws IOException
  {
    BufferedImage img = null;
    File f = null;

    //read image
    try
	{
      f = new File("images.jpg");
      img = ImageIO.read(f);
    }
	catch(IOException e)
	{
      System.out.println(e);
    }

    //get image width and height
    int width = img.getWidth();
    int height = img.getHeight();

    /**
     * Since, Sample.jpg is a single pixel image so, we will
     * not be using the width and height variable in this
     * project.
     */

    //get pixel value
    int p = img.getRGB(50,50);

    //get alpha
    int a = (p>>24) & 0xff;
	
	//get red
    int r = (p>>16) & 0xff;

    //get green
    int g = (p>>8) & 0xff;

    //get blue
    int b = p & 0xff;

    /**
     * to keep the project simple we will set the ARGB
     * value to 255, 100, 150 and 200 respectively.
     */
    a = 0;
    r = 250;
    g = 250;
    b = 250;

    //set the pixel value
    p = (a<<24) | (r<<16) | (g<<8) | b;
    img.setRGB(50, 50, p);

    //write image
    try
	{
      f = new File("out1.jpg");
      ImageIO.write(img, "png", f);
    }
	catch(IOException e)
	{
      System.out.println(e);
    }
  }//main() ends here
}//class ends here