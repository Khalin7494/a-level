package ua.Khalin.HW7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,2.0,1.0);
        Vector vector2 = new Vector(2.0,1.0,2.0);

        System.out.println(vector1.vectorPlus(vector2));
        System.out.println(vector1.vectorMinus(vector2));
        System.out.println(Arrays.toString(Vector.arrayOfVectors(5)));
        System.out.println(vector1.cosVectors(vector2));
        System.out.println(vector1.vectorLength());

    }
}
