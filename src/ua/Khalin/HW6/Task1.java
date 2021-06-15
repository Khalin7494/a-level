package ua.Khalin.HW6;

/*Класс Phone.
а) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Присвоить значения полям класса. 
г) Выведите на консоль значения их переменных. 
д) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
e) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. 
ж) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. 
з) Добавить конструктор без параметров.*/


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
