package ua.Khalin.HW10;

// Создать абстрактный базовый класс для Report, перенести в него поля header и footer. 
//Починить билдер (чтобы он использовал header и footer из класса родителя, не забываем про инкапсуляцию).


public class ReportAbstract {
    protected String header;
    protected String footer;

    ReportAbstract(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }

}
