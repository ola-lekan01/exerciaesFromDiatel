package chapter5;

public class NumberPatternLoops {
    public static void main(String[] args) {
        int base = 6;
        System.out.println("Right Angle Triangle With Hypotenuse to the Left");
        for(int columns = 1 ; columns <= base ; columns++){

            int number = 1;
            for(int row = 1 ; row <= columns ; row++) {
                System.out.printf(" %d " , number);
                number++;
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.printf( "%s%n%n" , "Inverted Right Angle Triangle with the Hypotenuse to rhe left");
        for(int columns = base ; columns >= 1 ; columns--){
            int number = 1;
            for(int rows = 1 ; rows <= columns ; rows++){
                System.out.printf(" %d " , number);
                number++;
            }
            System.out.println(" ");
        }

    }
}
