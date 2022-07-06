// TODO: 7/4/2022 modify Triangle Star Pattern and Complete the Number Pattern

                /*
             *
            ***
           *****
          *******
         *********
                 */
package chapter5;

public class TriangleStarLooping {
    public static void main(String[] args) {

        for(int i = 1 ;  i <= 6 ; i++){

            for(int j = 1 ; j <= (6 - 1) ; j++){
                System.out.print(' ');
            }
            for(int k = 0 ; k < (i + (i - 1)); k++){
                System.out.print("*");
            }
            for(int l = 1 ; l <= (6 - i) ; l++){
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
