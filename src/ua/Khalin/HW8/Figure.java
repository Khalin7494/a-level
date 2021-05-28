package ua.Khalin.HW8;

import ua.Khalin.Modules.Modul1.Knight_Better;

import java.util.Scanner;

public class Figure {
    Coords coord;

    public Figure() {
    }

    public Figure(Coords coord) {
        this.coord = coord;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner console1 = new Scanner(System.in);
        Coords coords = new Coords();
        System.out.println("Введите букву координат шахматной фигуры");
        coords.text = console1.nextLine();
        System.out.println("Введите цифру координат шахматной фигуры");
        coords.a = console1.nextInt();
        Coords.checkIndex(Coords.chessBoard(), Coords.letterConvert2(coords.text), coords.a);

    }
}
