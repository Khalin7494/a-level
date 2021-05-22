package ua.Khalin.Modules.Modul1;

import java.util.Arrays;

public class Modul1 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Изначальный рандомный массив - " + Arrays.toString(randomArray));

        System.out.println("Количество уникальных элементов массива - " + countNumbersUniq(randomArray));
    }

    public static int countNumbersUniq(int[] array) {
        int count = 0;
        int temp = 1;
        for (int i = 0; i < array.length - 1; i++) {
            temp++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return temp - count;
    }
}
