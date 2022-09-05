package com.Chapter7.turtle;

import com.Chapter7.Turtle.TurtlePackage.*;
import com.Chapter7.Turtle.TurtlePackage.Turtles;
import org.junit.jupiter.api.*;
import static com.Chapter7.Turtle.TurtlePackage.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTests {
    private Turtles ijapa;
    private TurtleSketchPad turtleSketchPad;

    @BeforeEach
    public void setThisUP(){
        ijapa = new Turtles();
        turtleSketchPad = new TurtleSketchPad(5,5);
    }

    @Test
    public void thereIsATurtle(){
        Turtles ijapa = new Turtles();
        assertNotNull(ijapa);
    }

    @Test
    public void testTurtleCanMovePenUp(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMovePenDown(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingSouth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingWest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveRight_whileFacingNorth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingNorth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingWest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingSouth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtleCanMoveWithOutWritingFacingAllRightPositions(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,2), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(2,2), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(3, turtleSketchPad);
        assertEquals(WEST, ijapa.getCurrentDirection());

        assertEquals(new TurtlePosition(2,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
    }

    @Test void testThatTurtleCanMoveWithOutWritingFacingAllRightAndLeftPosition(){
        // From East to a new Position
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
        assertEquals(EAST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,2), ijapa.getCurrentPosition());

        // From East to a new Position
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(2,2), ijapa.getCurrentPosition());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(2,4), ijapa.getCurrentPosition());

        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.move(3, turtleSketchPad);
        assertEquals(WEST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(2,2), ijapa.getCurrentPosition());

        ijapa.turnLeft();
        ijapa.move(3, turtleSketchPad);
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(4,2), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanWriteWhenPenIsDown(){
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,2), ijapa.getCurrentPosition());
        int [][] floor = turtleSketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
    }

    @Test
    public void testDisplay(){
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,2), ijapa.getCurrentPosition());
        int [][] floor = turtleSketchPad.getFloor();
        turtleSketchPad.display(floor);

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(2,2), ijapa.getCurrentPosition());
        turtleSketchPad.display(floor);

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(2,0), ijapa.getCurrentPosition());
        turtleSketchPad.display(floor);

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.move(3, turtleSketchPad);
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        turtleSketchPad.display(floor);
    }
}
