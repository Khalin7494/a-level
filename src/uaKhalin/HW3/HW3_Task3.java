package uaKhalin.HW3;

import java.util.Scanner;

public class HW3_Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        System.out.println("Количество слов в строке: " + countWords(console.nextLine()));
    }

    public static int countWords(String text) {
        String[] words = text.split("[^A-Za-zА-Яа-я]+");
        return words.length;

    }
}
