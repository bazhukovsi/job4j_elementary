package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int index = 0;
        int value = 0;
        int count = 0;
        int indexOut = 0;
        int[] ints = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            ints[i] = left[i];
            index++;
        }
        for (int i = index, j = 0; j < right.length; i++, j++) {
            ints[i] = right[j];
        }
        for (int i = 0; i < ints.length; i++) {
            value = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] == value) {
                    ints[j] = 0;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                count++;
            }
        }
        int[] out = new int[count];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                out[indexOut] = ints[i];
                indexOut++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(or(new int[]{1, 2, 3}, new int[]{1, 2})));
    }
}
