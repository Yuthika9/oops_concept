package org.example;

import processing.core.PApplet;

public class Ball {

    private float xCord;
    private float yCord;
    private float frameRate;

    public Ball(float xCord, float yCord, float diameter, float frameRate) {

        this.xCord = xCord;
        this.yCord = yCord;
        this.diameter = diameter;
        this.frameRate = frameRate;
    }

    public void drawCircle(PApplet applet) {

        applet.ellipse(xCord, yCord, diameter, diameter);
        xCord = xCord + frameRate;
    }
}
