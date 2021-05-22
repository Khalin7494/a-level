package ua.Khalin.Modules.Modul1;

public class Modul1 {
    public static void main(String[] args) {
        int[] array = new int[]{45, 4, 77, 89, 89};

        System.out.println("Количество уникальных элементов массива - " + countNumbersUniq(array));
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
