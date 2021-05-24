package ua.Khalin.Modules.Modul1;

import java.util.Scanner;

public class Task2_Better {
    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите значение буквы поля расположения фигуры \"конь\" от \"a\" до \"h\" и значение цифры поля расположения фигуры от 1 до 8 ");
        Knight_Better knightStart = new Knight_Better(console.nextLine(), console.nextInt());

        String position = knightStart.letter;
        int x1 = Knight_Better.getNumber(Knight_Better.letterConvert(position));
        int y1 = Knight_Better.getNumber(knightStart.a);

        System.out.println("Стартовая позиция фигуры \"конь\" - " + position + y1);

        Scanner console2 = new Scanner(System.in);

        System.out.println("Введите значение буквы поля для желаемого хода фигуры \"конь\" от \"a\" до \"h\" и значение цифры поля для желаемого хода фигуры от 1 до 8 ");
        Knight_Better knightMove = new Knight_Better(console2.nextLine(), console2.nextInt());

        String position2 = knightMove.letter;
        int x2 = Knight_Better.getNumber(Knight_Better.letterConvert(position2));
        int y2 = Knight_Better.getNumber(knightMove.a);

        System.out.println("Координаты желаемого хода фигуры \"конь\" - " + position2 + y2);

        boolean move = Knight_Better.rightMove(x1, y1, x2, y2);
        if (move) {
            System.out.println("Ход возможен.");
        } else {
            System.out.println("Ход невозможен.");
        }
    }

}
