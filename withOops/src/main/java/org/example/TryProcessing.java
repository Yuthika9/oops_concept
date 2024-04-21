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

        drawCircle(x,y);
        drawCircle(x*2, y*2);
        drawCircle(x*3,y*3);
        drawCircle(x*4,y*4);

        x++;
    }

    private void drawCircle(float x, float y) {
        ellipse(x,y,DIAMETER,DIAMETER);
    }
}