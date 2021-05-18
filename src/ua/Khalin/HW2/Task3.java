package ua.Khalin.HW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int inputNumber = console.nextInt();
        evenNumber(inputNumber);
    }

    public static void evenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("Введенное число - чётное");
        } else {
            System.out.println("Введенное число - нечётное");
        }
    }
}