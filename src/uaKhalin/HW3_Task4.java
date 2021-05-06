package uaKhalin;

import java.util.Scanner;

public class HW3_Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Загадай число от 1 до 3");
        int a = (int) (Math.random() * 3)+1;
        int b = console.nextInt();
        if (b > a) {
            System.out.println("Много. " + "Введите очередное число: ");
        } else if (b < a) {
            System.out.println("Мало. " + "Введите очередное число: ");
        } else System.out.println("Угадал");
    }
}
