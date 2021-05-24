/*
package ua.Khalin.Modules.Modul1;

import java.util.Scanner;

public class Knight {
    String firstLetter;
    String moveLetter;
    int x1;
    int firstPoint;
    int movePoint;

    */
/*Knight(String firstLetter, String moveLetter, int firstPoint, int movePoint) {
        this.firstLetter = firstLetter;
        this.moveLetter = moveLetter;
        this.firstPoint = firstPoint;
        this.movePoint = movePoint;
    }*//*


    Knight(int x1, int firstPoint) {
        this.x1 = getLetter(firstLetter);
        this.firstPoint = getNumber(firstPoint);
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

    public static int getLetter(String letter) {
        int x = letterConvert(letter);
        if (x < 0 || x > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return x;
    }
    public static int getNumber(int y) {
        if (y < 0 || y > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return y;
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
*/
