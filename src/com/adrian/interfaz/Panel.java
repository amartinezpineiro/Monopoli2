package com.adrian.interfaz;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel {
    private Image imagen;

    public void paint(Graphics g){
        super.paintComponent(g);
        File miimagen2= new File("/home/dam1/git/Monopoli/src/com/adrian/imagenes/tablero2.png");

        try {
            imagen= ImageIO.read(miimagen2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(imagen,0,0, 1920, 950, null);
    }
}
