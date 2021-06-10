package ua.Khalin.HW12;

/*Создать текстовый файл в корне диска D с именем test.txt, напечатать внутри
несколько строк текста. Скопировать код и убедиться, что он правильно работает.
Спровоцировать возникновение FileNotFoundEcxeption
2. Удалить t hrows I OException и заменить его на try/catch/finally. Закоммитить.
3. Отрефакторить код с использование try-with-recourses. Еще раз закоммитить.*/

import java.io.*;

public class Demo {
    public static String read(String path) {
//открываем файл по пути
        StringBuilder stringBuilder = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            stringBuilder = new StringBuilder();
            String currentString;
//построчно считываем файл
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
//закрываем файл
        } catch (IOException e) {
            e.printStackTrace();
        }
//возвращаем вычитанный текст в строке
        assert stringBuilder != null;
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(read("D:\\test.txt"));
    }
}
