package uaKhalin;

import java.util.Scanner;

public class HW1_Task4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        System.out.println(str);
    }
}
