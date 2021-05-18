package ua.Khalin.HW5;

// Заполнение двумерного массива значениями индекса,
//при этом каждая вторая строка - отрицательными значениями.
// *Передать массив в метод, заполнить данный массив

public class Task1 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[4][4];
        fillArray(doubleArray);
    }

    public static void fillArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                int index = i + j;
                if (i % 2 != 0) {
                    index = -index;
                }
                doubleArray[i][j] = index;
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
