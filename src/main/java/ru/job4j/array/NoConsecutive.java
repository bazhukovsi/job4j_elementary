package ru.job4j.array;

public class NoConsecutive {
    public static int find(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if ((data[i] - data[i-1]) != 1){
                return data[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 3, 3, 4, 5}));
    }
}
