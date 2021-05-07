package uaKhalin.HW2;

import java.util.Scanner;

public class HW2_Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNumber = console.nextDouble();
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();
        minimum(firstNumber, secondNumber, thirdNumber);
    }
    public static void minimum (double a,double b, double c) {
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        c = c < 0 ? -c : c;
            double min = a < b ? a : b;
            min = c < min ? c : min;
            System.out.println(min);
    }
}
