package ru.job4j;

//        1. Допишите в методе main код, который вызовет метод func1 с аргументом x = 100,
//        Результат вычисления запишите в переменную result3.

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result3 = MathFunc.func1(100);
        int result2 = MathFunc.func2(5);
        int total = result3 + result2;
        System.out.println(total);
    }
}
