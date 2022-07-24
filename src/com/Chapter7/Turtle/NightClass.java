package com.Chapter7.Turtle;

public class NightClass {
    public static int incrementNumber(int number){
        return number + 1;
    }
    public static boolean equalsNumber(int number, int number2){
        boolean equals = false;
        if(number == number2 ){
            equals = true;
        }
        return equals;
    }
    public static int calculateDifferences(int number1 , int number2){
        return number2 - number1;
    }
    public static int convertToSeconds(int seconds) {
        return seconds * 60;
    }
    public static int addNumbers(int number1, int number2){
        return number1 + number2;
    }

    public char getString(String name){
        return name.charAt(1);
    }
    public char getChar(char alphabet) {
        char alpha = ' ';
        char [] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','i','j','k','l'};
        for(int i = 0; i < alphabets.length ; i++){
            if(alphabet  == alphabets[i]){
                alpha = alphabets[i + 1];
            }
        }
        return alpha;
    }
}