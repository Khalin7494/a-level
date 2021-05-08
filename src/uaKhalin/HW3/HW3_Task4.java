package uaKhalin.HW3;

import java.util.Objects;
import java.util.Scanner;

public class HW3_Task4 {
    public static void main(String[] args) {
        System.out.println("Загадай число от 1 до 10");
        int a = (int) (Math.random() * 10) + 1;
        oracul(a);
    }

    public static void oracul(int a) {
        Scanner console = new Scanner(System.in);
        boolean answer = false;
        while (!answer) {
            int b = console.nextInt();
            if (b > a) {
                System.out.println("Много. " + "Введите очередное число: ");
            } else if (b < a) {
                System.out.println("Мало. " + "Введите очередное число: ");
            } else System.out.println("Угадал");
            answer = b == a;
        }
    }

}
