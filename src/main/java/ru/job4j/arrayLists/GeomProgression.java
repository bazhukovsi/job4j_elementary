package ru.job4j.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(10);
        int summa = 0;
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        list.set(0, first);
        for (int i = 1; i < count; i++) {
            list.set(i, list.get(i - 1) * denominator);
        }
        for (Integer integer : list) {
            summa += integer;
        }
        return summa;
    }

    public static void main(String[] args) {
        generateAndSum(1, 3, 10);
    }
}
