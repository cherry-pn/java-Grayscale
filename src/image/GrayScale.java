/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class GrayScale {

    BufferedImage image;
    int width;
    int height;

    public GrayScale() {

        try {
            File input = new File("flower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    Color e = new Color(255, 255, 0);
//               int red = (int)(c.getRed() * 0.299);
//               int green = (int)(c.getGreen() * 0.587);
//               int blue = (int)(c.getBlue() *0.114);
//               Color newColor = new Color(red+green+blue,red+green+blue,red+green+blue);
                    Color d = new Color(0, 0, 0);
//               Color jp = new Color(j);
//               Color ip = new Color(i);
                    //Color newColor = new Color();
                    if (c.getRGB() == d.getRGB() || (c.getBlue() < 50 && c.getGreen() < 50 && c.getRed() < 50)) {
                    } else {
                       image.setRGB(j, i, e.getRGB());
                    }

                    //image.setRGB(j,i,newColor.getRGB());
                }
            }

            File ouptut = new File("violet1.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
        }
    }
}
