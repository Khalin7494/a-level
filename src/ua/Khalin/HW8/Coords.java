package ua.Khalin.HW8;

public class Coords {
    String text;
    int a;


    Coords(String text, int a) {
        this.a = a;
        this.text = text;
    }

    Coords() { }

    public static String[][] chessBoard() {
        String[][] chessBoard = new String[8][8];
        String letters = "abcdefgh";
        String numbers = "87654321";
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = letters.charAt(j) + Character.toString(numbers.charAt(i));
                //System.out.print(" " + chessBoard[i][j] + " ");
            }
            //System.out.println();
        }
        return chessBoard;
    }


    public static int letterConvert2(String setLetter) {
        switch (setLetter) {
            case "a": {
                return 0;
            }
            case "b": {
                return 1;
            }
            case "c": {
                return 2;
            }
            case "d": {
                return 3;
            }
            case "e": {
                return 4;
            }
            case "f": {
                return 5;
            }
            case "g": {
                return 6;
            }
            case "h": {
                return 7;
            }
            default:
                return 0;
        }
    }

    public static void checkIndex(String[][] array, int x, int y) {
        if (x < 0 || x > 8 || y < 0 || y > 8) {
            System.out.println("Вы ввели некорректное значение!!!");
        }
        int row = 0;
        int column = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == x) {
                    if (j == y) {
                        row = 8 - y;
                        column = x;
                        break;
                    }
                }
            }
        }
        System.out.println("Индекс заданных координат - " + "[" + row + "]" + "[" + column + "]");
    }
}
