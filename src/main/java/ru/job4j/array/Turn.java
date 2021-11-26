package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int count = array.length / 2;
        for (int i = 0; i < count; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
