package ru.job4j.array;

public class Parentheses {
    public static boolean valid(char[] data) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                left++;
            }
            if (data[i] == ')') {
                right++;
            }
        }
        if (left == right) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(valid(new char[]{'(', '(', ')', ')'}));
    }
}
