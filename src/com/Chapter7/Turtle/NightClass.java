package com.Chapter7.Turtle;

import java.util.Objects;

public class NightClass {
    static String countryName1;
    static String continentName;

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

    public static StringBuilder convertStrings(String name) {
        StringBuilder newWord = new StringBuilder("");
        String word;
        String hyphen = "-";
        for(int index = 0; index < name.length(); index++) {
           word = String.valueOf(name.charAt(index)) + hyphen;
            newWord.append(word);
        }
        return newWord;
    }

    public static class continentException extends Exception{
        public continentException() {
            continentName = countryName1 + "is not a country Name";
        }
    }

    public static int returnDifferences(int number1) {
        int number2 = 0;
        if(number1 == 1) {
            number2 = number1--;
        }
        if(number1 == 0) {
            number2 = number1 + 1;
        }
        return number2;
    }
}