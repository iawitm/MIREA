package gui;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 2
*/

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel {

    Image image;

   public Panel(String path){
       try {
           image = ImageIO.read(new File(path));
       }
       catch(IOException e){
           System.out.println(e);
           System.exit(0);
       }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 50, 50, null);
    }
}
