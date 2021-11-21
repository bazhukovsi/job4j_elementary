package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double sumDiffDivision(double first, double second) {
        return MathFunction.diff(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumDiffDivisionAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second)
                + MathFunction.diff(first, second) + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDiffDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumDiffDivisionAndMultiply(10, 20));
    }

}
