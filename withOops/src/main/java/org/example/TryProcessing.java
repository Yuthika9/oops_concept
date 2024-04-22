package org.example;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final float WIDTH = 700;
    public static final float HEIGHT = 500;
    public static final float DIAMETER = 12;

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

        float y = HEIGHT / 5;

        for(int ballNum = 0; ballNum < 4; ballNum++) {
            
            int iterator = ballNum+1;
            float yCord = y * iterator;
            
            balls[ballNum] = new Ball(iterator, yCord, DIAMETER, iterator);
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
