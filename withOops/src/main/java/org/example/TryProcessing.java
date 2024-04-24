package org.example;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final float DIAMETER = 12f;

    Ball[] balls = new Ball[4];

    public static void main(String[] args) {

        PApplet.main("org.example.TryProcessing",args);
    }

    @Override
    public void settings() {

        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {

        float verticalSpace = float(HEIGHT / 5);

        for(int ballNum = 0; ballNum < 4; ballNum++) {
            
            int frameSpeed = ballNum+1;
            float yCord = verticalSpace * frameSpeed;
            
            balls[ballNum] = new Ball(0, yCord, DIAMETER, frameSpeed);
        }
    }

    @Override
    public void draw() {

        for(Ball four_balls: balls)
        {
            four_balls.drawCircle(this);
        }

    }

}
