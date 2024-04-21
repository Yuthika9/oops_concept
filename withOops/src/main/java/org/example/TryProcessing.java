package org.example;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 12;

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

        int y = HEIGHT / 5;

        for(int ball_num = 0; ball_num < 4; ball_num++) {
            int iterator = ball_num+1;
            int yCord = y * iterator;
            balls[ball_num] = new Ball(iterator, yCord,DIAMETER,DIAMETER,iterator);
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