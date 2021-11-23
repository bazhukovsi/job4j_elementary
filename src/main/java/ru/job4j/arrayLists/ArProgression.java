package ru.job4j.arrayLists;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int summa = 0;
        for (int i = 1; i < data.size() - 1; i++) {
            if ((data.get(i - 1) + data.get(i + 1)) / 2 != data.get(i)) {
                return 0;
            }
        }
        for (Integer number : data) {
          summa += number;
        }
        System.out.println(summa);
        return summa;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        checkData(data);
    }
}
