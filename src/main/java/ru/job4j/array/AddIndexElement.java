package ru.job4j.array;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == str) {
                return false;
            }
        }
        list.add(index, str);
        return true;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(addNewElement(list, 1, "1234"));
    }
}
