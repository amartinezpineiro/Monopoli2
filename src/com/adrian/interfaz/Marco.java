package com.adrian.interfaz;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {
    public Marco() {
        setBounds(750, 300, 1920, 950);

        Panel milamina = new Panel();

        JLabel et=new JLabel();
        et.setBounds(935,750,30,30);
        et.setBackground(new Color(255, 0, 0));
        et.setOpaque(true);

        JLabel et2=new JLabel();
        et2.setBounds(1045,750,30,30);
        et2.setBackground(new Color(0, 36, 168));
        et2.setOpaque(true);

        JLabel et3=new JLabel();
        et3.setBounds(935,800,30,30);
        et3.setBackground(new Color(255, 153, 0));
        et3.setOpaque(true);

        JLabel et4=new JLabel();
        et4.setBounds(1045,800,30,30);
        et4.setBackground(new Color(8, 107, 10));
        et4.setOpaque(true);

        add(et);
        add(et2);
        add(et3);
        add(et4);
        add(milamina);
        this.setLocationRelativeTo(this);

    }
}
