package ua.Khalin.HW12;

import java.io.*;

public class Demo {
    public static String read(String path)  {
//открываем файл по пути
        StringBuilder stringBuilder = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            stringBuilder = new StringBuilder();
            String currentString;
//построчно считываем файл
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
//закрываем файл
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
//возвращаем вычитанный текст в строке
        assert stringBuilder != null;
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(read("D:\\test.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
