package HW4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
        fillArray(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Количество простых чисел в массиве - " + countPrime(randomArray));

    }

    public static void fillArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(100);
        }
    }

    public static int countPrime(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (prime(array[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}



