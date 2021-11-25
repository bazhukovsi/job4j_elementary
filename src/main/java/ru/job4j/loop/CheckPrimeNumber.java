package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
            return prime;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i != number) {
                prime = false;
                return prime;
            }
        }
        return prime;
    }
}
