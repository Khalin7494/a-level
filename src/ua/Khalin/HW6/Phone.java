package ua.Khalin.HW6;

public class Phone {
    String number;
    String model;
    int weight;


    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public String getNumber() {
        return number;
    }

}
