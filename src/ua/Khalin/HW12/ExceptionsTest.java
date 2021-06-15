package ua.Khalin.HW12;

/*Написать свой собственный код (в отдельном файле), который будет приводить к
возникновению следующих исключений:
● ClassCastException
● NullPointerException
● NumberFormatException (подсказка – преобразование строки в число)
● ArrayIndexOutOfBoundsException
Подумать и написать в комментарии, какие из этих исключений нужно обрабатывать в
try/catch блоке.*/

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
