package com.Chapter7.Turtle;

public class Turtle {
    private Pen turtlePen;
    private int xCordinate;
    private int yCordinate;

    public Turtle(){
        turtlePen = new Pen();
    }
    public Turtle(Pen pen){
        this.turtlePen = pen;
    }

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }
    public void moveForward(int numberOfSteps){
        xCordinate = numberOfSteps - 1;

    }
}
