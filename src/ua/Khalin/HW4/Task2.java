package ua.Khalin.HW4;

//Заполнить одномерный массив случайными целочисленными значениями. Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
            for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < randomArray.length; i++) {
            boolean isPrime = true;
            int check = 0;
            if (randomArray[i] == 1)
                isPrime = false;
            else
                for (int j = 2; j <= randomArray[i] / 2; j++) {
                    if (randomArray[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            if (isPrime)

                check += check + randomArray[i];
            if (check != 0)

                System.out.println("Простое число - " + check);
        }
    }
}
