package cucumber.framework.utils;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ComparingImages {
   public static void main(String[] args) throws IOException {
      BufferedImage img1 = ImageIO.read(new File("C:\\Users\\Nexsoft\\Pictures\\Testing\\Upload Foto Faskes Awal.jpg"));
      BufferedImage img2 = ImageIO.read(new File("C:\\Users\\Nexsoft\\Pictures\\Testing\\Upload Foto Faskes Awal (2).jpg"));
      int w1 = img1.getWidth();
      int w2 = img2.getWidth();
      int h1 = img1.getHeight();
      int h2 = img2.getHeight();
      
         long diff = 0;
         for (int j = 0; j < h1; j++) {
            for (int i = 0; i < w1; i++) {
               //Getting the RGB values of a pixel
               int pixel1 = img1.getRGB(i, j);
               Color color1 = new Color(pixel1, true);
               int r1 = color1.getRed();
               int g1 = color1.getGreen();
               int b1 = color1.getBlue();
               int pixel2 = img2.getRGB(i, j);
               Color color2 = new Color(pixel2, true);
               int r2 = color2.getRed();
               int g2 = color2.getGreen();
               int b2= color2.getBlue();
               //sum of differences of RGB values of the two images
               long data = Math.abs(r1-r2)+Math.abs(g1-g2)+ Math.abs(b1-b2);
               diff = diff+data;
            }
         }
         double avg = diff/(w1*h1*3);
         double percentage = (avg/255)*100;
         System.out.println("Difference: "+percentage);
	}
//	Compare image 1
//	Both images should have same dimensions
//	Difference: 14.901960784313726
//
//	Compare image 2
//	Both images should have same dimensions
//	Difference: 14.901960784313726
}
