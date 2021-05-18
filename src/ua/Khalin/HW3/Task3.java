package ua.Khalin.HW3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Количество слов в строке: " + countWords(console.nextLine()));

    }

    public static int countWords(String text) {
        String[] words = text.split("\s+");

        int count = words.length;
        return count;

    }
}
