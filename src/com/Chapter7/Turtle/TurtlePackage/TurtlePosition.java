package com.Chapter7.Turtle.TurtlePackage;

public class TurtlePosition {
    private int row;
    private int column;
    public TurtlePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object obj){
        if(!obj.getClass().equals(this.getClass())) return false;
        TurtlePosition comparedPosition = (TurtlePosition) obj;
        boolean rowsAreEqual = comparedPosition.row == this.row;
        boolean columnsAreEqual = comparedPosition.column == this.column;
        return rowsAreEqual && columnsAreEqual;
    }
}
