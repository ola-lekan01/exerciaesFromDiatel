package com.Chapter7.Turtle;

public class Pen {
    private PenPosition position;

    public Pen(){
        position = PenPosition.UP;
    }

    public PenPosition getPosition() {
        return position;
    }

    public void setPosition(PenPosition position) {
        this.position = position;
    }
}