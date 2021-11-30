package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return  a >= b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(10, 9));
        System.out.println(Max.max(10, 9, 100, 1));
        System.out.println(Max.max(10, 9, 1, 500));
    }
}
