package ua.Khalin.HW4;

//Заполнить одномерный массив случайными целочисленными значениями. Все четные значения заменить на нули. Размер массива - 2000 элементов.


import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] randomArray = new int[2000];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0)
                randomArray[i] = 0;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
