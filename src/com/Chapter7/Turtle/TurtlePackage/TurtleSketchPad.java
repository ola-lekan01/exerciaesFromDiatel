package com.Chapter7.Turtle.TurtlePackage;

public class TurtleSketchPad {
    private int noOfColumns;
    private int noOfRows;
    private int [][] floor;

    public TurtleSketchPad(int noOfColumns, int noOfRows) {
        floor = new int[noOfRows][noOfColumns];
    }

    public int [][] getFloor(){
        return floor;
    }

    public void display(int [][] floor){
        for(int i = 0; i < floor.length; i++){
            for(int j = 0; j < floor[i].length; j++){
                if(floor[i][j] == 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
