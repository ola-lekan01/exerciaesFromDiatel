package chapter5;

public class LoopsPattern {
    public static void main(String[] args) {
        int base = 5;
        for(int rows = 1 ; rows <= base ; rows++) {
            for(int columns = 1; columns <= rows ; columns++){
                System.out.printf(" %d " , rows);
            }
            System.out.println();
        }
        System.out.printf("%n%n%s" , " Right Angle Triangle with Incrementing Number");
        for(int rows = 1 ; rows <= base ; rows++ ){
            for(int columns = 1 ; columns <= rows ; columns++){
                System.out.printf(" %d " , columns);
            }
            System.out.println();


        }
    }
}
