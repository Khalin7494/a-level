package ua.Khalin.HW7;

/*Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
а) конструктор с параметрами в виде списка координат x, y, z
б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
в) метод, вычисляющий векторное произведение с другим вектором
г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
д) методы для суммы и разности векторов
е) статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
*Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый*/


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,2.0,1.0);
        Vector vector2 = new Vector(2.0,1.0,2.0);

        System.out.println(vector1.vectorPlus(vector2));
        System.out.println(vector1.vectorMinus(vector2));
        System.out.println(Arrays.toString(Vector.arrayOfVectors(5)));
        System.out.println(vector1.cosVectors(vector2));
        System.out.println(vector1.vectorLength());

    }
}
