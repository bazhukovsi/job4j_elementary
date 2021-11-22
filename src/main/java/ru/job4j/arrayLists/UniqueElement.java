package ru.job4j.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int index = 0;
        int lastIndex = 0;
        if (!list.contains(str)) {
            return false;
        }
        index = list.indexOf(str);
        lastIndex = list.lastIndexOf(str);
        if (index == lastIndex) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        System.out.println(checkList(list, "1"));
    }
}
