/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Ricardo Herrera
 */
public class ImagenesFondo implements Border {
    public BufferedImage img;
    public ImagenesFondo(){
        try {
            URL imagenPath = new URL(getClass().getResource("../Imagenes/fondo2.jpg").toString());
            img = ImageIO.read(imagenPath);
        } catch (Exception ex) {
            Logger.getLogger(ImagenesFondo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int heigth) {
       
        g.drawImage(img, (x + (width - img.getWidth())/2 ), (y + (heigth - img.getHeight())/2), null);   
    }

    @Override
    public Insets getBorderInsets(Component cmpnt) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
    
}
