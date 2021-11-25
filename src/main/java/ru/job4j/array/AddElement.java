package ru.job4j.array;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        list.add(str);
        if (list.size() != check.size()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        System.out.println(addNewElement(list, "String"));
    }
}
