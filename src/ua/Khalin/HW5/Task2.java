package ua.Khalin.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        fillArray(array);
        System.out.println("Изначальный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив упорядочен по невозрастанию: ");
        System.out.println(checkRise(array));
    }

    public static boolean checkRise(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[i - 1])
                return false;
        }
        return true;
    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
    }
}
