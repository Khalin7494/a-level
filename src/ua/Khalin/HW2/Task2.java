package ua.Khalin.HW2;

//Создать метод и вызвать его в main():
//Заданы плоские декартовы координаты треугольника. Найти площадь треугольника.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        triangle(console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt());
    }

    public static void triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        int s = ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3)) / 2;
        if (s < 0) {
            s = Math.abs(s);
        }

        System.out.println(s);
    }
}

