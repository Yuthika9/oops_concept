package org.example;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 12;
    
    private int x;

    public static void main(String[] args) {

        PApplet.main("org.example.TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        int y = HEIGHT / 5;

        for(int ballnumber = 1; ballnumber<5; ballnumber++)
            drawCircle(x*ballnumber,y*ballnumber);

        x++;
    }

    private void drawCircle(float x, float y) {
        ellipse(x,y,DIAMETER,DIAMETER);
    }
}
