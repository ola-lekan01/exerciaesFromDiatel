package Chapter6.Factors;

public class PrimeNumbers {
    //Don't Do This
    public static boolean isPrime(int number) {
        int factors = 0;
        for (int count = 1; count <= number; count++) {
            if(number % count == 0) {
                factors++;
                if(factors > 2) {
                    return false;
                }
            }
        }
        return true;
    }
    //Do This
    public static boolean isPrimed(int number){
        int [] factors = {2,3,4,5,6,7,9};
        if(number == factors[0] || number == factors[1] ||
                number == factors[3] || number == factors[5]) return true;
        for (int factor : factors){
            if(number % factor == 0) return false;
        }
        return true;
    }
}