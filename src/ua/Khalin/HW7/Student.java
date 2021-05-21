package ua.Khalin.HW7;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        int amount = 0;
        if (averageMark == 5) {
            amount = 100;
        } else {
            amount = 80;
        }
        return amount;
    }
}
