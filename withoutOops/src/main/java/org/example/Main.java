package org.example;
import processing.core.PApplet;

public class Main extends PApplet {
    private float x = 0;

    public static void main(String[] args) {

        PApplet.main("org.example.Main",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(700, 500 );
    }

    @Override
    public void draw() {

        ellipse(x,100,12,12);
        ellipse(x*2,200,12,12);
        ellipse(x*3,300,12,12);
        ellipse(x*4,400,12,12);

        x++;
    }
}