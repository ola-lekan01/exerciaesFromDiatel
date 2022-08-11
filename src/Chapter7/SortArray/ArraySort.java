package Chapter7.SortArray;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void arraySort2(int [] array) {
        int tempNum;
        for(int firstNum = 0; firstNum  < array.length; firstNum++) {
            for (int secondNum = firstNum + 1; secondNum < array.length; secondNum++) {
                if (array[firstNum ] > array[secondNum]) {
                    tempNum = array[firstNum ];
                    array[firstNum ] = array[secondNum];
                    array[secondNum] = tempNum;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arraySuff(int [] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomSwap = random.nextInt(array.length);
            int temp = array[randomSwap];
            array[randomSwap] = array[i];
            array[i] = temp;

        }
            System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] sort = {44, 25, 19, 38, 23, 12, 56,};
        arraySuff(sort);
    }

}
