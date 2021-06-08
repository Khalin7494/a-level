package ua.Khalin.HW12;

public class ExceptionsTest {
    public static void main(String[] args) {
        //ClassCastException
        Object x = 0;
        System.out.println((String)x);
        //NullPointerException
        int a = 5;
        Object obj = null;
        obj.equals(a);
        //NumberFormatException
        int y = Integer.parseInt("Vasya");
        System.out.println(y);
        //ArrayIndexOutOfBoundsException
        int[] array = new int[2];
        System.out.println(array[3]);
    }
}
