package ua.Khalin.HW1;

//Создать приложение, которое ожидает на ввод в консоль число и выводит его в обратном порядке, например, пользователь вводит 3356, на выходе получаем 6533.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        System.out.println(str);
    }
}
