package com.Chapter7;

import com.Chapter7.Turtle.PenPosition;
import com.Chapter7.Turtle.Turtle;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    void setUp(){
        turtle = new Turtle();
    }

    @Test
    void toCheckThatTurtleExist(){
        assertNotNull(turtle);
        assertNotNull(turtle.getTurtlePen());
    }

    @Test
    void toCheckThatTurtleHasAPen(){
        assertNotNull(turtle);
        assertNotNull(turtle.getTurtlePen());
        assertNotNull(turtle.getTurtlePen().getPosition());
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPosition());

    }

    @Test
    void toCheckTurtleCordinates(){
        assertNotNull(turtle);
        assertEquals(0,turtle.getxCordinate());
        assertEquals(0,turtle.getyCordinate());
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPosition());

    }

    @Test void toCheckThatTurtleCanMove(){
        toCheckThatTurtleHasAPen();
        turtle.moveForward(9);
        assertEquals(8,turtle.getxCordinate());
        assertEquals(0,turtle.getyCordinate());

    }
}
