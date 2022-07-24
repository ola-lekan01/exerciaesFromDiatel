package chapter5;

/***
 * @@author Lekan
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        for(int count = 1 ; count <= 10 ; count++) {
            for (int counter = 1; counter <= 10 ; counter++){
                int result = count * counter;
                System.out.printf("%d * %d = %d%n" , count , counter, result);
            }
            System.out.println();
        }

    }
}
