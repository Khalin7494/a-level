package ua.Khalin.HW3;

/*Программа "Угадай число"
Задача
Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.

Решение
Описание переменных: 

a – число, "загаданное" компьютером;
b – очередное число, вводимое пользователем.

Алгоритм решения задачи: 

Программа генерирует псевдослучайное число, которое записывается в переменную a.

Пока число a не совпадет с числом b, пользователю будет предлагаться ввести очередное число. При этом, если b > a, то на экран будет выдаваться сообщение "Много". Иначе будет проверяться условие b < a. 
При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Загадай число от 1 до 10");
        int a = (int) (Math.random() * 10) + 1;
        oracul(a);
    }

    public static void oracul(int a) {
        Scanner console = new Scanner(System.in);
        a = (int) (Math.random() * 10) + 1;
        int b = console.nextInt();
        if (b > a) {
            System.out.println("Много. " + "Введите очередное число: ");
        } else if (b < a) {
            System.out.println("Мало. " + "Введите очередное число: ");
        } else System.out.println("Угадал");
        boolean answer = false;
        while (!answer) {
            b = console.nextInt();
            if (b > a) {
                System.out.println("Много. " + "Введите очередное число: ");
            } else if (b < a) {
                System.out.println("Мало. " + "Введите очередное число: ");
            } else System.out.println("Угадал");
            answer = b == a;
        }
    }
}
