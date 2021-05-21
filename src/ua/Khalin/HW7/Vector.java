package ua.Khalin.HW7;

import java.util.Random;

public class Vector {
    protected double x;
    protected double y;
    protected double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector() {
    }

    public Vector vectorPlus(Vector a) {
        Vector c = new Vector();
        c.x = x + a.x;
        c.y = y + a.y;
        c.z = z + a.z;
        return c;
    }

    public Vector vectorMinus(Vector a) {
        Vector c = new Vector();
        c.x = a.x - x;
        c.y = a.y - y;
        c.z = a.z - z;
        return c;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double vectorLength(Vector a) {
        return Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
    }

    public Vector multiplyVector(Vector a) {
        Vector c = new Vector();
        c.x = a.y * z - a.z * y;
        c.y = a.z * x - a.x * z;
        c.z = a.x * y - a.y * x;
        return c;
    }

    double scalMult(Vector a) {
        return (a.x * x + a.y * y + a.z * z);
    }

    public double cosVectors(Vector a) {
        return scalMult(a) / (vectorLength(a) * vectorLength());
    }

    public static Vector[] arrayOfVectors(int N) {
        Vector[] vector = new Vector[N];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Vector((Math.random() * 10) + 1,(Math.random() * 10) + 1,(Math.random() * 10) + 1);
        }
        return vector;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
