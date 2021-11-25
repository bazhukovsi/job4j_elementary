package ru.job4j.array;

import java.util.Arrays;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] ints = new int[n];
        ints[0] = a;
        ints[1] = b;
        int summa = 0;
        for (int i = 2; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                summa += ints[j];
            }
            ints[i] = summa;
            summa = 0;
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(1, 2, 4)));
    }
}
