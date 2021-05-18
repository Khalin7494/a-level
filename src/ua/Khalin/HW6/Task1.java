package ua.Khalin.HW6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "0675673432";
        phone1.model = "iPhone";
        phone1.weight = 165;
        System.out.println("Phone 1: " + "Model of phone - " + phone1.model + "," + " weight of phone - " + phone1.weight + "," + " number - " + phone1.number + ".");

        phone2.number = "0675674755";
        phone2.model = "Samsung";
        phone2.weight = 160;
        System.out.println("Phone 2: " + "Model of phone - " + phone2.model + "," + " weight of phone - " + phone2.weight + "," + " number - " + phone2.number + ".");

        phone3.number = "0675645635";
        phone3.model = "LG";
        phone3.weight = 174;
        System.out.println("Phone 3: " + "Model of phone - " + phone3.model + "," + " weight of phone - " + phone3.weight + "," + " number - " + phone3.number + ".");

        phone1.receiveCall("Vasya");          // Проверка работы методов на одном примере
        System.out.println(phone1.getNumber());

        Phone randomized = new Phone("0558473256", "Xiaomi", 173);
        System.out.println("Проверка работы конструктора 1:");
        System.out.println("Рандомный телефон - " + randomized.model + "," + " weight of phone - " + randomized.weight + "," + " number - " + randomized.number + ".");

        Phone randomized2 = new Phone("0775554343", "Google Phone");
        System.out.println("Проверка работы конструктора 2:");
        System.out.println("Рандомный телефон 2 - " + randomized2.model + "," + " number - " + randomized2.number + ".");

    }
}
