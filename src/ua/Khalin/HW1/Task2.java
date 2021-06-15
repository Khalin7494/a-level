package ua.Khalin.HW1;

//Создать консольное приложение, которое выводит в консоль Ваши имя, фамилию и текущую дату/время. 


import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        String name = "Евгений ";
        String surname = "Халин, ";

        System.out.println(name + surname + new Date());
    }
}

