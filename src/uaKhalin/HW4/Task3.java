package HW4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
       System.out.println(Arrays.toString(randomArray));
        System.out.println("Количество составных чисел в массиве - " + countNumbers(fillArray(randomArray)));
    }

    public static int[] fillArray(int[] randomArray) {
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    private static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (compositeNumbers(array[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean compositeNumbers(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0)
                return true;
        }
        return false;
    }
}