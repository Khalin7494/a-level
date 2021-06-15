package ua.Khalin.HW3;

//Удалить из строки пробелы и определить, является ли она перевертышем
//Ввести строковую переменную. Удалить из нее все пробелы. 
//После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(pallindrome(input));
    }

    public static boolean pallindrome(String str) {
        str = str.replaceAll("\\W", "");
        StringBuilder text = new StringBuilder(str);
        text.reverse();
        String answer = text.toString();
        // или так -  str = str.replaceAll("\\W","");
        // String answer = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(answer);
    }
}
