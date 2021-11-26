package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean rezult = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                rezult = false;
                return rezult;
            }
        }
        return rezult;
    }
}
