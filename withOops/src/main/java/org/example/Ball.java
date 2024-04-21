package org.example;

import processing.core.PApplet;

public class Ball {

    private int x_cord;
    private int y_cord;
    private int frame;

    public Ball(int x_cord, int y_cord, int diameter, int frame) {

        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.diameter = diameter;
        this.frame = frame;
    }

    public void drawCircle(PApplet applet) {

        applet.ellipse(x_cord, y_cord, diameter, diameter);
        x_cord = x_cord + frame;
    }
}
