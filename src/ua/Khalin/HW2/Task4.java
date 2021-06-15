package ua.Khalin.HW2;

//Создать метод и вызвать его в main():
//Метод будет выводить на экран меньшее по модулю из  трёх переданных в метод вещественных чисел. 
//Для вычисления модуля используйте тернарную операцию.


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNumber = console.nextDouble();
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();
        minimum(firstNumber, secondNumber, thirdNumber);
    }

    public static void minimum(double a, double b, double c) {
        a = a < 0.0D ? -a : a;
        b = b < 0.0D ? -b : b;
        c = c < 0.0D ? -c : c;
        double min = a < b ? a : b;
        min = c < min ? c : min;
        System.out.println(min);
    }
}

