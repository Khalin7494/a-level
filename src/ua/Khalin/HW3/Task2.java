package ua.Khalin.HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(pallindrome(input));
    }

    public static boolean pallindrome(String str) {
        str = str.replaceAll("\\W", "");
        StringBuilder text = new StringBuilder(str);
        text.reverse();
        String answer = text.toString();
        // или так -  str = str.replaceAll("\\W","");
        // String answer = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(answer);
    }
}
