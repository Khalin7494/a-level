package ua.Khalin.HW7;

public class Task2 {
    public static void main(String[] args) {

        Student sam = new Aspirant("Sam", "Johnson", "C44", 5, "Atomic Submarines");

        Student[] people = new Student[2];
        people[0] = new Student("Vasiliy", "Golopupko", "AP-52", 4.7);
        people[1] = new Aspirant("Oleg", "Chakhliy", "M57", 4.9, "Garden bugs");

        Task2 pay = new Task2();
        for (Student student : people) {
            System.out.println("Salary is - " + student.getScholarship());
            //Student.getScholarship(pay);   ??????
        }

    }
}
