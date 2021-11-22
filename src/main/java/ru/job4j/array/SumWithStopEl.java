package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int index = 0;
        int summa = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el){
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            summa += data[i];
        }
        if (summa % 2 == 0){
            return summa;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }
}
