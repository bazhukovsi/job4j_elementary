package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = ru.job4j.Fit.manWeight(height);
        System.out.println("Man 190 is " + man);
        height = 170;
        double woman = ru.job4j.Fit.womanWeight(height);
        System.out.println("Woman 170 is " + woman);
    }

}
