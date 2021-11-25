package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] strings = s.split(" ");
        String value;
        for (String word : words) {
            value = word;
            for (String string : strings) {
                if (value.equals(string)) {
                    return "Выберите другую статью...";
                }
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
