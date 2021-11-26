package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] mult = new int[size][size];
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                mult[i][j] = (i + 1) * (j + 1);
            }
        }
        return mult;
    }
}
