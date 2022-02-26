package testing;

import java.util.Random;


public class Test1 {
    public static int[][] result;

    public static void main(String[] args) {
        result = new int[][] { {1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 0} };

        int[] randomArray = new int[5];
        Random random = new Random();
        randomArray = random.ints(6, -10000, 10000).toArray();
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }




    }
}
