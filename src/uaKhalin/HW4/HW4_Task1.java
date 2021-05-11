package uaKhalin.HW4;

public class HW4_Task1 {
    public static void main(String[] args) {
        int[] randomArray = new int[400];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
        }
        double count = 0.0;
        double multiplication = 1.0;
        for (int j : randomArray) {
            count += j;
            multiplication *= j;
        }
        double average = count / randomArray.length;
        double geometric = Math.pow(multiplication, 1.0 / randomArray.length);
        System.out.println("Среднее арифметическое число массива = " + average);
        System.out.println("Среднее геометрическое число массива = " + geometric);
    }
}
