package ua.Khalin.HW7;

/*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
    а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
    б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
    в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.*/


public class Task2 {
    public static void main(String[] args) {

        Student sam = new Aspirant("Sam", "Johnson", "C44", 5, "Atomic Submarines");

        Student[] people = new Student[2];
        people[0] = new Student("Vasiliy", "Golopupko", "AP-52", 4.7);
        people[1] = new Aspirant("Oleg", "Chakhliy", "M57", 4.9, "Garden bugs");

        Task2 pay = new Task2();
        for (Student student : people) {
            System.out.println("Salary is - " + student.getScholarship());

        }

    }
}
