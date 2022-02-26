package lesson3;

import java.sql.SQLOutput;

public class Name4 {

    public static void main(String[] args) {
        // создание массива на основании предыдущего со сдигом на ячейку

        int[] numbers = {2, 46, 7, 9, 12, 9};

        int[] result = new int[numbers.length];

//        result[0] = numbers[5];
//        result[1] = numbers[0];
//        result[2] = numbers[1];
//        result[3] = numbers[2];
//        result[4] = numbers[3];
//        result[5] = numbers[4];

        for (int i = 0; i < numbers.length; i++) {
            if(i == 0) {
                result[i] = numbers[numbers.length - 1];
            } else {
                result[i] = numbers[i-1];
            }
            System.out.println(result[i]);
        }
    }
}
