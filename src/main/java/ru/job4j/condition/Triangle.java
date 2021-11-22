package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }

    public static void main(String[] args) {
        boolean triangle;
        triangle = Triangle.exist(100.0, 10.0, 10.0);
        System.out.println(triangle);
    }
}
