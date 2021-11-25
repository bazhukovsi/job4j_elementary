package ru.job4j.array;

import java.util.ArrayList;
import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String output = "";
        if (list.isEmpty()) {
            return output;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        System.out.println(getElement(list));
    }
}
