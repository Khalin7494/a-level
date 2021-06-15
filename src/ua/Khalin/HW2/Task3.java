package ua.Khalin.HW2;

//Создать метод и вызвать его в main(): метод будет сообщать, является ли целое число, переданное в метод, чётным или нет. 


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
