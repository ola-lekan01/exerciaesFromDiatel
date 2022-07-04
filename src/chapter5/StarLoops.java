package chapter5;

public class StarLoops {

    public static void main(String[] args) {
        int baselength = 5;

        for(int rows = 1; rows <= baselength ; ++rows) {
            for (int columns = 1; columns <= rows; ++columns) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.printf("%s%n%n" , "B. This prints Inverted Right Angle Triangle");
        for(int rows = baselength; rows >= 1 ; --rows) {
            for (int columns = 1; columns <= rows; ++columns) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.printf("%s%n%n" , "C. This prints Inverted Right Angle Triangle");
        for(int rows = baselength ; rows >= 1 ; --rows){
            for(int columns = baselength ; columns >= 1 ; --columns){
                System.out.print("");
            }
            for(int i = 1 ; i <= rows ; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.printf("%s%n%n" , " D. This prints Inverted Right Angle Triangle");

        for(int rows = 0 ; rows < baselength ; rows++){
            for(int columns = 2 * (baselength - 1) ; columns >= 0 ; columns--){
                System.out.print("");
            }
            for(int columns = 0 ; columns <= rows ; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
