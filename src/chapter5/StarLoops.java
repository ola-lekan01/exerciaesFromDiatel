// TODO: 7/4/2022  Modify C And D.
package chapter5;

public class StarLoops {

    public static void main(String[] args) {
        int baselength = 5;


        for(int columns = 1; columns <= baselength ; columns++) {
            for (int rows = 1; rows <= columns; rows++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.printf("%s%n%n" , "B. This prints Inverted Right Angle Triangle");
        for (int columns = baselength ; columns >= 1 ; columns--){
            for(int rows = 1 ; rows <= columns ; rows++){
                System.out.print(" * ");
            }
            System.out.println( );
        }

        System.out.println(" ");

        System.out.printf( "%s%n%n" , "Inverted Right Angle Triangle with the Hypotenuse to rhe left");
        for(int columns = 1 ; columns <= baselength ; columns++){

            for(int rows = 1 ; rows <= columns ; rows++){
                System.out.print(' ');

                for(rows = columns; rows <= baselength ; rows++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
