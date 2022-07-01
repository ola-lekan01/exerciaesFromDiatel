package chapter5;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.printf("%s%5s%n" , "number" , "Sum" );
        int total = 0;
        int i;

        for(i = 1 ; i < 100 ; i++){
            total = i + total;

        }
        System.out.printf("%d%10d%n" , i , total);

    }
}
