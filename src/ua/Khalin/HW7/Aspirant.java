package ua.Khalin.HW7;

public class Aspirant extends Student {
    protected String dissertation;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String dissertation) {
        super(firstName, lastName, group, averageMark);
        this.dissertation = dissertation;
    }


    @Override
    public int getScholarship() {
        int amount = 0;
        if (averageMark == 5) {
            amount = 200;
        } else {
            amount = 180;
        }
        return amount;
    }
}
