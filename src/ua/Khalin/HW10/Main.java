package ua.Khalin.HW10;

public class Main {
    public static void main(String[] args) {

        Report report = Report.builder().header("Header").body("Body").build();
        report.toBuilder().footer("Footer").build();

        System.out.print("");

        Pow power = (number, pow) -> {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }
            return result;
        };
        System.out.println(power.pow(2, 8));  // Проверка работы
    }

    @FunctionalInterface
    interface Pow {
        int pow(int number, int pow);
    }
}
