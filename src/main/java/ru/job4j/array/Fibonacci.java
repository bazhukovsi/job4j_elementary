package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        int first = 0;
        int second = 0;
        for (int i = 2; i < data.length; i++) {
            if (data[i] != data[i-1] + data[i-2]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkArray(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89}));
    }
}
