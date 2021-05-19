package com.company.TaskB;

import java.awt.*;

public class Cubic_parabola {
    static double a=1, b=0, c=0;

    public static void Graphic1(Graphics g) {
        g.setColor(Color.green);
        for (double x=-100;x<=100;x = x+0.1){
            double y = a * x * x * x + b + c;
            int X = (int)Math.round(200 + x*20);
            int Y = (int)Math.round(200 - y*20);
            g.fillOval(X-2,Y-2,4,4);
        }
    }
}
