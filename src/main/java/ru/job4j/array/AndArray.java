package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    count++;
                }
            }
        }
        int[] ints = new int[count];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    ints[index] = left[i];
                    index++;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(and(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5})));
    }
}
