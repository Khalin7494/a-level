package ua.Khalin.Modules.Modul1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите значение буквы поля расположения фигуры \"конь\" от \"a\" до \"h\" ");
        getLetter(console);

        System.out.println("Введите значение цифры поля расположения фигуры \"конь\" от 1 до 8 ");
        getNumber(console);

        System.out.println("Введите значение буквы поля для желаемого хода фигуры \"конь\" от \"a\" до \"h\" ");
        getLetter(console);

        System.out.println("Введите значение цифры поля для желаемого хода фигуры \"конь\" от 1 до 8 ");
        getNumber(console);

        System.out.println("Ход конем на заданную точку - " + rightMove(getLetter(console), getNumber(console), getLetter(console), getNumber(console)));
        //rightMove(getLetter(console),getNumber(console),getLetter(console),getNumber(console));

    }

    public static int getNumber(Scanner console) {
        int y = console.nextInt();
        if (y < 0 || y > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return y;
    }

    public static int getLetter(Scanner console) {
        //String letterStart = console.nextLine();
        int x = letterConvert(console.nextLine());
        if (x < 0 || x > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return x;
    }


    static int letterConvert(String firstLetter) {
        switch (firstLetter) {
            case "a": {
                return 1;
            }
            case "b": {
                return 2;
            }
            case "c": {
                return 3;
            }
            case "d": {
                return 4;
            }
            case "e": {
                return 5;
            }
            case "f": {
                return 6;
            }
            case "g": {
                return 7;
            }
            case "h": {
                return 8;
            }
            default:
                return 0;
        }
    }


    public static boolean rightMove(int x1, int y1, int x2, int y2) {
        if ((x2 == x1 + 2) && (y2 == y1 + 1)) {
            return true;
        } else if ((x2 == x1 + 2) && (y2 == y1 - 1)) {
            return true;
        } else if ((x2 == x1 + 1) && (y2 == y1 + 2)) {
            return true;
        } else if ((x2 == x1 + 1) && (y2 == y1 - 2)) {
            return true;
        } else if ((x2 == x1 - 2) && (y2 == y1 + 1)) {
            return true;
        } else if ((x2 == x1 - 2) && (y2 == y1 - 1)) {
            return true;
        } else if ((x2 == x1 - 1) && (y2 == y1 + 2)) {
            return true;
        } else if ((x2 == x1 - 1) && (y2 == y1 - 2)) {
            return true;
        }
        else return false;
    }
}
