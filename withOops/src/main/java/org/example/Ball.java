package org.example;

import processing.core.PApplet;

public class Ball {

    private float x_cord;
    private float y_cord;
    private float frame;

    public Ball(float x_cord, float y_cord, float diameter, float frameRate) {

        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.diameter = diameter;
        this.frameRate = frameRate;
    }

    public void drawCircle(PApplet applet) {

        applet.ellipse(x_cord, y_cord, diameter, diameter);
        x_cord = x_cord + frameRate;
    }
}
