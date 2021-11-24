package ru.job4j.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String out;
        String [] strings = s.split("");
        Collections.addAll(list, strings);
        list.sort(Comparator.naturalOrder());
        for (String value : list) {
            sb.append(value);
        }
        out = sb.toString();
        return out;
    }

    public static void main(String[] args) {
        reformat("javascript");
    }

}
