package ua.Khalin.HW5;

//Удаление из массива k-го элемента со сдвигом всех расположенных
// справа от него элементов на одну позицию влево.

//*Необходимо создать новый массив, в котором удаляется элемент и вернуть его из метода.
// Изначальный массив не должен измениться

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int deleteIndex = 4;
        fillArray(numbers);
        System.out.println("Изначальный массив - " + Arrays.toString(numbers));
        System.out.println("Изменённый массив - " + Arrays.toString(changeArray(numbers, deleteIndex)));

    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
        }
    }

    private static int[] changeArray(int[] numbers, int a) {
        int[] firstCopiedArray = Arrays.copyOfRange(numbers, 0, a);
        int[] secondCopiedArray = Arrays.copyOfRange(numbers, a + 1, numbers.length);
        int[] resultArray = new int[firstCopiedArray.length + secondCopiedArray.length];
        for (int i = 0; i < firstCopiedArray.length; i++) {
            resultArray[i] = firstCopiedArray[i];
            for (int j = 0; j < secondCopiedArray.length; j++) {
                resultArray[j + firstCopiedArray.length] = secondCopiedArray[j];
            }
        }
        return resultArray;
    }
}
