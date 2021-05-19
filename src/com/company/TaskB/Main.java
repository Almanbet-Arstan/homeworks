package com.company.TaskB;

import javax.swing.*;
import java.awt.*;

class Main extends JFrame {

    public Main() {

        JFrame frame = new JFrame("Equation");
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel(){

            public void paint(Graphics g){
                super.paint(g);
                Parabola.grid(g);
                Parabola.Graphic1(g);
                Cubic_parabola.Graphic1(g);
            }
        };

        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setSize(420,490);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}