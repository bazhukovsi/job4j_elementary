package ru.job4j.array;

import java.util.Arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] outArray = new int[right.length + 1];
        int firstEl = left[0];
        int lastEl = left[left.length - 1];
        outArray[0] = firstEl;
        outArray[outArray.length - 1] = lastEl;
        for (int i = 0; i < right.length; i++) {
            if (i % 2 == 0) {
                outArray[i + 1] = right[i];
            }
        }
        for (int i = 1; i < middle.length; i++) {
            if (i % 2 != 0) {
                outArray[i + 1] = middle[i];
            }
        }

        return outArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(union(new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8, 9, 10}, new int[]{11, 12, 13, 14, 15, 16})));
    }

}
