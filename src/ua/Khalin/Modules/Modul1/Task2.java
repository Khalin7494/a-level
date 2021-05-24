package ua.Khalin.Modules.Modul1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите значение буквы поля расположения фигуры \"конь\" от \"a\" до \"h\" ");
        String position = console.nextLine();
        int x1 = getNumber(letterConvert(position));

        System.out.println("Введите значение цифры поля расположения фигуры \"конь\" от 1 до 8 ");
        int y1 = getNumber(console.nextInt());

        System.out.println("Стартовая позиция фигуры \"конь\" - " + position + y1);

        Scanner console2 = new Scanner(System.in);

        System.out.println("Введите значение буквы поля для желаемого хода фигуры \"конь\" от \"a\" до \"h\" ");
        String position2 = console2.nextLine();
        int x2 = getNumber(letterConvert(position2));

        System.out.println("Введите значение цифры поля для желаемого хода фигуры \"конь\" от 1 до 8 ");
        int y2 = getNumber(console2.nextInt());

        System.out.println("Координаты желаемого хода фигуры \"конь\" - " + position2 + y2);

        boolean move = rightMove(x1, y1, x2, y2);
        if (move) {
            System.out.println("Ход возможен.");
        } else {
            System.out.println("Ход невозможен.");
        }
    }

    public static int getNumber(int a) {
        if (a < 0 || a > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return a;
    }

    private static int letterConvert(String firstLetter) {
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
        } else return (x2 == x1 - 1) && (y2 == y1 - 2);
    }

}

