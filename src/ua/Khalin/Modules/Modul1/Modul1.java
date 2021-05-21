package ua.Khalin.Modules.Modul1;

public class Modul1 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 45, 44, 13, 1, 25};

        System.out.println("Количество элементов массива - " + lengthOfArray(array));
    }

    public static int lengthOfArray(int[] array) {
        return array.length;
    }
}
