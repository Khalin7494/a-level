package ua.Khalin.HW4;

import java.util.Arrays;

public class HW4_Task2 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        //int count = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < randomArray.length; i++) {
            boolean isPrime = true;
            int check = 0;
            if (randomArray[i] == 1)
                isPrime = false;
            else
                for (int j = 2; j <= randomArray[i] / 2; j++) {
                    if (randomArray[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            if (isPrime)

                check += check + randomArray[i];
            if (check != 0)

                System.out.println("Простое число - " + check);
        }
    }
}

