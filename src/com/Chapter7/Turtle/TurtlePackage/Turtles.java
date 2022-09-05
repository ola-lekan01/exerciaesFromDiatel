package com.Chapter7.Turtle.TurtlePackage;

import static com.Chapter7.Turtle.TurtlePackage.Direction.*;
import com.Chapter7.Turtle.SketchPad;

public class Turtles {
    private Direction currentDirection = EAST;
    private TurtlePosition currentPosition = new TurtlePosition(0,0);

    private boolean isPenUp;
    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == EAST) face(SOUTH);
        else if(currentDirection == SOUTH) face(WEST);
        else if(currentDirection == WEST) face(NORTH);
        else if(currentDirection == NORTH) face(EAST);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if(currentDirection == EAST) face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face(EAST);
    }

    public TurtlePosition getCurrentPosition() {
        return currentPosition;
    }

    private void move(int numberOfSteps) {
        int steps = numberOfSteps - 1;
        if(currentDirection == EAST){
            currentPosition.setColumn(currentPosition.getColumn() + steps);
        }
        else if(currentDirection == SOUTH){
            currentPosition.setRow(currentPosition.getRow() + steps);
        }
        else if(currentDirection == WEST){
            currentPosition.setColumn(currentPosition.getColumn() - steps);
        }
        else if(currentDirection == NORTH){
            currentPosition.setRow(currentPosition.getRow() - steps);
        }
    }

    public void move(int numberOfSteps, TurtleSketchPad turtleSketchPad) {
        int steps = numberOfSteps - 1;
        if(!isPenUp) writeOn(turtleSketchPad, steps);
        move(numberOfSteps);
    }

    private void writeOn(TurtleSketchPad turtleSketchPad, int numberOfSteps) {
        int currentRow = getCurrentPosition().getRow();
        int currentColumn = getCurrentPosition().getColumn();

        var floor = turtleSketchPad.getFloor();
        if(currentDirection == EAST) {
            for (int i = 0; i <= numberOfSteps; i++) {
                floor[currentRow][currentColumn++] = 1;
            }
        }
        else if(currentDirection == SOUTH){
            for (int i = 0; i <= numberOfSteps; i++) {
                for (int j = 0; j <= numberOfSteps; j++) {
                    if (i == 0) {
                        floor[currentRow++][currentColumn] = 1;
                    }
                }
                System.out.println();
            }
        }
        else if(currentDirection == WEST){
            for (int i = 0; i < numberOfSteps; i++) {
                floor[currentRow][--currentColumn] = 1;
            }
        }
        else if(currentDirection == NORTH){
            for (int i = 0; i <= numberOfSteps; i++) {
                for (int j = 0; j <= numberOfSteps; j++) {
                    if (i == 0) {
                        floor[currentRow--][currentColumn] = 1;
                    }
                }
                System.out.println();
            }
        }
    }
}
