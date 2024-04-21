package org.example;

import processing.core.PApplet;

public class Ball {

    private int x_cord;
    private int y_cord;
    private int x_diameter;
    private int y_diameter;
    private int frame;

    public Ball(int x_cord, int y_cord, int x_diameter, int y_diameter, int frame) {

        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.x_diameter = x_diameter;
        this.y_diameter = y_diameter;
        this.frame = frame;
    }

    public void drawCircle(PApplet applet) {

        applet.ellipse(x_cord, y_cord, x_diameter, y_diameter);
        x_cord = x_cord + frame;
    }
}
