package Chapter7.SevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegment {
    private static String [] [] segment = new String[5][4];

    public static void setA(){
        segment[0][0] = "#";
        segment[0][1] = "#";
        segment[0][2] = "#";
        segment[0][3] = "#";
    }

    public static void setB(){
        segment[0][3] = "#";
        segment[1][3] = "#";
        segment[2][3] = "#";
    }

    public static void setC(){
        segment[2][3] = "#";
        segment[3][3] = "#";
        segment[4][3] = "#";
    }

    public static void setD(){
        segment[4][0] = "#";
        segment[4][1] = "#";
        segment[4][2] = "#";
        segment[4][3] = "#";
    }

    public static void setE(){
        segment[2][0] = "#";
        segment[3][0] = "#";
        segment[4][0] = "#";
    }
    public static void setF(){
        segment[0][0] = "#";
        segment[1][0] = "#";
        segment[2][0] = "#";
    }

    public static void setG(){
        segment[2][0] = "#";
        segment[2][1] = "#";
        segment[2][2] = "#";
        segment[2][3] = "#";
    }

    public static void setScreen(String input){
        for(int rows = 0; rows < segment.length; rows++) {
            Arrays.fill(segment[rows], " ");
        }
       if(input.charAt(7) == '1'){
           if (input.charAt(0) == '1') setA();
           if (input.charAt(1) == '1') setB();
           if (input.charAt(2) == '1') setC();
           if (input.charAt(3) == '1') setD();
           if (input.charAt(4) == '1') setE();
           if (input.charAt(5) == '1') setF();
           if (input.charAt(6) == '1') setG();
       }
    }
    public static void display(){
        for(int rows = 0; rows < segment.length; rows++) {
            for(int columns = 0; columns < segment[rows].length; columns++) {
                System.out.print(segment[rows][columns] + " ");
            }
            System.out.println();
        }
    }

}
