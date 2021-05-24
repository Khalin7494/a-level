package ua.Khalin.Modules.Modul1;

public class Knight_Better {
    String letter;
    int a;

    Knight_Better(String letter, int a) {
        this.letter = letter;
        this.a = a;
    }

    public static int letterConvert(String setLetter) {
        switch (setLetter) {
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

    public static int getNumber(int a) {
        if (a < 0 || a > 8) {
            System.out.println("Вы ввели некорректное значение");
        }
        return a;
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
